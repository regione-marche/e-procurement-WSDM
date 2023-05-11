/**
 * LapisWebSOAPType.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package localhost.LapisWebSOAP;

public interface LapisWebSOAPType extends java.rmi.Remote {
    public boolean lapisWebSOAP(java.lang.String xml) throws java.rmi.RemoteException;
    public java.lang.String validatore(java.lang.String xml) throws java.rmi.RemoteException;
    public java.lang.String protoBatch(java.lang.String xml) throws java.rmi.RemoteException;
    public java.lang.String protoBatchLog(long codice) throws java.rmi.RemoteException;
    public java.lang.String PBrotoBatch(java.lang.String xml) throws java.rmi.RemoteException;
    public java.lang.String PBrotoBatchLog(long codice) throws java.rmi.RemoteException;
    public java.lang.String protocollaArrivo(java.lang.String xml) throws java.rmi.RemoteException;
    public boolean modificaStruttura(java.lang.String xml) throws java.rmi.RemoteException;
    public boolean aggiungiRicevuta(java.lang.String xml) throws java.rmi.RemoteException;
    public java.lang.String getProfile(java.lang.String account) throws java.rmi.RemoteException;
    public java.lang.String getPermission(java.lang.String struttura) throws java.rmi.RemoteException;
    public java.lang.String getOwner(java.lang.String struttura) throws java.rmi.RemoteException;
    public java.lang.String getIDC(java.lang.String struttura) throws java.rmi.RemoteException;
    public java.lang.String getFather(java.lang.String struttura) throws java.rmi.RemoteException;
    public java.lang.String getMovimentazione(java.lang.String struttura) throws java.rmi.RemoteException;
    public java.lang.String getMovimentazioneStorico(java.lang.String struttura) throws java.rmi.RemoteException;
    public java.lang.String getVisibilitaVaschette(java.lang.String struttura) throws java.rmi.RemoteException;
    public java.lang.String getFatture(java.lang.String struttura, java.lang.String data_inizio, java.lang.String data_fine) throws java.rmi.RemoteException;
    public java.lang.String getDettaglioFattura(java.lang.String struttura, java.lang.String numero_proto, java.lang.String data_proto) throws java.rmi.RemoteException;
    public java.lang.String getStatoSpedizione(java.lang.String struttura, java.lang.String numero_proto, java.lang.String data_proto, java.lang.String cod_applicativo) throws java.rmi.RemoteException;
    public boolean insertFolder(java.lang.String struttura, java.lang.String numero_proto, java.lang.String data_proto, java.lang.String mas_cod, java.lang.String ie_fascicolo, java.lang.String operatore) throws java.rmi.RemoteException;
    public boolean deleteFolder(java.lang.String struttura, java.lang.String numero_proto, java.lang.String data_proto, java.lang.String mas_cod, java.lang.String ie_fascicolo, java.lang.String operatore) throws java.rmi.RemoteException;
    public java.lang.String getPEC(java.lang.String fileId) throws java.rmi.RemoteException;
    public java.lang.String protoBatchLogDetail(long codice, java.lang.String numero_proto, java.util.Date data_proto) throws java.rmi.RemoteException;
    public java.lang.String updateAttachment(java.lang.String xml) throws java.rmi.RemoteException;
    public java.lang.String getDettaglioProto(java.lang.String cod_applicativo, java.lang.String struttura, java.lang.String numero_proto, java.lang.String data_proto) throws java.rmi.RemoteException;
    public java.lang.String getParent(java.lang.String struttura) throws java.rmi.RemoteException;
}
