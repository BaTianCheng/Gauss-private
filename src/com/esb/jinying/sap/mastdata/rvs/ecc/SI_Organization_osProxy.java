package com.esb.jinying.sap.mastdata.rvs.ecc;

public class SI_Organization_osProxy implements com.esb.jinying.sap.mastdata.rvs.ecc.SI_Organization_os {
  private String _endpoint = null;
  private com.esb.jinying.sap.mastdata.rvs.ecc.SI_Organization_os sI_Organization_os = null;
  
  public SI_Organization_osProxy() {
    _initSI_Organization_osProxy();
  }
  
  public SI_Organization_osProxy(String endpoint) {
    _endpoint = endpoint;
    _initSI_Organization_osProxy();
  }
  
  private void _initSI_Organization_osProxy() {
    try {
      sI_Organization_os = (new com.esb.jinying.sap.mastdata.rvs.ecc.XI_0Dd06Aa25D70304Ba8A899814B24C3F2_ServiceLocator()).getHTTP_Port();
      if (sI_Organization_os != null) {
        if (_endpoint != null)
          ((javax.xml.rpc.Stub)sI_Organization_os)._setProperty("javax.xml.rpc.service.endpoint.address", _endpoint);
        else
          _endpoint = (String)((javax.xml.rpc.Stub)sI_Organization_os)._getProperty("javax.xml.rpc.service.endpoint.address");
      }
      
    }
    catch (javax.xml.rpc.ServiceException serviceException) {}
  }
  
  public String getEndpoint() {
    return _endpoint;
  }
  
  public void setEndpoint(String endpoint) {
    _endpoint = endpoint;
    if (sI_Organization_os != null)
      ((javax.xml.rpc.Stub)sI_Organization_os)._setProperty("javax.xml.rpc.service.endpoint.address", _endpoint);
    
  }
  
  public com.esb.jinying.sap.mastdata.rvs.ecc.SI_Organization_os getSI_Organization_os() {
    if (sI_Organization_os == null)
      _initSI_Organization_osProxy();
    return sI_Organization_os;
  }
  
  public com.esb.jinying.sap.mastdata.rvs.ecc.DT_OrganizationRespReturn[] SI_Organization_os(com.esb.jinying.sap.mastdata.rvs.ecc.DT_OrganizationReq MT_OrganizationReq) throws java.rmi.RemoteException{
    if (sI_Organization_os == null)
      _initSI_Organization_osProxy();
    return sI_Organization_os.SI_Organization_os(MT_OrganizationReq);
  }
  
  
}