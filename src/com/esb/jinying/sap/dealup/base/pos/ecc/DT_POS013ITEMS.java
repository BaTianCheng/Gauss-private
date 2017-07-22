/**
 * DT_POS013ITEMS.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package com.esb.jinying.sap.dealup.base.pos.ecc;

public class DT_POS013ITEMS  implements java.io.Serializable {
    /* 库存调整单号 */
    private java.lang.String ORDER_NUM;

    /* 交易日期 */
    private java.lang.String BUDAT;

    /* 货品编码 */
    private java.lang.String MATNR;

    /* 移库类型 */
    private java.lang.String BWART;

    /* 地点 */
    private java.lang.String WERKS;

    /* 库存地点 */
    private java.lang.String LGORT;

    /* 数量 */
    private java.lang.Double MENGE;

    /* 单位 */
    private java.lang.String MEINS;

    public DT_POS013ITEMS() {
    }

    public DT_POS013ITEMS(
           java.lang.String ORDER_NUM,
           java.lang.String BUDAT,
           java.lang.String MATNR,
           java.lang.String BWART,
           java.lang.String WERKS,
           java.lang.String LGORT,
           java.lang.Double MENGE,
           java.lang.String MEINS) {
           this.ORDER_NUM = ORDER_NUM;
           this.BUDAT = BUDAT;
           this.MATNR = MATNR;
           this.BWART = BWART;
           this.WERKS = WERKS;
           this.LGORT = LGORT;
           this.MENGE = MENGE;
           this.MEINS = MEINS;
    }


    /**
     * Gets the ORDER_NUM value for this DT_POS013ITEMS.
     * 
     * @return ORDER_NUM   * 库存调整单号
     */
    public java.lang.String getORDER_NUM() {
        return ORDER_NUM;
    }


    /**
     * Sets the ORDER_NUM value for this DT_POS013ITEMS.
     * 
     * @param ORDER_NUM   * 库存调整单号
     */
    public void setORDER_NUM(java.lang.String ORDER_NUM) {
        this.ORDER_NUM = ORDER_NUM;
    }


    /**
     * Gets the BUDAT value for this DT_POS013ITEMS.
     * 
     * @return BUDAT   * 交易日期
     */
    public java.lang.String getBUDAT() {
        return BUDAT;
    }


    /**
     * Sets the BUDAT value for this DT_POS013ITEMS.
     * 
     * @param BUDAT   * 交易日期
     */
    public void setBUDAT(java.lang.String BUDAT) {
        this.BUDAT = BUDAT;
    }


    /**
     * Gets the MATNR value for this DT_POS013ITEMS.
     * 
     * @return MATNR   * 货品编码
     */
    public java.lang.String getMATNR() {
        return MATNR;
    }


    /**
     * Sets the MATNR value for this DT_POS013ITEMS.
     * 
     * @param MATNR   * 货品编码
     */
    public void setMATNR(java.lang.String MATNR) {
        this.MATNR = MATNR;
    }


    /**
     * Gets the BWART value for this DT_POS013ITEMS.
     * 
     * @return BWART   * 移库类型
     */
    public java.lang.String getBWART() {
        return BWART;
    }


    /**
     * Sets the BWART value for this DT_POS013ITEMS.
     * 
     * @param BWART   * 移库类型
     */
    public void setBWART(java.lang.String BWART) {
        this.BWART = BWART;
    }


    /**
     * Gets the WERKS value for this DT_POS013ITEMS.
     * 
     * @return WERKS   * 地点
     */
    public java.lang.String getWERKS() {
        return WERKS;
    }


    /**
     * Sets the WERKS value for this DT_POS013ITEMS.
     * 
     * @param WERKS   * 地点
     */
    public void setWERKS(java.lang.String WERKS) {
        this.WERKS = WERKS;
    }


    /**
     * Gets the LGORT value for this DT_POS013ITEMS.
     * 
     * @return LGORT   * 库存地点
     */
    public java.lang.String getLGORT() {
        return LGORT;
    }


    /**
     * Sets the LGORT value for this DT_POS013ITEMS.
     * 
     * @param LGORT   * 库存地点
     */
    public void setLGORT(java.lang.String LGORT) {
        this.LGORT = LGORT;
    }


    /**
     * Gets the MENGE value for this DT_POS013ITEMS.
     * 
     * @return MENGE   * 数量
     */
    public java.lang.Double getMENGE() {
        return MENGE;
    }


    /**
     * Sets the MENGE value for this DT_POS013ITEMS.
     * 
     * @param MENGE   * 数量
     */
    public void setMENGE(java.lang.Double MENGE) {
        this.MENGE = MENGE;
    }


    /**
     * Gets the MEINS value for this DT_POS013ITEMS.
     * 
     * @return MEINS   * 单位
     */
    public java.lang.String getMEINS() {
        return MEINS;
    }


    /**
     * Sets the MEINS value for this DT_POS013ITEMS.
     * 
     * @param MEINS   * 单位
     */
    public void setMEINS(java.lang.String MEINS) {
        this.MEINS = MEINS;
    }

    private java.lang.Object __equalsCalc = null;
    public synchronized boolean equals(java.lang.Object obj) {
        if (!(obj instanceof DT_POS013ITEMS)) return false;
        DT_POS013ITEMS other = (DT_POS013ITEMS) obj;
        if (obj == null) return false;
        if (this == obj) return true;
        if (__equalsCalc != null) {
            return (__equalsCalc == obj);
        }
        __equalsCalc = obj;
        boolean _equals;
        _equals = true && 
            ((this.ORDER_NUM==null && other.getORDER_NUM()==null) || 
             (this.ORDER_NUM!=null &&
              this.ORDER_NUM.equals(other.getORDER_NUM()))) &&
            ((this.BUDAT==null && other.getBUDAT()==null) || 
             (this.BUDAT!=null &&
              this.BUDAT.equals(other.getBUDAT()))) &&
            ((this.MATNR==null && other.getMATNR()==null) || 
             (this.MATNR!=null &&
              this.MATNR.equals(other.getMATNR()))) &&
            ((this.BWART==null && other.getBWART()==null) || 
             (this.BWART!=null &&
              this.BWART.equals(other.getBWART()))) &&
            ((this.WERKS==null && other.getWERKS()==null) || 
             (this.WERKS!=null &&
              this.WERKS.equals(other.getWERKS()))) &&
            ((this.LGORT==null && other.getLGORT()==null) || 
             (this.LGORT!=null &&
              this.LGORT.equals(other.getLGORT()))) &&
            ((this.MENGE==null && other.getMENGE()==null) || 
             (this.MENGE!=null &&
              this.MENGE.equals(other.getMENGE()))) &&
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
        if (getORDER_NUM() != null) {
            _hashCode += getORDER_NUM().hashCode();
        }
        if (getBUDAT() != null) {
            _hashCode += getBUDAT().hashCode();
        }
        if (getMATNR() != null) {
            _hashCode += getMATNR().hashCode();
        }
        if (getBWART() != null) {
            _hashCode += getBWART().hashCode();
        }
        if (getWERKS() != null) {
            _hashCode += getWERKS().hashCode();
        }
        if (getLGORT() != null) {
            _hashCode += getLGORT().hashCode();
        }
        if (getMENGE() != null) {
            _hashCode += getMENGE().hashCode();
        }
        if (getMEINS() != null) {
            _hashCode += getMEINS().hashCode();
        }
        __hashCodeCalc = false;
        return _hashCode;
    }

    // Type metadata
    private static org.apache.axis.description.TypeDesc typeDesc =
        new org.apache.axis.description.TypeDesc(DT_POS013ITEMS.class, true);

    static {
        typeDesc.setXmlType(new javax.xml.namespace.QName("urn:ecc:pos:base:dealup", ">DT_POS013>ITEMS"));
        org.apache.axis.description.ElementDesc elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("ORDER_NUM");
        elemField.setXmlName(new javax.xml.namespace.QName("", "ORDER_NUM"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("BUDAT");
        elemField.setXmlName(new javax.xml.namespace.QName("", "BUDAT"));
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
        elemField.setFieldName("BWART");
        elemField.setXmlName(new javax.xml.namespace.QName("", "BWART"));
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
        elemField.setFieldName("MENGE");
        elemField.setXmlName(new javax.xml.namespace.QName("", "MENGE"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "double"));
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
