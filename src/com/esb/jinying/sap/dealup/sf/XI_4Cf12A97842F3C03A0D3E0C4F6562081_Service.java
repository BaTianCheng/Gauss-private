/**
 * XI_4Cf12A97842F3C03A0D3E0C4F6562081_Service.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package com.esb.jinying.sap.dealup.sf;

public interface XI_4Cf12A97842F3C03A0D3E0C4F6562081_Service extends javax.xml.rpc.Service {
    public java.lang.String getHTTP_PortAddress();

    public com.esb.jinying.sap.dealup.sf.SIO_SF getHTTP_Port() throws javax.xml.rpc.ServiceException;

    public com.esb.jinying.sap.dealup.sf.SIO_SF getHTTP_Port(java.net.URL portAddress) throws javax.xml.rpc.ServiceException;
    public java.lang.String getHTTPS_PortAddress();

    public com.esb.jinying.sap.dealup.sf.SIO_SF getHTTPS_Port() throws javax.xml.rpc.ServiceException;

    public com.esb.jinying.sap.dealup.sf.SIO_SF getHTTPS_Port(java.net.URL portAddress) throws javax.xml.rpc.ServiceException;
}
