/**
 * DT_RSSearchRespReturn.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package com.esb.jinying.sap.mastdata.rvs.ecc;

public class DT_RSSearchRespReturn  implements java.io.Serializable {
    /* 公司代码 */
    private java.lang.String BUKRS;

    /* 商业实体编号 */
    private java.lang.String SWENR;

    /* 租赁对象编号 */
    private java.lang.String SMENR;

    /* 建筑物的编号 */
    private java.lang.String SGENR;

    /* 租赁对象名称 */
    private java.lang.String XMETXT;

    /* 租赁对象使用类型 */
    private java.lang.String SNUNR;

    /* 租赁空间的合并空间编号 */
    private java.lang.String PSNO;

    /* 分摊因素类型 */
    private java.lang.String MEAS;

    /* 日期: 分摊因素有效至 */
    private java.lang.String VALIDTO;

    /* 日期: 分摊因素有效从 */
    private java.lang.String VALIDFROM;

    /* 分摊因素金额: 可用 */
    private java.lang.String MEASVALUE;

    /* 计量单位 */
    private java.lang.String MEASUNIT;

    /* 保留字段1 */
    private java.lang.String ZFIELD1;

    /* 保留字段2 */
    private java.lang.String ZFIELD2;

    public DT_RSSearchRespReturn() {
    }

    public DT_RSSearchRespReturn(
           java.lang.String BUKRS,
           java.lang.String SWENR,
           java.lang.String SMENR,
           java.lang.String SGENR,
           java.lang.String XMETXT,
           java.lang.String SNUNR,
           java.lang.String PSNO,
           java.lang.String MEAS,
           java.lang.String VALIDTO,
           java.lang.String VALIDFROM,
           java.lang.String MEASVALUE,
           java.lang.String MEASUNIT,
           java.lang.String ZFIELD1,
           java.lang.String ZFIELD2) {
           this.BUKRS = BUKRS;
           this.SWENR = SWENR;
           this.SMENR = SMENR;
           this.SGENR = SGENR;
           this.XMETXT = XMETXT;
           this.SNUNR = SNUNR;
           this.PSNO = PSNO;
           this.MEAS = MEAS;
           this.VALIDTO = VALIDTO;
           this.VALIDFROM = VALIDFROM;
           this.MEASVALUE = MEASVALUE;
           this.MEASUNIT = MEASUNIT;
           this.ZFIELD1 = ZFIELD1;
           this.ZFIELD2 = ZFIELD2;
    }


    /**
     * Gets the BUKRS value for this DT_RSSearchRespReturn.
     * 
     * @return BUKRS   * 公司代码
     */
    public java.lang.String getBUKRS() {
        return BUKRS;
    }


    /**
     * Sets the BUKRS value for this DT_RSSearchRespReturn.
     * 
     * @param BUKRS   * 公司代码
     */
    public void setBUKRS(java.lang.String BUKRS) {
        this.BUKRS = BUKRS;
    }


    /**
     * Gets the SWENR value for this DT_RSSearchRespReturn.
     * 
     * @return SWENR   * 商业实体编号
     */
    public java.lang.String getSWENR() {
        return SWENR;
    }


    /**
     * Sets the SWENR value for this DT_RSSearchRespReturn.
     * 
     * @param SWENR   * 商业实体编号
     */
    public void setSWENR(java.lang.String SWENR) {
        this.SWENR = SWENR;
    }


    /**
     * Gets the SMENR value for this DT_RSSearchRespReturn.
     * 
     * @return SMENR   * 租赁对象编号
     */
    public java.lang.String getSMENR() {
        return SMENR;
    }


    /**
     * Sets the SMENR value for this DT_RSSearchRespReturn.
     * 
     * @param SMENR   * 租赁对象编号
     */
    public void setSMENR(java.lang.String SMENR) {
        this.SMENR = SMENR;
    }


    /**
     * Gets the SGENR value for this DT_RSSearchRespReturn.
     * 
     * @return SGENR   * 建筑物的编号
     */
    public java.lang.String getSGENR() {
        return SGENR;
    }


    /**
     * Sets the SGENR value for this DT_RSSearchRespReturn.
     * 
     * @param SGENR   * 建筑物的编号
     */
    public void setSGENR(java.lang.String SGENR) {
        this.SGENR = SGENR;
    }


    /**
     * Gets the XMETXT value for this DT_RSSearchRespReturn.
     * 
     * @return XMETXT   * 租赁对象名称
     */
    public java.lang.String getXMETXT() {
        return XMETXT;
    }


    /**
     * Sets the XMETXT value for this DT_RSSearchRespReturn.
     * 
     * @param XMETXT   * 租赁对象名称
     */
    public void setXMETXT(java.lang.String XMETXT) {
        this.XMETXT = XMETXT;
    }


    /**
     * Gets the SNUNR value for this DT_RSSearchRespReturn.
     * 
     * @return SNUNR   * 租赁对象使用类型
     */
    public java.lang.String getSNUNR() {
        return SNUNR;
    }


    /**
     * Sets the SNUNR value for this DT_RSSearchRespReturn.
     * 
     * @param SNUNR   * 租赁对象使用类型
     */
    public void setSNUNR(java.lang.String SNUNR) {
        this.SNUNR = SNUNR;
    }


    /**
     * Gets the PSNO value for this DT_RSSearchRespReturn.
     * 
     * @return PSNO   * 租赁空间的合并空间编号
     */
    public java.lang.String getPSNO() {
        return PSNO;
    }


    /**
     * Sets the PSNO value for this DT_RSSearchRespReturn.
     * 
     * @param PSNO   * 租赁空间的合并空间编号
     */
    public void setPSNO(java.lang.String PSNO) {
        this.PSNO = PSNO;
    }


    /**
     * Gets the MEAS value for this DT_RSSearchRespReturn.
     * 
     * @return MEAS   * 分摊因素类型
     */
    public java.lang.String getMEAS() {
        return MEAS;
    }


    /**
     * Sets the MEAS value for this DT_RSSearchRespReturn.
     * 
     * @param MEAS   * 分摊因素类型
     */
    public void setMEAS(java.lang.String MEAS) {
        this.MEAS = MEAS;
    }


    /**
     * Gets the VALIDTO value for this DT_RSSearchRespReturn.
     * 
     * @return VALIDTO   * 日期: 分摊因素有效至
     */
    public java.lang.String getVALIDTO() {
        return VALIDTO;
    }


    /**
     * Sets the VALIDTO value for this DT_RSSearchRespReturn.
     * 
     * @param VALIDTO   * 日期: 分摊因素有效至
     */
    public void setVALIDTO(java.lang.String VALIDTO) {
        this.VALIDTO = VALIDTO;
    }


    /**
     * Gets the VALIDFROM value for this DT_RSSearchRespReturn.
     * 
     * @return VALIDFROM   * 日期: 分摊因素有效从
     */
    public java.lang.String getVALIDFROM() {
        return VALIDFROM;
    }


    /**
     * Sets the VALIDFROM value for this DT_RSSearchRespReturn.
     * 
     * @param VALIDFROM   * 日期: 分摊因素有效从
     */
    public void setVALIDFROM(java.lang.String VALIDFROM) {
        this.VALIDFROM = VALIDFROM;
    }


    /**
     * Gets the MEASVALUE value for this DT_RSSearchRespReturn.
     * 
     * @return MEASVALUE   * 分摊因素金额: 可用
     */
    public java.lang.String getMEASVALUE() {
        return MEASVALUE;
    }


    /**
     * Sets the MEASVALUE value for this DT_RSSearchRespReturn.
     * 
     * @param MEASVALUE   * 分摊因素金额: 可用
     */
    public void setMEASVALUE(java.lang.String MEASVALUE) {
        this.MEASVALUE = MEASVALUE;
    }


    /**
     * Gets the MEASUNIT value for this DT_RSSearchRespReturn.
     * 
     * @return MEASUNIT   * 计量单位
     */
    public java.lang.String getMEASUNIT() {
        return MEASUNIT;
    }


    /**
     * Sets the MEASUNIT value for this DT_RSSearchRespReturn.
     * 
     * @param MEASUNIT   * 计量单位
     */
    public void setMEASUNIT(java.lang.String MEASUNIT) {
        this.MEASUNIT = MEASUNIT;
    }


    /**
     * Gets the ZFIELD1 value for this DT_RSSearchRespReturn.
     * 
     * @return ZFIELD1   * 保留字段1
     */
    public java.lang.String getZFIELD1() {
        return ZFIELD1;
    }


    /**
     * Sets the ZFIELD1 value for this DT_RSSearchRespReturn.
     * 
     * @param ZFIELD1   * 保留字段1
     */
    public void setZFIELD1(java.lang.String ZFIELD1) {
        this.ZFIELD1 = ZFIELD1;
    }


    /**
     * Gets the ZFIELD2 value for this DT_RSSearchRespReturn.
     * 
     * @return ZFIELD2   * 保留字段2
     */
    public java.lang.String getZFIELD2() {
        return ZFIELD2;
    }


    /**
     * Sets the ZFIELD2 value for this DT_RSSearchRespReturn.
     * 
     * @param ZFIELD2   * 保留字段2
     */
    public void setZFIELD2(java.lang.String ZFIELD2) {
        this.ZFIELD2 = ZFIELD2;
    }

    private java.lang.Object __equalsCalc = null;
    public synchronized boolean equals(java.lang.Object obj) {
        if (!(obj instanceof DT_RSSearchRespReturn)) return false;
        DT_RSSearchRespReturn other = (DT_RSSearchRespReturn) obj;
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
            ((this.SWENR==null && other.getSWENR()==null) || 
             (this.SWENR!=null &&
              this.SWENR.equals(other.getSWENR()))) &&
            ((this.SMENR==null && other.getSMENR()==null) || 
             (this.SMENR!=null &&
              this.SMENR.equals(other.getSMENR()))) &&
            ((this.SGENR==null && other.getSGENR()==null) || 
             (this.SGENR!=null &&
              this.SGENR.equals(other.getSGENR()))) &&
            ((this.XMETXT==null && other.getXMETXT()==null) || 
             (this.XMETXT!=null &&
              this.XMETXT.equals(other.getXMETXT()))) &&
            ((this.SNUNR==null && other.getSNUNR()==null) || 
             (this.SNUNR!=null &&
              this.SNUNR.equals(other.getSNUNR()))) &&
            ((this.PSNO==null && other.getPSNO()==null) || 
             (this.PSNO!=null &&
              this.PSNO.equals(other.getPSNO()))) &&
            ((this.MEAS==null && other.getMEAS()==null) || 
             (this.MEAS!=null &&
              this.MEAS.equals(other.getMEAS()))) &&
            ((this.VALIDTO==null && other.getVALIDTO()==null) || 
             (this.VALIDTO!=null &&
              this.VALIDTO.equals(other.getVALIDTO()))) &&
            ((this.VALIDFROM==null && other.getVALIDFROM()==null) || 
             (this.VALIDFROM!=null &&
              this.VALIDFROM.equals(other.getVALIDFROM()))) &&
            ((this.MEASVALUE==null && other.getMEASVALUE()==null) || 
             (this.MEASVALUE!=null &&
              this.MEASVALUE.equals(other.getMEASVALUE()))) &&
            ((this.MEASUNIT==null && other.getMEASUNIT()==null) || 
             (this.MEASUNIT!=null &&
              this.MEASUNIT.equals(other.getMEASUNIT()))) &&
            ((this.ZFIELD1==null && other.getZFIELD1()==null) || 
             (this.ZFIELD1!=null &&
              this.ZFIELD1.equals(other.getZFIELD1()))) &&
            ((this.ZFIELD2==null && other.getZFIELD2()==null) || 
             (this.ZFIELD2!=null &&
              this.ZFIELD2.equals(other.getZFIELD2())));
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
        if (getSWENR() != null) {
            _hashCode += getSWENR().hashCode();
        }
        if (getSMENR() != null) {
            _hashCode += getSMENR().hashCode();
        }
        if (getSGENR() != null) {
            _hashCode += getSGENR().hashCode();
        }
        if (getXMETXT() != null) {
            _hashCode += getXMETXT().hashCode();
        }
        if (getSNUNR() != null) {
            _hashCode += getSNUNR().hashCode();
        }
        if (getPSNO() != null) {
            _hashCode += getPSNO().hashCode();
        }
        if (getMEAS() != null) {
            _hashCode += getMEAS().hashCode();
        }
        if (getVALIDTO() != null) {
            _hashCode += getVALIDTO().hashCode();
        }
        if (getVALIDFROM() != null) {
            _hashCode += getVALIDFROM().hashCode();
        }
        if (getMEASVALUE() != null) {
            _hashCode += getMEASVALUE().hashCode();
        }
        if (getMEASUNIT() != null) {
            _hashCode += getMEASUNIT().hashCode();
        }
        if (getZFIELD1() != null) {
            _hashCode += getZFIELD1().hashCode();
        }
        if (getZFIELD2() != null) {
            _hashCode += getZFIELD2().hashCode();
        }
        __hashCodeCalc = false;
        return _hashCode;
    }

    // Type metadata
    private static org.apache.axis.description.TypeDesc typeDesc =
        new org.apache.axis.description.TypeDesc(DT_RSSearchRespReturn.class, true);

    static {
        typeDesc.setXmlType(new javax.xml.namespace.QName("urn:ecc:rvs:mastdata", ">DT_RSSearchResp>return"));
        org.apache.axis.description.ElementDesc elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("BUKRS");
        elemField.setXmlName(new javax.xml.namespace.QName("", "BUKRS"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("SWENR");
        elemField.setXmlName(new javax.xml.namespace.QName("", "SWENR"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("SMENR");
        elemField.setXmlName(new javax.xml.namespace.QName("", "SMENR"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("SGENR");
        elemField.setXmlName(new javax.xml.namespace.QName("", "SGENR"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("XMETXT");
        elemField.setXmlName(new javax.xml.namespace.QName("", "XMETXT"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("SNUNR");
        elemField.setXmlName(new javax.xml.namespace.QName("", "SNUNR"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("PSNO");
        elemField.setXmlName(new javax.xml.namespace.QName("", "PSNO"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("MEAS");
        elemField.setXmlName(new javax.xml.namespace.QName("", "MEAS"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("VALIDTO");
        elemField.setXmlName(new javax.xml.namespace.QName("", "VALIDTO"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("VALIDFROM");
        elemField.setXmlName(new javax.xml.namespace.QName("", "VALIDFROM"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("MEASVALUE");
        elemField.setXmlName(new javax.xml.namespace.QName("", "MEASVALUE"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("MEASUNIT");
        elemField.setXmlName(new javax.xml.namespace.QName("", "MEASUNIT"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("ZFIELD1");
        elemField.setXmlName(new javax.xml.namespace.QName("", "ZFIELD1"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("ZFIELD2");
        elemField.setXmlName(new javax.xml.namespace.QName("", "ZFIELD2"));
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
