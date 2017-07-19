/**
 * DT_ContractSearchMainPARTNER.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package com.esb.jinying.sap.contract.rvs.ecc;

public class DT_ContractSearchMainPARTNER  implements java.io.Serializable {
    /* 对象的业务对象类型 */
    private java.lang.String OBJECT_TYPE;

    /* 对象的标识 */
    private java.lang.String OBJECT_ID;

    /* 业务合作伙伴编号 */
    private java.lang.String PARTNER;

    /* 业务伙伴: 角色 */
    private java.lang.String ROLE_TYPE;

    /* 业务伙伴: 角色类型 */
    private java.lang.String ROLE_SUBTYPE;

    /* 关系起始日期 */
    private java.lang.String VALID_FROM;

    /* 关系结束的日期 */
    private java.lang.String VALID_TO;

    /* 地址类型 */
    private java.lang.String ADDRESS_TYPE;

    /* 财产的零股 */
    private java.lang.String PROP_FRACT_SHARE;

    /* 所有权分享 */
    private java.lang.String OWNERSHIP_SHARE;

    /* 共同所有权股份 */
    private java.lang.String CO_OWNERSHIP_SHARE;

    /* 财产零股的转换因素 */
    private java.lang.String CONV_FACTOR_FRACT_SHARE;

    /* 未清项目科目 */
    private java.lang.String OI_ACCOUNT;

    public DT_ContractSearchMainPARTNER() {
    }

    public DT_ContractSearchMainPARTNER(
           java.lang.String OBJECT_TYPE,
           java.lang.String OBJECT_ID,
           java.lang.String PARTNER,
           java.lang.String ROLE_TYPE,
           java.lang.String ROLE_SUBTYPE,
           java.lang.String VALID_FROM,
           java.lang.String VALID_TO,
           java.lang.String ADDRESS_TYPE,
           java.lang.String PROP_FRACT_SHARE,
           java.lang.String OWNERSHIP_SHARE,
           java.lang.String CO_OWNERSHIP_SHARE,
           java.lang.String CONV_FACTOR_FRACT_SHARE,
           java.lang.String OI_ACCOUNT) {
           this.OBJECT_TYPE = OBJECT_TYPE;
           this.OBJECT_ID = OBJECT_ID;
           this.PARTNER = PARTNER;
           this.ROLE_TYPE = ROLE_TYPE;
           this.ROLE_SUBTYPE = ROLE_SUBTYPE;
           this.VALID_FROM = VALID_FROM;
           this.VALID_TO = VALID_TO;
           this.ADDRESS_TYPE = ADDRESS_TYPE;
           this.PROP_FRACT_SHARE = PROP_FRACT_SHARE;
           this.OWNERSHIP_SHARE = OWNERSHIP_SHARE;
           this.CO_OWNERSHIP_SHARE = CO_OWNERSHIP_SHARE;
           this.CONV_FACTOR_FRACT_SHARE = CONV_FACTOR_FRACT_SHARE;
           this.OI_ACCOUNT = OI_ACCOUNT;
    }


    /**
     * Gets the OBJECT_TYPE value for this DT_ContractSearchMainPARTNER.
     * 
     * @return OBJECT_TYPE   * 对象的业务对象类型
     */
    public java.lang.String getOBJECT_TYPE() {
        return OBJECT_TYPE;
    }


    /**
     * Sets the OBJECT_TYPE value for this DT_ContractSearchMainPARTNER.
     * 
     * @param OBJECT_TYPE   * 对象的业务对象类型
     */
    public void setOBJECT_TYPE(java.lang.String OBJECT_TYPE) {
        this.OBJECT_TYPE = OBJECT_TYPE;
    }


    /**
     * Gets the OBJECT_ID value for this DT_ContractSearchMainPARTNER.
     * 
     * @return OBJECT_ID   * 对象的标识
     */
    public java.lang.String getOBJECT_ID() {
        return OBJECT_ID;
    }


    /**
     * Sets the OBJECT_ID value for this DT_ContractSearchMainPARTNER.
     * 
     * @param OBJECT_ID   * 对象的标识
     */
    public void setOBJECT_ID(java.lang.String OBJECT_ID) {
        this.OBJECT_ID = OBJECT_ID;
    }


    /**
     * Gets the PARTNER value for this DT_ContractSearchMainPARTNER.
     * 
     * @return PARTNER   * 业务合作伙伴编号
     */
    public java.lang.String getPARTNER() {
        return PARTNER;
    }


    /**
     * Sets the PARTNER value for this DT_ContractSearchMainPARTNER.
     * 
     * @param PARTNER   * 业务合作伙伴编号
     */
    public void setPARTNER(java.lang.String PARTNER) {
        this.PARTNER = PARTNER;
    }


    /**
     * Gets the ROLE_TYPE value for this DT_ContractSearchMainPARTNER.
     * 
     * @return ROLE_TYPE   * 业务伙伴: 角色
     */
    public java.lang.String getROLE_TYPE() {
        return ROLE_TYPE;
    }


    /**
     * Sets the ROLE_TYPE value for this DT_ContractSearchMainPARTNER.
     * 
     * @param ROLE_TYPE   * 业务伙伴: 角色
     */
    public void setROLE_TYPE(java.lang.String ROLE_TYPE) {
        this.ROLE_TYPE = ROLE_TYPE;
    }


    /**
     * Gets the ROLE_SUBTYPE value for this DT_ContractSearchMainPARTNER.
     * 
     * @return ROLE_SUBTYPE   * 业务伙伴: 角色类型
     */
    public java.lang.String getROLE_SUBTYPE() {
        return ROLE_SUBTYPE;
    }


    /**
     * Sets the ROLE_SUBTYPE value for this DT_ContractSearchMainPARTNER.
     * 
     * @param ROLE_SUBTYPE   * 业务伙伴: 角色类型
     */
    public void setROLE_SUBTYPE(java.lang.String ROLE_SUBTYPE) {
        this.ROLE_SUBTYPE = ROLE_SUBTYPE;
    }


    /**
     * Gets the VALID_FROM value for this DT_ContractSearchMainPARTNER.
     * 
     * @return VALID_FROM   * 关系起始日期
     */
    public java.lang.String getVALID_FROM() {
        return VALID_FROM;
    }


    /**
     * Sets the VALID_FROM value for this DT_ContractSearchMainPARTNER.
     * 
     * @param VALID_FROM   * 关系起始日期
     */
    public void setVALID_FROM(java.lang.String VALID_FROM) {
        this.VALID_FROM = VALID_FROM;
    }


    /**
     * Gets the VALID_TO value for this DT_ContractSearchMainPARTNER.
     * 
     * @return VALID_TO   * 关系结束的日期
     */
    public java.lang.String getVALID_TO() {
        return VALID_TO;
    }


    /**
     * Sets the VALID_TO value for this DT_ContractSearchMainPARTNER.
     * 
     * @param VALID_TO   * 关系结束的日期
     */
    public void setVALID_TO(java.lang.String VALID_TO) {
        this.VALID_TO = VALID_TO;
    }


    /**
     * Gets the ADDRESS_TYPE value for this DT_ContractSearchMainPARTNER.
     * 
     * @return ADDRESS_TYPE   * 地址类型
     */
    public java.lang.String getADDRESS_TYPE() {
        return ADDRESS_TYPE;
    }


    /**
     * Sets the ADDRESS_TYPE value for this DT_ContractSearchMainPARTNER.
     * 
     * @param ADDRESS_TYPE   * 地址类型
     */
    public void setADDRESS_TYPE(java.lang.String ADDRESS_TYPE) {
        this.ADDRESS_TYPE = ADDRESS_TYPE;
    }


    /**
     * Gets the PROP_FRACT_SHARE value for this DT_ContractSearchMainPARTNER.
     * 
     * @return PROP_FRACT_SHARE   * 财产的零股
     */
    public java.lang.String getPROP_FRACT_SHARE() {
        return PROP_FRACT_SHARE;
    }


    /**
     * Sets the PROP_FRACT_SHARE value for this DT_ContractSearchMainPARTNER.
     * 
     * @param PROP_FRACT_SHARE   * 财产的零股
     */
    public void setPROP_FRACT_SHARE(java.lang.String PROP_FRACT_SHARE) {
        this.PROP_FRACT_SHARE = PROP_FRACT_SHARE;
    }


    /**
     * Gets the OWNERSHIP_SHARE value for this DT_ContractSearchMainPARTNER.
     * 
     * @return OWNERSHIP_SHARE   * 所有权分享
     */
    public java.lang.String getOWNERSHIP_SHARE() {
        return OWNERSHIP_SHARE;
    }


    /**
     * Sets the OWNERSHIP_SHARE value for this DT_ContractSearchMainPARTNER.
     * 
     * @param OWNERSHIP_SHARE   * 所有权分享
     */
    public void setOWNERSHIP_SHARE(java.lang.String OWNERSHIP_SHARE) {
        this.OWNERSHIP_SHARE = OWNERSHIP_SHARE;
    }


    /**
     * Gets the CO_OWNERSHIP_SHARE value for this DT_ContractSearchMainPARTNER.
     * 
     * @return CO_OWNERSHIP_SHARE   * 共同所有权股份
     */
    public java.lang.String getCO_OWNERSHIP_SHARE() {
        return CO_OWNERSHIP_SHARE;
    }


    /**
     * Sets the CO_OWNERSHIP_SHARE value for this DT_ContractSearchMainPARTNER.
     * 
     * @param CO_OWNERSHIP_SHARE   * 共同所有权股份
     */
    public void setCO_OWNERSHIP_SHARE(java.lang.String CO_OWNERSHIP_SHARE) {
        this.CO_OWNERSHIP_SHARE = CO_OWNERSHIP_SHARE;
    }


    /**
     * Gets the CONV_FACTOR_FRACT_SHARE value for this DT_ContractSearchMainPARTNER.
     * 
     * @return CONV_FACTOR_FRACT_SHARE   * 财产零股的转换因素
     */
    public java.lang.String getCONV_FACTOR_FRACT_SHARE() {
        return CONV_FACTOR_FRACT_SHARE;
    }


    /**
     * Sets the CONV_FACTOR_FRACT_SHARE value for this DT_ContractSearchMainPARTNER.
     * 
     * @param CONV_FACTOR_FRACT_SHARE   * 财产零股的转换因素
     */
    public void setCONV_FACTOR_FRACT_SHARE(java.lang.String CONV_FACTOR_FRACT_SHARE) {
        this.CONV_FACTOR_FRACT_SHARE = CONV_FACTOR_FRACT_SHARE;
    }


    /**
     * Gets the OI_ACCOUNT value for this DT_ContractSearchMainPARTNER.
     * 
     * @return OI_ACCOUNT   * 未清项目科目
     */
    public java.lang.String getOI_ACCOUNT() {
        return OI_ACCOUNT;
    }


    /**
     * Sets the OI_ACCOUNT value for this DT_ContractSearchMainPARTNER.
     * 
     * @param OI_ACCOUNT   * 未清项目科目
     */
    public void setOI_ACCOUNT(java.lang.String OI_ACCOUNT) {
        this.OI_ACCOUNT = OI_ACCOUNT;
    }

    private java.lang.Object __equalsCalc = null;
    public synchronized boolean equals(java.lang.Object obj) {
        if (!(obj instanceof DT_ContractSearchMainPARTNER)) return false;
        DT_ContractSearchMainPARTNER other = (DT_ContractSearchMainPARTNER) obj;
        if (obj == null) return false;
        if (this == obj) return true;
        if (__equalsCalc != null) {
            return (__equalsCalc == obj);
        }
        __equalsCalc = obj;
        boolean _equals;
        _equals = true && 
            ((this.OBJECT_TYPE==null && other.getOBJECT_TYPE()==null) || 
             (this.OBJECT_TYPE!=null &&
              this.OBJECT_TYPE.equals(other.getOBJECT_TYPE()))) &&
            ((this.OBJECT_ID==null && other.getOBJECT_ID()==null) || 
             (this.OBJECT_ID!=null &&
              this.OBJECT_ID.equals(other.getOBJECT_ID()))) &&
            ((this.PARTNER==null && other.getPARTNER()==null) || 
             (this.PARTNER!=null &&
              this.PARTNER.equals(other.getPARTNER()))) &&
            ((this.ROLE_TYPE==null && other.getROLE_TYPE()==null) || 
             (this.ROLE_TYPE!=null &&
              this.ROLE_TYPE.equals(other.getROLE_TYPE()))) &&
            ((this.ROLE_SUBTYPE==null && other.getROLE_SUBTYPE()==null) || 
             (this.ROLE_SUBTYPE!=null &&
              this.ROLE_SUBTYPE.equals(other.getROLE_SUBTYPE()))) &&
            ((this.VALID_FROM==null && other.getVALID_FROM()==null) || 
             (this.VALID_FROM!=null &&
              this.VALID_FROM.equals(other.getVALID_FROM()))) &&
            ((this.VALID_TO==null && other.getVALID_TO()==null) || 
             (this.VALID_TO!=null &&
              this.VALID_TO.equals(other.getVALID_TO()))) &&
            ((this.ADDRESS_TYPE==null && other.getADDRESS_TYPE()==null) || 
             (this.ADDRESS_TYPE!=null &&
              this.ADDRESS_TYPE.equals(other.getADDRESS_TYPE()))) &&
            ((this.PROP_FRACT_SHARE==null && other.getPROP_FRACT_SHARE()==null) || 
             (this.PROP_FRACT_SHARE!=null &&
              this.PROP_FRACT_SHARE.equals(other.getPROP_FRACT_SHARE()))) &&
            ((this.OWNERSHIP_SHARE==null && other.getOWNERSHIP_SHARE()==null) || 
             (this.OWNERSHIP_SHARE!=null &&
              this.OWNERSHIP_SHARE.equals(other.getOWNERSHIP_SHARE()))) &&
            ((this.CO_OWNERSHIP_SHARE==null && other.getCO_OWNERSHIP_SHARE()==null) || 
             (this.CO_OWNERSHIP_SHARE!=null &&
              this.CO_OWNERSHIP_SHARE.equals(other.getCO_OWNERSHIP_SHARE()))) &&
            ((this.CONV_FACTOR_FRACT_SHARE==null && other.getCONV_FACTOR_FRACT_SHARE()==null) || 
             (this.CONV_FACTOR_FRACT_SHARE!=null &&
              this.CONV_FACTOR_FRACT_SHARE.equals(other.getCONV_FACTOR_FRACT_SHARE()))) &&
            ((this.OI_ACCOUNT==null && other.getOI_ACCOUNT()==null) || 
             (this.OI_ACCOUNT!=null &&
              this.OI_ACCOUNT.equals(other.getOI_ACCOUNT())));
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
        if (getOBJECT_TYPE() != null) {
            _hashCode += getOBJECT_TYPE().hashCode();
        }
        if (getOBJECT_ID() != null) {
            _hashCode += getOBJECT_ID().hashCode();
        }
        if (getPARTNER() != null) {
            _hashCode += getPARTNER().hashCode();
        }
        if (getROLE_TYPE() != null) {
            _hashCode += getROLE_TYPE().hashCode();
        }
        if (getROLE_SUBTYPE() != null) {
            _hashCode += getROLE_SUBTYPE().hashCode();
        }
        if (getVALID_FROM() != null) {
            _hashCode += getVALID_FROM().hashCode();
        }
        if (getVALID_TO() != null) {
            _hashCode += getVALID_TO().hashCode();
        }
        if (getADDRESS_TYPE() != null) {
            _hashCode += getADDRESS_TYPE().hashCode();
        }
        if (getPROP_FRACT_SHARE() != null) {
            _hashCode += getPROP_FRACT_SHARE().hashCode();
        }
        if (getOWNERSHIP_SHARE() != null) {
            _hashCode += getOWNERSHIP_SHARE().hashCode();
        }
        if (getCO_OWNERSHIP_SHARE() != null) {
            _hashCode += getCO_OWNERSHIP_SHARE().hashCode();
        }
        if (getCONV_FACTOR_FRACT_SHARE() != null) {
            _hashCode += getCONV_FACTOR_FRACT_SHARE().hashCode();
        }
        if (getOI_ACCOUNT() != null) {
            _hashCode += getOI_ACCOUNT().hashCode();
        }
        __hashCodeCalc = false;
        return _hashCode;
    }

    // Type metadata
    private static org.apache.axis.description.TypeDesc typeDesc =
        new org.apache.axis.description.TypeDesc(DT_ContractSearchMainPARTNER.class, true);

    static {
        typeDesc.setXmlType(new javax.xml.namespace.QName("urn:ecc:rvs:contract", ">DT_ContractSearchMain>PARTNER"));
        org.apache.axis.description.ElementDesc elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("OBJECT_TYPE");
        elemField.setXmlName(new javax.xml.namespace.QName("", "OBJECT_TYPE"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("OBJECT_ID");
        elemField.setXmlName(new javax.xml.namespace.QName("", "OBJECT_ID"));
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
        elemField.setFieldName("ROLE_TYPE");
        elemField.setXmlName(new javax.xml.namespace.QName("", "ROLE_TYPE"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("ROLE_SUBTYPE");
        elemField.setXmlName(new javax.xml.namespace.QName("", "ROLE_SUBTYPE"));
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
        elemField.setFieldName("ADDRESS_TYPE");
        elemField.setXmlName(new javax.xml.namespace.QName("", "ADDRESS_TYPE"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("PROP_FRACT_SHARE");
        elemField.setXmlName(new javax.xml.namespace.QName("", "PROP_FRACT_SHARE"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("OWNERSHIP_SHARE");
        elemField.setXmlName(new javax.xml.namespace.QName("", "OWNERSHIP_SHARE"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("CO_OWNERSHIP_SHARE");
        elemField.setXmlName(new javax.xml.namespace.QName("", "CO_OWNERSHIP_SHARE"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("CONV_FACTOR_FRACT_SHARE");
        elemField.setXmlName(new javax.xml.namespace.QName("", "CONV_FACTOR_FRACT_SHARE"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("OI_ACCOUNT");
        elemField.setXmlName(new javax.xml.namespace.QName("", "OI_ACCOUNT"));
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
