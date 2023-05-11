package it.maggioli.eldasoft.bl.archiflowfa;

import it.archiflow93.ArrayOfAttachment;
import it.archiflow93.ArrayOfField;
import it.archiflow93.Attachment;
import it.archiflow93.Card;
import it.archiflow93.CardBundle;
import it.archiflow93.CardStatus;
import it.archiflow93.DataType;
import it.archiflow93.ExternalAttachment;
import it.archiflow93.Field;
import it.archiflow93.Folder;
import it.archiflow93.IdField;
import it.maggioli.eldasoft.bl.archiflow.ArchiflowException;
import it.maggioli.eldasoft.ws.dm.WSDMFascicolo;
import it.maggioli.eldasoft.ws.dm.WSDMFascicoloDocumento;
import it.maggioli.eldasoft.ws.dm.WSDMProtocolloAllegato;
import it.maggioli.eldasoft.ws.dm.WSDMProtocolloDocumento;
import it.maggioli.eldasoft.ws.dm.WSDMProtocolloDocumentoIn;
import it.maggioli.eldasoft.ws.dm.WSDMProtocolloInOut;

import java.beans.IntrospectionException;
import java.beans.PropertyDescriptor;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.Date;
import java.util.GregorianCalendar;
import java.util.HashMap;
import java.util.Map;

import org.apache.log4j.Logger;
import org.apache.xmlbeans.impl.util.Base64;

/**
 * ArchiflowInterfaceManager implements modules able to manage document
 * interfaces: Archiflow -> WSDMDocument Archiflow <- WSDMDocument
 * 
 * @author Niuma
 * 
 */
public class ArchiflowFaInterfaceManager {

  static Logger                logger               = Logger.getLogger(ArchiflowFaInterfaceManager.class);

  public static final String   MAIL_SEPARATOR       = ";";

  private String               iftErrorMsg          = "";

  private Map<String, Integer> ArchiflowDocumentMap = new HashMap<String, Integer>();

  public void setArchiflowDocumentMap(Map<String, Integer> archiflowDocumentMap) {
    ArchiflowDocumentMap = archiflowDocumentMap;
  }

  public void setWsdmDocumentMap(Map<Short, String> wsdmDocumentMap) {
    this.wsdmDocumentMap = wsdmDocumentMap;
  }

  public void setArchiflowArchiveMap(Map<String, Integer> archiflowArchiveMap) {
    ArchiflowArchiveMap = archiflowArchiveMap;
  }

  public void setWsdmArchiveMap(Map<Integer, String> wsdmArchiveMap) {
    this.wsdmArchiveMap = wsdmArchiveMap;
  }

  public void setArchiflowDocumentIndexMap(Map<String, Map<String, String>> archiflowDocumentIndexMap) {
    ArchiflowDocumentIndexMap = archiflowDocumentIndexMap;
  }

  public void setWsdmDocumentIndexMap(Map<String, Map<String, String>> wsdmDocumentIndexMap) {
    this.wsdmDocumentIndexMap = wsdmDocumentIndexMap;
  }

  public void setArchiflowDocumentTypeMap(Map<String, Map<String, String>> archiflowDocumentTypeMap) {
    ArchiflowDocumentTypeMap = archiflowDocumentTypeMap;
  }

  public void setWsdmDocumentTypeMap(Map<String, Map<String, String>> wsdmDocumentTypeMap) {
    this.wsdmDocumentTypeMap = wsdmDocumentTypeMap;
  }

  private Map<Short, String>               wsdmDocumentMap          = new HashMap<Short, String>();

  private Map<String, Integer>             ArchiflowArchiveMap      = new HashMap<String, Integer>();
  private Map<Integer, String>             wsdmArchiveMap           = new HashMap<Integer, String>();

  /**
   * map archiflow_index <-> swdm_document
   * 
   * @see org.datacontract.schemas._2004._07.siav_archiflow_entities.IdField
   * */
  private Map<String, Map<String, String>> ArchiflowDocumentIndexMap;
  private Map<String, Map<String, String>> wsdmDocumentIndexMap;

  /**
   * map archiflow_indexType <-> swdm_documentType
   * 
   * @see org.datacontract.schemas._2004._07.siav_archiflow_entities.DataType
   * */
  private Map<String, Map<String, String>> ArchiflowDocumentTypeMap = new HashMap<String, Map<String, String>>();
  private Map<String, Map<String, String>> wsdmDocumentTypeMap      = new HashMap<String, Map<String, String>>();

  private SimpleDateFormat                 sdf                      = new SimpleDateFormat("dd/MM/yyyy");

  /**
   * Build a Archiflow.Entities.CardBundle from WSDMProtocolloDocumento
   * 
   * @param wsdmProtocolloDocumentoIn
   * @return
   * @throws ArchiflowException
   */
  public CardBundle buildCard(WSDMProtocolloDocumentoIn wsdmProtocolloDocumentoIn) throws ArchiflowFaException {
    String wsdmDocumentType;
    if (wsdmProtocolloDocumentoIn.getInout() == null) {
      iftErrorMsg = "Invalid WSDMProtocolloInOut attribute";
      logger.error(iftErrorMsg);
      return null;
    } else {
      wsdmDocumentType = wsdmProtocolloDocumentoIn.getInout().name();
    }

    CardBundle newCard = new CardBundle();

    // Decode and setDocumentTypeId
    Integer ArchiflowIndexDocumentVal = ArchiflowDocumentMap.get(wsdmDocumentType);
    if (ArchiflowIndexDocumentVal == null) {
      iftErrorMsg = "Archiflow Document undefined for type "
          + wsdmDocumentType
          + ". Configured document are "
          + ArchiflowDocumentMap.keySet();
      logger.error(iftErrorMsg);
      return null;
    } else {
      newCard.setDocumentTypeId(ArchiflowIndexDocumentVal.shortValue());
    }

    // Decode and setArchiveId
    Integer ArchiflowIndexArchiveVal = ArchiflowArchiveMap.get(wsdmDocumentType);
    if (ArchiflowIndexArchiveVal == null) {
      iftErrorMsg = "Archiflow Archive undefined for type " + wsdmDocumentType + ". Configured archive are " + ArchiflowArchiveMap.keySet();
      ;
      logger.error(iftErrorMsg);
      return null;
    } else {
      newCard.setArchiveId(ArchiflowIndexArchiveVal.shortValue());
    }

    newCard.setHasAdditionalData(false);
    newCard.setHasDocument(false);
    newCard.setHasFolder(false);
    newCard.setHasKeyVersions(false);
    newCard.setHasNotes(false);
    newCard.setStatus(CardStatus.STANDARD);

    // set the card indexes
    ArrayOfField oFieldsArray = new ArrayOfField();

    // mapping by reflection
    logger.info("Build Archiflow Card : ");
    Map<String, String> indexList = ArchiflowDocumentIndexMap.get(wsdmDocumentType);
    Map<String, String> indexTypeList = ArchiflowDocumentTypeMap.get(wsdmDocumentType);

    for (String property : indexList.keySet()) {
      // String property = val.name();
      String ArchiflowIndexRef = indexList.get(property);
      String ArchiflowIndexTypeRef = indexTypeList.get(property);
      if (ArchiflowIndexRef != null) {
        PropertyDescriptor propertyDescriptor = null;
        for (java.lang.reflect.Field field : WSDMProtocolloDocumentoIn.class.getDeclaredFields()) {
          if (field.getName().equals(property)) {
            try {
              propertyDescriptor = new PropertyDescriptor(field.getName(), WSDMProtocolloDocumentoIn.class);
            } catch (IntrospectionException e) {
              logger.info(e.getMessage());
            }
          }
        }
        if (propertyDescriptor != null) {
          Method method = propertyDescriptor.getReadMethod();
          Object inputValue = null;
          try {
            inputValue = method.invoke(wsdmProtocolloDocumentoIn);
          } catch (IllegalAccessException e1) {
            throw new ArchiflowFaException(e1.getMessage());
          } catch (IllegalArgumentException e1) {
            throw new ArchiflowFaException(e1.getMessage());
          } catch (InvocationTargetException e1) {
            throw new ArchiflowFaException(e1.getMessage());
          }

          Field oField = new Field();
          oField.setFieldId(IdField.valueOf(ArchiflowIndexRef));

          if (inputValue == null) {
            oField.setFieldValue(null);
          } else {

            if (ArchiflowIndexTypeRef == null) {
              logger.info("   Undefined type for property " + property);
              oField.setFieldDataType(DataType.DT_STRING);
            } else {
              try {
                DataType dataType = DataType.valueOf(ArchiflowIndexTypeRef);
                oField.setFieldDataType(dataType);
                String msg = "";
                switch (dataType) {
                case DT_STRING:
                  oField.setFieldValue((String) inputValue);
                  msg = String.format(" setting property %s  ---> %s   type: %s   value [%s]", property, ArchiflowIndexRef,
                      ArchiflowIndexTypeRef, inputValue);
                  break;
                case DT_DATE:
                  String dVal = sdf.format((Date) inputValue);
                  oField.setFieldValue(dVal);
                  msg = String.format(" setting property %s  ---> %s   type: %s   value [%s]", property, ArchiflowIndexRef,
                      ArchiflowIndexTypeRef, dVal);
                  break;
                case DT_NUMERIC:
                  Long lVal = (Long) inputValue;
                  oField.setFieldValue(lVal + "");
                  msg = String.format(" setting property %s  ---> %s   type: %s   value [%d]", property, ArchiflowIndexRef,
                      ArchiflowIndexTypeRef, lVal);
                  break;

                default:
                  logger.info(" invalid dataType");

                }
                logger.info(msg);
              } catch (IllegalArgumentException e) {
                logger.info(String.format("   [%s] is an invalid value for property '%s' of type %s", inputValue.toString(), property,
                    ArchiflowIndexTypeRef));
                oField.setFieldDataType(DataType.DT_STRING);
              } catch (ClassCastException e) {
                logger.info(String.format("   [%s] is an invalid value for property '%s' of type %s", inputValue.toString(), property,
                    ArchiflowIndexTypeRef));
              }
            }
          }

          oField.setDocumentTypeId(ArchiflowIndexDocumentVal.shortValue());
          oFieldsArray.getField().add(oField);

        } else {
          logger.info("  property :" + property + " not found in WSDMProtocolloDocumentoIn");
        }
      }
    }

    newCard.setIndexes(oFieldsArray);

    // Gestione del documento principale (si considera il primo della lista)
//    if (wsdmProtocolloDocumentoIn.getAllegati() != null) {
//      WSDMProtocolloAllegato[] allegati = wsdmProtocolloDocumentoIn.getAllegati();
//      WSDMProtocolloAllegato allegato = allegati[0];
//      Document documentoPrincipale = new Document();
//      documentoPrincipale.setDocumentTitle(allegato.getTitolo());
//      documentoPrincipale.setDocumentExtension(allegato.getTipo());
//      documentoPrincipale.setOriginalFileName(allegato.getNome());
//      documentoPrincipale.setContent(new String(org.apache.axis.encoding.Base64.encode(allegato.getContenuto())));
//      newCard.setMainDocument(documentoPrincipale);
//    }

    return newCard;
  }

  /**
   * Retrieve Archiflow.Field from Card.Index by idField
   * 
   * @param fieldId
   * @param pIndexes
   * @return Archiflow.Field
   */
  public Field getIndex(IdField fieldId, ArrayOfField pIndexes) {
    Field resultField = new Field();
    resultField.setFieldId(IdField.UNKNOWN);
    resultField.setFieldValue("");
    if (fieldId == null || pIndexes == null) {
      return resultField;
    }
    for (Field index : pIndexes.getField()) {
      if (index.getFieldId().equals(fieldId)) {
        resultField = index;
        break;
      }
    }
    return resultField;
  }

  /**
   * Builds the WSDMProtocolloDocumento instance from CardBundle object.
   * 
   * @param ArchiflowCardBundle
   *        Archiflow.Entities.CardBundle
   * @return eldasoft.ws.dm.WSDMProtocolloDocumento
   */
  public WSDMProtocolloDocumento getWSDMProtocolloDocumento(CardBundle ArchiflowCardBundle, boolean setDataProtocolloOdierna) {
    WSDMProtocolloDocumento wsdmProtocollo = new WSDMProtocolloDocumento();

    logger.info("Build WSDMProtocollo : ");
    if (ArchiflowCardBundle != null) {
      ArrayOfField indexes = ArchiflowCardBundle.getIndexes();

      // wsdmArchiveMap.get(ArchiflowCardBundle.getArchiveId());
      String wsdmType = wsdmDocumentMap.get(ArchiflowCardBundle.getDocumentTypeId());
      if (wsdmType == null) {
        logger.error(" getWSDMProtocolloDocumento : unknown documentId " + ArchiflowCardBundle.getDocumentTypeId());
        iftErrorMsg = " Error : Unknown documentId " + ArchiflowCardBundle.getDocumentTypeId();
        iftErrorMsg = iftErrorMsg + ". Configured ids are " + wsdmDocumentMap.keySet();
        return null;
      }
      WSDMProtocolloInOut wSDMProtocolloInOut = WSDMProtocolloInOut.valueOf(wsdmType);
      wsdmProtocollo.setInout(wSDMProtocolloInOut);

      wsdmProtocollo.setNumeroDocumento(ArchiflowCardBundle.getCardProg().toString());
      wsdmProtocollo.setNumeroProtocollo(ArchiflowCardBundle.getProgressive());

      Calendar protDate = null;
      try {
        protDate = new GregorianCalendar();
        protDate.setTime(sdf.parse(getIndex(IdField.IF_DATE_REG, indexes).getFieldValue()));
        wsdmProtocollo.setAnnoProtocollo(new Long(protDate.get(Calendar.YEAR)));
        if (setDataProtocolloOdierna == true) {
          // 08/02/2018 - La data e l'ora del protocollo viene impostata con la
          // data e l'ora corrente di sistema
          Calendar dataProtocolloToday = Calendar.getInstance();
          wsdmProtocollo.setDataProtocollo(dataProtocolloToday.getTime());
        } else {
          wsdmProtocollo.setDataProtocollo(protDate.getTime());
        }

      } catch (ParseException e) {
        logger.error("DATE");
      }
      wsdmProtocollo.setIdDocumento(ArchiflowCardBundle.getCardId());

      // Get indexes
      Map<String, String> indexList = ArchiflowDocumentIndexMap.get(wsdmType);
      Map<String, String> indexTypeList = ArchiflowDocumentTypeMap.get(wsdmType);
      for (String property : indexList.keySet()) {
        String ArchiflowIndexRef = indexList.get(property);
        String ArchiflowIndexTypeRef = indexTypeList.get(property);
        logger.info(String.format(" setting key %s ---> %s   type: %s ", ArchiflowIndexRef, property, ArchiflowIndexTypeRef));
        if (ArchiflowIndexRef != null) {
          PropertyDescriptor propertyDescriptor = null;
          for (java.lang.reflect.Field field : WSDMProtocolloDocumentoIn.class.getDeclaredFields()) {
            if (field.getName().equals(property)) {
              try {
                propertyDescriptor = new PropertyDescriptor(field.getName(), WSDMProtocolloDocumento.class);
              } catch (IntrospectionException e) {
                logger.info(e.getMessage());
              }
            }
          }
          if (propertyDescriptor != null) {
            Field field = getIndex(IdField.valueOf(ArchiflowIndexRef), indexes);
            String fieldValue = field.getFieldValue();
            Method method = propertyDescriptor.getWriteMethod();
            try {
              switch (field.getFieldDataType()) {
              case DT_STRING:
                method.invoke(wsdmProtocollo, fieldValue);
                break;
              case DT_DATE:
                Date dBindValue = (Date) (sdf.parse(fieldValue));
                method.invoke(wsdmProtocollo, dBindValue);
                break;
              case DT_NUMERIC:
                Long lBindValue = Long.parseLong(fieldValue);
                method.invoke(wsdmProtocollo, lBindValue);
                break;

              default:
                logger.info(" invalid dataType");
              }

            } catch (IllegalAccessException e) {
              logger.info(String.format("   invalid bind of %s=%s of type %s for '%s'", ArchiflowIndexRef, fieldValue,
                  field.getFieldDataType().name(), property));
            } catch (IllegalArgumentException e) {
              logger.info(String.format("   invalid bind of %s=%s of type %s for '%s'", ArchiflowIndexRef, fieldValue,
                  field.getFieldDataType().name(), property));
            } catch (InvocationTargetException e) {
              logger.info(String.format("   invalid bind of %s=%s of type %s for '%s'", ArchiflowIndexRef, fieldValue,
                  field.getFieldDataType().name(), property));
            } catch (ParseException e) {
              logger.info(String.format("   invalid bind of %s=%s of type %s for '%s'", ArchiflowIndexRef, fieldValue,
                  field.getFieldDataType().name(), property));
            }
          }
        }
      }

      // ATTACHMENT
      if (ArchiflowCardBundle.isHasAttachment()) {
        ArrayOfAttachment attachArray = ArchiflowCardBundle.getAttachments();

        WSDMProtocolloAllegato[] wsdmAllegatiArray = new WSDMProtocolloAllegato[attachArray.getAttachment().size()];

        for (int i = 0; i < attachArray.getAttachment().size(); i++) {
          Attachment attachObj = attachArray.getAttachment().get(i);
          if (attachObj instanceof ExternalAttachment) {
            ExternalAttachment attachment = (ExternalAttachment) attachObj;
            WSDMProtocolloAllegato wsdmAllegato = new WSDMProtocolloAllegato();

            wsdmAllegato.setSerial(new Long(attachment.getCode()));
            wsdmAllegato.setNome(attachment.getName());
            wsdmAllegato.setContenuto(Base64.decode(attachment.getContent().getBytes()));
            wsdmAllegato.setTipo(attachment.getContentType());
            wsdmAllegato.setTitolo(attachment.getNote());
            // protocolloAllegato.setVersione(versione);

            wsdmAllegatiArray[i] = wsdmAllegato;
          }
        }
        wsdmProtocollo.setAllegati(wsdmAllegatiArray);
      }
      /*
       * for(String index :mittentiDestinatariIndexList.keySet()) { Field f =
       * getIndex(IdField.valueOf(index), indexes); String mailString =
       * f.getFieldValue(); String[] mailArray =
       * mailString.split(MAIL_SEPARATOR); WSDMProtocolloAnagrafica[] mittenti =
       * new WSDMProtocolloAnagrafica[mailArray.length]; int idx = 0; for(String
       * mail : mailArray) { WSDMProtocolloAnagrafica anagrafica = new
       * WSDMProtocolloAnagrafica(); anagrafica.setEmail(mail);
       * mittenti[idx]=anagrafica; } wsdmProtocollo.setMittenti(mittenti); }
       */
    }
    return wsdmProtocollo;
  }

  /**
   * Ricava i dati minimi dall'oggetto Card (non CardBundle). Numero ed data o
   * anno protocollo. Indici utilizzati
   * 
   * @param card
   * @param setDataProtocolloOdierna
   * @return
   */
  public WSDMProtocolloDocumento getWSDMProtocolloDocumentoFromCard(Card card, boolean setDataProtocolloOdierna) {
    WSDMProtocolloDocumento wsdmProtocolloDocumento = new WSDMProtocolloDocumento();

    logger.info("Build WSDMProtocollo : ");
    if (card != null) {
      ArrayOfField indexes = card.getIndexes();

      String wsdmType = wsdmDocumentMap.get(card.getDocumentTypeId());
      if (wsdmType == null) {
        logger.error(" getWSDMProtocolloDocumento : unknown documentId " + card.getDocumentTypeId());
        iftErrorMsg = " Error : Unknown documentId " + card.getDocumentTypeId();
        iftErrorMsg = iftErrorMsg + ". Configured ids are " + wsdmDocumentMap.keySet();
        return null;
      }
      WSDMProtocolloInOut wSDMProtocolloInOut = WSDMProtocolloInOut.valueOf(wsdmType);
      wsdmProtocolloDocumento.setInout(wSDMProtocolloInOut);

      wsdmProtocolloDocumento.setNumeroDocumento(card.getCardProg().toString());
      wsdmProtocolloDocumento.setNumeroProtocollo(card.getProgressive());

      Calendar protDate = null;
      try {
        protDate = new GregorianCalendar();
        protDate.setTime(sdf.parse(getIndex(IdField.IF_DATE_REG, indexes).getFieldValue()));
        wsdmProtocolloDocumento.setAnnoProtocollo(new Long(protDate.get(Calendar.YEAR)));
        if (setDataProtocolloOdierna == true) {
          Calendar dataProtocolloToday = Calendar.getInstance();
          wsdmProtocolloDocumento.setDataProtocollo(dataProtocolloToday.getTime());
        } else {
          wsdmProtocolloDocumento.setDataProtocollo(protDate.getTime());
        }

      } catch (ParseException e) {
        logger.error("DATE");
      }
      wsdmProtocolloDocumento.setIdDocumento(card.getCardId());

      // Get indexes
      Map<String, String> indexList = ArchiflowDocumentIndexMap.get(wsdmType);
      Map<String, String> indexTypeList = ArchiflowDocumentTypeMap.get(wsdmType);
      for (String property : indexList.keySet()) {
        String ArchiflowIndexRef = indexList.get(property);
        String ArchiflowIndexTypeRef = indexTypeList.get(property);
        logger.info(String.format(" setting key %s ---> %s   type: %s ", ArchiflowIndexRef, property, ArchiflowIndexTypeRef));
        if (ArchiflowIndexRef != null) {
          PropertyDescriptor propertyDescriptor = null;
          for (java.lang.reflect.Field field : WSDMProtocolloDocumentoIn.class.getDeclaredFields()) {
            if (field.getName().equals(property)) {
              try {
                propertyDescriptor = new PropertyDescriptor(field.getName(), WSDMProtocolloDocumento.class);
              } catch (IntrospectionException e) {
                logger.info(e.getMessage());
              }
            }
          }
          if (propertyDescriptor != null) {
            Field field = getIndex(IdField.valueOf(ArchiflowIndexRef), indexes);
            String fieldValue = field.getFieldValue();
            Method method = propertyDescriptor.getWriteMethod();
            try {
              switch (field.getFieldDataType()) {
              case DT_STRING:
                method.invoke(wsdmProtocolloDocumento, fieldValue);
                break;
              case DT_DATE:
                Date dBindValue = (Date) (sdf.parse(fieldValue));
                method.invoke(wsdmProtocolloDocumento, dBindValue);
                break;
              case DT_NUMERIC:
                Long lBindValue = Long.parseLong(fieldValue);
                method.invoke(wsdmProtocolloDocumento, lBindValue);
                break;

              default:
                logger.info(" invalid dataType");
              }

            } catch (IllegalAccessException e) {
              logger.info(String.format("   invalid bind of %s=%s of type %s for '%s'", ArchiflowIndexRef, fieldValue,
                  field.getFieldDataType().name(), property));
            } catch (IllegalArgumentException e) {
              logger.info(String.format("   invalid bind of %s=%s of type %s for '%s'", ArchiflowIndexRef, fieldValue,
                  field.getFieldDataType().name(), property));
            } catch (InvocationTargetException e) {
              logger.info(String.format("   invalid bind of %s=%s of type %s for '%s'", ArchiflowIndexRef, fieldValue,
                  field.getFieldDataType().name(), property));
            } catch (ParseException e) {
              logger.info(String.format("   invalid bind of %s=%s of type %s for '%s'", ArchiflowIndexRef, fieldValue,
                  field.getFieldDataType().name(), property));
            }
          }
        }
      }

    }
    return wsdmProtocolloDocumento;
  }

  /**
   * Builds a WSDMFascicolo instance from a Folder object
   * 
   * @param archiflowFolder
   *        Archiflow.Entities.Folder
   * @return eldasoft.ws.dm.WSDMFascicolo
   */
  public WSDMFascicolo getWSDMFascicolo(Folder archiflowFolder) {
    WSDMFascicolo wsdmFascicolo = new WSDMFascicolo();

    if (archiflowFolder != null) {
      wsdmFascicolo.setCodiceFascicolo(archiflowFolder.getCode().toString());
      wsdmFascicolo.setNumeroFascicolo(archiflowFolder.getCode().toString());
      if (archiflowFolder.getDate() != null) {
        wsdmFascicolo.setAnnoFascicolo(new Long(archiflowFolder.getDate().getYear()));
        wsdmFascicolo.setDataFascicolo(archiflowFolder.getDate().toGregorianCalendar().getTime());
      }
      wsdmFascicolo.setOggettoFascicolo(archiflowFolder.getName());
      wsdmFascicolo.setDescrizioneFascicolo(archiflowFolder.getName());
      // result.setClassificaFascicolo();
      // result.setClassificaFascicoloDescrizione();
      wsdmFascicolo.setDocumenti(null);
    }
    return wsdmFascicolo;
  }

  public WSDMFascicoloDocumento getWSDMFascicoloDocumento(CardBundle cardBundle) {
    WSDMFascicoloDocumento wsdmDocument = new WSDMFascicoloDocumento();

    logger.info("Build WSDMFascicoloDocumento : ");
    if (cardBundle != null) {
      ArrayOfField indexes = cardBundle.getIndexes();

      wsdmArchiveMap.get(cardBundle.getArchiveId());
      String wsdmType = wsdmDocumentMap.get(cardBundle.getDocumentTypeId());
      if (wsdmType == null) {
        logger.error(" getWSDMProtocolloDocumento : unknown documentId " + cardBundle.getDocumentTypeId());
        iftErrorMsg = " Error : Unknown documentId " + cardBundle.getDocumentTypeId();
        iftErrorMsg = iftErrorMsg + ". Configured ids are " + wsdmDocumentMap.keySet();
        return null;
      }
      WSDMProtocolloInOut wSDMProtocolloInOut = WSDMProtocolloInOut.valueOf(wsdmType);
      wsdmDocument.setInout(wSDMProtocolloInOut);

      wsdmDocument.setNumeroDocumento(cardBundle.getCardProg().toString());
      wsdmDocument.setNumeroProtocollo(cardBundle.getProgressive());

      Map<String, String> indexList = ArchiflowDocumentIndexMap.get(wsdmType);
      IdField ff = IdField.valueOf(indexList.get("oggetto"));
      Field field = getIndex(ff, indexes);
      wsdmDocument.setOggetto(field.getFieldValue());

      Calendar protDate = null;
      try {
        protDate = new GregorianCalendar();
        protDate.setTime(sdf.parse(getIndex(IdField.IF_DATE_REG, indexes).getFieldValue()));
        wsdmDocument.setAnnoProtocollo(new Long(protDate.get(Calendar.YEAR)));
        wsdmDocument.setDataProtocollo(protDate.getTime());

      } catch (ParseException e) {
        logger.error("DATE");
      }
    }
    return wsdmDocument;
  }

  public short getArchiflowDocumentId(WSDMProtocolloInOut wsdmTpe) {
    return ArchiflowDocumentMap.get(wsdmTpe.name()).shortValue();
  }

  public short getArchiflowArchiveId(WSDMProtocolloInOut wsdmTpe) {
    return ArchiflowArchiveMap.get(wsdmTpe.name()).shortValue();
  }

  public String getItfErrorMsg() {
    return iftErrorMsg;
  }
}
