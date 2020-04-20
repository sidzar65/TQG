package com.tqg.insight.base.exception;

import java.util.List;
import java.util.stream.Collectors;

import javax.servlet.http.HttpServletRequest;

import org.springframework.context.MessageSource;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.validation.BindingResult;
import org.springframework.validation.FieldError;
import org.springframework.web.bind.MethodArgumentNotValidException;
import org.springframework.web.bind.annotation.ControllerAdvice;
import org.springframework.web.bind.annotation.ExceptionHandler;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.ResponseStatus;
import org.springframework.web.context.request.WebRequest;

import com.tqg.insight.base.dto.ErrorDetailsDTO;
import com.tqg.insight.base.dto.FieldErrorDTO;

/**
 * Global Exception handler for application.
 * 
 * @author Fuzail Memon
 *
 */
@ControllerAdvice
public class RestApiGlobalExceptionHandler {

	private MessageSource messageSource;

	public RestApiGlobalExceptionHandler(MessageSource messageSource) {
		this.messageSource = messageSource;
	}

	@ExceptionHandler(Exception.class)
	public final ResponseEntity<ErrorDetailsDTO> handleAllExceptions(Exception ex, WebRequest request) {
		ErrorDetailsDTO errorDetails = new ErrorDetailsDTO(
				this.messageSource.getMessage("internal.server.error", null, null), request.getDescription(false),
				HttpStatus.INTERNAL_SERVER_ERROR.value());
		errorDetails.getErrors().add(new FieldErrorDTO("general", this.messageSource.getMessage("internal.server.error", null, null)));
		return new ResponseEntity<>(errorDetails, HttpStatus.INTERNAL_SERVER_ERROR);
	}

	@ExceptionHandler(MethodArgumentNotValidException.class)
	@ResponseStatus(value = HttpStatus.BAD_REQUEST)
	@ResponseBody
	public ErrorDetailsDTO handleMethodArgumentNotValid(HttpServletRequest req, MethodArgumentNotValidException ex) {

		String errorURL = req.getRequestURL().toString();

		ErrorDetailsDTO errorInfo = new ErrorDetailsDTO(errorURL, HttpStatus.BAD_REQUEST.toString(),
				HttpStatus.BAD_REQUEST.value());

		BindingResult result = ex.getBindingResult();
		if (result.getFieldErrors().isEmpty()) {
			errorInfo.getErrors().addAll(result.getAllErrors().stream().map(error -> {
				return new FieldErrorDTO(error.getCode().substring(5), error.getDefaultMessage());
			}).collect(Collectors.toList()));
		} else {
			errorInfo.getErrors().addAll(populateFieldErrors(result.getFieldErrors()));
		}

		return errorInfo;
	}

	public List<FieldErrorDTO> populateFieldErrors(List<FieldError> fieldErrorList) {

		return fieldErrorList.stream().map(
				fieldError -> new FieldErrorDTO(fieldError.getField().substring(5), fieldError.getDefaultMessage()))
				.collect(Collectors.toList());

	}

}
