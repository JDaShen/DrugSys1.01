package com.domain;

import java.math.BigDecimal;

public class Customer {
	private String ctid; //客户编号
							
	private String ctname; //姓名
							
	private Integer levelid; //等级ID
								
	private Integer integral; //积分
								
	private BigDecimal consume; //总消费
								
	private Integer times; //消费次数
							
	private BigDecimal balance; //卡内余额
								
	private Integer ctstate; //状态
								
    public String getCtid() {
        return ctid;
    }

    public void setCtid(String ctid) {
        this.ctid = ctid == null ? null : ctid.trim();
    }

    public String getCtname() {
        return ctname;
    }

    public void setCtname(String ctname) {
        this.ctname = ctname == null ? null : ctname.trim();
    }

    public Integer getLevelid() {
        return levelid;
    }

    public void setLevelid(Integer levelid) {
        this.levelid = levelid;
    }

    public Integer getIntegral() {
        return integral;
    }

    public void setIntegral(Integer integral) {
        this.integral = integral;
    }

    public BigDecimal getConsume() {
        return consume;
    }

    public void setConsume(BigDecimal consume) {
        this.consume = consume;
    }

    public Integer getTimes() {
        return times;
    }

    public void setTimes(Integer times) {
        this.times = times;
    }

    public BigDecimal getBalance() {
        return balance;
    }

    public void setBalance(BigDecimal balance) {
        this.balance = balance;
    }

    public Integer getCtstate() {
        return ctstate;
    }

    public void setCtstate(Integer ctstate) {
        this.ctstate = ctstate;
    }
}