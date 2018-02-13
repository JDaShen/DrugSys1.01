package com.domain;

import java.math.BigDecimal;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;

public class Staff {
	private String sfid; //业务员ID
							
	private String jobid; //职位ID
							
	private String sfname; //姓名
							
	private BigDecimal salary; //底薪
								
	private Date birthday; //生日
							
	private String sfphoneno; //电话
								
	private String sfaddress; //地址
								
	private Integer sfstate; //状态
								
	private String sfremarks; //备注
	
	//处理生日显示
	public String getSfBirthday() {
		SimpleDateFormat dateFormat = new SimpleDateFormat("yyyy-MM-dd");
		String format = dateFormat.format(this.getBirthday());
		return format;
	}
	public void setSfBirthday(Date birthday) {
		this.birthday = birthday;
	}
	
    public String getSfid() {
        return sfid;
    }

    public void setSfid(String sfid) {
        this.sfid = sfid == null ? null : sfid.trim();
    }

    public String getJobid() {
        return jobid;
    }

    public void setJobid(String jobid) {
        this.jobid = jobid == null ? null : jobid.trim();
    }

    public String getSfname() {
        return sfname;
    }

    public void setSfname(String sfname) {
        this.sfname = sfname == null ? null : sfname.trim();
    }

    public BigDecimal getSalary() {
        return salary;
    }

    public void setSalary(BigDecimal salary) {
        this.salary = salary;
    }

    public Date getBirthday() {
        return birthday;
    }

    public void setBirthday(Date birthday) {
        this.birthday = birthday;
    }

    public String getSfphoneno() {
        return sfphoneno;
    }

    public void setSfphoneno(String sfphoneno) {
        this.sfphoneno = sfphoneno == null ? null : sfphoneno.trim();
    }

    public String getSfaddress() {
        return sfaddress;
    }

    public void setSfaddress(String sfaddress) {
        this.sfaddress = sfaddress == null ? null : sfaddress.trim();
    }

    public Integer getSfstate() {
        return sfstate;
    }

    public void setSfstate(Integer sfstate) {
        this.sfstate = sfstate;
    }

    public String getSfremarks() {
        return sfremarks;
    }

    public void setSfremarks(String sfremarks) {
        this.sfremarks = sfremarks == null ? null : sfremarks.trim();
    }
}