package com.albee.albeepoint.mapper.base.t_isu_target;

import java.time.LocalDateTime;
import java.util.ArrayList;
import java.util.List;

public class TIsuTargetExample {
    protected String orderByClause;

    protected boolean distinct;

    protected List<Criteria> oredCriteria;

    public TIsuTargetExample() {
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

        public Criteria andIsuTargetSnoIsNull() {
            addCriterion("ISU_TARGET_SNO is null");
            return (Criteria) this;
        }

        public Criteria andIsuTargetSnoIsNotNull() {
            addCriterion("ISU_TARGET_SNO is not null");
            return (Criteria) this;
        }

        public Criteria andIsuTargetSnoEqualTo(Long value) {
            addCriterion("ISU_TARGET_SNO =", value, "isuTargetSno");
            return (Criteria) this;
        }

        public Criteria andIsuTargetSnoNotEqualTo(Long value) {
            addCriterion("ISU_TARGET_SNO <>", value, "isuTargetSno");
            return (Criteria) this;
        }

        public Criteria andIsuTargetSnoGreaterThan(Long value) {
            addCriterion("ISU_TARGET_SNO >", value, "isuTargetSno");
            return (Criteria) this;
        }

        public Criteria andIsuTargetSnoGreaterThanOrEqualTo(Long value) {
            addCriterion("ISU_TARGET_SNO >=", value, "isuTargetSno");
            return (Criteria) this;
        }

        public Criteria andIsuTargetSnoLessThan(Long value) {
            addCriterion("ISU_TARGET_SNO <", value, "isuTargetSno");
            return (Criteria) this;
        }

        public Criteria andIsuTargetSnoLessThanOrEqualTo(Long value) {
            addCriterion("ISU_TARGET_SNO <=", value, "isuTargetSno");
            return (Criteria) this;
        }

        public Criteria andIsuTargetSnoIn(List<Long> values) {
            addCriterion("ISU_TARGET_SNO in", values, "isuTargetSno");
            return (Criteria) this;
        }

        public Criteria andIsuTargetSnoNotIn(List<Long> values) {
            addCriterion("ISU_TARGET_SNO not in", values, "isuTargetSno");
            return (Criteria) this;
        }

        public Criteria andIsuTargetSnoBetween(Long value1, Long value2) {
            addCriterion("ISU_TARGET_SNO between", value1, value2, "isuTargetSno");
            return (Criteria) this;
        }

        public Criteria andIsuTargetSnoNotBetween(Long value1, Long value2) {
            addCriterion("ISU_TARGET_SNO not between", value1, value2, "isuTargetSno");
            return (Criteria) this;
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

        public Criteria andMemberIdEncIsNull() {
            addCriterion("MEMBER_ID_ENC is null");
            return (Criteria) this;
        }

        public Criteria andMemberIdEncIsNotNull() {
            addCriterion("MEMBER_ID_ENC is not null");
            return (Criteria) this;
        }

        public Criteria andMemberIdEncEqualTo(String value) {
            addCriterion("MEMBER_ID_ENC =", value, "memberIdEnc");
            return (Criteria) this;
        }

        public Criteria andMemberIdEncNotEqualTo(String value) {
            addCriterion("MEMBER_ID_ENC <>", value, "memberIdEnc");
            return (Criteria) this;
        }

        public Criteria andMemberIdEncGreaterThan(String value) {
            addCriterion("MEMBER_ID_ENC >", value, "memberIdEnc");
            return (Criteria) this;
        }

        public Criteria andMemberIdEncGreaterThanOrEqualTo(String value) {
            addCriterion("MEMBER_ID_ENC >=", value, "memberIdEnc");
            return (Criteria) this;
        }

        public Criteria andMemberIdEncLessThan(String value) {
            addCriterion("MEMBER_ID_ENC <", value, "memberIdEnc");
            return (Criteria) this;
        }

        public Criteria andMemberIdEncLessThanOrEqualTo(String value) {
            addCriterion("MEMBER_ID_ENC <=", value, "memberIdEnc");
            return (Criteria) this;
        }

        public Criteria andMemberIdEncLike(String value) {
            addCriterion("MEMBER_ID_ENC like", value, "memberIdEnc");
            return (Criteria) this;
        }

        public Criteria andMemberIdEncNotLike(String value) {
            addCriterion("MEMBER_ID_ENC not like", value, "memberIdEnc");
            return (Criteria) this;
        }

        public Criteria andMemberIdEncIn(List<String> values) {
            addCriterion("MEMBER_ID_ENC in", values, "memberIdEnc");
            return (Criteria) this;
        }

        public Criteria andMemberIdEncNotIn(List<String> values) {
            addCriterion("MEMBER_ID_ENC not in", values, "memberIdEnc");
            return (Criteria) this;
        }

        public Criteria andMemberIdEncBetween(String value1, String value2) {
            addCriterion("MEMBER_ID_ENC between", value1, value2, "memberIdEnc");
            return (Criteria) this;
        }

        public Criteria andMemberIdEncNotBetween(String value1, String value2) {
            addCriterion("MEMBER_ID_ENC not between", value1, value2, "memberIdEnc");
            return (Criteria) this;
        }

        public Criteria andMemberNoIsNull() {
            addCriterion("MEMBER_NO is null");
            return (Criteria) this;
        }

        public Criteria andMemberNoIsNotNull() {
            addCriterion("MEMBER_NO is not null");
            return (Criteria) this;
        }

        public Criteria andMemberNoEqualTo(Long value) {
            addCriterion("MEMBER_NO =", value, "memberNo");
            return (Criteria) this;
        }

        public Criteria andMemberNoNotEqualTo(Long value) {
            addCriterion("MEMBER_NO <>", value, "memberNo");
            return (Criteria) this;
        }

        public Criteria andMemberNoGreaterThan(Long value) {
            addCriterion("MEMBER_NO >", value, "memberNo");
            return (Criteria) this;
        }

        public Criteria andMemberNoGreaterThanOrEqualTo(Long value) {
            addCriterion("MEMBER_NO >=", value, "memberNo");
            return (Criteria) this;
        }

        public Criteria andMemberNoLessThan(Long value) {
            addCriterion("MEMBER_NO <", value, "memberNo");
            return (Criteria) this;
        }

        public Criteria andMemberNoLessThanOrEqualTo(Long value) {
            addCriterion("MEMBER_NO <=", value, "memberNo");
            return (Criteria) this;
        }

        public Criteria andMemberNoIn(List<Long> values) {
            addCriterion("MEMBER_NO in", values, "memberNo");
            return (Criteria) this;
        }

        public Criteria andMemberNoNotIn(List<Long> values) {
            addCriterion("MEMBER_NO not in", values, "memberNo");
            return (Criteria) this;
        }

        public Criteria andMemberNoBetween(Long value1, Long value2) {
            addCriterion("MEMBER_NO between", value1, value2, "memberNo");
            return (Criteria) this;
        }

        public Criteria andMemberNoNotBetween(Long value1, Long value2) {
            addCriterion("MEMBER_NO not between", value1, value2, "memberNo");
            return (Criteria) this;
        }

        public Criteria andIsuTargetTypeCdIsNull() {
            addCriterion("ISU_TARGET_TYPE_CD is null");
            return (Criteria) this;
        }

        public Criteria andIsuTargetTypeCdIsNotNull() {
            addCriterion("ISU_TARGET_TYPE_CD is not null");
            return (Criteria) this;
        }

        public Criteria andIsuTargetTypeCdEqualTo(String value) {
            addCriterion("ISU_TARGET_TYPE_CD =", value, "isuTargetTypeCd");
            return (Criteria) this;
        }

        public Criteria andIsuTargetTypeCdNotEqualTo(String value) {
            addCriterion("ISU_TARGET_TYPE_CD <>", value, "isuTargetTypeCd");
            return (Criteria) this;
        }

        public Criteria andIsuTargetTypeCdGreaterThan(String value) {
            addCriterion("ISU_TARGET_TYPE_CD >", value, "isuTargetTypeCd");
            return (Criteria) this;
        }

        public Criteria andIsuTargetTypeCdGreaterThanOrEqualTo(String value) {
            addCriterion("ISU_TARGET_TYPE_CD >=", value, "isuTargetTypeCd");
            return (Criteria) this;
        }

        public Criteria andIsuTargetTypeCdLessThan(String value) {
            addCriterion("ISU_TARGET_TYPE_CD <", value, "isuTargetTypeCd");
            return (Criteria) this;
        }

        public Criteria andIsuTargetTypeCdLessThanOrEqualTo(String value) {
            addCriterion("ISU_TARGET_TYPE_CD <=", value, "isuTargetTypeCd");
            return (Criteria) this;
        }

        public Criteria andIsuTargetTypeCdLike(String value) {
            addCriterion("ISU_TARGET_TYPE_CD like", value, "isuTargetTypeCd");
            return (Criteria) this;
        }

        public Criteria andIsuTargetTypeCdNotLike(String value) {
            addCriterion("ISU_TARGET_TYPE_CD not like", value, "isuTargetTypeCd");
            return (Criteria) this;
        }

        public Criteria andIsuTargetTypeCdIn(List<String> values) {
            addCriterion("ISU_TARGET_TYPE_CD in", values, "isuTargetTypeCd");
            return (Criteria) this;
        }

        public Criteria andIsuTargetTypeCdNotIn(List<String> values) {
            addCriterion("ISU_TARGET_TYPE_CD not in", values, "isuTargetTypeCd");
            return (Criteria) this;
        }

        public Criteria andIsuTargetTypeCdBetween(String value1, String value2) {
            addCriterion("ISU_TARGET_TYPE_CD between", value1, value2, "isuTargetTypeCd");
            return (Criteria) this;
        }

        public Criteria andIsuTargetTypeCdNotBetween(String value1, String value2) {
            addCriterion("ISU_TARGET_TYPE_CD not between", value1, value2, "isuTargetTypeCd");
            return (Criteria) this;
        }

        public Criteria andIsuReqDyIsNull() {
            addCriterion("ISU_REQ_DY is null");
            return (Criteria) this;
        }

        public Criteria andIsuReqDyIsNotNull() {
            addCriterion("ISU_REQ_DY is not null");
            return (Criteria) this;
        }

        public Criteria andIsuReqDyEqualTo(String value) {
            addCriterion("ISU_REQ_DY =", value, "isuReqDy");
            return (Criteria) this;
        }

        public Criteria andIsuReqDyNotEqualTo(String value) {
            addCriterion("ISU_REQ_DY <>", value, "isuReqDy");
            return (Criteria) this;
        }

        public Criteria andIsuReqDyGreaterThan(String value) {
            addCriterion("ISU_REQ_DY >", value, "isuReqDy");
            return (Criteria) this;
        }

        public Criteria andIsuReqDyGreaterThanOrEqualTo(String value) {
            addCriterion("ISU_REQ_DY >=", value, "isuReqDy");
            return (Criteria) this;
        }

        public Criteria andIsuReqDyLessThan(String value) {
            addCriterion("ISU_REQ_DY <", value, "isuReqDy");
            return (Criteria) this;
        }

        public Criteria andIsuReqDyLessThanOrEqualTo(String value) {
            addCriterion("ISU_REQ_DY <=", value, "isuReqDy");
            return (Criteria) this;
        }

        public Criteria andIsuReqDyLike(String value) {
            addCriterion("ISU_REQ_DY like", value, "isuReqDy");
            return (Criteria) this;
        }

        public Criteria andIsuReqDyNotLike(String value) {
            addCriterion("ISU_REQ_DY not like", value, "isuReqDy");
            return (Criteria) this;
        }

        public Criteria andIsuReqDyIn(List<String> values) {
            addCriterion("ISU_REQ_DY in", values, "isuReqDy");
            return (Criteria) this;
        }

        public Criteria andIsuReqDyNotIn(List<String> values) {
            addCriterion("ISU_REQ_DY not in", values, "isuReqDy");
            return (Criteria) this;
        }

        public Criteria andIsuReqDyBetween(String value1, String value2) {
            addCriterion("ISU_REQ_DY between", value1, value2, "isuReqDy");
            return (Criteria) this;
        }

        public Criteria andIsuReqDyNotBetween(String value1, String value2) {
            addCriterion("ISU_REQ_DY not between", value1, value2, "isuReqDy");
            return (Criteria) this;
        }

        public Criteria andIsuReqPtIsNull() {
            addCriterion("ISU_REQ_PT is null");
            return (Criteria) this;
        }

        public Criteria andIsuReqPtIsNotNull() {
            addCriterion("ISU_REQ_PT is not null");
            return (Criteria) this;
        }

        public Criteria andIsuReqPtEqualTo(Long value) {
            addCriterion("ISU_REQ_PT =", value, "isuReqPt");
            return (Criteria) this;
        }

        public Criteria andIsuReqPtNotEqualTo(Long value) {
            addCriterion("ISU_REQ_PT <>", value, "isuReqPt");
            return (Criteria) this;
        }

        public Criteria andIsuReqPtGreaterThan(Long value) {
            addCriterion("ISU_REQ_PT >", value, "isuReqPt");
            return (Criteria) this;
        }

        public Criteria andIsuReqPtGreaterThanOrEqualTo(Long value) {
            addCriterion("ISU_REQ_PT >=", value, "isuReqPt");
            return (Criteria) this;
        }

        public Criteria andIsuReqPtLessThan(Long value) {
            addCriterion("ISU_REQ_PT <", value, "isuReqPt");
            return (Criteria) this;
        }

        public Criteria andIsuReqPtLessThanOrEqualTo(Long value) {
            addCriterion("ISU_REQ_PT <=", value, "isuReqPt");
            return (Criteria) this;
        }

        public Criteria andIsuReqPtIn(List<Long> values) {
            addCriterion("ISU_REQ_PT in", values, "isuReqPt");
            return (Criteria) this;
        }

        public Criteria andIsuReqPtNotIn(List<Long> values) {
            addCriterion("ISU_REQ_PT not in", values, "isuReqPt");
            return (Criteria) this;
        }

        public Criteria andIsuReqPtBetween(Long value1, Long value2) {
            addCriterion("ISU_REQ_PT between", value1, value2, "isuReqPt");
            return (Criteria) this;
        }

        public Criteria andIsuReqPtNotBetween(Long value1, Long value2) {
            addCriterion("ISU_REQ_PT not between", value1, value2, "isuReqPt");
            return (Criteria) this;
        }

        public Criteria andUseYnIsNull() {
            addCriterion("USE_YN is null");
            return (Criteria) this;
        }

        public Criteria andUseYnIsNotNull() {
            addCriterion("USE_YN is not null");
            return (Criteria) this;
        }

        public Criteria andUseYnEqualTo(String value) {
            addCriterion("USE_YN =", value, "useYn");
            return (Criteria) this;
        }

        public Criteria andUseYnNotEqualTo(String value) {
            addCriterion("USE_YN <>", value, "useYn");
            return (Criteria) this;
        }

        public Criteria andUseYnGreaterThan(String value) {
            addCriterion("USE_YN >", value, "useYn");
            return (Criteria) this;
        }

        public Criteria andUseYnGreaterThanOrEqualTo(String value) {
            addCriterion("USE_YN >=", value, "useYn");
            return (Criteria) this;
        }

        public Criteria andUseYnLessThan(String value) {
            addCriterion("USE_YN <", value, "useYn");
            return (Criteria) this;
        }

        public Criteria andUseYnLessThanOrEqualTo(String value) {
            addCriterion("USE_YN <=", value, "useYn");
            return (Criteria) this;
        }

        public Criteria andUseYnLike(String value) {
            addCriterion("USE_YN like", value, "useYn");
            return (Criteria) this;
        }

        public Criteria andUseYnNotLike(String value) {
            addCriterion("USE_YN not like", value, "useYn");
            return (Criteria) this;
        }

        public Criteria andUseYnIn(List<String> values) {
            addCriterion("USE_YN in", values, "useYn");
            return (Criteria) this;
        }

        public Criteria andUseYnNotIn(List<String> values) {
            addCriterion("USE_YN not in", values, "useYn");
            return (Criteria) this;
        }

        public Criteria andUseYnBetween(String value1, String value2) {
            addCriterion("USE_YN between", value1, value2, "useYn");
            return (Criteria) this;
        }

        public Criteria andUseYnNotBetween(String value1, String value2) {
            addCriterion("USE_YN not between", value1, value2, "useYn");
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

        public Criteria andIsuPtIsNull() {
            addCriterion("ISU_PT is null");
            return (Criteria) this;
        }

        public Criteria andIsuPtIsNotNull() {
            addCriterion("ISU_PT is not null");
            return (Criteria) this;
        }

        public Criteria andIsuPtEqualTo(Long value) {
            addCriterion("ISU_PT =", value, "isuPt");
            return (Criteria) this;
        }

        public Criteria andIsuPtNotEqualTo(Long value) {
            addCriterion("ISU_PT <>", value, "isuPt");
            return (Criteria) this;
        }

        public Criteria andIsuPtGreaterThan(Long value) {
            addCriterion("ISU_PT >", value, "isuPt");
            return (Criteria) this;
        }

        public Criteria andIsuPtGreaterThanOrEqualTo(Long value) {
            addCriterion("ISU_PT >=", value, "isuPt");
            return (Criteria) this;
        }

        public Criteria andIsuPtLessThan(Long value) {
            addCriterion("ISU_PT <", value, "isuPt");
            return (Criteria) this;
        }

        public Criteria andIsuPtLessThanOrEqualTo(Long value) {
            addCriterion("ISU_PT <=", value, "isuPt");
            return (Criteria) this;
        }

        public Criteria andIsuPtIn(List<Long> values) {
            addCriterion("ISU_PT in", values, "isuPt");
            return (Criteria) this;
        }

        public Criteria andIsuPtNotIn(List<Long> values) {
            addCriterion("ISU_PT not in", values, "isuPt");
            return (Criteria) this;
        }

        public Criteria andIsuPtBetween(Long value1, Long value2) {
            addCriterion("ISU_PT between", value1, value2, "isuPt");
            return (Criteria) this;
        }

        public Criteria andIsuPtNotBetween(Long value1, Long value2) {
            addCriterion("ISU_PT not between", value1, value2, "isuPt");
            return (Criteria) this;
        }

        public Criteria andIsuDtIsNull() {
            addCriterion("ISU_DT is null");
            return (Criteria) this;
        }

        public Criteria andIsuDtIsNotNull() {
            addCriterion("ISU_DT is not null");
            return (Criteria) this;
        }

        public Criteria andIsuDtEqualTo(LocalDateTime value) {
            addCriterion("ISU_DT =", value, "isuDt");
            return (Criteria) this;
        }

        public Criteria andIsuDtNotEqualTo(LocalDateTime value) {
            addCriterion("ISU_DT <>", value, "isuDt");
            return (Criteria) this;
        }

        public Criteria andIsuDtGreaterThan(LocalDateTime value) {
            addCriterion("ISU_DT >", value, "isuDt");
            return (Criteria) this;
        }

        public Criteria andIsuDtGreaterThanOrEqualTo(LocalDateTime value) {
            addCriterion("ISU_DT >=", value, "isuDt");
            return (Criteria) this;
        }

        public Criteria andIsuDtLessThan(LocalDateTime value) {
            addCriterion("ISU_DT <", value, "isuDt");
            return (Criteria) this;
        }

        public Criteria andIsuDtLessThanOrEqualTo(LocalDateTime value) {
            addCriterion("ISU_DT <=", value, "isuDt");
            return (Criteria) this;
        }

        public Criteria andIsuDtIn(List<LocalDateTime> values) {
            addCriterion("ISU_DT in", values, "isuDt");
            return (Criteria) this;
        }

        public Criteria andIsuDtNotIn(List<LocalDateTime> values) {
            addCriterion("ISU_DT not in", values, "isuDt");
            return (Criteria) this;
        }

        public Criteria andIsuDtBetween(LocalDateTime value1, LocalDateTime value2) {
            addCriterion("ISU_DT between", value1, value2, "isuDt");
            return (Criteria) this;
        }

        public Criteria andIsuDtNotBetween(LocalDateTime value1, LocalDateTime value2) {
            addCriterion("ISU_DT not between", value1, value2, "isuDt");
            return (Criteria) this;
        }

        public Criteria andResultCdIsNull() {
            addCriterion("RESULT_CD is null");
            return (Criteria) this;
        }

        public Criteria andResultCdIsNotNull() {
            addCriterion("RESULT_CD is not null");
            return (Criteria) this;
        }

        public Criteria andResultCdEqualTo(String value) {
            addCriterion("RESULT_CD =", value, "resultCd");
            return (Criteria) this;
        }

        public Criteria andResultCdNotEqualTo(String value) {
            addCriterion("RESULT_CD <>", value, "resultCd");
            return (Criteria) this;
        }

        public Criteria andResultCdGreaterThan(String value) {
            addCriterion("RESULT_CD >", value, "resultCd");
            return (Criteria) this;
        }

        public Criteria andResultCdGreaterThanOrEqualTo(String value) {
            addCriterion("RESULT_CD >=", value, "resultCd");
            return (Criteria) this;
        }

        public Criteria andResultCdLessThan(String value) {
            addCriterion("RESULT_CD <", value, "resultCd");
            return (Criteria) this;
        }

        public Criteria andResultCdLessThanOrEqualTo(String value) {
            addCriterion("RESULT_CD <=", value, "resultCd");
            return (Criteria) this;
        }

        public Criteria andResultCdLike(String value) {
            addCriterion("RESULT_CD like", value, "resultCd");
            return (Criteria) this;
        }

        public Criteria andResultCdNotLike(String value) {
            addCriterion("RESULT_CD not like", value, "resultCd");
            return (Criteria) this;
        }

        public Criteria andResultCdIn(List<String> values) {
            addCriterion("RESULT_CD in", values, "resultCd");
            return (Criteria) this;
        }

        public Criteria andResultCdNotIn(List<String> values) {
            addCriterion("RESULT_CD not in", values, "resultCd");
            return (Criteria) this;
        }

        public Criteria andResultCdBetween(String value1, String value2) {
            addCriterion("RESULT_CD between", value1, value2, "resultCd");
            return (Criteria) this;
        }

        public Criteria andResultCdNotBetween(String value1, String value2) {
            addCriterion("RESULT_CD not between", value1, value2, "resultCd");
            return (Criteria) this;
        }

        public Criteria andResultMsgIsNull() {
            addCriterion("RESULT_MSG is null");
            return (Criteria) this;
        }

        public Criteria andResultMsgIsNotNull() {
            addCriterion("RESULT_MSG is not null");
            return (Criteria) this;
        }

        public Criteria andResultMsgEqualTo(String value) {
            addCriterion("RESULT_MSG =", value, "resultMsg");
            return (Criteria) this;
        }

        public Criteria andResultMsgNotEqualTo(String value) {
            addCriterion("RESULT_MSG <>", value, "resultMsg");
            return (Criteria) this;
        }

        public Criteria andResultMsgGreaterThan(String value) {
            addCriterion("RESULT_MSG >", value, "resultMsg");
            return (Criteria) this;
        }

        public Criteria andResultMsgGreaterThanOrEqualTo(String value) {
            addCriterion("RESULT_MSG >=", value, "resultMsg");
            return (Criteria) this;
        }

        public Criteria andResultMsgLessThan(String value) {
            addCriterion("RESULT_MSG <", value, "resultMsg");
            return (Criteria) this;
        }

        public Criteria andResultMsgLessThanOrEqualTo(String value) {
            addCriterion("RESULT_MSG <=", value, "resultMsg");
            return (Criteria) this;
        }

        public Criteria andResultMsgLike(String value) {
            addCriterion("RESULT_MSG like", value, "resultMsg");
            return (Criteria) this;
        }

        public Criteria andResultMsgNotLike(String value) {
            addCriterion("RESULT_MSG not like", value, "resultMsg");
            return (Criteria) this;
        }

        public Criteria andResultMsgIn(List<String> values) {
            addCriterion("RESULT_MSG in", values, "resultMsg");
            return (Criteria) this;
        }

        public Criteria andResultMsgNotIn(List<String> values) {
            addCriterion("RESULT_MSG not in", values, "resultMsg");
            return (Criteria) this;
        }

        public Criteria andResultMsgBetween(String value1, String value2) {
            addCriterion("RESULT_MSG between", value1, value2, "resultMsg");
            return (Criteria) this;
        }

        public Criteria andResultMsgNotBetween(String value1, String value2) {
            addCriterion("RESULT_MSG not between", value1, value2, "resultMsg");
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