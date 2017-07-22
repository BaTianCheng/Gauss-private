/**
 * ZOA0001Response.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package com.esb.jinying.sap.functions.rfc.sap.document.sap_com;

public class ZOA0001Response  implements java.io.Serializable {
    private java.lang.String CONTRACT_NO;

    private java.math.BigDecimal KBETR;

    private java.lang.String MESSAGE;

    private java.lang.String MWSKZ;

    private java.math.BigDecimal NETWR;

    private java.lang.String SUCC;

    private java.math.BigDecimal UMREZ;

    public ZOA0001Response() {
    }

    public ZOA0001Response(
           java.lang.String CONTRACT_NO,
           java.math.BigDecimal KBETR,
           java.lang.String MESSAGE,
           java.lang.String MWSKZ,
           java.math.BigDecimal NETWR,
           java.lang.String SUCC,
           java.math.BigDecimal UMREZ) {
           this.CONTRACT_NO = CONTRACT_NO;
           this.KBETR = KBETR;
           this.MESSAGE = MESSAGE;
           this.MWSKZ = MWSKZ;
           this.NETWR = NETWR;
           this.SUCC = SUCC;
           this.UMREZ = UMREZ;
    }


    /**
     * Gets the CONTRACT_NO value for this ZOA0001Response.
     * 
     * @return CONTRACT_NO
     */
    public java.lang.String getCONTRACT_NO() {
        return CONTRACT_NO;
    }


    /**
     * Sets the CONTRACT_NO value for this ZOA0001Response.
     * 
     * @param CONTRACT_NO
     */
    public void setCONTRACT_NO(java.lang.String CONTRACT_NO) {
        this.CONTRACT_NO = CONTRACT_NO;
    }


    /**
     * Gets the KBETR value for this ZOA0001Response.
     * 
     * @return KBETR
     */
    public java.math.BigDecimal getKBETR() {
        return KBETR;
    }


    /**
     * Sets the KBETR value for this ZOA0001Response.
     * 
     * @param KBETR
     */
    public void setKBETR(java.math.BigDecimal KBETR) {
        this.KBETR = KBETR;
    }


    /**
     * Gets the MESSAGE value for this ZOA0001Response.
     * 
     * @return MESSAGE
     */
    public java.lang.String getMESSAGE() {
        return MESSAGE;
    }


    /**
     * Sets the MESSAGE value for this ZOA0001Response.
     * 
     * @param MESSAGE
     */
    public void setMESSAGE(java.lang.String MESSAGE) {
        this.MESSAGE = MESSAGE;
    }


    /**
     * Gets the MWSKZ value for this ZOA0001Response.
     * 
     * @return MWSKZ
     */
    public java.lang.String getMWSKZ() {
        return MWSKZ;
    }


    /**
     * Sets the MWSKZ value for this ZOA0001Response.
     * 
     * @param MWSKZ
     */
    public void setMWSKZ(java.lang.String MWSKZ) {
        this.MWSKZ = MWSKZ;
    }


    /**
     * Gets the NETWR value for this ZOA0001Response.
     * 
     * @return NETWR
     */
    public java.math.BigDecimal getNETWR() {
        return NETWR;
    }


    /**
     * Sets the NETWR value for this ZOA0001Response.
     * 
     * @param NETWR
     */
    public void setNETWR(java.math.BigDecimal NETWR) {
        this.NETWR = NETWR;
    }


    /**
     * Gets the SUCC value for this ZOA0001Response.
     * 
     * @return SUCC
     */
    public java.lang.String getSUCC() {
        return SUCC;
    }


    /**
     * Sets the SUCC value for this ZOA0001Response.
     * 
     * @param SUCC
     */
    public void setSUCC(java.lang.String SUCC) {
        this.SUCC = SUCC;
    }


    /**
     * Gets the UMREZ value for this ZOA0001Response.
     * 
     * @return UMREZ
     */
    public java.math.BigDecimal getUMREZ() {
        return UMREZ;
    }


    /**
     * Sets the UMREZ value for this ZOA0001Response.
     * 
     * @param UMREZ
     */
    public void setUMREZ(java.math.BigDecimal UMREZ) {
        this.UMREZ = UMREZ;
    }

    private java.lang.Object __equalsCalc = null;
    public synchronized boolean equals(java.lang.Object obj) {
        if (!(obj instanceof ZOA0001Response)) return false;
        ZOA0001Response other = (ZOA0001Response) obj;
        if (obj == null) return false;
        if (this == obj) return true;
        if (__equalsCalc != null) {
            return (__equalsCalc == obj);
        }
        __equalsCalc = obj;
        boolean _equals;
        _equals = true && 
            ((this.CONTRACT_NO==null && other.getCONTRACT_NO()==null) || 
             (this.CONTRACT_NO!=null &&
              this.CONTRACT_NO.equals(other.getCONTRACT_NO()))) &&
            ((this.KBETR==null && other.getKBETR()==null) || 
             (this.KBETR!=null &&
              this.KBETR.equals(other.getKBETR()))) &&
            ((this.MESSAGE==null && other.getMESSAGE()==null) || 
             (this.MESSAGE!=null &&
              this.MESSAGE.equals(other.getMESSAGE()))) &&
            ((this.MWSKZ==null && other.getMWSKZ()==null) || 
             (this.MWSKZ!=null &&
              this.MWSKZ.equals(other.getMWSKZ()))) &&
            ((this.NETWR==null && other.getNETWR()==null) || 
             (this.NETWR!=null &&
              this.NETWR.equals(other.getNETWR()))) &&
            ((this.SUCC==null && other.getSUCC()==null) || 
             (this.SUCC!=null &&
              this.SUCC.equals(other.getSUCC()))) &&
            ((this.UMREZ==null && other.getUMREZ()==null) || 
             (this.UMREZ!=null &&
              this.UMREZ.equals(other.getUMREZ())));
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
        if (getCONTRACT_NO() != null) {
            _hashCode += getCONTRACT_NO().hashCode();
        }
        if (getKBETR() != null) {
            _hashCode += getKBETR().hashCode();
        }
        if (getMESSAGE() != null) {
            _hashCode += getMESSAGE().hashCode();
        }
        if (getMWSKZ() != null) {
            _hashCode += getMWSKZ().hashCode();
        }
        if (getNETWR() != null) {
            _hashCode += getNETWR().hashCode();
        }
        if (getSUCC() != null) {
            _hashCode += getSUCC().hashCode();
        }
        if (getUMREZ() != null) {
            _hashCode += getUMREZ().hashCode();
        }
        __hashCodeCalc = false;
        return _hashCode;
    }

    // Type metadata
    private static org.apache.axis.description.TypeDesc typeDesc =
        new org.apache.axis.description.TypeDesc(ZOA0001Response.class, true);

    static {
        typeDesc.setXmlType(new javax.xml.namespace.QName("urn:sap-com:document:sap:rfc:functions", ">ZOA0001.Response"));
        org.apache.axis.description.ElementDesc elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("CONTRACT_NO");
        elemField.setXmlName(new javax.xml.namespace.QName("", "CONTRACT_NO"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("KBETR");
        elemField.setXmlName(new javax.xml.namespace.QName("", "KBETR"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "decimal"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("MESSAGE");
        elemField.setXmlName(new javax.xml.namespace.QName("", "MESSAGE"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("MWSKZ");
        elemField.setXmlName(new javax.xml.namespace.QName("", "MWSKZ"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("NETWR");
        elemField.setXmlName(new javax.xml.namespace.QName("", "NETWR"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "decimal"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("SUCC");
        elemField.setXmlName(new javax.xml.namespace.QName("", "SUCC"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("UMREZ");
        elemField.setXmlName(new javax.xml.namespace.QName("", "UMREZ"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "decimal"));
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
