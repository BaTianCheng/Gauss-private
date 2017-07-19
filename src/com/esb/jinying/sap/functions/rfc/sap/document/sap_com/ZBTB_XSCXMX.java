/**
 * ZBTB_XSCXMX.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package com.esb.jinying.sap.functions.rfc.sap.document.sap_com;

public class ZBTB_XSCXMX  implements java.io.Serializable {
    private java.lang.String ZPL;

    private java.lang.String ZWLCODE;

    private java.lang.String ZWL;

    private java.lang.String ZLSDJ;

    private java.lang.String ZLSJE;

    private java.lang.String ZSXJE;

    private java.lang.String ZZZK;

    private java.lang.String ZXSSL;

    public ZBTB_XSCXMX() {
    }

    public ZBTB_XSCXMX(
           java.lang.String ZPL,
           java.lang.String ZWLCODE,
           java.lang.String ZWL,
           java.lang.String ZLSDJ,
           java.lang.String ZLSJE,
           java.lang.String ZSXJE,
           java.lang.String ZZZK,
           java.lang.String ZXSSL) {
           this.ZPL = ZPL;
           this.ZWLCODE = ZWLCODE;
           this.ZWL = ZWL;
           this.ZLSDJ = ZLSDJ;
           this.ZLSJE = ZLSJE;
           this.ZSXJE = ZSXJE;
           this.ZZZK = ZZZK;
           this.ZXSSL = ZXSSL;
    }


    /**
     * Gets the ZPL value for this ZBTB_XSCXMX.
     * 
     * @return ZPL
     */
    public java.lang.String getZPL() {
        return ZPL;
    }


    /**
     * Sets the ZPL value for this ZBTB_XSCXMX.
     * 
     * @param ZPL
     */
    public void setZPL(java.lang.String ZPL) {
        this.ZPL = ZPL;
    }


    /**
     * Gets the ZWLCODE value for this ZBTB_XSCXMX.
     * 
     * @return ZWLCODE
     */
    public java.lang.String getZWLCODE() {
        return ZWLCODE;
    }


    /**
     * Sets the ZWLCODE value for this ZBTB_XSCXMX.
     * 
     * @param ZWLCODE
     */
    public void setZWLCODE(java.lang.String ZWLCODE) {
        this.ZWLCODE = ZWLCODE;
    }


    /**
     * Gets the ZWL value for this ZBTB_XSCXMX.
     * 
     * @return ZWL
     */
    public java.lang.String getZWL() {
        return ZWL;
    }


    /**
     * Sets the ZWL value for this ZBTB_XSCXMX.
     * 
     * @param ZWL
     */
    public void setZWL(java.lang.String ZWL) {
        this.ZWL = ZWL;
    }


    /**
     * Gets the ZLSDJ value for this ZBTB_XSCXMX.
     * 
     * @return ZLSDJ
     */
    public java.lang.String getZLSDJ() {
        return ZLSDJ;
    }


    /**
     * Sets the ZLSDJ value for this ZBTB_XSCXMX.
     * 
     * @param ZLSDJ
     */
    public void setZLSDJ(java.lang.String ZLSDJ) {
        this.ZLSDJ = ZLSDJ;
    }


    /**
     * Gets the ZLSJE value for this ZBTB_XSCXMX.
     * 
     * @return ZLSJE
     */
    public java.lang.String getZLSJE() {
        return ZLSJE;
    }


    /**
     * Sets the ZLSJE value for this ZBTB_XSCXMX.
     * 
     * @param ZLSJE
     */
    public void setZLSJE(java.lang.String ZLSJE) {
        this.ZLSJE = ZLSJE;
    }


    /**
     * Gets the ZSXJE value for this ZBTB_XSCXMX.
     * 
     * @return ZSXJE
     */
    public java.lang.String getZSXJE() {
        return ZSXJE;
    }


    /**
     * Sets the ZSXJE value for this ZBTB_XSCXMX.
     * 
     * @param ZSXJE
     */
    public void setZSXJE(java.lang.String ZSXJE) {
        this.ZSXJE = ZSXJE;
    }


    /**
     * Gets the ZZZK value for this ZBTB_XSCXMX.
     * 
     * @return ZZZK
     */
    public java.lang.String getZZZK() {
        return ZZZK;
    }


    /**
     * Sets the ZZZK value for this ZBTB_XSCXMX.
     * 
     * @param ZZZK
     */
    public void setZZZK(java.lang.String ZZZK) {
        this.ZZZK = ZZZK;
    }


    /**
     * Gets the ZXSSL value for this ZBTB_XSCXMX.
     * 
     * @return ZXSSL
     */
    public java.lang.String getZXSSL() {
        return ZXSSL;
    }


    /**
     * Sets the ZXSSL value for this ZBTB_XSCXMX.
     * 
     * @param ZXSSL
     */
    public void setZXSSL(java.lang.String ZXSSL) {
        this.ZXSSL = ZXSSL;
    }

    private java.lang.Object __equalsCalc = null;
    public synchronized boolean equals(java.lang.Object obj) {
        if (!(obj instanceof ZBTB_XSCXMX)) return false;
        ZBTB_XSCXMX other = (ZBTB_XSCXMX) obj;
        if (obj == null) return false;
        if (this == obj) return true;
        if (__equalsCalc != null) {
            return (__equalsCalc == obj);
        }
        __equalsCalc = obj;
        boolean _equals;
        _equals = true && 
            ((this.ZPL==null && other.getZPL()==null) || 
             (this.ZPL!=null &&
              this.ZPL.equals(other.getZPL()))) &&
            ((this.ZWLCODE==null && other.getZWLCODE()==null) || 
             (this.ZWLCODE!=null &&
              this.ZWLCODE.equals(other.getZWLCODE()))) &&
            ((this.ZWL==null && other.getZWL()==null) || 
             (this.ZWL!=null &&
              this.ZWL.equals(other.getZWL()))) &&
            ((this.ZLSDJ==null && other.getZLSDJ()==null) || 
             (this.ZLSDJ!=null &&
              this.ZLSDJ.equals(other.getZLSDJ()))) &&
            ((this.ZLSJE==null && other.getZLSJE()==null) || 
             (this.ZLSJE!=null &&
              this.ZLSJE.equals(other.getZLSJE()))) &&
            ((this.ZSXJE==null && other.getZSXJE()==null) || 
             (this.ZSXJE!=null &&
              this.ZSXJE.equals(other.getZSXJE()))) &&
            ((this.ZZZK==null && other.getZZZK()==null) || 
             (this.ZZZK!=null &&
              this.ZZZK.equals(other.getZZZK()))) &&
            ((this.ZXSSL==null && other.getZXSSL()==null) || 
             (this.ZXSSL!=null &&
              this.ZXSSL.equals(other.getZXSSL())));
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
        if (getZPL() != null) {
            _hashCode += getZPL().hashCode();
        }
        if (getZWLCODE() != null) {
            _hashCode += getZWLCODE().hashCode();
        }
        if (getZWL() != null) {
            _hashCode += getZWL().hashCode();
        }
        if (getZLSDJ() != null) {
            _hashCode += getZLSDJ().hashCode();
        }
        if (getZLSJE() != null) {
            _hashCode += getZLSJE().hashCode();
        }
        if (getZSXJE() != null) {
            _hashCode += getZSXJE().hashCode();
        }
        if (getZZZK() != null) {
            _hashCode += getZZZK().hashCode();
        }
        if (getZXSSL() != null) {
            _hashCode += getZXSSL().hashCode();
        }
        __hashCodeCalc = false;
        return _hashCode;
    }

    // Type metadata
    private static org.apache.axis.description.TypeDesc typeDesc =
        new org.apache.axis.description.TypeDesc(ZBTB_XSCXMX.class, true);

    static {
        typeDesc.setXmlType(new javax.xml.namespace.QName("urn:sap-com:document:sap:rfc:functions", "ZBTB_XSCXMX"));
        org.apache.axis.description.ElementDesc elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("ZPL");
        elemField.setXmlName(new javax.xml.namespace.QName("", "ZPL"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("ZWLCODE");
        elemField.setXmlName(new javax.xml.namespace.QName("", "ZWLCODE"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("ZWL");
        elemField.setXmlName(new javax.xml.namespace.QName("", "ZWL"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("ZLSDJ");
        elemField.setXmlName(new javax.xml.namespace.QName("", "ZLSDJ"));
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
        elemField.setFieldName("ZZZK");
        elemField.setXmlName(new javax.xml.namespace.QName("", "ZZZK"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("ZXSSL");
        elemField.setXmlName(new javax.xml.namespace.QName("", "ZXSSL"));
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
