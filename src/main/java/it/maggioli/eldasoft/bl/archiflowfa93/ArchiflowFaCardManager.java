package it.maggioli.eldasoft.bl.archiflowfa93;

import it.archiflow93.ArrayOfClassificationFolder;
import it.archiflow93.ArrayOfField;
import it.archiflow93.ArrayOfGroup;
import it.archiflow93.ArrayOfOffice;
import it.archiflow93.ArrayOfUser;
import it.archiflow93.ArrayOfguid;
import it.archiflow93.ArrayOfint;
import it.archiflow93.Card;
import it.archiflow93.CardBundle;
import it.archiflow93.CardService;
import it.archiflow93.ClassificationFolder;
import it.archiflow93.Document;
import it.archiflow93.EntityType;
import it.archiflow93.ExternalAttachment;
import it.archiflow93.Field;
import it.archiflow93.Group;
import it.archiflow93.ICardServiceContract;
import it.archiflow93.ICardServiceContractAttachDocumentArchiflowServiceExceptionDetailFaultFaultMessage;
import it.archiflow93.ICardServiceContractAttachDocumentInvalidSessionFaultFaultFaultMessage;
import it.archiflow93.ICardServiceContractGetCardBundleArchiflowServiceExceptionDetailFaultFaultMessage;
import it.archiflow93.ICardServiceContractGetCardBundleInvalidSessionFaultFaultFaultMessage;
import it.archiflow93.ICardServiceContractGetCardBundleVisibilityFaultFaultFaultMessage;
import it.archiflow93.ICardServiceContractGetCardVisibilityArchiflowServiceExceptionDetailFaultFaultMessage;
import it.archiflow93.ICardServiceContractGetCardVisibilityInvalidSessionFaultFaultFaultMessage;
import it.archiflow93.ICardServiceContractImportDocumentArchiflowServiceExceptionDetailFaultFaultMessage;
import it.archiflow93.ICardServiceContractImportDocumentInvalidSessionFaultFaultFaultMessage;
import it.archiflow93.ICardServiceContractInsertCardArchiflowServiceExceptionDetailFaultFaultMessage;
import it.archiflow93.ICardServiceContractInsertCardInvalidSessionFaultFaultFaultMessage;
import it.archiflow93.ICardServiceContractSearchCardsArchiflowServiceExceptionDetailFaultFaultMessage;
import it.archiflow93.ICardServiceContractSearchCardsInvalidSessionFaultFaultFaultMessage;
import it.archiflow93.IdField;
import it.archiflow93.Office;
import it.archiflow93.ResultInfo;
import it.archiflow93.SearchCriteria;
import it.archiflow93.SearchType;
import it.archiflow93.SendEntity;
import it.archiflow93.SendObject;
import it.archiflow93.SendingType;
import it.archiflow93.User;
import it.maggioli.eldasoft.bl.IWSDMManager;
import it.maggioli.eldasoft.ws.dm.WSDMProtocolloAllegato;

import java.util.List;

import javax.naming.InitialContext;
import javax.xml.ws.Holder;

import org.apache.axis.encoding.Base64;
import org.apache.cxf.endpoint.Client;
import org.apache.cxf.frontend.ClientProxy;
import org.apache.cxf.message.Message;

import com.sun.istack.logging.Logger;

public class ArchiflowFaCardManager {

  static private String ARCHIFLOWFA_WS_CARD = "java:comp/env/ARCHIFLOWFA_WS_CARD";

  private short         userCode;

  public void setUserCode(short pUserCode) {
    userCode = pUserCode;
  }

  static Logger logger = Logger.getLogger(ArchiflowFaCardManager.class);

  /**
   * Ricava accesso al servizio. Ottiene l'oggetto ICardServiceContract.
   * 
   * @return
   * @throws Exception
   */
  private ICardServiceContract getICardService() throws Exception {
    String wsCardAddress = InitialContext.doLookup(ARCHIFLOWFA_WS_CARD);
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
   * Gestione inserimento della CardBundle.
   * 
   * L'operazione InsertCard richiede in ingresso l'oggetto complesso CardBundle
   * mentre restituisce, se l'operazione va a buon fine, il GUID identificativo
   * della card inserita. Per ricavare i successivi dettagli e' opportuno
   * richiamare l'operazione GetCard e non GetCardBundle dispendiosa perchè
   * quest'ultima restituisce anche tutti i documenti (principale ed allegati).
   * Restituisce l'oggetto Card ottenuto dall'operazione GetCard con il GUID
   * ottenuto dall'operazione InsertCard.
   * 
   * @param strSessionId
   * @param newCard
   * @param classificaFascicolo
   * @param codiceFascicolo
   * @return
   * @throws ArchiflowUniMiException
   */
  public Card insertCard(String strSessionId, CardBundle newCard, String classificaFascicolo, String codiceFascicolo)
      throws ArchiflowFaException {
    Card insertedCard = new Card();

    if (strSessionId != null && !strSessionId.isEmpty()) {

      Holder<String> oCardGuid = new Holder<String>();
      short archiveId = newCard.getArchiveId();
      short documentTypeId = newCard.getDocumentTypeId();

      // Campi indice aggiuntivi
      ArrayOfField oFields = newCard.getIndexes();
      try {

        Holder<ResultInfo> resultInfo = new Holder<ResultInfo>(ResultInfo.fromValue(("NULL")));
        Holder<ResultInfo> resultInfo2 = new Holder<ResultInfo>(ResultInfo.fromValue(("NULL")));

        Holder<SendObject> oSendObject = new Holder<SendObject>(new SendObject());
        ICardServiceContract cardContract = getICardService();

        // Gestione dei diritti di visibilita' e modifica
        // per utenti, gruppi ed uffici.
        cardContract.getCardVisibility(strSessionId, archiveId, documentTypeId, oFields, resultInfo, oSendObject);

        ArrayOfUser oUsers = new ArrayOfUser();
        ArrayOfGroup oGroups = new ArrayOfGroup();
        ArrayOfOffice oOffices = new ArrayOfOffice();

        for (SendEntity ntt : oSendObject.value.getSendEntities().getSendEntity()) {
          if (ntt.getEntityType().equals(EntityType.USER) && !ntt.getSendingType().equals(SendingType.NONE)) {
            User user = new User();
            user.setCode(ntt.getId());
            user.setNormalVisibility(true);
            if (ntt.getEntityType().equals(SendingType.MAIL)) {
              user.setSendMail(true);
            }
            oUsers.getUser().add(user);
          }
          if (ntt.getEntityType().equals(EntityType.GROUP_ENTITY) && !ntt.getSendingType().equals(SendingType.NONE)) {
            Group group = new Group();
            group.setCode(ntt.getId());
            group.setNormalVisibility(true);
            if (ntt.getEntityType().equals(SendingType.MAIL)) {
              group.setSendMail(true);
            }
            oGroups.getGroup().add(group);
          }
          if (ntt.getEntityType().equals(EntityType.OFFICE_ENTITY) && !ntt.getSendingType().equals(SendingType.NONE)) {
            Office office = new Office();
            office.setCode(ntt.getId());
            office.setNormalVisibility(true);
            if (ntt.getEntityType().equals(SendingType.MAIL)) {
              office.setSendMail(true);
            }
            oOffices.getOffice().add(office);
          }
        }

        // Gestione del fascicolo
        ArrayOfClassificationFolder aOCF = new ArrayOfClassificationFolder();
        List<ClassificationFolder> classificationFolderList = aOCF.getClassificationFolder();
        ClassificationFolder classificationFolder = new ClassificationFolder();
        if (classificaFascicolo != null) {
          classificationFolder.setClassificationId(Integer.parseInt(classificaFascicolo));
        }
        if (codiceFascicolo != null) {
          ArrayOfint aOI = new ArrayOfint();
          List listFolderIDS = aOI.getInt();
          listFolderIDS.add(Integer.parseInt(codiceFascicolo));
          classificationFolder.setFolderIds(aOI);
        }
        classificationFolderList.add(classificationFolder);
        newCard.setClassFolderList(aOCF);

        cardContract.insertCard3(strSessionId, newCard, oUsers, oGroups, oOffices, "", "", true, false, false, false, aOCF, resultInfo2,
            oCardGuid);

        if (resultInfo2.value == ResultInfo.OK) {
          Holder<ResultInfo> cardResult = new Holder<ResultInfo>(ResultInfo.NULL);
          Holder<Card> oCard = new Holder<Card>(new Card());
          cardContract.getCard(strSessionId, oCardGuid.value, cardResult, oCard);
          if (cardResult.value == ResultInfo.OK) {
            insertedCard = oCard.value;
          }
        }

      } catch (ICardServiceContractInsertCardArchiflowServiceExceptionDetailFaultFaultMessage e) {
        String message = e.getFaultInfo().getSeverity().value()
            + "  "
            + e.getFaultInfo().getCode()
            + "  "
            + e.getFaultInfo().getName()
            + "  "
            + e.getFaultInfo().getMessage();
        throw new ArchiflowFaException(message, e);
      } catch (ICardServiceContractInsertCardInvalidSessionFaultFaultFaultMessage e) {
        String message = e.getFaultInfo().getInternalCode() + "  " + e.getFaultInfo().getName() + "  " + e.getFaultInfo().getMessage();
        throw new ArchiflowFaException(message, e);
      } catch (ICardServiceContractGetCardVisibilityArchiflowServiceExceptionDetailFaultFaultMessage e) {
        String message = e.getFaultInfo().getSeverity().value()
            + "  "
            + e.getFaultInfo().getCode()
            + "  "
            + e.getFaultInfo().getName()
            + "  "
            + e.getFaultInfo().getMessage();
        throw new ArchiflowFaException(message, e);
      } catch (ICardServiceContractGetCardVisibilityInvalidSessionFaultFaultFaultMessage e) {
        String message = e.getFaultInfo().getInternalCode() + "  " + e.getFaultInfo().getName() + "  " + e.getFaultInfo().getMessage();
        throw new ArchiflowFaException(message, e);
      } catch (ICardServiceContractGetCardBundleArchiflowServiceExceptionDetailFaultFaultMessage e) {
        String message = e.getFaultInfo().getName() + "  " + e.getFaultInfo().getMessage();
        throw new ArchiflowFaException(message, e);
      } catch (ICardServiceContractGetCardBundleVisibilityFaultFaultFaultMessage e) {
        String message = e.getFaultInfo().getInternalCode() + "  " + e.getFaultInfo().getName() + "  " + e.getFaultInfo().getMessage();
        throw new ArchiflowFaException(message, e);
      } catch (ICardServiceContractGetCardBundleInvalidSessionFaultFaultFaultMessage e) {
        String message = e.getFaultInfo().getInternalCode() + "  " + e.getFaultInfo().getName() + "  " + e.getFaultInfo().getMessage();
        throw new ArchiflowFaException(message, e);
      } catch (Exception e) {
        throw new ArchiflowFaException(e.getMessage(), e);
      }

    }
    return insertedCard;
  }

  public void importDocument(String strSessionId, String cardId, WSDMProtocolloAllegato pAllegato) throws ArchiflowFaException {

    if (strSessionId != null && !strSessionId.isEmpty()) {

      Document document = new Document();

      document.setCardId(cardId);
      // document.setOriginalFileName(pAllegato.getNome());
      document.setDocumentTitle(pAllegato.getNome());
      document.setDocumentExtension(pAllegato.getTipo());
      document.setContent(Base64.encode(pAllegato.getContenuto()));

      try {
        ICardServiceContract cardContract = getICardService();
        ResultInfo resultInfo = cardContract.importDocument(strSessionId, cardId, document, true, false);

      } catch (ICardServiceContractImportDocumentArchiflowServiceExceptionDetailFaultFaultMessage e) {
        String message = e.getFaultInfo().getSeverity().value()
            + "  "
            + e.getFaultInfo().getCode()
            + "  "
            + e.getFaultInfo().getName()
            + "  "
            + e.getFaultInfo().getMessage();
        throw new ArchiflowFaException(message, e);
      } catch (ICardServiceContractImportDocumentInvalidSessionFaultFaultFaultMessage e) {
        String message = e.getFaultInfo().getName() + "  " + e.getFaultInfo().getMessage();
        throw new ArchiflowFaException(message, e);
      } catch (Exception e) {
        throw new ArchiflowFaException(e.getMessage(), e);
      }
    }
  }

  public void attachDocument(String strSessionId, String cardId, WSDMProtocolloAllegato pAllegato) throws ArchiflowFaException {

    if (strSessionId != null && !strSessionId.isEmpty()) {
      ExternalAttachment attachment = new ExternalAttachment();

      attachment.setCardId(cardId);
      attachment.setName(pAllegato.getNome());
      attachment.setNote(pAllegato.getTitolo());
      // attachment.setContentType(pAllegato.getTipo());
      // attachment.setExtension(pAllegato.getTipo());

      attachment.setContent(Base64.encode(pAllegato.getContenuto()));

      try {
        ICardServiceContract cardContract = getICardService();
        ResultInfo resulInfo = cardContract.attachDocument(strSessionId, cardId, attachment, false, false);

      } catch (ICardServiceContractAttachDocumentArchiflowServiceExceptionDetailFaultFaultMessage e) {
        String message = e.getFaultInfo().getSeverity().value()
            + "  "
            + e.getFaultInfo().getCode()
            + "  "
            + e.getFaultInfo().getName()
            + "  "
            + e.getFaultInfo().getMessage();
        throw new ArchiflowFaException(message, e);
      } catch (ICardServiceContractAttachDocumentInvalidSessionFaultFaultFaultMessage e) {
        String message = e.getFaultInfo().getName() + "  " + e.getFaultInfo().getMessage();
        throw new ArchiflowFaException(message, e);
      } catch (Exception e) {
        throw new ArchiflowFaException(e.getMessage(), e);
      }
    }
  }

  public CardBundle getCardByProtocol(String strSessionId, Long annoProtocollo, String numeroProtocollo) throws ArchiflowFaException {
    CardBundle resultCard = null;
    Holder<CardBundle> oCardBundle = new Holder<CardBundle>();
    Holder<ResultInfo> resultInfo = new Holder<ResultInfo>(ResultInfo.NULL);
    Holder<ArrayOfguid> oCardIds = new Holder<ArrayOfguid>();

    SearchCriteria searchCriteria = new SearchCriteria();

    /*
     * // archive ArrayOfArchive archives = ArrayOfArchive(); Archive archive =
     * Archive(); archive.setArchiveId((short)19);
     * archives.getArchive().add(archive); searchCriteria.setArchives(
     * SearchCriteriaArchives(archives) ); // DocType DocumentType docType =
     * DocumentType(); docType.setDocumentTypeId((short)73);
     * searchCriteria.setDocumentType( DocumentType(docType ) );
     */

    // Search Fields
    Field field;

    ArrayOfField value = new ArrayOfField();
    field = new Field();
    field.setFieldId(IdField.IF_REFERENCE);
    field.setFieldValue(numeroProtocollo);
    field.setFieldValueTo(numeroProtocollo);
    value.getField().add(field);

    searchCriteria.setFields(value);

    // searchCriteria.setContext(SearchContext.SC_ARCHIVE);
    searchCriteria.setSearchType(SearchType.ST_INDEXES);

    logger.info(String.format("Search card [%s, %s]", annoProtocollo, numeroProtocollo));
    try {
      ICardServiceContract cardContract = getICardService();
      cardContract.searchCards(strSessionId, searchCriteria, resultInfo, oCardIds);

      if (resultInfo.value == ResultInfo.OK) {

        int foundSize = oCardIds.value.getGuid().size();
        if (foundSize == 1) {
          String cardIdx = oCardIds.value.getGuid().get(0);
          cardContract.getCardBundle(strSessionId, cardIdx, false, resultInfo, oCardBundle);
          resultCard = oCardBundle.value;
        } else {
          logger.info(String.format("Found %d results", foundSize));
        }
      }

    } catch (ICardServiceContractGetCardBundleArchiflowServiceExceptionDetailFaultFaultMessage e) {
      String message = e.getFaultInfo().getSeverity().value()
          + "  "
          + e.getFaultInfo().getCode()
          + "  "
          + e.getFaultInfo().getName()
          + "  "
          + e.getFaultInfo().getMessage();
      throw new ArchiflowFaException(message, e);
    } catch (ICardServiceContractGetCardBundleVisibilityFaultFaultFaultMessage e) {
      String message = e.getFaultInfo().getName() + "  " + e.getFaultInfo().getMessage();
      throw new ArchiflowFaException(message, e);
    } catch (ICardServiceContractGetCardBundleInvalidSessionFaultFaultFaultMessage e) {
      String message = e.getFaultInfo().getName() + "  " + e.getFaultInfo().getMessage();
      throw new ArchiflowFaException(message, e);
    } catch (ICardServiceContractSearchCardsArchiflowServiceExceptionDetailFaultFaultMessage e) {
      String message = e.getFaultInfo().getSeverity().value()
          + "  "
          + e.getFaultInfo().getCode()
          + "  "
          + e.getFaultInfo().getName()
          + "  "
          + e.getFaultInfo().getMessage();
      throw new ArchiflowFaException(message, e);
    } catch (ICardServiceContractSearchCardsInvalidSessionFaultFaultFaultMessage e) {
      String message = e.getFaultInfo().getName() + "  " + e.getFaultInfo().getMessage();
      throw new ArchiflowFaException(message, e);
    } catch (Exception e) {
      throw new ArchiflowFaException(e.getMessage(), e);
    }
    return resultCard;
  }

  /**
   * Ricerca dell'elemento documentale protocollato in funzione del numero di
   * documento
   * 
   * @param strSessionId
   * @param docNumber
   * @return
   * @throws ArchiflowFaException
   */
  public CardBundle getCardByNumber(String strSessionId, String docNumber) throws ArchiflowFaException {
    CardBundle resultCard = null;
    Holder<CardBundle> oCardBundle = new Holder<CardBundle>();
    Holder<ResultInfo> resultInfo = new Holder<ResultInfo>(ResultInfo.NULL);
    Holder<ArrayOfguid> oCardIds = new Holder<ArrayOfguid>();

    SearchCriteria searchCriteria = new SearchCriteria();

    Long documentNumber = new Long(docNumber);
    searchCriteria.setCardProgFrom(documentNumber);
    searchCriteria.setCardProgTo(documentNumber);

    logger.info(String.format("Search card number %s", docNumber));
    try {
      ICardServiceContract cardContract = getICardService();
      cardContract.searchCards(strSessionId, searchCriteria, resultInfo, oCardIds);

      if (resultInfo.value == ResultInfo.OK) {

        int foundSize = oCardIds.value.getGuid().size();
        if (foundSize == 1) {
          String cardIdx = oCardIds.value.getGuid().get(0);
          cardContract.getCardBundle(strSessionId, cardIdx, false, resultInfo, oCardBundle);
          resultCard = oCardBundle.value;
        } else {
          logger.info(String.format("Found %d results", foundSize));
        }
      }

    } catch (ICardServiceContractGetCardBundleArchiflowServiceExceptionDetailFaultFaultMessage e) {
      String message = e.getFaultInfo().getSeverity().value()
          + "  "
          + e.getFaultInfo().getCode()
          + "  "
          + e.getFaultInfo().getName()
          + "  "
          + e.getFaultInfo().getMessage();
      throw new ArchiflowFaException(message, e);
    } catch (ICardServiceContractGetCardBundleVisibilityFaultFaultFaultMessage e) {
      String message = e.getFaultInfo().getName() + "  " + e.getFaultInfo().getMessage();
      throw new ArchiflowFaException(message, e);
    } catch (ICardServiceContractGetCardBundleInvalidSessionFaultFaultFaultMessage e) {
      String message = e.getFaultInfo().getName() + "  " + e.getFaultInfo().getMessage();
      throw new ArchiflowFaException(message, e);
    } catch (ICardServiceContractSearchCardsArchiflowServiceExceptionDetailFaultFaultMessage e) {
      String message = e.getFaultInfo().getSeverity().value()
          + "  "
          + e.getFaultInfo().getCode()
          + "  "
          + e.getFaultInfo().getName()
          + "  "
          + e.getFaultInfo().getMessage();
      throw new ArchiflowFaException(message, e);
    } catch (ICardServiceContractSearchCardsInvalidSessionFaultFaultFaultMessage e) {
      String message = e.getFaultInfo().getName() + "  " + e.getFaultInfo().getMessage();
      throw new ArchiflowFaException(message, e);
    } catch (Exception e) {
      throw new ArchiflowFaException(e.getMessage(), e);
    }
    return resultCard;
  }

  public CardBundle getCardById(String strSessionId, String cardId) throws ArchiflowFaException {
    Holder<ResultInfo> resultInfo = null;
    Holder<CardBundle> oCardBundle = new Holder<CardBundle>(new CardBundle());
    try {
      ICardServiceContract cardContract = getICardService();
      cardContract.getCardBundle(strSessionId, cardId, false, resultInfo, oCardBundle);
    } catch (ICardServiceContractGetCardBundleArchiflowServiceExceptionDetailFaultFaultMessage e) {
      String message = e.getFaultInfo().getName() + "  " + e.getFaultInfo().getMessage();
      throw new ArchiflowFaException(message, e);
    } catch (ICardServiceContractGetCardBundleVisibilityFaultFaultFaultMessage e) {
      String message = e.getFaultInfo().getName() + "  " + e.getFaultInfo().getMessage();
      throw new ArchiflowFaException(message, e);
    } catch (ICardServiceContractGetCardBundleInvalidSessionFaultFaultFaultMessage e) {
      String message = e.getFaultInfo().getName() + "  " + e.getFaultInfo().getMessage();
      throw new ArchiflowFaException(message, e);
    } catch (Exception e) {
      throw new ArchiflowFaException(e.getMessage(), e);
    }
    return oCardBundle.value;
  }

  /**
   * Invio mail mediante servizio Card.svc (operazione send.card).
   * 
   * @param strSessionId
   * @param cardId
   * @param mittente
   * @param destinatari
   * @param oggettoMail
   * @param testoMail
   * @throws Exception
   */
  public void sendCard(String strSessionId, String cardId, String mittente, String[] destinatari, String oggettoMail, String testoMail)
      throws Exception {

    ICardServiceContract cardContract = getICardService();

    short userCode = 0;

    // Destinatari
    ArrayOfUser arrayOfUser = new ArrayOfUser();
    List<User> listUser = arrayOfUser.getUser();
    for (int d = 0; d < destinatari.length; d++) {
      User user = new User();
      user.setCode(userCode);
      user.setEmail(destinatari[d]);
      user.setNormalVisibility(true);
      user.setSendMail(true);
      listUser.add(user);
    }

    cardContract.sendCard(strSessionId, cardId, arrayOfUser, null, null, oggettoMail, testoMail, false, true);

  }

}
