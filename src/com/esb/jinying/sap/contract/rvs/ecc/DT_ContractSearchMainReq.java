/**
 * DT_ContractSearchMainReq.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package com.esb.jinying.sap.contract.rvs.ecc;

public class DT_ContractSearchMainReq  implements java.io.Serializable {
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

    public DT_ContractSearchMainReq() {
    }

    public DT_ContractSearchMainReq(
           java.lang.String i_CONTRACTNUMBER,
           java.lang.String i_COMP_CODE_EXT,
           java.lang.String i_CONTRACT_TYPE,
           java.lang.String i_CONTRACT_START_DATE,
           java.lang.String i_FIRST_END_DATE) {
           this.i_CONTRACTNUMBER = i_CONTRACTNUMBER;
           this.i_COMP_CODE_EXT = i_COMP_CODE_EXT;
           this.i_CONTRACT_TYPE = i_CONTRACT_TYPE;
           this.i_CONTRACT_START_DATE = i_CONTRACT_START_DATE;
           this.i_FIRST_END_DATE = i_FIRST_END_DATE;
    }


    /**
     * Gets the i_CONTRACTNUMBER value for this DT_ContractSearchMainReq.
     * 
     * @return i_CONTRACTNUMBER   * 合同编号
     */
    public java.lang.String getI_CONTRACTNUMBER() {
        return i_CONTRACTNUMBER;
    }


    /**
     * Sets the i_CONTRACTNUMBER value for this DT_ContractSearchMainReq.
     * 
     * @param i_CONTRACTNUMBER   * 合同编号
     */
    public void setI_CONTRACTNUMBER(java.lang.String i_CONTRACTNUMBER) {
        this.i_CONTRACTNUMBER = i_CONTRACTNUMBER;
    }


    /**
     * Gets the i_COMP_CODE_EXT value for this DT_ContractSearchMainReq.
     * 
     * @return i_COMP_CODE_EXT   * 公司代码
     */
    public java.lang.String getI_COMP_CODE_EXT() {
        return i_COMP_CODE_EXT;
    }


    /**
     * Sets the i_COMP_CODE_EXT value for this DT_ContractSearchMainReq.
     * 
     * @param i_COMP_CODE_EXT   * 公司代码
     */
    public void setI_COMP_CODE_EXT(java.lang.String i_COMP_CODE_EXT) {
        this.i_COMP_CODE_EXT = i_COMP_CODE_EXT;
    }


    /**
     * Gets the i_CONTRACT_TYPE value for this DT_ContractSearchMainReq.
     * 
     * @return i_CONTRACT_TYPE   * 合同类型
     */
    public java.lang.String getI_CONTRACT_TYPE() {
        return i_CONTRACT_TYPE;
    }


    /**
     * Sets the i_CONTRACT_TYPE value for this DT_ContractSearchMainReq.
     * 
     * @param i_CONTRACT_TYPE   * 合同类型
     */
    public void setI_CONTRACT_TYPE(java.lang.String i_CONTRACT_TYPE) {
        this.i_CONTRACT_TYPE = i_CONTRACT_TYPE;
    }


    /**
     * Gets the i_CONTRACT_START_DATE value for this DT_ContractSearchMainReq.
     * 
     * @return i_CONTRACT_START_DATE   * 合同订立日期
     */
    public java.lang.String getI_CONTRACT_START_DATE() {
        return i_CONTRACT_START_DATE;
    }


    /**
     * Sets the i_CONTRACT_START_DATE value for this DT_ContractSearchMainReq.
     * 
     * @param i_CONTRACT_START_DATE   * 合同订立日期
     */
    public void setI_CONTRACT_START_DATE(java.lang.String i_CONTRACT_START_DATE) {
        this.i_CONTRACT_START_DATE = i_CONTRACT_START_DATE;
    }


    /**
     * Gets the i_FIRST_END_DATE value for this DT_ContractSearchMainReq.
     * 
     * @return i_FIRST_END_DATE   * 合同结束日期
     */
    public java.lang.String getI_FIRST_END_DATE() {
        return i_FIRST_END_DATE;
    }


    /**
     * Sets the i_FIRST_END_DATE value for this DT_ContractSearchMainReq.
     * 
     * @param i_FIRST_END_DATE   * 合同结束日期
     */
    public void setI_FIRST_END_DATE(java.lang.String i_FIRST_END_DATE) {
        this.i_FIRST_END_DATE = i_FIRST_END_DATE;
    }

    private java.lang.Object __equalsCalc = null;
    public synchronized boolean equals(java.lang.Object obj) {
        if (!(obj instanceof DT_ContractSearchMainReq)) return false;
        DT_ContractSearchMainReq other = (DT_ContractSearchMainReq) obj;
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
              this.i_FIRST_END_DATE.equals(other.getI_FIRST_END_DATE())));
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
        __hashCodeCalc = false;
        return _hashCode;
    }

    // Type metadata
    private static org.apache.axis.description.TypeDesc typeDesc =
        new org.apache.axis.description.TypeDesc(DT_ContractSearchMainReq.class, true);

    static {
        typeDesc.setXmlType(new javax.xml.namespace.QName("urn:ecc:rvs:contract", "DT_ContractSearchMainReq"));
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
