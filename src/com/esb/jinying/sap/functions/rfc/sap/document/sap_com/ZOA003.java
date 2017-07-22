/**
 * ZOA003.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package com.esb.jinying.sap.functions.rfc.sap.document.sap_com;

public class ZOA003  implements java.io.Serializable {
    /* Date on Which Record Was Created */
    private com.esb.jinying.sap.functions.rfc.sap.document.sap_com.Date AEDAT;

    /* Name of Person who Created the Object */
    private java.lang.String ERNAM;

    /* Order Type (Purchasing) */
    private java.lang.String BSART;

    /* Account Number of Vendor or Creditor */
    private java.lang.String LIFNR;

    /* Company Code */
    private java.lang.String BUKRS;

    /* Purchasing Organization */
    private java.lang.String EKORG;

    /* Purchasing Group */
    private java.lang.String EKGRP;

    /* Article Number */
    private java.lang.String MATNR;

    /* Merchandise category 1 */
    private java.lang.String MVGR1;

    /* Purchase Order Quantity */
    private java.math.BigDecimal MENGE;

    /* Net Price in Purchasing Document (in Document Currency) */
    private java.math.BigDecimal NETPR;

    /* Site */
    private java.lang.String WERKS;

    /* Storage Location */
    private java.lang.String LGORT;

    public ZOA003() {
    }

    public ZOA003(
           com.esb.jinying.sap.functions.rfc.sap.document.sap_com.Date AEDAT,
           java.lang.String ERNAM,
           java.lang.String BSART,
           java.lang.String LIFNR,
           java.lang.String BUKRS,
           java.lang.String EKORG,
           java.lang.String EKGRP,
           java.lang.String MATNR,
           java.lang.String MVGR1,
           java.math.BigDecimal MENGE,
           java.math.BigDecimal NETPR,
           java.lang.String WERKS,
           java.lang.String LGORT) {
           this.AEDAT = AEDAT;
           this.ERNAM = ERNAM;
           this.BSART = BSART;
           this.LIFNR = LIFNR;
           this.BUKRS = BUKRS;
           this.EKORG = EKORG;
           this.EKGRP = EKGRP;
           this.MATNR = MATNR;
           this.MVGR1 = MVGR1;
           this.MENGE = MENGE;
           this.NETPR = NETPR;
           this.WERKS = WERKS;
           this.LGORT = LGORT;
    }


    /**
     * Gets the AEDAT value for this ZOA003.
     * 
     * @return AEDAT   * Date on Which Record Was Created
     */
    public com.esb.jinying.sap.functions.rfc.sap.document.sap_com.Date getAEDAT() {
        return AEDAT;
    }


    /**
     * Sets the AEDAT value for this ZOA003.
     * 
     * @param AEDAT   * Date on Which Record Was Created
     */
    public void setAEDAT(com.esb.jinying.sap.functions.rfc.sap.document.sap_com.Date AEDAT) {
        this.AEDAT = AEDAT;
    }


    /**
     * Gets the ERNAM value for this ZOA003.
     * 
     * @return ERNAM   * Name of Person who Created the Object
     */
    public java.lang.String getERNAM() {
        return ERNAM;
    }


    /**
     * Sets the ERNAM value for this ZOA003.
     * 
     * @param ERNAM   * Name of Person who Created the Object
     */
    public void setERNAM(java.lang.String ERNAM) {
        this.ERNAM = ERNAM;
    }


    /**
     * Gets the BSART value for this ZOA003.
     * 
     * @return BSART   * Order Type (Purchasing)
     */
    public java.lang.String getBSART() {
        return BSART;
    }


    /**
     * Sets the BSART value for this ZOA003.
     * 
     * @param BSART   * Order Type (Purchasing)
     */
    public void setBSART(java.lang.String BSART) {
        this.BSART = BSART;
    }


    /**
     * Gets the LIFNR value for this ZOA003.
     * 
     * @return LIFNR   * Account Number of Vendor or Creditor
     */
    public java.lang.String getLIFNR() {
        return LIFNR;
    }


    /**
     * Sets the LIFNR value for this ZOA003.
     * 
     * @param LIFNR   * Account Number of Vendor or Creditor
     */
    public void setLIFNR(java.lang.String LIFNR) {
        this.LIFNR = LIFNR;
    }


    /**
     * Gets the BUKRS value for this ZOA003.
     * 
     * @return BUKRS   * Company Code
     */
    public java.lang.String getBUKRS() {
        return BUKRS;
    }


    /**
     * Sets the BUKRS value for this ZOA003.
     * 
     * @param BUKRS   * Company Code
     */
    public void setBUKRS(java.lang.String BUKRS) {
        this.BUKRS = BUKRS;
    }


    /**
     * Gets the EKORG value for this ZOA003.
     * 
     * @return EKORG   * Purchasing Organization
     */
    public java.lang.String getEKORG() {
        return EKORG;
    }


    /**
     * Sets the EKORG value for this ZOA003.
     * 
     * @param EKORG   * Purchasing Organization
     */
    public void setEKORG(java.lang.String EKORG) {
        this.EKORG = EKORG;
    }


    /**
     * Gets the EKGRP value for this ZOA003.
     * 
     * @return EKGRP   * Purchasing Group
     */
    public java.lang.String getEKGRP() {
        return EKGRP;
    }


    /**
     * Sets the EKGRP value for this ZOA003.
     * 
     * @param EKGRP   * Purchasing Group
     */
    public void setEKGRP(java.lang.String EKGRP) {
        this.EKGRP = EKGRP;
    }


    /**
     * Gets the MATNR value for this ZOA003.
     * 
     * @return MATNR   * Article Number
     */
    public java.lang.String getMATNR() {
        return MATNR;
    }


    /**
     * Sets the MATNR value for this ZOA003.
     * 
     * @param MATNR   * Article Number
     */
    public void setMATNR(java.lang.String MATNR) {
        this.MATNR = MATNR;
    }


    /**
     * Gets the MVGR1 value for this ZOA003.
     * 
     * @return MVGR1   * Merchandise category 1
     */
    public java.lang.String getMVGR1() {
        return MVGR1;
    }


    /**
     * Sets the MVGR1 value for this ZOA003.
     * 
     * @param MVGR1   * Merchandise category 1
     */
    public void setMVGR1(java.lang.String MVGR1) {
        this.MVGR1 = MVGR1;
    }


    /**
     * Gets the MENGE value for this ZOA003.
     * 
     * @return MENGE   * Purchase Order Quantity
     */
    public java.math.BigDecimal getMENGE() {
        return MENGE;
    }


    /**
     * Sets the MENGE value for this ZOA003.
     * 
     * @param MENGE   * Purchase Order Quantity
     */
    public void setMENGE(java.math.BigDecimal MENGE) {
        this.MENGE = MENGE;
    }


    /**
     * Gets the NETPR value for this ZOA003.
     * 
     * @return NETPR   * Net Price in Purchasing Document (in Document Currency)
     */
    public java.math.BigDecimal getNETPR() {
        return NETPR;
    }


    /**
     * Sets the NETPR value for this ZOA003.
     * 
     * @param NETPR   * Net Price in Purchasing Document (in Document Currency)
     */
    public void setNETPR(java.math.BigDecimal NETPR) {
        this.NETPR = NETPR;
    }


    /**
     * Gets the WERKS value for this ZOA003.
     * 
     * @return WERKS   * Site
     */
    public java.lang.String getWERKS() {
        return WERKS;
    }


    /**
     * Sets the WERKS value for this ZOA003.
     * 
     * @param WERKS   * Site
     */
    public void setWERKS(java.lang.String WERKS) {
        this.WERKS = WERKS;
    }


    /**
     * Gets the LGORT value for this ZOA003.
     * 
     * @return LGORT   * Storage Location
     */
    public java.lang.String getLGORT() {
        return LGORT;
    }


    /**
     * Sets the LGORT value for this ZOA003.
     * 
     * @param LGORT   * Storage Location
     */
    public void setLGORT(java.lang.String LGORT) {
        this.LGORT = LGORT;
    }

    private java.lang.Object __equalsCalc = null;
    public synchronized boolean equals(java.lang.Object obj) {
        if (!(obj instanceof ZOA003)) return false;
        ZOA003 other = (ZOA003) obj;
        if (obj == null) return false;
        if (this == obj) return true;
        if (__equalsCalc != null) {
            return (__equalsCalc == obj);
        }
        __equalsCalc = obj;
        boolean _equals;
        _equals = true && 
            ((this.AEDAT==null && other.getAEDAT()==null) || 
             (this.AEDAT!=null &&
              this.AEDAT.equals(other.getAEDAT()))) &&
            ((this.ERNAM==null && other.getERNAM()==null) || 
             (this.ERNAM!=null &&
              this.ERNAM.equals(other.getERNAM()))) &&
            ((this.BSART==null && other.getBSART()==null) || 
             (this.BSART!=null &&
              this.BSART.equals(other.getBSART()))) &&
            ((this.LIFNR==null && other.getLIFNR()==null) || 
             (this.LIFNR!=null &&
              this.LIFNR.equals(other.getLIFNR()))) &&
            ((this.BUKRS==null && other.getBUKRS()==null) || 
             (this.BUKRS!=null &&
              this.BUKRS.equals(other.getBUKRS()))) &&
            ((this.EKORG==null && other.getEKORG()==null) || 
             (this.EKORG!=null &&
              this.EKORG.equals(other.getEKORG()))) &&
            ((this.EKGRP==null && other.getEKGRP()==null) || 
             (this.EKGRP!=null &&
              this.EKGRP.equals(other.getEKGRP()))) &&
            ((this.MATNR==null && other.getMATNR()==null) || 
             (this.MATNR!=null &&
              this.MATNR.equals(other.getMATNR()))) &&
            ((this.MVGR1==null && other.getMVGR1()==null) || 
             (this.MVGR1!=null &&
              this.MVGR1.equals(other.getMVGR1()))) &&
            ((this.MENGE==null && other.getMENGE()==null) || 
             (this.MENGE!=null &&
              this.MENGE.equals(other.getMENGE()))) &&
            ((this.NETPR==null && other.getNETPR()==null) || 
             (this.NETPR!=null &&
              this.NETPR.equals(other.getNETPR()))) &&
            ((this.WERKS==null && other.getWERKS()==null) || 
             (this.WERKS!=null &&
              this.WERKS.equals(other.getWERKS()))) &&
            ((this.LGORT==null && other.getLGORT()==null) || 
             (this.LGORT!=null &&
              this.LGORT.equals(other.getLGORT())));
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
        if (getAEDAT() != null) {
            _hashCode += getAEDAT().hashCode();
        }
        if (getERNAM() != null) {
            _hashCode += getERNAM().hashCode();
        }
        if (getBSART() != null) {
            _hashCode += getBSART().hashCode();
        }
        if (getLIFNR() != null) {
            _hashCode += getLIFNR().hashCode();
        }
        if (getBUKRS() != null) {
            _hashCode += getBUKRS().hashCode();
        }
        if (getEKORG() != null) {
            _hashCode += getEKORG().hashCode();
        }
        if (getEKGRP() != null) {
            _hashCode += getEKGRP().hashCode();
        }
        if (getMATNR() != null) {
            _hashCode += getMATNR().hashCode();
        }
        if (getMVGR1() != null) {
            _hashCode += getMVGR1().hashCode();
        }
        if (getMENGE() != null) {
            _hashCode += getMENGE().hashCode();
        }
        if (getNETPR() != null) {
            _hashCode += getNETPR().hashCode();
        }
        if (getWERKS() != null) {
            _hashCode += getWERKS().hashCode();
        }
        if (getLGORT() != null) {
            _hashCode += getLGORT().hashCode();
        }
        __hashCodeCalc = false;
        return _hashCode;
    }

    // Type metadata
    private static org.apache.axis.description.TypeDesc typeDesc =
        new org.apache.axis.description.TypeDesc(ZOA003.class, true);

    static {
        typeDesc.setXmlType(new javax.xml.namespace.QName("urn:sap-com:document:sap:rfc:functions", "ZOA003"));
        org.apache.axis.description.ElementDesc elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("AEDAT");
        elemField.setXmlName(new javax.xml.namespace.QName("", "AEDAT"));
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
        elemField.setFieldName("BSART");
        elemField.setXmlName(new javax.xml.namespace.QName("", "BSART"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("LIFNR");
        elemField.setXmlName(new javax.xml.namespace.QName("", "LIFNR"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("BUKRS");
        elemField.setXmlName(new javax.xml.namespace.QName("", "BUKRS"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("EKORG");
        elemField.setXmlName(new javax.xml.namespace.QName("", "EKORG"));
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
        elemField.setFieldName("MVGR1");
        elemField.setXmlName(new javax.xml.namespace.QName("", "MVGR1"));
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
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("NETPR");
        elemField.setXmlName(new javax.xml.namespace.QName("", "NETPR"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "decimal"));
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
        elemField.setFieldName("LGORT");
        elemField.setXmlName(new javax.xml.namespace.QName("", "LGORT"));
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
