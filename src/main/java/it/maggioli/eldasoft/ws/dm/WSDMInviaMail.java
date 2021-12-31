package it.maggioli.eldasoft.ws.dm;

import javax.xml.bind.annotation.XmlType;

@XmlType(name = "WSDMInviaMailType", propOrder = { "numeroDocumento", "annoProtocollo", "numeroProtocollo", "oggettoMail", "testoMail",
    "mittenteMail", "destinatariMail", "destinatariMailCC", "formatoMail", "mailChannelCode", "mailConfigurationCode", "allegati" })
public class WSDMInviaMail {

  private String                   numeroDocumento;
  private Long                     annoProtocollo;
  private String                   numeroProtocollo;
  private String                   oggettoMail;
  private String                   testoMail;
  private String                   mittenteMail;
  private String[]                 destinatariMail;
  private String[]                 destinatariMailCC;
  private WSDMMailFormato          formatoMail;
  private String                   mailChannelCode;
  private String                   mailConfigurationCode;
  private WSDMProtocolloAllegato[] allegati;

  public String getMailChannelCode() {
    return mailChannelCode;
  }

  public void setMailChannelCode(String mailChannelCode) {
    this.mailChannelCode = mailChannelCode;
  }

  public String getMailConfigurationCode() {
    return mailConfigurationCode;
  }

  public void setMailConfigurationCode(String mailConfigurationCode) {
    this.mailConfigurationCode = mailConfigurationCode;
  }

  public String getNumeroDocumento() {
    return numeroDocumento;
  }

  public void setNumeroDocumento(String numeroDocumento) {
    this.numeroDocumento = numeroDocumento;
  }

  public String getOggettoMail() {
    return oggettoMail;
  }

  public void setOggettoMail(String oggettoMail) {
    this.oggettoMail = oggettoMail;
  }

  public String getTestoMail() {
    return testoMail;
  }

  public void setTestoMail(String testoMail) {
    this.testoMail = testoMail;
  }

  public String getMittenteMail() {
    return mittenteMail;
  }

  public void setMittenteMail(String mittenteMail) {
    this.mittenteMail = mittenteMail;
  }

  public String[] getDestinatariMail() {
    return destinatariMail;
  }

  public void setDestinatariMail(String[] destinatariMail) {
    this.destinatariMail = destinatariMail;
  }

  public String[] getDestinatariMailCC() {
    return destinatariMailCC;
  }

  public void setDestinatariMailCC(String[] destinatariMailCC) {
    this.destinatariMailCC = destinatariMailCC;
  }

  public WSDMMailFormato getFormatoMail() {
    return formatoMail;
  }

  public void setFormatoMail(WSDMMailFormato formatoMail) {
    this.formatoMail = formatoMail;
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
