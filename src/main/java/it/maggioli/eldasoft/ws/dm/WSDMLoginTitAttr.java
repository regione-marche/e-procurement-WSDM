package it.maggioli.eldasoft.ws.dm;

import javax.xml.bind.annotation.XmlType;

@XmlType(name = "WSDMLoginTitAttrType", propOrder = { "utenteApplicativo", "numeroProfilo", "codiceAmministrazioneAoo", "codiceUfficio" })
public class WSDMLoginTitAttr {

  private String                utenteApplicativo;
  private String                numeroProfilo;
  private String                codiceAmministrazioneAoo;
  private String                codiceUfficio;

  public String getUtenteApplicativo() {
    return utenteApplicativo;
  }

  public void setUtenteApplicativo(String utenteApplicativo) {
    this.utenteApplicativo = utenteApplicativo;
  }

  public String getNumeroProfilo() {
    return numeroProfilo;
  }

  public void setNumeroProfilo(String numeroProfilo) {
    this.numeroProfilo = numeroProfilo;
  }
  
 
  public String getCodiceUfficio() {
    return codiceUfficio;
  }

  
  public void setCodiceUfficio(String codiceUfficio) {
    this.codiceUfficio = codiceUfficio;
  }

  
  public String getCodiceAmministrazioneAoo() {
    return codiceAmministrazioneAoo;
  }

  
  public void setCodiceAmministrazioneAoo(String codiceAmministrazioneAoo) {
    this.codiceAmministrazioneAoo = codiceAmministrazioneAoo;
  }

}
