package com.albee.albeepoint.mapper.base.t_member_mst;

import java.io.Serializable;
import java.time.LocalDateTime;

public class TMemberMst implements Serializable {
    private Long memberNo;

    private Long orgNo;

    private String memberIdEnc;

    private String memberNm;

    private String memberStsCd;

    private LocalDateTime joinDt;

    private LocalDateTime leaveDt;

    private LocalDateTime lastContactDt;

    private String regUserId;

    private LocalDateTime regDt;

    private String lastModUserId;

    private LocalDateTime lastModDt;

    private static final long serialVersionUID = 1L;

    public Long getMemberNo() {
        return memberNo;
    }

    public void setMemberNo(Long memberNo) {
        this.memberNo = memberNo;
    }

    public Long getOrgNo() {
        return orgNo;
    }

    public void setOrgNo(Long orgNo) {
        this.orgNo = orgNo;
    }

    public String getMemberIdEnc() {
        return memberIdEnc;
    }

    public void setMemberIdEnc(String memberIdEnc) {
        this.memberIdEnc = memberIdEnc == null ? null : memberIdEnc.trim();
    }

    public String getMemberNm() {
        return memberNm;
    }

    public void setMemberNm(String memberNm) {
        this.memberNm = memberNm == null ? null : memberNm.trim();
    }

    public String getMemberStsCd() {
        return memberStsCd;
    }

    public void setMemberStsCd(String memberStsCd) {
        this.memberStsCd = memberStsCd == null ? null : memberStsCd.trim();
    }

    public LocalDateTime getJoinDt() {
        return joinDt;
    }

    public void setJoinDt(LocalDateTime joinDt) {
        this.joinDt = joinDt;
    }

    public LocalDateTime getLeaveDt() {
        return leaveDt;
    }

    public void setLeaveDt(LocalDateTime leaveDt) {
        this.leaveDt = leaveDt;
    }

    public LocalDateTime getLastContactDt() {
        return lastContactDt;
    }

    public void setLastContactDt(LocalDateTime lastContactDt) {
        this.lastContactDt = lastContactDt;
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
        sb.append(", memberNo=").append(memberNo);
        sb.append(", orgNo=").append(orgNo);
        sb.append(", memberIdEnc=").append(memberIdEnc);
        sb.append(", memberNm=").append(memberNm);
        sb.append(", memberStsCd=").append(memberStsCd);
        sb.append(", joinDt=").append(joinDt);
        sb.append(", leaveDt=").append(leaveDt);
        sb.append(", lastContactDt=").append(lastContactDt);
        sb.append(", regUserId=").append(regUserId);
        sb.append(", regDt=").append(regDt);
        sb.append(", lastModUserId=").append(lastModUserId);
        sb.append(", lastModDt=").append(lastModDt);
        sb.append(", serialVersionUID=").append(serialVersionUID);
        sb.append("]");
        return sb.toString();
    }
}