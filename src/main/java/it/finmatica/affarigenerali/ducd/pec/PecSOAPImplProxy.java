package it.finmatica.affarigenerali.ducd.pec;

public class PecSOAPImplProxy implements it.finmatica.affarigenerali.ducd.pec.PecSOAPImpl {
  private String _endpoint = null;
  private it.finmatica.affarigenerali.ducd.pec.PecSOAPImpl pecSOAPImpl = null;
  
  public PecSOAPImplProxy() {
    _initPecSOAPImplProxy();
  }
  
  public PecSOAPImplProxy(String endpoint) {
    _endpoint = endpoint;
    _initPecSOAPImplProxy();
  }
  
  private void _initPecSOAPImplProxy() {
    try {
      pecSOAPImpl = (new it.finmatica.affarigenerali.ducd.pec.PecSOAPImplServiceLocator()).getPecSOAPImpl();
      if (pecSOAPImpl != null) {
        if (_endpoint != null)
          ((javax.xml.rpc.Stub)pecSOAPImpl)._setProperty("javax.xml.rpc.service.endpoint.address", _endpoint);
        else
          _endpoint = (String)((javax.xml.rpc.Stub)pecSOAPImpl)._getProperty("javax.xml.rpc.service.endpoint.address");
      }
      
    }
    catch (javax.xml.rpc.ServiceException serviceException) {}
  }
  
  public String getEndpoint() {
    return _endpoint;
  }
  
  public void setEndpoint(String endpoint) {
    _endpoint = endpoint;
    if (pecSOAPImpl != null)
      ((javax.xml.rpc.Stub)pecSOAPImpl)._setProperty("javax.xml.rpc.service.endpoint.address", _endpoint);
    
  }
  
  public it.finmatica.affarigenerali.ducd.pec.PecSOAPImpl getPecSOAPImpl() {
    if (pecSOAPImpl == null)
      _initPecSOAPImplProxy();
    return pecSOAPImpl;
  }
  
  public it.finmatica.affarigenerali.ducd.pec.ParametriUscita invioPecPG(it.finmatica.affarigenerali.ducd.pec.ParametriIngressoPG in) throws java.rmi.RemoteException{
    if (pecSOAPImpl == null)
      _initPecSOAPImplProxy();
    return pecSOAPImpl.invioPecPG(in);
  }
  
  public it.finmatica.affarigenerali.ducd.pec.ParametriUscita invioPec(it.finmatica.affarigenerali.ducd.pec.ParametriIngresso in) throws java.rmi.RemoteException{
    if (pecSOAPImpl == null)
      _initPecSOAPImplProxy();
    return pecSOAPImpl.invioPec(in);
  }
  
  
}