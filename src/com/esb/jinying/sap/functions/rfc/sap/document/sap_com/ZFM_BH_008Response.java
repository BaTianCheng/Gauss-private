/**
 * ZFM_BH_008Response.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package com.esb.jinying.sap.functions.rfc.sap.document.sap_com;

public class ZFM_BH_008Response  implements java.io.Serializable {
    private com.esb.jinying.sap.functions.rfc.sap.document.sap_com.ZH008[] ZT008;

    public ZFM_BH_008Response() {
    }

    public ZFM_BH_008Response(
           com.esb.jinying.sap.functions.rfc.sap.document.sap_com.ZH008[] ZT008) {
           this.ZT008 = ZT008;
    }


    /**
     * Gets the ZT008 value for this ZFM_BH_008Response.
     * 
     * @return ZT008
     */
    public com.esb.jinying.sap.functions.rfc.sap.document.sap_com.ZH008[] getZT008() {
        return ZT008;
    }


    /**
     * Sets the ZT008 value for this ZFM_BH_008Response.
     * 
     * @param ZT008
     */
    public void setZT008(com.esb.jinying.sap.functions.rfc.sap.document.sap_com.ZH008[] ZT008) {
        this.ZT008 = ZT008;
    }

    private java.lang.Object __equalsCalc = null;
    public synchronized boolean equals(java.lang.Object obj) {
        if (!(obj instanceof ZFM_BH_008Response)) return false;
        ZFM_BH_008Response other = (ZFM_BH_008Response) obj;
        if (obj == null) return false;
        if (this == obj) return true;
        if (__equalsCalc != null) {
            return (__equalsCalc == obj);
        }
        __equalsCalc = obj;
        boolean _equals;
        _equals = true && 
            ((this.ZT008==null && other.getZT008()==null) || 
             (this.ZT008!=null &&
              java.util.Arrays.equals(this.ZT008, other.getZT008())));
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
        if (getZT008() != null) {
            for (int i=0;
                 i<java.lang.reflect.Array.getLength(getZT008());
                 i++) {
                java.lang.Object obj = java.lang.reflect.Array.get(getZT008(), i);
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
        new org.apache.axis.description.TypeDesc(ZFM_BH_008Response.class, true);

    static {
        typeDesc.setXmlType(new javax.xml.namespace.QName("urn:sap-com:document:sap:rfc:functions", ">ZFM_BH_008.Response"));
        org.apache.axis.description.ElementDesc elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("ZT008");
        elemField.setXmlName(new javax.xml.namespace.QName("", "ZT008"));
        elemField.setXmlType(new javax.xml.namespace.QName("urn:sap-com:document:sap:rfc:functions", "ZH008"));
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
