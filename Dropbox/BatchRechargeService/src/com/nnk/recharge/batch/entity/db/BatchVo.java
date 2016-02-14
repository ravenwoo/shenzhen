package com.nnk.recharge.batch.entity.db;

import java.math.BigDecimal;
import java.util.Date;

/**
 * 批量提交批次信息
 * Created by wusz on 2015/12/23.
 */
public class BatchVo {

    private long id;//主键，作为本批次的批次号
    private String merid;//提交本批次的代理商编号
    private int type;//业务类型： 1、上传快充手机号   2、上传慢充手机号  3、上传快充卡密  4、上传慢充卡密
    private long taskAmount;//本批次总共包含多少笔任务  =via_success+via_fail
    private BigDecimal totalValue;//本批次的总金额(以分为单位)，面值和
    private String inputuser;//本批次的上传人  对于 007ka 后台, 这里写 admin.id; 对于代理商批量充值, 这是 partner.user
    private Date inputtime;//本批次的上传时间 0000-00-00 00:00:00
    private String cfmuser;//复核人，复核即提交任务给系统进行处理  对于 007ka 后台, 这里写 admin.id; 对于代理商批量充值, 这是 partner.user
    private Date cmftime;//复核时间 0000-00-00 00:00:00
    private int cmfresult;//复核的结果  0、本批次的任务尚未全部通过合法性验证，不可复核  1、已全部通过合法性验证，可进行复核  2、复核失败  99、复核成功
    private long viaSuccess;//上传之后，通过合法性验证的任务数量  =cfm_success+cmf_fail
    private long viaFail;//上传之后，未通过合法性验证的任务数量
    private long cfmSuccess;//复核成功的任务数量
    private long cfmFail;//复核失败的任务数量
    private String discrip;
    private int submitState;
    private String comment;//本批次的总体说明，如是否完全通过合法性验证，是否完全通过复核
    private int verifyState;
    private int cfmState;//批充处理状态，0,初始化，1为可执行，2为处理中
    private Date startCfmTime;//从此时间开始提交充值
    private long everyTimeSendMaxCount;//每发everyTimeSendMaxCount   停顿   sleepTime再发
    private long sleepTime;
    private long processCount;//本次任务执行数量
    private long processedCount;//已执行的数量


    @Override
    public String toString() {
        return "BatchVo{" +
                "id=" + id +
                ", merid='" + merid + '\'' +
                ", type=" + type +
                ", taskAmount=" + taskAmount +
                ", totalValue=" + totalValue +
                ", inputuser='" + inputuser + '\'' +
                ", inputtime=" + inputtime +
                ", cfmuser='" + cfmuser + '\'' +
                ", cmftime=" + cmftime +
                ", cmfresult=" + cmfresult +
                ", viaSuccess=" + viaSuccess +
                ", viaFail=" + viaFail +
                ", cfmSuccess=" + cfmSuccess +
                ", cfmFail=" + cfmFail +
                ", discrip='" + discrip + '\'' +
                ", submitState=" + submitState +
                ", comment='" + comment + '\'' +
                ", verifyState=" + verifyState +
                ", cfmState=" + cfmState +
                ", startCfmTime=" + startCfmTime +
                ", everyTimeSendMaxCount=" + everyTimeSendMaxCount +
                ", sleepTime=" + sleepTime +
                ", processCount=" + processCount +
                ", processedCount=" + processedCount +
                '}';
    }

    public long getProcessCount() {
        return processCount;
    }

    public void setProcessCount(long processCount) {
        this.processCount = processCount;
    }

    public long getProcessedCount() {
        return processedCount;
    }

    public void setProcessedCount(long processedCount) {
        this.processedCount = processedCount;
    }

    public long getEveryTimeSendMaxCount() {
        return everyTimeSendMaxCount;
    }

    public void setEveryTimeSendMaxCount(long everyTimeSendMaxCount) {
        this.everyTimeSendMaxCount = everyTimeSendMaxCount;
    }

    public long getSleepTime() {
        return sleepTime;
    }

    public void setSleepTime(long sleepTime) {
        this.sleepTime = sleepTime;
    }

    public long getId() {
        return id;
    }

    public void setId(long id) {
        this.id = id;
    }

    public String getMerid() {
        return merid;
    }

    public void setMerid(String merid) {
        this.merid = merid;
    }

    public int getType() {
        return type;
    }

    public void setType(int type) {
        this.type = type;
    }

    public long getTaskAmount() {
        return taskAmount;
    }

    public void setTaskAmount(long taskAmount) {
        this.taskAmount = taskAmount;
    }

    public BigDecimal getTotalValue() {
        return totalValue;
    }

    public void setTotalValue(BigDecimal totalValue) {
        this.totalValue = totalValue;
    }

    public String getInputuser() {
        return inputuser;
    }

    public void setInputuser(String inputuser) {
        this.inputuser = inputuser;
    }

    public Date getInputtime() {
        return inputtime;
    }

    public void setInputtime(Date inputtime) {
        this.inputtime = inputtime;
    }

    public String getCfmuser() {
        return cfmuser;
    }

    public void setCfmuser(String cfmuser) {
        this.cfmuser = cfmuser;
    }

    public Date getCmftime() {
        return cmftime;
    }

    public void setCmftime(Date cmftime) {
        this.cmftime = cmftime;
    }

    public int getCmfresult() {
        return cmfresult;
    }

    public void setCmfresult(int cmfresult) {
        this.cmfresult = cmfresult;
    }

    public long getViaSuccess() {
        return viaSuccess;
    }

    public void setViaSuccess(long viaSuccess) {
        this.viaSuccess = viaSuccess;
    }

    public long getViaFail() {
        return viaFail;
    }

    public void setViaFail(long viaFail) {
        this.viaFail = viaFail;
    }

    public long getCfmSuccess() {
        return cfmSuccess;
    }

    public void setCfmSuccess(long cfmSuccess) {
        this.cfmSuccess = cfmSuccess;
    }

    public long getCfmFail() {
        return cfmFail;
    }

    public void setCfmFail(long cfmFail) {
        this.cfmFail = cfmFail;
    }

    public String getDiscrip() {
        return discrip;
    }

    public void setDiscrip(String discrip) {
        this.discrip = discrip;
    }

    public int getSubmitState() {
        return submitState;
    }

    public void setSubmitState(int submitState) {
        this.submitState = submitState;
    }

    public String getComment() {
        return comment;
    }

    public void setComment(String comment) {
        this.comment = comment;
    }

    public int getVerifyState() {
        return verifyState;
    }

    public void setVerifyState(int verifyState) {
        this.verifyState = verifyState;
    }

    public int getCfmState() {
        return cfmState;
    }

    public void setCfmState(int cfmState) {
        this.cfmState = cfmState;
    }

    public Date getStartCfmTime() {
        return startCfmTime;
    }

    public void setStartCfmTime(Date startCfmTime) {
        this.startCfmTime = startCfmTime;
    }
}
