/**
 * ZPO0002Response.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package com.esb.jinying.sap.functions.rfc.sap.document.sap_com;

public class ZPO0002Response  implements java.io.Serializable {
    private com.esb.jinying.sap.functions.rfc.sap.document.sap_com.ZSMGHEADER[] THEADER;

    private com.esb.jinying.sap.functions.rfc.sap.document.sap_com.ZSMGITEM[] TITEM;

    public ZPO0002Response() {
    }

    public ZPO0002Response(
           com.esb.jinying.sap.functions.rfc.sap.document.sap_com.ZSMGHEADER[] THEADER,
           com.esb.jinying.sap.functions.rfc.sap.document.sap_com.ZSMGITEM[] TITEM) {
           this.THEADER = THEADER;
           this.TITEM = TITEM;
    }


    /**
     * Gets the THEADER value for this ZPO0002Response.
     * 
     * @return THEADER
     */
    public com.esb.jinying.sap.functions.rfc.sap.document.sap_com.ZSMGHEADER[] getTHEADER() {
        return THEADER;
    }


    /**
     * Sets the THEADER value for this ZPO0002Response.
     * 
     * @param THEADER
     */
    public void setTHEADER(com.esb.jinying.sap.functions.rfc.sap.document.sap_com.ZSMGHEADER[] THEADER) {
        this.THEADER = THEADER;
    }


    /**
     * Gets the TITEM value for this ZPO0002Response.
     * 
     * @return TITEM
     */
    public com.esb.jinying.sap.functions.rfc.sap.document.sap_com.ZSMGITEM[] getTITEM() {
        return TITEM;
    }


    /**
     * Sets the TITEM value for this ZPO0002Response.
     * 
     * @param TITEM
     */
    public void setTITEM(com.esb.jinying.sap.functions.rfc.sap.document.sap_com.ZSMGITEM[] TITEM) {
        this.TITEM = TITEM;
    }

    private java.lang.Object __equalsCalc = null;
    public synchronized boolean equals(java.lang.Object obj) {
        if (!(obj instanceof ZPO0002Response)) return false;
        ZPO0002Response other = (ZPO0002Response) obj;
        if (obj == null) return false;
        if (this == obj) return true;
        if (__equalsCalc != null) {
            return (__equalsCalc == obj);
        }
        __equalsCalc = obj;
        boolean _equals;
        _equals = true && 
            ((this.THEADER==null && other.getTHEADER()==null) || 
             (this.THEADER!=null &&
              java.util.Arrays.equals(this.THEADER, other.getTHEADER()))) &&
            ((this.TITEM==null && other.getTITEM()==null) || 
             (this.TITEM!=null &&
              java.util.Arrays.equals(this.TITEM, other.getTITEM())));
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
        if (getTHEADER() != null) {
            for (int i=0;
                 i<java.lang.reflect.Array.getLength(getTHEADER());
                 i++) {
                java.lang.Object obj = java.lang.reflect.Array.get(getTHEADER(), i);
                if (obj != null &&
                    !obj.getClass().isArray()) {
                    _hashCode += obj.hashCode();
                }
            }
        }
        if (getTITEM() != null) {
            for (int i=0;
                 i<java.lang.reflect.Array.getLength(getTITEM());
                 i++) {
                java.lang.Object obj = java.lang.reflect.Array.get(getTITEM(), i);
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
        new org.apache.axis.description.TypeDesc(ZPO0002Response.class, true);

    static {
        typeDesc.setXmlType(new javax.xml.namespace.QName("urn:sap-com:document:sap:rfc:functions", ">ZPO0002.Response"));
        org.apache.axis.description.ElementDesc elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("THEADER");
        elemField.setXmlName(new javax.xml.namespace.QName("", "THEADER"));
        elemField.setXmlType(new javax.xml.namespace.QName("urn:sap-com:document:sap:rfc:functions", "ZSMGHEADER"));
        elemField.setNillable(false);
        elemField.setItemQName(new javax.xml.namespace.QName("", "item"));
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("TITEM");
        elemField.setXmlName(new javax.xml.namespace.QName("", "TITEM"));
        elemField.setXmlType(new javax.xml.namespace.QName("urn:sap-com:document:sap:rfc:functions", "ZSMGITEM"));
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
