package com.tqg.insight.section.controller;

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
import com.tqg.insight.section.dto.SectionRequest;
import com.tqg.insight.section.service.ISectionService;
/**
 * 
 * @author Fuzail Memon
 *
 */
@RestController
@RequestMapping("/api/v1/section")
public class SectionController {
	
	private ISectionService sectionService;

	public SectionController(ISectionService sectionService) {
		this.sectionService = sectionService;
	}

	
	
	@PostMapping
	public ResponseEntity<Void> create(@Validated @RequestBody ApiRequest<SectionRequest> sectionRequest)
			throws IOException {
		sectionService.savePanal(sectionRequest.getData());
		return new ResponseEntity<>(HttpStatus.CREATED);
	}

}
