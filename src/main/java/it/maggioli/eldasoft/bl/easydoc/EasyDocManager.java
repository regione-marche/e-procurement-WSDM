/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package it.maggioli.eldasoft.bl.easydoc;

import it.easydoc.MailManagerService.BodyContentItem;
import it.easydoc.MailManagerService.MailManagerService;
import it.easydoc.MailManagerService.MailManagerService_Service;
import it.easydoc.MailManagerService.MessageType;
import it.easydoc.MailManagerService.SendMailRequestType;
import it.easydoc.MailManagerService.SendMailRequestType.CarbonCopyReceipts;
import it.easydoc.MailManagerService.SendMailRequestType.Receipts;
import it.easydoc.MailManagerService.SendMailResponseType;
import it.easydoc.ProtocolAdminService.ProtocolAdminService;
import it.easydoc.ProtocolAdminService.ProtocolAdminService_Service;
import it.easydoc.ProtocolAdminService.UserCompanyCreationRequestType;
import it.easydoc.ProtocolAdminService.UserCompanyCreationResponseType;
import it.easydoc.ProtocolAdminService.UserCompanyInfoType;
import it.easydoc.ProtocolManagerService.Attached;
import it.easydoc.ProtocolManagerService.ChannelItem;
import it.easydoc.ProtocolManagerService.ClassificationItem;
import it.easydoc.ProtocolManagerService.DocumentID;
import it.easydoc.ProtocolManagerService.ExternalSenderRecipientItem;
import it.easydoc.ProtocolManagerService.InternalSenderRecipientItem;
import it.easydoc.ProtocolManagerService.LoginRequestType;
import it.easydoc.ProtocolManagerService.LoginResponseType;
import it.easydoc.ProtocolManagerService.ProtocolManagerService;
import it.easydoc.ProtocolManagerService.ProtocolManagerServiceImpl;
import it.easydoc.ProtocolManagerService.RecordDocumentRequestType;
import it.easydoc.ProtocolManagerService.RecordDocumentResponseType;
import it.easydoc.rest.protocol.FolderType;
import it.easydoc.rest.protocol.GetFoldersRequestType;
import it.easydoc.rest.protocol.GetFoldersResponseType;
import it.easydoc.rest.protocol.GetUsersCompanyRequestType;
import it.easydoc.rest.protocol.GetUsersCompanyResponseType;
import it.easydoc.rest.protocol.UserCompanyType;
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
import java.io.DataOutputStream;

import java.io.IOException;
import java.io.OutputStream;
import java.io.StringReader;
import java.io.StringWriter;
import java.net.HttpURLConnection;
import java.net.MalformedURLException;
import java.net.URL;
import java.security.MessageDigest;
import java.security.NoSuchAlgorithmException;
import java.util.Arrays;
import java.util.Calendar;
import java.util.Date;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.logging.Level;
import java.util.logging.Logger;

import javax.activation.DataHandler;
import javax.activation.MimetypesFileTypeMap;
import javax.mail.util.ByteArrayDataSource;
import javax.naming.InitialContext;
import javax.naming.NamingException;
import javax.ws.rs.client.ClientBuilder;
import javax.ws.rs.client.Entity;
import javax.ws.rs.core.MediaType;
import javax.ws.rs.core.Response;
import javax.xml.bind.JAXB;
import javax.xml.ws.WebServiceException;
import org.apache.axis.encoding.Base64;
import org.apache.commons.io.IOUtils;

import org.apache.cxf.endpoint.Client;
import org.apache.cxf.frontend.ClientProxy;
import org.apache.cxf.message.Message;
import org.glassfish.jersey.client.authentication.HttpAuthenticationFeature;

/**
 * 
 * @author Enrico
 */
public class EasyDocManager implements IWSDMManager {

  static private String          EASYDOC_PARAMETRI_AOO                 = "java:comp/env/EASYDOC_PARAMETRI_AOO";
  // static private String EASYDOC_PARAMETRI_CHANNELCODE =
  // "java:comp/env/EASYDOC_PARAMETRI_CHANNELCODE";
  // static private String EASYDOC_PARAMETRI_CLASSIFICATIONCODE =
  // "java:comp/env/EASYDOC_PARAMETRI_CLASSIFICATIONCODE";
  static private String          EASYDOC_PARAMETRI_COMPANYCODE         = "java:comp/env/EASYDOC_PARAMETRI_COMPANYCODE";
  // static private String EASYDOC_PARAMETRI_MAIL_CHANNELCODE =
  // "java:comp/env/EASYDOC_PARAMETRI_MAIL_CHANNELCODE";
  // static private String EASYDOC_PARAMETRI_MAIL_MAILCONFIGURATIONCODE =
  // "java:comp/env/EASYDOC_PARAMETRI_MAIL_MAILCONFIGURATIONCODE";
  static private String          EASYDOC_PARAMETRI_ADDITIONALASSIGNEES = "java:comp/env/EASYDOC_PARAMETRI_ADDITIONALASSIGNEES";
  static private String          EASYDOC_PARAMETRI_DOMAINCODE          = "java:comp/env/EASYDOC_PARAMETRI_DOMAINCODE";

  static private String          EASYDOC_EXTERNALSENDER_TYPE           = "java:comp/env/EASYDOC_EXTERNALSENDER_TYPE";
  static private String          EASYDOC_INTERNALSENDER_TYPE           = "java:comp/env/EASYDOC_INTERNALSENDER_TYPE";

  static private String          EASYDOC_MAILCFGCODE_PROVVISORIO       = "java:comp/env/EASYDOC_MAILCFGCODE_PROVVISORIO";

  static private String          EASYDOC_SOAP_WS                       = "java:comp/env/EASYDOC_SOAP_WS";
  static private String          EASYDOC_SOAP_ADMIN_WS                 = "java:comp/env/EASYDOC_SOAP_ADMIN_WS";
  static private String          EASYDOC_SOAP_MAIL_WS                  = "java:comp/env/EASYDOC_SOAP_MAIL_WS";
  static private String          EASYDOC_REST_WS                       = "java:comp/env/EASYDOC_REST_WS";
  static private String          EASYDOC_REST_USERNAME                 = "java:comp/env/EASYDOC_REST_USERNAME";
  static private String          EASYDOC_REST_PASSWORD                 = "java:comp/env/EASYDOC_REST_PASSWORD";
  static private String          EASYDOC_TOKEN_HEADER                  = "TOKEN_SESSION_ID";
  static private String          EASYDOC_DOCUMENT_ID_UID               = "UID";
  static private String          EASYDOC_DOCUMENT_ID_PROTOCOL_ID       = "PROTOCOL_ID";
  static public final String     FASCICOLO_OPERATION_NOT_SUPPORTED     = "Operazione non disponibile: la creazione di un fascicolo e l'aggiunta del documento al fascicolo e' disponibile solamente con le operazioni di inserimento protocollo o documento";

  static org.apache.log4j.Logger logger                                = org.apache.log4j.Logger.getLogger(EasyDocManager.class);
  String                         token                                 = "";

  private MailManagerService getMailManagerService(Boolean login) throws Exception {
    String wsEasyDocAddress = (String) InitialContext.doLookup(EASYDOC_SOAP_MAIL_WS);
    if (wsEasyDocAddress == null || (wsEasyDocAddress != null && "".equals(wsEasyDocAddress.trim()))) {
      throw new Exception(URL_NOT_DEFINED);
    }
    MailManagerService_Service easyDocService = new MailManagerService_Service();
    MailManagerService iEasyDocService = easyDocService.getMailManagerServiceImplPort();
    Client client = ClientProxy.getClient(iEasyDocService);
    client.getRequestContext().put(Message.ENDPOINT_ADDRESS, wsEasyDocAddress);

    Map<String, List<String>> headers = new HashMap<String, List<String>>();
    headers.put(EASYDOC_TOKEN_HEADER, Arrays.asList(token));
    if (!login) {
      client.getRequestContext().put(Message.PROTOCOL_HEADERS, headers);
    }

    return iEasyDocService;
  }

  private ProtocolManagerService getProtocolManagerService(Boolean login) throws Exception {
    String wsEasyDocAddress = (String) InitialContext.doLookup(EASYDOC_SOAP_WS);
    if (wsEasyDocAddress == null || (wsEasyDocAddress != null && "".equals(wsEasyDocAddress.trim()))) {
      throw new Exception(URL_NOT_DEFINED);
    }
    ProtocolManagerServiceImpl easyDocService = new ProtocolManagerServiceImpl();
    ProtocolManagerService iEasyDocService = easyDocService.getProtocolManagerServiceImplPort();
    Client client = ClientProxy.getClient(iEasyDocService);
    client.getRequestContext().put(Message.ENDPOINT_ADDRESS, wsEasyDocAddress);

    Map<String, List<String>> headers = new HashMap<String, List<String>>();
    headers.put(EASYDOC_TOKEN_HEADER, Arrays.asList(token));
    if (!login) {
      client.getRequestContext().put(Message.PROTOCOL_HEADERS, headers);
    }

    return iEasyDocService;
  }

  private ProtocolAdminService getProtocolAdminService(Boolean login) throws Exception {
    String wsEasyDocAddress = (String) InitialContext.doLookup(EASYDOC_SOAP_ADMIN_WS);
    if (wsEasyDocAddress == null || (wsEasyDocAddress != null && "".equals(wsEasyDocAddress.trim()))) {
      throw new Exception(URL_NOT_DEFINED);
    }
    ProtocolAdminService_Service easyDocService = new ProtocolAdminService_Service();
    ProtocolAdminService iEasyDocService = easyDocService.getProtocolAdminServiceImplPort();
    Client client = ClientProxy.getClient(iEasyDocService);
    client.getRequestContext().put(Message.ENDPOINT_ADDRESS, wsEasyDocAddress);

    Map<String, List<String>> headers = new HashMap<String, List<String>>();
    headers.put(EASYDOC_TOKEN_HEADER, Arrays.asList(token));
    if (!login) {
      client.getRequestContext().put(Message.PROTOCOL_HEADERS, headers);
    }

    return iEasyDocService;
  }

  public Boolean ControlloSessioneConnetti(String username, String password) {
    try {
      logger.info("inizio ControlloSessioneConnetti");
      Boolean connetti = false;
      if ("".equals(token)) {
        connetti = true;
      } else {
        it.easydoc.MailManagerService.GenericServiceResponse validateResponse = getMailManagerService(false).validateSession();
        // GenericServiceResponse validateResponse =
        // getProtocolManagerService(false).validateSession();
        if (!validateResponse.getMessageResponse().getType().equals(MessageType.OK)) {
          connetti = true;
        }
      }

      if (connetti) {
        LoginRequestType input = new LoginRequestType();
        input.setUsername(username);
        input.setPassword(password);
        LoginResponseType res = getProtocolManagerService(true).login(input);
        String message = res.getMessageResponse().getMessage();
        // eventuali check su messaggio
        token = res.getToken();

        int i = 0;
      }
      logger.info("fine ControlloSessioneConnetti");
      return true;
    } catch (Exception ex) {
      logger.info("eccezione in ControlloSessioneConnetti");
      // log
      String str = ex.getMessage();
      Logger.getLogger(EasyDocManager.class.getName()).log(Level.SEVERE, null, ex);
      return false;
    }
  }

  @Override
  public WSDMProtocolloDocumentoRes _protocolloInserisci(String username, String password, WSDMLoginAttr loginAttr,
      WSDMProtocolloDocumentoIn wsdmprotocolloDocumentoIn) {
    StringBuffer messaggioCtr = new StringBuffer();
    WSDMProtocolloDocumentoRes retval = new WSDMProtocolloDocumentoRes();
    if (EasyDocUtilityControllo.ctrProtocolloInserisci(loginAttr, wsdmprotocolloDocumentoIn, messaggioCtr)) {
      try {
        if (this.ControlloSessioneConnetti(username, password)) {
          RecordDocumentRequestType request = new RecordDocumentRequestType();
          request.setAooCode((String) InitialContext.doLookup(EASYDOC_PARAMETRI_AOO));
          // request.setDominioCode(token);
          WSDMProtocolloInOut inout = wsdmprotocolloDocumentoIn.getInout();
          request.setType(inout.name());
          ChannelItem channel = new ChannelItem();
          channel.setChannelCode(wsdmprotocolloDocumentoIn.getChannelCode());
          // WSDMInviaMail inviamail = wsdmprotocolloDocumentoIn.getInviaMail();
          // if (inviamail != null) {
          // channel.setCfgMailCode(inviamail.getMailConfigurationCode());
          // }
          if (inout == WSDMProtocolloInOut.OUT) {
            String cfg_mail = (String) InitialContext.doLookup(EASYDOC_MAILCFGCODE_PROVVISORIO);
            if (cfg_mail != null) {
              if (!"".equals(cfg_mail)) {
                channel.setCfgMailCode(cfg_mail);
              }
            }
          }

          request.getChannels().add(channel);

          // request.setTransmissionIdentifier();
          // request.setSenderNumberProtocol();
          // request.setSenderDataProtocol();
          // request.setDocumentDate(wsdmprotocolloDocumentoIn.getData().toString());
          request.setProtocolObject(wsdmprotocolloDocumentoIn.getOggetto());
          WSDMProtocolloAllegato[] allegati = wsdmprotocolloDocumentoIn.getAllegati();
          request.setFileName(allegati[0].getNome());
          request.setFile(new DataHandler(new ByteArrayDataSource(allegati[0].getContenuto(), "base64")));
          request.setFileHash(impronta(allegati[0].getContenuto()));
          // metadati
          // MetadataItemType metadata = new MetadataItemType();
          // metadata.setName(token);
          // request.getMetadata().add(metadata);

          // request.setAttachmentsNumber(allegati.length);//così sto
          // considerando anche il file principale([0]), va bene?
          request.setAttachmentsNumber(allegati.length - 1);// considero come
                                                            // allegati i file
                                                            // dal secondo in
                                                            // poi in
                                                            // wsdmprotocolloDocumentoIn.getAllegati()

          // request.setAttachmentsDescription(allegati.);
          // ArrayList<Attached> requestAllegati = new ArrayList<Attached>();
          for (int i = 1; i < allegati.length; i++) {
            WSDMProtocolloAllegato allegato = allegati[i];
            Attached requestAllegato = new Attached();
            String nome = allegato.getNome();
            requestAllegato.setFilename(nome);
            String mime = new MimetypesFileTypeMap().getContentType(nome);
            requestAllegato.setContentType(mime);
            requestAllegato.setFile(new DataHandler(new ByteArrayDataSource(allegato.getContenuto(), "base64")));
            requestAllegato.setFileHash(impronta(allegato.getContenuto()));
            request.getAttachments().add(requestAllegato);
          }

          if (inout == WSDMProtocolloInOut.IN || inout == WSDMProtocolloInOut.OUT) {
            WSDMProtocolloAnagrafica[] esterni = null;
            WSDMProtocolloAnagrafica[] interni = null;
            if (inout == WSDMProtocolloInOut.IN) {
              esterni = wsdmprotocolloDocumentoIn.getMittenti();
              interni = wsdmprotocolloDocumentoIn.getDestinatari();
            } else if (inout == WSDMProtocolloInOut.OUT) {
              esterni = wsdmprotocolloDocumentoIn.getDestinatari();
              interni = wsdmprotocolloDocumentoIn.getMittenti();
            }

            for (int i = 0; i < esterni.length; i++) {
              WSDMProtocolloAnagrafica esterno = esterni[i];

              String user_company_code = getUserCompanyCode(esterno.getEmail());

                if ("-1".equals(user_company_code))
                {
                  UserCompanyCreationRequestType userCompanyCreationRequest = new UserCompanyCreationRequestType();
                  UserCompanyInfoType userCompanyInfoType = new UserCompanyInfoType();
                  userCompanyInfoType.setCodiceOrganizzazione((String) InitialContext.doLookup(EASYDOC_PARAMETRI_COMPANYCODE));// obbligatorio
                  // userCompanyInfoType.setCodiceUnivocoUfficio(aoo);
                  if (esterno.getNome() == null) {
                    userCompanyInfoType.setDenominazione(esterno.getCognomeointestazione());
                  } else {
                    userCompanyInfoType.setCognome(esterno.getCognomeointestazione());// obbligatorio
                    userCompanyInfoType.setNome(esterno.getNome());// obbligatorio
                  }

                  // userCompanyInfoType.setDenominazioneUfficio(aoo);
                  userCompanyInfoType.setPartitaIva(esterno.getPartitaIVA());
                  userCompanyInfoType.setCodiceFiscale(esterno.getCodiceFiscale());
                  // userCompanyInfoType.setCellulare(esterno.ge);
                  // userCompanyInfoType.setIndirizzo(esterno.getIndirizzoResidenza());
                  // userCompanyInfoType.setCivico(esterno.ge);
                  // userCompanyInfoType.setCitta(esterno.getComuneResidenza());
                  // userCompanyInfoType.setCap(esterno);
                  // userCompanyInfoType.setProvincia(esterno.get);
                  // userCompanyInfoType.setNazione(esterno.getNazionalita());
                  // userCompanyInfoType.setPec(esterno.gete);
                  // userCompanyInfoType.setEmail(esterno.getEmail());
                  // userCompanyInfoType.setNote(esterno.ge);

                  userCompanyInfoType.setPec(esterno.getEmail());

                  userCompanyCreationRequest.setUserCompanyInfo(userCompanyInfoType);

                  UserCompanyCreationResponseType userCompanyCreationResponse = getProtocolAdminService(false).insertUserCompany(userCompanyCreationRequest);
                  if (!userCompanyCreationResponse.getMessageResponse().getMessage().equals("OK")) {
                    retval.setEsito(false);
                    String m = userCompanyCreationResponse.getMessageResponse().getMessage();
                    if (userCompanyCreationResponse.getMessageResponse().getExtendedMessage() != null) {
                      m += userCompanyCreationResponse.getMessageResponse().getExtendedMessage();
                    }
                    retval.setMessaggio(m);
                    return retval;
                  }
                  user_company_code = getUserCompanyCode(esterno.getEmail());
                }

                if ("-1".equals(user_company_code)) 
                {
                    throw new Exception("non è stato possibile inserire/recuperare il valore UserCompanyCode");
                }
                
                ExternalSenderRecipientItem item = new ExternalSenderRecipientItem();
                item.setCompanyCode((String) InitialContext.doLookup(EASYDOC_PARAMETRI_COMPANYCODE));
                item.setUserCompanyCode(user_company_code);
                item.setType((String) InitialContext.doLookup(EASYDOC_EXTERNALSENDER_TYPE));
                request.getExternalSendersRecipients().add(item);
            }

            // for (int i = 0; i < interni.length; i++) {
            // WSDMProtocolloAnagrafica interno = interni[i];
            InternalSenderRecipientItem item = new InternalSenderRecipientItem();
            item.setDomainCode((String) InitialContext.doLookup(EASYDOC_PARAMETRI_DOMAINCODE));
            // item.setUserDomainCode(token);
            item.setType((String) InitialContext.doLookup(EASYDOC_INTERNALSENDER_TYPE));
            request.getInternalSendersRecipients().add(item);
            // }
          }

          ClassificationItem classification = new ClassificationItem();
          classification.setItemCode(wsdmprotocolloDocumentoIn.getClassifica());
          classification.setPrimary(true);// hardcoded
          if (wsdmprotocolloDocumentoIn.getClassifica() != null) {
            if (!"".equals(wsdmprotocolloDocumentoIn.getClassifica())) {
              request.getClassifications().add(classification);
            }
          }
          // Folder fascicolo = new Folder();
          // fascicolo.setDominioCode(token);
          // fascicolo.setFolderCode(token);
          // request.getFolders().add(fascicolo);

          // obbligatorio
          request.setAdditionalAssigneesType((String) InitialContext.doLookup(EASYDOC_PARAMETRI_ADDITIONALASSIGNEES));

          if (this.ControlloSessioneConnetti(username, password)) {
            // chiamata a ws easydoc
            RecordDocumentResponseType response = getProtocolManagerService(false).protocol(request);

            String messaggio = response.getMessageResponse().getMessage();
            WSDMProtocolloDocumento wSDMProtocolloDocumento = new WSDMProtocolloDocumento();

            List<DocumentID> documentIDs = response.getProtocolDocuments();
            for (int i = 0; i < documentIDs.size(); i++) {
              DocumentID documentID = documentIDs.get(i);
              String id = documentID.getIdType();
              String val = documentID.getIdValue();
              if (EASYDOC_DOCUMENT_ID_UID.equals(id)) {
                wSDMProtocolloDocumento.setNumeroDocumento(val);
              }
              if (EASYDOC_DOCUMENT_ID_PROTOCOL_ID.equals(id)) {
                wSDMProtocolloDocumento.setNumeroProtocollo(val);
              }
            }

            String message = response.getMessageResponse().getMessage();
            Boolean protocollo_ok = message.equals("OK");
            if (protocollo_ok) {
              Calendar dataProtocolloToday = Calendar.getInstance();
              wSDMProtocolloDocumento.setDataProtocollo(dataProtocolloToday.getTime());
              wSDMProtocolloDocumento.setAnnoProtocollo(new Long(dataProtocolloToday.get(Calendar.YEAR)));
            }
            retval.setEsito(protocollo_ok);
            String messaggio_esito = "PROTOCOLLAZIONE: " + message;
            if (response.getMessageResponse().getExtendedMessage() != null) {
              messaggio_esito += response.getMessageResponse().getExtendedMessage();
            }
            retval.setProtocolloDocumento(wSDMProtocolloDocumento);

            WSDMInviaMail wsdmInviaMail = wsdmprotocolloDocumentoIn.getInviaMail();
            if (wsdmInviaMail != null && protocollo_ok && EasyDocUtilityControllo.ctrInviaMail(loginAttr, wsdmInviaMail, messaggioCtr)) {
              SendMailRequestType mailrequest = new SendMailRequestType();
              it.easydoc.MailManagerService.ChannelItem mailchannel = new it.easydoc.MailManagerService.ChannelItem();
              mailchannel.setChannelCode(wsdmInviaMail.getMailChannelCode());
              mailchannel.setCfgMailCode(wsdmInviaMail.getMailConfigurationCode());
              mailrequest.setChannel(mailchannel);
              mailrequest.setSubject(wsdmInviaMail.getOggettoMail());
              mailrequest.setShowLogo(Boolean.FALSE);

              // Receipts receipts = new Receipts();
              // if (wsdmInviaMail.getDestinatariMail() != null) {
              // for (int i = 0; i < wsdmInviaMail.getDestinatariMail().length;
              // i++) {
              // String dest = wsdmInviaMail.getDestinatariMail()[i];
              // receipts.getReceipt().add(dest);
              // }
              // }
              // mailrequest.setReceipts(receipts);

              CarbonCopyReceipts ccreceipts = new CarbonCopyReceipts();
              if (wsdmInviaMail.getDestinatariMailCC() != null) {
                for (int i = 0; i < wsdmInviaMail.getDestinatariMailCC().length; i++) {
                  String dest = wsdmInviaMail.getDestinatariMailCC()[i];
                  ccreceipts.getCarbonCopyReceipt().add(dest);
                }
              }
              mailrequest.setCarbonCopyReceipts(ccreceipts);

              BodyContentItem bci = new BodyContentItem();
              bci.setBody(wsdmInviaMail.getTestoMail());
              mailrequest.setBodyContent(bci);

              if (wsdmInviaMail.getAllegati() != null) {
                WSDMProtocolloAllegato[] allegati_mail = wsdmInviaMail.getAllegati();
                SendMailRequestType.Attachments allegatiEasyDoc = new SendMailRequestType.Attachments();
                for (int i = 0; i < allegati_mail.length; i++) {
                  WSDMProtocolloAllegato allegato = allegati_mail[i];
                  it.easydoc.MailManagerService.Attached requestAllegato = new it.easydoc.MailManagerService.Attached();
                  String nome = allegato.getNome();
                  requestAllegato.setFilename(nome);
                  String mime = new MimetypesFileTypeMap().getContentType(nome);
                  requestAllegato.setContentType(mime);
                  requestAllegato.setFile(new DataHandler(new ByteArrayDataSource(allegato.getContenuto(), "base64")));
                  requestAllegato.setFileHash(impronta(allegato.getContenuto()));
                  allegatiEasyDoc.getAttachment().add(requestAllegato);
                }
                mailrequest.setAttachments(allegatiEasyDoc);
              }

              String mailresponsemessage = "";
              // una chiamata per ciascun destinatario
              if (wsdmInviaMail.getDestinatariMail() != null) {
                for (int i = 0; i < wsdmInviaMail.getDestinatariMail().length; i++) {
                  Receipts receipts = new Receipts();
                  String dest = wsdmInviaMail.getDestinatariMail()[i];
                  receipts.getReceipt().add(dest);
                  mailrequest.setReceipts(receipts);

                  logger.info("invio mail a " + dest);
                  if (this.ControlloSessioneConnetti(username, password)) {
                    SendMailResponseType mailresponse = getMailManagerService(false).sendMail(mailrequest);
                    Boolean ok = mailresponse.getMessageResponse().getType().equals(MessageType.OK);
                    if (!ok) {
                      logger.error("ERRORE in invio mail a " + dest);
                      mailresponsemessage += mailresponse.getMessageResponse().getMessage();
                      if (mailresponse.getMessageResponse().getExtendedMessage() != null) {
                        mailresponsemessage += mailresponse.getMessageResponse().getExtendedMessage();
                      }
                      break;
                    }
                  } else {
                    String str = "Connessione al servizio per invio mail non riuscita";
                    logger.error(str);
                    mailresponsemessage += str;
                    break;
                  }
                }
              }

              messaggio_esito += ", INVIO MAIL: " + mailresponsemessage;
            }
            retval.setMessaggio(messaggio_esito);
          } else {
            retval.setMessaggio("Connessione al servizio per protocollazione non riuscita");
          }
        } else {
          retval.setEsito(false);
          String str = "Connessione al servizio per inserimento azienda non riuscita";
          logger.error(str);
          retval.setMessaggio(str);
        }
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

  public String impronta(byte[] buffer) throws NoSuchAlgorithmException, IOException {
    int count;
    MessageDigest digest = MessageDigest.getInstance("SHA-256");

    java.io.BufferedInputStream bis = new java.io.BufferedInputStream(new java.io.ByteArrayInputStream(buffer));
    while ((count = bis.read(buffer)) > 0) {
      digest.update(buffer, 0, count);
    }
    bis.close();
    byte[] hash = digest.digest();

    // String retval = new BASE64Encoder().encode(hash);
    // String retval = new sun.misc.HexDumpEncoder().encode(hash);
    String retval = javax.xml.bind.DatatypeConverter.printHexBinary(hash);
    return retval;
  }

  @Override
  public WSDMProtocolloDocumentoRes _documentoInserisci(String username, String password, WSDMLoginAttr loginAttr,
      WSDMProtocolloDocumentoIn wsdmprotocolloDocumentoIn) {
    WSDMProtocolloDocumentoRes wsdmprotocolloDocumentoRes = new WSDMProtocolloDocumentoRes();
    wsdmprotocolloDocumentoRes.setEsito(false);
    wsdmprotocolloDocumentoRes.setMessaggio(OPERATION_NOT_SUPPORTED);
    return wsdmprotocolloDocumentoRes;
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
    // L'operazione non e' disponibile. L'inserimento di un nuovo fascicolo puo'
    // essere richiesto contestualmente alla richiesta di protocollazione.
    WSDMFascicoloRes wsdmfascicoloRes = new WSDMFascicoloRes();
    wsdmfascicoloRes.setEsito(false);
    wsdmfascicoloRes.setMessaggio(FASCICOLO_OPERATION_NOT_SUPPORTED);
    return wsdmfascicoloRes;
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
//    WSDMFascicoloRes retval = new WSDMFascicoloRes();
//    retval.setEsito(false);
//
//    try {
//      javax.ws.rs.client.Client client = ClientBuilder.newClient();
//
//      GetFoldersRequestType request = new GetFoldersRequestType();
//      request.setAooCode(loginAttr.getLoginTitAttr().getCodiceAmministrazioneAoo());
//      // request.setArchiveType(codice);G = Generale; S = Struttura
//      // request.setDomainCode("333");
//
//      GetFoldersResponseType ret = this.rest("protocol", "folders", request, GetFoldersResponseType.class);
//      List<FolderType> folders = ret.getFolder();
//      for (int i = 0; i < folders.size(); i++) {
//        FolderType folder = folders.get(i);
//        if (folder.getCode().equals(codiceFascicolo)) {
//          WSDMFascicolo fascicolo = new WSDMFascicolo();
//          fascicolo.setDescrizioneFascicolo(folder.getDescription());
//          fascicolo.setClassificaFascicolo(folder.getClassificationCode());
//          retval.setFascicolo(fascicolo);
//          break;
//        }
//      }
//      retval.setEsito(true);
//    } catch (Exception ex) {
//      retval.setMessaggio(ex.getMessage());
//    }
//    return retval;
     WSDMFascicoloRes retval = new WSDMFascicoloRes();
     retval.setEsito(false);
     retval.setMessaggio(OPERATION_NOT_SUPPORTED);
     return retval;
  }

  @Override
  public WSDMFascicoloRes _fascicoloMetadatiLeggi(String username, String password, WSDMLoginAttr loginAttr, String codiceFascicolo,
      Long annoFascicolo, String numeroFascicolo, String classificaFascicolo) {
    return _fascicoloLeggi(username, password, loginAttr, codiceFascicolo, annoFascicolo, numeroFascicolo, classificaFascicolo);
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
    wsdmInviaMailRes.setEsito(true);//richiesto esito true
    wsdmInviaMailRes.setMessaggio(OPERATION_NOT_SUPPORTED);
    return wsdmInviaMailRes;
      
//    logger.info("inizio _inviaMail");
//    WSDMInviaMailRes wSDMInviaMailRes = new WSDMInviaMailRes();
//    wSDMInviaMailRes.setEsito(false);
//    StringBuffer messaggioCtr = new StringBuffer();
//    try {
//      if (this == null) {
//        logger.info("null this");
//      }
//      if (password == null) {
//        logger.info("null password");
//      }
//      if (username == null) {
//        logger.info("null username");
//      }
//      if (EasyDocUtilityControllo.ctrInviaMail(loginAttr, wsdmInviaMail, messaggioCtr)) {
//        logger.info("controllo invio mail superato");
//
//        SendMailRequestType mailrequest = new SendMailRequestType();
//        it.easydoc.MailManagerService.ChannelItem channel = new it.easydoc.MailManagerService.ChannelItem();
//        channel.setChannelCode(wsdmInviaMail.getMailChannelCode());
//        channel.setCfgMailCode(wsdmInviaMail.getMailConfigurationCode());
//        mailrequest.setChannel(channel);
//        mailrequest.setSubject(wsdmInviaMail.getOggettoMail());
//        mailrequest.setShowLogo(Boolean.FALSE);
//
//        CarbonCopyReceipts ccreceipts = new CarbonCopyReceipts();
//        if (wsdmInviaMail.getDestinatariMailCC() != null) {
//          for (int i = 0; i < wsdmInviaMail.getDestinatariMailCC().length; i++) {
//            String dest = wsdmInviaMail.getDestinatariMailCC()[i];
//            ccreceipts.getCarbonCopyReceipt().add(dest);
//          }
//        }
//        mailrequest.setCarbonCopyReceipts(ccreceipts);
//
//        BodyContentItem bci = new BodyContentItem();
//        bci.setBody(wsdmInviaMail.getTestoMail());
//        mailrequest.setBodyContent(bci);
//
//        if (wsdmInviaMail.getAllegati() != null) {
//          WSDMProtocolloAllegato[] allegati_mail = wsdmInviaMail.getAllegati();
//          SendMailRequestType.Attachments allegatiEasyDoc = new SendMailRequestType.Attachments();
//          for (int i = 0; i < allegati_mail.length; i++) {
//            WSDMProtocolloAllegato allegato = allegati_mail[i];
//            it.easydoc.MailManagerService.Attached requestAllegato = new it.easydoc.MailManagerService.Attached();
//            String nome = allegato.getNome();
//            requestAllegato.setFilename(nome);
//            String mime = new MimetypesFileTypeMap().getContentType(nome);
//            requestAllegato.setContentType(mime);
//            requestAllegato.setFile(new DataHandler(new ByteArrayDataSource(allegato.getContenuto(), "base64")));
//            requestAllegato.setFileHash(impronta(allegato.getContenuto()));
//            allegatiEasyDoc.getAttachment().add(requestAllegato);
//          }
//          mailrequest.setAttachments(allegatiEasyDoc);
//        }
//
//        logger.info("connessione valida in fase di invio mail");
//        String mailresponsemessage = "";
//        wSDMInviaMailRes.setEsito(true);
//        // una chiamata per ciascun destinatario
//        if (wsdmInviaMail.getDestinatariMail() != null) {
//          for (int i = 0; i < wsdmInviaMail.getDestinatariMail().length; i++) {
//            Receipts receipts = new Receipts();
//            String dest = wsdmInviaMail.getDestinatariMail()[i];
//            receipts.getReceipt().add(dest);
//            mailrequest.setReceipts(receipts);
//
//            logger.info("invio mail a " + dest);
//            if (ControlloSessioneConnetti(username, password)) {
//              SendMailResponseType mailresponse = getMailManagerService(false).sendMail(mailrequest);
//              Boolean ok = mailresponse.getMessageResponse().getType().equals(MessageType.OK);
//              if (!ok) {
//                logger.error("ERRORE in invio mail a " + dest);
//                mailresponsemessage += mailresponse.getMessageResponse().getMessage();
//                if (mailresponse.getMessageResponse().getExtendedMessage() != null) {
//                  mailresponsemessage += mailresponse.getMessageResponse().getExtendedMessage();
//                }
//                wSDMInviaMailRes.setEsito(false);
//                break;
//              }
//            } else {
//              String str = "Connessione al servizio per invio mail non riuscita";
//              logger.error(str);
//              mailresponsemessage += str;
//              wSDMInviaMailRes.setEsito(false);
//              break;
//            }
//          }
//        }
//
//        wSDMInviaMailRes.setMessaggio(mailresponsemessage);
//
//      } else {
//        logger.info("controllo dati per invio mail non superato");
//        wSDMInviaMailRes.setMessaggio(messaggioCtr.toString());
//      }
//    } catch (WebServiceException w) {
//      wSDMInviaMailRes.setEsito(false);
//      wSDMInviaMailRes.setMessaggio(WS_ERROR + " " + w.getMessage());
//      logger.error("Errore[1] (_inviomail)", w);
//    } catch (NamingException e) {
//      wSDMInviaMailRes.setEsito(false);
//      wSDMInviaMailRes.setMessaggio(NAMING_ERROR + " " + e.getMessage());
//      logger.error("Errore[2] (_inviomail)", e);
//    } catch (Throwable t) {
//      wSDMInviaMailRes.setEsito(false);
//      String message = t.getMessage();
//      logger.info("eccezione generica: " + message);
//      wSDMInviaMailRes.setMessaggio(message);
//      logger.error("Errore[3] (_inviomail)", t);
//    }
//    logger.info("fine _inviaMail");
//    return wSDMInviaMailRes;
  }

  @Override
  public WSDMVerificaMailRes _verificaMail(String username, String password, WSDMLoginAttr loginAttr, String numeroDocumento,
      Long annoProtocollo, String numeroProtocollo) {
    // try {
    // javax.ws.rs.client.Client client = ClientBuilder.newClient();
    // if (this.ControlloSessioneConnetti(username, password)) {
    // GetFoldersRequestType request = new GetFoldersRequestType();
    // request.setAooCode("2");
    // // request.setArchiveType("222");
    // // request.setDomainCode("333");
    //
    // // GetFoldersRequestType ret = this.rest("protocol", "folders", request,
    // GetFoldersRequestType.class);
    // GetFoldersResponseType ret2 = this.rest("protocol", "folders", request,
    // GetFoldersResponseType.class);
    // GetCompaniesRequestType companies_request = new
    // GetCompaniesRequestType();
    // companies_request.setAooCode("2");
    // GetCompaniesResponseType ret3 = this.rest("protocol", "companies",
    // companies_request, GetCompaniesResponseType.class);
    //
    // //StringWriter sw = new StringWriter();
    // //JAXB.marshal(request, sw);
    // //String xmlString = sw.toString();
    // //GetFoldersRequestType customer = JAXB.unmarshal(new
    // StringReader(xmlString), GetFoldersRequestType.class);
    // String endpoint = (String)InitialContext.doLookup(EASYDOC_REST_WS);
    // String str = client.target(endpoint)
    // .path("protocol")
    // .path("folders")
    // .request()
    // .header(EASYDOC_TOKEN_HEADER, token)
    // .post(Entity.entity(request, MediaType.TEXT_PLAIN_TYPE))
    // .readEntity(String.class);
    // GetFoldersRequestType deserializzato = JAXB.unmarshal(new
    // StringReader(str), GetFoldersRequestType.class);
    //
    // int kk9999 = 0;
    //
    // }
    // } catch (Exception ex) {
    // int i = 342;
    // }
    //
    // return new WSDMVerificaMailRes();

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
  private String getUserCompanyCode(String email) throws NamingException, IOException {
    String retval = "-1";
    String aoo = (String) InitialContext.doLookup(EASYDOC_PARAMETRI_AOO);
    String companyCode = (String) InitialContext.doLookup(EASYDOC_PARAMETRI_COMPANYCODE);
    String username = (String) InitialContext.doLookup(EASYDOC_REST_USERNAME);
    String password = (String) InitialContext.doLookup(EASYDOC_REST_PASSWORD);
    
    String authentication = username + ":" + password;
    String authenticationBase64 = Base64.encode(authentication.getBytes());
    String xmlString = "<GetUsersCompanyRequest><AooCode>"+aoo+"</AooCode><CompanyCode>"+companyCode+"</CompanyCode></GetUsersCompanyRequest>";

    HttpURLConnection connection = null;
    URL url = new URL((String) InitialContext.doLookup(EASYDOC_REST_WS) + "protocol/usersCompany");
    connection = (HttpURLConnection) url.openConnection();
    connection.setDoInput(true);
    connection.setDoOutput(true);
    connection.setUseCaches(false);
    connection.setRequestMethod("POST");
    connection.setRequestProperty("Authorization", "Basic " + authenticationBase64);
    connection.setRequestProperty("Connection", "Keep-Alive");
    connection.setRequestProperty("Content-Type", "application/xml");
    connection.setRequestProperty( "Content-Length", Integer.toString( xmlString.length() ));

    OutputStream os = connection.getOutputStream();
    os.write(xmlString.getBytes("UTF-8"));
    os.close();
    int code = connection.getResponseCode();
    StringWriter writer = new StringWriter();
    IOUtils.copy(connection.getInputStream(), writer, "UTF-8");
    String theString = writer.toString();

    GetUsersCompanyResponseType userCompanyResponse =  (GetUsersCompanyResponseType)JAXB.unmarshal(new StringReader(theString), GetUsersCompanyResponseType.class);

    for (int j = 0; j < userCompanyResponse.getUserCompany().size(); j++) {
      UserCompanyType userCompany = userCompanyResponse.getUserCompany().get(j);
        if (userCompany.getPec() != null) {
            if (userCompany
            .getPec().toLowerCase().equals(email.toLowerCase())) {
                if (userCompany.getCode() != null) {
                    retval = userCompany.getCode();
                    break;
                }
            }
        }
    }
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
