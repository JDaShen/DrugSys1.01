package com.domain;

public class Drugdetailed {
    private String ddid;//药品二级分类ID

    private String ddname;//分类名

    private String dtid;//一级分类ID
    
    private String dtname;//一级类名

    
	@Override
	public String toString() {
		return "Drugdetailed [ddid=" + ddid + ", ddname=" + ddname + ", dtid=" + dtid + ", dtname=" + dtname + "]";
	}

	public String getDdid() {
		return ddid;
	}

	public void setDdid(String ddid) {
		this.ddid = ddid;
	}

	public String getDdname() {
		return ddname;
	}

	public void setDdname(String ddname) {
		this.ddname = ddname;
	}

	public String getDtid() {
		return dtid;
	}

	public void setDtid(String dtid) {
		this.dtid = dtid;
	}

	public String getDtname() {
		return dtname;
	}

	public void setDtname(String dtname) {
		this.dtname = dtname;
	}
    
}