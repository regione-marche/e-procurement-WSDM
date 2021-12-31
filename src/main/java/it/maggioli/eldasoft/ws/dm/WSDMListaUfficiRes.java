package it.maggioli.eldasoft.ws.dm;

import javax.xml.bind.annotation.XmlType;

@XmlType(name = "WSDMListaUfficiResType", propOrder = { "esito", "messaggio", "listaUffici" })
public class WSDMListaUfficiRes {

  private boolean       esito;
  private String        messaggio;
  private WSDMUfficio[] listaUffici;

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

  public WSDMUfficio[] getListaUffici() {
    return listaUffici;
  }

  public void setListaUffici(WSDMUfficio[] listaUffici) {
    this.listaUffici = listaUffici;
  }

}
