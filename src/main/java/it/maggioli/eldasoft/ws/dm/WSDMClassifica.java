package it.maggioli.eldasoft.ws.dm;

import javax.xml.bind.annotation.XmlType;

@XmlType(name = "WSDMClassificaType", propOrder = { "codice", "descrizione", "voce" })
public class WSDMClassifica {

  private String codice;
  private String descrizione;
  private String voce;

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
  
  public String getVoce() {
    return voce;
  }
  
  public void setVoce(String voce) {
    this.voce = voce;
  }

}
