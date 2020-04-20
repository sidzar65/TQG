package com.tqg.insight.section.mapper;

import org.mapstruct.Mapper;

import com.tqg.insight.section.dto.SectionRequest;
import com.tqg.insight.section.model.Section;

/**
 * 
 * @author Fuzail Memon
 *
 */

@Mapper(componentModel = "spring")
public interface SectionMapper {

	/**
	 * 
	 * @param section
	 * @return
	 */

	SectionRequest toSectionDTO(Section section);

	/**
	 * 
	 * @param sectionRequest
	 * @return
	 */

	Section toSection(SectionRequest sectionRequest);

}
