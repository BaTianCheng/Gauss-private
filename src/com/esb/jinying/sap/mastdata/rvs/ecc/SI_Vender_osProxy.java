package com.esb.jinying.sap.mastdata.rvs.ecc;

public class SI_Vender_osProxy implements com.esb.jinying.sap.mastdata.rvs.ecc.SI_Vender_os {
  private String _endpoint = null;
  private com.esb.jinying.sap.mastdata.rvs.ecc.SI_Vender_os sI_Vender_os = null;
  
  public SI_Vender_osProxy() {
    _initSI_Vender_osProxy();
  }
  
  public SI_Vender_osProxy(String endpoint) {
    _endpoint = endpoint;
    _initSI_Vender_osProxy();
  }
  
  private void _initSI_Vender_osProxy() {
    try {
      sI_Vender_os = (new com.esb.jinying.sap.mastdata.rvs.ecc.XI_67190121998A33E481967Cfc62160381_ServiceLocator()).getHTTP_Port();
      if (sI_Vender_os != null) {
        if (_endpoint != null)
          ((javax.xml.rpc.Stub)sI_Vender_os)._setProperty("javax.xml.rpc.service.endpoint.address", _endpoint);
        else
          _endpoint = (String)((javax.xml.rpc.Stub)sI_Vender_os)._getProperty("javax.xml.rpc.service.endpoint.address");
      }
      
    }
    catch (javax.xml.rpc.ServiceException serviceException) {}
  }
  
  public String getEndpoint() {
    return _endpoint;
  }
  
  public void setEndpoint(String endpoint) {
    _endpoint = endpoint;
    if (sI_Vender_os != null)
      ((javax.xml.rpc.Stub)sI_Vender_os)._setProperty("javax.xml.rpc.service.endpoint.address", _endpoint);
    
  }
  
  public com.esb.jinying.sap.mastdata.rvs.ecc.SI_Vender_os getSI_Vender_os() {
    if (sI_Vender_os == null)
      _initSI_Vender_osProxy();
    return sI_Vender_os;
  }
  
  public com.esb.jinying.sap.mastdata.rvs.ecc.DT_VenderRespReturn[] SI_Vender_os(com.esb.jinying.sap.mastdata.rvs.ecc.DT_VenderReq MT_VenderReq) throws java.rmi.RemoteException{
    if (sI_Vender_os == null)
      _initSI_Vender_osProxy();
    return sI_Vender_os.SI_Vender_os(MT_VenderReq);
  }
  
  
}