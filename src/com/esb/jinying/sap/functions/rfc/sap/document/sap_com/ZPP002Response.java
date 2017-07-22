/**
 * ZPP002Response.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package com.esb.jinying.sap.functions.rfc.sap.document.sap_com;

public class ZPP002Response  implements java.io.Serializable {
    private com.esb.jinying.sap.functions.rfc.sap.document.sap_com.ZSPP002[] o_TAB;

    public ZPP002Response() {
    }

    public ZPP002Response(
           com.esb.jinying.sap.functions.rfc.sap.document.sap_com.ZSPP002[] o_TAB) {
           this.o_TAB = o_TAB;
    }


    /**
     * Gets the o_TAB value for this ZPP002Response.
     * 
     * @return o_TAB
     */
    public com.esb.jinying.sap.functions.rfc.sap.document.sap_com.ZSPP002[] getO_TAB() {
        return o_TAB;
    }


    /**
     * Sets the o_TAB value for this ZPP002Response.
     * 
     * @param o_TAB
     */
    public void setO_TAB(com.esb.jinying.sap.functions.rfc.sap.document.sap_com.ZSPP002[] o_TAB) {
        this.o_TAB = o_TAB;
    }

    private java.lang.Object __equalsCalc = null;
    public synchronized boolean equals(java.lang.Object obj) {
        if (!(obj instanceof ZPP002Response)) return false;
        ZPP002Response other = (ZPP002Response) obj;
        if (obj == null) return false;
        if (this == obj) return true;
        if (__equalsCalc != null) {
            return (__equalsCalc == obj);
        }
        __equalsCalc = obj;
        boolean _equals;
        _equals = true && 
            ((this.o_TAB==null && other.getO_TAB()==null) || 
             (this.o_TAB!=null &&
              java.util.Arrays.equals(this.o_TAB, other.getO_TAB())));
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
        if (getO_TAB() != null) {
            for (int i=0;
                 i<java.lang.reflect.Array.getLength(getO_TAB());
                 i++) {
                java.lang.Object obj = java.lang.reflect.Array.get(getO_TAB(), i);
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
        new org.apache.axis.description.TypeDesc(ZPP002Response.class, true);

    static {
        typeDesc.setXmlType(new javax.xml.namespace.QName("urn:sap-com:document:sap:rfc:functions", ">ZPP002.Response"));
        org.apache.axis.description.ElementDesc elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("o_TAB");
        elemField.setXmlName(new javax.xml.namespace.QName("", "O_TAB"));
        elemField.setXmlType(new javax.xml.namespace.QName("urn:sap-com:document:sap:rfc:functions", "ZSPP002"));
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
