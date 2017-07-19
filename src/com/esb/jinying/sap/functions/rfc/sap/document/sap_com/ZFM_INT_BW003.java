/**
 * ZFM_INT_BW003.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package com.esb.jinying.sap.functions.rfc.sap.document.sap_com;

public class ZFM_INT_BW003  implements java.io.Serializable {
    private java.lang.String SALE_COMPANY;

    private java.lang.String SALE_DATE;

    private com.esb.jinying.sap.functions.rfc.sap.document.sap_com.ZSBW003A[] TAB1;

    public ZFM_INT_BW003() {
    }

    public ZFM_INT_BW003(
           java.lang.String SALE_COMPANY,
           java.lang.String SALE_DATE,
           com.esb.jinying.sap.functions.rfc.sap.document.sap_com.ZSBW003A[] TAB1) {
           this.SALE_COMPANY = SALE_COMPANY;
           this.SALE_DATE = SALE_DATE;
           this.TAB1 = TAB1;
    }


    /**
     * Gets the SALE_COMPANY value for this ZFM_INT_BW003.
     * 
     * @return SALE_COMPANY
     */
    public java.lang.String getSALE_COMPANY() {
        return SALE_COMPANY;
    }


    /**
     * Sets the SALE_COMPANY value for this ZFM_INT_BW003.
     * 
     * @param SALE_COMPANY
     */
    public void setSALE_COMPANY(java.lang.String SALE_COMPANY) {
        this.SALE_COMPANY = SALE_COMPANY;
    }


    /**
     * Gets the SALE_DATE value for this ZFM_INT_BW003.
     * 
     * @return SALE_DATE
     */
    public java.lang.String getSALE_DATE() {
        return SALE_DATE;
    }


    /**
     * Sets the SALE_DATE value for this ZFM_INT_BW003.
     * 
     * @param SALE_DATE
     */
    public void setSALE_DATE(java.lang.String SALE_DATE) {
        this.SALE_DATE = SALE_DATE;
    }


    /**
     * Gets the TAB1 value for this ZFM_INT_BW003.
     * 
     * @return TAB1
     */
    public com.esb.jinying.sap.functions.rfc.sap.document.sap_com.ZSBW003A[] getTAB1() {
        return TAB1;
    }


    /**
     * Sets the TAB1 value for this ZFM_INT_BW003.
     * 
     * @param TAB1
     */
    public void setTAB1(com.esb.jinying.sap.functions.rfc.sap.document.sap_com.ZSBW003A[] TAB1) {
        this.TAB1 = TAB1;
    }

    private java.lang.Object __equalsCalc = null;
    public synchronized boolean equals(java.lang.Object obj) {
        if (!(obj instanceof ZFM_INT_BW003)) return false;
        ZFM_INT_BW003 other = (ZFM_INT_BW003) obj;
        if (obj == null) return false;
        if (this == obj) return true;
        if (__equalsCalc != null) {
            return (__equalsCalc == obj);
        }
        __equalsCalc = obj;
        boolean _equals;
        _equals = true && 
            ((this.SALE_COMPANY==null && other.getSALE_COMPANY()==null) || 
             (this.SALE_COMPANY!=null &&
              this.SALE_COMPANY.equals(other.getSALE_COMPANY()))) &&
            ((this.SALE_DATE==null && other.getSALE_DATE()==null) || 
             (this.SALE_DATE!=null &&
              this.SALE_DATE.equals(other.getSALE_DATE()))) &&
            ((this.TAB1==null && other.getTAB1()==null) || 
             (this.TAB1!=null &&
              java.util.Arrays.equals(this.TAB1, other.getTAB1())));
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
        if (getSALE_COMPANY() != null) {
            _hashCode += getSALE_COMPANY().hashCode();
        }
        if (getSALE_DATE() != null) {
            _hashCode += getSALE_DATE().hashCode();
        }
        if (getTAB1() != null) {
            for (int i=0;
                 i<java.lang.reflect.Array.getLength(getTAB1());
                 i++) {
                java.lang.Object obj = java.lang.reflect.Array.get(getTAB1(), i);
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
        new org.apache.axis.description.TypeDesc(ZFM_INT_BW003.class, true);

    static {
        typeDesc.setXmlType(new javax.xml.namespace.QName("urn:sap-com:document:sap:rfc:functions", ">ZFM_INT_BW003"));
        org.apache.axis.description.ElementDesc elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("SALE_COMPANY");
        elemField.setXmlName(new javax.xml.namespace.QName("", "SALE_COMPANY"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("SALE_DATE");
        elemField.setXmlName(new javax.xml.namespace.QName("", "SALE_DATE"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("TAB1");
        elemField.setXmlName(new javax.xml.namespace.QName("", "TAB1"));
        elemField.setXmlType(new javax.xml.namespace.QName("urn:sap-com:document:sap:rfc:functions", "ZSBW003A"));
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
