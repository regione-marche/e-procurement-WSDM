package it.fascicoliwebservice;

public class FascicoliWebServiceProxy implements it.fascicoliwebservice.FascicoliWebService {
  private String _endpoint = null;
  private it.fascicoliwebservice.FascicoliWebService fascicoliWebService = null;
  
  public FascicoliWebServiceProxy() {
    _initFascicoliWebServiceProxy();
  }
  
  public FascicoliWebServiceProxy(String endpoint) {
    _endpoint = endpoint;
    _initFascicoliWebServiceProxy();
  }
  
  private void _initFascicoliWebServiceProxy() {
    try {
      fascicoliWebService = (new it.fascicoliwebservice.FascicoliWebServiceServiceLocator()).getFascicoliWebService();
      if (fascicoliWebService != null) {
        if (_endpoint != null)
          ((javax.xml.rpc.Stub)fascicoliWebService)._setProperty("javax.xml.rpc.service.endpoint.address", _endpoint);
        else
          _endpoint = (String)((javax.xml.rpc.Stub)fascicoliWebService)._getProperty("javax.xml.rpc.service.endpoint.address");
      }
      
    }
    catch (javax.xml.rpc.ServiceException serviceException) {}
  }
  
  public String getEndpoint() {
    return _endpoint;
  }
  
  public void setEndpoint(String endpoint) {
    _endpoint = endpoint;
    if (fascicoliWebService != null)
      ((javax.xml.rpc.Stub)fascicoliWebService)._setProperty("javax.xml.rpc.service.endpoint.address", _endpoint);
    
  }
  
  public it.fascicoliwebservice.FascicoliWebService getFascicoliWebService() {
    if (fascicoliWebService == null)
      _initFascicoliWebServiceProxy();
    return fascicoliWebService;
  }
  
  public agora.folium.ws.type.FascicoloEsteso recuperaFascicoloEsteso(agora.folium.ws.WSAuthentication in0, java.lang.Long in1) throws java.rmi.RemoteException{
    if (fascicoliWebService == null)
      _initFascicoliWebServiceProxy();
    return fascicoliWebService.recuperaFascicoloEsteso(in0, in1);
  }
  
  public agora.folium.ws.type.FascicoloEsteso creaFascicoloEsteso(agora.folium.ws.WSAuthentication in0, agora.folium.ws.type.FascicoloEsteso in1) throws java.rmi.RemoteException{
    if (fascicoliWebService == null)
      _initFascicoliWebServiceProxy();
    return fascicoliWebService.creaFascicoloEsteso(in0, in1);
  }
  
  public agora.folium.ws.type.FascicoloEsteso[] ricercaFascicoliEstesi(agora.folium.ws.WSAuthentication in0, agora.folium.ws.type.RicercaFascicoli in1, java.lang.String in2) throws java.rmi.RemoteException{
    if (fascicoliWebService == null)
      _initFascicoliWebServiceProxy();
    return fascicoliWebService.ricercaFascicoliEstesi(in0, in1, in2);
  }
  
  public agora.folium.ws.type.Fascicolo recuperaFascicolo(agora.folium.ws.WSAuthentication in0, java.lang.Long in1) throws java.rmi.RemoteException{
    if (fascicoliWebService == null)
      _initFascicoliWebServiceProxy();
    return fascicoliWebService.recuperaFascicolo(in0, in1);
  }
  
  public agora.folium.ws.type.DocumentoProtocollato recuperaDocumento(agora.folium.ws.WSAuthentication in0, java.lang.Long in1) throws java.rmi.RemoteException{
    if (fascicoliWebService == null)
      _initFascicoliWebServiceProxy();
    return fascicoliWebService.recuperaDocumento(in0, in1);
  }
  
  public agora.folium.ws.type.Fascicolo modificaFascicolo(agora.folium.ws.WSAuthentication in0, agora.folium.ws.type.Fascicolo in1) throws java.rmi.RemoteException{
    if (fascicoliWebService == null)
      _initFascicoliWebServiceProxy();
    return fascicoliWebService.modificaFascicolo(in0, in1);
  }
  
  public agora.folium.ws.WSEsito cancellaFascicolo(agora.folium.ws.WSAuthentication in0, java.lang.Long in1) throws java.rmi.RemoteException{
    if (fascicoliWebService == null)
      _initFascicoliWebServiceProxy();
    return fascicoliWebService.cancellaFascicolo(in0, in1);
  }
  
  public agora.folium.ws.type.Allegato recuperaFileZipDocumenti(agora.folium.ws.WSAuthentication in0, java.lang.Long in1) throws java.rmi.RemoteException{
    if (fascicoliWebService == null)
      _initFascicoliWebServiceProxy();
    return fascicoliWebService.recuperaFileZipDocumenti(in0, in1);
  }
  
  public agora.folium.ws.type.Allegato recuperaFileZipDocumentiAttachment(agora.folium.ws.WSAuthentication in0, java.lang.Long in1) throws java.rmi.RemoteException{
    if (fascicoliWebService == null)
      _initFascicoliWebServiceProxy();
    return fascicoliWebService.recuperaFileZipDocumentiAttachment(in0, in1);
  }
  
  public agora.folium.ws.WSEsito inserisciDocumentoNelFascicoloAttachment(agora.folium.ws.WSAuthentication in0, agora.folium.ws.type.DocumentoProtocollato in1, java.lang.Long in2) throws java.rmi.RemoteException{
    if (fascicoliWebService == null)
      _initFascicoliWebServiceProxy();
    return fascicoliWebService.inserisciDocumentoNelFascicoloAttachment(in0, in1, in2);
  }
  
  public agora.folium.ws.type.Fascicolo[] ricercaFascicoli(agora.folium.ws.WSAuthentication in0, agora.folium.ws.type.RicercaFascicoli in1) throws java.rmi.RemoteException{
    if (fascicoliWebService == null)
      _initFascicoliWebServiceProxy();
    return fascicoliWebService.ricercaFascicoli(in0, in1);
  }
  
  public agora.folium.ws.type.Fascicolo creaFascicolo(agora.folium.ws.WSAuthentication in0, agora.folium.ws.type.Fascicolo in1) throws java.rmi.RemoteException{
    if (fascicoliWebService == null)
      _initFascicoliWebServiceProxy();
    return fascicoliWebService.creaFascicolo(in0, in1);
  }
  
  public agora.folium.ws.WSEsito copiaElementoNelFascicolo(agora.folium.ws.WSAuthentication in0, java.lang.Long in1, java.lang.Long in2, java.lang.Long in3) throws java.rmi.RemoteException{
    if (fascicoliWebService == null)
      _initFascicoliWebServiceProxy();
    return fascicoliWebService.copiaElementoNelFascicolo(in0, in1, in2, in3);
  }
  
  public agora.folium.ws.type.Allegato recuperaFileZipFoldersAttachment(agora.folium.ws.WSAuthentication in0, java.lang.Long[] in1) throws java.rmi.RemoteException{
    if (fascicoliWebService == null)
      _initFascicoliWebServiceProxy();
    return fascicoliWebService.recuperaFileZipFoldersAttachment(in0, in1);
  }
  
  public agora.folium.ws.WSEsito inserisciDocumentoNelFascicolo(agora.folium.ws.WSAuthentication in0, agora.folium.ws.type.DocumentoProtocollato in1, java.lang.Long in2) throws java.rmi.RemoteException{
    if (fascicoliWebService == null)
      _initFascicoliWebServiceProxy();
    return fascicoliWebService.inserisciDocumentoNelFascicolo(in0, in1, in2);
  }
  
  public agora.folium.ws.WSEsito spostaElementoDalFascicolo(agora.folium.ws.WSAuthentication in0, java.lang.Long in1, java.lang.Long in2, java.lang.Long in3) throws java.rmi.RemoteException{
    if (fascicoliWebService == null)
      _initFascicoliWebServiceProxy();
    return fascicoliWebService.spostaElementoDalFascicolo(in0, in1, in2, in3);
  }
  
  public agora.folium.ws.type.SottoFascicolo[] ricercaFascicoliESottoFascicoli(agora.folium.ws.WSAuthentication in0, agora.folium.ws.type.RicercaSottoFascicoli in1) throws java.rmi.RemoteException{
    if (fascicoliWebService == null)
      _initFascicoliWebServiceProxy();
    return fascicoliWebService.ricercaFascicoliESottoFascicoli(in0, in1);
  }
  
  public agora.folium.ws.WSEsito rimuoviElementoDalFascicolo(agora.folium.ws.WSAuthentication in0, agora.folium.ws.type.ElementoNelFascicolo in1) throws java.rmi.RemoteException{
    if (fascicoliWebService == null)
      _initFascicoliWebServiceProxy();
    return fascicoliWebService.rimuoviElementoDalFascicolo(in0, in1);
  }
  
  public agora.folium.ws.type.Allegato recuperaPdfElencoDocumenti(agora.folium.ws.WSAuthentication in0, java.lang.Long in1) throws java.rmi.RemoteException{
    if (fascicoliWebService == null)
      _initFascicoliWebServiceProxy();
    return fascicoliWebService.recuperaPdfElencoDocumenti(in0, in1);
  }
  
  public agora.folium.ws.type.FascicoloTree recuperaStrutturaFascicolo(agora.folium.ws.WSAuthentication in0, java.lang.Long in1) throws java.rmi.RemoteException{
    if (fascicoliWebService == null)
      _initFascicoliWebServiceProxy();
    return fascicoliWebService.recuperaStrutturaFascicolo(in0, in1);
  }
  
  public agora.folium.ws.type.Fascicolo[] recuperaFascicoliDocumento(agora.folium.ws.WSAuthentication in0, java.lang.Long in1) throws java.rmi.RemoteException{
    if (fascicoliWebService == null)
      _initFascicoliWebServiceProxy();
    return fascicoliWebService.recuperaFascicoliDocumento(in0, in1);
  }
  
  public agora.folium.ws.type.DocumentoProtocollato recuperaDocumentoAttachment(agora.folium.ws.WSAuthentication in0, java.lang.Long in1) throws java.rmi.RemoteException{
    if (fascicoliWebService == null)
      _initFascicoliWebServiceProxy();
    return fascicoliWebService.recuperaDocumentoAttachment(in0, in1);
  }
  
  public agora.folium.ws.type.ElementoNelFascicolo[] elencoElementiNelFascicolo(agora.folium.ws.WSAuthentication in0, java.lang.Long in1) throws java.rmi.RemoteException{
    if (fascicoliWebService == null)
      _initFascicoliWebServiceProxy();
    return fascicoliWebService.elencoElementiNelFascicolo(in0, in1);
  }
  
  public agora.folium.ws.type.Allegato zipElencoDocumentiAttachment(agora.folium.ws.WSAuthentication in0, java.lang.Long[] in1) throws java.rmi.RemoteException{
    if (fascicoliWebService == null)
      _initFascicoliWebServiceProxy();
    return fascicoliWebService.zipElencoDocumentiAttachment(in0, in1);
  }
  
  public agora.folium.ws.WSEsito inserisciProtocolloNelFascicolo(agora.folium.ws.WSAuthentication in0, java.lang.Long in1, java.lang.Long in2) throws java.rmi.RemoteException{
    if (fascicoliWebService == null)
      _initFascicoliWebServiceProxy();
    return fascicoliWebService.inserisciProtocolloNelFascicolo(in0, in1, in2);
  }
  
  
}