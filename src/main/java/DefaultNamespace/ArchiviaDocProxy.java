package DefaultNamespace;

public class ArchiviaDocProxy implements DefaultNamespace.ArchiviaDoc {
  private String _endpoint = null;
  private DefaultNamespace.ArchiviaDoc archiviaDoc = null;
  
  public ArchiviaDocProxy() {
    _initArchiviaDocProxy();
  }
  
  public ArchiviaDocProxy(String endpoint) {
    _endpoint = endpoint;
    _initArchiviaDocProxy();
  }
  
  private void _initArchiviaDocProxy() {
    try {
      archiviaDoc = (new DefaultNamespace.ArchiviaDocServiceLocator()).getDomino();
      if (archiviaDoc != null) {
        if (_endpoint != null)
          ((javax.xml.rpc.Stub)archiviaDoc)._setProperty("javax.xml.rpc.service.endpoint.address", _endpoint);
        else
          _endpoint = (String)((javax.xml.rpc.Stub)archiviaDoc)._getProperty("javax.xml.rpc.service.endpoint.address");
      }
      
    }
    catch (javax.xml.rpc.ServiceException serviceException) {}
  }
  
  public String getEndpoint() {
    return _endpoint;
  }
  
  public void setEndpoint(String endpoint) {
    _endpoint = endpoint;
    if (archiviaDoc != null)
      ((javax.xml.rpc.Stub)archiviaDoc)._setProperty("javax.xml.rpc.service.endpoint.address", _endpoint);
    
  }
  
  public DefaultNamespace.ArchiviaDoc getArchiviaDoc() {
    if (archiviaDoc == null)
      _initArchiviaDocProxy();
    return archiviaDoc;
  }
  
  public DefaultNamespace.DOCRESPONSE ADDNEWDOC(java.lang.String ARCHIVIA, java.lang.String DATA, java.lang.String MITTENTE, java.lang.String DESTINATARIO, java.lang.String FASCICOLO, java.lang.String OGGETTO, java.lang.String PROTOCOLLA, java.lang.String INVIA, java.lang.String TIPO, java.lang.String NOTE, java.lang.String[] NOMEFILE, byte[][] BASE64FILE) throws java.rmi.RemoteException{
    if (archiviaDoc == null)
      _initArchiviaDocProxy();
    return archiviaDoc.ADDNEWDOC(ARCHIVIA, DATA, MITTENTE, DESTINATARIO, FASCICOLO, OGGETTO, PROTOCOLLA, INVIA, TIPO, NOTE, NOMEFILE, BASE64FILE);
  }
  
  
}