/**
 * DT_RSSearchReq.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package com.esb.jinying.sap.mastdata.rvs.ecc;

public class DT_RSSearchReq  implements java.io.Serializable {
    /* 公司代码 */
    private java.lang.String BUKRS;

    /* 商业实体编号 */
    private java.lang.String SWENR;

    /* 租赁对象编号 */
    private java.lang.String SMENR;

    public DT_RSSearchReq() {
    }

    public DT_RSSearchReq(
           java.lang.String BUKRS,
           java.lang.String SWENR,
           java.lang.String SMENR) {
           this.BUKRS = BUKRS;
           this.SWENR = SWENR;
           this.SMENR = SMENR;
    }


    /**
     * Gets the BUKRS value for this DT_RSSearchReq.
     * 
     * @return BUKRS   * 公司代码
     */
    public java.lang.String getBUKRS() {
        return BUKRS;
    }


    /**
     * Sets the BUKRS value for this DT_RSSearchReq.
     * 
     * @param BUKRS   * 公司代码
     */
    public void setBUKRS(java.lang.String BUKRS) {
        this.BUKRS = BUKRS;
    }


    /**
     * Gets the SWENR value for this DT_RSSearchReq.
     * 
     * @return SWENR   * 商业实体编号
     */
    public java.lang.String getSWENR() {
        return SWENR;
    }


    /**
     * Sets the SWENR value for this DT_RSSearchReq.
     * 
     * @param SWENR   * 商业实体编号
     */
    public void setSWENR(java.lang.String SWENR) {
        this.SWENR = SWENR;
    }


    /**
     * Gets the SMENR value for this DT_RSSearchReq.
     * 
     * @return SMENR   * 租赁对象编号
     */
    public java.lang.String getSMENR() {
        return SMENR;
    }


    /**
     * Sets the SMENR value for this DT_RSSearchReq.
     * 
     * @param SMENR   * 租赁对象编号
     */
    public void setSMENR(java.lang.String SMENR) {
        this.SMENR = SMENR;
    }

    private java.lang.Object __equalsCalc = null;
    public synchronized boolean equals(java.lang.Object obj) {
        if (!(obj instanceof DT_RSSearchReq)) return false;
        DT_RSSearchReq other = (DT_RSSearchReq) obj;
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
              this.SMENR.equals(other.getSMENR())));
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
        __hashCodeCalc = false;
        return _hashCode;
    }

    // Type metadata
    private static org.apache.axis.description.TypeDesc typeDesc =
        new org.apache.axis.description.TypeDesc(DT_RSSearchReq.class, true);

    static {
        typeDesc.setXmlType(new javax.xml.namespace.QName("urn:ecc:rvs:mastdata", "DT_RSSearchReq"));
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
