package com.domain;

import java.text.SimpleDateFormat;
import java.util.Date;

public class PorderVo extends Purchaseandgoodsreject{

	private String sfName;
	
	private String showTradetime;

	public String getSfName() {
		return sfName;
	}

	public void setSfName(String sfName) {
		this.sfName = sfName;
	}

	public String getShowTradetime() {
		return showTradetime;
	}

	public void setShowTradetime(Date tradetime) {
		SimpleDateFormat dateFormat = new SimpleDateFormat("yyyy-MM-dd");
		this.showTradetime = dateFormat.format(tradetime);
	}
	
	
}
