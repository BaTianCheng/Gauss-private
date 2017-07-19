package com.esb.jinying.sap.mastdata.rvs.ecc;

public class SI_Floor_osProxy implements com.esb.jinying.sap.mastdata.rvs.ecc.SI_Floor_os {
  private String _endpoint = null;
  private com.esb.jinying.sap.mastdata.rvs.ecc.SI_Floor_os sI_Floor_os = null;
  
  public SI_Floor_osProxy() {
    _initSI_Floor_osProxy();
  }
  
  public SI_Floor_osProxy(String endpoint) {
    _endpoint = endpoint;
    _initSI_Floor_osProxy();
  }
  
  private void _initSI_Floor_osProxy() {
    try {
      sI_Floor_os = (new com.esb.jinying.sap.mastdata.rvs.ecc.XI_52C86F49B5103672Bb020Ce44Cb20697_ServiceLocator()).getHTTP_Port();
      if (sI_Floor_os != null) {
        if (_endpoint != null)
          ((javax.xml.rpc.Stub)sI_Floor_os)._setProperty("javax.xml.rpc.service.endpoint.address", _endpoint);
        else
          _endpoint = (String)((javax.xml.rpc.Stub)sI_Floor_os)._getProperty("javax.xml.rpc.service.endpoint.address");
      }
      
    }
    catch (javax.xml.rpc.ServiceException serviceException) {}
  }
  
  public String getEndpoint() {
    return _endpoint;
  }
  
  public void setEndpoint(String endpoint) {
    _endpoint = endpoint;
    if (sI_Floor_os != null)
      ((javax.xml.rpc.Stub)sI_Floor_os)._setProperty("javax.xml.rpc.service.endpoint.address", _endpoint);
    
  }
  
  public com.esb.jinying.sap.mastdata.rvs.ecc.SI_Floor_os getSI_Floor_os() {
    if (sI_Floor_os == null)
      _initSI_Floor_osProxy();
    return sI_Floor_os;
  }
  
  public com.esb.jinying.sap.mastdata.rvs.ecc.DT_FloorRespReturn[] SI_Floor_os(com.esb.jinying.sap.mastdata.rvs.ecc.DT_FloorReq MT_FloorReq) throws java.rmi.RemoteException{
    if (sI_Floor_os == null)
      _initSI_Floor_osProxy();
    return sI_Floor_os.SI_Floor_os(MT_FloorReq);
  }
  
  
}