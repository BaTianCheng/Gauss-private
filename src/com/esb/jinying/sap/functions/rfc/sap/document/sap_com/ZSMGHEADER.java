/**
 * ZSMGHEADER.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package com.esb.jinying.sap.functions.rfc.sap.document.sap_com;

public class ZSMGHEADER  implements java.io.Serializable {
    /* Number of Article Document */
    private java.lang.String BELNR;

    /* Article Document Year */
    private java.lang.String GJAHR;

    /* Purchasing Document Type */
    private java.lang.String BSART;

    /* Vendor Account Number */
    private java.lang.String LIFNR;

    /* Site */
    private java.lang.String WERKS;

    /* Storage Location */
    private java.lang.String LGORT;

    /* Posting Date in the Document */
    private com.esb.jinying.sap.functions.rfc.sap.document.sap_com.Date BUDAT;

    public ZSMGHEADER() {
    }

    public ZSMGHEADER(
           java.lang.String BELNR,
           java.lang.String GJAHR,
           java.lang.String BSART,
           java.lang.String LIFNR,
           java.lang.String WERKS,
           java.lang.String LGORT,
           com.esb.jinying.sap.functions.rfc.sap.document.sap_com.Date BUDAT) {
           this.BELNR = BELNR;
           this.GJAHR = GJAHR;
           this.BSART = BSART;
           this.LIFNR = LIFNR;
           this.WERKS = WERKS;
           this.LGORT = LGORT;
           this.BUDAT = BUDAT;
    }


    /**
     * Gets the BELNR value for this ZSMGHEADER.
     * 
     * @return BELNR   * Number of Article Document
     */
    public java.lang.String getBELNR() {
        return BELNR;
    }


    /**
     * Sets the BELNR value for this ZSMGHEADER.
     * 
     * @param BELNR   * Number of Article Document
     */
    public void setBELNR(java.lang.String BELNR) {
        this.BELNR = BELNR;
    }


    /**
     * Gets the GJAHR value for this ZSMGHEADER.
     * 
     * @return GJAHR   * Article Document Year
     */
    public java.lang.String getGJAHR() {
        return GJAHR;
    }


    /**
     * Sets the GJAHR value for this ZSMGHEADER.
     * 
     * @param GJAHR   * Article Document Year
     */
    public void setGJAHR(java.lang.String GJAHR) {
        this.GJAHR = GJAHR;
    }


    /**
     * Gets the BSART value for this ZSMGHEADER.
     * 
     * @return BSART   * Purchasing Document Type
     */
    public java.lang.String getBSART() {
        return BSART;
    }


    /**
     * Sets the BSART value for this ZSMGHEADER.
     * 
     * @param BSART   * Purchasing Document Type
     */
    public void setBSART(java.lang.String BSART) {
        this.BSART = BSART;
    }


    /**
     * Gets the LIFNR value for this ZSMGHEADER.
     * 
     * @return LIFNR   * Vendor Account Number
     */
    public java.lang.String getLIFNR() {
        return LIFNR;
    }


    /**
     * Sets the LIFNR value for this ZSMGHEADER.
     * 
     * @param LIFNR   * Vendor Account Number
     */
    public void setLIFNR(java.lang.String LIFNR) {
        this.LIFNR = LIFNR;
    }


    /**
     * Gets the WERKS value for this ZSMGHEADER.
     * 
     * @return WERKS   * Site
     */
    public java.lang.String getWERKS() {
        return WERKS;
    }


    /**
     * Sets the WERKS value for this ZSMGHEADER.
     * 
     * @param WERKS   * Site
     */
    public void setWERKS(java.lang.String WERKS) {
        this.WERKS = WERKS;
    }


    /**
     * Gets the LGORT value for this ZSMGHEADER.
     * 
     * @return LGORT   * Storage Location
     */
    public java.lang.String getLGORT() {
        return LGORT;
    }


    /**
     * Sets the LGORT value for this ZSMGHEADER.
     * 
     * @param LGORT   * Storage Location
     */
    public void setLGORT(java.lang.String LGORT) {
        this.LGORT = LGORT;
    }


    /**
     * Gets the BUDAT value for this ZSMGHEADER.
     * 
     * @return BUDAT   * Posting Date in the Document
     */
    public com.esb.jinying.sap.functions.rfc.sap.document.sap_com.Date getBUDAT() {
        return BUDAT;
    }


    /**
     * Sets the BUDAT value for this ZSMGHEADER.
     * 
     * @param BUDAT   * Posting Date in the Document
     */
    public void setBUDAT(com.esb.jinying.sap.functions.rfc.sap.document.sap_com.Date BUDAT) {
        this.BUDAT = BUDAT;
    }

    private java.lang.Object __equalsCalc = null;
    public synchronized boolean equals(java.lang.Object obj) {
        if (!(obj instanceof ZSMGHEADER)) return false;
        ZSMGHEADER other = (ZSMGHEADER) obj;
        if (obj == null) return false;
        if (this == obj) return true;
        if (__equalsCalc != null) {
            return (__equalsCalc == obj);
        }
        __equalsCalc = obj;
        boolean _equals;
        _equals = true && 
            ((this.BELNR==null && other.getBELNR()==null) || 
             (this.BELNR!=null &&
              this.BELNR.equals(other.getBELNR()))) &&
            ((this.GJAHR==null && other.getGJAHR()==null) || 
             (this.GJAHR!=null &&
              this.GJAHR.equals(other.getGJAHR()))) &&
            ((this.BSART==null && other.getBSART()==null) || 
             (this.BSART!=null &&
              this.BSART.equals(other.getBSART()))) &&
            ((this.LIFNR==null && other.getLIFNR()==null) || 
             (this.LIFNR!=null &&
              this.LIFNR.equals(other.getLIFNR()))) &&
            ((this.WERKS==null && other.getWERKS()==null) || 
             (this.WERKS!=null &&
              this.WERKS.equals(other.getWERKS()))) &&
            ((this.LGORT==null && other.getLGORT()==null) || 
             (this.LGORT!=null &&
              this.LGORT.equals(other.getLGORT()))) &&
            ((this.BUDAT==null && other.getBUDAT()==null) || 
             (this.BUDAT!=null &&
              this.BUDAT.equals(other.getBUDAT())));
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
        if (getBELNR() != null) {
            _hashCode += getBELNR().hashCode();
        }
        if (getGJAHR() != null) {
            _hashCode += getGJAHR().hashCode();
        }
        if (getBSART() != null) {
            _hashCode += getBSART().hashCode();
        }
        if (getLIFNR() != null) {
            _hashCode += getLIFNR().hashCode();
        }
        if (getWERKS() != null) {
            _hashCode += getWERKS().hashCode();
        }
        if (getLGORT() != null) {
            _hashCode += getLGORT().hashCode();
        }
        if (getBUDAT() != null) {
            _hashCode += getBUDAT().hashCode();
        }
        __hashCodeCalc = false;
        return _hashCode;
    }

    // Type metadata
    private static org.apache.axis.description.TypeDesc typeDesc =
        new org.apache.axis.description.TypeDesc(ZSMGHEADER.class, true);

    static {
        typeDesc.setXmlType(new javax.xml.namespace.QName("urn:sap-com:document:sap:rfc:functions", "ZSMGHEADER"));
        org.apache.axis.description.ElementDesc elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("BELNR");
        elemField.setXmlName(new javax.xml.namespace.QName("", "BELNR"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("GJAHR");
        elemField.setXmlName(new javax.xml.namespace.QName("", "GJAHR"));
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
        elemField.setFieldName("BUDAT");
        elemField.setXmlName(new javax.xml.namespace.QName("", "BUDAT"));
        elemField.setXmlType(new javax.xml.namespace.QName("urn:sap-com:document:sap:rfc:functions", "date"));
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
