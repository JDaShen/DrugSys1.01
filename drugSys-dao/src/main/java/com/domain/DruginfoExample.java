package com.domain;

import java.math.BigDecimal;
import java.util.ArrayList;
import java.util.List;

public class DruginfoExample {
    protected String orderByClause;

    protected boolean distinct;

    protected List<Criteria> oredCriteria;

    public DruginfoExample() {
        oredCriteria = new ArrayList<Criteria>();
    }

    public void setOrderByClause(String orderByClause) {
        this.orderByClause = orderByClause;
    }

    public String getOrderByClause() {
        return orderByClause;
    }

    public void setDistinct(boolean distinct) {
        this.distinct = distinct;
    }

    public boolean isDistinct() {
        return distinct;
    }

    public List<Criteria> getOredCriteria() {
        return oredCriteria;
    }

    public void or(Criteria criteria) {
        oredCriteria.add(criteria);
    }

    public Criteria or() {
        Criteria criteria = createCriteriaInternal();
        oredCriteria.add(criteria);
        return criteria;
    }

    public Criteria createCriteria() {
        Criteria criteria = createCriteriaInternal();
        if (oredCriteria.size() == 0) {
            oredCriteria.add(criteria);
        }
        return criteria;
    }

    protected Criteria createCriteriaInternal() {
        Criteria criteria = new Criteria();
        return criteria;
    }

    public void clear() {
        oredCriteria.clear();
        orderByClause = null;
        distinct = false;
    }

    protected abstract static class GeneratedCriteria {
        protected List<Criterion> criteria;

        protected GeneratedCriteria() {
            super();
            criteria = new ArrayList<Criterion>();
        }

        public boolean isValid() {
            return criteria.size() > 0;
        }

        public List<Criterion> getAllCriteria() {
            return criteria;
        }

        public List<Criterion> getCriteria() {
            return criteria;
        }

        protected void addCriterion(String condition) {
            if (condition == null) {
                throw new RuntimeException("Value for condition cannot be null");
            }
            criteria.add(new Criterion(condition));
        }

        protected void addCriterion(String condition, Object value, String property) {
            if (value == null) {
                throw new RuntimeException("Value for " + property + " cannot be null");
            }
            criteria.add(new Criterion(condition, value));
        }

        protected void addCriterion(String condition, Object value1, Object value2, String property) {
            if (value1 == null || value2 == null) {
                throw new RuntimeException("Between values for " + property + " cannot be null");
            }
            criteria.add(new Criterion(condition, value1, value2));
        }

        public Criteria andDiidIsNull() {
            addCriterion("diId is null");
            return (Criteria) this;
        }

        public Criteria andDiidIsNotNull() {
            addCriterion("diId is not null");
            return (Criteria) this;
        }

        public Criteria andDiidEqualTo(String value) {
            addCriterion("diId =", value, "diid");
            return (Criteria) this;
        }

        public Criteria andDiidNotEqualTo(String value) {
            addCriterion("diId <>", value, "diid");
            return (Criteria) this;
        }

        public Criteria andDiidGreaterThan(String value) {
            addCriterion("diId >", value, "diid");
            return (Criteria) this;
        }

        public Criteria andDiidGreaterThanOrEqualTo(String value) {
            addCriterion("diId >=", value, "diid");
            return (Criteria) this;
        }

        public Criteria andDiidLessThan(String value) {
            addCriterion("diId <", value, "diid");
            return (Criteria) this;
        }

        public Criteria andDiidLessThanOrEqualTo(String value) {
            addCriterion("diId <=", value, "diid");
            return (Criteria) this;
        }

        public Criteria andDiidLike(String value) {
            addCriterion("diId like", value, "diid");
            return (Criteria) this;
        }

        public Criteria andDiidNotLike(String value) {
            addCriterion("diId not like", value, "diid");
            return (Criteria) this;
        }

        public Criteria andDiidIn(List<String> values) {
            addCriterion("diId in", values, "diid");
            return (Criteria) this;
        }

        public Criteria andDiidNotIn(List<String> values) {
            addCriterion("diId not in", values, "diid");
            return (Criteria) this;
        }

        public Criteria andDiidBetween(String value1, String value2) {
            addCriterion("diId between", value1, value2, "diid");
            return (Criteria) this;
        }

        public Criteria andDiidNotBetween(String value1, String value2) {
            addCriterion("diId not between", value1, value2, "diid");
            return (Criteria) this;
        }

        public Criteria andDdidIsNull() {
            addCriterion("ddId is null");
            return (Criteria) this;
        }

        public Criteria andDdidIsNotNull() {
            addCriterion("ddId is not null");
            return (Criteria) this;
        }

        public Criteria andDdidEqualTo(String value) {
            addCriterion("ddId =", value, "ddid");
            return (Criteria) this;
        }

        public Criteria andDdidNotEqualTo(String value) {
            addCriterion("ddId <>", value, "ddid");
            return (Criteria) this;
        }

        public Criteria andDdidGreaterThan(String value) {
            addCriterion("ddId >", value, "ddid");
            return (Criteria) this;
        }

        public Criteria andDdidGreaterThanOrEqualTo(String value) {
            addCriterion("ddId >=", value, "ddid");
            return (Criteria) this;
        }

        public Criteria andDdidLessThan(String value) {
            addCriterion("ddId <", value, "ddid");
            return (Criteria) this;
        }

        public Criteria andDdidLessThanOrEqualTo(String value) {
            addCriterion("ddId <=", value, "ddid");
            return (Criteria) this;
        }

        public Criteria andDdidLike(String value) {
            addCriterion("ddId like", value, "ddid");
            return (Criteria) this;
        }

        public Criteria andDdidNotLike(String value) {
            addCriterion("ddId not like", value, "ddid");
            return (Criteria) this;
        }

        public Criteria andDdidIn(List<String> values) {
            addCriterion("ddId in", values, "ddid");
            return (Criteria) this;
        }

        public Criteria andDdidNotIn(List<String> values) {
            addCriterion("ddId not in", values, "ddid");
            return (Criteria) this;
        }

        public Criteria andDdidBetween(String value1, String value2) {
            addCriterion("ddId between", value1, value2, "ddid");
            return (Criteria) this;
        }

        public Criteria andDdidNotBetween(String value1, String value2) {
            addCriterion("ddId not between", value1, value2, "ddid");
            return (Criteria) this;
        }

        public Criteria andDinameIsNull() {
            addCriterion("diName is null");
            return (Criteria) this;
        }

        public Criteria andDinameIsNotNull() {
            addCriterion("diName is not null");
            return (Criteria) this;
        }

        public Criteria andDinameEqualTo(String value) {
            addCriterion("diName =", value, "diname");
            return (Criteria) this;
        }

        public Criteria andDinameNotEqualTo(String value) {
            addCriterion("diName <>", value, "diname");
            return (Criteria) this;
        }

        public Criteria andDinameGreaterThan(String value) {
            addCriterion("diName >", value, "diname");
            return (Criteria) this;
        }

        public Criteria andDinameGreaterThanOrEqualTo(String value) {
            addCriterion("diName >=", value, "diname");
            return (Criteria) this;
        }

        public Criteria andDinameLessThan(String value) {
            addCriterion("diName <", value, "diname");
            return (Criteria) this;
        }

        public Criteria andDinameLessThanOrEqualTo(String value) {
            addCriterion("diName <=", value, "diname");
            return (Criteria) this;
        }

        public Criteria andDinameLike(String value) {
            addCriterion("diName like", value, "diname");
            return (Criteria) this;
        }

        public Criteria andDinameNotLike(String value) {
            addCriterion("diName not like", value, "diname");
            return (Criteria) this;
        }

        public Criteria andDinameIn(List<String> values) {
            addCriterion("diName in", values, "diname");
            return (Criteria) this;
        }

        public Criteria andDinameNotIn(List<String> values) {
            addCriterion("diName not in", values, "diname");
            return (Criteria) this;
        }

        public Criteria andDinameBetween(String value1, String value2) {
            addCriterion("diName between", value1, value2, "diname");
            return (Criteria) this;
        }

        public Criteria andDinameNotBetween(String value1, String value2) {
            addCriterion("diName not between", value1, value2, "diname");
            return (Criteria) this;
        }

        public Criteria andCommonnameIsNull() {
            addCriterion("commonName is null");
            return (Criteria) this;
        }

        public Criteria andCommonnameIsNotNull() {
            addCriterion("commonName is not null");
            return (Criteria) this;
        }

        public Criteria andCommonnameEqualTo(String value) {
            addCriterion("commonName =", value, "commonname");
            return (Criteria) this;
        }

        public Criteria andCommonnameNotEqualTo(String value) {
            addCriterion("commonName <>", value, "commonname");
            return (Criteria) this;
        }

        public Criteria andCommonnameGreaterThan(String value) {
            addCriterion("commonName >", value, "commonname");
            return (Criteria) this;
        }

        public Criteria andCommonnameGreaterThanOrEqualTo(String value) {
            addCriterion("commonName >=", value, "commonname");
            return (Criteria) this;
        }

        public Criteria andCommonnameLessThan(String value) {
            addCriterion("commonName <", value, "commonname");
            return (Criteria) this;
        }

        public Criteria andCommonnameLessThanOrEqualTo(String value) {
            addCriterion("commonName <=", value, "commonname");
            return (Criteria) this;
        }

        public Criteria andCommonnameLike(String value) {
            addCriterion("commonName like", value, "commonname");
            return (Criteria) this;
        }

        public Criteria andCommonnameNotLike(String value) {
            addCriterion("commonName not like", value, "commonname");
            return (Criteria) this;
        }

        public Criteria andCommonnameIn(List<String> values) {
            addCriterion("commonName in", values, "commonname");
            return (Criteria) this;
        }

        public Criteria andCommonnameNotIn(List<String> values) {
            addCriterion("commonName not in", values, "commonname");
            return (Criteria) this;
        }

        public Criteria andCommonnameBetween(String value1, String value2) {
            addCriterion("commonName between", value1, value2, "commonname");
            return (Criteria) this;
        }

        public Criteria andCommonnameNotBetween(String value1, String value2) {
            addCriterion("commonName not between", value1, value2, "commonname");
            return (Criteria) this;
        }

        public Criteria andBarcodeIsNull() {
            addCriterion("barCode is null");
            return (Criteria) this;
        }

        public Criteria andBarcodeIsNotNull() {
            addCriterion("barCode is not null");
            return (Criteria) this;
        }

        public Criteria andBarcodeEqualTo(String value) {
            addCriterion("barCode =", value, "barcode");
            return (Criteria) this;
        }

        public Criteria andBarcodeNotEqualTo(String value) {
            addCriterion("barCode <>", value, "barcode");
            return (Criteria) this;
        }

        public Criteria andBarcodeGreaterThan(String value) {
            addCriterion("barCode >", value, "barcode");
            return (Criteria) this;
        }

        public Criteria andBarcodeGreaterThanOrEqualTo(String value) {
            addCriterion("barCode >=", value, "barcode");
            return (Criteria) this;
        }

        public Criteria andBarcodeLessThan(String value) {
            addCriterion("barCode <", value, "barcode");
            return (Criteria) this;
        }

        public Criteria andBarcodeLessThanOrEqualTo(String value) {
            addCriterion("barCode <=", value, "barcode");
            return (Criteria) this;
        }

        public Criteria andBarcodeLike(String value) {
            addCriterion("barCode like", value, "barcode");
            return (Criteria) this;
        }

        public Criteria andBarcodeNotLike(String value) {
            addCriterion("barCode not like", value, "barcode");
            return (Criteria) this;
        }

        public Criteria andBarcodeIn(List<String> values) {
            addCriterion("barCode in", values, "barcode");
            return (Criteria) this;
        }

        public Criteria andBarcodeNotIn(List<String> values) {
            addCriterion("barCode not in", values, "barcode");
            return (Criteria) this;
        }

        public Criteria andBarcodeBetween(String value1, String value2) {
            addCriterion("barCode between", value1, value2, "barcode");
            return (Criteria) this;
        }

        public Criteria andBarcodeNotBetween(String value1, String value2) {
            addCriterion("barCode not between", value1, value2, "barcode");
            return (Criteria) this;
        }

        public Criteria andDrugunitIsNull() {
            addCriterion("drugUnit is null");
            return (Criteria) this;
        }

        public Criteria andDrugunitIsNotNull() {
            addCriterion("drugUnit is not null");
            return (Criteria) this;
        }

        public Criteria andDrugunitEqualTo(String value) {
            addCriterion("drugUnit =", value, "drugunit");
            return (Criteria) this;
        }

        public Criteria andDrugunitNotEqualTo(String value) {
            addCriterion("drugUnit <>", value, "drugunit");
            return (Criteria) this;
        }

        public Criteria andDrugunitGreaterThan(String value) {
            addCriterion("drugUnit >", value, "drugunit");
            return (Criteria) this;
        }

        public Criteria andDrugunitGreaterThanOrEqualTo(String value) {
            addCriterion("drugUnit >=", value, "drugunit");
            return (Criteria) this;
        }

        public Criteria andDrugunitLessThan(String value) {
            addCriterion("drugUnit <", value, "drugunit");
            return (Criteria) this;
        }

        public Criteria andDrugunitLessThanOrEqualTo(String value) {
            addCriterion("drugUnit <=", value, "drugunit");
            return (Criteria) this;
        }

        public Criteria andDrugunitLike(String value) {
            addCriterion("drugUnit like", value, "drugunit");
            return (Criteria) this;
        }

        public Criteria andDrugunitNotLike(String value) {
            addCriterion("drugUnit not like", value, "drugunit");
            return (Criteria) this;
        }

        public Criteria andDrugunitIn(List<String> values) {
            addCriterion("drugUnit in", values, "drugunit");
            return (Criteria) this;
        }

        public Criteria andDrugunitNotIn(List<String> values) {
            addCriterion("drugUnit not in", values, "drugunit");
            return (Criteria) this;
        }

        public Criteria andDrugunitBetween(String value1, String value2) {
            addCriterion("drugUnit between", value1, value2, "drugunit");
            return (Criteria) this;
        }

        public Criteria andDrugunitNotBetween(String value1, String value2) {
            addCriterion("drugUnit not between", value1, value2, "drugunit");
            return (Criteria) this;
        }

        public Criteria andSpecificationIsNull() {
            addCriterion("specification is null");
            return (Criteria) this;
        }

        public Criteria andSpecificationIsNotNull() {
            addCriterion("specification is not null");
            return (Criteria) this;
        }

        public Criteria andSpecificationEqualTo(String value) {
            addCriterion("specification =", value, "specification");
            return (Criteria) this;
        }

        public Criteria andSpecificationNotEqualTo(String value) {
            addCriterion("specification <>", value, "specification");
            return (Criteria) this;
        }

        public Criteria andSpecificationGreaterThan(String value) {
            addCriterion("specification >", value, "specification");
            return (Criteria) this;
        }

        public Criteria andSpecificationGreaterThanOrEqualTo(String value) {
            addCriterion("specification >=", value, "specification");
            return (Criteria) this;
        }

        public Criteria andSpecificationLessThan(String value) {
            addCriterion("specification <", value, "specification");
            return (Criteria) this;
        }

        public Criteria andSpecificationLessThanOrEqualTo(String value) {
            addCriterion("specification <=", value, "specification");
            return (Criteria) this;
        }

        public Criteria andSpecificationLike(String value) {
            addCriterion("specification like", value, "specification");
            return (Criteria) this;
        }

        public Criteria andSpecificationNotLike(String value) {
            addCriterion("specification not like", value, "specification");
            return (Criteria) this;
        }

        public Criteria andSpecificationIn(List<String> values) {
            addCriterion("specification in", values, "specification");
            return (Criteria) this;
        }

        public Criteria andSpecificationNotIn(List<String> values) {
            addCriterion("specification not in", values, "specification");
            return (Criteria) this;
        }

        public Criteria andSpecificationBetween(String value1, String value2) {
            addCriterion("specification between", value1, value2, "specification");
            return (Criteria) this;
        }

        public Criteria andSpecificationNotBetween(String value1, String value2) {
            addCriterion("specification not between", value1, value2, "specification");
            return (Criteria) this;
        }

        public Criteria andDrugtypeIsNull() {
            addCriterion("drugType is null");
            return (Criteria) this;
        }

        public Criteria andDrugtypeIsNotNull() {
            addCriterion("drugType is not null");
            return (Criteria) this;
        }

        public Criteria andDrugtypeEqualTo(String value) {
            addCriterion("drugType =", value, "drugtype");
            return (Criteria) this;
        }

        public Criteria andDrugtypeNotEqualTo(String value) {
            addCriterion("drugType <>", value, "drugtype");
            return (Criteria) this;
        }

        public Criteria andDrugtypeGreaterThan(String value) {
            addCriterion("drugType >", value, "drugtype");
            return (Criteria) this;
        }

        public Criteria andDrugtypeGreaterThanOrEqualTo(String value) {
            addCriterion("drugType >=", value, "drugtype");
            return (Criteria) this;
        }

        public Criteria andDrugtypeLessThan(String value) {
            addCriterion("drugType <", value, "drugtype");
            return (Criteria) this;
        }

        public Criteria andDrugtypeLessThanOrEqualTo(String value) {
            addCriterion("drugType <=", value, "drugtype");
            return (Criteria) this;
        }

        public Criteria andDrugtypeLike(String value) {
            addCriterion("drugType like", value, "drugtype");
            return (Criteria) this;
        }

        public Criteria andDrugtypeNotLike(String value) {
            addCriterion("drugType not like", value, "drugtype");
            return (Criteria) this;
        }

        public Criteria andDrugtypeIn(List<String> values) {
            addCriterion("drugType in", values, "drugtype");
            return (Criteria) this;
        }

        public Criteria andDrugtypeNotIn(List<String> values) {
            addCriterion("drugType not in", values, "drugtype");
            return (Criteria) this;
        }

        public Criteria andDrugtypeBetween(String value1, String value2) {
            addCriterion("drugType between", value1, value2, "drugtype");
            return (Criteria) this;
        }

        public Criteria andDrugtypeNotBetween(String value1, String value2) {
            addCriterion("drugType not between", value1, value2, "drugtype");
            return (Criteria) this;
        }

        public Criteria andRegisteredIsNull() {
            addCriterion("registered is null");
            return (Criteria) this;
        }

        public Criteria andRegisteredIsNotNull() {
            addCriterion("registered is not null");
            return (Criteria) this;
        }

        public Criteria andRegisteredEqualTo(String value) {
            addCriterion("registered =", value, "registered");
            return (Criteria) this;
        }

        public Criteria andRegisteredNotEqualTo(String value) {
            addCriterion("registered <>", value, "registered");
            return (Criteria) this;
        }

        public Criteria andRegisteredGreaterThan(String value) {
            addCriterion("registered >", value, "registered");
            return (Criteria) this;
        }

        public Criteria andRegisteredGreaterThanOrEqualTo(String value) {
            addCriterion("registered >=", value, "registered");
            return (Criteria) this;
        }

        public Criteria andRegisteredLessThan(String value) {
            addCriterion("registered <", value, "registered");
            return (Criteria) this;
        }

        public Criteria andRegisteredLessThanOrEqualTo(String value) {
            addCriterion("registered <=", value, "registered");
            return (Criteria) this;
        }

        public Criteria andRegisteredLike(String value) {
            addCriterion("registered like", value, "registered");
            return (Criteria) this;
        }

        public Criteria andRegisteredNotLike(String value) {
            addCriterion("registered not like", value, "registered");
            return (Criteria) this;
        }

        public Criteria andRegisteredIn(List<String> values) {
            addCriterion("registered in", values, "registered");
            return (Criteria) this;
        }

        public Criteria andRegisteredNotIn(List<String> values) {
            addCriterion("registered not in", values, "registered");
            return (Criteria) this;
        }

        public Criteria andRegisteredBetween(String value1, String value2) {
            addCriterion("registered between", value1, value2, "registered");
            return (Criteria) this;
        }

        public Criteria andRegisteredNotBetween(String value1, String value2) {
            addCriterion("registered not between", value1, value2, "registered");
            return (Criteria) this;
        }

        public Criteria andApprovalIsNull() {
            addCriterion("approval is null");
            return (Criteria) this;
        }

        public Criteria andApprovalIsNotNull() {
            addCriterion("approval is not null");
            return (Criteria) this;
        }

        public Criteria andApprovalEqualTo(String value) {
            addCriterion("approval =", value, "approval");
            return (Criteria) this;
        }

        public Criteria andApprovalNotEqualTo(String value) {
            addCriterion("approval <>", value, "approval");
            return (Criteria) this;
        }

        public Criteria andApprovalGreaterThan(String value) {
            addCriterion("approval >", value, "approval");
            return (Criteria) this;
        }

        public Criteria andApprovalGreaterThanOrEqualTo(String value) {
            addCriterion("approval >=", value, "approval");
            return (Criteria) this;
        }

        public Criteria andApprovalLessThan(String value) {
            addCriterion("approval <", value, "approval");
            return (Criteria) this;
        }

        public Criteria andApprovalLessThanOrEqualTo(String value) {
            addCriterion("approval <=", value, "approval");
            return (Criteria) this;
        }

        public Criteria andApprovalLike(String value) {
            addCriterion("approval like", value, "approval");
            return (Criteria) this;
        }

        public Criteria andApprovalNotLike(String value) {
            addCriterion("approval not like", value, "approval");
            return (Criteria) this;
        }

        public Criteria andApprovalIn(List<String> values) {
            addCriterion("approval in", values, "approval");
            return (Criteria) this;
        }

        public Criteria andApprovalNotIn(List<String> values) {
            addCriterion("approval not in", values, "approval");
            return (Criteria) this;
        }

        public Criteria andApprovalBetween(String value1, String value2) {
            addCriterion("approval between", value1, value2, "approval");
            return (Criteria) this;
        }

        public Criteria andApprovalNotBetween(String value1, String value2) {
            addCriterion("approval not between", value1, value2, "approval");
            return (Criteria) this;
        }

        public Criteria andMinistockIsNull() {
            addCriterion("miniStock is null");
            return (Criteria) this;
        }

        public Criteria andMinistockIsNotNull() {
            addCriterion("miniStock is not null");
            return (Criteria) this;
        }

        public Criteria andMinistockEqualTo(Integer value) {
            addCriterion("miniStock =", value, "ministock");
            return (Criteria) this;
        }

        public Criteria andMinistockNotEqualTo(Integer value) {
            addCriterion("miniStock <>", value, "ministock");
            return (Criteria) this;
        }

        public Criteria andMinistockGreaterThan(Integer value) {
            addCriterion("miniStock >", value, "ministock");
            return (Criteria) this;
        }

        public Criteria andMinistockGreaterThanOrEqualTo(Integer value) {
            addCriterion("miniStock >=", value, "ministock");
            return (Criteria) this;
        }

        public Criteria andMinistockLessThan(Integer value) {
            addCriterion("miniStock <", value, "ministock");
            return (Criteria) this;
        }

        public Criteria andMinistockLessThanOrEqualTo(Integer value) {
            addCriterion("miniStock <=", value, "ministock");
            return (Criteria) this;
        }

        public Criteria andMinistockIn(List<Integer> values) {
            addCriterion("miniStock in", values, "ministock");
            return (Criteria) this;
        }

        public Criteria andMinistockNotIn(List<Integer> values) {
            addCriterion("miniStock not in", values, "ministock");
            return (Criteria) this;
        }

        public Criteria andMinistockBetween(Integer value1, Integer value2) {
            addCriterion("miniStock between", value1, value2, "ministock");
            return (Criteria) this;
        }

        public Criteria andMinistockNotBetween(Integer value1, Integer value2) {
            addCriterion("miniStock not between", value1, value2, "ministock");
            return (Criteria) this;
        }

        public Criteria andSingelpriceIsNull() {
            addCriterion("singelPrice is null");
            return (Criteria) this;
        }

        public Criteria andSingelpriceIsNotNull() {
            addCriterion("singelPrice is not null");
            return (Criteria) this;
        }

        public Criteria andSingelpriceEqualTo(BigDecimal value) {
            addCriterion("singelPrice =", value, "singelprice");
            return (Criteria) this;
        }

        public Criteria andSingelpriceNotEqualTo(BigDecimal value) {
            addCriterion("singelPrice <>", value, "singelprice");
            return (Criteria) this;
        }

        public Criteria andSingelpriceGreaterThan(BigDecimal value) {
            addCriterion("singelPrice >", value, "singelprice");
            return (Criteria) this;
        }

        public Criteria andSingelpriceGreaterThanOrEqualTo(BigDecimal value) {
            addCriterion("singelPrice >=", value, "singelprice");
            return (Criteria) this;
        }

        public Criteria andSingelpriceLessThan(BigDecimal value) {
            addCriterion("singelPrice <", value, "singelprice");
            return (Criteria) this;
        }

        public Criteria andSingelpriceLessThanOrEqualTo(BigDecimal value) {
            addCriterion("singelPrice <=", value, "singelprice");
            return (Criteria) this;
        }

        public Criteria andSingelpriceIn(List<BigDecimal> values) {
            addCriterion("singelPrice in", values, "singelprice");
            return (Criteria) this;
        }

        public Criteria andSingelpriceNotIn(List<BigDecimal> values) {
            addCriterion("singelPrice not in", values, "singelprice");
            return (Criteria) this;
        }

        public Criteria andSingelpriceBetween(BigDecimal value1, BigDecimal value2) {
            addCriterion("singelPrice between", value1, value2, "singelprice");
            return (Criteria) this;
        }

        public Criteria andSingelpriceNotBetween(BigDecimal value1, BigDecimal value2) {
            addCriterion("singelPrice not between", value1, value2, "singelprice");
            return (Criteria) this;
        }

        public Criteria andPriceIsNull() {
            addCriterion("price is null");
            return (Criteria) this;
        }

        public Criteria andPriceIsNotNull() {
            addCriterion("price is not null");
            return (Criteria) this;
        }

        public Criteria andPriceEqualTo(BigDecimal value) {
            addCriterion("price =", value, "price");
            return (Criteria) this;
        }

        public Criteria andPriceNotEqualTo(BigDecimal value) {
            addCriterion("price <>", value, "price");
            return (Criteria) this;
        }

        public Criteria andPriceGreaterThan(BigDecimal value) {
            addCriterion("price >", value, "price");
            return (Criteria) this;
        }

        public Criteria andPriceGreaterThanOrEqualTo(BigDecimal value) {
            addCriterion("price >=", value, "price");
            return (Criteria) this;
        }

        public Criteria andPriceLessThan(BigDecimal value) {
            addCriterion("price <", value, "price");
            return (Criteria) this;
        }

        public Criteria andPriceLessThanOrEqualTo(BigDecimal value) {
            addCriterion("price <=", value, "price");
            return (Criteria) this;
        }

        public Criteria andPriceIn(List<BigDecimal> values) {
            addCriterion("price in", values, "price");
            return (Criteria) this;
        }

        public Criteria andPriceNotIn(List<BigDecimal> values) {
            addCriterion("price not in", values, "price");
            return (Criteria) this;
        }

        public Criteria andPriceBetween(BigDecimal value1, BigDecimal value2) {
            addCriterion("price between", value1, value2, "price");
            return (Criteria) this;
        }

        public Criteria andPriceNotBetween(BigDecimal value1, BigDecimal value2) {
            addCriterion("price not between", value1, value2, "price");
            return (Criteria) this;
        }

        public Criteria andBargainpriceIsNull() {
            addCriterion("bargainPrice is null");
            return (Criteria) this;
        }

        public Criteria andBargainpriceIsNotNull() {
            addCriterion("bargainPrice is not null");
            return (Criteria) this;
        }

        public Criteria andBargainpriceEqualTo(BigDecimal value) {
            addCriterion("bargainPrice =", value, "bargainprice");
            return (Criteria) this;
        }

        public Criteria andBargainpriceNotEqualTo(BigDecimal value) {
            addCriterion("bargainPrice <>", value, "bargainprice");
            return (Criteria) this;
        }

        public Criteria andBargainpriceGreaterThan(BigDecimal value) {
            addCriterion("bargainPrice >", value, "bargainprice");
            return (Criteria) this;
        }

        public Criteria andBargainpriceGreaterThanOrEqualTo(BigDecimal value) {
            addCriterion("bargainPrice >=", value, "bargainprice");
            return (Criteria) this;
        }

        public Criteria andBargainpriceLessThan(BigDecimal value) {
            addCriterion("bargainPrice <", value, "bargainprice");
            return (Criteria) this;
        }

        public Criteria andBargainpriceLessThanOrEqualTo(BigDecimal value) {
            addCriterion("bargainPrice <=", value, "bargainprice");
            return (Criteria) this;
        }

        public Criteria andBargainpriceIn(List<BigDecimal> values) {
            addCriterion("bargainPrice in", values, "bargainprice");
            return (Criteria) this;
        }

        public Criteria andBargainpriceNotIn(List<BigDecimal> values) {
            addCriterion("bargainPrice not in", values, "bargainprice");
            return (Criteria) this;
        }

        public Criteria andBargainpriceBetween(BigDecimal value1, BigDecimal value2) {
            addCriterion("bargainPrice between", value1, value2, "bargainprice");
            return (Criteria) this;
        }

        public Criteria andBargainpriceNotBetween(BigDecimal value1, BigDecimal value2) {
            addCriterion("bargainPrice not between", value1, value2, "bargainprice");
            return (Criteria) this;
        }

        public Criteria andManufacturerIsNull() {
            addCriterion("manufacturer is null");
            return (Criteria) this;
        }

        public Criteria andManufacturerIsNotNull() {
            addCriterion("manufacturer is not null");
            return (Criteria) this;
        }

        public Criteria andManufacturerEqualTo(String value) {
            addCriterion("manufacturer =", value, "manufacturer");
            return (Criteria) this;
        }

        public Criteria andManufacturerNotEqualTo(String value) {
            addCriterion("manufacturer <>", value, "manufacturer");
            return (Criteria) this;
        }

        public Criteria andManufacturerGreaterThan(String value) {
            addCriterion("manufacturer >", value, "manufacturer");
            return (Criteria) this;
        }

        public Criteria andManufacturerGreaterThanOrEqualTo(String value) {
            addCriterion("manufacturer >=", value, "manufacturer");
            return (Criteria) this;
        }

        public Criteria andManufacturerLessThan(String value) {
            addCriterion("manufacturer <", value, "manufacturer");
            return (Criteria) this;
        }

        public Criteria andManufacturerLessThanOrEqualTo(String value) {
            addCriterion("manufacturer <=", value, "manufacturer");
            return (Criteria) this;
        }

        public Criteria andManufacturerLike(String value) {
            addCriterion("manufacturer like", value, "manufacturer");
            return (Criteria) this;
        }

        public Criteria andManufacturerNotLike(String value) {
            addCriterion("manufacturer not like", value, "manufacturer");
            return (Criteria) this;
        }

        public Criteria andManufacturerIn(List<String> values) {
            addCriterion("manufacturer in", values, "manufacturer");
            return (Criteria) this;
        }

        public Criteria andManufacturerNotIn(List<String> values) {
            addCriterion("manufacturer not in", values, "manufacturer");
            return (Criteria) this;
        }

        public Criteria andManufacturerBetween(String value1, String value2) {
            addCriterion("manufacturer between", value1, value2, "manufacturer");
            return (Criteria) this;
        }

        public Criteria andManufacturerNotBetween(String value1, String value2) {
            addCriterion("manufacturer not between", value1, value2, "manufacturer");
            return (Criteria) this;
        }

        public Criteria andDrugremarksIsNull() {
            addCriterion("drugRemarks is null");
            return (Criteria) this;
        }

        public Criteria andDrugremarksIsNotNull() {
            addCriterion("drugRemarks is not null");
            return (Criteria) this;
        }

        public Criteria andDrugremarksEqualTo(String value) {
            addCriterion("drugRemarks =", value, "drugremarks");
            return (Criteria) this;
        }

        public Criteria andDrugremarksNotEqualTo(String value) {
            addCriterion("drugRemarks <>", value, "drugremarks");
            return (Criteria) this;
        }

        public Criteria andDrugremarksGreaterThan(String value) {
            addCriterion("drugRemarks >", value, "drugremarks");
            return (Criteria) this;
        }

        public Criteria andDrugremarksGreaterThanOrEqualTo(String value) {
            addCriterion("drugRemarks >=", value, "drugremarks");
            return (Criteria) this;
        }

        public Criteria andDrugremarksLessThan(String value) {
            addCriterion("drugRemarks <", value, "drugremarks");
            return (Criteria) this;
        }

        public Criteria andDrugremarksLessThanOrEqualTo(String value) {
            addCriterion("drugRemarks <=", value, "drugremarks");
            return (Criteria) this;
        }

        public Criteria andDrugremarksLike(String value) {
            addCriterion("drugRemarks like", value, "drugremarks");
            return (Criteria) this;
        }

        public Criteria andDrugremarksNotLike(String value) {
            addCriterion("drugRemarks not like", value, "drugremarks");
            return (Criteria) this;
        }

        public Criteria andDrugremarksIn(List<String> values) {
            addCriterion("drugRemarks in", values, "drugremarks");
            return (Criteria) this;
        }

        public Criteria andDrugremarksNotIn(List<String> values) {
            addCriterion("drugRemarks not in", values, "drugremarks");
            return (Criteria) this;
        }

        public Criteria andDrugremarksBetween(String value1, String value2) {
            addCriterion("drugRemarks between", value1, value2, "drugremarks");
            return (Criteria) this;
        }

        public Criteria andDrugremarksNotBetween(String value1, String value2) {
            addCriterion("drugRemarks not between", value1, value2, "drugremarks");
            return (Criteria) this;
        }

        public Criteria andIsephedrineIsNull() {
            addCriterion("isEphedrine is null");
            return (Criteria) this;
        }

        public Criteria andIsephedrineIsNotNull() {
            addCriterion("isEphedrine is not null");
            return (Criteria) this;
        }

        public Criteria andIsephedrineEqualTo(Byte value) {
            addCriterion("isEphedrine =", value, "isephedrine");
            return (Criteria) this;
        }

        public Criteria andIsephedrineNotEqualTo(Byte value) {
            addCriterion("isEphedrine <>", value, "isephedrine");
            return (Criteria) this;
        }

        public Criteria andIsephedrineGreaterThan(Byte value) {
            addCriterion("isEphedrine >", value, "isephedrine");
            return (Criteria) this;
        }

        public Criteria andIsephedrineGreaterThanOrEqualTo(Byte value) {
            addCriterion("isEphedrine >=", value, "isephedrine");
            return (Criteria) this;
        }

        public Criteria andIsephedrineLessThan(Byte value) {
            addCriterion("isEphedrine <", value, "isephedrine");
            return (Criteria) this;
        }

        public Criteria andIsephedrineLessThanOrEqualTo(Byte value) {
            addCriterion("isEphedrine <=", value, "isephedrine");
            return (Criteria) this;
        }

        public Criteria andIsephedrineIn(List<Byte> values) {
            addCriterion("isEphedrine in", values, "isephedrine");
            return (Criteria) this;
        }

        public Criteria andIsephedrineNotIn(List<Byte> values) {
            addCriterion("isEphedrine not in", values, "isephedrine");
            return (Criteria) this;
        }

        public Criteria andIsephedrineBetween(Byte value1, Byte value2) {
            addCriterion("isEphedrine between", value1, value2, "isephedrine");
            return (Criteria) this;
        }

        public Criteria andIsephedrineNotBetween(Byte value1, Byte value2) {
            addCriterion("isEphedrine not between", value1, value2, "isephedrine");
            return (Criteria) this;
        }

        public Criteria andSupervisionIsNull() {
            addCriterion("supervision is null");
            return (Criteria) this;
        }

        public Criteria andSupervisionIsNotNull() {
            addCriterion("supervision is not null");
            return (Criteria) this;
        }

        public Criteria andSupervisionEqualTo(Byte value) {
            addCriterion("supervision =", value, "supervision");
            return (Criteria) this;
        }

        public Criteria andSupervisionNotEqualTo(Byte value) {
            addCriterion("supervision <>", value, "supervision");
            return (Criteria) this;
        }

        public Criteria andSupervisionGreaterThan(Byte value) {
            addCriterion("supervision >", value, "supervision");
            return (Criteria) this;
        }

        public Criteria andSupervisionGreaterThanOrEqualTo(Byte value) {
            addCriterion("supervision >=", value, "supervision");
            return (Criteria) this;
        }

        public Criteria andSupervisionLessThan(Byte value) {
            addCriterion("supervision <", value, "supervision");
            return (Criteria) this;
        }

        public Criteria andSupervisionLessThanOrEqualTo(Byte value) {
            addCriterion("supervision <=", value, "supervision");
            return (Criteria) this;
        }

        public Criteria andSupervisionIn(List<Byte> values) {
            addCriterion("supervision in", values, "supervision");
            return (Criteria) this;
        }

        public Criteria andSupervisionNotIn(List<Byte> values) {
            addCriterion("supervision not in", values, "supervision");
            return (Criteria) this;
        }

        public Criteria andSupervisionBetween(Byte value1, Byte value2) {
            addCriterion("supervision between", value1, value2, "supervision");
            return (Criteria) this;
        }

        public Criteria andSupervisionNotBetween(Byte value1, Byte value2) {
            addCriterion("supervision not between", value1, value2, "supervision");
            return (Criteria) this;
        }

        public Criteria andDisableIsNull() {
            addCriterion("disable is null");
            return (Criteria) this;
        }

        public Criteria andDisableIsNotNull() {
            addCriterion("disable is not null");
            return (Criteria) this;
        }

        public Criteria andDisableEqualTo(Byte value) {
            addCriterion("disable =", value, "disable");
            return (Criteria) this;
        }

        public Criteria andDisableNotEqualTo(Byte value) {
            addCriterion("disable <>", value, "disable");
            return (Criteria) this;
        }

        public Criteria andDisableGreaterThan(Byte value) {
            addCriterion("disable >", value, "disable");
            return (Criteria) this;
        }

        public Criteria andDisableGreaterThanOrEqualTo(Byte value) {
            addCriterion("disable >=", value, "disable");
            return (Criteria) this;
        }

        public Criteria andDisableLessThan(Byte value) {
            addCriterion("disable <", value, "disable");
            return (Criteria) this;
        }

        public Criteria andDisableLessThanOrEqualTo(Byte value) {
            addCriterion("disable <=", value, "disable");
            return (Criteria) this;
        }

        public Criteria andDisableIn(List<Byte> values) {
            addCriterion("disable in", values, "disable");
            return (Criteria) this;
        }

        public Criteria andDisableNotIn(List<Byte> values) {
            addCriterion("disable not in", values, "disable");
            return (Criteria) this;
        }

        public Criteria andDisableBetween(Byte value1, Byte value2) {
            addCriterion("disable between", value1, value2, "disable");
            return (Criteria) this;
        }

        public Criteria andDisableNotBetween(Byte value1, Byte value2) {
            addCriterion("disable not between", value1, value2, "disable");
            return (Criteria) this;
        }
    }

    public static class Criteria extends GeneratedCriteria {

        protected Criteria() {
            super();
        }
    }

    public static class Criterion {
        private String condition;

        private Object value;

        private Object secondValue;

        private boolean noValue;

        private boolean singleValue;

        private boolean betweenValue;

        private boolean listValue;

        private String typeHandler;

        public String getCondition() {
            return condition;
        }

        public Object getValue() {
            return value;
        }

        public Object getSecondValue() {
            return secondValue;
        }

        public boolean isNoValue() {
            return noValue;
        }

        public boolean isSingleValue() {
            return singleValue;
        }

        public boolean isBetweenValue() {
            return betweenValue;
        }

        public boolean isListValue() {
            return listValue;
        }

        public String getTypeHandler() {
            return typeHandler;
        }

        protected Criterion(String condition) {
            super();
            this.condition = condition;
            this.typeHandler = null;
            this.noValue = true;
        }

        protected Criterion(String condition, Object value, String typeHandler) {
            super();
            this.condition = condition;
            this.value = value;
            this.typeHandler = typeHandler;
            if (value instanceof List<?>) {
                this.listValue = true;
            } else {
                this.singleValue = true;
            }
        }

        protected Criterion(String condition, Object value) {
            this(condition, value, null);
        }

        protected Criterion(String condition, Object value, Object secondValue, String typeHandler) {
            super();
            this.condition = condition;
            this.value = value;
            this.secondValue = secondValue;
            this.typeHandler = typeHandler;
            this.betweenValue = true;
        }

        protected Criterion(String condition, Object value, Object secondValue) {
            this(condition, value, secondValue, null);
        }
    }
}