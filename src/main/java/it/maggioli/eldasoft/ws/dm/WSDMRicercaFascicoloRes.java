package it.maggioli.eldasoft.ws.dm;

import javax.xml.bind.annotation.XmlType;

@XmlType(name = "WSDMRicercaFascicoloResType", propOrder = { "esito", "messaggio", "fascicoli" })
public class WSDMRicercaFascicoloRes {

  private boolean       esito;
  private String        messaggio;
  private WSDMFascicolo[] fascicoli;

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

  
  public WSDMFascicolo[] getFascicoli() {
    return fascicoli;
  }

  
  public void setFascicoli(WSDMFascicolo[] fascicoli) {
    this.fascicoli = fascicoli;
  }


}
