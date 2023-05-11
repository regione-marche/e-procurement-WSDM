/**
 * Titulus4UgovServiceLocator.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package it.cineca.titulus301.titulus_ws.services.Titulus4Ugov;

public class Titulus4UgovServiceLocator extends org.apache.axis.client.Service implements it.cineca.titulus301.titulus_ws.services.Titulus4Ugov.Titulus4UgovService {

    public Titulus4UgovServiceLocator() {
    }


    public Titulus4UgovServiceLocator(org.apache.axis.EngineConfiguration config) {
        super(config);
    }

    public Titulus4UgovServiceLocator(java.lang.String wsdlLoc, javax.xml.namespace.QName sName) throws javax.xml.rpc.ServiceException {
        super(wsdlLoc, sName);
    }

    // Use to get a proxy class for Titulus4Ugov
    private java.lang.String Titulus4Ugov_address = "https://titulus301.cineca.it/titulus_ws/services/Titulus4Ugov";

    public java.lang.String getTitulus4UgovAddress() {
        return Titulus4Ugov_address;
    }

    // The WSDD service name defaults to the port name.
    private java.lang.String Titulus4UgovWSDDServiceName = "Titulus4Ugov";

    public java.lang.String getTitulus4UgovWSDDServiceName() {
        return Titulus4UgovWSDDServiceName;
    }

    public void setTitulus4UgovWSDDServiceName(java.lang.String name) {
        Titulus4UgovWSDDServiceName = name;
    }

    public it.cineca.titulus301.titulus_ws.services.Titulus4Ugov.Titulus4Ugov getTitulus4Ugov() throws javax.xml.rpc.ServiceException {
       java.net.URL endpoint;
        try {
            endpoint = new java.net.URL(Titulus4Ugov_address);
        }
        catch (java.net.MalformedURLException e) {
            throw new javax.xml.rpc.ServiceException(e);
        }
        return getTitulus4Ugov(endpoint);
    }

    public it.cineca.titulus301.titulus_ws.services.Titulus4Ugov.Titulus4Ugov getTitulus4Ugov(java.net.URL portAddress) throws javax.xml.rpc.ServiceException {
        try {
            it.cineca.titulus301.titulus_ws.services.Titulus4Ugov.Titulus4UgovSoapBindingStub _stub = new it.cineca.titulus301.titulus_ws.services.Titulus4Ugov.Titulus4UgovSoapBindingStub(portAddress, this);
            _stub.setPortName(getTitulus4UgovWSDDServiceName());
            return _stub;
        }
        catch (org.apache.axis.AxisFault e) {
            return null;
        }
    }

    public void setTitulus4UgovEndpointAddress(java.lang.String address) {
        Titulus4Ugov_address = address;
    }

    /**
     * For the given interface, get the stub implementation.
     * If this service has no port for the given interface,
     * then ServiceException is thrown.
     */
    public java.rmi.Remote getPort(Class serviceEndpointInterface) throws javax.xml.rpc.ServiceException {
        try {
            if (it.cineca.titulus301.titulus_ws.services.Titulus4Ugov.Titulus4Ugov.class.isAssignableFrom(serviceEndpointInterface)) {
                it.cineca.titulus301.titulus_ws.services.Titulus4Ugov.Titulus4UgovSoapBindingStub _stub = new it.cineca.titulus301.titulus_ws.services.Titulus4Ugov.Titulus4UgovSoapBindingStub(new java.net.URL(Titulus4Ugov_address), this);
                _stub.setPortName(getTitulus4UgovWSDDServiceName());
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
        if ("Titulus4Ugov".equals(inputPortName)) {
            return getTitulus4Ugov();
        }
        else  {
            java.rmi.Remote _stub = getPort(serviceEndpointInterface);
            ((org.apache.axis.client.Stub) _stub).setPortName(portName);
            return _stub;
        }
    }

    public javax.xml.namespace.QName getServiceName() {
        return new javax.xml.namespace.QName("https://titulus301.cineca.it/titulus_ws/services/Titulus4Ugov", "Titulus4UgovService");
    }

    private java.util.HashSet ports = null;

    public java.util.Iterator getPorts() {
        if (ports == null) {
            ports = new java.util.HashSet();
            ports.add(new javax.xml.namespace.QName("https://titulus301.cineca.it/titulus_ws/services/Titulus4Ugov", "Titulus4Ugov"));
        }
        return ports.iterator();
    }

    /**
    * Set the endpoint address for the specified port name.
    */
    public void setEndpointAddress(java.lang.String portName, java.lang.String address) throws javax.xml.rpc.ServiceException {
        
if ("Titulus4Ugov".equals(portName)) {
            setTitulus4UgovEndpointAddress(address);
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
