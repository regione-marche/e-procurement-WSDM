package it.maggioli.eldasoft.ws.conf;

import javax.xml.bind.annotation.XmlType;

@XmlType(name = "WSDMTabellatoType", propOrder = { "nome", "elementi" })
public class WSDMTabellato {

  private String                  nome;
  private WSDMTabellatoElemento[] elementi;

  public String getNome() {
    return nome;
  }

  public void setNome(String nome) {
    this.nome = nome;
  }

  public WSDMTabellatoElemento[] getElementi() {
    return elementi;
  }

  public void setElementi(WSDMTabellatoElemento[] elementi) {
    this.elementi = elementi;
  }

}
