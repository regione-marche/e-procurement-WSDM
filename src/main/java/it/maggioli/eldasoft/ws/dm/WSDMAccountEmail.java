package it.maggioli.eldasoft.ws.dm;

import javax.xml.bind.annotation.XmlType;

@XmlType(name = "WSDMAccountEmailType", propOrder = { "tipo", "des", "emailAddress" })
public class WSDMAccountEmail {

  private String tipo;
  private String des;
  private String emailAddress;
  
  public String getTipo() {
    return tipo;
  }
  
  public void setTipo(String tipo) {
    this.tipo = tipo;
  }
  
  public String getDes() {
    return des;
  }
  
  public void setDes(String des) {
    this.des = des;
  }
  
  public String getEmailAddress() {
    return emailAddress;
  }
  
  public void setEmailAddress(String emailAddress) {
    this.emailAddress = emailAddress;
  }
  



}
