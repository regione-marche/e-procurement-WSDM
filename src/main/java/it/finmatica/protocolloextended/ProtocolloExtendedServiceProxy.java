package it.finmatica.protocolloextended;

public class ProtocolloExtendedServiceProxy implements it.finmatica.protocolloextended.ProtocolloExtendedService {
  private String _endpoint = null;
  private it.finmatica.protocolloextended.ProtocolloExtendedService protocolloExtendedService = null;
  
  public ProtocolloExtendedServiceProxy() {
    _initProtocolloExtendedServiceProxy();
  }
  
  public ProtocolloExtendedServiceProxy(String endpoint) {
    _endpoint = endpoint;
    _initProtocolloExtendedServiceProxy();
  }
  
  private void _initProtocolloExtendedServiceProxy() {
    try {
      protocolloExtendedService = (new it.finmatica.protocolloextended.ProtocolloExtendedServiceServiceLocator()).getProtocolloExtendedServicePort();
      if (protocolloExtendedService != null) {
        if (_endpoint != null)
          ((javax.xml.rpc.Stub)protocolloExtendedService)._setProperty("javax.xml.rpc.service.endpoint.address", _endpoint);
        else
          _endpoint = (String)((javax.xml.rpc.Stub)protocolloExtendedService)._getProperty("javax.xml.rpc.service.endpoint.address");
      }
      
    }
    catch (javax.xml.rpc.ServiceException serviceException) {}
  }
  
  public String getEndpoint() {
    return _endpoint;
  }
  
  public void setEndpoint(String endpoint) {
    _endpoint = endpoint;
    if (protocolloExtendedService != null)
      ((javax.xml.rpc.Stub)protocolloExtendedService)._setProperty("javax.xml.rpc.service.endpoint.address", _endpoint);
    
  }
  
  public it.finmatica.protocolloextended.ProtocolloExtendedService getProtocolloExtendedService() {
    if (protocolloExtendedService == null)
      _initProtocolloExtendedServiceProxy();
    return protocolloExtendedService;
  }
  
  public java.lang.String getDocumentiProtocollati(java.lang.String user, java.lang.String DST, java.lang.String xml) throws java.rmi.RemoteException{
    if (protocolloExtendedService == null)
      _initProtocolloExtendedServiceProxy();
    return protocolloExtendedService.getDocumentiProtocollati(user, DST, xml);
  }
  
  public java.lang.String modFascicolo(java.lang.String user, java.lang.String DST, java.lang.String xml) throws java.rmi.RemoteException{
    if (protocolloExtendedService == null)
      _initProtocolloExtendedServiceProxy();
    return protocolloExtendedService.modFascicolo(user, DST, xml);
  }
  
  public java.lang.String getFascicoli(java.lang.String user, java.lang.String DST, java.lang.String xml) throws java.rmi.RemoteException{
    if (protocolloExtendedService == null)
      _initProtocolloExtendedServiceProxy();
    return protocolloExtendedService.getFascicoli(user, DST, xml);
  }
  
  public java.lang.String modProtocollo(java.lang.String user, java.lang.String DST, java.lang.String xml) throws java.rmi.RemoteException{
    if (protocolloExtendedService == null)
      _initProtocolloExtendedServiceProxy();
    return protocolloExtendedService.modProtocollo(user, DST, xml);
  }
  
  public java.lang.String collegaFascicoli(java.lang.String user, java.lang.String DST, java.lang.String xml) throws java.rmi.RemoteException{
    if (protocolloExtendedService == null)
      _initProtocolloExtendedServiceProxy();
    return protocolloExtendedService.collegaFascicoli(user, DST, xml);
  }
  
  public java.lang.String getInfoPec(java.lang.String user, java.lang.String DST, java.lang.String xml) throws java.rmi.RemoteException{
    if (protocolloExtendedService == null)
      _initProtocolloExtendedServiceProxy();
    return protocolloExtendedService.getInfoPec(user, DST, xml);
  }
  
  public java.lang.String addFilePrincipale(java.lang.String user, java.lang.String DST, java.lang.String xml) throws java.rmi.RemoteException{
    if (protocolloExtendedService == null)
      _initProtocolloExtendedServiceProxy();
    return protocolloExtendedService.addFilePrincipale(user, DST, xml);
  }
  
  public java.lang.String delFilePrincipale(java.lang.String user, java.lang.String DST, java.lang.String xml) throws java.rmi.RemoteException{
    if (protocolloExtendedService == null)
      _initProtocolloExtendedServiceProxy();
    return protocolloExtendedService.delFilePrincipale(user, DST, xml);
  }
  
  public java.lang.String delDocumento(java.lang.String user, java.lang.String DST, java.lang.String xml) throws java.rmi.RemoteException{
    if (protocolloExtendedService == null)
      _initProtocolloExtendedServiceProxy();
    return protocolloExtendedService.delDocumento(user, DST, xml);
  }
  
  public java.lang.String getClassifiche(java.lang.String user, java.lang.String DST, java.lang.String xml) throws java.rmi.RemoteException{
    if (protocolloExtendedService == null)
      _initProtocolloExtendedServiceProxy();
    return protocolloExtendedService.getClassifiche(user, DST, xml);
  }
  
  public java.lang.String addRapporto(java.lang.String user, java.lang.String DST, java.lang.String xml) throws java.rmi.RemoteException{
    if (protocolloExtendedService == null)
      _initProtocolloExtendedServiceProxy();
    return protocolloExtendedService.addRapporto(user, DST, xml);
  }
  
  public java.lang.String getDocumentiNonProtocollati(java.lang.String user, java.lang.String DST, java.lang.String xml) throws java.rmi.RemoteException{
    if (protocolloExtendedService == null)
      _initProtocolloExtendedServiceProxy();
    return protocolloExtendedService.getDocumentiNonProtocollati(user, DST, xml);
  }
  
  public java.lang.String collegaDocumenti(java.lang.String user, java.lang.String DST, java.lang.String xml) throws java.rmi.RemoteException{
    if (protocolloExtendedService == null)
      _initProtocolloExtendedServiceProxy();
    return protocolloExtendedService.collegaDocumenti(user, DST, xml);
  }
  
  public java.lang.String creaFascicolo(java.lang.String user, java.lang.String DST, java.lang.String xml) throws java.rmi.RemoteException{
    if (protocolloExtendedService == null)
      _initProtocolloExtendedServiceProxy();
    return protocolloExtendedService.creaFascicolo(user, DST, xml);
  }
  
  public java.lang.String rimuoviDocumentoDalFascicolo(java.lang.String user, java.lang.String DST, java.lang.String xml) throws java.rmi.RemoteException{
    if (protocolloExtendedService == null)
      _initProtocolloExtendedServiceProxy();
    return protocolloExtendedService.rimuoviDocumentoDalFascicolo(user, DST, xml);
  }
  
  public java.lang.String inserisciDocumentoInFascicolo(java.lang.String user, java.lang.String DST, java.lang.String xml) throws java.rmi.RemoteException{
    if (protocolloExtendedService == null)
      _initProtocolloExtendedServiceProxy();
    return protocolloExtendedService.inserisciDocumentoInFascicolo(user, DST, xml);
  }
  
  public java.lang.String getDocumento(java.lang.String user, java.lang.String DST, java.lang.String xml) throws java.rmi.RemoteException{
    if (protocolloExtendedService == null)
      _initProtocolloExtendedServiceProxy();
    return protocolloExtendedService.getDocumento(user, DST, xml);
  }
  
  public java.lang.String creaDocumento(java.lang.String user, java.lang.String DST, java.lang.String xml) throws java.rmi.RemoteException{
    if (protocolloExtendedService == null)
      _initProtocolloExtendedServiceProxy();
    return protocolloExtendedService.creaDocumento(user, DST, xml);
  }
  
  public java.lang.String delFascicolo(java.lang.String user, java.lang.String DST, java.lang.String xml) throws java.rmi.RemoteException{
    if (protocolloExtendedService == null)
      _initProtocolloExtendedServiceProxy();
    return protocolloExtendedService.delFascicolo(user, DST, xml);
  }
  
  public java.lang.String modDocumento(java.lang.String user, java.lang.String DST, java.lang.String xml) throws java.rmi.RemoteException{
    if (protocolloExtendedService == null)
      _initProtocolloExtendedServiceProxy();
    return protocolloExtendedService.modDocumento(user, DST, xml);
  }
  
  public java.lang.String delRapporto(java.lang.String user, java.lang.String DST, java.lang.String xml) throws java.rmi.RemoteException{
    if (protocolloExtendedService == null)
      _initProtocolloExtendedServiceProxy();
    return protocolloExtendedService.delRapporto(user, DST, xml);
  }
  
  public java.lang.String addSmistamento(java.lang.String user, java.lang.String DST, java.lang.String xml) throws java.rmi.RemoteException{
    if (protocolloExtendedService == null)
      _initProtocolloExtendedServiceProxy();
    return protocolloExtendedService.addSmistamento(user, DST, xml);
  }
  
  public java.lang.String delSmistamento(java.lang.String user, java.lang.String DST, java.lang.String xml) throws java.rmi.RemoteException{
    if (protocolloExtendedService == null)
      _initProtocolloExtendedServiceProxy();
    return protocolloExtendedService.delSmistamento(user, DST, xml);
  }
  
  
}