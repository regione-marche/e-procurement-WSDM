package it.maggioli.eldasoft.bl.archiflow;

import it.archiflow94.ArrayOfCard;
import it.archiflow94.ArrayOfUser;
import it.archiflow94.Card;
import it.archiflow94.Folder;
import it.archiflow94.FolderService;
import it.archiflow94.GetCardsInFolderInput;
import it.archiflow94.GetCardsInFolderOutput;
import it.archiflow94.IFolderServiceContract;
import it.archiflow94.IFolderServiceContractAddCardInFolderArchiflowServiceExceptionDetailFaultFaultMessage;
import it.archiflow94.IFolderServiceContractAddCardInFolderInvalidSessionFaultFaultFaultMessage;
import it.archiflow94.IFolderServiceContractGetCardsInFolderArchiflowServiceExceptionDetailFaultFaultMessage;
import it.archiflow94.IFolderServiceContractGetCardsInFolderInvalidSessionFaultFaultFaultMessage;
import it.archiflow94.IFolderServiceContractGetFolderArchiflowServiceExceptionDetailFaultFaultMessage;
import it.archiflow94.IFolderServiceContractGetFolderInvalidSessionFaultFaultFaultMessage;
import it.archiflow94.IFolderServiceContractInsertFolderArchiflowServiceExceptionDetailFaultFaultMessage;
import it.archiflow94.IFolderServiceContractInsertFolderInvalidSessionFaultFaultFaultMessage;
import it.archiflow94.ResultInfo;
import it.archiflow94.User;
import it.archiflow94.UserType;
import it.maggioli.eldasoft.bl.IWSDMManager;
import it.maggioli.eldasoft.ws.dm.WSDMFascicoloIn;
import it.maggioli.eldasoft.ws.dm.WSDMFascicoloRes;

import java.util.GregorianCalendar;
import java.util.List;

import javax.naming.InitialContext;
import javax.xml.datatype.DatatypeConfigurationException;
import javax.xml.datatype.DatatypeFactory;
import javax.xml.datatype.XMLGregorianCalendar;
import javax.xml.ws.Holder;

import org.apache.cxf.endpoint.Client;
import org.apache.cxf.frontend.ClientProxy;
import org.apache.cxf.message.Message;
import org.apache.log4j.Logger;

/**
 *  Facade to wrap Archiflow Folder Service
 * @author Niuma
 *
 */
public class ArchiflowFolderManager {
	
	static private String ARCHIFLOW_WS_FOLDER = "java:comp/env/ARCHIFLOW_WS_FOLDER";    
    private short userCode = -1;

	static Logger logger = Logger.getLogger(ArchiflowManager.class);
	
	 /**
	  * Configured user code 
	  * @param pUserCode
	  */
	public void setUserCode(short pUserCode) {
		userCode = pUserCode;
	}

	  /**
	   * Ottiene IFolderServiceContract configurato con OutInterceptor per l'utilizzo di WS-Security.
	   * 
	   * @param username
	   * @param password
	   * @return
	   * @throws Exception
	   */
	private IFolderServiceContract getIFolderService() throws Exception {
	    String wsFolderAddress = InitialContext.doLookup(ARCHIFLOW_WS_FOLDER);
	    if (wsFolderAddress == null || (wsFolderAddress != null && "".equals(wsFolderAddress.trim()))) {
	      throw new Exception(IWSDMManager.URL_NOT_DEFINED);
	    }
	    FolderService folderService = new FolderService();
	    IFolderServiceContract iFolderService = folderService.getSIAVArchiflowBaseHTTP();
	    Client client = ClientProxy.getClient(iFolderService);
	    client.getRequestContext().put(Message.ENDPOINT_ADDRESS, wsFolderAddress);   
	    
	    return iFolderService;
	}
	
	public Folder inserisciFascicolo(String strSessionId, WSDMFascicoloIn wsdmfascicoloIn) throws ArchiflowException {		
		String error = "";		
		final boolean CHECK_DUPLICATE = true;
		Holder<Integer> newId = new Holder<Integer>();
		Folder folder = new Folder();

	    if(strSessionId != null && !strSessionId.isEmpty()) {      	
        	
    		Holder<ResultInfo> insertResult = new Holder<ResultInfo>(ResultInfo.fromValue("NULL"));
	
    		folder.setName( wsdmfascicoloIn.getOggettoFascicolo() );
    		folder.setNote( wsdmfascicoloIn.getDescrizioneFascicolo());
    		
    		XMLGregorianCalendar folderDate;
    		try {
				folderDate = DatatypeFactory.newInstance().
						newXMLGregorianCalendar( (GregorianCalendar) GregorianCalendar.getInstance() );
			} catch (DatatypeConfigurationException e1) {
				folderDate = null;
			}
    		folder.setDate(folderDate);
			
			User user =  new User();
			//user.setName(  new EntityName(ARCHIFLOW_USERNAME) );
	        //user.setId(  new UserId("682") );
	        user.setCode( userCode );
	        user.setUserType(UserType.UT_STANDARD);
	        user.setNormalVisibility(true);
	        user.setSendMail(false);
	        user.setIsReadOnly(false);
	        user.setIsOnlyGED(false);
/*	        
	        ArrayOfUserRight userRights =  new ArrayOfUserRight();
	        UserRight uRight =  new UserRight();
	        uRight.setEnabled(true);
			userRights.getUserRight().add(uRight);
	        JAXBElement<ArrayOfUserRight> rights =  new UserRights(userRights);	        
			user.setRights(rights);
*/			
			ArrayOfUser userArray =  new ArrayOfUser();
			userArray.getUser().add(user);			
			folder.setUsersRead(userArray);
			folder.setUsersWrite(userArray);
	
			try {
				//  call service to insert a new folder
				IFolderServiceContract folderContract = getIFolderService();
				folderContract.insertFolder(strSessionId, folder, CHECK_DUPLICATE, insertResult, newId);
				folder.setCode(newId.value);
									
			} catch (IFolderServiceContractInsertFolderArchiflowServiceExceptionDetailFaultFaultMessage e) {
					error = e.getMessage() + " [ " + e.getFaultInfo().getMessage() + " ]";
					throw new ArchiflowException(error, e);
			} catch (IFolderServiceContractInsertFolderInvalidSessionFaultFaultFaultMessage e) {
					error = e.getMessage() + " [ " + e.getFaultInfo().getMessage() + " ]";
					throw new ArchiflowException(error, e);
			} catch (Exception e) {
				throw new ArchiflowException(e.getMessage(), e);
			} 
/*
			if(insertResult.value == ResultInfo.OK) {						

				try {
					JAXBElement<ArrayOfUser> oUsersSend = new SendFolderInputUsers(userArray);
					sendResult = folderContract.sendFolder(strSessionId, newFolderId, oUsersSend, null, null, "folder New", false);
				} catch (IFolderServiceContractSendFolderInvalidSessionFaultFaultFaultMessage e) {
					error = e.getMessage() + " [ " + e.getFaultInfo().getMessage() + " ]";
				} catch (IFolderServiceContractSendFolderArchiflowServiceExceptionDetailFaultFaultMessage e) {
					error = e.getMessage() + " [ " + e.getFaultInfo().getMessage() + " ]";
				}
						
				if(sendResult == ResultInfo.OK) {
						logger.error("sendFolder OK ");
				} else {
						logger.error("sendFolder error : " + error);
				}			
			}
*/					
	        if (insertResult.value == ResultInfo.OK) {
	        	logger.info( String.format("New folder [ number: %d   name: %s   date: %s ]", folder.getCode(), folder.getName(), folder.getDate().toString()));	        	        		        	
	        } 	
        }    
		return folder;
	}

	public boolean AddCardInFolder(String strSessionId, Integer pFolderId, String pCardId) {
		Boolean result = false;  
		ResultInfo oResult = ResultInfo.NULL;
		WSDMFascicoloRes pFascicoloResult = new WSDMFascicoloRes();
		pFascicoloResult.setEsito(false);
		String error = "";

	    if(strSessionId != null && !strSessionId.isEmpty()) {   
			// call AddCardInFolder service
			try {
				IFolderServiceContract folderContract = getIFolderService();
				oResult = folderContract.addCardInFolder(strSessionId, pCardId, pFolderId);
			} catch (IFolderServiceContractAddCardInFolderArchiflowServiceExceptionDetailFaultFaultMessage e) {
				error = e.getMessage() + " [ " + e.getFaultInfo().getMessage() + " ]";
			} catch (IFolderServiceContractAddCardInFolderInvalidSessionFaultFaultFaultMessage e) {
				error = e.getMessage() + " [ " + e.getFaultInfo().getMessage() + " ]";
			} catch (Exception e) {
				error = e.getMessage();
			}
			
			if(oResult == ResultInfo.OK) {
				pFascicoloResult.setEsito(true);
				logger.info("AddCardInFolder  -  cardId:" + pCardId + "  --->  folderId:" +  pFolderId );
				result = true;
			} else {
				logger.error("AddCardInFolder  : " + error);
			} 	
        }      
		return result;
	}

	public Folder getFolder(String strSessionId, String codiceFascicolo, Long annoFascicolo, String numeroFascicolo) throws ArchiflowException {
		Folder result = null;
		logger.info("_fascicoloLeggi");
		
		Holder<ResultInfo> oResult = new Holder<ResultInfo>(ResultInfo.NULL);
		Holder<Folder> oFolder = new Holder<Folder>(new Folder());

	    if(strSessionId != null && !strSessionId.isEmpty()) {      	       	
	        //  call service to get a folder

			try {
				Integer folderId = new Integer(codiceFascicolo);
				IFolderServiceContract folderContract = getIFolderService();
				folderContract.getFolder(strSessionId, folderId, true, true, oResult, oFolder);
				
				result = oFolder.value;

			} catch (IFolderServiceContractGetFolderArchiflowServiceExceptionDetailFaultFaultMessage e) {
				String message = e.getFaultInfo().getName() + "  " + e.getFaultInfo().getMessage();
				throw new ArchiflowException(message, e);
			} catch (IFolderServiceContractGetFolderInvalidSessionFaultFaultFaultMessage e) {
				String message = e.getFaultInfo().getName() + "  " + e.getFaultInfo().getMessage();
				throw new ArchiflowException(message, e);
			} catch (Exception e) {
				throw new ArchiflowException(e.getMessage(), e);
			} 
	    }
		return result;
	}
	
	public List<Card> getCardInFolder(String numeroFascicolo) throws ArchiflowException {
		ArrayOfCard cardArray;
		try {
			GetCardsInFolderInput paramIn = new GetCardsInFolderInput();
			paramIn.setFolderId(new Integer(numeroFascicolo));
			paramIn.setGetIndexes(true);
			IFolderServiceContract folderContract = getIFolderService();
			GetCardsInFolderOutput folderOutput = folderContract.getCardsInFolder(paramIn);
			cardArray = folderOutput.getCards();
			
		} catch (IFolderServiceContractGetCardsInFolderArchiflowServiceExceptionDetailFaultFaultMessage e) {
			String message = e.getFaultInfo().getName() + "  " + e.getFaultInfo().getMessage();
			throw new ArchiflowException(message, e);
		} catch (IFolderServiceContractGetCardsInFolderInvalidSessionFaultFaultFaultMessage e) {
			String message = e.getFaultInfo().getName() + "  " + e.getFaultInfo().getMessage();
			throw new ArchiflowException(message, e);
		} catch (Exception e) {
			throw new ArchiflowException(e.getMessage(), e);
		}
		return cardArray.getCard();
	}

}
