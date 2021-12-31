/**
 * ProtocolloPort.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package it.viterbo.protservice;

public interface ProtocolloPort extends java.rmi.Remote {
    public java.lang.String doProtocollo(java.lang.String tipo, java.lang.String riservato, java.lang.String registro, java.lang.String oggetto, java.lang.String classificazione, java.lang.String mittente, java.lang.String tipomittente, java.lang.String destinatario, java.lang.String descrizione, java.lang.String datadiarrivo, java.lang.String datadispedizione, java.lang.String tipodidocumento, byte[] documento, java.lang.String formatodocumento) throws java.rmi.RemoteException;
}
