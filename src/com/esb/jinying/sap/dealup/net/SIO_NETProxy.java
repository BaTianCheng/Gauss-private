package com.esb.jinying.sap.dealup.net;

public class SIO_NETProxy implements com.esb.jinying.sap.dealup.net.SIO_NET {
  private String _endpoint = null;
  private com.esb.jinying.sap.dealup.net.SIO_NET sIO_NET = null;
  
  public SIO_NETProxy() {
    _initSIO_NETProxy();
  }
  
  public SIO_NETProxy(String endpoint) {
    _endpoint = endpoint;
    _initSIO_NETProxy();
  }
  
  private void _initSIO_NETProxy() {
    try {
      sIO_NET = (new com.esb.jinying.sap.dealup.net.XI_8Bcce4C5F0C73B1Eae22Ec6E25Eb2573_ServiceLocator()).getHTTP_Port();
      if (sIO_NET != null) {
        if (_endpoint != null)
          ((javax.xml.rpc.Stub)sIO_NET)._setProperty("javax.xml.rpc.service.endpoint.address", _endpoint);
        else
          _endpoint = (String)((javax.xml.rpc.Stub)sIO_NET)._getProperty("javax.xml.rpc.service.endpoint.address");
      }
      
    }
    catch (javax.xml.rpc.ServiceException serviceException) {}
  }
  
  public String getEndpoint() {
    return _endpoint;
  }
  
  public void setEndpoint(String endpoint) {
    _endpoint = endpoint;
    if (sIO_NET != null)
      ((javax.xml.rpc.Stub)sIO_NET)._setProperty("javax.xml.rpc.service.endpoint.address", _endpoint);
    
  }
  
  public com.esb.jinying.sap.dealup.net.SIO_NET getSIO_NET() {
    if (sIO_NET == null)
      _initSIO_NETProxy();
    return sIO_NET;
  }
  
  public com.esb.jinying.sap.functions.rfc.sap.document.sap_com.ZOA0016Response SIO_NET003(com.esb.jinying.sap.functions.rfc.sap.document.sap_com.ZOA0016 parameters) throws java.rmi.RemoteException{
    if (sIO_NET == null)
      _initSIO_NETProxy();
    return sIO_NET.SIO_NET003(parameters);
  }
  
  public com.esb.jinying.sap.functions.rfc.sap.document.sap_com.ZFM_INT_RF013Response SIO_NET001(com.esb.jinying.sap.functions.rfc.sap.document.sap_com.ZFM_INT_RF013 parameters) throws java.rmi.RemoteException{
    if (sIO_NET == null)
      _initSIO_NETProxy();
    return sIO_NET.SIO_NET001(parameters);
  }
  
  public com.esb.jinying.sap.functions.rfc.sap.document.sap_com.ZPP001Response SIO_NET002(com.esb.jinying.sap.functions.rfc.sap.document.sap_com.ZPP001 parameters) throws java.rmi.RemoteException{
    if (sIO_NET == null)
      _initSIO_NETProxy();
    return sIO_NET.SIO_NET002(parameters);
  }
  
  public com.esb.jinying.sap.functions.rfc.sap.document.sap_com.ZPP002Response SIO_NET004(com.esb.jinying.sap.functions.rfc.sap.document.sap_com.ZPP002 parameters) throws java.rmi.RemoteException{
    if (sIO_NET == null)
      _initSIO_NETProxy();
    return sIO_NET.SIO_NET004(parameters);
  }
  
  
}