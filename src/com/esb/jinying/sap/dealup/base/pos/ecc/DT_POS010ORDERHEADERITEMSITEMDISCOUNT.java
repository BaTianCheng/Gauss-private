/**
 * DT_POS010ORDERHEADERITEMSITEMDISCOUNT.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package com.esb.jinying.sap.dealup.base.pos.ecc;

public class DT_POS010ORDERHEADERITEMSITEMDISCOUNT  implements java.io.Serializable {
    /* 折扣行号 */
    private java.lang.String DISCNUMBER;

    /* 折扣类型 */
    private java.lang.String DISCTYPECODE;

    /* 折扣值 */
    private java.lang.Double REDUCTIONAMOUNT;

    public DT_POS010ORDERHEADERITEMSITEMDISCOUNT() {
    }

    public DT_POS010ORDERHEADERITEMSITEMDISCOUNT(
           java.lang.String DISCNUMBER,
           java.lang.String DISCTYPECODE,
           java.lang.Double REDUCTIONAMOUNT) {
           this.DISCNUMBER = DISCNUMBER;
           this.DISCTYPECODE = DISCTYPECODE;
           this.REDUCTIONAMOUNT = REDUCTIONAMOUNT;
    }


    /**
     * Gets the DISCNUMBER value for this DT_POS010ORDERHEADERITEMSITEMDISCOUNT.
     * 
     * @return DISCNUMBER   * 折扣行号
     */
    public java.lang.String getDISCNUMBER() {
        return DISCNUMBER;
    }


    /**
     * Sets the DISCNUMBER value for this DT_POS010ORDERHEADERITEMSITEMDISCOUNT.
     * 
     * @param DISCNUMBER   * 折扣行号
     */
    public void setDISCNUMBER(java.lang.String DISCNUMBER) {
        this.DISCNUMBER = DISCNUMBER;
    }


    /**
     * Gets the DISCTYPECODE value for this DT_POS010ORDERHEADERITEMSITEMDISCOUNT.
     * 
     * @return DISCTYPECODE   * 折扣类型
     */
    public java.lang.String getDISCTYPECODE() {
        return DISCTYPECODE;
    }


    /**
     * Sets the DISCTYPECODE value for this DT_POS010ORDERHEADERITEMSITEMDISCOUNT.
     * 
     * @param DISCTYPECODE   * 折扣类型
     */
    public void setDISCTYPECODE(java.lang.String DISCTYPECODE) {
        this.DISCTYPECODE = DISCTYPECODE;
    }


    /**
     * Gets the REDUCTIONAMOUNT value for this DT_POS010ORDERHEADERITEMSITEMDISCOUNT.
     * 
     * @return REDUCTIONAMOUNT   * 折扣值
     */
    public java.lang.Double getREDUCTIONAMOUNT() {
        return REDUCTIONAMOUNT;
    }


    /**
     * Sets the REDUCTIONAMOUNT value for this DT_POS010ORDERHEADERITEMSITEMDISCOUNT.
     * 
     * @param REDUCTIONAMOUNT   * 折扣值
     */
    public void setREDUCTIONAMOUNT(java.lang.Double REDUCTIONAMOUNT) {
        this.REDUCTIONAMOUNT = REDUCTIONAMOUNT;
    }

    private java.lang.Object __equalsCalc = null;
    public synchronized boolean equals(java.lang.Object obj) {
        if (!(obj instanceof DT_POS010ORDERHEADERITEMSITEMDISCOUNT)) return false;
        DT_POS010ORDERHEADERITEMSITEMDISCOUNT other = (DT_POS010ORDERHEADERITEMSITEMDISCOUNT) obj;
        if (obj == null) return false;
        if (this == obj) return true;
        if (__equalsCalc != null) {
            return (__equalsCalc == obj);
        }
        __equalsCalc = obj;
        boolean _equals;
        _equals = true && 
            ((this.DISCNUMBER==null && other.getDISCNUMBER()==null) || 
             (this.DISCNUMBER!=null &&
              this.DISCNUMBER.equals(other.getDISCNUMBER()))) &&
            ((this.DISCTYPECODE==null && other.getDISCTYPECODE()==null) || 
             (this.DISCTYPECODE!=null &&
              this.DISCTYPECODE.equals(other.getDISCTYPECODE()))) &&
            ((this.REDUCTIONAMOUNT==null && other.getREDUCTIONAMOUNT()==null) || 
             (this.REDUCTIONAMOUNT!=null &&
              this.REDUCTIONAMOUNT.equals(other.getREDUCTIONAMOUNT())));
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
        if (getDISCNUMBER() != null) {
            _hashCode += getDISCNUMBER().hashCode();
        }
        if (getDISCTYPECODE() != null) {
            _hashCode += getDISCTYPECODE().hashCode();
        }
        if (getREDUCTIONAMOUNT() != null) {
            _hashCode += getREDUCTIONAMOUNT().hashCode();
        }
        __hashCodeCalc = false;
        return _hashCode;
    }

    // Type metadata
    private static org.apache.axis.description.TypeDesc typeDesc =
        new org.apache.axis.description.TypeDesc(DT_POS010ORDERHEADERITEMSITEMDISCOUNT.class, true);

    static {
        typeDesc.setXmlType(new javax.xml.namespace.QName("urn:ecc:pos:base:dealup", ">>>>DT_POS010>ORDER>HEADER>ITEMS>ITEMDISCOUNT"));
        org.apache.axis.description.ElementDesc elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("DISCNUMBER");
        elemField.setXmlName(new javax.xml.namespace.QName("", "DISCNUMBER"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("DISCTYPECODE");
        elemField.setXmlName(new javax.xml.namespace.QName("", "DISCTYPECODE"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("REDUCTIONAMOUNT");
        elemField.setXmlName(new javax.xml.namespace.QName("", "REDUCTIONAMOUNT"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "double"));
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
