package com.domain;

import java.util.ArrayList;
import java.util.Date;
import java.util.Iterator;
import java.util.List;

public class LogdetailExample {
    protected String orderByClause;

    protected boolean distinct;

    protected List<Criteria> oredCriteria;

    public LogdetailExample() {
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

        public Criteria andLogidIsNull() {
            addCriterion("logId is null");
            return (Criteria) this;
        }

        public Criteria andLogidIsNotNull() {
            addCriterion("logId is not null");
            return (Criteria) this;
        }

        public Criteria andLogidEqualTo(String value) {
            addCriterion("logId =", value, "logid");
            return (Criteria) this;
        }

        public Criteria andLogidNotEqualTo(String value) {
            addCriterion("logId <>", value, "logid");
            return (Criteria) this;
        }

        public Criteria andLogidGreaterThan(String value) {
            addCriterion("logId >", value, "logid");
            return (Criteria) this;
        }

        public Criteria andLogidGreaterThanOrEqualTo(String value) {
            addCriterion("logId >=", value, "logid");
            return (Criteria) this;
        }

        public Criteria andLogidLessThan(String value) {
            addCriterion("logId <", value, "logid");
            return (Criteria) this;
        }

        public Criteria andLogidLessThanOrEqualTo(String value) {
            addCriterion("logId <=", value, "logid");
            return (Criteria) this;
        }

        public Criteria andLogidLike(String value) {
            addCriterion("logId like", value, "logid");
            return (Criteria) this;
        }

        public Criteria andLogidNotLike(String value) {
            addCriterion("logId not like", value, "logid");
            return (Criteria) this;
        }

        public Criteria andLogidIn(List<String> values) {
            addCriterion("logId in", values, "logid");
            return (Criteria) this;
        }

        public Criteria andLogidNotIn(List<String> values) {
            addCriterion("logId not in", values, "logid");
            return (Criteria) this;
        }

        public Criteria andLogidBetween(String value1, String value2) {
            addCriterion("logId between", value1, value2, "logid");
            return (Criteria) this;
        }

        public Criteria andLogidNotBetween(String value1, String value2) {
            addCriterion("logId not between", value1, value2, "logid");
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

        public Criteria andInqtyIsNull() {
            addCriterion("inQty is null");
            return (Criteria) this;
        }

        public Criteria andInqtyIsNotNull() {
            addCriterion("inQty is not null");
            return (Criteria) this;
        }

        public Criteria andInqtyEqualTo(Integer value) {
            addCriterion("inQty =", value, "inqty");
            return (Criteria) this;
        }

        public Criteria andInqtyNotEqualTo(Integer value) {
            addCriterion("inQty <>", value, "inqty");
            return (Criteria) this;
        }

        public Criteria andInqtyGreaterThan(Integer value) {
            addCriterion("inQty >", value, "inqty");
            return (Criteria) this;
        }

        public Criteria andInqtyGreaterThanOrEqualTo(Integer value) {
            addCriterion("inQty >=", value, "inqty");
            return (Criteria) this;
        }

        public Criteria andInqtyLessThan(Integer value) {
            addCriterion("inQty <", value, "inqty");
            return (Criteria) this;
        }

        public Criteria andInqtyLessThanOrEqualTo(Integer value) {
            addCriterion("inQty <=", value, "inqty");
            return (Criteria) this;
        }

        public Criteria andInqtyIn(List<Integer> values) {
            addCriterion("inQty in", values, "inqty");
            return (Criteria) this;
        }

        public Criteria andInqtyNotIn(List<Integer> values) {
            addCriterion("inQty not in", values, "inqty");
            return (Criteria) this;
        }

        public Criteria andInqtyBetween(Integer value1, Integer value2) {
            addCriterion("inQty between", value1, value2, "inqty");
            return (Criteria) this;
        }

        public Criteria andInqtyNotBetween(Integer value1, Integer value2) {
            addCriterion("inQty not between", value1, value2, "inqty");
            return (Criteria) this;
        }

        public Criteria andOutqtyIsNull() {
            addCriterion("outQty is null");
            return (Criteria) this;
        }

        public Criteria andOutqtyIsNotNull() {
            addCriterion("outQty is not null");
            return (Criteria) this;
        }

        public Criteria andOutqtyEqualTo(Integer value) {
            addCriterion("outQty =", value, "outqty");
            return (Criteria) this;
        }

        public Criteria andOutqtyNotEqualTo(Integer value) {
            addCriterion("outQty <>", value, "outqty");
            return (Criteria) this;
        }

        public Criteria andOutqtyGreaterThan(Integer value) {
            addCriterion("outQty >", value, "outqty");
            return (Criteria) this;
        }

        public Criteria andOutqtyGreaterThanOrEqualTo(Integer value) {
            addCriterion("outQty >=", value, "outqty");
            return (Criteria) this;
        }

        public Criteria andOutqtyLessThan(Integer value) {
            addCriterion("outQty <", value, "outqty");
            return (Criteria) this;
        }

        public Criteria andOutqtyLessThanOrEqualTo(Integer value) {
            addCriterion("outQty <=", value, "outqty");
            return (Criteria) this;
        }

        public Criteria andOutqtyIn(List<Integer> values) {
            addCriterion("outQty in", values, "outqty");
            return (Criteria) this;
        }

        public Criteria andOutqtyNotIn(List<Integer> values) {
            addCriterion("outQty not in", values, "outqty");
            return (Criteria) this;
        }

        public Criteria andOutqtyBetween(Integer value1, Integer value2) {
            addCriterion("outQty between", value1, value2, "outqty");
            return (Criteria) this;
        }

        public Criteria andOutqtyNotBetween(Integer value1, Integer value2) {
            addCriterion("outQty not between", value1, value2, "outqty");
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

        public Criteria andSupplierIsNull() {
            addCriterion("supplier is null");
            return (Criteria) this;
        }

        public Criteria andSupplierIsNotNull() {
            addCriterion("supplier is not null");
            return (Criteria) this;
        }

        public Criteria andSupplierEqualTo(String value) {
            addCriterion("supplier =", value, "supplier");
            return (Criteria) this;
        }

        public Criteria andSupplierNotEqualTo(String value) {
            addCriterion("supplier <>", value, "supplier");
            return (Criteria) this;
        }

        public Criteria andSupplierGreaterThan(String value) {
            addCriterion("supplier >", value, "supplier");
            return (Criteria) this;
        }

        public Criteria andSupplierGreaterThanOrEqualTo(String value) {
            addCriterion("supplier >=", value, "supplier");
            return (Criteria) this;
        }

        public Criteria andSupplierLessThan(String value) {
            addCriterion("supplier <", value, "supplier");
            return (Criteria) this;
        }

        public Criteria andSupplierLessThanOrEqualTo(String value) {
            addCriterion("supplier <=", value, "supplier");
            return (Criteria) this;
        }

        public Criteria andSupplierLike(String value) {
            addCriterion("supplier like", value, "supplier");
            return (Criteria) this;
        }

        public Criteria andSupplierNotLike(String value) {
            addCriterion("supplier not like", value, "supplier");
            return (Criteria) this;
        }

        public Criteria andSupplierIn(List<String> values) {
            addCriterion("supplier in", values, "supplier");
            return (Criteria) this;
        }

        public Criteria andSupplierNotIn(List<String> values) {
            addCriterion("supplier not in", values, "supplier");
            return (Criteria) this;
        }

        public Criteria andSupplierBetween(String value1, String value2) {
            addCriterion("supplier between", value1, value2, "supplier");
            return (Criteria) this;
        }

        public Criteria andSupplierNotBetween(String value1, String value2) {
            addCriterion("supplier not between", value1, value2, "supplier");
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