package it.cineca.titulus301.titulus_ws.services.Titulus4Ugov;

public class Titulus4UgovProxy implements it.cineca.titulus301.titulus_ws.services.Titulus4Ugov.Titulus4Ugov {
  private String _endpoint = null;
  private it.cineca.titulus301.titulus_ws.services.Titulus4Ugov.Titulus4Ugov titulus4Ugov = null;
  
  public Titulus4UgovProxy() {
    _initTitulus4UgovProxy();
  }
  
  public Titulus4UgovProxy(String endpoint) {
    _endpoint = endpoint;
    _initTitulus4UgovProxy();
  }
  
  private void _initTitulus4UgovProxy() {
    try {
      titulus4Ugov = (new it.cineca.titulus301.titulus_ws.services.Titulus4Ugov.Titulus4UgovServiceLocator()).getTitulus4Ugov();
      if (titulus4Ugov != null) {
        if (_endpoint != null)
          ((javax.xml.rpc.Stub)titulus4Ugov)._setProperty("javax.xml.rpc.service.endpoint.address", _endpoint);
        else
          _endpoint = (String)((javax.xml.rpc.Stub)titulus4Ugov)._getProperty("javax.xml.rpc.service.endpoint.address");
      }
      
    }
    catch (javax.xml.rpc.ServiceException serviceException) {}
  }
  
  public String getEndpoint() {
    return _endpoint;
  }
  
  public void setEndpoint(String endpoint) {
    _endpoint = endpoint;
    if (titulus4Ugov != null)
      ((javax.xml.rpc.Stub)titulus4Ugov)._setProperty("javax.xml.rpc.service.endpoint.address", _endpoint);
    
  }
  
  public it.cineca.titulus301.titulus_ws.services.Titulus4Ugov.Titulus4Ugov getTitulus4Ugov() {
    if (titulus4Ugov == null)
      _initTitulus4UgovProxy();
    return titulus4Ugov;
  }
  
  public java.lang.String caricaSeduta(java.lang.String idPersona, java.lang.String idSeduta, boolean includeOmissis) throws java.rmi.RemoteException{
    if (titulus4Ugov == null)
      _initTitulus4UgovProxy();
    return titulus4Ugov.caricaSeduta(idPersona, idSeduta, includeOmissis);
  }
  
  public it.kion.www.titulus.AttachmentBean getAttachment(java.lang.String fileId) throws java.rmi.RemoteException{
    if (titulus4Ugov == null)
      _initTitulus4UgovProxy();
    return titulus4Ugov.getAttachment(fileId);
  }
  
  public java.lang.String elencoOrgani(java.lang.String idPersona) throws java.rmi.RemoteException{
    if (titulus4Ugov == null)
      _initTitulus4UgovProxy();
    return titulus4Ugov.elencoOrgani(idPersona);
  }
  
  public java.lang.String loadDocument(java.lang.String id, boolean lock) throws java.rmi.RemoteException{
    if (titulus4Ugov == null)
      _initTitulus4UgovProxy();
    return titulus4Ugov.loadDocument(id, lock);
  }
  
  public java.lang.String setWSUser(java.lang.String user, java.lang.String pnumber) throws java.rmi.RemoteException{
    if (titulus4Ugov == null)
      _initTitulus4UgovProxy();
    return titulus4Ugov.setWSUser(user, pnumber);
  }
  
  public java.lang.String titlePage(int pageIndex) throws java.rmi.RemoteException{
    if (titulus4Ugov == null)
      _initTitulus4UgovProxy();
    return titulus4Ugov.titlePage(pageIndex);
  }
  
  public java.lang.String firstTitlePage() throws java.rmi.RemoteException{
    if (titulus4Ugov == null)
      _initTitulus4UgovProxy();
    return titulus4Ugov.firstTitlePage();
  }
  
  public java.lang.String nextTitlePage() throws java.rmi.RemoteException{
    if (titulus4Ugov == null)
      _initTitulus4UgovProxy();
    return titulus4Ugov.nextTitlePage();
  }
  
  public java.lang.String prevTitlePage() throws java.rmi.RemoteException{
    if (titulus4Ugov == null)
      _initTitulus4UgovProxy();
    return titulus4Ugov.prevTitlePage();
  }
  
  public java.lang.String lastTitlePage() throws java.rmi.RemoteException{
    if (titulus4Ugov == null)
      _initTitulus4UgovProxy();
    return titulus4Ugov.lastTitlePage();
  }
  
  public java.lang.String currentTitlePage() throws java.rmi.RemoteException{
    if (titulus4Ugov == null)
      _initTitulus4UgovProxy();
    return titulus4Ugov.currentTitlePage();
  }
  
  public boolean unlockDocument(java.lang.String id) throws java.rmi.RemoteException{
    if (titulus4Ugov == null)
      _initTitulus4UgovProxy();
    return titulus4Ugov.unlockDocument(id);
  }
  
  public java.lang.String loadFirstDocument() throws java.rmi.RemoteException{
    if (titulus4Ugov == null)
      _initTitulus4UgovProxy();
    return titulus4Ugov.loadFirstDocument();
  }
  
  public java.lang.String loadNextDocument() throws java.rmi.RemoteException{
    if (titulus4Ugov == null)
      _initTitulus4UgovProxy();
    return titulus4Ugov.loadNextDocument();
  }
  
  public java.lang.String loadLastDocument() throws java.rmi.RemoteException{
    if (titulus4Ugov == null)
      _initTitulus4UgovProxy();
    return titulus4Ugov.loadLastDocument();
  }
  
  public java.lang.String loadPrevDocument() throws java.rmi.RemoteException{
    if (titulus4Ugov == null)
      _initTitulus4UgovProxy();
    return titulus4Ugov.loadPrevDocument();
  }
  
  public java.lang.String saveDocument(java.lang.String document, it.kion.www.titulus.AttachmentBean[] attachmentBeans, it.kion.www.titulus.SaveParams params) throws java.rmi.RemoteException{
    if (titulus4Ugov == null)
      _initTitulus4UgovProxy();
    return titulus4Ugov.saveDocument(document, attachmentBeans, params);
  }
  
  public java.lang.String saveModifiedDocument(java.lang.String id, java.lang.String document) throws java.rmi.RemoteException{
    if (titulus4Ugov == null)
      _initTitulus4UgovProxy();
    return titulus4Ugov.saveModifiedDocument(id, document);
  }
  
  public boolean deleteDocument(java.lang.String id) throws java.rmi.RemoteException{
    if (titulus4Ugov == null)
      _initTitulus4UgovProxy();
    return titulus4Ugov.deleteDocument(id);
  }
  
  public it.kion.www.titulus.AttachmentBean[] checkInContentFiles(java.lang.String id, it.kion.www.titulus.AttachmentBean[] attachmentBeans, it.kion.www.titulus.SaveParams params) throws java.rmi.RemoteException{
    if (titulus4Ugov == null)
      _initTitulus4UgovProxy();
    return titulus4Ugov.checkInContentFiles(id, attachmentBeans, params);
  }
  
  public it.kion.www.titulus.AttachmentBean checkOutContentFile(java.lang.String id, java.lang.String fileId, boolean lock) throws java.rmi.RemoteException{
    if (titulus4Ugov == null)
      _initTitulus4UgovProxy();
    return titulus4Ugov.checkOutContentFile(id, fileId, lock);
  }
  
  public java.lang.String unlockContentFile(java.lang.String id, java.lang.String fileId) throws java.rmi.RemoteException{
    if (titulus4Ugov == null)
      _initTitulus4UgovProxy();
    return titulus4Ugov.unlockContentFile(id, fileId);
  }
  
  public java.lang.String validateContentFile(java.lang.String id) throws java.rmi.RemoteException{
    if (titulus4Ugov == null)
      _initTitulus4UgovProxy();
    return titulus4Ugov.validateContentFile(id);
  }
  
  public java.lang.String grantRight(java.lang.String id, java.lang.String rightType, java.lang.String userName, java.lang.String officeName, java.lang.String centerCode, boolean sendEMail) throws java.rmi.RemoteException{
    if (titulus4Ugov == null)
      _initTitulus4UgovProxy();
    return titulus4Ugov.grantRight(id, rightType, userName, officeName, centerCode, sendEMail);
  }
  
  public java.lang.String denyRight(java.lang.String id, java.lang.String rightType, java.lang.String userCode, java.lang.String officeCode) throws java.rmi.RemoteException{
    if (titulus4Ugov == null)
      _initTitulus4UgovProxy();
    return titulus4Ugov.denyRight(id, rightType, userCode, officeCode);
  }
  
  public java.lang.String postIt(java.lang.String id, java.lang.String postitContent) throws java.rmi.RemoteException{
    if (titulus4Ugov == null)
      _initTitulus4UgovProxy();
    return titulus4Ugov.postIt(id, postitContent);
  }
  
  public java.lang.String cancelDocument(java.lang.String id, java.lang.String reason) throws java.rmi.RemoteException{
    if (titulus4Ugov == null)
      _initTitulus4UgovProxy();
    return titulus4Ugov.cancelDocument(id, reason);
  }
  
  public java.lang.String applyRegistrationToDraft(java.lang.String id, boolean sendEMail) throws java.rmi.RemoteException{
    if (titulus4Ugov == null)
      _initTitulus4UgovProxy();
    return titulus4Ugov.applyRegistrationToDraft(id, sendEMail);
  }
  
  public java.lang.String applyRegistrationMark(java.lang.String id) throws java.rmi.RemoteException{
    if (titulus4Ugov == null)
      _initTitulus4UgovProxy();
    return titulus4Ugov.applyRegistrationMark(id);
  }
  
  public java.lang.String getRegistrationMark(java.lang.String id, boolean html) throws java.rmi.RemoteException{
    if (titulus4Ugov == null)
      _initTitulus4UgovProxy();
    return titulus4Ugov.getRegistrationMark(id, html);
  }
  
  public java.lang.String newFolder(java.lang.String xmlFolder) throws java.rmi.RemoteException{
    if (titulus4Ugov == null)
      _initTitulus4UgovProxy();
    return titulus4Ugov.newFolder(xmlFolder);
  }
  
  public java.lang.String modifyFolder(java.lang.String id, java.lang.String xmlFolder) throws java.rmi.RemoteException{
    if (titulus4Ugov == null)
      _initTitulus4UgovProxy();
    return titulus4Ugov.modifyFolder(id, xmlFolder);
  }
  
  public java.lang.String newSubFolder(java.lang.String folderParentCode, java.lang.String folderChildSubject, java.lang.String folderChildDiscard, java.lang.String folderChildNote, java.lang.String folderChildYear) throws java.rmi.RemoteException{
    if (titulus4Ugov == null)
      _initTitulus4UgovProxy();
    return titulus4Ugov.newSubFolder(folderParentCode, folderChildSubject, folderChildDiscard, folderChildNote, folderChildYear);
  }
  
  public boolean assignFolderRPA(java.lang.String id, java.lang.String userName, java.lang.String officeName, java.lang.String centerCode, boolean sendEMail) throws java.rmi.RemoteException{
    if (titulus4Ugov == null)
      _initTitulus4UgovProxy();
    return titulus4Ugov.assignFolderRPA(id, userName, officeName, centerCode, sendEMail);
  }
  
  public java.lang.String addInFolder(java.lang.String xmlInFolder) throws java.rmi.RemoteException{
    if (titulus4Ugov == null)
      _initTitulus4UgovProxy();
    return titulus4Ugov.addInFolder(xmlInFolder);
  }
  
  public java.lang.String removeFromFolder(java.lang.String xmlInFolder) throws java.rmi.RemoteException{
    if (titulus4Ugov == null)
      _initTitulus4UgovProxy();
    return titulus4Ugov.removeFromFolder(xmlInFolder);
  }
  
  public java.lang.String addLinkToFolder(java.lang.String xmlLinkToFolder) throws java.rmi.RemoteException{
    if (titulus4Ugov == null)
      _initTitulus4UgovProxy();
    return titulus4Ugov.addLinkToFolder(xmlLinkToFolder);
  }
  
  public java.lang.String deleteLinkToFolder(java.lang.String xmlLinkToFolder) throws java.rmi.RemoteException{
    if (titulus4Ugov == null)
      _initTitulus4UgovProxy();
    return titulus4Ugov.deleteLinkToFolder(xmlLinkToFolder);
  }
  
  public java.lang.String getFolderContent(java.lang.String id, boolean linked) throws java.rmi.RemoteException{
    if (titulus4Ugov == null)
      _initTitulus4UgovProxy();
    return titulus4Ugov.getFolderContent(id, linked);
  }
  
  public java.lang.String getFolderHierarchy(java.lang.String id, boolean linked) throws java.rmi.RemoteException{
    if (titulus4Ugov == null)
      _initTitulus4UgovProxy();
    return titulus4Ugov.getFolderHierarchy(id, linked);
  }
  
  public java.lang.String getFolder(java.lang.String id) throws java.rmi.RemoteException{
    if (titulus4Ugov == null)
      _initTitulus4UgovProxy();
    return titulus4Ugov.getFolder(id);
  }
  
  public java.lang.String closeFolder(java.lang.String id, it.kion.www.titulus.CFParams cfp) throws java.rmi.RemoteException{
    if (titulus4Ugov == null)
      _initTitulus4UgovProxy();
    return titulus4Ugov.closeFolder(id, cfp);
  }
  
  public java.lang.String openFolder(java.lang.String id) throws java.rmi.RemoteException{
    if (titulus4Ugov == null)
      _initTitulus4UgovProxy();
    return titulus4Ugov.openFolder(id);
  }
  
  public boolean deleteFolder(java.lang.String id) throws java.rmi.RemoteException{
    if (titulus4Ugov == null)
      _initTitulus4UgovProxy();
    return titulus4Ugov.deleteFolder(id);
  }
  
  public boolean startWorkflow(java.lang.String id, java.lang.String workflowName) throws java.rmi.RemoteException{
    if (titulus4Ugov == null)
      _initTitulus4UgovProxy();
    return titulus4Ugov.startWorkflow(id, workflowName);
  }
  
  public java.lang.String getWorkflowId(java.lang.String id) throws java.rmi.RemoteException{
    if (titulus4Ugov == null)
      _initTitulus4UgovProxy();
    return titulus4Ugov.getWorkflowId(id);
  }
  
  public java.lang.String getWorkflowAction(java.lang.String id, java.lang.String workflowId) throws java.rmi.RemoteException{
    if (titulus4Ugov == null)
      _initTitulus4UgovProxy();
    return titulus4Ugov.getWorkflowAction(id, workflowId);
  }
  
  public java.lang.String continueWorkflow(java.lang.String id, java.lang.String workflowId, java.lang.String actionId) throws java.rmi.RemoteException{
    if (titulus4Ugov == null)
      _initTitulus4UgovProxy();
    return titulus4Ugov.continueWorkflow(id, workflowId, actionId);
  }
  
  public java.lang.String getWsRelease() throws java.rmi.RemoteException{
    if (titulus4Ugov == null)
      _initTitulus4UgovProxy();
    return titulus4Ugov.getWsRelease();
  }
  
  public void receiveMsgForFTEL(java.lang.String id, java.lang.String nomeFileEsitoSdI, java.lang.String contenutoFileEsitoSdI) throws java.rmi.RemoteException{
    if (titulus4Ugov == null)
      _initTitulus4UgovProxy();
    titulus4Ugov.receiveMsgForFTEL(id, nomeFileEsitoSdI, contenutoFileEsitoSdI);
  }
  
  public java.lang.String addPredecessor(java.lang.String idDocToUpdate, java.lang.String xmlPredecessorInfos, java.lang.String newFolderSubject, java.lang.String newFolderIdType, java.lang.String newFolderId) throws java.rmi.RemoteException{
    if (titulus4Ugov == null)
      _initTitulus4UgovProxy();
    return titulus4Ugov.addPredecessor(idDocToUpdate, xmlPredecessorInfos, newFolderSubject, newFolderIdType, newFolderId);
  }
  
  public java.lang.String newSpecialFolder(java.lang.String xmlFolder) throws java.rmi.RemoteException{
    if (titulus4Ugov == null)
      _initTitulus4UgovProxy();
    return titulus4Ugov.newSpecialFolder(xmlFolder);
  }
  
  public java.lang.String replyDocument(java.lang.String xmlDocument, java.lang.String idFolder, boolean sendEMail) throws java.rmi.RemoteException{
    if (titulus4Ugov == null)
      _initTitulus4UgovProxy();
    return titulus4Ugov.replyDocument(xmlDocument, idFolder, sendEMail);
  }
  
  public java.lang.String getDashboard(java.lang.String label) throws java.rmi.RemoteException{
    if (titulus4Ugov == null)
      _initTitulus4UgovProxy();
    return titulus4Ugov.getDashboard(label);
  }
  
  public java.lang.String getDocumentFolders(java.lang.String id) throws java.rmi.RemoteException{
    if (titulus4Ugov == null)
      _initTitulus4UgovProxy();
    return titulus4Ugov.getDocumentFolders(id);
  }
  
  public java.lang.String getDocumentURL(java.lang.String id) throws java.rmi.RemoteException{
    if (titulus4Ugov == null)
      _initTitulus4UgovProxy();
    return titulus4Ugov.getDocumentURL(id);
  }
  
  public java.lang.String cercaSedute(java.lang.String idPersona, boolean allaFirma, boolean chiuse, boolean aperte, java.lang.String data, java.lang.String codOrgano, boolean reverseOrder) throws java.rmi.RemoteException{
    if (titulus4Ugov == null)
      _initTitulus4UgovProxy();
    return titulus4Ugov.cercaSedute(idPersona, allaFirma, chiuse, aperte, data, codOrgano, reverseOrder);
  }
  
  public boolean aggiornaFattura(java.lang.String xmlRegistro) throws java.rmi.RemoteException{
    if (titulus4Ugov == null)
      _initTitulus4UgovProxy();
    return titulus4Ugov.aggiornaFattura(xmlRegistro);
  }
  
  public java.lang.String addPredecessorFattura(java.lang.String idDocToUpdate, java.lang.String ipa, java.lang.String newFolderSubject, java.lang.String newFolderIdType, java.lang.String newFolderId) throws java.rmi.RemoteException{
    if (titulus4Ugov == null)
      _initTitulus4UgovProxy();
    return titulus4Ugov.addPredecessorFattura(idDocToUpdate, ipa, newFolderSubject, newFolderIdType, newFolderId);
  }
  
  public java.lang.String addPredecessorInfos(java.lang.String idDocToUpdate, java.lang.String precedessorIdType, java.lang.String precedessorId, java.lang.String newFolderSubject, java.lang.String newFolderIdType, java.lang.String newFolderId) throws java.rmi.RemoteException{
    if (titulus4Ugov == null)
      _initTitulus4UgovProxy();
    return titulus4Ugov.addPredecessorInfos(idDocToUpdate, precedessorIdType, precedessorId, newFolderSubject, newFolderIdType, newFolderId);
  }
  
  public java.lang.String addInFolderByInfos(java.lang.String idDocToUpdate, java.lang.String newFolderSubject, java.lang.String newFolderIdType, java.lang.String newFolderId) throws java.rmi.RemoteException{
    if (titulus4Ugov == null)
      _initTitulus4UgovProxy();
    return titulus4Ugov.addInFolderByInfos(idDocToUpdate, newFolderSubject, newFolderIdType, newFolderId);
  }
  
  public java.lang.String removePredecessor(java.lang.String idDocToUpdate, java.lang.String precedessorIdType, java.lang.String precedessorId) throws java.rmi.RemoteException{
    if (titulus4Ugov == null)
      _initTitulus4UgovProxy();
    return titulus4Ugov.removePredecessor(idDocToUpdate, precedessorIdType, precedessorId);
  }
  
  public boolean isProtocolledDocument(java.lang.String id) throws java.rmi.RemoteException{
    if (titulus4Ugov == null)
      _initTitulus4UgovProxy();
    return titulus4Ugov.isProtocolledDocument(id);
  }
  
  public java.lang.String searchFullText(java.lang.String text, java.lang.String orderby, it.kion.www.titulus.QueryParams params) throws java.rmi.RemoteException{
    if (titulus4Ugov == null)
      _initTitulus4UgovProxy();
    return titulus4Ugov.searchFullText(text, orderby, params);
  }
  
  public java.lang.String lookup(java.lang.String nome_uff, java.lang.String nome_persona) throws java.rmi.RemoteException{
    if (titulus4Ugov == null)
      _initTitulus4UgovProxy();
    return titulus4Ugov.lookup(nome_uff, nome_persona);
  }
  
  public java.lang.String search(java.lang.String query, java.lang.String orderby, it.kion.www.titulus.QueryParams params) throws java.rmi.RemoteException{
    if (titulus4Ugov == null)
      _initTitulus4UgovProxy();
    return titulus4Ugov.search(query, orderby, params);
  }
  
  
}