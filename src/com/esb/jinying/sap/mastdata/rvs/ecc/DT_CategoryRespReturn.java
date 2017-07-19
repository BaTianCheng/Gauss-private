/**
 * DT_CategoryRespReturn.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package com.esb.jinying.sap.mastdata.rvs.ecc;

public class DT_CategoryRespReturn  implements java.io.Serializable {
    /* 总类目 */
    private java.lang.String SUPPLY_TYPE;

    /* 总类目描述 */
    private java.lang.String BEZEI_TYPE;

    /* 门类编码 */
    private java.lang.String SUPPLY_TYPE_NO;

    /* 门类编码描述 */
    private java.lang.String BEZEI;

    /* 可用标记 */
    private java.lang.String USABLE_FLAG;

    public DT_CategoryRespReturn() {
    }

    public DT_CategoryRespReturn(
           java.lang.String SUPPLY_TYPE,
           java.lang.String BEZEI_TYPE,
           java.lang.String SUPPLY_TYPE_NO,
           java.lang.String BEZEI,
           java.lang.String USABLE_FLAG) {
           this.SUPPLY_TYPE = SUPPLY_TYPE;
           this.BEZEI_TYPE = BEZEI_TYPE;
           this.SUPPLY_TYPE_NO = SUPPLY_TYPE_NO;
           this.BEZEI = BEZEI;
           this.USABLE_FLAG = USABLE_FLAG;
    }


    /**
     * Gets the SUPPLY_TYPE value for this DT_CategoryRespReturn.
     * 
     * @return SUPPLY_TYPE   * 总类目
     */
    public java.lang.String getSUPPLY_TYPE() {
        return SUPPLY_TYPE;
    }


    /**
     * Sets the SUPPLY_TYPE value for this DT_CategoryRespReturn.
     * 
     * @param SUPPLY_TYPE   * 总类目
     */
    public void setSUPPLY_TYPE(java.lang.String SUPPLY_TYPE) {
        this.SUPPLY_TYPE = SUPPLY_TYPE;
    }


    /**
     * Gets the BEZEI_TYPE value for this DT_CategoryRespReturn.
     * 
     * @return BEZEI_TYPE   * 总类目描述
     */
    public java.lang.String getBEZEI_TYPE() {
        return BEZEI_TYPE;
    }


    /**
     * Sets the BEZEI_TYPE value for this DT_CategoryRespReturn.
     * 
     * @param BEZEI_TYPE   * 总类目描述
     */
    public void setBEZEI_TYPE(java.lang.String BEZEI_TYPE) {
        this.BEZEI_TYPE = BEZEI_TYPE;
    }


    /**
     * Gets the SUPPLY_TYPE_NO value for this DT_CategoryRespReturn.
     * 
     * @return SUPPLY_TYPE_NO   * 门类编码
     */
    public java.lang.String getSUPPLY_TYPE_NO() {
        return SUPPLY_TYPE_NO;
    }


    /**
     * Sets the SUPPLY_TYPE_NO value for this DT_CategoryRespReturn.
     * 
     * @param SUPPLY_TYPE_NO   * 门类编码
     */
    public void setSUPPLY_TYPE_NO(java.lang.String SUPPLY_TYPE_NO) {
        this.SUPPLY_TYPE_NO = SUPPLY_TYPE_NO;
    }


    /**
     * Gets the BEZEI value for this DT_CategoryRespReturn.
     * 
     * @return BEZEI   * 门类编码描述
     */
    public java.lang.String getBEZEI() {
        return BEZEI;
    }


    /**
     * Sets the BEZEI value for this DT_CategoryRespReturn.
     * 
     * @param BEZEI   * 门类编码描述
     */
    public void setBEZEI(java.lang.String BEZEI) {
        this.BEZEI = BEZEI;
    }


    /**
     * Gets the USABLE_FLAG value for this DT_CategoryRespReturn.
     * 
     * @return USABLE_FLAG   * 可用标记
     */
    public java.lang.String getUSABLE_FLAG() {
        return USABLE_FLAG;
    }


    /**
     * Sets the USABLE_FLAG value for this DT_CategoryRespReturn.
     * 
     * @param USABLE_FLAG   * 可用标记
     */
    public void setUSABLE_FLAG(java.lang.String USABLE_FLAG) {
        this.USABLE_FLAG = USABLE_FLAG;
    }

    private java.lang.Object __equalsCalc = null;
    public synchronized boolean equals(java.lang.Object obj) {
        if (!(obj instanceof DT_CategoryRespReturn)) return false;
        DT_CategoryRespReturn other = (DT_CategoryRespReturn) obj;
        if (obj == null) return false;
        if (this == obj) return true;
        if (__equalsCalc != null) {
            return (__equalsCalc == obj);
        }
        __equalsCalc = obj;
        boolean _equals;
        _equals = true && 
            ((this.SUPPLY_TYPE==null && other.getSUPPLY_TYPE()==null) || 
             (this.SUPPLY_TYPE!=null &&
              this.SUPPLY_TYPE.equals(other.getSUPPLY_TYPE()))) &&
            ((this.BEZEI_TYPE==null && other.getBEZEI_TYPE()==null) || 
             (this.BEZEI_TYPE!=null &&
              this.BEZEI_TYPE.equals(other.getBEZEI_TYPE()))) &&
            ((this.SUPPLY_TYPE_NO==null && other.getSUPPLY_TYPE_NO()==null) || 
             (this.SUPPLY_TYPE_NO!=null &&
              this.SUPPLY_TYPE_NO.equals(other.getSUPPLY_TYPE_NO()))) &&
            ((this.BEZEI==null && other.getBEZEI()==null) || 
             (this.BEZEI!=null &&
              this.BEZEI.equals(other.getBEZEI()))) &&
            ((this.USABLE_FLAG==null && other.getUSABLE_FLAG()==null) || 
             (this.USABLE_FLAG!=null &&
              this.USABLE_FLAG.equals(other.getUSABLE_FLAG())));
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
        if (getSUPPLY_TYPE() != null) {
            _hashCode += getSUPPLY_TYPE().hashCode();
        }
        if (getBEZEI_TYPE() != null) {
            _hashCode += getBEZEI_TYPE().hashCode();
        }
        if (getSUPPLY_TYPE_NO() != null) {
            _hashCode += getSUPPLY_TYPE_NO().hashCode();
        }
        if (getBEZEI() != null) {
            _hashCode += getBEZEI().hashCode();
        }
        if (getUSABLE_FLAG() != null) {
            _hashCode += getUSABLE_FLAG().hashCode();
        }
        __hashCodeCalc = false;
        return _hashCode;
    }

    // Type metadata
    private static org.apache.axis.description.TypeDesc typeDesc =
        new org.apache.axis.description.TypeDesc(DT_CategoryRespReturn.class, true);

    static {
        typeDesc.setXmlType(new javax.xml.namespace.QName("urn:ecc:rvs:mastdata", ">DT_CategoryResp>return"));
        org.apache.axis.description.ElementDesc elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("SUPPLY_TYPE");
        elemField.setXmlName(new javax.xml.namespace.QName("", "SUPPLY_TYPE"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("BEZEI_TYPE");
        elemField.setXmlName(new javax.xml.namespace.QName("", "BEZEI_TYPE"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("SUPPLY_TYPE_NO");
        elemField.setXmlName(new javax.xml.namespace.QName("", "SUPPLY_TYPE_NO"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("BEZEI");
        elemField.setXmlName(new javax.xml.namespace.QName("", "BEZEI"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("USABLE_FLAG");
        elemField.setXmlName(new javax.xml.namespace.QName("", "USABLE_FLAG"));
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
