package com.tqg.insight.section.model;

import java.util.List;

import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.OneToMany;
import javax.persistence.Table;

@Entity
@Table(name = "SECTION")
public class Section {

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Long id;

	@Column(name = "TITLE")
	private String sectionTitle;

	@Column(name = "SECTION_TIME_FRAME")
	private String sectionTimeFrame;

	@Column(name = "SECTION_ORDER")
	private String sectionOrder;

	@Column(name = "KPI_FORMAT")
	private String kpiFormat;

	@Column(name = "KPI_QUERY")
	private String kpiQuery;

	@Column(name = "KPI_RESULT")
	private String kpiResult;

	@Column(name = "KPI_REFRESH_FREQUENCY")
	private String kpiRefreshFrequency;

	@Column(name = "IS_KPI_COMPARISON", columnDefinition = "boolean default false", nullable = false)
	private boolean iskpiComparison;

	@Column(name = "PANEL_SECTION_ID")
	private Long panelSectionId;

	@Column(name = "KPI_COMPARISON_PERIOD_DESC")
	private String kpiComparisonPeriodDescription;

	@Column(name = "COMPARISON_KPI_QUERY")
	private String comparisonKPIQuery;

	@Column(name = "COMPARISON_KPI_RESULT")
	private String comparisonKPIResult;

	@Column(name = "IS_DISPLAY_SECTION_Details", columnDefinition = "boolean default false", nullable = false)
	private boolean displaySectionDetailsArea;

	@Column(name = "IS_DISPLAY_TREND_GRAPH", columnDefinition = "boolean default false", nullable = false)
	private boolean isDisplayTrendGraph;

	@Column(name = "IS_SWITCH_POLARITY", columnDefinition = "boolean default false", nullable = false)
	private boolean isSwitchPolarity;

	@Column(name = "IS_KPI_BREAKDOWAN_ENABLE", columnDefinition = "boolean default false", nullable = false)
	private boolean kpibreakdownEnable;

	@Column(name = "TREND_PERIOD")
	private String trendPeriod;

	@Column(name = "IS_DISPLAY_KPI_BREAKDOWN")
	private String isDisplayKPIBreakdown;

	@Column(name = "SELECT_DTLS_KPI_DESC")
	private String selectDetailsKpiDesc;

	@Column(name = "IS_APPLY_BREAKDOWN_KEY", columnDefinition = "boolean default false", nullable = false)
	private boolean isApplyBreakdownKeyToEntirePanel;

//	@OneToMany(cascade = CascadeType.ALL)
//	@JoinColumn(name = "SECTION_BREAKDOWN_ID")
//	private List<BreakdownElemets> sectionBreakdownElementId;

	@Column(name = "DATE_RANGE_TIME_FRAME")
	private String dateRangeTimeFrame;

	public Long getId() {
		return id;
	}

	public void setId(Long id) {
		this.id = id;
	}

	public String getSectionTitle() {
		return sectionTitle;
	}

	public void setSectionTitle(String sectionTitle) {
		this.sectionTitle = sectionTitle;
	}

	public String getSectionTimeFrame() {
		return sectionTimeFrame;
	}

	public void setSectionTimeFrame(String sectionTimeFrame) {
		this.sectionTimeFrame = sectionTimeFrame;
	}

	public String getSectionOrder() {
		return sectionOrder;
	}

	public void setSectionOrder(String sectionOrder) {
		this.sectionOrder = sectionOrder;
	}

	public String getKpiFormat() {
		return kpiFormat;
	}

	public void setKpiFormat(String kpiFormat) {
		this.kpiFormat = kpiFormat;
	}

	public String getKpiQuery() {
		return kpiQuery;
	}

	public void setKpiQuery(String kpiQuery) {
		this.kpiQuery = kpiQuery;
	}

	public String getKpiResult() {
		return kpiResult;
	}

	public void setKpiResult(String kpiResult) {
		this.kpiResult = kpiResult;
	}

	public String getKpiRefreshFrequency() {
		return kpiRefreshFrequency;
	}

	public void setKpiRefreshFrequency(String kpiRefreshFrequency) {
		this.kpiRefreshFrequency = kpiRefreshFrequency;
	}

	public boolean isIskpiComparison() {
		return iskpiComparison;
	}

	public void setIskpiComparison(boolean iskpiComparison) {
		this.iskpiComparison = iskpiComparison;
	}

	public Long getPanelSectionId() {
		return panelSectionId;
	}

	public void setPanelSectionId(Long panelSectionId) {
		this.panelSectionId = panelSectionId;
	}

	public String getKpiComparisonPeriodDescription() {
		return kpiComparisonPeriodDescription;
	}

	public void setKpiComparisonPeriodDescription(String kpiComparisonPeriodDescription) {
		this.kpiComparisonPeriodDescription = kpiComparisonPeriodDescription;
	}

	public String getComparisonKPIQuery() {
		return comparisonKPIQuery;
	}

	public void setComparisonKPIQuery(String comparisonKPIQuery) {
		this.comparisonKPIQuery = comparisonKPIQuery;
	}

	public String getComparisonKPIResult() {
		return comparisonKPIResult;
	}

	public void setComparisonKPIResult(String comparisonKPIResult) {
		this.comparisonKPIResult = comparisonKPIResult;
	}

	public boolean isDisplaySectionDetailsArea() {
		return displaySectionDetailsArea;
	}

	public void setDisplaySectionDetailsArea(boolean displaySectionDetailsArea) {
		this.displaySectionDetailsArea = displaySectionDetailsArea;
	}

	public boolean isDisplayTrendGraph() {
		return isDisplayTrendGraph;
	}

	public void setDisplayTrendGraph(boolean isDisplayTrendGraph) {
		this.isDisplayTrendGraph = isDisplayTrendGraph;
	}

	public boolean isSwitchPolarity() {
		return isSwitchPolarity;
	}

	public void setSwitchPolarity(boolean isSwitchPolarity) {
		this.isSwitchPolarity = isSwitchPolarity;
	}

	public boolean isKpibreakdownEnable() {
		return kpibreakdownEnable;
	}

	public void setKpibreakdownEnable(boolean kpibreakdownEnable) {
		this.kpibreakdownEnable = kpibreakdownEnable;
	}

	public String getTrendPeriod() {
		return trendPeriod;
	}

	public void setTrendPeriod(String trendPeriod) {
		this.trendPeriod = trendPeriod;
	}

	public String getIsDisplayKPIBreakdown() {
		return isDisplayKPIBreakdown;
	}

	public void setIsDisplayKPIBreakdown(String isDisplayKPIBreakdown) {
		this.isDisplayKPIBreakdown = isDisplayKPIBreakdown;
	}

	public String getSelectDetailsKpiDesc() {
		return selectDetailsKpiDesc;
	}

	public void setSelectDetailsKpiDesc(String selectDetailsKpiDesc) {
		this.selectDetailsKpiDesc = selectDetailsKpiDesc;
	}

	public boolean isApplyBreakdownKeyToEntirePanel() {
		return isApplyBreakdownKeyToEntirePanel;
	}

	public void setApplyBreakdownKeyToEntirePanel(boolean isApplyBreakdownKeyToEntirePanel) {
		this.isApplyBreakdownKeyToEntirePanel = isApplyBreakdownKeyToEntirePanel;
	}

//	public List<BreakdownElemets> getSectionBreakdownElementId() {
//		return sectionBreakdownElementId;
//	}
//
//	public void setSectionBreakdownElementId(List<BreakdownElemets> sectionBreakdownElementId) {
//		this.sectionBreakdownElementId = sectionBreakdownElementId;
//	}

	public String getDateRangeTimeFrame() {
		return dateRangeTimeFrame;
	}

	public void setDateRangeTimeFrame(String dateRangeTimeFrame) {
		this.dateRangeTimeFrame = dateRangeTimeFrame;
	}

	

}
