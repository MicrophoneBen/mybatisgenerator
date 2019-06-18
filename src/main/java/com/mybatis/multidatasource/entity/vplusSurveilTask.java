package com.mybatis.multidatasource.entity;

import java.math.BigDecimal;
import java.util.Date;

public class vplusSurveilTask {
    private String taskId;

    private String taskInfo;

    private Date beaginDate;

    private Date endDate;

    private Integer type;

    private String area;

    private String reason;

    private String comment;

    private String creator;

    private Date createTime;

    private String approver;

    private Date approverTime;

    private Integer status;

    private BigDecimal surveilId;

    private Integer surveilType;

    private String extendInfo1;

    private String extendInfo2;

    private String extendInfo3;

    public String getTaskId() {
        return taskId;
    }

    public void setTaskId(String taskId) {
        this.taskId = taskId == null ? null : taskId.trim();
    }

    public String getTaskInfo() {
        return taskInfo;
    }

    public void setTaskInfo(String taskInfo) {
        this.taskInfo = taskInfo == null ? null : taskInfo.trim();
    }

    public Date getBeaginDate() {
        return beaginDate;
    }

    public void setBeaginDate(Date beaginDate) {
        this.beaginDate = beaginDate;
    }

    public Date getEndDate() {
        return endDate;
    }

    public void setEndDate(Date endDate) {
        this.endDate = endDate;
    }

    public Integer getType() {
        return type;
    }

    public void setType(Integer type) {
        this.type = type;
    }

    public String getArea() {
        return area;
    }

    public void setArea(String area) {
        this.area = area == null ? null : area.trim();
    }

    public String getReason() {
        return reason;
    }

    public void setReason(String reason) {
        this.reason = reason == null ? null : reason.trim();
    }

    public String getComment() {
        return comment;
    }

    public void setComment(String comment) {
        this.comment = comment == null ? null : comment.trim();
    }

    public String getCreator() {
        return creator;
    }

    public void setCreator(String creator) {
        this.creator = creator == null ? null : creator.trim();
    }

    public Date getCreateTime() {
        return createTime;
    }

    public void setCreateTime(Date createTime) {
        this.createTime = createTime;
    }

    public String getApprover() {
        return approver;
    }

    public void setApprover(String approver) {
        this.approver = approver == null ? null : approver.trim();
    }

    public Date getApproverTime() {
        return approverTime;
    }

    public void setApproverTime(Date approverTime) {
        this.approverTime = approverTime;
    }

    public Integer getStatus() {
        return status;
    }

    public void setStatus(Integer status) {
        this.status = status;
    }

    public BigDecimal getSurveilId() {
        return surveilId;
    }

    public void setSurveilId(BigDecimal surveilId) {
        this.surveilId = surveilId;
    }

    public Integer getSurveilType() {
        return surveilType;
    }

    public void setSurveilType(Integer surveilType) {
        this.surveilType = surveilType;
    }

    public String getExtendInfo1() {
        return extendInfo1;
    }

    public void setExtendInfo1(String extendInfo1) {
        this.extendInfo1 = extendInfo1 == null ? null : extendInfo1.trim();
    }

    public String getExtendInfo2() {
        return extendInfo2;
    }

    public void setExtendInfo2(String extendInfo2) {
        this.extendInfo2 = extendInfo2 == null ? null : extendInfo2.trim();
    }

    public String getExtendInfo3() {
        return extendInfo3;
    }

    public void setExtendInfo3(String extendInfo3) {
        this.extendInfo3 = extendInfo3 == null ? null : extendInfo3.trim();
    }
}