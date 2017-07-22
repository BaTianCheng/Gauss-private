/**
 * ZDP003.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package com.esb.jinying.sap.functions.rfc.sap.document.sap_com;

public class ZDP003  implements java.io.Serializable {
    private java.lang.String INCONTNO;

    private com.esb.jinying.sap.functions.rfc.sap.document.sap_com.Date INDAT;

    private com.esb.jinying.sap.functions.rfc.sap.document.sap_com.ZSDP004[] OUT_TAB;

    public ZDP003() {
    }

    public ZDP003(
           java.lang.String INCONTNO,
           com.esb.jinying.sap.functions.rfc.sap.document.sap_com.Date INDAT,
           com.esb.jinying.sap.functions.rfc.sap.document.sap_com.ZSDP004[] OUT_TAB) {
           this.INCONTNO = INCONTNO;
           this.INDAT = INDAT;
           this.OUT_TAB = OUT_TAB;
    }


    /**
     * Gets the INCONTNO value for this ZDP003.
     * 
     * @return INCONTNO
     */
    public java.lang.String getINCONTNO() {
        return INCONTNO;
    }


    /**
     * Sets the INCONTNO value for this ZDP003.
     * 
     * @param INCONTNO
     */
    public void setINCONTNO(java.lang.String INCONTNO) {
        this.INCONTNO = INCONTNO;
    }


    /**
     * Gets the INDAT value for this ZDP003.
     * 
     * @return INDAT
     */
    public com.esb.jinying.sap.functions.rfc.sap.document.sap_com.Date getINDAT() {
        return INDAT;
    }


    /**
     * Sets the INDAT value for this ZDP003.
     * 
     * @param INDAT
     */
    public void setINDAT(com.esb.jinying.sap.functions.rfc.sap.document.sap_com.Date INDAT) {
        this.INDAT = INDAT;
    }


    /**
     * Gets the OUT_TAB value for this ZDP003.
     * 
     * @return OUT_TAB
     */
    public com.esb.jinying.sap.functions.rfc.sap.document.sap_com.ZSDP004[] getOUT_TAB() {
        return OUT_TAB;
    }


    /**
     * Sets the OUT_TAB value for this ZDP003.
     * 
     * @param OUT_TAB
     */
    public void setOUT_TAB(com.esb.jinying.sap.functions.rfc.sap.document.sap_com.ZSDP004[] OUT_TAB) {
        this.OUT_TAB = OUT_TAB;
    }

    private java.lang.Object __equalsCalc = null;
    public synchronized boolean equals(java.lang.Object obj) {
        if (!(obj instanceof ZDP003)) return false;
        ZDP003 other = (ZDP003) obj;
        if (obj == null) return false;
        if (this == obj) return true;
        if (__equalsCalc != null) {
            return (__equalsCalc == obj);
        }
        __equalsCalc = obj;
        boolean _equals;
        _equals = true && 
            ((this.INCONTNO==null && other.getINCONTNO()==null) || 
             (this.INCONTNO!=null &&
              this.INCONTNO.equals(other.getINCONTNO()))) &&
            ((this.INDAT==null && other.getINDAT()==null) || 
             (this.INDAT!=null &&
              this.INDAT.equals(other.getINDAT()))) &&
            ((this.OUT_TAB==null && other.getOUT_TAB()==null) || 
             (this.OUT_TAB!=null &&
              java.util.Arrays.equals(this.OUT_TAB, other.getOUT_TAB())));
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
        if (getINCONTNO() != null) {
            _hashCode += getINCONTNO().hashCode();
        }
        if (getINDAT() != null) {
            _hashCode += getINDAT().hashCode();
        }
        if (getOUT_TAB() != null) {
            for (int i=0;
                 i<java.lang.reflect.Array.getLength(getOUT_TAB());
                 i++) {
                java.lang.Object obj = java.lang.reflect.Array.get(getOUT_TAB(), i);
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
        new org.apache.axis.description.TypeDesc(ZDP003.class, true);

    static {
        typeDesc.setXmlType(new javax.xml.namespace.QName("urn:sap-com:document:sap:rfc:functions", ">ZDP003"));
        org.apache.axis.description.ElementDesc elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("INCONTNO");
        elemField.setXmlName(new javax.xml.namespace.QName("", "INCONTNO"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("INDAT");
        elemField.setXmlName(new javax.xml.namespace.QName("", "INDAT"));
        elemField.setXmlType(new javax.xml.namespace.QName("urn:sap-com:document:sap:rfc:functions", "date"));
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("OUT_TAB");
        elemField.setXmlName(new javax.xml.namespace.QName("", "OUT_TAB"));
        elemField.setXmlType(new javax.xml.namespace.QName("urn:sap-com:document:sap:rfc:functions", "ZSDP004"));
        elemField.setNillable(false);
        elemField.setItemQName(new javax.xml.namespace.QName("", "item"));
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
