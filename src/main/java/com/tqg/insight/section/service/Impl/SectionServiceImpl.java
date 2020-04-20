package com.tqg.insight.section.service.Impl;

import java.io.IOException;

import org.springframework.stereotype.Service;

import com.tqg.insight.section.dto.SectionRequest;
import com.tqg.insight.section.mapper.SectionMapper;
import com.tqg.insight.section.model.Section;
import com.tqg.insight.section.repo.SectionRepository;
import com.tqg.insight.section.service.ISectionService;

/**
 * 
 * @author Fuzail Memon
 *
 */

@Service
public class SectionServiceImpl implements ISectionService {

	private SectionRepository sectionRepository;

	private SectionMapper sectionMapper;

	public SectionServiceImpl(SectionRepository sectionRepository, SectionMapper sectionMapper) {
		super();
		this.sectionMapper = sectionMapper;
		this.sectionRepository = sectionRepository;
	}

	@Override
	public boolean savePanal(SectionRequest sectionRequest) throws IOException {

		Section sectionModel = sectionMapper.toSection(sectionRequest);

		this.sectionRepository.save(sectionModel);
		return false;
	}

}
