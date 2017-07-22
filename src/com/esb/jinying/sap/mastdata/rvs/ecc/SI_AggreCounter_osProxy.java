package com.esb.jinying.sap.mastdata.rvs.ecc;

public class SI_AggreCounter_osProxy implements com.esb.jinying.sap.mastdata.rvs.ecc.SI_AggreCounter_os {
  private String _endpoint = null;
  private com.esb.jinying.sap.mastdata.rvs.ecc.SI_AggreCounter_os sI_AggreCounter_os = null;
  
  public SI_AggreCounter_osProxy() {
    _initSI_AggreCounter_osProxy();
  }
  
  public SI_AggreCounter_osProxy(String endpoint) {
    _endpoint = endpoint;
    _initSI_AggreCounter_osProxy();
  }
  
  private void _initSI_AggreCounter_osProxy() {
    try {
      sI_AggreCounter_os = (new com.esb.jinying.sap.mastdata.rvs.ecc.XI_0Db1Adb417163B3Da265F370E1Cb659C_ServiceLocator()).getHTTP_Port();
      if (sI_AggreCounter_os != null) {
        if (_endpoint != null)
          ((javax.xml.rpc.Stub)sI_AggreCounter_os)._setProperty("javax.xml.rpc.service.endpoint.address", _endpoint);
        else
          _endpoint = (String)((javax.xml.rpc.Stub)sI_AggreCounter_os)._getProperty("javax.xml.rpc.service.endpoint.address");
      }
      
    }
    catch (javax.xml.rpc.ServiceException serviceException) {}
  }
  
  public String getEndpoint() {
    return _endpoint;
  }
  
  public void setEndpoint(String endpoint) {
    _endpoint = endpoint;
    if (sI_AggreCounter_os != null)
      ((javax.xml.rpc.Stub)sI_AggreCounter_os)._setProperty("javax.xml.rpc.service.endpoint.address", _endpoint);
    
  }
  
  public com.esb.jinying.sap.mastdata.rvs.ecc.SI_AggreCounter_os getSI_AggreCounter_os() {
    if (sI_AggreCounter_os == null)
      _initSI_AggreCounter_osProxy();
    return sI_AggreCounter_os;
  }
  
  public com.esb.jinying.sap.mastdata.rvs.ecc.DT_AggreCounterRespReturn[] SI_AggreCounter_os(com.esb.jinying.sap.mastdata.rvs.ecc.DT_AggreCounterReq MT_AggreCounterReq) throws java.rmi.RemoteException{
    if (sI_AggreCounter_os == null)
      _initSI_AggreCounter_osProxy();
    return sI_AggreCounter_os.SI_AggreCounter_os(MT_AggreCounterReq);
  }
  
  
}