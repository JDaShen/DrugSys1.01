package com.domain;

import java.util.ArrayList;
import java.util.List;

public class SupplierExample {
    protected String orderByClause;

    protected boolean distinct;

    protected List<Criteria> oredCriteria;
    
   
    

 

	public SupplierExample() {
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

        public Criteria andSplidIsNull() {
            addCriterion("splId is null");
            return (Criteria) this;
        }

        public Criteria andSplidIsNotNull() {
            addCriterion("splId is not null");
            return (Criteria) this;
        }

        public Criteria andSplidEqualTo(String value) {
            addCriterion("splId =", value, "splid");
            return (Criteria) this;
        }

        public Criteria andSplidNotEqualTo(String value) {
            addCriterion("splId <>", value, "splid");
            return (Criteria) this;
        }

        public Criteria andSplidGreaterThan(String value) {
            addCriterion("splId >", value, "splid");
            return (Criteria) this;
        }

        public Criteria andSplidGreaterThanOrEqualTo(String value) {
            addCriterion("splId >=", value, "splid");
            return (Criteria) this;
        }

        public Criteria andSplidLessThan(String value) {
            addCriterion("splId <", value, "splid");
            return (Criteria) this;
        }

        public Criteria andSplidLessThanOrEqualTo(String value) {
            addCriterion("splId <=", value, "splid");
            return (Criteria) this;
        }

        public Criteria andSplidLike(String value) {
            addCriterion("splId like", value, "splid");
            return (Criteria) this;
        }

        public Criteria andSplidNotLike(String value) {
            addCriterion("splId not like", value, "splid");
            return (Criteria) this;
        }

        public Criteria andSplidIn(List<String> values) {
            addCriterion("splId in", values, "splid");
            return (Criteria) this;
        }

        public Criteria andSplidNotIn(List<String> values) {
            addCriterion("splId not in", values, "splid");
            return (Criteria) this;
        }

        public Criteria andSplidBetween(String value1, String value2) {
            addCriterion("splId between", value1, value2, "splid");
            return (Criteria) this;
        }

        public Criteria andSplidNotBetween(String value1, String value2) {
            addCriterion("splId not between", value1, value2, "splid");
            return (Criteria) this;
        }

        public Criteria andSplnameIsNull() {
            addCriterion("splName is null");
            return (Criteria) this;
        }

        public Criteria andSplnameIsNotNull() {
            addCriterion("splName is not null");
            return (Criteria) this;
        }

        public Criteria andSplnameEqualTo(String value) {
            addCriterion("splName =", value, "splname");
            return (Criteria) this;
        }

        public Criteria andSplnameNotEqualTo(String value) {
            addCriterion("splName <>", value, "splname");
            return (Criteria) this;
        }

        public Criteria andSplnameGreaterThan(String value) {
            addCriterion("splName >", value, "splname");
            return (Criteria) this;
        }

        public Criteria andSplnameGreaterThanOrEqualTo(String value) {
            addCriterion("splName >=", value, "splname");
            return (Criteria) this;
        }

        public Criteria andSplnameLessThan(String value) {
            addCriterion("splName <", value, "splname");
            return (Criteria) this;
        }

        public Criteria andSplnameLessThanOrEqualTo(String value) {
            addCriterion("splName <=", value, "splname");
            return (Criteria) this;
        }

        public Criteria andSplnameLike(String value) {
            addCriterion("splName like", value, "splname");
            return (Criteria) this;
        }

        public Criteria andSplnameNotLike(String value) {
            addCriterion("splName not like", value, "splname");
            return (Criteria) this;
        }

        public Criteria andSplnameIn(List<String> values) {
            addCriterion("splName in", values, "splname");
            return (Criteria) this;
        }

        public Criteria andSplnameNotIn(List<String> values) {
            addCriterion("splName not in", values, "splname");
            return (Criteria) this;
        }

        public Criteria andSplnameBetween(String value1, String value2) {
            addCriterion("splName between", value1, value2, "splname");
            return (Criteria) this;
        }

        public Criteria andSplnameNotBetween(String value1, String value2) {
            addCriterion("splName not between", value1, value2, "splname");
            return (Criteria) this;
        }

        public Criteria andContactIsNull() {
            addCriterion("contact is null");
            return (Criteria) this;
        }

        public Criteria andContactIsNotNull() {
            addCriterion("contact is not null");
            return (Criteria) this;
        }

        public Criteria andContactEqualTo(String value) {
            addCriterion("contact =", value, "contact");
            return (Criteria) this;
        }

        public Criteria andContactNotEqualTo(String value) {
            addCriterion("contact <>", value, "contact");
            return (Criteria) this;
        }

        public Criteria andContactGreaterThan(String value) {
            addCriterion("contact >", value, "contact");
            return (Criteria) this;
        }

        public Criteria andContactGreaterThanOrEqualTo(String value) {
            addCriterion("contact >=", value, "contact");
            return (Criteria) this;
        }

        public Criteria andContactLessThan(String value) {
            addCriterion("contact <", value, "contact");
            return (Criteria) this;
        }

        public Criteria andContactLessThanOrEqualTo(String value) {
            addCriterion("contact <=", value, "contact");
            return (Criteria) this;
        }

        public Criteria andContactLike(String value) {
            addCriterion("contact like", value, "contact");
            return (Criteria) this;
        }

        public Criteria andContactNotLike(String value) {
            addCriterion("contact not like", value, "contact");
            return (Criteria) this;
        }

        public Criteria andContactIn(List<String> values) {
            addCriterion("contact in", values, "contact");
            return (Criteria) this;
        }

        public Criteria andContactNotIn(List<String> values) {
            addCriterion("contact not in", values, "contact");
            return (Criteria) this;
        }

        public Criteria andContactBetween(String value1, String value2) {
            addCriterion("contact between", value1, value2, "contact");
            return (Criteria) this;
        }

        public Criteria andContactNotBetween(String value1, String value2) {
            addCriterion("contact not between", value1, value2, "contact");
            return (Criteria) this;
        }

        public Criteria andSplphonenoIsNull() {
            addCriterion("splPhoneNo is null");
            return (Criteria) this;
        }

        public Criteria andSplphonenoIsNotNull() {
            addCriterion("splPhoneNo is not null");
            return (Criteria) this;
        }

        public Criteria andSplphonenoEqualTo(String value) {
            addCriterion("splPhoneNo =", value, "splphoneno");
            return (Criteria) this;
        }

        public Criteria andSplphonenoNotEqualTo(String value) {
            addCriterion("splPhoneNo <>", value, "splphoneno");
            return (Criteria) this;
        }

        public Criteria andSplphonenoGreaterThan(String value) {
            addCriterion("splPhoneNo >", value, "splphoneno");
            return (Criteria) this;
        }

        public Criteria andSplphonenoGreaterThanOrEqualTo(String value) {
            addCriterion("splPhoneNo >=", value, "splphoneno");
            return (Criteria) this;
        }

        public Criteria andSplphonenoLessThan(String value) {
            addCriterion("splPhoneNo <", value, "splphoneno");
            return (Criteria) this;
        }

        public Criteria andSplphonenoLessThanOrEqualTo(String value) {
            addCriterion("splPhoneNo <=", value, "splphoneno");
            return (Criteria) this;
        }

        public Criteria andSplphonenoLike(String value) {
            addCriterion("splPhoneNo like", value, "splphoneno");
            return (Criteria) this;
        }

        public Criteria andSplphonenoNotLike(String value) {
            addCriterion("splPhoneNo not like", value, "splphoneno");
            return (Criteria) this;
        }

        public Criteria andSplphonenoIn(List<String> values) {
            addCriterion("splPhoneNo in", values, "splphoneno");
            return (Criteria) this;
        }

        public Criteria andSplphonenoNotIn(List<String> values) {
            addCriterion("splPhoneNo not in", values, "splphoneno");
            return (Criteria) this;
        }

        public Criteria andSplphonenoBetween(String value1, String value2) {
            addCriterion("splPhoneNo between", value1, value2, "splphoneno");
            return (Criteria) this;
        }

        public Criteria andSplphonenoNotBetween(String value1, String value2) {
            addCriterion("splPhoneNo not between", value1, value2, "splphoneno");
            return (Criteria) this;
        }

        public Criteria andSpladdressIsNull() {
            addCriterion("splAddress is null");
            return (Criteria) this;
        }

        public Criteria andSpladdressIsNotNull() {
            addCriterion("splAddress is not null");
            return (Criteria) this;
        }

        public Criteria andSpladdressEqualTo(String value) {
            addCriterion("splAddress =", value, "spladdress");
            return (Criteria) this;
        }

        public Criteria andSpladdressNotEqualTo(String value) {
            addCriterion("splAddress <>", value, "spladdress");
            return (Criteria) this;
        }

        public Criteria andSpladdressGreaterThan(String value) {
            addCriterion("splAddress >", value, "spladdress");
            return (Criteria) this;
        }

        public Criteria andSpladdressGreaterThanOrEqualTo(String value) {
            addCriterion("splAddress >=", value, "spladdress");
            return (Criteria) this;
        }

        public Criteria andSpladdressLessThan(String value) {
            addCriterion("splAddress <", value, "spladdress");
            return (Criteria) this;
        }

        public Criteria andSpladdressLessThanOrEqualTo(String value) {
            addCriterion("splAddress <=", value, "spladdress");
            return (Criteria) this;
        }

        public Criteria andSpladdressLike(String value) {
            addCriterion("splAddress like", value, "spladdress");
            return (Criteria) this;
        }

        public Criteria andSpladdressNotLike(String value) {
            addCriterion("splAddress not like", value, "spladdress");
            return (Criteria) this;
        }

        public Criteria andSpladdressIn(List<String> values) {
            addCriterion("splAddress in", values, "spladdress");
            return (Criteria) this;
        }

        public Criteria andSpladdressNotIn(List<String> values) {
            addCriterion("splAddress not in", values, "spladdress");
            return (Criteria) this;
        }

        public Criteria andSpladdressBetween(String value1, String value2) {
            addCriterion("splAddress between", value1, value2, "spladdress");
            return (Criteria) this;
        }

        public Criteria andSpladdressNotBetween(String value1, String value2) {
            addCriterion("splAddress not between", value1, value2, "spladdress");
            return (Criteria) this;
        }

        public Criteria andSpltypeIsNull() {
            addCriterion("spltype is null");
            return (Criteria) this;
        }

        public Criteria andSpltypeIsNotNull() {
            addCriterion("spltype is not null");
            return (Criteria) this;
        }

        public Criteria andSpltypeEqualTo(String value) {
            addCriterion("spltype =", value, "spltype");
            return (Criteria) this;
        }

        public Criteria andSpltypeNotEqualTo(String value) {
            addCriterion("spltype <>", value, "spltype");
            return (Criteria) this;
        }

        public Criteria andSpltypeGreaterThan(String value) {
            addCriterion("spltype >", value, "spltype");
            return (Criteria) this;
        }

        public Criteria andSpltypeGreaterThanOrEqualTo(String value) {
            addCriterion("spltype >=", value, "spltype");
            return (Criteria) this;
        }

        public Criteria andSpltypeLessThan(String value) {
            addCriterion("spltype <", value, "spltype");
            return (Criteria) this;
        }

        public Criteria andSpltypeLessThanOrEqualTo(String value) {
            addCriterion("spltype <=", value, "spltype");
            return (Criteria) this;
        }

        public Criteria andSpltypeLike(String value) {
            addCriterion("spltype like", value, "spltype");
            return (Criteria) this;
        }

        public Criteria andSpltypeNotLike(String value) {
            addCriterion("spltype not like", value, "spltype");
            return (Criteria) this;
        }

        public Criteria andSpltypeIn(List<String> values) {
            addCriterion("spltype in", values, "spltype");
            return (Criteria) this;
        }

        public Criteria andSpltypeNotIn(List<String> values) {
            addCriterion("spltype not in", values, "spltype");
            return (Criteria) this;
        }

        public Criteria andSpltypeBetween(String value1, String value2) {
            addCriterion("spltype between", value1, value2, "spltype");
            return (Criteria) this;
        }

        public Criteria andSpltypeNotBetween(String value1, String value2) {
            addCriterion("spltype not between", value1, value2, "spltype");
            return (Criteria) this;
        }

        public Criteria andRegionIsNull() {
            addCriterion("region is null");
            return (Criteria) this;
        }

        public Criteria andRegionIsNotNull() {
            addCriterion("region is not null");
            return (Criteria) this;
        }

        public Criteria andRegionEqualTo(String value) {
            addCriterion("region =", value, "region");
            return (Criteria) this;
        }

        public Criteria andRegionNotEqualTo(String value) {
            addCriterion("region <>", value, "region");
            return (Criteria) this;
        }

        public Criteria andRegionGreaterThan(String value) {
            addCriterion("region >", value, "region");
            return (Criteria) this;
        }

        public Criteria andRegionGreaterThanOrEqualTo(String value) {
            addCriterion("region >=", value, "region");
            return (Criteria) this;
        }

        public Criteria andRegionLessThan(String value) {
            addCriterion("region <", value, "region");
            return (Criteria) this;
        }

        public Criteria andRegionLessThanOrEqualTo(String value) {
            addCriterion("region <=", value, "region");
            return (Criteria) this;
        }

        public Criteria andRegionLike(String value) {
            addCriterion("region like", value, "region");
            return (Criteria) this;
        }

        public Criteria andRegionNotLike(String value) {
            addCriterion("region not like", value, "region");
            return (Criteria) this;
        }

        public Criteria andRegionIn(List<String> values) {
            addCriterion("region in", values, "region");
            return (Criteria) this;
        }

        public Criteria andRegionNotIn(List<String> values) {
            addCriterion("region not in", values, "region");
            return (Criteria) this;
        }

        public Criteria andRegionBetween(String value1, String value2) {
            addCriterion("region between", value1, value2, "region");
            return (Criteria) this;
        }

        public Criteria andRegionNotBetween(String value1, String value2) {
            addCriterion("region not between", value1, value2, "region");
            return (Criteria) this;
        }

        public Criteria andIsdefaultIsNull() {
            addCriterion("isDefault is null");
            return (Criteria) this;
        }

        public Criteria andIsdefaultIsNotNull() {
            addCriterion("isDefault is not null");
            return (Criteria) this;
        }

        public Criteria andIsdefaultEqualTo(Byte value) {
            addCriterion("isDefault =", value, "isdefault");
            return (Criteria) this;
        }

        public Criteria andIsdefaultNotEqualTo(Byte value) {
            addCriterion("isDefault <>", value, "isdefault");
            return (Criteria) this;
        }

        public Criteria andIsdefaultGreaterThan(Byte value) {
            addCriterion("isDefault >", value, "isdefault");
            return (Criteria) this;
        }

        public Criteria andIsdefaultGreaterThanOrEqualTo(Byte value) {
            addCriterion("isDefault >=", value, "isdefault");
            return (Criteria) this;
        }

        public Criteria andIsdefaultLessThan(Byte value) {
            addCriterion("isDefault <", value, "isdefault");
            return (Criteria) this;
        }

        public Criteria andIsdefaultLessThanOrEqualTo(Byte value) {
            addCriterion("isDefault <=", value, "isdefault");
            return (Criteria) this;
        }

        public Criteria andIsdefaultIn(List<Byte> values) {
            addCriterion("isDefault in", values, "isdefault");
            return (Criteria) this;
        }

        public Criteria andIsdefaultNotIn(List<Byte> values) {
            addCriterion("isDefault not in", values, "isdefault");
            return (Criteria) this;
        }

        public Criteria andIsdefaultBetween(Byte value1, Byte value2) {
            addCriterion("isDefault between", value1, value2, "isdefault");
            return (Criteria) this;
        }

        public Criteria andIsdefaultNotBetween(Byte value1, Byte value2) {
            addCriterion("isDefault not between", value1, value2, "isdefault");
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