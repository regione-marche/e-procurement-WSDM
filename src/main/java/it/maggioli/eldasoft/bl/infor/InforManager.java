/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package it.maggioli.eldasoft.bl.infor;

import it.infor.JProtocolloGenServices.AllegaProtocolloFascicolo;
import it.infor.JProtocolloGenServices.AllegaProtocolloFascicoloResponse;
import it.infor.JProtocolloGenServices.DatiVisualizzazioneType;
import it.infor.JProtocolloGenServices.FascicoloDettaglioType;
import it.infor.JProtocolloGenServices.FascicoloRiferimentoType;
import it.infor.JProtocolloGenServices.GestioneFascicoli;
import it.infor.JProtocolloGenServices.GestioneFascicoliResponse;
import it.infor.JProtocolloGenServices.JProtocolloGenServices;
import it.infor.JProtocolloGenServices.JProtocolloGenServices_Service;
import it.infor.JProtocolloGenServices.ProtocolloRiferimentoType;
import it.infor.JProtocolloGenServices.RegistroType;
import it.infor.JProtocolloGenServices.RichiestaAllegaProtocolloFascicolo;
import it.infor.JProtocolloGenServices.RichiestaGestioneFascicoli;
import it.infor.JProtocolloGenServices.RispostaAllegaProtocolloFascicolo;
import it.infor.JProtocolloGenServices.RispostaGestioneFascicoli;
import it.infor.JProtocolloGenServices.TitolarioType;
import it.infor.JProtocolloServices.AllegaDocumento;
import it.infor.JProtocolloServices.AllegaDocumentoResponse;
import it.infor.JProtocolloServices.Corrispondente;
import it.infor.JProtocolloServices.Documento;
import it.infor.JProtocolloServices.InserisciArrivo;
import it.infor.JProtocolloServices.InserisciArrivoResponse;
import it.infor.JProtocolloServices.InserisciInterno;
import it.infor.JProtocolloServices.InserisciInternoResponse;
import it.infor.JProtocolloServices.InserisciPartenza;
import it.infor.JProtocolloServices.InserisciPartenzaResponse;
import it.infor.JProtocolloServices.JProtocolloServices;
import it.infor.JProtocolloServices.JProtocolloServicesService;
import it.infor.JProtocolloServices.ProtocollaArrivo;
import it.infor.JProtocolloServices.ProtocollaInterno;
import it.infor.JProtocolloServices.ProtocollaPartenza;
import it.infor.JProtocolloServices.Registro;
import it.infor.JProtocolloServices.Riferimento;
import it.infor.JProtocolloServices.Segnatura;
import it.infor.JProtocolloServices.Smistamenti;
import it.infor.JProtocolloServices.Smistamento;
import it.infor.JProtocolloServices.Soggetti;
import it.infor.JProtocolloServices.Soggetto;
import it.maggioli.eldasoft.bl.IWSDMManager;
import it.maggioli.eldasoft.ws.dm.WSDMAggiungiAllegatiIn;
import it.maggioli.eldasoft.ws.dm.WSDMAggiungiAllegatiRes;
import it.maggioli.eldasoft.ws.dm.WSDMAnagraficaLeggiRes;
import it.maggioli.eldasoft.ws.dm.WSDMAttoContrattoRes;
import it.maggioli.eldasoft.ws.dm.WSDMDocumentoCollegaRes;
import it.maggioli.eldasoft.ws.dm.WSDMFascicolo;
import it.maggioli.eldasoft.ws.dm.WSDMFascicoloIn;
import it.maggioli.eldasoft.ws.dm.WSDMFascicoloModificaIn;
import it.maggioli.eldasoft.ws.dm.WSDMFascicoloModificaRes;
import it.maggioli.eldasoft.ws.dm.WSDMFascicoloRes;
import it.maggioli.eldasoft.ws.dm.WSDMInserimentoInFascicolo;
import it.maggioli.eldasoft.ws.dm.WSDMInviaMail;
import it.maggioli.eldasoft.ws.dm.WSDMInviaMailRes;
import it.maggioli.eldasoft.ws.dm.WSDMListaAccountEmailRes;
import it.maggioli.eldasoft.ws.dm.WSDMListaAmministrazioniAooRes;
import it.maggioli.eldasoft.ws.dm.WSDMListaClassificheRes;
import it.maggioli.eldasoft.ws.dm.WSDMListaOperatoriRes;
import it.maggioli.eldasoft.ws.dm.WSDMListaProfiliRes;
import it.maggioli.eldasoft.ws.dm.WSDMListaTipiTrasmissioneRes;
import it.maggioli.eldasoft.ws.dm.WSDMListaUfficiRes;
import it.maggioli.eldasoft.ws.dm.WSDMLoginAttr;
import it.maggioli.eldasoft.ws.dm.WSDMProtocolloAllegato;
import it.maggioli.eldasoft.ws.dm.WSDMProtocolloAnagrafica;
import it.maggioli.eldasoft.ws.dm.WSDMProtocolloDocumento;
import it.maggioli.eldasoft.ws.dm.WSDMProtocolloDocumentoIn;
import it.maggioli.eldasoft.ws.dm.WSDMProtocolloDocumentoRes;
import it.maggioli.eldasoft.ws.dm.WSDMProtocolloInOut;
import it.maggioli.eldasoft.ws.dm.WSDMProtocolloModificaIn;
import it.maggioli.eldasoft.ws.dm.WSDMProtocolloModificaRes;
import it.maggioli.eldasoft.ws.dm.WSDMRicercaAccountEmail;
import it.maggioli.eldasoft.ws.dm.WSDMTrasmissioneIn;
import it.maggioli.eldasoft.ws.dm.WSDMTrasmissioneRes;
import it.maggioli.eldasoft.ws.dm.WSDMVerificaMailRes;

import java.math.BigInteger;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.List;

import javax.naming.InitialContext;
import javax.naming.NamingException;
import javax.xml.ws.WebServiceException;

import org.apache.cxf.endpoint.Client;
import org.apache.cxf.frontend.ClientProxy;
import org.apache.cxf.message.Message;

/**
 * 
 * @author Enrico
 */
public class InforManager implements IWSDMManager {

  static private String          INFOR_JPROTOCOLLO_ENDPOINT    = "java:comp/env/INFOR_JPROTOCOLLO_ENDPOINT";
  static private String          INFOR_JPROTOCOLLOGEN_ENDPOINT = "java:comp/env/INFOR_JPROTOCOLLOGEN_ENDPOINT";

  static org.apache.log4j.Logger logger                        = org.apache.log4j.Logger.getLogger(InforManager.class);
  String                         token                         = "";

  private JProtocolloServices getJProtocolloServices() throws Exception {
    String endpoint = (String) InitialContext.doLookup(INFOR_JPROTOCOLLO_ENDPOINT);
    if (endpoint == null || (endpoint != null && "".equals(endpoint.trim()))) {
      throw new Exception(URL_NOT_DEFINED);
    }
    JProtocolloServicesService service = new JProtocolloServicesService();
    JProtocolloServices iservice = service.getJProtocolloServicesPort();
    Client client = ClientProxy.getClient(iservice);
    client.getRequestContext().put(Message.ENDPOINT_ADDRESS, endpoint);
    return iservice;
  }

  private JProtocolloGenServices getJProtocolloGenServices() throws Exception {
    String endpoint = (String) InitialContext.doLookup(INFOR_JPROTOCOLLOGEN_ENDPOINT);
    if (endpoint == null || (endpoint != null && "".equals(endpoint.trim()))) {
      throw new Exception(URL_NOT_DEFINED);
    }
    JProtocolloGenServices_Service service = new JProtocolloGenServices_Service();
    JProtocolloGenServices iservice = service.getJProtocolloGenServicesPort();
    Client client = ClientProxy.getClient(iservice);
    client.getRequestContext().put(Message.ENDPOINT_ADDRESS, endpoint);
    return iservice;
  }

  @Override
  public WSDMProtocolloDocumentoRes _protocolloInserisci(String username, String password, WSDMLoginAttr loginAttr,
      WSDMProtocolloDocumentoIn wsdmprotocolloDocumentoIn) {
    StringBuffer messaggioCtr = new StringBuffer();
    WSDMProtocolloDocumentoRes retval = new WSDMProtocolloDocumentoRes();
    retval.setEsito(false);
    if (InforUtilityControllo.ctrProtocolloInserisci(loginAttr, wsdmprotocolloDocumentoIn, messaggioCtr)) {
      try {
        WSDMProtocolloDocumento protocolloDocumento = new WSDMProtocolloDocumento();
        Documento allegato_principale = null;
        WSDMProtocolloAllegato[] allegati = wsdmprotocolloDocumentoIn.getAllegati();
        if (allegati.length > 0) {
          allegato_principale = new Documento();
          allegato_principale.setTitolo(allegati[0].getTitolo());
          allegato_principale.setNomeFile(allegati[0].getNome());
          allegato_principale.setFile(allegati[0].getContenuto());
        }
        Documento[] altri_allegati = new Documento[0];
        if (allegati.length > 1) {
          altri_allegati = new Documento[allegati.length - 1];
          for (int i = 1; i < allegati.length; i++) {
            Documento d = new Documento();
            d.setTitolo(allegati[i].getTitolo());
            d.setNomeFile(allegati[i].getNome());
            d.setFile(allegati[i].getContenuto());
            altri_allegati[i - 1] = d;
          }
        }
        // PROTOCOLLAZIONE
        Registro registro = new Registro();
        // registro.setCodice("RT");
        registro.setCodice(wsdmprotocolloDocumentoIn.getCodiceRegistro());
        String esitoProtocolla = "";
        String messaggioProtocolla = "";
        Segnatura segnatura = new Segnatura();
        WSDMProtocolloInOut inout = wsdmprotocolloDocumentoIn.getInout();
        if (inout == WSDMProtocolloInOut.IN) {
          InserisciArrivo.RichiestaProtocollaArrivo richiestaProtocollaArrivo = new InserisciArrivo.RichiestaProtocollaArrivo();
          richiestaProtocollaArrivo.setUsername(username);
          ProtocollaArrivo pa = new ProtocollaArrivo();
          pa.setRegistro(registro);
          pa.setOggetto(wsdmprotocolloDocumentoIn.getOggetto());
          Soggetti soggetti = new Soggetti();
          WSDMProtocolloAnagrafica[] mittenti = wsdmprotocolloDocumentoIn.getMittenti();
          List<Object> listasoggetti = soggetti.getSoggettoOrAnagraficaOrAmministrazione();
          for (int i = 0; i < mittenti.length; i++) {
            Soggetto soggetto = new Soggetto();
            // soggetto.setDenominazione(wsdmprotocolloDocumentoIn.getMittenteEsterno());
            if (mittenti[i].getNome() == null) {
              soggetto.setDenominazione(mittenti[i].getCognomeointestazione());
            } else {
              soggetto.setDenominazione(mittenti[i].getCognomeointestazione() + " " + mittenti[i].getNome());// obbligatorio
            }
            listasoggetti.add(soggetto);
          }

          pa.setSoggetti(soggetti);
          Corrispondente corrispondente = new Corrispondente();
          // corrispondente.setCodice("TEST");
          // corrispondente.setCodice(wsdmprotocolloDocumentoIn.getDestinatarioPrincipale());
          corrispondente.setCodice(wsdmprotocolloDocumentoIn.getIdUnitaOperativaDestinataria());
          Smistamento smistamento = new Smistamento();
          smistamento.setCorrispondente(corrispondente);
          Smistamenti smistamenti = new Smistamenti();
          smistamenti.getSmistamento().add(smistamento);
          pa.setSmistamenti(smistamenti);
          richiestaProtocollaArrivo.setProtocollaArrivo(pa);

          if (allegato_principale != null) {
            richiestaProtocollaArrivo.setDocumento(allegato_principale);
          }

          InserisciArrivoResponse.RispostaProtocolla rispostaProtocolla = this.getJProtocolloServices().inserisciArrivo(
              richiestaProtocollaArrivo);

          if (rispostaProtocolla.getEsito() != null) {
            esitoProtocolla = rispostaProtocolla.getEsito();
          }
          if (rispostaProtocolla.getMessaggio() != null) {
            messaggioProtocolla = rispostaProtocolla.getMessaggio();
          }
          if (rispostaProtocolla.getSegnatura() != null) {
            segnatura = rispostaProtocolla.getSegnatura();
          }
        } else if (inout == WSDMProtocolloInOut.OUT) {
          InserisciPartenza.RichiestaProtocollaPartenza richiestaProtocollaPartenza = new InserisciPartenza.RichiestaProtocollaPartenza();
          richiestaProtocollaPartenza.setUsername(username);
          ProtocollaPartenza pp = new ProtocollaPartenza();
          pp.setRegistro(registro);
          pp.setOggetto(wsdmprotocolloDocumentoIn.getOggetto());
          Soggetti soggetti = new Soggetti();
          WSDMProtocolloAnagrafica[] destinatari = wsdmprotocolloDocumentoIn.getDestinatari();
          List<Object> listasoggetti = soggetti.getSoggettoOrAnagraficaOrAmministrazione();
          for (int i = 0; i < destinatari.length; i++) {
            Soggetto soggetto = new Soggetto();
            if (destinatari[i].getNome() == null) {
              soggetto.setDenominazione(destinatari[i].getCognomeointestazione());
            } else {
              soggetto.setDenominazione(destinatari[i].getCognomeointestazione() + " " + destinatari[i].getNome());// obbligatorio
            }
            listasoggetti.add(soggetto);
          }

          pp.setSoggetti(soggetti);

          // da specifiche sembra che il corrispondente non sia da includere nel
          // tag smistamento
          // Smistamento smistamento = new Smistamento();
          // smistamento.setCorrispondente(corrispondente);
          // Smistamenti smistamenti = new Smistamenti();
          // smistamenti.getSmistamento().add(smistamento);
          // pp.setSmistamenti(smistamenti);

          Corrispondente corrispondente = new Corrispondente();
          // corrispondente.setCodice("TEST");
          // corrispondente.setCodice(wsdmprotocolloDocumentoIn.getMittenteInterno());
          corrispondente.setCodice(wsdmprotocolloDocumentoIn.getIdUnitaOperativaMittente());

          pp.setCorrispondente(corrispondente);
          richiestaProtocollaPartenza.setProtocollaPartenza(pp);

          if (allegato_principale != null) {
            richiestaProtocollaPartenza.setDocumento(allegato_principale);
          }

          InserisciPartenzaResponse.RispostaProtocolla rispostaProtocolla = this.getJProtocolloServices().inserisciPartenza(
              richiestaProtocollaPartenza);
          if (rispostaProtocolla.getEsito() != null) {
            esitoProtocolla = rispostaProtocolla.getEsito();
          }
          if (rispostaProtocolla.getMessaggio() != null) {
            messaggioProtocolla = rispostaProtocolla.getMessaggio();
          }
          if (rispostaProtocolla.getSegnatura() != null) {
            segnatura = rispostaProtocolla.getSegnatura();
          }
        } else if (inout == WSDMProtocolloInOut.INT) {
          InserisciInterno.RichiestaProtocollaInterno richiestaProtocollaInterno = new InserisciInterno.RichiestaProtocollaInterno();
          richiestaProtocollaInterno.setUsername(username);
          ProtocollaInterno pi = new ProtocollaInterno();
          pi.setRegistro(registro);
          pi.setOggetto(wsdmprotocolloDocumentoIn.getOggetto());
          // Soggetti soggetti = new Soggetti();

          Smistamento smistamento = new Smistamento();
          Corrispondente corrispondente = new Corrispondente();
          // corrispondente.setCodice("TEST");
          // corrispondente.setCodice(wsdmprotocolloDocumentoIn.getDestinatarioPrincipale());
          corrispondente.setCodice(wsdmprotocolloDocumentoIn.getIdUnitaOperativaDestinataria());
          smistamento.setCorrispondente(corrispondente);
          Smistamenti smistamenti = new Smistamenti();
          smistamenti.getSmistamento().add(smistamento);
          pi.setSmistamenti(smistamenti);

          Corrispondente corrispondente_mittente_interno = new Corrispondente();
          // corrispondente_mittente_interno.setCodice(wsdmprotocolloDocumentoIn.getMittenteInterno());
          corrispondente_mittente_interno.setCodice(wsdmprotocolloDocumentoIn.getIdUnitaOperativaMittente());
          pi.setCorrispondente(corrispondente_mittente_interno);

          richiestaProtocollaInterno.setProtocollaInterno(pi);

          if (allegato_principale != null) {
            richiestaProtocollaInterno.setDocumento(allegato_principale);
          }

          InserisciInternoResponse.RispostaProtocolla rispostaProtocolla = this.getJProtocolloServices().inserisciInterno(
              richiestaProtocollaInterno);
          if (rispostaProtocolla.getEsito() != null) {
            esitoProtocolla = rispostaProtocolla.getEsito();
          }
          if (rispostaProtocolla.getMessaggio() != null) {
            messaggioProtocolla = rispostaProtocolla.getMessaggio();
          }
          if (rispostaProtocolla.getSegnatura() != null) {
            segnatura = rispostaProtocolla.getSegnatura();
          }
        }
        // END PROTOCOLLAZIONE

        if (esitoProtocolla.equals("OK")) {
          protocolloDocumento.setAnnoProtocollo(Long.parseLong(segnatura.getAnno()));
          protocolloDocumento.setNumeroProtocollo(segnatura.getNumero());
          SimpleDateFormat sdf2 = new SimpleDateFormat("dd/MM/yyyy hh:mm");
          Date data = sdf2.parse(segnatura.getData() + " " + segnatura.getOra());
          protocolloDocumento.setDataProtocollo(data);
          // ALTRI ALLEGATI
          Riferimento riferimento = new Riferimento();
          riferimento.setRegistro(segnatura.getRegistro());
          riferimento.setAnno(segnatura.getAnno());
          riferimento.setNumero(segnatura.getNumero());

          for (int i = 0; i < altri_allegati.length; i++) {

            AllegaDocumento.RichiestaAllegaDocumento richiestaAllegaDocumento = new AllegaDocumento.RichiestaAllegaDocumento();
            richiestaAllegaDocumento.setRiferimento(riferimento);
            richiestaAllegaDocumento.setUsername(username);
            richiestaAllegaDocumento.setDocumento(altri_allegati[i]);

            AllegaDocumentoResponse.RispostaAllegaDocumento rispostaAllegaDocumento = this.getJProtocolloServices().allegaDocumento(
                richiestaAllegaDocumento);
            if (!rispostaAllegaDocumento.getEsito().equals("OK")) {
              // allega fallito
              retval.setMessaggio(rispostaAllegaDocumento.getMessaggio());
              return retval;
            }
          }
          // END ALTRI ALLEGATI

          // FASCICOLO
          if (!WSDMInserimentoInFascicolo.NO.equals(wsdmprotocolloDocumentoIn.getInserimentoInFascicolo())) {
            WSDMFascicolo fascicolo = wsdmprotocolloDocumentoIn.getFascicolo();
            String annoFascicolo = "";
            String numeroFascicolo = "";
            Boolean fascicolo_ok = false;
            if (WSDMInserimentoInFascicolo.SI_FASCICOLO_ESISTENTE.equals(wsdmprotocolloDocumentoIn.getInserimentoInFascicolo())) {
              // GIA' ESISTENTE
              annoFascicolo = fascicolo.getAnnoFascicolo() + "";
              numeroFascicolo = fascicolo.getNumeroFascicolo();
              fascicolo_ok = true;
            } else if (WSDMInserimentoInFascicolo.SI_FASCICOLO_NUOVO.equals(wsdmprotocolloDocumentoIn.getInserimentoInFascicolo())) {
              // CREAZIONE FASCICOLO
              GestioneFascicoli gestioneFascicoli = new GestioneFascicoli();
              RichiestaGestioneFascicoli richiestaGestioneFascicoli = new RichiestaGestioneFascicoli();
              richiestaGestioneFascicoli.setUsername(username);
              richiestaGestioneFascicoli.setOperazione("INSERT");
              FascicoloDettaglioType fascicoloDettaglio = new FascicoloDettaglioType();
              fascicoloDettaglio.setDescrizione(fascicolo.getOggettoFascicolo());// richiesto
                                                                                 // esplicitamente
                                                                                 // di
                                                                                 // gestire
                                                                                 // descrizione
                                                                                 // su
                                                                                 // oggetto

              SimpleDateFormat sdf = new SimpleDateFormat("yyyyMMdd");
              fascicoloDettaglio.setDataCreazione(sdf.format(new Date()));
              TitolarioType titolario = new TitolarioType();
              titolario.setCodice(fascicolo.getClassificaFascicolo());
              fascicoloDettaglio.setTitolario(titolario);

              richiestaGestioneFascicoli.setFascicolo(fascicoloDettaglio);
              gestioneFascicoli.setRichiestaGestioneFascicoli(richiestaGestioneFascicoli);
              GestioneFascicoliResponse response = this.getJProtocolloGenServices().gestioneFascicoli(gestioneFascicoli);
              if (response.getRispostaGestioneFascicoli().getEsito().equals("OK")
                  && response.getRispostaGestioneFascicoli().getFascicolo().size() > 0) {
                annoFascicolo = response.getRispostaGestioneFascicoli().getFascicolo().get(0).getAnno();
                numeroFascicolo = response.getRispostaGestioneFascicoli().getFascicolo().get(0).getNumero();
                fascicolo_ok = true;
              } else {
                // fallito creazione fascicolo
                retval.setMessaggio("CREAZIONE FASCICOLO: " + response.getRispostaGestioneFascicoli().getMessaggio());
                return retval;
              }
              // END CREAZIONE FASCICOLO

            }
            // ALLEGA A FASCICOLO
            if (fascicolo_ok) {
              AllegaProtocolloFascicolo allegaProtocolloFascicolo = new AllegaProtocolloFascicolo();
              RichiestaAllegaProtocolloFascicolo richiestaAllegaProtocolloFascicolo = new RichiestaAllegaProtocolloFascicolo();
              richiestaAllegaProtocolloFascicolo.setUsername(username);
              FascicoloRiferimentoType riferimentoFascicolo = new FascicoloRiferimentoType();
              TitolarioType titolario = new TitolarioType();
              titolario.setCodice(fascicolo.getClassificaFascicolo());
              riferimentoFascicolo.setTitolario(titolario);
              riferimentoFascicolo.setAnno(annoFascicolo);
              riferimentoFascicolo.setNumero(numeroFascicolo);
              richiestaAllegaProtocolloFascicolo.setRiferimentoFascicolo(riferimentoFascicolo);
              ProtocolloRiferimentoType riferimentoProtocollo = new ProtocolloRiferimentoType();
              RegistroType registrotype = new RegistroType();
              registrotype.setCodice(segnatura.getRegistro().getCodice());
              riferimentoProtocollo.setRegistro(registrotype);
              riferimentoProtocollo.setAnno(segnatura.getAnno());
              riferimentoProtocollo.setNumero(segnatura.getNumero());
              richiestaAllegaProtocolloFascicolo.setRiferimentoProtocollo(riferimentoProtocollo);
              allegaProtocolloFascicolo.setRichiestaAllegaProtocolloFascicolo(richiestaAllegaProtocolloFascicolo);
              AllegaProtocolloFascicoloResponse allegaFascicoloResponse = this.getJProtocolloGenServices().allegaProtocolloFascicolo(
                  allegaProtocolloFascicolo);
              RispostaAllegaProtocolloFascicolo rispostaAllegaProtocolloFascicolo = allegaFascicoloResponse.getRispostaAllegaProtocolloFascicolo();
              if (!rispostaAllegaProtocolloFascicolo.getEsito().equals("OK")) {
                // fallito allega a fascicolo
                retval.setMessaggio("ALLEGA A FASCICOLO: " + rispostaAllegaProtocolloFascicolo.getMessaggio());
                return retval;
              } else {
                WSDMFascicolo wsdmFascicolo = new WSDMFascicolo();
                wsdmFascicolo.setAnnoFascicolo(Long.parseLong(annoFascicolo));
                wsdmFascicolo.setNumeroFascicolo(numeroFascicolo);
                protocolloDocumento.setFascicolo(wsdmFascicolo);
              }
            }
            // END ALLEGA A FASCICOLO
          }
          // END FASCICOLO

        } else {
          // protocolla fallito
          retval.setMessaggio(messaggioProtocolla);
          return retval;
        }
        retval.setProtocolloDocumento(protocolloDocumento);
        retval.setEsito(true);
      } catch (WebServiceException w) {
        retval.setEsito(false);
        retval.setMessaggio(WS_ERROR + " " + w.getMessage());
        logger.error("Errore (_protocolloInserisci)", w);
      } catch (NamingException e) {
        retval.setEsito(false);
        retval.setMessaggio(NAMING_ERROR + " " + e.getMessage());
        logger.error("Errore (_protocolloInserisci)", e);
      } catch (Throwable t) {
        retval.setEsito(false);
        retval.setMessaggio(t.getMessage());
        logger.error("Errore (_protocolloInserisci)", t);
      }
    } else {
      retval.setEsito(false);
      retval.setMessaggio(messaggioCtr.toString());
    }
    return retval;
  }

  @Override
  public WSDMProtocolloDocumentoRes _documentoInserisci(String username, String password, WSDMLoginAttr loginAttr,
      WSDMProtocolloDocumentoIn wsdmprotocolloDocumentoIn) {
    // WSDMProtocolloDocumentoRes wsdmprotocolloDocumentoRes = new
    // WSDMProtocolloDocumentoRes();
    // wsdmprotocolloDocumentoRes.setEsito(false);
    // wsdmprotocolloDocumentoRes.setMessaggio(OPERATION_NOT_SUPPORTED);
    // return wsdmprotocolloDocumentoRes;
    return _protocolloInserisci(username, password, loginAttr, wsdmprotocolloDocumentoIn);
  }

  @Override
  public WSDMListaProfiliRes _listaProfili(String username, String password, String utenteApplicativo) {
    WSDMListaProfiliRes retval = new WSDMListaProfiliRes();
    retval.setEsito(false);
    retval.setMessaggio(OPERATION_NOT_SUPPORTED);
    return retval;
  }

  @Override
  public WSDMListaAmministrazioniAooRes _listaAmministrazioniAoo(String username, String password) {
    WSDMListaAmministrazioniAooRes retval = new WSDMListaAmministrazioniAooRes();
    retval.setEsito(false);
    retval.setMessaggio(OPERATION_NOT_SUPPORTED);
    return retval;
  }

  @Override
  public WSDMListaUfficiRes _listaUffici(String username, String password, WSDMLoginAttr loginAttr, String codiceAoo,
      String descrizioneUfficio, String utente) {
    WSDMListaUfficiRes retval = new WSDMListaUfficiRes();
    retval.setEsito(false);
    retval.setMessaggio(OPERATION_NOT_SUPPORTED);
    return retval;
  }

  @Override
  public WSDMProtocolloDocumentoRes _protocolloLeggi(String username, String password, WSDMLoginAttr loginAttr, Long annoProtocollo,
      String numeroProtocollo) {
    WSDMProtocolloDocumentoRes retval = new WSDMProtocolloDocumentoRes();
    retval.setEsito(false);
    retval.setMessaggio(OPERATION_NOT_SUPPORTED);
    return retval;
  }

  @Override
  public WSDMProtocolloDocumentoRes _documentoLeggi(String username, String password, WSDMLoginAttr loginAttr, String numeroDocumento) {
    WSDMProtocolloDocumentoRes retval = new WSDMProtocolloDocumentoRes();
    retval.setEsito(false);
    retval.setMessaggio(OPERATION_NOT_SUPPORTED);
    return retval;
  }

  @Override
  public WSDMProtocolloDocumentoRes _documentoMetadatiLeggi(String username, String password, WSDMLoginAttr loginAttr,
      String numeroDocumento) {
    WSDMProtocolloDocumentoRes retval = new WSDMProtocolloDocumentoRes();
    retval.setEsito(false);
    retval.setMessaggio(OPERATION_NOT_SUPPORTED);
    return retval;
  }

  @Override
  public WSDMFascicoloRes _fascicoloInserisci(String username, String password, WSDMLoginAttr loginAttr, WSDMFascicoloIn wsdmfascicoloIn) {
    WSDMFascicoloRes retval = new WSDMFascicoloRes();
    retval.setEsito(false);
    try {
      GestioneFascicoli gestioneFascicoli = new GestioneFascicoli();
      RichiestaGestioneFascicoli richiestaGestioneFascicoli = new RichiestaGestioneFascicoli();
      richiestaGestioneFascicoli.setUsername(username);
      richiestaGestioneFascicoli.setOperazione("INSERT");
      FascicoloDettaglioType fascicoloDettaglio = new FascicoloDettaglioType();
      fascicoloDettaglio.setDescrizione(wsdmfascicoloIn.getOggettoFascicolo());// richiesto
                                                                               // esplicitamente
                                                                               // di
                                                                               // gestire
                                                                               // descrizione
                                                                               // su
                                                                               // oggetto

      SimpleDateFormat sdf = new SimpleDateFormat("yyyyMMdd");
      fascicoloDettaglio.setDataCreazione(sdf.format(new Date()));
      TitolarioType titolario = new TitolarioType();
      titolario.setCodice(wsdmfascicoloIn.getClassificaFascicolo());
      fascicoloDettaglio.setTitolario(titolario);

      richiestaGestioneFascicoli.setFascicolo(fascicoloDettaglio);
      gestioneFascicoli.setRichiestaGestioneFascicoli(richiestaGestioneFascicoli);
      GestioneFascicoliResponse response = this.getJProtocolloGenServices().gestioneFascicoli(gestioneFascicoli);
      if (response.getRispostaGestioneFascicoli().getEsito().equals("OK")
          && response.getRispostaGestioneFascicoli().getFascicolo().size() > 0) {
        WSDMFascicolo fascicolo = new WSDMFascicolo();
        fascicolo.setAnnoFascicolo(Long.parseLong(response.getRispostaGestioneFascicoli().getFascicolo().get(0).getAnno()));
        fascicolo.setNumeroFascicolo(response.getRispostaGestioneFascicoli().getFascicolo().get(0).getNumero());
        retval.setFascicolo(fascicolo);
        retval.setEsito(true);
      } else {
        retval.setMessaggio(response.getRispostaGestioneFascicoli().getMessaggio());
      }
    } catch (Exception ex) {
      retval.setMessaggio(ex.getMessage());
    }
    return retval;
  }

  @Override
  public WSDMFascicoloRes _fascicoloAggiungiDocumento(String username, String password, WSDMLoginAttr loginAttr, String codiceFascicolo,
      String numeroDocumento) {
    WSDMFascicoloRes retval = new WSDMFascicoloRes();
    retval.setEsito(false);
    retval.setMessaggio(OPERATION_NOT_SUPPORTED);
    return retval;
  }

  @Override
  public WSDMFascicoloRes _fascicoloLeggi(String username, String password, WSDMLoginAttr loginAttr, String codiceFascicolo,
      Long annoFascicolo, String numeroFascicolo, String classificaFascicolo) {
    // WSDMFascicoloRes retval = new WSDMFascicoloRes();
    // retval.setEsito(false);
    // retval.setMessaggio(OPERATION_NOT_SUPPORTED);
    // return retval;
    return _fascicoloMetadatiLeggi(username, password, loginAttr, codiceFascicolo, annoFascicolo, numeroFascicolo, classificaFascicolo);
  }

  @Override
  public WSDMFascicoloRes _fascicoloMetadatiLeggi(String username, String password, WSDMLoginAttr loginAttr, String codiceFascicolo,
      Long annoFascicolo, String numeroFascicolo, String classificaFascicolo) {
    // WSDMFascicoloRes retval = new WSDMFascicoloRes();
    // retval.setEsito(false);
    // retval.setMessaggio(OPERATION_NOT_SUPPORTED);
    // return retval;
    WSDMFascicoloRes retval = new WSDMFascicoloRes();
    retval.setEsito(false);
    try {
      GestioneFascicoli gestioneFascicoli = new GestioneFascicoli();
      RichiestaGestioneFascicoli richiestaGestioneFascicoli = new RichiestaGestioneFascicoli();
      richiestaGestioneFascicoli.setUsername(username);
      richiestaGestioneFascicoli.setOperazione("VIEW");
      FascicoloDettaglioType fascicoloDettaglio = new FascicoloDettaglioType();
      fascicoloDettaglio.setAnno(annoFascicolo + "");
      fascicoloDettaglio.setNumero(numeroFascicolo);
      TitolarioType titolario = new TitolarioType();
      titolario.setCodice(classificaFascicolo);
      fascicoloDettaglio.setTitolario(titolario);

      DatiVisualizzazioneType datiVisualizzazione = new DatiVisualizzazioneType();
      datiVisualizzazione.setInizioPag(BigInteger.ZERO);
      datiVisualizzazione.setDimensionePag(BigInteger.valueOf(100));
      // datiVisualizzazione.setSoloProtocolli(Boolean.FALSE);default = true
      // datiVisualizzazione.setDataAllegatoDal(token);//formato YYYYMMDD
      // datiVisualizzazione.setDataAllegatoAl(token);//formato YYYYMMDD
      richiestaGestioneFascicoli.setDatiVisualizzazione(datiVisualizzazione);

      richiestaGestioneFascicoli.setFascicolo(fascicoloDettaglio);
      gestioneFascicoli.setRichiestaGestioneFascicoli(richiestaGestioneFascicoli);
      GestioneFascicoliResponse response = this.getJProtocolloGenServices().gestioneFascicoli(gestioneFascicoli);
      RispostaGestioneFascicoli rispostaGestioneFascicoli = response.getRispostaGestioneFascicoli();
      SimpleDateFormat sdf = new SimpleDateFormat("yyyyMMdd");
      if (rispostaGestioneFascicoli.getEsito().equals("OK")) {
        WSDMFascicolo fascicolo = new WSDMFascicolo();

        if (rispostaGestioneFascicoli.getFascicolo().size() > 0) {
          FascicoloDettaglioType fascicolo_infor = rispostaGestioneFascicoli.getFascicolo().get(0);
          // fascicolo.setCodiceFascicolo(fascicolo_infor);
          fascicolo.setAnnoFascicolo(Long.parseLong(fascicolo_infor.getAnno()));
          fascicolo.setNumeroFascicolo(fascicolo_infor.getNumero());
          fascicolo.setDataFascicolo(sdf.parse(fascicolo_infor.getDataCreazione()));
          fascicolo.setOggettoFascicolo(fascicolo_infor.getDescrizione());// richiesto
                                                                          // esplicitamente
                                                                          // di
                                                                          // gestire
                                                                          // descrizione
                                                                          // su
                                                                          // oggetto
          fascicolo.setClassificaFascicolo(fascicolo_infor.getTitolario().getCodice());
        }

        // ArrayList<WSDMFascicoloDocumento> documenti = new
        // ArrayList<WSDMFascicoloDocumento>();
        // List<AllegatoDettaglioType> allegati_infor =
        // response.getRispostaGestioneFascicoli().getAllegato();
        // for (int i = 0; i < allegati_infor.size(); i++) {
        // AllegatoDettaglioType allegato_infor = allegati_infor.get(i);
        // WSDMFascicoloDocumento documento_wsdm = new WSDMFascicoloDocumento();
        // documento_wsdm.setOggetto(allegato_infor.getOggetto());
        // documento_wsdm.setDataProtocollo(sdf.parse(allegato_infor.getData()));
        // documento_wsdm.setNumeroProtocollo(allegato_infor.getRiferimento());
        // documenti.add(documento_wsdm);
        // }
        // fascicolo.setDocumenti(documenti.toArray(new
        // WSDMFascicoloDocumento[documenti.size()]));
        retval.setFascicolo(fascicolo);
        retval.setEsito(true);
      } else {
        retval.setMessaggio(response.getRispostaGestioneFascicoli().getMessaggio());
      }
    } catch (Exception ex) {
      retval.setMessaggio(ex.getMessage());
    }
    return retval;
  }

  @Override
  public WSDMProtocolloDocumentoRes _attoContrattoLeggi(String username, String password, WSDMLoginAttr loginAttr, String tipo,
      String organo, Long anno, String numero) {
    WSDMProtocolloDocumentoRes retval = new WSDMProtocolloDocumentoRes();
    retval.setEsito(false);
    retval.setMessaggio(OPERATION_NOT_SUPPORTED);
    return retval;
  }

  @Override
  public WSDMInviaMailRes _inviaMail(String username, String password, WSDMLoginAttr loginAttr, WSDMInviaMail wsdmInviaMail) {
    WSDMInviaMailRes retval = new WSDMInviaMailRes();
    retval.setEsito(false);
    retval.setMessaggio(OPERATION_NOT_SUPPORTED);
    return retval;
  }

  @Override
  public WSDMVerificaMailRes _verificaMail(String username, String password, WSDMLoginAttr loginAttr, String numeroDocumento,
      Long annoProtocollo, String numeroProtocollo) {
    WSDMVerificaMailRes retval = new WSDMVerificaMailRes();
    retval.setEsito(false);
    retval.setMessaggio(OPERATION_NOT_SUPPORTED);
    return retval;
  }

  @Override
  public WSDMAttoContrattoRes _attoContrattoRicerca(String username, String password, WSDMLoginAttr loginAttr, String tipo, String organo,
      Long anno, String numeroDa, String numeroA, Date dataDa, Date dataA) {
    WSDMAttoContrattoRes retval = new WSDMAttoContrattoRes();
    retval.setEsito(false);
    retval.setMessaggio(OPERATION_NOT_SUPPORTED);
    return retval;
  }

  @Override
  public WSDMListaClassificheRes _listaClassifiche(String username, String password, WSDMLoginAttr loginAttr, String codice,
      String descrizione, String voce) {
    WSDMListaClassificheRes wsdmListaClassificheRes = new WSDMListaClassificheRes();
    wsdmListaClassificheRes.setEsito(false);
    wsdmListaClassificheRes.setMessaggio(OPERATION_NOT_SUPPORTED);
    return wsdmListaClassificheRes;
  }

  @Override
  public WSDMProtocolloModificaRes _protocolloModifica(String username, String password, WSDMLoginAttr loginAttr,
      WSDMProtocolloModificaIn wsdmprotocolloModificaIn) {
    WSDMProtocolloModificaRes wsdmprotocolloModificaRes = new WSDMProtocolloModificaRes();
    wsdmprotocolloModificaRes.setEsito(false);
    wsdmprotocolloModificaRes.setMessaggio(OPERATION_NOT_SUPPORTED);
    return wsdmprotocolloModificaRes;
  }

  @Override
  public WSDMFascicoloModificaRes _fascicoloModifica(String username, String password, WSDMLoginAttr loginAttr,
      WSDMFascicoloModificaIn wsdmfascicoloModificaIn) {
    WSDMFascicoloModificaRes wsdmfascicoloModificaRes = new WSDMFascicoloModificaRes();
    wsdmfascicoloModificaRes.setEsito(false);
    wsdmfascicoloModificaRes.setMessaggio(OPERATION_NOT_SUPPORTED);
    return wsdmfascicoloModificaRes;
  }

  @Override
  public WSDMAnagraficaLeggiRes _anagraficaLeggi(String username, String password, WSDMLoginAttr loginAttr, String codiceAnagrafica) {
    WSDMAnagraficaLeggiRes wsdmAnagraficaLeggiRes = new WSDMAnagraficaLeggiRes();
    wsdmAnagraficaLeggiRes.setEsito(false);
    wsdmAnagraficaLeggiRes.setMessaggio(OPERATION_NOT_SUPPORTED);
    return wsdmAnagraficaLeggiRes;
  }

  @Override
  public WSDMDocumentoCollegaRes _documentoCollega(String username, String password, WSDMLoginAttr loginAttr, String numeroDocumentoPadre,
      String numeroDocumentoFiglio, String tipoCollegamento) {
    WSDMDocumentoCollegaRes wsdmDocumentoCollegaRes = new WSDMDocumentoCollegaRes();
    wsdmDocumentoCollegaRes.setEsito(false);
    wsdmDocumentoCollegaRes.setMessaggio(OPERATION_NOT_SUPPORTED);
    return wsdmDocumentoCollegaRes;
  }

  @Override
  public WSDMListaOperatoriRes _listaOperatori(String username, String password, WSDMLoginAttr loginAttr, String cognome,
      String codiceFiscale) {
    WSDMListaOperatoriRes wsdmListaOperatoriRes = new WSDMListaOperatoriRes();
    wsdmListaOperatoriRes.setEsito(false);
    wsdmListaOperatoriRes.setMessaggio(OPERATION_NOT_SUPPORTED);
    return wsdmListaOperatoriRes;
  }

  @Override
  public WSDMListaTipiTrasmissioneRes _listaTipiTrasmissione(String username, String password, WSDMLoginAttr loginAttr) {
    WSDMListaTipiTrasmissioneRes wsdmListaTipiTrasmissioneRes = new WSDMListaTipiTrasmissioneRes();
    wsdmListaTipiTrasmissioneRes.setEsito(false);
    wsdmListaTipiTrasmissioneRes.setMessaggio(OPERATION_NOT_SUPPORTED);
    return wsdmListaTipiTrasmissioneRes;
  }

  @Override
  public WSDMTrasmissioneRes _trasmissione(String username, String password, WSDMLoginAttr loginAttr, WSDMTrasmissioneIn trasmissioneIn) {
    WSDMTrasmissioneRes wsdmTrasmissioneRes = new WSDMTrasmissioneRes();
    wsdmTrasmissioneRes.setEsito(false);
    wsdmTrasmissioneRes.setMessaggio(OPERATION_NOT_SUPPORTED);
    return wsdmTrasmissioneRes;
  }

  @Override
  public WSDMAggiungiAllegatiRes _aggiungiAllegati(String username, String password, WSDMLoginAttr loginAttr,
      WSDMAggiungiAllegatiIn aggiungiAllegatiIn) {
    WSDMAggiungiAllegatiRes wsdmAggiungiAllegatiRes = new WSDMAggiungiAllegatiRes();
    wsdmAggiungiAllegatiRes.setEsito(false);
    wsdmAggiungiAllegatiRes.setMessaggio(OPERATION_NOT_SUPPORTED);
    return wsdmAggiungiAllegatiRes;
  }
  
  @Override
  public WSDMListaAccountEmailRes _listaAccountEmail(String username, String password, WSDMLoginAttr loginAttr, WSDMRicercaAccountEmail ricercaAccountEmail) {
    WSDMListaAccountEmailRes wsdmListaAccountEmailRes = new WSDMListaAccountEmailRes();
    wsdmListaAccountEmailRes.setEsito(false);
    wsdmListaAccountEmailRes.setMessaggio(OPERATION_NOT_SUPPORTED);
    return wsdmListaAccountEmailRes;
  }
  
  
}
