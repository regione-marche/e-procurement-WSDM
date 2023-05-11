package it.maggioli.eldasoft.ws.dm;

import javax.xml.bind.annotation.XmlType;

@XmlType(name = "WSDMRicercaFascicoloType", propOrder = { "annoFascicolo", "numeroFascicolo", "codiceFascicolo", "oggettoFascicolo",
    "classificaFascicolo", "strutturaFascicolo", "identificativoGara", "cig" })
public class WSDMRicercaFascicolo {

  private Long   annoFascicolo;
  private String numeroFascicolo;
  private String codiceFascicolo;
  private String oggettoFascicolo;
  private String classificaFascicolo;
  
  public String getStrutturaFascicolo() {
    return strutturaFascicolo;
  }

  
  public void setStrutturaFascicolo(String strutturaFascicolo) {
    this.strutturaFascicolo = strutturaFascicolo;
  }

  
  public String getIdentificativoGara() {
    return identificativoGara;
  }

  
  public void setIdentificativoGara(String identificativoGara) {
    this.identificativoGara = identificativoGara;
  }

  
  public String getCig() {
    return cig;
  }

  
  public void setCig(String cig) {
    this.cig = cig;
  }

  private String strutturaFascicolo;
  private String identificativoGara;
  private String cig;

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

  public String getCodiceFascicolo() {
    return codiceFascicolo;
  }

  public void setCodiceFascicolo(String codiceFascicolo) {
    this.codiceFascicolo = codiceFascicolo;
  }

  public String getOggettoFascicolo() {
    return oggettoFascicolo;
  }

  public void setOggettoFascicolo(String oggettoFascicolo) {
    this.oggettoFascicolo = oggettoFascicolo;
  }

  public String getClassificaFascicolo() {
    return classificaFascicolo;
  }

  public void setClassificaFascicolo(String classificaFascicolo) {
    this.classificaFascicolo = classificaFascicolo;
  }

}
