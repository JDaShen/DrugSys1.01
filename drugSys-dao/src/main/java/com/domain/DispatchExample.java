package com.domain;

import java.util.ArrayList;
import java.util.Date;
import java.util.Iterator;
import java.util.List;

public class DispatchExample {
    protected String orderByClause;

    protected boolean distinct;

    protected List<Criteria> oredCriteria;

    public DispatchExample() {
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

        public Criteria andDispidIsNull() {
            addCriterion("dispId is null");
            return (Criteria) this;
        }

        public Criteria andDispidIsNotNull() {
            addCriterion("dispId is not null");
            return (Criteria) this;
        }

        public Criteria andDispidEqualTo(String value) {
            addCriterion("dispId =", value, "dispid");
            return (Criteria) this;
        }

        public Criteria andDispidNotEqualTo(String value) {
            addCriterion("dispId <>", value, "dispid");
            return (Criteria) this;
        }

        public Criteria andDispidGreaterThan(String value) {
            addCriterion("dispId >", value, "dispid");
            return (Criteria) this;
        }

        public Criteria andDispidGreaterThanOrEqualTo(String value) {
            addCriterion("dispId >=", value, "dispid");
            return (Criteria) this;
        }

        public Criteria andDispidLessThan(String value) {
            addCriterion("dispId <", value, "dispid");
            return (Criteria) this;
        }

        public Criteria andDispidLessThanOrEqualTo(String value) {
            addCriterion("dispId <=", value, "dispid");
            return (Criteria) this;
        }

        public Criteria andDispidLike(String value) {
            addCriterion("dispId like", value, "dispid");
            return (Criteria) this;
        }

        public Criteria andDispidNotLike(String value) {
            addCriterion("dispId not like", value, "dispid");
            return (Criteria) this;
        }

        public Criteria andDispidIn(List<String> values) {
            addCriterion("dispId in", values, "dispid");
            return (Criteria) this;
        }

        public Criteria andDispidNotIn(List<String> values) {
            addCriterion("dispId not in", values, "dispid");
            return (Criteria) this;
        }

        public Criteria andDispidBetween(String value1, String value2) {
            addCriterion("dispId between", value1, value2, "dispid");
            return (Criteria) this;
        }

        public Criteria andDispidNotBetween(String value1, String value2) {
            addCriterion("dispId not between", value1, value2, "dispid");
            return (Criteria) this;
        }

        public Criteria andFromIsNull() {
            addCriterion("from is null");
            return (Criteria) this;
        }

        public Criteria andFromIsNotNull() {
            addCriterion("from is not null");
            return (Criteria) this;
        }

        public Criteria andFromEqualTo(String value) {
            addCriterion("from =", value, "from");
            return (Criteria) this;
        }

        public Criteria andFromNotEqualTo(String value) {
            addCriterion("from <>", value, "from");
            return (Criteria) this;
        }

        public Criteria andFromGreaterThan(String value) {
            addCriterion("from >", value, "from");
            return (Criteria) this;
        }

        public Criteria andFromGreaterThanOrEqualTo(String value) {
            addCriterion("from >=", value, "from");
            return (Criteria) this;
        }

        public Criteria andFromLessThan(String value) {
            addCriterion("from <", value, "from");
            return (Criteria) this;
        }

        public Criteria andFromLessThanOrEqualTo(String value) {
            addCriterion("from <=", value, "from");
            return (Criteria) this;
        }

        public Criteria andFromLike(String value) {
            addCriterion("from like", value, "from");
            return (Criteria) this;
        }

        public Criteria andFromNotLike(String value) {
            addCriterion("from not like", value, "from");
            return (Criteria) this;
        }

        public Criteria andFromIn(List<String> values) {
            addCriterion("from in", values, "from");
            return (Criteria) this;
        }

        public Criteria andFromNotIn(List<String> values) {
            addCriterion("from not in", values, "from");
            return (Criteria) this;
        }

        public Criteria andFromBetween(String value1, String value2) {
            addCriterion("from between", value1, value2, "from");
            return (Criteria) this;
        }

        public Criteria andFromNotBetween(String value1, String value2) {
            addCriterion("from not between", value1, value2, "from");
            return (Criteria) this;
        }

        public Criteria andToIsNull() {
            addCriterion("to is null");
            return (Criteria) this;
        }

        public Criteria andToIsNotNull() {
            addCriterion("to is not null");
            return (Criteria) this;
        }

        public Criteria andToEqualTo(String value) {
            addCriterion("to =", value, "to");
            return (Criteria) this;
        }

        public Criteria andToNotEqualTo(String value) {
            addCriterion("to <>", value, "to");
            return (Criteria) this;
        }

        public Criteria andToGreaterThan(String value) {
            addCriterion("to >", value, "to");
            return (Criteria) this;
        }

        public Criteria andToGreaterThanOrEqualTo(String value) {
            addCriterion("to >=", value, "to");
            return (Criteria) this;
        }

        public Criteria andToLessThan(String value) {
            addCriterion("to <", value, "to");
            return (Criteria) this;
        }

        public Criteria andToLessThanOrEqualTo(String value) {
            addCriterion("to <=", value, "to");
            return (Criteria) this;
        }

        public Criteria andToLike(String value) {
            addCriterion("to like", value, "to");
            return (Criteria) this;
        }

        public Criteria andToNotLike(String value) {
            addCriterion("to not like", value, "to");
            return (Criteria) this;
        }

        public Criteria andToIn(List<String> values) {
            addCriterion("to in", values, "to");
            return (Criteria) this;
        }

        public Criteria andToNotIn(List<String> values) {
            addCriterion("to not in", values, "to");
            return (Criteria) this;
        }

        public Criteria andToBetween(String value1, String value2) {
            addCriterion("to between", value1, value2, "to");
            return (Criteria) this;
        }

        public Criteria andToNotBetween(String value1, String value2) {
            addCriterion("to not between", value1, value2, "to");
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