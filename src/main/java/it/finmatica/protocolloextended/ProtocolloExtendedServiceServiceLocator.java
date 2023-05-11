/**
 * ProtocolloExtendedServiceServiceLocator.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package it.finmatica.protocolloextended;

public class ProtocolloExtendedServiceServiceLocator extends org.apache.axis.client.Service implements it.finmatica.protocolloextended.ProtocolloExtendedServiceService {

    public ProtocolloExtendedServiceServiceLocator() {
    }


    public ProtocolloExtendedServiceServiceLocator(org.apache.axis.EngineConfiguration config) {
        super(config);
    }

    public ProtocolloExtendedServiceServiceLocator(java.lang.String wsdlLoc, javax.xml.namespace.QName sName) throws javax.xml.rpc.ServiceException {
        super(wsdlLoc, sName);
    }

    // Use to get a proxy class for ProtocolloExtendedServicePort
    private java.lang.String ProtocolloExtendedServicePort_address = "http://141.138.81.203:8888/agspr/services/ProtocolloExtendedServicePort";

    public java.lang.String getProtocolloExtendedServicePortAddress() {
        return ProtocolloExtendedServicePort_address;
    }

    // The WSDD service name defaults to the port name.
    private java.lang.String ProtocolloExtendedServicePortWSDDServiceName = "ProtocolloExtendedServicePort";

    public java.lang.String getProtocolloExtendedServicePortWSDDServiceName() {
        return ProtocolloExtendedServicePortWSDDServiceName;
    }

    public void setProtocolloExtendedServicePortWSDDServiceName(java.lang.String name) {
        ProtocolloExtendedServicePortWSDDServiceName = name;
    }

    public it.finmatica.protocolloextended.ProtocolloExtendedService getProtocolloExtendedServicePort() throws javax.xml.rpc.ServiceException {
       java.net.URL endpoint;
        try {
            endpoint = new java.net.URL(ProtocolloExtendedServicePort_address);
        }
        catch (java.net.MalformedURLException e) {
            throw new javax.xml.rpc.ServiceException(e);
        }
        return getProtocolloExtendedServicePort(endpoint);
    }

    public it.finmatica.protocolloextended.ProtocolloExtendedService getProtocolloExtendedServicePort(java.net.URL portAddress) throws javax.xml.rpc.ServiceException {
        try {
            it.finmatica.protocolloextended.ProtocolloExtendedServiceServiceSoapBindingStub _stub = new it.finmatica.protocolloextended.ProtocolloExtendedServiceServiceSoapBindingStub(portAddress, this);
            _stub.setPortName(getProtocolloExtendedServicePortWSDDServiceName());
            return _stub;
        }
        catch (org.apache.axis.AxisFault e) {
            return null;
        }
    }

    public void setProtocolloExtendedServicePortEndpointAddress(java.lang.String address) {
        ProtocolloExtendedServicePort_address = address;
    }

    /**
     * For the given interface, get the stub implementation.
     * If this service has no port for the given interface,
     * then ServiceException is thrown.
     */
    public java.rmi.Remote getPort(Class serviceEndpointInterface) throws javax.xml.rpc.ServiceException {
        try {
            if (it.finmatica.protocolloextended.ProtocolloExtendedService.class.isAssignableFrom(serviceEndpointInterface)) {
                it.finmatica.protocolloextended.ProtocolloExtendedServiceServiceSoapBindingStub _stub = new it.finmatica.protocolloextended.ProtocolloExtendedServiceServiceSoapBindingStub(new java.net.URL(ProtocolloExtendedServicePort_address), this);
                _stub.setPortName(getProtocolloExtendedServicePortWSDDServiceName());
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
        if ("ProtocolloExtendedServicePort".equals(inputPortName)) {
            return getProtocolloExtendedServicePort();
        }
        else  {
            java.rmi.Remote _stub = getPort(serviceEndpointInterface);
            ((org.apache.axis.client.Stub) _stub).setPortName(portName);
            return _stub;
        }
    }

    public javax.xml.namespace.QName getServiceName() {
        return new javax.xml.namespace.QName("http://protocolloextended.finmatica.it/", "ProtocolloExtendedServiceService");
    }

    private java.util.HashSet ports = null;

    public java.util.Iterator getPorts() {
        if (ports == null) {
            ports = new java.util.HashSet();
            ports.add(new javax.xml.namespace.QName("http://protocolloextended.finmatica.it/", "ProtocolloExtendedServicePort"));
        }
        return ports.iterator();
    }

    /**
    * Set the endpoint address for the specified port name.
    */
    public void setEndpointAddress(java.lang.String portName, java.lang.String address) throws javax.xml.rpc.ServiceException {
        
if ("ProtocolloExtendedServicePort".equals(portName)) {
            setProtocolloExtendedServicePortEndpointAddress(address);
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
