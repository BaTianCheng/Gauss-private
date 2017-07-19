/**
 * ZPO0002.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package com.esb.jinying.sap.functions.rfc.sap.document.sap_com;

public class ZPO0002  implements java.io.Serializable {
    private com.esb.jinying.sap.functions.rfc.sap.document.sap_com.Date DATAB;

    private com.esb.jinying.sap.functions.rfc.sap.document.sap_com.Date DATBI;

    private java.lang.String WERKS;

    private com.esb.jinying.sap.functions.rfc.sap.document.sap_com.ZSMGHEADER[] THEADER;

    private com.esb.jinying.sap.functions.rfc.sap.document.sap_com.ZSMGITEM[] TITEM;

    public ZPO0002() {
    }

    public ZPO0002(
           com.esb.jinying.sap.functions.rfc.sap.document.sap_com.Date DATAB,
           com.esb.jinying.sap.functions.rfc.sap.document.sap_com.Date DATBI,
           java.lang.String WERKS,
           com.esb.jinying.sap.functions.rfc.sap.document.sap_com.ZSMGHEADER[] THEADER,
           com.esb.jinying.sap.functions.rfc.sap.document.sap_com.ZSMGITEM[] TITEM) {
           this.DATAB = DATAB;
           this.DATBI = DATBI;
           this.WERKS = WERKS;
           this.THEADER = THEADER;
           this.TITEM = TITEM;
    }


    /**
     * Gets the DATAB value for this ZPO0002.
     * 
     * @return DATAB
     */
    public com.esb.jinying.sap.functions.rfc.sap.document.sap_com.Date getDATAB() {
        return DATAB;
    }


    /**
     * Sets the DATAB value for this ZPO0002.
     * 
     * @param DATAB
     */
    public void setDATAB(com.esb.jinying.sap.functions.rfc.sap.document.sap_com.Date DATAB) {
        this.DATAB = DATAB;
    }


    /**
     * Gets the DATBI value for this ZPO0002.
     * 
     * @return DATBI
     */
    public com.esb.jinying.sap.functions.rfc.sap.document.sap_com.Date getDATBI() {
        return DATBI;
    }


    /**
     * Sets the DATBI value for this ZPO0002.
     * 
     * @param DATBI
     */
    public void setDATBI(com.esb.jinying.sap.functions.rfc.sap.document.sap_com.Date DATBI) {
        this.DATBI = DATBI;
    }


    /**
     * Gets the WERKS value for this ZPO0002.
     * 
     * @return WERKS
     */
    public java.lang.String getWERKS() {
        return WERKS;
    }


    /**
     * Sets the WERKS value for this ZPO0002.
     * 
     * @param WERKS
     */
    public void setWERKS(java.lang.String WERKS) {
        this.WERKS = WERKS;
    }


    /**
     * Gets the THEADER value for this ZPO0002.
     * 
     * @return THEADER
     */
    public com.esb.jinying.sap.functions.rfc.sap.document.sap_com.ZSMGHEADER[] getTHEADER() {
        return THEADER;
    }


    /**
     * Sets the THEADER value for this ZPO0002.
     * 
     * @param THEADER
     */
    public void setTHEADER(com.esb.jinying.sap.functions.rfc.sap.document.sap_com.ZSMGHEADER[] THEADER) {
        this.THEADER = THEADER;
    }


    /**
     * Gets the TITEM value for this ZPO0002.
     * 
     * @return TITEM
     */
    public com.esb.jinying.sap.functions.rfc.sap.document.sap_com.ZSMGITEM[] getTITEM() {
        return TITEM;
    }


    /**
     * Sets the TITEM value for this ZPO0002.
     * 
     * @param TITEM
     */
    public void setTITEM(com.esb.jinying.sap.functions.rfc.sap.document.sap_com.ZSMGITEM[] TITEM) {
        this.TITEM = TITEM;
    }

    private java.lang.Object __equalsCalc = null;
    public synchronized boolean equals(java.lang.Object obj) {
        if (!(obj instanceof ZPO0002)) return false;
        ZPO0002 other = (ZPO0002) obj;
        if (obj == null) return false;
        if (this == obj) return true;
        if (__equalsCalc != null) {
            return (__equalsCalc == obj);
        }
        __equalsCalc = obj;
        boolean _equals;
        _equals = true && 
            ((this.DATAB==null && other.getDATAB()==null) || 
             (this.DATAB!=null &&
              this.DATAB.equals(other.getDATAB()))) &&
            ((this.DATBI==null && other.getDATBI()==null) || 
             (this.DATBI!=null &&
              this.DATBI.equals(other.getDATBI()))) &&
            ((this.WERKS==null && other.getWERKS()==null) || 
             (this.WERKS!=null &&
              this.WERKS.equals(other.getWERKS()))) &&
            ((this.THEADER==null && other.getTHEADER()==null) || 
             (this.THEADER!=null &&
              java.util.Arrays.equals(this.THEADER, other.getTHEADER()))) &&
            ((this.TITEM==null && other.getTITEM()==null) || 
             (this.TITEM!=null &&
              java.util.Arrays.equals(this.TITEM, other.getTITEM())));
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
        if (getDATAB() != null) {
            _hashCode += getDATAB().hashCode();
        }
        if (getDATBI() != null) {
            _hashCode += getDATBI().hashCode();
        }
        if (getWERKS() != null) {
            _hashCode += getWERKS().hashCode();
        }
        if (getTHEADER() != null) {
            for (int i=0;
                 i<java.lang.reflect.Array.getLength(getTHEADER());
                 i++) {
                java.lang.Object obj = java.lang.reflect.Array.get(getTHEADER(), i);
                if (obj != null &&
                    !obj.getClass().isArray()) {
                    _hashCode += obj.hashCode();
                }
            }
        }
        if (getTITEM() != null) {
            for (int i=0;
                 i<java.lang.reflect.Array.getLength(getTITEM());
                 i++) {
                java.lang.Object obj = java.lang.reflect.Array.get(getTITEM(), i);
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
        new org.apache.axis.description.TypeDesc(ZPO0002.class, true);

    static {
        typeDesc.setXmlType(new javax.xml.namespace.QName("urn:sap-com:document:sap:rfc:functions", ">ZPO0002"));
        org.apache.axis.description.ElementDesc elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("DATAB");
        elemField.setXmlName(new javax.xml.namespace.QName("", "DATAB"));
        elemField.setXmlType(new javax.xml.namespace.QName("urn:sap-com:document:sap:rfc:functions", "date"));
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("DATBI");
        elemField.setXmlName(new javax.xml.namespace.QName("", "DATBI"));
        elemField.setXmlType(new javax.xml.namespace.QName("urn:sap-com:document:sap:rfc:functions", "date"));
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("WERKS");
        elemField.setXmlName(new javax.xml.namespace.QName("", "WERKS"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("THEADER");
        elemField.setXmlName(new javax.xml.namespace.QName("", "THEADER"));
        elemField.setXmlType(new javax.xml.namespace.QName("urn:sap-com:document:sap:rfc:functions", "ZSMGHEADER"));
        elemField.setNillable(false);
        elemField.setItemQName(new javax.xml.namespace.QName("", "item"));
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("TITEM");
        elemField.setXmlName(new javax.xml.namespace.QName("", "TITEM"));
        elemField.setXmlType(new javax.xml.namespace.QName("urn:sap-com:document:sap:rfc:functions", "ZSMGITEM"));
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
