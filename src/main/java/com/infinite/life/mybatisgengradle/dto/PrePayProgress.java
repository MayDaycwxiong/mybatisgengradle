package com.infinite.life.mybatisgengradle.dto;

import java.util.Date;

public class PrePayProgress {
    private Long id;

    private Long reportId;

    private String settlementId;

    private Date curDate;

    private Long mediaId;

    private Long appId;

    private Byte companyType;

    private Byte statementGain;

    private Byte statementReceive;

    private Long afterAdjustAmount;

    private Date gmtCreate;

    private Date gmtModified;

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public Long getReportId() {
        return reportId;
    }

    public void setReportId(Long reportId) {
        this.reportId = reportId;
    }

    public String getSettlementId() {
        return settlementId;
    }

    public void setSettlementId(String settlementId) {
        this.settlementId = settlementId == null ? null : settlementId.trim();
    }

    public Date getCurDate() {
        return curDate;
    }

    public void setCurDate(Date curDate) {
        this.curDate = curDate;
    }

    public Long getMediaId() {
        return mediaId;
    }

    public void setMediaId(Long mediaId) {
        this.mediaId = mediaId;
    }

    public Long getAppId() {
        return appId;
    }

    public void setAppId(Long appId) {
        this.appId = appId;
    }

    public Byte getCompanyType() {
        return companyType;
    }

    public void setCompanyType(Byte companyType) {
        this.companyType = companyType;
    }

    public Byte getStatementGain() {
        return statementGain;
    }

    public void setStatementGain(Byte statementGain) {
        this.statementGain = statementGain;
    }

    public Byte getStatementReceive() {
        return statementReceive;
    }

    public void setStatementReceive(Byte statementReceive) {
        this.statementReceive = statementReceive;
    }

    public Long getAfterAdjustAmount() {
        return afterAdjustAmount;
    }

    public void setAfterAdjustAmount(Long afterAdjustAmount) {
        this.afterAdjustAmount = afterAdjustAmount;
    }

    public Date getGmtCreate() {
        return gmtCreate;
    }

    public void setGmtCreate(Date gmtCreate) {
        this.gmtCreate = gmtCreate;
    }

    public Date getGmtModified() {
        return gmtModified;
    }

    public void setGmtModified(Date gmtModified) {
        this.gmtModified = gmtModified;
    }
}