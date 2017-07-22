/**
 * DT_ContractSearchSub_PY.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package com.esb.jinying.sap.contract.rvs.ecc;

public class DT_ContractSearchSub_PY  implements java.io.Serializable {
    /* 对象的标识 */
    private java.lang.String OBJECT_ID;

    /* 条款编号 */
    private java.lang.String TERM_NO;

    /* 条款名称 */
    private java.lang.String TERM_TEXT;

    /* 条款的生效日期 */
    private java.lang.String VALID_FROM;

    /* 条款的有效终止日期 */
    private java.lang.String VALID_TO;

    /* 付款方式 */
    private java.lang.String PYMT_METH;

    /* 付款冻结代码 */
    private java.lang.String PMNT_BLOCK;

    /* 付款代码条款 */
    private java.lang.String PMNTTRMS;

    /* 开户行的代码 */
    private java.lang.String HOUSEBANKID;

    /* 银行明细标识 */
    private java.lang.String BANKDETAILID;

    /* 对收款人的通知 */
    private java.lang.String NOTETOPAYEE;

    /* 催款范围 */
    private java.lang.String DUNN_AREA;

    /* 催款冻结 */
    private java.lang.String DUNN_BLOCK;

    /* 科目确定值 */
    private java.lang.String ACC_DET_KEY;

    /* 税收类型 */
    private java.lang.String TAX_TYPE;

    /* 税收组 */
    private java.lang.String TAX_GROUP;

    /* 条件金额是总金额 */
    private java.lang.String IS_GROSS;

    /* 业务合作伙伴编号 */
    private java.lang.String PARTNER;

    /* 内部使用对象的业务对象类型 */
    private java.lang.String COST_OBJECT_TYPE;

    /* 内部使用对象的标识 */
    private java.lang.String COST_OBJECT_ID;

    /* 开户行帐户代码 */
    private java.lang.String HOUSEBANK_ACCOUNT;

    /* 贷项凭证的付款方式 */
    private java.lang.String PYMT_METH_CRMO;

    /* 催款代码 */
    private java.lang.String DUNN_KEY;

    /* 地区税务代码 */
    private java.lang.String TAXJURCODE;

    public DT_ContractSearchSub_PY() {
    }

    public DT_ContractSearchSub_PY(
           java.lang.String OBJECT_ID,
           java.lang.String TERM_NO,
           java.lang.String TERM_TEXT,
           java.lang.String VALID_FROM,
           java.lang.String VALID_TO,
           java.lang.String PYMT_METH,
           java.lang.String PMNT_BLOCK,
           java.lang.String PMNTTRMS,
           java.lang.String HOUSEBANKID,
           java.lang.String BANKDETAILID,
           java.lang.String NOTETOPAYEE,
           java.lang.String DUNN_AREA,
           java.lang.String DUNN_BLOCK,
           java.lang.String ACC_DET_KEY,
           java.lang.String TAX_TYPE,
           java.lang.String TAX_GROUP,
           java.lang.String IS_GROSS,
           java.lang.String PARTNER,
           java.lang.String COST_OBJECT_TYPE,
           java.lang.String COST_OBJECT_ID,
           java.lang.String HOUSEBANK_ACCOUNT,
           java.lang.String PYMT_METH_CRMO,
           java.lang.String DUNN_KEY,
           java.lang.String TAXJURCODE) {
           this.OBJECT_ID = OBJECT_ID;
           this.TERM_NO = TERM_NO;
           this.TERM_TEXT = TERM_TEXT;
           this.VALID_FROM = VALID_FROM;
           this.VALID_TO = VALID_TO;
           this.PYMT_METH = PYMT_METH;
           this.PMNT_BLOCK = PMNT_BLOCK;
           this.PMNTTRMS = PMNTTRMS;
           this.HOUSEBANKID = HOUSEBANKID;
           this.BANKDETAILID = BANKDETAILID;
           this.NOTETOPAYEE = NOTETOPAYEE;
           this.DUNN_AREA = DUNN_AREA;
           this.DUNN_BLOCK = DUNN_BLOCK;
           this.ACC_DET_KEY = ACC_DET_KEY;
           this.TAX_TYPE = TAX_TYPE;
           this.TAX_GROUP = TAX_GROUP;
           this.IS_GROSS = IS_GROSS;
           this.PARTNER = PARTNER;
           this.COST_OBJECT_TYPE = COST_OBJECT_TYPE;
           this.COST_OBJECT_ID = COST_OBJECT_ID;
           this.HOUSEBANK_ACCOUNT = HOUSEBANK_ACCOUNT;
           this.PYMT_METH_CRMO = PYMT_METH_CRMO;
           this.DUNN_KEY = DUNN_KEY;
           this.TAXJURCODE = TAXJURCODE;
    }


    /**
     * Gets the OBJECT_ID value for this DT_ContractSearchSub_PY.
     * 
     * @return OBJECT_ID   * 对象的标识
     */
    public java.lang.String getOBJECT_ID() {
        return OBJECT_ID;
    }


    /**
     * Sets the OBJECT_ID value for this DT_ContractSearchSub_PY.
     * 
     * @param OBJECT_ID   * 对象的标识
     */
    public void setOBJECT_ID(java.lang.String OBJECT_ID) {
        this.OBJECT_ID = OBJECT_ID;
    }


    /**
     * Gets the TERM_NO value for this DT_ContractSearchSub_PY.
     * 
     * @return TERM_NO   * 条款编号
     */
    public java.lang.String getTERM_NO() {
        return TERM_NO;
    }


    /**
     * Sets the TERM_NO value for this DT_ContractSearchSub_PY.
     * 
     * @param TERM_NO   * 条款编号
     */
    public void setTERM_NO(java.lang.String TERM_NO) {
        this.TERM_NO = TERM_NO;
    }


    /**
     * Gets the TERM_TEXT value for this DT_ContractSearchSub_PY.
     * 
     * @return TERM_TEXT   * 条款名称
     */
    public java.lang.String getTERM_TEXT() {
        return TERM_TEXT;
    }


    /**
     * Sets the TERM_TEXT value for this DT_ContractSearchSub_PY.
     * 
     * @param TERM_TEXT   * 条款名称
     */
    public void setTERM_TEXT(java.lang.String TERM_TEXT) {
        this.TERM_TEXT = TERM_TEXT;
    }


    /**
     * Gets the VALID_FROM value for this DT_ContractSearchSub_PY.
     * 
     * @return VALID_FROM   * 条款的生效日期
     */
    public java.lang.String getVALID_FROM() {
        return VALID_FROM;
    }


    /**
     * Sets the VALID_FROM value for this DT_ContractSearchSub_PY.
     * 
     * @param VALID_FROM   * 条款的生效日期
     */
    public void setVALID_FROM(java.lang.String VALID_FROM) {
        this.VALID_FROM = VALID_FROM;
    }


    /**
     * Gets the VALID_TO value for this DT_ContractSearchSub_PY.
     * 
     * @return VALID_TO   * 条款的有效终止日期
     */
    public java.lang.String getVALID_TO() {
        return VALID_TO;
    }


    /**
     * Sets the VALID_TO value for this DT_ContractSearchSub_PY.
     * 
     * @param VALID_TO   * 条款的有效终止日期
     */
    public void setVALID_TO(java.lang.String VALID_TO) {
        this.VALID_TO = VALID_TO;
    }


    /**
     * Gets the PYMT_METH value for this DT_ContractSearchSub_PY.
     * 
     * @return PYMT_METH   * 付款方式
     */
    public java.lang.String getPYMT_METH() {
        return PYMT_METH;
    }


    /**
     * Sets the PYMT_METH value for this DT_ContractSearchSub_PY.
     * 
     * @param PYMT_METH   * 付款方式
     */
    public void setPYMT_METH(java.lang.String PYMT_METH) {
        this.PYMT_METH = PYMT_METH;
    }


    /**
     * Gets the PMNT_BLOCK value for this DT_ContractSearchSub_PY.
     * 
     * @return PMNT_BLOCK   * 付款冻结代码
     */
    public java.lang.String getPMNT_BLOCK() {
        return PMNT_BLOCK;
    }


    /**
     * Sets the PMNT_BLOCK value for this DT_ContractSearchSub_PY.
     * 
     * @param PMNT_BLOCK   * 付款冻结代码
     */
    public void setPMNT_BLOCK(java.lang.String PMNT_BLOCK) {
        this.PMNT_BLOCK = PMNT_BLOCK;
    }


    /**
     * Gets the PMNTTRMS value for this DT_ContractSearchSub_PY.
     * 
     * @return PMNTTRMS   * 付款代码条款
     */
    public java.lang.String getPMNTTRMS() {
        return PMNTTRMS;
    }


    /**
     * Sets the PMNTTRMS value for this DT_ContractSearchSub_PY.
     * 
     * @param PMNTTRMS   * 付款代码条款
     */
    public void setPMNTTRMS(java.lang.String PMNTTRMS) {
        this.PMNTTRMS = PMNTTRMS;
    }


    /**
     * Gets the HOUSEBANKID value for this DT_ContractSearchSub_PY.
     * 
     * @return HOUSEBANKID   * 开户行的代码
     */
    public java.lang.String getHOUSEBANKID() {
        return HOUSEBANKID;
    }


    /**
     * Sets the HOUSEBANKID value for this DT_ContractSearchSub_PY.
     * 
     * @param HOUSEBANKID   * 开户行的代码
     */
    public void setHOUSEBANKID(java.lang.String HOUSEBANKID) {
        this.HOUSEBANKID = HOUSEBANKID;
    }


    /**
     * Gets the BANKDETAILID value for this DT_ContractSearchSub_PY.
     * 
     * @return BANKDETAILID   * 银行明细标识
     */
    public java.lang.String getBANKDETAILID() {
        return BANKDETAILID;
    }


    /**
     * Sets the BANKDETAILID value for this DT_ContractSearchSub_PY.
     * 
     * @param BANKDETAILID   * 银行明细标识
     */
    public void setBANKDETAILID(java.lang.String BANKDETAILID) {
        this.BANKDETAILID = BANKDETAILID;
    }


    /**
     * Gets the NOTETOPAYEE value for this DT_ContractSearchSub_PY.
     * 
     * @return NOTETOPAYEE   * 对收款人的通知
     */
    public java.lang.String getNOTETOPAYEE() {
        return NOTETOPAYEE;
    }


    /**
     * Sets the NOTETOPAYEE value for this DT_ContractSearchSub_PY.
     * 
     * @param NOTETOPAYEE   * 对收款人的通知
     */
    public void setNOTETOPAYEE(java.lang.String NOTETOPAYEE) {
        this.NOTETOPAYEE = NOTETOPAYEE;
    }


    /**
     * Gets the DUNN_AREA value for this DT_ContractSearchSub_PY.
     * 
     * @return DUNN_AREA   * 催款范围
     */
    public java.lang.String getDUNN_AREA() {
        return DUNN_AREA;
    }


    /**
     * Sets the DUNN_AREA value for this DT_ContractSearchSub_PY.
     * 
     * @param DUNN_AREA   * 催款范围
     */
    public void setDUNN_AREA(java.lang.String DUNN_AREA) {
        this.DUNN_AREA = DUNN_AREA;
    }


    /**
     * Gets the DUNN_BLOCK value for this DT_ContractSearchSub_PY.
     * 
     * @return DUNN_BLOCK   * 催款冻结
     */
    public java.lang.String getDUNN_BLOCK() {
        return DUNN_BLOCK;
    }


    /**
     * Sets the DUNN_BLOCK value for this DT_ContractSearchSub_PY.
     * 
     * @param DUNN_BLOCK   * 催款冻结
     */
    public void setDUNN_BLOCK(java.lang.String DUNN_BLOCK) {
        this.DUNN_BLOCK = DUNN_BLOCK;
    }


    /**
     * Gets the ACC_DET_KEY value for this DT_ContractSearchSub_PY.
     * 
     * @return ACC_DET_KEY   * 科目确定值
     */
    public java.lang.String getACC_DET_KEY() {
        return ACC_DET_KEY;
    }


    /**
     * Sets the ACC_DET_KEY value for this DT_ContractSearchSub_PY.
     * 
     * @param ACC_DET_KEY   * 科目确定值
     */
    public void setACC_DET_KEY(java.lang.String ACC_DET_KEY) {
        this.ACC_DET_KEY = ACC_DET_KEY;
    }


    /**
     * Gets the TAX_TYPE value for this DT_ContractSearchSub_PY.
     * 
     * @return TAX_TYPE   * 税收类型
     */
    public java.lang.String getTAX_TYPE() {
        return TAX_TYPE;
    }


    /**
     * Sets the TAX_TYPE value for this DT_ContractSearchSub_PY.
     * 
     * @param TAX_TYPE   * 税收类型
     */
    public void setTAX_TYPE(java.lang.String TAX_TYPE) {
        this.TAX_TYPE = TAX_TYPE;
    }


    /**
     * Gets the TAX_GROUP value for this DT_ContractSearchSub_PY.
     * 
     * @return TAX_GROUP   * 税收组
     */
    public java.lang.String getTAX_GROUP() {
        return TAX_GROUP;
    }


    /**
     * Sets the TAX_GROUP value for this DT_ContractSearchSub_PY.
     * 
     * @param TAX_GROUP   * 税收组
     */
    public void setTAX_GROUP(java.lang.String TAX_GROUP) {
        this.TAX_GROUP = TAX_GROUP;
    }


    /**
     * Gets the IS_GROSS value for this DT_ContractSearchSub_PY.
     * 
     * @return IS_GROSS   * 条件金额是总金额
     */
    public java.lang.String getIS_GROSS() {
        return IS_GROSS;
    }


    /**
     * Sets the IS_GROSS value for this DT_ContractSearchSub_PY.
     * 
     * @param IS_GROSS   * 条件金额是总金额
     */
    public void setIS_GROSS(java.lang.String IS_GROSS) {
        this.IS_GROSS = IS_GROSS;
    }


    /**
     * Gets the PARTNER value for this DT_ContractSearchSub_PY.
     * 
     * @return PARTNER   * 业务合作伙伴编号
     */
    public java.lang.String getPARTNER() {
        return PARTNER;
    }


    /**
     * Sets the PARTNER value for this DT_ContractSearchSub_PY.
     * 
     * @param PARTNER   * 业务合作伙伴编号
     */
    public void setPARTNER(java.lang.String PARTNER) {
        this.PARTNER = PARTNER;
    }


    /**
     * Gets the COST_OBJECT_TYPE value for this DT_ContractSearchSub_PY.
     * 
     * @return COST_OBJECT_TYPE   * 内部使用对象的业务对象类型
     */
    public java.lang.String getCOST_OBJECT_TYPE() {
        return COST_OBJECT_TYPE;
    }


    /**
     * Sets the COST_OBJECT_TYPE value for this DT_ContractSearchSub_PY.
     * 
     * @param COST_OBJECT_TYPE   * 内部使用对象的业务对象类型
     */
    public void setCOST_OBJECT_TYPE(java.lang.String COST_OBJECT_TYPE) {
        this.COST_OBJECT_TYPE = COST_OBJECT_TYPE;
    }


    /**
     * Gets the COST_OBJECT_ID value for this DT_ContractSearchSub_PY.
     * 
     * @return COST_OBJECT_ID   * 内部使用对象的标识
     */
    public java.lang.String getCOST_OBJECT_ID() {
        return COST_OBJECT_ID;
    }


    /**
     * Sets the COST_OBJECT_ID value for this DT_ContractSearchSub_PY.
     * 
     * @param COST_OBJECT_ID   * 内部使用对象的标识
     */
    public void setCOST_OBJECT_ID(java.lang.String COST_OBJECT_ID) {
        this.COST_OBJECT_ID = COST_OBJECT_ID;
    }


    /**
     * Gets the HOUSEBANK_ACCOUNT value for this DT_ContractSearchSub_PY.
     * 
     * @return HOUSEBANK_ACCOUNT   * 开户行帐户代码
     */
    public java.lang.String getHOUSEBANK_ACCOUNT() {
        return HOUSEBANK_ACCOUNT;
    }


    /**
     * Sets the HOUSEBANK_ACCOUNT value for this DT_ContractSearchSub_PY.
     * 
     * @param HOUSEBANK_ACCOUNT   * 开户行帐户代码
     */
    public void setHOUSEBANK_ACCOUNT(java.lang.String HOUSEBANK_ACCOUNT) {
        this.HOUSEBANK_ACCOUNT = HOUSEBANK_ACCOUNT;
    }


    /**
     * Gets the PYMT_METH_CRMO value for this DT_ContractSearchSub_PY.
     * 
     * @return PYMT_METH_CRMO   * 贷项凭证的付款方式
     */
    public java.lang.String getPYMT_METH_CRMO() {
        return PYMT_METH_CRMO;
    }


    /**
     * Sets the PYMT_METH_CRMO value for this DT_ContractSearchSub_PY.
     * 
     * @param PYMT_METH_CRMO   * 贷项凭证的付款方式
     */
    public void setPYMT_METH_CRMO(java.lang.String PYMT_METH_CRMO) {
        this.PYMT_METH_CRMO = PYMT_METH_CRMO;
    }


    /**
     * Gets the DUNN_KEY value for this DT_ContractSearchSub_PY.
     * 
     * @return DUNN_KEY   * 催款代码
     */
    public java.lang.String getDUNN_KEY() {
        return DUNN_KEY;
    }


    /**
     * Sets the DUNN_KEY value for this DT_ContractSearchSub_PY.
     * 
     * @param DUNN_KEY   * 催款代码
     */
    public void setDUNN_KEY(java.lang.String DUNN_KEY) {
        this.DUNN_KEY = DUNN_KEY;
    }


    /**
     * Gets the TAXJURCODE value for this DT_ContractSearchSub_PY.
     * 
     * @return TAXJURCODE   * 地区税务代码
     */
    public java.lang.String getTAXJURCODE() {
        return TAXJURCODE;
    }


    /**
     * Sets the TAXJURCODE value for this DT_ContractSearchSub_PY.
     * 
     * @param TAXJURCODE   * 地区税务代码
     */
    public void setTAXJURCODE(java.lang.String TAXJURCODE) {
        this.TAXJURCODE = TAXJURCODE;
    }

    private java.lang.Object __equalsCalc = null;
    public synchronized boolean equals(java.lang.Object obj) {
        if (!(obj instanceof DT_ContractSearchSub_PY)) return false;
        DT_ContractSearchSub_PY other = (DT_ContractSearchSub_PY) obj;
        if (obj == null) return false;
        if (this == obj) return true;
        if (__equalsCalc != null) {
            return (__equalsCalc == obj);
        }
        __equalsCalc = obj;
        boolean _equals;
        _equals = true && 
            ((this.OBJECT_ID==null && other.getOBJECT_ID()==null) || 
             (this.OBJECT_ID!=null &&
              this.OBJECT_ID.equals(other.getOBJECT_ID()))) &&
            ((this.TERM_NO==null && other.getTERM_NO()==null) || 
             (this.TERM_NO!=null &&
              this.TERM_NO.equals(other.getTERM_NO()))) &&
            ((this.TERM_TEXT==null && other.getTERM_TEXT()==null) || 
             (this.TERM_TEXT!=null &&
              this.TERM_TEXT.equals(other.getTERM_TEXT()))) &&
            ((this.VALID_FROM==null && other.getVALID_FROM()==null) || 
             (this.VALID_FROM!=null &&
              this.VALID_FROM.equals(other.getVALID_FROM()))) &&
            ((this.VALID_TO==null && other.getVALID_TO()==null) || 
             (this.VALID_TO!=null &&
              this.VALID_TO.equals(other.getVALID_TO()))) &&
            ((this.PYMT_METH==null && other.getPYMT_METH()==null) || 
             (this.PYMT_METH!=null &&
              this.PYMT_METH.equals(other.getPYMT_METH()))) &&
            ((this.PMNT_BLOCK==null && other.getPMNT_BLOCK()==null) || 
             (this.PMNT_BLOCK!=null &&
              this.PMNT_BLOCK.equals(other.getPMNT_BLOCK()))) &&
            ((this.PMNTTRMS==null && other.getPMNTTRMS()==null) || 
             (this.PMNTTRMS!=null &&
              this.PMNTTRMS.equals(other.getPMNTTRMS()))) &&
            ((this.HOUSEBANKID==null && other.getHOUSEBANKID()==null) || 
             (this.HOUSEBANKID!=null &&
              this.HOUSEBANKID.equals(other.getHOUSEBANKID()))) &&
            ((this.BANKDETAILID==null && other.getBANKDETAILID()==null) || 
             (this.BANKDETAILID!=null &&
              this.BANKDETAILID.equals(other.getBANKDETAILID()))) &&
            ((this.NOTETOPAYEE==null && other.getNOTETOPAYEE()==null) || 
             (this.NOTETOPAYEE!=null &&
              this.NOTETOPAYEE.equals(other.getNOTETOPAYEE()))) &&
            ((this.DUNN_AREA==null && other.getDUNN_AREA()==null) || 
             (this.DUNN_AREA!=null &&
              this.DUNN_AREA.equals(other.getDUNN_AREA()))) &&
            ((this.DUNN_BLOCK==null && other.getDUNN_BLOCK()==null) || 
             (this.DUNN_BLOCK!=null &&
              this.DUNN_BLOCK.equals(other.getDUNN_BLOCK()))) &&
            ((this.ACC_DET_KEY==null && other.getACC_DET_KEY()==null) || 
             (this.ACC_DET_KEY!=null &&
              this.ACC_DET_KEY.equals(other.getACC_DET_KEY()))) &&
            ((this.TAX_TYPE==null && other.getTAX_TYPE()==null) || 
             (this.TAX_TYPE!=null &&
              this.TAX_TYPE.equals(other.getTAX_TYPE()))) &&
            ((this.TAX_GROUP==null && other.getTAX_GROUP()==null) || 
             (this.TAX_GROUP!=null &&
              this.TAX_GROUP.equals(other.getTAX_GROUP()))) &&
            ((this.IS_GROSS==null && other.getIS_GROSS()==null) || 
             (this.IS_GROSS!=null &&
              this.IS_GROSS.equals(other.getIS_GROSS()))) &&
            ((this.PARTNER==null && other.getPARTNER()==null) || 
             (this.PARTNER!=null &&
              this.PARTNER.equals(other.getPARTNER()))) &&
            ((this.COST_OBJECT_TYPE==null && other.getCOST_OBJECT_TYPE()==null) || 
             (this.COST_OBJECT_TYPE!=null &&
              this.COST_OBJECT_TYPE.equals(other.getCOST_OBJECT_TYPE()))) &&
            ((this.COST_OBJECT_ID==null && other.getCOST_OBJECT_ID()==null) || 
             (this.COST_OBJECT_ID!=null &&
              this.COST_OBJECT_ID.equals(other.getCOST_OBJECT_ID()))) &&
            ((this.HOUSEBANK_ACCOUNT==null && other.getHOUSEBANK_ACCOUNT()==null) || 
             (this.HOUSEBANK_ACCOUNT!=null &&
              this.HOUSEBANK_ACCOUNT.equals(other.getHOUSEBANK_ACCOUNT()))) &&
            ((this.PYMT_METH_CRMO==null && other.getPYMT_METH_CRMO()==null) || 
             (this.PYMT_METH_CRMO!=null &&
              this.PYMT_METH_CRMO.equals(other.getPYMT_METH_CRMO()))) &&
            ((this.DUNN_KEY==null && other.getDUNN_KEY()==null) || 
             (this.DUNN_KEY!=null &&
              this.DUNN_KEY.equals(other.getDUNN_KEY()))) &&
            ((this.TAXJURCODE==null && other.getTAXJURCODE()==null) || 
             (this.TAXJURCODE!=null &&
              this.TAXJURCODE.equals(other.getTAXJURCODE())));
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
        if (getOBJECT_ID() != null) {
            _hashCode += getOBJECT_ID().hashCode();
        }
        if (getTERM_NO() != null) {
            _hashCode += getTERM_NO().hashCode();
        }
        if (getTERM_TEXT() != null) {
            _hashCode += getTERM_TEXT().hashCode();
        }
        if (getVALID_FROM() != null) {
            _hashCode += getVALID_FROM().hashCode();
        }
        if (getVALID_TO() != null) {
            _hashCode += getVALID_TO().hashCode();
        }
        if (getPYMT_METH() != null) {
            _hashCode += getPYMT_METH().hashCode();
        }
        if (getPMNT_BLOCK() != null) {
            _hashCode += getPMNT_BLOCK().hashCode();
        }
        if (getPMNTTRMS() != null) {
            _hashCode += getPMNTTRMS().hashCode();
        }
        if (getHOUSEBANKID() != null) {
            _hashCode += getHOUSEBANKID().hashCode();
        }
        if (getBANKDETAILID() != null) {
            _hashCode += getBANKDETAILID().hashCode();
        }
        if (getNOTETOPAYEE() != null) {
            _hashCode += getNOTETOPAYEE().hashCode();
        }
        if (getDUNN_AREA() != null) {
            _hashCode += getDUNN_AREA().hashCode();
        }
        if (getDUNN_BLOCK() != null) {
            _hashCode += getDUNN_BLOCK().hashCode();
        }
        if (getACC_DET_KEY() != null) {
            _hashCode += getACC_DET_KEY().hashCode();
        }
        if (getTAX_TYPE() != null) {
            _hashCode += getTAX_TYPE().hashCode();
        }
        if (getTAX_GROUP() != null) {
            _hashCode += getTAX_GROUP().hashCode();
        }
        if (getIS_GROSS() != null) {
            _hashCode += getIS_GROSS().hashCode();
        }
        if (getPARTNER() != null) {
            _hashCode += getPARTNER().hashCode();
        }
        if (getCOST_OBJECT_TYPE() != null) {
            _hashCode += getCOST_OBJECT_TYPE().hashCode();
        }
        if (getCOST_OBJECT_ID() != null) {
            _hashCode += getCOST_OBJECT_ID().hashCode();
        }
        if (getHOUSEBANK_ACCOUNT() != null) {
            _hashCode += getHOUSEBANK_ACCOUNT().hashCode();
        }
        if (getPYMT_METH_CRMO() != null) {
            _hashCode += getPYMT_METH_CRMO().hashCode();
        }
        if (getDUNN_KEY() != null) {
            _hashCode += getDUNN_KEY().hashCode();
        }
        if (getTAXJURCODE() != null) {
            _hashCode += getTAXJURCODE().hashCode();
        }
        __hashCodeCalc = false;
        return _hashCode;
    }

    // Type metadata
    private static org.apache.axis.description.TypeDesc typeDesc =
        new org.apache.axis.description.TypeDesc(DT_ContractSearchSub_PY.class, true);

    static {
        typeDesc.setXmlType(new javax.xml.namespace.QName("urn:ecc:rvs:contract", "DT_ContractSearchSub_PY"));
        org.apache.axis.description.ElementDesc elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("OBJECT_ID");
        elemField.setXmlName(new javax.xml.namespace.QName("", "OBJECT_ID"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("TERM_NO");
        elemField.setXmlName(new javax.xml.namespace.QName("", "TERM_NO"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("TERM_TEXT");
        elemField.setXmlName(new javax.xml.namespace.QName("", "TERM_TEXT"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("VALID_FROM");
        elemField.setXmlName(new javax.xml.namespace.QName("", "VALID_FROM"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("VALID_TO");
        elemField.setXmlName(new javax.xml.namespace.QName("", "VALID_TO"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("PYMT_METH");
        elemField.setXmlName(new javax.xml.namespace.QName("", "PYMT_METH"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("PMNT_BLOCK");
        elemField.setXmlName(new javax.xml.namespace.QName("", "PMNT_BLOCK"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("PMNTTRMS");
        elemField.setXmlName(new javax.xml.namespace.QName("", "PMNTTRMS"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("HOUSEBANKID");
        elemField.setXmlName(new javax.xml.namespace.QName("", "HOUSEBANKID"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("BANKDETAILID");
        elemField.setXmlName(new javax.xml.namespace.QName("", "BANKDETAILID"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("NOTETOPAYEE");
        elemField.setXmlName(new javax.xml.namespace.QName("", "NOTETOPAYEE"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("DUNN_AREA");
        elemField.setXmlName(new javax.xml.namespace.QName("", "DUNN_AREA"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("DUNN_BLOCK");
        elemField.setXmlName(new javax.xml.namespace.QName("", "DUNN_BLOCK"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("ACC_DET_KEY");
        elemField.setXmlName(new javax.xml.namespace.QName("", "ACC_DET_KEY"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("TAX_TYPE");
        elemField.setXmlName(new javax.xml.namespace.QName("", "TAX_TYPE"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("TAX_GROUP");
        elemField.setXmlName(new javax.xml.namespace.QName("", "TAX_GROUP"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("IS_GROSS");
        elemField.setXmlName(new javax.xml.namespace.QName("", "IS_GROSS"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("PARTNER");
        elemField.setXmlName(new javax.xml.namespace.QName("", "PARTNER"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("COST_OBJECT_TYPE");
        elemField.setXmlName(new javax.xml.namespace.QName("", "COST_OBJECT_TYPE"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("COST_OBJECT_ID");
        elemField.setXmlName(new javax.xml.namespace.QName("", "COST_OBJECT_ID"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("HOUSEBANK_ACCOUNT");
        elemField.setXmlName(new javax.xml.namespace.QName("", "HOUSEBANK_ACCOUNT"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("PYMT_METH_CRMO");
        elemField.setXmlName(new javax.xml.namespace.QName("", "PYMT_METH_CRMO"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("DUNN_KEY");
        elemField.setXmlName(new javax.xml.namespace.QName("", "DUNN_KEY"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("TAXJURCODE");
        elemField.setXmlName(new javax.xml.namespace.QName("", "TAXJURCODE"));
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
