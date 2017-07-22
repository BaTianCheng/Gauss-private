/**
 * ZFM_INT_BW012.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package com.esb.jinying.sap.functions.rfc.sap.document.sap_com;

public class ZFM_INT_BW012  implements java.io.Serializable {
    private com.esb.jinying.sap.functions.rfc.sap.document.sap_com.Date UPDATA_DATE;

    private com.esb.jinying.sap.functions.rfc.sap.document.sap_com.ZTYXX[] ZTYSX;

    public ZFM_INT_BW012() {
    }

    public ZFM_INT_BW012(
           com.esb.jinying.sap.functions.rfc.sap.document.sap_com.Date UPDATA_DATE,
           com.esb.jinying.sap.functions.rfc.sap.document.sap_com.ZTYXX[] ZTYSX) {
           this.UPDATA_DATE = UPDATA_DATE;
           this.ZTYSX = ZTYSX;
    }


    /**
     * Gets the UPDATA_DATE value for this ZFM_INT_BW012.
     * 
     * @return UPDATA_DATE
     */
    public com.esb.jinying.sap.functions.rfc.sap.document.sap_com.Date getUPDATA_DATE() {
        return UPDATA_DATE;
    }


    /**
     * Sets the UPDATA_DATE value for this ZFM_INT_BW012.
     * 
     * @param UPDATA_DATE
     */
    public void setUPDATA_DATE(com.esb.jinying.sap.functions.rfc.sap.document.sap_com.Date UPDATA_DATE) {
        this.UPDATA_DATE = UPDATA_DATE;
    }


    /**
     * Gets the ZTYSX value for this ZFM_INT_BW012.
     * 
     * @return ZTYSX
     */
    public com.esb.jinying.sap.functions.rfc.sap.document.sap_com.ZTYXX[] getZTYSX() {
        return ZTYSX;
    }


    /**
     * Sets the ZTYSX value for this ZFM_INT_BW012.
     * 
     * @param ZTYSX
     */
    public void setZTYSX(com.esb.jinying.sap.functions.rfc.sap.document.sap_com.ZTYXX[] ZTYSX) {
        this.ZTYSX = ZTYSX;
    }

    private java.lang.Object __equalsCalc = null;
    public synchronized boolean equals(java.lang.Object obj) {
        if (!(obj instanceof ZFM_INT_BW012)) return false;
        ZFM_INT_BW012 other = (ZFM_INT_BW012) obj;
        if (obj == null) return false;
        if (this == obj) return true;
        if (__equalsCalc != null) {
            return (__equalsCalc == obj);
        }
        __equalsCalc = obj;
        boolean _equals;
        _equals = true && 
            ((this.UPDATA_DATE==null && other.getUPDATA_DATE()==null) || 
             (this.UPDATA_DATE!=null &&
              this.UPDATA_DATE.equals(other.getUPDATA_DATE()))) &&
            ((this.ZTYSX==null && other.getZTYSX()==null) || 
             (this.ZTYSX!=null &&
              java.util.Arrays.equals(this.ZTYSX, other.getZTYSX())));
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
        if (getUPDATA_DATE() != null) {
            _hashCode += getUPDATA_DATE().hashCode();
        }
        if (getZTYSX() != null) {
            for (int i=0;
                 i<java.lang.reflect.Array.getLength(getZTYSX());
                 i++) {
                java.lang.Object obj = java.lang.reflect.Array.get(getZTYSX(), i);
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
        new org.apache.axis.description.TypeDesc(ZFM_INT_BW012.class, true);

    static {
        typeDesc.setXmlType(new javax.xml.namespace.QName("urn:sap-com:document:sap:rfc:functions", ">ZFM_INT_BW012"));
        org.apache.axis.description.ElementDesc elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("UPDATA_DATE");
        elemField.setXmlName(new javax.xml.namespace.QName("", "UPDATA_DATE"));
        elemField.setXmlType(new javax.xml.namespace.QName("urn:sap-com:document:sap:rfc:functions", "date"));
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("ZTYSX");
        elemField.setXmlName(new javax.xml.namespace.QName("", "ZTYSX"));
        elemField.setXmlType(new javax.xml.namespace.QName("urn:sap-com:document:sap:rfc:functions", "ZTYXX"));
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
