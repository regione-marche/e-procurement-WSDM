package it.eng.auriga.repository2.webservices.getmetadataud;

public class WSGetMetadataUdProxy implements it.eng.auriga.repository2.webservices.getmetadataud.WSGetMetadataUd {
  private String _endpoint = null;
  private it.eng.auriga.repository2.webservices.getmetadataud.WSGetMetadataUd wSGetMetadataUd = null;
  
  public WSGetMetadataUdProxy() {
    _initWSGetMetadataUdProxy();
  }
  
  public WSGetMetadataUdProxy(String endpoint) {
    _endpoint = endpoint;
    _initWSGetMetadataUdProxy();
  }
  
  private void _initWSGetMetadataUdProxy() {
    try {
      wSGetMetadataUd = (new it.eng.auriga.repository2.webservices.getmetadataud.WSGetMetadataUdServiceLocator()).getWSGetMetadataUd();
      if (wSGetMetadataUd != null) {
        if (_endpoint != null)
          ((javax.xml.rpc.Stub)wSGetMetadataUd)._setProperty("javax.xml.rpc.service.endpoint.address", _endpoint);
        else
          _endpoint = (String)((javax.xml.rpc.Stub)wSGetMetadataUd)._getProperty("javax.xml.rpc.service.endpoint.address");
      }
      
    }
    catch (javax.xml.rpc.ServiceException serviceException) {}
  }
  
  public String getEndpoint() {
    return _endpoint;
  }
  
  public void setEndpoint(String endpoint) {
    _endpoint = endpoint;
    if (wSGetMetadataUd != null)
      ((javax.xml.rpc.Stub)wSGetMetadataUd)._setProperty("javax.xml.rpc.service.endpoint.address", _endpoint);
    
  }
  
  public it.eng.auriga.repository2.webservices.getmetadataud.WSGetMetadataUd getWSGetMetadataUd() {
    if (wSGetMetadataUd == null)
      _initWSGetMetadataUdProxy();
    return wSGetMetadataUd;
  }
  
  public java.lang.String service(java.lang.String codApplicazione, java.lang.String istanzaApplicazione, java.lang.String userName, java.lang.String password, java.lang.String xml, java.lang.String hash) throws java.rmi.RemoteException{
    if (wSGetMetadataUd == null)
      _initWSGetMetadataUdProxy();
    return wSGetMetadataUd.service(codApplicazione, istanzaApplicazione, userName, password, xml, hash);
  }
  
  
}