/**
 * DT_BrandRespReturn.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package com.esb.jinying.sap.mastdata.rvs.ecc;

public class DT_BrandRespReturn  implements java.io.Serializable {
    /* 品牌编码 */
    private java.lang.String ZBRAND_ID;

    /* 门类编码 */
    private java.lang.String SUPPLY_TYPE_NO;

    /* 品牌名称 */
    private java.lang.String ZBRAND_DES;

    /* 报表状态 */
    private java.lang.String BSTATUS;

    public DT_BrandRespReturn() {
    }

    public DT_BrandRespReturn(
           java.lang.String ZBRAND_ID,
           java.lang.String SUPPLY_TYPE_NO,
           java.lang.String ZBRAND_DES,
           java.lang.String BSTATUS) {
           this.ZBRAND_ID = ZBRAND_ID;
           this.SUPPLY_TYPE_NO = SUPPLY_TYPE_NO;
           this.ZBRAND_DES = ZBRAND_DES;
           this.BSTATUS = BSTATUS;
    }


    /**
     * Gets the ZBRAND_ID value for this DT_BrandRespReturn.
     * 
     * @return ZBRAND_ID   * 品牌编码
     */
    public java.lang.String getZBRAND_ID() {
        return ZBRAND_ID;
    }


    /**
     * Sets the ZBRAND_ID value for this DT_BrandRespReturn.
     * 
     * @param ZBRAND_ID   * 品牌编码
     */
    public void setZBRAND_ID(java.lang.String ZBRAND_ID) {
        this.ZBRAND_ID = ZBRAND_ID;
    }


    /**
     * Gets the SUPPLY_TYPE_NO value for this DT_BrandRespReturn.
     * 
     * @return SUPPLY_TYPE_NO   * 门类编码
     */
    public java.lang.String getSUPPLY_TYPE_NO() {
        return SUPPLY_TYPE_NO;
    }


    /**
     * Sets the SUPPLY_TYPE_NO value for this DT_BrandRespReturn.
     * 
     * @param SUPPLY_TYPE_NO   * 门类编码
     */
    public void setSUPPLY_TYPE_NO(java.lang.String SUPPLY_TYPE_NO) {
        this.SUPPLY_TYPE_NO = SUPPLY_TYPE_NO;
    }


    /**
     * Gets the ZBRAND_DES value for this DT_BrandRespReturn.
     * 
     * @return ZBRAND_DES   * 品牌名称
     */
    public java.lang.String getZBRAND_DES() {
        return ZBRAND_DES;
    }


    /**
     * Sets the ZBRAND_DES value for this DT_BrandRespReturn.
     * 
     * @param ZBRAND_DES   * 品牌名称
     */
    public void setZBRAND_DES(java.lang.String ZBRAND_DES) {
        this.ZBRAND_DES = ZBRAND_DES;
    }


    /**
     * Gets the BSTATUS value for this DT_BrandRespReturn.
     * 
     * @return BSTATUS   * 报表状态
     */
    public java.lang.String getBSTATUS() {
        return BSTATUS;
    }


    /**
     * Sets the BSTATUS value for this DT_BrandRespReturn.
     * 
     * @param BSTATUS   * 报表状态
     */
    public void setBSTATUS(java.lang.String BSTATUS) {
        this.BSTATUS = BSTATUS;
    }

    private java.lang.Object __equalsCalc = null;
    public synchronized boolean equals(java.lang.Object obj) {
        if (!(obj instanceof DT_BrandRespReturn)) return false;
        DT_BrandRespReturn other = (DT_BrandRespReturn) obj;
        if (obj == null) return false;
        if (this == obj) return true;
        if (__equalsCalc != null) {
            return (__equalsCalc == obj);
        }
        __equalsCalc = obj;
        boolean _equals;
        _equals = true && 
            ((this.ZBRAND_ID==null && other.getZBRAND_ID()==null) || 
             (this.ZBRAND_ID!=null &&
              this.ZBRAND_ID.equals(other.getZBRAND_ID()))) &&
            ((this.SUPPLY_TYPE_NO==null && other.getSUPPLY_TYPE_NO()==null) || 
             (this.SUPPLY_TYPE_NO!=null &&
              this.SUPPLY_TYPE_NO.equals(other.getSUPPLY_TYPE_NO()))) &&
            ((this.ZBRAND_DES==null && other.getZBRAND_DES()==null) || 
             (this.ZBRAND_DES!=null &&
              this.ZBRAND_DES.equals(other.getZBRAND_DES()))) &&
            ((this.BSTATUS==null && other.getBSTATUS()==null) || 
             (this.BSTATUS!=null &&
              this.BSTATUS.equals(other.getBSTATUS())));
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
        if (getZBRAND_ID() != null) {
            _hashCode += getZBRAND_ID().hashCode();
        }
        if (getSUPPLY_TYPE_NO() != null) {
            _hashCode += getSUPPLY_TYPE_NO().hashCode();
        }
        if (getZBRAND_DES() != null) {
            _hashCode += getZBRAND_DES().hashCode();
        }
        if (getBSTATUS() != null) {
            _hashCode += getBSTATUS().hashCode();
        }
        __hashCodeCalc = false;
        return _hashCode;
    }

    // Type metadata
    private static org.apache.axis.description.TypeDesc typeDesc =
        new org.apache.axis.description.TypeDesc(DT_BrandRespReturn.class, true);

    static {
        typeDesc.setXmlType(new javax.xml.namespace.QName("urn:ecc:rvs:mastdata", ">DT_BrandResp>return"));
        org.apache.axis.description.ElementDesc elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("ZBRAND_ID");
        elemField.setXmlName(new javax.xml.namespace.QName("", "ZBRAND_ID"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("SUPPLY_TYPE_NO");
        elemField.setXmlName(new javax.xml.namespace.QName("", "SUPPLY_TYPE_NO"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("ZBRAND_DES");
        elemField.setXmlName(new javax.xml.namespace.QName("", "ZBRAND_DES"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("BSTATUS");
        elemField.setXmlName(new javax.xml.namespace.QName("", "BSTATUS"));
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
