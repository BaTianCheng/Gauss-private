/**
 * DT_OrganizationRespReturn.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package com.esb.jinying.sap.mastdata.rvs.ecc;

public class DT_OrganizationRespReturn  implements java.io.Serializable {
    /* 公司代码 */
    private java.lang.String BUKRS;

    /* 公司代码或公司的名称 */
    private java.lang.String BUTXT;

    /* 销售组织 */
    private java.lang.String VKORG;

    /* 描述 */
    private java.lang.String VTEXT;

    /* 采购组织 */
    private java.lang.String EKORG;

    /* 采购组织描述 */
    private java.lang.String EKOTX;

    public DT_OrganizationRespReturn() {
    }

    public DT_OrganizationRespReturn(
           java.lang.String BUKRS,
           java.lang.String BUTXT,
           java.lang.String VKORG,
           java.lang.String VTEXT,
           java.lang.String EKORG,
           java.lang.String EKOTX) {
           this.BUKRS = BUKRS;
           this.BUTXT = BUTXT;
           this.VKORG = VKORG;
           this.VTEXT = VTEXT;
           this.EKORG = EKORG;
           this.EKOTX = EKOTX;
    }


    /**
     * Gets the BUKRS value for this DT_OrganizationRespReturn.
     * 
     * @return BUKRS   * 公司代码
     */
    public java.lang.String getBUKRS() {
        return BUKRS;
    }


    /**
     * Sets the BUKRS value for this DT_OrganizationRespReturn.
     * 
     * @param BUKRS   * 公司代码
     */
    public void setBUKRS(java.lang.String BUKRS) {
        this.BUKRS = BUKRS;
    }


    /**
     * Gets the BUTXT value for this DT_OrganizationRespReturn.
     * 
     * @return BUTXT   * 公司代码或公司的名称
     */
    public java.lang.String getBUTXT() {
        return BUTXT;
    }


    /**
     * Sets the BUTXT value for this DT_OrganizationRespReturn.
     * 
     * @param BUTXT   * 公司代码或公司的名称
     */
    public void setBUTXT(java.lang.String BUTXT) {
        this.BUTXT = BUTXT;
    }


    /**
     * Gets the VKORG value for this DT_OrganizationRespReturn.
     * 
     * @return VKORG   * 销售组织
     */
    public java.lang.String getVKORG() {
        return VKORG;
    }


    /**
     * Sets the VKORG value for this DT_OrganizationRespReturn.
     * 
     * @param VKORG   * 销售组织
     */
    public void setVKORG(java.lang.String VKORG) {
        this.VKORG = VKORG;
    }


    /**
     * Gets the VTEXT value for this DT_OrganizationRespReturn.
     * 
     * @return VTEXT   * 描述
     */
    public java.lang.String getVTEXT() {
        return VTEXT;
    }


    /**
     * Sets the VTEXT value for this DT_OrganizationRespReturn.
     * 
     * @param VTEXT   * 描述
     */
    public void setVTEXT(java.lang.String VTEXT) {
        this.VTEXT = VTEXT;
    }


    /**
     * Gets the EKORG value for this DT_OrganizationRespReturn.
     * 
     * @return EKORG   * 采购组织
     */
    public java.lang.String getEKORG() {
        return EKORG;
    }


    /**
     * Sets the EKORG value for this DT_OrganizationRespReturn.
     * 
     * @param EKORG   * 采购组织
     */
    public void setEKORG(java.lang.String EKORG) {
        this.EKORG = EKORG;
    }


    /**
     * Gets the EKOTX value for this DT_OrganizationRespReturn.
     * 
     * @return EKOTX   * 采购组织描述
     */
    public java.lang.String getEKOTX() {
        return EKOTX;
    }


    /**
     * Sets the EKOTX value for this DT_OrganizationRespReturn.
     * 
     * @param EKOTX   * 采购组织描述
     */
    public void setEKOTX(java.lang.String EKOTX) {
        this.EKOTX = EKOTX;
    }

    private java.lang.Object __equalsCalc = null;
    public synchronized boolean equals(java.lang.Object obj) {
        if (!(obj instanceof DT_OrganizationRespReturn)) return false;
        DT_OrganizationRespReturn other = (DT_OrganizationRespReturn) obj;
        if (obj == null) return false;
        if (this == obj) return true;
        if (__equalsCalc != null) {
            return (__equalsCalc == obj);
        }
        __equalsCalc = obj;
        boolean _equals;
        _equals = true && 
            ((this.BUKRS==null && other.getBUKRS()==null) || 
             (this.BUKRS!=null &&
              this.BUKRS.equals(other.getBUKRS()))) &&
            ((this.BUTXT==null && other.getBUTXT()==null) || 
             (this.BUTXT!=null &&
              this.BUTXT.equals(other.getBUTXT()))) &&
            ((this.VKORG==null && other.getVKORG()==null) || 
             (this.VKORG!=null &&
              this.VKORG.equals(other.getVKORG()))) &&
            ((this.VTEXT==null && other.getVTEXT()==null) || 
             (this.VTEXT!=null &&
              this.VTEXT.equals(other.getVTEXT()))) &&
            ((this.EKORG==null && other.getEKORG()==null) || 
             (this.EKORG!=null &&
              this.EKORG.equals(other.getEKORG()))) &&
            ((this.EKOTX==null && other.getEKOTX()==null) || 
             (this.EKOTX!=null &&
              this.EKOTX.equals(other.getEKOTX())));
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
        if (getBUKRS() != null) {
            _hashCode += getBUKRS().hashCode();
        }
        if (getBUTXT() != null) {
            _hashCode += getBUTXT().hashCode();
        }
        if (getVKORG() != null) {
            _hashCode += getVKORG().hashCode();
        }
        if (getVTEXT() != null) {
            _hashCode += getVTEXT().hashCode();
        }
        if (getEKORG() != null) {
            _hashCode += getEKORG().hashCode();
        }
        if (getEKOTX() != null) {
            _hashCode += getEKOTX().hashCode();
        }
        __hashCodeCalc = false;
        return _hashCode;
    }

    // Type metadata
    private static org.apache.axis.description.TypeDesc typeDesc =
        new org.apache.axis.description.TypeDesc(DT_OrganizationRespReturn.class, true);

    static {
        typeDesc.setXmlType(new javax.xml.namespace.QName("urn:ecc:rvs:mastdata", ">DT_OrganizationResp>return"));
        org.apache.axis.description.ElementDesc elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("BUKRS");
        elemField.setXmlName(new javax.xml.namespace.QName("", "BUKRS"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("BUTXT");
        elemField.setXmlName(new javax.xml.namespace.QName("", "BUTXT"));
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
        elemField.setFieldName("VTEXT");
        elemField.setXmlName(new javax.xml.namespace.QName("", "VTEXT"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("EKORG");
        elemField.setXmlName(new javax.xml.namespace.QName("", "EKORG"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("EKOTX");
        elemField.setXmlName(new javax.xml.namespace.QName("", "EKOTX"));
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
