package com.domain;

import java.math.BigDecimal;
import java.util.ArrayList;
import java.util.List;

public class SaleitemExample {
    protected String orderByClause;

    protected boolean distinct;

    protected List<Criteria> oredCriteria;

    public SaleitemExample() {
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

        public Criteria andSoitemidIsNull() {
            addCriterion("soItemId is null");
            return (Criteria) this;
        }

        public Criteria andSoitemidIsNotNull() {
            addCriterion("soItemId is not null");
            return (Criteria) this;
        }

        public Criteria andSoitemidEqualTo(String value) {
            addCriterion("soItemId =", value, "soitemid");
            return (Criteria) this;
        }

        public Criteria andSoitemidNotEqualTo(String value) {
            addCriterion("soItemId <>", value, "soitemid");
            return (Criteria) this;
        }

        public Criteria andSoitemidGreaterThan(String value) {
            addCriterion("soItemId >", value, "soitemid");
            return (Criteria) this;
        }

        public Criteria andSoitemidGreaterThanOrEqualTo(String value) {
            addCriterion("soItemId >=", value, "soitemid");
            return (Criteria) this;
        }

        public Criteria andSoitemidLessThan(String value) {
            addCriterion("soItemId <", value, "soitemid");
            return (Criteria) this;
        }

        public Criteria andSoitemidLessThanOrEqualTo(String value) {
            addCriterion("soItemId <=", value, "soitemid");
            return (Criteria) this;
        }

        public Criteria andSoitemidLike(String value) {
            addCriterion("soItemId like", value, "soitemid");
            return (Criteria) this;
        }

        public Criteria andSoitemidNotLike(String value) {
            addCriterion("soItemId not like", value, "soitemid");
            return (Criteria) this;
        }

        public Criteria andSoitemidIn(List<String> values) {
            addCriterion("soItemId in", values, "soitemid");
            return (Criteria) this;
        }

        public Criteria andSoitemidNotIn(List<String> values) {
            addCriterion("soItemId not in", values, "soitemid");
            return (Criteria) this;
        }

        public Criteria andSoitemidBetween(String value1, String value2) {
            addCriterion("soItemId between", value1, value2, "soitemid");
            return (Criteria) this;
        }

        public Criteria andSoitemidNotBetween(String value1, String value2) {
            addCriterion("soItemId not between", value1, value2, "soitemid");
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

        public Criteria andSingelpriceIsNull() {
            addCriterion("singelPrice is null");
            return (Criteria) this;
        }

        public Criteria andSingelpriceIsNotNull() {
            addCriterion("singelPrice is not null");
            return (Criteria) this;
        }

        public Criteria andSingelpriceEqualTo(BigDecimal value) {
            addCriterion("singelPrice =", value, "singelprice");
            return (Criteria) this;
        }

        public Criteria andSingelpriceNotEqualTo(BigDecimal value) {
            addCriterion("singelPrice <>", value, "singelprice");
            return (Criteria) this;
        }

        public Criteria andSingelpriceGreaterThan(BigDecimal value) {
            addCriterion("singelPrice >", value, "singelprice");
            return (Criteria) this;
        }

        public Criteria andSingelpriceGreaterThanOrEqualTo(BigDecimal value) {
            addCriterion("singelPrice >=", value, "singelprice");
            return (Criteria) this;
        }

        public Criteria andSingelpriceLessThan(BigDecimal value) {
            addCriterion("singelPrice <", value, "singelprice");
            return (Criteria) this;
        }

        public Criteria andSingelpriceLessThanOrEqualTo(BigDecimal value) {
            addCriterion("singelPrice <=", value, "singelprice");
            return (Criteria) this;
        }

        public Criteria andSingelpriceIn(List<BigDecimal> values) {
            addCriterion("singelPrice in", values, "singelprice");
            return (Criteria) this;
        }

        public Criteria andSingelpriceNotIn(List<BigDecimal> values) {
            addCriterion("singelPrice not in", values, "singelprice");
            return (Criteria) this;
        }

        public Criteria andSingelpriceBetween(BigDecimal value1, BigDecimal value2) {
            addCriterion("singelPrice between", value1, value2, "singelprice");
            return (Criteria) this;
        }

        public Criteria andSingelpriceNotBetween(BigDecimal value1, BigDecimal value2) {
            addCriterion("singelPrice not between", value1, value2, "singelprice");
            return (Criteria) this;
        }

        public Criteria andDiscountIsNull() {
            addCriterion("discount is null");
            return (Criteria) this;
        }

        public Criteria andDiscountIsNotNull() {
            addCriterion("discount is not null");
            return (Criteria) this;
        }

        public Criteria andDiscountEqualTo(Double value) {
            addCriterion("discount =", value, "discount");
            return (Criteria) this;
        }

        public Criteria andDiscountNotEqualTo(Double value) {
            addCriterion("discount <>", value, "discount");
            return (Criteria) this;
        }

        public Criteria andDiscountGreaterThan(Double value) {
            addCriterion("discount >", value, "discount");
            return (Criteria) this;
        }

        public Criteria andDiscountGreaterThanOrEqualTo(Double value) {
            addCriterion("discount >=", value, "discount");
            return (Criteria) this;
        }

        public Criteria andDiscountLessThan(Double value) {
            addCriterion("discount <", value, "discount");
            return (Criteria) this;
        }

        public Criteria andDiscountLessThanOrEqualTo(Double value) {
            addCriterion("discount <=", value, "discount");
            return (Criteria) this;
        }

        public Criteria andDiscountIn(List<Double> values) {
            addCriterion("discount in", values, "discount");
            return (Criteria) this;
        }

        public Criteria andDiscountNotIn(List<Double> values) {
            addCriterion("discount not in", values, "discount");
            return (Criteria) this;
        }

        public Criteria andDiscountBetween(Double value1, Double value2) {
            addCriterion("discount between", value1, value2, "discount");
            return (Criteria) this;
        }

        public Criteria andDiscountNotBetween(Double value1, Double value2) {
            addCriterion("discount not between", value1, value2, "discount");
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