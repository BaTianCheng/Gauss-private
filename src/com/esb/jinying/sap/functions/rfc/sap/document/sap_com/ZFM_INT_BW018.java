/**
 * ZFM_INT_BW018.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package com.esb.jinying.sap.functions.rfc.sap.document.sap_com;

public class ZFM_INT_BW018  implements java.io.Serializable {
    private com.esb.jinying.sap.functions.rfc.sap.document.sap_com.Date ZDAY;

    private com.esb.jinying.sap.functions.rfc.sap.document.sap_com._BIC_AZJTCM00[] TAB;

    public ZFM_INT_BW018() {
    }

    public ZFM_INT_BW018(
           com.esb.jinying.sap.functions.rfc.sap.document.sap_com.Date ZDAY,
           com.esb.jinying.sap.functions.rfc.sap.document.sap_com._BIC_AZJTCM00[] TAB) {
           this.ZDAY = ZDAY;
           this.TAB = TAB;
    }


    /**
     * Gets the ZDAY value for this ZFM_INT_BW018.
     * 
     * @return ZDAY
     */
    public com.esb.jinying.sap.functions.rfc.sap.document.sap_com.Date getZDAY() {
        return ZDAY;
    }


    /**
     * Sets the ZDAY value for this ZFM_INT_BW018.
     * 
     * @param ZDAY
     */
    public void setZDAY(com.esb.jinying.sap.functions.rfc.sap.document.sap_com.Date ZDAY) {
        this.ZDAY = ZDAY;
    }


    /**
     * Gets the TAB value for this ZFM_INT_BW018.
     * 
     * @return TAB
     */
    public com.esb.jinying.sap.functions.rfc.sap.document.sap_com._BIC_AZJTCM00[] getTAB() {
        return TAB;
    }


    /**
     * Sets the TAB value for this ZFM_INT_BW018.
     * 
     * @param TAB
     */
    public void setTAB(com.esb.jinying.sap.functions.rfc.sap.document.sap_com._BIC_AZJTCM00[] TAB) {
        this.TAB = TAB;
    }

    private java.lang.Object __equalsCalc = null;
    public synchronized boolean equals(java.lang.Object obj) {
        if (!(obj instanceof ZFM_INT_BW018)) return false;
        ZFM_INT_BW018 other = (ZFM_INT_BW018) obj;
        if (obj == null) return false;
        if (this == obj) return true;
        if (__equalsCalc != null) {
            return (__equalsCalc == obj);
        }
        __equalsCalc = obj;
        boolean _equals;
        _equals = true && 
            ((this.ZDAY==null && other.getZDAY()==null) || 
             (this.ZDAY!=null &&
              this.ZDAY.equals(other.getZDAY()))) &&
            ((this.TAB==null && other.getTAB()==null) || 
             (this.TAB!=null &&
              java.util.Arrays.equals(this.TAB, other.getTAB())));
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
        if (getZDAY() != null) {
            _hashCode += getZDAY().hashCode();
        }
        if (getTAB() != null) {
            for (int i=0;
                 i<java.lang.reflect.Array.getLength(getTAB());
                 i++) {
                java.lang.Object obj = java.lang.reflect.Array.get(getTAB(), i);
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
        new org.apache.axis.description.TypeDesc(ZFM_INT_BW018.class, true);

    static {
        typeDesc.setXmlType(new javax.xml.namespace.QName("urn:sap-com:document:sap:rfc:functions", ">ZFM_INT_BW018"));
        org.apache.axis.description.ElementDesc elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("ZDAY");
        elemField.setXmlName(new javax.xml.namespace.QName("", "ZDAY"));
        elemField.setXmlType(new javax.xml.namespace.QName("urn:sap-com:document:sap:rfc:functions", "date"));
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("TAB");
        elemField.setXmlName(new javax.xml.namespace.QName("", "TAB"));
        elemField.setXmlType(new javax.xml.namespace.QName("urn:sap-com:document:sap:rfc:functions", "_-BIC_-AZJTCM00"));
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
