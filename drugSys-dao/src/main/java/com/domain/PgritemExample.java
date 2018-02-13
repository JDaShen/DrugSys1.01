package com.domain;

import java.util.ArrayList;
import java.util.Date;
import java.util.Iterator;
import java.util.List;

public class PgritemExample {
    protected String orderByClause;

    protected boolean distinct;

    protected List<Criteria> oredCriteria;

    public PgritemExample() {
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

        public Criteria andPgritemidIsNull() {
            addCriterion("\" pgrItemId\" is null");
            return (Criteria) this;
        }

        public Criteria andPgritemidIsNotNull() {
            addCriterion("\" pgrItemId\" is not null");
            return (Criteria) this;
        }

        public Criteria andPgritemidEqualTo(String value) {
            addCriterion("\" pgrItemId\" =", value, "pgritemid");
            return (Criteria) this;
        }

        public Criteria andPgritemidNotEqualTo(String value) {
            addCriterion("\" pgrItemId\" <>", value, "pgritemid");
            return (Criteria) this;
        }

        public Criteria andPgritemidGreaterThan(String value) {
            addCriterion("\" pgrItemId\" >", value, "pgritemid");
            return (Criteria) this;
        }

        public Criteria andPgritemidGreaterThanOrEqualTo(String value) {
            addCriterion("\" pgrItemId\" >=", value, "pgritemid");
            return (Criteria) this;
        }

        public Criteria andPgritemidLessThan(String value) {
            addCriterion("\" pgrItemId\" <", value, "pgritemid");
            return (Criteria) this;
        }

        public Criteria andPgritemidLessThanOrEqualTo(String value) {
            addCriterion("\" pgrItemId\" <=", value, "pgritemid");
            return (Criteria) this;
        }

        public Criteria andPgritemidLike(String value) {
            addCriterion("\" pgrItemId\" like", value, "pgritemid");
            return (Criteria) this;
        }

        public Criteria andPgritemidNotLike(String value) {
            addCriterion("\" pgrItemId\" not like", value, "pgritemid");
            return (Criteria) this;
        }

        public Criteria andPgritemidIn(List<String> values) {
            addCriterion("\" pgrItemId\" in", values, "pgritemid");
            return (Criteria) this;
        }

        public Criteria andPgritemidNotIn(List<String> values) {
            addCriterion("\" pgrItemId\" not in", values, "pgritemid");
            return (Criteria) this;
        }

        public Criteria andPgritemidBetween(String value1, String value2) {
            addCriterion("\" pgrItemId\" between", value1, value2, "pgritemid");
            return (Criteria) this;
        }

        public Criteria andPgritemidNotBetween(String value1, String value2) {
            addCriterion("\" pgrItemId\" not between", value1, value2, "pgritemid");
            return (Criteria) this;
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

        public Criteria andAmountIsNull() {
            addCriterion("amount is null");
            return (Criteria) this;
        }

        public Criteria andAmountIsNotNull() {
            addCriterion("amount is not null");
            return (Criteria) this;
        }

        public Criteria andAmountEqualTo(Integer value) {
            addCriterion("amount =", value, "amount");
            return (Criteria) this;
        }

        public Criteria andAmountNotEqualTo(Integer value) {
            addCriterion("amount <>", value, "amount");
            return (Criteria) this;
        }

        public Criteria andAmountGreaterThan(Integer value) {
            addCriterion("amount >", value, "amount");
            return (Criteria) this;
        }

        public Criteria andAmountGreaterThanOrEqualTo(Integer value) {
            addCriterion("amount >=", value, "amount");
            return (Criteria) this;
        }

        public Criteria andAmountLessThan(Integer value) {
            addCriterion("amount <", value, "amount");
            return (Criteria) this;
        }

        public Criteria andAmountLessThanOrEqualTo(Integer value) {
            addCriterion("amount <=", value, "amount");
            return (Criteria) this;
        }

        public Criteria andAmountIn(List<Integer> values) {
            addCriterion("amount in", values, "amount");
            return (Criteria) this;
        }

        public Criteria andAmountNotIn(List<Integer> values) {
            addCriterion("amount not in", values, "amount");
            return (Criteria) this;
        }

        public Criteria andAmountBetween(Integer value1, Integer value2) {
            addCriterion("amount between", value1, value2, "amount");
            return (Criteria) this;
        }

        public Criteria andAmountNotBetween(Integer value1, Integer value2) {
            addCriterion("amount not between", value1, value2, "amount");
            return (Criteria) this;
        }

        public Criteria andBatchIsNull() {
            addCriterion("batch is null");
            return (Criteria) this;
        }

        public Criteria andBatchIsNotNull() {
            addCriterion("batch is not null");
            return (Criteria) this;
        }

        public Criteria andBatchEqualTo(String value) {
            addCriterion("batch =", value, "batch");
            return (Criteria) this;
        }

        public Criteria andBatchNotEqualTo(String value) {
            addCriterion("batch <>", value, "batch");
            return (Criteria) this;
        }

        public Criteria andBatchGreaterThan(String value) {
            addCriterion("batch >", value, "batch");
            return (Criteria) this;
        }

        public Criteria andBatchGreaterThanOrEqualTo(String value) {
            addCriterion("batch >=", value, "batch");
            return (Criteria) this;
        }

        public Criteria andBatchLessThan(String value) {
            addCriterion("batch <", value, "batch");
            return (Criteria) this;
        }

        public Criteria andBatchLessThanOrEqualTo(String value) {
            addCriterion("batch <=", value, "batch");
            return (Criteria) this;
        }

        public Criteria andBatchLike(String value) {
            addCriterion("batch like", value, "batch");
            return (Criteria) this;
        }

        public Criteria andBatchNotLike(String value) {
            addCriterion("batch not like", value, "batch");
            return (Criteria) this;
        }

        public Criteria andBatchIn(List<String> values) {
            addCriterion("batch in", values, "batch");
            return (Criteria) this;
        }

        public Criteria andBatchNotIn(List<String> values) {
            addCriterion("batch not in", values, "batch");
            return (Criteria) this;
        }

        public Criteria andBatchBetween(String value1, String value2) {
            addCriterion("batch between", value1, value2, "batch");
            return (Criteria) this;
        }

        public Criteria andBatchNotBetween(String value1, String value2) {
            addCriterion("batch not between", value1, value2, "batch");
            return (Criteria) this;
        }

        public Criteria andExpireIsNull() {
            addCriterion("expire is null");
            return (Criteria) this;
        }

        public Criteria andExpireIsNotNull() {
            addCriterion("expire is not null");
            return (Criteria) this;
        }

        public Criteria andExpireEqualTo(Date value) {
            addCriterionForJDBCDate("expire =", value, "expire");
            return (Criteria) this;
        }

        public Criteria andExpireNotEqualTo(Date value) {
            addCriterionForJDBCDate("expire <>", value, "expire");
            return (Criteria) this;
        }

        public Criteria andExpireGreaterThan(Date value) {
            addCriterionForJDBCDate("expire >", value, "expire");
            return (Criteria) this;
        }

        public Criteria andExpireGreaterThanOrEqualTo(Date value) {
            addCriterionForJDBCDate("expire >=", value, "expire");
            return (Criteria) this;
        }

        public Criteria andExpireLessThan(Date value) {
            addCriterionForJDBCDate("expire <", value, "expire");
            return (Criteria) this;
        }

        public Criteria andExpireLessThanOrEqualTo(Date value) {
            addCriterionForJDBCDate("expire <=", value, "expire");
            return (Criteria) this;
        }

        public Criteria andExpireIn(List<Date> values) {
            addCriterionForJDBCDate("expire in", values, "expire");
            return (Criteria) this;
        }

        public Criteria andExpireNotIn(List<Date> values) {
            addCriterionForJDBCDate("expire not in", values, "expire");
            return (Criteria) this;
        }

        public Criteria andExpireBetween(Date value1, Date value2) {
            addCriterionForJDBCDate("expire between", value1, value2, "expire");
            return (Criteria) this;
        }

        public Criteria andExpireNotBetween(Date value1, Date value2) {
            addCriterionForJDBCDate("expire not between", value1, value2, "expire");
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