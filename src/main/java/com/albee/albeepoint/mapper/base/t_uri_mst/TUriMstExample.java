package com.albee.albeepoint.mapper.base.t_uri_mst;

import java.time.LocalDateTime;
import java.util.ArrayList;
import java.util.List;

public class TUriMstExample {
    protected String orderByClause;

    protected boolean distinct;

    protected List<Criteria> oredCriteria;

    public TUriMstExample() {
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

        public Criteria andUriIsNull() {
            addCriterion("URI is null");
            return (Criteria) this;
        }

        public Criteria andUriIsNotNull() {
            addCriterion("URI is not null");
            return (Criteria) this;
        }

        public Criteria andUriEqualTo(String value) {
            addCriterion("URI =", value, "uri");
            return (Criteria) this;
        }

        public Criteria andUriNotEqualTo(String value) {
            addCriterion("URI <>", value, "uri");
            return (Criteria) this;
        }

        public Criteria andUriGreaterThan(String value) {
            addCriterion("URI >", value, "uri");
            return (Criteria) this;
        }

        public Criteria andUriGreaterThanOrEqualTo(String value) {
            addCriterion("URI >=", value, "uri");
            return (Criteria) this;
        }

        public Criteria andUriLessThan(String value) {
            addCriterion("URI <", value, "uri");
            return (Criteria) this;
        }

        public Criteria andUriLessThanOrEqualTo(String value) {
            addCriterion("URI <=", value, "uri");
            return (Criteria) this;
        }

        public Criteria andUriLike(String value) {
            addCriterion("URI like", value, "uri");
            return (Criteria) this;
        }

        public Criteria andUriNotLike(String value) {
            addCriterion("URI not like", value, "uri");
            return (Criteria) this;
        }

        public Criteria andUriIn(List<String> values) {
            addCriterion("URI in", values, "uri");
            return (Criteria) this;
        }

        public Criteria andUriNotIn(List<String> values) {
            addCriterion("URI not in", values, "uri");
            return (Criteria) this;
        }

        public Criteria andUriBetween(String value1, String value2) {
            addCriterion("URI between", value1, value2, "uri");
            return (Criteria) this;
        }

        public Criteria andUriNotBetween(String value1, String value2) {
            addCriterion("URI not between", value1, value2, "uri");
            return (Criteria) this;
        }

        public Criteria andTrGbCdIsNull() {
            addCriterion("TR_GB_CD is null");
            return (Criteria) this;
        }

        public Criteria andTrGbCdIsNotNull() {
            addCriterion("TR_GB_CD is not null");
            return (Criteria) this;
        }

        public Criteria andTrGbCdEqualTo(String value) {
            addCriterion("TR_GB_CD =", value, "trGbCd");
            return (Criteria) this;
        }

        public Criteria andTrGbCdNotEqualTo(String value) {
            addCriterion("TR_GB_CD <>", value, "trGbCd");
            return (Criteria) this;
        }

        public Criteria andTrGbCdGreaterThan(String value) {
            addCriterion("TR_GB_CD >", value, "trGbCd");
            return (Criteria) this;
        }

        public Criteria andTrGbCdGreaterThanOrEqualTo(String value) {
            addCriterion("TR_GB_CD >=", value, "trGbCd");
            return (Criteria) this;
        }

        public Criteria andTrGbCdLessThan(String value) {
            addCriterion("TR_GB_CD <", value, "trGbCd");
            return (Criteria) this;
        }

        public Criteria andTrGbCdLessThanOrEqualTo(String value) {
            addCriterion("TR_GB_CD <=", value, "trGbCd");
            return (Criteria) this;
        }

        public Criteria andTrGbCdLike(String value) {
            addCriterion("TR_GB_CD like", value, "trGbCd");
            return (Criteria) this;
        }

        public Criteria andTrGbCdNotLike(String value) {
            addCriterion("TR_GB_CD not like", value, "trGbCd");
            return (Criteria) this;
        }

        public Criteria andTrGbCdIn(List<String> values) {
            addCriterion("TR_GB_CD in", values, "trGbCd");
            return (Criteria) this;
        }

        public Criteria andTrGbCdNotIn(List<String> values) {
            addCriterion("TR_GB_CD not in", values, "trGbCd");
            return (Criteria) this;
        }

        public Criteria andTrGbCdBetween(String value1, String value2) {
            addCriterion("TR_GB_CD between", value1, value2, "trGbCd");
            return (Criteria) this;
        }

        public Criteria andTrGbCdNotBetween(String value1, String value2) {
            addCriterion("TR_GB_CD not between", value1, value2, "trGbCd");
            return (Criteria) this;
        }

        public Criteria andAcsPolicyCdIsNull() {
            addCriterion("ACS_POLICY_CD is null");
            return (Criteria) this;
        }

        public Criteria andAcsPolicyCdIsNotNull() {
            addCriterion("ACS_POLICY_CD is not null");
            return (Criteria) this;
        }

        public Criteria andAcsPolicyCdEqualTo(String value) {
            addCriterion("ACS_POLICY_CD =", value, "acsPolicyCd");
            return (Criteria) this;
        }

        public Criteria andAcsPolicyCdNotEqualTo(String value) {
            addCriterion("ACS_POLICY_CD <>", value, "acsPolicyCd");
            return (Criteria) this;
        }

        public Criteria andAcsPolicyCdGreaterThan(String value) {
            addCriterion("ACS_POLICY_CD >", value, "acsPolicyCd");
            return (Criteria) this;
        }

        public Criteria andAcsPolicyCdGreaterThanOrEqualTo(String value) {
            addCriterion("ACS_POLICY_CD >=", value, "acsPolicyCd");
            return (Criteria) this;
        }

        public Criteria andAcsPolicyCdLessThan(String value) {
            addCriterion("ACS_POLICY_CD <", value, "acsPolicyCd");
            return (Criteria) this;
        }

        public Criteria andAcsPolicyCdLessThanOrEqualTo(String value) {
            addCriterion("ACS_POLICY_CD <=", value, "acsPolicyCd");
            return (Criteria) this;
        }

        public Criteria andAcsPolicyCdLike(String value) {
            addCriterion("ACS_POLICY_CD like", value, "acsPolicyCd");
            return (Criteria) this;
        }

        public Criteria andAcsPolicyCdNotLike(String value) {
            addCriterion("ACS_POLICY_CD not like", value, "acsPolicyCd");
            return (Criteria) this;
        }

        public Criteria andAcsPolicyCdIn(List<String> values) {
            addCriterion("ACS_POLICY_CD in", values, "acsPolicyCd");
            return (Criteria) this;
        }

        public Criteria andAcsPolicyCdNotIn(List<String> values) {
            addCriterion("ACS_POLICY_CD not in", values, "acsPolicyCd");
            return (Criteria) this;
        }

        public Criteria andAcsPolicyCdBetween(String value1, String value2) {
            addCriterion("ACS_POLICY_CD between", value1, value2, "acsPolicyCd");
            return (Criteria) this;
        }

        public Criteria andAcsPolicyCdNotBetween(String value1, String value2) {
            addCriterion("ACS_POLICY_CD not between", value1, value2, "acsPolicyCd");
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

        public Criteria andUriInfoIsNull() {
            addCriterion("URI_INFO is null");
            return (Criteria) this;
        }

        public Criteria andUriInfoIsNotNull() {
            addCriterion("URI_INFO is not null");
            return (Criteria) this;
        }

        public Criteria andUriInfoEqualTo(String value) {
            addCriterion("URI_INFO =", value, "uriInfo");
            return (Criteria) this;
        }

        public Criteria andUriInfoNotEqualTo(String value) {
            addCriterion("URI_INFO <>", value, "uriInfo");
            return (Criteria) this;
        }

        public Criteria andUriInfoGreaterThan(String value) {
            addCriterion("URI_INFO >", value, "uriInfo");
            return (Criteria) this;
        }

        public Criteria andUriInfoGreaterThanOrEqualTo(String value) {
            addCriterion("URI_INFO >=", value, "uriInfo");
            return (Criteria) this;
        }

        public Criteria andUriInfoLessThan(String value) {
            addCriterion("URI_INFO <", value, "uriInfo");
            return (Criteria) this;
        }

        public Criteria andUriInfoLessThanOrEqualTo(String value) {
            addCriterion("URI_INFO <=", value, "uriInfo");
            return (Criteria) this;
        }

        public Criteria andUriInfoLike(String value) {
            addCriterion("URI_INFO like", value, "uriInfo");
            return (Criteria) this;
        }

        public Criteria andUriInfoNotLike(String value) {
            addCriterion("URI_INFO not like", value, "uriInfo");
            return (Criteria) this;
        }

        public Criteria andUriInfoIn(List<String> values) {
            addCriterion("URI_INFO in", values, "uriInfo");
            return (Criteria) this;
        }

        public Criteria andUriInfoNotIn(List<String> values) {
            addCriterion("URI_INFO not in", values, "uriInfo");
            return (Criteria) this;
        }

        public Criteria andUriInfoBetween(String value1, String value2) {
            addCriterion("URI_INFO between", value1, value2, "uriInfo");
            return (Criteria) this;
        }

        public Criteria andUriInfoNotBetween(String value1, String value2) {
            addCriterion("URI_INFO not between", value1, value2, "uriInfo");
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