package it.maggioli.eldasoft.ws.dm;

import javax.xml.bind.annotation.XmlType;

@XmlType(name = "WSDMFascicoloResType", propOrder = { "esito", "messaggio", "fascicolo" })
public class WSDMFascicoloRes {

  private boolean       esito;
  private String        messaggio;
  private WSDMFascicolo fascicolo;

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

  public WSDMFascicolo getFascicolo() {
    return fascicolo;
  }

  public void setFascicolo(WSDMFascicolo fascicolo) {
    this.fascicolo = fascicolo;
  }

}
