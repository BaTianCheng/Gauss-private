/**
 * ZPP001.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package com.esb.jinying.sap.functions.rfc.sap.document.sap_com;

public class ZPP001  implements java.io.Serializable {
    private com.esb.jinying.sap.functions.rfc.sap.document.sap_com.ZSBRAND_01[] IT_BRAND_01;

    private com.esb.jinying.sap.functions.rfc.sap.document.sap_com.ZSBRAND_02[] IT_BRAND_02;

    private com.esb.jinying.sap.functions.rfc.sap.document.sap_com.ZSBRAND_04[] IT_BRAND_04;

    private com.esb.jinying.sap.functions.rfc.sap.document.sap_com.ZSBRAND_06[] IT_BRAND_06;

    public ZPP001() {
    }

    public ZPP001(
           com.esb.jinying.sap.functions.rfc.sap.document.sap_com.ZSBRAND_01[] IT_BRAND_01,
           com.esb.jinying.sap.functions.rfc.sap.document.sap_com.ZSBRAND_02[] IT_BRAND_02,
           com.esb.jinying.sap.functions.rfc.sap.document.sap_com.ZSBRAND_04[] IT_BRAND_04,
           com.esb.jinying.sap.functions.rfc.sap.document.sap_com.ZSBRAND_06[] IT_BRAND_06) {
           this.IT_BRAND_01 = IT_BRAND_01;
           this.IT_BRAND_02 = IT_BRAND_02;
           this.IT_BRAND_04 = IT_BRAND_04;
           this.IT_BRAND_06 = IT_BRAND_06;
    }


    /**
     * Gets the IT_BRAND_01 value for this ZPP001.
     * 
     * @return IT_BRAND_01
     */
    public com.esb.jinying.sap.functions.rfc.sap.document.sap_com.ZSBRAND_01[] getIT_BRAND_01() {
        return IT_BRAND_01;
    }


    /**
     * Sets the IT_BRAND_01 value for this ZPP001.
     * 
     * @param IT_BRAND_01
     */
    public void setIT_BRAND_01(com.esb.jinying.sap.functions.rfc.sap.document.sap_com.ZSBRAND_01[] IT_BRAND_01) {
        this.IT_BRAND_01 = IT_BRAND_01;
    }


    /**
     * Gets the IT_BRAND_02 value for this ZPP001.
     * 
     * @return IT_BRAND_02
     */
    public com.esb.jinying.sap.functions.rfc.sap.document.sap_com.ZSBRAND_02[] getIT_BRAND_02() {
        return IT_BRAND_02;
    }


    /**
     * Sets the IT_BRAND_02 value for this ZPP001.
     * 
     * @param IT_BRAND_02
     */
    public void setIT_BRAND_02(com.esb.jinying.sap.functions.rfc.sap.document.sap_com.ZSBRAND_02[] IT_BRAND_02) {
        this.IT_BRAND_02 = IT_BRAND_02;
    }


    /**
     * Gets the IT_BRAND_04 value for this ZPP001.
     * 
     * @return IT_BRAND_04
     */
    public com.esb.jinying.sap.functions.rfc.sap.document.sap_com.ZSBRAND_04[] getIT_BRAND_04() {
        return IT_BRAND_04;
    }


    /**
     * Sets the IT_BRAND_04 value for this ZPP001.
     * 
     * @param IT_BRAND_04
     */
    public void setIT_BRAND_04(com.esb.jinying.sap.functions.rfc.sap.document.sap_com.ZSBRAND_04[] IT_BRAND_04) {
        this.IT_BRAND_04 = IT_BRAND_04;
    }


    /**
     * Gets the IT_BRAND_06 value for this ZPP001.
     * 
     * @return IT_BRAND_06
     */
    public com.esb.jinying.sap.functions.rfc.sap.document.sap_com.ZSBRAND_06[] getIT_BRAND_06() {
        return IT_BRAND_06;
    }


    /**
     * Sets the IT_BRAND_06 value for this ZPP001.
     * 
     * @param IT_BRAND_06
     */
    public void setIT_BRAND_06(com.esb.jinying.sap.functions.rfc.sap.document.sap_com.ZSBRAND_06[] IT_BRAND_06) {
        this.IT_BRAND_06 = IT_BRAND_06;
    }

    private java.lang.Object __equalsCalc = null;
    public synchronized boolean equals(java.lang.Object obj) {
        if (!(obj instanceof ZPP001)) return false;
        ZPP001 other = (ZPP001) obj;
        if (obj == null) return false;
        if (this == obj) return true;
        if (__equalsCalc != null) {
            return (__equalsCalc == obj);
        }
        __equalsCalc = obj;
        boolean _equals;
        _equals = true && 
            ((this.IT_BRAND_01==null && other.getIT_BRAND_01()==null) || 
             (this.IT_BRAND_01!=null &&
              java.util.Arrays.equals(this.IT_BRAND_01, other.getIT_BRAND_01()))) &&
            ((this.IT_BRAND_02==null && other.getIT_BRAND_02()==null) || 
             (this.IT_BRAND_02!=null &&
              java.util.Arrays.equals(this.IT_BRAND_02, other.getIT_BRAND_02()))) &&
            ((this.IT_BRAND_04==null && other.getIT_BRAND_04()==null) || 
             (this.IT_BRAND_04!=null &&
              java.util.Arrays.equals(this.IT_BRAND_04, other.getIT_BRAND_04()))) &&
            ((this.IT_BRAND_06==null && other.getIT_BRAND_06()==null) || 
             (this.IT_BRAND_06!=null &&
              java.util.Arrays.equals(this.IT_BRAND_06, other.getIT_BRAND_06())));
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
        if (getIT_BRAND_01() != null) {
            for (int i=0;
                 i<java.lang.reflect.Array.getLength(getIT_BRAND_01());
                 i++) {
                java.lang.Object obj = java.lang.reflect.Array.get(getIT_BRAND_01(), i);
                if (obj != null &&
                    !obj.getClass().isArray()) {
                    _hashCode += obj.hashCode();
                }
            }
        }
        if (getIT_BRAND_02() != null) {
            for (int i=0;
                 i<java.lang.reflect.Array.getLength(getIT_BRAND_02());
                 i++) {
                java.lang.Object obj = java.lang.reflect.Array.get(getIT_BRAND_02(), i);
                if (obj != null &&
                    !obj.getClass().isArray()) {
                    _hashCode += obj.hashCode();
                }
            }
        }
        if (getIT_BRAND_04() != null) {
            for (int i=0;
                 i<java.lang.reflect.Array.getLength(getIT_BRAND_04());
                 i++) {
                java.lang.Object obj = java.lang.reflect.Array.get(getIT_BRAND_04(), i);
                if (obj != null &&
                    !obj.getClass().isArray()) {
                    _hashCode += obj.hashCode();
                }
            }
        }
        if (getIT_BRAND_06() != null) {
            for (int i=0;
                 i<java.lang.reflect.Array.getLength(getIT_BRAND_06());
                 i++) {
                java.lang.Object obj = java.lang.reflect.Array.get(getIT_BRAND_06(), i);
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
        new org.apache.axis.description.TypeDesc(ZPP001.class, true);

    static {
        typeDesc.setXmlType(new javax.xml.namespace.QName("urn:sap-com:document:sap:rfc:functions", ">ZPP001"));
        org.apache.axis.description.ElementDesc elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("IT_BRAND_01");
        elemField.setXmlName(new javax.xml.namespace.QName("", "IT_BRAND_01"));
        elemField.setXmlType(new javax.xml.namespace.QName("urn:sap-com:document:sap:rfc:functions", "ZSBRAND_01"));
        elemField.setNillable(false);
        elemField.setItemQName(new javax.xml.namespace.QName("", "item"));
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("IT_BRAND_02");
        elemField.setXmlName(new javax.xml.namespace.QName("", "IT_BRAND_02"));
        elemField.setXmlType(new javax.xml.namespace.QName("urn:sap-com:document:sap:rfc:functions", "ZSBRAND_02"));
        elemField.setNillable(false);
        elemField.setItemQName(new javax.xml.namespace.QName("", "item"));
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("IT_BRAND_04");
        elemField.setXmlName(new javax.xml.namespace.QName("", "IT_BRAND_04"));
        elemField.setXmlType(new javax.xml.namespace.QName("urn:sap-com:document:sap:rfc:functions", "ZSBRAND_04"));
        elemField.setNillable(false);
        elemField.setItemQName(new javax.xml.namespace.QName("", "item"));
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("IT_BRAND_06");
        elemField.setXmlName(new javax.xml.namespace.QName("", "IT_BRAND_06"));
        elemField.setXmlType(new javax.xml.namespace.QName("urn:sap-com:document:sap:rfc:functions", "ZSBRAND_06"));
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
