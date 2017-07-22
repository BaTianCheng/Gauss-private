/**
 * ZSDP004.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package com.esb.jinying.sap.functions.rfc.sap.document.sap_com;

public class ZSDP004  implements java.io.Serializable {
    /* Business Partner Number */
    private java.lang.String PARTNER;

    private java.lang.String BRAND_NO;

    private java.lang.String ZBRAND_DES;

    public ZSDP004() {
    }

    public ZSDP004(
           java.lang.String PARTNER,
           java.lang.String BRAND_NO,
           java.lang.String ZBRAND_DES) {
           this.PARTNER = PARTNER;
           this.BRAND_NO = BRAND_NO;
           this.ZBRAND_DES = ZBRAND_DES;
    }


    /**
     * Gets the PARTNER value for this ZSDP004.
     * 
     * @return PARTNER   * Business Partner Number
     */
    public java.lang.String getPARTNER() {
        return PARTNER;
    }


    /**
     * Sets the PARTNER value for this ZSDP004.
     * 
     * @param PARTNER   * Business Partner Number
     */
    public void setPARTNER(java.lang.String PARTNER) {
        this.PARTNER = PARTNER;
    }


    /**
     * Gets the BRAND_NO value for this ZSDP004.
     * 
     * @return BRAND_NO
     */
    public java.lang.String getBRAND_NO() {
        return BRAND_NO;
    }


    /**
     * Sets the BRAND_NO value for this ZSDP004.
     * 
     * @param BRAND_NO
     */
    public void setBRAND_NO(java.lang.String BRAND_NO) {
        this.BRAND_NO = BRAND_NO;
    }


    /**
     * Gets the ZBRAND_DES value for this ZSDP004.
     * 
     * @return ZBRAND_DES
     */
    public java.lang.String getZBRAND_DES() {
        return ZBRAND_DES;
    }


    /**
     * Sets the ZBRAND_DES value for this ZSDP004.
     * 
     * @param ZBRAND_DES
     */
    public void setZBRAND_DES(java.lang.String ZBRAND_DES) {
        this.ZBRAND_DES = ZBRAND_DES;
    }

    private java.lang.Object __equalsCalc = null;
    public synchronized boolean equals(java.lang.Object obj) {
        if (!(obj instanceof ZSDP004)) return false;
        ZSDP004 other = (ZSDP004) obj;
        if (obj == null) return false;
        if (this == obj) return true;
        if (__equalsCalc != null) {
            return (__equalsCalc == obj);
        }
        __equalsCalc = obj;
        boolean _equals;
        _equals = true && 
            ((this.PARTNER==null && other.getPARTNER()==null) || 
             (this.PARTNER!=null &&
              this.PARTNER.equals(other.getPARTNER()))) &&
            ((this.BRAND_NO==null && other.getBRAND_NO()==null) || 
             (this.BRAND_NO!=null &&
              this.BRAND_NO.equals(other.getBRAND_NO()))) &&
            ((this.ZBRAND_DES==null && other.getZBRAND_DES()==null) || 
             (this.ZBRAND_DES!=null &&
              this.ZBRAND_DES.equals(other.getZBRAND_DES())));
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
        if (getPARTNER() != null) {
            _hashCode += getPARTNER().hashCode();
        }
        if (getBRAND_NO() != null) {
            _hashCode += getBRAND_NO().hashCode();
        }
        if (getZBRAND_DES() != null) {
            _hashCode += getZBRAND_DES().hashCode();
        }
        __hashCodeCalc = false;
        return _hashCode;
    }

    // Type metadata
    private static org.apache.axis.description.TypeDesc typeDesc =
        new org.apache.axis.description.TypeDesc(ZSDP004.class, true);

    static {
        typeDesc.setXmlType(new javax.xml.namespace.QName("urn:sap-com:document:sap:rfc:functions", "ZSDP004"));
        org.apache.axis.description.ElementDesc elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("PARTNER");
        elemField.setXmlName(new javax.xml.namespace.QName("", "PARTNER"));
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
        elemField.setFieldName("ZBRAND_DES");
        elemField.setXmlName(new javax.xml.namespace.QName("", "ZBRAND_DES"));
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
