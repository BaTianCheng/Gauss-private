package com.esb.jinying.sap.mastdata.rvs.ecc;

public class SI_RSSearch_osProxy implements com.esb.jinying.sap.mastdata.rvs.ecc.SI_RSSearch_os {
  private String _endpoint = null;
  private com.esb.jinying.sap.mastdata.rvs.ecc.SI_RSSearch_os sI_RSSearch_os = null;
  
  public SI_RSSearch_osProxy() {
    _initSI_RSSearch_osProxy();
  }
  
  public SI_RSSearch_osProxy(String endpoint) {
    _endpoint = endpoint;
    _initSI_RSSearch_osProxy();
  }
  
  private void _initSI_RSSearch_osProxy() {
    try {
      sI_RSSearch_os = (new com.esb.jinying.sap.mastdata.rvs.ecc.XI_39Cd528E0Ff7369882F3B38C1210D6F8_ServiceLocator()).getHTTP_Port();
      if (sI_RSSearch_os != null) {
        if (_endpoint != null)
          ((javax.xml.rpc.Stub)sI_RSSearch_os)._setProperty("javax.xml.rpc.service.endpoint.address", _endpoint);
        else
          _endpoint = (String)((javax.xml.rpc.Stub)sI_RSSearch_os)._getProperty("javax.xml.rpc.service.endpoint.address");
      }
      
    }
    catch (javax.xml.rpc.ServiceException serviceException) {}
  }
  
  public String getEndpoint() {
    return _endpoint;
  }
  
  public void setEndpoint(String endpoint) {
    _endpoint = endpoint;
    if (sI_RSSearch_os != null)
      ((javax.xml.rpc.Stub)sI_RSSearch_os)._setProperty("javax.xml.rpc.service.endpoint.address", _endpoint);
    
  }
  
  public com.esb.jinying.sap.mastdata.rvs.ecc.SI_RSSearch_os getSI_RSSearch_os() {
    if (sI_RSSearch_os == null)
      _initSI_RSSearch_osProxy();
    return sI_RSSearch_os;
  }
  
  public com.esb.jinying.sap.mastdata.rvs.ecc.DT_RSSearchRespReturn[] SI_RSSearch_os(com.esb.jinying.sap.mastdata.rvs.ecc.DT_RSSearchReq MT_RSSearchReq) throws java.rmi.RemoteException{
    if (sI_RSSearch_os == null)
      _initSI_RSSearch_osProxy();
    return sI_RSSearch_os.SI_RSSearch_os(MT_RSSearchReq);
  }
  
  
}