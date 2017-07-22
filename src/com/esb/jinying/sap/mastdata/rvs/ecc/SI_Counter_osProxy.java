package com.esb.jinying.sap.mastdata.rvs.ecc;

public class SI_Counter_osProxy implements com.esb.jinying.sap.mastdata.rvs.ecc.SI_Counter_os {
  private String _endpoint = null;
  private com.esb.jinying.sap.mastdata.rvs.ecc.SI_Counter_os sI_Counter_os = null;
  
  public SI_Counter_osProxy() {
    _initSI_Counter_osProxy();
  }
  
  public SI_Counter_osProxy(String endpoint) {
    _endpoint = endpoint;
    _initSI_Counter_osProxy();
  }
  
  private void _initSI_Counter_osProxy() {
    try {
      sI_Counter_os = (new com.esb.jinying.sap.mastdata.rvs.ecc.XI_545E181640E6350C8A0C718768A4Fad8_ServiceLocator()).getHTTP_Port();
      if (sI_Counter_os != null) {
        if (_endpoint != null)
          ((javax.xml.rpc.Stub)sI_Counter_os)._setProperty("javax.xml.rpc.service.endpoint.address", _endpoint);
        else
          _endpoint = (String)((javax.xml.rpc.Stub)sI_Counter_os)._getProperty("javax.xml.rpc.service.endpoint.address");
      }
      
    }
    catch (javax.xml.rpc.ServiceException serviceException) {}
  }
  
  public String getEndpoint() {
    return _endpoint;
  }
  
  public void setEndpoint(String endpoint) {
    _endpoint = endpoint;
    if (sI_Counter_os != null)
      ((javax.xml.rpc.Stub)sI_Counter_os)._setProperty("javax.xml.rpc.service.endpoint.address", _endpoint);
    
  }
  
  public com.esb.jinying.sap.mastdata.rvs.ecc.SI_Counter_os getSI_Counter_os() {
    if (sI_Counter_os == null)
      _initSI_Counter_osProxy();
    return sI_Counter_os;
  }
  
  public com.esb.jinying.sap.mastdata.rvs.ecc.DT_CounterRespReturn[] SI_Counter_os(com.esb.jinying.sap.mastdata.rvs.ecc.DT_CounterReq MT_CounterReq) throws java.rmi.RemoteException{
    if (sI_Counter_os == null)
      _initSI_Counter_osProxy();
    return sI_Counter_os.SI_Counter_os(MT_CounterReq);
  }
  
  
}