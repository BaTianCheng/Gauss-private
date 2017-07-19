package com.esb.jinying.sap.dealup.pos;

public class SIO_POSProxy implements com.esb.jinying.sap.dealup.pos.SIO_POS {
  private String _endpoint = null;
  private com.esb.jinying.sap.dealup.pos.SIO_POS sIO_POS = null;
  
  public SIO_POSProxy() {
    _initSIO_POSProxy();
  }
  
  public SIO_POSProxy(String endpoint) {
    _endpoint = endpoint;
    _initSIO_POSProxy();
  }
  
  private void _initSIO_POSProxy() {
    try {
      sIO_POS = (new com.esb.jinying.sap.dealup.pos.XI_635B315907723538Ba61Ee4Cb6009B2D_ServiceLocator()).getHTTP_Port();
      if (sIO_POS != null) {
        if (_endpoint != null)
          ((javax.xml.rpc.Stub)sIO_POS)._setProperty("javax.xml.rpc.service.endpoint.address", _endpoint);
        else
          _endpoint = (String)((javax.xml.rpc.Stub)sIO_POS)._getProperty("javax.xml.rpc.service.endpoint.address");
      }
      
    }
    catch (javax.xml.rpc.ServiceException serviceException) {}
  }
  
  public String getEndpoint() {
    return _endpoint;
  }
  
  public void setEndpoint(String endpoint) {
    _endpoint = endpoint;
    if (sIO_POS != null)
      ((javax.xml.rpc.Stub)sIO_POS)._setProperty("javax.xml.rpc.service.endpoint.address", _endpoint);
    
  }
  
  public com.esb.jinying.sap.dealup.pos.SIO_POS getSIO_POS() {
    if (sIO_POS == null)
      _initSIO_POSProxy();
    return sIO_POS;
  }
  
  public com.esb.jinying.sap.functions.rfc.sap.document.sap_com.ZFM_INT_BW009Response SIO_POS025(com.esb.jinying.sap.functions.rfc.sap.document.sap_com.ZFM_INT_BW009 parameters) throws java.rmi.RemoteException{
    if (sIO_POS == null)
      _initSIO_POSProxy();
    return sIO_POS.SIO_POS025(parameters);
  }
  
  public com.esb.jinying.sap.functions.rfc.sap.document.sap_com.ZFM_INT_BW014Response SIO_POS031(com.esb.jinying.sap.functions.rfc.sap.document.sap_com.ZFM_INT_BW014 parameters) throws java.rmi.RemoteException{
    if (sIO_POS == null)
      _initSIO_POSProxy();
    return sIO_POS.SIO_POS031(parameters);
  }
  
  public com.esb.jinying.sap.functions.rfc.sap.document.sap_com.ZFM_INT_BW015Response SIO_POS032(com.esb.jinying.sap.functions.rfc.sap.document.sap_com.ZFM_INT_BW015 parameters) throws java.rmi.RemoteException{
    if (sIO_POS == null)
      _initSIO_POSProxy();
    return sIO_POS.SIO_POS032(parameters);
  }
  
  public com.esb.jinying.sap.functions.rfc.sap.document.sap_com.ZFM_INT_BW002Response SIO_POS018(com.esb.jinying.sap.functions.rfc.sap.document.sap_com.ZFM_INT_BW002 parameters) throws java.rmi.RemoteException{
    if (sIO_POS == null)
      _initSIO_POSProxy();
    return sIO_POS.SIO_POS018(parameters);
  }
  
  public com.esb.jinying.sap.functions.rfc.sap.document.sap_com.ZEXPORT_QUERY_01Response SIO_POS020(com.esb.jinying.sap.functions.rfc.sap.document.sap_com.ZEXPORT_QUERY_01 parameters) throws java.rmi.RemoteException{
    if (sIO_POS == null)
      _initSIO_POSProxy();
    return sIO_POS.SIO_POS020(parameters);
  }
  
  public com.esb.jinying.sap.functions.rfc.sap.document.sap_com.ZFM_INT_BW004Response SIO_POS021(com.esb.jinying.sap.functions.rfc.sap.document.sap_com.ZFM_INT_BW004 parameters) throws java.rmi.RemoteException{
    if (sIO_POS == null)
      _initSIO_POSProxy();
    return sIO_POS.SIO_POS021(parameters);
  }
  
  public com.esb.jinying.sap.functions.rfc.sap.document.sap_com.ZFM_INT_BW013Response SIO_POS030(com.esb.jinying.sap.functions.rfc.sap.document.sap_com.ZFM_INT_BW013 parameters) throws java.rmi.RemoteException{
    if (sIO_POS == null)
      _initSIO_POSProxy();
    return sIO_POS.SIO_POS030(parameters);
  }
  
  public com.esb.jinying.sap.functions.rfc.sap.document.sap_com.ZBTB_EXPT_01Response SIO_POS029(com.esb.jinying.sap.functions.rfc.sap.document.sap_com.ZBTB_EXPT_01 parameters) throws java.rmi.RemoteException{
    if (sIO_POS == null)
      _initSIO_POSProxy();
    return sIO_POS.SIO_POS029(parameters);
  }
  
  public com.esb.jinying.sap.functions.rfc.sap.document.sap_com.ZFM_INT_BW006Response SIO_POS022(com.esb.jinying.sap.functions.rfc.sap.document.sap_com.ZFM_INT_BW006 parameters) throws java.rmi.RemoteException{
    if (sIO_POS == null)
      _initSIO_POSProxy();
    return sIO_POS.SIO_POS022(parameters);
  }
  
  public com.esb.jinying.sap.functions.rfc.sap.document.sap_com.ZFM_INT_BW010Response SIO_POS026(com.esb.jinying.sap.functions.rfc.sap.document.sap_com.ZFM_INT_BW010 parameters) throws java.rmi.RemoteException{
    if (sIO_POS == null)
      _initSIO_POSProxy();
    return sIO_POS.SIO_POS026(parameters);
  }
  
  public com.esb.jinying.sap.functions.rfc.sap.document.sap_com.ZFM_INT_BW016Response SIO_POS033(com.esb.jinying.sap.functions.rfc.sap.document.sap_com.ZFM_INT_BW016 parameters) throws java.rmi.RemoteException{
    if (sIO_POS == null)
      _initSIO_POSProxy();
    return sIO_POS.SIO_POS033(parameters);
  }
  
  public com.esb.jinying.sap.functions.rfc.sap.document.sap_com.ZFM_INT_BW001Response SIO_POS017(com.esb.jinying.sap.functions.rfc.sap.document.sap_com.ZFM_INT_BW001 parameters) throws java.rmi.RemoteException{
    if (sIO_POS == null)
      _initSIO_POSProxy();
    return sIO_POS.SIO_POS017(parameters);
  }
  
  public com.esb.jinying.sap.functions.rfc.sap.document.sap_com.ZFM_INT_BW017Response SIO_POS034(com.esb.jinying.sap.functions.rfc.sap.document.sap_com.ZFM_INT_BW017 parameters) throws java.rmi.RemoteException{
    if (sIO_POS == null)
      _initSIO_POSProxy();
    return sIO_POS.SIO_POS034(parameters);
  }
  
  public com.esb.jinying.sap.functions.rfc.sap.document.sap_com.ZFM_INT_BW011Response SIO_POS027(com.esb.jinying.sap.functions.rfc.sap.document.sap_com.ZFM_INT_BW011 parameters) throws java.rmi.RemoteException{
    if (sIO_POS == null)
      _initSIO_POSProxy();
    return sIO_POS.SIO_POS027(parameters);
  }
  
  public com.esb.jinying.sap.functions.rfc.sap.document.sap_com.ZFM_INT_BW007Response SIO_POS023(com.esb.jinying.sap.functions.rfc.sap.document.sap_com.ZFM_INT_BW007 parameters) throws java.rmi.RemoteException{
    if (sIO_POS == null)
      _initSIO_POSProxy();
    return sIO_POS.SIO_POS023(parameters);
  }
  
  public com.esb.jinying.sap.functions.rfc.sap.document.sap_com.ZFM_INT_BW018Response SIO_POS035(com.esb.jinying.sap.functions.rfc.sap.document.sap_com.ZFM_INT_BW018 parameters) throws java.rmi.RemoteException{
    if (sIO_POS == null)
      _initSIO_POSProxy();
    return sIO_POS.SIO_POS035(parameters);
  }
  
  public com.esb.jinying.sap.functions.rfc.sap.document.sap_com.ZFM_INT_BW003Response SIO_POS019(com.esb.jinying.sap.functions.rfc.sap.document.sap_com.ZFM_INT_BW003 parameters) throws java.rmi.RemoteException{
    if (sIO_POS == null)
      _initSIO_POSProxy();
    return sIO_POS.SIO_POS019(parameters);
  }
  
  public com.esb.jinying.sap.functions.rfc.sap.document.sap_com.ZFM_INT_BW012Response SIO_POS028(com.esb.jinying.sap.functions.rfc.sap.document.sap_com.ZFM_INT_BW012 parameters) throws java.rmi.RemoteException{
    if (sIO_POS == null)
      _initSIO_POSProxy();
    return sIO_POS.SIO_POS028(parameters);
  }
  
  public com.esb.jinying.sap.functions.rfc.sap.document.sap_com.ZFM_INT_BW008Response SIO_POS024(com.esb.jinying.sap.functions.rfc.sap.document.sap_com.ZFM_INT_BW008 parameters) throws java.rmi.RemoteException{
    if (sIO_POS == null)
      _initSIO_POSProxy();
    return sIO_POS.SIO_POS024(parameters);
  }
  
  
}