package it.maggioli.eldasoft.ws.dm;

import java.util.Date;

import javax.xml.bind.annotation.XmlType;

@XmlType(name = "WSDMFascicoloInType", propOrder = { "oggettoFascicolo", "classificaFascicolo", "descrizioneFascicolo", "struttura",
    "tipo", "genericS11", "genericS12", "genericS13", "genericS14", "genericS15", "genericD11", "genericD12", "genericD13", "genericD14",
    "genericD15", "genericL11", "genericL12", "genericL13", "genericL14", "genericL15" })
public class WSDMFascicoloIn {

  private String oggettoFascicolo;
  private String classificaFascicolo;
  private String descrizioneFascicolo;
  private String struttura;
  private String tipo;

  private String genericS11;
  private String genericS12;
  private String genericS13;
  private String genericS14;
  private String genericS15;

  private Date   genericD11;
  private Date   genericD12;
  private Date   genericD13;
  private Date   genericD14;
  private Date   genericD15;

  private Long   genericL11;
  private Long   genericL12;
  private Long   genericL13;
  private Long   genericL14;
  private Long   genericL15;

  public String getOggettoFascicolo() {
    return oggettoFascicolo;
  }

  public void setOggettoFascicolo(String oggettoFascicolo) {
    this.oggettoFascicolo = oggettoFascicolo;
  }

  public String getClassificaFascicolo() {
    return classificaFascicolo;
  }

  public void setClassificaFascicolo(String classificaFascicolo) {
    this.classificaFascicolo = classificaFascicolo;
  }

  public String getDescrizioneFascicolo() {
    return descrizioneFascicolo;
  }

  public void setDescrizioneFascicolo(String descrizioneFascicolo) {
    this.descrizioneFascicolo = descrizioneFascicolo;
  }

  public String getStruttura() {
    return struttura;
  }

  public void setStruttura(String struttura) {
    this.struttura = struttura;
  }

  public String getTipo() {
    return tipo;
  }

  public void setTipo(String tipo) {
    this.tipo = tipo;
  }

  public String getGenericS11() {
    return genericS11;
  }

  public void setGenericS11(String genericS11) {
    this.genericS11 = genericS11;
  }

  public String getGenericS12() {
    return genericS12;
  }

  public void setGenericS12(String genericS12) {
    this.genericS12 = genericS12;
  }

  public String getGenericS13() {
    return genericS13;
  }

  public void setGenericS13(String genericS13) {
    this.genericS13 = genericS13;
  }

  public String getGenericS14() {
    return genericS14;
  }

  public void setGenericS14(String genericS14) {
    this.genericS14 = genericS14;
  }

  public String getGenericS15() {
    return genericS15;
  }

  public void setGenericS15(String genericS15) {
    this.genericS15 = genericS15;
  }

  public Date getGenericD11() {
    return genericD11;
  }

  public void setGenericD11(Date genericD11) {
    this.genericD11 = genericD11;
  }

  public Date getGenericD12() {
    return genericD12;
  }

  public void setGenericD12(Date genericD12) {
    this.genericD12 = genericD12;
  }

  public Date getGenericD13() {
    return genericD13;
  }

  public void setGenericD13(Date genericD13) {
    this.genericD13 = genericD13;
  }

  public Date getGenericD14() {
    return genericD14;
  }

  public void setGenericD14(Date genericD14) {
    this.genericD14 = genericD14;
  }

  public Date getGenericD15() {
    return genericD15;
  }

  public void setGenericD15(Date genericD15) {
    this.genericD15 = genericD15;
  }

  public Long getGenericL11() {
    return genericL11;
  }

  public void setGenericL11(Long genericL11) {
    this.genericL11 = genericL11;
  }

  public Long getGenericL12() {
    return genericL12;
  }

  public void setGenericL12(Long genericL12) {
    this.genericL12 = genericL12;
  }

  public Long getGenericL13() {
    return genericL13;
  }

  public void setGenericL13(Long genericL13) {
    this.genericL13 = genericL13;
  }

  public Long getGenericL14() {
    return genericL14;
  }

  public void setGenericL14(Long genericL14) {
    this.genericL14 = genericL14;
  }

  public Long getGenericL15() {
    return genericL15;
  }

  public void setGenericL15(Long genericL15) {
    this.genericL15 = genericL15;
  }

}
