/**
 * ProtocolloExtendedService.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package it.finmatica.protocolloextended;

public interface ProtocolloExtendedService extends java.rmi.Remote {
    public java.lang.String getDocumentiProtocollati(java.lang.String user, java.lang.String DST, java.lang.String xml) throws java.rmi.RemoteException;
    public java.lang.String modFascicolo(java.lang.String user, java.lang.String DST, java.lang.String xml) throws java.rmi.RemoteException;
    public java.lang.String getFascicoli(java.lang.String user, java.lang.String DST, java.lang.String xml) throws java.rmi.RemoteException;
    public java.lang.String modProtocollo(java.lang.String user, java.lang.String DST, java.lang.String xml) throws java.rmi.RemoteException;
    public java.lang.String collegaFascicoli(java.lang.String user, java.lang.String DST, java.lang.String xml) throws java.rmi.RemoteException;
    public java.lang.String getInfoPec(java.lang.String user, java.lang.String DST, java.lang.String xml) throws java.rmi.RemoteException;
    public java.lang.String addFilePrincipale(java.lang.String user, java.lang.String DST, java.lang.String xml) throws java.rmi.RemoteException;
    public java.lang.String delFilePrincipale(java.lang.String user, java.lang.String DST, java.lang.String xml) throws java.rmi.RemoteException;
    public java.lang.String delDocumento(java.lang.String user, java.lang.String DST, java.lang.String xml) throws java.rmi.RemoteException;
    public java.lang.String getClassifiche(java.lang.String user, java.lang.String DST, java.lang.String xml) throws java.rmi.RemoteException;
    public java.lang.String addRapporto(java.lang.String user, java.lang.String DST, java.lang.String xml) throws java.rmi.RemoteException;
    public java.lang.String getDocumentiNonProtocollati(java.lang.String user, java.lang.String DST, java.lang.String xml) throws java.rmi.RemoteException;
    public java.lang.String collegaDocumenti(java.lang.String user, java.lang.String DST, java.lang.String xml) throws java.rmi.RemoteException;
    public java.lang.String creaFascicolo(java.lang.String user, java.lang.String DST, java.lang.String xml) throws java.rmi.RemoteException;
    public java.lang.String rimuoviDocumentoDalFascicolo(java.lang.String user, java.lang.String DST, java.lang.String xml) throws java.rmi.RemoteException;
    public java.lang.String inserisciDocumentoInFascicolo(java.lang.String user, java.lang.String DST, java.lang.String xml) throws java.rmi.RemoteException;
    public java.lang.String getDocumento(java.lang.String user, java.lang.String DST, java.lang.String xml) throws java.rmi.RemoteException;
    public java.lang.String creaDocumento(java.lang.String user, java.lang.String DST, java.lang.String xml) throws java.rmi.RemoteException;
    public java.lang.String delFascicolo(java.lang.String user, java.lang.String DST, java.lang.String xml) throws java.rmi.RemoteException;
    public java.lang.String modDocumento(java.lang.String user, java.lang.String DST, java.lang.String xml) throws java.rmi.RemoteException;
    public java.lang.String delRapporto(java.lang.String user, java.lang.String DST, java.lang.String xml) throws java.rmi.RemoteException;
    public java.lang.String addSmistamento(java.lang.String user, java.lang.String DST, java.lang.String xml) throws java.rmi.RemoteException;
    public java.lang.String delSmistamento(java.lang.String user, java.lang.String DST, java.lang.String xml) throws java.rmi.RemoteException;
}
