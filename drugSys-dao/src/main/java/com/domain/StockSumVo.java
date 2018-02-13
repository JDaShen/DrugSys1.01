package com.domain;

import java.text.SimpleDateFormat;
import java.util.Date;

/**
 * 用于接收库存信息统计
 * 
 * @author zyg
 *
 */
public class StockSumVo extends Druginfo{
	private Double total;
	private String wid;
	//库存量/由统计得出
	private Integer amount;
	private Date expire;
	
	
	public Date getExpire() {
		return expire;
	}

	public void setExpire(Date expire) {
		this.expire = expire;
	}

	public String getTime() {
		if(expire==null) {
			return null;
		}
		SimpleDateFormat dateFormat = new SimpleDateFormat("yyyy-MM-dd");
		String format = dateFormat.format(this.getExpire());
		return format;
	}

	public Integer getAmount() {
		return amount;
	}

	public void setAmount(Integer amount) {
		this.amount = amount;
	}

	public String getWid() {
		return wid;
	}

	public void setWid(String wid) {
		this.wid = wid;
	}

	public Double getTotal() {
		return total;
	}

	public void setTotal(Double total) {
		this.total = total;
	}
	
}
