/**
 * ZOA002.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package com.esb.jinying.sap.functions.rfc.sap.document.sap_com;

public class ZOA002  implements java.io.Serializable {
    /* Article Number */
    private java.lang.String MATNR;

    /* Site */
    private java.lang.String WERKS;

    /* Name */
    private java.lang.String NAME1;

    /* Special Stock Indicator */
    private java.lang.String SOBKZ;

    /* Valuated Unrestricted-Use Stock */
    private java.math.BigDecimal LABST;

    /* Value of Total Valuated Stock */
    private java.math.BigDecimal SALK3;

    public ZOA002() {
    }

    public ZOA002(
           java.lang.String MATNR,
           java.lang.String WERKS,
           java.lang.String NAME1,
           java.lang.String SOBKZ,
           java.math.BigDecimal LABST,
           java.math.BigDecimal SALK3) {
           this.MATNR = MATNR;
           this.WERKS = WERKS;
           this.NAME1 = NAME1;
           this.SOBKZ = SOBKZ;
           this.LABST = LABST;
           this.SALK3 = SALK3;
    }


    /**
     * Gets the MATNR value for this ZOA002.
     * 
     * @return MATNR   * Article Number
     */
    public java.lang.String getMATNR() {
        return MATNR;
    }


    /**
     * Sets the MATNR value for this ZOA002.
     * 
     * @param MATNR   * Article Number
     */
    public void setMATNR(java.lang.String MATNR) {
        this.MATNR = MATNR;
    }


    /**
     * Gets the WERKS value for this ZOA002.
     * 
     * @return WERKS   * Site
     */
    public java.lang.String getWERKS() {
        return WERKS;
    }


    /**
     * Sets the WERKS value for this ZOA002.
     * 
     * @param WERKS   * Site
     */
    public void setWERKS(java.lang.String WERKS) {
        this.WERKS = WERKS;
    }


    /**
     * Gets the NAME1 value for this ZOA002.
     * 
     * @return NAME1   * Name
     */
    public java.lang.String getNAME1() {
        return NAME1;
    }


    /**
     * Sets the NAME1 value for this ZOA002.
     * 
     * @param NAME1   * Name
     */
    public void setNAME1(java.lang.String NAME1) {
        this.NAME1 = NAME1;
    }


    /**
     * Gets the SOBKZ value for this ZOA002.
     * 
     * @return SOBKZ   * Special Stock Indicator
     */
    public java.lang.String getSOBKZ() {
        return SOBKZ;
    }


    /**
     * Sets the SOBKZ value for this ZOA002.
     * 
     * @param SOBKZ   * Special Stock Indicator
     */
    public void setSOBKZ(java.lang.String SOBKZ) {
        this.SOBKZ = SOBKZ;
    }


    /**
     * Gets the LABST value for this ZOA002.
     * 
     * @return LABST   * Valuated Unrestricted-Use Stock
     */
    public java.math.BigDecimal getLABST() {
        return LABST;
    }


    /**
     * Sets the LABST value for this ZOA002.
     * 
     * @param LABST   * Valuated Unrestricted-Use Stock
     */
    public void setLABST(java.math.BigDecimal LABST) {
        this.LABST = LABST;
    }


    /**
     * Gets the SALK3 value for this ZOA002.
     * 
     * @return SALK3   * Value of Total Valuated Stock
     */
    public java.math.BigDecimal getSALK3() {
        return SALK3;
    }


    /**
     * Sets the SALK3 value for this ZOA002.
     * 
     * @param SALK3   * Value of Total Valuated Stock
     */
    public void setSALK3(java.math.BigDecimal SALK3) {
        this.SALK3 = SALK3;
    }

    private java.lang.Object __equalsCalc = null;
    public synchronized boolean equals(java.lang.Object obj) {
        if (!(obj instanceof ZOA002)) return false;
        ZOA002 other = (ZOA002) obj;
        if (obj == null) return false;
        if (this == obj) return true;
        if (__equalsCalc != null) {
            return (__equalsCalc == obj);
        }
        __equalsCalc = obj;
        boolean _equals;
        _equals = true && 
            ((this.MATNR==null && other.getMATNR()==null) || 
             (this.MATNR!=null &&
              this.MATNR.equals(other.getMATNR()))) &&
            ((this.WERKS==null && other.getWERKS()==null) || 
             (this.WERKS!=null &&
              this.WERKS.equals(other.getWERKS()))) &&
            ((this.NAME1==null && other.getNAME1()==null) || 
             (this.NAME1!=null &&
              this.NAME1.equals(other.getNAME1()))) &&
            ((this.SOBKZ==null && other.getSOBKZ()==null) || 
             (this.SOBKZ!=null &&
              this.SOBKZ.equals(other.getSOBKZ()))) &&
            ((this.LABST==null && other.getLABST()==null) || 
             (this.LABST!=null &&
              this.LABST.equals(other.getLABST()))) &&
            ((this.SALK3==null && other.getSALK3()==null) || 
             (this.SALK3!=null &&
              this.SALK3.equals(other.getSALK3())));
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
        if (getMATNR() != null) {
            _hashCode += getMATNR().hashCode();
        }
        if (getWERKS() != null) {
            _hashCode += getWERKS().hashCode();
        }
        if (getNAME1() != null) {
            _hashCode += getNAME1().hashCode();
        }
        if (getSOBKZ() != null) {
            _hashCode += getSOBKZ().hashCode();
        }
        if (getLABST() != null) {
            _hashCode += getLABST().hashCode();
        }
        if (getSALK3() != null) {
            _hashCode += getSALK3().hashCode();
        }
        __hashCodeCalc = false;
        return _hashCode;
    }

    // Type metadata
    private static org.apache.axis.description.TypeDesc typeDesc =
        new org.apache.axis.description.TypeDesc(ZOA002.class, true);

    static {
        typeDesc.setXmlType(new javax.xml.namespace.QName("urn:sap-com:document:sap:rfc:functions", "ZOA002"));
        org.apache.axis.description.ElementDesc elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("MATNR");
        elemField.setXmlName(new javax.xml.namespace.QName("", "MATNR"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("WERKS");
        elemField.setXmlName(new javax.xml.namespace.QName("", "WERKS"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("NAME1");
        elemField.setXmlName(new javax.xml.namespace.QName("", "NAME1"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("SOBKZ");
        elemField.setXmlName(new javax.xml.namespace.QName("", "SOBKZ"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("LABST");
        elemField.setXmlName(new javax.xml.namespace.QName("", "LABST"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "decimal"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("SALK3");
        elemField.setXmlName(new javax.xml.namespace.QName("", "SALK3"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "decimal"));
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
