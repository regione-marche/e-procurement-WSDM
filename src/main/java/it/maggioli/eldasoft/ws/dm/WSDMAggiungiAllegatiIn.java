package it.maggioli.eldasoft.ws.dm;

import javax.xml.bind.annotation.XmlType;

@XmlType(name = "WSDMAggiungiAllegatiInType", propOrder = { "numeroDocumento", "annoProtocollo", "numeroProtocollo", "allegati" })
public class WSDMAggiungiAllegatiIn {

  private String                   numeroDocumento;
  private Long                     annoProtocollo;
  private String                   numeroProtocollo;
  private WSDMProtocolloAllegato[] allegati;
  
  public String getNumeroDocumento() {
    return numeroDocumento;
  }
  
  public void setNumeroDocumento(String numeroDocumento) {
    this.numeroDocumento = numeroDocumento;
  }
  
  public Long getAnnoProtocollo() {
    return annoProtocollo;
  }
  
  public void setAnnoProtocollo(Long annoProtocollo) {
    this.annoProtocollo = annoProtocollo;
  }
  
  public String getNumeroProtocollo() {
    return numeroProtocollo;
  }
  
  public void setNumeroProtocollo(String numeroProtocollo) {
    this.numeroProtocollo = numeroProtocollo;
  }
  
  public WSDMProtocolloAllegato[] getAllegati() {
    return allegati;
  }
  
  public void setAllegati(WSDMProtocolloAllegato[] allegati) {
    this.allegati = allegati;
  }

}
