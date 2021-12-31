package it.maggioli.eldasoft.ws.dm;

import javax.xml.bind.annotation.XmlType;

@XmlType(name = "WSDMLoginResType", propOrder = { "esito", "messaggio", "loginAttr" })
public class WSDMLoginRes {

  private boolean       esito;
  private String        messaggio;
  private WSDMLoginAttr loginAttr;
  
  public boolean isEsito() {
    return esito;
  }
  
  public void setEsito(boolean esito) {
    this.esito = esito;
  }
  
  public String getMessaggio() {
    return messaggio;
  }
  
  public void setMessaggio(String messaggio) {
    this.messaggio = messaggio;
  }
  
  public WSDMLoginAttr getLoginAttr() {
    return loginAttr;
  }
  
  public void setLoginAttr(WSDMLoginAttr loginAttr) {
    this.loginAttr = loginAttr;
  }




}
