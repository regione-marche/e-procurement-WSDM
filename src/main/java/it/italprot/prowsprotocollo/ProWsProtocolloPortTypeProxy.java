package it.italprot.prowsprotocollo;

public class ProWsProtocolloPortTypeProxy implements it.italprot.prowsprotocollo.ProWsProtocolloPortType {
  private String _endpoint = null;
  private it.italprot.prowsprotocollo.ProWsProtocolloPortType proWsProtocolloPortType = null;
  
  public ProWsProtocolloPortTypeProxy() {
    _initProWsProtocolloPortTypeProxy();
  }
  
  public ProWsProtocolloPortTypeProxy(String endpoint) {
    _endpoint = endpoint;
    _initProWsProtocolloPortTypeProxy();
  }
  
  private void _initProWsProtocolloPortTypeProxy() {
    try {
      proWsProtocolloPortType = (new it.italprot.prowsprotocollo.ProWsProtocolloLocator()).getproWsProtocolloPort();
      if (proWsProtocolloPortType != null) {
        if (_endpoint != null)
          ((javax.xml.rpc.Stub)proWsProtocolloPortType)._setProperty("javax.xml.rpc.service.endpoint.address", _endpoint);
        else
          _endpoint = (String)((javax.xml.rpc.Stub)proWsProtocolloPortType)._getProperty("javax.xml.rpc.service.endpoint.address");
      }
      
    }
    catch (javax.xml.rpc.ServiceException serviceException) {}
  }
  
  public String getEndpoint() {
    return _endpoint;
  }
  
  public void setEndpoint(String endpoint) {
    _endpoint = endpoint;
    if (proWsProtocolloPortType != null)
      ((javax.xml.rpc.Stub)proWsProtocolloPortType)._setProperty("javax.xml.rpc.service.endpoint.address", _endpoint);
    
  }
  
  public it.italprot.prowsprotocollo.ProWsProtocolloPortType getProWsProtocolloPortType() {
    if (proWsProtocolloPortType == null)
      _initProWsProtocolloPortTypeProxy();
    return proWsProtocolloPortType;
  }
  
  public java.lang.String getItaEngineContextToken(java.lang.String userName, java.lang.String userPassword, java.lang.String domainCode) throws java.rmi.RemoteException{
    if (proWsProtocolloPortType == null)
      _initProWsProtocolloPortTypeProxy();
    return proWsProtocolloPortType.getItaEngineContextToken(userName, userPassword, domainCode);
  }
  
  public void getItaEngineContextTokenInfo(java.lang.String token, java.lang.String domainCode, javax.xml.rpc.holders.StringHolder userName, javax.xml.rpc.holders.StringHolder userCode) throws java.rmi.RemoteException{
    if (proWsProtocolloPortType == null)
      _initProWsProtocolloPortTypeProxy();
    proWsProtocolloPortType.getItaEngineContextTokenInfo(token, domainCode, userName, userCode);
  }
  
  public java.lang.String checkItaEngineContextToken(java.lang.String token, java.lang.String domainCode) throws java.rmi.RemoteException{
    if (proWsProtocolloPortType == null)
      _initProWsProtocolloPortTypeProxy();
    return proWsProtocolloPortType.checkItaEngineContextToken(token, domainCode);
  }
  
  public java.lang.String destroyItaEngineContextToken(java.lang.String token, java.lang.String domainCode) throws java.rmi.RemoteException{
    if (proWsProtocolloPortType == null)
      _initProWsProtocolloPortTypeProxy();
    return proWsProtocolloPortType.destroyItaEngineContextToken(token, domainCode);
  }
  
  public void getAllegato(java.lang.String token, java.lang.String id, java.lang.String blockSize, java.lang.String part, it.italprot.prowsprotocollo.holders.AllegatoHolder allegato, it.italprot.prowsprotocollo.holders.MessageResultHolder messageResult) throws java.rmi.RemoteException{
    if (proWsProtocolloPortType == null)
      _initProWsProtocolloPortTypeProxy();
    proWsProtocolloPortType.getAllegato(token, id, blockSize, part, allegato, messageResult);
  }
  
  public void getProtocollo(java.lang.String token, java.lang.String anno, java.lang.String numero, java.lang.String tipo, java.lang.String segnatura, it.italprot.prowsprotocollo.holders.ItemProtocolloHolder items, it.italprot.prowsprotocollo.holders.MessageResultHolder messageResult) throws java.rmi.RemoteException{
    if (proWsProtocolloPortType == null)
      _initProWsProtocolloPortTypeProxy();
    proWsProtocolloPortType.getProtocollo(token, anno, numero, tipo, segnatura, items, messageResult);
  }
  
  public void checkDocumentoAllaFirma(java.lang.String token, java.lang.String numeroDocumento, it.italprot.prowsprotocollo.holders.ItemEsitoFirmaHolder items, it.italprot.prowsprotocollo.holders.MessageResultHolder messageResult) throws java.rmi.RemoteException{
    if (proWsProtocolloPortType == null)
      _initProWsProtocolloPortTypeProxy();
    proWsProtocolloPortType.checkDocumentoAllaFirma(token, numeroDocumento, items, messageResult);
  }
  
  public void getProtocolloFattura(java.lang.String token, java.lang.String fileFattura, it.italprot.prowsprotocollo.holders.ItemProtocolloHolder items, it.italprot.prowsprotocollo.holders.MessageResultHolder messageResult) throws java.rmi.RemoteException{
    if (proWsProtocolloPortType == null)
      _initProWsProtocolloPortTypeProxy();
    proWsProtocolloPortType.getProtocolloFattura(token, fileFattura, items, messageResult);
  }
  
  public void getOrganigramma(java.lang.String token, it.italprot.prowsprotocollo.holders.OrganigrammaHolder organigramma, it.italprot.prowsprotocollo.holders.MessageResultHolder messageResult) throws java.rmi.RemoteException{
    if (proWsProtocolloPortType == null)
      _initProWsProtocolloPortTypeProxy();
    proWsProtocolloPortType.getOrganigramma(token, organigramma, messageResult);
  }
  
  public void putAllegato(java.lang.String token, java.lang.String anno, java.lang.String numero, java.lang.String tipo, java.lang.String tipoFile, java.lang.String nomeFile, java.lang.String estensione, java.lang.String stream, java.lang.String note, java.lang.String marcaDocumento, java.lang.String mettiAllaFirma, it.italprot.prowsprotocollo.holders.AllegatiHolder allegati, it.italprot.prowsprotocollo.holders.MessageResultHolder messageResult) throws java.rmi.RemoteException{
    if (proWsProtocolloPortType == null)
      _initProWsProtocolloPortTypeProxy();
    proWsProtocolloPortType.putAllegato(token, anno, numero, tipo, tipoFile, nomeFile, estensione, stream, note, marcaDocumento, mettiAllaFirma, allegati, messageResult);
  }
  
  public void putAllegatoDocumentoAllaFirma(java.lang.String token, java.lang.String numero, java.lang.String tipoFile, java.lang.String nomeFile, java.lang.String estensione, java.lang.String stream, java.lang.String note, java.lang.String marcaDocumento, java.lang.String mettiAllaFirma, it.italprot.prowsprotocollo.holders.AllegatiHolder allegati, it.italprot.prowsprotocollo.holders.MessageResultHolder messageResult) throws java.rmi.RemoteException{
    if (proWsProtocolloPortType == null)
      _initProWsProtocolloPortTypeProxy();
    proWsProtocolloPortType.putAllegatoDocumentoAllaFirma(token, numero, tipoFile, nomeFile, estensione, stream, note, marcaDocumento, mettiAllaFirma, allegati, messageResult);
  }
  
  public void putProtocollo(java.lang.String token, it.italprot.prowsprotocollo.DatiProtocollo datiProtocollo, it.italprot.prowsprotocollo.holders.RetProtocolloHolder datiProtocollo2, it.italprot.prowsprotocollo.holders.MessageResultHolder messageResult) throws java.rmi.RemoteException{
    if (proWsProtocolloPortType == null)
      _initProWsProtocolloPortTypeProxy();
    proWsProtocolloPortType.putProtocollo(token, datiProtocollo, datiProtocollo2, messageResult);
  }
  
  public void putDocumentoAllaFirma(java.lang.String token, it.italprot.prowsprotocollo.DatiDocumento datiDocumento, it.italprot.prowsprotocollo.holders.RetDocumentoHolder datiDocumento2, it.italprot.prowsprotocollo.holders.MessageResultHolder messageResult) throws java.rmi.RemoteException{
    if (proWsProtocolloPortType == null)
      _initProWsProtocolloPortTypeProxy();
    proWsProtocolloPortType.putDocumentoAllaFirma(token, datiDocumento, datiDocumento2, messageResult);
  }
  
  public void notificaMailProtocollo(java.lang.String token, java.lang.String anno, java.lang.String numero, java.lang.String tipo, java.lang.String oggettoCustom, java.lang.String bodyCustom, it.italprot.prowsprotocollo.holders.StatoNotificaHolder statoNotifica, it.italprot.prowsprotocollo.holders.MessageResultHolder messageResult) throws java.rmi.RemoteException{
    if (proWsProtocolloPortType == null)
      _initProWsProtocolloPortTypeProxy();
    proWsProtocolloPortType.notificaMailProtocollo(token, anno, numero, tipo, oggettoCustom, bodyCustom, statoNotifica, messageResult);
  }
  
  public void insertDocumento(java.lang.String token, java.lang.String nomeFile, java.lang.String stream, it.italprot.prowsprotocollo.holders.AllegatoPrecaricatoHolder allegatoPrecaricato, it.italprot.prowsprotocollo.holders.MessageResultHolder messageResult) throws java.rmi.RemoteException{
    if (proWsProtocolloPortType == null)
      _initProWsProtocolloPortTypeProxy();
    proWsProtocolloPortType.insertDocumento(token, nomeFile, stream, allegatoPrecaricato, messageResult);
  }
  
  public void getNotificaMailProtocollo(java.lang.String token, java.lang.String anno, java.lang.String numero, java.lang.String tipo, java.lang.String rowidmail, it.italprot.prowsprotocollo.holders.NotificaMailHolder notificaMail, it.italprot.prowsprotocollo.holders.MessageResultHolder messageResult) throws java.rmi.RemoteException{
    if (proWsProtocolloPortType == null)
      _initProWsProtocolloPortTypeProxy();
    proWsProtocolloPortType.getNotificaMailProtocollo(token, anno, numero, tipo, rowidmail, notificaMail, messageResult);
  }
  
  
}