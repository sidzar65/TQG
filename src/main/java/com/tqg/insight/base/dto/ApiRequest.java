/**
 * 
 */
package com.tqg.insight.base.dto;

import javax.validation.Valid;
import javax.validation.constraints.NotNull;

import lombok.Data;

/**
 * @author Fuzail Memon
 *
 */
@Data
public class ApiRequest<T> {

	@NotNull(message="{internal.server.error}")
	@Valid
	private T data;
}
