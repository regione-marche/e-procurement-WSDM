/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package it.maggioli.eldasoft.bl.infor;

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

import it.infor.JProtocolloGenServices.AnagraficaType;
import it.infor.JProtocolloGenServices.CorrispondenteType;
import it.infor.JProtocolloGenServices.DatiRicercaAnagraficaType;
import it.infor.JProtocolloGenServices.DatiVisualizzazioneType;
import it.infor.JProtocolloGenServices.FascicoloDettaglioType;
import it.infor.JProtocolloGenServices.FascicoloDettaglioType.Ufficio;
import it.infor.JProtocolloGenServices.GestioneAnagrafica;
import it.infor.JProtocolloGenServices.GestioneAnagraficaResponse;
import it.infor.JProtocolloGenServices.GestioneFascicoli;
import it.infor.JProtocolloGenServices.GestioneFascicoliResponse;
import it.infor.JProtocolloGenServices.JProtocolloGenServices;
import it.infor.JProtocolloGenServices.JProtocolloGenServices_Service;
import it.infor.JProtocolloGenServices.RichiestaGestioneAnagrafica;
import it.infor.JProtocolloGenServices.RichiestaGestioneFascicoli;
import it.infor.JProtocolloGenServices.RispostaGestioneFascicoli;
import it.infor.JProtocolloGenServices.TitolarioType;
import it.infor.JProtocolloServices.AllegaDocumento;
import it.infor.JProtocolloServices.AllegaDocumentoResponse;
import it.infor.JProtocolloServices.AltriDati;
import it.infor.JProtocolloServices.Anagrafica;
import it.infor.JProtocolloServices.Classificazione;
import it.infor.JProtocolloServices.Classificazione.Fascicolo;
import it.infor.JProtocolloServices.Corrispondente;
import it.infor.JProtocolloServices.Documento;
import it.infor.JProtocolloServices.InserisciArrivo;
import it.infor.JProtocolloServices.InserisciArrivoResponse;
import it.infor.JProtocolloServices.InserisciInterno;
import it.infor.JProtocolloServices.InserisciInternoResponse;
import it.infor.JProtocolloServices.InserisciPartenza;
import it.infor.JProtocolloServices.InserisciPartenzaResponse;
import it.infor.JProtocolloServices.InviaProtocollo.RichiestaInviaProtocollo;
import it.infor.JProtocolloServices.InviaProtocolloResponse.RispostaInviaProtocollo;
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
import it.infor.JProtocolloServices.TipoDocumento;
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
import it.maggioli.eldasoft.ws.dm.WSDMRicercaFascicolo;
import it.maggioli.eldasoft.ws.dm.WSDMRicercaFascicoloRes;
import it.maggioli.eldasoft.ws.dm.WSDMTrasmissioneIn;
import it.maggioli.eldasoft.ws.dm.WSDMTrasmissioneRes;
import it.maggioli.eldasoft.ws.dm.WSDMVerificaMailRes;

/**
 * 
 * @author Enrico
 */
public class Infor2Manager implements IWSDMManager {

  static private String          INFOR2_JPROTOCOLLO_ENDPOINT    = "java:comp/env/INFOR2_JPROTOCOLLO_ENDPOINT";
  static private String          INFOR2_JPROTOCOLLOGEN_ENDPOINT = "java:comp/env/INFOR2_JPROTOCOLLOGEN_ENDPOINT";

  static org.apache.log4j.Logger logger                        = org.apache.log4j.Logger.getLogger(Infor2Manager.class);
  String                         token                         = "";

  private JProtocolloServices getJProtocolloServices() throws Exception {
    String endpoint = (String) InitialContext.doLookup(INFOR2_JPROTOCOLLO_ENDPOINT);
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
    String endpoint = (String) InitialContext.doLookup(INFOR2_JPROTOCOLLOGEN_ENDPOINT);
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

    WSDMProtocolloDocumentoRes wsdmProtocolloDocumentoRes = new WSDMProtocolloDocumentoRes();

    wsdmProtocolloDocumentoRes.setEsito(false);

    if (Infor2UtilityControllo.ctrProtocolloInserisci(loginAttr, wsdmprotocolloDocumentoIn, messaggioCtr)) {
      try {

        WSDMProtocolloDocumento protocolloDocumento = new WSDMProtocolloDocumento();

        // Preparazione degli allegati, il primo allegato e' il documento
        // principale e deve essere indicato tra i dati della richiesta.
        // Gli allegati successivi al primo devono essere associati al
        // protocollo appena creato mediante l'operazione
        // "RichiestaAllegaDocumento"
        Documento allegato_principale = null;
        WSDMProtocolloAllegato[] allegati = wsdmprotocolloDocumentoIn.getAllegati();
        if (allegati.length > 0) {
          allegato_principale = new Documento();

          String allegatoPrincipaleTitolo = allegati[0].getTitolo();
          if (allegatoPrincipaleTitolo != null) {
            if (allegatoPrincipaleTitolo.length() > 100) {
              allegatoPrincipaleTitolo = allegatoPrincipaleTitolo.substring(0, 100);
            }
          }

          allegato_principale.setTitolo(allegatoPrincipaleTitolo);
          allegato_principale.setNomeFile(allegati[0].getNome());
          allegato_principale.setFile(allegati[0].getContenuto());
        }
        Documento[] altri_allegati = new Documento[0];
        if (allegati.length > 1) {
          altri_allegati = new Documento[allegati.length - 1];
          for (int i = 1; i < allegati.length; i++) {
            Documento d = new Documento();

            String altriAllegatiTitolo = allegati[i].getTitolo();
            if (altriAllegatiTitolo != null) {
              if (altriAllegatiTitolo.length() > 100) {
                altriAllegatiTitolo = altriAllegatiTitolo.substring(0, 100);
              }
            }

            d.setTitolo(altriAllegatiTitolo);
            d.setNomeFile(allegati[i].getNome());
            d.setFile(allegati[i].getContenuto());
            altri_allegati[i - 1] = d;
          }
        }

        // Gestione del fascicolo.
        String titolarioFascicoloINFOR = null;
        Long annoFascicoloINFOR = null;
        String numeroFascicoloINFOR = null;

        Classificazione datiClassificaINFOR = new Classificazione();
        if (WSDMInserimentoInFascicolo.SI_FASCICOLO_ESISTENTE.equals(wsdmprotocolloDocumentoIn.getInserimentoInFascicolo())) {
          if (wsdmprotocolloDocumentoIn.getFascicolo() != null) {
            titolarioFascicoloINFOR = wsdmprotocolloDocumentoIn.getFascicolo().getClassificaFascicolo();
            annoFascicoloINFOR = wsdmprotocolloDocumentoIn.getFascicolo().getAnnoFascicolo();
            numeroFascicoloINFOR = wsdmprotocolloDocumentoIn.getFascicolo().getNumeroFascicolo();
            datiClassificaINFOR.setTitolario(titolarioFascicoloINFOR);
            Fascicolo riferimentoFascicoloINFOR = new Fascicolo();
            riferimentoFascicoloINFOR.setAnno(annoFascicoloINFOR.toString());
            riferimentoFascicoloINFOR.setNumero(numeroFascicoloINFOR);
            datiClassificaINFOR.setFascicolo(riferimentoFascicoloINFOR);
          }
        } else if (WSDMInserimentoInFascicolo.SI_FASCICOLO_NUOVO.equals(wsdmprotocolloDocumentoIn.getInserimentoInFascicolo())) {
          WSDMFascicoloIn wsdmFascicoloIn = new WSDMFascicoloIn();
          wsdmFascicoloIn.setOggettoFascicolo(wsdmprotocolloDocumentoIn.getFascicolo().getOggettoFascicolo());
          wsdmFascicoloIn.setClassificaFascicolo(wsdmprotocolloDocumentoIn.getFascicolo().getClassificaFascicolo());
          WSDMFascicoloRes wsdmFascicoloRes = _fascicoloInserisci(username, password, loginAttr, wsdmprotocolloDocumentoIn.getFascicolo());
          if (wsdmFascicoloRes.isEsito()) {
            titolarioFascicoloINFOR = wsdmprotocolloDocumentoIn.getFascicolo().getClassificaFascicolo();
            annoFascicoloINFOR = wsdmFascicoloRes.getFascicolo().getAnnoFascicolo();
            numeroFascicoloINFOR = wsdmFascicoloRes.getFascicolo().getNumeroFascicolo();
            datiClassificaINFOR.setTitolario(titolarioFascicoloINFOR);
            Fascicolo riferimentoFascicoloINFOR = new Fascicolo();
            riferimentoFascicoloINFOR.setAnno(annoFascicoloINFOR.toString());
            riferimentoFascicoloINFOR.setNumero(numeroFascicoloINFOR);
            datiClassificaINFOR.setFascicolo(riferimentoFascicoloINFOR);
          } else {
            throw new Exception("L'inserimento del nuovo fascicolo segnala l'errore: " + wsdmFascicoloRes.getMessaggio());
          }
        }

        // Richiesta di protocollo
        String esitoProtocolla = "";
        String messaggioProtocolla = "";

        Segnatura segnatura = new Segnatura();

        WSDMProtocolloInOut inout = wsdmprotocolloDocumentoIn.getInout();

        if (inout == WSDMProtocolloInOut.IN) {
          InserisciArrivo.RichiestaProtocollaArrivo richiestaProtocollaArrivo = new InserisciArrivo.RichiestaProtocollaArrivo();

          // Utente
          richiestaProtocollaArrivo.setUsername(username);

          ProtocollaArrivo pa = new ProtocollaArrivo();

          // Registro
          Registro registro = new Registro();
          registro.setCodice(wsdmprotocolloDocumentoIn.getCodiceRegistro());
          pa.setRegistro(registro);

          // Oggetto del protocollo
          if (wsdmprotocolloDocumentoIn.getOggetto() != null) {
            pa.setOggetto(wsdmprotocolloDocumentoIn.getOggetto().toUpperCase());
          }

          // Tipo documento
          if (wsdmprotocolloDocumentoIn.getTipoDocumento() != null) {
            AltriDati altriDati = new AltriDati();
            TipoDocumento tipoDocumento = new TipoDocumento();
            tipoDocumento.setCodice(wsdmprotocolloDocumentoIn.getTipoDocumento());
            altriDati.setTipoDocumento(tipoDocumento);
            pa.setAltriDati(altriDati);
          }

          // Mittenti
          WSDMProtocolloAnagrafica[] mittentiDestinatari = wsdmprotocolloDocumentoIn.getMittenti();
          Soggetti soggetti = _gestioneSoggettiMittentiDestinatari(username, mittentiDestinatari);
          pa.setSoggetti(soggetti);

          // Smistamento, idUnitaOperativaDestinataria
          Corrispondente corrispondente = new Corrispondente();
          corrispondente.setCodice(wsdmprotocolloDocumentoIn.getIdUnitaOperativaDestinataria());
          Smistamento smistamento = new Smistamento();
          smistamento.setCorrispondente(corrispondente);
          Smistamenti smistamenti = new Smistamenti();
          smistamenti.getSmistamento().add(smistamento);
          pa.setSmistamenti(smistamenti);

          // Corrispondente, idUnitaOperativaMittente
          Corrispondente corrispondente_mittente_interno = new Corrispondente();
          corrispondente_mittente_interno.setCodice(wsdmprotocolloDocumentoIn.getIdUnitaOperativaDestinataria());
          pa.setCorrispondente(corrispondente_mittente_interno);

          // Fascicolo e classificazione
          pa.setClassificazione(datiClassificaINFOR);

          richiestaProtocollaArrivo.setProtocollaArrivo(pa);

          // Allegato principale
          if (allegato_principale != null) {
            richiestaProtocollaArrivo.setDocumento(allegato_principale);
          }

          InserisciArrivoResponse.RispostaProtocolla rispostaProtocolla = this.getJProtocolloServices().inserisciArrivo(
              richiestaProtocollaArrivo);

          // Lettura della risposta
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

          // Utente
          richiestaProtocollaPartenza.setUsername(username);

          ProtocollaPartenza pp = new ProtocollaPartenza();

          // Registro
          Registro registro = new Registro();
          registro.setCodice(wsdmprotocolloDocumentoIn.getCodiceRegistro());
          pp.setRegistro(registro);

          // Oggetto
          if (wsdmprotocolloDocumentoIn.getOggetto() != null) {
            pp.setOggetto(wsdmprotocolloDocumentoIn.getOggetto().toUpperCase());
          }

          // Tipo documento
          if (wsdmprotocolloDocumentoIn.getTipoDocumento() != null) {
            AltriDati altriDati = new AltriDati();
            TipoDocumento tipoDocumento = new TipoDocumento();
            tipoDocumento.setCodice(wsdmprotocolloDocumentoIn.getTipoDocumento());
            altriDati.setTipoDocumento(tipoDocumento);
            pp.setAltriDati(altriDati);
          }

          // Destinatari
          WSDMProtocolloAnagrafica[] mittentiDestinatari = wsdmprotocolloDocumentoIn.getDestinatari();
          Soggetti soggetti = _gestioneSoggettiMittentiDestinatari(username, mittentiDestinatari);
          pp.setSoggetti(soggetti);

          // Smistamento, idUnitaOperativaDestinataria
          Corrispondente corrispondente = new Corrispondente();
          corrispondente.setCodice(wsdmprotocolloDocumentoIn.getIdUnitaOperativaMittente());
          Smistamento smistamento = new Smistamento();
          smistamento.setCorrispondente(corrispondente);
          Smistamenti smistamenti = new Smistamenti();
          smistamenti.getSmistamento().add(smistamento);
          pp.setSmistamenti(smistamenti);

          // Corrispondente, idUnitaOperativaMittente
          Corrispondente corrispondente_mittente_interno = new Corrispondente();
          corrispondente_mittente_interno.setCodice(wsdmprotocolloDocumentoIn.getIdUnitaOperativaMittente());
          pp.setCorrispondente(corrispondente_mittente_interno);

          // Fascicolo e classificazione
          pp.setClassificazione(datiClassificaINFOR);

          richiestaProtocollaPartenza.setProtocollaPartenza(pp);

          // Allegato principale
          if (allegato_principale != null) {
            richiestaProtocollaPartenza.setDocumento(allegato_principale);
          }

          InserisciPartenzaResponse.RispostaProtocolla rispostaProtocolla = this.getJProtocolloServices().inserisciPartenza(
              richiestaProtocollaPartenza);

          // Lettura dell'esito
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

          // Utente
          richiestaProtocollaInterno.setUsername(username);
          ProtocollaInterno pi = new ProtocollaInterno();

          // Registro
          Registro registro = new Registro();
          registro.setCodice(wsdmprotocolloDocumentoIn.getCodiceRegistro());
          pi.setRegistro(registro);

          // Oggetto
          if (wsdmprotocolloDocumentoIn.getOggetto() != null) {
            pi.setOggetto(wsdmprotocolloDocumentoIn.getOggetto().toUpperCase());
          }

          // Tipo documento
          if (wsdmprotocolloDocumentoIn.getTipoDocumento() != null) {
            AltriDati altriDati = new AltriDati();
            TipoDocumento tipoDocumento = new TipoDocumento();
            tipoDocumento.setCodice(wsdmprotocolloDocumentoIn.getTipoDocumento());
            altriDati.setTipoDocumento(tipoDocumento);
            pi.setAltriDati(altriDati);
          }

          // Smistamento, idUnitaOperativaDestinataria
          Smistamento smistamento = new Smistamento();
          Corrispondente corrispondente = new Corrispondente();
          corrispondente.setCodice(wsdmprotocolloDocumentoIn.getIdUnitaOperativaDestinataria());
          smistamento.setCorrispondente(corrispondente);
          Smistamenti smistamenti = new Smistamenti();
          smistamenti.getSmistamento().add(smistamento);
          pi.setSmistamenti(smistamenti);

          // Corrispondente, idUnitaOperativaMittente
          Corrispondente corrispondente_mittente_interno = new Corrispondente();
          corrispondente_mittente_interno.setCodice(wsdmprotocolloDocumentoIn.getIdUnitaOperativaMittente());
          pi.setCorrispondente(corrispondente_mittente_interno);

          // Fascicolo e classificazione
          pi.setClassificazione(datiClassificaINFOR);

          richiestaProtocollaInterno.setProtocollaInterno(pi);

          // Allegato principale
          if (allegato_principale != null) {
            richiestaProtocollaInterno.setDocumento(allegato_principale);
          }

          InserisciInternoResponse.RispostaProtocolla rispostaProtocolla = this.getJProtocolloServices().inserisciInterno(
              richiestaProtocollaInterno);

          // Lettura della risposta
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
        // Fine gestione verso del protocollo

        // Se il protocollo e' andato a buon fine si inseriscono gli allegati
        // successivi al primo
        if (esitoProtocolla.equals("OK")) {

          // Anno del protocollo
          protocolloDocumento.setAnnoProtocollo(Long.parseLong(segnatura.getAnno()));

          // Numero del protocollo
          protocolloDocumento.setNumeroProtocollo(segnatura.getNumero());

          // Data del protocollo
          SimpleDateFormat sdf2 = new SimpleDateFormat("dd/MM/yyyy hh:mm");
          Date data = sdf2.parse(segnatura.getData() + " " + segnatura.getOra());
          protocolloDocumento.setDataProtocollo(data);

          // Altri allegati, devo essere associati al protocollo appena creato
          Riferimento riferimentoProtocolloCreato = new Riferimento();
          riferimentoProtocolloCreato.setRegistro(segnatura.getRegistro());
          riferimentoProtocolloCreato.setAnno(segnatura.getAnno());
          riferimentoProtocolloCreato.setNumero(segnatura.getNumero());

          for (int i = 0; i < altri_allegati.length; i++) {

            AllegaDocumento.RichiestaAllegaDocumento richiestaAllegaDocumento = new AllegaDocumento.RichiestaAllegaDocumento();
            // Riferimento al protocollo appena creato
            richiestaAllegaDocumento.setRiferimento(riferimentoProtocolloCreato);

            // Utente
            richiestaAllegaDocumento.setUsername(username);

            // Allegato
            richiestaAllegaDocumento.setDocumento(altri_allegati[i]);

            // Invio al protocollo
            AllegaDocumentoResponse.RispostaAllegaDocumento rispostaAllegaDocumento = this.getJProtocolloServices().allegaDocumento(
                richiestaAllegaDocumento);

            // Lettura esito
            if (!rispostaAllegaDocumento.getEsito().equals("OK")) {
              wsdmProtocolloDocumentoRes.setMessaggio(rispostaAllegaDocumento.getMessaggio());
              return wsdmProtocolloDocumentoRes;
            }

          }

        } else {
          wsdmProtocolloDocumentoRes.setMessaggio(messaggioProtocolla);
          return wsdmProtocolloDocumentoRes;
        }
        // Fine gestione allegati

        wsdmProtocolloDocumentoRes.setProtocolloDocumento(protocolloDocumento);

        // Inserimento dei riferimento al fascicolo
        if (wsdmProtocolloDocumentoRes.getProtocolloDocumento() != null) {
          if (annoFascicoloINFOR != null && numeroFascicoloINFOR != null) {
            WSDMFascicolo wsdmFascicolo = new WSDMFascicolo();
            wsdmFascicolo.setAnnoFascicolo(annoFascicoloINFOR);
            wsdmFascicolo.setNumeroFascicolo(numeroFascicoloINFOR);
            wsdmProtocolloDocumentoRes.getProtocolloDocumento().setFascicolo(wsdmFascicolo);
          }
        }

        wsdmProtocolloDocumentoRes.setEsito(true);

      } catch (WebServiceException w) {
        wsdmProtocolloDocumentoRes.setEsito(false);
        wsdmProtocolloDocumentoRes.setMessaggio(WS_ERROR + " " + w.getMessage());
        logger.error("Errore (_protocolloInserisci)", w);
      } catch (NamingException e) {
        wsdmProtocolloDocumentoRes.setEsito(false);
        wsdmProtocolloDocumentoRes.setMessaggio(NAMING_ERROR + " " + e.getMessage());
        logger.error("Errore (_protocolloInserisci)", e);
      } catch (Throwable t) {
        wsdmProtocolloDocumentoRes.setEsito(false);
        wsdmProtocolloDocumentoRes.setMessaggio(t.getMessage());
        logger.error("Errore (_protocolloInserisci)", t);
      }
    } else

    {
      wsdmProtocolloDocumentoRes.setEsito(false);
      wsdmProtocolloDocumentoRes.setMessaggio(messaggioCtr.toString());
    }
    return wsdmProtocolloDocumentoRes;
  }

  /**
   * Gestione dei mittenti e dei destinatari come soggetti liberi
   * 
   * @param username
   * @param mittentiDestinatari
   * @return
   * @throws Exception
   */
  private Soggetti _gestioneSoggettiMittentiDestinatari(String username, WSDMProtocolloAnagrafica[] mittentiDestinatari) throws Exception {
    Soggetti soggetti = new Soggetti();
    List<Object> listasoggetti = soggetti.getSoggettoOrAnagraficaOrAmministrazione();
    for (int i = 0; i < mittentiDestinatari.length; i++) {
      WSDMProtocolloAnagrafica wsdmProtocolloAnagrafica = mittentiDestinatari[i];

      Soggetto soggetto = new Soggetto();

      // Denominazione o denominazione composta
      if (wsdmProtocolloAnagrafica.getNome() == null) {
        soggetto.setDenominazione(wsdmProtocolloAnagrafica.getCognomeointestazione());
      } else {
        soggetto.setDenominazione(wsdmProtocolloAnagrafica.getCognomeointestazione() + " " + wsdmProtocolloAnagrafica.getNome());
      }

      // Indirizzo email
      if (wsdmProtocolloAnagrafica.getEmail() != null) {
        soggetto.setIndirizzo(wsdmProtocolloAnagrafica.getEmail());
      }
      listasoggetti.add(soggetto);
    }
    return soggetti;
  }

  /**
   * Gestione dei mittenti e dei destinatari come anagrafica INFOR
   * 
   * @param username
   * @param mittentiDestinatari
   * @return
   * @throws Exception
   */
  private Soggetti _gestioneAnagraficaMittentiDestinatari(String username, WSDMProtocolloAnagrafica[] mittentiDestinatari)
      throws Exception {
    Soggetti soggetti = new Soggetti();
    List<Object> listasoggetti = soggetti.getSoggettoOrAnagraficaOrAmministrazione();
    for (int i = 0; i < mittentiDestinatari.length; i++) {
      WSDMProtocolloAnagrafica wsdmProtocolloAnagrafica = mittentiDestinatari[i];
      String codiceAnagraficaINFOR = _gestioneAnagraficaINFOR(username, wsdmProtocolloAnagrafica);

      Anagrafica anagrafica = new Anagrafica();

      // Codice anagrafico INFOR
      if (codiceAnagraficaINFOR != null && !"".equals(codiceAnagraficaINFOR.trim())) {
        anagrafica.setCodice(codiceAnagraficaINFOR);
      }

      // Denominazione o denominazione composta
      if (wsdmProtocolloAnagrafica.getNome() == null) {
        anagrafica.setDenominazione(wsdmProtocolloAnagrafica.getCognomeointestazione());
      } else {
        anagrafica.setDenominazione(wsdmProtocolloAnagrafica.getCognomeointestazione() + " " + wsdmProtocolloAnagrafica.getNome());
      }

      // Indirizzo email
      if (wsdmProtocolloAnagrafica.getEmail() != null) {
        anagrafica.setEmail(wsdmProtocolloAnagrafica.getEmail());
      }
      listasoggetti.add(anagrafica);
    }
    return soggetti;
  }

  /**
   * Gestione dell'anagrafica INFOR. Si deve prima cercare l'anagrafica con
   * l'operazione SEARCH e ricavare il codice anagrafico da utilizzare nella
   * richiesta di protocollo. Se la ricerca SEARCH non restituisce nulla, si
   * deve effettuare l'inserimento con l'operazione INSERT. Anche in questo
   * secondo caso, se l'operazione va a buon fine si ottiene il codice
   * anagrafico.
   * 
   * @param username
   * @param wsdmProtocolloAnagrafica
   * @return
   * @throws Exception
   */
  private String _gestioneAnagraficaINFOR(String username, WSDMProtocolloAnagrafica wsdmProtocolloAnagrafica) throws Exception {

    String codiceAnagraficaINFOR = null;

    // Ricerca esistenza anagrafica
    GestioneAnagrafica gestioneAnagraficaSEARCH = new GestioneAnagrafica();
    RichiestaGestioneAnagrafica richiestaGestioneAnagraficaSEARCH = new RichiestaGestioneAnagrafica();

    // Tipo di operazione
    richiestaGestioneAnagraficaSEARCH.setOperazione("SEARCH");

    // Utente
    richiestaGestioneAnagraficaSEARCH.setUsername(username);

    // Dati per la ricerca dell'anagrafica
    AnagraficaType anagraficaSEARCH = new AnagraficaType();

    // Denominazione
    if (wsdmProtocolloAnagrafica.getCognomeointestazione() != null) {
      anagraficaSEARCH.setCognomeDenom(wsdmProtocolloAnagrafica.getCognomeointestazione());
    }

    // Nome
    if (wsdmProtocolloAnagrafica.getNome() != null) {
      anagraficaSEARCH.setNome(wsdmProtocolloAnagrafica.getNome());
    }

    // Codice fiscale
    if (wsdmProtocolloAnagrafica.getCodiceFiscale() != null) {
      anagraficaSEARCH.setCodFiscale(wsdmProtocolloAnagrafica.getCodiceFiscale());
    }

    // Partita IVA
    if (wsdmProtocolloAnagrafica.getPartitaIVA() != null) {
      anagraficaSEARCH.setPartitaIva(wsdmProtocolloAnagrafica.getPartitaIVA());
    }

    // Email
    if (wsdmProtocolloAnagrafica.getEmail() != null) {
      anagraficaSEARCH.setEmail(wsdmProtocolloAnagrafica.getEmail());
    }

    richiestaGestioneAnagraficaSEARCH.setAnagrafica(anagraficaSEARCH);

    // Parametri ricerca (paginazione, dimensione)
    DatiRicercaAnagraficaType datiRicercaAnagrafica = new DatiRicercaAnagraficaType();
    datiRicercaAnagrafica.setInizioPag(BigInteger.ZERO);
    datiRicercaAnagrafica.setDimensionePag(BigInteger.valueOf(100));
    richiestaGestioneAnagraficaSEARCH.setDatiRicerca(datiRicercaAnagrafica);

    gestioneAnagraficaSEARCH.setRichiestaGestioneAnagrafica(richiestaGestioneAnagraficaSEARCH);

    GestioneAnagraficaResponse gestioneAnagraficaSEARCHResponse = this.getJProtocolloGenServices().gestioneAnagrafica(
        gestioneAnagraficaSEARCH);
    if (gestioneAnagraficaSEARCHResponse.getRispostaGestioneAnagrafica().getEsito().equals("OK")) {
      if (gestioneAnagraficaSEARCHResponse.getRispostaGestioneAnagrafica().getAnagrafica() != null
          && gestioneAnagraficaSEARCHResponse.getRispostaGestioneAnagrafica().getAnagrafica().size() > 0) {
        // Ricavo il codice dell'anagrafica cercata, si considera il
        // primo risultato delle lista
        List<AnagraficaType> listaAnagraficheSEARCH = gestioneAnagraficaSEARCHResponse.getRispostaGestioneAnagrafica().getAnagrafica();
        codiceAnagraficaINFOR = listaAnagraficheSEARCH.get(0).getCodice();
      }
    } else {
      throw new Exception(gestioneAnagraficaSEARCHResponse.getRispostaGestioneAnagrafica().getMessaggio());
    }

    if (codiceAnagraficaINFOR == null || (codiceAnagraficaINFOR != null && "".equals(codiceAnagraficaINFOR.trim()))) {
      // Se il codice anagrafico e' nulla si tenta l'inserimento
      GestioneAnagrafica gestioneAnagraficaINSERT = new GestioneAnagrafica();
      RichiestaGestioneAnagrafica richiestaGestioneAnagraficaINSERT = new RichiestaGestioneAnagrafica();

      // Tipo di operazione
      richiestaGestioneAnagraficaINSERT.setOperazione("INSERT");

      // Utente
      richiestaGestioneAnagraficaINSERT.setUsername(username);

      // Dati per la ricerca dell'anagrafica
      AnagraficaType anagraficaINSERT = new AnagraficaType();

      // Denominazione
      if (wsdmProtocolloAnagrafica.getCognomeointestazione() != null) {
        anagraficaINSERT.setCognomeDenom(wsdmProtocolloAnagrafica.getCognomeointestazione());
      }

      // Nome
      if (wsdmProtocolloAnagrafica.getNome() != null) {
        anagraficaINSERT.setNome(wsdmProtocolloAnagrafica.getNome());
      }

      // Codice fiscale
      if (wsdmProtocolloAnagrafica.getCodiceFiscale() != null) {
        anagraficaINSERT.setCodFiscale(wsdmProtocolloAnagrafica.getCodiceFiscale());
      }

      // Partita IVA
      if (wsdmProtocolloAnagrafica.getPartitaIVA() != null) {
        anagraficaINSERT.setPartitaIva(wsdmProtocolloAnagrafica.getPartitaIVA());
      }

      // Email
      if (wsdmProtocolloAnagrafica.getEmail() != null) {
        anagraficaINSERT.setEmail(wsdmProtocolloAnagrafica.getEmail());
      }

      richiestaGestioneAnagraficaINSERT.setAnagrafica(anagraficaINSERT);
      gestioneAnagraficaINSERT.setRichiestaGestioneAnagrafica(richiestaGestioneAnagraficaINSERT);

      GestioneAnagraficaResponse gestioneAnagraficaINSERTResponse = this.getJProtocolloGenServices().gestioneAnagrafica(
          gestioneAnagraficaINSERT);
      if (gestioneAnagraficaINSERTResponse.getRispostaGestioneAnagrafica().getEsito().equals("OK")) {
        if (gestioneAnagraficaINSERTResponse.getRispostaGestioneAnagrafica().getAnagrafica() != null
            && gestioneAnagraficaINSERTResponse.getRispostaGestioneAnagrafica().getAnagrafica().size() > 0) {
          // Ricavo il codice dell'anagrafica inserita
          List<AnagraficaType> listaAnagraficheSEARCH = gestioneAnagraficaINSERTResponse.getRispostaGestioneAnagrafica().getAnagrafica();
          codiceAnagraficaINFOR = listaAnagraficheSEARCH.get(0).getCodice();
        }
      } else {
        throw new Exception(gestioneAnagraficaSEARCHResponse.getRispostaGestioneAnagrafica().getMessaggio());
      }
    }

    return codiceAnagraficaINFOR;
  }

  @Override
  public WSDMProtocolloDocumentoRes _documentoInserisci(String username, String password, WSDMLoginAttr loginAttr,
      WSDMProtocolloDocumentoIn wsdmprotocolloDocumentoIn) {
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

    WSDMFascicoloRes wsdmFascicoloRes = new WSDMFascicoloRes();

    wsdmFascicoloRes.setEsito(false);
    try {
      StringBuffer messaggioCtr = new StringBuffer();
      if (Infor2UtilityControllo.ctrFascicoloInserisci(loginAttr, wsdmfascicoloIn, messaggioCtr)) {

        GestioneFascicoli gestioneFascicoli = new GestioneFascicoli();
        RichiestaGestioneFascicoli richiestaGestioneFascicoli = new RichiestaGestioneFascicoli();

        // Utente
        richiestaGestioneFascicoli.setUsername(username);

        // Tipo di operazione
        richiestaGestioneFascicoli.setOperazione("INSERT");

        // Oggetto
        FascicoloDettaglioType fascicoloDettaglio = new FascicoloDettaglioType();
        fascicoloDettaglio.setDescrizione(wsdmfascicoloIn.getOggettoFascicolo());

        // Data di creazione
        SimpleDateFormat sdf = new SimpleDateFormat("yyyyMMdd");
        fascicoloDettaglio.setDataCreazione(sdf.format(new Date()));

        // Classifica
        TitolarioType titolario = new TitolarioType();
        titolario.setCodice(wsdmfascicoloIn.getClassificaFascicolo());
        fascicoloDettaglio.setTitolario(titolario);

        // Corrispondente (si ricava dall'attributo "struttura")
        if (wsdmfascicoloIn.getStruttura() != null) {
          Ufficio ufficio = new Ufficio();
          CorrispondenteType corrispondente = new CorrispondenteType();
          corrispondente.setCodice(wsdmfascicoloIn.getStruttura());
          ufficio.setCorrispondente(corrispondente);
          fascicoloDettaglio.setUfficio(ufficio);
        }

        richiestaGestioneFascicoli.setFascicolo(fascicoloDettaglio);
        gestioneFascicoli.setRichiestaGestioneFascicoli(richiestaGestioneFascicoli);

        // Invocazione dell'operazione e lettura della risposta
        GestioneFascicoliResponse response = this.getJProtocolloGenServices().gestioneFascicoli(gestioneFascicoli);
        if (response.getRispostaGestioneFascicoli().getEsito().equals("OK")
            && response.getRispostaGestioneFascicoli().getFascicolo().size() > 0) {
          WSDMFascicolo fascicolo = new WSDMFascicolo();
          fascicolo.setAnnoFascicolo(Long.parseLong(response.getRispostaGestioneFascicoli().getFascicolo().get(0).getAnno()));
          fascicolo.setNumeroFascicolo(response.getRispostaGestioneFascicoli().getFascicolo().get(0).getNumero());
          wsdmFascicoloRes.setFascicolo(fascicolo);
          wsdmFascicoloRes.setEsito(true);
        } else {
          wsdmFascicoloRes.setMessaggio(response.getRispostaGestioneFascicoli().getMessaggio());
        }
      } else {
        wsdmFascicoloRes.setEsito(false);
        wsdmFascicoloRes.setMessaggio(messaggioCtr.toString());
      }
    } catch (WebServiceException w) {
      wsdmFascicoloRes.setEsito(false);
      wsdmFascicoloRes.setMessaggio(WS_ERROR + " " + w.getMessage());
      logger.error("Errore (_fascicoloInserisci)", w);
    } catch (NamingException e) {
      wsdmFascicoloRes.setEsito(false);
      wsdmFascicoloRes.setMessaggio(NAMING_ERROR + " " + e.getMessage());
      logger.error("Errore (_fascicoloInserisci)", e);
    } catch (Throwable t) {
      wsdmFascicoloRes.setEsito(false);
      wsdmFascicoloRes.setMessaggio(t.getMessage());
      logger.error("Errore (_fascicoloInserisci)", t);
    }
    return wsdmFascicoloRes;
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
      Long annoFascicolo, String numeroFascicolo, String classificaFascicolo, String oggettoFascicolo) {
    return _fascicoloMetadatiLeggi(username, password, loginAttr, codiceFascicolo, annoFascicolo, numeroFascicolo, classificaFascicolo,
        oggettoFascicolo);
  }

  @Override
  public WSDMFascicoloRes _fascicoloMetadatiLeggi(String username, String password, WSDMLoginAttr loginAttr, String codiceFascicolo,
      Long annoFascicolo, String numeroFascicolo, String classificaFascicolo, String oggettoFascicolo) {

    WSDMFascicoloRes wsdmFascicoloRes = new WSDMFascicoloRes();

    wsdmFascicoloRes.setEsito(false);

    try {
      GestioneFascicoli gestioneFascicoli = new GestioneFascicoli();
      RichiestaGestioneFascicoli richiestaGestioneFascicoli = new RichiestaGestioneFascicoli();

      // Utente
      richiestaGestioneFascicoli.setUsername(username);

      // Operazione
      richiestaGestioneFascicoli.setOperazione("VIEW");

      FascicoloDettaglioType fascicoloDettaglio = new FascicoloDettaglioType();

      // Anno
      fascicoloDettaglio.setAnno(annoFascicolo + "");

      // Numero
      fascicoloDettaglio.setNumero(numeroFascicolo);

      // Classifica
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

      // Invio della richiesta
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
          fascicolo.setOggettoFascicolo(fascicolo_infor.getDescrizione());
          fascicolo.setClassificaFascicolo(fascicolo_infor.getTitolario().getCodice());

          // Lettura degli elementi documentali contenuti
          // List<AllegatoDettaglioType> listaElementiDocumentali =
          // rispostaGestioneFascicoli.getAllegato();
          // if (listaElementiDocumentali != null &&
          // listaElementiDocumentali.size() > 0) {
          // WSDMFascicoloDocumento[] wsdmFascicoloDocumenti = new
          // WSDMFascicoloDocumento[listaElementiDocumentali.size()];
          // for (int el = 0; el < listaElementiDocumentali.size(); el++) {
          //
          // AllegatoDettaglioType elementoDocumentale =
          // listaElementiDocumentali.get(el);
          //
          // wsdmFascicoloDocumenti[el] = new WSDMFascicoloDocumento();
          //
          // // Anno protocollo
          // wsdmFascicoloDocumenti[el].setAnnoProtocollo(Long.parseLong(elementoDocumentale.getDatiProtocollo().getAnno()));
          //
          // // Data protocollo
          // try {
          // String resDocumentoDataProtocollo =
          // elementoDocumentale.getDatiProtocollo().getData();
          // Date dataProtocollo = new
          // SimpleDateFormat("yyyymmdd").parse(resDocumentoDataProtocollo);
          // wsdmFascicoloDocumenti[el].setDataProtocollo(dataProtocollo);
          // } catch (Exception e) {
          //
          // }
          //
          // // Numero protocollo
          // wsdmFascicoloDocumenti[el].setNumeroProtocollo(elementoDocumentale.getDatiProtocollo().getNumero());
          //
          // // Oggetto
          // wsdmFascicoloDocumenti[el].setOggetto(elementoDocumentale.getOggetto());
          // }
          // fascicolo.setDocumenti(wsdmFascicoloDocumenti);
          // }
        }

        wsdmFascicoloRes.setFascicolo(fascicolo);
        wsdmFascicoloRes.setEsito(true);
      } else {
        wsdmFascicoloRes.setMessaggio(response.getRispostaGestioneFascicoli().getMessaggio());
      }
    } catch (Exception ex) {
      wsdmFascicoloRes.setMessaggio(ex.getMessage());
    }
    return wsdmFascicoloRes;
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
    WSDMInviaMailRes wsdmInviaMailRes = new WSDMInviaMailRes();

    try {
      StringBuffer messaggioCtr = new StringBuffer();
      if (Infor2UtilityControllo.ctrInviaMail(loginAttr, wsdmInviaMail, messaggioCtr)) {

        RichiestaInviaProtocollo richiestaInvioProtocollo = new RichiestaInviaProtocollo();

        // Utente
        richiestaInvioProtocollo.setUsername(username);

        // Riferimenti
        Riferimento riferimento = new Riferimento();

        // Numero protocollo
        String numeroProtocollo = wsdmInviaMail.getNumeroProtocollo();
        if (numeroProtocollo != null) {
          riferimento.setNumero(numeroProtocollo);
        }

        // Anno protocollo
        Long annoProtocollo = wsdmInviaMail.getAnnoProtocollo();
        if (annoProtocollo != null) {
          riferimento.setAnno(annoProtocollo.toString());
        }

        // Registro protocollo
        String codiceRegistro = wsdmInviaMail.getCodiceRegistro();
        if (codiceRegistro != null) {
          Registro registro = new Registro();
          registro.setCodice(codiceRegistro);
          riferimento.setRegistro(registro);
        }

        richiestaInvioProtocollo.setRiferimento(riferimento);

        // Richiesta e lettura della risposta
        RispostaInviaProtocollo rispostaInviaProtocollo = this.getJProtocolloServices().inviaProtocollo(richiestaInvioProtocollo);

        if (rispostaInviaProtocollo.getEsito().equals("OK")) {
          wsdmInviaMailRes.setEsito(true);
          wsdmInviaMailRes.setMessaggio(rispostaInviaProtocollo.getMessaggio());
        } else {
          wsdmInviaMailRes.setEsito(false);
          wsdmInviaMailRes.setMessaggio(rispostaInviaProtocollo.getMessaggio());
        }

      } else {
        wsdmInviaMailRes.setEsito(false);
        wsdmInviaMailRes.setMessaggio(messaggioCtr.toString());
      }

    } catch (WebServiceException w) {
      wsdmInviaMailRes.setEsito(false);
      wsdmInviaMailRes.setMessaggio(WS_ERROR + " " + w.getMessage());
      logger.error("Errore (_inviaMail)", w);
    } catch (NamingException e) {
      wsdmInviaMailRes.setEsito(false);
      wsdmInviaMailRes.setMessaggio(NAMING_ERROR + " " + e.getMessage());
      logger.error("Errore (_inviaMail)", e);
    } catch (Throwable t) {
      wsdmInviaMailRes.setEsito(false);
      wsdmInviaMailRes.setMessaggio(t.getMessage());
      logger.error("Errore (_inviaMail)", t);
    }

    return wsdmInviaMailRes;
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
  public WSDMListaAccountEmailRes _listaAccountEmail(String username, String password, WSDMLoginAttr loginAttr,
      WSDMRicercaAccountEmail ricercaAccountEmail) {
    WSDMListaAccountEmailRes wsdmListaAccountEmailRes = new WSDMListaAccountEmailRes();
    wsdmListaAccountEmailRes.setEsito(false);
    wsdmListaAccountEmailRes.setMessaggio(OPERATION_NOT_SUPPORTED);
    return wsdmListaAccountEmailRes;
  }

  @Override
  public WSDMRicercaFascicoloRes _fascicoloRicerca(String username, String password, WSDMLoginAttr loginAttr,
      WSDMRicercaFascicolo ricercaFascicolo) {
    WSDMRicercaFascicoloRes wsdmRicercaFascicoloRes = new WSDMRicercaFascicoloRes();
    wsdmRicercaFascicoloRes.setEsito(false);
    wsdmRicercaFascicoloRes.setMessaggio(OPERATION_NOT_SUPPORTED);
    return wsdmRicercaFascicoloRes;
  }

  @Override
  public WSDMProtocolloDocumentoRes _firmaInserisci(String username, String password, WSDMLoginAttr loginAttr,
      WSDMProtocolloDocumentoIn wsdmprotocolloDocumentoIn) {
    WSDMProtocolloDocumentoRes wsdmprotocolloDocumentoRes = new WSDMProtocolloDocumentoRes();
    wsdmprotocolloDocumentoRes.setEsito(false);
    wsdmprotocolloDocumentoRes.setMessaggio(OPERATION_NOT_SUPPORTED);
    return wsdmprotocolloDocumentoRes;
  }

  @Override
  public WSDMProtocolloDocumentoRes _firmaVerifica(String username, String password, WSDMLoginAttr loginAttr, String numeroDocumento) {
    WSDMProtocolloDocumentoRes wsdmprotocolloDocumentoRes = new WSDMProtocolloDocumentoRes();
    wsdmprotocolloDocumentoRes.setEsito(false);
    wsdmprotocolloDocumentoRes.setMessaggio(OPERATION_NOT_SUPPORTED);
    return wsdmprotocolloDocumentoRes;
  }
  
  @Override
  public WSDMProtocolloDocumentoRes _protocolloAsincronoEsito(String username, String password, WSDMLoginAttr loginAttr, String id) {
    WSDMProtocolloDocumentoRes wsdmprotocolloDocumentoRes = new WSDMProtocolloDocumentoRes();
    wsdmprotocolloDocumentoRes.setEsito(false);
    wsdmprotocolloDocumentoRes.setMessaggio(OPERATION_NOT_SUPPORTED);
    return wsdmprotocolloDocumentoRes;
  }
}
