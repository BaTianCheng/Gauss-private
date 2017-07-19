/**
 * ZFM_INT_BW015.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package com.esb.jinying.sap.functions.rfc.sap.document.sap_com;

public class ZFM_INT_BW015  implements java.io.Serializable {
    private java.lang.String ZMONTH;

    private com.esb.jinying.sap.functions.rfc.sap.document.sap_com.ZTZLPP[] z_OUT;

    public ZFM_INT_BW015() {
    }

    public ZFM_INT_BW015(
           java.lang.String ZMONTH,
           com.esb.jinying.sap.functions.rfc.sap.document.sap_com.ZTZLPP[] z_OUT) {
           this.ZMONTH = ZMONTH;
           this.z_OUT = z_OUT;
    }


    /**
     * Gets the ZMONTH value for this ZFM_INT_BW015.
     * 
     * @return ZMONTH
     */
    public java.lang.String getZMONTH() {
        return ZMONTH;
    }


    /**
     * Sets the ZMONTH value for this ZFM_INT_BW015.
     * 
     * @param ZMONTH
     */
    public void setZMONTH(java.lang.String ZMONTH) {
        this.ZMONTH = ZMONTH;
    }


    /**
     * Gets the z_OUT value for this ZFM_INT_BW015.
     * 
     * @return z_OUT
     */
    public com.esb.jinying.sap.functions.rfc.sap.document.sap_com.ZTZLPP[] getZ_OUT() {
        return z_OUT;
    }


    /**
     * Sets the z_OUT value for this ZFM_INT_BW015.
     * 
     * @param z_OUT
     */
    public void setZ_OUT(com.esb.jinying.sap.functions.rfc.sap.document.sap_com.ZTZLPP[] z_OUT) {
        this.z_OUT = z_OUT;
    }

    private java.lang.Object __equalsCalc = null;
    public synchronized boolean equals(java.lang.Object obj) {
        if (!(obj instanceof ZFM_INT_BW015)) return false;
        ZFM_INT_BW015 other = (ZFM_INT_BW015) obj;
        if (obj == null) return false;
        if (this == obj) return true;
        if (__equalsCalc != null) {
            return (__equalsCalc == obj);
        }
        __equalsCalc = obj;
        boolean _equals;
        _equals = true && 
            ((this.ZMONTH==null && other.getZMONTH()==null) || 
             (this.ZMONTH!=null &&
              this.ZMONTH.equals(other.getZMONTH()))) &&
            ((this.z_OUT==null && other.getZ_OUT()==null) || 
             (this.z_OUT!=null &&
              java.util.Arrays.equals(this.z_OUT, other.getZ_OUT())));
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
        if (getZMONTH() != null) {
            _hashCode += getZMONTH().hashCode();
        }
        if (getZ_OUT() != null) {
            for (int i=0;
                 i<java.lang.reflect.Array.getLength(getZ_OUT());
                 i++) {
                java.lang.Object obj = java.lang.reflect.Array.get(getZ_OUT(), i);
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
        new org.apache.axis.description.TypeDesc(ZFM_INT_BW015.class, true);

    static {
        typeDesc.setXmlType(new javax.xml.namespace.QName("urn:sap-com:document:sap:rfc:functions", ">ZFM_INT_BW015"));
        org.apache.axis.description.ElementDesc elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("ZMONTH");
        elemField.setXmlName(new javax.xml.namespace.QName("", "ZMONTH"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("z_OUT");
        elemField.setXmlName(new javax.xml.namespace.QName("", "Z_OUT"));
        elemField.setXmlType(new javax.xml.namespace.QName("urn:sap-com:document:sap:rfc:functions", "ZTZLPP"));
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
