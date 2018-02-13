package com.domain;

public class PgrPageCriterias {
	private Integer pageIndex;//miniUI前台发送的这个表示当前页有0开始
	private Integer pageSize;
	private Integer offset;
	
	public Integer getPageIndex() {
		return pageIndex;
	}
	public void setPageIndex(Integer pageIndex) {
		this.pageIndex = pageIndex;
	}
	public Integer getPageSize() {
		return pageSize;
	}
	public void setPageSize(Integer pageSize) {
		this.pageSize = pageSize;
	}
	public Integer getOffset() {
		return this.pageIndex*this.pageSize;
	}
	public void setOffset(Integer offset) {
		this.offset = offset;
	}
	
}
