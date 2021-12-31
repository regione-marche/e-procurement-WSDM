package it.maggioli.eldasoft.ws.dm;

import java.util.Date;

import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;

@XmlType(name = "WSDMProtocolloDocumentoInType", propOrder = { "classifica", "tipoDocumento", "data", "oggetto", "descrizione",
    "mittenteInterno", "mittenti", "destinatari", "inout", "allegati", "inserimentoInFascicolo", "fascicolo", "codiceRegistro",
    "tipoDocumentoPrincipaleOriginale", "idIndice", "idTitolazione", "idUnitaOperativaMittente", "idUnitaOperativaDestinataria",
    "inviaMail", "pubblicazioneDal", "pubblicazioneAl", "mittenteEsterno", "destinatarioPrincipale", "societa", "mezzo", "codiceGaraLotto",
    "cig", "idDocumento", "livelloRiservatezza", "dataFineRiservatezza", "supporto", "struttura", "numeroAllegati", "noteAllegati",
    "dataArrivo", "protocolloMittente", "channelCode", "tipoAssegnazione", "primoMittenteComuneResidenza", "classificaDescrizione", "voce",
    "genericS11", "genericS12", "genericS13", "genericS14", "genericS15", "genericS21", "genericS22", "genericS23", "genericS24",
    "genericS25", "genericS31", "genericS32", "genericS33", "genericS34", "genericS35", "genericS41", "genericS42", "genericS43",
    "genericS44", "genericS45", "genericD11", "genericD12", "genericD13", "genericD14", "genericD15", "genericD21", "genericD22",
    "genericD23", "genericD24", "genericD25", "genericD31", "genericD32", "genericD33", "genericD34", "genericD35", "genericD41",
    "genericD42", "genericD43", "genericD44", "genericD45", "genericL11", "genericL12", "genericL13", "genericL14", "genericL15",
    "genericL21", "genericL22", "genericL23", "genericL24", "genericL25", "genericL31", "genericL32", "genericL33", "genericL34",
    "genericL35", "genericL41", "genericL42", "genericL43", "genericL44", "genericL45" })
public class WSDMProtocolloDocumentoIn {

  private String                               classifica;

  private String                               tipoDocumento;
  private Date                                 data;
  private String                               oggetto;
  private String                               descrizione;
  private String                               mittenteInterno;
  private WSDMProtocolloAnagrafica[]           mittenti;
  private WSDMProtocolloAnagrafica[]           destinatari;
  private WSDMProtocolloInOut                  inout;
  private WSDMProtocolloAllegato[]             allegati;
  private WSDMInserimentoInFascicolo           inserimentoInFascicolo;
  private WSDMFascicolo                        fascicolo;
  private String                               codiceRegistro;
  private WSDMTipoDocumentoPrincipaleOriginale tipoDocumentoPrincipaleOriginale;
  private String                               idIndice;
  private String                               idTitolazione;
  private String                               idUnitaOperativaMittente;
  private String                               idUnitaOperativaDestinataria;
  private WSDMInviaMail                        inviaMail;
  private Date                                 pubblicazioneDal;
  private Date                                 pubblicazioneAl;

  private String                               mittenteEsterno;
  private String                               destinatarioPrincipale;
  private String                               societa;
  private String                               mezzo;
  private String                               codiceGaraLotto;
  private String                               cig;

  private String                               idDocumento;

  private String                               livelloRiservatezza;
  private Date                                 dataFineRiservatezza;

  private String                               supporto;
  private String                               struttura;
  private Long                                 numeroAllegati;
  private String                               noteAllegati;

  private Date                                 dataArrivo;
  private String                               protocolloMittente;
  private String                               channelCode;

  private String                               tipoAssegnazione;
  private String                               primoMittenteComuneResidenza;

  private String                               classificaDescrizione;
  private String                               voce;

  private String                               genericS11;
  private String                               genericS12;
  private String                               genericS13;
  private String                               genericS14;
  private String                               genericS15;
  private String                               genericS21;
  private String                               genericS22;
  private String                               genericS23;
  private String                               genericS24;
  private String                               genericS25;
  private String                               genericS31;
  private String                               genericS32;
  private String                               genericS33;
  private String                               genericS34;
  private String                               genericS35;
  private String                               genericS41;
  private String                               genericS42;
  private String                               genericS43;
  private String                               genericS44;
  private String                               genericS45;

  private Date                                 genericD11;
  private Date                                 genericD12;
  private Date                                 genericD13;
  private Date                                 genericD14;
  private Date                                 genericD15;
  private Date                                 genericD21;
  private Date                                 genericD22;
  private Date                                 genericD23;
  private Date                                 genericD24;
  private Date                                 genericD25;
  private Date                                 genericD31;
  private Date                                 genericD32;
  private Date                                 genericD33;
  private Date                                 genericD34;
  private Date                                 genericD35;
  private Date                                 genericD41;
  private Date                                 genericD42;
  private Date                                 genericD43;
  private Date                                 genericD44;
  private Date                                 genericD45;

  private Long                                 genericL11;
  private Long                                 genericL12;
  private Long                                 genericL13;
  private Long                                 genericL14;
  private Long                                 genericL15;
  private Long                                 genericL21;
  private Long                                 genericL22;
  private Long                                 genericL23;
  private Long                                 genericL24;
  private Long                                 genericL25;
  private Long                                 genericL31;
  private Long                                 genericL32;
  private Long                                 genericL33;
  private Long                                 genericL34;
  private Long                                 genericL35;
  private Long                                 genericL41;
  private Long                                 genericL42;
  private Long                                 genericL43;
  private Long                                 genericL44;
  private Long                                 genericL45;

  public void setChannelCode(String channelCode) {
    this.channelCode = channelCode;
  }

  public String getChannelCode() {
    return channelCode;
  }

  public String getClassifica() {
    return classifica;
  }

  public void setClassifica(String classifica) {
    this.classifica = classifica;
  }

  public Date getData() {
    return data;
  }

  public void setData(Date data) {
    this.data = data;
  }

  @XmlElement(required = true)
  public String getOggetto() {
    return oggetto;
  }

  public void setOggetto(String oggetto) {
    this.oggetto = oggetto;
  }

  public String getDescrizione() {
    return descrizione;
  }

  public void setDescrizione(String descrizione) {
    this.descrizione = descrizione;
  }

  public String getMittenteInterno() {
    return mittenteInterno;
  }

  public void setMittenteInterno(String mittenteInterno) {
    this.mittenteInterno = mittenteInterno;
  }

  public WSDMProtocolloAnagrafica[] getMittenti() {
    return mittenti;
  }

  public void setMittenti(WSDMProtocolloAnagrafica[] mittenti) {
    this.mittenti = mittenti;
  }

  public WSDMProtocolloAnagrafica[] getDestinatari() {
    return destinatari;
  }

  public void setDestinatari(WSDMProtocolloAnagrafica[] destinatari) {
    this.destinatari = destinatari;
  }

  @XmlElement(required = true)
  public WSDMProtocolloInOut getInout() {
    return inout;
  }

  public void setInout(WSDMProtocolloInOut inout) {
    this.inout = inout;
  }

  public WSDMProtocolloAllegato[] getAllegati() {
    return allegati;
  }

  public void setAllegati(WSDMProtocolloAllegato[] allegati) {
    this.allegati = allegati;
  }

  public String getTipoDocumento() {
    return tipoDocumento;
  }

  public void setTipoDocumento(String tipoDocumento) {
    this.tipoDocumento = tipoDocumento;
  }

  public WSDMInserimentoInFascicolo getInserimentoInFascicolo() {
    return inserimentoInFascicolo;
  }

  public void setInserimentoInFascicolo(WSDMInserimentoInFascicolo inserimentoInFascicolo) {
    this.inserimentoInFascicolo = inserimentoInFascicolo;
  }

  public String getCodiceRegistro() {
    return codiceRegistro;
  }

  public void setCodiceRegistro(String codiceRegistro) {
    this.codiceRegistro = codiceRegistro;
  }

  public WSDMFascicolo getFascicolo() {
    return fascicolo;
  }

  public void setFascicolo(WSDMFascicolo fascicolo) {
    this.fascicolo = fascicolo;
  }

  public WSDMTipoDocumentoPrincipaleOriginale getTipoDocumentoPrincipaleOriginale() {
    return tipoDocumentoPrincipaleOriginale;
  }

  public void setTipoDocumentoPrincipaleOriginale(WSDMTipoDocumentoPrincipaleOriginale tipoDocumentoPrincipaleOriginale) {
    this.tipoDocumentoPrincipaleOriginale = tipoDocumentoPrincipaleOriginale;
  }

  public String getIdIndice() {
    return idIndice;
  }

  public void setIdIndice(String idIndice) {
    this.idIndice = idIndice;
  }

  public String getIdTitolazione() {
    return idTitolazione;
  }

  public void setIdTitolazione(String idTitolazione) {
    this.idTitolazione = idTitolazione;
  }

  public String getIdUnitaOperativaMittente() {
    return idUnitaOperativaMittente;
  }

  public void setIdUnitaOperativaMittente(String idUnitaOperativaMittente) {
    this.idUnitaOperativaMittente = idUnitaOperativaMittente;
  }

  public String getIdUnitaOperativaDestinataria() {
    return idUnitaOperativaDestinataria;
  }

  public void setIdUnitaOperativaDestinataria(String idUnitaOperativaDestinataria) {
    this.idUnitaOperativaDestinataria = idUnitaOperativaDestinataria;
  }

  public WSDMInviaMail getInviaMail() {
    return inviaMail;
  }

  public void setInviaMail(WSDMInviaMail inviaMail) {
    this.inviaMail = inviaMail;
  }

  public Date getPubblicazioneDal() {
    return pubblicazioneDal;
  }

  public void setPubblicazioneDal(Date pubblicazioneDal) {
    this.pubblicazioneDal = pubblicazioneDal;
  }

  public Date getPubblicazioneAl() {
    return pubblicazioneAl;
  }

  public void setPubblicazioneAl(Date pubblicazioneAl) {
    this.pubblicazioneAl = pubblicazioneAl;
  }

  public String getMittenteEsterno() {
    return mittenteEsterno;
  }

  public void setMittenteEsterno(String mittenteEsterno) {
    this.mittenteEsterno = mittenteEsterno;
  }

  public String getDestinatarioPrincipale() {
    return destinatarioPrincipale;
  }

  public void setDestinatarioPrincipale(String destinatarioPrincipale) {
    this.destinatarioPrincipale = destinatarioPrincipale;
  }

  public String getSocieta() {
    return societa;
  }

  public void setSocieta(String societa) {
    this.societa = societa;
  }

  public String getCodiceGaraLotto() {
    return codiceGaraLotto;
  }

  public void setCodiceGaraLotto(String codiceGaraLotto) {
    this.codiceGaraLotto = codiceGaraLotto;
  }

  public String getCig() {
    return cig;
  }

  public void setCig(String cig) {
    this.cig = cig;
  }

  public String getIdDocumento() {
    return idDocumento;
  }

  public void setIdDocumento(String idDocumento) {
    this.idDocumento = idDocumento;
  }

  public String getMezzo() {
    return mezzo;
  }

  public void setMezzo(String mezzo) {
    this.mezzo = mezzo;
  }

  public String getLivelloRiservatezza() {
    return livelloRiservatezza;
  }

  public void setLivelloRiservatezza(String livelloRiservatezza) {
    this.livelloRiservatezza = livelloRiservatezza;
  }

  public Date getDataFineRiservatezza() {
    return dataFineRiservatezza;
  }

  public void setDataFineRiservatezza(Date dataFineRiservatezza) {
    this.dataFineRiservatezza = dataFineRiservatezza;
  }

  public String getSupporto() {
    return supporto;
  }

  public void setSupporto(String supporto) {
    this.supporto = supporto;
  }

  public String getStruttura() {
    return struttura;
  }

  public void setStruttura(String struttura) {
    this.struttura = struttura;
  }

  public String getNoteAllegati() {
    return noteAllegati;
  }

  public void setNoteAllegati(String noteAllegati) {
    this.noteAllegati = noteAllegati;
  }

  public Date getDataArrivo() {
    return dataArrivo;
  }

  public void setDataArrivo(Date dataArrivo) {
    this.dataArrivo = dataArrivo;
  }

  public String getProtocolloMittente() {
    return protocolloMittente;
  }

  public void setProtocolloMittente(String protocolloMittente) {
    this.protocolloMittente = protocolloMittente;
  }

  public Long getNumeroAllegati() {
    return numeroAllegati;
  }

  public void setNumeroAllegati(Long numeroAllegati) {
    this.numeroAllegati = numeroAllegati;
  }

  public String getTipoAssegnazione() {
    return tipoAssegnazione;
  }

  public void setTipoAssegnazione(String tipoAssegnazione) {
    this.tipoAssegnazione = tipoAssegnazione;
  }

  public String getPrimoMittenteComuneResidenza() {
    return primoMittenteComuneResidenza;
  }

  public void setPrimoMittenteComuneResidenza(String primoMittenteComuneResidenza) {
    this.primoMittenteComuneResidenza = primoMittenteComuneResidenza;
  }

  public String getClassificaDescrizione() {
    return classificaDescrizione;
  }

  public void setClassificaDescrizione(String classificaDescrizione) {
    this.classificaDescrizione = classificaDescrizione;
  }

  public String getVoce() {
    return voce;
  }

  public void setVoce(String voce) {
    this.voce = voce;
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

  
  public String getGenericS21() {
    return genericS21;
  }

  
  public void setGenericS21(String genericS21) {
    this.genericS21 = genericS21;
  }

  
  public String getGenericS22() {
    return genericS22;
  }

  
  public void setGenericS22(String genericS22) {
    this.genericS22 = genericS22;
  }

  
  public String getGenericS23() {
    return genericS23;
  }

  
  public void setGenericS23(String genericS23) {
    this.genericS23 = genericS23;
  }

  
  public String getGenericS24() {
    return genericS24;
  }

  
  public void setGenericS24(String genericS24) {
    this.genericS24 = genericS24;
  }

  
  public String getGenericS25() {
    return genericS25;
  }

  
  public void setGenericS25(String genericS25) {
    this.genericS25 = genericS25;
  }

  
  public String getGenericS31() {
    return genericS31;
  }

  
  public void setGenericS31(String genericS31) {
    this.genericS31 = genericS31;
  }

  
  public String getGenericS32() {
    return genericS32;
  }

  
  public void setGenericS32(String genericS32) {
    this.genericS32 = genericS32;
  }

  
  public String getGenericS33() {
    return genericS33;
  }

  
  public void setGenericS33(String genericS33) {
    this.genericS33 = genericS33;
  }

  
  public String getGenericS34() {
    return genericS34;
  }

  
  public void setGenericS34(String genericS34) {
    this.genericS34 = genericS34;
  }

  
  public String getGenericS35() {
    return genericS35;
  }

  
  public void setGenericS35(String genericS35) {
    this.genericS35 = genericS35;
  }

  
  public String getGenericS41() {
    return genericS41;
  }

  
  public void setGenericS41(String genericS41) {
    this.genericS41 = genericS41;
  }

  
  public String getGenericS42() {
    return genericS42;
  }

  
  public void setGenericS42(String genericS42) {
    this.genericS42 = genericS42;
  }

  
  public String getGenericS43() {
    return genericS43;
  }

  
  public void setGenericS43(String genericS43) {
    this.genericS43 = genericS43;
  }

  
  public String getGenericS44() {
    return genericS44;
  }

  
  public void setGenericS44(String genericS44) {
    this.genericS44 = genericS44;
  }

  
  public String getGenericS45() {
    return genericS45;
  }

  
  public void setGenericS45(String genericS45) {
    this.genericS45 = genericS45;
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

  
  public Date getGenericD21() {
    return genericD21;
  }

  
  public void setGenericD21(Date genericD21) {
    this.genericD21 = genericD21;
  }

  
  public Date getGenericD22() {
    return genericD22;
  }

  
  public void setGenericD22(Date genericD22) {
    this.genericD22 = genericD22;
  }

  
  public Date getGenericD23() {
    return genericD23;
  }

  
  public void setGenericD23(Date genericD23) {
    this.genericD23 = genericD23;
  }

  
  public Date getGenericD24() {
    return genericD24;
  }

  
  public void setGenericD24(Date genericD24) {
    this.genericD24 = genericD24;
  }

  
  public Date getGenericD25() {
    return genericD25;
  }

  
  public void setGenericD25(Date genericD25) {
    this.genericD25 = genericD25;
  }

  
  public Date getGenericD31() {
    return genericD31;
  }

  
  public void setGenericD31(Date genericD31) {
    this.genericD31 = genericD31;
  }

  
  public Date getGenericD32() {
    return genericD32;
  }

  
  public void setGenericD32(Date genericD32) {
    this.genericD32 = genericD32;
  }

  
  public Date getGenericD33() {
    return genericD33;
  }

  
  public void setGenericD33(Date genericD33) {
    this.genericD33 = genericD33;
  }

  
  public Date getGenericD34() {
    return genericD34;
  }

  
  public void setGenericD34(Date genericD34) {
    this.genericD34 = genericD34;
  }

  
  public Date getGenericD35() {
    return genericD35;
  }

  
  public void setGenericD35(Date genericD35) {
    this.genericD35 = genericD35;
  }

  
  public Date getGenericD41() {
    return genericD41;
  }

  
  public void setGenericD41(Date genericD41) {
    this.genericD41 = genericD41;
  }

  
  public Date getGenericD42() {
    return genericD42;
  }

  
  public void setGenericD42(Date genericD42) {
    this.genericD42 = genericD42;
  }

  
  public Date getGenericD43() {
    return genericD43;
  }

  
  public void setGenericD43(Date genericD43) {
    this.genericD43 = genericD43;
  }

  
  public Date getGenericD44() {
    return genericD44;
  }

  
  public void setGenericD44(Date genericD44) {
    this.genericD44 = genericD44;
  }

  
  public Date getGenericD45() {
    return genericD45;
  }

  
  public void setGenericD45(Date genericD45) {
    this.genericD45 = genericD45;
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

  
  public Long getGenericL21() {
    return genericL21;
  }

  
  public void setGenericL21(Long genericL21) {
    this.genericL21 = genericL21;
  }

  
  public Long getGenericL22() {
    return genericL22;
  }

  
  public void setGenericL22(Long genericL22) {
    this.genericL22 = genericL22;
  }

  
  public Long getGenericL23() {
    return genericL23;
  }

  
  public void setGenericL23(Long genericL23) {
    this.genericL23 = genericL23;
  }

  
  public Long getGenericL24() {
    return genericL24;
  }

  
  public void setGenericL24(Long genericL24) {
    this.genericL24 = genericL24;
  }

  
  public Long getGenericL25() {
    return genericL25;
  }

  
  public void setGenericL25(Long genericL25) {
    this.genericL25 = genericL25;
  }

  
  public Long getGenericL31() {
    return genericL31;
  }

  
  public void setGenericL31(Long genericL31) {
    this.genericL31 = genericL31;
  }

  
  public Long getGenericL32() {
    return genericL32;
  }

  
  public void setGenericL32(Long genericL32) {
    this.genericL32 = genericL32;
  }

  
  public Long getGenericL33() {
    return genericL33;
  }

  
  public void setGenericL33(Long genericL33) {
    this.genericL33 = genericL33;
  }

  
  public Long getGenericL34() {
    return genericL34;
  }

  
  public void setGenericL34(Long genericL34) {
    this.genericL34 = genericL34;
  }

  
  public Long getGenericL35() {
    return genericL35;
  }

  
  public void setGenericL35(Long genericL35) {
    this.genericL35 = genericL35;
  }

  
  public Long getGenericL41() {
    return genericL41;
  }

  
  public void setGenericL41(Long genericL41) {
    this.genericL41 = genericL41;
  }

  
  public Long getGenericL42() {
    return genericL42;
  }

  
  public void setGenericL42(Long genericL42) {
    this.genericL42 = genericL42;
  }

  
  public Long getGenericL43() {
    return genericL43;
  }

  
  public void setGenericL43(Long genericL43) {
    this.genericL43 = genericL43;
  }

  
  public Long getGenericL44() {
    return genericL44;
  }

  
  public void setGenericL44(Long genericL44) {
    this.genericL44 = genericL44;
  }

  
  public Long getGenericL45() {
    return genericL45;
  }

  
  public void setGenericL45(Long genericL45) {
    this.genericL45 = genericL45;
  }

}
