package it.maggioli.eldasoft.ws.dm;

import javax.xml.bind.annotation.XmlType;

@XmlType(name = "WSDMFascicoloModificaInType", propOrder = { "codiceFascicolo", "datiPersonalizzati" })
public class WSDMFascicoloModificaIn {

  private String        codiceFascicolo;
  private WSDMTabella[] datiPersonalizzati;

  public String getCodiceFascicolo() {
    return codiceFascicolo;
  }

  public void setCodiceFascicolo(String codiceFascicolo) {
    this.codiceFascicolo = codiceFascicolo;
  }

  public WSDMTabella[] getDatiPersonalizzati() {
    return datiPersonalizzati;
  }

  public void setDatiPersonalizzati(WSDMTabella[] datiPersonalizzati) {
    this.datiPersonalizzati = datiPersonalizzati;
  }

}
