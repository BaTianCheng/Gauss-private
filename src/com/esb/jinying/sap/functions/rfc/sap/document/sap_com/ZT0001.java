/**
 * ZT0001.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package com.esb.jinying.sap.functions.rfc.sap.document.sap_com;

public class ZT0001  implements java.io.Serializable {
    /* Client */
    private java.lang.String MANDT;

    private java.lang.String SCNUM;

    /* Purchasing Document Number */
    private java.lang.String EBELN;

    /* Item Number of Purchasing Document */
    private java.lang.String EBELP;

    /* Article Number */
    private java.lang.String MATNR;

    private java.math.BigDecimal MENGE;

    /* Base Unit of Measure */
    private java.lang.String MEINS;

    /* Storage Bin */
    private java.lang.String LGPLA;

    private java.lang.String PI_FLG;

    private java.lang.String RFUSR;

    private java.lang.String RFDAT;

    public ZT0001() {
    }

    public ZT0001(
           java.lang.String MANDT,
           java.lang.String SCNUM,
           java.lang.String EBELN,
           java.lang.String EBELP,
           java.lang.String MATNR,
           java.math.BigDecimal MENGE,
           java.lang.String MEINS,
           java.lang.String LGPLA,
           java.lang.String PI_FLG,
           java.lang.String RFUSR,
           java.lang.String RFDAT) {
           this.MANDT = MANDT;
           this.SCNUM = SCNUM;
           this.EBELN = EBELN;
           this.EBELP = EBELP;
           this.MATNR = MATNR;
           this.MENGE = MENGE;
           this.MEINS = MEINS;
           this.LGPLA = LGPLA;
           this.PI_FLG = PI_FLG;
           this.RFUSR = RFUSR;
           this.RFDAT = RFDAT;
    }


    /**
     * Gets the MANDT value for this ZT0001.
     * 
     * @return MANDT   * Client
     */
    public java.lang.String getMANDT() {
        return MANDT;
    }


    /**
     * Sets the MANDT value for this ZT0001.
     * 
     * @param MANDT   * Client
     */
    public void setMANDT(java.lang.String MANDT) {
        this.MANDT = MANDT;
    }


    /**
     * Gets the SCNUM value for this ZT0001.
     * 
     * @return SCNUM
     */
    public java.lang.String getSCNUM() {
        return SCNUM;
    }


    /**
     * Sets the SCNUM value for this ZT0001.
     * 
     * @param SCNUM
     */
    public void setSCNUM(java.lang.String SCNUM) {
        this.SCNUM = SCNUM;
    }


    /**
     * Gets the EBELN value for this ZT0001.
     * 
     * @return EBELN   * Purchasing Document Number
     */
    public java.lang.String getEBELN() {
        return EBELN;
    }


    /**
     * Sets the EBELN value for this ZT0001.
     * 
     * @param EBELN   * Purchasing Document Number
     */
    public void setEBELN(java.lang.String EBELN) {
        this.EBELN = EBELN;
    }


    /**
     * Gets the EBELP value for this ZT0001.
     * 
     * @return EBELP   * Item Number of Purchasing Document
     */
    public java.lang.String getEBELP() {
        return EBELP;
    }


    /**
     * Sets the EBELP value for this ZT0001.
     * 
     * @param EBELP   * Item Number of Purchasing Document
     */
    public void setEBELP(java.lang.String EBELP) {
        this.EBELP = EBELP;
    }


    /**
     * Gets the MATNR value for this ZT0001.
     * 
     * @return MATNR   * Article Number
     */
    public java.lang.String getMATNR() {
        return MATNR;
    }


    /**
     * Sets the MATNR value for this ZT0001.
     * 
     * @param MATNR   * Article Number
     */
    public void setMATNR(java.lang.String MATNR) {
        this.MATNR = MATNR;
    }


    /**
     * Gets the MENGE value for this ZT0001.
     * 
     * @return MENGE
     */
    public java.math.BigDecimal getMENGE() {
        return MENGE;
    }


    /**
     * Sets the MENGE value for this ZT0001.
     * 
     * @param MENGE
     */
    public void setMENGE(java.math.BigDecimal MENGE) {
        this.MENGE = MENGE;
    }


    /**
     * Gets the MEINS value for this ZT0001.
     * 
     * @return MEINS   * Base Unit of Measure
     */
    public java.lang.String getMEINS() {
        return MEINS;
    }


    /**
     * Sets the MEINS value for this ZT0001.
     * 
     * @param MEINS   * Base Unit of Measure
     */
    public void setMEINS(java.lang.String MEINS) {
        this.MEINS = MEINS;
    }


    /**
     * Gets the LGPLA value for this ZT0001.
     * 
     * @return LGPLA   * Storage Bin
     */
    public java.lang.String getLGPLA() {
        return LGPLA;
    }


    /**
     * Sets the LGPLA value for this ZT0001.
     * 
     * @param LGPLA   * Storage Bin
     */
    public void setLGPLA(java.lang.String LGPLA) {
        this.LGPLA = LGPLA;
    }


    /**
     * Gets the PI_FLG value for this ZT0001.
     * 
     * @return PI_FLG
     */
    public java.lang.String getPI_FLG() {
        return PI_FLG;
    }


    /**
     * Sets the PI_FLG value for this ZT0001.
     * 
     * @param PI_FLG
     */
    public void setPI_FLG(java.lang.String PI_FLG) {
        this.PI_FLG = PI_FLG;
    }


    /**
     * Gets the RFUSR value for this ZT0001.
     * 
     * @return RFUSR
     */
    public java.lang.String getRFUSR() {
        return RFUSR;
    }


    /**
     * Sets the RFUSR value for this ZT0001.
     * 
     * @param RFUSR
     */
    public void setRFUSR(java.lang.String RFUSR) {
        this.RFUSR = RFUSR;
    }


    /**
     * Gets the RFDAT value for this ZT0001.
     * 
     * @return RFDAT
     */
    public java.lang.String getRFDAT() {
        return RFDAT;
    }


    /**
     * Sets the RFDAT value for this ZT0001.
     * 
     * @param RFDAT
     */
    public void setRFDAT(java.lang.String RFDAT) {
        this.RFDAT = RFDAT;
    }

    private java.lang.Object __equalsCalc = null;
    public synchronized boolean equals(java.lang.Object obj) {
        if (!(obj instanceof ZT0001)) return false;
        ZT0001 other = (ZT0001) obj;
        if (obj == null) return false;
        if (this == obj) return true;
        if (__equalsCalc != null) {
            return (__equalsCalc == obj);
        }
        __equalsCalc = obj;
        boolean _equals;
        _equals = true && 
            ((this.MANDT==null && other.getMANDT()==null) || 
             (this.MANDT!=null &&
              this.MANDT.equals(other.getMANDT()))) &&
            ((this.SCNUM==null && other.getSCNUM()==null) || 
             (this.SCNUM!=null &&
              this.SCNUM.equals(other.getSCNUM()))) &&
            ((this.EBELN==null && other.getEBELN()==null) || 
             (this.EBELN!=null &&
              this.EBELN.equals(other.getEBELN()))) &&
            ((this.EBELP==null && other.getEBELP()==null) || 
             (this.EBELP!=null &&
              this.EBELP.equals(other.getEBELP()))) &&
            ((this.MATNR==null && other.getMATNR()==null) || 
             (this.MATNR!=null &&
              this.MATNR.equals(other.getMATNR()))) &&
            ((this.MENGE==null && other.getMENGE()==null) || 
             (this.MENGE!=null &&
              this.MENGE.equals(other.getMENGE()))) &&
            ((this.MEINS==null && other.getMEINS()==null) || 
             (this.MEINS!=null &&
              this.MEINS.equals(other.getMEINS()))) &&
            ((this.LGPLA==null && other.getLGPLA()==null) || 
             (this.LGPLA!=null &&
              this.LGPLA.equals(other.getLGPLA()))) &&
            ((this.PI_FLG==null && other.getPI_FLG()==null) || 
             (this.PI_FLG!=null &&
              this.PI_FLG.equals(other.getPI_FLG()))) &&
            ((this.RFUSR==null && other.getRFUSR()==null) || 
             (this.RFUSR!=null &&
              this.RFUSR.equals(other.getRFUSR()))) &&
            ((this.RFDAT==null && other.getRFDAT()==null) || 
             (this.RFDAT!=null &&
              this.RFDAT.equals(other.getRFDAT())));
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
        if (getMANDT() != null) {
            _hashCode += getMANDT().hashCode();
        }
        if (getSCNUM() != null) {
            _hashCode += getSCNUM().hashCode();
        }
        if (getEBELN() != null) {
            _hashCode += getEBELN().hashCode();
        }
        if (getEBELP() != null) {
            _hashCode += getEBELP().hashCode();
        }
        if (getMATNR() != null) {
            _hashCode += getMATNR().hashCode();
        }
        if (getMENGE() != null) {
            _hashCode += getMENGE().hashCode();
        }
        if (getMEINS() != null) {
            _hashCode += getMEINS().hashCode();
        }
        if (getLGPLA() != null) {
            _hashCode += getLGPLA().hashCode();
        }
        if (getPI_FLG() != null) {
            _hashCode += getPI_FLG().hashCode();
        }
        if (getRFUSR() != null) {
            _hashCode += getRFUSR().hashCode();
        }
        if (getRFDAT() != null) {
            _hashCode += getRFDAT().hashCode();
        }
        __hashCodeCalc = false;
        return _hashCode;
    }

    // Type metadata
    private static org.apache.axis.description.TypeDesc typeDesc =
        new org.apache.axis.description.TypeDesc(ZT0001.class, true);

    static {
        typeDesc.setXmlType(new javax.xml.namespace.QName("urn:sap-com:document:sap:rfc:functions", "ZT0001"));
        org.apache.axis.description.ElementDesc elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("MANDT");
        elemField.setXmlName(new javax.xml.namespace.QName("", "MANDT"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("SCNUM");
        elemField.setXmlName(new javax.xml.namespace.QName("", "SCNUM"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("EBELN");
        elemField.setXmlName(new javax.xml.namespace.QName("", "EBELN"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("EBELP");
        elemField.setXmlName(new javax.xml.namespace.QName("", "EBELP"));
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
        elemField.setFieldName("MENGE");
        elemField.setXmlName(new javax.xml.namespace.QName("", "MENGE"));
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
        elemField.setFieldName("PI_FLG");
        elemField.setXmlName(new javax.xml.namespace.QName("", "PI_FLG"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("RFUSR");
        elemField.setXmlName(new javax.xml.namespace.QName("", "RFUSR"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("RFDAT");
        elemField.setXmlName(new javax.xml.namespace.QName("", "RFDAT"));
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
