package it.maggioli.eldasoft.bl;

import java.util.Date;

import it.maggioli.eldasoft.ws.dm.*;

public interface IWSDMManager {

  static public final String OPERATION_NOT_SUPPORTED = "WSDM - Operazione non disponibile.";
  static public final String NO_MANAGER              = "WSDM - Inoltro richiesta non possibile: il sistema di protocollazione e gestione documentale indicato non e' tra quelli previsti.";

  static public final String WS_ERROR                = "WSDM - Errore durante l'inoltro della richiesta al web service. ";
  static public final String NAMING_ERROR            = "WSDM - Errore durante la lettura delle variabili d'ambiente. ";
  static public final String URL_ERROR               = "WSDM - L'indirizzo del web service non e' corretto. ";
  static public final String URL_NOT_DEFINED         = "WSDM - L'indirizzo del web service non e' definito. ";

  /**
   * Lettura della lista dei profili.
   * 
   * @param username
   * @param password
   * @param utenteApplicativo
   * @return
   */
  public abstract WSDMListaProfiliRes _listaProfili(String username, String password, String utenteApplicativo);

  /**
   * Lettura delle amministrazioni ed Aoo.
   * 
   * @param username
   * @param password
   * @return
   */
  public abstract WSDMListaAmministrazioniAooRes _listaAmministrazioniAoo(String username, String password);

  /**
   * Lettura della lista degli uffici.
   * 
   * @param username
   * @param password
   * @param codiceAoo
   * @param descrizioneUfficio
   * @param utente
   * @return
   */
  public abstract WSDMListaUfficiRes _listaUffici(String username, String password, WSDMLoginAttr loginAttr, String codiceAoo,
      String descrizioneUfficio, String utente);

  /**
   * Lettura della lista delle classifiche
   * 
   * @param username
   * @param password
   * @param loginAttr
   * @param codice
   * @param descrizione
   * @param voce
   * @return
   */
  public abstract WSDMListaClassificheRes _listaClassifiche(String username, String password, WSDMLoginAttr loginAttr, String codice,
      String descrizione, String voce);

  /**
   * Inserimento in protocollo.
   */
  public abstract WSDMProtocolloDocumentoRes _protocolloInserisci(String username, String password, WSDMLoginAttr loginAttr,
      WSDMProtocolloDocumentoIn wsdmprotocolloDocumentoIn);

  /**
   * Modifica dei termini di riservatezza di uno o piu' elemento documentali
   * protocollati.
   */
  public abstract WSDMProtocolloModificaRes _protocolloModifica(String username, String password, WSDMLoginAttr loginAttr,
      WSDMProtocolloModificaIn wsdmprotocolloModificaIn);

  /**
   * Lettura del protocollo dall'anno e dal numero di protocollo.
   */
  public abstract WSDMProtocolloDocumentoRes _protocolloLeggi(String username, String password, WSDMLoginAttr loginAttr,
      Long annoProtocollo, String numeroProtocollo);

  /**
   * Inserimento di un documento senza richiesta di protocollo.
   */
  public abstract WSDMProtocolloDocumentoRes _documentoInserisci(String username, String password, WSDMLoginAttr loginAttr,
      WSDMProtocolloDocumentoIn wsdmprotocolloDocumentoIn);

  /**
   * Inserimento della richiesta di firma.
   * 
   * @param username
   * @param password
   * @param loginAttr
   * @param wsdmprotocolloDocumentoIn
   * @return
   */
  public abstract WSDMProtocolloDocumentoRes _firmaInserisci(String username, String password, WSDMLoginAttr loginAttr,
      WSDMProtocolloDocumentoIn wsdmprotocolloDocumentoIn);

  /**
   * Verifica della firma.
   * 
   * @param username
   * @param password
   * @param loginAttr
   * @param numeroDocumento
   * @return
   */
  public abstract WSDMProtocolloDocumentoRes _firmaVerifica(String username, String password, WSDMLoginAttr loginAttr,
      String numeroDocumento);

  /**
   * Lettura di un documento (con protocollo o senza protocollo).
   */
  public abstract WSDMProtocolloDocumentoRes _documentoLeggi(String username, String password, WSDMLoginAttr loginAttr,
      String numeroDocumento);

  /**
   * Collegamento fra elementi documentali.
   * 
   * @param username
   * @param password
   * @param loginAttr
   * @param numeroDocumentoPadre
   * @param numeroDocumentoFiglio
   * @param tipoCollegamento
   * @return
   */
  public abstract WSDMDocumentoCollegaRes _documentoCollega(String username, String password, WSDMLoginAttr loginAttr,
      String numeroDocumentoPadre, String numeroDocumentoFiglio, String tipoCollegamento);

  /**
   * Lettura dei metadati di un documento (con protocollo o senza protocollo).
   */
  public abstract WSDMProtocolloDocumentoRes _documentoMetadatiLeggi(String username, String password, WSDMLoginAttr loginAttr,
      String numeroDocumento);

  /**
   * Inserimento di un nuovo fascicolo.
   */
  public abstract WSDMFascicoloRes _fascicoloInserisci(String username, String password, WSDMLoginAttr loginAttr,
      WSDMFascicoloIn wsdmfascicoloIn);

  /**
   * Aggiunge un documento esistente (gia' registrato) ad un fascicolo
   * esistente.
   */
  public abstract WSDMFascicoloRes _fascicoloAggiungiDocumento(String username, String password, WSDMLoginAttr loginAttr,
      String codiceFascicolo, String numeroDocumento);

  /**
   * Lettura del fascicolo con i documenti allegati (solo riferimenti).
   */
  public abstract WSDMFascicoloRes _fascicoloLeggi(String username, String password, WSDMLoginAttr loginAttr, String codiceFascicolo,
      Long annoFascicolo, String numeroFascicolo, String classificaFascicolo, String oggettoFascicolo);

  /**
   * Lettura del fascicolo con i documenti allegati (solo riferimenti).
   */
  public abstract WSDMFascicoloRes _fascicoloMetadatiLeggi(String username, String password, WSDMLoginAttr loginAttr,
      String codiceFascicolo, Long annoFascicolo, String numeroFascicolo, String classificaFascicolo, String oggettoFascicolo);

  /**
   * Modifica dei dati personalizzati del fascicolo
   */
  public abstract WSDMFascicoloModificaRes _fascicoloModifica(String username, String password, WSDMLoginAttr loginAttr,
      WSDMFascicoloModificaIn wsdmfascicoloModificaIn);

  /**
   * Lettura dell'atto o del contratto e degli allegati associati.
   * 
   * @param username
   * @param password
   * @param loginAttr
   * @param anno
   * @param numero
   * @return
   */
  public abstract WSDMProtocolloDocumentoRes _attoContrattoLeggi(String username, String password, WSDMLoginAttr loginAttr, String tipo,
      String organo, Long anno, String numero);

  /**
   * Invio mail.
   * 
   * @param username
   * @param password
   * @param loginAttr
   * @param wsdmInviaMail
   * @return
   */
  public abstract WSDMInviaMailRes _inviaMail(String username, String password, WSDMLoginAttr loginAttr, WSDMInviaMail wsdmInviaMail);

  /**
   * Verifica mail inviata.
   * 
   * @param username
   * @param password
   * @param loginAttr
   * @param numeroDocumento
   * @param annoProtocollo
   * @param numeroProtocollo
   * @return
   */
  public abstract WSDMVerificaMailRes _verificaMail(String username, String password, WSDMLoginAttr loginAttr, String numeroDocumento,
      Long annoProtocollo, String numeroProtocollo);

  /**
   * Ricerca degli atti e dei contratti.
    */
  public abstract WSDMAttoContrattoRes _attoContrattoRicerca(String username, String password, WSDMLoginAttr loginAttr, String tipo,
      String organo, Long anno, String numeroDa, String numeroA, Date dataDa, Date dataA);

  /**
   * Lettura dei dettagli di una anagrafica.
   * 
   * @param username
   * @param password
   * @param loginAttr
   * @param codiceAnagrafica
   * @return
   */
  public abstract WSDMAnagraficaLeggiRes _anagraficaLeggi(String username, String password, WSDMLoginAttr loginAttr,
      String codiceAnagrafica);

  /**
   * Lettura della lista degli operatori.
   */
  public abstract WSDMListaOperatoriRes _listaOperatori(String username, String password, WSDMLoginAttr loginAttr, String cognome,
      String codiceFiscale);

  /**
   * Lettura della lista dei tipi di trasmissione.
   * 
   * @param username
   * @param password
   * @param loginAttr
   * @return
   */
  public abstract WSDMListaTipiTrasmissioneRes _listaTipiTrasmissione(String username, String password, WSDMLoginAttr loginAttr);

  /**
   * Effettua la trasmissione di uno o piu' documenti.
   * 
   * @param username
   * @param password
   * @param loginAttr
   * @param trasmissioneIn
   * @return
   */
  public abstract WSDMTrasmissioneRes _trasmissione(String username, String password, WSDMLoginAttr loginAttr,
      WSDMTrasmissioneIn trasmissioneIn);

  /**
   * Aggiunge uno o piu' allegati ad un elemento documentale protocollato o non
   * protocollato.
   * 
   * @param username
   * @param password
   * @param loginAttr
   * @param wsdmaggiungiAllegatiIn
   * @return
   */
  public abstract WSDMAggiungiAllegatiRes _aggiungiAllegati(String username, String password, WSDMLoginAttr loginAttr,
      WSDMAggiungiAllegatiIn wsdmaggiungiAllegatiIn);

  /**
   * Ricerca gli account email in base ad vari parametri di ricerca indicati
   * nell'oggetto WSDMRicercaAccountEmail.
   */
  public abstract WSDMListaAccountEmailRes _listaAccountEmail(String username, String password, WSDMLoginAttr loginAttr,
      WSDMRicercaAccountEmail ricercaAccountEmail);

  /**
   * Ricerca dei fascicolo.
   * 
   * @param username
   * @param password
   * @param loginAttr
   * @param ricercaFascicolo
   * @return
   */
  public abstract WSDMRicercaFascicoloRes _fascicoloRicerca(String username, String password, WSDMLoginAttr loginAttr,
      WSDMRicercaFascicolo ricercaFascicolo);

  /**
   * Lettura dell'esito del protocollo asincrono.
   */
  public abstract WSDMProtocolloDocumentoRes _protocolloAsincronoEsito(String username, String password, WSDMLoginAttr loginAttr,
      String id);

  /**
   * Invio di informazioni aggiuntive al documento inserito nel documentale.
   * 
   * @param username
   * @param password
   * @param loginAttr
   * @param documentoAggiungiInformazioni
   * @return
   */
  public abstract WSDMDocumentoAggiungiInformazioniRes _documentoAggiungiInformazioni(String username, String password,
      WSDMLoginAttr loginAttr, WSDMDocumentoAggiungiInformazioni documentoAggiungiInformazioni);

  /**
   * Chiusura del fascicolo.
   *
   * @param username
   * @param password
   * @param loginAttr
   * @param fascicoloChiudiIn
   * @return
   */
  public abstract WSDMFascicoloChiudiRes _fascicoloChiudi(String username, String password, WSDMLoginAttr loginAttr,
     WSDMFascicoloChiudiIn fascicoloChiudiIn);

}