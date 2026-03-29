package com.albee.albeepoint.mapper.base.t_tr_hist;

import java.io.Serializable;
import java.time.LocalDateTime;

public class TTrHist implements Serializable {
    private Long trSno;

    private Long memberNo;

    private LocalDateTime trDt;

    private String trGbCd;

    private String trMethodGbCd;

    private String trDy;

    private Long orgNo;

    private Long brchNo;

    private Long trPt;

    private Long befPt;

    private Long afrPt;

    private Long purchaseAmt;

    private Long orglTrSno;

    private String regUserId;

    private LocalDateTime regDt;

    private String lastModUserId;

    private LocalDateTime lastModDt;

    private static final long serialVersionUID = 1L;

    public Long getTrSno() {
        return trSno;
    }

    public void setTrSno(Long trSno) {
        this.trSno = trSno;
    }

    public Long getMemberNo() {
        return memberNo;
    }

    public void setMemberNo(Long memberNo) {
        this.memberNo = memberNo;
    }

    public LocalDateTime getTrDt() {
        return trDt;
    }

    public void setTrDt(LocalDateTime trDt) {
        this.trDt = trDt;
    }

    public String getTrGbCd() {
        return trGbCd;
    }

    public void setTrGbCd(String trGbCd) {
        this.trGbCd = trGbCd == null ? null : trGbCd.trim();
    }

    public String getTrMethodGbCd() {
        return trMethodGbCd;
    }

    public void setTrMethodGbCd(String trMethodGbCd) {
        this.trMethodGbCd = trMethodGbCd == null ? null : trMethodGbCd.trim();
    }

    public String getTrDy() {
        return trDy;
    }

    public void setTrDy(String trDy) {
        this.trDy = trDy == null ? null : trDy.trim();
    }

    public Long getOrgNo() {
        return orgNo;
    }

    public void setOrgNo(Long orgNo) {
        this.orgNo = orgNo;
    }

    public Long getBrchNo() {
        return brchNo;
    }

    public void setBrchNo(Long brchNo) {
        this.brchNo = brchNo;
    }

    public Long getTrPt() {
        return trPt;
    }

    public void setTrPt(Long trPt) {
        this.trPt = trPt;
    }

    public Long getBefPt() {
        return befPt;
    }

    public void setBefPt(Long befPt) {
        this.befPt = befPt;
    }

    public Long getAfrPt() {
        return afrPt;
    }

    public void setAfrPt(Long afrPt) {
        this.afrPt = afrPt;
    }

    public Long getPurchaseAmt() {
        return purchaseAmt;
    }

    public void setPurchaseAmt(Long purchaseAmt) {
        this.purchaseAmt = purchaseAmt;
    }

    public Long getOrglTrSno() {
        return orglTrSno;
    }

    public void setOrglTrSno(Long orglTrSno) {
        this.orglTrSno = orglTrSno;
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
        sb.append(", trSno=").append(trSno);
        sb.append(", memberNo=").append(memberNo);
        sb.append(", trDt=").append(trDt);
        sb.append(", trGbCd=").append(trGbCd);
        sb.append(", trMethodGbCd=").append(trMethodGbCd);
        sb.append(", trDy=").append(trDy);
        sb.append(", orgNo=").append(orgNo);
        sb.append(", brchNo=").append(brchNo);
        sb.append(", trPt=").append(trPt);
        sb.append(", befPt=").append(befPt);
        sb.append(", afrPt=").append(afrPt);
        sb.append(", purchaseAmt=").append(purchaseAmt);
        sb.append(", orglTrSno=").append(orglTrSno);
        sb.append(", regUserId=").append(regUserId);
        sb.append(", regDt=").append(regDt);
        sb.append(", lastModUserId=").append(lastModUserId);
        sb.append(", lastModDt=").append(lastModDt);
        sb.append(", serialVersionUID=").append(serialVersionUID);
        sb.append("]");
        return sb.toString();
    }
}