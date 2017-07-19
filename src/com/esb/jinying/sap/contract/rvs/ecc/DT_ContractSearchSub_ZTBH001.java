/**
 * DT_ContractSearchSub_ZTBH001.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package com.esb.jinying.sap.contract.rvs.ecc;

public class DT_ContractSearchSub_ZTBH001  implements java.io.Serializable {
    /* 对象的标识 */
    private java.lang.String OBJECT_ID;

    /* 合同号码 */
    private java.lang.String CONTRACT_NO;

    /* 内部项目号 */
    private java.lang.String ZZNUM;

    /* 公司代码 */
    private java.lang.String BUKRS;

    /* 合同编号 */
    private java.lang.String RECNNR;

    /* 唯一流水号 */
    private java.lang.String GLIDE;

    /* 顺加率/倒扣率 */
    private java.lang.String DISC_PLUS_RATE;

    /* 中促折扣厂家承担率 */
    private java.lang.String SHOP_DISC_RATE;

    /* 厂促折扣厂家承担率 */
    private java.lang.String SUPPLY_DISC_RATE;

    /* VIP折扣厂家承担率 */
    private java.lang.String VIP_DISC_RATE;

    /* 开始日期 */
    private java.lang.String VALID_BEGIN_DATE;

    /* 终止日期 */
    private java.lang.String VALID_END_DATE;

    /* 可用标记(X表示可用，空表示不可用) */
    private java.lang.String VALID_FLAG;

    /* 备注 */
    private java.lang.String REMARK;

    /* 积分系数 */
    private java.lang.String INTEGRAL_QUOTIET;

    public DT_ContractSearchSub_ZTBH001() {
    }

    public DT_ContractSearchSub_ZTBH001(
           java.lang.String OBJECT_ID,
           java.lang.String CONTRACT_NO,
           java.lang.String ZZNUM,
           java.lang.String BUKRS,
           java.lang.String RECNNR,
           java.lang.String GLIDE,
           java.lang.String DISC_PLUS_RATE,
           java.lang.String SHOP_DISC_RATE,
           java.lang.String SUPPLY_DISC_RATE,
           java.lang.String VIP_DISC_RATE,
           java.lang.String VALID_BEGIN_DATE,
           java.lang.String VALID_END_DATE,
           java.lang.String VALID_FLAG,
           java.lang.String REMARK,
           java.lang.String INTEGRAL_QUOTIET) {
           this.OBJECT_ID = OBJECT_ID;
           this.CONTRACT_NO = CONTRACT_NO;
           this.ZZNUM = ZZNUM;
           this.BUKRS = BUKRS;
           this.RECNNR = RECNNR;
           this.GLIDE = GLIDE;
           this.DISC_PLUS_RATE = DISC_PLUS_RATE;
           this.SHOP_DISC_RATE = SHOP_DISC_RATE;
           this.SUPPLY_DISC_RATE = SUPPLY_DISC_RATE;
           this.VIP_DISC_RATE = VIP_DISC_RATE;
           this.VALID_BEGIN_DATE = VALID_BEGIN_DATE;
           this.VALID_END_DATE = VALID_END_DATE;
           this.VALID_FLAG = VALID_FLAG;
           this.REMARK = REMARK;
           this.INTEGRAL_QUOTIET = INTEGRAL_QUOTIET;
    }


    /**
     * Gets the OBJECT_ID value for this DT_ContractSearchSub_ZTBH001.
     * 
     * @return OBJECT_ID   * 对象的标识
     */
    public java.lang.String getOBJECT_ID() {
        return OBJECT_ID;
    }


    /**
     * Sets the OBJECT_ID value for this DT_ContractSearchSub_ZTBH001.
     * 
     * @param OBJECT_ID   * 对象的标识
     */
    public void setOBJECT_ID(java.lang.String OBJECT_ID) {
        this.OBJECT_ID = OBJECT_ID;
    }


    /**
     * Gets the CONTRACT_NO value for this DT_ContractSearchSub_ZTBH001.
     * 
     * @return CONTRACT_NO   * 合同号码
     */
    public java.lang.String getCONTRACT_NO() {
        return CONTRACT_NO;
    }


    /**
     * Sets the CONTRACT_NO value for this DT_ContractSearchSub_ZTBH001.
     * 
     * @param CONTRACT_NO   * 合同号码
     */
    public void setCONTRACT_NO(java.lang.String CONTRACT_NO) {
        this.CONTRACT_NO = CONTRACT_NO;
    }


    /**
     * Gets the ZZNUM value for this DT_ContractSearchSub_ZTBH001.
     * 
     * @return ZZNUM   * 内部项目号
     */
    public java.lang.String getZZNUM() {
        return ZZNUM;
    }


    /**
     * Sets the ZZNUM value for this DT_ContractSearchSub_ZTBH001.
     * 
     * @param ZZNUM   * 内部项目号
     */
    public void setZZNUM(java.lang.String ZZNUM) {
        this.ZZNUM = ZZNUM;
    }


    /**
     * Gets the BUKRS value for this DT_ContractSearchSub_ZTBH001.
     * 
     * @return BUKRS   * 公司代码
     */
    public java.lang.String getBUKRS() {
        return BUKRS;
    }


    /**
     * Sets the BUKRS value for this DT_ContractSearchSub_ZTBH001.
     * 
     * @param BUKRS   * 公司代码
     */
    public void setBUKRS(java.lang.String BUKRS) {
        this.BUKRS = BUKRS;
    }


    /**
     * Gets the RECNNR value for this DT_ContractSearchSub_ZTBH001.
     * 
     * @return RECNNR   * 合同编号
     */
    public java.lang.String getRECNNR() {
        return RECNNR;
    }


    /**
     * Sets the RECNNR value for this DT_ContractSearchSub_ZTBH001.
     * 
     * @param RECNNR   * 合同编号
     */
    public void setRECNNR(java.lang.String RECNNR) {
        this.RECNNR = RECNNR;
    }


    /**
     * Gets the GLIDE value for this DT_ContractSearchSub_ZTBH001.
     * 
     * @return GLIDE   * 唯一流水号
     */
    public java.lang.String getGLIDE() {
        return GLIDE;
    }


    /**
     * Sets the GLIDE value for this DT_ContractSearchSub_ZTBH001.
     * 
     * @param GLIDE   * 唯一流水号
     */
    public void setGLIDE(java.lang.String GLIDE) {
        this.GLIDE = GLIDE;
    }


    /**
     * Gets the DISC_PLUS_RATE value for this DT_ContractSearchSub_ZTBH001.
     * 
     * @return DISC_PLUS_RATE   * 顺加率/倒扣率
     */
    public java.lang.String getDISC_PLUS_RATE() {
        return DISC_PLUS_RATE;
    }


    /**
     * Sets the DISC_PLUS_RATE value for this DT_ContractSearchSub_ZTBH001.
     * 
     * @param DISC_PLUS_RATE   * 顺加率/倒扣率
     */
    public void setDISC_PLUS_RATE(java.lang.String DISC_PLUS_RATE) {
        this.DISC_PLUS_RATE = DISC_PLUS_RATE;
    }


    /**
     * Gets the SHOP_DISC_RATE value for this DT_ContractSearchSub_ZTBH001.
     * 
     * @return SHOP_DISC_RATE   * 中促折扣厂家承担率
     */
    public java.lang.String getSHOP_DISC_RATE() {
        return SHOP_DISC_RATE;
    }


    /**
     * Sets the SHOP_DISC_RATE value for this DT_ContractSearchSub_ZTBH001.
     * 
     * @param SHOP_DISC_RATE   * 中促折扣厂家承担率
     */
    public void setSHOP_DISC_RATE(java.lang.String SHOP_DISC_RATE) {
        this.SHOP_DISC_RATE = SHOP_DISC_RATE;
    }


    /**
     * Gets the SUPPLY_DISC_RATE value for this DT_ContractSearchSub_ZTBH001.
     * 
     * @return SUPPLY_DISC_RATE   * 厂促折扣厂家承担率
     */
    public java.lang.String getSUPPLY_DISC_RATE() {
        return SUPPLY_DISC_RATE;
    }


    /**
     * Sets the SUPPLY_DISC_RATE value for this DT_ContractSearchSub_ZTBH001.
     * 
     * @param SUPPLY_DISC_RATE   * 厂促折扣厂家承担率
     */
    public void setSUPPLY_DISC_RATE(java.lang.String SUPPLY_DISC_RATE) {
        this.SUPPLY_DISC_RATE = SUPPLY_DISC_RATE;
    }


    /**
     * Gets the VIP_DISC_RATE value for this DT_ContractSearchSub_ZTBH001.
     * 
     * @return VIP_DISC_RATE   * VIP折扣厂家承担率
     */
    public java.lang.String getVIP_DISC_RATE() {
        return VIP_DISC_RATE;
    }


    /**
     * Sets the VIP_DISC_RATE value for this DT_ContractSearchSub_ZTBH001.
     * 
     * @param VIP_DISC_RATE   * VIP折扣厂家承担率
     */
    public void setVIP_DISC_RATE(java.lang.String VIP_DISC_RATE) {
        this.VIP_DISC_RATE = VIP_DISC_RATE;
    }


    /**
     * Gets the VALID_BEGIN_DATE value for this DT_ContractSearchSub_ZTBH001.
     * 
     * @return VALID_BEGIN_DATE   * 开始日期
     */
    public java.lang.String getVALID_BEGIN_DATE() {
        return VALID_BEGIN_DATE;
    }


    /**
     * Sets the VALID_BEGIN_DATE value for this DT_ContractSearchSub_ZTBH001.
     * 
     * @param VALID_BEGIN_DATE   * 开始日期
     */
    public void setVALID_BEGIN_DATE(java.lang.String VALID_BEGIN_DATE) {
        this.VALID_BEGIN_DATE = VALID_BEGIN_DATE;
    }


    /**
     * Gets the VALID_END_DATE value for this DT_ContractSearchSub_ZTBH001.
     * 
     * @return VALID_END_DATE   * 终止日期
     */
    public java.lang.String getVALID_END_DATE() {
        return VALID_END_DATE;
    }


    /**
     * Sets the VALID_END_DATE value for this DT_ContractSearchSub_ZTBH001.
     * 
     * @param VALID_END_DATE   * 终止日期
     */
    public void setVALID_END_DATE(java.lang.String VALID_END_DATE) {
        this.VALID_END_DATE = VALID_END_DATE;
    }


    /**
     * Gets the VALID_FLAG value for this DT_ContractSearchSub_ZTBH001.
     * 
     * @return VALID_FLAG   * 可用标记(X表示可用，空表示不可用)
     */
    public java.lang.String getVALID_FLAG() {
        return VALID_FLAG;
    }


    /**
     * Sets the VALID_FLAG value for this DT_ContractSearchSub_ZTBH001.
     * 
     * @param VALID_FLAG   * 可用标记(X表示可用，空表示不可用)
     */
    public void setVALID_FLAG(java.lang.String VALID_FLAG) {
        this.VALID_FLAG = VALID_FLAG;
    }


    /**
     * Gets the REMARK value for this DT_ContractSearchSub_ZTBH001.
     * 
     * @return REMARK   * 备注
     */
    public java.lang.String getREMARK() {
        return REMARK;
    }


    /**
     * Sets the REMARK value for this DT_ContractSearchSub_ZTBH001.
     * 
     * @param REMARK   * 备注
     */
    public void setREMARK(java.lang.String REMARK) {
        this.REMARK = REMARK;
    }


    /**
     * Gets the INTEGRAL_QUOTIET value for this DT_ContractSearchSub_ZTBH001.
     * 
     * @return INTEGRAL_QUOTIET   * 积分系数
     */
    public java.lang.String getINTEGRAL_QUOTIET() {
        return INTEGRAL_QUOTIET;
    }


    /**
     * Sets the INTEGRAL_QUOTIET value for this DT_ContractSearchSub_ZTBH001.
     * 
     * @param INTEGRAL_QUOTIET   * 积分系数
     */
    public void setINTEGRAL_QUOTIET(java.lang.String INTEGRAL_QUOTIET) {
        this.INTEGRAL_QUOTIET = INTEGRAL_QUOTIET;
    }

    private java.lang.Object __equalsCalc = null;
    public synchronized boolean equals(java.lang.Object obj) {
        if (!(obj instanceof DT_ContractSearchSub_ZTBH001)) return false;
        DT_ContractSearchSub_ZTBH001 other = (DT_ContractSearchSub_ZTBH001) obj;
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
            ((this.CONTRACT_NO==null && other.getCONTRACT_NO()==null) || 
             (this.CONTRACT_NO!=null &&
              this.CONTRACT_NO.equals(other.getCONTRACT_NO()))) &&
            ((this.ZZNUM==null && other.getZZNUM()==null) || 
             (this.ZZNUM!=null &&
              this.ZZNUM.equals(other.getZZNUM()))) &&
            ((this.BUKRS==null && other.getBUKRS()==null) || 
             (this.BUKRS!=null &&
              this.BUKRS.equals(other.getBUKRS()))) &&
            ((this.RECNNR==null && other.getRECNNR()==null) || 
             (this.RECNNR!=null &&
              this.RECNNR.equals(other.getRECNNR()))) &&
            ((this.GLIDE==null && other.getGLIDE()==null) || 
             (this.GLIDE!=null &&
              this.GLIDE.equals(other.getGLIDE()))) &&
            ((this.DISC_PLUS_RATE==null && other.getDISC_PLUS_RATE()==null) || 
             (this.DISC_PLUS_RATE!=null &&
              this.DISC_PLUS_RATE.equals(other.getDISC_PLUS_RATE()))) &&
            ((this.SHOP_DISC_RATE==null && other.getSHOP_DISC_RATE()==null) || 
             (this.SHOP_DISC_RATE!=null &&
              this.SHOP_DISC_RATE.equals(other.getSHOP_DISC_RATE()))) &&
            ((this.SUPPLY_DISC_RATE==null && other.getSUPPLY_DISC_RATE()==null) || 
             (this.SUPPLY_DISC_RATE!=null &&
              this.SUPPLY_DISC_RATE.equals(other.getSUPPLY_DISC_RATE()))) &&
            ((this.VIP_DISC_RATE==null && other.getVIP_DISC_RATE()==null) || 
             (this.VIP_DISC_RATE!=null &&
              this.VIP_DISC_RATE.equals(other.getVIP_DISC_RATE()))) &&
            ((this.VALID_BEGIN_DATE==null && other.getVALID_BEGIN_DATE()==null) || 
             (this.VALID_BEGIN_DATE!=null &&
              this.VALID_BEGIN_DATE.equals(other.getVALID_BEGIN_DATE()))) &&
            ((this.VALID_END_DATE==null && other.getVALID_END_DATE()==null) || 
             (this.VALID_END_DATE!=null &&
              this.VALID_END_DATE.equals(other.getVALID_END_DATE()))) &&
            ((this.VALID_FLAG==null && other.getVALID_FLAG()==null) || 
             (this.VALID_FLAG!=null &&
              this.VALID_FLAG.equals(other.getVALID_FLAG()))) &&
            ((this.REMARK==null && other.getREMARK()==null) || 
             (this.REMARK!=null &&
              this.REMARK.equals(other.getREMARK()))) &&
            ((this.INTEGRAL_QUOTIET==null && other.getINTEGRAL_QUOTIET()==null) || 
             (this.INTEGRAL_QUOTIET!=null &&
              this.INTEGRAL_QUOTIET.equals(other.getINTEGRAL_QUOTIET())));
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
        if (getCONTRACT_NO() != null) {
            _hashCode += getCONTRACT_NO().hashCode();
        }
        if (getZZNUM() != null) {
            _hashCode += getZZNUM().hashCode();
        }
        if (getBUKRS() != null) {
            _hashCode += getBUKRS().hashCode();
        }
        if (getRECNNR() != null) {
            _hashCode += getRECNNR().hashCode();
        }
        if (getGLIDE() != null) {
            _hashCode += getGLIDE().hashCode();
        }
        if (getDISC_PLUS_RATE() != null) {
            _hashCode += getDISC_PLUS_RATE().hashCode();
        }
        if (getSHOP_DISC_RATE() != null) {
            _hashCode += getSHOP_DISC_RATE().hashCode();
        }
        if (getSUPPLY_DISC_RATE() != null) {
            _hashCode += getSUPPLY_DISC_RATE().hashCode();
        }
        if (getVIP_DISC_RATE() != null) {
            _hashCode += getVIP_DISC_RATE().hashCode();
        }
        if (getVALID_BEGIN_DATE() != null) {
            _hashCode += getVALID_BEGIN_DATE().hashCode();
        }
        if (getVALID_END_DATE() != null) {
            _hashCode += getVALID_END_DATE().hashCode();
        }
        if (getVALID_FLAG() != null) {
            _hashCode += getVALID_FLAG().hashCode();
        }
        if (getREMARK() != null) {
            _hashCode += getREMARK().hashCode();
        }
        if (getINTEGRAL_QUOTIET() != null) {
            _hashCode += getINTEGRAL_QUOTIET().hashCode();
        }
        __hashCodeCalc = false;
        return _hashCode;
    }

    // Type metadata
    private static org.apache.axis.description.TypeDesc typeDesc =
        new org.apache.axis.description.TypeDesc(DT_ContractSearchSub_ZTBH001.class, true);

    static {
        typeDesc.setXmlType(new javax.xml.namespace.QName("urn:ecc:rvs:contract", "DT_ContractSearchSub_ZTBH001"));
        org.apache.axis.description.ElementDesc elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("OBJECT_ID");
        elemField.setXmlName(new javax.xml.namespace.QName("", "OBJECT_ID"));
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
        elemField.setFieldName("ZZNUM");
        elemField.setXmlName(new javax.xml.namespace.QName("", "ZZNUM"));
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
        elemField.setFieldName("RECNNR");
        elemField.setXmlName(new javax.xml.namespace.QName("", "RECNNR"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("GLIDE");
        elemField.setXmlName(new javax.xml.namespace.QName("", "GLIDE"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("DISC_PLUS_RATE");
        elemField.setXmlName(new javax.xml.namespace.QName("", "DISC_PLUS_RATE"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("SHOP_DISC_RATE");
        elemField.setXmlName(new javax.xml.namespace.QName("", "SHOP_DISC_RATE"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("SUPPLY_DISC_RATE");
        elemField.setXmlName(new javax.xml.namespace.QName("", "SUPPLY_DISC_RATE"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("VIP_DISC_RATE");
        elemField.setXmlName(new javax.xml.namespace.QName("", "VIP_DISC_RATE"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("VALID_BEGIN_DATE");
        elemField.setXmlName(new javax.xml.namespace.QName("", "VALID_BEGIN_DATE"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("VALID_END_DATE");
        elemField.setXmlName(new javax.xml.namespace.QName("", "VALID_END_DATE"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("VALID_FLAG");
        elemField.setXmlName(new javax.xml.namespace.QName("", "VALID_FLAG"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("REMARK");
        elemField.setXmlName(new javax.xml.namespace.QName("", "REMARK"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("INTEGRAL_QUOTIET");
        elemField.setXmlName(new javax.xml.namespace.QName("", "INTEGRAL_QUOTIET"));
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
