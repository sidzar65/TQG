/**
 * 
 */
package com.tqg.insight.base.dto;

import lombok.Data;

/**
 * @author HP
 *
 */
@Data
public class ApiSucessResponse<T> {
	private T data;
	private Integer status;
	private String message;

}
