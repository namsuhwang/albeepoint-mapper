package com.albee.albeepoint.mapper.base.t_tr_hist;

import java.time.LocalDateTime;
import java.util.ArrayList;
import java.util.List;

public class TTrHistExample {
    protected String orderByClause;

    protected boolean distinct;

    protected List<Criteria> oredCriteria;

    public TTrHistExample() {
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

        public Criteria andTrDtIsNull() {
            addCriterion("TR_DT is null");
            return (Criteria) this;
        }

        public Criteria andTrDtIsNotNull() {
            addCriterion("TR_DT is not null");
            return (Criteria) this;
        }

        public Criteria andTrDtEqualTo(LocalDateTime value) {
            addCriterion("TR_DT =", value, "trDt");
            return (Criteria) this;
        }

        public Criteria andTrDtNotEqualTo(LocalDateTime value) {
            addCriterion("TR_DT <>", value, "trDt");
            return (Criteria) this;
        }

        public Criteria andTrDtGreaterThan(LocalDateTime value) {
            addCriterion("TR_DT >", value, "trDt");
            return (Criteria) this;
        }

        public Criteria andTrDtGreaterThanOrEqualTo(LocalDateTime value) {
            addCriterion("TR_DT >=", value, "trDt");
            return (Criteria) this;
        }

        public Criteria andTrDtLessThan(LocalDateTime value) {
            addCriterion("TR_DT <", value, "trDt");
            return (Criteria) this;
        }

        public Criteria andTrDtLessThanOrEqualTo(LocalDateTime value) {
            addCriterion("TR_DT <=", value, "trDt");
            return (Criteria) this;
        }

        public Criteria andTrDtIn(List<LocalDateTime> values) {
            addCriterion("TR_DT in", values, "trDt");
            return (Criteria) this;
        }

        public Criteria andTrDtNotIn(List<LocalDateTime> values) {
            addCriterion("TR_DT not in", values, "trDt");
            return (Criteria) this;
        }

        public Criteria andTrDtBetween(LocalDateTime value1, LocalDateTime value2) {
            addCriterion("TR_DT between", value1, value2, "trDt");
            return (Criteria) this;
        }

        public Criteria andTrDtNotBetween(LocalDateTime value1, LocalDateTime value2) {
            addCriterion("TR_DT not between", value1, value2, "trDt");
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

        public Criteria andTrMethodGbCdIsNull() {
            addCriterion("TR_METHOD_GB_CD is null");
            return (Criteria) this;
        }

        public Criteria andTrMethodGbCdIsNotNull() {
            addCriterion("TR_METHOD_GB_CD is not null");
            return (Criteria) this;
        }

        public Criteria andTrMethodGbCdEqualTo(String value) {
            addCriterion("TR_METHOD_GB_CD =", value, "trMethodGbCd");
            return (Criteria) this;
        }

        public Criteria andTrMethodGbCdNotEqualTo(String value) {
            addCriterion("TR_METHOD_GB_CD <>", value, "trMethodGbCd");
            return (Criteria) this;
        }

        public Criteria andTrMethodGbCdGreaterThan(String value) {
            addCriterion("TR_METHOD_GB_CD >", value, "trMethodGbCd");
            return (Criteria) this;
        }

        public Criteria andTrMethodGbCdGreaterThanOrEqualTo(String value) {
            addCriterion("TR_METHOD_GB_CD >=", value, "trMethodGbCd");
            return (Criteria) this;
        }

        public Criteria andTrMethodGbCdLessThan(String value) {
            addCriterion("TR_METHOD_GB_CD <", value, "trMethodGbCd");
            return (Criteria) this;
        }

        public Criteria andTrMethodGbCdLessThanOrEqualTo(String value) {
            addCriterion("TR_METHOD_GB_CD <=", value, "trMethodGbCd");
            return (Criteria) this;
        }

        public Criteria andTrMethodGbCdLike(String value) {
            addCriterion("TR_METHOD_GB_CD like", value, "trMethodGbCd");
            return (Criteria) this;
        }

        public Criteria andTrMethodGbCdNotLike(String value) {
            addCriterion("TR_METHOD_GB_CD not like", value, "trMethodGbCd");
            return (Criteria) this;
        }

        public Criteria andTrMethodGbCdIn(List<String> values) {
            addCriterion("TR_METHOD_GB_CD in", values, "trMethodGbCd");
            return (Criteria) this;
        }

        public Criteria andTrMethodGbCdNotIn(List<String> values) {
            addCriterion("TR_METHOD_GB_CD not in", values, "trMethodGbCd");
            return (Criteria) this;
        }

        public Criteria andTrMethodGbCdBetween(String value1, String value2) {
            addCriterion("TR_METHOD_GB_CD between", value1, value2, "trMethodGbCd");
            return (Criteria) this;
        }

        public Criteria andTrMethodGbCdNotBetween(String value1, String value2) {
            addCriterion("TR_METHOD_GB_CD not between", value1, value2, "trMethodGbCd");
            return (Criteria) this;
        }

        public Criteria andTrDyIsNull() {
            addCriterion("TR_DY is null");
            return (Criteria) this;
        }

        public Criteria andTrDyIsNotNull() {
            addCriterion("TR_DY is not null");
            return (Criteria) this;
        }

        public Criteria andTrDyEqualTo(String value) {
            addCriterion("TR_DY =", value, "trDy");
            return (Criteria) this;
        }

        public Criteria andTrDyNotEqualTo(String value) {
            addCriterion("TR_DY <>", value, "trDy");
            return (Criteria) this;
        }

        public Criteria andTrDyGreaterThan(String value) {
            addCriterion("TR_DY >", value, "trDy");
            return (Criteria) this;
        }

        public Criteria andTrDyGreaterThanOrEqualTo(String value) {
            addCriterion("TR_DY >=", value, "trDy");
            return (Criteria) this;
        }

        public Criteria andTrDyLessThan(String value) {
            addCriterion("TR_DY <", value, "trDy");
            return (Criteria) this;
        }

        public Criteria andTrDyLessThanOrEqualTo(String value) {
            addCriterion("TR_DY <=", value, "trDy");
            return (Criteria) this;
        }

        public Criteria andTrDyLike(String value) {
            addCriterion("TR_DY like", value, "trDy");
            return (Criteria) this;
        }

        public Criteria andTrDyNotLike(String value) {
            addCriterion("TR_DY not like", value, "trDy");
            return (Criteria) this;
        }

        public Criteria andTrDyIn(List<String> values) {
            addCriterion("TR_DY in", values, "trDy");
            return (Criteria) this;
        }

        public Criteria andTrDyNotIn(List<String> values) {
            addCriterion("TR_DY not in", values, "trDy");
            return (Criteria) this;
        }

        public Criteria andTrDyBetween(String value1, String value2) {
            addCriterion("TR_DY between", value1, value2, "trDy");
            return (Criteria) this;
        }

        public Criteria andTrDyNotBetween(String value1, String value2) {
            addCriterion("TR_DY not between", value1, value2, "trDy");
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

        public Criteria andBrchNoIsNull() {
            addCriterion("BRCH_NO is null");
            return (Criteria) this;
        }

        public Criteria andBrchNoIsNotNull() {
            addCriterion("BRCH_NO is not null");
            return (Criteria) this;
        }

        public Criteria andBrchNoEqualTo(Long value) {
            addCriterion("BRCH_NO =", value, "brchNo");
            return (Criteria) this;
        }

        public Criteria andBrchNoNotEqualTo(Long value) {
            addCriterion("BRCH_NO <>", value, "brchNo");
            return (Criteria) this;
        }

        public Criteria andBrchNoGreaterThan(Long value) {
            addCriterion("BRCH_NO >", value, "brchNo");
            return (Criteria) this;
        }

        public Criteria andBrchNoGreaterThanOrEqualTo(Long value) {
            addCriterion("BRCH_NO >=", value, "brchNo");
            return (Criteria) this;
        }

        public Criteria andBrchNoLessThan(Long value) {
            addCriterion("BRCH_NO <", value, "brchNo");
            return (Criteria) this;
        }

        public Criteria andBrchNoLessThanOrEqualTo(Long value) {
            addCriterion("BRCH_NO <=", value, "brchNo");
            return (Criteria) this;
        }

        public Criteria andBrchNoIn(List<Long> values) {
            addCriterion("BRCH_NO in", values, "brchNo");
            return (Criteria) this;
        }

        public Criteria andBrchNoNotIn(List<Long> values) {
            addCriterion("BRCH_NO not in", values, "brchNo");
            return (Criteria) this;
        }

        public Criteria andBrchNoBetween(Long value1, Long value2) {
            addCriterion("BRCH_NO between", value1, value2, "brchNo");
            return (Criteria) this;
        }

        public Criteria andBrchNoNotBetween(Long value1, Long value2) {
            addCriterion("BRCH_NO not between", value1, value2, "brchNo");
            return (Criteria) this;
        }

        public Criteria andTrPtIsNull() {
            addCriterion("TR_PT is null");
            return (Criteria) this;
        }

        public Criteria andTrPtIsNotNull() {
            addCriterion("TR_PT is not null");
            return (Criteria) this;
        }

        public Criteria andTrPtEqualTo(Long value) {
            addCriterion("TR_PT =", value, "trPt");
            return (Criteria) this;
        }

        public Criteria andTrPtNotEqualTo(Long value) {
            addCriterion("TR_PT <>", value, "trPt");
            return (Criteria) this;
        }

        public Criteria andTrPtGreaterThan(Long value) {
            addCriterion("TR_PT >", value, "trPt");
            return (Criteria) this;
        }

        public Criteria andTrPtGreaterThanOrEqualTo(Long value) {
            addCriterion("TR_PT >=", value, "trPt");
            return (Criteria) this;
        }

        public Criteria andTrPtLessThan(Long value) {
            addCriterion("TR_PT <", value, "trPt");
            return (Criteria) this;
        }

        public Criteria andTrPtLessThanOrEqualTo(Long value) {
            addCriterion("TR_PT <=", value, "trPt");
            return (Criteria) this;
        }

        public Criteria andTrPtIn(List<Long> values) {
            addCriterion("TR_PT in", values, "trPt");
            return (Criteria) this;
        }

        public Criteria andTrPtNotIn(List<Long> values) {
            addCriterion("TR_PT not in", values, "trPt");
            return (Criteria) this;
        }

        public Criteria andTrPtBetween(Long value1, Long value2) {
            addCriterion("TR_PT between", value1, value2, "trPt");
            return (Criteria) this;
        }

        public Criteria andTrPtNotBetween(Long value1, Long value2) {
            addCriterion("TR_PT not between", value1, value2, "trPt");
            return (Criteria) this;
        }

        public Criteria andBefPtIsNull() {
            addCriterion("BEF_PT is null");
            return (Criteria) this;
        }

        public Criteria andBefPtIsNotNull() {
            addCriterion("BEF_PT is not null");
            return (Criteria) this;
        }

        public Criteria andBefPtEqualTo(Long value) {
            addCriterion("BEF_PT =", value, "befPt");
            return (Criteria) this;
        }

        public Criteria andBefPtNotEqualTo(Long value) {
            addCriterion("BEF_PT <>", value, "befPt");
            return (Criteria) this;
        }

        public Criteria andBefPtGreaterThan(Long value) {
            addCriterion("BEF_PT >", value, "befPt");
            return (Criteria) this;
        }

        public Criteria andBefPtGreaterThanOrEqualTo(Long value) {
            addCriterion("BEF_PT >=", value, "befPt");
            return (Criteria) this;
        }

        public Criteria andBefPtLessThan(Long value) {
            addCriterion("BEF_PT <", value, "befPt");
            return (Criteria) this;
        }

        public Criteria andBefPtLessThanOrEqualTo(Long value) {
            addCriterion("BEF_PT <=", value, "befPt");
            return (Criteria) this;
        }

        public Criteria andBefPtIn(List<Long> values) {
            addCriterion("BEF_PT in", values, "befPt");
            return (Criteria) this;
        }

        public Criteria andBefPtNotIn(List<Long> values) {
            addCriterion("BEF_PT not in", values, "befPt");
            return (Criteria) this;
        }

        public Criteria andBefPtBetween(Long value1, Long value2) {
            addCriterion("BEF_PT between", value1, value2, "befPt");
            return (Criteria) this;
        }

        public Criteria andBefPtNotBetween(Long value1, Long value2) {
            addCriterion("BEF_PT not between", value1, value2, "befPt");
            return (Criteria) this;
        }

        public Criteria andAfrPtIsNull() {
            addCriterion("AFR_PT is null");
            return (Criteria) this;
        }

        public Criteria andAfrPtIsNotNull() {
            addCriterion("AFR_PT is not null");
            return (Criteria) this;
        }

        public Criteria andAfrPtEqualTo(Long value) {
            addCriterion("AFR_PT =", value, "afrPt");
            return (Criteria) this;
        }

        public Criteria andAfrPtNotEqualTo(Long value) {
            addCriterion("AFR_PT <>", value, "afrPt");
            return (Criteria) this;
        }

        public Criteria andAfrPtGreaterThan(Long value) {
            addCriterion("AFR_PT >", value, "afrPt");
            return (Criteria) this;
        }

        public Criteria andAfrPtGreaterThanOrEqualTo(Long value) {
            addCriterion("AFR_PT >=", value, "afrPt");
            return (Criteria) this;
        }

        public Criteria andAfrPtLessThan(Long value) {
            addCriterion("AFR_PT <", value, "afrPt");
            return (Criteria) this;
        }

        public Criteria andAfrPtLessThanOrEqualTo(Long value) {
            addCriterion("AFR_PT <=", value, "afrPt");
            return (Criteria) this;
        }

        public Criteria andAfrPtIn(List<Long> values) {
            addCriterion("AFR_PT in", values, "afrPt");
            return (Criteria) this;
        }

        public Criteria andAfrPtNotIn(List<Long> values) {
            addCriterion("AFR_PT not in", values, "afrPt");
            return (Criteria) this;
        }

        public Criteria andAfrPtBetween(Long value1, Long value2) {
            addCriterion("AFR_PT between", value1, value2, "afrPt");
            return (Criteria) this;
        }

        public Criteria andAfrPtNotBetween(Long value1, Long value2) {
            addCriterion("AFR_PT not between", value1, value2, "afrPt");
            return (Criteria) this;
        }

        public Criteria andPurchaseAmtIsNull() {
            addCriterion("PURCHASE_AMT is null");
            return (Criteria) this;
        }

        public Criteria andPurchaseAmtIsNotNull() {
            addCriterion("PURCHASE_AMT is not null");
            return (Criteria) this;
        }

        public Criteria andPurchaseAmtEqualTo(Long value) {
            addCriterion("PURCHASE_AMT =", value, "purchaseAmt");
            return (Criteria) this;
        }

        public Criteria andPurchaseAmtNotEqualTo(Long value) {
            addCriterion("PURCHASE_AMT <>", value, "purchaseAmt");
            return (Criteria) this;
        }

        public Criteria andPurchaseAmtGreaterThan(Long value) {
            addCriterion("PURCHASE_AMT >", value, "purchaseAmt");
            return (Criteria) this;
        }

        public Criteria andPurchaseAmtGreaterThanOrEqualTo(Long value) {
            addCriterion("PURCHASE_AMT >=", value, "purchaseAmt");
            return (Criteria) this;
        }

        public Criteria andPurchaseAmtLessThan(Long value) {
            addCriterion("PURCHASE_AMT <", value, "purchaseAmt");
            return (Criteria) this;
        }

        public Criteria andPurchaseAmtLessThanOrEqualTo(Long value) {
            addCriterion("PURCHASE_AMT <=", value, "purchaseAmt");
            return (Criteria) this;
        }

        public Criteria andPurchaseAmtIn(List<Long> values) {
            addCriterion("PURCHASE_AMT in", values, "purchaseAmt");
            return (Criteria) this;
        }

        public Criteria andPurchaseAmtNotIn(List<Long> values) {
            addCriterion("PURCHASE_AMT not in", values, "purchaseAmt");
            return (Criteria) this;
        }

        public Criteria andPurchaseAmtBetween(Long value1, Long value2) {
            addCriterion("PURCHASE_AMT between", value1, value2, "purchaseAmt");
            return (Criteria) this;
        }

        public Criteria andPurchaseAmtNotBetween(Long value1, Long value2) {
            addCriterion("PURCHASE_AMT not between", value1, value2, "purchaseAmt");
            return (Criteria) this;
        }

        public Criteria andOrglTrSnoIsNull() {
            addCriterion("ORGL_TR_SNO is null");
            return (Criteria) this;
        }

        public Criteria andOrglTrSnoIsNotNull() {
            addCriterion("ORGL_TR_SNO is not null");
            return (Criteria) this;
        }

        public Criteria andOrglTrSnoEqualTo(Long value) {
            addCriterion("ORGL_TR_SNO =", value, "orglTrSno");
            return (Criteria) this;
        }

        public Criteria andOrglTrSnoNotEqualTo(Long value) {
            addCriterion("ORGL_TR_SNO <>", value, "orglTrSno");
            return (Criteria) this;
        }

        public Criteria andOrglTrSnoGreaterThan(Long value) {
            addCriterion("ORGL_TR_SNO >", value, "orglTrSno");
            return (Criteria) this;
        }

        public Criteria andOrglTrSnoGreaterThanOrEqualTo(Long value) {
            addCriterion("ORGL_TR_SNO >=", value, "orglTrSno");
            return (Criteria) this;
        }

        public Criteria andOrglTrSnoLessThan(Long value) {
            addCriterion("ORGL_TR_SNO <", value, "orglTrSno");
            return (Criteria) this;
        }

        public Criteria andOrglTrSnoLessThanOrEqualTo(Long value) {
            addCriterion("ORGL_TR_SNO <=", value, "orglTrSno");
            return (Criteria) this;
        }

        public Criteria andOrglTrSnoIn(List<Long> values) {
            addCriterion("ORGL_TR_SNO in", values, "orglTrSno");
            return (Criteria) this;
        }

        public Criteria andOrglTrSnoNotIn(List<Long> values) {
            addCriterion("ORGL_TR_SNO not in", values, "orglTrSno");
            return (Criteria) this;
        }

        public Criteria andOrglTrSnoBetween(Long value1, Long value2) {
            addCriterion("ORGL_TR_SNO between", value1, value2, "orglTrSno");
            return (Criteria) this;
        }

        public Criteria andOrglTrSnoNotBetween(Long value1, Long value2) {
            addCriterion("ORGL_TR_SNO not between", value1, value2, "orglTrSno");
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