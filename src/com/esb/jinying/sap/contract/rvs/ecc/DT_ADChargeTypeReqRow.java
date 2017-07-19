/**
 * DT_ADChargeTypeReqRow.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package com.esb.jinying.sap.contract.rvs.ecc;

public class DT_ADChargeTypeReqRow  implements java.io.Serializable {
    /* 费用名称 */
    private java.lang.String ZFYTYPES;

    /* 保留字段1 */
    private java.lang.String ZFIELD1;

    /* 保留字段2 */
    private java.lang.String ZFIELD2;

    public DT_ADChargeTypeReqRow() {
    }

    public DT_ADChargeTypeReqRow(
           java.lang.String ZFYTYPES,
           java.lang.String ZFIELD1,
           java.lang.String ZFIELD2) {
           this.ZFYTYPES = ZFYTYPES;
           this.ZFIELD1 = ZFIELD1;
           this.ZFIELD2 = ZFIELD2;
    }


    /**
     * Gets the ZFYTYPES value for this DT_ADChargeTypeReqRow.
     * 
     * @return ZFYTYPES   * 费用名称
     */
    public java.lang.String getZFYTYPES() {
        return ZFYTYPES;
    }


    /**
     * Sets the ZFYTYPES value for this DT_ADChargeTypeReqRow.
     * 
     * @param ZFYTYPES   * 费用名称
     */
    public void setZFYTYPES(java.lang.String ZFYTYPES) {
        this.ZFYTYPES = ZFYTYPES;
    }


    /**
     * Gets the ZFIELD1 value for this DT_ADChargeTypeReqRow.
     * 
     * @return ZFIELD1   * 保留字段1
     */
    public java.lang.String getZFIELD1() {
        return ZFIELD1;
    }


    /**
     * Sets the ZFIELD1 value for this DT_ADChargeTypeReqRow.
     * 
     * @param ZFIELD1   * 保留字段1
     */
    public void setZFIELD1(java.lang.String ZFIELD1) {
        this.ZFIELD1 = ZFIELD1;
    }


    /**
     * Gets the ZFIELD2 value for this DT_ADChargeTypeReqRow.
     * 
     * @return ZFIELD2   * 保留字段2
     */
    public java.lang.String getZFIELD2() {
        return ZFIELD2;
    }


    /**
     * Sets the ZFIELD2 value for this DT_ADChargeTypeReqRow.
     * 
     * @param ZFIELD2   * 保留字段2
     */
    public void setZFIELD2(java.lang.String ZFIELD2) {
        this.ZFIELD2 = ZFIELD2;
    }

    private java.lang.Object __equalsCalc = null;
    public synchronized boolean equals(java.lang.Object obj) {
        if (!(obj instanceof DT_ADChargeTypeReqRow)) return false;
        DT_ADChargeTypeReqRow other = (DT_ADChargeTypeReqRow) obj;
        if (obj == null) return false;
        if (this == obj) return true;
        if (__equalsCalc != null) {
            return (__equalsCalc == obj);
        }
        __equalsCalc = obj;
        boolean _equals;
        _equals = true && 
            ((this.ZFYTYPES==null && other.getZFYTYPES()==null) || 
             (this.ZFYTYPES!=null &&
              this.ZFYTYPES.equals(other.getZFYTYPES()))) &&
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
        if (getZFYTYPES() != null) {
            _hashCode += getZFYTYPES().hashCode();
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
        new org.apache.axis.description.TypeDesc(DT_ADChargeTypeReqRow.class, true);

    static {
        typeDesc.setXmlType(new javax.xml.namespace.QName("urn:ecc:rvs:contract", ">DT_ADChargeTypeReq>row"));
        org.apache.axis.description.ElementDesc elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("ZFYTYPES");
        elemField.setXmlName(new javax.xml.namespace.QName("", "ZFYTYPES"));
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
