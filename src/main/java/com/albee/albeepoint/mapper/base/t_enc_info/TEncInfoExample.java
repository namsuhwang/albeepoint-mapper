package com.albee.albeepoint.mapper.base.t_enc_info;

import java.time.LocalDateTime;
import java.util.ArrayList;
import java.util.List;

public class TEncInfoExample {
    protected String orderByClause;

    protected boolean distinct;

    protected List<Criteria> oredCriteria;

    public TEncInfoExample() {
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

        public Criteria andTargetGbCdIsNull() {
            addCriterion("TARGET_GB_CD is null");
            return (Criteria) this;
        }

        public Criteria andTargetGbCdIsNotNull() {
            addCriterion("TARGET_GB_CD is not null");
            return (Criteria) this;
        }

        public Criteria andTargetGbCdEqualTo(String value) {
            addCriterion("TARGET_GB_CD =", value, "targetGbCd");
            return (Criteria) this;
        }

        public Criteria andTargetGbCdNotEqualTo(String value) {
            addCriterion("TARGET_GB_CD <>", value, "targetGbCd");
            return (Criteria) this;
        }

        public Criteria andTargetGbCdGreaterThan(String value) {
            addCriterion("TARGET_GB_CD >", value, "targetGbCd");
            return (Criteria) this;
        }

        public Criteria andTargetGbCdGreaterThanOrEqualTo(String value) {
            addCriterion("TARGET_GB_CD >=", value, "targetGbCd");
            return (Criteria) this;
        }

        public Criteria andTargetGbCdLessThan(String value) {
            addCriterion("TARGET_GB_CD <", value, "targetGbCd");
            return (Criteria) this;
        }

        public Criteria andTargetGbCdLessThanOrEqualTo(String value) {
            addCriterion("TARGET_GB_CD <=", value, "targetGbCd");
            return (Criteria) this;
        }

        public Criteria andTargetGbCdLike(String value) {
            addCriterion("TARGET_GB_CD like", value, "targetGbCd");
            return (Criteria) this;
        }

        public Criteria andTargetGbCdNotLike(String value) {
            addCriterion("TARGET_GB_CD not like", value, "targetGbCd");
            return (Criteria) this;
        }

        public Criteria andTargetGbCdIn(List<String> values) {
            addCriterion("TARGET_GB_CD in", values, "targetGbCd");
            return (Criteria) this;
        }

        public Criteria andTargetGbCdNotIn(List<String> values) {
            addCriterion("TARGET_GB_CD not in", values, "targetGbCd");
            return (Criteria) this;
        }

        public Criteria andTargetGbCdBetween(String value1, String value2) {
            addCriterion("TARGET_GB_CD between", value1, value2, "targetGbCd");
            return (Criteria) this;
        }

        public Criteria andTargetGbCdNotBetween(String value1, String value2) {
            addCriterion("TARGET_GB_CD not between", value1, value2, "targetGbCd");
            return (Criteria) this;
        }

        public Criteria andTargetValIsNull() {
            addCriterion("TARGET_VAL is null");
            return (Criteria) this;
        }

        public Criteria andTargetValIsNotNull() {
            addCriterion("TARGET_VAL is not null");
            return (Criteria) this;
        }

        public Criteria andTargetValEqualTo(String value) {
            addCriterion("TARGET_VAL =", value, "targetVal");
            return (Criteria) this;
        }

        public Criteria andTargetValNotEqualTo(String value) {
            addCriterion("TARGET_VAL <>", value, "targetVal");
            return (Criteria) this;
        }

        public Criteria andTargetValGreaterThan(String value) {
            addCriterion("TARGET_VAL >", value, "targetVal");
            return (Criteria) this;
        }

        public Criteria andTargetValGreaterThanOrEqualTo(String value) {
            addCriterion("TARGET_VAL >=", value, "targetVal");
            return (Criteria) this;
        }

        public Criteria andTargetValLessThan(String value) {
            addCriterion("TARGET_VAL <", value, "targetVal");
            return (Criteria) this;
        }

        public Criteria andTargetValLessThanOrEqualTo(String value) {
            addCriterion("TARGET_VAL <=", value, "targetVal");
            return (Criteria) this;
        }

        public Criteria andTargetValLike(String value) {
            addCriterion("TARGET_VAL like", value, "targetVal");
            return (Criteria) this;
        }

        public Criteria andTargetValNotLike(String value) {
            addCriterion("TARGET_VAL not like", value, "targetVal");
            return (Criteria) this;
        }

        public Criteria andTargetValIn(List<String> values) {
            addCriterion("TARGET_VAL in", values, "targetVal");
            return (Criteria) this;
        }

        public Criteria andTargetValNotIn(List<String> values) {
            addCriterion("TARGET_VAL not in", values, "targetVal");
            return (Criteria) this;
        }

        public Criteria andTargetValBetween(String value1, String value2) {
            addCriterion("TARGET_VAL between", value1, value2, "targetVal");
            return (Criteria) this;
        }

        public Criteria andTargetValNotBetween(String value1, String value2) {
            addCriterion("TARGET_VAL not between", value1, value2, "targetVal");
            return (Criteria) this;
        }

        public Criteria andEncKeyIsNull() {
            addCriterion("ENC_KEY is null");
            return (Criteria) this;
        }

        public Criteria andEncKeyIsNotNull() {
            addCriterion("ENC_KEY is not null");
            return (Criteria) this;
        }

        public Criteria andEncKeyEqualTo(String value) {
            addCriterion("ENC_KEY =", value, "encKey");
            return (Criteria) this;
        }

        public Criteria andEncKeyNotEqualTo(String value) {
            addCriterion("ENC_KEY <>", value, "encKey");
            return (Criteria) this;
        }

        public Criteria andEncKeyGreaterThan(String value) {
            addCriterion("ENC_KEY >", value, "encKey");
            return (Criteria) this;
        }

        public Criteria andEncKeyGreaterThanOrEqualTo(String value) {
            addCriterion("ENC_KEY >=", value, "encKey");
            return (Criteria) this;
        }

        public Criteria andEncKeyLessThan(String value) {
            addCriterion("ENC_KEY <", value, "encKey");
            return (Criteria) this;
        }

        public Criteria andEncKeyLessThanOrEqualTo(String value) {
            addCriterion("ENC_KEY <=", value, "encKey");
            return (Criteria) this;
        }

        public Criteria andEncKeyLike(String value) {
            addCriterion("ENC_KEY like", value, "encKey");
            return (Criteria) this;
        }

        public Criteria andEncKeyNotLike(String value) {
            addCriterion("ENC_KEY not like", value, "encKey");
            return (Criteria) this;
        }

        public Criteria andEncKeyIn(List<String> values) {
            addCriterion("ENC_KEY in", values, "encKey");
            return (Criteria) this;
        }

        public Criteria andEncKeyNotIn(List<String> values) {
            addCriterion("ENC_KEY not in", values, "encKey");
            return (Criteria) this;
        }

        public Criteria andEncKeyBetween(String value1, String value2) {
            addCriterion("ENC_KEY between", value1, value2, "encKey");
            return (Criteria) this;
        }

        public Criteria andEncKeyNotBetween(String value1, String value2) {
            addCriterion("ENC_KEY not between", value1, value2, "encKey");
            return (Criteria) this;
        }

        public Criteria andSaltValIsNull() {
            addCriterion("SALT_VAL is null");
            return (Criteria) this;
        }

        public Criteria andSaltValIsNotNull() {
            addCriterion("SALT_VAL is not null");
            return (Criteria) this;
        }

        public Criteria andSaltValEqualTo(String value) {
            addCriterion("SALT_VAL =", value, "saltVal");
            return (Criteria) this;
        }

        public Criteria andSaltValNotEqualTo(String value) {
            addCriterion("SALT_VAL <>", value, "saltVal");
            return (Criteria) this;
        }

        public Criteria andSaltValGreaterThan(String value) {
            addCriterion("SALT_VAL >", value, "saltVal");
            return (Criteria) this;
        }

        public Criteria andSaltValGreaterThanOrEqualTo(String value) {
            addCriterion("SALT_VAL >=", value, "saltVal");
            return (Criteria) this;
        }

        public Criteria andSaltValLessThan(String value) {
            addCriterion("SALT_VAL <", value, "saltVal");
            return (Criteria) this;
        }

        public Criteria andSaltValLessThanOrEqualTo(String value) {
            addCriterion("SALT_VAL <=", value, "saltVal");
            return (Criteria) this;
        }

        public Criteria andSaltValLike(String value) {
            addCriterion("SALT_VAL like", value, "saltVal");
            return (Criteria) this;
        }

        public Criteria andSaltValNotLike(String value) {
            addCriterion("SALT_VAL not like", value, "saltVal");
            return (Criteria) this;
        }

        public Criteria andSaltValIn(List<String> values) {
            addCriterion("SALT_VAL in", values, "saltVal");
            return (Criteria) this;
        }

        public Criteria andSaltValNotIn(List<String> values) {
            addCriterion("SALT_VAL not in", values, "saltVal");
            return (Criteria) this;
        }

        public Criteria andSaltValBetween(String value1, String value2) {
            addCriterion("SALT_VAL between", value1, value2, "saltVal");
            return (Criteria) this;
        }

        public Criteria andSaltValNotBetween(String value1, String value2) {
            addCriterion("SALT_VAL not between", value1, value2, "saltVal");
            return (Criteria) this;
        }

        public Criteria andEncStsCdIsNull() {
            addCriterion("ENC_STS_CD is null");
            return (Criteria) this;
        }

        public Criteria andEncStsCdIsNotNull() {
            addCriterion("ENC_STS_CD is not null");
            return (Criteria) this;
        }

        public Criteria andEncStsCdEqualTo(String value) {
            addCriterion("ENC_STS_CD =", value, "encStsCd");
            return (Criteria) this;
        }

        public Criteria andEncStsCdNotEqualTo(String value) {
            addCriterion("ENC_STS_CD <>", value, "encStsCd");
            return (Criteria) this;
        }

        public Criteria andEncStsCdGreaterThan(String value) {
            addCriterion("ENC_STS_CD >", value, "encStsCd");
            return (Criteria) this;
        }

        public Criteria andEncStsCdGreaterThanOrEqualTo(String value) {
            addCriterion("ENC_STS_CD >=", value, "encStsCd");
            return (Criteria) this;
        }

        public Criteria andEncStsCdLessThan(String value) {
            addCriterion("ENC_STS_CD <", value, "encStsCd");
            return (Criteria) this;
        }

        public Criteria andEncStsCdLessThanOrEqualTo(String value) {
            addCriterion("ENC_STS_CD <=", value, "encStsCd");
            return (Criteria) this;
        }

        public Criteria andEncStsCdLike(String value) {
            addCriterion("ENC_STS_CD like", value, "encStsCd");
            return (Criteria) this;
        }

        public Criteria andEncStsCdNotLike(String value) {
            addCriterion("ENC_STS_CD not like", value, "encStsCd");
            return (Criteria) this;
        }

        public Criteria andEncStsCdIn(List<String> values) {
            addCriterion("ENC_STS_CD in", values, "encStsCd");
            return (Criteria) this;
        }

        public Criteria andEncStsCdNotIn(List<String> values) {
            addCriterion("ENC_STS_CD not in", values, "encStsCd");
            return (Criteria) this;
        }

        public Criteria andEncStsCdBetween(String value1, String value2) {
            addCriterion("ENC_STS_CD between", value1, value2, "encStsCd");
            return (Criteria) this;
        }

        public Criteria andEncStsCdNotBetween(String value1, String value2) {
            addCriterion("ENC_STS_CD not between", value1, value2, "encStsCd");
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