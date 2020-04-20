package com.tqg.insight.panel.service;

import java.io.IOException;
import java.util.List;
import java.util.Optional;

import org.springframework.stereotype.Service;

import com.tqg.insight.panel.dto.PanelRequest;
import com.tqg.insight.panel.model.Panel;

/**
 * 
 * @author Fuzail Memon
 *
 */

public interface PanelService {
	/**
	 * 
	 * @param panal
	 * @return
	 * @throws IOException
	 */

	public boolean savePanal(PanelRequest panalDTO) throws IOException;

	/**
	 * 
	 * @return
	 * @throws IOException
	 */

	public List<Panel> getPanal() throws IOException;

	/**
	 * 
	 * @param panalId
	 * @return
	 * @throws IOException
	 */

	public Optional<PanelRequest> getPanaleById(long panalId) throws IOException;

	/**
	 * 
	 * @param panel
	 * @return
	 * @throws IOException
	 */

	public boolean deletePanal(PanelRequest panelRequest) throws IOException;

	/**
	 * 
	 * @param panel
	 * @return
	 * @throws IOException
	 * @throws Throwable
	 */
	public boolean updatePanal(PanelRequest panelRequest) throws IOException, Throwable;

}
