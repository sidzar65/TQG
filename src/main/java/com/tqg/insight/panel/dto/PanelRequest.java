package com.tqg.insight.panel.dto;

import javax.validation.constraints.NotBlank;

import lombok.Data;
import lombok.Getter;
import lombok.Setter;

/**
 * 
 * @author Fuzail Memon
 *
 */

@Data
@Getter
@Setter
public class PanelRequest {

	
	@NotBlank(message = "{panel.title.required}")
	private String panelTitle;
	
	@NotBlank(message = "{panel.title.required}")
	private String panelState;

	@NotBlank(message = "{panel.title.required}")
	private String panelOrder;

}
