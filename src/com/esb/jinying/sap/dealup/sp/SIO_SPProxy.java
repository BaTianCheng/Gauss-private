package com.esb.jinying.sap.dealup.sp;

public class SIO_SPProxy implements com.esb.jinying.sap.dealup.sp.SIO_SP {
  private String _endpoint = null;
  private com.esb.jinying.sap.dealup.sp.SIO_SP sIO_SP = null;
  
  public SIO_SPProxy() {
    _initSIO_SPProxy();
  }
  
  public SIO_SPProxy(String endpoint) {
    _endpoint = endpoint;
    _initSIO_SPProxy();
  }
  
  private void _initSIO_SPProxy() {
    try {
      sIO_SP = (new com.esb.jinying.sap.dealup.sp.XI_a3257215D786342Db8147628Fa0B492C_ServiceLocator()).getHTTP_Port();
      if (sIO_SP != null) {
        if (_endpoint != null)
          ((javax.xml.rpc.Stub)sIO_SP)._setProperty("javax.xml.rpc.service.endpoint.address", _endpoint);
        else
          _endpoint = (String)((javax.xml.rpc.Stub)sIO_SP)._getProperty("javax.xml.rpc.service.endpoint.address");
      }
      
    }
    catch (javax.xml.rpc.ServiceException serviceException) {}
  }
  
  public String getEndpoint() {
    return _endpoint;
  }
  
  public void setEndpoint(String endpoint) {
    _endpoint = endpoint;
    if (sIO_SP != null)
      ((javax.xml.rpc.Stub)sIO_SP)._setProperty("javax.xml.rpc.service.endpoint.address", _endpoint);
    
  }
  
  public com.esb.jinying.sap.dealup.sp.SIO_SP getSIO_SP() {
    if (sIO_SP == null)
      _initSIO_SPProxy();
    return sIO_SP;
  }
  
  public com.esb.jinying.sap.functions.rfc.sap.document.sap_com.ZSP001Response SIO_SP004(com.esb.jinying.sap.functions.rfc.sap.document.sap_com.ZSP001 parameters) throws java.rmi.RemoteException{
    if (sIO_SP == null)
      _initSIO_SPProxy();
    return sIO_SP.SIO_SP004(parameters);
  }
  
  public com.esb.jinying.sap.functions.rfc.sap.document.sap_com.ZDP003Response SIO_SP003(com.esb.jinying.sap.functions.rfc.sap.document.sap_com.ZDP003 parameters) throws java.rmi.RemoteException{
    if (sIO_SP == null)
      _initSIO_SPProxy();
    return sIO_SP.SIO_SP003(parameters);
  }
  
  public com.esb.jinying.sap.functions.rfc.sap.document.sap_com.ZDP001Response SIO_SP001(com.esb.jinying.sap.functions.rfc.sap.document.sap_com.ZDP001 parameters) throws java.rmi.RemoteException{
    if (sIO_SP == null)
      _initSIO_SPProxy();
    return sIO_SP.SIO_SP001(parameters);
  }
  
  public com.esb.jinying.sap.functions.rfc.sap.document.sap_com.ZPO0001Response SIO_PO001(com.esb.jinying.sap.functions.rfc.sap.document.sap_com.ZPO0001 parameters) throws java.rmi.RemoteException{
    if (sIO_SP == null)
      _initSIO_SPProxy();
    return sIO_SP.SIO_PO001(parameters);
  }
  
  public com.esb.jinying.sap.functions.rfc.sap.document.sap_com.ZSP002Response SIO_SP005(com.esb.jinying.sap.functions.rfc.sap.document.sap_com.ZSP002 parameters) throws java.rmi.RemoteException{
    if (sIO_SP == null)
      _initSIO_SPProxy();
    return sIO_SP.SIO_SP005(parameters);
  }
  
  public com.esb.jinying.sap.functions.rfc.sap.document.sap_com.ZPO0002Response SIO_PO002(com.esb.jinying.sap.functions.rfc.sap.document.sap_com.ZPO0002 parameters) throws java.rmi.RemoteException{
    if (sIO_SP == null)
      _initSIO_SPProxy();
    return sIO_SP.SIO_PO002(parameters);
  }
  
  public com.esb.jinying.sap.functions.rfc.sap.document.sap_com.ZDP002Response SIO_SP002(com.esb.jinying.sap.functions.rfc.sap.document.sap_com.ZDP002 parameters) throws java.rmi.RemoteException{
    if (sIO_SP == null)
      _initSIO_SPProxy();
    return sIO_SP.SIO_SP002(parameters);
  }
  
  
}