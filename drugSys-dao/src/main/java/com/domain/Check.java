package com.domain;

import java.text.SimpleDateFormat;
import java.util.Date;

public class Check {
	private String cid; //库存盘点ID

	private Date date; //盘点日志

	private String wid; //仓库ID

	private String sfid; //操作员ID

	private Integer goodsentry; //条数

	private Integer amount; //盘点数量

	private String comment; //备注
	
	private String sfname;
	
	public String getTime() {
		SimpleDateFormat dateFormat = new SimpleDateFormat("yyyy-MM-dd");
		String format = dateFormat.format(this.getDate());
		return format;
	}

    public String getSfname() {
		return sfname;
	}

	public void setSfname(String sfname) {
		this.sfname = sfname;
	}

	public String getCid() {
        return cid;
    }

    public void setCid(String cid) {
        this.cid = cid == null ? null : cid.trim();
    }

    public Date getDate() {
        return date;
    }

    public void setDate(Date date) {
        this.date = date;
    }

    public String getWid() {
        return wid;
    }

    public void setWid(String wid) {
        this.wid = wid == null ? null : wid.trim();
    }

    public String getSfid() {
        return sfid;
    }

    public void setSfid(String sfid) {
        this.sfid = sfid == null ? null : sfid.trim();
    }

    public Integer getGoodsentry() {
        return goodsentry;
    }

    public void setGoodsentry(Integer goodsentry) {
        this.goodsentry = goodsentry;
    }

    public Integer getAmount() {
        return amount;
    }

    public void setAmount(Integer amount) {
        this.amount = amount;
    }

    public String getComment() {
        return comment;
    }

    public void setComment(String comment) {
        this.comment = comment == null ? null : comment.trim();
    }

	@Override
	public String toString() {
		return "Check [cid=" + cid + ", date=" + date + ", wid=" + wid + ", sfid=" + sfid + ", goodsentry=" + goodsentry
				+ ", amount=" + amount + ", comment=" + comment + "]";
	}
    
}