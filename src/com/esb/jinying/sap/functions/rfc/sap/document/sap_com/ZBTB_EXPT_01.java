/**
 * ZBTB_EXPT_01.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package com.esb.jinying.sap.functions.rfc.sap.document.sap_com;

public class ZBTB_EXPT_01  implements java.io.Serializable {
    private com.esb.jinying.sap.functions.rfc.sap.document.sap_com.ZBTB_PRMT[] IT_PRMT_INPUT;

    private com.esb.jinying.sap.functions.rfc.sap.document.sap_com.ZBTB_03[] ZBTB_ZFFS_OUTPUT;

    public ZBTB_EXPT_01() {
    }

    public ZBTB_EXPT_01(
           com.esb.jinying.sap.functions.rfc.sap.document.sap_com.ZBTB_PRMT[] IT_PRMT_INPUT,
           com.esb.jinying.sap.functions.rfc.sap.document.sap_com.ZBTB_03[] ZBTB_ZFFS_OUTPUT) {
           this.IT_PRMT_INPUT = IT_PRMT_INPUT;
           this.ZBTB_ZFFS_OUTPUT = ZBTB_ZFFS_OUTPUT;
    }


    /**
     * Gets the IT_PRMT_INPUT value for this ZBTB_EXPT_01.
     * 
     * @return IT_PRMT_INPUT
     */
    public com.esb.jinying.sap.functions.rfc.sap.document.sap_com.ZBTB_PRMT[] getIT_PRMT_INPUT() {
        return IT_PRMT_INPUT;
    }


    /**
     * Sets the IT_PRMT_INPUT value for this ZBTB_EXPT_01.
     * 
     * @param IT_PRMT_INPUT
     */
    public void setIT_PRMT_INPUT(com.esb.jinying.sap.functions.rfc.sap.document.sap_com.ZBTB_PRMT[] IT_PRMT_INPUT) {
        this.IT_PRMT_INPUT = IT_PRMT_INPUT;
    }


    /**
     * Gets the ZBTB_ZFFS_OUTPUT value for this ZBTB_EXPT_01.
     * 
     * @return ZBTB_ZFFS_OUTPUT
     */
    public com.esb.jinying.sap.functions.rfc.sap.document.sap_com.ZBTB_03[] getZBTB_ZFFS_OUTPUT() {
        return ZBTB_ZFFS_OUTPUT;
    }


    /**
     * Sets the ZBTB_ZFFS_OUTPUT value for this ZBTB_EXPT_01.
     * 
     * @param ZBTB_ZFFS_OUTPUT
     */
    public void setZBTB_ZFFS_OUTPUT(com.esb.jinying.sap.functions.rfc.sap.document.sap_com.ZBTB_03[] ZBTB_ZFFS_OUTPUT) {
        this.ZBTB_ZFFS_OUTPUT = ZBTB_ZFFS_OUTPUT;
    }

    private java.lang.Object __equalsCalc = null;
    public synchronized boolean equals(java.lang.Object obj) {
        if (!(obj instanceof ZBTB_EXPT_01)) return false;
        ZBTB_EXPT_01 other = (ZBTB_EXPT_01) obj;
        if (obj == null) return false;
        if (this == obj) return true;
        if (__equalsCalc != null) {
            return (__equalsCalc == obj);
        }
        __equalsCalc = obj;
        boolean _equals;
        _equals = true && 
            ((this.IT_PRMT_INPUT==null && other.getIT_PRMT_INPUT()==null) || 
             (this.IT_PRMT_INPUT!=null &&
              java.util.Arrays.equals(this.IT_PRMT_INPUT, other.getIT_PRMT_INPUT()))) &&
            ((this.ZBTB_ZFFS_OUTPUT==null && other.getZBTB_ZFFS_OUTPUT()==null) || 
             (this.ZBTB_ZFFS_OUTPUT!=null &&
              java.util.Arrays.equals(this.ZBTB_ZFFS_OUTPUT, other.getZBTB_ZFFS_OUTPUT())));
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
        if (getIT_PRMT_INPUT() != null) {
            for (int i=0;
                 i<java.lang.reflect.Array.getLength(getIT_PRMT_INPUT());
                 i++) {
                java.lang.Object obj = java.lang.reflect.Array.get(getIT_PRMT_INPUT(), i);
                if (obj != null &&
                    !obj.getClass().isArray()) {
                    _hashCode += obj.hashCode();
                }
            }
        }
        if (getZBTB_ZFFS_OUTPUT() != null) {
            for (int i=0;
                 i<java.lang.reflect.Array.getLength(getZBTB_ZFFS_OUTPUT());
                 i++) {
                java.lang.Object obj = java.lang.reflect.Array.get(getZBTB_ZFFS_OUTPUT(), i);
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
        new org.apache.axis.description.TypeDesc(ZBTB_EXPT_01.class, true);

    static {
        typeDesc.setXmlType(new javax.xml.namespace.QName("urn:sap-com:document:sap:rfc:functions", ">ZBTB_EXPT_01"));
        org.apache.axis.description.ElementDesc elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("IT_PRMT_INPUT");
        elemField.setXmlName(new javax.xml.namespace.QName("", "IT_PRMT_INPUT"));
        elemField.setXmlType(new javax.xml.namespace.QName("urn:sap-com:document:sap:rfc:functions", "ZBTB_PRMT"));
        elemField.setNillable(false);
        elemField.setItemQName(new javax.xml.namespace.QName("", "item"));
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("ZBTB_ZFFS_OUTPUT");
        elemField.setXmlName(new javax.xml.namespace.QName("", "ZBTB_ZFFS_OUTPUT"));
        elemField.setXmlType(new javax.xml.namespace.QName("urn:sap-com:document:sap:rfc:functions", "ZBTB_03"));
        elemField.setMinOccurs(0);
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
