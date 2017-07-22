/**
 * DT_POS010ORDER.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package com.esb.jinying.sap.dealup.base.pos.ecc;

public class DT_POS010ORDER  implements java.io.Serializable {
    /* 抬头 */
    private com.esb.jinying.sap.dealup.base.pos.ecc.DT_POS010ORDERHEADER HEADER;

    /* 支付信息 */
    private com.esb.jinying.sap.dealup.base.pos.ecc.DT_POS010ORDERTENDER[] TENDER;

    public DT_POS010ORDER() {
    }

    public DT_POS010ORDER(
           com.esb.jinying.sap.dealup.base.pos.ecc.DT_POS010ORDERHEADER HEADER,
           com.esb.jinying.sap.dealup.base.pos.ecc.DT_POS010ORDERTENDER[] TENDER) {
           this.HEADER = HEADER;
           this.TENDER = TENDER;
    }


    /**
     * Gets the HEADER value for this DT_POS010ORDER.
     * 
     * @return HEADER   * 抬头
     */
    public com.esb.jinying.sap.dealup.base.pos.ecc.DT_POS010ORDERHEADER getHEADER() {
        return HEADER;
    }


    /**
     * Sets the HEADER value for this DT_POS010ORDER.
     * 
     * @param HEADER   * 抬头
     */
    public void setHEADER(com.esb.jinying.sap.dealup.base.pos.ecc.DT_POS010ORDERHEADER HEADER) {
        this.HEADER = HEADER;
    }


    /**
     * Gets the TENDER value for this DT_POS010ORDER.
     * 
     * @return TENDER   * 支付信息
     */
    public com.esb.jinying.sap.dealup.base.pos.ecc.DT_POS010ORDERTENDER[] getTENDER() {
        return TENDER;
    }


    /**
     * Sets the TENDER value for this DT_POS010ORDER.
     * 
     * @param TENDER   * 支付信息
     */
    public void setTENDER(com.esb.jinying.sap.dealup.base.pos.ecc.DT_POS010ORDERTENDER[] TENDER) {
        this.TENDER = TENDER;
    }

    public com.esb.jinying.sap.dealup.base.pos.ecc.DT_POS010ORDERTENDER getTENDER(int i) {
        return this.TENDER[i];
    }

    public void setTENDER(int i, com.esb.jinying.sap.dealup.base.pos.ecc.DT_POS010ORDERTENDER _value) {
        this.TENDER[i] = _value;
    }

    private java.lang.Object __equalsCalc = null;
    public synchronized boolean equals(java.lang.Object obj) {
        if (!(obj instanceof DT_POS010ORDER)) return false;
        DT_POS010ORDER other = (DT_POS010ORDER) obj;
        if (obj == null) return false;
        if (this == obj) return true;
        if (__equalsCalc != null) {
            return (__equalsCalc == obj);
        }
        __equalsCalc = obj;
        boolean _equals;
        _equals = true && 
            ((this.HEADER==null && other.getHEADER()==null) || 
             (this.HEADER!=null &&
              this.HEADER.equals(other.getHEADER()))) &&
            ((this.TENDER==null && other.getTENDER()==null) || 
             (this.TENDER!=null &&
              java.util.Arrays.equals(this.TENDER, other.getTENDER())));
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
        if (getHEADER() != null) {
            _hashCode += getHEADER().hashCode();
        }
        if (getTENDER() != null) {
            for (int i=0;
                 i<java.lang.reflect.Array.getLength(getTENDER());
                 i++) {
                java.lang.Object obj = java.lang.reflect.Array.get(getTENDER(), i);
                if (obj != null &&
                    !obj.getClass().isArray()) {
                    _hashCode += obj.hashCode();
                }
            }
        }
        __hashCodeCalc = false;
        return _hashCode;
    }

    // Type metadata
    private static org.apache.axis.description.TypeDesc typeDesc =
        new org.apache.axis.description.TypeDesc(DT_POS010ORDER.class, true);

    static {
        typeDesc.setXmlType(new javax.xml.namespace.QName("urn:ecc:pos:base:dealup", ">DT_POS010>ORDER"));
        org.apache.axis.description.ElementDesc elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("HEADER");
        elemField.setXmlName(new javax.xml.namespace.QName("", "HEADER"));
        elemField.setXmlType(new javax.xml.namespace.QName("urn:ecc:pos:base:dealup", ">>DT_POS010>ORDER>HEADER"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("TENDER");
        elemField.setXmlName(new javax.xml.namespace.QName("", "TENDER"));
        elemField.setXmlType(new javax.xml.namespace.QName("urn:ecc:pos:base:dealup", ">>DT_POS010>ORDER>TENDER"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        elemField.setMaxOccursUnbounded(true);
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
