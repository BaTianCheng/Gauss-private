/**
 * _BIC_AZMDYX0000.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package com.esb.jinying.sap.functions.rfc.sap.document.sap_com;

public class _BIC_AZMDYX0000  implements java.io.Serializable {
    /* Company code */
    private java.lang.String COMP_CODE;

    private java.lang.String _BIC_ZBMBM;

    private java.lang.String _BIC_ZGZBM;

    /* Sales Organization */
    private java.lang.String SALESORG;

    /* Calendar day */
    private com.esb.jinying.sap.functions.rfc.sap.document.sap_com.Date CALDAY;

    private java.math.BigDecimal _BIC_ZGSPY;

    private java.math.BigDecimal _BIC_ZGSPQNY;

    private java.math.BigDecimal _BIC_ZCWMLEY;

    private java.math.BigDecimal _BIC_ZCWMLEQNY;

    private java.math.BigDecimal _BIC_ZGSPN;

    private java.math.BigDecimal _BIC_ZGSPQN;

    /* Document currency */
    private java.lang.String DOC_CURRCY;

    private java.math.BigDecimal _BIC_ZCWMLEN;

    private java.math.BigDecimal _BIC_ZCWMLEQN;

    /* BW Delta Process: Record Mode */
    private java.lang.String RECORDMODE;

    private java.math.BigDecimal _BIC_ZGSPT;

    private java.math.BigDecimal _BIC_ZGSPQNT;

    private java.math.BigDecimal _BIC_ZCWMLET;

    private java.math.BigDecimal _BIC_ZCWMLEQNT;

    private java.lang.String _BIC_ZGSMC;

    private java.lang.String _BIC_ZBMMC;

    private java.lang.String _BIC_ZGZMC;

    private com.esb.jinying.sap.functions.rfc.sap.document.sap_com.Date _BIC_ZLAST_D;

    private java.lang.String _BIC_ZD_NAME;

    private java.math.BigDecimal _BIC_ZZB01;

    private java.math.BigDecimal _BIC_ZZB02;

    private java.math.BigDecimal _BIC_ZZB03;

    private java.math.BigDecimal _BIC_ZZB04;

    private java.math.BigDecimal _BIC_ZZB05;

    private java.math.BigDecimal _BIC_ZZB06;

    public _BIC_AZMDYX0000() {
    }

    public _BIC_AZMDYX0000(
           java.lang.String COMP_CODE,
           java.lang.String _BIC_ZBMBM,
           java.lang.String _BIC_ZGZBM,
           java.lang.String SALESORG,
           com.esb.jinying.sap.functions.rfc.sap.document.sap_com.Date CALDAY,
           java.math.BigDecimal _BIC_ZGSPY,
           java.math.BigDecimal _BIC_ZGSPQNY,
           java.math.BigDecimal _BIC_ZCWMLEY,
           java.math.BigDecimal _BIC_ZCWMLEQNY,
           java.math.BigDecimal _BIC_ZGSPN,
           java.math.BigDecimal _BIC_ZGSPQN,
           java.lang.String DOC_CURRCY,
           java.math.BigDecimal _BIC_ZCWMLEN,
           java.math.BigDecimal _BIC_ZCWMLEQN,
           java.lang.String RECORDMODE,
           java.math.BigDecimal _BIC_ZGSPT,
           java.math.BigDecimal _BIC_ZGSPQNT,
           java.math.BigDecimal _BIC_ZCWMLET,
           java.math.BigDecimal _BIC_ZCWMLEQNT,
           java.lang.String _BIC_ZGSMC,
           java.lang.String _BIC_ZBMMC,
           java.lang.String _BIC_ZGZMC,
           com.esb.jinying.sap.functions.rfc.sap.document.sap_com.Date _BIC_ZLAST_D,
           java.lang.String _BIC_ZD_NAME,
           java.math.BigDecimal _BIC_ZZB01,
           java.math.BigDecimal _BIC_ZZB02,
           java.math.BigDecimal _BIC_ZZB03,
           java.math.BigDecimal _BIC_ZZB04,
           java.math.BigDecimal _BIC_ZZB05,
           java.math.BigDecimal _BIC_ZZB06) {
           this.COMP_CODE = COMP_CODE;
           this._BIC_ZBMBM = _BIC_ZBMBM;
           this._BIC_ZGZBM = _BIC_ZGZBM;
           this.SALESORG = SALESORG;
           this.CALDAY = CALDAY;
           this._BIC_ZGSPY = _BIC_ZGSPY;
           this._BIC_ZGSPQNY = _BIC_ZGSPQNY;
           this._BIC_ZCWMLEY = _BIC_ZCWMLEY;
           this._BIC_ZCWMLEQNY = _BIC_ZCWMLEQNY;
           this._BIC_ZGSPN = _BIC_ZGSPN;
           this._BIC_ZGSPQN = _BIC_ZGSPQN;
           this.DOC_CURRCY = DOC_CURRCY;
           this._BIC_ZCWMLEN = _BIC_ZCWMLEN;
           this._BIC_ZCWMLEQN = _BIC_ZCWMLEQN;
           this.RECORDMODE = RECORDMODE;
           this._BIC_ZGSPT = _BIC_ZGSPT;
           this._BIC_ZGSPQNT = _BIC_ZGSPQNT;
           this._BIC_ZCWMLET = _BIC_ZCWMLET;
           this._BIC_ZCWMLEQNT = _BIC_ZCWMLEQNT;
           this._BIC_ZGSMC = _BIC_ZGSMC;
           this._BIC_ZBMMC = _BIC_ZBMMC;
           this._BIC_ZGZMC = _BIC_ZGZMC;
           this._BIC_ZLAST_D = _BIC_ZLAST_D;
           this._BIC_ZD_NAME = _BIC_ZD_NAME;
           this._BIC_ZZB01 = _BIC_ZZB01;
           this._BIC_ZZB02 = _BIC_ZZB02;
           this._BIC_ZZB03 = _BIC_ZZB03;
           this._BIC_ZZB04 = _BIC_ZZB04;
           this._BIC_ZZB05 = _BIC_ZZB05;
           this._BIC_ZZB06 = _BIC_ZZB06;
    }


    /**
     * Gets the COMP_CODE value for this _BIC_AZMDYX0000.
     * 
     * @return COMP_CODE   * Company code
     */
    public java.lang.String getCOMP_CODE() {
        return COMP_CODE;
    }


    /**
     * Sets the COMP_CODE value for this _BIC_AZMDYX0000.
     * 
     * @param COMP_CODE   * Company code
     */
    public void setCOMP_CODE(java.lang.String COMP_CODE) {
        this.COMP_CODE = COMP_CODE;
    }


    /**
     * Gets the _BIC_ZBMBM value for this _BIC_AZMDYX0000.
     * 
     * @return _BIC_ZBMBM
     */
    public java.lang.String get_BIC_ZBMBM() {
        return _BIC_ZBMBM;
    }


    /**
     * Sets the _BIC_ZBMBM value for this _BIC_AZMDYX0000.
     * 
     * @param _BIC_ZBMBM
     */
    public void set_BIC_ZBMBM(java.lang.String _BIC_ZBMBM) {
        this._BIC_ZBMBM = _BIC_ZBMBM;
    }


    /**
     * Gets the _BIC_ZGZBM value for this _BIC_AZMDYX0000.
     * 
     * @return _BIC_ZGZBM
     */
    public java.lang.String get_BIC_ZGZBM() {
        return _BIC_ZGZBM;
    }


    /**
     * Sets the _BIC_ZGZBM value for this _BIC_AZMDYX0000.
     * 
     * @param _BIC_ZGZBM
     */
    public void set_BIC_ZGZBM(java.lang.String _BIC_ZGZBM) {
        this._BIC_ZGZBM = _BIC_ZGZBM;
    }


    /**
     * Gets the SALESORG value for this _BIC_AZMDYX0000.
     * 
     * @return SALESORG   * Sales Organization
     */
    public java.lang.String getSALESORG() {
        return SALESORG;
    }


    /**
     * Sets the SALESORG value for this _BIC_AZMDYX0000.
     * 
     * @param SALESORG   * Sales Organization
     */
    public void setSALESORG(java.lang.String SALESORG) {
        this.SALESORG = SALESORG;
    }


    /**
     * Gets the CALDAY value for this _BIC_AZMDYX0000.
     * 
     * @return CALDAY   * Calendar day
     */
    public com.esb.jinying.sap.functions.rfc.sap.document.sap_com.Date getCALDAY() {
        return CALDAY;
    }


    /**
     * Sets the CALDAY value for this _BIC_AZMDYX0000.
     * 
     * @param CALDAY   * Calendar day
     */
    public void setCALDAY(com.esb.jinying.sap.functions.rfc.sap.document.sap_com.Date CALDAY) {
        this.CALDAY = CALDAY;
    }


    /**
     * Gets the _BIC_ZGSPY value for this _BIC_AZMDYX0000.
     * 
     * @return _BIC_ZGSPY
     */
    public java.math.BigDecimal get_BIC_ZGSPY() {
        return _BIC_ZGSPY;
    }


    /**
     * Sets the _BIC_ZGSPY value for this _BIC_AZMDYX0000.
     * 
     * @param _BIC_ZGSPY
     */
    public void set_BIC_ZGSPY(java.math.BigDecimal _BIC_ZGSPY) {
        this._BIC_ZGSPY = _BIC_ZGSPY;
    }


    /**
     * Gets the _BIC_ZGSPQNY value for this _BIC_AZMDYX0000.
     * 
     * @return _BIC_ZGSPQNY
     */
    public java.math.BigDecimal get_BIC_ZGSPQNY() {
        return _BIC_ZGSPQNY;
    }


    /**
     * Sets the _BIC_ZGSPQNY value for this _BIC_AZMDYX0000.
     * 
     * @param _BIC_ZGSPQNY
     */
    public void set_BIC_ZGSPQNY(java.math.BigDecimal _BIC_ZGSPQNY) {
        this._BIC_ZGSPQNY = _BIC_ZGSPQNY;
    }


    /**
     * Gets the _BIC_ZCWMLEY value for this _BIC_AZMDYX0000.
     * 
     * @return _BIC_ZCWMLEY
     */
    public java.math.BigDecimal get_BIC_ZCWMLEY() {
        return _BIC_ZCWMLEY;
    }


    /**
     * Sets the _BIC_ZCWMLEY value for this _BIC_AZMDYX0000.
     * 
     * @param _BIC_ZCWMLEY
     */
    public void set_BIC_ZCWMLEY(java.math.BigDecimal _BIC_ZCWMLEY) {
        this._BIC_ZCWMLEY = _BIC_ZCWMLEY;
    }


    /**
     * Gets the _BIC_ZCWMLEQNY value for this _BIC_AZMDYX0000.
     * 
     * @return _BIC_ZCWMLEQNY
     */
    public java.math.BigDecimal get_BIC_ZCWMLEQNY() {
        return _BIC_ZCWMLEQNY;
    }


    /**
     * Sets the _BIC_ZCWMLEQNY value for this _BIC_AZMDYX0000.
     * 
     * @param _BIC_ZCWMLEQNY
     */
    public void set_BIC_ZCWMLEQNY(java.math.BigDecimal _BIC_ZCWMLEQNY) {
        this._BIC_ZCWMLEQNY = _BIC_ZCWMLEQNY;
    }


    /**
     * Gets the _BIC_ZGSPN value for this _BIC_AZMDYX0000.
     * 
     * @return _BIC_ZGSPN
     */
    public java.math.BigDecimal get_BIC_ZGSPN() {
        return _BIC_ZGSPN;
    }


    /**
     * Sets the _BIC_ZGSPN value for this _BIC_AZMDYX0000.
     * 
     * @param _BIC_ZGSPN
     */
    public void set_BIC_ZGSPN(java.math.BigDecimal _BIC_ZGSPN) {
        this._BIC_ZGSPN = _BIC_ZGSPN;
    }


    /**
     * Gets the _BIC_ZGSPQN value for this _BIC_AZMDYX0000.
     * 
     * @return _BIC_ZGSPQN
     */
    public java.math.BigDecimal get_BIC_ZGSPQN() {
        return _BIC_ZGSPQN;
    }


    /**
     * Sets the _BIC_ZGSPQN value for this _BIC_AZMDYX0000.
     * 
     * @param _BIC_ZGSPQN
     */
    public void set_BIC_ZGSPQN(java.math.BigDecimal _BIC_ZGSPQN) {
        this._BIC_ZGSPQN = _BIC_ZGSPQN;
    }


    /**
     * Gets the DOC_CURRCY value for this _BIC_AZMDYX0000.
     * 
     * @return DOC_CURRCY   * Document currency
     */
    public java.lang.String getDOC_CURRCY() {
        return DOC_CURRCY;
    }


    /**
     * Sets the DOC_CURRCY value for this _BIC_AZMDYX0000.
     * 
     * @param DOC_CURRCY   * Document currency
     */
    public void setDOC_CURRCY(java.lang.String DOC_CURRCY) {
        this.DOC_CURRCY = DOC_CURRCY;
    }


    /**
     * Gets the _BIC_ZCWMLEN value for this _BIC_AZMDYX0000.
     * 
     * @return _BIC_ZCWMLEN
     */
    public java.math.BigDecimal get_BIC_ZCWMLEN() {
        return _BIC_ZCWMLEN;
    }


    /**
     * Sets the _BIC_ZCWMLEN value for this _BIC_AZMDYX0000.
     * 
     * @param _BIC_ZCWMLEN
     */
    public void set_BIC_ZCWMLEN(java.math.BigDecimal _BIC_ZCWMLEN) {
        this._BIC_ZCWMLEN = _BIC_ZCWMLEN;
    }


    /**
     * Gets the _BIC_ZCWMLEQN value for this _BIC_AZMDYX0000.
     * 
     * @return _BIC_ZCWMLEQN
     */
    public java.math.BigDecimal get_BIC_ZCWMLEQN() {
        return _BIC_ZCWMLEQN;
    }


    /**
     * Sets the _BIC_ZCWMLEQN value for this _BIC_AZMDYX0000.
     * 
     * @param _BIC_ZCWMLEQN
     */
    public void set_BIC_ZCWMLEQN(java.math.BigDecimal _BIC_ZCWMLEQN) {
        this._BIC_ZCWMLEQN = _BIC_ZCWMLEQN;
    }


    /**
     * Gets the RECORDMODE value for this _BIC_AZMDYX0000.
     * 
     * @return RECORDMODE   * BW Delta Process: Record Mode
     */
    public java.lang.String getRECORDMODE() {
        return RECORDMODE;
    }


    /**
     * Sets the RECORDMODE value for this _BIC_AZMDYX0000.
     * 
     * @param RECORDMODE   * BW Delta Process: Record Mode
     */
    public void setRECORDMODE(java.lang.String RECORDMODE) {
        this.RECORDMODE = RECORDMODE;
    }


    /**
     * Gets the _BIC_ZGSPT value for this _BIC_AZMDYX0000.
     * 
     * @return _BIC_ZGSPT
     */
    public java.math.BigDecimal get_BIC_ZGSPT() {
        return _BIC_ZGSPT;
    }


    /**
     * Sets the _BIC_ZGSPT value for this _BIC_AZMDYX0000.
     * 
     * @param _BIC_ZGSPT
     */
    public void set_BIC_ZGSPT(java.math.BigDecimal _BIC_ZGSPT) {
        this._BIC_ZGSPT = _BIC_ZGSPT;
    }


    /**
     * Gets the _BIC_ZGSPQNT value for this _BIC_AZMDYX0000.
     * 
     * @return _BIC_ZGSPQNT
     */
    public java.math.BigDecimal get_BIC_ZGSPQNT() {
        return _BIC_ZGSPQNT;
    }


    /**
     * Sets the _BIC_ZGSPQNT value for this _BIC_AZMDYX0000.
     * 
     * @param _BIC_ZGSPQNT
     */
    public void set_BIC_ZGSPQNT(java.math.BigDecimal _BIC_ZGSPQNT) {
        this._BIC_ZGSPQNT = _BIC_ZGSPQNT;
    }


    /**
     * Gets the _BIC_ZCWMLET value for this _BIC_AZMDYX0000.
     * 
     * @return _BIC_ZCWMLET
     */
    public java.math.BigDecimal get_BIC_ZCWMLET() {
        return _BIC_ZCWMLET;
    }


    /**
     * Sets the _BIC_ZCWMLET value for this _BIC_AZMDYX0000.
     * 
     * @param _BIC_ZCWMLET
     */
    public void set_BIC_ZCWMLET(java.math.BigDecimal _BIC_ZCWMLET) {
        this._BIC_ZCWMLET = _BIC_ZCWMLET;
    }


    /**
     * Gets the _BIC_ZCWMLEQNT value for this _BIC_AZMDYX0000.
     * 
     * @return _BIC_ZCWMLEQNT
     */
    public java.math.BigDecimal get_BIC_ZCWMLEQNT() {
        return _BIC_ZCWMLEQNT;
    }


    /**
     * Sets the _BIC_ZCWMLEQNT value for this _BIC_AZMDYX0000.
     * 
     * @param _BIC_ZCWMLEQNT
     */
    public void set_BIC_ZCWMLEQNT(java.math.BigDecimal _BIC_ZCWMLEQNT) {
        this._BIC_ZCWMLEQNT = _BIC_ZCWMLEQNT;
    }


    /**
     * Gets the _BIC_ZGSMC value for this _BIC_AZMDYX0000.
     * 
     * @return _BIC_ZGSMC
     */
    public java.lang.String get_BIC_ZGSMC() {
        return _BIC_ZGSMC;
    }


    /**
     * Sets the _BIC_ZGSMC value for this _BIC_AZMDYX0000.
     * 
     * @param _BIC_ZGSMC
     */
    public void set_BIC_ZGSMC(java.lang.String _BIC_ZGSMC) {
        this._BIC_ZGSMC = _BIC_ZGSMC;
    }


    /**
     * Gets the _BIC_ZBMMC value for this _BIC_AZMDYX0000.
     * 
     * @return _BIC_ZBMMC
     */
    public java.lang.String get_BIC_ZBMMC() {
        return _BIC_ZBMMC;
    }


    /**
     * Sets the _BIC_ZBMMC value for this _BIC_AZMDYX0000.
     * 
     * @param _BIC_ZBMMC
     */
    public void set_BIC_ZBMMC(java.lang.String _BIC_ZBMMC) {
        this._BIC_ZBMMC = _BIC_ZBMMC;
    }


    /**
     * Gets the _BIC_ZGZMC value for this _BIC_AZMDYX0000.
     * 
     * @return _BIC_ZGZMC
     */
    public java.lang.String get_BIC_ZGZMC() {
        return _BIC_ZGZMC;
    }


    /**
     * Sets the _BIC_ZGZMC value for this _BIC_AZMDYX0000.
     * 
     * @param _BIC_ZGZMC
     */
    public void set_BIC_ZGZMC(java.lang.String _BIC_ZGZMC) {
        this._BIC_ZGZMC = _BIC_ZGZMC;
    }


    /**
     * Gets the _BIC_ZLAST_D value for this _BIC_AZMDYX0000.
     * 
     * @return _BIC_ZLAST_D
     */
    public com.esb.jinying.sap.functions.rfc.sap.document.sap_com.Date get_BIC_ZLAST_D() {
        return _BIC_ZLAST_D;
    }


    /**
     * Sets the _BIC_ZLAST_D value for this _BIC_AZMDYX0000.
     * 
     * @param _BIC_ZLAST_D
     */
    public void set_BIC_ZLAST_D(com.esb.jinying.sap.functions.rfc.sap.document.sap_com.Date _BIC_ZLAST_D) {
        this._BIC_ZLAST_D = _BIC_ZLAST_D;
    }


    /**
     * Gets the _BIC_ZD_NAME value for this _BIC_AZMDYX0000.
     * 
     * @return _BIC_ZD_NAME
     */
    public java.lang.String get_BIC_ZD_NAME() {
        return _BIC_ZD_NAME;
    }


    /**
     * Sets the _BIC_ZD_NAME value for this _BIC_AZMDYX0000.
     * 
     * @param _BIC_ZD_NAME
     */
    public void set_BIC_ZD_NAME(java.lang.String _BIC_ZD_NAME) {
        this._BIC_ZD_NAME = _BIC_ZD_NAME;
    }


    /**
     * Gets the _BIC_ZZB01 value for this _BIC_AZMDYX0000.
     * 
     * @return _BIC_ZZB01
     */
    public java.math.BigDecimal get_BIC_ZZB01() {
        return _BIC_ZZB01;
    }


    /**
     * Sets the _BIC_ZZB01 value for this _BIC_AZMDYX0000.
     * 
     * @param _BIC_ZZB01
     */
    public void set_BIC_ZZB01(java.math.BigDecimal _BIC_ZZB01) {
        this._BIC_ZZB01 = _BIC_ZZB01;
    }


    /**
     * Gets the _BIC_ZZB02 value for this _BIC_AZMDYX0000.
     * 
     * @return _BIC_ZZB02
     */
    public java.math.BigDecimal get_BIC_ZZB02() {
        return _BIC_ZZB02;
    }


    /**
     * Sets the _BIC_ZZB02 value for this _BIC_AZMDYX0000.
     * 
     * @param _BIC_ZZB02
     */
    public void set_BIC_ZZB02(java.math.BigDecimal _BIC_ZZB02) {
        this._BIC_ZZB02 = _BIC_ZZB02;
    }


    /**
     * Gets the _BIC_ZZB03 value for this _BIC_AZMDYX0000.
     * 
     * @return _BIC_ZZB03
     */
    public java.math.BigDecimal get_BIC_ZZB03() {
        return _BIC_ZZB03;
    }


    /**
     * Sets the _BIC_ZZB03 value for this _BIC_AZMDYX0000.
     * 
     * @param _BIC_ZZB03
     */
    public void set_BIC_ZZB03(java.math.BigDecimal _BIC_ZZB03) {
        this._BIC_ZZB03 = _BIC_ZZB03;
    }


    /**
     * Gets the _BIC_ZZB04 value for this _BIC_AZMDYX0000.
     * 
     * @return _BIC_ZZB04
     */
    public java.math.BigDecimal get_BIC_ZZB04() {
        return _BIC_ZZB04;
    }


    /**
     * Sets the _BIC_ZZB04 value for this _BIC_AZMDYX0000.
     * 
     * @param _BIC_ZZB04
     */
    public void set_BIC_ZZB04(java.math.BigDecimal _BIC_ZZB04) {
        this._BIC_ZZB04 = _BIC_ZZB04;
    }


    /**
     * Gets the _BIC_ZZB05 value for this _BIC_AZMDYX0000.
     * 
     * @return _BIC_ZZB05
     */
    public java.math.BigDecimal get_BIC_ZZB05() {
        return _BIC_ZZB05;
    }


    /**
     * Sets the _BIC_ZZB05 value for this _BIC_AZMDYX0000.
     * 
     * @param _BIC_ZZB05
     */
    public void set_BIC_ZZB05(java.math.BigDecimal _BIC_ZZB05) {
        this._BIC_ZZB05 = _BIC_ZZB05;
    }


    /**
     * Gets the _BIC_ZZB06 value for this _BIC_AZMDYX0000.
     * 
     * @return _BIC_ZZB06
     */
    public java.math.BigDecimal get_BIC_ZZB06() {
        return _BIC_ZZB06;
    }


    /**
     * Sets the _BIC_ZZB06 value for this _BIC_AZMDYX0000.
     * 
     * @param _BIC_ZZB06
     */
    public void set_BIC_ZZB06(java.math.BigDecimal _BIC_ZZB06) {
        this._BIC_ZZB06 = _BIC_ZZB06;
    }

    private java.lang.Object __equalsCalc = null;
    public synchronized boolean equals(java.lang.Object obj) {
        if (!(obj instanceof _BIC_AZMDYX0000)) return false;
        _BIC_AZMDYX0000 other = (_BIC_AZMDYX0000) obj;
        if (obj == null) return false;
        if (this == obj) return true;
        if (__equalsCalc != null) {
            return (__equalsCalc == obj);
        }
        __equalsCalc = obj;
        boolean _equals;
        _equals = true && 
            ((this.COMP_CODE==null && other.getCOMP_CODE()==null) || 
             (this.COMP_CODE!=null &&
              this.COMP_CODE.equals(other.getCOMP_CODE()))) &&
            ((this._BIC_ZBMBM==null && other.get_BIC_ZBMBM()==null) || 
             (this._BIC_ZBMBM!=null &&
              this._BIC_ZBMBM.equals(other.get_BIC_ZBMBM()))) &&
            ((this._BIC_ZGZBM==null && other.get_BIC_ZGZBM()==null) || 
             (this._BIC_ZGZBM!=null &&
              this._BIC_ZGZBM.equals(other.get_BIC_ZGZBM()))) &&
            ((this.SALESORG==null && other.getSALESORG()==null) || 
             (this.SALESORG!=null &&
              this.SALESORG.equals(other.getSALESORG()))) &&
            ((this.CALDAY==null && other.getCALDAY()==null) || 
             (this.CALDAY!=null &&
              this.CALDAY.equals(other.getCALDAY()))) &&
            ((this._BIC_ZGSPY==null && other.get_BIC_ZGSPY()==null) || 
             (this._BIC_ZGSPY!=null &&
              this._BIC_ZGSPY.equals(other.get_BIC_ZGSPY()))) &&
            ((this._BIC_ZGSPQNY==null && other.get_BIC_ZGSPQNY()==null) || 
             (this._BIC_ZGSPQNY!=null &&
              this._BIC_ZGSPQNY.equals(other.get_BIC_ZGSPQNY()))) &&
            ((this._BIC_ZCWMLEY==null && other.get_BIC_ZCWMLEY()==null) || 
             (this._BIC_ZCWMLEY!=null &&
              this._BIC_ZCWMLEY.equals(other.get_BIC_ZCWMLEY()))) &&
            ((this._BIC_ZCWMLEQNY==null && other.get_BIC_ZCWMLEQNY()==null) || 
             (this._BIC_ZCWMLEQNY!=null &&
              this._BIC_ZCWMLEQNY.equals(other.get_BIC_ZCWMLEQNY()))) &&
            ((this._BIC_ZGSPN==null && other.get_BIC_ZGSPN()==null) || 
             (this._BIC_ZGSPN!=null &&
              this._BIC_ZGSPN.equals(other.get_BIC_ZGSPN()))) &&
            ((this._BIC_ZGSPQN==null && other.get_BIC_ZGSPQN()==null) || 
             (this._BIC_ZGSPQN!=null &&
              this._BIC_ZGSPQN.equals(other.get_BIC_ZGSPQN()))) &&
            ((this.DOC_CURRCY==null && other.getDOC_CURRCY()==null) || 
             (this.DOC_CURRCY!=null &&
              this.DOC_CURRCY.equals(other.getDOC_CURRCY()))) &&
            ((this._BIC_ZCWMLEN==null && other.get_BIC_ZCWMLEN()==null) || 
             (this._BIC_ZCWMLEN!=null &&
              this._BIC_ZCWMLEN.equals(other.get_BIC_ZCWMLEN()))) &&
            ((this._BIC_ZCWMLEQN==null && other.get_BIC_ZCWMLEQN()==null) || 
             (this._BIC_ZCWMLEQN!=null &&
              this._BIC_ZCWMLEQN.equals(other.get_BIC_ZCWMLEQN()))) &&
            ((this.RECORDMODE==null && other.getRECORDMODE()==null) || 
             (this.RECORDMODE!=null &&
              this.RECORDMODE.equals(other.getRECORDMODE()))) &&
            ((this._BIC_ZGSPT==null && other.get_BIC_ZGSPT()==null) || 
             (this._BIC_ZGSPT!=null &&
              this._BIC_ZGSPT.equals(other.get_BIC_ZGSPT()))) &&
            ((this._BIC_ZGSPQNT==null && other.get_BIC_ZGSPQNT()==null) || 
             (this._BIC_ZGSPQNT!=null &&
              this._BIC_ZGSPQNT.equals(other.get_BIC_ZGSPQNT()))) &&
            ((this._BIC_ZCWMLET==null && other.get_BIC_ZCWMLET()==null) || 
             (this._BIC_ZCWMLET!=null &&
              this._BIC_ZCWMLET.equals(other.get_BIC_ZCWMLET()))) &&
            ((this._BIC_ZCWMLEQNT==null && other.get_BIC_ZCWMLEQNT()==null) || 
             (this._BIC_ZCWMLEQNT!=null &&
              this._BIC_ZCWMLEQNT.equals(other.get_BIC_ZCWMLEQNT()))) &&
            ((this._BIC_ZGSMC==null && other.get_BIC_ZGSMC()==null) || 
             (this._BIC_ZGSMC!=null &&
              this._BIC_ZGSMC.equals(other.get_BIC_ZGSMC()))) &&
            ((this._BIC_ZBMMC==null && other.get_BIC_ZBMMC()==null) || 
             (this._BIC_ZBMMC!=null &&
              this._BIC_ZBMMC.equals(other.get_BIC_ZBMMC()))) &&
            ((this._BIC_ZGZMC==null && other.get_BIC_ZGZMC()==null) || 
             (this._BIC_ZGZMC!=null &&
              this._BIC_ZGZMC.equals(other.get_BIC_ZGZMC()))) &&
            ((this._BIC_ZLAST_D==null && other.get_BIC_ZLAST_D()==null) || 
             (this._BIC_ZLAST_D!=null &&
              this._BIC_ZLAST_D.equals(other.get_BIC_ZLAST_D()))) &&
            ((this._BIC_ZD_NAME==null && other.get_BIC_ZD_NAME()==null) || 
             (this._BIC_ZD_NAME!=null &&
              this._BIC_ZD_NAME.equals(other.get_BIC_ZD_NAME()))) &&
            ((this._BIC_ZZB01==null && other.get_BIC_ZZB01()==null) || 
             (this._BIC_ZZB01!=null &&
              this._BIC_ZZB01.equals(other.get_BIC_ZZB01()))) &&
            ((this._BIC_ZZB02==null && other.get_BIC_ZZB02()==null) || 
             (this._BIC_ZZB02!=null &&
              this._BIC_ZZB02.equals(other.get_BIC_ZZB02()))) &&
            ((this._BIC_ZZB03==null && other.get_BIC_ZZB03()==null) || 
             (this._BIC_ZZB03!=null &&
              this._BIC_ZZB03.equals(other.get_BIC_ZZB03()))) &&
            ((this._BIC_ZZB04==null && other.get_BIC_ZZB04()==null) || 
             (this._BIC_ZZB04!=null &&
              this._BIC_ZZB04.equals(other.get_BIC_ZZB04()))) &&
            ((this._BIC_ZZB05==null && other.get_BIC_ZZB05()==null) || 
             (this._BIC_ZZB05!=null &&
              this._BIC_ZZB05.equals(other.get_BIC_ZZB05()))) &&
            ((this._BIC_ZZB06==null && other.get_BIC_ZZB06()==null) || 
             (this._BIC_ZZB06!=null &&
              this._BIC_ZZB06.equals(other.get_BIC_ZZB06())));
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
        if (getCOMP_CODE() != null) {
            _hashCode += getCOMP_CODE().hashCode();
        }
        if (get_BIC_ZBMBM() != null) {
            _hashCode += get_BIC_ZBMBM().hashCode();
        }
        if (get_BIC_ZGZBM() != null) {
            _hashCode += get_BIC_ZGZBM().hashCode();
        }
        if (getSALESORG() != null) {
            _hashCode += getSALESORG().hashCode();
        }
        if (getCALDAY() != null) {
            _hashCode += getCALDAY().hashCode();
        }
        if (get_BIC_ZGSPY() != null) {
            _hashCode += get_BIC_ZGSPY().hashCode();
        }
        if (get_BIC_ZGSPQNY() != null) {
            _hashCode += get_BIC_ZGSPQNY().hashCode();
        }
        if (get_BIC_ZCWMLEY() != null) {
            _hashCode += get_BIC_ZCWMLEY().hashCode();
        }
        if (get_BIC_ZCWMLEQNY() != null) {
            _hashCode += get_BIC_ZCWMLEQNY().hashCode();
        }
        if (get_BIC_ZGSPN() != null) {
            _hashCode += get_BIC_ZGSPN().hashCode();
        }
        if (get_BIC_ZGSPQN() != null) {
            _hashCode += get_BIC_ZGSPQN().hashCode();
        }
        if (getDOC_CURRCY() != null) {
            _hashCode += getDOC_CURRCY().hashCode();
        }
        if (get_BIC_ZCWMLEN() != null) {
            _hashCode += get_BIC_ZCWMLEN().hashCode();
        }
        if (get_BIC_ZCWMLEQN() != null) {
            _hashCode += get_BIC_ZCWMLEQN().hashCode();
        }
        if (getRECORDMODE() != null) {
            _hashCode += getRECORDMODE().hashCode();
        }
        if (get_BIC_ZGSPT() != null) {
            _hashCode += get_BIC_ZGSPT().hashCode();
        }
        if (get_BIC_ZGSPQNT() != null) {
            _hashCode += get_BIC_ZGSPQNT().hashCode();
        }
        if (get_BIC_ZCWMLET() != null) {
            _hashCode += get_BIC_ZCWMLET().hashCode();
        }
        if (get_BIC_ZCWMLEQNT() != null) {
            _hashCode += get_BIC_ZCWMLEQNT().hashCode();
        }
        if (get_BIC_ZGSMC() != null) {
            _hashCode += get_BIC_ZGSMC().hashCode();
        }
        if (get_BIC_ZBMMC() != null) {
            _hashCode += get_BIC_ZBMMC().hashCode();
        }
        if (get_BIC_ZGZMC() != null) {
            _hashCode += get_BIC_ZGZMC().hashCode();
        }
        if (get_BIC_ZLAST_D() != null) {
            _hashCode += get_BIC_ZLAST_D().hashCode();
        }
        if (get_BIC_ZD_NAME() != null) {
            _hashCode += get_BIC_ZD_NAME().hashCode();
        }
        if (get_BIC_ZZB01() != null) {
            _hashCode += get_BIC_ZZB01().hashCode();
        }
        if (get_BIC_ZZB02() != null) {
            _hashCode += get_BIC_ZZB02().hashCode();
        }
        if (get_BIC_ZZB03() != null) {
            _hashCode += get_BIC_ZZB03().hashCode();
        }
        if (get_BIC_ZZB04() != null) {
            _hashCode += get_BIC_ZZB04().hashCode();
        }
        if (get_BIC_ZZB05() != null) {
            _hashCode += get_BIC_ZZB05().hashCode();
        }
        if (get_BIC_ZZB06() != null) {
            _hashCode += get_BIC_ZZB06().hashCode();
        }
        __hashCodeCalc = false;
        return _hashCode;
    }

    // Type metadata
    private static org.apache.axis.description.TypeDesc typeDesc =
        new org.apache.axis.description.TypeDesc(_BIC_AZMDYX0000.class, true);

    static {
        typeDesc.setXmlType(new javax.xml.namespace.QName("urn:sap-com:document:sap:rfc:functions", "_-BIC_-AZMDYX0000"));
        org.apache.axis.description.ElementDesc elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("COMP_CODE");
        elemField.setXmlName(new javax.xml.namespace.QName("", "COMP_CODE"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("_BIC_ZBMBM");
        elemField.setXmlName(new javax.xml.namespace.QName("", "_-BIC_-ZBMBM"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("_BIC_ZGZBM");
        elemField.setXmlName(new javax.xml.namespace.QName("", "_-BIC_-ZGZBM"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("SALESORG");
        elemField.setXmlName(new javax.xml.namespace.QName("", "SALESORG"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("CALDAY");
        elemField.setXmlName(new javax.xml.namespace.QName("", "CALDAY"));
        elemField.setXmlType(new javax.xml.namespace.QName("urn:sap-com:document:sap:rfc:functions", "date"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("_BIC_ZGSPY");
        elemField.setXmlName(new javax.xml.namespace.QName("", "_-BIC_-ZGSPY"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "decimal"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("_BIC_ZGSPQNY");
        elemField.setXmlName(new javax.xml.namespace.QName("", "_-BIC_-ZGSPQNY"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "decimal"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("_BIC_ZCWMLEY");
        elemField.setXmlName(new javax.xml.namespace.QName("", "_-BIC_-ZCWMLEY"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "decimal"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("_BIC_ZCWMLEQNY");
        elemField.setXmlName(new javax.xml.namespace.QName("", "_-BIC_-ZCWMLEQNY"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "decimal"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("_BIC_ZGSPN");
        elemField.setXmlName(new javax.xml.namespace.QName("", "_-BIC_-ZGSPN"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "decimal"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("_BIC_ZGSPQN");
        elemField.setXmlName(new javax.xml.namespace.QName("", "_-BIC_-ZGSPQN"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "decimal"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("DOC_CURRCY");
        elemField.setXmlName(new javax.xml.namespace.QName("", "DOC_CURRCY"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("_BIC_ZCWMLEN");
        elemField.setXmlName(new javax.xml.namespace.QName("", "_-BIC_-ZCWMLEN"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "decimal"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("_BIC_ZCWMLEQN");
        elemField.setXmlName(new javax.xml.namespace.QName("", "_-BIC_-ZCWMLEQN"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "decimal"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("RECORDMODE");
        elemField.setXmlName(new javax.xml.namespace.QName("", "RECORDMODE"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("_BIC_ZGSPT");
        elemField.setXmlName(new javax.xml.namespace.QName("", "_-BIC_-ZGSPT"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "decimal"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("_BIC_ZGSPQNT");
        elemField.setXmlName(new javax.xml.namespace.QName("", "_-BIC_-ZGSPQNT"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "decimal"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("_BIC_ZCWMLET");
        elemField.setXmlName(new javax.xml.namespace.QName("", "_-BIC_-ZCWMLET"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "decimal"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("_BIC_ZCWMLEQNT");
        elemField.setXmlName(new javax.xml.namespace.QName("", "_-BIC_-ZCWMLEQNT"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "decimal"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("_BIC_ZGSMC");
        elemField.setXmlName(new javax.xml.namespace.QName("", "_-BIC_-ZGSMC"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("_BIC_ZBMMC");
        elemField.setXmlName(new javax.xml.namespace.QName("", "_-BIC_-ZBMMC"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("_BIC_ZGZMC");
        elemField.setXmlName(new javax.xml.namespace.QName("", "_-BIC_-ZGZMC"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("_BIC_ZLAST_D");
        elemField.setXmlName(new javax.xml.namespace.QName("", "_-BIC_-ZLAST_D"));
        elemField.setXmlType(new javax.xml.namespace.QName("urn:sap-com:document:sap:rfc:functions", "date"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("_BIC_ZD_NAME");
        elemField.setXmlName(new javax.xml.namespace.QName("", "_-BIC_-ZD_NAME"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("_BIC_ZZB01");
        elemField.setXmlName(new javax.xml.namespace.QName("", "_-BIC_-ZZB01"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "decimal"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("_BIC_ZZB02");
        elemField.setXmlName(new javax.xml.namespace.QName("", "_-BIC_-ZZB02"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "decimal"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("_BIC_ZZB03");
        elemField.setXmlName(new javax.xml.namespace.QName("", "_-BIC_-ZZB03"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "decimal"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("_BIC_ZZB04");
        elemField.setXmlName(new javax.xml.namespace.QName("", "_-BIC_-ZZB04"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "decimal"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("_BIC_ZZB05");
        elemField.setXmlName(new javax.xml.namespace.QName("", "_-BIC_-ZZB05"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "decimal"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("_BIC_ZZB06");
        elemField.setXmlName(new javax.xml.namespace.QName("", "_-BIC_-ZZB06"));
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
