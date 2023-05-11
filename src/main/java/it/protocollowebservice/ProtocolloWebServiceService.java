/**
 * ProtocolloWebServiceService.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package it.protocollowebservice;

public interface ProtocolloWebServiceService extends javax.xml.rpc.Service {
    public java.lang.String getProtocolloWebServiceAddress();

    public it.protocollowebservice.ProtocolloWebService getProtocolloWebService() throws javax.xml.rpc.ServiceException;

    public it.protocollowebservice.ProtocolloWebService getProtocolloWebService(java.net.URL portAddress) throws javax.xml.rpc.ServiceException;
}
