package localhost.LapisWebSOAP;

public class LapisWebSOAPTypeProxy implements localhost.LapisWebSOAP.LapisWebSOAPType {
  private String _endpoint = null;
  private localhost.LapisWebSOAP.LapisWebSOAPType lapisWebSOAPType = null;
  
  public LapisWebSOAPTypeProxy() {
    _initLapisWebSOAPTypeProxy();
  }
  
  public LapisWebSOAPTypeProxy(String endpoint) {
    _endpoint = endpoint;
    _initLapisWebSOAPTypeProxy();
  }
  
  private void _initLapisWebSOAPTypeProxy() {
    try {
      lapisWebSOAPType = (new localhost.LapisWebSOAP.LapisWebSOAPServiceLocator()).getLapisWebSOAPPort();
      if (lapisWebSOAPType != null) {
        if (_endpoint != null)
          ((javax.xml.rpc.Stub)lapisWebSOAPType)._setProperty("javax.xml.rpc.service.endpoint.address", _endpoint);
        else
          _endpoint = (String)((javax.xml.rpc.Stub)lapisWebSOAPType)._getProperty("javax.xml.rpc.service.endpoint.address");
      }
      
    }
    catch (javax.xml.rpc.ServiceException serviceException) {}
  }
  
  public String getEndpoint() {
    return _endpoint;
  }
  
  public void setEndpoint(String endpoint) {
    _endpoint = endpoint;
    if (lapisWebSOAPType != null)
      ((javax.xml.rpc.Stub)lapisWebSOAPType)._setProperty("javax.xml.rpc.service.endpoint.address", _endpoint);
    
  }
  
  public localhost.LapisWebSOAP.LapisWebSOAPType getLapisWebSOAPType() {
    if (lapisWebSOAPType == null)
      _initLapisWebSOAPTypeProxy();
    return lapisWebSOAPType;
  }
  
  public boolean lapisWebSOAP(java.lang.String xml) throws java.rmi.RemoteException{
    if (lapisWebSOAPType == null)
      _initLapisWebSOAPTypeProxy();
    return lapisWebSOAPType.lapisWebSOAP(xml);
  }
  
  public java.lang.String validatore(java.lang.String xml) throws java.rmi.RemoteException{
    if (lapisWebSOAPType == null)
      _initLapisWebSOAPTypeProxy();
    return lapisWebSOAPType.validatore(xml);
  }
  
  public java.lang.String protoBatch(java.lang.String xml) throws java.rmi.RemoteException{
    if (lapisWebSOAPType == null)
      _initLapisWebSOAPTypeProxy();
    return lapisWebSOAPType.protoBatch(xml);
  }
  
  public java.lang.String protoBatchLog(long codice) throws java.rmi.RemoteException{
    if (lapisWebSOAPType == null)
      _initLapisWebSOAPTypeProxy();
    return lapisWebSOAPType.protoBatchLog(codice);
  }
  
  public java.lang.String PBrotoBatch(java.lang.String xml) throws java.rmi.RemoteException{
    if (lapisWebSOAPType == null)
      _initLapisWebSOAPTypeProxy();
    return lapisWebSOAPType.PBrotoBatch(xml);
  }
  
  public java.lang.String PBrotoBatchLog(long codice) throws java.rmi.RemoteException{
    if (lapisWebSOAPType == null)
      _initLapisWebSOAPTypeProxy();
    return lapisWebSOAPType.PBrotoBatchLog(codice);
  }
  
  public java.lang.String protocollaArrivo(java.lang.String xml) throws java.rmi.RemoteException{
    if (lapisWebSOAPType == null)
      _initLapisWebSOAPTypeProxy();
    return lapisWebSOAPType.protocollaArrivo(xml);
  }
  
  public boolean modificaStruttura(java.lang.String xml) throws java.rmi.RemoteException{
    if (lapisWebSOAPType == null)
      _initLapisWebSOAPTypeProxy();
    return lapisWebSOAPType.modificaStruttura(xml);
  }
  
  public boolean aggiungiRicevuta(java.lang.String xml) throws java.rmi.RemoteException{
    if (lapisWebSOAPType == null)
      _initLapisWebSOAPTypeProxy();
    return lapisWebSOAPType.aggiungiRicevuta(xml);
  }
  
  public java.lang.String getProfile(java.lang.String account) throws java.rmi.RemoteException{
    if (lapisWebSOAPType == null)
      _initLapisWebSOAPTypeProxy();
    return lapisWebSOAPType.getProfile(account);
  }
  
  public java.lang.String getPermission(java.lang.String struttura) throws java.rmi.RemoteException{
    if (lapisWebSOAPType == null)
      _initLapisWebSOAPTypeProxy();
    return lapisWebSOAPType.getPermission(struttura);
  }
  
  public java.lang.String getOwner(java.lang.String struttura) throws java.rmi.RemoteException{
    if (lapisWebSOAPType == null)
      _initLapisWebSOAPTypeProxy();
    return lapisWebSOAPType.getOwner(struttura);
  }
  
  public java.lang.String getIDC(java.lang.String struttura) throws java.rmi.RemoteException{
    if (lapisWebSOAPType == null)
      _initLapisWebSOAPTypeProxy();
    return lapisWebSOAPType.getIDC(struttura);
  }
  
  public java.lang.String getFather(java.lang.String struttura) throws java.rmi.RemoteException{
    if (lapisWebSOAPType == null)
      _initLapisWebSOAPTypeProxy();
    return lapisWebSOAPType.getFather(struttura);
  }
  
  public java.lang.String getMovimentazione(java.lang.String struttura) throws java.rmi.RemoteException{
    if (lapisWebSOAPType == null)
      _initLapisWebSOAPTypeProxy();
    return lapisWebSOAPType.getMovimentazione(struttura);
  }
  
  public java.lang.String getMovimentazioneStorico(java.lang.String struttura) throws java.rmi.RemoteException{
    if (lapisWebSOAPType == null)
      _initLapisWebSOAPTypeProxy();
    return lapisWebSOAPType.getMovimentazioneStorico(struttura);
  }
  
  public java.lang.String getVisibilitaVaschette(java.lang.String struttura) throws java.rmi.RemoteException{
    if (lapisWebSOAPType == null)
      _initLapisWebSOAPTypeProxy();
    return lapisWebSOAPType.getVisibilitaVaschette(struttura);
  }
  
  public java.lang.String getFatture(java.lang.String struttura, java.lang.String data_inizio, java.lang.String data_fine) throws java.rmi.RemoteException{
    if (lapisWebSOAPType == null)
      _initLapisWebSOAPTypeProxy();
    return lapisWebSOAPType.getFatture(struttura, data_inizio, data_fine);
  }
  
  public java.lang.String getDettaglioFattura(java.lang.String struttura, java.lang.String numero_proto, java.lang.String data_proto) throws java.rmi.RemoteException{
    if (lapisWebSOAPType == null)
      _initLapisWebSOAPTypeProxy();
    return lapisWebSOAPType.getDettaglioFattura(struttura, numero_proto, data_proto);
  }
  
  public java.lang.String getStatoSpedizione(java.lang.String struttura, java.lang.String numero_proto, java.lang.String data_proto, java.lang.String cod_applicativo) throws java.rmi.RemoteException{
    if (lapisWebSOAPType == null)
      _initLapisWebSOAPTypeProxy();
    return lapisWebSOAPType.getStatoSpedizione(struttura, numero_proto, data_proto, cod_applicativo);
  }
  
  public boolean insertFolder(java.lang.String struttura, java.lang.String numero_proto, java.lang.String data_proto, java.lang.String mas_cod, java.lang.String ie_fascicolo, java.lang.String operatore) throws java.rmi.RemoteException{
    if (lapisWebSOAPType == null)
      _initLapisWebSOAPTypeProxy();
    return lapisWebSOAPType.insertFolder(struttura, numero_proto, data_proto, mas_cod, ie_fascicolo, operatore);
  }
  
  public boolean deleteFolder(java.lang.String struttura, java.lang.String numero_proto, java.lang.String data_proto, java.lang.String mas_cod, java.lang.String ie_fascicolo, java.lang.String operatore) throws java.rmi.RemoteException{
    if (lapisWebSOAPType == null)
      _initLapisWebSOAPTypeProxy();
    return lapisWebSOAPType.deleteFolder(struttura, numero_proto, data_proto, mas_cod, ie_fascicolo, operatore);
  }
  
  public java.lang.String getPEC(java.lang.String fileId) throws java.rmi.RemoteException{
    if (lapisWebSOAPType == null)
      _initLapisWebSOAPTypeProxy();
    return lapisWebSOAPType.getPEC(fileId);
  }
  
  public java.lang.String protoBatchLogDetail(long codice, java.lang.String numero_proto, java.util.Date data_proto) throws java.rmi.RemoteException{
    if (lapisWebSOAPType == null)
      _initLapisWebSOAPTypeProxy();
    return lapisWebSOAPType.protoBatchLogDetail(codice, numero_proto, data_proto);
  }
  
  public java.lang.String updateAttachment(java.lang.String xml) throws java.rmi.RemoteException{
    if (lapisWebSOAPType == null)
      _initLapisWebSOAPTypeProxy();
    return lapisWebSOAPType.updateAttachment(xml);
  }
  
  public java.lang.String getDettaglioProto(java.lang.String cod_applicativo, java.lang.String struttura, java.lang.String numero_proto, java.lang.String data_proto) throws java.rmi.RemoteException{
    if (lapisWebSOAPType == null)
      _initLapisWebSOAPTypeProxy();
    return lapisWebSOAPType.getDettaglioProto(cod_applicativo, struttura, numero_proto, data_proto);
  }
  
  public java.lang.String getParent(java.lang.String struttura) throws java.rmi.RemoteException{
    if (lapisWebSOAPType == null)
      _initLapisWebSOAPTypeProxy();
    return lapisWebSOAPType.getParent(struttura);
  }
  
  
}