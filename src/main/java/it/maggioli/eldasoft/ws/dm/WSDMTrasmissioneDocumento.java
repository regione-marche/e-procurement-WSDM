package it.maggioli.eldasoft.ws.dm;

import javax.xml.bind.annotation.XmlType;

@XmlType(name = "WSDMTrasmissioneDocumentoType", propOrder = { "numeroDocumento", "utenti" })
public class WSDMTrasmissioneDocumento {

  private String         numeroDocumento;
  WSDMTrasmissioneUtente[] utenti;

  public String getNumeroDocumento() {
    return numeroDocumento;
  }

  public void setNumeroDocumento(String numeroDocumento) {
    this.numeroDocumento = numeroDocumento;
  }

  
  public WSDMTrasmissioneUtente[] getUtenti() {
    return utenti;
  }

  
  public void setUtenti(WSDMTrasmissioneUtente[] utenti) {
    this.utenti = utenti;
  }



}
