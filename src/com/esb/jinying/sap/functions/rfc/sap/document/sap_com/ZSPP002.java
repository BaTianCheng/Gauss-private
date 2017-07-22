/**
 * ZSPP002.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package com.esb.jinying.sap.functions.rfc.sap.document.sap_com;

public class ZSPP002  implements java.io.Serializable {
    /* Company Code */
    private java.lang.String BUKRS;

    private java.lang.String BRAND_NO;

    private java.lang.String SUPPLY_TYPE_NO;

    public ZSPP002() {
    }

    public ZSPP002(
           java.lang.String BUKRS,
           java.lang.String BRAND_NO,
           java.lang.String SUPPLY_TYPE_NO) {
           this.BUKRS = BUKRS;
           this.BRAND_NO = BRAND_NO;
           this.SUPPLY_TYPE_NO = SUPPLY_TYPE_NO;
    }


    /**
     * Gets the BUKRS value for this ZSPP002.
     * 
     * @return BUKRS   * Company Code
     */
    public java.lang.String getBUKRS() {
        return BUKRS;
    }


    /**
     * Sets the BUKRS value for this ZSPP002.
     * 
     * @param BUKRS   * Company Code
     */
    public void setBUKRS(java.lang.String BUKRS) {
        this.BUKRS = BUKRS;
    }


    /**
     * Gets the BRAND_NO value for this ZSPP002.
     * 
     * @return BRAND_NO
     */
    public java.lang.String getBRAND_NO() {
        return BRAND_NO;
    }


    /**
     * Sets the BRAND_NO value for this ZSPP002.
     * 
     * @param BRAND_NO
     */
    public void setBRAND_NO(java.lang.String BRAND_NO) {
        this.BRAND_NO = BRAND_NO;
    }


    /**
     * Gets the SUPPLY_TYPE_NO value for this ZSPP002.
     * 
     * @return SUPPLY_TYPE_NO
     */
    public java.lang.String getSUPPLY_TYPE_NO() {
        return SUPPLY_TYPE_NO;
    }


    /**
     * Sets the SUPPLY_TYPE_NO value for this ZSPP002.
     * 
     * @param SUPPLY_TYPE_NO
     */
    public void setSUPPLY_TYPE_NO(java.lang.String SUPPLY_TYPE_NO) {
        this.SUPPLY_TYPE_NO = SUPPLY_TYPE_NO;
    }

    private java.lang.Object __equalsCalc = null;
    public synchronized boolean equals(java.lang.Object obj) {
        if (!(obj instanceof ZSPP002)) return false;
        ZSPP002 other = (ZSPP002) obj;
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
            ((this.BRAND_NO==null && other.getBRAND_NO()==null) || 
             (this.BRAND_NO!=null &&
              this.BRAND_NO.equals(other.getBRAND_NO()))) &&
            ((this.SUPPLY_TYPE_NO==null && other.getSUPPLY_TYPE_NO()==null) || 
             (this.SUPPLY_TYPE_NO!=null &&
              this.SUPPLY_TYPE_NO.equals(other.getSUPPLY_TYPE_NO())));
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
        if (getBRAND_NO() != null) {
            _hashCode += getBRAND_NO().hashCode();
        }
        if (getSUPPLY_TYPE_NO() != null) {
            _hashCode += getSUPPLY_TYPE_NO().hashCode();
        }
        __hashCodeCalc = false;
        return _hashCode;
    }

    // Type metadata
    private static org.apache.axis.description.TypeDesc typeDesc =
        new org.apache.axis.description.TypeDesc(ZSPP002.class, true);

    static {
        typeDesc.setXmlType(new javax.xml.namespace.QName("urn:sap-com:document:sap:rfc:functions", "ZSPP002"));
        org.apache.axis.description.ElementDesc elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("BUKRS");
        elemField.setXmlName(new javax.xml.namespace.QName("", "BUKRS"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("BRAND_NO");
        elemField.setXmlName(new javax.xml.namespace.QName("", "BRAND_NO"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("SUPPLY_TYPE_NO");
        elemField.setXmlName(new javax.xml.namespace.QName("", "SUPPLY_TYPE_NO"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
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
