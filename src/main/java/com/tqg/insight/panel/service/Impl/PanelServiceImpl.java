package com.tqg.insight.panel.service.Impl;

import java.io.IOException;
import java.util.List;
import java.util.Optional;

import org.springframework.stereotype.Service;

import com.tqg.insight.panel.dto.PanelRequest;
import com.tqg.insight.panel.mapper.PanelMapper;
import com.tqg.insight.panel.model.Panel;
import com.tqg.insight.panel.repo.PanelRepository;
import com.tqg.insight.panel.service.PanelService;

@Service
public class PanelServiceImpl implements PanelService {

	private PanelRepository panelRepository;

	private PanelMapper panelMapper;

	public PanelServiceImpl(PanelRepository panelRepository, PanelMapper panelMapper) {
		super();
		this.panelRepository = panelRepository;
		this.panelMapper = panelMapper;
	}

	@Override
	public boolean savePanal(PanelRequest panelRequest) throws IOException {

		Panel panelModel = panelMapper.toPanel(panelRequest);

		this.panelRepository.save(panelModel);
		return true;
	}

	@Override
	public List<Panel> getPanal() throws IOException {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public Optional<PanelRequest> getPanaleById(long panalId) throws IOException {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public boolean deletePanal(PanelRequest panelRequest) throws IOException {
		// TODO Auto-generated method stub
		return false;
	}

	@Override
	public boolean updatePanal(PanelRequest panelRequest) throws IOException, Throwable {
		// TODO Auto-generated method stub
		return false;
	}

}
