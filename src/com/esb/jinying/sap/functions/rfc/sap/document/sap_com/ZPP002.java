/**
 * ZPP002.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package com.esb.jinying.sap.functions.rfc.sap.document.sap_com;

public class ZPP002  implements java.io.Serializable {
    private java.lang.String i_DATE;

    private com.esb.jinying.sap.functions.rfc.sap.document.sap_com.ZSPP002[] o_TAB;

    public ZPP002() {
    }

    public ZPP002(
           java.lang.String i_DATE,
           com.esb.jinying.sap.functions.rfc.sap.document.sap_com.ZSPP002[] o_TAB) {
           this.i_DATE = i_DATE;
           this.o_TAB = o_TAB;
    }


    /**
     * Gets the i_DATE value for this ZPP002.
     * 
     * @return i_DATE
     */
    public java.lang.String getI_DATE() {
        return i_DATE;
    }


    /**
     * Sets the i_DATE value for this ZPP002.
     * 
     * @param i_DATE
     */
    public void setI_DATE(java.lang.String i_DATE) {
        this.i_DATE = i_DATE;
    }


    /**
     * Gets the o_TAB value for this ZPP002.
     * 
     * @return o_TAB
     */
    public com.esb.jinying.sap.functions.rfc.sap.document.sap_com.ZSPP002[] getO_TAB() {
        return o_TAB;
    }


    /**
     * Sets the o_TAB value for this ZPP002.
     * 
     * @param o_TAB
     */
    public void setO_TAB(com.esb.jinying.sap.functions.rfc.sap.document.sap_com.ZSPP002[] o_TAB) {
        this.o_TAB = o_TAB;
    }

    private java.lang.Object __equalsCalc = null;
    public synchronized boolean equals(java.lang.Object obj) {
        if (!(obj instanceof ZPP002)) return false;
        ZPP002 other = (ZPP002) obj;
        if (obj == null) return false;
        if (this == obj) return true;
        if (__equalsCalc != null) {
            return (__equalsCalc == obj);
        }
        __equalsCalc = obj;
        boolean _equals;
        _equals = true && 
            ((this.i_DATE==null && other.getI_DATE()==null) || 
             (this.i_DATE!=null &&
              this.i_DATE.equals(other.getI_DATE()))) &&
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
        if (getI_DATE() != null) {
            _hashCode += getI_DATE().hashCode();
        }
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
        new org.apache.axis.description.TypeDesc(ZPP002.class, true);

    static {
        typeDesc.setXmlType(new javax.xml.namespace.QName("urn:sap-com:document:sap:rfc:functions", ">ZPP002"));
        org.apache.axis.description.ElementDesc elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("i_DATE");
        elemField.setXmlName(new javax.xml.namespace.QName("", "I_DATE"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
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
