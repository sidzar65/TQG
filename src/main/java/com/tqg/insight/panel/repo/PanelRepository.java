package com.tqg.insight.panel.repo;

import org.springframework.data.jpa.repository.JpaRepository;

import com.tqg.insight.panel.model.Panel;

public interface PanelRepository extends JpaRepository<Panel, Long> {

}
