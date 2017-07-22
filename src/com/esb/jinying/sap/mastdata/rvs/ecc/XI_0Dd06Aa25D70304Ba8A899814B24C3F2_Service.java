/**
 * XI_0Dd06Aa25D70304Ba8A899814B24C3F2_Service.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package com.esb.jinying.sap.mastdata.rvs.ecc;

public interface XI_0Dd06Aa25D70304Ba8A899814B24C3F2_Service extends javax.xml.rpc.Service {
    public java.lang.String getHTTP_PortAddress();

    public com.esb.jinying.sap.mastdata.rvs.ecc.SI_Organization_os getHTTP_Port() throws javax.xml.rpc.ServiceException;

    public com.esb.jinying.sap.mastdata.rvs.ecc.SI_Organization_os getHTTP_Port(java.net.URL portAddress) throws javax.xml.rpc.ServiceException;
    public java.lang.String getHTTPS_PortAddress();

    public com.esb.jinying.sap.mastdata.rvs.ecc.SI_Organization_os getHTTPS_Port() throws javax.xml.rpc.ServiceException;

    public com.esb.jinying.sap.mastdata.rvs.ecc.SI_Organization_os getHTTPS_Port(java.net.URL portAddress) throws javax.xml.rpc.ServiceException;
}
