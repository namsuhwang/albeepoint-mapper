package com.albee.albeepoint.mapper.base.t_member_pid;

import java.time.LocalDateTime;
import java.util.ArrayList;
import java.util.List;

public class TMemberPidExample {
    protected String orderByClause;

    protected boolean distinct;

    protected List<Criteria> oredCriteria;

    public TMemberPidExample() {
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

        public Criteria andPidNoIsNull() {
            addCriterion("PID_NO is null");
            return (Criteria) this;
        }

        public Criteria andPidNoIsNotNull() {
            addCriterion("PID_NO is not null");
            return (Criteria) this;
        }

        public Criteria andPidNoEqualTo(Long value) {
            addCriterion("PID_NO =", value, "pidNo");
            return (Criteria) this;
        }

        public Criteria andPidNoNotEqualTo(Long value) {
            addCriterion("PID_NO <>", value, "pidNo");
            return (Criteria) this;
        }

        public Criteria andPidNoGreaterThan(Long value) {
            addCriterion("PID_NO >", value, "pidNo");
            return (Criteria) this;
        }

        public Criteria andPidNoGreaterThanOrEqualTo(Long value) {
            addCriterion("PID_NO >=", value, "pidNo");
            return (Criteria) this;
        }

        public Criteria andPidNoLessThan(Long value) {
            addCriterion("PID_NO <", value, "pidNo");
            return (Criteria) this;
        }

        public Criteria andPidNoLessThanOrEqualTo(Long value) {
            addCriterion("PID_NO <=", value, "pidNo");
            return (Criteria) this;
        }

        public Criteria andPidNoIn(List<Long> values) {
            addCriterion("PID_NO in", values, "pidNo");
            return (Criteria) this;
        }

        public Criteria andPidNoNotIn(List<Long> values) {
            addCriterion("PID_NO not in", values, "pidNo");
            return (Criteria) this;
        }

        public Criteria andPidNoBetween(Long value1, Long value2) {
            addCriterion("PID_NO between", value1, value2, "pidNo");
            return (Criteria) this;
        }

        public Criteria andPidNoNotBetween(Long value1, Long value2) {
            addCriterion("PID_NO not between", value1, value2, "pidNo");
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

        public Criteria andPidEncIsNull() {
            addCriterion("PID_ENC is null");
            return (Criteria) this;
        }

        public Criteria andPidEncIsNotNull() {
            addCriterion("PID_ENC is not null");
            return (Criteria) this;
        }

        public Criteria andPidEncEqualTo(String value) {
            addCriterion("PID_ENC =", value, "pidEnc");
            return (Criteria) this;
        }

        public Criteria andPidEncNotEqualTo(String value) {
            addCriterion("PID_ENC <>", value, "pidEnc");
            return (Criteria) this;
        }

        public Criteria andPidEncGreaterThan(String value) {
            addCriterion("PID_ENC >", value, "pidEnc");
            return (Criteria) this;
        }

        public Criteria andPidEncGreaterThanOrEqualTo(String value) {
            addCriterion("PID_ENC >=", value, "pidEnc");
            return (Criteria) this;
        }

        public Criteria andPidEncLessThan(String value) {
            addCriterion("PID_ENC <", value, "pidEnc");
            return (Criteria) this;
        }

        public Criteria andPidEncLessThanOrEqualTo(String value) {
            addCriterion("PID_ENC <=", value, "pidEnc");
            return (Criteria) this;
        }

        public Criteria andPidEncLike(String value) {
            addCriterion("PID_ENC like", value, "pidEnc");
            return (Criteria) this;
        }

        public Criteria andPidEncNotLike(String value) {
            addCriterion("PID_ENC not like", value, "pidEnc");
            return (Criteria) this;
        }

        public Criteria andPidEncIn(List<String> values) {
            addCriterion("PID_ENC in", values, "pidEnc");
            return (Criteria) this;
        }

        public Criteria andPidEncNotIn(List<String> values) {
            addCriterion("PID_ENC not in", values, "pidEnc");
            return (Criteria) this;
        }

        public Criteria andPidEncBetween(String value1, String value2) {
            addCriterion("PID_ENC between", value1, value2, "pidEnc");
            return (Criteria) this;
        }

        public Criteria andPidEncNotBetween(String value1, String value2) {
            addCriterion("PID_ENC not between", value1, value2, "pidEnc");
            return (Criteria) this;
        }

        public Criteria andPidStsCdIsNull() {
            addCriterion("PID_STS_CD is null");
            return (Criteria) this;
        }

        public Criteria andPidStsCdIsNotNull() {
            addCriterion("PID_STS_CD is not null");
            return (Criteria) this;
        }

        public Criteria andPidStsCdEqualTo(String value) {
            addCriterion("PID_STS_CD =", value, "pidStsCd");
            return (Criteria) this;
        }

        public Criteria andPidStsCdNotEqualTo(String value) {
            addCriterion("PID_STS_CD <>", value, "pidStsCd");
            return (Criteria) this;
        }

        public Criteria andPidStsCdGreaterThan(String value) {
            addCriterion("PID_STS_CD >", value, "pidStsCd");
            return (Criteria) this;
        }

        public Criteria andPidStsCdGreaterThanOrEqualTo(String value) {
            addCriterion("PID_STS_CD >=", value, "pidStsCd");
            return (Criteria) this;
        }

        public Criteria andPidStsCdLessThan(String value) {
            addCriterion("PID_STS_CD <", value, "pidStsCd");
            return (Criteria) this;
        }

        public Criteria andPidStsCdLessThanOrEqualTo(String value) {
            addCriterion("PID_STS_CD <=", value, "pidStsCd");
            return (Criteria) this;
        }

        public Criteria andPidStsCdLike(String value) {
            addCriterion("PID_STS_CD like", value, "pidStsCd");
            return (Criteria) this;
        }

        public Criteria andPidStsCdNotLike(String value) {
            addCriterion("PID_STS_CD not like", value, "pidStsCd");
            return (Criteria) this;
        }

        public Criteria andPidStsCdIn(List<String> values) {
            addCriterion("PID_STS_CD in", values, "pidStsCd");
            return (Criteria) this;
        }

        public Criteria andPidStsCdNotIn(List<String> values) {
            addCriterion("PID_STS_CD not in", values, "pidStsCd");
            return (Criteria) this;
        }

        public Criteria andPidStsCdBetween(String value1, String value2) {
            addCriterion("PID_STS_CD between", value1, value2, "pidStsCd");
            return (Criteria) this;
        }

        public Criteria andPidStsCdNotBetween(String value1, String value2) {
            addCriterion("PID_STS_CD not between", value1, value2, "pidStsCd");
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

        public Criteria andStopDtIsNull() {
            addCriterion("STOP_DT is null");
            return (Criteria) this;
        }

        public Criteria andStopDtIsNotNull() {
            addCriterion("STOP_DT is not null");
            return (Criteria) this;
        }

        public Criteria andStopDtEqualTo(LocalDateTime value) {
            addCriterion("STOP_DT =", value, "stopDt");
            return (Criteria) this;
        }

        public Criteria andStopDtNotEqualTo(LocalDateTime value) {
            addCriterion("STOP_DT <>", value, "stopDt");
            return (Criteria) this;
        }

        public Criteria andStopDtGreaterThan(LocalDateTime value) {
            addCriterion("STOP_DT >", value, "stopDt");
            return (Criteria) this;
        }

        public Criteria andStopDtGreaterThanOrEqualTo(LocalDateTime value) {
            addCriterion("STOP_DT >=", value, "stopDt");
            return (Criteria) this;
        }

        public Criteria andStopDtLessThan(LocalDateTime value) {
            addCriterion("STOP_DT <", value, "stopDt");
            return (Criteria) this;
        }

        public Criteria andStopDtLessThanOrEqualTo(LocalDateTime value) {
            addCriterion("STOP_DT <=", value, "stopDt");
            return (Criteria) this;
        }

        public Criteria andStopDtIn(List<LocalDateTime> values) {
            addCriterion("STOP_DT in", values, "stopDt");
            return (Criteria) this;
        }

        public Criteria andStopDtNotIn(List<LocalDateTime> values) {
            addCriterion("STOP_DT not in", values, "stopDt");
            return (Criteria) this;
        }

        public Criteria andStopDtBetween(LocalDateTime value1, LocalDateTime value2) {
            addCriterion("STOP_DT between", value1, value2, "stopDt");
            return (Criteria) this;
        }

        public Criteria andStopDtNotBetween(LocalDateTime value1, LocalDateTime value2) {
            addCriterion("STOP_DT not between", value1, value2, "stopDt");
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