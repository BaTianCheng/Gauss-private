/**
 * ZS0003.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package com.esb.jinying.sap.functions.rfc.sap.document.sap_com;

public class ZS0003  implements java.io.Serializable {
    /* Item number of the SD document */
    private java.lang.String POSNR;

    /* Article Number */
    private java.lang.String MATNR;

    /* Global Trade Item Number (GTIN) */
    private java.lang.String EAN11;

    /* Article Description (Short Text) */
    private java.lang.String MAKTX;

    /* Actual quantity delivered (in sales units) */
    private java.math.BigDecimal LFIMG;

    /* Base Unit of Measure */
    private java.lang.String MEINS;

    /* Site */
    private java.lang.String WERKS;

    /* Storage Location */
    private java.lang.String LGORT;

    public ZS0003() {
    }

    public ZS0003(
           java.lang.String POSNR,
           java.lang.String MATNR,
           java.lang.String EAN11,
           java.lang.String MAKTX,
           java.math.BigDecimal LFIMG,
           java.lang.String MEINS,
           java.lang.String WERKS,
           java.lang.String LGORT) {
           this.POSNR = POSNR;
           this.MATNR = MATNR;
           this.EAN11 = EAN11;
           this.MAKTX = MAKTX;
           this.LFIMG = LFIMG;
           this.MEINS = MEINS;
           this.WERKS = WERKS;
           this.LGORT = LGORT;
    }


    /**
     * Gets the POSNR value for this ZS0003.
     * 
     * @return POSNR   * Item number of the SD document
     */
    public java.lang.String getPOSNR() {
        return POSNR;
    }


    /**
     * Sets the POSNR value for this ZS0003.
     * 
     * @param POSNR   * Item number of the SD document
     */
    public void setPOSNR(java.lang.String POSNR) {
        this.POSNR = POSNR;
    }


    /**
     * Gets the MATNR value for this ZS0003.
     * 
     * @return MATNR   * Article Number
     */
    public java.lang.String getMATNR() {
        return MATNR;
    }


    /**
     * Sets the MATNR value for this ZS0003.
     * 
     * @param MATNR   * Article Number
     */
    public void setMATNR(java.lang.String MATNR) {
        this.MATNR = MATNR;
    }


    /**
     * Gets the EAN11 value for this ZS0003.
     * 
     * @return EAN11   * Global Trade Item Number (GTIN)
     */
    public java.lang.String getEAN11() {
        return EAN11;
    }


    /**
     * Sets the EAN11 value for this ZS0003.
     * 
     * @param EAN11   * Global Trade Item Number (GTIN)
     */
    public void setEAN11(java.lang.String EAN11) {
        this.EAN11 = EAN11;
    }


    /**
     * Gets the MAKTX value for this ZS0003.
     * 
     * @return MAKTX   * Article Description (Short Text)
     */
    public java.lang.String getMAKTX() {
        return MAKTX;
    }


    /**
     * Sets the MAKTX value for this ZS0003.
     * 
     * @param MAKTX   * Article Description (Short Text)
     */
    public void setMAKTX(java.lang.String MAKTX) {
        this.MAKTX = MAKTX;
    }


    /**
     * Gets the LFIMG value for this ZS0003.
     * 
     * @return LFIMG   * Actual quantity delivered (in sales units)
     */
    public java.math.BigDecimal getLFIMG() {
        return LFIMG;
    }


    /**
     * Sets the LFIMG value for this ZS0003.
     * 
     * @param LFIMG   * Actual quantity delivered (in sales units)
     */
    public void setLFIMG(java.math.BigDecimal LFIMG) {
        this.LFIMG = LFIMG;
    }


    /**
     * Gets the MEINS value for this ZS0003.
     * 
     * @return MEINS   * Base Unit of Measure
     */
    public java.lang.String getMEINS() {
        return MEINS;
    }


    /**
     * Sets the MEINS value for this ZS0003.
     * 
     * @param MEINS   * Base Unit of Measure
     */
    public void setMEINS(java.lang.String MEINS) {
        this.MEINS = MEINS;
    }


    /**
     * Gets the WERKS value for this ZS0003.
     * 
     * @return WERKS   * Site
     */
    public java.lang.String getWERKS() {
        return WERKS;
    }


    /**
     * Sets the WERKS value for this ZS0003.
     * 
     * @param WERKS   * Site
     */
    public void setWERKS(java.lang.String WERKS) {
        this.WERKS = WERKS;
    }


    /**
     * Gets the LGORT value for this ZS0003.
     * 
     * @return LGORT   * Storage Location
     */
    public java.lang.String getLGORT() {
        return LGORT;
    }


    /**
     * Sets the LGORT value for this ZS0003.
     * 
     * @param LGORT   * Storage Location
     */
    public void setLGORT(java.lang.String LGORT) {
        this.LGORT = LGORT;
    }

    private java.lang.Object __equalsCalc = null;
    public synchronized boolean equals(java.lang.Object obj) {
        if (!(obj instanceof ZS0003)) return false;
        ZS0003 other = (ZS0003) obj;
        if (obj == null) return false;
        if (this == obj) return true;
        if (__equalsCalc != null) {
            return (__equalsCalc == obj);
        }
        __equalsCalc = obj;
        boolean _equals;
        _equals = true && 
            ((this.POSNR==null && other.getPOSNR()==null) || 
             (this.POSNR!=null &&
              this.POSNR.equals(other.getPOSNR()))) &&
            ((this.MATNR==null && other.getMATNR()==null) || 
             (this.MATNR!=null &&
              this.MATNR.equals(other.getMATNR()))) &&
            ((this.EAN11==null && other.getEAN11()==null) || 
             (this.EAN11!=null &&
              this.EAN11.equals(other.getEAN11()))) &&
            ((this.MAKTX==null && other.getMAKTX()==null) || 
             (this.MAKTX!=null &&
              this.MAKTX.equals(other.getMAKTX()))) &&
            ((this.LFIMG==null && other.getLFIMG()==null) || 
             (this.LFIMG!=null &&
              this.LFIMG.equals(other.getLFIMG()))) &&
            ((this.MEINS==null && other.getMEINS()==null) || 
             (this.MEINS!=null &&
              this.MEINS.equals(other.getMEINS()))) &&
            ((this.WERKS==null && other.getWERKS()==null) || 
             (this.WERKS!=null &&
              this.WERKS.equals(other.getWERKS()))) &&
            ((this.LGORT==null && other.getLGORT()==null) || 
             (this.LGORT!=null &&
              this.LGORT.equals(other.getLGORT())));
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
        if (getPOSNR() != null) {
            _hashCode += getPOSNR().hashCode();
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
        if (getLFIMG() != null) {
            _hashCode += getLFIMG().hashCode();
        }
        if (getMEINS() != null) {
            _hashCode += getMEINS().hashCode();
        }
        if (getWERKS() != null) {
            _hashCode += getWERKS().hashCode();
        }
        if (getLGORT() != null) {
            _hashCode += getLGORT().hashCode();
        }
        __hashCodeCalc = false;
        return _hashCode;
    }

    // Type metadata
    private static org.apache.axis.description.TypeDesc typeDesc =
        new org.apache.axis.description.TypeDesc(ZS0003.class, true);

    static {
        typeDesc.setXmlType(new javax.xml.namespace.QName("urn:sap-com:document:sap:rfc:functions", "ZS0003"));
        org.apache.axis.description.ElementDesc elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("POSNR");
        elemField.setXmlName(new javax.xml.namespace.QName("", "POSNR"));
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
        elemField.setFieldName("LFIMG");
        elemField.setXmlName(new javax.xml.namespace.QName("", "LFIMG"));
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
