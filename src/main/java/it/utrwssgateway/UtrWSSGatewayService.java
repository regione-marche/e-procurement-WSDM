/**
 * UtrWSSGatewayService.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package it.utrwssgateway;

public interface UtrWSSGatewayService extends javax.xml.rpc.Service {
    public java.lang.String getUtrWSSGatewayAddress();

    public it.utrwssgateway.UtrWSSGateway getUtrWSSGateway() throws javax.xml.rpc.ServiceException;

    public it.utrwssgateway.UtrWSSGateway getUtrWSSGateway(java.net.URL portAddress) throws javax.xml.rpc.ServiceException;
}
