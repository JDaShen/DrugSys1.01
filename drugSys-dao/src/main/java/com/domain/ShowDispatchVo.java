package com.domain;

import java.text.SimpleDateFormat;
import java.util.Date;

public class ShowDispatchVo {
	private String dispid;
    private String from;                           
    private String to;                      
    private Date date;      
    private String sfname ;
    private String mark ;
    
    public String getTime() {
		SimpleDateFormat dateFormat = new SimpleDateFormat("yyyy-MM-dd");
		String format = dateFormat.format(this.getDate());
		return format;
	}

	public String getDispid() {
		return dispid;
	}
	public void setDispid(String dispid) {
		this.dispid = dispid;
	}
	public String getFrom() {
		return from;
	}
	public void setFrom(String from) {
		this.from = from;
	}
	public String getTo() {
		return to;
	}
	public void setTo(String to) {
		this.to = to;
	}
	public Date getDate() {
		return date;
	}
	public void setDate(Date date) {
		this.date = date;
	}
	
	public String getSfname() {
		return sfname;
	}
	public void setSfname(String sfname) {
		this.sfname = sfname;
	}
	public String getMark() {
		return mark;
	}
	public void setMark(String mark) {
		this.mark = mark;
	}
                        
    
}
