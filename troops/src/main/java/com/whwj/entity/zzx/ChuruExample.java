package com.whwj.entity.zzx;

import java.util.ArrayList;
import java.util.Date;
import java.util.Iterator;
import java.util.List;

public class ChuruExample {
    protected String orderByClause;

    protected boolean distinct;

    protected List<Criteria> oredCriteria;

    public ChuruExample() {
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

        protected void addCriterionForJDBCTime(String condition, Date value, String property) {
            if (value == null) {
                throw new RuntimeException("Value for " + property + " cannot be null");
            }
            addCriterion(condition, new java.sql.Time(value.getTime()), property);
        }

        protected void addCriterionForJDBCTime(String condition, List<Date> values, String property) {
            if (values == null || values.size() == 0) {
                throw new RuntimeException("Value list for " + property + " cannot be null or empty");
            }
            List<java.sql.Time> timeList = new ArrayList<java.sql.Time>();
            Iterator<Date> iter = values.iterator();
            while (iter.hasNext()) {
                timeList.add(new java.sql.Time(iter.next().getTime()));
            }
            addCriterion(condition, timeList, property);
        }

        protected void addCriterionForJDBCTime(String condition, Date value1, Date value2, String property) {
            if (value1 == null || value2 == null) {
                throw new RuntimeException("Between values for " + property + " cannot be null");
            }
            addCriterion(condition, new java.sql.Time(value1.getTime()), new java.sql.Time(value2.getTime()), property);
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

        public Criteria andDanweiidIsNull() {
            addCriterion("danweiID is null");
            return (Criteria) this;
        }

        public Criteria andDanweiidIsNotNull() {
            addCriterion("danweiID is not null");
            return (Criteria) this;
        }

        public Criteria andDanweiidEqualTo(Integer value) {
            addCriterion("danweiID =", value, "danweiid");
            return (Criteria) this;
        }

        public Criteria andDanweiidNotEqualTo(Integer value) {
            addCriterion("danweiID <>", value, "danweiid");
            return (Criteria) this;
        }

        public Criteria andDanweiidGreaterThan(Integer value) {
            addCriterion("danweiID >", value, "danweiid");
            return (Criteria) this;
        }

        public Criteria andDanweiidGreaterThanOrEqualTo(Integer value) {
            addCriterion("danweiID >=", value, "danweiid");
            return (Criteria) this;
        }

        public Criteria andDanweiidLessThan(Integer value) {
            addCriterion("danweiID <", value, "danweiid");
            return (Criteria) this;
        }

        public Criteria andDanweiidLessThanOrEqualTo(Integer value) {
            addCriterion("danweiID <=", value, "danweiid");
            return (Criteria) this;
        }

        public Criteria andDanweiidIn(List<Integer> values) {
            addCriterion("danweiID in", values, "danweiid");
            return (Criteria) this;
        }

        public Criteria andDanweiidNotIn(List<Integer> values) {
            addCriterion("danweiID not in", values, "danweiid");
            return (Criteria) this;
        }

        public Criteria andDanweiidBetween(Integer value1, Integer value2) {
            addCriterion("danweiID between", value1, value2, "danweiid");
            return (Criteria) this;
        }

        public Criteria andDanweiidNotBetween(Integer value1, Integer value2) {
            addCriterion("danweiID not between", value1, value2, "danweiid");
            return (Criteria) this;
        }

        public Criteria andRudanweiidIsNull() {
            addCriterion("rudanweiID is null");
            return (Criteria) this;
        }

        public Criteria andRudanweiidIsNotNull() {
            addCriterion("rudanweiID is not null");
            return (Criteria) this;
        }

        public Criteria andRudanweiidEqualTo(Integer value) {
            addCriterion("rudanweiID =", value, "rudanweiid");
            return (Criteria) this;
        }

        public Criteria andRudanweiidNotEqualTo(Integer value) {
            addCriterion("rudanweiID <>", value, "rudanweiid");
            return (Criteria) this;
        }

        public Criteria andRudanweiidGreaterThan(Integer value) {
            addCriterion("rudanweiID >", value, "rudanweiid");
            return (Criteria) this;
        }

        public Criteria andRudanweiidGreaterThanOrEqualTo(Integer value) {
            addCriterion("rudanweiID >=", value, "rudanweiid");
            return (Criteria) this;
        }

        public Criteria andRudanweiidLessThan(Integer value) {
            addCriterion("rudanweiID <", value, "rudanweiid");
            return (Criteria) this;
        }

        public Criteria andRudanweiidLessThanOrEqualTo(Integer value) {
            addCriterion("rudanweiID <=", value, "rudanweiid");
            return (Criteria) this;
        }

        public Criteria andRudanweiidIn(List<Integer> values) {
            addCriterion("rudanweiID in", values, "rudanweiid");
            return (Criteria) this;
        }

        public Criteria andRudanweiidNotIn(List<Integer> values) {
            addCriterion("rudanweiID not in", values, "rudanweiid");
            return (Criteria) this;
        }

        public Criteria andRudanweiidBetween(Integer value1, Integer value2) {
            addCriterion("rudanweiID between", value1, value2, "rudanweiid");
            return (Criteria) this;
        }

        public Criteria andRudanweiidNotBetween(Integer value1, Integer value2) {
            addCriterion("rudanweiID not between", value1, value2, "rudanweiid");
            return (Criteria) this;
        }

        public Criteria andRnameIsNull() {
            addCriterion("rname is null");
            return (Criteria) this;
        }

        public Criteria andRnameIsNotNull() {
            addCriterion("rname is not null");
            return (Criteria) this;
        }

        public Criteria andRnameEqualTo(String value) {
            addCriterion("rname =", value, "rname");
            return (Criteria) this;
        }

        public Criteria andRnameNotEqualTo(String value) {
            addCriterion("rname <>", value, "rname");
            return (Criteria) this;
        }

        public Criteria andRnameGreaterThan(String value) {
            addCriterion("rname >", value, "rname");
            return (Criteria) this;
        }

        public Criteria andRnameGreaterThanOrEqualTo(String value) {
            addCriterion("rname >=", value, "rname");
            return (Criteria) this;
        }

        public Criteria andRnameLessThan(String value) {
            addCriterion("rname <", value, "rname");
            return (Criteria) this;
        }

        public Criteria andRnameLessThanOrEqualTo(String value) {
            addCriterion("rname <=", value, "rname");
            return (Criteria) this;
        }

        public Criteria andRnameLike(String value) {
            addCriterion("rname like", value, "rname");
            return (Criteria) this;
        }

        public Criteria andRnameNotLike(String value) {
            addCriterion("rname not like", value, "rname");
            return (Criteria) this;
        }

        public Criteria andRnameIn(List<String> values) {
            addCriterion("rname in", values, "rname");
            return (Criteria) this;
        }

        public Criteria andRnameNotIn(List<String> values) {
            addCriterion("rname not in", values, "rname");
            return (Criteria) this;
        }

        public Criteria andRnameBetween(String value1, String value2) {
            addCriterion("rname between", value1, value2, "rname");
            return (Criteria) this;
        }

        public Criteria andRnameNotBetween(String value1, String value2) {
            addCriterion("rname not between", value1, value2, "rname");
            return (Criteria) this;
        }

        public Criteria andRushijianIsNull() {
            addCriterion("rushijian is null");
            return (Criteria) this;
        }

        public Criteria andRushijianIsNotNull() {
            addCriterion("rushijian is not null");
            return (Criteria) this;
        }

        public Criteria andRushijianEqualTo(Date value) {
            addCriterionForJDBCTime("rushijian =", value, "rushijian");
            return (Criteria) this;
        }

        public Criteria andRushijianNotEqualTo(Date value) {
            addCriterionForJDBCTime("rushijian <>", value, "rushijian");
            return (Criteria) this;
        }

        public Criteria andRushijianGreaterThan(Date value) {
            addCriterionForJDBCTime("rushijian >", value, "rushijian");
            return (Criteria) this;
        }

        public Criteria andRushijianGreaterThanOrEqualTo(Date value) {
            addCriterionForJDBCTime("rushijian >=", value, "rushijian");
            return (Criteria) this;
        }

        public Criteria andRushijianLessThan(Date value) {
            addCriterionForJDBCTime("rushijian <", value, "rushijian");
            return (Criteria) this;
        }

        public Criteria andRushijianLessThanOrEqualTo(Date value) {
            addCriterionForJDBCTime("rushijian <=", value, "rushijian");
            return (Criteria) this;
        }

        public Criteria andRushijianIn(List<Date> values) {
            addCriterionForJDBCTime("rushijian in", values, "rushijian");
            return (Criteria) this;
        }

        public Criteria andRushijianNotIn(List<Date> values) {
            addCriterionForJDBCTime("rushijian not in", values, "rushijian");
            return (Criteria) this;
        }

        public Criteria andRushijianBetween(Date value1, Date value2) {
            addCriterionForJDBCTime("rushijian between", value1, value2, "rushijian");
            return (Criteria) this;
        }

        public Criteria andRushijianNotBetween(Date value1, Date value2) {
            addCriterionForJDBCTime("rushijian not between", value1, value2, "rushijian");
            return (Criteria) this;
        }

        public Criteria andChushijianIsNull() {
            addCriterion("chushijian is null");
            return (Criteria) this;
        }

        public Criteria andChushijianIsNotNull() {
            addCriterion("chushijian is not null");
            return (Criteria) this;
        }

        public Criteria andChushijianEqualTo(Date value) {
            addCriterionForJDBCTime("chushijian =", value, "chushijian");
            return (Criteria) this;
        }

        public Criteria andChushijianNotEqualTo(Date value) {
            addCriterionForJDBCTime("chushijian <>", value, "chushijian");
            return (Criteria) this;
        }

        public Criteria andChushijianGreaterThan(Date value) {
            addCriterionForJDBCTime("chushijian >", value, "chushijian");
            return (Criteria) this;
        }

        public Criteria andChushijianGreaterThanOrEqualTo(Date value) {
            addCriterionForJDBCTime("chushijian >=", value, "chushijian");
            return (Criteria) this;
        }

        public Criteria andChushijianLessThan(Date value) {
            addCriterionForJDBCTime("chushijian <", value, "chushijian");
            return (Criteria) this;
        }

        public Criteria andChushijianLessThanOrEqualTo(Date value) {
            addCriterionForJDBCTime("chushijian <=", value, "chushijian");
            return (Criteria) this;
        }

        public Criteria andChushijianIn(List<Date> values) {
            addCriterionForJDBCTime("chushijian in", values, "chushijian");
            return (Criteria) this;
        }

        public Criteria andChushijianNotIn(List<Date> values) {
            addCriterionForJDBCTime("chushijian not in", values, "chushijian");
            return (Criteria) this;
        }

        public Criteria andChushijianBetween(Date value1, Date value2) {
            addCriterionForJDBCTime("chushijian between", value1, value2, "chushijian");
            return (Criteria) this;
        }

        public Criteria andChushijianNotBetween(Date value1, Date value2) {
            addCriterionForJDBCTime("chushijian not between", value1, value2, "chushijian");
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