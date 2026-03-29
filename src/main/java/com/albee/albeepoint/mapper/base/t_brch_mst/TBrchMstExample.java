package com.albee.albeepoint.mapper.base.t_brch_mst;

import java.time.LocalDateTime;
import java.util.ArrayList;
import java.util.List;

public class TBrchMstExample {
    protected String orderByClause;

    protected boolean distinct;

    protected List<Criteria> oredCriteria;

    public TBrchMstExample() {
        oredCriteria = new ArrayList<>();
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
            criteria = new ArrayList<>();
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

        public Criteria andOrgNoIsNull() {
            addCriterion("ORG_NO is null");
            return (Criteria) this;
        }

        public Criteria andOrgNoIsNotNull() {
            addCriterion("ORG_NO is not null");
            return (Criteria) this;
        }

        public Criteria andOrgNoEqualTo(Long value) {
            addCriterion("ORG_NO =", value, "orgNo");
            return (Criteria) this;
        }

        public Criteria andOrgNoNotEqualTo(Long value) {
            addCriterion("ORG_NO <>", value, "orgNo");
            return (Criteria) this;
        }

        public Criteria andOrgNoGreaterThan(Long value) {
            addCriterion("ORG_NO >", value, "orgNo");
            return (Criteria) this;
        }

        public Criteria andOrgNoGreaterThanOrEqualTo(Long value) {
            addCriterion("ORG_NO >=", value, "orgNo");
            return (Criteria) this;
        }

        public Criteria andOrgNoLessThan(Long value) {
            addCriterion("ORG_NO <", value, "orgNo");
            return (Criteria) this;
        }

        public Criteria andOrgNoLessThanOrEqualTo(Long value) {
            addCriterion("ORG_NO <=", value, "orgNo");
            return (Criteria) this;
        }

        public Criteria andOrgNoIn(List<Long> values) {
            addCriterion("ORG_NO in", values, "orgNo");
            return (Criteria) this;
        }

        public Criteria andOrgNoNotIn(List<Long> values) {
            addCriterion("ORG_NO not in", values, "orgNo");
            return (Criteria) this;
        }

        public Criteria andOrgNoBetween(Long value1, Long value2) {
            addCriterion("ORG_NO between", value1, value2, "orgNo");
            return (Criteria) this;
        }

        public Criteria andOrgNoNotBetween(Long value1, Long value2) {
            addCriterion("ORG_NO not between", value1, value2, "orgNo");
            return (Criteria) this;
        }

        public Criteria andBrchNoIsNull() {
            addCriterion("BRCH_NO is null");
            return (Criteria) this;
        }

        public Criteria andBrchNoIsNotNull() {
            addCriterion("BRCH_NO is not null");
            return (Criteria) this;
        }

        public Criteria andBrchNoEqualTo(Long value) {
            addCriterion("BRCH_NO =", value, "brchNo");
            return (Criteria) this;
        }

        public Criteria andBrchNoNotEqualTo(Long value) {
            addCriterion("BRCH_NO <>", value, "brchNo");
            return (Criteria) this;
        }

        public Criteria andBrchNoGreaterThan(Long value) {
            addCriterion("BRCH_NO >", value, "brchNo");
            return (Criteria) this;
        }

        public Criteria andBrchNoGreaterThanOrEqualTo(Long value) {
            addCriterion("BRCH_NO >=", value, "brchNo");
            return (Criteria) this;
        }

        public Criteria andBrchNoLessThan(Long value) {
            addCriterion("BRCH_NO <", value, "brchNo");
            return (Criteria) this;
        }

        public Criteria andBrchNoLessThanOrEqualTo(Long value) {
            addCriterion("BRCH_NO <=", value, "brchNo");
            return (Criteria) this;
        }

        public Criteria andBrchNoIn(List<Long> values) {
            addCriterion("BRCH_NO in", values, "brchNo");
            return (Criteria) this;
        }

        public Criteria andBrchNoNotIn(List<Long> values) {
            addCriterion("BRCH_NO not in", values, "brchNo");
            return (Criteria) this;
        }

        public Criteria andBrchNoBetween(Long value1, Long value2) {
            addCriterion("BRCH_NO between", value1, value2, "brchNo");
            return (Criteria) this;
        }

        public Criteria andBrchNoNotBetween(Long value1, Long value2) {
            addCriterion("BRCH_NO not between", value1, value2, "brchNo");
            return (Criteria) this;
        }

        public Criteria andOrgCdIsNull() {
            addCriterion("ORG_CD is null");
            return (Criteria) this;
        }

        public Criteria andOrgCdIsNotNull() {
            addCriterion("ORG_CD is not null");
            return (Criteria) this;
        }

        public Criteria andOrgCdEqualTo(String value) {
            addCriterion("ORG_CD =", value, "orgCd");
            return (Criteria) this;
        }

        public Criteria andOrgCdNotEqualTo(String value) {
            addCriterion("ORG_CD <>", value, "orgCd");
            return (Criteria) this;
        }

        public Criteria andOrgCdGreaterThan(String value) {
            addCriterion("ORG_CD >", value, "orgCd");
            return (Criteria) this;
        }

        public Criteria andOrgCdGreaterThanOrEqualTo(String value) {
            addCriterion("ORG_CD >=", value, "orgCd");
            return (Criteria) this;
        }

        public Criteria andOrgCdLessThan(String value) {
            addCriterion("ORG_CD <", value, "orgCd");
            return (Criteria) this;
        }

        public Criteria andOrgCdLessThanOrEqualTo(String value) {
            addCriterion("ORG_CD <=", value, "orgCd");
            return (Criteria) this;
        }

        public Criteria andOrgCdLike(String value) {
            addCriterion("ORG_CD like", value, "orgCd");
            return (Criteria) this;
        }

        public Criteria andOrgCdNotLike(String value) {
            addCriterion("ORG_CD not like", value, "orgCd");
            return (Criteria) this;
        }

        public Criteria andOrgCdIn(List<String> values) {
            addCriterion("ORG_CD in", values, "orgCd");
            return (Criteria) this;
        }

        public Criteria andOrgCdNotIn(List<String> values) {
            addCriterion("ORG_CD not in", values, "orgCd");
            return (Criteria) this;
        }

        public Criteria andOrgCdBetween(String value1, String value2) {
            addCriterion("ORG_CD between", value1, value2, "orgCd");
            return (Criteria) this;
        }

        public Criteria andOrgCdNotBetween(String value1, String value2) {
            addCriterion("ORG_CD not between", value1, value2, "orgCd");
            return (Criteria) this;
        }

        public Criteria andBrchCdIsNull() {
            addCriterion("BRCH_CD is null");
            return (Criteria) this;
        }

        public Criteria andBrchCdIsNotNull() {
            addCriterion("BRCH_CD is not null");
            return (Criteria) this;
        }

        public Criteria andBrchCdEqualTo(String value) {
            addCriterion("BRCH_CD =", value, "brchCd");
            return (Criteria) this;
        }

        public Criteria andBrchCdNotEqualTo(String value) {
            addCriterion("BRCH_CD <>", value, "brchCd");
            return (Criteria) this;
        }

        public Criteria andBrchCdGreaterThan(String value) {
            addCriterion("BRCH_CD >", value, "brchCd");
            return (Criteria) this;
        }

        public Criteria andBrchCdGreaterThanOrEqualTo(String value) {
            addCriterion("BRCH_CD >=", value, "brchCd");
            return (Criteria) this;
        }

        public Criteria andBrchCdLessThan(String value) {
            addCriterion("BRCH_CD <", value, "brchCd");
            return (Criteria) this;
        }

        public Criteria andBrchCdLessThanOrEqualTo(String value) {
            addCriterion("BRCH_CD <=", value, "brchCd");
            return (Criteria) this;
        }

        public Criteria andBrchCdLike(String value) {
            addCriterion("BRCH_CD like", value, "brchCd");
            return (Criteria) this;
        }

        public Criteria andBrchCdNotLike(String value) {
            addCriterion("BRCH_CD not like", value, "brchCd");
            return (Criteria) this;
        }

        public Criteria andBrchCdIn(List<String> values) {
            addCriterion("BRCH_CD in", values, "brchCd");
            return (Criteria) this;
        }

        public Criteria andBrchCdNotIn(List<String> values) {
            addCriterion("BRCH_CD not in", values, "brchCd");
            return (Criteria) this;
        }

        public Criteria andBrchCdBetween(String value1, String value2) {
            addCriterion("BRCH_CD between", value1, value2, "brchCd");
            return (Criteria) this;
        }

        public Criteria andBrchCdNotBetween(String value1, String value2) {
            addCriterion("BRCH_CD not between", value1, value2, "brchCd");
            return (Criteria) this;
        }

        public Criteria andBrchNmIsNull() {
            addCriterion("BRCH_NM is null");
            return (Criteria) this;
        }

        public Criteria andBrchNmIsNotNull() {
            addCriterion("BRCH_NM is not null");
            return (Criteria) this;
        }

        public Criteria andBrchNmEqualTo(String value) {
            addCriterion("BRCH_NM =", value, "brchNm");
            return (Criteria) this;
        }

        public Criteria andBrchNmNotEqualTo(String value) {
            addCriterion("BRCH_NM <>", value, "brchNm");
            return (Criteria) this;
        }

        public Criteria andBrchNmGreaterThan(String value) {
            addCriterion("BRCH_NM >", value, "brchNm");
            return (Criteria) this;
        }

        public Criteria andBrchNmGreaterThanOrEqualTo(String value) {
            addCriterion("BRCH_NM >=", value, "brchNm");
            return (Criteria) this;
        }

        public Criteria andBrchNmLessThan(String value) {
            addCriterion("BRCH_NM <", value, "brchNm");
            return (Criteria) this;
        }

        public Criteria andBrchNmLessThanOrEqualTo(String value) {
            addCriterion("BRCH_NM <=", value, "brchNm");
            return (Criteria) this;
        }

        public Criteria andBrchNmLike(String value) {
            addCriterion("BRCH_NM like", value, "brchNm");
            return (Criteria) this;
        }

        public Criteria andBrchNmNotLike(String value) {
            addCriterion("BRCH_NM not like", value, "brchNm");
            return (Criteria) this;
        }

        public Criteria andBrchNmIn(List<String> values) {
            addCriterion("BRCH_NM in", values, "brchNm");
            return (Criteria) this;
        }

        public Criteria andBrchNmNotIn(List<String> values) {
            addCriterion("BRCH_NM not in", values, "brchNm");
            return (Criteria) this;
        }

        public Criteria andBrchNmBetween(String value1, String value2) {
            addCriterion("BRCH_NM between", value1, value2, "brchNm");
            return (Criteria) this;
        }

        public Criteria andBrchNmNotBetween(String value1, String value2) {
            addCriterion("BRCH_NM not between", value1, value2, "brchNm");
            return (Criteria) this;
        }

        public Criteria andBrchDispNmIsNull() {
            addCriterion("BRCH_DISP_NM is null");
            return (Criteria) this;
        }

        public Criteria andBrchDispNmIsNotNull() {
            addCriterion("BRCH_DISP_NM is not null");
            return (Criteria) this;
        }

        public Criteria andBrchDispNmEqualTo(String value) {
            addCriterion("BRCH_DISP_NM =", value, "brchDispNm");
            return (Criteria) this;
        }

        public Criteria andBrchDispNmNotEqualTo(String value) {
            addCriterion("BRCH_DISP_NM <>", value, "brchDispNm");
            return (Criteria) this;
        }

        public Criteria andBrchDispNmGreaterThan(String value) {
            addCriterion("BRCH_DISP_NM >", value, "brchDispNm");
            return (Criteria) this;
        }

        public Criteria andBrchDispNmGreaterThanOrEqualTo(String value) {
            addCriterion("BRCH_DISP_NM >=", value, "brchDispNm");
            return (Criteria) this;
        }

        public Criteria andBrchDispNmLessThan(String value) {
            addCriterion("BRCH_DISP_NM <", value, "brchDispNm");
            return (Criteria) this;
        }

        public Criteria andBrchDispNmLessThanOrEqualTo(String value) {
            addCriterion("BRCH_DISP_NM <=", value, "brchDispNm");
            return (Criteria) this;
        }

        public Criteria andBrchDispNmLike(String value) {
            addCriterion("BRCH_DISP_NM like", value, "brchDispNm");
            return (Criteria) this;
        }

        public Criteria andBrchDispNmNotLike(String value) {
            addCriterion("BRCH_DISP_NM not like", value, "brchDispNm");
            return (Criteria) this;
        }

        public Criteria andBrchDispNmIn(List<String> values) {
            addCriterion("BRCH_DISP_NM in", values, "brchDispNm");
            return (Criteria) this;
        }

        public Criteria andBrchDispNmNotIn(List<String> values) {
            addCriterion("BRCH_DISP_NM not in", values, "brchDispNm");
            return (Criteria) this;
        }

        public Criteria andBrchDispNmBetween(String value1, String value2) {
            addCriterion("BRCH_DISP_NM between", value1, value2, "brchDispNm");
            return (Criteria) this;
        }

        public Criteria andBrchDispNmNotBetween(String value1, String value2) {
            addCriterion("BRCH_DISP_NM not between", value1, value2, "brchDispNm");
            return (Criteria) this;
        }

        public Criteria andSaveCanYnIsNull() {
            addCriterion("SAVE_CAN_YN is null");
            return (Criteria) this;
        }

        public Criteria andSaveCanYnIsNotNull() {
            addCriterion("SAVE_CAN_YN is not null");
            return (Criteria) this;
        }

        public Criteria andSaveCanYnEqualTo(String value) {
            addCriterion("SAVE_CAN_YN =", value, "saveCanYn");
            return (Criteria) this;
        }

        public Criteria andSaveCanYnNotEqualTo(String value) {
            addCriterion("SAVE_CAN_YN <>", value, "saveCanYn");
            return (Criteria) this;
        }

        public Criteria andSaveCanYnGreaterThan(String value) {
            addCriterion("SAVE_CAN_YN >", value, "saveCanYn");
            return (Criteria) this;
        }

        public Criteria andSaveCanYnGreaterThanOrEqualTo(String value) {
            addCriterion("SAVE_CAN_YN >=", value, "saveCanYn");
            return (Criteria) this;
        }

        public Criteria andSaveCanYnLessThan(String value) {
            addCriterion("SAVE_CAN_YN <", value, "saveCanYn");
            return (Criteria) this;
        }

        public Criteria andSaveCanYnLessThanOrEqualTo(String value) {
            addCriterion("SAVE_CAN_YN <=", value, "saveCanYn");
            return (Criteria) this;
        }

        public Criteria andSaveCanYnLike(String value) {
            addCriterion("SAVE_CAN_YN like", value, "saveCanYn");
            return (Criteria) this;
        }

        public Criteria andSaveCanYnNotLike(String value) {
            addCriterion("SAVE_CAN_YN not like", value, "saveCanYn");
            return (Criteria) this;
        }

        public Criteria andSaveCanYnIn(List<String> values) {
            addCriterion("SAVE_CAN_YN in", values, "saveCanYn");
            return (Criteria) this;
        }

        public Criteria andSaveCanYnNotIn(List<String> values) {
            addCriterion("SAVE_CAN_YN not in", values, "saveCanYn");
            return (Criteria) this;
        }

        public Criteria andSaveCanYnBetween(String value1, String value2) {
            addCriterion("SAVE_CAN_YN between", value1, value2, "saveCanYn");
            return (Criteria) this;
        }

        public Criteria andSaveCanYnNotBetween(String value1, String value2) {
            addCriterion("SAVE_CAN_YN not between", value1, value2, "saveCanYn");
            return (Criteria) this;
        }

        public Criteria andUseCanYnIsNull() {
            addCriterion("USE_CAN_YN is null");
            return (Criteria) this;
        }

        public Criteria andUseCanYnIsNotNull() {
            addCriterion("USE_CAN_YN is not null");
            return (Criteria) this;
        }

        public Criteria andUseCanYnEqualTo(String value) {
            addCriterion("USE_CAN_YN =", value, "useCanYn");
            return (Criteria) this;
        }

        public Criteria andUseCanYnNotEqualTo(String value) {
            addCriterion("USE_CAN_YN <>", value, "useCanYn");
            return (Criteria) this;
        }

        public Criteria andUseCanYnGreaterThan(String value) {
            addCriterion("USE_CAN_YN >", value, "useCanYn");
            return (Criteria) this;
        }

        public Criteria andUseCanYnGreaterThanOrEqualTo(String value) {
            addCriterion("USE_CAN_YN >=", value, "useCanYn");
            return (Criteria) this;
        }

        public Criteria andUseCanYnLessThan(String value) {
            addCriterion("USE_CAN_YN <", value, "useCanYn");
            return (Criteria) this;
        }

        public Criteria andUseCanYnLessThanOrEqualTo(String value) {
            addCriterion("USE_CAN_YN <=", value, "useCanYn");
            return (Criteria) this;
        }

        public Criteria andUseCanYnLike(String value) {
            addCriterion("USE_CAN_YN like", value, "useCanYn");
            return (Criteria) this;
        }

        public Criteria andUseCanYnNotLike(String value) {
            addCriterion("USE_CAN_YN not like", value, "useCanYn");
            return (Criteria) this;
        }

        public Criteria andUseCanYnIn(List<String> values) {
            addCriterion("USE_CAN_YN in", values, "useCanYn");
            return (Criteria) this;
        }

        public Criteria andUseCanYnNotIn(List<String> values) {
            addCriterion("USE_CAN_YN not in", values, "useCanYn");
            return (Criteria) this;
        }

        public Criteria andUseCanYnBetween(String value1, String value2) {
            addCriterion("USE_CAN_YN between", value1, value2, "useCanYn");
            return (Criteria) this;
        }

        public Criteria andUseCanYnNotBetween(String value1, String value2) {
            addCriterion("USE_CAN_YN not between", value1, value2, "useCanYn");
            return (Criteria) this;
        }

        public Criteria andBrchStsCdIsNull() {
            addCriterion("BRCH_STS_CD is null");
            return (Criteria) this;
        }

        public Criteria andBrchStsCdIsNotNull() {
            addCriterion("BRCH_STS_CD is not null");
            return (Criteria) this;
        }

        public Criteria andBrchStsCdEqualTo(String value) {
            addCriterion("BRCH_STS_CD =", value, "brchStsCd");
            return (Criteria) this;
        }

        public Criteria andBrchStsCdNotEqualTo(String value) {
            addCriterion("BRCH_STS_CD <>", value, "brchStsCd");
            return (Criteria) this;
        }

        public Criteria andBrchStsCdGreaterThan(String value) {
            addCriterion("BRCH_STS_CD >", value, "brchStsCd");
            return (Criteria) this;
        }

        public Criteria andBrchStsCdGreaterThanOrEqualTo(String value) {
            addCriterion("BRCH_STS_CD >=", value, "brchStsCd");
            return (Criteria) this;
        }

        public Criteria andBrchStsCdLessThan(String value) {
            addCriterion("BRCH_STS_CD <", value, "brchStsCd");
            return (Criteria) this;
        }

        public Criteria andBrchStsCdLessThanOrEqualTo(String value) {
            addCriterion("BRCH_STS_CD <=", value, "brchStsCd");
            return (Criteria) this;
        }

        public Criteria andBrchStsCdLike(String value) {
            addCriterion("BRCH_STS_CD like", value, "brchStsCd");
            return (Criteria) this;
        }

        public Criteria andBrchStsCdNotLike(String value) {
            addCriterion("BRCH_STS_CD not like", value, "brchStsCd");
            return (Criteria) this;
        }

        public Criteria andBrchStsCdIn(List<String> values) {
            addCriterion("BRCH_STS_CD in", values, "brchStsCd");
            return (Criteria) this;
        }

        public Criteria andBrchStsCdNotIn(List<String> values) {
            addCriterion("BRCH_STS_CD not in", values, "brchStsCd");
            return (Criteria) this;
        }

        public Criteria andBrchStsCdBetween(String value1, String value2) {
            addCriterion("BRCH_STS_CD between", value1, value2, "brchStsCd");
            return (Criteria) this;
        }

        public Criteria andBrchStsCdNotBetween(String value1, String value2) {
            addCriterion("BRCH_STS_CD not between", value1, value2, "brchStsCd");
            return (Criteria) this;
        }

        public Criteria andRegUserIdIsNull() {
            addCriterion("REG_USER_ID is null");
            return (Criteria) this;
        }

        public Criteria andRegUserIdIsNotNull() {
            addCriterion("REG_USER_ID is not null");
            return (Criteria) this;
        }

        public Criteria andRegUserIdEqualTo(String value) {
            addCriterion("REG_USER_ID =", value, "regUserId");
            return (Criteria) this;
        }

        public Criteria andRegUserIdNotEqualTo(String value) {
            addCriterion("REG_USER_ID <>", value, "regUserId");
            return (Criteria) this;
        }

        public Criteria andRegUserIdGreaterThan(String value) {
            addCriterion("REG_USER_ID >", value, "regUserId");
            return (Criteria) this;
        }

        public Criteria andRegUserIdGreaterThanOrEqualTo(String value) {
            addCriterion("REG_USER_ID >=", value, "regUserId");
            return (Criteria) this;
        }

        public Criteria andRegUserIdLessThan(String value) {
            addCriterion("REG_USER_ID <", value, "regUserId");
            return (Criteria) this;
        }

        public Criteria andRegUserIdLessThanOrEqualTo(String value) {
            addCriterion("REG_USER_ID <=", value, "regUserId");
            return (Criteria) this;
        }

        public Criteria andRegUserIdLike(String value) {
            addCriterion("REG_USER_ID like", value, "regUserId");
            return (Criteria) this;
        }

        public Criteria andRegUserIdNotLike(String value) {
            addCriterion("REG_USER_ID not like", value, "regUserId");
            return (Criteria) this;
        }

        public Criteria andRegUserIdIn(List<String> values) {
            addCriterion("REG_USER_ID in", values, "regUserId");
            return (Criteria) this;
        }

        public Criteria andRegUserIdNotIn(List<String> values) {
            addCriterion("REG_USER_ID not in", values, "regUserId");
            return (Criteria) this;
        }

        public Criteria andRegUserIdBetween(String value1, String value2) {
            addCriterion("REG_USER_ID between", value1, value2, "regUserId");
            return (Criteria) this;
        }

        public Criteria andRegUserIdNotBetween(String value1, String value2) {
            addCriterion("REG_USER_ID not between", value1, value2, "regUserId");
            return (Criteria) this;
        }

        public Criteria andRegDtIsNull() {
            addCriterion("REG_DT is null");
            return (Criteria) this;
        }

        public Criteria andRegDtIsNotNull() {
            addCriterion("REG_DT is not null");
            return (Criteria) this;
        }

        public Criteria andRegDtEqualTo(LocalDateTime value) {
            addCriterion("REG_DT =", value, "regDt");
            return (Criteria) this;
        }

        public Criteria andRegDtNotEqualTo(LocalDateTime value) {
            addCriterion("REG_DT <>", value, "regDt");
            return (Criteria) this;
        }

        public Criteria andRegDtGreaterThan(LocalDateTime value) {
            addCriterion("REG_DT >", value, "regDt");
            return (Criteria) this;
        }

        public Criteria andRegDtGreaterThanOrEqualTo(LocalDateTime value) {
            addCriterion("REG_DT >=", value, "regDt");
            return (Criteria) this;
        }

        public Criteria andRegDtLessThan(LocalDateTime value) {
            addCriterion("REG_DT <", value, "regDt");
            return (Criteria) this;
        }

        public Criteria andRegDtLessThanOrEqualTo(LocalDateTime value) {
            addCriterion("REG_DT <=", value, "regDt");
            return (Criteria) this;
        }

        public Criteria andRegDtIn(List<LocalDateTime> values) {
            addCriterion("REG_DT in", values, "regDt");
            return (Criteria) this;
        }

        public Criteria andRegDtNotIn(List<LocalDateTime> values) {
            addCriterion("REG_DT not in", values, "regDt");
            return (Criteria) this;
        }

        public Criteria andRegDtBetween(LocalDateTime value1, LocalDateTime value2) {
            addCriterion("REG_DT between", value1, value2, "regDt");
            return (Criteria) this;
        }

        public Criteria andRegDtNotBetween(LocalDateTime value1, LocalDateTime value2) {
            addCriterion("REG_DT not between", value1, value2, "regDt");
            return (Criteria) this;
        }

        public Criteria andLastModUserIdIsNull() {
            addCriterion("LAST_MOD_USER_ID is null");
            return (Criteria) this;
        }

        public Criteria andLastModUserIdIsNotNull() {
            addCriterion("LAST_MOD_USER_ID is not null");
            return (Criteria) this;
        }

        public Criteria andLastModUserIdEqualTo(String value) {
            addCriterion("LAST_MOD_USER_ID =", value, "lastModUserId");
            return (Criteria) this;
        }

        public Criteria andLastModUserIdNotEqualTo(String value) {
            addCriterion("LAST_MOD_USER_ID <>", value, "lastModUserId");
            return (Criteria) this;
        }

        public Criteria andLastModUserIdGreaterThan(String value) {
            addCriterion("LAST_MOD_USER_ID >", value, "lastModUserId");
            return (Criteria) this;
        }

        public Criteria andLastModUserIdGreaterThanOrEqualTo(String value) {
            addCriterion("LAST_MOD_USER_ID >=", value, "lastModUserId");
            return (Criteria) this;
        }

        public Criteria andLastModUserIdLessThan(String value) {
            addCriterion("LAST_MOD_USER_ID <", value, "lastModUserId");
            return (Criteria) this;
        }

        public Criteria andLastModUserIdLessThanOrEqualTo(String value) {
            addCriterion("LAST_MOD_USER_ID <=", value, "lastModUserId");
            return (Criteria) this;
        }

        public Criteria andLastModUserIdLike(String value) {
            addCriterion("LAST_MOD_USER_ID like", value, "lastModUserId");
            return (Criteria) this;
        }

        public Criteria andLastModUserIdNotLike(String value) {
            addCriterion("LAST_MOD_USER_ID not like", value, "lastModUserId");
            return (Criteria) this;
        }

        public Criteria andLastModUserIdIn(List<String> values) {
            addCriterion("LAST_MOD_USER_ID in", values, "lastModUserId");
            return (Criteria) this;
        }

        public Criteria andLastModUserIdNotIn(List<String> values) {
            addCriterion("LAST_MOD_USER_ID not in", values, "lastModUserId");
            return (Criteria) this;
        }

        public Criteria andLastModUserIdBetween(String value1, String value2) {
            addCriterion("LAST_MOD_USER_ID between", value1, value2, "lastModUserId");
            return (Criteria) this;
        }

        public Criteria andLastModUserIdNotBetween(String value1, String value2) {
            addCriterion("LAST_MOD_USER_ID not between", value1, value2, "lastModUserId");
            return (Criteria) this;
        }

        public Criteria andLastModDtIsNull() {
            addCriterion("LAST_MOD_DT is null");
            return (Criteria) this;
        }

        public Criteria andLastModDtIsNotNull() {
            addCriterion("LAST_MOD_DT is not null");
            return (Criteria) this;
        }

        public Criteria andLastModDtEqualTo(LocalDateTime value) {
            addCriterion("LAST_MOD_DT =", value, "lastModDt");
            return (Criteria) this;
        }

        public Criteria andLastModDtNotEqualTo(LocalDateTime value) {
            addCriterion("LAST_MOD_DT <>", value, "lastModDt");
            return (Criteria) this;
        }

        public Criteria andLastModDtGreaterThan(LocalDateTime value) {
            addCriterion("LAST_MOD_DT >", value, "lastModDt");
            return (Criteria) this;
        }

        public Criteria andLastModDtGreaterThanOrEqualTo(LocalDateTime value) {
            addCriterion("LAST_MOD_DT >=", value, "lastModDt");
            return (Criteria) this;
        }

        public Criteria andLastModDtLessThan(LocalDateTime value) {
            addCriterion("LAST_MOD_DT <", value, "lastModDt");
            return (Criteria) this;
        }

        public Criteria andLastModDtLessThanOrEqualTo(LocalDateTime value) {
            addCriterion("LAST_MOD_DT <=", value, "lastModDt");
            return (Criteria) this;
        }

        public Criteria andLastModDtIn(List<LocalDateTime> values) {
            addCriterion("LAST_MOD_DT in", values, "lastModDt");
            return (Criteria) this;
        }

        public Criteria andLastModDtNotIn(List<LocalDateTime> values) {
            addCriterion("LAST_MOD_DT not in", values, "lastModDt");
            return (Criteria) this;
        }

        public Criteria andLastModDtBetween(LocalDateTime value1, LocalDateTime value2) {
            addCriterion("LAST_MOD_DT between", value1, value2, "lastModDt");
            return (Criteria) this;
        }

        public Criteria andLastModDtNotBetween(LocalDateTime value1, LocalDateTime value2) {
            addCriterion("LAST_MOD_DT not between", value1, value2, "lastModDt");
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