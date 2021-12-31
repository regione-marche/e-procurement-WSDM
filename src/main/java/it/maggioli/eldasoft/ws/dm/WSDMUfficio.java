package it.maggioli.eldasoft.ws.dm;

import javax.xml.bind.annotation.XmlType;

@XmlType(name = "WSDMUfficioType", propOrder = { "codiceUfficio", "descrizioneUfficio" })
public class WSDMUfficio {

  private String codiceUfficio;
  private String descrizioneUfficio;
  
  public String getCodiceUfficio() {
    return codiceUfficio;
  }
  
  public void setCodiceUfficio(String codiceUfficio) {
    this.codiceUfficio = codiceUfficio;
  }
  
  public String getDescrizioneUfficio() {
    return descrizioneUfficio;
  }
  
  public void setDescrizioneUfficio(String descrizioneUfficio) {
    this.descrizioneUfficio = descrizioneUfficio;
  }


}
