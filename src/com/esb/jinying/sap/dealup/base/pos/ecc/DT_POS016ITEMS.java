/**
 * DT_POS016ITEMS.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package com.esb.jinying.sap.dealup.base.pos.ecc;

public class DT_POS016ITEMS  implements java.io.Serializable {
    /* 促销编码 */
    private java.lang.String PROMOTIONID;

    /* 开始日期 */
    private java.lang.String DATAB;

    /* 结束日期 */
    private java.lang.String DATBI;

    /* 备注 */
    private java.lang.String REMARK;

    /* 销售组织 (分店) */
    private java.lang.String VKORG;

    public DT_POS016ITEMS() {
    }

    public DT_POS016ITEMS(
           java.lang.String PROMOTIONID,
           java.lang.String DATAB,
           java.lang.String DATBI,
           java.lang.String REMARK,
           java.lang.String VKORG) {
           this.PROMOTIONID = PROMOTIONID;
           this.DATAB = DATAB;
           this.DATBI = DATBI;
           this.REMARK = REMARK;
           this.VKORG = VKORG;
    }


    /**
     * Gets the PROMOTIONID value for this DT_POS016ITEMS.
     * 
     * @return PROMOTIONID   * 促销编码
     */
    public java.lang.String getPROMOTIONID() {
        return PROMOTIONID;
    }


    /**
     * Sets the PROMOTIONID value for this DT_POS016ITEMS.
     * 
     * @param PROMOTIONID   * 促销编码
     */
    public void setPROMOTIONID(java.lang.String PROMOTIONID) {
        this.PROMOTIONID = PROMOTIONID;
    }


    /**
     * Gets the DATAB value for this DT_POS016ITEMS.
     * 
     * @return DATAB   * 开始日期
     */
    public java.lang.String getDATAB() {
        return DATAB;
    }


    /**
     * Sets the DATAB value for this DT_POS016ITEMS.
     * 
     * @param DATAB   * 开始日期
     */
    public void setDATAB(java.lang.String DATAB) {
        this.DATAB = DATAB;
    }


    /**
     * Gets the DATBI value for this DT_POS016ITEMS.
     * 
     * @return DATBI   * 结束日期
     */
    public java.lang.String getDATBI() {
        return DATBI;
    }


    /**
     * Sets the DATBI value for this DT_POS016ITEMS.
     * 
     * @param DATBI   * 结束日期
     */
    public void setDATBI(java.lang.String DATBI) {
        this.DATBI = DATBI;
    }


    /**
     * Gets the REMARK value for this DT_POS016ITEMS.
     * 
     * @return REMARK   * 备注
     */
    public java.lang.String getREMARK() {
        return REMARK;
    }


    /**
     * Sets the REMARK value for this DT_POS016ITEMS.
     * 
     * @param REMARK   * 备注
     */
    public void setREMARK(java.lang.String REMARK) {
        this.REMARK = REMARK;
    }


    /**
     * Gets the VKORG value for this DT_POS016ITEMS.
     * 
     * @return VKORG   * 销售组织 (分店)
     */
    public java.lang.String getVKORG() {
        return VKORG;
    }


    /**
     * Sets the VKORG value for this DT_POS016ITEMS.
     * 
     * @param VKORG   * 销售组织 (分店)
     */
    public void setVKORG(java.lang.String VKORG) {
        this.VKORG = VKORG;
    }

    private java.lang.Object __equalsCalc = null;
    public synchronized boolean equals(java.lang.Object obj) {
        if (!(obj instanceof DT_POS016ITEMS)) return false;
        DT_POS016ITEMS other = (DT_POS016ITEMS) obj;
        if (obj == null) return false;
        if (this == obj) return true;
        if (__equalsCalc != null) {
            return (__equalsCalc == obj);
        }
        __equalsCalc = obj;
        boolean _equals;
        _equals = true && 
            ((this.PROMOTIONID==null && other.getPROMOTIONID()==null) || 
             (this.PROMOTIONID!=null &&
              this.PROMOTIONID.equals(other.getPROMOTIONID()))) &&
            ((this.DATAB==null && other.getDATAB()==null) || 
             (this.DATAB!=null &&
              this.DATAB.equals(other.getDATAB()))) &&
            ((this.DATBI==null && other.getDATBI()==null) || 
             (this.DATBI!=null &&
              this.DATBI.equals(other.getDATBI()))) &&
            ((this.REMARK==null && other.getREMARK()==null) || 
             (this.REMARK!=null &&
              this.REMARK.equals(other.getREMARK()))) &&
            ((this.VKORG==null && other.getVKORG()==null) || 
             (this.VKORG!=null &&
              this.VKORG.equals(other.getVKORG())));
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
        if (getPROMOTIONID() != null) {
            _hashCode += getPROMOTIONID().hashCode();
        }
        if (getDATAB() != null) {
            _hashCode += getDATAB().hashCode();
        }
        if (getDATBI() != null) {
            _hashCode += getDATBI().hashCode();
        }
        if (getREMARK() != null) {
            _hashCode += getREMARK().hashCode();
        }
        if (getVKORG() != null) {
            _hashCode += getVKORG().hashCode();
        }
        __hashCodeCalc = false;
        return _hashCode;
    }

    // Type metadata
    private static org.apache.axis.description.TypeDesc typeDesc =
        new org.apache.axis.description.TypeDesc(DT_POS016ITEMS.class, true);

    static {
        typeDesc.setXmlType(new javax.xml.namespace.QName("urn:ecc:pos:base:dealup", ">DT_POS016>ITEMS"));
        org.apache.axis.description.ElementDesc elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("PROMOTIONID");
        elemField.setXmlName(new javax.xml.namespace.QName("", "PROMOTIONID"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("DATAB");
        elemField.setXmlName(new javax.xml.namespace.QName("", "DATAB"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("DATBI");
        elemField.setXmlName(new javax.xml.namespace.QName("", "DATBI"));
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
        elemField.setFieldName("VKORG");
        elemField.setXmlName(new javax.xml.namespace.QName("", "VKORG"));
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
