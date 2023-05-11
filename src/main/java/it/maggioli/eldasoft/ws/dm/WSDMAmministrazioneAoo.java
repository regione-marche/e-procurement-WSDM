package it.maggioli.eldasoft.ws.dm;

import javax.xml.bind.annotation.XmlType;

@XmlType(name = "WSDMAmministrazioneAooType", propOrder = { "codiceAmministrazioneAoo", "descrizioneAmministrazioneAoo" })
public class WSDMAmministrazioneAoo {

  private String codiceAmministrazioneAoo;
  private String descrizioneAmministrazioneAoo;

  public String getCodiceAmministrazioneAoo() {
    return codiceAmministrazioneAoo;
  }

  public void setCodiceAmministrazioneAoo(String codiceAmministrazioneAoo) {
    this.codiceAmministrazioneAoo = codiceAmministrazioneAoo;
  }

  public String getDescrizioneAmministrazioneAoo() {
    return descrizioneAmministrazioneAoo;
  }

  public void setDescrizioneAmministrazioneAoo(String descrizioneAmministrazioneAoo) {
    this.descrizioneAmministrazioneAoo = descrizioneAmministrazioneAoo;
  }

}
