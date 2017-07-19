/**
 * ZRF001_HEAD.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package com.esb.jinying.sap.functions.rfc.sap.document.sap_com;

public class ZRF001_HEAD  implements java.io.Serializable {
    /* Purchasing Document Number */
    private java.lang.String EBELN;

    /* Company Code */
    private java.lang.String BUKRS;

    /* Vendor Account Number */
    private java.lang.String LIFNR;

    /* Name 1 */
    private java.lang.String NAME1;

    /* Date on Which Record Was Created */
    private com.esb.jinying.sap.functions.rfc.sap.document.sap_com.Date AEDAT;

    private java.math.BigInteger LINES;

    /* Your Reference */
    private java.lang.String IHREZ;

    /* Character 100 */
    private java.lang.String MESSAGE;

    public ZRF001_HEAD() {
    }

    public ZRF001_HEAD(
           java.lang.String EBELN,
           java.lang.String BUKRS,
           java.lang.String LIFNR,
           java.lang.String NAME1,
           com.esb.jinying.sap.functions.rfc.sap.document.sap_com.Date AEDAT,
           java.math.BigInteger LINES,
           java.lang.String IHREZ,
           java.lang.String MESSAGE) {
           this.EBELN = EBELN;
           this.BUKRS = BUKRS;
           this.LIFNR = LIFNR;
           this.NAME1 = NAME1;
           this.AEDAT = AEDAT;
           this.LINES = LINES;
           this.IHREZ = IHREZ;
           this.MESSAGE = MESSAGE;
    }


    /**
     * Gets the EBELN value for this ZRF001_HEAD.
     * 
     * @return EBELN   * Purchasing Document Number
     */
    public java.lang.String getEBELN() {
        return EBELN;
    }


    /**
     * Sets the EBELN value for this ZRF001_HEAD.
     * 
     * @param EBELN   * Purchasing Document Number
     */
    public void setEBELN(java.lang.String EBELN) {
        this.EBELN = EBELN;
    }


    /**
     * Gets the BUKRS value for this ZRF001_HEAD.
     * 
     * @return BUKRS   * Company Code
     */
    public java.lang.String getBUKRS() {
        return BUKRS;
    }


    /**
     * Sets the BUKRS value for this ZRF001_HEAD.
     * 
     * @param BUKRS   * Company Code
     */
    public void setBUKRS(java.lang.String BUKRS) {
        this.BUKRS = BUKRS;
    }


    /**
     * Gets the LIFNR value for this ZRF001_HEAD.
     * 
     * @return LIFNR   * Vendor Account Number
     */
    public java.lang.String getLIFNR() {
        return LIFNR;
    }


    /**
     * Sets the LIFNR value for this ZRF001_HEAD.
     * 
     * @param LIFNR   * Vendor Account Number
     */
    public void setLIFNR(java.lang.String LIFNR) {
        this.LIFNR = LIFNR;
    }


    /**
     * Gets the NAME1 value for this ZRF001_HEAD.
     * 
     * @return NAME1   * Name 1
     */
    public java.lang.String getNAME1() {
        return NAME1;
    }


    /**
     * Sets the NAME1 value for this ZRF001_HEAD.
     * 
     * @param NAME1   * Name 1
     */
    public void setNAME1(java.lang.String NAME1) {
        this.NAME1 = NAME1;
    }


    /**
     * Gets the AEDAT value for this ZRF001_HEAD.
     * 
     * @return AEDAT   * Date on Which Record Was Created
     */
    public com.esb.jinying.sap.functions.rfc.sap.document.sap_com.Date getAEDAT() {
        return AEDAT;
    }


    /**
     * Sets the AEDAT value for this ZRF001_HEAD.
     * 
     * @param AEDAT   * Date on Which Record Was Created
     */
    public void setAEDAT(com.esb.jinying.sap.functions.rfc.sap.document.sap_com.Date AEDAT) {
        this.AEDAT = AEDAT;
    }


    /**
     * Gets the LINES value for this ZRF001_HEAD.
     * 
     * @return LINES
     */
    public java.math.BigInteger getLINES() {
        return LINES;
    }


    /**
     * Sets the LINES value for this ZRF001_HEAD.
     * 
     * @param LINES
     */
    public void setLINES(java.math.BigInteger LINES) {
        this.LINES = LINES;
    }


    /**
     * Gets the IHREZ value for this ZRF001_HEAD.
     * 
     * @return IHREZ   * Your Reference
     */
    public java.lang.String getIHREZ() {
        return IHREZ;
    }


    /**
     * Sets the IHREZ value for this ZRF001_HEAD.
     * 
     * @param IHREZ   * Your Reference
     */
    public void setIHREZ(java.lang.String IHREZ) {
        this.IHREZ = IHREZ;
    }


    /**
     * Gets the MESSAGE value for this ZRF001_HEAD.
     * 
     * @return MESSAGE   * Character 100
     */
    public java.lang.String getMESSAGE() {
        return MESSAGE;
    }


    /**
     * Sets the MESSAGE value for this ZRF001_HEAD.
     * 
     * @param MESSAGE   * Character 100
     */
    public void setMESSAGE(java.lang.String MESSAGE) {
        this.MESSAGE = MESSAGE;
    }

    private java.lang.Object __equalsCalc = null;
    public synchronized boolean equals(java.lang.Object obj) {
        if (!(obj instanceof ZRF001_HEAD)) return false;
        ZRF001_HEAD other = (ZRF001_HEAD) obj;
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
            ((this.BUKRS==null && other.getBUKRS()==null) || 
             (this.BUKRS!=null &&
              this.BUKRS.equals(other.getBUKRS()))) &&
            ((this.LIFNR==null && other.getLIFNR()==null) || 
             (this.LIFNR!=null &&
              this.LIFNR.equals(other.getLIFNR()))) &&
            ((this.NAME1==null && other.getNAME1()==null) || 
             (this.NAME1!=null &&
              this.NAME1.equals(other.getNAME1()))) &&
            ((this.AEDAT==null && other.getAEDAT()==null) || 
             (this.AEDAT!=null &&
              this.AEDAT.equals(other.getAEDAT()))) &&
            ((this.LINES==null && other.getLINES()==null) || 
             (this.LINES!=null &&
              this.LINES.equals(other.getLINES()))) &&
            ((this.IHREZ==null && other.getIHREZ()==null) || 
             (this.IHREZ!=null &&
              this.IHREZ.equals(other.getIHREZ()))) &&
            ((this.MESSAGE==null && other.getMESSAGE()==null) || 
             (this.MESSAGE!=null &&
              this.MESSAGE.equals(other.getMESSAGE())));
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
        if (getBUKRS() != null) {
            _hashCode += getBUKRS().hashCode();
        }
        if (getLIFNR() != null) {
            _hashCode += getLIFNR().hashCode();
        }
        if (getNAME1() != null) {
            _hashCode += getNAME1().hashCode();
        }
        if (getAEDAT() != null) {
            _hashCode += getAEDAT().hashCode();
        }
        if (getLINES() != null) {
            _hashCode += getLINES().hashCode();
        }
        if (getIHREZ() != null) {
            _hashCode += getIHREZ().hashCode();
        }
        if (getMESSAGE() != null) {
            _hashCode += getMESSAGE().hashCode();
        }
        __hashCodeCalc = false;
        return _hashCode;
    }

    // Type metadata
    private static org.apache.axis.description.TypeDesc typeDesc =
        new org.apache.axis.description.TypeDesc(ZRF001_HEAD.class, true);

    static {
        typeDesc.setXmlType(new javax.xml.namespace.QName("urn:sap-com:document:sap:rfc:functions", "ZRF001_HEAD"));
        org.apache.axis.description.ElementDesc elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("EBELN");
        elemField.setXmlName(new javax.xml.namespace.QName("", "EBELN"));
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
        elemField.setFieldName("LIFNR");
        elemField.setXmlName(new javax.xml.namespace.QName("", "LIFNR"));
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
        elemField.setFieldName("AEDAT");
        elemField.setXmlName(new javax.xml.namespace.QName("", "AEDAT"));
        elemField.setXmlType(new javax.xml.namespace.QName("urn:sap-com:document:sap:rfc:functions", "date"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("LINES");
        elemField.setXmlName(new javax.xml.namespace.QName("", "LINES"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "integer"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("IHREZ");
        elemField.setXmlName(new javax.xml.namespace.QName("", "IHREZ"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("MESSAGE");
        elemField.setXmlName(new javax.xml.namespace.QName("", "MESSAGE"));
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
