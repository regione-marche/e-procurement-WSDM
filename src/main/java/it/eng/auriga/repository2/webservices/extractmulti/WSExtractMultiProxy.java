package it.eng.auriga.repository2.webservices.extractmulti;

public class WSExtractMultiProxy implements it.eng.auriga.repository2.webservices.extractmulti.WSExtractMulti {
  private String _endpoint = null;
  private it.eng.auriga.repository2.webservices.extractmulti.WSExtractMulti wSExtractMulti = null;
  
  public WSExtractMultiProxy() {
    _initWSExtractMultiProxy();
  }
  
  public WSExtractMultiProxy(String endpoint) {
    _endpoint = endpoint;
    _initWSExtractMultiProxy();
  }
  
  private void _initWSExtractMultiProxy() {
    try {
      wSExtractMulti = (new it.eng.auriga.repository2.webservices.extractmulti.WSExtractMultiServiceLocator()).getWSExtractMulti();
      if (wSExtractMulti != null) {
        if (_endpoint != null)
          ((javax.xml.rpc.Stub)wSExtractMulti)._setProperty("javax.xml.rpc.service.endpoint.address", _endpoint);
        else
          _endpoint = (String)((javax.xml.rpc.Stub)wSExtractMulti)._getProperty("javax.xml.rpc.service.endpoint.address");
      }
      
    }
    catch (javax.xml.rpc.ServiceException serviceException) {}
  }
  
  public String getEndpoint() {
    return _endpoint;
  }
  
  public void setEndpoint(String endpoint) {
    _endpoint = endpoint;
    if (wSExtractMulti != null)
      ((javax.xml.rpc.Stub)wSExtractMulti)._setProperty("javax.xml.rpc.service.endpoint.address", _endpoint);
    
  }
  
  public it.eng.auriga.repository2.webservices.extractmulti.WSExtractMulti getWSExtractMulti() {
    if (wSExtractMulti == null)
      _initWSExtractMultiProxy();
    return wSExtractMulti;
  }
  
  public java.lang.String service(java.lang.String codApplicazione, java.lang.String istanzaApplicazione, java.lang.String userName, java.lang.String password, java.lang.String xml, java.lang.String hash) throws java.rmi.RemoteException{
    if (wSExtractMulti == null)
      _initWSExtractMultiProxy();
    return wSExtractMulti.service(codApplicazione, istanzaApplicazione, userName, password, xml, hash);
  }
  
  
}