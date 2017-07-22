/**
 * ZFM_INT_BW008Response.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package com.esb.jinying.sap.functions.rfc.sap.document.sap_com;

public class ZFM_INT_BW008Response  implements java.io.Serializable {
    private com.esb.jinying.sap.functions.rfc.sap.document.sap_com._BIC_AZMDSPXX00[] TAB;

    public ZFM_INT_BW008Response() {
    }

    public ZFM_INT_BW008Response(
           com.esb.jinying.sap.functions.rfc.sap.document.sap_com._BIC_AZMDSPXX00[] TAB) {
           this.TAB = TAB;
    }


    /**
     * Gets the TAB value for this ZFM_INT_BW008Response.
     * 
     * @return TAB
     */
    public com.esb.jinying.sap.functions.rfc.sap.document.sap_com._BIC_AZMDSPXX00[] getTAB() {
        return TAB;
    }


    /**
     * Sets the TAB value for this ZFM_INT_BW008Response.
     * 
     * @param TAB
     */
    public void setTAB(com.esb.jinying.sap.functions.rfc.sap.document.sap_com._BIC_AZMDSPXX00[] TAB) {
        this.TAB = TAB;
    }

    private java.lang.Object __equalsCalc = null;
    public synchronized boolean equals(java.lang.Object obj) {
        if (!(obj instanceof ZFM_INT_BW008Response)) return false;
        ZFM_INT_BW008Response other = (ZFM_INT_BW008Response) obj;
        if (obj == null) return false;
        if (this == obj) return true;
        if (__equalsCalc != null) {
            return (__equalsCalc == obj);
        }
        __equalsCalc = obj;
        boolean _equals;
        _equals = true && 
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
        new org.apache.axis.description.TypeDesc(ZFM_INT_BW008Response.class, true);

    static {
        typeDesc.setXmlType(new javax.xml.namespace.QName("urn:sap-com:document:sap:rfc:functions", ">ZFM_INT_BW008.Response"));
        org.apache.axis.description.ElementDesc elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("TAB");
        elemField.setXmlName(new javax.xml.namespace.QName("", "TAB"));
        elemField.setXmlType(new javax.xml.namespace.QName("urn:sap-com:document:sap:rfc:functions", "_-BIC_-AZMDSPXX00"));
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
