package it.utrwssgateway;

public class UtrWSSGatewayProxy implements it.utrwssgateway.UtrWSSGateway {
  private String _endpoint = null;
  private it.utrwssgateway.UtrWSSGateway utrWSSGateway = null;
  
  public UtrWSSGatewayProxy() {
    _initUtrWSSGatewayProxy();
  }
  
  public UtrWSSGatewayProxy(String endpoint) {
    _endpoint = endpoint;
    _initUtrWSSGatewayProxy();
  }
  
  private void _initUtrWSSGatewayProxy() {
    try {
      utrWSSGateway = (new it.utrwssgateway.UtrWSSGatewayServiceLocator()).getUtrWSSGateway();
      if (utrWSSGateway != null) {
        if (_endpoint != null)
          ((javax.xml.rpc.Stub)utrWSSGateway)._setProperty("javax.xml.rpc.service.endpoint.address", _endpoint);
        else
          _endpoint = (String)((javax.xml.rpc.Stub)utrWSSGateway)._getProperty("javax.xml.rpc.service.endpoint.address");
      }
      
    }
    catch (javax.xml.rpc.ServiceException serviceException) {}
  }
  
  public String getEndpoint() {
    return _endpoint;
  }
  
  public void setEndpoint(String endpoint) {
    _endpoint = endpoint;
    if (utrWSSGateway != null)
      ((javax.xml.rpc.Stub)utrWSSGateway)._setProperty("javax.xml.rpc.service.endpoint.address", _endpoint);
    
  }
  
  public it.utrwssgateway.UtrWSSGateway getUtrWSSGateway() {
    if (utrWSSGateway == null)
      _initUtrWSSGatewayProxy();
    return utrWSSGateway;
  }
  
  public java.lang.String getEntities(java.lang.String logonCredentials, java.lang.String searchFilter) throws java.rmi.RemoteException{
    if (utrWSSGateway == null)
      _initUtrWSSGatewayProxy();
    return utrWSSGateway.getEntities(logonCredentials, searchFilter);
  }
  
  public void alterEntities(java.lang.String logonCredentials, java.lang.String entities) throws java.rmi.RemoteException{
    if (utrWSSGateway == null)
      _initUtrWSSGatewayProxy();
    utrWSSGateway.alterEntities(logonCredentials, entities);
  }
  
  
}