package it.maggioli.eldasoft.ws.dm;

import javax.xml.bind.annotation.XmlType;

@XmlType(name = "WSDMListaAccountEmailResType", propOrder = { "esito", "messaggio", "listaAccountEmail" })
public class WSDMListaAccountEmailRes {

  private boolean       esito;
  private String        messaggio;
  private WSDMAccountEmail[] listaAccountEmail;
  
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
  
  public WSDMAccountEmail[] getListaAccountEmail() {
    return listaAccountEmail;
  }
  
  public void setListaAccountEmail(WSDMAccountEmail[] listaAccountEmail) {
    this.listaAccountEmail = listaAccountEmail;
  }



}
