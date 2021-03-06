package com.whwj.entity.zzx;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;

public class JunshixunlianbiaoExample {
    protected String orderByClause;

    protected boolean distinct;

    protected List<Criteria> oredCriteria;

    public JunshixunlianbiaoExample() {
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

        public Criteria andXunlianshijianIsNull() {
            addCriterion("xunlianshijian is null");
            return (Criteria) this;
        }

        public Criteria andXunlianshijianIsNotNull() {
            addCriterion("xunlianshijian is not null");
            return (Criteria) this;
        }

        public Criteria andXunlianshijianEqualTo(Date value) {
            addCriterion("xunlianshijian =", value, "xunlianshijian");
            return (Criteria) this;
        }

        public Criteria andXunlianshijianNotEqualTo(Date value) {
            addCriterion("xunlianshijian <>", value, "xunlianshijian");
            return (Criteria) this;
        }

        public Criteria andXunlianshijianGreaterThan(Date value) {
            addCriterion("xunlianshijian >", value, "xunlianshijian");
            return (Criteria) this;
        }

        public Criteria andXunlianshijianGreaterThanOrEqualTo(Date value) {
            addCriterion("xunlianshijian >=", value, "xunlianshijian");
            return (Criteria) this;
        }

        public Criteria andXunlianshijianLessThan(Date value) {
            addCriterion("xunlianshijian <", value, "xunlianshijian");
            return (Criteria) this;
        }

        public Criteria andXunlianshijianLessThanOrEqualTo(Date value) {
            addCriterion("xunlianshijian <=", value, "xunlianshijian");
            return (Criteria) this;
        }

        public Criteria andXunlianshijianIn(List<Date> values) {
            addCriterion("xunlianshijian in", values, "xunlianshijian");
            return (Criteria) this;
        }

        public Criteria andXunlianshijianNotIn(List<Date> values) {
            addCriterion("xunlianshijian not in", values, "xunlianshijian");
            return (Criteria) this;
        }

        public Criteria andXunlianshijianBetween(Date value1, Date value2) {
            addCriterion("xunlianshijian between", value1, value2, "xunlianshijian");
            return (Criteria) this;
        }

        public Criteria andXunlianshijianNotBetween(Date value1, Date value2) {
            addCriterion("xunlianshijian not between", value1, value2, "xunlianshijian");
            return (Criteria) this;
        }

        public Criteria andJieshushijianIsNull() {
            addCriterion("jieshushijian is null");
            return (Criteria) this;
        }

        public Criteria andJieshushijianIsNotNull() {
            addCriterion("jieshushijian is not null");
            return (Criteria) this;
        }

        public Criteria andJieshushijianEqualTo(Date value) {
            addCriterion("jieshushijian =", value, "jieshushijian");
            return (Criteria) this;
        }

        public Criteria andJieshushijianNotEqualTo(Date value) {
            addCriterion("jieshushijian <>", value, "jieshushijian");
            return (Criteria) this;
        }

        public Criteria andJieshushijianGreaterThan(Date value) {
            addCriterion("jieshushijian >", value, "jieshushijian");
            return (Criteria) this;
        }

        public Criteria andJieshushijianGreaterThanOrEqualTo(Date value) {
            addCriterion("jieshushijian >=", value, "jieshushijian");
            return (Criteria) this;
        }

        public Criteria andJieshushijianLessThan(Date value) {
            addCriterion("jieshushijian <", value, "jieshushijian");
            return (Criteria) this;
        }

        public Criteria andJieshushijianLessThanOrEqualTo(Date value) {
            addCriterion("jieshushijian <=", value, "jieshushijian");
            return (Criteria) this;
        }

        public Criteria andJieshushijianIn(List<Date> values) {
            addCriterion("jieshushijian in", values, "jieshushijian");
            return (Criteria) this;
        }

        public Criteria andJieshushijianNotIn(List<Date> values) {
            addCriterion("jieshushijian not in", values, "jieshushijian");
            return (Criteria) this;
        }

        public Criteria andJieshushijianBetween(Date value1, Date value2) {
            addCriterion("jieshushijian between", value1, value2, "jieshushijian");
            return (Criteria) this;
        }

        public Criteria andJieshushijianNotBetween(Date value1, Date value2) {
            addCriterion("jieshushijian not between", value1, value2, "jieshushijian");
            return (Criteria) this;
        }

        public Criteria andKemuidIsNull() {
            addCriterion("kemuid is null");
            return (Criteria) this;
        }

        public Criteria andKemuidIsNotNull() {
            addCriterion("kemuid is not null");
            return (Criteria) this;
        }

        public Criteria andKemuidEqualTo(Integer value) {
            addCriterion("kemuid =", value, "kemuid");
            return (Criteria) this;
        }

        public Criteria andKemuidNotEqualTo(Integer value) {
            addCriterion("kemuid <>", value, "kemuid");
            return (Criteria) this;
        }

        public Criteria andKemuidGreaterThan(Integer value) {
            addCriterion("kemuid >", value, "kemuid");
            return (Criteria) this;
        }

        public Criteria andKemuidGreaterThanOrEqualTo(Integer value) {
            addCriterion("kemuid >=", value, "kemuid");
            return (Criteria) this;
        }

        public Criteria andKemuidLessThan(Integer value) {
            addCriterion("kemuid <", value, "kemuid");
            return (Criteria) this;
        }

        public Criteria andKemuidLessThanOrEqualTo(Integer value) {
            addCriterion("kemuid <=", value, "kemuid");
            return (Criteria) this;
        }

        public Criteria andKemuidIn(List<Integer> values) {
            addCriterion("kemuid in", values, "kemuid");
            return (Criteria) this;
        }

        public Criteria andKemuidNotIn(List<Integer> values) {
            addCriterion("kemuid not in", values, "kemuid");
            return (Criteria) this;
        }

        public Criteria andKemuidBetween(Integer value1, Integer value2) {
            addCriterion("kemuid between", value1, value2, "kemuid");
            return (Criteria) this;
        }

        public Criteria andKemuidNotBetween(Integer value1, Integer value2) {
            addCriterion("kemuid not between", value1, value2, "kemuid");
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