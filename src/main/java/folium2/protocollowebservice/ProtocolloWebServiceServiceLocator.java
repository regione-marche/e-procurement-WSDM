/**
 * ProtocolloWebServiceServiceLocator.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package folium2.protocollowebservice;

public class ProtocolloWebServiceServiceLocator extends org.apache.axis.client.Service implements folium2.protocollowebservice.ProtocolloWebServiceService {

    public ProtocolloWebServiceServiceLocator() {
    }


    public ProtocolloWebServiceServiceLocator(org.apache.axis.EngineConfiguration config) {
        super(config);
    }

    public ProtocolloWebServiceServiceLocator(java.lang.String wsdlLoc, javax.xml.namespace.QName sName) throws javax.xml.rpc.ServiceException {
        super(wsdlLoc, sName);
    }

    // Use to get a proxy class for ProtocolloWebService
    private java.lang.String ProtocolloWebService_address = "http://195.223.136.104:9000/Folium/services/ProtocolloWebService";

    public java.lang.String getProtocolloWebServiceAddress() {
        return ProtocolloWebService_address;
    }

    // The WSDD service name defaults to the port name.
    private java.lang.String ProtocolloWebServiceWSDDServiceName = "ProtocolloWebService";

    public java.lang.String getProtocolloWebServiceWSDDServiceName() {
        return ProtocolloWebServiceWSDDServiceName;
    }

    public void setProtocolloWebServiceWSDDServiceName(java.lang.String name) {
        ProtocolloWebServiceWSDDServiceName = name;
    }

    public folium2.protocollowebservice.ProtocolloWebService getProtocolloWebService() throws javax.xml.rpc.ServiceException {
       java.net.URL endpoint;
        try {
            endpoint = new java.net.URL(ProtocolloWebService_address);
        }
        catch (java.net.MalformedURLException e) {
            throw new javax.xml.rpc.ServiceException(e);
        }
        return getProtocolloWebService(endpoint);
    }

    public folium2.protocollowebservice.ProtocolloWebService getProtocolloWebService(java.net.URL portAddress) throws javax.xml.rpc.ServiceException {
        try {
            folium2.protocollowebservice.ProtocolloWebServiceSoapBindingStub _stub = new folium2.protocollowebservice.ProtocolloWebServiceSoapBindingStub(portAddress, this);
            _stub.setPortName(getProtocolloWebServiceWSDDServiceName());
            return _stub;
        }
        catch (org.apache.axis.AxisFault e) {
            return null;
        }
    }

    public void setProtocolloWebServiceEndpointAddress(java.lang.String address) {
        ProtocolloWebService_address = address;
    }

    /**
     * For the given interface, get the stub implementation.
     * If this service has no port for the given interface,
     * then ServiceException is thrown.
     */
    public java.rmi.Remote getPort(Class serviceEndpointInterface) throws javax.xml.rpc.ServiceException {
        try {
            if (folium2.protocollowebservice.ProtocolloWebService.class.isAssignableFrom(serviceEndpointInterface)) {
                folium2.protocollowebservice.ProtocolloWebServiceSoapBindingStub _stub = new folium2.protocollowebservice.ProtocolloWebServiceSoapBindingStub(new java.net.URL(ProtocolloWebService_address), this);
                _stub.setPortName(getProtocolloWebServiceWSDDServiceName());
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
        if ("ProtocolloWebService".equals(inputPortName)) {
            return getProtocolloWebService();
        }
        else  {
            java.rmi.Remote _stub = getPort(serviceEndpointInterface);
            ((org.apache.axis.client.Stub) _stub).setPortName(portName);
            return _stub;
        }
    }

    public javax.xml.namespace.QName getServiceName() {
        return new javax.xml.namespace.QName("urn:ProtocolloWebService", "ProtocolloWebServiceService");
    }

    private java.util.HashSet ports = null;

    public java.util.Iterator getPorts() {
        if (ports == null) {
            ports = new java.util.HashSet();
            ports.add(new javax.xml.namespace.QName("urn:ProtocolloWebService", "ProtocolloWebService"));
        }
        return ports.iterator();
    }

    /**
    * Set the endpoint address for the specified port name.
    */
    public void setEndpointAddress(java.lang.String portName, java.lang.String address) throws javax.xml.rpc.ServiceException {
        
if ("ProtocolloWebService".equals(portName)) {
            setProtocolloWebServiceEndpointAddress(address);
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
