package com.tqg.insight.panel.model;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

import lombok.Data;

@Data
@Entity
public class Panel {
	
	
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Long id;
	
	@Column(name = "TITLE")
	private String panelTitle;

	@Column(name = "STATE")
	private String panelState;
	
	@Column(name = "PANEL_ORDER")
	private String panelOrder;

}
