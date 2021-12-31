package it.maggioli.eldasoft.ws.dm;

import javax.xml.bind.annotation.XmlType;

@XmlType(name = "WSDMProtocolloDocumentoResType", propOrder = { "esito", "messaggio", "protocolloDocumento" })
public class WSDMProtocolloDocumentoRes {

  private boolean                 esito;
  private String                  messaggio;
  private WSDMProtocolloDocumento protocolloDocumento;

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

  public WSDMProtocolloDocumento getProtocolloDocumento() {
    return protocolloDocumento;
  }

  public void setProtocolloDocumento(WSDMProtocolloDocumento protocolloDocumento) {
    this.protocolloDocumento = protocolloDocumento;
  }

}
