/**
 * ZOA0007.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package com.esb.jinying.sap.functions.rfc.sap.document.sap_com;

public class ZOA0007  implements java.io.Serializable {
    private java.lang.String STATH;

    private java.lang.String ZXNUM;

    public ZOA0007() {
    }

    public ZOA0007(
           java.lang.String STATH,
           java.lang.String ZXNUM) {
           this.STATH = STATH;
           this.ZXNUM = ZXNUM;
    }


    /**
     * Gets the STATH value for this ZOA0007.
     * 
     * @return STATH
     */
    public java.lang.String getSTATH() {
        return STATH;
    }


    /**
     * Sets the STATH value for this ZOA0007.
     * 
     * @param STATH
     */
    public void setSTATH(java.lang.String STATH) {
        this.STATH = STATH;
    }


    /**
     * Gets the ZXNUM value for this ZOA0007.
     * 
     * @return ZXNUM
     */
    public java.lang.String getZXNUM() {
        return ZXNUM;
    }


    /**
     * Sets the ZXNUM value for this ZOA0007.
     * 
     * @param ZXNUM
     */
    public void setZXNUM(java.lang.String ZXNUM) {
        this.ZXNUM = ZXNUM;
    }

    private java.lang.Object __equalsCalc = null;
    public synchronized boolean equals(java.lang.Object obj) {
        if (!(obj instanceof ZOA0007)) return false;
        ZOA0007 other = (ZOA0007) obj;
        if (obj == null) return false;
        if (this == obj) return true;
        if (__equalsCalc != null) {
            return (__equalsCalc == obj);
        }
        __equalsCalc = obj;
        boolean _equals;
        _equals = true && 
            ((this.STATH==null && other.getSTATH()==null) || 
             (this.STATH!=null &&
              this.STATH.equals(other.getSTATH()))) &&
            ((this.ZXNUM==null && other.getZXNUM()==null) || 
             (this.ZXNUM!=null &&
              this.ZXNUM.equals(other.getZXNUM())));
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
        if (getSTATH() != null) {
            _hashCode += getSTATH().hashCode();
        }
        if (getZXNUM() != null) {
            _hashCode += getZXNUM().hashCode();
        }
        __hashCodeCalc = false;
        return _hashCode;
    }

    // Type metadata
    private static org.apache.axis.description.TypeDesc typeDesc =
        new org.apache.axis.description.TypeDesc(ZOA0007.class, true);

    static {
        typeDesc.setXmlType(new javax.xml.namespace.QName("urn:sap-com:document:sap:rfc:functions", ">ZOA0007"));
        org.apache.axis.description.ElementDesc elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("STATH");
        elemField.setXmlName(new javax.xml.namespace.QName("", "STATH"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("ZXNUM");
        elemField.setXmlName(new javax.xml.namespace.QName("", "ZXNUM"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setNillable(false);
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
