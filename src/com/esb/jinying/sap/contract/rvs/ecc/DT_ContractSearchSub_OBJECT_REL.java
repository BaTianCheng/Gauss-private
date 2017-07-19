/**
 * DT_ContractSearchSub_OBJECT_REL.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package com.esb.jinying.sap.contract.rvs.ecc;

public class DT_ContractSearchSub_OBJECT_REL  implements java.io.Serializable {
    /* 对象的业务对象类型 */
    private java.lang.String OBJECT_TYPE;

    /* 对象的标识 */
    private java.lang.String OBJECT_ID;

    /* 合同对象的业务对象类型 */
    private java.lang.String CONTRACT_OBJECT_TYPE;

    /* 合同对象的标识部分 */
    private java.lang.String CONTRACT_OBJECT_ID;

    /* 日期: 关系有效期从 */
    private java.lang.String VALID_FROM;

    /* 日期: 关系有效至 */
    private java.lang.String VALID_TO;

    /* 对象组的名称 */
    private java.lang.String OBJECT_GROUP_TEXT;

    /* 组编号 */
    private java.lang.String OBJECT_GROUP_NUMBER;

    /* 信息性分配 */
    private java.lang.String INFORMATIONAL_ASSIGNMENT;

    public DT_ContractSearchSub_OBJECT_REL() {
    }

    public DT_ContractSearchSub_OBJECT_REL(
           java.lang.String OBJECT_TYPE,
           java.lang.String OBJECT_ID,
           java.lang.String CONTRACT_OBJECT_TYPE,
           java.lang.String CONTRACT_OBJECT_ID,
           java.lang.String VALID_FROM,
           java.lang.String VALID_TO,
           java.lang.String OBJECT_GROUP_TEXT,
           java.lang.String OBJECT_GROUP_NUMBER,
           java.lang.String INFORMATIONAL_ASSIGNMENT) {
           this.OBJECT_TYPE = OBJECT_TYPE;
           this.OBJECT_ID = OBJECT_ID;
           this.CONTRACT_OBJECT_TYPE = CONTRACT_OBJECT_TYPE;
           this.CONTRACT_OBJECT_ID = CONTRACT_OBJECT_ID;
           this.VALID_FROM = VALID_FROM;
           this.VALID_TO = VALID_TO;
           this.OBJECT_GROUP_TEXT = OBJECT_GROUP_TEXT;
           this.OBJECT_GROUP_NUMBER = OBJECT_GROUP_NUMBER;
           this.INFORMATIONAL_ASSIGNMENT = INFORMATIONAL_ASSIGNMENT;
    }


    /**
     * Gets the OBJECT_TYPE value for this DT_ContractSearchSub_OBJECT_REL.
     * 
     * @return OBJECT_TYPE   * 对象的业务对象类型
     */
    public java.lang.String getOBJECT_TYPE() {
        return OBJECT_TYPE;
    }


    /**
     * Sets the OBJECT_TYPE value for this DT_ContractSearchSub_OBJECT_REL.
     * 
     * @param OBJECT_TYPE   * 对象的业务对象类型
     */
    public void setOBJECT_TYPE(java.lang.String OBJECT_TYPE) {
        this.OBJECT_TYPE = OBJECT_TYPE;
    }


    /**
     * Gets the OBJECT_ID value for this DT_ContractSearchSub_OBJECT_REL.
     * 
     * @return OBJECT_ID   * 对象的标识
     */
    public java.lang.String getOBJECT_ID() {
        return OBJECT_ID;
    }


    /**
     * Sets the OBJECT_ID value for this DT_ContractSearchSub_OBJECT_REL.
     * 
     * @param OBJECT_ID   * 对象的标识
     */
    public void setOBJECT_ID(java.lang.String OBJECT_ID) {
        this.OBJECT_ID = OBJECT_ID;
    }


    /**
     * Gets the CONTRACT_OBJECT_TYPE value for this DT_ContractSearchSub_OBJECT_REL.
     * 
     * @return CONTRACT_OBJECT_TYPE   * 合同对象的业务对象类型
     */
    public java.lang.String getCONTRACT_OBJECT_TYPE() {
        return CONTRACT_OBJECT_TYPE;
    }


    /**
     * Sets the CONTRACT_OBJECT_TYPE value for this DT_ContractSearchSub_OBJECT_REL.
     * 
     * @param CONTRACT_OBJECT_TYPE   * 合同对象的业务对象类型
     */
    public void setCONTRACT_OBJECT_TYPE(java.lang.String CONTRACT_OBJECT_TYPE) {
        this.CONTRACT_OBJECT_TYPE = CONTRACT_OBJECT_TYPE;
    }


    /**
     * Gets the CONTRACT_OBJECT_ID value for this DT_ContractSearchSub_OBJECT_REL.
     * 
     * @return CONTRACT_OBJECT_ID   * 合同对象的标识部分
     */
    public java.lang.String getCONTRACT_OBJECT_ID() {
        return CONTRACT_OBJECT_ID;
    }


    /**
     * Sets the CONTRACT_OBJECT_ID value for this DT_ContractSearchSub_OBJECT_REL.
     * 
     * @param CONTRACT_OBJECT_ID   * 合同对象的标识部分
     */
    public void setCONTRACT_OBJECT_ID(java.lang.String CONTRACT_OBJECT_ID) {
        this.CONTRACT_OBJECT_ID = CONTRACT_OBJECT_ID;
    }


    /**
     * Gets the VALID_FROM value for this DT_ContractSearchSub_OBJECT_REL.
     * 
     * @return VALID_FROM   * 日期: 关系有效期从
     */
    public java.lang.String getVALID_FROM() {
        return VALID_FROM;
    }


    /**
     * Sets the VALID_FROM value for this DT_ContractSearchSub_OBJECT_REL.
     * 
     * @param VALID_FROM   * 日期: 关系有效期从
     */
    public void setVALID_FROM(java.lang.String VALID_FROM) {
        this.VALID_FROM = VALID_FROM;
    }


    /**
     * Gets the VALID_TO value for this DT_ContractSearchSub_OBJECT_REL.
     * 
     * @return VALID_TO   * 日期: 关系有效至
     */
    public java.lang.String getVALID_TO() {
        return VALID_TO;
    }


    /**
     * Sets the VALID_TO value for this DT_ContractSearchSub_OBJECT_REL.
     * 
     * @param VALID_TO   * 日期: 关系有效至
     */
    public void setVALID_TO(java.lang.String VALID_TO) {
        this.VALID_TO = VALID_TO;
    }


    /**
     * Gets the OBJECT_GROUP_TEXT value for this DT_ContractSearchSub_OBJECT_REL.
     * 
     * @return OBJECT_GROUP_TEXT   * 对象组的名称
     */
    public java.lang.String getOBJECT_GROUP_TEXT() {
        return OBJECT_GROUP_TEXT;
    }


    /**
     * Sets the OBJECT_GROUP_TEXT value for this DT_ContractSearchSub_OBJECT_REL.
     * 
     * @param OBJECT_GROUP_TEXT   * 对象组的名称
     */
    public void setOBJECT_GROUP_TEXT(java.lang.String OBJECT_GROUP_TEXT) {
        this.OBJECT_GROUP_TEXT = OBJECT_GROUP_TEXT;
    }


    /**
     * Gets the OBJECT_GROUP_NUMBER value for this DT_ContractSearchSub_OBJECT_REL.
     * 
     * @return OBJECT_GROUP_NUMBER   * 组编号
     */
    public java.lang.String getOBJECT_GROUP_NUMBER() {
        return OBJECT_GROUP_NUMBER;
    }


    /**
     * Sets the OBJECT_GROUP_NUMBER value for this DT_ContractSearchSub_OBJECT_REL.
     * 
     * @param OBJECT_GROUP_NUMBER   * 组编号
     */
    public void setOBJECT_GROUP_NUMBER(java.lang.String OBJECT_GROUP_NUMBER) {
        this.OBJECT_GROUP_NUMBER = OBJECT_GROUP_NUMBER;
    }


    /**
     * Gets the INFORMATIONAL_ASSIGNMENT value for this DT_ContractSearchSub_OBJECT_REL.
     * 
     * @return INFORMATIONAL_ASSIGNMENT   * 信息性分配
     */
    public java.lang.String getINFORMATIONAL_ASSIGNMENT() {
        return INFORMATIONAL_ASSIGNMENT;
    }


    /**
     * Sets the INFORMATIONAL_ASSIGNMENT value for this DT_ContractSearchSub_OBJECT_REL.
     * 
     * @param INFORMATIONAL_ASSIGNMENT   * 信息性分配
     */
    public void setINFORMATIONAL_ASSIGNMENT(java.lang.String INFORMATIONAL_ASSIGNMENT) {
        this.INFORMATIONAL_ASSIGNMENT = INFORMATIONAL_ASSIGNMENT;
    }

    private java.lang.Object __equalsCalc = null;
    public synchronized boolean equals(java.lang.Object obj) {
        if (!(obj instanceof DT_ContractSearchSub_OBJECT_REL)) return false;
        DT_ContractSearchSub_OBJECT_REL other = (DT_ContractSearchSub_OBJECT_REL) obj;
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
            ((this.CONTRACT_OBJECT_TYPE==null && other.getCONTRACT_OBJECT_TYPE()==null) || 
             (this.CONTRACT_OBJECT_TYPE!=null &&
              this.CONTRACT_OBJECT_TYPE.equals(other.getCONTRACT_OBJECT_TYPE()))) &&
            ((this.CONTRACT_OBJECT_ID==null && other.getCONTRACT_OBJECT_ID()==null) || 
             (this.CONTRACT_OBJECT_ID!=null &&
              this.CONTRACT_OBJECT_ID.equals(other.getCONTRACT_OBJECT_ID()))) &&
            ((this.VALID_FROM==null && other.getVALID_FROM()==null) || 
             (this.VALID_FROM!=null &&
              this.VALID_FROM.equals(other.getVALID_FROM()))) &&
            ((this.VALID_TO==null && other.getVALID_TO()==null) || 
             (this.VALID_TO!=null &&
              this.VALID_TO.equals(other.getVALID_TO()))) &&
            ((this.OBJECT_GROUP_TEXT==null && other.getOBJECT_GROUP_TEXT()==null) || 
             (this.OBJECT_GROUP_TEXT!=null &&
              this.OBJECT_GROUP_TEXT.equals(other.getOBJECT_GROUP_TEXT()))) &&
            ((this.OBJECT_GROUP_NUMBER==null && other.getOBJECT_GROUP_NUMBER()==null) || 
             (this.OBJECT_GROUP_NUMBER!=null &&
              this.OBJECT_GROUP_NUMBER.equals(other.getOBJECT_GROUP_NUMBER()))) &&
            ((this.INFORMATIONAL_ASSIGNMENT==null && other.getINFORMATIONAL_ASSIGNMENT()==null) || 
             (this.INFORMATIONAL_ASSIGNMENT!=null &&
              this.INFORMATIONAL_ASSIGNMENT.equals(other.getINFORMATIONAL_ASSIGNMENT())));
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
        if (getCONTRACT_OBJECT_TYPE() != null) {
            _hashCode += getCONTRACT_OBJECT_TYPE().hashCode();
        }
        if (getCONTRACT_OBJECT_ID() != null) {
            _hashCode += getCONTRACT_OBJECT_ID().hashCode();
        }
        if (getVALID_FROM() != null) {
            _hashCode += getVALID_FROM().hashCode();
        }
        if (getVALID_TO() != null) {
            _hashCode += getVALID_TO().hashCode();
        }
        if (getOBJECT_GROUP_TEXT() != null) {
            _hashCode += getOBJECT_GROUP_TEXT().hashCode();
        }
        if (getOBJECT_GROUP_NUMBER() != null) {
            _hashCode += getOBJECT_GROUP_NUMBER().hashCode();
        }
        if (getINFORMATIONAL_ASSIGNMENT() != null) {
            _hashCode += getINFORMATIONAL_ASSIGNMENT().hashCode();
        }
        __hashCodeCalc = false;
        return _hashCode;
    }

    // Type metadata
    private static org.apache.axis.description.TypeDesc typeDesc =
        new org.apache.axis.description.TypeDesc(DT_ContractSearchSub_OBJECT_REL.class, true);

    static {
        typeDesc.setXmlType(new javax.xml.namespace.QName("urn:ecc:rvs:contract", "DT_ContractSearchSub_OBJECT_REL"));
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
        elemField.setFieldName("CONTRACT_OBJECT_TYPE");
        elemField.setXmlName(new javax.xml.namespace.QName("", "CONTRACT_OBJECT_TYPE"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("CONTRACT_OBJECT_ID");
        elemField.setXmlName(new javax.xml.namespace.QName("", "CONTRACT_OBJECT_ID"));
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
        elemField.setFieldName("OBJECT_GROUP_TEXT");
        elemField.setXmlName(new javax.xml.namespace.QName("", "OBJECT_GROUP_TEXT"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("OBJECT_GROUP_NUMBER");
        elemField.setXmlName(new javax.xml.namespace.QName("", "OBJECT_GROUP_NUMBER"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("INFORMATIONAL_ASSIGNMENT");
        elemField.setXmlName(new javax.xml.namespace.QName("", "INFORMATIONAL_ASSIGNMENT"));
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
