package com.albee.albeepoint.mapper.cont_org;

import java.io.Serializable;
import java.time.LocalDateTime;

public class ContOrg implements Serializable {
    private Long contNo;

    private Long orgNo;

    private Long contSeq;

    private String brchPolicyTypeCd;

    private String saveCanYn;

    private String useCanYn;

    private String contOrgStsCd;

    private Long totalIsuAblePt;

    private Long totalIsuAbleCnt;

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

    public Long getOrgNo() {
        return orgNo;
    }

    public void setOrgNo(Long orgNo) {
        this.orgNo = orgNo;
    }

    public Long getContSeq() {
        return contSeq;
    }

    public void setContSeq(Long contSeq) {
        this.contSeq = contSeq;
    }

    public String getBrchPolicyTypeCd() {
        return brchPolicyTypeCd;
    }

    public void setBrchPolicyTypeCd(String brchPolicyTypeCd) {
        this.brchPolicyTypeCd = brchPolicyTypeCd == null ? null : brchPolicyTypeCd.trim();
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

    public String getContOrgStsCd() {
        return contOrgStsCd;
    }

    public void setContOrgStsCd(String contOrgStsCd) {
        this.contOrgStsCd = contOrgStsCd == null ? null : contOrgStsCd.trim();
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
        sb.append(", orgNo=").append(orgNo);
        sb.append(", contSeq=").append(contSeq);
        sb.append(", brchPolicyTypeCd=").append(brchPolicyTypeCd);
        sb.append(", saveCanYn=").append(saveCanYn);
        sb.append(", useCanYn=").append(useCanYn);
        sb.append(", contOrgStsCd=").append(contOrgStsCd);
        sb.append(", totalIsuAblePt=").append(totalIsuAblePt);
        sb.append(", totalIsuAbleCnt=").append(totalIsuAbleCnt);
        sb.append(", regUserId=").append(regUserId);
        sb.append(", regDt=").append(regDt);
        sb.append(", lastModUserId=").append(lastModUserId);
        sb.append(", lastModDt=").append(lastModDt);
        sb.append(", serialVersionUID=").append(serialVersionUID);
        sb.append("]");
        return sb.toString();
    }
}