/**
 * DT_POS003CITEMS.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package com.esb.jinying.sap.dealup.base.pos.ecc;

public class DT_POS003CITEMS  implements java.io.Serializable {
    /* 商品编码 */
    private java.lang.String MATNR;

    /* EAN编码 */
    private java.lang.String EAN11;

    /* 删除标记 */
    private java.lang.String LOEKZ;

    public DT_POS003CITEMS() {
    }

    public DT_POS003CITEMS(
           java.lang.String MATNR,
           java.lang.String EAN11,
           java.lang.String LOEKZ) {
           this.MATNR = MATNR;
           this.EAN11 = EAN11;
           this.LOEKZ = LOEKZ;
    }


    /**
     * Gets the MATNR value for this DT_POS003CITEMS.
     * 
     * @return MATNR   * 商品编码
     */
    public java.lang.String getMATNR() {
        return MATNR;
    }


    /**
     * Sets the MATNR value for this DT_POS003CITEMS.
     * 
     * @param MATNR   * 商品编码
     */
    public void setMATNR(java.lang.String MATNR) {
        this.MATNR = MATNR;
    }


    /**
     * Gets the EAN11 value for this DT_POS003CITEMS.
     * 
     * @return EAN11   * EAN编码
     */
    public java.lang.String getEAN11() {
        return EAN11;
    }


    /**
     * Sets the EAN11 value for this DT_POS003CITEMS.
     * 
     * @param EAN11   * EAN编码
     */
    public void setEAN11(java.lang.String EAN11) {
        this.EAN11 = EAN11;
    }


    /**
     * Gets the LOEKZ value for this DT_POS003CITEMS.
     * 
     * @return LOEKZ   * 删除标记
     */
    public java.lang.String getLOEKZ() {
        return LOEKZ;
    }


    /**
     * Sets the LOEKZ value for this DT_POS003CITEMS.
     * 
     * @param LOEKZ   * 删除标记
     */
    public void setLOEKZ(java.lang.String LOEKZ) {
        this.LOEKZ = LOEKZ;
    }

    private java.lang.Object __equalsCalc = null;
    public synchronized boolean equals(java.lang.Object obj) {
        if (!(obj instanceof DT_POS003CITEMS)) return false;
        DT_POS003CITEMS other = (DT_POS003CITEMS) obj;
        if (obj == null) return false;
        if (this == obj) return true;
        if (__equalsCalc != null) {
            return (__equalsCalc == obj);
        }
        __equalsCalc = obj;
        boolean _equals;
        _equals = true && 
            ((this.MATNR==null && other.getMATNR()==null) || 
             (this.MATNR!=null &&
              this.MATNR.equals(other.getMATNR()))) &&
            ((this.EAN11==null && other.getEAN11()==null) || 
             (this.EAN11!=null &&
              this.EAN11.equals(other.getEAN11()))) &&
            ((this.LOEKZ==null && other.getLOEKZ()==null) || 
             (this.LOEKZ!=null &&
              this.LOEKZ.equals(other.getLOEKZ())));
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
        if (getMATNR() != null) {
            _hashCode += getMATNR().hashCode();
        }
        if (getEAN11() != null) {
            _hashCode += getEAN11().hashCode();
        }
        if (getLOEKZ() != null) {
            _hashCode += getLOEKZ().hashCode();
        }
        __hashCodeCalc = false;
        return _hashCode;
    }

    // Type metadata
    private static org.apache.axis.description.TypeDesc typeDesc =
        new org.apache.axis.description.TypeDesc(DT_POS003CITEMS.class, true);

    static {
        typeDesc.setXmlType(new javax.xml.namespace.QName("urn:ecc:pos:base:dealup", ">DT_POS003C>ITEMS"));
        org.apache.axis.description.ElementDesc elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("MATNR");
        elemField.setXmlName(new javax.xml.namespace.QName("", "MATNR"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("EAN11");
        elemField.setXmlName(new javax.xml.namespace.QName("", "EAN11"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("LOEKZ");
        elemField.setXmlName(new javax.xml.namespace.QName("", "LOEKZ"));
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
