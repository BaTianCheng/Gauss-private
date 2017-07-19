/**
 * ZFM_INT_BW006.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package com.esb.jinying.sap.functions.rfc.sap.document.sap_com;

public class ZFM_INT_BW006  implements java.io.Serializable {
    private java.lang.String COMP_CODE;

    private com.esb.jinying.sap.functions.rfc.sap.document.sap_com.Date PSTNG_DATE;

    private com.esb.jinying.sap.functions.rfc.sap.document.sap_com._BIC_AZZCSSJ00[] TAB;

    public ZFM_INT_BW006() {
    }

    public ZFM_INT_BW006(
           java.lang.String COMP_CODE,
           com.esb.jinying.sap.functions.rfc.sap.document.sap_com.Date PSTNG_DATE,
           com.esb.jinying.sap.functions.rfc.sap.document.sap_com._BIC_AZZCSSJ00[] TAB) {
           this.COMP_CODE = COMP_CODE;
           this.PSTNG_DATE = PSTNG_DATE;
           this.TAB = TAB;
    }


    /**
     * Gets the COMP_CODE value for this ZFM_INT_BW006.
     * 
     * @return COMP_CODE
     */
    public java.lang.String getCOMP_CODE() {
        return COMP_CODE;
    }


    /**
     * Sets the COMP_CODE value for this ZFM_INT_BW006.
     * 
     * @param COMP_CODE
     */
    public void setCOMP_CODE(java.lang.String COMP_CODE) {
        this.COMP_CODE = COMP_CODE;
    }


    /**
     * Gets the PSTNG_DATE value for this ZFM_INT_BW006.
     * 
     * @return PSTNG_DATE
     */
    public com.esb.jinying.sap.functions.rfc.sap.document.sap_com.Date getPSTNG_DATE() {
        return PSTNG_DATE;
    }


    /**
     * Sets the PSTNG_DATE value for this ZFM_INT_BW006.
     * 
     * @param PSTNG_DATE
     */
    public void setPSTNG_DATE(com.esb.jinying.sap.functions.rfc.sap.document.sap_com.Date PSTNG_DATE) {
        this.PSTNG_DATE = PSTNG_DATE;
    }


    /**
     * Gets the TAB value for this ZFM_INT_BW006.
     * 
     * @return TAB
     */
    public com.esb.jinying.sap.functions.rfc.sap.document.sap_com._BIC_AZZCSSJ00[] getTAB() {
        return TAB;
    }


    /**
     * Sets the TAB value for this ZFM_INT_BW006.
     * 
     * @param TAB
     */
    public void setTAB(com.esb.jinying.sap.functions.rfc.sap.document.sap_com._BIC_AZZCSSJ00[] TAB) {
        this.TAB = TAB;
    }

    private java.lang.Object __equalsCalc = null;
    public synchronized boolean equals(java.lang.Object obj) {
        if (!(obj instanceof ZFM_INT_BW006)) return false;
        ZFM_INT_BW006 other = (ZFM_INT_BW006) obj;
        if (obj == null) return false;
        if (this == obj) return true;
        if (__equalsCalc != null) {
            return (__equalsCalc == obj);
        }
        __equalsCalc = obj;
        boolean _equals;
        _equals = true && 
            ((this.COMP_CODE==null && other.getCOMP_CODE()==null) || 
             (this.COMP_CODE!=null &&
              this.COMP_CODE.equals(other.getCOMP_CODE()))) &&
            ((this.PSTNG_DATE==null && other.getPSTNG_DATE()==null) || 
             (this.PSTNG_DATE!=null &&
              this.PSTNG_DATE.equals(other.getPSTNG_DATE()))) &&
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
        if (getCOMP_CODE() != null) {
            _hashCode += getCOMP_CODE().hashCode();
        }
        if (getPSTNG_DATE() != null) {
            _hashCode += getPSTNG_DATE().hashCode();
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
        new org.apache.axis.description.TypeDesc(ZFM_INT_BW006.class, true);

    static {
        typeDesc.setXmlType(new javax.xml.namespace.QName("urn:sap-com:document:sap:rfc:functions", ">ZFM_INT_BW006"));
        org.apache.axis.description.ElementDesc elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("COMP_CODE");
        elemField.setXmlName(new javax.xml.namespace.QName("", "COMP_CODE"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("PSTNG_DATE");
        elemField.setXmlName(new javax.xml.namespace.QName("", "PSTNG_DATE"));
        elemField.setXmlType(new javax.xml.namespace.QName("urn:sap-com:document:sap:rfc:functions", "date"));
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("TAB");
        elemField.setXmlName(new javax.xml.namespace.QName("", "TAB"));
        elemField.setXmlType(new javax.xml.namespace.QName("urn:sap-com:document:sap:rfc:functions", "_-BIC_-AZZCSSJ00"));
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
