package it.maggioli.eldasoft.ws.dm;

import javax.xml.bind.annotation.XmlType;

@XmlType(name = "WSDMInviaMailResType", propOrder = { "esito", "messaggio", "destinatariMailInfo", "destinatariCCMailInfo" })
public class WSDMInviaMailRes {

  private boolean        esito;
  private String         messaggio;
  private WSDMMailInfo[] destinatariMailInfo;
  private WSDMMailInfo[] destinatariCCMailInfo;

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

  public WSDMMailInfo[] getDestinatariMailInfo() {
    return destinatariMailInfo;
  }

  public void setDestinatariMailInfo(WSDMMailInfo[] destinatariMailInfo) {
    this.destinatariMailInfo = destinatariMailInfo;
  }

  public WSDMMailInfo[] getDestinatariCCMailInfo() {
    return destinatariCCMailInfo;
  }

  public void setDestinatariCCMailInfo(WSDMMailInfo[] destinatariCCMailInfo) {
    this.destinatariCCMailInfo = destinatariCCMailInfo;
  }

}
