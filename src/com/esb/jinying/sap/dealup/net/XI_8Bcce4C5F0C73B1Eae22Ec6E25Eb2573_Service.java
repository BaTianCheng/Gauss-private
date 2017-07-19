/**
 * XI_8Bcce4C5F0C73B1Eae22Ec6E25Eb2573_Service.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package com.esb.jinying.sap.dealup.net;

public interface XI_8Bcce4C5F0C73B1Eae22Ec6E25Eb2573_Service extends javax.xml.rpc.Service {
    public java.lang.String getHTTP_PortAddress();

    public com.esb.jinying.sap.dealup.net.SIO_NET getHTTP_Port() throws javax.xml.rpc.ServiceException;

    public com.esb.jinying.sap.dealup.net.SIO_NET getHTTP_Port(java.net.URL portAddress) throws javax.xml.rpc.ServiceException;
    public java.lang.String getHTTPS_PortAddress();

    public com.esb.jinying.sap.dealup.net.SIO_NET getHTTPS_Port() throws javax.xml.rpc.ServiceException;

    public com.esb.jinying.sap.dealup.net.SIO_NET getHTTPS_Port(java.net.URL portAddress) throws javax.xml.rpc.ServiceException;
}
