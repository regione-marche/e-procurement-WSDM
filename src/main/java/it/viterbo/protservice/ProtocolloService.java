/**
 * ProtocolloService.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package it.viterbo.protservice;

public interface ProtocolloService extends javax.xml.rpc.Service {
    public java.lang.String getProtocolloPortAddress();

    public it.viterbo.protservice.ProtocolloPort getProtocolloPort() throws javax.xml.rpc.ServiceException;

    public it.viterbo.protservice.ProtocolloPort getProtocolloPort(java.net.URL portAddress) throws javax.xml.rpc.ServiceException;
}
