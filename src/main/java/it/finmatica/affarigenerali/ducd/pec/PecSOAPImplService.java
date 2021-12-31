/**
 * PecSOAPImplService.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package it.finmatica.affarigenerali.ducd.pec;

public interface PecSOAPImplService extends javax.xml.rpc.Service {
    public java.lang.String getPecSOAPImplAddress();

    public it.finmatica.affarigenerali.ducd.pec.PecSOAPImpl getPecSOAPImpl() throws javax.xml.rpc.ServiceException;

    public it.finmatica.affarigenerali.ducd.pec.PecSOAPImpl getPecSOAPImpl(java.net.URL portAddress) throws javax.xml.rpc.ServiceException;
}
