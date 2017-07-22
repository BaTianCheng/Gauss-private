/**
 * ZOA0002.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package com.esb.jinying.sap.functions.rfc.sap.document.sap_com;

public class ZOA0002  implements java.io.Serializable {
    private java.lang.String WERKS;

    private java.lang.String ZSITE;

    private com.esb.jinying.sap.functions.rfc.sap.document.sap_com.ZOA002[] ZOA002;

    private com.esb.jinying.sap.functions.rfc.sap.document.sap_com.ZOA002_I[] ZOA002_I;

    private com.esb.jinying.sap.functions.rfc.sap.document.sap_com.ZOA002_O[] ZOA002_O;

    public ZOA0002() {
    }

    public ZOA0002(
           java.lang.String WERKS,
           java.lang.String ZSITE,
           com.esb.jinying.sap.functions.rfc.sap.document.sap_com.ZOA002[] ZOA002,
           com.esb.jinying.sap.functions.rfc.sap.document.sap_com.ZOA002_I[] ZOA002_I,
           com.esb.jinying.sap.functions.rfc.sap.document.sap_com.ZOA002_O[] ZOA002_O) {
           this.WERKS = WERKS;
           this.ZSITE = ZSITE;
           this.ZOA002 = ZOA002;
           this.ZOA002_I = ZOA002_I;
           this.ZOA002_O = ZOA002_O;
    }


    /**
     * Gets the WERKS value for this ZOA0002.
     * 
     * @return WERKS
     */
    public java.lang.String getWERKS() {
        return WERKS;
    }


    /**
     * Sets the WERKS value for this ZOA0002.
     * 
     * @param WERKS
     */
    public void setWERKS(java.lang.String WERKS) {
        this.WERKS = WERKS;
    }


    /**
     * Gets the ZSITE value for this ZOA0002.
     * 
     * @return ZSITE
     */
    public java.lang.String getZSITE() {
        return ZSITE;
    }


    /**
     * Sets the ZSITE value for this ZOA0002.
     * 
     * @param ZSITE
     */
    public void setZSITE(java.lang.String ZSITE) {
        this.ZSITE = ZSITE;
    }


    /**
     * Gets the ZOA002 value for this ZOA0002.
     * 
     * @return ZOA002
     */
    public com.esb.jinying.sap.functions.rfc.sap.document.sap_com.ZOA002[] getZOA002() {
        return ZOA002;
    }


    /**
     * Sets the ZOA002 value for this ZOA0002.
     * 
     * @param ZOA002
     */
    public void setZOA002(com.esb.jinying.sap.functions.rfc.sap.document.sap_com.ZOA002[] ZOA002) {
        this.ZOA002 = ZOA002;
    }


    /**
     * Gets the ZOA002_I value for this ZOA0002.
     * 
     * @return ZOA002_I
     */
    public com.esb.jinying.sap.functions.rfc.sap.document.sap_com.ZOA002_I[] getZOA002_I() {
        return ZOA002_I;
    }


    /**
     * Sets the ZOA002_I value for this ZOA0002.
     * 
     * @param ZOA002_I
     */
    public void setZOA002_I(com.esb.jinying.sap.functions.rfc.sap.document.sap_com.ZOA002_I[] ZOA002_I) {
        this.ZOA002_I = ZOA002_I;
    }


    /**
     * Gets the ZOA002_O value for this ZOA0002.
     * 
     * @return ZOA002_O
     */
    public com.esb.jinying.sap.functions.rfc.sap.document.sap_com.ZOA002_O[] getZOA002_O() {
        return ZOA002_O;
    }


    /**
     * Sets the ZOA002_O value for this ZOA0002.
     * 
     * @param ZOA002_O
     */
    public void setZOA002_O(com.esb.jinying.sap.functions.rfc.sap.document.sap_com.ZOA002_O[] ZOA002_O) {
        this.ZOA002_O = ZOA002_O;
    }

    private java.lang.Object __equalsCalc = null;
    public synchronized boolean equals(java.lang.Object obj) {
        if (!(obj instanceof ZOA0002)) return false;
        ZOA0002 other = (ZOA0002) obj;
        if (obj == null) return false;
        if (this == obj) return true;
        if (__equalsCalc != null) {
            return (__equalsCalc == obj);
        }
        __equalsCalc = obj;
        boolean _equals;
        _equals = true && 
            ((this.WERKS==null && other.getWERKS()==null) || 
             (this.WERKS!=null &&
              this.WERKS.equals(other.getWERKS()))) &&
            ((this.ZSITE==null && other.getZSITE()==null) || 
             (this.ZSITE!=null &&
              this.ZSITE.equals(other.getZSITE()))) &&
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
        if (getWERKS() != null) {
            _hashCode += getWERKS().hashCode();
        }
        if (getZSITE() != null) {
            _hashCode += getZSITE().hashCode();
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
        new org.apache.axis.description.TypeDesc(ZOA0002.class, true);

    static {
        typeDesc.setXmlType(new javax.xml.namespace.QName("urn:sap-com:document:sap:rfc:functions", ">ZOA0002"));
        org.apache.axis.description.ElementDesc elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("WERKS");
        elemField.setXmlName(new javax.xml.namespace.QName("", "WERKS"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("ZSITE");
        elemField.setXmlName(new javax.xml.namespace.QName("", "ZSITE"));
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
