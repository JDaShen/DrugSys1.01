package com.domain;

public class DispatchDetailVo extends Druginfo {
	private String ditemid; //调拨项ID

	private String diid; //商品ID

	private Integer amount; //数量

	private String dispid; //调拨单ID
	
	private String rid;//报告单ID
	private String wid;
	private String wqty;
	private String rqty;
		
	private String tradeid;
	public String getWid() {
		return wid;
	}

	public String getTradeid() {
		return tradeid;
	}

	public void setTradeid(String tradeid) {
		this.tradeid = tradeid;
	}

	public void setWid(String wid) {
		this.wid = wid;
	}

	public String getWqty() {
			return wqty;
		}

		public void setWqty(String wqty) {
			this.wqty = wqty;
		}

		public String getRqty() {
			return rqty;
		}

		public void setRqty(String rqty) {
			this.rqty = rqty;
		}

	public String getRid() {
		return rid;
	}

	public void setRid(String rid) {
		this.rid = rid;
	}

	public String getDitemid() {
		return ditemid;
	}

	public void setDitemid(String ditemid) {
		this.ditemid = ditemid;
	}

	public String getDiid() {
		return diid;
	}

	public void setDiid(String diid) {
		this.diid = diid;
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
		this.dispid = dispid;
	}
	
}
