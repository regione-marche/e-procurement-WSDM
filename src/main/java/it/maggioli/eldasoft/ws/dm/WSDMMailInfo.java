package it.maggioli.eldasoft.ws.dm;

import javax.xml.bind.annotation.XmlType;

@XmlType(name = "WSDMMailInfoType", propOrder = { "destinatarioDescrizione", "destinatarioEmail", "destinatarioCodiceFiscale", "mailInfo2" })
public class WSDMMailInfo {

  private String          destinatarioDescrizione;
  private String          destinatarioEmail;
  private String          destinatarioCodiceFiscale;
  private WSDMMailInfo2[] mailInfo2;
  
  public String getDestinatarioDescrizione() {
    return destinatarioDescrizione;
  }
  
  public void setDestinatarioDescrizione(String destinatarioDescrizione) {
    this.destinatarioDescrizione = destinatarioDescrizione;
  }
  
  public String getDestinatarioEmail() {
    return destinatarioEmail;
  }
  
  public void setDestinatarioEmail(String destinatarioEmail) {
    this.destinatarioEmail = destinatarioEmail;
  }
  
  public String getDestinatarioCodiceFiscale() {
    return destinatarioCodiceFiscale;
  }
  
  public void setDestinatarioCodiceFiscale(String destinatarioCodiceFiscale) {
    this.destinatarioCodiceFiscale = destinatarioCodiceFiscale;
  }
  
  public WSDMMailInfo2[] getMailInfo2() {
    return mailInfo2;
  }
  
  public void setMailInfo2(WSDMMailInfo2[] mailInfo2) {
    this.mailInfo2 = mailInfo2;
  }

}
