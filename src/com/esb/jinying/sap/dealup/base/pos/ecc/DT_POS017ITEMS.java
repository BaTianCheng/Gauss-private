/**
 * DT_POS017ITEMS.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package com.esb.jinying.sap.dealup.base.pos.ecc;

public class DT_POS017ITEMS  implements java.io.Serializable {
    /* 日期 */
    private java.lang.String BUDAT;

    /* 合同 */
    private java.lang.String ZZ001;

    /* 商品编码 */
    private java.lang.String MATNR;

    /* 买/用 */
    private java.lang.String ZMY;

    /* 现金渠道 */
    private java.lang.String ZMODE;

    /* 售/退货 */
    private java.lang.String ZFLAG;

    /* 优惠券类型 */
    private java.lang.String ZYHQLX;

    /* 商品的税分类 */
    private java.lang.String TAXKM;

    /* 券值 */
    private java.lang.Double ZZFPJE;

    /* 现金支付 */
    private java.lang.Double ZJINE;

    /* 优惠券 */
    private java.lang.Double ZYHQ;

    /* 赠品 */
    private java.lang.String ZFREE;

    /* 数量 */
    private java.lang.Double MENGE;

    /* 公司代码 */
    private java.lang.String BUKRS;

    public DT_POS017ITEMS() {
    }

    public DT_POS017ITEMS(
           java.lang.String BUDAT,
           java.lang.String ZZ001,
           java.lang.String MATNR,
           java.lang.String ZMY,
           java.lang.String ZMODE,
           java.lang.String ZFLAG,
           java.lang.String ZYHQLX,
           java.lang.String TAXKM,
           java.lang.Double ZZFPJE,
           java.lang.Double ZJINE,
           java.lang.Double ZYHQ,
           java.lang.String ZFREE,
           java.lang.Double MENGE,
           java.lang.String BUKRS) {
           this.BUDAT = BUDAT;
           this.ZZ001 = ZZ001;
           this.MATNR = MATNR;
           this.ZMY = ZMY;
           this.ZMODE = ZMODE;
           this.ZFLAG = ZFLAG;
           this.ZYHQLX = ZYHQLX;
           this.TAXKM = TAXKM;
           this.ZZFPJE = ZZFPJE;
           this.ZJINE = ZJINE;
           this.ZYHQ = ZYHQ;
           this.ZFREE = ZFREE;
           this.MENGE = MENGE;
           this.BUKRS = BUKRS;
    }


    /**
     * Gets the BUDAT value for this DT_POS017ITEMS.
     * 
     * @return BUDAT   * 日期
     */
    public java.lang.String getBUDAT() {
        return BUDAT;
    }


    /**
     * Sets the BUDAT value for this DT_POS017ITEMS.
     * 
     * @param BUDAT   * 日期
     */
    public void setBUDAT(java.lang.String BUDAT) {
        this.BUDAT = BUDAT;
    }


    /**
     * Gets the ZZ001 value for this DT_POS017ITEMS.
     * 
     * @return ZZ001   * 合同
     */
    public java.lang.String getZZ001() {
        return ZZ001;
    }


    /**
     * Sets the ZZ001 value for this DT_POS017ITEMS.
     * 
     * @param ZZ001   * 合同
     */
    public void setZZ001(java.lang.String ZZ001) {
        this.ZZ001 = ZZ001;
    }


    /**
     * Gets the MATNR value for this DT_POS017ITEMS.
     * 
     * @return MATNR   * 商品编码
     */
    public java.lang.String getMATNR() {
        return MATNR;
    }


    /**
     * Sets the MATNR value for this DT_POS017ITEMS.
     * 
     * @param MATNR   * 商品编码
     */
    public void setMATNR(java.lang.String MATNR) {
        this.MATNR = MATNR;
    }


    /**
     * Gets the ZMY value for this DT_POS017ITEMS.
     * 
     * @return ZMY   * 买/用
     */
    public java.lang.String getZMY() {
        return ZMY;
    }


    /**
     * Sets the ZMY value for this DT_POS017ITEMS.
     * 
     * @param ZMY   * 买/用
     */
    public void setZMY(java.lang.String ZMY) {
        this.ZMY = ZMY;
    }


    /**
     * Gets the ZMODE value for this DT_POS017ITEMS.
     * 
     * @return ZMODE   * 现金渠道
     */
    public java.lang.String getZMODE() {
        return ZMODE;
    }


    /**
     * Sets the ZMODE value for this DT_POS017ITEMS.
     * 
     * @param ZMODE   * 现金渠道
     */
    public void setZMODE(java.lang.String ZMODE) {
        this.ZMODE = ZMODE;
    }


    /**
     * Gets the ZFLAG value for this DT_POS017ITEMS.
     * 
     * @return ZFLAG   * 售/退货
     */
    public java.lang.String getZFLAG() {
        return ZFLAG;
    }


    /**
     * Sets the ZFLAG value for this DT_POS017ITEMS.
     * 
     * @param ZFLAG   * 售/退货
     */
    public void setZFLAG(java.lang.String ZFLAG) {
        this.ZFLAG = ZFLAG;
    }


    /**
     * Gets the ZYHQLX value for this DT_POS017ITEMS.
     * 
     * @return ZYHQLX   * 优惠券类型
     */
    public java.lang.String getZYHQLX() {
        return ZYHQLX;
    }


    /**
     * Sets the ZYHQLX value for this DT_POS017ITEMS.
     * 
     * @param ZYHQLX   * 优惠券类型
     */
    public void setZYHQLX(java.lang.String ZYHQLX) {
        this.ZYHQLX = ZYHQLX;
    }


    /**
     * Gets the TAXKM value for this DT_POS017ITEMS.
     * 
     * @return TAXKM   * 商品的税分类
     */
    public java.lang.String getTAXKM() {
        return TAXKM;
    }


    /**
     * Sets the TAXKM value for this DT_POS017ITEMS.
     * 
     * @param TAXKM   * 商品的税分类
     */
    public void setTAXKM(java.lang.String TAXKM) {
        this.TAXKM = TAXKM;
    }


    /**
     * Gets the ZZFPJE value for this DT_POS017ITEMS.
     * 
     * @return ZZFPJE   * 券值
     */
    public java.lang.Double getZZFPJE() {
        return ZZFPJE;
    }


    /**
     * Sets the ZZFPJE value for this DT_POS017ITEMS.
     * 
     * @param ZZFPJE   * 券值
     */
    public void setZZFPJE(java.lang.Double ZZFPJE) {
        this.ZZFPJE = ZZFPJE;
    }


    /**
     * Gets the ZJINE value for this DT_POS017ITEMS.
     * 
     * @return ZJINE   * 现金支付
     */
    public java.lang.Double getZJINE() {
        return ZJINE;
    }


    /**
     * Sets the ZJINE value for this DT_POS017ITEMS.
     * 
     * @param ZJINE   * 现金支付
     */
    public void setZJINE(java.lang.Double ZJINE) {
        this.ZJINE = ZJINE;
    }


    /**
     * Gets the ZYHQ value for this DT_POS017ITEMS.
     * 
     * @return ZYHQ   * 优惠券
     */
    public java.lang.Double getZYHQ() {
        return ZYHQ;
    }


    /**
     * Sets the ZYHQ value for this DT_POS017ITEMS.
     * 
     * @param ZYHQ   * 优惠券
     */
    public void setZYHQ(java.lang.Double ZYHQ) {
        this.ZYHQ = ZYHQ;
    }


    /**
     * Gets the ZFREE value for this DT_POS017ITEMS.
     * 
     * @return ZFREE   * 赠品
     */
    public java.lang.String getZFREE() {
        return ZFREE;
    }


    /**
     * Sets the ZFREE value for this DT_POS017ITEMS.
     * 
     * @param ZFREE   * 赠品
     */
    public void setZFREE(java.lang.String ZFREE) {
        this.ZFREE = ZFREE;
    }


    /**
     * Gets the MENGE value for this DT_POS017ITEMS.
     * 
     * @return MENGE   * 数量
     */
    public java.lang.Double getMENGE() {
        return MENGE;
    }


    /**
     * Sets the MENGE value for this DT_POS017ITEMS.
     * 
     * @param MENGE   * 数量
     */
    public void setMENGE(java.lang.Double MENGE) {
        this.MENGE = MENGE;
    }


    /**
     * Gets the BUKRS value for this DT_POS017ITEMS.
     * 
     * @return BUKRS   * 公司代码
     */
    public java.lang.String getBUKRS() {
        return BUKRS;
    }


    /**
     * Sets the BUKRS value for this DT_POS017ITEMS.
     * 
     * @param BUKRS   * 公司代码
     */
    public void setBUKRS(java.lang.String BUKRS) {
        this.BUKRS = BUKRS;
    }

    private java.lang.Object __equalsCalc = null;
    public synchronized boolean equals(java.lang.Object obj) {
        if (!(obj instanceof DT_POS017ITEMS)) return false;
        DT_POS017ITEMS other = (DT_POS017ITEMS) obj;
        if (obj == null) return false;
        if (this == obj) return true;
        if (__equalsCalc != null) {
            return (__equalsCalc == obj);
        }
        __equalsCalc = obj;
        boolean _equals;
        _equals = true && 
            ((this.BUDAT==null && other.getBUDAT()==null) || 
             (this.BUDAT!=null &&
              this.BUDAT.equals(other.getBUDAT()))) &&
            ((this.ZZ001==null && other.getZZ001()==null) || 
             (this.ZZ001!=null &&
              this.ZZ001.equals(other.getZZ001()))) &&
            ((this.MATNR==null && other.getMATNR()==null) || 
             (this.MATNR!=null &&
              this.MATNR.equals(other.getMATNR()))) &&
            ((this.ZMY==null && other.getZMY()==null) || 
             (this.ZMY!=null &&
              this.ZMY.equals(other.getZMY()))) &&
            ((this.ZMODE==null && other.getZMODE()==null) || 
             (this.ZMODE!=null &&
              this.ZMODE.equals(other.getZMODE()))) &&
            ((this.ZFLAG==null && other.getZFLAG()==null) || 
             (this.ZFLAG!=null &&
              this.ZFLAG.equals(other.getZFLAG()))) &&
            ((this.ZYHQLX==null && other.getZYHQLX()==null) || 
             (this.ZYHQLX!=null &&
              this.ZYHQLX.equals(other.getZYHQLX()))) &&
            ((this.TAXKM==null && other.getTAXKM()==null) || 
             (this.TAXKM!=null &&
              this.TAXKM.equals(other.getTAXKM()))) &&
            ((this.ZZFPJE==null && other.getZZFPJE()==null) || 
             (this.ZZFPJE!=null &&
              this.ZZFPJE.equals(other.getZZFPJE()))) &&
            ((this.ZJINE==null && other.getZJINE()==null) || 
             (this.ZJINE!=null &&
              this.ZJINE.equals(other.getZJINE()))) &&
            ((this.ZYHQ==null && other.getZYHQ()==null) || 
             (this.ZYHQ!=null &&
              this.ZYHQ.equals(other.getZYHQ()))) &&
            ((this.ZFREE==null && other.getZFREE()==null) || 
             (this.ZFREE!=null &&
              this.ZFREE.equals(other.getZFREE()))) &&
            ((this.MENGE==null && other.getMENGE()==null) || 
             (this.MENGE!=null &&
              this.MENGE.equals(other.getMENGE()))) &&
            ((this.BUKRS==null && other.getBUKRS()==null) || 
             (this.BUKRS!=null &&
              this.BUKRS.equals(other.getBUKRS())));
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
        if (getBUDAT() != null) {
            _hashCode += getBUDAT().hashCode();
        }
        if (getZZ001() != null) {
            _hashCode += getZZ001().hashCode();
        }
        if (getMATNR() != null) {
            _hashCode += getMATNR().hashCode();
        }
        if (getZMY() != null) {
            _hashCode += getZMY().hashCode();
        }
        if (getZMODE() != null) {
            _hashCode += getZMODE().hashCode();
        }
        if (getZFLAG() != null) {
            _hashCode += getZFLAG().hashCode();
        }
        if (getZYHQLX() != null) {
            _hashCode += getZYHQLX().hashCode();
        }
        if (getTAXKM() != null) {
            _hashCode += getTAXKM().hashCode();
        }
        if (getZZFPJE() != null) {
            _hashCode += getZZFPJE().hashCode();
        }
        if (getZJINE() != null) {
            _hashCode += getZJINE().hashCode();
        }
        if (getZYHQ() != null) {
            _hashCode += getZYHQ().hashCode();
        }
        if (getZFREE() != null) {
            _hashCode += getZFREE().hashCode();
        }
        if (getMENGE() != null) {
            _hashCode += getMENGE().hashCode();
        }
        if (getBUKRS() != null) {
            _hashCode += getBUKRS().hashCode();
        }
        __hashCodeCalc = false;
        return _hashCode;
    }

    // Type metadata
    private static org.apache.axis.description.TypeDesc typeDesc =
        new org.apache.axis.description.TypeDesc(DT_POS017ITEMS.class, true);

    static {
        typeDesc.setXmlType(new javax.xml.namespace.QName("urn:ecc:pos:base:dealup", ">DT_POS017>ITEMS"));
        org.apache.axis.description.ElementDesc elemField = new org.apache.axis.description.ElementDesc();
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
        elemField.setFieldName("ZMY");
        elemField.setXmlName(new javax.xml.namespace.QName("", "ZMY"));
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
        elemField.setFieldName("ZYHQLX");
        elemField.setXmlName(new javax.xml.namespace.QName("", "ZYHQLX"));
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
        elemField.setFieldName("ZZFPJE");
        elemField.setXmlName(new javax.xml.namespace.QName("", "ZZFPJE"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "double"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("ZJINE");
        elemField.setXmlName(new javax.xml.namespace.QName("", "ZJINE"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "double"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("ZYHQ");
        elemField.setXmlName(new javax.xml.namespace.QName("", "ZYHQ"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "double"));
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
        elemField.setFieldName("BUKRS");
        elemField.setXmlName(new javax.xml.namespace.QName("", "BUKRS"));
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
