package it.cineca.titulus301.titulus_ws.services.Acl4;

public class Acl4Proxy implements it.cineca.titulus301.titulus_ws.services.Acl4.Acl4 {
  private String _endpoint = null;
  private it.cineca.titulus301.titulus_ws.services.Acl4.Acl4 acl4 = null;
  
  public Acl4Proxy() {
    _initAcl4Proxy();
  }
  
  public Acl4Proxy(String endpoint) {
    _endpoint = endpoint;
    _initAcl4Proxy();
  }
  
  private void _initAcl4Proxy() {
    try {
      acl4 = (new it.cineca.titulus301.titulus_ws.services.Acl4.Acl4ServiceLocator()).getAcl4();
      if (acl4 != null) {
        if (_endpoint != null)
          ((javax.xml.rpc.Stub)acl4)._setProperty("javax.xml.rpc.service.endpoint.address", _endpoint);
        else
          _endpoint = (String)((javax.xml.rpc.Stub)acl4)._getProperty("javax.xml.rpc.service.endpoint.address");
      }
      
    }
    catch (javax.xml.rpc.ServiceException serviceException) {}
  }
  
  public String getEndpoint() {
    return _endpoint;
  }
  
  public void setEndpoint(String endpoint) {
    _endpoint = endpoint;
    if (acl4 != null)
      ((javax.xml.rpc.Stub)acl4)._setProperty("javax.xml.rpc.service.endpoint.address", _endpoint);
    
  }
  
  public it.cineca.titulus301.titulus_ws.services.Acl4.Acl4 getAcl4() {
    if (acl4 == null)
      _initAcl4Proxy();
    return acl4;
  }
  
  public java.lang.String modify(java.lang.String id, java.lang.String xmlRecord) throws java.rmi.RemoteException{
    if (acl4 == null)
      _initAcl4Proxy();
    return acl4.modify(id, xmlRecord);
  }
  
  public java.lang.String setWSUser(java.lang.String user, java.lang.String pnumber) throws java.rmi.RemoteException{
    if (acl4 == null)
      _initAcl4Proxy();
    return acl4.setWSUser(user, pnumber);
  }
  
  public java.lang.String titlePage(int pageIndex) throws java.rmi.RemoteException{
    if (acl4 == null)
      _initAcl4Proxy();
    return acl4.titlePage(pageIndex);
  }
  
  public java.lang.String firstTitlePage() throws java.rmi.RemoteException{
    if (acl4 == null)
      _initAcl4Proxy();
    return acl4.firstTitlePage();
  }
  
  public java.lang.String nextTitlePage() throws java.rmi.RemoteException{
    if (acl4 == null)
      _initAcl4Proxy();
    return acl4.nextTitlePage();
  }
  
  public java.lang.String prevTitlePage() throws java.rmi.RemoteException{
    if (acl4 == null)
      _initAcl4Proxy();
    return acl4.prevTitlePage();
  }
  
  public java.lang.String lastTitlePage() throws java.rmi.RemoteException{
    if (acl4 == null)
      _initAcl4Proxy();
    return acl4.lastTitlePage();
  }
  
  public java.lang.String currentTitlePage() throws java.rmi.RemoteException{
    if (acl4 == null)
      _initAcl4Proxy();
    return acl4.currentTitlePage();
  }
  
  public boolean checkRight(java.lang.String code) throws java.rmi.RemoteException{
    if (acl4 == null)
      _initAcl4Proxy();
    return acl4.checkRight(code);
  }
  
  public java.lang.String addInternalStructure(java.lang.String xmlStructure) throws java.rmi.RemoteException{
    if (acl4 == null)
      _initAcl4Proxy();
    return acl4.addInternalStructure(xmlStructure);
  }
  
  public java.lang.String setUserProfile(java.lang.String id, java.lang.String keyProfile) throws java.rmi.RemoteException{
    if (acl4 == null)
      _initAcl4Proxy();
    return acl4.setUserProfile(id, keyProfile);
  }
  
  public int updateUsersProfile(java.lang.String keyProfile) throws java.rmi.RemoteException{
    if (acl4 == null)
      _initAcl4Proxy();
    return acl4.updateUsersProfile(keyProfile);
  }
  
  public java.lang.String addExternalStructure(java.lang.String xmlStructure) throws java.rmi.RemoteException{
    if (acl4 == null)
      _initAcl4Proxy();
    return acl4.addExternalStructure(xmlStructure);
  }
  
  public java.lang.String addExternalUser(java.lang.String xmlUser) throws java.rmi.RemoteException{
    if (acl4 == null)
      _initAcl4Proxy();
    return acl4.addExternalUser(xmlUser);
  }
  
  public java.lang.String addProfile(java.lang.String keyProfile, java.lang.String descProfile) throws java.rmi.RemoteException{
    if (acl4 == null)
      _initAcl4Proxy();
    return acl4.addProfile(keyProfile, descProfile);
  }
  
  public java.lang.String addUser(java.lang.String xmlUser) throws java.rmi.RemoteException{
    if (acl4 == null)
      _initAcl4Proxy();
    return acl4.addUser(xmlUser);
  }
  
  public boolean remove(java.lang.String id) throws java.rmi.RemoteException{
    if (acl4 == null)
      _initAcl4Proxy();
    return acl4.remove(id);
  }
  
  public java.lang.String load(java.lang.String id, boolean lock) throws java.rmi.RemoteException{
    if (acl4 == null)
      _initAcl4Proxy();
    return acl4.load(id, lock);
  }
  
  public java.lang.String lookup(java.lang.String nome_uff, java.lang.String nome_persona) throws java.rmi.RemoteException{
    if (acl4 == null)
      _initAcl4Proxy();
    return acl4.lookup(nome_uff, nome_persona);
  }
  
  public java.lang.String search(java.lang.String query, java.lang.String orderby, it.kion.www.titulus.QueryParams params) throws java.rmi.RemoteException{
    if (acl4 == null)
      _initAcl4Proxy();
    return acl4.search(query, orderby, params);
  }
  
  public boolean unlock(java.lang.String id) throws java.rmi.RemoteException{
    if (acl4 == null)
      _initAcl4Proxy();
    return acl4.unlock(id);
  }
  
  
}