package it.maggioli.eldasoft.ws.dm;

import javax.xml.bind.annotation.XmlType;

@XmlType(name = "WSDMDocumentoAggiungiInformazioniType", propOrder = { "numeroDocumento", "operatoreEconomicoAggiudicatario" })
public class WSDMDocumentoAggiungiInformazioni {

  
  private String numeroDocumento;
  private WSDMOperatoreEconomicoAggiudicatario operatoreEconomicoAggiudicatario;
  
  public String getNumeroDocumento() {
    return numeroDocumento;
  }
  
  public void setNumeroDocumento(String numeroDocumento) {
    this.numeroDocumento = numeroDocumento;
  }
  
  public WSDMOperatoreEconomicoAggiudicatario getOperatoreEconomicoAggiudicatario() {
    return operatoreEconomicoAggiudicatario;
  }
  
  public void setOperatoreEconomicoAggiudicatario(WSDMOperatoreEconomicoAggiudicatario operatoreEconomicoAggiudicatario) {
    this.operatoreEconomicoAggiudicatario = operatoreEconomicoAggiudicatario;
  }


}
