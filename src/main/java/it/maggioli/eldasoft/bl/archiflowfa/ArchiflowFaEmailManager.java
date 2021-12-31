package it.maggioli.eldasoft.bl.archiflowfa;

import it.archiflow93.email.ArrayOfMailAddress;
import it.archiflow93.email.ArrayOfguid;
import it.archiflow93.email.EMailService;
import it.archiflow93.email.EMailVisType;
import it.archiflow93.email.IEMailServiceContract;
import it.archiflow93.email.MailAddress;
import it.archiflow93.email.MailOut;
import it.archiflow93.email.ResultInfo;

import java.util.HashMap;
import java.util.List;
import java.util.Map;

import javax.naming.InitialContext;
import javax.xml.ws.Holder;

import org.apache.cxf.endpoint.Client;
import org.apache.cxf.frontend.ClientProxy;
import org.apache.cxf.message.Message;

public class ArchiflowFaEmailManager {

  static private String ARCHIFLOWFA_WS_POSTING             = "java:comp/env/ARCHIFLOWFA_WS_POSTING";
  static private String ARCHIFLOWFA_WS_POSTING_NOT_DEFINED = "ARCHIFLOWFA: l'indirizzo del servizio email (email.svc) non e' definito";

  Map<String, String>   sendMailBoxEmailMap                = new HashMap<String, String>();

  public Map<String, String> getSendMailBoxEmailMap() {
    return sendMailBoxEmailMap;
  }

  public void setSendMailBoxEmailMap(Map<String, String> sendMailBoxEmailMap) {
    this.sendMailBoxEmailMap = sendMailBoxEmailMap;
  }

  public ArchiflowFaEmailManager() {

  }

  private IEMailServiceContract getIEmailServiceContract() throws Exception {
    String wsEmailAddress = InitialContext.doLookup(ARCHIFLOWFA_WS_POSTING);
    if (wsEmailAddress == null || (wsEmailAddress != null && "".equals(wsEmailAddress.trim()))) {
      throw new Exception(ARCHIFLOWFA_WS_POSTING_NOT_DEFINED);
    }

    EMailService eMailService = new EMailService();
    IEMailServiceContract iEMailServiceContract = eMailService.getSIAVArchiflowBaseHTTP();
    Client client = ClientProxy.getClient(iEMailServiceContract);
    client.getRequestContext().put(Message.ENDPOINT_ADDRESS, wsEmailAddress);

    return iEMailServiceContract;

  }

  /**
   * Invio mail mediante servizio email.svc (operazione sendEMail).
   * 
   * @param sessionId
   * @param cardId
   * @param mittente
   * @param destinatari
   * @param oggettoMail
   * @param testoMail
   * @throws Exception
   */
  public void sendEMail(String sessionId, String cardId, String mittente, String[] destinatari, String oggettoMail, String testoMail)
      throws Exception {

    IEMailServiceContract iEmailServiceContract = getIEmailServiceContract();

    Holder<ArrayOfguid> oCardMailOutId = new Holder<ArrayOfguid>();
    Holder<ResultInfo> sendEMailResult = new Holder<ResultInfo>();

    MailOut oMailOut = new MailOut();

    // Oggetto
    oMailOut.setSubject(oggettoMail);

    // Testo
    oMailOut.setBody(testoMail);

    // Mittente
    String email = sendMailBoxEmailMap.get(mittente);
    MailAddress mailAddressFrom = new MailAddress();
    mailAddressFrom.setAddress(email);
    oMailOut.setFrom(mailAddressFrom);

    // Destinatari
    ArrayOfMailAddress mailAddressTo = new ArrayOfMailAddress();
    List<MailAddress> listMailAddressTo = mailAddressTo.getMailAddress();
    for (int d = 0; d < destinatari.length; d++) {
      MailAddress ma = new MailAddress();
      ma.setAddress(destinatari[d]);
      listMailAddressTo.add(ma);
    }
    oMailOut.setTo(mailAddressTo);

    iEmailServiceContract.sendEMail(sessionId, oMailOut, cardId, true, true, false, EMailVisType.EVT_MAILBOX, sendEMailResult,
        oCardMailOutId);
  }

}
