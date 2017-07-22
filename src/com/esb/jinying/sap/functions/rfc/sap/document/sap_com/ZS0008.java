/**
 * ZS0008.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package com.esb.jinying.sap.functions.rfc.sap.document.sap_com;

public class ZS0008  implements java.io.Serializable {
    /* Physical Inventory Document */
    private java.lang.String IBLNR;

    /* Article Number */
    private java.lang.String MATNR;

    /* Global Trade Item Number (GTIN) */
    private java.lang.String EAN11;

    public ZS0008() {
    }

    public ZS0008(
           java.lang.String IBLNR,
           java.lang.String MATNR,
           java.lang.String EAN11) {
           this.IBLNR = IBLNR;
           this.MATNR = MATNR;
           this.EAN11 = EAN11;
    }


    /**
     * Gets the IBLNR value for this ZS0008.
     * 
     * @return IBLNR   * Physical Inventory Document
     */
    public java.lang.String getIBLNR() {
        return IBLNR;
    }


    /**
     * Sets the IBLNR value for this ZS0008.
     * 
     * @param IBLNR   * Physical Inventory Document
     */
    public void setIBLNR(java.lang.String IBLNR) {
        this.IBLNR = IBLNR;
    }


    /**
     * Gets the MATNR value for this ZS0008.
     * 
     * @return MATNR   * Article Number
     */
    public java.lang.String getMATNR() {
        return MATNR;
    }


    /**
     * Sets the MATNR value for this ZS0008.
     * 
     * @param MATNR   * Article Number
     */
    public void setMATNR(java.lang.String MATNR) {
        this.MATNR = MATNR;
    }


    /**
     * Gets the EAN11 value for this ZS0008.
     * 
     * @return EAN11   * Global Trade Item Number (GTIN)
     */
    public java.lang.String getEAN11() {
        return EAN11;
    }


    /**
     * Sets the EAN11 value for this ZS0008.
     * 
     * @param EAN11   * Global Trade Item Number (GTIN)
     */
    public void setEAN11(java.lang.String EAN11) {
        this.EAN11 = EAN11;
    }

    private java.lang.Object __equalsCalc = null;
    public synchronized boolean equals(java.lang.Object obj) {
        if (!(obj instanceof ZS0008)) return false;
        ZS0008 other = (ZS0008) obj;
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
            ((this.MATNR==null && other.getMATNR()==null) || 
             (this.MATNR!=null &&
              this.MATNR.equals(other.getMATNR()))) &&
            ((this.EAN11==null && other.getEAN11()==null) || 
             (this.EAN11!=null &&
              this.EAN11.equals(other.getEAN11())));
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
        if (getMATNR() != null) {
            _hashCode += getMATNR().hashCode();
        }
        if (getEAN11() != null) {
            _hashCode += getEAN11().hashCode();
        }
        __hashCodeCalc = false;
        return _hashCode;
    }

    // Type metadata
    private static org.apache.axis.description.TypeDesc typeDesc =
        new org.apache.axis.description.TypeDesc(ZS0008.class, true);

    static {
        typeDesc.setXmlType(new javax.xml.namespace.QName("urn:sap-com:document:sap:rfc:functions", "ZS0008"));
        org.apache.axis.description.ElementDesc elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("IBLNR");
        elemField.setXmlName(new javax.xml.namespace.QName("", "IBLNR"));
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
        elemField.setFieldName("EAN11");
        elemField.setXmlName(new javax.xml.namespace.QName("", "EAN11"));
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
