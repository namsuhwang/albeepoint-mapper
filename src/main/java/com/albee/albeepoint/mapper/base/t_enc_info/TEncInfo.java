package com.albee.albeepoint.mapper.base.t_enc_info;

import java.io.Serializable;
import java.time.LocalDateTime;

public class TEncInfo implements Serializable {
    private String targetGbCd;

    private String targetVal;

    private String encKey;

    private String saltVal;

    private String encStsCd;

    private String regUserId;

    private LocalDateTime regDt;

    private String lastModUserId;

    private LocalDateTime lastModDt;

    private static final long serialVersionUID = 1L;

    public String getTargetGbCd() {
        return targetGbCd;
    }

    public void setTargetGbCd(String targetGbCd) {
        this.targetGbCd = targetGbCd == null ? null : targetGbCd.trim();
    }

    public String getTargetVal() {
        return targetVal;
    }

    public void setTargetVal(String targetVal) {
        this.targetVal = targetVal == null ? null : targetVal.trim();
    }

    public String getEncKey() {
        return encKey;
    }

    public void setEncKey(String encKey) {
        this.encKey = encKey == null ? null : encKey.trim();
    }

    public String getSaltVal() {
        return saltVal;
    }

    public void setSaltVal(String saltVal) {
        this.saltVal = saltVal == null ? null : saltVal.trim();
    }

    public String getEncStsCd() {
        return encStsCd;
    }

    public void setEncStsCd(String encStsCd) {
        this.encStsCd = encStsCd == null ? null : encStsCd.trim();
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
        sb.append(", targetGbCd=").append(targetGbCd);
        sb.append(", targetVal=").append(targetVal);
        sb.append(", encKey=").append(encKey);
        sb.append(", saltVal=").append(saltVal);
        sb.append(", encStsCd=").append(encStsCd);
        sb.append(", regUserId=").append(regUserId);
        sb.append(", regDt=").append(regDt);
        sb.append(", lastModUserId=").append(lastModUserId);
        sb.append(", lastModDt=").append(lastModDt);
        sb.append(", serialVersionUID=").append(serialVersionUID);
        sb.append("]");
        return sb.toString();
    }
}