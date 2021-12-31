package it.maggioli.eldasoft.bl.archiflow;

import it.archiflow94.ArrayOfField;
import it.archiflow94.ArrayOfGroup;
import it.archiflow94.ArrayOfOffice;
import it.archiflow94.ArrayOfUser;
import it.archiflow94.CardBundle;
import it.archiflow94.CardService;
import it.archiflow94.EntityType;
import it.archiflow94.ExternalAttachment;
import it.archiflow94.Field;
import it.archiflow94.Group;
import it.archiflow94.ICardServiceContract;
import it.archiflow94.ICardServiceContractAttachDocumentArchiflowServiceExceptionDetailFaultFaultMessage;
import it.archiflow94.ICardServiceContractAttachDocumentInvalidSessionFaultFaultFaultMessage;
import it.archiflow94.ICardServiceContractGetCardBundleArchiflowServiceExceptionDetailFaultFaultMessage;
import it.archiflow94.ICardServiceContractGetCardBundleInvalidSessionFaultFaultFaultMessage;
import it.archiflow94.ICardServiceContractGetCardBundleVisibilityFaultFaultFaultMessage;
import it.archiflow94.ICardServiceContractGetCardVisibilityArchiflowServiceExceptionDetailFaultFaultMessage;
import it.archiflow94.ICardServiceContractGetCardVisibilityInvalidSessionFaultFaultFaultMessage;
import it.archiflow94.ICardServiceContractInsertCardArchiflowServiceExceptionDetailFaultFaultMessage;
import it.archiflow94.ICardServiceContractInsertCardInvalidSessionFaultFaultFaultMessage;
import it.archiflow94.ICardServiceContractSearchCardsArchiflowServiceExceptionDetailFaultFaultMessage;
import it.archiflow94.ICardServiceContractSearchCardsInvalidSessionFaultFaultFaultMessage;
import it.archiflow94.IdField;
import it.archiflow94.Office;
import it.archiflow94.ResultInfo;
import it.archiflow94.SearchCriteria;
import it.archiflow94.SearchType;
import it.archiflow94.SendEntity;
import it.archiflow94.SendObject;
import it.archiflow94.SendingType;
import it.archiflow94.User;
import it.maggioli.eldasoft.bl.IWSDMManager;
import it.maggioli.eldasoft.ws.dm.WSDMProtocolloAllegato;

import javax.naming.InitialContext;
import javax.xml.ws.Holder;

import org.apache.axis.encoding.Base64;
import org.apache.cxf.endpoint.Client;
import org.apache.cxf.frontend.ClientProxy;
import org.apache.cxf.message.Message;

import it.archiflow94.ArrayOfguid;
import com.sun.istack.logging.Logger;

public class ArchiflowCardManager {
	static private String ARCHIFLOW_WS_CARD = "java:comp/env/ARCHIFLOW_WS_CARD";   

	//private ICardServiceContract cardContract;
	private short userCode;
	public void setUserCode(short pUserCode) {
		userCode = pUserCode;
	}
    
	static Logger logger = Logger.getLogger(ArchiflowManager.class);
    
	//private ObjectFactory factoryNtt =	new ObjectFactory();
	//private ObjectFactory factoryCard = new ObjectFactory(); 

	/*
	   * Ottiene ICardServiceContract configurato con OutInterceptor per l'utilizzo di WS-Security.
	   * 
	   * @param username
	   * @param password
	   * @return
	   * @throws Exception
	   */
	private ICardServiceContract getICardService() throws Exception {
	    String wsCardAddress = InitialContext.doLookup(ARCHIFLOW_WS_CARD);
	    if (wsCardAddress == null || (wsCardAddress != null && "".equals(wsCardAddress.trim()))) {
	      throw new Exception(IWSDMManager.URL_NOT_DEFINED);
	    }
	    CardService CardService = new CardService();
	    ICardServiceContract iCardService = CardService.getSIAVArchiflowBaseHTTP();
	    Client client = ClientProxy.getClient(iCardService);
	    client.getRequestContext().put(Message.ENDPOINT_ADDRESS, wsCardAddress);   
	    
	    return iCardService;
	}
	
    /**
     *  Management of it.archiflow.card.ICardServiceContract.insertCart
     * @param strSessionId
     * @param WSDMProtocolloDocumentoIn Eldasoft input document
     * @return CardBundle Archiflow Card
     * @throws ArchiflowException
     */
	public CardBundle insertCard(String strSessionId, CardBundle newCard) 
			throws ArchiflowException {
	    if(strSessionId != null && !strSessionId.isEmpty()) {        	
	        Holder<String> oCardGuid = new Holder<String>();
	        short archiveId = newCard.getArchiveId();
	        short documentTypeId = newCard.getDocumentTypeId();

				// entities
	            ArrayOfField oFields = newCard.getIndexes();
	        	try {
	        		Holder<ResultInfo> resultInfo = new Holder<ResultInfo>(ResultInfo.fromValue(("NULL")));
	        		Holder<ResultInfo> resultInfo2 = new Holder<ResultInfo>(ResultInfo.fromValue(("NULL")));
					
	        		Holder<SendObject> oSendObject = new Holder<SendObject>(new SendObject());
	        		ICardServiceContract cardContract = getICardService();
					cardContract.getCardVisibility(strSessionId, archiveId, documentTypeId, oFields, resultInfo, oSendObject);

					ArrayOfUser oUsers = new ArrayOfUser();
					ArrayOfGroup oGroups = new ArrayOfGroup();
					ArrayOfOffice oOffices = new ArrayOfOffice();
					
					for( SendEntity ntt : oSendObject.value.getSendEntities().getSendEntity() ) {
						if(ntt.getEntityType().equals(EntityType.USER) && ntt.getId()== userCode) {
						  if (!((SendingType.NONE).equals(ntt.getSendingType()))) {
							User user = new User();
							user.setCode(ntt.getId());
						    user.setNormalVisibility(true);
						    oUsers.getUser().add(user);
						  }
						}	
						if (ntt.getEntityType().equals(EntityType.GROUP_ENTITY)) {
						  if (!((SendingType.NONE).equals(ntt.getSendingType()))) {
						    Group group = new Group();
						    group.setCode(ntt.getId());
						    group.setNormalVisibility(true);
						    oGroups.getGroup().add(group);
						  }
						}
						if (ntt.getEntityType().equals(EntityType.OFFICE_ENTITY)) {
						  if (!((SendingType.NONE).equals(ntt.getSendingType()))) {
						    Office office = new Office();
						    office.setCode(ntt.getId());
						    office.setNormalVisibility(true);
						    oOffices.getOffice().add(office);
						  }
						}
						
//						if(ntt.getEntityType().equals(EntityType.USER)) {
//							if(!ntt.getSendingType().equals(SendingType.NONE)) {
//								User user = new User();
//								user.setCode(ntt.getId());
//							    user.setNormalVisibility(true);
//							    oUsers.getUser().add(user);
//							}						
//						}
						
					}

					cardContract.insertCard(strSessionId, newCard, oUsers, oGroups, oOffices, "new card", "card new", false, false, true, false, resultInfo2, oCardGuid);
					
					if(resultInfo2.value == ResultInfo.OK) {
						Holder<ResultInfo> cardResult = new Holder<ResultInfo>(ResultInfo.NULL);
						Holder<CardBundle> oCardBundle = new Holder<CardBundle>(new CardBundle());
						cardContract.getCardBundle(strSessionId, oCardGuid.value, false, cardResult, oCardBundle);						
						if(cardResult.value == ResultInfo.OK) {
							newCard = oCardBundle.value;
						}
					}

				} catch (ICardServiceContractInsertCardArchiflowServiceExceptionDetailFaultFaultMessage e) {
					String message = e.getFaultInfo().getSeverity().value() + "  " +
							         e.getFaultInfo().getCode() + "  " + 
					                 e.getFaultInfo().getName() + "  " + 
							         e.getFaultInfo().getMessage();
					throw new ArchiflowException(message , e);
				} catch (ICardServiceContractInsertCardInvalidSessionFaultFaultFaultMessage e) {
					String message = e.getFaultInfo().getInternalCode() + "  " + 
					                 e.getFaultInfo().getName() + "  " + 
							         e.getFaultInfo().getMessage();
					throw new ArchiflowException(message , e);
				} catch (ICardServiceContractGetCardVisibilityArchiflowServiceExceptionDetailFaultFaultMessage e) {
					String message = e.getFaultInfo().getSeverity().value() + "  " +
							         e.getFaultInfo().getCode() + "  " + 
					                 e.getFaultInfo().getName() + "  " + 
							         e.getFaultInfo().getMessage();
					throw new ArchiflowException(message , e);
				} catch (ICardServiceContractGetCardVisibilityInvalidSessionFaultFaultFaultMessage e) {
					String message = e.getFaultInfo().getInternalCode() + "  " + 
					                 e.getFaultInfo().getName() + "  " + 
							         e.getFaultInfo().getMessage();
					throw new ArchiflowException(message , e);
				} catch (ICardServiceContractGetCardBundleArchiflowServiceExceptionDetailFaultFaultMessage e) {
					String message = e.getFaultInfo().getName() + "  " + 
					         e.getFaultInfo().getMessage();
			throw new ArchiflowException(message , e);
				} catch (ICardServiceContractGetCardBundleVisibilityFaultFaultFaultMessage e) {
					String message = e.getFaultInfo().getInternalCode() + "  " + 
			                 e.getFaultInfo().getName() + "  " + 
					         e.getFaultInfo().getMessage();
			throw new ArchiflowException(message , e);
				} catch (ICardServiceContractGetCardBundleInvalidSessionFaultFaultFaultMessage e) {
					String message = e.getFaultInfo().getInternalCode() + "  " + 
			                 e.getFaultInfo().getName() + "  " + 
					         e.getFaultInfo().getMessage();
			throw new ArchiflowException(message , e);
				} catch (Exception e) {
					throw new ArchiflowException(e.getMessage() , e);
				} 
	    	
	        }			
			return newCard;	
	}
	
	public void attachDocument(String strSessionId, String cardId, WSDMProtocolloAllegato pAllegato) throws ArchiflowException {
        
        if(strSessionId != null && !strSessionId.isEmpty()) {   
        	ExternalAttachment  attachment = new ExternalAttachment();
        	
        	attachment.setCardId(cardId);
        	attachment.setCode( pAllegato.getSerial()==null ? null : pAllegato.getSerial().intValue() );
        	attachment.setName( pAllegato.getNome() );
        	attachment.setNote(pAllegato.getTitolo());
        	attachment.setContentType( pAllegato.getTipo() );
        	
        	attachment.setContent( Base64.encode(pAllegato.getContenuto() ));
        	
			try {
        		ICardServiceContract cardContract = getICardService();
				ResultInfo resulInfo = cardContract.attachDocument(strSessionId, cardId, attachment, false, false);
				
				if (resulInfo == ResultInfo.OK) {
					logger.info("attachemnt loaded..");
				}
				
			} catch (ICardServiceContractAttachDocumentArchiflowServiceExceptionDetailFaultFaultMessage e) {
				String message = e.getFaultInfo().getSeverity().value() + "  " + e.getFaultInfo().getCode() + "  " + 
		                 e.getFaultInfo().getName() + "  " + e.getFaultInfo().getMessage();
				throw new ArchiflowException(message, e);
			} catch (ICardServiceContractAttachDocumentInvalidSessionFaultFaultFaultMessage e) {
				String message = e.getFaultInfo().getName() + "  " + e.getFaultInfo().getMessage();
				throw new ArchiflowException(message, e);
			} catch (Exception e) {
				throw new ArchiflowException(e.getMessage(), e);
			}
        }
	}

	public CardBundle getCardByProtocol(String strSessionId, Long annoProtocollo, String numeroProtocollo) throws ArchiflowException {
		CardBundle resultCard = null;
        Holder<CardBundle> oCardBundle = new Holder<CardBundle>();
        Holder<ResultInfo> resultInfo = new Holder<ResultInfo>(ResultInfo.NULL);
    	Holder<ArrayOfguid> oCardIds = new Holder<ArrayOfguid>();
        
        SearchCriteria searchCriteria = new SearchCriteria();        
        
/*
        // archive
        ArrayOfArchive archives = ArrayOfArchive();
        Archive archive = Archive();
        archive.setArchiveId((short)19);
		archives.getArchive().add(archive);
		searchCriteria.setArchives( SearchCriteriaArchives(archives) );	
		// DocType
		DocumentType docType = DocumentType();
		docType.setDocumentTypeId((short)73);		
		searchCriteria.setDocumentType( DocumentType(docType ) );			
*/

        // Search Fields 
        Field field;
        
		ArrayOfField value = new ArrayOfField();
		field = new Field();	
		field.setFieldId(IdField.IF_REFERENCE);
		field.setFieldValue(numeroProtocollo );
		field.setFieldValueTo( numeroProtocollo );
		value.getField().add(field);
		
		searchCriteria.setFields(value);

		//searchCriteria.setContext(SearchContext.SC_ARCHIVE);
		searchCriteria.setSearchType(SearchType.ST_INDEXES);

		logger.info( String.format("Search card [%s, %s]", annoProtocollo, numeroProtocollo));
        try {
    		ICardServiceContract cardContract = getICardService();
			cardContract.searchCards(strSessionId, searchCriteria, resultInfo, oCardIds);
			
			if (resultInfo.value == ResultInfo.OK) {
	
				int foundSize = oCardIds.value.getGuid().size();					
				if(foundSize == 1) {
					String cardIdx = oCardIds.value.getGuid().get(0);
					cardContract.getCardBundle(strSessionId, cardIdx, false, resultInfo, oCardBundle);
					resultCard = oCardBundle.value;
				} else {
					logger.info(String.format("Found %d results", foundSize));
				}	
		    }
		
		} catch (ICardServiceContractGetCardBundleArchiflowServiceExceptionDetailFaultFaultMessage e) {
			String message = e.getFaultInfo().getSeverity().value() + "  " + e.getFaultInfo().getCode() + "  " + 
	                 e.getFaultInfo().getName() + "  " + e.getFaultInfo().getMessage();
			throw new ArchiflowException(message, e);
		} catch (ICardServiceContractGetCardBundleVisibilityFaultFaultFaultMessage e) {
			String message = e.getFaultInfo().getName() + "  " + e.getFaultInfo().getMessage();
			throw new ArchiflowException(message, e);
		} catch (ICardServiceContractGetCardBundleInvalidSessionFaultFaultFaultMessage e) {
			String message = e.getFaultInfo().getName() + "  " + e.getFaultInfo().getMessage();
			throw new ArchiflowException(message, e);
		} catch (ICardServiceContractSearchCardsArchiflowServiceExceptionDetailFaultFaultMessage e) {
			String message = e.getFaultInfo().getSeverity().value() + "  " +
			         e.getFaultInfo().getCode() + "  " + e.getFaultInfo().getName() + "  " + 
			         e.getFaultInfo().getMessage();
			throw new ArchiflowException(message, e);
		} catch (ICardServiceContractSearchCardsInvalidSessionFaultFaultFaultMessage e) {
			String message = e.getFaultInfo().getName() + "  " + e.getFaultInfo().getMessage();
			throw new ArchiflowException(message, e);
		} catch (Exception e) {
			throw new ArchiflowException(e.getMessage(), e);
		}
		return resultCard;
	}
	
	public CardBundle getCardByNumber(String strSessionId, String docNumber) throws ArchiflowException {
		CardBundle resultCard = null;
        Holder<CardBundle> oCardBundle = new Holder<CardBundle>();
        Holder<ResultInfo> resultInfo = new Holder<ResultInfo>(ResultInfo.NULL);
    	Holder<ArrayOfguid> oCardIds = new Holder<ArrayOfguid>();
        
        SearchCriteria searchCriteria = new SearchCriteria();
        
        // set protocol number
        Long documentNumber = new Long(docNumber);
		searchCriteria.setCardProgFrom(documentNumber);
		searchCriteria.setCardProgTo(documentNumber);

		logger.info( String.format("Search card number %s", docNumber));
        try {   		
    		ICardServiceContract cardContract = getICardService();
			cardContract.searchCards(strSessionId, searchCriteria, resultInfo, oCardIds);
			
			if (resultInfo.value == ResultInfo.OK) {
				
				int foundSize = oCardIds.value.getGuid().size();					
				if(foundSize == 1) {
					String cardIdx = oCardIds.value.getGuid().get(0);
					cardContract.getCardBundle(strSessionId, cardIdx, false, resultInfo, oCardBundle);
					resultCard = oCardBundle.value;
				} else {
					logger.info( String.format("Found %d results", foundSize));
				}
		    }
			
		} catch (ICardServiceContractGetCardBundleArchiflowServiceExceptionDetailFaultFaultMessage e) {
			String message = e.getFaultInfo().getSeverity().value() + "  " + e.getFaultInfo().getCode() + "  " + 
	                 e.getFaultInfo().getName() + "  " + e.getFaultInfo().getMessage();
			throw new ArchiflowException(message, e);
		} catch (ICardServiceContractGetCardBundleVisibilityFaultFaultFaultMessage e) {
			String message = e.getFaultInfo().getName() + "  " + e.getFaultInfo().getMessage();
			throw new ArchiflowException(message, e);
		} catch (ICardServiceContractGetCardBundleInvalidSessionFaultFaultFaultMessage e) {
			String message = e.getFaultInfo().getName() + "  " + e.getFaultInfo().getMessage();
			throw new ArchiflowException(message, e);
		} catch (ICardServiceContractSearchCardsArchiflowServiceExceptionDetailFaultFaultMessage e) {
			String message = e.getFaultInfo().getSeverity().value() + "  " +
			         e.getFaultInfo().getCode() + "  " + e.getFaultInfo().getName() + "  " + 
			         e.getFaultInfo().getMessage();
			throw new ArchiflowException(message, e);
		} catch (ICardServiceContractSearchCardsInvalidSessionFaultFaultFaultMessage e) {
			String message = e.getFaultInfo().getName() + "  " + e.getFaultInfo().getMessage();
			throw new ArchiflowException(message, e);
		} catch (Exception e) {
			throw new ArchiflowException(e.getMessage(), e);
		}
		return resultCard;	
	}

	public CardBundle getCardById(String strSessionId, String cardId) throws ArchiflowException {
		Holder<ResultInfo> resultInfo = null;
		Holder<CardBundle> oCardBundle 	= new Holder<CardBundle>(new CardBundle());
		try {
    		ICardServiceContract cardContract = getICardService();
			cardContract.getCardBundle(strSessionId, cardId, false, resultInfo, oCardBundle);
		} catch (ICardServiceContractGetCardBundleArchiflowServiceExceptionDetailFaultFaultMessage e) {
			String message = e.getFaultInfo().getName() + "  " + e.getFaultInfo().getMessage();
			throw new ArchiflowException(message, e);
		} catch (ICardServiceContractGetCardBundleVisibilityFaultFaultFaultMessage e) {
			String message = e.getFaultInfo().getName() + "  " + e.getFaultInfo().getMessage();
			throw new ArchiflowException(message, e);
		} catch (ICardServiceContractGetCardBundleInvalidSessionFaultFaultFaultMessage e) {
			String message = e.getFaultInfo().getName() + "  " + e.getFaultInfo().getMessage();
			throw new ArchiflowException(message, e);
		} catch (Exception e) {
			throw new ArchiflowException(e.getMessage(), e);
		}
		return oCardBundle.value;
	}

}
