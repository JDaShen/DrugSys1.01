package com.domain;

import java.util.List;

public class StaffVo {

	private List<Staff> staffs;
	private String[] staffIds;
	
	public List<Staff> getStaffs() {
		return staffs;
	}
	public void setStaffs(List<Staff> staffs) {
		this.staffs = staffs;
	}
	public String[] getStaffIds() {
		return staffIds;
	}
	public void setStaffIds(String[] staffIds) {
		this.staffIds = staffIds;
	}

}
