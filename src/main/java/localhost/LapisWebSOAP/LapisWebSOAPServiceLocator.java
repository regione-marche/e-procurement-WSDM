/**
 * LapisWebSOAPServiceLocator.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package localhost.LapisWebSOAP;

public class LapisWebSOAPServiceLocator extends org.apache.axis.client.Service implements localhost.LapisWebSOAP.LapisWebSOAPService {

    public LapisWebSOAPServiceLocator() {
    }


    public LapisWebSOAPServiceLocator(org.apache.axis.EngineConfiguration config) {
        super(config);
    }

    public LapisWebSOAPServiceLocator(java.lang.String wsdlLoc, javax.xml.namespace.QName sName) throws javax.xml.rpc.ServiceException {
        super(wsdlLoc, sName);
    }

    // Use to get a proxy class for LapisWebSOAPPort
    private java.lang.String LapisWebSOAPPort_address = "http://localhost/LapisWebSOAP/LapisWebSOAP.asp";

    public java.lang.String getLapisWebSOAPPortAddress() {
        return LapisWebSOAPPort_address;
    }

    // The WSDD service name defaults to the port name.
    private java.lang.String LapisWebSOAPPortWSDDServiceName = "LapisWebSOAPPort";

    public java.lang.String getLapisWebSOAPPortWSDDServiceName() {
        return LapisWebSOAPPortWSDDServiceName;
    }

    public void setLapisWebSOAPPortWSDDServiceName(java.lang.String name) {
        LapisWebSOAPPortWSDDServiceName = name;
    }

    public localhost.LapisWebSOAP.LapisWebSOAPType getLapisWebSOAPPort() throws javax.xml.rpc.ServiceException {
       java.net.URL endpoint;
        try {
            endpoint = new java.net.URL(LapisWebSOAPPort_address);
        }
        catch (java.net.MalformedURLException e) {
            throw new javax.xml.rpc.ServiceException(e);
        }
        return getLapisWebSOAPPort(endpoint);
    }

    public localhost.LapisWebSOAP.LapisWebSOAPType getLapisWebSOAPPort(java.net.URL portAddress) throws javax.xml.rpc.ServiceException {
        try {
            localhost.LapisWebSOAP.LapisWebSOAPBindingStub _stub = new localhost.LapisWebSOAP.LapisWebSOAPBindingStub(portAddress, this);
            _stub.setPortName(getLapisWebSOAPPortWSDDServiceName());
            return _stub;
        }
        catch (org.apache.axis.AxisFault e) {
            return null;
        }
    }

    public void setLapisWebSOAPPortEndpointAddress(java.lang.String address) {
        LapisWebSOAPPort_address = address;
    }

    /**
     * For the given interface, get the stub implementation.
     * If this service has no port for the given interface,
     * then ServiceException is thrown.
     */
    public java.rmi.Remote getPort(Class serviceEndpointInterface) throws javax.xml.rpc.ServiceException {
        try {
            if (localhost.LapisWebSOAP.LapisWebSOAPType.class.isAssignableFrom(serviceEndpointInterface)) {
                localhost.LapisWebSOAP.LapisWebSOAPBindingStub _stub = new localhost.LapisWebSOAP.LapisWebSOAPBindingStub(new java.net.URL(LapisWebSOAPPort_address), this);
                _stub.setPortName(getLapisWebSOAPPortWSDDServiceName());
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
        if ("LapisWebSOAPPort".equals(inputPortName)) {
            return getLapisWebSOAPPort();
        }
        else  {
            java.rmi.Remote _stub = getPort(serviceEndpointInterface);
            ((org.apache.axis.client.Stub) _stub).setPortName(portName);
            return _stub;
        }
    }

    public javax.xml.namespace.QName getServiceName() {
        return new javax.xml.namespace.QName("http://localhost/LapisWebSOAP", "LapisWebSOAPService");
    }

    private java.util.HashSet ports = null;

    public java.util.Iterator getPorts() {
        if (ports == null) {
            ports = new java.util.HashSet();
            ports.add(new javax.xml.namespace.QName("http://localhost/LapisWebSOAP", "LapisWebSOAPPort"));
        }
        return ports.iterator();
    }

    /**
    * Set the endpoint address for the specified port name.
    */
    public void setEndpointAddress(java.lang.String portName, java.lang.String address) throws javax.xml.rpc.ServiceException {
        
if ("LapisWebSOAPPort".equals(portName)) {
            setLapisWebSOAPPortEndpointAddress(address);
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
