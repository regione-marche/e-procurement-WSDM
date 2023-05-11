/**
 * Titulus4Depository.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package it.cineca.titulus301.titulus_ws.services.Titulus4Depository;

public interface Titulus4Depository extends java.rmi.Remote {
    public java.lang.String setCodAmmAoo(java.lang.String xmlDocument, java.lang.String codAmmAoo) throws java.rmi.RemoteException;
    public java.lang.String saveDocument(java.lang.String xmlDocument, it.kion.www.titulus.AttachmentBean[] attachmentBeans, it.kion.www.titulus.SaveParams params) throws java.rmi.RemoteException;
    public java.lang.String addPredecessor(java.lang.String idDocToUpdate, java.lang.String xmlPredecessorInfos, java.lang.String newFolderSubject, java.lang.String newFolderIdType, java.lang.String newFolderId) throws java.rmi.RemoteException;
    public java.lang.String createDocXmlVarie(java.lang.String autore, java.lang.String oggetto, java.lang.String[] descrizioniAllegati, java.lang.String note, java.lang.String extraXml) throws java.rmi.RemoteException;
    public java.lang.String loadDocTemplate(java.lang.String configurationFileId) throws java.rmi.RemoteException;
    public java.lang.String getDocTemplateList() throws java.rmi.RemoteException;
    public java.lang.String setExtraContent(java.lang.String xmlDocument, java.lang.String extraXml) throws java.rmi.RemoteException;
    public java.lang.String setAoo(java.lang.String xmlDocument, java.lang.String aooName) throws java.rmi.RemoteException;
    public java.lang.String assignByIndexVoiceAndCodAmmAoo(java.lang.String xmlDocument, java.lang.String indexVoice, java.lang.String codAmmAoo) throws java.rmi.RemoteException;
    public java.lang.String assignByIndexVoiceAndCodDipartimento(java.lang.String xmlDocument, java.lang.String indexVoice, java.lang.String codDiparticmento) throws java.rmi.RemoteException;
    public java.lang.String assignByIndexVoice(java.lang.String xmlDocument, java.lang.String indexVoice) throws java.rmi.RemoteException;
    public java.lang.String assignByMatricola(java.lang.String xmlDocument, java.lang.String matricola) throws java.rmi.RemoteException;
    public java.lang.String addNotifyRequest(java.lang.String xmlDocument, java.lang.String event, java.lang.String label, java.lang.String method, java.lang.String url, java.lang.String includeRecord) throws java.rmi.RemoteException;
    public java.lang.String getAooList() throws java.rmi.RemoteException;
    public java.lang.String getAooListWithCodAmmAoo() throws java.rmi.RemoteException;
    public java.lang.String getRecordInfos(java.lang.String id) throws java.rmi.RemoteException;
    public java.lang.String addInFolderByInfos(java.lang.String idDocToUpdate, java.lang.String newFolderSubject, java.lang.String newFolderIdType, java.lang.String newFolderId) throws java.rmi.RemoteException;
    public java.lang.String removePredecessor(java.lang.String idDocToUpdate, java.lang.String precedessorIdType, java.lang.String precedessorId) throws java.rmi.RemoteException;
    public java.lang.String addPredecessorInfo(java.lang.String xmlDocument, java.lang.String idType, java.lang.String id) throws java.rmi.RemoteException;
    public java.lang.String setFolderCreationInfos(java.lang.String xmlDocument, java.lang.String newFolderSubject, java.lang.String newFolderIdType, java.lang.String newFolderId) throws java.rmi.RemoteException;
}
