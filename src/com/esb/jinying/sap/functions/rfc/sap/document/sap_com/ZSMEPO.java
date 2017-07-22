/**
 * ZSMEPO.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package com.esb.jinying.sap.functions.rfc.sap.document.sap_com;

public class ZSMEPO  implements java.io.Serializable {
    /* Date on Which Record Was Created */
    private com.esb.jinying.sap.functions.rfc.sap.document.sap_com.Date ERDAT;

    /* Name of Person who Created the Object */
    private java.lang.String ERNAM;

    /* Purchasing Group */
    private java.lang.String EKGRP;

    /* Article Number */
    private java.lang.String MATNR;

    /* Storage Location */
    private java.lang.String LGORT;

    /* Purchase Order Quantity */
    private java.math.BigDecimal MENGE;

    public ZSMEPO() {
    }

    public ZSMEPO(
           com.esb.jinying.sap.functions.rfc.sap.document.sap_com.Date ERDAT,
           java.lang.String ERNAM,
           java.lang.String EKGRP,
           java.lang.String MATNR,
           java.lang.String LGORT,
           java.math.BigDecimal MENGE) {
           this.ERDAT = ERDAT;
           this.ERNAM = ERNAM;
           this.EKGRP = EKGRP;
           this.MATNR = MATNR;
           this.LGORT = LGORT;
           this.MENGE = MENGE;
    }


    /**
     * Gets the ERDAT value for this ZSMEPO.
     * 
     * @return ERDAT   * Date on Which Record Was Created
     */
    public com.esb.jinying.sap.functions.rfc.sap.document.sap_com.Date getERDAT() {
        return ERDAT;
    }


    /**
     * Sets the ERDAT value for this ZSMEPO.
     * 
     * @param ERDAT   * Date on Which Record Was Created
     */
    public void setERDAT(com.esb.jinying.sap.functions.rfc.sap.document.sap_com.Date ERDAT) {
        this.ERDAT = ERDAT;
    }


    /**
     * Gets the ERNAM value for this ZSMEPO.
     * 
     * @return ERNAM   * Name of Person who Created the Object
     */
    public java.lang.String getERNAM() {
        return ERNAM;
    }


    /**
     * Sets the ERNAM value for this ZSMEPO.
     * 
     * @param ERNAM   * Name of Person who Created the Object
     */
    public void setERNAM(java.lang.String ERNAM) {
        this.ERNAM = ERNAM;
    }


    /**
     * Gets the EKGRP value for this ZSMEPO.
     * 
     * @return EKGRP   * Purchasing Group
     */
    public java.lang.String getEKGRP() {
        return EKGRP;
    }


    /**
     * Sets the EKGRP value for this ZSMEPO.
     * 
     * @param EKGRP   * Purchasing Group
     */
    public void setEKGRP(java.lang.String EKGRP) {
        this.EKGRP = EKGRP;
    }


    /**
     * Gets the MATNR value for this ZSMEPO.
     * 
     * @return MATNR   * Article Number
     */
    public java.lang.String getMATNR() {
        return MATNR;
    }


    /**
     * Sets the MATNR value for this ZSMEPO.
     * 
     * @param MATNR   * Article Number
     */
    public void setMATNR(java.lang.String MATNR) {
        this.MATNR = MATNR;
    }


    /**
     * Gets the LGORT value for this ZSMEPO.
     * 
     * @return LGORT   * Storage Location
     */
    public java.lang.String getLGORT() {
        return LGORT;
    }


    /**
     * Sets the LGORT value for this ZSMEPO.
     * 
     * @param LGORT   * Storage Location
     */
    public void setLGORT(java.lang.String LGORT) {
        this.LGORT = LGORT;
    }


    /**
     * Gets the MENGE value for this ZSMEPO.
     * 
     * @return MENGE   * Purchase Order Quantity
     */
    public java.math.BigDecimal getMENGE() {
        return MENGE;
    }


    /**
     * Sets the MENGE value for this ZSMEPO.
     * 
     * @param MENGE   * Purchase Order Quantity
     */
    public void setMENGE(java.math.BigDecimal MENGE) {
        this.MENGE = MENGE;
    }

    private java.lang.Object __equalsCalc = null;
    public synchronized boolean equals(java.lang.Object obj) {
        if (!(obj instanceof ZSMEPO)) return false;
        ZSMEPO other = (ZSMEPO) obj;
        if (obj == null) return false;
        if (this == obj) return true;
        if (__equalsCalc != null) {
            return (__equalsCalc == obj);
        }
        __equalsCalc = obj;
        boolean _equals;
        _equals = true && 
            ((this.ERDAT==null && other.getERDAT()==null) || 
             (this.ERDAT!=null &&
              this.ERDAT.equals(other.getERDAT()))) &&
            ((this.ERNAM==null && other.getERNAM()==null) || 
             (this.ERNAM!=null &&
              this.ERNAM.equals(other.getERNAM()))) &&
            ((this.EKGRP==null && other.getEKGRP()==null) || 
             (this.EKGRP!=null &&
              this.EKGRP.equals(other.getEKGRP()))) &&
            ((this.MATNR==null && other.getMATNR()==null) || 
             (this.MATNR!=null &&
              this.MATNR.equals(other.getMATNR()))) &&
            ((this.LGORT==null && other.getLGORT()==null) || 
             (this.LGORT!=null &&
              this.LGORT.equals(other.getLGORT()))) &&
            ((this.MENGE==null && other.getMENGE()==null) || 
             (this.MENGE!=null &&
              this.MENGE.equals(other.getMENGE())));
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
        if (getERDAT() != null) {
            _hashCode += getERDAT().hashCode();
        }
        if (getERNAM() != null) {
            _hashCode += getERNAM().hashCode();
        }
        if (getEKGRP() != null) {
            _hashCode += getEKGRP().hashCode();
        }
        if (getMATNR() != null) {
            _hashCode += getMATNR().hashCode();
        }
        if (getLGORT() != null) {
            _hashCode += getLGORT().hashCode();
        }
        if (getMENGE() != null) {
            _hashCode += getMENGE().hashCode();
        }
        __hashCodeCalc = false;
        return _hashCode;
    }

    // Type metadata
    private static org.apache.axis.description.TypeDesc typeDesc =
        new org.apache.axis.description.TypeDesc(ZSMEPO.class, true);

    static {
        typeDesc.setXmlType(new javax.xml.namespace.QName("urn:sap-com:document:sap:rfc:functions", "ZSMEPO"));
        org.apache.axis.description.ElementDesc elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("ERDAT");
        elemField.setXmlName(new javax.xml.namespace.QName("", "ERDAT"));
        elemField.setXmlType(new javax.xml.namespace.QName("urn:sap-com:document:sap:rfc:functions", "date"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("ERNAM");
        elemField.setXmlName(new javax.xml.namespace.QName("", "ERNAM"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("EKGRP");
        elemField.setXmlName(new javax.xml.namespace.QName("", "EKGRP"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("MATNR");
        elemField.setXmlName(new javax.xml.namespace.QName("", "MATNR"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("LGORT");
        elemField.setXmlName(new javax.xml.namespace.QName("", "LGORT"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("MENGE");
        elemField.setXmlName(new javax.xml.namespace.QName("", "MENGE"));
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
