/**
 * ZSBRAND_06.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package com.esb.jinying.sap.functions.rfc.sap.document.sap_com;

public class ZSBRAND_06  implements java.io.Serializable {
    private java.lang.String ZBRAND_ID;

    private java.lang.String SUPPLY_TYPE_NO;

    private java.lang.String SERNO;

    private java.lang.String DL_BR;

    private java.lang.String DL_PR;

    private java.lang.String DL_PH;

    private java.lang.String DL_PT;

    private java.lang.String DL_DQ;

    public ZSBRAND_06() {
    }

    public ZSBRAND_06(
           java.lang.String ZBRAND_ID,
           java.lang.String SUPPLY_TYPE_NO,
           java.lang.String SERNO,
           java.lang.String DL_BR,
           java.lang.String DL_PR,
           java.lang.String DL_PH,
           java.lang.String DL_PT,
           java.lang.String DL_DQ) {
           this.ZBRAND_ID = ZBRAND_ID;
           this.SUPPLY_TYPE_NO = SUPPLY_TYPE_NO;
           this.SERNO = SERNO;
           this.DL_BR = DL_BR;
           this.DL_PR = DL_PR;
           this.DL_PH = DL_PH;
           this.DL_PT = DL_PT;
           this.DL_DQ = DL_DQ;
    }


    /**
     * Gets the ZBRAND_ID value for this ZSBRAND_06.
     * 
     * @return ZBRAND_ID
     */
    public java.lang.String getZBRAND_ID() {
        return ZBRAND_ID;
    }


    /**
     * Sets the ZBRAND_ID value for this ZSBRAND_06.
     * 
     * @param ZBRAND_ID
     */
    public void setZBRAND_ID(java.lang.String ZBRAND_ID) {
        this.ZBRAND_ID = ZBRAND_ID;
    }


    /**
     * Gets the SUPPLY_TYPE_NO value for this ZSBRAND_06.
     * 
     * @return SUPPLY_TYPE_NO
     */
    public java.lang.String getSUPPLY_TYPE_NO() {
        return SUPPLY_TYPE_NO;
    }


    /**
     * Sets the SUPPLY_TYPE_NO value for this ZSBRAND_06.
     * 
     * @param SUPPLY_TYPE_NO
     */
    public void setSUPPLY_TYPE_NO(java.lang.String SUPPLY_TYPE_NO) {
        this.SUPPLY_TYPE_NO = SUPPLY_TYPE_NO;
    }


    /**
     * Gets the SERNO value for this ZSBRAND_06.
     * 
     * @return SERNO
     */
    public java.lang.String getSERNO() {
        return SERNO;
    }


    /**
     * Sets the SERNO value for this ZSBRAND_06.
     * 
     * @param SERNO
     */
    public void setSERNO(java.lang.String SERNO) {
        this.SERNO = SERNO;
    }


    /**
     * Gets the DL_BR value for this ZSBRAND_06.
     * 
     * @return DL_BR
     */
    public java.lang.String getDL_BR() {
        return DL_BR;
    }


    /**
     * Sets the DL_BR value for this ZSBRAND_06.
     * 
     * @param DL_BR
     */
    public void setDL_BR(java.lang.String DL_BR) {
        this.DL_BR = DL_BR;
    }


    /**
     * Gets the DL_PR value for this ZSBRAND_06.
     * 
     * @return DL_PR
     */
    public java.lang.String getDL_PR() {
        return DL_PR;
    }


    /**
     * Sets the DL_PR value for this ZSBRAND_06.
     * 
     * @param DL_PR
     */
    public void setDL_PR(java.lang.String DL_PR) {
        this.DL_PR = DL_PR;
    }


    /**
     * Gets the DL_PH value for this ZSBRAND_06.
     * 
     * @return DL_PH
     */
    public java.lang.String getDL_PH() {
        return DL_PH;
    }


    /**
     * Sets the DL_PH value for this ZSBRAND_06.
     * 
     * @param DL_PH
     */
    public void setDL_PH(java.lang.String DL_PH) {
        this.DL_PH = DL_PH;
    }


    /**
     * Gets the DL_PT value for this ZSBRAND_06.
     * 
     * @return DL_PT
     */
    public java.lang.String getDL_PT() {
        return DL_PT;
    }


    /**
     * Sets the DL_PT value for this ZSBRAND_06.
     * 
     * @param DL_PT
     */
    public void setDL_PT(java.lang.String DL_PT) {
        this.DL_PT = DL_PT;
    }


    /**
     * Gets the DL_DQ value for this ZSBRAND_06.
     * 
     * @return DL_DQ
     */
    public java.lang.String getDL_DQ() {
        return DL_DQ;
    }


    /**
     * Sets the DL_DQ value for this ZSBRAND_06.
     * 
     * @param DL_DQ
     */
    public void setDL_DQ(java.lang.String DL_DQ) {
        this.DL_DQ = DL_DQ;
    }

    private java.lang.Object __equalsCalc = null;
    public synchronized boolean equals(java.lang.Object obj) {
        if (!(obj instanceof ZSBRAND_06)) return false;
        ZSBRAND_06 other = (ZSBRAND_06) obj;
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
            ((this.DL_BR==null && other.getDL_BR()==null) || 
             (this.DL_BR!=null &&
              this.DL_BR.equals(other.getDL_BR()))) &&
            ((this.DL_PR==null && other.getDL_PR()==null) || 
             (this.DL_PR!=null &&
              this.DL_PR.equals(other.getDL_PR()))) &&
            ((this.DL_PH==null && other.getDL_PH()==null) || 
             (this.DL_PH!=null &&
              this.DL_PH.equals(other.getDL_PH()))) &&
            ((this.DL_PT==null && other.getDL_PT()==null) || 
             (this.DL_PT!=null &&
              this.DL_PT.equals(other.getDL_PT()))) &&
            ((this.DL_DQ==null && other.getDL_DQ()==null) || 
             (this.DL_DQ!=null &&
              this.DL_DQ.equals(other.getDL_DQ())));
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
        if (getDL_BR() != null) {
            _hashCode += getDL_BR().hashCode();
        }
        if (getDL_PR() != null) {
            _hashCode += getDL_PR().hashCode();
        }
        if (getDL_PH() != null) {
            _hashCode += getDL_PH().hashCode();
        }
        if (getDL_PT() != null) {
            _hashCode += getDL_PT().hashCode();
        }
        if (getDL_DQ() != null) {
            _hashCode += getDL_DQ().hashCode();
        }
        __hashCodeCalc = false;
        return _hashCode;
    }

    // Type metadata
    private static org.apache.axis.description.TypeDesc typeDesc =
        new org.apache.axis.description.TypeDesc(ZSBRAND_06.class, true);

    static {
        typeDesc.setXmlType(new javax.xml.namespace.QName("urn:sap-com:document:sap:rfc:functions", "ZSBRAND_06"));
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
        elemField.setFieldName("DL_BR");
        elemField.setXmlName(new javax.xml.namespace.QName("", "DL_BR"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("DL_PR");
        elemField.setXmlName(new javax.xml.namespace.QName("", "DL_PR"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("DL_PH");
        elemField.setXmlName(new javax.xml.namespace.QName("", "DL_PH"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("DL_PT");
        elemField.setXmlName(new javax.xml.namespace.QName("", "DL_PT"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("DL_DQ");
        elemField.setXmlName(new javax.xml.namespace.QName("", "DL_DQ"));
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
