package com.domain;

import java.util.ArrayList;
import java.util.List;

public class DrugdetailedExample {
    protected String orderByClause;

    protected boolean distinct;

    protected List<Criteria> oredCriteria;

    public DrugdetailedExample() {
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

        public Criteria andDdnameIsNull() {
            addCriterion("ddName is null");
            return (Criteria) this;
        }

        public Criteria andDdnameIsNotNull() {
            addCriterion("ddName is not null");
            return (Criteria) this;
        }

        public Criteria andDdnameEqualTo(String value) {
            addCriterion("ddName =", value, "ddname");
            return (Criteria) this;
        }

        public Criteria andDdnameNotEqualTo(String value) {
            addCriterion("ddName <>", value, "ddname");
            return (Criteria) this;
        }

        public Criteria andDdnameGreaterThan(String value) {
            addCriterion("ddName >", value, "ddname");
            return (Criteria) this;
        }

        public Criteria andDdnameGreaterThanOrEqualTo(String value) {
            addCriterion("ddName >=", value, "ddname");
            return (Criteria) this;
        }

        public Criteria andDdnameLessThan(String value) {
            addCriterion("ddName <", value, "ddname");
            return (Criteria) this;
        }

        public Criteria andDdnameLessThanOrEqualTo(String value) {
            addCriterion("ddName <=", value, "ddname");
            return (Criteria) this;
        }

        public Criteria andDdnameLike(String value) {
            addCriterion("ddName like", value, "ddname");
            return (Criteria) this;
        }

        public Criteria andDdnameNotLike(String value) {
            addCriterion("ddName not like", value, "ddname");
            return (Criteria) this;
        }

        public Criteria andDdnameIn(List<String> values) {
            addCriterion("ddName in", values, "ddname");
            return (Criteria) this;
        }

        public Criteria andDdnameNotIn(List<String> values) {
            addCriterion("ddName not in", values, "ddname");
            return (Criteria) this;
        }

        public Criteria andDdnameBetween(String value1, String value2) {
            addCriterion("ddName between", value1, value2, "ddname");
            return (Criteria) this;
        }

        public Criteria andDdnameNotBetween(String value1, String value2) {
            addCriterion("ddName not between", value1, value2, "ddname");
            return (Criteria) this;
        }

        public Criteria andDtidIsNull() {
            addCriterion("dtId is null");
            return (Criteria) this;
        }

        public Criteria andDtidIsNotNull() {
            addCriterion("dtId is not null");
            return (Criteria) this;
        }

        public Criteria andDtidEqualTo(String value) {
            addCriterion("dtId =", value, "dtid");
            return (Criteria) this;
        }

        public Criteria andDtidNotEqualTo(String value) {
            addCriterion("dtId <>", value, "dtid");
            return (Criteria) this;
        }

        public Criteria andDtidGreaterThan(String value) {
            addCriterion("dtId >", value, "dtid");
            return (Criteria) this;
        }

        public Criteria andDtidGreaterThanOrEqualTo(String value) {
            addCriterion("dtId >=", value, "dtid");
            return (Criteria) this;
        }

        public Criteria andDtidLessThan(String value) {
            addCriterion("dtId <", value, "dtid");
            return (Criteria) this;
        }

        public Criteria andDtidLessThanOrEqualTo(String value) {
            addCriterion("dtId <=", value, "dtid");
            return (Criteria) this;
        }

        public Criteria andDtidLike(String value) {
            addCriterion("dtId like", value, "dtid");
            return (Criteria) this;
        }

        public Criteria andDtidNotLike(String value) {
            addCriterion("dtId not like", value, "dtid");
            return (Criteria) this;
        }

        public Criteria andDtidIn(List<String> values) {
            addCriterion("dtId in", values, "dtid");
            return (Criteria) this;
        }

        public Criteria andDtidNotIn(List<String> values) {
            addCriterion("dtId not in", values, "dtid");
            return (Criteria) this;
        }

        public Criteria andDtidBetween(String value1, String value2) {
            addCriterion("dtId between", value1, value2, "dtid");
            return (Criteria) this;
        }

        public Criteria andDtidNotBetween(String value1, String value2) {
            addCriterion("dtId not between", value1, value2, "dtid");
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