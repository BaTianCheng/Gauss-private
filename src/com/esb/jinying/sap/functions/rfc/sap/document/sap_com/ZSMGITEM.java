/**
 * ZSMGITEM.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package com.esb.jinying.sap.functions.rfc.sap.document.sap_com;

public class ZSMGITEM  implements java.io.Serializable {
    /* Number of Article Document */
    private java.lang.String BELNR;

    /* Article Document Year */
    private java.lang.String GJAHR;

    /* Item in Article Document */
    private java.lang.String BUZEI;

    /* Article Number */
    private java.lang.String MATNR;

    /* Size/dimensions */
    private java.lang.String GROES;

    /* Global Trade Item Number (GTIN) */
    private java.lang.String EAN11;

    /* Base Unit of Measure */
    private java.lang.String MEINS;

    /* Quantity */
    private java.math.BigDecimal MENGE;

    /* Rate (condition amount or percentage) */
    private java.math.BigDecimal KBETR;

    /* Condition value */
    private java.math.BigDecimal KWERT;

    /* Purchasing Document Number */
    private java.lang.String EBELN;

    /* Item Number of Purchasing Document */
    private java.lang.String EBELP;

    public ZSMGITEM() {
    }

    public ZSMGITEM(
           java.lang.String BELNR,
           java.lang.String GJAHR,
           java.lang.String BUZEI,
           java.lang.String MATNR,
           java.lang.String GROES,
           java.lang.String EAN11,
           java.lang.String MEINS,
           java.math.BigDecimal MENGE,
           java.math.BigDecimal KBETR,
           java.math.BigDecimal KWERT,
           java.lang.String EBELN,
           java.lang.String EBELP) {
           this.BELNR = BELNR;
           this.GJAHR = GJAHR;
           this.BUZEI = BUZEI;
           this.MATNR = MATNR;
           this.GROES = GROES;
           this.EAN11 = EAN11;
           this.MEINS = MEINS;
           this.MENGE = MENGE;
           this.KBETR = KBETR;
           this.KWERT = KWERT;
           this.EBELN = EBELN;
           this.EBELP = EBELP;
    }


    /**
     * Gets the BELNR value for this ZSMGITEM.
     * 
     * @return BELNR   * Number of Article Document
     */
    public java.lang.String getBELNR() {
        return BELNR;
    }


    /**
     * Sets the BELNR value for this ZSMGITEM.
     * 
     * @param BELNR   * Number of Article Document
     */
    public void setBELNR(java.lang.String BELNR) {
        this.BELNR = BELNR;
    }


    /**
     * Gets the GJAHR value for this ZSMGITEM.
     * 
     * @return GJAHR   * Article Document Year
     */
    public java.lang.String getGJAHR() {
        return GJAHR;
    }


    /**
     * Sets the GJAHR value for this ZSMGITEM.
     * 
     * @param GJAHR   * Article Document Year
     */
    public void setGJAHR(java.lang.String GJAHR) {
        this.GJAHR = GJAHR;
    }


    /**
     * Gets the BUZEI value for this ZSMGITEM.
     * 
     * @return BUZEI   * Item in Article Document
     */
    public java.lang.String getBUZEI() {
        return BUZEI;
    }


    /**
     * Sets the BUZEI value for this ZSMGITEM.
     * 
     * @param BUZEI   * Item in Article Document
     */
    public void setBUZEI(java.lang.String BUZEI) {
        this.BUZEI = BUZEI;
    }


    /**
     * Gets the MATNR value for this ZSMGITEM.
     * 
     * @return MATNR   * Article Number
     */
    public java.lang.String getMATNR() {
        return MATNR;
    }


    /**
     * Sets the MATNR value for this ZSMGITEM.
     * 
     * @param MATNR   * Article Number
     */
    public void setMATNR(java.lang.String MATNR) {
        this.MATNR = MATNR;
    }


    /**
     * Gets the GROES value for this ZSMGITEM.
     * 
     * @return GROES   * Size/dimensions
     */
    public java.lang.String getGROES() {
        return GROES;
    }


    /**
     * Sets the GROES value for this ZSMGITEM.
     * 
     * @param GROES   * Size/dimensions
     */
    public void setGROES(java.lang.String GROES) {
        this.GROES = GROES;
    }


    /**
     * Gets the EAN11 value for this ZSMGITEM.
     * 
     * @return EAN11   * Global Trade Item Number (GTIN)
     */
    public java.lang.String getEAN11() {
        return EAN11;
    }


    /**
     * Sets the EAN11 value for this ZSMGITEM.
     * 
     * @param EAN11   * Global Trade Item Number (GTIN)
     */
    public void setEAN11(java.lang.String EAN11) {
        this.EAN11 = EAN11;
    }


    /**
     * Gets the MEINS value for this ZSMGITEM.
     * 
     * @return MEINS   * Base Unit of Measure
     */
    public java.lang.String getMEINS() {
        return MEINS;
    }


    /**
     * Sets the MEINS value for this ZSMGITEM.
     * 
     * @param MEINS   * Base Unit of Measure
     */
    public void setMEINS(java.lang.String MEINS) {
        this.MEINS = MEINS;
    }


    /**
     * Gets the MENGE value for this ZSMGITEM.
     * 
     * @return MENGE   * Quantity
     */
    public java.math.BigDecimal getMENGE() {
        return MENGE;
    }


    /**
     * Sets the MENGE value for this ZSMGITEM.
     * 
     * @param MENGE   * Quantity
     */
    public void setMENGE(java.math.BigDecimal MENGE) {
        this.MENGE = MENGE;
    }


    /**
     * Gets the KBETR value for this ZSMGITEM.
     * 
     * @return KBETR   * Rate (condition amount or percentage)
     */
    public java.math.BigDecimal getKBETR() {
        return KBETR;
    }


    /**
     * Sets the KBETR value for this ZSMGITEM.
     * 
     * @param KBETR   * Rate (condition amount or percentage)
     */
    public void setKBETR(java.math.BigDecimal KBETR) {
        this.KBETR = KBETR;
    }


    /**
     * Gets the KWERT value for this ZSMGITEM.
     * 
     * @return KWERT   * Condition value
     */
    public java.math.BigDecimal getKWERT() {
        return KWERT;
    }


    /**
     * Sets the KWERT value for this ZSMGITEM.
     * 
     * @param KWERT   * Condition value
     */
    public void setKWERT(java.math.BigDecimal KWERT) {
        this.KWERT = KWERT;
    }


    /**
     * Gets the EBELN value for this ZSMGITEM.
     * 
     * @return EBELN   * Purchasing Document Number
     */
    public java.lang.String getEBELN() {
        return EBELN;
    }


    /**
     * Sets the EBELN value for this ZSMGITEM.
     * 
     * @param EBELN   * Purchasing Document Number
     */
    public void setEBELN(java.lang.String EBELN) {
        this.EBELN = EBELN;
    }


    /**
     * Gets the EBELP value for this ZSMGITEM.
     * 
     * @return EBELP   * Item Number of Purchasing Document
     */
    public java.lang.String getEBELP() {
        return EBELP;
    }


    /**
     * Sets the EBELP value for this ZSMGITEM.
     * 
     * @param EBELP   * Item Number of Purchasing Document
     */
    public void setEBELP(java.lang.String EBELP) {
        this.EBELP = EBELP;
    }

    private java.lang.Object __equalsCalc = null;
    public synchronized boolean equals(java.lang.Object obj) {
        if (!(obj instanceof ZSMGITEM)) return false;
        ZSMGITEM other = (ZSMGITEM) obj;
        if (obj == null) return false;
        if (this == obj) return true;
        if (__equalsCalc != null) {
            return (__equalsCalc == obj);
        }
        __equalsCalc = obj;
        boolean _equals;
        _equals = true && 
            ((this.BELNR==null && other.getBELNR()==null) || 
             (this.BELNR!=null &&
              this.BELNR.equals(other.getBELNR()))) &&
            ((this.GJAHR==null && other.getGJAHR()==null) || 
             (this.GJAHR!=null &&
              this.GJAHR.equals(other.getGJAHR()))) &&
            ((this.BUZEI==null && other.getBUZEI()==null) || 
             (this.BUZEI!=null &&
              this.BUZEI.equals(other.getBUZEI()))) &&
            ((this.MATNR==null && other.getMATNR()==null) || 
             (this.MATNR!=null &&
              this.MATNR.equals(other.getMATNR()))) &&
            ((this.GROES==null && other.getGROES()==null) || 
             (this.GROES!=null &&
              this.GROES.equals(other.getGROES()))) &&
            ((this.EAN11==null && other.getEAN11()==null) || 
             (this.EAN11!=null &&
              this.EAN11.equals(other.getEAN11()))) &&
            ((this.MEINS==null && other.getMEINS()==null) || 
             (this.MEINS!=null &&
              this.MEINS.equals(other.getMEINS()))) &&
            ((this.MENGE==null && other.getMENGE()==null) || 
             (this.MENGE!=null &&
              this.MENGE.equals(other.getMENGE()))) &&
            ((this.KBETR==null && other.getKBETR()==null) || 
             (this.KBETR!=null &&
              this.KBETR.equals(other.getKBETR()))) &&
            ((this.KWERT==null && other.getKWERT()==null) || 
             (this.KWERT!=null &&
              this.KWERT.equals(other.getKWERT()))) &&
            ((this.EBELN==null && other.getEBELN()==null) || 
             (this.EBELN!=null &&
              this.EBELN.equals(other.getEBELN()))) &&
            ((this.EBELP==null && other.getEBELP()==null) || 
             (this.EBELP!=null &&
              this.EBELP.equals(other.getEBELP())));
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
        if (getBELNR() != null) {
            _hashCode += getBELNR().hashCode();
        }
        if (getGJAHR() != null) {
            _hashCode += getGJAHR().hashCode();
        }
        if (getBUZEI() != null) {
            _hashCode += getBUZEI().hashCode();
        }
        if (getMATNR() != null) {
            _hashCode += getMATNR().hashCode();
        }
        if (getGROES() != null) {
            _hashCode += getGROES().hashCode();
        }
        if (getEAN11() != null) {
            _hashCode += getEAN11().hashCode();
        }
        if (getMEINS() != null) {
            _hashCode += getMEINS().hashCode();
        }
        if (getMENGE() != null) {
            _hashCode += getMENGE().hashCode();
        }
        if (getKBETR() != null) {
            _hashCode += getKBETR().hashCode();
        }
        if (getKWERT() != null) {
            _hashCode += getKWERT().hashCode();
        }
        if (getEBELN() != null) {
            _hashCode += getEBELN().hashCode();
        }
        if (getEBELP() != null) {
            _hashCode += getEBELP().hashCode();
        }
        __hashCodeCalc = false;
        return _hashCode;
    }

    // Type metadata
    private static org.apache.axis.description.TypeDesc typeDesc =
        new org.apache.axis.description.TypeDesc(ZSMGITEM.class, true);

    static {
        typeDesc.setXmlType(new javax.xml.namespace.QName("urn:sap-com:document:sap:rfc:functions", "ZSMGITEM"));
        org.apache.axis.description.ElementDesc elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("BELNR");
        elemField.setXmlName(new javax.xml.namespace.QName("", "BELNR"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("GJAHR");
        elemField.setXmlName(new javax.xml.namespace.QName("", "GJAHR"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("BUZEI");
        elemField.setXmlName(new javax.xml.namespace.QName("", "BUZEI"));
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
        elemField.setFieldName("GROES");
        elemField.setXmlName(new javax.xml.namespace.QName("", "GROES"));
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
        elemField.setFieldName("MEINS");
        elemField.setXmlName(new javax.xml.namespace.QName("", "MEINS"));
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
        elemField.setFieldName("KBETR");
        elemField.setXmlName(new javax.xml.namespace.QName("", "KBETR"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "decimal"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("KWERT");
        elemField.setXmlName(new javax.xml.namespace.QName("", "KWERT"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "decimal"));
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
