/**
 * DT_FloorRespReturn.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package com.esb.jinying.sap.mastdata.rvs.ecc;

public class DT_FloorRespReturn  implements java.io.Serializable {
    /* 不动产对象的内部代码 */
    private java.lang.String INTRENO;

    /* 公司代码 */
    private java.lang.String BUKRS;

    /* 商业实体编号 */
    private java.lang.String SWENR;

    /* 建筑物的编号 */
    private java.lang.String SGENR;

    /* 租赁对象编号 */
    private java.lang.String SMENR;

    /* 租赁对象类型 */
    private java.lang.String ROTYPE;

    /* 租赁对象名称 */
    private java.lang.String XMETXT;

    /* 部分建筑 */
    private java.lang.String SGEBT;

    /* 部分建筑的短名 */
    private java.lang.String XGEBK;

    /* 楼层 */
    private java.lang.String SSTOCKW;

    /* 长楼层描述 */
    private java.lang.String XSTOCKL;

    public DT_FloorRespReturn() {
    }

    public DT_FloorRespReturn(
           java.lang.String INTRENO,
           java.lang.String BUKRS,
           java.lang.String SWENR,
           java.lang.String SGENR,
           java.lang.String SMENR,
           java.lang.String ROTYPE,
           java.lang.String XMETXT,
           java.lang.String SGEBT,
           java.lang.String XGEBK,
           java.lang.String SSTOCKW,
           java.lang.String XSTOCKL) {
           this.INTRENO = INTRENO;
           this.BUKRS = BUKRS;
           this.SWENR = SWENR;
           this.SGENR = SGENR;
           this.SMENR = SMENR;
           this.ROTYPE = ROTYPE;
           this.XMETXT = XMETXT;
           this.SGEBT = SGEBT;
           this.XGEBK = XGEBK;
           this.SSTOCKW = SSTOCKW;
           this.XSTOCKL = XSTOCKL;
    }


    /**
     * Gets the INTRENO value for this DT_FloorRespReturn.
     * 
     * @return INTRENO   * 不动产对象的内部代码
     */
    public java.lang.String getINTRENO() {
        return INTRENO;
    }


    /**
     * Sets the INTRENO value for this DT_FloorRespReturn.
     * 
     * @param INTRENO   * 不动产对象的内部代码
     */
    public void setINTRENO(java.lang.String INTRENO) {
        this.INTRENO = INTRENO;
    }


    /**
     * Gets the BUKRS value for this DT_FloorRespReturn.
     * 
     * @return BUKRS   * 公司代码
     */
    public java.lang.String getBUKRS() {
        return BUKRS;
    }


    /**
     * Sets the BUKRS value for this DT_FloorRespReturn.
     * 
     * @param BUKRS   * 公司代码
     */
    public void setBUKRS(java.lang.String BUKRS) {
        this.BUKRS = BUKRS;
    }


    /**
     * Gets the SWENR value for this DT_FloorRespReturn.
     * 
     * @return SWENR   * 商业实体编号
     */
    public java.lang.String getSWENR() {
        return SWENR;
    }


    /**
     * Sets the SWENR value for this DT_FloorRespReturn.
     * 
     * @param SWENR   * 商业实体编号
     */
    public void setSWENR(java.lang.String SWENR) {
        this.SWENR = SWENR;
    }


    /**
     * Gets the SGENR value for this DT_FloorRespReturn.
     * 
     * @return SGENR   * 建筑物的编号
     */
    public java.lang.String getSGENR() {
        return SGENR;
    }


    /**
     * Sets the SGENR value for this DT_FloorRespReturn.
     * 
     * @param SGENR   * 建筑物的编号
     */
    public void setSGENR(java.lang.String SGENR) {
        this.SGENR = SGENR;
    }


    /**
     * Gets the SMENR value for this DT_FloorRespReturn.
     * 
     * @return SMENR   * 租赁对象编号
     */
    public java.lang.String getSMENR() {
        return SMENR;
    }


    /**
     * Sets the SMENR value for this DT_FloorRespReturn.
     * 
     * @param SMENR   * 租赁对象编号
     */
    public void setSMENR(java.lang.String SMENR) {
        this.SMENR = SMENR;
    }


    /**
     * Gets the ROTYPE value for this DT_FloorRespReturn.
     * 
     * @return ROTYPE   * 租赁对象类型
     */
    public java.lang.String getROTYPE() {
        return ROTYPE;
    }


    /**
     * Sets the ROTYPE value for this DT_FloorRespReturn.
     * 
     * @param ROTYPE   * 租赁对象类型
     */
    public void setROTYPE(java.lang.String ROTYPE) {
        this.ROTYPE = ROTYPE;
    }


    /**
     * Gets the XMETXT value for this DT_FloorRespReturn.
     * 
     * @return XMETXT   * 租赁对象名称
     */
    public java.lang.String getXMETXT() {
        return XMETXT;
    }


    /**
     * Sets the XMETXT value for this DT_FloorRespReturn.
     * 
     * @param XMETXT   * 租赁对象名称
     */
    public void setXMETXT(java.lang.String XMETXT) {
        this.XMETXT = XMETXT;
    }


    /**
     * Gets the SGEBT value for this DT_FloorRespReturn.
     * 
     * @return SGEBT   * 部分建筑
     */
    public java.lang.String getSGEBT() {
        return SGEBT;
    }


    /**
     * Sets the SGEBT value for this DT_FloorRespReturn.
     * 
     * @param SGEBT   * 部分建筑
     */
    public void setSGEBT(java.lang.String SGEBT) {
        this.SGEBT = SGEBT;
    }


    /**
     * Gets the XGEBK value for this DT_FloorRespReturn.
     * 
     * @return XGEBK   * 部分建筑的短名
     */
    public java.lang.String getXGEBK() {
        return XGEBK;
    }


    /**
     * Sets the XGEBK value for this DT_FloorRespReturn.
     * 
     * @param XGEBK   * 部分建筑的短名
     */
    public void setXGEBK(java.lang.String XGEBK) {
        this.XGEBK = XGEBK;
    }


    /**
     * Gets the SSTOCKW value for this DT_FloorRespReturn.
     * 
     * @return SSTOCKW   * 楼层
     */
    public java.lang.String getSSTOCKW() {
        return SSTOCKW;
    }


    /**
     * Sets the SSTOCKW value for this DT_FloorRespReturn.
     * 
     * @param SSTOCKW   * 楼层
     */
    public void setSSTOCKW(java.lang.String SSTOCKW) {
        this.SSTOCKW = SSTOCKW;
    }


    /**
     * Gets the XSTOCKL value for this DT_FloorRespReturn.
     * 
     * @return XSTOCKL   * 长楼层描述
     */
    public java.lang.String getXSTOCKL() {
        return XSTOCKL;
    }


    /**
     * Sets the XSTOCKL value for this DT_FloorRespReturn.
     * 
     * @param XSTOCKL   * 长楼层描述
     */
    public void setXSTOCKL(java.lang.String XSTOCKL) {
        this.XSTOCKL = XSTOCKL;
    }

    private java.lang.Object __equalsCalc = null;
    public synchronized boolean equals(java.lang.Object obj) {
        if (!(obj instanceof DT_FloorRespReturn)) return false;
        DT_FloorRespReturn other = (DT_FloorRespReturn) obj;
        if (obj == null) return false;
        if (this == obj) return true;
        if (__equalsCalc != null) {
            return (__equalsCalc == obj);
        }
        __equalsCalc = obj;
        boolean _equals;
        _equals = true && 
            ((this.INTRENO==null && other.getINTRENO()==null) || 
             (this.INTRENO!=null &&
              this.INTRENO.equals(other.getINTRENO()))) &&
            ((this.BUKRS==null && other.getBUKRS()==null) || 
             (this.BUKRS!=null &&
              this.BUKRS.equals(other.getBUKRS()))) &&
            ((this.SWENR==null && other.getSWENR()==null) || 
             (this.SWENR!=null &&
              this.SWENR.equals(other.getSWENR()))) &&
            ((this.SGENR==null && other.getSGENR()==null) || 
             (this.SGENR!=null &&
              this.SGENR.equals(other.getSGENR()))) &&
            ((this.SMENR==null && other.getSMENR()==null) || 
             (this.SMENR!=null &&
              this.SMENR.equals(other.getSMENR()))) &&
            ((this.ROTYPE==null && other.getROTYPE()==null) || 
             (this.ROTYPE!=null &&
              this.ROTYPE.equals(other.getROTYPE()))) &&
            ((this.XMETXT==null && other.getXMETXT()==null) || 
             (this.XMETXT!=null &&
              this.XMETXT.equals(other.getXMETXT()))) &&
            ((this.SGEBT==null && other.getSGEBT()==null) || 
             (this.SGEBT!=null &&
              this.SGEBT.equals(other.getSGEBT()))) &&
            ((this.XGEBK==null && other.getXGEBK()==null) || 
             (this.XGEBK!=null &&
              this.XGEBK.equals(other.getXGEBK()))) &&
            ((this.SSTOCKW==null && other.getSSTOCKW()==null) || 
             (this.SSTOCKW!=null &&
              this.SSTOCKW.equals(other.getSSTOCKW()))) &&
            ((this.XSTOCKL==null && other.getXSTOCKL()==null) || 
             (this.XSTOCKL!=null &&
              this.XSTOCKL.equals(other.getXSTOCKL())));
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
        if (getINTRENO() != null) {
            _hashCode += getINTRENO().hashCode();
        }
        if (getBUKRS() != null) {
            _hashCode += getBUKRS().hashCode();
        }
        if (getSWENR() != null) {
            _hashCode += getSWENR().hashCode();
        }
        if (getSGENR() != null) {
            _hashCode += getSGENR().hashCode();
        }
        if (getSMENR() != null) {
            _hashCode += getSMENR().hashCode();
        }
        if (getROTYPE() != null) {
            _hashCode += getROTYPE().hashCode();
        }
        if (getXMETXT() != null) {
            _hashCode += getXMETXT().hashCode();
        }
        if (getSGEBT() != null) {
            _hashCode += getSGEBT().hashCode();
        }
        if (getXGEBK() != null) {
            _hashCode += getXGEBK().hashCode();
        }
        if (getSSTOCKW() != null) {
            _hashCode += getSSTOCKW().hashCode();
        }
        if (getXSTOCKL() != null) {
            _hashCode += getXSTOCKL().hashCode();
        }
        __hashCodeCalc = false;
        return _hashCode;
    }

    // Type metadata
    private static org.apache.axis.description.TypeDesc typeDesc =
        new org.apache.axis.description.TypeDesc(DT_FloorRespReturn.class, true);

    static {
        typeDesc.setXmlType(new javax.xml.namespace.QName("urn:ecc:rvs:mastdata", ">DT_FloorResp>return"));
        org.apache.axis.description.ElementDesc elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("INTRENO");
        elemField.setXmlName(new javax.xml.namespace.QName("", "INTRENO"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("BUKRS");
        elemField.setXmlName(new javax.xml.namespace.QName("", "BUKRS"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("SWENR");
        elemField.setXmlName(new javax.xml.namespace.QName("", "SWENR"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("SGENR");
        elemField.setXmlName(new javax.xml.namespace.QName("", "SGENR"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("SMENR");
        elemField.setXmlName(new javax.xml.namespace.QName("", "SMENR"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("ROTYPE");
        elemField.setXmlName(new javax.xml.namespace.QName("", "ROTYPE"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("XMETXT");
        elemField.setXmlName(new javax.xml.namespace.QName("", "XMETXT"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("SGEBT");
        elemField.setXmlName(new javax.xml.namespace.QName("", "SGEBT"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("XGEBK");
        elemField.setXmlName(new javax.xml.namespace.QName("", "XGEBK"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("SSTOCKW");
        elemField.setXmlName(new javax.xml.namespace.QName("", "SSTOCKW"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("XSTOCKL");
        elemField.setXmlName(new javax.xml.namespace.QName("", "XSTOCKL"));
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
