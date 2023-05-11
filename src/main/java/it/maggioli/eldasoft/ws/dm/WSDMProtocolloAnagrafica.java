package it.maggioli.eldasoft.ws.dm;

import java.util.Date;

import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;

@XmlType(name = "WSDMProtocolloAnagraficaType", propOrder = { "cognomeointestazione", "nome", "codiceFiscale", "indirizzoResidenza",
    "localitaResidenza", "comuneResidenza", "codiceComuneResidenza", "dataNascita", "comuneNascita", "codiceComuneNascita", "nazionalita",
    "email", "istatComune", "tipoVoceRubrica", "mezzo", "partitaIVA", "emailAggiuntiva", "provinciaResidenza", "capResidenza", "telefono",
    "fax", "nazionalitaISO3166", "numeroCivicoResidenza" })
public class WSDMProtocolloAnagrafica {

  private String              cognomeointestazione;
  private String              nome;
  private String              codiceFiscale;
  private String              indirizzoResidenza;
  private String              localitaResidenza;
  private String              comuneResidenza;
  private String              codiceComuneResidenza;
  private Date                dataNascita;
  private String              comuneNascita;
  private String              codiceComuneNascita;
  private String              nazionalita;
  private String              email;
  private String              emailAggiuntiva;
  private String              istatComune;
  private WSDMTipoVoceRubrica tipoVoceRubrica;
  private String              mezzo;
  private String              partitaIVA;
  private String              provinciaResidenza;
  private String              capResidenza;
  private String              telefono;
  private String              fax;
  private String              nazionalitaISO3166;

  private String              numeroCivicoResidenza;

  @XmlElement(required = true)
  public String getCognomeointestazione() {
    return cognomeointestazione;
  }

  public void setCognomeointestazione(String cognomeointestazione) {
    this.cognomeointestazione = cognomeointestazione;
  }

  public String getNome() {
    return nome;
  }

  public void setNome(String nome) {
    this.nome = nome;
  }

  public String getPartitaIVA() {
    return partitaIVA;
  }

  public void setPartitaIVA(String partitaIVA) {
    this.partitaIVA = partitaIVA;
  }

  @XmlElement(required = true)
  public String getCodiceFiscale() {
    return codiceFiscale;
  }

  public void setCodiceFiscale(String codiceFiscale) {
    this.codiceFiscale = codiceFiscale;
  }

  public String getIndirizzoResidenza() {
    return indirizzoResidenza;
  }

  public void setIndirizzoResidenza(String indirizzoResidenza) {
    this.indirizzoResidenza = indirizzoResidenza;
  }

  public String getLocalitaResidenza() {
    return localitaResidenza;
  }

  public void setLocalitaResidenza(String localitaResidenza) {
    this.localitaResidenza = localitaResidenza;
  }

  public String getComuneResidenza() {
    return comuneResidenza;
  }

  public void setComuneResidenza(String comuneResidenza) {
    this.comuneResidenza = comuneResidenza;
  }

  public String getCodiceComuneResidenza() {
    return codiceComuneResidenza;
  }

  public void setCodiceComuneResidenza(String codiceComuneResidenza) {
    this.codiceComuneResidenza = codiceComuneResidenza;
  }

  public Date getDataNascita() {
    return dataNascita;
  }

  public void setDataNascita(Date dataNascita) {
    this.dataNascita = dataNascita;
  }

  public String getComuneNascita() {
    return comuneNascita;
  }

  public void setComuneNascita(String comuneNascita) {
    this.comuneNascita = comuneNascita;
  }

  public String getCodiceComuneNascita() {
    return codiceComuneNascita;
  }

  public void setCodiceComuneNascita(String codiceComuneNascita) {
    this.codiceComuneNascita = codiceComuneNascita;
  }

  public String getNazionalita() {
    return nazionalita;
  }

  public void setNazionalita(String nazionalita) {
    this.nazionalita = nazionalita;
  }

  public String getEmail() {
    return email;
  }

  public void setEmail(String email) {
    this.email = email;
  }

  public String getIstatComune() {
    return istatComune;
  }

  public void setIstatComune(String istatComune) {
    this.istatComune = istatComune;
  }

  public WSDMTipoVoceRubrica getTipoVoceRubrica() {
    return tipoVoceRubrica;
  }

  public void setTipoVoceRubrica(WSDMTipoVoceRubrica tipoVoceRubrica) {
    this.tipoVoceRubrica = tipoVoceRubrica;
  }

  public String getMezzo() {
    return mezzo;
  }

  public void setMezzo(String mezzo) {
    this.mezzo = mezzo;
  }

  public String getEmailAggiuntiva() {
    return emailAggiuntiva;
  }

  public void setEmailAggiuntiva(String emailAggiuntiva) {
    this.emailAggiuntiva = emailAggiuntiva;
  }

  public String getProvinciaResidenza() {
    return provinciaResidenza;
  }

  public void setProvinciaResidenza(String provinciaResidenza) {
    this.provinciaResidenza = provinciaResidenza;
  }

  public String getCapResidenza() {
    return capResidenza;
  }

  public void setCapResidenza(String capResidenza) {
    this.capResidenza = capResidenza;
  }

  public String getTelefono() {
    return telefono;
  }

  public void setTelefono(String telefono) {
    this.telefono = telefono;
  }

  public String getFax() {
    return fax;
  }

  public void setFax(String fax) {
    this.fax = fax;
  }

  public String getNazionalitaISO3166() {
    return nazionalitaISO3166;
  }

  public void setNazionalitaISO3166(String nazionalitaISO3166) {
    this.nazionalitaISO3166 = nazionalitaISO3166;
  }

  public String getNumeroCivicoResidenza() {
    return numeroCivicoResidenza;
  }

  public void setNumeroCivicoResidenza(String numeroCivicoResidenza) {
    this.numeroCivicoResidenza = numeroCivicoResidenza;
  }

}
