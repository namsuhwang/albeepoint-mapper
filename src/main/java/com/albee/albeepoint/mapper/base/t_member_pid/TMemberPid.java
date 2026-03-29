package com.albee.albeepoint.mapper.base.t_member_pid;

import java.io.Serializable;
import java.time.LocalDateTime;

public class TMemberPid implements Serializable {
    private Long pidNo;

    private Long memberNo;

    private Long orgNo;

    private String pidEnc;

    private String pidStsCd;

    private LocalDateTime joinDt;

    private LocalDateTime stopDt;

    private String regUserId;

    private LocalDateTime regDt;

    private String lastModUserId;

    private LocalDateTime lastModDt;

    private static final long serialVersionUID = 1L;

    public Long getPidNo() {
        return pidNo;
    }

    public void setPidNo(Long pidNo) {
        this.pidNo = pidNo;
    }

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

    public String getPidEnc() {
        return pidEnc;
    }

    public void setPidEnc(String pidEnc) {
        this.pidEnc = pidEnc == null ? null : pidEnc.trim();
    }

    public String getPidStsCd() {
        return pidStsCd;
    }

    public void setPidStsCd(String pidStsCd) {
        this.pidStsCd = pidStsCd == null ? null : pidStsCd.trim();
    }

    public LocalDateTime getJoinDt() {
        return joinDt;
    }

    public void setJoinDt(LocalDateTime joinDt) {
        this.joinDt = joinDt;
    }

    public LocalDateTime getStopDt() {
        return stopDt;
    }

    public void setStopDt(LocalDateTime stopDt) {
        this.stopDt = stopDt;
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
        sb.append(", pidNo=").append(pidNo);
        sb.append(", memberNo=").append(memberNo);
        sb.append(", orgNo=").append(orgNo);
        sb.append(", pidEnc=").append(pidEnc);
        sb.append(", pidStsCd=").append(pidStsCd);
        sb.append(", joinDt=").append(joinDt);
        sb.append(", stopDt=").append(stopDt);
        sb.append(", regUserId=").append(regUserId);
        sb.append(", regDt=").append(regDt);
        sb.append(", lastModUserId=").append(lastModUserId);
        sb.append(", lastModDt=").append(lastModDt);
        sb.append(", serialVersionUID=").append(serialVersionUID);
        sb.append("]");
        return sb.toString();
    }
}