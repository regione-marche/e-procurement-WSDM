/**
 * ProtocolloServiceLocator.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package it.viterbo.protservice;

public class ProtocolloServiceLocator extends org.apache.axis.client.Service implements it.viterbo.protservice.ProtocolloService {

    public ProtocolloServiceLocator() {
    }


    public ProtocolloServiceLocator(org.apache.axis.EngineConfiguration config) {
        super(config);
    }

    public ProtocolloServiceLocator(java.lang.String wsdlLoc, javax.xml.namespace.QName sName) throws javax.xml.rpc.ServiceException {
        super(wsdlLoc, sName);
    }

    // Use to get a proxy class for ProtocolloPort
    private java.lang.String ProtocolloPort_address = "http://10.0.9.7/protocollo/protservice.php";

    public java.lang.String getProtocolloPortAddress() {
        return ProtocolloPort_address;
    }

    // The WSDD service name defaults to the port name.
    private java.lang.String ProtocolloPortWSDDServiceName = "ProtocolloPort";

    public java.lang.String getProtocolloPortWSDDServiceName() {
        return ProtocolloPortWSDDServiceName;
    }

    public void setProtocolloPortWSDDServiceName(java.lang.String name) {
        ProtocolloPortWSDDServiceName = name;
    }

    public it.viterbo.protservice.ProtocolloPort getProtocolloPort() throws javax.xml.rpc.ServiceException {
       java.net.URL endpoint;
        try {
            endpoint = new java.net.URL(ProtocolloPort_address);
        }
        catch (java.net.MalformedURLException e) {
            throw new javax.xml.rpc.ServiceException(e);
        }
        return getProtocolloPort(endpoint);
    }

    public it.viterbo.protservice.ProtocolloPort getProtocolloPort(java.net.URL portAddress) throws javax.xml.rpc.ServiceException {
        try {
            it.viterbo.protservice.ProtocolloBindingStub _stub = new it.viterbo.protservice.ProtocolloBindingStub(portAddress, this);
            _stub.setPortName(getProtocolloPortWSDDServiceName());
            return _stub;
        }
        catch (org.apache.axis.AxisFault e) {
            return null;
        }
    }

    public void setProtocolloPortEndpointAddress(java.lang.String address) {
        ProtocolloPort_address = address;
    }

    /**
     * For the given interface, get the stub implementation.
     * If this service has no port for the given interface,
     * then ServiceException is thrown.
     */
    public java.rmi.Remote getPort(Class serviceEndpointInterface) throws javax.xml.rpc.ServiceException {
        try {
            if (it.viterbo.protservice.ProtocolloPort.class.isAssignableFrom(serviceEndpointInterface)) {
                it.viterbo.protservice.ProtocolloBindingStub _stub = new it.viterbo.protservice.ProtocolloBindingStub(new java.net.URL(ProtocolloPort_address), this);
                _stub.setPortName(getProtocolloPortWSDDServiceName());
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
        if ("ProtocolloPort".equals(inputPortName)) {
            return getProtocolloPort();
        }
        else  {
            java.rmi.Remote _stub = getPort(serviceEndpointInterface);
            ((org.apache.axis.client.Stub) _stub).setPortName(portName);
            return _stub;
        }
    }

    public javax.xml.namespace.QName getServiceName() {
        return new javax.xml.namespace.QName("urn:it.viterbo.protservice", "ProtocolloService");
    }

    private java.util.HashSet ports = null;

    public java.util.Iterator getPorts() {
        if (ports == null) {
            ports = new java.util.HashSet();
            ports.add(new javax.xml.namespace.QName("urn:it.viterbo.protservice", "ProtocolloPort"));
        }
        return ports.iterator();
    }

    /**
    * Set the endpoint address for the specified port name.
    */
    public void setEndpointAddress(java.lang.String portName, java.lang.String address) throws javax.xml.rpc.ServiceException {
        
if ("ProtocolloPort".equals(portName)) {
            setProtocolloPortEndpointAddress(address);
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
