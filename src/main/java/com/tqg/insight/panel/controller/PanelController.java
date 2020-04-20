package com.tqg.insight.panel.controller;

import java.io.IOException;

import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.validation.annotation.Validated;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.tqg.insight.base.dto.ApiRequest;
import com.tqg.insight.panel.dto.PanelRequest;
import com.tqg.insight.panel.service.PanelService;

@RestController
@RequestMapping("/api/v1/panel")
public class PanelController {

	private PanelService panelService;

	public PanelController(PanelService panelService) {
		this.panelService = panelService;
	}

	@PostMapping
	public ResponseEntity<Void> create(@Validated @RequestBody ApiRequest<PanelRequest> panelRequest)
			throws IOException {
		panelService.savePanal(panelRequest.getData());
		return new ResponseEntity<>(HttpStatus.CREATED);
	}

}
