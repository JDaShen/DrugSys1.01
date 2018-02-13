package com.domain;

import java.math.BigDecimal;
import java.util.ArrayList;
import java.util.Date;
import java.util.Iterator;
import java.util.List;

public class StaffExample {
    protected String orderByClause;

    protected boolean distinct;

    protected List<Criteria> oredCriteria;

    public StaffExample() {
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

        protected void addCriterionForJDBCDate(String condition, Date value, String property) {
            if (value == null) {
                throw new RuntimeException("Value for " + property + " cannot be null");
            }
            addCriterion(condition, new java.sql.Date(value.getTime()), property);
        }

        protected void addCriterionForJDBCDate(String condition, List<Date> values, String property) {
            if (values == null || values.size() == 0) {
                throw new RuntimeException("Value list for " + property + " cannot be null or empty");
            }
            List<java.sql.Date> dateList = new ArrayList<java.sql.Date>();
            Iterator<Date> iter = values.iterator();
            while (iter.hasNext()) {
                dateList.add(new java.sql.Date(iter.next().getTime()));
            }
            addCriterion(condition, dateList, property);
        }

        protected void addCriterionForJDBCDate(String condition, Date value1, Date value2, String property) {
            if (value1 == null || value2 == null) {
                throw new RuntimeException("Between values for " + property + " cannot be null");
            }
            addCriterion(condition, new java.sql.Date(value1.getTime()), new java.sql.Date(value2.getTime()), property);
        }

        public Criteria andSfidIsNull() {
            addCriterion("sfId is null");
            return (Criteria) this;
        }

        public Criteria andSfidIsNotNull() {
            addCriterion("sfId is not null");
            return (Criteria) this;
        }

        public Criteria andSfidEqualTo(String value) {
            addCriterion("sfId =", value, "sfid");
            return (Criteria) this;
        }

        public Criteria andSfidNotEqualTo(String value) {
            addCriterion("sfId <>", value, "sfid");
            return (Criteria) this;
        }

        public Criteria andSfidGreaterThan(String value) {
            addCriterion("sfId >", value, "sfid");
            return (Criteria) this;
        }

        public Criteria andSfidGreaterThanOrEqualTo(String value) {
            addCriterion("sfId >=", value, "sfid");
            return (Criteria) this;
        }

        public Criteria andSfidLessThan(String value) {
            addCriterion("sfId <", value, "sfid");
            return (Criteria) this;
        }

        public Criteria andSfidLessThanOrEqualTo(String value) {
            addCriterion("sfId <=", value, "sfid");
            return (Criteria) this;
        }

        public Criteria andSfidLike(String value) {
            addCriterion("sfId like", value, "sfid");
            return (Criteria) this;
        }

        public Criteria andSfidNotLike(String value) {
            addCriterion("sfId not like", value, "sfid");
            return (Criteria) this;
        }

        public Criteria andSfidIn(List<String> values) {
            addCriterion("sfId in", values, "sfid");
            return (Criteria) this;
        }

        public Criteria andSfidNotIn(List<String> values) {
            addCriterion("sfId not in", values, "sfid");
            return (Criteria) this;
        }

        public Criteria andSfidBetween(String value1, String value2) {
            addCriterion("sfId between", value1, value2, "sfid");
            return (Criteria) this;
        }

        public Criteria andSfidNotBetween(String value1, String value2) {
            addCriterion("sfId not between", value1, value2, "sfid");
            return (Criteria) this;
        }

        public Criteria andJobidIsNull() {
            addCriterion("jobId is null");
            return (Criteria) this;
        }

        public Criteria andJobidIsNotNull() {
            addCriterion("jobId is not null");
            return (Criteria) this;
        }

        public Criteria andJobidEqualTo(String value) {
            addCriterion("jobId =", value, "jobid");
            return (Criteria) this;
        }

        public Criteria andJobidNotEqualTo(String value) {
            addCriterion("jobId <>", value, "jobid");
            return (Criteria) this;
        }

        public Criteria andJobidGreaterThan(String value) {
            addCriterion("jobId >", value, "jobid");
            return (Criteria) this;
        }

        public Criteria andJobidGreaterThanOrEqualTo(String value) {
            addCriterion("jobId >=", value, "jobid");
            return (Criteria) this;
        }

        public Criteria andJobidLessThan(String value) {
            addCriterion("jobId <", value, "jobid");
            return (Criteria) this;
        }

        public Criteria andJobidLessThanOrEqualTo(String value) {
            addCriterion("jobId <=", value, "jobid");
            return (Criteria) this;
        }

        public Criteria andJobidLike(String value) {
            addCriterion("jobId like", value, "jobid");
            return (Criteria) this;
        }

        public Criteria andJobidNotLike(String value) {
            addCriterion("jobId not like", value, "jobid");
            return (Criteria) this;
        }

        public Criteria andJobidIn(List<String> values) {
            addCriterion("jobId in", values, "jobid");
            return (Criteria) this;
        }

        public Criteria andJobidNotIn(List<String> values) {
            addCriterion("jobId not in", values, "jobid");
            return (Criteria) this;
        }

        public Criteria andJobidBetween(String value1, String value2) {
            addCriterion("jobId between", value1, value2, "jobid");
            return (Criteria) this;
        }

        public Criteria andJobidNotBetween(String value1, String value2) {
            addCriterion("jobId not between", value1, value2, "jobid");
            return (Criteria) this;
        }

        public Criteria andSfnameIsNull() {
            addCriterion("sfName is null");
            return (Criteria) this;
        }

        public Criteria andSfnameIsNotNull() {
            addCriterion("sfName is not null");
            return (Criteria) this;
        }

        public Criteria andSfnameEqualTo(String value) {
            addCriterion("sfName =", value, "sfname");
            return (Criteria) this;
        }

        public Criteria andSfnameNotEqualTo(String value) {
            addCriterion("sfName <>", value, "sfname");
            return (Criteria) this;
        }

        public Criteria andSfnameGreaterThan(String value) {
            addCriterion("sfName >", value, "sfname");
            return (Criteria) this;
        }

        public Criteria andSfnameGreaterThanOrEqualTo(String value) {
            addCriterion("sfName >=", value, "sfname");
            return (Criteria) this;
        }

        public Criteria andSfnameLessThan(String value) {
            addCriterion("sfName <", value, "sfname");
            return (Criteria) this;
        }

        public Criteria andSfnameLessThanOrEqualTo(String value) {
            addCriterion("sfName <=", value, "sfname");
            return (Criteria) this;
        }

        public Criteria andSfnameLike(String value) {
            addCriterion("sfName like", value, "sfname");
            return (Criteria) this;
        }

        public Criteria andSfnameNotLike(String value) {
            addCriterion("sfName not like", value, "sfname");
            return (Criteria) this;
        }

        public Criteria andSfnameIn(List<String> values) {
            addCriterion("sfName in", values, "sfname");
            return (Criteria) this;
        }

        public Criteria andSfnameNotIn(List<String> values) {
            addCriterion("sfName not in", values, "sfname");
            return (Criteria) this;
        }

        public Criteria andSfnameBetween(String value1, String value2) {
            addCriterion("sfName between", value1, value2, "sfname");
            return (Criteria) this;
        }

        public Criteria andSfnameNotBetween(String value1, String value2) {
            addCriterion("sfName not between", value1, value2, "sfname");
            return (Criteria) this;
        }

        public Criteria andSalaryIsNull() {
            addCriterion("salary is null");
            return (Criteria) this;
        }

        public Criteria andSalaryIsNotNull() {
            addCriterion("salary is not null");
            return (Criteria) this;
        }

        public Criteria andSalaryEqualTo(BigDecimal value) {
            addCriterion("salary =", value, "salary");
            return (Criteria) this;
        }

        public Criteria andSalaryNotEqualTo(BigDecimal value) {
            addCriterion("salary <>", value, "salary");
            return (Criteria) this;
        }

        public Criteria andSalaryGreaterThan(BigDecimal value) {
            addCriterion("salary >", value, "salary");
            return (Criteria) this;
        }

        public Criteria andSalaryGreaterThanOrEqualTo(BigDecimal value) {
            addCriterion("salary >=", value, "salary");
            return (Criteria) this;
        }

        public Criteria andSalaryLessThan(BigDecimal value) {
            addCriterion("salary <", value, "salary");
            return (Criteria) this;
        }

        public Criteria andSalaryLessThanOrEqualTo(BigDecimal value) {
            addCriterion("salary <=", value, "salary");
            return (Criteria) this;
        }

        public Criteria andSalaryIn(List<BigDecimal> values) {
            addCriterion("salary in", values, "salary");
            return (Criteria) this;
        }

        public Criteria andSalaryNotIn(List<BigDecimal> values) {
            addCriterion("salary not in", values, "salary");
            return (Criteria) this;
        }

        public Criteria andSalaryBetween(BigDecimal value1, BigDecimal value2) {
            addCriterion("salary between", value1, value2, "salary");
            return (Criteria) this;
        }

        public Criteria andSalaryNotBetween(BigDecimal value1, BigDecimal value2) {
            addCriterion("salary not between", value1, value2, "salary");
            return (Criteria) this;
        }

        public Criteria andBirthdayIsNull() {
            addCriterion("birthday is null");
            return (Criteria) this;
        }

        public Criteria andBirthdayIsNotNull() {
            addCriterion("birthday is not null");
            return (Criteria) this;
        }

        public Criteria andBirthdayEqualTo(Date value) {
            addCriterionForJDBCDate("birthday =", value, "birthday");
            return (Criteria) this;
        }

        public Criteria andBirthdayNotEqualTo(Date value) {
            addCriterionForJDBCDate("birthday <>", value, "birthday");
            return (Criteria) this;
        }

        public Criteria andBirthdayGreaterThan(Date value) {
            addCriterionForJDBCDate("birthday >", value, "birthday");
            return (Criteria) this;
        }

        public Criteria andBirthdayGreaterThanOrEqualTo(Date value) {
            addCriterionForJDBCDate("birthday >=", value, "birthday");
            return (Criteria) this;
        }

        public Criteria andBirthdayLessThan(Date value) {
            addCriterionForJDBCDate("birthday <", value, "birthday");
            return (Criteria) this;
        }

        public Criteria andBirthdayLessThanOrEqualTo(Date value) {
            addCriterionForJDBCDate("birthday <=", value, "birthday");
            return (Criteria) this;
        }

        public Criteria andBirthdayIn(List<Date> values) {
            addCriterionForJDBCDate("birthday in", values, "birthday");
            return (Criteria) this;
        }

        public Criteria andBirthdayNotIn(List<Date> values) {
            addCriterionForJDBCDate("birthday not in", values, "birthday");
            return (Criteria) this;
        }

        public Criteria andBirthdayBetween(Date value1, Date value2) {
            addCriterionForJDBCDate("birthday between", value1, value2, "birthday");
            return (Criteria) this;
        }

        public Criteria andBirthdayNotBetween(Date value1, Date value2) {
            addCriterionForJDBCDate("birthday not between", value1, value2, "birthday");
            return (Criteria) this;
        }

        public Criteria andSfphonenoIsNull() {
            addCriterion("sfPhoneNo is null");
            return (Criteria) this;
        }

        public Criteria andSfphonenoIsNotNull() {
            addCriterion("sfPhoneNo is not null");
            return (Criteria) this;
        }

        public Criteria andSfphonenoEqualTo(String value) {
            addCriterion("sfPhoneNo =", value, "sfphoneno");
            return (Criteria) this;
        }

        public Criteria andSfphonenoNotEqualTo(String value) {
            addCriterion("sfPhoneNo <>", value, "sfphoneno");
            return (Criteria) this;
        }

        public Criteria andSfphonenoGreaterThan(String value) {
            addCriterion("sfPhoneNo >", value, "sfphoneno");
            return (Criteria) this;
        }

        public Criteria andSfphonenoGreaterThanOrEqualTo(String value) {
            addCriterion("sfPhoneNo >=", value, "sfphoneno");
            return (Criteria) this;
        }

        public Criteria andSfphonenoLessThan(String value) {
            addCriterion("sfPhoneNo <", value, "sfphoneno");
            return (Criteria) this;
        }

        public Criteria andSfphonenoLessThanOrEqualTo(String value) {
            addCriterion("sfPhoneNo <=", value, "sfphoneno");
            return (Criteria) this;
        }

        public Criteria andSfphonenoLike(String value) {
            addCriterion("sfPhoneNo like", value, "sfphoneno");
            return (Criteria) this;
        }

        public Criteria andSfphonenoNotLike(String value) {
            addCriterion("sfPhoneNo not like", value, "sfphoneno");
            return (Criteria) this;
        }

        public Criteria andSfphonenoIn(List<String> values) {
            addCriterion("sfPhoneNo in", values, "sfphoneno");
            return (Criteria) this;
        }

        public Criteria andSfphonenoNotIn(List<String> values) {
            addCriterion("sfPhoneNo not in", values, "sfphoneno");
            return (Criteria) this;
        }

        public Criteria andSfphonenoBetween(String value1, String value2) {
            addCriterion("sfPhoneNo between", value1, value2, "sfphoneno");
            return (Criteria) this;
        }

        public Criteria andSfphonenoNotBetween(String value1, String value2) {
            addCriterion("sfPhoneNo not between", value1, value2, "sfphoneno");
            return (Criteria) this;
        }

        public Criteria andSfaddressIsNull() {
            addCriterion("sfAddress is null");
            return (Criteria) this;
        }

        public Criteria andSfaddressIsNotNull() {
            addCriterion("sfAddress is not null");
            return (Criteria) this;
        }

        public Criteria andSfaddressEqualTo(String value) {
            addCriterion("sfAddress =", value, "sfaddress");
            return (Criteria) this;
        }

        public Criteria andSfaddressNotEqualTo(String value) {
            addCriterion("sfAddress <>", value, "sfaddress");
            return (Criteria) this;
        }

        public Criteria andSfaddressGreaterThan(String value) {
            addCriterion("sfAddress >", value, "sfaddress");
            return (Criteria) this;
        }

        public Criteria andSfaddressGreaterThanOrEqualTo(String value) {
            addCriterion("sfAddress >=", value, "sfaddress");
            return (Criteria) this;
        }

        public Criteria andSfaddressLessThan(String value) {
            addCriterion("sfAddress <", value, "sfaddress");
            return (Criteria) this;
        }

        public Criteria andSfaddressLessThanOrEqualTo(String value) {
            addCriterion("sfAddress <=", value, "sfaddress");
            return (Criteria) this;
        }

        public Criteria andSfaddressLike(String value) {
            addCriterion("sfAddress like", value, "sfaddress");
            return (Criteria) this;
        }

        public Criteria andSfaddressNotLike(String value) {
            addCriterion("sfAddress not like", value, "sfaddress");
            return (Criteria) this;
        }

        public Criteria andSfaddressIn(List<String> values) {
            addCriterion("sfAddress in", values, "sfaddress");
            return (Criteria) this;
        }

        public Criteria andSfaddressNotIn(List<String> values) {
            addCriterion("sfAddress not in", values, "sfaddress");
            return (Criteria) this;
        }

        public Criteria andSfaddressBetween(String value1, String value2) {
            addCriterion("sfAddress between", value1, value2, "sfaddress");
            return (Criteria) this;
        }

        public Criteria andSfaddressNotBetween(String value1, String value2) {
            addCriterion("sfAddress not between", value1, value2, "sfaddress");
            return (Criteria) this;
        }

        public Criteria andSfstateIsNull() {
            addCriterion("sfState is null");
            return (Criteria) this;
        }

        public Criteria andSfstateIsNotNull() {
            addCriterion("sfState is not null");
            return (Criteria) this;
        }

        public Criteria andSfstateEqualTo(Integer value) {
            addCriterion("sfState =", value, "sfstate");
            return (Criteria) this;
        }

        public Criteria andSfstateNotEqualTo(Integer value) {
            addCriterion("sfState <>", value, "sfstate");
            return (Criteria) this;
        }

        public Criteria andSfstateGreaterThan(Integer value) {
            addCriterion("sfState >", value, "sfstate");
            return (Criteria) this;
        }

        public Criteria andSfstateGreaterThanOrEqualTo(Integer value) {
            addCriterion("sfState >=", value, "sfstate");
            return (Criteria) this;
        }

        public Criteria andSfstateLessThan(Integer value) {
            addCriterion("sfState <", value, "sfstate");
            return (Criteria) this;
        }

        public Criteria andSfstateLessThanOrEqualTo(Integer value) {
            addCriterion("sfState <=", value, "sfstate");
            return (Criteria) this;
        }

        public Criteria andSfstateIn(List<Integer> values) {
            addCriterion("sfState in", values, "sfstate");
            return (Criteria) this;
        }

        public Criteria andSfstateNotIn(List<Integer> values) {
            addCriterion("sfState not in", values, "sfstate");
            return (Criteria) this;
        }

        public Criteria andSfstateBetween(Integer value1, Integer value2) {
            addCriterion("sfState between", value1, value2, "sfstate");
            return (Criteria) this;
        }

        public Criteria andSfstateNotBetween(Integer value1, Integer value2) {
            addCriterion("sfState not between", value1, value2, "sfstate");
            return (Criteria) this;
        }

        public Criteria andSfremarksIsNull() {
            addCriterion("sfRemarks is null");
            return (Criteria) this;
        }

        public Criteria andSfremarksIsNotNull() {
            addCriterion("sfRemarks is not null");
            return (Criteria) this;
        }

        public Criteria andSfremarksEqualTo(String value) {
            addCriterion("sfRemarks =", value, "sfremarks");
            return (Criteria) this;
        }

        public Criteria andSfremarksNotEqualTo(String value) {
            addCriterion("sfRemarks <>", value, "sfremarks");
            return (Criteria) this;
        }

        public Criteria andSfremarksGreaterThan(String value) {
            addCriterion("sfRemarks >", value, "sfremarks");
            return (Criteria) this;
        }

        public Criteria andSfremarksGreaterThanOrEqualTo(String value) {
            addCriterion("sfRemarks >=", value, "sfremarks");
            return (Criteria) this;
        }

        public Criteria andSfremarksLessThan(String value) {
            addCriterion("sfRemarks <", value, "sfremarks");
            return (Criteria) this;
        }

        public Criteria andSfremarksLessThanOrEqualTo(String value) {
            addCriterion("sfRemarks <=", value, "sfremarks");
            return (Criteria) this;
        }

        public Criteria andSfremarksLike(String value) {
            addCriterion("sfRemarks like", value, "sfremarks");
            return (Criteria) this;
        }

        public Criteria andSfremarksNotLike(String value) {
            addCriterion("sfRemarks not like", value, "sfremarks");
            return (Criteria) this;
        }

        public Criteria andSfremarksIn(List<String> values) {
            addCriterion("sfRemarks in", values, "sfremarks");
            return (Criteria) this;
        }

        public Criteria andSfremarksNotIn(List<String> values) {
            addCriterion("sfRemarks not in", values, "sfremarks");
            return (Criteria) this;
        }

        public Criteria andSfremarksBetween(String value1, String value2) {
            addCriterion("sfRemarks between", value1, value2, "sfremarks");
            return (Criteria) this;
        }

        public Criteria andSfremarksNotBetween(String value1, String value2) {
            addCriterion("sfRemarks not between", value1, value2, "sfremarks");
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