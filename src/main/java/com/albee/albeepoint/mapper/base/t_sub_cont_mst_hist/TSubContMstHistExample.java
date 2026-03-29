package com.albee.albeepoint.mapper.base.t_sub_cont_mst_hist;

import java.time.LocalDateTime;
import java.util.ArrayList;
import java.util.List;

public class TSubContMstHistExample {
    protected String orderByClause;

    protected boolean distinct;

    protected List<Criteria> oredCriteria;

    public TSubContMstHistExample() {
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

        public Criteria andContSeqIsNull() {
            addCriterion("CONT_SEQ is null");
            return (Criteria) this;
        }

        public Criteria andContSeqIsNotNull() {
            addCriterion("CONT_SEQ is not null");
            return (Criteria) this;
        }

        public Criteria andContSeqEqualTo(Long value) {
            addCriterion("CONT_SEQ =", value, "contSeq");
            return (Criteria) this;
        }

        public Criteria andContSeqNotEqualTo(Long value) {
            addCriterion("CONT_SEQ <>", value, "contSeq");
            return (Criteria) this;
        }

        public Criteria andContSeqGreaterThan(Long value) {
            addCriterion("CONT_SEQ >", value, "contSeq");
            return (Criteria) this;
        }

        public Criteria andContSeqGreaterThanOrEqualTo(Long value) {
            addCriterion("CONT_SEQ >=", value, "contSeq");
            return (Criteria) this;
        }

        public Criteria andContSeqLessThan(Long value) {
            addCriterion("CONT_SEQ <", value, "contSeq");
            return (Criteria) this;
        }

        public Criteria andContSeqLessThanOrEqualTo(Long value) {
            addCriterion("CONT_SEQ <=", value, "contSeq");
            return (Criteria) this;
        }

        public Criteria andContSeqIn(List<Long> values) {
            addCriterion("CONT_SEQ in", values, "contSeq");
            return (Criteria) this;
        }

        public Criteria andContSeqNotIn(List<Long> values) {
            addCriterion("CONT_SEQ not in", values, "contSeq");
            return (Criteria) this;
        }

        public Criteria andContSeqBetween(Long value1, Long value2) {
            addCriterion("CONT_SEQ between", value1, value2, "contSeq");
            return (Criteria) this;
        }

        public Criteria andContSeqNotBetween(Long value1, Long value2) {
            addCriterion("CONT_SEQ not between", value1, value2, "contSeq");
            return (Criteria) this;
        }

        public Criteria andSubContHistSeqIsNull() {
            addCriterion("SUB_CONT_HIST_SEQ is null");
            return (Criteria) this;
        }

        public Criteria andSubContHistSeqIsNotNull() {
            addCriterion("SUB_CONT_HIST_SEQ is not null");
            return (Criteria) this;
        }

        public Criteria andSubContHistSeqEqualTo(Long value) {
            addCriterion("SUB_CONT_HIST_SEQ =", value, "subContHistSeq");
            return (Criteria) this;
        }

        public Criteria andSubContHistSeqNotEqualTo(Long value) {
            addCriterion("SUB_CONT_HIST_SEQ <>", value, "subContHistSeq");
            return (Criteria) this;
        }

        public Criteria andSubContHistSeqGreaterThan(Long value) {
            addCriterion("SUB_CONT_HIST_SEQ >", value, "subContHistSeq");
            return (Criteria) this;
        }

        public Criteria andSubContHistSeqGreaterThanOrEqualTo(Long value) {
            addCriterion("SUB_CONT_HIST_SEQ >=", value, "subContHistSeq");
            return (Criteria) this;
        }

        public Criteria andSubContHistSeqLessThan(Long value) {
            addCriterion("SUB_CONT_HIST_SEQ <", value, "subContHistSeq");
            return (Criteria) this;
        }

        public Criteria andSubContHistSeqLessThanOrEqualTo(Long value) {
            addCriterion("SUB_CONT_HIST_SEQ <=", value, "subContHistSeq");
            return (Criteria) this;
        }

        public Criteria andSubContHistSeqIn(List<Long> values) {
            addCriterion("SUB_CONT_HIST_SEQ in", values, "subContHistSeq");
            return (Criteria) this;
        }

        public Criteria andSubContHistSeqNotIn(List<Long> values) {
            addCriterion("SUB_CONT_HIST_SEQ not in", values, "subContHistSeq");
            return (Criteria) this;
        }

        public Criteria andSubContHistSeqBetween(Long value1, Long value2) {
            addCriterion("SUB_CONT_HIST_SEQ between", value1, value2, "subContHistSeq");
            return (Criteria) this;
        }

        public Criteria andSubContHistSeqNotBetween(Long value1, Long value2) {
            addCriterion("SUB_CONT_HIST_SEQ not between", value1, value2, "subContHistSeq");
            return (Criteria) this;
        }

        public Criteria andSubContHistDtIsNull() {
            addCriterion("SUB_CONT_HIST_DT is null");
            return (Criteria) this;
        }

        public Criteria andSubContHistDtIsNotNull() {
            addCriterion("SUB_CONT_HIST_DT is not null");
            return (Criteria) this;
        }

        public Criteria andSubContHistDtEqualTo(LocalDateTime value) {
            addCriterion("SUB_CONT_HIST_DT =", value, "subContHistDt");
            return (Criteria) this;
        }

        public Criteria andSubContHistDtNotEqualTo(LocalDateTime value) {
            addCriterion("SUB_CONT_HIST_DT <>", value, "subContHistDt");
            return (Criteria) this;
        }

        public Criteria andSubContHistDtGreaterThan(LocalDateTime value) {
            addCriterion("SUB_CONT_HIST_DT >", value, "subContHistDt");
            return (Criteria) this;
        }

        public Criteria andSubContHistDtGreaterThanOrEqualTo(LocalDateTime value) {
            addCriterion("SUB_CONT_HIST_DT >=", value, "subContHistDt");
            return (Criteria) this;
        }

        public Criteria andSubContHistDtLessThan(LocalDateTime value) {
            addCriterion("SUB_CONT_HIST_DT <", value, "subContHistDt");
            return (Criteria) this;
        }

        public Criteria andSubContHistDtLessThanOrEqualTo(LocalDateTime value) {
            addCriterion("SUB_CONT_HIST_DT <=", value, "subContHistDt");
            return (Criteria) this;
        }

        public Criteria andSubContHistDtIn(List<LocalDateTime> values) {
            addCriterion("SUB_CONT_HIST_DT in", values, "subContHistDt");
            return (Criteria) this;
        }

        public Criteria andSubContHistDtNotIn(List<LocalDateTime> values) {
            addCriterion("SUB_CONT_HIST_DT not in", values, "subContHistDt");
            return (Criteria) this;
        }

        public Criteria andSubContHistDtBetween(LocalDateTime value1, LocalDateTime value2) {
            addCriterion("SUB_CONT_HIST_DT between", value1, value2, "subContHistDt");
            return (Criteria) this;
        }

        public Criteria andSubContHistDtNotBetween(LocalDateTime value1, LocalDateTime value2) {
            addCriterion("SUB_CONT_HIST_DT not between", value1, value2, "subContHistDt");
            return (Criteria) this;
        }

        public Criteria andContNmIsNull() {
            addCriterion("CONT_NM is null");
            return (Criteria) this;
        }

        public Criteria andContNmIsNotNull() {
            addCriterion("CONT_NM is not null");
            return (Criteria) this;
        }

        public Criteria andContNmEqualTo(String value) {
            addCriterion("CONT_NM =", value, "contNm");
            return (Criteria) this;
        }

        public Criteria andContNmNotEqualTo(String value) {
            addCriterion("CONT_NM <>", value, "contNm");
            return (Criteria) this;
        }

        public Criteria andContNmGreaterThan(String value) {
            addCriterion("CONT_NM >", value, "contNm");
            return (Criteria) this;
        }

        public Criteria andContNmGreaterThanOrEqualTo(String value) {
            addCriterion("CONT_NM >=", value, "contNm");
            return (Criteria) this;
        }

        public Criteria andContNmLessThan(String value) {
            addCriterion("CONT_NM <", value, "contNm");
            return (Criteria) this;
        }

        public Criteria andContNmLessThanOrEqualTo(String value) {
            addCriterion("CONT_NM <=", value, "contNm");
            return (Criteria) this;
        }

        public Criteria andContNmLike(String value) {
            addCriterion("CONT_NM like", value, "contNm");
            return (Criteria) this;
        }

        public Criteria andContNmNotLike(String value) {
            addCriterion("CONT_NM not like", value, "contNm");
            return (Criteria) this;
        }

        public Criteria andContNmIn(List<String> values) {
            addCriterion("CONT_NM in", values, "contNm");
            return (Criteria) this;
        }

        public Criteria andContNmNotIn(List<String> values) {
            addCriterion("CONT_NM not in", values, "contNm");
            return (Criteria) this;
        }

        public Criteria andContNmBetween(String value1, String value2) {
            addCriterion("CONT_NM between", value1, value2, "contNm");
            return (Criteria) this;
        }

        public Criteria andContNmNotBetween(String value1, String value2) {
            addCriterion("CONT_NM not between", value1, value2, "contNm");
            return (Criteria) this;
        }

        public Criteria andStartDtIsNull() {
            addCriterion("START_DT is null");
            return (Criteria) this;
        }

        public Criteria andStartDtIsNotNull() {
            addCriterion("START_DT is not null");
            return (Criteria) this;
        }

        public Criteria andStartDtEqualTo(LocalDateTime value) {
            addCriterion("START_DT =", value, "startDt");
            return (Criteria) this;
        }

        public Criteria andStartDtNotEqualTo(LocalDateTime value) {
            addCriterion("START_DT <>", value, "startDt");
            return (Criteria) this;
        }

        public Criteria andStartDtGreaterThan(LocalDateTime value) {
            addCriterion("START_DT >", value, "startDt");
            return (Criteria) this;
        }

        public Criteria andStartDtGreaterThanOrEqualTo(LocalDateTime value) {
            addCriterion("START_DT >=", value, "startDt");
            return (Criteria) this;
        }

        public Criteria andStartDtLessThan(LocalDateTime value) {
            addCriterion("START_DT <", value, "startDt");
            return (Criteria) this;
        }

        public Criteria andStartDtLessThanOrEqualTo(LocalDateTime value) {
            addCriterion("START_DT <=", value, "startDt");
            return (Criteria) this;
        }

        public Criteria andStartDtIn(List<LocalDateTime> values) {
            addCriterion("START_DT in", values, "startDt");
            return (Criteria) this;
        }

        public Criteria andStartDtNotIn(List<LocalDateTime> values) {
            addCriterion("START_DT not in", values, "startDt");
            return (Criteria) this;
        }

        public Criteria andStartDtBetween(LocalDateTime value1, LocalDateTime value2) {
            addCriterion("START_DT between", value1, value2, "startDt");
            return (Criteria) this;
        }

        public Criteria andStartDtNotBetween(LocalDateTime value1, LocalDateTime value2) {
            addCriterion("START_DT not between", value1, value2, "startDt");
            return (Criteria) this;
        }

        public Criteria andEndDtIsNull() {
            addCriterion("END_DT is null");
            return (Criteria) this;
        }

        public Criteria andEndDtIsNotNull() {
            addCriterion("END_DT is not null");
            return (Criteria) this;
        }

        public Criteria andEndDtEqualTo(LocalDateTime value) {
            addCriterion("END_DT =", value, "endDt");
            return (Criteria) this;
        }

        public Criteria andEndDtNotEqualTo(LocalDateTime value) {
            addCriterion("END_DT <>", value, "endDt");
            return (Criteria) this;
        }

        public Criteria andEndDtGreaterThan(LocalDateTime value) {
            addCriterion("END_DT >", value, "endDt");
            return (Criteria) this;
        }

        public Criteria andEndDtGreaterThanOrEqualTo(LocalDateTime value) {
            addCriterion("END_DT >=", value, "endDt");
            return (Criteria) this;
        }

        public Criteria andEndDtLessThan(LocalDateTime value) {
            addCriterion("END_DT <", value, "endDt");
            return (Criteria) this;
        }

        public Criteria andEndDtLessThanOrEqualTo(LocalDateTime value) {
            addCriterion("END_DT <=", value, "endDt");
            return (Criteria) this;
        }

        public Criteria andEndDtIn(List<LocalDateTime> values) {
            addCriterion("END_DT in", values, "endDt");
            return (Criteria) this;
        }

        public Criteria andEndDtNotIn(List<LocalDateTime> values) {
            addCriterion("END_DT not in", values, "endDt");
            return (Criteria) this;
        }

        public Criteria andEndDtBetween(LocalDateTime value1, LocalDateTime value2) {
            addCriterion("END_DT between", value1, value2, "endDt");
            return (Criteria) this;
        }

        public Criteria andEndDtNotBetween(LocalDateTime value1, LocalDateTime value2) {
            addCriterion("END_DT not between", value1, value2, "endDt");
            return (Criteria) this;
        }

        public Criteria andIsuStartDtIsNull() {
            addCriterion("ISU_START_DT is null");
            return (Criteria) this;
        }

        public Criteria andIsuStartDtIsNotNull() {
            addCriterion("ISU_START_DT is not null");
            return (Criteria) this;
        }

        public Criteria andIsuStartDtEqualTo(LocalDateTime value) {
            addCriterion("ISU_START_DT =", value, "isuStartDt");
            return (Criteria) this;
        }

        public Criteria andIsuStartDtNotEqualTo(LocalDateTime value) {
            addCriterion("ISU_START_DT <>", value, "isuStartDt");
            return (Criteria) this;
        }

        public Criteria andIsuStartDtGreaterThan(LocalDateTime value) {
            addCriterion("ISU_START_DT >", value, "isuStartDt");
            return (Criteria) this;
        }

        public Criteria andIsuStartDtGreaterThanOrEqualTo(LocalDateTime value) {
            addCriterion("ISU_START_DT >=", value, "isuStartDt");
            return (Criteria) this;
        }

        public Criteria andIsuStartDtLessThan(LocalDateTime value) {
            addCriterion("ISU_START_DT <", value, "isuStartDt");
            return (Criteria) this;
        }

        public Criteria andIsuStartDtLessThanOrEqualTo(LocalDateTime value) {
            addCriterion("ISU_START_DT <=", value, "isuStartDt");
            return (Criteria) this;
        }

        public Criteria andIsuStartDtIn(List<LocalDateTime> values) {
            addCriterion("ISU_START_DT in", values, "isuStartDt");
            return (Criteria) this;
        }

        public Criteria andIsuStartDtNotIn(List<LocalDateTime> values) {
            addCriterion("ISU_START_DT not in", values, "isuStartDt");
            return (Criteria) this;
        }

        public Criteria andIsuStartDtBetween(LocalDateTime value1, LocalDateTime value2) {
            addCriterion("ISU_START_DT between", value1, value2, "isuStartDt");
            return (Criteria) this;
        }

        public Criteria andIsuStartDtNotBetween(LocalDateTime value1, LocalDateTime value2) {
            addCriterion("ISU_START_DT not between", value1, value2, "isuStartDt");
            return (Criteria) this;
        }

        public Criteria andIsuEndDtIsNull() {
            addCriterion("ISU_END_DT is null");
            return (Criteria) this;
        }

        public Criteria andIsuEndDtIsNotNull() {
            addCriterion("ISU_END_DT is not null");
            return (Criteria) this;
        }

        public Criteria andIsuEndDtEqualTo(LocalDateTime value) {
            addCriterion("ISU_END_DT =", value, "isuEndDt");
            return (Criteria) this;
        }

        public Criteria andIsuEndDtNotEqualTo(LocalDateTime value) {
            addCriterion("ISU_END_DT <>", value, "isuEndDt");
            return (Criteria) this;
        }

        public Criteria andIsuEndDtGreaterThan(LocalDateTime value) {
            addCriterion("ISU_END_DT >", value, "isuEndDt");
            return (Criteria) this;
        }

        public Criteria andIsuEndDtGreaterThanOrEqualTo(LocalDateTime value) {
            addCriterion("ISU_END_DT >=", value, "isuEndDt");
            return (Criteria) this;
        }

        public Criteria andIsuEndDtLessThan(LocalDateTime value) {
            addCriterion("ISU_END_DT <", value, "isuEndDt");
            return (Criteria) this;
        }

        public Criteria andIsuEndDtLessThanOrEqualTo(LocalDateTime value) {
            addCriterion("ISU_END_DT <=", value, "isuEndDt");
            return (Criteria) this;
        }

        public Criteria andIsuEndDtIn(List<LocalDateTime> values) {
            addCriterion("ISU_END_DT in", values, "isuEndDt");
            return (Criteria) this;
        }

        public Criteria andIsuEndDtNotIn(List<LocalDateTime> values) {
            addCriterion("ISU_END_DT not in", values, "isuEndDt");
            return (Criteria) this;
        }

        public Criteria andIsuEndDtBetween(LocalDateTime value1, LocalDateTime value2) {
            addCriterion("ISU_END_DT between", value1, value2, "isuEndDt");
            return (Criteria) this;
        }

        public Criteria andIsuEndDtNotBetween(LocalDateTime value1, LocalDateTime value2) {
            addCriterion("ISU_END_DT not between", value1, value2, "isuEndDt");
            return (Criteria) this;
        }

        public Criteria andIsuCancelStartDtIsNull() {
            addCriterion("ISU_CANCEL_START_DT is null");
            return (Criteria) this;
        }

        public Criteria andIsuCancelStartDtIsNotNull() {
            addCriterion("ISU_CANCEL_START_DT is not null");
            return (Criteria) this;
        }

        public Criteria andIsuCancelStartDtEqualTo(LocalDateTime value) {
            addCriterion("ISU_CANCEL_START_DT =", value, "isuCancelStartDt");
            return (Criteria) this;
        }

        public Criteria andIsuCancelStartDtNotEqualTo(LocalDateTime value) {
            addCriterion("ISU_CANCEL_START_DT <>", value, "isuCancelStartDt");
            return (Criteria) this;
        }

        public Criteria andIsuCancelStartDtGreaterThan(LocalDateTime value) {
            addCriterion("ISU_CANCEL_START_DT >", value, "isuCancelStartDt");
            return (Criteria) this;
        }

        public Criteria andIsuCancelStartDtGreaterThanOrEqualTo(LocalDateTime value) {
            addCriterion("ISU_CANCEL_START_DT >=", value, "isuCancelStartDt");
            return (Criteria) this;
        }

        public Criteria andIsuCancelStartDtLessThan(LocalDateTime value) {
            addCriterion("ISU_CANCEL_START_DT <", value, "isuCancelStartDt");
            return (Criteria) this;
        }

        public Criteria andIsuCancelStartDtLessThanOrEqualTo(LocalDateTime value) {
            addCriterion("ISU_CANCEL_START_DT <=", value, "isuCancelStartDt");
            return (Criteria) this;
        }

        public Criteria andIsuCancelStartDtIn(List<LocalDateTime> values) {
            addCriterion("ISU_CANCEL_START_DT in", values, "isuCancelStartDt");
            return (Criteria) this;
        }

        public Criteria andIsuCancelStartDtNotIn(List<LocalDateTime> values) {
            addCriterion("ISU_CANCEL_START_DT not in", values, "isuCancelStartDt");
            return (Criteria) this;
        }

        public Criteria andIsuCancelStartDtBetween(LocalDateTime value1, LocalDateTime value2) {
            addCriterion("ISU_CANCEL_START_DT between", value1, value2, "isuCancelStartDt");
            return (Criteria) this;
        }

        public Criteria andIsuCancelStartDtNotBetween(LocalDateTime value1, LocalDateTime value2) {
            addCriterion("ISU_CANCEL_START_DT not between", value1, value2, "isuCancelStartDt");
            return (Criteria) this;
        }

        public Criteria andIsuCancelEndDtIsNull() {
            addCriterion("ISU_CANCEL_END_DT is null");
            return (Criteria) this;
        }

        public Criteria andIsuCancelEndDtIsNotNull() {
            addCriterion("ISU_CANCEL_END_DT is not null");
            return (Criteria) this;
        }

        public Criteria andIsuCancelEndDtEqualTo(LocalDateTime value) {
            addCriterion("ISU_CANCEL_END_DT =", value, "isuCancelEndDt");
            return (Criteria) this;
        }

        public Criteria andIsuCancelEndDtNotEqualTo(LocalDateTime value) {
            addCriterion("ISU_CANCEL_END_DT <>", value, "isuCancelEndDt");
            return (Criteria) this;
        }

        public Criteria andIsuCancelEndDtGreaterThan(LocalDateTime value) {
            addCriterion("ISU_CANCEL_END_DT >", value, "isuCancelEndDt");
            return (Criteria) this;
        }

        public Criteria andIsuCancelEndDtGreaterThanOrEqualTo(LocalDateTime value) {
            addCriterion("ISU_CANCEL_END_DT >=", value, "isuCancelEndDt");
            return (Criteria) this;
        }

        public Criteria andIsuCancelEndDtLessThan(LocalDateTime value) {
            addCriterion("ISU_CANCEL_END_DT <", value, "isuCancelEndDt");
            return (Criteria) this;
        }

        public Criteria andIsuCancelEndDtLessThanOrEqualTo(LocalDateTime value) {
            addCriterion("ISU_CANCEL_END_DT <=", value, "isuCancelEndDt");
            return (Criteria) this;
        }

        public Criteria andIsuCancelEndDtIn(List<LocalDateTime> values) {
            addCriterion("ISU_CANCEL_END_DT in", values, "isuCancelEndDt");
            return (Criteria) this;
        }

        public Criteria andIsuCancelEndDtNotIn(List<LocalDateTime> values) {
            addCriterion("ISU_CANCEL_END_DT not in", values, "isuCancelEndDt");
            return (Criteria) this;
        }

        public Criteria andIsuCancelEndDtBetween(LocalDateTime value1, LocalDateTime value2) {
            addCriterion("ISU_CANCEL_END_DT between", value1, value2, "isuCancelEndDt");
            return (Criteria) this;
        }

        public Criteria andIsuCancelEndDtNotBetween(LocalDateTime value1, LocalDateTime value2) {
            addCriterion("ISU_CANCEL_END_DT not between", value1, value2, "isuCancelEndDt");
            return (Criteria) this;
        }

        public Criteria andUseStartDtIsNull() {
            addCriterion("USE_START_DT is null");
            return (Criteria) this;
        }

        public Criteria andUseStartDtIsNotNull() {
            addCriterion("USE_START_DT is not null");
            return (Criteria) this;
        }

        public Criteria andUseStartDtEqualTo(LocalDateTime value) {
            addCriterion("USE_START_DT =", value, "useStartDt");
            return (Criteria) this;
        }

        public Criteria andUseStartDtNotEqualTo(LocalDateTime value) {
            addCriterion("USE_START_DT <>", value, "useStartDt");
            return (Criteria) this;
        }

        public Criteria andUseStartDtGreaterThan(LocalDateTime value) {
            addCriterion("USE_START_DT >", value, "useStartDt");
            return (Criteria) this;
        }

        public Criteria andUseStartDtGreaterThanOrEqualTo(LocalDateTime value) {
            addCriterion("USE_START_DT >=", value, "useStartDt");
            return (Criteria) this;
        }

        public Criteria andUseStartDtLessThan(LocalDateTime value) {
            addCriterion("USE_START_DT <", value, "useStartDt");
            return (Criteria) this;
        }

        public Criteria andUseStartDtLessThanOrEqualTo(LocalDateTime value) {
            addCriterion("USE_START_DT <=", value, "useStartDt");
            return (Criteria) this;
        }

        public Criteria andUseStartDtIn(List<LocalDateTime> values) {
            addCriterion("USE_START_DT in", values, "useStartDt");
            return (Criteria) this;
        }

        public Criteria andUseStartDtNotIn(List<LocalDateTime> values) {
            addCriterion("USE_START_DT not in", values, "useStartDt");
            return (Criteria) this;
        }

        public Criteria andUseStartDtBetween(LocalDateTime value1, LocalDateTime value2) {
            addCriterion("USE_START_DT between", value1, value2, "useStartDt");
            return (Criteria) this;
        }

        public Criteria andUseStartDtNotBetween(LocalDateTime value1, LocalDateTime value2) {
            addCriterion("USE_START_DT not between", value1, value2, "useStartDt");
            return (Criteria) this;
        }

        public Criteria andUseEndDtIsNull() {
            addCriterion("USE_END_DT is null");
            return (Criteria) this;
        }

        public Criteria andUseEndDtIsNotNull() {
            addCriterion("USE_END_DT is not null");
            return (Criteria) this;
        }

        public Criteria andUseEndDtEqualTo(LocalDateTime value) {
            addCriterion("USE_END_DT =", value, "useEndDt");
            return (Criteria) this;
        }

        public Criteria andUseEndDtNotEqualTo(LocalDateTime value) {
            addCriterion("USE_END_DT <>", value, "useEndDt");
            return (Criteria) this;
        }

        public Criteria andUseEndDtGreaterThan(LocalDateTime value) {
            addCriterion("USE_END_DT >", value, "useEndDt");
            return (Criteria) this;
        }

        public Criteria andUseEndDtGreaterThanOrEqualTo(LocalDateTime value) {
            addCriterion("USE_END_DT >=", value, "useEndDt");
            return (Criteria) this;
        }

        public Criteria andUseEndDtLessThan(LocalDateTime value) {
            addCriterion("USE_END_DT <", value, "useEndDt");
            return (Criteria) this;
        }

        public Criteria andUseEndDtLessThanOrEqualTo(LocalDateTime value) {
            addCriterion("USE_END_DT <=", value, "useEndDt");
            return (Criteria) this;
        }

        public Criteria andUseEndDtIn(List<LocalDateTime> values) {
            addCriterion("USE_END_DT in", values, "useEndDt");
            return (Criteria) this;
        }

        public Criteria andUseEndDtNotIn(List<LocalDateTime> values) {
            addCriterion("USE_END_DT not in", values, "useEndDt");
            return (Criteria) this;
        }

        public Criteria andUseEndDtBetween(LocalDateTime value1, LocalDateTime value2) {
            addCriterion("USE_END_DT between", value1, value2, "useEndDt");
            return (Criteria) this;
        }

        public Criteria andUseEndDtNotBetween(LocalDateTime value1, LocalDateTime value2) {
            addCriterion("USE_END_DT not between", value1, value2, "useEndDt");
            return (Criteria) this;
        }

        public Criteria andContRegDtIsNull() {
            addCriterion("CONT_REG_DT is null");
            return (Criteria) this;
        }

        public Criteria andContRegDtIsNotNull() {
            addCriterion("CONT_REG_DT is not null");
            return (Criteria) this;
        }

        public Criteria andContRegDtEqualTo(LocalDateTime value) {
            addCriterion("CONT_REG_DT =", value, "contRegDt");
            return (Criteria) this;
        }

        public Criteria andContRegDtNotEqualTo(LocalDateTime value) {
            addCriterion("CONT_REG_DT <>", value, "contRegDt");
            return (Criteria) this;
        }

        public Criteria andContRegDtGreaterThan(LocalDateTime value) {
            addCriterion("CONT_REG_DT >", value, "contRegDt");
            return (Criteria) this;
        }

        public Criteria andContRegDtGreaterThanOrEqualTo(LocalDateTime value) {
            addCriterion("CONT_REG_DT >=", value, "contRegDt");
            return (Criteria) this;
        }

        public Criteria andContRegDtLessThan(LocalDateTime value) {
            addCriterion("CONT_REG_DT <", value, "contRegDt");
            return (Criteria) this;
        }

        public Criteria andContRegDtLessThanOrEqualTo(LocalDateTime value) {
            addCriterion("CONT_REG_DT <=", value, "contRegDt");
            return (Criteria) this;
        }

        public Criteria andContRegDtIn(List<LocalDateTime> values) {
            addCriterion("CONT_REG_DT in", values, "contRegDt");
            return (Criteria) this;
        }

        public Criteria andContRegDtNotIn(List<LocalDateTime> values) {
            addCriterion("CONT_REG_DT not in", values, "contRegDt");
            return (Criteria) this;
        }

        public Criteria andContRegDtBetween(LocalDateTime value1, LocalDateTime value2) {
            addCriterion("CONT_REG_DT between", value1, value2, "contRegDt");
            return (Criteria) this;
        }

        public Criteria andContRegDtNotBetween(LocalDateTime value1, LocalDateTime value2) {
            addCriterion("CONT_REG_DT not between", value1, value2, "contRegDt");
            return (Criteria) this;
        }

        public Criteria andUseStartDtCalcTypeCdIsNull() {
            addCriterion("USE_START_DT_CALC_TYPE_CD is null");
            return (Criteria) this;
        }

        public Criteria andUseStartDtCalcTypeCdIsNotNull() {
            addCriterion("USE_START_DT_CALC_TYPE_CD is not null");
            return (Criteria) this;
        }

        public Criteria andUseStartDtCalcTypeCdEqualTo(String value) {
            addCriterion("USE_START_DT_CALC_TYPE_CD =", value, "useStartDtCalcTypeCd");
            return (Criteria) this;
        }

        public Criteria andUseStartDtCalcTypeCdNotEqualTo(String value) {
            addCriterion("USE_START_DT_CALC_TYPE_CD <>", value, "useStartDtCalcTypeCd");
            return (Criteria) this;
        }

        public Criteria andUseStartDtCalcTypeCdGreaterThan(String value) {
            addCriterion("USE_START_DT_CALC_TYPE_CD >", value, "useStartDtCalcTypeCd");
            return (Criteria) this;
        }

        public Criteria andUseStartDtCalcTypeCdGreaterThanOrEqualTo(String value) {
            addCriterion("USE_START_DT_CALC_TYPE_CD >=", value, "useStartDtCalcTypeCd");
            return (Criteria) this;
        }

        public Criteria andUseStartDtCalcTypeCdLessThan(String value) {
            addCriterion("USE_START_DT_CALC_TYPE_CD <", value, "useStartDtCalcTypeCd");
            return (Criteria) this;
        }

        public Criteria andUseStartDtCalcTypeCdLessThanOrEqualTo(String value) {
            addCriterion("USE_START_DT_CALC_TYPE_CD <=", value, "useStartDtCalcTypeCd");
            return (Criteria) this;
        }

        public Criteria andUseStartDtCalcTypeCdLike(String value) {
            addCriterion("USE_START_DT_CALC_TYPE_CD like", value, "useStartDtCalcTypeCd");
            return (Criteria) this;
        }

        public Criteria andUseStartDtCalcTypeCdNotLike(String value) {
            addCriterion("USE_START_DT_CALC_TYPE_CD not like", value, "useStartDtCalcTypeCd");
            return (Criteria) this;
        }

        public Criteria andUseStartDtCalcTypeCdIn(List<String> values) {
            addCriterion("USE_START_DT_CALC_TYPE_CD in", values, "useStartDtCalcTypeCd");
            return (Criteria) this;
        }

        public Criteria andUseStartDtCalcTypeCdNotIn(List<String> values) {
            addCriterion("USE_START_DT_CALC_TYPE_CD not in", values, "useStartDtCalcTypeCd");
            return (Criteria) this;
        }

        public Criteria andUseStartDtCalcTypeCdBetween(String value1, String value2) {
            addCriterion("USE_START_DT_CALC_TYPE_CD between", value1, value2, "useStartDtCalcTypeCd");
            return (Criteria) this;
        }

        public Criteria andUseStartDtCalcTypeCdNotBetween(String value1, String value2) {
            addCriterion("USE_START_DT_CALC_TYPE_CD not between", value1, value2, "useStartDtCalcTypeCd");
            return (Criteria) this;
        }

        public Criteria andUseStartDtCalcValIsNull() {
            addCriterion("USE_START_DT_CALC_VAL is null");
            return (Criteria) this;
        }

        public Criteria andUseStartDtCalcValIsNotNull() {
            addCriterion("USE_START_DT_CALC_VAL is not null");
            return (Criteria) this;
        }

        public Criteria andUseStartDtCalcValEqualTo(Integer value) {
            addCriterion("USE_START_DT_CALC_VAL =", value, "useStartDtCalcVal");
            return (Criteria) this;
        }

        public Criteria andUseStartDtCalcValNotEqualTo(Integer value) {
            addCriterion("USE_START_DT_CALC_VAL <>", value, "useStartDtCalcVal");
            return (Criteria) this;
        }

        public Criteria andUseStartDtCalcValGreaterThan(Integer value) {
            addCriterion("USE_START_DT_CALC_VAL >", value, "useStartDtCalcVal");
            return (Criteria) this;
        }

        public Criteria andUseStartDtCalcValGreaterThanOrEqualTo(Integer value) {
            addCriterion("USE_START_DT_CALC_VAL >=", value, "useStartDtCalcVal");
            return (Criteria) this;
        }

        public Criteria andUseStartDtCalcValLessThan(Integer value) {
            addCriterion("USE_START_DT_CALC_VAL <", value, "useStartDtCalcVal");
            return (Criteria) this;
        }

        public Criteria andUseStartDtCalcValLessThanOrEqualTo(Integer value) {
            addCriterion("USE_START_DT_CALC_VAL <=", value, "useStartDtCalcVal");
            return (Criteria) this;
        }

        public Criteria andUseStartDtCalcValIn(List<Integer> values) {
            addCriterion("USE_START_DT_CALC_VAL in", values, "useStartDtCalcVal");
            return (Criteria) this;
        }

        public Criteria andUseStartDtCalcValNotIn(List<Integer> values) {
            addCriterion("USE_START_DT_CALC_VAL not in", values, "useStartDtCalcVal");
            return (Criteria) this;
        }

        public Criteria andUseStartDtCalcValBetween(Integer value1, Integer value2) {
            addCriterion("USE_START_DT_CALC_VAL between", value1, value2, "useStartDtCalcVal");
            return (Criteria) this;
        }

        public Criteria andUseStartDtCalcValNotBetween(Integer value1, Integer value2) {
            addCriterion("USE_START_DT_CALC_VAL not between", value1, value2, "useStartDtCalcVal");
            return (Criteria) this;
        }

        public Criteria andUsePeriodCalcTypeCdIsNull() {
            addCriterion("USE_PERIOD_CALC_TYPE_CD is null");
            return (Criteria) this;
        }

        public Criteria andUsePeriodCalcTypeCdIsNotNull() {
            addCriterion("USE_PERIOD_CALC_TYPE_CD is not null");
            return (Criteria) this;
        }

        public Criteria andUsePeriodCalcTypeCdEqualTo(String value) {
            addCriterion("USE_PERIOD_CALC_TYPE_CD =", value, "usePeriodCalcTypeCd");
            return (Criteria) this;
        }

        public Criteria andUsePeriodCalcTypeCdNotEqualTo(String value) {
            addCriterion("USE_PERIOD_CALC_TYPE_CD <>", value, "usePeriodCalcTypeCd");
            return (Criteria) this;
        }

        public Criteria andUsePeriodCalcTypeCdGreaterThan(String value) {
            addCriterion("USE_PERIOD_CALC_TYPE_CD >", value, "usePeriodCalcTypeCd");
            return (Criteria) this;
        }

        public Criteria andUsePeriodCalcTypeCdGreaterThanOrEqualTo(String value) {
            addCriterion("USE_PERIOD_CALC_TYPE_CD >=", value, "usePeriodCalcTypeCd");
            return (Criteria) this;
        }

        public Criteria andUsePeriodCalcTypeCdLessThan(String value) {
            addCriterion("USE_PERIOD_CALC_TYPE_CD <", value, "usePeriodCalcTypeCd");
            return (Criteria) this;
        }

        public Criteria andUsePeriodCalcTypeCdLessThanOrEqualTo(String value) {
            addCriterion("USE_PERIOD_CALC_TYPE_CD <=", value, "usePeriodCalcTypeCd");
            return (Criteria) this;
        }

        public Criteria andUsePeriodCalcTypeCdLike(String value) {
            addCriterion("USE_PERIOD_CALC_TYPE_CD like", value, "usePeriodCalcTypeCd");
            return (Criteria) this;
        }

        public Criteria andUsePeriodCalcTypeCdNotLike(String value) {
            addCriterion("USE_PERIOD_CALC_TYPE_CD not like", value, "usePeriodCalcTypeCd");
            return (Criteria) this;
        }

        public Criteria andUsePeriodCalcTypeCdIn(List<String> values) {
            addCriterion("USE_PERIOD_CALC_TYPE_CD in", values, "usePeriodCalcTypeCd");
            return (Criteria) this;
        }

        public Criteria andUsePeriodCalcTypeCdNotIn(List<String> values) {
            addCriterion("USE_PERIOD_CALC_TYPE_CD not in", values, "usePeriodCalcTypeCd");
            return (Criteria) this;
        }

        public Criteria andUsePeriodCalcTypeCdBetween(String value1, String value2) {
            addCriterion("USE_PERIOD_CALC_TYPE_CD between", value1, value2, "usePeriodCalcTypeCd");
            return (Criteria) this;
        }

        public Criteria andUsePeriodCalcTypeCdNotBetween(String value1, String value2) {
            addCriterion("USE_PERIOD_CALC_TYPE_CD not between", value1, value2, "usePeriodCalcTypeCd");
            return (Criteria) this;
        }

        public Criteria andUsePeriodCalcValIsNull() {
            addCriterion("USE_PERIOD_CALC_VAL is null");
            return (Criteria) this;
        }

        public Criteria andUsePeriodCalcValIsNotNull() {
            addCriterion("USE_PERIOD_CALC_VAL is not null");
            return (Criteria) this;
        }

        public Criteria andUsePeriodCalcValEqualTo(Integer value) {
            addCriterion("USE_PERIOD_CALC_VAL =", value, "usePeriodCalcVal");
            return (Criteria) this;
        }

        public Criteria andUsePeriodCalcValNotEqualTo(Integer value) {
            addCriterion("USE_PERIOD_CALC_VAL <>", value, "usePeriodCalcVal");
            return (Criteria) this;
        }

        public Criteria andUsePeriodCalcValGreaterThan(Integer value) {
            addCriterion("USE_PERIOD_CALC_VAL >", value, "usePeriodCalcVal");
            return (Criteria) this;
        }

        public Criteria andUsePeriodCalcValGreaterThanOrEqualTo(Integer value) {
            addCriterion("USE_PERIOD_CALC_VAL >=", value, "usePeriodCalcVal");
            return (Criteria) this;
        }

        public Criteria andUsePeriodCalcValLessThan(Integer value) {
            addCriterion("USE_PERIOD_CALC_VAL <", value, "usePeriodCalcVal");
            return (Criteria) this;
        }

        public Criteria andUsePeriodCalcValLessThanOrEqualTo(Integer value) {
            addCriterion("USE_PERIOD_CALC_VAL <=", value, "usePeriodCalcVal");
            return (Criteria) this;
        }

        public Criteria andUsePeriodCalcValIn(List<Integer> values) {
            addCriterion("USE_PERIOD_CALC_VAL in", values, "usePeriodCalcVal");
            return (Criteria) this;
        }

        public Criteria andUsePeriodCalcValNotIn(List<Integer> values) {
            addCriterion("USE_PERIOD_CALC_VAL not in", values, "usePeriodCalcVal");
            return (Criteria) this;
        }

        public Criteria andUsePeriodCalcValBetween(Integer value1, Integer value2) {
            addCriterion("USE_PERIOD_CALC_VAL between", value1, value2, "usePeriodCalcVal");
            return (Criteria) this;
        }

        public Criteria andUsePeriodCalcValNotBetween(Integer value1, Integer value2) {
            addCriterion("USE_PERIOD_CALC_VAL not between", value1, value2, "usePeriodCalcVal");
            return (Criteria) this;
        }

        public Criteria andContStsCdIsNull() {
            addCriterion("CONT_STS_CD is null");
            return (Criteria) this;
        }

        public Criteria andContStsCdIsNotNull() {
            addCriterion("CONT_STS_CD is not null");
            return (Criteria) this;
        }

        public Criteria andContStsCdEqualTo(String value) {
            addCriterion("CONT_STS_CD =", value, "contStsCd");
            return (Criteria) this;
        }

        public Criteria andContStsCdNotEqualTo(String value) {
            addCriterion("CONT_STS_CD <>", value, "contStsCd");
            return (Criteria) this;
        }

        public Criteria andContStsCdGreaterThan(String value) {
            addCriterion("CONT_STS_CD >", value, "contStsCd");
            return (Criteria) this;
        }

        public Criteria andContStsCdGreaterThanOrEqualTo(String value) {
            addCriterion("CONT_STS_CD >=", value, "contStsCd");
            return (Criteria) this;
        }

        public Criteria andContStsCdLessThan(String value) {
            addCriterion("CONT_STS_CD <", value, "contStsCd");
            return (Criteria) this;
        }

        public Criteria andContStsCdLessThanOrEqualTo(String value) {
            addCriterion("CONT_STS_CD <=", value, "contStsCd");
            return (Criteria) this;
        }

        public Criteria andContStsCdLike(String value) {
            addCriterion("CONT_STS_CD like", value, "contStsCd");
            return (Criteria) this;
        }

        public Criteria andContStsCdNotLike(String value) {
            addCriterion("CONT_STS_CD not like", value, "contStsCd");
            return (Criteria) this;
        }

        public Criteria andContStsCdIn(List<String> values) {
            addCriterion("CONT_STS_CD in", values, "contStsCd");
            return (Criteria) this;
        }

        public Criteria andContStsCdNotIn(List<String> values) {
            addCriterion("CONT_STS_CD not in", values, "contStsCd");
            return (Criteria) this;
        }

        public Criteria andContStsCdBetween(String value1, String value2) {
            addCriterion("CONT_STS_CD between", value1, value2, "contStsCd");
            return (Criteria) this;
        }

        public Criteria andContStsCdNotBetween(String value1, String value2) {
            addCriterion("CONT_STS_CD not between", value1, value2, "contStsCd");
            return (Criteria) this;
        }

        public Criteria andMixUseYnIsNull() {
            addCriterion("MIX_USE_YN is null");
            return (Criteria) this;
        }

        public Criteria andMixUseYnIsNotNull() {
            addCriterion("MIX_USE_YN is not null");
            return (Criteria) this;
        }

        public Criteria andMixUseYnEqualTo(String value) {
            addCriterion("MIX_USE_YN =", value, "mixUseYn");
            return (Criteria) this;
        }

        public Criteria andMixUseYnNotEqualTo(String value) {
            addCriterion("MIX_USE_YN <>", value, "mixUseYn");
            return (Criteria) this;
        }

        public Criteria andMixUseYnGreaterThan(String value) {
            addCriterion("MIX_USE_YN >", value, "mixUseYn");
            return (Criteria) this;
        }

        public Criteria andMixUseYnGreaterThanOrEqualTo(String value) {
            addCriterion("MIX_USE_YN >=", value, "mixUseYn");
            return (Criteria) this;
        }

        public Criteria andMixUseYnLessThan(String value) {
            addCriterion("MIX_USE_YN <", value, "mixUseYn");
            return (Criteria) this;
        }

        public Criteria andMixUseYnLessThanOrEqualTo(String value) {
            addCriterion("MIX_USE_YN <=", value, "mixUseYn");
            return (Criteria) this;
        }

        public Criteria andMixUseYnLike(String value) {
            addCriterion("MIX_USE_YN like", value, "mixUseYn");
            return (Criteria) this;
        }

        public Criteria andMixUseYnNotLike(String value) {
            addCriterion("MIX_USE_YN not like", value, "mixUseYn");
            return (Criteria) this;
        }

        public Criteria andMixUseYnIn(List<String> values) {
            addCriterion("MIX_USE_YN in", values, "mixUseYn");
            return (Criteria) this;
        }

        public Criteria andMixUseYnNotIn(List<String> values) {
            addCriterion("MIX_USE_YN not in", values, "mixUseYn");
            return (Criteria) this;
        }

        public Criteria andMixUseYnBetween(String value1, String value2) {
            addCriterion("MIX_USE_YN between", value1, value2, "mixUseYn");
            return (Criteria) this;
        }

        public Criteria andMixUseYnNotBetween(String value1, String value2) {
            addCriterion("MIX_USE_YN not between", value1, value2, "mixUseYn");
            return (Criteria) this;
        }

        public Criteria andIsuPeriodLimitTypeCdIsNull() {
            addCriterion("ISU_PERIOD_LIMIT_TYPE_CD is null");
            return (Criteria) this;
        }

        public Criteria andIsuPeriodLimitTypeCdIsNotNull() {
            addCriterion("ISU_PERIOD_LIMIT_TYPE_CD is not null");
            return (Criteria) this;
        }

        public Criteria andIsuPeriodLimitTypeCdEqualTo(String value) {
            addCriterion("ISU_PERIOD_LIMIT_TYPE_CD =", value, "isuPeriodLimitTypeCd");
            return (Criteria) this;
        }

        public Criteria andIsuPeriodLimitTypeCdNotEqualTo(String value) {
            addCriterion("ISU_PERIOD_LIMIT_TYPE_CD <>", value, "isuPeriodLimitTypeCd");
            return (Criteria) this;
        }

        public Criteria andIsuPeriodLimitTypeCdGreaterThan(String value) {
            addCriterion("ISU_PERIOD_LIMIT_TYPE_CD >", value, "isuPeriodLimitTypeCd");
            return (Criteria) this;
        }

        public Criteria andIsuPeriodLimitTypeCdGreaterThanOrEqualTo(String value) {
            addCriterion("ISU_PERIOD_LIMIT_TYPE_CD >=", value, "isuPeriodLimitTypeCd");
            return (Criteria) this;
        }

        public Criteria andIsuPeriodLimitTypeCdLessThan(String value) {
            addCriterion("ISU_PERIOD_LIMIT_TYPE_CD <", value, "isuPeriodLimitTypeCd");
            return (Criteria) this;
        }

        public Criteria andIsuPeriodLimitTypeCdLessThanOrEqualTo(String value) {
            addCriterion("ISU_PERIOD_LIMIT_TYPE_CD <=", value, "isuPeriodLimitTypeCd");
            return (Criteria) this;
        }

        public Criteria andIsuPeriodLimitTypeCdLike(String value) {
            addCriterion("ISU_PERIOD_LIMIT_TYPE_CD like", value, "isuPeriodLimitTypeCd");
            return (Criteria) this;
        }

        public Criteria andIsuPeriodLimitTypeCdNotLike(String value) {
            addCriterion("ISU_PERIOD_LIMIT_TYPE_CD not like", value, "isuPeriodLimitTypeCd");
            return (Criteria) this;
        }

        public Criteria andIsuPeriodLimitTypeCdIn(List<String> values) {
            addCriterion("ISU_PERIOD_LIMIT_TYPE_CD in", values, "isuPeriodLimitTypeCd");
            return (Criteria) this;
        }

        public Criteria andIsuPeriodLimitTypeCdNotIn(List<String> values) {
            addCriterion("ISU_PERIOD_LIMIT_TYPE_CD not in", values, "isuPeriodLimitTypeCd");
            return (Criteria) this;
        }

        public Criteria andIsuPeriodLimitTypeCdBetween(String value1, String value2) {
            addCriterion("ISU_PERIOD_LIMIT_TYPE_CD between", value1, value2, "isuPeriodLimitTypeCd");
            return (Criteria) this;
        }

        public Criteria andIsuPeriodLimitTypeCdNotBetween(String value1, String value2) {
            addCriterion("ISU_PERIOD_LIMIT_TYPE_CD not between", value1, value2, "isuPeriodLimitTypeCd");
            return (Criteria) this;
        }

        public Criteria andIsuPeriodMaxPtIsNull() {
            addCriterion("ISU_PERIOD_MAX_PT is null");
            return (Criteria) this;
        }

        public Criteria andIsuPeriodMaxPtIsNotNull() {
            addCriterion("ISU_PERIOD_MAX_PT is not null");
            return (Criteria) this;
        }

        public Criteria andIsuPeriodMaxPtEqualTo(Long value) {
            addCriterion("ISU_PERIOD_MAX_PT =", value, "isuPeriodMaxPt");
            return (Criteria) this;
        }

        public Criteria andIsuPeriodMaxPtNotEqualTo(Long value) {
            addCriterion("ISU_PERIOD_MAX_PT <>", value, "isuPeriodMaxPt");
            return (Criteria) this;
        }

        public Criteria andIsuPeriodMaxPtGreaterThan(Long value) {
            addCriterion("ISU_PERIOD_MAX_PT >", value, "isuPeriodMaxPt");
            return (Criteria) this;
        }

        public Criteria andIsuPeriodMaxPtGreaterThanOrEqualTo(Long value) {
            addCriterion("ISU_PERIOD_MAX_PT >=", value, "isuPeriodMaxPt");
            return (Criteria) this;
        }

        public Criteria andIsuPeriodMaxPtLessThan(Long value) {
            addCriterion("ISU_PERIOD_MAX_PT <", value, "isuPeriodMaxPt");
            return (Criteria) this;
        }

        public Criteria andIsuPeriodMaxPtLessThanOrEqualTo(Long value) {
            addCriterion("ISU_PERIOD_MAX_PT <=", value, "isuPeriodMaxPt");
            return (Criteria) this;
        }

        public Criteria andIsuPeriodMaxPtIn(List<Long> values) {
            addCriterion("ISU_PERIOD_MAX_PT in", values, "isuPeriodMaxPt");
            return (Criteria) this;
        }

        public Criteria andIsuPeriodMaxPtNotIn(List<Long> values) {
            addCriterion("ISU_PERIOD_MAX_PT not in", values, "isuPeriodMaxPt");
            return (Criteria) this;
        }

        public Criteria andIsuPeriodMaxPtBetween(Long value1, Long value2) {
            addCriterion("ISU_PERIOD_MAX_PT between", value1, value2, "isuPeriodMaxPt");
            return (Criteria) this;
        }

        public Criteria andIsuPeriodMaxPtNotBetween(Long value1, Long value2) {
            addCriterion("ISU_PERIOD_MAX_PT not between", value1, value2, "isuPeriodMaxPt");
            return (Criteria) this;
        }

        public Criteria andIsuPeriodMaxCntIsNull() {
            addCriterion("ISU_PERIOD_MAX_CNT is null");
            return (Criteria) this;
        }

        public Criteria andIsuPeriodMaxCntIsNotNull() {
            addCriterion("ISU_PERIOD_MAX_CNT is not null");
            return (Criteria) this;
        }

        public Criteria andIsuPeriodMaxCntEqualTo(Integer value) {
            addCriterion("ISU_PERIOD_MAX_CNT =", value, "isuPeriodMaxCnt");
            return (Criteria) this;
        }

        public Criteria andIsuPeriodMaxCntNotEqualTo(Integer value) {
            addCriterion("ISU_PERIOD_MAX_CNT <>", value, "isuPeriodMaxCnt");
            return (Criteria) this;
        }

        public Criteria andIsuPeriodMaxCntGreaterThan(Integer value) {
            addCriterion("ISU_PERIOD_MAX_CNT >", value, "isuPeriodMaxCnt");
            return (Criteria) this;
        }

        public Criteria andIsuPeriodMaxCntGreaterThanOrEqualTo(Integer value) {
            addCriterion("ISU_PERIOD_MAX_CNT >=", value, "isuPeriodMaxCnt");
            return (Criteria) this;
        }

        public Criteria andIsuPeriodMaxCntLessThan(Integer value) {
            addCriterion("ISU_PERIOD_MAX_CNT <", value, "isuPeriodMaxCnt");
            return (Criteria) this;
        }

        public Criteria andIsuPeriodMaxCntLessThanOrEqualTo(Integer value) {
            addCriterion("ISU_PERIOD_MAX_CNT <=", value, "isuPeriodMaxCnt");
            return (Criteria) this;
        }

        public Criteria andIsuPeriodMaxCntIn(List<Integer> values) {
            addCriterion("ISU_PERIOD_MAX_CNT in", values, "isuPeriodMaxCnt");
            return (Criteria) this;
        }

        public Criteria andIsuPeriodMaxCntNotIn(List<Integer> values) {
            addCriterion("ISU_PERIOD_MAX_CNT not in", values, "isuPeriodMaxCnt");
            return (Criteria) this;
        }

        public Criteria andIsuPeriodMaxCntBetween(Integer value1, Integer value2) {
            addCriterion("ISU_PERIOD_MAX_CNT between", value1, value2, "isuPeriodMaxCnt");
            return (Criteria) this;
        }

        public Criteria andIsuPeriodMaxCntNotBetween(Integer value1, Integer value2) {
            addCriterion("ISU_PERIOD_MAX_CNT not between", value1, value2, "isuPeriodMaxCnt");
            return (Criteria) this;
        }

        public Criteria andOnceIsuLimitTypeCdIsNull() {
            addCriterion("ONCE_ISU_LIMIT_TYPE_CD is null");
            return (Criteria) this;
        }

        public Criteria andOnceIsuLimitTypeCdIsNotNull() {
            addCriterion("ONCE_ISU_LIMIT_TYPE_CD is not null");
            return (Criteria) this;
        }

        public Criteria andOnceIsuLimitTypeCdEqualTo(String value) {
            addCriterion("ONCE_ISU_LIMIT_TYPE_CD =", value, "onceIsuLimitTypeCd");
            return (Criteria) this;
        }

        public Criteria andOnceIsuLimitTypeCdNotEqualTo(String value) {
            addCriterion("ONCE_ISU_LIMIT_TYPE_CD <>", value, "onceIsuLimitTypeCd");
            return (Criteria) this;
        }

        public Criteria andOnceIsuLimitTypeCdGreaterThan(String value) {
            addCriterion("ONCE_ISU_LIMIT_TYPE_CD >", value, "onceIsuLimitTypeCd");
            return (Criteria) this;
        }

        public Criteria andOnceIsuLimitTypeCdGreaterThanOrEqualTo(String value) {
            addCriterion("ONCE_ISU_LIMIT_TYPE_CD >=", value, "onceIsuLimitTypeCd");
            return (Criteria) this;
        }

        public Criteria andOnceIsuLimitTypeCdLessThan(String value) {
            addCriterion("ONCE_ISU_LIMIT_TYPE_CD <", value, "onceIsuLimitTypeCd");
            return (Criteria) this;
        }

        public Criteria andOnceIsuLimitTypeCdLessThanOrEqualTo(String value) {
            addCriterion("ONCE_ISU_LIMIT_TYPE_CD <=", value, "onceIsuLimitTypeCd");
            return (Criteria) this;
        }

        public Criteria andOnceIsuLimitTypeCdLike(String value) {
            addCriterion("ONCE_ISU_LIMIT_TYPE_CD like", value, "onceIsuLimitTypeCd");
            return (Criteria) this;
        }

        public Criteria andOnceIsuLimitTypeCdNotLike(String value) {
            addCriterion("ONCE_ISU_LIMIT_TYPE_CD not like", value, "onceIsuLimitTypeCd");
            return (Criteria) this;
        }

        public Criteria andOnceIsuLimitTypeCdIn(List<String> values) {
            addCriterion("ONCE_ISU_LIMIT_TYPE_CD in", values, "onceIsuLimitTypeCd");
            return (Criteria) this;
        }

        public Criteria andOnceIsuLimitTypeCdNotIn(List<String> values) {
            addCriterion("ONCE_ISU_LIMIT_TYPE_CD not in", values, "onceIsuLimitTypeCd");
            return (Criteria) this;
        }

        public Criteria andOnceIsuLimitTypeCdBetween(String value1, String value2) {
            addCriterion("ONCE_ISU_LIMIT_TYPE_CD between", value1, value2, "onceIsuLimitTypeCd");
            return (Criteria) this;
        }

        public Criteria andOnceIsuLimitTypeCdNotBetween(String value1, String value2) {
            addCriterion("ONCE_ISU_LIMIT_TYPE_CD not between", value1, value2, "onceIsuLimitTypeCd");
            return (Criteria) this;
        }

        public Criteria andOnceIsuFixPtIsNull() {
            addCriterion("ONCE_ISU_FIX_PT is null");
            return (Criteria) this;
        }

        public Criteria andOnceIsuFixPtIsNotNull() {
            addCriterion("ONCE_ISU_FIX_PT is not null");
            return (Criteria) this;
        }

        public Criteria andOnceIsuFixPtEqualTo(Long value) {
            addCriterion("ONCE_ISU_FIX_PT =", value, "onceIsuFixPt");
            return (Criteria) this;
        }

        public Criteria andOnceIsuFixPtNotEqualTo(Long value) {
            addCriterion("ONCE_ISU_FIX_PT <>", value, "onceIsuFixPt");
            return (Criteria) this;
        }

        public Criteria andOnceIsuFixPtGreaterThan(Long value) {
            addCriterion("ONCE_ISU_FIX_PT >", value, "onceIsuFixPt");
            return (Criteria) this;
        }

        public Criteria andOnceIsuFixPtGreaterThanOrEqualTo(Long value) {
            addCriterion("ONCE_ISU_FIX_PT >=", value, "onceIsuFixPt");
            return (Criteria) this;
        }

        public Criteria andOnceIsuFixPtLessThan(Long value) {
            addCriterion("ONCE_ISU_FIX_PT <", value, "onceIsuFixPt");
            return (Criteria) this;
        }

        public Criteria andOnceIsuFixPtLessThanOrEqualTo(Long value) {
            addCriterion("ONCE_ISU_FIX_PT <=", value, "onceIsuFixPt");
            return (Criteria) this;
        }

        public Criteria andOnceIsuFixPtIn(List<Long> values) {
            addCriterion("ONCE_ISU_FIX_PT in", values, "onceIsuFixPt");
            return (Criteria) this;
        }

        public Criteria andOnceIsuFixPtNotIn(List<Long> values) {
            addCriterion("ONCE_ISU_FIX_PT not in", values, "onceIsuFixPt");
            return (Criteria) this;
        }

        public Criteria andOnceIsuFixPtBetween(Long value1, Long value2) {
            addCriterion("ONCE_ISU_FIX_PT between", value1, value2, "onceIsuFixPt");
            return (Criteria) this;
        }

        public Criteria andOnceIsuFixPtNotBetween(Long value1, Long value2) {
            addCriterion("ONCE_ISU_FIX_PT not between", value1, value2, "onceIsuFixPt");
            return (Criteria) this;
        }

        public Criteria andOnceIsuPurchaseRateIsNull() {
            addCriterion("ONCE_ISU_PURCHASE_RATE is null");
            return (Criteria) this;
        }

        public Criteria andOnceIsuPurchaseRateIsNotNull() {
            addCriterion("ONCE_ISU_PURCHASE_RATE is not null");
            return (Criteria) this;
        }

        public Criteria andOnceIsuPurchaseRateEqualTo(Double value) {
            addCriterion("ONCE_ISU_PURCHASE_RATE =", value, "onceIsuPurchaseRate");
            return (Criteria) this;
        }

        public Criteria andOnceIsuPurchaseRateNotEqualTo(Double value) {
            addCriterion("ONCE_ISU_PURCHASE_RATE <>", value, "onceIsuPurchaseRate");
            return (Criteria) this;
        }

        public Criteria andOnceIsuPurchaseRateGreaterThan(Double value) {
            addCriterion("ONCE_ISU_PURCHASE_RATE >", value, "onceIsuPurchaseRate");
            return (Criteria) this;
        }

        public Criteria andOnceIsuPurchaseRateGreaterThanOrEqualTo(Double value) {
            addCriterion("ONCE_ISU_PURCHASE_RATE >=", value, "onceIsuPurchaseRate");
            return (Criteria) this;
        }

        public Criteria andOnceIsuPurchaseRateLessThan(Double value) {
            addCriterion("ONCE_ISU_PURCHASE_RATE <", value, "onceIsuPurchaseRate");
            return (Criteria) this;
        }

        public Criteria andOnceIsuPurchaseRateLessThanOrEqualTo(Double value) {
            addCriterion("ONCE_ISU_PURCHASE_RATE <=", value, "onceIsuPurchaseRate");
            return (Criteria) this;
        }

        public Criteria andOnceIsuPurchaseRateIn(List<Double> values) {
            addCriterion("ONCE_ISU_PURCHASE_RATE in", values, "onceIsuPurchaseRate");
            return (Criteria) this;
        }

        public Criteria andOnceIsuPurchaseRateNotIn(List<Double> values) {
            addCriterion("ONCE_ISU_PURCHASE_RATE not in", values, "onceIsuPurchaseRate");
            return (Criteria) this;
        }

        public Criteria andOnceIsuPurchaseRateBetween(Double value1, Double value2) {
            addCriterion("ONCE_ISU_PURCHASE_RATE between", value1, value2, "onceIsuPurchaseRate");
            return (Criteria) this;
        }

        public Criteria andOnceIsuPurchaseRateNotBetween(Double value1, Double value2) {
            addCriterion("ONCE_ISU_PURCHASE_RATE not between", value1, value2, "onceIsuPurchaseRate");
            return (Criteria) this;
        }

        public Criteria andOnceIsuMinPtIsNull() {
            addCriterion("ONCE_ISU_MIN_PT is null");
            return (Criteria) this;
        }

        public Criteria andOnceIsuMinPtIsNotNull() {
            addCriterion("ONCE_ISU_MIN_PT is not null");
            return (Criteria) this;
        }

        public Criteria andOnceIsuMinPtEqualTo(Long value) {
            addCriterion("ONCE_ISU_MIN_PT =", value, "onceIsuMinPt");
            return (Criteria) this;
        }

        public Criteria andOnceIsuMinPtNotEqualTo(Long value) {
            addCriterion("ONCE_ISU_MIN_PT <>", value, "onceIsuMinPt");
            return (Criteria) this;
        }

        public Criteria andOnceIsuMinPtGreaterThan(Long value) {
            addCriterion("ONCE_ISU_MIN_PT >", value, "onceIsuMinPt");
            return (Criteria) this;
        }

        public Criteria andOnceIsuMinPtGreaterThanOrEqualTo(Long value) {
            addCriterion("ONCE_ISU_MIN_PT >=", value, "onceIsuMinPt");
            return (Criteria) this;
        }

        public Criteria andOnceIsuMinPtLessThan(Long value) {
            addCriterion("ONCE_ISU_MIN_PT <", value, "onceIsuMinPt");
            return (Criteria) this;
        }

        public Criteria andOnceIsuMinPtLessThanOrEqualTo(Long value) {
            addCriterion("ONCE_ISU_MIN_PT <=", value, "onceIsuMinPt");
            return (Criteria) this;
        }

        public Criteria andOnceIsuMinPtIn(List<Long> values) {
            addCriterion("ONCE_ISU_MIN_PT in", values, "onceIsuMinPt");
            return (Criteria) this;
        }

        public Criteria andOnceIsuMinPtNotIn(List<Long> values) {
            addCriterion("ONCE_ISU_MIN_PT not in", values, "onceIsuMinPt");
            return (Criteria) this;
        }

        public Criteria andOnceIsuMinPtBetween(Long value1, Long value2) {
            addCriterion("ONCE_ISU_MIN_PT between", value1, value2, "onceIsuMinPt");
            return (Criteria) this;
        }

        public Criteria andOnceIsuMinPtNotBetween(Long value1, Long value2) {
            addCriterion("ONCE_ISU_MIN_PT not between", value1, value2, "onceIsuMinPt");
            return (Criteria) this;
        }

        public Criteria andOnceIsuMaxPtIsNull() {
            addCriterion("ONCE_ISU_MAX_PT is null");
            return (Criteria) this;
        }

        public Criteria andOnceIsuMaxPtIsNotNull() {
            addCriterion("ONCE_ISU_MAX_PT is not null");
            return (Criteria) this;
        }

        public Criteria andOnceIsuMaxPtEqualTo(Long value) {
            addCriterion("ONCE_ISU_MAX_PT =", value, "onceIsuMaxPt");
            return (Criteria) this;
        }

        public Criteria andOnceIsuMaxPtNotEqualTo(Long value) {
            addCriterion("ONCE_ISU_MAX_PT <>", value, "onceIsuMaxPt");
            return (Criteria) this;
        }

        public Criteria andOnceIsuMaxPtGreaterThan(Long value) {
            addCriterion("ONCE_ISU_MAX_PT >", value, "onceIsuMaxPt");
            return (Criteria) this;
        }

        public Criteria andOnceIsuMaxPtGreaterThanOrEqualTo(Long value) {
            addCriterion("ONCE_ISU_MAX_PT >=", value, "onceIsuMaxPt");
            return (Criteria) this;
        }

        public Criteria andOnceIsuMaxPtLessThan(Long value) {
            addCriterion("ONCE_ISU_MAX_PT <", value, "onceIsuMaxPt");
            return (Criteria) this;
        }

        public Criteria andOnceIsuMaxPtLessThanOrEqualTo(Long value) {
            addCriterion("ONCE_ISU_MAX_PT <=", value, "onceIsuMaxPt");
            return (Criteria) this;
        }

        public Criteria andOnceIsuMaxPtIn(List<Long> values) {
            addCriterion("ONCE_ISU_MAX_PT in", values, "onceIsuMaxPt");
            return (Criteria) this;
        }

        public Criteria andOnceIsuMaxPtNotIn(List<Long> values) {
            addCriterion("ONCE_ISU_MAX_PT not in", values, "onceIsuMaxPt");
            return (Criteria) this;
        }

        public Criteria andOnceIsuMaxPtBetween(Long value1, Long value2) {
            addCriterion("ONCE_ISU_MAX_PT between", value1, value2, "onceIsuMaxPt");
            return (Criteria) this;
        }

        public Criteria andOnceIsuMaxPtNotBetween(Long value1, Long value2) {
            addCriterion("ONCE_ISU_MAX_PT not between", value1, value2, "onceIsuMaxPt");
            return (Criteria) this;
        }

        public Criteria andUsePeriodLimitTypeCdIsNull() {
            addCriterion("USE_PERIOD_LIMIT_TYPE_CD is null");
            return (Criteria) this;
        }

        public Criteria andUsePeriodLimitTypeCdIsNotNull() {
            addCriterion("USE_PERIOD_LIMIT_TYPE_CD is not null");
            return (Criteria) this;
        }

        public Criteria andUsePeriodLimitTypeCdEqualTo(String value) {
            addCriterion("USE_PERIOD_LIMIT_TYPE_CD =", value, "usePeriodLimitTypeCd");
            return (Criteria) this;
        }

        public Criteria andUsePeriodLimitTypeCdNotEqualTo(String value) {
            addCriterion("USE_PERIOD_LIMIT_TYPE_CD <>", value, "usePeriodLimitTypeCd");
            return (Criteria) this;
        }

        public Criteria andUsePeriodLimitTypeCdGreaterThan(String value) {
            addCriterion("USE_PERIOD_LIMIT_TYPE_CD >", value, "usePeriodLimitTypeCd");
            return (Criteria) this;
        }

        public Criteria andUsePeriodLimitTypeCdGreaterThanOrEqualTo(String value) {
            addCriterion("USE_PERIOD_LIMIT_TYPE_CD >=", value, "usePeriodLimitTypeCd");
            return (Criteria) this;
        }

        public Criteria andUsePeriodLimitTypeCdLessThan(String value) {
            addCriterion("USE_PERIOD_LIMIT_TYPE_CD <", value, "usePeriodLimitTypeCd");
            return (Criteria) this;
        }

        public Criteria andUsePeriodLimitTypeCdLessThanOrEqualTo(String value) {
            addCriterion("USE_PERIOD_LIMIT_TYPE_CD <=", value, "usePeriodLimitTypeCd");
            return (Criteria) this;
        }

        public Criteria andUsePeriodLimitTypeCdLike(String value) {
            addCriterion("USE_PERIOD_LIMIT_TYPE_CD like", value, "usePeriodLimitTypeCd");
            return (Criteria) this;
        }

        public Criteria andUsePeriodLimitTypeCdNotLike(String value) {
            addCriterion("USE_PERIOD_LIMIT_TYPE_CD not like", value, "usePeriodLimitTypeCd");
            return (Criteria) this;
        }

        public Criteria andUsePeriodLimitTypeCdIn(List<String> values) {
            addCriterion("USE_PERIOD_LIMIT_TYPE_CD in", values, "usePeriodLimitTypeCd");
            return (Criteria) this;
        }

        public Criteria andUsePeriodLimitTypeCdNotIn(List<String> values) {
            addCriterion("USE_PERIOD_LIMIT_TYPE_CD not in", values, "usePeriodLimitTypeCd");
            return (Criteria) this;
        }

        public Criteria andUsePeriodLimitTypeCdBetween(String value1, String value2) {
            addCriterion("USE_PERIOD_LIMIT_TYPE_CD between", value1, value2, "usePeriodLimitTypeCd");
            return (Criteria) this;
        }

        public Criteria andUsePeriodLimitTypeCdNotBetween(String value1, String value2) {
            addCriterion("USE_PERIOD_LIMIT_TYPE_CD not between", value1, value2, "usePeriodLimitTypeCd");
            return (Criteria) this;
        }

        public Criteria andUsePeriodMaxPtIsNull() {
            addCriterion("USE_PERIOD_MAX_PT is null");
            return (Criteria) this;
        }

        public Criteria andUsePeriodMaxPtIsNotNull() {
            addCriterion("USE_PERIOD_MAX_PT is not null");
            return (Criteria) this;
        }

        public Criteria andUsePeriodMaxPtEqualTo(Long value) {
            addCriterion("USE_PERIOD_MAX_PT =", value, "usePeriodMaxPt");
            return (Criteria) this;
        }

        public Criteria andUsePeriodMaxPtNotEqualTo(Long value) {
            addCriterion("USE_PERIOD_MAX_PT <>", value, "usePeriodMaxPt");
            return (Criteria) this;
        }

        public Criteria andUsePeriodMaxPtGreaterThan(Long value) {
            addCriterion("USE_PERIOD_MAX_PT >", value, "usePeriodMaxPt");
            return (Criteria) this;
        }

        public Criteria andUsePeriodMaxPtGreaterThanOrEqualTo(Long value) {
            addCriterion("USE_PERIOD_MAX_PT >=", value, "usePeriodMaxPt");
            return (Criteria) this;
        }

        public Criteria andUsePeriodMaxPtLessThan(Long value) {
            addCriterion("USE_PERIOD_MAX_PT <", value, "usePeriodMaxPt");
            return (Criteria) this;
        }

        public Criteria andUsePeriodMaxPtLessThanOrEqualTo(Long value) {
            addCriterion("USE_PERIOD_MAX_PT <=", value, "usePeriodMaxPt");
            return (Criteria) this;
        }

        public Criteria andUsePeriodMaxPtIn(List<Long> values) {
            addCriterion("USE_PERIOD_MAX_PT in", values, "usePeriodMaxPt");
            return (Criteria) this;
        }

        public Criteria andUsePeriodMaxPtNotIn(List<Long> values) {
            addCriterion("USE_PERIOD_MAX_PT not in", values, "usePeriodMaxPt");
            return (Criteria) this;
        }

        public Criteria andUsePeriodMaxPtBetween(Long value1, Long value2) {
            addCriterion("USE_PERIOD_MAX_PT between", value1, value2, "usePeriodMaxPt");
            return (Criteria) this;
        }

        public Criteria andUsePeriodMaxPtNotBetween(Long value1, Long value2) {
            addCriterion("USE_PERIOD_MAX_PT not between", value1, value2, "usePeriodMaxPt");
            return (Criteria) this;
        }

        public Criteria andUsePeriodMaxCntIsNull() {
            addCriterion("USE_PERIOD_MAX_CNT is null");
            return (Criteria) this;
        }

        public Criteria andUsePeriodMaxCntIsNotNull() {
            addCriterion("USE_PERIOD_MAX_CNT is not null");
            return (Criteria) this;
        }

        public Criteria andUsePeriodMaxCntEqualTo(Integer value) {
            addCriterion("USE_PERIOD_MAX_CNT =", value, "usePeriodMaxCnt");
            return (Criteria) this;
        }

        public Criteria andUsePeriodMaxCntNotEqualTo(Integer value) {
            addCriterion("USE_PERIOD_MAX_CNT <>", value, "usePeriodMaxCnt");
            return (Criteria) this;
        }

        public Criteria andUsePeriodMaxCntGreaterThan(Integer value) {
            addCriterion("USE_PERIOD_MAX_CNT >", value, "usePeriodMaxCnt");
            return (Criteria) this;
        }

        public Criteria andUsePeriodMaxCntGreaterThanOrEqualTo(Integer value) {
            addCriterion("USE_PERIOD_MAX_CNT >=", value, "usePeriodMaxCnt");
            return (Criteria) this;
        }

        public Criteria andUsePeriodMaxCntLessThan(Integer value) {
            addCriterion("USE_PERIOD_MAX_CNT <", value, "usePeriodMaxCnt");
            return (Criteria) this;
        }

        public Criteria andUsePeriodMaxCntLessThanOrEqualTo(Integer value) {
            addCriterion("USE_PERIOD_MAX_CNT <=", value, "usePeriodMaxCnt");
            return (Criteria) this;
        }

        public Criteria andUsePeriodMaxCntIn(List<Integer> values) {
            addCriterion("USE_PERIOD_MAX_CNT in", values, "usePeriodMaxCnt");
            return (Criteria) this;
        }

        public Criteria andUsePeriodMaxCntNotIn(List<Integer> values) {
            addCriterion("USE_PERIOD_MAX_CNT not in", values, "usePeriodMaxCnt");
            return (Criteria) this;
        }

        public Criteria andUsePeriodMaxCntBetween(Integer value1, Integer value2) {
            addCriterion("USE_PERIOD_MAX_CNT between", value1, value2, "usePeriodMaxCnt");
            return (Criteria) this;
        }

        public Criteria andUsePeriodMaxCntNotBetween(Integer value1, Integer value2) {
            addCriterion("USE_PERIOD_MAX_CNT not between", value1, value2, "usePeriodMaxCnt");
            return (Criteria) this;
        }

        public Criteria andOnceUseLimitTypeCdIsNull() {
            addCriterion("ONCE_USE_LIMIT_TYPE_CD is null");
            return (Criteria) this;
        }

        public Criteria andOnceUseLimitTypeCdIsNotNull() {
            addCriterion("ONCE_USE_LIMIT_TYPE_CD is not null");
            return (Criteria) this;
        }

        public Criteria andOnceUseLimitTypeCdEqualTo(String value) {
            addCriterion("ONCE_USE_LIMIT_TYPE_CD =", value, "onceUseLimitTypeCd");
            return (Criteria) this;
        }

        public Criteria andOnceUseLimitTypeCdNotEqualTo(String value) {
            addCriterion("ONCE_USE_LIMIT_TYPE_CD <>", value, "onceUseLimitTypeCd");
            return (Criteria) this;
        }

        public Criteria andOnceUseLimitTypeCdGreaterThan(String value) {
            addCriterion("ONCE_USE_LIMIT_TYPE_CD >", value, "onceUseLimitTypeCd");
            return (Criteria) this;
        }

        public Criteria andOnceUseLimitTypeCdGreaterThanOrEqualTo(String value) {
            addCriterion("ONCE_USE_LIMIT_TYPE_CD >=", value, "onceUseLimitTypeCd");
            return (Criteria) this;
        }

        public Criteria andOnceUseLimitTypeCdLessThan(String value) {
            addCriterion("ONCE_USE_LIMIT_TYPE_CD <", value, "onceUseLimitTypeCd");
            return (Criteria) this;
        }

        public Criteria andOnceUseLimitTypeCdLessThanOrEqualTo(String value) {
            addCriterion("ONCE_USE_LIMIT_TYPE_CD <=", value, "onceUseLimitTypeCd");
            return (Criteria) this;
        }

        public Criteria andOnceUseLimitTypeCdLike(String value) {
            addCriterion("ONCE_USE_LIMIT_TYPE_CD like", value, "onceUseLimitTypeCd");
            return (Criteria) this;
        }

        public Criteria andOnceUseLimitTypeCdNotLike(String value) {
            addCriterion("ONCE_USE_LIMIT_TYPE_CD not like", value, "onceUseLimitTypeCd");
            return (Criteria) this;
        }

        public Criteria andOnceUseLimitTypeCdIn(List<String> values) {
            addCriterion("ONCE_USE_LIMIT_TYPE_CD in", values, "onceUseLimitTypeCd");
            return (Criteria) this;
        }

        public Criteria andOnceUseLimitTypeCdNotIn(List<String> values) {
            addCriterion("ONCE_USE_LIMIT_TYPE_CD not in", values, "onceUseLimitTypeCd");
            return (Criteria) this;
        }

        public Criteria andOnceUseLimitTypeCdBetween(String value1, String value2) {
            addCriterion("ONCE_USE_LIMIT_TYPE_CD between", value1, value2, "onceUseLimitTypeCd");
            return (Criteria) this;
        }

        public Criteria andOnceUseLimitTypeCdNotBetween(String value1, String value2) {
            addCriterion("ONCE_USE_LIMIT_TYPE_CD not between", value1, value2, "onceUseLimitTypeCd");
            return (Criteria) this;
        }

        public Criteria andOnceUseFixPtIsNull() {
            addCriterion("ONCE_USE_FIX_PT is null");
            return (Criteria) this;
        }

        public Criteria andOnceUseFixPtIsNotNull() {
            addCriterion("ONCE_USE_FIX_PT is not null");
            return (Criteria) this;
        }

        public Criteria andOnceUseFixPtEqualTo(Long value) {
            addCriterion("ONCE_USE_FIX_PT =", value, "onceUseFixPt");
            return (Criteria) this;
        }

        public Criteria andOnceUseFixPtNotEqualTo(Long value) {
            addCriterion("ONCE_USE_FIX_PT <>", value, "onceUseFixPt");
            return (Criteria) this;
        }

        public Criteria andOnceUseFixPtGreaterThan(Long value) {
            addCriterion("ONCE_USE_FIX_PT >", value, "onceUseFixPt");
            return (Criteria) this;
        }

        public Criteria andOnceUseFixPtGreaterThanOrEqualTo(Long value) {
            addCriterion("ONCE_USE_FIX_PT >=", value, "onceUseFixPt");
            return (Criteria) this;
        }

        public Criteria andOnceUseFixPtLessThan(Long value) {
            addCriterion("ONCE_USE_FIX_PT <", value, "onceUseFixPt");
            return (Criteria) this;
        }

        public Criteria andOnceUseFixPtLessThanOrEqualTo(Long value) {
            addCriterion("ONCE_USE_FIX_PT <=", value, "onceUseFixPt");
            return (Criteria) this;
        }

        public Criteria andOnceUseFixPtIn(List<Long> values) {
            addCriterion("ONCE_USE_FIX_PT in", values, "onceUseFixPt");
            return (Criteria) this;
        }

        public Criteria andOnceUseFixPtNotIn(List<Long> values) {
            addCriterion("ONCE_USE_FIX_PT not in", values, "onceUseFixPt");
            return (Criteria) this;
        }

        public Criteria andOnceUseFixPtBetween(Long value1, Long value2) {
            addCriterion("ONCE_USE_FIX_PT between", value1, value2, "onceUseFixPt");
            return (Criteria) this;
        }

        public Criteria andOnceUseFixPtNotBetween(Long value1, Long value2) {
            addCriterion("ONCE_USE_FIX_PT not between", value1, value2, "onceUseFixPt");
            return (Criteria) this;
        }

        public Criteria andOnceUsePurchaseRateIsNull() {
            addCriterion("ONCE_USE_PURCHASE_RATE is null");
            return (Criteria) this;
        }

        public Criteria andOnceUsePurchaseRateIsNotNull() {
            addCriterion("ONCE_USE_PURCHASE_RATE is not null");
            return (Criteria) this;
        }

        public Criteria andOnceUsePurchaseRateEqualTo(Double value) {
            addCriterion("ONCE_USE_PURCHASE_RATE =", value, "onceUsePurchaseRate");
            return (Criteria) this;
        }

        public Criteria andOnceUsePurchaseRateNotEqualTo(Double value) {
            addCriterion("ONCE_USE_PURCHASE_RATE <>", value, "onceUsePurchaseRate");
            return (Criteria) this;
        }

        public Criteria andOnceUsePurchaseRateGreaterThan(Double value) {
            addCriterion("ONCE_USE_PURCHASE_RATE >", value, "onceUsePurchaseRate");
            return (Criteria) this;
        }

        public Criteria andOnceUsePurchaseRateGreaterThanOrEqualTo(Double value) {
            addCriterion("ONCE_USE_PURCHASE_RATE >=", value, "onceUsePurchaseRate");
            return (Criteria) this;
        }

        public Criteria andOnceUsePurchaseRateLessThan(Double value) {
            addCriterion("ONCE_USE_PURCHASE_RATE <", value, "onceUsePurchaseRate");
            return (Criteria) this;
        }

        public Criteria andOnceUsePurchaseRateLessThanOrEqualTo(Double value) {
            addCriterion("ONCE_USE_PURCHASE_RATE <=", value, "onceUsePurchaseRate");
            return (Criteria) this;
        }

        public Criteria andOnceUsePurchaseRateIn(List<Double> values) {
            addCriterion("ONCE_USE_PURCHASE_RATE in", values, "onceUsePurchaseRate");
            return (Criteria) this;
        }

        public Criteria andOnceUsePurchaseRateNotIn(List<Double> values) {
            addCriterion("ONCE_USE_PURCHASE_RATE not in", values, "onceUsePurchaseRate");
            return (Criteria) this;
        }

        public Criteria andOnceUsePurchaseRateBetween(Double value1, Double value2) {
            addCriterion("ONCE_USE_PURCHASE_RATE between", value1, value2, "onceUsePurchaseRate");
            return (Criteria) this;
        }

        public Criteria andOnceUsePurchaseRateNotBetween(Double value1, Double value2) {
            addCriterion("ONCE_USE_PURCHASE_RATE not between", value1, value2, "onceUsePurchaseRate");
            return (Criteria) this;
        }

        public Criteria andOnceUseMinPtIsNull() {
            addCriterion("ONCE_USE_MIN_PT is null");
            return (Criteria) this;
        }

        public Criteria andOnceUseMinPtIsNotNull() {
            addCriterion("ONCE_USE_MIN_PT is not null");
            return (Criteria) this;
        }

        public Criteria andOnceUseMinPtEqualTo(Long value) {
            addCriterion("ONCE_USE_MIN_PT =", value, "onceUseMinPt");
            return (Criteria) this;
        }

        public Criteria andOnceUseMinPtNotEqualTo(Long value) {
            addCriterion("ONCE_USE_MIN_PT <>", value, "onceUseMinPt");
            return (Criteria) this;
        }

        public Criteria andOnceUseMinPtGreaterThan(Long value) {
            addCriterion("ONCE_USE_MIN_PT >", value, "onceUseMinPt");
            return (Criteria) this;
        }

        public Criteria andOnceUseMinPtGreaterThanOrEqualTo(Long value) {
            addCriterion("ONCE_USE_MIN_PT >=", value, "onceUseMinPt");
            return (Criteria) this;
        }

        public Criteria andOnceUseMinPtLessThan(Long value) {
            addCriterion("ONCE_USE_MIN_PT <", value, "onceUseMinPt");
            return (Criteria) this;
        }

        public Criteria andOnceUseMinPtLessThanOrEqualTo(Long value) {
            addCriterion("ONCE_USE_MIN_PT <=", value, "onceUseMinPt");
            return (Criteria) this;
        }

        public Criteria andOnceUseMinPtIn(List<Long> values) {
            addCriterion("ONCE_USE_MIN_PT in", values, "onceUseMinPt");
            return (Criteria) this;
        }

        public Criteria andOnceUseMinPtNotIn(List<Long> values) {
            addCriterion("ONCE_USE_MIN_PT not in", values, "onceUseMinPt");
            return (Criteria) this;
        }

        public Criteria andOnceUseMinPtBetween(Long value1, Long value2) {
            addCriterion("ONCE_USE_MIN_PT between", value1, value2, "onceUseMinPt");
            return (Criteria) this;
        }

        public Criteria andOnceUseMinPtNotBetween(Long value1, Long value2) {
            addCriterion("ONCE_USE_MIN_PT not between", value1, value2, "onceUseMinPt");
            return (Criteria) this;
        }

        public Criteria andOnceUseMaxPtIsNull() {
            addCriterion("ONCE_USE_MAX_PT is null");
            return (Criteria) this;
        }

        public Criteria andOnceUseMaxPtIsNotNull() {
            addCriterion("ONCE_USE_MAX_PT is not null");
            return (Criteria) this;
        }

        public Criteria andOnceUseMaxPtEqualTo(Long value) {
            addCriterion("ONCE_USE_MAX_PT =", value, "onceUseMaxPt");
            return (Criteria) this;
        }

        public Criteria andOnceUseMaxPtNotEqualTo(Long value) {
            addCriterion("ONCE_USE_MAX_PT <>", value, "onceUseMaxPt");
            return (Criteria) this;
        }

        public Criteria andOnceUseMaxPtGreaterThan(Long value) {
            addCriterion("ONCE_USE_MAX_PT >", value, "onceUseMaxPt");
            return (Criteria) this;
        }

        public Criteria andOnceUseMaxPtGreaterThanOrEqualTo(Long value) {
            addCriterion("ONCE_USE_MAX_PT >=", value, "onceUseMaxPt");
            return (Criteria) this;
        }

        public Criteria andOnceUseMaxPtLessThan(Long value) {
            addCriterion("ONCE_USE_MAX_PT <", value, "onceUseMaxPt");
            return (Criteria) this;
        }

        public Criteria andOnceUseMaxPtLessThanOrEqualTo(Long value) {
            addCriterion("ONCE_USE_MAX_PT <=", value, "onceUseMaxPt");
            return (Criteria) this;
        }

        public Criteria andOnceUseMaxPtIn(List<Long> values) {
            addCriterion("ONCE_USE_MAX_PT in", values, "onceUseMaxPt");
            return (Criteria) this;
        }

        public Criteria andOnceUseMaxPtNotIn(List<Long> values) {
            addCriterion("ONCE_USE_MAX_PT not in", values, "onceUseMaxPt");
            return (Criteria) this;
        }

        public Criteria andOnceUseMaxPtBetween(Long value1, Long value2) {
            addCriterion("ONCE_USE_MAX_PT between", value1, value2, "onceUseMaxPt");
            return (Criteria) this;
        }

        public Criteria andOnceUseMaxPtNotBetween(Long value1, Long value2) {
            addCriterion("ONCE_USE_MAX_PT not between", value1, value2, "onceUseMaxPt");
            return (Criteria) this;
        }

        public Criteria andTotalIsuLimitTypeCdIsNull() {
            addCriterion("TOTAL_ISU_LIMIT_TYPE_CD is null");
            return (Criteria) this;
        }

        public Criteria andTotalIsuLimitTypeCdIsNotNull() {
            addCriterion("TOTAL_ISU_LIMIT_TYPE_CD is not null");
            return (Criteria) this;
        }

        public Criteria andTotalIsuLimitTypeCdEqualTo(String value) {
            addCriterion("TOTAL_ISU_LIMIT_TYPE_CD =", value, "totalIsuLimitTypeCd");
            return (Criteria) this;
        }

        public Criteria andTotalIsuLimitTypeCdNotEqualTo(String value) {
            addCriterion("TOTAL_ISU_LIMIT_TYPE_CD <>", value, "totalIsuLimitTypeCd");
            return (Criteria) this;
        }

        public Criteria andTotalIsuLimitTypeCdGreaterThan(String value) {
            addCriterion("TOTAL_ISU_LIMIT_TYPE_CD >", value, "totalIsuLimitTypeCd");
            return (Criteria) this;
        }

        public Criteria andTotalIsuLimitTypeCdGreaterThanOrEqualTo(String value) {
            addCriterion("TOTAL_ISU_LIMIT_TYPE_CD >=", value, "totalIsuLimitTypeCd");
            return (Criteria) this;
        }

        public Criteria andTotalIsuLimitTypeCdLessThan(String value) {
            addCriterion("TOTAL_ISU_LIMIT_TYPE_CD <", value, "totalIsuLimitTypeCd");
            return (Criteria) this;
        }

        public Criteria andTotalIsuLimitTypeCdLessThanOrEqualTo(String value) {
            addCriterion("TOTAL_ISU_LIMIT_TYPE_CD <=", value, "totalIsuLimitTypeCd");
            return (Criteria) this;
        }

        public Criteria andTotalIsuLimitTypeCdLike(String value) {
            addCriterion("TOTAL_ISU_LIMIT_TYPE_CD like", value, "totalIsuLimitTypeCd");
            return (Criteria) this;
        }

        public Criteria andTotalIsuLimitTypeCdNotLike(String value) {
            addCriterion("TOTAL_ISU_LIMIT_TYPE_CD not like", value, "totalIsuLimitTypeCd");
            return (Criteria) this;
        }

        public Criteria andTotalIsuLimitTypeCdIn(List<String> values) {
            addCriterion("TOTAL_ISU_LIMIT_TYPE_CD in", values, "totalIsuLimitTypeCd");
            return (Criteria) this;
        }

        public Criteria andTotalIsuLimitTypeCdNotIn(List<String> values) {
            addCriterion("TOTAL_ISU_LIMIT_TYPE_CD not in", values, "totalIsuLimitTypeCd");
            return (Criteria) this;
        }

        public Criteria andTotalIsuLimitTypeCdBetween(String value1, String value2) {
            addCriterion("TOTAL_ISU_LIMIT_TYPE_CD between", value1, value2, "totalIsuLimitTypeCd");
            return (Criteria) this;
        }

        public Criteria andTotalIsuLimitTypeCdNotBetween(String value1, String value2) {
            addCriterion("TOTAL_ISU_LIMIT_TYPE_CD not between", value1, value2, "totalIsuLimitTypeCd");
            return (Criteria) this;
        }

        public Criteria andTotalIsuAblePtIsNull() {
            addCriterion("TOTAL_ISU_ABLE_PT is null");
            return (Criteria) this;
        }

        public Criteria andTotalIsuAblePtIsNotNull() {
            addCriterion("TOTAL_ISU_ABLE_PT is not null");
            return (Criteria) this;
        }

        public Criteria andTotalIsuAblePtEqualTo(Long value) {
            addCriterion("TOTAL_ISU_ABLE_PT =", value, "totalIsuAblePt");
            return (Criteria) this;
        }

        public Criteria andTotalIsuAblePtNotEqualTo(Long value) {
            addCriterion("TOTAL_ISU_ABLE_PT <>", value, "totalIsuAblePt");
            return (Criteria) this;
        }

        public Criteria andTotalIsuAblePtGreaterThan(Long value) {
            addCriterion("TOTAL_ISU_ABLE_PT >", value, "totalIsuAblePt");
            return (Criteria) this;
        }

        public Criteria andTotalIsuAblePtGreaterThanOrEqualTo(Long value) {
            addCriterion("TOTAL_ISU_ABLE_PT >=", value, "totalIsuAblePt");
            return (Criteria) this;
        }

        public Criteria andTotalIsuAblePtLessThan(Long value) {
            addCriterion("TOTAL_ISU_ABLE_PT <", value, "totalIsuAblePt");
            return (Criteria) this;
        }

        public Criteria andTotalIsuAblePtLessThanOrEqualTo(Long value) {
            addCriterion("TOTAL_ISU_ABLE_PT <=", value, "totalIsuAblePt");
            return (Criteria) this;
        }

        public Criteria andTotalIsuAblePtIn(List<Long> values) {
            addCriterion("TOTAL_ISU_ABLE_PT in", values, "totalIsuAblePt");
            return (Criteria) this;
        }

        public Criteria andTotalIsuAblePtNotIn(List<Long> values) {
            addCriterion("TOTAL_ISU_ABLE_PT not in", values, "totalIsuAblePt");
            return (Criteria) this;
        }

        public Criteria andTotalIsuAblePtBetween(Long value1, Long value2) {
            addCriterion("TOTAL_ISU_ABLE_PT between", value1, value2, "totalIsuAblePt");
            return (Criteria) this;
        }

        public Criteria andTotalIsuAblePtNotBetween(Long value1, Long value2) {
            addCriterion("TOTAL_ISU_ABLE_PT not between", value1, value2, "totalIsuAblePt");
            return (Criteria) this;
        }

        public Criteria andTotalIsuAbleCntIsNull() {
            addCriterion("TOTAL_ISU_ABLE_CNT is null");
            return (Criteria) this;
        }

        public Criteria andTotalIsuAbleCntIsNotNull() {
            addCriterion("TOTAL_ISU_ABLE_CNT is not null");
            return (Criteria) this;
        }

        public Criteria andTotalIsuAbleCntEqualTo(Long value) {
            addCriterion("TOTAL_ISU_ABLE_CNT =", value, "totalIsuAbleCnt");
            return (Criteria) this;
        }

        public Criteria andTotalIsuAbleCntNotEqualTo(Long value) {
            addCriterion("TOTAL_ISU_ABLE_CNT <>", value, "totalIsuAbleCnt");
            return (Criteria) this;
        }

        public Criteria andTotalIsuAbleCntGreaterThan(Long value) {
            addCriterion("TOTAL_ISU_ABLE_CNT >", value, "totalIsuAbleCnt");
            return (Criteria) this;
        }

        public Criteria andTotalIsuAbleCntGreaterThanOrEqualTo(Long value) {
            addCriterion("TOTAL_ISU_ABLE_CNT >=", value, "totalIsuAbleCnt");
            return (Criteria) this;
        }

        public Criteria andTotalIsuAbleCntLessThan(Long value) {
            addCriterion("TOTAL_ISU_ABLE_CNT <", value, "totalIsuAbleCnt");
            return (Criteria) this;
        }

        public Criteria andTotalIsuAbleCntLessThanOrEqualTo(Long value) {
            addCriterion("TOTAL_ISU_ABLE_CNT <=", value, "totalIsuAbleCnt");
            return (Criteria) this;
        }

        public Criteria andTotalIsuAbleCntIn(List<Long> values) {
            addCriterion("TOTAL_ISU_ABLE_CNT in", values, "totalIsuAbleCnt");
            return (Criteria) this;
        }

        public Criteria andTotalIsuAbleCntNotIn(List<Long> values) {
            addCriterion("TOTAL_ISU_ABLE_CNT not in", values, "totalIsuAbleCnt");
            return (Criteria) this;
        }

        public Criteria andTotalIsuAbleCntBetween(Long value1, Long value2) {
            addCriterion("TOTAL_ISU_ABLE_CNT between", value1, value2, "totalIsuAbleCnt");
            return (Criteria) this;
        }

        public Criteria andTotalIsuAbleCntNotBetween(Long value1, Long value2) {
            addCriterion("TOTAL_ISU_ABLE_CNT not between", value1, value2, "totalIsuAbleCnt");
            return (Criteria) this;
        }

        public Criteria andMinPurchaseAmtIsNull() {
            addCriterion("MIN_PURCHASE_AMT is null");
            return (Criteria) this;
        }

        public Criteria andMinPurchaseAmtIsNotNull() {
            addCriterion("MIN_PURCHASE_AMT is not null");
            return (Criteria) this;
        }

        public Criteria andMinPurchaseAmtEqualTo(Long value) {
            addCriterion("MIN_PURCHASE_AMT =", value, "minPurchaseAmt");
            return (Criteria) this;
        }

        public Criteria andMinPurchaseAmtNotEqualTo(Long value) {
            addCriterion("MIN_PURCHASE_AMT <>", value, "minPurchaseAmt");
            return (Criteria) this;
        }

        public Criteria andMinPurchaseAmtGreaterThan(Long value) {
            addCriterion("MIN_PURCHASE_AMT >", value, "minPurchaseAmt");
            return (Criteria) this;
        }

        public Criteria andMinPurchaseAmtGreaterThanOrEqualTo(Long value) {
            addCriterion("MIN_PURCHASE_AMT >=", value, "minPurchaseAmt");
            return (Criteria) this;
        }

        public Criteria andMinPurchaseAmtLessThan(Long value) {
            addCriterion("MIN_PURCHASE_AMT <", value, "minPurchaseAmt");
            return (Criteria) this;
        }

        public Criteria andMinPurchaseAmtLessThanOrEqualTo(Long value) {
            addCriterion("MIN_PURCHASE_AMT <=", value, "minPurchaseAmt");
            return (Criteria) this;
        }

        public Criteria andMinPurchaseAmtIn(List<Long> values) {
            addCriterion("MIN_PURCHASE_AMT in", values, "minPurchaseAmt");
            return (Criteria) this;
        }

        public Criteria andMinPurchaseAmtNotIn(List<Long> values) {
            addCriterion("MIN_PURCHASE_AMT not in", values, "minPurchaseAmt");
            return (Criteria) this;
        }

        public Criteria andMinPurchaseAmtBetween(Long value1, Long value2) {
            addCriterion("MIN_PURCHASE_AMT between", value1, value2, "minPurchaseAmt");
            return (Criteria) this;
        }

        public Criteria andMinPurchaseAmtNotBetween(Long value1, Long value2) {
            addCriterion("MIN_PURCHASE_AMT not between", value1, value2, "minPurchaseAmt");
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