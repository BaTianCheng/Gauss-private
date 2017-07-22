/**
 * ZBTB_XPMX.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package com.esb.jinying.sap.functions.rfc.sap.document.sap_com;

public class ZBTB_XPMX  implements java.io.Serializable {
    private java.lang.String ZMTRL_TEXT;

    private java.lang.String ZJYBH;

    private java.lang.String ZLSJE;

    private java.lang.String ZSXJE;

    private java.lang.String ZJYSL;

    public ZBTB_XPMX() {
    }

    public ZBTB_XPMX(
           java.lang.String ZMTRL_TEXT,
           java.lang.String ZJYBH,
           java.lang.String ZLSJE,
           java.lang.String ZSXJE,
           java.lang.String ZJYSL) {
           this.ZMTRL_TEXT = ZMTRL_TEXT;
           this.ZJYBH = ZJYBH;
           this.ZLSJE = ZLSJE;
           this.ZSXJE = ZSXJE;
           this.ZJYSL = ZJYSL;
    }


    /**
     * Gets the ZMTRL_TEXT value for this ZBTB_XPMX.
     * 
     * @return ZMTRL_TEXT
     */
    public java.lang.String getZMTRL_TEXT() {
        return ZMTRL_TEXT;
    }


    /**
     * Sets the ZMTRL_TEXT value for this ZBTB_XPMX.
     * 
     * @param ZMTRL_TEXT
     */
    public void setZMTRL_TEXT(java.lang.String ZMTRL_TEXT) {
        this.ZMTRL_TEXT = ZMTRL_TEXT;
    }


    /**
     * Gets the ZJYBH value for this ZBTB_XPMX.
     * 
     * @return ZJYBH
     */
    public java.lang.String getZJYBH() {
        return ZJYBH;
    }


    /**
     * Sets the ZJYBH value for this ZBTB_XPMX.
     * 
     * @param ZJYBH
     */
    public void setZJYBH(java.lang.String ZJYBH) {
        this.ZJYBH = ZJYBH;
    }


    /**
     * Gets the ZLSJE value for this ZBTB_XPMX.
     * 
     * @return ZLSJE
     */
    public java.lang.String getZLSJE() {
        return ZLSJE;
    }


    /**
     * Sets the ZLSJE value for this ZBTB_XPMX.
     * 
     * @param ZLSJE
     */
    public void setZLSJE(java.lang.String ZLSJE) {
        this.ZLSJE = ZLSJE;
    }


    /**
     * Gets the ZSXJE value for this ZBTB_XPMX.
     * 
     * @return ZSXJE
     */
    public java.lang.String getZSXJE() {
        return ZSXJE;
    }


    /**
     * Sets the ZSXJE value for this ZBTB_XPMX.
     * 
     * @param ZSXJE
     */
    public void setZSXJE(java.lang.String ZSXJE) {
        this.ZSXJE = ZSXJE;
    }


    /**
     * Gets the ZJYSL value for this ZBTB_XPMX.
     * 
     * @return ZJYSL
     */
    public java.lang.String getZJYSL() {
        return ZJYSL;
    }


    /**
     * Sets the ZJYSL value for this ZBTB_XPMX.
     * 
     * @param ZJYSL
     */
    public void setZJYSL(java.lang.String ZJYSL) {
        this.ZJYSL = ZJYSL;
    }

    private java.lang.Object __equalsCalc = null;
    public synchronized boolean equals(java.lang.Object obj) {
        if (!(obj instanceof ZBTB_XPMX)) return false;
        ZBTB_XPMX other = (ZBTB_XPMX) obj;
        if (obj == null) return false;
        if (this == obj) return true;
        if (__equalsCalc != null) {
            return (__equalsCalc == obj);
        }
        __equalsCalc = obj;
        boolean _equals;
        _equals = true && 
            ((this.ZMTRL_TEXT==null && other.getZMTRL_TEXT()==null) || 
             (this.ZMTRL_TEXT!=null &&
              this.ZMTRL_TEXT.equals(other.getZMTRL_TEXT()))) &&
            ((this.ZJYBH==null && other.getZJYBH()==null) || 
             (this.ZJYBH!=null &&
              this.ZJYBH.equals(other.getZJYBH()))) &&
            ((this.ZLSJE==null && other.getZLSJE()==null) || 
             (this.ZLSJE!=null &&
              this.ZLSJE.equals(other.getZLSJE()))) &&
            ((this.ZSXJE==null && other.getZSXJE()==null) || 
             (this.ZSXJE!=null &&
              this.ZSXJE.equals(other.getZSXJE()))) &&
            ((this.ZJYSL==null && other.getZJYSL()==null) || 
             (this.ZJYSL!=null &&
              this.ZJYSL.equals(other.getZJYSL())));
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
        if (getZMTRL_TEXT() != null) {
            _hashCode += getZMTRL_TEXT().hashCode();
        }
        if (getZJYBH() != null) {
            _hashCode += getZJYBH().hashCode();
        }
        if (getZLSJE() != null) {
            _hashCode += getZLSJE().hashCode();
        }
        if (getZSXJE() != null) {
            _hashCode += getZSXJE().hashCode();
        }
        if (getZJYSL() != null) {
            _hashCode += getZJYSL().hashCode();
        }
        __hashCodeCalc = false;
        return _hashCode;
    }

    // Type metadata
    private static org.apache.axis.description.TypeDesc typeDesc =
        new org.apache.axis.description.TypeDesc(ZBTB_XPMX.class, true);

    static {
        typeDesc.setXmlType(new javax.xml.namespace.QName("urn:sap-com:document:sap:rfc:functions", "ZBTB_XPMX"));
        org.apache.axis.description.ElementDesc elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("ZMTRL_TEXT");
        elemField.setXmlName(new javax.xml.namespace.QName("", "ZMTRL_TEXT"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("ZJYBH");
        elemField.setXmlName(new javax.xml.namespace.QName("", "ZJYBH"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("ZLSJE");
        elemField.setXmlName(new javax.xml.namespace.QName("", "ZLSJE"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("ZSXJE");
        elemField.setXmlName(new javax.xml.namespace.QName("", "ZSXJE"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("ZJYSL");
        elemField.setXmlName(new javax.xml.namespace.QName("", "ZJYSL"));
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
