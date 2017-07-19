/**
 * DT_DepartmentRespReturn.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package com.esb.jinying.sap.mastdata.rvs.ecc;

public class DT_DepartmentRespReturn  implements java.io.Serializable {
    /* 销售组织 */
    private java.lang.String VKORG;

    /* 部门编码 */
    private java.lang.String VKGRP;

    /* 描述 */
    private java.lang.String BEZEI;

    /* 可用标记 */
    private java.lang.String USABLE_FLAG;

    public DT_DepartmentRespReturn() {
    }

    public DT_DepartmentRespReturn(
           java.lang.String VKORG,
           java.lang.String VKGRP,
           java.lang.String BEZEI,
           java.lang.String USABLE_FLAG) {
           this.VKORG = VKORG;
           this.VKGRP = VKGRP;
           this.BEZEI = BEZEI;
           this.USABLE_FLAG = USABLE_FLAG;
    }


    /**
     * Gets the VKORG value for this DT_DepartmentRespReturn.
     * 
     * @return VKORG   * 销售组织
     */
    public java.lang.String getVKORG() {
        return VKORG;
    }


    /**
     * Sets the VKORG value for this DT_DepartmentRespReturn.
     * 
     * @param VKORG   * 销售组织
     */
    public void setVKORG(java.lang.String VKORG) {
        this.VKORG = VKORG;
    }


    /**
     * Gets the VKGRP value for this DT_DepartmentRespReturn.
     * 
     * @return VKGRP   * 部门编码
     */
    public java.lang.String getVKGRP() {
        return VKGRP;
    }


    /**
     * Sets the VKGRP value for this DT_DepartmentRespReturn.
     * 
     * @param VKGRP   * 部门编码
     */
    public void setVKGRP(java.lang.String VKGRP) {
        this.VKGRP = VKGRP;
    }


    /**
     * Gets the BEZEI value for this DT_DepartmentRespReturn.
     * 
     * @return BEZEI   * 描述
     */
    public java.lang.String getBEZEI() {
        return BEZEI;
    }


    /**
     * Sets the BEZEI value for this DT_DepartmentRespReturn.
     * 
     * @param BEZEI   * 描述
     */
    public void setBEZEI(java.lang.String BEZEI) {
        this.BEZEI = BEZEI;
    }


    /**
     * Gets the USABLE_FLAG value for this DT_DepartmentRespReturn.
     * 
     * @return USABLE_FLAG   * 可用标记
     */
    public java.lang.String getUSABLE_FLAG() {
        return USABLE_FLAG;
    }


    /**
     * Sets the USABLE_FLAG value for this DT_DepartmentRespReturn.
     * 
     * @param USABLE_FLAG   * 可用标记
     */
    public void setUSABLE_FLAG(java.lang.String USABLE_FLAG) {
        this.USABLE_FLAG = USABLE_FLAG;
    }

    private java.lang.Object __equalsCalc = null;
    public synchronized boolean equals(java.lang.Object obj) {
        if (!(obj instanceof DT_DepartmentRespReturn)) return false;
        DT_DepartmentRespReturn other = (DT_DepartmentRespReturn) obj;
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
            ((this.VKGRP==null && other.getVKGRP()==null) || 
             (this.VKGRP!=null &&
              this.VKGRP.equals(other.getVKGRP()))) &&
            ((this.BEZEI==null && other.getBEZEI()==null) || 
             (this.BEZEI!=null &&
              this.BEZEI.equals(other.getBEZEI()))) &&
            ((this.USABLE_FLAG==null && other.getUSABLE_FLAG()==null) || 
             (this.USABLE_FLAG!=null &&
              this.USABLE_FLAG.equals(other.getUSABLE_FLAG())));
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
        if (getVKGRP() != null) {
            _hashCode += getVKGRP().hashCode();
        }
        if (getBEZEI() != null) {
            _hashCode += getBEZEI().hashCode();
        }
        if (getUSABLE_FLAG() != null) {
            _hashCode += getUSABLE_FLAG().hashCode();
        }
        __hashCodeCalc = false;
        return _hashCode;
    }

    // Type metadata
    private static org.apache.axis.description.TypeDesc typeDesc =
        new org.apache.axis.description.TypeDesc(DT_DepartmentRespReturn.class, true);

    static {
        typeDesc.setXmlType(new javax.xml.namespace.QName("urn:ecc:rvs:mastdata", ">DT_DepartmentResp>return"));
        org.apache.axis.description.ElementDesc elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("VKORG");
        elemField.setXmlName(new javax.xml.namespace.QName("", "VKORG"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("VKGRP");
        elemField.setXmlName(new javax.xml.namespace.QName("", "VKGRP"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("BEZEI");
        elemField.setXmlName(new javax.xml.namespace.QName("", "BEZEI"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
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
