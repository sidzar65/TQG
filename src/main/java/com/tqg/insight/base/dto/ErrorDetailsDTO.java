package com.tqg.insight.base.dto;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;


/**
 * 
 * @author Fuzail Memon
 *
 */
public class ErrorDetailsDTO {
	private Date timestamp = new Date();
	private String message;
	private String details;
	private Integer status;
	public Integer getStatus() {
		return status;
	}

	public void setStatus(Integer status) {
		this.status = status;
	}

	private List<FieldErrorDTO> errors = new ArrayList<>();

	public ErrorDetailsDTO() {
	}

	public ErrorDetailsDTO(Date timestamp, String message, String details, List<FieldErrorDTO> fieldErrors) {
		super();
		this.timestamp = timestamp;
		this.message = message;
		this.details = details;
		this.errors = fieldErrors;
	}

	public ErrorDetailsDTO(String details, String message) {
		super();
		this.message = message;
		this.details = details;
	}
	
	

	public ErrorDetailsDTO(String message, String details, Integer status) {
		super();
		this.message = message;
		this.details = details;
		this.status = status;
	}

	public ErrorDetailsDTO(Date timestamp, String message, String details, Integer status, List<FieldErrorDTO> errors) {
		super();
		this.timestamp = timestamp;
		this.message = message;
		this.details = details;
		this.status = status;
		this.errors = errors;
	}

	public Date getTimestamp() {
		return timestamp;
	}

	public void setTimestamp(Date timestamp) {
		this.timestamp = timestamp;
	}

	public String getMessage() {
		return message;
	}

	public void setMessage(String message) {
		this.message = message;
	}

	public String getDetails() {
		return details;
	}

	public List<FieldErrorDTO> getErrors() {
		return errors;
	}

	public void setErrors(List<FieldErrorDTO> errors) {
		this.errors = errors;
	}

	public void setDetails(String details) {
		this.details = details;
	}

	

}