package it.maggioli.eldasoft.ws.dm;

import javax.xml.bind.annotation.XmlType;

@XmlType(name = "WSDMVerificaMailResType", propOrder = { "esito", "messaggio", "inviato", "numeroAccettazioni", "numeroConsegne",
    "destinatariMailInfo", "destinatariCCMailInfo" })
public class WSDMVerificaMailRes {

  private boolean        esito;
  private String         messaggio;
  private String         inviato;
  private Long           numeroAccettazioni;
  private Long           numeroConsegne;
  private WSDMMailInfo[] destinatariMailInfo;
  private WSDMMailInfo[] destinatariCCMailInfo;

  public String getInviato() {
    return inviato;
  }

  public void setInviato(String inviato) {
    this.inviato = inviato;
  }

  public Long getNumeroAccettazioni() {
    return numeroAccettazioni;
  }

  public void setNumeroAccettazioni(Long numeroAccettazioni) {
    this.numeroAccettazioni = numeroAccettazioni;
  }

  public Long getNumeroConsegne() {
    return numeroConsegne;
  }

  public void setNumeroConsegne(Long numeroConsegne) {
    this.numeroConsegne = numeroConsegne;
  }

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
