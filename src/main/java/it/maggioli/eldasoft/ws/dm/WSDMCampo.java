package it.maggioli.eldasoft.ws.dm;

import javax.xml.bind.annotation.XmlType;

@XmlType(name = "WSDMCampoType", propOrder = { "nome", "tipo", "valore" })
public class WSDMCampo {

  private String nome;
  private String tipo;
  private String valore;
  
  public String getNome() {
    return nome;
  }
  
  public void setNome(String nome) {
    this.nome = nome;
  }
  
  public String getTipo() {
    return tipo;
  }
  
  public void setTipo(String tipo) {
    this.tipo = tipo;
  }
  
  public String getValore() {
    return valore;
  }
  
  public void setValore(String valore) {
    this.valore = valore;
  }



}
