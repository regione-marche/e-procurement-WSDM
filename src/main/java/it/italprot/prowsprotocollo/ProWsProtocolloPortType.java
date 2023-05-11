/**
 * ProWsProtocolloPortType.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package it.italprot.prowsprotocollo;

public interface ProWsProtocolloPortType extends java.rmi.Remote {
    public java.lang.String getItaEngineContextToken(java.lang.String userName, java.lang.String userPassword, java.lang.String domainCode) throws java.rmi.RemoteException;
    public void getItaEngineContextTokenInfo(java.lang.String token, java.lang.String domainCode, javax.xml.rpc.holders.StringHolder userName, javax.xml.rpc.holders.StringHolder userCode) throws java.rmi.RemoteException;
    public java.lang.String checkItaEngineContextToken(java.lang.String token, java.lang.String domainCode) throws java.rmi.RemoteException;
    public java.lang.String destroyItaEngineContextToken(java.lang.String token, java.lang.String domainCode) throws java.rmi.RemoteException;
    public void getAllegato(java.lang.String token, java.lang.String id, java.lang.String blockSize, java.lang.String part, it.italprot.prowsprotocollo.holders.AllegatoHolder allegato, it.italprot.prowsprotocollo.holders.MessageResultHolder messageResult) throws java.rmi.RemoteException;
    public void getProtocollo(java.lang.String token, java.lang.String anno, java.lang.String numero, java.lang.String tipo, java.lang.String segnatura, it.italprot.prowsprotocollo.holders.ItemProtocolloHolder items, it.italprot.prowsprotocollo.holders.MessageResultHolder messageResult) throws java.rmi.RemoteException;
    public void checkDocumentoAllaFirma(java.lang.String token, java.lang.String numeroDocumento, it.italprot.prowsprotocollo.holders.ItemEsitoFirmaHolder items, it.italprot.prowsprotocollo.holders.MessageResultHolder messageResult) throws java.rmi.RemoteException;
    public void getProtocolloFattura(java.lang.String token, java.lang.String fileFattura, it.italprot.prowsprotocollo.holders.ItemProtocolloHolder items, it.italprot.prowsprotocollo.holders.MessageResultHolder messageResult) throws java.rmi.RemoteException;
    public void getOrganigramma(java.lang.String token, it.italprot.prowsprotocollo.holders.OrganigrammaHolder organigramma, it.italprot.prowsprotocollo.holders.MessageResultHolder messageResult) throws java.rmi.RemoteException;
    public void putAllegato(java.lang.String token, java.lang.String anno, java.lang.String numero, java.lang.String tipo, java.lang.String tipoFile, java.lang.String nomeFile, java.lang.String estensione, java.lang.String stream, java.lang.String note, java.lang.String marcaDocumento, java.lang.String mettiAllaFirma, it.italprot.prowsprotocollo.holders.AllegatiHolder allegati, it.italprot.prowsprotocollo.holders.MessageResultHolder messageResult) throws java.rmi.RemoteException;
    public void putAllegatoDocumentoAllaFirma(java.lang.String token, java.lang.String numero, java.lang.String tipoFile, java.lang.String nomeFile, java.lang.String estensione, java.lang.String stream, java.lang.String note, java.lang.String marcaDocumento, java.lang.String mettiAllaFirma, it.italprot.prowsprotocollo.holders.AllegatiHolder allegati, it.italprot.prowsprotocollo.holders.MessageResultHolder messageResult) throws java.rmi.RemoteException;
    public void putProtocollo(java.lang.String token, it.italprot.prowsprotocollo.DatiProtocollo datiProtocollo, it.italprot.prowsprotocollo.holders.RetProtocolloHolder datiProtocollo2, it.italprot.prowsprotocollo.holders.MessageResultHolder messageResult) throws java.rmi.RemoteException;
    public void putDocumentoAllaFirma(java.lang.String token, it.italprot.prowsprotocollo.DatiDocumento datiDocumento, it.italprot.prowsprotocollo.holders.RetDocumentoHolder datiDocumento2, it.italprot.prowsprotocollo.holders.MessageResultHolder messageResult) throws java.rmi.RemoteException;
    public void notificaMailProtocollo(java.lang.String token, java.lang.String anno, java.lang.String numero, java.lang.String tipo, java.lang.String oggettoCustom, java.lang.String bodyCustom, it.italprot.prowsprotocollo.holders.StatoNotificaHolder statoNotifica, it.italprot.prowsprotocollo.holders.MessageResultHolder messageResult) throws java.rmi.RemoteException;
    public void insertDocumento(java.lang.String token, java.lang.String nomeFile, java.lang.String stream, it.italprot.prowsprotocollo.holders.AllegatoPrecaricatoHolder allegatoPrecaricato, it.italprot.prowsprotocollo.holders.MessageResultHolder messageResult) throws java.rmi.RemoteException;
    public void getNotificaMailProtocollo(java.lang.String token, java.lang.String anno, java.lang.String numero, java.lang.String tipo, java.lang.String rowidmail, it.italprot.prowsprotocollo.holders.NotificaMailHolder notificaMail, it.italprot.prowsprotocollo.holders.MessageResultHolder messageResult) throws java.rmi.RemoteException;
}
