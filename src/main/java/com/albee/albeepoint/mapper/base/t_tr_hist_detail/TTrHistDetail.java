package com.albee.albeepoint.mapper.base.t_tr_hist_detail;

import java.io.Serializable;
import java.time.LocalDateTime;

public class TTrHistDetail implements Serializable {
    private Long trSno;

    private Long trSeq;

    private Long contNo;

    private Long memberNo;

    private Long ptNo;

    private Long memberPtNo;

    private LocalDateTime trDt;

    private String trGbCd;

    private String trMethodGbCd;

    private Long trPt;

    private Long befBalPt;

    private Long afrBalPt;

    private Long contBefBalPt;

    private Long contAfrBalPt;

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

    public Long getTrSeq() {
        return trSeq;
    }

    public void setTrSeq(Long trSeq) {
        this.trSeq = trSeq;
    }

    public Long getContNo() {
        return contNo;
    }

    public void setContNo(Long contNo) {
        this.contNo = contNo;
    }

    public Long getMemberNo() {
        return memberNo;
    }

    public void setMemberNo(Long memberNo) {
        this.memberNo = memberNo;
    }

    public Long getPtNo() {
        return ptNo;
    }

    public void setPtNo(Long ptNo) {
        this.ptNo = ptNo;
    }

    public Long getMemberPtNo() {
        return memberPtNo;
    }

    public void setMemberPtNo(Long memberPtNo) {
        this.memberPtNo = memberPtNo;
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

    public Long getTrPt() {
        return trPt;
    }

    public void setTrPt(Long trPt) {
        this.trPt = trPt;
    }

    public Long getBefBalPt() {
        return befBalPt;
    }

    public void setBefBalPt(Long befBalPt) {
        this.befBalPt = befBalPt;
    }

    public Long getAfrBalPt() {
        return afrBalPt;
    }

    public void setAfrBalPt(Long afrBalPt) {
        this.afrBalPt = afrBalPt;
    }

    public Long getContBefBalPt() {
        return contBefBalPt;
    }

    public void setContBefBalPt(Long contBefBalPt) {
        this.contBefBalPt = contBefBalPt;
    }

    public Long getContAfrBalPt() {
        return contAfrBalPt;
    }

    public void setContAfrBalPt(Long contAfrBalPt) {
        this.contAfrBalPt = contAfrBalPt;
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
        sb.append(", trSeq=").append(trSeq);
        sb.append(", contNo=").append(contNo);
        sb.append(", memberNo=").append(memberNo);
        sb.append(", ptNo=").append(ptNo);
        sb.append(", memberPtNo=").append(memberPtNo);
        sb.append(", trDt=").append(trDt);
        sb.append(", trGbCd=").append(trGbCd);
        sb.append(", trMethodGbCd=").append(trMethodGbCd);
        sb.append(", trPt=").append(trPt);
        sb.append(", befBalPt=").append(befBalPt);
        sb.append(", afrBalPt=").append(afrBalPt);
        sb.append(", contBefBalPt=").append(contBefBalPt);
        sb.append(", contAfrBalPt=").append(contAfrBalPt);
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