/**
 * ZSBRAND_01.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package com.esb.jinying.sap.functions.rfc.sap.document.sap_com;

public class ZSBRAND_01  implements java.io.Serializable {
    private java.lang.String ZBRAND_ID;

    private java.lang.String ZBRAND_DES;

    private java.lang.String ZBRAND_DESU;

    private java.lang.String LOEKZ;

    private java.lang.String CREATE_DATE;

    private java.lang.String CHANGE_DATE;

    public ZSBRAND_01() {
    }

    public ZSBRAND_01(
           java.lang.String ZBRAND_ID,
           java.lang.String ZBRAND_DES,
           java.lang.String ZBRAND_DESU,
           java.lang.String LOEKZ,
           java.lang.String CREATE_DATE,
           java.lang.String CHANGE_DATE) {
           this.ZBRAND_ID = ZBRAND_ID;
           this.ZBRAND_DES = ZBRAND_DES;
           this.ZBRAND_DESU = ZBRAND_DESU;
           this.LOEKZ = LOEKZ;
           this.CREATE_DATE = CREATE_DATE;
           this.CHANGE_DATE = CHANGE_DATE;
    }


    /**
     * Gets the ZBRAND_ID value for this ZSBRAND_01.
     * 
     * @return ZBRAND_ID
     */
    public java.lang.String getZBRAND_ID() {
        return ZBRAND_ID;
    }


    /**
     * Sets the ZBRAND_ID value for this ZSBRAND_01.
     * 
     * @param ZBRAND_ID
     */
    public void setZBRAND_ID(java.lang.String ZBRAND_ID) {
        this.ZBRAND_ID = ZBRAND_ID;
    }


    /**
     * Gets the ZBRAND_DES value for this ZSBRAND_01.
     * 
     * @return ZBRAND_DES
     */
    public java.lang.String getZBRAND_DES() {
        return ZBRAND_DES;
    }


    /**
     * Sets the ZBRAND_DES value for this ZSBRAND_01.
     * 
     * @param ZBRAND_DES
     */
    public void setZBRAND_DES(java.lang.String ZBRAND_DES) {
        this.ZBRAND_DES = ZBRAND_DES;
    }


    /**
     * Gets the ZBRAND_DESU value for this ZSBRAND_01.
     * 
     * @return ZBRAND_DESU
     */
    public java.lang.String getZBRAND_DESU() {
        return ZBRAND_DESU;
    }


    /**
     * Sets the ZBRAND_DESU value for this ZSBRAND_01.
     * 
     * @param ZBRAND_DESU
     */
    public void setZBRAND_DESU(java.lang.String ZBRAND_DESU) {
        this.ZBRAND_DESU = ZBRAND_DESU;
    }


    /**
     * Gets the LOEKZ value for this ZSBRAND_01.
     * 
     * @return LOEKZ
     */
    public java.lang.String getLOEKZ() {
        return LOEKZ;
    }


    /**
     * Sets the LOEKZ value for this ZSBRAND_01.
     * 
     * @param LOEKZ
     */
    public void setLOEKZ(java.lang.String LOEKZ) {
        this.LOEKZ = LOEKZ;
    }


    /**
     * Gets the CREATE_DATE value for this ZSBRAND_01.
     * 
     * @return CREATE_DATE
     */
    public java.lang.String getCREATE_DATE() {
        return CREATE_DATE;
    }


    /**
     * Sets the CREATE_DATE value for this ZSBRAND_01.
     * 
     * @param CREATE_DATE
     */
    public void setCREATE_DATE(java.lang.String CREATE_DATE) {
        this.CREATE_DATE = CREATE_DATE;
    }


    /**
     * Gets the CHANGE_DATE value for this ZSBRAND_01.
     * 
     * @return CHANGE_DATE
     */
    public java.lang.String getCHANGE_DATE() {
        return CHANGE_DATE;
    }


    /**
     * Sets the CHANGE_DATE value for this ZSBRAND_01.
     * 
     * @param CHANGE_DATE
     */
    public void setCHANGE_DATE(java.lang.String CHANGE_DATE) {
        this.CHANGE_DATE = CHANGE_DATE;
    }

    private java.lang.Object __equalsCalc = null;
    public synchronized boolean equals(java.lang.Object obj) {
        if (!(obj instanceof ZSBRAND_01)) return false;
        ZSBRAND_01 other = (ZSBRAND_01) obj;
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
            ((this.ZBRAND_DES==null && other.getZBRAND_DES()==null) || 
             (this.ZBRAND_DES!=null &&
              this.ZBRAND_DES.equals(other.getZBRAND_DES()))) &&
            ((this.ZBRAND_DESU==null && other.getZBRAND_DESU()==null) || 
             (this.ZBRAND_DESU!=null &&
              this.ZBRAND_DESU.equals(other.getZBRAND_DESU()))) &&
            ((this.LOEKZ==null && other.getLOEKZ()==null) || 
             (this.LOEKZ!=null &&
              this.LOEKZ.equals(other.getLOEKZ()))) &&
            ((this.CREATE_DATE==null && other.getCREATE_DATE()==null) || 
             (this.CREATE_DATE!=null &&
              this.CREATE_DATE.equals(other.getCREATE_DATE()))) &&
            ((this.CHANGE_DATE==null && other.getCHANGE_DATE()==null) || 
             (this.CHANGE_DATE!=null &&
              this.CHANGE_DATE.equals(other.getCHANGE_DATE())));
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
        if (getZBRAND_DES() != null) {
            _hashCode += getZBRAND_DES().hashCode();
        }
        if (getZBRAND_DESU() != null) {
            _hashCode += getZBRAND_DESU().hashCode();
        }
        if (getLOEKZ() != null) {
            _hashCode += getLOEKZ().hashCode();
        }
        if (getCREATE_DATE() != null) {
            _hashCode += getCREATE_DATE().hashCode();
        }
        if (getCHANGE_DATE() != null) {
            _hashCode += getCHANGE_DATE().hashCode();
        }
        __hashCodeCalc = false;
        return _hashCode;
    }

    // Type metadata
    private static org.apache.axis.description.TypeDesc typeDesc =
        new org.apache.axis.description.TypeDesc(ZSBRAND_01.class, true);

    static {
        typeDesc.setXmlType(new javax.xml.namespace.QName("urn:sap-com:document:sap:rfc:functions", "ZSBRAND_01"));
        org.apache.axis.description.ElementDesc elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("ZBRAND_ID");
        elemField.setXmlName(new javax.xml.namespace.QName("", "ZBRAND_ID"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("ZBRAND_DES");
        elemField.setXmlName(new javax.xml.namespace.QName("", "ZBRAND_DES"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("ZBRAND_DESU");
        elemField.setXmlName(new javax.xml.namespace.QName("", "ZBRAND_DESU"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("LOEKZ");
        elemField.setXmlName(new javax.xml.namespace.QName("", "LOEKZ"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("CREATE_DATE");
        elemField.setXmlName(new javax.xml.namespace.QName("", "CREATE_DATE"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("CHANGE_DATE");
        elemField.setXmlName(new javax.xml.namespace.QName("", "CHANGE_DATE"));
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
