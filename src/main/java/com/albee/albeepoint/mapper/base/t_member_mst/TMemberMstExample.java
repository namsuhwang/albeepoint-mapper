package com.albee.albeepoint.mapper.base.t_member_mst;

import java.time.LocalDateTime;
import java.util.ArrayList;
import java.util.List;

public class TMemberMstExample {
    protected String orderByClause;

    protected boolean distinct;

    protected List<Criteria> oredCriteria;

    public TMemberMstExample() {
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

        public Criteria andMemberNmIsNull() {
            addCriterion("MEMBER_NM is null");
            return (Criteria) this;
        }

        public Criteria andMemberNmIsNotNull() {
            addCriterion("MEMBER_NM is not null");
            return (Criteria) this;
        }

        public Criteria andMemberNmEqualTo(String value) {
            addCriterion("MEMBER_NM =", value, "memberNm");
            return (Criteria) this;
        }

        public Criteria andMemberNmNotEqualTo(String value) {
            addCriterion("MEMBER_NM <>", value, "memberNm");
            return (Criteria) this;
        }

        public Criteria andMemberNmGreaterThan(String value) {
            addCriterion("MEMBER_NM >", value, "memberNm");
            return (Criteria) this;
        }

        public Criteria andMemberNmGreaterThanOrEqualTo(String value) {
            addCriterion("MEMBER_NM >=", value, "memberNm");
            return (Criteria) this;
        }

        public Criteria andMemberNmLessThan(String value) {
            addCriterion("MEMBER_NM <", value, "memberNm");
            return (Criteria) this;
        }

        public Criteria andMemberNmLessThanOrEqualTo(String value) {
            addCriterion("MEMBER_NM <=", value, "memberNm");
            return (Criteria) this;
        }

        public Criteria andMemberNmLike(String value) {
            addCriterion("MEMBER_NM like", value, "memberNm");
            return (Criteria) this;
        }

        public Criteria andMemberNmNotLike(String value) {
            addCriterion("MEMBER_NM not like", value, "memberNm");
            return (Criteria) this;
        }

        public Criteria andMemberNmIn(List<String> values) {
            addCriterion("MEMBER_NM in", values, "memberNm");
            return (Criteria) this;
        }

        public Criteria andMemberNmNotIn(List<String> values) {
            addCriterion("MEMBER_NM not in", values, "memberNm");
            return (Criteria) this;
        }

        public Criteria andMemberNmBetween(String value1, String value2) {
            addCriterion("MEMBER_NM between", value1, value2, "memberNm");
            return (Criteria) this;
        }

        public Criteria andMemberNmNotBetween(String value1, String value2) {
            addCriterion("MEMBER_NM not between", value1, value2, "memberNm");
            return (Criteria) this;
        }

        public Criteria andMemberStsCdIsNull() {
            addCriterion("MEMBER_STS_CD is null");
            return (Criteria) this;
        }

        public Criteria andMemberStsCdIsNotNull() {
            addCriterion("MEMBER_STS_CD is not null");
            return (Criteria) this;
        }

        public Criteria andMemberStsCdEqualTo(String value) {
            addCriterion("MEMBER_STS_CD =", value, "memberStsCd");
            return (Criteria) this;
        }

        public Criteria andMemberStsCdNotEqualTo(String value) {
            addCriterion("MEMBER_STS_CD <>", value, "memberStsCd");
            return (Criteria) this;
        }

        public Criteria andMemberStsCdGreaterThan(String value) {
            addCriterion("MEMBER_STS_CD >", value, "memberStsCd");
            return (Criteria) this;
        }

        public Criteria andMemberStsCdGreaterThanOrEqualTo(String value) {
            addCriterion("MEMBER_STS_CD >=", value, "memberStsCd");
            return (Criteria) this;
        }

        public Criteria andMemberStsCdLessThan(String value) {
            addCriterion("MEMBER_STS_CD <", value, "memberStsCd");
            return (Criteria) this;
        }

        public Criteria andMemberStsCdLessThanOrEqualTo(String value) {
            addCriterion("MEMBER_STS_CD <=", value, "memberStsCd");
            return (Criteria) this;
        }

        public Criteria andMemberStsCdLike(String value) {
            addCriterion("MEMBER_STS_CD like", value, "memberStsCd");
            return (Criteria) this;
        }

        public Criteria andMemberStsCdNotLike(String value) {
            addCriterion("MEMBER_STS_CD not like", value, "memberStsCd");
            return (Criteria) this;
        }

        public Criteria andMemberStsCdIn(List<String> values) {
            addCriterion("MEMBER_STS_CD in", values, "memberStsCd");
            return (Criteria) this;
        }

        public Criteria andMemberStsCdNotIn(List<String> values) {
            addCriterion("MEMBER_STS_CD not in", values, "memberStsCd");
            return (Criteria) this;
        }

        public Criteria andMemberStsCdBetween(String value1, String value2) {
            addCriterion("MEMBER_STS_CD between", value1, value2, "memberStsCd");
            return (Criteria) this;
        }

        public Criteria andMemberStsCdNotBetween(String value1, String value2) {
            addCriterion("MEMBER_STS_CD not between", value1, value2, "memberStsCd");
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

        public Criteria andLastContactDtIsNull() {
            addCriterion("LAST_CONTACT_DT is null");
            return (Criteria) this;
        }

        public Criteria andLastContactDtIsNotNull() {
            addCriterion("LAST_CONTACT_DT is not null");
            return (Criteria) this;
        }

        public Criteria andLastContactDtEqualTo(LocalDateTime value) {
            addCriterion("LAST_CONTACT_DT =", value, "lastContactDt");
            return (Criteria) this;
        }

        public Criteria andLastContactDtNotEqualTo(LocalDateTime value) {
            addCriterion("LAST_CONTACT_DT <>", value, "lastContactDt");
            return (Criteria) this;
        }

        public Criteria andLastContactDtGreaterThan(LocalDateTime value) {
            addCriterion("LAST_CONTACT_DT >", value, "lastContactDt");
            return (Criteria) this;
        }

        public Criteria andLastContactDtGreaterThanOrEqualTo(LocalDateTime value) {
            addCriterion("LAST_CONTACT_DT >=", value, "lastContactDt");
            return (Criteria) this;
        }

        public Criteria andLastContactDtLessThan(LocalDateTime value) {
            addCriterion("LAST_CONTACT_DT <", value, "lastContactDt");
            return (Criteria) this;
        }

        public Criteria andLastContactDtLessThanOrEqualTo(LocalDateTime value) {
            addCriterion("LAST_CONTACT_DT <=", value, "lastContactDt");
            return (Criteria) this;
        }

        public Criteria andLastContactDtIn(List<LocalDateTime> values) {
            addCriterion("LAST_CONTACT_DT in", values, "lastContactDt");
            return (Criteria) this;
        }

        public Criteria andLastContactDtNotIn(List<LocalDateTime> values) {
            addCriterion("LAST_CONTACT_DT not in", values, "lastContactDt");
            return (Criteria) this;
        }

        public Criteria andLastContactDtBetween(LocalDateTime value1, LocalDateTime value2) {
            addCriterion("LAST_CONTACT_DT between", value1, value2, "lastContactDt");
            return (Criteria) this;
        }

        public Criteria andLastContactDtNotBetween(LocalDateTime value1, LocalDateTime value2) {
            addCriterion("LAST_CONTACT_DT not between", value1, value2, "lastContactDt");
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