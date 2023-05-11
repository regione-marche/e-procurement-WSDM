/**
 * PecSOAPImplServiceLocator.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package it.finmatica.affarigenerali.ducd.pec;

public class PecSOAPImplServiceLocator extends org.apache.axis.client.Service implements it.finmatica.affarigenerali.ducd.pec.PecSOAPImplService {

    public PecSOAPImplServiceLocator() {
    }


    public PecSOAPImplServiceLocator(org.apache.axis.EngineConfiguration config) {
        super(config);
    }

    public PecSOAPImplServiceLocator(java.lang.String wsdlLoc, javax.xml.namespace.QName sName) throws javax.xml.rpc.ServiceException {
        super(wsdlLoc, sName);
    }

    // Use to get a proxy class for PecSOAPImpl
    private java.lang.String PecSOAPImpl_address = "http://141.138.81.203:8888/ducd/services/PecSOAPImpl";

    public java.lang.String getPecSOAPImplAddress() {
        return PecSOAPImpl_address;
    }

    // The WSDD service name defaults to the port name.
    private java.lang.String PecSOAPImplWSDDServiceName = "PecSOAPImpl";

    public java.lang.String getPecSOAPImplWSDDServiceName() {
        return PecSOAPImplWSDDServiceName;
    }

    public void setPecSOAPImplWSDDServiceName(java.lang.String name) {
        PecSOAPImplWSDDServiceName = name;
    }

    public it.finmatica.affarigenerali.ducd.pec.PecSOAPImpl getPecSOAPImpl() throws javax.xml.rpc.ServiceException {
       java.net.URL endpoint;
        try {
            endpoint = new java.net.URL(PecSOAPImpl_address);
        }
        catch (java.net.MalformedURLException e) {
            throw new javax.xml.rpc.ServiceException(e);
        }
        return getPecSOAPImpl(endpoint);
    }

    public it.finmatica.affarigenerali.ducd.pec.PecSOAPImpl getPecSOAPImpl(java.net.URL portAddress) throws javax.xml.rpc.ServiceException {
        try {
            it.finmatica.affarigenerali.ducd.pec.PecSOAPImplSoapBindingStub _stub = new it.finmatica.affarigenerali.ducd.pec.PecSOAPImplSoapBindingStub(portAddress, this);
            _stub.setPortName(getPecSOAPImplWSDDServiceName());
            return _stub;
        }
        catch (org.apache.axis.AxisFault e) {
            return null;
        }
    }

    public void setPecSOAPImplEndpointAddress(java.lang.String address) {
        PecSOAPImpl_address = address;
    }

    /**
     * For the given interface, get the stub implementation.
     * If this service has no port for the given interface,
     * then ServiceException is thrown.
     */
    public java.rmi.Remote getPort(Class serviceEndpointInterface) throws javax.xml.rpc.ServiceException {
        try {
            if (it.finmatica.affarigenerali.ducd.pec.PecSOAPImpl.class.isAssignableFrom(serviceEndpointInterface)) {
                it.finmatica.affarigenerali.ducd.pec.PecSOAPImplSoapBindingStub _stub = new it.finmatica.affarigenerali.ducd.pec.PecSOAPImplSoapBindingStub(new java.net.URL(PecSOAPImpl_address), this);
                _stub.setPortName(getPecSOAPImplWSDDServiceName());
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
        if ("PecSOAPImpl".equals(inputPortName)) {
            return getPecSOAPImpl();
        }
        else  {
            java.rmi.Remote _stub = getPort(serviceEndpointInterface);
            ((org.apache.axis.client.Stub) _stub).setPortName(portName);
            return _stub;
        }
    }

    public javax.xml.namespace.QName getServiceName() {
        return new javax.xml.namespace.QName("http://pec.ducd.affarigenerali.finmatica.it", "PecSOAPImplService");
    }

    private java.util.HashSet ports = null;

    public java.util.Iterator getPorts() {
        if (ports == null) {
            ports = new java.util.HashSet();
            ports.add(new javax.xml.namespace.QName("http://pec.ducd.affarigenerali.finmatica.it", "PecSOAPImpl"));
        }
        return ports.iterator();
    }

    /**
    * Set the endpoint address for the specified port name.
    */
    public void setEndpointAddress(java.lang.String portName, java.lang.String address) throws javax.xml.rpc.ServiceException {
        
if ("PecSOAPImpl".equals(portName)) {
            setPecSOAPImplEndpointAddress(address);
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
