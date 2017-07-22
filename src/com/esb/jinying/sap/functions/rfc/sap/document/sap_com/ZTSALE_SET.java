/**
 * ZTSALE_SET.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package com.esb.jinying.sap.functions.rfc.sap.document.sap_com;

public class ZTSALE_SET  implements java.io.Serializable {
    /* Client */
    private java.lang.String MANDT;

    private java.lang.String COMPANY_NO;

    private java.lang.String GLIDE_NO;

    private java.lang.String ACTION_TYPE_NAME;

    private java.lang.String ACTION_NAME;

    private java.lang.String COMMO_NO;

    private com.esb.jinying.sap.functions.rfc.sap.document.sap_com.Date BEGIN_DATE;

    private com.esb.jinying.sap.functions.rfc.sap.document.sap_com.Date END_DATE;

    private java.math.BigDecimal RETAIL_PRIC_OLD;

    private java.math.BigDecimal RETAIL_PRIC_NEW;

    private java.math.BigDecimal TAXED_PRIC_OLD;

    private java.math.BigDecimal TAXED_PRIC_NEW;

    private java.lang.String USABLE_FLAG;

    private com.esb.jinying.sap.functions.rfc.sap.document.sap_com.Date DATUM;

    /* Currency Key */
    private java.lang.String WAERS;

    public ZTSALE_SET() {
    }

    public ZTSALE_SET(
           java.lang.String MANDT,
           java.lang.String COMPANY_NO,
           java.lang.String GLIDE_NO,
           java.lang.String ACTION_TYPE_NAME,
           java.lang.String ACTION_NAME,
           java.lang.String COMMO_NO,
           com.esb.jinying.sap.functions.rfc.sap.document.sap_com.Date BEGIN_DATE,
           com.esb.jinying.sap.functions.rfc.sap.document.sap_com.Date END_DATE,
           java.math.BigDecimal RETAIL_PRIC_OLD,
           java.math.BigDecimal RETAIL_PRIC_NEW,
           java.math.BigDecimal TAXED_PRIC_OLD,
           java.math.BigDecimal TAXED_PRIC_NEW,
           java.lang.String USABLE_FLAG,
           com.esb.jinying.sap.functions.rfc.sap.document.sap_com.Date DATUM,
           java.lang.String WAERS) {
           this.MANDT = MANDT;
           this.COMPANY_NO = COMPANY_NO;
           this.GLIDE_NO = GLIDE_NO;
           this.ACTION_TYPE_NAME = ACTION_TYPE_NAME;
           this.ACTION_NAME = ACTION_NAME;
           this.COMMO_NO = COMMO_NO;
           this.BEGIN_DATE = BEGIN_DATE;
           this.END_DATE = END_DATE;
           this.RETAIL_PRIC_OLD = RETAIL_PRIC_OLD;
           this.RETAIL_PRIC_NEW = RETAIL_PRIC_NEW;
           this.TAXED_PRIC_OLD = TAXED_PRIC_OLD;
           this.TAXED_PRIC_NEW = TAXED_PRIC_NEW;
           this.USABLE_FLAG = USABLE_FLAG;
           this.DATUM = DATUM;
           this.WAERS = WAERS;
    }


    /**
     * Gets the MANDT value for this ZTSALE_SET.
     * 
     * @return MANDT   * Client
     */
    public java.lang.String getMANDT() {
        return MANDT;
    }


    /**
     * Sets the MANDT value for this ZTSALE_SET.
     * 
     * @param MANDT   * Client
     */
    public void setMANDT(java.lang.String MANDT) {
        this.MANDT = MANDT;
    }


    /**
     * Gets the COMPANY_NO value for this ZTSALE_SET.
     * 
     * @return COMPANY_NO
     */
    public java.lang.String getCOMPANY_NO() {
        return COMPANY_NO;
    }


    /**
     * Sets the COMPANY_NO value for this ZTSALE_SET.
     * 
     * @param COMPANY_NO
     */
    public void setCOMPANY_NO(java.lang.String COMPANY_NO) {
        this.COMPANY_NO = COMPANY_NO;
    }


    /**
     * Gets the GLIDE_NO value for this ZTSALE_SET.
     * 
     * @return GLIDE_NO
     */
    public java.lang.String getGLIDE_NO() {
        return GLIDE_NO;
    }


    /**
     * Sets the GLIDE_NO value for this ZTSALE_SET.
     * 
     * @param GLIDE_NO
     */
    public void setGLIDE_NO(java.lang.String GLIDE_NO) {
        this.GLIDE_NO = GLIDE_NO;
    }


    /**
     * Gets the ACTION_TYPE_NAME value for this ZTSALE_SET.
     * 
     * @return ACTION_TYPE_NAME
     */
    public java.lang.String getACTION_TYPE_NAME() {
        return ACTION_TYPE_NAME;
    }


    /**
     * Sets the ACTION_TYPE_NAME value for this ZTSALE_SET.
     * 
     * @param ACTION_TYPE_NAME
     */
    public void setACTION_TYPE_NAME(java.lang.String ACTION_TYPE_NAME) {
        this.ACTION_TYPE_NAME = ACTION_TYPE_NAME;
    }


    /**
     * Gets the ACTION_NAME value for this ZTSALE_SET.
     * 
     * @return ACTION_NAME
     */
    public java.lang.String getACTION_NAME() {
        return ACTION_NAME;
    }


    /**
     * Sets the ACTION_NAME value for this ZTSALE_SET.
     * 
     * @param ACTION_NAME
     */
    public void setACTION_NAME(java.lang.String ACTION_NAME) {
        this.ACTION_NAME = ACTION_NAME;
    }


    /**
     * Gets the COMMO_NO value for this ZTSALE_SET.
     * 
     * @return COMMO_NO
     */
    public java.lang.String getCOMMO_NO() {
        return COMMO_NO;
    }


    /**
     * Sets the COMMO_NO value for this ZTSALE_SET.
     * 
     * @param COMMO_NO
     */
    public void setCOMMO_NO(java.lang.String COMMO_NO) {
        this.COMMO_NO = COMMO_NO;
    }


    /**
     * Gets the BEGIN_DATE value for this ZTSALE_SET.
     * 
     * @return BEGIN_DATE
     */
    public com.esb.jinying.sap.functions.rfc.sap.document.sap_com.Date getBEGIN_DATE() {
        return BEGIN_DATE;
    }


    /**
     * Sets the BEGIN_DATE value for this ZTSALE_SET.
     * 
     * @param BEGIN_DATE
     */
    public void setBEGIN_DATE(com.esb.jinying.sap.functions.rfc.sap.document.sap_com.Date BEGIN_DATE) {
        this.BEGIN_DATE = BEGIN_DATE;
    }


    /**
     * Gets the END_DATE value for this ZTSALE_SET.
     * 
     * @return END_DATE
     */
    public com.esb.jinying.sap.functions.rfc.sap.document.sap_com.Date getEND_DATE() {
        return END_DATE;
    }


    /**
     * Sets the END_DATE value for this ZTSALE_SET.
     * 
     * @param END_DATE
     */
    public void setEND_DATE(com.esb.jinying.sap.functions.rfc.sap.document.sap_com.Date END_DATE) {
        this.END_DATE = END_DATE;
    }


    /**
     * Gets the RETAIL_PRIC_OLD value for this ZTSALE_SET.
     * 
     * @return RETAIL_PRIC_OLD
     */
    public java.math.BigDecimal getRETAIL_PRIC_OLD() {
        return RETAIL_PRIC_OLD;
    }


    /**
     * Sets the RETAIL_PRIC_OLD value for this ZTSALE_SET.
     * 
     * @param RETAIL_PRIC_OLD
     */
    public void setRETAIL_PRIC_OLD(java.math.BigDecimal RETAIL_PRIC_OLD) {
        this.RETAIL_PRIC_OLD = RETAIL_PRIC_OLD;
    }


    /**
     * Gets the RETAIL_PRIC_NEW value for this ZTSALE_SET.
     * 
     * @return RETAIL_PRIC_NEW
     */
    public java.math.BigDecimal getRETAIL_PRIC_NEW() {
        return RETAIL_PRIC_NEW;
    }


    /**
     * Sets the RETAIL_PRIC_NEW value for this ZTSALE_SET.
     * 
     * @param RETAIL_PRIC_NEW
     */
    public void setRETAIL_PRIC_NEW(java.math.BigDecimal RETAIL_PRIC_NEW) {
        this.RETAIL_PRIC_NEW = RETAIL_PRIC_NEW;
    }


    /**
     * Gets the TAXED_PRIC_OLD value for this ZTSALE_SET.
     * 
     * @return TAXED_PRIC_OLD
     */
    public java.math.BigDecimal getTAXED_PRIC_OLD() {
        return TAXED_PRIC_OLD;
    }


    /**
     * Sets the TAXED_PRIC_OLD value for this ZTSALE_SET.
     * 
     * @param TAXED_PRIC_OLD
     */
    public void setTAXED_PRIC_OLD(java.math.BigDecimal TAXED_PRIC_OLD) {
        this.TAXED_PRIC_OLD = TAXED_PRIC_OLD;
    }


    /**
     * Gets the TAXED_PRIC_NEW value for this ZTSALE_SET.
     * 
     * @return TAXED_PRIC_NEW
     */
    public java.math.BigDecimal getTAXED_PRIC_NEW() {
        return TAXED_PRIC_NEW;
    }


    /**
     * Sets the TAXED_PRIC_NEW value for this ZTSALE_SET.
     * 
     * @param TAXED_PRIC_NEW
     */
    public void setTAXED_PRIC_NEW(java.math.BigDecimal TAXED_PRIC_NEW) {
        this.TAXED_PRIC_NEW = TAXED_PRIC_NEW;
    }


    /**
     * Gets the USABLE_FLAG value for this ZTSALE_SET.
     * 
     * @return USABLE_FLAG
     */
    public java.lang.String getUSABLE_FLAG() {
        return USABLE_FLAG;
    }


    /**
     * Sets the USABLE_FLAG value for this ZTSALE_SET.
     * 
     * @param USABLE_FLAG
     */
    public void setUSABLE_FLAG(java.lang.String USABLE_FLAG) {
        this.USABLE_FLAG = USABLE_FLAG;
    }


    /**
     * Gets the DATUM value for this ZTSALE_SET.
     * 
     * @return DATUM
     */
    public com.esb.jinying.sap.functions.rfc.sap.document.sap_com.Date getDATUM() {
        return DATUM;
    }


    /**
     * Sets the DATUM value for this ZTSALE_SET.
     * 
     * @param DATUM
     */
    public void setDATUM(com.esb.jinying.sap.functions.rfc.sap.document.sap_com.Date DATUM) {
        this.DATUM = DATUM;
    }


    /**
     * Gets the WAERS value for this ZTSALE_SET.
     * 
     * @return WAERS   * Currency Key
     */
    public java.lang.String getWAERS() {
        return WAERS;
    }


    /**
     * Sets the WAERS value for this ZTSALE_SET.
     * 
     * @param WAERS   * Currency Key
     */
    public void setWAERS(java.lang.String WAERS) {
        this.WAERS = WAERS;
    }

    private java.lang.Object __equalsCalc = null;
    public synchronized boolean equals(java.lang.Object obj) {
        if (!(obj instanceof ZTSALE_SET)) return false;
        ZTSALE_SET other = (ZTSALE_SET) obj;
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
            ((this.COMPANY_NO==null && other.getCOMPANY_NO()==null) || 
             (this.COMPANY_NO!=null &&
              this.COMPANY_NO.equals(other.getCOMPANY_NO()))) &&
            ((this.GLIDE_NO==null && other.getGLIDE_NO()==null) || 
             (this.GLIDE_NO!=null &&
              this.GLIDE_NO.equals(other.getGLIDE_NO()))) &&
            ((this.ACTION_TYPE_NAME==null && other.getACTION_TYPE_NAME()==null) || 
             (this.ACTION_TYPE_NAME!=null &&
              this.ACTION_TYPE_NAME.equals(other.getACTION_TYPE_NAME()))) &&
            ((this.ACTION_NAME==null && other.getACTION_NAME()==null) || 
             (this.ACTION_NAME!=null &&
              this.ACTION_NAME.equals(other.getACTION_NAME()))) &&
            ((this.COMMO_NO==null && other.getCOMMO_NO()==null) || 
             (this.COMMO_NO!=null &&
              this.COMMO_NO.equals(other.getCOMMO_NO()))) &&
            ((this.BEGIN_DATE==null && other.getBEGIN_DATE()==null) || 
             (this.BEGIN_DATE!=null &&
              this.BEGIN_DATE.equals(other.getBEGIN_DATE()))) &&
            ((this.END_DATE==null && other.getEND_DATE()==null) || 
             (this.END_DATE!=null &&
              this.END_DATE.equals(other.getEND_DATE()))) &&
            ((this.RETAIL_PRIC_OLD==null && other.getRETAIL_PRIC_OLD()==null) || 
             (this.RETAIL_PRIC_OLD!=null &&
              this.RETAIL_PRIC_OLD.equals(other.getRETAIL_PRIC_OLD()))) &&
            ((this.RETAIL_PRIC_NEW==null && other.getRETAIL_PRIC_NEW()==null) || 
             (this.RETAIL_PRIC_NEW!=null &&
              this.RETAIL_PRIC_NEW.equals(other.getRETAIL_PRIC_NEW()))) &&
            ((this.TAXED_PRIC_OLD==null && other.getTAXED_PRIC_OLD()==null) || 
             (this.TAXED_PRIC_OLD!=null &&
              this.TAXED_PRIC_OLD.equals(other.getTAXED_PRIC_OLD()))) &&
            ((this.TAXED_PRIC_NEW==null && other.getTAXED_PRIC_NEW()==null) || 
             (this.TAXED_PRIC_NEW!=null &&
              this.TAXED_PRIC_NEW.equals(other.getTAXED_PRIC_NEW()))) &&
            ((this.USABLE_FLAG==null && other.getUSABLE_FLAG()==null) || 
             (this.USABLE_FLAG!=null &&
              this.USABLE_FLAG.equals(other.getUSABLE_FLAG()))) &&
            ((this.DATUM==null && other.getDATUM()==null) || 
             (this.DATUM!=null &&
              this.DATUM.equals(other.getDATUM()))) &&
            ((this.WAERS==null && other.getWAERS()==null) || 
             (this.WAERS!=null &&
              this.WAERS.equals(other.getWAERS())));
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
        if (getCOMPANY_NO() != null) {
            _hashCode += getCOMPANY_NO().hashCode();
        }
        if (getGLIDE_NO() != null) {
            _hashCode += getGLIDE_NO().hashCode();
        }
        if (getACTION_TYPE_NAME() != null) {
            _hashCode += getACTION_TYPE_NAME().hashCode();
        }
        if (getACTION_NAME() != null) {
            _hashCode += getACTION_NAME().hashCode();
        }
        if (getCOMMO_NO() != null) {
            _hashCode += getCOMMO_NO().hashCode();
        }
        if (getBEGIN_DATE() != null) {
            _hashCode += getBEGIN_DATE().hashCode();
        }
        if (getEND_DATE() != null) {
            _hashCode += getEND_DATE().hashCode();
        }
        if (getRETAIL_PRIC_OLD() != null) {
            _hashCode += getRETAIL_PRIC_OLD().hashCode();
        }
        if (getRETAIL_PRIC_NEW() != null) {
            _hashCode += getRETAIL_PRIC_NEW().hashCode();
        }
        if (getTAXED_PRIC_OLD() != null) {
            _hashCode += getTAXED_PRIC_OLD().hashCode();
        }
        if (getTAXED_PRIC_NEW() != null) {
            _hashCode += getTAXED_PRIC_NEW().hashCode();
        }
        if (getUSABLE_FLAG() != null) {
            _hashCode += getUSABLE_FLAG().hashCode();
        }
        if (getDATUM() != null) {
            _hashCode += getDATUM().hashCode();
        }
        if (getWAERS() != null) {
            _hashCode += getWAERS().hashCode();
        }
        __hashCodeCalc = false;
        return _hashCode;
    }

    // Type metadata
    private static org.apache.axis.description.TypeDesc typeDesc =
        new org.apache.axis.description.TypeDesc(ZTSALE_SET.class, true);

    static {
        typeDesc.setXmlType(new javax.xml.namespace.QName("urn:sap-com:document:sap:rfc:functions", "ZTSALE_SET"));
        org.apache.axis.description.ElementDesc elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("MANDT");
        elemField.setXmlName(new javax.xml.namespace.QName("", "MANDT"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("COMPANY_NO");
        elemField.setXmlName(new javax.xml.namespace.QName("", "COMPANY_NO"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("GLIDE_NO");
        elemField.setXmlName(new javax.xml.namespace.QName("", "GLIDE_NO"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("ACTION_TYPE_NAME");
        elemField.setXmlName(new javax.xml.namespace.QName("", "ACTION_TYPE_NAME"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("ACTION_NAME");
        elemField.setXmlName(new javax.xml.namespace.QName("", "ACTION_NAME"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("COMMO_NO");
        elemField.setXmlName(new javax.xml.namespace.QName("", "COMMO_NO"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("BEGIN_DATE");
        elemField.setXmlName(new javax.xml.namespace.QName("", "BEGIN_DATE"));
        elemField.setXmlType(new javax.xml.namespace.QName("urn:sap-com:document:sap:rfc:functions", "date"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("END_DATE");
        elemField.setXmlName(new javax.xml.namespace.QName("", "END_DATE"));
        elemField.setXmlType(new javax.xml.namespace.QName("urn:sap-com:document:sap:rfc:functions", "date"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("RETAIL_PRIC_OLD");
        elemField.setXmlName(new javax.xml.namespace.QName("", "RETAIL_PRIC_OLD"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "decimal"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("RETAIL_PRIC_NEW");
        elemField.setXmlName(new javax.xml.namespace.QName("", "RETAIL_PRIC_NEW"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "decimal"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("TAXED_PRIC_OLD");
        elemField.setXmlName(new javax.xml.namespace.QName("", "TAXED_PRIC_OLD"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "decimal"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("TAXED_PRIC_NEW");
        elemField.setXmlName(new javax.xml.namespace.QName("", "TAXED_PRIC_NEW"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "decimal"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("USABLE_FLAG");
        elemField.setXmlName(new javax.xml.namespace.QName("", "USABLE_FLAG"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("DATUM");
        elemField.setXmlName(new javax.xml.namespace.QName("", "DATUM"));
        elemField.setXmlType(new javax.xml.namespace.QName("urn:sap-com:document:sap:rfc:functions", "date"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("WAERS");
        elemField.setXmlName(new javax.xml.namespace.QName("", "WAERS"));
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
