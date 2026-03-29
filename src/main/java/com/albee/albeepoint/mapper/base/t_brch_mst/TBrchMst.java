package com.albee.albeepoint.mapper.base.t_brch_mst;

import java.io.Serializable;
import java.time.LocalDateTime;

public class TBrchMst implements Serializable {
    private Long orgNo;

    private Long brchNo;

    private String orgCd;

    private String brchCd;

    private String brchNm;

    private String brchDispNm;

    private String saveCanYn;

    private String useCanYn;

    private String brchStsCd;

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

    public Long getBrchNo() {
        return brchNo;
    }

    public void setBrchNo(Long brchNo) {
        this.brchNo = brchNo;
    }

    public String getOrgCd() {
        return orgCd;
    }

    public void setOrgCd(String orgCd) {
        this.orgCd = orgCd == null ? null : orgCd.trim();
    }

    public String getBrchCd() {
        return brchCd;
    }

    public void setBrchCd(String brchCd) {
        this.brchCd = brchCd == null ? null : brchCd.trim();
    }

    public String getBrchNm() {
        return brchNm;
    }

    public void setBrchNm(String brchNm) {
        this.brchNm = brchNm == null ? null : brchNm.trim();
    }

    public String getBrchDispNm() {
        return brchDispNm;
    }

    public void setBrchDispNm(String brchDispNm) {
        this.brchDispNm = brchDispNm == null ? null : brchDispNm.trim();
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

    public String getBrchStsCd() {
        return brchStsCd;
    }

    public void setBrchStsCd(String brchStsCd) {
        this.brchStsCd = brchStsCd == null ? null : brchStsCd.trim();
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
        sb.append(", brchNo=").append(brchNo);
        sb.append(", orgCd=").append(orgCd);
        sb.append(", brchCd=").append(brchCd);
        sb.append(", brchNm=").append(brchNm);
        sb.append(", brchDispNm=").append(brchDispNm);
        sb.append(", saveCanYn=").append(saveCanYn);
        sb.append(", useCanYn=").append(useCanYn);
        sb.append(", brchStsCd=").append(brchStsCd);
        sb.append(", regUserId=").append(regUserId);
        sb.append(", regDt=").append(regDt);
        sb.append(", lastModUserId=").append(lastModUserId);
        sb.append(", lastModDt=").append(lastModDt);
        sb.append(", serialVersionUID=").append(serialVersionUID);
        sb.append("]");
        return sb.toString();
    }
}