package com.domain;

import java.util.ArrayList;
import java.util.Date;
import java.util.Iterator;
import java.util.List;

public class ReportExample {
    protected String orderByClause;

    protected boolean distinct;

    protected List<Criteria> oredCriteria;

    public ReportExample() {
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

        public Criteria andRidIsNull() {
            addCriterion("rId is null");
            return (Criteria) this;
        }

        public Criteria andRidIsNotNull() {
            addCriterion("rId is not null");
            return (Criteria) this;
        }

        public Criteria andRidEqualTo(String value) {
            addCriterion("rId =", value, "rid");
            return (Criteria) this;
        }

        public Criteria andRidNotEqualTo(String value) {
            addCriterion("rId <>", value, "rid");
            return (Criteria) this;
        }

        public Criteria andRidGreaterThan(String value) {
            addCriterion("rId >", value, "rid");
            return (Criteria) this;
        }

        public Criteria andRidGreaterThanOrEqualTo(String value) {
            addCriterion("rId >=", value, "rid");
            return (Criteria) this;
        }

        public Criteria andRidLessThan(String value) {
            addCriterion("rId <", value, "rid");
            return (Criteria) this;
        }

        public Criteria andRidLessThanOrEqualTo(String value) {
            addCriterion("rId <=", value, "rid");
            return (Criteria) this;
        }

        public Criteria andRidLike(String value) {
            addCriterion("rId like", value, "rid");
            return (Criteria) this;
        }

        public Criteria andRidNotLike(String value) {
            addCriterion("rId not like", value, "rid");
            return (Criteria) this;
        }

        public Criteria andRidIn(List<String> values) {
            addCriterion("rId in", values, "rid");
            return (Criteria) this;
        }

        public Criteria andRidNotIn(List<String> values) {
            addCriterion("rId not in", values, "rid");
            return (Criteria) this;
        }

        public Criteria andRidBetween(String value1, String value2) {
            addCriterion("rId between", value1, value2, "rid");
            return (Criteria) this;
        }

        public Criteria andRidNotBetween(String value1, String value2) {
            addCriterion("rId not between", value1, value2, "rid");
            return (Criteria) this;
        }

        public Criteria andRtypeIsNull() {
            addCriterion("rType is null");
            return (Criteria) this;
        }

        public Criteria andRtypeIsNotNull() {
            addCriterion("rType is not null");
            return (Criteria) this;
        }

        public Criteria andRtypeEqualTo(Integer value) {
            addCriterion("rType =", value, "rtype");
            return (Criteria) this;
        }

        public Criteria andRtypeNotEqualTo(Integer value) {
            addCriterion("rType <>", value, "rtype");
            return (Criteria) this;
        }

        public Criteria andRtypeGreaterThan(Integer value) {
            addCriterion("rType >", value, "rtype");
            return (Criteria) this;
        }

        public Criteria andRtypeGreaterThanOrEqualTo(Integer value) {
            addCriterion("rType >=", value, "rtype");
            return (Criteria) this;
        }

        public Criteria andRtypeLessThan(Integer value) {
            addCriterion("rType <", value, "rtype");
            return (Criteria) this;
        }

        public Criteria andRtypeLessThanOrEqualTo(Integer value) {
            addCriterion("rType <=", value, "rtype");
            return (Criteria) this;
        }

        public Criteria andRtypeIn(List<Integer> values) {
            addCriterion("rType in", values, "rtype");
            return (Criteria) this;
        }

        public Criteria andRtypeNotIn(List<Integer> values) {
            addCriterion("rType not in", values, "rtype");
            return (Criteria) this;
        }

        public Criteria andRtypeBetween(Integer value1, Integer value2) {
            addCriterion("rType between", value1, value2, "rtype");
            return (Criteria) this;
        }

        public Criteria andRtypeNotBetween(Integer value1, Integer value2) {
            addCriterion("rType not between", value1, value2, "rtype");
            return (Criteria) this;
        }

        public Criteria andDateIsNull() {
            addCriterion("date is null");
            return (Criteria) this;
        }

        public Criteria andDateIsNotNull() {
            addCriterion("date is not null");
            return (Criteria) this;
        }

        public Criteria andDateEqualTo(Date value) {
            addCriterionForJDBCDate("date =", value, "date");
            return (Criteria) this;
        }

        public Criteria andDateNotEqualTo(Date value) {
            addCriterionForJDBCDate("date <>", value, "date");
            return (Criteria) this;
        }

        public Criteria andDateGreaterThan(Date value) {
            addCriterionForJDBCDate("date >", value, "date");
            return (Criteria) this;
        }

        public Criteria andDateGreaterThanOrEqualTo(Date value) {
            addCriterionForJDBCDate("date >=", value, "date");
            return (Criteria) this;
        }

        public Criteria andDateLessThan(Date value) {
            addCriterionForJDBCDate("date <", value, "date");
            return (Criteria) this;
        }

        public Criteria andDateLessThanOrEqualTo(Date value) {
            addCriterionForJDBCDate("date <=", value, "date");
            return (Criteria) this;
        }

        public Criteria andDateIn(List<Date> values) {
            addCriterionForJDBCDate("date in", values, "date");
            return (Criteria) this;
        }

        public Criteria andDateNotIn(List<Date> values) {
            addCriterionForJDBCDate("date not in", values, "date");
            return (Criteria) this;
        }

        public Criteria andDateBetween(Date value1, Date value2) {
            addCriterionForJDBCDate("date between", value1, value2, "date");
            return (Criteria) this;
        }

        public Criteria andDateNotBetween(Date value1, Date value2) {
            addCriterionForJDBCDate("date not between", value1, value2, "date");
            return (Criteria) this;
        }

        public Criteria andWidIsNull() {
            addCriterion("wid is null");
            return (Criteria) this;
        }

        public Criteria andWidIsNotNull() {
            addCriterion("wid is not null");
            return (Criteria) this;
        }

        public Criteria andWidEqualTo(String value) {
            addCriterion("wid =", value, "wid");
            return (Criteria) this;
        }

        public Criteria andWidNotEqualTo(String value) {
            addCriterion("wid <>", value, "wid");
            return (Criteria) this;
        }

        public Criteria andWidGreaterThan(String value) {
            addCriterion("wid >", value, "wid");
            return (Criteria) this;
        }

        public Criteria andWidGreaterThanOrEqualTo(String value) {
            addCriterion("wid >=", value, "wid");
            return (Criteria) this;
        }

        public Criteria andWidLessThan(String value) {
            addCriterion("wid <", value, "wid");
            return (Criteria) this;
        }

        public Criteria andWidLessThanOrEqualTo(String value) {
            addCriterion("wid <=", value, "wid");
            return (Criteria) this;
        }

        public Criteria andWidLike(String value) {
            addCriterion("wid like", value, "wid");
            return (Criteria) this;
        }

        public Criteria andWidNotLike(String value) {
            addCriterion("wid not like", value, "wid");
            return (Criteria) this;
        }

        public Criteria andWidIn(List<String> values) {
            addCriterion("wid in", values, "wid");
            return (Criteria) this;
        }

        public Criteria andWidNotIn(List<String> values) {
            addCriterion("wid not in", values, "wid");
            return (Criteria) this;
        }

        public Criteria andWidBetween(String value1, String value2) {
            addCriterion("wid between", value1, value2, "wid");
            return (Criteria) this;
        }

        public Criteria andWidNotBetween(String value1, String value2) {
            addCriterion("wid not between", value1, value2, "wid");
            return (Criteria) this;
        }

        public Criteria andSfidIsNull() {
            addCriterion("sfid is null");
            return (Criteria) this;
        }

        public Criteria andSfidIsNotNull() {
            addCriterion("sfid is not null");
            return (Criteria) this;
        }

        public Criteria andSfidEqualTo(String value) {
            addCriterion("sfid =", value, "sfid");
            return (Criteria) this;
        }

        public Criteria andSfidNotEqualTo(String value) {
            addCriterion("sfid <>", value, "sfid");
            return (Criteria) this;
        }

        public Criteria andSfidGreaterThan(String value) {
            addCriterion("sfid >", value, "sfid");
            return (Criteria) this;
        }

        public Criteria andSfidGreaterThanOrEqualTo(String value) {
            addCriterion("sfid >=", value, "sfid");
            return (Criteria) this;
        }

        public Criteria andSfidLessThan(String value) {
            addCriterion("sfid <", value, "sfid");
            return (Criteria) this;
        }

        public Criteria andSfidLessThanOrEqualTo(String value) {
            addCriterion("sfid <=", value, "sfid");
            return (Criteria) this;
        }

        public Criteria andSfidLike(String value) {
            addCriterion("sfid like", value, "sfid");
            return (Criteria) this;
        }

        public Criteria andSfidNotLike(String value) {
            addCriterion("sfid not like", value, "sfid");
            return (Criteria) this;
        }

        public Criteria andSfidIn(List<String> values) {
            addCriterion("sfid in", values, "sfid");
            return (Criteria) this;
        }

        public Criteria andSfidNotIn(List<String> values) {
            addCriterion("sfid not in", values, "sfid");
            return (Criteria) this;
        }

        public Criteria andSfidBetween(String value1, String value2) {
            addCriterion("sfid between", value1, value2, "sfid");
            return (Criteria) this;
        }

        public Criteria andSfidNotBetween(String value1, String value2) {
            addCriterion("sfid not between", value1, value2, "sfid");
            return (Criteria) this;
        }

        public Criteria andMarkIsNull() {
            addCriterion("mark is null");
            return (Criteria) this;
        }

        public Criteria andMarkIsNotNull() {
            addCriterion("mark is not null");
            return (Criteria) this;
        }

        public Criteria andMarkEqualTo(String value) {
            addCriterion("mark =", value, "mark");
            return (Criteria) this;
        }

        public Criteria andMarkNotEqualTo(String value) {
            addCriterion("mark <>", value, "mark");
            return (Criteria) this;
        }

        public Criteria andMarkGreaterThan(String value) {
            addCriterion("mark >", value, "mark");
            return (Criteria) this;
        }

        public Criteria andMarkGreaterThanOrEqualTo(String value) {
            addCriterion("mark >=", value, "mark");
            return (Criteria) this;
        }

        public Criteria andMarkLessThan(String value) {
            addCriterion("mark <", value, "mark");
            return (Criteria) this;
        }

        public Criteria andMarkLessThanOrEqualTo(String value) {
            addCriterion("mark <=", value, "mark");
            return (Criteria) this;
        }

        public Criteria andMarkLike(String value) {
            addCriterion("mark like", value, "mark");
            return (Criteria) this;
        }

        public Criteria andMarkNotLike(String value) {
            addCriterion("mark not like", value, "mark");
            return (Criteria) this;
        }

        public Criteria andMarkIn(List<String> values) {
            addCriterion("mark in", values, "mark");
            return (Criteria) this;
        }

        public Criteria andMarkNotIn(List<String> values) {
            addCriterion("mark not in", values, "mark");
            return (Criteria) this;
        }

        public Criteria andMarkBetween(String value1, String value2) {
            addCriterion("mark between", value1, value2, "mark");
            return (Criteria) this;
        }

        public Criteria andMarkNotBetween(String value1, String value2) {
            addCriterion("mark not between", value1, value2, "mark");
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