package com.whwj.entity.zzx;

import java.util.ArrayList;
import java.util.Date;
import java.util.Iterator;
import java.util.List;

public class CheliangshenqingExample {
    protected String orderByClause;

    protected boolean distinct;

    protected List<Criteria> oredCriteria;

    public CheliangshenqingExample() {
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

        public Criteria andShenqingrenidIsNull() {
            addCriterion("shenqingrenid is null");
            return (Criteria) this;
        }

        public Criteria andShenqingrenidIsNotNull() {
            addCriterion("shenqingrenid is not null");
            return (Criteria) this;
        }

        public Criteria andShenqingrenidEqualTo(Integer value) {
            addCriterion("shenqingrenid =", value, "shenqingrenid");
            return (Criteria) this;
        }

        public Criteria andShenqingrenidNotEqualTo(Integer value) {
            addCriterion("shenqingrenid <>", value, "shenqingrenid");
            return (Criteria) this;
        }

        public Criteria andShenqingrenidGreaterThan(Integer value) {
            addCriterion("shenqingrenid >", value, "shenqingrenid");
            return (Criteria) this;
        }

        public Criteria andShenqingrenidGreaterThanOrEqualTo(Integer value) {
            addCriterion("shenqingrenid >=", value, "shenqingrenid");
            return (Criteria) this;
        }

        public Criteria andShenqingrenidLessThan(Integer value) {
            addCriterion("shenqingrenid <", value, "shenqingrenid");
            return (Criteria) this;
        }

        public Criteria andShenqingrenidLessThanOrEqualTo(Integer value) {
            addCriterion("shenqingrenid <=", value, "shenqingrenid");
            return (Criteria) this;
        }

        public Criteria andShenqingrenidIn(List<Integer> values) {
            addCriterion("shenqingrenid in", values, "shenqingrenid");
            return (Criteria) this;
        }

        public Criteria andShenqingrenidNotIn(List<Integer> values) {
            addCriterion("shenqingrenid not in", values, "shenqingrenid");
            return (Criteria) this;
        }

        public Criteria andShenqingrenidBetween(Integer value1, Integer value2) {
            addCriterion("shenqingrenid between", value1, value2, "shenqingrenid");
            return (Criteria) this;
        }

        public Criteria andShenqingrenidNotBetween(Integer value1, Integer value2) {
            addCriterion("shenqingrenid not between", value1, value2, "shenqingrenid");
            return (Criteria) this;
        }

        public Criteria andShenqingcheliangIsNull() {
            addCriterion("shenqingcheliang is null");
            return (Criteria) this;
        }

        public Criteria andShenqingcheliangIsNotNull() {
            addCriterion("shenqingcheliang is not null");
            return (Criteria) this;
        }

        public Criteria andShenqingcheliangEqualTo(Integer value) {
            addCriterion("shenqingcheliang =", value, "shenqingcheliang");
            return (Criteria) this;
        }

        public Criteria andShenqingcheliangNotEqualTo(Integer value) {
            addCriterion("shenqingcheliang <>", value, "shenqingcheliang");
            return (Criteria) this;
        }

        public Criteria andShenqingcheliangGreaterThan(Integer value) {
            addCriterion("shenqingcheliang >", value, "shenqingcheliang");
            return (Criteria) this;
        }

        public Criteria andShenqingcheliangGreaterThanOrEqualTo(Integer value) {
            addCriterion("shenqingcheliang >=", value, "shenqingcheliang");
            return (Criteria) this;
        }

        public Criteria andShenqingcheliangLessThan(Integer value) {
            addCriterion("shenqingcheliang <", value, "shenqingcheliang");
            return (Criteria) this;
        }

        public Criteria andShenqingcheliangLessThanOrEqualTo(Integer value) {
            addCriterion("shenqingcheliang <=", value, "shenqingcheliang");
            return (Criteria) this;
        }

        public Criteria andShenqingcheliangIn(List<Integer> values) {
            addCriterion("shenqingcheliang in", values, "shenqingcheliang");
            return (Criteria) this;
        }

        public Criteria andShenqingcheliangNotIn(List<Integer> values) {
            addCriterion("shenqingcheliang not in", values, "shenqingcheliang");
            return (Criteria) this;
        }

        public Criteria andShenqingcheliangBetween(Integer value1, Integer value2) {
            addCriterion("shenqingcheliang between", value1, value2, "shenqingcheliang");
            return (Criteria) this;
        }

        public Criteria andShenqingcheliangNotBetween(Integer value1, Integer value2) {
            addCriterion("shenqingcheliang not between", value1, value2, "shenqingcheliang");
            return (Criteria) this;
        }

        public Criteria andFuzerenidIsNull() {
            addCriterion("fuzerenid is null");
            return (Criteria) this;
        }

        public Criteria andFuzerenidIsNotNull() {
            addCriterion("fuzerenid is not null");
            return (Criteria) this;
        }

        public Criteria andFuzerenidEqualTo(Integer value) {
            addCriterion("fuzerenid =", value, "fuzerenid");
            return (Criteria) this;
        }

        public Criteria andFuzerenidNotEqualTo(Integer value) {
            addCriterion("fuzerenid <>", value, "fuzerenid");
            return (Criteria) this;
        }

        public Criteria andFuzerenidGreaterThan(Integer value) {
            addCriterion("fuzerenid >", value, "fuzerenid");
            return (Criteria) this;
        }

        public Criteria andFuzerenidGreaterThanOrEqualTo(Integer value) {
            addCriterion("fuzerenid >=", value, "fuzerenid");
            return (Criteria) this;
        }

        public Criteria andFuzerenidLessThan(Integer value) {
            addCriterion("fuzerenid <", value, "fuzerenid");
            return (Criteria) this;
        }

        public Criteria andFuzerenidLessThanOrEqualTo(Integer value) {
            addCriterion("fuzerenid <=", value, "fuzerenid");
            return (Criteria) this;
        }

        public Criteria andFuzerenidIn(List<Integer> values) {
            addCriterion("fuzerenid in", values, "fuzerenid");
            return (Criteria) this;
        }

        public Criteria andFuzerenidNotIn(List<Integer> values) {
            addCriterion("fuzerenid not in", values, "fuzerenid");
            return (Criteria) this;
        }

        public Criteria andFuzerenidBetween(Integer value1, Integer value2) {
            addCriterion("fuzerenid between", value1, value2, "fuzerenid");
            return (Criteria) this;
        }

        public Criteria andFuzerenidNotBetween(Integer value1, Integer value2) {
            addCriterion("fuzerenid not between", value1, value2, "fuzerenid");
            return (Criteria) this;
        }

        public Criteria andShenqingshijianIsNull() {
            addCriterion("shenqingshijian is null");
            return (Criteria) this;
        }

        public Criteria andShenqingshijianIsNotNull() {
            addCriterion("shenqingshijian is not null");
            return (Criteria) this;
        }

        public Criteria andShenqingshijianEqualTo(Date value) {
            addCriterionForJDBCTime("shenqingshijian =", value, "shenqingshijian");
            return (Criteria) this;
        }

        public Criteria andShenqingshijianNotEqualTo(Date value) {
            addCriterionForJDBCTime("shenqingshijian <>", value, "shenqingshijian");
            return (Criteria) this;
        }

        public Criteria andShenqingshijianGreaterThan(Date value) {
            addCriterionForJDBCTime("shenqingshijian >", value, "shenqingshijian");
            return (Criteria) this;
        }

        public Criteria andShenqingshijianGreaterThanOrEqualTo(Date value) {
            addCriterionForJDBCTime("shenqingshijian >=", value, "shenqingshijian");
            return (Criteria) this;
        }

        public Criteria andShenqingshijianLessThan(Date value) {
            addCriterionForJDBCTime("shenqingshijian <", value, "shenqingshijian");
            return (Criteria) this;
        }

        public Criteria andShenqingshijianLessThanOrEqualTo(Date value) {
            addCriterionForJDBCTime("shenqingshijian <=", value, "shenqingshijian");
            return (Criteria) this;
        }

        public Criteria andShenqingshijianIn(List<Date> values) {
            addCriterionForJDBCTime("shenqingshijian in", values, "shenqingshijian");
            return (Criteria) this;
        }

        public Criteria andShenqingshijianNotIn(List<Date> values) {
            addCriterionForJDBCTime("shenqingshijian not in", values, "shenqingshijian");
            return (Criteria) this;
        }

        public Criteria andShenqingshijianBetween(Date value1, Date value2) {
            addCriterionForJDBCTime("shenqingshijian between", value1, value2, "shenqingshijian");
            return (Criteria) this;
        }

        public Criteria andShenqingshijianNotBetween(Date value1, Date value2) {
            addCriterionForJDBCTime("shenqingshijian not between", value1, value2, "shenqingshijian");
            return (Criteria) this;
        }

        public Criteria andShenqingdaoIsNull() {
            addCriterion("shenqingdao is null");
            return (Criteria) this;
        }

        public Criteria andShenqingdaoIsNotNull() {
            addCriterion("shenqingdao is not null");
            return (Criteria) this;
        }

        public Criteria andShenqingdaoEqualTo(Date value) {
            addCriterionForJDBCTime("shenqingdao =", value, "shenqingdao");
            return (Criteria) this;
        }

        public Criteria andShenqingdaoNotEqualTo(Date value) {
            addCriterionForJDBCTime("shenqingdao <>", value, "shenqingdao");
            return (Criteria) this;
        }

        public Criteria andShenqingdaoGreaterThan(Date value) {
            addCriterionForJDBCTime("shenqingdao >", value, "shenqingdao");
            return (Criteria) this;
        }

        public Criteria andShenqingdaoGreaterThanOrEqualTo(Date value) {
            addCriterionForJDBCTime("shenqingdao >=", value, "shenqingdao");
            return (Criteria) this;
        }

        public Criteria andShenqingdaoLessThan(Date value) {
            addCriterionForJDBCTime("shenqingdao <", value, "shenqingdao");
            return (Criteria) this;
        }

        public Criteria andShenqingdaoLessThanOrEqualTo(Date value) {
            addCriterionForJDBCTime("shenqingdao <=", value, "shenqingdao");
            return (Criteria) this;
        }

        public Criteria andShenqingdaoIn(List<Date> values) {
            addCriterionForJDBCTime("shenqingdao in", values, "shenqingdao");
            return (Criteria) this;
        }

        public Criteria andShenqingdaoNotIn(List<Date> values) {
            addCriterionForJDBCTime("shenqingdao not in", values, "shenqingdao");
            return (Criteria) this;
        }

        public Criteria andShenqingdaoBetween(Date value1, Date value2) {
            addCriterionForJDBCTime("shenqingdao between", value1, value2, "shenqingdao");
            return (Criteria) this;
        }

        public Criteria andShenqingdaoNotBetween(Date value1, Date value2) {
            addCriterionForJDBCTime("shenqingdao not between", value1, value2, "shenqingdao");
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