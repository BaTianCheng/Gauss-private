/**
 * XI_28Cc3F266A343E528A403D647004Ee37_Service.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package com.esb.jinying.sap.dealup.rf;

public interface XI_28Cc3F266A343E528A403D647004Ee37_Service extends javax.xml.rpc.Service {
    public java.lang.String getHTTP_PortAddress();

    public com.esb.jinying.sap.dealup.rf.SIO_RF getHTTP_Port() throws javax.xml.rpc.ServiceException;

    public com.esb.jinying.sap.dealup.rf.SIO_RF getHTTP_Port(java.net.URL portAddress) throws javax.xml.rpc.ServiceException;
    public java.lang.String getHTTPS_PortAddress();

    public com.esb.jinying.sap.dealup.rf.SIO_RF getHTTPS_Port() throws javax.xml.rpc.ServiceException;

    public com.esb.jinying.sap.dealup.rf.SIO_RF getHTTPS_Port(java.net.URL portAddress) throws javax.xml.rpc.ServiceException;
}
