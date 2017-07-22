/**
 * DT_ADChargeTypeRespRow.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package com.esb.jinying.sap.contract.rvs.ecc;

public class DT_ADChargeTypeRespRow  implements java.io.Serializable {
    /* 费用名称 */
    private java.lang.String ZFYTYPES;

    /* 错误代码 */
    private java.lang.String CODE;

    /* 错误信息 */
    private java.lang.String MESSAGE;

    public DT_ADChargeTypeRespRow() {
    }

    public DT_ADChargeTypeRespRow(
           java.lang.String ZFYTYPES,
           java.lang.String CODE,
           java.lang.String MESSAGE) {
           this.ZFYTYPES = ZFYTYPES;
           this.CODE = CODE;
           this.MESSAGE = MESSAGE;
    }


    /**
     * Gets the ZFYTYPES value for this DT_ADChargeTypeRespRow.
     * 
     * @return ZFYTYPES   * 费用名称
     */
    public java.lang.String getZFYTYPES() {
        return ZFYTYPES;
    }


    /**
     * Sets the ZFYTYPES value for this DT_ADChargeTypeRespRow.
     * 
     * @param ZFYTYPES   * 费用名称
     */
    public void setZFYTYPES(java.lang.String ZFYTYPES) {
        this.ZFYTYPES = ZFYTYPES;
    }


    /**
     * Gets the CODE value for this DT_ADChargeTypeRespRow.
     * 
     * @return CODE   * 错误代码
     */
    public java.lang.String getCODE() {
        return CODE;
    }


    /**
     * Sets the CODE value for this DT_ADChargeTypeRespRow.
     * 
     * @param CODE   * 错误代码
     */
    public void setCODE(java.lang.String CODE) {
        this.CODE = CODE;
    }


    /**
     * Gets the MESSAGE value for this DT_ADChargeTypeRespRow.
     * 
     * @return MESSAGE   * 错误信息
     */
    public java.lang.String getMESSAGE() {
        return MESSAGE;
    }


    /**
     * Sets the MESSAGE value for this DT_ADChargeTypeRespRow.
     * 
     * @param MESSAGE   * 错误信息
     */
    public void setMESSAGE(java.lang.String MESSAGE) {
        this.MESSAGE = MESSAGE;
    }

    private java.lang.Object __equalsCalc = null;
    public synchronized boolean equals(java.lang.Object obj) {
        if (!(obj instanceof DT_ADChargeTypeRespRow)) return false;
        DT_ADChargeTypeRespRow other = (DT_ADChargeTypeRespRow) obj;
        if (obj == null) return false;
        if (this == obj) return true;
        if (__equalsCalc != null) {
            return (__equalsCalc == obj);
        }
        __equalsCalc = obj;
        boolean _equals;
        _equals = true && 
            ((this.ZFYTYPES==null && other.getZFYTYPES()==null) || 
             (this.ZFYTYPES!=null &&
              this.ZFYTYPES.equals(other.getZFYTYPES()))) &&
            ((this.CODE==null && other.getCODE()==null) || 
             (this.CODE!=null &&
              this.CODE.equals(other.getCODE()))) &&
            ((this.MESSAGE==null && other.getMESSAGE()==null) || 
             (this.MESSAGE!=null &&
              this.MESSAGE.equals(other.getMESSAGE())));
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
        if (getZFYTYPES() != null) {
            _hashCode += getZFYTYPES().hashCode();
        }
        if (getCODE() != null) {
            _hashCode += getCODE().hashCode();
        }
        if (getMESSAGE() != null) {
            _hashCode += getMESSAGE().hashCode();
        }
        __hashCodeCalc = false;
        return _hashCode;
    }

    // Type metadata
    private static org.apache.axis.description.TypeDesc typeDesc =
        new org.apache.axis.description.TypeDesc(DT_ADChargeTypeRespRow.class, true);

    static {
        typeDesc.setXmlType(new javax.xml.namespace.QName("urn:ecc:rvs:contract", ">DT_ADChargeTypeResp>row"));
        org.apache.axis.description.ElementDesc elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("ZFYTYPES");
        elemField.setXmlName(new javax.xml.namespace.QName("", "ZFYTYPES"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("CODE");
        elemField.setXmlName(new javax.xml.namespace.QName("", "CODE"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("MESSAGE");
        elemField.setXmlName(new javax.xml.namespace.QName("", "MESSAGE"));
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
