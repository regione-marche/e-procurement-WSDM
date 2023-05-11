/**
 * FascicoliWebServiceServiceLocator.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package it.fascicoliwebservice;

public class FascicoliWebServiceServiceLocator extends org.apache.axis.client.Service implements it.fascicoliwebservice.FascicoliWebServiceService {

    public FascicoliWebServiceServiceLocator() {
    }


    public FascicoliWebServiceServiceLocator(org.apache.axis.EngineConfiguration config) {
        super(config);
    }

    public FascicoliWebServiceServiceLocator(java.lang.String wsdlLoc, javax.xml.namespace.QName sName) throws javax.xml.rpc.ServiceException {
        super(wsdlLoc, sName);
    }

    // Use to get a proxy class for FascicoliWebService
    private java.lang.String FascicoliWebService_address = "http://test.laitspa.it/CollProtocolloProsa/services/FascicoliWebService";

    public java.lang.String getFascicoliWebServiceAddress() {
        return FascicoliWebService_address;
    }

    // The WSDD service name defaults to the port name.
    private java.lang.String FascicoliWebServiceWSDDServiceName = "FascicoliWebService";

    public java.lang.String getFascicoliWebServiceWSDDServiceName() {
        return FascicoliWebServiceWSDDServiceName;
    }

    public void setFascicoliWebServiceWSDDServiceName(java.lang.String name) {
        FascicoliWebServiceWSDDServiceName = name;
    }

    public it.fascicoliwebservice.FascicoliWebService getFascicoliWebService() throws javax.xml.rpc.ServiceException {
       java.net.URL endpoint;
        try {
            endpoint = new java.net.URL(FascicoliWebService_address);
        }
        catch (java.net.MalformedURLException e) {
            throw new javax.xml.rpc.ServiceException(e);
        }
        return getFascicoliWebService(endpoint);
    }

    public it.fascicoliwebservice.FascicoliWebService getFascicoliWebService(java.net.URL portAddress) throws javax.xml.rpc.ServiceException {
        try {
            it.fascicoliwebservice.FascicoliWebServiceSoapBindingStub _stub = new it.fascicoliwebservice.FascicoliWebServiceSoapBindingStub(portAddress, this);
            _stub.setPortName(getFascicoliWebServiceWSDDServiceName());
            return _stub;
        }
        catch (org.apache.axis.AxisFault e) {
            return null;
        }
    }

    public void setFascicoliWebServiceEndpointAddress(java.lang.String address) {
        FascicoliWebService_address = address;
    }

    /**
     * For the given interface, get the stub implementation.
     * If this service has no port for the given interface,
     * then ServiceException is thrown.
     */
    public java.rmi.Remote getPort(Class serviceEndpointInterface) throws javax.xml.rpc.ServiceException {
        try {
            if (it.fascicoliwebservice.FascicoliWebService.class.isAssignableFrom(serviceEndpointInterface)) {
                it.fascicoliwebservice.FascicoliWebServiceSoapBindingStub _stub = new it.fascicoliwebservice.FascicoliWebServiceSoapBindingStub(new java.net.URL(FascicoliWebService_address), this);
                _stub.setPortName(getFascicoliWebServiceWSDDServiceName());
                return _stub;
            }
        }
        catch (java.lang.Throwable t) {
            throw new javax.xml.rpc.ServiceException(t);
        }
        throw new javax.xml.rpc.ServiceException("There is no stub implementation for the interface:  " + (serviceEndpointInterface == null ? "null" : serviceEndpointInterface.getName()));
    }

    /**
     * For the given interface, get the stub implementation.
     * If this service has no port for the given interface,
     * then ServiceException is thrown.
     */
    public java.rmi.Remote getPort(javax.xml.namespace.QName portName, Class serviceEndpointInterface) throws javax.xml.rpc.ServiceException {
        if (portName == null) {
            return getPort(serviceEndpointInterface);
        }
        java.lang.String inputPortName = portName.getLocalPart();
        if ("FascicoliWebService".equals(inputPortName)) {
            return getFascicoliWebService();
        }
        else  {
            java.rmi.Remote _stub = getPort(serviceEndpointInterface);
            ((org.apache.axis.client.Stub) _stub).setPortName(portName);
            return _stub;
        }
    }

    public javax.xml.namespace.QName getServiceName() {
        return new javax.xml.namespace.QName("urn:FascicoliWebService", "FascicoliWebServiceService");
    }

    private java.util.HashSet ports = null;

    public java.util.Iterator getPorts() {
        if (ports == null) {
            ports = new java.util.HashSet();
            ports.add(new javax.xml.namespace.QName("urn:FascicoliWebService", "FascicoliWebService"));
        }
        return ports.iterator();
    }

    /**
    * Set the endpoint address for the specified port name.
    */
    public void setEndpointAddress(java.lang.String portName, java.lang.String address) throws javax.xml.rpc.ServiceException {
        
if ("FascicoliWebService".equals(portName)) {
            setFascicoliWebServiceEndpointAddress(address);
        }
        else 
{ // Unknown Port Name
            throw new javax.xml.rpc.ServiceException(" Cannot set Endpoint Address for Unknown Port" + portName);
        }
    }

    /**
    * Set the endpoint address for the specified port name.
    */
    public void setEndpointAddress(javax.xml.namespace.QName portName, java.lang.String address) throws javax.xml.rpc.ServiceException {
        setEndpointAddress(portName.getLocalPart(), address);
    }

}
