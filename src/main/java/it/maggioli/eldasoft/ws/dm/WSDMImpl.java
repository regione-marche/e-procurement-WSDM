package it.maggioli.eldasoft.ws.dm;

import it.maggioli.eldasoft.bl.IWSDMManager;

import java.rmi.RemoteException;
import java.util.Date;

import javax.annotation.Resource;
import javax.crypto.Cipher;
import javax.crypto.spec.SecretKeySpec;
import javax.jws.WebService;
import javax.xml.ws.WebServiceContext;
import javax.xml.ws.handler.MessageContext;

import org.apache.cxf.common.security.SecurityToken;
import org.apache.cxf.common.security.TokenType;
import org.apache.cxf.common.security.UsernameToken;
import org.apache.cxf.jaxws.context.WrappedMessageContext;
import org.apache.cxf.message.Message;
import org.apache.log4j.Logger;
import org.apache.xml.security.utils.Base64;

@WebService(endpointInterface = "it.maggioli.eldasoft.ws.dm.WSDM", serviceName = "WSDM", targetNamespace = "http://dm.ws.eldasoft.maggioli.it/")
public class WSDMImpl implements WSDM {

  static Logger             logger = Logger.getLogger(WSDMImpl.class);
  static private byte[]     key    = "T/Yer@#2983273&d".getBytes();

  @Resource
  private WebServiceContext context;

  private IWSDMManager      wsdmManager;

  public IWSDMManager getWsdmManager() {
    return wsdmManager;
  }

  public void setWsdmManager(IWSDMManager wsdmManager) {
    this.wsdmManager = wsdmManager;
  }

  /**
   * Ricava usernameToken dal messaggio. Utilizzato per inoltrare le credenziali
   * ai servizi remoti.
   * 
   * @return
   */
  private UsernameToken getUsernameToken() {
    UsernameToken usernameToken = null;
    MessageContext messageContext = context.getMessageContext();
    if (messageContext == null || !(messageContext instanceof WrappedMessageContext)) {
      return null;
    }
    Message message = ((WrappedMessageContext) messageContext).getWrappedMessage();
    SecurityToken token = message.get(SecurityToken.class);
    if (token != null && token.getTokenType() == TokenType.UsernameToken) {
      usernameToken = (UsernameToken) token;
    }
    return usernameToken;
  }

  /**
   * De-codifica di una stringa Base64 in base alla chiave key.
   * 
   * @param encoded
   *        (Base64)
   * @return
   * @throws RemoteException
   */
  private String decodePassword(String encoded) throws RemoteException {

    String decoded = null;

    try {
      if (encoded != null && !encoded.trim().equals("")) {
        SecretKeySpec k = new SecretKeySpec(key, "AES");
        Cipher c = Cipher.getInstance("AES");
        c.init(Cipher.DECRYPT_MODE, k);
        Base64.decode(encoded);
        byte[] decryptedData = c.doFinal(Base64.decode(encoded));
        decoded = new String(decryptedData);
      }
    } catch (Throwable t) {
      throw new RemoteException("Errore decodifica password", t);
    }

    return decoded;
  }

  /**
   * Ricava la lista dei profili per l'utente connesso e l'eventuale utente
   * applicativo.
   * 
   */
  public WSDMListaProfiliRes WSDMListaProfili(String utenteApplicativo) throws RemoteException {
    WSDMListaProfiliRes wsdmListaProfiliRes = new WSDMListaProfiliRes();
    UsernameToken ut = this.getUsernameToken();
    String username = ut.getName();
    String password = this.decodePassword(ut.getPassword());
    wsdmListaProfiliRes = wsdmManager._listaProfili(username, password, utenteApplicativo);
    return wsdmListaProfiliRes;
  }

  /**
   * Ricava la lista delle amministrazioni e AOO.
   */
  public WSDMListaAmministrazioniAooRes WSDMListaAmministrazioniAoo() throws RemoteException {
    WSDMListaAmministrazioniAooRes wsdmListaAmministrazioniAooRes = new WSDMListaAmministrazioniAooRes();
    UsernameToken ut = this.getUsernameToken();
    String username = ut.getName();
    String password = this.decodePassword(ut.getPassword());
    wsdmListaAmministrazioniAooRes = wsdmManager._listaAmministrazioniAoo(username, password);
    return wsdmListaAmministrazioniAooRes;
  }

  /**
   * Ricava la lista degli uffici.
   */
  public WSDMListaUfficiRes WSDMListaUffici(WSDMLoginAttr loginAttr, String codiceAoo, String descrizioneUfficio, String utente)
      throws RemoteException {
    WSDMListaUfficiRes wsdmListaUfficiRes = new WSDMListaUfficiRes();
    UsernameToken ut = this.getUsernameToken();
    String username = ut.getName();
    String password = this.decodePassword(ut.getPassword());
    wsdmListaUfficiRes = wsdmManager._listaUffici(username, password, loginAttr, codiceAoo, descrizioneUfficio, utente);
    return wsdmListaUfficiRes;
  }

  /**
   * Ricava la lista delle classifiche.
   */
  public WSDMListaClassificheRes WSDMListaClassifiche(WSDMLoginAttr loginAttr, String codice, String descrizione, String voce)
      throws RemoteException {
    WSDMListaClassificheRes wsdmListaClassificheRes = new WSDMListaClassificheRes();
    UsernameToken ut = this.getUsernameToken();
    String username = ut.getName();
    String password = this.decodePassword(ut.getPassword());
    wsdmListaClassificheRes = wsdmManager._listaClassifiche(username, password, loginAttr, codice, descrizione, voce);
    return wsdmListaClassificheRes;
  }

  /**
   * Richiesta di inserimento nel sistema documentale e protocollazione.
   * 
   */
  public WSDMProtocolloDocumentoRes WSDMProtocolloInserisci(WSDMLoginAttr loginAttr, WSDMProtocolloDocumentoIn wsdmprotocolloDocumentoIn)
      throws RemoteException {
    WSDMProtocolloDocumentoRes wsdmprotocolloDocumentoRes = new WSDMProtocolloDocumentoRes();
    UsernameToken ut = this.getUsernameToken();
    String username = ut.getName();
    String password = this.decodePassword(ut.getPassword());

    // Popolamento elemento "primoMittenteComuneResidenza"
    String primoMittenteComuneResidenza = wsdmprotocolloDocumentoIn.getPrimoMittenteComuneResidenza();
    if (primoMittenteComuneResidenza == null || (primoMittenteComuneResidenza != null && "".equals(primoMittenteComuneResidenza.trim()))) {
      if (wsdmprotocolloDocumentoIn.getMittenti() != null && wsdmprotocolloDocumentoIn.getMittenti().length > 0) {
        WSDMProtocolloAnagrafica[] mittenti = wsdmprotocolloDocumentoIn.getMittenti();
        wsdmprotocolloDocumentoIn.setPrimoMittenteComuneResidenza(mittenti[0].getComuneResidenza());
      }
    }

    wsdmprotocolloDocumentoRes = wsdmManager._protocolloInserisci(username, password, loginAttr, wsdmprotocolloDocumentoIn);
    return wsdmprotocolloDocumentoRes;
  }

  /**
   * Richiesta di modifica dei termini di riservatezza di uno o piu' elementi
   * documentali protocollati
   * 
   */
  public WSDMProtocolloModificaRes WSDMProtocolloModifica(WSDMLoginAttr loginAttr, WSDMProtocolloModificaIn wsdmprotocolloModificaIn)
      throws RemoteException {
    WSDMProtocolloModificaRes wsdmprotocolloModificaRes = new WSDMProtocolloModificaRes();
    UsernameToken ut = this.getUsernameToken();
    String username = ut.getName();
    String password = this.decodePassword(ut.getPassword());
    wsdmprotocolloModificaRes = wsdmManager._protocolloModifica(username, password, loginAttr, wsdmprotocolloModificaIn);
    return wsdmprotocolloModificaRes;
  }

  /**
   * Lettura del protocollo.
   * 
   * @throws RemoteException
   * 
   */
  public WSDMProtocolloDocumentoRes WSDMProtocolloLeggi(WSDMLoginAttr loginAttr, Long annoProtocollo, String numeroProtocollo)
      throws RemoteException {
    WSDMProtocolloDocumentoRes wsdmprotocolloDocumentoRes = new WSDMProtocolloDocumentoRes();
    UsernameToken ut = this.getUsernameToken();
    String username = ut.getName();
    String password = this.decodePassword(ut.getPassword());
    wsdmprotocolloDocumentoRes = wsdmManager._protocolloLeggi(username, password, loginAttr, annoProtocollo, numeroProtocollo);
    return wsdmprotocolloDocumentoRes;
  }

  /**
   * Richiesta di inserimento nel sistema documentale (senza protocollazione).
   * 
   */
  public WSDMProtocolloDocumentoRes WSDMDocumentoInserisci(WSDMLoginAttr loginAttr, WSDMProtocolloDocumentoIn wsdmprotocolloDocumentoIn)
      throws RemoteException {
    WSDMProtocolloDocumentoRes wsdmprotocolloDocumentoRes = new WSDMProtocolloDocumentoRes();
    UsernameToken ut = this.getUsernameToken();
    String username = ut.getName();
    String password = this.decodePassword(ut.getPassword());

    // Popolamento elemento "primoMittenteComuneResidenza"
    String primoMittenteComuneResidenza = wsdmprotocolloDocumentoIn.getPrimoMittenteComuneResidenza();
    if (primoMittenteComuneResidenza == null || (primoMittenteComuneResidenza != null && "".equals(primoMittenteComuneResidenza.trim()))) {
      if (wsdmprotocolloDocumentoIn.getMittenti() != null && wsdmprotocolloDocumentoIn.getMittenti().length > 0) {
        WSDMProtocolloAnagrafica[] mittenti = wsdmprotocolloDocumentoIn.getMittenti();
        wsdmprotocolloDocumentoIn.setPrimoMittenteComuneResidenza(mittenti[0].getComuneResidenza());
      }
    }

    wsdmprotocolloDocumentoRes = wsdmManager._documentoInserisci(username, password, loginAttr, wsdmprotocolloDocumentoIn);
    return wsdmprotocolloDocumentoRes;
  }

  /**
   * Lettura del documento.
   * 
   */
  public WSDMProtocolloDocumentoRes WSDMDocumentoLeggi(WSDMLoginAttr loginAttr, String numeroDocumento) throws RemoteException {
    WSDMProtocolloDocumentoRes wsdmprotocolloDocumentoRes = new WSDMProtocolloDocumentoRes();
    UsernameToken ut = this.getUsernameToken();
    String username = ut.getName();
    String password = this.decodePassword(ut.getPassword());
    wsdmprotocolloDocumentoRes = wsdmManager._documentoLeggi(username, password, loginAttr, numeroDocumento);
    return wsdmprotocolloDocumentoRes;
  }

  /**
   * Collegamento elementi documentali.
   */
  public WSDMDocumentoCollegaRes WSDMDocumentoCollega(WSDMLoginAttr loginAttr, String numeroDocumentoPadre, String numeroDocumentoFiglio,
      String tipoCollegamento) throws RemoteException {
    WSDMDocumentoCollegaRes wsdmDocumentoCollegaRes = new WSDMDocumentoCollegaRes();
    UsernameToken ut = this.getUsernameToken();
    String username = ut.getName();
    String password = this.decodePassword(ut.getPassword());
    wsdmDocumentoCollegaRes = wsdmManager._documentoCollega(username, password, loginAttr, numeroDocumentoPadre, numeroDocumentoFiglio,
        tipoCollegamento);
    return wsdmDocumentoCollegaRes;
  }

  /**
   * Inserimento di un nuovo fascicolo.
   * 
   */
  public WSDMFascicoloRes WSDMFascicoloInserisci(WSDMLoginAttr loginAttr, WSDMFascicoloIn wsdmfascicoloIn) throws RemoteException {
    WSDMFascicoloRes wsdmfascicoloRes = new WSDMFascicoloRes();
    UsernameToken ut = this.getUsernameToken();
    String username = ut.getName();
    String password = this.decodePassword(ut.getPassword());
    wsdmfascicoloRes = wsdmManager._fascicoloInserisci(username, password, loginAttr, wsdmfascicoloIn);
    return wsdmfascicoloRes;
  }

  /**
   * Aggiunta di un documento, protocollato o non protocollato, ad un fascicolo.
   * 
   */
  public WSDMFascicoloRes WSDMFascicoloAggiungiDocumento(WSDMLoginAttr loginAttr, String codiceFascicolo, String numeroDocumento)
      throws RemoteException {
    WSDMFascicoloRes wsdmfascicoloRes = new WSDMFascicoloRes();
    UsernameToken ut = this.getUsernameToken();
    String username = ut.getName();
    String password = this.decodePassword(ut.getPassword());
    wsdmfascicoloRes = wsdmManager._fascicoloAggiungiDocumento(username, password, loginAttr, codiceFascicolo, numeroDocumento);
    return wsdmfascicoloRes;
  }

  /**
   * Lettura del fascicolo e dei documenti inseriti nel fascicolo.
   * 
   */
  public WSDMFascicoloRes WSDMFascicoloLeggi(WSDMLoginAttr loginAttr, String codiceFascicolo, Long annoFascicolo, String numeroFascicolo,
      String classificaFascicolo) throws RemoteException {
    WSDMFascicoloRes wsdmfascicoloRes = new WSDMFascicoloRes();
    UsernameToken ut = this.getUsernameToken();
    String username = ut.getName();
    String password = this.decodePassword(ut.getPassword());
    wsdmfascicoloRes = wsdmManager._fascicoloLeggi(username, password, loginAttr, codiceFascicolo, annoFascicolo, numeroFascicolo,
        classificaFascicolo);
    return wsdmfascicoloRes;
  }

  /**
   * Lettura del fascicolo e dei documenti inseriti nel fascicolo.
   * 
   */
  public WSDMFascicoloRes WSDMFascicoloMetadatiLeggi(WSDMLoginAttr loginAttr, String codiceFascicolo, Long annoFascicolo,
      String numeroFascicolo, String classificaFascicolo) throws RemoteException {
    WSDMFascicoloRes wsdmfascicoloRes = new WSDMFascicoloRes();
    UsernameToken ut = this.getUsernameToken();
    String username = ut.getName();
    String password = this.decodePassword(ut.getPassword());
    wsdmfascicoloRes = wsdmManager._fascicoloMetadatiLeggi(username, password, loginAttr, codiceFascicolo, annoFascicolo, numeroFascicolo,
        classificaFascicolo);
    return wsdmfascicoloRes;
  }

  /**
   * Richiesta di modifica dei dati personalizzati del fascicolo
   * 
   */
  public WSDMFascicoloModificaRes WSDMFascicoloModifica(WSDMLoginAttr loginAttr, WSDMFascicoloModificaIn wsdmfascicoloModificaIn)
      throws RemoteException {
    WSDMFascicoloModificaRes wsdmfascicoloModificaRes = new WSDMFascicoloModificaRes();
    UsernameToken ut = this.getUsernameToken();
    String username = ut.getName();
    String password = this.decodePassword(ut.getPassword());
    wsdmfascicoloModificaRes = wsdmManager._fascicoloModifica(username, password, loginAttr, wsdmfascicoloModificaIn);
    return wsdmfascicoloModificaRes;
  }

  /**
   * Lettura dell'atto o del contratto e degli allegati associati.
   * 
   */
  public WSDMProtocolloDocumentoRes WSDMAttoContrattoLeggi(WSDMLoginAttr loginAttr, String tipo, String organo, Long anno, String numero)
      throws RemoteException {
    WSDMProtocolloDocumentoRes wsdmprotocolloDocumentoRes = new WSDMProtocolloDocumentoRes();
    UsernameToken ut = this.getUsernameToken();
    String username = ut.getName();
    String password = this.decodePassword(ut.getPassword());
    wsdmprotocolloDocumentoRes = wsdmManager._attoContrattoLeggi(username, password, loginAttr, tipo, organo, anno, numero);
    return wsdmprotocolloDocumentoRes;
  }

  /**
   * Invia mail.
   * 
   */
  public WSDMInviaMailRes WSDMInviaMail(WSDMLoginAttr loginAttr, WSDMInviaMail wsdmInviaMail) throws RemoteException {
    WSDMInviaMailRes wsdmInviaMailRes = new WSDMInviaMailRes();
    UsernameToken ut = this.getUsernameToken();
    String username = ut.getName();
    String password = this.decodePassword(ut.getPassword());
    wsdmInviaMailRes = wsdmManager._inviaMail(username, password, loginAttr, wsdmInviaMail);
    return wsdmInviaMailRes;
  }

  /**
   * Verifica mail inviata.
   */
  public WSDMVerificaMailRes WSDMVerificaMail(WSDMLoginAttr loginAttr, String numeroDocumento, Long annoProtocollo, String numeroProtocollo)
      throws RemoteException {
    WSDMVerificaMailRes wsdmVerificaMailRes = new WSDMVerificaMailRes();
    UsernameToken ut = this.getUsernameToken();
    String username = ut.getName();
    String password = this.decodePassword(ut.getPassword());
    wsdmVerificaMailRes = wsdmManager._verificaMail(username, password, loginAttr, numeroDocumento, annoProtocollo, numeroProtocollo);
    return wsdmVerificaMailRes;
  }

  /**
   * Ricerca degli atti e dei contratti
   * 
   */

  public WSDMAttoContrattoRes WSDMAttoContrattoRicerca(WSDMLoginAttr loginAttr, String tipo, String organo, Long anno, String numeroDa,
      String numeroA, Date dataDa, Date dataA) throws RemoteException {
    WSDMAttoContrattoRes wsdmAttoContrattoRes = new WSDMAttoContrattoRes();
    UsernameToken ut = this.getUsernameToken();
    String username = ut.getName();
    String password = this.decodePassword(ut.getPassword());
    wsdmAttoContrattoRes = wsdmManager._attoContrattoRicerca(username, password, loginAttr, tipo, organo, anno, numeroDa, numeroA, dataDa,
        dataA);
    return wsdmAttoContrattoRes;
  }

  /**
   * Lettura dei metadati del documento (non legge gli allegati).
   * 
   */
  public WSDMProtocolloDocumentoRes WSDMDocumentoMetadatiLeggi(WSDMLoginAttr loginAttr, String numeroDocumento) throws RemoteException {
    WSDMProtocolloDocumentoRes wsdmprotocolloDocumentoRes = new WSDMProtocolloDocumentoRes();
    UsernameToken ut = this.getUsernameToken();
    String username = ut.getName();
    String password = this.decodePassword(ut.getPassword());
    wsdmprotocolloDocumentoRes = wsdmManager._documentoMetadatiLeggi(username, password, loginAttr, numeroDocumento);
    return wsdmprotocolloDocumentoRes;
  }

  /**
   * Lettura dei dati anagrafici,
   */
  public WSDMAnagraficaLeggiRes WSDMAnagraficaLeggi(WSDMLoginAttr loginAttr, String codiceAnagrafica) throws RemoteException {
    WSDMAnagraficaLeggiRes wsdmAnagraficaLeggiRes = new WSDMAnagraficaLeggiRes();
    UsernameToken ut = this.getUsernameToken();
    String username = ut.getName();
    String password = this.decodePassword(ut.getPassword());
    wsdmAnagraficaLeggiRes = wsdmManager._anagraficaLeggi(username, password, loginAttr, codiceAnagrafica);
    return wsdmAnagraficaLeggiRes;
  }

  /**
   * Ricava la lista degli operatori
   */
  public WSDMListaOperatoriRes WSDMListaOperatori(WSDMLoginAttr loginAttr, String cognome, String codiceFiscale) throws RemoteException {
    WSDMListaOperatoriRes wsdmListaOperatoriRes = new WSDMListaOperatoriRes();
    UsernameToken ut = this.getUsernameToken();
    String username = ut.getName();
    String password = this.decodePassword(ut.getPassword());
    wsdmListaOperatoriRes = wsdmManager._listaOperatori(username, password, loginAttr, cognome, codiceFiscale);
    return wsdmListaOperatoriRes;
  }

  /**
   * Ricava la lista dei tipi trasmissione.
   */
  public WSDMListaTipiTrasmissioneRes WSDMListaTipiTrasmissione(WSDMLoginAttr loginAttr) throws RemoteException {
    WSDMListaTipiTrasmissioneRes wsdmListaTipiTrasmissioneRes = new WSDMListaTipiTrasmissioneRes();
    UsernameToken ut = this.getUsernameToken();
    String username = ut.getName();
    String password = this.decodePassword(ut.getPassword());
    wsdmListaTipiTrasmissioneRes = wsdmManager._listaTipiTrasmissione(username, password, loginAttr);
    return wsdmListaTipiTrasmissioneRes;
  }

  public WSDMTrasmissioneRes WSDMTrasmissione(WSDMLoginAttr loginAttr, WSDMTrasmissioneIn trasmissioneIn) throws RemoteException {
    WSDMTrasmissioneRes wsdmTrasmissioneRes = new WSDMTrasmissioneRes();
    UsernameToken ut = this.getUsernameToken();
    String username = ut.getName();
    String password = this.decodePassword(ut.getPassword());
    wsdmTrasmissioneRes = wsdmManager._trasmissione(username, password, loginAttr, trasmissioneIn);
    return wsdmTrasmissioneRes;
  }

  public WSDMAggiungiAllegatiRes WSDMAggiungiAllegati(WSDMLoginAttr loginAttr, WSDMAggiungiAllegatiIn aggiungiAllegatiIn)
      throws RemoteException {
    WSDMAggiungiAllegatiRes wsdmAggiungiAllegatiRes = new WSDMAggiungiAllegatiRes();
    UsernameToken ut = this.getUsernameToken();
    String username = ut.getName();
    String password = this.decodePassword(ut.getPassword());
    wsdmAggiungiAllegatiRes = wsdmManager._aggiungiAllegati(username, password, loginAttr, aggiungiAllegatiIn);
    return wsdmAggiungiAllegatiRes;
  }

  public WSDMListaAccountEmailRes WSDMListaAccountEmail(WSDMLoginAttr loginAttr, WSDMRicercaAccountEmail ricercaAccountEmail)
      throws RemoteException {
    WSDMListaAccountEmailRes wsdmListaAccountEmailRes = new WSDMListaAccountEmailRes();
    UsernameToken ut = this.getUsernameToken();
    String username = ut.getName();
    String password = this.decodePassword(ut.getPassword());
    wsdmListaAccountEmailRes = wsdmManager._listaAccountEmail(username, password, loginAttr, ricercaAccountEmail);
    return wsdmListaAccountEmailRes;
  }

}
