package com.albee.albeepoint.mapper.base.t_cont_rel;

import java.io.Serializable;
import java.time.LocalDateTime;

public class TContRel implements Serializable {
    private Long contRelNo;

    private Long contRelSeq;

    private String contRelGbCd;

    private String contRole;

    private Long contNo;

    private Long linkContNo;

    private String contRelInfo;

    private String contRelUseYn;

    private String regUserId;

    private LocalDateTime regDt;

    private String lastModUserId;

    private LocalDateTime lastModDt;

    private static final long serialVersionUID = 1L;

    public Long getContRelNo() {
        return contRelNo;
    }

    public void setContRelNo(Long contRelNo) {
        this.contRelNo = contRelNo;
    }

    public Long getContRelSeq() {
        return contRelSeq;
    }

    public void setContRelSeq(Long contRelSeq) {
        this.contRelSeq = contRelSeq;
    }

    public String getContRelGbCd() {
        return contRelGbCd;
    }

    public void setContRelGbCd(String contRelGbCd) {
        this.contRelGbCd = contRelGbCd == null ? null : contRelGbCd.trim();
    }

    public String getContRole() {
        return contRole;
    }

    public void setContRole(String contRole) {
        this.contRole = contRole == null ? null : contRole.trim();
    }

    public Long getContNo() {
        return contNo;
    }

    public void setContNo(Long contNo) {
        this.contNo = contNo;
    }

    public Long getLinkContNo() {
        return linkContNo;
    }

    public void setLinkContNo(Long linkContNo) {
        this.linkContNo = linkContNo;
    }

    public String getContRelInfo() {
        return contRelInfo;
    }

    public void setContRelInfo(String contRelInfo) {
        this.contRelInfo = contRelInfo == null ? null : contRelInfo.trim();
    }

    public String getContRelUseYn() {
        return contRelUseYn;
    }

    public void setContRelUseYn(String contRelUseYn) {
        this.contRelUseYn = contRelUseYn == null ? null : contRelUseYn.trim();
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
        sb.append(", contRelNo=").append(contRelNo);
        sb.append(", contRelSeq=").append(contRelSeq);
        sb.append(", contRelGbCd=").append(contRelGbCd);
        sb.append(", contRole=").append(contRole);
        sb.append(", contNo=").append(contNo);
        sb.append(", linkContNo=").append(linkContNo);
        sb.append(", contRelInfo=").append(contRelInfo);
        sb.append(", contRelUseYn=").append(contRelUseYn);
        sb.append(", regUserId=").append(regUserId);
        sb.append(", regDt=").append(regDt);
        sb.append(", lastModUserId=").append(lastModUserId);
        sb.append(", lastModDt=").append(lastModDt);
        sb.append(", serialVersionUID=").append(serialVersionUID);
        sb.append("]");
        return sb.toString();
    }
}