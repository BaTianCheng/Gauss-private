/**
 * DT_ContractSearchSub_CONTRACT.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package com.esb.jinying.sap.contract.rvs.ecc;

public class DT_ContractSearchSub_CONTRACT  implements java.io.Serializable {
    /* 公司代码 */
    private java.lang.String COMP_CODE;

    /* 合同编号 */
    private java.lang.String CONTRACT_NUMBER;

    /* 合同类型 */
    private java.lang.String CONTRACT_TYPE;

    /* 对象类型的标识部分,例如"IS"(不动产合同) */
    private java.lang.String IDENT_OBJECT_TYPE;

    /* 标识部分代码,例如"1000/123" */
    private java.lang.String IDENT_KEY;

    /* 输入者 */
    private java.lang.String CREATION_USER;

    /* 首次输入的日期 */
    private java.lang.String CREATION_DATE;

    /* 初始输入的时间 */
    private java.lang.String CREATION_TIME;

    /* 雇员ID */
    private java.lang.String LASTCHANGE_USER;

    /* 最后编辑时间 */
    private java.lang.String LASTCHANGE_DATE;

    /* 最后编辑的时间 */
    private java.lang.String LASTCHANGE_TIME;

    /* 合同名 */
    private java.lang.String CONTRACT_TEXT;

    /* 合同订立日期 */
    private java.lang.String CONTRACT_CONCLUSION_DATE;

    /* 第二签名的日期 */
    private java.lang.String SECOND_SIGNATURE_DATE;

    /* 合同开始日期 */
    private java.lang.String CONTRACT_START_DATE;

    /* 过时: 首次过帐的日期 */
    private java.lang.String FIRST_POSTING_DATE;

    /* 第一个合同结束日期 */
    private java.lang.String FIRST_END_DATE;

    /* 权限组 */
    private java.lang.String AUTHORIZATION_GROUP;

    /* 租赁法 */
    private java.lang.String TENANCY_LAW;

    /* 旧合同编号 */
    private java.lang.String OLD_CONTRACT_NUMBER;

    /* 主要合同的公司代码 */
    private java.lang.String MAIN_CONTRACT_COMP_CODE;

    /* 不动产主合同的号 */
    private java.lang.String MAIN_CONTRACT_NUMBER;

    /* 行业 */
    private java.lang.String INDUSTRYSECTOR;

    /* 保证金类型 */
    private java.lang.String DEPOSIT_TYPE;

    /* 与销售相关 */
    private java.lang.String IS_SALES_RELATED;

    /* 负责人 */
    private java.lang.String RESPONSIBLE;

    /* 期限结束日期 */
    private java.lang.String TERM_END_DATE;

    /* 合同通知依据 */
    private java.lang.String NOTICE_DATE;

    /* 通知收到的日期 */
    private java.lang.String NOTICE_RECEIPT_DATE;

    /* 通知原因 */
    private java.lang.String NOTICE_REASON;

    /* 通知: 激活日期 */
    private java.lang.String NOTICE_ACTIVATION_DATE;

    /* 状态参数文件 */
    private java.lang.String STAT_PROF;

    /* 锁定现金流的终止日期 */
    private java.lang.String CASH_FLOW_LOCKED_TO_DATE;

    /* 现金流生成的起始日期 */
    private java.lang.String CASH_FLOW_START_DATE;

    /* 首次过帐从 */
    private java.lang.String POSTING_START_DATE;

    /* 所有权转让:开始日期 */
    private java.lang.String TRANS_POSSESSION_FROM;

    /* 所有权转让:终止日期 */
    private java.lang.String TRANS_POSSESSION_TO;

    public DT_ContractSearchSub_CONTRACT() {
    }

    public DT_ContractSearchSub_CONTRACT(
           java.lang.String COMP_CODE,
           java.lang.String CONTRACT_NUMBER,
           java.lang.String CONTRACT_TYPE,
           java.lang.String IDENT_OBJECT_TYPE,
           java.lang.String IDENT_KEY,
           java.lang.String CREATION_USER,
           java.lang.String CREATION_DATE,
           java.lang.String CREATION_TIME,
           java.lang.String LASTCHANGE_USER,
           java.lang.String LASTCHANGE_DATE,
           java.lang.String LASTCHANGE_TIME,
           java.lang.String CONTRACT_TEXT,
           java.lang.String CONTRACT_CONCLUSION_DATE,
           java.lang.String SECOND_SIGNATURE_DATE,
           java.lang.String CONTRACT_START_DATE,
           java.lang.String FIRST_POSTING_DATE,
           java.lang.String FIRST_END_DATE,
           java.lang.String AUTHORIZATION_GROUP,
           java.lang.String TENANCY_LAW,
           java.lang.String OLD_CONTRACT_NUMBER,
           java.lang.String MAIN_CONTRACT_COMP_CODE,
           java.lang.String MAIN_CONTRACT_NUMBER,
           java.lang.String INDUSTRYSECTOR,
           java.lang.String DEPOSIT_TYPE,
           java.lang.String IS_SALES_RELATED,
           java.lang.String RESPONSIBLE,
           java.lang.String TERM_END_DATE,
           java.lang.String NOTICE_DATE,
           java.lang.String NOTICE_RECEIPT_DATE,
           java.lang.String NOTICE_REASON,
           java.lang.String NOTICE_ACTIVATION_DATE,
           java.lang.String STAT_PROF,
           java.lang.String CASH_FLOW_LOCKED_TO_DATE,
           java.lang.String CASH_FLOW_START_DATE,
           java.lang.String POSTING_START_DATE,
           java.lang.String TRANS_POSSESSION_FROM,
           java.lang.String TRANS_POSSESSION_TO) {
           this.COMP_CODE = COMP_CODE;
           this.CONTRACT_NUMBER = CONTRACT_NUMBER;
           this.CONTRACT_TYPE = CONTRACT_TYPE;
           this.IDENT_OBJECT_TYPE = IDENT_OBJECT_TYPE;
           this.IDENT_KEY = IDENT_KEY;
           this.CREATION_USER = CREATION_USER;
           this.CREATION_DATE = CREATION_DATE;
           this.CREATION_TIME = CREATION_TIME;
           this.LASTCHANGE_USER = LASTCHANGE_USER;
           this.LASTCHANGE_DATE = LASTCHANGE_DATE;
           this.LASTCHANGE_TIME = LASTCHANGE_TIME;
           this.CONTRACT_TEXT = CONTRACT_TEXT;
           this.CONTRACT_CONCLUSION_DATE = CONTRACT_CONCLUSION_DATE;
           this.SECOND_SIGNATURE_DATE = SECOND_SIGNATURE_DATE;
           this.CONTRACT_START_DATE = CONTRACT_START_DATE;
           this.FIRST_POSTING_DATE = FIRST_POSTING_DATE;
           this.FIRST_END_DATE = FIRST_END_DATE;
           this.AUTHORIZATION_GROUP = AUTHORIZATION_GROUP;
           this.TENANCY_LAW = TENANCY_LAW;
           this.OLD_CONTRACT_NUMBER = OLD_CONTRACT_NUMBER;
           this.MAIN_CONTRACT_COMP_CODE = MAIN_CONTRACT_COMP_CODE;
           this.MAIN_CONTRACT_NUMBER = MAIN_CONTRACT_NUMBER;
           this.INDUSTRYSECTOR = INDUSTRYSECTOR;
           this.DEPOSIT_TYPE = DEPOSIT_TYPE;
           this.IS_SALES_RELATED = IS_SALES_RELATED;
           this.RESPONSIBLE = RESPONSIBLE;
           this.TERM_END_DATE = TERM_END_DATE;
           this.NOTICE_DATE = NOTICE_DATE;
           this.NOTICE_RECEIPT_DATE = NOTICE_RECEIPT_DATE;
           this.NOTICE_REASON = NOTICE_REASON;
           this.NOTICE_ACTIVATION_DATE = NOTICE_ACTIVATION_DATE;
           this.STAT_PROF = STAT_PROF;
           this.CASH_FLOW_LOCKED_TO_DATE = CASH_FLOW_LOCKED_TO_DATE;
           this.CASH_FLOW_START_DATE = CASH_FLOW_START_DATE;
           this.POSTING_START_DATE = POSTING_START_DATE;
           this.TRANS_POSSESSION_FROM = TRANS_POSSESSION_FROM;
           this.TRANS_POSSESSION_TO = TRANS_POSSESSION_TO;
    }


    /**
     * Gets the COMP_CODE value for this DT_ContractSearchSub_CONTRACT.
     * 
     * @return COMP_CODE   * 公司代码
     */
    public java.lang.String getCOMP_CODE() {
        return COMP_CODE;
    }


    /**
     * Sets the COMP_CODE value for this DT_ContractSearchSub_CONTRACT.
     * 
     * @param COMP_CODE   * 公司代码
     */
    public void setCOMP_CODE(java.lang.String COMP_CODE) {
        this.COMP_CODE = COMP_CODE;
    }


    /**
     * Gets the CONTRACT_NUMBER value for this DT_ContractSearchSub_CONTRACT.
     * 
     * @return CONTRACT_NUMBER   * 合同编号
     */
    public java.lang.String getCONTRACT_NUMBER() {
        return CONTRACT_NUMBER;
    }


    /**
     * Sets the CONTRACT_NUMBER value for this DT_ContractSearchSub_CONTRACT.
     * 
     * @param CONTRACT_NUMBER   * 合同编号
     */
    public void setCONTRACT_NUMBER(java.lang.String CONTRACT_NUMBER) {
        this.CONTRACT_NUMBER = CONTRACT_NUMBER;
    }


    /**
     * Gets the CONTRACT_TYPE value for this DT_ContractSearchSub_CONTRACT.
     * 
     * @return CONTRACT_TYPE   * 合同类型
     */
    public java.lang.String getCONTRACT_TYPE() {
        return CONTRACT_TYPE;
    }


    /**
     * Sets the CONTRACT_TYPE value for this DT_ContractSearchSub_CONTRACT.
     * 
     * @param CONTRACT_TYPE   * 合同类型
     */
    public void setCONTRACT_TYPE(java.lang.String CONTRACT_TYPE) {
        this.CONTRACT_TYPE = CONTRACT_TYPE;
    }


    /**
     * Gets the IDENT_OBJECT_TYPE value for this DT_ContractSearchSub_CONTRACT.
     * 
     * @return IDENT_OBJECT_TYPE   * 对象类型的标识部分,例如"IS"(不动产合同)
     */
    public java.lang.String getIDENT_OBJECT_TYPE() {
        return IDENT_OBJECT_TYPE;
    }


    /**
     * Sets the IDENT_OBJECT_TYPE value for this DT_ContractSearchSub_CONTRACT.
     * 
     * @param IDENT_OBJECT_TYPE   * 对象类型的标识部分,例如"IS"(不动产合同)
     */
    public void setIDENT_OBJECT_TYPE(java.lang.String IDENT_OBJECT_TYPE) {
        this.IDENT_OBJECT_TYPE = IDENT_OBJECT_TYPE;
    }


    /**
     * Gets the IDENT_KEY value for this DT_ContractSearchSub_CONTRACT.
     * 
     * @return IDENT_KEY   * 标识部分代码,例如"1000/123"
     */
    public java.lang.String getIDENT_KEY() {
        return IDENT_KEY;
    }


    /**
     * Sets the IDENT_KEY value for this DT_ContractSearchSub_CONTRACT.
     * 
     * @param IDENT_KEY   * 标识部分代码,例如"1000/123"
     */
    public void setIDENT_KEY(java.lang.String IDENT_KEY) {
        this.IDENT_KEY = IDENT_KEY;
    }


    /**
     * Gets the CREATION_USER value for this DT_ContractSearchSub_CONTRACT.
     * 
     * @return CREATION_USER   * 输入者
     */
    public java.lang.String getCREATION_USER() {
        return CREATION_USER;
    }


    /**
     * Sets the CREATION_USER value for this DT_ContractSearchSub_CONTRACT.
     * 
     * @param CREATION_USER   * 输入者
     */
    public void setCREATION_USER(java.lang.String CREATION_USER) {
        this.CREATION_USER = CREATION_USER;
    }


    /**
     * Gets the CREATION_DATE value for this DT_ContractSearchSub_CONTRACT.
     * 
     * @return CREATION_DATE   * 首次输入的日期
     */
    public java.lang.String getCREATION_DATE() {
        return CREATION_DATE;
    }


    /**
     * Sets the CREATION_DATE value for this DT_ContractSearchSub_CONTRACT.
     * 
     * @param CREATION_DATE   * 首次输入的日期
     */
    public void setCREATION_DATE(java.lang.String CREATION_DATE) {
        this.CREATION_DATE = CREATION_DATE;
    }


    /**
     * Gets the CREATION_TIME value for this DT_ContractSearchSub_CONTRACT.
     * 
     * @return CREATION_TIME   * 初始输入的时间
     */
    public java.lang.String getCREATION_TIME() {
        return CREATION_TIME;
    }


    /**
     * Sets the CREATION_TIME value for this DT_ContractSearchSub_CONTRACT.
     * 
     * @param CREATION_TIME   * 初始输入的时间
     */
    public void setCREATION_TIME(java.lang.String CREATION_TIME) {
        this.CREATION_TIME = CREATION_TIME;
    }


    /**
     * Gets the LASTCHANGE_USER value for this DT_ContractSearchSub_CONTRACT.
     * 
     * @return LASTCHANGE_USER   * 雇员ID
     */
    public java.lang.String getLASTCHANGE_USER() {
        return LASTCHANGE_USER;
    }


    /**
     * Sets the LASTCHANGE_USER value for this DT_ContractSearchSub_CONTRACT.
     * 
     * @param LASTCHANGE_USER   * 雇员ID
     */
    public void setLASTCHANGE_USER(java.lang.String LASTCHANGE_USER) {
        this.LASTCHANGE_USER = LASTCHANGE_USER;
    }


    /**
     * Gets the LASTCHANGE_DATE value for this DT_ContractSearchSub_CONTRACT.
     * 
     * @return LASTCHANGE_DATE   * 最后编辑时间
     */
    public java.lang.String getLASTCHANGE_DATE() {
        return LASTCHANGE_DATE;
    }


    /**
     * Sets the LASTCHANGE_DATE value for this DT_ContractSearchSub_CONTRACT.
     * 
     * @param LASTCHANGE_DATE   * 最后编辑时间
     */
    public void setLASTCHANGE_DATE(java.lang.String LASTCHANGE_DATE) {
        this.LASTCHANGE_DATE = LASTCHANGE_DATE;
    }


    /**
     * Gets the LASTCHANGE_TIME value for this DT_ContractSearchSub_CONTRACT.
     * 
     * @return LASTCHANGE_TIME   * 最后编辑的时间
     */
    public java.lang.String getLASTCHANGE_TIME() {
        return LASTCHANGE_TIME;
    }


    /**
     * Sets the LASTCHANGE_TIME value for this DT_ContractSearchSub_CONTRACT.
     * 
     * @param LASTCHANGE_TIME   * 最后编辑的时间
     */
    public void setLASTCHANGE_TIME(java.lang.String LASTCHANGE_TIME) {
        this.LASTCHANGE_TIME = LASTCHANGE_TIME;
    }


    /**
     * Gets the CONTRACT_TEXT value for this DT_ContractSearchSub_CONTRACT.
     * 
     * @return CONTRACT_TEXT   * 合同名
     */
    public java.lang.String getCONTRACT_TEXT() {
        return CONTRACT_TEXT;
    }


    /**
     * Sets the CONTRACT_TEXT value for this DT_ContractSearchSub_CONTRACT.
     * 
     * @param CONTRACT_TEXT   * 合同名
     */
    public void setCONTRACT_TEXT(java.lang.String CONTRACT_TEXT) {
        this.CONTRACT_TEXT = CONTRACT_TEXT;
    }


    /**
     * Gets the CONTRACT_CONCLUSION_DATE value for this DT_ContractSearchSub_CONTRACT.
     * 
     * @return CONTRACT_CONCLUSION_DATE   * 合同订立日期
     */
    public java.lang.String getCONTRACT_CONCLUSION_DATE() {
        return CONTRACT_CONCLUSION_DATE;
    }


    /**
     * Sets the CONTRACT_CONCLUSION_DATE value for this DT_ContractSearchSub_CONTRACT.
     * 
     * @param CONTRACT_CONCLUSION_DATE   * 合同订立日期
     */
    public void setCONTRACT_CONCLUSION_DATE(java.lang.String CONTRACT_CONCLUSION_DATE) {
        this.CONTRACT_CONCLUSION_DATE = CONTRACT_CONCLUSION_DATE;
    }


    /**
     * Gets the SECOND_SIGNATURE_DATE value for this DT_ContractSearchSub_CONTRACT.
     * 
     * @return SECOND_SIGNATURE_DATE   * 第二签名的日期
     */
    public java.lang.String getSECOND_SIGNATURE_DATE() {
        return SECOND_SIGNATURE_DATE;
    }


    /**
     * Sets the SECOND_SIGNATURE_DATE value for this DT_ContractSearchSub_CONTRACT.
     * 
     * @param SECOND_SIGNATURE_DATE   * 第二签名的日期
     */
    public void setSECOND_SIGNATURE_DATE(java.lang.String SECOND_SIGNATURE_DATE) {
        this.SECOND_SIGNATURE_DATE = SECOND_SIGNATURE_DATE;
    }


    /**
     * Gets the CONTRACT_START_DATE value for this DT_ContractSearchSub_CONTRACT.
     * 
     * @return CONTRACT_START_DATE   * 合同开始日期
     */
    public java.lang.String getCONTRACT_START_DATE() {
        return CONTRACT_START_DATE;
    }


    /**
     * Sets the CONTRACT_START_DATE value for this DT_ContractSearchSub_CONTRACT.
     * 
     * @param CONTRACT_START_DATE   * 合同开始日期
     */
    public void setCONTRACT_START_DATE(java.lang.String CONTRACT_START_DATE) {
        this.CONTRACT_START_DATE = CONTRACT_START_DATE;
    }


    /**
     * Gets the FIRST_POSTING_DATE value for this DT_ContractSearchSub_CONTRACT.
     * 
     * @return FIRST_POSTING_DATE   * 过时: 首次过帐的日期
     */
    public java.lang.String getFIRST_POSTING_DATE() {
        return FIRST_POSTING_DATE;
    }


    /**
     * Sets the FIRST_POSTING_DATE value for this DT_ContractSearchSub_CONTRACT.
     * 
     * @param FIRST_POSTING_DATE   * 过时: 首次过帐的日期
     */
    public void setFIRST_POSTING_DATE(java.lang.String FIRST_POSTING_DATE) {
        this.FIRST_POSTING_DATE = FIRST_POSTING_DATE;
    }


    /**
     * Gets the FIRST_END_DATE value for this DT_ContractSearchSub_CONTRACT.
     * 
     * @return FIRST_END_DATE   * 第一个合同结束日期
     */
    public java.lang.String getFIRST_END_DATE() {
        return FIRST_END_DATE;
    }


    /**
     * Sets the FIRST_END_DATE value for this DT_ContractSearchSub_CONTRACT.
     * 
     * @param FIRST_END_DATE   * 第一个合同结束日期
     */
    public void setFIRST_END_DATE(java.lang.String FIRST_END_DATE) {
        this.FIRST_END_DATE = FIRST_END_DATE;
    }


    /**
     * Gets the AUTHORIZATION_GROUP value for this DT_ContractSearchSub_CONTRACT.
     * 
     * @return AUTHORIZATION_GROUP   * 权限组
     */
    public java.lang.String getAUTHORIZATION_GROUP() {
        return AUTHORIZATION_GROUP;
    }


    /**
     * Sets the AUTHORIZATION_GROUP value for this DT_ContractSearchSub_CONTRACT.
     * 
     * @param AUTHORIZATION_GROUP   * 权限组
     */
    public void setAUTHORIZATION_GROUP(java.lang.String AUTHORIZATION_GROUP) {
        this.AUTHORIZATION_GROUP = AUTHORIZATION_GROUP;
    }


    /**
     * Gets the TENANCY_LAW value for this DT_ContractSearchSub_CONTRACT.
     * 
     * @return TENANCY_LAW   * 租赁法
     */
    public java.lang.String getTENANCY_LAW() {
        return TENANCY_LAW;
    }


    /**
     * Sets the TENANCY_LAW value for this DT_ContractSearchSub_CONTRACT.
     * 
     * @param TENANCY_LAW   * 租赁法
     */
    public void setTENANCY_LAW(java.lang.String TENANCY_LAW) {
        this.TENANCY_LAW = TENANCY_LAW;
    }


    /**
     * Gets the OLD_CONTRACT_NUMBER value for this DT_ContractSearchSub_CONTRACT.
     * 
     * @return OLD_CONTRACT_NUMBER   * 旧合同编号
     */
    public java.lang.String getOLD_CONTRACT_NUMBER() {
        return OLD_CONTRACT_NUMBER;
    }


    /**
     * Sets the OLD_CONTRACT_NUMBER value for this DT_ContractSearchSub_CONTRACT.
     * 
     * @param OLD_CONTRACT_NUMBER   * 旧合同编号
     */
    public void setOLD_CONTRACT_NUMBER(java.lang.String OLD_CONTRACT_NUMBER) {
        this.OLD_CONTRACT_NUMBER = OLD_CONTRACT_NUMBER;
    }


    /**
     * Gets the MAIN_CONTRACT_COMP_CODE value for this DT_ContractSearchSub_CONTRACT.
     * 
     * @return MAIN_CONTRACT_COMP_CODE   * 主要合同的公司代码
     */
    public java.lang.String getMAIN_CONTRACT_COMP_CODE() {
        return MAIN_CONTRACT_COMP_CODE;
    }


    /**
     * Sets the MAIN_CONTRACT_COMP_CODE value for this DT_ContractSearchSub_CONTRACT.
     * 
     * @param MAIN_CONTRACT_COMP_CODE   * 主要合同的公司代码
     */
    public void setMAIN_CONTRACT_COMP_CODE(java.lang.String MAIN_CONTRACT_COMP_CODE) {
        this.MAIN_CONTRACT_COMP_CODE = MAIN_CONTRACT_COMP_CODE;
    }


    /**
     * Gets the MAIN_CONTRACT_NUMBER value for this DT_ContractSearchSub_CONTRACT.
     * 
     * @return MAIN_CONTRACT_NUMBER   * 不动产主合同的号
     */
    public java.lang.String getMAIN_CONTRACT_NUMBER() {
        return MAIN_CONTRACT_NUMBER;
    }


    /**
     * Sets the MAIN_CONTRACT_NUMBER value for this DT_ContractSearchSub_CONTRACT.
     * 
     * @param MAIN_CONTRACT_NUMBER   * 不动产主合同的号
     */
    public void setMAIN_CONTRACT_NUMBER(java.lang.String MAIN_CONTRACT_NUMBER) {
        this.MAIN_CONTRACT_NUMBER = MAIN_CONTRACT_NUMBER;
    }


    /**
     * Gets the INDUSTRYSECTOR value for this DT_ContractSearchSub_CONTRACT.
     * 
     * @return INDUSTRYSECTOR   * 行业
     */
    public java.lang.String getINDUSTRYSECTOR() {
        return INDUSTRYSECTOR;
    }


    /**
     * Sets the INDUSTRYSECTOR value for this DT_ContractSearchSub_CONTRACT.
     * 
     * @param INDUSTRYSECTOR   * 行业
     */
    public void setINDUSTRYSECTOR(java.lang.String INDUSTRYSECTOR) {
        this.INDUSTRYSECTOR = INDUSTRYSECTOR;
    }


    /**
     * Gets the DEPOSIT_TYPE value for this DT_ContractSearchSub_CONTRACT.
     * 
     * @return DEPOSIT_TYPE   * 保证金类型
     */
    public java.lang.String getDEPOSIT_TYPE() {
        return DEPOSIT_TYPE;
    }


    /**
     * Sets the DEPOSIT_TYPE value for this DT_ContractSearchSub_CONTRACT.
     * 
     * @param DEPOSIT_TYPE   * 保证金类型
     */
    public void setDEPOSIT_TYPE(java.lang.String DEPOSIT_TYPE) {
        this.DEPOSIT_TYPE = DEPOSIT_TYPE;
    }


    /**
     * Gets the IS_SALES_RELATED value for this DT_ContractSearchSub_CONTRACT.
     * 
     * @return IS_SALES_RELATED   * 与销售相关
     */
    public java.lang.String getIS_SALES_RELATED() {
        return IS_SALES_RELATED;
    }


    /**
     * Sets the IS_SALES_RELATED value for this DT_ContractSearchSub_CONTRACT.
     * 
     * @param IS_SALES_RELATED   * 与销售相关
     */
    public void setIS_SALES_RELATED(java.lang.String IS_SALES_RELATED) {
        this.IS_SALES_RELATED = IS_SALES_RELATED;
    }


    /**
     * Gets the RESPONSIBLE value for this DT_ContractSearchSub_CONTRACT.
     * 
     * @return RESPONSIBLE   * 负责人
     */
    public java.lang.String getRESPONSIBLE() {
        return RESPONSIBLE;
    }


    /**
     * Sets the RESPONSIBLE value for this DT_ContractSearchSub_CONTRACT.
     * 
     * @param RESPONSIBLE   * 负责人
     */
    public void setRESPONSIBLE(java.lang.String RESPONSIBLE) {
        this.RESPONSIBLE = RESPONSIBLE;
    }


    /**
     * Gets the TERM_END_DATE value for this DT_ContractSearchSub_CONTRACT.
     * 
     * @return TERM_END_DATE   * 期限结束日期
     */
    public java.lang.String getTERM_END_DATE() {
        return TERM_END_DATE;
    }


    /**
     * Sets the TERM_END_DATE value for this DT_ContractSearchSub_CONTRACT.
     * 
     * @param TERM_END_DATE   * 期限结束日期
     */
    public void setTERM_END_DATE(java.lang.String TERM_END_DATE) {
        this.TERM_END_DATE = TERM_END_DATE;
    }


    /**
     * Gets the NOTICE_DATE value for this DT_ContractSearchSub_CONTRACT.
     * 
     * @return NOTICE_DATE   * 合同通知依据
     */
    public java.lang.String getNOTICE_DATE() {
        return NOTICE_DATE;
    }


    /**
     * Sets the NOTICE_DATE value for this DT_ContractSearchSub_CONTRACT.
     * 
     * @param NOTICE_DATE   * 合同通知依据
     */
    public void setNOTICE_DATE(java.lang.String NOTICE_DATE) {
        this.NOTICE_DATE = NOTICE_DATE;
    }


    /**
     * Gets the NOTICE_RECEIPT_DATE value for this DT_ContractSearchSub_CONTRACT.
     * 
     * @return NOTICE_RECEIPT_DATE   * 通知收到的日期
     */
    public java.lang.String getNOTICE_RECEIPT_DATE() {
        return NOTICE_RECEIPT_DATE;
    }


    /**
     * Sets the NOTICE_RECEIPT_DATE value for this DT_ContractSearchSub_CONTRACT.
     * 
     * @param NOTICE_RECEIPT_DATE   * 通知收到的日期
     */
    public void setNOTICE_RECEIPT_DATE(java.lang.String NOTICE_RECEIPT_DATE) {
        this.NOTICE_RECEIPT_DATE = NOTICE_RECEIPT_DATE;
    }


    /**
     * Gets the NOTICE_REASON value for this DT_ContractSearchSub_CONTRACT.
     * 
     * @return NOTICE_REASON   * 通知原因
     */
    public java.lang.String getNOTICE_REASON() {
        return NOTICE_REASON;
    }


    /**
     * Sets the NOTICE_REASON value for this DT_ContractSearchSub_CONTRACT.
     * 
     * @param NOTICE_REASON   * 通知原因
     */
    public void setNOTICE_REASON(java.lang.String NOTICE_REASON) {
        this.NOTICE_REASON = NOTICE_REASON;
    }


    /**
     * Gets the NOTICE_ACTIVATION_DATE value for this DT_ContractSearchSub_CONTRACT.
     * 
     * @return NOTICE_ACTIVATION_DATE   * 通知: 激活日期
     */
    public java.lang.String getNOTICE_ACTIVATION_DATE() {
        return NOTICE_ACTIVATION_DATE;
    }


    /**
     * Sets the NOTICE_ACTIVATION_DATE value for this DT_ContractSearchSub_CONTRACT.
     * 
     * @param NOTICE_ACTIVATION_DATE   * 通知: 激活日期
     */
    public void setNOTICE_ACTIVATION_DATE(java.lang.String NOTICE_ACTIVATION_DATE) {
        this.NOTICE_ACTIVATION_DATE = NOTICE_ACTIVATION_DATE;
    }


    /**
     * Gets the STAT_PROF value for this DT_ContractSearchSub_CONTRACT.
     * 
     * @return STAT_PROF   * 状态参数文件
     */
    public java.lang.String getSTAT_PROF() {
        return STAT_PROF;
    }


    /**
     * Sets the STAT_PROF value for this DT_ContractSearchSub_CONTRACT.
     * 
     * @param STAT_PROF   * 状态参数文件
     */
    public void setSTAT_PROF(java.lang.String STAT_PROF) {
        this.STAT_PROF = STAT_PROF;
    }


    /**
     * Gets the CASH_FLOW_LOCKED_TO_DATE value for this DT_ContractSearchSub_CONTRACT.
     * 
     * @return CASH_FLOW_LOCKED_TO_DATE   * 锁定现金流的终止日期
     */
    public java.lang.String getCASH_FLOW_LOCKED_TO_DATE() {
        return CASH_FLOW_LOCKED_TO_DATE;
    }


    /**
     * Sets the CASH_FLOW_LOCKED_TO_DATE value for this DT_ContractSearchSub_CONTRACT.
     * 
     * @param CASH_FLOW_LOCKED_TO_DATE   * 锁定现金流的终止日期
     */
    public void setCASH_FLOW_LOCKED_TO_DATE(java.lang.String CASH_FLOW_LOCKED_TO_DATE) {
        this.CASH_FLOW_LOCKED_TO_DATE = CASH_FLOW_LOCKED_TO_DATE;
    }


    /**
     * Gets the CASH_FLOW_START_DATE value for this DT_ContractSearchSub_CONTRACT.
     * 
     * @return CASH_FLOW_START_DATE   * 现金流生成的起始日期
     */
    public java.lang.String getCASH_FLOW_START_DATE() {
        return CASH_FLOW_START_DATE;
    }


    /**
     * Sets the CASH_FLOW_START_DATE value for this DT_ContractSearchSub_CONTRACT.
     * 
     * @param CASH_FLOW_START_DATE   * 现金流生成的起始日期
     */
    public void setCASH_FLOW_START_DATE(java.lang.String CASH_FLOW_START_DATE) {
        this.CASH_FLOW_START_DATE = CASH_FLOW_START_DATE;
    }


    /**
     * Gets the POSTING_START_DATE value for this DT_ContractSearchSub_CONTRACT.
     * 
     * @return POSTING_START_DATE   * 首次过帐从
     */
    public java.lang.String getPOSTING_START_DATE() {
        return POSTING_START_DATE;
    }


    /**
     * Sets the POSTING_START_DATE value for this DT_ContractSearchSub_CONTRACT.
     * 
     * @param POSTING_START_DATE   * 首次过帐从
     */
    public void setPOSTING_START_DATE(java.lang.String POSTING_START_DATE) {
        this.POSTING_START_DATE = POSTING_START_DATE;
    }


    /**
     * Gets the TRANS_POSSESSION_FROM value for this DT_ContractSearchSub_CONTRACT.
     * 
     * @return TRANS_POSSESSION_FROM   * 所有权转让:开始日期
     */
    public java.lang.String getTRANS_POSSESSION_FROM() {
        return TRANS_POSSESSION_FROM;
    }


    /**
     * Sets the TRANS_POSSESSION_FROM value for this DT_ContractSearchSub_CONTRACT.
     * 
     * @param TRANS_POSSESSION_FROM   * 所有权转让:开始日期
     */
    public void setTRANS_POSSESSION_FROM(java.lang.String TRANS_POSSESSION_FROM) {
        this.TRANS_POSSESSION_FROM = TRANS_POSSESSION_FROM;
    }


    /**
     * Gets the TRANS_POSSESSION_TO value for this DT_ContractSearchSub_CONTRACT.
     * 
     * @return TRANS_POSSESSION_TO   * 所有权转让:终止日期
     */
    public java.lang.String getTRANS_POSSESSION_TO() {
        return TRANS_POSSESSION_TO;
    }


    /**
     * Sets the TRANS_POSSESSION_TO value for this DT_ContractSearchSub_CONTRACT.
     * 
     * @param TRANS_POSSESSION_TO   * 所有权转让:终止日期
     */
    public void setTRANS_POSSESSION_TO(java.lang.String TRANS_POSSESSION_TO) {
        this.TRANS_POSSESSION_TO = TRANS_POSSESSION_TO;
    }

    private java.lang.Object __equalsCalc = null;
    public synchronized boolean equals(java.lang.Object obj) {
        if (!(obj instanceof DT_ContractSearchSub_CONTRACT)) return false;
        DT_ContractSearchSub_CONTRACT other = (DT_ContractSearchSub_CONTRACT) obj;
        if (obj == null) return false;
        if (this == obj) return true;
        if (__equalsCalc != null) {
            return (__equalsCalc == obj);
        }
        __equalsCalc = obj;
        boolean _equals;
        _equals = true && 
            ((this.COMP_CODE==null && other.getCOMP_CODE()==null) || 
             (this.COMP_CODE!=null &&
              this.COMP_CODE.equals(other.getCOMP_CODE()))) &&
            ((this.CONTRACT_NUMBER==null && other.getCONTRACT_NUMBER()==null) || 
             (this.CONTRACT_NUMBER!=null &&
              this.CONTRACT_NUMBER.equals(other.getCONTRACT_NUMBER()))) &&
            ((this.CONTRACT_TYPE==null && other.getCONTRACT_TYPE()==null) || 
             (this.CONTRACT_TYPE!=null &&
              this.CONTRACT_TYPE.equals(other.getCONTRACT_TYPE()))) &&
            ((this.IDENT_OBJECT_TYPE==null && other.getIDENT_OBJECT_TYPE()==null) || 
             (this.IDENT_OBJECT_TYPE!=null &&
              this.IDENT_OBJECT_TYPE.equals(other.getIDENT_OBJECT_TYPE()))) &&
            ((this.IDENT_KEY==null && other.getIDENT_KEY()==null) || 
             (this.IDENT_KEY!=null &&
              this.IDENT_KEY.equals(other.getIDENT_KEY()))) &&
            ((this.CREATION_USER==null && other.getCREATION_USER()==null) || 
             (this.CREATION_USER!=null &&
              this.CREATION_USER.equals(other.getCREATION_USER()))) &&
            ((this.CREATION_DATE==null && other.getCREATION_DATE()==null) || 
             (this.CREATION_DATE!=null &&
              this.CREATION_DATE.equals(other.getCREATION_DATE()))) &&
            ((this.CREATION_TIME==null && other.getCREATION_TIME()==null) || 
             (this.CREATION_TIME!=null &&
              this.CREATION_TIME.equals(other.getCREATION_TIME()))) &&
            ((this.LASTCHANGE_USER==null && other.getLASTCHANGE_USER()==null) || 
             (this.LASTCHANGE_USER!=null &&
              this.LASTCHANGE_USER.equals(other.getLASTCHANGE_USER()))) &&
            ((this.LASTCHANGE_DATE==null && other.getLASTCHANGE_DATE()==null) || 
             (this.LASTCHANGE_DATE!=null &&
              this.LASTCHANGE_DATE.equals(other.getLASTCHANGE_DATE()))) &&
            ((this.LASTCHANGE_TIME==null && other.getLASTCHANGE_TIME()==null) || 
             (this.LASTCHANGE_TIME!=null &&
              this.LASTCHANGE_TIME.equals(other.getLASTCHANGE_TIME()))) &&
            ((this.CONTRACT_TEXT==null && other.getCONTRACT_TEXT()==null) || 
             (this.CONTRACT_TEXT!=null &&
              this.CONTRACT_TEXT.equals(other.getCONTRACT_TEXT()))) &&
            ((this.CONTRACT_CONCLUSION_DATE==null && other.getCONTRACT_CONCLUSION_DATE()==null) || 
             (this.CONTRACT_CONCLUSION_DATE!=null &&
              this.CONTRACT_CONCLUSION_DATE.equals(other.getCONTRACT_CONCLUSION_DATE()))) &&
            ((this.SECOND_SIGNATURE_DATE==null && other.getSECOND_SIGNATURE_DATE()==null) || 
             (this.SECOND_SIGNATURE_DATE!=null &&
              this.SECOND_SIGNATURE_DATE.equals(other.getSECOND_SIGNATURE_DATE()))) &&
            ((this.CONTRACT_START_DATE==null && other.getCONTRACT_START_DATE()==null) || 
             (this.CONTRACT_START_DATE!=null &&
              this.CONTRACT_START_DATE.equals(other.getCONTRACT_START_DATE()))) &&
            ((this.FIRST_POSTING_DATE==null && other.getFIRST_POSTING_DATE()==null) || 
             (this.FIRST_POSTING_DATE!=null &&
              this.FIRST_POSTING_DATE.equals(other.getFIRST_POSTING_DATE()))) &&
            ((this.FIRST_END_DATE==null && other.getFIRST_END_DATE()==null) || 
             (this.FIRST_END_DATE!=null &&
              this.FIRST_END_DATE.equals(other.getFIRST_END_DATE()))) &&
            ((this.AUTHORIZATION_GROUP==null && other.getAUTHORIZATION_GROUP()==null) || 
             (this.AUTHORIZATION_GROUP!=null &&
              this.AUTHORIZATION_GROUP.equals(other.getAUTHORIZATION_GROUP()))) &&
            ((this.TENANCY_LAW==null && other.getTENANCY_LAW()==null) || 
             (this.TENANCY_LAW!=null &&
              this.TENANCY_LAW.equals(other.getTENANCY_LAW()))) &&
            ((this.OLD_CONTRACT_NUMBER==null && other.getOLD_CONTRACT_NUMBER()==null) || 
             (this.OLD_CONTRACT_NUMBER!=null &&
              this.OLD_CONTRACT_NUMBER.equals(other.getOLD_CONTRACT_NUMBER()))) &&
            ((this.MAIN_CONTRACT_COMP_CODE==null && other.getMAIN_CONTRACT_COMP_CODE()==null) || 
             (this.MAIN_CONTRACT_COMP_CODE!=null &&
              this.MAIN_CONTRACT_COMP_CODE.equals(other.getMAIN_CONTRACT_COMP_CODE()))) &&
            ((this.MAIN_CONTRACT_NUMBER==null && other.getMAIN_CONTRACT_NUMBER()==null) || 
             (this.MAIN_CONTRACT_NUMBER!=null &&
              this.MAIN_CONTRACT_NUMBER.equals(other.getMAIN_CONTRACT_NUMBER()))) &&
            ((this.INDUSTRYSECTOR==null && other.getINDUSTRYSECTOR()==null) || 
             (this.INDUSTRYSECTOR!=null &&
              this.INDUSTRYSECTOR.equals(other.getINDUSTRYSECTOR()))) &&
            ((this.DEPOSIT_TYPE==null && other.getDEPOSIT_TYPE()==null) || 
             (this.DEPOSIT_TYPE!=null &&
              this.DEPOSIT_TYPE.equals(other.getDEPOSIT_TYPE()))) &&
            ((this.IS_SALES_RELATED==null && other.getIS_SALES_RELATED()==null) || 
             (this.IS_SALES_RELATED!=null &&
              this.IS_SALES_RELATED.equals(other.getIS_SALES_RELATED()))) &&
            ((this.RESPONSIBLE==null && other.getRESPONSIBLE()==null) || 
             (this.RESPONSIBLE!=null &&
              this.RESPONSIBLE.equals(other.getRESPONSIBLE()))) &&
            ((this.TERM_END_DATE==null && other.getTERM_END_DATE()==null) || 
             (this.TERM_END_DATE!=null &&
              this.TERM_END_DATE.equals(other.getTERM_END_DATE()))) &&
            ((this.NOTICE_DATE==null && other.getNOTICE_DATE()==null) || 
             (this.NOTICE_DATE!=null &&
              this.NOTICE_DATE.equals(other.getNOTICE_DATE()))) &&
            ((this.NOTICE_RECEIPT_DATE==null && other.getNOTICE_RECEIPT_DATE()==null) || 
             (this.NOTICE_RECEIPT_DATE!=null &&
              this.NOTICE_RECEIPT_DATE.equals(other.getNOTICE_RECEIPT_DATE()))) &&
            ((this.NOTICE_REASON==null && other.getNOTICE_REASON()==null) || 
             (this.NOTICE_REASON!=null &&
              this.NOTICE_REASON.equals(other.getNOTICE_REASON()))) &&
            ((this.NOTICE_ACTIVATION_DATE==null && other.getNOTICE_ACTIVATION_DATE()==null) || 
             (this.NOTICE_ACTIVATION_DATE!=null &&
              this.NOTICE_ACTIVATION_DATE.equals(other.getNOTICE_ACTIVATION_DATE()))) &&
            ((this.STAT_PROF==null && other.getSTAT_PROF()==null) || 
             (this.STAT_PROF!=null &&
              this.STAT_PROF.equals(other.getSTAT_PROF()))) &&
            ((this.CASH_FLOW_LOCKED_TO_DATE==null && other.getCASH_FLOW_LOCKED_TO_DATE()==null) || 
             (this.CASH_FLOW_LOCKED_TO_DATE!=null &&
              this.CASH_FLOW_LOCKED_TO_DATE.equals(other.getCASH_FLOW_LOCKED_TO_DATE()))) &&
            ((this.CASH_FLOW_START_DATE==null && other.getCASH_FLOW_START_DATE()==null) || 
             (this.CASH_FLOW_START_DATE!=null &&
              this.CASH_FLOW_START_DATE.equals(other.getCASH_FLOW_START_DATE()))) &&
            ((this.POSTING_START_DATE==null && other.getPOSTING_START_DATE()==null) || 
             (this.POSTING_START_DATE!=null &&
              this.POSTING_START_DATE.equals(other.getPOSTING_START_DATE()))) &&
            ((this.TRANS_POSSESSION_FROM==null && other.getTRANS_POSSESSION_FROM()==null) || 
             (this.TRANS_POSSESSION_FROM!=null &&
              this.TRANS_POSSESSION_FROM.equals(other.getTRANS_POSSESSION_FROM()))) &&
            ((this.TRANS_POSSESSION_TO==null && other.getTRANS_POSSESSION_TO()==null) || 
             (this.TRANS_POSSESSION_TO!=null &&
              this.TRANS_POSSESSION_TO.equals(other.getTRANS_POSSESSION_TO())));
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
        if (getCOMP_CODE() != null) {
            _hashCode += getCOMP_CODE().hashCode();
        }
        if (getCONTRACT_NUMBER() != null) {
            _hashCode += getCONTRACT_NUMBER().hashCode();
        }
        if (getCONTRACT_TYPE() != null) {
            _hashCode += getCONTRACT_TYPE().hashCode();
        }
        if (getIDENT_OBJECT_TYPE() != null) {
            _hashCode += getIDENT_OBJECT_TYPE().hashCode();
        }
        if (getIDENT_KEY() != null) {
            _hashCode += getIDENT_KEY().hashCode();
        }
        if (getCREATION_USER() != null) {
            _hashCode += getCREATION_USER().hashCode();
        }
        if (getCREATION_DATE() != null) {
            _hashCode += getCREATION_DATE().hashCode();
        }
        if (getCREATION_TIME() != null) {
            _hashCode += getCREATION_TIME().hashCode();
        }
        if (getLASTCHANGE_USER() != null) {
            _hashCode += getLASTCHANGE_USER().hashCode();
        }
        if (getLASTCHANGE_DATE() != null) {
            _hashCode += getLASTCHANGE_DATE().hashCode();
        }
        if (getLASTCHANGE_TIME() != null) {
            _hashCode += getLASTCHANGE_TIME().hashCode();
        }
        if (getCONTRACT_TEXT() != null) {
            _hashCode += getCONTRACT_TEXT().hashCode();
        }
        if (getCONTRACT_CONCLUSION_DATE() != null) {
            _hashCode += getCONTRACT_CONCLUSION_DATE().hashCode();
        }
        if (getSECOND_SIGNATURE_DATE() != null) {
            _hashCode += getSECOND_SIGNATURE_DATE().hashCode();
        }
        if (getCONTRACT_START_DATE() != null) {
            _hashCode += getCONTRACT_START_DATE().hashCode();
        }
        if (getFIRST_POSTING_DATE() != null) {
            _hashCode += getFIRST_POSTING_DATE().hashCode();
        }
        if (getFIRST_END_DATE() != null) {
            _hashCode += getFIRST_END_DATE().hashCode();
        }
        if (getAUTHORIZATION_GROUP() != null) {
            _hashCode += getAUTHORIZATION_GROUP().hashCode();
        }
        if (getTENANCY_LAW() != null) {
            _hashCode += getTENANCY_LAW().hashCode();
        }
        if (getOLD_CONTRACT_NUMBER() != null) {
            _hashCode += getOLD_CONTRACT_NUMBER().hashCode();
        }
        if (getMAIN_CONTRACT_COMP_CODE() != null) {
            _hashCode += getMAIN_CONTRACT_COMP_CODE().hashCode();
        }
        if (getMAIN_CONTRACT_NUMBER() != null) {
            _hashCode += getMAIN_CONTRACT_NUMBER().hashCode();
        }
        if (getINDUSTRYSECTOR() != null) {
            _hashCode += getINDUSTRYSECTOR().hashCode();
        }
        if (getDEPOSIT_TYPE() != null) {
            _hashCode += getDEPOSIT_TYPE().hashCode();
        }
        if (getIS_SALES_RELATED() != null) {
            _hashCode += getIS_SALES_RELATED().hashCode();
        }
        if (getRESPONSIBLE() != null) {
            _hashCode += getRESPONSIBLE().hashCode();
        }
        if (getTERM_END_DATE() != null) {
            _hashCode += getTERM_END_DATE().hashCode();
        }
        if (getNOTICE_DATE() != null) {
            _hashCode += getNOTICE_DATE().hashCode();
        }
        if (getNOTICE_RECEIPT_DATE() != null) {
            _hashCode += getNOTICE_RECEIPT_DATE().hashCode();
        }
        if (getNOTICE_REASON() != null) {
            _hashCode += getNOTICE_REASON().hashCode();
        }
        if (getNOTICE_ACTIVATION_DATE() != null) {
            _hashCode += getNOTICE_ACTIVATION_DATE().hashCode();
        }
        if (getSTAT_PROF() != null) {
            _hashCode += getSTAT_PROF().hashCode();
        }
        if (getCASH_FLOW_LOCKED_TO_DATE() != null) {
            _hashCode += getCASH_FLOW_LOCKED_TO_DATE().hashCode();
        }
        if (getCASH_FLOW_START_DATE() != null) {
            _hashCode += getCASH_FLOW_START_DATE().hashCode();
        }
        if (getPOSTING_START_DATE() != null) {
            _hashCode += getPOSTING_START_DATE().hashCode();
        }
        if (getTRANS_POSSESSION_FROM() != null) {
            _hashCode += getTRANS_POSSESSION_FROM().hashCode();
        }
        if (getTRANS_POSSESSION_TO() != null) {
            _hashCode += getTRANS_POSSESSION_TO().hashCode();
        }
        __hashCodeCalc = false;
        return _hashCode;
    }

    // Type metadata
    private static org.apache.axis.description.TypeDesc typeDesc =
        new org.apache.axis.description.TypeDesc(DT_ContractSearchSub_CONTRACT.class, true);

    static {
        typeDesc.setXmlType(new javax.xml.namespace.QName("urn:ecc:rvs:contract", "DT_ContractSearchSub_CONTRACT"));
        org.apache.axis.description.ElementDesc elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("COMP_CODE");
        elemField.setXmlName(new javax.xml.namespace.QName("", "COMP_CODE"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("CONTRACT_NUMBER");
        elemField.setXmlName(new javax.xml.namespace.QName("", "CONTRACT_NUMBER"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("CONTRACT_TYPE");
        elemField.setXmlName(new javax.xml.namespace.QName("", "CONTRACT_TYPE"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("IDENT_OBJECT_TYPE");
        elemField.setXmlName(new javax.xml.namespace.QName("", "IDENT_OBJECT_TYPE"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("IDENT_KEY");
        elemField.setXmlName(new javax.xml.namespace.QName("", "IDENT_KEY"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("CREATION_USER");
        elemField.setXmlName(new javax.xml.namespace.QName("", "CREATION_USER"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("CREATION_DATE");
        elemField.setXmlName(new javax.xml.namespace.QName("", "CREATION_DATE"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("CREATION_TIME");
        elemField.setXmlName(new javax.xml.namespace.QName("", "CREATION_TIME"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("LASTCHANGE_USER");
        elemField.setXmlName(new javax.xml.namespace.QName("", "LASTCHANGE_USER"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("LASTCHANGE_DATE");
        elemField.setXmlName(new javax.xml.namespace.QName("", "LASTCHANGE_DATE"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("LASTCHANGE_TIME");
        elemField.setXmlName(new javax.xml.namespace.QName("", "LASTCHANGE_TIME"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("CONTRACT_TEXT");
        elemField.setXmlName(new javax.xml.namespace.QName("", "CONTRACT_TEXT"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("CONTRACT_CONCLUSION_DATE");
        elemField.setXmlName(new javax.xml.namespace.QName("", "CONTRACT_CONCLUSION_DATE"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("SECOND_SIGNATURE_DATE");
        elemField.setXmlName(new javax.xml.namespace.QName("", "SECOND_SIGNATURE_DATE"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("CONTRACT_START_DATE");
        elemField.setXmlName(new javax.xml.namespace.QName("", "CONTRACT_START_DATE"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("FIRST_POSTING_DATE");
        elemField.setXmlName(new javax.xml.namespace.QName("", "FIRST_POSTING_DATE"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("FIRST_END_DATE");
        elemField.setXmlName(new javax.xml.namespace.QName("", "FIRST_END_DATE"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("AUTHORIZATION_GROUP");
        elemField.setXmlName(new javax.xml.namespace.QName("", "AUTHORIZATION_GROUP"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("TENANCY_LAW");
        elemField.setXmlName(new javax.xml.namespace.QName("", "TENANCY_LAW"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("OLD_CONTRACT_NUMBER");
        elemField.setXmlName(new javax.xml.namespace.QName("", "OLD_CONTRACT_NUMBER"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("MAIN_CONTRACT_COMP_CODE");
        elemField.setXmlName(new javax.xml.namespace.QName("", "MAIN_CONTRACT_COMP_CODE"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("MAIN_CONTRACT_NUMBER");
        elemField.setXmlName(new javax.xml.namespace.QName("", "MAIN_CONTRACT_NUMBER"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("INDUSTRYSECTOR");
        elemField.setXmlName(new javax.xml.namespace.QName("", "INDUSTRYSECTOR"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("DEPOSIT_TYPE");
        elemField.setXmlName(new javax.xml.namespace.QName("", "DEPOSIT_TYPE"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("IS_SALES_RELATED");
        elemField.setXmlName(new javax.xml.namespace.QName("", "IS_SALES_RELATED"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("RESPONSIBLE");
        elemField.setXmlName(new javax.xml.namespace.QName("", "RESPONSIBLE"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("TERM_END_DATE");
        elemField.setXmlName(new javax.xml.namespace.QName("", "TERM_END_DATE"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("NOTICE_DATE");
        elemField.setXmlName(new javax.xml.namespace.QName("", "NOTICE_DATE"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("NOTICE_RECEIPT_DATE");
        elemField.setXmlName(new javax.xml.namespace.QName("", "NOTICE_RECEIPT_DATE"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("NOTICE_REASON");
        elemField.setXmlName(new javax.xml.namespace.QName("", "NOTICE_REASON"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("NOTICE_ACTIVATION_DATE");
        elemField.setXmlName(new javax.xml.namespace.QName("", "NOTICE_ACTIVATION_DATE"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("STAT_PROF");
        elemField.setXmlName(new javax.xml.namespace.QName("", "STAT_PROF"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("CASH_FLOW_LOCKED_TO_DATE");
        elemField.setXmlName(new javax.xml.namespace.QName("", "CASH_FLOW_LOCKED_TO_DATE"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("CASH_FLOW_START_DATE");
        elemField.setXmlName(new javax.xml.namespace.QName("", "CASH_FLOW_START_DATE"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("POSTING_START_DATE");
        elemField.setXmlName(new javax.xml.namespace.QName("", "POSTING_START_DATE"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("TRANS_POSSESSION_FROM");
        elemField.setXmlName(new javax.xml.namespace.QName("", "TRANS_POSSESSION_FROM"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("TRANS_POSSESSION_TO");
        elemField.setXmlName(new javax.xml.namespace.QName("", "TRANS_POSSESSION_TO"));
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
