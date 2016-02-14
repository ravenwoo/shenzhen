package com.nnk.recharge.batch.entity.db;

import java.math.BigDecimal;
import java.util.Date;

/**
 * 批量提交提交表
 * Created by wusz on 2015/12/23.
 */
public class BatchInputVo {
    private long id;
    private long batchno;//批次号, 每次批量都有一个唯一的int批次号，即Batch.id
    private String merid;//代理商ID
    private String meraccount;//代理商account
    private int type;//批量提交的内容种类 (等于 BatchVo.type)   0: 保留    1: 快充手机号(需求) 上传文件格式为"手机号,金额" eg "13912312345,5000"    2: 慢充手机号(需求) 上传文件格式为"手机号,金额" eg "13912312345,5000"            3: 快充卡密         上传文件格式为"" eg ""            4: 慢充卡密         上传文件格式为"" eg ""
    private String mob;//被充手机号码
    private long value;//金额(分为单位)
    private String cardsn;//卡号
    private String cdkey;//密码
    private int cardtype;//类别ID(card_type.id) (根据申请面值对照)
    private long cardid;//品名ID(cart.id) (根据申请面值对照)
    private long timeout;//本订单最大超时秒数
    private String inputuser;//本批次的上传人  对于 007ka 后台, 这里写 admin.id; 对于代理商批量充值, 这是 partner.user
    private Date inputtime;//本批次的上传时间 0000-00-00 00:00:00
    private String cfmuser;//复核人，复核即提交任务给系统进行处理  对于 007ka 后台, 这里写 admin.id; 对于代理商批量充值, 这是 partner.user
    private Date cmftime;//复核时间 0000-00-00 00:00:00
    private int cmfresult;//复核的结果  0、本批次的任务尚未全部通过合法性验证，不可复核  1、已全部通过合法性验证，可进行复核  2、复核失败  99、复核成功
    private String orderid;//本定单成功后生成的007ka 主定单号oemcdkey_order.inorderid
    private String comment;//说明:  对于提交者, 写明这次提交的说明; 对于复核者, 如果复核不通过应该给出原因
    private String province;
    private long hadcharge;
    private long hadreturn;
    private int chgfin;
    private long cfmtimes;
    private String discrip;
    private String verifyuser;
    private Date verifytime;
    private int verifystate;
    private String sendorderid;//填写每一笔发起充值时的自身订单号，通过OrderIdSystem生成全局唯一的订单号，前缀是7BAT。生成后回写此字段再发起充值，重复发起时直接取此值

    @Override
    public String toString() {
        return "BatchInputVo{" +
                "id=" + id +
                ", batchno=" + batchno +
                ", merid='" + merid + '\'' +
                ", meraccount='" + meraccount + '\'' +
                ", type=" + type +
                ", mob='" + mob + '\'' +
                ", value=" + value +
                ", cardsn='" + cardsn + '\'' +
                ", cdkey='" + cdkey + '\'' +
                ", cardtype=" + cardtype +
                ", cardid=" + cardid +
                ", timeout=" + timeout +
                ", inputuser='" + inputuser + '\'' +
                ", inputtime=" + inputtime +
                ", cfmuser='" + cfmuser + '\'' +
                ", cmftime=" + cmftime +
                ", cmfresult=" + cmfresult +
                ", orderid='" + orderid + '\'' +
                ", comment='" + comment + '\'' +
                ", province='" + province + '\'' +
                ", hadcharge=" + hadcharge +
                ", hadreturn=" + hadreturn +
                ", chgfin=" + chgfin +
                ", cfmtimes=" + cfmtimes +
                ", discrip='" + discrip + '\'' +
                ", verifyuser='" + verifyuser + '\'' +
                ", verifytime=" + verifytime +
                ", verifystate=" + verifystate +
                ", sendorderid='" + sendorderid + '\'' +
                '}';
    }

    public long getId() {
        return id;
    }

    public void setId(long id) {
        this.id = id;
    }

    public long getBatchno() {
        return batchno;
    }

    public void setBatchno(long batchno) {
        this.batchno = batchno;
    }

    public String getMerid() {
        return merid;
    }

    public void setMerid(String merid) {
        this.merid = merid;
    }

    public String getMeraccount() {
        return meraccount;
    }

    public void setMeraccount(String meraccount) {
        this.meraccount = meraccount;
    }

    public int getType() {
        return type;
    }

    public void setType(int type) {
        this.type = type;
    }

    public String getMob() {
        return mob;
    }

    public void setMob(String mob) {
        this.mob = mob;
    }

    public long getValue() {
        return value;
    }

    public void setValue(long value) {
        this.value = value;
    }

    public String getCardsn() {
        return cardsn;
    }

    public void setCardsn(String cardsn) {
        this.cardsn = cardsn;
    }

    public String getCdkey() {
        return cdkey;
    }

    public void setCdkey(String cdkey) {
        this.cdkey = cdkey;
    }

    public int getCardtype() {
        return cardtype;
    }

    public void setCardtype(int cardtype) {
        this.cardtype = cardtype;
    }

    public long getCardid() {
        return cardid;
    }

    public void setCardid(long cardid) {
        this.cardid = cardid;
    }

    public long getTimeout() {
        return timeout;
    }

    public void setTimeout(long timeout) {
        this.timeout = timeout;
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

    public String getOrderid() {
        return orderid;
    }

    public void setOrderid(String orderid) {
        this.orderid = orderid;
    }

    public String getComment() {
        return comment;
    }

    public void setComment(String comment) {
        this.comment = comment;
    }

    public String getProvince() {
        return province;
    }

    public void setProvince(String province) {
        this.province = province;
    }

    public long getHadcharge() {
        return hadcharge;
    }

    public void setHadcharge(long hadcharge) {
        this.hadcharge = hadcharge;
    }

    public long getHadreturn() {
        return hadreturn;
    }

    public void setHadreturn(long hadreturn) {
        this.hadreturn = hadreturn;
    }

    public int getChgfin() {
        return chgfin;
    }

    public void setChgfin(int chgfin) {
        this.chgfin = chgfin;
    }

    public long getCfmtimes() {
        return cfmtimes;
    }

    public void setCfmtimes(long cfmtimes) {
        this.cfmtimes = cfmtimes;
    }

    public String getDiscrip() {
        return discrip;
    }

    public void setDiscrip(String discrip) {
        this.discrip = discrip;
    }

    public String getVerifyuser() {
        return verifyuser;
    }

    public void setVerifyuser(String verifyuser) {
        this.verifyuser = verifyuser;
    }

    public Date getVerifytime() {
        return verifytime;
    }

    public void setVerifytime(Date verifytime) {
        this.verifytime = verifytime;
    }

    public int getVerifystate() {
        return verifystate;
    }

    public void setVerifystate(int verifystate) {
        this.verifystate = verifystate;
    }

    public String getSendorderid() {
        return sendorderid;
    }

    public void setSendorderid(String sendorderid) {
        this.sendorderid = sendorderid;
    }
}
