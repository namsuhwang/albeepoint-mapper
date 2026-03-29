package com.albee.albeepoint.mapper.base.t_org_mst;

import java.time.LocalDateTime;
import java.util.ArrayList;
import java.util.List;

public class TOrgMstExample {
    protected String orderByClause;

    protected boolean distinct;

    protected List<Criteria> oredCriteria;

    public TOrgMstExample() {
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

        public Criteria andOrgNmIsNull() {
            addCriterion("ORG_NM is null");
            return (Criteria) this;
        }

        public Criteria andOrgNmIsNotNull() {
            addCriterion("ORG_NM is not null");
            return (Criteria) this;
        }

        public Criteria andOrgNmEqualTo(String value) {
            addCriterion("ORG_NM =", value, "orgNm");
            return (Criteria) this;
        }

        public Criteria andOrgNmNotEqualTo(String value) {
            addCriterion("ORG_NM <>", value, "orgNm");
            return (Criteria) this;
        }

        public Criteria andOrgNmGreaterThan(String value) {
            addCriterion("ORG_NM >", value, "orgNm");
            return (Criteria) this;
        }

        public Criteria andOrgNmGreaterThanOrEqualTo(String value) {
            addCriterion("ORG_NM >=", value, "orgNm");
            return (Criteria) this;
        }

        public Criteria andOrgNmLessThan(String value) {
            addCriterion("ORG_NM <", value, "orgNm");
            return (Criteria) this;
        }

        public Criteria andOrgNmLessThanOrEqualTo(String value) {
            addCriterion("ORG_NM <=", value, "orgNm");
            return (Criteria) this;
        }

        public Criteria andOrgNmLike(String value) {
            addCriterion("ORG_NM like", value, "orgNm");
            return (Criteria) this;
        }

        public Criteria andOrgNmNotLike(String value) {
            addCriterion("ORG_NM not like", value, "orgNm");
            return (Criteria) this;
        }

        public Criteria andOrgNmIn(List<String> values) {
            addCriterion("ORG_NM in", values, "orgNm");
            return (Criteria) this;
        }

        public Criteria andOrgNmNotIn(List<String> values) {
            addCriterion("ORG_NM not in", values, "orgNm");
            return (Criteria) this;
        }

        public Criteria andOrgNmBetween(String value1, String value2) {
            addCriterion("ORG_NM between", value1, value2, "orgNm");
            return (Criteria) this;
        }

        public Criteria andOrgNmNotBetween(String value1, String value2) {
            addCriterion("ORG_NM not between", value1, value2, "orgNm");
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

        public Criteria andOrgDispNmIsNull() {
            addCriterion("ORG_DISP_NM is null");
            return (Criteria) this;
        }

        public Criteria andOrgDispNmIsNotNull() {
            addCriterion("ORG_DISP_NM is not null");
            return (Criteria) this;
        }

        public Criteria andOrgDispNmEqualTo(String value) {
            addCriterion("ORG_DISP_NM =", value, "orgDispNm");
            return (Criteria) this;
        }

        public Criteria andOrgDispNmNotEqualTo(String value) {
            addCriterion("ORG_DISP_NM <>", value, "orgDispNm");
            return (Criteria) this;
        }

        public Criteria andOrgDispNmGreaterThan(String value) {
            addCriterion("ORG_DISP_NM >", value, "orgDispNm");
            return (Criteria) this;
        }

        public Criteria andOrgDispNmGreaterThanOrEqualTo(String value) {
            addCriterion("ORG_DISP_NM >=", value, "orgDispNm");
            return (Criteria) this;
        }

        public Criteria andOrgDispNmLessThan(String value) {
            addCriterion("ORG_DISP_NM <", value, "orgDispNm");
            return (Criteria) this;
        }

        public Criteria andOrgDispNmLessThanOrEqualTo(String value) {
            addCriterion("ORG_DISP_NM <=", value, "orgDispNm");
            return (Criteria) this;
        }

        public Criteria andOrgDispNmLike(String value) {
            addCriterion("ORG_DISP_NM like", value, "orgDispNm");
            return (Criteria) this;
        }

        public Criteria andOrgDispNmNotLike(String value) {
            addCriterion("ORG_DISP_NM not like", value, "orgDispNm");
            return (Criteria) this;
        }

        public Criteria andOrgDispNmIn(List<String> values) {
            addCriterion("ORG_DISP_NM in", values, "orgDispNm");
            return (Criteria) this;
        }

        public Criteria andOrgDispNmNotIn(List<String> values) {
            addCriterion("ORG_DISP_NM not in", values, "orgDispNm");
            return (Criteria) this;
        }

        public Criteria andOrgDispNmBetween(String value1, String value2) {
            addCriterion("ORG_DISP_NM between", value1, value2, "orgDispNm");
            return (Criteria) this;
        }

        public Criteria andOrgDispNmNotBetween(String value1, String value2) {
            addCriterion("ORG_DISP_NM not between", value1, value2, "orgDispNm");
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

        public Criteria andMemberAutoRegYnIsNull() {
            addCriterion("MEMBER_AUTO_REG_YN is null");
            return (Criteria) this;
        }

        public Criteria andMemberAutoRegYnIsNotNull() {
            addCriterion("MEMBER_AUTO_REG_YN is not null");
            return (Criteria) this;
        }

        public Criteria andMemberAutoRegYnEqualTo(String value) {
            addCriterion("MEMBER_AUTO_REG_YN =", value, "memberAutoRegYn");
            return (Criteria) this;
        }

        public Criteria andMemberAutoRegYnNotEqualTo(String value) {
            addCriterion("MEMBER_AUTO_REG_YN <>", value, "memberAutoRegYn");
            return (Criteria) this;
        }

        public Criteria andMemberAutoRegYnGreaterThan(String value) {
            addCriterion("MEMBER_AUTO_REG_YN >", value, "memberAutoRegYn");
            return (Criteria) this;
        }

        public Criteria andMemberAutoRegYnGreaterThanOrEqualTo(String value) {
            addCriterion("MEMBER_AUTO_REG_YN >=", value, "memberAutoRegYn");
            return (Criteria) this;
        }

        public Criteria andMemberAutoRegYnLessThan(String value) {
            addCriterion("MEMBER_AUTO_REG_YN <", value, "memberAutoRegYn");
            return (Criteria) this;
        }

        public Criteria andMemberAutoRegYnLessThanOrEqualTo(String value) {
            addCriterion("MEMBER_AUTO_REG_YN <=", value, "memberAutoRegYn");
            return (Criteria) this;
        }

        public Criteria andMemberAutoRegYnLike(String value) {
            addCriterion("MEMBER_AUTO_REG_YN like", value, "memberAutoRegYn");
            return (Criteria) this;
        }

        public Criteria andMemberAutoRegYnNotLike(String value) {
            addCriterion("MEMBER_AUTO_REG_YN not like", value, "memberAutoRegYn");
            return (Criteria) this;
        }

        public Criteria andMemberAutoRegYnIn(List<String> values) {
            addCriterion("MEMBER_AUTO_REG_YN in", values, "memberAutoRegYn");
            return (Criteria) this;
        }

        public Criteria andMemberAutoRegYnNotIn(List<String> values) {
            addCriterion("MEMBER_AUTO_REG_YN not in", values, "memberAutoRegYn");
            return (Criteria) this;
        }

        public Criteria andMemberAutoRegYnBetween(String value1, String value2) {
            addCriterion("MEMBER_AUTO_REG_YN between", value1, value2, "memberAutoRegYn");
            return (Criteria) this;
        }

        public Criteria andMemberAutoRegYnNotBetween(String value1, String value2) {
            addCriterion("MEMBER_AUTO_REG_YN not between", value1, value2, "memberAutoRegYn");
            return (Criteria) this;
        }

        public Criteria andOrgStsCdIsNull() {
            addCriterion("ORG_STS_CD is null");
            return (Criteria) this;
        }

        public Criteria andOrgStsCdIsNotNull() {
            addCriterion("ORG_STS_CD is not null");
            return (Criteria) this;
        }

        public Criteria andOrgStsCdEqualTo(String value) {
            addCriterion("ORG_STS_CD =", value, "orgStsCd");
            return (Criteria) this;
        }

        public Criteria andOrgStsCdNotEqualTo(String value) {
            addCriterion("ORG_STS_CD <>", value, "orgStsCd");
            return (Criteria) this;
        }

        public Criteria andOrgStsCdGreaterThan(String value) {
            addCriterion("ORG_STS_CD >", value, "orgStsCd");
            return (Criteria) this;
        }

        public Criteria andOrgStsCdGreaterThanOrEqualTo(String value) {
            addCriterion("ORG_STS_CD >=", value, "orgStsCd");
            return (Criteria) this;
        }

        public Criteria andOrgStsCdLessThan(String value) {
            addCriterion("ORG_STS_CD <", value, "orgStsCd");
            return (Criteria) this;
        }

        public Criteria andOrgStsCdLessThanOrEqualTo(String value) {
            addCriterion("ORG_STS_CD <=", value, "orgStsCd");
            return (Criteria) this;
        }

        public Criteria andOrgStsCdLike(String value) {
            addCriterion("ORG_STS_CD like", value, "orgStsCd");
            return (Criteria) this;
        }

        public Criteria andOrgStsCdNotLike(String value) {
            addCriterion("ORG_STS_CD not like", value, "orgStsCd");
            return (Criteria) this;
        }

        public Criteria andOrgStsCdIn(List<String> values) {
            addCriterion("ORG_STS_CD in", values, "orgStsCd");
            return (Criteria) this;
        }

        public Criteria andOrgStsCdNotIn(List<String> values) {
            addCriterion("ORG_STS_CD not in", values, "orgStsCd");
            return (Criteria) this;
        }

        public Criteria andOrgStsCdBetween(String value1, String value2) {
            addCriterion("ORG_STS_CD between", value1, value2, "orgStsCd");
            return (Criteria) this;
        }

        public Criteria andOrgStsCdNotBetween(String value1, String value2) {
            addCriterion("ORG_STS_CD not between", value1, value2, "orgStsCd");
            return (Criteria) this;
        }

        public Criteria andJoinDtIsNull() {
            addCriterion("JOIN_DT is null");
            return (Criteria) this;
        }

        public Criteria andJoinDtIsNotNull() {
            addCriterion("JOIN_DT is not null");
            return (Criteria) this;
        }

        public Criteria andJoinDtEqualTo(LocalDateTime value) {
            addCriterion("JOIN_DT =", value, "joinDt");
            return (Criteria) this;
        }

        public Criteria andJoinDtNotEqualTo(LocalDateTime value) {
            addCriterion("JOIN_DT <>", value, "joinDt");
            return (Criteria) this;
        }

        public Criteria andJoinDtGreaterThan(LocalDateTime value) {
            addCriterion("JOIN_DT >", value, "joinDt");
            return (Criteria) this;
        }

        public Criteria andJoinDtGreaterThanOrEqualTo(LocalDateTime value) {
            addCriterion("JOIN_DT >=", value, "joinDt");
            return (Criteria) this;
        }

        public Criteria andJoinDtLessThan(LocalDateTime value) {
            addCriterion("JOIN_DT <", value, "joinDt");
            return (Criteria) this;
        }

        public Criteria andJoinDtLessThanOrEqualTo(LocalDateTime value) {
            addCriterion("JOIN_DT <=", value, "joinDt");
            return (Criteria) this;
        }

        public Criteria andJoinDtIn(List<LocalDateTime> values) {
            addCriterion("JOIN_DT in", values, "joinDt");
            return (Criteria) this;
        }

        public Criteria andJoinDtNotIn(List<LocalDateTime> values) {
            addCriterion("JOIN_DT not in", values, "joinDt");
            return (Criteria) this;
        }

        public Criteria andJoinDtBetween(LocalDateTime value1, LocalDateTime value2) {
            addCriterion("JOIN_DT between", value1, value2, "joinDt");
            return (Criteria) this;
        }

        public Criteria andJoinDtNotBetween(LocalDateTime value1, LocalDateTime value2) {
            addCriterion("JOIN_DT not between", value1, value2, "joinDt");
            return (Criteria) this;
        }

        public Criteria andLeaveDtIsNull() {
            addCriterion("LEAVE_DT is null");
            return (Criteria) this;
        }

        public Criteria andLeaveDtIsNotNull() {
            addCriterion("LEAVE_DT is not null");
            return (Criteria) this;
        }

        public Criteria andLeaveDtEqualTo(LocalDateTime value) {
            addCriterion("LEAVE_DT =", value, "leaveDt");
            return (Criteria) this;
        }

        public Criteria andLeaveDtNotEqualTo(LocalDateTime value) {
            addCriterion("LEAVE_DT <>", value, "leaveDt");
            return (Criteria) this;
        }

        public Criteria andLeaveDtGreaterThan(LocalDateTime value) {
            addCriterion("LEAVE_DT >", value, "leaveDt");
            return (Criteria) this;
        }

        public Criteria andLeaveDtGreaterThanOrEqualTo(LocalDateTime value) {
            addCriterion("LEAVE_DT >=", value, "leaveDt");
            return (Criteria) this;
        }

        public Criteria andLeaveDtLessThan(LocalDateTime value) {
            addCriterion("LEAVE_DT <", value, "leaveDt");
            return (Criteria) this;
        }

        public Criteria andLeaveDtLessThanOrEqualTo(LocalDateTime value) {
            addCriterion("LEAVE_DT <=", value, "leaveDt");
            return (Criteria) this;
        }

        public Criteria andLeaveDtIn(List<LocalDateTime> values) {
            addCriterion("LEAVE_DT in", values, "leaveDt");
            return (Criteria) this;
        }

        public Criteria andLeaveDtNotIn(List<LocalDateTime> values) {
            addCriterion("LEAVE_DT not in", values, "leaveDt");
            return (Criteria) this;
        }

        public Criteria andLeaveDtBetween(LocalDateTime value1, LocalDateTime value2) {
            addCriterion("LEAVE_DT between", value1, value2, "leaveDt");
            return (Criteria) this;
        }

        public Criteria andLeaveDtNotBetween(LocalDateTime value1, LocalDateTime value2) {
            addCriterion("LEAVE_DT not between", value1, value2, "leaveDt");
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