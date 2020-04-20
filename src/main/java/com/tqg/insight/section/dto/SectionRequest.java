package com.tqg.insight.section.dto;

import javax.validation.constraints.NotBlank;

import lombok.Data;

@Data
public class SectionRequest {
	
	
	@NotBlank(message = "{panel.title.required}")
	private String sectionTitle;

	private String sectionTimeFrame;

	private String sectionOrder;

	private String kpiFormat;

	private String kpiResult;

	private String kpiRefreshFrequency;

	private boolean iskpiComparison;

	private boolean isSwitchPolarity;

	private String comparisonKPIResult;

	private String kpiComparisonPeriodDescription;

	private boolean displaySectionDetailsArea;

	private boolean isKPIBreakdownEnable;

	private String selectDetailsKpiDesc;

	private boolean isApplyBreakdownKeyToEntirePanel;

	private String dateRangeTimeFrame;

}
