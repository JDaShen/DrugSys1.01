package com.domain;

import java.math.BigDecimal;

public class Druginfo {
	private String diid; //药品ID

	private String ddid; //二级分类ID
	private String ddname;//二级类名
	private String dtname;//一级类名
	
	public String getDtname() {
		return dtname;
	}

	public void setDtname(String dtname) {
		this.dtname = dtname;
	}

	public String getDdname() {
		return ddname;
	}

	public void setDdname(String ddname) {
		this.ddname = ddname;
	}

	private String diname; //药品名
	private String commonname; //通用名

	private String barcode; //条码

	private String drugunit; //单位

	private String specification; //产品规格

	private String drugtype; //药剂类型

	private String registered; //注册证号

	private String approval; //批准文号

	private Integer ministock; //最低库存

	private BigDecimal singelprice; //预设售价

	private BigDecimal price; //采购单价

	private BigDecimal bargainprice; //特价售价

	private String manufacturer; //生产厂商

	private String drugremarks; //备注

	private Byte isephedrine; //含有麻黄碱标识

	private Byte supervision; //电子监管标识

	private Byte disable; //禁用标识

	

	@Override
	public String toString() {
		return "Druginfo [diid=" + diid + ", ddid=" + ddid + ", ddname=" + ddname + ", dtname=" + dtname + ", diname="
				+ diname + ", commonname=" + commonname + ", barcode=" + barcode + ", drugunit=" + drugunit
				+ ", specification=" + specification + ", drugtype=" + drugtype + ", registered=" + registered
				+ ", approval=" + approval + ", ministock=" + ministock + ", singelprice=" + singelprice + ", price="
				+ price + ", bargainprice=" + bargainprice + ", manufacturer=" + manufacturer + ", drugremarks="
				+ drugremarks + ", isephedrine=" + isephedrine + ", supervision=" + supervision + ", disable=" + disable
				+ "]";
	}

	public String getDiid() {
        return diid;
    }

    public void setDiid(String diid) {
        this.diid = diid == null ? null : diid.trim();
    }

    public String getDdid() {
        return ddid;
    }

    public void setDdid(String ddid) {
        this.ddid = ddid == null ? null : ddid.trim();
    }

    public String getDiname() {
        return diname;
    }

    public void setDiname(String diname) {
        this.diname = diname == null ? null : diname.trim();
    }

    public String getCommonname() {
        return commonname;
    }

    public void setCommonname(String commonname) {
        this.commonname = commonname == null ? null : commonname.trim();
    }

    public String getBarcode() {
        return barcode;
    }

    public void setBarcode(String barcode) {
        this.barcode = barcode == null ? null : barcode.trim();
    }

    public String getDrugunit() {
        return drugunit;
    }

    public void setDrugunit(String drugunit) {
        this.drugunit = drugunit == null ? null : drugunit.trim();
    }

    public String getSpecification() {
        return specification;
    }

    public void setSpecification(String specification) {
        this.specification = specification == null ? null : specification.trim();
    }

    public String getDrugtype() {
        return drugtype;
    }

    public void setDrugtype(String drugtype) {
        this.drugtype = drugtype == null ? null : drugtype.trim();
    }

    public String getRegistered() {
        return registered;
    }

    public void setRegistered(String registered) {
        this.registered = registered == null ? null : registered.trim();
    }

    public String getApproval() {
        return approval;
    }

    public void setApproval(String approval) {
        this.approval = approval == null ? null : approval.trim();
    }

    public Integer getMinistock() {
        return ministock;
    }

    public void setMinistock(Integer ministock) {
        this.ministock = ministock;
    }

    public BigDecimal getSingelprice() {
        return singelprice;
    }

    public void setSingelprice(BigDecimal singelprice) {
        this.singelprice = singelprice;
    }

    public BigDecimal getPrice() {
        return price;
    }

    public void setPrice(BigDecimal price) {
        this.price = price;
    }

    public BigDecimal getBargainprice() {
        return bargainprice;
    }

    public void setBargainprice(BigDecimal bargainprice) {
        this.bargainprice = bargainprice;
    }

    public String getManufacturer() {
        return manufacturer;
    }

    public void setManufacturer(String manufacturer) {
        this.manufacturer = manufacturer == null ? null : manufacturer.trim();
    }

    public String getDrugremarks() {
        return drugremarks;
    }

    public void setDrugremarks(String drugremarks) {
        this.drugremarks = drugremarks == null ? null : drugremarks.trim();
    }

    public Byte getIsephedrine() {
        return isephedrine;
    }

    public void setIsephedrine(Byte isephedrine) {
        this.isephedrine = isephedrine;
    }

    public Byte getSupervision() {
        return supervision;
    }

    public void setSupervision(Byte supervision) {
        this.supervision = supervision;
    }

    public Byte getDisable() {
        return disable;
    }

    public void setDisable(Byte disable) {
        this.disable = disable;
    }
}