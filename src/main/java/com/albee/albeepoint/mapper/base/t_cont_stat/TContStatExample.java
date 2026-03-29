package com.albee.albeepoint.mapper.base.t_cont_stat;

import java.time.LocalDateTime;
import java.util.ArrayList;
import java.util.List;

public class TContStatExample {
    protected String orderByClause;

    protected boolean distinct;

    protected List<Criteria> oredCriteria;

    public TContStatExample() {
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

        public Criteria andBaseDayIsNull() {
            addCriterion("BASE_DAY is null");
            return (Criteria) this;
        }

        public Criteria andBaseDayIsNotNull() {
            addCriterion("BASE_DAY is not null");
            return (Criteria) this;
        }

        public Criteria andBaseDayEqualTo(String value) {
            addCriterion("BASE_DAY =", value, "baseDay");
            return (Criteria) this;
        }

        public Criteria andBaseDayNotEqualTo(String value) {
            addCriterion("BASE_DAY <>", value, "baseDay");
            return (Criteria) this;
        }

        public Criteria andBaseDayGreaterThan(String value) {
            addCriterion("BASE_DAY >", value, "baseDay");
            return (Criteria) this;
        }

        public Criteria andBaseDayGreaterThanOrEqualTo(String value) {
            addCriterion("BASE_DAY >=", value, "baseDay");
            return (Criteria) this;
        }

        public Criteria andBaseDayLessThan(String value) {
            addCriterion("BASE_DAY <", value, "baseDay");
            return (Criteria) this;
        }

        public Criteria andBaseDayLessThanOrEqualTo(String value) {
            addCriterion("BASE_DAY <=", value, "baseDay");
            return (Criteria) this;
        }

        public Criteria andBaseDayLike(String value) {
            addCriterion("BASE_DAY like", value, "baseDay");
            return (Criteria) this;
        }

        public Criteria andBaseDayNotLike(String value) {
            addCriterion("BASE_DAY not like", value, "baseDay");
            return (Criteria) this;
        }

        public Criteria andBaseDayIn(List<String> values) {
            addCriterion("BASE_DAY in", values, "baseDay");
            return (Criteria) this;
        }

        public Criteria andBaseDayNotIn(List<String> values) {
            addCriterion("BASE_DAY not in", values, "baseDay");
            return (Criteria) this;
        }

        public Criteria andBaseDayBetween(String value1, String value2) {
            addCriterion("BASE_DAY between", value1, value2, "baseDay");
            return (Criteria) this;
        }

        public Criteria andBaseDayNotBetween(String value1, String value2) {
            addCriterion("BASE_DAY not between", value1, value2, "baseDay");
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

        public Criteria andContStatGbCdIsNull() {
            addCriterion("CONT_STAT_GB_CD is null");
            return (Criteria) this;
        }

        public Criteria andContStatGbCdIsNotNull() {
            addCriterion("CONT_STAT_GB_CD is not null");
            return (Criteria) this;
        }

        public Criteria andContStatGbCdEqualTo(String value) {
            addCriterion("CONT_STAT_GB_CD =", value, "contStatGbCd");
            return (Criteria) this;
        }

        public Criteria andContStatGbCdNotEqualTo(String value) {
            addCriterion("CONT_STAT_GB_CD <>", value, "contStatGbCd");
            return (Criteria) this;
        }

        public Criteria andContStatGbCdGreaterThan(String value) {
            addCriterion("CONT_STAT_GB_CD >", value, "contStatGbCd");
            return (Criteria) this;
        }

        public Criteria andContStatGbCdGreaterThanOrEqualTo(String value) {
            addCriterion("CONT_STAT_GB_CD >=", value, "contStatGbCd");
            return (Criteria) this;
        }

        public Criteria andContStatGbCdLessThan(String value) {
            addCriterion("CONT_STAT_GB_CD <", value, "contStatGbCd");
            return (Criteria) this;
        }

        public Criteria andContStatGbCdLessThanOrEqualTo(String value) {
            addCriterion("CONT_STAT_GB_CD <=", value, "contStatGbCd");
            return (Criteria) this;
        }

        public Criteria andContStatGbCdLike(String value) {
            addCriterion("CONT_STAT_GB_CD like", value, "contStatGbCd");
            return (Criteria) this;
        }

        public Criteria andContStatGbCdNotLike(String value) {
            addCriterion("CONT_STAT_GB_CD not like", value, "contStatGbCd");
            return (Criteria) this;
        }

        public Criteria andContStatGbCdIn(List<String> values) {
            addCriterion("CONT_STAT_GB_CD in", values, "contStatGbCd");
            return (Criteria) this;
        }

        public Criteria andContStatGbCdNotIn(List<String> values) {
            addCriterion("CONT_STAT_GB_CD not in", values, "contStatGbCd");
            return (Criteria) this;
        }

        public Criteria andContStatGbCdBetween(String value1, String value2) {
            addCriterion("CONT_STAT_GB_CD between", value1, value2, "contStatGbCd");
            return (Criteria) this;
        }

        public Criteria andContStatGbCdNotBetween(String value1, String value2) {
            addCriterion("CONT_STAT_GB_CD not between", value1, value2, "contStatGbCd");
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

        public Criteria andTotalIsuPtIsNull() {
            addCriterion("TOTAL_ISU_PT is null");
            return (Criteria) this;
        }

        public Criteria andTotalIsuPtIsNotNull() {
            addCriterion("TOTAL_ISU_PT is not null");
            return (Criteria) this;
        }

        public Criteria andTotalIsuPtEqualTo(Long value) {
            addCriterion("TOTAL_ISU_PT =", value, "totalIsuPt");
            return (Criteria) this;
        }

        public Criteria andTotalIsuPtNotEqualTo(Long value) {
            addCriterion("TOTAL_ISU_PT <>", value, "totalIsuPt");
            return (Criteria) this;
        }

        public Criteria andTotalIsuPtGreaterThan(Long value) {
            addCriterion("TOTAL_ISU_PT >", value, "totalIsuPt");
            return (Criteria) this;
        }

        public Criteria andTotalIsuPtGreaterThanOrEqualTo(Long value) {
            addCriterion("TOTAL_ISU_PT >=", value, "totalIsuPt");
            return (Criteria) this;
        }

        public Criteria andTotalIsuPtLessThan(Long value) {
            addCriterion("TOTAL_ISU_PT <", value, "totalIsuPt");
            return (Criteria) this;
        }

        public Criteria andTotalIsuPtLessThanOrEqualTo(Long value) {
            addCriterion("TOTAL_ISU_PT <=", value, "totalIsuPt");
            return (Criteria) this;
        }

        public Criteria andTotalIsuPtIn(List<Long> values) {
            addCriterion("TOTAL_ISU_PT in", values, "totalIsuPt");
            return (Criteria) this;
        }

        public Criteria andTotalIsuPtNotIn(List<Long> values) {
            addCriterion("TOTAL_ISU_PT not in", values, "totalIsuPt");
            return (Criteria) this;
        }

        public Criteria andTotalIsuPtBetween(Long value1, Long value2) {
            addCriterion("TOTAL_ISU_PT between", value1, value2, "totalIsuPt");
            return (Criteria) this;
        }

        public Criteria andTotalIsuPtNotBetween(Long value1, Long value2) {
            addCriterion("TOTAL_ISU_PT not between", value1, value2, "totalIsuPt");
            return (Criteria) this;
        }

        public Criteria andTotalIsuCntIsNull() {
            addCriterion("TOTAL_ISU_CNT is null");
            return (Criteria) this;
        }

        public Criteria andTotalIsuCntIsNotNull() {
            addCriterion("TOTAL_ISU_CNT is not null");
            return (Criteria) this;
        }

        public Criteria andTotalIsuCntEqualTo(Long value) {
            addCriterion("TOTAL_ISU_CNT =", value, "totalIsuCnt");
            return (Criteria) this;
        }

        public Criteria andTotalIsuCntNotEqualTo(Long value) {
            addCriterion("TOTAL_ISU_CNT <>", value, "totalIsuCnt");
            return (Criteria) this;
        }

        public Criteria andTotalIsuCntGreaterThan(Long value) {
            addCriterion("TOTAL_ISU_CNT >", value, "totalIsuCnt");
            return (Criteria) this;
        }

        public Criteria andTotalIsuCntGreaterThanOrEqualTo(Long value) {
            addCriterion("TOTAL_ISU_CNT >=", value, "totalIsuCnt");
            return (Criteria) this;
        }

        public Criteria andTotalIsuCntLessThan(Long value) {
            addCriterion("TOTAL_ISU_CNT <", value, "totalIsuCnt");
            return (Criteria) this;
        }

        public Criteria andTotalIsuCntLessThanOrEqualTo(Long value) {
            addCriterion("TOTAL_ISU_CNT <=", value, "totalIsuCnt");
            return (Criteria) this;
        }

        public Criteria andTotalIsuCntIn(List<Long> values) {
            addCriterion("TOTAL_ISU_CNT in", values, "totalIsuCnt");
            return (Criteria) this;
        }

        public Criteria andTotalIsuCntNotIn(List<Long> values) {
            addCriterion("TOTAL_ISU_CNT not in", values, "totalIsuCnt");
            return (Criteria) this;
        }

        public Criteria andTotalIsuCntBetween(Long value1, Long value2) {
            addCriterion("TOTAL_ISU_CNT between", value1, value2, "totalIsuCnt");
            return (Criteria) this;
        }

        public Criteria andTotalIsuCntNotBetween(Long value1, Long value2) {
            addCriterion("TOTAL_ISU_CNT not between", value1, value2, "totalIsuCnt");
            return (Criteria) this;
        }

        public Criteria andTotalUsePtIsNull() {
            addCriterion("TOTAL_USE_PT is null");
            return (Criteria) this;
        }

        public Criteria andTotalUsePtIsNotNull() {
            addCriterion("TOTAL_USE_PT is not null");
            return (Criteria) this;
        }

        public Criteria andTotalUsePtEqualTo(Long value) {
            addCriterion("TOTAL_USE_PT =", value, "totalUsePt");
            return (Criteria) this;
        }

        public Criteria andTotalUsePtNotEqualTo(Long value) {
            addCriterion("TOTAL_USE_PT <>", value, "totalUsePt");
            return (Criteria) this;
        }

        public Criteria andTotalUsePtGreaterThan(Long value) {
            addCriterion("TOTAL_USE_PT >", value, "totalUsePt");
            return (Criteria) this;
        }

        public Criteria andTotalUsePtGreaterThanOrEqualTo(Long value) {
            addCriterion("TOTAL_USE_PT >=", value, "totalUsePt");
            return (Criteria) this;
        }

        public Criteria andTotalUsePtLessThan(Long value) {
            addCriterion("TOTAL_USE_PT <", value, "totalUsePt");
            return (Criteria) this;
        }

        public Criteria andTotalUsePtLessThanOrEqualTo(Long value) {
            addCriterion("TOTAL_USE_PT <=", value, "totalUsePt");
            return (Criteria) this;
        }

        public Criteria andTotalUsePtIn(List<Long> values) {
            addCriterion("TOTAL_USE_PT in", values, "totalUsePt");
            return (Criteria) this;
        }

        public Criteria andTotalUsePtNotIn(List<Long> values) {
            addCriterion("TOTAL_USE_PT not in", values, "totalUsePt");
            return (Criteria) this;
        }

        public Criteria andTotalUsePtBetween(Long value1, Long value2) {
            addCriterion("TOTAL_USE_PT between", value1, value2, "totalUsePt");
            return (Criteria) this;
        }

        public Criteria andTotalUsePtNotBetween(Long value1, Long value2) {
            addCriterion("TOTAL_USE_PT not between", value1, value2, "totalUsePt");
            return (Criteria) this;
        }

        public Criteria andTotalUseCntIsNull() {
            addCriterion("TOTAL_USE_CNT is null");
            return (Criteria) this;
        }

        public Criteria andTotalUseCntIsNotNull() {
            addCriterion("TOTAL_USE_CNT is not null");
            return (Criteria) this;
        }

        public Criteria andTotalUseCntEqualTo(Long value) {
            addCriterion("TOTAL_USE_CNT =", value, "totalUseCnt");
            return (Criteria) this;
        }

        public Criteria andTotalUseCntNotEqualTo(Long value) {
            addCriterion("TOTAL_USE_CNT <>", value, "totalUseCnt");
            return (Criteria) this;
        }

        public Criteria andTotalUseCntGreaterThan(Long value) {
            addCriterion("TOTAL_USE_CNT >", value, "totalUseCnt");
            return (Criteria) this;
        }

        public Criteria andTotalUseCntGreaterThanOrEqualTo(Long value) {
            addCriterion("TOTAL_USE_CNT >=", value, "totalUseCnt");
            return (Criteria) this;
        }

        public Criteria andTotalUseCntLessThan(Long value) {
            addCriterion("TOTAL_USE_CNT <", value, "totalUseCnt");
            return (Criteria) this;
        }

        public Criteria andTotalUseCntLessThanOrEqualTo(Long value) {
            addCriterion("TOTAL_USE_CNT <=", value, "totalUseCnt");
            return (Criteria) this;
        }

        public Criteria andTotalUseCntIn(List<Long> values) {
            addCriterion("TOTAL_USE_CNT in", values, "totalUseCnt");
            return (Criteria) this;
        }

        public Criteria andTotalUseCntNotIn(List<Long> values) {
            addCriterion("TOTAL_USE_CNT not in", values, "totalUseCnt");
            return (Criteria) this;
        }

        public Criteria andTotalUseCntBetween(Long value1, Long value2) {
            addCriterion("TOTAL_USE_CNT between", value1, value2, "totalUseCnt");
            return (Criteria) this;
        }

        public Criteria andTotalUseCntNotBetween(Long value1, Long value2) {
            addCriterion("TOTAL_USE_CNT not between", value1, value2, "totalUseCnt");
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