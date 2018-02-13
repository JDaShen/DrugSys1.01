package com.domain;

public class SaleVo {
	private Saleorder saleOrder;
	private Saleitem saleOrderItem;
	@Override
	public String toString() {
		return "SaleVo [saleOrder=" + saleOrder + ", saleOrderItem=" + saleOrderItem + "]";
	}
	public Saleorder getSaleOrder() {
		return saleOrder;
	}
	public void setSaleOrder(Saleorder saleOrder) {
		this.saleOrder = saleOrder;
	}
	public Saleitem getSaleOrderItem() {
		return saleOrderItem;
	}
	public void setSaleOrderItem(Saleitem saleOrderItem) {
		this.saleOrderItem = saleOrderItem;
	}
}
