package it.cineca.titulus301.titulus_ws.services.Titulus4Depository;

public class Titulus4DepositoryProxy implements it.cineca.titulus301.titulus_ws.services.Titulus4Depository.Titulus4Depository {
  private String _endpoint = null;
  private it.cineca.titulus301.titulus_ws.services.Titulus4Depository.Titulus4Depository titulus4Depository = null;
  
  public Titulus4DepositoryProxy() {
    _initTitulus4DepositoryProxy();
  }
  
  public Titulus4DepositoryProxy(String endpoint) {
    _endpoint = endpoint;
    _initTitulus4DepositoryProxy();
  }
  
  private void _initTitulus4DepositoryProxy() {
    try {
      titulus4Depository = (new it.cineca.titulus301.titulus_ws.services.Titulus4Depository.Titulus4DepositoryServiceLocator()).getTitulus4Depository();
      if (titulus4Depository != null) {
        if (_endpoint != null)
          ((javax.xml.rpc.Stub)titulus4Depository)._setProperty("javax.xml.rpc.service.endpoint.address", _endpoint);
        else
          _endpoint = (String)((javax.xml.rpc.Stub)titulus4Depository)._getProperty("javax.xml.rpc.service.endpoint.address");
      }
      
    }
    catch (javax.xml.rpc.ServiceException serviceException) {}
  }
  
  public String getEndpoint() {
    return _endpoint;
  }
  
  public void setEndpoint(String endpoint) {
    _endpoint = endpoint;
    if (titulus4Depository != null)
      ((javax.xml.rpc.Stub)titulus4Depository)._setProperty("javax.xml.rpc.service.endpoint.address", _endpoint);
    
  }
  
  public it.cineca.titulus301.titulus_ws.services.Titulus4Depository.Titulus4Depository getTitulus4Depository() {
    if (titulus4Depository == null)
      _initTitulus4DepositoryProxy();
    return titulus4Depository;
  }
  
  public java.lang.String setCodAmmAoo(java.lang.String xmlDocument, java.lang.String codAmmAoo) throws java.rmi.RemoteException{
    if (titulus4Depository == null)
      _initTitulus4DepositoryProxy();
    return titulus4Depository.setCodAmmAoo(xmlDocument, codAmmAoo);
  }
  
  public java.lang.String saveDocument(java.lang.String xmlDocument, it.kion.www.titulus.AttachmentBean[] attachmentBeans, it.kion.www.titulus.SaveParams params) throws java.rmi.RemoteException{
    if (titulus4Depository == null)
      _initTitulus4DepositoryProxy();
    return titulus4Depository.saveDocument(xmlDocument, attachmentBeans, params);
  }
  
  public java.lang.String addPredecessor(java.lang.String idDocToUpdate, java.lang.String xmlPredecessorInfos, java.lang.String newFolderSubject, java.lang.String newFolderIdType, java.lang.String newFolderId) throws java.rmi.RemoteException{
    if (titulus4Depository == null)
      _initTitulus4DepositoryProxy();
    return titulus4Depository.addPredecessor(idDocToUpdate, xmlPredecessorInfos, newFolderSubject, newFolderIdType, newFolderId);
  }
  
  public java.lang.String createDocXmlVarie(java.lang.String autore, java.lang.String oggetto, java.lang.String[] descrizioniAllegati, java.lang.String note, java.lang.String extraXml) throws java.rmi.RemoteException{
    if (titulus4Depository == null)
      _initTitulus4DepositoryProxy();
    return titulus4Depository.createDocXmlVarie(autore, oggetto, descrizioniAllegati, note, extraXml);
  }
  
  public java.lang.String loadDocTemplate(java.lang.String configurationFileId) throws java.rmi.RemoteException{
    if (titulus4Depository == null)
      _initTitulus4DepositoryProxy();
    return titulus4Depository.loadDocTemplate(configurationFileId);
  }
  
  public java.lang.String getDocTemplateList() throws java.rmi.RemoteException{
    if (titulus4Depository == null)
      _initTitulus4DepositoryProxy();
    return titulus4Depository.getDocTemplateList();
  }
  
  public java.lang.String setExtraContent(java.lang.String xmlDocument, java.lang.String extraXml) throws java.rmi.RemoteException{
    if (titulus4Depository == null)
      _initTitulus4DepositoryProxy();
    return titulus4Depository.setExtraContent(xmlDocument, extraXml);
  }
  
  public java.lang.String setAoo(java.lang.String xmlDocument, java.lang.String aooName) throws java.rmi.RemoteException{
    if (titulus4Depository == null)
      _initTitulus4DepositoryProxy();
    return titulus4Depository.setAoo(xmlDocument, aooName);
  }
  
  public java.lang.String assignByIndexVoiceAndCodAmmAoo(java.lang.String xmlDocument, java.lang.String indexVoice, java.lang.String codAmmAoo) throws java.rmi.RemoteException{
    if (titulus4Depository == null)
      _initTitulus4DepositoryProxy();
    return titulus4Depository.assignByIndexVoiceAndCodAmmAoo(xmlDocument, indexVoice, codAmmAoo);
  }
  
  public java.lang.String assignByIndexVoiceAndCodDipartimento(java.lang.String xmlDocument, java.lang.String indexVoice, java.lang.String codDiparticmento) throws java.rmi.RemoteException{
    if (titulus4Depository == null)
      _initTitulus4DepositoryProxy();
    return titulus4Depository.assignByIndexVoiceAndCodDipartimento(xmlDocument, indexVoice, codDiparticmento);
  }
  
  public java.lang.String assignByIndexVoice(java.lang.String xmlDocument, java.lang.String indexVoice) throws java.rmi.RemoteException{
    if (titulus4Depository == null)
      _initTitulus4DepositoryProxy();
    return titulus4Depository.assignByIndexVoice(xmlDocument, indexVoice);
  }
  
  public java.lang.String assignByMatricola(java.lang.String xmlDocument, java.lang.String matricola) throws java.rmi.RemoteException{
    if (titulus4Depository == null)
      _initTitulus4DepositoryProxy();
    return titulus4Depository.assignByMatricola(xmlDocument, matricola);
  }
  
  public java.lang.String addNotifyRequest(java.lang.String xmlDocument, java.lang.String event, java.lang.String label, java.lang.String method, java.lang.String url, java.lang.String includeRecord) throws java.rmi.RemoteException{
    if (titulus4Depository == null)
      _initTitulus4DepositoryProxy();
    return titulus4Depository.addNotifyRequest(xmlDocument, event, label, method, url, includeRecord);
  }
  
  public java.lang.String getAooList() throws java.rmi.RemoteException{
    if (titulus4Depository == null)
      _initTitulus4DepositoryProxy();
    return titulus4Depository.getAooList();
  }
  
  public java.lang.String getAooListWithCodAmmAoo() throws java.rmi.RemoteException{
    if (titulus4Depository == null)
      _initTitulus4DepositoryProxy();
    return titulus4Depository.getAooListWithCodAmmAoo();
  }
  
  public java.lang.String getRecordInfos(java.lang.String id) throws java.rmi.RemoteException{
    if (titulus4Depository == null)
      _initTitulus4DepositoryProxy();
    return titulus4Depository.getRecordInfos(id);
  }
  
  public java.lang.String addInFolderByInfos(java.lang.String idDocToUpdate, java.lang.String newFolderSubject, java.lang.String newFolderIdType, java.lang.String newFolderId) throws java.rmi.RemoteException{
    if (titulus4Depository == null)
      _initTitulus4DepositoryProxy();
    return titulus4Depository.addInFolderByInfos(idDocToUpdate, newFolderSubject, newFolderIdType, newFolderId);
  }
  
  public java.lang.String removePredecessor(java.lang.String idDocToUpdate, java.lang.String precedessorIdType, java.lang.String precedessorId) throws java.rmi.RemoteException{
    if (titulus4Depository == null)
      _initTitulus4DepositoryProxy();
    return titulus4Depository.removePredecessor(idDocToUpdate, precedessorIdType, precedessorId);
  }
  
  public java.lang.String addPredecessorInfo(java.lang.String xmlDocument, java.lang.String idType, java.lang.String id) throws java.rmi.RemoteException{
    if (titulus4Depository == null)
      _initTitulus4DepositoryProxy();
    return titulus4Depository.addPredecessorInfo(xmlDocument, idType, id);
  }
  
  public java.lang.String setFolderCreationInfos(java.lang.String xmlDocument, java.lang.String newFolderSubject, java.lang.String newFolderIdType, java.lang.String newFolderId) throws java.rmi.RemoteException{
    if (titulus4Depository == null)
      _initTitulus4DepositoryProxy();
    return titulus4Depository.setFolderCreationInfos(xmlDocument, newFolderSubject, newFolderIdType, newFolderId);
  }
  
  
}