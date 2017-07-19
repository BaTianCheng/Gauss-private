/**
 * ZVICNCN.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package com.esb.jinying.sap.functions.rfc.sap.document.sap_com;

public class ZVICNCN  implements java.io.Serializable {
    /* Client */
    private java.lang.String MANDT;

    private java.lang.String RECNNR;

    /* Sales Organization */
    private java.lang.String ZVKORG;

    /* Purchasing Group */
    private java.lang.String ZEKGRP;

    private java.lang.String ZVKGRP;

    private java.lang.String ZVKBUR;

    /* Business Partner Number */
    private java.lang.String PARTNER;

    private java.lang.String ZBNO_MAIN;

    private java.lang.String ZSUPPLY_TYPE_NO;

    private java.lang.String ZCLCYCLE;

    private java.math.BigDecimal ZMINSALE_TOTAL;

    /* Date of contract start */
    private com.esb.jinying.sap.functions.rfc.sap.document.sap_com.Date RECNCNBEG;

    /* Term End Date */
    private com.esb.jinying.sap.functions.rfc.sap.document.sap_com.Date RECNCNENDABS;

    /* Merchandise category 1 */
    private java.lang.String MVGR1;

    private java.lang.String ZMATTAX;

    public ZVICNCN() {
    }

    public ZVICNCN(
           java.lang.String MANDT,
           java.lang.String RECNNR,
           java.lang.String ZVKORG,
           java.lang.String ZEKGRP,
           java.lang.String ZVKGRP,
           java.lang.String ZVKBUR,
           java.lang.String PARTNER,
           java.lang.String ZBNO_MAIN,
           java.lang.String ZSUPPLY_TYPE_NO,
           java.lang.String ZCLCYCLE,
           java.math.BigDecimal ZMINSALE_TOTAL,
           com.esb.jinying.sap.functions.rfc.sap.document.sap_com.Date RECNCNBEG,
           com.esb.jinying.sap.functions.rfc.sap.document.sap_com.Date RECNCNENDABS,
           java.lang.String MVGR1,
           java.lang.String ZMATTAX) {
           this.MANDT = MANDT;
           this.RECNNR = RECNNR;
           this.ZVKORG = ZVKORG;
           this.ZEKGRP = ZEKGRP;
           this.ZVKGRP = ZVKGRP;
           this.ZVKBUR = ZVKBUR;
           this.PARTNER = PARTNER;
           this.ZBNO_MAIN = ZBNO_MAIN;
           this.ZSUPPLY_TYPE_NO = ZSUPPLY_TYPE_NO;
           this.ZCLCYCLE = ZCLCYCLE;
           this.ZMINSALE_TOTAL = ZMINSALE_TOTAL;
           this.RECNCNBEG = RECNCNBEG;
           this.RECNCNENDABS = RECNCNENDABS;
           this.MVGR1 = MVGR1;
           this.ZMATTAX = ZMATTAX;
    }


    /**
     * Gets the MANDT value for this ZVICNCN.
     * 
     * @return MANDT   * Client
     */
    public java.lang.String getMANDT() {
        return MANDT;
    }


    /**
     * Sets the MANDT value for this ZVICNCN.
     * 
     * @param MANDT   * Client
     */
    public void setMANDT(java.lang.String MANDT) {
        this.MANDT = MANDT;
    }


    /**
     * Gets the RECNNR value for this ZVICNCN.
     * 
     * @return RECNNR
     */
    public java.lang.String getRECNNR() {
        return RECNNR;
    }


    /**
     * Sets the RECNNR value for this ZVICNCN.
     * 
     * @param RECNNR
     */
    public void setRECNNR(java.lang.String RECNNR) {
        this.RECNNR = RECNNR;
    }


    /**
     * Gets the ZVKORG value for this ZVICNCN.
     * 
     * @return ZVKORG   * Sales Organization
     */
    public java.lang.String getZVKORG() {
        return ZVKORG;
    }


    /**
     * Sets the ZVKORG value for this ZVICNCN.
     * 
     * @param ZVKORG   * Sales Organization
     */
    public void setZVKORG(java.lang.String ZVKORG) {
        this.ZVKORG = ZVKORG;
    }


    /**
     * Gets the ZEKGRP value for this ZVICNCN.
     * 
     * @return ZEKGRP   * Purchasing Group
     */
    public java.lang.String getZEKGRP() {
        return ZEKGRP;
    }


    /**
     * Sets the ZEKGRP value for this ZVICNCN.
     * 
     * @param ZEKGRP   * Purchasing Group
     */
    public void setZEKGRP(java.lang.String ZEKGRP) {
        this.ZEKGRP = ZEKGRP;
    }


    /**
     * Gets the ZVKGRP value for this ZVICNCN.
     * 
     * @return ZVKGRP
     */
    public java.lang.String getZVKGRP() {
        return ZVKGRP;
    }


    /**
     * Sets the ZVKGRP value for this ZVICNCN.
     * 
     * @param ZVKGRP
     */
    public void setZVKGRP(java.lang.String ZVKGRP) {
        this.ZVKGRP = ZVKGRP;
    }


    /**
     * Gets the ZVKBUR value for this ZVICNCN.
     * 
     * @return ZVKBUR
     */
    public java.lang.String getZVKBUR() {
        return ZVKBUR;
    }


    /**
     * Sets the ZVKBUR value for this ZVICNCN.
     * 
     * @param ZVKBUR
     */
    public void setZVKBUR(java.lang.String ZVKBUR) {
        this.ZVKBUR = ZVKBUR;
    }


    /**
     * Gets the PARTNER value for this ZVICNCN.
     * 
     * @return PARTNER   * Business Partner Number
     */
    public java.lang.String getPARTNER() {
        return PARTNER;
    }


    /**
     * Sets the PARTNER value for this ZVICNCN.
     * 
     * @param PARTNER   * Business Partner Number
     */
    public void setPARTNER(java.lang.String PARTNER) {
        this.PARTNER = PARTNER;
    }


    /**
     * Gets the ZBNO_MAIN value for this ZVICNCN.
     * 
     * @return ZBNO_MAIN
     */
    public java.lang.String getZBNO_MAIN() {
        return ZBNO_MAIN;
    }


    /**
     * Sets the ZBNO_MAIN value for this ZVICNCN.
     * 
     * @param ZBNO_MAIN
     */
    public void setZBNO_MAIN(java.lang.String ZBNO_MAIN) {
        this.ZBNO_MAIN = ZBNO_MAIN;
    }


    /**
     * Gets the ZSUPPLY_TYPE_NO value for this ZVICNCN.
     * 
     * @return ZSUPPLY_TYPE_NO
     */
    public java.lang.String getZSUPPLY_TYPE_NO() {
        return ZSUPPLY_TYPE_NO;
    }


    /**
     * Sets the ZSUPPLY_TYPE_NO value for this ZVICNCN.
     * 
     * @param ZSUPPLY_TYPE_NO
     */
    public void setZSUPPLY_TYPE_NO(java.lang.String ZSUPPLY_TYPE_NO) {
        this.ZSUPPLY_TYPE_NO = ZSUPPLY_TYPE_NO;
    }


    /**
     * Gets the ZCLCYCLE value for this ZVICNCN.
     * 
     * @return ZCLCYCLE
     */
    public java.lang.String getZCLCYCLE() {
        return ZCLCYCLE;
    }


    /**
     * Sets the ZCLCYCLE value for this ZVICNCN.
     * 
     * @param ZCLCYCLE
     */
    public void setZCLCYCLE(java.lang.String ZCLCYCLE) {
        this.ZCLCYCLE = ZCLCYCLE;
    }


    /**
     * Gets the ZMINSALE_TOTAL value for this ZVICNCN.
     * 
     * @return ZMINSALE_TOTAL
     */
    public java.math.BigDecimal getZMINSALE_TOTAL() {
        return ZMINSALE_TOTAL;
    }


    /**
     * Sets the ZMINSALE_TOTAL value for this ZVICNCN.
     * 
     * @param ZMINSALE_TOTAL
     */
    public void setZMINSALE_TOTAL(java.math.BigDecimal ZMINSALE_TOTAL) {
        this.ZMINSALE_TOTAL = ZMINSALE_TOTAL;
    }


    /**
     * Gets the RECNCNBEG value for this ZVICNCN.
     * 
     * @return RECNCNBEG   * Date of contract start
     */
    public com.esb.jinying.sap.functions.rfc.sap.document.sap_com.Date getRECNCNBEG() {
        return RECNCNBEG;
    }


    /**
     * Sets the RECNCNBEG value for this ZVICNCN.
     * 
     * @param RECNCNBEG   * Date of contract start
     */
    public void setRECNCNBEG(com.esb.jinying.sap.functions.rfc.sap.document.sap_com.Date RECNCNBEG) {
        this.RECNCNBEG = RECNCNBEG;
    }


    /**
     * Gets the RECNCNENDABS value for this ZVICNCN.
     * 
     * @return RECNCNENDABS   * Term End Date
     */
    public com.esb.jinying.sap.functions.rfc.sap.document.sap_com.Date getRECNCNENDABS() {
        return RECNCNENDABS;
    }


    /**
     * Sets the RECNCNENDABS value for this ZVICNCN.
     * 
     * @param RECNCNENDABS   * Term End Date
     */
    public void setRECNCNENDABS(com.esb.jinying.sap.functions.rfc.sap.document.sap_com.Date RECNCNENDABS) {
        this.RECNCNENDABS = RECNCNENDABS;
    }


    /**
     * Gets the MVGR1 value for this ZVICNCN.
     * 
     * @return MVGR1   * Merchandise category 1
     */
    public java.lang.String getMVGR1() {
        return MVGR1;
    }


    /**
     * Sets the MVGR1 value for this ZVICNCN.
     * 
     * @param MVGR1   * Merchandise category 1
     */
    public void setMVGR1(java.lang.String MVGR1) {
        this.MVGR1 = MVGR1;
    }


    /**
     * Gets the ZMATTAX value for this ZVICNCN.
     * 
     * @return ZMATTAX
     */
    public java.lang.String getZMATTAX() {
        return ZMATTAX;
    }


    /**
     * Sets the ZMATTAX value for this ZVICNCN.
     * 
     * @param ZMATTAX
     */
    public void setZMATTAX(java.lang.String ZMATTAX) {
        this.ZMATTAX = ZMATTAX;
    }

    private java.lang.Object __equalsCalc = null;
    public synchronized boolean equals(java.lang.Object obj) {
        if (!(obj instanceof ZVICNCN)) return false;
        ZVICNCN other = (ZVICNCN) obj;
        if (obj == null) return false;
        if (this == obj) return true;
        if (__equalsCalc != null) {
            return (__equalsCalc == obj);
        }
        __equalsCalc = obj;
        boolean _equals;
        _equals = true && 
            ((this.MANDT==null && other.getMANDT()==null) || 
             (this.MANDT!=null &&
              this.MANDT.equals(other.getMANDT()))) &&
            ((this.RECNNR==null && other.getRECNNR()==null) || 
             (this.RECNNR!=null &&
              this.RECNNR.equals(other.getRECNNR()))) &&
            ((this.ZVKORG==null && other.getZVKORG()==null) || 
             (this.ZVKORG!=null &&
              this.ZVKORG.equals(other.getZVKORG()))) &&
            ((this.ZEKGRP==null && other.getZEKGRP()==null) || 
             (this.ZEKGRP!=null &&
              this.ZEKGRP.equals(other.getZEKGRP()))) &&
            ((this.ZVKGRP==null && other.getZVKGRP()==null) || 
             (this.ZVKGRP!=null &&
              this.ZVKGRP.equals(other.getZVKGRP()))) &&
            ((this.ZVKBUR==null && other.getZVKBUR()==null) || 
             (this.ZVKBUR!=null &&
              this.ZVKBUR.equals(other.getZVKBUR()))) &&
            ((this.PARTNER==null && other.getPARTNER()==null) || 
             (this.PARTNER!=null &&
              this.PARTNER.equals(other.getPARTNER()))) &&
            ((this.ZBNO_MAIN==null && other.getZBNO_MAIN()==null) || 
             (this.ZBNO_MAIN!=null &&
              this.ZBNO_MAIN.equals(other.getZBNO_MAIN()))) &&
            ((this.ZSUPPLY_TYPE_NO==null && other.getZSUPPLY_TYPE_NO()==null) || 
             (this.ZSUPPLY_TYPE_NO!=null &&
              this.ZSUPPLY_TYPE_NO.equals(other.getZSUPPLY_TYPE_NO()))) &&
            ((this.ZCLCYCLE==null && other.getZCLCYCLE()==null) || 
             (this.ZCLCYCLE!=null &&
              this.ZCLCYCLE.equals(other.getZCLCYCLE()))) &&
            ((this.ZMINSALE_TOTAL==null && other.getZMINSALE_TOTAL()==null) || 
             (this.ZMINSALE_TOTAL!=null &&
              this.ZMINSALE_TOTAL.equals(other.getZMINSALE_TOTAL()))) &&
            ((this.RECNCNBEG==null && other.getRECNCNBEG()==null) || 
             (this.RECNCNBEG!=null &&
              this.RECNCNBEG.equals(other.getRECNCNBEG()))) &&
            ((this.RECNCNENDABS==null && other.getRECNCNENDABS()==null) || 
             (this.RECNCNENDABS!=null &&
              this.RECNCNENDABS.equals(other.getRECNCNENDABS()))) &&
            ((this.MVGR1==null && other.getMVGR1()==null) || 
             (this.MVGR1!=null &&
              this.MVGR1.equals(other.getMVGR1()))) &&
            ((this.ZMATTAX==null && other.getZMATTAX()==null) || 
             (this.ZMATTAX!=null &&
              this.ZMATTAX.equals(other.getZMATTAX())));
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
        if (getMANDT() != null) {
            _hashCode += getMANDT().hashCode();
        }
        if (getRECNNR() != null) {
            _hashCode += getRECNNR().hashCode();
        }
        if (getZVKORG() != null) {
            _hashCode += getZVKORG().hashCode();
        }
        if (getZEKGRP() != null) {
            _hashCode += getZEKGRP().hashCode();
        }
        if (getZVKGRP() != null) {
            _hashCode += getZVKGRP().hashCode();
        }
        if (getZVKBUR() != null) {
            _hashCode += getZVKBUR().hashCode();
        }
        if (getPARTNER() != null) {
            _hashCode += getPARTNER().hashCode();
        }
        if (getZBNO_MAIN() != null) {
            _hashCode += getZBNO_MAIN().hashCode();
        }
        if (getZSUPPLY_TYPE_NO() != null) {
            _hashCode += getZSUPPLY_TYPE_NO().hashCode();
        }
        if (getZCLCYCLE() != null) {
            _hashCode += getZCLCYCLE().hashCode();
        }
        if (getZMINSALE_TOTAL() != null) {
            _hashCode += getZMINSALE_TOTAL().hashCode();
        }
        if (getRECNCNBEG() != null) {
            _hashCode += getRECNCNBEG().hashCode();
        }
        if (getRECNCNENDABS() != null) {
            _hashCode += getRECNCNENDABS().hashCode();
        }
        if (getMVGR1() != null) {
            _hashCode += getMVGR1().hashCode();
        }
        if (getZMATTAX() != null) {
            _hashCode += getZMATTAX().hashCode();
        }
        __hashCodeCalc = false;
        return _hashCode;
    }

    // Type metadata
    private static org.apache.axis.description.TypeDesc typeDesc =
        new org.apache.axis.description.TypeDesc(ZVICNCN.class, true);

    static {
        typeDesc.setXmlType(new javax.xml.namespace.QName("urn:sap-com:document:sap:rfc:functions", "ZVICNCN"));
        org.apache.axis.description.ElementDesc elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("MANDT");
        elemField.setXmlName(new javax.xml.namespace.QName("", "MANDT"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("RECNNR");
        elemField.setXmlName(new javax.xml.namespace.QName("", "RECNNR"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("ZVKORG");
        elemField.setXmlName(new javax.xml.namespace.QName("", "ZVKORG"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("ZEKGRP");
        elemField.setXmlName(new javax.xml.namespace.QName("", "ZEKGRP"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("ZVKGRP");
        elemField.setXmlName(new javax.xml.namespace.QName("", "ZVKGRP"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("ZVKBUR");
        elemField.setXmlName(new javax.xml.namespace.QName("", "ZVKBUR"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("PARTNER");
        elemField.setXmlName(new javax.xml.namespace.QName("", "PARTNER"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("ZBNO_MAIN");
        elemField.setXmlName(new javax.xml.namespace.QName("", "ZBNO_MAIN"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("ZSUPPLY_TYPE_NO");
        elemField.setXmlName(new javax.xml.namespace.QName("", "ZSUPPLY_TYPE_NO"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("ZCLCYCLE");
        elemField.setXmlName(new javax.xml.namespace.QName("", "ZCLCYCLE"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("ZMINSALE_TOTAL");
        elemField.setXmlName(new javax.xml.namespace.QName("", "ZMINSALE_TOTAL"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "decimal"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("RECNCNBEG");
        elemField.setXmlName(new javax.xml.namespace.QName("", "RECNCNBEG"));
        elemField.setXmlType(new javax.xml.namespace.QName("urn:sap-com:document:sap:rfc:functions", "date"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("RECNCNENDABS");
        elemField.setXmlName(new javax.xml.namespace.QName("", "RECNCNENDABS"));
        elemField.setXmlType(new javax.xml.namespace.QName("urn:sap-com:document:sap:rfc:functions", "date"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("MVGR1");
        elemField.setXmlName(new javax.xml.namespace.QName("", "MVGR1"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("ZMATTAX");
        elemField.setXmlName(new javax.xml.namespace.QName("", "ZMATTAX"));
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
