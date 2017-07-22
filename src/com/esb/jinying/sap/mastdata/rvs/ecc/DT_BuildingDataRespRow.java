/**
 * DT_BuildingDataRespRow.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package com.esb.jinying.sap.mastdata.rvs.ecc;

public class DT_BuildingDataRespRow  implements java.io.Serializable {
    /* 公司代码 */
    private java.lang.String BUKRS;

    /* 商业实体编号 */
    private java.lang.String SWENR;

    /* 建筑物的编号 */
    private java.lang.String SGENR;

    /* 建筑物描述 */
    private java.lang.String XGETXT;

    /* 保留字段1 */
    private java.lang.String ZFIELD1;

    /* 保留字段2 */
    private java.lang.String ZFIELD2;

    public DT_BuildingDataRespRow() {
    }

    public DT_BuildingDataRespRow(
           java.lang.String BUKRS,
           java.lang.String SWENR,
           java.lang.String SGENR,
           java.lang.String XGETXT,
           java.lang.String ZFIELD1,
           java.lang.String ZFIELD2) {
           this.BUKRS = BUKRS;
           this.SWENR = SWENR;
           this.SGENR = SGENR;
           this.XGETXT = XGETXT;
           this.ZFIELD1 = ZFIELD1;
           this.ZFIELD2 = ZFIELD2;
    }


    /**
     * Gets the BUKRS value for this DT_BuildingDataRespRow.
     * 
     * @return BUKRS   * 公司代码
     */
    public java.lang.String getBUKRS() {
        return BUKRS;
    }


    /**
     * Sets the BUKRS value for this DT_BuildingDataRespRow.
     * 
     * @param BUKRS   * 公司代码
     */
    public void setBUKRS(java.lang.String BUKRS) {
        this.BUKRS = BUKRS;
    }


    /**
     * Gets the SWENR value for this DT_BuildingDataRespRow.
     * 
     * @return SWENR   * 商业实体编号
     */
    public java.lang.String getSWENR() {
        return SWENR;
    }


    /**
     * Sets the SWENR value for this DT_BuildingDataRespRow.
     * 
     * @param SWENR   * 商业实体编号
     */
    public void setSWENR(java.lang.String SWENR) {
        this.SWENR = SWENR;
    }


    /**
     * Gets the SGENR value for this DT_BuildingDataRespRow.
     * 
     * @return SGENR   * 建筑物的编号
     */
    public java.lang.String getSGENR() {
        return SGENR;
    }


    /**
     * Sets the SGENR value for this DT_BuildingDataRespRow.
     * 
     * @param SGENR   * 建筑物的编号
     */
    public void setSGENR(java.lang.String SGENR) {
        this.SGENR = SGENR;
    }


    /**
     * Gets the XGETXT value for this DT_BuildingDataRespRow.
     * 
     * @return XGETXT   * 建筑物描述
     */
    public java.lang.String getXGETXT() {
        return XGETXT;
    }


    /**
     * Sets the XGETXT value for this DT_BuildingDataRespRow.
     * 
     * @param XGETXT   * 建筑物描述
     */
    public void setXGETXT(java.lang.String XGETXT) {
        this.XGETXT = XGETXT;
    }


    /**
     * Gets the ZFIELD1 value for this DT_BuildingDataRespRow.
     * 
     * @return ZFIELD1   * 保留字段1
     */
    public java.lang.String getZFIELD1() {
        return ZFIELD1;
    }


    /**
     * Sets the ZFIELD1 value for this DT_BuildingDataRespRow.
     * 
     * @param ZFIELD1   * 保留字段1
     */
    public void setZFIELD1(java.lang.String ZFIELD1) {
        this.ZFIELD1 = ZFIELD1;
    }


    /**
     * Gets the ZFIELD2 value for this DT_BuildingDataRespRow.
     * 
     * @return ZFIELD2   * 保留字段2
     */
    public java.lang.String getZFIELD2() {
        return ZFIELD2;
    }


    /**
     * Sets the ZFIELD2 value for this DT_BuildingDataRespRow.
     * 
     * @param ZFIELD2   * 保留字段2
     */
    public void setZFIELD2(java.lang.String ZFIELD2) {
        this.ZFIELD2 = ZFIELD2;
    }

    private java.lang.Object __equalsCalc = null;
    public synchronized boolean equals(java.lang.Object obj) {
        if (!(obj instanceof DT_BuildingDataRespRow)) return false;
        DT_BuildingDataRespRow other = (DT_BuildingDataRespRow) obj;
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
            ((this.SWENR==null && other.getSWENR()==null) || 
             (this.SWENR!=null &&
              this.SWENR.equals(other.getSWENR()))) &&
            ((this.SGENR==null && other.getSGENR()==null) || 
             (this.SGENR!=null &&
              this.SGENR.equals(other.getSGENR()))) &&
            ((this.XGETXT==null && other.getXGETXT()==null) || 
             (this.XGETXT!=null &&
              this.XGETXT.equals(other.getXGETXT()))) &&
            ((this.ZFIELD1==null && other.getZFIELD1()==null) || 
             (this.ZFIELD1!=null &&
              this.ZFIELD1.equals(other.getZFIELD1()))) &&
            ((this.ZFIELD2==null && other.getZFIELD2()==null) || 
             (this.ZFIELD2!=null &&
              this.ZFIELD2.equals(other.getZFIELD2())));
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
        if (getSWENR() != null) {
            _hashCode += getSWENR().hashCode();
        }
        if (getSGENR() != null) {
            _hashCode += getSGENR().hashCode();
        }
        if (getXGETXT() != null) {
            _hashCode += getXGETXT().hashCode();
        }
        if (getZFIELD1() != null) {
            _hashCode += getZFIELD1().hashCode();
        }
        if (getZFIELD2() != null) {
            _hashCode += getZFIELD2().hashCode();
        }
        __hashCodeCalc = false;
        return _hashCode;
    }

    // Type metadata
    private static org.apache.axis.description.TypeDesc typeDesc =
        new org.apache.axis.description.TypeDesc(DT_BuildingDataRespRow.class, true);

    static {
        typeDesc.setXmlType(new javax.xml.namespace.QName("urn:ecc:rvs:mastdata", ">DT_BuildingDataResp>row"));
        org.apache.axis.description.ElementDesc elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("BUKRS");
        elemField.setXmlName(new javax.xml.namespace.QName("", "BUKRS"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("SWENR");
        elemField.setXmlName(new javax.xml.namespace.QName("", "SWENR"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("SGENR");
        elemField.setXmlName(new javax.xml.namespace.QName("", "SGENR"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("XGETXT");
        elemField.setXmlName(new javax.xml.namespace.QName("", "XGETXT"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("ZFIELD1");
        elemField.setXmlName(new javax.xml.namespace.QName("", "ZFIELD1"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("ZFIELD2");
        elemField.setXmlName(new javax.xml.namespace.QName("", "ZFIELD2"));
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
