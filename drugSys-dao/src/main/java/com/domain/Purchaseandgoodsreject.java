package com.domain;

import java.math.BigDecimal;
import java.util.Date;

public class Purchaseandgoodsreject {
    private String tradeid;//订单ID

    private Date tradetime;//交易时间

    private String sfid;//经办人ID

    private BigDecimal totalprice;//总价

    private Byte tradetype;//交易类型

    private String wid;//仓库ID

    private String splid;//供应商

    private Integer state;//状态
    

    @Override
	public String toString() {
		return "Purchaseandgoodsreject [tradeid=" + tradeid + ", tradetime=" + tradetime + ", sfid=" + sfid
				+ ", totalprice=" + totalprice + ", tradetype=" + tradetype + ", wid=" + wid + ", splid=" + splid
				+ ", state=" + state + "]";
	}

	public String getTradeid() {
        return tradeid;
    }

    public void setTradeid(String tradeid) {
        this.tradeid = tradeid == null ? null : tradeid.trim();
    }

    public Date getTradetime() {
        return tradetime;
    }

    public void setTradetime(Date tradetime) {
        this.tradetime = tradetime;
    }

    public String getSfid() {
        return sfid;
    }

    public void setSfid(String sfid) {
        this.sfid = sfid == null ? null : sfid.trim();
    }

    public BigDecimal getTotalprice() {
        return totalprice;
    }

    public void setTotalprice(BigDecimal totalprice) {
        this.totalprice = totalprice;
    }

    public Byte getTradetype() {
        return tradetype;
    }

    public void setTradetype(Byte tradetype) {
        this.tradetype = tradetype;
    }

    public String getWid() {
        return wid;
    }

    public void setWid(String wid) {
        this.wid = wid == null ? null : wid.trim();
    }

    public String getSplid() {
        return splid;
    }

    public void setSplid(String splid) {
        this.splid = splid == null ? null : splid.trim();
    }

    public Integer getState() {
        return state;
    }

    public void setState(Integer state) {
        this.state = state;
    }
}