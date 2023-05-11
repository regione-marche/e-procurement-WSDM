package it.maggioli.eldasoft.ws.dm;

import java.util.Date;

import javax.xml.bind.annotation.XmlType;

@XmlType(name = "WSDMFascicoloDocumentoType", propOrder = { "numeroDocumento", "dataProtocollo", "annoProtocollo", "numeroProtocollo",
    "oggetto", "inout", "segnaturaProtocollo", "codiceUO" })
public class WSDMFascicoloDocumento {

  private String              numeroDocumento;
  private Date                dataProtocollo;
  private Long                annoProtocollo;
  private String              numeroProtocollo;
  private String              oggetto;
  private WSDMProtocolloInOut inout;
  private String              segnaturaProtocollo;
  private String              codiceUO;

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

  public String getOggetto() {
    return oggetto;
  }

  public void setOggetto(String oggetto) {
    this.oggetto = oggetto;
  }

  public WSDMProtocolloInOut getInout() {
    return inout;
  }

  public void setInout(WSDMProtocolloInOut inout) {
    this.inout = inout;
  }

  public Date getDataProtocollo() {
    return dataProtocollo;
  }

  public void setDataProtocollo(Date dataProtocollo) {
    this.dataProtocollo = dataProtocollo;
  }

  public String getSegnaturaProtocollo() {
    return segnaturaProtocollo;
  }

  public void setSegnaturaProtocollo(String segnaturaProtocollo) {
    this.segnaturaProtocollo = segnaturaProtocollo;
  }

  
  public String getCodiceUO() {
    return codiceUO;
  }

  
  public void setCodiceUO(String codiceUO) {
    this.codiceUO = codiceUO;
  }

}
