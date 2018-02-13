package com.domain;

public class Dispitems {
	private String ditemid; //调拨项ID

	private String diid; //商品ID

	private Integer amount; //数量

	private String dispid; //调拨单ID

    public String getDitemid() {
        return ditemid;
    }

    public void setDitemid(String ditemid) {
        this.ditemid = ditemid == null ? null : ditemid.trim();
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

    public String getDispid() {
        return dispid;
    }

    public void setDispid(String dispid) {
        this.dispid = dispid == null ? null : dispid.trim();
    }
}