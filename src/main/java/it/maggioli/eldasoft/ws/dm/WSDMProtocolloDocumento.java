package it.maggioli.eldasoft.ws.dm;

import java.util.Date;

import javax.xml.bind.annotation.XmlType;

@XmlType(name = "WSDMProtocolloDocumentoType", propOrder = { "numeroDocumento", "annoProtocollo", "numeroProtocollo", "dataProtocollo",
    "mittenteInternoDescrizione", "tipoDocumentoDescrizione", "siglaRegistrazione", "annoRegistrazione",
    "numeroRegistrazione", "dataRegistrazione", "datiPersonalizzati" })
public class WSDMProtocolloDocumento extends WSDMProtocolloDocumentoIn {

  private String        numeroDocumento;
  private Long          annoProtocollo;
  private String        numeroProtocollo;
  private Date          dataProtocollo;
  private String        mittenteInternoDescrizione;
  private String        tipoDocumentoDescrizione;
  private String        siglaRegistrazione;
  private Long          annoRegistrazione;
  private Long          numeroRegistrazione;
  private Date          dataRegistrazione;
  private WSDMTabella[] datiPersonalizzati;

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

  public Date getDataProtocollo() {
    return dataProtocollo;
  }

  public void setDataProtocollo(Date dataProtocollo) {
    this.dataProtocollo = dataProtocollo;
  }

  public String getMittenteInternoDescrizione() {
    return mittenteInternoDescrizione;
  }

  public void setMittenteInternoDescrizione(String mittenteInternoDescrizione) {
    this.mittenteInternoDescrizione = mittenteInternoDescrizione;
  }

  public String getTipoDocumentoDescrizione() {
    return tipoDocumentoDescrizione;
  }

  public void setTipoDocumentoDescrizione(String tipoDocumentoDescrizione) {
    this.tipoDocumentoDescrizione = tipoDocumentoDescrizione;
  }

  public String getSiglaRegistrazione() {
    return siglaRegistrazione;
  }

  public void setSiglaRegistrazione(String siglaRegistrazione) {
    this.siglaRegistrazione = siglaRegistrazione;
  }

  public Long getAnnoRegistrazione() {
    return annoRegistrazione;
  }

  public void setAnnoRegistrazione(Long annoRegistrazione) {
    this.annoRegistrazione = annoRegistrazione;
  }

  public Long getNumeroRegistrazione() {
    return numeroRegistrazione;
  }

  public void setNumeroRegistrazione(Long numeroRegistrazione) {
    this.numeroRegistrazione = numeroRegistrazione;
  }

  public Date getDataRegistrazione() {
    return dataRegistrazione;
  }

  public void setDataRegistrazione(Date dataRegistrazione) {
    this.dataRegistrazione = dataRegistrazione;
  }

  
  public WSDMTabella[] getDatiPersonalizzati() {
    return datiPersonalizzati;
  }

  
  public void setDatiPersonalizzati(WSDMTabella[] datiPersonalizzati) {
    this.datiPersonalizzati = datiPersonalizzati;
  }

}
