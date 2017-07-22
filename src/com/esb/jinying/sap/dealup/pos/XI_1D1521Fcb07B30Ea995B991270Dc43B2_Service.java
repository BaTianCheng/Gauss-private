/**
 * XI_1D1521Fcb07B30Ea995B991270Dc43B2_Service.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package com.esb.jinying.sap.dealup.pos;

public interface XI_1D1521Fcb07B30Ea995B991270Dc43B2_Service extends javax.xml.rpc.Service {
    public java.lang.String getHTTP_PortAddress();

    public com.esb.jinying.sap.dealup.pos.SIO_POS_ECC_ASY getHTTP_Port() throws javax.xml.rpc.ServiceException;

    public com.esb.jinying.sap.dealup.pos.SIO_POS_ECC_ASY getHTTP_Port(java.net.URL portAddress) throws javax.xml.rpc.ServiceException;
    public java.lang.String getHTTPS_PortAddress();

    public com.esb.jinying.sap.dealup.pos.SIO_POS_ECC_ASY getHTTPS_Port() throws javax.xml.rpc.ServiceException;

    public com.esb.jinying.sap.dealup.pos.SIO_POS_ECC_ASY getHTTPS_Port(java.net.URL portAddress) throws javax.xml.rpc.ServiceException;
}
