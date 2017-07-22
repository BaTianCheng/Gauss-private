/**
 * ZSBW004A.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package com.esb.jinying.sap.functions.rfc.sap.document.sap_com;

public class ZSBW004A  implements java.io.Serializable {
    private java.lang.String MATERIAL;

    private java.lang.String TXTMD;

    public ZSBW004A() {
    }

    public ZSBW004A(
           java.lang.String MATERIAL,
           java.lang.String TXTMD) {
           this.MATERIAL = MATERIAL;
           this.TXTMD = TXTMD;
    }


    /**
     * Gets the MATERIAL value for this ZSBW004A.
     * 
     * @return MATERIAL
     */
    public java.lang.String getMATERIAL() {
        return MATERIAL;
    }


    /**
     * Sets the MATERIAL value for this ZSBW004A.
     * 
     * @param MATERIAL
     */
    public void setMATERIAL(java.lang.String MATERIAL) {
        this.MATERIAL = MATERIAL;
    }


    /**
     * Gets the TXTMD value for this ZSBW004A.
     * 
     * @return TXTMD
     */
    public java.lang.String getTXTMD() {
        return TXTMD;
    }


    /**
     * Sets the TXTMD value for this ZSBW004A.
     * 
     * @param TXTMD
     */
    public void setTXTMD(java.lang.String TXTMD) {
        this.TXTMD = TXTMD;
    }

    private java.lang.Object __equalsCalc = null;
    public synchronized boolean equals(java.lang.Object obj) {
        if (!(obj instanceof ZSBW004A)) return false;
        ZSBW004A other = (ZSBW004A) obj;
        if (obj == null) return false;
        if (this == obj) return true;
        if (__equalsCalc != null) {
            return (__equalsCalc == obj);
        }
        __equalsCalc = obj;
        boolean _equals;
        _equals = true && 
            ((this.MATERIAL==null && other.getMATERIAL()==null) || 
             (this.MATERIAL!=null &&
              this.MATERIAL.equals(other.getMATERIAL()))) &&
            ((this.TXTMD==null && other.getTXTMD()==null) || 
             (this.TXTMD!=null &&
              this.TXTMD.equals(other.getTXTMD())));
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
        if (getMATERIAL() != null) {
            _hashCode += getMATERIAL().hashCode();
        }
        if (getTXTMD() != null) {
            _hashCode += getTXTMD().hashCode();
        }
        __hashCodeCalc = false;
        return _hashCode;
    }

    // Type metadata
    private static org.apache.axis.description.TypeDesc typeDesc =
        new org.apache.axis.description.TypeDesc(ZSBW004A.class, true);

    static {
        typeDesc.setXmlType(new javax.xml.namespace.QName("urn:sap-com:document:sap:rfc:functions", "ZSBW004A"));
        org.apache.axis.description.ElementDesc elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("MATERIAL");
        elemField.setXmlName(new javax.xml.namespace.QName("", "MATERIAL"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("TXTMD");
        elemField.setXmlName(new javax.xml.namespace.QName("", "TXTMD"));
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
