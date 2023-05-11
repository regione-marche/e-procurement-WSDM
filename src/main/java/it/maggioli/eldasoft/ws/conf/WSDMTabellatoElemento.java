package it.maggioli.eldasoft.ws.conf;

import javax.xml.bind.annotation.XmlType;

@XmlType(name = "WSDMTabellatoElementoType", propOrder = { "codice", "descrizione" })
public class WSDMTabellatoElemento {

  private String codice;
  private String descrizione;

  public String getCodice() {
    return codice;
  }

  public void setCodice(String codice) {
    this.codice = codice;
  }

  public String getDescrizione() {
    return descrizione;
  }

  public void setDescrizione(String descrizione) {
    this.descrizione = descrizione;
  }

}
