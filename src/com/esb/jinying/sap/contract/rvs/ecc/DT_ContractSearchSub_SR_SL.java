/**
 * DT_ContractSearchSub_SR_SL.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package com.esb.jinying.sap.contract.rvs.ecc;

public class DT_ContractSearchSub_SR_SL  implements java.io.Serializable {
    /* 对象的标识 */
    private java.lang.String OBJECT_ID;

    /* 条款编号 */
    private java.lang.String TERM_NO;

    /* 条款的生效日期 */
    private java.lang.String VALID_FROM;

    /* 条款的有效终止日期 */
    private java.lang.String VALID_TO;

    /* 条款名称 */
    private java.lang.String TERM_TEXT;

    /* 销售规则类型 */
    private java.lang.String SALES_RULE_TYPE;

    /* 报告规则的期限编号 */
    private java.lang.String TERM_NO_REPORT_RULE;

    /* 哪些销售应该用于计算 */
    private java.lang.String SALES_FOR_CALCULATION;

    /* 结算期间中的最低货币销售 */
    private java.lang.String MIN_MONETARY_SALES;

    /* 结算期间中的最大(货币)销售 */
    private java.lang.String MAX_MONETARY_SALES;

    /* 货币码 */
    private java.lang.String CURRENCY_SALES;

    /* ISO 货币码 */
    private java.lang.String CURRENCY_SALES_ISO;

    /* 结算期间中的最小定量销售 */
    private java.lang.String MIN_QUANTITATIVE_SALES;

    /* 销售期间中的最大定量销售 */
    private java.lang.String MAX_QUANTITATIVE_SALES;

    /* 销售报告价值的计量单位 */
    private java.lang.String UNIT_SALES;

    /* 计量单位的 ISO 代码 */
    private java.lang.String UNIT_SALES_ISO;

    /* 每计量单位的价格是净价还是总价 */
    private java.lang.String UNIT_PRICE_GROSS_NET;

    /* 销售金额和百分比的顺序编号 */
    private java.lang.String GRADING_ITEM_NO;

    /* 销售(最小) */
    private java.lang.String GRADING_MON_SALES_FROM;

    /* 销售(最大) */
    private java.lang.String GRADING_MON_SALES_TO;

    /* 作为租赁的销售百分比 */
    private java.lang.String PERC_SALES_AS_RENT;

    /* 定量销售(最小) */
    private java.lang.String GRADING_QUAN_SALES_FROM;

    /* 定量销售(最大) */
    private java.lang.String GRADING_QUAN_SALES_TO;

    /* 每个计量单位的金额 */
    private java.lang.String PRICE_PER_UNIT;

    /* 每个销售等级的最低租金 */
    private java.lang.String MIN_RENT_SALES_GRADING;

    public DT_ContractSearchSub_SR_SL() {
    }

    public DT_ContractSearchSub_SR_SL(
           java.lang.String OBJECT_ID,
           java.lang.String TERM_NO,
           java.lang.String VALID_FROM,
           java.lang.String VALID_TO,
           java.lang.String TERM_TEXT,
           java.lang.String SALES_RULE_TYPE,
           java.lang.String TERM_NO_REPORT_RULE,
           java.lang.String SALES_FOR_CALCULATION,
           java.lang.String MIN_MONETARY_SALES,
           java.lang.String MAX_MONETARY_SALES,
           java.lang.String CURRENCY_SALES,
           java.lang.String CURRENCY_SALES_ISO,
           java.lang.String MIN_QUANTITATIVE_SALES,
           java.lang.String MAX_QUANTITATIVE_SALES,
           java.lang.String UNIT_SALES,
           java.lang.String UNIT_SALES_ISO,
           java.lang.String UNIT_PRICE_GROSS_NET,
           java.lang.String GRADING_ITEM_NO,
           java.lang.String GRADING_MON_SALES_FROM,
           java.lang.String GRADING_MON_SALES_TO,
           java.lang.String PERC_SALES_AS_RENT,
           java.lang.String GRADING_QUAN_SALES_FROM,
           java.lang.String GRADING_QUAN_SALES_TO,
           java.lang.String PRICE_PER_UNIT,
           java.lang.String MIN_RENT_SALES_GRADING) {
           this.OBJECT_ID = OBJECT_ID;
           this.TERM_NO = TERM_NO;
           this.VALID_FROM = VALID_FROM;
           this.VALID_TO = VALID_TO;
           this.TERM_TEXT = TERM_TEXT;
           this.SALES_RULE_TYPE = SALES_RULE_TYPE;
           this.TERM_NO_REPORT_RULE = TERM_NO_REPORT_RULE;
           this.SALES_FOR_CALCULATION = SALES_FOR_CALCULATION;
           this.MIN_MONETARY_SALES = MIN_MONETARY_SALES;
           this.MAX_MONETARY_SALES = MAX_MONETARY_SALES;
           this.CURRENCY_SALES = CURRENCY_SALES;
           this.CURRENCY_SALES_ISO = CURRENCY_SALES_ISO;
           this.MIN_QUANTITATIVE_SALES = MIN_QUANTITATIVE_SALES;
           this.MAX_QUANTITATIVE_SALES = MAX_QUANTITATIVE_SALES;
           this.UNIT_SALES = UNIT_SALES;
           this.UNIT_SALES_ISO = UNIT_SALES_ISO;
           this.UNIT_PRICE_GROSS_NET = UNIT_PRICE_GROSS_NET;
           this.GRADING_ITEM_NO = GRADING_ITEM_NO;
           this.GRADING_MON_SALES_FROM = GRADING_MON_SALES_FROM;
           this.GRADING_MON_SALES_TO = GRADING_MON_SALES_TO;
           this.PERC_SALES_AS_RENT = PERC_SALES_AS_RENT;
           this.GRADING_QUAN_SALES_FROM = GRADING_QUAN_SALES_FROM;
           this.GRADING_QUAN_SALES_TO = GRADING_QUAN_SALES_TO;
           this.PRICE_PER_UNIT = PRICE_PER_UNIT;
           this.MIN_RENT_SALES_GRADING = MIN_RENT_SALES_GRADING;
    }


    /**
     * Gets the OBJECT_ID value for this DT_ContractSearchSub_SR_SL.
     * 
     * @return OBJECT_ID   * 对象的标识
     */
    public java.lang.String getOBJECT_ID() {
        return OBJECT_ID;
    }


    /**
     * Sets the OBJECT_ID value for this DT_ContractSearchSub_SR_SL.
     * 
     * @param OBJECT_ID   * 对象的标识
     */
    public void setOBJECT_ID(java.lang.String OBJECT_ID) {
        this.OBJECT_ID = OBJECT_ID;
    }


    /**
     * Gets the TERM_NO value for this DT_ContractSearchSub_SR_SL.
     * 
     * @return TERM_NO   * 条款编号
     */
    public java.lang.String getTERM_NO() {
        return TERM_NO;
    }


    /**
     * Sets the TERM_NO value for this DT_ContractSearchSub_SR_SL.
     * 
     * @param TERM_NO   * 条款编号
     */
    public void setTERM_NO(java.lang.String TERM_NO) {
        this.TERM_NO = TERM_NO;
    }


    /**
     * Gets the VALID_FROM value for this DT_ContractSearchSub_SR_SL.
     * 
     * @return VALID_FROM   * 条款的生效日期
     */
    public java.lang.String getVALID_FROM() {
        return VALID_FROM;
    }


    /**
     * Sets the VALID_FROM value for this DT_ContractSearchSub_SR_SL.
     * 
     * @param VALID_FROM   * 条款的生效日期
     */
    public void setVALID_FROM(java.lang.String VALID_FROM) {
        this.VALID_FROM = VALID_FROM;
    }


    /**
     * Gets the VALID_TO value for this DT_ContractSearchSub_SR_SL.
     * 
     * @return VALID_TO   * 条款的有效终止日期
     */
    public java.lang.String getVALID_TO() {
        return VALID_TO;
    }


    /**
     * Sets the VALID_TO value for this DT_ContractSearchSub_SR_SL.
     * 
     * @param VALID_TO   * 条款的有效终止日期
     */
    public void setVALID_TO(java.lang.String VALID_TO) {
        this.VALID_TO = VALID_TO;
    }


    /**
     * Gets the TERM_TEXT value for this DT_ContractSearchSub_SR_SL.
     * 
     * @return TERM_TEXT   * 条款名称
     */
    public java.lang.String getTERM_TEXT() {
        return TERM_TEXT;
    }


    /**
     * Sets the TERM_TEXT value for this DT_ContractSearchSub_SR_SL.
     * 
     * @param TERM_TEXT   * 条款名称
     */
    public void setTERM_TEXT(java.lang.String TERM_TEXT) {
        this.TERM_TEXT = TERM_TEXT;
    }


    /**
     * Gets the SALES_RULE_TYPE value for this DT_ContractSearchSub_SR_SL.
     * 
     * @return SALES_RULE_TYPE   * 销售规则类型
     */
    public java.lang.String getSALES_RULE_TYPE() {
        return SALES_RULE_TYPE;
    }


    /**
     * Sets the SALES_RULE_TYPE value for this DT_ContractSearchSub_SR_SL.
     * 
     * @param SALES_RULE_TYPE   * 销售规则类型
     */
    public void setSALES_RULE_TYPE(java.lang.String SALES_RULE_TYPE) {
        this.SALES_RULE_TYPE = SALES_RULE_TYPE;
    }


    /**
     * Gets the TERM_NO_REPORT_RULE value for this DT_ContractSearchSub_SR_SL.
     * 
     * @return TERM_NO_REPORT_RULE   * 报告规则的期限编号
     */
    public java.lang.String getTERM_NO_REPORT_RULE() {
        return TERM_NO_REPORT_RULE;
    }


    /**
     * Sets the TERM_NO_REPORT_RULE value for this DT_ContractSearchSub_SR_SL.
     * 
     * @param TERM_NO_REPORT_RULE   * 报告规则的期限编号
     */
    public void setTERM_NO_REPORT_RULE(java.lang.String TERM_NO_REPORT_RULE) {
        this.TERM_NO_REPORT_RULE = TERM_NO_REPORT_RULE;
    }


    /**
     * Gets the SALES_FOR_CALCULATION value for this DT_ContractSearchSub_SR_SL.
     * 
     * @return SALES_FOR_CALCULATION   * 哪些销售应该用于计算
     */
    public java.lang.String getSALES_FOR_CALCULATION() {
        return SALES_FOR_CALCULATION;
    }


    /**
     * Sets the SALES_FOR_CALCULATION value for this DT_ContractSearchSub_SR_SL.
     * 
     * @param SALES_FOR_CALCULATION   * 哪些销售应该用于计算
     */
    public void setSALES_FOR_CALCULATION(java.lang.String SALES_FOR_CALCULATION) {
        this.SALES_FOR_CALCULATION = SALES_FOR_CALCULATION;
    }


    /**
     * Gets the MIN_MONETARY_SALES value for this DT_ContractSearchSub_SR_SL.
     * 
     * @return MIN_MONETARY_SALES   * 结算期间中的最低货币销售
     */
    public java.lang.String getMIN_MONETARY_SALES() {
        return MIN_MONETARY_SALES;
    }


    /**
     * Sets the MIN_MONETARY_SALES value for this DT_ContractSearchSub_SR_SL.
     * 
     * @param MIN_MONETARY_SALES   * 结算期间中的最低货币销售
     */
    public void setMIN_MONETARY_SALES(java.lang.String MIN_MONETARY_SALES) {
        this.MIN_MONETARY_SALES = MIN_MONETARY_SALES;
    }


    /**
     * Gets the MAX_MONETARY_SALES value for this DT_ContractSearchSub_SR_SL.
     * 
     * @return MAX_MONETARY_SALES   * 结算期间中的最大(货币)销售
     */
    public java.lang.String getMAX_MONETARY_SALES() {
        return MAX_MONETARY_SALES;
    }


    /**
     * Sets the MAX_MONETARY_SALES value for this DT_ContractSearchSub_SR_SL.
     * 
     * @param MAX_MONETARY_SALES   * 结算期间中的最大(货币)销售
     */
    public void setMAX_MONETARY_SALES(java.lang.String MAX_MONETARY_SALES) {
        this.MAX_MONETARY_SALES = MAX_MONETARY_SALES;
    }


    /**
     * Gets the CURRENCY_SALES value for this DT_ContractSearchSub_SR_SL.
     * 
     * @return CURRENCY_SALES   * 货币码
     */
    public java.lang.String getCURRENCY_SALES() {
        return CURRENCY_SALES;
    }


    /**
     * Sets the CURRENCY_SALES value for this DT_ContractSearchSub_SR_SL.
     * 
     * @param CURRENCY_SALES   * 货币码
     */
    public void setCURRENCY_SALES(java.lang.String CURRENCY_SALES) {
        this.CURRENCY_SALES = CURRENCY_SALES;
    }


    /**
     * Gets the CURRENCY_SALES_ISO value for this DT_ContractSearchSub_SR_SL.
     * 
     * @return CURRENCY_SALES_ISO   * ISO 货币码
     */
    public java.lang.String getCURRENCY_SALES_ISO() {
        return CURRENCY_SALES_ISO;
    }


    /**
     * Sets the CURRENCY_SALES_ISO value for this DT_ContractSearchSub_SR_SL.
     * 
     * @param CURRENCY_SALES_ISO   * ISO 货币码
     */
    public void setCURRENCY_SALES_ISO(java.lang.String CURRENCY_SALES_ISO) {
        this.CURRENCY_SALES_ISO = CURRENCY_SALES_ISO;
    }


    /**
     * Gets the MIN_QUANTITATIVE_SALES value for this DT_ContractSearchSub_SR_SL.
     * 
     * @return MIN_QUANTITATIVE_SALES   * 结算期间中的最小定量销售
     */
    public java.lang.String getMIN_QUANTITATIVE_SALES() {
        return MIN_QUANTITATIVE_SALES;
    }


    /**
     * Sets the MIN_QUANTITATIVE_SALES value for this DT_ContractSearchSub_SR_SL.
     * 
     * @param MIN_QUANTITATIVE_SALES   * 结算期间中的最小定量销售
     */
    public void setMIN_QUANTITATIVE_SALES(java.lang.String MIN_QUANTITATIVE_SALES) {
        this.MIN_QUANTITATIVE_SALES = MIN_QUANTITATIVE_SALES;
    }


    /**
     * Gets the MAX_QUANTITATIVE_SALES value for this DT_ContractSearchSub_SR_SL.
     * 
     * @return MAX_QUANTITATIVE_SALES   * 销售期间中的最大定量销售
     */
    public java.lang.String getMAX_QUANTITATIVE_SALES() {
        return MAX_QUANTITATIVE_SALES;
    }


    /**
     * Sets the MAX_QUANTITATIVE_SALES value for this DT_ContractSearchSub_SR_SL.
     * 
     * @param MAX_QUANTITATIVE_SALES   * 销售期间中的最大定量销售
     */
    public void setMAX_QUANTITATIVE_SALES(java.lang.String MAX_QUANTITATIVE_SALES) {
        this.MAX_QUANTITATIVE_SALES = MAX_QUANTITATIVE_SALES;
    }


    /**
     * Gets the UNIT_SALES value for this DT_ContractSearchSub_SR_SL.
     * 
     * @return UNIT_SALES   * 销售报告价值的计量单位
     */
    public java.lang.String getUNIT_SALES() {
        return UNIT_SALES;
    }


    /**
     * Sets the UNIT_SALES value for this DT_ContractSearchSub_SR_SL.
     * 
     * @param UNIT_SALES   * 销售报告价值的计量单位
     */
    public void setUNIT_SALES(java.lang.String UNIT_SALES) {
        this.UNIT_SALES = UNIT_SALES;
    }


    /**
     * Gets the UNIT_SALES_ISO value for this DT_ContractSearchSub_SR_SL.
     * 
     * @return UNIT_SALES_ISO   * 计量单位的 ISO 代码
     */
    public java.lang.String getUNIT_SALES_ISO() {
        return UNIT_SALES_ISO;
    }


    /**
     * Sets the UNIT_SALES_ISO value for this DT_ContractSearchSub_SR_SL.
     * 
     * @param UNIT_SALES_ISO   * 计量单位的 ISO 代码
     */
    public void setUNIT_SALES_ISO(java.lang.String UNIT_SALES_ISO) {
        this.UNIT_SALES_ISO = UNIT_SALES_ISO;
    }


    /**
     * Gets the UNIT_PRICE_GROSS_NET value for this DT_ContractSearchSub_SR_SL.
     * 
     * @return UNIT_PRICE_GROSS_NET   * 每计量单位的价格是净价还是总价
     */
    public java.lang.String getUNIT_PRICE_GROSS_NET() {
        return UNIT_PRICE_GROSS_NET;
    }


    /**
     * Sets the UNIT_PRICE_GROSS_NET value for this DT_ContractSearchSub_SR_SL.
     * 
     * @param UNIT_PRICE_GROSS_NET   * 每计量单位的价格是净价还是总价
     */
    public void setUNIT_PRICE_GROSS_NET(java.lang.String UNIT_PRICE_GROSS_NET) {
        this.UNIT_PRICE_GROSS_NET = UNIT_PRICE_GROSS_NET;
    }


    /**
     * Gets the GRADING_ITEM_NO value for this DT_ContractSearchSub_SR_SL.
     * 
     * @return GRADING_ITEM_NO   * 销售金额和百分比的顺序编号
     */
    public java.lang.String getGRADING_ITEM_NO() {
        return GRADING_ITEM_NO;
    }


    /**
     * Sets the GRADING_ITEM_NO value for this DT_ContractSearchSub_SR_SL.
     * 
     * @param GRADING_ITEM_NO   * 销售金额和百分比的顺序编号
     */
    public void setGRADING_ITEM_NO(java.lang.String GRADING_ITEM_NO) {
        this.GRADING_ITEM_NO = GRADING_ITEM_NO;
    }


    /**
     * Gets the GRADING_MON_SALES_FROM value for this DT_ContractSearchSub_SR_SL.
     * 
     * @return GRADING_MON_SALES_FROM   * 销售(最小)
     */
    public java.lang.String getGRADING_MON_SALES_FROM() {
        return GRADING_MON_SALES_FROM;
    }


    /**
     * Sets the GRADING_MON_SALES_FROM value for this DT_ContractSearchSub_SR_SL.
     * 
     * @param GRADING_MON_SALES_FROM   * 销售(最小)
     */
    public void setGRADING_MON_SALES_FROM(java.lang.String GRADING_MON_SALES_FROM) {
        this.GRADING_MON_SALES_FROM = GRADING_MON_SALES_FROM;
    }


    /**
     * Gets the GRADING_MON_SALES_TO value for this DT_ContractSearchSub_SR_SL.
     * 
     * @return GRADING_MON_SALES_TO   * 销售(最大)
     */
    public java.lang.String getGRADING_MON_SALES_TO() {
        return GRADING_MON_SALES_TO;
    }


    /**
     * Sets the GRADING_MON_SALES_TO value for this DT_ContractSearchSub_SR_SL.
     * 
     * @param GRADING_MON_SALES_TO   * 销售(最大)
     */
    public void setGRADING_MON_SALES_TO(java.lang.String GRADING_MON_SALES_TO) {
        this.GRADING_MON_SALES_TO = GRADING_MON_SALES_TO;
    }


    /**
     * Gets the PERC_SALES_AS_RENT value for this DT_ContractSearchSub_SR_SL.
     * 
     * @return PERC_SALES_AS_RENT   * 作为租赁的销售百分比
     */
    public java.lang.String getPERC_SALES_AS_RENT() {
        return PERC_SALES_AS_RENT;
    }


    /**
     * Sets the PERC_SALES_AS_RENT value for this DT_ContractSearchSub_SR_SL.
     * 
     * @param PERC_SALES_AS_RENT   * 作为租赁的销售百分比
     */
    public void setPERC_SALES_AS_RENT(java.lang.String PERC_SALES_AS_RENT) {
        this.PERC_SALES_AS_RENT = PERC_SALES_AS_RENT;
    }


    /**
     * Gets the GRADING_QUAN_SALES_FROM value for this DT_ContractSearchSub_SR_SL.
     * 
     * @return GRADING_QUAN_SALES_FROM   * 定量销售(最小)
     */
    public java.lang.String getGRADING_QUAN_SALES_FROM() {
        return GRADING_QUAN_SALES_FROM;
    }


    /**
     * Sets the GRADING_QUAN_SALES_FROM value for this DT_ContractSearchSub_SR_SL.
     * 
     * @param GRADING_QUAN_SALES_FROM   * 定量销售(最小)
     */
    public void setGRADING_QUAN_SALES_FROM(java.lang.String GRADING_QUAN_SALES_FROM) {
        this.GRADING_QUAN_SALES_FROM = GRADING_QUAN_SALES_FROM;
    }


    /**
     * Gets the GRADING_QUAN_SALES_TO value for this DT_ContractSearchSub_SR_SL.
     * 
     * @return GRADING_QUAN_SALES_TO   * 定量销售(最大)
     */
    public java.lang.String getGRADING_QUAN_SALES_TO() {
        return GRADING_QUAN_SALES_TO;
    }


    /**
     * Sets the GRADING_QUAN_SALES_TO value for this DT_ContractSearchSub_SR_SL.
     * 
     * @param GRADING_QUAN_SALES_TO   * 定量销售(最大)
     */
    public void setGRADING_QUAN_SALES_TO(java.lang.String GRADING_QUAN_SALES_TO) {
        this.GRADING_QUAN_SALES_TO = GRADING_QUAN_SALES_TO;
    }


    /**
     * Gets the PRICE_PER_UNIT value for this DT_ContractSearchSub_SR_SL.
     * 
     * @return PRICE_PER_UNIT   * 每个计量单位的金额
     */
    public java.lang.String getPRICE_PER_UNIT() {
        return PRICE_PER_UNIT;
    }


    /**
     * Sets the PRICE_PER_UNIT value for this DT_ContractSearchSub_SR_SL.
     * 
     * @param PRICE_PER_UNIT   * 每个计量单位的金额
     */
    public void setPRICE_PER_UNIT(java.lang.String PRICE_PER_UNIT) {
        this.PRICE_PER_UNIT = PRICE_PER_UNIT;
    }


    /**
     * Gets the MIN_RENT_SALES_GRADING value for this DT_ContractSearchSub_SR_SL.
     * 
     * @return MIN_RENT_SALES_GRADING   * 每个销售等级的最低租金
     */
    public java.lang.String getMIN_RENT_SALES_GRADING() {
        return MIN_RENT_SALES_GRADING;
    }


    /**
     * Sets the MIN_RENT_SALES_GRADING value for this DT_ContractSearchSub_SR_SL.
     * 
     * @param MIN_RENT_SALES_GRADING   * 每个销售等级的最低租金
     */
    public void setMIN_RENT_SALES_GRADING(java.lang.String MIN_RENT_SALES_GRADING) {
        this.MIN_RENT_SALES_GRADING = MIN_RENT_SALES_GRADING;
    }

    private java.lang.Object __equalsCalc = null;
    public synchronized boolean equals(java.lang.Object obj) {
        if (!(obj instanceof DT_ContractSearchSub_SR_SL)) return false;
        DT_ContractSearchSub_SR_SL other = (DT_ContractSearchSub_SR_SL) obj;
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
            ((this.VALID_FROM==null && other.getVALID_FROM()==null) || 
             (this.VALID_FROM!=null &&
              this.VALID_FROM.equals(other.getVALID_FROM()))) &&
            ((this.VALID_TO==null && other.getVALID_TO()==null) || 
             (this.VALID_TO!=null &&
              this.VALID_TO.equals(other.getVALID_TO()))) &&
            ((this.TERM_TEXT==null && other.getTERM_TEXT()==null) || 
             (this.TERM_TEXT!=null &&
              this.TERM_TEXT.equals(other.getTERM_TEXT()))) &&
            ((this.SALES_RULE_TYPE==null && other.getSALES_RULE_TYPE()==null) || 
             (this.SALES_RULE_TYPE!=null &&
              this.SALES_RULE_TYPE.equals(other.getSALES_RULE_TYPE()))) &&
            ((this.TERM_NO_REPORT_RULE==null && other.getTERM_NO_REPORT_RULE()==null) || 
             (this.TERM_NO_REPORT_RULE!=null &&
              this.TERM_NO_REPORT_RULE.equals(other.getTERM_NO_REPORT_RULE()))) &&
            ((this.SALES_FOR_CALCULATION==null && other.getSALES_FOR_CALCULATION()==null) || 
             (this.SALES_FOR_CALCULATION!=null &&
              this.SALES_FOR_CALCULATION.equals(other.getSALES_FOR_CALCULATION()))) &&
            ((this.MIN_MONETARY_SALES==null && other.getMIN_MONETARY_SALES()==null) || 
             (this.MIN_MONETARY_SALES!=null &&
              this.MIN_MONETARY_SALES.equals(other.getMIN_MONETARY_SALES()))) &&
            ((this.MAX_MONETARY_SALES==null && other.getMAX_MONETARY_SALES()==null) || 
             (this.MAX_MONETARY_SALES!=null &&
              this.MAX_MONETARY_SALES.equals(other.getMAX_MONETARY_SALES()))) &&
            ((this.CURRENCY_SALES==null && other.getCURRENCY_SALES()==null) || 
             (this.CURRENCY_SALES!=null &&
              this.CURRENCY_SALES.equals(other.getCURRENCY_SALES()))) &&
            ((this.CURRENCY_SALES_ISO==null && other.getCURRENCY_SALES_ISO()==null) || 
             (this.CURRENCY_SALES_ISO!=null &&
              this.CURRENCY_SALES_ISO.equals(other.getCURRENCY_SALES_ISO()))) &&
            ((this.MIN_QUANTITATIVE_SALES==null && other.getMIN_QUANTITATIVE_SALES()==null) || 
             (this.MIN_QUANTITATIVE_SALES!=null &&
              this.MIN_QUANTITATIVE_SALES.equals(other.getMIN_QUANTITATIVE_SALES()))) &&
            ((this.MAX_QUANTITATIVE_SALES==null && other.getMAX_QUANTITATIVE_SALES()==null) || 
             (this.MAX_QUANTITATIVE_SALES!=null &&
              this.MAX_QUANTITATIVE_SALES.equals(other.getMAX_QUANTITATIVE_SALES()))) &&
            ((this.UNIT_SALES==null && other.getUNIT_SALES()==null) || 
             (this.UNIT_SALES!=null &&
              this.UNIT_SALES.equals(other.getUNIT_SALES()))) &&
            ((this.UNIT_SALES_ISO==null && other.getUNIT_SALES_ISO()==null) || 
             (this.UNIT_SALES_ISO!=null &&
              this.UNIT_SALES_ISO.equals(other.getUNIT_SALES_ISO()))) &&
            ((this.UNIT_PRICE_GROSS_NET==null && other.getUNIT_PRICE_GROSS_NET()==null) || 
             (this.UNIT_PRICE_GROSS_NET!=null &&
              this.UNIT_PRICE_GROSS_NET.equals(other.getUNIT_PRICE_GROSS_NET()))) &&
            ((this.GRADING_ITEM_NO==null && other.getGRADING_ITEM_NO()==null) || 
             (this.GRADING_ITEM_NO!=null &&
              this.GRADING_ITEM_NO.equals(other.getGRADING_ITEM_NO()))) &&
            ((this.GRADING_MON_SALES_FROM==null && other.getGRADING_MON_SALES_FROM()==null) || 
             (this.GRADING_MON_SALES_FROM!=null &&
              this.GRADING_MON_SALES_FROM.equals(other.getGRADING_MON_SALES_FROM()))) &&
            ((this.GRADING_MON_SALES_TO==null && other.getGRADING_MON_SALES_TO()==null) || 
             (this.GRADING_MON_SALES_TO!=null &&
              this.GRADING_MON_SALES_TO.equals(other.getGRADING_MON_SALES_TO()))) &&
            ((this.PERC_SALES_AS_RENT==null && other.getPERC_SALES_AS_RENT()==null) || 
             (this.PERC_SALES_AS_RENT!=null &&
              this.PERC_SALES_AS_RENT.equals(other.getPERC_SALES_AS_RENT()))) &&
            ((this.GRADING_QUAN_SALES_FROM==null && other.getGRADING_QUAN_SALES_FROM()==null) || 
             (this.GRADING_QUAN_SALES_FROM!=null &&
              this.GRADING_QUAN_SALES_FROM.equals(other.getGRADING_QUAN_SALES_FROM()))) &&
            ((this.GRADING_QUAN_SALES_TO==null && other.getGRADING_QUAN_SALES_TO()==null) || 
             (this.GRADING_QUAN_SALES_TO!=null &&
              this.GRADING_QUAN_SALES_TO.equals(other.getGRADING_QUAN_SALES_TO()))) &&
            ((this.PRICE_PER_UNIT==null && other.getPRICE_PER_UNIT()==null) || 
             (this.PRICE_PER_UNIT!=null &&
              this.PRICE_PER_UNIT.equals(other.getPRICE_PER_UNIT()))) &&
            ((this.MIN_RENT_SALES_GRADING==null && other.getMIN_RENT_SALES_GRADING()==null) || 
             (this.MIN_RENT_SALES_GRADING!=null &&
              this.MIN_RENT_SALES_GRADING.equals(other.getMIN_RENT_SALES_GRADING())));
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
        if (getVALID_FROM() != null) {
            _hashCode += getVALID_FROM().hashCode();
        }
        if (getVALID_TO() != null) {
            _hashCode += getVALID_TO().hashCode();
        }
        if (getTERM_TEXT() != null) {
            _hashCode += getTERM_TEXT().hashCode();
        }
        if (getSALES_RULE_TYPE() != null) {
            _hashCode += getSALES_RULE_TYPE().hashCode();
        }
        if (getTERM_NO_REPORT_RULE() != null) {
            _hashCode += getTERM_NO_REPORT_RULE().hashCode();
        }
        if (getSALES_FOR_CALCULATION() != null) {
            _hashCode += getSALES_FOR_CALCULATION().hashCode();
        }
        if (getMIN_MONETARY_SALES() != null) {
            _hashCode += getMIN_MONETARY_SALES().hashCode();
        }
        if (getMAX_MONETARY_SALES() != null) {
            _hashCode += getMAX_MONETARY_SALES().hashCode();
        }
        if (getCURRENCY_SALES() != null) {
            _hashCode += getCURRENCY_SALES().hashCode();
        }
        if (getCURRENCY_SALES_ISO() != null) {
            _hashCode += getCURRENCY_SALES_ISO().hashCode();
        }
        if (getMIN_QUANTITATIVE_SALES() != null) {
            _hashCode += getMIN_QUANTITATIVE_SALES().hashCode();
        }
        if (getMAX_QUANTITATIVE_SALES() != null) {
            _hashCode += getMAX_QUANTITATIVE_SALES().hashCode();
        }
        if (getUNIT_SALES() != null) {
            _hashCode += getUNIT_SALES().hashCode();
        }
        if (getUNIT_SALES_ISO() != null) {
            _hashCode += getUNIT_SALES_ISO().hashCode();
        }
        if (getUNIT_PRICE_GROSS_NET() != null) {
            _hashCode += getUNIT_PRICE_GROSS_NET().hashCode();
        }
        if (getGRADING_ITEM_NO() != null) {
            _hashCode += getGRADING_ITEM_NO().hashCode();
        }
        if (getGRADING_MON_SALES_FROM() != null) {
            _hashCode += getGRADING_MON_SALES_FROM().hashCode();
        }
        if (getGRADING_MON_SALES_TO() != null) {
            _hashCode += getGRADING_MON_SALES_TO().hashCode();
        }
        if (getPERC_SALES_AS_RENT() != null) {
            _hashCode += getPERC_SALES_AS_RENT().hashCode();
        }
        if (getGRADING_QUAN_SALES_FROM() != null) {
            _hashCode += getGRADING_QUAN_SALES_FROM().hashCode();
        }
        if (getGRADING_QUAN_SALES_TO() != null) {
            _hashCode += getGRADING_QUAN_SALES_TO().hashCode();
        }
        if (getPRICE_PER_UNIT() != null) {
            _hashCode += getPRICE_PER_UNIT().hashCode();
        }
        if (getMIN_RENT_SALES_GRADING() != null) {
            _hashCode += getMIN_RENT_SALES_GRADING().hashCode();
        }
        __hashCodeCalc = false;
        return _hashCode;
    }

    // Type metadata
    private static org.apache.axis.description.TypeDesc typeDesc =
        new org.apache.axis.description.TypeDesc(DT_ContractSearchSub_SR_SL.class, true);

    static {
        typeDesc.setXmlType(new javax.xml.namespace.QName("urn:ecc:rvs:contract", "DT_ContractSearchSub_SR_SL"));
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
        elemField.setFieldName("TERM_TEXT");
        elemField.setXmlName(new javax.xml.namespace.QName("", "TERM_TEXT"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("SALES_RULE_TYPE");
        elemField.setXmlName(new javax.xml.namespace.QName("", "SALES_RULE_TYPE"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("TERM_NO_REPORT_RULE");
        elemField.setXmlName(new javax.xml.namespace.QName("", "TERM_NO_REPORT_RULE"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("SALES_FOR_CALCULATION");
        elemField.setXmlName(new javax.xml.namespace.QName("", "SALES_FOR_CALCULATION"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("MIN_MONETARY_SALES");
        elemField.setXmlName(new javax.xml.namespace.QName("", "MIN_MONETARY_SALES"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("MAX_MONETARY_SALES");
        elemField.setXmlName(new javax.xml.namespace.QName("", "MAX_MONETARY_SALES"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("CURRENCY_SALES");
        elemField.setXmlName(new javax.xml.namespace.QName("", "CURRENCY_SALES"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("CURRENCY_SALES_ISO");
        elemField.setXmlName(new javax.xml.namespace.QName("", "CURRENCY_SALES_ISO"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("MIN_QUANTITATIVE_SALES");
        elemField.setXmlName(new javax.xml.namespace.QName("", "MIN_QUANTITATIVE_SALES"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("MAX_QUANTITATIVE_SALES");
        elemField.setXmlName(new javax.xml.namespace.QName("", "MAX_QUANTITATIVE_SALES"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("UNIT_SALES");
        elemField.setXmlName(new javax.xml.namespace.QName("", "UNIT_SALES"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("UNIT_SALES_ISO");
        elemField.setXmlName(new javax.xml.namespace.QName("", "UNIT_SALES_ISO"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("UNIT_PRICE_GROSS_NET");
        elemField.setXmlName(new javax.xml.namespace.QName("", "UNIT_PRICE_GROSS_NET"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("GRADING_ITEM_NO");
        elemField.setXmlName(new javax.xml.namespace.QName("", "GRADING_ITEM_NO"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("GRADING_MON_SALES_FROM");
        elemField.setXmlName(new javax.xml.namespace.QName("", "GRADING_MON_SALES_FROM"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("GRADING_MON_SALES_TO");
        elemField.setXmlName(new javax.xml.namespace.QName("", "GRADING_MON_SALES_TO"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("PERC_SALES_AS_RENT");
        elemField.setXmlName(new javax.xml.namespace.QName("", "PERC_SALES_AS_RENT"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("GRADING_QUAN_SALES_FROM");
        elemField.setXmlName(new javax.xml.namespace.QName("", "GRADING_QUAN_SALES_FROM"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("GRADING_QUAN_SALES_TO");
        elemField.setXmlName(new javax.xml.namespace.QName("", "GRADING_QUAN_SALES_TO"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("PRICE_PER_UNIT");
        elemField.setXmlName(new javax.xml.namespace.QName("", "PRICE_PER_UNIT"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("MIN_RENT_SALES_GRADING");
        elemField.setXmlName(new javax.xml.namespace.QName("", "MIN_RENT_SALES_GRADING"));
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
