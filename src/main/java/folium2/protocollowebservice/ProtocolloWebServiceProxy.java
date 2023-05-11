package folium2.protocollowebservice;

public class ProtocolloWebServiceProxy implements folium2.protocollowebservice.ProtocolloWebService {
  private String _endpoint = null;
  private folium2.protocollowebservice.ProtocolloWebService protocolloWebService = null;
  
  public ProtocolloWebServiceProxy() {
    _initProtocolloWebServiceProxy();
  }
  
  public ProtocolloWebServiceProxy(String endpoint) {
    _endpoint = endpoint;
    _initProtocolloWebServiceProxy();
  }
  
  private void _initProtocolloWebServiceProxy() {
    try {
      protocolloWebService = (new folium2.protocollowebservice.ProtocolloWebServiceServiceLocator()).getProtocolloWebService();
      if (protocolloWebService != null) {
        if (_endpoint != null)
          ((javax.xml.rpc.Stub)protocolloWebService)._setProperty("javax.xml.rpc.service.endpoint.address", _endpoint);
        else
          _endpoint = (String)((javax.xml.rpc.Stub)protocolloWebService)._getProperty("javax.xml.rpc.service.endpoint.address");
      }
      
    }
    catch (javax.xml.rpc.ServiceException serviceException) {}
  }
  
  public String getEndpoint() {
    return _endpoint;
  }
  
  public void setEndpoint(String endpoint) {
    _endpoint = endpoint;
    if (protocolloWebService != null)
      ((javax.xml.rpc.Stub)protocolloWebService)._setProperty("javax.xml.rpc.service.endpoint.address", _endpoint);
    
  }
  
  public folium2.protocollowebservice.ProtocolloWebService getProtocolloWebService() {
    if (protocolloWebService == null)
      _initProtocolloWebServiceProxy();
    return protocolloWebService;
  }
  
  public byte[] getContenutoDocumento(agora.folium2.ws.WSAuthentication in0, long in1) throws java.rmi.RemoteException{
    if (protocolloWebService == null)
      _initProtocolloWebServiceProxy();
    return protocolloWebService.getContenutoDocumento(in0, in1);
  }
  
  public byte[] getContenutoAllegato(agora.folium2.ws.WSAuthentication in0, long in1) throws java.rmi.RemoteException{
    if (protocolloWebService == null)
      _initProtocolloWebServiceProxy();
    return protocolloWebService.getContenutoAllegato(in0, in1);
  }
  
  public folium2.protocollowebservice.ImmagineDocumentale recuperaContenuto(agora.folium2.ws.WSAuthentication in0, long in1) throws java.rmi.RemoteException{
    if (protocolloWebService == null)
      _initProtocolloWebServiceProxy();
    return protocolloWebService.recuperaContenuto(in0, in1);
  }
  
  public folium2.protocollowebservice.Allegato[] getAllegati(agora.folium2.ws.WSAuthentication in0, long in1) throws java.rmi.RemoteException{
    if (protocolloWebService == null)
      _initProtocolloWebServiceProxy();
    return protocolloWebService.getAllegati(in0, in1);
  }
  
  public agora.folium2.ws.WSEsito testLogin(agora.folium2.ws.WSAuthentication in0) throws java.rmi.RemoteException{
    if (protocolloWebService == null)
      _initProtocolloWebServiceProxy();
    return protocolloWebService.testLogin(in0);
  }
  
  public agora.folium2.ws.WSEsito testStato(agora.folium2.ws.WSAuthentication in0) throws java.rmi.RemoteException{
    if (protocolloWebService == null)
      _initProtocolloWebServiceProxy();
    return protocolloWebService.testStato(in0);
  }
  
  public folium2.protocollowebservice.Allegato getAllegato(agora.folium2.ws.WSAuthentication in0, long in1) throws java.rmi.RemoteException{
    if (protocolloWebService == null)
      _initProtocolloWebServiceProxy();
    return protocolloWebService.getAllegato(in0, in1);
  }
  
  public folium2.protocollowebservice.Allegato rimuoviAllegato(agora.folium2.ws.WSAuthentication in0, long in1) throws java.rmi.RemoteException{
    if (protocolloWebService == null)
      _initProtocolloWebServiceProxy();
    return protocolloWebService.rimuoviAllegato(in0, in1);
  }
  
  public folium2.protocollowebservice.MezzoSpedizione[] getMezziSpedizione(agora.folium2.ws.WSAuthentication authentication) throws java.rmi.RemoteException{
    if (protocolloWebService == null)
      _initProtocolloWebServiceProxy();
    return protocolloWebService.getMezziSpedizione(authentication);
  }
  
  public folium2.protocollowebservice.VoceTitolario[] ricercaTitolarioPerCodiceDescrizione(agora.folium2.ws.WSAuthentication in0, folium2.protocollowebservice.VoceTitolario in1) throws java.rmi.RemoteException{
    if (protocolloWebService == null)
      _initProtocolloWebServiceProxy();
    return protocolloWebService.ricercaTitolarioPerCodiceDescrizione(in0, in1);
  }
  
  public folium2.protocollowebservice.DocumentoProtocollato[] ricercaProtocolli(agora.folium2.ws.WSAuthentication in0, folium2.protocollowebservice.Ricerca in1) throws java.rmi.RemoteException{
    if (protocolloWebService == null)
      _initProtocolloWebServiceProxy();
    return protocolloWebService.ricercaProtocolli(in0, in1);
  }
  
  public folium2.protocollowebservice.DocumentoProtocollato protocolla(agora.folium2.ws.WSAuthentication in0, folium2.protocollowebservice.DocumentoProtocollato in1) throws java.rmi.RemoteException{
    if (protocolloWebService == null)
      _initProtocolloWebServiceProxy();
    return protocolloWebService.protocolla(in0, in1);
  }
  
  public folium2.protocollowebservice.ImmagineDocumentale inserisciContenuto(agora.folium2.ws.WSAuthentication in0, folium2.protocollowebservice.ImmagineDocumentale in1, boolean in2) throws java.rmi.RemoteException{
    if (protocolloWebService == null)
      _initProtocolloWebServiceProxy();
    return protocolloWebService.inserisciContenuto(in0, in1, in2);
  }
  
  public folium2.protocollowebservice.Assegnazione assegna(agora.folium2.ws.WSAuthentication in0, folium2.protocollowebservice.Assegnazione in1) throws java.rmi.RemoteException{
    if (protocolloWebService == null)
      _initProtocolloWebServiceProxy();
    return protocolloWebService.assegna(in0, in1);
  }
  
  public folium2.protocollowebservice.Allegato inserisciAllegato(agora.folium2.ws.WSAuthentication in0, folium2.protocollowebservice.Allegato in1) throws java.rmi.RemoteException{
    if (protocolloWebService == null)
      _initProtocolloWebServiceProxy();
    return protocolloWebService.inserisciAllegato(in0, in1);
  }
  
  public folium2.protocollowebservice.AssegnazioneDaRicerca[] elencoAssegnazioni(agora.folium2.ws.WSAuthentication authentication, folium2.protocollowebservice.RicercaAssegnazioni criteria) throws java.rmi.RemoteException{
    if (protocolloWebService == null)
      _initProtocolloWebServiceProxy();
    return protocolloWebService.elencoAssegnazioni(authentication, criteria);
  }
  
  public agora.folium2.ws.WSEsito prendiInCarico(agora.folium2.ws.WSAuthentication authentication, folium2.protocollowebservice.PresaInCarico presaInCarico) throws java.rmi.RemoteException{
    if (protocolloWebService == null)
      _initProtocolloWebServiceProxy();
    return protocolloWebService.prendiInCarico(authentication, presaInCarico);
  }
  
  public folium2.protocollowebservice.CorrispondenteDaRicerca[] ricercaCorrispondenti(agora.folium2.ws.WSAuthentication authentication, folium2.protocollowebservice.RicercaCorrispondenti criteria) throws java.rmi.RemoteException{
    if (protocolloWebService == null)
      _initProtocolloWebServiceProxy();
    return protocolloWebService.ricercaCorrispondenti(authentication, criteria);
  }
  
  
}