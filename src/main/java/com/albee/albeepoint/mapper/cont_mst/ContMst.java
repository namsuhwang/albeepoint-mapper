package com.albee.albeepoint.mapper.cont_mst;

import java.io.Serializable;
import java.time.LocalDateTime;

public class ContMst implements Serializable {
    private Long contNo;

    private String contNm;

    private String ptTypeCd;

    private LocalDateTime startDt;

    private LocalDateTime endDt;

    private LocalDateTime isuStartDt;

    private LocalDateTime isuEndDt;

    private LocalDateTime useStartDt;

    private LocalDateTime useEndDt;

    private LocalDateTime contRegDt;

    private String useStartDtCalcTypeCd;

    private Integer useStartDtCalcVal;

    private String usePeriodCalcTypeCd;

    private Integer usePeriodCalcVal;

    private String contStsCd;

    private String mixUseYn;

    private String isuPeriodLimitTypeCd;

    private Long isuPeriodMaxPt;

    private Integer isuPeriodMaxCnt;

    private String onceIsuLimitTypeCd;

    private Long onceIsuFixPt;

    private Double onceIsuPurchaseRate;

    private Long onceIsuMinPt;

    private Long onceIsuMaxPt;

    private String usePeriodLimitTypeCd;

    private Long usePeriodMaxPt;

    private Integer usePeriodMaxCnt;

    private String onceUseLimitTypeCd;

    private Long onceUseFixPt;

    private Double onceUsePurchaseRate;

    private Long onceUseMinPt;

    private Long onceUseMaxPt;

    private String totalIsuLimitTypeCd;

    private Long totalIsuAblePt;

    private Long totalIsuAbleCnt;

    private Long minPurchaseAmt;

    private String regUserId;

    private LocalDateTime regDt;

    private String lastModUserId;

    private LocalDateTime lastModDt;

    private static final long serialVersionUID = 1L;

    public Long getContNo() {
        return contNo;
    }

    public void setContNo(Long contNo) {
        this.contNo = contNo;
    }

    public String getContNm() {
        return contNm;
    }

    public void setContNm(String contNm) {
        this.contNm = contNm == null ? null : contNm.trim();
    }

    public String getPtTypeCd() {
        return ptTypeCd;
    }

    public void setPtTypeCd(String ptTypeCd) {
        this.ptTypeCd = ptTypeCd == null ? null : ptTypeCd.trim();
    }

    public LocalDateTime getStartDt() {
        return startDt;
    }

    public void setStartDt(LocalDateTime startDt) {
        this.startDt = startDt;
    }

    public LocalDateTime getEndDt() {
        return endDt;
    }

    public void setEndDt(LocalDateTime endDt) {
        this.endDt = endDt;
    }

    public LocalDateTime getIsuStartDt() {
        return isuStartDt;
    }

    public void setIsuStartDt(LocalDateTime isuStartDt) {
        this.isuStartDt = isuStartDt;
    }

    public LocalDateTime getIsuEndDt() {
        return isuEndDt;
    }

    public void setIsuEndDt(LocalDateTime isuEndDt) {
        this.isuEndDt = isuEndDt;
    }

    public LocalDateTime getUseStartDt() {
        return useStartDt;
    }

    public void setUseStartDt(LocalDateTime useStartDt) {
        this.useStartDt = useStartDt;
    }

    public LocalDateTime getUseEndDt() {
        return useEndDt;
    }

    public void setUseEndDt(LocalDateTime useEndDt) {
        this.useEndDt = useEndDt;
    }

    public LocalDateTime getContRegDt() {
        return contRegDt;
    }

    public void setContRegDt(LocalDateTime contRegDt) {
        this.contRegDt = contRegDt;
    }

    public String getUseStartDtCalcTypeCd() {
        return useStartDtCalcTypeCd;
    }

    public void setUseStartDtCalcTypeCd(String useStartDtCalcTypeCd) {
        this.useStartDtCalcTypeCd = useStartDtCalcTypeCd == null ? null : useStartDtCalcTypeCd.trim();
    }

    public Integer getUseStartDtCalcVal() {
        return useStartDtCalcVal;
    }

    public void setUseStartDtCalcVal(Integer useStartDtCalcVal) {
        this.useStartDtCalcVal = useStartDtCalcVal;
    }

    public String getUsePeriodCalcTypeCd() {
        return usePeriodCalcTypeCd;
    }

    public void setUsePeriodCalcTypeCd(String usePeriodCalcTypeCd) {
        this.usePeriodCalcTypeCd = usePeriodCalcTypeCd == null ? null : usePeriodCalcTypeCd.trim();
    }

    public Integer getUsePeriodCalcVal() {
        return usePeriodCalcVal;
    }

    public void setUsePeriodCalcVal(Integer usePeriodCalcVal) {
        this.usePeriodCalcVal = usePeriodCalcVal;
    }

    public String getContStsCd() {
        return contStsCd;
    }

    public void setContStsCd(String contStsCd) {
        this.contStsCd = contStsCd == null ? null : contStsCd.trim();
    }

    public String getMixUseYn() {
        return mixUseYn;
    }

    public void setMixUseYn(String mixUseYn) {
        this.mixUseYn = mixUseYn == null ? null : mixUseYn.trim();
    }

    public String getIsuPeriodLimitTypeCd() {
        return isuPeriodLimitTypeCd;
    }

    public void setIsuPeriodLimitTypeCd(String isuPeriodLimitTypeCd) {
        this.isuPeriodLimitTypeCd = isuPeriodLimitTypeCd == null ? null : isuPeriodLimitTypeCd.trim();
    }

    public Long getIsuPeriodMaxPt() {
        return isuPeriodMaxPt;
    }

    public void setIsuPeriodMaxPt(Long isuPeriodMaxPt) {
        this.isuPeriodMaxPt = isuPeriodMaxPt;
    }

    public Integer getIsuPeriodMaxCnt() {
        return isuPeriodMaxCnt;
    }

    public void setIsuPeriodMaxCnt(Integer isuPeriodMaxCnt) {
        this.isuPeriodMaxCnt = isuPeriodMaxCnt;
    }

    public String getOnceIsuLimitTypeCd() {
        return onceIsuLimitTypeCd;
    }

    public void setOnceIsuLimitTypeCd(String onceIsuLimitTypeCd) {
        this.onceIsuLimitTypeCd = onceIsuLimitTypeCd == null ? null : onceIsuLimitTypeCd.trim();
    }

    public Long getOnceIsuFixPt() {
        return onceIsuFixPt;
    }

    public void setOnceIsuFixPt(Long onceIsuFixPt) {
        this.onceIsuFixPt = onceIsuFixPt;
    }

    public Double getOnceIsuPurchaseRate() {
        return onceIsuPurchaseRate;
    }

    public void setOnceIsuPurchaseRate(Double onceIsuPurchaseRate) {
        this.onceIsuPurchaseRate = onceIsuPurchaseRate;
    }

    public Long getOnceIsuMinPt() {
        return onceIsuMinPt;
    }

    public void setOnceIsuMinPt(Long onceIsuMinPt) {
        this.onceIsuMinPt = onceIsuMinPt;
    }

    public Long getOnceIsuMaxPt() {
        return onceIsuMaxPt;
    }

    public void setOnceIsuMaxPt(Long onceIsuMaxPt) {
        this.onceIsuMaxPt = onceIsuMaxPt;
    }

    public String getUsePeriodLimitTypeCd() {
        return usePeriodLimitTypeCd;
    }

    public void setUsePeriodLimitTypeCd(String usePeriodLimitTypeCd) {
        this.usePeriodLimitTypeCd = usePeriodLimitTypeCd == null ? null : usePeriodLimitTypeCd.trim();
    }

    public Long getUsePeriodMaxPt() {
        return usePeriodMaxPt;
    }

    public void setUsePeriodMaxPt(Long usePeriodMaxPt) {
        this.usePeriodMaxPt = usePeriodMaxPt;
    }

    public Integer getUsePeriodMaxCnt() {
        return usePeriodMaxCnt;
    }

    public void setUsePeriodMaxCnt(Integer usePeriodMaxCnt) {
        this.usePeriodMaxCnt = usePeriodMaxCnt;
    }

    public String getOnceUseLimitTypeCd() {
        return onceUseLimitTypeCd;
    }

    public void setOnceUseLimitTypeCd(String onceUseLimitTypeCd) {
        this.onceUseLimitTypeCd = onceUseLimitTypeCd == null ? null : onceUseLimitTypeCd.trim();
    }

    public Long getOnceUseFixPt() {
        return onceUseFixPt;
    }

    public void setOnceUseFixPt(Long onceUseFixPt) {
        this.onceUseFixPt = onceUseFixPt;
    }

    public Double getOnceUsePurchaseRate() {
        return onceUsePurchaseRate;
    }

    public void setOnceUsePurchaseRate(Double onceUsePurchaseRate) {
        this.onceUsePurchaseRate = onceUsePurchaseRate;
    }

    public Long getOnceUseMinPt() {
        return onceUseMinPt;
    }

    public void setOnceUseMinPt(Long onceUseMinPt) {
        this.onceUseMinPt = onceUseMinPt;
    }

    public Long getOnceUseMaxPt() {
        return onceUseMaxPt;
    }

    public void setOnceUseMaxPt(Long onceUseMaxPt) {
        this.onceUseMaxPt = onceUseMaxPt;
    }

    public String getTotalIsuLimitTypeCd() {
        return totalIsuLimitTypeCd;
    }

    public void setTotalIsuLimitTypeCd(String totalIsuLimitTypeCd) {
        this.totalIsuLimitTypeCd = totalIsuLimitTypeCd == null ? null : totalIsuLimitTypeCd.trim();
    }

    public Long getTotalIsuAblePt() {
        return totalIsuAblePt;
    }

    public void setTotalIsuAblePt(Long totalIsuAblePt) {
        this.totalIsuAblePt = totalIsuAblePt;
    }

    public Long getTotalIsuAbleCnt() {
        return totalIsuAbleCnt;
    }

    public void setTotalIsuAbleCnt(Long totalIsuAbleCnt) {
        this.totalIsuAbleCnt = totalIsuAbleCnt;
    }

    public Long getMinPurchaseAmt() {
        return minPurchaseAmt;
    }

    public void setMinPurchaseAmt(Long minPurchaseAmt) {
        this.minPurchaseAmt = minPurchaseAmt;
    }

    public String getRegUserId() {
        return regUserId;
    }

    public void setRegUserId(String regUserId) {
        this.regUserId = regUserId == null ? null : regUserId.trim();
    }

    public LocalDateTime getRegDt() {
        return regDt;
    }

    public void setRegDt(LocalDateTime regDt) {
        this.regDt = regDt;
    }

    public String getLastModUserId() {
        return lastModUserId;
    }

    public void setLastModUserId(String lastModUserId) {
        this.lastModUserId = lastModUserId == null ? null : lastModUserId.trim();
    }

    public LocalDateTime getLastModDt() {
        return lastModDt;
    }

    public void setLastModDt(LocalDateTime lastModDt) {
        this.lastModDt = lastModDt;
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append(getClass().getSimpleName());
        sb.append(" [");
        sb.append("Hash = ").append(hashCode());
        sb.append(", contNo=").append(contNo);
        sb.append(", contNm=").append(contNm);
        sb.append(", ptTypeCd=").append(ptTypeCd);
        sb.append(", startDt=").append(startDt);
        sb.append(", endDt=").append(endDt);
        sb.append(", isuStartDt=").append(isuStartDt);
        sb.append(", isuEndDt=").append(isuEndDt);
        sb.append(", useStartDt=").append(useStartDt);
        sb.append(", useEndDt=").append(useEndDt);
        sb.append(", contRegDt=").append(contRegDt);
        sb.append(", useStartDtCalcTypeCd=").append(useStartDtCalcTypeCd);
        sb.append(", useStartDtCalcVal=").append(useStartDtCalcVal);
        sb.append(", usePeriodCalcTypeCd=").append(usePeriodCalcTypeCd);
        sb.append(", usePeriodCalcVal=").append(usePeriodCalcVal);
        sb.append(", contStsCd=").append(contStsCd);
        sb.append(", mixUseYn=").append(mixUseYn);
        sb.append(", isuPeriodLimitTypeCd=").append(isuPeriodLimitTypeCd);
        sb.append(", isuPeriodMaxPt=").append(isuPeriodMaxPt);
        sb.append(", isuPeriodMaxCnt=").append(isuPeriodMaxCnt);
        sb.append(", onceIsuLimitTypeCd=").append(onceIsuLimitTypeCd);
        sb.append(", onceIsuFixPt=").append(onceIsuFixPt);
        sb.append(", onceIsuPurchaseRate=").append(onceIsuPurchaseRate);
        sb.append(", onceIsuMinPt=").append(onceIsuMinPt);
        sb.append(", onceIsuMaxPt=").append(onceIsuMaxPt);
        sb.append(", usePeriodLimitTypeCd=").append(usePeriodLimitTypeCd);
        sb.append(", usePeriodMaxPt=").append(usePeriodMaxPt);
        sb.append(", usePeriodMaxCnt=").append(usePeriodMaxCnt);
        sb.append(", onceUseLimitTypeCd=").append(onceUseLimitTypeCd);
        sb.append(", onceUseFixPt=").append(onceUseFixPt);
        sb.append(", onceUsePurchaseRate=").append(onceUsePurchaseRate);
        sb.append(", onceUseMinPt=").append(onceUseMinPt);
        sb.append(", onceUseMaxPt=").append(onceUseMaxPt);
        sb.append(", totalIsuLimitTypeCd=").append(totalIsuLimitTypeCd);
        sb.append(", totalIsuAblePt=").append(totalIsuAblePt);
        sb.append(", totalIsuAbleCnt=").append(totalIsuAbleCnt);
        sb.append(", minPurchaseAmt=").append(minPurchaseAmt);
        sb.append(", regUserId=").append(regUserId);
        sb.append(", regDt=").append(regDt);
        sb.append(", lastModUserId=").append(lastModUserId);
        sb.append(", lastModDt=").append(lastModDt);
        sb.append(", serialVersionUID=").append(serialVersionUID);
        sb.append("]");
        return sb.toString();
    }
}