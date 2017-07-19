/**
 * DT_ContractSearchMain.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package com.esb.jinying.sap.contract.rvs.ecc;

public class DT_ContractSearchMain  implements java.io.Serializable {
    /* 合同编号 */
    private java.lang.String i_CONTRACTNUMBER;

    /* 公司代码 */
    private java.lang.String i_COMP_CODE_EXT;

    /* 合同类型 */
    private java.lang.String i_CONTRACT_TYPE;

    /* 合同订立日期 */
    private java.lang.String i_CONTRACT_START_DATE;

    /* 合同结束日期 */
    private java.lang.String i_FIRST_END_DATE;

    /* 错误信息 */
    private java.lang.String MESSAGE;

    private com.esb.jinying.sap.contract.rvs.ecc.DT_ContractSearchMainPARTNER[] PARTNER;

    private com.esb.jinying.sap.contract.rvs.ecc.DT_ContractSearchSub_OBJECT_REL[] OBJECT_REL;

    private com.esb.jinying.sap.contract.rvs.ecc.DT_ContractSearchSub_CONTRACT[] CONTRACT;

    private com.esb.jinying.sap.contract.rvs.ecc.DT_ContractSearchSub_ZTBH001[] ZTBH001;

    private com.esb.jinying.sap.contract.rvs.ecc.DT_ContractSearchSub_ZTBH002[] ZTBH002;

    private com.esb.jinying.sap.contract.rvs.ecc.DT_ContractSearchSub_OA[] OA;

    private com.esb.jinying.sap.contract.rvs.ecc.DT_ContractSearchSub_PY[] PY;

    private com.esb.jinying.sap.contract.rvs.ecc.DT_ContractSearchSub_RH[] RH;

    private com.esb.jinying.sap.contract.rvs.ecc.DT_ContractSearchSub_SR_REP[] SR_REP;

    private com.esb.jinying.sap.contract.rvs.ecc.DT_ContractSearchSub_SR_SL[] SR_SL;

    private com.esb.jinying.sap.contract.rvs.ecc.DT_ContractSearchSub_SR_RH[] SR_RH;

    private com.esb.jinying.sap.contract.rvs.ecc.DT_ContractSearchSub_CONDITION[] CONDITION;

    private com.esb.jinying.sap.contract.rvs.ecc.DT_ContractSearchSub_VICNCN[] VICNCN;

    public DT_ContractSearchMain() {
    }

    public DT_ContractSearchMain(
           java.lang.String i_CONTRACTNUMBER,
           java.lang.String i_COMP_CODE_EXT,
           java.lang.String i_CONTRACT_TYPE,
           java.lang.String i_CONTRACT_START_DATE,
           java.lang.String i_FIRST_END_DATE,
           java.lang.String MESSAGE,
           com.esb.jinying.sap.contract.rvs.ecc.DT_ContractSearchMainPARTNER[] PARTNER,
           com.esb.jinying.sap.contract.rvs.ecc.DT_ContractSearchSub_OBJECT_REL[] OBJECT_REL,
           com.esb.jinying.sap.contract.rvs.ecc.DT_ContractSearchSub_CONTRACT[] CONTRACT,
           com.esb.jinying.sap.contract.rvs.ecc.DT_ContractSearchSub_ZTBH001[] ZTBH001,
           com.esb.jinying.sap.contract.rvs.ecc.DT_ContractSearchSub_ZTBH002[] ZTBH002,
           com.esb.jinying.sap.contract.rvs.ecc.DT_ContractSearchSub_OA[] OA,
           com.esb.jinying.sap.contract.rvs.ecc.DT_ContractSearchSub_PY[] PY,
           com.esb.jinying.sap.contract.rvs.ecc.DT_ContractSearchSub_RH[] RH,
           com.esb.jinying.sap.contract.rvs.ecc.DT_ContractSearchSub_SR_REP[] SR_REP,
           com.esb.jinying.sap.contract.rvs.ecc.DT_ContractSearchSub_SR_SL[] SR_SL,
           com.esb.jinying.sap.contract.rvs.ecc.DT_ContractSearchSub_SR_RH[] SR_RH,
           com.esb.jinying.sap.contract.rvs.ecc.DT_ContractSearchSub_CONDITION[] CONDITION,
           com.esb.jinying.sap.contract.rvs.ecc.DT_ContractSearchSub_VICNCN[] VICNCN) {
           this.i_CONTRACTNUMBER = i_CONTRACTNUMBER;
           this.i_COMP_CODE_EXT = i_COMP_CODE_EXT;
           this.i_CONTRACT_TYPE = i_CONTRACT_TYPE;
           this.i_CONTRACT_START_DATE = i_CONTRACT_START_DATE;
           this.i_FIRST_END_DATE = i_FIRST_END_DATE;
           this.MESSAGE = MESSAGE;
           this.PARTNER = PARTNER;
           this.OBJECT_REL = OBJECT_REL;
           this.CONTRACT = CONTRACT;
           this.ZTBH001 = ZTBH001;
           this.ZTBH002 = ZTBH002;
           this.OA = OA;
           this.PY = PY;
           this.RH = RH;
           this.SR_REP = SR_REP;
           this.SR_SL = SR_SL;
           this.SR_RH = SR_RH;
           this.CONDITION = CONDITION;
           this.VICNCN = VICNCN;
    }


    /**
     * Gets the i_CONTRACTNUMBER value for this DT_ContractSearchMain.
     * 
     * @return i_CONTRACTNUMBER   * 合同编号
     */
    public java.lang.String getI_CONTRACTNUMBER() {
        return i_CONTRACTNUMBER;
    }


    /**
     * Sets the i_CONTRACTNUMBER value for this DT_ContractSearchMain.
     * 
     * @param i_CONTRACTNUMBER   * 合同编号
     */
    public void setI_CONTRACTNUMBER(java.lang.String i_CONTRACTNUMBER) {
        this.i_CONTRACTNUMBER = i_CONTRACTNUMBER;
    }


    /**
     * Gets the i_COMP_CODE_EXT value for this DT_ContractSearchMain.
     * 
     * @return i_COMP_CODE_EXT   * 公司代码
     */
    public java.lang.String getI_COMP_CODE_EXT() {
        return i_COMP_CODE_EXT;
    }


    /**
     * Sets the i_COMP_CODE_EXT value for this DT_ContractSearchMain.
     * 
     * @param i_COMP_CODE_EXT   * 公司代码
     */
    public void setI_COMP_CODE_EXT(java.lang.String i_COMP_CODE_EXT) {
        this.i_COMP_CODE_EXT = i_COMP_CODE_EXT;
    }


    /**
     * Gets the i_CONTRACT_TYPE value for this DT_ContractSearchMain.
     * 
     * @return i_CONTRACT_TYPE   * 合同类型
     */
    public java.lang.String getI_CONTRACT_TYPE() {
        return i_CONTRACT_TYPE;
    }


    /**
     * Sets the i_CONTRACT_TYPE value for this DT_ContractSearchMain.
     * 
     * @param i_CONTRACT_TYPE   * 合同类型
     */
    public void setI_CONTRACT_TYPE(java.lang.String i_CONTRACT_TYPE) {
        this.i_CONTRACT_TYPE = i_CONTRACT_TYPE;
    }


    /**
     * Gets the i_CONTRACT_START_DATE value for this DT_ContractSearchMain.
     * 
     * @return i_CONTRACT_START_DATE   * 合同订立日期
     */
    public java.lang.String getI_CONTRACT_START_DATE() {
        return i_CONTRACT_START_DATE;
    }


    /**
     * Sets the i_CONTRACT_START_DATE value for this DT_ContractSearchMain.
     * 
     * @param i_CONTRACT_START_DATE   * 合同订立日期
     */
    public void setI_CONTRACT_START_DATE(java.lang.String i_CONTRACT_START_DATE) {
        this.i_CONTRACT_START_DATE = i_CONTRACT_START_DATE;
    }


    /**
     * Gets the i_FIRST_END_DATE value for this DT_ContractSearchMain.
     * 
     * @return i_FIRST_END_DATE   * 合同结束日期
     */
    public java.lang.String getI_FIRST_END_DATE() {
        return i_FIRST_END_DATE;
    }


    /**
     * Sets the i_FIRST_END_DATE value for this DT_ContractSearchMain.
     * 
     * @param i_FIRST_END_DATE   * 合同结束日期
     */
    public void setI_FIRST_END_DATE(java.lang.String i_FIRST_END_DATE) {
        this.i_FIRST_END_DATE = i_FIRST_END_DATE;
    }


    /**
     * Gets the MESSAGE value for this DT_ContractSearchMain.
     * 
     * @return MESSAGE   * 错误信息
     */
    public java.lang.String getMESSAGE() {
        return MESSAGE;
    }


    /**
     * Sets the MESSAGE value for this DT_ContractSearchMain.
     * 
     * @param MESSAGE   * 错误信息
     */
    public void setMESSAGE(java.lang.String MESSAGE) {
        this.MESSAGE = MESSAGE;
    }


    /**
     * Gets the PARTNER value for this DT_ContractSearchMain.
     * 
     * @return PARTNER
     */
    public com.esb.jinying.sap.contract.rvs.ecc.DT_ContractSearchMainPARTNER[] getPARTNER() {
        return PARTNER;
    }


    /**
     * Sets the PARTNER value for this DT_ContractSearchMain.
     * 
     * @param PARTNER
     */
    public void setPARTNER(com.esb.jinying.sap.contract.rvs.ecc.DT_ContractSearchMainPARTNER[] PARTNER) {
        this.PARTNER = PARTNER;
    }

    public com.esb.jinying.sap.contract.rvs.ecc.DT_ContractSearchMainPARTNER getPARTNER(int i) {
        return this.PARTNER[i];
    }

    public void setPARTNER(int i, com.esb.jinying.sap.contract.rvs.ecc.DT_ContractSearchMainPARTNER _value) {
        this.PARTNER[i] = _value;
    }


    /**
     * Gets the OBJECT_REL value for this DT_ContractSearchMain.
     * 
     * @return OBJECT_REL
     */
    public com.esb.jinying.sap.contract.rvs.ecc.DT_ContractSearchSub_OBJECT_REL[] getOBJECT_REL() {
        return OBJECT_REL;
    }


    /**
     * Sets the OBJECT_REL value for this DT_ContractSearchMain.
     * 
     * @param OBJECT_REL
     */
    public void setOBJECT_REL(com.esb.jinying.sap.contract.rvs.ecc.DT_ContractSearchSub_OBJECT_REL[] OBJECT_REL) {
        this.OBJECT_REL = OBJECT_REL;
    }

    public com.esb.jinying.sap.contract.rvs.ecc.DT_ContractSearchSub_OBJECT_REL getOBJECT_REL(int i) {
        return this.OBJECT_REL[i];
    }

    public void setOBJECT_REL(int i, com.esb.jinying.sap.contract.rvs.ecc.DT_ContractSearchSub_OBJECT_REL _value) {
        this.OBJECT_REL[i] = _value;
    }


    /**
     * Gets the CONTRACT value for this DT_ContractSearchMain.
     * 
     * @return CONTRACT
     */
    public com.esb.jinying.sap.contract.rvs.ecc.DT_ContractSearchSub_CONTRACT[] getCONTRACT() {
        return CONTRACT;
    }


    /**
     * Sets the CONTRACT value for this DT_ContractSearchMain.
     * 
     * @param CONTRACT
     */
    public void setCONTRACT(com.esb.jinying.sap.contract.rvs.ecc.DT_ContractSearchSub_CONTRACT[] CONTRACT) {
        this.CONTRACT = CONTRACT;
    }

    public com.esb.jinying.sap.contract.rvs.ecc.DT_ContractSearchSub_CONTRACT getCONTRACT(int i) {
        return this.CONTRACT[i];
    }

    public void setCONTRACT(int i, com.esb.jinying.sap.contract.rvs.ecc.DT_ContractSearchSub_CONTRACT _value) {
        this.CONTRACT[i] = _value;
    }


    /**
     * Gets the ZTBH001 value for this DT_ContractSearchMain.
     * 
     * @return ZTBH001
     */
    public com.esb.jinying.sap.contract.rvs.ecc.DT_ContractSearchSub_ZTBH001[] getZTBH001() {
        return ZTBH001;
    }


    /**
     * Sets the ZTBH001 value for this DT_ContractSearchMain.
     * 
     * @param ZTBH001
     */
    public void setZTBH001(com.esb.jinying.sap.contract.rvs.ecc.DT_ContractSearchSub_ZTBH001[] ZTBH001) {
        this.ZTBH001 = ZTBH001;
    }

    public com.esb.jinying.sap.contract.rvs.ecc.DT_ContractSearchSub_ZTBH001 getZTBH001(int i) {
        return this.ZTBH001[i];
    }

    public void setZTBH001(int i, com.esb.jinying.sap.contract.rvs.ecc.DT_ContractSearchSub_ZTBH001 _value) {
        this.ZTBH001[i] = _value;
    }


    /**
     * Gets the ZTBH002 value for this DT_ContractSearchMain.
     * 
     * @return ZTBH002
     */
    public com.esb.jinying.sap.contract.rvs.ecc.DT_ContractSearchSub_ZTBH002[] getZTBH002() {
        return ZTBH002;
    }


    /**
     * Sets the ZTBH002 value for this DT_ContractSearchMain.
     * 
     * @param ZTBH002
     */
    public void setZTBH002(com.esb.jinying.sap.contract.rvs.ecc.DT_ContractSearchSub_ZTBH002[] ZTBH002) {
        this.ZTBH002 = ZTBH002;
    }

    public com.esb.jinying.sap.contract.rvs.ecc.DT_ContractSearchSub_ZTBH002 getZTBH002(int i) {
        return this.ZTBH002[i];
    }

    public void setZTBH002(int i, com.esb.jinying.sap.contract.rvs.ecc.DT_ContractSearchSub_ZTBH002 _value) {
        this.ZTBH002[i] = _value;
    }


    /**
     * Gets the OA value for this DT_ContractSearchMain.
     * 
     * @return OA
     */
    public com.esb.jinying.sap.contract.rvs.ecc.DT_ContractSearchSub_OA[] getOA() {
        return OA;
    }


    /**
     * Sets the OA value for this DT_ContractSearchMain.
     * 
     * @param OA
     */
    public void setOA(com.esb.jinying.sap.contract.rvs.ecc.DT_ContractSearchSub_OA[] OA) {
        this.OA = OA;
    }

    public com.esb.jinying.sap.contract.rvs.ecc.DT_ContractSearchSub_OA getOA(int i) {
        return this.OA[i];
    }

    public void setOA(int i, com.esb.jinying.sap.contract.rvs.ecc.DT_ContractSearchSub_OA _value) {
        this.OA[i] = _value;
    }


    /**
     * Gets the PY value for this DT_ContractSearchMain.
     * 
     * @return PY
     */
    public com.esb.jinying.sap.contract.rvs.ecc.DT_ContractSearchSub_PY[] getPY() {
        return PY;
    }


    /**
     * Sets the PY value for this DT_ContractSearchMain.
     * 
     * @param PY
     */
    public void setPY(com.esb.jinying.sap.contract.rvs.ecc.DT_ContractSearchSub_PY[] PY) {
        this.PY = PY;
    }

    public com.esb.jinying.sap.contract.rvs.ecc.DT_ContractSearchSub_PY getPY(int i) {
        return this.PY[i];
    }

    public void setPY(int i, com.esb.jinying.sap.contract.rvs.ecc.DT_ContractSearchSub_PY _value) {
        this.PY[i] = _value;
    }


    /**
     * Gets the RH value for this DT_ContractSearchMain.
     * 
     * @return RH
     */
    public com.esb.jinying.sap.contract.rvs.ecc.DT_ContractSearchSub_RH[] getRH() {
        return RH;
    }


    /**
     * Sets the RH value for this DT_ContractSearchMain.
     * 
     * @param RH
     */
    public void setRH(com.esb.jinying.sap.contract.rvs.ecc.DT_ContractSearchSub_RH[] RH) {
        this.RH = RH;
    }

    public com.esb.jinying.sap.contract.rvs.ecc.DT_ContractSearchSub_RH getRH(int i) {
        return this.RH[i];
    }

    public void setRH(int i, com.esb.jinying.sap.contract.rvs.ecc.DT_ContractSearchSub_RH _value) {
        this.RH[i] = _value;
    }


    /**
     * Gets the SR_REP value for this DT_ContractSearchMain.
     * 
     * @return SR_REP
     */
    public com.esb.jinying.sap.contract.rvs.ecc.DT_ContractSearchSub_SR_REP[] getSR_REP() {
        return SR_REP;
    }


    /**
     * Sets the SR_REP value for this DT_ContractSearchMain.
     * 
     * @param SR_REP
     */
    public void setSR_REP(com.esb.jinying.sap.contract.rvs.ecc.DT_ContractSearchSub_SR_REP[] SR_REP) {
        this.SR_REP = SR_REP;
    }

    public com.esb.jinying.sap.contract.rvs.ecc.DT_ContractSearchSub_SR_REP getSR_REP(int i) {
        return this.SR_REP[i];
    }

    public void setSR_REP(int i, com.esb.jinying.sap.contract.rvs.ecc.DT_ContractSearchSub_SR_REP _value) {
        this.SR_REP[i] = _value;
    }


    /**
     * Gets the SR_SL value for this DT_ContractSearchMain.
     * 
     * @return SR_SL
     */
    public com.esb.jinying.sap.contract.rvs.ecc.DT_ContractSearchSub_SR_SL[] getSR_SL() {
        return SR_SL;
    }


    /**
     * Sets the SR_SL value for this DT_ContractSearchMain.
     * 
     * @param SR_SL
     */
    public void setSR_SL(com.esb.jinying.sap.contract.rvs.ecc.DT_ContractSearchSub_SR_SL[] SR_SL) {
        this.SR_SL = SR_SL;
    }

    public com.esb.jinying.sap.contract.rvs.ecc.DT_ContractSearchSub_SR_SL getSR_SL(int i) {
        return this.SR_SL[i];
    }

    public void setSR_SL(int i, com.esb.jinying.sap.contract.rvs.ecc.DT_ContractSearchSub_SR_SL _value) {
        this.SR_SL[i] = _value;
    }


    /**
     * Gets the SR_RH value for this DT_ContractSearchMain.
     * 
     * @return SR_RH
     */
    public com.esb.jinying.sap.contract.rvs.ecc.DT_ContractSearchSub_SR_RH[] getSR_RH() {
        return SR_RH;
    }


    /**
     * Sets the SR_RH value for this DT_ContractSearchMain.
     * 
     * @param SR_RH
     */
    public void setSR_RH(com.esb.jinying.sap.contract.rvs.ecc.DT_ContractSearchSub_SR_RH[] SR_RH) {
        this.SR_RH = SR_RH;
    }

    public com.esb.jinying.sap.contract.rvs.ecc.DT_ContractSearchSub_SR_RH getSR_RH(int i) {
        return this.SR_RH[i];
    }

    public void setSR_RH(int i, com.esb.jinying.sap.contract.rvs.ecc.DT_ContractSearchSub_SR_RH _value) {
        this.SR_RH[i] = _value;
    }


    /**
     * Gets the CONDITION value for this DT_ContractSearchMain.
     * 
     * @return CONDITION
     */
    public com.esb.jinying.sap.contract.rvs.ecc.DT_ContractSearchSub_CONDITION[] getCONDITION() {
        return CONDITION;
    }


    /**
     * Sets the CONDITION value for this DT_ContractSearchMain.
     * 
     * @param CONDITION
     */
    public void setCONDITION(com.esb.jinying.sap.contract.rvs.ecc.DT_ContractSearchSub_CONDITION[] CONDITION) {
        this.CONDITION = CONDITION;
    }

    public com.esb.jinying.sap.contract.rvs.ecc.DT_ContractSearchSub_CONDITION getCONDITION(int i) {
        return this.CONDITION[i];
    }

    public void setCONDITION(int i, com.esb.jinying.sap.contract.rvs.ecc.DT_ContractSearchSub_CONDITION _value) {
        this.CONDITION[i] = _value;
    }


    /**
     * Gets the VICNCN value for this DT_ContractSearchMain.
     * 
     * @return VICNCN
     */
    public com.esb.jinying.sap.contract.rvs.ecc.DT_ContractSearchSub_VICNCN[] getVICNCN() {
        return VICNCN;
    }


    /**
     * Sets the VICNCN value for this DT_ContractSearchMain.
     * 
     * @param VICNCN
     */
    public void setVICNCN(com.esb.jinying.sap.contract.rvs.ecc.DT_ContractSearchSub_VICNCN[] VICNCN) {
        this.VICNCN = VICNCN;
    }

    public com.esb.jinying.sap.contract.rvs.ecc.DT_ContractSearchSub_VICNCN getVICNCN(int i) {
        return this.VICNCN[i];
    }

    public void setVICNCN(int i, com.esb.jinying.sap.contract.rvs.ecc.DT_ContractSearchSub_VICNCN _value) {
        this.VICNCN[i] = _value;
    }

    private java.lang.Object __equalsCalc = null;
    public synchronized boolean equals(java.lang.Object obj) {
        if (!(obj instanceof DT_ContractSearchMain)) return false;
        DT_ContractSearchMain other = (DT_ContractSearchMain) obj;
        if (obj == null) return false;
        if (this == obj) return true;
        if (__equalsCalc != null) {
            return (__equalsCalc == obj);
        }
        __equalsCalc = obj;
        boolean _equals;
        _equals = true && 
            ((this.i_CONTRACTNUMBER==null && other.getI_CONTRACTNUMBER()==null) || 
             (this.i_CONTRACTNUMBER!=null &&
              this.i_CONTRACTNUMBER.equals(other.getI_CONTRACTNUMBER()))) &&
            ((this.i_COMP_CODE_EXT==null && other.getI_COMP_CODE_EXT()==null) || 
             (this.i_COMP_CODE_EXT!=null &&
              this.i_COMP_CODE_EXT.equals(other.getI_COMP_CODE_EXT()))) &&
            ((this.i_CONTRACT_TYPE==null && other.getI_CONTRACT_TYPE()==null) || 
             (this.i_CONTRACT_TYPE!=null &&
              this.i_CONTRACT_TYPE.equals(other.getI_CONTRACT_TYPE()))) &&
            ((this.i_CONTRACT_START_DATE==null && other.getI_CONTRACT_START_DATE()==null) || 
             (this.i_CONTRACT_START_DATE!=null &&
              this.i_CONTRACT_START_DATE.equals(other.getI_CONTRACT_START_DATE()))) &&
            ((this.i_FIRST_END_DATE==null && other.getI_FIRST_END_DATE()==null) || 
             (this.i_FIRST_END_DATE!=null &&
              this.i_FIRST_END_DATE.equals(other.getI_FIRST_END_DATE()))) &&
            ((this.MESSAGE==null && other.getMESSAGE()==null) || 
             (this.MESSAGE!=null &&
              this.MESSAGE.equals(other.getMESSAGE()))) &&
            ((this.PARTNER==null && other.getPARTNER()==null) || 
             (this.PARTNER!=null &&
              java.util.Arrays.equals(this.PARTNER, other.getPARTNER()))) &&
            ((this.OBJECT_REL==null && other.getOBJECT_REL()==null) || 
             (this.OBJECT_REL!=null &&
              java.util.Arrays.equals(this.OBJECT_REL, other.getOBJECT_REL()))) &&
            ((this.CONTRACT==null && other.getCONTRACT()==null) || 
             (this.CONTRACT!=null &&
              java.util.Arrays.equals(this.CONTRACT, other.getCONTRACT()))) &&
            ((this.ZTBH001==null && other.getZTBH001()==null) || 
             (this.ZTBH001!=null &&
              java.util.Arrays.equals(this.ZTBH001, other.getZTBH001()))) &&
            ((this.ZTBH002==null && other.getZTBH002()==null) || 
             (this.ZTBH002!=null &&
              java.util.Arrays.equals(this.ZTBH002, other.getZTBH002()))) &&
            ((this.OA==null && other.getOA()==null) || 
             (this.OA!=null &&
              java.util.Arrays.equals(this.OA, other.getOA()))) &&
            ((this.PY==null && other.getPY()==null) || 
             (this.PY!=null &&
              java.util.Arrays.equals(this.PY, other.getPY()))) &&
            ((this.RH==null && other.getRH()==null) || 
             (this.RH!=null &&
              java.util.Arrays.equals(this.RH, other.getRH()))) &&
            ((this.SR_REP==null && other.getSR_REP()==null) || 
             (this.SR_REP!=null &&
              java.util.Arrays.equals(this.SR_REP, other.getSR_REP()))) &&
            ((this.SR_SL==null && other.getSR_SL()==null) || 
             (this.SR_SL!=null &&
              java.util.Arrays.equals(this.SR_SL, other.getSR_SL()))) &&
            ((this.SR_RH==null && other.getSR_RH()==null) || 
             (this.SR_RH!=null &&
              java.util.Arrays.equals(this.SR_RH, other.getSR_RH()))) &&
            ((this.CONDITION==null && other.getCONDITION()==null) || 
             (this.CONDITION!=null &&
              java.util.Arrays.equals(this.CONDITION, other.getCONDITION()))) &&
            ((this.VICNCN==null && other.getVICNCN()==null) || 
             (this.VICNCN!=null &&
              java.util.Arrays.equals(this.VICNCN, other.getVICNCN())));
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
        if (getI_CONTRACTNUMBER() != null) {
            _hashCode += getI_CONTRACTNUMBER().hashCode();
        }
        if (getI_COMP_CODE_EXT() != null) {
            _hashCode += getI_COMP_CODE_EXT().hashCode();
        }
        if (getI_CONTRACT_TYPE() != null) {
            _hashCode += getI_CONTRACT_TYPE().hashCode();
        }
        if (getI_CONTRACT_START_DATE() != null) {
            _hashCode += getI_CONTRACT_START_DATE().hashCode();
        }
        if (getI_FIRST_END_DATE() != null) {
            _hashCode += getI_FIRST_END_DATE().hashCode();
        }
        if (getMESSAGE() != null) {
            _hashCode += getMESSAGE().hashCode();
        }
        if (getPARTNER() != null) {
            for (int i=0;
                 i<java.lang.reflect.Array.getLength(getPARTNER());
                 i++) {
                java.lang.Object obj = java.lang.reflect.Array.get(getPARTNER(), i);
                if (obj != null &&
                    !obj.getClass().isArray()) {
                    _hashCode += obj.hashCode();
                }
            }
        }
        if (getOBJECT_REL() != null) {
            for (int i=0;
                 i<java.lang.reflect.Array.getLength(getOBJECT_REL());
                 i++) {
                java.lang.Object obj = java.lang.reflect.Array.get(getOBJECT_REL(), i);
                if (obj != null &&
                    !obj.getClass().isArray()) {
                    _hashCode += obj.hashCode();
                }
            }
        }
        if (getCONTRACT() != null) {
            for (int i=0;
                 i<java.lang.reflect.Array.getLength(getCONTRACT());
                 i++) {
                java.lang.Object obj = java.lang.reflect.Array.get(getCONTRACT(), i);
                if (obj != null &&
                    !obj.getClass().isArray()) {
                    _hashCode += obj.hashCode();
                }
            }
        }
        if (getZTBH001() != null) {
            for (int i=0;
                 i<java.lang.reflect.Array.getLength(getZTBH001());
                 i++) {
                java.lang.Object obj = java.lang.reflect.Array.get(getZTBH001(), i);
                if (obj != null &&
                    !obj.getClass().isArray()) {
                    _hashCode += obj.hashCode();
                }
            }
        }
        if (getZTBH002() != null) {
            for (int i=0;
                 i<java.lang.reflect.Array.getLength(getZTBH002());
                 i++) {
                java.lang.Object obj = java.lang.reflect.Array.get(getZTBH002(), i);
                if (obj != null &&
                    !obj.getClass().isArray()) {
                    _hashCode += obj.hashCode();
                }
            }
        }
        if (getOA() != null) {
            for (int i=0;
                 i<java.lang.reflect.Array.getLength(getOA());
                 i++) {
                java.lang.Object obj = java.lang.reflect.Array.get(getOA(), i);
                if (obj != null &&
                    !obj.getClass().isArray()) {
                    _hashCode += obj.hashCode();
                }
            }
        }
        if (getPY() != null) {
            for (int i=0;
                 i<java.lang.reflect.Array.getLength(getPY());
                 i++) {
                java.lang.Object obj = java.lang.reflect.Array.get(getPY(), i);
                if (obj != null &&
                    !obj.getClass().isArray()) {
                    _hashCode += obj.hashCode();
                }
            }
        }
        if (getRH() != null) {
            for (int i=0;
                 i<java.lang.reflect.Array.getLength(getRH());
                 i++) {
                java.lang.Object obj = java.lang.reflect.Array.get(getRH(), i);
                if (obj != null &&
                    !obj.getClass().isArray()) {
                    _hashCode += obj.hashCode();
                }
            }
        }
        if (getSR_REP() != null) {
            for (int i=0;
                 i<java.lang.reflect.Array.getLength(getSR_REP());
                 i++) {
                java.lang.Object obj = java.lang.reflect.Array.get(getSR_REP(), i);
                if (obj != null &&
                    !obj.getClass().isArray()) {
                    _hashCode += obj.hashCode();
                }
            }
        }
        if (getSR_SL() != null) {
            for (int i=0;
                 i<java.lang.reflect.Array.getLength(getSR_SL());
                 i++) {
                java.lang.Object obj = java.lang.reflect.Array.get(getSR_SL(), i);
                if (obj != null &&
                    !obj.getClass().isArray()) {
                    _hashCode += obj.hashCode();
                }
            }
        }
        if (getSR_RH() != null) {
            for (int i=0;
                 i<java.lang.reflect.Array.getLength(getSR_RH());
                 i++) {
                java.lang.Object obj = java.lang.reflect.Array.get(getSR_RH(), i);
                if (obj != null &&
                    !obj.getClass().isArray()) {
                    _hashCode += obj.hashCode();
                }
            }
        }
        if (getCONDITION() != null) {
            for (int i=0;
                 i<java.lang.reflect.Array.getLength(getCONDITION());
                 i++) {
                java.lang.Object obj = java.lang.reflect.Array.get(getCONDITION(), i);
                if (obj != null &&
                    !obj.getClass().isArray()) {
                    _hashCode += obj.hashCode();
                }
            }
        }
        if (getVICNCN() != null) {
            for (int i=0;
                 i<java.lang.reflect.Array.getLength(getVICNCN());
                 i++) {
                java.lang.Object obj = java.lang.reflect.Array.get(getVICNCN(), i);
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
        new org.apache.axis.description.TypeDesc(DT_ContractSearchMain.class, true);

    static {
        typeDesc.setXmlType(new javax.xml.namespace.QName("urn:ecc:rvs:contract", "DT_ContractSearchMain"));
        org.apache.axis.description.ElementDesc elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("i_CONTRACTNUMBER");
        elemField.setXmlName(new javax.xml.namespace.QName("", "I_CONTRACTNUMBER"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("i_COMP_CODE_EXT");
        elemField.setXmlName(new javax.xml.namespace.QName("", "I_COMP_CODE_EXT"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("i_CONTRACT_TYPE");
        elemField.setXmlName(new javax.xml.namespace.QName("", "I_CONTRACT_TYPE"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("i_CONTRACT_START_DATE");
        elemField.setXmlName(new javax.xml.namespace.QName("", "I_CONTRACT_START_DATE"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("i_FIRST_END_DATE");
        elemField.setXmlName(new javax.xml.namespace.QName("", "I_FIRST_END_DATE"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("MESSAGE");
        elemField.setXmlName(new javax.xml.namespace.QName("", "MESSAGE"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("PARTNER");
        elemField.setXmlName(new javax.xml.namespace.QName("", "PARTNER"));
        elemField.setXmlType(new javax.xml.namespace.QName("urn:ecc:rvs:contract", ">DT_ContractSearchMain>PARTNER"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        elemField.setMaxOccursUnbounded(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("OBJECT_REL");
        elemField.setXmlName(new javax.xml.namespace.QName("", "OBJECT_REL"));
        elemField.setXmlType(new javax.xml.namespace.QName("urn:ecc:rvs:contract", "DT_ContractSearchSub_OBJECT_REL"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        elemField.setMaxOccursUnbounded(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("CONTRACT");
        elemField.setXmlName(new javax.xml.namespace.QName("", "CONTRACT"));
        elemField.setXmlType(new javax.xml.namespace.QName("urn:ecc:rvs:contract", "DT_ContractSearchSub_CONTRACT"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        elemField.setMaxOccursUnbounded(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("ZTBH001");
        elemField.setXmlName(new javax.xml.namespace.QName("", "ZTBH001"));
        elemField.setXmlType(new javax.xml.namespace.QName("urn:ecc:rvs:contract", "DT_ContractSearchSub_ZTBH001"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        elemField.setMaxOccursUnbounded(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("ZTBH002");
        elemField.setXmlName(new javax.xml.namespace.QName("", "ZTBH002"));
        elemField.setXmlType(new javax.xml.namespace.QName("urn:ecc:rvs:contract", "DT_ContractSearchSub_ZTBH002"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        elemField.setMaxOccursUnbounded(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("OA");
        elemField.setXmlName(new javax.xml.namespace.QName("", "OA"));
        elemField.setXmlType(new javax.xml.namespace.QName("urn:ecc:rvs:contract", "DT_ContractSearchSub_OA"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        elemField.setMaxOccursUnbounded(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("PY");
        elemField.setXmlName(new javax.xml.namespace.QName("", "PY"));
        elemField.setXmlType(new javax.xml.namespace.QName("urn:ecc:rvs:contract", "DT_ContractSearchSub_PY"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        elemField.setMaxOccursUnbounded(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("RH");
        elemField.setXmlName(new javax.xml.namespace.QName("", "RH"));
        elemField.setXmlType(new javax.xml.namespace.QName("urn:ecc:rvs:contract", "DT_ContractSearchSub_RH"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        elemField.setMaxOccursUnbounded(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("SR_REP");
        elemField.setXmlName(new javax.xml.namespace.QName("", "SR_REP"));
        elemField.setXmlType(new javax.xml.namespace.QName("urn:ecc:rvs:contract", "DT_ContractSearchSub_SR_REP"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        elemField.setMaxOccursUnbounded(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("SR_SL");
        elemField.setXmlName(new javax.xml.namespace.QName("", "SR_SL"));
        elemField.setXmlType(new javax.xml.namespace.QName("urn:ecc:rvs:contract", "DT_ContractSearchSub_SR_SL"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        elemField.setMaxOccursUnbounded(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("SR_RH");
        elemField.setXmlName(new javax.xml.namespace.QName("", "SR_RH"));
        elemField.setXmlType(new javax.xml.namespace.QName("urn:ecc:rvs:contract", "DT_ContractSearchSub_SR_RH"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        elemField.setMaxOccursUnbounded(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("CONDITION");
        elemField.setXmlName(new javax.xml.namespace.QName("", "CONDITION"));
        elemField.setXmlType(new javax.xml.namespace.QName("urn:ecc:rvs:contract", "DT_ContractSearchSub_CONDITION"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        elemField.setMaxOccursUnbounded(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("VICNCN");
        elemField.setXmlName(new javax.xml.namespace.QName("", "VICNCN"));
        elemField.setXmlType(new javax.xml.namespace.QName("urn:ecc:rvs:contract", "DT_ContractSearchSub_VICNCN"));
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
