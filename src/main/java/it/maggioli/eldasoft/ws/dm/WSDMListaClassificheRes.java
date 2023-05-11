package it.maggioli.eldasoft.ws.dm;

import javax.xml.bind.annotation.XmlType;

@XmlType(name = "WSDMListaClassificheResType", propOrder = { "esito", "messaggio", "listaClassifiche" })
public class WSDMListaClassificheRes {

  private boolean          esito;
  private String           messaggio;
  private WSDMClassifica[] listaClassifiche;

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

  public WSDMClassifica[] getListaClassifiche() {
    return listaClassifiche;
  }

  public void setListaClassifiche(WSDMClassifica[] listaClassifiche) {
    this.listaClassifiche = listaClassifiche;
  }

}
