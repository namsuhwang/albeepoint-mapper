package com.albee.albeepoint.mapper.base.t_tr_log;

import java.io.Serializable;
import java.time.LocalDateTime;

public class TTrLog implements Serializable {
    private String trDt;

    private String trId;

    private String trGb;

    private String memberIdEnc;

    private Long contNo;

    private String orgCd;

    private String brchCd;

    private String ipAddr;

    private LocalDateTime reqDt;

    private LocalDateTime resDt;

    private String reqContent;

    private String resContent;

    private static final long serialVersionUID = 1L;

    public String getTrDt() {
        return trDt;
    }

    public void setTrDt(String trDt) {
        this.trDt = trDt == null ? null : trDt.trim();
    }

    public String getTrId() {
        return trId;
    }

    public void setTrId(String trId) {
        this.trId = trId == null ? null : trId.trim();
    }

    public String getTrGb() {
        return trGb;
    }

    public void setTrGb(String trGb) {
        this.trGb = trGb == null ? null : trGb.trim();
    }

    public String getMemberIdEnc() {
        return memberIdEnc;
    }

    public void setMemberIdEnc(String memberIdEnc) {
        this.memberIdEnc = memberIdEnc == null ? null : memberIdEnc.trim();
    }

    public Long getContNo() {
        return contNo;
    }

    public void setContNo(Long contNo) {
        this.contNo = contNo;
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

    public String getIpAddr() {
        return ipAddr;
    }

    public void setIpAddr(String ipAddr) {
        this.ipAddr = ipAddr == null ? null : ipAddr.trim();
    }

    public LocalDateTime getReqDt() {
        return reqDt;
    }

    public void setReqDt(LocalDateTime reqDt) {
        this.reqDt = reqDt;
    }

    public LocalDateTime getResDt() {
        return resDt;
    }

    public void setResDt(LocalDateTime resDt) {
        this.resDt = resDt;
    }

    public String getReqContent() {
        return reqContent;
    }

    public void setReqContent(String reqContent) {
        this.reqContent = reqContent == null ? null : reqContent.trim();
    }

    public String getResContent() {
        return resContent;
    }

    public void setResContent(String resContent) {
        this.resContent = resContent == null ? null : resContent.trim();
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append(getClass().getSimpleName());
        sb.append(" [");
        sb.append("Hash = ").append(hashCode());
        sb.append(", trDt=").append(trDt);
        sb.append(", trId=").append(trId);
        sb.append(", trGb=").append(trGb);
        sb.append(", memberIdEnc=").append(memberIdEnc);
        sb.append(", contNo=").append(contNo);
        sb.append(", orgCd=").append(orgCd);
        sb.append(", brchCd=").append(brchCd);
        sb.append(", ipAddr=").append(ipAddr);
        sb.append(", reqDt=").append(reqDt);
        sb.append(", resDt=").append(resDt);
        sb.append(", reqContent=").append(reqContent);
        sb.append(", resContent=").append(resContent);
        sb.append(", serialVersionUID=").append(serialVersionUID);
        sb.append("]");
        return sb.toString();
    }
}