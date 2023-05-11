/**
 * ProWsFascicoloLocator.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package it.italprot.prowsfascicolo;

public class ProWsFascicoloLocator extends org.apache.axis.client.Service implements it.italprot.prowsfascicolo.ProWsFascicolo {

    public ProWsFascicoloLocator() {
    }


    public ProWsFascicoloLocator(org.apache.axis.EngineConfiguration config) {
        super(config);
    }

    public ProWsFascicoloLocator(java.lang.String wsdlLoc, javax.xml.namespace.QName sName) throws javax.xml.rpc.ServiceException {
        super(wsdlLoc, sName);
    }

    // Use to get a proxy class for proWsFascicoloPort
    private java.lang.String proWsFascicoloPort_address = "https://prmc.nuvolaitalsoft.it:443/itaTest/ws/Protocollo/proWsFascicolo.php";

    public java.lang.String getproWsFascicoloPortAddress() {
        return proWsFascicoloPort_address;
    }

    // The WSDD service name defaults to the port name.
    private java.lang.String proWsFascicoloPortWSDDServiceName = "proWsFascicoloPort";

    public java.lang.String getproWsFascicoloPortWSDDServiceName() {
        return proWsFascicoloPortWSDDServiceName;
    }

    public void setproWsFascicoloPortWSDDServiceName(java.lang.String name) {
        proWsFascicoloPortWSDDServiceName = name;
    }

    public it.italprot.prowsfascicolo.ProWsFascicoloPortType getproWsFascicoloPort() throws javax.xml.rpc.ServiceException {
       java.net.URL endpoint;
        try {
            endpoint = new java.net.URL(proWsFascicoloPort_address);
        }
        catch (java.net.MalformedURLException e) {
            throw new javax.xml.rpc.ServiceException(e);
        }
        return getproWsFascicoloPort(endpoint);
    }

    public it.italprot.prowsfascicolo.ProWsFascicoloPortType getproWsFascicoloPort(java.net.URL portAddress) throws javax.xml.rpc.ServiceException {
        try {
            it.italprot.prowsfascicolo.ProWsFascicoloBindingStub _stub = new it.italprot.prowsfascicolo.ProWsFascicoloBindingStub(portAddress, this);
            _stub.setPortName(getproWsFascicoloPortWSDDServiceName());
            return _stub;
        }
        catch (org.apache.axis.AxisFault e) {
            return null;
        }
    }

    public void setproWsFascicoloPortEndpointAddress(java.lang.String address) {
        proWsFascicoloPort_address = address;
    }

    /**
     * For the given interface, get the stub implementation.
     * If this service has no port for the given interface,
     * then ServiceException is thrown.
     */
    public java.rmi.Remote getPort(Class serviceEndpointInterface) throws javax.xml.rpc.ServiceException {
        try {
            if (it.italprot.prowsfascicolo.ProWsFascicoloPortType.class.isAssignableFrom(serviceEndpointInterface)) {
                it.italprot.prowsfascicolo.ProWsFascicoloBindingStub _stub = new it.italprot.prowsfascicolo.ProWsFascicoloBindingStub(new java.net.URL(proWsFascicoloPort_address), this);
                _stub.setPortName(getproWsFascicoloPortWSDDServiceName());
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
        if ("proWsFascicoloPort".equals(inputPortName)) {
            return getproWsFascicoloPort();
        }
        else  {
            java.rmi.Remote _stub = getPort(serviceEndpointInterface);
            ((org.apache.axis.client.Stub) _stub).setPortName(portName);
            return _stub;
        }
    }

    public javax.xml.namespace.QName getServiceName() {
        return new javax.xml.namespace.QName("urn:proWsFascicolo", "proWsFascicolo");
    }

    private java.util.HashSet ports = null;

    public java.util.Iterator getPorts() {
        if (ports == null) {
            ports = new java.util.HashSet();
            ports.add(new javax.xml.namespace.QName("urn:proWsFascicolo", "proWsFascicoloPort"));
        }
        return ports.iterator();
    }

    /**
    * Set the endpoint address for the specified port name.
    */
    public void setEndpointAddress(java.lang.String portName, java.lang.String address) throws javax.xml.rpc.ServiceException {
        
if ("proWsFascicoloPort".equals(portName)) {
            setproWsFascicoloPortEndpointAddress(address);
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
