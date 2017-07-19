/**
 * ZSBRAND_04.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package com.esb.jinying.sap.functions.rfc.sap.document.sap_com;

public class ZSBRAND_04  implements java.io.Serializable {
    private java.lang.String ZBRAND_ID;

    private java.lang.String SUPPLY_TYPE_NO;

    private java.lang.String SERNO;

    private java.lang.String SHOP_NAME;

    private java.lang.String FLOOR;

    private java.lang.String AREA;

    private java.lang.String PER_MONTH;

    private java.lang.String QTBRD;

    public ZSBRAND_04() {
    }

    public ZSBRAND_04(
           java.lang.String ZBRAND_ID,
           java.lang.String SUPPLY_TYPE_NO,
           java.lang.String SERNO,
           java.lang.String SHOP_NAME,
           java.lang.String FLOOR,
           java.lang.String AREA,
           java.lang.String PER_MONTH,
           java.lang.String QTBRD) {
           this.ZBRAND_ID = ZBRAND_ID;
           this.SUPPLY_TYPE_NO = SUPPLY_TYPE_NO;
           this.SERNO = SERNO;
           this.SHOP_NAME = SHOP_NAME;
           this.FLOOR = FLOOR;
           this.AREA = AREA;
           this.PER_MONTH = PER_MONTH;
           this.QTBRD = QTBRD;
    }


    /**
     * Gets the ZBRAND_ID value for this ZSBRAND_04.
     * 
     * @return ZBRAND_ID
     */
    public java.lang.String getZBRAND_ID() {
        return ZBRAND_ID;
    }


    /**
     * Sets the ZBRAND_ID value for this ZSBRAND_04.
     * 
     * @param ZBRAND_ID
     */
    public void setZBRAND_ID(java.lang.String ZBRAND_ID) {
        this.ZBRAND_ID = ZBRAND_ID;
    }


    /**
     * Gets the SUPPLY_TYPE_NO value for this ZSBRAND_04.
     * 
     * @return SUPPLY_TYPE_NO
     */
    public java.lang.String getSUPPLY_TYPE_NO() {
        return SUPPLY_TYPE_NO;
    }


    /**
     * Sets the SUPPLY_TYPE_NO value for this ZSBRAND_04.
     * 
     * @param SUPPLY_TYPE_NO
     */
    public void setSUPPLY_TYPE_NO(java.lang.String SUPPLY_TYPE_NO) {
        this.SUPPLY_TYPE_NO = SUPPLY_TYPE_NO;
    }


    /**
     * Gets the SERNO value for this ZSBRAND_04.
     * 
     * @return SERNO
     */
    public java.lang.String getSERNO() {
        return SERNO;
    }


    /**
     * Sets the SERNO value for this ZSBRAND_04.
     * 
     * @param SERNO
     */
    public void setSERNO(java.lang.String SERNO) {
        this.SERNO = SERNO;
    }


    /**
     * Gets the SHOP_NAME value for this ZSBRAND_04.
     * 
     * @return SHOP_NAME
     */
    public java.lang.String getSHOP_NAME() {
        return SHOP_NAME;
    }


    /**
     * Sets the SHOP_NAME value for this ZSBRAND_04.
     * 
     * @param SHOP_NAME
     */
    public void setSHOP_NAME(java.lang.String SHOP_NAME) {
        this.SHOP_NAME = SHOP_NAME;
    }


    /**
     * Gets the FLOOR value for this ZSBRAND_04.
     * 
     * @return FLOOR
     */
    public java.lang.String getFLOOR() {
        return FLOOR;
    }


    /**
     * Sets the FLOOR value for this ZSBRAND_04.
     * 
     * @param FLOOR
     */
    public void setFLOOR(java.lang.String FLOOR) {
        this.FLOOR = FLOOR;
    }


    /**
     * Gets the AREA value for this ZSBRAND_04.
     * 
     * @return AREA
     */
    public java.lang.String getAREA() {
        return AREA;
    }


    /**
     * Sets the AREA value for this ZSBRAND_04.
     * 
     * @param AREA
     */
    public void setAREA(java.lang.String AREA) {
        this.AREA = AREA;
    }


    /**
     * Gets the PER_MONTH value for this ZSBRAND_04.
     * 
     * @return PER_MONTH
     */
    public java.lang.String getPER_MONTH() {
        return PER_MONTH;
    }


    /**
     * Sets the PER_MONTH value for this ZSBRAND_04.
     * 
     * @param PER_MONTH
     */
    public void setPER_MONTH(java.lang.String PER_MONTH) {
        this.PER_MONTH = PER_MONTH;
    }


    /**
     * Gets the QTBRD value for this ZSBRAND_04.
     * 
     * @return QTBRD
     */
    public java.lang.String getQTBRD() {
        return QTBRD;
    }


    /**
     * Sets the QTBRD value for this ZSBRAND_04.
     * 
     * @param QTBRD
     */
    public void setQTBRD(java.lang.String QTBRD) {
        this.QTBRD = QTBRD;
    }

    private java.lang.Object __equalsCalc = null;
    public synchronized boolean equals(java.lang.Object obj) {
        if (!(obj instanceof ZSBRAND_04)) return false;
        ZSBRAND_04 other = (ZSBRAND_04) obj;
        if (obj == null) return false;
        if (this == obj) return true;
        if (__equalsCalc != null) {
            return (__equalsCalc == obj);
        }
        __equalsCalc = obj;
        boolean _equals;
        _equals = true && 
            ((this.ZBRAND_ID==null && other.getZBRAND_ID()==null) || 
             (this.ZBRAND_ID!=null &&
              this.ZBRAND_ID.equals(other.getZBRAND_ID()))) &&
            ((this.SUPPLY_TYPE_NO==null && other.getSUPPLY_TYPE_NO()==null) || 
             (this.SUPPLY_TYPE_NO!=null &&
              this.SUPPLY_TYPE_NO.equals(other.getSUPPLY_TYPE_NO()))) &&
            ((this.SERNO==null && other.getSERNO()==null) || 
             (this.SERNO!=null &&
              this.SERNO.equals(other.getSERNO()))) &&
            ((this.SHOP_NAME==null && other.getSHOP_NAME()==null) || 
             (this.SHOP_NAME!=null &&
              this.SHOP_NAME.equals(other.getSHOP_NAME()))) &&
            ((this.FLOOR==null && other.getFLOOR()==null) || 
             (this.FLOOR!=null &&
              this.FLOOR.equals(other.getFLOOR()))) &&
            ((this.AREA==null && other.getAREA()==null) || 
             (this.AREA!=null &&
              this.AREA.equals(other.getAREA()))) &&
            ((this.PER_MONTH==null && other.getPER_MONTH()==null) || 
             (this.PER_MONTH!=null &&
              this.PER_MONTH.equals(other.getPER_MONTH()))) &&
            ((this.QTBRD==null && other.getQTBRD()==null) || 
             (this.QTBRD!=null &&
              this.QTBRD.equals(other.getQTBRD())));
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
        if (getZBRAND_ID() != null) {
            _hashCode += getZBRAND_ID().hashCode();
        }
        if (getSUPPLY_TYPE_NO() != null) {
            _hashCode += getSUPPLY_TYPE_NO().hashCode();
        }
        if (getSERNO() != null) {
            _hashCode += getSERNO().hashCode();
        }
        if (getSHOP_NAME() != null) {
            _hashCode += getSHOP_NAME().hashCode();
        }
        if (getFLOOR() != null) {
            _hashCode += getFLOOR().hashCode();
        }
        if (getAREA() != null) {
            _hashCode += getAREA().hashCode();
        }
        if (getPER_MONTH() != null) {
            _hashCode += getPER_MONTH().hashCode();
        }
        if (getQTBRD() != null) {
            _hashCode += getQTBRD().hashCode();
        }
        __hashCodeCalc = false;
        return _hashCode;
    }

    // Type metadata
    private static org.apache.axis.description.TypeDesc typeDesc =
        new org.apache.axis.description.TypeDesc(ZSBRAND_04.class, true);

    static {
        typeDesc.setXmlType(new javax.xml.namespace.QName("urn:sap-com:document:sap:rfc:functions", "ZSBRAND_04"));
        org.apache.axis.description.ElementDesc elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("ZBRAND_ID");
        elemField.setXmlName(new javax.xml.namespace.QName("", "ZBRAND_ID"));
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
        elemField.setFieldName("SERNO");
        elemField.setXmlName(new javax.xml.namespace.QName("", "SERNO"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("SHOP_NAME");
        elemField.setXmlName(new javax.xml.namespace.QName("", "SHOP_NAME"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("FLOOR");
        elemField.setXmlName(new javax.xml.namespace.QName("", "FLOOR"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("AREA");
        elemField.setXmlName(new javax.xml.namespace.QName("", "AREA"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("PER_MONTH");
        elemField.setXmlName(new javax.xml.namespace.QName("", "PER_MONTH"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("QTBRD");
        elemField.setXmlName(new javax.xml.namespace.QName("", "QTBRD"));
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
