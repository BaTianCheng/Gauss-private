/**
 * DT_CategoryReq.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package com.esb.jinying.sap.mastdata.rvs.ecc;

public class DT_CategoryReq  implements java.io.Serializable {
    private java.lang.String INPUT;

    public DT_CategoryReq() {
    }

    public DT_CategoryReq(
           java.lang.String INPUT) {
           this.INPUT = INPUT;
    }


    /**
     * Gets the INPUT value for this DT_CategoryReq.
     * 
     * @return INPUT
     */
    public java.lang.String getINPUT() {
        return INPUT;
    }


    /**
     * Sets the INPUT value for this DT_CategoryReq.
     * 
     * @param INPUT
     */
    public void setINPUT(java.lang.String INPUT) {
        this.INPUT = INPUT;
    }

    private java.lang.Object __equalsCalc = null;
    public synchronized boolean equals(java.lang.Object obj) {
        if (!(obj instanceof DT_CategoryReq)) return false;
        DT_CategoryReq other = (DT_CategoryReq) obj;
        if (obj == null) return false;
        if (this == obj) return true;
        if (__equalsCalc != null) {
            return (__equalsCalc == obj);
        }
        __equalsCalc = obj;
        boolean _equals;
        _equals = true && 
            ((this.INPUT==null && other.getINPUT()==null) || 
             (this.INPUT!=null &&
              this.INPUT.equals(other.getINPUT())));
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
        if (getINPUT() != null) {
            _hashCode += getINPUT().hashCode();
        }
        __hashCodeCalc = false;
        return _hashCode;
    }

    // Type metadata
    private static org.apache.axis.description.TypeDesc typeDesc =
        new org.apache.axis.description.TypeDesc(DT_CategoryReq.class, true);

    static {
        typeDesc.setXmlType(new javax.xml.namespace.QName("urn:ecc:rvs:mastdata", "DT_CategoryReq"));
        org.apache.axis.description.ElementDesc elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("INPUT");
        elemField.setXmlName(new javax.xml.namespace.QName("", "INPUT"));
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
