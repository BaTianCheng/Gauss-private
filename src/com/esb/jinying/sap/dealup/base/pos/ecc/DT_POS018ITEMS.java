/**
 * DT_POS018ITEMS.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package com.esb.jinying.sap.dealup.base.pos.ecc;

public class DT_POS018ITEMS  implements java.io.Serializable {
    /* 发货日期 */
    private java.lang.String BUDAT;

    /* GESOP订单号 */
    private java.lang.String ZNUM;

    /* GESOP订单行项目号 */
    private java.lang.String ZITEM;

    /* 兑换日期 */
    private java.lang.String ZDAT;

    /* 合同号 */
    private java.lang.String ZZ001;

    /* 商品编码 */
    private java.lang.String MATNR;

    /* 商品的税分类 */
    private java.lang.String TAXKM;

    /* 优惠券 */
    private java.lang.Double ZYHQ;

    /* 现金 */
    private java.lang.Double ZJINE;

    /* 数量 */
    private java.lang.Double MENGE;

    /* 物流公司 */
    private java.lang.String ZCOMPANY;

    /* 物流公司运单号 */
    private java.lang.String ZORDER;

    /* 物流公司运费 */
    private java.lang.Double ZYF;

    /* 赠品 */
    private java.lang.String ZFREE;

    /* 公司代码 */
    private java.lang.String BUKRS;

    public DT_POS018ITEMS() {
    }

    public DT_POS018ITEMS(
           java.lang.String BUDAT,
           java.lang.String ZNUM,
           java.lang.String ZITEM,
           java.lang.String ZDAT,
           java.lang.String ZZ001,
           java.lang.String MATNR,
           java.lang.String TAXKM,
           java.lang.Double ZYHQ,
           java.lang.Double ZJINE,
           java.lang.Double MENGE,
           java.lang.String ZCOMPANY,
           java.lang.String ZORDER,
           java.lang.Double ZYF,
           java.lang.String ZFREE,
           java.lang.String BUKRS) {
           this.BUDAT = BUDAT;
           this.ZNUM = ZNUM;
           this.ZITEM = ZITEM;
           this.ZDAT = ZDAT;
           this.ZZ001 = ZZ001;
           this.MATNR = MATNR;
           this.TAXKM = TAXKM;
           this.ZYHQ = ZYHQ;
           this.ZJINE = ZJINE;
           this.MENGE = MENGE;
           this.ZCOMPANY = ZCOMPANY;
           this.ZORDER = ZORDER;
           this.ZYF = ZYF;
           this.ZFREE = ZFREE;
           this.BUKRS = BUKRS;
    }


    /**
     * Gets the BUDAT value for this DT_POS018ITEMS.
     * 
     * @return BUDAT   * 发货日期
     */
    public java.lang.String getBUDAT() {
        return BUDAT;
    }


    /**
     * Sets the BUDAT value for this DT_POS018ITEMS.
     * 
     * @param BUDAT   * 发货日期
     */
    public void setBUDAT(java.lang.String BUDAT) {
        this.BUDAT = BUDAT;
    }


    /**
     * Gets the ZNUM value for this DT_POS018ITEMS.
     * 
     * @return ZNUM   * GESOP订单号
     */
    public java.lang.String getZNUM() {
        return ZNUM;
    }


    /**
     * Sets the ZNUM value for this DT_POS018ITEMS.
     * 
     * @param ZNUM   * GESOP订单号
     */
    public void setZNUM(java.lang.String ZNUM) {
        this.ZNUM = ZNUM;
    }


    /**
     * Gets the ZITEM value for this DT_POS018ITEMS.
     * 
     * @return ZITEM   * GESOP订单行项目号
     */
    public java.lang.String getZITEM() {
        return ZITEM;
    }


    /**
     * Sets the ZITEM value for this DT_POS018ITEMS.
     * 
     * @param ZITEM   * GESOP订单行项目号
     */
    public void setZITEM(java.lang.String ZITEM) {
        this.ZITEM = ZITEM;
    }


    /**
     * Gets the ZDAT value for this DT_POS018ITEMS.
     * 
     * @return ZDAT   * 兑换日期
     */
    public java.lang.String getZDAT() {
        return ZDAT;
    }


    /**
     * Sets the ZDAT value for this DT_POS018ITEMS.
     * 
     * @param ZDAT   * 兑换日期
     */
    public void setZDAT(java.lang.String ZDAT) {
        this.ZDAT = ZDAT;
    }


    /**
     * Gets the ZZ001 value for this DT_POS018ITEMS.
     * 
     * @return ZZ001   * 合同号
     */
    public java.lang.String getZZ001() {
        return ZZ001;
    }


    /**
     * Sets the ZZ001 value for this DT_POS018ITEMS.
     * 
     * @param ZZ001   * 合同号
     */
    public void setZZ001(java.lang.String ZZ001) {
        this.ZZ001 = ZZ001;
    }


    /**
     * Gets the MATNR value for this DT_POS018ITEMS.
     * 
     * @return MATNR   * 商品编码
     */
    public java.lang.String getMATNR() {
        return MATNR;
    }


    /**
     * Sets the MATNR value for this DT_POS018ITEMS.
     * 
     * @param MATNR   * 商品编码
     */
    public void setMATNR(java.lang.String MATNR) {
        this.MATNR = MATNR;
    }


    /**
     * Gets the TAXKM value for this DT_POS018ITEMS.
     * 
     * @return TAXKM   * 商品的税分类
     */
    public java.lang.String getTAXKM() {
        return TAXKM;
    }


    /**
     * Sets the TAXKM value for this DT_POS018ITEMS.
     * 
     * @param TAXKM   * 商品的税分类
     */
    public void setTAXKM(java.lang.String TAXKM) {
        this.TAXKM = TAXKM;
    }


    /**
     * Gets the ZYHQ value for this DT_POS018ITEMS.
     * 
     * @return ZYHQ   * 优惠券
     */
    public java.lang.Double getZYHQ() {
        return ZYHQ;
    }


    /**
     * Sets the ZYHQ value for this DT_POS018ITEMS.
     * 
     * @param ZYHQ   * 优惠券
     */
    public void setZYHQ(java.lang.Double ZYHQ) {
        this.ZYHQ = ZYHQ;
    }


    /**
     * Gets the ZJINE value for this DT_POS018ITEMS.
     * 
     * @return ZJINE   * 现金
     */
    public java.lang.Double getZJINE() {
        return ZJINE;
    }


    /**
     * Sets the ZJINE value for this DT_POS018ITEMS.
     * 
     * @param ZJINE   * 现金
     */
    public void setZJINE(java.lang.Double ZJINE) {
        this.ZJINE = ZJINE;
    }


    /**
     * Gets the MENGE value for this DT_POS018ITEMS.
     * 
     * @return MENGE   * 数量
     */
    public java.lang.Double getMENGE() {
        return MENGE;
    }


    /**
     * Sets the MENGE value for this DT_POS018ITEMS.
     * 
     * @param MENGE   * 数量
     */
    public void setMENGE(java.lang.Double MENGE) {
        this.MENGE = MENGE;
    }


    /**
     * Gets the ZCOMPANY value for this DT_POS018ITEMS.
     * 
     * @return ZCOMPANY   * 物流公司
     */
    public java.lang.String getZCOMPANY() {
        return ZCOMPANY;
    }


    /**
     * Sets the ZCOMPANY value for this DT_POS018ITEMS.
     * 
     * @param ZCOMPANY   * 物流公司
     */
    public void setZCOMPANY(java.lang.String ZCOMPANY) {
        this.ZCOMPANY = ZCOMPANY;
    }


    /**
     * Gets the ZORDER value for this DT_POS018ITEMS.
     * 
     * @return ZORDER   * 物流公司运单号
     */
    public java.lang.String getZORDER() {
        return ZORDER;
    }


    /**
     * Sets the ZORDER value for this DT_POS018ITEMS.
     * 
     * @param ZORDER   * 物流公司运单号
     */
    public void setZORDER(java.lang.String ZORDER) {
        this.ZORDER = ZORDER;
    }


    /**
     * Gets the ZYF value for this DT_POS018ITEMS.
     * 
     * @return ZYF   * 物流公司运费
     */
    public java.lang.Double getZYF() {
        return ZYF;
    }


    /**
     * Sets the ZYF value for this DT_POS018ITEMS.
     * 
     * @param ZYF   * 物流公司运费
     */
    public void setZYF(java.lang.Double ZYF) {
        this.ZYF = ZYF;
    }


    /**
     * Gets the ZFREE value for this DT_POS018ITEMS.
     * 
     * @return ZFREE   * 赠品
     */
    public java.lang.String getZFREE() {
        return ZFREE;
    }


    /**
     * Sets the ZFREE value for this DT_POS018ITEMS.
     * 
     * @param ZFREE   * 赠品
     */
    public void setZFREE(java.lang.String ZFREE) {
        this.ZFREE = ZFREE;
    }


    /**
     * Gets the BUKRS value for this DT_POS018ITEMS.
     * 
     * @return BUKRS   * 公司代码
     */
    public java.lang.String getBUKRS() {
        return BUKRS;
    }


    /**
     * Sets the BUKRS value for this DT_POS018ITEMS.
     * 
     * @param BUKRS   * 公司代码
     */
    public void setBUKRS(java.lang.String BUKRS) {
        this.BUKRS = BUKRS;
    }

    private java.lang.Object __equalsCalc = null;
    public synchronized boolean equals(java.lang.Object obj) {
        if (!(obj instanceof DT_POS018ITEMS)) return false;
        DT_POS018ITEMS other = (DT_POS018ITEMS) obj;
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
            ((this.ZNUM==null && other.getZNUM()==null) || 
             (this.ZNUM!=null &&
              this.ZNUM.equals(other.getZNUM()))) &&
            ((this.ZITEM==null && other.getZITEM()==null) || 
             (this.ZITEM!=null &&
              this.ZITEM.equals(other.getZITEM()))) &&
            ((this.ZDAT==null && other.getZDAT()==null) || 
             (this.ZDAT!=null &&
              this.ZDAT.equals(other.getZDAT()))) &&
            ((this.ZZ001==null && other.getZZ001()==null) || 
             (this.ZZ001!=null &&
              this.ZZ001.equals(other.getZZ001()))) &&
            ((this.MATNR==null && other.getMATNR()==null) || 
             (this.MATNR!=null &&
              this.MATNR.equals(other.getMATNR()))) &&
            ((this.TAXKM==null && other.getTAXKM()==null) || 
             (this.TAXKM!=null &&
              this.TAXKM.equals(other.getTAXKM()))) &&
            ((this.ZYHQ==null && other.getZYHQ()==null) || 
             (this.ZYHQ!=null &&
              this.ZYHQ.equals(other.getZYHQ()))) &&
            ((this.ZJINE==null && other.getZJINE()==null) || 
             (this.ZJINE!=null &&
              this.ZJINE.equals(other.getZJINE()))) &&
            ((this.MENGE==null && other.getMENGE()==null) || 
             (this.MENGE!=null &&
              this.MENGE.equals(other.getMENGE()))) &&
            ((this.ZCOMPANY==null && other.getZCOMPANY()==null) || 
             (this.ZCOMPANY!=null &&
              this.ZCOMPANY.equals(other.getZCOMPANY()))) &&
            ((this.ZORDER==null && other.getZORDER()==null) || 
             (this.ZORDER!=null &&
              this.ZORDER.equals(other.getZORDER()))) &&
            ((this.ZYF==null && other.getZYF()==null) || 
             (this.ZYF!=null &&
              this.ZYF.equals(other.getZYF()))) &&
            ((this.ZFREE==null && other.getZFREE()==null) || 
             (this.ZFREE!=null &&
              this.ZFREE.equals(other.getZFREE()))) &&
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
        if (getZNUM() != null) {
            _hashCode += getZNUM().hashCode();
        }
        if (getZITEM() != null) {
            _hashCode += getZITEM().hashCode();
        }
        if (getZDAT() != null) {
            _hashCode += getZDAT().hashCode();
        }
        if (getZZ001() != null) {
            _hashCode += getZZ001().hashCode();
        }
        if (getMATNR() != null) {
            _hashCode += getMATNR().hashCode();
        }
        if (getTAXKM() != null) {
            _hashCode += getTAXKM().hashCode();
        }
        if (getZYHQ() != null) {
            _hashCode += getZYHQ().hashCode();
        }
        if (getZJINE() != null) {
            _hashCode += getZJINE().hashCode();
        }
        if (getMENGE() != null) {
            _hashCode += getMENGE().hashCode();
        }
        if (getZCOMPANY() != null) {
            _hashCode += getZCOMPANY().hashCode();
        }
        if (getZORDER() != null) {
            _hashCode += getZORDER().hashCode();
        }
        if (getZYF() != null) {
            _hashCode += getZYF().hashCode();
        }
        if (getZFREE() != null) {
            _hashCode += getZFREE().hashCode();
        }
        if (getBUKRS() != null) {
            _hashCode += getBUKRS().hashCode();
        }
        __hashCodeCalc = false;
        return _hashCode;
    }

    // Type metadata
    private static org.apache.axis.description.TypeDesc typeDesc =
        new org.apache.axis.description.TypeDesc(DT_POS018ITEMS.class, true);

    static {
        typeDesc.setXmlType(new javax.xml.namespace.QName("urn:ecc:pos:base:dealup", ">DT_POS018>ITEMS"));
        org.apache.axis.description.ElementDesc elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("BUDAT");
        elemField.setXmlName(new javax.xml.namespace.QName("", "BUDAT"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("ZNUM");
        elemField.setXmlName(new javax.xml.namespace.QName("", "ZNUM"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("ZITEM");
        elemField.setXmlName(new javax.xml.namespace.QName("", "ZITEM"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("ZDAT");
        elemField.setXmlName(new javax.xml.namespace.QName("", "ZDAT"));
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
        elemField.setFieldName("TAXKM");
        elemField.setXmlName(new javax.xml.namespace.QName("", "TAXKM"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
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
        elemField.setFieldName("ZJINE");
        elemField.setXmlName(new javax.xml.namespace.QName("", "ZJINE"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "double"));
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
        elemField.setFieldName("ZCOMPANY");
        elemField.setXmlName(new javax.xml.namespace.QName("", "ZCOMPANY"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("ZORDER");
        elemField.setXmlName(new javax.xml.namespace.QName("", "ZORDER"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("ZYF");
        elemField.setXmlName(new javax.xml.namespace.QName("", "ZYF"));
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
