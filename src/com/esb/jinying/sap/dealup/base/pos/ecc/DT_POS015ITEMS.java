/**
 * DT_POS015ITEMS.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package com.esb.jinying.sap.dealup.base.pos.ecc;

public class DT_POS015ITEMS  implements java.io.Serializable {
    /* 销售组织 */
    private java.lang.String VKORG;

    /* 日期 */
    private java.lang.String BUDAT;

    /* 合同 */
    private java.lang.String CONTRACT_NO;

    /* 支付方式 */
    private java.lang.String POSNR;

    /* 金额 */
    private java.lang.Double WRBTR;

    /* 货币 */
    private java.lang.String WAERS;

    public DT_POS015ITEMS() {
    }

    public DT_POS015ITEMS(
           java.lang.String VKORG,
           java.lang.String BUDAT,
           java.lang.String CONTRACT_NO,
           java.lang.String POSNR,
           java.lang.Double WRBTR,
           java.lang.String WAERS) {
           this.VKORG = VKORG;
           this.BUDAT = BUDAT;
           this.CONTRACT_NO = CONTRACT_NO;
           this.POSNR = POSNR;
           this.WRBTR = WRBTR;
           this.WAERS = WAERS;
    }


    /**
     * Gets the VKORG value for this DT_POS015ITEMS.
     * 
     * @return VKORG   * 销售组织
     */
    public java.lang.String getVKORG() {
        return VKORG;
    }


    /**
     * Sets the VKORG value for this DT_POS015ITEMS.
     * 
     * @param VKORG   * 销售组织
     */
    public void setVKORG(java.lang.String VKORG) {
        this.VKORG = VKORG;
    }


    /**
     * Gets the BUDAT value for this DT_POS015ITEMS.
     * 
     * @return BUDAT   * 日期
     */
    public java.lang.String getBUDAT() {
        return BUDAT;
    }


    /**
     * Sets the BUDAT value for this DT_POS015ITEMS.
     * 
     * @param BUDAT   * 日期
     */
    public void setBUDAT(java.lang.String BUDAT) {
        this.BUDAT = BUDAT;
    }


    /**
     * Gets the CONTRACT_NO value for this DT_POS015ITEMS.
     * 
     * @return CONTRACT_NO   * 合同
     */
    public java.lang.String getCONTRACT_NO() {
        return CONTRACT_NO;
    }


    /**
     * Sets the CONTRACT_NO value for this DT_POS015ITEMS.
     * 
     * @param CONTRACT_NO   * 合同
     */
    public void setCONTRACT_NO(java.lang.String CONTRACT_NO) {
        this.CONTRACT_NO = CONTRACT_NO;
    }


    /**
     * Gets the POSNR value for this DT_POS015ITEMS.
     * 
     * @return POSNR   * 支付方式
     */
    public java.lang.String getPOSNR() {
        return POSNR;
    }


    /**
     * Sets the POSNR value for this DT_POS015ITEMS.
     * 
     * @param POSNR   * 支付方式
     */
    public void setPOSNR(java.lang.String POSNR) {
        this.POSNR = POSNR;
    }


    /**
     * Gets the WRBTR value for this DT_POS015ITEMS.
     * 
     * @return WRBTR   * 金额
     */
    public java.lang.Double getWRBTR() {
        return WRBTR;
    }


    /**
     * Sets the WRBTR value for this DT_POS015ITEMS.
     * 
     * @param WRBTR   * 金额
     */
    public void setWRBTR(java.lang.Double WRBTR) {
        this.WRBTR = WRBTR;
    }


    /**
     * Gets the WAERS value for this DT_POS015ITEMS.
     * 
     * @return WAERS   * 货币
     */
    public java.lang.String getWAERS() {
        return WAERS;
    }


    /**
     * Sets the WAERS value for this DT_POS015ITEMS.
     * 
     * @param WAERS   * 货币
     */
    public void setWAERS(java.lang.String WAERS) {
        this.WAERS = WAERS;
    }

    private java.lang.Object __equalsCalc = null;
    public synchronized boolean equals(java.lang.Object obj) {
        if (!(obj instanceof DT_POS015ITEMS)) return false;
        DT_POS015ITEMS other = (DT_POS015ITEMS) obj;
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
            ((this.BUDAT==null && other.getBUDAT()==null) || 
             (this.BUDAT!=null &&
              this.BUDAT.equals(other.getBUDAT()))) &&
            ((this.CONTRACT_NO==null && other.getCONTRACT_NO()==null) || 
             (this.CONTRACT_NO!=null &&
              this.CONTRACT_NO.equals(other.getCONTRACT_NO()))) &&
            ((this.POSNR==null && other.getPOSNR()==null) || 
             (this.POSNR!=null &&
              this.POSNR.equals(other.getPOSNR()))) &&
            ((this.WRBTR==null && other.getWRBTR()==null) || 
             (this.WRBTR!=null &&
              this.WRBTR.equals(other.getWRBTR()))) &&
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
        if (getVKORG() != null) {
            _hashCode += getVKORG().hashCode();
        }
        if (getBUDAT() != null) {
            _hashCode += getBUDAT().hashCode();
        }
        if (getCONTRACT_NO() != null) {
            _hashCode += getCONTRACT_NO().hashCode();
        }
        if (getPOSNR() != null) {
            _hashCode += getPOSNR().hashCode();
        }
        if (getWRBTR() != null) {
            _hashCode += getWRBTR().hashCode();
        }
        if (getWAERS() != null) {
            _hashCode += getWAERS().hashCode();
        }
        __hashCodeCalc = false;
        return _hashCode;
    }

    // Type metadata
    private static org.apache.axis.description.TypeDesc typeDesc =
        new org.apache.axis.description.TypeDesc(DT_POS015ITEMS.class, true);

    static {
        typeDesc.setXmlType(new javax.xml.namespace.QName("urn:ecc:pos:base:dealup", ">DT_POS015>ITEMS"));
        org.apache.axis.description.ElementDesc elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("VKORG");
        elemField.setXmlName(new javax.xml.namespace.QName("", "VKORG"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("BUDAT");
        elemField.setXmlName(new javax.xml.namespace.QName("", "BUDAT"));
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
        elemField.setFieldName("POSNR");
        elemField.setXmlName(new javax.xml.namespace.QName("", "POSNR"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("WRBTR");
        elemField.setXmlName(new javax.xml.namespace.QName("", "WRBTR"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "double"));
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
