/**
 * ZRF005_HEAD.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package com.esb.jinying.sap.functions.rfc.sap.document.sap_com;

public class ZRF005_HEAD  implements java.io.Serializable {
    /* Sales and Distribution Document Number */
    private java.lang.String VBELN;

    /* Delivery Type */
    private java.lang.String LFART;

    /* Customer Number */
    private java.lang.String KUNNR;

    /* Name 1 */
    private java.lang.String NAME1;

    /* Date on Which Record Was Created */
    private com.esb.jinying.sap.functions.rfc.sap.document.sap_com.Date ERDAT;

    private java.math.BigInteger LINES;

    /* Goods Issue Date */
    private com.esb.jinying.sap.functions.rfc.sap.document.sap_com.Date WADAT;

    public ZRF005_HEAD() {
    }

    public ZRF005_HEAD(
           java.lang.String VBELN,
           java.lang.String LFART,
           java.lang.String KUNNR,
           java.lang.String NAME1,
           com.esb.jinying.sap.functions.rfc.sap.document.sap_com.Date ERDAT,
           java.math.BigInteger LINES,
           com.esb.jinying.sap.functions.rfc.sap.document.sap_com.Date WADAT) {
           this.VBELN = VBELN;
           this.LFART = LFART;
           this.KUNNR = KUNNR;
           this.NAME1 = NAME1;
           this.ERDAT = ERDAT;
           this.LINES = LINES;
           this.WADAT = WADAT;
    }


    /**
     * Gets the VBELN value for this ZRF005_HEAD.
     * 
     * @return VBELN   * Sales and Distribution Document Number
     */
    public java.lang.String getVBELN() {
        return VBELN;
    }


    /**
     * Sets the VBELN value for this ZRF005_HEAD.
     * 
     * @param VBELN   * Sales and Distribution Document Number
     */
    public void setVBELN(java.lang.String VBELN) {
        this.VBELN = VBELN;
    }


    /**
     * Gets the LFART value for this ZRF005_HEAD.
     * 
     * @return LFART   * Delivery Type
     */
    public java.lang.String getLFART() {
        return LFART;
    }


    /**
     * Sets the LFART value for this ZRF005_HEAD.
     * 
     * @param LFART   * Delivery Type
     */
    public void setLFART(java.lang.String LFART) {
        this.LFART = LFART;
    }


    /**
     * Gets the KUNNR value for this ZRF005_HEAD.
     * 
     * @return KUNNR   * Customer Number
     */
    public java.lang.String getKUNNR() {
        return KUNNR;
    }


    /**
     * Sets the KUNNR value for this ZRF005_HEAD.
     * 
     * @param KUNNR   * Customer Number
     */
    public void setKUNNR(java.lang.String KUNNR) {
        this.KUNNR = KUNNR;
    }


    /**
     * Gets the NAME1 value for this ZRF005_HEAD.
     * 
     * @return NAME1   * Name 1
     */
    public java.lang.String getNAME1() {
        return NAME1;
    }


    /**
     * Sets the NAME1 value for this ZRF005_HEAD.
     * 
     * @param NAME1   * Name 1
     */
    public void setNAME1(java.lang.String NAME1) {
        this.NAME1 = NAME1;
    }


    /**
     * Gets the ERDAT value for this ZRF005_HEAD.
     * 
     * @return ERDAT   * Date on Which Record Was Created
     */
    public com.esb.jinying.sap.functions.rfc.sap.document.sap_com.Date getERDAT() {
        return ERDAT;
    }


    /**
     * Sets the ERDAT value for this ZRF005_HEAD.
     * 
     * @param ERDAT   * Date on Which Record Was Created
     */
    public void setERDAT(com.esb.jinying.sap.functions.rfc.sap.document.sap_com.Date ERDAT) {
        this.ERDAT = ERDAT;
    }


    /**
     * Gets the LINES value for this ZRF005_HEAD.
     * 
     * @return LINES
     */
    public java.math.BigInteger getLINES() {
        return LINES;
    }


    /**
     * Sets the LINES value for this ZRF005_HEAD.
     * 
     * @param LINES
     */
    public void setLINES(java.math.BigInteger LINES) {
        this.LINES = LINES;
    }


    /**
     * Gets the WADAT value for this ZRF005_HEAD.
     * 
     * @return WADAT   * Goods Issue Date
     */
    public com.esb.jinying.sap.functions.rfc.sap.document.sap_com.Date getWADAT() {
        return WADAT;
    }


    /**
     * Sets the WADAT value for this ZRF005_HEAD.
     * 
     * @param WADAT   * Goods Issue Date
     */
    public void setWADAT(com.esb.jinying.sap.functions.rfc.sap.document.sap_com.Date WADAT) {
        this.WADAT = WADAT;
    }

    private java.lang.Object __equalsCalc = null;
    public synchronized boolean equals(java.lang.Object obj) {
        if (!(obj instanceof ZRF005_HEAD)) return false;
        ZRF005_HEAD other = (ZRF005_HEAD) obj;
        if (obj == null) return false;
        if (this == obj) return true;
        if (__equalsCalc != null) {
            return (__equalsCalc == obj);
        }
        __equalsCalc = obj;
        boolean _equals;
        _equals = true && 
            ((this.VBELN==null && other.getVBELN()==null) || 
             (this.VBELN!=null &&
              this.VBELN.equals(other.getVBELN()))) &&
            ((this.LFART==null && other.getLFART()==null) || 
             (this.LFART!=null &&
              this.LFART.equals(other.getLFART()))) &&
            ((this.KUNNR==null && other.getKUNNR()==null) || 
             (this.KUNNR!=null &&
              this.KUNNR.equals(other.getKUNNR()))) &&
            ((this.NAME1==null && other.getNAME1()==null) || 
             (this.NAME1!=null &&
              this.NAME1.equals(other.getNAME1()))) &&
            ((this.ERDAT==null && other.getERDAT()==null) || 
             (this.ERDAT!=null &&
              this.ERDAT.equals(other.getERDAT()))) &&
            ((this.LINES==null && other.getLINES()==null) || 
             (this.LINES!=null &&
              this.LINES.equals(other.getLINES()))) &&
            ((this.WADAT==null && other.getWADAT()==null) || 
             (this.WADAT!=null &&
              this.WADAT.equals(other.getWADAT())));
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
        if (getVBELN() != null) {
            _hashCode += getVBELN().hashCode();
        }
        if (getLFART() != null) {
            _hashCode += getLFART().hashCode();
        }
        if (getKUNNR() != null) {
            _hashCode += getKUNNR().hashCode();
        }
        if (getNAME1() != null) {
            _hashCode += getNAME1().hashCode();
        }
        if (getERDAT() != null) {
            _hashCode += getERDAT().hashCode();
        }
        if (getLINES() != null) {
            _hashCode += getLINES().hashCode();
        }
        if (getWADAT() != null) {
            _hashCode += getWADAT().hashCode();
        }
        __hashCodeCalc = false;
        return _hashCode;
    }

    // Type metadata
    private static org.apache.axis.description.TypeDesc typeDesc =
        new org.apache.axis.description.TypeDesc(ZRF005_HEAD.class, true);

    static {
        typeDesc.setXmlType(new javax.xml.namespace.QName("urn:sap-com:document:sap:rfc:functions", "ZRF005_HEAD"));
        org.apache.axis.description.ElementDesc elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("VBELN");
        elemField.setXmlName(new javax.xml.namespace.QName("", "VBELN"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("LFART");
        elemField.setXmlName(new javax.xml.namespace.QName("", "LFART"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("KUNNR");
        elemField.setXmlName(new javax.xml.namespace.QName("", "KUNNR"));
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
        elemField.setFieldName("ERDAT");
        elemField.setXmlName(new javax.xml.namespace.QName("", "ERDAT"));
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
        elemField.setFieldName("WADAT");
        elemField.setXmlName(new javax.xml.namespace.QName("", "WADAT"));
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
