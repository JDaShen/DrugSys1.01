package com.domain;

import java.math.BigDecimal;

public class Saleitem {
    private String soitemid;//交易单号

    private String tradeid;//销售单ID

    private String diid;//药品ID

    private Integer amount;//数量

    private BigDecimal singelprice;//单价

    private Double discount;//折扣

    @Override
	public String toString() {
		return "Saleitem [soitemid=" + soitemid + ", tradeid=" + tradeid + ", diid=" + diid + ", amount=" + amount
				+ ", singelprice=" + singelprice + ", discount=" + discount + "]";
	}

	public String getSoitemid() {
        return soitemid;
    }

    public void setSoitemid(String soitemid) {
        this.soitemid = soitemid == null ? null : soitemid.trim();
    }

    public String getTradeid() {
        return tradeid;
    }

    public void setTradeid(String tradeid) {
        this.tradeid = tradeid == null ? null : tradeid.trim();
    }

    public String getDiid() {
        return diid;
    }

    public void setDiid(String diid) {
        this.diid = diid == null ? null : diid.trim();
    }

    public Integer getAmount() {
        return amount;
    }

    public void setAmount(Integer amount) {
        this.amount = amount;
    }

    public BigDecimal getSingelprice() {
        return singelprice;
    }

    public void setSingelprice(BigDecimal singelprice) {
        this.singelprice = singelprice;
    }

    public Double getDiscount() {
        return discount;
    }

    public void setDiscount(Double discount) {
        this.discount = discount;
    }
}