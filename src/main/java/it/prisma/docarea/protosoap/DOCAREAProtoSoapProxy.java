package it.prisma.docarea.protosoap;

public class DOCAREAProtoSoapProxy implements it.prisma.docarea.protosoap.DOCAREAProtoSoap {
  private String _endpoint = null;
  private it.prisma.docarea.protosoap.DOCAREAProtoSoap dOCAREAProtoSoap = null;
  
  public DOCAREAProtoSoapProxy() {
    _initDOCAREAProtoSoapProxy();
  }
  
  public DOCAREAProtoSoapProxy(String endpoint) {
    _endpoint = endpoint;
    _initDOCAREAProtoSoapProxy();
  }
  
  private void _initDOCAREAProtoSoapProxy() {
    try {
      dOCAREAProtoSoap = (new it.prisma.docarea.protosoap.DOCAREAProtoLocator()).getDOCAREAProtoSoap();
      if (dOCAREAProtoSoap != null) {
        if (_endpoint != null)
          ((javax.xml.rpc.Stub)dOCAREAProtoSoap)._setProperty("javax.xml.rpc.service.endpoint.address", _endpoint);
        else
          _endpoint = (String)((javax.xml.rpc.Stub)dOCAREAProtoSoap)._getProperty("javax.xml.rpc.service.endpoint.address");
      }
      
    }
    catch (javax.xml.rpc.ServiceException serviceException) {}
  }
  
  public String getEndpoint() {
    return _endpoint;
  }
  
  public void setEndpoint(String endpoint) {
    _endpoint = endpoint;
    if (dOCAREAProtoSoap != null)
      ((javax.xml.rpc.Stub)dOCAREAProtoSoap)._setProperty("javax.xml.rpc.service.endpoint.address", _endpoint);
    
  }
  
  public it.prisma.docarea.protosoap.DOCAREAProtoSoap getDOCAREAProtoSoap() {
    if (dOCAREAProtoSoap == null)
      _initDOCAREAProtoSoapProxy();
    return dOCAREAProtoSoap;
  }
  
  public it.prisma.docarea.protosoap.LoginRet login(java.lang.String strCodEnte, java.lang.String strUserName, java.lang.String strPassword) throws java.rmi.RemoteException{
    if (dOCAREAProtoSoap == null)
      _initDOCAREAProtoSoapProxy();
    return dOCAREAProtoSoap.login(strCodEnte, strUserName, strPassword);
  }
  
  public it.prisma.docarea.protosoap.InserimentoRet inserimento(java.lang.String strUserName, java.lang.String strDST, byte[] strAttachment) throws java.rmi.RemoteException{
    if (dOCAREAProtoSoap == null)
      _initDOCAREAProtoSoapProxy();
    return dOCAREAProtoSoap.inserimento(strUserName, strDST, strAttachment);
  }
  
  public it.prisma.docarea.protosoap.SmistamentoActionRet smistamentoAction(java.lang.String strUserName, java.lang.String strDST, byte[] strAttachment) throws java.rmi.RemoteException{
    if (dOCAREAProtoSoap == null)
      _initDOCAREAProtoSoapProxy();
    return dOCAREAProtoSoap.smistamentoAction(strUserName, strDST, strAttachment);
  }
  
  public it.prisma.docarea.protosoap.ProtocollazioneRet protocollazione(java.lang.String strUserName, java.lang.String strDST, byte[] strAttachment) throws java.rmi.RemoteException{
    if (dOCAREAProtoSoap == null)
      _initDOCAREAProtoSoapProxy();
    return dOCAREAProtoSoap.protocollazione(strUserName, strDST, strAttachment);
  }
  
  public it.prisma.docarea.protosoap.AggiungiAllegatoRet aggiungiAllegato(java.lang.String strUserName, java.lang.String strDST, byte[] strAttachment) throws java.rmi.RemoteException{
    if (dOCAREAProtoSoap == null)
      _initDOCAREAProtoSoapProxy();
    return dOCAREAProtoSoap.aggiungiAllegato(strUserName, strDST, strAttachment);
  }
  
  public it.prisma.docarea.protosoap.SostituisciDocumentoPrincipaleRet sostituisciDocumentoPrincipale(java.lang.String strUserName, java.lang.String strDST, byte[] strAttachment) throws java.rmi.RemoteException{
    if (dOCAREAProtoSoap == null)
      _initDOCAREAProtoSoapProxy();
    return dOCAREAProtoSoap.sostituisciDocumentoPrincipale(strUserName, strDST, strAttachment);
  }
  
  
}