package it.eng.auriga.repository2.webservices.addunitadoc;

public class WSAddUdProxy implements it.eng.auriga.repository2.webservices.addunitadoc.WSAddUd {
  private String _endpoint = null;
  private it.eng.auriga.repository2.webservices.addunitadoc.WSAddUd wSAddUd = null;
  
  public WSAddUdProxy() {
    _initWSAddUdProxy();
  }
  
  public WSAddUdProxy(String endpoint) {
    _endpoint = endpoint;
    _initWSAddUdProxy();
  }
  
  private void _initWSAddUdProxy() {
    try {
      wSAddUd = (new it.eng.auriga.repository2.webservices.addunitadoc.WSAddUdServiceLocator()).getWSAddUd();
      if (wSAddUd != null) {
        if (_endpoint != null)
          ((javax.xml.rpc.Stub)wSAddUd)._setProperty("javax.xml.rpc.service.endpoint.address", _endpoint);
        else
          _endpoint = (String)((javax.xml.rpc.Stub)wSAddUd)._getProperty("javax.xml.rpc.service.endpoint.address");
      }
      
    }
    catch (javax.xml.rpc.ServiceException serviceException) {}
  }
  
  public String getEndpoint() {
    return _endpoint;
  }
  
  public void setEndpoint(String endpoint) {
    _endpoint = endpoint;
    if (wSAddUd != null)
      ((javax.xml.rpc.Stub)wSAddUd)._setProperty("javax.xml.rpc.service.endpoint.address", _endpoint);
    
  }
  
  public it.eng.auriga.repository2.webservices.addunitadoc.WSAddUd getWSAddUd() {
    if (wSAddUd == null)
      _initWSAddUdProxy();
    return wSAddUd;
  }
  
  public java.lang.String service(java.lang.String codApplicazione, java.lang.String istanzaApplicazione, java.lang.String userName, java.lang.String password, java.lang.String xml, java.lang.String hash) throws java.rmi.RemoteException{
    if (wSAddUd == null)
      _initWSAddUdProxy();
    return wSAddUd.service(codApplicazione, istanzaApplicazione, userName, password, xml, hash);
  }
  
  
}