/**
 * ZOA0016.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package com.esb.jinying.sap.functions.rfc.sap.document.sap_com;

public class ZOA0016  implements java.io.Serializable {
    private com.esb.jinying.sap.functions.rfc.sap.document.sap_com.ZSPOS009[] i_ZSPOS009;

    public ZOA0016() {
    }

    public ZOA0016(
           com.esb.jinying.sap.functions.rfc.sap.document.sap_com.ZSPOS009[] i_ZSPOS009) {
           this.i_ZSPOS009 = i_ZSPOS009;
    }


    /**
     * Gets the i_ZSPOS009 value for this ZOA0016.
     * 
     * @return i_ZSPOS009
     */
    public com.esb.jinying.sap.functions.rfc.sap.document.sap_com.ZSPOS009[] getI_ZSPOS009() {
        return i_ZSPOS009;
    }


    /**
     * Sets the i_ZSPOS009 value for this ZOA0016.
     * 
     * @param i_ZSPOS009
     */
    public void setI_ZSPOS009(com.esb.jinying.sap.functions.rfc.sap.document.sap_com.ZSPOS009[] i_ZSPOS009) {
        this.i_ZSPOS009 = i_ZSPOS009;
    }

    private java.lang.Object __equalsCalc = null;
    public synchronized boolean equals(java.lang.Object obj) {
        if (!(obj instanceof ZOA0016)) return false;
        ZOA0016 other = (ZOA0016) obj;
        if (obj == null) return false;
        if (this == obj) return true;
        if (__equalsCalc != null) {
            return (__equalsCalc == obj);
        }
        __equalsCalc = obj;
        boolean _equals;
        _equals = true && 
            ((this.i_ZSPOS009==null && other.getI_ZSPOS009()==null) || 
             (this.i_ZSPOS009!=null &&
              java.util.Arrays.equals(this.i_ZSPOS009, other.getI_ZSPOS009())));
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
        if (getI_ZSPOS009() != null) {
            for (int i=0;
                 i<java.lang.reflect.Array.getLength(getI_ZSPOS009());
                 i++) {
                java.lang.Object obj = java.lang.reflect.Array.get(getI_ZSPOS009(), i);
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
        new org.apache.axis.description.TypeDesc(ZOA0016.class, true);

    static {
        typeDesc.setXmlType(new javax.xml.namespace.QName("urn:sap-com:document:sap:rfc:functions", ">ZOA0016"));
        org.apache.axis.description.ElementDesc elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("i_ZSPOS009");
        elemField.setXmlName(new javax.xml.namespace.QName("", "I_ZSPOS009"));
        elemField.setXmlType(new javax.xml.namespace.QName("urn:sap-com:document:sap:rfc:functions", "ZSPOS009"));
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
