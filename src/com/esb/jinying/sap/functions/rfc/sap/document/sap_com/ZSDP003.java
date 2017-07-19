/**
 * ZSDP003.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package com.esb.jinying.sap.functions.rfc.sap.document.sap_com;

public class ZSDP003  implements java.io.Serializable {
    private java.lang.String GLIDE_NO;

    private java.lang.String SEQ_NO;

    /* Article Number */
    private java.lang.String MATNR;

    private java.lang.String CONTRACT_NO;

    private java.math.BigDecimal TKBETR;

    private java.math.BigDecimal ZKBETR;

    private com.esb.jinying.sap.functions.rfc.sap.document.sap_com.Date DATAB;

    private com.esb.jinying.sap.functions.rfc.sap.document.sap_com.Date DATBI;

    public ZSDP003() {
    }

    public ZSDP003(
           java.lang.String GLIDE_NO,
           java.lang.String SEQ_NO,
           java.lang.String MATNR,
           java.lang.String CONTRACT_NO,
           java.math.BigDecimal TKBETR,
           java.math.BigDecimal ZKBETR,
           com.esb.jinying.sap.functions.rfc.sap.document.sap_com.Date DATAB,
           com.esb.jinying.sap.functions.rfc.sap.document.sap_com.Date DATBI) {
           this.GLIDE_NO = GLIDE_NO;
           this.SEQ_NO = SEQ_NO;
           this.MATNR = MATNR;
           this.CONTRACT_NO = CONTRACT_NO;
           this.TKBETR = TKBETR;
           this.ZKBETR = ZKBETR;
           this.DATAB = DATAB;
           this.DATBI = DATBI;
    }


    /**
     * Gets the GLIDE_NO value for this ZSDP003.
     * 
     * @return GLIDE_NO
     */
    public java.lang.String getGLIDE_NO() {
        return GLIDE_NO;
    }


    /**
     * Sets the GLIDE_NO value for this ZSDP003.
     * 
     * @param GLIDE_NO
     */
    public void setGLIDE_NO(java.lang.String GLIDE_NO) {
        this.GLIDE_NO = GLIDE_NO;
    }


    /**
     * Gets the SEQ_NO value for this ZSDP003.
     * 
     * @return SEQ_NO
     */
    public java.lang.String getSEQ_NO() {
        return SEQ_NO;
    }


    /**
     * Sets the SEQ_NO value for this ZSDP003.
     * 
     * @param SEQ_NO
     */
    public void setSEQ_NO(java.lang.String SEQ_NO) {
        this.SEQ_NO = SEQ_NO;
    }


    /**
     * Gets the MATNR value for this ZSDP003.
     * 
     * @return MATNR   * Article Number
     */
    public java.lang.String getMATNR() {
        return MATNR;
    }


    /**
     * Sets the MATNR value for this ZSDP003.
     * 
     * @param MATNR   * Article Number
     */
    public void setMATNR(java.lang.String MATNR) {
        this.MATNR = MATNR;
    }


    /**
     * Gets the CONTRACT_NO value for this ZSDP003.
     * 
     * @return CONTRACT_NO
     */
    public java.lang.String getCONTRACT_NO() {
        return CONTRACT_NO;
    }


    /**
     * Sets the CONTRACT_NO value for this ZSDP003.
     * 
     * @param CONTRACT_NO
     */
    public void setCONTRACT_NO(java.lang.String CONTRACT_NO) {
        this.CONTRACT_NO = CONTRACT_NO;
    }


    /**
     * Gets the TKBETR value for this ZSDP003.
     * 
     * @return TKBETR
     */
    public java.math.BigDecimal getTKBETR() {
        return TKBETR;
    }


    /**
     * Sets the TKBETR value for this ZSDP003.
     * 
     * @param TKBETR
     */
    public void setTKBETR(java.math.BigDecimal TKBETR) {
        this.TKBETR = TKBETR;
    }


    /**
     * Gets the ZKBETR value for this ZSDP003.
     * 
     * @return ZKBETR
     */
    public java.math.BigDecimal getZKBETR() {
        return ZKBETR;
    }


    /**
     * Sets the ZKBETR value for this ZSDP003.
     * 
     * @param ZKBETR
     */
    public void setZKBETR(java.math.BigDecimal ZKBETR) {
        this.ZKBETR = ZKBETR;
    }


    /**
     * Gets the DATAB value for this ZSDP003.
     * 
     * @return DATAB
     */
    public com.esb.jinying.sap.functions.rfc.sap.document.sap_com.Date getDATAB() {
        return DATAB;
    }


    /**
     * Sets the DATAB value for this ZSDP003.
     * 
     * @param DATAB
     */
    public void setDATAB(com.esb.jinying.sap.functions.rfc.sap.document.sap_com.Date DATAB) {
        this.DATAB = DATAB;
    }


    /**
     * Gets the DATBI value for this ZSDP003.
     * 
     * @return DATBI
     */
    public com.esb.jinying.sap.functions.rfc.sap.document.sap_com.Date getDATBI() {
        return DATBI;
    }


    /**
     * Sets the DATBI value for this ZSDP003.
     * 
     * @param DATBI
     */
    public void setDATBI(com.esb.jinying.sap.functions.rfc.sap.document.sap_com.Date DATBI) {
        this.DATBI = DATBI;
    }

    private java.lang.Object __equalsCalc = null;
    public synchronized boolean equals(java.lang.Object obj) {
        if (!(obj instanceof ZSDP003)) return false;
        ZSDP003 other = (ZSDP003) obj;
        if (obj == null) return false;
        if (this == obj) return true;
        if (__equalsCalc != null) {
            return (__equalsCalc == obj);
        }
        __equalsCalc = obj;
        boolean _equals;
        _equals = true && 
            ((this.GLIDE_NO==null && other.getGLIDE_NO()==null) || 
             (this.GLIDE_NO!=null &&
              this.GLIDE_NO.equals(other.getGLIDE_NO()))) &&
            ((this.SEQ_NO==null && other.getSEQ_NO()==null) || 
             (this.SEQ_NO!=null &&
              this.SEQ_NO.equals(other.getSEQ_NO()))) &&
            ((this.MATNR==null && other.getMATNR()==null) || 
             (this.MATNR!=null &&
              this.MATNR.equals(other.getMATNR()))) &&
            ((this.CONTRACT_NO==null && other.getCONTRACT_NO()==null) || 
             (this.CONTRACT_NO!=null &&
              this.CONTRACT_NO.equals(other.getCONTRACT_NO()))) &&
            ((this.TKBETR==null && other.getTKBETR()==null) || 
             (this.TKBETR!=null &&
              this.TKBETR.equals(other.getTKBETR()))) &&
            ((this.ZKBETR==null && other.getZKBETR()==null) || 
             (this.ZKBETR!=null &&
              this.ZKBETR.equals(other.getZKBETR()))) &&
            ((this.DATAB==null && other.getDATAB()==null) || 
             (this.DATAB!=null &&
              this.DATAB.equals(other.getDATAB()))) &&
            ((this.DATBI==null && other.getDATBI()==null) || 
             (this.DATBI!=null &&
              this.DATBI.equals(other.getDATBI())));
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
        if (getGLIDE_NO() != null) {
            _hashCode += getGLIDE_NO().hashCode();
        }
        if (getSEQ_NO() != null) {
            _hashCode += getSEQ_NO().hashCode();
        }
        if (getMATNR() != null) {
            _hashCode += getMATNR().hashCode();
        }
        if (getCONTRACT_NO() != null) {
            _hashCode += getCONTRACT_NO().hashCode();
        }
        if (getTKBETR() != null) {
            _hashCode += getTKBETR().hashCode();
        }
        if (getZKBETR() != null) {
            _hashCode += getZKBETR().hashCode();
        }
        if (getDATAB() != null) {
            _hashCode += getDATAB().hashCode();
        }
        if (getDATBI() != null) {
            _hashCode += getDATBI().hashCode();
        }
        __hashCodeCalc = false;
        return _hashCode;
    }

    // Type metadata
    private static org.apache.axis.description.TypeDesc typeDesc =
        new org.apache.axis.description.TypeDesc(ZSDP003.class, true);

    static {
        typeDesc.setXmlType(new javax.xml.namespace.QName("urn:sap-com:document:sap:rfc:functions", "ZSDP003"));
        org.apache.axis.description.ElementDesc elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("GLIDE_NO");
        elemField.setXmlName(new javax.xml.namespace.QName("", "GLIDE_NO"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("SEQ_NO");
        elemField.setXmlName(new javax.xml.namespace.QName("", "SEQ_NO"));
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
        elemField.setFieldName("CONTRACT_NO");
        elemField.setXmlName(new javax.xml.namespace.QName("", "CONTRACT_NO"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("TKBETR");
        elemField.setXmlName(new javax.xml.namespace.QName("", "TKBETR"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "decimal"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("ZKBETR");
        elemField.setXmlName(new javax.xml.namespace.QName("", "ZKBETR"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "decimal"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("DATAB");
        elemField.setXmlName(new javax.xml.namespace.QName("", "DATAB"));
        elemField.setXmlType(new javax.xml.namespace.QName("urn:sap-com:document:sap:rfc:functions", "date"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("DATBI");
        elemField.setXmlName(new javax.xml.namespace.QName("", "DATBI"));
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
