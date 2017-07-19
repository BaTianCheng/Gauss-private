/**
 * ZSBW002B.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package com.esb.jinying.sap.functions.rfc.sap.document.sap_com;

public class ZSBW002B  implements java.io.Serializable {
    private com.esb.jinying.sap.functions.rfc.sap.document.sap_com.Date SALE_DATE;

    private java.lang.String SAP_COMPANY_NO;

    private java.lang.String SAP_DEPT_NO;

    private java.lang.String SAP_COUNTER_NO;

    private java.lang.String SAP_CONTRACT_NO;

    private java.lang.String SAP_SUPPLY_NO;

    private java.math.BigDecimal SAP_TAXED_SUM;

    public ZSBW002B() {
    }

    public ZSBW002B(
           com.esb.jinying.sap.functions.rfc.sap.document.sap_com.Date SALE_DATE,
           java.lang.String SAP_COMPANY_NO,
           java.lang.String SAP_DEPT_NO,
           java.lang.String SAP_COUNTER_NO,
           java.lang.String SAP_CONTRACT_NO,
           java.lang.String SAP_SUPPLY_NO,
           java.math.BigDecimal SAP_TAXED_SUM) {
           this.SALE_DATE = SALE_DATE;
           this.SAP_COMPANY_NO = SAP_COMPANY_NO;
           this.SAP_DEPT_NO = SAP_DEPT_NO;
           this.SAP_COUNTER_NO = SAP_COUNTER_NO;
           this.SAP_CONTRACT_NO = SAP_CONTRACT_NO;
           this.SAP_SUPPLY_NO = SAP_SUPPLY_NO;
           this.SAP_TAXED_SUM = SAP_TAXED_SUM;
    }


    /**
     * Gets the SALE_DATE value for this ZSBW002B.
     * 
     * @return SALE_DATE
     */
    public com.esb.jinying.sap.functions.rfc.sap.document.sap_com.Date getSALE_DATE() {
        return SALE_DATE;
    }


    /**
     * Sets the SALE_DATE value for this ZSBW002B.
     * 
     * @param SALE_DATE
     */
    public void setSALE_DATE(com.esb.jinying.sap.functions.rfc.sap.document.sap_com.Date SALE_DATE) {
        this.SALE_DATE = SALE_DATE;
    }


    /**
     * Gets the SAP_COMPANY_NO value for this ZSBW002B.
     * 
     * @return SAP_COMPANY_NO
     */
    public java.lang.String getSAP_COMPANY_NO() {
        return SAP_COMPANY_NO;
    }


    /**
     * Sets the SAP_COMPANY_NO value for this ZSBW002B.
     * 
     * @param SAP_COMPANY_NO
     */
    public void setSAP_COMPANY_NO(java.lang.String SAP_COMPANY_NO) {
        this.SAP_COMPANY_NO = SAP_COMPANY_NO;
    }


    /**
     * Gets the SAP_DEPT_NO value for this ZSBW002B.
     * 
     * @return SAP_DEPT_NO
     */
    public java.lang.String getSAP_DEPT_NO() {
        return SAP_DEPT_NO;
    }


    /**
     * Sets the SAP_DEPT_NO value for this ZSBW002B.
     * 
     * @param SAP_DEPT_NO
     */
    public void setSAP_DEPT_NO(java.lang.String SAP_DEPT_NO) {
        this.SAP_DEPT_NO = SAP_DEPT_NO;
    }


    /**
     * Gets the SAP_COUNTER_NO value for this ZSBW002B.
     * 
     * @return SAP_COUNTER_NO
     */
    public java.lang.String getSAP_COUNTER_NO() {
        return SAP_COUNTER_NO;
    }


    /**
     * Sets the SAP_COUNTER_NO value for this ZSBW002B.
     * 
     * @param SAP_COUNTER_NO
     */
    public void setSAP_COUNTER_NO(java.lang.String SAP_COUNTER_NO) {
        this.SAP_COUNTER_NO = SAP_COUNTER_NO;
    }


    /**
     * Gets the SAP_CONTRACT_NO value for this ZSBW002B.
     * 
     * @return SAP_CONTRACT_NO
     */
    public java.lang.String getSAP_CONTRACT_NO() {
        return SAP_CONTRACT_NO;
    }


    /**
     * Sets the SAP_CONTRACT_NO value for this ZSBW002B.
     * 
     * @param SAP_CONTRACT_NO
     */
    public void setSAP_CONTRACT_NO(java.lang.String SAP_CONTRACT_NO) {
        this.SAP_CONTRACT_NO = SAP_CONTRACT_NO;
    }


    /**
     * Gets the SAP_SUPPLY_NO value for this ZSBW002B.
     * 
     * @return SAP_SUPPLY_NO
     */
    public java.lang.String getSAP_SUPPLY_NO() {
        return SAP_SUPPLY_NO;
    }


    /**
     * Sets the SAP_SUPPLY_NO value for this ZSBW002B.
     * 
     * @param SAP_SUPPLY_NO
     */
    public void setSAP_SUPPLY_NO(java.lang.String SAP_SUPPLY_NO) {
        this.SAP_SUPPLY_NO = SAP_SUPPLY_NO;
    }


    /**
     * Gets the SAP_TAXED_SUM value for this ZSBW002B.
     * 
     * @return SAP_TAXED_SUM
     */
    public java.math.BigDecimal getSAP_TAXED_SUM() {
        return SAP_TAXED_SUM;
    }


    /**
     * Sets the SAP_TAXED_SUM value for this ZSBW002B.
     * 
     * @param SAP_TAXED_SUM
     */
    public void setSAP_TAXED_SUM(java.math.BigDecimal SAP_TAXED_SUM) {
        this.SAP_TAXED_SUM = SAP_TAXED_SUM;
    }

    private java.lang.Object __equalsCalc = null;
    public synchronized boolean equals(java.lang.Object obj) {
        if (!(obj instanceof ZSBW002B)) return false;
        ZSBW002B other = (ZSBW002B) obj;
        if (obj == null) return false;
        if (this == obj) return true;
        if (__equalsCalc != null) {
            return (__equalsCalc == obj);
        }
        __equalsCalc = obj;
        boolean _equals;
        _equals = true && 
            ((this.SALE_DATE==null && other.getSALE_DATE()==null) || 
             (this.SALE_DATE!=null &&
              this.SALE_DATE.equals(other.getSALE_DATE()))) &&
            ((this.SAP_COMPANY_NO==null && other.getSAP_COMPANY_NO()==null) || 
             (this.SAP_COMPANY_NO!=null &&
              this.SAP_COMPANY_NO.equals(other.getSAP_COMPANY_NO()))) &&
            ((this.SAP_DEPT_NO==null && other.getSAP_DEPT_NO()==null) || 
             (this.SAP_DEPT_NO!=null &&
              this.SAP_DEPT_NO.equals(other.getSAP_DEPT_NO()))) &&
            ((this.SAP_COUNTER_NO==null && other.getSAP_COUNTER_NO()==null) || 
             (this.SAP_COUNTER_NO!=null &&
              this.SAP_COUNTER_NO.equals(other.getSAP_COUNTER_NO()))) &&
            ((this.SAP_CONTRACT_NO==null && other.getSAP_CONTRACT_NO()==null) || 
             (this.SAP_CONTRACT_NO!=null &&
              this.SAP_CONTRACT_NO.equals(other.getSAP_CONTRACT_NO()))) &&
            ((this.SAP_SUPPLY_NO==null && other.getSAP_SUPPLY_NO()==null) || 
             (this.SAP_SUPPLY_NO!=null &&
              this.SAP_SUPPLY_NO.equals(other.getSAP_SUPPLY_NO()))) &&
            ((this.SAP_TAXED_SUM==null && other.getSAP_TAXED_SUM()==null) || 
             (this.SAP_TAXED_SUM!=null &&
              this.SAP_TAXED_SUM.equals(other.getSAP_TAXED_SUM())));
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
        if (getSALE_DATE() != null) {
            _hashCode += getSALE_DATE().hashCode();
        }
        if (getSAP_COMPANY_NO() != null) {
            _hashCode += getSAP_COMPANY_NO().hashCode();
        }
        if (getSAP_DEPT_NO() != null) {
            _hashCode += getSAP_DEPT_NO().hashCode();
        }
        if (getSAP_COUNTER_NO() != null) {
            _hashCode += getSAP_COUNTER_NO().hashCode();
        }
        if (getSAP_CONTRACT_NO() != null) {
            _hashCode += getSAP_CONTRACT_NO().hashCode();
        }
        if (getSAP_SUPPLY_NO() != null) {
            _hashCode += getSAP_SUPPLY_NO().hashCode();
        }
        if (getSAP_TAXED_SUM() != null) {
            _hashCode += getSAP_TAXED_SUM().hashCode();
        }
        __hashCodeCalc = false;
        return _hashCode;
    }

    // Type metadata
    private static org.apache.axis.description.TypeDesc typeDesc =
        new org.apache.axis.description.TypeDesc(ZSBW002B.class, true);

    static {
        typeDesc.setXmlType(new javax.xml.namespace.QName("urn:sap-com:document:sap:rfc:functions", "ZSBW002B"));
        org.apache.axis.description.ElementDesc elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("SALE_DATE");
        elemField.setXmlName(new javax.xml.namespace.QName("", "SALE_DATE"));
        elemField.setXmlType(new javax.xml.namespace.QName("urn:sap-com:document:sap:rfc:functions", "date"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("SAP_COMPANY_NO");
        elemField.setXmlName(new javax.xml.namespace.QName("", "SAP_COMPANY_NO"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("SAP_DEPT_NO");
        elemField.setXmlName(new javax.xml.namespace.QName("", "SAP_DEPT_NO"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("SAP_COUNTER_NO");
        elemField.setXmlName(new javax.xml.namespace.QName("", "SAP_COUNTER_NO"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("SAP_CONTRACT_NO");
        elemField.setXmlName(new javax.xml.namespace.QName("", "SAP_CONTRACT_NO"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("SAP_SUPPLY_NO");
        elemField.setXmlName(new javax.xml.namespace.QName("", "SAP_SUPPLY_NO"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("SAP_TAXED_SUM");
        elemField.setXmlName(new javax.xml.namespace.QName("", "SAP_TAXED_SUM"));
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
