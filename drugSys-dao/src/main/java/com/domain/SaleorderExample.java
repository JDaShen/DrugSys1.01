package com.domain;

import java.math.BigDecimal;
import java.util.ArrayList;
import java.util.Date;
import java.util.Iterator;
import java.util.List;

public class SaleorderExample {
    protected String orderByClause;

    protected boolean distinct;

    protected List<Criteria> oredCriteria;

    public SaleorderExample() {
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

        public Criteria andTradeidIsNull() {
            addCriterion("tradeId is null");
            return (Criteria) this;
        }

        public Criteria andTradeidIsNotNull() {
            addCriterion("tradeId is not null");
            return (Criteria) this;
        }

        public Criteria andTradeidEqualTo(String value) {
            addCriterion("tradeId =", value, "tradeid");
            return (Criteria) this;
        }

        public Criteria andTradeidNotEqualTo(String value) {
            addCriterion("tradeId <>", value, "tradeid");
            return (Criteria) this;
        }

        public Criteria andTradeidGreaterThan(String value) {
            addCriterion("tradeId >", value, "tradeid");
            return (Criteria) this;
        }

        public Criteria andTradeidGreaterThanOrEqualTo(String value) {
            addCriterion("tradeId >=", value, "tradeid");
            return (Criteria) this;
        }

        public Criteria andTradeidLessThan(String value) {
            addCriterion("tradeId <", value, "tradeid");
            return (Criteria) this;
        }

        public Criteria andTradeidLessThanOrEqualTo(String value) {
            addCriterion("tradeId <=", value, "tradeid");
            return (Criteria) this;
        }

        public Criteria andTradeidLike(String value) {
            addCriterion("tradeId like", value, "tradeid");
            return (Criteria) this;
        }

        public Criteria andTradeidNotLike(String value) {
            addCriterion("tradeId not like", value, "tradeid");
            return (Criteria) this;
        }

        public Criteria andTradeidIn(List<String> values) {
            addCriterion("tradeId in", values, "tradeid");
            return (Criteria) this;
        }

        public Criteria andTradeidNotIn(List<String> values) {
            addCriterion("tradeId not in", values, "tradeid");
            return (Criteria) this;
        }

        public Criteria andTradeidBetween(String value1, String value2) {
            addCriterion("tradeId between", value1, value2, "tradeid");
            return (Criteria) this;
        }

        public Criteria andTradeidNotBetween(String value1, String value2) {
            addCriterion("tradeId not between", value1, value2, "tradeid");
            return (Criteria) this;
        }

        public Criteria andTradetimeIsNull() {
            addCriterion("tradeTime is null");
            return (Criteria) this;
        }

        public Criteria andTradetimeIsNotNull() {
            addCriterion("tradeTime is not null");
            return (Criteria) this;
        }

        public Criteria andTradetimeEqualTo(Date value) {
            addCriterionForJDBCDate("tradeTime =", value, "tradetime");
            return (Criteria) this;
        }

        public Criteria andTradetimeNotEqualTo(Date value) {
            addCriterionForJDBCDate("tradeTime <>", value, "tradetime");
            return (Criteria) this;
        }

        public Criteria andTradetimeGreaterThan(Date value) {
            addCriterionForJDBCDate("tradeTime >", value, "tradetime");
            return (Criteria) this;
        }

        public Criteria andTradetimeGreaterThanOrEqualTo(Date value) {
            addCriterionForJDBCDate("tradeTime >=", value, "tradetime");
            return (Criteria) this;
        }

        public Criteria andTradetimeLessThan(Date value) {
            addCriterionForJDBCDate("tradeTime <", value, "tradetime");
            return (Criteria) this;
        }

        public Criteria andTradetimeLessThanOrEqualTo(Date value) {
            addCriterionForJDBCDate("tradeTime <=", value, "tradetime");
            return (Criteria) this;
        }

        public Criteria andTradetimeIn(List<Date> values) {
            addCriterionForJDBCDate("tradeTime in", values, "tradetime");
            return (Criteria) this;
        }

        public Criteria andTradetimeNotIn(List<Date> values) {
            addCriterionForJDBCDate("tradeTime not in", values, "tradetime");
            return (Criteria) this;
        }

        public Criteria andTradetimeBetween(Date value1, Date value2) {
            addCriterionForJDBCDate("tradeTime between", value1, value2, "tradetime");
            return (Criteria) this;
        }

        public Criteria andTradetimeNotBetween(Date value1, Date value2) {
            addCriterionForJDBCDate("tradeTime not between", value1, value2, "tradetime");
            return (Criteria) this;
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

        public Criteria andTotalIsNull() {
            addCriterion("total is null");
            return (Criteria) this;
        }

        public Criteria andTotalIsNotNull() {
            addCriterion("total is not null");
            return (Criteria) this;
        }

        public Criteria andTotalEqualTo(BigDecimal value) {
            addCriterion("total =", value, "total");
            return (Criteria) this;
        }

        public Criteria andTotalNotEqualTo(BigDecimal value) {
            addCriterion("total <>", value, "total");
            return (Criteria) this;
        }

        public Criteria andTotalGreaterThan(BigDecimal value) {
            addCriterion("total >", value, "total");
            return (Criteria) this;
        }

        public Criteria andTotalGreaterThanOrEqualTo(BigDecimal value) {
            addCriterion("total >=", value, "total");
            return (Criteria) this;
        }

        public Criteria andTotalLessThan(BigDecimal value) {
            addCriterion("total <", value, "total");
            return (Criteria) this;
        }

        public Criteria andTotalLessThanOrEqualTo(BigDecimal value) {
            addCriterion("total <=", value, "total");
            return (Criteria) this;
        }

        public Criteria andTotalIn(List<BigDecimal> values) {
            addCriterion("total in", values, "total");
            return (Criteria) this;
        }

        public Criteria andTotalNotIn(List<BigDecimal> values) {
            addCriterion("total not in", values, "total");
            return (Criteria) this;
        }

        public Criteria andTotalBetween(BigDecimal value1, BigDecimal value2) {
            addCriterion("total between", value1, value2, "total");
            return (Criteria) this;
        }

        public Criteria andTotalNotBetween(BigDecimal value1, BigDecimal value2) {
            addCriterion("total not between", value1, value2, "total");
            return (Criteria) this;
        }

        public Criteria andTradetypeIsNull() {
            addCriterion("tradeType is null");
            return (Criteria) this;
        }

        public Criteria andTradetypeIsNotNull() {
            addCriterion("tradeType is not null");
            return (Criteria) this;
        }

        public Criteria andTradetypeEqualTo(Integer value) {
            addCriterion("tradeType =", value, "tradetype");
            return (Criteria) this;
        }

        public Criteria andTradetypeNotEqualTo(Integer value) {
            addCriterion("tradeType <>", value, "tradetype");
            return (Criteria) this;
        }

        public Criteria andTradetypeGreaterThan(Integer value) {
            addCriterion("tradeType >", value, "tradetype");
            return (Criteria) this;
        }

        public Criteria andTradetypeGreaterThanOrEqualTo(Integer value) {
            addCriterion("tradeType >=", value, "tradetype");
            return (Criteria) this;
        }

        public Criteria andTradetypeLessThan(Integer value) {
            addCriterion("tradeType <", value, "tradetype");
            return (Criteria) this;
        }

        public Criteria andTradetypeLessThanOrEqualTo(Integer value) {
            addCriterion("tradeType <=", value, "tradetype");
            return (Criteria) this;
        }

        public Criteria andTradetypeIn(List<Integer> values) {
            addCriterion("tradeType in", values, "tradetype");
            return (Criteria) this;
        }

        public Criteria andTradetypeNotIn(List<Integer> values) {
            addCriterion("tradeType not in", values, "tradetype");
            return (Criteria) this;
        }

        public Criteria andTradetypeBetween(Integer value1, Integer value2) {
            addCriterion("tradeType between", value1, value2, "tradetype");
            return (Criteria) this;
        }

        public Criteria andTradetypeNotBetween(Integer value1, Integer value2) {
            addCriterion("tradeType not between", value1, value2, "tradetype");
            return (Criteria) this;
        }

        public Criteria andWidIsNull() {
            addCriterion("wId is null");
            return (Criteria) this;
        }

        public Criteria andWidIsNotNull() {
            addCriterion("wId is not null");
            return (Criteria) this;
        }

        public Criteria andWidEqualTo(String value) {
            addCriterion("wId =", value, "wid");
            return (Criteria) this;
        }

        public Criteria andWidNotEqualTo(String value) {
            addCriterion("wId <>", value, "wid");
            return (Criteria) this;
        }

        public Criteria andWidGreaterThan(String value) {
            addCriterion("wId >", value, "wid");
            return (Criteria) this;
        }

        public Criteria andWidGreaterThanOrEqualTo(String value) {
            addCriterion("wId >=", value, "wid");
            return (Criteria) this;
        }

        public Criteria andWidLessThan(String value) {
            addCriterion("wId <", value, "wid");
            return (Criteria) this;
        }

        public Criteria andWidLessThanOrEqualTo(String value) {
            addCriterion("wId <=", value, "wid");
            return (Criteria) this;
        }

        public Criteria andWidLike(String value) {
            addCriterion("wId like", value, "wid");
            return (Criteria) this;
        }

        public Criteria andWidNotLike(String value) {
            addCriterion("wId not like", value, "wid");
            return (Criteria) this;
        }

        public Criteria andWidIn(List<String> values) {
            addCriterion("wId in", values, "wid");
            return (Criteria) this;
        }

        public Criteria andWidNotIn(List<String> values) {
            addCriterion("wId not in", values, "wid");
            return (Criteria) this;
        }

        public Criteria andWidBetween(String value1, String value2) {
            addCriterion("wId between", value1, value2, "wid");
            return (Criteria) this;
        }

        public Criteria andWidNotBetween(String value1, String value2) {
            addCriterion("wId not between", value1, value2, "wid");
            return (Criteria) this;
        }

        public Criteria andCtidIsNull() {
            addCriterion("ctId is null");
            return (Criteria) this;
        }

        public Criteria andCtidIsNotNull() {
            addCriterion("ctId is not null");
            return (Criteria) this;
        }

        public Criteria andCtidEqualTo(String value) {
            addCriterion("ctId =", value, "ctid");
            return (Criteria) this;
        }

        public Criteria andCtidNotEqualTo(String value) {
            addCriterion("ctId <>", value, "ctid");
            return (Criteria) this;
        }

        public Criteria andCtidGreaterThan(String value) {
            addCriterion("ctId >", value, "ctid");
            return (Criteria) this;
        }

        public Criteria andCtidGreaterThanOrEqualTo(String value) {
            addCriterion("ctId >=", value, "ctid");
            return (Criteria) this;
        }

        public Criteria andCtidLessThan(String value) {
            addCriterion("ctId <", value, "ctid");
            return (Criteria) this;
        }

        public Criteria andCtidLessThanOrEqualTo(String value) {
            addCriterion("ctId <=", value, "ctid");
            return (Criteria) this;
        }

        public Criteria andCtidLike(String value) {
            addCriterion("ctId like", value, "ctid");
            return (Criteria) this;
        }

        public Criteria andCtidNotLike(String value) {
            addCriterion("ctId not like", value, "ctid");
            return (Criteria) this;
        }

        public Criteria andCtidIn(List<String> values) {
            addCriterion("ctId in", values, "ctid");
            return (Criteria) this;
        }

        public Criteria andCtidNotIn(List<String> values) {
            addCriterion("ctId not in", values, "ctid");
            return (Criteria) this;
        }

        public Criteria andCtidBetween(String value1, String value2) {
            addCriterion("ctId between", value1, value2, "ctid");
            return (Criteria) this;
        }

        public Criteria andCtidNotBetween(String value1, String value2) {
            addCriterion("ctId not between", value1, value2, "ctid");
            return (Criteria) this;
        }

        public Criteria andIntegralIsNull() {
            addCriterion("integral is null");
            return (Criteria) this;
        }

        public Criteria andIntegralIsNotNull() {
            addCriterion("integral is not null");
            return (Criteria) this;
        }

        public Criteria andIntegralEqualTo(Integer value) {
            addCriterion("integral =", value, "integral");
            return (Criteria) this;
        }

        public Criteria andIntegralNotEqualTo(Integer value) {
            addCriterion("integral <>", value, "integral");
            return (Criteria) this;
        }

        public Criteria andIntegralGreaterThan(Integer value) {
            addCriterion("integral >", value, "integral");
            return (Criteria) this;
        }

        public Criteria andIntegralGreaterThanOrEqualTo(Integer value) {
            addCriterion("integral >=", value, "integral");
            return (Criteria) this;
        }

        public Criteria andIntegralLessThan(Integer value) {
            addCriterion("integral <", value, "integral");
            return (Criteria) this;
        }

        public Criteria andIntegralLessThanOrEqualTo(Integer value) {
            addCriterion("integral <=", value, "integral");
            return (Criteria) this;
        }

        public Criteria andIntegralIn(List<Integer> values) {
            addCriterion("integral in", values, "integral");
            return (Criteria) this;
        }

        public Criteria andIntegralNotIn(List<Integer> values) {
            addCriterion("integral not in", values, "integral");
            return (Criteria) this;
        }

        public Criteria andIntegralBetween(Integer value1, Integer value2) {
            addCriterion("integral between", value1, value2, "integral");
            return (Criteria) this;
        }

        public Criteria andIntegralNotBetween(Integer value1, Integer value2) {
            addCriterion("integral not between", value1, value2, "integral");
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