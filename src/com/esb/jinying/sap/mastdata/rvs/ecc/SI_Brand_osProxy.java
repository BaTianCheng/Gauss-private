package com.esb.jinying.sap.mastdata.rvs.ecc;

public class SI_Brand_osProxy implements com.esb.jinying.sap.mastdata.rvs.ecc.SI_Brand_os {
  private String _endpoint = null;
  private com.esb.jinying.sap.mastdata.rvs.ecc.SI_Brand_os sI_Brand_os = null;
  
  public SI_Brand_osProxy() {
    _initSI_Brand_osProxy();
  }
  
  public SI_Brand_osProxy(String endpoint) {
    _endpoint = endpoint;
    _initSI_Brand_osProxy();
  }
  
  private void _initSI_Brand_osProxy() {
    try {
      sI_Brand_os = (new com.esb.jinying.sap.mastdata.rvs.ecc.XI_8F975A62472D36Dfae100158Fad4D45D_ServiceLocator()).getHTTP_Port();
      if (sI_Brand_os != null) {
        if (_endpoint != null)
          ((javax.xml.rpc.Stub)sI_Brand_os)._setProperty("javax.xml.rpc.service.endpoint.address", _endpoint);
        else
          _endpoint = (String)((javax.xml.rpc.Stub)sI_Brand_os)._getProperty("javax.xml.rpc.service.endpoint.address");
      }
      
    }
    catch (javax.xml.rpc.ServiceException serviceException) {}
  }
  
  public String getEndpoint() {
    return _endpoint;
  }
  
  public void setEndpoint(String endpoint) {
    _endpoint = endpoint;
    if (sI_Brand_os != null)
      ((javax.xml.rpc.Stub)sI_Brand_os)._setProperty("javax.xml.rpc.service.endpoint.address", _endpoint);
    
  }
  
  public com.esb.jinying.sap.mastdata.rvs.ecc.SI_Brand_os getSI_Brand_os() {
    if (sI_Brand_os == null)
      _initSI_Brand_osProxy();
    return sI_Brand_os;
  }
  
  public com.esb.jinying.sap.mastdata.rvs.ecc.DT_BrandRespReturn[] SI_Brand_os(com.esb.jinying.sap.mastdata.rvs.ecc.DT_BrandReq MT_BrandReq) throws java.rmi.RemoteException{
    if (sI_Brand_os == null)
      _initSI_Brand_osProxy();
    return sI_Brand_os.SI_Brand_os(MT_BrandReq);
  }
  
  
}