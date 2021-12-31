package it.maggioli.eldasoft.ws.dm;

import javax.xml.bind.annotation.XmlType;

@XmlType(name = "WSDMLoginAttrType", propOrder = { "ruolo", "nome", "cognome", "codiceUO",
    "loginEngAttr", "loginTitAttr", "codiceAOO"})
public class WSDMLoginAttr {

  private String   ruolo;
  private String   nome;
  private String   cognome;
  private String   codiceUO;
  WSDMLoginEngAttr loginEngAttr;
  WSDMLoginTitAttr loginTitAttr;
  private String   codiceAOO;  

  public String getRuolo() {
    return ruolo;
  }

  public void setRuolo(String ruolo) {
    this.ruolo = ruolo;
  }

  public String getNome() {
    return nome;
  }

  public void setNome(String nome) {
    this.nome = nome;
  }

  public String getCognome() {
    return cognome;
  }

  public void setCognome(String cognome) {
    this.cognome = cognome;
  }

  public String getCodiceUO() {
    return codiceUO;
  }

  public void setCodiceUO(String codiceUO) {
    this.codiceUO = codiceUO;
  }

  public WSDMLoginEngAttr getLoginEngAttr() {
    return loginEngAttr;
  }

  public void setLoginEngAttr(WSDMLoginEngAttr loginEngAttr) {
    this.loginEngAttr = loginEngAttr;
  }

  public WSDMLoginTitAttr getLoginTitAttr() {
    return loginTitAttr;
  }

  public void setLoginTitAttr(WSDMLoginTitAttr loginTitAttr) {
    this.loginTitAttr = loginTitAttr;
  }

  public String getCodiceAOO() {
    return codiceAOO;
  }

  public void setCodiceAOO(String codiceAOO) {
    this.codiceAOO = codiceAOO;
  }

}
