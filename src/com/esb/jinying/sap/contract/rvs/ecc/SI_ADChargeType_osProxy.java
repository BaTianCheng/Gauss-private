package com.esb.jinying.sap.contract.rvs.ecc;

public class SI_ADChargeType_osProxy implements com.esb.jinying.sap.contract.rvs.ecc.SI_ADChargeType_os {
  private String _endpoint = null;
  private com.esb.jinying.sap.contract.rvs.ecc.SI_ADChargeType_os sI_ADChargeType_os = null;
  
  public SI_ADChargeType_osProxy() {
    _initSI_ADChargeType_osProxy();
  }
  
  public SI_ADChargeType_osProxy(String endpoint) {
    _endpoint = endpoint;
    _initSI_ADChargeType_osProxy();
  }
  
  private void _initSI_ADChargeType_osProxy() {
    try {
      sI_ADChargeType_os = (new com.esb.jinying.sap.contract.rvs.ecc.XI_e303F5C7Db843B0Fb79B7B1Bc0D6Fe94_ServiceLocator()).getHTTP_Port();
      if (sI_ADChargeType_os != null) {
        if (_endpoint != null)
          ((javax.xml.rpc.Stub)sI_ADChargeType_os)._setProperty("javax.xml.rpc.service.endpoint.address", _endpoint);
        else
          _endpoint = (String)((javax.xml.rpc.Stub)sI_ADChargeType_os)._getProperty("javax.xml.rpc.service.endpoint.address");
      }
      
    }
    catch (javax.xml.rpc.ServiceException serviceException) {}
  }
  
  public String getEndpoint() {
    return _endpoint;
  }
  
  public void setEndpoint(String endpoint) {
    _endpoint = endpoint;
    if (sI_ADChargeType_os != null)
      ((javax.xml.rpc.Stub)sI_ADChargeType_os)._setProperty("javax.xml.rpc.service.endpoint.address", _endpoint);
    
  }
  
  public com.esb.jinying.sap.contract.rvs.ecc.SI_ADChargeType_os getSI_ADChargeType_os() {
    if (sI_ADChargeType_os == null)
      _initSI_ADChargeType_osProxy();
    return sI_ADChargeType_os;
  }
  
  public com.esb.jinying.sap.contract.rvs.ecc.DT_ADChargeTypeRespRow[] SI_ADChargeType_os(com.esb.jinying.sap.contract.rvs.ecc.DT_ADChargeTypeReq MT_ADChargeTypeReq) throws java.rmi.RemoteException{
    if (sI_ADChargeType_os == null)
      _initSI_ADChargeType_osProxy();
    return sI_ADChargeType_os.SI_ADChargeType_os(MT_ADChargeTypeReq);
  }
  
  
}