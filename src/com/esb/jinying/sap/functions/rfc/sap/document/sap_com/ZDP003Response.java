/**
 * ZDP003Response.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package com.esb.jinying.sap.functions.rfc.sap.document.sap_com;

public class ZDP003Response  implements java.io.Serializable {
    private com.esb.jinying.sap.functions.rfc.sap.document.sap_com.ZSDP004[] OUT_TAB;

    public ZDP003Response() {
    }

    public ZDP003Response(
           com.esb.jinying.sap.functions.rfc.sap.document.sap_com.ZSDP004[] OUT_TAB) {
           this.OUT_TAB = OUT_TAB;
    }


    /**
     * Gets the OUT_TAB value for this ZDP003Response.
     * 
     * @return OUT_TAB
     */
    public com.esb.jinying.sap.functions.rfc.sap.document.sap_com.ZSDP004[] getOUT_TAB() {
        return OUT_TAB;
    }


    /**
     * Sets the OUT_TAB value for this ZDP003Response.
     * 
     * @param OUT_TAB
     */
    public void setOUT_TAB(com.esb.jinying.sap.functions.rfc.sap.document.sap_com.ZSDP004[] OUT_TAB) {
        this.OUT_TAB = OUT_TAB;
    }

    private java.lang.Object __equalsCalc = null;
    public synchronized boolean equals(java.lang.Object obj) {
        if (!(obj instanceof ZDP003Response)) return false;
        ZDP003Response other = (ZDP003Response) obj;
        if (obj == null) return false;
        if (this == obj) return true;
        if (__equalsCalc != null) {
            return (__equalsCalc == obj);
        }
        __equalsCalc = obj;
        boolean _equals;
        _equals = true && 
            ((this.OUT_TAB==null && other.getOUT_TAB()==null) || 
             (this.OUT_TAB!=null &&
              java.util.Arrays.equals(this.OUT_TAB, other.getOUT_TAB())));
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
        if (getOUT_TAB() != null) {
            for (int i=0;
                 i<java.lang.reflect.Array.getLength(getOUT_TAB());
                 i++) {
                java.lang.Object obj = java.lang.reflect.Array.get(getOUT_TAB(), i);
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
        new org.apache.axis.description.TypeDesc(ZDP003Response.class, true);

    static {
        typeDesc.setXmlType(new javax.xml.namespace.QName("urn:sap-com:document:sap:rfc:functions", ">ZDP003.Response"));
        org.apache.axis.description.ElementDesc elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("OUT_TAB");
        elemField.setXmlName(new javax.xml.namespace.QName("", "OUT_TAB"));
        elemField.setXmlType(new javax.xml.namespace.QName("urn:sap-com:document:sap:rfc:functions", "ZSDP004"));
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
