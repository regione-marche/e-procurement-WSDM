/**
 * Titulus4Ugov.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package it.cineca.titulus301.titulus_ws.services.Titulus4Ugov;

public interface Titulus4Ugov extends java.rmi.Remote {
    public java.lang.String caricaSeduta(java.lang.String idPersona, java.lang.String idSeduta, boolean includeOmissis) throws java.rmi.RemoteException;
    public it.kion.www.titulus.AttachmentBean getAttachment(java.lang.String fileId) throws java.rmi.RemoteException;
    public java.lang.String elencoOrgani(java.lang.String idPersona) throws java.rmi.RemoteException;
    public java.lang.String loadDocument(java.lang.String id, boolean lock) throws java.rmi.RemoteException;
    public java.lang.String setWSUser(java.lang.String user, java.lang.String pnumber) throws java.rmi.RemoteException;
    public java.lang.String titlePage(int pageIndex) throws java.rmi.RemoteException;
    public java.lang.String firstTitlePage() throws java.rmi.RemoteException;
    public java.lang.String nextTitlePage() throws java.rmi.RemoteException;
    public java.lang.String prevTitlePage() throws java.rmi.RemoteException;
    public java.lang.String lastTitlePage() throws java.rmi.RemoteException;
    public java.lang.String currentTitlePage() throws java.rmi.RemoteException;
    public boolean unlockDocument(java.lang.String id) throws java.rmi.RemoteException;
    public java.lang.String loadFirstDocument() throws java.rmi.RemoteException;
    public java.lang.String loadNextDocument() throws java.rmi.RemoteException;
    public java.lang.String loadLastDocument() throws java.rmi.RemoteException;
    public java.lang.String loadPrevDocument() throws java.rmi.RemoteException;
    public java.lang.String saveDocument(java.lang.String document, it.kion.www.titulus.AttachmentBean[] attachmentBeans, it.kion.www.titulus.SaveParams params) throws java.rmi.RemoteException;
    public java.lang.String saveModifiedDocument(java.lang.String id, java.lang.String document) throws java.rmi.RemoteException;
    public boolean deleteDocument(java.lang.String id) throws java.rmi.RemoteException;
    public it.kion.www.titulus.AttachmentBean[] checkInContentFiles(java.lang.String id, it.kion.www.titulus.AttachmentBean[] attachmentBeans, it.kion.www.titulus.SaveParams params) throws java.rmi.RemoteException;
    public it.kion.www.titulus.AttachmentBean checkOutContentFile(java.lang.String id, java.lang.String fileId, boolean lock) throws java.rmi.RemoteException;
    public java.lang.String unlockContentFile(java.lang.String id, java.lang.String fileId) throws java.rmi.RemoteException;
    public java.lang.String validateContentFile(java.lang.String id) throws java.rmi.RemoteException;
    public java.lang.String grantRight(java.lang.String id, java.lang.String rightType, java.lang.String userName, java.lang.String officeName, java.lang.String centerCode, boolean sendEMail) throws java.rmi.RemoteException;
    public java.lang.String denyRight(java.lang.String id, java.lang.String rightType, java.lang.String userCode, java.lang.String officeCode) throws java.rmi.RemoteException;
    public java.lang.String postIt(java.lang.String id, java.lang.String postitContent) throws java.rmi.RemoteException;
    public java.lang.String cancelDocument(java.lang.String id, java.lang.String reason) throws java.rmi.RemoteException;
    public java.lang.String applyRegistrationToDraft(java.lang.String id, boolean sendEMail) throws java.rmi.RemoteException;
    public java.lang.String applyRegistrationMark(java.lang.String id) throws java.rmi.RemoteException;
    public java.lang.String getRegistrationMark(java.lang.String id, boolean html) throws java.rmi.RemoteException;
    public java.lang.String newFolder(java.lang.String xmlFolder) throws java.rmi.RemoteException;
    public java.lang.String modifyFolder(java.lang.String id, java.lang.String xmlFolder) throws java.rmi.RemoteException;
    public java.lang.String newSubFolder(java.lang.String folderParentCode, java.lang.String folderChildSubject, java.lang.String folderChildDiscard, java.lang.String folderChildNote, java.lang.String folderChildYear) throws java.rmi.RemoteException;
    public boolean assignFolderRPA(java.lang.String id, java.lang.String userName, java.lang.String officeName, java.lang.String centerCode, boolean sendEMail) throws java.rmi.RemoteException;
    public java.lang.String addInFolder(java.lang.String xmlInFolder) throws java.rmi.RemoteException;
    public java.lang.String removeFromFolder(java.lang.String xmlInFolder) throws java.rmi.RemoteException;
    public java.lang.String addLinkToFolder(java.lang.String xmlLinkToFolder) throws java.rmi.RemoteException;
    public java.lang.String deleteLinkToFolder(java.lang.String xmlLinkToFolder) throws java.rmi.RemoteException;
    public java.lang.String getFolderContent(java.lang.String id, boolean linked) throws java.rmi.RemoteException;
    public java.lang.String getFolderHierarchy(java.lang.String id, boolean linked) throws java.rmi.RemoteException;
    public java.lang.String getFolder(java.lang.String id) throws java.rmi.RemoteException;
    public java.lang.String closeFolder(java.lang.String id, it.kion.www.titulus.CFParams cfp) throws java.rmi.RemoteException;
    public java.lang.String openFolder(java.lang.String id) throws java.rmi.RemoteException;
    public boolean deleteFolder(java.lang.String id) throws java.rmi.RemoteException;
    public boolean startWorkflow(java.lang.String id, java.lang.String workflowName) throws java.rmi.RemoteException;
    public java.lang.String getWorkflowId(java.lang.String id) throws java.rmi.RemoteException;
    public java.lang.String getWorkflowAction(java.lang.String id, java.lang.String workflowId) throws java.rmi.RemoteException;
    public java.lang.String continueWorkflow(java.lang.String id, java.lang.String workflowId, java.lang.String actionId) throws java.rmi.RemoteException;
    public java.lang.String getWsRelease() throws java.rmi.RemoteException;
    public void receiveMsgForFTEL(java.lang.String id, java.lang.String nomeFileEsitoSdI, java.lang.String contenutoFileEsitoSdI) throws java.rmi.RemoteException;
    public java.lang.String addPredecessor(java.lang.String idDocToUpdate, java.lang.String xmlPredecessorInfos, java.lang.String newFolderSubject, java.lang.String newFolderIdType, java.lang.String newFolderId) throws java.rmi.RemoteException;
    public java.lang.String newSpecialFolder(java.lang.String xmlFolder) throws java.rmi.RemoteException;
    public java.lang.String replyDocument(java.lang.String xmlDocument, java.lang.String idFolder, boolean sendEMail) throws java.rmi.RemoteException;
    public java.lang.String getDashboard(java.lang.String label) throws java.rmi.RemoteException;
    public java.lang.String getDocumentFolders(java.lang.String id) throws java.rmi.RemoteException;
    public java.lang.String getDocumentURL(java.lang.String id) throws java.rmi.RemoteException;
    public java.lang.String cercaSedute(java.lang.String idPersona, boolean allaFirma, boolean chiuse, boolean aperte, java.lang.String data, java.lang.String codOrgano, boolean reverseOrder) throws java.rmi.RemoteException;
    public boolean aggiornaFattura(java.lang.String xmlRegistro) throws java.rmi.RemoteException;
    public java.lang.String addPredecessorFattura(java.lang.String idDocToUpdate, java.lang.String ipa, java.lang.String newFolderSubject, java.lang.String newFolderIdType, java.lang.String newFolderId) throws java.rmi.RemoteException;
    public java.lang.String addPredecessorInfos(java.lang.String idDocToUpdate, java.lang.String precedessorIdType, java.lang.String precedessorId, java.lang.String newFolderSubject, java.lang.String newFolderIdType, java.lang.String newFolderId) throws java.rmi.RemoteException;
    public java.lang.String addInFolderByInfos(java.lang.String idDocToUpdate, java.lang.String newFolderSubject, java.lang.String newFolderIdType, java.lang.String newFolderId) throws java.rmi.RemoteException;
    public java.lang.String removePredecessor(java.lang.String idDocToUpdate, java.lang.String precedessorIdType, java.lang.String precedessorId) throws java.rmi.RemoteException;
    public boolean isProtocolledDocument(java.lang.String id) throws java.rmi.RemoteException;
    public java.lang.String searchFullText(java.lang.String text, java.lang.String orderby, it.kion.www.titulus.QueryParams params) throws java.rmi.RemoteException;
    public java.lang.String lookup(java.lang.String nome_uff, java.lang.String nome_persona) throws java.rmi.RemoteException;
    public java.lang.String search(java.lang.String query, java.lang.String orderby, it.kion.www.titulus.QueryParams params) throws java.rmi.RemoteException;
}
