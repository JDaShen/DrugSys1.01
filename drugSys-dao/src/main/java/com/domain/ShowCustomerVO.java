package com.domain;

public class ShowCustomerVO extends Customer{
    private String vipname;//等级名称

    private Double discount;//优惠力度

	public String getVipname() {
		return vipname;
	}

	public void setVipname(String vipname) {
		this.vipname = vipname;
	}

	public Double getDiscount() {
		return discount;
	}

	public void setDiscount(Double discount) {
		this.discount = discount;
	}
    
}
