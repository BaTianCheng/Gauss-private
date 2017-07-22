/**
 * DT_ContractSearchSub_VICNCN.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package com.esb.jinying.sap.contract.rvs.ecc;

public class DT_ContractSearchSub_VICNCN  implements java.io.Serializable {
    /* 对象的标识 */
    private java.lang.String OBJECT_ID;

    /* 采购组织 */
    private java.lang.String ZZEKORG;

    /* 采购组 */
    private java.lang.String ZZEKGRP;

    /* 销售组织 */
    private java.lang.String ZZVKORG;

    /* 部门编码 */
    private java.lang.String ZZVKGRP;

    /* 柜组编码 */
    private java.lang.String ZZVKBUR;

    /* 经营属性 */
    private java.lang.String ZZMVGR1;

    /* 合同号 */
    private java.lang.String CONTRACT_NO;

    /* 业态 */
    private java.lang.String ZZBUSINES;

    /* 是否统一收银 */
    private java.lang.String ZZUNITE;

    /* 是否特卖 */
    private java.lang.String ZZSPSELL;

    /* 上柜时间 */
    private java.lang.String ZZOTCTIME;

    /* 驻厂人员 */
    private java.lang.String ZZFACTSTAFF;

    /* 人员编制 */
    private java.lang.String ZZSTAFFGP;

    /* 门类编码 */
    private java.lang.String ZZSUPPLY_TYPE_NO;

    /* 贸易公司经营分类 */
    private java.lang.String ZZMANCLASS;

    /* 合同更改时间 */
    private java.lang.String ZZCONCHANGE_DATE;

    /* 合同更改原因 */
    private java.lang.String ZZCONCHANGE_RE;

    /* 交货方式 */
    private java.lang.String ZZDELIMETH;

    /* 交货地点 */
    private java.lang.String ZZDELIDES;

    /* 运输方式 */
    private java.lang.String ZZTRANMETH;

    /* 供方签约人 */
    private java.lang.String ZZCON_VPERSON;

    /* 集团管理部门 */
    private java.lang.String ZZCON_DEPART;

    /* 中心签约人 */
    private java.lang.String ZZCON_CPERSON;

    /* 审核时间 */
    private java.lang.String ZZAUDIT_DATE;

    /* 审核人 */
    private java.lang.String ZZAUDIT_PERSON;

    /* 录入时间 */
    private java.lang.String ZZENTRY_DATE;

    /* 录入人 */
    private java.lang.String ZZENTRY_PERSON;

    /* 其他 */
    private java.lang.String ZZOTHER;

    /* 款库比% */
    private java.lang.String ZZSTOCKRATE;

    /* 建议实销金额 */
    private java.lang.String ZZPRO_AMOUNT;

    /* 成本折扣 */
    private java.lang.String ZZDISCOUNT_COST;

    /* 运费承担 */
    private java.lang.String ZZTRAN_COST;

    /* 质检费承担 */
    private java.lang.String ZZQUAN_COST;

    /* 装修费承担 */
    private java.lang.String ZZDECO_COST;

    /* 促销费承担 */
    private java.lang.String ZZSALES_COST;

    /* 预付款/押金 */
    private java.lang.String ZZPREPAY;

    /* 付款条件代码 */
    private java.lang.String ZZTERM;

    /* 返利类型 */
    private java.lang.String ZZREBATEMETH;

    /* 主品牌编码 */
    private java.lang.String ZZBRAND_IDMAIN;

    /* 扣率形式 */
    private java.lang.String ZZDPTYPE;

    /* 总保底 */
    private java.lang.String ZZMINSALE_TOTAL;

    /* 是否提前终止 */
    private java.lang.String ZZTERMINATE;

    /* 更改生效日期 */
    private java.lang.String ZZACTDATE;

    /* 合同更改人 */
    private java.lang.String ZZRECH_UNAME;

    /* 是否使用VIP卡 */
    private java.lang.String ZZVIP_FLG;

    /* 特卖类型 */
    private java.lang.String ZZSPSELLTP;

    /* 合同结算周期 */
    private java.lang.String ZZCLCYCLE;

    /* 商品税率 */
    private java.lang.String ZZMATTAX;

    /* 经销退货 */
    private java.lang.String ZRET_FLG;

    /* 吊牌价结算 */
    private java.lang.String ZPRICE_SET;

    /* 金鹰购业务类型 */
    private java.lang.String ZYWLX_JYG;

    /* 集合柜代码 */
    private java.lang.String ZSET_NO;

    /* 集合柜描述 */
    private java.lang.String ZSET_MESS;

    /* 门类编码 */
    private java.lang.String ZLSD_TYPE_NO;

    /* 租金支付形式 */
    private java.lang.String ZZJZF;

    /* 缴费截止日 */
    private java.lang.String ZJFJZ;

    /* 物业交付日期 */
    private java.lang.String ZWYJF;

    /* 租金计算模式 */
    private java.lang.String ZZJJS;

    /* 滞纳金天数 */
    private java.lang.String ZZNJT;

    /* 滞纳金比例 */
    private java.lang.String ZZNBL;

    /* 建筑面积 */
    private java.lang.String ZJZMJ;

    /* 免租期开始 */
    private java.lang.String ZMZKS;

    /* 免租期结束 */
    private java.lang.String ZMZJS;

    /* 每月10日出结账单选项 */
    private java.lang.String ZMYJZD;

    /* 合同文本开始日期 */
    private java.lang.String ZWBRQ;

    public DT_ContractSearchSub_VICNCN() {
    }

    public DT_ContractSearchSub_VICNCN(
           java.lang.String OBJECT_ID,
           java.lang.String ZZEKORG,
           java.lang.String ZZEKGRP,
           java.lang.String ZZVKORG,
           java.lang.String ZZVKGRP,
           java.lang.String ZZVKBUR,
           java.lang.String ZZMVGR1,
           java.lang.String CONTRACT_NO,
           java.lang.String ZZBUSINES,
           java.lang.String ZZUNITE,
           java.lang.String ZZSPSELL,
           java.lang.String ZZOTCTIME,
           java.lang.String ZZFACTSTAFF,
           java.lang.String ZZSTAFFGP,
           java.lang.String ZZSUPPLY_TYPE_NO,
           java.lang.String ZZMANCLASS,
           java.lang.String ZZCONCHANGE_DATE,
           java.lang.String ZZCONCHANGE_RE,
           java.lang.String ZZDELIMETH,
           java.lang.String ZZDELIDES,
           java.lang.String ZZTRANMETH,
           java.lang.String ZZCON_VPERSON,
           java.lang.String ZZCON_DEPART,
           java.lang.String ZZCON_CPERSON,
           java.lang.String ZZAUDIT_DATE,
           java.lang.String ZZAUDIT_PERSON,
           java.lang.String ZZENTRY_DATE,
           java.lang.String ZZENTRY_PERSON,
           java.lang.String ZZOTHER,
           java.lang.String ZZSTOCKRATE,
           java.lang.String ZZPRO_AMOUNT,
           java.lang.String ZZDISCOUNT_COST,
           java.lang.String ZZTRAN_COST,
           java.lang.String ZZQUAN_COST,
           java.lang.String ZZDECO_COST,
           java.lang.String ZZSALES_COST,
           java.lang.String ZZPREPAY,
           java.lang.String ZZTERM,
           java.lang.String ZZREBATEMETH,
           java.lang.String ZZBRAND_IDMAIN,
           java.lang.String ZZDPTYPE,
           java.lang.String ZZMINSALE_TOTAL,
           java.lang.String ZZTERMINATE,
           java.lang.String ZZACTDATE,
           java.lang.String ZZRECH_UNAME,
           java.lang.String ZZVIP_FLG,
           java.lang.String ZZSPSELLTP,
           java.lang.String ZZCLCYCLE,
           java.lang.String ZZMATTAX,
           java.lang.String ZRET_FLG,
           java.lang.String ZPRICE_SET,
           java.lang.String ZYWLX_JYG,
           java.lang.String ZSET_NO,
           java.lang.String ZSET_MESS,
           java.lang.String ZLSD_TYPE_NO,
           java.lang.String ZZJZF,
           java.lang.String ZJFJZ,
           java.lang.String ZWYJF,
           java.lang.String ZZJJS,
           java.lang.String ZZNJT,
           java.lang.String ZZNBL,
           java.lang.String ZJZMJ,
           java.lang.String ZMZKS,
           java.lang.String ZMZJS,
           java.lang.String ZMYJZD,
           java.lang.String ZWBRQ) {
           this.OBJECT_ID = OBJECT_ID;
           this.ZZEKORG = ZZEKORG;
           this.ZZEKGRP = ZZEKGRP;
           this.ZZVKORG = ZZVKORG;
           this.ZZVKGRP = ZZVKGRP;
           this.ZZVKBUR = ZZVKBUR;
           this.ZZMVGR1 = ZZMVGR1;
           this.CONTRACT_NO = CONTRACT_NO;
           this.ZZBUSINES = ZZBUSINES;
           this.ZZUNITE = ZZUNITE;
           this.ZZSPSELL = ZZSPSELL;
           this.ZZOTCTIME = ZZOTCTIME;
           this.ZZFACTSTAFF = ZZFACTSTAFF;
           this.ZZSTAFFGP = ZZSTAFFGP;
           this.ZZSUPPLY_TYPE_NO = ZZSUPPLY_TYPE_NO;
           this.ZZMANCLASS = ZZMANCLASS;
           this.ZZCONCHANGE_DATE = ZZCONCHANGE_DATE;
           this.ZZCONCHANGE_RE = ZZCONCHANGE_RE;
           this.ZZDELIMETH = ZZDELIMETH;
           this.ZZDELIDES = ZZDELIDES;
           this.ZZTRANMETH = ZZTRANMETH;
           this.ZZCON_VPERSON = ZZCON_VPERSON;
           this.ZZCON_DEPART = ZZCON_DEPART;
           this.ZZCON_CPERSON = ZZCON_CPERSON;
           this.ZZAUDIT_DATE = ZZAUDIT_DATE;
           this.ZZAUDIT_PERSON = ZZAUDIT_PERSON;
           this.ZZENTRY_DATE = ZZENTRY_DATE;
           this.ZZENTRY_PERSON = ZZENTRY_PERSON;
           this.ZZOTHER = ZZOTHER;
           this.ZZSTOCKRATE = ZZSTOCKRATE;
           this.ZZPRO_AMOUNT = ZZPRO_AMOUNT;
           this.ZZDISCOUNT_COST = ZZDISCOUNT_COST;
           this.ZZTRAN_COST = ZZTRAN_COST;
           this.ZZQUAN_COST = ZZQUAN_COST;
           this.ZZDECO_COST = ZZDECO_COST;
           this.ZZSALES_COST = ZZSALES_COST;
           this.ZZPREPAY = ZZPREPAY;
           this.ZZTERM = ZZTERM;
           this.ZZREBATEMETH = ZZREBATEMETH;
           this.ZZBRAND_IDMAIN = ZZBRAND_IDMAIN;
           this.ZZDPTYPE = ZZDPTYPE;
           this.ZZMINSALE_TOTAL = ZZMINSALE_TOTAL;
           this.ZZTERMINATE = ZZTERMINATE;
           this.ZZACTDATE = ZZACTDATE;
           this.ZZRECH_UNAME = ZZRECH_UNAME;
           this.ZZVIP_FLG = ZZVIP_FLG;
           this.ZZSPSELLTP = ZZSPSELLTP;
           this.ZZCLCYCLE = ZZCLCYCLE;
           this.ZZMATTAX = ZZMATTAX;
           this.ZRET_FLG = ZRET_FLG;
           this.ZPRICE_SET = ZPRICE_SET;
           this.ZYWLX_JYG = ZYWLX_JYG;
           this.ZSET_NO = ZSET_NO;
           this.ZSET_MESS = ZSET_MESS;
           this.ZLSD_TYPE_NO = ZLSD_TYPE_NO;
           this.ZZJZF = ZZJZF;
           this.ZJFJZ = ZJFJZ;
           this.ZWYJF = ZWYJF;
           this.ZZJJS = ZZJJS;
           this.ZZNJT = ZZNJT;
           this.ZZNBL = ZZNBL;
           this.ZJZMJ = ZJZMJ;
           this.ZMZKS = ZMZKS;
           this.ZMZJS = ZMZJS;
           this.ZMYJZD = ZMYJZD;
           this.ZWBRQ = ZWBRQ;
    }


    /**
     * Gets the OBJECT_ID value for this DT_ContractSearchSub_VICNCN.
     * 
     * @return OBJECT_ID   * 对象的标识
     */
    public java.lang.String getOBJECT_ID() {
        return OBJECT_ID;
    }


    /**
     * Sets the OBJECT_ID value for this DT_ContractSearchSub_VICNCN.
     * 
     * @param OBJECT_ID   * 对象的标识
     */
    public void setOBJECT_ID(java.lang.String OBJECT_ID) {
        this.OBJECT_ID = OBJECT_ID;
    }


    /**
     * Gets the ZZEKORG value for this DT_ContractSearchSub_VICNCN.
     * 
     * @return ZZEKORG   * 采购组织
     */
    public java.lang.String getZZEKORG() {
        return ZZEKORG;
    }


    /**
     * Sets the ZZEKORG value for this DT_ContractSearchSub_VICNCN.
     * 
     * @param ZZEKORG   * 采购组织
     */
    public void setZZEKORG(java.lang.String ZZEKORG) {
        this.ZZEKORG = ZZEKORG;
    }


    /**
     * Gets the ZZEKGRP value for this DT_ContractSearchSub_VICNCN.
     * 
     * @return ZZEKGRP   * 采购组
     */
    public java.lang.String getZZEKGRP() {
        return ZZEKGRP;
    }


    /**
     * Sets the ZZEKGRP value for this DT_ContractSearchSub_VICNCN.
     * 
     * @param ZZEKGRP   * 采购组
     */
    public void setZZEKGRP(java.lang.String ZZEKGRP) {
        this.ZZEKGRP = ZZEKGRP;
    }


    /**
     * Gets the ZZVKORG value for this DT_ContractSearchSub_VICNCN.
     * 
     * @return ZZVKORG   * 销售组织
     */
    public java.lang.String getZZVKORG() {
        return ZZVKORG;
    }


    /**
     * Sets the ZZVKORG value for this DT_ContractSearchSub_VICNCN.
     * 
     * @param ZZVKORG   * 销售组织
     */
    public void setZZVKORG(java.lang.String ZZVKORG) {
        this.ZZVKORG = ZZVKORG;
    }


    /**
     * Gets the ZZVKGRP value for this DT_ContractSearchSub_VICNCN.
     * 
     * @return ZZVKGRP   * 部门编码
     */
    public java.lang.String getZZVKGRP() {
        return ZZVKGRP;
    }


    /**
     * Sets the ZZVKGRP value for this DT_ContractSearchSub_VICNCN.
     * 
     * @param ZZVKGRP   * 部门编码
     */
    public void setZZVKGRP(java.lang.String ZZVKGRP) {
        this.ZZVKGRP = ZZVKGRP;
    }


    /**
     * Gets the ZZVKBUR value for this DT_ContractSearchSub_VICNCN.
     * 
     * @return ZZVKBUR   * 柜组编码
     */
    public java.lang.String getZZVKBUR() {
        return ZZVKBUR;
    }


    /**
     * Sets the ZZVKBUR value for this DT_ContractSearchSub_VICNCN.
     * 
     * @param ZZVKBUR   * 柜组编码
     */
    public void setZZVKBUR(java.lang.String ZZVKBUR) {
        this.ZZVKBUR = ZZVKBUR;
    }


    /**
     * Gets the ZZMVGR1 value for this DT_ContractSearchSub_VICNCN.
     * 
     * @return ZZMVGR1   * 经营属性
     */
    public java.lang.String getZZMVGR1() {
        return ZZMVGR1;
    }


    /**
     * Sets the ZZMVGR1 value for this DT_ContractSearchSub_VICNCN.
     * 
     * @param ZZMVGR1   * 经营属性
     */
    public void setZZMVGR1(java.lang.String ZZMVGR1) {
        this.ZZMVGR1 = ZZMVGR1;
    }


    /**
     * Gets the CONTRACT_NO value for this DT_ContractSearchSub_VICNCN.
     * 
     * @return CONTRACT_NO   * 合同号
     */
    public java.lang.String getCONTRACT_NO() {
        return CONTRACT_NO;
    }


    /**
     * Sets the CONTRACT_NO value for this DT_ContractSearchSub_VICNCN.
     * 
     * @param CONTRACT_NO   * 合同号
     */
    public void setCONTRACT_NO(java.lang.String CONTRACT_NO) {
        this.CONTRACT_NO = CONTRACT_NO;
    }


    /**
     * Gets the ZZBUSINES value for this DT_ContractSearchSub_VICNCN.
     * 
     * @return ZZBUSINES   * 业态
     */
    public java.lang.String getZZBUSINES() {
        return ZZBUSINES;
    }


    /**
     * Sets the ZZBUSINES value for this DT_ContractSearchSub_VICNCN.
     * 
     * @param ZZBUSINES   * 业态
     */
    public void setZZBUSINES(java.lang.String ZZBUSINES) {
        this.ZZBUSINES = ZZBUSINES;
    }


    /**
     * Gets the ZZUNITE value for this DT_ContractSearchSub_VICNCN.
     * 
     * @return ZZUNITE   * 是否统一收银
     */
    public java.lang.String getZZUNITE() {
        return ZZUNITE;
    }


    /**
     * Sets the ZZUNITE value for this DT_ContractSearchSub_VICNCN.
     * 
     * @param ZZUNITE   * 是否统一收银
     */
    public void setZZUNITE(java.lang.String ZZUNITE) {
        this.ZZUNITE = ZZUNITE;
    }


    /**
     * Gets the ZZSPSELL value for this DT_ContractSearchSub_VICNCN.
     * 
     * @return ZZSPSELL   * 是否特卖
     */
    public java.lang.String getZZSPSELL() {
        return ZZSPSELL;
    }


    /**
     * Sets the ZZSPSELL value for this DT_ContractSearchSub_VICNCN.
     * 
     * @param ZZSPSELL   * 是否特卖
     */
    public void setZZSPSELL(java.lang.String ZZSPSELL) {
        this.ZZSPSELL = ZZSPSELL;
    }


    /**
     * Gets the ZZOTCTIME value for this DT_ContractSearchSub_VICNCN.
     * 
     * @return ZZOTCTIME   * 上柜时间
     */
    public java.lang.String getZZOTCTIME() {
        return ZZOTCTIME;
    }


    /**
     * Sets the ZZOTCTIME value for this DT_ContractSearchSub_VICNCN.
     * 
     * @param ZZOTCTIME   * 上柜时间
     */
    public void setZZOTCTIME(java.lang.String ZZOTCTIME) {
        this.ZZOTCTIME = ZZOTCTIME;
    }


    /**
     * Gets the ZZFACTSTAFF value for this DT_ContractSearchSub_VICNCN.
     * 
     * @return ZZFACTSTAFF   * 驻厂人员
     */
    public java.lang.String getZZFACTSTAFF() {
        return ZZFACTSTAFF;
    }


    /**
     * Sets the ZZFACTSTAFF value for this DT_ContractSearchSub_VICNCN.
     * 
     * @param ZZFACTSTAFF   * 驻厂人员
     */
    public void setZZFACTSTAFF(java.lang.String ZZFACTSTAFF) {
        this.ZZFACTSTAFF = ZZFACTSTAFF;
    }


    /**
     * Gets the ZZSTAFFGP value for this DT_ContractSearchSub_VICNCN.
     * 
     * @return ZZSTAFFGP   * 人员编制
     */
    public java.lang.String getZZSTAFFGP() {
        return ZZSTAFFGP;
    }


    /**
     * Sets the ZZSTAFFGP value for this DT_ContractSearchSub_VICNCN.
     * 
     * @param ZZSTAFFGP   * 人员编制
     */
    public void setZZSTAFFGP(java.lang.String ZZSTAFFGP) {
        this.ZZSTAFFGP = ZZSTAFFGP;
    }


    /**
     * Gets the ZZSUPPLY_TYPE_NO value for this DT_ContractSearchSub_VICNCN.
     * 
     * @return ZZSUPPLY_TYPE_NO   * 门类编码
     */
    public java.lang.String getZZSUPPLY_TYPE_NO() {
        return ZZSUPPLY_TYPE_NO;
    }


    /**
     * Sets the ZZSUPPLY_TYPE_NO value for this DT_ContractSearchSub_VICNCN.
     * 
     * @param ZZSUPPLY_TYPE_NO   * 门类编码
     */
    public void setZZSUPPLY_TYPE_NO(java.lang.String ZZSUPPLY_TYPE_NO) {
        this.ZZSUPPLY_TYPE_NO = ZZSUPPLY_TYPE_NO;
    }


    /**
     * Gets the ZZMANCLASS value for this DT_ContractSearchSub_VICNCN.
     * 
     * @return ZZMANCLASS   * 贸易公司经营分类
     */
    public java.lang.String getZZMANCLASS() {
        return ZZMANCLASS;
    }


    /**
     * Sets the ZZMANCLASS value for this DT_ContractSearchSub_VICNCN.
     * 
     * @param ZZMANCLASS   * 贸易公司经营分类
     */
    public void setZZMANCLASS(java.lang.String ZZMANCLASS) {
        this.ZZMANCLASS = ZZMANCLASS;
    }


    /**
     * Gets the ZZCONCHANGE_DATE value for this DT_ContractSearchSub_VICNCN.
     * 
     * @return ZZCONCHANGE_DATE   * 合同更改时间
     */
    public java.lang.String getZZCONCHANGE_DATE() {
        return ZZCONCHANGE_DATE;
    }


    /**
     * Sets the ZZCONCHANGE_DATE value for this DT_ContractSearchSub_VICNCN.
     * 
     * @param ZZCONCHANGE_DATE   * 合同更改时间
     */
    public void setZZCONCHANGE_DATE(java.lang.String ZZCONCHANGE_DATE) {
        this.ZZCONCHANGE_DATE = ZZCONCHANGE_DATE;
    }


    /**
     * Gets the ZZCONCHANGE_RE value for this DT_ContractSearchSub_VICNCN.
     * 
     * @return ZZCONCHANGE_RE   * 合同更改原因
     */
    public java.lang.String getZZCONCHANGE_RE() {
        return ZZCONCHANGE_RE;
    }


    /**
     * Sets the ZZCONCHANGE_RE value for this DT_ContractSearchSub_VICNCN.
     * 
     * @param ZZCONCHANGE_RE   * 合同更改原因
     */
    public void setZZCONCHANGE_RE(java.lang.String ZZCONCHANGE_RE) {
        this.ZZCONCHANGE_RE = ZZCONCHANGE_RE;
    }


    /**
     * Gets the ZZDELIMETH value for this DT_ContractSearchSub_VICNCN.
     * 
     * @return ZZDELIMETH   * 交货方式
     */
    public java.lang.String getZZDELIMETH() {
        return ZZDELIMETH;
    }


    /**
     * Sets the ZZDELIMETH value for this DT_ContractSearchSub_VICNCN.
     * 
     * @param ZZDELIMETH   * 交货方式
     */
    public void setZZDELIMETH(java.lang.String ZZDELIMETH) {
        this.ZZDELIMETH = ZZDELIMETH;
    }


    /**
     * Gets the ZZDELIDES value for this DT_ContractSearchSub_VICNCN.
     * 
     * @return ZZDELIDES   * 交货地点
     */
    public java.lang.String getZZDELIDES() {
        return ZZDELIDES;
    }


    /**
     * Sets the ZZDELIDES value for this DT_ContractSearchSub_VICNCN.
     * 
     * @param ZZDELIDES   * 交货地点
     */
    public void setZZDELIDES(java.lang.String ZZDELIDES) {
        this.ZZDELIDES = ZZDELIDES;
    }


    /**
     * Gets the ZZTRANMETH value for this DT_ContractSearchSub_VICNCN.
     * 
     * @return ZZTRANMETH   * 运输方式
     */
    public java.lang.String getZZTRANMETH() {
        return ZZTRANMETH;
    }


    /**
     * Sets the ZZTRANMETH value for this DT_ContractSearchSub_VICNCN.
     * 
     * @param ZZTRANMETH   * 运输方式
     */
    public void setZZTRANMETH(java.lang.String ZZTRANMETH) {
        this.ZZTRANMETH = ZZTRANMETH;
    }


    /**
     * Gets the ZZCON_VPERSON value for this DT_ContractSearchSub_VICNCN.
     * 
     * @return ZZCON_VPERSON   * 供方签约人
     */
    public java.lang.String getZZCON_VPERSON() {
        return ZZCON_VPERSON;
    }


    /**
     * Sets the ZZCON_VPERSON value for this DT_ContractSearchSub_VICNCN.
     * 
     * @param ZZCON_VPERSON   * 供方签约人
     */
    public void setZZCON_VPERSON(java.lang.String ZZCON_VPERSON) {
        this.ZZCON_VPERSON = ZZCON_VPERSON;
    }


    /**
     * Gets the ZZCON_DEPART value for this DT_ContractSearchSub_VICNCN.
     * 
     * @return ZZCON_DEPART   * 集团管理部门
     */
    public java.lang.String getZZCON_DEPART() {
        return ZZCON_DEPART;
    }


    /**
     * Sets the ZZCON_DEPART value for this DT_ContractSearchSub_VICNCN.
     * 
     * @param ZZCON_DEPART   * 集团管理部门
     */
    public void setZZCON_DEPART(java.lang.String ZZCON_DEPART) {
        this.ZZCON_DEPART = ZZCON_DEPART;
    }


    /**
     * Gets the ZZCON_CPERSON value for this DT_ContractSearchSub_VICNCN.
     * 
     * @return ZZCON_CPERSON   * 中心签约人
     */
    public java.lang.String getZZCON_CPERSON() {
        return ZZCON_CPERSON;
    }


    /**
     * Sets the ZZCON_CPERSON value for this DT_ContractSearchSub_VICNCN.
     * 
     * @param ZZCON_CPERSON   * 中心签约人
     */
    public void setZZCON_CPERSON(java.lang.String ZZCON_CPERSON) {
        this.ZZCON_CPERSON = ZZCON_CPERSON;
    }


    /**
     * Gets the ZZAUDIT_DATE value for this DT_ContractSearchSub_VICNCN.
     * 
     * @return ZZAUDIT_DATE   * 审核时间
     */
    public java.lang.String getZZAUDIT_DATE() {
        return ZZAUDIT_DATE;
    }


    /**
     * Sets the ZZAUDIT_DATE value for this DT_ContractSearchSub_VICNCN.
     * 
     * @param ZZAUDIT_DATE   * 审核时间
     */
    public void setZZAUDIT_DATE(java.lang.String ZZAUDIT_DATE) {
        this.ZZAUDIT_DATE = ZZAUDIT_DATE;
    }


    /**
     * Gets the ZZAUDIT_PERSON value for this DT_ContractSearchSub_VICNCN.
     * 
     * @return ZZAUDIT_PERSON   * 审核人
     */
    public java.lang.String getZZAUDIT_PERSON() {
        return ZZAUDIT_PERSON;
    }


    /**
     * Sets the ZZAUDIT_PERSON value for this DT_ContractSearchSub_VICNCN.
     * 
     * @param ZZAUDIT_PERSON   * 审核人
     */
    public void setZZAUDIT_PERSON(java.lang.String ZZAUDIT_PERSON) {
        this.ZZAUDIT_PERSON = ZZAUDIT_PERSON;
    }


    /**
     * Gets the ZZENTRY_DATE value for this DT_ContractSearchSub_VICNCN.
     * 
     * @return ZZENTRY_DATE   * 录入时间
     */
    public java.lang.String getZZENTRY_DATE() {
        return ZZENTRY_DATE;
    }


    /**
     * Sets the ZZENTRY_DATE value for this DT_ContractSearchSub_VICNCN.
     * 
     * @param ZZENTRY_DATE   * 录入时间
     */
    public void setZZENTRY_DATE(java.lang.String ZZENTRY_DATE) {
        this.ZZENTRY_DATE = ZZENTRY_DATE;
    }


    /**
     * Gets the ZZENTRY_PERSON value for this DT_ContractSearchSub_VICNCN.
     * 
     * @return ZZENTRY_PERSON   * 录入人
     */
    public java.lang.String getZZENTRY_PERSON() {
        return ZZENTRY_PERSON;
    }


    /**
     * Sets the ZZENTRY_PERSON value for this DT_ContractSearchSub_VICNCN.
     * 
     * @param ZZENTRY_PERSON   * 录入人
     */
    public void setZZENTRY_PERSON(java.lang.String ZZENTRY_PERSON) {
        this.ZZENTRY_PERSON = ZZENTRY_PERSON;
    }


    /**
     * Gets the ZZOTHER value for this DT_ContractSearchSub_VICNCN.
     * 
     * @return ZZOTHER   * 其他
     */
    public java.lang.String getZZOTHER() {
        return ZZOTHER;
    }


    /**
     * Sets the ZZOTHER value for this DT_ContractSearchSub_VICNCN.
     * 
     * @param ZZOTHER   * 其他
     */
    public void setZZOTHER(java.lang.String ZZOTHER) {
        this.ZZOTHER = ZZOTHER;
    }


    /**
     * Gets the ZZSTOCKRATE value for this DT_ContractSearchSub_VICNCN.
     * 
     * @return ZZSTOCKRATE   * 款库比%
     */
    public java.lang.String getZZSTOCKRATE() {
        return ZZSTOCKRATE;
    }


    /**
     * Sets the ZZSTOCKRATE value for this DT_ContractSearchSub_VICNCN.
     * 
     * @param ZZSTOCKRATE   * 款库比%
     */
    public void setZZSTOCKRATE(java.lang.String ZZSTOCKRATE) {
        this.ZZSTOCKRATE = ZZSTOCKRATE;
    }


    /**
     * Gets the ZZPRO_AMOUNT value for this DT_ContractSearchSub_VICNCN.
     * 
     * @return ZZPRO_AMOUNT   * 建议实销金额
     */
    public java.lang.String getZZPRO_AMOUNT() {
        return ZZPRO_AMOUNT;
    }


    /**
     * Sets the ZZPRO_AMOUNT value for this DT_ContractSearchSub_VICNCN.
     * 
     * @param ZZPRO_AMOUNT   * 建议实销金额
     */
    public void setZZPRO_AMOUNT(java.lang.String ZZPRO_AMOUNT) {
        this.ZZPRO_AMOUNT = ZZPRO_AMOUNT;
    }


    /**
     * Gets the ZZDISCOUNT_COST value for this DT_ContractSearchSub_VICNCN.
     * 
     * @return ZZDISCOUNT_COST   * 成本折扣
     */
    public java.lang.String getZZDISCOUNT_COST() {
        return ZZDISCOUNT_COST;
    }


    /**
     * Sets the ZZDISCOUNT_COST value for this DT_ContractSearchSub_VICNCN.
     * 
     * @param ZZDISCOUNT_COST   * 成本折扣
     */
    public void setZZDISCOUNT_COST(java.lang.String ZZDISCOUNT_COST) {
        this.ZZDISCOUNT_COST = ZZDISCOUNT_COST;
    }


    /**
     * Gets the ZZTRAN_COST value for this DT_ContractSearchSub_VICNCN.
     * 
     * @return ZZTRAN_COST   * 运费承担
     */
    public java.lang.String getZZTRAN_COST() {
        return ZZTRAN_COST;
    }


    /**
     * Sets the ZZTRAN_COST value for this DT_ContractSearchSub_VICNCN.
     * 
     * @param ZZTRAN_COST   * 运费承担
     */
    public void setZZTRAN_COST(java.lang.String ZZTRAN_COST) {
        this.ZZTRAN_COST = ZZTRAN_COST;
    }


    /**
     * Gets the ZZQUAN_COST value for this DT_ContractSearchSub_VICNCN.
     * 
     * @return ZZQUAN_COST   * 质检费承担
     */
    public java.lang.String getZZQUAN_COST() {
        return ZZQUAN_COST;
    }


    /**
     * Sets the ZZQUAN_COST value for this DT_ContractSearchSub_VICNCN.
     * 
     * @param ZZQUAN_COST   * 质检费承担
     */
    public void setZZQUAN_COST(java.lang.String ZZQUAN_COST) {
        this.ZZQUAN_COST = ZZQUAN_COST;
    }


    /**
     * Gets the ZZDECO_COST value for this DT_ContractSearchSub_VICNCN.
     * 
     * @return ZZDECO_COST   * 装修费承担
     */
    public java.lang.String getZZDECO_COST() {
        return ZZDECO_COST;
    }


    /**
     * Sets the ZZDECO_COST value for this DT_ContractSearchSub_VICNCN.
     * 
     * @param ZZDECO_COST   * 装修费承担
     */
    public void setZZDECO_COST(java.lang.String ZZDECO_COST) {
        this.ZZDECO_COST = ZZDECO_COST;
    }


    /**
     * Gets the ZZSALES_COST value for this DT_ContractSearchSub_VICNCN.
     * 
     * @return ZZSALES_COST   * 促销费承担
     */
    public java.lang.String getZZSALES_COST() {
        return ZZSALES_COST;
    }


    /**
     * Sets the ZZSALES_COST value for this DT_ContractSearchSub_VICNCN.
     * 
     * @param ZZSALES_COST   * 促销费承担
     */
    public void setZZSALES_COST(java.lang.String ZZSALES_COST) {
        this.ZZSALES_COST = ZZSALES_COST;
    }


    /**
     * Gets the ZZPREPAY value for this DT_ContractSearchSub_VICNCN.
     * 
     * @return ZZPREPAY   * 预付款/押金
     */
    public java.lang.String getZZPREPAY() {
        return ZZPREPAY;
    }


    /**
     * Sets the ZZPREPAY value for this DT_ContractSearchSub_VICNCN.
     * 
     * @param ZZPREPAY   * 预付款/押金
     */
    public void setZZPREPAY(java.lang.String ZZPREPAY) {
        this.ZZPREPAY = ZZPREPAY;
    }


    /**
     * Gets the ZZTERM value for this DT_ContractSearchSub_VICNCN.
     * 
     * @return ZZTERM   * 付款条件代码
     */
    public java.lang.String getZZTERM() {
        return ZZTERM;
    }


    /**
     * Sets the ZZTERM value for this DT_ContractSearchSub_VICNCN.
     * 
     * @param ZZTERM   * 付款条件代码
     */
    public void setZZTERM(java.lang.String ZZTERM) {
        this.ZZTERM = ZZTERM;
    }


    /**
     * Gets the ZZREBATEMETH value for this DT_ContractSearchSub_VICNCN.
     * 
     * @return ZZREBATEMETH   * 返利类型
     */
    public java.lang.String getZZREBATEMETH() {
        return ZZREBATEMETH;
    }


    /**
     * Sets the ZZREBATEMETH value for this DT_ContractSearchSub_VICNCN.
     * 
     * @param ZZREBATEMETH   * 返利类型
     */
    public void setZZREBATEMETH(java.lang.String ZZREBATEMETH) {
        this.ZZREBATEMETH = ZZREBATEMETH;
    }


    /**
     * Gets the ZZBRAND_IDMAIN value for this DT_ContractSearchSub_VICNCN.
     * 
     * @return ZZBRAND_IDMAIN   * 主品牌编码
     */
    public java.lang.String getZZBRAND_IDMAIN() {
        return ZZBRAND_IDMAIN;
    }


    /**
     * Sets the ZZBRAND_IDMAIN value for this DT_ContractSearchSub_VICNCN.
     * 
     * @param ZZBRAND_IDMAIN   * 主品牌编码
     */
    public void setZZBRAND_IDMAIN(java.lang.String ZZBRAND_IDMAIN) {
        this.ZZBRAND_IDMAIN = ZZBRAND_IDMAIN;
    }


    /**
     * Gets the ZZDPTYPE value for this DT_ContractSearchSub_VICNCN.
     * 
     * @return ZZDPTYPE   * 扣率形式
     */
    public java.lang.String getZZDPTYPE() {
        return ZZDPTYPE;
    }


    /**
     * Sets the ZZDPTYPE value for this DT_ContractSearchSub_VICNCN.
     * 
     * @param ZZDPTYPE   * 扣率形式
     */
    public void setZZDPTYPE(java.lang.String ZZDPTYPE) {
        this.ZZDPTYPE = ZZDPTYPE;
    }


    /**
     * Gets the ZZMINSALE_TOTAL value for this DT_ContractSearchSub_VICNCN.
     * 
     * @return ZZMINSALE_TOTAL   * 总保底
     */
    public java.lang.String getZZMINSALE_TOTAL() {
        return ZZMINSALE_TOTAL;
    }


    /**
     * Sets the ZZMINSALE_TOTAL value for this DT_ContractSearchSub_VICNCN.
     * 
     * @param ZZMINSALE_TOTAL   * 总保底
     */
    public void setZZMINSALE_TOTAL(java.lang.String ZZMINSALE_TOTAL) {
        this.ZZMINSALE_TOTAL = ZZMINSALE_TOTAL;
    }


    /**
     * Gets the ZZTERMINATE value for this DT_ContractSearchSub_VICNCN.
     * 
     * @return ZZTERMINATE   * 是否提前终止
     */
    public java.lang.String getZZTERMINATE() {
        return ZZTERMINATE;
    }


    /**
     * Sets the ZZTERMINATE value for this DT_ContractSearchSub_VICNCN.
     * 
     * @param ZZTERMINATE   * 是否提前终止
     */
    public void setZZTERMINATE(java.lang.String ZZTERMINATE) {
        this.ZZTERMINATE = ZZTERMINATE;
    }


    /**
     * Gets the ZZACTDATE value for this DT_ContractSearchSub_VICNCN.
     * 
     * @return ZZACTDATE   * 更改生效日期
     */
    public java.lang.String getZZACTDATE() {
        return ZZACTDATE;
    }


    /**
     * Sets the ZZACTDATE value for this DT_ContractSearchSub_VICNCN.
     * 
     * @param ZZACTDATE   * 更改生效日期
     */
    public void setZZACTDATE(java.lang.String ZZACTDATE) {
        this.ZZACTDATE = ZZACTDATE;
    }


    /**
     * Gets the ZZRECH_UNAME value for this DT_ContractSearchSub_VICNCN.
     * 
     * @return ZZRECH_UNAME   * 合同更改人
     */
    public java.lang.String getZZRECH_UNAME() {
        return ZZRECH_UNAME;
    }


    /**
     * Sets the ZZRECH_UNAME value for this DT_ContractSearchSub_VICNCN.
     * 
     * @param ZZRECH_UNAME   * 合同更改人
     */
    public void setZZRECH_UNAME(java.lang.String ZZRECH_UNAME) {
        this.ZZRECH_UNAME = ZZRECH_UNAME;
    }


    /**
     * Gets the ZZVIP_FLG value for this DT_ContractSearchSub_VICNCN.
     * 
     * @return ZZVIP_FLG   * 是否使用VIP卡
     */
    public java.lang.String getZZVIP_FLG() {
        return ZZVIP_FLG;
    }


    /**
     * Sets the ZZVIP_FLG value for this DT_ContractSearchSub_VICNCN.
     * 
     * @param ZZVIP_FLG   * 是否使用VIP卡
     */
    public void setZZVIP_FLG(java.lang.String ZZVIP_FLG) {
        this.ZZVIP_FLG = ZZVIP_FLG;
    }


    /**
     * Gets the ZZSPSELLTP value for this DT_ContractSearchSub_VICNCN.
     * 
     * @return ZZSPSELLTP   * 特卖类型
     */
    public java.lang.String getZZSPSELLTP() {
        return ZZSPSELLTP;
    }


    /**
     * Sets the ZZSPSELLTP value for this DT_ContractSearchSub_VICNCN.
     * 
     * @param ZZSPSELLTP   * 特卖类型
     */
    public void setZZSPSELLTP(java.lang.String ZZSPSELLTP) {
        this.ZZSPSELLTP = ZZSPSELLTP;
    }


    /**
     * Gets the ZZCLCYCLE value for this DT_ContractSearchSub_VICNCN.
     * 
     * @return ZZCLCYCLE   * 合同结算周期
     */
    public java.lang.String getZZCLCYCLE() {
        return ZZCLCYCLE;
    }


    /**
     * Sets the ZZCLCYCLE value for this DT_ContractSearchSub_VICNCN.
     * 
     * @param ZZCLCYCLE   * 合同结算周期
     */
    public void setZZCLCYCLE(java.lang.String ZZCLCYCLE) {
        this.ZZCLCYCLE = ZZCLCYCLE;
    }


    /**
     * Gets the ZZMATTAX value for this DT_ContractSearchSub_VICNCN.
     * 
     * @return ZZMATTAX   * 商品税率
     */
    public java.lang.String getZZMATTAX() {
        return ZZMATTAX;
    }


    /**
     * Sets the ZZMATTAX value for this DT_ContractSearchSub_VICNCN.
     * 
     * @param ZZMATTAX   * 商品税率
     */
    public void setZZMATTAX(java.lang.String ZZMATTAX) {
        this.ZZMATTAX = ZZMATTAX;
    }


    /**
     * Gets the ZRET_FLG value for this DT_ContractSearchSub_VICNCN.
     * 
     * @return ZRET_FLG   * 经销退货
     */
    public java.lang.String getZRET_FLG() {
        return ZRET_FLG;
    }


    /**
     * Sets the ZRET_FLG value for this DT_ContractSearchSub_VICNCN.
     * 
     * @param ZRET_FLG   * 经销退货
     */
    public void setZRET_FLG(java.lang.String ZRET_FLG) {
        this.ZRET_FLG = ZRET_FLG;
    }


    /**
     * Gets the ZPRICE_SET value for this DT_ContractSearchSub_VICNCN.
     * 
     * @return ZPRICE_SET   * 吊牌价结算
     */
    public java.lang.String getZPRICE_SET() {
        return ZPRICE_SET;
    }


    /**
     * Sets the ZPRICE_SET value for this DT_ContractSearchSub_VICNCN.
     * 
     * @param ZPRICE_SET   * 吊牌价结算
     */
    public void setZPRICE_SET(java.lang.String ZPRICE_SET) {
        this.ZPRICE_SET = ZPRICE_SET;
    }


    /**
     * Gets the ZYWLX_JYG value for this DT_ContractSearchSub_VICNCN.
     * 
     * @return ZYWLX_JYG   * 金鹰购业务类型
     */
    public java.lang.String getZYWLX_JYG() {
        return ZYWLX_JYG;
    }


    /**
     * Sets the ZYWLX_JYG value for this DT_ContractSearchSub_VICNCN.
     * 
     * @param ZYWLX_JYG   * 金鹰购业务类型
     */
    public void setZYWLX_JYG(java.lang.String ZYWLX_JYG) {
        this.ZYWLX_JYG = ZYWLX_JYG;
    }


    /**
     * Gets the ZSET_NO value for this DT_ContractSearchSub_VICNCN.
     * 
     * @return ZSET_NO   * 集合柜代码
     */
    public java.lang.String getZSET_NO() {
        return ZSET_NO;
    }


    /**
     * Sets the ZSET_NO value for this DT_ContractSearchSub_VICNCN.
     * 
     * @param ZSET_NO   * 集合柜代码
     */
    public void setZSET_NO(java.lang.String ZSET_NO) {
        this.ZSET_NO = ZSET_NO;
    }


    /**
     * Gets the ZSET_MESS value for this DT_ContractSearchSub_VICNCN.
     * 
     * @return ZSET_MESS   * 集合柜描述
     */
    public java.lang.String getZSET_MESS() {
        return ZSET_MESS;
    }


    /**
     * Sets the ZSET_MESS value for this DT_ContractSearchSub_VICNCN.
     * 
     * @param ZSET_MESS   * 集合柜描述
     */
    public void setZSET_MESS(java.lang.String ZSET_MESS) {
        this.ZSET_MESS = ZSET_MESS;
    }


    /**
     * Gets the ZLSD_TYPE_NO value for this DT_ContractSearchSub_VICNCN.
     * 
     * @return ZLSD_TYPE_NO   * 门类编码
     */
    public java.lang.String getZLSD_TYPE_NO() {
        return ZLSD_TYPE_NO;
    }


    /**
     * Sets the ZLSD_TYPE_NO value for this DT_ContractSearchSub_VICNCN.
     * 
     * @param ZLSD_TYPE_NO   * 门类编码
     */
    public void setZLSD_TYPE_NO(java.lang.String ZLSD_TYPE_NO) {
        this.ZLSD_TYPE_NO = ZLSD_TYPE_NO;
    }


    /**
     * Gets the ZZJZF value for this DT_ContractSearchSub_VICNCN.
     * 
     * @return ZZJZF   * 租金支付形式
     */
    public java.lang.String getZZJZF() {
        return ZZJZF;
    }


    /**
     * Sets the ZZJZF value for this DT_ContractSearchSub_VICNCN.
     * 
     * @param ZZJZF   * 租金支付形式
     */
    public void setZZJZF(java.lang.String ZZJZF) {
        this.ZZJZF = ZZJZF;
    }


    /**
     * Gets the ZJFJZ value for this DT_ContractSearchSub_VICNCN.
     * 
     * @return ZJFJZ   * 缴费截止日
     */
    public java.lang.String getZJFJZ() {
        return ZJFJZ;
    }


    /**
     * Sets the ZJFJZ value for this DT_ContractSearchSub_VICNCN.
     * 
     * @param ZJFJZ   * 缴费截止日
     */
    public void setZJFJZ(java.lang.String ZJFJZ) {
        this.ZJFJZ = ZJFJZ;
    }


    /**
     * Gets the ZWYJF value for this DT_ContractSearchSub_VICNCN.
     * 
     * @return ZWYJF   * 物业交付日期
     */
    public java.lang.String getZWYJF() {
        return ZWYJF;
    }


    /**
     * Sets the ZWYJF value for this DT_ContractSearchSub_VICNCN.
     * 
     * @param ZWYJF   * 物业交付日期
     */
    public void setZWYJF(java.lang.String ZWYJF) {
        this.ZWYJF = ZWYJF;
    }


    /**
     * Gets the ZZJJS value for this DT_ContractSearchSub_VICNCN.
     * 
     * @return ZZJJS   * 租金计算模式
     */
    public java.lang.String getZZJJS() {
        return ZZJJS;
    }


    /**
     * Sets the ZZJJS value for this DT_ContractSearchSub_VICNCN.
     * 
     * @param ZZJJS   * 租金计算模式
     */
    public void setZZJJS(java.lang.String ZZJJS) {
        this.ZZJJS = ZZJJS;
    }


    /**
     * Gets the ZZNJT value for this DT_ContractSearchSub_VICNCN.
     * 
     * @return ZZNJT   * 滞纳金天数
     */
    public java.lang.String getZZNJT() {
        return ZZNJT;
    }


    /**
     * Sets the ZZNJT value for this DT_ContractSearchSub_VICNCN.
     * 
     * @param ZZNJT   * 滞纳金天数
     */
    public void setZZNJT(java.lang.String ZZNJT) {
        this.ZZNJT = ZZNJT;
    }


    /**
     * Gets the ZZNBL value for this DT_ContractSearchSub_VICNCN.
     * 
     * @return ZZNBL   * 滞纳金比例
     */
    public java.lang.String getZZNBL() {
        return ZZNBL;
    }


    /**
     * Sets the ZZNBL value for this DT_ContractSearchSub_VICNCN.
     * 
     * @param ZZNBL   * 滞纳金比例
     */
    public void setZZNBL(java.lang.String ZZNBL) {
        this.ZZNBL = ZZNBL;
    }


    /**
     * Gets the ZJZMJ value for this DT_ContractSearchSub_VICNCN.
     * 
     * @return ZJZMJ   * 建筑面积
     */
    public java.lang.String getZJZMJ() {
        return ZJZMJ;
    }


    /**
     * Sets the ZJZMJ value for this DT_ContractSearchSub_VICNCN.
     * 
     * @param ZJZMJ   * 建筑面积
     */
    public void setZJZMJ(java.lang.String ZJZMJ) {
        this.ZJZMJ = ZJZMJ;
    }


    /**
     * Gets the ZMZKS value for this DT_ContractSearchSub_VICNCN.
     * 
     * @return ZMZKS   * 免租期开始
     */
    public java.lang.String getZMZKS() {
        return ZMZKS;
    }


    /**
     * Sets the ZMZKS value for this DT_ContractSearchSub_VICNCN.
     * 
     * @param ZMZKS   * 免租期开始
     */
    public void setZMZKS(java.lang.String ZMZKS) {
        this.ZMZKS = ZMZKS;
    }


    /**
     * Gets the ZMZJS value for this DT_ContractSearchSub_VICNCN.
     * 
     * @return ZMZJS   * 免租期结束
     */
    public java.lang.String getZMZJS() {
        return ZMZJS;
    }


    /**
     * Sets the ZMZJS value for this DT_ContractSearchSub_VICNCN.
     * 
     * @param ZMZJS   * 免租期结束
     */
    public void setZMZJS(java.lang.String ZMZJS) {
        this.ZMZJS = ZMZJS;
    }


    /**
     * Gets the ZMYJZD value for this DT_ContractSearchSub_VICNCN.
     * 
     * @return ZMYJZD   * 每月10日出结账单选项
     */
    public java.lang.String getZMYJZD() {
        return ZMYJZD;
    }


    /**
     * Sets the ZMYJZD value for this DT_ContractSearchSub_VICNCN.
     * 
     * @param ZMYJZD   * 每月10日出结账单选项
     */
    public void setZMYJZD(java.lang.String ZMYJZD) {
        this.ZMYJZD = ZMYJZD;
    }


    /**
     * Gets the ZWBRQ value for this DT_ContractSearchSub_VICNCN.
     * 
     * @return ZWBRQ   * 合同文本开始日期
     */
    public java.lang.String getZWBRQ() {
        return ZWBRQ;
    }


    /**
     * Sets the ZWBRQ value for this DT_ContractSearchSub_VICNCN.
     * 
     * @param ZWBRQ   * 合同文本开始日期
     */
    public void setZWBRQ(java.lang.String ZWBRQ) {
        this.ZWBRQ = ZWBRQ;
    }

    private java.lang.Object __equalsCalc = null;
    public synchronized boolean equals(java.lang.Object obj) {
        if (!(obj instanceof DT_ContractSearchSub_VICNCN)) return false;
        DT_ContractSearchSub_VICNCN other = (DT_ContractSearchSub_VICNCN) obj;
        if (obj == null) return false;
        if (this == obj) return true;
        if (__equalsCalc != null) {
            return (__equalsCalc == obj);
        }
        __equalsCalc = obj;
        boolean _equals;
        _equals = true && 
            ((this.OBJECT_ID==null && other.getOBJECT_ID()==null) || 
             (this.OBJECT_ID!=null &&
              this.OBJECT_ID.equals(other.getOBJECT_ID()))) &&
            ((this.ZZEKORG==null && other.getZZEKORG()==null) || 
             (this.ZZEKORG!=null &&
              this.ZZEKORG.equals(other.getZZEKORG()))) &&
            ((this.ZZEKGRP==null && other.getZZEKGRP()==null) || 
             (this.ZZEKGRP!=null &&
              this.ZZEKGRP.equals(other.getZZEKGRP()))) &&
            ((this.ZZVKORG==null && other.getZZVKORG()==null) || 
             (this.ZZVKORG!=null &&
              this.ZZVKORG.equals(other.getZZVKORG()))) &&
            ((this.ZZVKGRP==null && other.getZZVKGRP()==null) || 
             (this.ZZVKGRP!=null &&
              this.ZZVKGRP.equals(other.getZZVKGRP()))) &&
            ((this.ZZVKBUR==null && other.getZZVKBUR()==null) || 
             (this.ZZVKBUR!=null &&
              this.ZZVKBUR.equals(other.getZZVKBUR()))) &&
            ((this.ZZMVGR1==null && other.getZZMVGR1()==null) || 
             (this.ZZMVGR1!=null &&
              this.ZZMVGR1.equals(other.getZZMVGR1()))) &&
            ((this.CONTRACT_NO==null && other.getCONTRACT_NO()==null) || 
             (this.CONTRACT_NO!=null &&
              this.CONTRACT_NO.equals(other.getCONTRACT_NO()))) &&
            ((this.ZZBUSINES==null && other.getZZBUSINES()==null) || 
             (this.ZZBUSINES!=null &&
              this.ZZBUSINES.equals(other.getZZBUSINES()))) &&
            ((this.ZZUNITE==null && other.getZZUNITE()==null) || 
             (this.ZZUNITE!=null &&
              this.ZZUNITE.equals(other.getZZUNITE()))) &&
            ((this.ZZSPSELL==null && other.getZZSPSELL()==null) || 
             (this.ZZSPSELL!=null &&
              this.ZZSPSELL.equals(other.getZZSPSELL()))) &&
            ((this.ZZOTCTIME==null && other.getZZOTCTIME()==null) || 
             (this.ZZOTCTIME!=null &&
              this.ZZOTCTIME.equals(other.getZZOTCTIME()))) &&
            ((this.ZZFACTSTAFF==null && other.getZZFACTSTAFF()==null) || 
             (this.ZZFACTSTAFF!=null &&
              this.ZZFACTSTAFF.equals(other.getZZFACTSTAFF()))) &&
            ((this.ZZSTAFFGP==null && other.getZZSTAFFGP()==null) || 
             (this.ZZSTAFFGP!=null &&
              this.ZZSTAFFGP.equals(other.getZZSTAFFGP()))) &&
            ((this.ZZSUPPLY_TYPE_NO==null && other.getZZSUPPLY_TYPE_NO()==null) || 
             (this.ZZSUPPLY_TYPE_NO!=null &&
              this.ZZSUPPLY_TYPE_NO.equals(other.getZZSUPPLY_TYPE_NO()))) &&
            ((this.ZZMANCLASS==null && other.getZZMANCLASS()==null) || 
             (this.ZZMANCLASS!=null &&
              this.ZZMANCLASS.equals(other.getZZMANCLASS()))) &&
            ((this.ZZCONCHANGE_DATE==null && other.getZZCONCHANGE_DATE()==null) || 
             (this.ZZCONCHANGE_DATE!=null &&
              this.ZZCONCHANGE_DATE.equals(other.getZZCONCHANGE_DATE()))) &&
            ((this.ZZCONCHANGE_RE==null && other.getZZCONCHANGE_RE()==null) || 
             (this.ZZCONCHANGE_RE!=null &&
              this.ZZCONCHANGE_RE.equals(other.getZZCONCHANGE_RE()))) &&
            ((this.ZZDELIMETH==null && other.getZZDELIMETH()==null) || 
             (this.ZZDELIMETH!=null &&
              this.ZZDELIMETH.equals(other.getZZDELIMETH()))) &&
            ((this.ZZDELIDES==null && other.getZZDELIDES()==null) || 
             (this.ZZDELIDES!=null &&
              this.ZZDELIDES.equals(other.getZZDELIDES()))) &&
            ((this.ZZTRANMETH==null && other.getZZTRANMETH()==null) || 
             (this.ZZTRANMETH!=null &&
              this.ZZTRANMETH.equals(other.getZZTRANMETH()))) &&
            ((this.ZZCON_VPERSON==null && other.getZZCON_VPERSON()==null) || 
             (this.ZZCON_VPERSON!=null &&
              this.ZZCON_VPERSON.equals(other.getZZCON_VPERSON()))) &&
            ((this.ZZCON_DEPART==null && other.getZZCON_DEPART()==null) || 
             (this.ZZCON_DEPART!=null &&
              this.ZZCON_DEPART.equals(other.getZZCON_DEPART()))) &&
            ((this.ZZCON_CPERSON==null && other.getZZCON_CPERSON()==null) || 
             (this.ZZCON_CPERSON!=null &&
              this.ZZCON_CPERSON.equals(other.getZZCON_CPERSON()))) &&
            ((this.ZZAUDIT_DATE==null && other.getZZAUDIT_DATE()==null) || 
             (this.ZZAUDIT_DATE!=null &&
              this.ZZAUDIT_DATE.equals(other.getZZAUDIT_DATE()))) &&
            ((this.ZZAUDIT_PERSON==null && other.getZZAUDIT_PERSON()==null) || 
             (this.ZZAUDIT_PERSON!=null &&
              this.ZZAUDIT_PERSON.equals(other.getZZAUDIT_PERSON()))) &&
            ((this.ZZENTRY_DATE==null && other.getZZENTRY_DATE()==null) || 
             (this.ZZENTRY_DATE!=null &&
              this.ZZENTRY_DATE.equals(other.getZZENTRY_DATE()))) &&
            ((this.ZZENTRY_PERSON==null && other.getZZENTRY_PERSON()==null) || 
             (this.ZZENTRY_PERSON!=null &&
              this.ZZENTRY_PERSON.equals(other.getZZENTRY_PERSON()))) &&
            ((this.ZZOTHER==null && other.getZZOTHER()==null) || 
             (this.ZZOTHER!=null &&
              this.ZZOTHER.equals(other.getZZOTHER()))) &&
            ((this.ZZSTOCKRATE==null && other.getZZSTOCKRATE()==null) || 
             (this.ZZSTOCKRATE!=null &&
              this.ZZSTOCKRATE.equals(other.getZZSTOCKRATE()))) &&
            ((this.ZZPRO_AMOUNT==null && other.getZZPRO_AMOUNT()==null) || 
             (this.ZZPRO_AMOUNT!=null &&
              this.ZZPRO_AMOUNT.equals(other.getZZPRO_AMOUNT()))) &&
            ((this.ZZDISCOUNT_COST==null && other.getZZDISCOUNT_COST()==null) || 
             (this.ZZDISCOUNT_COST!=null &&
              this.ZZDISCOUNT_COST.equals(other.getZZDISCOUNT_COST()))) &&
            ((this.ZZTRAN_COST==null && other.getZZTRAN_COST()==null) || 
             (this.ZZTRAN_COST!=null &&
              this.ZZTRAN_COST.equals(other.getZZTRAN_COST()))) &&
            ((this.ZZQUAN_COST==null && other.getZZQUAN_COST()==null) || 
             (this.ZZQUAN_COST!=null &&
              this.ZZQUAN_COST.equals(other.getZZQUAN_COST()))) &&
            ((this.ZZDECO_COST==null && other.getZZDECO_COST()==null) || 
             (this.ZZDECO_COST!=null &&
              this.ZZDECO_COST.equals(other.getZZDECO_COST()))) &&
            ((this.ZZSALES_COST==null && other.getZZSALES_COST()==null) || 
             (this.ZZSALES_COST!=null &&
              this.ZZSALES_COST.equals(other.getZZSALES_COST()))) &&
            ((this.ZZPREPAY==null && other.getZZPREPAY()==null) || 
             (this.ZZPREPAY!=null &&
              this.ZZPREPAY.equals(other.getZZPREPAY()))) &&
            ((this.ZZTERM==null && other.getZZTERM()==null) || 
             (this.ZZTERM!=null &&
              this.ZZTERM.equals(other.getZZTERM()))) &&
            ((this.ZZREBATEMETH==null && other.getZZREBATEMETH()==null) || 
             (this.ZZREBATEMETH!=null &&
              this.ZZREBATEMETH.equals(other.getZZREBATEMETH()))) &&
            ((this.ZZBRAND_IDMAIN==null && other.getZZBRAND_IDMAIN()==null) || 
             (this.ZZBRAND_IDMAIN!=null &&
              this.ZZBRAND_IDMAIN.equals(other.getZZBRAND_IDMAIN()))) &&
            ((this.ZZDPTYPE==null && other.getZZDPTYPE()==null) || 
             (this.ZZDPTYPE!=null &&
              this.ZZDPTYPE.equals(other.getZZDPTYPE()))) &&
            ((this.ZZMINSALE_TOTAL==null && other.getZZMINSALE_TOTAL()==null) || 
             (this.ZZMINSALE_TOTAL!=null &&
              this.ZZMINSALE_TOTAL.equals(other.getZZMINSALE_TOTAL()))) &&
            ((this.ZZTERMINATE==null && other.getZZTERMINATE()==null) || 
             (this.ZZTERMINATE!=null &&
              this.ZZTERMINATE.equals(other.getZZTERMINATE()))) &&
            ((this.ZZACTDATE==null && other.getZZACTDATE()==null) || 
             (this.ZZACTDATE!=null &&
              this.ZZACTDATE.equals(other.getZZACTDATE()))) &&
            ((this.ZZRECH_UNAME==null && other.getZZRECH_UNAME()==null) || 
             (this.ZZRECH_UNAME!=null &&
              this.ZZRECH_UNAME.equals(other.getZZRECH_UNAME()))) &&
            ((this.ZZVIP_FLG==null && other.getZZVIP_FLG()==null) || 
             (this.ZZVIP_FLG!=null &&
              this.ZZVIP_FLG.equals(other.getZZVIP_FLG()))) &&
            ((this.ZZSPSELLTP==null && other.getZZSPSELLTP()==null) || 
             (this.ZZSPSELLTP!=null &&
              this.ZZSPSELLTP.equals(other.getZZSPSELLTP()))) &&
            ((this.ZZCLCYCLE==null && other.getZZCLCYCLE()==null) || 
             (this.ZZCLCYCLE!=null &&
              this.ZZCLCYCLE.equals(other.getZZCLCYCLE()))) &&
            ((this.ZZMATTAX==null && other.getZZMATTAX()==null) || 
             (this.ZZMATTAX!=null &&
              this.ZZMATTAX.equals(other.getZZMATTAX()))) &&
            ((this.ZRET_FLG==null && other.getZRET_FLG()==null) || 
             (this.ZRET_FLG!=null &&
              this.ZRET_FLG.equals(other.getZRET_FLG()))) &&
            ((this.ZPRICE_SET==null && other.getZPRICE_SET()==null) || 
             (this.ZPRICE_SET!=null &&
              this.ZPRICE_SET.equals(other.getZPRICE_SET()))) &&
            ((this.ZYWLX_JYG==null && other.getZYWLX_JYG()==null) || 
             (this.ZYWLX_JYG!=null &&
              this.ZYWLX_JYG.equals(other.getZYWLX_JYG()))) &&
            ((this.ZSET_NO==null && other.getZSET_NO()==null) || 
             (this.ZSET_NO!=null &&
              this.ZSET_NO.equals(other.getZSET_NO()))) &&
            ((this.ZSET_MESS==null && other.getZSET_MESS()==null) || 
             (this.ZSET_MESS!=null &&
              this.ZSET_MESS.equals(other.getZSET_MESS()))) &&
            ((this.ZLSD_TYPE_NO==null && other.getZLSD_TYPE_NO()==null) || 
             (this.ZLSD_TYPE_NO!=null &&
              this.ZLSD_TYPE_NO.equals(other.getZLSD_TYPE_NO()))) &&
            ((this.ZZJZF==null && other.getZZJZF()==null) || 
             (this.ZZJZF!=null &&
              this.ZZJZF.equals(other.getZZJZF()))) &&
            ((this.ZJFJZ==null && other.getZJFJZ()==null) || 
             (this.ZJFJZ!=null &&
              this.ZJFJZ.equals(other.getZJFJZ()))) &&
            ((this.ZWYJF==null && other.getZWYJF()==null) || 
             (this.ZWYJF!=null &&
              this.ZWYJF.equals(other.getZWYJF()))) &&
            ((this.ZZJJS==null && other.getZZJJS()==null) || 
             (this.ZZJJS!=null &&
              this.ZZJJS.equals(other.getZZJJS()))) &&
            ((this.ZZNJT==null && other.getZZNJT()==null) || 
             (this.ZZNJT!=null &&
              this.ZZNJT.equals(other.getZZNJT()))) &&
            ((this.ZZNBL==null && other.getZZNBL()==null) || 
             (this.ZZNBL!=null &&
              this.ZZNBL.equals(other.getZZNBL()))) &&
            ((this.ZJZMJ==null && other.getZJZMJ()==null) || 
             (this.ZJZMJ!=null &&
              this.ZJZMJ.equals(other.getZJZMJ()))) &&
            ((this.ZMZKS==null && other.getZMZKS()==null) || 
             (this.ZMZKS!=null &&
              this.ZMZKS.equals(other.getZMZKS()))) &&
            ((this.ZMZJS==null && other.getZMZJS()==null) || 
             (this.ZMZJS!=null &&
              this.ZMZJS.equals(other.getZMZJS()))) &&
            ((this.ZMYJZD==null && other.getZMYJZD()==null) || 
             (this.ZMYJZD!=null &&
              this.ZMYJZD.equals(other.getZMYJZD()))) &&
            ((this.ZWBRQ==null && other.getZWBRQ()==null) || 
             (this.ZWBRQ!=null &&
              this.ZWBRQ.equals(other.getZWBRQ())));
        __equalsCalc = null;
        return _equals;
    }

    private boolean __hashCodeCalc = false;
    public synchronized int hashCode() {
        if (__hashCodeCalc) {
            return 0;
        }
        __hashCodeCalc = true;
        int _hashCode = 1;
        if (getOBJECT_ID() != null) {
            _hashCode += getOBJECT_ID().hashCode();
        }
        if (getZZEKORG() != null) {
            _hashCode += getZZEKORG().hashCode();
        }
        if (getZZEKGRP() != null) {
            _hashCode += getZZEKGRP().hashCode();
        }
        if (getZZVKORG() != null) {
            _hashCode += getZZVKORG().hashCode();
        }
        if (getZZVKGRP() != null) {
            _hashCode += getZZVKGRP().hashCode();
        }
        if (getZZVKBUR() != null) {
            _hashCode += getZZVKBUR().hashCode();
        }
        if (getZZMVGR1() != null) {
            _hashCode += getZZMVGR1().hashCode();
        }
        if (getCONTRACT_NO() != null) {
            _hashCode += getCONTRACT_NO().hashCode();
        }
        if (getZZBUSINES() != null) {
            _hashCode += getZZBUSINES().hashCode();
        }
        if (getZZUNITE() != null) {
            _hashCode += getZZUNITE().hashCode();
        }
        if (getZZSPSELL() != null) {
            _hashCode += getZZSPSELL().hashCode();
        }
        if (getZZOTCTIME() != null) {
            _hashCode += getZZOTCTIME().hashCode();
        }
        if (getZZFACTSTAFF() != null) {
            _hashCode += getZZFACTSTAFF().hashCode();
        }
        if (getZZSTAFFGP() != null) {
            _hashCode += getZZSTAFFGP().hashCode();
        }
        if (getZZSUPPLY_TYPE_NO() != null) {
            _hashCode += getZZSUPPLY_TYPE_NO().hashCode();
        }
        if (getZZMANCLASS() != null) {
            _hashCode += getZZMANCLASS().hashCode();
        }
        if (getZZCONCHANGE_DATE() != null) {
            _hashCode += getZZCONCHANGE_DATE().hashCode();
        }
        if (getZZCONCHANGE_RE() != null) {
            _hashCode += getZZCONCHANGE_RE().hashCode();
        }
        if (getZZDELIMETH() != null) {
            _hashCode += getZZDELIMETH().hashCode();
        }
        if (getZZDELIDES() != null) {
            _hashCode += getZZDELIDES().hashCode();
        }
        if (getZZTRANMETH() != null) {
            _hashCode += getZZTRANMETH().hashCode();
        }
        if (getZZCON_VPERSON() != null) {
            _hashCode += getZZCON_VPERSON().hashCode();
        }
        if (getZZCON_DEPART() != null) {
            _hashCode += getZZCON_DEPART().hashCode();
        }
        if (getZZCON_CPERSON() != null) {
            _hashCode += getZZCON_CPERSON().hashCode();
        }
        if (getZZAUDIT_DATE() != null) {
            _hashCode += getZZAUDIT_DATE().hashCode();
        }
        if (getZZAUDIT_PERSON() != null) {
            _hashCode += getZZAUDIT_PERSON().hashCode();
        }
        if (getZZENTRY_DATE() != null) {
            _hashCode += getZZENTRY_DATE().hashCode();
        }
        if (getZZENTRY_PERSON() != null) {
            _hashCode += getZZENTRY_PERSON().hashCode();
        }
        if (getZZOTHER() != null) {
            _hashCode += getZZOTHER().hashCode();
        }
        if (getZZSTOCKRATE() != null) {
            _hashCode += getZZSTOCKRATE().hashCode();
        }
        if (getZZPRO_AMOUNT() != null) {
            _hashCode += getZZPRO_AMOUNT().hashCode();
        }
        if (getZZDISCOUNT_COST() != null) {
            _hashCode += getZZDISCOUNT_COST().hashCode();
        }
        if (getZZTRAN_COST() != null) {
            _hashCode += getZZTRAN_COST().hashCode();
        }
        if (getZZQUAN_COST() != null) {
            _hashCode += getZZQUAN_COST().hashCode();
        }
        if (getZZDECO_COST() != null) {
            _hashCode += getZZDECO_COST().hashCode();
        }
        if (getZZSALES_COST() != null) {
            _hashCode += getZZSALES_COST().hashCode();
        }
        if (getZZPREPAY() != null) {
            _hashCode += getZZPREPAY().hashCode();
        }
        if (getZZTERM() != null) {
            _hashCode += getZZTERM().hashCode();
        }
        if (getZZREBATEMETH() != null) {
            _hashCode += getZZREBATEMETH().hashCode();
        }
        if (getZZBRAND_IDMAIN() != null) {
            _hashCode += getZZBRAND_IDMAIN().hashCode();
        }
        if (getZZDPTYPE() != null) {
            _hashCode += getZZDPTYPE().hashCode();
        }
        if (getZZMINSALE_TOTAL() != null) {
            _hashCode += getZZMINSALE_TOTAL().hashCode();
        }
        if (getZZTERMINATE() != null) {
            _hashCode += getZZTERMINATE().hashCode();
        }
        if (getZZACTDATE() != null) {
            _hashCode += getZZACTDATE().hashCode();
        }
        if (getZZRECH_UNAME() != null) {
            _hashCode += getZZRECH_UNAME().hashCode();
        }
        if (getZZVIP_FLG() != null) {
            _hashCode += getZZVIP_FLG().hashCode();
        }
        if (getZZSPSELLTP() != null) {
            _hashCode += getZZSPSELLTP().hashCode();
        }
        if (getZZCLCYCLE() != null) {
            _hashCode += getZZCLCYCLE().hashCode();
        }
        if (getZZMATTAX() != null) {
            _hashCode += getZZMATTAX().hashCode();
        }
        if (getZRET_FLG() != null) {
            _hashCode += getZRET_FLG().hashCode();
        }
        if (getZPRICE_SET() != null) {
            _hashCode += getZPRICE_SET().hashCode();
        }
        if (getZYWLX_JYG() != null) {
            _hashCode += getZYWLX_JYG().hashCode();
        }
        if (getZSET_NO() != null) {
            _hashCode += getZSET_NO().hashCode();
        }
        if (getZSET_MESS() != null) {
            _hashCode += getZSET_MESS().hashCode();
        }
        if (getZLSD_TYPE_NO() != null) {
            _hashCode += getZLSD_TYPE_NO().hashCode();
        }
        if (getZZJZF() != null) {
            _hashCode += getZZJZF().hashCode();
        }
        if (getZJFJZ() != null) {
            _hashCode += getZJFJZ().hashCode();
        }
        if (getZWYJF() != null) {
            _hashCode += getZWYJF().hashCode();
        }
        if (getZZJJS() != null) {
            _hashCode += getZZJJS().hashCode();
        }
        if (getZZNJT() != null) {
            _hashCode += getZZNJT().hashCode();
        }
        if (getZZNBL() != null) {
            _hashCode += getZZNBL().hashCode();
        }
        if (getZJZMJ() != null) {
            _hashCode += getZJZMJ().hashCode();
        }
        if (getZMZKS() != null) {
            _hashCode += getZMZKS().hashCode();
        }
        if (getZMZJS() != null) {
            _hashCode += getZMZJS().hashCode();
        }
        if (getZMYJZD() != null) {
            _hashCode += getZMYJZD().hashCode();
        }
        if (getZWBRQ() != null) {
            _hashCode += getZWBRQ().hashCode();
        }
        __hashCodeCalc = false;
        return _hashCode;
    }

    // Type metadata
    private static org.apache.axis.description.TypeDesc typeDesc =
        new org.apache.axis.description.TypeDesc(DT_ContractSearchSub_VICNCN.class, true);

    static {
        typeDesc.setXmlType(new javax.xml.namespace.QName("urn:ecc:rvs:contract", "DT_ContractSearchSub_VICNCN"));
        org.apache.axis.description.ElementDesc elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("OBJECT_ID");
        elemField.setXmlName(new javax.xml.namespace.QName("", "OBJECT_ID"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("ZZEKORG");
        elemField.setXmlName(new javax.xml.namespace.QName("", "ZZEKORG"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("ZZEKGRP");
        elemField.setXmlName(new javax.xml.namespace.QName("", "ZZEKGRP"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("ZZVKORG");
        elemField.setXmlName(new javax.xml.namespace.QName("", "ZZVKORG"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("ZZVKGRP");
        elemField.setXmlName(new javax.xml.namespace.QName("", "ZZVKGRP"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("ZZVKBUR");
        elemField.setXmlName(new javax.xml.namespace.QName("", "ZZVKBUR"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("ZZMVGR1");
        elemField.setXmlName(new javax.xml.namespace.QName("", "ZZMVGR1"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("CONTRACT_NO");
        elemField.setXmlName(new javax.xml.namespace.QName("", "CONTRACT_NO"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("ZZBUSINES");
        elemField.setXmlName(new javax.xml.namespace.QName("", "ZZBUSINES"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("ZZUNITE");
        elemField.setXmlName(new javax.xml.namespace.QName("", "ZZUNITE"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("ZZSPSELL");
        elemField.setXmlName(new javax.xml.namespace.QName("", "ZZSPSELL"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("ZZOTCTIME");
        elemField.setXmlName(new javax.xml.namespace.QName("", "ZZOTCTIME"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("ZZFACTSTAFF");
        elemField.setXmlName(new javax.xml.namespace.QName("", "ZZFACTSTAFF"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("ZZSTAFFGP");
        elemField.setXmlName(new javax.xml.namespace.QName("", "ZZSTAFFGP"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("ZZSUPPLY_TYPE_NO");
        elemField.setXmlName(new javax.xml.namespace.QName("", "ZZSUPPLY_TYPE_NO"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("ZZMANCLASS");
        elemField.setXmlName(new javax.xml.namespace.QName("", "ZZMANCLASS"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("ZZCONCHANGE_DATE");
        elemField.setXmlName(new javax.xml.namespace.QName("", "ZZCONCHANGE_DATE"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("ZZCONCHANGE_RE");
        elemField.setXmlName(new javax.xml.namespace.QName("", "ZZCONCHANGE_RE"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("ZZDELIMETH");
        elemField.setXmlName(new javax.xml.namespace.QName("", "ZZDELIMETH"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("ZZDELIDES");
        elemField.setXmlName(new javax.xml.namespace.QName("", "ZZDELIDES"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("ZZTRANMETH");
        elemField.setXmlName(new javax.xml.namespace.QName("", "ZZTRANMETH"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("ZZCON_VPERSON");
        elemField.setXmlName(new javax.xml.namespace.QName("", "ZZCON_VPERSON"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("ZZCON_DEPART");
        elemField.setXmlName(new javax.xml.namespace.QName("", "ZZCON_DEPART"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("ZZCON_CPERSON");
        elemField.setXmlName(new javax.xml.namespace.QName("", "ZZCON_CPERSON"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("ZZAUDIT_DATE");
        elemField.setXmlName(new javax.xml.namespace.QName("", "ZZAUDIT_DATE"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("ZZAUDIT_PERSON");
        elemField.setXmlName(new javax.xml.namespace.QName("", "ZZAUDIT_PERSON"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("ZZENTRY_DATE");
        elemField.setXmlName(new javax.xml.namespace.QName("", "ZZENTRY_DATE"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("ZZENTRY_PERSON");
        elemField.setXmlName(new javax.xml.namespace.QName("", "ZZENTRY_PERSON"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("ZZOTHER");
        elemField.setXmlName(new javax.xml.namespace.QName("", "ZZOTHER"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("ZZSTOCKRATE");
        elemField.setXmlName(new javax.xml.namespace.QName("", "ZZSTOCKRATE"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("ZZPRO_AMOUNT");
        elemField.setXmlName(new javax.xml.namespace.QName("", "ZZPRO_AMOUNT"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("ZZDISCOUNT_COST");
        elemField.setXmlName(new javax.xml.namespace.QName("", "ZZDISCOUNT_COST"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("ZZTRAN_COST");
        elemField.setXmlName(new javax.xml.namespace.QName("", "ZZTRAN_COST"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("ZZQUAN_COST");
        elemField.setXmlName(new javax.xml.namespace.QName("", "ZZQUAN_COST"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("ZZDECO_COST");
        elemField.setXmlName(new javax.xml.namespace.QName("", "ZZDECO_COST"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("ZZSALES_COST");
        elemField.setXmlName(new javax.xml.namespace.QName("", "ZZSALES_COST"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("ZZPREPAY");
        elemField.setXmlName(new javax.xml.namespace.QName("", "ZZPREPAY"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("ZZTERM");
        elemField.setXmlName(new javax.xml.namespace.QName("", "ZZTERM"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("ZZREBATEMETH");
        elemField.setXmlName(new javax.xml.namespace.QName("", "ZZREBATEMETH"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("ZZBRAND_IDMAIN");
        elemField.setXmlName(new javax.xml.namespace.QName("", "ZZBRAND_IDMAIN"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("ZZDPTYPE");
        elemField.setXmlName(new javax.xml.namespace.QName("", "ZZDPTYPE"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("ZZMINSALE_TOTAL");
        elemField.setXmlName(new javax.xml.namespace.QName("", "ZZMINSALE_TOTAL"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("ZZTERMINATE");
        elemField.setXmlName(new javax.xml.namespace.QName("", "ZZTERMINATE"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("ZZACTDATE");
        elemField.setXmlName(new javax.xml.namespace.QName("", "ZZACTDATE"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("ZZRECH_UNAME");
        elemField.setXmlName(new javax.xml.namespace.QName("", "ZZRECH_UNAME"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("ZZVIP_FLG");
        elemField.setXmlName(new javax.xml.namespace.QName("", "ZZVIP_FLG"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("ZZSPSELLTP");
        elemField.setXmlName(new javax.xml.namespace.QName("", "ZZSPSELLTP"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("ZZCLCYCLE");
        elemField.setXmlName(new javax.xml.namespace.QName("", "ZZCLCYCLE"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("ZZMATTAX");
        elemField.setXmlName(new javax.xml.namespace.QName("", "ZZMATTAX"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("ZRET_FLG");
        elemField.setXmlName(new javax.xml.namespace.QName("", "ZRET_FLG"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("ZPRICE_SET");
        elemField.setXmlName(new javax.xml.namespace.QName("", "ZPRICE_SET"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("ZYWLX_JYG");
        elemField.setXmlName(new javax.xml.namespace.QName("", "ZYWLX_JYG"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("ZSET_NO");
        elemField.setXmlName(new javax.xml.namespace.QName("", "ZSET_NO"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("ZSET_MESS");
        elemField.setXmlName(new javax.xml.namespace.QName("", "ZSET_MESS"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("ZLSD_TYPE_NO");
        elemField.setXmlName(new javax.xml.namespace.QName("", "ZLSD_TYPE_NO"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("ZZJZF");
        elemField.setXmlName(new javax.xml.namespace.QName("", "ZZJZF"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("ZJFJZ");
        elemField.setXmlName(new javax.xml.namespace.QName("", "ZJFJZ"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("ZWYJF");
        elemField.setXmlName(new javax.xml.namespace.QName("", "ZWYJF"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("ZZJJS");
        elemField.setXmlName(new javax.xml.namespace.QName("", "ZZJJS"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("ZZNJT");
        elemField.setXmlName(new javax.xml.namespace.QName("", "ZZNJT"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("ZZNBL");
        elemField.setXmlName(new javax.xml.namespace.QName("", "ZZNBL"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("ZJZMJ");
        elemField.setXmlName(new javax.xml.namespace.QName("", "ZJZMJ"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("ZMZKS");
        elemField.setXmlName(new javax.xml.namespace.QName("", "ZMZKS"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("ZMZJS");
        elemField.setXmlName(new javax.xml.namespace.QName("", "ZMZJS"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("ZMYJZD");
        elemField.setXmlName(new javax.xml.namespace.QName("", "ZMYJZD"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("ZWBRQ");
        elemField.setXmlName(new javax.xml.namespace.QName("", "ZWBRQ"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
    }

    /**
     * Return type metadata object
     */
    public static org.apache.axis.description.TypeDesc getTypeDesc() {
        return typeDesc;
    }

    /**
     * Get Custom Serializer
     */
    public static org.apache.axis.encoding.Serializer getSerializer(
           java.lang.String mechType, 
           java.lang.Class _javaType,  
           javax.xml.namespace.QName _xmlType) {
        return 
          new  org.apache.axis.encoding.ser.BeanSerializer(
            _javaType, _xmlType, typeDesc);
    }

    /**
     * Get Custom Deserializer
     */
    public static org.apache.axis.encoding.Deserializer getDeserializer(
           java.lang.String mechType, 
           java.lang.Class _javaType,  
           javax.xml.namespace.QName _xmlType) {
        return 
          new  org.apache.axis.encoding.ser.BeanDeserializer(
            _javaType, _xmlType, typeDesc);
    }

}
