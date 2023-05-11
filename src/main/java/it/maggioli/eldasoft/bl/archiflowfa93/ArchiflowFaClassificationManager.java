package it.maggioli.eldasoft.bl.archiflowfa93;

import it.archiflow93.SessionInfo;
import it.archiflow93.classification.ArrayOfFascicoloEntity;
import it.archiflow93.classification.BaseIdentifier;
import it.archiflow93.BaseInput;
import it.archiflow93.classification.ClassificationService;
import it.archiflow93.classification.FascicoloEntity;
import it.archiflow93.classification.FascicoloIdentifier;
import it.archiflow93.classification.FascicoloSearcher;
import it.archiflow93.classification.IClassificationService;
import it.archiflow93.classification.ReadFascicoloInput;
import it.archiflow93.classification.ReadFascicoloOutput;
import it.maggioli.eldasoft.bl.IWSDMManager;

import java.util.List;

import javax.naming.InitialContext;

import org.apache.cxf.endpoint.Client;
import org.apache.cxf.frontend.ClientProxy;
import org.apache.cxf.message.Message;
import org.apache.log4j.Logger;

/**
 * Facade to wrap Archiflow Folder Service
 * 
 * @author Niuma
 * 
 */
public class ArchiflowFaClassificationManager {

  static private String ARCHIFLOWFA_WS_FOLDER           = "java:comp/env/ARCHIFLOWFA_WS_FOLDER";
  static private String ARCHIFLOWFA_WS_FOLDER_UTENTE_ID = "java:comp/env/ARCHIFLOWFA_WS_FOLDER_UTENTE_ID";

  private short         userCode                        = -1;

  static Logger         logger                          = Logger.getLogger(ArchiflowFaClassificationManager.class);

  /**
   * Configured user code
   * 
   * @param pUserCode
   */
  public void setUserCode(short pUserCode) {
    userCode = pUserCode;
  }

  /**
   * Ottiene l'accesso al servizio di gestione dei fascicoli.
   * 
   * @return
   * @throws Exception
   */
  private IClassificationService getIFascicoloService() throws Exception {
    String wsClassificaionAddress = InitialContext.doLookup(ARCHIFLOWFA_WS_FOLDER);
    if (wsClassificaionAddress == null || (wsClassificaionAddress != null && "".equals(wsClassificaionAddress.trim()))) {
      throw new Exception(IWSDMManager.URL_NOT_DEFINED);
    }
    ClassificationService fascicoloService = new ClassificationService();
    IClassificationService iClassificationService = fascicoloService.getClassificationBaseHTTP();
    Client client = ClientProxy.getClient(iClassificationService);
    client.getRequestContext().put(Message.ENDPOINT_ADDRESS, wsClassificaionAddress);
    return iClassificationService;

  }

  /**
   * Lettura delle informazioni generali del fascicolo.
   * 
   * @param codiceFascicolo
   * @return
   * @throws ArchiflowFaException
   */
  public FascicoloEntity getReadFascicolo(SessionInfo sessionInfoLogin, String codiceFascicolo) throws ArchiflowFaException {

    FascicoloEntity result = null;

    try {

      IClassificationService iClassificatioService = this.getIFascicoloService();
      ReadFascicoloInput readFascicoloInput = new ReadFascicoloInput();
      FascicoloSearcher fascicoloSearcher = new FascicoloSearcher();
      
      // Identificativo utente
      String utente_id = InitialContext.doLookup(ARCHIFLOWFA_WS_FOLDER_UTENTE_ID);
      if (utente_id == null || (utente_id != null && "".equals(utente_id.trim()))) {
        // throw new Exception("Per la lettura del fascicolo e' necessario valorizzare il parametro ARCHIFLOWFA_WS_FOLDER_UTENTE_ID");
      } else {
        BaseIdentifier baseIdentifierUtenteId = new BaseIdentifier();
        try {
          baseIdentifierUtenteId.setId(Integer.parseInt(utente_id));
          fascicoloSearcher.setUtenteId(baseIdentifierUtenteId);
        } catch (Exception e) {
          throw new Exception("Il parametro ARCHIFLOWFA_WS_FOLDER_UTENTE_ID deve essere numerico");
        }
      }

      FascicoloIdentifier fascicoloIdentifier = new FascicoloIdentifier();
      fascicoloIdentifier.setId(Integer.parseInt(codiceFascicolo));

      fascicoloSearcher.setFascicoloId(fascicoloIdentifier);
      readFascicoloInput.setFascSearcher(fascicoloSearcher);
      
      it.archiflow93.classification.SessionInfo sessionInfoClassification = new it.archiflow93.classification.SessionInfo();
      if (sessionInfoLogin != null) {
        sessionInfoClassification.setClientType(sessionInfoLogin.getClientType());
        sessionInfoClassification.setDateFormat(sessionInfoLogin.getDateFormat());
        sessionInfoClassification.setExecutiveOfficeCode(sessionInfoLogin.getExecutiveOfficeCode());
        sessionInfoClassification.setLoginTicketUserId(sessionInfoLogin.getLoginTicketUserId());
        sessionInfoClassification.setSessionId(sessionInfoLogin.getSessionId());
        sessionInfoClassification.setTokenSess(sessionInfoLogin.getTokenSess());
        sessionInfoClassification.setVelocisDatabase(sessionInfoLogin.getVelocisDatabase());
        sessionInfoClassification.setVelocisServer(sessionInfoLogin.getVelocisServer());
        sessionInfoClassification.setWorkflowId(sessionInfoLogin.getWorkflowId());
      }
      
      readFascicoloInput.setSessionInfo(sessionInfoClassification);
      
      ReadFascicoloOutput readFascicoloOutput = iClassificatioService.readFascicoloByParam(readFascicoloInput);

      ArrayOfFascicoloEntity arrayOfFascicoloEntity = readFascicoloOutput.getFascColl();
      if (arrayOfFascicoloEntity != null) {
        List<FascicoloEntity> listFascicoloEntity = arrayOfFascicoloEntity.getFascicoloEntity();
        if (listFascicoloEntity.size() > 0) {
          result = listFascicoloEntity.get(0);
        }
      }

    } catch (Exception e) {
      throw new ArchiflowFaException(e.getMessage(), e);
    }

    return result;

  }

}
