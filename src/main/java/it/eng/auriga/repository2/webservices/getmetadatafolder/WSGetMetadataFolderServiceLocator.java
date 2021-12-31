/**
 * WSGetMetadataFolderServiceLocator.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package it.eng.auriga.repository2.webservices.getmetadatafolder;

public class WSGetMetadataFolderServiceLocator extends org.apache.axis.client.Service implements it.eng.auriga.repository2.webservices.getmetadatafolder.WSGetMetadataFolderService {

    public WSGetMetadataFolderServiceLocator() {
    }


    public WSGetMetadataFolderServiceLocator(org.apache.axis.EngineConfiguration config) {
        super(config);
    }

    public WSGetMetadataFolderServiceLocator(java.lang.String wsdlLoc, javax.xml.namespace.QName sName) throws javax.xml.rpc.ServiceException {
        super(wsdlLoc, sName);
    }

    // Use to get a proxy class for WSGetMetadataFolder
    private java.lang.String WSGetMetadataFolder_address = "http://vm-testdoc:8080/aurigarepository/services/WSGetMetadataFolder";

    public java.lang.String getWSGetMetadataFolderAddress() {
        return WSGetMetadataFolder_address;
    }

    // The WSDD service name defaults to the port name.
    private java.lang.String WSGetMetadataFolderWSDDServiceName = "WSGetMetadataFolder";

    public java.lang.String getWSGetMetadataFolderWSDDServiceName() {
        return WSGetMetadataFolderWSDDServiceName;
    }

    public void setWSGetMetadataFolderWSDDServiceName(java.lang.String name) {
        WSGetMetadataFolderWSDDServiceName = name;
    }

    public it.eng.auriga.repository2.webservices.getmetadatafolder.WSGetMetadataFolder getWSGetMetadataFolder() throws javax.xml.rpc.ServiceException {
       java.net.URL endpoint;
        try {
            endpoint = new java.net.URL(WSGetMetadataFolder_address);
        }
        catch (java.net.MalformedURLException e) {
            throw new javax.xml.rpc.ServiceException(e);
        }
        return getWSGetMetadataFolder(endpoint);
    }

    public it.eng.auriga.repository2.webservices.getmetadatafolder.WSGetMetadataFolder getWSGetMetadataFolder(java.net.URL portAddress) throws javax.xml.rpc.ServiceException {
        try {
            it.eng.auriga.repository2.webservices.getmetadatafolder.WSGetMetadataFolderSoapBindingStub _stub = new it.eng.auriga.repository2.webservices.getmetadatafolder.WSGetMetadataFolderSoapBindingStub(portAddress, this);
            _stub.setPortName(getWSGetMetadataFolderWSDDServiceName());
            return _stub;
        }
        catch (org.apache.axis.AxisFault e) {
            return null;
        }
    }

    public void setWSGetMetadataFolderEndpointAddress(java.lang.String address) {
        WSGetMetadataFolder_address = address;
    }

    /**
     * For the given interface, get the stub implementation.
     * If this service has no port for the given interface,
     * then ServiceException is thrown.
     */
    public java.rmi.Remote getPort(Class serviceEndpointInterface) throws javax.xml.rpc.ServiceException {
        try {
            if (it.eng.auriga.repository2.webservices.getmetadatafolder.WSGetMetadataFolder.class.isAssignableFrom(serviceEndpointInterface)) {
                it.eng.auriga.repository2.webservices.getmetadatafolder.WSGetMetadataFolderSoapBindingStub _stub = new it.eng.auriga.repository2.webservices.getmetadatafolder.WSGetMetadataFolderSoapBindingStub(new java.net.URL(WSGetMetadataFolder_address), this);
                _stub.setPortName(getWSGetMetadataFolderWSDDServiceName());
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
        if ("WSGetMetadataFolder".equals(inputPortName)) {
            return getWSGetMetadataFolder();
        }
        else  {
            java.rmi.Remote _stub = getPort(serviceEndpointInterface);
            ((org.apache.axis.client.Stub) _stub).setPortName(portName);
            return _stub;
        }
    }

    public javax.xml.namespace.QName getServiceName() {
        return new javax.xml.namespace.QName("http://getmetadatafolder.webservices.repository2.auriga.eng.it", "WSGetMetadataFolderService");
    }

    private java.util.HashSet ports = null;

    public java.util.Iterator getPorts() {
        if (ports == null) {
            ports = new java.util.HashSet();
            ports.add(new javax.xml.namespace.QName("http://getmetadatafolder.webservices.repository2.auriga.eng.it", "WSGetMetadataFolder"));
        }
        return ports.iterator();
    }

    /**
    * Set the endpoint address for the specified port name.
    */
    public void setEndpointAddress(java.lang.String portName, java.lang.String address) throws javax.xml.rpc.ServiceException {
        
if ("WSGetMetadataFolder".equals(portName)) {
            setWSGetMetadataFolderEndpointAddress(address);
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
