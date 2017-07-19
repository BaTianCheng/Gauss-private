/**
 * DT_ContractSearchSub_OA.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package com.esb.jinying.sap.contract.rvs.ecc;

public class DT_ContractSearchSub_OA  implements java.io.Serializable {
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

    /* 业务范围 */
    private java.lang.String BUS_AREA;

    /* 利润中心 */
    private java.lang.String PROFIT_CTR;

    /* 地区税务代码 */
    private java.lang.String TAXJURCODE;

    /* 资金 */
    private java.lang.String FUND;

    /* 基金中心 */
    private java.lang.String FUNDS_CTR;

    /* 承诺项目 */
    private java.lang.String CMMT_ITEM;

    /* 功能范围 */
    private java.lang.String FUNC_AREA;

    /* 获益 */
    private java.lang.String GRANT_NBR;

    /* 基金管理程序 */
    private java.lang.String MEASURE;

    public DT_ContractSearchSub_OA() {
    }

    public DT_ContractSearchSub_OA(
           java.lang.String OBJECT_ID,
           java.lang.String TERM_NO,
           java.lang.String TERM_TEXT,
           java.lang.String VALID_FROM,
           java.lang.String VALID_TO,
           java.lang.String BUS_AREA,
           java.lang.String PROFIT_CTR,
           java.lang.String TAXJURCODE,
           java.lang.String FUND,
           java.lang.String FUNDS_CTR,
           java.lang.String CMMT_ITEM,
           java.lang.String FUNC_AREA,
           java.lang.String GRANT_NBR,
           java.lang.String MEASURE) {
           this.OBJECT_ID = OBJECT_ID;
           this.TERM_NO = TERM_NO;
           this.TERM_TEXT = TERM_TEXT;
           this.VALID_FROM = VALID_FROM;
           this.VALID_TO = VALID_TO;
           this.BUS_AREA = BUS_AREA;
           this.PROFIT_CTR = PROFIT_CTR;
           this.TAXJURCODE = TAXJURCODE;
           this.FUND = FUND;
           this.FUNDS_CTR = FUNDS_CTR;
           this.CMMT_ITEM = CMMT_ITEM;
           this.FUNC_AREA = FUNC_AREA;
           this.GRANT_NBR = GRANT_NBR;
           this.MEASURE = MEASURE;
    }


    /**
     * Gets the OBJECT_ID value for this DT_ContractSearchSub_OA.
     * 
     * @return OBJECT_ID   * 对象的标识
     */
    public java.lang.String getOBJECT_ID() {
        return OBJECT_ID;
    }


    /**
     * Sets the OBJECT_ID value for this DT_ContractSearchSub_OA.
     * 
     * @param OBJECT_ID   * 对象的标识
     */
    public void setOBJECT_ID(java.lang.String OBJECT_ID) {
        this.OBJECT_ID = OBJECT_ID;
    }


    /**
     * Gets the TERM_NO value for this DT_ContractSearchSub_OA.
     * 
     * @return TERM_NO   * 条款编号
     */
    public java.lang.String getTERM_NO() {
        return TERM_NO;
    }


    /**
     * Sets the TERM_NO value for this DT_ContractSearchSub_OA.
     * 
     * @param TERM_NO   * 条款编号
     */
    public void setTERM_NO(java.lang.String TERM_NO) {
        this.TERM_NO = TERM_NO;
    }


    /**
     * Gets the TERM_TEXT value for this DT_ContractSearchSub_OA.
     * 
     * @return TERM_TEXT   * 条款名称
     */
    public java.lang.String getTERM_TEXT() {
        return TERM_TEXT;
    }


    /**
     * Sets the TERM_TEXT value for this DT_ContractSearchSub_OA.
     * 
     * @param TERM_TEXT   * 条款名称
     */
    public void setTERM_TEXT(java.lang.String TERM_TEXT) {
        this.TERM_TEXT = TERM_TEXT;
    }


    /**
     * Gets the VALID_FROM value for this DT_ContractSearchSub_OA.
     * 
     * @return VALID_FROM   * 条款的生效日期
     */
    public java.lang.String getVALID_FROM() {
        return VALID_FROM;
    }


    /**
     * Sets the VALID_FROM value for this DT_ContractSearchSub_OA.
     * 
     * @param VALID_FROM   * 条款的生效日期
     */
    public void setVALID_FROM(java.lang.String VALID_FROM) {
        this.VALID_FROM = VALID_FROM;
    }


    /**
     * Gets the VALID_TO value for this DT_ContractSearchSub_OA.
     * 
     * @return VALID_TO   * 条款的有效终止日期
     */
    public java.lang.String getVALID_TO() {
        return VALID_TO;
    }


    /**
     * Sets the VALID_TO value for this DT_ContractSearchSub_OA.
     * 
     * @param VALID_TO   * 条款的有效终止日期
     */
    public void setVALID_TO(java.lang.String VALID_TO) {
        this.VALID_TO = VALID_TO;
    }


    /**
     * Gets the BUS_AREA value for this DT_ContractSearchSub_OA.
     * 
     * @return BUS_AREA   * 业务范围
     */
    public java.lang.String getBUS_AREA() {
        return BUS_AREA;
    }


    /**
     * Sets the BUS_AREA value for this DT_ContractSearchSub_OA.
     * 
     * @param BUS_AREA   * 业务范围
     */
    public void setBUS_AREA(java.lang.String BUS_AREA) {
        this.BUS_AREA = BUS_AREA;
    }


    /**
     * Gets the PROFIT_CTR value for this DT_ContractSearchSub_OA.
     * 
     * @return PROFIT_CTR   * 利润中心
     */
    public java.lang.String getPROFIT_CTR() {
        return PROFIT_CTR;
    }


    /**
     * Sets the PROFIT_CTR value for this DT_ContractSearchSub_OA.
     * 
     * @param PROFIT_CTR   * 利润中心
     */
    public void setPROFIT_CTR(java.lang.String PROFIT_CTR) {
        this.PROFIT_CTR = PROFIT_CTR;
    }


    /**
     * Gets the TAXJURCODE value for this DT_ContractSearchSub_OA.
     * 
     * @return TAXJURCODE   * 地区税务代码
     */
    public java.lang.String getTAXJURCODE() {
        return TAXJURCODE;
    }


    /**
     * Sets the TAXJURCODE value for this DT_ContractSearchSub_OA.
     * 
     * @param TAXJURCODE   * 地区税务代码
     */
    public void setTAXJURCODE(java.lang.String TAXJURCODE) {
        this.TAXJURCODE = TAXJURCODE;
    }


    /**
     * Gets the FUND value for this DT_ContractSearchSub_OA.
     * 
     * @return FUND   * 资金
     */
    public java.lang.String getFUND() {
        return FUND;
    }


    /**
     * Sets the FUND value for this DT_ContractSearchSub_OA.
     * 
     * @param FUND   * 资金
     */
    public void setFUND(java.lang.String FUND) {
        this.FUND = FUND;
    }


    /**
     * Gets the FUNDS_CTR value for this DT_ContractSearchSub_OA.
     * 
     * @return FUNDS_CTR   * 基金中心
     */
    public java.lang.String getFUNDS_CTR() {
        return FUNDS_CTR;
    }


    /**
     * Sets the FUNDS_CTR value for this DT_ContractSearchSub_OA.
     * 
     * @param FUNDS_CTR   * 基金中心
     */
    public void setFUNDS_CTR(java.lang.String FUNDS_CTR) {
        this.FUNDS_CTR = FUNDS_CTR;
    }


    /**
     * Gets the CMMT_ITEM value for this DT_ContractSearchSub_OA.
     * 
     * @return CMMT_ITEM   * 承诺项目
     */
    public java.lang.String getCMMT_ITEM() {
        return CMMT_ITEM;
    }


    /**
     * Sets the CMMT_ITEM value for this DT_ContractSearchSub_OA.
     * 
     * @param CMMT_ITEM   * 承诺项目
     */
    public void setCMMT_ITEM(java.lang.String CMMT_ITEM) {
        this.CMMT_ITEM = CMMT_ITEM;
    }


    /**
     * Gets the FUNC_AREA value for this DT_ContractSearchSub_OA.
     * 
     * @return FUNC_AREA   * 功能范围
     */
    public java.lang.String getFUNC_AREA() {
        return FUNC_AREA;
    }


    /**
     * Sets the FUNC_AREA value for this DT_ContractSearchSub_OA.
     * 
     * @param FUNC_AREA   * 功能范围
     */
    public void setFUNC_AREA(java.lang.String FUNC_AREA) {
        this.FUNC_AREA = FUNC_AREA;
    }


    /**
     * Gets the GRANT_NBR value for this DT_ContractSearchSub_OA.
     * 
     * @return GRANT_NBR   * 获益
     */
    public java.lang.String getGRANT_NBR() {
        return GRANT_NBR;
    }


    /**
     * Sets the GRANT_NBR value for this DT_ContractSearchSub_OA.
     * 
     * @param GRANT_NBR   * 获益
     */
    public void setGRANT_NBR(java.lang.String GRANT_NBR) {
        this.GRANT_NBR = GRANT_NBR;
    }


    /**
     * Gets the MEASURE value for this DT_ContractSearchSub_OA.
     * 
     * @return MEASURE   * 基金管理程序
     */
    public java.lang.String getMEASURE() {
        return MEASURE;
    }


    /**
     * Sets the MEASURE value for this DT_ContractSearchSub_OA.
     * 
     * @param MEASURE   * 基金管理程序
     */
    public void setMEASURE(java.lang.String MEASURE) {
        this.MEASURE = MEASURE;
    }

    private java.lang.Object __equalsCalc = null;
    public synchronized boolean equals(java.lang.Object obj) {
        if (!(obj instanceof DT_ContractSearchSub_OA)) return false;
        DT_ContractSearchSub_OA other = (DT_ContractSearchSub_OA) obj;
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
            ((this.BUS_AREA==null && other.getBUS_AREA()==null) || 
             (this.BUS_AREA!=null &&
              this.BUS_AREA.equals(other.getBUS_AREA()))) &&
            ((this.PROFIT_CTR==null && other.getPROFIT_CTR()==null) || 
             (this.PROFIT_CTR!=null &&
              this.PROFIT_CTR.equals(other.getPROFIT_CTR()))) &&
            ((this.TAXJURCODE==null && other.getTAXJURCODE()==null) || 
             (this.TAXJURCODE!=null &&
              this.TAXJURCODE.equals(other.getTAXJURCODE()))) &&
            ((this.FUND==null && other.getFUND()==null) || 
             (this.FUND!=null &&
              this.FUND.equals(other.getFUND()))) &&
            ((this.FUNDS_CTR==null && other.getFUNDS_CTR()==null) || 
             (this.FUNDS_CTR!=null &&
              this.FUNDS_CTR.equals(other.getFUNDS_CTR()))) &&
            ((this.CMMT_ITEM==null && other.getCMMT_ITEM()==null) || 
             (this.CMMT_ITEM!=null &&
              this.CMMT_ITEM.equals(other.getCMMT_ITEM()))) &&
            ((this.FUNC_AREA==null && other.getFUNC_AREA()==null) || 
             (this.FUNC_AREA!=null &&
              this.FUNC_AREA.equals(other.getFUNC_AREA()))) &&
            ((this.GRANT_NBR==null && other.getGRANT_NBR()==null) || 
             (this.GRANT_NBR!=null &&
              this.GRANT_NBR.equals(other.getGRANT_NBR()))) &&
            ((this.MEASURE==null && other.getMEASURE()==null) || 
             (this.MEASURE!=null &&
              this.MEASURE.equals(other.getMEASURE())));
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
        if (getBUS_AREA() != null) {
            _hashCode += getBUS_AREA().hashCode();
        }
        if (getPROFIT_CTR() != null) {
            _hashCode += getPROFIT_CTR().hashCode();
        }
        if (getTAXJURCODE() != null) {
            _hashCode += getTAXJURCODE().hashCode();
        }
        if (getFUND() != null) {
            _hashCode += getFUND().hashCode();
        }
        if (getFUNDS_CTR() != null) {
            _hashCode += getFUNDS_CTR().hashCode();
        }
        if (getCMMT_ITEM() != null) {
            _hashCode += getCMMT_ITEM().hashCode();
        }
        if (getFUNC_AREA() != null) {
            _hashCode += getFUNC_AREA().hashCode();
        }
        if (getGRANT_NBR() != null) {
            _hashCode += getGRANT_NBR().hashCode();
        }
        if (getMEASURE() != null) {
            _hashCode += getMEASURE().hashCode();
        }
        __hashCodeCalc = false;
        return _hashCode;
    }

    // Type metadata
    private static org.apache.axis.description.TypeDesc typeDesc =
        new org.apache.axis.description.TypeDesc(DT_ContractSearchSub_OA.class, true);

    static {
        typeDesc.setXmlType(new javax.xml.namespace.QName("urn:ecc:rvs:contract", "DT_ContractSearchSub_OA"));
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
        elemField.setFieldName("BUS_AREA");
        elemField.setXmlName(new javax.xml.namespace.QName("", "BUS_AREA"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("PROFIT_CTR");
        elemField.setXmlName(new javax.xml.namespace.QName("", "PROFIT_CTR"));
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
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("FUND");
        elemField.setXmlName(new javax.xml.namespace.QName("", "FUND"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("FUNDS_CTR");
        elemField.setXmlName(new javax.xml.namespace.QName("", "FUNDS_CTR"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("CMMT_ITEM");
        elemField.setXmlName(new javax.xml.namespace.QName("", "CMMT_ITEM"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("FUNC_AREA");
        elemField.setXmlName(new javax.xml.namespace.QName("", "FUNC_AREA"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("GRANT_NBR");
        elemField.setXmlName(new javax.xml.namespace.QName("", "GRANT_NBR"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("MEASURE");
        elemField.setXmlName(new javax.xml.namespace.QName("", "MEASURE"));
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
