/**
 * ZFM_INT_RF012Response.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package com.esb.jinying.sap.functions.rfc.sap.document.sap_com;

public class ZFM_INT_RF012Response  implements java.io.Serializable {
    private com.esb.jinying.sap.functions.rfc.sap.document.sap_com.ZTMARD[] t_MARD;

    public ZFM_INT_RF012Response() {
    }

    public ZFM_INT_RF012Response(
           com.esb.jinying.sap.functions.rfc.sap.document.sap_com.ZTMARD[] t_MARD) {
           this.t_MARD = t_MARD;
    }


    /**
     * Gets the t_MARD value for this ZFM_INT_RF012Response.
     * 
     * @return t_MARD
     */
    public com.esb.jinying.sap.functions.rfc.sap.document.sap_com.ZTMARD[] getT_MARD() {
        return t_MARD;
    }


    /**
     * Sets the t_MARD value for this ZFM_INT_RF012Response.
     * 
     * @param t_MARD
     */
    public void setT_MARD(com.esb.jinying.sap.functions.rfc.sap.document.sap_com.ZTMARD[] t_MARD) {
        this.t_MARD = t_MARD;
    }

    private java.lang.Object __equalsCalc = null;
    public synchronized boolean equals(java.lang.Object obj) {
        if (!(obj instanceof ZFM_INT_RF012Response)) return false;
        ZFM_INT_RF012Response other = (ZFM_INT_RF012Response) obj;
        if (obj == null) return false;
        if (this == obj) return true;
        if (__equalsCalc != null) {
            return (__equalsCalc == obj);
        }
        __equalsCalc = obj;
        boolean _equals;
        _equals = true && 
            ((this.t_MARD==null && other.getT_MARD()==null) || 
             (this.t_MARD!=null &&
              java.util.Arrays.equals(this.t_MARD, other.getT_MARD())));
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
        if (getT_MARD() != null) {
            for (int i=0;
                 i<java.lang.reflect.Array.getLength(getT_MARD());
                 i++) {
                java.lang.Object obj = java.lang.reflect.Array.get(getT_MARD(), i);
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
        new org.apache.axis.description.TypeDesc(ZFM_INT_RF012Response.class, true);

    static {
        typeDesc.setXmlType(new javax.xml.namespace.QName("urn:sap-com:document:sap:rfc:functions", ">ZFM_INT_RF012.Response"));
        org.apache.axis.description.ElementDesc elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("t_MARD");
        elemField.setXmlName(new javax.xml.namespace.QName("", "T_MARD"));
        elemField.setXmlType(new javax.xml.namespace.QName("urn:sap-com:document:sap:rfc:functions", "ZTMARD"));
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
