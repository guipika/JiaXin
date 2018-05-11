package com.whwj.entity.zzx;

import java.util.ArrayList;
import java.util.Date;
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

        public Criteria andChangdiidIsNull() {
            addCriterion("changdiID is null");
            return (Criteria) this;
        }

        public Criteria andChangdiidIsNotNull() {
            addCriterion("changdiID is not null");
            return (Criteria) this;
        }

        public Criteria andChangdiidEqualTo(Integer value) {
            addCriterion("changdiID =", value, "changdiid");
            return (Criteria) this;
        }

        public Criteria andChangdiidNotEqualTo(Integer value) {
            addCriterion("changdiID <>", value, "changdiid");
            return (Criteria) this;
        }

        public Criteria andChangdiidGreaterThan(Integer value) {
            addCriterion("changdiID >", value, "changdiid");
            return (Criteria) this;
        }

        public Criteria andChangdiidGreaterThanOrEqualTo(Integer value) {
            addCriterion("changdiID >=", value, "changdiid");
            return (Criteria) this;
        }

        public Criteria andChangdiidLessThan(Integer value) {
            addCriterion("changdiID <", value, "changdiid");
            return (Criteria) this;
        }

        public Criteria andChangdiidLessThanOrEqualTo(Integer value) {
            addCriterion("changdiID <=", value, "changdiid");
            return (Criteria) this;
        }

        public Criteria andChangdiidIn(List<Integer> values) {
            addCriterion("changdiID in", values, "changdiid");
            return (Criteria) this;
        }

        public Criteria andChangdiidNotIn(List<Integer> values) {
            addCriterion("changdiID not in", values, "changdiid");
            return (Criteria) this;
        }

        public Criteria andChangdiidBetween(Integer value1, Integer value2) {
            addCriterion("changdiID between", value1, value2, "changdiid");
            return (Criteria) this;
        }

        public Criteria andChangdiidNotBetween(Integer value1, Integer value2) {
            addCriterion("changdiID not between", value1, value2, "changdiid");
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
            addCriterion("rushijian =", value, "rushijian");
            return (Criteria) this;
        }

        public Criteria andRushijianNotEqualTo(Date value) {
            addCriterion("rushijian <>", value, "rushijian");
            return (Criteria) this;
        }

        public Criteria andRushijianGreaterThan(Date value) {
            addCriterion("rushijian >", value, "rushijian");
            return (Criteria) this;
        }

        public Criteria andRushijianGreaterThanOrEqualTo(Date value) {
            addCriterion("rushijian >=", value, "rushijian");
            return (Criteria) this;
        }

        public Criteria andRushijianLessThan(Date value) {
            addCriterion("rushijian <", value, "rushijian");
            return (Criteria) this;
        }

        public Criteria andRushijianLessThanOrEqualTo(Date value) {
            addCriterion("rushijian <=", value, "rushijian");
            return (Criteria) this;
        }

        public Criteria andRushijianIn(List<Date> values) {
            addCriterion("rushijian in", values, "rushijian");
            return (Criteria) this;
        }

        public Criteria andRushijianNotIn(List<Date> values) {
            addCriterion("rushijian not in", values, "rushijian");
            return (Criteria) this;
        }

        public Criteria andRushijianBetween(Date value1, Date value2) {
            addCriterion("rushijian between", value1, value2, "rushijian");
            return (Criteria) this;
        }

        public Criteria andRushijianNotBetween(Date value1, Date value2) {
            addCriterion("rushijian not between", value1, value2, "rushijian");
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
            addCriterion("chushijian =", value, "chushijian");
            return (Criteria) this;
        }

        public Criteria andChushijianNotEqualTo(Date value) {
            addCriterion("chushijian <>", value, "chushijian");
            return (Criteria) this;
        }

        public Criteria andChushijianGreaterThan(Date value) {
            addCriterion("chushijian >", value, "chushijian");
            return (Criteria) this;
        }

        public Criteria andChushijianGreaterThanOrEqualTo(Date value) {
            addCriterion("chushijian >=", value, "chushijian");
            return (Criteria) this;
        }

        public Criteria andChushijianLessThan(Date value) {
            addCriterion("chushijian <", value, "chushijian");
            return (Criteria) this;
        }

        public Criteria andChushijianLessThanOrEqualTo(Date value) {
            addCriterion("chushijian <=", value, "chushijian");
            return (Criteria) this;
        }

        public Criteria andChushijianIn(List<Date> values) {
            addCriterion("chushijian in", values, "chushijian");
            return (Criteria) this;
        }

        public Criteria andChushijianNotIn(List<Date> values) {
            addCriterion("chushijian not in", values, "chushijian");
            return (Criteria) this;
        }

        public Criteria andChushijianBetween(Date value1, Date value2) {
            addCriterion("chushijian between", value1, value2, "chushijian");
            return (Criteria) this;
        }

        public Criteria andChushijianNotBetween(Date value1, Date value2) {
            addCriterion("chushijian not between", value1, value2, "chushijian");
            return (Criteria) this;
        }

        public Criteria andChepaiIsNull() {
            addCriterion("chepai is null");
            return (Criteria) this;
        }

        public Criteria andChepaiIsNotNull() {
            addCriterion("chepai is not null");
            return (Criteria) this;
        }

        public Criteria andChepaiEqualTo(String value) {
            addCriterion("chepai =", value, "chepai");
            return (Criteria) this;
        }

        public Criteria andChepaiNotEqualTo(String value) {
            addCriterion("chepai <>", value, "chepai");
            return (Criteria) this;
        }

        public Criteria andChepaiGreaterThan(String value) {
            addCriterion("chepai >", value, "chepai");
            return (Criteria) this;
        }

        public Criteria andChepaiGreaterThanOrEqualTo(String value) {
            addCriterion("chepai >=", value, "chepai");
            return (Criteria) this;
        }

        public Criteria andChepaiLessThan(String value) {
            addCriterion("chepai <", value, "chepai");
            return (Criteria) this;
        }

        public Criteria andChepaiLessThanOrEqualTo(String value) {
            addCriterion("chepai <=", value, "chepai");
            return (Criteria) this;
        }

        public Criteria andChepaiLike(String value) {
            addCriterion("chepai like", value, "chepai");
            return (Criteria) this;
        }

        public Criteria andChepaiNotLike(String value) {
            addCriterion("chepai not like", value, "chepai");
            return (Criteria) this;
        }

        public Criteria andChepaiIn(List<String> values) {
            addCriterion("chepai in", values, "chepai");
            return (Criteria) this;
        }

        public Criteria andChepaiNotIn(List<String> values) {
            addCriterion("chepai not in", values, "chepai");
            return (Criteria) this;
        }

        public Criteria andChepaiBetween(String value1, String value2) {
            addCriterion("chepai between", value1, value2, "chepai");
            return (Criteria) this;
        }

        public Criteria andChepaiNotBetween(String value1, String value2) {
            addCriterion("chepai not between", value1, value2, "chepai");
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

        public Criteria andJiashiyuanidIsNull() {
            addCriterion("jiashiyuanid is null");
            return (Criteria) this;
        }

        public Criteria andJiashiyuanidIsNotNull() {
            addCriterion("jiashiyuanid is not null");
            return (Criteria) this;
        }

        public Criteria andJiashiyuanidEqualTo(Integer value) {
            addCriterion("jiashiyuanid =", value, "jiashiyuanid");
            return (Criteria) this;
        }

        public Criteria andJiashiyuanidNotEqualTo(Integer value) {
            addCriterion("jiashiyuanid <>", value, "jiashiyuanid");
            return (Criteria) this;
        }

        public Criteria andJiashiyuanidGreaterThan(Integer value) {
            addCriterion("jiashiyuanid >", value, "jiashiyuanid");
            return (Criteria) this;
        }

        public Criteria andJiashiyuanidGreaterThanOrEqualTo(Integer value) {
            addCriterion("jiashiyuanid >=", value, "jiashiyuanid");
            return (Criteria) this;
        }

        public Criteria andJiashiyuanidLessThan(Integer value) {
            addCriterion("jiashiyuanid <", value, "jiashiyuanid");
            return (Criteria) this;
        }

        public Criteria andJiashiyuanidLessThanOrEqualTo(Integer value) {
            addCriterion("jiashiyuanid <=", value, "jiashiyuanid");
            return (Criteria) this;
        }

        public Criteria andJiashiyuanidIn(List<Integer> values) {
            addCriterion("jiashiyuanid in", values, "jiashiyuanid");
            return (Criteria) this;
        }

        public Criteria andJiashiyuanidNotIn(List<Integer> values) {
            addCriterion("jiashiyuanid not in", values, "jiashiyuanid");
            return (Criteria) this;
        }

        public Criteria andJiashiyuanidBetween(Integer value1, Integer value2) {
            addCriterion("jiashiyuanid between", value1, value2, "jiashiyuanid");
            return (Criteria) this;
        }

        public Criteria andJiashiyuanidNotBetween(Integer value1, Integer value2) {
            addCriterion("jiashiyuanid not between", value1, value2, "jiashiyuanid");
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