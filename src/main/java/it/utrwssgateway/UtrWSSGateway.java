/**
 * UtrWSSGateway.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package it.utrwssgateway;

public interface UtrWSSGateway extends java.rmi.Remote {
    public java.lang.String getEntities(java.lang.String logonCredentials, java.lang.String searchFilter) throws java.rmi.RemoteException;
    public void alterEntities(java.lang.String logonCredentials, java.lang.String entities) throws java.rmi.RemoteException;
}
