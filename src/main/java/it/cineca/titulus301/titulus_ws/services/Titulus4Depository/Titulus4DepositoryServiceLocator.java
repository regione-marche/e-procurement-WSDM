/**
 * Titulus4DepositoryServiceLocator.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package it.cineca.titulus301.titulus_ws.services.Titulus4Depository;

public class Titulus4DepositoryServiceLocator extends org.apache.axis.client.Service implements it.cineca.titulus301.titulus_ws.services.Titulus4Depository.Titulus4DepositoryService {

    public Titulus4DepositoryServiceLocator() {
    }


    public Titulus4DepositoryServiceLocator(org.apache.axis.EngineConfiguration config) {
        super(config);
    }

    public Titulus4DepositoryServiceLocator(java.lang.String wsdlLoc, javax.xml.namespace.QName sName) throws javax.xml.rpc.ServiceException {
        super(wsdlLoc, sName);
    }

    // Use to get a proxy class for Titulus4Depository
    private java.lang.String Titulus4Depository_address = "https://titulus301.cineca.it/titulus_ws/services/Titulus4Depository";

    public java.lang.String getTitulus4DepositoryAddress() {
        return Titulus4Depository_address;
    }

    // The WSDD service name defaults to the port name.
    private java.lang.String Titulus4DepositoryWSDDServiceName = "Titulus4Depository";

    public java.lang.String getTitulus4DepositoryWSDDServiceName() {
        return Titulus4DepositoryWSDDServiceName;
    }

    public void setTitulus4DepositoryWSDDServiceName(java.lang.String name) {
        Titulus4DepositoryWSDDServiceName = name;
    }

    public it.cineca.titulus301.titulus_ws.services.Titulus4Depository.Titulus4Depository getTitulus4Depository() throws javax.xml.rpc.ServiceException {
       java.net.URL endpoint;
        try {
            endpoint = new java.net.URL(Titulus4Depository_address);
        }
        catch (java.net.MalformedURLException e) {
            throw new javax.xml.rpc.ServiceException(e);
        }
        return getTitulus4Depository(endpoint);
    }

    public it.cineca.titulus301.titulus_ws.services.Titulus4Depository.Titulus4Depository getTitulus4Depository(java.net.URL portAddress) throws javax.xml.rpc.ServiceException {
        try {
            it.cineca.titulus301.titulus_ws.services.Titulus4Depository.Titulus4DepositorySoapBindingStub _stub = new it.cineca.titulus301.titulus_ws.services.Titulus4Depository.Titulus4DepositorySoapBindingStub(portAddress, this);
            _stub.setPortName(getTitulus4DepositoryWSDDServiceName());
            return _stub;
        }
        catch (org.apache.axis.AxisFault e) {
            return null;
        }
    }

    public void setTitulus4DepositoryEndpointAddress(java.lang.String address) {
        Titulus4Depository_address = address;
    }

    /**
     * For the given interface, get the stub implementation.
     * If this service has no port for the given interface,
     * then ServiceException is thrown.
     */
    public java.rmi.Remote getPort(Class serviceEndpointInterface) throws javax.xml.rpc.ServiceException {
        try {
            if (it.cineca.titulus301.titulus_ws.services.Titulus4Depository.Titulus4Depository.class.isAssignableFrom(serviceEndpointInterface)) {
                it.cineca.titulus301.titulus_ws.services.Titulus4Depository.Titulus4DepositorySoapBindingStub _stub = new it.cineca.titulus301.titulus_ws.services.Titulus4Depository.Titulus4DepositorySoapBindingStub(new java.net.URL(Titulus4Depository_address), this);
                _stub.setPortName(getTitulus4DepositoryWSDDServiceName());
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
        if ("Titulus4Depository".equals(inputPortName)) {
            return getTitulus4Depository();
        }
        else  {
            java.rmi.Remote _stub = getPort(serviceEndpointInterface);
            ((org.apache.axis.client.Stub) _stub).setPortName(portName);
            return _stub;
        }
    }

    public javax.xml.namespace.QName getServiceName() {
        return new javax.xml.namespace.QName("https://titulus301.cineca.it/titulus_ws/services/Titulus4Depository", "Titulus4DepositoryService");
    }

    private java.util.HashSet ports = null;

    public java.util.Iterator getPorts() {
        if (ports == null) {
            ports = new java.util.HashSet();
            ports.add(new javax.xml.namespace.QName("https://titulus301.cineca.it/titulus_ws/services/Titulus4Depository", "Titulus4Depository"));
        }
        return ports.iterator();
    }

    /**
    * Set the endpoint address for the specified port name.
    */
    public void setEndpointAddress(java.lang.String portName, java.lang.String address) throws javax.xml.rpc.ServiceException {
        
if ("Titulus4Depository".equals(portName)) {
            setTitulus4DepositoryEndpointAddress(address);
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
