package com.domain;

import java.util.List;

public class ReportVo {
	private Report report;//报告单
	//报告项
	private List<GoodsVo> rItems;
	public Report getReport() {
		return report;
	}
	public void setReport(Report report) {
		this.report = report;
	}
	public List<GoodsVo> getrItems() {
		return rItems;
	}
	public void setrItems(List<GoodsVo> rItems) {
		this.rItems = rItems;
	}
	
}
