/**
 * ZSPOHEADER.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package com.esb.jinying.sap.functions.rfc.sap.document.sap_com;

public class ZSPOHEADER  implements java.io.Serializable {
    /* Purchasing Document Number */
    private java.lang.String EBELN;

    /* Purchasing Document Type */
    private java.lang.String BSART;

    /* Vendor Account Number */
    private java.lang.String LIFNR;

    /* Purchasing Organization */
    private java.lang.String EKORG;

    /* Purchasing Group */
    private java.lang.String EKGRP;

    /* Site */
    private java.lang.String WERKS;

    /* Storage Location */
    private java.lang.String LGORT;

    /* Purchasing Document Date */
    private com.esb.jinying.sap.functions.rfc.sap.document.sap_com.Date BEDAT;

    /* Delivery Date */
    private java.lang.String EEIND;

    /* First telephone number */
    private java.lang.String TELF1;

    /* Second telephone number */
    private java.lang.String TELF2;

    /* Fax Number */
    private java.lang.String TELFX;

    private java.lang.String POTXT;

    public ZSPOHEADER() {
    }

    public ZSPOHEADER(
           java.lang.String EBELN,
           java.lang.String BSART,
           java.lang.String LIFNR,
           java.lang.String EKORG,
           java.lang.String EKGRP,
           java.lang.String WERKS,
           java.lang.String LGORT,
           com.esb.jinying.sap.functions.rfc.sap.document.sap_com.Date BEDAT,
           java.lang.String EEIND,
           java.lang.String TELF1,
           java.lang.String TELF2,
           java.lang.String TELFX,
           java.lang.String POTXT) {
           this.EBELN = EBELN;
           this.BSART = BSART;
           this.LIFNR = LIFNR;
           this.EKORG = EKORG;
           this.EKGRP = EKGRP;
           this.WERKS = WERKS;
           this.LGORT = LGORT;
           this.BEDAT = BEDAT;
           this.EEIND = EEIND;
           this.TELF1 = TELF1;
           this.TELF2 = TELF2;
           this.TELFX = TELFX;
           this.POTXT = POTXT;
    }


    /**
     * Gets the EBELN value for this ZSPOHEADER.
     * 
     * @return EBELN   * Purchasing Document Number
     */
    public java.lang.String getEBELN() {
        return EBELN;
    }


    /**
     * Sets the EBELN value for this ZSPOHEADER.
     * 
     * @param EBELN   * Purchasing Document Number
     */
    public void setEBELN(java.lang.String EBELN) {
        this.EBELN = EBELN;
    }


    /**
     * Gets the BSART value for this ZSPOHEADER.
     * 
     * @return BSART   * Purchasing Document Type
     */
    public java.lang.String getBSART() {
        return BSART;
    }


    /**
     * Sets the BSART value for this ZSPOHEADER.
     * 
     * @param BSART   * Purchasing Document Type
     */
    public void setBSART(java.lang.String BSART) {
        this.BSART = BSART;
    }


    /**
     * Gets the LIFNR value for this ZSPOHEADER.
     * 
     * @return LIFNR   * Vendor Account Number
     */
    public java.lang.String getLIFNR() {
        return LIFNR;
    }


    /**
     * Sets the LIFNR value for this ZSPOHEADER.
     * 
     * @param LIFNR   * Vendor Account Number
     */
    public void setLIFNR(java.lang.String LIFNR) {
        this.LIFNR = LIFNR;
    }


    /**
     * Gets the EKORG value for this ZSPOHEADER.
     * 
     * @return EKORG   * Purchasing Organization
     */
    public java.lang.String getEKORG() {
        return EKORG;
    }


    /**
     * Sets the EKORG value for this ZSPOHEADER.
     * 
     * @param EKORG   * Purchasing Organization
     */
    public void setEKORG(java.lang.String EKORG) {
        this.EKORG = EKORG;
    }


    /**
     * Gets the EKGRP value for this ZSPOHEADER.
     * 
     * @return EKGRP   * Purchasing Group
     */
    public java.lang.String getEKGRP() {
        return EKGRP;
    }


    /**
     * Sets the EKGRP value for this ZSPOHEADER.
     * 
     * @param EKGRP   * Purchasing Group
     */
    public void setEKGRP(java.lang.String EKGRP) {
        this.EKGRP = EKGRP;
    }


    /**
     * Gets the WERKS value for this ZSPOHEADER.
     * 
     * @return WERKS   * Site
     */
    public java.lang.String getWERKS() {
        return WERKS;
    }


    /**
     * Sets the WERKS value for this ZSPOHEADER.
     * 
     * @param WERKS   * Site
     */
    public void setWERKS(java.lang.String WERKS) {
        this.WERKS = WERKS;
    }


    /**
     * Gets the LGORT value for this ZSPOHEADER.
     * 
     * @return LGORT   * Storage Location
     */
    public java.lang.String getLGORT() {
        return LGORT;
    }


    /**
     * Sets the LGORT value for this ZSPOHEADER.
     * 
     * @param LGORT   * Storage Location
     */
    public void setLGORT(java.lang.String LGORT) {
        this.LGORT = LGORT;
    }


    /**
     * Gets the BEDAT value for this ZSPOHEADER.
     * 
     * @return BEDAT   * Purchasing Document Date
     */
    public com.esb.jinying.sap.functions.rfc.sap.document.sap_com.Date getBEDAT() {
        return BEDAT;
    }


    /**
     * Sets the BEDAT value for this ZSPOHEADER.
     * 
     * @param BEDAT   * Purchasing Document Date
     */
    public void setBEDAT(com.esb.jinying.sap.functions.rfc.sap.document.sap_com.Date BEDAT) {
        this.BEDAT = BEDAT;
    }


    /**
     * Gets the EEIND value for this ZSPOHEADER.
     * 
     * @return EEIND   * Delivery Date
     */
    public java.lang.String getEEIND() {
        return EEIND;
    }


    /**
     * Sets the EEIND value for this ZSPOHEADER.
     * 
     * @param EEIND   * Delivery Date
     */
    public void setEEIND(java.lang.String EEIND) {
        this.EEIND = EEIND;
    }


    /**
     * Gets the TELF1 value for this ZSPOHEADER.
     * 
     * @return TELF1   * First telephone number
     */
    public java.lang.String getTELF1() {
        return TELF1;
    }


    /**
     * Sets the TELF1 value for this ZSPOHEADER.
     * 
     * @param TELF1   * First telephone number
     */
    public void setTELF1(java.lang.String TELF1) {
        this.TELF1 = TELF1;
    }


    /**
     * Gets the TELF2 value for this ZSPOHEADER.
     * 
     * @return TELF2   * Second telephone number
     */
    public java.lang.String getTELF2() {
        return TELF2;
    }


    /**
     * Sets the TELF2 value for this ZSPOHEADER.
     * 
     * @param TELF2   * Second telephone number
     */
    public void setTELF2(java.lang.String TELF2) {
        this.TELF2 = TELF2;
    }


    /**
     * Gets the TELFX value for this ZSPOHEADER.
     * 
     * @return TELFX   * Fax Number
     */
    public java.lang.String getTELFX() {
        return TELFX;
    }


    /**
     * Sets the TELFX value for this ZSPOHEADER.
     * 
     * @param TELFX   * Fax Number
     */
    public void setTELFX(java.lang.String TELFX) {
        this.TELFX = TELFX;
    }


    /**
     * Gets the POTXT value for this ZSPOHEADER.
     * 
     * @return POTXT
     */
    public java.lang.String getPOTXT() {
        return POTXT;
    }


    /**
     * Sets the POTXT value for this ZSPOHEADER.
     * 
     * @param POTXT
     */
    public void setPOTXT(java.lang.String POTXT) {
        this.POTXT = POTXT;
    }

    private java.lang.Object __equalsCalc = null;
    public synchronized boolean equals(java.lang.Object obj) {
        if (!(obj instanceof ZSPOHEADER)) return false;
        ZSPOHEADER other = (ZSPOHEADER) obj;
        if (obj == null) return false;
        if (this == obj) return true;
        if (__equalsCalc != null) {
            return (__equalsCalc == obj);
        }
        __equalsCalc = obj;
        boolean _equals;
        _equals = true && 
            ((this.EBELN==null && other.getEBELN()==null) || 
             (this.EBELN!=null &&
              this.EBELN.equals(other.getEBELN()))) &&
            ((this.BSART==null && other.getBSART()==null) || 
             (this.BSART!=null &&
              this.BSART.equals(other.getBSART()))) &&
            ((this.LIFNR==null && other.getLIFNR()==null) || 
             (this.LIFNR!=null &&
              this.LIFNR.equals(other.getLIFNR()))) &&
            ((this.EKORG==null && other.getEKORG()==null) || 
             (this.EKORG!=null &&
              this.EKORG.equals(other.getEKORG()))) &&
            ((this.EKGRP==null && other.getEKGRP()==null) || 
             (this.EKGRP!=null &&
              this.EKGRP.equals(other.getEKGRP()))) &&
            ((this.WERKS==null && other.getWERKS()==null) || 
             (this.WERKS!=null &&
              this.WERKS.equals(other.getWERKS()))) &&
            ((this.LGORT==null && other.getLGORT()==null) || 
             (this.LGORT!=null &&
              this.LGORT.equals(other.getLGORT()))) &&
            ((this.BEDAT==null && other.getBEDAT()==null) || 
             (this.BEDAT!=null &&
              this.BEDAT.equals(other.getBEDAT()))) &&
            ((this.EEIND==null && other.getEEIND()==null) || 
             (this.EEIND!=null &&
              this.EEIND.equals(other.getEEIND()))) &&
            ((this.TELF1==null && other.getTELF1()==null) || 
             (this.TELF1!=null &&
              this.TELF1.equals(other.getTELF1()))) &&
            ((this.TELF2==null && other.getTELF2()==null) || 
             (this.TELF2!=null &&
              this.TELF2.equals(other.getTELF2()))) &&
            ((this.TELFX==null && other.getTELFX()==null) || 
             (this.TELFX!=null &&
              this.TELFX.equals(other.getTELFX()))) &&
            ((this.POTXT==null && other.getPOTXT()==null) || 
             (this.POTXT!=null &&
              this.POTXT.equals(other.getPOTXT())));
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
        if (getEBELN() != null) {
            _hashCode += getEBELN().hashCode();
        }
        if (getBSART() != null) {
            _hashCode += getBSART().hashCode();
        }
        if (getLIFNR() != null) {
            _hashCode += getLIFNR().hashCode();
        }
        if (getEKORG() != null) {
            _hashCode += getEKORG().hashCode();
        }
        if (getEKGRP() != null) {
            _hashCode += getEKGRP().hashCode();
        }
        if (getWERKS() != null) {
            _hashCode += getWERKS().hashCode();
        }
        if (getLGORT() != null) {
            _hashCode += getLGORT().hashCode();
        }
        if (getBEDAT() != null) {
            _hashCode += getBEDAT().hashCode();
        }
        if (getEEIND() != null) {
            _hashCode += getEEIND().hashCode();
        }
        if (getTELF1() != null) {
            _hashCode += getTELF1().hashCode();
        }
        if (getTELF2() != null) {
            _hashCode += getTELF2().hashCode();
        }
        if (getTELFX() != null) {
            _hashCode += getTELFX().hashCode();
        }
        if (getPOTXT() != null) {
            _hashCode += getPOTXT().hashCode();
        }
        __hashCodeCalc = false;
        return _hashCode;
    }

    // Type metadata
    private static org.apache.axis.description.TypeDesc typeDesc =
        new org.apache.axis.description.TypeDesc(ZSPOHEADER.class, true);

    static {
        typeDesc.setXmlType(new javax.xml.namespace.QName("urn:sap-com:document:sap:rfc:functions", "ZSPOHEADER"));
        org.apache.axis.description.ElementDesc elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("EBELN");
        elemField.setXmlName(new javax.xml.namespace.QName("", "EBELN"));
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
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("BEDAT");
        elemField.setXmlName(new javax.xml.namespace.QName("", "BEDAT"));
        elemField.setXmlType(new javax.xml.namespace.QName("urn:sap-com:document:sap:rfc:functions", "date"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("EEIND");
        elemField.setXmlName(new javax.xml.namespace.QName("", "EEIND"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("TELF1");
        elemField.setXmlName(new javax.xml.namespace.QName("", "TELF1"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("TELF2");
        elemField.setXmlName(new javax.xml.namespace.QName("", "TELF2"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("TELFX");
        elemField.setXmlName(new javax.xml.namespace.QName("", "TELFX"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("POTXT");
        elemField.setXmlName(new javax.xml.namespace.QName("", "POTXT"));
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
