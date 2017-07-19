package com.esb.jinying.sap.mastdata.rvs.ecc;

public class SI_Category_osProxy implements com.esb.jinying.sap.mastdata.rvs.ecc.SI_Category_os {
  private String _endpoint = null;
  private com.esb.jinying.sap.mastdata.rvs.ecc.SI_Category_os sI_Category_os = null;
  
  public SI_Category_osProxy() {
    _initSI_Category_osProxy();
  }
  
  public SI_Category_osProxy(String endpoint) {
    _endpoint = endpoint;
    _initSI_Category_osProxy();
  }
  
  private void _initSI_Category_osProxy() {
    try {
      sI_Category_os = (new com.esb.jinying.sap.mastdata.rvs.ecc.XI_73B2Ace638113490Ac2270E05801D4A3_ServiceLocator()).getHTTP_Port();
      if (sI_Category_os != null) {
        if (_endpoint != null)
          ((javax.xml.rpc.Stub)sI_Category_os)._setProperty("javax.xml.rpc.service.endpoint.address", _endpoint);
        else
          _endpoint = (String)((javax.xml.rpc.Stub)sI_Category_os)._getProperty("javax.xml.rpc.service.endpoint.address");
      }
      
    }
    catch (javax.xml.rpc.ServiceException serviceException) {}
  }
  
  public String getEndpoint() {
    return _endpoint;
  }
  
  public void setEndpoint(String endpoint) {
    _endpoint = endpoint;
    if (sI_Category_os != null)
      ((javax.xml.rpc.Stub)sI_Category_os)._setProperty("javax.xml.rpc.service.endpoint.address", _endpoint);
    
  }
  
  public com.esb.jinying.sap.mastdata.rvs.ecc.SI_Category_os getSI_Category_os() {
    if (sI_Category_os == null)
      _initSI_Category_osProxy();
    return sI_Category_os;
  }
  
  public com.esb.jinying.sap.mastdata.rvs.ecc.DT_CategoryRespReturn[] SI_Category_os(com.esb.jinying.sap.mastdata.rvs.ecc.DT_CategoryReq MT_CategoryReq) throws java.rmi.RemoteException{
    if (sI_Category_os == null)
      _initSI_Category_osProxy();
    return sI_Category_os.SI_Category_os(MT_CategoryReq);
  }
  
  
}