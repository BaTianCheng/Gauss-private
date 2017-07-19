/**
 * ZOA0005.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package com.esb.jinying.sap.functions.rfc.sap.document.sap_com;

public class ZOA0005  implements java.io.Serializable {
    private java.lang.String PARTNER;

    private com.esb.jinying.sap.functions.rfc.sap.document.sap_com.ZOA005[] ZOA005;

    public ZOA0005() {
    }

    public ZOA0005(
           java.lang.String PARTNER,
           com.esb.jinying.sap.functions.rfc.sap.document.sap_com.ZOA005[] ZOA005) {
           this.PARTNER = PARTNER;
           this.ZOA005 = ZOA005;
    }


    /**
     * Gets the PARTNER value for this ZOA0005.
     * 
     * @return PARTNER
     */
    public java.lang.String getPARTNER() {
        return PARTNER;
    }


    /**
     * Sets the PARTNER value for this ZOA0005.
     * 
     * @param PARTNER
     */
    public void setPARTNER(java.lang.String PARTNER) {
        this.PARTNER = PARTNER;
    }


    /**
     * Gets the ZOA005 value for this ZOA0005.
     * 
     * @return ZOA005
     */
    public com.esb.jinying.sap.functions.rfc.sap.document.sap_com.ZOA005[] getZOA005() {
        return ZOA005;
    }


    /**
     * Sets the ZOA005 value for this ZOA0005.
     * 
     * @param ZOA005
     */
    public void setZOA005(com.esb.jinying.sap.functions.rfc.sap.document.sap_com.ZOA005[] ZOA005) {
        this.ZOA005 = ZOA005;
    }

    private java.lang.Object __equalsCalc = null;
    public synchronized boolean equals(java.lang.Object obj) {
        if (!(obj instanceof ZOA0005)) return false;
        ZOA0005 other = (ZOA0005) obj;
        if (obj == null) return false;
        if (this == obj) return true;
        if (__equalsCalc != null) {
            return (__equalsCalc == obj);
        }
        __equalsCalc = obj;
        boolean _equals;
        _equals = true && 
            ((this.PARTNER==null && other.getPARTNER()==null) || 
             (this.PARTNER!=null &&
              this.PARTNER.equals(other.getPARTNER()))) &&
            ((this.ZOA005==null && other.getZOA005()==null) || 
             (this.ZOA005!=null &&
              java.util.Arrays.equals(this.ZOA005, other.getZOA005())));
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
        if (getPARTNER() != null) {
            _hashCode += getPARTNER().hashCode();
        }
        if (getZOA005() != null) {
            for (int i=0;
                 i<java.lang.reflect.Array.getLength(getZOA005());
                 i++) {
                java.lang.Object obj = java.lang.reflect.Array.get(getZOA005(), i);
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
        new org.apache.axis.description.TypeDesc(ZOA0005.class, true);

    static {
        typeDesc.setXmlType(new javax.xml.namespace.QName("urn:sap-com:document:sap:rfc:functions", ">ZOA0005"));
        org.apache.axis.description.ElementDesc elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("PARTNER");
        elemField.setXmlName(new javax.xml.namespace.QName("", "PARTNER"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("ZOA005");
        elemField.setXmlName(new javax.xml.namespace.QName("", "ZOA005"));
        elemField.setXmlType(new javax.xml.namespace.QName("urn:sap-com:document:sap:rfc:functions", "ZOA005"));
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
