package it.maggioli.eldasoft.ws.dm;

import javax.xml.bind.annotation.XmlType;

@XmlType(name = "WSDMOperatoreType", propOrder = { "ruolo", "nome", "cognome", "codiceUO"})
public class WSDMOperatore {

  private String   ruolo;
  private String   nome;
  private String   cognome;
  private String   codiceUO;

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

}
