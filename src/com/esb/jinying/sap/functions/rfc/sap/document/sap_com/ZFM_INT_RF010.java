/**
 * ZFM_INT_RF010.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package com.esb.jinying.sap.functions.rfc.sap.document.sap_com;

public class ZFM_INT_RF010  implements java.io.Serializable {
    private com.esb.jinying.sap.functions.rfc.sap.document.sap_com.ZT0005[] IT_RF010;

    public ZFM_INT_RF010() {
    }

    public ZFM_INT_RF010(
           com.esb.jinying.sap.functions.rfc.sap.document.sap_com.ZT0005[] IT_RF010) {
           this.IT_RF010 = IT_RF010;
    }


    /**
     * Gets the IT_RF010 value for this ZFM_INT_RF010.
     * 
     * @return IT_RF010
     */
    public com.esb.jinying.sap.functions.rfc.sap.document.sap_com.ZT0005[] getIT_RF010() {
        return IT_RF010;
    }


    /**
     * Sets the IT_RF010 value for this ZFM_INT_RF010.
     * 
     * @param IT_RF010
     */
    public void setIT_RF010(com.esb.jinying.sap.functions.rfc.sap.document.sap_com.ZT0005[] IT_RF010) {
        this.IT_RF010 = IT_RF010;
    }

    private java.lang.Object __equalsCalc = null;
    public synchronized boolean equals(java.lang.Object obj) {
        if (!(obj instanceof ZFM_INT_RF010)) return false;
        ZFM_INT_RF010 other = (ZFM_INT_RF010) obj;
        if (obj == null) return false;
        if (this == obj) return true;
        if (__equalsCalc != null) {
            return (__equalsCalc == obj);
        }
        __equalsCalc = obj;
        boolean _equals;
        _equals = true && 
            ((this.IT_RF010==null && other.getIT_RF010()==null) || 
             (this.IT_RF010!=null &&
              java.util.Arrays.equals(this.IT_RF010, other.getIT_RF010())));
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
        if (getIT_RF010() != null) {
            for (int i=0;
                 i<java.lang.reflect.Array.getLength(getIT_RF010());
                 i++) {
                java.lang.Object obj = java.lang.reflect.Array.get(getIT_RF010(), i);
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
        new org.apache.axis.description.TypeDesc(ZFM_INT_RF010.class, true);

    static {
        typeDesc.setXmlType(new javax.xml.namespace.QName("urn:sap-com:document:sap:rfc:functions", ">ZFM_INT_RF010"));
        org.apache.axis.description.ElementDesc elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("IT_RF010");
        elemField.setXmlName(new javax.xml.namespace.QName("", "IT_RF010"));
        elemField.setXmlType(new javax.xml.namespace.QName("urn:sap-com:document:sap:rfc:functions", "ZT0005"));
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
