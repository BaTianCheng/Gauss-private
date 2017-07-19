/**
 * XI_635B315907723538Ba61Ee4Cb6009B2D_Service.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package com.esb.jinying.sap.dealup.pos;

public interface XI_635B315907723538Ba61Ee4Cb6009B2D_Service extends javax.xml.rpc.Service {
    public java.lang.String getHTTP_PortAddress();

    public com.esb.jinying.sap.dealup.pos.SIO_POS getHTTP_Port() throws javax.xml.rpc.ServiceException;

    public com.esb.jinying.sap.dealup.pos.SIO_POS getHTTP_Port(java.net.URL portAddress) throws javax.xml.rpc.ServiceException;
    public java.lang.String getHTTPS_PortAddress();

    public com.esb.jinying.sap.dealup.pos.SIO_POS getHTTPS_Port() throws javax.xml.rpc.ServiceException;

    public com.esb.jinying.sap.dealup.pos.SIO_POS getHTTPS_Port(java.net.URL portAddress) throws javax.xml.rpc.ServiceException;
}
