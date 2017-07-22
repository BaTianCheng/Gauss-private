/**
 * DT_ContractSearchSub_SR_REP.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package com.esb.jinying.sap.contract.rvs.ecc;

public class DT_ContractSearchSub_SR_REP  implements java.io.Serializable {
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

    /* 销售类型 */
    private java.lang.String SALES_TYPE;

    /* 统计销售报告 */
    private java.lang.String SALES_REP_IS_STATISTICAL;

    /* 总/净销售 */
    private java.lang.String GROSS_NET_SALES;

    /* 频率类型 */
    private java.lang.String FREQUENCY_TYPE;

    /* 频率的开始 */
    private java.lang.String FREQUENCY_START;

    /* 期间频率单位的数量 */
    private java.lang.String FREQUENCY;

    /* 频率单位 */
    private java.lang.String FREQUENCY_UNIT;

    /* 何时必须接收销售报告的容差 */
    private java.lang.String TOLERANCE;

    /* 容差在 */
    private java.lang.String TOLERANCE_UNIT;

    /* 日历 */
    private java.lang.String TOLERANCE_CALENDAR;

    /* 排除的期间的开始 */
    private java.lang.String START_OF_EXCLUDE_PERIOD;

    /* 排除期间的结束 */
    private java.lang.String END_OF_EXCLUDE_PERIOD;

    public DT_ContractSearchSub_SR_REP() {
    }

    public DT_ContractSearchSub_SR_REP(
           java.lang.String OBJECT_ID,
           java.lang.String TERM_NO,
           java.lang.String VALID_FROM,
           java.lang.String VALID_TO,
           java.lang.String TERM_TEXT,
           java.lang.String SALES_TYPE,
           java.lang.String SALES_REP_IS_STATISTICAL,
           java.lang.String GROSS_NET_SALES,
           java.lang.String FREQUENCY_TYPE,
           java.lang.String FREQUENCY_START,
           java.lang.String FREQUENCY,
           java.lang.String FREQUENCY_UNIT,
           java.lang.String TOLERANCE,
           java.lang.String TOLERANCE_UNIT,
           java.lang.String TOLERANCE_CALENDAR,
           java.lang.String START_OF_EXCLUDE_PERIOD,
           java.lang.String END_OF_EXCLUDE_PERIOD) {
           this.OBJECT_ID = OBJECT_ID;
           this.TERM_NO = TERM_NO;
           this.VALID_FROM = VALID_FROM;
           this.VALID_TO = VALID_TO;
           this.TERM_TEXT = TERM_TEXT;
           this.SALES_TYPE = SALES_TYPE;
           this.SALES_REP_IS_STATISTICAL = SALES_REP_IS_STATISTICAL;
           this.GROSS_NET_SALES = GROSS_NET_SALES;
           this.FREQUENCY_TYPE = FREQUENCY_TYPE;
           this.FREQUENCY_START = FREQUENCY_START;
           this.FREQUENCY = FREQUENCY;
           this.FREQUENCY_UNIT = FREQUENCY_UNIT;
           this.TOLERANCE = TOLERANCE;
           this.TOLERANCE_UNIT = TOLERANCE_UNIT;
           this.TOLERANCE_CALENDAR = TOLERANCE_CALENDAR;
           this.START_OF_EXCLUDE_PERIOD = START_OF_EXCLUDE_PERIOD;
           this.END_OF_EXCLUDE_PERIOD = END_OF_EXCLUDE_PERIOD;
    }


    /**
     * Gets the OBJECT_ID value for this DT_ContractSearchSub_SR_REP.
     * 
     * @return OBJECT_ID   * 对象的标识
     */
    public java.lang.String getOBJECT_ID() {
        return OBJECT_ID;
    }


    /**
     * Sets the OBJECT_ID value for this DT_ContractSearchSub_SR_REP.
     * 
     * @param OBJECT_ID   * 对象的标识
     */
    public void setOBJECT_ID(java.lang.String OBJECT_ID) {
        this.OBJECT_ID = OBJECT_ID;
    }


    /**
     * Gets the TERM_NO value for this DT_ContractSearchSub_SR_REP.
     * 
     * @return TERM_NO   * 条款编号
     */
    public java.lang.String getTERM_NO() {
        return TERM_NO;
    }


    /**
     * Sets the TERM_NO value for this DT_ContractSearchSub_SR_REP.
     * 
     * @param TERM_NO   * 条款编号
     */
    public void setTERM_NO(java.lang.String TERM_NO) {
        this.TERM_NO = TERM_NO;
    }


    /**
     * Gets the VALID_FROM value for this DT_ContractSearchSub_SR_REP.
     * 
     * @return VALID_FROM   * 条款的生效日期
     */
    public java.lang.String getVALID_FROM() {
        return VALID_FROM;
    }


    /**
     * Sets the VALID_FROM value for this DT_ContractSearchSub_SR_REP.
     * 
     * @param VALID_FROM   * 条款的生效日期
     */
    public void setVALID_FROM(java.lang.String VALID_FROM) {
        this.VALID_FROM = VALID_FROM;
    }


    /**
     * Gets the VALID_TO value for this DT_ContractSearchSub_SR_REP.
     * 
     * @return VALID_TO   * 条款的有效终止日期
     */
    public java.lang.String getVALID_TO() {
        return VALID_TO;
    }


    /**
     * Sets the VALID_TO value for this DT_ContractSearchSub_SR_REP.
     * 
     * @param VALID_TO   * 条款的有效终止日期
     */
    public void setVALID_TO(java.lang.String VALID_TO) {
        this.VALID_TO = VALID_TO;
    }


    /**
     * Gets the TERM_TEXT value for this DT_ContractSearchSub_SR_REP.
     * 
     * @return TERM_TEXT   * 条款名称
     */
    public java.lang.String getTERM_TEXT() {
        return TERM_TEXT;
    }


    /**
     * Sets the TERM_TEXT value for this DT_ContractSearchSub_SR_REP.
     * 
     * @param TERM_TEXT   * 条款名称
     */
    public void setTERM_TEXT(java.lang.String TERM_TEXT) {
        this.TERM_TEXT = TERM_TEXT;
    }


    /**
     * Gets the SALES_TYPE value for this DT_ContractSearchSub_SR_REP.
     * 
     * @return SALES_TYPE   * 销售类型
     */
    public java.lang.String getSALES_TYPE() {
        return SALES_TYPE;
    }


    /**
     * Sets the SALES_TYPE value for this DT_ContractSearchSub_SR_REP.
     * 
     * @param SALES_TYPE   * 销售类型
     */
    public void setSALES_TYPE(java.lang.String SALES_TYPE) {
        this.SALES_TYPE = SALES_TYPE;
    }


    /**
     * Gets the SALES_REP_IS_STATISTICAL value for this DT_ContractSearchSub_SR_REP.
     * 
     * @return SALES_REP_IS_STATISTICAL   * 统计销售报告
     */
    public java.lang.String getSALES_REP_IS_STATISTICAL() {
        return SALES_REP_IS_STATISTICAL;
    }


    /**
     * Sets the SALES_REP_IS_STATISTICAL value for this DT_ContractSearchSub_SR_REP.
     * 
     * @param SALES_REP_IS_STATISTICAL   * 统计销售报告
     */
    public void setSALES_REP_IS_STATISTICAL(java.lang.String SALES_REP_IS_STATISTICAL) {
        this.SALES_REP_IS_STATISTICAL = SALES_REP_IS_STATISTICAL;
    }


    /**
     * Gets the GROSS_NET_SALES value for this DT_ContractSearchSub_SR_REP.
     * 
     * @return GROSS_NET_SALES   * 总/净销售
     */
    public java.lang.String getGROSS_NET_SALES() {
        return GROSS_NET_SALES;
    }


    /**
     * Sets the GROSS_NET_SALES value for this DT_ContractSearchSub_SR_REP.
     * 
     * @param GROSS_NET_SALES   * 总/净销售
     */
    public void setGROSS_NET_SALES(java.lang.String GROSS_NET_SALES) {
        this.GROSS_NET_SALES = GROSS_NET_SALES;
    }


    /**
     * Gets the FREQUENCY_TYPE value for this DT_ContractSearchSub_SR_REP.
     * 
     * @return FREQUENCY_TYPE   * 频率类型
     */
    public java.lang.String getFREQUENCY_TYPE() {
        return FREQUENCY_TYPE;
    }


    /**
     * Sets the FREQUENCY_TYPE value for this DT_ContractSearchSub_SR_REP.
     * 
     * @param FREQUENCY_TYPE   * 频率类型
     */
    public void setFREQUENCY_TYPE(java.lang.String FREQUENCY_TYPE) {
        this.FREQUENCY_TYPE = FREQUENCY_TYPE;
    }


    /**
     * Gets the FREQUENCY_START value for this DT_ContractSearchSub_SR_REP.
     * 
     * @return FREQUENCY_START   * 频率的开始
     */
    public java.lang.String getFREQUENCY_START() {
        return FREQUENCY_START;
    }


    /**
     * Sets the FREQUENCY_START value for this DT_ContractSearchSub_SR_REP.
     * 
     * @param FREQUENCY_START   * 频率的开始
     */
    public void setFREQUENCY_START(java.lang.String FREQUENCY_START) {
        this.FREQUENCY_START = FREQUENCY_START;
    }


    /**
     * Gets the FREQUENCY value for this DT_ContractSearchSub_SR_REP.
     * 
     * @return FREQUENCY   * 期间频率单位的数量
     */
    public java.lang.String getFREQUENCY() {
        return FREQUENCY;
    }


    /**
     * Sets the FREQUENCY value for this DT_ContractSearchSub_SR_REP.
     * 
     * @param FREQUENCY   * 期间频率单位的数量
     */
    public void setFREQUENCY(java.lang.String FREQUENCY) {
        this.FREQUENCY = FREQUENCY;
    }


    /**
     * Gets the FREQUENCY_UNIT value for this DT_ContractSearchSub_SR_REP.
     * 
     * @return FREQUENCY_UNIT   * 频率单位
     */
    public java.lang.String getFREQUENCY_UNIT() {
        return FREQUENCY_UNIT;
    }


    /**
     * Sets the FREQUENCY_UNIT value for this DT_ContractSearchSub_SR_REP.
     * 
     * @param FREQUENCY_UNIT   * 频率单位
     */
    public void setFREQUENCY_UNIT(java.lang.String FREQUENCY_UNIT) {
        this.FREQUENCY_UNIT = FREQUENCY_UNIT;
    }


    /**
     * Gets the TOLERANCE value for this DT_ContractSearchSub_SR_REP.
     * 
     * @return TOLERANCE   * 何时必须接收销售报告的容差
     */
    public java.lang.String getTOLERANCE() {
        return TOLERANCE;
    }


    /**
     * Sets the TOLERANCE value for this DT_ContractSearchSub_SR_REP.
     * 
     * @param TOLERANCE   * 何时必须接收销售报告的容差
     */
    public void setTOLERANCE(java.lang.String TOLERANCE) {
        this.TOLERANCE = TOLERANCE;
    }


    /**
     * Gets the TOLERANCE_UNIT value for this DT_ContractSearchSub_SR_REP.
     * 
     * @return TOLERANCE_UNIT   * 容差在
     */
    public java.lang.String getTOLERANCE_UNIT() {
        return TOLERANCE_UNIT;
    }


    /**
     * Sets the TOLERANCE_UNIT value for this DT_ContractSearchSub_SR_REP.
     * 
     * @param TOLERANCE_UNIT   * 容差在
     */
    public void setTOLERANCE_UNIT(java.lang.String TOLERANCE_UNIT) {
        this.TOLERANCE_UNIT = TOLERANCE_UNIT;
    }


    /**
     * Gets the TOLERANCE_CALENDAR value for this DT_ContractSearchSub_SR_REP.
     * 
     * @return TOLERANCE_CALENDAR   * 日历
     */
    public java.lang.String getTOLERANCE_CALENDAR() {
        return TOLERANCE_CALENDAR;
    }


    /**
     * Sets the TOLERANCE_CALENDAR value for this DT_ContractSearchSub_SR_REP.
     * 
     * @param TOLERANCE_CALENDAR   * 日历
     */
    public void setTOLERANCE_CALENDAR(java.lang.String TOLERANCE_CALENDAR) {
        this.TOLERANCE_CALENDAR = TOLERANCE_CALENDAR;
    }


    /**
     * Gets the START_OF_EXCLUDE_PERIOD value for this DT_ContractSearchSub_SR_REP.
     * 
     * @return START_OF_EXCLUDE_PERIOD   * 排除的期间的开始
     */
    public java.lang.String getSTART_OF_EXCLUDE_PERIOD() {
        return START_OF_EXCLUDE_PERIOD;
    }


    /**
     * Sets the START_OF_EXCLUDE_PERIOD value for this DT_ContractSearchSub_SR_REP.
     * 
     * @param START_OF_EXCLUDE_PERIOD   * 排除的期间的开始
     */
    public void setSTART_OF_EXCLUDE_PERIOD(java.lang.String START_OF_EXCLUDE_PERIOD) {
        this.START_OF_EXCLUDE_PERIOD = START_OF_EXCLUDE_PERIOD;
    }


    /**
     * Gets the END_OF_EXCLUDE_PERIOD value for this DT_ContractSearchSub_SR_REP.
     * 
     * @return END_OF_EXCLUDE_PERIOD   * 排除期间的结束
     */
    public java.lang.String getEND_OF_EXCLUDE_PERIOD() {
        return END_OF_EXCLUDE_PERIOD;
    }


    /**
     * Sets the END_OF_EXCLUDE_PERIOD value for this DT_ContractSearchSub_SR_REP.
     * 
     * @param END_OF_EXCLUDE_PERIOD   * 排除期间的结束
     */
    public void setEND_OF_EXCLUDE_PERIOD(java.lang.String END_OF_EXCLUDE_PERIOD) {
        this.END_OF_EXCLUDE_PERIOD = END_OF_EXCLUDE_PERIOD;
    }

    private java.lang.Object __equalsCalc = null;
    public synchronized boolean equals(java.lang.Object obj) {
        if (!(obj instanceof DT_ContractSearchSub_SR_REP)) return false;
        DT_ContractSearchSub_SR_REP other = (DT_ContractSearchSub_SR_REP) obj;
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
            ((this.SALES_TYPE==null && other.getSALES_TYPE()==null) || 
             (this.SALES_TYPE!=null &&
              this.SALES_TYPE.equals(other.getSALES_TYPE()))) &&
            ((this.SALES_REP_IS_STATISTICAL==null && other.getSALES_REP_IS_STATISTICAL()==null) || 
             (this.SALES_REP_IS_STATISTICAL!=null &&
              this.SALES_REP_IS_STATISTICAL.equals(other.getSALES_REP_IS_STATISTICAL()))) &&
            ((this.GROSS_NET_SALES==null && other.getGROSS_NET_SALES()==null) || 
             (this.GROSS_NET_SALES!=null &&
              this.GROSS_NET_SALES.equals(other.getGROSS_NET_SALES()))) &&
            ((this.FREQUENCY_TYPE==null && other.getFREQUENCY_TYPE()==null) || 
             (this.FREQUENCY_TYPE!=null &&
              this.FREQUENCY_TYPE.equals(other.getFREQUENCY_TYPE()))) &&
            ((this.FREQUENCY_START==null && other.getFREQUENCY_START()==null) || 
             (this.FREQUENCY_START!=null &&
              this.FREQUENCY_START.equals(other.getFREQUENCY_START()))) &&
            ((this.FREQUENCY==null && other.getFREQUENCY()==null) || 
             (this.FREQUENCY!=null &&
              this.FREQUENCY.equals(other.getFREQUENCY()))) &&
            ((this.FREQUENCY_UNIT==null && other.getFREQUENCY_UNIT()==null) || 
             (this.FREQUENCY_UNIT!=null &&
              this.FREQUENCY_UNIT.equals(other.getFREQUENCY_UNIT()))) &&
            ((this.TOLERANCE==null && other.getTOLERANCE()==null) || 
             (this.TOLERANCE!=null &&
              this.TOLERANCE.equals(other.getTOLERANCE()))) &&
            ((this.TOLERANCE_UNIT==null && other.getTOLERANCE_UNIT()==null) || 
             (this.TOLERANCE_UNIT!=null &&
              this.TOLERANCE_UNIT.equals(other.getTOLERANCE_UNIT()))) &&
            ((this.TOLERANCE_CALENDAR==null && other.getTOLERANCE_CALENDAR()==null) || 
             (this.TOLERANCE_CALENDAR!=null &&
              this.TOLERANCE_CALENDAR.equals(other.getTOLERANCE_CALENDAR()))) &&
            ((this.START_OF_EXCLUDE_PERIOD==null && other.getSTART_OF_EXCLUDE_PERIOD()==null) || 
             (this.START_OF_EXCLUDE_PERIOD!=null &&
              this.START_OF_EXCLUDE_PERIOD.equals(other.getSTART_OF_EXCLUDE_PERIOD()))) &&
            ((this.END_OF_EXCLUDE_PERIOD==null && other.getEND_OF_EXCLUDE_PERIOD()==null) || 
             (this.END_OF_EXCLUDE_PERIOD!=null &&
              this.END_OF_EXCLUDE_PERIOD.equals(other.getEND_OF_EXCLUDE_PERIOD())));
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
        if (getSALES_TYPE() != null) {
            _hashCode += getSALES_TYPE().hashCode();
        }
        if (getSALES_REP_IS_STATISTICAL() != null) {
            _hashCode += getSALES_REP_IS_STATISTICAL().hashCode();
        }
        if (getGROSS_NET_SALES() != null) {
            _hashCode += getGROSS_NET_SALES().hashCode();
        }
        if (getFREQUENCY_TYPE() != null) {
            _hashCode += getFREQUENCY_TYPE().hashCode();
        }
        if (getFREQUENCY_START() != null) {
            _hashCode += getFREQUENCY_START().hashCode();
        }
        if (getFREQUENCY() != null) {
            _hashCode += getFREQUENCY().hashCode();
        }
        if (getFREQUENCY_UNIT() != null) {
            _hashCode += getFREQUENCY_UNIT().hashCode();
        }
        if (getTOLERANCE() != null) {
            _hashCode += getTOLERANCE().hashCode();
        }
        if (getTOLERANCE_UNIT() != null) {
            _hashCode += getTOLERANCE_UNIT().hashCode();
        }
        if (getTOLERANCE_CALENDAR() != null) {
            _hashCode += getTOLERANCE_CALENDAR().hashCode();
        }
        if (getSTART_OF_EXCLUDE_PERIOD() != null) {
            _hashCode += getSTART_OF_EXCLUDE_PERIOD().hashCode();
        }
        if (getEND_OF_EXCLUDE_PERIOD() != null) {
            _hashCode += getEND_OF_EXCLUDE_PERIOD().hashCode();
        }
        __hashCodeCalc = false;
        return _hashCode;
    }

    // Type metadata
    private static org.apache.axis.description.TypeDesc typeDesc =
        new org.apache.axis.description.TypeDesc(DT_ContractSearchSub_SR_REP.class, true);

    static {
        typeDesc.setXmlType(new javax.xml.namespace.QName("urn:ecc:rvs:contract", "DT_ContractSearchSub_SR_REP"));
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
        elemField.setFieldName("SALES_TYPE");
        elemField.setXmlName(new javax.xml.namespace.QName("", "SALES_TYPE"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("SALES_REP_IS_STATISTICAL");
        elemField.setXmlName(new javax.xml.namespace.QName("", "SALES_REP_IS_STATISTICAL"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("GROSS_NET_SALES");
        elemField.setXmlName(new javax.xml.namespace.QName("", "GROSS_NET_SALES"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("FREQUENCY_TYPE");
        elemField.setXmlName(new javax.xml.namespace.QName("", "FREQUENCY_TYPE"));
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
        elemField.setFieldName("TOLERANCE");
        elemField.setXmlName(new javax.xml.namespace.QName("", "TOLERANCE"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("TOLERANCE_UNIT");
        elemField.setXmlName(new javax.xml.namespace.QName("", "TOLERANCE_UNIT"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("TOLERANCE_CALENDAR");
        elemField.setXmlName(new javax.xml.namespace.QName("", "TOLERANCE_CALENDAR"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("START_OF_EXCLUDE_PERIOD");
        elemField.setXmlName(new javax.xml.namespace.QName("", "START_OF_EXCLUDE_PERIOD"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("END_OF_EXCLUDE_PERIOD");
        elemField.setXmlName(new javax.xml.namespace.QName("", "END_OF_EXCLUDE_PERIOD"));
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
