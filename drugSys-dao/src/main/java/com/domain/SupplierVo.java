package com.domain;

import java.util.List;

public class SupplierVo {
	
	public List<Supplier> data;

	public List<Supplier> getData() {
		return data;
	}

	public void setData(List<Supplier> data) {
		this.data = data;
	}

	@Override
	public String toString() {
		return "SupplierVo [data=" + data + "]";
	}

	
	
	
	
}
