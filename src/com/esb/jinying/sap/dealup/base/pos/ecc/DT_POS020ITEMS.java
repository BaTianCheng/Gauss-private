/**
 * DT_POS020ITEMS.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package com.esb.jinying.sap.dealup.base.pos.ecc;

public class DT_POS020ITEMS  implements java.io.Serializable {
    /* 公司代码 */
    private java.lang.String BUKRS;

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

    /* 物流公司 */
    private java.lang.String ZCOMPANY;

    /* 物流公司运单号 */
    private java.lang.String ZORDER;

    /* 物流公司运费 */
    private java.lang.Double ZYF;

    public DT_POS020ITEMS() {
    }

    public DT_POS020ITEMS(
           java.lang.String BUKRS,
           java.lang.String BUDAT,
           java.lang.String ZNUM,
           java.lang.String ZITEM,
           java.lang.String ZDAT,
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
           java.lang.Double ZBANK,
           java.lang.String ZCOMPANY,
           java.lang.String ZORDER,
           java.lang.Double ZYF) {
           this.BUKRS = BUKRS;
           this.BUDAT = BUDAT;
           this.ZNUM = ZNUM;
           this.ZITEM = ZITEM;
           this.ZDAT = ZDAT;
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
           this.ZCOMPANY = ZCOMPANY;
           this.ZORDER = ZORDER;
           this.ZYF = ZYF;
    }


    /**
     * Gets the BUKRS value for this DT_POS020ITEMS.
     * 
     * @return BUKRS   * 公司代码
     */
    public java.lang.String getBUKRS() {
        return BUKRS;
    }


    /**
     * Sets the BUKRS value for this DT_POS020ITEMS.
     * 
     * @param BUKRS   * 公司代码
     */
    public void setBUKRS(java.lang.String BUKRS) {
        this.BUKRS = BUKRS;
    }


    /**
     * Gets the BUDAT value for this DT_POS020ITEMS.
     * 
     * @return BUDAT   * 发货日期
     */
    public java.lang.String getBUDAT() {
        return BUDAT;
    }


    /**
     * Sets the BUDAT value for this DT_POS020ITEMS.
     * 
     * @param BUDAT   * 发货日期
     */
    public void setBUDAT(java.lang.String BUDAT) {
        this.BUDAT = BUDAT;
    }


    /**
     * Gets the ZNUM value for this DT_POS020ITEMS.
     * 
     * @return ZNUM   * GESOP订单号
     */
    public java.lang.String getZNUM() {
        return ZNUM;
    }


    /**
     * Sets the ZNUM value for this DT_POS020ITEMS.
     * 
     * @param ZNUM   * GESOP订单号
     */
    public void setZNUM(java.lang.String ZNUM) {
        this.ZNUM = ZNUM;
    }


    /**
     * Gets the ZITEM value for this DT_POS020ITEMS.
     * 
     * @return ZITEM   * GESOP订单行项目号
     */
    public java.lang.String getZITEM() {
        return ZITEM;
    }


    /**
     * Sets the ZITEM value for this DT_POS020ITEMS.
     * 
     * @param ZITEM   * GESOP订单行项目号
     */
    public void setZITEM(java.lang.String ZITEM) {
        this.ZITEM = ZITEM;
    }


    /**
     * Gets the ZDAT value for this DT_POS020ITEMS.
     * 
     * @return ZDAT   * 兑换日期
     */
    public java.lang.String getZDAT() {
        return ZDAT;
    }


    /**
     * Sets the ZDAT value for this DT_POS020ITEMS.
     * 
     * @param ZDAT   * 兑换日期
     */
    public void setZDAT(java.lang.String ZDAT) {
        this.ZDAT = ZDAT;
    }


    /**
     * Gets the ZZ001 value for this DT_POS020ITEMS.
     * 
     * @return ZZ001   * 合同号
     */
    public java.lang.String getZZ001() {
        return ZZ001;
    }


    /**
     * Sets the ZZ001 value for this DT_POS020ITEMS.
     * 
     * @param ZZ001   * 合同号
     */
    public void setZZ001(java.lang.String ZZ001) {
        this.ZZ001 = ZZ001;
    }


    /**
     * Gets the MATNR value for this DT_POS020ITEMS.
     * 
     * @return MATNR   * 商品编码
     */
    public java.lang.String getMATNR() {
        return MATNR;
    }


    /**
     * Sets the MATNR value for this DT_POS020ITEMS.
     * 
     * @param MATNR   * 商品编码
     */
    public void setMATNR(java.lang.String MATNR) {
        this.MATNR = MATNR;
    }


    /**
     * Gets the ZMODE value for this DT_POS020ITEMS.
     * 
     * @return ZMODE   * 现金渠道
     */
    public java.lang.String getZMODE() {
        return ZMODE;
    }


    /**
     * Sets the ZMODE value for this DT_POS020ITEMS.
     * 
     * @param ZMODE   * 现金渠道
     */
    public void setZMODE(java.lang.String ZMODE) {
        this.ZMODE = ZMODE;
    }


    /**
     * Gets the ZFLAG value for this DT_POS020ITEMS.
     * 
     * @return ZFLAG   * 售/退货
     */
    public java.lang.String getZFLAG() {
        return ZFLAG;
    }


    /**
     * Sets the ZFLAG value for this DT_POS020ITEMS.
     * 
     * @param ZFLAG   * 售/退货
     */
    public void setZFLAG(java.lang.String ZFLAG) {
        this.ZFLAG = ZFLAG;
    }


    /**
     * Gets the TAXKM value for this DT_POS020ITEMS.
     * 
     * @return TAXKM   * 商品的税分类
     */
    public java.lang.String getTAXKM() {
        return TAXKM;
    }


    /**
     * Sets the TAXKM value for this DT_POS020ITEMS.
     * 
     * @param TAXKM   * 商品的税分类
     */
    public void setTAXKM(java.lang.String TAXKM) {
        this.TAXKM = TAXKM;
    }


    /**
     * Gets the ZFREE value for this DT_POS020ITEMS.
     * 
     * @return ZFREE   * 赠品
     */
    public java.lang.String getZFREE() {
        return ZFREE;
    }


    /**
     * Sets the ZFREE value for this DT_POS020ITEMS.
     * 
     * @param ZFREE   * 赠品
     */
    public void setZFREE(java.lang.String ZFREE) {
        this.ZFREE = ZFREE;
    }


    /**
     * Gets the MENGE value for this DT_POS020ITEMS.
     * 
     * @return MENGE   * 数量
     */
    public java.lang.Double getMENGE() {
        return MENGE;
    }


    /**
     * Sets the MENGE value for this DT_POS020ITEMS.
     * 
     * @param MENGE   * 数量
     */
    public void setMENGE(java.lang.Double MENGE) {
        this.MENGE = MENGE;
    }


    /**
     * Gets the ZZFPJE value for this DT_POS020ITEMS.
     * 
     * @return ZZFPJE   * 券值
     */
    public java.lang.Double getZZFPJE() {
        return ZZFPJE;
    }


    /**
     * Sets the ZZFPJE value for this DT_POS020ITEMS.
     * 
     * @param ZZFPJE   * 券值
     */
    public void setZZFPJE(java.lang.Double ZZFPJE) {
        this.ZZFPJE = ZZFPJE;
    }


    /**
     * Gets the ZRETAIL value for this DT_POS020ITEMS.
     * 
     * @return ZRETAIL   * 零售金额
     */
    public java.lang.Double getZRETAIL() {
        return ZRETAIL;
    }


    /**
     * Sets the ZRETAIL value for this DT_POS020ITEMS.
     * 
     * @param ZRETAIL   * 零售金额
     */
    public void setZRETAIL(java.lang.Double ZRETAIL) {
        this.ZRETAIL = ZRETAIL;
    }


    /**
     * Gets the ZDISCOUNT value for this DT_POS020ITEMS.
     * 
     * @return ZDISCOUNT   * 折扣金额
     */
    public java.lang.Double getZDISCOUNT() {
        return ZDISCOUNT;
    }


    /**
     * Sets the ZDISCOUNT value for this DT_POS020ITEMS.
     * 
     * @param ZDISCOUNT   * 折扣金额
     */
    public void setZDISCOUNT(java.lang.Double ZDISCOUNT) {
        this.ZDISCOUNT = ZDISCOUNT;
    }


    /**
     * Gets the ZVOUCHER_C value for this DT_POS020ITEMS.
     * 
     * @return ZVOUCHER_C   * 中心券
     */
    public java.lang.Double getZVOUCHER_C() {
        return ZVOUCHER_C;
    }


    /**
     * Sets the ZVOUCHER_C value for this DT_POS020ITEMS.
     * 
     * @param ZVOUCHER_C   * 中心券
     */
    public void setZVOUCHER_C(java.lang.Double ZVOUCHER_C) {
        this.ZVOUCHER_C = ZVOUCHER_C;
    }


    /**
     * Gets the ZVOUCHER_V value for this DT_POS020ITEMS.
     * 
     * @return ZVOUCHER_V   * 厂商券
     */
    public java.lang.Double getZVOUCHER_V() {
        return ZVOUCHER_V;
    }


    /**
     * Sets the ZVOUCHER_V value for this DT_POS020ITEMS.
     * 
     * @param ZVOUCHER_V   * 厂商券
     */
    public void setZVOUCHER_V(java.lang.Double ZVOUCHER_V) {
        this.ZVOUCHER_V = ZVOUCHER_V;
    }


    /**
     * Gets the ZBANK value for this DT_POS020ITEMS.
     * 
     * @return ZBANK   * 银行实收
     */
    public java.lang.Double getZBANK() {
        return ZBANK;
    }


    /**
     * Sets the ZBANK value for this DT_POS020ITEMS.
     * 
     * @param ZBANK   * 银行实收
     */
    public void setZBANK(java.lang.Double ZBANK) {
        this.ZBANK = ZBANK;
    }


    /**
     * Gets the ZCOMPANY value for this DT_POS020ITEMS.
     * 
     * @return ZCOMPANY   * 物流公司
     */
    public java.lang.String getZCOMPANY() {
        return ZCOMPANY;
    }


    /**
     * Sets the ZCOMPANY value for this DT_POS020ITEMS.
     * 
     * @param ZCOMPANY   * 物流公司
     */
    public void setZCOMPANY(java.lang.String ZCOMPANY) {
        this.ZCOMPANY = ZCOMPANY;
    }


    /**
     * Gets the ZORDER value for this DT_POS020ITEMS.
     * 
     * @return ZORDER   * 物流公司运单号
     */
    public java.lang.String getZORDER() {
        return ZORDER;
    }


    /**
     * Sets the ZORDER value for this DT_POS020ITEMS.
     * 
     * @param ZORDER   * 物流公司运单号
     */
    public void setZORDER(java.lang.String ZORDER) {
        this.ZORDER = ZORDER;
    }


    /**
     * Gets the ZYF value for this DT_POS020ITEMS.
     * 
     * @return ZYF   * 物流公司运费
     */
    public java.lang.Double getZYF() {
        return ZYF;
    }


    /**
     * Sets the ZYF value for this DT_POS020ITEMS.
     * 
     * @param ZYF   * 物流公司运费
     */
    public void setZYF(java.lang.Double ZYF) {
        this.ZYF = ZYF;
    }

    private java.lang.Object __equalsCalc = null;
    public synchronized boolean equals(java.lang.Object obj) {
        if (!(obj instanceof DT_POS020ITEMS)) return false;
        DT_POS020ITEMS other = (DT_POS020ITEMS) obj;
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
              this.ZBANK.equals(other.getZBANK()))) &&
            ((this.ZCOMPANY==null && other.getZCOMPANY()==null) || 
             (this.ZCOMPANY!=null &&
              this.ZCOMPANY.equals(other.getZCOMPANY()))) &&
            ((this.ZORDER==null && other.getZORDER()==null) || 
             (this.ZORDER!=null &&
              this.ZORDER.equals(other.getZORDER()))) &&
            ((this.ZYF==null && other.getZYF()==null) || 
             (this.ZYF!=null &&
              this.ZYF.equals(other.getZYF())));
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
        if (getZCOMPANY() != null) {
            _hashCode += getZCOMPANY().hashCode();
        }
        if (getZORDER() != null) {
            _hashCode += getZORDER().hashCode();
        }
        if (getZYF() != null) {
            _hashCode += getZYF().hashCode();
        }
        __hashCodeCalc = false;
        return _hashCode;
    }

    // Type metadata
    private static org.apache.axis.description.TypeDesc typeDesc =
        new org.apache.axis.description.TypeDesc(DT_POS020ITEMS.class, true);

    static {
        typeDesc.setXmlType(new javax.xml.namespace.QName("urn:ecc:pos:base:dealup", ">DT_POS020>ITEMS"));
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
