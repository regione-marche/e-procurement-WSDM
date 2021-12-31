package it.maggioli.eldasoft.ws.dm;

import javax.xml.bind.annotation.XmlType;

@XmlType(name = "WSDMRicercaAccountEmailType", propOrder = { "tipo", "utilizzo", "contesto", "emailAddress", "userGroupName", "codiceUfficio" })
public class WSDMRicercaAccountEmail {

  private String tipo;
  private String utilizzo;
  private String contesto;
  private String emailAddress;
  private String userGroupName;
  private String codiceUfficio;
  
  public String getTipo() {
    return tipo;
  }
  
  public void setTipo(String tipo) {
    this.tipo = tipo;
  }
  
  public String getUtilizzo() {
    return utilizzo;
  }
  
  public void setUtilizzo(String utilizzo) {
    this.utilizzo = utilizzo;
  }
  
  public String getContesto() {
    return contesto;
  }
  
  public void setContesto(String contesto) {
    this.contesto = contesto;
  }
  
  public String getEmailAddress() {
    return emailAddress;
  }
  
  public void setEmailAddress(String emailAddress) {
    this.emailAddress = emailAddress;
  }
  
  public String getUserGroupName() {
    return userGroupName;
  }
  
  public void setUserGroupName(String userGroupName) {
    this.userGroupName = userGroupName;
  }
  
  public String getCodiceUfficio() {
    return codiceUfficio;
  }
  
  public void setCodiceUfficio(String codiceUfficio) {
    this.codiceUfficio = codiceUfficio;
  }

}
