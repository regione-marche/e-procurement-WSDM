package it.maggioli.eldasoft.ws.dm;

import javax.xml.bind.annotation.XmlType;

@XmlType(name = "WSDMTrasmissioneUtenteType", propOrder = { "operatore", "tipoTrasmissione" })
public class WSDMTrasmissioneUtente {

  private WSDMOperatore operatore;
  private String        tipoTrasmissione;

  public WSDMOperatore getOperatore() {
    return operatore;
  }

  public void setOperatore(WSDMOperatore operatore) {
    this.operatore = operatore;
  }

  public String getTipoTrasmissione() {
    return tipoTrasmissione;
  }

  public void setTipoTrasmissione(String tipoTrasmissione) {
    this.tipoTrasmissione = tipoTrasmissione;
  }

}
