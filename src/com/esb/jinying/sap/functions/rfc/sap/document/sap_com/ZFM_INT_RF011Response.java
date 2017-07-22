/**
 * ZFM_INT_RF011Response.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package com.esb.jinying.sap.functions.rfc.sap.document.sap_com;

public class ZFM_INT_RF011Response  implements java.io.Serializable {
    private java.lang.String MESSAGE;

    private java.lang.String SUCC;

    private com.esb.jinying.sap.functions.rfc.sap.document.sap_com.ZT0006[] IT_RF011;

    public ZFM_INT_RF011Response() {
    }

    public ZFM_INT_RF011Response(
           java.lang.String MESSAGE,
           java.lang.String SUCC,
           com.esb.jinying.sap.functions.rfc.sap.document.sap_com.ZT0006[] IT_RF011) {
           this.MESSAGE = MESSAGE;
           this.SUCC = SUCC;
           this.IT_RF011 = IT_RF011;
    }


    /**
     * Gets the MESSAGE value for this ZFM_INT_RF011Response.
     * 
     * @return MESSAGE
     */
    public java.lang.String getMESSAGE() {
        return MESSAGE;
    }


    /**
     * Sets the MESSAGE value for this ZFM_INT_RF011Response.
     * 
     * @param MESSAGE
     */
    public void setMESSAGE(java.lang.String MESSAGE) {
        this.MESSAGE = MESSAGE;
    }


    /**
     * Gets the SUCC value for this ZFM_INT_RF011Response.
     * 
     * @return SUCC
     */
    public java.lang.String getSUCC() {
        return SUCC;
    }


    /**
     * Sets the SUCC value for this ZFM_INT_RF011Response.
     * 
     * @param SUCC
     */
    public void setSUCC(java.lang.String SUCC) {
        this.SUCC = SUCC;
    }


    /**
     * Gets the IT_RF011 value for this ZFM_INT_RF011Response.
     * 
     * @return IT_RF011
     */
    public com.esb.jinying.sap.functions.rfc.sap.document.sap_com.ZT0006[] getIT_RF011() {
        return IT_RF011;
    }


    /**
     * Sets the IT_RF011 value for this ZFM_INT_RF011Response.
     * 
     * @param IT_RF011
     */
    public void setIT_RF011(com.esb.jinying.sap.functions.rfc.sap.document.sap_com.ZT0006[] IT_RF011) {
        this.IT_RF011 = IT_RF011;
    }

    private java.lang.Object __equalsCalc = null;
    public synchronized boolean equals(java.lang.Object obj) {
        if (!(obj instanceof ZFM_INT_RF011Response)) return false;
        ZFM_INT_RF011Response other = (ZFM_INT_RF011Response) obj;
        if (obj == null) return false;
        if (this == obj) return true;
        if (__equalsCalc != null) {
            return (__equalsCalc == obj);
        }
        __equalsCalc = obj;
        boolean _equals;
        _equals = true && 
            ((this.MESSAGE==null && other.getMESSAGE()==null) || 
             (this.MESSAGE!=null &&
              this.MESSAGE.equals(other.getMESSAGE()))) &&
            ((this.SUCC==null && other.getSUCC()==null) || 
             (this.SUCC!=null &&
              this.SUCC.equals(other.getSUCC()))) &&
            ((this.IT_RF011==null && other.getIT_RF011()==null) || 
             (this.IT_RF011!=null &&
              java.util.Arrays.equals(this.IT_RF011, other.getIT_RF011())));
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
        if (getMESSAGE() != null) {
            _hashCode += getMESSAGE().hashCode();
        }
        if (getSUCC() != null) {
            _hashCode += getSUCC().hashCode();
        }
        if (getIT_RF011() != null) {
            for (int i=0;
                 i<java.lang.reflect.Array.getLength(getIT_RF011());
                 i++) {
                java.lang.Object obj = java.lang.reflect.Array.get(getIT_RF011(), i);
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
        new org.apache.axis.description.TypeDesc(ZFM_INT_RF011Response.class, true);

    static {
        typeDesc.setXmlType(new javax.xml.namespace.QName("urn:sap-com:document:sap:rfc:functions", ">ZFM_INT_RF011.Response"));
        org.apache.axis.description.ElementDesc elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("MESSAGE");
        elemField.setXmlName(new javax.xml.namespace.QName("", "MESSAGE"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("SUCC");
        elemField.setXmlName(new javax.xml.namespace.QName("", "SUCC"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("IT_RF011");
        elemField.setXmlName(new javax.xml.namespace.QName("", "IT_RF011"));
        elemField.setXmlType(new javax.xml.namespace.QName("urn:sap-com:document:sap:rfc:functions", "ZT0006"));
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
