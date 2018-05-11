package com.whwj.entity.zzx;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;

public class JunshikaoheExample {
    protected String orderByClause;

    protected boolean distinct;

    protected List<Criteria> oredCriteria;

    public JunshikaoheExample() {
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

        public Criteria andKaoheshijianIsNull() {
            addCriterion("kaoheshijian is null");
            return (Criteria) this;
        }

        public Criteria andKaoheshijianIsNotNull() {
            addCriterion("kaoheshijian is not null");
            return (Criteria) this;
        }

        public Criteria andKaoheshijianEqualTo(Date value) {
            addCriterion("kaoheshijian =", value, "kaoheshijian");
            return (Criteria) this;
        }

        public Criteria andKaoheshijianNotEqualTo(Date value) {
            addCriterion("kaoheshijian <>", value, "kaoheshijian");
            return (Criteria) this;
        }

        public Criteria andKaoheshijianGreaterThan(Date value) {
            addCriterion("kaoheshijian >", value, "kaoheshijian");
            return (Criteria) this;
        }

        public Criteria andKaoheshijianGreaterThanOrEqualTo(Date value) {
            addCriterion("kaoheshijian >=", value, "kaoheshijian");
            return (Criteria) this;
        }

        public Criteria andKaoheshijianLessThan(Date value) {
            addCriterion("kaoheshijian <", value, "kaoheshijian");
            return (Criteria) this;
        }

        public Criteria andKaoheshijianLessThanOrEqualTo(Date value) {
            addCriterion("kaoheshijian <=", value, "kaoheshijian");
            return (Criteria) this;
        }

        public Criteria andKaoheshijianIn(List<Date> values) {
            addCriterion("kaoheshijian in", values, "kaoheshijian");
            return (Criteria) this;
        }

        public Criteria andKaoheshijianNotIn(List<Date> values) {
            addCriterion("kaoheshijian not in", values, "kaoheshijian");
            return (Criteria) this;
        }

        public Criteria andKaoheshijianBetween(Date value1, Date value2) {
            addCriterion("kaoheshijian between", value1, value2, "kaoheshijian");
            return (Criteria) this;
        }

        public Criteria andKaoheshijianNotBetween(Date value1, Date value2) {
            addCriterion("kaoheshijian not between", value1, value2, "kaoheshijian");
            return (Criteria) this;
        }

        public Criteria andKaoherenyuanidIsNull() {
            addCriterion("kaoherenyuanid is null");
            return (Criteria) this;
        }

        public Criteria andKaoherenyuanidIsNotNull() {
            addCriterion("kaoherenyuanid is not null");
            return (Criteria) this;
        }

        public Criteria andKaoherenyuanidEqualTo(Integer value) {
            addCriterion("kaoherenyuanid =", value, "kaoherenyuanid");
            return (Criteria) this;
        }

        public Criteria andKaoherenyuanidNotEqualTo(Integer value) {
            addCriterion("kaoherenyuanid <>", value, "kaoherenyuanid");
            return (Criteria) this;
        }

        public Criteria andKaoherenyuanidGreaterThan(Integer value) {
            addCriterion("kaoherenyuanid >", value, "kaoherenyuanid");
            return (Criteria) this;
        }

        public Criteria andKaoherenyuanidGreaterThanOrEqualTo(Integer value) {
            addCriterion("kaoherenyuanid >=", value, "kaoherenyuanid");
            return (Criteria) this;
        }

        public Criteria andKaoherenyuanidLessThan(Integer value) {
            addCriterion("kaoherenyuanid <", value, "kaoherenyuanid");
            return (Criteria) this;
        }

        public Criteria andKaoherenyuanidLessThanOrEqualTo(Integer value) {
            addCriterion("kaoherenyuanid <=", value, "kaoherenyuanid");
            return (Criteria) this;
        }

        public Criteria andKaoherenyuanidIn(List<Integer> values) {
            addCriterion("kaoherenyuanid in", values, "kaoherenyuanid");
            return (Criteria) this;
        }

        public Criteria andKaoherenyuanidNotIn(List<Integer> values) {
            addCriterion("kaoherenyuanid not in", values, "kaoherenyuanid");
            return (Criteria) this;
        }

        public Criteria andKaoherenyuanidBetween(Integer value1, Integer value2) {
            addCriterion("kaoherenyuanid between", value1, value2, "kaoherenyuanid");
            return (Criteria) this;
        }

        public Criteria andKaoherenyuanidNotBetween(Integer value1, Integer value2) {
            addCriterion("kaoherenyuanid not between", value1, value2, "kaoherenyuanid");
            return (Criteria) this;
        }

        public Criteria andKaohefuzherenidIsNull() {
            addCriterion("kaohefuzherenid is null");
            return (Criteria) this;
        }

        public Criteria andKaohefuzherenidIsNotNull() {
            addCriterion("kaohefuzherenid is not null");
            return (Criteria) this;
        }

        public Criteria andKaohefuzherenidEqualTo(Integer value) {
            addCriterion("kaohefuzherenid =", value, "kaohefuzherenid");
            return (Criteria) this;
        }

        public Criteria andKaohefuzherenidNotEqualTo(Integer value) {
            addCriterion("kaohefuzherenid <>", value, "kaohefuzherenid");
            return (Criteria) this;
        }

        public Criteria andKaohefuzherenidGreaterThan(Integer value) {
            addCriterion("kaohefuzherenid >", value, "kaohefuzherenid");
            return (Criteria) this;
        }

        public Criteria andKaohefuzherenidGreaterThanOrEqualTo(Integer value) {
            addCriterion("kaohefuzherenid >=", value, "kaohefuzherenid");
            return (Criteria) this;
        }

        public Criteria andKaohefuzherenidLessThan(Integer value) {
            addCriterion("kaohefuzherenid <", value, "kaohefuzherenid");
            return (Criteria) this;
        }

        public Criteria andKaohefuzherenidLessThanOrEqualTo(Integer value) {
            addCriterion("kaohefuzherenid <=", value, "kaohefuzherenid");
            return (Criteria) this;
        }

        public Criteria andKaohefuzherenidIn(List<Integer> values) {
            addCriterion("kaohefuzherenid in", values, "kaohefuzherenid");
            return (Criteria) this;
        }

        public Criteria andKaohefuzherenidNotIn(List<Integer> values) {
            addCriterion("kaohefuzherenid not in", values, "kaohefuzherenid");
            return (Criteria) this;
        }

        public Criteria andKaohefuzherenidBetween(Integer value1, Integer value2) {
            addCriterion("kaohefuzherenid between", value1, value2, "kaohefuzherenid");
            return (Criteria) this;
        }

        public Criteria andKaohefuzherenidNotBetween(Integer value1, Integer value2) {
            addCriterion("kaohefuzherenid not between", value1, value2, "kaohefuzherenid");
            return (Criteria) this;
        }

        public Criteria andKaihekemuidIsNull() {
            addCriterion("kaihekemuid is null");
            return (Criteria) this;
        }

        public Criteria andKaihekemuidIsNotNull() {
            addCriterion("kaihekemuid is not null");
            return (Criteria) this;
        }

        public Criteria andKaihekemuidEqualTo(Integer value) {
            addCriterion("kaihekemuid =", value, "kaihekemuid");
            return (Criteria) this;
        }

        public Criteria andKaihekemuidNotEqualTo(Integer value) {
            addCriterion("kaihekemuid <>", value, "kaihekemuid");
            return (Criteria) this;
        }

        public Criteria andKaihekemuidGreaterThan(Integer value) {
            addCriterion("kaihekemuid >", value, "kaihekemuid");
            return (Criteria) this;
        }

        public Criteria andKaihekemuidGreaterThanOrEqualTo(Integer value) {
            addCriterion("kaihekemuid >=", value, "kaihekemuid");
            return (Criteria) this;
        }

        public Criteria andKaihekemuidLessThan(Integer value) {
            addCriterion("kaihekemuid <", value, "kaihekemuid");
            return (Criteria) this;
        }

        public Criteria andKaihekemuidLessThanOrEqualTo(Integer value) {
            addCriterion("kaihekemuid <=", value, "kaihekemuid");
            return (Criteria) this;
        }

        public Criteria andKaihekemuidIn(List<Integer> values) {
            addCriterion("kaihekemuid in", values, "kaihekemuid");
            return (Criteria) this;
        }

        public Criteria andKaihekemuidNotIn(List<Integer> values) {
            addCriterion("kaihekemuid not in", values, "kaihekemuid");
            return (Criteria) this;
        }

        public Criteria andKaihekemuidBetween(Integer value1, Integer value2) {
            addCriterion("kaihekemuid between", value1, value2, "kaihekemuid");
            return (Criteria) this;
        }

        public Criteria andKaihekemuidNotBetween(Integer value1, Integer value2) {
            addCriterion("kaihekemuid not between", value1, value2, "kaihekemuid");
            return (Criteria) this;
        }

        public Criteria andKaohechengjiIsNull() {
            addCriterion("kaohechengji is null");
            return (Criteria) this;
        }

        public Criteria andKaohechengjiIsNotNull() {
            addCriterion("kaohechengji is not null");
            return (Criteria) this;
        }

        public Criteria andKaohechengjiEqualTo(String value) {
            addCriterion("kaohechengji =", value, "kaohechengji");
            return (Criteria) this;
        }

        public Criteria andKaohechengjiNotEqualTo(String value) {
            addCriterion("kaohechengji <>", value, "kaohechengji");
            return (Criteria) this;
        }

        public Criteria andKaohechengjiGreaterThan(String value) {
            addCriterion("kaohechengji >", value, "kaohechengji");
            return (Criteria) this;
        }

        public Criteria andKaohechengjiGreaterThanOrEqualTo(String value) {
            addCriterion("kaohechengji >=", value, "kaohechengji");
            return (Criteria) this;
        }

        public Criteria andKaohechengjiLessThan(String value) {
            addCriterion("kaohechengji <", value, "kaohechengji");
            return (Criteria) this;
        }

        public Criteria andKaohechengjiLessThanOrEqualTo(String value) {
            addCriterion("kaohechengji <=", value, "kaohechengji");
            return (Criteria) this;
        }

        public Criteria andKaohechengjiLike(String value) {
            addCriterion("kaohechengji like", value, "kaohechengji");
            return (Criteria) this;
        }

        public Criteria andKaohechengjiNotLike(String value) {
            addCriterion("kaohechengji not like", value, "kaohechengji");
            return (Criteria) this;
        }

        public Criteria andKaohechengjiIn(List<String> values) {
            addCriterion("kaohechengji in", values, "kaohechengji");
            return (Criteria) this;
        }

        public Criteria andKaohechengjiNotIn(List<String> values) {
            addCriterion("kaohechengji not in", values, "kaohechengji");
            return (Criteria) this;
        }

        public Criteria andKaohechengjiBetween(String value1, String value2) {
            addCriterion("kaohechengji between", value1, value2, "kaohechengji");
            return (Criteria) this;
        }

        public Criteria andKaohechengjiNotBetween(String value1, String value2) {
            addCriterion("kaohechengji not between", value1, value2, "kaohechengji");
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