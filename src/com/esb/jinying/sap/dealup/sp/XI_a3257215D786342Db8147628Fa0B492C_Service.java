/**
 * XI_a3257215D786342Db8147628Fa0B492C_Service.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package com.esb.jinying.sap.dealup.sp;

public interface XI_a3257215D786342Db8147628Fa0B492C_Service extends javax.xml.rpc.Service {
    public java.lang.String getHTTP_PortAddress();

    public com.esb.jinying.sap.dealup.sp.SIO_SP getHTTP_Port() throws javax.xml.rpc.ServiceException;

    public com.esb.jinying.sap.dealup.sp.SIO_SP getHTTP_Port(java.net.URL portAddress) throws javax.xml.rpc.ServiceException;
    public java.lang.String getHTTPS_PortAddress();

    public com.esb.jinying.sap.dealup.sp.SIO_SP getHTTPS_Port() throws javax.xml.rpc.ServiceException;

    public com.esb.jinying.sap.dealup.sp.SIO_SP getHTTPS_Port(java.net.URL portAddress) throws javax.xml.rpc.ServiceException;
}
