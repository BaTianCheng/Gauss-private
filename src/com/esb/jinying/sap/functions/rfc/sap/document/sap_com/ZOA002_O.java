/**
 * ZOA002_O.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package com.esb.jinying.sap.functions.rfc.sap.document.sap_com;

public class ZOA002_O  implements java.io.Serializable {
    /* Article Number */
    private java.lang.String MATNR;

    /* Changed On */
    private com.esb.jinying.sap.functions.rfc.sap.document.sap_com.Date AEDAT;

    /* Purchase Order Quantity */
    private java.math.BigDecimal MENGE;

    /* Net Price in Purchasing Document (in Document Currency) */
    private java.math.BigDecimal NETPR;

    /* Actual Invoiced Quantity */
    private java.math.BigDecimal FKIMG;

    public ZOA002_O() {
    }

    public ZOA002_O(
           java.lang.String MATNR,
           com.esb.jinying.sap.functions.rfc.sap.document.sap_com.Date AEDAT,
           java.math.BigDecimal MENGE,
           java.math.BigDecimal NETPR,
           java.math.BigDecimal FKIMG) {
           this.MATNR = MATNR;
           this.AEDAT = AEDAT;
           this.MENGE = MENGE;
           this.NETPR = NETPR;
           this.FKIMG = FKIMG;
    }


    /**
     * Gets the MATNR value for this ZOA002_O.
     * 
     * @return MATNR   * Article Number
     */
    public java.lang.String getMATNR() {
        return MATNR;
    }


    /**
     * Sets the MATNR value for this ZOA002_O.
     * 
     * @param MATNR   * Article Number
     */
    public void setMATNR(java.lang.String MATNR) {
        this.MATNR = MATNR;
    }


    /**
     * Gets the AEDAT value for this ZOA002_O.
     * 
     * @return AEDAT   * Changed On
     */
    public com.esb.jinying.sap.functions.rfc.sap.document.sap_com.Date getAEDAT() {
        return AEDAT;
    }


    /**
     * Sets the AEDAT value for this ZOA002_O.
     * 
     * @param AEDAT   * Changed On
     */
    public void setAEDAT(com.esb.jinying.sap.functions.rfc.sap.document.sap_com.Date AEDAT) {
        this.AEDAT = AEDAT;
    }


    /**
     * Gets the MENGE value for this ZOA002_O.
     * 
     * @return MENGE   * Purchase Order Quantity
     */
    public java.math.BigDecimal getMENGE() {
        return MENGE;
    }


    /**
     * Sets the MENGE value for this ZOA002_O.
     * 
     * @param MENGE   * Purchase Order Quantity
     */
    public void setMENGE(java.math.BigDecimal MENGE) {
        this.MENGE = MENGE;
    }


    /**
     * Gets the NETPR value for this ZOA002_O.
     * 
     * @return NETPR   * Net Price in Purchasing Document (in Document Currency)
     */
    public java.math.BigDecimal getNETPR() {
        return NETPR;
    }


    /**
     * Sets the NETPR value for this ZOA002_O.
     * 
     * @param NETPR   * Net Price in Purchasing Document (in Document Currency)
     */
    public void setNETPR(java.math.BigDecimal NETPR) {
        this.NETPR = NETPR;
    }


    /**
     * Gets the FKIMG value for this ZOA002_O.
     * 
     * @return FKIMG   * Actual Invoiced Quantity
     */
    public java.math.BigDecimal getFKIMG() {
        return FKIMG;
    }


    /**
     * Sets the FKIMG value for this ZOA002_O.
     * 
     * @param FKIMG   * Actual Invoiced Quantity
     */
    public void setFKIMG(java.math.BigDecimal FKIMG) {
        this.FKIMG = FKIMG;
    }

    private java.lang.Object __equalsCalc = null;
    public synchronized boolean equals(java.lang.Object obj) {
        if (!(obj instanceof ZOA002_O)) return false;
        ZOA002_O other = (ZOA002_O) obj;
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
            ((this.AEDAT==null && other.getAEDAT()==null) || 
             (this.AEDAT!=null &&
              this.AEDAT.equals(other.getAEDAT()))) &&
            ((this.MENGE==null && other.getMENGE()==null) || 
             (this.MENGE!=null &&
              this.MENGE.equals(other.getMENGE()))) &&
            ((this.NETPR==null && other.getNETPR()==null) || 
             (this.NETPR!=null &&
              this.NETPR.equals(other.getNETPR()))) &&
            ((this.FKIMG==null && other.getFKIMG()==null) || 
             (this.FKIMG!=null &&
              this.FKIMG.equals(other.getFKIMG())));
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
        if (getAEDAT() != null) {
            _hashCode += getAEDAT().hashCode();
        }
        if (getMENGE() != null) {
            _hashCode += getMENGE().hashCode();
        }
        if (getNETPR() != null) {
            _hashCode += getNETPR().hashCode();
        }
        if (getFKIMG() != null) {
            _hashCode += getFKIMG().hashCode();
        }
        __hashCodeCalc = false;
        return _hashCode;
    }

    // Type metadata
    private static org.apache.axis.description.TypeDesc typeDesc =
        new org.apache.axis.description.TypeDesc(ZOA002_O.class, true);

    static {
        typeDesc.setXmlType(new javax.xml.namespace.QName("urn:sap-com:document:sap:rfc:functions", "ZOA002_O"));
        org.apache.axis.description.ElementDesc elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("MATNR");
        elemField.setXmlName(new javax.xml.namespace.QName("", "MATNR"));
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
        elemField.setFieldName("FKIMG");
        elemField.setXmlName(new javax.xml.namespace.QName("", "FKIMG"));
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
