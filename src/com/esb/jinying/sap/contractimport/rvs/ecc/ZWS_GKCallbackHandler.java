
/**
 * ZWS_GKCallbackHandler.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis2 version: 1.4.1  Built on : Aug 19, 2008 (10:13:39 LKT)
 */

    package com.esb.jinying.sap.contractimport.rvs.ecc;

    /**
     *  ZWS_GKCallbackHandler Callback class, Users can extend this class and implement
     *  their own receiveResult and receiveError methods.
     */
    public abstract class ZWS_GKCallbackHandler{



    protected Object clientData;

    /**
    * User can pass in any object that needs to be accessed once the NonBlocking
    * Web service call is finished and appropriate method of this CallBack is called.
    * @param clientData Object mechanism by which the user can pass in user data
    * that will be avilable at the time this callback is called.
    */
    public ZWS_GKCallbackHandler(Object clientData){
        this.clientData = clientData;
    }

    /**
    * Please use this constructor if you don't want to set any clientData
    */
    public ZWS_GKCallbackHandler(){
        this.clientData = null;
    }

    /**
     * Get the client data
     */

     public Object getClientData() {
        return clientData;
     }

        
           /**
            * auto generated Axis2 call back method for ZfmGk012 method
            * override this method for handling normal response from ZfmGk012 operation
            */
           public void receiveResultZfmGk012(
                    com.esb.jinying.sap.contractimport.rvs.ecc.ZWS_GKStub.ZfmGk012Response result
                        ) {
           }

          /**
           * auto generated Axis2 Error handler
           * override this method for handling error response from ZfmGk012 operation
           */
            public void receiveErrorZfmGk012(java.lang.Exception e) {
            }
                


    }
    