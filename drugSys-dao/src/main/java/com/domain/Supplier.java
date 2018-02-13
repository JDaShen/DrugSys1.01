package com.domain;

public class Supplier {
    private String splid;//供应商ID

    private String splname;//名称

    private String contact;//联系人

    private String splphoneno;//联系电话

    private String spladdress;//地址

    private String spltype;//类型

    private String region;//所属地区

    private Byte isdefault;//默认供货商标识

    public String getSplid() {
        return splid;
    }

    public void setSplid(String splid) {
        this.splid = splid == null ? null : splid.trim();
    }

    public String getSplname() {
        return splname;
    }

    public void setSplname(String splname) {
        this.splname = splname == null ? null : splname.trim();
    }

    public String getContact() {
        return contact;
    }

    public void setContact(String contact) {
        this.contact = contact == null ? null : contact.trim();
    }

    public String getSplphoneno() {
        return splphoneno;
    }

    public void setSplphoneno(String splphoneno) {
        this.splphoneno = splphoneno == null ? null : splphoneno.trim();
    }

    public String getSpladdress() {
        return spladdress;
    }

    public void setSpladdress(String spladdress) {
        this.spladdress = spladdress == null ? null : spladdress.trim();
    }

    public String getSpltype() {
        return spltype;
    }

    public void setSpltype(String spltype) {
        this.spltype = spltype == null ? null : spltype.trim();
    }

    public String getRegion() {
        return region;
    }

    public void setRegion(String region) {
        this.region = region == null ? null : region.trim();
    }

    public Byte getIsdefault() {
        return isdefault;
    }

    public void setIsdefault(Byte isdefault) {
        this.isdefault = isdefault;
    }
}