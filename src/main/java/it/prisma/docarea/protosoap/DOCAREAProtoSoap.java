/**
 * DOCAREAProtoSoap.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package it.prisma.docarea.protosoap;

public interface DOCAREAProtoSoap extends java.rmi.Remote {
    public it.prisma.docarea.protosoap.LoginRet login(java.lang.String strCodEnte, java.lang.String strUserName, java.lang.String strPassword) throws java.rmi.RemoteException;
    public it.prisma.docarea.protosoap.InserimentoRet inserimento(java.lang.String strUserName, java.lang.String strDST, byte[] strAttachment) throws java.rmi.RemoteException;
    public it.prisma.docarea.protosoap.SmistamentoActionRet smistamentoAction(java.lang.String strUserName, java.lang.String strDST, byte[] strAttachment) throws java.rmi.RemoteException;
    public it.prisma.docarea.protosoap.ProtocollazioneRet protocollazione(java.lang.String strUserName, java.lang.String strDST, byte[] strAttachment) throws java.rmi.RemoteException;
    public it.prisma.docarea.protosoap.AggiungiAllegatoRet aggiungiAllegato(java.lang.String strUserName, java.lang.String strDST, byte[] strAttachment) throws java.rmi.RemoteException;
    public it.prisma.docarea.protosoap.SostituisciDocumentoPrincipaleRet sostituisciDocumentoPrincipale(java.lang.String strUserName, java.lang.String strDST, byte[] strAttachment) throws java.rmi.RemoteException;
}
