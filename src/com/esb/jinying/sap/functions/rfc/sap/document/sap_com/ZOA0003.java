/**
 * ZOA0003.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package com.esb.jinying.sap.functions.rfc.sap.document.sap_com;

public class ZOA0003  implements java.io.Serializable {
    private java.lang.String i_TEXT;

    private com.esb.jinying.sap.functions.rfc.sap.document.sap_com.ZOA003[] ZOA003;

    public ZOA0003() {
    }

    public ZOA0003(
           java.lang.String i_TEXT,
           com.esb.jinying.sap.functions.rfc.sap.document.sap_com.ZOA003[] ZOA003) {
           this.i_TEXT = i_TEXT;
           this.ZOA003 = ZOA003;
    }


    /**
     * Gets the i_TEXT value for this ZOA0003.
     * 
     * @return i_TEXT
     */
    public java.lang.String getI_TEXT() {
        return i_TEXT;
    }


    /**
     * Sets the i_TEXT value for this ZOA0003.
     * 
     * @param i_TEXT
     */
    public void setI_TEXT(java.lang.String i_TEXT) {
        this.i_TEXT = i_TEXT;
    }


    /**
     * Gets the ZOA003 value for this ZOA0003.
     * 
     * @return ZOA003
     */
    public com.esb.jinying.sap.functions.rfc.sap.document.sap_com.ZOA003[] getZOA003() {
        return ZOA003;
    }


    /**
     * Sets the ZOA003 value for this ZOA0003.
     * 
     * @param ZOA003
     */
    public void setZOA003(com.esb.jinying.sap.functions.rfc.sap.document.sap_com.ZOA003[] ZOA003) {
        this.ZOA003 = ZOA003;
    }

    private java.lang.Object __equalsCalc = null;
    public synchronized boolean equals(java.lang.Object obj) {
        if (!(obj instanceof ZOA0003)) return false;
        ZOA0003 other = (ZOA0003) obj;
        if (obj == null) return false;
        if (this == obj) return true;
        if (__equalsCalc != null) {
            return (__equalsCalc == obj);
        }
        __equalsCalc = obj;
        boolean _equals;
        _equals = true && 
            ((this.i_TEXT==null && other.getI_TEXT()==null) || 
             (this.i_TEXT!=null &&
              this.i_TEXT.equals(other.getI_TEXT()))) &&
            ((this.ZOA003==null && other.getZOA003()==null) || 
             (this.ZOA003!=null &&
              java.util.Arrays.equals(this.ZOA003, other.getZOA003())));
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
        if (getI_TEXT() != null) {
            _hashCode += getI_TEXT().hashCode();
        }
        if (getZOA003() != null) {
            for (int i=0;
                 i<java.lang.reflect.Array.getLength(getZOA003());
                 i++) {
                java.lang.Object obj = java.lang.reflect.Array.get(getZOA003(), i);
                if (obj != null &&
                    !obj.getClass().isArray()) {
                    _hashCode += obj.hashCode();
                }
            }
        }
        __hashCodeCalc = false;
        return _hashCode;
    }

    // Type metadata
    private static org.apache.axis.description.TypeDesc typeDesc =
        new org.apache.axis.description.TypeDesc(ZOA0003.class, true);

    static {
        typeDesc.setXmlType(new javax.xml.namespace.QName("urn:sap-com:document:sap:rfc:functions", ">ZOA0003"));
        org.apache.axis.description.ElementDesc elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("i_TEXT");
        elemField.setXmlName(new javax.xml.namespace.QName("", "I_TEXT"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("ZOA003");
        elemField.setXmlName(new javax.xml.namespace.QName("", "ZOA003"));
        elemField.setXmlType(new javax.xml.namespace.QName("urn:sap-com:document:sap:rfc:functions", "ZOA003"));
        elemField.setNillable(false);
        elemField.setItemQName(new javax.xml.namespace.QName("", "item"));
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
