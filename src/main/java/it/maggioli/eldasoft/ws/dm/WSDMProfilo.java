package it.maggioli.eldasoft.ws.dm;

import javax.xml.bind.annotation.XmlType;

@XmlType(name = "WSDMProfiloType", propOrder = { "numeroProfilo", "nomeProfilo", "descrizioneUfficio", "codiceUfficio", "codiceSede" })
public class WSDMProfilo {

  private String numeroProfilo;
  private String nomeProfilo;
  private String descrizioneUfficio;
  private String codiceUfficio;
  private String codiceSede;
  
  public String getNumeroProfilo() {
    return numeroProfilo;
  }
  
  public void setNumeroProfilo(String numeroProfilo) {
    this.numeroProfilo = numeroProfilo;
  }
  
  public String getNomeProfilo() {
    return nomeProfilo;
  }
  
  public void setNomeProfilo(String nomeProfilo) {
    this.nomeProfilo = nomeProfilo;
  }
  
  public String getDescrizioneUfficio() {
    return descrizioneUfficio;
  }
  
  public void setDescrizioneUfficio(String descrizioneUfficio) {
    this.descrizioneUfficio = descrizioneUfficio;
  }
  
  public String getCodiceUfficio() {
    return codiceUfficio;
  }
  
  public void setCodiceUfficio(String codiceUfficio) {
    this.codiceUfficio = codiceUfficio;
  }
  
  public String getCodiceSede() {
    return codiceSede;
  }
  
  public void setCodiceSede(String codiceSede) {
    this.codiceSede = codiceSede;
  }
  
  
  


}
