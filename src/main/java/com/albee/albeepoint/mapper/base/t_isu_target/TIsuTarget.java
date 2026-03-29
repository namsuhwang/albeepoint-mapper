package com.albee.albeepoint.mapper.base.t_isu_target;

import java.io.Serializable;
import java.time.LocalDateTime;

public class TIsuTarget implements Serializable {
    private Long isuTargetSno;

    private Long contNo;

    private String memberIdEnc;

    private Long memberNo;

    private String isuTargetTypeCd;

    private String isuReqDy;

    private Long isuReqPt;

    private String useYn;

    private String orgCd;

    private String brchCd;

    private Long isuPt;

    private LocalDateTime isuDt;

    private String resultCd;

    private String resultMsg;

    private String regUserId;

    private LocalDateTime regDt;

    private String lastModUserId;

    private LocalDateTime lastModDt;

    private static final long serialVersionUID = 1L;

    public Long getIsuTargetSno() {
        return isuTargetSno;
    }

    public void setIsuTargetSno(Long isuTargetSno) {
        this.isuTargetSno = isuTargetSno;
    }

    public Long getContNo() {
        return contNo;
    }

    public void setContNo(Long contNo) {
        this.contNo = contNo;
    }

    public String getMemberIdEnc() {
        return memberIdEnc;
    }

    public void setMemberIdEnc(String memberIdEnc) {
        this.memberIdEnc = memberIdEnc == null ? null : memberIdEnc.trim();
    }

    public Long getMemberNo() {
        return memberNo;
    }

    public void setMemberNo(Long memberNo) {
        this.memberNo = memberNo;
    }

    public String getIsuTargetTypeCd() {
        return isuTargetTypeCd;
    }

    public void setIsuTargetTypeCd(String isuTargetTypeCd) {
        this.isuTargetTypeCd = isuTargetTypeCd == null ? null : isuTargetTypeCd.trim();
    }

    public String getIsuReqDy() {
        return isuReqDy;
    }

    public void setIsuReqDy(String isuReqDy) {
        this.isuReqDy = isuReqDy == null ? null : isuReqDy.trim();
    }

    public Long getIsuReqPt() {
        return isuReqPt;
    }

    public void setIsuReqPt(Long isuReqPt) {
        this.isuReqPt = isuReqPt;
    }

    public String getUseYn() {
        return useYn;
    }

    public void setUseYn(String useYn) {
        this.useYn = useYn == null ? null : useYn.trim();
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

    public Long getIsuPt() {
        return isuPt;
    }

    public void setIsuPt(Long isuPt) {
        this.isuPt = isuPt;
    }

    public LocalDateTime getIsuDt() {
        return isuDt;
    }

    public void setIsuDt(LocalDateTime isuDt) {
        this.isuDt = isuDt;
    }

    public String getResultCd() {
        return resultCd;
    }

    public void setResultCd(String resultCd) {
        this.resultCd = resultCd == null ? null : resultCd.trim();
    }

    public String getResultMsg() {
        return resultMsg;
    }

    public void setResultMsg(String resultMsg) {
        this.resultMsg = resultMsg == null ? null : resultMsg.trim();
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
        sb.append(", isuTargetSno=").append(isuTargetSno);
        sb.append(", contNo=").append(contNo);
        sb.append(", memberIdEnc=").append(memberIdEnc);
        sb.append(", memberNo=").append(memberNo);
        sb.append(", isuTargetTypeCd=").append(isuTargetTypeCd);
        sb.append(", isuReqDy=").append(isuReqDy);
        sb.append(", isuReqPt=").append(isuReqPt);
        sb.append(", useYn=").append(useYn);
        sb.append(", orgCd=").append(orgCd);
        sb.append(", brchCd=").append(brchCd);
        sb.append(", isuPt=").append(isuPt);
        sb.append(", isuDt=").append(isuDt);
        sb.append(", resultCd=").append(resultCd);
        sb.append(", resultMsg=").append(resultMsg);
        sb.append(", regUserId=").append(regUserId);
        sb.append(", regDt=").append(regDt);
        sb.append(", lastModUserId=").append(lastModUserId);
        sb.append(", lastModDt=").append(lastModDt);
        sb.append(", serialVersionUID=").append(serialVersionUID);
        sb.append("]");
        return sb.toString();
    }
}