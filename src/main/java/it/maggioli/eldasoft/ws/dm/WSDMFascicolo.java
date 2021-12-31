package it.maggioli.eldasoft.ws.dm;

import java.util.Date;

import javax.xml.bind.annotation.XmlType;

@XmlType(name = "WSDMFascicoloType", propOrder = { "codiceFascicolo", "dataFascicolo", "annoFascicolo", "numeroFascicolo", "documenti",
    "classificaFascicoloDescrizione", "datiPersonalizzati" })
public class WSDMFascicolo extends WSDMFascicoloIn {

  private String                   codiceFascicolo;
  private Date                     dataFascicolo;
  private Long                     annoFascicolo;
  private String                   numeroFascicolo;
  private WSDMFascicoloDocumento[] documenti;
  private String                   classificaFascicoloDescrizione;
  private WSDMTabella[]            datiPersonalizzati;

  public String getCodiceFascicolo() {
    return codiceFascicolo;
  }

  public void setCodiceFascicolo(String codiceFascicolo) {
    this.codiceFascicolo = codiceFascicolo;
  }

  public Date getDataFascicolo() {
    return dataFascicolo;
  }

  public void setDataFascicolo(Date dataFascicolo) {
    this.dataFascicolo = dataFascicolo;
  }

  public Long getAnnoFascicolo() {
    return annoFascicolo;
  }

  public void setAnnoFascicolo(Long annoFascicolo) {
    this.annoFascicolo = annoFascicolo;
  }

  public String getNumeroFascicolo() {
    return numeroFascicolo;
  }

  public void setNumeroFascicolo(String numeroFascicolo) {
    this.numeroFascicolo = numeroFascicolo;
  }

  public WSDMFascicoloDocumento[] getDocumenti() {
    return documenti;
  }

  public void setDocumenti(WSDMFascicoloDocumento[] documenti) {
    this.documenti = documenti;
  }

  public String getClassificaFascicoloDescrizione() {
    return classificaFascicoloDescrizione;
  }

  public void setClassificaFascicoloDescrizione(String classificaFascicoloDescrizione) {
    this.classificaFascicoloDescrizione = classificaFascicoloDescrizione;
  }

  
  public WSDMTabella[] getDatiPersonalizzati() {
    return datiPersonalizzati;
  }

  
  public void setDatiPersonalizzati(WSDMTabella[] datiPersonalizzati) {
    this.datiPersonalizzati = datiPersonalizzati;
  }

}
