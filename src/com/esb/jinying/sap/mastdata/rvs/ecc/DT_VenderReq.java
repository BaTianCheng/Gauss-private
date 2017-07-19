/**
 * DT_VenderReq.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package com.esb.jinying.sap.mastdata.rvs.ecc;

public class DT_VenderReq  implements java.io.Serializable {
    /* 日期 */
    private java.lang.String i_DATE;

    /* 供应商或债权人的帐号 */
    private java.lang.String i_LIFNR;

    public DT_VenderReq() {
    }

    public DT_VenderReq(
           java.lang.String i_DATE,
           java.lang.String i_LIFNR) {
           this.i_DATE = i_DATE;
           this.i_LIFNR = i_LIFNR;
    }


    /**
     * Gets the i_DATE value for this DT_VenderReq.
     * 
     * @return i_DATE   * 日期
     */
    public java.lang.String getI_DATE() {
        return i_DATE;
    }


    /**
     * Sets the i_DATE value for this DT_VenderReq.
     * 
     * @param i_DATE   * 日期
     */
    public void setI_DATE(java.lang.String i_DATE) {
        this.i_DATE = i_DATE;
    }


    /**
     * Gets the i_LIFNR value for this DT_VenderReq.
     * 
     * @return i_LIFNR   * 供应商或债权人的帐号
     */
    public java.lang.String getI_LIFNR() {
        return i_LIFNR;
    }


    /**
     * Sets the i_LIFNR value for this DT_VenderReq.
     * 
     * @param i_LIFNR   * 供应商或债权人的帐号
     */
    public void setI_LIFNR(java.lang.String i_LIFNR) {
        this.i_LIFNR = i_LIFNR;
    }

    private java.lang.Object __equalsCalc = null;
    public synchronized boolean equals(java.lang.Object obj) {
        if (!(obj instanceof DT_VenderReq)) return false;
        DT_VenderReq other = (DT_VenderReq) obj;
        if (obj == null) return false;
        if (this == obj) return true;
        if (__equalsCalc != null) {
            return (__equalsCalc == obj);
        }
        __equalsCalc = obj;
        boolean _equals;
        _equals = true && 
            ((this.i_DATE==null && other.getI_DATE()==null) || 
             (this.i_DATE!=null &&
              this.i_DATE.equals(other.getI_DATE()))) &&
            ((this.i_LIFNR==null && other.getI_LIFNR()==null) || 
             (this.i_LIFNR!=null &&
              this.i_LIFNR.equals(other.getI_LIFNR())));
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
        if (getI_DATE() != null) {
            _hashCode += getI_DATE().hashCode();
        }
        if (getI_LIFNR() != null) {
            _hashCode += getI_LIFNR().hashCode();
        }
        __hashCodeCalc = false;
        return _hashCode;
    }

    // Type metadata
    private static org.apache.axis.description.TypeDesc typeDesc =
        new org.apache.axis.description.TypeDesc(DT_VenderReq.class, true);

    static {
        typeDesc.setXmlType(new javax.xml.namespace.QName("urn:ecc:rvs:mastdata", "DT_VenderReq"));
        org.apache.axis.description.ElementDesc elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("i_DATE");
        elemField.setXmlName(new javax.xml.namespace.QName("", "I_DATE"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("i_LIFNR");
        elemField.setXmlName(new javax.xml.namespace.QName("", "I_LIFNR"));
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
