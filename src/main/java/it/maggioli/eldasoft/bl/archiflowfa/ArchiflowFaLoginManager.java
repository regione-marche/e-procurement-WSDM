package it.maggioli.eldasoft.bl.archiflowfa;

import it.archiflow93.ConnectionInfo;
import it.archiflow93.ILoginServiceContract;
import it.archiflow93.ILoginServiceContractLoginArchiflowServiceExceptionDetailFaultFaultMessage;
import it.archiflow93.ILoginServiceContractLoginChangePasswordFaultFaultFaultMessage;
import it.archiflow93.ILoginServiceContractLoginInvalidExecutiveOfficeFaultFaultFaultMessage;
import it.archiflow93.ILoginServiceContractLoginInvalidPasswordFaultFaultFaultMessage;
import it.archiflow93.ILoginServiceContractLoginInvalidPasswordFormatFaultFaultFaultMessage;
import it.archiflow93.ILoginServiceContractLoginInvalidPasswordLengthFaultFaultFaultMessage;
import it.archiflow93.ILoginServiceContractLoginInvalidSessionFaultFaultFaultMessage;
import it.archiflow93.ILoginServiceContractLoginLoginFaultFaultFaultMessage;
import it.archiflow93.ILoginServiceContractLoginLoginTicketSapFaultFaultFaultMessage;
import it.archiflow93.ILoginServiceContractLoginParamValidationFaultFaultFaultMessage;
import it.archiflow93.ILoginServiceContractLoginUserAccountDisabledFaultFaultFaultMessage;
import it.archiflow93.ILoginServiceContractLogoutArchiflowServiceExceptionDetailFaultFaultMessage;
import it.archiflow93.ILoginServiceContractLogoutInvalidSessionFaultFaultFaultMessage;
import it.archiflow93.Language;
import it.archiflow93.LoginService;
import it.archiflow93.ResultInfo;
import it.archiflow93.SessionInfo;
import it.maggioli.eldasoft.bl.IWSDMManager;

import javax.naming.InitialContext;
import javax.xml.bind.JAXBElement;
import javax.xml.ws.Holder;

import org.apache.cxf.endpoint.Client;
import org.apache.cxf.frontend.ClientProxy;
import org.apache.cxf.message.Message;
import org.apache.log4j.Logger;

public class ArchiflowFaLoginManager {

  static private String ARCHIFLOWFA_WS_LOGIN        = "java:comp/env/ARCHIFLOWFA_WS_LOGIN";
  static private String ARCHIFLOWFA_WS_LOGIN_DOMAIN = "java:comp/env/ARCHIFLOWFA_WS_LOGIN_DOMAIN";

  private final String  DATE_FORMAT                 = "dd/mm/yyyy";

  private static Logger logger                      = Logger.getLogger(ArchiflowFaLoginManager.class);

  /**
   * Ottiene ILoginServiceContract configurato con OutInterceptor per l'utilizzo
   * di WS-Security.
   * 
   * @param username
   * @param password
   * @return
   * @throws Exception
   */
  private ILoginServiceContract getILoginService() throws Exception {
    String wsLoginAddress = InitialContext.doLookup(ARCHIFLOWFA_WS_LOGIN);
    if (wsLoginAddress == null || (wsLoginAddress != null && "".equals(wsLoginAddress.trim()))) {
      throw new Exception(IWSDMManager.URL_NOT_DEFINED);
    }
    LoginService loginService = new LoginService();
    ILoginServiceContract iLoginService = loginService.getSIAVArchiflowBaseHTTP();
    Client client = ClientProxy.getClient(iLoginService);
    client.getRequestContext().put(Message.ENDPOINT_ADDRESS, wsLoginAddress);

    return iLoginService;
  }

  /**
   * call the WCF service contract for login to Archiflow
   * 
   * @param password
   * @param username
   * @return ResultInfo [OK, SERVER_ERROR]
   */
  protected ResultInfo archiflowLogin(String username, String password, Holder<SessionInfo> sessionInfo) {
    String error = "";

    ConnectionInfo connectionInfo = new ConnectionInfo();

    it.archiflow93.ObjectFactory factoryBase = new it.archiflow93.ObjectFactory();
    it.archiflow93.ObjectFactory factoryLogin = new it.archiflow93.ObjectFactory();
    JAXBElement<ResultInfo> result = factoryBase.createResultInfo(ResultInfo.fromValue(("NULL")));
    Holder<ResultInfo> oResult = new Holder<ResultInfo>(result.getValue());

    try {

      connectionInfo.setClientType((short) 0);
      connectionInfo.setDateFormat(DATE_FORMAT);
      connectionInfo.setLanguage(Language.ITALIAN);

      String domain = InitialContext.doLookup(ARCHIFLOWFA_WS_LOGIN_DOMAIN);
      if (domain != null) {
        connectionInfo.setWorkflowDomain(domain);
      }

      ILoginServiceContract loginContract = this.getILoginService();
      loginContract.login(username, password, connectionInfo, oResult, sessionInfo);

    } catch (ILoginServiceContractLoginParamValidationFaultFaultFaultMessage e) {
      error = e.getMessage();
    } catch (ILoginServiceContractLoginInvalidPasswordLengthFaultFaultFaultMessage e) {
      error = e.getMessage() + " [ " + e.getFaultInfo().getMessage() + " ]";
    } catch (ILoginServiceContractLoginLoginFaultFaultFaultMessage e) {
      error = e.getMessage() + " [ " + e.getFaultInfo().getMessage() + " ]";
    } catch (ILoginServiceContractLoginLoginTicketSapFaultFaultFaultMessage e) {
      error = e.getMessage();
    } catch (ILoginServiceContractLoginArchiflowServiceExceptionDetailFaultFaultMessage e) {
      error = e.getMessage();
    } catch (ILoginServiceContractLoginInvalidExecutiveOfficeFaultFaultFaultMessage e) {
      error = e.getMessage();
    } catch (ILoginServiceContractLoginInvalidPasswordFaultFaultFaultMessage e) {
      error = e.getMessage();
    } catch (ILoginServiceContractLoginInvalidSessionFaultFaultFaultMessage e) {
      error = e.getMessage();
    } catch (ILoginServiceContractLoginChangePasswordFaultFaultFaultMessage e) {
      error = e.getMessage();
    } catch (ILoginServiceContractLoginUserAccountDisabledFaultFaultFaultMessage e) {
      error = e.getMessage();
    } catch (ILoginServiceContractLoginInvalidPasswordFormatFaultFaultFaultMessage e) {
      error = e.getMessage();
    } catch (Exception e) {

    }

    if (oResult.value == ResultInfo.OK) {
      logger.info("Login Ok :   token=" + connectionInfo.getTokenSess() + "   sessionId=" + sessionInfo.value.getSessionId());
    } else {
      logger.info("Login error : " + error);
      sessionInfo = null;
    }
    return oResult.value;
  }

  /**
   * call the WCF service contract for logout from Archiflow
   * 
   * @return ResultInfo [OK, SERVER_ERROR]
   */
  protected ResultInfo archiflowLogout(Holder<SessionInfo> sessionInfo) {
    ResultInfo result = ResultInfo.SERVER_ERROR;
    if (sessionInfo != null) {
      try {
        ILoginServiceContract loginContract = this.getILoginService();
        if (loginContract.logout(sessionInfo.value) == ResultInfo.OK) {
          logger.info("Logout OK");
          result = ResultInfo.OK;
        } else {
          logger.error("Logout error");
        }
      } catch (ILoginServiceContractLogoutArchiflowServiceExceptionDetailFaultFaultMessage e) {
        logger.error("Logout error : " + e.getMessage());
      } catch (ILoginServiceContractLogoutInvalidSessionFaultFaultFaultMessage e) {
        logger.error("Logout error : " + e.getMessage());
      } catch (Exception e) {
        logger.error("Logout error : " + e.getMessage());
      }
      sessionInfo = null;
    }
    return result;
  }

}
