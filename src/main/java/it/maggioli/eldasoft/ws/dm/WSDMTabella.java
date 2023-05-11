package it.maggioli.eldasoft.ws.dm;

import javax.xml.bind.annotation.XmlType;

@XmlType(name = "WSDMTabellaType", propOrder = { "nome", "riga" })
public class WSDMTabella {

  private String     nome;
  private WSDMRiga[] riga;

  public String getNome() {
    return nome;
  }

  public void setNome(String nome) {
    this.nome = nome;
  }

  public WSDMRiga[] getRiga() {
    return riga;
  }

  public void setRiga(WSDMRiga[] riga) {
    this.riga = riga;
  }

}
