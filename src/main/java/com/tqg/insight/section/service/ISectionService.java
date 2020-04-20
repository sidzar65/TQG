package com.tqg.insight.section.service;

import java.io.IOException;

import com.tqg.insight.panel.dto.PanelRequest;
import com.tqg.insight.section.dto.SectionRequest;

/**
 * 
 * @author Fuzail Memon
 *
 */

public interface ISectionService {
	/**
	 * 
	 * @param sectionDTO
	 * @return
	 * @throws IOException
	 */
	
	public boolean savePanal(SectionRequest sectionDTO) throws IOException;
	
	
	
	

}
