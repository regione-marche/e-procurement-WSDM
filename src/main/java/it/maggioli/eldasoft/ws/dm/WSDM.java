package it.maggioli.eldasoft.ws.dm;

import java.rmi.RemoteException;
import java.util.Date;

import javax.jws.WebParam;
import javax.jws.WebService;

import org.apache.cxf.annotations.WSDLDocumentation;

@WebService
public interface WSDM {

  @WSDLDocumentation("ListaProfili")
  WSDMListaProfiliRes WSDMListaProfili(@WebParam(name = "utenteApplicativo") String utenteApplicativo) throws RemoteException;

  @WSDLDocumentation("ListaAmministrazioniAoo")
  WSDMListaAmministrazioniAooRes WSDMListaAmministrazioniAoo() throws RemoteException;

  @WSDLDocumentation("ListaUffici")
  WSDMListaUfficiRes WSDMListaUffici(@WebParam(name = "loginAttr") WSDMLoginAttr login, @WebParam(name = "codiceAoo") String codiceAoo,
      @WebParam(name = "descrizioneUfficio") String descrizioneUfficio, @WebParam(name = "utente") String utente) throws RemoteException;

  @WSDLDocumentation("ListaClassifiche")
  WSDMListaClassificheRes WSDMListaClassifiche(@WebParam(name = "loginAttr") WSDMLoginAttr login, @WebParam(name = "codice") String codice,
      @WebParam(name = "descrizione") String descrizione, @WebParam(name = "voce") String voce) throws RemoteException;

  @WSDLDocumentation("Richiesta di inserimento nel sistema documentale e protocollazione")
  WSDMProtocolloDocumentoRes WSDMProtocolloInserisci(@WebParam(name = "loginAttr") WSDMLoginAttr login,
      @WebParam(name = "protocolloDocumentoIn") WSDMProtocolloDocumentoIn wsdmprotocolloDocumentoIn) throws RemoteException;

  @WSDLDocumentation("Lettura del protocollo")
  WSDMProtocolloDocumentoRes WSDMProtocolloLeggi(@WebParam(name = "loginAttr") WSDMLoginAttr login,
      @WebParam(name = "annoProtocollo") Long annoProtocollo, @WebParam(name = "numeroProtocollo") String numeroProtocollo)
      throws RemoteException;

  @WSDLDocumentation("Modifica termini di riservatezza del protocollo")
  WSDMProtocolloModificaRes WSDMProtocolloModifica(@WebParam(name = "loginAttr") WSDMLoginAttr login,
      @WebParam(name = "protocolloModificaIn") WSDMProtocolloModificaIn wsdmprotocolloModificaIn) throws RemoteException;

  @WSDLDocumentation("Richiesta di inserimento nel sistema documentale (senza protocollazione)")
  WSDMProtocolloDocumentoRes WSDMDocumentoInserisci(@WebParam(name = "loginAttr") WSDMLoginAttr login,
      @WebParam(name = "protocolloDocumentoIn") WSDMProtocolloDocumentoIn wsdmprotocolloDocumentoIn) throws RemoteException;

  @WSDLDocumentation("Inserimento richiesta di firma")
  WSDMProtocolloDocumentoRes WSDMFirmaInserisci(@WebParam(name = "loginAttr") WSDMLoginAttr login,
      @WebParam(name = "protocolloDocumentoIn") WSDMProtocolloDocumentoIn wsdmprotocolloDocumentoIn) throws RemoteException;

  @WSDLDocumentation("Verifica della firma")
  WSDMProtocolloDocumentoRes WSDMFirmaVerifica(@WebParam(name = "login") WSDMLoginAttr login,
      @WebParam(name = "numeroDocumento") String numeroDocumento) throws RemoteException;

  @WSDLDocumentation("Lettura del documento")
  WSDMProtocolloDocumentoRes WSDMDocumentoLeggi(@WebParam(name = "login") WSDMLoginAttr login,
      @WebParam(name = "numeroDocumento") String numeroDocumento) throws RemoteException;

  @WSDLDocumentation("Collegamento elementi documentali")
  WSDMDocumentoCollegaRes WSDMDocumentoCollega(@WebParam(name = "login") WSDMLoginAttr login,
      @WebParam(name = "numeroDocumentoPadre") String numeroDocumentoPadre,
      @WebParam(name = "numeroDocumentoFiglio") String numeroDocumentoFiglio, @WebParam(name = "tipoCollegamento") String tipoCollegamento)
      throws RemoteException;

  @WSDLDocumentation("Aggiunta di ulteriori allegati ad elemento documentale protocollato o non protocollato")
  WSDMAggiungiAllegatiRes WSDMAggiungiAllegati(@WebParam(name = "login") WSDMLoginAttr login,
      @WebParam(name = "aggiungiAllegatiIn") WSDMAggiungiAllegatiIn wsdmaggiungiAllegatiIn) throws RemoteException;

  @WSDLDocumentation("Inserimento di un nuovo fascicolo")
  WSDMFascicoloRes WSDMFascicoloInserisci(@WebParam(name = "loginAttr") WSDMLoginAttr login,
      @WebParam(name = "fascicoloIn") WSDMFascicoloIn wsdmfascicoloIn) throws RemoteException;

  @WSDLDocumentation("Aggiunta di un documento, protocollato o non protocollato, ad un fascicolo")
  WSDMFascicoloRes WSDMFascicoloAggiungiDocumento(@WebParam(name = "loginAttr") WSDMLoginAttr login,
      @WebParam(name = "codiceFascicolo") String codiceFascicolo, @WebParam(name = "numeroDocumento") String numeroDocumento)
      throws RemoteException;

  @WSDLDocumentation("Lettura del fascicolo e dei documenti inseriti nel fascicolo")
  WSDMFascicoloRes WSDMFascicoloLeggi(@WebParam(name = "loginAttr") WSDMLoginAttr login,
      @WebParam(name = "codiceFascicolo") String codiceFascicolo, @WebParam(name = "annoFascicolo") Long annoFascicolo,
      @WebParam(name = "numeroFascicolo") String numeroFascicolo, @WebParam(name = "classificaFascicolo") String classificaFascicolo,
      @WebParam(name = "oggettoFascicolo") String oggettoFascicolo) throws RemoteException;

  @WSDLDocumentation("Lettura metadati del fascicolo")
  WSDMFascicoloRes WSDMFascicoloMetadatiLeggi(@WebParam(name = "loginAttr") WSDMLoginAttr login,
      @WebParam(name = "codiceFascicolo") String codiceFascicolo, @WebParam(name = "annoFascicolo") Long annoFascicolo,
      @WebParam(name = "numeroFascicolo") String numeroFascicolo, @WebParam(name = "classificaFascicolo") String classificaFascicolo,
      @WebParam(name = "oggettoFascicolo") String oggettoFascicolo) throws RemoteException;

  @WSDLDocumentation("Modifica dei dati personalizzati del fascicolo")
  WSDMFascicoloModificaRes WSDMFascicoloModifica(@WebParam(name = "loginAttr") WSDMLoginAttr login,
      @WebParam(name = "fascicoloModificaIn") WSDMFascicoloModificaIn wsdmfascicoloModificaIn) throws RemoteException;

  @WSDLDocumentation("Invio di una mail")
  WSDMInviaMailRes WSDMInviaMail(@WebParam(name = "loginAttr") WSDMLoginAttr login,
      @WebParam(name = "inviaMail") WSDMInviaMail wsdmInviaMail) throws RemoteException;

  @WSDLDocumentation("Verifica l'invio di una mail")
  WSDMVerificaMailRes WSDMVerificaMail(@WebParam(name = "loginAttr") WSDMLoginAttr login,
      @WebParam(name = "numeroDocumento") String numeroDocumento, @WebParam(name = "annoProtocollo") Long annoProtocollo,
      @WebParam(name = "numeroProtocollo") String numeroProtocollo) throws RemoteException;

  @WSDLDocumentation("Lettura dell'atto o del contratto e della lista dei documenti associati")
  WSDMProtocolloDocumentoRes WSDMAttoContrattoLeggi(@WebParam(name = "loginAttr") WSDMLoginAttr login, @WebParam(name = "tipo") String tipo,
      @WebParam(name = "organo") String organo, @WebParam(name = "anno") Long anno, @WebParam(name = "numero") String numero)
      throws RemoteException;

  @WSDLDocumentation("Ricerca degli atti e dei contratti")
  WSDMAttoContrattoRes WSDMAttoContrattoRicerca(@WebParam(name = "loginAttr") WSDMLoginAttr login, @WebParam(name = "tipo") String tipo,
      @WebParam(name = "organo") String organo, @WebParam(name = "anno") Long anno, @WebParam(name = "numeroDa") String numeroDa,
      @WebParam(name = "numeroA") String numeroA, @WebParam(name = "dataDa") Date dataDa, @WebParam(name = "dataA") Date dataA)
      throws RemoteException;

  @WSDLDocumentation("Lettura dei metadati del documento")
  WSDMProtocolloDocumentoRes WSDMDocumentoMetadatiLeggi(@WebParam(name = "login") WSDMLoginAttr login,
      @WebParam(name = "numeroDocumento") String numeroDocumento) throws RemoteException;

  @WSDLDocumentation("Lettura di una anagrafica")
  WSDMAnagraficaLeggiRes WSDMAnagraficaLeggi(@WebParam(name = "loginAttr") WSDMLoginAttr login,
      @WebParam(name = "codiceAnagrafica") String codiceAnagrafica) throws RemoteException;

  @WSDLDocumentation("Lista degli operatori")
  WSDMListaOperatoriRes WSDMListaOperatori(@WebParam(name = "loginAttr") WSDMLoginAttr login, @WebParam(name = "cognome") String cognome,
      @WebParam(name = "codiceFiscale") String codiceFiscale) throws RemoteException;

  @WSDLDocumentation("Lista dei tipi di trasmissione")
  WSDMListaTipiTrasmissioneRes WSDMListaTipiTrasmissione(@WebParam(name = "loginAttr") WSDMLoginAttr login) throws RemoteException;

  @WSDLDocumentation("Effettua trasmissione di uno o piu' documenti")
  WSDMTrasmissioneRes WSDMTrasmissione(@WebParam(name = "loginAttr") WSDMLoginAttr login,
      @WebParam(name = "trasmissioneIn") WSDMTrasmissioneIn trasmissioneIn) throws RemoteException;

  @WSDLDocumentation("Lista degli account email")
  WSDMListaAccountEmailRes WSDMListaAccountEmail(@WebParam(name = "loginAttr") WSDMLoginAttr login,
      @WebParam(name = "ricercaAccountEmail") WSDMRicercaAccountEmail ricercaAccountEmail) throws RemoteException;

  @WSDLDocumentation("Lista dei fascicoli")
  WSDMRicercaFascicoloRes WSDMRicercaFascicolo(@WebParam(name = "loginAttr") WSDMLoginAttr login,
      @WebParam(name = "fascicoloRicerca") WSDMRicercaFascicolo ricercaFascicolo) throws RemoteException;

  @WSDLDocumentation("Lettura esito del protocollo asincrono")
  WSDMProtocolloDocumentoRes WSDMProtocolloAsincronoEsito(@WebParam(name = "loginAttr") WSDMLoginAttr login,
      @WebParam(name = "id") String id) throws RemoteException;

  @WSDLDocumentation("Invia informazioni aggiuntive al documento inserito nel documentale")
  WSDMDocumentoAggiungiInformazioniRes WSDMDocumentoAggiungiInformazioni(@WebParam(name = "loginAttr") WSDMLoginAttr login,
      @WebParam(name = "documentoAggiungiInformazioni") WSDMDocumentoAggiungiInformazioni documentoAggiungiInformazioni)
      throws RemoteException;

  @WSDLDocumentation("Effettua la chiusura di un fascicolo esistente")
  WSDMFascicoloChiudiRes WSDMFascicoloChiudi(@WebParam(name = "loginAttr") WSDMLoginAttr login,
      @WebParam(name = "fascicoloChiudiIn") WSDMFascicoloChiudiIn fascicoloChiudiIn) throws RemoteException;

}
