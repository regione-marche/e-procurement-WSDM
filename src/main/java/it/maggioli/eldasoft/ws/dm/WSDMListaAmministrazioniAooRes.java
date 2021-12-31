package it.maggioli.eldasoft.ws.dm;

import javax.xml.bind.annotation.XmlType;

@XmlType(name = "WSDMListaAmministrazioniAooResType", propOrder = { "esito", "messaggio", "listaAmministrazioniAoo" })
public class WSDMListaAmministrazioniAooRes {

  private boolean                  esito;
  private String                   messaggio;
  private WSDMAmministrazioneAoo[] listaAmministrazioniAoo;

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

  public WSDMAmministrazioneAoo[] getListaAmministrazioniAoo() {
    return listaAmministrazioniAoo;
  }

  public void setListaAmministrazioniAoo(WSDMAmministrazioneAoo[] listaAmministrazioniAoo) {
    this.listaAmministrazioniAoo = listaAmministrazioniAoo;
  }

}
