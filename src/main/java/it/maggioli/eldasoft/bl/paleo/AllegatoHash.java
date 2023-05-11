package it.maggioli.eldasoft.bl.paleo;

import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;

@XmlType(name = "AllegatoHashType", propOrder = { "titolo", "tipo", "nome", "contenuto", "hash" })
public class AllegatoHash {

  private String titolo;
  private String tipo;
  private String nome;
  private byte[] contenuto;
  private String hash;

  @XmlElement(required = true)
  public String getTitolo() {
    return titolo;
  }

  public void setTitolo(String titolo) {
    this.titolo = titolo;
  }

  @XmlElement(required = true)
  public String getTipo() {
    return tipo;
  }

  public void setTipo(String tipo) {
    this.tipo = tipo;
  }

  @XmlElement(required = true)
  public String getNome() {
    return nome;
  }

  public void setNome(String nome) {
    this.nome = nome;
  }

  @XmlElement(required = true)
  public byte[] getContenuto() {
    return contenuto;
  }

  public void setContenuto(byte[] contenuto) {
    this.contenuto = contenuto;
  }

  public String getHash() {
    return hash;
  }

  public void setHash(String hash) {
    this.hash = hash;
  }

}
