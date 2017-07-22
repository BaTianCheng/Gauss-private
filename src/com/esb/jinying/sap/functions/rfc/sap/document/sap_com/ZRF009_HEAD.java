/**
 * ZRF009_HEAD.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package com.esb.jinying.sap.functions.rfc.sap.document.sap_com;

public class ZRF009_HEAD  implements java.io.Serializable {
    /* Number of Reservation/Dependent Requirement */
    private java.lang.String RSNUM;

    /* Base date for reservation */
    private com.esb.jinying.sap.functions.rfc.sap.document.sap_com.Date RSDAT;

    /* Movement Type (Inventory Management) */
    private java.lang.String BWART;

    public ZRF009_HEAD() {
    }

    public ZRF009_HEAD(
           java.lang.String RSNUM,
           com.esb.jinying.sap.functions.rfc.sap.document.sap_com.Date RSDAT,
           java.lang.String BWART) {
           this.RSNUM = RSNUM;
           this.RSDAT = RSDAT;
           this.BWART = BWART;
    }


    /**
     * Gets the RSNUM value for this ZRF009_HEAD.
     * 
     * @return RSNUM   * Number of Reservation/Dependent Requirement
     */
    public java.lang.String getRSNUM() {
        return RSNUM;
    }


    /**
     * Sets the RSNUM value for this ZRF009_HEAD.
     * 
     * @param RSNUM   * Number of Reservation/Dependent Requirement
     */
    public void setRSNUM(java.lang.String RSNUM) {
        this.RSNUM = RSNUM;
    }


    /**
     * Gets the RSDAT value for this ZRF009_HEAD.
     * 
     * @return RSDAT   * Base date for reservation
     */
    public com.esb.jinying.sap.functions.rfc.sap.document.sap_com.Date getRSDAT() {
        return RSDAT;
    }


    /**
     * Sets the RSDAT value for this ZRF009_HEAD.
     * 
     * @param RSDAT   * Base date for reservation
     */
    public void setRSDAT(com.esb.jinying.sap.functions.rfc.sap.document.sap_com.Date RSDAT) {
        this.RSDAT = RSDAT;
    }


    /**
     * Gets the BWART value for this ZRF009_HEAD.
     * 
     * @return BWART   * Movement Type (Inventory Management)
     */
    public java.lang.String getBWART() {
        return BWART;
    }


    /**
     * Sets the BWART value for this ZRF009_HEAD.
     * 
     * @param BWART   * Movement Type (Inventory Management)
     */
    public void setBWART(java.lang.String BWART) {
        this.BWART = BWART;
    }

    private java.lang.Object __equalsCalc = null;
    public synchronized boolean equals(java.lang.Object obj) {
        if (!(obj instanceof ZRF009_HEAD)) return false;
        ZRF009_HEAD other = (ZRF009_HEAD) obj;
        if (obj == null) return false;
        if (this == obj) return true;
        if (__equalsCalc != null) {
            return (__equalsCalc == obj);
        }
        __equalsCalc = obj;
        boolean _equals;
        _equals = true && 
            ((this.RSNUM==null && other.getRSNUM()==null) || 
             (this.RSNUM!=null &&
              this.RSNUM.equals(other.getRSNUM()))) &&
            ((this.RSDAT==null && other.getRSDAT()==null) || 
             (this.RSDAT!=null &&
              this.RSDAT.equals(other.getRSDAT()))) &&
            ((this.BWART==null && other.getBWART()==null) || 
             (this.BWART!=null &&
              this.BWART.equals(other.getBWART())));
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
        if (getRSNUM() != null) {
            _hashCode += getRSNUM().hashCode();
        }
        if (getRSDAT() != null) {
            _hashCode += getRSDAT().hashCode();
        }
        if (getBWART() != null) {
            _hashCode += getBWART().hashCode();
        }
        __hashCodeCalc = false;
        return _hashCode;
    }

    // Type metadata
    private static org.apache.axis.description.TypeDesc typeDesc =
        new org.apache.axis.description.TypeDesc(ZRF009_HEAD.class, true);

    static {
        typeDesc.setXmlType(new javax.xml.namespace.QName("urn:sap-com:document:sap:rfc:functions", "ZRF009_HEAD"));
        org.apache.axis.description.ElementDesc elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("RSNUM");
        elemField.setXmlName(new javax.xml.namespace.QName("", "RSNUM"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("RSDAT");
        elemField.setXmlName(new javax.xml.namespace.QName("", "RSDAT"));
        elemField.setXmlType(new javax.xml.namespace.QName("urn:sap-com:document:sap:rfc:functions", "date"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("BWART");
        elemField.setXmlName(new javax.xml.namespace.QName("", "BWART"));
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
