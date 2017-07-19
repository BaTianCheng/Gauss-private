/**
 * ZBTB_03.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package com.esb.jinying.sap.functions.rfc.sap.document.sap_com;

public class ZBTB_03  implements java.io.Serializable {
    private java.lang.String ZDATE;

    private java.lang.String ZJYBH;

    private java.lang.String ZJYBS;

    private java.lang.String ZSXJE;

    private java.lang.String ZZKJE;

    private java.lang.String ZZFFSC;

    public ZBTB_03() {
    }

    public ZBTB_03(
           java.lang.String ZDATE,
           java.lang.String ZJYBH,
           java.lang.String ZJYBS,
           java.lang.String ZSXJE,
           java.lang.String ZZKJE,
           java.lang.String ZZFFSC) {
           this.ZDATE = ZDATE;
           this.ZJYBH = ZJYBH;
           this.ZJYBS = ZJYBS;
           this.ZSXJE = ZSXJE;
           this.ZZKJE = ZZKJE;
           this.ZZFFSC = ZZFFSC;
    }


    /**
     * Gets the ZDATE value for this ZBTB_03.
     * 
     * @return ZDATE
     */
    public java.lang.String getZDATE() {
        return ZDATE;
    }


    /**
     * Sets the ZDATE value for this ZBTB_03.
     * 
     * @param ZDATE
     */
    public void setZDATE(java.lang.String ZDATE) {
        this.ZDATE = ZDATE;
    }


    /**
     * Gets the ZJYBH value for this ZBTB_03.
     * 
     * @return ZJYBH
     */
    public java.lang.String getZJYBH() {
        return ZJYBH;
    }


    /**
     * Sets the ZJYBH value for this ZBTB_03.
     * 
     * @param ZJYBH
     */
    public void setZJYBH(java.lang.String ZJYBH) {
        this.ZJYBH = ZJYBH;
    }


    /**
     * Gets the ZJYBS value for this ZBTB_03.
     * 
     * @return ZJYBS
     */
    public java.lang.String getZJYBS() {
        return ZJYBS;
    }


    /**
     * Sets the ZJYBS value for this ZBTB_03.
     * 
     * @param ZJYBS
     */
    public void setZJYBS(java.lang.String ZJYBS) {
        this.ZJYBS = ZJYBS;
    }


    /**
     * Gets the ZSXJE value for this ZBTB_03.
     * 
     * @return ZSXJE
     */
    public java.lang.String getZSXJE() {
        return ZSXJE;
    }


    /**
     * Sets the ZSXJE value for this ZBTB_03.
     * 
     * @param ZSXJE
     */
    public void setZSXJE(java.lang.String ZSXJE) {
        this.ZSXJE = ZSXJE;
    }


    /**
     * Gets the ZZKJE value for this ZBTB_03.
     * 
     * @return ZZKJE
     */
    public java.lang.String getZZKJE() {
        return ZZKJE;
    }


    /**
     * Sets the ZZKJE value for this ZBTB_03.
     * 
     * @param ZZKJE
     */
    public void setZZKJE(java.lang.String ZZKJE) {
        this.ZZKJE = ZZKJE;
    }


    /**
     * Gets the ZZFFSC value for this ZBTB_03.
     * 
     * @return ZZFFSC
     */
    public java.lang.String getZZFFSC() {
        return ZZFFSC;
    }


    /**
     * Sets the ZZFFSC value for this ZBTB_03.
     * 
     * @param ZZFFSC
     */
    public void setZZFFSC(java.lang.String ZZFFSC) {
        this.ZZFFSC = ZZFFSC;
    }

    private java.lang.Object __equalsCalc = null;
    public synchronized boolean equals(java.lang.Object obj) {
        if (!(obj instanceof ZBTB_03)) return false;
        ZBTB_03 other = (ZBTB_03) obj;
        if (obj == null) return false;
        if (this == obj) return true;
        if (__equalsCalc != null) {
            return (__equalsCalc == obj);
        }
        __equalsCalc = obj;
        boolean _equals;
        _equals = true && 
            ((this.ZDATE==null && other.getZDATE()==null) || 
             (this.ZDATE!=null &&
              this.ZDATE.equals(other.getZDATE()))) &&
            ((this.ZJYBH==null && other.getZJYBH()==null) || 
             (this.ZJYBH!=null &&
              this.ZJYBH.equals(other.getZJYBH()))) &&
            ((this.ZJYBS==null && other.getZJYBS()==null) || 
             (this.ZJYBS!=null &&
              this.ZJYBS.equals(other.getZJYBS()))) &&
            ((this.ZSXJE==null && other.getZSXJE()==null) || 
             (this.ZSXJE!=null &&
              this.ZSXJE.equals(other.getZSXJE()))) &&
            ((this.ZZKJE==null && other.getZZKJE()==null) || 
             (this.ZZKJE!=null &&
              this.ZZKJE.equals(other.getZZKJE()))) &&
            ((this.ZZFFSC==null && other.getZZFFSC()==null) || 
             (this.ZZFFSC!=null &&
              this.ZZFFSC.equals(other.getZZFFSC())));
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
        if (getZDATE() != null) {
            _hashCode += getZDATE().hashCode();
        }
        if (getZJYBH() != null) {
            _hashCode += getZJYBH().hashCode();
        }
        if (getZJYBS() != null) {
            _hashCode += getZJYBS().hashCode();
        }
        if (getZSXJE() != null) {
            _hashCode += getZSXJE().hashCode();
        }
        if (getZZKJE() != null) {
            _hashCode += getZZKJE().hashCode();
        }
        if (getZZFFSC() != null) {
            _hashCode += getZZFFSC().hashCode();
        }
        __hashCodeCalc = false;
        return _hashCode;
    }

    // Type metadata
    private static org.apache.axis.description.TypeDesc typeDesc =
        new org.apache.axis.description.TypeDesc(ZBTB_03.class, true);

    static {
        typeDesc.setXmlType(new javax.xml.namespace.QName("urn:sap-com:document:sap:rfc:functions", "ZBTB_03"));
        org.apache.axis.description.ElementDesc elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("ZDATE");
        elemField.setXmlName(new javax.xml.namespace.QName("", "ZDATE"));
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
        elemField.setFieldName("ZJYBS");
        elemField.setXmlName(new javax.xml.namespace.QName("", "ZJYBS"));
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
        elemField.setFieldName("ZZKJE");
        elemField.setXmlName(new javax.xml.namespace.QName("", "ZZKJE"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("ZZFFSC");
        elemField.setXmlName(new javax.xml.namespace.QName("", "ZZFFSC"));
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
