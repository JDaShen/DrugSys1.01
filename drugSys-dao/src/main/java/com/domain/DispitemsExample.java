package com.domain;

import java.util.ArrayList;
import java.util.List;

public class DispitemsExample {
    protected String orderByClause;

    protected boolean distinct;

    protected List<Criteria> oredCriteria;

    public DispitemsExample() {
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

        public Criteria andDitemidIsNull() {
            addCriterion("ditemID is null");
            return (Criteria) this;
        }

        public Criteria andDitemidIsNotNull() {
            addCriterion("ditemID is not null");
            return (Criteria) this;
        }

        public Criteria andDitemidEqualTo(String value) {
            addCriterion("ditemID =", value, "ditemid");
            return (Criteria) this;
        }

        public Criteria andDitemidNotEqualTo(String value) {
            addCriterion("ditemID <>", value, "ditemid");
            return (Criteria) this;
        }

        public Criteria andDitemidGreaterThan(String value) {
            addCriterion("ditemID >", value, "ditemid");
            return (Criteria) this;
        }

        public Criteria andDitemidGreaterThanOrEqualTo(String value) {
            addCriterion("ditemID >=", value, "ditemid");
            return (Criteria) this;
        }

        public Criteria andDitemidLessThan(String value) {
            addCriterion("ditemID <", value, "ditemid");
            return (Criteria) this;
        }

        public Criteria andDitemidLessThanOrEqualTo(String value) {
            addCriterion("ditemID <=", value, "ditemid");
            return (Criteria) this;
        }

        public Criteria andDitemidLike(String value) {
            addCriterion("ditemID like", value, "ditemid");
            return (Criteria) this;
        }

        public Criteria andDitemidNotLike(String value) {
            addCriterion("ditemID not like", value, "ditemid");
            return (Criteria) this;
        }

        public Criteria andDitemidIn(List<String> values) {
            addCriterion("ditemID in", values, "ditemid");
            return (Criteria) this;
        }

        public Criteria andDitemidNotIn(List<String> values) {
            addCriterion("ditemID not in", values, "ditemid");
            return (Criteria) this;
        }

        public Criteria andDitemidBetween(String value1, String value2) {
            addCriterion("ditemID between", value1, value2, "ditemid");
            return (Criteria) this;
        }

        public Criteria andDitemidNotBetween(String value1, String value2) {
            addCriterion("ditemID not between", value1, value2, "ditemid");
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