package com.domain;

import java.math.BigDecimal;
import java.util.Date;

public class Saleorder {
    private String tradeid;//订单号

    private Date tradetime;//交易时间

    private String sfid;//经办人ID

    private BigDecimal total;//总价

    private Integer tradetype;//类型

    private String wid;//仓库ID

    private String ctid;//顾客ID

    private Integer integral;//积分

    @Override
	public String toString() {
		return "Saleorder [tradeid=" + tradeid + ", tradetime=" + tradetime + ", sfid=" + sfid + ", total=" + total
				+ ", tradetype=" + tradetype + ", wid=" + wid + ", ctid=" + ctid + ", integral=" + integral + "]";
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

    public BigDecimal getTotal() {
        return total;
    }

    public void setTotal(BigDecimal total) {
        this.total = total;
    }

    public Integer getTradetype() {
        return tradetype;
    }

    public void setTradetype(Integer tradetype) {
        this.tradetype = tradetype;
    }

    public String getWid() {
        return wid;
    }

    public void setWid(String wid) {
        this.wid = wid == null ? null : wid.trim();
    }

    public String getCtid() {
        return ctid;
    }

    public void setCtid(String ctid) {
        this.ctid = ctid == null ? null : ctid.trim();
    }

    public Integer getIntegral() {
        return integral;
    }

    public void setIntegral(Integer integral) {
        this.integral = integral;
    }
}