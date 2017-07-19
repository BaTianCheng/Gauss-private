/**
 * ZDP001.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package com.esb.jinying.sap.functions.rfc.sap.document.sap_com;

public class ZDP001  implements java.io.Serializable {
    private com.esb.jinying.sap.functions.rfc.sap.document.sap_com.ZSDP001[] TAB_IN1;

    private com.esb.jinying.sap.functions.rfc.sap.document.sap_com.ZSDPMESS[] TAB_MESS;

    public ZDP001() {
    }

    public ZDP001(
           com.esb.jinying.sap.functions.rfc.sap.document.sap_com.ZSDP001[] TAB_IN1,
           com.esb.jinying.sap.functions.rfc.sap.document.sap_com.ZSDPMESS[] TAB_MESS) {
           this.TAB_IN1 = TAB_IN1;
           this.TAB_MESS = TAB_MESS;
    }


    /**
     * Gets the TAB_IN1 value for this ZDP001.
     * 
     * @return TAB_IN1
     */
    public com.esb.jinying.sap.functions.rfc.sap.document.sap_com.ZSDP001[] getTAB_IN1() {
        return TAB_IN1;
    }


    /**
     * Sets the TAB_IN1 value for this ZDP001.
     * 
     * @param TAB_IN1
     */
    public void setTAB_IN1(com.esb.jinying.sap.functions.rfc.sap.document.sap_com.ZSDP001[] TAB_IN1) {
        this.TAB_IN1 = TAB_IN1;
    }


    /**
     * Gets the TAB_MESS value for this ZDP001.
     * 
     * @return TAB_MESS
     */
    public com.esb.jinying.sap.functions.rfc.sap.document.sap_com.ZSDPMESS[] getTAB_MESS() {
        return TAB_MESS;
    }


    /**
     * Sets the TAB_MESS value for this ZDP001.
     * 
     * @param TAB_MESS
     */
    public void setTAB_MESS(com.esb.jinying.sap.functions.rfc.sap.document.sap_com.ZSDPMESS[] TAB_MESS) {
        this.TAB_MESS = TAB_MESS;
    }

    private java.lang.Object __equalsCalc = null;
    public synchronized boolean equals(java.lang.Object obj) {
        if (!(obj instanceof ZDP001)) return false;
        ZDP001 other = (ZDP001) obj;
        if (obj == null) return false;
        if (this == obj) return true;
        if (__equalsCalc != null) {
            return (__equalsCalc == obj);
        }
        __equalsCalc = obj;
        boolean _equals;
        _equals = true && 
            ((this.TAB_IN1==null && other.getTAB_IN1()==null) || 
             (this.TAB_IN1!=null &&
              java.util.Arrays.equals(this.TAB_IN1, other.getTAB_IN1()))) &&
            ((this.TAB_MESS==null && other.getTAB_MESS()==null) || 
             (this.TAB_MESS!=null &&
              java.util.Arrays.equals(this.TAB_MESS, other.getTAB_MESS())));
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
        if (getTAB_IN1() != null) {
            for (int i=0;
                 i<java.lang.reflect.Array.getLength(getTAB_IN1());
                 i++) {
                java.lang.Object obj = java.lang.reflect.Array.get(getTAB_IN1(), i);
                if (obj != null &&
                    !obj.getClass().isArray()) {
                    _hashCode += obj.hashCode();
                }
            }
        }
        if (getTAB_MESS() != null) {
            for (int i=0;
                 i<java.lang.reflect.Array.getLength(getTAB_MESS());
                 i++) {
                java.lang.Object obj = java.lang.reflect.Array.get(getTAB_MESS(), i);
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
        new org.apache.axis.description.TypeDesc(ZDP001.class, true);

    static {
        typeDesc.setXmlType(new javax.xml.namespace.QName("urn:sap-com:document:sap:rfc:functions", ">ZDP001"));
        org.apache.axis.description.ElementDesc elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("TAB_IN1");
        elemField.setXmlName(new javax.xml.namespace.QName("", "TAB_IN1"));
        elemField.setXmlType(new javax.xml.namespace.QName("urn:sap-com:document:sap:rfc:functions", "ZSDP001"));
        elemField.setNillable(false);
        elemField.setItemQName(new javax.xml.namespace.QName("", "item"));
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("TAB_MESS");
        elemField.setXmlName(new javax.xml.namespace.QName("", "TAB_MESS"));
        elemField.setXmlType(new javax.xml.namespace.QName("urn:sap-com:document:sap:rfc:functions", "ZSDPMESS"));
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
