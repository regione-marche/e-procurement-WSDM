/**
 * FascicoliWebServiceService.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package it.fascicoliwebservice;

public interface FascicoliWebServiceService extends javax.xml.rpc.Service {
    public java.lang.String getFascicoliWebServiceAddress();

    public it.fascicoliwebservice.FascicoliWebService getFascicoliWebService() throws javax.xml.rpc.ServiceException;

    public it.fascicoliwebservice.FascicoliWebService getFascicoliWebService(java.net.URL portAddress) throws javax.xml.rpc.ServiceException;
}
