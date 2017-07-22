/**
 * ZTYXX.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package com.esb.jinying.sap.functions.rfc.sap.document.sap_com;

public class ZTYXX  implements java.io.Serializable {
    /* Calendar day */
    private com.esb.jinying.sap.functions.rfc.sap.document.sap_com.Date CALDAY;

    /* Company code */
    private java.lang.String COMP_CODE;

    private java.lang.String ZBMBM;

    private java.lang.String ZGZBM;

    private java.lang.String ZHTHM;

    /* Vendor */
    private java.lang.String VENDOR;

    private java.math.BigDecimal ZSXJE;

    public ZTYXX() {
    }

    public ZTYXX(
           com.esb.jinying.sap.functions.rfc.sap.document.sap_com.Date CALDAY,
           java.lang.String COMP_CODE,
           java.lang.String ZBMBM,
           java.lang.String ZGZBM,
           java.lang.String ZHTHM,
           java.lang.String VENDOR,
           java.math.BigDecimal ZSXJE) {
           this.CALDAY = CALDAY;
           this.COMP_CODE = COMP_CODE;
           this.ZBMBM = ZBMBM;
           this.ZGZBM = ZGZBM;
           this.ZHTHM = ZHTHM;
           this.VENDOR = VENDOR;
           this.ZSXJE = ZSXJE;
    }


    /**
     * Gets the CALDAY value for this ZTYXX.
     * 
     * @return CALDAY   * Calendar day
     */
    public com.esb.jinying.sap.functions.rfc.sap.document.sap_com.Date getCALDAY() {
        return CALDAY;
    }


    /**
     * Sets the CALDAY value for this ZTYXX.
     * 
     * @param CALDAY   * Calendar day
     */
    public void setCALDAY(com.esb.jinying.sap.functions.rfc.sap.document.sap_com.Date CALDAY) {
        this.CALDAY = CALDAY;
    }


    /**
     * Gets the COMP_CODE value for this ZTYXX.
     * 
     * @return COMP_CODE   * Company code
     */
    public java.lang.String getCOMP_CODE() {
        return COMP_CODE;
    }


    /**
     * Sets the COMP_CODE value for this ZTYXX.
     * 
     * @param COMP_CODE   * Company code
     */
    public void setCOMP_CODE(java.lang.String COMP_CODE) {
        this.COMP_CODE = COMP_CODE;
    }


    /**
     * Gets the ZBMBM value for this ZTYXX.
     * 
     * @return ZBMBM
     */
    public java.lang.String getZBMBM() {
        return ZBMBM;
    }


    /**
     * Sets the ZBMBM value for this ZTYXX.
     * 
     * @param ZBMBM
     */
    public void setZBMBM(java.lang.String ZBMBM) {
        this.ZBMBM = ZBMBM;
    }


    /**
     * Gets the ZGZBM value for this ZTYXX.
     * 
     * @return ZGZBM
     */
    public java.lang.String getZGZBM() {
        return ZGZBM;
    }


    /**
     * Sets the ZGZBM value for this ZTYXX.
     * 
     * @param ZGZBM
     */
    public void setZGZBM(java.lang.String ZGZBM) {
        this.ZGZBM = ZGZBM;
    }


    /**
     * Gets the ZHTHM value for this ZTYXX.
     * 
     * @return ZHTHM
     */
    public java.lang.String getZHTHM() {
        return ZHTHM;
    }


    /**
     * Sets the ZHTHM value for this ZTYXX.
     * 
     * @param ZHTHM
     */
    public void setZHTHM(java.lang.String ZHTHM) {
        this.ZHTHM = ZHTHM;
    }


    /**
     * Gets the VENDOR value for this ZTYXX.
     * 
     * @return VENDOR   * Vendor
     */
    public java.lang.String getVENDOR() {
        return VENDOR;
    }


    /**
     * Sets the VENDOR value for this ZTYXX.
     * 
     * @param VENDOR   * Vendor
     */
    public void setVENDOR(java.lang.String VENDOR) {
        this.VENDOR = VENDOR;
    }


    /**
     * Gets the ZSXJE value for this ZTYXX.
     * 
     * @return ZSXJE
     */
    public java.math.BigDecimal getZSXJE() {
        return ZSXJE;
    }


    /**
     * Sets the ZSXJE value for this ZTYXX.
     * 
     * @param ZSXJE
     */
    public void setZSXJE(java.math.BigDecimal ZSXJE) {
        this.ZSXJE = ZSXJE;
    }

    private java.lang.Object __equalsCalc = null;
    public synchronized boolean equals(java.lang.Object obj) {
        if (!(obj instanceof ZTYXX)) return false;
        ZTYXX other = (ZTYXX) obj;
        if (obj == null) return false;
        if (this == obj) return true;
        if (__equalsCalc != null) {
            return (__equalsCalc == obj);
        }
        __equalsCalc = obj;
        boolean _equals;
        _equals = true && 
            ((this.CALDAY==null && other.getCALDAY()==null) || 
             (this.CALDAY!=null &&
              this.CALDAY.equals(other.getCALDAY()))) &&
            ((this.COMP_CODE==null && other.getCOMP_CODE()==null) || 
             (this.COMP_CODE!=null &&
              this.COMP_CODE.equals(other.getCOMP_CODE()))) &&
            ((this.ZBMBM==null && other.getZBMBM()==null) || 
             (this.ZBMBM!=null &&
              this.ZBMBM.equals(other.getZBMBM()))) &&
            ((this.ZGZBM==null && other.getZGZBM()==null) || 
             (this.ZGZBM!=null &&
              this.ZGZBM.equals(other.getZGZBM()))) &&
            ((this.ZHTHM==null && other.getZHTHM()==null) || 
             (this.ZHTHM!=null &&
              this.ZHTHM.equals(other.getZHTHM()))) &&
            ((this.VENDOR==null && other.getVENDOR()==null) || 
             (this.VENDOR!=null &&
              this.VENDOR.equals(other.getVENDOR()))) &&
            ((this.ZSXJE==null && other.getZSXJE()==null) || 
             (this.ZSXJE!=null &&
              this.ZSXJE.equals(other.getZSXJE())));
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
        if (getCALDAY() != null) {
            _hashCode += getCALDAY().hashCode();
        }
        if (getCOMP_CODE() != null) {
            _hashCode += getCOMP_CODE().hashCode();
        }
        if (getZBMBM() != null) {
            _hashCode += getZBMBM().hashCode();
        }
        if (getZGZBM() != null) {
            _hashCode += getZGZBM().hashCode();
        }
        if (getZHTHM() != null) {
            _hashCode += getZHTHM().hashCode();
        }
        if (getVENDOR() != null) {
            _hashCode += getVENDOR().hashCode();
        }
        if (getZSXJE() != null) {
            _hashCode += getZSXJE().hashCode();
        }
        __hashCodeCalc = false;
        return _hashCode;
    }

    // Type metadata
    private static org.apache.axis.description.TypeDesc typeDesc =
        new org.apache.axis.description.TypeDesc(ZTYXX.class, true);

    static {
        typeDesc.setXmlType(new javax.xml.namespace.QName("urn:sap-com:document:sap:rfc:functions", "ZTYXX"));
        org.apache.axis.description.ElementDesc elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("CALDAY");
        elemField.setXmlName(new javax.xml.namespace.QName("", "CALDAY"));
        elemField.setXmlType(new javax.xml.namespace.QName("urn:sap-com:document:sap:rfc:functions", "date"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("COMP_CODE");
        elemField.setXmlName(new javax.xml.namespace.QName("", "COMP_CODE"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("ZBMBM");
        elemField.setXmlName(new javax.xml.namespace.QName("", "ZBMBM"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("ZGZBM");
        elemField.setXmlName(new javax.xml.namespace.QName("", "ZGZBM"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("ZHTHM");
        elemField.setXmlName(new javax.xml.namespace.QName("", "ZHTHM"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("VENDOR");
        elemField.setXmlName(new javax.xml.namespace.QName("", "VENDOR"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("ZSXJE");
        elemField.setXmlName(new javax.xml.namespace.QName("", "ZSXJE"));
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
