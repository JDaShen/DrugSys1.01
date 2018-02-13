package com.domain;

import java.text.SimpleDateFormat;
import java.util.Date;

public class GoodsVo {
	private String logId;
	private String tradeId;
	private Date tradeTime;
	private Date expire;
	private String diId;
	private String diName;//药品名
	private String wName;//所在仓库
	private String manufacturer;
	private String reals;//仓库中的实际数量
	private Integer rqty;
	
	//好用用于时间展示
	public String getTime() {
		SimpleDateFormat dateFormat = new SimpleDateFormat("yyyy-MM-dd");
		String format = dateFormat.format(this.getExpire());
		return format;
	}
	public Integer getRqty() {
		return rqty;
	}
	public void setRqty(Integer rqty) {
		this.rqty = rqty;
	}
	public Date getExpire() {
		return expire;
	}
	public void setExpire(Date expire) {
		this.expire = expire;
	}
	public String getLogId() {
		return logId;
	}
	public void setLogId(String logId) {
		this.logId = logId;
	}
	public String getTradeId() {
		return tradeId;
	}
	public void setTradeId(String tradeId) {
		this.tradeId = tradeId;
	}
	public Date getTradeTime() {
		return tradeTime;
	}
	public void setTradeTime(Date tradeTime) {
		this.tradeTime = tradeTime;
	}
	public String getDiId() {
		return diId;
	}
	public void setDiId(String diId) {
		this.diId = diId;
	}
	public String getDiName() {
		return diName;
	}
	public void setDiName(String diName) {
		this.diName = diName;
	}
	public String getwName() {
		return wName;
	}
	public void setwName(String wName) {
		this.wName = wName;
	}
	public String getManufacturer() {
		return manufacturer;
	}
	public void setManufacturer(String manufacturer) {
		this.manufacturer = manufacturer;
	}
	public String getReals() {
		return reals;
	}
	public void setReals(String reals) {
		this.reals = reals;
	}
	@Override
	public String toString() {
		return "GoodsVo [logId=" + logId + ", tradeId=" + tradeId + ", tradeTime=" + tradeTime + ", expire=" + expire
				+ ", diId=" + diId + ", diName=" + diName + ", wName=" + wName + ", manufacturer=" + manufacturer
				+ ", reals=" + reals + ", rqty=" + rqty + "]";
	}
	
	
}
