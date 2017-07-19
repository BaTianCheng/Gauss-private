/**
 * DT_POS019ITEMS.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package com.esb.jinying.sap.dealup.base.pos.ecc;

public class DT_POS019ITEMS  implements java.io.Serializable {
    /* 公司代码 */
    private java.lang.String BUKRS;

    /* 销售日期 */
    private java.lang.String BUDAT;

    /* 合同 */
    private java.lang.String ZZ001;

    /* 商品编码 */
    private java.lang.String MATNR;

    /* 现金渠道 */
    private java.lang.String ZMODE;

    /* 售/退货 */
    private java.lang.String ZFLAG;

    /* 商品的税分类 */
    private java.lang.String TAXKM;

    /* 赠品 */
    private java.lang.String ZFREE;

    /* 数量 */
    private java.lang.Double MENGE;

    /* 券值 */
    private java.lang.Double ZZFPJE;

    /* 零售金额 */
    private java.lang.Double ZRETAIL;

    /* 折扣金额 */
    private java.lang.Double ZDISCOUNT;

    /* 中心券 */
    private java.lang.Double ZVOUCHER_C;

    /* 厂商券 */
    private java.lang.Double ZVOUCHER_V;

    /* 银行实收 */
    private java.lang.Double ZBANK;

    public DT_POS019ITEMS() {
    }

    public DT_POS019ITEMS(
           java.lang.String BUKRS,
           java.lang.String BUDAT,
           java.lang.String ZZ001,
           java.lang.String MATNR,
           java.lang.String ZMODE,
           java.lang.String ZFLAG,
           java.lang.String TAXKM,
           java.lang.String ZFREE,
           java.lang.Double MENGE,
           java.lang.Double ZZFPJE,
           java.lang.Double ZRETAIL,
           java.lang.Double ZDISCOUNT,
           java.lang.Double ZVOUCHER_C,
           java.lang.Double ZVOUCHER_V,
           java.lang.Double ZBANK) {
           this.BUKRS = BUKRS;
           this.BUDAT = BUDAT;
           this.ZZ001 = ZZ001;
           this.MATNR = MATNR;
           this.ZMODE = ZMODE;
           this.ZFLAG = ZFLAG;
           this.TAXKM = TAXKM;
           this.ZFREE = ZFREE;
           this.MENGE = MENGE;
           this.ZZFPJE = ZZFPJE;
           this.ZRETAIL = ZRETAIL;
           this.ZDISCOUNT = ZDISCOUNT;
           this.ZVOUCHER_C = ZVOUCHER_C;
           this.ZVOUCHER_V = ZVOUCHER_V;
           this.ZBANK = ZBANK;
    }


    /**
     * Gets the BUKRS value for this DT_POS019ITEMS.
     * 
     * @return BUKRS   * 公司代码
     */
    public java.lang.String getBUKRS() {
        return BUKRS;
    }


    /**
     * Sets the BUKRS value for this DT_POS019ITEMS.
     * 
     * @param BUKRS   * 公司代码
     */
    public void setBUKRS(java.lang.String BUKRS) {
        this.BUKRS = BUKRS;
    }


    /**
     * Gets the BUDAT value for this DT_POS019ITEMS.
     * 
     * @return BUDAT   * 销售日期
     */
    public java.lang.String getBUDAT() {
        return BUDAT;
    }


    /**
     * Sets the BUDAT value for this DT_POS019ITEMS.
     * 
     * @param BUDAT   * 销售日期
     */
    public void setBUDAT(java.lang.String BUDAT) {
        this.BUDAT = BUDAT;
    }


    /**
     * Gets the ZZ001 value for this DT_POS019ITEMS.
     * 
     * @return ZZ001   * 合同
     */
    public java.lang.String getZZ001() {
        return ZZ001;
    }


    /**
     * Sets the ZZ001 value for this DT_POS019ITEMS.
     * 
     * @param ZZ001   * 合同
     */
    public void setZZ001(java.lang.String ZZ001) {
        this.ZZ001 = ZZ001;
    }


    /**
     * Gets the MATNR value for this DT_POS019ITEMS.
     * 
     * @return MATNR   * 商品编码
     */
    public java.lang.String getMATNR() {
        return MATNR;
    }


    /**
     * Sets the MATNR value for this DT_POS019ITEMS.
     * 
     * @param MATNR   * 商品编码
     */
    public void setMATNR(java.lang.String MATNR) {
        this.MATNR = MATNR;
    }


    /**
     * Gets the ZMODE value for this DT_POS019ITEMS.
     * 
     * @return ZMODE   * 现金渠道
     */
    public java.lang.String getZMODE() {
        return ZMODE;
    }


    /**
     * Sets the ZMODE value for this DT_POS019ITEMS.
     * 
     * @param ZMODE   * 现金渠道
     */
    public void setZMODE(java.lang.String ZMODE) {
        this.ZMODE = ZMODE;
    }


    /**
     * Gets the ZFLAG value for this DT_POS019ITEMS.
     * 
     * @return ZFLAG   * 售/退货
     */
    public java.lang.String getZFLAG() {
        return ZFLAG;
    }


    /**
     * Sets the ZFLAG value for this DT_POS019ITEMS.
     * 
     * @param ZFLAG   * 售/退货
     */
    public void setZFLAG(java.lang.String ZFLAG) {
        this.ZFLAG = ZFLAG;
    }


    /**
     * Gets the TAXKM value for this DT_POS019ITEMS.
     * 
     * @return TAXKM   * 商品的税分类
     */
    public java.lang.String getTAXKM() {
        return TAXKM;
    }


    /**
     * Sets the TAXKM value for this DT_POS019ITEMS.
     * 
     * @param TAXKM   * 商品的税分类
     */
    public void setTAXKM(java.lang.String TAXKM) {
        this.TAXKM = TAXKM;
    }


    /**
     * Gets the ZFREE value for this DT_POS019ITEMS.
     * 
     * @return ZFREE   * 赠品
     */
    public java.lang.String getZFREE() {
        return ZFREE;
    }


    /**
     * Sets the ZFREE value for this DT_POS019ITEMS.
     * 
     * @param ZFREE   * 赠品
     */
    public void setZFREE(java.lang.String ZFREE) {
        this.ZFREE = ZFREE;
    }


    /**
     * Gets the MENGE value for this DT_POS019ITEMS.
     * 
     * @return MENGE   * 数量
     */
    public java.lang.Double getMENGE() {
        return MENGE;
    }


    /**
     * Sets the MENGE value for this DT_POS019ITEMS.
     * 
     * @param MENGE   * 数量
     */
    public void setMENGE(java.lang.Double MENGE) {
        this.MENGE = MENGE;
    }


    /**
     * Gets the ZZFPJE value for this DT_POS019ITEMS.
     * 
     * @return ZZFPJE   * 券值
     */
    public java.lang.Double getZZFPJE() {
        return ZZFPJE;
    }


    /**
     * Sets the ZZFPJE value for this DT_POS019ITEMS.
     * 
     * @param ZZFPJE   * 券值
     */
    public void setZZFPJE(java.lang.Double ZZFPJE) {
        this.ZZFPJE = ZZFPJE;
    }


    /**
     * Gets the ZRETAIL value for this DT_POS019ITEMS.
     * 
     * @return ZRETAIL   * 零售金额
     */
    public java.lang.Double getZRETAIL() {
        return ZRETAIL;
    }


    /**
     * Sets the ZRETAIL value for this DT_POS019ITEMS.
     * 
     * @param ZRETAIL   * 零售金额
     */
    public void setZRETAIL(java.lang.Double ZRETAIL) {
        this.ZRETAIL = ZRETAIL;
    }


    /**
     * Gets the ZDISCOUNT value for this DT_POS019ITEMS.
     * 
     * @return ZDISCOUNT   * 折扣金额
     */
    public java.lang.Double getZDISCOUNT() {
        return ZDISCOUNT;
    }


    /**
     * Sets the ZDISCOUNT value for this DT_POS019ITEMS.
     * 
     * @param ZDISCOUNT   * 折扣金额
     */
    public void setZDISCOUNT(java.lang.Double ZDISCOUNT) {
        this.ZDISCOUNT = ZDISCOUNT;
    }


    /**
     * Gets the ZVOUCHER_C value for this DT_POS019ITEMS.
     * 
     * @return ZVOUCHER_C   * 中心券
     */
    public java.lang.Double getZVOUCHER_C() {
        return ZVOUCHER_C;
    }


    /**
     * Sets the ZVOUCHER_C value for this DT_POS019ITEMS.
     * 
     * @param ZVOUCHER_C   * 中心券
     */
    public void setZVOUCHER_C(java.lang.Double ZVOUCHER_C) {
        this.ZVOUCHER_C = ZVOUCHER_C;
    }


    /**
     * Gets the ZVOUCHER_V value for this DT_POS019ITEMS.
     * 
     * @return ZVOUCHER_V   * 厂商券
     */
    public java.lang.Double getZVOUCHER_V() {
        return ZVOUCHER_V;
    }


    /**
     * Sets the ZVOUCHER_V value for this DT_POS019ITEMS.
     * 
     * @param ZVOUCHER_V   * 厂商券
     */
    public void setZVOUCHER_V(java.lang.Double ZVOUCHER_V) {
        this.ZVOUCHER_V = ZVOUCHER_V;
    }


    /**
     * Gets the ZBANK value for this DT_POS019ITEMS.
     * 
     * @return ZBANK   * 银行实收
     */
    public java.lang.Double getZBANK() {
        return ZBANK;
    }


    /**
     * Sets the ZBANK value for this DT_POS019ITEMS.
     * 
     * @param ZBANK   * 银行实收
     */
    public void setZBANK(java.lang.Double ZBANK) {
        this.ZBANK = ZBANK;
    }

    private java.lang.Object __equalsCalc = null;
    public synchronized boolean equals(java.lang.Object obj) {
        if (!(obj instanceof DT_POS019ITEMS)) return false;
        DT_POS019ITEMS other = (DT_POS019ITEMS) obj;
        if (obj == null) return false;
        if (this == obj) return true;
        if (__equalsCalc != null) {
            return (__equalsCalc == obj);
        }
        __equalsCalc = obj;
        boolean _equals;
        _equals = true && 
            ((this.BUKRS==null && other.getBUKRS()==null) || 
             (this.BUKRS!=null &&
              this.BUKRS.equals(other.getBUKRS()))) &&
            ((this.BUDAT==null && other.getBUDAT()==null) || 
             (this.BUDAT!=null &&
              this.BUDAT.equals(other.getBUDAT()))) &&
            ((this.ZZ001==null && other.getZZ001()==null) || 
             (this.ZZ001!=null &&
              this.ZZ001.equals(other.getZZ001()))) &&
            ((this.MATNR==null && other.getMATNR()==null) || 
             (this.MATNR!=null &&
              this.MATNR.equals(other.getMATNR()))) &&
            ((this.ZMODE==null && other.getZMODE()==null) || 
             (this.ZMODE!=null &&
              this.ZMODE.equals(other.getZMODE()))) &&
            ((this.ZFLAG==null && other.getZFLAG()==null) || 
             (this.ZFLAG!=null &&
              this.ZFLAG.equals(other.getZFLAG()))) &&
            ((this.TAXKM==null && other.getTAXKM()==null) || 
             (this.TAXKM!=null &&
              this.TAXKM.equals(other.getTAXKM()))) &&
            ((this.ZFREE==null && other.getZFREE()==null) || 
             (this.ZFREE!=null &&
              this.ZFREE.equals(other.getZFREE()))) &&
            ((this.MENGE==null && other.getMENGE()==null) || 
             (this.MENGE!=null &&
              this.MENGE.equals(other.getMENGE()))) &&
            ((this.ZZFPJE==null && other.getZZFPJE()==null) || 
             (this.ZZFPJE!=null &&
              this.ZZFPJE.equals(other.getZZFPJE()))) &&
            ((this.ZRETAIL==null && other.getZRETAIL()==null) || 
             (this.ZRETAIL!=null &&
              this.ZRETAIL.equals(other.getZRETAIL()))) &&
            ((this.ZDISCOUNT==null && other.getZDISCOUNT()==null) || 
             (this.ZDISCOUNT!=null &&
              this.ZDISCOUNT.equals(other.getZDISCOUNT()))) &&
            ((this.ZVOUCHER_C==null && other.getZVOUCHER_C()==null) || 
             (this.ZVOUCHER_C!=null &&
              this.ZVOUCHER_C.equals(other.getZVOUCHER_C()))) &&
            ((this.ZVOUCHER_V==null && other.getZVOUCHER_V()==null) || 
             (this.ZVOUCHER_V!=null &&
              this.ZVOUCHER_V.equals(other.getZVOUCHER_V()))) &&
            ((this.ZBANK==null && other.getZBANK()==null) || 
             (this.ZBANK!=null &&
              this.ZBANK.equals(other.getZBANK())));
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
        if (getBUKRS() != null) {
            _hashCode += getBUKRS().hashCode();
        }
        if (getBUDAT() != null) {
            _hashCode += getBUDAT().hashCode();
        }
        if (getZZ001() != null) {
            _hashCode += getZZ001().hashCode();
        }
        if (getMATNR() != null) {
            _hashCode += getMATNR().hashCode();
        }
        if (getZMODE() != null) {
            _hashCode += getZMODE().hashCode();
        }
        if (getZFLAG() != null) {
            _hashCode += getZFLAG().hashCode();
        }
        if (getTAXKM() != null) {
            _hashCode += getTAXKM().hashCode();
        }
        if (getZFREE() != null) {
            _hashCode += getZFREE().hashCode();
        }
        if (getMENGE() != null) {
            _hashCode += getMENGE().hashCode();
        }
        if (getZZFPJE() != null) {
            _hashCode += getZZFPJE().hashCode();
        }
        if (getZRETAIL() != null) {
            _hashCode += getZRETAIL().hashCode();
        }
        if (getZDISCOUNT() != null) {
            _hashCode += getZDISCOUNT().hashCode();
        }
        if (getZVOUCHER_C() != null) {
            _hashCode += getZVOUCHER_C().hashCode();
        }
        if (getZVOUCHER_V() != null) {
            _hashCode += getZVOUCHER_V().hashCode();
        }
        if (getZBANK() != null) {
            _hashCode += getZBANK().hashCode();
        }
        __hashCodeCalc = false;
        return _hashCode;
    }

    // Type metadata
    private static org.apache.axis.description.TypeDesc typeDesc =
        new org.apache.axis.description.TypeDesc(DT_POS019ITEMS.class, true);

    static {
        typeDesc.setXmlType(new javax.xml.namespace.QName("urn:ecc:pos:base:dealup", ">DT_POS019>ITEMS"));
        org.apache.axis.description.ElementDesc elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("BUKRS");
        elemField.setXmlName(new javax.xml.namespace.QName("", "BUKRS"));
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
        elemField.setFieldName("ZZ001");
        elemField.setXmlName(new javax.xml.namespace.QName("", "ZZ001"));
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
        elemField.setFieldName("ZMODE");
        elemField.setXmlName(new javax.xml.namespace.QName("", "ZMODE"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("ZFLAG");
        elemField.setXmlName(new javax.xml.namespace.QName("", "ZFLAG"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("TAXKM");
        elemField.setXmlName(new javax.xml.namespace.QName("", "TAXKM"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("ZFREE");
        elemField.setXmlName(new javax.xml.namespace.QName("", "ZFREE"));
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
        elemField.setFieldName("ZZFPJE");
        elemField.setXmlName(new javax.xml.namespace.QName("", "ZZFPJE"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "double"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("ZRETAIL");
        elemField.setXmlName(new javax.xml.namespace.QName("", "ZRETAIL"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "double"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("ZDISCOUNT");
        elemField.setXmlName(new javax.xml.namespace.QName("", "ZDISCOUNT"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "double"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("ZVOUCHER_C");
        elemField.setXmlName(new javax.xml.namespace.QName("", "ZVOUCHER_C"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "double"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("ZVOUCHER_V");
        elemField.setXmlName(new javax.xml.namespace.QName("", "ZVOUCHER_V"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "double"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("ZBANK");
        elemField.setXmlName(new javax.xml.namespace.QName("", "ZBANK"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "double"));
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
