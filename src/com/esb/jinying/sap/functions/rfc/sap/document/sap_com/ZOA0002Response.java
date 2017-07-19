/**
 * ZOA0002Response.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package com.esb.jinying.sap.functions.rfc.sap.document.sap_com;

public class ZOA0002Response  implements java.io.Serializable {
    private java.lang.String MESSAGE;

    private java.lang.String SUCC;

    private com.esb.jinying.sap.functions.rfc.sap.document.sap_com.ZOA002[] ZOA002;

    private com.esb.jinying.sap.functions.rfc.sap.document.sap_com.ZOA002_I[] ZOA002_I;

    private com.esb.jinying.sap.functions.rfc.sap.document.sap_com.ZOA002_O[] ZOA002_O;

    public ZOA0002Response() {
    }

    public ZOA0002Response(
           java.lang.String MESSAGE,
           java.lang.String SUCC,
           com.esb.jinying.sap.functions.rfc.sap.document.sap_com.ZOA002[] ZOA002,
           com.esb.jinying.sap.functions.rfc.sap.document.sap_com.ZOA002_I[] ZOA002_I,
           com.esb.jinying.sap.functions.rfc.sap.document.sap_com.ZOA002_O[] ZOA002_O) {
           this.MESSAGE = MESSAGE;
           this.SUCC = SUCC;
           this.ZOA002 = ZOA002;
           this.ZOA002_I = ZOA002_I;
           this.ZOA002_O = ZOA002_O;
    }


    /**
     * Gets the MESSAGE value for this ZOA0002Response.
     * 
     * @return MESSAGE
     */
    public java.lang.String getMESSAGE() {
        return MESSAGE;
    }


    /**
     * Sets the MESSAGE value for this ZOA0002Response.
     * 
     * @param MESSAGE
     */
    public void setMESSAGE(java.lang.String MESSAGE) {
        this.MESSAGE = MESSAGE;
    }


    /**
     * Gets the SUCC value for this ZOA0002Response.
     * 
     * @return SUCC
     */
    public java.lang.String getSUCC() {
        return SUCC;
    }


    /**
     * Sets the SUCC value for this ZOA0002Response.
     * 
     * @param SUCC
     */
    public void setSUCC(java.lang.String SUCC) {
        this.SUCC = SUCC;
    }


    /**
     * Gets the ZOA002 value for this ZOA0002Response.
     * 
     * @return ZOA002
     */
    public com.esb.jinying.sap.functions.rfc.sap.document.sap_com.ZOA002[] getZOA002() {
        return ZOA002;
    }


    /**
     * Sets the ZOA002 value for this ZOA0002Response.
     * 
     * @param ZOA002
     */
    public void setZOA002(com.esb.jinying.sap.functions.rfc.sap.document.sap_com.ZOA002[] ZOA002) {
        this.ZOA002 = ZOA002;
    }


    /**
     * Gets the ZOA002_I value for this ZOA0002Response.
     * 
     * @return ZOA002_I
     */
    public com.esb.jinying.sap.functions.rfc.sap.document.sap_com.ZOA002_I[] getZOA002_I() {
        return ZOA002_I;
    }


    /**
     * Sets the ZOA002_I value for this ZOA0002Response.
     * 
     * @param ZOA002_I
     */
    public void setZOA002_I(com.esb.jinying.sap.functions.rfc.sap.document.sap_com.ZOA002_I[] ZOA002_I) {
        this.ZOA002_I = ZOA002_I;
    }


    /**
     * Gets the ZOA002_O value for this ZOA0002Response.
     * 
     * @return ZOA002_O
     */
    public com.esb.jinying.sap.functions.rfc.sap.document.sap_com.ZOA002_O[] getZOA002_O() {
        return ZOA002_O;
    }


    /**
     * Sets the ZOA002_O value for this ZOA0002Response.
     * 
     * @param ZOA002_O
     */
    public void setZOA002_O(com.esb.jinying.sap.functions.rfc.sap.document.sap_com.ZOA002_O[] ZOA002_O) {
        this.ZOA002_O = ZOA002_O;
    }

    private java.lang.Object __equalsCalc = null;
    public synchronized boolean equals(java.lang.Object obj) {
        if (!(obj instanceof ZOA0002Response)) return false;
        ZOA0002Response other = (ZOA0002Response) obj;
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
            ((this.SUCC==null && other.getSUCC()==null) || 
             (this.SUCC!=null &&
              this.SUCC.equals(other.getSUCC()))) &&
            ((this.ZOA002==null && other.getZOA002()==null) || 
             (this.ZOA002!=null &&
              java.util.Arrays.equals(this.ZOA002, other.getZOA002()))) &&
            ((this.ZOA002_I==null && other.getZOA002_I()==null) || 
             (this.ZOA002_I!=null &&
              java.util.Arrays.equals(this.ZOA002_I, other.getZOA002_I()))) &&
            ((this.ZOA002_O==null && other.getZOA002_O()==null) || 
             (this.ZOA002_O!=null &&
              java.util.Arrays.equals(this.ZOA002_O, other.getZOA002_O())));
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
        if (getSUCC() != null) {
            _hashCode += getSUCC().hashCode();
        }
        if (getZOA002() != null) {
            for (int i=0;
                 i<java.lang.reflect.Array.getLength(getZOA002());
                 i++) {
                java.lang.Object obj = java.lang.reflect.Array.get(getZOA002(), i);
                if (obj != null &&
                    !obj.getClass().isArray()) {
                    _hashCode += obj.hashCode();
                }
            }
        }
        if (getZOA002_I() != null) {
            for (int i=0;
                 i<java.lang.reflect.Array.getLength(getZOA002_I());
                 i++) {
                java.lang.Object obj = java.lang.reflect.Array.get(getZOA002_I(), i);
                if (obj != null &&
                    !obj.getClass().isArray()) {
                    _hashCode += obj.hashCode();
                }
            }
        }
        if (getZOA002_O() != null) {
            for (int i=0;
                 i<java.lang.reflect.Array.getLength(getZOA002_O());
                 i++) {
                java.lang.Object obj = java.lang.reflect.Array.get(getZOA002_O(), i);
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
        new org.apache.axis.description.TypeDesc(ZOA0002Response.class, true);

    static {
        typeDesc.setXmlType(new javax.xml.namespace.QName("urn:sap-com:document:sap:rfc:functions", ">ZOA0002.Response"));
        org.apache.axis.description.ElementDesc elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("MESSAGE");
        elemField.setXmlName(new javax.xml.namespace.QName("", "MESSAGE"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
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
        elemField.setFieldName("ZOA002");
        elemField.setXmlName(new javax.xml.namespace.QName("", "ZOA002"));
        elemField.setXmlType(new javax.xml.namespace.QName("urn:sap-com:document:sap:rfc:functions", "ZOA002"));
        elemField.setNillable(false);
        elemField.setItemQName(new javax.xml.namespace.QName("", "item"));
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("ZOA002_I");
        elemField.setXmlName(new javax.xml.namespace.QName("", "ZOA002_I"));
        elemField.setXmlType(new javax.xml.namespace.QName("urn:sap-com:document:sap:rfc:functions", "ZOA002_I"));
        elemField.setNillable(false);
        elemField.setItemQName(new javax.xml.namespace.QName("", "item"));
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("ZOA002_O");
        elemField.setXmlName(new javax.xml.namespace.QName("", "ZOA002_O"));
        elemField.setXmlType(new javax.xml.namespace.QName("urn:sap-com:document:sap:rfc:functions", "ZOA002_O"));
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
