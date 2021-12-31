package it.maggioli.eldasoft.bl.titulus;

import it.cineca.titulus301.titulus_ws.services.Acl4.Acl4;
import it.cineca.titulus301.titulus_ws.services.Acl4.Acl4ServiceLocator;
import it.cineca.titulus301.titulus_ws.services.Acl4.Acl4SoapBindingStub;
import it.cineca.titulus301.titulus_ws.services.Titulus4Depository.Titulus4Depository;
import it.cineca.titulus301.titulus_ws.services.Titulus4Depository.Titulus4DepositoryServiceLocator;
import it.cineca.titulus301.titulus_ws.services.Titulus4Depository.Titulus4DepositorySoapBindingStub;
import it.cineca.titulus301.titulus_ws.services.Titulus4Ugov.Titulus4Ugov;
import it.cineca.titulus301.titulus_ws.services.Titulus4Ugov.Titulus4UgovServiceLocator;
import it.cineca.titulus301.titulus_ws.services.Titulus4Ugov.Titulus4UgovSoapBindingStub;
import it.kion.www.titulus.AttachmentBean;
import it.kion.www.titulus.QueryParams;
import it.kion.www.titulus.SaveParams;
import it.maggioli.eldasoft.bl.IWSDMManager;
import it.maggioli.eldasoft.ws.dm.WSDMAggiungiAllegatiIn;
import it.maggioli.eldasoft.ws.dm.WSDMAggiungiAllegatiRes;
import it.maggioli.eldasoft.ws.dm.WSDMAmministrazioneAoo;
import it.maggioli.eldasoft.ws.dm.WSDMAnagraficaLeggiRes;
import it.maggioli.eldasoft.ws.dm.WSDMAttoContrattoRes;
import it.maggioli.eldasoft.ws.dm.WSDMClassifica;
import it.maggioli.eldasoft.ws.dm.WSDMDocumentoCollegaRes;
import it.maggioli.eldasoft.ws.dm.WSDMFascicolo;
import it.maggioli.eldasoft.ws.dm.WSDMFascicoloDocumento;
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
import it.maggioli.eldasoft.ws.dm.WSDMProfilo;
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
import it.maggioli.eldasoft.ws.dm.WSDMUfficio;
import it.maggioli.eldasoft.ws.dm.WSDMVerificaMailRes;

import java.net.MalformedURLException;
import java.net.URL;
import java.rmi.RemoteException;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.Date;
import java.util.List;

import javax.naming.InitialContext;
import javax.naming.NamingException;
import javax.xml.rpc.ServiceException;
import javax.xml.ws.WebServiceException;

import org.apache.log4j.Logger;
import org.dom4j.Document;
import org.dom4j.DocumentException;
import org.dom4j.DocumentHelper;
import org.dom4j.Element;

/**
 * Manager per la gestione documentale.
 * 
 */

public class TitulusManager implements IWSDMManager {

  static Logger              logger                               = Logger.getLogger(TitulusManager.class);

  static private String      WSTITULUS4UGOV                       = "java:comp/env/TITULUS4UGOV_WS";
  static private String      WSTITULUS4DEPOSITORY                 = "java:comp/env/TITULUS4DEPOSITORY_WS";
  static private String      WSTITULUSACL4                        = "java:comp/env/TITULUSACL4_WS";
  static private String      WSTITULUS4UGOV_URL_NOT_DEFINED       = "WSDM - Titulus: indirizzo servizio protocollo non definito. ";
  static private String      WSTITULUS4DEPOSITORY_URL_NOT_DEFINED = "WSDM - Titulus Depository: indirizzo servizio non definito. ";
  static private String      WSTITULUSACL4_URL_NOT_DEFINED        = "WSDM - Titulus Acl4: indirizzo servizio non definito. ";
  static private String      WSTITULUS4UGOV_ERROR                 = "WSDM - Titulus: si e' verificato un errore durante il tentativo di connessione al servizio: ";

  // static private String TITULUS_TABELLATI =
  // "classpath:META-INF/tabellati/TitulusTabellati.xml";

  // Tipo "arrivo", "partenza", "interno" o "varie"
  // I primi tre tipi (arrivo, partenza e interno) possono e devono essere
  // utilizzati per l'inserimento di un documento da protocollare.
  // Il tipo varie è l'unico tipo ammesso per il puro inserimento documentale
  // (senza protocollo). Per il puro inserimento documentale non è necessario
  // indicare il verso del documento.
  static public final String TITULUS_ARRIVO                       = "arrivo";
  static public final String TITULUS_PARTENZA                     = "partenza";
  static public final String TITULUS_INTERNO                      = "interno";
  static public final String TITULUS_VARIE                        = "varie";

  /**
   * Lettura di una chiave (key) da un lista (entry) di una mappa (map).
   * 
   * @param mapName
   * @param keyName
   * @return
   */
  private static String _readKey(String mapName, String keyName) {

    String look = "java:comp/env/tab/TITULUS/" + mapName + "/" + keyName;
    String keyValue = null;
    try {
      keyValue = InitialContext.doLookup(look);
    } catch (NamingException e) {

    }

    return keyValue;
  }

  @Override
  public WSDMListaProfiliRes _listaProfili(String username, String password, String utenteApplicativo) {

    WSDMListaProfiliRes wsdmListaProfiliRes = new WSDMListaProfiliRes();
    try {
      // Lettura dell'utente applicativo
      if (utenteApplicativo == null || (utenteApplicativo != null && "".equals(utenteApplicativo.trim()))) utenteApplicativo = username;

      Titulus4Ugov titulus4Ugov = this.getTitulus4Ugov(username, password);
      String xmlprofili = titulus4Ugov.setWSUser(utenteApplicativo, null);

      if (xmlprofili != null) {
        Document document = DocumentHelper.parseText(xmlprofili);
        Element elRoot = document.getRootElement();
        if (elRoot != null) {
          if ("ok".equals(elRoot.attribute("result").getText())) {
            List<?> profili = elRoot.selectNodes("//profilo");
            if (profili != null && profili.size() > 0) {
              WSDMProfilo[] wsdmProfili = new WSDMProfilo[profili.size()];
              for (int p = 0; p < profili.size(); p++) {
                wsdmProfili[p] = new WSDMProfilo();
                Element profilo = (Element) profili.get(p);
                wsdmProfili[p].setNumeroProfilo(profilo.attribute("pnumber").getText());
                wsdmProfili[p].setNomeProfilo(profilo.attribute("nome").getText());
                wsdmProfili[p].setDescrizioneUfficio(profilo.attribute("ufficio").getText());
                wsdmProfili[p].setCodiceUfficio(profilo.attribute("cod_uff").getText());
                wsdmProfili[p].setCodiceSede(profilo.attribute("cod_sede").getText());
              }
              wsdmListaProfiliRes.setEsito(true);
              wsdmListaProfiliRes.setListaProfili(wsdmProfili);
            }
          } else if ("error".equals(elRoot.attribute("result").getText())) {
            Element elErrore = elRoot.element("errore");
            String codiceErrore = elErrore.attribute("cod").getText();
            String descrizioneErrore = elErrore.element("descrizione").getText();
            wsdmListaProfiliRes.setEsito(false);
            wsdmListaProfiliRes.setMessaggio(codiceErrore + " - " + descrizioneErrore);
          }
        }
      }

    } catch (WebServiceException w) {
      wsdmListaProfiliRes.setEsito(false);
      wsdmListaProfiliRes.setMessaggio(WS_ERROR + " " + w.getMessage());
      logger.error("Errore (_listaProfili)", w);
    } catch (NamingException e) {
      wsdmListaProfiliRes.setEsito(false);
      wsdmListaProfiliRes.setMessaggio(NAMING_ERROR + " " + e.getMessage());
      logger.error("Errore (_listaProfili)", e);
    } catch (Throwable t) {
      wsdmListaProfiliRes.setEsito(false);
      wsdmListaProfiliRes.setMessaggio(t.getMessage());
      logger.error("Errore (_listaProfili)", t);
    }

    return wsdmListaProfiliRes;
  }

  @Override
  public WSDMListaAmministrazioniAooRes _listaAmministrazioniAoo(String username, String password) {

    WSDMListaAmministrazioniAooRes wsdmListaAmministrazioniAooRes = new WSDMListaAmministrazioniAooRes();

    try {
      Titulus4Depository titulus4Depository = this.getTitulus4Depository(username, password);
      String xmlaoo = titulus4Depository.getAooListWithCodAmmAoo();

      if (xmlaoo != null) {
        Document document = DocumentHelper.parseText(xmlaoo);
        Element elRoot = document.getRootElement();
        if (elRoot != null) {
          List<?> aoos = elRoot.selectNodes("//aoo");
          if (aoos != null && aoos.size() > 0) {
            WSDMAmministrazioneAoo[] wsdmAmministrazioniAoo = new WSDMAmministrazioneAoo[aoos.size()];
            for (int a = 0; a < aoos.size(); a++) {
              wsdmAmministrazioniAoo[a] = new WSDMAmministrazioneAoo();
              Element aoo = (Element) aoos.get(a);
              wsdmAmministrazioniAoo[a].setCodiceAmministrazioneAoo(aoo.attribute("cod_amm_aoo").getText());
              wsdmAmministrazioniAoo[a].setDescrizioneAmministrazioneAoo(aoo.getText());

            }
            wsdmListaAmministrazioniAooRes.setEsito(true);
            wsdmListaAmministrazioniAooRes.setListaAmministrazioniAoo(wsdmAmministrazioniAoo);
          } else {
            wsdmListaAmministrazioniAooRes.setEsito(false);
            wsdmListaAmministrazioniAooRes.setMessaggio("La ricerca non ha restituito alcuna amministrazione ed AOO");
          }
        }
      }

    } catch (WebServiceException w) {
      wsdmListaAmministrazioniAooRes.setEsito(false);
      wsdmListaAmministrazioniAooRes.setMessaggio(WS_ERROR + " " + w.getMessage());
      logger.error("Errore (_login)", w);
    } catch (NamingException e) {
      wsdmListaAmministrazioniAooRes.setEsito(false);
      wsdmListaAmministrazioniAooRes.setMessaggio(NAMING_ERROR + " " + e.getMessage());
      logger.error("Errore (_login)", e);
    } catch (Throwable t) {
      wsdmListaAmministrazioniAooRes.setEsito(false);
      wsdmListaAmministrazioniAooRes.setMessaggio(t.getMessage());
      logger.error("Errore (_login)", t);
    }

    return wsdmListaAmministrazioniAooRes;
  }

  @Override
  public WSDMListaUfficiRes _listaUffici(String username, String password, WSDMLoginAttr loginAttr, String codiceAoo,
      String descrizioneUfficio, String utente) {

    WSDMListaUfficiRes wsdmListaUfficiRes = new WSDMListaUfficiRes();
    try {

      if (codiceAoo != null && !"".equals(codiceAoo.trim())) {

        String query = "[/struttura_interna/@cod_aoo]=\"" + codiceAoo + "\"";

        // 03/03/2020, filtro per leggere solo gli uffici attivi
        query += " AND [/struttura_interna/@cod_responsabile]=\"*\" ";

        if (descrizioneUfficio != null && !"".equals(descrizioneUfficio.trim())) {
          query += " AND [/struttura_interna/nome]=*" + descrizioneUfficio + "*";
        }

        QueryParams queryParams = new QueryParams();
        queryParams.setTitlePageSize(1000);

        Acl4 acl4 = this.getAcl4(username, password);

        String xmluff = acl4.search(query, null, queryParams);
        if (xmluff != null) {
          Document documentUff = DocumentHelper.parseText(xmluff);
          Element elRootUff = documentUff.getRootElement();
          if (elRootUff != null) {
            List<?> uffs = elRootUff.selectNodes("//struttura_interna");
            if (uffs != null && uffs.size() > 0) {
              WSDMUfficio[] wsdmUffici = new WSDMUfficio[uffs.size()];
              for (int u = 0; u < uffs.size(); u++) {
                wsdmUffici[u] = new WSDMUfficio();
                Element uff = (Element) uffs.get(u);

                if (uff.attribute("cod_uff") != null) {
                  wsdmUffici[u].setCodiceUfficio(uff.attribute("cod_uff").getText());
                }
                if (uff.element("nome") != null) {
                  wsdmUffici[u].setDescrizioneUfficio(uff.element("nome").getText());
                }
              }
              wsdmListaUfficiRes.setListaUffici(wsdmUffici);
              wsdmListaUfficiRes.setEsito(true);
            } else {
              wsdmListaUfficiRes.setEsito(false);
              wsdmListaUfficiRes.setMessaggio("La ricerca non ha restituito alcun ufficio");
            }
          }
        }
      } else {
        wsdmListaUfficiRes.setEsito(false);
        wsdmListaUfficiRes.setMessaggio("Non e' possibile effettuare la ricerca: indicare almeno il codice AOO");
      }
    } catch (WebServiceException w) {
      wsdmListaUfficiRes.setEsito(false);
      wsdmListaUfficiRes.setMessaggio(WS_ERROR + " " + w.getMessage());
      logger.error("Errore (_aooUffici)", w);
    } catch (NamingException e) {
      wsdmListaUfficiRes.setEsito(false);
      wsdmListaUfficiRes.setMessaggio(NAMING_ERROR + " " + e.getMessage());
      logger.error("Errore (_aooUffici)", e);
    } catch (Throwable t) {
      wsdmListaUfficiRes.setEsito(false);
      wsdmListaUfficiRes.setMessaggio(t.getMessage());
      logger.error("Errore (_aooUffici)", t);
    }

    return wsdmListaUfficiRes;
  }

  @Override
  public WSDMProtocolloDocumentoRes _protocolloInserisci(String username, String password, WSDMLoginAttr loginAttr,
      WSDMProtocolloDocumentoIn wsdmprotocolloDocumentoIn) {
    WSDMProtocolloDocumentoRes wsdmprotocolloDocumentoRes = new WSDMProtocolloDocumentoRes();

    try {
      StringBuffer messaggioCtr = new StringBuffer();
      if (TitulusUtilityControllo.ctrProtocolloInserisci(loginAttr, wsdmprotocolloDocumentoIn, messaggioCtr)) {
        _protocolloDocumentoInserisci(username, password, loginAttr, wsdmprotocolloDocumentoIn, wsdmprotocolloDocumentoRes);
      } else {
        wsdmprotocolloDocumentoRes.setEsito(false);
        wsdmprotocolloDocumentoRes.setMessaggio(messaggioCtr.toString());
      }

    } catch (WebServiceException w) {
      wsdmprotocolloDocumentoRes.setEsito(false);
      wsdmprotocolloDocumentoRes.setMessaggio(WS_ERROR + " " + w.getMessage());
      logger.error("Errore (_protocolloInserisci)", w);
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
   * Metodo generico per l'inserimento di un protocollo (IN,OUT) oppure di un
   * documento generico (VARIE).
   * 
   * @param username
   * @param password
   * @param loginAttr
   * @param wsdmprotocolloDocumentoIn
   * @param wsdmprotocolloDocumentoRes
   * @throws NamingException
   * @throws Exception
   * @throws ServiceException
   * @throws MalformedURLException
   * @throws RemoteException
   * @throws DocumentException
   */
  private void _protocolloDocumentoInserisci(String username, String password, WSDMLoginAttr loginAttr,
      WSDMProtocolloDocumentoIn wsdmprotocolloDocumentoIn, WSDMProtocolloDocumentoRes wsdmprotocolloDocumentoRes) throws NamingException,
      Exception, ServiceException, MalformedURLException, RemoteException, DocumentException {

    // Collegamento al servizio Titulus4Ugov (utilizzato per la ricerca del
    // numero fascicolo)
    Titulus4Ugov titulus4Ugov = this.getTitulus4Ugov(username, password);

    // Lettura e caricamento del template
    Titulus4Depository titulus4Depository = this.getTitulus4Depository(username, password);
    String templateName = _readKey(wsdmprotocolloDocumentoIn.getTipoDocumento(), "template");
    String templateXML = titulus4Depository.loadDocTemplate(templateName);

    // Impostazione del codice amministrativo nel
    String codiceAoo = loginAttr.getLoginTitAttr().getCodiceAmministrazioneAoo();
    String templateXMLAoo = titulus4Depository.setCodAmmAoo(templateXML, codiceAoo);

    // Lettura, gestione del template e sostituzione delle informazioni.
    Document document = DocumentHelper.parseText(templateXMLAoo);
    Element elDoc = document.getRootElement();
    if (elDoc != null) {

      // Oggetto
      if (elDoc.element("oggetto") != null) {
        elDoc.element("oggetto").setText(wsdmprotocolloDocumentoIn.getOggetto());
      }

      // Numero allegati
      // Email del 18/01/2018 di Massimo Esposito
      // Il tag allegato va compilato nel seguente modo:
      // Se ho un solo file come allegato al tracciato xml questo rappresenta il
      // documento principale (che ho già descritto nell’oggetto), per cui il
      // tag allegato va compilato con: 0 – nessun allegato, altrimenti
      // se oltre al file principale ho altri file (che rappresentano gli
      // allegati al documento) allora devo istanziare il tag allegato tante
      // volte per quanti sono gli allegati (tranne che per il file principale).

      WSDMProtocolloAllegato[] allegati = wsdmprotocolloDocumentoIn.getAllegati();
      if (elDoc.element("allegato") != null) {
        if (allegati != null && allegati.length > 0) {
          // Se presente un solo allegato non serve fare nulla in quanto la
          // dicitura "0 - nessun allegato" e' gia' presente nel modello.
          if (allegati.length > 1) {
            Element elAllegatoBase = elDoc.element("allegato");
            for (int ai = 1; ai < allegati.length; ai++) {
              // Per il secondo documento (primo allegato) si utilizza
              // l'elemento gia' inserito e si sostituisce la dicitura
              // "0 - nessun allegato".
              if (ai == 1) elDoc.element("allegato").setText(ai + " - " + allegati[ai].getTitolo());
              // Dal terzo documento (secondo allegato) si crea un nuovo
              // elemento e si accoda al
              // precedente.
              if (ai > 1) {
                Element elClone = (Element) elAllegatoBase.clone();
                elClone.setText(ai + " - " + allegati[ai].getTitolo());
                Element elParent = (Element) elAllegatoBase.getParent();
                List listElement = elParent.content();
                listElement.add(elDoc.indexOf(elAllegatoBase) + ai - 1, elClone);
              }
            }
          }
        }
      }

      // Voce indice
      if (elDoc.element("voce_indice") != null) {
        String voceindice = _readKey(wsdmprotocolloDocumentoIn.getTipoDocumento(), "voceindice");
        elDoc.element("voce_indice").setText(voceindice);
      }

      // Riferimento esterni
      // Rimozione dei riferimenti esterni gia' presenti
      if (elDoc.element("rif_esterni") != null) {
        elDoc.element("rif_esterni").remove(elDoc.element("rif_esterni").element("rif_esterno"));
      }

      // Inserimento dei riferimenti esterni
      // Lettura dei mittenti o destinatari
      if (WSDMProtocolloInOut.OUT.equals(wsdmprotocolloDocumentoIn.getInout())) {
        WSDMProtocolloAnagrafica[] wsdmDestinatari = wsdmprotocolloDocumentoIn.getDestinatari();
        _setRiferimentiEsterni(elDoc, wsdmDestinatari);
      }

      if (WSDMProtocolloInOut.IN.equals(wsdmprotocolloDocumentoIn.getInout())) {
        WSDMProtocolloAnagrafica[] wsdmMittenti = wsdmprotocolloDocumentoIn.getMittenti();
        _setRiferimentiEsterni(elDoc, wsdmMittenti);
      }

      // Mezzo trasmissione: se almeno un mittente ha "mezzo" settato a
      // "PEC" si imposta l'elemento "mezzo trasmissione" a "PEC".
      if (elDoc.element("mezzo_trasmissione") != null) {
        String mezzo = null;
        if (WSDMProtocolloInOut.OUT.equals(wsdmprotocolloDocumentoIn.getInout())) {
          WSDMProtocolloAnagrafica[] wsdmDestinatari = wsdmprotocolloDocumentoIn.getDestinatari();
          if (wsdmDestinatari != null && wsdmDestinatari.length > 0) {
            for (int e = 0; e < wsdmDestinatari.length && mezzo == null; e++) {
              mezzo = wsdmDestinatari[e].getMezzo();
            }
          }
        }

        if (WSDMProtocolloInOut.IN.equals(wsdmprotocolloDocumentoIn.getInout())) {
          WSDMProtocolloAnagrafica[] wsdmMittenti = wsdmprotocolloDocumentoIn.getMittenti();
          if (wsdmMittenti != null && wsdmMittenti.length > 0) {
            for (int e = 0; e < wsdmMittenti.length && mezzo == null; e++) {
              mezzo = wsdmMittenti[e].getMezzo();
            }
          }
        }

        if ("PEC".equals(mezzo)) {
          elDoc.element("mezzo_trasmissione").attribute("cod").setText("PEC");
        } else {
          elDoc.element("mezzo_trasmissione").attribute("cod").setText("");
        }
      }

      // Pubblicazione
      if (elDoc.element("pubblicazione") != null) {
        if (wsdmprotocolloDocumentoIn.getPubblicazioneDal() != null) {
          try {
            Date pubblicazioneDal = wsdmprotocolloDocumentoIn.getPubblicazioneDal();
            SimpleDateFormat sdf = new SimpleDateFormat("yyyyMMdd");
            String _dal = sdf.format(pubblicazioneDal);
            elDoc.element("pubblicazione").attribute("dal").setText(_dal);
          } catch (Exception e) {

          }

        }

        if (wsdmprotocolloDocumentoIn.getPubblicazioneAl() != null) {
          try {
            Date pubblicazioneAl = wsdmprotocolloDocumentoIn.getPubblicazioneAl();
            SimpleDateFormat sdf = new SimpleDateFormat("yyyyMMdd");
            String _al = sdf.format(pubblicazioneAl);
            elDoc.element("pubblicazione").attribute("al").setText(_al);
          } catch (Exception e) {

          }
        }
      }

      // Extra: questa elemento complesso contiene dati "di controllo" utili a
      // Titulus per impostare
      // dei meccanismi automatici.
      // Tra i dati ci sono:
      // - id_documento che identifica il documento UBUY ed e' importantissimo
      // per il successivo ed eventuale annullamento del protocollo
      // - codice dell'ufficio del responsabile che effettua la protocollazione
      // - voce di indice associata alla classifica scelta
      // - codice della classifica scelta
      // - descrizione della classifica scelta
      // - altri dati... (vedi sotto)
      Element elExtra = elDoc.element("extra");
      if (elExtra != null) {
        // Identificativo univoco del documento. Fondamentale per l'annullamento
        // del protocollo (vedi email di Massimo Esposito del 12/12/2017)
        if (elExtra.element("sistema_mittente") != null) {
          if (elExtra.element("sistema_mittente").element("id_documento") != null) {
            String idDocumento = wsdmprotocolloDocumentoIn.getIdDocumento();
            if (idDocumento != null) {
              elExtra.element("sistema_mittente").element("id_documento").setText(idDocumento);
            } else {
              elExtra.element("sistema_mittente").element("id_documento").setText("");
            }
          }

          // Codice ufficio responsabile.
          // Se l'attributo "codice_ufficio_responsabile" esiste nel template,
          // e' sufficiente valorizzare il dato,
          // se l'attributo non esiste e' necessario creare l'elemento.
          if (loginAttr != null) {
            if (loginAttr.getLoginTitAttr() != null) {
              if (loginAttr.getLoginTitAttr().getCodiceUfficio() != null) {
                String codice_ufficio_responsabile = loginAttr.getLoginTitAttr().getCodiceUfficio();
                if (elExtra.element("sistema_mittente").element("codice_ufficio_responsabile") != null) {
                  elExtra.element("sistema_mittente").element("codice_ufficio_responsabile").setText(codice_ufficio_responsabile);
                } else {
                  Element elCodiceUfficioResponsabile = DocumentHelper.createElement("codice_ufficio_responsabile");
                  elCodiceUfficioResponsabile.setText(codice_ufficio_responsabile);
                  elExtra.element("sistema_mittente").add(elCodiceUfficioResponsabile);
                }
              }
            }
          }

          // 04/05/2020 - Gestione della classifica e delle informazioni annesse
          // (descrizione classifica e voce)

          // Voce associata alla classifica indicata
          // Secondo il requisito M13 la voce di indice associata alla
          // classifica scelta da UBUY deve essere indicata con l'elemento
          // <descrizione_voce></descrizione_voce> Per richiesta del cliente
          // (nella figura di Massimo Esposito) il sistema deve essere
          // retrocompatibile ossia bisogna aggiungere quell'attributo se non
          // c'e' nel template, ovviamente se l'utente di UBUY ha valorizzato
          // l'attributo fra i dati in ingresso (WSDMProtocolloDocumentoIn.voce)
          String voce = wsdmprotocolloDocumentoIn.getVoce();
          if (voce != null && !"".equals(voce)) {
            if (elExtra.element("sistema_mittente").element("descrizione_voce") != null) {
              elExtra.element("sistema_mittente").element("descrizione_voce").setText(voce);
            } else {
              Element elDescrizioneVoce = DocumentHelper.createElement("descrizione_voce");
              elDescrizioneVoce.setText(voce);
              elExtra.element("sistema_mittente").add(elDescrizioneVoce);
            }
          }

          // Codice della classifica
          // Secondo il requisito M13 la voce di indice associata alla
          // classifica scelta da UBUY deve essere indicata con l'elemento
          // <codice_classificazione_voce></codice_classificazione_voce> Per
          // richiesta del cliente (nella figura di Massimo Esposito) il sistema
          // deve essere retrocompatibile ossia bisogna aggiungere
          // quell'attributo se non c'e' nel template, ovviamente se l'utente di
          // UBUY ha valorizzato l'attributo fra i dati in ingresso
          // (WSDMProtocolloDocumentoIn.classifica)
          String classifica = wsdmprotocolloDocumentoIn.getClassifica();
          if (classifica != null && !"".equals(classifica)) {
            if (elExtra.element("sistema_mittente").element("codice_classificazione_voce") != null) {
              elExtra.element("sistema_mittente").element("codice_classificazione_voce").setText(classifica);
            } else {
              Element elCodiceClassificaVoce = DocumentHelper.createElement("codice_classificazione_voce");
              elCodiceClassificaVoce.setText(classifica);
              elExtra.element("sistema_mittente").add(elCodiceClassificaVoce);
            }
          }

          // Descrizione della classifica
          // Secondo il requisito M13 la voce di indice associata alla
          // classifica scelta da UBUY deve essere indicata con l'elemento
          // <descrizione_classificazione_voce></codice_classificazione_voce>
          // Per richiesta del cliente (nella figura di Massimo Esposito) il
          // sistema deve essere retrocompatibile ossia bisogna aggiungere
          // quell'attributo se non c'e' nel template, ovviamente se l'utente di
          // UBUY ha valorizzato l'attributo fra i dati in ingresso
          // (WSDMProtocolloDocumentoIn.descrizioneClassifica)
          String classificaDescrizione = wsdmprotocolloDocumentoIn.getClassificaDescrizione();
          if (classificaDescrizione != null && !"".equals(classificaDescrizione)) {
            if (elExtra.element("sistema_mittente").element("descrizione_classificazione_voce") != null) {
              elExtra.element("sistema_mittente").element("descrizione_classificazione_voce").setText(classificaDescrizione);
            } else {
              Element elDescrizioneClassificaVoce = DocumentHelper.createElement("descrizione_classificazione_voce");
              elDescrizioneClassificaVoce.setText(classificaDescrizione);
              elExtra.element("sistema_mittente").add(elDescrizioneClassificaVoce);
            }
          }

        }

        // Testo PEC
        if (elExtra.element("testo_pec") != null) {
          elExtra.element("testo_pec").setText(wsdmprotocolloDocumentoIn.getInviaMail().getTestoMail());
        }

        // Identificativo fascicolo (rimuovere, si utilizza addPredecessor)
        if (elExtra.element("identificativo_fascicolo") != null) {
          elExtra.remove(elExtra.element("identificativo_fascicolo"));
        }

        // Dati conservazione
        Element elDatiConservazione = elExtra.element("dati_conservazione");
        if (elDatiConservazione != null) {
          // Tipologia: deve essere rimossa in quanto valorizzata da Titulus
          // tramite wsdm
          elDatiConservazione.attribute("tipologia").setText("");

          // Informazioni di corredo
          Element elInformazioniDiCorredo = elDatiConservazione.element("informazioni_di_corredo");
          if (elInformazioniDiCorredo != null) {
            // Valorizzale la lista dei file con l'identificativo univoco.
            // Informazioni richieste per la conservazione (vedi email di
            // Massimo Esposito del 12/12/2017).
            if (elInformazioniDiCorredo.element("file") != null) {
              Element elFileAllegatoBase = elInformazioniDiCorredo.element("file");
              if (allegati != null && allegati.length > 0) {
                for (int fai = 0; fai < allegati.length; fai++) {
                  // Per il primo allegato si utilizza l'elemento gia' inserito
                  if (fai == 0) {
                    elInformazioniDiCorredo.element("file").attribute("id").setText(allegati[fai].getIdAllegato());
                    elInformazioniDiCorredo.element("file").element("denominazione").setText(allegati[fai].getNome());
                  }
                  // Dal secondo allegato si crea un nuovo elemento e si accoda
                  // al primo
                  if (fai > 0) {
                    Element elFileAllegatoClone = (Element) elFileAllegatoBase.clone();
                    elFileAllegatoClone.attribute("id").setText(allegati[fai].getIdAllegato());
                    elFileAllegatoClone.element("denominazione").setText(allegati[fai].getNome());
                    Element elFileAllegatoParent = (Element) elFileAllegatoBase.getParent();
                    List listFileAllegatoElement = elFileAllegatoParent.content();
                    listFileAllegatoElement.add(elInformazioniDiCorredo.indexOf(elFileAllegatoBase) + fai, elFileAllegatoClone);
                  }
                }
              }
            }
            // Evento
            Element elEvento = elInformazioniDiCorredo.element("evento");
            if (elEvento != null) {
              // Email di Massimo Esposito del 12/12/2017: Per quanto riguarda
              // denominazione evento, l’evento di creazione è relativo alla
              // creazione del documento in ubuy mentre la registrazione
              // all’evento di registrazione in Titulus, non sono fondamentali,
              // dei due direi di valorizzare almeno la creazione, la
              // registrazione servirebbe solo a sapere l’utenza che ha eseguito
              // l’invio a Titulus (se operazione manuale) considerando
              // l’utilizzo di uno user di sistema.
              elEvento.element("denominazione").setText("creazione");
              String now = new SimpleDateFormat("dd/MM/yyyy").format(new Date());
              elEvento.element("data").setText(now);
              elEvento.element("agente").attribute("tipo").setText("software");
              elEvento.element("agente").setText("");
              elEvento.element("agente").element("denominazione").setText("WSDM");
              elEvento.element("agente").element("versione").setText("1.5.0");
              elEvento.element("agente").remove(elEvento.element("agente").element("matricola"));
            }
          }
        }
      }
    }

    // Documento XML da inserire
    String rxml = null;
    String xml = document.asXML();

    // Parametri
    SaveParams params = new SaveParams();
    params.setPdfConversion(false);

    // Allegati
    WSDMProtocolloAllegato[] allegati = wsdmprotocolloDocumentoIn.getAllegati();
    if (allegati != null && allegati.length > 0) {
      AttachmentBean[] attBean = new AttachmentBean[allegati.length];
      for (int ai = 0; ai < allegati.length; ai++) {
        attBean[ai] = new AttachmentBean();
        attBean[ai].setFileName(allegati[ai].getNome());
        attBean[ai].setDescription(allegati[ai].getTitolo());
        attBean[ai].setMimeType("application/octet-stream");
        attBean[ai].setContent(allegati[ai].getContenuto());
      }
      rxml = titulus4Depository.saveDocument(xml, attBean, params);
    } else {
      rxml = titulus4Depository.saveDocument(xml, null, params);
    }

    // Lettura della risposta
    WSDMProtocolloDocumento wsdmprotocolloDocumento = new WSDMProtocolloDocumento();
    Document rDocument = DocumentHelper.parseText(rxml);
    Element rElRoot = rDocument.getRootElement();
    if (rElRoot != null) {
      Element rElDocument = rElRoot.element("Document");
      if (rElDocument != null) {

        // Numero documento
        String physdoc = rElDocument.attributeValue("physdoc");
        wsdmprotocolloDocumento.setNumeroDocumento(physdoc);

        Element rElDoc = rElDocument.element("doc");

        if (rElDoc != null) {
          // Tipo, verso
          String tipo = rElDoc.attributeValue("tipo");
          if (TITULUS_ARRIVO.equals(tipo)) {
            wsdmprotocolloDocumento.setInout(WSDMProtocolloInOut.IN);
          } else if (TITULUS_PARTENZA.equals(tipo)) {
            wsdmprotocolloDocumento.setInout(WSDMProtocolloInOut.OUT);
          } else if (TITULUS_VARIE.equals(tipo)) {
            wsdmprotocolloDocumento.setInout(WSDMProtocolloInOut.INT);
          }

          // Numero protocollo
          String num_prot = rElDoc.attributeValue("num_prot");
          wsdmprotocolloDocumento.setNumeroProtocollo(num_prot);

          // Anno protocollo
          try {
            String anno = rElDoc.attributeValue("anno");
            wsdmprotocolloDocumento.setAnnoProtocollo(Long.parseLong(anno));
          } catch (Exception e) {
          }

          // Data protocollo
          // try {
          // String data_prot = rElDoc.attributeValue("data_prot");
          // SimpleDateFormat fmt = new SimpleDateFormat("yyyyMMdd");
          // wsdmprotocolloDocumento.setDataProtocollo(fmt.parse(data_prot));
          // } catch (Exception e) {
          // }

          // 08/02/2018 - La data e l'ora del protocollo viene impostata con la
          // data e l'ora corrente di sistema
          Calendar dataProtocolloToday = Calendar.getInstance();
          wsdmprotocolloDocumento.setDataProtocollo(dataProtocolloToday.getTime());

          // Gestione del fascicolo
          // Per fascicolare il metodo da utilizzare è addPredecessor
          // Il formato richiesto è:
          //
          // <soapenv:Envelope
          // xmlns:xsi="http://www.w3.org/2001/XMLSchema-instance"
          // xmlns:xsd="http://www.w3.org/2001/XMLSchema"
          // xmlns:soapenv="http://schemas.xmlsoap.org/soap/envelope/"
          // xmlns:ws="http://ws.titulus.kion.it">
          // <soapenv:Header/>
          // <soapenv:Body>
          // <ws:addPredecessor
          // soapenv:encodingStyle="http://schemas.xmlsoap.org/soap/encoding/">
          // <idDocToUpdate>?</idDocToUpdate>
          // <xmlPredecessorInfos>?</xmlPredecessorInfos>
          // <newFolderSubject>?</newFolderSubject>
          // <newFolderIdType>?</newFolderIdType>
          // <newFolderId>?</newFolderId>
          // </ws:addPredecessor>
          // </soapenv:Body>
          // </soapenv:Envelope>
          //
          // in cui è necessario passare:
          // 1. idDocToUpdate --> è il numero <nrecord> rilasciato dal servizio
          // di protocollazione all'atto della protocollazione, il numero
          // identifica univocamente il documento protocollato all'interno del
          // sistema Titulus
          // 2. xmlPredecessorInfos --> xml del predecessore formattato in
          // questo modo <root><id_predecessore tipo="id_processo_acquisto"
          // id="<codice fascicolo>" /></root> dove "id_processo_acquisto" è una
          // stringa fissa mentre <codice fascicolo> è il codice fascicolo
          // (corrisponde al codice gara)
          // 3. newFolderSubject --> oggetto del fascicolo
          // 4. newFolderIdType --> stringa fissa "id_processo_acquisto"
          // 5. newFolderId --> codice fascicolo

          // In tal modo all'atto dell'invio del primo documento verrà creato il
          // fascicolo (se non esistente), mentre i successivi andranno tutti
          // nel fascicolo avente codice fascicolo uguale a quello passato come
          // predecessore.

          // Fascicolazione, se esiste, altrimenti crea un nuovo fascicolo
          if (WSDMInserimentoInFascicolo.SI_FASCICOLO_ESISTENTE.equals(wsdmprotocolloDocumentoIn.getInserimentoInFascicolo())
              || WSDMInserimentoInFascicolo.SI_FASCICOLO_NUOVO.equals(wsdmprotocolloDocumentoIn.getInserimentoInFascicolo())) {
            String nrecord = rElDoc.attributeValue("nrecord");
            // Per il tipo si considera il valore fisso "id_processo_acquisto"
            // (come da accordi con Massimo Esposito il 12/12/2017).
            String folderType = "id_processo_acquisto";
            String folderId = wsdmprotocolloDocumentoIn.getFascicolo().getCodiceFascicolo();
            String folderSubject = wsdmprotocolloDocumentoIn.getFascicolo().getOggettoFascicolo();
            String xmlPredecessore = "<root>";
            xmlPredecessore += "<id_predecessore tipo=\"" + folderType + "\" id=\"" + folderId + "\" />";
            xmlPredecessore += "</root>";

            // Attesa di un secondo per permettere a Titulus di effettuare tutte
            // le operazioni automatiche successive
            // all'inserimento in protocollo.
            // Se non si attende e si invoca subito l'associazione del
            // protocollo (appena creato) con il fascicolo (nuovo o esistente
            // non fa differenza) il servizio Titulus segnala che trova il
            // protocollo in "lock" o in fase di elaborazione
            Thread.sleep(1000);

            try {
              titulus4Depository.addPredecessor(nrecord, xmlPredecessore, folderSubject, folderType, folderId);
              WSDMFascicolo wsdmFascicolo = new WSDMFascicolo();
              wsdmFascicolo.setCodiceFascicolo(folderId);
              wsdmFascicolo.setOggettoFascicolo(folderSubject);

              // Lettura numero fascicolo ed altri dati informativi del
              // fascicolo. Utilizza i metodi di ricerca, percio' non e'
              // assicurato che l'utente collegato abbia i diritti per leggere.
              // Se la lettura non va a buon fine si ignorano i settaggi.
              try {
                String documentFoldersXML = titulus4Ugov.getDocumentFolders(physdoc);
                Document documentFolders = DocumentHelper.parseText(documentFoldersXML);
                Element elRootDocumentFolders = documentFolders.getRootElement();
                if (elRootDocumentFolders != null) {
                  List<?> fascicoli = elRootDocumentFolders.selectNodes("//fascicolo");
                  if (fascicoli != null && fascicoli.size() > 0) {
                    for (int f = 0; f < fascicoli.size(); f++) {
                      Element elFascicolo = (Element) fascicoli.get(f);
                      if (elFascicolo.attribute("linked") == null) {
                        if (elFascicolo.element("classif") != null) {
                          wsdmFascicolo.setClassificaFascicoloDescrizione(elFascicolo.element("classif").getText());
                          wsdmFascicolo.setClassificaFascicolo(elFascicolo.element("classif").attribute("cod").getText());
                        }
                        String numeroFascicolo = elFascicolo.attribute("physdoc").getText();
                        wsdmFascicolo.setNumeroFascicolo(numeroFascicolo);
                        try {
                          String annoFascicolo = elFascicolo.attribute("anno").getText();
                          wsdmFascicolo.setAnnoFascicolo(Long.parseLong(annoFascicolo));
                        } catch (Exception e) {

                        }
                      }
                    }
                  }
                }
              } catch (Exception e) {

              }

              wsdmprotocolloDocumento.setFascicolo(wsdmFascicolo);

            } catch (Exception e) {
              logger.error("Errore nell'utilizzo dell'operazione addPredecessor (inserimento del documento/protocollo nel fascicolo): ", e);
            }
          }
        }
      }
    }

    wsdmprotocolloDocumentoRes.setEsito(true);
    wsdmprotocolloDocumentoRes.setProtocolloDocumento(wsdmprotocolloDocumento);
  }

  /**
   * Valorizzazione riferimenti esterni (mittenti o destinari).
   * 
   * @param doc
   * @param wsdmRiferimentiEsterni
   */
  private void _setRiferimentiEsterni(Element elDoc, WSDMProtocolloAnagrafica[] wsdmRiferimentiEsterni) {
    if (wsdmRiferimentiEsterni != null && wsdmRiferimentiEsterni.length > 0) {

      Element elRifEsterni = elDoc.element("rif_esterni");

      for (int e = 0; e < wsdmRiferimentiEsterni.length; e++) {

        Element elRifEsterno = elRifEsterni.addElement("rif_esterno");

        // Codice fiscale
        elRifEsterno.addAttribute("codice_fiscale", wsdmRiferimentiEsterni[e].getCodiceFiscale());

        // Nome e cognome
        String nomeRiferimento = wsdmRiferimentiEsterni[e].getCognomeointestazione();
        if (wsdmRiferimentiEsterni[e].getNome() != null) {
          nomeRiferimento += " " + wsdmRiferimentiEsterni[e].getNome();
        }
        elRifEsterno.addElement("nome").setText(nomeRiferimento);

        // Indirizzo
        String indirizzo = "";
        Element elIndirizzo = elRifEsterno.addElement("indirizzo");
        if (wsdmRiferimentiEsterni[e].getIndirizzoResidenza() != null) {
          indirizzo += wsdmRiferimentiEsterni[e].getIndirizzoResidenza();
        }
        if (wsdmRiferimentiEsterni[e].getLocalitaResidenza() != null) {
          indirizzo += ", " + wsdmRiferimentiEsterni[e].getLocalitaResidenza();
        }
        if (wsdmRiferimentiEsterni[e].getComuneResidenza() != null) {
          indirizzo += ", " + wsdmRiferimentiEsterni[e].getComuneResidenza();
        }

        elIndirizzo.setText(indirizzo);

        if (wsdmRiferimentiEsterni[e].getEmail() != null) {
          String mezzo = wsdmRiferimentiEsterni[e].getMezzo();
          if ("PEC".equals(mezzo)) {
            elIndirizzo.addAttribute("email_certificata", wsdmRiferimentiEsterni[e].getEmail());
          } else {
            elIndirizzo.addAttribute("email", wsdmRiferimentiEsterni[e].getEmail());
            elIndirizzo.addAttribute("email_certificata", wsdmRiferimentiEsterni[e].getEmail());
          }
        }
      }
    }
  }

  @Override
  public WSDMProtocolloDocumentoRes _protocolloLeggi(String username, String password, WSDMLoginAttr loginAttr, Long annoProtocollo,
      String numeroProtocollo) {
    WSDMProtocolloDocumentoRes wsdmprotocolloDocumentoRes = new WSDMProtocolloDocumentoRes();
    try {
      StringBuffer messaggioCtr = new StringBuffer();
      if (TitulusUtilityControllo.ctrProtocolloLeggi(loginAttr, annoProtocollo, numeroProtocollo, messaggioCtr)) {
        String searchQuery = "[/doc/@num_prot]=" + numeroProtocollo;
        if (annoProtocollo != null) {
          searchQuery += " AND [/doc/@anno]=" + annoProtocollo.toString();
        }
        _getWSDMProtocolloDocumentoFromSearch(username, password, loginAttr, wsdmprotocolloDocumentoRes, searchQuery, true);
      } else {
        wsdmprotocolloDocumentoRes.setEsito(false);
        wsdmprotocolloDocumentoRes.setMessaggio(messaggioCtr.toString());
      }
    } catch (WebServiceException w) {
      wsdmprotocolloDocumentoRes.setEsito(false);
      wsdmprotocolloDocumentoRes.setMessaggio(WS_ERROR + " " + w.getMessage());
      logger.error("Errore (_protocolloLeggi)", w);
    } catch (NamingException e) {
      wsdmprotocolloDocumentoRes.setEsito(false);
      wsdmprotocolloDocumentoRes.setMessaggio(NAMING_ERROR + " " + e.getMessage());
      logger.error("Errore (_protocolloLeggi)", e);
    } catch (Throwable t) {
      wsdmprotocolloDocumentoRes.setEsito(false);
      wsdmprotocolloDocumentoRes.setMessaggio(t.getMessage());
      logger.error("Errore (_protocolloLeggi)", t);
    }
    return wsdmprotocolloDocumentoRes;
  }

  /**
   * Ottiene il servizio Titulus4.
   * 
   * @param username
   * @param password
   * @return
   * @throws NamingException
   * @throws Exception
   * @throws ServiceException
   * @throws MalformedURLException
   */
  private Titulus4Ugov getTitulus4Ugov(String username, String password) throws NamingException, Exception, ServiceException,
      MalformedURLException {
    // Indirizzo URL del servizio
    String urlWSTitulus4Ugov = InitialContext.doLookup(WSTITULUS4UGOV);
    if (urlWSTitulus4Ugov == null || (urlWSTitulus4Ugov != null && "".equals(urlWSTitulus4Ugov.trim()))) {
      throw new Exception(WSTITULUS4UGOV_URL_NOT_DEFINED);
    }
    // Assegnazione utente e password principale
    Titulus4UgovServiceLocator titulus4UgovServiceLocator = new Titulus4UgovServiceLocator();
    Titulus4Ugov titulus4Ugov = titulus4UgovServiceLocator.getTitulus4Ugov(new URL(urlWSTitulus4Ugov));
    ((Titulus4UgovSoapBindingStub) titulus4Ugov).setUsername(username);
    ((Titulus4UgovSoapBindingStub) titulus4Ugov).setPassword(password);
    ((Titulus4UgovSoapBindingStub) titulus4Ugov).setTimeout(60 * 60 * 1000);
    return titulus4Ugov;
  }

  /**
   * Ottiene il servizio Titulus4 ed imposta l'utente applicativo ed il profilo
   * 
   * @param username
   * @param password
   * @return
   * @throws NamingException
   * @throws Exception
   * @throws ServiceException
   * @throws MalformedURLException
   */
  private Titulus4Ugov getTitulus4UgovUtenteProfilo(String username, String password, WSDMLoginAttr loginAttr) throws NamingException,
      Exception, ServiceException, MalformedURLException {

    // Servizio Titulus4Ugov
    // Indirizzo URL del servizio
    String urlWSTitulus4Ugov = InitialContext.doLookup(WSTITULUS4UGOV);
    if (urlWSTitulus4Ugov == null || (urlWSTitulus4Ugov != null && "".equals(urlWSTitulus4Ugov.trim()))) {
      throw new Exception(WSTITULUS4UGOV_URL_NOT_DEFINED);
    }
    // Assegnazione utente e password principale
    Titulus4UgovServiceLocator titulus4UgovServiceLocator = new Titulus4UgovServiceLocator();
    Titulus4Ugov titulus4Ugov = titulus4UgovServiceLocator.getTitulus4Ugov(new URL(urlWSTitulus4Ugov));
    ((Titulus4UgovSoapBindingStub) titulus4Ugov).setUsername(username);
    ((Titulus4UgovSoapBindingStub) titulus4Ugov).setPassword(password);
    titulus4UgovServiceLocator.setMaintainSession(true);

    // Gestione utente applicativo e profilo associato all'utente, se l'utente
    // applicativo non e' indicato si utilizza lo username generale del servizio
    String utenteApplicativo = null;
    if (loginAttr != null) {
      if (loginAttr.getLoginTitAttr() != null) {
        utenteApplicativo = loginAttr.getLoginTitAttr().getUtenteApplicativo();
      }
    }
    if (utenteApplicativo == null || (utenteApplicativo != null && "".equals(utenteApplicativo.trim()))) utenteApplicativo = username;
    String numeroProfilo = loginAttr.getLoginTitAttr().getNumeroProfilo();
    String xmlWSUser = titulus4Ugov.setWSUser(utenteApplicativo, numeroProfilo);
    if (xmlWSUser != null) {
      Document document = DocumentHelper.parseText(xmlWSUser);
      Element elRoot = document.getRootElement();
      if (elRoot != null) {
        if ("error".equals(elRoot.attribute("result").getText())) {
          Element elErrore = elRoot.element("errore");
          String codiceErrore = elErrore.attribute("cod").getText();
          String descrizioneErrore = elErrore.element("descrizione").getText();
          throw new Exception(WSTITULUS4UGOV_ERROR + codiceErrore + " - " + descrizioneErrore);
        }
      }
    }

    return titulus4Ugov;
  }

  /**
   * Ottiene il servizio Titulus4Depository.
   * 
   * @param username
   * @param password
   * @return
   * @throws NamingException
   * @throws Exception
   * @throws ServiceException
   * @throws MalformedURLException
   */
  private Titulus4Depository getTitulus4Depository(String username, String password) throws NamingException, Exception, ServiceException,
      MalformedURLException {
    String urlWSTitulus4Depository = InitialContext.doLookup(WSTITULUS4DEPOSITORY);
    if (urlWSTitulus4Depository == null || (urlWSTitulus4Depository != null && "".equals(urlWSTitulus4Depository.trim()))) {
      throw new Exception(WSTITULUS4DEPOSITORY_URL_NOT_DEFINED);
    }
    Titulus4DepositoryServiceLocator titulus4DepositoryServiceLocator = new Titulus4DepositoryServiceLocator();
    Titulus4Depository titulus4Depository = titulus4DepositoryServiceLocator.getTitulus4Depository(new URL(urlWSTitulus4Depository));
    ((Titulus4DepositorySoapBindingStub) titulus4Depository).setUsername(username);
    ((Titulus4DepositorySoapBindingStub) titulus4Depository).setPassword(password);
    ((Titulus4DepositorySoapBindingStub) titulus4Depository).setTimeout(60 * 60 * 1000);
    return titulus4Depository;
  }

  /**
   * Ottiene il servizio Acl4.
   * 
   * @param username
   * @param password
   * @return
   * @throws NamingException
   * @throws Exception
   * @throws ServiceException
   * @throws MalformedURLException
   */
  private Acl4 getAcl4(String username, String password) throws NamingException, Exception, ServiceException, MalformedURLException {
    String urlWSAcl4 = InitialContext.doLookup(WSTITULUSACL4);
    if (urlWSAcl4 == null || (urlWSAcl4 != null && "".equals(urlWSAcl4.trim()))) {
      throw new Exception(WSTITULUSACL4_URL_NOT_DEFINED);
    }
    Acl4ServiceLocator acl4ServiceLocator = new Acl4ServiceLocator();
    Acl4 acl4 = acl4ServiceLocator.getAcl4(new URL(urlWSAcl4));
    ((Acl4SoapBindingStub) acl4).setUsername(username);
    ((Acl4SoapBindingStub) acl4).setPassword(password);
    ((Acl4SoapBindingStub) acl4).setTimeout(60 * 60 * 1000);
    return acl4;

  }

  /**
   * Lettura del protocollo/documento a fronte di una richiesta di ricerca.
   * 
   * @param wsdmprotocolloDocumentoRes
   * @param searchResultXML
   * @throws DocumentException
   * @throws ParseException
   */
  private void _getWSDMProtocolloDocumentoFromSearch(String username, String password, WSDMLoginAttr loginAttr,
      WSDMProtocolloDocumentoRes wsdmprotocolloDocumentoRes, String searchQuery, boolean extractAttachment) throws Exception {

    WSDMProtocolloDocumento wsdmprotocolloDocumento = new WSDMProtocolloDocumento();
    Titulus4Ugov titulus4Ugov = this.getTitulus4UgovUtenteProfilo(username, password, loginAttr);

    String searchResultXML = titulus4Ugov.search(searchQuery, null, null);
    Document document = DocumentHelper.parseText(searchResultXML);
    Element elRoot = document.getRootElement();
    if (elRoot != null) {
      Element elDoc = elRoot.element("doc");
      if (elDoc != null) {
        String physdoc = elDoc.attributeValue("physdoc");
        String tipo = elDoc.attributeValue("tipo");
        String anno = elDoc.attributeValue("anno");
        String num_prot = elDoc.attributeValue("num_prot");
        String data_prot = elDoc.attributeValue("data_prot");

        // Tipo, verso
        if (TITULUS_ARRIVO.equals(tipo)) {
          wsdmprotocolloDocumento.setInout(WSDMProtocolloInOut.IN);
        } else if (TITULUS_PARTENZA.equals(tipo)) {
          wsdmprotocolloDocumento.setInout(WSDMProtocolloInOut.OUT);
        } else if (TITULUS_VARIE.equals(tipo)) {
          wsdmprotocolloDocumento.setInout(WSDMProtocolloInOut.INT);
        }

        // Oggetto
        String oggetto = null;
        Element elOggetto = elDoc.element("oggetto");
        if (elOggetto != null) {
          oggetto = elOggetto.getText();
        }

        // Classifica
        String classif_cod = null;
        String classif_desc = null;
        
//        Element elClassif = elDoc.element("classif");
//        if (elClassif != null) {
//          classif_cod = elClassif.attributeValue("cod");
//          classif_desc = elClassif.getText();
//        }
        
        // 04/05/2020 - Gestione della classifica e della sua descrizione (requisito M13)
        Element elExtra = elDoc.element("extra");
        if (elExtra != null) {
          if (elExtra.element("sistema_mittente") != null) {
            if (elExtra.element("sistema_mittente").element("codice_classificazione_voce") != null) {
              classif_cod = elExtra.element("sistema_mittente").element("codice_classificazione_voce").getText();
             } 
            if (elExtra.element("sistema_mittente").element("descrizione_classificazione_voce") != null) {
              classif_desc = elExtra.element("sistema_mittente").element("descrizione_classificazione_voce").getText();
            } 
          }
        }

        // Anno
        try {
          wsdmprotocolloDocumento.setAnnoProtocollo(Long.parseLong(anno));
        } catch (Exception e) {

        }

        // Data protocollo
        try {
          SimpleDateFormat fmt = new SimpleDateFormat("yyyyMMdd");
          wsdmprotocolloDocumento.setDataProtocollo(fmt.parse(data_prot));
        } catch (Exception e) {
        }

        wsdmprotocolloDocumento.setClassifica(classif_cod);
        wsdmprotocolloDocumento.setClassificaDescrizione(classif_desc);
        wsdmprotocolloDocumento.setNumeroProtocollo(num_prot);
        wsdmprotocolloDocumento.setNumeroDocumento(physdoc);
        wsdmprotocolloDocumento.setOggetto(oggetto);

        // Lettura dei riferimenti esterni
        List<?> riferimentiEsterni = elDoc.selectNodes("//doc/rif_esterni/rif");
        if (riferimentiEsterni != null && riferimentiEsterni.size() > 0) {
          WSDMProtocolloAnagrafica[] anagrafiche = new WSDMProtocolloAnagrafica[riferimentiEsterni.size()];
          for (int r = 0; r < riferimentiEsterni.size(); r++) {
            Element rif = (Element) riferimentiEsterni.get(r);
            String nome = rif.element("nome").getText();
            anagrafiche[r] = new WSDMProtocolloAnagrafica();
            anagrafiche[r].setNome(nome);
          }
          if (TITULUS_ARRIVO.equals(tipo)) {
            wsdmprotocolloDocumento.setMittenti(anagrafiche);
          } else if (TITULUS_PARTENZA.equals(tipo)) {
            wsdmprotocolloDocumento.setDestinatari(anagrafiche);
          }
        }

        // Lettura degli allegati
        if (extractAttachment) {
          List<?> files = elDoc.selectNodes("//doc/*/*[name()='xw:file'][not(@der_from)]");
          if (files != null && files.size() > 0) {
            WSDMProtocolloAllegato[] allegati = new WSDMProtocolloAllegato[files.size()];
            for (int a = 0; a < files.size(); a++) {
              Element file = (Element) files.get(a);
              String name = file.attributeValue("name", "");
              String title = file.attributeValue("title", "");
              allegati[a] = new WSDMProtocolloAllegato();
              allegati[a].setNome(name);
              try {
                AttachmentBean attachmentBean = titulus4Ugov.getAttachment(name);
                byte[] attachment = attachmentBean.getContent();
                allegati[a].setContenuto(attachment);
                allegati[a].setTitolo(title);
              } catch (Exception e) {
                allegati[a].setTitolo(title + " [" + e.getMessage() + "]");
              }
            }
            wsdmprotocolloDocumento.setAllegati(allegati);
          }
        }

        // Lettura del fascicolo
        String documentFoldersXML = titulus4Ugov.getDocumentFolders(physdoc);
        Document documentFolders = DocumentHelper.parseText(documentFoldersXML);
        Element elRootDocumentFolders = documentFolders.getRootElement();
        if (elRootDocumentFolders != null) {
          List<?> fascicoli = elRootDocumentFolders.selectNodes("//fascicolo");
          if (fascicoli != null && fascicoli.size() > 0) {
            for (int f = 0; f < fascicoli.size(); f++) {
              Element elFascicolo = (Element) fascicoli.get(f);
              if (elFascicolo.attribute("linked") == null) {
                WSDMFascicolo wsdmFascicolo = new WSDMFascicolo();
                if (elFascicolo.element("classif") != null) {
                  wsdmFascicolo.setClassificaFascicoloDescrizione(elFascicolo.element("classif").getText());
                  wsdmFascicolo.setClassificaFascicolo(elFascicolo.element("classif").attribute("cod").getText());
                }
                if (elFascicolo.element("oggetto") != null) {
                  wsdmFascicolo.setOggettoFascicolo(elFascicolo.element("oggetto").getText());
                }
                String numeroFascicolo = elFascicolo.attribute("physdoc").getText();
                wsdmFascicolo.setNumeroFascicolo(numeroFascicolo);
                try {
                  String annoFascicolo = elFascicolo.attribute("anno").getText();
                  wsdmFascicolo.setAnnoFascicolo(Long.parseLong(annoFascicolo));
                } catch (Exception e) {

                }

                // Ricerca del codice fascicolo (dato extra) in base al numero
                // Lettura informazioni generali del fascicolo
                String codiceFascicolo = _getCodiceFascicoloFromNumeroFascicolo(titulus4Ugov, numeroFascicolo);
                wsdmFascicolo.setCodiceFascicolo(codiceFascicolo);

                wsdmprotocolloDocumento.setFascicolo(wsdmFascicolo);
              }
            }
          }
        }

        wsdmprotocolloDocumentoRes.setEsito(true);
        wsdmprotocolloDocumentoRes.setProtocolloDocumento(wsdmprotocolloDocumento);
      } else {
        wsdmprotocolloDocumentoRes.setEsito(false);
        wsdmprotocolloDocumentoRes.setMessaggio("Il protocollo richiesto non esiste.");
      }
    }
  }

  /**
   * Ricava il codice fascicolo (dato extra) dal numero fascicolo.
   * 
   * @param titulus4Ugov
   * @param numeroFascicolo
   * @return
   * @throws RemoteException
   * @throws DocumentException
   */
  private String _getCodiceFascicoloFromNumeroFascicolo(Titulus4Ugov titulus4Ugov, String numeroFascicolo) throws RemoteException,
      DocumentException {

    String codiceFascicolo = null;

    String getFolderXMLResult = titulus4Ugov.getFolder(numeroFascicolo);
    Document documentFolder = DocumentHelper.parseText(getFolderXMLResult);
    Element elRootFolder = documentFolder.getRootElement();
    if (elRootFolder != null) {
      Element elDocument = elRootFolder.element("Document");
      if (elDocument != null) {
        Element elFascicolo = elDocument.element("fascicolo");
        if (elFascicolo != null) {
          Element elExtra = elFascicolo.element("extra");
          if (elExtra != null) {
            Element elInformazioniAgggiuntive = elExtra.element("informazioni_aggiuntive");
            if (elInformazioniAgggiuntive != null) {
              Element elIdentificativo = elInformazioniAgggiuntive.element("identificativo");
              if (elIdentificativo != null) {
                codiceFascicolo = elIdentificativo.getText();
              }
            }
          }
        }
      }
    }

    return codiceFascicolo;

  }

  @Override
  public WSDMProtocolloDocumentoRes _documentoInserisci(String username, String password, WSDMLoginAttr loginAttr,
      WSDMProtocolloDocumentoIn wsdmprotocolloDocumentoIn) {

    WSDMProtocolloDocumentoRes wsdmprotocolloDocumentoRes = new WSDMProtocolloDocumentoRes();

    try {
      StringBuffer messaggioCtr = new StringBuffer();
      if (TitulusUtilityControllo.ctrDocumentoInserisci(loginAttr, wsdmprotocolloDocumentoIn, messaggioCtr)) {
        _protocolloDocumentoInserisci(username, password, loginAttr, wsdmprotocolloDocumentoIn, wsdmprotocolloDocumentoRes);
      } else {
        wsdmprotocolloDocumentoRes.setEsito(false);
        wsdmprotocolloDocumentoRes.setMessaggio(messaggioCtr.toString());
      }

    } catch (WebServiceException w) {
      wsdmprotocolloDocumentoRes.setEsito(false);
      wsdmprotocolloDocumentoRes.setMessaggio(WS_ERROR + " " + w.getMessage());
      logger.error("Errore (_protocolloInserisci)", w);
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

  @Override
  public WSDMProtocolloDocumentoRes _documentoLeggi(String username, String password, WSDMLoginAttr loginAttr, String numeroDocumento) {
    WSDMProtocolloDocumentoRes wsdmprotocolloDocumentoRes = new WSDMProtocolloDocumentoRes();
    try {
      StringBuffer messaggioCtr = new StringBuffer();
      if (TitulusUtilityControllo.ctrDocumentoLeggi(loginAttr, numeroDocumento, messaggioCtr)) {
        String searchQuery = "[//@physdoc]=" + numeroDocumento;
        _getWSDMProtocolloDocumentoFromSearch(username, password, loginAttr, wsdmprotocolloDocumentoRes, searchQuery, true);
      } else {
        wsdmprotocolloDocumentoRes.setEsito(false);
        wsdmprotocolloDocumentoRes.setMessaggio(messaggioCtr.toString());
      }
    } catch (WebServiceException w) {
      wsdmprotocolloDocumentoRes.setEsito(false);
      wsdmprotocolloDocumentoRes.setMessaggio(WS_ERROR + " " + w.getMessage());
      logger.error("Errore (_documentoLeggi)", w);
    } catch (NamingException e) {
      wsdmprotocolloDocumentoRes.setEsito(false);
      wsdmprotocolloDocumentoRes.setMessaggio(NAMING_ERROR + " " + e.getMessage());
      logger.error("Errore (_documentoLeggi)", e);
    } catch (Throwable t) {
      wsdmprotocolloDocumentoRes.setEsito(false);
      wsdmprotocolloDocumentoRes.setMessaggio(t.getMessage());
      logger.error("Errore (_documentoLeggi)", t);
    }

    return wsdmprotocolloDocumentoRes;
  }

  public WSDMProtocolloDocumentoRes _documentoMetadatiLeggi(String username, String password, WSDMLoginAttr loginAttr,
      String numeroDocumento) {
    WSDMProtocolloDocumentoRes wsdmprotocolloDocumentoRes = new WSDMProtocolloDocumentoRes();
    try {
      StringBuffer messaggioCtr = new StringBuffer();
      if (TitulusUtilityControllo.ctrDocumentoLeggi(loginAttr, numeroDocumento, messaggioCtr)) {
        String searchQuery = "[//@physdoc]=" + numeroDocumento;
        _getWSDMProtocolloDocumentoFromSearch(username, password, loginAttr, wsdmprotocolloDocumentoRes, searchQuery, false);
      } else {
        wsdmprotocolloDocumentoRes.setEsito(false);
        wsdmprotocolloDocumentoRes.setMessaggio(messaggioCtr.toString());
      }
    } catch (WebServiceException w) {
      wsdmprotocolloDocumentoRes.setEsito(false);
      wsdmprotocolloDocumentoRes.setMessaggio(WS_ERROR + " " + w.getMessage());
      logger.error("Errore (_documentoLeggi)", w);
    } catch (NamingException e) {
      wsdmprotocolloDocumentoRes.setEsito(false);
      wsdmprotocolloDocumentoRes.setMessaggio(NAMING_ERROR + " " + e.getMessage());
      logger.error("Errore (_documentoLeggi)", e);
    } catch (Throwable t) {
      wsdmprotocolloDocumentoRes.setEsito(false);
      wsdmprotocolloDocumentoRes.setMessaggio(t.getMessage());
      logger.error("Errore (_documentoLeggi)", t);
    }

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
      Long annoFascicolo, String numeroFascicolo, String classificaFascicolo) {
    WSDMFascicoloRes wsdmFascicoloRes = new WSDMFascicoloRes();

    try {
      StringBuffer messaggioCtr = new StringBuffer();
      if (TitulusUtilityControllo.ctrFascicoloLeggi(loginAttr, codiceFascicolo, annoFascicolo, numeroFascicolo, messaggioCtr)) {
        Titulus4Ugov titulus4Ugov = this.getTitulus4UgovUtenteProfilo(username, password, loginAttr);

        WSDMFascicolo wsdmFascicolo = new WSDMFascicolo();

        String codiceNumeroFascicolo = null;
        if (codiceFascicolo != null) {
          codiceNumeroFascicolo = codiceFascicolo;
        } else {
          codiceNumeroFascicolo = numeroFascicolo;
        }

        // Lettura informazioni generali del fascicolo
        String getFolderXMLResult = titulus4Ugov.getFolder(codiceNumeroFascicolo);
        Document documentFolder = DocumentHelper.parseText(getFolderXMLResult);
        Element elRootFolder = documentFolder.getRootElement();
        if (elRootFolder != null) {
          Element elDocument = elRootFolder.element("Document");

          // Numero
          String physdoc = elDocument.attributeValue("physdoc");
          if (physdoc != null) {
            wsdmFascicolo.setNumeroFascicolo(physdoc);
          }

          Element elFascicolo = elDocument.element("fascicolo");
          if (elFascicolo != null) {
            // Anno
            String anno = elFascicolo.attributeValue("anno");
            if (anno != null && !"".equals(anno.trim())) {
              wsdmFascicolo.setAnnoFascicolo(Long.parseLong(anno));
            }

            // Classifica (codice e descrizione)
            Element elClassif = elFascicolo.element("classif");
            if (elClassif != null) {
              wsdmFascicolo.setClassificaFascicolo(elClassif.attributeValue("cod"));
              wsdmFascicolo.setClassificaFascicoloDescrizione(elClassif.getText());
            }

            // Oggetto
            Element elOggetto = elFascicolo.element("oggetto");
            if (elOggetto != null) {
              String oggetto = elOggetto.getText();
              if (oggetto != null) {
                wsdmFascicolo.setOggettoFascicolo(oggetto);
              }
            }

            // Codice fascicolo: dato extra
            Element elExtra = elFascicolo.element("extra");
            if (elExtra != null) {
              Element elInformazioniAgggiuntive = elExtra.element("informazioni_aggiuntive");
              if (elInformazioniAgggiuntive != null) {
                Element elIdentificativo = elInformazioniAgggiuntive.element("identificativo");
                if (elIdentificativo != null) {
                  wsdmFascicolo.setCodiceFascicolo(elIdentificativo.getText());
                }
              }
            }
          }
        }

        // Lettura dei documenti contenuti nel fascicolo
        String getFolderContentXMLResult = titulus4Ugov.getFolderContent(numeroFascicolo, true);
        Document documentFolderContent = DocumentHelper.parseText(getFolderContentXMLResult);
        if (documentFolderContent != null) {
          List<?> elDocs = documentFolderContent.selectNodes("//doc");
          WSDMFascicoloDocumento[] documenti = new WSDMFascicoloDocumento[elDocs.size()];
          for (int c = 0; c < elDocs.size(); c++) {
            documenti[c] = new WSDMFascicoloDocumento();
            Element elDoc = (Element) elDocs.get(c);

            // Numero documento
            documenti[c].setNumeroDocumento(elDoc.attributeValue("physdoc"));

            // Data protocollo
            try {
              String data_prot = elDoc.attributeValue("data_prot");
              if (data_prot != null) {
                SimpleDateFormat fmt = new SimpleDateFormat("yyyymmdd");
                documenti[c].setDataProtocollo(fmt.parse(data_prot));
              }
            } catch (Exception e) {
            }

            // Anno protocollo
            try {
              String anno = elDoc.attributeValue("anno");
              if (anno != null) {
                documenti[c].setAnnoProtocollo(Long.parseLong(anno));
              }
            } catch (Exception e) {

            }

            // Numero protocollo
            String num_prot = elDoc.attributeValue("num_prot");
            if (num_prot != null) {
              documenti[c].setNumeroProtocollo(num_prot);
            }

            // Oggetto
            Element elOggetto = elDoc.element("oggetto");
            if (elOggetto != null) {
              String oggetto = elOggetto.getText();
              if (oggetto != null) {
                documenti[c].setOggetto(oggetto);
              }
            }

            // Tipo, verso
            String tipo = elDoc.attributeValue("tipo");
            if (TITULUS_ARRIVO.equals(tipo)) {
              documenti[c].setInout(WSDMProtocolloInOut.IN);
            } else if (TITULUS_PARTENZA.equals(tipo)) {
              documenti[c].setInout(WSDMProtocolloInOut.OUT);
            } else if (TITULUS_INTERNO.equals(tipo)) {
              documenti[c].setInout(WSDMProtocolloInOut.INT);
            } else if (TITULUS_VARIE.equals(tipo)) {
              documenti[c].setInout(WSDMProtocolloInOut.INT);
            }
          }

          wsdmFascicolo.setDocumenti(documenti);

        }
        wsdmFascicoloRes.setEsito(true);
        wsdmFascicoloRes.setFascicolo(wsdmFascicolo);

      } else {
        wsdmFascicoloRes.setEsito(false);
        wsdmFascicoloRes.setMessaggio(messaggioCtr.toString());
      }
    } catch (WebServiceException w) {
      wsdmFascicoloRes.setEsito(false);
      wsdmFascicoloRes.setMessaggio(WS_ERROR + " " + w.getMessage());
      logger.error("Errore (_fascicoloDocumentaleLeggi)", w);
    } catch (NamingException e) {
      wsdmFascicoloRes.setEsito(false);
      wsdmFascicoloRes.setMessaggio(NAMING_ERROR + " " + e.getMessage());
      logger.error("Errore (_fascicoloDocumentaleLeggi)", e);
    } catch (Throwable t) {
      wsdmFascicoloRes.setEsito(false);
      wsdmFascicoloRes.setMessaggio(t.getMessage());
      logger.error("Errore (_fascicoloDocumentaleLeggi)", t);
    }

    return wsdmFascicoloRes;
  }

  @Override
  public WSDMFascicoloRes _fascicoloMetadatiLeggi(String username, String password, WSDMLoginAttr loginAttr, String codiceFascicolo,
      Long annoFascicolo, String numeroFascicolo, String classificaFascicolo) {
    return _fascicoloLeggi(username, password, loginAttr, codiceFascicolo, annoFascicolo, numeroFascicolo, classificaFascicolo);
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
    try {

      String query = "";
      if (voce != null && !"".equals(voce.trim())) {
        query = "[/indice_titolario/@voce]=\"" + voce + "\"";
      } else {
        query = "[/indice_titolario/@voce]=\"UBUY – Tipo fornitura\"";
        query += " OR [/indice_titolario/@voce]=\"UBUY - Tipo servizi\"";
        query += " OR [/indice_titolario/@voce]=\"UBUY - Tipo lavori\"";
      }
      QueryParams queryParams = new QueryParams();
      queryParams.setTitlePageSize(1000);

      Acl4 acl4 = this.getAcl4(username, password);

      String xml = acl4.search(query, null, queryParams);
      if (xml != null) {
        Document document = DocumentHelper.parseText(xml);
        Element rootElement = document.getRootElement();
        if (rootElement != null) {
          List<?> indiciTitolario = rootElement.selectNodes("//indice_titolario");
          if (indiciTitolario != null && indiciTitolario.size() > 0) {
            WSDMClassifica[] wsdmClassifiche = new WSDMClassifica[indiciTitolario.size()];
            for (int i = 0; i < indiciTitolario.size(); i++) {
              wsdmClassifiche[i] = new WSDMClassifica();
              Element indiceTitolario = (Element) indiciTitolario.get(i);

              // Voce
              String indiceTitolarioVoce = indiceTitolario.attribute("voce").getText();
              wsdmClassifiche[i].setVoce(indiceTitolarioVoce);

              // Codice e descrizione della classifica associata alla voce
              Element compilazione_automatica = indiceTitolario.element("compilazione_automatica");
              if (compilazione_automatica != null) {
                Element classif = compilazione_automatica.element("classif");
                if (classif != null) {
                  wsdmClassifiche[i].setDescrizione(classif.getText());
                  if (classif.attribute("cod") != null) {
                    wsdmClassifiche[i].setCodice(classif.attribute("cod").getText());
                  }
                }
              }
            }
            wsdmListaClassificheRes.setListaClassifiche(wsdmClassifiche);
            wsdmListaClassificheRes.setEsito(true);
          } else {
            wsdmListaClassificheRes.setEsito(false);
            wsdmListaClassificheRes.setMessaggio("La ricerca non ha restituito alcuna classifica");
          }
        }
      }
    } catch (WebServiceException w) {
      wsdmListaClassificheRes.setEsito(false);
      wsdmListaClassificheRes.setMessaggio(WS_ERROR + " " + w.getMessage());
      logger.error("Errore (_listaClassifiche)", w);
    } catch (NamingException e) {
      wsdmListaClassificheRes.setEsito(false);
      wsdmListaClassificheRes.setMessaggio(NAMING_ERROR + " " + e.getMessage());
      logger.error("Errore (_listaClassifiche)", e);
    } catch (Throwable t) {
      wsdmListaClassificheRes.setEsito(false);
      wsdmListaClassificheRes.setMessaggio(t.getMessage());
      logger.error("Errore (_listaClassifiche)", t);
    }

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
