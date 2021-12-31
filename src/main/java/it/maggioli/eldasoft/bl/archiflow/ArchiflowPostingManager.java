package it.maggioli.eldasoft.bl.archiflow;

import it.archiflow94.ArrayOfEMailAttachment;
import it.archiflow94.ArrayOfRecipient;
import it.archiflow94.ArrayOfint;
import it.archiflow94.EMailVisType;
import it.archiflow94.IPostingServiceContract;
import it.archiflow94.PostingService;
import it.archiflow94.Recipient;
import it.archiflow94.RecipientModality;
import it.archiflow94.ResultInfo;
import it.archiflow94.Sending;
import it.archiflow94.SessionInfo;
import it.archiflow94.User;
import it.maggioli.eldasoft.bl.IWSDMManager;
import it.maggioli.eldasoft.ws.dm.WSDMInviaMail;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

import javax.naming.InitialContext;
import javax.xml.ws.Holder;

import org.apache.cxf.endpoint.Client;
import org.apache.cxf.frontend.ClientProxy;
import org.apache.cxf.message.Message;
import org.apache.log4j.Logger;

public class ArchiflowPostingManager {

  static private String ARCHIFLOW_WS_POSTING  = "java:comp/env/ARCHIFLOW_WS_POSTING";

  private static Logger logger                = Logger.getLogger(ArchiflowPostingManager.class);

  // private String cPecChannel = "A9ADAF65-6CC0-4FAF-A724-D47137C7500B";
  Map<String, String>   sendMailBoxMap        = new HashMap<String, String>();
  Map<String, String>   sendMailBoxChannelMap = new HashMap<String, String>();
  Map<String, Integer>  sendMailboxIdMap      = new HashMap<String, Integer>();
  private short         userCode;
  private List<String>  mailOptions;

  public void setSendMailBoxList(Map<String, String> pMailBoxMap) {
    this.sendMailBoxMap = pMailBoxMap;
  }

  public void setSendMailBoxChannelList(Map<String, String> pMailBoxChannelMap) {
    this.sendMailBoxChannelMap = pMailBoxChannelMap;
  }

  public void setSendMailboxIdList(Map<String, Integer> pMailboxIdMap) {
    this.sendMailboxIdMap = pMailboxIdMap;
  }

  public void setUserCode(short pUserCode) {
    userCode = pUserCode;
  }

  private String OggettoMail = "";

  private String TestoMail   = "";

  public ArchiflowPostingManager() {

  }

  /**
   * Ottiene IPostingServiceContract.
   */
  private IPostingServiceContract getIPostingService() throws Exception {
    String wsLoginAddress = InitialContext.doLookup(ARCHIFLOW_WS_POSTING);
    if (wsLoginAddress == null || (wsLoginAddress != null && "".equals(wsLoginAddress.trim()))) {
      throw new Exception(IWSDMManager.URL_NOT_DEFINED);
    }
    PostingService postingService = new PostingService();
    IPostingServiceContract ipostingService = postingService.getSIAVArchiflowBaseHTTP();
    Client client = ClientProxy.getClient(ipostingService);
    client.getRequestContext().put(Message.ENDPOINT_ADDRESS, wsLoginAddress);

    return ipostingService;
  }

  public void SendPecMailAction(SessionInfo sessionInfo, String cardId, WSDMInviaMail wsdmMail) throws ArchiflowException {

    OggettoMail = wsdmMail.getOggettoMail();
    TestoMail = wsdmMail.getTestoMail();

    SendPecMail(sessionInfo, cardId, wsdmMail.getMittenteMail(), wsdmMail.getDestinatariMail());
  }

  public void setTestoMail(String testoMail) {
    TestoMail = testoMail;
  }

  public void setOggettoMail(String oggettoMail) {
    OggettoMail = oggettoMail;
  }

  public List<String> getMailOptions() {
    return mailOptions;
  }

  public void setMailOptions(List<String> mailOptions) {
    this.mailOptions = mailOptions;
  }

  public String SendPecMail(SessionInfo sessionInfo, String cardId, String mittente, String[] destinatari) throws ArchiflowException {
    Sending sending = new Sending();
    String messageId = null;
    String cPecChannel = null;
    Integer sendMailboxId = null;

    Integer mailboxId = sendMailboxIdMap.get(mittente);
    if (mailboxId != null) {
      cPecChannel = sendMailBoxChannelMap.get(mittente);
    } else {
      String message = "SendPecMail failure : sender unknown " + mittente;
      throw new ArchiflowException(message);
    }

    try {
      sending.setCardId(cardId);
      // utente che effettua l'invio
      User user = new User();
      user.setCode(userCode);
      sending.setUserSent(user);
      sending.setSendingId(-1);

      sending.setSubject(OggettoMail);
      sending.setBody(TestoMail);

      ArrayOfEMailAttachment attachmentsExt = new ArrayOfEMailAttachment();
      ArrayOfint attachmentCodes = new ArrayOfint();

      List<String> options = new ArrayList<String>(); // SendMail options
      String sendOptionString = "";
      for (String opt : getMailOptions()) {
        sendOptionString += opt + " ";
      }
      options.add(sendOptionString);

      Holder<String> msgId = new Holder<String>();
      Holder<ResultInfo> send2Result = new Holder<ResultInfo>();

      IPostingServiceContract postingContract = getIPostingService();

      // Recipient
      ArrayOfRecipient recipients = null;
      for (int idx = 0; idx < destinatari.length; idx++) {
        Recipient recipient = new Recipient();
        recipients = new ArrayOfRecipient();

        recipient.setAddress(destinatari[idx]);
        recipient.setIsAgrafNotCensus(true);
        ;
        recipient.setChannelId(cPecChannel);
        recipient.setSendMailBox(mailboxId);
        recipient.setModality(RecipientModality.TO);

        recipients.getRecipient().add(recipient);

        sending.setRecipients(recipients);
        postingContract.send2(sessionInfo, sending, attachmentCodes, attachmentsExt, options, EMailVisType.EVT_MAILBOX, send2Result, msgId);

        if (send2Result.value.equals(ResultInfo.OK)) {
          messageId = msgId.value;
          logger.info("  sendMail OK " + messageId + "    to " + destinatari[idx]);
        }
      }
    } catch (Exception e) {
      String message = e.getMessage();
      throw new ArchiflowException(message, e);
    }
    return messageId;
  }

}
