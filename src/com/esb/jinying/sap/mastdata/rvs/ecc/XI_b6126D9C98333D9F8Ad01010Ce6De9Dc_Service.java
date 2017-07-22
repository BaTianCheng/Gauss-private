/**
 * XI_b6126D9C98333D9F8Ad01010Ce6De9Dc_Service.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package com.esb.jinying.sap.mastdata.rvs.ecc;

public interface XI_b6126D9C98333D9F8Ad01010Ce6De9Dc_Service extends javax.xml.rpc.Service {
    public java.lang.String getHTTP_PortAddress();

    public com.esb.jinying.sap.mastdata.rvs.ecc.SI_BuildingData_os getHTTP_Port() throws javax.xml.rpc.ServiceException;

    public com.esb.jinying.sap.mastdata.rvs.ecc.SI_BuildingData_os getHTTP_Port(java.net.URL portAddress) throws javax.xml.rpc.ServiceException;
    public java.lang.String getHTTPS_PortAddress();

    public com.esb.jinying.sap.mastdata.rvs.ecc.SI_BuildingData_os getHTTPS_Port() throws javax.xml.rpc.ServiceException;

    public com.esb.jinying.sap.mastdata.rvs.ecc.SI_BuildingData_os getHTTPS_Port(java.net.URL portAddress) throws javax.xml.rpc.ServiceException;
}
