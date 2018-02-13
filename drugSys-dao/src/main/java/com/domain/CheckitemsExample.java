package com.domain;

import java.util.ArrayList;
import java.util.List;

public class CheckitemsExample {
    protected String orderByClause;

    protected boolean distinct;

    protected List<Criteria> oredCriteria;

    public CheckitemsExample() {
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

        public Criteria andItemidIsNull() {
            addCriterion("itemId is null");
            return (Criteria) this;
        }

        public Criteria andItemidIsNotNull() {
            addCriterion("itemId is not null");
            return (Criteria) this;
        }

        public Criteria andItemidEqualTo(String value) {
            addCriterion("itemId =", value, "itemid");
            return (Criteria) this;
        }

        public Criteria andItemidNotEqualTo(String value) {
            addCriterion("itemId <>", value, "itemid");
            return (Criteria) this;
        }

        public Criteria andItemidGreaterThan(String value) {
            addCriterion("itemId >", value, "itemid");
            return (Criteria) this;
        }

        public Criteria andItemidGreaterThanOrEqualTo(String value) {
            addCriterion("itemId >=", value, "itemid");
            return (Criteria) this;
        }

        public Criteria andItemidLessThan(String value) {
            addCriterion("itemId <", value, "itemid");
            return (Criteria) this;
        }

        public Criteria andItemidLessThanOrEqualTo(String value) {
            addCriterion("itemId <=", value, "itemid");
            return (Criteria) this;
        }

        public Criteria andItemidLike(String value) {
            addCriterion("itemId like", value, "itemid");
            return (Criteria) this;
        }

        public Criteria andItemidNotLike(String value) {
            addCriterion("itemId not like", value, "itemid");
            return (Criteria) this;
        }

        public Criteria andItemidIn(List<String> values) {
            addCriterion("itemId in", values, "itemid");
            return (Criteria) this;
        }

        public Criteria andItemidNotIn(List<String> values) {
            addCriterion("itemId not in", values, "itemid");
            return (Criteria) this;
        }

        public Criteria andItemidBetween(String value1, String value2) {
            addCriterion("itemId between", value1, value2, "itemid");
            return (Criteria) this;
        }

        public Criteria andItemidNotBetween(String value1, String value2) {
            addCriterion("itemId not between", value1, value2, "itemid");
            return (Criteria) this;
        }

        public Criteria andCidIsNull() {
            addCriterion("cid is null");
            return (Criteria) this;
        }

        public Criteria andCidIsNotNull() {
            addCriterion("cid is not null");
            return (Criteria) this;
        }

        public Criteria andCidEqualTo(String value) {
            addCriterion("cid =", value, "cid");
            return (Criteria) this;
        }

        public Criteria andCidNotEqualTo(String value) {
            addCriterion("cid <>", value, "cid");
            return (Criteria) this;
        }

        public Criteria andCidGreaterThan(String value) {
            addCriterion("cid >", value, "cid");
            return (Criteria) this;
        }

        public Criteria andCidGreaterThanOrEqualTo(String value) {
            addCriterion("cid >=", value, "cid");
            return (Criteria) this;
        }

        public Criteria andCidLessThan(String value) {
            addCriterion("cid <", value, "cid");
            return (Criteria) this;
        }

        public Criteria andCidLessThanOrEqualTo(String value) {
            addCriterion("cid <=", value, "cid");
            return (Criteria) this;
        }

        public Criteria andCidLike(String value) {
            addCriterion("cid like", value, "cid");
            return (Criteria) this;
        }

        public Criteria andCidNotLike(String value) {
            addCriterion("cid not like", value, "cid");
            return (Criteria) this;
        }

        public Criteria andCidIn(List<String> values) {
            addCriterion("cid in", values, "cid");
            return (Criteria) this;
        }

        public Criteria andCidNotIn(List<String> values) {
            addCriterion("cid not in", values, "cid");
            return (Criteria) this;
        }

        public Criteria andCidBetween(String value1, String value2) {
            addCriterion("cid between", value1, value2, "cid");
            return (Criteria) this;
        }

        public Criteria andCidNotBetween(String value1, String value2) {
            addCriterion("cid not between", value1, value2, "cid");
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

        public Criteria andWqtyIsNull() {
            addCriterion("wqty is null");
            return (Criteria) this;
        }

        public Criteria andWqtyIsNotNull() {
            addCriterion("wqty is not null");
            return (Criteria) this;
        }

        public Criteria andWqtyEqualTo(Integer value) {
            addCriterion("wqty =", value, "wqty");
            return (Criteria) this;
        }

        public Criteria andWqtyNotEqualTo(Integer value) {
            addCriterion("wqty <>", value, "wqty");
            return (Criteria) this;
        }

        public Criteria andWqtyGreaterThan(Integer value) {
            addCriterion("wqty >", value, "wqty");
            return (Criteria) this;
        }

        public Criteria andWqtyGreaterThanOrEqualTo(Integer value) {
            addCriterion("wqty >=", value, "wqty");
            return (Criteria) this;
        }

        public Criteria andWqtyLessThan(Integer value) {
            addCriterion("wqty <", value, "wqty");
            return (Criteria) this;
        }

        public Criteria andWqtyLessThanOrEqualTo(Integer value) {
            addCriterion("wqty <=", value, "wqty");
            return (Criteria) this;
        }

        public Criteria andWqtyIn(List<Integer> values) {
            addCriterion("wqty in", values, "wqty");
            return (Criteria) this;
        }

        public Criteria andWqtyNotIn(List<Integer> values) {
            addCriterion("wqty not in", values, "wqty");
            return (Criteria) this;
        }

        public Criteria andWqtyBetween(Integer value1, Integer value2) {
            addCriterion("wqty between", value1, value2, "wqty");
            return (Criteria) this;
        }

        public Criteria andWqtyNotBetween(Integer value1, Integer value2) {
            addCriterion("wqty not between", value1, value2, "wqty");
            return (Criteria) this;
        }

        public Criteria andRqtyIsNull() {
            addCriterion("rqty is null");
            return (Criteria) this;
        }

        public Criteria andRqtyIsNotNull() {
            addCriterion("rqty is not null");
            return (Criteria) this;
        }

        public Criteria andRqtyEqualTo(Integer value) {
            addCriterion("rqty =", value, "rqty");
            return (Criteria) this;
        }

        public Criteria andRqtyNotEqualTo(Integer value) {
            addCriterion("rqty <>", value, "rqty");
            return (Criteria) this;
        }

        public Criteria andRqtyGreaterThan(Integer value) {
            addCriterion("rqty >", value, "rqty");
            return (Criteria) this;
        }

        public Criteria andRqtyGreaterThanOrEqualTo(Integer value) {
            addCriterion("rqty >=", value, "rqty");
            return (Criteria) this;
        }

        public Criteria andRqtyLessThan(Integer value) {
            addCriterion("rqty <", value, "rqty");
            return (Criteria) this;
        }

        public Criteria andRqtyLessThanOrEqualTo(Integer value) {
            addCriterion("rqty <=", value, "rqty");
            return (Criteria) this;
        }

        public Criteria andRqtyIn(List<Integer> values) {
            addCriterion("rqty in", values, "rqty");
            return (Criteria) this;
        }

        public Criteria andRqtyNotIn(List<Integer> values) {
            addCriterion("rqty not in", values, "rqty");
            return (Criteria) this;
        }

        public Criteria andRqtyBetween(Integer value1, Integer value2) {
            addCriterion("rqty between", value1, value2, "rqty");
            return (Criteria) this;
        }

        public Criteria andRqtyNotBetween(Integer value1, Integer value2) {
            addCriterion("rqty not between", value1, value2, "rqty");
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