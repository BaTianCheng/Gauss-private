/**
 * XI_8Fe22B6Afd9E37559B14895F662D5420_Service.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package com.esb.jinying.sap.dealup.k2;

public interface XI_8Fe22B6Afd9E37559B14895F662D5420_Service extends javax.xml.rpc.Service {
    public java.lang.String getHTTP_PortAddress();

    public com.esb.jinying.sap.dealup.k2.SIO_K2 getHTTP_Port() throws javax.xml.rpc.ServiceException;

    public com.esb.jinying.sap.dealup.k2.SIO_K2 getHTTP_Port(java.net.URL portAddress) throws javax.xml.rpc.ServiceException;
    public java.lang.String getHTTPS_PortAddress();

    public com.esb.jinying.sap.dealup.k2.SIO_K2 getHTTPS_Port() throws javax.xml.rpc.ServiceException;

    public com.esb.jinying.sap.dealup.k2.SIO_K2 getHTTPS_Port(java.net.URL portAddress) throws javax.xml.rpc.ServiceException;
}
