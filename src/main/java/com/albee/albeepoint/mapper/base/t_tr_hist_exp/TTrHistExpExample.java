package com.albee.albeepoint.mapper.base.t_tr_hist_exp;

import java.time.LocalDateTime;
import java.util.ArrayList;
import java.util.List;

public class TTrHistExpExample {
    protected String orderByClause;

    protected boolean distinct;

    protected List<Criteria> oredCriteria;

    public TTrHistExpExample() {
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

        public Criteria andExpDtIsNull() {
            addCriterion("EXP_DT is null");
            return (Criteria) this;
        }

        public Criteria andExpDtIsNotNull() {
            addCriterion("EXP_DT is not null");
            return (Criteria) this;
        }

        public Criteria andExpDtEqualTo(LocalDateTime value) {
            addCriterion("EXP_DT =", value, "expDt");
            return (Criteria) this;
        }

        public Criteria andExpDtNotEqualTo(LocalDateTime value) {
            addCriterion("EXP_DT <>", value, "expDt");
            return (Criteria) this;
        }

        public Criteria andExpDtGreaterThan(LocalDateTime value) {
            addCriterion("EXP_DT >", value, "expDt");
            return (Criteria) this;
        }

        public Criteria andExpDtGreaterThanOrEqualTo(LocalDateTime value) {
            addCriterion("EXP_DT >=", value, "expDt");
            return (Criteria) this;
        }

        public Criteria andExpDtLessThan(LocalDateTime value) {
            addCriterion("EXP_DT <", value, "expDt");
            return (Criteria) this;
        }

        public Criteria andExpDtLessThanOrEqualTo(LocalDateTime value) {
            addCriterion("EXP_DT <=", value, "expDt");
            return (Criteria) this;
        }

        public Criteria andExpDtIn(List<LocalDateTime> values) {
            addCriterion("EXP_DT in", values, "expDt");
            return (Criteria) this;
        }

        public Criteria andExpDtNotIn(List<LocalDateTime> values) {
            addCriterion("EXP_DT not in", values, "expDt");
            return (Criteria) this;
        }

        public Criteria andExpDtBetween(LocalDateTime value1, LocalDateTime value2) {
            addCriterion("EXP_DT between", value1, value2, "expDt");
            return (Criteria) this;
        }

        public Criteria andExpDtNotBetween(LocalDateTime value1, LocalDateTime value2) {
            addCriterion("EXP_DT not between", value1, value2, "expDt");
            return (Criteria) this;
        }

        public Criteria andPtNoIsNull() {
            addCriterion("PT_NO is null");
            return (Criteria) this;
        }

        public Criteria andPtNoIsNotNull() {
            addCriterion("PT_NO is not null");
            return (Criteria) this;
        }

        public Criteria andPtNoEqualTo(Long value) {
            addCriterion("PT_NO =", value, "ptNo");
            return (Criteria) this;
        }

        public Criteria andPtNoNotEqualTo(Long value) {
            addCriterion("PT_NO <>", value, "ptNo");
            return (Criteria) this;
        }

        public Criteria andPtNoGreaterThan(Long value) {
            addCriterion("PT_NO >", value, "ptNo");
            return (Criteria) this;
        }

        public Criteria andPtNoGreaterThanOrEqualTo(Long value) {
            addCriterion("PT_NO >=", value, "ptNo");
            return (Criteria) this;
        }

        public Criteria andPtNoLessThan(Long value) {
            addCriterion("PT_NO <", value, "ptNo");
            return (Criteria) this;
        }

        public Criteria andPtNoLessThanOrEqualTo(Long value) {
            addCriterion("PT_NO <=", value, "ptNo");
            return (Criteria) this;
        }

        public Criteria andPtNoIn(List<Long> values) {
            addCriterion("PT_NO in", values, "ptNo");
            return (Criteria) this;
        }

        public Criteria andPtNoNotIn(List<Long> values) {
            addCriterion("PT_NO not in", values, "ptNo");
            return (Criteria) this;
        }

        public Criteria andPtNoBetween(Long value1, Long value2) {
            addCriterion("PT_NO between", value1, value2, "ptNo");
            return (Criteria) this;
        }

        public Criteria andPtNoNotBetween(Long value1, Long value2) {
            addCriterion("PT_NO not between", value1, value2, "ptNo");
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

        public Criteria andExpPtIsNull() {
            addCriterion("EXP_PT is null");
            return (Criteria) this;
        }

        public Criteria andExpPtIsNotNull() {
            addCriterion("EXP_PT is not null");
            return (Criteria) this;
        }

        public Criteria andExpPtEqualTo(Long value) {
            addCriterion("EXP_PT =", value, "expPt");
            return (Criteria) this;
        }

        public Criteria andExpPtNotEqualTo(Long value) {
            addCriterion("EXP_PT <>", value, "expPt");
            return (Criteria) this;
        }

        public Criteria andExpPtGreaterThan(Long value) {
            addCriterion("EXP_PT >", value, "expPt");
            return (Criteria) this;
        }

        public Criteria andExpPtGreaterThanOrEqualTo(Long value) {
            addCriterion("EXP_PT >=", value, "expPt");
            return (Criteria) this;
        }

        public Criteria andExpPtLessThan(Long value) {
            addCriterion("EXP_PT <", value, "expPt");
            return (Criteria) this;
        }

        public Criteria andExpPtLessThanOrEqualTo(Long value) {
            addCriterion("EXP_PT <=", value, "expPt");
            return (Criteria) this;
        }

        public Criteria andExpPtIn(List<Long> values) {
            addCriterion("EXP_PT in", values, "expPt");
            return (Criteria) this;
        }

        public Criteria andExpPtNotIn(List<Long> values) {
            addCriterion("EXP_PT not in", values, "expPt");
            return (Criteria) this;
        }

        public Criteria andExpPtBetween(Long value1, Long value2) {
            addCriterion("EXP_PT between", value1, value2, "expPt");
            return (Criteria) this;
        }

        public Criteria andExpPtNotBetween(Long value1, Long value2) {
            addCriterion("EXP_PT not between", value1, value2, "expPt");
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