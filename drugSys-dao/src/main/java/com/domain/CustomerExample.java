package com.domain;

import java.math.BigDecimal;
import java.util.ArrayList;
import java.util.List;

public class CustomerExample {
    protected String orderByClause;

    protected boolean distinct;

    protected List<Criteria> oredCriteria;

    public CustomerExample() {
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

        public Criteria andCtnameIsNull() {
            addCriterion("ctName is null");
            return (Criteria) this;
        }

        public Criteria andCtnameIsNotNull() {
            addCriterion("ctName is not null");
            return (Criteria) this;
        }

        public Criteria andCtnameEqualTo(String value) {
            addCriterion("ctName =", value, "ctname");
            return (Criteria) this;
        }

        public Criteria andCtnameNotEqualTo(String value) {
            addCriterion("ctName <>", value, "ctname");
            return (Criteria) this;
        }

        public Criteria andCtnameGreaterThan(String value) {
            addCriterion("ctName >", value, "ctname");
            return (Criteria) this;
        }

        public Criteria andCtnameGreaterThanOrEqualTo(String value) {
            addCriterion("ctName >=", value, "ctname");
            return (Criteria) this;
        }

        public Criteria andCtnameLessThan(String value) {
            addCriterion("ctName <", value, "ctname");
            return (Criteria) this;
        }

        public Criteria andCtnameLessThanOrEqualTo(String value) {
            addCriterion("ctName <=", value, "ctname");
            return (Criteria) this;
        }

        public Criteria andCtnameLike(String value) {
            addCriterion("ctName like", value, "ctname");
            return (Criteria) this;
        }

        public Criteria andCtnameNotLike(String value) {
            addCriterion("ctName not like", value, "ctname");
            return (Criteria) this;
        }

        public Criteria andCtnameIn(List<String> values) {
            addCriterion("ctName in", values, "ctname");
            return (Criteria) this;
        }

        public Criteria andCtnameNotIn(List<String> values) {
            addCriterion("ctName not in", values, "ctname");
            return (Criteria) this;
        }

        public Criteria andCtnameBetween(String value1, String value2) {
            addCriterion("ctName between", value1, value2, "ctname");
            return (Criteria) this;
        }

        public Criteria andCtnameNotBetween(String value1, String value2) {
            addCriterion("ctName not between", value1, value2, "ctname");
            return (Criteria) this;
        }

        public Criteria andLevelidIsNull() {
            addCriterion("levelId is null");
            return (Criteria) this;
        }

        public Criteria andLevelidIsNotNull() {
            addCriterion("levelId is not null");
            return (Criteria) this;
        }

        public Criteria andLevelidEqualTo(Integer value) {
            addCriterion("levelId =", value, "levelid");
            return (Criteria) this;
        }

        public Criteria andLevelidNotEqualTo(Integer value) {
            addCriterion("levelId <>", value, "levelid");
            return (Criteria) this;
        }

        public Criteria andLevelidGreaterThan(Integer value) {
            addCriterion("levelId >", value, "levelid");
            return (Criteria) this;
        }

        public Criteria andLevelidGreaterThanOrEqualTo(Integer value) {
            addCriterion("levelId >=", value, "levelid");
            return (Criteria) this;
        }

        public Criteria andLevelidLessThan(Integer value) {
            addCriterion("levelId <", value, "levelid");
            return (Criteria) this;
        }

        public Criteria andLevelidLessThanOrEqualTo(Integer value) {
            addCriterion("levelId <=", value, "levelid");
            return (Criteria) this;
        }

        public Criteria andLevelidIn(List<Integer> values) {
            addCriterion("levelId in", values, "levelid");
            return (Criteria) this;
        }

        public Criteria andLevelidNotIn(List<Integer> values) {
            addCriterion("levelId not in", values, "levelid");
            return (Criteria) this;
        }

        public Criteria andLevelidBetween(Integer value1, Integer value2) {
            addCriterion("levelId between", value1, value2, "levelid");
            return (Criteria) this;
        }

        public Criteria andLevelidNotBetween(Integer value1, Integer value2) {
            addCriterion("levelId not between", value1, value2, "levelid");
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

        public Criteria andConsumeIsNull() {
            addCriterion("consume is null");
            return (Criteria) this;
        }

        public Criteria andConsumeIsNotNull() {
            addCriterion("consume is not null");
            return (Criteria) this;
        }

        public Criteria andConsumeEqualTo(BigDecimal value) {
            addCriterion("consume =", value, "consume");
            return (Criteria) this;
        }

        public Criteria andConsumeNotEqualTo(BigDecimal value) {
            addCriterion("consume <>", value, "consume");
            return (Criteria) this;
        }

        public Criteria andConsumeGreaterThan(BigDecimal value) {
            addCriterion("consume >", value, "consume");
            return (Criteria) this;
        }

        public Criteria andConsumeGreaterThanOrEqualTo(BigDecimal value) {
            addCriterion("consume >=", value, "consume");
            return (Criteria) this;
        }

        public Criteria andConsumeLessThan(BigDecimal value) {
            addCriterion("consume <", value, "consume");
            return (Criteria) this;
        }

        public Criteria andConsumeLessThanOrEqualTo(BigDecimal value) {
            addCriterion("consume <=", value, "consume");
            return (Criteria) this;
        }

        public Criteria andConsumeIn(List<BigDecimal> values) {
            addCriterion("consume in", values, "consume");
            return (Criteria) this;
        }

        public Criteria andConsumeNotIn(List<BigDecimal> values) {
            addCriterion("consume not in", values, "consume");
            return (Criteria) this;
        }

        public Criteria andConsumeBetween(BigDecimal value1, BigDecimal value2) {
            addCriterion("consume between", value1, value2, "consume");
            return (Criteria) this;
        }

        public Criteria andConsumeNotBetween(BigDecimal value1, BigDecimal value2) {
            addCriterion("consume not between", value1, value2, "consume");
            return (Criteria) this;
        }

        public Criteria andTimesIsNull() {
            addCriterion("times is null");
            return (Criteria) this;
        }

        public Criteria andTimesIsNotNull() {
            addCriterion("times is not null");
            return (Criteria) this;
        }

        public Criteria andTimesEqualTo(Integer value) {
            addCriterion("times =", value, "times");
            return (Criteria) this;
        }

        public Criteria andTimesNotEqualTo(Integer value) {
            addCriterion("times <>", value, "times");
            return (Criteria) this;
        }

        public Criteria andTimesGreaterThan(Integer value) {
            addCriterion("times >", value, "times");
            return (Criteria) this;
        }

        public Criteria andTimesGreaterThanOrEqualTo(Integer value) {
            addCriterion("times >=", value, "times");
            return (Criteria) this;
        }

        public Criteria andTimesLessThan(Integer value) {
            addCriterion("times <", value, "times");
            return (Criteria) this;
        }

        public Criteria andTimesLessThanOrEqualTo(Integer value) {
            addCriterion("times <=", value, "times");
            return (Criteria) this;
        }

        public Criteria andTimesIn(List<Integer> values) {
            addCriterion("times in", values, "times");
            return (Criteria) this;
        }

        public Criteria andTimesNotIn(List<Integer> values) {
            addCriterion("times not in", values, "times");
            return (Criteria) this;
        }

        public Criteria andTimesBetween(Integer value1, Integer value2) {
            addCriterion("times between", value1, value2, "times");
            return (Criteria) this;
        }

        public Criteria andTimesNotBetween(Integer value1, Integer value2) {
            addCriterion("times not between", value1, value2, "times");
            return (Criteria) this;
        }

        public Criteria andBalanceIsNull() {
            addCriterion("balance is null");
            return (Criteria) this;
        }

        public Criteria andBalanceIsNotNull() {
            addCriterion("balance is not null");
            return (Criteria) this;
        }

        public Criteria andBalanceEqualTo(BigDecimal value) {
            addCriterion("balance =", value, "balance");
            return (Criteria) this;
        }

        public Criteria andBalanceNotEqualTo(BigDecimal value) {
            addCriterion("balance <>", value, "balance");
            return (Criteria) this;
        }

        public Criteria andBalanceGreaterThan(BigDecimal value) {
            addCriterion("balance >", value, "balance");
            return (Criteria) this;
        }

        public Criteria andBalanceGreaterThanOrEqualTo(BigDecimal value) {
            addCriterion("balance >=", value, "balance");
            return (Criteria) this;
        }

        public Criteria andBalanceLessThan(BigDecimal value) {
            addCriterion("balance <", value, "balance");
            return (Criteria) this;
        }

        public Criteria andBalanceLessThanOrEqualTo(BigDecimal value) {
            addCriterion("balance <=", value, "balance");
            return (Criteria) this;
        }

        public Criteria andBalanceIn(List<BigDecimal> values) {
            addCriterion("balance in", values, "balance");
            return (Criteria) this;
        }

        public Criteria andBalanceNotIn(List<BigDecimal> values) {
            addCriterion("balance not in", values, "balance");
            return (Criteria) this;
        }

        public Criteria andBalanceBetween(BigDecimal value1, BigDecimal value2) {
            addCriterion("balance between", value1, value2, "balance");
            return (Criteria) this;
        }

        public Criteria andBalanceNotBetween(BigDecimal value1, BigDecimal value2) {
            addCriterion("balance not between", value1, value2, "balance");
            return (Criteria) this;
        }

        public Criteria andCtstateIsNull() {
            addCriterion("ctState is null");
            return (Criteria) this;
        }

        public Criteria andCtstateIsNotNull() {
            addCriterion("ctState is not null");
            return (Criteria) this;
        }

        public Criteria andCtstateEqualTo(Integer value) {
            addCriterion("ctState =", value, "ctstate");
            return (Criteria) this;
        }

        public Criteria andCtstateNotEqualTo(Integer value) {
            addCriterion("ctState <>", value, "ctstate");
            return (Criteria) this;
        }

        public Criteria andCtstateGreaterThan(Integer value) {
            addCriterion("ctState >", value, "ctstate");
            return (Criteria) this;
        }

        public Criteria andCtstateGreaterThanOrEqualTo(Integer value) {
            addCriterion("ctState >=", value, "ctstate");
            return (Criteria) this;
        }

        public Criteria andCtstateLessThan(Integer value) {
            addCriterion("ctState <", value, "ctstate");
            return (Criteria) this;
        }

        public Criteria andCtstateLessThanOrEqualTo(Integer value) {
            addCriterion("ctState <=", value, "ctstate");
            return (Criteria) this;
        }

        public Criteria andCtstateIn(List<Integer> values) {
            addCriterion("ctState in", values, "ctstate");
            return (Criteria) this;
        }

        public Criteria andCtstateNotIn(List<Integer> values) {
            addCriterion("ctState not in", values, "ctstate");
            return (Criteria) this;
        }

        public Criteria andCtstateBetween(Integer value1, Integer value2) {
            addCriterion("ctState between", value1, value2, "ctstate");
            return (Criteria) this;
        }

        public Criteria andCtstateNotBetween(Integer value1, Integer value2) {
            addCriterion("ctState not between", value1, value2, "ctstate");
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