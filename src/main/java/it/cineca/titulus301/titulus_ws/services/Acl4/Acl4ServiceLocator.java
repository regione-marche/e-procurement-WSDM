/**
 * Acl4ServiceLocator.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package it.cineca.titulus301.titulus_ws.services.Acl4;

public class Acl4ServiceLocator extends org.apache.axis.client.Service implements it.cineca.titulus301.titulus_ws.services.Acl4.Acl4Service {

    public Acl4ServiceLocator() {
    }


    public Acl4ServiceLocator(org.apache.axis.EngineConfiguration config) {
        super(config);
    }

    public Acl4ServiceLocator(java.lang.String wsdlLoc, javax.xml.namespace.QName sName) throws javax.xml.rpc.ServiceException {
        super(wsdlLoc, sName);
    }

    // Use to get a proxy class for Acl4
    private java.lang.String Acl4_address = "https://titulus301.cineca.it/titulus_ws/services/Acl4";

    public java.lang.String getAcl4Address() {
        return Acl4_address;
    }

    // The WSDD service name defaults to the port name.
    private java.lang.String Acl4WSDDServiceName = "Acl4";

    public java.lang.String getAcl4WSDDServiceName() {
        return Acl4WSDDServiceName;
    }

    public void setAcl4WSDDServiceName(java.lang.String name) {
        Acl4WSDDServiceName = name;
    }

    public it.cineca.titulus301.titulus_ws.services.Acl4.Acl4 getAcl4() throws javax.xml.rpc.ServiceException {
       java.net.URL endpoint;
        try {
            endpoint = new java.net.URL(Acl4_address);
        }
        catch (java.net.MalformedURLException e) {
            throw new javax.xml.rpc.ServiceException(e);
        }
        return getAcl4(endpoint);
    }

    public it.cineca.titulus301.titulus_ws.services.Acl4.Acl4 getAcl4(java.net.URL portAddress) throws javax.xml.rpc.ServiceException {
        try {
            it.cineca.titulus301.titulus_ws.services.Acl4.Acl4SoapBindingStub _stub = new it.cineca.titulus301.titulus_ws.services.Acl4.Acl4SoapBindingStub(portAddress, this);
            _stub.setPortName(getAcl4WSDDServiceName());
            return _stub;
        }
        catch (org.apache.axis.AxisFault e) {
            return null;
        }
    }

    public void setAcl4EndpointAddress(java.lang.String address) {
        Acl4_address = address;
    }

    /**
     * For the given interface, get the stub implementation.
     * If this service has no port for the given interface,
     * then ServiceException is thrown.
     */
    public java.rmi.Remote getPort(Class serviceEndpointInterface) throws javax.xml.rpc.ServiceException {
        try {
            if (it.cineca.titulus301.titulus_ws.services.Acl4.Acl4.class.isAssignableFrom(serviceEndpointInterface)) {
                it.cineca.titulus301.titulus_ws.services.Acl4.Acl4SoapBindingStub _stub = new it.cineca.titulus301.titulus_ws.services.Acl4.Acl4SoapBindingStub(new java.net.URL(Acl4_address), this);
                _stub.setPortName(getAcl4WSDDServiceName());
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
        if ("Acl4".equals(inputPortName)) {
            return getAcl4();
        }
        else  {
            java.rmi.Remote _stub = getPort(serviceEndpointInterface);
            ((org.apache.axis.client.Stub) _stub).setPortName(portName);
            return _stub;
        }
    }

    public javax.xml.namespace.QName getServiceName() {
        return new javax.xml.namespace.QName("https://titulus301.cineca.it/titulus_ws/services/Acl4", "Acl4Service");
    }

    private java.util.HashSet ports = null;

    public java.util.Iterator getPorts() {
        if (ports == null) {
            ports = new java.util.HashSet();
            ports.add(new javax.xml.namespace.QName("https://titulus301.cineca.it/titulus_ws/services/Acl4", "Acl4"));
        }
        return ports.iterator();
    }

    /**
    * Set the endpoint address for the specified port name.
    */
    public void setEndpointAddress(java.lang.String portName, java.lang.String address) throws javax.xml.rpc.ServiceException {
        
if ("Acl4".equals(portName)) {
            setAcl4EndpointAddress(address);
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
