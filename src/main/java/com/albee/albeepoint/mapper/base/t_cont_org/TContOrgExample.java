package com.albee.albeepoint.mapper.base.t_cont_org;

import java.time.LocalDateTime;
import java.util.ArrayList;
import java.util.List;

public class TContOrgExample {
    protected String orderByClause;

    protected boolean distinct;

    protected List<Criteria> oredCriteria;

    public TContOrgExample() {
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

        public Criteria andContNoIsNull() {
            addCriterion("CONT_NO is null");
            return (Criteria) this;
        }

        public Criteria andContNoIsNotNull() {
            addCriterion("CONT_NO is not null");
            return (Criteria) this;
        }

        public Criteria andContNoEqualTo(Long value) {
            addCriterion("CONT_NO =", value, "contNo");
            return (Criteria) this;
        }

        public Criteria andContNoNotEqualTo(Long value) {
            addCriterion("CONT_NO <>", value, "contNo");
            return (Criteria) this;
        }

        public Criteria andContNoGreaterThan(Long value) {
            addCriterion("CONT_NO >", value, "contNo");
            return (Criteria) this;
        }

        public Criteria andContNoGreaterThanOrEqualTo(Long value) {
            addCriterion("CONT_NO >=", value, "contNo");
            return (Criteria) this;
        }

        public Criteria andContNoLessThan(Long value) {
            addCriterion("CONT_NO <", value, "contNo");
            return (Criteria) this;
        }

        public Criteria andContNoLessThanOrEqualTo(Long value) {
            addCriterion("CONT_NO <=", value, "contNo");
            return (Criteria) this;
        }

        public Criteria andContNoIn(List<Long> values) {
            addCriterion("CONT_NO in", values, "contNo");
            return (Criteria) this;
        }

        public Criteria andContNoNotIn(List<Long> values) {
            addCriterion("CONT_NO not in", values, "contNo");
            return (Criteria) this;
        }

        public Criteria andContNoBetween(Long value1, Long value2) {
            addCriterion("CONT_NO between", value1, value2, "contNo");
            return (Criteria) this;
        }

        public Criteria andContNoNotBetween(Long value1, Long value2) {
            addCriterion("CONT_NO not between", value1, value2, "contNo");
            return (Criteria) this;
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

        public Criteria andContSeqIsNull() {
            addCriterion("CONT_SEQ is null");
            return (Criteria) this;
        }

        public Criteria andContSeqIsNotNull() {
            addCriterion("CONT_SEQ is not null");
            return (Criteria) this;
        }

        public Criteria andContSeqEqualTo(Long value) {
            addCriterion("CONT_SEQ =", value, "contSeq");
            return (Criteria) this;
        }

        public Criteria andContSeqNotEqualTo(Long value) {
            addCriterion("CONT_SEQ <>", value, "contSeq");
            return (Criteria) this;
        }

        public Criteria andContSeqGreaterThan(Long value) {
            addCriterion("CONT_SEQ >", value, "contSeq");
            return (Criteria) this;
        }

        public Criteria andContSeqGreaterThanOrEqualTo(Long value) {
            addCriterion("CONT_SEQ >=", value, "contSeq");
            return (Criteria) this;
        }

        public Criteria andContSeqLessThan(Long value) {
            addCriterion("CONT_SEQ <", value, "contSeq");
            return (Criteria) this;
        }

        public Criteria andContSeqLessThanOrEqualTo(Long value) {
            addCriterion("CONT_SEQ <=", value, "contSeq");
            return (Criteria) this;
        }

        public Criteria andContSeqIn(List<Long> values) {
            addCriterion("CONT_SEQ in", values, "contSeq");
            return (Criteria) this;
        }

        public Criteria andContSeqNotIn(List<Long> values) {
            addCriterion("CONT_SEQ not in", values, "contSeq");
            return (Criteria) this;
        }

        public Criteria andContSeqBetween(Long value1, Long value2) {
            addCriterion("CONT_SEQ between", value1, value2, "contSeq");
            return (Criteria) this;
        }

        public Criteria andContSeqNotBetween(Long value1, Long value2) {
            addCriterion("CONT_SEQ not between", value1, value2, "contSeq");
            return (Criteria) this;
        }

        public Criteria andBrchPolicyTypeCdIsNull() {
            addCriterion("BRCH_POLICY_TYPE_CD is null");
            return (Criteria) this;
        }

        public Criteria andBrchPolicyTypeCdIsNotNull() {
            addCriterion("BRCH_POLICY_TYPE_CD is not null");
            return (Criteria) this;
        }

        public Criteria andBrchPolicyTypeCdEqualTo(String value) {
            addCriterion("BRCH_POLICY_TYPE_CD =", value, "brchPolicyTypeCd");
            return (Criteria) this;
        }

        public Criteria andBrchPolicyTypeCdNotEqualTo(String value) {
            addCriterion("BRCH_POLICY_TYPE_CD <>", value, "brchPolicyTypeCd");
            return (Criteria) this;
        }

        public Criteria andBrchPolicyTypeCdGreaterThan(String value) {
            addCriterion("BRCH_POLICY_TYPE_CD >", value, "brchPolicyTypeCd");
            return (Criteria) this;
        }

        public Criteria andBrchPolicyTypeCdGreaterThanOrEqualTo(String value) {
            addCriterion("BRCH_POLICY_TYPE_CD >=", value, "brchPolicyTypeCd");
            return (Criteria) this;
        }

        public Criteria andBrchPolicyTypeCdLessThan(String value) {
            addCriterion("BRCH_POLICY_TYPE_CD <", value, "brchPolicyTypeCd");
            return (Criteria) this;
        }

        public Criteria andBrchPolicyTypeCdLessThanOrEqualTo(String value) {
            addCriterion("BRCH_POLICY_TYPE_CD <=", value, "brchPolicyTypeCd");
            return (Criteria) this;
        }

        public Criteria andBrchPolicyTypeCdLike(String value) {
            addCriterion("BRCH_POLICY_TYPE_CD like", value, "brchPolicyTypeCd");
            return (Criteria) this;
        }

        public Criteria andBrchPolicyTypeCdNotLike(String value) {
            addCriterion("BRCH_POLICY_TYPE_CD not like", value, "brchPolicyTypeCd");
            return (Criteria) this;
        }

        public Criteria andBrchPolicyTypeCdIn(List<String> values) {
            addCriterion("BRCH_POLICY_TYPE_CD in", values, "brchPolicyTypeCd");
            return (Criteria) this;
        }

        public Criteria andBrchPolicyTypeCdNotIn(List<String> values) {
            addCriterion("BRCH_POLICY_TYPE_CD not in", values, "brchPolicyTypeCd");
            return (Criteria) this;
        }

        public Criteria andBrchPolicyTypeCdBetween(String value1, String value2) {
            addCriterion("BRCH_POLICY_TYPE_CD between", value1, value2, "brchPolicyTypeCd");
            return (Criteria) this;
        }

        public Criteria andBrchPolicyTypeCdNotBetween(String value1, String value2) {
            addCriterion("BRCH_POLICY_TYPE_CD not between", value1, value2, "brchPolicyTypeCd");
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

        public Criteria andContOrgStsCdIsNull() {
            addCriterion("CONT_ORG_STS_CD is null");
            return (Criteria) this;
        }

        public Criteria andContOrgStsCdIsNotNull() {
            addCriterion("CONT_ORG_STS_CD is not null");
            return (Criteria) this;
        }

        public Criteria andContOrgStsCdEqualTo(String value) {
            addCriterion("CONT_ORG_STS_CD =", value, "contOrgStsCd");
            return (Criteria) this;
        }

        public Criteria andContOrgStsCdNotEqualTo(String value) {
            addCriterion("CONT_ORG_STS_CD <>", value, "contOrgStsCd");
            return (Criteria) this;
        }

        public Criteria andContOrgStsCdGreaterThan(String value) {
            addCriterion("CONT_ORG_STS_CD >", value, "contOrgStsCd");
            return (Criteria) this;
        }

        public Criteria andContOrgStsCdGreaterThanOrEqualTo(String value) {
            addCriterion("CONT_ORG_STS_CD >=", value, "contOrgStsCd");
            return (Criteria) this;
        }

        public Criteria andContOrgStsCdLessThan(String value) {
            addCriterion("CONT_ORG_STS_CD <", value, "contOrgStsCd");
            return (Criteria) this;
        }

        public Criteria andContOrgStsCdLessThanOrEqualTo(String value) {
            addCriterion("CONT_ORG_STS_CD <=", value, "contOrgStsCd");
            return (Criteria) this;
        }

        public Criteria andContOrgStsCdLike(String value) {
            addCriterion("CONT_ORG_STS_CD like", value, "contOrgStsCd");
            return (Criteria) this;
        }

        public Criteria andContOrgStsCdNotLike(String value) {
            addCriterion("CONT_ORG_STS_CD not like", value, "contOrgStsCd");
            return (Criteria) this;
        }

        public Criteria andContOrgStsCdIn(List<String> values) {
            addCriterion("CONT_ORG_STS_CD in", values, "contOrgStsCd");
            return (Criteria) this;
        }

        public Criteria andContOrgStsCdNotIn(List<String> values) {
            addCriterion("CONT_ORG_STS_CD not in", values, "contOrgStsCd");
            return (Criteria) this;
        }

        public Criteria andContOrgStsCdBetween(String value1, String value2) {
            addCriterion("CONT_ORG_STS_CD between", value1, value2, "contOrgStsCd");
            return (Criteria) this;
        }

        public Criteria andContOrgStsCdNotBetween(String value1, String value2) {
            addCriterion("CONT_ORG_STS_CD not between", value1, value2, "contOrgStsCd");
            return (Criteria) this;
        }

        public Criteria andTotalIsuAblePtIsNull() {
            addCriterion("TOTAL_ISU_ABLE_PT is null");
            return (Criteria) this;
        }

        public Criteria andTotalIsuAblePtIsNotNull() {
            addCriterion("TOTAL_ISU_ABLE_PT is not null");
            return (Criteria) this;
        }

        public Criteria andTotalIsuAblePtEqualTo(Long value) {
            addCriterion("TOTAL_ISU_ABLE_PT =", value, "totalIsuAblePt");
            return (Criteria) this;
        }

        public Criteria andTotalIsuAblePtNotEqualTo(Long value) {
            addCriterion("TOTAL_ISU_ABLE_PT <>", value, "totalIsuAblePt");
            return (Criteria) this;
        }

        public Criteria andTotalIsuAblePtGreaterThan(Long value) {
            addCriterion("TOTAL_ISU_ABLE_PT >", value, "totalIsuAblePt");
            return (Criteria) this;
        }

        public Criteria andTotalIsuAblePtGreaterThanOrEqualTo(Long value) {
            addCriterion("TOTAL_ISU_ABLE_PT >=", value, "totalIsuAblePt");
            return (Criteria) this;
        }

        public Criteria andTotalIsuAblePtLessThan(Long value) {
            addCriterion("TOTAL_ISU_ABLE_PT <", value, "totalIsuAblePt");
            return (Criteria) this;
        }

        public Criteria andTotalIsuAblePtLessThanOrEqualTo(Long value) {
            addCriterion("TOTAL_ISU_ABLE_PT <=", value, "totalIsuAblePt");
            return (Criteria) this;
        }

        public Criteria andTotalIsuAblePtIn(List<Long> values) {
            addCriterion("TOTAL_ISU_ABLE_PT in", values, "totalIsuAblePt");
            return (Criteria) this;
        }

        public Criteria andTotalIsuAblePtNotIn(List<Long> values) {
            addCriterion("TOTAL_ISU_ABLE_PT not in", values, "totalIsuAblePt");
            return (Criteria) this;
        }

        public Criteria andTotalIsuAblePtBetween(Long value1, Long value2) {
            addCriterion("TOTAL_ISU_ABLE_PT between", value1, value2, "totalIsuAblePt");
            return (Criteria) this;
        }

        public Criteria andTotalIsuAblePtNotBetween(Long value1, Long value2) {
            addCriterion("TOTAL_ISU_ABLE_PT not between", value1, value2, "totalIsuAblePt");
            return (Criteria) this;
        }

        public Criteria andTotalIsuAbleCntIsNull() {
            addCriterion("TOTAL_ISU_ABLE_CNT is null");
            return (Criteria) this;
        }

        public Criteria andTotalIsuAbleCntIsNotNull() {
            addCriterion("TOTAL_ISU_ABLE_CNT is not null");
            return (Criteria) this;
        }

        public Criteria andTotalIsuAbleCntEqualTo(Long value) {
            addCriterion("TOTAL_ISU_ABLE_CNT =", value, "totalIsuAbleCnt");
            return (Criteria) this;
        }

        public Criteria andTotalIsuAbleCntNotEqualTo(Long value) {
            addCriterion("TOTAL_ISU_ABLE_CNT <>", value, "totalIsuAbleCnt");
            return (Criteria) this;
        }

        public Criteria andTotalIsuAbleCntGreaterThan(Long value) {
            addCriterion("TOTAL_ISU_ABLE_CNT >", value, "totalIsuAbleCnt");
            return (Criteria) this;
        }

        public Criteria andTotalIsuAbleCntGreaterThanOrEqualTo(Long value) {
            addCriterion("TOTAL_ISU_ABLE_CNT >=", value, "totalIsuAbleCnt");
            return (Criteria) this;
        }

        public Criteria andTotalIsuAbleCntLessThan(Long value) {
            addCriterion("TOTAL_ISU_ABLE_CNT <", value, "totalIsuAbleCnt");
            return (Criteria) this;
        }

        public Criteria andTotalIsuAbleCntLessThanOrEqualTo(Long value) {
            addCriterion("TOTAL_ISU_ABLE_CNT <=", value, "totalIsuAbleCnt");
            return (Criteria) this;
        }

        public Criteria andTotalIsuAbleCntIn(List<Long> values) {
            addCriterion("TOTAL_ISU_ABLE_CNT in", values, "totalIsuAbleCnt");
            return (Criteria) this;
        }

        public Criteria andTotalIsuAbleCntNotIn(List<Long> values) {
            addCriterion("TOTAL_ISU_ABLE_CNT not in", values, "totalIsuAbleCnt");
            return (Criteria) this;
        }

        public Criteria andTotalIsuAbleCntBetween(Long value1, Long value2) {
            addCriterion("TOTAL_ISU_ABLE_CNT between", value1, value2, "totalIsuAbleCnt");
            return (Criteria) this;
        }

        public Criteria andTotalIsuAbleCntNotBetween(Long value1, Long value2) {
            addCriterion("TOTAL_ISU_ABLE_CNT not between", value1, value2, "totalIsuAbleCnt");
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