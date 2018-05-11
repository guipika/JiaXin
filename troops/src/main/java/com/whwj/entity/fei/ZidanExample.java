package com.whwj.entity.fei;

import java.util.ArrayList;
import java.util.List;

public class ZidanExample {
    protected String orderByClause;

    protected boolean distinct;

    protected List<Criteria> oredCriteria;

    public ZidanExample() {
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

        public Criteria andKoujingIsNull() {
            addCriterion("koujing is null");
            return (Criteria) this;
        }

        public Criteria andKoujingIsNotNull() {
            addCriterion("koujing is not null");
            return (Criteria) this;
        }

        public Criteria andKoujingEqualTo(String value) {
            addCriterion("koujing =", value, "koujing");
            return (Criteria) this;
        }

        public Criteria andKoujingNotEqualTo(String value) {
            addCriterion("koujing <>", value, "koujing");
            return (Criteria) this;
        }

        public Criteria andKoujingGreaterThan(String value) {
            addCriterion("koujing >", value, "koujing");
            return (Criteria) this;
        }

        public Criteria andKoujingGreaterThanOrEqualTo(String value) {
            addCriterion("koujing >=", value, "koujing");
            return (Criteria) this;
        }

        public Criteria andKoujingLessThan(String value) {
            addCriterion("koujing <", value, "koujing");
            return (Criteria) this;
        }

        public Criteria andKoujingLessThanOrEqualTo(String value) {
            addCriterion("koujing <=", value, "koujing");
            return (Criteria) this;
        }

        public Criteria andKoujingLike(String value) {
            addCriterion("koujing like", value, "koujing");
            return (Criteria) this;
        }

        public Criteria andKoujingNotLike(String value) {
            addCriterion("koujing not like", value, "koujing");
            return (Criteria) this;
        }

        public Criteria andKoujingIn(List<String> values) {
            addCriterion("koujing in", values, "koujing");
            return (Criteria) this;
        }

        public Criteria andKoujingNotIn(List<String> values) {
            addCriterion("koujing not in", values, "koujing");
            return (Criteria) this;
        }

        public Criteria andKoujingBetween(String value1, String value2) {
            addCriterion("koujing between", value1, value2, "koujing");
            return (Criteria) this;
        }

        public Criteria andKoujingNotBetween(String value1, String value2) {
            addCriterion("koujing not between", value1, value2, "koujing");
            return (Criteria) this;
        }

        public Criteria andDankechangduIsNull() {
            addCriterion("dankechangdu is null");
            return (Criteria) this;
        }

        public Criteria andDankechangduIsNotNull() {
            addCriterion("dankechangdu is not null");
            return (Criteria) this;
        }

        public Criteria andDankechangduEqualTo(String value) {
            addCriterion("dankechangdu =", value, "dankechangdu");
            return (Criteria) this;
        }

        public Criteria andDankechangduNotEqualTo(String value) {
            addCriterion("dankechangdu <>", value, "dankechangdu");
            return (Criteria) this;
        }

        public Criteria andDankechangduGreaterThan(String value) {
            addCriterion("dankechangdu >", value, "dankechangdu");
            return (Criteria) this;
        }

        public Criteria andDankechangduGreaterThanOrEqualTo(String value) {
            addCriterion("dankechangdu >=", value, "dankechangdu");
            return (Criteria) this;
        }

        public Criteria andDankechangduLessThan(String value) {
            addCriterion("dankechangdu <", value, "dankechangdu");
            return (Criteria) this;
        }

        public Criteria andDankechangduLessThanOrEqualTo(String value) {
            addCriterion("dankechangdu <=", value, "dankechangdu");
            return (Criteria) this;
        }

        public Criteria andDankechangduLike(String value) {
            addCriterion("dankechangdu like", value, "dankechangdu");
            return (Criteria) this;
        }

        public Criteria andDankechangduNotLike(String value) {
            addCriterion("dankechangdu not like", value, "dankechangdu");
            return (Criteria) this;
        }

        public Criteria andDankechangduIn(List<String> values) {
            addCriterion("dankechangdu in", values, "dankechangdu");
            return (Criteria) this;
        }

        public Criteria andDankechangduNotIn(List<String> values) {
            addCriterion("dankechangdu not in", values, "dankechangdu");
            return (Criteria) this;
        }

        public Criteria andDankechangduBetween(String value1, String value2) {
            addCriterion("dankechangdu between", value1, value2, "dankechangdu");
            return (Criteria) this;
        }

        public Criteria andDankechangduNotBetween(String value1, String value2) {
            addCriterion("dankechangdu not between", value1, value2, "dankechangdu");
            return (Criteria) this;
        }

        public Criteria andDankexingzhuangIsNull() {
            addCriterion("dankexingzhuang is null");
            return (Criteria) this;
        }

        public Criteria andDankexingzhuangIsNotNull() {
            addCriterion("dankexingzhuang is not null");
            return (Criteria) this;
        }

        public Criteria andDankexingzhuangEqualTo(String value) {
            addCriterion("dankexingzhuang =", value, "dankexingzhuang");
            return (Criteria) this;
        }

        public Criteria andDankexingzhuangNotEqualTo(String value) {
            addCriterion("dankexingzhuang <>", value, "dankexingzhuang");
            return (Criteria) this;
        }

        public Criteria andDankexingzhuangGreaterThan(String value) {
            addCriterion("dankexingzhuang >", value, "dankexingzhuang");
            return (Criteria) this;
        }

        public Criteria andDankexingzhuangGreaterThanOrEqualTo(String value) {
            addCriterion("dankexingzhuang >=", value, "dankexingzhuang");
            return (Criteria) this;
        }

        public Criteria andDankexingzhuangLessThan(String value) {
            addCriterion("dankexingzhuang <", value, "dankexingzhuang");
            return (Criteria) this;
        }

        public Criteria andDankexingzhuangLessThanOrEqualTo(String value) {
            addCriterion("dankexingzhuang <=", value, "dankexingzhuang");
            return (Criteria) this;
        }

        public Criteria andDankexingzhuangLike(String value) {
            addCriterion("dankexingzhuang like", value, "dankexingzhuang");
            return (Criteria) this;
        }

        public Criteria andDankexingzhuangNotLike(String value) {
            addCriterion("dankexingzhuang not like", value, "dankexingzhuang");
            return (Criteria) this;
        }

        public Criteria andDankexingzhuangIn(List<String> values) {
            addCriterion("dankexingzhuang in", values, "dankexingzhuang");
            return (Criteria) this;
        }

        public Criteria andDankexingzhuangNotIn(List<String> values) {
            addCriterion("dankexingzhuang not in", values, "dankexingzhuang");
            return (Criteria) this;
        }

        public Criteria andDankexingzhuangBetween(String value1, String value2) {
            addCriterion("dankexingzhuang between", value1, value2, "dankexingzhuang");
            return (Criteria) this;
        }

        public Criteria andDankexingzhuangNotBetween(String value1, String value2) {
            addCriterion("dankexingzhuang not between", value1, value2, "dankexingzhuang");
            return (Criteria) this;
        }

        public Criteria andFuzhuIsNull() {
            addCriterion("fuzhu is null");
            return (Criteria) this;
        }

        public Criteria andFuzhuIsNotNull() {
            addCriterion("fuzhu is not null");
            return (Criteria) this;
        }

        public Criteria andFuzhuEqualTo(String value) {
            addCriterion("fuzhu =", value, "fuzhu");
            return (Criteria) this;
        }

        public Criteria andFuzhuNotEqualTo(String value) {
            addCriterion("fuzhu <>", value, "fuzhu");
            return (Criteria) this;
        }

        public Criteria andFuzhuGreaterThan(String value) {
            addCriterion("fuzhu >", value, "fuzhu");
            return (Criteria) this;
        }

        public Criteria andFuzhuGreaterThanOrEqualTo(String value) {
            addCriterion("fuzhu >=", value, "fuzhu");
            return (Criteria) this;
        }

        public Criteria andFuzhuLessThan(String value) {
            addCriterion("fuzhu <", value, "fuzhu");
            return (Criteria) this;
        }

        public Criteria andFuzhuLessThanOrEqualTo(String value) {
            addCriterion("fuzhu <=", value, "fuzhu");
            return (Criteria) this;
        }

        public Criteria andFuzhuLike(String value) {
            addCriterion("fuzhu like", value, "fuzhu");
            return (Criteria) this;
        }

        public Criteria andFuzhuNotLike(String value) {
            addCriterion("fuzhu not like", value, "fuzhu");
            return (Criteria) this;
        }

        public Criteria andFuzhuIn(List<String> values) {
            addCriterion("fuzhu in", values, "fuzhu");
            return (Criteria) this;
        }

        public Criteria andFuzhuNotIn(List<String> values) {
            addCriterion("fuzhu not in", values, "fuzhu");
            return (Criteria) this;
        }

        public Criteria andFuzhuBetween(String value1, String value2) {
            addCriterion("fuzhu between", value1, value2, "fuzhu");
            return (Criteria) this;
        }

        public Criteria andFuzhuNotBetween(String value1, String value2) {
            addCriterion("fuzhu not between", value1, value2, "fuzhu");
            return (Criteria) this;
        }

        public Criteria andBeizhuIsNull() {
            addCriterion("beizhu is null");
            return (Criteria) this;
        }

        public Criteria andBeizhuIsNotNull() {
            addCriterion("beizhu is not null");
            return (Criteria) this;
        }

        public Criteria andBeizhuEqualTo(String value) {
            addCriterion("beizhu =", value, "beizhu");
            return (Criteria) this;
        }

        public Criteria andBeizhuNotEqualTo(String value) {
            addCriterion("beizhu <>", value, "beizhu");
            return (Criteria) this;
        }

        public Criteria andBeizhuGreaterThan(String value) {
            addCriterion("beizhu >", value, "beizhu");
            return (Criteria) this;
        }

        public Criteria andBeizhuGreaterThanOrEqualTo(String value) {
            addCriterion("beizhu >=", value, "beizhu");
            return (Criteria) this;
        }

        public Criteria andBeizhuLessThan(String value) {
            addCriterion("beizhu <", value, "beizhu");
            return (Criteria) this;
        }

        public Criteria andBeizhuLessThanOrEqualTo(String value) {
            addCriterion("beizhu <=", value, "beizhu");
            return (Criteria) this;
        }

        public Criteria andBeizhuLike(String value) {
            addCriterion("beizhu like", value, "beizhu");
            return (Criteria) this;
        }

        public Criteria andBeizhuNotLike(String value) {
            addCriterion("beizhu not like", value, "beizhu");
            return (Criteria) this;
        }

        public Criteria andBeizhuIn(List<String> values) {
            addCriterion("beizhu in", values, "beizhu");
            return (Criteria) this;
        }

        public Criteria andBeizhuNotIn(List<String> values) {
            addCriterion("beizhu not in", values, "beizhu");
            return (Criteria) this;
        }

        public Criteria andBeizhuBetween(String value1, String value2) {
            addCriterion("beizhu between", value1, value2, "beizhu");
            return (Criteria) this;
        }

        public Criteria andBeizhuNotBetween(String value1, String value2) {
            addCriterion("beizhu not between", value1, value2, "beizhu");
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