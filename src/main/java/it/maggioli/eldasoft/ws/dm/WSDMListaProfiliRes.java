package it.maggioli.eldasoft.ws.dm;

import javax.xml.bind.annotation.XmlType;

@XmlType(name = "WSDMListaProfiliResType", propOrder = { "esito", "messaggio", "listaProfili" })
public class WSDMListaProfiliRes {

  private boolean       esito;
  private String        messaggio;
  private WSDMProfilo[] listaProfili;

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

  public WSDMProfilo[] getListaProfili() {
    return listaProfili;
  }

  public void setListaProfili(WSDMProfilo[] listaProfili) {
    this.listaProfili = listaProfili;
  }

}
