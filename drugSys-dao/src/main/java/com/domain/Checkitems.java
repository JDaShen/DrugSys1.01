package com.domain;

public class Checkitems {
    private String itemid;    //盘点项ID
                              
    private String cid;       //盘点单ID
                              
    private String diid;      //药品Id
                              
    private String diname;    //药品名称
                              
    private Integer wqty;     //库存数量
                              
    private Integer rqty;     //盘点数量

    public String getItemid() {
        return itemid;
    }

    public void setItemid(String itemid) {
        this.itemid = itemid == null ? null : itemid.trim();
    }

    public String getCid() {
        return cid;
    }

    public void setCid(String cid) {
        this.cid = cid == null ? null : cid.trim();
    }

    public String getDiid() {
        return diid;
    }

    public void setDiid(String diid) {
        this.diid = diid == null ? null : diid.trim();
    }

    public String getDiname() {
        return diname;
    }

    public void setDiname(String diname) {
        this.diname = diname == null ? null : diname.trim();
    }

    public Integer getWqty() {
        return wqty;
    }

    public void setWqty(Integer wqty) {
        this.wqty = wqty;
    }

    public Integer getRqty() {
        return rqty;
    }

    public void setRqty(Integer rqty) {
        this.rqty = rqty;
    }
}