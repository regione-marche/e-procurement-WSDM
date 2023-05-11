package it.italprot.prowsfascicolo;

public class ProWsFascicoloPortTypeProxy implements it.italprot.prowsfascicolo.ProWsFascicoloPortType {
  private String _endpoint = null;
  private it.italprot.prowsfascicolo.ProWsFascicoloPortType proWsFascicoloPortType = null;
  
  public ProWsFascicoloPortTypeProxy() {
    _initProWsFascicoloPortTypeProxy();
  }
  
  public ProWsFascicoloPortTypeProxy(String endpoint) {
    _endpoint = endpoint;
    _initProWsFascicoloPortTypeProxy();
  }
  
  private void _initProWsFascicoloPortTypeProxy() {
    try {
      proWsFascicoloPortType = (new it.italprot.prowsfascicolo.ProWsFascicoloLocator()).getproWsFascicoloPort();
      if (proWsFascicoloPortType != null) {
        if (_endpoint != null)
          ((javax.xml.rpc.Stub)proWsFascicoloPortType)._setProperty("javax.xml.rpc.service.endpoint.address", _endpoint);
        else
          _endpoint = (String)((javax.xml.rpc.Stub)proWsFascicoloPortType)._getProperty("javax.xml.rpc.service.endpoint.address");
      }
      
    }
    catch (javax.xml.rpc.ServiceException serviceException) {}
  }
  
  public String getEndpoint() {
    return _endpoint;
  }
  
  public void setEndpoint(String endpoint) {
    _endpoint = endpoint;
    if (proWsFascicoloPortType != null)
      ((javax.xml.rpc.Stub)proWsFascicoloPortType)._setProperty("javax.xml.rpc.service.endpoint.address", _endpoint);
    
  }
  
  public it.italprot.prowsfascicolo.ProWsFascicoloPortType getProWsFascicoloPortType() {
    if (proWsFascicoloPortType == null)
      _initProWsFascicoloPortTypeProxy();
    return proWsFascicoloPortType;
  }
  
  public java.lang.String getItaEngineContextToken(java.lang.String userName, java.lang.String userPassword, java.lang.String domainCode) throws java.rmi.RemoteException{
    if (proWsFascicoloPortType == null)
      _initProWsFascicoloPortTypeProxy();
    return proWsFascicoloPortType.getItaEngineContextToken(userName, userPassword, domainCode);
  }
  
  public void getItaEngineContextTokenInfo(java.lang.String token, java.lang.String domainCode, javax.xml.rpc.holders.StringHolder userName, javax.xml.rpc.holders.StringHolder userCode) throws java.rmi.RemoteException{
    if (proWsFascicoloPortType == null)
      _initProWsFascicoloPortTypeProxy();
    proWsFascicoloPortType.getItaEngineContextTokenInfo(token, domainCode, userName, userCode);
  }
  
  public java.lang.String checkItaEngineContextToken(java.lang.String token, java.lang.String domainCode) throws java.rmi.RemoteException{
    if (proWsFascicoloPortType == null)
      _initProWsFascicoloPortTypeProxy();
    return proWsFascicoloPortType.checkItaEngineContextToken(token, domainCode);
  }
  
  public java.lang.String destroyItaEngineContextToken(java.lang.String token, java.lang.String domainCode) throws java.rmi.RemoteException{
    if (proWsFascicoloPortType == null)
      _initProWsFascicoloPortTypeProxy();
    return proWsFascicoloPortType.destroyItaEngineContextToken(token, domainCode);
  }
  
  public void creaFascicolo(java.lang.String token, it.italprot.prowsfascicolo.DatiFascicolo datiFascicolo, it.italprot.prowsfascicolo.holders.DettaglioFascicoloHolder datiFascicolo2, it.italprot.prowsfascicolo.holders.MessageResultHolder messageResult) throws java.rmi.RemoteException{
    if (proWsFascicoloPortType == null)
      _initProWsFascicoloPortTypeProxy();
    proWsFascicoloPortType.creaFascicolo(token, datiFascicolo, datiFascicolo2, messageResult);
  }
  
  public void fascicolaProtocollo(java.lang.String token, java.lang.String annoProtocollo, java.lang.String numeroProtocollo, java.lang.String tipoProtocollo, java.lang.String codiceFascicolo, java.lang.String codiceSottoFascicolo, it.italprot.prowsfascicolo.holders.RetFascicoloHolder retDatiFascicolo, it.italprot.prowsfascicolo.holders.MessageResultHolder messageResult) throws java.rmi.RemoteException{
    if (proWsFascicoloPortType == null)
      _initProWsFascicoloPortTypeProxy();
    proWsFascicoloPortType.fascicolaProtocollo(token, annoProtocollo, numeroProtocollo, tipoProtocollo, codiceFascicolo, codiceSottoFascicolo, retDatiFascicolo, messageResult);
  }
  
  public void getFascicoliProtocollo(java.lang.String token, java.lang.String annoProtocollo, java.lang.String numeroProtocollo, java.lang.String tipoProtocollo, it.italprot.prowsfascicolo.holders.ListaFascicoliHolder elencoFascicoli, it.italprot.prowsfascicolo.holders.MessageResultHolder messageResult) throws java.rmi.RemoteException{
    if (proWsFascicoloPortType == null)
      _initProWsFascicoloPortTypeProxy();
    proWsFascicoloPortType.getFascicoliProtocollo(token, annoProtocollo, numeroProtocollo, tipoProtocollo, elencoFascicoli, messageResult);
  }
  
  public void getElencoFascicoli(java.lang.String token, it.italprot.prowsfascicolo.ParametroRicerca[] arrayParamRicerca, it.italprot.prowsfascicolo.holders.ElencoFascicoliHolder elencoFascicoli, it.italprot.prowsfascicolo.holders.MessageResultHolder messageResult) throws java.rmi.RemoteException{
    if (proWsFascicoloPortType == null)
      _initProWsFascicoloPortTypeProxy();
    proWsFascicoloPortType.getElencoFascicoli(token, arrayParamRicerca, elencoFascicoli, messageResult);
  }
  
  
}