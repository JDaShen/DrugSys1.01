package com.domain;

public class PgrVo {
	private Purchaseandgoodsreject pgr;
	private Pgritem pgritem;
	
	public Purchaseandgoodsreject getPgr() {
		return pgr;
	}
	public void setPgr(Purchaseandgoodsreject pgr) {
		this.pgr = pgr;
	}
	public Pgritem getPgritem() {
		return pgritem;
	}
	public void setPgritem(Pgritem pgritem) {
		this.pgritem = pgritem;
	}
	@Override
	public String toString() {
		return "PgrVo [pgr=" + pgr + ", pgritem=" + pgritem + "]";
	}
	
}
