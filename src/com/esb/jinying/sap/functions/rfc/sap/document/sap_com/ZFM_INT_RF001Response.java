/**
 * ZFM_INT_RF001Response.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package com.esb.jinying.sap.functions.rfc.sap.document.sap_com;

public class ZFM_INT_RF001Response  implements java.io.Serializable {
    private com.esb.jinying.sap.functions.rfc.sap.document.sap_com.ZRF001_HEAD ZRF001_HEAD;

    private com.esb.jinying.sap.functions.rfc.sap.document.sap_com.ZS0001[] TAB1;

    private com.esb.jinying.sap.functions.rfc.sap.document.sap_com.ZS0002[] TAB2;

    public ZFM_INT_RF001Response() {
    }

    public ZFM_INT_RF001Response(
           com.esb.jinying.sap.functions.rfc.sap.document.sap_com.ZRF001_HEAD ZRF001_HEAD,
           com.esb.jinying.sap.functions.rfc.sap.document.sap_com.ZS0001[] TAB1,
           com.esb.jinying.sap.functions.rfc.sap.document.sap_com.ZS0002[] TAB2) {
           this.ZRF001_HEAD = ZRF001_HEAD;
           this.TAB1 = TAB1;
           this.TAB2 = TAB2;
    }


    /**
     * Gets the ZRF001_HEAD value for this ZFM_INT_RF001Response.
     * 
     * @return ZRF001_HEAD
     */
    public com.esb.jinying.sap.functions.rfc.sap.document.sap_com.ZRF001_HEAD getZRF001_HEAD() {
        return ZRF001_HEAD;
    }


    /**
     * Sets the ZRF001_HEAD value for this ZFM_INT_RF001Response.
     * 
     * @param ZRF001_HEAD
     */
    public void setZRF001_HEAD(com.esb.jinying.sap.functions.rfc.sap.document.sap_com.ZRF001_HEAD ZRF001_HEAD) {
        this.ZRF001_HEAD = ZRF001_HEAD;
    }


    /**
     * Gets the TAB1 value for this ZFM_INT_RF001Response.
     * 
     * @return TAB1
     */
    public com.esb.jinying.sap.functions.rfc.sap.document.sap_com.ZS0001[] getTAB1() {
        return TAB1;
    }


    /**
     * Sets the TAB1 value for this ZFM_INT_RF001Response.
     * 
     * @param TAB1
     */
    public void setTAB1(com.esb.jinying.sap.functions.rfc.sap.document.sap_com.ZS0001[] TAB1) {
        this.TAB1 = TAB1;
    }


    /**
     * Gets the TAB2 value for this ZFM_INT_RF001Response.
     * 
     * @return TAB2
     */
    public com.esb.jinying.sap.functions.rfc.sap.document.sap_com.ZS0002[] getTAB2() {
        return TAB2;
    }


    /**
     * Sets the TAB2 value for this ZFM_INT_RF001Response.
     * 
     * @param TAB2
     */
    public void setTAB2(com.esb.jinying.sap.functions.rfc.sap.document.sap_com.ZS0002[] TAB2) {
        this.TAB2 = TAB2;
    }

    private java.lang.Object __equalsCalc = null;
    public synchronized boolean equals(java.lang.Object obj) {
        if (!(obj instanceof ZFM_INT_RF001Response)) return false;
        ZFM_INT_RF001Response other = (ZFM_INT_RF001Response) obj;
        if (obj == null) return false;
        if (this == obj) return true;
        if (__equalsCalc != null) {
            return (__equalsCalc == obj);
        }
        __equalsCalc = obj;
        boolean _equals;
        _equals = true && 
            ((this.ZRF001_HEAD==null && other.getZRF001_HEAD()==null) || 
             (this.ZRF001_HEAD!=null &&
              this.ZRF001_HEAD.equals(other.getZRF001_HEAD()))) &&
            ((this.TAB1==null && other.getTAB1()==null) || 
             (this.TAB1!=null &&
              java.util.Arrays.equals(this.TAB1, other.getTAB1()))) &&
            ((this.TAB2==null && other.getTAB2()==null) || 
             (this.TAB2!=null &&
              java.util.Arrays.equals(this.TAB2, other.getTAB2())));
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
        if (getZRF001_HEAD() != null) {
            _hashCode += getZRF001_HEAD().hashCode();
        }
        if (getTAB1() != null) {
            for (int i=0;
                 i<java.lang.reflect.Array.getLength(getTAB1());
                 i++) {
                java.lang.Object obj = java.lang.reflect.Array.get(getTAB1(), i);
                if (obj != null &&
                    !obj.getClass().isArray()) {
                    _hashCode += obj.hashCode();
                }
            }
        }
        if (getTAB2() != null) {
            for (int i=0;
                 i<java.lang.reflect.Array.getLength(getTAB2());
                 i++) {
                java.lang.Object obj = java.lang.reflect.Array.get(getTAB2(), i);
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
        new org.apache.axis.description.TypeDesc(ZFM_INT_RF001Response.class, true);

    static {
        typeDesc.setXmlType(new javax.xml.namespace.QName("urn:sap-com:document:sap:rfc:functions", ">ZFM_INT_RF001.Response"));
        org.apache.axis.description.ElementDesc elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("ZRF001_HEAD");
        elemField.setXmlName(new javax.xml.namespace.QName("", "ZRF001_HEAD"));
        elemField.setXmlType(new javax.xml.namespace.QName("urn:sap-com:document:sap:rfc:functions", "ZRF001_HEAD"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("TAB1");
        elemField.setXmlName(new javax.xml.namespace.QName("", "TAB1"));
        elemField.setXmlType(new javax.xml.namespace.QName("urn:sap-com:document:sap:rfc:functions", "ZS0001"));
        elemField.setNillable(false);
        elemField.setItemQName(new javax.xml.namespace.QName("", "item"));
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("TAB2");
        elemField.setXmlName(new javax.xml.namespace.QName("", "TAB2"));
        elemField.setXmlType(new javax.xml.namespace.QName("urn:sap-com:document:sap:rfc:functions", "ZS0002"));
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
