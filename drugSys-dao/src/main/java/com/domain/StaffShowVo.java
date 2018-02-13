package com.domain;

import java.math.BigDecimal;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;

public class StaffShowVo extends Staff{
	
	private String jobName;
	
	private String sfBirthday;
//
//	
//	
//	public String getSfBirthday() {
////		SimpleDateFormat dateFormat = new SimpleDateFormat("yyyy-MM-dd");
////		String format = dateFormat.format(this.getBirthday());
//		return sfBirthday;
//	}
//
//	public void setSfBirthday() {
//		SimpleDateFormat dateFormat = new SimpleDateFormat("yyyy-MM-dd");
//		String format = dateFormat.format(this.getBirthday());
//	}
	
	
	

	public String getJobName() {
		return jobName;
	}

	public String getSfBirthday() {
		return sfBirthday;
	}

	public void setSfBirthday(Date birthday) {
		SimpleDateFormat dateFormat = new SimpleDateFormat("yyyy-MM-dd");
		this.sfBirthday = dateFormat.format(birthday);
	}

	public void setJobName(String jobName) {
		this.jobName = jobName;
	}

	

	

}
