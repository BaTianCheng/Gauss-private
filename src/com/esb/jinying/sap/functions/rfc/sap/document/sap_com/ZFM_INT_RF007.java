/**
 * ZFM_INT_RF007.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package com.esb.jinying.sap.functions.rfc.sap.document.sap_com;

public class ZFM_INT_RF007  implements java.io.Serializable {
    private java.lang.String GJAHR;

    private java.lang.String IBLNR;

    private java.lang.String INVNU;

    private com.esb.jinying.sap.functions.rfc.sap.document.sap_com.ZSRF007_HEAD[] TAB0;

    private com.esb.jinying.sap.functions.rfc.sap.document.sap_com.ZS0007[] TAB1;

    private com.esb.jinying.sap.functions.rfc.sap.document.sap_com.ZS0008[] TAB2;

    public ZFM_INT_RF007() {
    }

    public ZFM_INT_RF007(
           java.lang.String GJAHR,
           java.lang.String IBLNR,
           java.lang.String INVNU,
           com.esb.jinying.sap.functions.rfc.sap.document.sap_com.ZSRF007_HEAD[] TAB0,
           com.esb.jinying.sap.functions.rfc.sap.document.sap_com.ZS0007[] TAB1,
           com.esb.jinying.sap.functions.rfc.sap.document.sap_com.ZS0008[] TAB2) {
           this.GJAHR = GJAHR;
           this.IBLNR = IBLNR;
           this.INVNU = INVNU;
           this.TAB0 = TAB0;
           this.TAB1 = TAB1;
           this.TAB2 = TAB2;
    }


    /**
     * Gets the GJAHR value for this ZFM_INT_RF007.
     * 
     * @return GJAHR
     */
    public java.lang.String getGJAHR() {
        return GJAHR;
    }


    /**
     * Sets the GJAHR value for this ZFM_INT_RF007.
     * 
     * @param GJAHR
     */
    public void setGJAHR(java.lang.String GJAHR) {
        this.GJAHR = GJAHR;
    }


    /**
     * Gets the IBLNR value for this ZFM_INT_RF007.
     * 
     * @return IBLNR
     */
    public java.lang.String getIBLNR() {
        return IBLNR;
    }


    /**
     * Sets the IBLNR value for this ZFM_INT_RF007.
     * 
     * @param IBLNR
     */
    public void setIBLNR(java.lang.String IBLNR) {
        this.IBLNR = IBLNR;
    }


    /**
     * Gets the INVNU value for this ZFM_INT_RF007.
     * 
     * @return INVNU
     */
    public java.lang.String getINVNU() {
        return INVNU;
    }


    /**
     * Sets the INVNU value for this ZFM_INT_RF007.
     * 
     * @param INVNU
     */
    public void setINVNU(java.lang.String INVNU) {
        this.INVNU = INVNU;
    }


    /**
     * Gets the TAB0 value for this ZFM_INT_RF007.
     * 
     * @return TAB0
     */
    public com.esb.jinying.sap.functions.rfc.sap.document.sap_com.ZSRF007_HEAD[] getTAB0() {
        return TAB0;
    }


    /**
     * Sets the TAB0 value for this ZFM_INT_RF007.
     * 
     * @param TAB0
     */
    public void setTAB0(com.esb.jinying.sap.functions.rfc.sap.document.sap_com.ZSRF007_HEAD[] TAB0) {
        this.TAB0 = TAB0;
    }


    /**
     * Gets the TAB1 value for this ZFM_INT_RF007.
     * 
     * @return TAB1
     */
    public com.esb.jinying.sap.functions.rfc.sap.document.sap_com.ZS0007[] getTAB1() {
        return TAB1;
    }


    /**
     * Sets the TAB1 value for this ZFM_INT_RF007.
     * 
     * @param TAB1
     */
    public void setTAB1(com.esb.jinying.sap.functions.rfc.sap.document.sap_com.ZS0007[] TAB1) {
        this.TAB1 = TAB1;
    }


    /**
     * Gets the TAB2 value for this ZFM_INT_RF007.
     * 
     * @return TAB2
     */
    public com.esb.jinying.sap.functions.rfc.sap.document.sap_com.ZS0008[] getTAB2() {
        return TAB2;
    }


    /**
     * Sets the TAB2 value for this ZFM_INT_RF007.
     * 
     * @param TAB2
     */
    public void setTAB2(com.esb.jinying.sap.functions.rfc.sap.document.sap_com.ZS0008[] TAB2) {
        this.TAB2 = TAB2;
    }

    private java.lang.Object __equalsCalc = null;
    public synchronized boolean equals(java.lang.Object obj) {
        if (!(obj instanceof ZFM_INT_RF007)) return false;
        ZFM_INT_RF007 other = (ZFM_INT_RF007) obj;
        if (obj == null) return false;
        if (this == obj) return true;
        if (__equalsCalc != null) {
            return (__equalsCalc == obj);
        }
        __equalsCalc = obj;
        boolean _equals;
        _equals = true && 
            ((this.GJAHR==null && other.getGJAHR()==null) || 
             (this.GJAHR!=null &&
              this.GJAHR.equals(other.getGJAHR()))) &&
            ((this.IBLNR==null && other.getIBLNR()==null) || 
             (this.IBLNR!=null &&
              this.IBLNR.equals(other.getIBLNR()))) &&
            ((this.INVNU==null && other.getINVNU()==null) || 
             (this.INVNU!=null &&
              this.INVNU.equals(other.getINVNU()))) &&
            ((this.TAB0==null && other.getTAB0()==null) || 
             (this.TAB0!=null &&
              java.util.Arrays.equals(this.TAB0, other.getTAB0()))) &&
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
        if (getGJAHR() != null) {
            _hashCode += getGJAHR().hashCode();
        }
        if (getIBLNR() != null) {
            _hashCode += getIBLNR().hashCode();
        }
        if (getINVNU() != null) {
            _hashCode += getINVNU().hashCode();
        }
        if (getTAB0() != null) {
            for (int i=0;
                 i<java.lang.reflect.Array.getLength(getTAB0());
                 i++) {
                java.lang.Object obj = java.lang.reflect.Array.get(getTAB0(), i);
                if (obj != null &&
                    !obj.getClass().isArray()) {
                    _hashCode += obj.hashCode();
                }
            }
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
        new org.apache.axis.description.TypeDesc(ZFM_INT_RF007.class, true);

    static {
        typeDesc.setXmlType(new javax.xml.namespace.QName("urn:sap-com:document:sap:rfc:functions", ">ZFM_INT_RF007"));
        org.apache.axis.description.ElementDesc elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("GJAHR");
        elemField.setXmlName(new javax.xml.namespace.QName("", "GJAHR"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("IBLNR");
        elemField.setXmlName(new javax.xml.namespace.QName("", "IBLNR"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("INVNU");
        elemField.setXmlName(new javax.xml.namespace.QName("", "INVNU"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("TAB0");
        elemField.setXmlName(new javax.xml.namespace.QName("", "TAB0"));
        elemField.setXmlType(new javax.xml.namespace.QName("urn:sap-com:document:sap:rfc:functions", "ZSRF007_HEAD"));
        elemField.setNillable(false);
        elemField.setItemQName(new javax.xml.namespace.QName("", "item"));
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("TAB1");
        elemField.setXmlName(new javax.xml.namespace.QName("", "TAB1"));
        elemField.setXmlType(new javax.xml.namespace.QName("urn:sap-com:document:sap:rfc:functions", "ZS0007"));
        elemField.setNillable(false);
        elemField.setItemQName(new javax.xml.namespace.QName("", "item"));
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("TAB2");
        elemField.setXmlName(new javax.xml.namespace.QName("", "TAB2"));
        elemField.setXmlType(new javax.xml.namespace.QName("urn:sap-com:document:sap:rfc:functions", "ZS0008"));
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
