package com.albee.albeepoint.mapper.base.t_tr_rel;

import java.io.Serializable;
import java.time.LocalDateTime;

public class TTrRel implements Serializable {
    private Long trRelNo;

    private Long trSno;

    private Long trSeq;

    private String regUserId;

    private LocalDateTime regDt;

    private String lastModUserId;

    private LocalDateTime lastModDt;

    private static final long serialVersionUID = 1L;

    public Long getTrRelNo() {
        return trRelNo;
    }

    public void setTrRelNo(Long trRelNo) {
        this.trRelNo = trRelNo;
    }

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
        sb.append(", trRelNo=").append(trRelNo);
        sb.append(", trSno=").append(trSno);
        sb.append(", trSeq=").append(trSeq);
        sb.append(", regUserId=").append(regUserId);
        sb.append(", regDt=").append(regDt);
        sb.append(", lastModUserId=").append(lastModUserId);
        sb.append(", lastModDt=").append(lastModDt);
        sb.append(", serialVersionUID=").append(serialVersionUID);
        sb.append("]");
        return sb.toString();
    }
}