package it.eng.auriga.repository2.webservices.getmetadatafolder;

public class WSGetMetadataFolderProxy implements it.eng.auriga.repository2.webservices.getmetadatafolder.WSGetMetadataFolder {
  private String _endpoint = null;
  private it.eng.auriga.repository2.webservices.getmetadatafolder.WSGetMetadataFolder wSGetMetadataFolder = null;
  
  public WSGetMetadataFolderProxy() {
    _initWSGetMetadataFolderProxy();
  }
  
  public WSGetMetadataFolderProxy(String endpoint) {
    _endpoint = endpoint;
    _initWSGetMetadataFolderProxy();
  }
  
  private void _initWSGetMetadataFolderProxy() {
    try {
      wSGetMetadataFolder = (new it.eng.auriga.repository2.webservices.getmetadatafolder.WSGetMetadataFolderServiceLocator()).getWSGetMetadataFolder();
      if (wSGetMetadataFolder != null) {
        if (_endpoint != null)
          ((javax.xml.rpc.Stub)wSGetMetadataFolder)._setProperty("javax.xml.rpc.service.endpoint.address", _endpoint);
        else
          _endpoint = (String)((javax.xml.rpc.Stub)wSGetMetadataFolder)._getProperty("javax.xml.rpc.service.endpoint.address");
      }
      
    }
    catch (javax.xml.rpc.ServiceException serviceException) {}
  }
  
  public String getEndpoint() {
    return _endpoint;
  }
  
  public void setEndpoint(String endpoint) {
    _endpoint = endpoint;
    if (wSGetMetadataFolder != null)
      ((javax.xml.rpc.Stub)wSGetMetadataFolder)._setProperty("javax.xml.rpc.service.endpoint.address", _endpoint);
    
  }
  
  public it.eng.auriga.repository2.webservices.getmetadatafolder.WSGetMetadataFolder getWSGetMetadataFolder() {
    if (wSGetMetadataFolder == null)
      _initWSGetMetadataFolderProxy();
    return wSGetMetadataFolder;
  }
  
  public java.lang.String service(java.lang.String codApplicazione, java.lang.String istanzaApplicazione, java.lang.String userName, java.lang.String password, java.lang.String xml, java.lang.String hash) throws java.rmi.RemoteException{
    if (wSGetMetadataFolder == null)
      _initWSGetMetadataFolderProxy();
    return wSGetMetadataFolder.service(codApplicazione, istanzaApplicazione, userName, password, xml, hash);
  }
  
  
}