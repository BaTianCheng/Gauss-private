/**
 * _BIC_AZJTCM00.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package com.esb.jinying.sap.functions.rfc.sap.document.sap_com;

public class _BIC_AZJTCM00  implements java.io.Serializable {
    /* Calendar day */
    private com.esb.jinying.sap.functions.rfc.sap.document.sap_com.Date CALDAY;

    /* Company code */
    private java.lang.String COMP_CODE;

    private java.lang.String _BIC_ZHTHM;

    private java.math.BigDecimal _BIC_ZCWMLE;

    /* Document currency */
    private java.lang.String DOC_CURRCY;

    /* BW Delta Process: Record Mode */
    private java.lang.String RECORDMODE;

    public _BIC_AZJTCM00() {
    }

    public _BIC_AZJTCM00(
           com.esb.jinying.sap.functions.rfc.sap.document.sap_com.Date CALDAY,
           java.lang.String COMP_CODE,
           java.lang.String _BIC_ZHTHM,
           java.math.BigDecimal _BIC_ZCWMLE,
           java.lang.String DOC_CURRCY,
           java.lang.String RECORDMODE) {
           this.CALDAY = CALDAY;
           this.COMP_CODE = COMP_CODE;
           this._BIC_ZHTHM = _BIC_ZHTHM;
           this._BIC_ZCWMLE = _BIC_ZCWMLE;
           this.DOC_CURRCY = DOC_CURRCY;
           this.RECORDMODE = RECORDMODE;
    }


    /**
     * Gets the CALDAY value for this _BIC_AZJTCM00.
     * 
     * @return CALDAY   * Calendar day
     */
    public com.esb.jinying.sap.functions.rfc.sap.document.sap_com.Date getCALDAY() {
        return CALDAY;
    }


    /**
     * Sets the CALDAY value for this _BIC_AZJTCM00.
     * 
     * @param CALDAY   * Calendar day
     */
    public void setCALDAY(com.esb.jinying.sap.functions.rfc.sap.document.sap_com.Date CALDAY) {
        this.CALDAY = CALDAY;
    }


    /**
     * Gets the COMP_CODE value for this _BIC_AZJTCM00.
     * 
     * @return COMP_CODE   * Company code
     */
    public java.lang.String getCOMP_CODE() {
        return COMP_CODE;
    }


    /**
     * Sets the COMP_CODE value for this _BIC_AZJTCM00.
     * 
     * @param COMP_CODE   * Company code
     */
    public void setCOMP_CODE(java.lang.String COMP_CODE) {
        this.COMP_CODE = COMP_CODE;
    }


    /**
     * Gets the _BIC_ZHTHM value for this _BIC_AZJTCM00.
     * 
     * @return _BIC_ZHTHM
     */
    public java.lang.String get_BIC_ZHTHM() {
        return _BIC_ZHTHM;
    }


    /**
     * Sets the _BIC_ZHTHM value for this _BIC_AZJTCM00.
     * 
     * @param _BIC_ZHTHM
     */
    public void set_BIC_ZHTHM(java.lang.String _BIC_ZHTHM) {
        this._BIC_ZHTHM = _BIC_ZHTHM;
    }


    /**
     * Gets the _BIC_ZCWMLE value for this _BIC_AZJTCM00.
     * 
     * @return _BIC_ZCWMLE
     */
    public java.math.BigDecimal get_BIC_ZCWMLE() {
        return _BIC_ZCWMLE;
    }


    /**
     * Sets the _BIC_ZCWMLE value for this _BIC_AZJTCM00.
     * 
     * @param _BIC_ZCWMLE
     */
    public void set_BIC_ZCWMLE(java.math.BigDecimal _BIC_ZCWMLE) {
        this._BIC_ZCWMLE = _BIC_ZCWMLE;
    }


    /**
     * Gets the DOC_CURRCY value for this _BIC_AZJTCM00.
     * 
     * @return DOC_CURRCY   * Document currency
     */
    public java.lang.String getDOC_CURRCY() {
        return DOC_CURRCY;
    }


    /**
     * Sets the DOC_CURRCY value for this _BIC_AZJTCM00.
     * 
     * @param DOC_CURRCY   * Document currency
     */
    public void setDOC_CURRCY(java.lang.String DOC_CURRCY) {
        this.DOC_CURRCY = DOC_CURRCY;
    }


    /**
     * Gets the RECORDMODE value for this _BIC_AZJTCM00.
     * 
     * @return RECORDMODE   * BW Delta Process: Record Mode
     */
    public java.lang.String getRECORDMODE() {
        return RECORDMODE;
    }


    /**
     * Sets the RECORDMODE value for this _BIC_AZJTCM00.
     * 
     * @param RECORDMODE   * BW Delta Process: Record Mode
     */
    public void setRECORDMODE(java.lang.String RECORDMODE) {
        this.RECORDMODE = RECORDMODE;
    }

    private java.lang.Object __equalsCalc = null;
    public synchronized boolean equals(java.lang.Object obj) {
        if (!(obj instanceof _BIC_AZJTCM00)) return false;
        _BIC_AZJTCM00 other = (_BIC_AZJTCM00) obj;
        if (obj == null) return false;
        if (this == obj) return true;
        if (__equalsCalc != null) {
            return (__equalsCalc == obj);
        }
        __equalsCalc = obj;
        boolean _equals;
        _equals = true && 
            ((this.CALDAY==null && other.getCALDAY()==null) || 
             (this.CALDAY!=null &&
              this.CALDAY.equals(other.getCALDAY()))) &&
            ((this.COMP_CODE==null && other.getCOMP_CODE()==null) || 
             (this.COMP_CODE!=null &&
              this.COMP_CODE.equals(other.getCOMP_CODE()))) &&
            ((this._BIC_ZHTHM==null && other.get_BIC_ZHTHM()==null) || 
             (this._BIC_ZHTHM!=null &&
              this._BIC_ZHTHM.equals(other.get_BIC_ZHTHM()))) &&
            ((this._BIC_ZCWMLE==null && other.get_BIC_ZCWMLE()==null) || 
             (this._BIC_ZCWMLE!=null &&
              this._BIC_ZCWMLE.equals(other.get_BIC_ZCWMLE()))) &&
            ((this.DOC_CURRCY==null && other.getDOC_CURRCY()==null) || 
             (this.DOC_CURRCY!=null &&
              this.DOC_CURRCY.equals(other.getDOC_CURRCY()))) &&
            ((this.RECORDMODE==null && other.getRECORDMODE()==null) || 
             (this.RECORDMODE!=null &&
              this.RECORDMODE.equals(other.getRECORDMODE())));
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
        if (getCALDAY() != null) {
            _hashCode += getCALDAY().hashCode();
        }
        if (getCOMP_CODE() != null) {
            _hashCode += getCOMP_CODE().hashCode();
        }
        if (get_BIC_ZHTHM() != null) {
            _hashCode += get_BIC_ZHTHM().hashCode();
        }
        if (get_BIC_ZCWMLE() != null) {
            _hashCode += get_BIC_ZCWMLE().hashCode();
        }
        if (getDOC_CURRCY() != null) {
            _hashCode += getDOC_CURRCY().hashCode();
        }
        if (getRECORDMODE() != null) {
            _hashCode += getRECORDMODE().hashCode();
        }
        __hashCodeCalc = false;
        return _hashCode;
    }

    // Type metadata
    private static org.apache.axis.description.TypeDesc typeDesc =
        new org.apache.axis.description.TypeDesc(_BIC_AZJTCM00.class, true);

    static {
        typeDesc.setXmlType(new javax.xml.namespace.QName("urn:sap-com:document:sap:rfc:functions", "_-BIC_-AZJTCM00"));
        org.apache.axis.description.ElementDesc elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("CALDAY");
        elemField.setXmlName(new javax.xml.namespace.QName("", "CALDAY"));
        elemField.setXmlType(new javax.xml.namespace.QName("urn:sap-com:document:sap:rfc:functions", "date"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("COMP_CODE");
        elemField.setXmlName(new javax.xml.namespace.QName("", "COMP_CODE"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("_BIC_ZHTHM");
        elemField.setXmlName(new javax.xml.namespace.QName("", "_-BIC_-ZHTHM"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("_BIC_ZCWMLE");
        elemField.setXmlName(new javax.xml.namespace.QName("", "_-BIC_-ZCWMLE"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "decimal"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("DOC_CURRCY");
        elemField.setXmlName(new javax.xml.namespace.QName("", "DOC_CURRCY"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("RECORDMODE");
        elemField.setXmlName(new javax.xml.namespace.QName("", "RECORDMODE"));
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
