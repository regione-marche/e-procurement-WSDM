/**
 * ProWsProtocolloLocator.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package it.italprot.prowsprotocollo;

public class ProWsProtocolloLocator extends org.apache.axis.client.Service implements it.italprot.prowsprotocollo.ProWsProtocollo {

    public ProWsProtocolloLocator() {
    }


    public ProWsProtocolloLocator(org.apache.axis.EngineConfiguration config) {
        super(config);
    }

    public ProWsProtocolloLocator(java.lang.String wsdlLoc, javax.xml.namespace.QName sName) throws javax.xml.rpc.ServiceException {
        super(wsdlLoc, sName);
    }

    // Use to get a proxy class for proWsProtocolloPort
    private java.lang.String proWsProtocolloPort_address = "http://93.43.91.194:5443/itaTest/ws/Protocollo/proWsProtocollo.php";

    public java.lang.String getproWsProtocolloPortAddress() {
        return proWsProtocolloPort_address;
    }

    // The WSDD service name defaults to the port name.
    private java.lang.String proWsProtocolloPortWSDDServiceName = "proWsProtocolloPort";

    public java.lang.String getproWsProtocolloPortWSDDServiceName() {
        return proWsProtocolloPortWSDDServiceName;
    }

    public void setproWsProtocolloPortWSDDServiceName(java.lang.String name) {
        proWsProtocolloPortWSDDServiceName = name;
    }

    public it.italprot.prowsprotocollo.ProWsProtocolloPortType getproWsProtocolloPort() throws javax.xml.rpc.ServiceException {
       java.net.URL endpoint;
        try {
            endpoint = new java.net.URL(proWsProtocolloPort_address);
        }
        catch (java.net.MalformedURLException e) {
            throw new javax.xml.rpc.ServiceException(e);
        }
        return getproWsProtocolloPort(endpoint);
    }

    public it.italprot.prowsprotocollo.ProWsProtocolloPortType getproWsProtocolloPort(java.net.URL portAddress) throws javax.xml.rpc.ServiceException {
        try {
            it.italprot.prowsprotocollo.ProWsProtocolloBindingStub _stub = new it.italprot.prowsprotocollo.ProWsProtocolloBindingStub(portAddress, this);
            _stub.setPortName(getproWsProtocolloPortWSDDServiceName());
            return _stub;
        }
        catch (org.apache.axis.AxisFault e) {
            return null;
        }
    }

    public void setproWsProtocolloPortEndpointAddress(java.lang.String address) {
        proWsProtocolloPort_address = address;
    }

    /**
     * For the given interface, get the stub implementation.
     * If this service has no port for the given interface,
     * then ServiceException is thrown.
     */
    public java.rmi.Remote getPort(Class serviceEndpointInterface) throws javax.xml.rpc.ServiceException {
        try {
            if (it.italprot.prowsprotocollo.ProWsProtocolloPortType.class.isAssignableFrom(serviceEndpointInterface)) {
                it.italprot.prowsprotocollo.ProWsProtocolloBindingStub _stub = new it.italprot.prowsprotocollo.ProWsProtocolloBindingStub(new java.net.URL(proWsProtocolloPort_address), this);
                _stub.setPortName(getproWsProtocolloPortWSDDServiceName());
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
        if ("proWsProtocolloPort".equals(inputPortName)) {
            return getproWsProtocolloPort();
        }
        else  {
            java.rmi.Remote _stub = getPort(serviceEndpointInterface);
            ((org.apache.axis.client.Stub) _stub).setPortName(portName);
            return _stub;
        }
    }

    public javax.xml.namespace.QName getServiceName() {
        return new javax.xml.namespace.QName("urn:proWsProtocollo", "proWsProtocollo");
    }

    private java.util.HashSet ports = null;

    public java.util.Iterator getPorts() {
        if (ports == null) {
            ports = new java.util.HashSet();
            ports.add(new javax.xml.namespace.QName("urn:proWsProtocollo", "proWsProtocolloPort"));
        }
        return ports.iterator();
    }

    /**
    * Set the endpoint address for the specified port name.
    */
    public void setEndpointAddress(java.lang.String portName, java.lang.String address) throws javax.xml.rpc.ServiceException {
        
if ("proWsProtocolloPort".equals(portName)) {
            setproWsProtocolloPortEndpointAddress(address);
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
