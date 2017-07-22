/**
 * ZEXPORT_QUERY_01Response.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package com.esb.jinying.sap.functions.rfc.sap.document.sap_com;

public class ZEXPORT_QUERY_01Response  implements java.io.Serializable {
    private java.lang.String MESSAGE;

    private java.lang.String MSGTYPE;

    private com.esb.jinying.sap.functions.rfc.sap.document.sap_com.ZBTB_PRMT[] IT_PRMT_INPUT;

    private com.esb.jinying.sap.functions.rfc.sap.document.sap_com.ZBTB_KCCX[] ZBTB_KCCX_OUTPUT;

    private com.esb.jinying.sap.functions.rfc.sap.document.sap_com.ZBTB_VIP[] ZBTB_VIP_OUTPUT;

    private com.esb.jinying.sap.functions.rfc.sap.document.sap_com.ZBTB_XPMX[] ZBTB_XPMX_OUTPUT;

    private com.esb.jinying.sap.functions.rfc.sap.document.sap_com.ZBTB_XSCX[] ZBTB_XSCX_OUTPUT;

    private com.esb.jinying.sap.functions.rfc.sap.document.sap_com.ZBTB_XSCXMX[] ZBTB_XSMX_OUTPUT;

    public ZEXPORT_QUERY_01Response() {
    }

    public ZEXPORT_QUERY_01Response(
           java.lang.String MESSAGE,
           java.lang.String MSGTYPE,
           com.esb.jinying.sap.functions.rfc.sap.document.sap_com.ZBTB_PRMT[] IT_PRMT_INPUT,
           com.esb.jinying.sap.functions.rfc.sap.document.sap_com.ZBTB_KCCX[] ZBTB_KCCX_OUTPUT,
           com.esb.jinying.sap.functions.rfc.sap.document.sap_com.ZBTB_VIP[] ZBTB_VIP_OUTPUT,
           com.esb.jinying.sap.functions.rfc.sap.document.sap_com.ZBTB_XPMX[] ZBTB_XPMX_OUTPUT,
           com.esb.jinying.sap.functions.rfc.sap.document.sap_com.ZBTB_XSCX[] ZBTB_XSCX_OUTPUT,
           com.esb.jinying.sap.functions.rfc.sap.document.sap_com.ZBTB_XSCXMX[] ZBTB_XSMX_OUTPUT) {
           this.MESSAGE = MESSAGE;
           this.MSGTYPE = MSGTYPE;
           this.IT_PRMT_INPUT = IT_PRMT_INPUT;
           this.ZBTB_KCCX_OUTPUT = ZBTB_KCCX_OUTPUT;
           this.ZBTB_VIP_OUTPUT = ZBTB_VIP_OUTPUT;
           this.ZBTB_XPMX_OUTPUT = ZBTB_XPMX_OUTPUT;
           this.ZBTB_XSCX_OUTPUT = ZBTB_XSCX_OUTPUT;
           this.ZBTB_XSMX_OUTPUT = ZBTB_XSMX_OUTPUT;
    }


    /**
     * Gets the MESSAGE value for this ZEXPORT_QUERY_01Response.
     * 
     * @return MESSAGE
     */
    public java.lang.String getMESSAGE() {
        return MESSAGE;
    }


    /**
     * Sets the MESSAGE value for this ZEXPORT_QUERY_01Response.
     * 
     * @param MESSAGE
     */
    public void setMESSAGE(java.lang.String MESSAGE) {
        this.MESSAGE = MESSAGE;
    }


    /**
     * Gets the MSGTYPE value for this ZEXPORT_QUERY_01Response.
     * 
     * @return MSGTYPE
     */
    public java.lang.String getMSGTYPE() {
        return MSGTYPE;
    }


    /**
     * Sets the MSGTYPE value for this ZEXPORT_QUERY_01Response.
     * 
     * @param MSGTYPE
     */
    public void setMSGTYPE(java.lang.String MSGTYPE) {
        this.MSGTYPE = MSGTYPE;
    }


    /**
     * Gets the IT_PRMT_INPUT value for this ZEXPORT_QUERY_01Response.
     * 
     * @return IT_PRMT_INPUT
     */
    public com.esb.jinying.sap.functions.rfc.sap.document.sap_com.ZBTB_PRMT[] getIT_PRMT_INPUT() {
        return IT_PRMT_INPUT;
    }


    /**
     * Sets the IT_PRMT_INPUT value for this ZEXPORT_QUERY_01Response.
     * 
     * @param IT_PRMT_INPUT
     */
    public void setIT_PRMT_INPUT(com.esb.jinying.sap.functions.rfc.sap.document.sap_com.ZBTB_PRMT[] IT_PRMT_INPUT) {
        this.IT_PRMT_INPUT = IT_PRMT_INPUT;
    }


    /**
     * Gets the ZBTB_KCCX_OUTPUT value for this ZEXPORT_QUERY_01Response.
     * 
     * @return ZBTB_KCCX_OUTPUT
     */
    public com.esb.jinying.sap.functions.rfc.sap.document.sap_com.ZBTB_KCCX[] getZBTB_KCCX_OUTPUT() {
        return ZBTB_KCCX_OUTPUT;
    }


    /**
     * Sets the ZBTB_KCCX_OUTPUT value for this ZEXPORT_QUERY_01Response.
     * 
     * @param ZBTB_KCCX_OUTPUT
     */
    public void setZBTB_KCCX_OUTPUT(com.esb.jinying.sap.functions.rfc.sap.document.sap_com.ZBTB_KCCX[] ZBTB_KCCX_OUTPUT) {
        this.ZBTB_KCCX_OUTPUT = ZBTB_KCCX_OUTPUT;
    }


    /**
     * Gets the ZBTB_VIP_OUTPUT value for this ZEXPORT_QUERY_01Response.
     * 
     * @return ZBTB_VIP_OUTPUT
     */
    public com.esb.jinying.sap.functions.rfc.sap.document.sap_com.ZBTB_VIP[] getZBTB_VIP_OUTPUT() {
        return ZBTB_VIP_OUTPUT;
    }


    /**
     * Sets the ZBTB_VIP_OUTPUT value for this ZEXPORT_QUERY_01Response.
     * 
     * @param ZBTB_VIP_OUTPUT
     */
    public void setZBTB_VIP_OUTPUT(com.esb.jinying.sap.functions.rfc.sap.document.sap_com.ZBTB_VIP[] ZBTB_VIP_OUTPUT) {
        this.ZBTB_VIP_OUTPUT = ZBTB_VIP_OUTPUT;
    }


    /**
     * Gets the ZBTB_XPMX_OUTPUT value for this ZEXPORT_QUERY_01Response.
     * 
     * @return ZBTB_XPMX_OUTPUT
     */
    public com.esb.jinying.sap.functions.rfc.sap.document.sap_com.ZBTB_XPMX[] getZBTB_XPMX_OUTPUT() {
        return ZBTB_XPMX_OUTPUT;
    }


    /**
     * Sets the ZBTB_XPMX_OUTPUT value for this ZEXPORT_QUERY_01Response.
     * 
     * @param ZBTB_XPMX_OUTPUT
     */
    public void setZBTB_XPMX_OUTPUT(com.esb.jinying.sap.functions.rfc.sap.document.sap_com.ZBTB_XPMX[] ZBTB_XPMX_OUTPUT) {
        this.ZBTB_XPMX_OUTPUT = ZBTB_XPMX_OUTPUT;
    }


    /**
     * Gets the ZBTB_XSCX_OUTPUT value for this ZEXPORT_QUERY_01Response.
     * 
     * @return ZBTB_XSCX_OUTPUT
     */
    public com.esb.jinying.sap.functions.rfc.sap.document.sap_com.ZBTB_XSCX[] getZBTB_XSCX_OUTPUT() {
        return ZBTB_XSCX_OUTPUT;
    }


    /**
     * Sets the ZBTB_XSCX_OUTPUT value for this ZEXPORT_QUERY_01Response.
     * 
     * @param ZBTB_XSCX_OUTPUT
     */
    public void setZBTB_XSCX_OUTPUT(com.esb.jinying.sap.functions.rfc.sap.document.sap_com.ZBTB_XSCX[] ZBTB_XSCX_OUTPUT) {
        this.ZBTB_XSCX_OUTPUT = ZBTB_XSCX_OUTPUT;
    }


    /**
     * Gets the ZBTB_XSMX_OUTPUT value for this ZEXPORT_QUERY_01Response.
     * 
     * @return ZBTB_XSMX_OUTPUT
     */
    public com.esb.jinying.sap.functions.rfc.sap.document.sap_com.ZBTB_XSCXMX[] getZBTB_XSMX_OUTPUT() {
        return ZBTB_XSMX_OUTPUT;
    }


    /**
     * Sets the ZBTB_XSMX_OUTPUT value for this ZEXPORT_QUERY_01Response.
     * 
     * @param ZBTB_XSMX_OUTPUT
     */
    public void setZBTB_XSMX_OUTPUT(com.esb.jinying.sap.functions.rfc.sap.document.sap_com.ZBTB_XSCXMX[] ZBTB_XSMX_OUTPUT) {
        this.ZBTB_XSMX_OUTPUT = ZBTB_XSMX_OUTPUT;
    }

    private java.lang.Object __equalsCalc = null;
    public synchronized boolean equals(java.lang.Object obj) {
        if (!(obj instanceof ZEXPORT_QUERY_01Response)) return false;
        ZEXPORT_QUERY_01Response other = (ZEXPORT_QUERY_01Response) obj;
        if (obj == null) return false;
        if (this == obj) return true;
        if (__equalsCalc != null) {
            return (__equalsCalc == obj);
        }
        __equalsCalc = obj;
        boolean _equals;
        _equals = true && 
            ((this.MESSAGE==null && other.getMESSAGE()==null) || 
             (this.MESSAGE!=null &&
              this.MESSAGE.equals(other.getMESSAGE()))) &&
            ((this.MSGTYPE==null && other.getMSGTYPE()==null) || 
             (this.MSGTYPE!=null &&
              this.MSGTYPE.equals(other.getMSGTYPE()))) &&
            ((this.IT_PRMT_INPUT==null && other.getIT_PRMT_INPUT()==null) || 
             (this.IT_PRMT_INPUT!=null &&
              java.util.Arrays.equals(this.IT_PRMT_INPUT, other.getIT_PRMT_INPUT()))) &&
            ((this.ZBTB_KCCX_OUTPUT==null && other.getZBTB_KCCX_OUTPUT()==null) || 
             (this.ZBTB_KCCX_OUTPUT!=null &&
              java.util.Arrays.equals(this.ZBTB_KCCX_OUTPUT, other.getZBTB_KCCX_OUTPUT()))) &&
            ((this.ZBTB_VIP_OUTPUT==null && other.getZBTB_VIP_OUTPUT()==null) || 
             (this.ZBTB_VIP_OUTPUT!=null &&
              java.util.Arrays.equals(this.ZBTB_VIP_OUTPUT, other.getZBTB_VIP_OUTPUT()))) &&
            ((this.ZBTB_XPMX_OUTPUT==null && other.getZBTB_XPMX_OUTPUT()==null) || 
             (this.ZBTB_XPMX_OUTPUT!=null &&
              java.util.Arrays.equals(this.ZBTB_XPMX_OUTPUT, other.getZBTB_XPMX_OUTPUT()))) &&
            ((this.ZBTB_XSCX_OUTPUT==null && other.getZBTB_XSCX_OUTPUT()==null) || 
             (this.ZBTB_XSCX_OUTPUT!=null &&
              java.util.Arrays.equals(this.ZBTB_XSCX_OUTPUT, other.getZBTB_XSCX_OUTPUT()))) &&
            ((this.ZBTB_XSMX_OUTPUT==null && other.getZBTB_XSMX_OUTPUT()==null) || 
             (this.ZBTB_XSMX_OUTPUT!=null &&
              java.util.Arrays.equals(this.ZBTB_XSMX_OUTPUT, other.getZBTB_XSMX_OUTPUT())));
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
        if (getMESSAGE() != null) {
            _hashCode += getMESSAGE().hashCode();
        }
        if (getMSGTYPE() != null) {
            _hashCode += getMSGTYPE().hashCode();
        }
        if (getIT_PRMT_INPUT() != null) {
            for (int i=0;
                 i<java.lang.reflect.Array.getLength(getIT_PRMT_INPUT());
                 i++) {
                java.lang.Object obj = java.lang.reflect.Array.get(getIT_PRMT_INPUT(), i);
                if (obj != null &&
                    !obj.getClass().isArray()) {
                    _hashCode += obj.hashCode();
                }
            }
        }
        if (getZBTB_KCCX_OUTPUT() != null) {
            for (int i=0;
                 i<java.lang.reflect.Array.getLength(getZBTB_KCCX_OUTPUT());
                 i++) {
                java.lang.Object obj = java.lang.reflect.Array.get(getZBTB_KCCX_OUTPUT(), i);
                if (obj != null &&
                    !obj.getClass().isArray()) {
                    _hashCode += obj.hashCode();
                }
            }
        }
        if (getZBTB_VIP_OUTPUT() != null) {
            for (int i=0;
                 i<java.lang.reflect.Array.getLength(getZBTB_VIP_OUTPUT());
                 i++) {
                java.lang.Object obj = java.lang.reflect.Array.get(getZBTB_VIP_OUTPUT(), i);
                if (obj != null &&
                    !obj.getClass().isArray()) {
                    _hashCode += obj.hashCode();
                }
            }
        }
        if (getZBTB_XPMX_OUTPUT() != null) {
            for (int i=0;
                 i<java.lang.reflect.Array.getLength(getZBTB_XPMX_OUTPUT());
                 i++) {
                java.lang.Object obj = java.lang.reflect.Array.get(getZBTB_XPMX_OUTPUT(), i);
                if (obj != null &&
                    !obj.getClass().isArray()) {
                    _hashCode += obj.hashCode();
                }
            }
        }
        if (getZBTB_XSCX_OUTPUT() != null) {
            for (int i=0;
                 i<java.lang.reflect.Array.getLength(getZBTB_XSCX_OUTPUT());
                 i++) {
                java.lang.Object obj = java.lang.reflect.Array.get(getZBTB_XSCX_OUTPUT(), i);
                if (obj != null &&
                    !obj.getClass().isArray()) {
                    _hashCode += obj.hashCode();
                }
            }
        }
        if (getZBTB_XSMX_OUTPUT() != null) {
            for (int i=0;
                 i<java.lang.reflect.Array.getLength(getZBTB_XSMX_OUTPUT());
                 i++) {
                java.lang.Object obj = java.lang.reflect.Array.get(getZBTB_XSMX_OUTPUT(), i);
                if (obj != null &&
                    !obj.getClass().isArray()) {
                    _hashCode += obj.hashCode();
                }
            }
        }
        __hashCodeCalc = false;
        return _hashCode;
    }

    // Type metadata
    private static org.apache.axis.description.TypeDesc typeDesc =
        new org.apache.axis.description.TypeDesc(ZEXPORT_QUERY_01Response.class, true);

    static {
        typeDesc.setXmlType(new javax.xml.namespace.QName("urn:sap-com:document:sap:rfc:functions", ">ZEXPORT_QUERY_01.Response"));
        org.apache.axis.description.ElementDesc elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("MESSAGE");
        elemField.setXmlName(new javax.xml.namespace.QName("", "MESSAGE"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("MSGTYPE");
        elemField.setXmlName(new javax.xml.namespace.QName("", "MSGTYPE"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("IT_PRMT_INPUT");
        elemField.setXmlName(new javax.xml.namespace.QName("", "IT_PRMT_INPUT"));
        elemField.setXmlType(new javax.xml.namespace.QName("urn:sap-com:document:sap:rfc:functions", "ZBTB_PRMT"));
        elemField.setNillable(false);
        elemField.setItemQName(new javax.xml.namespace.QName("", "item"));
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("ZBTB_KCCX_OUTPUT");
        elemField.setXmlName(new javax.xml.namespace.QName("", "ZBTB_KCCX_OUTPUT"));
        elemField.setXmlType(new javax.xml.namespace.QName("urn:sap-com:document:sap:rfc:functions", "ZBTB_KCCX"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        elemField.setItemQName(new javax.xml.namespace.QName("", "item"));
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("ZBTB_VIP_OUTPUT");
        elemField.setXmlName(new javax.xml.namespace.QName("", "ZBTB_VIP_OUTPUT"));
        elemField.setXmlType(new javax.xml.namespace.QName("urn:sap-com:document:sap:rfc:functions", "ZBTB_VIP"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        elemField.setItemQName(new javax.xml.namespace.QName("", "item"));
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("ZBTB_XPMX_OUTPUT");
        elemField.setXmlName(new javax.xml.namespace.QName("", "ZBTB_XPMX_OUTPUT"));
        elemField.setXmlType(new javax.xml.namespace.QName("urn:sap-com:document:sap:rfc:functions", "ZBTB_XPMX"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        elemField.setItemQName(new javax.xml.namespace.QName("", "item"));
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("ZBTB_XSCX_OUTPUT");
        elemField.setXmlName(new javax.xml.namespace.QName("", "ZBTB_XSCX_OUTPUT"));
        elemField.setXmlType(new javax.xml.namespace.QName("urn:sap-com:document:sap:rfc:functions", "ZBTB_XSCX"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        elemField.setItemQName(new javax.xml.namespace.QName("", "item"));
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("ZBTB_XSMX_OUTPUT");
        elemField.setXmlName(new javax.xml.namespace.QName("", "ZBTB_XSMX_OUTPUT"));
        elemField.setXmlType(new javax.xml.namespace.QName("urn:sap-com:document:sap:rfc:functions", "ZBTB_XSCXMX"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        elemField.setItemQName(new javax.xml.namespace.QName("", "item"));
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
