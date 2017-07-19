/**
 * ZSPOITEM.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package com.esb.jinying.sap.functions.rfc.sap.document.sap_com;

public class ZSPOITEM  implements java.io.Serializable {
    /* Purchasing Document Number */
    private java.lang.String EBELN;

    /* Item Number of Purchasing Document */
    private java.lang.String EBELP;

    /* Article Number */
    private java.lang.String MATNR;

    /* Size/dimensions */
    private java.lang.String GROES;

    /* Numerator for Conversion to Base Units of Measure */
    private java.math.BigDecimal UMREZ;

    /* Global Trade Item Number (GTIN) */
    private java.lang.String EAN11;

    /* Purchase Order Unit of Measure */
    private java.lang.String MEINS;

    /* Purchase Order Quantity */
    private java.math.BigDecimal MENGE;

    /* Purchase Order Quantity */
    private java.math.BigDecimal MENGE1;

    /* Rate (condition amount or percentage) */
    private java.math.BigDecimal KBETR;

    /* Gross order value in PO currency */
    private java.math.BigDecimal BRTWR;

    public ZSPOITEM() {
    }

    public ZSPOITEM(
           java.lang.String EBELN,
           java.lang.String EBELP,
           java.lang.String MATNR,
           java.lang.String GROES,
           java.math.BigDecimal UMREZ,
           java.lang.String EAN11,
           java.lang.String MEINS,
           java.math.BigDecimal MENGE,
           java.math.BigDecimal MENGE1,
           java.math.BigDecimal KBETR,
           java.math.BigDecimal BRTWR) {
           this.EBELN = EBELN;
           this.EBELP = EBELP;
           this.MATNR = MATNR;
           this.GROES = GROES;
           this.UMREZ = UMREZ;
           this.EAN11 = EAN11;
           this.MEINS = MEINS;
           this.MENGE = MENGE;
           this.MENGE1 = MENGE1;
           this.KBETR = KBETR;
           this.BRTWR = BRTWR;
    }


    /**
     * Gets the EBELN value for this ZSPOITEM.
     * 
     * @return EBELN   * Purchasing Document Number
     */
    public java.lang.String getEBELN() {
        return EBELN;
    }


    /**
     * Sets the EBELN value for this ZSPOITEM.
     * 
     * @param EBELN   * Purchasing Document Number
     */
    public void setEBELN(java.lang.String EBELN) {
        this.EBELN = EBELN;
    }


    /**
     * Gets the EBELP value for this ZSPOITEM.
     * 
     * @return EBELP   * Item Number of Purchasing Document
     */
    public java.lang.String getEBELP() {
        return EBELP;
    }


    /**
     * Sets the EBELP value for this ZSPOITEM.
     * 
     * @param EBELP   * Item Number of Purchasing Document
     */
    public void setEBELP(java.lang.String EBELP) {
        this.EBELP = EBELP;
    }


    /**
     * Gets the MATNR value for this ZSPOITEM.
     * 
     * @return MATNR   * Article Number
     */
    public java.lang.String getMATNR() {
        return MATNR;
    }


    /**
     * Sets the MATNR value for this ZSPOITEM.
     * 
     * @param MATNR   * Article Number
     */
    public void setMATNR(java.lang.String MATNR) {
        this.MATNR = MATNR;
    }


    /**
     * Gets the GROES value for this ZSPOITEM.
     * 
     * @return GROES   * Size/dimensions
     */
    public java.lang.String getGROES() {
        return GROES;
    }


    /**
     * Sets the GROES value for this ZSPOITEM.
     * 
     * @param GROES   * Size/dimensions
     */
    public void setGROES(java.lang.String GROES) {
        this.GROES = GROES;
    }


    /**
     * Gets the UMREZ value for this ZSPOITEM.
     * 
     * @return UMREZ   * Numerator for Conversion to Base Units of Measure
     */
    public java.math.BigDecimal getUMREZ() {
        return UMREZ;
    }


    /**
     * Sets the UMREZ value for this ZSPOITEM.
     * 
     * @param UMREZ   * Numerator for Conversion to Base Units of Measure
     */
    public void setUMREZ(java.math.BigDecimal UMREZ) {
        this.UMREZ = UMREZ;
    }


    /**
     * Gets the EAN11 value for this ZSPOITEM.
     * 
     * @return EAN11   * Global Trade Item Number (GTIN)
     */
    public java.lang.String getEAN11() {
        return EAN11;
    }


    /**
     * Sets the EAN11 value for this ZSPOITEM.
     * 
     * @param EAN11   * Global Trade Item Number (GTIN)
     */
    public void setEAN11(java.lang.String EAN11) {
        this.EAN11 = EAN11;
    }


    /**
     * Gets the MEINS value for this ZSPOITEM.
     * 
     * @return MEINS   * Purchase Order Unit of Measure
     */
    public java.lang.String getMEINS() {
        return MEINS;
    }


    /**
     * Sets the MEINS value for this ZSPOITEM.
     * 
     * @param MEINS   * Purchase Order Unit of Measure
     */
    public void setMEINS(java.lang.String MEINS) {
        this.MEINS = MEINS;
    }


    /**
     * Gets the MENGE value for this ZSPOITEM.
     * 
     * @return MENGE   * Purchase Order Quantity
     */
    public java.math.BigDecimal getMENGE() {
        return MENGE;
    }


    /**
     * Sets the MENGE value for this ZSPOITEM.
     * 
     * @param MENGE   * Purchase Order Quantity
     */
    public void setMENGE(java.math.BigDecimal MENGE) {
        this.MENGE = MENGE;
    }


    /**
     * Gets the MENGE1 value for this ZSPOITEM.
     * 
     * @return MENGE1   * Purchase Order Quantity
     */
    public java.math.BigDecimal getMENGE1() {
        return MENGE1;
    }


    /**
     * Sets the MENGE1 value for this ZSPOITEM.
     * 
     * @param MENGE1   * Purchase Order Quantity
     */
    public void setMENGE1(java.math.BigDecimal MENGE1) {
        this.MENGE1 = MENGE1;
    }


    /**
     * Gets the KBETR value for this ZSPOITEM.
     * 
     * @return KBETR   * Rate (condition amount or percentage)
     */
    public java.math.BigDecimal getKBETR() {
        return KBETR;
    }


    /**
     * Sets the KBETR value for this ZSPOITEM.
     * 
     * @param KBETR   * Rate (condition amount or percentage)
     */
    public void setKBETR(java.math.BigDecimal KBETR) {
        this.KBETR = KBETR;
    }


    /**
     * Gets the BRTWR value for this ZSPOITEM.
     * 
     * @return BRTWR   * Gross order value in PO currency
     */
    public java.math.BigDecimal getBRTWR() {
        return BRTWR;
    }


    /**
     * Sets the BRTWR value for this ZSPOITEM.
     * 
     * @param BRTWR   * Gross order value in PO currency
     */
    public void setBRTWR(java.math.BigDecimal BRTWR) {
        this.BRTWR = BRTWR;
    }

    private java.lang.Object __equalsCalc = null;
    public synchronized boolean equals(java.lang.Object obj) {
        if (!(obj instanceof ZSPOITEM)) return false;
        ZSPOITEM other = (ZSPOITEM) obj;
        if (obj == null) return false;
        if (this == obj) return true;
        if (__equalsCalc != null) {
            return (__equalsCalc == obj);
        }
        __equalsCalc = obj;
        boolean _equals;
        _equals = true && 
            ((this.EBELN==null && other.getEBELN()==null) || 
             (this.EBELN!=null &&
              this.EBELN.equals(other.getEBELN()))) &&
            ((this.EBELP==null && other.getEBELP()==null) || 
             (this.EBELP!=null &&
              this.EBELP.equals(other.getEBELP()))) &&
            ((this.MATNR==null && other.getMATNR()==null) || 
             (this.MATNR!=null &&
              this.MATNR.equals(other.getMATNR()))) &&
            ((this.GROES==null && other.getGROES()==null) || 
             (this.GROES!=null &&
              this.GROES.equals(other.getGROES()))) &&
            ((this.UMREZ==null && other.getUMREZ()==null) || 
             (this.UMREZ!=null &&
              this.UMREZ.equals(other.getUMREZ()))) &&
            ((this.EAN11==null && other.getEAN11()==null) || 
             (this.EAN11!=null &&
              this.EAN11.equals(other.getEAN11()))) &&
            ((this.MEINS==null && other.getMEINS()==null) || 
             (this.MEINS!=null &&
              this.MEINS.equals(other.getMEINS()))) &&
            ((this.MENGE==null && other.getMENGE()==null) || 
             (this.MENGE!=null &&
              this.MENGE.equals(other.getMENGE()))) &&
            ((this.MENGE1==null && other.getMENGE1()==null) || 
             (this.MENGE1!=null &&
              this.MENGE1.equals(other.getMENGE1()))) &&
            ((this.KBETR==null && other.getKBETR()==null) || 
             (this.KBETR!=null &&
              this.KBETR.equals(other.getKBETR()))) &&
            ((this.BRTWR==null && other.getBRTWR()==null) || 
             (this.BRTWR!=null &&
              this.BRTWR.equals(other.getBRTWR())));
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
        if (getEBELN() != null) {
            _hashCode += getEBELN().hashCode();
        }
        if (getEBELP() != null) {
            _hashCode += getEBELP().hashCode();
        }
        if (getMATNR() != null) {
            _hashCode += getMATNR().hashCode();
        }
        if (getGROES() != null) {
            _hashCode += getGROES().hashCode();
        }
        if (getUMREZ() != null) {
            _hashCode += getUMREZ().hashCode();
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
        if (getMENGE1() != null) {
            _hashCode += getMENGE1().hashCode();
        }
        if (getKBETR() != null) {
            _hashCode += getKBETR().hashCode();
        }
        if (getBRTWR() != null) {
            _hashCode += getBRTWR().hashCode();
        }
        __hashCodeCalc = false;
        return _hashCode;
    }

    // Type metadata
    private static org.apache.axis.description.TypeDesc typeDesc =
        new org.apache.axis.description.TypeDesc(ZSPOITEM.class, true);

    static {
        typeDesc.setXmlType(new javax.xml.namespace.QName("urn:sap-com:document:sap:rfc:functions", "ZSPOITEM"));
        org.apache.axis.description.ElementDesc elemField = new org.apache.axis.description.ElementDesc();
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
        elemField.setFieldName("GROES");
        elemField.setXmlName(new javax.xml.namespace.QName("", "GROES"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("UMREZ");
        elemField.setXmlName(new javax.xml.namespace.QName("", "UMREZ"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "decimal"));
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
        elemField.setFieldName("MENGE1");
        elemField.setXmlName(new javax.xml.namespace.QName("", "MENGE1"));
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
        elemField.setFieldName("BRTWR");
        elemField.setXmlName(new javax.xml.namespace.QName("", "BRTWR"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "decimal"));
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
