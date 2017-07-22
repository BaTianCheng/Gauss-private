/**
 * DT_POS014ITEMS.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package com.esb.jinying.sap.dealup.base.pos.ecc;

public class DT_POS014ITEMS  implements java.io.Serializable {
    /* POS费用单号 */
    private java.lang.String FYNO_POS;

    /* POS费用单行号 */
    private java.lang.String FYLN_POS;

    /* 合同号 */
    private java.lang.String CONTRACT_NO;

    /* 费用类型 */
    private java.lang.String ZFYTYPES;

    /* 费用扣除方式 */
    private java.lang.String ZFYMETHOD;

    /* 票前/票后 */
    private java.lang.String ZFYIF;

    /* 金额 */
    private java.lang.Double ZJINE;

    /* 部门 */
    private java.lang.String KOSTL;

    /* 申请日期 */
    private java.lang.String ZSQDATE;

    /* 门店 */
    private java.lang.String BUKRS;

    /* 费用申请人 */
    private java.lang.String ZSQNAME;

    /* 促销活动编号 */
    private java.lang.String ZXHDNO;

    /* 促销活动开始日期 */
    private java.lang.String ZXHDRQS;

    /* 促销活动结束日期 */
    private java.lang.String ZXHDRQE;

    /* 备注 */
    private java.lang.String ZZBEIZHU;

    public DT_POS014ITEMS() {
    }

    public DT_POS014ITEMS(
           java.lang.String FYNO_POS,
           java.lang.String FYLN_POS,
           java.lang.String CONTRACT_NO,
           java.lang.String ZFYTYPES,
           java.lang.String ZFYMETHOD,
           java.lang.String ZFYIF,
           java.lang.Double ZJINE,
           java.lang.String KOSTL,
           java.lang.String ZSQDATE,
           java.lang.String BUKRS,
           java.lang.String ZSQNAME,
           java.lang.String ZXHDNO,
           java.lang.String ZXHDRQS,
           java.lang.String ZXHDRQE,
           java.lang.String ZZBEIZHU) {
           this.FYNO_POS = FYNO_POS;
           this.FYLN_POS = FYLN_POS;
           this.CONTRACT_NO = CONTRACT_NO;
           this.ZFYTYPES = ZFYTYPES;
           this.ZFYMETHOD = ZFYMETHOD;
           this.ZFYIF = ZFYIF;
           this.ZJINE = ZJINE;
           this.KOSTL = KOSTL;
           this.ZSQDATE = ZSQDATE;
           this.BUKRS = BUKRS;
           this.ZSQNAME = ZSQNAME;
           this.ZXHDNO = ZXHDNO;
           this.ZXHDRQS = ZXHDRQS;
           this.ZXHDRQE = ZXHDRQE;
           this.ZZBEIZHU = ZZBEIZHU;
    }


    /**
     * Gets the FYNO_POS value for this DT_POS014ITEMS.
     * 
     * @return FYNO_POS   * POS费用单号
     */
    public java.lang.String getFYNO_POS() {
        return FYNO_POS;
    }


    /**
     * Sets the FYNO_POS value for this DT_POS014ITEMS.
     * 
     * @param FYNO_POS   * POS费用单号
     */
    public void setFYNO_POS(java.lang.String FYNO_POS) {
        this.FYNO_POS = FYNO_POS;
    }


    /**
     * Gets the FYLN_POS value for this DT_POS014ITEMS.
     * 
     * @return FYLN_POS   * POS费用单行号
     */
    public java.lang.String getFYLN_POS() {
        return FYLN_POS;
    }


    /**
     * Sets the FYLN_POS value for this DT_POS014ITEMS.
     * 
     * @param FYLN_POS   * POS费用单行号
     */
    public void setFYLN_POS(java.lang.String FYLN_POS) {
        this.FYLN_POS = FYLN_POS;
    }


    /**
     * Gets the CONTRACT_NO value for this DT_POS014ITEMS.
     * 
     * @return CONTRACT_NO   * 合同号
     */
    public java.lang.String getCONTRACT_NO() {
        return CONTRACT_NO;
    }


    /**
     * Sets the CONTRACT_NO value for this DT_POS014ITEMS.
     * 
     * @param CONTRACT_NO   * 合同号
     */
    public void setCONTRACT_NO(java.lang.String CONTRACT_NO) {
        this.CONTRACT_NO = CONTRACT_NO;
    }


    /**
     * Gets the ZFYTYPES value for this DT_POS014ITEMS.
     * 
     * @return ZFYTYPES   * 费用类型
     */
    public java.lang.String getZFYTYPES() {
        return ZFYTYPES;
    }


    /**
     * Sets the ZFYTYPES value for this DT_POS014ITEMS.
     * 
     * @param ZFYTYPES   * 费用类型
     */
    public void setZFYTYPES(java.lang.String ZFYTYPES) {
        this.ZFYTYPES = ZFYTYPES;
    }


    /**
     * Gets the ZFYMETHOD value for this DT_POS014ITEMS.
     * 
     * @return ZFYMETHOD   * 费用扣除方式
     */
    public java.lang.String getZFYMETHOD() {
        return ZFYMETHOD;
    }


    /**
     * Sets the ZFYMETHOD value for this DT_POS014ITEMS.
     * 
     * @param ZFYMETHOD   * 费用扣除方式
     */
    public void setZFYMETHOD(java.lang.String ZFYMETHOD) {
        this.ZFYMETHOD = ZFYMETHOD;
    }


    /**
     * Gets the ZFYIF value for this DT_POS014ITEMS.
     * 
     * @return ZFYIF   * 票前/票后
     */
    public java.lang.String getZFYIF() {
        return ZFYIF;
    }


    /**
     * Sets the ZFYIF value for this DT_POS014ITEMS.
     * 
     * @param ZFYIF   * 票前/票后
     */
    public void setZFYIF(java.lang.String ZFYIF) {
        this.ZFYIF = ZFYIF;
    }


    /**
     * Gets the ZJINE value for this DT_POS014ITEMS.
     * 
     * @return ZJINE   * 金额
     */
    public java.lang.Double getZJINE() {
        return ZJINE;
    }


    /**
     * Sets the ZJINE value for this DT_POS014ITEMS.
     * 
     * @param ZJINE   * 金额
     */
    public void setZJINE(java.lang.Double ZJINE) {
        this.ZJINE = ZJINE;
    }


    /**
     * Gets the KOSTL value for this DT_POS014ITEMS.
     * 
     * @return KOSTL   * 部门
     */
    public java.lang.String getKOSTL() {
        return KOSTL;
    }


    /**
     * Sets the KOSTL value for this DT_POS014ITEMS.
     * 
     * @param KOSTL   * 部门
     */
    public void setKOSTL(java.lang.String KOSTL) {
        this.KOSTL = KOSTL;
    }


    /**
     * Gets the ZSQDATE value for this DT_POS014ITEMS.
     * 
     * @return ZSQDATE   * 申请日期
     */
    public java.lang.String getZSQDATE() {
        return ZSQDATE;
    }


    /**
     * Sets the ZSQDATE value for this DT_POS014ITEMS.
     * 
     * @param ZSQDATE   * 申请日期
     */
    public void setZSQDATE(java.lang.String ZSQDATE) {
        this.ZSQDATE = ZSQDATE;
    }


    /**
     * Gets the BUKRS value for this DT_POS014ITEMS.
     * 
     * @return BUKRS   * 门店
     */
    public java.lang.String getBUKRS() {
        return BUKRS;
    }


    /**
     * Sets the BUKRS value for this DT_POS014ITEMS.
     * 
     * @param BUKRS   * 门店
     */
    public void setBUKRS(java.lang.String BUKRS) {
        this.BUKRS = BUKRS;
    }


    /**
     * Gets the ZSQNAME value for this DT_POS014ITEMS.
     * 
     * @return ZSQNAME   * 费用申请人
     */
    public java.lang.String getZSQNAME() {
        return ZSQNAME;
    }


    /**
     * Sets the ZSQNAME value for this DT_POS014ITEMS.
     * 
     * @param ZSQNAME   * 费用申请人
     */
    public void setZSQNAME(java.lang.String ZSQNAME) {
        this.ZSQNAME = ZSQNAME;
    }


    /**
     * Gets the ZXHDNO value for this DT_POS014ITEMS.
     * 
     * @return ZXHDNO   * 促销活动编号
     */
    public java.lang.String getZXHDNO() {
        return ZXHDNO;
    }


    /**
     * Sets the ZXHDNO value for this DT_POS014ITEMS.
     * 
     * @param ZXHDNO   * 促销活动编号
     */
    public void setZXHDNO(java.lang.String ZXHDNO) {
        this.ZXHDNO = ZXHDNO;
    }


    /**
     * Gets the ZXHDRQS value for this DT_POS014ITEMS.
     * 
     * @return ZXHDRQS   * 促销活动开始日期
     */
    public java.lang.String getZXHDRQS() {
        return ZXHDRQS;
    }


    /**
     * Sets the ZXHDRQS value for this DT_POS014ITEMS.
     * 
     * @param ZXHDRQS   * 促销活动开始日期
     */
    public void setZXHDRQS(java.lang.String ZXHDRQS) {
        this.ZXHDRQS = ZXHDRQS;
    }


    /**
     * Gets the ZXHDRQE value for this DT_POS014ITEMS.
     * 
     * @return ZXHDRQE   * 促销活动结束日期
     */
    public java.lang.String getZXHDRQE() {
        return ZXHDRQE;
    }


    /**
     * Sets the ZXHDRQE value for this DT_POS014ITEMS.
     * 
     * @param ZXHDRQE   * 促销活动结束日期
     */
    public void setZXHDRQE(java.lang.String ZXHDRQE) {
        this.ZXHDRQE = ZXHDRQE;
    }


    /**
     * Gets the ZZBEIZHU value for this DT_POS014ITEMS.
     * 
     * @return ZZBEIZHU   * 备注
     */
    public java.lang.String getZZBEIZHU() {
        return ZZBEIZHU;
    }


    /**
     * Sets the ZZBEIZHU value for this DT_POS014ITEMS.
     * 
     * @param ZZBEIZHU   * 备注
     */
    public void setZZBEIZHU(java.lang.String ZZBEIZHU) {
        this.ZZBEIZHU = ZZBEIZHU;
    }

    private java.lang.Object __equalsCalc = null;
    public synchronized boolean equals(java.lang.Object obj) {
        if (!(obj instanceof DT_POS014ITEMS)) return false;
        DT_POS014ITEMS other = (DT_POS014ITEMS) obj;
        if (obj == null) return false;
        if (this == obj) return true;
        if (__equalsCalc != null) {
            return (__equalsCalc == obj);
        }
        __equalsCalc = obj;
        boolean _equals;
        _equals = true && 
            ((this.FYNO_POS==null && other.getFYNO_POS()==null) || 
             (this.FYNO_POS!=null &&
              this.FYNO_POS.equals(other.getFYNO_POS()))) &&
            ((this.FYLN_POS==null && other.getFYLN_POS()==null) || 
             (this.FYLN_POS!=null &&
              this.FYLN_POS.equals(other.getFYLN_POS()))) &&
            ((this.CONTRACT_NO==null && other.getCONTRACT_NO()==null) || 
             (this.CONTRACT_NO!=null &&
              this.CONTRACT_NO.equals(other.getCONTRACT_NO()))) &&
            ((this.ZFYTYPES==null && other.getZFYTYPES()==null) || 
             (this.ZFYTYPES!=null &&
              this.ZFYTYPES.equals(other.getZFYTYPES()))) &&
            ((this.ZFYMETHOD==null && other.getZFYMETHOD()==null) || 
             (this.ZFYMETHOD!=null &&
              this.ZFYMETHOD.equals(other.getZFYMETHOD()))) &&
            ((this.ZFYIF==null && other.getZFYIF()==null) || 
             (this.ZFYIF!=null &&
              this.ZFYIF.equals(other.getZFYIF()))) &&
            ((this.ZJINE==null && other.getZJINE()==null) || 
             (this.ZJINE!=null &&
              this.ZJINE.equals(other.getZJINE()))) &&
            ((this.KOSTL==null && other.getKOSTL()==null) || 
             (this.KOSTL!=null &&
              this.KOSTL.equals(other.getKOSTL()))) &&
            ((this.ZSQDATE==null && other.getZSQDATE()==null) || 
             (this.ZSQDATE!=null &&
              this.ZSQDATE.equals(other.getZSQDATE()))) &&
            ((this.BUKRS==null && other.getBUKRS()==null) || 
             (this.BUKRS!=null &&
              this.BUKRS.equals(other.getBUKRS()))) &&
            ((this.ZSQNAME==null && other.getZSQNAME()==null) || 
             (this.ZSQNAME!=null &&
              this.ZSQNAME.equals(other.getZSQNAME()))) &&
            ((this.ZXHDNO==null && other.getZXHDNO()==null) || 
             (this.ZXHDNO!=null &&
              this.ZXHDNO.equals(other.getZXHDNO()))) &&
            ((this.ZXHDRQS==null && other.getZXHDRQS()==null) || 
             (this.ZXHDRQS!=null &&
              this.ZXHDRQS.equals(other.getZXHDRQS()))) &&
            ((this.ZXHDRQE==null && other.getZXHDRQE()==null) || 
             (this.ZXHDRQE!=null &&
              this.ZXHDRQE.equals(other.getZXHDRQE()))) &&
            ((this.ZZBEIZHU==null && other.getZZBEIZHU()==null) || 
             (this.ZZBEIZHU!=null &&
              this.ZZBEIZHU.equals(other.getZZBEIZHU())));
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
        if (getFYNO_POS() != null) {
            _hashCode += getFYNO_POS().hashCode();
        }
        if (getFYLN_POS() != null) {
            _hashCode += getFYLN_POS().hashCode();
        }
        if (getCONTRACT_NO() != null) {
            _hashCode += getCONTRACT_NO().hashCode();
        }
        if (getZFYTYPES() != null) {
            _hashCode += getZFYTYPES().hashCode();
        }
        if (getZFYMETHOD() != null) {
            _hashCode += getZFYMETHOD().hashCode();
        }
        if (getZFYIF() != null) {
            _hashCode += getZFYIF().hashCode();
        }
        if (getZJINE() != null) {
            _hashCode += getZJINE().hashCode();
        }
        if (getKOSTL() != null) {
            _hashCode += getKOSTL().hashCode();
        }
        if (getZSQDATE() != null) {
            _hashCode += getZSQDATE().hashCode();
        }
        if (getBUKRS() != null) {
            _hashCode += getBUKRS().hashCode();
        }
        if (getZSQNAME() != null) {
            _hashCode += getZSQNAME().hashCode();
        }
        if (getZXHDNO() != null) {
            _hashCode += getZXHDNO().hashCode();
        }
        if (getZXHDRQS() != null) {
            _hashCode += getZXHDRQS().hashCode();
        }
        if (getZXHDRQE() != null) {
            _hashCode += getZXHDRQE().hashCode();
        }
        if (getZZBEIZHU() != null) {
            _hashCode += getZZBEIZHU().hashCode();
        }
        __hashCodeCalc = false;
        return _hashCode;
    }

    // Type metadata
    private static org.apache.axis.description.TypeDesc typeDesc =
        new org.apache.axis.description.TypeDesc(DT_POS014ITEMS.class, true);

    static {
        typeDesc.setXmlType(new javax.xml.namespace.QName("urn:ecc:pos:base:dealup", ">DT_POS014>ITEMS"));
        org.apache.axis.description.ElementDesc elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("FYNO_POS");
        elemField.setXmlName(new javax.xml.namespace.QName("", "FYNO_POS"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("FYLN_POS");
        elemField.setXmlName(new javax.xml.namespace.QName("", "FYLN_POS"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("CONTRACT_NO");
        elemField.setXmlName(new javax.xml.namespace.QName("", "CONTRACT_NO"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("ZFYTYPES");
        elemField.setXmlName(new javax.xml.namespace.QName("", "ZFYTYPES"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("ZFYMETHOD");
        elemField.setXmlName(new javax.xml.namespace.QName("", "ZFYMETHOD"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("ZFYIF");
        elemField.setXmlName(new javax.xml.namespace.QName("", "ZFYIF"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
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
        elemField.setFieldName("KOSTL");
        elemField.setXmlName(new javax.xml.namespace.QName("", "KOSTL"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("ZSQDATE");
        elemField.setXmlName(new javax.xml.namespace.QName("", "ZSQDATE"));
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
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("ZSQNAME");
        elemField.setXmlName(new javax.xml.namespace.QName("", "ZSQNAME"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("ZXHDNO");
        elemField.setXmlName(new javax.xml.namespace.QName("", "ZXHDNO"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("ZXHDRQS");
        elemField.setXmlName(new javax.xml.namespace.QName("", "ZXHDRQS"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("ZXHDRQE");
        elemField.setXmlName(new javax.xml.namespace.QName("", "ZXHDRQE"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("ZZBEIZHU");
        elemField.setXmlName(new javax.xml.namespace.QName("", "ZZBEIZHU"));
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
