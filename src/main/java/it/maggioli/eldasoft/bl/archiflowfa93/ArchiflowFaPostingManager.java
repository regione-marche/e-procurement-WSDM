package it.maggioli.eldasoft.bl.archiflowfa93;

import it.archiflow93.ArrayOfEMailAttachment;
import it.archiflow93.ArrayOfRecipient;
import it.archiflow93.ArrayOfint;
import it.archiflow93.EMailVisType;
import it.archiflow93.IPostingServiceContract;
import it.archiflow93.PostingService;
import it.archiflow93.Recipient;
import it.archiflow93.RecipientModality;
import it.archiflow93.ResultInfo;
import it.archiflow93.Sending;
import it.archiflow93.SessionInfo;
import it.archiflow93.User;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

import javax.naming.InitialContext;
import javax.xml.ws.Holder;

import org.apache.cxf.endpoint.Client;
import org.apache.cxf.frontend.ClientProxy;
import org.apache.cxf.message.Message;

public class ArchiflowFaPostingManager {

  static private String ARCHIFLOWFA_WS_POSTING             = "java:comp/env/ARCHIFLOWFA_WS_POSTING";
  static private String ARCHIFLOWFA_WS_POSTING_NOT_DEFINED = "ARCHIFLOWFA: l'indirizzo del servizio email (posting.svc) non e' definito";

  Map<String, String>   sendMailBoxChannelMap              = new HashMap<String, String>();
  Map<String, Integer>  sendMailBoxIdMap                   = new HashMap<String, Integer>();
  private short         userCode;
  private List<String>  mailOptions;

  public void setSendMailBoxChannelList(Map<String, String> pMailBoxChannelMap) {
    this.sendMailBoxChannelMap = pMailBoxChannelMap;
  }

  public void setSendMailBoxIdList(Map<String, Integer> pMailBoxIdMap) {
    this.sendMailBoxIdMap = pMailBoxIdMap;
  }

  public void setUserCode(short pUserCode) {
    userCode = pUserCode;
  }

  public ArchiflowFaPostingManager() {

  }

  /**
   * Ottiene IPostingServiceContract.
   */
  private IPostingServiceContract getIPostingService() throws Exception {
    String wsLoginAddress = InitialContext.doLookup(ARCHIFLOWFA_WS_POSTING);
    if (wsLoginAddress == null || (wsLoginAddress != null && "".equals(wsLoginAddress.trim()))) {
      throw new Exception(ARCHIFLOWFA_WS_POSTING_NOT_DEFINED);
    }
    PostingService postingService = new PostingService();
    IPostingServiceContract ipostingService = postingService.getSIAVArchiflowBaseHTTP();
    Client client = ClientProxy.getClient(ipostingService);
    client.getRequestContext().put(Message.ENDPOINT_ADDRESS, wsLoginAddress);

    return ipostingService;
  }

  public List<String> getMailOptions() {
    return mailOptions;
  }

  public void setMailOptions(List<String> mailOptions) {
    this.mailOptions = mailOptions;
  }

  /**
   * Invio della mail mediante servizio posting.svc (operazione send2).
   * 
   * @param sessionInfo
   * @param cardId
   * @param mittente
   * @param destinatari
   * @throws ArchiflowFaException
   */
  public void sendPecMail(SessionInfo sessionInfo, String cardId, String mittente, String[] destinatari, String oggettoMail,
      String testoMail) throws Exception {
    Sending sending = new Sending();
    String cPecChannel = null;

    Integer mailBoxId = sendMailBoxIdMap.get(mittente);
    if (mailBoxId != null) {
      cPecChannel = sendMailBoxChannelMap.get(mittente);
    } else {
      String message = "SendPecMail failure : sender unknown " + mittente;
      throw new Exception(message);
    }

    // Riferimento all'elemento documentale protocollato
    sending.setCardId(cardId);

    // Gestione dell'utente
    User user = new User();
    user.setCode(userCode);
    sending.setUserSent(user);
    sending.setSendingId(-1);

    // Oggetto
    sending.setSubject(oggettoMail);

    // Testo
    sending.setBody(testoMail);

    ArrayOfEMailAttachment attachmentsExt = new ArrayOfEMailAttachment();
    ArrayOfint attachmentCodes = new ArrayOfint();

    // Opzioni
    List<String> options = new ArrayList<String>();
    String sendOptionString = "";
    for (String opt : getMailOptions()) {
      sendOptionString += opt + " ";
    }
    options.add(sendOptionString);

    Holder<String> msgId = new Holder<String>();
    Holder<ResultInfo> send2Result = new Holder<ResultInfo>();

    IPostingServiceContract postingContract = getIPostingService();

    ArrayOfRecipient recipients = null;
    for (int idx = 0; idx < destinatari.length; idx++) {
      Recipient recipient = new Recipient();
      recipients = new ArrayOfRecipient();

      recipient.setAddress(destinatari[idx]);
      recipient.setIsAgrafNotCensus(true);
      recipient.setChannelId(cPecChannel);
      recipient.setSendMailBox(mailBoxId);
      recipient.setModality(RecipientModality.TO);

      recipients.getRecipient().add(recipient);

      sending.setRecipients(recipients);
      postingContract.send2(sessionInfo, sending, attachmentCodes, attachmentsExt, options, EMailVisType.EVT_MAILBOX, send2Result, msgId);

    }

  }

}
