package com.albee.albeepoint.mapper.base.t_org_mst;

import java.io.Serializable;
import java.time.LocalDateTime;

public class TOrgMst implements Serializable {
    private Long orgNo;

    private String orgNm;

    private String orgCd;

    private String orgDispNm;

    private String saveCanYn;

    private String useCanYn;

    private String memberAutoRegYn;

    private String orgStsCd;

    private LocalDateTime joinDt;

    private LocalDateTime leaveDt;

    private String regUserId;

    private LocalDateTime regDt;

    private String lastModUserId;

    private LocalDateTime lastModDt;

    private static final long serialVersionUID = 1L;

    public Long getOrgNo() {
        return orgNo;
    }

    public void setOrgNo(Long orgNo) {
        this.orgNo = orgNo;
    }

    public String getOrgNm() {
        return orgNm;
    }

    public void setOrgNm(String orgNm) {
        this.orgNm = orgNm == null ? null : orgNm.trim();
    }

    public String getOrgCd() {
        return orgCd;
    }

    public void setOrgCd(String orgCd) {
        this.orgCd = orgCd == null ? null : orgCd.trim();
    }

    public String getOrgDispNm() {
        return orgDispNm;
    }

    public void setOrgDispNm(String orgDispNm) {
        this.orgDispNm = orgDispNm == null ? null : orgDispNm.trim();
    }

    public String getSaveCanYn() {
        return saveCanYn;
    }

    public void setSaveCanYn(String saveCanYn) {
        this.saveCanYn = saveCanYn == null ? null : saveCanYn.trim();
    }

    public String getUseCanYn() {
        return useCanYn;
    }

    public void setUseCanYn(String useCanYn) {
        this.useCanYn = useCanYn == null ? null : useCanYn.trim();
    }

    public String getMemberAutoRegYn() {
        return memberAutoRegYn;
    }

    public void setMemberAutoRegYn(String memberAutoRegYn) {
        this.memberAutoRegYn = memberAutoRegYn == null ? null : memberAutoRegYn.trim();
    }

    public String getOrgStsCd() {
        return orgStsCd;
    }

    public void setOrgStsCd(String orgStsCd) {
        this.orgStsCd = orgStsCd == null ? null : orgStsCd.trim();
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
        sb.append(", orgNo=").append(orgNo);
        sb.append(", orgNm=").append(orgNm);
        sb.append(", orgCd=").append(orgCd);
        sb.append(", orgDispNm=").append(orgDispNm);
        sb.append(", saveCanYn=").append(saveCanYn);
        sb.append(", useCanYn=").append(useCanYn);
        sb.append(", memberAutoRegYn=").append(memberAutoRegYn);
        sb.append(", orgStsCd=").append(orgStsCd);
        sb.append(", joinDt=").append(joinDt);
        sb.append(", leaveDt=").append(leaveDt);
        sb.append(", regUserId=").append(regUserId);
        sb.append(", regDt=").append(regDt);
        sb.append(", lastModUserId=").append(lastModUserId);
        sb.append(", lastModDt=").append(lastModDt);
        sb.append(", serialVersionUID=").append(serialVersionUID);
        sb.append("]");
        return sb.toString();
    }
}