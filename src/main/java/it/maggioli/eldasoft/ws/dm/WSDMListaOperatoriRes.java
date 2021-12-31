package it.maggioli.eldasoft.ws.dm;

import javax.xml.bind.annotation.XmlType;

@XmlType(name = "WSDMListaOperatoriResType", propOrder = { "esito", "messaggio", "operatori" })
public class WSDMListaOperatoriRes {

  private boolean         esito;
  private String          messaggio;
  private WSDMOperatore[] operatori;

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

  public WSDMOperatore[] getOperatori() {
    return operatori;
  }

  public void setOperatori(WSDMOperatore[] operatori) {
    this.operatori = operatori;
  }

}
