package com.albee.albeepoint.mapper.base.t_tr_hist_exp;

import java.io.Serializable;
import java.time.LocalDateTime;

public class TTrHistExp implements Serializable {
    private LocalDateTime expDt;

    private Long ptNo;

    private Long memberNo;

    private Long contNo;

    private Long expPt;

    private static final long serialVersionUID = 1L;

    public LocalDateTime getExpDt() {
        return expDt;
    }

    public void setExpDt(LocalDateTime expDt) {
        this.expDt = expDt;
    }

    public Long getPtNo() {
        return ptNo;
    }

    public void setPtNo(Long ptNo) {
        this.ptNo = ptNo;
    }

    public Long getMemberNo() {
        return memberNo;
    }

    public void setMemberNo(Long memberNo) {
        this.memberNo = memberNo;
    }

    public Long getContNo() {
        return contNo;
    }

    public void setContNo(Long contNo) {
        this.contNo = contNo;
    }

    public Long getExpPt() {
        return expPt;
    }

    public void setExpPt(Long expPt) {
        this.expPt = expPt;
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append(getClass().getSimpleName());
        sb.append(" [");
        sb.append("Hash = ").append(hashCode());
        sb.append(", expDt=").append(expDt);
        sb.append(", ptNo=").append(ptNo);
        sb.append(", memberNo=").append(memberNo);
        sb.append(", contNo=").append(contNo);
        sb.append(", expPt=").append(expPt);
        sb.append(", serialVersionUID=").append(serialVersionUID);
        sb.append("]");
        return sb.toString();
    }
}