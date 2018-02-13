package com.domain;

import java.text.SimpleDateFormat;
import java.util.Date;

public class Logdetail {
	private String logid; //库存明细表ID
							
	private String tradeid; //交易单号ID
							
	private Date tradetime; //交易时间
							
	private String diid; //药品ID
							
	private Integer inqty; //入库数量
							
	private Integer outqty; //出库数量
							
	private String wid; //仓库ID
						
	private String batch; //批号
							
	private Date expire; //保质期
							
	private String supplier; //供应商
								
	private String sfid; //员工ID
	
	private String info;//物品流向说明
	
	private String sfname;
	
	public String getSfname() {
		return sfname;
	}

	public void setSfname(String sfname) {
		this.sfname = sfname;
	}

	//显示的时候调用的就是get方法，修改是就是set方法，灵活使用
	public String getTime() {
		SimpleDateFormat dateFormat = new SimpleDateFormat("yyyy-MM-dd");
		String format = dateFormat.format(this.getTradetime());
		return format;
	}
	
    public String getInfo() {
		return info;
	}

	public void setInfo(String info) {
		this.info = info;
	}

	public String getLogid() {
        return logid;
    }

    public void setLogid(String logid) {
        this.logid = logid == null ? null : logid.trim();
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

    public String getDiid() {
        return diid;
    }

    public void setDiid(String diid) {
        this.diid = diid == null ? null : diid.trim();
    }

    public Integer getInqty() {
        return inqty;
    }

    public void setInqty(Integer inqty) {
        this.inqty = inqty;
    }

    public Integer getOutqty() {
        return outqty;
    }

    public void setOutqty(Integer outqty) {
        this.outqty = outqty;
    }

    public String getWid() {
        return wid;
    }

    public void setWid(String wid) {
        this.wid = wid == null ? null : wid.trim();
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

    public String getSupplier() {
        return supplier;
    }

    public void setSupplier(String supplier) {
        this.supplier = supplier == null ? null : supplier.trim();
    }

    public String getSfid() {
        return sfid;
    }

    public void setSfid(String sfid) {
        this.sfid = sfid == null ? null : sfid.trim();
    }
}