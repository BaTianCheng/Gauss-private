
/**
 * ZWS_RFCallbackHandler.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis2 version: 1.4.1  Built on : Aug 19, 2008 (10:13:39 LKT)
 */

    package com.esb.jinying.sap.functions.rfc.sap.document.sap_com;

    /**
     *  ZWS_RFCallbackHandler Callback class, Users can extend this class and implement
     *  their own receiveResult and receiveError methods.
     */
    public abstract class ZWS_RFCallbackHandler{



    protected Object clientData;

    /**
    * User can pass in any object that needs to be accessed once the NonBlocking
    * Web service call is finished and appropriate method of this CallBack is called.
    * @param clientData Object mechanism by which the user can pass in user data
    * that will be avilable at the time this callback is called.
    */
    public ZWS_RFCallbackHandler(Object clientData){
        this.clientData = clientData;
    }

    /**
    * Please use this constructor if you don't want to set any clientData
    */
    public ZWS_RFCallbackHandler(){
        this.clientData = null;
    }

    /**
     * Get the client data
     */

     public Object getClientData() {
        return clientData;
     }

        
           /**
            * auto generated Axis2 call back method for ZFM_INT_RF003 method
            * override this method for handling normal response from ZFM_INT_RF003 operation
            */
           public void receiveResultZFM_INT_RF003(
                    com.esb.jinying.sap.functions.rfc.sap.document.sap_com.ZWS_RFStub.ZFM_INT_RF003Response result
                        ) {
           }

          /**
           * auto generated Axis2 Error handler
           * override this method for handling error response from ZFM_INT_RF003 operation
           */
            public void receiveErrorZFM_INT_RF003(java.lang.Exception e) {
            }
                
           /**
            * auto generated Axis2 call back method for ZFM_INT_RF015 method
            * override this method for handling normal response from ZFM_INT_RF015 operation
            */
           public void receiveResultZFM_INT_RF015(
                    com.esb.jinying.sap.functions.rfc.sap.document.sap_com.ZWS_RFStub.ZFM_INT_RF015Response result
                        ) {
           }

          /**
           * auto generated Axis2 Error handler
           * override this method for handling error response from ZFM_INT_RF015 operation
           */
            public void receiveErrorZFM_INT_RF015(java.lang.Exception e) {
            }
                
           /**
            * auto generated Axis2 call back method for ZFM_INT_RF009 method
            * override this method for handling normal response from ZFM_INT_RF009 operation
            */
           public void receiveResultZFM_INT_RF009(
                    com.esb.jinying.sap.functions.rfc.sap.document.sap_com.ZWS_RFStub.ZFM_INT_RF009Response result
                        ) {
           }

          /**
           * auto generated Axis2 Error handler
           * override this method for handling error response from ZFM_INT_RF009 operation
           */
            public void receiveErrorZFM_INT_RF009(java.lang.Exception e) {
            }
                
           /**
            * auto generated Axis2 call back method for ZFM_INT_RF013 method
            * override this method for handling normal response from ZFM_INT_RF013 operation
            */
           public void receiveResultZFM_INT_RF013(
                    com.esb.jinying.sap.functions.rfc.sap.document.sap_com.ZWS_RFStub.ZFM_INT_RF013Response result
                        ) {
           }

          /**
           * auto generated Axis2 Error handler
           * override this method for handling error response from ZFM_INT_RF013 operation
           */
            public void receiveErrorZFM_INT_RF013(java.lang.Exception e) {
            }
                
           /**
            * auto generated Axis2 call back method for ZFM_INT_RF011 method
            * override this method for handling normal response from ZFM_INT_RF011 operation
            */
           public void receiveResultZFM_INT_RF011(
                    com.esb.jinying.sap.functions.rfc.sap.document.sap_com.ZWS_RFStub.ZFM_INT_RF011Response result
                        ) {
           }

          /**
           * auto generated Axis2 Error handler
           * override this method for handling error response from ZFM_INT_RF011 operation
           */
            public void receiveErrorZFM_INT_RF011(java.lang.Exception e) {
            }
                
           /**
            * auto generated Axis2 call back method for ZFM_INT_RF007 method
            * override this method for handling normal response from ZFM_INT_RF007 operation
            */
           public void receiveResultZFM_INT_RF007(
                    com.esb.jinying.sap.functions.rfc.sap.document.sap_com.ZWS_RFStub.ZFM_INT_RF007Response result
                        ) {
           }

          /**
           * auto generated Axis2 Error handler
           * override this method for handling error response from ZFM_INT_RF007 operation
           */
            public void receiveErrorZFM_INT_RF007(java.lang.Exception e) {
            }
                
           /**
            * auto generated Axis2 call back method for ZFM_INT_RF004 method
            * override this method for handling normal response from ZFM_INT_RF004 operation
            */
           public void receiveResultZFM_INT_RF004(
                    com.esb.jinying.sap.functions.rfc.sap.document.sap_com.ZWS_RFStub.ZFM_INT_RF004Response result
                        ) {
           }

          /**
           * auto generated Axis2 Error handler
           * override this method for handling error response from ZFM_INT_RF004 operation
           */
            public void receiveErrorZFM_INT_RF004(java.lang.Exception e) {
            }
                
           /**
            * auto generated Axis2 call back method for ZFM_INT_RF006 method
            * override this method for handling normal response from ZFM_INT_RF006 operation
            */
           public void receiveResultZFM_INT_RF006(
                    com.esb.jinying.sap.functions.rfc.sap.document.sap_com.ZWS_RFStub.ZFM_INT_RF006Response result
                        ) {
           }

          /**
           * auto generated Axis2 Error handler
           * override this method for handling error response from ZFM_INT_RF006 operation
           */
            public void receiveErrorZFM_INT_RF006(java.lang.Exception e) {
            }
                
           /**
            * auto generated Axis2 call back method for ZFM_INT_RF001 method
            * override this method for handling normal response from ZFM_INT_RF001 operation
            */
           public void receiveResultZFM_INT_RF001(
                    com.esb.jinying.sap.functions.rfc.sap.document.sap_com.ZWS_RFStub.ZFM_INT_RF001Response result
                        ) {
           }

          /**
           * auto generated Axis2 Error handler
           * override this method for handling error response from ZFM_INT_RF001 operation
           */
            public void receiveErrorZFM_INT_RF001(java.lang.Exception e) {
            }
                
           /**
            * auto generated Axis2 call back method for ZFM_INT_RF012 method
            * override this method for handling normal response from ZFM_INT_RF012 operation
            */
           public void receiveResultZFM_INT_RF012(
                    com.esb.jinying.sap.functions.rfc.sap.document.sap_com.ZWS_RFStub.ZFM_INT_RF012Response result
                        ) {
           }

          /**
           * auto generated Axis2 Error handler
           * override this method for handling error response from ZFM_INT_RF012 operation
           */
            public void receiveErrorZFM_INT_RF012(java.lang.Exception e) {
            }
                
           /**
            * auto generated Axis2 call back method for ZFM_INT_RF014 method
            * override this method for handling normal response from ZFM_INT_RF014 operation
            */
           public void receiveResultZFM_INT_RF014(
                    com.esb.jinying.sap.functions.rfc.sap.document.sap_com.ZWS_RFStub.ZFM_INT_RF014Response result
                        ) {
           }

          /**
           * auto generated Axis2 Error handler
           * override this method for handling error response from ZFM_INT_RF014 operation
           */
            public void receiveErrorZFM_INT_RF014(java.lang.Exception e) {
            }
                
           /**
            * auto generated Axis2 call back method for ZFM_INT_RF005 method
            * override this method for handling normal response from ZFM_INT_RF005 operation
            */
           public void receiveResultZFM_INT_RF005(
                    com.esb.jinying.sap.functions.rfc.sap.document.sap_com.ZWS_RFStub.ZFM_INT_RF005Response result
                        ) {
           }

          /**
           * auto generated Axis2 Error handler
           * override this method for handling error response from ZFM_INT_RF005 operation
           */
            public void receiveErrorZFM_INT_RF005(java.lang.Exception e) {
            }
                
           /**
            * auto generated Axis2 call back method for ZFM_INT_RF008 method
            * override this method for handling normal response from ZFM_INT_RF008 operation
            */
           public void receiveResultZFM_INT_RF008(
                    com.esb.jinying.sap.functions.rfc.sap.document.sap_com.ZWS_RFStub.ZFM_INT_RF008Response result
                        ) {
           }

          /**
           * auto generated Axis2 Error handler
           * override this method for handling error response from ZFM_INT_RF008 operation
           */
            public void receiveErrorZFM_INT_RF008(java.lang.Exception e) {
            }
                
           /**
            * auto generated Axis2 call back method for ZFM_INT_RF002 method
            * override this method for handling normal response from ZFM_INT_RF002 operation
            */
           public void receiveResultZFM_INT_RF002(
                    com.esb.jinying.sap.functions.rfc.sap.document.sap_com.ZWS_RFStub.ZFM_INT_RF002Response result
                        ) {
           }

          /**
           * auto generated Axis2 Error handler
           * override this method for handling error response from ZFM_INT_RF002 operation
           */
            public void receiveErrorZFM_INT_RF002(java.lang.Exception e) {
            }
                
           /**
            * auto generated Axis2 call back method for ZFM_INT_RF010 method
            * override this method for handling normal response from ZFM_INT_RF010 operation
            */
           public void receiveResultZFM_INT_RF010(
                    com.esb.jinying.sap.functions.rfc.sap.document.sap_com.ZWS_RFStub.ZFM_INT_RF010Response result
                        ) {
           }

          /**
           * auto generated Axis2 Error handler
           * override this method for handling error response from ZFM_INT_RF010 operation
           */
            public void receiveErrorZFM_INT_RF010(java.lang.Exception e) {
            }
                


    }
    