/**
 * ZSDPMESS.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package com.esb.jinying.sap.functions.rfc.sap.document.sap_com;

public class ZSDPMESS  implements java.io.Serializable {
    private java.lang.String GLIDE_NO;

    private java.lang.String SEQ_NO;

    /* Article Number */
    private java.lang.String MATNR;

    private java.lang.String TYPE;

    private java.lang.String MESS;

    public ZSDPMESS() {
    }

    public ZSDPMESS(
           java.lang.String GLIDE_NO,
           java.lang.String SEQ_NO,
           java.lang.String MATNR,
           java.lang.String TYPE,
           java.lang.String MESS) {
           this.GLIDE_NO = GLIDE_NO;
           this.SEQ_NO = SEQ_NO;
           this.MATNR = MATNR;
           this.TYPE = TYPE;
           this.MESS = MESS;
    }


    /**
     * Gets the GLIDE_NO value for this ZSDPMESS.
     * 
     * @return GLIDE_NO
     */
    public java.lang.String getGLIDE_NO() {
        return GLIDE_NO;
    }


    /**
     * Sets the GLIDE_NO value for this ZSDPMESS.
     * 
     * @param GLIDE_NO
     */
    public void setGLIDE_NO(java.lang.String GLIDE_NO) {
        this.GLIDE_NO = GLIDE_NO;
    }


    /**
     * Gets the SEQ_NO value for this ZSDPMESS.
     * 
     * @return SEQ_NO
     */
    public java.lang.String getSEQ_NO() {
        return SEQ_NO;
    }


    /**
     * Sets the SEQ_NO value for this ZSDPMESS.
     * 
     * @param SEQ_NO
     */
    public void setSEQ_NO(java.lang.String SEQ_NO) {
        this.SEQ_NO = SEQ_NO;
    }


    /**
     * Gets the MATNR value for this ZSDPMESS.
     * 
     * @return MATNR   * Article Number
     */
    public java.lang.String getMATNR() {
        return MATNR;
    }


    /**
     * Sets the MATNR value for this ZSDPMESS.
     * 
     * @param MATNR   * Article Number
     */
    public void setMATNR(java.lang.String MATNR) {
        this.MATNR = MATNR;
    }


    /**
     * Gets the TYPE value for this ZSDPMESS.
     * 
     * @return TYPE
     */
    public java.lang.String getTYPE() {
        return TYPE;
    }


    /**
     * Sets the TYPE value for this ZSDPMESS.
     * 
     * @param TYPE
     */
    public void setTYPE(java.lang.String TYPE) {
        this.TYPE = TYPE;
    }


    /**
     * Gets the MESS value for this ZSDPMESS.
     * 
     * @return MESS
     */
    public java.lang.String getMESS() {
        return MESS;
    }


    /**
     * Sets the MESS value for this ZSDPMESS.
     * 
     * @param MESS
     */
    public void setMESS(java.lang.String MESS) {
        this.MESS = MESS;
    }

    private java.lang.Object __equalsCalc = null;
    public synchronized boolean equals(java.lang.Object obj) {
        if (!(obj instanceof ZSDPMESS)) return false;
        ZSDPMESS other = (ZSDPMESS) obj;
        if (obj == null) return false;
        if (this == obj) return true;
        if (__equalsCalc != null) {
            return (__equalsCalc == obj);
        }
        __equalsCalc = obj;
        boolean _equals;
        _equals = true && 
            ((this.GLIDE_NO==null && other.getGLIDE_NO()==null) || 
             (this.GLIDE_NO!=null &&
              this.GLIDE_NO.equals(other.getGLIDE_NO()))) &&
            ((this.SEQ_NO==null && other.getSEQ_NO()==null) || 
             (this.SEQ_NO!=null &&
              this.SEQ_NO.equals(other.getSEQ_NO()))) &&
            ((this.MATNR==null && other.getMATNR()==null) || 
             (this.MATNR!=null &&
              this.MATNR.equals(other.getMATNR()))) &&
            ((this.TYPE==null && other.getTYPE()==null) || 
             (this.TYPE!=null &&
              this.TYPE.equals(other.getTYPE()))) &&
            ((this.MESS==null && other.getMESS()==null) || 
             (this.MESS!=null &&
              this.MESS.equals(other.getMESS())));
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
        if (getGLIDE_NO() != null) {
            _hashCode += getGLIDE_NO().hashCode();
        }
        if (getSEQ_NO() != null) {
            _hashCode += getSEQ_NO().hashCode();
        }
        if (getMATNR() != null) {
            _hashCode += getMATNR().hashCode();
        }
        if (getTYPE() != null) {
            _hashCode += getTYPE().hashCode();
        }
        if (getMESS() != null) {
            _hashCode += getMESS().hashCode();
        }
        __hashCodeCalc = false;
        return _hashCode;
    }

    // Type metadata
    private static org.apache.axis.description.TypeDesc typeDesc =
        new org.apache.axis.description.TypeDesc(ZSDPMESS.class, true);

    static {
        typeDesc.setXmlType(new javax.xml.namespace.QName("urn:sap-com:document:sap:rfc:functions", "ZSDPMESS"));
        org.apache.axis.description.ElementDesc elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("GLIDE_NO");
        elemField.setXmlName(new javax.xml.namespace.QName("", "GLIDE_NO"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("SEQ_NO");
        elemField.setXmlName(new javax.xml.namespace.QName("", "SEQ_NO"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("MATNR");
        elemField.setXmlName(new javax.xml.namespace.QName("", "MATNR"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("TYPE");
        elemField.setXmlName(new javax.xml.namespace.QName("", "TYPE"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("MESS");
        elemField.setXmlName(new javax.xml.namespace.QName("", "MESS"));
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
