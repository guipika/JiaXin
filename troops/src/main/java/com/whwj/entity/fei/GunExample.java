package com.whwj.entity.fei;

import java.util.ArrayList;
import java.util.List;

public class GunExample {
    protected String orderByClause;

    protected boolean distinct;

    protected List<Criteria> oredCriteria;

    public GunExample() {
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

        public Criteria andGidIsNull() {
            addCriterion("gid is null");
            return (Criteria) this;
        }

        public Criteria andGidIsNotNull() {
            addCriterion("gid is not null");
            return (Criteria) this;
        }

        public Criteria andGidEqualTo(Integer value) {
            addCriterion("gid =", value, "gid");
            return (Criteria) this;
        }

        public Criteria andGidNotEqualTo(Integer value) {
            addCriterion("gid <>", value, "gid");
            return (Criteria) this;
        }

        public Criteria andGidGreaterThan(Integer value) {
            addCriterion("gid >", value, "gid");
            return (Criteria) this;
        }

        public Criteria andGidGreaterThanOrEqualTo(Integer value) {
            addCriterion("gid >=", value, "gid");
            return (Criteria) this;
        }

        public Criteria andGidLessThan(Integer value) {
            addCriterion("gid <", value, "gid");
            return (Criteria) this;
        }

        public Criteria andGidLessThanOrEqualTo(Integer value) {
            addCriterion("gid <=", value, "gid");
            return (Criteria) this;
        }

        public Criteria andGidIn(List<Integer> values) {
            addCriterion("gid in", values, "gid");
            return (Criteria) this;
        }

        public Criteria andGidNotIn(List<Integer> values) {
            addCriterion("gid not in", values, "gid");
            return (Criteria) this;
        }

        public Criteria andGidBetween(Integer value1, Integer value2) {
            addCriterion("gid between", value1, value2, "gid");
            return (Criteria) this;
        }

        public Criteria andGidNotBetween(Integer value1, Integer value2) {
            addCriterion("gid not between", value1, value2, "gid");
            return (Criteria) this;
        }

        public Criteria andCnameIsNull() {
            addCriterion("cname is null");
            return (Criteria) this;
        }

        public Criteria andCnameIsNotNull() {
            addCriterion("cname is not null");
            return (Criteria) this;
        }

        public Criteria andCnameEqualTo(String value) {
            addCriterion("cname =", value, "cname");
            return (Criteria) this;
        }

        public Criteria andCnameNotEqualTo(String value) {
            addCriterion("cname <>", value, "cname");
            return (Criteria) this;
        }

        public Criteria andCnameGreaterThan(String value) {
            addCriterion("cname >", value, "cname");
            return (Criteria) this;
        }

        public Criteria andCnameGreaterThanOrEqualTo(String value) {
            addCriterion("cname >=", value, "cname");
            return (Criteria) this;
        }

        public Criteria andCnameLessThan(String value) {
            addCriterion("cname <", value, "cname");
            return (Criteria) this;
        }

        public Criteria andCnameLessThanOrEqualTo(String value) {
            addCriterion("cname <=", value, "cname");
            return (Criteria) this;
        }

        public Criteria andCnameLike(String value) {
            addCriterion("cname like", value, "cname");
            return (Criteria) this;
        }

        public Criteria andCnameNotLike(String value) {
            addCriterion("cname not like", value, "cname");
            return (Criteria) this;
        }

        public Criteria andCnameIn(List<String> values) {
            addCriterion("cname in", values, "cname");
            return (Criteria) this;
        }

        public Criteria andCnameNotIn(List<String> values) {
            addCriterion("cname not in", values, "cname");
            return (Criteria) this;
        }

        public Criteria andCnameBetween(String value1, String value2) {
            addCriterion("cname between", value1, value2, "cname");
            return (Criteria) this;
        }

        public Criteria andCnameNotBetween(String value1, String value2) {
            addCriterion("cname not between", value1, value2, "cname");
            return (Criteria) this;
        }

        public Criteria andEnameIsNull() {
            addCriterion("ename is null");
            return (Criteria) this;
        }

        public Criteria andEnameIsNotNull() {
            addCriterion("ename is not null");
            return (Criteria) this;
        }

        public Criteria andEnameEqualTo(String value) {
            addCriterion("ename =", value, "ename");
            return (Criteria) this;
        }

        public Criteria andEnameNotEqualTo(String value) {
            addCriterion("ename <>", value, "ename");
            return (Criteria) this;
        }

        public Criteria andEnameGreaterThan(String value) {
            addCriterion("ename >", value, "ename");
            return (Criteria) this;
        }

        public Criteria andEnameGreaterThanOrEqualTo(String value) {
            addCriterion("ename >=", value, "ename");
            return (Criteria) this;
        }

        public Criteria andEnameLessThan(String value) {
            addCriterion("ename <", value, "ename");
            return (Criteria) this;
        }

        public Criteria andEnameLessThanOrEqualTo(String value) {
            addCriterion("ename <=", value, "ename");
            return (Criteria) this;
        }

        public Criteria andEnameLike(String value) {
            addCriterion("ename like", value, "ename");
            return (Criteria) this;
        }

        public Criteria andEnameNotLike(String value) {
            addCriterion("ename not like", value, "ename");
            return (Criteria) this;
        }

        public Criteria andEnameIn(List<String> values) {
            addCriterion("ename in", values, "ename");
            return (Criteria) this;
        }

        public Criteria andEnameNotIn(List<String> values) {
            addCriterion("ename not in", values, "ename");
            return (Criteria) this;
        }

        public Criteria andEnameBetween(String value1, String value2) {
            addCriterion("ename between", value1, value2, "ename");
            return (Criteria) this;
        }

        public Criteria andEnameNotBetween(String value1, String value2) {
            addCriterion("ename not between", value1, value2, "ename");
            return (Criteria) this;
        }

        public Criteria andCdidIsNull() {
            addCriterion("cdid is null");
            return (Criteria) this;
        }

        public Criteria andCdidIsNotNull() {
            addCriterion("cdid is not null");
            return (Criteria) this;
        }

        public Criteria andCdidEqualTo(String value) {
            addCriterion("cdid =", value, "cdid");
            return (Criteria) this;
        }

        public Criteria andCdidNotEqualTo(String value) {
            addCriterion("cdid <>", value, "cdid");
            return (Criteria) this;
        }

        public Criteria andCdidGreaterThan(String value) {
            addCriterion("cdid >", value, "cdid");
            return (Criteria) this;
        }

        public Criteria andCdidGreaterThanOrEqualTo(String value) {
            addCriterion("cdid >=", value, "cdid");
            return (Criteria) this;
        }

        public Criteria andCdidLessThan(String value) {
            addCriterion("cdid <", value, "cdid");
            return (Criteria) this;
        }

        public Criteria andCdidLessThanOrEqualTo(String value) {
            addCriterion("cdid <=", value, "cdid");
            return (Criteria) this;
        }

        public Criteria andCdidLike(String value) {
            addCriterion("cdid like", value, "cdid");
            return (Criteria) this;
        }

        public Criteria andCdidNotLike(String value) {
            addCriterion("cdid not like", value, "cdid");
            return (Criteria) this;
        }

        public Criteria andCdidIn(List<String> values) {
            addCriterion("cdid in", values, "cdid");
            return (Criteria) this;
        }

        public Criteria andCdidNotIn(List<String> values) {
            addCriterion("cdid not in", values, "cdid");
            return (Criteria) this;
        }

        public Criteria andCdidBetween(String value1, String value2) {
            addCriterion("cdid between", value1, value2, "cdid");
            return (Criteria) this;
        }

        public Criteria andCdidNotBetween(String value1, String value2) {
            addCriterion("cdid not between", value1, value2, "cdid");
            return (Criteria) this;
        }

        public Criteria andDanjiarongliangIsNull() {
            addCriterion("danjiarongliang is null");
            return (Criteria) this;
        }

        public Criteria andDanjiarongliangIsNotNull() {
            addCriterion("danjiarongliang is not null");
            return (Criteria) this;
        }

        public Criteria andDanjiarongliangEqualTo(String value) {
            addCriterion("danjiarongliang =", value, "danjiarongliang");
            return (Criteria) this;
        }

        public Criteria andDanjiarongliangNotEqualTo(String value) {
            addCriterion("danjiarongliang <>", value, "danjiarongliang");
            return (Criteria) this;
        }

        public Criteria andDanjiarongliangGreaterThan(String value) {
            addCriterion("danjiarongliang >", value, "danjiarongliang");
            return (Criteria) this;
        }

        public Criteria andDanjiarongliangGreaterThanOrEqualTo(String value) {
            addCriterion("danjiarongliang >=", value, "danjiarongliang");
            return (Criteria) this;
        }

        public Criteria andDanjiarongliangLessThan(String value) {
            addCriterion("danjiarongliang <", value, "danjiarongliang");
            return (Criteria) this;
        }

        public Criteria andDanjiarongliangLessThanOrEqualTo(String value) {
            addCriterion("danjiarongliang <=", value, "danjiarongliang");
            return (Criteria) this;
        }

        public Criteria andDanjiarongliangLike(String value) {
            addCriterion("danjiarongliang like", value, "danjiarongliang");
            return (Criteria) this;
        }

        public Criteria andDanjiarongliangNotLike(String value) {
            addCriterion("danjiarongliang not like", value, "danjiarongliang");
            return (Criteria) this;
        }

        public Criteria andDanjiarongliangIn(List<String> values) {
            addCriterion("danjiarongliang in", values, "danjiarongliang");
            return (Criteria) this;
        }

        public Criteria andDanjiarongliangNotIn(List<String> values) {
            addCriterion("danjiarongliang not in", values, "danjiarongliang");
            return (Criteria) this;
        }

        public Criteria andDanjiarongliangBetween(String value1, String value2) {
            addCriterion("danjiarongliang between", value1, value2, "danjiarongliang");
            return (Criteria) this;
        }

        public Criteria andDanjiarongliangNotBetween(String value1, String value2) {
            addCriterion("danjiarongliang not between", value1, value2, "danjiarongliang");
            return (Criteria) this;
        }

        public Criteria andTangxianIsNull() {
            addCriterion("tangxian is null");
            return (Criteria) this;
        }

        public Criteria andTangxianIsNotNull() {
            addCriterion("tangxian is not null");
            return (Criteria) this;
        }

        public Criteria andTangxianEqualTo(String value) {
            addCriterion("tangxian =", value, "tangxian");
            return (Criteria) this;
        }

        public Criteria andTangxianNotEqualTo(String value) {
            addCriterion("tangxian <>", value, "tangxian");
            return (Criteria) this;
        }

        public Criteria andTangxianGreaterThan(String value) {
            addCriterion("tangxian >", value, "tangxian");
            return (Criteria) this;
        }

        public Criteria andTangxianGreaterThanOrEqualTo(String value) {
            addCriterion("tangxian >=", value, "tangxian");
            return (Criteria) this;
        }

        public Criteria andTangxianLessThan(String value) {
            addCriterion("tangxian <", value, "tangxian");
            return (Criteria) this;
        }

        public Criteria andTangxianLessThanOrEqualTo(String value) {
            addCriterion("tangxian <=", value, "tangxian");
            return (Criteria) this;
        }

        public Criteria andTangxianLike(String value) {
            addCriterion("tangxian like", value, "tangxian");
            return (Criteria) this;
        }

        public Criteria andTangxianNotLike(String value) {
            addCriterion("tangxian not like", value, "tangxian");
            return (Criteria) this;
        }

        public Criteria andTangxianIn(List<String> values) {
            addCriterion("tangxian in", values, "tangxian");
            return (Criteria) this;
        }

        public Criteria andTangxianNotIn(List<String> values) {
            addCriterion("tangxian not in", values, "tangxian");
            return (Criteria) this;
        }

        public Criteria andTangxianBetween(String value1, String value2) {
            addCriterion("tangxian between", value1, value2, "tangxian");
            return (Criteria) this;
        }

        public Criteria andTangxianNotBetween(String value1, String value2) {
            addCriterion("tangxian not between", value1, value2, "tangxian");
            return (Criteria) this;
        }

        public Criteria andSheshuIsNull() {
            addCriterion("sheshu is null");
            return (Criteria) this;
        }

        public Criteria andSheshuIsNotNull() {
            addCriterion("sheshu is not null");
            return (Criteria) this;
        }

        public Criteria andSheshuEqualTo(String value) {
            addCriterion("sheshu =", value, "sheshu");
            return (Criteria) this;
        }

        public Criteria andSheshuNotEqualTo(String value) {
            addCriterion("sheshu <>", value, "sheshu");
            return (Criteria) this;
        }

        public Criteria andSheshuGreaterThan(String value) {
            addCriterion("sheshu >", value, "sheshu");
            return (Criteria) this;
        }

        public Criteria andSheshuGreaterThanOrEqualTo(String value) {
            addCriterion("sheshu >=", value, "sheshu");
            return (Criteria) this;
        }

        public Criteria andSheshuLessThan(String value) {
            addCriterion("sheshu <", value, "sheshu");
            return (Criteria) this;
        }

        public Criteria andSheshuLessThanOrEqualTo(String value) {
            addCriterion("sheshu <=", value, "sheshu");
            return (Criteria) this;
        }

        public Criteria andSheshuLike(String value) {
            addCriterion("sheshu like", value, "sheshu");
            return (Criteria) this;
        }

        public Criteria andSheshuNotLike(String value) {
            addCriterion("sheshu not like", value, "sheshu");
            return (Criteria) this;
        }

        public Criteria andSheshuIn(List<String> values) {
            addCriterion("sheshu in", values, "sheshu");
            return (Criteria) this;
        }

        public Criteria andSheshuNotIn(List<String> values) {
            addCriterion("sheshu not in", values, "sheshu");
            return (Criteria) this;
        }

        public Criteria andSheshuBetween(String value1, String value2) {
            addCriterion("sheshu between", value1, value2, "sheshu");
            return (Criteria) this;
        }

        public Criteria andSheshuNotBetween(String value1, String value2) {
            addCriterion("sheshu not between", value1, value2, "sheshu");
            return (Criteria) this;
        }

        public Criteria andShengchannianxianIsNull() {
            addCriterion("shengchannianxian is null");
            return (Criteria) this;
        }

        public Criteria andShengchannianxianIsNotNull() {
            addCriterion("shengchannianxian is not null");
            return (Criteria) this;
        }

        public Criteria andShengchannianxianEqualTo(String value) {
            addCriterion("shengchannianxian =", value, "shengchannianxian");
            return (Criteria) this;
        }

        public Criteria andShengchannianxianNotEqualTo(String value) {
            addCriterion("shengchannianxian <>", value, "shengchannianxian");
            return (Criteria) this;
        }

        public Criteria andShengchannianxianGreaterThan(String value) {
            addCriterion("shengchannianxian >", value, "shengchannianxian");
            return (Criteria) this;
        }

        public Criteria andShengchannianxianGreaterThanOrEqualTo(String value) {
            addCriterion("shengchannianxian >=", value, "shengchannianxian");
            return (Criteria) this;
        }

        public Criteria andShengchannianxianLessThan(String value) {
            addCriterion("shengchannianxian <", value, "shengchannianxian");
            return (Criteria) this;
        }

        public Criteria andShengchannianxianLessThanOrEqualTo(String value) {
            addCriterion("shengchannianxian <=", value, "shengchannianxian");
            return (Criteria) this;
        }

        public Criteria andShengchannianxianLike(String value) {
            addCriterion("shengchannianxian like", value, "shengchannianxian");
            return (Criteria) this;
        }

        public Criteria andShengchannianxianNotLike(String value) {
            addCriterion("shengchannianxian not like", value, "shengchannianxian");
            return (Criteria) this;
        }

        public Criteria andShengchannianxianIn(List<String> values) {
            addCriterion("shengchannianxian in", values, "shengchannianxian");
            return (Criteria) this;
        }

        public Criteria andShengchannianxianNotIn(List<String> values) {
            addCriterion("shengchannianxian not in", values, "shengchannianxian");
            return (Criteria) this;
        }

        public Criteria andShengchannianxianBetween(String value1, String value2) {
            addCriterion("shengchannianxian between", value1, value2, "shengchannianxian");
            return (Criteria) this;
        }

        public Criteria andShengchannianxianNotBetween(String value1, String value2) {
            addCriterion("shengchannianxian not between", value1, value2, "shengchannianxian");
            return (Criteria) this;
        }

        public Criteria andShoujiaIsNull() {
            addCriterion("shoujia is null");
            return (Criteria) this;
        }

        public Criteria andShoujiaIsNotNull() {
            addCriterion("shoujia is not null");
            return (Criteria) this;
        }

        public Criteria andShoujiaEqualTo(String value) {
            addCriterion("shoujia =", value, "shoujia");
            return (Criteria) this;
        }

        public Criteria andShoujiaNotEqualTo(String value) {
            addCriterion("shoujia <>", value, "shoujia");
            return (Criteria) this;
        }

        public Criteria andShoujiaGreaterThan(String value) {
            addCriterion("shoujia >", value, "shoujia");
            return (Criteria) this;
        }

        public Criteria andShoujiaGreaterThanOrEqualTo(String value) {
            addCriterion("shoujia >=", value, "shoujia");
            return (Criteria) this;
        }

        public Criteria andShoujiaLessThan(String value) {
            addCriterion("shoujia <", value, "shoujia");
            return (Criteria) this;
        }

        public Criteria andShoujiaLessThanOrEqualTo(String value) {
            addCriterion("shoujia <=", value, "shoujia");
            return (Criteria) this;
        }

        public Criteria andShoujiaLike(String value) {
            addCriterion("shoujia like", value, "shoujia");
            return (Criteria) this;
        }

        public Criteria andShoujiaNotLike(String value) {
            addCriterion("shoujia not like", value, "shoujia");
            return (Criteria) this;
        }

        public Criteria andShoujiaIn(List<String> values) {
            addCriterion("shoujia in", values, "shoujia");
            return (Criteria) this;
        }

        public Criteria andShoujiaNotIn(List<String> values) {
            addCriterion("shoujia not in", values, "shoujia");
            return (Criteria) this;
        }

        public Criteria andShoujiaBetween(String value1, String value2) {
            addCriterion("shoujia between", value1, value2, "shoujia");
            return (Criteria) this;
        }

        public Criteria andShoujiaNotBetween(String value1, String value2) {
            addCriterion("shoujia not between", value1, value2, "shoujia");
            return (Criteria) this;
        }

        public Criteria andQiangzhongIsNull() {
            addCriterion("qiangzhong is null");
            return (Criteria) this;
        }

        public Criteria andQiangzhongIsNotNull() {
            addCriterion("qiangzhong is not null");
            return (Criteria) this;
        }

        public Criteria andQiangzhongEqualTo(String value) {
            addCriterion("qiangzhong =", value, "qiangzhong");
            return (Criteria) this;
        }

        public Criteria andQiangzhongNotEqualTo(String value) {
            addCriterion("qiangzhong <>", value, "qiangzhong");
            return (Criteria) this;
        }

        public Criteria andQiangzhongGreaterThan(String value) {
            addCriterion("qiangzhong >", value, "qiangzhong");
            return (Criteria) this;
        }

        public Criteria andQiangzhongGreaterThanOrEqualTo(String value) {
            addCriterion("qiangzhong >=", value, "qiangzhong");
            return (Criteria) this;
        }

        public Criteria andQiangzhongLessThan(String value) {
            addCriterion("qiangzhong <", value, "qiangzhong");
            return (Criteria) this;
        }

        public Criteria andQiangzhongLessThanOrEqualTo(String value) {
            addCriterion("qiangzhong <=", value, "qiangzhong");
            return (Criteria) this;
        }

        public Criteria andQiangzhongLike(String value) {
            addCriterion("qiangzhong like", value, "qiangzhong");
            return (Criteria) this;
        }

        public Criteria andQiangzhongNotLike(String value) {
            addCriterion("qiangzhong not like", value, "qiangzhong");
            return (Criteria) this;
        }

        public Criteria andQiangzhongIn(List<String> values) {
            addCriterion("qiangzhong in", values, "qiangzhong");
            return (Criteria) this;
        }

        public Criteria andQiangzhongNotIn(List<String> values) {
            addCriterion("qiangzhong not in", values, "qiangzhong");
            return (Criteria) this;
        }

        public Criteria andQiangzhongBetween(String value1, String value2) {
            addCriterion("qiangzhong between", value1, value2, "qiangzhong");
            return (Criteria) this;
        }

        public Criteria andQiangzhongNotBetween(String value1, String value2) {
            addCriterion("qiangzhong not between", value1, value2, "qiangzhong");
            return (Criteria) this;
        }

        public Criteria andGudingchangIsNull() {
            addCriterion("gudingchang is null");
            return (Criteria) this;
        }

        public Criteria andGudingchangIsNotNull() {
            addCriterion("gudingchang is not null");
            return (Criteria) this;
        }

        public Criteria andGudingchangEqualTo(String value) {
            addCriterion("gudingchang =", value, "gudingchang");
            return (Criteria) this;
        }

        public Criteria andGudingchangNotEqualTo(String value) {
            addCriterion("gudingchang <>", value, "gudingchang");
            return (Criteria) this;
        }

        public Criteria andGudingchangGreaterThan(String value) {
            addCriterion("gudingchang >", value, "gudingchang");
            return (Criteria) this;
        }

        public Criteria andGudingchangGreaterThanOrEqualTo(String value) {
            addCriterion("gudingchang >=", value, "gudingchang");
            return (Criteria) this;
        }

        public Criteria andGudingchangLessThan(String value) {
            addCriterion("gudingchang <", value, "gudingchang");
            return (Criteria) this;
        }

        public Criteria andGudingchangLessThanOrEqualTo(String value) {
            addCriterion("gudingchang <=", value, "gudingchang");
            return (Criteria) this;
        }

        public Criteria andGudingchangLike(String value) {
            addCriterion("gudingchang like", value, "gudingchang");
            return (Criteria) this;
        }

        public Criteria andGudingchangNotLike(String value) {
            addCriterion("gudingchang not like", value, "gudingchang");
            return (Criteria) this;
        }

        public Criteria andGudingchangIn(List<String> values) {
            addCriterion("gudingchang in", values, "gudingchang");
            return (Criteria) this;
        }

        public Criteria andGudingchangNotIn(List<String> values) {
            addCriterion("gudingchang not in", values, "gudingchang");
            return (Criteria) this;
        }

        public Criteria andGudingchangBetween(String value1, String value2) {
            addCriterion("gudingchang between", value1, value2, "gudingchang");
            return (Criteria) this;
        }

        public Criteria andGudingchangNotBetween(String value1, String value2) {
            addCriterion("gudingchang not between", value1, value2, "gudingchang");
            return (Criteria) this;
        }

        public Criteria andZdidIsNull() {
            addCriterion("zdid is null");
            return (Criteria) this;
        }

        public Criteria andZdidIsNotNull() {
            addCriterion("zdid is not null");
            return (Criteria) this;
        }

        public Criteria andZdidEqualTo(String value) {
            addCriterion("zdid =", value, "zdid");
            return (Criteria) this;
        }

        public Criteria andZdidNotEqualTo(String value) {
            addCriterion("zdid <>", value, "zdid");
            return (Criteria) this;
        }

        public Criteria andZdidGreaterThan(String value) {
            addCriterion("zdid >", value, "zdid");
            return (Criteria) this;
        }

        public Criteria andZdidGreaterThanOrEqualTo(String value) {
            addCriterion("zdid >=", value, "zdid");
            return (Criteria) this;
        }

        public Criteria andZdidLessThan(String value) {
            addCriterion("zdid <", value, "zdid");
            return (Criteria) this;
        }

        public Criteria andZdidLessThanOrEqualTo(String value) {
            addCriterion("zdid <=", value, "zdid");
            return (Criteria) this;
        }

        public Criteria andZdidLike(String value) {
            addCriterion("zdid like", value, "zdid");
            return (Criteria) this;
        }

        public Criteria andZdidNotLike(String value) {
            addCriterion("zdid not like", value, "zdid");
            return (Criteria) this;
        }

        public Criteria andZdidIn(List<String> values) {
            addCriterion("zdid in", values, "zdid");
            return (Criteria) this;
        }

        public Criteria andZdidNotIn(List<String> values) {
            addCriterion("zdid not in", values, "zdid");
            return (Criteria) this;
        }

        public Criteria andZdidBetween(String value1, String value2) {
            addCriterion("zdid between", value1, value2, "zdid");
            return (Criteria) this;
        }

        public Criteria andZdidNotBetween(String value1, String value2) {
            addCriterion("zdid not between", value1, value2, "zdid");
            return (Criteria) this;
        }

        public Criteria andYouxiaoshechengIsNull() {
            addCriterion("youxiaoshecheng is null");
            return (Criteria) this;
        }

        public Criteria andYouxiaoshechengIsNotNull() {
            addCriterion("youxiaoshecheng is not null");
            return (Criteria) this;
        }

        public Criteria andYouxiaoshechengEqualTo(String value) {
            addCriterion("youxiaoshecheng =", value, "youxiaoshecheng");
            return (Criteria) this;
        }

        public Criteria andYouxiaoshechengNotEqualTo(String value) {
            addCriterion("youxiaoshecheng <>", value, "youxiaoshecheng");
            return (Criteria) this;
        }

        public Criteria andYouxiaoshechengGreaterThan(String value) {
            addCriterion("youxiaoshecheng >", value, "youxiaoshecheng");
            return (Criteria) this;
        }

        public Criteria andYouxiaoshechengGreaterThanOrEqualTo(String value) {
            addCriterion("youxiaoshecheng >=", value, "youxiaoshecheng");
            return (Criteria) this;
        }

        public Criteria andYouxiaoshechengLessThan(String value) {
            addCriterion("youxiaoshecheng <", value, "youxiaoshecheng");
            return (Criteria) this;
        }

        public Criteria andYouxiaoshechengLessThanOrEqualTo(String value) {
            addCriterion("youxiaoshecheng <=", value, "youxiaoshecheng");
            return (Criteria) this;
        }

        public Criteria andYouxiaoshechengLike(String value) {
            addCriterion("youxiaoshecheng like", value, "youxiaoshecheng");
            return (Criteria) this;
        }

        public Criteria andYouxiaoshechengNotLike(String value) {
            addCriterion("youxiaoshecheng not like", value, "youxiaoshecheng");
            return (Criteria) this;
        }

        public Criteria andYouxiaoshechengIn(List<String> values) {
            addCriterion("youxiaoshecheng in", values, "youxiaoshecheng");
            return (Criteria) this;
        }

        public Criteria andYouxiaoshechengNotIn(List<String> values) {
            addCriterion("youxiaoshecheng not in", values, "youxiaoshecheng");
            return (Criteria) this;
        }

        public Criteria andYouxiaoshechengBetween(String value1, String value2) {
            addCriterion("youxiaoshecheng between", value1, value2, "youxiaoshecheng");
            return (Criteria) this;
        }

        public Criteria andYouxiaoshechengNotBetween(String value1, String value2) {
            addCriterion("youxiaoshecheng not between", value1, value2, "youxiaoshecheng");
            return (Criteria) this;
        }

        public Criteria andZhizaoshangIsNull() {
            addCriterion("zhizaoshang is null");
            return (Criteria) this;
        }

        public Criteria andZhizaoshangIsNotNull() {
            addCriterion("zhizaoshang is not null");
            return (Criteria) this;
        }

        public Criteria andZhizaoshangEqualTo(String value) {
            addCriterion("zhizaoshang =", value, "zhizaoshang");
            return (Criteria) this;
        }

        public Criteria andZhizaoshangNotEqualTo(String value) {
            addCriterion("zhizaoshang <>", value, "zhizaoshang");
            return (Criteria) this;
        }

        public Criteria andZhizaoshangGreaterThan(String value) {
            addCriterion("zhizaoshang >", value, "zhizaoshang");
            return (Criteria) this;
        }

        public Criteria andZhizaoshangGreaterThanOrEqualTo(String value) {
            addCriterion("zhizaoshang >=", value, "zhizaoshang");
            return (Criteria) this;
        }

        public Criteria andZhizaoshangLessThan(String value) {
            addCriterion("zhizaoshang <", value, "zhizaoshang");
            return (Criteria) this;
        }

        public Criteria andZhizaoshangLessThanOrEqualTo(String value) {
            addCriterion("zhizaoshang <=", value, "zhizaoshang");
            return (Criteria) this;
        }

        public Criteria andZhizaoshangLike(String value) {
            addCriterion("zhizaoshang like", value, "zhizaoshang");
            return (Criteria) this;
        }

        public Criteria andZhizaoshangNotLike(String value) {
            addCriterion("zhizaoshang not like", value, "zhizaoshang");
            return (Criteria) this;
        }

        public Criteria andZhizaoshangIn(List<String> values) {
            addCriterion("zhizaoshang in", values, "zhizaoshang");
            return (Criteria) this;
        }

        public Criteria andZhizaoshangNotIn(List<String> values) {
            addCriterion("zhizaoshang not in", values, "zhizaoshang");
            return (Criteria) this;
        }

        public Criteria andZhizaoshangBetween(String value1, String value2) {
            addCriterion("zhizaoshang between", value1, value2, "zhizaoshang");
            return (Criteria) this;
        }

        public Criteria andZhizaoshangNotBetween(String value1, String value2) {
            addCriterion("zhizaoshang not between", value1, value2, "zhizaoshang");
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