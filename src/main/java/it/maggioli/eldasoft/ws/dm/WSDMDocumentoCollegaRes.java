package it.maggioli.eldasoft.ws.dm;

import javax.xml.bind.annotation.XmlType;

@XmlType(name = "WSDMDocumentoCollegaResType", propOrder = { "esito", "messaggio" })
public class WSDMDocumentoCollegaRes {

  private boolean                 esito;
  private String                  messaggio;

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

}
