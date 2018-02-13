package com.domain;

import java.util.List;

public class PurchaseVo {
	private Purchaseandgoodsreject pgr;
	private Pgritem pgritem;
	@Override
	public String toString() {
		return "PurchaseVo [pgr=" + pgr + ", pgritem=" + pgritem + "]";
	}
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
}
