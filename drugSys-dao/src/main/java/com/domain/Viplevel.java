package com.domain;

public class Viplevel {
    private String levelid;//客户等级ID

    private String vipname;//等级名称

    private Double discount;//优惠力度

    public String getLevelid() {
        return levelid;
    }

    public void setLevelid(String levelid) {
        this.levelid = levelid == null ? null : levelid.trim();
    }

    public String getVipname() {
        return vipname;
    }

    public void setVipname(String vipname) {
        this.vipname = vipname == null ? null : vipname.trim();
    }

    public Double getDiscount() {
        return discount;
    }

    public void setDiscount(Double discount) {
        this.discount = discount;
    }
}