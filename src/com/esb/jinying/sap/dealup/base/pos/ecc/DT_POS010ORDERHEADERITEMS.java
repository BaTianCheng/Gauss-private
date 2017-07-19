/**
 * DT_POS010ORDERHEADERITEMS.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package com.esb.jinying.sap.dealup.base.pos.ecc;

public class DT_POS010ORDERHEADERITEMS  implements java.io.Serializable {
    /* 行号 */
    private java.lang.String RETAILNUMBER;

    /* 部门 */
    private java.lang.String VKGRP;

    /* 柜组 */
    private java.lang.String VKBUR;

    /* 行交易类型 */
    private java.lang.String RETAILTYPECODE;

    /* 商品编码 */
    private java.lang.String ITEMID;

    /* 数量 */
    private java.lang.Double RETAILQUANTITY;

    /* 单位 */
    private java.lang.String SALESUOM;

    /* 标准价金额 */
    private java.lang.Double NORMALSALESAMT;

    /* 实际金额 */
    private java.lang.Double SALESAMOUNT;

    /* 成本 */
    private java.lang.Double COST;

    /* 促销号码 */
    private java.lang.String PROMOTIONID;

    /* 合同 */
    private java.lang.String CONTRACT;

    /* 库存地点 */
    private java.lang.String LGORT;

    /* 签约部门 */
    private java.lang.String DEP_SIGNER;

    /* 经营方式 */
    private java.lang.String ITEM_CAT;

    /* EAN码 */
    private java.lang.String EAN11;

    /* 积分系数 */
    private java.lang.String INTE_RATE;

    /* 积分 */
    private java.lang.String INTEGRAL;

    /* 行项目折扣 */
    private com.esb.jinying.sap.dealup.base.pos.ecc.DT_POS010ORDERHEADERITEMSITEMDISCOUNT[] ITEMDISCOUNT;

    public DT_POS010ORDERHEADERITEMS() {
    }

    public DT_POS010ORDERHEADERITEMS(
           java.lang.String RETAILNUMBER,
           java.lang.String VKGRP,
           java.lang.String VKBUR,
           java.lang.String RETAILTYPECODE,
           java.lang.String ITEMID,
           java.lang.Double RETAILQUANTITY,
           java.lang.String SALESUOM,
           java.lang.Double NORMALSALESAMT,
           java.lang.Double SALESAMOUNT,
           java.lang.Double COST,
           java.lang.String PROMOTIONID,
           java.lang.String CONTRACT,
           java.lang.String LGORT,
           java.lang.String DEP_SIGNER,
           java.lang.String ITEM_CAT,
           java.lang.String EAN11,
           java.lang.String INTE_RATE,
           java.lang.String INTEGRAL,
           com.esb.jinying.sap.dealup.base.pos.ecc.DT_POS010ORDERHEADERITEMSITEMDISCOUNT[] ITEMDISCOUNT) {
           this.RETAILNUMBER = RETAILNUMBER;
           this.VKGRP = VKGRP;
           this.VKBUR = VKBUR;
           this.RETAILTYPECODE = RETAILTYPECODE;
           this.ITEMID = ITEMID;
           this.RETAILQUANTITY = RETAILQUANTITY;
           this.SALESUOM = SALESUOM;
           this.NORMALSALESAMT = NORMALSALESAMT;
           this.SALESAMOUNT = SALESAMOUNT;
           this.COST = COST;
           this.PROMOTIONID = PROMOTIONID;
           this.CONTRACT = CONTRACT;
           this.LGORT = LGORT;
           this.DEP_SIGNER = DEP_SIGNER;
           this.ITEM_CAT = ITEM_CAT;
           this.EAN11 = EAN11;
           this.INTE_RATE = INTE_RATE;
           this.INTEGRAL = INTEGRAL;
           this.ITEMDISCOUNT = ITEMDISCOUNT;
    }


    /**
     * Gets the RETAILNUMBER value for this DT_POS010ORDERHEADERITEMS.
     * 
     * @return RETAILNUMBER   * 行号
     */
    public java.lang.String getRETAILNUMBER() {
        return RETAILNUMBER;
    }


    /**
     * Sets the RETAILNUMBER value for this DT_POS010ORDERHEADERITEMS.
     * 
     * @param RETAILNUMBER   * 行号
     */
    public void setRETAILNUMBER(java.lang.String RETAILNUMBER) {
        this.RETAILNUMBER = RETAILNUMBER;
    }


    /**
     * Gets the VKGRP value for this DT_POS010ORDERHEADERITEMS.
     * 
     * @return VKGRP   * 部门
     */
    public java.lang.String getVKGRP() {
        return VKGRP;
    }


    /**
     * Sets the VKGRP value for this DT_POS010ORDERHEADERITEMS.
     * 
     * @param VKGRP   * 部门
     */
    public void setVKGRP(java.lang.String VKGRP) {
        this.VKGRP = VKGRP;
    }


    /**
     * Gets the VKBUR value for this DT_POS010ORDERHEADERITEMS.
     * 
     * @return VKBUR   * 柜组
     */
    public java.lang.String getVKBUR() {
        return VKBUR;
    }


    /**
     * Sets the VKBUR value for this DT_POS010ORDERHEADERITEMS.
     * 
     * @param VKBUR   * 柜组
     */
    public void setVKBUR(java.lang.String VKBUR) {
        this.VKBUR = VKBUR;
    }


    /**
     * Gets the RETAILTYPECODE value for this DT_POS010ORDERHEADERITEMS.
     * 
     * @return RETAILTYPECODE   * 行交易类型
     */
    public java.lang.String getRETAILTYPECODE() {
        return RETAILTYPECODE;
    }


    /**
     * Sets the RETAILTYPECODE value for this DT_POS010ORDERHEADERITEMS.
     * 
     * @param RETAILTYPECODE   * 行交易类型
     */
    public void setRETAILTYPECODE(java.lang.String RETAILTYPECODE) {
        this.RETAILTYPECODE = RETAILTYPECODE;
    }


    /**
     * Gets the ITEMID value for this DT_POS010ORDERHEADERITEMS.
     * 
     * @return ITEMID   * 商品编码
     */
    public java.lang.String getITEMID() {
        return ITEMID;
    }


    /**
     * Sets the ITEMID value for this DT_POS010ORDERHEADERITEMS.
     * 
     * @param ITEMID   * 商品编码
     */
    public void setITEMID(java.lang.String ITEMID) {
        this.ITEMID = ITEMID;
    }


    /**
     * Gets the RETAILQUANTITY value for this DT_POS010ORDERHEADERITEMS.
     * 
     * @return RETAILQUANTITY   * 数量
     */
    public java.lang.Double getRETAILQUANTITY() {
        return RETAILQUANTITY;
    }


    /**
     * Sets the RETAILQUANTITY value for this DT_POS010ORDERHEADERITEMS.
     * 
     * @param RETAILQUANTITY   * 数量
     */
    public void setRETAILQUANTITY(java.lang.Double RETAILQUANTITY) {
        this.RETAILQUANTITY = RETAILQUANTITY;
    }


    /**
     * Gets the SALESUOM value for this DT_POS010ORDERHEADERITEMS.
     * 
     * @return SALESUOM   * 单位
     */
    public java.lang.String getSALESUOM() {
        return SALESUOM;
    }


    /**
     * Sets the SALESUOM value for this DT_POS010ORDERHEADERITEMS.
     * 
     * @param SALESUOM   * 单位
     */
    public void setSALESUOM(java.lang.String SALESUOM) {
        this.SALESUOM = SALESUOM;
    }


    /**
     * Gets the NORMALSALESAMT value for this DT_POS010ORDERHEADERITEMS.
     * 
     * @return NORMALSALESAMT   * 标准价金额
     */
    public java.lang.Double getNORMALSALESAMT() {
        return NORMALSALESAMT;
    }


    /**
     * Sets the NORMALSALESAMT value for this DT_POS010ORDERHEADERITEMS.
     * 
     * @param NORMALSALESAMT   * 标准价金额
     */
    public void setNORMALSALESAMT(java.lang.Double NORMALSALESAMT) {
        this.NORMALSALESAMT = NORMALSALESAMT;
    }


    /**
     * Gets the SALESAMOUNT value for this DT_POS010ORDERHEADERITEMS.
     * 
     * @return SALESAMOUNT   * 实际金额
     */
    public java.lang.Double getSALESAMOUNT() {
        return SALESAMOUNT;
    }


    /**
     * Sets the SALESAMOUNT value for this DT_POS010ORDERHEADERITEMS.
     * 
     * @param SALESAMOUNT   * 实际金额
     */
    public void setSALESAMOUNT(java.lang.Double SALESAMOUNT) {
        this.SALESAMOUNT = SALESAMOUNT;
    }


    /**
     * Gets the COST value for this DT_POS010ORDERHEADERITEMS.
     * 
     * @return COST   * 成本
     */
    public java.lang.Double getCOST() {
        return COST;
    }


    /**
     * Sets the COST value for this DT_POS010ORDERHEADERITEMS.
     * 
     * @param COST   * 成本
     */
    public void setCOST(java.lang.Double COST) {
        this.COST = COST;
    }


    /**
     * Gets the PROMOTIONID value for this DT_POS010ORDERHEADERITEMS.
     * 
     * @return PROMOTIONID   * 促销号码
     */
    public java.lang.String getPROMOTIONID() {
        return PROMOTIONID;
    }


    /**
     * Sets the PROMOTIONID value for this DT_POS010ORDERHEADERITEMS.
     * 
     * @param PROMOTIONID   * 促销号码
     */
    public void setPROMOTIONID(java.lang.String PROMOTIONID) {
        this.PROMOTIONID = PROMOTIONID;
    }


    /**
     * Gets the CONTRACT value for this DT_POS010ORDERHEADERITEMS.
     * 
     * @return CONTRACT   * 合同
     */
    public java.lang.String getCONTRACT() {
        return CONTRACT;
    }


    /**
     * Sets the CONTRACT value for this DT_POS010ORDERHEADERITEMS.
     * 
     * @param CONTRACT   * 合同
     */
    public void setCONTRACT(java.lang.String CONTRACT) {
        this.CONTRACT = CONTRACT;
    }


    /**
     * Gets the LGORT value for this DT_POS010ORDERHEADERITEMS.
     * 
     * @return LGORT   * 库存地点
     */
    public java.lang.String getLGORT() {
        return LGORT;
    }


    /**
     * Sets the LGORT value for this DT_POS010ORDERHEADERITEMS.
     * 
     * @param LGORT   * 库存地点
     */
    public void setLGORT(java.lang.String LGORT) {
        this.LGORT = LGORT;
    }


    /**
     * Gets the DEP_SIGNER value for this DT_POS010ORDERHEADERITEMS.
     * 
     * @return DEP_SIGNER   * 签约部门
     */
    public java.lang.String getDEP_SIGNER() {
        return DEP_SIGNER;
    }


    /**
     * Sets the DEP_SIGNER value for this DT_POS010ORDERHEADERITEMS.
     * 
     * @param DEP_SIGNER   * 签约部门
     */
    public void setDEP_SIGNER(java.lang.String DEP_SIGNER) {
        this.DEP_SIGNER = DEP_SIGNER;
    }


    /**
     * Gets the ITEM_CAT value for this DT_POS010ORDERHEADERITEMS.
     * 
     * @return ITEM_CAT   * 经营方式
     */
    public java.lang.String getITEM_CAT() {
        return ITEM_CAT;
    }


    /**
     * Sets the ITEM_CAT value for this DT_POS010ORDERHEADERITEMS.
     * 
     * @param ITEM_CAT   * 经营方式
     */
    public void setITEM_CAT(java.lang.String ITEM_CAT) {
        this.ITEM_CAT = ITEM_CAT;
    }


    /**
     * Gets the EAN11 value for this DT_POS010ORDERHEADERITEMS.
     * 
     * @return EAN11   * EAN码
     */
    public java.lang.String getEAN11() {
        return EAN11;
    }


    /**
     * Sets the EAN11 value for this DT_POS010ORDERHEADERITEMS.
     * 
     * @param EAN11   * EAN码
     */
    public void setEAN11(java.lang.String EAN11) {
        this.EAN11 = EAN11;
    }


    /**
     * Gets the INTE_RATE value for this DT_POS010ORDERHEADERITEMS.
     * 
     * @return INTE_RATE   * 积分系数
     */
    public java.lang.String getINTE_RATE() {
        return INTE_RATE;
    }


    /**
     * Sets the INTE_RATE value for this DT_POS010ORDERHEADERITEMS.
     * 
     * @param INTE_RATE   * 积分系数
     */
    public void setINTE_RATE(java.lang.String INTE_RATE) {
        this.INTE_RATE = INTE_RATE;
    }


    /**
     * Gets the INTEGRAL value for this DT_POS010ORDERHEADERITEMS.
     * 
     * @return INTEGRAL   * 积分
     */
    public java.lang.String getINTEGRAL() {
        return INTEGRAL;
    }


    /**
     * Sets the INTEGRAL value for this DT_POS010ORDERHEADERITEMS.
     * 
     * @param INTEGRAL   * 积分
     */
    public void setINTEGRAL(java.lang.String INTEGRAL) {
        this.INTEGRAL = INTEGRAL;
    }


    /**
     * Gets the ITEMDISCOUNT value for this DT_POS010ORDERHEADERITEMS.
     * 
     * @return ITEMDISCOUNT   * 行项目折扣
     */
    public com.esb.jinying.sap.dealup.base.pos.ecc.DT_POS010ORDERHEADERITEMSITEMDISCOUNT[] getITEMDISCOUNT() {
        return ITEMDISCOUNT;
    }


    /**
     * Sets the ITEMDISCOUNT value for this DT_POS010ORDERHEADERITEMS.
     * 
     * @param ITEMDISCOUNT   * 行项目折扣
     */
    public void setITEMDISCOUNT(com.esb.jinying.sap.dealup.base.pos.ecc.DT_POS010ORDERHEADERITEMSITEMDISCOUNT[] ITEMDISCOUNT) {
        this.ITEMDISCOUNT = ITEMDISCOUNT;
    }

    public com.esb.jinying.sap.dealup.base.pos.ecc.DT_POS010ORDERHEADERITEMSITEMDISCOUNT getITEMDISCOUNT(int i) {
        return this.ITEMDISCOUNT[i];
    }

    public void setITEMDISCOUNT(int i, com.esb.jinying.sap.dealup.base.pos.ecc.DT_POS010ORDERHEADERITEMSITEMDISCOUNT _value) {
        this.ITEMDISCOUNT[i] = _value;
    }

    private java.lang.Object __equalsCalc = null;
    public synchronized boolean equals(java.lang.Object obj) {
        if (!(obj instanceof DT_POS010ORDERHEADERITEMS)) return false;
        DT_POS010ORDERHEADERITEMS other = (DT_POS010ORDERHEADERITEMS) obj;
        if (obj == null) return false;
        if (this == obj) return true;
        if (__equalsCalc != null) {
            return (__equalsCalc == obj);
        }
        __equalsCalc = obj;
        boolean _equals;
        _equals = true && 
            ((this.RETAILNUMBER==null && other.getRETAILNUMBER()==null) || 
             (this.RETAILNUMBER!=null &&
              this.RETAILNUMBER.equals(other.getRETAILNUMBER()))) &&
            ((this.VKGRP==null && other.getVKGRP()==null) || 
             (this.VKGRP!=null &&
              this.VKGRP.equals(other.getVKGRP()))) &&
            ((this.VKBUR==null && other.getVKBUR()==null) || 
             (this.VKBUR!=null &&
              this.VKBUR.equals(other.getVKBUR()))) &&
            ((this.RETAILTYPECODE==null && other.getRETAILTYPECODE()==null) || 
             (this.RETAILTYPECODE!=null &&
              this.RETAILTYPECODE.equals(other.getRETAILTYPECODE()))) &&
            ((this.ITEMID==null && other.getITEMID()==null) || 
             (this.ITEMID!=null &&
              this.ITEMID.equals(other.getITEMID()))) &&
            ((this.RETAILQUANTITY==null && other.getRETAILQUANTITY()==null) || 
             (this.RETAILQUANTITY!=null &&
              this.RETAILQUANTITY.equals(other.getRETAILQUANTITY()))) &&
            ((this.SALESUOM==null && other.getSALESUOM()==null) || 
             (this.SALESUOM!=null &&
              this.SALESUOM.equals(other.getSALESUOM()))) &&
            ((this.NORMALSALESAMT==null && other.getNORMALSALESAMT()==null) || 
             (this.NORMALSALESAMT!=null &&
              this.NORMALSALESAMT.equals(other.getNORMALSALESAMT()))) &&
            ((this.SALESAMOUNT==null && other.getSALESAMOUNT()==null) || 
             (this.SALESAMOUNT!=null &&
              this.SALESAMOUNT.equals(other.getSALESAMOUNT()))) &&
            ((this.COST==null && other.getCOST()==null) || 
             (this.COST!=null &&
              this.COST.equals(other.getCOST()))) &&
            ((this.PROMOTIONID==null && other.getPROMOTIONID()==null) || 
             (this.PROMOTIONID!=null &&
              this.PROMOTIONID.equals(other.getPROMOTIONID()))) &&
            ((this.CONTRACT==null && other.getCONTRACT()==null) || 
             (this.CONTRACT!=null &&
              this.CONTRACT.equals(other.getCONTRACT()))) &&
            ((this.LGORT==null && other.getLGORT()==null) || 
             (this.LGORT!=null &&
              this.LGORT.equals(other.getLGORT()))) &&
            ((this.DEP_SIGNER==null && other.getDEP_SIGNER()==null) || 
             (this.DEP_SIGNER!=null &&
              this.DEP_SIGNER.equals(other.getDEP_SIGNER()))) &&
            ((this.ITEM_CAT==null && other.getITEM_CAT()==null) || 
             (this.ITEM_CAT!=null &&
              this.ITEM_CAT.equals(other.getITEM_CAT()))) &&
            ((this.EAN11==null && other.getEAN11()==null) || 
             (this.EAN11!=null &&
              this.EAN11.equals(other.getEAN11()))) &&
            ((this.INTE_RATE==null && other.getINTE_RATE()==null) || 
             (this.INTE_RATE!=null &&
              this.INTE_RATE.equals(other.getINTE_RATE()))) &&
            ((this.INTEGRAL==null && other.getINTEGRAL()==null) || 
             (this.INTEGRAL!=null &&
              this.INTEGRAL.equals(other.getINTEGRAL()))) &&
            ((this.ITEMDISCOUNT==null && other.getITEMDISCOUNT()==null) || 
             (this.ITEMDISCOUNT!=null &&
              java.util.Arrays.equals(this.ITEMDISCOUNT, other.getITEMDISCOUNT())));
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
        if (getRETAILNUMBER() != null) {
            _hashCode += getRETAILNUMBER().hashCode();
        }
        if (getVKGRP() != null) {
            _hashCode += getVKGRP().hashCode();
        }
        if (getVKBUR() != null) {
            _hashCode += getVKBUR().hashCode();
        }
        if (getRETAILTYPECODE() != null) {
            _hashCode += getRETAILTYPECODE().hashCode();
        }
        if (getITEMID() != null) {
            _hashCode += getITEMID().hashCode();
        }
        if (getRETAILQUANTITY() != null) {
            _hashCode += getRETAILQUANTITY().hashCode();
        }
        if (getSALESUOM() != null) {
            _hashCode += getSALESUOM().hashCode();
        }
        if (getNORMALSALESAMT() != null) {
            _hashCode += getNORMALSALESAMT().hashCode();
        }
        if (getSALESAMOUNT() != null) {
            _hashCode += getSALESAMOUNT().hashCode();
        }
        if (getCOST() != null) {
            _hashCode += getCOST().hashCode();
        }
        if (getPROMOTIONID() != null) {
            _hashCode += getPROMOTIONID().hashCode();
        }
        if (getCONTRACT() != null) {
            _hashCode += getCONTRACT().hashCode();
        }
        if (getLGORT() != null) {
            _hashCode += getLGORT().hashCode();
        }
        if (getDEP_SIGNER() != null) {
            _hashCode += getDEP_SIGNER().hashCode();
        }
        if (getITEM_CAT() != null) {
            _hashCode += getITEM_CAT().hashCode();
        }
        if (getEAN11() != null) {
            _hashCode += getEAN11().hashCode();
        }
        if (getINTE_RATE() != null) {
            _hashCode += getINTE_RATE().hashCode();
        }
        if (getINTEGRAL() != null) {
            _hashCode += getINTEGRAL().hashCode();
        }
        if (getITEMDISCOUNT() != null) {
            for (int i=0;
                 i<java.lang.reflect.Array.getLength(getITEMDISCOUNT());
                 i++) {
                java.lang.Object obj = java.lang.reflect.Array.get(getITEMDISCOUNT(), i);
                if (obj != null &&
                    !obj.getClass().isArray()) {
                    _hashCode += obj.hashCode();
                }
            }
        }
        __hashCodeCalc = false;
        return _hashCode;
    }

    // Type metadata
    private static org.apache.axis.description.TypeDesc typeDesc =
        new org.apache.axis.description.TypeDesc(DT_POS010ORDERHEADERITEMS.class, true);

    static {
        typeDesc.setXmlType(new javax.xml.namespace.QName("urn:ecc:pos:base:dealup", ">>>DT_POS010>ORDER>HEADER>ITEMS"));
        org.apache.axis.description.ElementDesc elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("RETAILNUMBER");
        elemField.setXmlName(new javax.xml.namespace.QName("", "RETAILNUMBER"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("VKGRP");
        elemField.setXmlName(new javax.xml.namespace.QName("", "VKGRP"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("VKBUR");
        elemField.setXmlName(new javax.xml.namespace.QName("", "VKBUR"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("RETAILTYPECODE");
        elemField.setXmlName(new javax.xml.namespace.QName("", "RETAILTYPECODE"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("ITEMID");
        elemField.setXmlName(new javax.xml.namespace.QName("", "ITEMID"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("RETAILQUANTITY");
        elemField.setXmlName(new javax.xml.namespace.QName("", "RETAILQUANTITY"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "double"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("SALESUOM");
        elemField.setXmlName(new javax.xml.namespace.QName("", "SALESUOM"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("NORMALSALESAMT");
        elemField.setXmlName(new javax.xml.namespace.QName("", "NORMALSALESAMT"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "double"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("SALESAMOUNT");
        elemField.setXmlName(new javax.xml.namespace.QName("", "SALESAMOUNT"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "double"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("COST");
        elemField.setXmlName(new javax.xml.namespace.QName("", "COST"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "double"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("PROMOTIONID");
        elemField.setXmlName(new javax.xml.namespace.QName("", "PROMOTIONID"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("CONTRACT");
        elemField.setXmlName(new javax.xml.namespace.QName("", "CONTRACT"));
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
        elemField.setFieldName("DEP_SIGNER");
        elemField.setXmlName(new javax.xml.namespace.QName("", "DEP_SIGNER"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("ITEM_CAT");
        elemField.setXmlName(new javax.xml.namespace.QName("", "ITEM_CAT"));
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
        elemField.setFieldName("INTE_RATE");
        elemField.setXmlName(new javax.xml.namespace.QName("", "INTE_RATE"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("INTEGRAL");
        elemField.setXmlName(new javax.xml.namespace.QName("", "INTEGRAL"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("ITEMDISCOUNT");
        elemField.setXmlName(new javax.xml.namespace.QName("", "ITEMDISCOUNT"));
        elemField.setXmlType(new javax.xml.namespace.QName("urn:ecc:pos:base:dealup", ">>>>DT_POS010>ORDER>HEADER>ITEMS>ITEMDISCOUNT"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        elemField.setMaxOccursUnbounded(true);
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
