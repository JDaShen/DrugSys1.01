package com.domain;

public class Rpitems {
    private String rpitemid;//报告项ID

    private String diid;//商品编号

    private Integer amount;//数量

    private String rid;//报损报溢单号

    public String getRpitemid() {
        return rpitemid;
    }

    public void setRpitemid(String rpitemid) {
        this.rpitemid = rpitemid == null ? null : rpitemid.trim();
    }

    public String getDiid() {
        return diid;
    }

    public void setDiid(String diid) {
        this.diid = diid == null ? null : diid.trim();
    }

    public Integer getAmount() {
        return amount;
    }

    public void setAmount(Integer amount) {
        this.amount = amount;
    }

    public String getRid() {
        return rid;
    }

    public void setRid(String rid) {
        this.rid = rid == null ? null : rid.trim();
    }
}