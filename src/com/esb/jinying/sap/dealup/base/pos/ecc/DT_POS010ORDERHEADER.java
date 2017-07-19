/**
 * DT_POS010ORDERHEADER.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package com.esb.jinying.sap.dealup.base.pos.ecc;

public class DT_POS010ORDERHEADER  implements java.io.Serializable {
    /* 地点 */
    private java.lang.String RETAILSTOREID;

    /* 日期 */
    private java.lang.String BUSINESSDAYDATE;

    /* POS机 */
    private java.lang.String WORKSTATIONID;

    /* 小票号码 */
    private java.lang.String TRANSNUMBER;

    /* 开始时间 */
    private java.lang.String BEGINTIMESTAMP;

    /* 结束时间 */
    private java.lang.String ENDTIMESTAMP;

    /* 会员卡号 */
    private java.lang.String OPERATORID;

    /* 货币 */
    private java.lang.String TRANSCURRENCY;

    /* 取消小票标记 */
    private java.lang.String NONCOMPFLAG;

    /* 员工号 */
    private java.lang.String PARTNERID;

    /* 行项目 */
    private com.esb.jinying.sap.dealup.base.pos.ecc.DT_POS010ORDERHEADERITEMS[] ITEMS;

    public DT_POS010ORDERHEADER() {
    }

    public DT_POS010ORDERHEADER(
           java.lang.String RETAILSTOREID,
           java.lang.String BUSINESSDAYDATE,
           java.lang.String WORKSTATIONID,
           java.lang.String TRANSNUMBER,
           java.lang.String BEGINTIMESTAMP,
           java.lang.String ENDTIMESTAMP,
           java.lang.String OPERATORID,
           java.lang.String TRANSCURRENCY,
           java.lang.String NONCOMPFLAG,
           java.lang.String PARTNERID,
           com.esb.jinying.sap.dealup.base.pos.ecc.DT_POS010ORDERHEADERITEMS[] ITEMS) {
           this.RETAILSTOREID = RETAILSTOREID;
           this.BUSINESSDAYDATE = BUSINESSDAYDATE;
           this.WORKSTATIONID = WORKSTATIONID;
           this.TRANSNUMBER = TRANSNUMBER;
           this.BEGINTIMESTAMP = BEGINTIMESTAMP;
           this.ENDTIMESTAMP = ENDTIMESTAMP;
           this.OPERATORID = OPERATORID;
           this.TRANSCURRENCY = TRANSCURRENCY;
           this.NONCOMPFLAG = NONCOMPFLAG;
           this.PARTNERID = PARTNERID;
           this.ITEMS = ITEMS;
    }


    /**
     * Gets the RETAILSTOREID value for this DT_POS010ORDERHEADER.
     * 
     * @return RETAILSTOREID   * 地点
     */
    public java.lang.String getRETAILSTOREID() {
        return RETAILSTOREID;
    }


    /**
     * Sets the RETAILSTOREID value for this DT_POS010ORDERHEADER.
     * 
     * @param RETAILSTOREID   * 地点
     */
    public void setRETAILSTOREID(java.lang.String RETAILSTOREID) {
        this.RETAILSTOREID = RETAILSTOREID;
    }


    /**
     * Gets the BUSINESSDAYDATE value for this DT_POS010ORDERHEADER.
     * 
     * @return BUSINESSDAYDATE   * 日期
     */
    public java.lang.String getBUSINESSDAYDATE() {
        return BUSINESSDAYDATE;
    }


    /**
     * Sets the BUSINESSDAYDATE value for this DT_POS010ORDERHEADER.
     * 
     * @param BUSINESSDAYDATE   * 日期
     */
    public void setBUSINESSDAYDATE(java.lang.String BUSINESSDAYDATE) {
        this.BUSINESSDAYDATE = BUSINESSDAYDATE;
    }


    /**
     * Gets the WORKSTATIONID value for this DT_POS010ORDERHEADER.
     * 
     * @return WORKSTATIONID   * POS机
     */
    public java.lang.String getWORKSTATIONID() {
        return WORKSTATIONID;
    }


    /**
     * Sets the WORKSTATIONID value for this DT_POS010ORDERHEADER.
     * 
     * @param WORKSTATIONID   * POS机
     */
    public void setWORKSTATIONID(java.lang.String WORKSTATIONID) {
        this.WORKSTATIONID = WORKSTATIONID;
    }


    /**
     * Gets the TRANSNUMBER value for this DT_POS010ORDERHEADER.
     * 
     * @return TRANSNUMBER   * 小票号码
     */
    public java.lang.String getTRANSNUMBER() {
        return TRANSNUMBER;
    }


    /**
     * Sets the TRANSNUMBER value for this DT_POS010ORDERHEADER.
     * 
     * @param TRANSNUMBER   * 小票号码
     */
    public void setTRANSNUMBER(java.lang.String TRANSNUMBER) {
        this.TRANSNUMBER = TRANSNUMBER;
    }


    /**
     * Gets the BEGINTIMESTAMP value for this DT_POS010ORDERHEADER.
     * 
     * @return BEGINTIMESTAMP   * 开始时间
     */
    public java.lang.String getBEGINTIMESTAMP() {
        return BEGINTIMESTAMP;
    }


    /**
     * Sets the BEGINTIMESTAMP value for this DT_POS010ORDERHEADER.
     * 
     * @param BEGINTIMESTAMP   * 开始时间
     */
    public void setBEGINTIMESTAMP(java.lang.String BEGINTIMESTAMP) {
        this.BEGINTIMESTAMP = BEGINTIMESTAMP;
    }


    /**
     * Gets the ENDTIMESTAMP value for this DT_POS010ORDERHEADER.
     * 
     * @return ENDTIMESTAMP   * 结束时间
     */
    public java.lang.String getENDTIMESTAMP() {
        return ENDTIMESTAMP;
    }


    /**
     * Sets the ENDTIMESTAMP value for this DT_POS010ORDERHEADER.
     * 
     * @param ENDTIMESTAMP   * 结束时间
     */
    public void setENDTIMESTAMP(java.lang.String ENDTIMESTAMP) {
        this.ENDTIMESTAMP = ENDTIMESTAMP;
    }


    /**
     * Gets the OPERATORID value for this DT_POS010ORDERHEADER.
     * 
     * @return OPERATORID   * 会员卡号
     */
    public java.lang.String getOPERATORID() {
        return OPERATORID;
    }


    /**
     * Sets the OPERATORID value for this DT_POS010ORDERHEADER.
     * 
     * @param OPERATORID   * 会员卡号
     */
    public void setOPERATORID(java.lang.String OPERATORID) {
        this.OPERATORID = OPERATORID;
    }


    /**
     * Gets the TRANSCURRENCY value for this DT_POS010ORDERHEADER.
     * 
     * @return TRANSCURRENCY   * 货币
     */
    public java.lang.String getTRANSCURRENCY() {
        return TRANSCURRENCY;
    }


    /**
     * Sets the TRANSCURRENCY value for this DT_POS010ORDERHEADER.
     * 
     * @param TRANSCURRENCY   * 货币
     */
    public void setTRANSCURRENCY(java.lang.String TRANSCURRENCY) {
        this.TRANSCURRENCY = TRANSCURRENCY;
    }


    /**
     * Gets the NONCOMPFLAG value for this DT_POS010ORDERHEADER.
     * 
     * @return NONCOMPFLAG   * 取消小票标记
     */
    public java.lang.String getNONCOMPFLAG() {
        return NONCOMPFLAG;
    }


    /**
     * Sets the NONCOMPFLAG value for this DT_POS010ORDERHEADER.
     * 
     * @param NONCOMPFLAG   * 取消小票标记
     */
    public void setNONCOMPFLAG(java.lang.String NONCOMPFLAG) {
        this.NONCOMPFLAG = NONCOMPFLAG;
    }


    /**
     * Gets the PARTNERID value for this DT_POS010ORDERHEADER.
     * 
     * @return PARTNERID   * 员工号
     */
    public java.lang.String getPARTNERID() {
        return PARTNERID;
    }


    /**
     * Sets the PARTNERID value for this DT_POS010ORDERHEADER.
     * 
     * @param PARTNERID   * 员工号
     */
    public void setPARTNERID(java.lang.String PARTNERID) {
        this.PARTNERID = PARTNERID;
    }


    /**
     * Gets the ITEMS value for this DT_POS010ORDERHEADER.
     * 
     * @return ITEMS   * 行项目
     */
    public com.esb.jinying.sap.dealup.base.pos.ecc.DT_POS010ORDERHEADERITEMS[] getITEMS() {
        return ITEMS;
    }


    /**
     * Sets the ITEMS value for this DT_POS010ORDERHEADER.
     * 
     * @param ITEMS   * 行项目
     */
    public void setITEMS(com.esb.jinying.sap.dealup.base.pos.ecc.DT_POS010ORDERHEADERITEMS[] ITEMS) {
        this.ITEMS = ITEMS;
    }

    public com.esb.jinying.sap.dealup.base.pos.ecc.DT_POS010ORDERHEADERITEMS getITEMS(int i) {
        return this.ITEMS[i];
    }

    public void setITEMS(int i, com.esb.jinying.sap.dealup.base.pos.ecc.DT_POS010ORDERHEADERITEMS _value) {
        this.ITEMS[i] = _value;
    }

    private java.lang.Object __equalsCalc = null;
    public synchronized boolean equals(java.lang.Object obj) {
        if (!(obj instanceof DT_POS010ORDERHEADER)) return false;
        DT_POS010ORDERHEADER other = (DT_POS010ORDERHEADER) obj;
        if (obj == null) return false;
        if (this == obj) return true;
        if (__equalsCalc != null) {
            return (__equalsCalc == obj);
        }
        __equalsCalc = obj;
        boolean _equals;
        _equals = true && 
            ((this.RETAILSTOREID==null && other.getRETAILSTOREID()==null) || 
             (this.RETAILSTOREID!=null &&
              this.RETAILSTOREID.equals(other.getRETAILSTOREID()))) &&
            ((this.BUSINESSDAYDATE==null && other.getBUSINESSDAYDATE()==null) || 
             (this.BUSINESSDAYDATE!=null &&
              this.BUSINESSDAYDATE.equals(other.getBUSINESSDAYDATE()))) &&
            ((this.WORKSTATIONID==null && other.getWORKSTATIONID()==null) || 
             (this.WORKSTATIONID!=null &&
              this.WORKSTATIONID.equals(other.getWORKSTATIONID()))) &&
            ((this.TRANSNUMBER==null && other.getTRANSNUMBER()==null) || 
             (this.TRANSNUMBER!=null &&
              this.TRANSNUMBER.equals(other.getTRANSNUMBER()))) &&
            ((this.BEGINTIMESTAMP==null && other.getBEGINTIMESTAMP()==null) || 
             (this.BEGINTIMESTAMP!=null &&
              this.BEGINTIMESTAMP.equals(other.getBEGINTIMESTAMP()))) &&
            ((this.ENDTIMESTAMP==null && other.getENDTIMESTAMP()==null) || 
             (this.ENDTIMESTAMP!=null &&
              this.ENDTIMESTAMP.equals(other.getENDTIMESTAMP()))) &&
            ((this.OPERATORID==null && other.getOPERATORID()==null) || 
             (this.OPERATORID!=null &&
              this.OPERATORID.equals(other.getOPERATORID()))) &&
            ((this.TRANSCURRENCY==null && other.getTRANSCURRENCY()==null) || 
             (this.TRANSCURRENCY!=null &&
              this.TRANSCURRENCY.equals(other.getTRANSCURRENCY()))) &&
            ((this.NONCOMPFLAG==null && other.getNONCOMPFLAG()==null) || 
             (this.NONCOMPFLAG!=null &&
              this.NONCOMPFLAG.equals(other.getNONCOMPFLAG()))) &&
            ((this.PARTNERID==null && other.getPARTNERID()==null) || 
             (this.PARTNERID!=null &&
              this.PARTNERID.equals(other.getPARTNERID()))) &&
            ((this.ITEMS==null && other.getITEMS()==null) || 
             (this.ITEMS!=null &&
              java.util.Arrays.equals(this.ITEMS, other.getITEMS())));
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
        if (getRETAILSTOREID() != null) {
            _hashCode += getRETAILSTOREID().hashCode();
        }
        if (getBUSINESSDAYDATE() != null) {
            _hashCode += getBUSINESSDAYDATE().hashCode();
        }
        if (getWORKSTATIONID() != null) {
            _hashCode += getWORKSTATIONID().hashCode();
        }
        if (getTRANSNUMBER() != null) {
            _hashCode += getTRANSNUMBER().hashCode();
        }
        if (getBEGINTIMESTAMP() != null) {
            _hashCode += getBEGINTIMESTAMP().hashCode();
        }
        if (getENDTIMESTAMP() != null) {
            _hashCode += getENDTIMESTAMP().hashCode();
        }
        if (getOPERATORID() != null) {
            _hashCode += getOPERATORID().hashCode();
        }
        if (getTRANSCURRENCY() != null) {
            _hashCode += getTRANSCURRENCY().hashCode();
        }
        if (getNONCOMPFLAG() != null) {
            _hashCode += getNONCOMPFLAG().hashCode();
        }
        if (getPARTNERID() != null) {
            _hashCode += getPARTNERID().hashCode();
        }
        if (getITEMS() != null) {
            for (int i=0;
                 i<java.lang.reflect.Array.getLength(getITEMS());
                 i++) {
                java.lang.Object obj = java.lang.reflect.Array.get(getITEMS(), i);
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
        new org.apache.axis.description.TypeDesc(DT_POS010ORDERHEADER.class, true);

    static {
        typeDesc.setXmlType(new javax.xml.namespace.QName("urn:ecc:pos:base:dealup", ">>DT_POS010>ORDER>HEADER"));
        org.apache.axis.description.ElementDesc elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("RETAILSTOREID");
        elemField.setXmlName(new javax.xml.namespace.QName("", "RETAILSTOREID"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("BUSINESSDAYDATE");
        elemField.setXmlName(new javax.xml.namespace.QName("", "BUSINESSDAYDATE"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("WORKSTATIONID");
        elemField.setXmlName(new javax.xml.namespace.QName("", "WORKSTATIONID"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("TRANSNUMBER");
        elemField.setXmlName(new javax.xml.namespace.QName("", "TRANSNUMBER"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("BEGINTIMESTAMP");
        elemField.setXmlName(new javax.xml.namespace.QName("", "BEGINTIMESTAMP"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("ENDTIMESTAMP");
        elemField.setXmlName(new javax.xml.namespace.QName("", "ENDTIMESTAMP"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("OPERATORID");
        elemField.setXmlName(new javax.xml.namespace.QName("", "OPERATORID"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("TRANSCURRENCY");
        elemField.setXmlName(new javax.xml.namespace.QName("", "TRANSCURRENCY"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("NONCOMPFLAG");
        elemField.setXmlName(new javax.xml.namespace.QName("", "NONCOMPFLAG"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("PARTNERID");
        elemField.setXmlName(new javax.xml.namespace.QName("", "PARTNERID"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("ITEMS");
        elemField.setXmlName(new javax.xml.namespace.QName("", "ITEMS"));
        elemField.setXmlType(new javax.xml.namespace.QName("urn:ecc:pos:base:dealup", ">>>DT_POS010>ORDER>HEADER>ITEMS"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        elemField.setMaxOccursUnbounded(true);
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
