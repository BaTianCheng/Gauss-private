/**
 * ZS0009.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package com.esb.jinying.sap.functions.rfc.sap.document.sap_com;

public class ZS0009  implements java.io.Serializable {
    /* Item Number of Reservation/Dependent Requirement */
    private java.lang.String RSPOS;

    /* Article Number */
    private java.lang.String MATNR;

    /* Global Trade Item Number (GTIN) */
    private java.lang.String EAN11;

    /* Article Description (Short Text) */
    private java.lang.String MAKTX;

    /* Site */
    private java.lang.String WERKS;

    /* Storage Location */
    private java.lang.String LGORT;

    /* Requirement Quantity */
    private java.math.BigDecimal BDMNG;

    /* Base Unit of Measure */
    private java.lang.String MEINS;

    public ZS0009() {
    }

    public ZS0009(
           java.lang.String RSPOS,
           java.lang.String MATNR,
           java.lang.String EAN11,
           java.lang.String MAKTX,
           java.lang.String WERKS,
           java.lang.String LGORT,
           java.math.BigDecimal BDMNG,
           java.lang.String MEINS) {
           this.RSPOS = RSPOS;
           this.MATNR = MATNR;
           this.EAN11 = EAN11;
           this.MAKTX = MAKTX;
           this.WERKS = WERKS;
           this.LGORT = LGORT;
           this.BDMNG = BDMNG;
           this.MEINS = MEINS;
    }


    /**
     * Gets the RSPOS value for this ZS0009.
     * 
     * @return RSPOS   * Item Number of Reservation/Dependent Requirement
     */
    public java.lang.String getRSPOS() {
        return RSPOS;
    }


    /**
     * Sets the RSPOS value for this ZS0009.
     * 
     * @param RSPOS   * Item Number of Reservation/Dependent Requirement
     */
    public void setRSPOS(java.lang.String RSPOS) {
        this.RSPOS = RSPOS;
    }


    /**
     * Gets the MATNR value for this ZS0009.
     * 
     * @return MATNR   * Article Number
     */
    public java.lang.String getMATNR() {
        return MATNR;
    }


    /**
     * Sets the MATNR value for this ZS0009.
     * 
     * @param MATNR   * Article Number
     */
    public void setMATNR(java.lang.String MATNR) {
        this.MATNR = MATNR;
    }


    /**
     * Gets the EAN11 value for this ZS0009.
     * 
     * @return EAN11   * Global Trade Item Number (GTIN)
     */
    public java.lang.String getEAN11() {
        return EAN11;
    }


    /**
     * Sets the EAN11 value for this ZS0009.
     * 
     * @param EAN11   * Global Trade Item Number (GTIN)
     */
    public void setEAN11(java.lang.String EAN11) {
        this.EAN11 = EAN11;
    }


    /**
     * Gets the MAKTX value for this ZS0009.
     * 
     * @return MAKTX   * Article Description (Short Text)
     */
    public java.lang.String getMAKTX() {
        return MAKTX;
    }


    /**
     * Sets the MAKTX value for this ZS0009.
     * 
     * @param MAKTX   * Article Description (Short Text)
     */
    public void setMAKTX(java.lang.String MAKTX) {
        this.MAKTX = MAKTX;
    }


    /**
     * Gets the WERKS value for this ZS0009.
     * 
     * @return WERKS   * Site
     */
    public java.lang.String getWERKS() {
        return WERKS;
    }


    /**
     * Sets the WERKS value for this ZS0009.
     * 
     * @param WERKS   * Site
     */
    public void setWERKS(java.lang.String WERKS) {
        this.WERKS = WERKS;
    }


    /**
     * Gets the LGORT value for this ZS0009.
     * 
     * @return LGORT   * Storage Location
     */
    public java.lang.String getLGORT() {
        return LGORT;
    }


    /**
     * Sets the LGORT value for this ZS0009.
     * 
     * @param LGORT   * Storage Location
     */
    public void setLGORT(java.lang.String LGORT) {
        this.LGORT = LGORT;
    }


    /**
     * Gets the BDMNG value for this ZS0009.
     * 
     * @return BDMNG   * Requirement Quantity
     */
    public java.math.BigDecimal getBDMNG() {
        return BDMNG;
    }


    /**
     * Sets the BDMNG value for this ZS0009.
     * 
     * @param BDMNG   * Requirement Quantity
     */
    public void setBDMNG(java.math.BigDecimal BDMNG) {
        this.BDMNG = BDMNG;
    }


    /**
     * Gets the MEINS value for this ZS0009.
     * 
     * @return MEINS   * Base Unit of Measure
     */
    public java.lang.String getMEINS() {
        return MEINS;
    }


    /**
     * Sets the MEINS value for this ZS0009.
     * 
     * @param MEINS   * Base Unit of Measure
     */
    public void setMEINS(java.lang.String MEINS) {
        this.MEINS = MEINS;
    }

    private java.lang.Object __equalsCalc = null;
    public synchronized boolean equals(java.lang.Object obj) {
        if (!(obj instanceof ZS0009)) return false;
        ZS0009 other = (ZS0009) obj;
        if (obj == null) return false;
        if (this == obj) return true;
        if (__equalsCalc != null) {
            return (__equalsCalc == obj);
        }
        __equalsCalc = obj;
        boolean _equals;
        _equals = true && 
            ((this.RSPOS==null && other.getRSPOS()==null) || 
             (this.RSPOS!=null &&
              this.RSPOS.equals(other.getRSPOS()))) &&
            ((this.MATNR==null && other.getMATNR()==null) || 
             (this.MATNR!=null &&
              this.MATNR.equals(other.getMATNR()))) &&
            ((this.EAN11==null && other.getEAN11()==null) || 
             (this.EAN11!=null &&
              this.EAN11.equals(other.getEAN11()))) &&
            ((this.MAKTX==null && other.getMAKTX()==null) || 
             (this.MAKTX!=null &&
              this.MAKTX.equals(other.getMAKTX()))) &&
            ((this.WERKS==null && other.getWERKS()==null) || 
             (this.WERKS!=null &&
              this.WERKS.equals(other.getWERKS()))) &&
            ((this.LGORT==null && other.getLGORT()==null) || 
             (this.LGORT!=null &&
              this.LGORT.equals(other.getLGORT()))) &&
            ((this.BDMNG==null && other.getBDMNG()==null) || 
             (this.BDMNG!=null &&
              this.BDMNG.equals(other.getBDMNG()))) &&
            ((this.MEINS==null && other.getMEINS()==null) || 
             (this.MEINS!=null &&
              this.MEINS.equals(other.getMEINS())));
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
        if (getRSPOS() != null) {
            _hashCode += getRSPOS().hashCode();
        }
        if (getMATNR() != null) {
            _hashCode += getMATNR().hashCode();
        }
        if (getEAN11() != null) {
            _hashCode += getEAN11().hashCode();
        }
        if (getMAKTX() != null) {
            _hashCode += getMAKTX().hashCode();
        }
        if (getWERKS() != null) {
            _hashCode += getWERKS().hashCode();
        }
        if (getLGORT() != null) {
            _hashCode += getLGORT().hashCode();
        }
        if (getBDMNG() != null) {
            _hashCode += getBDMNG().hashCode();
        }
        if (getMEINS() != null) {
            _hashCode += getMEINS().hashCode();
        }
        __hashCodeCalc = false;
        return _hashCode;
    }

    // Type metadata
    private static org.apache.axis.description.TypeDesc typeDesc =
        new org.apache.axis.description.TypeDesc(ZS0009.class, true);

    static {
        typeDesc.setXmlType(new javax.xml.namespace.QName("urn:sap-com:document:sap:rfc:functions", "ZS0009"));
        org.apache.axis.description.ElementDesc elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("RSPOS");
        elemField.setXmlName(new javax.xml.namespace.QName("", "RSPOS"));
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
        elemField.setFieldName("EAN11");
        elemField.setXmlName(new javax.xml.namespace.QName("", "EAN11"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("MAKTX");
        elemField.setXmlName(new javax.xml.namespace.QName("", "MAKTX"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("WERKS");
        elemField.setXmlName(new javax.xml.namespace.QName("", "WERKS"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("LGORT");
        elemField.setXmlName(new javax.xml.namespace.QName("", "LGORT"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("BDMNG");
        elemField.setXmlName(new javax.xml.namespace.QName("", "BDMNG"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "decimal"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("MEINS");
        elemField.setXmlName(new javax.xml.namespace.QName("", "MEINS"));
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
