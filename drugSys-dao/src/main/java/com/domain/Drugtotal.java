package com.domain;

public class Drugtotal {
    private String dtid;//药品一级分类ID

    private String dtname;//药品一级分类名
    
    @Override
	public String toString() {
		return "Drugtotal [dtid=" + dtid + ", dtname=" + dtname + "]";
	}

	public String getDtid() {
        return dtid;
    }

    public void setDtid(String dtid) {
        this.dtid = dtid == null ? null : dtid.trim();
    }

    public String getDtname() {
        return dtname;
    }

    public void setDtname(String dtname) {
        this.dtname = dtname == null ? null : dtname.trim();
    }
}