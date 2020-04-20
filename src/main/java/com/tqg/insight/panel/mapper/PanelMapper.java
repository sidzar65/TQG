package com.tqg.insight.panel.mapper;

import org.mapstruct.Mapper;

import com.tqg.insight.panel.dto.PanelRequest;
import com.tqg.insight.panel.model.Panel;

/**
 * 
 * @author Fuzail Memon
 *
 */

@Mapper(componentModel = "spring")
public interface PanelMapper {
	/**
	 * 
	 * @param panel
	 * @return
	 */

	PanelRequest toPanelDTO(Panel panel);

	/**
	 * 
	 * @param panelRequest
	 * @return
	 */

	Panel toPanel(PanelRequest panelRequest);

}
