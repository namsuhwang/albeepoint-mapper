package com.albee.albeepoint.mapper.base.t_uri_mst;

import java.io.Serializable;
import java.time.LocalDateTime;

public class TUriMst implements Serializable {
    private String uri;

    private String trGbCd;

    private String acsPolicyCd;

    private String useYn;

    private String uriInfo;

    private String regUserId;

    private LocalDateTime regDt;

    private String lastModUserId;

    private LocalDateTime lastModDt;

    private static final long serialVersionUID = 1L;

    public String getUri() {
        return uri;
    }

    public void setUri(String uri) {
        this.uri = uri == null ? null : uri.trim();
    }

    public String getTrGbCd() {
        return trGbCd;
    }

    public void setTrGbCd(String trGbCd) {
        this.trGbCd = trGbCd == null ? null : trGbCd.trim();
    }

    public String getAcsPolicyCd() {
        return acsPolicyCd;
    }

    public void setAcsPolicyCd(String acsPolicyCd) {
        this.acsPolicyCd = acsPolicyCd == null ? null : acsPolicyCd.trim();
    }

    public String getUseYn() {
        return useYn;
    }

    public void setUseYn(String useYn) {
        this.useYn = useYn == null ? null : useYn.trim();
    }

    public String getUriInfo() {
        return uriInfo;
    }

    public void setUriInfo(String uriInfo) {
        this.uriInfo = uriInfo == null ? null : uriInfo.trim();
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
        sb.append(", uri=").append(uri);
        sb.append(", trGbCd=").append(trGbCd);
        sb.append(", acsPolicyCd=").append(acsPolicyCd);
        sb.append(", useYn=").append(useYn);
        sb.append(", uriInfo=").append(uriInfo);
        sb.append(", regUserId=").append(regUserId);
        sb.append(", regDt=").append(regDt);
        sb.append(", lastModUserId=").append(lastModUserId);
        sb.append(", lastModDt=").append(lastModDt);
        sb.append(", serialVersionUID=").append(serialVersionUID);
        sb.append("]");
        return sb.toString();
    }
}