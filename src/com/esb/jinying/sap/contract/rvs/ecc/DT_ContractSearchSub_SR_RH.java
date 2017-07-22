/**
 * DT_ContractSearchSub_SR_RH.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package com.esb.jinying.sap.contract.rvs.ecc;

public class DT_ContractSearchSub_SR_RH  implements java.io.Serializable {
    /* 对象的标识 */
    private java.lang.String OBJECT_ID;

    /* 条款编号 */
    private java.lang.String TERM_NO;

    /* 条款的生效日期 */
    private java.lang.String VALID_FROM;

    /* 频率类型 */
    private java.lang.String FREQUENCY_TYPE;

    /* 频率的开始 */
    private java.lang.String FREQUENCY_START;

    /* 期间频率单位的数量 */
    private java.lang.String FREQUENCY;

    /* 频率单位 */
    private java.lang.String FREQUENCY_UNIT;

    /* 按比例的方法 */
    private java.lang.String PRO_RATA_METHOD;

    /* 时间相关期间的计算方法 */
    private java.lang.String PRO_RATA_METHOD_CALCULATION;

    /* 已支付累计结算内的贷方 */
    private java.lang.String PAY_CREDITS;

    public DT_ContractSearchSub_SR_RH() {
    }

    public DT_ContractSearchSub_SR_RH(
           java.lang.String OBJECT_ID,
           java.lang.String TERM_NO,
           java.lang.String VALID_FROM,
           java.lang.String FREQUENCY_TYPE,
           java.lang.String FREQUENCY_START,
           java.lang.String FREQUENCY,
           java.lang.String FREQUENCY_UNIT,
           java.lang.String PRO_RATA_METHOD,
           java.lang.String PRO_RATA_METHOD_CALCULATION,
           java.lang.String PAY_CREDITS) {
           this.OBJECT_ID = OBJECT_ID;
           this.TERM_NO = TERM_NO;
           this.VALID_FROM = VALID_FROM;
           this.FREQUENCY_TYPE = FREQUENCY_TYPE;
           this.FREQUENCY_START = FREQUENCY_START;
           this.FREQUENCY = FREQUENCY;
           this.FREQUENCY_UNIT = FREQUENCY_UNIT;
           this.PRO_RATA_METHOD = PRO_RATA_METHOD;
           this.PRO_RATA_METHOD_CALCULATION = PRO_RATA_METHOD_CALCULATION;
           this.PAY_CREDITS = PAY_CREDITS;
    }


    /**
     * Gets the OBJECT_ID value for this DT_ContractSearchSub_SR_RH.
     * 
     * @return OBJECT_ID   * 对象的标识
     */
    public java.lang.String getOBJECT_ID() {
        return OBJECT_ID;
    }


    /**
     * Sets the OBJECT_ID value for this DT_ContractSearchSub_SR_RH.
     * 
     * @param OBJECT_ID   * 对象的标识
     */
    public void setOBJECT_ID(java.lang.String OBJECT_ID) {
        this.OBJECT_ID = OBJECT_ID;
    }


    /**
     * Gets the TERM_NO value for this DT_ContractSearchSub_SR_RH.
     * 
     * @return TERM_NO   * 条款编号
     */
    public java.lang.String getTERM_NO() {
        return TERM_NO;
    }


    /**
     * Sets the TERM_NO value for this DT_ContractSearchSub_SR_RH.
     * 
     * @param TERM_NO   * 条款编号
     */
    public void setTERM_NO(java.lang.String TERM_NO) {
        this.TERM_NO = TERM_NO;
    }


    /**
     * Gets the VALID_FROM value for this DT_ContractSearchSub_SR_RH.
     * 
     * @return VALID_FROM   * 条款的生效日期
     */
    public java.lang.String getVALID_FROM() {
        return VALID_FROM;
    }


    /**
     * Sets the VALID_FROM value for this DT_ContractSearchSub_SR_RH.
     * 
     * @param VALID_FROM   * 条款的生效日期
     */
    public void setVALID_FROM(java.lang.String VALID_FROM) {
        this.VALID_FROM = VALID_FROM;
    }


    /**
     * Gets the FREQUENCY_TYPE value for this DT_ContractSearchSub_SR_RH.
     * 
     * @return FREQUENCY_TYPE   * 频率类型
     */
    public java.lang.String getFREQUENCY_TYPE() {
        return FREQUENCY_TYPE;
    }


    /**
     * Sets the FREQUENCY_TYPE value for this DT_ContractSearchSub_SR_RH.
     * 
     * @param FREQUENCY_TYPE   * 频率类型
     */
    public void setFREQUENCY_TYPE(java.lang.String FREQUENCY_TYPE) {
        this.FREQUENCY_TYPE = FREQUENCY_TYPE;
    }


    /**
     * Gets the FREQUENCY_START value for this DT_ContractSearchSub_SR_RH.
     * 
     * @return FREQUENCY_START   * 频率的开始
     */
    public java.lang.String getFREQUENCY_START() {
        return FREQUENCY_START;
    }


    /**
     * Sets the FREQUENCY_START value for this DT_ContractSearchSub_SR_RH.
     * 
     * @param FREQUENCY_START   * 频率的开始
     */
    public void setFREQUENCY_START(java.lang.String FREQUENCY_START) {
        this.FREQUENCY_START = FREQUENCY_START;
    }


    /**
     * Gets the FREQUENCY value for this DT_ContractSearchSub_SR_RH.
     * 
     * @return FREQUENCY   * 期间频率单位的数量
     */
    public java.lang.String getFREQUENCY() {
        return FREQUENCY;
    }


    /**
     * Sets the FREQUENCY value for this DT_ContractSearchSub_SR_RH.
     * 
     * @param FREQUENCY   * 期间频率单位的数量
     */
    public void setFREQUENCY(java.lang.String FREQUENCY) {
        this.FREQUENCY = FREQUENCY;
    }


    /**
     * Gets the FREQUENCY_UNIT value for this DT_ContractSearchSub_SR_RH.
     * 
     * @return FREQUENCY_UNIT   * 频率单位
     */
    public java.lang.String getFREQUENCY_UNIT() {
        return FREQUENCY_UNIT;
    }


    /**
     * Sets the FREQUENCY_UNIT value for this DT_ContractSearchSub_SR_RH.
     * 
     * @param FREQUENCY_UNIT   * 频率单位
     */
    public void setFREQUENCY_UNIT(java.lang.String FREQUENCY_UNIT) {
        this.FREQUENCY_UNIT = FREQUENCY_UNIT;
    }


    /**
     * Gets the PRO_RATA_METHOD value for this DT_ContractSearchSub_SR_RH.
     * 
     * @return PRO_RATA_METHOD   * 按比例的方法
     */
    public java.lang.String getPRO_RATA_METHOD() {
        return PRO_RATA_METHOD;
    }


    /**
     * Sets the PRO_RATA_METHOD value for this DT_ContractSearchSub_SR_RH.
     * 
     * @param PRO_RATA_METHOD   * 按比例的方法
     */
    public void setPRO_RATA_METHOD(java.lang.String PRO_RATA_METHOD) {
        this.PRO_RATA_METHOD = PRO_RATA_METHOD;
    }


    /**
     * Gets the PRO_RATA_METHOD_CALCULATION value for this DT_ContractSearchSub_SR_RH.
     * 
     * @return PRO_RATA_METHOD_CALCULATION   * 时间相关期间的计算方法
     */
    public java.lang.String getPRO_RATA_METHOD_CALCULATION() {
        return PRO_RATA_METHOD_CALCULATION;
    }


    /**
     * Sets the PRO_RATA_METHOD_CALCULATION value for this DT_ContractSearchSub_SR_RH.
     * 
     * @param PRO_RATA_METHOD_CALCULATION   * 时间相关期间的计算方法
     */
    public void setPRO_RATA_METHOD_CALCULATION(java.lang.String PRO_RATA_METHOD_CALCULATION) {
        this.PRO_RATA_METHOD_CALCULATION = PRO_RATA_METHOD_CALCULATION;
    }


    /**
     * Gets the PAY_CREDITS value for this DT_ContractSearchSub_SR_RH.
     * 
     * @return PAY_CREDITS   * 已支付累计结算内的贷方
     */
    public java.lang.String getPAY_CREDITS() {
        return PAY_CREDITS;
    }


    /**
     * Sets the PAY_CREDITS value for this DT_ContractSearchSub_SR_RH.
     * 
     * @param PAY_CREDITS   * 已支付累计结算内的贷方
     */
    public void setPAY_CREDITS(java.lang.String PAY_CREDITS) {
        this.PAY_CREDITS = PAY_CREDITS;
    }

    private java.lang.Object __equalsCalc = null;
    public synchronized boolean equals(java.lang.Object obj) {
        if (!(obj instanceof DT_ContractSearchSub_SR_RH)) return false;
        DT_ContractSearchSub_SR_RH other = (DT_ContractSearchSub_SR_RH) obj;
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
            ((this.PRO_RATA_METHOD==null && other.getPRO_RATA_METHOD()==null) || 
             (this.PRO_RATA_METHOD!=null &&
              this.PRO_RATA_METHOD.equals(other.getPRO_RATA_METHOD()))) &&
            ((this.PRO_RATA_METHOD_CALCULATION==null && other.getPRO_RATA_METHOD_CALCULATION()==null) || 
             (this.PRO_RATA_METHOD_CALCULATION!=null &&
              this.PRO_RATA_METHOD_CALCULATION.equals(other.getPRO_RATA_METHOD_CALCULATION()))) &&
            ((this.PAY_CREDITS==null && other.getPAY_CREDITS()==null) || 
             (this.PAY_CREDITS!=null &&
              this.PAY_CREDITS.equals(other.getPAY_CREDITS())));
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
        if (getPRO_RATA_METHOD() != null) {
            _hashCode += getPRO_RATA_METHOD().hashCode();
        }
        if (getPRO_RATA_METHOD_CALCULATION() != null) {
            _hashCode += getPRO_RATA_METHOD_CALCULATION().hashCode();
        }
        if (getPAY_CREDITS() != null) {
            _hashCode += getPAY_CREDITS().hashCode();
        }
        __hashCodeCalc = false;
        return _hashCode;
    }

    // Type metadata
    private static org.apache.axis.description.TypeDesc typeDesc =
        new org.apache.axis.description.TypeDesc(DT_ContractSearchSub_SR_RH.class, true);

    static {
        typeDesc.setXmlType(new javax.xml.namespace.QName("urn:ecc:rvs:contract", "DT_ContractSearchSub_SR_RH"));
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
        elemField.setFieldName("PAY_CREDITS");
        elemField.setXmlName(new javax.xml.namespace.QName("", "PAY_CREDITS"));
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
