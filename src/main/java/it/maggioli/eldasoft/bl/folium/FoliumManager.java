package it.maggioli.eldasoft.bl.folium;

import it.dedagroup.ws.protocolla.om.xsd.Errore;
import it.dedagroup.ws.protocolla.om.xsd.Esito;
import it.dedagroup.ws.protocolla.response.xsd.RispostaProtocolla;
import it.dedagroup.ws.protocolla.servizi.Protocolla;
import it.dedagroup.ws.protocolla.servizi.ProtocollaPortType;
import it.dedagroup.ws.salvadocumento.response.xsd.RispostaSalvaDocumento;
import it.dedagroup.ws.salvadocumento.servizi.SalvaDocumento;
import it.dedagroup.ws.salvadocumento.servizi.SalvaDocumentoPortType;
import it.maggioli.eldasoft.bl.IWSDMManager;
import it.maggioli.eldasoft.ws.dm.WSDMAggiungiAllegatiIn;
import it.maggioli.eldasoft.ws.dm.WSDMAggiungiAllegatiRes;
import it.maggioli.eldasoft.ws.dm.WSDMAnagraficaLeggiRes;
import it.maggioli.eldasoft.ws.dm.WSDMAttoContrattoRes;
import it.maggioli.eldasoft.ws.dm.WSDMDocumentoCollegaRes;
import it.maggioli.eldasoft.ws.dm.WSDMFascicoloIn;
import it.maggioli.eldasoft.ws.dm.WSDMFascicoloModificaIn;
import it.maggioli.eldasoft.ws.dm.WSDMFascicoloModificaRes;
import it.maggioli.eldasoft.ws.dm.WSDMFascicoloRes;
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

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Calendar;
import java.util.Date;
import java.util.List;

import javax.naming.InitialContext;
import javax.naming.NamingException;
import javax.xml.datatype.XMLGregorianCalendar;

import org.apache.cxf.endpoint.Client;
import org.apache.cxf.frontend.ClientProxy;
import org.apache.cxf.message.Message;
import org.apache.log4j.Logger;
import org.apache.xerces.impl.dv.util.Base64;

/**
 * Manager per la gestione documentale.
 * 
 */

public class FoliumManager implements IWSDMManager {

  static Logger              logger                                       = Logger.getLogger(FoliumManager.class);

  static private String      FOLIUM_PROTOCOLLA_WS                         = "java:comp/env/FOLIUM_PROTOCOLLA_WS";
  static private String      FOLIUM_SALVA_DOCUMENTO_WS                    = "java:comp/env/FOLIUM_SALVA_DOCUMENTO_WS";
  static private String      FOLIUM_SPEDISCI_DOCUMENTO_WS                 = "java:comp/env/FOLIUM_SPEDISCI_DOCUMENTO_WS";

  static private String      URL_NOT_DEFINED_FOLIUM_PROTOCOLLA_WS         = "FOLIUM: indirizzo servizio protocollo non definito";
  static private String      URL_NOT_DEFINED_FOLIUM_SALVA_DOCUMENTO_WS    = "FOLIUM: indirizzo servizio salva documento non definito";
  static private String      URL_NOT_DEFINED_FOLIUM_SPEDISCI_DOCUMENTO_WS = "FOLIUM: indirizzo servizio spedisci documento non definito";

  static public final String PROTOCOLLO_IN_INGRESSO                       = "A";
  static public final String PROTOCOLLO_IN_USCITA                         = "P";

  static public final String ESITO_OK                                     = "001";

  static private String      FOLIUM_ESEGUI_SALVA_DOCUMENTO                = "java:comp/env/FOLIUM_ESEGUI_SALVA_DOCUMENTO";
  static public final String ESEGUI_SALVA_DOCUMENTO_SI                    = "SI";

  @Override
  public WSDMListaProfiliRes _listaProfili(String username, String password, String utenteApplicativo) {
    WSDMListaProfiliRes wsdmListaProfiliRes = new WSDMListaProfiliRes();
    wsdmListaProfiliRes.setEsito(false);
    wsdmListaProfiliRes.setMessaggio(OPERATION_NOT_SUPPORTED);
    return wsdmListaProfiliRes;
  }

  @Override
  public WSDMListaAmministrazioniAooRes _listaAmministrazioniAoo(String username, String password) {
    WSDMListaAmministrazioniAooRes wsdmListaAmministrazioniAooRes = new WSDMListaAmministrazioniAooRes();
    wsdmListaAmministrazioniAooRes.setEsito(false);
    wsdmListaAmministrazioniAooRes.setMessaggio(OPERATION_NOT_SUPPORTED);
    return wsdmListaAmministrazioniAooRes;
  }

  @Override
  public WSDMListaUfficiRes _listaUffici(String username, String password, WSDMLoginAttr loginAttr, String codiceAoo,
      String descrizioneUfficio, String utente) {
    WSDMListaUfficiRes wsdmListaUfficiRes = new WSDMListaUfficiRes();
    wsdmListaUfficiRes.setEsito(false);
    wsdmListaUfficiRes.setMessaggio(OPERATION_NOT_SUPPORTED);
    return wsdmListaUfficiRes;
  }

  @Override
  public WSDMProtocolloDocumentoRes _protocolloInserisci(String username, String password, WSDMLoginAttr loginAttr,
      WSDMProtocolloDocumentoIn wsdmprotocolloDocumentoIn) {
    WSDMProtocolloDocumentoRes wsdmprotocolloDocumentoRes = new WSDMProtocolloDocumentoRes();

    try {
      StringBuffer messaggioCtr = new StringBuffer();
      if (FoliumUtilityControllo.ctrProtocolloInserisci(loginAttr, wsdmprotocolloDocumentoIn, messaggioCtr)) {
        _protocolloInserisci(username, password, wsdmprotocolloDocumentoIn, wsdmprotocolloDocumentoRes);
      } else {
        wsdmprotocolloDocumentoRes.setEsito(false);
        wsdmprotocolloDocumentoRes.setMessaggio(messaggioCtr.toString());
      }
    } catch (NamingException e) {
      wsdmprotocolloDocumentoRes.setEsito(false);
      wsdmprotocolloDocumentoRes.setMessaggio(NAMING_ERROR + " " + e.getMessage());
      logger.error("Errore (_protocolloInserisci)", e);
    } catch (Throwable t) {
      wsdmprotocolloDocumentoRes.setEsito(false);
      wsdmprotocolloDocumentoRes.setMessaggio(t.getMessage());
      logger.error("Errore (_protocolloInserisci)", t);
    }

    return wsdmprotocolloDocumentoRes;
  }

  /**
   * Gestione inserimento in protocollo.
   * 
   * @param username
   * @param password
   * @param wsdmprotocolloDocumentoIn
   * @param wsdmprotocolloDocumentoRes
   * @throws NamingException
   * @throws Exception
   */
  private void _protocolloInserisci(String username, String password, WSDMProtocolloDocumentoIn wsdmprotocolloDocumentoIn,
      WSDMProtocolloDocumentoRes wsdmprotocolloDocumentoRes) throws NamingException, Exception {

    boolean esito = false;
    String messaggio = "";

    ProtocollaPortType protocollaPortType = _getProtocollaPortType();

    // Controllo esecuzione "salva documento". Su richiesta della Provincia di
    // Alessandria bisogna inibire le chiamate al servizio "salvaDocumento" per
    // impedire l'inserimento dei documenti nel documentale. Di default si
    // assume che l'inserimento dei documenti venga sempre effettuato. La nuova
    // proprieta' non e' obbligatoria, se non presente si assume di default
    // "SI". Se presente si legge il valore. Vedi JIRA WSDM-42
    String eseguiSalvaDocumento = "SI";

    // Tentativo di lettura del valore di FOLIUM_ESEGUI_SALVA_DOCUMENTO
    try {
      eseguiSalvaDocumento = InitialContext.doLookup(FOLIUM_ESEGUI_SALVA_DOCUMENTO);
    } catch (NamingException e) {

    }

    SalvaDocumentoPortType salvaDocumentoPortType = null;
    if (ESEGUI_SALVA_DOCUMENTO_SI.equals(eseguiSalvaDocumento.toUpperCase())) {
      salvaDocumentoPortType = _getSalvaDocumentoPortType();
    }
    
    // Verso del protocollo
    String verso = null;
    WSDMProtocolloInOut inOut = wsdmprotocolloDocumentoIn.getInout();
    if (WSDMProtocolloInOut.IN.equals(inOut)) {
      verso = PROTOCOLLO_IN_INGRESSO;
    } else if (WSDMProtocolloInOut.OUT.equals(inOut)) {
      verso = PROTOCOLLO_IN_USCITA;
    }

    // anagraficaMittDest - anagrafica mittente/destinatario
    // indirizzoMittDest - indirizzo mittente/destinatario
    // cfpivaMittDest - codice fiscale o partita IVA mittente/destinatario
    List<String> anagraficaMittDest = new ArrayList<String>();
    List<String> indirizzoMittDest = new ArrayList<String>();
    List<String> cfpivaMittDest = new ArrayList<String>();

    if (WSDMProtocolloInOut.IN.equals(inOut)) {
      WSDMProtocolloAnagrafica[] wsdmMittentiDestinatari = wsdmprotocolloDocumentoIn.getMittenti();
      __popolaMittentiDestinatari(wsdmMittentiDestinatari, anagraficaMittDest, indirizzoMittDest, cfpivaMittDest);
    } else if (WSDMProtocolloInOut.OUT.equals(inOut)) {
      // WSDMProtocolloAnagrafica[] wsdmMittentiDestinatari =
      // wsdmprotocolloDocumentoIn.getDestinatari();
      // __popolaMittentiDestinatari(wsdmMittentiDestinatari,
      // anagraficaMittDest, indirizzoMittDest, cfpivaMittDest);

      // 09/01/2020 (JIRA WSDM-33) per le sole protocollazioni in uscita (da
      // appalti) si deve
      // popolare la lista "anagraficaMittDest" con un solo elemento fisso
      // "destinatari diversi".
      // Le altre due liste "indirizzoMittDest" e "cpivaMittDest" vanno popolare
      // con un solo elemento vuoto.
      anagraficaMittDest.add("Destinatari diversi");
      indirizzoMittDest.add("");
      cfpivaMittDest.add("");
    }

    // Oggetto
    String oggetto = wsdmprotocolloDocumentoIn.getOggetto();

    // Titolario
    // Il paramento "titolario di classificazione" e' un array contenente
    // categoria, classe, sottoclasse, sotto-sottoclasse, fascicolo e titolare
    List<String> titolario = new ArrayList<String>();
    if (wsdmprotocolloDocumentoIn.getClassifica() != null) {

      String[] titolario_a = wsdmprotocolloDocumentoIn.getClassifica().split("\\.");
      String[] titolario_b = new String[6];

      if (titolario_a.length >= 1) titolario_b[0] = titolario_a[0];
      if (titolario_a.length >= 2) titolario_b[1] = titolario_a[1];
      if (titolario_a.length >= 3) titolario_b[2] = titolario_a[2];
      if (titolario_a.length >= 4) titolario_b[3] = titolario_a[3];
      if (titolario_a.length >= 5) titolario_b[4] = titolario_a[4];
      if (titolario_a.length >= 6) titolario_b[5] = titolario_a[5];

      titolario = Arrays.asList(titolario_b);
    }

    // Codice ufficio di destinazione/provenienza
    // 09/01/2020 (JIRA WSDM-33) per tutte le protocollazioni popolare
    // l'attributo "ufficioDestProv" con
    // l'attributo "struttura"
    String ufficioDestProv = wsdmprotocolloDocumentoIn.getStruttura();

    // Note
    // 09/01/2020 (JIRA WSDM-33) per le sole protocollazioni in ingresso (da
    // portale) si deve
    // popolare l'attributo "note" con il valore indicato nell'elemento interno
    // "codiceGaraLotto".
    // 21/04/2020 Il campo note viene popolato in tutti i versi di protocollazione.
    String note = wsdmprotocolloDocumentoIn.getCodiceGaraLotto();

    // Codice Responsabile
    String codiceResponsabile = null;

    // Codice Tipo Spedizione
    String codiceTipoSpedizione = null;

    RispostaProtocolla rispostaProtocolla = protocollaPortType.process(username, password, verso, null, null, anagraficaMittDest,
        indirizzoMittDest, cfpivaMittDest, oggetto, titolario, ufficioDestProv, note, null, codiceResponsabile, codiceTipoSpedizione);

    // Risposta
    if (rispostaProtocolla.getEsito() != null) {
      Esito esitoProtocolla = rispostaProtocolla.getEsito().getValue();
      String codiceProtocolla = null;
      String descrizioneProtocolla = null;
      String erroreCodiceProtocolla = null;
      String erroreDescrizioneProtocolla = null;

      if (esitoProtocolla.getCodice() != null) {
        codiceProtocolla = esitoProtocolla.getCodice().getValue();
      }
      if (esitoProtocolla.getDescrizione() != null) {
        descrizioneProtocolla = esitoProtocolla.getDescrizione().getValue();
      }
      if (esitoProtocolla.getErrore() != null) {
        Errore erroreProtocolla = esitoProtocolla.getErrore().getValue();
        if (erroreProtocolla != null) {
          if (erroreProtocolla.getCodice() != null) {
            erroreCodiceProtocolla = erroreProtocolla.getCodice().getValue();
          }
          if (erroreProtocolla.getDescrizione() != null) {
            erroreDescrizioneProtocolla = erroreProtocolla.getDescrizione().getValue();
          }
        }
      }

      if (codiceProtocolla != null) {
        messaggio += codiceProtocolla;
      }
      if (descrizioneProtocolla != null) {
        messaggio += " " + descrizioneProtocolla;
      }
      if (erroreCodiceProtocolla != null) {
        messaggio += " " + erroreCodiceProtocolla;
      }
      if (erroreDescrizioneProtocolla != null) {
        messaggio += " " + erroreDescrizioneProtocolla;
      }

      if (ESITO_OK.equals(codiceProtocolla)) {
        esito = true;

        WSDMProtocolloDocumento wsdmProtocolloDocumento = new WSDMProtocolloDocumento();
        String numeroProtocollo = null;

        // Numero protocollo
        if (rispostaProtocolla.getNumProtocollo() != null) {
          numeroProtocollo = rispostaProtocolla.getNumProtocollo().getValue();
          wsdmProtocolloDocumento.setNumeroProtocollo(numeroProtocollo);
        }

        // Data protocollo
        if (rispostaProtocolla.getDataProtocollo() != null) {
          XMLGregorianCalendar dataProtocollo = rispostaProtocolla.getDataProtocollo().getValue();
          if (dataProtocollo != null) {
            Calendar cal = Calendar.getInstance();
            cal.setTime(dataProtocollo.toGregorianCalendar().getTime());
            wsdmProtocolloDocumento.setAnnoProtocollo(new Long(cal.get(Calendar.YEAR)));
          }
        }

        // wsdmProtocolloDocumento.setDataProtocollo(cal.getTime());
        // 17/10/2018 - La data e l'ora del protocollo viene impostata con la
        // data
        // e l'ora corrente di sistema
        Calendar dataProtocolloToday = Calendar.getInstance();
        wsdmProtocolloDocumento.setDataProtocollo(dataProtocolloToday.getTime());
        wsdmprotocolloDocumentoRes.setProtocolloDocumento(wsdmProtocolloDocumento);

        // Inserimento degli allegati
        if (ESEGUI_SALVA_DOCUMENTO_SI.equals(eseguiSalvaDocumento.toUpperCase())) {
          WSDMProtocolloAllegato[] wsdmprotocolloAllegati = wsdmprotocolloDocumentoIn.getAllegati();
          if (wsdmprotocolloAllegati != null && wsdmprotocolloAllegati.length > 0) {
            for (int a = 0; a < wsdmprotocolloAllegati.length && esito == true; a++) {

              String nome = wsdmprotocolloAllegati[a].getNome();
              String contenuto = new String(wsdmprotocolloAllegati[a].getContenuto(), "UTF-8");
              contenuto = contenuto.trim();
              String contenutoBase64 = Base64.encode(contenuto.getBytes());
              RispostaSalvaDocumento rispostaSalvaDocumento = salvaDocumentoPortType.process(username, password, numeroProtocollo, null,
                  nome, contenutoBase64, null, null);

              if (rispostaSalvaDocumento.getEsito() != null) {
                it.dedagroup.ws.salvadocumento.om.xsd.Esito esitoSalvaDocumento = rispostaSalvaDocumento.getEsito().getValue();
                String idDocumento = null;
                String codiceSalvaDocumento = null;
                String descrizioneSalvaDocumento = null;
                String erroreCodiceSalvaDocumento = null;
                String erroreDescrizioneSalvaDocumento = null;

                if (rispostaSalvaDocumento.getIdDocumentale() != null) {
                  idDocumento = rispostaSalvaDocumento.getIdDocumentale().getValue();
                }

                if (esitoSalvaDocumento.getCodice() != null) {
                  codiceSalvaDocumento = esitoSalvaDocumento.getCodice().getValue();
                }
                if (esitoSalvaDocumento.getDescrizione() != null) {
                  descrizioneSalvaDocumento = esitoSalvaDocumento.getDescrizione().getValue();
                }
                if (esitoSalvaDocumento.getErrore() != null) {
                  it.dedagroup.ws.salvadocumento.om.xsd.Errore erroreSalvaDocumento = esitoSalvaDocumento.getErrore().getValue();
                  if (erroreSalvaDocumento != null) {
                    if (erroreSalvaDocumento.getCodice() != null) {
                      erroreCodiceSalvaDocumento = erroreSalvaDocumento.getCodice().getValue();
                    }
                    if (erroreSalvaDocumento.getDescrizione() != null) {
                      erroreDescrizioneSalvaDocumento = erroreSalvaDocumento.getDescrizione().getValue();
                    }
                  }
                }

                messaggio += " [Documento " + nome + " ";
                if (idDocumento != null) {
                  messaggio += "(" + idDocumento + ")";
                }
                if (codiceSalvaDocumento != null) {
                  messaggio += " " + codiceSalvaDocumento;
                }
                if (descrizioneSalvaDocumento != null) {
                  messaggio += " " + descrizioneSalvaDocumento;
                }
                if (erroreCodiceSalvaDocumento != null) {
                  messaggio += " " + erroreCodiceSalvaDocumento;
                }
                if (erroreDescrizioneSalvaDocumento != null) {
                  messaggio += " " + erroreDescrizioneSalvaDocumento;
                }
                messaggio += "]";

                if (!ESITO_OK.equals(codiceSalvaDocumento)) {
                  esito = false;
                }
              }
            }
          }
        }

      } else {
        esito = false;
      }

      wsdmprotocolloDocumentoRes.setEsito(esito);
      wsdmprotocolloDocumentoRes.setMessaggio(messaggio);

    }
  }

  /**
   * Restituisce client "SalvaDocumento".
   * 
   * @return
   * @throws NamingException
   * @throws Exception
   */
  private SalvaDocumentoPortType _getSalvaDocumentoPortType() throws NamingException, Exception {
    String wsSalvaDocumentoAddress = InitialContext.doLookup(FOLIUM_SALVA_DOCUMENTO_WS);
    if (wsSalvaDocumentoAddress == null || (wsSalvaDocumentoAddress != null && "".equals(wsSalvaDocumentoAddress))) {
      throw new Exception(URL_NOT_DEFINED_FOLIUM_SALVA_DOCUMENTO_WS);
    }
    SalvaDocumento salvaDocumento = new SalvaDocumento();
    SalvaDocumentoPortType salvaDocumentoPortType = salvaDocumento.getSalvaDocumentoHttpEndpoint();
    Client clientSalvaDocumento = ClientProxy.getClient(salvaDocumentoPortType);
    clientSalvaDocumento.getRequestContext().put(Message.ENDPOINT_ADDRESS, wsSalvaDocumentoAddress);
    return salvaDocumentoPortType;
  }

  /**
   * Restituisce client "Protocolla".
   * 
   * @return
   * @throws NamingException
   * @throws Exception
   */
  private ProtocollaPortType _getProtocollaPortType() throws NamingException, Exception {
    String wsProtocollaAddress = InitialContext.doLookup(FOLIUM_PROTOCOLLA_WS);
    if (wsProtocollaAddress == null || (wsProtocollaAddress != null && "".equals(wsProtocollaAddress))) {
      throw new Exception(URL_NOT_DEFINED_FOLIUM_PROTOCOLLA_WS);
    }
    Protocolla protocolla = new Protocolla();
    ProtocollaPortType protocollaPortType = protocolla.getProtocollaHttpEndpoint();
    Client clientProtocolla = ClientProxy.getClient(protocollaPortType);
    clientProtocolla.getRequestContext().put(Message.ENDPOINT_ADDRESS, wsProtocollaAddress);
    return protocollaPortType;
  }

  /**
   * Popola le liste delle anagrafiche dei mittenti o destinatari.
   * 
   * @param wsdmMittentiDestinatari
   * @param anagraficaMittDest
   * @param indirizzoMittDest
   * @param cfpivaMittDest
   */
  private void __popolaMittentiDestinatari(WSDMProtocolloAnagrafica[] wsdmMittentiDestinatari, List<String> anagraficaMittDest,
      List<String> indirizzoMittDest, List<String> cfpivaMittDest) {

    if (wsdmMittentiDestinatari != null && wsdmMittentiDestinatari.length > 0) {

      for (int md = 0; md < wsdmMittentiDestinatari.length; md++) {

        // Destinatario
        String destinatario = wsdmMittentiDestinatari[md].getCognomeointestazione();
        String nome = wsdmMittentiDestinatari[md].getNome();
        if (nome != null && !"".equals(nome)) {
          destinatario += " " + nome;
        }
        anagraficaMittDest.add(destinatario);

        // Indirizzo
        String indirizzo = null;
        String indirizzoResidenza = wsdmMittentiDestinatari[md].getIndirizzoResidenza();
//        String localitaResidenza = wsdmMittentiDestinatari[md].getLocalitaResidenza();
        String comuneResidenza = wsdmMittentiDestinatari[md].getComuneResidenza();
        if (indirizzoResidenza != null && !"".equals(indirizzoResidenza)) {
          indirizzo = indirizzoResidenza;
        }
//        if (localitaResidenza != null && !"".equals(localitaResidenza)) {
//          if (indirizzo == null) {
//            indirizzo = localitaResidenza;
//          } else {
//            indirizzo += " " + localitaResidenza;
//          }
//        }
        if (comuneResidenza != null && !"".equals(comuneResidenza)) {
          if (indirizzo == null) {
            indirizzo = comuneResidenza;
          } else {
            indirizzo += " " + comuneResidenza;
          }
        }
        indirizzoMittDest.add(indirizzo);

        // Codice fiscale o partita IVA
        cfpivaMittDest.add(wsdmMittentiDestinatari[md].getCodiceFiscale());

      }
    }
  }

  @Override
  public WSDMProtocolloDocumentoRes _protocolloLeggi(String username, String password, WSDMLoginAttr loginAttr, Long annoProtocollo,
      String numeroProtocollo) {
    WSDMProtocolloDocumentoRes wsdmprotocolloDocumentoRes = new WSDMProtocolloDocumentoRes();
    wsdmprotocolloDocumentoRes.setEsito(false);
    wsdmprotocolloDocumentoRes.setMessaggio(OPERATION_NOT_SUPPORTED);
    return wsdmprotocolloDocumentoRes;
  }

  @Override
  public WSDMProtocolloDocumentoRes _documentoInserisci(String username, String password, WSDMLoginAttr loginAttr,
      WSDMProtocolloDocumentoIn wsdmprotocolloDocumentoIn) {
    WSDMProtocolloDocumentoRes wsdmprotocolloDocumentoRes = new WSDMProtocolloDocumentoRes();
    wsdmprotocolloDocumentoRes = this._protocolloInserisci(username, password, loginAttr, wsdmprotocolloDocumentoIn);
    return wsdmprotocolloDocumentoRes;
  }

  @Override
  public WSDMProtocolloDocumentoRes _documentoLeggi(String username, String password, WSDMLoginAttr loginAttr, String numeroDocumento) {
    WSDMProtocolloDocumentoRes wsdmprotocolloDocumentoRes = new WSDMProtocolloDocumentoRes();
    wsdmprotocolloDocumentoRes.setEsito(false);
    wsdmprotocolloDocumentoRes.setMessaggio(OPERATION_NOT_SUPPORTED);
    return wsdmprotocolloDocumentoRes;
  }

  public WSDMProtocolloDocumentoRes _documentoMetadatiLeggi(String username, String password, WSDMLoginAttr loginAttr,
      String numeroDocumento) {
    WSDMProtocolloDocumentoRes wsdmprotocolloDocumentoRes = new WSDMProtocolloDocumentoRes();
    wsdmprotocolloDocumentoRes.setEsito(false);
    wsdmprotocolloDocumentoRes.setMessaggio(OPERATION_NOT_SUPPORTED);
    return wsdmprotocolloDocumentoRes;
  }

  @Override
  public WSDMFascicoloRes _fascicoloInserisci(String username, String password, WSDMLoginAttr loginAttr, WSDMFascicoloIn wsdmfascicoloIn) {
    WSDMFascicoloRes wsdmFascicoloRes = new WSDMFascicoloRes();
    wsdmFascicoloRes.setEsito(false);
    wsdmFascicoloRes.setMessaggio(OPERATION_NOT_SUPPORTED);
    return wsdmFascicoloRes;
  }

  @Override
  public WSDMFascicoloRes _fascicoloAggiungiDocumento(String username, String password, WSDMLoginAttr loginAttr, String codiceFascicolo,
      String numeroDocumento) {
    WSDMFascicoloRes wsdmFascicoloRes = new WSDMFascicoloRes();
    wsdmFascicoloRes.setEsito(false);
    wsdmFascicoloRes.setMessaggio(OPERATION_NOT_SUPPORTED);
    return wsdmFascicoloRes;
  }

  @Override
  public WSDMFascicoloRes _fascicoloLeggi(String username, String password, WSDMLoginAttr loginAttr, String codiceFascicolo,
      Long annoFascicolo, String numeroFascicolo, String classificaFascicolo, String oggettoFascicolo) {
    WSDMFascicoloRes wsdmFascicoloRes = new WSDMFascicoloRes();
    wsdmFascicoloRes.setEsito(false);
    wsdmFascicoloRes.setMessaggio(OPERATION_NOT_SUPPORTED);
    return wsdmFascicoloRes;
  }

  @Override
  public WSDMFascicoloRes _fascicoloMetadatiLeggi(String username, String password, WSDMLoginAttr loginAttr, String codiceFascicolo,
      Long annoFascicolo, String numeroFascicolo, String classificaFascicolo, String oggettoFascicolo) {
    WSDMFascicoloRes wsdmFascicoloRes = new WSDMFascicoloRes();
    wsdmFascicoloRes.setEsito(false);
    wsdmFascicoloRes.setMessaggio(OPERATION_NOT_SUPPORTED);
    return wsdmFascicoloRes;
  }

  @Override
  public WSDMProtocolloDocumentoRes _attoContrattoLeggi(String username, String password, WSDMLoginAttr loginAttr, String tipo,
      String organo, Long anno, String numero) {
    WSDMProtocolloDocumentoRes wsdmprotocolloDocumentoRes = new WSDMProtocolloDocumentoRes();
    wsdmprotocolloDocumentoRes.setEsito(false);
    wsdmprotocolloDocumentoRes.setMessaggio(OPERATION_NOT_SUPPORTED);
    return wsdmprotocolloDocumentoRes;
  }

  @Override
  public WSDMInviaMailRes _inviaMail(String username, String password, WSDMLoginAttr loginAttr, WSDMInviaMail wsdmInviaMail) {
    WSDMInviaMailRes wsdmInviaMailRes = new WSDMInviaMailRes();
    wsdmInviaMailRes.setEsito(false);
    wsdmInviaMailRes.setMessaggio(OPERATION_NOT_SUPPORTED);
    return wsdmInviaMailRes;
  }

  @Override
  public WSDMVerificaMailRes _verificaMail(String username, String password, WSDMLoginAttr loginAttr, String numeroDocumento,
      Long annoProtocollo, String numeroProtocollo) {
    WSDMVerificaMailRes wsdmVerificaMailRes = new WSDMVerificaMailRes();
    wsdmVerificaMailRes.setEsito(false);
    wsdmVerificaMailRes.setMessaggio(OPERATION_NOT_SUPPORTED);
    return wsdmVerificaMailRes;
  }

  @Override
  public WSDMAttoContrattoRes _attoContrattoRicerca(String username, String password, WSDMLoginAttr loginAttr, String tipo, String organo,
      Long anno, String numeroDa, String numeroA, Date dataDa, Date dataA) {
    WSDMAttoContrattoRes wsdmAttoContrattoRes = new WSDMAttoContrattoRes();
    wsdmAttoContrattoRes.setEsito(false);
    wsdmAttoContrattoRes.setMessaggio(OPERATION_NOT_SUPPORTED);
    return wsdmAttoContrattoRes;
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
