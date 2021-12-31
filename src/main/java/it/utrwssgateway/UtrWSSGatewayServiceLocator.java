/**
 * UtrWSSGatewayServiceLocator.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package it.utrwssgateway;

public class UtrWSSGatewayServiceLocator extends org.apache.axis.client.Service implements it.utrwssgateway.UtrWSSGatewayService {

    public UtrWSSGatewayServiceLocator() {
    }


    public UtrWSSGatewayServiceLocator(org.apache.axis.EngineConfiguration config) {
        super(config);
    }

    public UtrWSSGatewayServiceLocator(java.lang.String wsdlLoc, javax.xml.namespace.QName sName) throws javax.xml.rpc.ServiceException {
        super(wsdlLoc, sName);
    }

    // Use to get a proxy class for UtrWSSGateway
    private java.lang.String UtrWSSGateway_address = "http://www.cedaf.it/client/services/UtrWSSGateway";

    public java.lang.String getUtrWSSGatewayAddress() {
        return UtrWSSGateway_address;
    }

    // The WSDD service name defaults to the port name.
    private java.lang.String UtrWSSGatewayWSDDServiceName = "UtrWSSGateway";

    public java.lang.String getUtrWSSGatewayWSDDServiceName() {
        return UtrWSSGatewayWSDDServiceName;
    }

    public void setUtrWSSGatewayWSDDServiceName(java.lang.String name) {
        UtrWSSGatewayWSDDServiceName = name;
    }

    public it.utrwssgateway.UtrWSSGateway getUtrWSSGateway() throws javax.xml.rpc.ServiceException {
       java.net.URL endpoint;
        try {
            endpoint = new java.net.URL(UtrWSSGateway_address);
        }
        catch (java.net.MalformedURLException e) {
            throw new javax.xml.rpc.ServiceException(e);
        }
        return getUtrWSSGateway(endpoint);
    }

    public it.utrwssgateway.UtrWSSGateway getUtrWSSGateway(java.net.URL portAddress) throws javax.xml.rpc.ServiceException {
        try {
            it.utrwssgateway.UtrWSSGatewaySoapBindingStub _stub = new it.utrwssgateway.UtrWSSGatewaySoapBindingStub(portAddress, this);
            _stub.setPortName(getUtrWSSGatewayWSDDServiceName());
            return _stub;
        }
        catch (org.apache.axis.AxisFault e) {
            return null;
        }
    }

    public void setUtrWSSGatewayEndpointAddress(java.lang.String address) {
        UtrWSSGateway_address = address;
    }

    /**
     * For the given interface, get the stub implementation.
     * If this service has no port for the given interface,
     * then ServiceException is thrown.
     */
    public java.rmi.Remote getPort(Class serviceEndpointInterface) throws javax.xml.rpc.ServiceException {
        try {
            if (it.utrwssgateway.UtrWSSGateway.class.isAssignableFrom(serviceEndpointInterface)) {
                it.utrwssgateway.UtrWSSGatewaySoapBindingStub _stub = new it.utrwssgateway.UtrWSSGatewaySoapBindingStub(new java.net.URL(UtrWSSGateway_address), this);
                _stub.setPortName(getUtrWSSGatewayWSDDServiceName());
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
        if ("UtrWSSGateway".equals(inputPortName)) {
            return getUtrWSSGateway();
        }
        else  {
            java.rmi.Remote _stub = getPort(serviceEndpointInterface);
            ((org.apache.axis.client.Stub) _stub).setPortName(portName);
            return _stub;
        }
    }

    public javax.xml.namespace.QName getServiceName() {
        return new javax.xml.namespace.QName("urn:UtrWSSGateway", "UtrWSSGatewayService");
    }

    private java.util.HashSet ports = null;

    public java.util.Iterator getPorts() {
        if (ports == null) {
            ports = new java.util.HashSet();
            ports.add(new javax.xml.namespace.QName("urn:UtrWSSGateway", "UtrWSSGateway"));
        }
        return ports.iterator();
    }

    /**
    * Set the endpoint address for the specified port name.
    */
    public void setEndpointAddress(java.lang.String portName, java.lang.String address) throws javax.xml.rpc.ServiceException {
        
if ("UtrWSSGateway".equals(portName)) {
            setUtrWSSGatewayEndpointAddress(address);
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
