/**
 * ZSDP002.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package com.esb.jinying.sap.functions.rfc.sap.document.sap_com;

public class ZSDP002  implements java.io.Serializable {
    private java.lang.String GLIDE_NO;

    private java.lang.String SEQ_NO;

    /* Sales Organization */
    private java.lang.String VKORG;

    /* Article Number */
    private java.lang.String MATNR;

    /* Account assignment group for this article */
    private java.lang.String KTGRM;

    /* Merchandise category 1 */
    private java.lang.String MVGR1;

    /* ID for product attribute 1 */
    private java.lang.String PRAT1;

    /* Purchasing Group */
    private java.lang.String EKGRP;

    public ZSDP002() {
    }

    public ZSDP002(
           java.lang.String GLIDE_NO,
           java.lang.String SEQ_NO,
           java.lang.String VKORG,
           java.lang.String MATNR,
           java.lang.String KTGRM,
           java.lang.String MVGR1,
           java.lang.String PRAT1,
           java.lang.String EKGRP) {
           this.GLIDE_NO = GLIDE_NO;
           this.SEQ_NO = SEQ_NO;
           this.VKORG = VKORG;
           this.MATNR = MATNR;
           this.KTGRM = KTGRM;
           this.MVGR1 = MVGR1;
           this.PRAT1 = PRAT1;
           this.EKGRP = EKGRP;
    }


    /**
     * Gets the GLIDE_NO value for this ZSDP002.
     * 
     * @return GLIDE_NO
     */
    public java.lang.String getGLIDE_NO() {
        return GLIDE_NO;
    }


    /**
     * Sets the GLIDE_NO value for this ZSDP002.
     * 
     * @param GLIDE_NO
     */
    public void setGLIDE_NO(java.lang.String GLIDE_NO) {
        this.GLIDE_NO = GLIDE_NO;
    }


    /**
     * Gets the SEQ_NO value for this ZSDP002.
     * 
     * @return SEQ_NO
     */
    public java.lang.String getSEQ_NO() {
        return SEQ_NO;
    }


    /**
     * Sets the SEQ_NO value for this ZSDP002.
     * 
     * @param SEQ_NO
     */
    public void setSEQ_NO(java.lang.String SEQ_NO) {
        this.SEQ_NO = SEQ_NO;
    }


    /**
     * Gets the VKORG value for this ZSDP002.
     * 
     * @return VKORG   * Sales Organization
     */
    public java.lang.String getVKORG() {
        return VKORG;
    }


    /**
     * Sets the VKORG value for this ZSDP002.
     * 
     * @param VKORG   * Sales Organization
     */
    public void setVKORG(java.lang.String VKORG) {
        this.VKORG = VKORG;
    }


    /**
     * Gets the MATNR value for this ZSDP002.
     * 
     * @return MATNR   * Article Number
     */
    public java.lang.String getMATNR() {
        return MATNR;
    }


    /**
     * Sets the MATNR value for this ZSDP002.
     * 
     * @param MATNR   * Article Number
     */
    public void setMATNR(java.lang.String MATNR) {
        this.MATNR = MATNR;
    }


    /**
     * Gets the KTGRM value for this ZSDP002.
     * 
     * @return KTGRM   * Account assignment group for this article
     */
    public java.lang.String getKTGRM() {
        return KTGRM;
    }


    /**
     * Sets the KTGRM value for this ZSDP002.
     * 
     * @param KTGRM   * Account assignment group for this article
     */
    public void setKTGRM(java.lang.String KTGRM) {
        this.KTGRM = KTGRM;
    }


    /**
     * Gets the MVGR1 value for this ZSDP002.
     * 
     * @return MVGR1   * Merchandise category 1
     */
    public java.lang.String getMVGR1() {
        return MVGR1;
    }


    /**
     * Sets the MVGR1 value for this ZSDP002.
     * 
     * @param MVGR1   * Merchandise category 1
     */
    public void setMVGR1(java.lang.String MVGR1) {
        this.MVGR1 = MVGR1;
    }


    /**
     * Gets the PRAT1 value for this ZSDP002.
     * 
     * @return PRAT1   * ID for product attribute 1
     */
    public java.lang.String getPRAT1() {
        return PRAT1;
    }


    /**
     * Sets the PRAT1 value for this ZSDP002.
     * 
     * @param PRAT1   * ID for product attribute 1
     */
    public void setPRAT1(java.lang.String PRAT1) {
        this.PRAT1 = PRAT1;
    }


    /**
     * Gets the EKGRP value for this ZSDP002.
     * 
     * @return EKGRP   * Purchasing Group
     */
    public java.lang.String getEKGRP() {
        return EKGRP;
    }


    /**
     * Sets the EKGRP value for this ZSDP002.
     * 
     * @param EKGRP   * Purchasing Group
     */
    public void setEKGRP(java.lang.String EKGRP) {
        this.EKGRP = EKGRP;
    }

    private java.lang.Object __equalsCalc = null;
    public synchronized boolean equals(java.lang.Object obj) {
        if (!(obj instanceof ZSDP002)) return false;
        ZSDP002 other = (ZSDP002) obj;
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
            ((this.VKORG==null && other.getVKORG()==null) || 
             (this.VKORG!=null &&
              this.VKORG.equals(other.getVKORG()))) &&
            ((this.MATNR==null && other.getMATNR()==null) || 
             (this.MATNR!=null &&
              this.MATNR.equals(other.getMATNR()))) &&
            ((this.KTGRM==null && other.getKTGRM()==null) || 
             (this.KTGRM!=null &&
              this.KTGRM.equals(other.getKTGRM()))) &&
            ((this.MVGR1==null && other.getMVGR1()==null) || 
             (this.MVGR1!=null &&
              this.MVGR1.equals(other.getMVGR1()))) &&
            ((this.PRAT1==null && other.getPRAT1()==null) || 
             (this.PRAT1!=null &&
              this.PRAT1.equals(other.getPRAT1()))) &&
            ((this.EKGRP==null && other.getEKGRP()==null) || 
             (this.EKGRP!=null &&
              this.EKGRP.equals(other.getEKGRP())));
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
        if (getVKORG() != null) {
            _hashCode += getVKORG().hashCode();
        }
        if (getMATNR() != null) {
            _hashCode += getMATNR().hashCode();
        }
        if (getKTGRM() != null) {
            _hashCode += getKTGRM().hashCode();
        }
        if (getMVGR1() != null) {
            _hashCode += getMVGR1().hashCode();
        }
        if (getPRAT1() != null) {
            _hashCode += getPRAT1().hashCode();
        }
        if (getEKGRP() != null) {
            _hashCode += getEKGRP().hashCode();
        }
        __hashCodeCalc = false;
        return _hashCode;
    }

    // Type metadata
    private static org.apache.axis.description.TypeDesc typeDesc =
        new org.apache.axis.description.TypeDesc(ZSDP002.class, true);

    static {
        typeDesc.setXmlType(new javax.xml.namespace.QName("urn:sap-com:document:sap:rfc:functions", "ZSDP002"));
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
        elemField.setFieldName("KTGRM");
        elemField.setXmlName(new javax.xml.namespace.QName("", "KTGRM"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("MVGR1");
        elemField.setXmlName(new javax.xml.namespace.QName("", "MVGR1"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("PRAT1");
        elemField.setXmlName(new javax.xml.namespace.QName("", "PRAT1"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("EKGRP");
        elemField.setXmlName(new javax.xml.namespace.QName("", "EKGRP"));
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
