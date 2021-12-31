package it.maggioli.eldasoft.ws.dm;

import javax.xml.bind.annotation.XmlType;

@XmlType(name = "WSDMListaTipiTrasmissioneResType", propOrder = { "esito", "messaggio", "tipiTrasmissione" })
public class WSDMListaTipiTrasmissioneRes {

  private boolean                esito;
  private String                 messaggio;
  private WSDMTipoTrasmissione[] tipiTrasmissione;

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

  public WSDMTipoTrasmissione[] getTipiTrasmissione() {
    return tipiTrasmissione;
  }

  public void setTipiTrasmissione(WSDMTipoTrasmissione[] tipiTrasmissione) {
    this.tipiTrasmissione = tipiTrasmissione;
  }

}
