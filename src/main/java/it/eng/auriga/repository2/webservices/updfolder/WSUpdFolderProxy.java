package it.eng.auriga.repository2.webservices.updfolder;

public class WSUpdFolderProxy implements it.eng.auriga.repository2.webservices.updfolder.WSUpdFolder {
  private String _endpoint = null;
  private it.eng.auriga.repository2.webservices.updfolder.WSUpdFolder wSUpdFolder = null;
  
  public WSUpdFolderProxy() {
    _initWSUpdFolderProxy();
  }
  
  public WSUpdFolderProxy(String endpoint) {
    _endpoint = endpoint;
    _initWSUpdFolderProxy();
  }
  
  private void _initWSUpdFolderProxy() {
    try {
      wSUpdFolder = (new it.eng.auriga.repository2.webservices.updfolder.WSUpdFolderServiceLocator()).getWSUpdFolder();
      if (wSUpdFolder != null) {
        if (_endpoint != null)
          ((javax.xml.rpc.Stub)wSUpdFolder)._setProperty("javax.xml.rpc.service.endpoint.address", _endpoint);
        else
          _endpoint = (String)((javax.xml.rpc.Stub)wSUpdFolder)._getProperty("javax.xml.rpc.service.endpoint.address");
      }
      
    }
    catch (javax.xml.rpc.ServiceException serviceException) {}
  }
  
  public String getEndpoint() {
    return _endpoint;
  }
  
  public void setEndpoint(String endpoint) {
    _endpoint = endpoint;
    if (wSUpdFolder != null)
      ((javax.xml.rpc.Stub)wSUpdFolder)._setProperty("javax.xml.rpc.service.endpoint.address", _endpoint);
    
  }
  
  public it.eng.auriga.repository2.webservices.updfolder.WSUpdFolder getWSUpdFolder() {
    if (wSUpdFolder == null)
      _initWSUpdFolderProxy();
    return wSUpdFolder;
  }
  
  public java.lang.String service(java.lang.String codApplicazione, java.lang.String istanzaApplicazione, java.lang.String userName, java.lang.String password, java.lang.String xml, java.lang.String hash) throws java.rmi.RemoteException{
    if (wSUpdFolder == null)
      _initWSUpdFolderProxy();
    return wSUpdFolder.service(codApplicazione, istanzaApplicazione, userName, password, xml, hash);
  }
  
  
}