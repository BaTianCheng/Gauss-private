package com.esb.jinying.sap.mastdata.rvs.ecc;

public class SI_BuildingData_osProxy implements com.esb.jinying.sap.mastdata.rvs.ecc.SI_BuildingData_os {
  private String _endpoint = null;
  private com.esb.jinying.sap.mastdata.rvs.ecc.SI_BuildingData_os sI_BuildingData_os = null;
  
  public SI_BuildingData_osProxy() {
    _initSI_BuildingData_osProxy();
  }
  
  public SI_BuildingData_osProxy(String endpoint) {
    _endpoint = endpoint;
    _initSI_BuildingData_osProxy();
  }
  
  private void _initSI_BuildingData_osProxy() {
    try {
      sI_BuildingData_os = (new com.esb.jinying.sap.mastdata.rvs.ecc.XI_b6126D9C98333D9F8Ad01010Ce6De9Dc_ServiceLocator()).getHTTP_Port();
      if (sI_BuildingData_os != null) {
        if (_endpoint != null)
          ((javax.xml.rpc.Stub)sI_BuildingData_os)._setProperty("javax.xml.rpc.service.endpoint.address", _endpoint);
        else
          _endpoint = (String)((javax.xml.rpc.Stub)sI_BuildingData_os)._getProperty("javax.xml.rpc.service.endpoint.address");
      }
      
    }
    catch (javax.xml.rpc.ServiceException serviceException) {}
  }
  
  public String getEndpoint() {
    return _endpoint;
  }
  
  public void setEndpoint(String endpoint) {
    _endpoint = endpoint;
    if (sI_BuildingData_os != null)
      ((javax.xml.rpc.Stub)sI_BuildingData_os)._setProperty("javax.xml.rpc.service.endpoint.address", _endpoint);
    
  }
  
  public com.esb.jinying.sap.mastdata.rvs.ecc.SI_BuildingData_os getSI_BuildingData_os() {
    if (sI_BuildingData_os == null)
      _initSI_BuildingData_osProxy();
    return sI_BuildingData_os;
  }
  
  public com.esb.jinying.sap.mastdata.rvs.ecc.DT_BuildingDataRespRow[] SI_BuildingData_os(com.esb.jinying.sap.mastdata.rvs.ecc.DT_BuildingDataReq MT_BuildingDataReq) throws java.rmi.RemoteException{
    if (sI_BuildingData_os == null)
      _initSI_BuildingData_osProxy();
    return sI_BuildingData_os.SI_BuildingData_os(MT_BuildingDataReq);
  }
  
  
}