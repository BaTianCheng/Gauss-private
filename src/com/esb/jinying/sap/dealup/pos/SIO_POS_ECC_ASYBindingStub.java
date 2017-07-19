/**
 * SIO_POS_ECC_ASYBindingStub.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package com.esb.jinying.sap.dealup.pos;

public class SIO_POS_ECC_ASYBindingStub extends org.apache.axis.client.Stub implements com.esb.jinying.sap.dealup.pos.SIO_POS_ECC_ASY {
    private java.util.Vector cachedSerClasses = new java.util.Vector();
    private java.util.Vector cachedSerQNames = new java.util.Vector();
    private java.util.Vector cachedSerFactories = new java.util.Vector();
    private java.util.Vector cachedDeserFactories = new java.util.Vector();

    static org.apache.axis.description.OperationDesc [] _operations;

    static {
        _operations = new org.apache.axis.description.OperationDesc[9];
        _initOperationDesc1();
    }

    private static void _initOperationDesc1(){
        org.apache.axis.description.OperationDesc oper;
        org.apache.axis.description.ParameterDesc param;
        oper = new org.apache.axis.description.OperationDesc();
        oper.setName("SIO_POS017");
        param = new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("urn:ecc:pos:base:dealup", "MT_POS017"), org.apache.axis.description.ParameterDesc.IN, new javax.xml.namespace.QName("urn:ecc:pos:base:dealup", "DT_POS017"), com.esb.jinying.sap.dealup.base.pos.ecc.DT_POS017ITEMS[].class, false, false);
        param.setItemQName(new javax.xml.namespace.QName("", "ITEMS"));
        oper.addParameter(param);
        oper.setReturnType(org.apache.axis.encoding.XMLType.AXIS_VOID);
        oper.setStyle(org.apache.axis.constants.Style.DOCUMENT);
        oper.setUse(org.apache.axis.constants.Use.LITERAL);
        _operations[0] = oper;

        oper = new org.apache.axis.description.OperationDesc();
        oper.setName("SIO_POS015");
        param = new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("urn:ecc:pos:base:dealup", "MT_POS015"), org.apache.axis.description.ParameterDesc.IN, new javax.xml.namespace.QName("urn:ecc:pos:base:dealup", "DT_POS015"), com.esb.jinying.sap.dealup.base.pos.ecc.DT_POS015ITEMS[].class, false, false);
        param.setItemQName(new javax.xml.namespace.QName("", "ITEMS"));
        oper.addParameter(param);
        oper.setReturnType(org.apache.axis.encoding.XMLType.AXIS_VOID);
        oper.setStyle(org.apache.axis.constants.Style.DOCUMENT);
        oper.setUse(org.apache.axis.constants.Use.LITERAL);
        _operations[1] = oper;

        oper = new org.apache.axis.description.OperationDesc();
        oper.setName("SIO_POS018");
        param = new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("urn:ecc:pos:base:dealup", "MT_POS018"), org.apache.axis.description.ParameterDesc.IN, new javax.xml.namespace.QName("urn:ecc:pos:base:dealup", "DT_POS018"), com.esb.jinying.sap.dealup.base.pos.ecc.DT_POS018ITEMS[].class, false, false);
        param.setItemQName(new javax.xml.namespace.QName("", "ITEMS"));
        oper.addParameter(param);
        oper.setReturnType(org.apache.axis.encoding.XMLType.AXIS_VOID);
        oper.setStyle(org.apache.axis.constants.Style.DOCUMENT);
        oper.setUse(org.apache.axis.constants.Use.LITERAL);
        _operations[2] = oper;

        oper = new org.apache.axis.description.OperationDesc();
        oper.setName("SIO_POS020");
        param = new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("urn:ecc:pos:base:dealup", "MT_POS020"), org.apache.axis.description.ParameterDesc.IN, new javax.xml.namespace.QName("urn:ecc:pos:base:dealup", "DT_POS020"), com.esb.jinying.sap.dealup.base.pos.ecc.DT_POS020ITEMS[].class, false, false);
        param.setItemQName(new javax.xml.namespace.QName("", "ITEMS"));
        oper.addParameter(param);
        oper.setReturnType(org.apache.axis.encoding.XMLType.AXIS_VOID);
        oper.setStyle(org.apache.axis.constants.Style.DOCUMENT);
        oper.setUse(org.apache.axis.constants.Use.LITERAL);
        _operations[3] = oper;

        oper = new org.apache.axis.description.OperationDesc();
        oper.setName("SIO_POS016");
        param = new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("urn:ecc:pos:base:dealup", "MT_POS016"), org.apache.axis.description.ParameterDesc.IN, new javax.xml.namespace.QName("urn:ecc:pos:base:dealup", "DT_POS016"), com.esb.jinying.sap.dealup.base.pos.ecc.DT_POS016ITEMS[].class, false, false);
        param.setItemQName(new javax.xml.namespace.QName("", "ITEMS"));
        oper.addParameter(param);
        oper.setReturnType(org.apache.axis.encoding.XMLType.AXIS_VOID);
        oper.setStyle(org.apache.axis.constants.Style.DOCUMENT);
        oper.setUse(org.apache.axis.constants.Use.LITERAL);
        _operations[4] = oper;

        oper = new org.apache.axis.description.OperationDesc();
        oper.setName("SIO_POS003C");
        param = new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("urn:ecc:pos:base:dealup", "MT_POS003C"), org.apache.axis.description.ParameterDesc.IN, new javax.xml.namespace.QName("urn:ecc:pos:base:dealup", "DT_POS003C"), com.esb.jinying.sap.dealup.base.pos.ecc.DT_POS003CITEMS[].class, false, false);
        param.setItemQName(new javax.xml.namespace.QName("", "ITEMS"));
        oper.addParameter(param);
        oper.setReturnType(org.apache.axis.encoding.XMLType.AXIS_VOID);
        oper.setStyle(org.apache.axis.constants.Style.DOCUMENT);
        oper.setUse(org.apache.axis.constants.Use.LITERAL);
        _operations[5] = oper;

        oper = new org.apache.axis.description.OperationDesc();
        oper.setName("SIO_POS013");
        param = new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("urn:ecc:pos:base:dealup", "MT_POS013"), org.apache.axis.description.ParameterDesc.IN, new javax.xml.namespace.QName("urn:ecc:pos:base:dealup", "DT_POS013"), com.esb.jinying.sap.dealup.base.pos.ecc.DT_POS013ITEMS[].class, false, false);
        param.setItemQName(new javax.xml.namespace.QName("", "ITEMS"));
        oper.addParameter(param);
        oper.setReturnType(org.apache.axis.encoding.XMLType.AXIS_VOID);
        oper.setStyle(org.apache.axis.constants.Style.DOCUMENT);
        oper.setUse(org.apache.axis.constants.Use.LITERAL);
        _operations[6] = oper;

        oper = new org.apache.axis.description.OperationDesc();
        oper.setName("SIO_POS014");
        param = new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("urn:ecc:pos:base:dealup", "MT_POS014"), org.apache.axis.description.ParameterDesc.IN, new javax.xml.namespace.QName("urn:ecc:pos:base:dealup", "DT_POS014"), com.esb.jinying.sap.dealup.base.pos.ecc.DT_POS014ITEMS[].class, false, false);
        param.setItemQName(new javax.xml.namespace.QName("", "ITEMS"));
        oper.addParameter(param);
        oper.setReturnType(org.apache.axis.encoding.XMLType.AXIS_VOID);
        oper.setStyle(org.apache.axis.constants.Style.DOCUMENT);
        oper.setUse(org.apache.axis.constants.Use.LITERAL);
        _operations[7] = oper;

        oper = new org.apache.axis.description.OperationDesc();
        oper.setName("SIO_POS019");
        param = new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("urn:ecc:pos:base:dealup", "MT_POS019"), org.apache.axis.description.ParameterDesc.IN, new javax.xml.namespace.QName("urn:ecc:pos:base:dealup", "DT_POS019"), com.esb.jinying.sap.dealup.base.pos.ecc.DT_POS019ITEMS[].class, false, false);
        param.setItemQName(new javax.xml.namespace.QName("", "ITEMS"));
        oper.addParameter(param);
        oper.setReturnType(org.apache.axis.encoding.XMLType.AXIS_VOID);
        oper.setStyle(org.apache.axis.constants.Style.DOCUMENT);
        oper.setUse(org.apache.axis.constants.Use.LITERAL);
        _operations[8] = oper;

    }

    public SIO_POS_ECC_ASYBindingStub() throws org.apache.axis.AxisFault {
         this(null);
    }

    public SIO_POS_ECC_ASYBindingStub(java.net.URL endpointURL, javax.xml.rpc.Service service) throws org.apache.axis.AxisFault {
         this(service);
         super.cachedEndpoint = endpointURL;
    }

    public SIO_POS_ECC_ASYBindingStub(javax.xml.rpc.Service service) throws org.apache.axis.AxisFault {
        if (service == null) {
            super.service = new org.apache.axis.client.Service();
        } else {
            super.service = service;
        }
        ((org.apache.axis.client.Service)super.service).setTypeMappingVersion("1.2");
            java.lang.Class cls;
            javax.xml.namespace.QName qName;
            javax.xml.namespace.QName qName2;
            java.lang.Class beansf = org.apache.axis.encoding.ser.BeanSerializerFactory.class;
            java.lang.Class beandf = org.apache.axis.encoding.ser.BeanDeserializerFactory.class;
            java.lang.Class enumsf = org.apache.axis.encoding.ser.EnumSerializerFactory.class;
            java.lang.Class enumdf = org.apache.axis.encoding.ser.EnumDeserializerFactory.class;
            java.lang.Class arraysf = org.apache.axis.encoding.ser.ArraySerializerFactory.class;
            java.lang.Class arraydf = org.apache.axis.encoding.ser.ArrayDeserializerFactory.class;
            java.lang.Class simplesf = org.apache.axis.encoding.ser.SimpleSerializerFactory.class;
            java.lang.Class simpledf = org.apache.axis.encoding.ser.SimpleDeserializerFactory.class;
            java.lang.Class simplelistsf = org.apache.axis.encoding.ser.SimpleListSerializerFactory.class;
            java.lang.Class simplelistdf = org.apache.axis.encoding.ser.SimpleListDeserializerFactory.class;
            qName = new javax.xml.namespace.QName("urn:ecc:pos:base:dealup", ">DT_POS003C>ITEMS");
            cachedSerQNames.add(qName);
            cls = com.esb.jinying.sap.dealup.base.pos.ecc.DT_POS003CITEMS.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("urn:ecc:pos:base:dealup", ">DT_POS013>ITEMS");
            cachedSerQNames.add(qName);
            cls = com.esb.jinying.sap.dealup.base.pos.ecc.DT_POS013ITEMS.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("urn:ecc:pos:base:dealup", ">DT_POS014>ITEMS");
            cachedSerQNames.add(qName);
            cls = com.esb.jinying.sap.dealup.base.pos.ecc.DT_POS014ITEMS.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("urn:ecc:pos:base:dealup", ">DT_POS015>ITEMS");
            cachedSerQNames.add(qName);
            cls = com.esb.jinying.sap.dealup.base.pos.ecc.DT_POS015ITEMS.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("urn:ecc:pos:base:dealup", ">DT_POS016>ITEMS");
            cachedSerQNames.add(qName);
            cls = com.esb.jinying.sap.dealup.base.pos.ecc.DT_POS016ITEMS.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("urn:ecc:pos:base:dealup", ">DT_POS017>ITEMS");
            cachedSerQNames.add(qName);
            cls = com.esb.jinying.sap.dealup.base.pos.ecc.DT_POS017ITEMS.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("urn:ecc:pos:base:dealup", ">DT_POS018>ITEMS");
            cachedSerQNames.add(qName);
            cls = com.esb.jinying.sap.dealup.base.pos.ecc.DT_POS018ITEMS.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("urn:ecc:pos:base:dealup", ">DT_POS019>ITEMS");
            cachedSerQNames.add(qName);
            cls = com.esb.jinying.sap.dealup.base.pos.ecc.DT_POS019ITEMS.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("urn:ecc:pos:base:dealup", ">DT_POS020>ITEMS");
            cachedSerQNames.add(qName);
            cls = com.esb.jinying.sap.dealup.base.pos.ecc.DT_POS020ITEMS.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("urn:ecc:pos:base:dealup", "DT_POS003C");
            cachedSerQNames.add(qName);
            cls = com.esb.jinying.sap.dealup.base.pos.ecc.DT_POS003CITEMS[].class;
            cachedSerClasses.add(cls);
            qName = new javax.xml.namespace.QName("urn:ecc:pos:base:dealup", ">DT_POS003C>ITEMS");
            qName2 = new javax.xml.namespace.QName("", "ITEMS");
            cachedSerFactories.add(new org.apache.axis.encoding.ser.ArraySerializerFactory(qName, qName2));
            cachedDeserFactories.add(new org.apache.axis.encoding.ser.ArrayDeserializerFactory());

            qName = new javax.xml.namespace.QName("urn:ecc:pos:base:dealup", "DT_POS013");
            cachedSerQNames.add(qName);
            cls = com.esb.jinying.sap.dealup.base.pos.ecc.DT_POS013ITEMS[].class;
            cachedSerClasses.add(cls);
            qName = new javax.xml.namespace.QName("urn:ecc:pos:base:dealup", ">DT_POS013>ITEMS");
            qName2 = new javax.xml.namespace.QName("", "ITEMS");
            cachedSerFactories.add(new org.apache.axis.encoding.ser.ArraySerializerFactory(qName, qName2));
            cachedDeserFactories.add(new org.apache.axis.encoding.ser.ArrayDeserializerFactory());

            qName = new javax.xml.namespace.QName("urn:ecc:pos:base:dealup", "DT_POS014");
            cachedSerQNames.add(qName);
            cls = com.esb.jinying.sap.dealup.base.pos.ecc.DT_POS014ITEMS[].class;
            cachedSerClasses.add(cls);
            qName = new javax.xml.namespace.QName("urn:ecc:pos:base:dealup", ">DT_POS014>ITEMS");
            qName2 = new javax.xml.namespace.QName("", "ITEMS");
            cachedSerFactories.add(new org.apache.axis.encoding.ser.ArraySerializerFactory(qName, qName2));
            cachedDeserFactories.add(new org.apache.axis.encoding.ser.ArrayDeserializerFactory());

            qName = new javax.xml.namespace.QName("urn:ecc:pos:base:dealup", "DT_POS015");
            cachedSerQNames.add(qName);
            cls = com.esb.jinying.sap.dealup.base.pos.ecc.DT_POS015ITEMS[].class;
            cachedSerClasses.add(cls);
            qName = new javax.xml.namespace.QName("urn:ecc:pos:base:dealup", ">DT_POS015>ITEMS");
            qName2 = new javax.xml.namespace.QName("", "ITEMS");
            cachedSerFactories.add(new org.apache.axis.encoding.ser.ArraySerializerFactory(qName, qName2));
            cachedDeserFactories.add(new org.apache.axis.encoding.ser.ArrayDeserializerFactory());

            qName = new javax.xml.namespace.QName("urn:ecc:pos:base:dealup", "DT_POS016");
            cachedSerQNames.add(qName);
            cls = com.esb.jinying.sap.dealup.base.pos.ecc.DT_POS016ITEMS[].class;
            cachedSerClasses.add(cls);
            qName = new javax.xml.namespace.QName("urn:ecc:pos:base:dealup", ">DT_POS016>ITEMS");
            qName2 = new javax.xml.namespace.QName("", "ITEMS");
            cachedSerFactories.add(new org.apache.axis.encoding.ser.ArraySerializerFactory(qName, qName2));
            cachedDeserFactories.add(new org.apache.axis.encoding.ser.ArrayDeserializerFactory());

            qName = new javax.xml.namespace.QName("urn:ecc:pos:base:dealup", "DT_POS017");
            cachedSerQNames.add(qName);
            cls = com.esb.jinying.sap.dealup.base.pos.ecc.DT_POS017ITEMS[].class;
            cachedSerClasses.add(cls);
            qName = new javax.xml.namespace.QName("urn:ecc:pos:base:dealup", ">DT_POS017>ITEMS");
            qName2 = new javax.xml.namespace.QName("", "ITEMS");
            cachedSerFactories.add(new org.apache.axis.encoding.ser.ArraySerializerFactory(qName, qName2));
            cachedDeserFactories.add(new org.apache.axis.encoding.ser.ArrayDeserializerFactory());

            qName = new javax.xml.namespace.QName("urn:ecc:pos:base:dealup", "DT_POS018");
            cachedSerQNames.add(qName);
            cls = com.esb.jinying.sap.dealup.base.pos.ecc.DT_POS018ITEMS[].class;
            cachedSerClasses.add(cls);
            qName = new javax.xml.namespace.QName("urn:ecc:pos:base:dealup", ">DT_POS018>ITEMS");
            qName2 = new javax.xml.namespace.QName("", "ITEMS");
            cachedSerFactories.add(new org.apache.axis.encoding.ser.ArraySerializerFactory(qName, qName2));
            cachedDeserFactories.add(new org.apache.axis.encoding.ser.ArrayDeserializerFactory());

            qName = new javax.xml.namespace.QName("urn:ecc:pos:base:dealup", "DT_POS019");
            cachedSerQNames.add(qName);
            cls = com.esb.jinying.sap.dealup.base.pos.ecc.DT_POS019ITEMS[].class;
            cachedSerClasses.add(cls);
            qName = new javax.xml.namespace.QName("urn:ecc:pos:base:dealup", ">DT_POS019>ITEMS");
            qName2 = new javax.xml.namespace.QName("", "ITEMS");
            cachedSerFactories.add(new org.apache.axis.encoding.ser.ArraySerializerFactory(qName, qName2));
            cachedDeserFactories.add(new org.apache.axis.encoding.ser.ArrayDeserializerFactory());

            qName = new javax.xml.namespace.QName("urn:ecc:pos:base:dealup", "DT_POS020");
            cachedSerQNames.add(qName);
            cls = com.esb.jinying.sap.dealup.base.pos.ecc.DT_POS020ITEMS[].class;
            cachedSerClasses.add(cls);
            qName = new javax.xml.namespace.QName("urn:ecc:pos:base:dealup", ">DT_POS020>ITEMS");
            qName2 = new javax.xml.namespace.QName("", "ITEMS");
            cachedSerFactories.add(new org.apache.axis.encoding.ser.ArraySerializerFactory(qName, qName2));
            cachedDeserFactories.add(new org.apache.axis.encoding.ser.ArrayDeserializerFactory());

    }

    protected org.apache.axis.client.Call createCall() throws java.rmi.RemoteException {
        try {
            org.apache.axis.client.Call _call = super._createCall();
            if (super.maintainSessionSet) {
                _call.setMaintainSession(super.maintainSession);
            }
            if (super.cachedUsername != null) {
                _call.setUsername(super.cachedUsername);
            }
            if (super.cachedPassword != null) {
                _call.setPassword(super.cachedPassword);
            }
            if (super.cachedEndpoint != null) {
                _call.setTargetEndpointAddress(super.cachedEndpoint);
            }
            if (super.cachedTimeout != null) {
                _call.setTimeout(super.cachedTimeout);
            }
            if (super.cachedPortName != null) {
                _call.setPortName(super.cachedPortName);
            }
            java.util.Enumeration keys = super.cachedProperties.keys();
            while (keys.hasMoreElements()) {
                java.lang.String key = (java.lang.String) keys.nextElement();
                _call.setProperty(key, super.cachedProperties.get(key));
            }
            // All the type mapping information is registered
            // when the first call is made.
            // The type mapping information is actually registered in
            // the TypeMappingRegistry of the service, which
            // is the reason why registration is only needed for the first call.
            synchronized (this) {
                if (firstCall()) {
                    // must set encoding style before registering serializers
                    _call.setEncodingStyle(null);
                    for (int i = 0; i < cachedSerFactories.size(); ++i) {
                        java.lang.Class cls = (java.lang.Class) cachedSerClasses.get(i);
                        javax.xml.namespace.QName qName =
                                (javax.xml.namespace.QName) cachedSerQNames.get(i);
                        java.lang.Object x = cachedSerFactories.get(i);
                        if (x instanceof Class) {
                            java.lang.Class sf = (java.lang.Class)
                                 cachedSerFactories.get(i);
                            java.lang.Class df = (java.lang.Class)
                                 cachedDeserFactories.get(i);
                            _call.registerTypeMapping(cls, qName, sf, df, false);
                        }
                        else if (x instanceof javax.xml.rpc.encoding.SerializerFactory) {
                            org.apache.axis.encoding.SerializerFactory sf = (org.apache.axis.encoding.SerializerFactory)
                                 cachedSerFactories.get(i);
                            org.apache.axis.encoding.DeserializerFactory df = (org.apache.axis.encoding.DeserializerFactory)
                                 cachedDeserFactories.get(i);
                            _call.registerTypeMapping(cls, qName, sf, df, false);
                        }
                    }
                }
            }
            return _call;
        }
        catch (java.lang.Throwable _t) {
            throw new org.apache.axis.AxisFault("Failure trying to get the Call object", _t);
        }
    }

    public void SIO_POS017(com.esb.jinying.sap.dealup.base.pos.ecc.DT_POS017ITEMS[] MT_POS017) throws java.rmi.RemoteException {
        if (super.cachedEndpoint == null) {
            throw new org.apache.axis.NoEndPointException();
        }
        org.apache.axis.client.Call _call = createCall();
        _call.setOperation(_operations[0]);
        _call.setUseSOAPAction(true);
        _call.setSOAPActionURI("http://sap.com/xi/WebService/soap1.1");
        _call.setEncodingStyle(null);
        _call.setProperty(org.apache.axis.client.Call.SEND_TYPE_ATTR, Boolean.FALSE);
        _call.setProperty(org.apache.axis.AxisEngine.PROP_DOMULTIREFS, Boolean.FALSE);
        _call.setSOAPVersion(org.apache.axis.soap.SOAPConstants.SOAP11_CONSTANTS);
        _call.setOperationName(new javax.xml.namespace.QName("", "SIO_POS017"));

        setRequestHeaders(_call);
        setAttachments(_call);
        _call.invokeOneWay(new java.lang.Object[] {MT_POS017});

    }

    public void SIO_POS015(com.esb.jinying.sap.dealup.base.pos.ecc.DT_POS015ITEMS[] MT_POS015) throws java.rmi.RemoteException {
        if (super.cachedEndpoint == null) {
            throw new org.apache.axis.NoEndPointException();
        }
        org.apache.axis.client.Call _call = createCall();
        _call.setOperation(_operations[1]);
        _call.setUseSOAPAction(true);
        _call.setSOAPActionURI("http://sap.com/xi/WebService/soap1.1");
        _call.setEncodingStyle(null);
        _call.setProperty(org.apache.axis.client.Call.SEND_TYPE_ATTR, Boolean.FALSE);
        _call.setProperty(org.apache.axis.AxisEngine.PROP_DOMULTIREFS, Boolean.FALSE);
        _call.setSOAPVersion(org.apache.axis.soap.SOAPConstants.SOAP11_CONSTANTS);
        _call.setOperationName(new javax.xml.namespace.QName("", "SIO_POS015"));

        setRequestHeaders(_call);
        setAttachments(_call);
        _call.invokeOneWay(new java.lang.Object[] {MT_POS015});

    }

    public void SIO_POS018(com.esb.jinying.sap.dealup.base.pos.ecc.DT_POS018ITEMS[] MT_POS018) throws java.rmi.RemoteException {
        if (super.cachedEndpoint == null) {
            throw new org.apache.axis.NoEndPointException();
        }
        org.apache.axis.client.Call _call = createCall();
        _call.setOperation(_operations[2]);
        _call.setUseSOAPAction(true);
        _call.setSOAPActionURI("http://sap.com/xi/WebService/soap1.1");
        _call.setEncodingStyle(null);
        _call.setProperty(org.apache.axis.client.Call.SEND_TYPE_ATTR, Boolean.FALSE);
        _call.setProperty(org.apache.axis.AxisEngine.PROP_DOMULTIREFS, Boolean.FALSE);
        _call.setSOAPVersion(org.apache.axis.soap.SOAPConstants.SOAP11_CONSTANTS);
        _call.setOperationName(new javax.xml.namespace.QName("", "SIO_POS018"));

        setRequestHeaders(_call);
        setAttachments(_call);
        _call.invokeOneWay(new java.lang.Object[] {MT_POS018});

    }

    public void SIO_POS020(com.esb.jinying.sap.dealup.base.pos.ecc.DT_POS020ITEMS[] MT_POS020) throws java.rmi.RemoteException {
        if (super.cachedEndpoint == null) {
            throw new org.apache.axis.NoEndPointException();
        }
        org.apache.axis.client.Call _call = createCall();
        _call.setOperation(_operations[3]);
        _call.setUseSOAPAction(true);
        _call.setSOAPActionURI("http://sap.com/xi/WebService/soap1.1");
        _call.setEncodingStyle(null);
        _call.setProperty(org.apache.axis.client.Call.SEND_TYPE_ATTR, Boolean.FALSE);
        _call.setProperty(org.apache.axis.AxisEngine.PROP_DOMULTIREFS, Boolean.FALSE);
        _call.setSOAPVersion(org.apache.axis.soap.SOAPConstants.SOAP11_CONSTANTS);
        _call.setOperationName(new javax.xml.namespace.QName("", "SIO_POS020"));

        setRequestHeaders(_call);
        setAttachments(_call);
        _call.invokeOneWay(new java.lang.Object[] {MT_POS020});

    }

    public void SIO_POS016(com.esb.jinying.sap.dealup.base.pos.ecc.DT_POS016ITEMS[] MT_POS016) throws java.rmi.RemoteException {
        if (super.cachedEndpoint == null) {
            throw new org.apache.axis.NoEndPointException();
        }
        org.apache.axis.client.Call _call = createCall();
        _call.setOperation(_operations[4]);
        _call.setUseSOAPAction(true);
        _call.setSOAPActionURI("http://sap.com/xi/WebService/soap1.1");
        _call.setEncodingStyle(null);
        _call.setProperty(org.apache.axis.client.Call.SEND_TYPE_ATTR, Boolean.FALSE);
        _call.setProperty(org.apache.axis.AxisEngine.PROP_DOMULTIREFS, Boolean.FALSE);
        _call.setSOAPVersion(org.apache.axis.soap.SOAPConstants.SOAP11_CONSTANTS);
        _call.setOperationName(new javax.xml.namespace.QName("", "SIO_POS016"));

        setRequestHeaders(_call);
        setAttachments(_call);
        _call.invokeOneWay(new java.lang.Object[] {MT_POS016});

    }

    public void SIO_POS003C(com.esb.jinying.sap.dealup.base.pos.ecc.DT_POS003CITEMS[] MT_POS003C) throws java.rmi.RemoteException {
        if (super.cachedEndpoint == null) {
            throw new org.apache.axis.NoEndPointException();
        }
        org.apache.axis.client.Call _call = createCall();
        _call.setOperation(_operations[5]);
        _call.setUseSOAPAction(true);
        _call.setSOAPActionURI("http://sap.com/xi/WebService/soap1.1");
        _call.setEncodingStyle(null);
        _call.setProperty(org.apache.axis.client.Call.SEND_TYPE_ATTR, Boolean.FALSE);
        _call.setProperty(org.apache.axis.AxisEngine.PROP_DOMULTIREFS, Boolean.FALSE);
        _call.setSOAPVersion(org.apache.axis.soap.SOAPConstants.SOAP11_CONSTANTS);
        _call.setOperationName(new javax.xml.namespace.QName("", "SIO_POS003C"));

        setRequestHeaders(_call);
        setAttachments(_call);
        _call.invokeOneWay(new java.lang.Object[] {MT_POS003C});

    }

    public void SIO_POS013(com.esb.jinying.sap.dealup.base.pos.ecc.DT_POS013ITEMS[] MT_POS013) throws java.rmi.RemoteException {
        if (super.cachedEndpoint == null) {
            throw new org.apache.axis.NoEndPointException();
        }
        org.apache.axis.client.Call _call = createCall();
        _call.setOperation(_operations[6]);
        _call.setUseSOAPAction(true);
        _call.setSOAPActionURI("http://sap.com/xi/WebService/soap1.1");
        _call.setEncodingStyle(null);
        _call.setProperty(org.apache.axis.client.Call.SEND_TYPE_ATTR, Boolean.FALSE);
        _call.setProperty(org.apache.axis.AxisEngine.PROP_DOMULTIREFS, Boolean.FALSE);
        _call.setSOAPVersion(org.apache.axis.soap.SOAPConstants.SOAP11_CONSTANTS);
        _call.setOperationName(new javax.xml.namespace.QName("", "SIO_POS013"));

        setRequestHeaders(_call);
        setAttachments(_call);
        _call.invokeOneWay(new java.lang.Object[] {MT_POS013});

    }

    public void SIO_POS014(com.esb.jinying.sap.dealup.base.pos.ecc.DT_POS014ITEMS[] MT_POS014) throws java.rmi.RemoteException {
        if (super.cachedEndpoint == null) {
            throw new org.apache.axis.NoEndPointException();
        }
        org.apache.axis.client.Call _call = createCall();
        _call.setOperation(_operations[7]);
        _call.setUseSOAPAction(true);
        _call.setSOAPActionURI("http://sap.com/xi/WebService/soap1.1");
        _call.setEncodingStyle(null);
        _call.setProperty(org.apache.axis.client.Call.SEND_TYPE_ATTR, Boolean.FALSE);
        _call.setProperty(org.apache.axis.AxisEngine.PROP_DOMULTIREFS, Boolean.FALSE);
        _call.setSOAPVersion(org.apache.axis.soap.SOAPConstants.SOAP11_CONSTANTS);
        _call.setOperationName(new javax.xml.namespace.QName("", "SIO_POS014"));

        setRequestHeaders(_call);
        setAttachments(_call);
        _call.invokeOneWay(new java.lang.Object[] {MT_POS014});

    }

    public void SIO_POS019(com.esb.jinying.sap.dealup.base.pos.ecc.DT_POS019ITEMS[] MT_POS019) throws java.rmi.RemoteException {
        if (super.cachedEndpoint == null) {
            throw new org.apache.axis.NoEndPointException();
        }
        org.apache.axis.client.Call _call = createCall();
        _call.setOperation(_operations[8]);
        _call.setUseSOAPAction(true);
        _call.setSOAPActionURI("http://sap.com/xi/WebService/soap1.1");
        _call.setEncodingStyle(null);
        _call.setProperty(org.apache.axis.client.Call.SEND_TYPE_ATTR, Boolean.FALSE);
        _call.setProperty(org.apache.axis.AxisEngine.PROP_DOMULTIREFS, Boolean.FALSE);
        _call.setSOAPVersion(org.apache.axis.soap.SOAPConstants.SOAP11_CONSTANTS);
        _call.setOperationName(new javax.xml.namespace.QName("", "SIO_POS019"));

        setRequestHeaders(_call);
        setAttachments(_call);
        _call.invokeOneWay(new java.lang.Object[] {MT_POS019});

    }

}
