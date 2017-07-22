/**
 * ZSRF007_HEAD.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package com.esb.jinying.sap.functions.rfc.sap.document.sap_com;

public class ZSRF007_HEAD  implements java.io.Serializable {
    /* Physical Inventory Document */
    private java.lang.String IBLNR;

    /* Fiscal Year */
    private java.lang.String GJAHR;

    /* Site */
    private java.lang.String WERKS;

    /* Storage Location */
    private java.lang.String LGORT;

    /* Planned date of inventory count */
    private com.esb.jinying.sap.functions.rfc.sap.document.sap_com.Date GIDAT;

    /* Physical inventory number */
    private java.lang.String INVNU;

    public ZSRF007_HEAD() {
    }

    public ZSRF007_HEAD(
           java.lang.String IBLNR,
           java.lang.String GJAHR,
           java.lang.String WERKS,
           java.lang.String LGORT,
           com.esb.jinying.sap.functions.rfc.sap.document.sap_com.Date GIDAT,
           java.lang.String INVNU) {
           this.IBLNR = IBLNR;
           this.GJAHR = GJAHR;
           this.WERKS = WERKS;
           this.LGORT = LGORT;
           this.GIDAT = GIDAT;
           this.INVNU = INVNU;
    }


    /**
     * Gets the IBLNR value for this ZSRF007_HEAD.
     * 
     * @return IBLNR   * Physical Inventory Document
     */
    public java.lang.String getIBLNR() {
        return IBLNR;
    }


    /**
     * Sets the IBLNR value for this ZSRF007_HEAD.
     * 
     * @param IBLNR   * Physical Inventory Document
     */
    public void setIBLNR(java.lang.String IBLNR) {
        this.IBLNR = IBLNR;
    }


    /**
     * Gets the GJAHR value for this ZSRF007_HEAD.
     * 
     * @return GJAHR   * Fiscal Year
     */
    public java.lang.String getGJAHR() {
        return GJAHR;
    }


    /**
     * Sets the GJAHR value for this ZSRF007_HEAD.
     * 
     * @param GJAHR   * Fiscal Year
     */
    public void setGJAHR(java.lang.String GJAHR) {
        this.GJAHR = GJAHR;
    }


    /**
     * Gets the WERKS value for this ZSRF007_HEAD.
     * 
     * @return WERKS   * Site
     */
    public java.lang.String getWERKS() {
        return WERKS;
    }


    /**
     * Sets the WERKS value for this ZSRF007_HEAD.
     * 
     * @param WERKS   * Site
     */
    public void setWERKS(java.lang.String WERKS) {
        this.WERKS = WERKS;
    }


    /**
     * Gets the LGORT value for this ZSRF007_HEAD.
     * 
     * @return LGORT   * Storage Location
     */
    public java.lang.String getLGORT() {
        return LGORT;
    }


    /**
     * Sets the LGORT value for this ZSRF007_HEAD.
     * 
     * @param LGORT   * Storage Location
     */
    public void setLGORT(java.lang.String LGORT) {
        this.LGORT = LGORT;
    }


    /**
     * Gets the GIDAT value for this ZSRF007_HEAD.
     * 
     * @return GIDAT   * Planned date of inventory count
     */
    public com.esb.jinying.sap.functions.rfc.sap.document.sap_com.Date getGIDAT() {
        return GIDAT;
    }


    /**
     * Sets the GIDAT value for this ZSRF007_HEAD.
     * 
     * @param GIDAT   * Planned date of inventory count
     */
    public void setGIDAT(com.esb.jinying.sap.functions.rfc.sap.document.sap_com.Date GIDAT) {
        this.GIDAT = GIDAT;
    }


    /**
     * Gets the INVNU value for this ZSRF007_HEAD.
     * 
     * @return INVNU   * Physical inventory number
     */
    public java.lang.String getINVNU() {
        return INVNU;
    }


    /**
     * Sets the INVNU value for this ZSRF007_HEAD.
     * 
     * @param INVNU   * Physical inventory number
     */
    public void setINVNU(java.lang.String INVNU) {
        this.INVNU = INVNU;
    }

    private java.lang.Object __equalsCalc = null;
    public synchronized boolean equals(java.lang.Object obj) {
        if (!(obj instanceof ZSRF007_HEAD)) return false;
        ZSRF007_HEAD other = (ZSRF007_HEAD) obj;
        if (obj == null) return false;
        if (this == obj) return true;
        if (__equalsCalc != null) {
            return (__equalsCalc == obj);
        }
        __equalsCalc = obj;
        boolean _equals;
        _equals = true && 
            ((this.IBLNR==null && other.getIBLNR()==null) || 
             (this.IBLNR!=null &&
              this.IBLNR.equals(other.getIBLNR()))) &&
            ((this.GJAHR==null && other.getGJAHR()==null) || 
             (this.GJAHR!=null &&
              this.GJAHR.equals(other.getGJAHR()))) &&
            ((this.WERKS==null && other.getWERKS()==null) || 
             (this.WERKS!=null &&
              this.WERKS.equals(other.getWERKS()))) &&
            ((this.LGORT==null && other.getLGORT()==null) || 
             (this.LGORT!=null &&
              this.LGORT.equals(other.getLGORT()))) &&
            ((this.GIDAT==null && other.getGIDAT()==null) || 
             (this.GIDAT!=null &&
              this.GIDAT.equals(other.getGIDAT()))) &&
            ((this.INVNU==null && other.getINVNU()==null) || 
             (this.INVNU!=null &&
              this.INVNU.equals(other.getINVNU())));
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
        if (getIBLNR() != null) {
            _hashCode += getIBLNR().hashCode();
        }
        if (getGJAHR() != null) {
            _hashCode += getGJAHR().hashCode();
        }
        if (getWERKS() != null) {
            _hashCode += getWERKS().hashCode();
        }
        if (getLGORT() != null) {
            _hashCode += getLGORT().hashCode();
        }
        if (getGIDAT() != null) {
            _hashCode += getGIDAT().hashCode();
        }
        if (getINVNU() != null) {
            _hashCode += getINVNU().hashCode();
        }
        __hashCodeCalc = false;
        return _hashCode;
    }

    // Type metadata
    private static org.apache.axis.description.TypeDesc typeDesc =
        new org.apache.axis.description.TypeDesc(ZSRF007_HEAD.class, true);

    static {
        typeDesc.setXmlType(new javax.xml.namespace.QName("urn:sap-com:document:sap:rfc:functions", "ZSRF007_HEAD"));
        org.apache.axis.description.ElementDesc elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("IBLNR");
        elemField.setXmlName(new javax.xml.namespace.QName("", "IBLNR"));
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
        elemField.setFieldName("GIDAT");
        elemField.setXmlName(new javax.xml.namespace.QName("", "GIDAT"));
        elemField.setXmlType(new javax.xml.namespace.QName("urn:sap-com:document:sap:rfc:functions", "date"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("INVNU");
        elemField.setXmlName(new javax.xml.namespace.QName("", "INVNU"));
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
