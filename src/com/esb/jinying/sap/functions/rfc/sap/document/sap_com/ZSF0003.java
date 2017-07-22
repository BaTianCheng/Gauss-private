/**
 * ZSF0003.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package com.esb.jinying.sap.functions.rfc.sap.document.sap_com;

public class ZSF0003  implements java.io.Serializable {
    private java.lang.String[] o_XML;

    private com.esb.jinying.sap.functions.rfc.sap.document.sap_com.Date INDAT;

    public ZSF0003() {
    }

    public ZSF0003(
           java.lang.String[] o_XML,
           com.esb.jinying.sap.functions.rfc.sap.document.sap_com.Date INDAT) {
           this.o_XML = o_XML;
           this.INDAT = INDAT;
    }


    /**
     * Gets the o_XML value for this ZSF0003.
     * 
     * @return o_XML
     */
    public java.lang.String[] getO_XML() {
        return o_XML;
    }


    /**
     * Sets the o_XML value for this ZSF0003.
     * 
     * @param o_XML
     */
    public void setO_XML(java.lang.String[] o_XML) {
        this.o_XML = o_XML;
    }


    /**
     * Gets the INDAT value for this ZSF0003.
     * 
     * @return INDAT
     */
    public com.esb.jinying.sap.functions.rfc.sap.document.sap_com.Date getINDAT() {
        return INDAT;
    }


    /**
     * Sets the INDAT value for this ZSF0003.
     * 
     * @param INDAT
     */
    public void setINDAT(com.esb.jinying.sap.functions.rfc.sap.document.sap_com.Date INDAT) {
        this.INDAT = INDAT;
    }

    private java.lang.Object __equalsCalc = null;
    public synchronized boolean equals(java.lang.Object obj) {
        if (!(obj instanceof ZSF0003)) return false;
        ZSF0003 other = (ZSF0003) obj;
        if (obj == null) return false;
        if (this == obj) return true;
        if (__equalsCalc != null) {
            return (__equalsCalc == obj);
        }
        __equalsCalc = obj;
        boolean _equals;
        _equals = true && 
            ((this.o_XML==null && other.getO_XML()==null) || 
             (this.o_XML!=null &&
              java.util.Arrays.equals(this.o_XML, other.getO_XML()))) &&
            ((this.INDAT==null && other.getINDAT()==null) || 
             (this.INDAT!=null &&
              this.INDAT.equals(other.getINDAT())));
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
        if (getO_XML() != null) {
            for (int i=0;
                 i<java.lang.reflect.Array.getLength(getO_XML());
                 i++) {
                java.lang.Object obj = java.lang.reflect.Array.get(getO_XML(), i);
                if (obj != null &&
                    !obj.getClass().isArray()) {
                    _hashCode += obj.hashCode();
                }
            }
        }
        if (getINDAT() != null) {
            _hashCode += getINDAT().hashCode();
        }
        __hashCodeCalc = false;
        return _hashCode;
    }

    // Type metadata
    private static org.apache.axis.description.TypeDesc typeDesc =
        new org.apache.axis.description.TypeDesc(ZSF0003.class, true);

    static {
        typeDesc.setXmlType(new javax.xml.namespace.QName("urn:sap-com:document:sap:rfc:functions", ">ZSF0003"));
        org.apache.axis.description.ElementDesc elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("o_XML");
        elemField.setXmlName(new javax.xml.namespace.QName("", "O_XML"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        elemField.setItemQName(new javax.xml.namespace.QName("", "item"));
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("INDAT");
        elemField.setXmlName(new javax.xml.namespace.QName("", "INDAT"));
        elemField.setXmlType(new javax.xml.namespace.QName("urn:sap-com:document:sap:rfc:functions", "date"));
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
