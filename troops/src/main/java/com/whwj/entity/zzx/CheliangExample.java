package com.whwj.entity.zzx;

import java.util.ArrayList;
import java.util.List;

public class CheliangExample {
    protected String orderByClause;

    protected boolean distinct;

    protected List<Criteria> oredCriteria;

    public CheliangExample() {
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

        public Criteria andLeixingidIsNull() {
            addCriterion("leixingid is null");
            return (Criteria) this;
        }

        public Criteria andLeixingidIsNotNull() {
            addCriterion("leixingid is not null");
            return (Criteria) this;
        }

        public Criteria andLeixingidEqualTo(Integer value) {
            addCriterion("leixingid =", value, "leixingid");
            return (Criteria) this;
        }

        public Criteria andLeixingidNotEqualTo(Integer value) {
            addCriterion("leixingid <>", value, "leixingid");
            return (Criteria) this;
        }

        public Criteria andLeixingidGreaterThan(Integer value) {
            addCriterion("leixingid >", value, "leixingid");
            return (Criteria) this;
        }

        public Criteria andLeixingidGreaterThanOrEqualTo(Integer value) {
            addCriterion("leixingid >=", value, "leixingid");
            return (Criteria) this;
        }

        public Criteria andLeixingidLessThan(Integer value) {
            addCriterion("leixingid <", value, "leixingid");
            return (Criteria) this;
        }

        public Criteria andLeixingidLessThanOrEqualTo(Integer value) {
            addCriterion("leixingid <=", value, "leixingid");
            return (Criteria) this;
        }

        public Criteria andLeixingidIn(List<Integer> values) {
            addCriterion("leixingid in", values, "leixingid");
            return (Criteria) this;
        }

        public Criteria andLeixingidNotIn(List<Integer> values) {
            addCriterion("leixingid not in", values, "leixingid");
            return (Criteria) this;
        }

        public Criteria andLeixingidBetween(Integer value1, Integer value2) {
            addCriterion("leixingid between", value1, value2, "leixingid");
            return (Criteria) this;
        }

        public Criteria andLeixingidNotBetween(Integer value1, Integer value2) {
            addCriterion("leixingid not between", value1, value2, "leixingid");
            return (Criteria) this;
        }

        public Criteria andDanweiidIsNull() {
            addCriterion("danweiid is null");
            return (Criteria) this;
        }

        public Criteria andDanweiidIsNotNull() {
            addCriterion("danweiid is not null");
            return (Criteria) this;
        }

        public Criteria andDanweiidEqualTo(Integer value) {
            addCriterion("danweiid =", value, "danweiid");
            return (Criteria) this;
        }

        public Criteria andDanweiidNotEqualTo(Integer value) {
            addCriterion("danweiid <>", value, "danweiid");
            return (Criteria) this;
        }

        public Criteria andDanweiidGreaterThan(Integer value) {
            addCriterion("danweiid >", value, "danweiid");
            return (Criteria) this;
        }

        public Criteria andDanweiidGreaterThanOrEqualTo(Integer value) {
            addCriterion("danweiid >=", value, "danweiid");
            return (Criteria) this;
        }

        public Criteria andDanweiidLessThan(Integer value) {
            addCriterion("danweiid <", value, "danweiid");
            return (Criteria) this;
        }

        public Criteria andDanweiidLessThanOrEqualTo(Integer value) {
            addCriterion("danweiid <=", value, "danweiid");
            return (Criteria) this;
        }

        public Criteria andDanweiidIn(List<Integer> values) {
            addCriterion("danweiid in", values, "danweiid");
            return (Criteria) this;
        }

        public Criteria andDanweiidNotIn(List<Integer> values) {
            addCriterion("danweiid not in", values, "danweiid");
            return (Criteria) this;
        }

        public Criteria andDanweiidBetween(Integer value1, Integer value2) {
            addCriterion("danweiid between", value1, value2, "danweiid");
            return (Criteria) this;
        }

        public Criteria andDanweiidNotBetween(Integer value1, Integer value2) {
            addCriterion("danweiid not between", value1, value2, "danweiid");
            return (Criteria) this;
        }

        public Criteria andPinpaixinghaoIsNull() {
            addCriterion("pinpaixinghao is null");
            return (Criteria) this;
        }

        public Criteria andPinpaixinghaoIsNotNull() {
            addCriterion("pinpaixinghao is not null");
            return (Criteria) this;
        }

        public Criteria andPinpaixinghaoEqualTo(String value) {
            addCriterion("pinpaixinghao =", value, "pinpaixinghao");
            return (Criteria) this;
        }

        public Criteria andPinpaixinghaoNotEqualTo(String value) {
            addCriterion("pinpaixinghao <>", value, "pinpaixinghao");
            return (Criteria) this;
        }

        public Criteria andPinpaixinghaoGreaterThan(String value) {
            addCriterion("pinpaixinghao >", value, "pinpaixinghao");
            return (Criteria) this;
        }

        public Criteria andPinpaixinghaoGreaterThanOrEqualTo(String value) {
            addCriterion("pinpaixinghao >=", value, "pinpaixinghao");
            return (Criteria) this;
        }

        public Criteria andPinpaixinghaoLessThan(String value) {
            addCriterion("pinpaixinghao <", value, "pinpaixinghao");
            return (Criteria) this;
        }

        public Criteria andPinpaixinghaoLessThanOrEqualTo(String value) {
            addCriterion("pinpaixinghao <=", value, "pinpaixinghao");
            return (Criteria) this;
        }

        public Criteria andPinpaixinghaoLike(String value) {
            addCriterion("pinpaixinghao like", value, "pinpaixinghao");
            return (Criteria) this;
        }

        public Criteria andPinpaixinghaoNotLike(String value) {
            addCriterion("pinpaixinghao not like", value, "pinpaixinghao");
            return (Criteria) this;
        }

        public Criteria andPinpaixinghaoIn(List<String> values) {
            addCriterion("pinpaixinghao in", values, "pinpaixinghao");
            return (Criteria) this;
        }

        public Criteria andPinpaixinghaoNotIn(List<String> values) {
            addCriterion("pinpaixinghao not in", values, "pinpaixinghao");
            return (Criteria) this;
        }

        public Criteria andPinpaixinghaoBetween(String value1, String value2) {
            addCriterion("pinpaixinghao between", value1, value2, "pinpaixinghao");
            return (Criteria) this;
        }

        public Criteria andPinpaixinghaoNotBetween(String value1, String value2) {
            addCriterion("pinpaixinghao not between", value1, value2, "pinpaixinghao");
            return (Criteria) this;
        }

        public Criteria andYanseIsNull() {
            addCriterion("yanse is null");
            return (Criteria) this;
        }

        public Criteria andYanseIsNotNull() {
            addCriterion("yanse is not null");
            return (Criteria) this;
        }

        public Criteria andYanseEqualTo(String value) {
            addCriterion("yanse =", value, "yanse");
            return (Criteria) this;
        }

        public Criteria andYanseNotEqualTo(String value) {
            addCriterion("yanse <>", value, "yanse");
            return (Criteria) this;
        }

        public Criteria andYanseGreaterThan(String value) {
            addCriterion("yanse >", value, "yanse");
            return (Criteria) this;
        }

        public Criteria andYanseGreaterThanOrEqualTo(String value) {
            addCriterion("yanse >=", value, "yanse");
            return (Criteria) this;
        }

        public Criteria andYanseLessThan(String value) {
            addCriterion("yanse <", value, "yanse");
            return (Criteria) this;
        }

        public Criteria andYanseLessThanOrEqualTo(String value) {
            addCriterion("yanse <=", value, "yanse");
            return (Criteria) this;
        }

        public Criteria andYanseLike(String value) {
            addCriterion("yanse like", value, "yanse");
            return (Criteria) this;
        }

        public Criteria andYanseNotLike(String value) {
            addCriterion("yanse not like", value, "yanse");
            return (Criteria) this;
        }

        public Criteria andYanseIn(List<String> values) {
            addCriterion("yanse in", values, "yanse");
            return (Criteria) this;
        }

        public Criteria andYanseNotIn(List<String> values) {
            addCriterion("yanse not in", values, "yanse");
            return (Criteria) this;
        }

        public Criteria andYanseBetween(String value1, String value2) {
            addCriterion("yanse between", value1, value2, "yanse");
            return (Criteria) this;
        }

        public Criteria andYanseNotBetween(String value1, String value2) {
            addCriterion("yanse not between", value1, value2, "yanse");
            return (Criteria) this;
        }

        public Criteria andFadongjibianhaoIsNull() {
            addCriterion("fadongjibianhao is null");
            return (Criteria) this;
        }

        public Criteria andFadongjibianhaoIsNotNull() {
            addCriterion("fadongjibianhao is not null");
            return (Criteria) this;
        }

        public Criteria andFadongjibianhaoEqualTo(String value) {
            addCriterion("fadongjibianhao =", value, "fadongjibianhao");
            return (Criteria) this;
        }

        public Criteria andFadongjibianhaoNotEqualTo(String value) {
            addCriterion("fadongjibianhao <>", value, "fadongjibianhao");
            return (Criteria) this;
        }

        public Criteria andFadongjibianhaoGreaterThan(String value) {
            addCriterion("fadongjibianhao >", value, "fadongjibianhao");
            return (Criteria) this;
        }

        public Criteria andFadongjibianhaoGreaterThanOrEqualTo(String value) {
            addCriterion("fadongjibianhao >=", value, "fadongjibianhao");
            return (Criteria) this;
        }

        public Criteria andFadongjibianhaoLessThan(String value) {
            addCriterion("fadongjibianhao <", value, "fadongjibianhao");
            return (Criteria) this;
        }

        public Criteria andFadongjibianhaoLessThanOrEqualTo(String value) {
            addCriterion("fadongjibianhao <=", value, "fadongjibianhao");
            return (Criteria) this;
        }

        public Criteria andFadongjibianhaoLike(String value) {
            addCriterion("fadongjibianhao like", value, "fadongjibianhao");
            return (Criteria) this;
        }

        public Criteria andFadongjibianhaoNotLike(String value) {
            addCriterion("fadongjibianhao not like", value, "fadongjibianhao");
            return (Criteria) this;
        }

        public Criteria andFadongjibianhaoIn(List<String> values) {
            addCriterion("fadongjibianhao in", values, "fadongjibianhao");
            return (Criteria) this;
        }

        public Criteria andFadongjibianhaoNotIn(List<String> values) {
            addCriterion("fadongjibianhao not in", values, "fadongjibianhao");
            return (Criteria) this;
        }

        public Criteria andFadongjibianhaoBetween(String value1, String value2) {
            addCriterion("fadongjibianhao between", value1, value2, "fadongjibianhao");
            return (Criteria) this;
        }

        public Criteria andFadongjibianhaoNotBetween(String value1, String value2) {
            addCriterion("fadongjibianhao not between", value1, value2, "fadongjibianhao");
            return (Criteria) this;
        }

        public Criteria andChejiabianhaoIsNull() {
            addCriterion("chejiabianhao is null");
            return (Criteria) this;
        }

        public Criteria andChejiabianhaoIsNotNull() {
            addCriterion("chejiabianhao is not null");
            return (Criteria) this;
        }

        public Criteria andChejiabianhaoEqualTo(String value) {
            addCriterion("chejiabianhao =", value, "chejiabianhao");
            return (Criteria) this;
        }

        public Criteria andChejiabianhaoNotEqualTo(String value) {
            addCriterion("chejiabianhao <>", value, "chejiabianhao");
            return (Criteria) this;
        }

        public Criteria andChejiabianhaoGreaterThan(String value) {
            addCriterion("chejiabianhao >", value, "chejiabianhao");
            return (Criteria) this;
        }

        public Criteria andChejiabianhaoGreaterThanOrEqualTo(String value) {
            addCriterion("chejiabianhao >=", value, "chejiabianhao");
            return (Criteria) this;
        }

        public Criteria andChejiabianhaoLessThan(String value) {
            addCriterion("chejiabianhao <", value, "chejiabianhao");
            return (Criteria) this;
        }

        public Criteria andChejiabianhaoLessThanOrEqualTo(String value) {
            addCriterion("chejiabianhao <=", value, "chejiabianhao");
            return (Criteria) this;
        }

        public Criteria andChejiabianhaoLike(String value) {
            addCriterion("chejiabianhao like", value, "chejiabianhao");
            return (Criteria) this;
        }

        public Criteria andChejiabianhaoNotLike(String value) {
            addCriterion("chejiabianhao not like", value, "chejiabianhao");
            return (Criteria) this;
        }

        public Criteria andChejiabianhaoIn(List<String> values) {
            addCriterion("chejiabianhao in", values, "chejiabianhao");
            return (Criteria) this;
        }

        public Criteria andChejiabianhaoNotIn(List<String> values) {
            addCriterion("chejiabianhao not in", values, "chejiabianhao");
            return (Criteria) this;
        }

        public Criteria andChejiabianhaoBetween(String value1, String value2) {
            addCriterion("chejiabianhao between", value1, value2, "chejiabianhao");
            return (Criteria) this;
        }

        public Criteria andChejiabianhaoNotBetween(String value1, String value2) {
            addCriterion("chejiabianhao not between", value1, value2, "chejiabianhao");
            return (Criteria) this;
        }

        public Criteria andCheliangzhuangtaiIsNull() {
            addCriterion("cheliangzhuangtai is null");
            return (Criteria) this;
        }

        public Criteria andCheliangzhuangtaiIsNotNull() {
            addCriterion("cheliangzhuangtai is not null");
            return (Criteria) this;
        }

        public Criteria andCheliangzhuangtaiEqualTo(String value) {
            addCriterion("cheliangzhuangtai =", value, "cheliangzhuangtai");
            return (Criteria) this;
        }

        public Criteria andCheliangzhuangtaiNotEqualTo(String value) {
            addCriterion("cheliangzhuangtai <>", value, "cheliangzhuangtai");
            return (Criteria) this;
        }

        public Criteria andCheliangzhuangtaiGreaterThan(String value) {
            addCriterion("cheliangzhuangtai >", value, "cheliangzhuangtai");
            return (Criteria) this;
        }

        public Criteria andCheliangzhuangtaiGreaterThanOrEqualTo(String value) {
            addCriterion("cheliangzhuangtai >=", value, "cheliangzhuangtai");
            return (Criteria) this;
        }

        public Criteria andCheliangzhuangtaiLessThan(String value) {
            addCriterion("cheliangzhuangtai <", value, "cheliangzhuangtai");
            return (Criteria) this;
        }

        public Criteria andCheliangzhuangtaiLessThanOrEqualTo(String value) {
            addCriterion("cheliangzhuangtai <=", value, "cheliangzhuangtai");
            return (Criteria) this;
        }

        public Criteria andCheliangzhuangtaiLike(String value) {
            addCriterion("cheliangzhuangtai like", value, "cheliangzhuangtai");
            return (Criteria) this;
        }

        public Criteria andCheliangzhuangtaiNotLike(String value) {
            addCriterion("cheliangzhuangtai not like", value, "cheliangzhuangtai");
            return (Criteria) this;
        }

        public Criteria andCheliangzhuangtaiIn(List<String> values) {
            addCriterion("cheliangzhuangtai in", values, "cheliangzhuangtai");
            return (Criteria) this;
        }

        public Criteria andCheliangzhuangtaiNotIn(List<String> values) {
            addCriterion("cheliangzhuangtai not in", values, "cheliangzhuangtai");
            return (Criteria) this;
        }

        public Criteria andCheliangzhuangtaiBetween(String value1, String value2) {
            addCriterion("cheliangzhuangtai between", value1, value2, "cheliangzhuangtai");
            return (Criteria) this;
        }

        public Criteria andCheliangzhuangtaiNotBetween(String value1, String value2) {
            addCriterion("cheliangzhuangtai not between", value1, value2, "cheliangzhuangtai");
            return (Criteria) this;
        }

        public Criteria andShiyongzhuangtaiIsNull() {
            addCriterion("shiyongzhuangtai is null");
            return (Criteria) this;
        }

        public Criteria andShiyongzhuangtaiIsNotNull() {
            addCriterion("shiyongzhuangtai is not null");
            return (Criteria) this;
        }

        public Criteria andShiyongzhuangtaiEqualTo(String value) {
            addCriterion("shiyongzhuangtai =", value, "shiyongzhuangtai");
            return (Criteria) this;
        }

        public Criteria andShiyongzhuangtaiNotEqualTo(String value) {
            addCriterion("shiyongzhuangtai <>", value, "shiyongzhuangtai");
            return (Criteria) this;
        }

        public Criteria andShiyongzhuangtaiGreaterThan(String value) {
            addCriterion("shiyongzhuangtai >", value, "shiyongzhuangtai");
            return (Criteria) this;
        }

        public Criteria andShiyongzhuangtaiGreaterThanOrEqualTo(String value) {
            addCriterion("shiyongzhuangtai >=", value, "shiyongzhuangtai");
            return (Criteria) this;
        }

        public Criteria andShiyongzhuangtaiLessThan(String value) {
            addCriterion("shiyongzhuangtai <", value, "shiyongzhuangtai");
            return (Criteria) this;
        }

        public Criteria andShiyongzhuangtaiLessThanOrEqualTo(String value) {
            addCriterion("shiyongzhuangtai <=", value, "shiyongzhuangtai");
            return (Criteria) this;
        }

        public Criteria andShiyongzhuangtaiLike(String value) {
            addCriterion("shiyongzhuangtai like", value, "shiyongzhuangtai");
            return (Criteria) this;
        }

        public Criteria andShiyongzhuangtaiNotLike(String value) {
            addCriterion("shiyongzhuangtai not like", value, "shiyongzhuangtai");
            return (Criteria) this;
        }

        public Criteria andShiyongzhuangtaiIn(List<String> values) {
            addCriterion("shiyongzhuangtai in", values, "shiyongzhuangtai");
            return (Criteria) this;
        }

        public Criteria andShiyongzhuangtaiNotIn(List<String> values) {
            addCriterion("shiyongzhuangtai not in", values, "shiyongzhuangtai");
            return (Criteria) this;
        }

        public Criteria andShiyongzhuangtaiBetween(String value1, String value2) {
            addCriterion("shiyongzhuangtai between", value1, value2, "shiyongzhuangtai");
            return (Criteria) this;
        }

        public Criteria andShiyongzhuangtaiNotBetween(String value1, String value2) {
            addCriterion("shiyongzhuangtai not between", value1, value2, "shiyongzhuangtai");
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