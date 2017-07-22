/**
 * ZS0007.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package com.esb.jinying.sap.functions.rfc.sap.document.sap_com;

public class ZS0007  implements java.io.Serializable {
    /* Physical Inventory Document */
    private java.lang.String IBLNR;

    /* Line Number */
    private java.lang.String ZEILI;

    /* Article Number */
    private java.lang.String MATNR;

    /* Global Trade Item Number (GTIN) */
    private java.lang.String EAN11;

    /* Article Description (Short Text) */
    private java.lang.String MAKTX;

    /* Book quantity immediately prior to count */
    private java.math.BigDecimal BUCHM;

    /* Base Unit of Measure */
    private java.lang.String MEINS;

    /* Storage Bin */
    private java.lang.String LGPLA;

    /* Item number in inventory document */
    private java.lang.String IVPOS;

    public ZS0007() {
    }

    public ZS0007(
           java.lang.String IBLNR,
           java.lang.String ZEILI,
           java.lang.String MATNR,
           java.lang.String EAN11,
           java.lang.String MAKTX,
           java.math.BigDecimal BUCHM,
           java.lang.String MEINS,
           java.lang.String LGPLA,
           java.lang.String IVPOS) {
           this.IBLNR = IBLNR;
           this.ZEILI = ZEILI;
           this.MATNR = MATNR;
           this.EAN11 = EAN11;
           this.MAKTX = MAKTX;
           this.BUCHM = BUCHM;
           this.MEINS = MEINS;
           this.LGPLA = LGPLA;
           this.IVPOS = IVPOS;
    }


    /**
     * Gets the IBLNR value for this ZS0007.
     * 
     * @return IBLNR   * Physical Inventory Document
     */
    public java.lang.String getIBLNR() {
        return IBLNR;
    }


    /**
     * Sets the IBLNR value for this ZS0007.
     * 
     * @param IBLNR   * Physical Inventory Document
     */
    public void setIBLNR(java.lang.String IBLNR) {
        this.IBLNR = IBLNR;
    }


    /**
     * Gets the ZEILI value for this ZS0007.
     * 
     * @return ZEILI   * Line Number
     */
    public java.lang.String getZEILI() {
        return ZEILI;
    }


    /**
     * Sets the ZEILI value for this ZS0007.
     * 
     * @param ZEILI   * Line Number
     */
    public void setZEILI(java.lang.String ZEILI) {
        this.ZEILI = ZEILI;
    }


    /**
     * Gets the MATNR value for this ZS0007.
     * 
     * @return MATNR   * Article Number
     */
    public java.lang.String getMATNR() {
        return MATNR;
    }


    /**
     * Sets the MATNR value for this ZS0007.
     * 
     * @param MATNR   * Article Number
     */
    public void setMATNR(java.lang.String MATNR) {
        this.MATNR = MATNR;
    }


    /**
     * Gets the EAN11 value for this ZS0007.
     * 
     * @return EAN11   * Global Trade Item Number (GTIN)
     */
    public java.lang.String getEAN11() {
        return EAN11;
    }


    /**
     * Sets the EAN11 value for this ZS0007.
     * 
     * @param EAN11   * Global Trade Item Number (GTIN)
     */
    public void setEAN11(java.lang.String EAN11) {
        this.EAN11 = EAN11;
    }


    /**
     * Gets the MAKTX value for this ZS0007.
     * 
     * @return MAKTX   * Article Description (Short Text)
     */
    public java.lang.String getMAKTX() {
        return MAKTX;
    }


    /**
     * Sets the MAKTX value for this ZS0007.
     * 
     * @param MAKTX   * Article Description (Short Text)
     */
    public void setMAKTX(java.lang.String MAKTX) {
        this.MAKTX = MAKTX;
    }


    /**
     * Gets the BUCHM value for this ZS0007.
     * 
     * @return BUCHM   * Book quantity immediately prior to count
     */
    public java.math.BigDecimal getBUCHM() {
        return BUCHM;
    }


    /**
     * Sets the BUCHM value for this ZS0007.
     * 
     * @param BUCHM   * Book quantity immediately prior to count
     */
    public void setBUCHM(java.math.BigDecimal BUCHM) {
        this.BUCHM = BUCHM;
    }


    /**
     * Gets the MEINS value for this ZS0007.
     * 
     * @return MEINS   * Base Unit of Measure
     */
    public java.lang.String getMEINS() {
        return MEINS;
    }


    /**
     * Sets the MEINS value for this ZS0007.
     * 
     * @param MEINS   * Base Unit of Measure
     */
    public void setMEINS(java.lang.String MEINS) {
        this.MEINS = MEINS;
    }


    /**
     * Gets the LGPLA value for this ZS0007.
     * 
     * @return LGPLA   * Storage Bin
     */
    public java.lang.String getLGPLA() {
        return LGPLA;
    }


    /**
     * Sets the LGPLA value for this ZS0007.
     * 
     * @param LGPLA   * Storage Bin
     */
    public void setLGPLA(java.lang.String LGPLA) {
        this.LGPLA = LGPLA;
    }


    /**
     * Gets the IVPOS value for this ZS0007.
     * 
     * @return IVPOS   * Item number in inventory document
     */
    public java.lang.String getIVPOS() {
        return IVPOS;
    }


    /**
     * Sets the IVPOS value for this ZS0007.
     * 
     * @param IVPOS   * Item number in inventory document
     */
    public void setIVPOS(java.lang.String IVPOS) {
        this.IVPOS = IVPOS;
    }

    private java.lang.Object __equalsCalc = null;
    public synchronized boolean equals(java.lang.Object obj) {
        if (!(obj instanceof ZS0007)) return false;
        ZS0007 other = (ZS0007) obj;
        if (obj == null) return false;
        if (this == obj) return true;
        if (__equalsCalc != null) {
            return (__equalsCalc == obj);
        }
        __equalsCalc = obj;
        boolean _equals;
        _equals = true && 
            ((this.IBLNR==null && other.getIBLNR()==null) || 
             (this.IBLNR!=null &&
              this.IBLNR.equals(other.getIBLNR()))) &&
            ((this.ZEILI==null && other.getZEILI()==null) || 
             (this.ZEILI!=null &&
              this.ZEILI.equals(other.getZEILI()))) &&
            ((this.MATNR==null && other.getMATNR()==null) || 
             (this.MATNR!=null &&
              this.MATNR.equals(other.getMATNR()))) &&
            ((this.EAN11==null && other.getEAN11()==null) || 
             (this.EAN11!=null &&
              this.EAN11.equals(other.getEAN11()))) &&
            ((this.MAKTX==null && other.getMAKTX()==null) || 
             (this.MAKTX!=null &&
              this.MAKTX.equals(other.getMAKTX()))) &&
            ((this.BUCHM==null && other.getBUCHM()==null) || 
             (this.BUCHM!=null &&
              this.BUCHM.equals(other.getBUCHM()))) &&
            ((this.MEINS==null && other.getMEINS()==null) || 
             (this.MEINS!=null &&
              this.MEINS.equals(other.getMEINS()))) &&
            ((this.LGPLA==null && other.getLGPLA()==null) || 
             (this.LGPLA!=null &&
              this.LGPLA.equals(other.getLGPLA()))) &&
            ((this.IVPOS==null && other.getIVPOS()==null) || 
             (this.IVPOS!=null &&
              this.IVPOS.equals(other.getIVPOS())));
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
        if (getIBLNR() != null) {
            _hashCode += getIBLNR().hashCode();
        }
        if (getZEILI() != null) {
            _hashCode += getZEILI().hashCode();
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
        if (getBUCHM() != null) {
            _hashCode += getBUCHM().hashCode();
        }
        if (getMEINS() != null) {
            _hashCode += getMEINS().hashCode();
        }
        if (getLGPLA() != null) {
            _hashCode += getLGPLA().hashCode();
        }
        if (getIVPOS() != null) {
            _hashCode += getIVPOS().hashCode();
        }
        __hashCodeCalc = false;
        return _hashCode;
    }

    // Type metadata
    private static org.apache.axis.description.TypeDesc typeDesc =
        new org.apache.axis.description.TypeDesc(ZS0007.class, true);

    static {
        typeDesc.setXmlType(new javax.xml.namespace.QName("urn:sap-com:document:sap:rfc:functions", "ZS0007"));
        org.apache.axis.description.ElementDesc elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("IBLNR");
        elemField.setXmlName(new javax.xml.namespace.QName("", "IBLNR"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("ZEILI");
        elemField.setXmlName(new javax.xml.namespace.QName("", "ZEILI"));
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
        elemField.setFieldName("BUCHM");
        elemField.setXmlName(new javax.xml.namespace.QName("", "BUCHM"));
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
        elemField.setFieldName("LGPLA");
        elemField.setXmlName(new javax.xml.namespace.QName("", "LGPLA"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("IVPOS");
        elemField.setXmlName(new javax.xml.namespace.QName("", "IVPOS"));
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
