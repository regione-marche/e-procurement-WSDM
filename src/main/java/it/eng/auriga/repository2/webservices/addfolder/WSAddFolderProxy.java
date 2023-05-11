package it.eng.auriga.repository2.webservices.addfolder;

public class WSAddFolderProxy implements it.eng.auriga.repository2.webservices.addfolder.WSAddFolder {
  private String _endpoint = null;
  private it.eng.auriga.repository2.webservices.addfolder.WSAddFolder wSAddFolder = null;
  
  public WSAddFolderProxy() {
    _initWSAddFolderProxy();
  }
  
  public WSAddFolderProxy(String endpoint) {
    _endpoint = endpoint;
    _initWSAddFolderProxy();
  }
  
  private void _initWSAddFolderProxy() {
    try {
      wSAddFolder = (new it.eng.auriga.repository2.webservices.addfolder.WSAddFolderServiceLocator()).getWSAddFolder();
      if (wSAddFolder != null) {
        if (_endpoint != null)
          ((javax.xml.rpc.Stub)wSAddFolder)._setProperty("javax.xml.rpc.service.endpoint.address", _endpoint);
        else
          _endpoint = (String)((javax.xml.rpc.Stub)wSAddFolder)._getProperty("javax.xml.rpc.service.endpoint.address");
      }
      
    }
    catch (javax.xml.rpc.ServiceException serviceException) {}
  }
  
  public String getEndpoint() {
    return _endpoint;
  }
  
  public void setEndpoint(String endpoint) {
    _endpoint = endpoint;
    if (wSAddFolder != null)
      ((javax.xml.rpc.Stub)wSAddFolder)._setProperty("javax.xml.rpc.service.endpoint.address", _endpoint);
    
  }
  
  public it.eng.auriga.repository2.webservices.addfolder.WSAddFolder getWSAddFolder() {
    if (wSAddFolder == null)
      _initWSAddFolderProxy();
    return wSAddFolder;
  }
  
  public java.lang.String service(java.lang.String codApplicazione, java.lang.String istanzaApplicazione, java.lang.String userName, java.lang.String password, java.lang.String xml, java.lang.String hash) throws java.rmi.RemoteException{
    if (wSAddFolder == null)
      _initWSAddFolderProxy();
    return wSAddFolder.service(codApplicazione, istanzaApplicazione, userName, password, xml, hash);
  }
  
  
}