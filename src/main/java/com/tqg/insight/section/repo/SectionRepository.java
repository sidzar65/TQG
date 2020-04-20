package com.tqg.insight.section.repo;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Modifying;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;
import org.springframework.stereotype.Component;

import com.tqg.insight.section.model.Section;


public interface SectionRepository extends JpaRepository<Section, Long> {

	@Modifying(clearAutomatically = true)
	@Query("from Section where panel_section_id = :panelSectionId order by id desc")
	public List<Section> getSectionByPanelSectionId(@Param("panelSectionId") Long id);
	
	@Modifying(clearAutomatically = true)
	@Query("from Section where id = :sectionId order by id desc")
	public List<Section> getSectionByID(@Param("sectionId") Long id);
	
}