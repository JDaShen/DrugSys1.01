package com.domain;

import java.util.Date;

public class Dispatch {
	private String dispid; //仓库调拨表ID

	private String from; //出库

	private String to; //入库

	private Date date; //日期

	private String sfid; //经办人ID

	private String mark; //备注

    public String getDispid() {
        return dispid;
    }

    public void setDispid(String dispid) {
        this.dispid = dispid == null ? null : dispid.trim();
    }

    public String getFrom() {
        return from;
    }

    public void setFrom(String from) {
        this.from = from == null ? null : from.trim();
    }

    public String getTo() {
        return to;
    }

    public void setTo(String to) {
        this.to = to == null ? null : to.trim();
    }

    public Date getDate() {
        return date;
    }

    public void setDate(Date date) {
        this.date = date;
    }

    public String getSfid() {
        return sfid;
    }

    public void setSfid(String sfid) {
        this.sfid = sfid == null ? null : sfid.trim();
    }

    public String getMark() {
        return mark;
    }

    public void setMark(String mark) {
        this.mark = mark == null ? null : mark.trim();
    }

	@Override
	public String toString() {
		return "Dispatch [dispid=" + dispid + ", from=" + from + ", to=" + to + ", date=" + date + ", sfid=" + sfid
				+ ", mark=" + mark + "]";
	}
    
}