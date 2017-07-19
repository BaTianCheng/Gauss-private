/**
 * DT_AggreCounterRespReturn.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package com.esb.jinying.sap.mastdata.rvs.ecc;

public class DT_AggreCounterRespReturn  implements java.io.Serializable {
    /* 集合柜代码 */
    private java.lang.String SET_NO;

    /* 集合柜描述 */
    private java.lang.String SET_MESS;

    /* 集合柜是否有效 */
    private java.lang.String SET_MARK;

    public DT_AggreCounterRespReturn() {
    }

    public DT_AggreCounterRespReturn(
           java.lang.String SET_NO,
           java.lang.String SET_MESS,
           java.lang.String SET_MARK) {
           this.SET_NO = SET_NO;
           this.SET_MESS = SET_MESS;
           this.SET_MARK = SET_MARK;
    }


    /**
     * Gets the SET_NO value for this DT_AggreCounterRespReturn.
     * 
     * @return SET_NO   * 集合柜代码
     */
    public java.lang.String getSET_NO() {
        return SET_NO;
    }


    /**
     * Sets the SET_NO value for this DT_AggreCounterRespReturn.
     * 
     * @param SET_NO   * 集合柜代码
     */
    public void setSET_NO(java.lang.String SET_NO) {
        this.SET_NO = SET_NO;
    }


    /**
     * Gets the SET_MESS value for this DT_AggreCounterRespReturn.
     * 
     * @return SET_MESS   * 集合柜描述
     */
    public java.lang.String getSET_MESS() {
        return SET_MESS;
    }


    /**
     * Sets the SET_MESS value for this DT_AggreCounterRespReturn.
     * 
     * @param SET_MESS   * 集合柜描述
     */
    public void setSET_MESS(java.lang.String SET_MESS) {
        this.SET_MESS = SET_MESS;
    }


    /**
     * Gets the SET_MARK value for this DT_AggreCounterRespReturn.
     * 
     * @return SET_MARK   * 集合柜是否有效
     */
    public java.lang.String getSET_MARK() {
        return SET_MARK;
    }


    /**
     * Sets the SET_MARK value for this DT_AggreCounterRespReturn.
     * 
     * @param SET_MARK   * 集合柜是否有效
     */
    public void setSET_MARK(java.lang.String SET_MARK) {
        this.SET_MARK = SET_MARK;
    }

    private java.lang.Object __equalsCalc = null;
    public synchronized boolean equals(java.lang.Object obj) {
        if (!(obj instanceof DT_AggreCounterRespReturn)) return false;
        DT_AggreCounterRespReturn other = (DT_AggreCounterRespReturn) obj;
        if (obj == null) return false;
        if (this == obj) return true;
        if (__equalsCalc != null) {
            return (__equalsCalc == obj);
        }
        __equalsCalc = obj;
        boolean _equals;
        _equals = true && 
            ((this.SET_NO==null && other.getSET_NO()==null) || 
             (this.SET_NO!=null &&
              this.SET_NO.equals(other.getSET_NO()))) &&
            ((this.SET_MESS==null && other.getSET_MESS()==null) || 
             (this.SET_MESS!=null &&
              this.SET_MESS.equals(other.getSET_MESS()))) &&
            ((this.SET_MARK==null && other.getSET_MARK()==null) || 
             (this.SET_MARK!=null &&
              this.SET_MARK.equals(other.getSET_MARK())));
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
        if (getSET_NO() != null) {
            _hashCode += getSET_NO().hashCode();
        }
        if (getSET_MESS() != null) {
            _hashCode += getSET_MESS().hashCode();
        }
        if (getSET_MARK() != null) {
            _hashCode += getSET_MARK().hashCode();
        }
        __hashCodeCalc = false;
        return _hashCode;
    }

    // Type metadata
    private static org.apache.axis.description.TypeDesc typeDesc =
        new org.apache.axis.description.TypeDesc(DT_AggreCounterRespReturn.class, true);

    static {
        typeDesc.setXmlType(new javax.xml.namespace.QName("urn:ecc:rvs:mastdata", ">DT_AggreCounterResp>return"));
        org.apache.axis.description.ElementDesc elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("SET_NO");
        elemField.setXmlName(new javax.xml.namespace.QName("", "SET_NO"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("SET_MESS");
        elemField.setXmlName(new javax.xml.namespace.QName("", "SET_MESS"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("SET_MARK");
        elemField.setXmlName(new javax.xml.namespace.QName("", "SET_MARK"));
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
