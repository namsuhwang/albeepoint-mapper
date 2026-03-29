package com.albee.albeepoint.mapper.base.t_cont_stat;

import java.io.Serializable;
import java.time.LocalDateTime;

public class TContStat implements Serializable {
    private String baseDay;

    private Long contNo;

    private String contStatGbCd;

    private String orgCd;

    private String brchCd;

    private Long totalIsuPt;

    private Long totalIsuCnt;

    private Long totalUsePt;

    private Long totalUseCnt;

    private String regUserId;

    private LocalDateTime regDt;

    private String lastModUserId;

    private LocalDateTime lastModDt;

    private static final long serialVersionUID = 1L;

    public String getBaseDay() {
        return baseDay;
    }

    public void setBaseDay(String baseDay) {
        this.baseDay = baseDay == null ? null : baseDay.trim();
    }

    public Long getContNo() {
        return contNo;
    }

    public void setContNo(Long contNo) {
        this.contNo = contNo;
    }

    public String getContStatGbCd() {
        return contStatGbCd;
    }

    public void setContStatGbCd(String contStatGbCd) {
        this.contStatGbCd = contStatGbCd == null ? null : contStatGbCd.trim();
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

    public Long getTotalIsuPt() {
        return totalIsuPt;
    }

    public void setTotalIsuPt(Long totalIsuPt) {
        this.totalIsuPt = totalIsuPt;
    }

    public Long getTotalIsuCnt() {
        return totalIsuCnt;
    }

    public void setTotalIsuCnt(Long totalIsuCnt) {
        this.totalIsuCnt = totalIsuCnt;
    }

    public Long getTotalUsePt() {
        return totalUsePt;
    }

    public void setTotalUsePt(Long totalUsePt) {
        this.totalUsePt = totalUsePt;
    }

    public Long getTotalUseCnt() {
        return totalUseCnt;
    }

    public void setTotalUseCnt(Long totalUseCnt) {
        this.totalUseCnt = totalUseCnt;
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
        sb.append(", baseDay=").append(baseDay);
        sb.append(", contNo=").append(contNo);
        sb.append(", contStatGbCd=").append(contStatGbCd);
        sb.append(", orgCd=").append(orgCd);
        sb.append(", brchCd=").append(brchCd);
        sb.append(", totalIsuPt=").append(totalIsuPt);
        sb.append(", totalIsuCnt=").append(totalIsuCnt);
        sb.append(", totalUsePt=").append(totalUsePt);
        sb.append(", totalUseCnt=").append(totalUseCnt);
        sb.append(", regUserId=").append(regUserId);
        sb.append(", regDt=").append(regDt);
        sb.append(", lastModUserId=").append(lastModUserId);
        sb.append(", lastModDt=").append(lastModDt);
        sb.append(", serialVersionUID=").append(serialVersionUID);
        sb.append("]");
        return sb.toString();
    }
}