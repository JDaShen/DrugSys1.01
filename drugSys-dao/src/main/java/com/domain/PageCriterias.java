package com.domain;

import java.util.Date;

public class PageCriterias {
	private Integer pageIndex;//miniUI前台发送的这个表示当前页有0开始
	private Integer pageSize;
	private Integer offset;
	private String wid;//仓库id
	private String diname;//药品名
	private String dispid;
	private Date beignDate;
	private Date endDate;
	private String rid;//报告单ID
	private String cid;
	private String diid;//使用diid获取商品流动信息
	
	private Integer getState() {
		return 1;
	}
	private Date getToday() {
		return new Date();
	}
	

	public String getDiid() {
		return diid;
	}

	public void setDiid(String diid) {
		this.diid = diid;
	}

	public String getCid() {
		return cid;
	}

	public void setCid(String cid) {
		this.cid = cid;
	}

	public String getRid() {
		return rid;
	}

	public void setRid(String rid) {
		this.rid = rid;
	}
	
	
	public Date getBeignDate() {
		return beignDate;
	}
	public void setBeignDate(Date beignDate) {
		this.beignDate = beignDate;
	}
	public Date getEndDate() {
		return endDate;
	}
	public void setEndDate(Date endDate) {
		this.endDate = endDate;
	}
	public String getDispid() {
		return dispid;
	}
	public void setDispid(String dispid) {
		this.dispid = dispid;
	}
	public String getWid() {
		return wid;
	}
	public void setWid(String wid) {
		this.wid = wid;
	}
	public String getDiname() {
		return diname;
	}
	public void setDiname(String diname) {
		this.diname = diname;
	}
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
