/**
 * ZTMARD.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package com.esb.jinying.sap.functions.rfc.sap.document.sap_com;

public class ZTMARD  implements java.io.Serializable {
    /* Sales Organization */
    private java.lang.String VKORG;

    /* Article Number */
    private java.lang.String MATNR;

    /* Site */
    private java.lang.String WERKS;

    /* Storage Location */
    private java.lang.String LGORT;

    /* Description of Storage Location */
    private java.lang.String LGOBE;

    /* Valuated Unrestricted-Use Stock */
    private java.math.BigDecimal LABST;

    public ZTMARD() {
    }

    public ZTMARD(
           java.lang.String VKORG,
           java.lang.String MATNR,
           java.lang.String WERKS,
           java.lang.String LGORT,
           java.lang.String LGOBE,
           java.math.BigDecimal LABST) {
           this.VKORG = VKORG;
           this.MATNR = MATNR;
           this.WERKS = WERKS;
           this.LGORT = LGORT;
           this.LGOBE = LGOBE;
           this.LABST = LABST;
    }


    /**
     * Gets the VKORG value for this ZTMARD.
     * 
     * @return VKORG   * Sales Organization
     */
    public java.lang.String getVKORG() {
        return VKORG;
    }


    /**
     * Sets the VKORG value for this ZTMARD.
     * 
     * @param VKORG   * Sales Organization
     */
    public void setVKORG(java.lang.String VKORG) {
        this.VKORG = VKORG;
    }


    /**
     * Gets the MATNR value for this ZTMARD.
     * 
     * @return MATNR   * Article Number
     */
    public java.lang.String getMATNR() {
        return MATNR;
    }


    /**
     * Sets the MATNR value for this ZTMARD.
     * 
     * @param MATNR   * Article Number
     */
    public void setMATNR(java.lang.String MATNR) {
        this.MATNR = MATNR;
    }


    /**
     * Gets the WERKS value for this ZTMARD.
     * 
     * @return WERKS   * Site
     */
    public java.lang.String getWERKS() {
        return WERKS;
    }


    /**
     * Sets the WERKS value for this ZTMARD.
     * 
     * @param WERKS   * Site
     */
    public void setWERKS(java.lang.String WERKS) {
        this.WERKS = WERKS;
    }


    /**
     * Gets the LGORT value for this ZTMARD.
     * 
     * @return LGORT   * Storage Location
     */
    public java.lang.String getLGORT() {
        return LGORT;
    }


    /**
     * Sets the LGORT value for this ZTMARD.
     * 
     * @param LGORT   * Storage Location
     */
    public void setLGORT(java.lang.String LGORT) {
        this.LGORT = LGORT;
    }


    /**
     * Gets the LGOBE value for this ZTMARD.
     * 
     * @return LGOBE   * Description of Storage Location
     */
    public java.lang.String getLGOBE() {
        return LGOBE;
    }


    /**
     * Sets the LGOBE value for this ZTMARD.
     * 
     * @param LGOBE   * Description of Storage Location
     */
    public void setLGOBE(java.lang.String LGOBE) {
        this.LGOBE = LGOBE;
    }


    /**
     * Gets the LABST value for this ZTMARD.
     * 
     * @return LABST   * Valuated Unrestricted-Use Stock
     */
    public java.math.BigDecimal getLABST() {
        return LABST;
    }


    /**
     * Sets the LABST value for this ZTMARD.
     * 
     * @param LABST   * Valuated Unrestricted-Use Stock
     */
    public void setLABST(java.math.BigDecimal LABST) {
        this.LABST = LABST;
    }

    private java.lang.Object __equalsCalc = null;
    public synchronized boolean equals(java.lang.Object obj) {
        if (!(obj instanceof ZTMARD)) return false;
        ZTMARD other = (ZTMARD) obj;
        if (obj == null) return false;
        if (this == obj) return true;
        if (__equalsCalc != null) {
            return (__equalsCalc == obj);
        }
        __equalsCalc = obj;
        boolean _equals;
        _equals = true && 
            ((this.VKORG==null && other.getVKORG()==null) || 
             (this.VKORG!=null &&
              this.VKORG.equals(other.getVKORG()))) &&
            ((this.MATNR==null && other.getMATNR()==null) || 
             (this.MATNR!=null &&
              this.MATNR.equals(other.getMATNR()))) &&
            ((this.WERKS==null && other.getWERKS()==null) || 
             (this.WERKS!=null &&
              this.WERKS.equals(other.getWERKS()))) &&
            ((this.LGORT==null && other.getLGORT()==null) || 
             (this.LGORT!=null &&
              this.LGORT.equals(other.getLGORT()))) &&
            ((this.LGOBE==null && other.getLGOBE()==null) || 
             (this.LGOBE!=null &&
              this.LGOBE.equals(other.getLGOBE()))) &&
            ((this.LABST==null && other.getLABST()==null) || 
             (this.LABST!=null &&
              this.LABST.equals(other.getLABST())));
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
        if (getVKORG() != null) {
            _hashCode += getVKORG().hashCode();
        }
        if (getMATNR() != null) {
            _hashCode += getMATNR().hashCode();
        }
        if (getWERKS() != null) {
            _hashCode += getWERKS().hashCode();
        }
        if (getLGORT() != null) {
            _hashCode += getLGORT().hashCode();
        }
        if (getLGOBE() != null) {
            _hashCode += getLGOBE().hashCode();
        }
        if (getLABST() != null) {
            _hashCode += getLABST().hashCode();
        }
        __hashCodeCalc = false;
        return _hashCode;
    }

    // Type metadata
    private static org.apache.axis.description.TypeDesc typeDesc =
        new org.apache.axis.description.TypeDesc(ZTMARD.class, true);

    static {
        typeDesc.setXmlType(new javax.xml.namespace.QName("urn:sap-com:document:sap:rfc:functions", "ZTMARD"));
        org.apache.axis.description.ElementDesc elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("VKORG");
        elemField.setXmlName(new javax.xml.namespace.QName("", "VKORG"));
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
        elemField.setFieldName("WERKS");
        elemField.setXmlName(new javax.xml.namespace.QName("", "WERKS"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("LGORT");
        elemField.setXmlName(new javax.xml.namespace.QName("", "LGORT"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("LGOBE");
        elemField.setXmlName(new javax.xml.namespace.QName("", "LGOBE"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("LABST");
        elemField.setXmlName(new javax.xml.namespace.QName("", "LABST"));
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
