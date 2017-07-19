package com.esb.jinying.sap.contract.rvs.ecc;

public class SI_ContractSearch_osProxy implements com.esb.jinying.sap.contract.rvs.ecc.SI_ContractSearch_os {
  private String _endpoint = null;
  private com.esb.jinying.sap.contract.rvs.ecc.SI_ContractSearch_os sI_ContractSearch_os = null;
  
  public SI_ContractSearch_osProxy() {
    _initSI_ContractSearch_osProxy();
  }
  
  public SI_ContractSearch_osProxy(String endpoint) {
    _endpoint = endpoint;
    _initSI_ContractSearch_osProxy();
  }
  
  private void _initSI_ContractSearch_osProxy() {
    try {
      sI_ContractSearch_os = (new com.esb.jinying.sap.contract.rvs.ecc.XI_435F3Ddc6Da436Eeaf7F2D6641Ce308D_ServiceLocator()).getHTTP_Port();
      if (sI_ContractSearch_os != null) {
        if (_endpoint != null)
          ((javax.xml.rpc.Stub)sI_ContractSearch_os)._setProperty("javax.xml.rpc.service.endpoint.address", _endpoint);
        else
          _endpoint = (String)((javax.xml.rpc.Stub)sI_ContractSearch_os)._getProperty("javax.xml.rpc.service.endpoint.address");
      }
      
    }
    catch (javax.xml.rpc.ServiceException serviceException) {}
  }
  
  public String getEndpoint() {
    return _endpoint;
  }
  
  public void setEndpoint(String endpoint) {
    _endpoint = endpoint;
    if (sI_ContractSearch_os != null)
      ((javax.xml.rpc.Stub)sI_ContractSearch_os)._setProperty("javax.xml.rpc.service.endpoint.address", _endpoint);
    
  }
  
  public com.esb.jinying.sap.contract.rvs.ecc.SI_ContractSearch_os getSI_ContractSearch_os() {
    if (sI_ContractSearch_os == null)
      _initSI_ContractSearch_osProxy();
    return sI_ContractSearch_os;
  }
  
  public com.esb.jinying.sap.contract.rvs.ecc.DT_ContractSearchMain SI_ContractSearch_os(com.esb.jinying.sap.contract.rvs.ecc.DT_ContractSearchMainReq MT_ContractSearchReq) throws java.rmi.RemoteException{
    if (sI_ContractSearch_os == null)
      _initSI_ContractSearch_osProxy();
    return sI_ContractSearch_os.SI_ContractSearch_os(MT_ContractSearchReq);
  }
  
  
}