/**
 * ZBTB_PRMT.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package com.esb.jinying.sap.functions.rfc.sap.document.sap_com;

public class ZBTB_PRMT  implements java.io.Serializable {
    /* Client */
    private java.lang.String MANDT;

    private java.lang.String PRMT_NUM;

    private java.lang.String PRMT_ITEM;

    /* Name (ID) of a reporting component */
    private java.lang.String COMPID;

    private java.lang.String PRMT_NAME;

    /* SIGN field in creation of SELECT-OPTIONS tables */
    private java.lang.String SIGN;

    /* Operator in Select Options and other Expressions */
    private java.lang.String OPT;

    /* Dim: Field for a User-Defined Characteristic Value */
    private java.lang.String LOW;

    /* Dim: Field for a User-Defined Characteristic Value */
    private java.lang.String HIGH;

    public ZBTB_PRMT() {
    }

    public ZBTB_PRMT(
           java.lang.String MANDT,
           java.lang.String PRMT_NUM,
           java.lang.String PRMT_ITEM,
           java.lang.String COMPID,
           java.lang.String PRMT_NAME,
           java.lang.String SIGN,
           java.lang.String OPT,
           java.lang.String LOW,
           java.lang.String HIGH) {
           this.MANDT = MANDT;
           this.PRMT_NUM = PRMT_NUM;
           this.PRMT_ITEM = PRMT_ITEM;
           this.COMPID = COMPID;
           this.PRMT_NAME = PRMT_NAME;
           this.SIGN = SIGN;
           this.OPT = OPT;
           this.LOW = LOW;
           this.HIGH = HIGH;
    }


    /**
     * Gets the MANDT value for this ZBTB_PRMT.
     * 
     * @return MANDT   * Client
     */
    public java.lang.String getMANDT() {
        return MANDT;
    }


    /**
     * Sets the MANDT value for this ZBTB_PRMT.
     * 
     * @param MANDT   * Client
     */
    public void setMANDT(java.lang.String MANDT) {
        this.MANDT = MANDT;
    }


    /**
     * Gets the PRMT_NUM value for this ZBTB_PRMT.
     * 
     * @return PRMT_NUM
     */
    public java.lang.String getPRMT_NUM() {
        return PRMT_NUM;
    }


    /**
     * Sets the PRMT_NUM value for this ZBTB_PRMT.
     * 
     * @param PRMT_NUM
     */
    public void setPRMT_NUM(java.lang.String PRMT_NUM) {
        this.PRMT_NUM = PRMT_NUM;
    }


    /**
     * Gets the PRMT_ITEM value for this ZBTB_PRMT.
     * 
     * @return PRMT_ITEM
     */
    public java.lang.String getPRMT_ITEM() {
        return PRMT_ITEM;
    }


    /**
     * Sets the PRMT_ITEM value for this ZBTB_PRMT.
     * 
     * @param PRMT_ITEM
     */
    public void setPRMT_ITEM(java.lang.String PRMT_ITEM) {
        this.PRMT_ITEM = PRMT_ITEM;
    }


    /**
     * Gets the COMPID value for this ZBTB_PRMT.
     * 
     * @return COMPID   * Name (ID) of a reporting component
     */
    public java.lang.String getCOMPID() {
        return COMPID;
    }


    /**
     * Sets the COMPID value for this ZBTB_PRMT.
     * 
     * @param COMPID   * Name (ID) of a reporting component
     */
    public void setCOMPID(java.lang.String COMPID) {
        this.COMPID = COMPID;
    }


    /**
     * Gets the PRMT_NAME value for this ZBTB_PRMT.
     * 
     * @return PRMT_NAME
     */
    public java.lang.String getPRMT_NAME() {
        return PRMT_NAME;
    }


    /**
     * Sets the PRMT_NAME value for this ZBTB_PRMT.
     * 
     * @param PRMT_NAME
     */
    public void setPRMT_NAME(java.lang.String PRMT_NAME) {
        this.PRMT_NAME = PRMT_NAME;
    }


    /**
     * Gets the SIGN value for this ZBTB_PRMT.
     * 
     * @return SIGN   * SIGN field in creation of SELECT-OPTIONS tables
     */
    public java.lang.String getSIGN() {
        return SIGN;
    }


    /**
     * Sets the SIGN value for this ZBTB_PRMT.
     * 
     * @param SIGN   * SIGN field in creation of SELECT-OPTIONS tables
     */
    public void setSIGN(java.lang.String SIGN) {
        this.SIGN = SIGN;
    }


    /**
     * Gets the OPT value for this ZBTB_PRMT.
     * 
     * @return OPT   * Operator in Select Options and other Expressions
     */
    public java.lang.String getOPT() {
        return OPT;
    }


    /**
     * Sets the OPT value for this ZBTB_PRMT.
     * 
     * @param OPT   * Operator in Select Options and other Expressions
     */
    public void setOPT(java.lang.String OPT) {
        this.OPT = OPT;
    }


    /**
     * Gets the LOW value for this ZBTB_PRMT.
     * 
     * @return LOW   * Dim: Field for a User-Defined Characteristic Value
     */
    public java.lang.String getLOW() {
        return LOW;
    }


    /**
     * Sets the LOW value for this ZBTB_PRMT.
     * 
     * @param LOW   * Dim: Field for a User-Defined Characteristic Value
     */
    public void setLOW(java.lang.String LOW) {
        this.LOW = LOW;
    }


    /**
     * Gets the HIGH value for this ZBTB_PRMT.
     * 
     * @return HIGH   * Dim: Field for a User-Defined Characteristic Value
     */
    public java.lang.String getHIGH() {
        return HIGH;
    }


    /**
     * Sets the HIGH value for this ZBTB_PRMT.
     * 
     * @param HIGH   * Dim: Field for a User-Defined Characteristic Value
     */
    public void setHIGH(java.lang.String HIGH) {
        this.HIGH = HIGH;
    }

    private java.lang.Object __equalsCalc = null;
    public synchronized boolean equals(java.lang.Object obj) {
        if (!(obj instanceof ZBTB_PRMT)) return false;
        ZBTB_PRMT other = (ZBTB_PRMT) obj;
        if (obj == null) return false;
        if (this == obj) return true;
        if (__equalsCalc != null) {
            return (__equalsCalc == obj);
        }
        __equalsCalc = obj;
        boolean _equals;
        _equals = true && 
            ((this.MANDT==null && other.getMANDT()==null) || 
             (this.MANDT!=null &&
              this.MANDT.equals(other.getMANDT()))) &&
            ((this.PRMT_NUM==null && other.getPRMT_NUM()==null) || 
             (this.PRMT_NUM!=null &&
              this.PRMT_NUM.equals(other.getPRMT_NUM()))) &&
            ((this.PRMT_ITEM==null && other.getPRMT_ITEM()==null) || 
             (this.PRMT_ITEM!=null &&
              this.PRMT_ITEM.equals(other.getPRMT_ITEM()))) &&
            ((this.COMPID==null && other.getCOMPID()==null) || 
             (this.COMPID!=null &&
              this.COMPID.equals(other.getCOMPID()))) &&
            ((this.PRMT_NAME==null && other.getPRMT_NAME()==null) || 
             (this.PRMT_NAME!=null &&
              this.PRMT_NAME.equals(other.getPRMT_NAME()))) &&
            ((this.SIGN==null && other.getSIGN()==null) || 
             (this.SIGN!=null &&
              this.SIGN.equals(other.getSIGN()))) &&
            ((this.OPT==null && other.getOPT()==null) || 
             (this.OPT!=null &&
              this.OPT.equals(other.getOPT()))) &&
            ((this.LOW==null && other.getLOW()==null) || 
             (this.LOW!=null &&
              this.LOW.equals(other.getLOW()))) &&
            ((this.HIGH==null && other.getHIGH()==null) || 
             (this.HIGH!=null &&
              this.HIGH.equals(other.getHIGH())));
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
        if (getMANDT() != null) {
            _hashCode += getMANDT().hashCode();
        }
        if (getPRMT_NUM() != null) {
            _hashCode += getPRMT_NUM().hashCode();
        }
        if (getPRMT_ITEM() != null) {
            _hashCode += getPRMT_ITEM().hashCode();
        }
        if (getCOMPID() != null) {
            _hashCode += getCOMPID().hashCode();
        }
        if (getPRMT_NAME() != null) {
            _hashCode += getPRMT_NAME().hashCode();
        }
        if (getSIGN() != null) {
            _hashCode += getSIGN().hashCode();
        }
        if (getOPT() != null) {
            _hashCode += getOPT().hashCode();
        }
        if (getLOW() != null) {
            _hashCode += getLOW().hashCode();
        }
        if (getHIGH() != null) {
            _hashCode += getHIGH().hashCode();
        }
        __hashCodeCalc = false;
        return _hashCode;
    }

    // Type metadata
    private static org.apache.axis.description.TypeDesc typeDesc =
        new org.apache.axis.description.TypeDesc(ZBTB_PRMT.class, true);

    static {
        typeDesc.setXmlType(new javax.xml.namespace.QName("urn:sap-com:document:sap:rfc:functions", "ZBTB_PRMT"));
        org.apache.axis.description.ElementDesc elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("MANDT");
        elemField.setXmlName(new javax.xml.namespace.QName("", "MANDT"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("PRMT_NUM");
        elemField.setXmlName(new javax.xml.namespace.QName("", "PRMT_NUM"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("PRMT_ITEM");
        elemField.setXmlName(new javax.xml.namespace.QName("", "PRMT_ITEM"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("COMPID");
        elemField.setXmlName(new javax.xml.namespace.QName("", "COMPID"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("PRMT_NAME");
        elemField.setXmlName(new javax.xml.namespace.QName("", "PRMT_NAME"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("SIGN");
        elemField.setXmlName(new javax.xml.namespace.QName("", "SIGN"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("OPT");
        elemField.setXmlName(new javax.xml.namespace.QName("", "OPT"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("LOW");
        elemField.setXmlName(new javax.xml.namespace.QName("", "LOW"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("HIGH");
        elemField.setXmlName(new javax.xml.namespace.QName("", "HIGH"));
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
