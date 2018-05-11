package com.whwj.entity.fei;

import java.util.ArrayList;
import java.util.List;

public class CangkuExample {
    protected String orderByClause;

    protected boolean distinct;

    protected List<Criteria> oredCriteria;

    public CangkuExample() {
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

        public Criteria andWeizhiIsNull() {
            addCriterion("weizhi is null");
            return (Criteria) this;
        }

        public Criteria andWeizhiIsNotNull() {
            addCriterion("weizhi is not null");
            return (Criteria) this;
        }

        public Criteria andWeizhiEqualTo(String value) {
            addCriterion("weizhi =", value, "weizhi");
            return (Criteria) this;
        }

        public Criteria andWeizhiNotEqualTo(String value) {
            addCriterion("weizhi <>", value, "weizhi");
            return (Criteria) this;
        }

        public Criteria andWeizhiGreaterThan(String value) {
            addCriterion("weizhi >", value, "weizhi");
            return (Criteria) this;
        }

        public Criteria andWeizhiGreaterThanOrEqualTo(String value) {
            addCriterion("weizhi >=", value, "weizhi");
            return (Criteria) this;
        }

        public Criteria andWeizhiLessThan(String value) {
            addCriterion("weizhi <", value, "weizhi");
            return (Criteria) this;
        }

        public Criteria andWeizhiLessThanOrEqualTo(String value) {
            addCriterion("weizhi <=", value, "weizhi");
            return (Criteria) this;
        }

        public Criteria andWeizhiLike(String value) {
            addCriterion("weizhi like", value, "weizhi");
            return (Criteria) this;
        }

        public Criteria andWeizhiNotLike(String value) {
            addCriterion("weizhi not like", value, "weizhi");
            return (Criteria) this;
        }

        public Criteria andWeizhiIn(List<String> values) {
            addCriterion("weizhi in", values, "weizhi");
            return (Criteria) this;
        }

        public Criteria andWeizhiNotIn(List<String> values) {
            addCriterion("weizhi not in", values, "weizhi");
            return (Criteria) this;
        }

        public Criteria andWeizhiBetween(String value1, String value2) {
            addCriterion("weizhi between", value1, value2, "weizhi");
            return (Criteria) this;
        }

        public Criteria andWeizhiNotBetween(String value1, String value2) {
            addCriterion("weizhi not between", value1, value2, "weizhi");
            return (Criteria) this;
        }

        public Criteria andShuliangIsNull() {
            addCriterion("shuliang is null");
            return (Criteria) this;
        }

        public Criteria andShuliangIsNotNull() {
            addCriterion("shuliang is not null");
            return (Criteria) this;
        }

        public Criteria andShuliangEqualTo(String value) {
            addCriterion("shuliang =", value, "shuliang");
            return (Criteria) this;
        }

        public Criteria andShuliangNotEqualTo(String value) {
            addCriterion("shuliang <>", value, "shuliang");
            return (Criteria) this;
        }

        public Criteria andShuliangGreaterThan(String value) {
            addCriterion("shuliang >", value, "shuliang");
            return (Criteria) this;
        }

        public Criteria andShuliangGreaterThanOrEqualTo(String value) {
            addCriterion("shuliang >=", value, "shuliang");
            return (Criteria) this;
        }

        public Criteria andShuliangLessThan(String value) {
            addCriterion("shuliang <", value, "shuliang");
            return (Criteria) this;
        }

        public Criteria andShuliangLessThanOrEqualTo(String value) {
            addCriterion("shuliang <=", value, "shuliang");
            return (Criteria) this;
        }

        public Criteria andShuliangLike(String value) {
            addCriterion("shuliang like", value, "shuliang");
            return (Criteria) this;
        }

        public Criteria andShuliangNotLike(String value) {
            addCriterion("shuliang not like", value, "shuliang");
            return (Criteria) this;
        }

        public Criteria andShuliangIn(List<String> values) {
            addCriterion("shuliang in", values, "shuliang");
            return (Criteria) this;
        }

        public Criteria andShuliangNotIn(List<String> values) {
            addCriterion("shuliang not in", values, "shuliang");
            return (Criteria) this;
        }

        public Criteria andShuliangBetween(String value1, String value2) {
            addCriterion("shuliang between", value1, value2, "shuliang");
            return (Criteria) this;
        }

        public Criteria andShuliangNotBetween(String value1, String value2) {
            addCriterion("shuliang not between", value1, value2, "shuliang");
            return (Criteria) this;
        }

        public Criteria andCleixingIsNull() {
            addCriterion("cleixing is null");
            return (Criteria) this;
        }

        public Criteria andCleixingIsNotNull() {
            addCriterion("cleixing is not null");
            return (Criteria) this;
        }

        public Criteria andCleixingEqualTo(String value) {
            addCriterion("cleixing =", value, "cleixing");
            return (Criteria) this;
        }

        public Criteria andCleixingNotEqualTo(String value) {
            addCriterion("cleixing <>", value, "cleixing");
            return (Criteria) this;
        }

        public Criteria andCleixingGreaterThan(String value) {
            addCriterion("cleixing >", value, "cleixing");
            return (Criteria) this;
        }

        public Criteria andCleixingGreaterThanOrEqualTo(String value) {
            addCriterion("cleixing >=", value, "cleixing");
            return (Criteria) this;
        }

        public Criteria andCleixingLessThan(String value) {
            addCriterion("cleixing <", value, "cleixing");
            return (Criteria) this;
        }

        public Criteria andCleixingLessThanOrEqualTo(String value) {
            addCriterion("cleixing <=", value, "cleixing");
            return (Criteria) this;
        }

        public Criteria andCleixingLike(String value) {
            addCriterion("cleixing like", value, "cleixing");
            return (Criteria) this;
        }

        public Criteria andCleixingNotLike(String value) {
            addCriterion("cleixing not like", value, "cleixing");
            return (Criteria) this;
        }

        public Criteria andCleixingIn(List<String> values) {
            addCriterion("cleixing in", values, "cleixing");
            return (Criteria) this;
        }

        public Criteria andCleixingNotIn(List<String> values) {
            addCriterion("cleixing not in", values, "cleixing");
            return (Criteria) this;
        }

        public Criteria andCleixingBetween(String value1, String value2) {
            addCriterion("cleixing between", value1, value2, "cleixing");
            return (Criteria) this;
        }

        public Criteria andCleixingNotBetween(String value1, String value2) {
            addCriterion("cleixing not between", value1, value2, "cleixing");
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