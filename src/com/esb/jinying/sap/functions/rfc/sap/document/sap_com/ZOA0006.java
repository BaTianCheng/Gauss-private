/**
 * ZOA0006.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package com.esb.jinying.sap.functions.rfc.sap.document.sap_com;

public class ZOA0006  implements java.io.Serializable {
    private java.lang.String BUKRS;

    private java.math.BigDecimal DMBTR;

    private java.lang.String EKORG;

    private java.lang.String LIFNR;

    public ZOA0006() {
    }

    public ZOA0006(
           java.lang.String BUKRS,
           java.math.BigDecimal DMBTR,
           java.lang.String EKORG,
           java.lang.String LIFNR) {
           this.BUKRS = BUKRS;
           this.DMBTR = DMBTR;
           this.EKORG = EKORG;
           this.LIFNR = LIFNR;
    }


    /**
     * Gets the BUKRS value for this ZOA0006.
     * 
     * @return BUKRS
     */
    public java.lang.String getBUKRS() {
        return BUKRS;
    }


    /**
     * Sets the BUKRS value for this ZOA0006.
     * 
     * @param BUKRS
     */
    public void setBUKRS(java.lang.String BUKRS) {
        this.BUKRS = BUKRS;
    }


    /**
     * Gets the DMBTR value for this ZOA0006.
     * 
     * @return DMBTR
     */
    public java.math.BigDecimal getDMBTR() {
        return DMBTR;
    }


    /**
     * Sets the DMBTR value for this ZOA0006.
     * 
     * @param DMBTR
     */
    public void setDMBTR(java.math.BigDecimal DMBTR) {
        this.DMBTR = DMBTR;
    }


    /**
     * Gets the EKORG value for this ZOA0006.
     * 
     * @return EKORG
     */
    public java.lang.String getEKORG() {
        return EKORG;
    }


    /**
     * Sets the EKORG value for this ZOA0006.
     * 
     * @param EKORG
     */
    public void setEKORG(java.lang.String EKORG) {
        this.EKORG = EKORG;
    }


    /**
     * Gets the LIFNR value for this ZOA0006.
     * 
     * @return LIFNR
     */
    public java.lang.String getLIFNR() {
        return LIFNR;
    }


    /**
     * Sets the LIFNR value for this ZOA0006.
     * 
     * @param LIFNR
     */
    public void setLIFNR(java.lang.String LIFNR) {
        this.LIFNR = LIFNR;
    }

    private java.lang.Object __equalsCalc = null;
    public synchronized boolean equals(java.lang.Object obj) {
        if (!(obj instanceof ZOA0006)) return false;
        ZOA0006 other = (ZOA0006) obj;
        if (obj == null) return false;
        if (this == obj) return true;
        if (__equalsCalc != null) {
            return (__equalsCalc == obj);
        }
        __equalsCalc = obj;
        boolean _equals;
        _equals = true && 
            ((this.BUKRS==null && other.getBUKRS()==null) || 
             (this.BUKRS!=null &&
              this.BUKRS.equals(other.getBUKRS()))) &&
            ((this.DMBTR==null && other.getDMBTR()==null) || 
             (this.DMBTR!=null &&
              this.DMBTR.equals(other.getDMBTR()))) &&
            ((this.EKORG==null && other.getEKORG()==null) || 
             (this.EKORG!=null &&
              this.EKORG.equals(other.getEKORG()))) &&
            ((this.LIFNR==null && other.getLIFNR()==null) || 
             (this.LIFNR!=null &&
              this.LIFNR.equals(other.getLIFNR())));
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
        if (getBUKRS() != null) {
            _hashCode += getBUKRS().hashCode();
        }
        if (getDMBTR() != null) {
            _hashCode += getDMBTR().hashCode();
        }
        if (getEKORG() != null) {
            _hashCode += getEKORG().hashCode();
        }
        if (getLIFNR() != null) {
            _hashCode += getLIFNR().hashCode();
        }
        __hashCodeCalc = false;
        return _hashCode;
    }

    // Type metadata
    private static org.apache.axis.description.TypeDesc typeDesc =
        new org.apache.axis.description.TypeDesc(ZOA0006.class, true);

    static {
        typeDesc.setXmlType(new javax.xml.namespace.QName("urn:sap-com:document:sap:rfc:functions", ">ZOA0006"));
        org.apache.axis.description.ElementDesc elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("BUKRS");
        elemField.setXmlName(new javax.xml.namespace.QName("", "BUKRS"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("DMBTR");
        elemField.setXmlName(new javax.xml.namespace.QName("", "DMBTR"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "decimal"));
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("EKORG");
        elemField.setXmlName(new javax.xml.namespace.QName("", "EKORG"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("LIFNR");
        elemField.setXmlName(new javax.xml.namespace.QName("", "LIFNR"));
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
