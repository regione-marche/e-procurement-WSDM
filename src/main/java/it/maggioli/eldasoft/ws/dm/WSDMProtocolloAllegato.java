package it.maggioli.eldasoft.ws.dm;

import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;

@XmlType(name = "WSDMProtocolloAllegatoType", propOrder = { "titolo", "tipo", "nome", "contenuto", "serial", "IDBase", "versione", "idAllegato", "urlDownload" })
public class WSDMProtocolloAllegato {

  private String titolo;
  private String tipo;
  private String nome;
  private byte[] contenuto;
  private Long   serial;
  private Long   IDBase;
  private Long   versione;
  private String idAllegato;
  private String urlDownload;

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

  public Long getSerial() {
    return serial;
  }

  public void setSerial(Long serial) {
    this.serial = serial;
  }

  public Long getIDBase() {
    return IDBase;
  }

  public void setIDBase(Long iDBase) {
    IDBase = iDBase;
  }

  public Long getVersione() {
    return versione;
  }

  public void setVersione(Long versione) {
    this.versione = versione;
  }

  
  public String getIdAllegato() {
    return idAllegato;
  }

  
  public void setIdAllegato(String idAllegato) {
    this.idAllegato = idAllegato;
  }

  
  public String getUrlDownload() {
    return urlDownload;
  }

  
  public void setUrlDownload(String urlDownload) {
    this.urlDownload = urlDownload;
  }

}
