/**
 * DT_POS010ORDERTENDER.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package com.esb.jinying.sap.dealup.base.pos.ecc;

public class DT_POS010ORDERTENDER  implements java.io.Serializable {
    /* 支付行号 */
    private java.lang.String TENDERNUMBER;

    /* 支付类型 */
    private java.lang.String TENDERTYPECODE;

    /* 支付金额 */
    private java.lang.Double TENDERAMOUNT;

    /* 货币 */
    private java.lang.String TENDERCURRENCY;

    /* NO */
    private java.lang.String ACCOUNTNUMBER;

    public DT_POS010ORDERTENDER() {
    }

    public DT_POS010ORDERTENDER(
           java.lang.String TENDERNUMBER,
           java.lang.String TENDERTYPECODE,
           java.lang.Double TENDERAMOUNT,
           java.lang.String TENDERCURRENCY,
           java.lang.String ACCOUNTNUMBER) {
           this.TENDERNUMBER = TENDERNUMBER;
           this.TENDERTYPECODE = TENDERTYPECODE;
           this.TENDERAMOUNT = TENDERAMOUNT;
           this.TENDERCURRENCY = TENDERCURRENCY;
           this.ACCOUNTNUMBER = ACCOUNTNUMBER;
    }


    /**
     * Gets the TENDERNUMBER value for this DT_POS010ORDERTENDER.
     * 
     * @return TENDERNUMBER   * 支付行号
     */
    public java.lang.String getTENDERNUMBER() {
        return TENDERNUMBER;
    }


    /**
     * Sets the TENDERNUMBER value for this DT_POS010ORDERTENDER.
     * 
     * @param TENDERNUMBER   * 支付行号
     */
    public void setTENDERNUMBER(java.lang.String TENDERNUMBER) {
        this.TENDERNUMBER = TENDERNUMBER;
    }


    /**
     * Gets the TENDERTYPECODE value for this DT_POS010ORDERTENDER.
     * 
     * @return TENDERTYPECODE   * 支付类型
     */
    public java.lang.String getTENDERTYPECODE() {
        return TENDERTYPECODE;
    }


    /**
     * Sets the TENDERTYPECODE value for this DT_POS010ORDERTENDER.
     * 
     * @param TENDERTYPECODE   * 支付类型
     */
    public void setTENDERTYPECODE(java.lang.String TENDERTYPECODE) {
        this.TENDERTYPECODE = TENDERTYPECODE;
    }


    /**
     * Gets the TENDERAMOUNT value for this DT_POS010ORDERTENDER.
     * 
     * @return TENDERAMOUNT   * 支付金额
     */
    public java.lang.Double getTENDERAMOUNT() {
        return TENDERAMOUNT;
    }


    /**
     * Sets the TENDERAMOUNT value for this DT_POS010ORDERTENDER.
     * 
     * @param TENDERAMOUNT   * 支付金额
     */
    public void setTENDERAMOUNT(java.lang.Double TENDERAMOUNT) {
        this.TENDERAMOUNT = TENDERAMOUNT;
    }


    /**
     * Gets the TENDERCURRENCY value for this DT_POS010ORDERTENDER.
     * 
     * @return TENDERCURRENCY   * 货币
     */
    public java.lang.String getTENDERCURRENCY() {
        return TENDERCURRENCY;
    }


    /**
     * Sets the TENDERCURRENCY value for this DT_POS010ORDERTENDER.
     * 
     * @param TENDERCURRENCY   * 货币
     */
    public void setTENDERCURRENCY(java.lang.String TENDERCURRENCY) {
        this.TENDERCURRENCY = TENDERCURRENCY;
    }


    /**
     * Gets the ACCOUNTNUMBER value for this DT_POS010ORDERTENDER.
     * 
     * @return ACCOUNTNUMBER   * NO
     */
    public java.lang.String getACCOUNTNUMBER() {
        return ACCOUNTNUMBER;
    }


    /**
     * Sets the ACCOUNTNUMBER value for this DT_POS010ORDERTENDER.
     * 
     * @param ACCOUNTNUMBER   * NO
     */
    public void setACCOUNTNUMBER(java.lang.String ACCOUNTNUMBER) {
        this.ACCOUNTNUMBER = ACCOUNTNUMBER;
    }

    private java.lang.Object __equalsCalc = null;
    public synchronized boolean equals(java.lang.Object obj) {
        if (!(obj instanceof DT_POS010ORDERTENDER)) return false;
        DT_POS010ORDERTENDER other = (DT_POS010ORDERTENDER) obj;
        if (obj == null) return false;
        if (this == obj) return true;
        if (__equalsCalc != null) {
            return (__equalsCalc == obj);
        }
        __equalsCalc = obj;
        boolean _equals;
        _equals = true && 
            ((this.TENDERNUMBER==null && other.getTENDERNUMBER()==null) || 
             (this.TENDERNUMBER!=null &&
              this.TENDERNUMBER.equals(other.getTENDERNUMBER()))) &&
            ((this.TENDERTYPECODE==null && other.getTENDERTYPECODE()==null) || 
             (this.TENDERTYPECODE!=null &&
              this.TENDERTYPECODE.equals(other.getTENDERTYPECODE()))) &&
            ((this.TENDERAMOUNT==null && other.getTENDERAMOUNT()==null) || 
             (this.TENDERAMOUNT!=null &&
              this.TENDERAMOUNT.equals(other.getTENDERAMOUNT()))) &&
            ((this.TENDERCURRENCY==null && other.getTENDERCURRENCY()==null) || 
             (this.TENDERCURRENCY!=null &&
              this.TENDERCURRENCY.equals(other.getTENDERCURRENCY()))) &&
            ((this.ACCOUNTNUMBER==null && other.getACCOUNTNUMBER()==null) || 
             (this.ACCOUNTNUMBER!=null &&
              this.ACCOUNTNUMBER.equals(other.getACCOUNTNUMBER())));
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
        if (getTENDERNUMBER() != null) {
            _hashCode += getTENDERNUMBER().hashCode();
        }
        if (getTENDERTYPECODE() != null) {
            _hashCode += getTENDERTYPECODE().hashCode();
        }
        if (getTENDERAMOUNT() != null) {
            _hashCode += getTENDERAMOUNT().hashCode();
        }
        if (getTENDERCURRENCY() != null) {
            _hashCode += getTENDERCURRENCY().hashCode();
        }
        if (getACCOUNTNUMBER() != null) {
            _hashCode += getACCOUNTNUMBER().hashCode();
        }
        __hashCodeCalc = false;
        return _hashCode;
    }

    // Type metadata
    private static org.apache.axis.description.TypeDesc typeDesc =
        new org.apache.axis.description.TypeDesc(DT_POS010ORDERTENDER.class, true);

    static {
        typeDesc.setXmlType(new javax.xml.namespace.QName("urn:ecc:pos:base:dealup", ">>DT_POS010>ORDER>TENDER"));
        org.apache.axis.description.ElementDesc elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("TENDERNUMBER");
        elemField.setXmlName(new javax.xml.namespace.QName("", "TENDERNUMBER"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("TENDERTYPECODE");
        elemField.setXmlName(new javax.xml.namespace.QName("", "TENDERTYPECODE"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("TENDERAMOUNT");
        elemField.setXmlName(new javax.xml.namespace.QName("", "TENDERAMOUNT"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "double"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("TENDERCURRENCY");
        elemField.setXmlName(new javax.xml.namespace.QName("", "TENDERCURRENCY"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("ACCOUNTNUMBER");
        elemField.setXmlName(new javax.xml.namespace.QName("", "ACCOUNTNUMBER"));
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
