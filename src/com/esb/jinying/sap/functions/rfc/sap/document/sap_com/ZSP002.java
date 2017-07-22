/**
 * ZSP002.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package com.esb.jinying.sap.functions.rfc.sap.document.sap_com;

public class ZSP002  implements java.io.Serializable {
    private com.esb.jinying.sap.functions.rfc.sap.document.sap_com.ZTSALE_SET[] i_TAB;

    public ZSP002() {
    }

    public ZSP002(
           com.esb.jinying.sap.functions.rfc.sap.document.sap_com.ZTSALE_SET[] i_TAB) {
           this.i_TAB = i_TAB;
    }


    /**
     * Gets the i_TAB value for this ZSP002.
     * 
     * @return i_TAB
     */
    public com.esb.jinying.sap.functions.rfc.sap.document.sap_com.ZTSALE_SET[] getI_TAB() {
        return i_TAB;
    }


    /**
     * Sets the i_TAB value for this ZSP002.
     * 
     * @param i_TAB
     */
    public void setI_TAB(com.esb.jinying.sap.functions.rfc.sap.document.sap_com.ZTSALE_SET[] i_TAB) {
        this.i_TAB = i_TAB;
    }

    private java.lang.Object __equalsCalc = null;
    public synchronized boolean equals(java.lang.Object obj) {
        if (!(obj instanceof ZSP002)) return false;
        ZSP002 other = (ZSP002) obj;
        if (obj == null) return false;
        if (this == obj) return true;
        if (__equalsCalc != null) {
            return (__equalsCalc == obj);
        }
        __equalsCalc = obj;
        boolean _equals;
        _equals = true && 
            ((this.i_TAB==null && other.getI_TAB()==null) || 
             (this.i_TAB!=null &&
              java.util.Arrays.equals(this.i_TAB, other.getI_TAB())));
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
        if (getI_TAB() != null) {
            for (int i=0;
                 i<java.lang.reflect.Array.getLength(getI_TAB());
                 i++) {
                java.lang.Object obj = java.lang.reflect.Array.get(getI_TAB(), i);
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
        new org.apache.axis.description.TypeDesc(ZSP002.class, true);

    static {
        typeDesc.setXmlType(new javax.xml.namespace.QName("urn:sap-com:document:sap:rfc:functions", ">ZSP002"));
        org.apache.axis.description.ElementDesc elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("i_TAB");
        elemField.setXmlName(new javax.xml.namespace.QName("", "I_TAB"));
        elemField.setXmlType(new javax.xml.namespace.QName("urn:sap-com:document:sap:rfc:functions", "ZTSALE_SET"));
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
