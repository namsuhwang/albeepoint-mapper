package com.albee.albeepoint.mapper.base.t_pt_mst;

import java.time.LocalDateTime;
import java.util.ArrayList;
import java.util.List;

public class TPtMstExample {
    protected String orderByClause;

    protected boolean distinct;

    protected List<Criteria> oredCriteria;

    public TPtMstExample() {
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

        public Criteria andMemberPtNoIsNull() {
            addCriterion("MEMBER_PT_NO is null");
            return (Criteria) this;
        }

        public Criteria andMemberPtNoIsNotNull() {
            addCriterion("MEMBER_PT_NO is not null");
            return (Criteria) this;
        }

        public Criteria andMemberPtNoEqualTo(Long value) {
            addCriterion("MEMBER_PT_NO =", value, "memberPtNo");
            return (Criteria) this;
        }

        public Criteria andMemberPtNoNotEqualTo(Long value) {
            addCriterion("MEMBER_PT_NO <>", value, "memberPtNo");
            return (Criteria) this;
        }

        public Criteria andMemberPtNoGreaterThan(Long value) {
            addCriterion("MEMBER_PT_NO >", value, "memberPtNo");
            return (Criteria) this;
        }

        public Criteria andMemberPtNoGreaterThanOrEqualTo(Long value) {
            addCriterion("MEMBER_PT_NO >=", value, "memberPtNo");
            return (Criteria) this;
        }

        public Criteria andMemberPtNoLessThan(Long value) {
            addCriterion("MEMBER_PT_NO <", value, "memberPtNo");
            return (Criteria) this;
        }

        public Criteria andMemberPtNoLessThanOrEqualTo(Long value) {
            addCriterion("MEMBER_PT_NO <=", value, "memberPtNo");
            return (Criteria) this;
        }

        public Criteria andMemberPtNoIn(List<Long> values) {
            addCriterion("MEMBER_PT_NO in", values, "memberPtNo");
            return (Criteria) this;
        }

        public Criteria andMemberPtNoNotIn(List<Long> values) {
            addCriterion("MEMBER_PT_NO not in", values, "memberPtNo");
            return (Criteria) this;
        }

        public Criteria andMemberPtNoBetween(Long value1, Long value2) {
            addCriterion("MEMBER_PT_NO between", value1, value2, "memberPtNo");
            return (Criteria) this;
        }

        public Criteria andMemberPtNoNotBetween(Long value1, Long value2) {
            addCriterion("MEMBER_PT_NO not between", value1, value2, "memberPtNo");
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

        public Criteria andIsuDyIsNull() {
            addCriterion("ISU_DY is null");
            return (Criteria) this;
        }

        public Criteria andIsuDyIsNotNull() {
            addCriterion("ISU_DY is not null");
            return (Criteria) this;
        }

        public Criteria andIsuDyEqualTo(String value) {
            addCriterion("ISU_DY =", value, "isuDy");
            return (Criteria) this;
        }

        public Criteria andIsuDyNotEqualTo(String value) {
            addCriterion("ISU_DY <>", value, "isuDy");
            return (Criteria) this;
        }

        public Criteria andIsuDyGreaterThan(String value) {
            addCriterion("ISU_DY >", value, "isuDy");
            return (Criteria) this;
        }

        public Criteria andIsuDyGreaterThanOrEqualTo(String value) {
            addCriterion("ISU_DY >=", value, "isuDy");
            return (Criteria) this;
        }

        public Criteria andIsuDyLessThan(String value) {
            addCriterion("ISU_DY <", value, "isuDy");
            return (Criteria) this;
        }

        public Criteria andIsuDyLessThanOrEqualTo(String value) {
            addCriterion("ISU_DY <=", value, "isuDy");
            return (Criteria) this;
        }

        public Criteria andIsuDyLike(String value) {
            addCriterion("ISU_DY like", value, "isuDy");
            return (Criteria) this;
        }

        public Criteria andIsuDyNotLike(String value) {
            addCriterion("ISU_DY not like", value, "isuDy");
            return (Criteria) this;
        }

        public Criteria andIsuDyIn(List<String> values) {
            addCriterion("ISU_DY in", values, "isuDy");
            return (Criteria) this;
        }

        public Criteria andIsuDyNotIn(List<String> values) {
            addCriterion("ISU_DY not in", values, "isuDy");
            return (Criteria) this;
        }

        public Criteria andIsuDyBetween(String value1, String value2) {
            addCriterion("ISU_DY between", value1, value2, "isuDy");
            return (Criteria) this;
        }

        public Criteria andIsuDyNotBetween(String value1, String value2) {
            addCriterion("ISU_DY not between", value1, value2, "isuDy");
            return (Criteria) this;
        }

        public Criteria andIsuDtIsNull() {
            addCriterion("ISU_DT is null");
            return (Criteria) this;
        }

        public Criteria andIsuDtIsNotNull() {
            addCriterion("ISU_DT is not null");
            return (Criteria) this;
        }

        public Criteria andIsuDtEqualTo(LocalDateTime value) {
            addCriterion("ISU_DT =", value, "isuDt");
            return (Criteria) this;
        }

        public Criteria andIsuDtNotEqualTo(LocalDateTime value) {
            addCriterion("ISU_DT <>", value, "isuDt");
            return (Criteria) this;
        }

        public Criteria andIsuDtGreaterThan(LocalDateTime value) {
            addCriterion("ISU_DT >", value, "isuDt");
            return (Criteria) this;
        }

        public Criteria andIsuDtGreaterThanOrEqualTo(LocalDateTime value) {
            addCriterion("ISU_DT >=", value, "isuDt");
            return (Criteria) this;
        }

        public Criteria andIsuDtLessThan(LocalDateTime value) {
            addCriterion("ISU_DT <", value, "isuDt");
            return (Criteria) this;
        }

        public Criteria andIsuDtLessThanOrEqualTo(LocalDateTime value) {
            addCriterion("ISU_DT <=", value, "isuDt");
            return (Criteria) this;
        }

        public Criteria andIsuDtIn(List<LocalDateTime> values) {
            addCriterion("ISU_DT in", values, "isuDt");
            return (Criteria) this;
        }

        public Criteria andIsuDtNotIn(List<LocalDateTime> values) {
            addCriterion("ISU_DT not in", values, "isuDt");
            return (Criteria) this;
        }

        public Criteria andIsuDtBetween(LocalDateTime value1, LocalDateTime value2) {
            addCriterion("ISU_DT between", value1, value2, "isuDt");
            return (Criteria) this;
        }

        public Criteria andIsuDtNotBetween(LocalDateTime value1, LocalDateTime value2) {
            addCriterion("ISU_DT not between", value1, value2, "isuDt");
            return (Criteria) this;
        }

        public Criteria andBalPtIsNull() {
            addCriterion("BAL_PT is null");
            return (Criteria) this;
        }

        public Criteria andBalPtIsNotNull() {
            addCriterion("BAL_PT is not null");
            return (Criteria) this;
        }

        public Criteria andBalPtEqualTo(Long value) {
            addCriterion("BAL_PT =", value, "balPt");
            return (Criteria) this;
        }

        public Criteria andBalPtNotEqualTo(Long value) {
            addCriterion("BAL_PT <>", value, "balPt");
            return (Criteria) this;
        }

        public Criteria andBalPtGreaterThan(Long value) {
            addCriterion("BAL_PT >", value, "balPt");
            return (Criteria) this;
        }

        public Criteria andBalPtGreaterThanOrEqualTo(Long value) {
            addCriterion("BAL_PT >=", value, "balPt");
            return (Criteria) this;
        }

        public Criteria andBalPtLessThan(Long value) {
            addCriterion("BAL_PT <", value, "balPt");
            return (Criteria) this;
        }

        public Criteria andBalPtLessThanOrEqualTo(Long value) {
            addCriterion("BAL_PT <=", value, "balPt");
            return (Criteria) this;
        }

        public Criteria andBalPtIn(List<Long> values) {
            addCriterion("BAL_PT in", values, "balPt");
            return (Criteria) this;
        }

        public Criteria andBalPtNotIn(List<Long> values) {
            addCriterion("BAL_PT not in", values, "balPt");
            return (Criteria) this;
        }

        public Criteria andBalPtBetween(Long value1, Long value2) {
            addCriterion("BAL_PT between", value1, value2, "balPt");
            return (Criteria) this;
        }

        public Criteria andBalPtNotBetween(Long value1, Long value2) {
            addCriterion("BAL_PT not between", value1, value2, "balPt");
            return (Criteria) this;
        }

        public Criteria andIsuPtIsNull() {
            addCriterion("ISU_PT is null");
            return (Criteria) this;
        }

        public Criteria andIsuPtIsNotNull() {
            addCriterion("ISU_PT is not null");
            return (Criteria) this;
        }

        public Criteria andIsuPtEqualTo(Long value) {
            addCriterion("ISU_PT =", value, "isuPt");
            return (Criteria) this;
        }

        public Criteria andIsuPtNotEqualTo(Long value) {
            addCriterion("ISU_PT <>", value, "isuPt");
            return (Criteria) this;
        }

        public Criteria andIsuPtGreaterThan(Long value) {
            addCriterion("ISU_PT >", value, "isuPt");
            return (Criteria) this;
        }

        public Criteria andIsuPtGreaterThanOrEqualTo(Long value) {
            addCriterion("ISU_PT >=", value, "isuPt");
            return (Criteria) this;
        }

        public Criteria andIsuPtLessThan(Long value) {
            addCriterion("ISU_PT <", value, "isuPt");
            return (Criteria) this;
        }

        public Criteria andIsuPtLessThanOrEqualTo(Long value) {
            addCriterion("ISU_PT <=", value, "isuPt");
            return (Criteria) this;
        }

        public Criteria andIsuPtIn(List<Long> values) {
            addCriterion("ISU_PT in", values, "isuPt");
            return (Criteria) this;
        }

        public Criteria andIsuPtNotIn(List<Long> values) {
            addCriterion("ISU_PT not in", values, "isuPt");
            return (Criteria) this;
        }

        public Criteria andIsuPtBetween(Long value1, Long value2) {
            addCriterion("ISU_PT between", value1, value2, "isuPt");
            return (Criteria) this;
        }

        public Criteria andIsuPtNotBetween(Long value1, Long value2) {
            addCriterion("ISU_PT not between", value1, value2, "isuPt");
            return (Criteria) this;
        }

        public Criteria andIsuCancelPtIsNull() {
            addCriterion("ISU_CANCEL_PT is null");
            return (Criteria) this;
        }

        public Criteria andIsuCancelPtIsNotNull() {
            addCriterion("ISU_CANCEL_PT is not null");
            return (Criteria) this;
        }

        public Criteria andIsuCancelPtEqualTo(Long value) {
            addCriterion("ISU_CANCEL_PT =", value, "isuCancelPt");
            return (Criteria) this;
        }

        public Criteria andIsuCancelPtNotEqualTo(Long value) {
            addCriterion("ISU_CANCEL_PT <>", value, "isuCancelPt");
            return (Criteria) this;
        }

        public Criteria andIsuCancelPtGreaterThan(Long value) {
            addCriterion("ISU_CANCEL_PT >", value, "isuCancelPt");
            return (Criteria) this;
        }

        public Criteria andIsuCancelPtGreaterThanOrEqualTo(Long value) {
            addCriterion("ISU_CANCEL_PT >=", value, "isuCancelPt");
            return (Criteria) this;
        }

        public Criteria andIsuCancelPtLessThan(Long value) {
            addCriterion("ISU_CANCEL_PT <", value, "isuCancelPt");
            return (Criteria) this;
        }

        public Criteria andIsuCancelPtLessThanOrEqualTo(Long value) {
            addCriterion("ISU_CANCEL_PT <=", value, "isuCancelPt");
            return (Criteria) this;
        }

        public Criteria andIsuCancelPtIn(List<Long> values) {
            addCriterion("ISU_CANCEL_PT in", values, "isuCancelPt");
            return (Criteria) this;
        }

        public Criteria andIsuCancelPtNotIn(List<Long> values) {
            addCriterion("ISU_CANCEL_PT not in", values, "isuCancelPt");
            return (Criteria) this;
        }

        public Criteria andIsuCancelPtBetween(Long value1, Long value2) {
            addCriterion("ISU_CANCEL_PT between", value1, value2, "isuCancelPt");
            return (Criteria) this;
        }

        public Criteria andIsuCancelPtNotBetween(Long value1, Long value2) {
            addCriterion("ISU_CANCEL_PT not between", value1, value2, "isuCancelPt");
            return (Criteria) this;
        }

        public Criteria andUsePtIsNull() {
            addCriterion("USE_PT is null");
            return (Criteria) this;
        }

        public Criteria andUsePtIsNotNull() {
            addCriterion("USE_PT is not null");
            return (Criteria) this;
        }

        public Criteria andUsePtEqualTo(Long value) {
            addCriterion("USE_PT =", value, "usePt");
            return (Criteria) this;
        }

        public Criteria andUsePtNotEqualTo(Long value) {
            addCriterion("USE_PT <>", value, "usePt");
            return (Criteria) this;
        }

        public Criteria andUsePtGreaterThan(Long value) {
            addCriterion("USE_PT >", value, "usePt");
            return (Criteria) this;
        }

        public Criteria andUsePtGreaterThanOrEqualTo(Long value) {
            addCriterion("USE_PT >=", value, "usePt");
            return (Criteria) this;
        }

        public Criteria andUsePtLessThan(Long value) {
            addCriterion("USE_PT <", value, "usePt");
            return (Criteria) this;
        }

        public Criteria andUsePtLessThanOrEqualTo(Long value) {
            addCriterion("USE_PT <=", value, "usePt");
            return (Criteria) this;
        }

        public Criteria andUsePtIn(List<Long> values) {
            addCriterion("USE_PT in", values, "usePt");
            return (Criteria) this;
        }

        public Criteria andUsePtNotIn(List<Long> values) {
            addCriterion("USE_PT not in", values, "usePt");
            return (Criteria) this;
        }

        public Criteria andUsePtBetween(Long value1, Long value2) {
            addCriterion("USE_PT between", value1, value2, "usePt");
            return (Criteria) this;
        }

        public Criteria andUsePtNotBetween(Long value1, Long value2) {
            addCriterion("USE_PT not between", value1, value2, "usePt");
            return (Criteria) this;
        }

        public Criteria andUseCancelPtIsNull() {
            addCriterion("USE_CANCEL_PT is null");
            return (Criteria) this;
        }

        public Criteria andUseCancelPtIsNotNull() {
            addCriterion("USE_CANCEL_PT is not null");
            return (Criteria) this;
        }

        public Criteria andUseCancelPtEqualTo(Long value) {
            addCriterion("USE_CANCEL_PT =", value, "useCancelPt");
            return (Criteria) this;
        }

        public Criteria andUseCancelPtNotEqualTo(Long value) {
            addCriterion("USE_CANCEL_PT <>", value, "useCancelPt");
            return (Criteria) this;
        }

        public Criteria andUseCancelPtGreaterThan(Long value) {
            addCriterion("USE_CANCEL_PT >", value, "useCancelPt");
            return (Criteria) this;
        }

        public Criteria andUseCancelPtGreaterThanOrEqualTo(Long value) {
            addCriterion("USE_CANCEL_PT >=", value, "useCancelPt");
            return (Criteria) this;
        }

        public Criteria andUseCancelPtLessThan(Long value) {
            addCriterion("USE_CANCEL_PT <", value, "useCancelPt");
            return (Criteria) this;
        }

        public Criteria andUseCancelPtLessThanOrEqualTo(Long value) {
            addCriterion("USE_CANCEL_PT <=", value, "useCancelPt");
            return (Criteria) this;
        }

        public Criteria andUseCancelPtIn(List<Long> values) {
            addCriterion("USE_CANCEL_PT in", values, "useCancelPt");
            return (Criteria) this;
        }

        public Criteria andUseCancelPtNotIn(List<Long> values) {
            addCriterion("USE_CANCEL_PT not in", values, "useCancelPt");
            return (Criteria) this;
        }

        public Criteria andUseCancelPtBetween(Long value1, Long value2) {
            addCriterion("USE_CANCEL_PT between", value1, value2, "useCancelPt");
            return (Criteria) this;
        }

        public Criteria andUseCancelPtNotBetween(Long value1, Long value2) {
            addCriterion("USE_CANCEL_PT not between", value1, value2, "useCancelPt");
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

        public Criteria andExpProcDtIsNull() {
            addCriterion("EXP_PROC_DT is null");
            return (Criteria) this;
        }

        public Criteria andExpProcDtIsNotNull() {
            addCriterion("EXP_PROC_DT is not null");
            return (Criteria) this;
        }

        public Criteria andExpProcDtEqualTo(LocalDateTime value) {
            addCriterion("EXP_PROC_DT =", value, "expProcDt");
            return (Criteria) this;
        }

        public Criteria andExpProcDtNotEqualTo(LocalDateTime value) {
            addCriterion("EXP_PROC_DT <>", value, "expProcDt");
            return (Criteria) this;
        }

        public Criteria andExpProcDtGreaterThan(LocalDateTime value) {
            addCriterion("EXP_PROC_DT >", value, "expProcDt");
            return (Criteria) this;
        }

        public Criteria andExpProcDtGreaterThanOrEqualTo(LocalDateTime value) {
            addCriterion("EXP_PROC_DT >=", value, "expProcDt");
            return (Criteria) this;
        }

        public Criteria andExpProcDtLessThan(LocalDateTime value) {
            addCriterion("EXP_PROC_DT <", value, "expProcDt");
            return (Criteria) this;
        }

        public Criteria andExpProcDtLessThanOrEqualTo(LocalDateTime value) {
            addCriterion("EXP_PROC_DT <=", value, "expProcDt");
            return (Criteria) this;
        }

        public Criteria andExpProcDtIn(List<LocalDateTime> values) {
            addCriterion("EXP_PROC_DT in", values, "expProcDt");
            return (Criteria) this;
        }

        public Criteria andExpProcDtNotIn(List<LocalDateTime> values) {
            addCriterion("EXP_PROC_DT not in", values, "expProcDt");
            return (Criteria) this;
        }

        public Criteria andExpProcDtBetween(LocalDateTime value1, LocalDateTime value2) {
            addCriterion("EXP_PROC_DT between", value1, value2, "expProcDt");
            return (Criteria) this;
        }

        public Criteria andExpProcDtNotBetween(LocalDateTime value1, LocalDateTime value2) {
            addCriterion("EXP_PROC_DT not between", value1, value2, "expProcDt");
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