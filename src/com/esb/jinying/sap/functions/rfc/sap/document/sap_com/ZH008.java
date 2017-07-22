/**
 * ZH008.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package com.esb.jinying.sap.functions.rfc.sap.document.sap_com;

public class ZH008  implements java.io.Serializable {
    /* Site */
    private java.lang.String ZWERKS;

    /* Storage Location */
    private java.lang.String ZLGORT;

    /* Article Number */
    private java.lang.String ZMATNR;

    /* Single-Character Indicator */
    private java.lang.String FLAG;

    /* Character field of length 40 */
    private java.lang.String MSG;

    public ZH008() {
    }

    public ZH008(
           java.lang.String ZWERKS,
           java.lang.String ZLGORT,
           java.lang.String ZMATNR,
           java.lang.String FLAG,
           java.lang.String MSG) {
           this.ZWERKS = ZWERKS;
           this.ZLGORT = ZLGORT;
           this.ZMATNR = ZMATNR;
           this.FLAG = FLAG;
           this.MSG = MSG;
    }


    /**
     * Gets the ZWERKS value for this ZH008.
     * 
     * @return ZWERKS   * Site
     */
    public java.lang.String getZWERKS() {
        return ZWERKS;
    }


    /**
     * Sets the ZWERKS value for this ZH008.
     * 
     * @param ZWERKS   * Site
     */
    public void setZWERKS(java.lang.String ZWERKS) {
        this.ZWERKS = ZWERKS;
    }


    /**
     * Gets the ZLGORT value for this ZH008.
     * 
     * @return ZLGORT   * Storage Location
     */
    public java.lang.String getZLGORT() {
        return ZLGORT;
    }


    /**
     * Sets the ZLGORT value for this ZH008.
     * 
     * @param ZLGORT   * Storage Location
     */
    public void setZLGORT(java.lang.String ZLGORT) {
        this.ZLGORT = ZLGORT;
    }


    /**
     * Gets the ZMATNR value for this ZH008.
     * 
     * @return ZMATNR   * Article Number
     */
    public java.lang.String getZMATNR() {
        return ZMATNR;
    }


    /**
     * Sets the ZMATNR value for this ZH008.
     * 
     * @param ZMATNR   * Article Number
     */
    public void setZMATNR(java.lang.String ZMATNR) {
        this.ZMATNR = ZMATNR;
    }


    /**
     * Gets the FLAG value for this ZH008.
     * 
     * @return FLAG   * Single-Character Indicator
     */
    public java.lang.String getFLAG() {
        return FLAG;
    }


    /**
     * Sets the FLAG value for this ZH008.
     * 
     * @param FLAG   * Single-Character Indicator
     */
    public void setFLAG(java.lang.String FLAG) {
        this.FLAG = FLAG;
    }


    /**
     * Gets the MSG value for this ZH008.
     * 
     * @return MSG   * Character field of length 40
     */
    public java.lang.String getMSG() {
        return MSG;
    }


    /**
     * Sets the MSG value for this ZH008.
     * 
     * @param MSG   * Character field of length 40
     */
    public void setMSG(java.lang.String MSG) {
        this.MSG = MSG;
    }

    private java.lang.Object __equalsCalc = null;
    public synchronized boolean equals(java.lang.Object obj) {
        if (!(obj instanceof ZH008)) return false;
        ZH008 other = (ZH008) obj;
        if (obj == null) return false;
        if (this == obj) return true;
        if (__equalsCalc != null) {
            return (__equalsCalc == obj);
        }
        __equalsCalc = obj;
        boolean _equals;
        _equals = true && 
            ((this.ZWERKS==null && other.getZWERKS()==null) || 
             (this.ZWERKS!=null &&
              this.ZWERKS.equals(other.getZWERKS()))) &&
            ((this.ZLGORT==null && other.getZLGORT()==null) || 
             (this.ZLGORT!=null &&
              this.ZLGORT.equals(other.getZLGORT()))) &&
            ((this.ZMATNR==null && other.getZMATNR()==null) || 
             (this.ZMATNR!=null &&
              this.ZMATNR.equals(other.getZMATNR()))) &&
            ((this.FLAG==null && other.getFLAG()==null) || 
             (this.FLAG!=null &&
              this.FLAG.equals(other.getFLAG()))) &&
            ((this.MSG==null && other.getMSG()==null) || 
             (this.MSG!=null &&
              this.MSG.equals(other.getMSG())));
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
        if (getZWERKS() != null) {
            _hashCode += getZWERKS().hashCode();
        }
        if (getZLGORT() != null) {
            _hashCode += getZLGORT().hashCode();
        }
        if (getZMATNR() != null) {
            _hashCode += getZMATNR().hashCode();
        }
        if (getFLAG() != null) {
            _hashCode += getFLAG().hashCode();
        }
        if (getMSG() != null) {
            _hashCode += getMSG().hashCode();
        }
        __hashCodeCalc = false;
        return _hashCode;
    }

    // Type metadata
    private static org.apache.axis.description.TypeDesc typeDesc =
        new org.apache.axis.description.TypeDesc(ZH008.class, true);

    static {
        typeDesc.setXmlType(new javax.xml.namespace.QName("urn:sap-com:document:sap:rfc:functions", "ZH008"));
        org.apache.axis.description.ElementDesc elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("ZWERKS");
        elemField.setXmlName(new javax.xml.namespace.QName("", "ZWERKS"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("ZLGORT");
        elemField.setXmlName(new javax.xml.namespace.QName("", "ZLGORT"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("ZMATNR");
        elemField.setXmlName(new javax.xml.namespace.QName("", "ZMATNR"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("FLAG");
        elemField.setXmlName(new javax.xml.namespace.QName("", "FLAG"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("MSG");
        elemField.setXmlName(new javax.xml.namespace.QName("", "MSG"));
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
