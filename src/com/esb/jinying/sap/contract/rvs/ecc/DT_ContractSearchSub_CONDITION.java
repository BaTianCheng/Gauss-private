/**
 * DT_ContractSearchSub_CONDITION.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package com.esb.jinying.sap.contract.rvs.ecc;

public class DT_ContractSearchSub_CONDITION  implements java.io.Serializable {
    /* 对象的标识 */
    private java.lang.String OBJECT_ID;

    /* 在创建模式中输入了缺省值 */
    private java.lang.String DEFAULTS_ONLY;

    /* 条件类型 */
    private java.lang.String CONDITION_TYPE;

    /* 计算对象的业务对象类型 */
    private java.lang.String CALCULATION_OBJECT_TYPE;

    /* 计算对象的标识 */
    private java.lang.String CALCULATION_OBJECT_ID;

    /* 分配对象的业务对象类型 */
    private java.lang.String DISTRIBUTION_OBJECT_TYPE;

    /* 分配对象的标识 */
    private java.lang.String DISTRIBUTION_OBJECT_ID;

    /* 条件有效时的起始日期 */
    private java.lang.String VALID_FROM;

    /* 条件有效的终止日期 */
    private java.lang.String VALID_TO;

    /* 条件项目货币 */
    private java.lang.String CURRENCY;

    /* ISO 货币码 */
    private java.lang.String CURRENCY_ISO;

    /* 随后过帐的到期日 */
    private java.lang.String FOLLOW_UP_POSTING_DUE_DATE;

    /* 支付条款的编号 */
    private java.lang.String TERM_NO_PAYMENT;

    /* 频率条款的编号 */
    private java.lang.String TERM_NO_RHYTHM;

    /* 调整条款的编号 */
    private java.lang.String TERM_NO_ADJUSTMENT;

    /* 组织分配期限的编号 */
    private java.lang.String TERM_NO_ORG_ASSIGNMENT;

    /* 销售条款的编号 */
    private java.lang.String TERM_NO_SALES_RULE;

    /* 最高销售条款的编号 */
    private java.lang.String TERM_NO_MASTER_SALES_RULE;

    /* 货币无关的单位价格 */
    private java.lang.String UNIT_PRICE;

    /* 计算公式 */
    private java.lang.String CALC_RULE;

    /* 计算公式的非典型参数 */
    private java.lang.String CALC_RULE_PARAMETER1;

    /* 计算公式的非典型参数 */
    private java.lang.String CALC_RULE_PARAMETER2;

    /* 分配公式 */
    private java.lang.String DIST_RULE;

    /* 分配公式的非典型参数 */
    private java.lang.String DIST_RULE_PARAMETER1;

    /* 分配公式的非典型参数 */
    private java.lang.String DIST_RULE_PARAMETER2;

    /* 条件 - 外部目的 */
    private java.lang.String EXTERNAL_PURPOSE;

    /* 下一次可能调整的日期 */
    private java.lang.String NEXT_ADJUSTMENT_DATE;

    /* 更改原因 */
    private java.lang.String REASON_FOR_CHANGE;

    /* 条件是一次性条件 */
    private java.lang.String IS_ONE_TIME;

    /* 统计或信息条件 */
    private java.lang.String IS_STATISTICAL;

    /* 首次过帐从 */
    private java.lang.String POSTING_START_DATE;

    /* 预扣税条款编号 */
    private java.lang.String TERM_NO_WITHHOLDING_TAX;

    public DT_ContractSearchSub_CONDITION() {
    }

    public DT_ContractSearchSub_CONDITION(
           java.lang.String OBJECT_ID,
           java.lang.String DEFAULTS_ONLY,
           java.lang.String CONDITION_TYPE,
           java.lang.String CALCULATION_OBJECT_TYPE,
           java.lang.String CALCULATION_OBJECT_ID,
           java.lang.String DISTRIBUTION_OBJECT_TYPE,
           java.lang.String DISTRIBUTION_OBJECT_ID,
           java.lang.String VALID_FROM,
           java.lang.String VALID_TO,
           java.lang.String CURRENCY,
           java.lang.String CURRENCY_ISO,
           java.lang.String FOLLOW_UP_POSTING_DUE_DATE,
           java.lang.String TERM_NO_PAYMENT,
           java.lang.String TERM_NO_RHYTHM,
           java.lang.String TERM_NO_ADJUSTMENT,
           java.lang.String TERM_NO_ORG_ASSIGNMENT,
           java.lang.String TERM_NO_SALES_RULE,
           java.lang.String TERM_NO_MASTER_SALES_RULE,
           java.lang.String UNIT_PRICE,
           java.lang.String CALC_RULE,
           java.lang.String CALC_RULE_PARAMETER1,
           java.lang.String CALC_RULE_PARAMETER2,
           java.lang.String DIST_RULE,
           java.lang.String DIST_RULE_PARAMETER1,
           java.lang.String DIST_RULE_PARAMETER2,
           java.lang.String EXTERNAL_PURPOSE,
           java.lang.String NEXT_ADJUSTMENT_DATE,
           java.lang.String REASON_FOR_CHANGE,
           java.lang.String IS_ONE_TIME,
           java.lang.String IS_STATISTICAL,
           java.lang.String POSTING_START_DATE,
           java.lang.String TERM_NO_WITHHOLDING_TAX) {
           this.OBJECT_ID = OBJECT_ID;
           this.DEFAULTS_ONLY = DEFAULTS_ONLY;
           this.CONDITION_TYPE = CONDITION_TYPE;
           this.CALCULATION_OBJECT_TYPE = CALCULATION_OBJECT_TYPE;
           this.CALCULATION_OBJECT_ID = CALCULATION_OBJECT_ID;
           this.DISTRIBUTION_OBJECT_TYPE = DISTRIBUTION_OBJECT_TYPE;
           this.DISTRIBUTION_OBJECT_ID = DISTRIBUTION_OBJECT_ID;
           this.VALID_FROM = VALID_FROM;
           this.VALID_TO = VALID_TO;
           this.CURRENCY = CURRENCY;
           this.CURRENCY_ISO = CURRENCY_ISO;
           this.FOLLOW_UP_POSTING_DUE_DATE = FOLLOW_UP_POSTING_DUE_DATE;
           this.TERM_NO_PAYMENT = TERM_NO_PAYMENT;
           this.TERM_NO_RHYTHM = TERM_NO_RHYTHM;
           this.TERM_NO_ADJUSTMENT = TERM_NO_ADJUSTMENT;
           this.TERM_NO_ORG_ASSIGNMENT = TERM_NO_ORG_ASSIGNMENT;
           this.TERM_NO_SALES_RULE = TERM_NO_SALES_RULE;
           this.TERM_NO_MASTER_SALES_RULE = TERM_NO_MASTER_SALES_RULE;
           this.UNIT_PRICE = UNIT_PRICE;
           this.CALC_RULE = CALC_RULE;
           this.CALC_RULE_PARAMETER1 = CALC_RULE_PARAMETER1;
           this.CALC_RULE_PARAMETER2 = CALC_RULE_PARAMETER2;
           this.DIST_RULE = DIST_RULE;
           this.DIST_RULE_PARAMETER1 = DIST_RULE_PARAMETER1;
           this.DIST_RULE_PARAMETER2 = DIST_RULE_PARAMETER2;
           this.EXTERNAL_PURPOSE = EXTERNAL_PURPOSE;
           this.NEXT_ADJUSTMENT_DATE = NEXT_ADJUSTMENT_DATE;
           this.REASON_FOR_CHANGE = REASON_FOR_CHANGE;
           this.IS_ONE_TIME = IS_ONE_TIME;
           this.IS_STATISTICAL = IS_STATISTICAL;
           this.POSTING_START_DATE = POSTING_START_DATE;
           this.TERM_NO_WITHHOLDING_TAX = TERM_NO_WITHHOLDING_TAX;
    }


    /**
     * Gets the OBJECT_ID value for this DT_ContractSearchSub_CONDITION.
     * 
     * @return OBJECT_ID   * 对象的标识
     */
    public java.lang.String getOBJECT_ID() {
        return OBJECT_ID;
    }


    /**
     * Sets the OBJECT_ID value for this DT_ContractSearchSub_CONDITION.
     * 
     * @param OBJECT_ID   * 对象的标识
     */
    public void setOBJECT_ID(java.lang.String OBJECT_ID) {
        this.OBJECT_ID = OBJECT_ID;
    }


    /**
     * Gets the DEFAULTS_ONLY value for this DT_ContractSearchSub_CONDITION.
     * 
     * @return DEFAULTS_ONLY   * 在创建模式中输入了缺省值
     */
    public java.lang.String getDEFAULTS_ONLY() {
        return DEFAULTS_ONLY;
    }


    /**
     * Sets the DEFAULTS_ONLY value for this DT_ContractSearchSub_CONDITION.
     * 
     * @param DEFAULTS_ONLY   * 在创建模式中输入了缺省值
     */
    public void setDEFAULTS_ONLY(java.lang.String DEFAULTS_ONLY) {
        this.DEFAULTS_ONLY = DEFAULTS_ONLY;
    }


    /**
     * Gets the CONDITION_TYPE value for this DT_ContractSearchSub_CONDITION.
     * 
     * @return CONDITION_TYPE   * 条件类型
     */
    public java.lang.String getCONDITION_TYPE() {
        return CONDITION_TYPE;
    }


    /**
     * Sets the CONDITION_TYPE value for this DT_ContractSearchSub_CONDITION.
     * 
     * @param CONDITION_TYPE   * 条件类型
     */
    public void setCONDITION_TYPE(java.lang.String CONDITION_TYPE) {
        this.CONDITION_TYPE = CONDITION_TYPE;
    }


    /**
     * Gets the CALCULATION_OBJECT_TYPE value for this DT_ContractSearchSub_CONDITION.
     * 
     * @return CALCULATION_OBJECT_TYPE   * 计算对象的业务对象类型
     */
    public java.lang.String getCALCULATION_OBJECT_TYPE() {
        return CALCULATION_OBJECT_TYPE;
    }


    /**
     * Sets the CALCULATION_OBJECT_TYPE value for this DT_ContractSearchSub_CONDITION.
     * 
     * @param CALCULATION_OBJECT_TYPE   * 计算对象的业务对象类型
     */
    public void setCALCULATION_OBJECT_TYPE(java.lang.String CALCULATION_OBJECT_TYPE) {
        this.CALCULATION_OBJECT_TYPE = CALCULATION_OBJECT_TYPE;
    }


    /**
     * Gets the CALCULATION_OBJECT_ID value for this DT_ContractSearchSub_CONDITION.
     * 
     * @return CALCULATION_OBJECT_ID   * 计算对象的标识
     */
    public java.lang.String getCALCULATION_OBJECT_ID() {
        return CALCULATION_OBJECT_ID;
    }


    /**
     * Sets the CALCULATION_OBJECT_ID value for this DT_ContractSearchSub_CONDITION.
     * 
     * @param CALCULATION_OBJECT_ID   * 计算对象的标识
     */
    public void setCALCULATION_OBJECT_ID(java.lang.String CALCULATION_OBJECT_ID) {
        this.CALCULATION_OBJECT_ID = CALCULATION_OBJECT_ID;
    }


    /**
     * Gets the DISTRIBUTION_OBJECT_TYPE value for this DT_ContractSearchSub_CONDITION.
     * 
     * @return DISTRIBUTION_OBJECT_TYPE   * 分配对象的业务对象类型
     */
    public java.lang.String getDISTRIBUTION_OBJECT_TYPE() {
        return DISTRIBUTION_OBJECT_TYPE;
    }


    /**
     * Sets the DISTRIBUTION_OBJECT_TYPE value for this DT_ContractSearchSub_CONDITION.
     * 
     * @param DISTRIBUTION_OBJECT_TYPE   * 分配对象的业务对象类型
     */
    public void setDISTRIBUTION_OBJECT_TYPE(java.lang.String DISTRIBUTION_OBJECT_TYPE) {
        this.DISTRIBUTION_OBJECT_TYPE = DISTRIBUTION_OBJECT_TYPE;
    }


    /**
     * Gets the DISTRIBUTION_OBJECT_ID value for this DT_ContractSearchSub_CONDITION.
     * 
     * @return DISTRIBUTION_OBJECT_ID   * 分配对象的标识
     */
    public java.lang.String getDISTRIBUTION_OBJECT_ID() {
        return DISTRIBUTION_OBJECT_ID;
    }


    /**
     * Sets the DISTRIBUTION_OBJECT_ID value for this DT_ContractSearchSub_CONDITION.
     * 
     * @param DISTRIBUTION_OBJECT_ID   * 分配对象的标识
     */
    public void setDISTRIBUTION_OBJECT_ID(java.lang.String DISTRIBUTION_OBJECT_ID) {
        this.DISTRIBUTION_OBJECT_ID = DISTRIBUTION_OBJECT_ID;
    }


    /**
     * Gets the VALID_FROM value for this DT_ContractSearchSub_CONDITION.
     * 
     * @return VALID_FROM   * 条件有效时的起始日期
     */
    public java.lang.String getVALID_FROM() {
        return VALID_FROM;
    }


    /**
     * Sets the VALID_FROM value for this DT_ContractSearchSub_CONDITION.
     * 
     * @param VALID_FROM   * 条件有效时的起始日期
     */
    public void setVALID_FROM(java.lang.String VALID_FROM) {
        this.VALID_FROM = VALID_FROM;
    }


    /**
     * Gets the VALID_TO value for this DT_ContractSearchSub_CONDITION.
     * 
     * @return VALID_TO   * 条件有效的终止日期
     */
    public java.lang.String getVALID_TO() {
        return VALID_TO;
    }


    /**
     * Sets the VALID_TO value for this DT_ContractSearchSub_CONDITION.
     * 
     * @param VALID_TO   * 条件有效的终止日期
     */
    public void setVALID_TO(java.lang.String VALID_TO) {
        this.VALID_TO = VALID_TO;
    }


    /**
     * Gets the CURRENCY value for this DT_ContractSearchSub_CONDITION.
     * 
     * @return CURRENCY   * 条件项目货币
     */
    public java.lang.String getCURRENCY() {
        return CURRENCY;
    }


    /**
     * Sets the CURRENCY value for this DT_ContractSearchSub_CONDITION.
     * 
     * @param CURRENCY   * 条件项目货币
     */
    public void setCURRENCY(java.lang.String CURRENCY) {
        this.CURRENCY = CURRENCY;
    }


    /**
     * Gets the CURRENCY_ISO value for this DT_ContractSearchSub_CONDITION.
     * 
     * @return CURRENCY_ISO   * ISO 货币码
     */
    public java.lang.String getCURRENCY_ISO() {
        return CURRENCY_ISO;
    }


    /**
     * Sets the CURRENCY_ISO value for this DT_ContractSearchSub_CONDITION.
     * 
     * @param CURRENCY_ISO   * ISO 货币码
     */
    public void setCURRENCY_ISO(java.lang.String CURRENCY_ISO) {
        this.CURRENCY_ISO = CURRENCY_ISO;
    }


    /**
     * Gets the FOLLOW_UP_POSTING_DUE_DATE value for this DT_ContractSearchSub_CONDITION.
     * 
     * @return FOLLOW_UP_POSTING_DUE_DATE   * 随后过帐的到期日
     */
    public java.lang.String getFOLLOW_UP_POSTING_DUE_DATE() {
        return FOLLOW_UP_POSTING_DUE_DATE;
    }


    /**
     * Sets the FOLLOW_UP_POSTING_DUE_DATE value for this DT_ContractSearchSub_CONDITION.
     * 
     * @param FOLLOW_UP_POSTING_DUE_DATE   * 随后过帐的到期日
     */
    public void setFOLLOW_UP_POSTING_DUE_DATE(java.lang.String FOLLOW_UP_POSTING_DUE_DATE) {
        this.FOLLOW_UP_POSTING_DUE_DATE = FOLLOW_UP_POSTING_DUE_DATE;
    }


    /**
     * Gets the TERM_NO_PAYMENT value for this DT_ContractSearchSub_CONDITION.
     * 
     * @return TERM_NO_PAYMENT   * 支付条款的编号
     */
    public java.lang.String getTERM_NO_PAYMENT() {
        return TERM_NO_PAYMENT;
    }


    /**
     * Sets the TERM_NO_PAYMENT value for this DT_ContractSearchSub_CONDITION.
     * 
     * @param TERM_NO_PAYMENT   * 支付条款的编号
     */
    public void setTERM_NO_PAYMENT(java.lang.String TERM_NO_PAYMENT) {
        this.TERM_NO_PAYMENT = TERM_NO_PAYMENT;
    }


    /**
     * Gets the TERM_NO_RHYTHM value for this DT_ContractSearchSub_CONDITION.
     * 
     * @return TERM_NO_RHYTHM   * 频率条款的编号
     */
    public java.lang.String getTERM_NO_RHYTHM() {
        return TERM_NO_RHYTHM;
    }


    /**
     * Sets the TERM_NO_RHYTHM value for this DT_ContractSearchSub_CONDITION.
     * 
     * @param TERM_NO_RHYTHM   * 频率条款的编号
     */
    public void setTERM_NO_RHYTHM(java.lang.String TERM_NO_RHYTHM) {
        this.TERM_NO_RHYTHM = TERM_NO_RHYTHM;
    }


    /**
     * Gets the TERM_NO_ADJUSTMENT value for this DT_ContractSearchSub_CONDITION.
     * 
     * @return TERM_NO_ADJUSTMENT   * 调整条款的编号
     */
    public java.lang.String getTERM_NO_ADJUSTMENT() {
        return TERM_NO_ADJUSTMENT;
    }


    /**
     * Sets the TERM_NO_ADJUSTMENT value for this DT_ContractSearchSub_CONDITION.
     * 
     * @param TERM_NO_ADJUSTMENT   * 调整条款的编号
     */
    public void setTERM_NO_ADJUSTMENT(java.lang.String TERM_NO_ADJUSTMENT) {
        this.TERM_NO_ADJUSTMENT = TERM_NO_ADJUSTMENT;
    }


    /**
     * Gets the TERM_NO_ORG_ASSIGNMENT value for this DT_ContractSearchSub_CONDITION.
     * 
     * @return TERM_NO_ORG_ASSIGNMENT   * 组织分配期限的编号
     */
    public java.lang.String getTERM_NO_ORG_ASSIGNMENT() {
        return TERM_NO_ORG_ASSIGNMENT;
    }


    /**
     * Sets the TERM_NO_ORG_ASSIGNMENT value for this DT_ContractSearchSub_CONDITION.
     * 
     * @param TERM_NO_ORG_ASSIGNMENT   * 组织分配期限的编号
     */
    public void setTERM_NO_ORG_ASSIGNMENT(java.lang.String TERM_NO_ORG_ASSIGNMENT) {
        this.TERM_NO_ORG_ASSIGNMENT = TERM_NO_ORG_ASSIGNMENT;
    }


    /**
     * Gets the TERM_NO_SALES_RULE value for this DT_ContractSearchSub_CONDITION.
     * 
     * @return TERM_NO_SALES_RULE   * 销售条款的编号
     */
    public java.lang.String getTERM_NO_SALES_RULE() {
        return TERM_NO_SALES_RULE;
    }


    /**
     * Sets the TERM_NO_SALES_RULE value for this DT_ContractSearchSub_CONDITION.
     * 
     * @param TERM_NO_SALES_RULE   * 销售条款的编号
     */
    public void setTERM_NO_SALES_RULE(java.lang.String TERM_NO_SALES_RULE) {
        this.TERM_NO_SALES_RULE = TERM_NO_SALES_RULE;
    }


    /**
     * Gets the TERM_NO_MASTER_SALES_RULE value for this DT_ContractSearchSub_CONDITION.
     * 
     * @return TERM_NO_MASTER_SALES_RULE   * 最高销售条款的编号
     */
    public java.lang.String getTERM_NO_MASTER_SALES_RULE() {
        return TERM_NO_MASTER_SALES_RULE;
    }


    /**
     * Sets the TERM_NO_MASTER_SALES_RULE value for this DT_ContractSearchSub_CONDITION.
     * 
     * @param TERM_NO_MASTER_SALES_RULE   * 最高销售条款的编号
     */
    public void setTERM_NO_MASTER_SALES_RULE(java.lang.String TERM_NO_MASTER_SALES_RULE) {
        this.TERM_NO_MASTER_SALES_RULE = TERM_NO_MASTER_SALES_RULE;
    }


    /**
     * Gets the UNIT_PRICE value for this DT_ContractSearchSub_CONDITION.
     * 
     * @return UNIT_PRICE   * 货币无关的单位价格
     */
    public java.lang.String getUNIT_PRICE() {
        return UNIT_PRICE;
    }


    /**
     * Sets the UNIT_PRICE value for this DT_ContractSearchSub_CONDITION.
     * 
     * @param UNIT_PRICE   * 货币无关的单位价格
     */
    public void setUNIT_PRICE(java.lang.String UNIT_PRICE) {
        this.UNIT_PRICE = UNIT_PRICE;
    }


    /**
     * Gets the CALC_RULE value for this DT_ContractSearchSub_CONDITION.
     * 
     * @return CALC_RULE   * 计算公式
     */
    public java.lang.String getCALC_RULE() {
        return CALC_RULE;
    }


    /**
     * Sets the CALC_RULE value for this DT_ContractSearchSub_CONDITION.
     * 
     * @param CALC_RULE   * 计算公式
     */
    public void setCALC_RULE(java.lang.String CALC_RULE) {
        this.CALC_RULE = CALC_RULE;
    }


    /**
     * Gets the CALC_RULE_PARAMETER1 value for this DT_ContractSearchSub_CONDITION.
     * 
     * @return CALC_RULE_PARAMETER1   * 计算公式的非典型参数
     */
    public java.lang.String getCALC_RULE_PARAMETER1() {
        return CALC_RULE_PARAMETER1;
    }


    /**
     * Sets the CALC_RULE_PARAMETER1 value for this DT_ContractSearchSub_CONDITION.
     * 
     * @param CALC_RULE_PARAMETER1   * 计算公式的非典型参数
     */
    public void setCALC_RULE_PARAMETER1(java.lang.String CALC_RULE_PARAMETER1) {
        this.CALC_RULE_PARAMETER1 = CALC_RULE_PARAMETER1;
    }


    /**
     * Gets the CALC_RULE_PARAMETER2 value for this DT_ContractSearchSub_CONDITION.
     * 
     * @return CALC_RULE_PARAMETER2   * 计算公式的非典型参数
     */
    public java.lang.String getCALC_RULE_PARAMETER2() {
        return CALC_RULE_PARAMETER2;
    }


    /**
     * Sets the CALC_RULE_PARAMETER2 value for this DT_ContractSearchSub_CONDITION.
     * 
     * @param CALC_RULE_PARAMETER2   * 计算公式的非典型参数
     */
    public void setCALC_RULE_PARAMETER2(java.lang.String CALC_RULE_PARAMETER2) {
        this.CALC_RULE_PARAMETER2 = CALC_RULE_PARAMETER2;
    }


    /**
     * Gets the DIST_RULE value for this DT_ContractSearchSub_CONDITION.
     * 
     * @return DIST_RULE   * 分配公式
     */
    public java.lang.String getDIST_RULE() {
        return DIST_RULE;
    }


    /**
     * Sets the DIST_RULE value for this DT_ContractSearchSub_CONDITION.
     * 
     * @param DIST_RULE   * 分配公式
     */
    public void setDIST_RULE(java.lang.String DIST_RULE) {
        this.DIST_RULE = DIST_RULE;
    }


    /**
     * Gets the DIST_RULE_PARAMETER1 value for this DT_ContractSearchSub_CONDITION.
     * 
     * @return DIST_RULE_PARAMETER1   * 分配公式的非典型参数
     */
    public java.lang.String getDIST_RULE_PARAMETER1() {
        return DIST_RULE_PARAMETER1;
    }


    /**
     * Sets the DIST_RULE_PARAMETER1 value for this DT_ContractSearchSub_CONDITION.
     * 
     * @param DIST_RULE_PARAMETER1   * 分配公式的非典型参数
     */
    public void setDIST_RULE_PARAMETER1(java.lang.String DIST_RULE_PARAMETER1) {
        this.DIST_RULE_PARAMETER1 = DIST_RULE_PARAMETER1;
    }


    /**
     * Gets the DIST_RULE_PARAMETER2 value for this DT_ContractSearchSub_CONDITION.
     * 
     * @return DIST_RULE_PARAMETER2   * 分配公式的非典型参数
     */
    public java.lang.String getDIST_RULE_PARAMETER2() {
        return DIST_RULE_PARAMETER2;
    }


    /**
     * Sets the DIST_RULE_PARAMETER2 value for this DT_ContractSearchSub_CONDITION.
     * 
     * @param DIST_RULE_PARAMETER2   * 分配公式的非典型参数
     */
    public void setDIST_RULE_PARAMETER2(java.lang.String DIST_RULE_PARAMETER2) {
        this.DIST_RULE_PARAMETER2 = DIST_RULE_PARAMETER2;
    }


    /**
     * Gets the EXTERNAL_PURPOSE value for this DT_ContractSearchSub_CONDITION.
     * 
     * @return EXTERNAL_PURPOSE   * 条件 - 外部目的
     */
    public java.lang.String getEXTERNAL_PURPOSE() {
        return EXTERNAL_PURPOSE;
    }


    /**
     * Sets the EXTERNAL_PURPOSE value for this DT_ContractSearchSub_CONDITION.
     * 
     * @param EXTERNAL_PURPOSE   * 条件 - 外部目的
     */
    public void setEXTERNAL_PURPOSE(java.lang.String EXTERNAL_PURPOSE) {
        this.EXTERNAL_PURPOSE = EXTERNAL_PURPOSE;
    }


    /**
     * Gets the NEXT_ADJUSTMENT_DATE value for this DT_ContractSearchSub_CONDITION.
     * 
     * @return NEXT_ADJUSTMENT_DATE   * 下一次可能调整的日期
     */
    public java.lang.String getNEXT_ADJUSTMENT_DATE() {
        return NEXT_ADJUSTMENT_DATE;
    }


    /**
     * Sets the NEXT_ADJUSTMENT_DATE value for this DT_ContractSearchSub_CONDITION.
     * 
     * @param NEXT_ADJUSTMENT_DATE   * 下一次可能调整的日期
     */
    public void setNEXT_ADJUSTMENT_DATE(java.lang.String NEXT_ADJUSTMENT_DATE) {
        this.NEXT_ADJUSTMENT_DATE = NEXT_ADJUSTMENT_DATE;
    }


    /**
     * Gets the REASON_FOR_CHANGE value for this DT_ContractSearchSub_CONDITION.
     * 
     * @return REASON_FOR_CHANGE   * 更改原因
     */
    public java.lang.String getREASON_FOR_CHANGE() {
        return REASON_FOR_CHANGE;
    }


    /**
     * Sets the REASON_FOR_CHANGE value for this DT_ContractSearchSub_CONDITION.
     * 
     * @param REASON_FOR_CHANGE   * 更改原因
     */
    public void setREASON_FOR_CHANGE(java.lang.String REASON_FOR_CHANGE) {
        this.REASON_FOR_CHANGE = REASON_FOR_CHANGE;
    }


    /**
     * Gets the IS_ONE_TIME value for this DT_ContractSearchSub_CONDITION.
     * 
     * @return IS_ONE_TIME   * 条件是一次性条件
     */
    public java.lang.String getIS_ONE_TIME() {
        return IS_ONE_TIME;
    }


    /**
     * Sets the IS_ONE_TIME value for this DT_ContractSearchSub_CONDITION.
     * 
     * @param IS_ONE_TIME   * 条件是一次性条件
     */
    public void setIS_ONE_TIME(java.lang.String IS_ONE_TIME) {
        this.IS_ONE_TIME = IS_ONE_TIME;
    }


    /**
     * Gets the IS_STATISTICAL value for this DT_ContractSearchSub_CONDITION.
     * 
     * @return IS_STATISTICAL   * 统计或信息条件
     */
    public java.lang.String getIS_STATISTICAL() {
        return IS_STATISTICAL;
    }


    /**
     * Sets the IS_STATISTICAL value for this DT_ContractSearchSub_CONDITION.
     * 
     * @param IS_STATISTICAL   * 统计或信息条件
     */
    public void setIS_STATISTICAL(java.lang.String IS_STATISTICAL) {
        this.IS_STATISTICAL = IS_STATISTICAL;
    }


    /**
     * Gets the POSTING_START_DATE value for this DT_ContractSearchSub_CONDITION.
     * 
     * @return POSTING_START_DATE   * 首次过帐从
     */
    public java.lang.String getPOSTING_START_DATE() {
        return POSTING_START_DATE;
    }


    /**
     * Sets the POSTING_START_DATE value for this DT_ContractSearchSub_CONDITION.
     * 
     * @param POSTING_START_DATE   * 首次过帐从
     */
    public void setPOSTING_START_DATE(java.lang.String POSTING_START_DATE) {
        this.POSTING_START_DATE = POSTING_START_DATE;
    }


    /**
     * Gets the TERM_NO_WITHHOLDING_TAX value for this DT_ContractSearchSub_CONDITION.
     * 
     * @return TERM_NO_WITHHOLDING_TAX   * 预扣税条款编号
     */
    public java.lang.String getTERM_NO_WITHHOLDING_TAX() {
        return TERM_NO_WITHHOLDING_TAX;
    }


    /**
     * Sets the TERM_NO_WITHHOLDING_TAX value for this DT_ContractSearchSub_CONDITION.
     * 
     * @param TERM_NO_WITHHOLDING_TAX   * 预扣税条款编号
     */
    public void setTERM_NO_WITHHOLDING_TAX(java.lang.String TERM_NO_WITHHOLDING_TAX) {
        this.TERM_NO_WITHHOLDING_TAX = TERM_NO_WITHHOLDING_TAX;
    }

    private java.lang.Object __equalsCalc = null;
    public synchronized boolean equals(java.lang.Object obj) {
        if (!(obj instanceof DT_ContractSearchSub_CONDITION)) return false;
        DT_ContractSearchSub_CONDITION other = (DT_ContractSearchSub_CONDITION) obj;
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
            ((this.DEFAULTS_ONLY==null && other.getDEFAULTS_ONLY()==null) || 
             (this.DEFAULTS_ONLY!=null &&
              this.DEFAULTS_ONLY.equals(other.getDEFAULTS_ONLY()))) &&
            ((this.CONDITION_TYPE==null && other.getCONDITION_TYPE()==null) || 
             (this.CONDITION_TYPE!=null &&
              this.CONDITION_TYPE.equals(other.getCONDITION_TYPE()))) &&
            ((this.CALCULATION_OBJECT_TYPE==null && other.getCALCULATION_OBJECT_TYPE()==null) || 
             (this.CALCULATION_OBJECT_TYPE!=null &&
              this.CALCULATION_OBJECT_TYPE.equals(other.getCALCULATION_OBJECT_TYPE()))) &&
            ((this.CALCULATION_OBJECT_ID==null && other.getCALCULATION_OBJECT_ID()==null) || 
             (this.CALCULATION_OBJECT_ID!=null &&
              this.CALCULATION_OBJECT_ID.equals(other.getCALCULATION_OBJECT_ID()))) &&
            ((this.DISTRIBUTION_OBJECT_TYPE==null && other.getDISTRIBUTION_OBJECT_TYPE()==null) || 
             (this.DISTRIBUTION_OBJECT_TYPE!=null &&
              this.DISTRIBUTION_OBJECT_TYPE.equals(other.getDISTRIBUTION_OBJECT_TYPE()))) &&
            ((this.DISTRIBUTION_OBJECT_ID==null && other.getDISTRIBUTION_OBJECT_ID()==null) || 
             (this.DISTRIBUTION_OBJECT_ID!=null &&
              this.DISTRIBUTION_OBJECT_ID.equals(other.getDISTRIBUTION_OBJECT_ID()))) &&
            ((this.VALID_FROM==null && other.getVALID_FROM()==null) || 
             (this.VALID_FROM!=null &&
              this.VALID_FROM.equals(other.getVALID_FROM()))) &&
            ((this.VALID_TO==null && other.getVALID_TO()==null) || 
             (this.VALID_TO!=null &&
              this.VALID_TO.equals(other.getVALID_TO()))) &&
            ((this.CURRENCY==null && other.getCURRENCY()==null) || 
             (this.CURRENCY!=null &&
              this.CURRENCY.equals(other.getCURRENCY()))) &&
            ((this.CURRENCY_ISO==null && other.getCURRENCY_ISO()==null) || 
             (this.CURRENCY_ISO!=null &&
              this.CURRENCY_ISO.equals(other.getCURRENCY_ISO()))) &&
            ((this.FOLLOW_UP_POSTING_DUE_DATE==null && other.getFOLLOW_UP_POSTING_DUE_DATE()==null) || 
             (this.FOLLOW_UP_POSTING_DUE_DATE!=null &&
              this.FOLLOW_UP_POSTING_DUE_DATE.equals(other.getFOLLOW_UP_POSTING_DUE_DATE()))) &&
            ((this.TERM_NO_PAYMENT==null && other.getTERM_NO_PAYMENT()==null) || 
             (this.TERM_NO_PAYMENT!=null &&
              this.TERM_NO_PAYMENT.equals(other.getTERM_NO_PAYMENT()))) &&
            ((this.TERM_NO_RHYTHM==null && other.getTERM_NO_RHYTHM()==null) || 
             (this.TERM_NO_RHYTHM!=null &&
              this.TERM_NO_RHYTHM.equals(other.getTERM_NO_RHYTHM()))) &&
            ((this.TERM_NO_ADJUSTMENT==null && other.getTERM_NO_ADJUSTMENT()==null) || 
             (this.TERM_NO_ADJUSTMENT!=null &&
              this.TERM_NO_ADJUSTMENT.equals(other.getTERM_NO_ADJUSTMENT()))) &&
            ((this.TERM_NO_ORG_ASSIGNMENT==null && other.getTERM_NO_ORG_ASSIGNMENT()==null) || 
             (this.TERM_NO_ORG_ASSIGNMENT!=null &&
              this.TERM_NO_ORG_ASSIGNMENT.equals(other.getTERM_NO_ORG_ASSIGNMENT()))) &&
            ((this.TERM_NO_SALES_RULE==null && other.getTERM_NO_SALES_RULE()==null) || 
             (this.TERM_NO_SALES_RULE!=null &&
              this.TERM_NO_SALES_RULE.equals(other.getTERM_NO_SALES_RULE()))) &&
            ((this.TERM_NO_MASTER_SALES_RULE==null && other.getTERM_NO_MASTER_SALES_RULE()==null) || 
             (this.TERM_NO_MASTER_SALES_RULE!=null &&
              this.TERM_NO_MASTER_SALES_RULE.equals(other.getTERM_NO_MASTER_SALES_RULE()))) &&
            ((this.UNIT_PRICE==null && other.getUNIT_PRICE()==null) || 
             (this.UNIT_PRICE!=null &&
              this.UNIT_PRICE.equals(other.getUNIT_PRICE()))) &&
            ((this.CALC_RULE==null && other.getCALC_RULE()==null) || 
             (this.CALC_RULE!=null &&
              this.CALC_RULE.equals(other.getCALC_RULE()))) &&
            ((this.CALC_RULE_PARAMETER1==null && other.getCALC_RULE_PARAMETER1()==null) || 
             (this.CALC_RULE_PARAMETER1!=null &&
              this.CALC_RULE_PARAMETER1.equals(other.getCALC_RULE_PARAMETER1()))) &&
            ((this.CALC_RULE_PARAMETER2==null && other.getCALC_RULE_PARAMETER2()==null) || 
             (this.CALC_RULE_PARAMETER2!=null &&
              this.CALC_RULE_PARAMETER2.equals(other.getCALC_RULE_PARAMETER2()))) &&
            ((this.DIST_RULE==null && other.getDIST_RULE()==null) || 
             (this.DIST_RULE!=null &&
              this.DIST_RULE.equals(other.getDIST_RULE()))) &&
            ((this.DIST_RULE_PARAMETER1==null && other.getDIST_RULE_PARAMETER1()==null) || 
             (this.DIST_RULE_PARAMETER1!=null &&
              this.DIST_RULE_PARAMETER1.equals(other.getDIST_RULE_PARAMETER1()))) &&
            ((this.DIST_RULE_PARAMETER2==null && other.getDIST_RULE_PARAMETER2()==null) || 
             (this.DIST_RULE_PARAMETER2!=null &&
              this.DIST_RULE_PARAMETER2.equals(other.getDIST_RULE_PARAMETER2()))) &&
            ((this.EXTERNAL_PURPOSE==null && other.getEXTERNAL_PURPOSE()==null) || 
             (this.EXTERNAL_PURPOSE!=null &&
              this.EXTERNAL_PURPOSE.equals(other.getEXTERNAL_PURPOSE()))) &&
            ((this.NEXT_ADJUSTMENT_DATE==null && other.getNEXT_ADJUSTMENT_DATE()==null) || 
             (this.NEXT_ADJUSTMENT_DATE!=null &&
              this.NEXT_ADJUSTMENT_DATE.equals(other.getNEXT_ADJUSTMENT_DATE()))) &&
            ((this.REASON_FOR_CHANGE==null && other.getREASON_FOR_CHANGE()==null) || 
             (this.REASON_FOR_CHANGE!=null &&
              this.REASON_FOR_CHANGE.equals(other.getREASON_FOR_CHANGE()))) &&
            ((this.IS_ONE_TIME==null && other.getIS_ONE_TIME()==null) || 
             (this.IS_ONE_TIME!=null &&
              this.IS_ONE_TIME.equals(other.getIS_ONE_TIME()))) &&
            ((this.IS_STATISTICAL==null && other.getIS_STATISTICAL()==null) || 
             (this.IS_STATISTICAL!=null &&
              this.IS_STATISTICAL.equals(other.getIS_STATISTICAL()))) &&
            ((this.POSTING_START_DATE==null && other.getPOSTING_START_DATE()==null) || 
             (this.POSTING_START_DATE!=null &&
              this.POSTING_START_DATE.equals(other.getPOSTING_START_DATE()))) &&
            ((this.TERM_NO_WITHHOLDING_TAX==null && other.getTERM_NO_WITHHOLDING_TAX()==null) || 
             (this.TERM_NO_WITHHOLDING_TAX!=null &&
              this.TERM_NO_WITHHOLDING_TAX.equals(other.getTERM_NO_WITHHOLDING_TAX())));
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
        if (getDEFAULTS_ONLY() != null) {
            _hashCode += getDEFAULTS_ONLY().hashCode();
        }
        if (getCONDITION_TYPE() != null) {
            _hashCode += getCONDITION_TYPE().hashCode();
        }
        if (getCALCULATION_OBJECT_TYPE() != null) {
            _hashCode += getCALCULATION_OBJECT_TYPE().hashCode();
        }
        if (getCALCULATION_OBJECT_ID() != null) {
            _hashCode += getCALCULATION_OBJECT_ID().hashCode();
        }
        if (getDISTRIBUTION_OBJECT_TYPE() != null) {
            _hashCode += getDISTRIBUTION_OBJECT_TYPE().hashCode();
        }
        if (getDISTRIBUTION_OBJECT_ID() != null) {
            _hashCode += getDISTRIBUTION_OBJECT_ID().hashCode();
        }
        if (getVALID_FROM() != null) {
            _hashCode += getVALID_FROM().hashCode();
        }
        if (getVALID_TO() != null) {
            _hashCode += getVALID_TO().hashCode();
        }
        if (getCURRENCY() != null) {
            _hashCode += getCURRENCY().hashCode();
        }
        if (getCURRENCY_ISO() != null) {
            _hashCode += getCURRENCY_ISO().hashCode();
        }
        if (getFOLLOW_UP_POSTING_DUE_DATE() != null) {
            _hashCode += getFOLLOW_UP_POSTING_DUE_DATE().hashCode();
        }
        if (getTERM_NO_PAYMENT() != null) {
            _hashCode += getTERM_NO_PAYMENT().hashCode();
        }
        if (getTERM_NO_RHYTHM() != null) {
            _hashCode += getTERM_NO_RHYTHM().hashCode();
        }
        if (getTERM_NO_ADJUSTMENT() != null) {
            _hashCode += getTERM_NO_ADJUSTMENT().hashCode();
        }
        if (getTERM_NO_ORG_ASSIGNMENT() != null) {
            _hashCode += getTERM_NO_ORG_ASSIGNMENT().hashCode();
        }
        if (getTERM_NO_SALES_RULE() != null) {
            _hashCode += getTERM_NO_SALES_RULE().hashCode();
        }
        if (getTERM_NO_MASTER_SALES_RULE() != null) {
            _hashCode += getTERM_NO_MASTER_SALES_RULE().hashCode();
        }
        if (getUNIT_PRICE() != null) {
            _hashCode += getUNIT_PRICE().hashCode();
        }
        if (getCALC_RULE() != null) {
            _hashCode += getCALC_RULE().hashCode();
        }
        if (getCALC_RULE_PARAMETER1() != null) {
            _hashCode += getCALC_RULE_PARAMETER1().hashCode();
        }
        if (getCALC_RULE_PARAMETER2() != null) {
            _hashCode += getCALC_RULE_PARAMETER2().hashCode();
        }
        if (getDIST_RULE() != null) {
            _hashCode += getDIST_RULE().hashCode();
        }
        if (getDIST_RULE_PARAMETER1() != null) {
            _hashCode += getDIST_RULE_PARAMETER1().hashCode();
        }
        if (getDIST_RULE_PARAMETER2() != null) {
            _hashCode += getDIST_RULE_PARAMETER2().hashCode();
        }
        if (getEXTERNAL_PURPOSE() != null) {
            _hashCode += getEXTERNAL_PURPOSE().hashCode();
        }
        if (getNEXT_ADJUSTMENT_DATE() != null) {
            _hashCode += getNEXT_ADJUSTMENT_DATE().hashCode();
        }
        if (getREASON_FOR_CHANGE() != null) {
            _hashCode += getREASON_FOR_CHANGE().hashCode();
        }
        if (getIS_ONE_TIME() != null) {
            _hashCode += getIS_ONE_TIME().hashCode();
        }
        if (getIS_STATISTICAL() != null) {
            _hashCode += getIS_STATISTICAL().hashCode();
        }
        if (getPOSTING_START_DATE() != null) {
            _hashCode += getPOSTING_START_DATE().hashCode();
        }
        if (getTERM_NO_WITHHOLDING_TAX() != null) {
            _hashCode += getTERM_NO_WITHHOLDING_TAX().hashCode();
        }
        __hashCodeCalc = false;
        return _hashCode;
    }

    // Type metadata
    private static org.apache.axis.description.TypeDesc typeDesc =
        new org.apache.axis.description.TypeDesc(DT_ContractSearchSub_CONDITION.class, true);

    static {
        typeDesc.setXmlType(new javax.xml.namespace.QName("urn:ecc:rvs:contract", "DT_ContractSearchSub_CONDITION"));
        org.apache.axis.description.ElementDesc elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("OBJECT_ID");
        elemField.setXmlName(new javax.xml.namespace.QName("", "OBJECT_ID"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("DEFAULTS_ONLY");
        elemField.setXmlName(new javax.xml.namespace.QName("", "DEFAULTS_ONLY"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("CONDITION_TYPE");
        elemField.setXmlName(new javax.xml.namespace.QName("", "CONDITION_TYPE"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("CALCULATION_OBJECT_TYPE");
        elemField.setXmlName(new javax.xml.namespace.QName("", "CALCULATION_OBJECT_TYPE"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("CALCULATION_OBJECT_ID");
        elemField.setXmlName(new javax.xml.namespace.QName("", "CALCULATION_OBJECT_ID"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("DISTRIBUTION_OBJECT_TYPE");
        elemField.setXmlName(new javax.xml.namespace.QName("", "DISTRIBUTION_OBJECT_TYPE"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("DISTRIBUTION_OBJECT_ID");
        elemField.setXmlName(new javax.xml.namespace.QName("", "DISTRIBUTION_OBJECT_ID"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("VALID_FROM");
        elemField.setXmlName(new javax.xml.namespace.QName("", "VALID_FROM"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("VALID_TO");
        elemField.setXmlName(new javax.xml.namespace.QName("", "VALID_TO"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("CURRENCY");
        elemField.setXmlName(new javax.xml.namespace.QName("", "CURRENCY"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("CURRENCY_ISO");
        elemField.setXmlName(new javax.xml.namespace.QName("", "CURRENCY_ISO"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("FOLLOW_UP_POSTING_DUE_DATE");
        elemField.setXmlName(new javax.xml.namespace.QName("", "FOLLOW_UP_POSTING_DUE_DATE"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("TERM_NO_PAYMENT");
        elemField.setXmlName(new javax.xml.namespace.QName("", "TERM_NO_PAYMENT"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("TERM_NO_RHYTHM");
        elemField.setXmlName(new javax.xml.namespace.QName("", "TERM_NO_RHYTHM"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("TERM_NO_ADJUSTMENT");
        elemField.setXmlName(new javax.xml.namespace.QName("", "TERM_NO_ADJUSTMENT"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("TERM_NO_ORG_ASSIGNMENT");
        elemField.setXmlName(new javax.xml.namespace.QName("", "TERM_NO_ORG_ASSIGNMENT"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("TERM_NO_SALES_RULE");
        elemField.setXmlName(new javax.xml.namespace.QName("", "TERM_NO_SALES_RULE"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("TERM_NO_MASTER_SALES_RULE");
        elemField.setXmlName(new javax.xml.namespace.QName("", "TERM_NO_MASTER_SALES_RULE"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("UNIT_PRICE");
        elemField.setXmlName(new javax.xml.namespace.QName("", "UNIT_PRICE"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("CALC_RULE");
        elemField.setXmlName(new javax.xml.namespace.QName("", "CALC_RULE"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("CALC_RULE_PARAMETER1");
        elemField.setXmlName(new javax.xml.namespace.QName("", "CALC_RULE_PARAMETER1"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("CALC_RULE_PARAMETER2");
        elemField.setXmlName(new javax.xml.namespace.QName("", "CALC_RULE_PARAMETER2"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("DIST_RULE");
        elemField.setXmlName(new javax.xml.namespace.QName("", "DIST_RULE"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("DIST_RULE_PARAMETER1");
        elemField.setXmlName(new javax.xml.namespace.QName("", "DIST_RULE_PARAMETER1"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("DIST_RULE_PARAMETER2");
        elemField.setXmlName(new javax.xml.namespace.QName("", "DIST_RULE_PARAMETER2"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("EXTERNAL_PURPOSE");
        elemField.setXmlName(new javax.xml.namespace.QName("", "EXTERNAL_PURPOSE"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("NEXT_ADJUSTMENT_DATE");
        elemField.setXmlName(new javax.xml.namespace.QName("", "NEXT_ADJUSTMENT_DATE"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("REASON_FOR_CHANGE");
        elemField.setXmlName(new javax.xml.namespace.QName("", "REASON_FOR_CHANGE"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("IS_ONE_TIME");
        elemField.setXmlName(new javax.xml.namespace.QName("", "IS_ONE_TIME"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("IS_STATISTICAL");
        elemField.setXmlName(new javax.xml.namespace.QName("", "IS_STATISTICAL"));
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
        elemField.setFieldName("TERM_NO_WITHHOLDING_TAX");
        elemField.setXmlName(new javax.xml.namespace.QName("", "TERM_NO_WITHHOLDING_TAX"));
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
