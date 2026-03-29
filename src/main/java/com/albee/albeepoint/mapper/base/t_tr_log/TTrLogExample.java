package com.albee.albeepoint.mapper.base.t_tr_log;

import java.time.LocalDateTime;
import java.util.ArrayList;
import java.util.List;

public class TTrLogExample {
    protected String orderByClause;

    protected boolean distinct;

    protected List<Criteria> oredCriteria;

    public TTrLogExample() {
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

        public Criteria andTrDtIsNull() {
            addCriterion("TR_DT is null");
            return (Criteria) this;
        }

        public Criteria andTrDtIsNotNull() {
            addCriterion("TR_DT is not null");
            return (Criteria) this;
        }

        public Criteria andTrDtEqualTo(String value) {
            addCriterion("TR_DT =", value, "trDt");
            return (Criteria) this;
        }

        public Criteria andTrDtNotEqualTo(String value) {
            addCriterion("TR_DT <>", value, "trDt");
            return (Criteria) this;
        }

        public Criteria andTrDtGreaterThan(String value) {
            addCriterion("TR_DT >", value, "trDt");
            return (Criteria) this;
        }

        public Criteria andTrDtGreaterThanOrEqualTo(String value) {
            addCriterion("TR_DT >=", value, "trDt");
            return (Criteria) this;
        }

        public Criteria andTrDtLessThan(String value) {
            addCriterion("TR_DT <", value, "trDt");
            return (Criteria) this;
        }

        public Criteria andTrDtLessThanOrEqualTo(String value) {
            addCriterion("TR_DT <=", value, "trDt");
            return (Criteria) this;
        }

        public Criteria andTrDtLike(String value) {
            addCriterion("TR_DT like", value, "trDt");
            return (Criteria) this;
        }

        public Criteria andTrDtNotLike(String value) {
            addCriterion("TR_DT not like", value, "trDt");
            return (Criteria) this;
        }

        public Criteria andTrDtIn(List<String> values) {
            addCriterion("TR_DT in", values, "trDt");
            return (Criteria) this;
        }

        public Criteria andTrDtNotIn(List<String> values) {
            addCriterion("TR_DT not in", values, "trDt");
            return (Criteria) this;
        }

        public Criteria andTrDtBetween(String value1, String value2) {
            addCriterion("TR_DT between", value1, value2, "trDt");
            return (Criteria) this;
        }

        public Criteria andTrDtNotBetween(String value1, String value2) {
            addCriterion("TR_DT not between", value1, value2, "trDt");
            return (Criteria) this;
        }

        public Criteria andTrIdIsNull() {
            addCriterion("TR_ID is null");
            return (Criteria) this;
        }

        public Criteria andTrIdIsNotNull() {
            addCriterion("TR_ID is not null");
            return (Criteria) this;
        }

        public Criteria andTrIdEqualTo(String value) {
            addCriterion("TR_ID =", value, "trId");
            return (Criteria) this;
        }

        public Criteria andTrIdNotEqualTo(String value) {
            addCriterion("TR_ID <>", value, "trId");
            return (Criteria) this;
        }

        public Criteria andTrIdGreaterThan(String value) {
            addCriterion("TR_ID >", value, "trId");
            return (Criteria) this;
        }

        public Criteria andTrIdGreaterThanOrEqualTo(String value) {
            addCriterion("TR_ID >=", value, "trId");
            return (Criteria) this;
        }

        public Criteria andTrIdLessThan(String value) {
            addCriterion("TR_ID <", value, "trId");
            return (Criteria) this;
        }

        public Criteria andTrIdLessThanOrEqualTo(String value) {
            addCriterion("TR_ID <=", value, "trId");
            return (Criteria) this;
        }

        public Criteria andTrIdLike(String value) {
            addCriterion("TR_ID like", value, "trId");
            return (Criteria) this;
        }

        public Criteria andTrIdNotLike(String value) {
            addCriterion("TR_ID not like", value, "trId");
            return (Criteria) this;
        }

        public Criteria andTrIdIn(List<String> values) {
            addCriterion("TR_ID in", values, "trId");
            return (Criteria) this;
        }

        public Criteria andTrIdNotIn(List<String> values) {
            addCriterion("TR_ID not in", values, "trId");
            return (Criteria) this;
        }

        public Criteria andTrIdBetween(String value1, String value2) {
            addCriterion("TR_ID between", value1, value2, "trId");
            return (Criteria) this;
        }

        public Criteria andTrIdNotBetween(String value1, String value2) {
            addCriterion("TR_ID not between", value1, value2, "trId");
            return (Criteria) this;
        }

        public Criteria andTrGbIsNull() {
            addCriterion("TR_GB is null");
            return (Criteria) this;
        }

        public Criteria andTrGbIsNotNull() {
            addCriterion("TR_GB is not null");
            return (Criteria) this;
        }

        public Criteria andTrGbEqualTo(String value) {
            addCriterion("TR_GB =", value, "trGb");
            return (Criteria) this;
        }

        public Criteria andTrGbNotEqualTo(String value) {
            addCriterion("TR_GB <>", value, "trGb");
            return (Criteria) this;
        }

        public Criteria andTrGbGreaterThan(String value) {
            addCriterion("TR_GB >", value, "trGb");
            return (Criteria) this;
        }

        public Criteria andTrGbGreaterThanOrEqualTo(String value) {
            addCriterion("TR_GB >=", value, "trGb");
            return (Criteria) this;
        }

        public Criteria andTrGbLessThan(String value) {
            addCriterion("TR_GB <", value, "trGb");
            return (Criteria) this;
        }

        public Criteria andTrGbLessThanOrEqualTo(String value) {
            addCriterion("TR_GB <=", value, "trGb");
            return (Criteria) this;
        }

        public Criteria andTrGbLike(String value) {
            addCriterion("TR_GB like", value, "trGb");
            return (Criteria) this;
        }

        public Criteria andTrGbNotLike(String value) {
            addCriterion("TR_GB not like", value, "trGb");
            return (Criteria) this;
        }

        public Criteria andTrGbIn(List<String> values) {
            addCriterion("TR_GB in", values, "trGb");
            return (Criteria) this;
        }

        public Criteria andTrGbNotIn(List<String> values) {
            addCriterion("TR_GB not in", values, "trGb");
            return (Criteria) this;
        }

        public Criteria andTrGbBetween(String value1, String value2) {
            addCriterion("TR_GB between", value1, value2, "trGb");
            return (Criteria) this;
        }

        public Criteria andTrGbNotBetween(String value1, String value2) {
            addCriterion("TR_GB not between", value1, value2, "trGb");
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

        public Criteria andIpAddrIsNull() {
            addCriterion("IP_ADDR is null");
            return (Criteria) this;
        }

        public Criteria andIpAddrIsNotNull() {
            addCriterion("IP_ADDR is not null");
            return (Criteria) this;
        }

        public Criteria andIpAddrEqualTo(String value) {
            addCriterion("IP_ADDR =", value, "ipAddr");
            return (Criteria) this;
        }

        public Criteria andIpAddrNotEqualTo(String value) {
            addCriterion("IP_ADDR <>", value, "ipAddr");
            return (Criteria) this;
        }

        public Criteria andIpAddrGreaterThan(String value) {
            addCriterion("IP_ADDR >", value, "ipAddr");
            return (Criteria) this;
        }

        public Criteria andIpAddrGreaterThanOrEqualTo(String value) {
            addCriterion("IP_ADDR >=", value, "ipAddr");
            return (Criteria) this;
        }

        public Criteria andIpAddrLessThan(String value) {
            addCriterion("IP_ADDR <", value, "ipAddr");
            return (Criteria) this;
        }

        public Criteria andIpAddrLessThanOrEqualTo(String value) {
            addCriterion("IP_ADDR <=", value, "ipAddr");
            return (Criteria) this;
        }

        public Criteria andIpAddrLike(String value) {
            addCriterion("IP_ADDR like", value, "ipAddr");
            return (Criteria) this;
        }

        public Criteria andIpAddrNotLike(String value) {
            addCriterion("IP_ADDR not like", value, "ipAddr");
            return (Criteria) this;
        }

        public Criteria andIpAddrIn(List<String> values) {
            addCriterion("IP_ADDR in", values, "ipAddr");
            return (Criteria) this;
        }

        public Criteria andIpAddrNotIn(List<String> values) {
            addCriterion("IP_ADDR not in", values, "ipAddr");
            return (Criteria) this;
        }

        public Criteria andIpAddrBetween(String value1, String value2) {
            addCriterion("IP_ADDR between", value1, value2, "ipAddr");
            return (Criteria) this;
        }

        public Criteria andIpAddrNotBetween(String value1, String value2) {
            addCriterion("IP_ADDR not between", value1, value2, "ipAddr");
            return (Criteria) this;
        }

        public Criteria andReqDtIsNull() {
            addCriterion("REQ_DT is null");
            return (Criteria) this;
        }

        public Criteria andReqDtIsNotNull() {
            addCriterion("REQ_DT is not null");
            return (Criteria) this;
        }

        public Criteria andReqDtEqualTo(LocalDateTime value) {
            addCriterion("REQ_DT =", value, "reqDt");
            return (Criteria) this;
        }

        public Criteria andReqDtNotEqualTo(LocalDateTime value) {
            addCriterion("REQ_DT <>", value, "reqDt");
            return (Criteria) this;
        }

        public Criteria andReqDtGreaterThan(LocalDateTime value) {
            addCriterion("REQ_DT >", value, "reqDt");
            return (Criteria) this;
        }

        public Criteria andReqDtGreaterThanOrEqualTo(LocalDateTime value) {
            addCriterion("REQ_DT >=", value, "reqDt");
            return (Criteria) this;
        }

        public Criteria andReqDtLessThan(LocalDateTime value) {
            addCriterion("REQ_DT <", value, "reqDt");
            return (Criteria) this;
        }

        public Criteria andReqDtLessThanOrEqualTo(LocalDateTime value) {
            addCriterion("REQ_DT <=", value, "reqDt");
            return (Criteria) this;
        }

        public Criteria andReqDtIn(List<LocalDateTime> values) {
            addCriterion("REQ_DT in", values, "reqDt");
            return (Criteria) this;
        }

        public Criteria andReqDtNotIn(List<LocalDateTime> values) {
            addCriterion("REQ_DT not in", values, "reqDt");
            return (Criteria) this;
        }

        public Criteria andReqDtBetween(LocalDateTime value1, LocalDateTime value2) {
            addCriterion("REQ_DT between", value1, value2, "reqDt");
            return (Criteria) this;
        }

        public Criteria andReqDtNotBetween(LocalDateTime value1, LocalDateTime value2) {
            addCriterion("REQ_DT not between", value1, value2, "reqDt");
            return (Criteria) this;
        }

        public Criteria andResDtIsNull() {
            addCriterion("RES_DT is null");
            return (Criteria) this;
        }

        public Criteria andResDtIsNotNull() {
            addCriterion("RES_DT is not null");
            return (Criteria) this;
        }

        public Criteria andResDtEqualTo(LocalDateTime value) {
            addCriterion("RES_DT =", value, "resDt");
            return (Criteria) this;
        }

        public Criteria andResDtNotEqualTo(LocalDateTime value) {
            addCriterion("RES_DT <>", value, "resDt");
            return (Criteria) this;
        }

        public Criteria andResDtGreaterThan(LocalDateTime value) {
            addCriterion("RES_DT >", value, "resDt");
            return (Criteria) this;
        }

        public Criteria andResDtGreaterThanOrEqualTo(LocalDateTime value) {
            addCriterion("RES_DT >=", value, "resDt");
            return (Criteria) this;
        }

        public Criteria andResDtLessThan(LocalDateTime value) {
            addCriterion("RES_DT <", value, "resDt");
            return (Criteria) this;
        }

        public Criteria andResDtLessThanOrEqualTo(LocalDateTime value) {
            addCriterion("RES_DT <=", value, "resDt");
            return (Criteria) this;
        }

        public Criteria andResDtIn(List<LocalDateTime> values) {
            addCriterion("RES_DT in", values, "resDt");
            return (Criteria) this;
        }

        public Criteria andResDtNotIn(List<LocalDateTime> values) {
            addCriterion("RES_DT not in", values, "resDt");
            return (Criteria) this;
        }

        public Criteria andResDtBetween(LocalDateTime value1, LocalDateTime value2) {
            addCriterion("RES_DT between", value1, value2, "resDt");
            return (Criteria) this;
        }

        public Criteria andResDtNotBetween(LocalDateTime value1, LocalDateTime value2) {
            addCriterion("RES_DT not between", value1, value2, "resDt");
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