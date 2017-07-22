package com.esb.jinying.sap.mastdata.rvs.ecc;

public class SI_Department_osProxy implements com.esb.jinying.sap.mastdata.rvs.ecc.SI_Department_os {
  private String _endpoint = null;
  private com.esb.jinying.sap.mastdata.rvs.ecc.SI_Department_os sI_Department_os = null;
  
  public SI_Department_osProxy() {
    _initSI_Department_osProxy();
  }
  
  public SI_Department_osProxy(String endpoint) {
    _endpoint = endpoint;
    _initSI_Department_osProxy();
  }
  
  private void _initSI_Department_osProxy() {
    try {
      sI_Department_os = (new com.esb.jinying.sap.mastdata.rvs.ecc.XI_394737D733F43D81Af326D3A5Cfd8Aa9_ServiceLocator()).getHTTP_Port();
      if (sI_Department_os != null) {
        if (_endpoint != null)
          ((javax.xml.rpc.Stub)sI_Department_os)._setProperty("javax.xml.rpc.service.endpoint.address", _endpoint);
        else
          _endpoint = (String)((javax.xml.rpc.Stub)sI_Department_os)._getProperty("javax.xml.rpc.service.endpoint.address");
      }
      
    }
    catch (javax.xml.rpc.ServiceException serviceException) {}
  }
  
  public String getEndpoint() {
    return _endpoint;
  }
  
  public void setEndpoint(String endpoint) {
    _endpoint = endpoint;
    if (sI_Department_os != null)
      ((javax.xml.rpc.Stub)sI_Department_os)._setProperty("javax.xml.rpc.service.endpoint.address", _endpoint);
    
  }
  
  public com.esb.jinying.sap.mastdata.rvs.ecc.SI_Department_os getSI_Department_os() {
    if (sI_Department_os == null)
      _initSI_Department_osProxy();
    return sI_Department_os;
  }
  
  public com.esb.jinying.sap.mastdata.rvs.ecc.DT_DepartmentRespReturn[] SI_Department_os(com.esb.jinying.sap.mastdata.rvs.ecc.DT_DepartmentReq MT_DepartmentReq) throws java.rmi.RemoteException{
    if (sI_Department_os == null)
      _initSI_Department_osProxy();
    return sI_Department_os.SI_Department_os(MT_DepartmentReq);
  }
  
  
}