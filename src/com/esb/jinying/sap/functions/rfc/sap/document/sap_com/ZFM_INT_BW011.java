/**
 * ZFM_INT_BW011.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package com.esb.jinying.sap.functions.rfc.sap.document.sap_com;

public class ZFM_INT_BW011  implements java.io.Serializable {
    private java.lang.String i_YM;

    private com.esb.jinying.sap.functions.rfc.sap.document.sap_com._BIC_AZHBRANDD00[] TAB1;

    private com.esb.jinying.sap.functions.rfc.sap.document.sap_com._BIC_AZHBRANDS00[] TAB2;

    public ZFM_INT_BW011() {
    }

    public ZFM_INT_BW011(
           java.lang.String i_YM,
           com.esb.jinying.sap.functions.rfc.sap.document.sap_com._BIC_AZHBRANDD00[] TAB1,
           com.esb.jinying.sap.functions.rfc.sap.document.sap_com._BIC_AZHBRANDS00[] TAB2) {
           this.i_YM = i_YM;
           this.TAB1 = TAB1;
           this.TAB2 = TAB2;
    }


    /**
     * Gets the i_YM value for this ZFM_INT_BW011.
     * 
     * @return i_YM
     */
    public java.lang.String getI_YM() {
        return i_YM;
    }


    /**
     * Sets the i_YM value for this ZFM_INT_BW011.
     * 
     * @param i_YM
     */
    public void setI_YM(java.lang.String i_YM) {
        this.i_YM = i_YM;
    }


    /**
     * Gets the TAB1 value for this ZFM_INT_BW011.
     * 
     * @return TAB1
     */
    public com.esb.jinying.sap.functions.rfc.sap.document.sap_com._BIC_AZHBRANDD00[] getTAB1() {
        return TAB1;
    }


    /**
     * Sets the TAB1 value for this ZFM_INT_BW011.
     * 
     * @param TAB1
     */
    public void setTAB1(com.esb.jinying.sap.functions.rfc.sap.document.sap_com._BIC_AZHBRANDD00[] TAB1) {
        this.TAB1 = TAB1;
    }


    /**
     * Gets the TAB2 value for this ZFM_INT_BW011.
     * 
     * @return TAB2
     */
    public com.esb.jinying.sap.functions.rfc.sap.document.sap_com._BIC_AZHBRANDS00[] getTAB2() {
        return TAB2;
    }


    /**
     * Sets the TAB2 value for this ZFM_INT_BW011.
     * 
     * @param TAB2
     */
    public void setTAB2(com.esb.jinying.sap.functions.rfc.sap.document.sap_com._BIC_AZHBRANDS00[] TAB2) {
        this.TAB2 = TAB2;
    }

    private java.lang.Object __equalsCalc = null;
    public synchronized boolean equals(java.lang.Object obj) {
        if (!(obj instanceof ZFM_INT_BW011)) return false;
        ZFM_INT_BW011 other = (ZFM_INT_BW011) obj;
        if (obj == null) return false;
        if (this == obj) return true;
        if (__equalsCalc != null) {
            return (__equalsCalc == obj);
        }
        __equalsCalc = obj;
        boolean _equals;
        _equals = true && 
            ((this.i_YM==null && other.getI_YM()==null) || 
             (this.i_YM!=null &&
              this.i_YM.equals(other.getI_YM()))) &&
            ((this.TAB1==null && other.getTAB1()==null) || 
             (this.TAB1!=null &&
              java.util.Arrays.equals(this.TAB1, other.getTAB1()))) &&
            ((this.TAB2==null && other.getTAB2()==null) || 
             (this.TAB2!=null &&
              java.util.Arrays.equals(this.TAB2, other.getTAB2())));
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
        if (getI_YM() != null) {
            _hashCode += getI_YM().hashCode();
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
        if (getTAB2() != null) {
            for (int i=0;
                 i<java.lang.reflect.Array.getLength(getTAB2());
                 i++) {
                java.lang.Object obj = java.lang.reflect.Array.get(getTAB2(), i);
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
        new org.apache.axis.description.TypeDesc(ZFM_INT_BW011.class, true);

    static {
        typeDesc.setXmlType(new javax.xml.namespace.QName("urn:sap-com:document:sap:rfc:functions", ">ZFM_INT_BW011"));
        org.apache.axis.description.ElementDesc elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("i_YM");
        elemField.setXmlName(new javax.xml.namespace.QName("", "I_YM"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("TAB1");
        elemField.setXmlName(new javax.xml.namespace.QName("", "TAB1"));
        elemField.setXmlType(new javax.xml.namespace.QName("urn:sap-com:document:sap:rfc:functions", "_-BIC_-AZHBRANDD00"));
        elemField.setNillable(false);
        elemField.setItemQName(new javax.xml.namespace.QName("", "item"));
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("TAB2");
        elemField.setXmlName(new javax.xml.namespace.QName("", "TAB2"));
        elemField.setXmlType(new javax.xml.namespace.QName("urn:sap-com:document:sap:rfc:functions", "_-BIC_-AZHBRANDS00"));
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
