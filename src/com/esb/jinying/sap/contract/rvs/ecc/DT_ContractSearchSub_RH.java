/**
 * DT_ContractSearchSub_RH.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package com.esb.jinying.sap.contract.rvs.ecc;

public class DT_ContractSearchSub_RH  implements java.io.Serializable {
    /* 对象的标识 */
    private java.lang.String OBJECT_ID;

    /* 条款编号 */
    private java.lang.String TERM_NO;

    /* 条款名称 */
    private java.lang.String TERM_TEXT;

    /* 条款的生效日期 */
    private java.lang.String VALID_FROM;

    /* 条款的有效终止日期 */
    private java.lang.String VALID_TO;

    /* 期间频率单位的数量 */
    private java.lang.String FREQUENCY;

    /* 频率单位 */
    private java.lang.String FREQUENCY_UNIT;

    /* 每周频率周的开始 */
    private java.lang.String STARTING_WEEK;

    /* 每日,每月和每年频率的频率开始 */
    private java.lang.String STARTING_MONTH;

    /* 条件金额参考 */
    private java.lang.String CONDITION_AMOUNT_REF;

    /* 条件金额参考差异 */
    private java.lang.String CONDITION_AMOUNT_DIFF;

    /* 按比例的方法 */
    private java.lang.String PRO_RATA_METHOD;

    /* 时间相关期间的计算方法 */
    private java.lang.String PRO_RATA_METHOD_CALCULATION;

    /* 付款形式(期间开始,期间中,拖欠费,示例) */
    private java.lang.String PAYMENT_FORM;

    /* 用户选择频率开始日期 */
    private java.lang.String FREQUENCY_START;

    /* 到期日更正规则 */
    private java.lang.String DUE_DATE_CORR_RULE;

    /* 用来更正到期日的天数 */
    private java.lang.String DUE_DATE_CORR_DAY;

    /* 用于更正到期日的月数 */
    private java.lang.String DUE_DATE_CORR_MONTH;

    /* 用来更正到期日期的年数 */
    private java.lang.String DUE_DATE_CORR_YEAR;

    /* 按日历更正到期日的更正编号 */
    private java.lang.String DUE_DATE_CORR_CAL;

    /* 按日历更正到期日的单位 */
    private java.lang.String DUE_DATE_CORR_UNIT;

    /* 后勤日历 */
    private java.lang.String FACTORY_CALENDAR;

    /* 将到期日移到开始 */
    private java.lang.String DUE_DATE_MOVE_BEGIN;

    /* 将到期日移到结束 */
    private java.lang.String DUE_DATE_MOVE_END;

    /* 固定期间 */
    private java.lang.String FIXED_PERIOD;

    public DT_ContractSearchSub_RH() {
    }

    public DT_ContractSearchSub_RH(
           java.lang.String OBJECT_ID,
           java.lang.String TERM_NO,
           java.lang.String TERM_TEXT,
           java.lang.String VALID_FROM,
           java.lang.String VALID_TO,
           java.lang.String FREQUENCY,
           java.lang.String FREQUENCY_UNIT,
           java.lang.String STARTING_WEEK,
           java.lang.String STARTING_MONTH,
           java.lang.String CONDITION_AMOUNT_REF,
           java.lang.String CONDITION_AMOUNT_DIFF,
           java.lang.String PRO_RATA_METHOD,
           java.lang.String PRO_RATA_METHOD_CALCULATION,
           java.lang.String PAYMENT_FORM,
           java.lang.String FREQUENCY_START,
           java.lang.String DUE_DATE_CORR_RULE,
           java.lang.String DUE_DATE_CORR_DAY,
           java.lang.String DUE_DATE_CORR_MONTH,
           java.lang.String DUE_DATE_CORR_YEAR,
           java.lang.String DUE_DATE_CORR_CAL,
           java.lang.String DUE_DATE_CORR_UNIT,
           java.lang.String FACTORY_CALENDAR,
           java.lang.String DUE_DATE_MOVE_BEGIN,
           java.lang.String DUE_DATE_MOVE_END,
           java.lang.String FIXED_PERIOD) {
           this.OBJECT_ID = OBJECT_ID;
           this.TERM_NO = TERM_NO;
           this.TERM_TEXT = TERM_TEXT;
           this.VALID_FROM = VALID_FROM;
           this.VALID_TO = VALID_TO;
           this.FREQUENCY = FREQUENCY;
           this.FREQUENCY_UNIT = FREQUENCY_UNIT;
           this.STARTING_WEEK = STARTING_WEEK;
           this.STARTING_MONTH = STARTING_MONTH;
           this.CONDITION_AMOUNT_REF = CONDITION_AMOUNT_REF;
           this.CONDITION_AMOUNT_DIFF = CONDITION_AMOUNT_DIFF;
           this.PRO_RATA_METHOD = PRO_RATA_METHOD;
           this.PRO_RATA_METHOD_CALCULATION = PRO_RATA_METHOD_CALCULATION;
           this.PAYMENT_FORM = PAYMENT_FORM;
           this.FREQUENCY_START = FREQUENCY_START;
           this.DUE_DATE_CORR_RULE = DUE_DATE_CORR_RULE;
           this.DUE_DATE_CORR_DAY = DUE_DATE_CORR_DAY;
           this.DUE_DATE_CORR_MONTH = DUE_DATE_CORR_MONTH;
           this.DUE_DATE_CORR_YEAR = DUE_DATE_CORR_YEAR;
           this.DUE_DATE_CORR_CAL = DUE_DATE_CORR_CAL;
           this.DUE_DATE_CORR_UNIT = DUE_DATE_CORR_UNIT;
           this.FACTORY_CALENDAR = FACTORY_CALENDAR;
           this.DUE_DATE_MOVE_BEGIN = DUE_DATE_MOVE_BEGIN;
           this.DUE_DATE_MOVE_END = DUE_DATE_MOVE_END;
           this.FIXED_PERIOD = FIXED_PERIOD;
    }


    /**
     * Gets the OBJECT_ID value for this DT_ContractSearchSub_RH.
     * 
     * @return OBJECT_ID   * 对象的标识
     */
    public java.lang.String getOBJECT_ID() {
        return OBJECT_ID;
    }


    /**
     * Sets the OBJECT_ID value for this DT_ContractSearchSub_RH.
     * 
     * @param OBJECT_ID   * 对象的标识
     */
    public void setOBJECT_ID(java.lang.String OBJECT_ID) {
        this.OBJECT_ID = OBJECT_ID;
    }


    /**
     * Gets the TERM_NO value for this DT_ContractSearchSub_RH.
     * 
     * @return TERM_NO   * 条款编号
     */
    public java.lang.String getTERM_NO() {
        return TERM_NO;
    }


    /**
     * Sets the TERM_NO value for this DT_ContractSearchSub_RH.
     * 
     * @param TERM_NO   * 条款编号
     */
    public void setTERM_NO(java.lang.String TERM_NO) {
        this.TERM_NO = TERM_NO;
    }


    /**
     * Gets the TERM_TEXT value for this DT_ContractSearchSub_RH.
     * 
     * @return TERM_TEXT   * 条款名称
     */
    public java.lang.String getTERM_TEXT() {
        return TERM_TEXT;
    }


    /**
     * Sets the TERM_TEXT value for this DT_ContractSearchSub_RH.
     * 
     * @param TERM_TEXT   * 条款名称
     */
    public void setTERM_TEXT(java.lang.String TERM_TEXT) {
        this.TERM_TEXT = TERM_TEXT;
    }


    /**
     * Gets the VALID_FROM value for this DT_ContractSearchSub_RH.
     * 
     * @return VALID_FROM   * 条款的生效日期
     */
    public java.lang.String getVALID_FROM() {
        return VALID_FROM;
    }


    /**
     * Sets the VALID_FROM value for this DT_ContractSearchSub_RH.
     * 
     * @param VALID_FROM   * 条款的生效日期
     */
    public void setVALID_FROM(java.lang.String VALID_FROM) {
        this.VALID_FROM = VALID_FROM;
    }


    /**
     * Gets the VALID_TO value for this DT_ContractSearchSub_RH.
     * 
     * @return VALID_TO   * 条款的有效终止日期
     */
    public java.lang.String getVALID_TO() {
        return VALID_TO;
    }


    /**
     * Sets the VALID_TO value for this DT_ContractSearchSub_RH.
     * 
     * @param VALID_TO   * 条款的有效终止日期
     */
    public void setVALID_TO(java.lang.String VALID_TO) {
        this.VALID_TO = VALID_TO;
    }


    /**
     * Gets the FREQUENCY value for this DT_ContractSearchSub_RH.
     * 
     * @return FREQUENCY   * 期间频率单位的数量
     */
    public java.lang.String getFREQUENCY() {
        return FREQUENCY;
    }


    /**
     * Sets the FREQUENCY value for this DT_ContractSearchSub_RH.
     * 
     * @param FREQUENCY   * 期间频率单位的数量
     */
    public void setFREQUENCY(java.lang.String FREQUENCY) {
        this.FREQUENCY = FREQUENCY;
    }


    /**
     * Gets the FREQUENCY_UNIT value for this DT_ContractSearchSub_RH.
     * 
     * @return FREQUENCY_UNIT   * 频率单位
     */
    public java.lang.String getFREQUENCY_UNIT() {
        return FREQUENCY_UNIT;
    }


    /**
     * Sets the FREQUENCY_UNIT value for this DT_ContractSearchSub_RH.
     * 
     * @param FREQUENCY_UNIT   * 频率单位
     */
    public void setFREQUENCY_UNIT(java.lang.String FREQUENCY_UNIT) {
        this.FREQUENCY_UNIT = FREQUENCY_UNIT;
    }


    /**
     * Gets the STARTING_WEEK value for this DT_ContractSearchSub_RH.
     * 
     * @return STARTING_WEEK   * 每周频率周的开始
     */
    public java.lang.String getSTARTING_WEEK() {
        return STARTING_WEEK;
    }


    /**
     * Sets the STARTING_WEEK value for this DT_ContractSearchSub_RH.
     * 
     * @param STARTING_WEEK   * 每周频率周的开始
     */
    public void setSTARTING_WEEK(java.lang.String STARTING_WEEK) {
        this.STARTING_WEEK = STARTING_WEEK;
    }


    /**
     * Gets the STARTING_MONTH value for this DT_ContractSearchSub_RH.
     * 
     * @return STARTING_MONTH   * 每日,每月和每年频率的频率开始
     */
    public java.lang.String getSTARTING_MONTH() {
        return STARTING_MONTH;
    }


    /**
     * Sets the STARTING_MONTH value for this DT_ContractSearchSub_RH.
     * 
     * @param STARTING_MONTH   * 每日,每月和每年频率的频率开始
     */
    public void setSTARTING_MONTH(java.lang.String STARTING_MONTH) {
        this.STARTING_MONTH = STARTING_MONTH;
    }


    /**
     * Gets the CONDITION_AMOUNT_REF value for this DT_ContractSearchSub_RH.
     * 
     * @return CONDITION_AMOUNT_REF   * 条件金额参考
     */
    public java.lang.String getCONDITION_AMOUNT_REF() {
        return CONDITION_AMOUNT_REF;
    }


    /**
     * Sets the CONDITION_AMOUNT_REF value for this DT_ContractSearchSub_RH.
     * 
     * @param CONDITION_AMOUNT_REF   * 条件金额参考
     */
    public void setCONDITION_AMOUNT_REF(java.lang.String CONDITION_AMOUNT_REF) {
        this.CONDITION_AMOUNT_REF = CONDITION_AMOUNT_REF;
    }


    /**
     * Gets the CONDITION_AMOUNT_DIFF value for this DT_ContractSearchSub_RH.
     * 
     * @return CONDITION_AMOUNT_DIFF   * 条件金额参考差异
     */
    public java.lang.String getCONDITION_AMOUNT_DIFF() {
        return CONDITION_AMOUNT_DIFF;
    }


    /**
     * Sets the CONDITION_AMOUNT_DIFF value for this DT_ContractSearchSub_RH.
     * 
     * @param CONDITION_AMOUNT_DIFF   * 条件金额参考差异
     */
    public void setCONDITION_AMOUNT_DIFF(java.lang.String CONDITION_AMOUNT_DIFF) {
        this.CONDITION_AMOUNT_DIFF = CONDITION_AMOUNT_DIFF;
    }


    /**
     * Gets the PRO_RATA_METHOD value for this DT_ContractSearchSub_RH.
     * 
     * @return PRO_RATA_METHOD   * 按比例的方法
     */
    public java.lang.String getPRO_RATA_METHOD() {
        return PRO_RATA_METHOD;
    }


    /**
     * Sets the PRO_RATA_METHOD value for this DT_ContractSearchSub_RH.
     * 
     * @param PRO_RATA_METHOD   * 按比例的方法
     */
    public void setPRO_RATA_METHOD(java.lang.String PRO_RATA_METHOD) {
        this.PRO_RATA_METHOD = PRO_RATA_METHOD;
    }


    /**
     * Gets the PRO_RATA_METHOD_CALCULATION value for this DT_ContractSearchSub_RH.
     * 
     * @return PRO_RATA_METHOD_CALCULATION   * 时间相关期间的计算方法
     */
    public java.lang.String getPRO_RATA_METHOD_CALCULATION() {
        return PRO_RATA_METHOD_CALCULATION;
    }


    /**
     * Sets the PRO_RATA_METHOD_CALCULATION value for this DT_ContractSearchSub_RH.
     * 
     * @param PRO_RATA_METHOD_CALCULATION   * 时间相关期间的计算方法
     */
    public void setPRO_RATA_METHOD_CALCULATION(java.lang.String PRO_RATA_METHOD_CALCULATION) {
        this.PRO_RATA_METHOD_CALCULATION = PRO_RATA_METHOD_CALCULATION;
    }


    /**
     * Gets the PAYMENT_FORM value for this DT_ContractSearchSub_RH.
     * 
     * @return PAYMENT_FORM   * 付款形式(期间开始,期间中,拖欠费,示例)
     */
    public java.lang.String getPAYMENT_FORM() {
        return PAYMENT_FORM;
    }


    /**
     * Sets the PAYMENT_FORM value for this DT_ContractSearchSub_RH.
     * 
     * @param PAYMENT_FORM   * 付款形式(期间开始,期间中,拖欠费,示例)
     */
    public void setPAYMENT_FORM(java.lang.String PAYMENT_FORM) {
        this.PAYMENT_FORM = PAYMENT_FORM;
    }


    /**
     * Gets the FREQUENCY_START value for this DT_ContractSearchSub_RH.
     * 
     * @return FREQUENCY_START   * 用户选择频率开始日期
     */
    public java.lang.String getFREQUENCY_START() {
        return FREQUENCY_START;
    }


    /**
     * Sets the FREQUENCY_START value for this DT_ContractSearchSub_RH.
     * 
     * @param FREQUENCY_START   * 用户选择频率开始日期
     */
    public void setFREQUENCY_START(java.lang.String FREQUENCY_START) {
        this.FREQUENCY_START = FREQUENCY_START;
    }


    /**
     * Gets the DUE_DATE_CORR_RULE value for this DT_ContractSearchSub_RH.
     * 
     * @return DUE_DATE_CORR_RULE   * 到期日更正规则
     */
    public java.lang.String getDUE_DATE_CORR_RULE() {
        return DUE_DATE_CORR_RULE;
    }


    /**
     * Sets the DUE_DATE_CORR_RULE value for this DT_ContractSearchSub_RH.
     * 
     * @param DUE_DATE_CORR_RULE   * 到期日更正规则
     */
    public void setDUE_DATE_CORR_RULE(java.lang.String DUE_DATE_CORR_RULE) {
        this.DUE_DATE_CORR_RULE = DUE_DATE_CORR_RULE;
    }


    /**
     * Gets the DUE_DATE_CORR_DAY value for this DT_ContractSearchSub_RH.
     * 
     * @return DUE_DATE_CORR_DAY   * 用来更正到期日的天数
     */
    public java.lang.String getDUE_DATE_CORR_DAY() {
        return DUE_DATE_CORR_DAY;
    }


    /**
     * Sets the DUE_DATE_CORR_DAY value for this DT_ContractSearchSub_RH.
     * 
     * @param DUE_DATE_CORR_DAY   * 用来更正到期日的天数
     */
    public void setDUE_DATE_CORR_DAY(java.lang.String DUE_DATE_CORR_DAY) {
        this.DUE_DATE_CORR_DAY = DUE_DATE_CORR_DAY;
    }


    /**
     * Gets the DUE_DATE_CORR_MONTH value for this DT_ContractSearchSub_RH.
     * 
     * @return DUE_DATE_CORR_MONTH   * 用于更正到期日的月数
     */
    public java.lang.String getDUE_DATE_CORR_MONTH() {
        return DUE_DATE_CORR_MONTH;
    }


    /**
     * Sets the DUE_DATE_CORR_MONTH value for this DT_ContractSearchSub_RH.
     * 
     * @param DUE_DATE_CORR_MONTH   * 用于更正到期日的月数
     */
    public void setDUE_DATE_CORR_MONTH(java.lang.String DUE_DATE_CORR_MONTH) {
        this.DUE_DATE_CORR_MONTH = DUE_DATE_CORR_MONTH;
    }


    /**
     * Gets the DUE_DATE_CORR_YEAR value for this DT_ContractSearchSub_RH.
     * 
     * @return DUE_DATE_CORR_YEAR   * 用来更正到期日期的年数
     */
    public java.lang.String getDUE_DATE_CORR_YEAR() {
        return DUE_DATE_CORR_YEAR;
    }


    /**
     * Sets the DUE_DATE_CORR_YEAR value for this DT_ContractSearchSub_RH.
     * 
     * @param DUE_DATE_CORR_YEAR   * 用来更正到期日期的年数
     */
    public void setDUE_DATE_CORR_YEAR(java.lang.String DUE_DATE_CORR_YEAR) {
        this.DUE_DATE_CORR_YEAR = DUE_DATE_CORR_YEAR;
    }


    /**
     * Gets the DUE_DATE_CORR_CAL value for this DT_ContractSearchSub_RH.
     * 
     * @return DUE_DATE_CORR_CAL   * 按日历更正到期日的更正编号
     */
    public java.lang.String getDUE_DATE_CORR_CAL() {
        return DUE_DATE_CORR_CAL;
    }


    /**
     * Sets the DUE_DATE_CORR_CAL value for this DT_ContractSearchSub_RH.
     * 
     * @param DUE_DATE_CORR_CAL   * 按日历更正到期日的更正编号
     */
    public void setDUE_DATE_CORR_CAL(java.lang.String DUE_DATE_CORR_CAL) {
        this.DUE_DATE_CORR_CAL = DUE_DATE_CORR_CAL;
    }


    /**
     * Gets the DUE_DATE_CORR_UNIT value for this DT_ContractSearchSub_RH.
     * 
     * @return DUE_DATE_CORR_UNIT   * 按日历更正到期日的单位
     */
    public java.lang.String getDUE_DATE_CORR_UNIT() {
        return DUE_DATE_CORR_UNIT;
    }


    /**
     * Sets the DUE_DATE_CORR_UNIT value for this DT_ContractSearchSub_RH.
     * 
     * @param DUE_DATE_CORR_UNIT   * 按日历更正到期日的单位
     */
    public void setDUE_DATE_CORR_UNIT(java.lang.String DUE_DATE_CORR_UNIT) {
        this.DUE_DATE_CORR_UNIT = DUE_DATE_CORR_UNIT;
    }


    /**
     * Gets the FACTORY_CALENDAR value for this DT_ContractSearchSub_RH.
     * 
     * @return FACTORY_CALENDAR   * 后勤日历
     */
    public java.lang.String getFACTORY_CALENDAR() {
        return FACTORY_CALENDAR;
    }


    /**
     * Sets the FACTORY_CALENDAR value for this DT_ContractSearchSub_RH.
     * 
     * @param FACTORY_CALENDAR   * 后勤日历
     */
    public void setFACTORY_CALENDAR(java.lang.String FACTORY_CALENDAR) {
        this.FACTORY_CALENDAR = FACTORY_CALENDAR;
    }


    /**
     * Gets the DUE_DATE_MOVE_BEGIN value for this DT_ContractSearchSub_RH.
     * 
     * @return DUE_DATE_MOVE_BEGIN   * 将到期日移到开始
     */
    public java.lang.String getDUE_DATE_MOVE_BEGIN() {
        return DUE_DATE_MOVE_BEGIN;
    }


    /**
     * Sets the DUE_DATE_MOVE_BEGIN value for this DT_ContractSearchSub_RH.
     * 
     * @param DUE_DATE_MOVE_BEGIN   * 将到期日移到开始
     */
    public void setDUE_DATE_MOVE_BEGIN(java.lang.String DUE_DATE_MOVE_BEGIN) {
        this.DUE_DATE_MOVE_BEGIN = DUE_DATE_MOVE_BEGIN;
    }


    /**
     * Gets the DUE_DATE_MOVE_END value for this DT_ContractSearchSub_RH.
     * 
     * @return DUE_DATE_MOVE_END   * 将到期日移到结束
     */
    public java.lang.String getDUE_DATE_MOVE_END() {
        return DUE_DATE_MOVE_END;
    }


    /**
     * Sets the DUE_DATE_MOVE_END value for this DT_ContractSearchSub_RH.
     * 
     * @param DUE_DATE_MOVE_END   * 将到期日移到结束
     */
    public void setDUE_DATE_MOVE_END(java.lang.String DUE_DATE_MOVE_END) {
        this.DUE_DATE_MOVE_END = DUE_DATE_MOVE_END;
    }


    /**
     * Gets the FIXED_PERIOD value for this DT_ContractSearchSub_RH.
     * 
     * @return FIXED_PERIOD   * 固定期间
     */
    public java.lang.String getFIXED_PERIOD() {
        return FIXED_PERIOD;
    }


    /**
     * Sets the FIXED_PERIOD value for this DT_ContractSearchSub_RH.
     * 
     * @param FIXED_PERIOD   * 固定期间
     */
    public void setFIXED_PERIOD(java.lang.String FIXED_PERIOD) {
        this.FIXED_PERIOD = FIXED_PERIOD;
    }

    private java.lang.Object __equalsCalc = null;
    public synchronized boolean equals(java.lang.Object obj) {
        if (!(obj instanceof DT_ContractSearchSub_RH)) return false;
        DT_ContractSearchSub_RH other = (DT_ContractSearchSub_RH) obj;
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
            ((this.TERM_NO==null && other.getTERM_NO()==null) || 
             (this.TERM_NO!=null &&
              this.TERM_NO.equals(other.getTERM_NO()))) &&
            ((this.TERM_TEXT==null && other.getTERM_TEXT()==null) || 
             (this.TERM_TEXT!=null &&
              this.TERM_TEXT.equals(other.getTERM_TEXT()))) &&
            ((this.VALID_FROM==null && other.getVALID_FROM()==null) || 
             (this.VALID_FROM!=null &&
              this.VALID_FROM.equals(other.getVALID_FROM()))) &&
            ((this.VALID_TO==null && other.getVALID_TO()==null) || 
             (this.VALID_TO!=null &&
              this.VALID_TO.equals(other.getVALID_TO()))) &&
            ((this.FREQUENCY==null && other.getFREQUENCY()==null) || 
             (this.FREQUENCY!=null &&
              this.FREQUENCY.equals(other.getFREQUENCY()))) &&
            ((this.FREQUENCY_UNIT==null && other.getFREQUENCY_UNIT()==null) || 
             (this.FREQUENCY_UNIT!=null &&
              this.FREQUENCY_UNIT.equals(other.getFREQUENCY_UNIT()))) &&
            ((this.STARTING_WEEK==null && other.getSTARTING_WEEK()==null) || 
             (this.STARTING_WEEK!=null &&
              this.STARTING_WEEK.equals(other.getSTARTING_WEEK()))) &&
            ((this.STARTING_MONTH==null && other.getSTARTING_MONTH()==null) || 
             (this.STARTING_MONTH!=null &&
              this.STARTING_MONTH.equals(other.getSTARTING_MONTH()))) &&
            ((this.CONDITION_AMOUNT_REF==null && other.getCONDITION_AMOUNT_REF()==null) || 
             (this.CONDITION_AMOUNT_REF!=null &&
              this.CONDITION_AMOUNT_REF.equals(other.getCONDITION_AMOUNT_REF()))) &&
            ((this.CONDITION_AMOUNT_DIFF==null && other.getCONDITION_AMOUNT_DIFF()==null) || 
             (this.CONDITION_AMOUNT_DIFF!=null &&
              this.CONDITION_AMOUNT_DIFF.equals(other.getCONDITION_AMOUNT_DIFF()))) &&
            ((this.PRO_RATA_METHOD==null && other.getPRO_RATA_METHOD()==null) || 
             (this.PRO_RATA_METHOD!=null &&
              this.PRO_RATA_METHOD.equals(other.getPRO_RATA_METHOD()))) &&
            ((this.PRO_RATA_METHOD_CALCULATION==null && other.getPRO_RATA_METHOD_CALCULATION()==null) || 
             (this.PRO_RATA_METHOD_CALCULATION!=null &&
              this.PRO_RATA_METHOD_CALCULATION.equals(other.getPRO_RATA_METHOD_CALCULATION()))) &&
            ((this.PAYMENT_FORM==null && other.getPAYMENT_FORM()==null) || 
             (this.PAYMENT_FORM!=null &&
              this.PAYMENT_FORM.equals(other.getPAYMENT_FORM()))) &&
            ((this.FREQUENCY_START==null && other.getFREQUENCY_START()==null) || 
             (this.FREQUENCY_START!=null &&
              this.FREQUENCY_START.equals(other.getFREQUENCY_START()))) &&
            ((this.DUE_DATE_CORR_RULE==null && other.getDUE_DATE_CORR_RULE()==null) || 
             (this.DUE_DATE_CORR_RULE!=null &&
              this.DUE_DATE_CORR_RULE.equals(other.getDUE_DATE_CORR_RULE()))) &&
            ((this.DUE_DATE_CORR_DAY==null && other.getDUE_DATE_CORR_DAY()==null) || 
             (this.DUE_DATE_CORR_DAY!=null &&
              this.DUE_DATE_CORR_DAY.equals(other.getDUE_DATE_CORR_DAY()))) &&
            ((this.DUE_DATE_CORR_MONTH==null && other.getDUE_DATE_CORR_MONTH()==null) || 
             (this.DUE_DATE_CORR_MONTH!=null &&
              this.DUE_DATE_CORR_MONTH.equals(other.getDUE_DATE_CORR_MONTH()))) &&
            ((this.DUE_DATE_CORR_YEAR==null && other.getDUE_DATE_CORR_YEAR()==null) || 
             (this.DUE_DATE_CORR_YEAR!=null &&
              this.DUE_DATE_CORR_YEAR.equals(other.getDUE_DATE_CORR_YEAR()))) &&
            ((this.DUE_DATE_CORR_CAL==null && other.getDUE_DATE_CORR_CAL()==null) || 
             (this.DUE_DATE_CORR_CAL!=null &&
              this.DUE_DATE_CORR_CAL.equals(other.getDUE_DATE_CORR_CAL()))) &&
            ((this.DUE_DATE_CORR_UNIT==null && other.getDUE_DATE_CORR_UNIT()==null) || 
             (this.DUE_DATE_CORR_UNIT!=null &&
              this.DUE_DATE_CORR_UNIT.equals(other.getDUE_DATE_CORR_UNIT()))) &&
            ((this.FACTORY_CALENDAR==null && other.getFACTORY_CALENDAR()==null) || 
             (this.FACTORY_CALENDAR!=null &&
              this.FACTORY_CALENDAR.equals(other.getFACTORY_CALENDAR()))) &&
            ((this.DUE_DATE_MOVE_BEGIN==null && other.getDUE_DATE_MOVE_BEGIN()==null) || 
             (this.DUE_DATE_MOVE_BEGIN!=null &&
              this.DUE_DATE_MOVE_BEGIN.equals(other.getDUE_DATE_MOVE_BEGIN()))) &&
            ((this.DUE_DATE_MOVE_END==null && other.getDUE_DATE_MOVE_END()==null) || 
             (this.DUE_DATE_MOVE_END!=null &&
              this.DUE_DATE_MOVE_END.equals(other.getDUE_DATE_MOVE_END()))) &&
            ((this.FIXED_PERIOD==null && other.getFIXED_PERIOD()==null) || 
             (this.FIXED_PERIOD!=null &&
              this.FIXED_PERIOD.equals(other.getFIXED_PERIOD())));
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
        if (getTERM_NO() != null) {
            _hashCode += getTERM_NO().hashCode();
        }
        if (getTERM_TEXT() != null) {
            _hashCode += getTERM_TEXT().hashCode();
        }
        if (getVALID_FROM() != null) {
            _hashCode += getVALID_FROM().hashCode();
        }
        if (getVALID_TO() != null) {
            _hashCode += getVALID_TO().hashCode();
        }
        if (getFREQUENCY() != null) {
            _hashCode += getFREQUENCY().hashCode();
        }
        if (getFREQUENCY_UNIT() != null) {
            _hashCode += getFREQUENCY_UNIT().hashCode();
        }
        if (getSTARTING_WEEK() != null) {
            _hashCode += getSTARTING_WEEK().hashCode();
        }
        if (getSTARTING_MONTH() != null) {
            _hashCode += getSTARTING_MONTH().hashCode();
        }
        if (getCONDITION_AMOUNT_REF() != null) {
            _hashCode += getCONDITION_AMOUNT_REF().hashCode();
        }
        if (getCONDITION_AMOUNT_DIFF() != null) {
            _hashCode += getCONDITION_AMOUNT_DIFF().hashCode();
        }
        if (getPRO_RATA_METHOD() != null) {
            _hashCode += getPRO_RATA_METHOD().hashCode();
        }
        if (getPRO_RATA_METHOD_CALCULATION() != null) {
            _hashCode += getPRO_RATA_METHOD_CALCULATION().hashCode();
        }
        if (getPAYMENT_FORM() != null) {
            _hashCode += getPAYMENT_FORM().hashCode();
        }
        if (getFREQUENCY_START() != null) {
            _hashCode += getFREQUENCY_START().hashCode();
        }
        if (getDUE_DATE_CORR_RULE() != null) {
            _hashCode += getDUE_DATE_CORR_RULE().hashCode();
        }
        if (getDUE_DATE_CORR_DAY() != null) {
            _hashCode += getDUE_DATE_CORR_DAY().hashCode();
        }
        if (getDUE_DATE_CORR_MONTH() != null) {
            _hashCode += getDUE_DATE_CORR_MONTH().hashCode();
        }
        if (getDUE_DATE_CORR_YEAR() != null) {
            _hashCode += getDUE_DATE_CORR_YEAR().hashCode();
        }
        if (getDUE_DATE_CORR_CAL() != null) {
            _hashCode += getDUE_DATE_CORR_CAL().hashCode();
        }
        if (getDUE_DATE_CORR_UNIT() != null) {
            _hashCode += getDUE_DATE_CORR_UNIT().hashCode();
        }
        if (getFACTORY_CALENDAR() != null) {
            _hashCode += getFACTORY_CALENDAR().hashCode();
        }
        if (getDUE_DATE_MOVE_BEGIN() != null) {
            _hashCode += getDUE_DATE_MOVE_BEGIN().hashCode();
        }
        if (getDUE_DATE_MOVE_END() != null) {
            _hashCode += getDUE_DATE_MOVE_END().hashCode();
        }
        if (getFIXED_PERIOD() != null) {
            _hashCode += getFIXED_PERIOD().hashCode();
        }
        __hashCodeCalc = false;
        return _hashCode;
    }

    // Type metadata
    private static org.apache.axis.description.TypeDesc typeDesc =
        new org.apache.axis.description.TypeDesc(DT_ContractSearchSub_RH.class, true);

    static {
        typeDesc.setXmlType(new javax.xml.namespace.QName("urn:ecc:rvs:contract", "DT_ContractSearchSub_RH"));
        org.apache.axis.description.ElementDesc elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("OBJECT_ID");
        elemField.setXmlName(new javax.xml.namespace.QName("", "OBJECT_ID"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("TERM_NO");
        elemField.setXmlName(new javax.xml.namespace.QName("", "TERM_NO"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("TERM_TEXT");
        elemField.setXmlName(new javax.xml.namespace.QName("", "TERM_TEXT"));
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
        elemField.setFieldName("FREQUENCY");
        elemField.setXmlName(new javax.xml.namespace.QName("", "FREQUENCY"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("FREQUENCY_UNIT");
        elemField.setXmlName(new javax.xml.namespace.QName("", "FREQUENCY_UNIT"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("STARTING_WEEK");
        elemField.setXmlName(new javax.xml.namespace.QName("", "STARTING_WEEK"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("STARTING_MONTH");
        elemField.setXmlName(new javax.xml.namespace.QName("", "STARTING_MONTH"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("CONDITION_AMOUNT_REF");
        elemField.setXmlName(new javax.xml.namespace.QName("", "CONDITION_AMOUNT_REF"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("CONDITION_AMOUNT_DIFF");
        elemField.setXmlName(new javax.xml.namespace.QName("", "CONDITION_AMOUNT_DIFF"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("PRO_RATA_METHOD");
        elemField.setXmlName(new javax.xml.namespace.QName("", "PRO_RATA_METHOD"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("PRO_RATA_METHOD_CALCULATION");
        elemField.setXmlName(new javax.xml.namespace.QName("", "PRO_RATA_METHOD_CALCULATION"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("PAYMENT_FORM");
        elemField.setXmlName(new javax.xml.namespace.QName("", "PAYMENT_FORM"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("FREQUENCY_START");
        elemField.setXmlName(new javax.xml.namespace.QName("", "FREQUENCY_START"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("DUE_DATE_CORR_RULE");
        elemField.setXmlName(new javax.xml.namespace.QName("", "DUE_DATE_CORR_RULE"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("DUE_DATE_CORR_DAY");
        elemField.setXmlName(new javax.xml.namespace.QName("", "DUE_DATE_CORR_DAY"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("DUE_DATE_CORR_MONTH");
        elemField.setXmlName(new javax.xml.namespace.QName("", "DUE_DATE_CORR_MONTH"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("DUE_DATE_CORR_YEAR");
        elemField.setXmlName(new javax.xml.namespace.QName("", "DUE_DATE_CORR_YEAR"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("DUE_DATE_CORR_CAL");
        elemField.setXmlName(new javax.xml.namespace.QName("", "DUE_DATE_CORR_CAL"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("DUE_DATE_CORR_UNIT");
        elemField.setXmlName(new javax.xml.namespace.QName("", "DUE_DATE_CORR_UNIT"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("FACTORY_CALENDAR");
        elemField.setXmlName(new javax.xml.namespace.QName("", "FACTORY_CALENDAR"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("DUE_DATE_MOVE_BEGIN");
        elemField.setXmlName(new javax.xml.namespace.QName("", "DUE_DATE_MOVE_BEGIN"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("DUE_DATE_MOVE_END");
        elemField.setXmlName(new javax.xml.namespace.QName("", "DUE_DATE_MOVE_END"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("FIXED_PERIOD");
        elemField.setXmlName(new javax.xml.namespace.QName("", "FIXED_PERIOD"));
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
