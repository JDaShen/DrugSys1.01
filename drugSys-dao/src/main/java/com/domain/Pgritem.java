package com.domain;

import java.util.Date;

public class Pgritem {
    private String pgritemid;//订单项ID

    private String tradeid;//交易单号ID

    private String diid;//药品ID

    private Integer amount;//数量

    private String batch;//批号

    private Date expire;//保质期

    private String mark;//备注

    @Override
	public String toString() {
		return "Pgritem [pgritemid=" + pgritemid + ", tradeid=" + tradeid + ", diid=" + diid + ", amount=" + amount
				+ ", batch=" + batch + ", expire=" + expire + ", mark=" + mark + "]";
	}

	public String getPgritemid() {
        return pgritemid;
    }

    public void setPgritemid(String pgritemid) {
        this.pgritemid = pgritemid == null ? null : pgritemid.trim();
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

    public String getBatch() {
        return batch;
    }

    public void setBatch(String batch) {
        this.batch = batch == null ? null : batch.trim();
    }

    public Date getExpire() {
        return expire;
    }

    public void setExpire(Date expire) {
        this.expire = expire;
    }

    public String getMark() {
        return mark;
    }

    public void setMark(String mark) {
        this.mark = mark == null ? null : mark.trim();
    }
}