/**
 * 
 */
package com.tqg.insight.base.dto;

import java.util.List;

import lombok.Data;
import lombok.RequiredArgsConstructor;

/**
 * @author HP
 *
 */
@Data
@RequiredArgsConstructor
public class ApiErrorResponse {
	private Integer status;
	private String message;
	private List<Error> errors;
}
