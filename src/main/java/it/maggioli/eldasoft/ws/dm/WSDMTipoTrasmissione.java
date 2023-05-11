package it.maggioli.eldasoft.ws.dm;

import javax.xml.bind.annotation.XmlType;

@XmlType(name = "WSDMTipoTrasmissioneType", propOrder = { "nome", "descrizione", "codice", "tipoDestinatario" })
public class WSDMTipoTrasmissione {

  private String nome;
  private String descrizione;
  private String codice;
  private String tipoDestinatario;

  public String getNome() {
    return nome;
  }

  public void setNome(String nome) {
    this.nome = nome;
  }

  public String getDescrizione() {
    return descrizione;
  }

  public void setDescrizione(String descrizione) {
    this.descrizione = descrizione;
  }

  public String getCodice() {
    return codice;
  }

  public void setCodice(String codice) {
    this.codice = codice;
  }

  public String getTipoDestinatario() {
    return tipoDestinatario;
  }

  public void setTipoDestinatario(String tipoDestinatario) {
    this.tipoDestinatario = tipoDestinatario;
  }

}
