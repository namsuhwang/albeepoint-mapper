package com.albee.albeepoint.mapper.base.t_tr_rel;

import java.time.LocalDateTime;
import java.util.ArrayList;
import java.util.List;

public class TTrRelExample {
    protected String orderByClause;

    protected boolean distinct;

    protected List<Criteria> oredCriteria;

    public TTrRelExample() {
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

        public Criteria andTrRelNoIsNull() {
            addCriterion("TR_REL_NO is null");
            return (Criteria) this;
        }

        public Criteria andTrRelNoIsNotNull() {
            addCriterion("TR_REL_NO is not null");
            return (Criteria) this;
        }

        public Criteria andTrRelNoEqualTo(Long value) {
            addCriterion("TR_REL_NO =", value, "trRelNo");
            return (Criteria) this;
        }

        public Criteria andTrRelNoNotEqualTo(Long value) {
            addCriterion("TR_REL_NO <>", value, "trRelNo");
            return (Criteria) this;
        }

        public Criteria andTrRelNoGreaterThan(Long value) {
            addCriterion("TR_REL_NO >", value, "trRelNo");
            return (Criteria) this;
        }

        public Criteria andTrRelNoGreaterThanOrEqualTo(Long value) {
            addCriterion("TR_REL_NO >=", value, "trRelNo");
            return (Criteria) this;
        }

        public Criteria andTrRelNoLessThan(Long value) {
            addCriterion("TR_REL_NO <", value, "trRelNo");
            return (Criteria) this;
        }

        public Criteria andTrRelNoLessThanOrEqualTo(Long value) {
            addCriterion("TR_REL_NO <=", value, "trRelNo");
            return (Criteria) this;
        }

        public Criteria andTrRelNoIn(List<Long> values) {
            addCriterion("TR_REL_NO in", values, "trRelNo");
            return (Criteria) this;
        }

        public Criteria andTrRelNoNotIn(List<Long> values) {
            addCriterion("TR_REL_NO not in", values, "trRelNo");
            return (Criteria) this;
        }

        public Criteria andTrRelNoBetween(Long value1, Long value2) {
            addCriterion("TR_REL_NO between", value1, value2, "trRelNo");
            return (Criteria) this;
        }

        public Criteria andTrRelNoNotBetween(Long value1, Long value2) {
            addCriterion("TR_REL_NO not between", value1, value2, "trRelNo");
            return (Criteria) this;
        }

        public Criteria andTrSnoIsNull() {
            addCriterion("TR_SNO is null");
            return (Criteria) this;
        }

        public Criteria andTrSnoIsNotNull() {
            addCriterion("TR_SNO is not null");
            return (Criteria) this;
        }

        public Criteria andTrSnoEqualTo(Long value) {
            addCriterion("TR_SNO =", value, "trSno");
            return (Criteria) this;
        }

        public Criteria andTrSnoNotEqualTo(Long value) {
            addCriterion("TR_SNO <>", value, "trSno");
            return (Criteria) this;
        }

        public Criteria andTrSnoGreaterThan(Long value) {
            addCriterion("TR_SNO >", value, "trSno");
            return (Criteria) this;
        }

        public Criteria andTrSnoGreaterThanOrEqualTo(Long value) {
            addCriterion("TR_SNO >=", value, "trSno");
            return (Criteria) this;
        }

        public Criteria andTrSnoLessThan(Long value) {
            addCriterion("TR_SNO <", value, "trSno");
            return (Criteria) this;
        }

        public Criteria andTrSnoLessThanOrEqualTo(Long value) {
            addCriterion("TR_SNO <=", value, "trSno");
            return (Criteria) this;
        }

        public Criteria andTrSnoIn(List<Long> values) {
            addCriterion("TR_SNO in", values, "trSno");
            return (Criteria) this;
        }

        public Criteria andTrSnoNotIn(List<Long> values) {
            addCriterion("TR_SNO not in", values, "trSno");
            return (Criteria) this;
        }

        public Criteria andTrSnoBetween(Long value1, Long value2) {
            addCriterion("TR_SNO between", value1, value2, "trSno");
            return (Criteria) this;
        }

        public Criteria andTrSnoNotBetween(Long value1, Long value2) {
            addCriterion("TR_SNO not between", value1, value2, "trSno");
            return (Criteria) this;
        }

        public Criteria andTrSeqIsNull() {
            addCriterion("TR_SEQ is null");
            return (Criteria) this;
        }

        public Criteria andTrSeqIsNotNull() {
            addCriterion("TR_SEQ is not null");
            return (Criteria) this;
        }

        public Criteria andTrSeqEqualTo(Long value) {
            addCriterion("TR_SEQ =", value, "trSeq");
            return (Criteria) this;
        }

        public Criteria andTrSeqNotEqualTo(Long value) {
            addCriterion("TR_SEQ <>", value, "trSeq");
            return (Criteria) this;
        }

        public Criteria andTrSeqGreaterThan(Long value) {
            addCriterion("TR_SEQ >", value, "trSeq");
            return (Criteria) this;
        }

        public Criteria andTrSeqGreaterThanOrEqualTo(Long value) {
            addCriterion("TR_SEQ >=", value, "trSeq");
            return (Criteria) this;
        }

        public Criteria andTrSeqLessThan(Long value) {
            addCriterion("TR_SEQ <", value, "trSeq");
            return (Criteria) this;
        }

        public Criteria andTrSeqLessThanOrEqualTo(Long value) {
            addCriterion("TR_SEQ <=", value, "trSeq");
            return (Criteria) this;
        }

        public Criteria andTrSeqIn(List<Long> values) {
            addCriterion("TR_SEQ in", values, "trSeq");
            return (Criteria) this;
        }

        public Criteria andTrSeqNotIn(List<Long> values) {
            addCriterion("TR_SEQ not in", values, "trSeq");
            return (Criteria) this;
        }

        public Criteria andTrSeqBetween(Long value1, Long value2) {
            addCriterion("TR_SEQ between", value1, value2, "trSeq");
            return (Criteria) this;
        }

        public Criteria andTrSeqNotBetween(Long value1, Long value2) {
            addCriterion("TR_SEQ not between", value1, value2, "trSeq");
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