package com.albee.albeepoint.mapper.base.t_cont_rel;

import java.time.LocalDateTime;
import java.util.ArrayList;
import java.util.List;

public class TContRelExample {
    protected String orderByClause;

    protected boolean distinct;

    protected List<Criteria> oredCriteria;

    public TContRelExample() {
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

        public Criteria andContRelNoIsNull() {
            addCriterion("CONT_REL_NO is null");
            return (Criteria) this;
        }

        public Criteria andContRelNoIsNotNull() {
            addCriterion("CONT_REL_NO is not null");
            return (Criteria) this;
        }

        public Criteria andContRelNoEqualTo(Long value) {
            addCriterion("CONT_REL_NO =", value, "contRelNo");
            return (Criteria) this;
        }

        public Criteria andContRelNoNotEqualTo(Long value) {
            addCriterion("CONT_REL_NO <>", value, "contRelNo");
            return (Criteria) this;
        }

        public Criteria andContRelNoGreaterThan(Long value) {
            addCriterion("CONT_REL_NO >", value, "contRelNo");
            return (Criteria) this;
        }

        public Criteria andContRelNoGreaterThanOrEqualTo(Long value) {
            addCriterion("CONT_REL_NO >=", value, "contRelNo");
            return (Criteria) this;
        }

        public Criteria andContRelNoLessThan(Long value) {
            addCriterion("CONT_REL_NO <", value, "contRelNo");
            return (Criteria) this;
        }

        public Criteria andContRelNoLessThanOrEqualTo(Long value) {
            addCriterion("CONT_REL_NO <=", value, "contRelNo");
            return (Criteria) this;
        }

        public Criteria andContRelNoIn(List<Long> values) {
            addCriterion("CONT_REL_NO in", values, "contRelNo");
            return (Criteria) this;
        }

        public Criteria andContRelNoNotIn(List<Long> values) {
            addCriterion("CONT_REL_NO not in", values, "contRelNo");
            return (Criteria) this;
        }

        public Criteria andContRelNoBetween(Long value1, Long value2) {
            addCriterion("CONT_REL_NO between", value1, value2, "contRelNo");
            return (Criteria) this;
        }

        public Criteria andContRelNoNotBetween(Long value1, Long value2) {
            addCriterion("CONT_REL_NO not between", value1, value2, "contRelNo");
            return (Criteria) this;
        }

        public Criteria andContRelSeqIsNull() {
            addCriterion("CONT_REL_SEQ is null");
            return (Criteria) this;
        }

        public Criteria andContRelSeqIsNotNull() {
            addCriterion("CONT_REL_SEQ is not null");
            return (Criteria) this;
        }

        public Criteria andContRelSeqEqualTo(Long value) {
            addCriterion("CONT_REL_SEQ =", value, "contRelSeq");
            return (Criteria) this;
        }

        public Criteria andContRelSeqNotEqualTo(Long value) {
            addCriterion("CONT_REL_SEQ <>", value, "contRelSeq");
            return (Criteria) this;
        }

        public Criteria andContRelSeqGreaterThan(Long value) {
            addCriterion("CONT_REL_SEQ >", value, "contRelSeq");
            return (Criteria) this;
        }

        public Criteria andContRelSeqGreaterThanOrEqualTo(Long value) {
            addCriterion("CONT_REL_SEQ >=", value, "contRelSeq");
            return (Criteria) this;
        }

        public Criteria andContRelSeqLessThan(Long value) {
            addCriterion("CONT_REL_SEQ <", value, "contRelSeq");
            return (Criteria) this;
        }

        public Criteria andContRelSeqLessThanOrEqualTo(Long value) {
            addCriterion("CONT_REL_SEQ <=", value, "contRelSeq");
            return (Criteria) this;
        }

        public Criteria andContRelSeqIn(List<Long> values) {
            addCriterion("CONT_REL_SEQ in", values, "contRelSeq");
            return (Criteria) this;
        }

        public Criteria andContRelSeqNotIn(List<Long> values) {
            addCriterion("CONT_REL_SEQ not in", values, "contRelSeq");
            return (Criteria) this;
        }

        public Criteria andContRelSeqBetween(Long value1, Long value2) {
            addCriterion("CONT_REL_SEQ between", value1, value2, "contRelSeq");
            return (Criteria) this;
        }

        public Criteria andContRelSeqNotBetween(Long value1, Long value2) {
            addCriterion("CONT_REL_SEQ not between", value1, value2, "contRelSeq");
            return (Criteria) this;
        }

        public Criteria andContRelGbCdIsNull() {
            addCriterion("CONT_REL_GB_CD is null");
            return (Criteria) this;
        }

        public Criteria andContRelGbCdIsNotNull() {
            addCriterion("CONT_REL_GB_CD is not null");
            return (Criteria) this;
        }

        public Criteria andContRelGbCdEqualTo(String value) {
            addCriterion("CONT_REL_GB_CD =", value, "contRelGbCd");
            return (Criteria) this;
        }

        public Criteria andContRelGbCdNotEqualTo(String value) {
            addCriterion("CONT_REL_GB_CD <>", value, "contRelGbCd");
            return (Criteria) this;
        }

        public Criteria andContRelGbCdGreaterThan(String value) {
            addCriterion("CONT_REL_GB_CD >", value, "contRelGbCd");
            return (Criteria) this;
        }

        public Criteria andContRelGbCdGreaterThanOrEqualTo(String value) {
            addCriterion("CONT_REL_GB_CD >=", value, "contRelGbCd");
            return (Criteria) this;
        }

        public Criteria andContRelGbCdLessThan(String value) {
            addCriterion("CONT_REL_GB_CD <", value, "contRelGbCd");
            return (Criteria) this;
        }

        public Criteria andContRelGbCdLessThanOrEqualTo(String value) {
            addCriterion("CONT_REL_GB_CD <=", value, "contRelGbCd");
            return (Criteria) this;
        }

        public Criteria andContRelGbCdLike(String value) {
            addCriterion("CONT_REL_GB_CD like", value, "contRelGbCd");
            return (Criteria) this;
        }

        public Criteria andContRelGbCdNotLike(String value) {
            addCriterion("CONT_REL_GB_CD not like", value, "contRelGbCd");
            return (Criteria) this;
        }

        public Criteria andContRelGbCdIn(List<String> values) {
            addCriterion("CONT_REL_GB_CD in", values, "contRelGbCd");
            return (Criteria) this;
        }

        public Criteria andContRelGbCdNotIn(List<String> values) {
            addCriterion("CONT_REL_GB_CD not in", values, "contRelGbCd");
            return (Criteria) this;
        }

        public Criteria andContRelGbCdBetween(String value1, String value2) {
            addCriterion("CONT_REL_GB_CD between", value1, value2, "contRelGbCd");
            return (Criteria) this;
        }

        public Criteria andContRelGbCdNotBetween(String value1, String value2) {
            addCriterion("CONT_REL_GB_CD not between", value1, value2, "contRelGbCd");
            return (Criteria) this;
        }

        public Criteria andContRoleIsNull() {
            addCriterion("CONT_ROLE is null");
            return (Criteria) this;
        }

        public Criteria andContRoleIsNotNull() {
            addCriterion("CONT_ROLE is not null");
            return (Criteria) this;
        }

        public Criteria andContRoleEqualTo(String value) {
            addCriterion("CONT_ROLE =", value, "contRole");
            return (Criteria) this;
        }

        public Criteria andContRoleNotEqualTo(String value) {
            addCriterion("CONT_ROLE <>", value, "contRole");
            return (Criteria) this;
        }

        public Criteria andContRoleGreaterThan(String value) {
            addCriterion("CONT_ROLE >", value, "contRole");
            return (Criteria) this;
        }

        public Criteria andContRoleGreaterThanOrEqualTo(String value) {
            addCriterion("CONT_ROLE >=", value, "contRole");
            return (Criteria) this;
        }

        public Criteria andContRoleLessThan(String value) {
            addCriterion("CONT_ROLE <", value, "contRole");
            return (Criteria) this;
        }

        public Criteria andContRoleLessThanOrEqualTo(String value) {
            addCriterion("CONT_ROLE <=", value, "contRole");
            return (Criteria) this;
        }

        public Criteria andContRoleLike(String value) {
            addCriterion("CONT_ROLE like", value, "contRole");
            return (Criteria) this;
        }

        public Criteria andContRoleNotLike(String value) {
            addCriterion("CONT_ROLE not like", value, "contRole");
            return (Criteria) this;
        }

        public Criteria andContRoleIn(List<String> values) {
            addCriterion("CONT_ROLE in", values, "contRole");
            return (Criteria) this;
        }

        public Criteria andContRoleNotIn(List<String> values) {
            addCriterion("CONT_ROLE not in", values, "contRole");
            return (Criteria) this;
        }

        public Criteria andContRoleBetween(String value1, String value2) {
            addCriterion("CONT_ROLE between", value1, value2, "contRole");
            return (Criteria) this;
        }

        public Criteria andContRoleNotBetween(String value1, String value2) {
            addCriterion("CONT_ROLE not between", value1, value2, "contRole");
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

        public Criteria andLinkContNoIsNull() {
            addCriterion("LINK_CONT_NO is null");
            return (Criteria) this;
        }

        public Criteria andLinkContNoIsNotNull() {
            addCriterion("LINK_CONT_NO is not null");
            return (Criteria) this;
        }

        public Criteria andLinkContNoEqualTo(Long value) {
            addCriterion("LINK_CONT_NO =", value, "linkContNo");
            return (Criteria) this;
        }

        public Criteria andLinkContNoNotEqualTo(Long value) {
            addCriterion("LINK_CONT_NO <>", value, "linkContNo");
            return (Criteria) this;
        }

        public Criteria andLinkContNoGreaterThan(Long value) {
            addCriterion("LINK_CONT_NO >", value, "linkContNo");
            return (Criteria) this;
        }

        public Criteria andLinkContNoGreaterThanOrEqualTo(Long value) {
            addCriterion("LINK_CONT_NO >=", value, "linkContNo");
            return (Criteria) this;
        }

        public Criteria andLinkContNoLessThan(Long value) {
            addCriterion("LINK_CONT_NO <", value, "linkContNo");
            return (Criteria) this;
        }

        public Criteria andLinkContNoLessThanOrEqualTo(Long value) {
            addCriterion("LINK_CONT_NO <=", value, "linkContNo");
            return (Criteria) this;
        }

        public Criteria andLinkContNoIn(List<Long> values) {
            addCriterion("LINK_CONT_NO in", values, "linkContNo");
            return (Criteria) this;
        }

        public Criteria andLinkContNoNotIn(List<Long> values) {
            addCriterion("LINK_CONT_NO not in", values, "linkContNo");
            return (Criteria) this;
        }

        public Criteria andLinkContNoBetween(Long value1, Long value2) {
            addCriterion("LINK_CONT_NO between", value1, value2, "linkContNo");
            return (Criteria) this;
        }

        public Criteria andLinkContNoNotBetween(Long value1, Long value2) {
            addCriterion("LINK_CONT_NO not between", value1, value2, "linkContNo");
            return (Criteria) this;
        }

        public Criteria andContRelInfoIsNull() {
            addCriterion("CONT_REL_INFO is null");
            return (Criteria) this;
        }

        public Criteria andContRelInfoIsNotNull() {
            addCriterion("CONT_REL_INFO is not null");
            return (Criteria) this;
        }

        public Criteria andContRelInfoEqualTo(String value) {
            addCriterion("CONT_REL_INFO =", value, "contRelInfo");
            return (Criteria) this;
        }

        public Criteria andContRelInfoNotEqualTo(String value) {
            addCriterion("CONT_REL_INFO <>", value, "contRelInfo");
            return (Criteria) this;
        }

        public Criteria andContRelInfoGreaterThan(String value) {
            addCriterion("CONT_REL_INFO >", value, "contRelInfo");
            return (Criteria) this;
        }

        public Criteria andContRelInfoGreaterThanOrEqualTo(String value) {
            addCriterion("CONT_REL_INFO >=", value, "contRelInfo");
            return (Criteria) this;
        }

        public Criteria andContRelInfoLessThan(String value) {
            addCriterion("CONT_REL_INFO <", value, "contRelInfo");
            return (Criteria) this;
        }

        public Criteria andContRelInfoLessThanOrEqualTo(String value) {
            addCriterion("CONT_REL_INFO <=", value, "contRelInfo");
            return (Criteria) this;
        }

        public Criteria andContRelInfoLike(String value) {
            addCriterion("CONT_REL_INFO like", value, "contRelInfo");
            return (Criteria) this;
        }

        public Criteria andContRelInfoNotLike(String value) {
            addCriterion("CONT_REL_INFO not like", value, "contRelInfo");
            return (Criteria) this;
        }

        public Criteria andContRelInfoIn(List<String> values) {
            addCriterion("CONT_REL_INFO in", values, "contRelInfo");
            return (Criteria) this;
        }

        public Criteria andContRelInfoNotIn(List<String> values) {
            addCriterion("CONT_REL_INFO not in", values, "contRelInfo");
            return (Criteria) this;
        }

        public Criteria andContRelInfoBetween(String value1, String value2) {
            addCriterion("CONT_REL_INFO between", value1, value2, "contRelInfo");
            return (Criteria) this;
        }

        public Criteria andContRelInfoNotBetween(String value1, String value2) {
            addCriterion("CONT_REL_INFO not between", value1, value2, "contRelInfo");
            return (Criteria) this;
        }

        public Criteria andContRelUseYnIsNull() {
            addCriterion("CONT_REL_USE_YN is null");
            return (Criteria) this;
        }

        public Criteria andContRelUseYnIsNotNull() {
            addCriterion("CONT_REL_USE_YN is not null");
            return (Criteria) this;
        }

        public Criteria andContRelUseYnEqualTo(String value) {
            addCriterion("CONT_REL_USE_YN =", value, "contRelUseYn");
            return (Criteria) this;
        }

        public Criteria andContRelUseYnNotEqualTo(String value) {
            addCriterion("CONT_REL_USE_YN <>", value, "contRelUseYn");
            return (Criteria) this;
        }

        public Criteria andContRelUseYnGreaterThan(String value) {
            addCriterion("CONT_REL_USE_YN >", value, "contRelUseYn");
            return (Criteria) this;
        }

        public Criteria andContRelUseYnGreaterThanOrEqualTo(String value) {
            addCriterion("CONT_REL_USE_YN >=", value, "contRelUseYn");
            return (Criteria) this;
        }

        public Criteria andContRelUseYnLessThan(String value) {
            addCriterion("CONT_REL_USE_YN <", value, "contRelUseYn");
            return (Criteria) this;
        }

        public Criteria andContRelUseYnLessThanOrEqualTo(String value) {
            addCriterion("CONT_REL_USE_YN <=", value, "contRelUseYn");
            return (Criteria) this;
        }

        public Criteria andContRelUseYnLike(String value) {
            addCriterion("CONT_REL_USE_YN like", value, "contRelUseYn");
            return (Criteria) this;
        }

        public Criteria andContRelUseYnNotLike(String value) {
            addCriterion("CONT_REL_USE_YN not like", value, "contRelUseYn");
            return (Criteria) this;
        }

        public Criteria andContRelUseYnIn(List<String> values) {
            addCriterion("CONT_REL_USE_YN in", values, "contRelUseYn");
            return (Criteria) this;
        }

        public Criteria andContRelUseYnNotIn(List<String> values) {
            addCriterion("CONT_REL_USE_YN not in", values, "contRelUseYn");
            return (Criteria) this;
        }

        public Criteria andContRelUseYnBetween(String value1, String value2) {
            addCriterion("CONT_REL_USE_YN between", value1, value2, "contRelUseYn");
            return (Criteria) this;
        }

        public Criteria andContRelUseYnNotBetween(String value1, String value2) {
            addCriterion("CONT_REL_USE_YN not between", value1, value2, "contRelUseYn");
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