package com.whwj.entity.zzx;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;

public class CheliangbaoyangExample {
    protected String orderByClause;

    protected boolean distinct;

    protected List<Criteria> oredCriteria;

    public CheliangbaoyangExample() {
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

        public Criteria andIdIsNull() {
            addCriterion("id is null");
            return (Criteria) this;
        }

        public Criteria andIdIsNotNull() {
            addCriterion("id is not null");
            return (Criteria) this;
        }

        public Criteria andIdEqualTo(Integer value) {
            addCriterion("id =", value, "id");
            return (Criteria) this;
        }

        public Criteria andIdNotEqualTo(Integer value) {
            addCriterion("id <>", value, "id");
            return (Criteria) this;
        }

        public Criteria andIdGreaterThan(Integer value) {
            addCriterion("id >", value, "id");
            return (Criteria) this;
        }

        public Criteria andIdGreaterThanOrEqualTo(Integer value) {
            addCriterion("id >=", value, "id");
            return (Criteria) this;
        }

        public Criteria andIdLessThan(Integer value) {
            addCriterion("id <", value, "id");
            return (Criteria) this;
        }

        public Criteria andIdLessThanOrEqualTo(Integer value) {
            addCriterion("id <=", value, "id");
            return (Criteria) this;
        }

        public Criteria andIdIn(List<Integer> values) {
            addCriterion("id in", values, "id");
            return (Criteria) this;
        }

        public Criteria andIdNotIn(List<Integer> values) {
            addCriterion("id not in", values, "id");
            return (Criteria) this;
        }

        public Criteria andIdBetween(Integer value1, Integer value2) {
            addCriterion("id between", value1, value2, "id");
            return (Criteria) this;
        }

        public Criteria andIdNotBetween(Integer value1, Integer value2) {
            addCriterion("id not between", value1, value2, "id");
            return (Criteria) this;
        }

        public Criteria andCheliangidIsNull() {
            addCriterion("cheliangid is null");
            return (Criteria) this;
        }

        public Criteria andCheliangidIsNotNull() {
            addCriterion("cheliangid is not null");
            return (Criteria) this;
        }

        public Criteria andCheliangidEqualTo(Integer value) {
            addCriterion("cheliangid =", value, "cheliangid");
            return (Criteria) this;
        }

        public Criteria andCheliangidNotEqualTo(Integer value) {
            addCriterion("cheliangid <>", value, "cheliangid");
            return (Criteria) this;
        }

        public Criteria andCheliangidGreaterThan(Integer value) {
            addCriterion("cheliangid >", value, "cheliangid");
            return (Criteria) this;
        }

        public Criteria andCheliangidGreaterThanOrEqualTo(Integer value) {
            addCriterion("cheliangid >=", value, "cheliangid");
            return (Criteria) this;
        }

        public Criteria andCheliangidLessThan(Integer value) {
            addCriterion("cheliangid <", value, "cheliangid");
            return (Criteria) this;
        }

        public Criteria andCheliangidLessThanOrEqualTo(Integer value) {
            addCriterion("cheliangid <=", value, "cheliangid");
            return (Criteria) this;
        }

        public Criteria andCheliangidIn(List<Integer> values) {
            addCriterion("cheliangid in", values, "cheliangid");
            return (Criteria) this;
        }

        public Criteria andCheliangidNotIn(List<Integer> values) {
            addCriterion("cheliangid not in", values, "cheliangid");
            return (Criteria) this;
        }

        public Criteria andCheliangidBetween(Integer value1, Integer value2) {
            addCriterion("cheliangid between", value1, value2, "cheliangid");
            return (Criteria) this;
        }

        public Criteria andCheliangidNotBetween(Integer value1, Integer value2) {
            addCriterion("cheliangid not between", value1, value2, "cheliangid");
            return (Criteria) this;
        }

        public Criteria andBaoyangshijianIsNull() {
            addCriterion("baoyangshijian is null");
            return (Criteria) this;
        }

        public Criteria andBaoyangshijianIsNotNull() {
            addCriterion("baoyangshijian is not null");
            return (Criteria) this;
        }

        public Criteria andBaoyangshijianEqualTo(Date value) {
            addCriterion("baoyangshijian =", value, "baoyangshijian");
            return (Criteria) this;
        }

        public Criteria andBaoyangshijianNotEqualTo(Date value) {
            addCriterion("baoyangshijian <>", value, "baoyangshijian");
            return (Criteria) this;
        }

        public Criteria andBaoyangshijianGreaterThan(Date value) {
            addCriterion("baoyangshijian >", value, "baoyangshijian");
            return (Criteria) this;
        }

        public Criteria andBaoyangshijianGreaterThanOrEqualTo(Date value) {
            addCriterion("baoyangshijian >=", value, "baoyangshijian");
            return (Criteria) this;
        }

        public Criteria andBaoyangshijianLessThan(Date value) {
            addCriterion("baoyangshijian <", value, "baoyangshijian");
            return (Criteria) this;
        }

        public Criteria andBaoyangshijianLessThanOrEqualTo(Date value) {
            addCriterion("baoyangshijian <=", value, "baoyangshijian");
            return (Criteria) this;
        }

        public Criteria andBaoyangshijianIn(List<Date> values) {
            addCriterion("baoyangshijian in", values, "baoyangshijian");
            return (Criteria) this;
        }

        public Criteria andBaoyangshijianNotIn(List<Date> values) {
            addCriterion("baoyangshijian not in", values, "baoyangshijian");
            return (Criteria) this;
        }

        public Criteria andBaoyangshijianBetween(Date value1, Date value2) {
            addCriterion("baoyangshijian between", value1, value2, "baoyangshijian");
            return (Criteria) this;
        }

        public Criteria andBaoyangshijianNotBetween(Date value1, Date value2) {
            addCriterion("baoyangshijian not between", value1, value2, "baoyangshijian");
            return (Criteria) this;
        }

        public Criteria andBaoyangleixingIsNull() {
            addCriterion("baoyangleixing is null");
            return (Criteria) this;
        }

        public Criteria andBaoyangleixingIsNotNull() {
            addCriterion("baoyangleixing is not null");
            return (Criteria) this;
        }

        public Criteria andBaoyangleixingEqualTo(String value) {
            addCriterion("baoyangleixing =", value, "baoyangleixing");
            return (Criteria) this;
        }

        public Criteria andBaoyangleixingNotEqualTo(String value) {
            addCriterion("baoyangleixing <>", value, "baoyangleixing");
            return (Criteria) this;
        }

        public Criteria andBaoyangleixingGreaterThan(String value) {
            addCriterion("baoyangleixing >", value, "baoyangleixing");
            return (Criteria) this;
        }

        public Criteria andBaoyangleixingGreaterThanOrEqualTo(String value) {
            addCriterion("baoyangleixing >=", value, "baoyangleixing");
            return (Criteria) this;
        }

        public Criteria andBaoyangleixingLessThan(String value) {
            addCriterion("baoyangleixing <", value, "baoyangleixing");
            return (Criteria) this;
        }

        public Criteria andBaoyangleixingLessThanOrEqualTo(String value) {
            addCriterion("baoyangleixing <=", value, "baoyangleixing");
            return (Criteria) this;
        }

        public Criteria andBaoyangleixingLike(String value) {
            addCriterion("baoyangleixing like", value, "baoyangleixing");
            return (Criteria) this;
        }

        public Criteria andBaoyangleixingNotLike(String value) {
            addCriterion("baoyangleixing not like", value, "baoyangleixing");
            return (Criteria) this;
        }

        public Criteria andBaoyangleixingIn(List<String> values) {
            addCriterion("baoyangleixing in", values, "baoyangleixing");
            return (Criteria) this;
        }

        public Criteria andBaoyangleixingNotIn(List<String> values) {
            addCriterion("baoyangleixing not in", values, "baoyangleixing");
            return (Criteria) this;
        }

        public Criteria andBaoyangleixingBetween(String value1, String value2) {
            addCriterion("baoyangleixing between", value1, value2, "baoyangleixing");
            return (Criteria) this;
        }

        public Criteria andBaoyangleixingNotBetween(String value1, String value2) {
            addCriterion("baoyangleixing not between", value1, value2, "baoyangleixing");
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