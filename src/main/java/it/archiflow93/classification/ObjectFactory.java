
package it.archiflow93.classification;

import java.math.BigDecimal;
import java.math.BigInteger;
import javax.xml.bind.JAXBElement;
import javax.xml.bind.annotation.XmlElementDecl;
import javax.xml.bind.annotation.XmlRegistry;
import javax.xml.datatype.Duration;
import javax.xml.datatype.XMLGregorianCalendar;
import javax.xml.namespace.QName;


/**
 * This object contains factory methods for each 
 * Java content interface and Java element interface 
 * generated in the it.archiflow93.classification package. 
 * <p>An ObjectFactory allows you to programatically 
 * construct new instances of the Java representation 
 * for XML content. The Java representation of XML 
 * content can consist of schema derived interfaces 
 * and classes representing the binding of schema 
 * type definitions, element declarations and model 
 * groups.  Factory methods for each of these are 
 * provided in this class.
 * 
 */
@XmlRegistry
public class ObjectFactory {

    private final static QName _OggettarioCfg_QNAME = new QName("http://schemas.datacontract.org/2004/07/SIAV.Classification.Entities.Fascicoli.ValueObject", "OggettarioCfg");
    private final static QName _ReadFascicoloInput_QNAME = new QName("http://schemas.datacontract.org/2004/07/Siav.Archiflow.Entities.Classification.ValueObject", "ReadFascicoloInput");
    private final static QName _FascicoloDiffType_QNAME = new QName("http://schemas.datacontract.org/2004/07/SIAV.Archiflow.Types", "FascicoloDiffType");
    private final static QName _GetClassificheValideOutput_QNAME = new QName("http://schemas.datacontract.org/2004/07/Siav.Archiflow.Entities.Classification.ValueObject", "GetClassificheValideOutput");
    private final static QName _ReadCardsInFolderOutput_QNAME = new QName("http://schemas.datacontract.org/2004/07/Siav.Archiflow.Entities.Classification.ValueObject", "ReadCardsInFolderOutput");
    private final static QName _GetTitolarioItemCodeInput_QNAME = new QName("http://schemas.datacontract.org/2004/07/Siav.Archiflow.Entities.Classification.ValueObject", "GetTitolarioItemCodeInput");
    private final static QName _ArrayOfFascicoloPreservation_QNAME = new QName("http://schemas.datacontract.org/2004/07/SIAV.Classification.Entities.Fascicoli.ValueObject", "ArrayOfFascicoloPreservation");
    private final static QName _ReadBaseTitolarioItemCollSortedInput_QNAME = new QName("http://schemas.datacontract.org/2004/07/Siav.Archiflow.Entities.Classification.ValueObject", "ReadBaseTitolarioItemCollSortedInput");
    private final static QName _DeleteTitolarioItemByPrimaryKeyOutput_QNAME = new QName("http://schemas.datacontract.org/2004/07/Siav.Archiflow.Entities.Classification.ValueObject", "DeleteTitolarioItemByPrimaryKeyOutput");
    private final static QName _UpdateValidToDateTitolarioItemInput_QNAME = new QName("http://schemas.datacontract.org/2004/07/Siav.Archiflow.Entities.Classification.ValueObject", "UpdateValidToDateTitolarioItemInput");
    private final static QName _ArrayOfFascicoloDocumentoEntity_QNAME = new QName("http://schemas.datacontract.org/2004/07/SIAV.Classification.Entities.Fascicoli.ValueObject", "ArrayOfFascicoloDocumentoEntity");
    private final static QName _BaseFault_QNAME = new QName("http://schemas.datacontract.org/2004/07/SIAV.Archiflow.Faults", "BaseFault");
    private final static QName _ReadFascicoloVisibilityPrivacyInput_QNAME = new QName("http://schemas.datacontract.org/2004/07/Siav.Archiflow.Entities.Classification.ValueObject", "ReadFascicoloVisibilityPrivacyInput");
    private final static QName _DocumentIdentifier_QNAME = new QName("http://schemas.datacontract.org/2004/07/SIAV.Classification.Entities.Common.Identifier", "DocumentIdentifier");
    private final static QName _Base64Binary_QNAME = new QName("http://schemas.microsoft.com/2003/10/Serialization/", "base64Binary");
    private final static QName _DeleteCheckOutTitolarioInput_QNAME = new QName("http://schemas.datacontract.org/2004/07/Siav.Archiflow.Entities.Classification.ValueObject", "DeleteCheckOutTitolarioInput");
    private final static QName _UpdateTipoFascicoloOutput_QNAME = new QName("http://schemas.datacontract.org/2004/07/Siav.Archiflow.Entities.Classification.ValueObject", "UpdateTipoFascicoloOutput");
    private final static QName _Byte_QNAME = new QName("http://schemas.microsoft.com/2003/10/Serialization/", "byte");
    private final static QName _CheckInOutput_QNAME = new QName("http://schemas.datacontract.org/2004/07/Siav.Archiflow.Entities.Classification.ValueObject", "CheckInOutput");
    private final static QName _InsertMultiClassificaDocCollOutput_QNAME = new QName("http://schemas.datacontract.org/2004/07/Siav.Archiflow.Entities.Classification.ValueObject", "InsertMultiClassificaDocCollOutput");
    private final static QName _ReadFascicoloDocumentoOutput_QNAME = new QName("http://schemas.datacontract.org/2004/07/Siav.Archiflow.Entities.Classification.ValueObject", "ReadFascicoloDocumentoOutput");
    private final static QName _IsTipoFascicoloUsedInput_QNAME = new QName("http://schemas.datacontract.org/2004/07/Siav.Archiflow.Entities.Classification.ValueObject", "IsTipoFascicoloUsedInput");
    private final static QName _CustomNullableOfint_QNAME = new QName("http://schemas.datacontract.org/2004/07/SIAV.Classification.Entities.Common.BaseClass", "CustomNullableOfint");
    private final static QName _InsertCampiTipoFascicoloInput_QNAME = new QName("http://schemas.datacontract.org/2004/07/Siav.Archiflow.Entities.Classification.ValueObject", "InsertCampiTipoFascicoloInput");
    private final static QName _ArrayOfBaseTitolario_QNAME = new QName("http://schemas.datacontract.org/2004/07/SIAV.Classification.Entities.Titolario.ValueObject", "ArrayOfBaseTitolario");
    private final static QName _IsTitolarioItemUsedOutput_QNAME = new QName("http://schemas.datacontract.org/2004/07/Siav.Archiflow.Entities.Classification.ValueObject", "IsTitolarioItemUsedOutput");
    private final static QName _InsertDifformitaOutput_QNAME = new QName("http://schemas.datacontract.org/2004/07/Siav.Archiflow.Entities.Classification.ValueObject", "InsertDifformitaOutput");
    private final static QName _SendFascicoloOutput_QNAME = new QName("http://schemas.datacontract.org/2004/07/Siav.Archiflow.Entities.Classification.ValueObject", "SendFascicoloOutput");
    private final static QName _InsertClassificaDocCollOutput_QNAME = new QName("http://schemas.datacontract.org/2004/07/Siav.Archiflow.Entities.Classification.ValueObject", "InsertClassificaDocCollOutput");
    private final static QName _ClassificationExceptionSeverity_QNAME = new QName("http://schemas.datacontract.org/2004/07/SIAV.Classification.Entities.Common.ValueObject", "ClassificationExceptionSeverity");
    private final static QName _CloseFascicoloOutput_QNAME = new QName("http://schemas.datacontract.org/2004/07/Siav.Archiflow.Entities.Classification.ValueObject", "CloseFascicoloOutput");
    private final static QName _BaseHistory_QNAME = new QName("http://schemas.datacontract.org/2004/07/SIAV.Common.BaseClass.ValueObject", "BaseHistory");
    private final static QName _GetTitolarioSonsOutput_QNAME = new QName("http://schemas.datacontract.org/2004/07/Siav.Archiflow.Entities.Classification.ValueObject", "GetTitolarioSonsOutput");
    private final static QName _DeleteClassificaDocumentoOutput_QNAME = new QName("http://schemas.datacontract.org/2004/07/Siav.Archiflow.Entities.Classification.ValueObject", "DeleteClassificaDocumentoOutput");
    private final static QName _DeleteCheckOutTitolarioItemOutput_QNAME = new QName("http://schemas.datacontract.org/2004/07/Siav.Archiflow.Entities.Classification.ValueObject", "DeleteCheckOutTitolarioItemOutput");
    private final static QName _ReadTitolarioItemBaseInput_QNAME = new QName("http://schemas.datacontract.org/2004/07/Siav.Archiflow.Entities.Classification.ValueObject", "ReadTitolarioItemBaseInput");
    private final static QName _ReadBaseTitolarioItemCollSortedOutput_QNAME = new QName("http://schemas.datacontract.org/2004/07/Siav.Archiflow.Entities.Classification.ValueObject", "ReadBaseTitolarioItemCollSortedOutput");
    private final static QName _ArrayOfBaseFascicoloDocumento_QNAME = new QName("http://schemas.datacontract.org/2004/07/SIAV.Classification.Entities.Fascicoli.ValueObject", "ArrayOfBaseFascicoloDocumento");
    private final static QName _ReadFascicoloNotesOutput_QNAME = new QName("http://schemas.datacontract.org/2004/07/Siav.Archiflow.Entities.Classification.ValueObject", "ReadFascicoloNotesOutput");
    private final static QName _ArrayOfOfficeChart_QNAME = new QName("http://schemas.datacontract.org/2004/07/SIAV.Archiflow.Entities.Chart.ValueObject", "ArrayOfOfficeChart");
    private final static QName _FascicoloPreservation_QNAME = new QName("http://schemas.datacontract.org/2004/07/SIAV.Classification.Entities.Fascicoli.ValueObject", "FascicoloPreservation");
    private final static QName _ArrayOfCampiTipoFascicoloValue_QNAME = new QName("http://schemas.datacontract.org/2004/07/SIAV.Classification.Entities.Fascicoli.ValueObject", "ArrayOfCampiTipoFascicoloValue");
    private final static QName _CheckOutTitolarioOutput_QNAME = new QName("http://schemas.datacontract.org/2004/07/Siav.Archiflow.Entities.Classification.ValueObject", "CheckOutTitolarioOutput");
    private final static QName _SetPrimaryClassificaDocumentoOutput_QNAME = new QName("http://schemas.datacontract.org/2004/07/Siav.Archiflow.Entities.Classification.ValueObject", "SetPrimaryClassificaDocumentoOutput");
    private final static QName _LegislaturaIdentifier_QNAME = new QName("http://schemas.datacontract.org/2004/07/SIAV.Classification.Entities.Fascicoli.ValueObject", "LegislaturaIdentifier");
    private final static QName _DeleteLegislaturaOutput_QNAME = new QName("http://schemas.datacontract.org/2004/07/Siav.Archiflow.Entities.Classification.ValueObject", "DeleteLegislaturaOutput");
    private final static QName _CampiTipoFascicoloValue_QNAME = new QName("http://schemas.datacontract.org/2004/07/SIAV.Classification.Entities.Fascicoli.ValueObject", "CampiTipoFascicoloValue");
    private final static QName _UnsignedShort_QNAME = new QName("http://schemas.microsoft.com/2003/10/Serialization/", "unsignedShort");
    private final static QName _ArrayOfTitolarioEntity_QNAME = new QName("http://schemas.datacontract.org/2004/07/SIAV.Classification.Entities.Titolario.ValueObject", "ArrayOfTitolarioEntity");
    private final static QName _DeleteFascicoloDocumentoInput_QNAME = new QName("http://schemas.datacontract.org/2004/07/Siav.Archiflow.Entities.Classification.ValueObject", "DeleteFascicoloDocumentoInput");
    private final static QName _ReadClassFascDocumentoOutput_QNAME = new QName("http://schemas.datacontract.org/2004/07/Siav.Archiflow.Entities.Classification.ValueObject", "ReadClassFascDocumentoOutput");
    private final static QName _TitolarioTemplateEntity_QNAME = new QName("http://schemas.datacontract.org/2004/07/SIAV.Classification.Entities.Titolario.ValueObject", "TitolarioTemplateEntity");
    private final static QName _DeleteFascicoloOutput_QNAME = new QName("http://schemas.datacontract.org/2004/07/Siav.Archiflow.Entities.Classification.ValueObject", "DeleteFascicoloOutput");
    private final static QName _InsertTipoFascVisibilityInput_QNAME = new QName("http://schemas.datacontract.org/2004/07/Siav.Archiflow.Entities.Classification.ValueObject", "InsertTipoFascVisibilityInput");
    private final static QName _ArchiflowServiceExceptionDetail_QNAME = new QName("http://schemas.datacontract.org/2004/07/SIAV.Archiflow.Exceptions", "ArchiflowServiceExceptionDetail");
    private final static QName _Short_QNAME = new QName("http://schemas.microsoft.com/2003/10/Serialization/", "short");
    private final static QName _CustomIntNullable_QNAME = new QName("http://schemas.datacontract.org/2004/07/SIAV.Classification.Entities.Common.BaseClass", "CustomIntNullable");
    private final static QName _SearchBaseFascicoloInput_QNAME = new QName("http://schemas.datacontract.org/2004/07/Siav.Archiflow.Entities.Classification.ValueObject", "SearchBaseFascicoloInput");
    private final static QName _TipoFascicoloIdentifier_QNAME = new QName("http://schemas.datacontract.org/2004/07/SIAV.Classification.Entities.TipoFascicolo.Identifier", "TipoFascicoloIdentifier");
    private final static QName _SetPrimaryFascicoloDocumentoInput_QNAME = new QName("http://schemas.datacontract.org/2004/07/Siav.Archiflow.Entities.Classification.ValueObject", "SetPrimaryFascicoloDocumentoInput");
    private final static QName _BaseValueObject_QNAME = new QName("http://schemas.datacontract.org/2004/07/SIAV.Common.BaseClass.ValueObject", "BaseValueObject");
    private final static QName _UpdateTitolarioOutput_QNAME = new QName("http://schemas.datacontract.org/2004/07/Siav.Archiflow.Entities.Classification.ValueObject", "UpdateTitolarioOutput");
    private final static QName _ExpirationMethodType_QNAME = new QName("http://schemas.datacontract.org/2004/07/SIAV.Archiflow.Entities.Types", "ExpirationMethodType");
    private final static QName _TipoFascDiffSearcher_QNAME = new QName("http://schemas.datacontract.org/2004/07/SIAV.Classification.Entities.TipoFascicolo.Searcher", "TipoFascDiffSearcher");
    private final static QName _DeleteCheckOutInput_QNAME = new QName("http://schemas.datacontract.org/2004/07/Siav.Archiflow.Entities.Classification.ValueObject", "DeleteCheckOutInput");
    private final static QName _CheckOutTitolarioInput_QNAME = new QName("http://schemas.datacontract.org/2004/07/Siav.Archiflow.Entities.Classification.ValueObject", "CheckOutTitolarioInput");
    private final static QName _UpdateStatusTitolarioInput_QNAME = new QName("http://schemas.datacontract.org/2004/07/Siav.Archiflow.Entities.Classification.ValueObject", "UpdateStatusTitolarioInput");
    private final static QName _PrivacyEmptyFault_QNAME = new QName("http://schemas.datacontract.org/2004/07/SIAV.Archiflow.Faults", "PrivacyEmptyFault");
    private final static QName _ReadTitolarioItemCollOutput_QNAME = new QName("http://schemas.datacontract.org/2004/07/Siav.Archiflow.Entities.Classification.ValueObject", "ReadTitolarioItemCollOutput");
    private final static QName _UpdateCampiTipoFascicoloOutput_QNAME = new QName("http://schemas.datacontract.org/2004/07/Siav.Archiflow.Entities.Classification.ValueObject", "UpdateCampiTipoFascicoloOutput");
    private final static QName _AbstractTitolario_QNAME = new QName("http://schemas.datacontract.org/2004/07/SIAV.Classification.Entities.Titolario.ValueObject", "AbstractTitolario");
    private final static QName _ReadTipoFascVisibilityOutput_QNAME = new QName("http://schemas.datacontract.org/2004/07/Siav.Archiflow.Entities.Classification.ValueObject", "ReadTipoFascVisibilityOutput");
    private final static QName _UnsignedInt_QNAME = new QName("http://schemas.microsoft.com/2003/10/Serialization/", "unsignedInt");
    private final static QName _PreservationClassificationNotEnabledFault_QNAME = new QName("http://schemas.datacontract.org/2004/07/SIAV.Archiflow.Faults", "PreservationClassificationNotEnabledFault");
    private final static QName _ReadValoreCampiTipoFascicoloOutput_QNAME = new QName("http://schemas.datacontract.org/2004/07/Siav.Archiflow.Entities.Classification.ValueObject", "ReadValoreCampiTipoFascicoloOutput");
    private final static QName _DeleteTitolarioItemByTitolarioIdOutput_QNAME = new QName("http://schemas.datacontract.org/2004/07/Siav.Archiflow.Entities.Classification.ValueObject", "DeleteTitolarioItemByTitolarioIdOutput");
    private final static QName _IsFascicoloInCurrentTitolarioOutput_QNAME = new QName("http://schemas.datacontract.org/2004/07/Siav.Archiflow.Entities.Classification.ValueObject", "IsFascicoloInCurrentTitolarioOutput");
    private final static QName _ArrayOfstring_QNAME = new QName("http://schemas.microsoft.com/2003/10/Serialization/Arrays", "ArrayOfstring");
    private final static QName _OpenFascicoloOutput_QNAME = new QName("http://schemas.datacontract.org/2004/07/Siav.Archiflow.Entities.Classification.ValueObject", "OpenFascicoloOutput");
    private final static QName _ReadTitolarioItemCollInput_QNAME = new QName("http://schemas.datacontract.org/2004/07/Siav.Archiflow.Entities.Classification.ValueObject", "ReadTitolarioItemCollInput");
    private final static QName _InsertTitolarioInput_QNAME = new QName("http://schemas.datacontract.org/2004/07/Siav.Archiflow.Entities.Classification.ValueObject", "InsertTitolarioInput");
    private final static QName _InsertTitolarioItemOutput_QNAME = new QName("http://schemas.datacontract.org/2004/07/Siav.Archiflow.Entities.Classification.ValueObject", "InsertTitolarioItemOutput");
    private final static QName _ArrayOfBaseClassificaDocumento_QNAME = new QName("http://schemas.datacontract.org/2004/07/SIAV.Classification.Entities.Titolario.ValueObject", "ArrayOfBaseClassificaDocumento");
    private final static QName _ArrayOfTipoFascicoloEntity_QNAME = new QName("http://schemas.datacontract.org/2004/07/SIAV.Classification.Entities.TipoFascicolo.ValueObject", "ArrayOfTipoFascicoloEntity");
    private final static QName _CoupleIdentifier_QNAME = new QName("http://schemas.datacontract.org/2004/07/SIAV.Common.BaseClass.ValueObject", "CoupleIdentifier");
    private final static QName _ReadBaseTitolarioInput_QNAME = new QName("http://schemas.datacontract.org/2004/07/Siav.Archiflow.Entities.Classification.ValueObject", "ReadBaseTitolarioInput");
    private final static QName _UpdateStatoFascicoloInput_QNAME = new QName("http://schemas.datacontract.org/2004/07/Siav.Archiflow.Entities.Classification.ValueObject", "UpdateStatoFascicoloInput");
    private final static QName _DeleteFascicoloDocumentoOutput_QNAME = new QName("http://schemas.datacontract.org/2004/07/Siav.Archiflow.Entities.Classification.ValueObject", "DeleteFascicoloDocumentoOutput");
    private final static QName _UpdateValidToDateTitolarioOutput_QNAME = new QName("http://schemas.datacontract.org/2004/07/Siav.Archiflow.Entities.Classification.ValueObject", "UpdateValidToDateTitolarioOutput");
    private final static QName _ArrayOfCampiTipoFascicolo_QNAME = new QName("http://schemas.datacontract.org/2004/07/SIAV.Classification.Entities.TipoFascicolo.ValueObject", "ArrayOfCampiTipoFascicolo");
    private final static QName _RecoveryFascicoloOutput_QNAME = new QName("http://schemas.datacontract.org/2004/07/Siav.Archiflow.Entities.Classification.ValueObject", "RecoveryFascicoloOutput");
    private final static QName _Char_QNAME = new QName("http://schemas.microsoft.com/2003/10/Serialization/", "char");
    private final static QName _SessionInfo_QNAME = new QName("http://schemas.datacontract.org/2004/07/SIAV.Archiflow.Entities.Login.ValueObject", "SessionInfo");
    private final static QName _ArrayOfBaseFascicolo_QNAME = new QName("http://schemas.datacontract.org/2004/07/SIAV.Classification.Entities.Fascicoli.ValueObject", "ArrayOfBaseFascicolo");
    private final static QName _BaseIdentifier_QNAME = new QName("http://schemas.datacontract.org/2004/07/SIAV.Common.BaseClass.ValueObject", "BaseIdentifier");
    private final static QName _CopyTipoFascicoloInput_QNAME = new QName("http://schemas.datacontract.org/2004/07/Siav.Archiflow.Entities.Classification.ValueObject", "CopyTipoFascicoloInput");
    private final static QName _TypeIdentifier_QNAME = new QName("http://schemas.datacontract.org/2004/07/SIAV.Common.BaseClass.ValueObject", "TypeIdentifier");
    private final static QName _LoggableBase_QNAME = new QName("http://schemas.datacontract.org/2004/07/SIAV.Common.Tools.Log", "LoggableBase");
    private final static QName _UpdateTipoFascicoloInput_QNAME = new QName("http://schemas.datacontract.org/2004/07/Siav.Archiflow.Entities.Classification.ValueObject", "UpdateTipoFascicoloInput");
    private final static QName _ReadTitolarioItemInput_QNAME = new QName("http://schemas.datacontract.org/2004/07/Siav.Archiflow.Entities.Classification.ValueObject", "ReadTitolarioItemInput");
    private final static QName _ReadFascicoloVisibilityInput_QNAME = new QName("http://schemas.datacontract.org/2004/07/Siav.Archiflow.Entities.Classification.ValueObject", "ReadFascicoloVisibilityInput");
    private final static QName _FascHistoryOrder_QNAME = new QName("http://schemas.datacontract.org/2004/07/SIAV.Archiflow.Types", "FascHistoryOrder");
    private final static QName _CheckOutTitolarioItemInput_QNAME = new QName("http://schemas.datacontract.org/2004/07/Siav.Archiflow.Entities.Classification.ValueObject", "CheckOutTitolarioItemInput");
    private final static QName _InsertDifformitaInput_QNAME = new QName("http://schemas.datacontract.org/2004/07/Siav.Archiflow.Entities.Classification.ValueObject", "InsertDifformitaInput");
    private final static QName _InsertClassificaDocumentoOutput_QNAME = new QName("http://schemas.datacontract.org/2004/07/Siav.Archiflow.Entities.Classification.ValueObject", "InsertClassificaDocumentoOutput");
    private final static QName _DeleteTitolarioItemByPrimaryKeyInput_QNAME = new QName("http://schemas.datacontract.org/2004/07/Siav.Archiflow.Entities.Classification.ValueObject", "DeleteTitolarioItemByPrimaryKeyInput");
    private final static QName _ReadClassFascDocumentoInput_QNAME = new QName("http://schemas.datacontract.org/2004/07/Siav.Archiflow.Entities.Classification.ValueObject", "ReadClassFascDocumentoInput");
    private final static QName _GetFascicoloToPreserveInput_QNAME = new QName("http://schemas.datacontract.org/2004/07/Siav.Archiflow.Entities.Classification.ValueObject", "GetFascicoloToPreserveInput");
    private final static QName _FascicoloIdentifier_QNAME = new QName("http://schemas.datacontract.org/2004/07/SIAV.Classification.Entities.Fascicoli.Identifier", "FascicoloIdentifier");
    private final static QName _ReadFascicoloHierarchyInput_QNAME = new QName("http://schemas.datacontract.org/2004/07/Siav.Archiflow.Entities.Classification.ValueObject", "ReadFascicoloHierarchyInput");
    private final static QName _ReadClassificaDocumentoInput_QNAME = new QName("http://schemas.datacontract.org/2004/07/Siav.Archiflow.Entities.Classification.ValueObject", "ReadClassificaDocumentoInput");
    private final static QName _InsertTipoFascicoloInput_QNAME = new QName("http://schemas.datacontract.org/2004/07/Siav.Archiflow.Entities.Classification.ValueObject", "InsertTipoFascicoloInput");
    private final static QName _DeleteCheckOutTitolarioOutput_QNAME = new QName("http://schemas.datacontract.org/2004/07/Siav.Archiflow.Entities.Classification.ValueObject", "DeleteCheckOutTitolarioOutput");
    private final static QName _DeleteTitolarioItemByTitolarioIdInput_QNAME = new QName("http://schemas.datacontract.org/2004/07/Siav.Archiflow.Entities.Classification.ValueObject", "DeleteTitolarioItemByTitolarioIdInput");
    private final static QName _InsertFascicoloNoteInput_QNAME = new QName("http://schemas.datacontract.org/2004/07/Siav.Archiflow.Entities.Classification.ValueObject", "InsertFascicoloNoteInput");
    private final static QName _UnsignedByte_QNAME = new QName("http://schemas.microsoft.com/2003/10/Serialization/", "unsignedByte");
    private final static QName _ReadBaseTitolarioItemCollInput_QNAME = new QName("http://schemas.datacontract.org/2004/07/Siav.Archiflow.Entities.Classification.ValueObject", "ReadBaseTitolarioItemCollInput");
    private final static QName _UpdateTipoFascicoloStatusInput_QNAME = new QName("http://schemas.datacontract.org/2004/07/Siav.Archiflow.Entities.Classification.ValueObject", "UpdateTipoFascicoloStatusInput");
    private final static QName _Int_QNAME = new QName("http://schemas.microsoft.com/2003/10/Serialization/", "int");
    private final static QName _InsertValoreCampiTipoFascicoloInput_QNAME = new QName("http://schemas.datacontract.org/2004/07/Siav.Archiflow.Entities.Classification.ValueObject", "InsertValoreCampiTipoFascicoloInput");
    private final static QName _DeleteTipoFascicoloOutput_QNAME = new QName("http://schemas.datacontract.org/2004/07/Siav.Archiflow.Entities.Classification.ValueObject", "DeleteTipoFascicoloOutput");
    private final static QName _CampiTipoFascicolo_QNAME = new QName("http://schemas.datacontract.org/2004/07/SIAV.Classification.Entities.TipoFascicolo.ValueObject", "CampiTipoFascicolo");
    private final static QName _ArrayOfBaseOption_QNAME = new QName("http://schemas.datacontract.org/2004/07/SIAV.Common.BaseClass.ValueObject", "ArrayOfBaseOption");
    private final static QName _ArrayOfTipoFascDiffValue_QNAME = new QName("http://schemas.datacontract.org/2004/07/SIAV.Classification.Entities.TipoFascicolo.ValueObject", "ArrayOfTipoFascDiffValue");
    private final static QName _InsertOptionsOutput_QNAME = new QName("http://schemas.datacontract.org/2004/07/Siav.Archiflow.Entities.Classification.ValueObject", "InsertOptionsOutput");
    private final static QName _DeleteAllFascicoliDelInput_QNAME = new QName("http://schemas.datacontract.org/2004/07/Siav.Archiflow.Entities.Classification.ValueObject", "DeleteAllFascicoliDelInput");
    private final static QName _ReadDifformitaInput_QNAME = new QName("http://schemas.datacontract.org/2004/07/Siav.Archiflow.Entities.Classification.ValueObject", "ReadDifformitaInput");
    private final static QName _BaseVisibilityDesc_QNAME = new QName("http://schemas.datacontract.org/2004/07/SIAV.Common.BaseClass.ValueObject", "BaseVisibilityDesc");
    private final static QName _PreservationStatus_QNAME = new QName("http://schemas.datacontract.org/2004/07/SIAV.Archiflow.Types", "PreservationStatus");
    private final static QName _UpdateTitolarioItemOutput_QNAME = new QName("http://schemas.datacontract.org/2004/07/Siav.Archiflow.Entities.Classification.ValueObject", "UpdateTitolarioItemOutput");
    private final static QName _SearchTitolarioItemsIdInput_QNAME = new QName("http://schemas.datacontract.org/2004/07/Siav.Archiflow.Entities.Classification.ValueObject", "SearchTitolarioItemsIdInput");
    private final static QName _InsertFascicoloNoteOutput_QNAME = new QName("http://schemas.datacontract.org/2004/07/Siav.Archiflow.Entities.Classification.ValueObject", "InsertFascicoloNoteOutput");
    private final static QName _IsCampoTipoFascicoloUsedInput_QNAME = new QName("http://schemas.datacontract.org/2004/07/Siav.Archiflow.Entities.Classification.ValueObject", "IsCampoTipoFascicoloUsedInput");
    private final static QName _TitolarioSearcher_QNAME = new QName("http://schemas.datacontract.org/2004/07/SIAV.Classification.Entities.Titolario.Searcher", "TitolarioSearcher");
    private final static QName _DateTime_QNAME = new QName("http://schemas.microsoft.com/2003/10/Serialization/", "dateTime");
    private final static QName _ReadTipoFascicoloOutput_QNAME = new QName("http://schemas.datacontract.org/2004/07/Siav.Archiflow.Entities.Classification.ValueObject", "ReadTipoFascicoloOutput");
    private final static QName _InsertTitolarioTemplateOutput_QNAME = new QName("http://schemas.datacontract.org/2004/07/Siav.Archiflow.Entities.Classification.ValueObject", "InsertTitolarioTemplateOutput");
    private final static QName _InsertClassificaDocCollInput_QNAME = new QName("http://schemas.datacontract.org/2004/07/Siav.Archiflow.Entities.Classification.ValueObject", "InsertClassificaDocCollInput");
    private final static QName _InsertTipoFascVisibilityOutput_QNAME = new QName("http://schemas.datacontract.org/2004/07/Siav.Archiflow.Entities.Classification.ValueObject", "InsertTipoFascVisibilityOutput");
    private final static QName _FascicoloSearcher_QNAME = new QName("http://schemas.datacontract.org/2004/07/SIAV.Classification.Entities.Fascicoli.Searcher", "FascicoloSearcher");
    private final static QName _IsTitolarioItemValidInput_QNAME = new QName("http://schemas.datacontract.org/2004/07/Siav.Archiflow.Entities.Classification.ValueObject", "IsTitolarioItemValidInput");
    private final static QName _UpdatePreservedFascicoloOutput_QNAME = new QName("http://schemas.datacontract.org/2004/07/Siav.Archiflow.Entities.Classification.ValueObject", "UpdatePreservedFascicoloOutput");
    private final static QName _TitolarioTemplateSearcher_QNAME = new QName("http://schemas.datacontract.org/2004/07/SIAV.Classification.Entities.Titolario.Searcher", "TitolarioTemplateSearcher");
    private final static QName _UpdateClassificaFascicoloInput_QNAME = new QName("http://schemas.datacontract.org/2004/07/Siav.Archiflow.Entities.Classification.ValueObject", "UpdateClassificaFascicoloInput");
    private final static QName _ClassificationExceptionDetail_QNAME = new QName("http://schemas.datacontract.org/2004/07/SIAV.Classification.Entities.Common.ValueObject", "ClassificationExceptionDetail");
    private final static QName _ClassificaDocIdentifier_QNAME = new QName("http://schemas.datacontract.org/2004/07/SIAV.Classification.Entities.Titolario.Identifier", "ClassificaDocIdentifier");
    private final static QName _CampiTipoFascicoloSearcher_QNAME = new QName("http://schemas.datacontract.org/2004/07/SIAV.Classification.Entities.TipoFascicolo.Searcher", "CampiTipoFascicoloSearcher");
    private final static QName _GetTitolarioItemCodeOutput_QNAME = new QName("http://schemas.datacontract.org/2004/07/Siav.Archiflow.Entities.Classification.ValueObject", "GetTitolarioItemCodeOutput");
    private final static QName _ReadBaseFascicoloOutput_QNAME = new QName("http://schemas.datacontract.org/2004/07/Siav.Archiflow.Entities.Classification.ValueObject", "ReadBaseFascicoloOutput");
    private final static QName _ArchiflowExceptionSeverity_QNAME = new QName("http://schemas.datacontract.org/2004/07/SIAV.Archiflow.Exceptions", "ArchiflowExceptionSeverity");
    private final static QName _ReadFascicoloVisibilityPrivacyOutput_QNAME = new QName("http://schemas.datacontract.org/2004/07/Siav.Archiflow.Entities.Classification.ValueObject", "ReadFascicoloVisibilityPrivacyOutput");
    private final static QName _CheckOutInput_QNAME = new QName("http://schemas.datacontract.org/2004/07/Siav.Archiflow.Entities.Classification.ValueObject", "CheckOutInput");
    private final static QName _TipoFascDiffIdentifier_QNAME = new QName("http://schemas.datacontract.org/2004/07/SIAV.Classification.Entities.TipoFascicolo.Identifier", "TipoFascDiffIdentifier");
    private final static QName _SearchTitolarioItemsClassifyInput_QNAME = new QName("http://schemas.datacontract.org/2004/07/Siav.Archiflow.Entities.Classification.ValueObject", "SearchTitolarioItemsClassifyInput");
    private final static QName _ReadBaseFascicoloInput_QNAME = new QName("http://schemas.datacontract.org/2004/07/Siav.Archiflow.Entities.Classification.ValueObject", "ReadBaseFascicoloInput");
    private final static QName _CopyTitolarioOutput_QNAME = new QName("http://schemas.datacontract.org/2004/07/Siav.Archiflow.Entities.Classification.ValueObject", "CopyTitolarioOutput");
    private final static QName _ClassificaDocumentoEntity_QNAME = new QName("http://schemas.datacontract.org/2004/07/SIAV.Classification.Entities.Titolario.ValueObject", "ClassificaDocumentoEntity");
    private final static QName _RecoveryFascicoloInput_QNAME = new QName("http://schemas.datacontract.org/2004/07/Siav.Archiflow.Entities.Classification.ValueObject", "RecoveryFascicoloInput");
    private final static QName _NumerationType_QNAME = new QName("http://schemas.datacontract.org/2004/07/SIAV.Archiflow.Types", "NumerationType");
    private final static QName _InsertFascicoloVisibilityInput_QNAME = new QName("http://schemas.datacontract.org/2004/07/Siav.Archiflow.Entities.Classification.ValueObject", "InsertFascicoloVisibilityInput");
    private final static QName _BaseOption_QNAME = new QName("http://schemas.datacontract.org/2004/07/SIAV.Common.BaseClass.ValueObject", "BaseOption");
    private final static QName _SearchTitolarioItemsClassifyOutput_QNAME = new QName("http://schemas.datacontract.org/2004/07/Siav.Archiflow.Entities.Classification.ValueObject", "SearchTitolarioItemsClassifyOutput");
    private final static QName _Decimal_QNAME = new QName("http://schemas.microsoft.com/2003/10/Serialization/", "decimal");
    private final static QName _Guid_QNAME = new QName("http://schemas.microsoft.com/2003/10/Serialization/", "guid");
    private final static QName _ReadValoreCampiTipoFascicoloInput_QNAME = new QName("http://schemas.datacontract.org/2004/07/Siav.Archiflow.Entities.Classification.ValueObject", "ReadValoreCampiTipoFascicoloInput");
    private final static QName _ArrayOfFascicoloHistory_QNAME = new QName("http://schemas.datacontract.org/2004/07/SIAV.Classification.Entities.Fascicoli.ValueObject", "ArrayOfFascicoloHistory");
    private final static QName _Duration_QNAME = new QName("http://schemas.microsoft.com/2003/10/Serialization/", "duration");
    private final static QName _ArrayOfTitolarioItemEntity_QNAME = new QName("http://schemas.datacontract.org/2004/07/SIAV.Classification.Entities.TitolarioItem.ValueObject", "ArrayOfTitolarioItemEntity");
    private final static QName _ReadFascicoloNotesInput_QNAME = new QName("http://schemas.datacontract.org/2004/07/Siav.Archiflow.Entities.Classification.ValueObject", "ReadFascicoloNotesInput");
    private final static QName _BaseNote_QNAME = new QName("http://schemas.datacontract.org/2004/07/SIAV.Common.BaseClass.ValueObject", "BaseNote");
    private final static QName _ArrayOfKeyValueOfstringstring_QNAME = new QName("http://schemas.microsoft.com/2003/10/Serialization/Arrays", "ArrayOfKeyValueOfstringstring");
    private final static QName _DeleteCheckOutTitolarioItemInput_QNAME = new QName("http://schemas.datacontract.org/2004/07/Siav.Archiflow.Entities.Classification.ValueObject", "DeleteCheckOutTitolarioItemInput");
    private final static QName _GetTitolarioItemSonsInput_QNAME = new QName("http://schemas.datacontract.org/2004/07/Siav.Archiflow.Entities.Classification.ValueObject", "GetTitolarioItemSonsInput");
    private final static QName _AnyURI_QNAME = new QName("http://schemas.microsoft.com/2003/10/Serialization/", "anyURI");
    private final static QName _CloseFascicoloInput_QNAME = new QName("http://schemas.datacontract.org/2004/07/Siav.Archiflow.Entities.Classification.ValueObject", "CloseFascicoloInput");
    private final static QName _BaseVisibility_QNAME = new QName("http://schemas.datacontract.org/2004/07/SIAV.Common.BaseClass.ValueObject", "BaseVisibility");
    private final static QName _TypeIdentifierComplete_QNAME = new QName("http://schemas.datacontract.org/2004/07/SIAV.Common.BaseClass.ValueObject", "TypeIdentifierComplete");
    private final static QName _TipoFascicoloEntity_QNAME = new QName("http://schemas.datacontract.org/2004/07/SIAV.Classification.Entities.TipoFascicolo.ValueObject", "TipoFascicoloEntity");
    private final static QName _ReadTipoFascVisibilityInput_QNAME = new QName("http://schemas.datacontract.org/2004/07/Siav.Archiflow.Entities.Classification.ValueObject", "ReadTipoFascVisibilityInput");
    private final static QName _InsertFascicoloVisibilityOutput_QNAME = new QName("http://schemas.datacontract.org/2004/07/Siav.Archiflow.Entities.Classification.ValueObject", "InsertFascicoloVisibilityOutput");
    private final static QName _ClassificazioneBaseSearcher_QNAME = new QName("http://schemas.datacontract.org/2004/07/SIAV.Classification.Entities.Common.BaseClass", "ClassificazioneBaseSearcher");
    private final static QName _InsertTitolarioItemInput_QNAME = new QName("http://schemas.datacontract.org/2004/07/Siav.Archiflow.Entities.Classification.ValueObject", "InsertTitolarioItemInput");
    private final static QName _UpdateValidToDateTitolarioInput_QNAME = new QName("http://schemas.datacontract.org/2004/07/Siav.Archiflow.Entities.Classification.ValueObject", "UpdateValidToDateTitolarioInput");
    private final static QName _CopyTipoFascicoloOutput_QNAME = new QName("http://schemas.datacontract.org/2004/07/Siav.Archiflow.Entities.Classification.ValueObject", "CopyTipoFascicoloOutput");
    private final static QName _Float_QNAME = new QName("http://schemas.microsoft.com/2003/10/Serialization/", "float");
    private final static QName _GetClassificheValideInput_QNAME = new QName("http://schemas.datacontract.org/2004/07/Siav.Archiflow.Entities.Classification.ValueObject", "GetClassificheValideInput");
    private final static QName _IsTitolarioItemUsedInput_QNAME = new QName("http://schemas.datacontract.org/2004/07/Siav.Archiflow.Entities.Classification.ValueObject", "IsTitolarioItemUsedInput");
    private final static QName _ReadClassificaCodeCollInput_QNAME = new QName("http://schemas.datacontract.org/2004/07/Siav.Archiflow.Entities.Classification.ValueObject", "ReadClassificaCodeCollInput");
    private final static QName _IsFascicoloInCurrentTitolarioInput_QNAME = new QName("http://schemas.datacontract.org/2004/07/Siav.Archiflow.Entities.Classification.ValueObject", "IsFascicoloInCurrentTitolarioInput");
    private final static QName _ReadClassificaDocumentoOutput_QNAME = new QName("http://schemas.datacontract.org/2004/07/Siav.Archiflow.Entities.Classification.ValueObject", "ReadClassificaDocumentoOutput");
    private final static QName _ArrayOfCampiTipoFascicoloCfgValue_QNAME = new QName("http://schemas.datacontract.org/2004/07/SIAV.Classification.Entities.TipoFascicolo.ValueObject", "ArrayOfCampiTipoFascicoloCfgValue");
    private final static QName _InsertMultiClassificaDocCollInput_QNAME = new QName("http://schemas.datacontract.org/2004/07/Siav.Archiflow.Entities.Classification.ValueObject", "InsertMultiClassificaDocCollInput");
    private final static QName _EntityQueryType_QNAME = new QName("http://schemas.datacontract.org/2004/07/SIAV.Archiflow.Types", "EntityQueryType");
    private final static QName _Boolean_QNAME = new QName("http://schemas.microsoft.com/2003/10/Serialization/", "boolean");
    private final static QName _ArrayOfEntityAccess_QNAME = new QName("http://schemas.datacontract.org/2004/07/SIAV.Common.BaseClass.ValueObject", "ArrayOfEntityAccess");
    private final static QName _DeleteTitolarioTemplateInput_QNAME = new QName("http://schemas.datacontract.org/2004/07/Siav.Archiflow.Entities.Classification.ValueObject", "DeleteTitolarioTemplateInput");
    private final static QName _InsertTitolarioTemplateInput_QNAME = new QName("http://schemas.datacontract.org/2004/07/Siav.Archiflow.Entities.Classification.ValueObject", "InsertTitolarioTemplateInput");
    private final static QName _CustomDateTimeNullable_QNAME = new QName("http://schemas.datacontract.org/2004/07/SIAV.Classification.Entities.Common.BaseClass", "CustomDateTimeNullable");
    private final static QName _InsertCampiTipoFascicoloOutput_QNAME = new QName("http://schemas.datacontract.org/2004/07/Siav.Archiflow.Entities.Classification.ValueObject", "InsertCampiTipoFascicoloOutput");
    private final static QName _UpdateStatusTitolarioOutput_QNAME = new QName("http://schemas.datacontract.org/2004/07/Siav.Archiflow.Entities.Classification.ValueObject", "UpdateStatusTitolarioOutput");
    private final static QName _DeleteTitolarioInput_QNAME = new QName("http://schemas.datacontract.org/2004/07/Siav.Archiflow.Entities.Classification.ValueObject", "DeleteTitolarioInput");
    private final static QName _AnyType_QNAME = new QName("http://schemas.microsoft.com/2003/10/Serialization/", "anyType");
    private final static QName _ReadTitolarioItemCollSortedInput_QNAME = new QName("http://schemas.datacontract.org/2004/07/Siav.Archiflow.Entities.Classification.ValueObject", "ReadTitolarioItemCollSortedInput");
    private final static QName _UpdateValidToDateTitolarioItemOutput_QNAME = new QName("http://schemas.datacontract.org/2004/07/Siav.Archiflow.Entities.Classification.ValueObject", "UpdateValidToDateTitolarioItemOutput");
    private final static QName _ReadLegislaturaOutput_QNAME = new QName("http://schemas.datacontract.org/2004/07/Siav.Archiflow.Entities.Classification.ValueObject", "ReadLegislaturaOutput");
    private final static QName _SetPrimaryClassificaDocumentoInput_QNAME = new QName("http://schemas.datacontract.org/2004/07/Siav.Archiflow.Entities.Classification.ValueObject", "SetPrimaryClassificaDocumentoInput");
    private final static QName _ArrayOfFascicoloEntity_QNAME = new QName("http://schemas.datacontract.org/2004/07/SIAV.Classification.Entities.Fascicoli.ValueObject", "ArrayOfFascicoloEntity");
    private final static QName _SendFascicoloInput_QNAME = new QName("http://schemas.datacontract.org/2004/07/Siav.Archiflow.Entities.Classification.ValueObject", "SendFascicoloInput");
    private final static QName _UpdateTitolarioTemplateInput_QNAME = new QName("http://schemas.datacontract.org/2004/07/Siav.Archiflow.Entities.Classification.ValueObject", "UpdateTitolarioTemplateInput");
    private final static QName _SearchFascicoloInput_QNAME = new QName("http://schemas.datacontract.org/2004/07/Siav.Archiflow.Entities.Classification.ValueObject", "SearchFascicoloInput");
    private final static QName _StatusType_QNAME = new QName("http://schemas.datacontract.org/2004/07/SIAV.Archiflow.Types", "StatusType");
    private final static QName _ReadDifformitaOutput_QNAME = new QName("http://schemas.datacontract.org/2004/07/Siav.Archiflow.Entities.Classification.ValueObject", "ReadDifformitaOutput");
    private final static QName _UpdateTipoFascicoloStatusOutput_QNAME = new QName("http://schemas.datacontract.org/2004/07/Siav.Archiflow.Entities.Classification.ValueObject", "UpdateTipoFascicoloStatusOutput");
    private final static QName _ArrayOfint_QNAME = new QName("http://schemas.microsoft.com/2003/10/Serialization/Arrays", "ArrayOfint");
    private final static QName _DeleteTitolarioTemplateOutput_QNAME = new QName("http://schemas.datacontract.org/2004/07/Siav.Archiflow.Entities.Classification.ValueObject", "DeleteTitolarioTemplateOutput");
    private final static QName _ArrayOfFascicoloPreservationStatus_QNAME = new QName("http://schemas.datacontract.org/2004/07/SIAV.Classification.Entities.Fascicoli.ValueObject", "ArrayOfFascicoloPreservationStatus");
    private final static QName _ReadTitolarioItemOutput_QNAME = new QName("http://schemas.datacontract.org/2004/07/Siav.Archiflow.Entities.Classification.ValueObject", "ReadTitolarioItemOutput");
    private final static QName _BaseTitolario_QNAME = new QName("http://schemas.datacontract.org/2004/07/SIAV.Classification.Entities.Titolario.ValueObject", "BaseTitolario");
    private final static QName _TitolarioEntity_QNAME = new QName("http://schemas.datacontract.org/2004/07/SIAV.Classification.Entities.Titolario.ValueObject", "TitolarioEntity");
    private final static QName _ReadCampiTipoFascicoloInput_QNAME = new QName("http://schemas.datacontract.org/2004/07/Siav.Archiflow.Entities.Classification.ValueObject", "ReadCampiTipoFascicoloInput");
    private final static QName _CheckInInput_QNAME = new QName("http://schemas.datacontract.org/2004/07/Siav.Archiflow.Entities.Classification.ValueObject", "CheckInInput");
    private final static QName _UpdateFascicoloInput_QNAME = new QName("http://schemas.datacontract.org/2004/07/Siav.Archiflow.Entities.Classification.ValueObject", "UpdateFascicoloInput");
    private final static QName _ReadFascicoloHistoryInput_QNAME = new QName("http://schemas.datacontract.org/2004/07/Siav.Archiflow.Entities.Classification.ValueObject", "ReadFascicoloHistoryInput");
    private final static QName _CampiTipoFascicoloIdentifier_QNAME = new QName("http://schemas.datacontract.org/2004/07/SIAV.Classification.Entities.TipoFascicolo.Identifier", "CampiTipoFascicoloIdentifier");
    private final static QName _IsTitolarioUsedOutput_QNAME = new QName("http://schemas.datacontract.org/2004/07/Siav.Archiflow.Entities.Classification.ValueObject", "IsTitolarioUsedOutput");
    private final static QName _ReadTitolarioInput_QNAME = new QName("http://schemas.datacontract.org/2004/07/Siav.Archiflow.Entities.Classification.ValueObject", "ReadTitolarioInput");
    private final static QName _BaseTitolarioItem_QNAME = new QName("http://schemas.datacontract.org/2004/07/SIAV.Classification.Entities.TitolarioItem.ValueObject", "BaseTitolarioItem");
    private final static QName _FascicoloDocumentoSearcher_QNAME = new QName("http://schemas.datacontract.org/2004/07/SIAV.Classification.Entities.Fascicoli.Searcher", "FascicoloDocumentoSearcher");
    private final static QName _ReadCampiTipoFascicoloOutput_QNAME = new QName("http://schemas.datacontract.org/2004/07/Siav.Archiflow.Entities.Classification.ValueObject", "ReadCampiTipoFascicoloOutput");
    private final static QName _ReadTipoDocDefaultTitolarioItemCollInput_QNAME = new QName("http://schemas.datacontract.org/2004/07/Siav.Archiflow.Entities.Classification.ValueObject", "ReadTipoDocDefaultTitolarioItemCollInput");
    private final static QName _BaseClassificaDocumento_QNAME = new QName("http://schemas.datacontract.org/2004/07/SIAV.Classification.Entities.Titolario.ValueObject", "BaseClassificaDocumento");
    private final static QName _UpdateStatusHierarchyInput_QNAME = new QName("http://schemas.datacontract.org/2004/07/Siav.Archiflow.Entities.Classification.ValueObject", "UpdateStatusHierarchyInput");
    private final static QName _ReadLegislaturaInput_QNAME = new QName("http://schemas.datacontract.org/2004/07/Siav.Archiflow.Entities.Classification.ValueObject", "ReadLegislaturaInput");
    private final static QName _FascicoloEntity_QNAME = new QName("http://schemas.datacontract.org/2004/07/SIAV.Classification.Entities.Fascicoli.ValueObject", "FascicoloEntity");
    private final static QName _ArrayOfTypeIdentifier_QNAME = new QName("http://schemas.datacontract.org/2004/07/SIAV.Common.BaseClass.ValueObject", "ArrayOfTypeIdentifier");
    private final static QName _TitolarioItemSearcher_QNAME = new QName("http://schemas.datacontract.org/2004/07/SIAV.Classification.Entities.TitolarioItem.Searcher", "TitolarioItemSearcher");
    private final static QName _ReadTitolarioTemplateOutput_QNAME = new QName("http://schemas.datacontract.org/2004/07/Siav.Archiflow.Entities.Classification.ValueObject", "ReadTitolarioTemplateOutput");
    private final static QName _FieldTypeDefinition_QNAME = new QName("http://schemas.datacontract.org/2004/07/SIAV.Archiflow.Types", "FieldTypeDefinition");
    private final static QName _ReadEntityType_QNAME = new QName("http://schemas.datacontract.org/2004/07/SIAV.Archiflow.Types", "ReadEntityType");
    private final static QName _ReadBaseTitolarioOutput_QNAME = new QName("http://schemas.datacontract.org/2004/07/Siav.Archiflow.Entities.Classification.ValueObject", "ReadBaseTitolarioOutput");
    private final static QName _IsTitolarioItemValidOutput_QNAME = new QName("http://schemas.datacontract.org/2004/07/Siav.Archiflow.Entities.Classification.ValueObject", "IsTitolarioItemValidOutput");
    private final static QName _DeleteAllFascicoliDelOutput_QNAME = new QName("http://schemas.datacontract.org/2004/07/Siav.Archiflow.Entities.Classification.ValueObject", "DeleteAllFascicoliDelOutput");
    private final static QName _Legislatura_QNAME = new QName("http://schemas.datacontract.org/2004/07/SIAV.Classification.Entities.Fascicoli.ValueObject", "Legislatura");
    private final static QName _TitolarioTemplateIdentifier_QNAME = new QName("http://schemas.datacontract.org/2004/07/SIAV.Classification.Entities.Titolario.Identifier", "TitolarioTemplateIdentifier");
    private final static QName _ReadTitolarioItemCollSortedOutput_QNAME = new QName("http://schemas.datacontract.org/2004/07/Siav.Archiflow.Entities.Classification.ValueObject", "ReadTitolarioItemCollSortedOutput");
    private final static QName _CheckOutOutput_QNAME = new QName("http://schemas.datacontract.org/2004/07/Siav.Archiflow.Entities.Classification.ValueObject", "CheckOutOutput");
    private final static QName _InsertClassificaFascicoloInput_QNAME = new QName("http://schemas.datacontract.org/2004/07/Siav.Archiflow.Entities.Classification.ValueObject", "InsertClassificaFascicoloInput");
    private final static QName _SearchFascicoloOutput_QNAME = new QName("http://schemas.datacontract.org/2004/07/Siav.Archiflow.Entities.Classification.ValueObject", "SearchFascicoloOutput");
    private final static QName _IsTitolarioUsedInput_QNAME = new QName("http://schemas.datacontract.org/2004/07/Siav.Archiflow.Entities.Classification.ValueObject", "IsTitolarioUsedInput");
    private final static QName _UpdateLegislaturaInput_QNAME = new QName("http://schemas.datacontract.org/2004/07/Siav.Archiflow.Entities.Classification.ValueObject", "UpdateLegislaturaInput");
    private final static QName _ReadOptionsOutput_QNAME = new QName("http://schemas.datacontract.org/2004/07/Siav.Archiflow.Entities.Classification.ValueObject", "ReadOptionsOutput");
    private final static QName _FascicoloHistory_QNAME = new QName("http://schemas.datacontract.org/2004/07/SIAV.Classification.Entities.Fascicoli.ValueObject", "FascicoloHistory");
    private final static QName _FieldDefinition_QNAME = new QName("http://schemas.datacontract.org/2004/07/SIAV.Archiflow.Types", "FieldDefinition");
    private final static QName _OpenFascicoloInput_QNAME = new QName("http://schemas.datacontract.org/2004/07/Siav.Archiflow.Entities.Classification.ValueObject", "OpenFascicoloInput");
    private final static QName _IsFascicoloUsedOutput_QNAME = new QName("http://schemas.datacontract.org/2004/07/Siav.Archiflow.Entities.Classification.ValueObject", "IsFascicoloUsedOutput");
    private final static QName _UpdateClassificaFascicoloOutput_QNAME = new QName("http://schemas.datacontract.org/2004/07/Siav.Archiflow.Entities.Classification.ValueObject", "UpdateClassificaFascicoloOutput");
    private final static QName _String_QNAME = new QName("http://schemas.microsoft.com/2003/10/Serialization/", "string");
    private final static QName _InsertTitolarioOutput_QNAME = new QName("http://schemas.datacontract.org/2004/07/Siav.Archiflow.Entities.Classification.ValueObject", "InsertTitolarioOutput");
    private final static QName _CheckOutTitolarioItemOutput_QNAME = new QName("http://schemas.datacontract.org/2004/07/Siav.Archiflow.Entities.Classification.ValueObject", "CheckOutTitolarioItemOutput");
    private final static QName _ReadTipoFascicoloInput_QNAME = new QName("http://schemas.datacontract.org/2004/07/Siav.Archiflow.Entities.Classification.ValueObject", "ReadTipoFascicoloInput");
    private final static QName _DiffTypes_QNAME = new QName("http://schemas.datacontract.org/2004/07/SIAV.Archiflow.Types", "DiffTypes");
    private final static QName _BaseOutput_QNAME = new QName("http://schemas.datacontract.org/2004/07/SIAV.Archiflow.Entities", "BaseOutput");
    private final static QName _BaseVisibilityPrivacy_QNAME = new QName("http://schemas.datacontract.org/2004/07/SIAV.Common.BaseClass.ValueObject", "BaseVisibilityPrivacy");
    private final static QName _DeleteTipoFascicoloInput_QNAME = new QName("http://schemas.datacontract.org/2004/07/Siav.Archiflow.Entities.Classification.ValueObject", "DeleteTipoFascicoloInput");
    private final static QName _ReadFascicoloHierarchyOutput_QNAME = new QName("http://schemas.datacontract.org/2004/07/Siav.Archiflow.Entities.Classification.ValueObject", "ReadFascicoloHierarchyOutput");
    private final static QName _ReadFascicoloHistoryOutput_QNAME = new QName("http://schemas.datacontract.org/2004/07/Siav.Archiflow.Entities.Classification.ValueObject", "ReadFascicoloHistoryOutput");
    private final static QName _IsFascicoloUsedInput_QNAME = new QName("http://schemas.datacontract.org/2004/07/Siav.Archiflow.Entities.Classification.ValueObject", "IsFascicoloUsedInput");
    private final static QName _ReadClassificaCodeCollOutput_QNAME = new QName("http://schemas.datacontract.org/2004/07/Siav.Archiflow.Entities.Classification.ValueObject", "ReadClassificaCodeCollOutput");
    private final static QName _BaseFascicolo_QNAME = new QName("http://schemas.datacontract.org/2004/07/SIAV.Classification.Entities.Fascicoli.ValueObject", "BaseFascicolo");
    private final static QName _ReadOptionsInput_QNAME = new QName("http://schemas.datacontract.org/2004/07/Siav.Archiflow.Entities.Classification.ValueObject", "ReadOptionsInput");
    private final static QName _BaseSearcher_QNAME = new QName("http://schemas.datacontract.org/2004/07/SIAV.Common.BaseClass.ValueObject", "BaseSearcher");
    private final static QName _ReadTipoDocDefaultTitolarioItemCollOutput_QNAME = new QName("http://schemas.datacontract.org/2004/07/Siav.Archiflow.Entities.Classification.ValueObject", "ReadTipoDocDefaultTitolarioItemCollOutput");
    private final static QName _InsertClassificaDocumentoInput_QNAME = new QName("http://schemas.datacontract.org/2004/07/Siav.Archiflow.Entities.Classification.ValueObject", "InsertClassificaDocumentoInput");
    private final static QName _InsertLegislaturaOutput_QNAME = new QName("http://schemas.datacontract.org/2004/07/Siav.Archiflow.Entities.Classification.ValueObject", "InsertLegislaturaOutput");
    private final static QName _UserLoginType_QNAME = new QName("http://schemas.datacontract.org/2004/07/SIAV.Archiflow.Entities.Types", "UserLoginType");
    private final static QName _CustomNullableOfdateTime_QNAME = new QName("http://schemas.datacontract.org/2004/07/SIAV.Classification.Entities.Common.BaseClass", "CustomNullableOfdateTime");
    private final static QName _ReadFascicoloOutput_QNAME = new QName("http://schemas.datacontract.org/2004/07/Siav.Archiflow.Entities.Classification.ValueObject", "ReadFascicoloOutput");
    private final static QName _Long_QNAME = new QName("http://schemas.microsoft.com/2003/10/Serialization/", "long");
    private final static QName _DeleteCampiTipoFascicoloValueInput_QNAME = new QName("http://schemas.datacontract.org/2004/07/Siav.Archiflow.Entities.Classification.ValueObject", "DeleteCampiTipoFascicoloValueInput");
    private final static QName _ArrayOfDocumentIdentifier_QNAME = new QName("http://schemas.datacontract.org/2004/07/SIAV.Classification.Entities.Common.Identifier", "ArrayOfDocumentIdentifier");
    private final static QName _BaseInput_QNAME = new QName("http://schemas.datacontract.org/2004/07/SIAV.Archiflow.Entities", "BaseInput");
    private final static QName _InsertTipoFascicoloOutput_QNAME = new QName("http://schemas.datacontract.org/2004/07/Siav.Archiflow.Entities.Classification.ValueObject", "InsertTipoFascicoloOutput");
    private final static QName _DateIdentifier_QNAME = new QName("http://schemas.datacontract.org/2004/07/SIAV.Common.BaseClass.ValueObject", "DateIdentifier");
    private final static QName _ReadTitolarioTemplateInput_QNAME = new QName("http://schemas.datacontract.org/2004/07/Siav.Archiflow.Entities.Classification.ValueObject", "ReadTitolarioTemplateInput");
    private final static QName _ArrayOfClassificaDocumentoEntity_QNAME = new QName("http://schemas.datacontract.org/2004/07/SIAV.Classification.Entities.Titolario.ValueObject", "ArrayOfClassificaDocumentoEntity");
    private final static QName _UpdateCampiTipoFascicoloInput_QNAME = new QName("http://schemas.datacontract.org/2004/07/Siav.Archiflow.Entities.Classification.ValueObject", "UpdateCampiTipoFascicoloInput");
    private final static QName _SearchTitolarioItemsIdOutput_QNAME = new QName("http://schemas.datacontract.org/2004/07/Siav.Archiflow.Entities.Classification.ValueObject", "SearchTitolarioItemsIdOutput");
    private final static QName _FascicoloDocIdentifier_QNAME = new QName("http://schemas.datacontract.org/2004/07/SIAV.Classification.Entities.Fascicolo.Identifier", "FascicoloDocIdentifier");
    private final static QName _UpdatePreservedFascicoloInput_QNAME = new QName("http://schemas.datacontract.org/2004/07/Siav.Archiflow.Entities.Classification.ValueObject", "UpdatePreservedFascicoloInput");
    private final static QName _SetPrimaryFascicoloDocumentoOutput_QNAME = new QName("http://schemas.datacontract.org/2004/07/Siav.Archiflow.Entities.Classification.ValueObject", "SetPrimaryFascicoloDocumentoOutput");
    private final static QName _ReadTitolarioItemBaseOutput_QNAME = new QName("http://schemas.datacontract.org/2004/07/Siav.Archiflow.Entities.Classification.ValueObject", "ReadTitolarioItemBaseOutput");
    private final static QName _UpdateLegislaturaOutput_QNAME = new QName("http://schemas.datacontract.org/2004/07/Siav.Archiflow.Entities.Classification.ValueObject", "UpdateLegislaturaOutput");
    private final static QName _GetTitolarioSonsInput_QNAME = new QName("http://schemas.datacontract.org/2004/07/Siav.Archiflow.Entities.Classification.ValueObject", "GetTitolarioSonsInput");
    private final static QName _ClassificaDocumentoSearcher_QNAME = new QName("http://schemas.datacontract.org/2004/07/SIAV.Classification.Entities.Titolario.Searcher", "ClassificaDocumentoSearcher");
    private final static QName _ArrayOfLegislatura_QNAME = new QName("http://schemas.datacontract.org/2004/07/SIAV.Classification.Entities.Fascicoli.ValueObject", "ArrayOfLegislatura");
    private final static QName _TitolarioIdentifier_QNAME = new QName("http://schemas.datacontract.org/2004/07/SIAV.Classification.Entities.Titolario.Identifier", "TitolarioIdentifier");
    private final static QName _FascicoloDocumentoEntity_QNAME = new QName("http://schemas.datacontract.org/2004/07/SIAV.Classification.Entities.Fascicoli.ValueObject", "FascicoloDocumentoEntity");
    private final static QName _ArrayOfTitolarioTemplateEntity_QNAME = new QName("http://schemas.datacontract.org/2004/07/SIAV.Classification.Entities.Titolario.ValueObject", "ArrayOfTitolarioTemplateEntity");
    private final static QName _Double_QNAME = new QName("http://schemas.microsoft.com/2003/10/Serialization/", "double");
    private final static QName _DeleteCheckOutOutput_QNAME = new QName("http://schemas.datacontract.org/2004/07/Siav.Archiflow.Entities.Classification.ValueObject", "DeleteCheckOutOutput");
    private final static QName _ArrayOfBaseTitolarioItem_QNAME = new QName("http://schemas.datacontract.org/2004/07/SIAV.Classification.Entities.TitolarioItem.ValueObject", "ArrayOfBaseTitolarioItem");
    private final static QName _UpdateFascicoloOutput_QNAME = new QName("http://schemas.datacontract.org/2004/07/Siav.Archiflow.Entities.Classification.ValueObject", "UpdateFascicoloOutput");
    private final static QName _InsertLegislaturaInput_QNAME = new QName("http://schemas.datacontract.org/2004/07/Siav.Archiflow.Entities.Classification.ValueObject", "InsertLegislaturaInput");
    private final static QName _SortingTypes_QNAME = new QName("http://schemas.datacontract.org/2004/07/SIAV.Archiflow.Types", "SortingTypes");
    private final static QName _UpdateTitolarioItemInput_QNAME = new QName("http://schemas.datacontract.org/2004/07/Siav.Archiflow.Entities.Classification.ValueObject", "UpdateTitolarioItemInput");
    private final static QName _CampiTipoFascicoloCfgValue_QNAME = new QName("http://schemas.datacontract.org/2004/07/SIAV.Classification.Entities.TipoFascicolo.ValueObject", "CampiTipoFascicoloCfgValue");
    private final static QName _TitolarioItemIdentifier_QNAME = new QName("http://schemas.datacontract.org/2004/07/SIAV.Classification.Entities.TitolarioItem.Identifier", "TitolarioItemIdentifier");
    private final static QName _BaseFascicoloDocumento_QNAME = new QName("http://schemas.datacontract.org/2004/07/SIAV.Classification.Entities.Fascicoli.ValueObject", "BaseFascicoloDocumento");
    private final static QName _ReadFascicoloVisibilityOutput_QNAME = new QName("http://schemas.datacontract.org/2004/07/Siav.Archiflow.Entities.Classification.ValueObject", "ReadFascicoloVisibilityOutput");
    private final static QName _UpdateTitolarioTemplateOutput_QNAME = new QName("http://schemas.datacontract.org/2004/07/Siav.Archiflow.Entities.Classification.ValueObject", "UpdateTitolarioTemplateOutput");
    private final static QName _ReadTitolarioOutput_QNAME = new QName("http://schemas.datacontract.org/2004/07/Siav.Archiflow.Entities.Classification.ValueObject", "ReadTitolarioOutput");
    private final static QName _ReadBaseTitolarioItemCollOutput_QNAME = new QName("http://schemas.datacontract.org/2004/07/Siav.Archiflow.Entities.Classification.ValueObject", "ReadBaseTitolarioItemCollOutput");
    private final static QName _InsertClassificaFascicoloOutput_QNAME = new QName("http://schemas.datacontract.org/2004/07/Siav.Archiflow.Entities.Classification.ValueObject", "InsertClassificaFascicoloOutput");
    private final static QName _CopyTitolarioInput_QNAME = new QName("http://schemas.datacontract.org/2004/07/Siav.Archiflow.Entities.Classification.ValueObject", "CopyTitolarioInput");
    private final static QName _UpdateTitolarioInput_QNAME = new QName("http://schemas.datacontract.org/2004/07/Siav.Archiflow.Entities.Classification.ValueObject", "UpdateTitolarioInput");
    private final static QName _QName_QNAME = new QName("http://schemas.microsoft.com/2003/10/Serialization/", "QName");
    private final static QName _InsertFascicoloInput_QNAME = new QName("http://schemas.datacontract.org/2004/07/Siav.Archiflow.Entities.Classification.ValueObject", "InsertFascicoloInput");
    private final static QName _InsertFascicoloOutput_QNAME = new QName("http://schemas.datacontract.org/2004/07/Siav.Archiflow.Entities.Classification.ValueObject", "InsertFascicoloOutput");
    private final static QName _SearchBaseFascicoloOutput_QNAME = new QName("http://schemas.datacontract.org/2004/07/Siav.Archiflow.Entities.Classification.ValueObject", "SearchBaseFascicoloOutput");
    private final static QName _ConservationType_QNAME = new QName("http://schemas.datacontract.org/2004/07/SIAV.Archiflow.Types", "ConservationType");
    private final static QName _DeleteFascicoloInput_QNAME = new QName("http://schemas.datacontract.org/2004/07/Siav.Archiflow.Entities.Classification.ValueObject", "DeleteFascicoloInput");
    private final static QName _EntityAccess_QNAME = new QName("http://schemas.datacontract.org/2004/07/SIAV.Common.BaseClass.ValueObject", "EntityAccess");
    private final static QName _InsertOptionsInput_QNAME = new QName("http://schemas.datacontract.org/2004/07/Siav.Archiflow.Entities.Classification.ValueObject", "InsertOptionsInput");
    private final static QName _TipoFascicoloSearcher_QNAME = new QName("http://schemas.datacontract.org/2004/07/SIAV.Classification.Entities.TipoFascicolo.Searcher", "TipoFascicoloSearcher");
    private final static QName _IsTipoFascicoloUsedOutput_QNAME = new QName("http://schemas.datacontract.org/2004/07/Siav.Archiflow.Entities.Classification.ValueObject", "IsTipoFascicoloUsedOutput");
    private final static QName _UpdateStatusHierarchyOutput_QNAME = new QName("http://schemas.datacontract.org/2004/07/Siav.Archiflow.Entities.Classification.ValueObject", "UpdateStatusHierarchyOutput");
    private final static QName _EntityDataType_QNAME = new QName("http://schemas.datacontract.org/2004/07/SIAV.Archiflow.Types", "EntityDataType");
    private final static QName _SearchOpeningStatus_QNAME = new QName("http://schemas.datacontract.org/2004/07/SIAV.Archiflow.Types", "SearchOpeningStatus");
    private final static QName _ReadCardsInFolderInput_QNAME = new QName("http://schemas.datacontract.org/2004/07/Siav.Archiflow.Entities.Classification.ValueObject", "ReadCardsInFolderInput");
    private final static QName _GetFascicoloToPreserveOutput_QNAME = new QName("http://schemas.datacontract.org/2004/07/Siav.Archiflow.Entities.Classification.ValueObject", "GetFascicoloToPreserveOutput");
    private final static QName _TipoFascDiffValue_QNAME = new QName("http://schemas.datacontract.org/2004/07/SIAV.Classification.Entities.TipoFascicolo.ValueObject", "TipoFascDiffValue");
    private final static QName _IsCampoTipoFascicoloUsedOutput_QNAME = new QName("http://schemas.datacontract.org/2004/07/Siav.Archiflow.Entities.Classification.ValueObject", "IsCampoTipoFascicoloUsedOutput");
    private final static QName _Language_QNAME = new QName("http://schemas.datacontract.org/2004/07/SIAV.Archiflow.Entities.Types", "Language");
    private final static QName _OfficeChart_QNAME = new QName("http://schemas.datacontract.org/2004/07/SIAV.Archiflow.Entities.Chart.ValueObject", "OfficeChart");
    private final static QName _ArrayOfOggettarioCfg_QNAME = new QName("http://schemas.datacontract.org/2004/07/SIAV.Classification.Entities.Fascicoli.ValueObject", "ArrayOfOggettarioCfg");
    private final static QName _DeleteClassificaDocumentoInput_QNAME = new QName("http://schemas.datacontract.org/2004/07/Siav.Archiflow.Entities.Classification.ValueObject", "DeleteClassificaDocumentoInput");
    private final static QName _DeleteCampiTipoFascicoloValueOutput_QNAME = new QName("http://schemas.datacontract.org/2004/07/Siav.Archiflow.Entities.Classification.ValueObject", "DeleteCampiTipoFascicoloValueOutput");
    private final static QName _InsertValoreCampiTipoFascicoloOutput_QNAME = new QName("http://schemas.datacontract.org/2004/07/Siav.Archiflow.Entities.Classification.ValueObject", "InsertValoreCampiTipoFascicoloOutput");
    private final static QName _UpdateStatoFascicoloOutput_QNAME = new QName("http://schemas.datacontract.org/2004/07/Siav.Archiflow.Entities.Classification.ValueObject", "UpdateStatoFascicoloOutput");
    private final static QName _DeleteTitolarioOutput_QNAME = new QName("http://schemas.datacontract.org/2004/07/Siav.Archiflow.Entities.Classification.ValueObject", "DeleteTitolarioOutput");
    private final static QName _ArrayOfBaseNote_QNAME = new QName("http://schemas.datacontract.org/2004/07/SIAV.Common.BaseClass.ValueObject", "ArrayOfBaseNote");
    private final static QName _ReadFascicoloDocumentoInput_QNAME = new QName("http://schemas.datacontract.org/2004/07/Siav.Archiflow.Entities.Classification.ValueObject", "ReadFascicoloDocumentoInput");
    private final static QName _UnsignedLong_QNAME = new QName("http://schemas.microsoft.com/2003/10/Serialization/", "unsignedLong");
    private final static QName _TitolarioItemEntity_QNAME = new QName("http://schemas.datacontract.org/2004/07/SIAV.Classification.Entities.TitolarioItem.ValueObject", "TitolarioItemEntity");
    private final static QName _DeleteLegislaturaInput_QNAME = new QName("http://schemas.datacontract.org/2004/07/Siav.Archiflow.Entities.Classification.ValueObject", "DeleteLegislaturaInput");
    private final static QName _GetTitolarioItemSonsOutput_QNAME = new QName("http://schemas.datacontract.org/2004/07/Siav.Archiflow.Entities.Classification.ValueObject", "GetTitolarioItemSonsOutput");
    private final static QName _FascicoloPreservationStatus_QNAME = new QName("http://schemas.datacontract.org/2004/07/SIAV.Classification.Entities.Fascicoli.ValueObject", "FascicoloPreservationStatus");
    private final static QName _DuplicatedArchivalNumberFault_QNAME = new QName("http://schemas.datacontract.org/2004/07/SIAV.Archiflow.Faults", "DuplicatedArchivalNumberFault");

    /**
     * Create a new ObjectFactory that can be used to create new instances of schema derived classes for package: it.archiflow93.classification
     * 
     */
    public ObjectFactory() {
    }

    /**
     * Create an instance of {@link ReadTitolarioItemBaseByParamResponse }
     * 
     */
    public ReadTitolarioItemBaseByParamResponse createReadTitolarioItemBaseByParamResponse() {
        return new ReadTitolarioItemBaseByParamResponse();
    }

    /**
     * Create an instance of {@link ReadValoreCampiTipoFascicoloByParam }
     * 
     */
    public ReadValoreCampiTipoFascicoloByParam createReadValoreCampiTipoFascicoloByParam() {
        return new ReadValoreCampiTipoFascicoloByParam();
    }

    /**
     * Create an instance of {@link ReadTitolarioItemCollByParam }
     * 
     */
    public ReadTitolarioItemCollByParam createReadTitolarioItemCollByParam() {
        return new ReadTitolarioItemCollByParam();
    }

    /**
     * Create an instance of {@link ReadBaseTitolarioItemCollByParam }
     * 
     */
    public ReadBaseTitolarioItemCollByParam createReadBaseTitolarioItemCollByParam() {
        return new ReadBaseTitolarioItemCollByParam();
    }

    /**
     * Create an instance of {@link BaseIdentifier }
     * 
     */
    public BaseIdentifier createBaseIdentifier() {
        return new BaseIdentifier();
    }

    /**
     * Create an instance of {@link UpdateTipoFascicoloStatusOutput }
     * 
     */
    public UpdateTipoFascicoloStatusOutput createUpdateTipoFascicoloStatusOutput() {
        return new UpdateTipoFascicoloStatusOutput();
    }

    /**
     * Create an instance of {@link SetPrimaryClassificaDocumentoOutput }
     * 
     */
    public SetPrimaryClassificaDocumentoOutput createSetPrimaryClassificaDocumentoOutput() {
        return new SetPrimaryClassificaDocumentoOutput();
    }

    /**
     * Create an instance of {@link GetTitolarioItemSonsByParam }
     * 
     */
    public GetTitolarioItemSonsByParam createGetTitolarioItemSonsByParam() {
        return new GetTitolarioItemSonsByParam();
    }

    /**
     * Create an instance of {@link DeleteTitolarioTemplateInput }
     * 
     */
    public DeleteTitolarioTemplateInput createDeleteTitolarioTemplateInput() {
        return new DeleteTitolarioTemplateInput();
    }

    /**
     * Create an instance of {@link IsFascicoloUsedInput }
     * 
     */
    public IsFascicoloUsedInput createIsFascicoloUsedInput() {
        return new IsFascicoloUsedInput();
    }

    /**
     * Create an instance of {@link ReadTipoFascVisibilityByParam }
     * 
     */
    public ReadTipoFascVisibilityByParam createReadTipoFascVisibilityByParam() {
        return new ReadTipoFascVisibilityByParam();
    }

    /**
     * Create an instance of {@link GetFascicoloToPreserveInput }
     * 
     */
    public GetFascicoloToPreserveInput createGetFascicoloToPreserveInput() {
        return new GetFascicoloToPreserveInput();
    }

    /**
     * Create an instance of {@link BaseSearcher }
     * 
     */
    public BaseSearcher createBaseSearcher() {
        return new BaseSearcher();
    }

    /**
     * Create an instance of {@link UpdateStatoFascicoloInput }
     * 
     */
    public UpdateStatoFascicoloInput createUpdateStatoFascicoloInput() {
        return new UpdateStatoFascicoloInput();
    }

    /**
     * Create an instance of {@link BaseInput }
     * 
     */
    public BaseInput createBaseInput() {
        return new BaseInput();
    }

    /**
     * Create an instance of {@link InsertFascicoloVisibilityOutput }
     * 
     */
    public InsertFascicoloVisibilityOutput createInsertFascicoloVisibilityOutput() {
        return new InsertFascicoloVisibilityOutput();
    }

    /**
     * Create an instance of {@link InsertTipoFascicoloInput }
     * 
     */
    public InsertTipoFascicoloInput createInsertTipoFascicoloInput() {
        return new InsertTipoFascicoloInput();
    }

    /**
     * Create an instance of {@link CloseFascicoloOutput }
     * 
     */
    public CloseFascicoloOutput createCloseFascicoloOutput() {
        return new CloseFascicoloOutput();
    }

    /**
     * Create an instance of {@link SearchFascicoloOutput }
     * 
     */
    public SearchFascicoloOutput createSearchFascicoloOutput() {
        return new SearchFascicoloOutput();
    }

    /**
     * Create an instance of {@link ReadClassificaDocumentoInput }
     * 
     */
    public ReadClassificaDocumentoInput createReadClassificaDocumentoInput() {
        return new ReadClassificaDocumentoInput();
    }

    /**
     * Create an instance of {@link TitolarioItemEntity }
     * 
     */
    public TitolarioItemEntity createTitolarioItemEntity() {
        return new TitolarioItemEntity();
    }

    /**
     * Create an instance of {@link InsertLegislaturaByParam }
     * 
     */
    public InsertLegislaturaByParam createInsertLegislaturaByParam() {
        return new InsertLegislaturaByParam();
    }

    /**
     * Create an instance of {@link UpdateFascicoloByParam }
     * 
     */
    public UpdateFascicoloByParam createUpdateFascicoloByParam() {
        return new UpdateFascicoloByParam();
    }

    /**
     * Create an instance of {@link CheckOutByParamResponse }
     * 
     */
    public CheckOutByParamResponse createCheckOutByParamResponse() {
        return new CheckOutByParamResponse();
    }

    /**
     * Create an instance of {@link ReadTipoFascicoloByParamResponse }
     * 
     */
    public ReadTipoFascicoloByParamResponse createReadTipoFascicoloByParamResponse() {
        return new ReadTipoFascicoloByParamResponse();
    }

    /**
     * Create an instance of {@link ReadClassFascDocumentoInput }
     * 
     */
    public ReadClassFascDocumentoInput createReadClassFascDocumentoInput() {
        return new ReadClassFascDocumentoInput();
    }

    /**
     * Create an instance of {@link ReadTipoDocDefaultTitolarioItemCollInput }
     * 
     */
    public ReadTipoDocDefaultTitolarioItemCollInput createReadTipoDocDefaultTitolarioItemCollInput() {
        return new ReadTipoDocDefaultTitolarioItemCollInput();
    }

    /**
     * Create an instance of {@link ArrayOfBaseNote }
     * 
     */
    public ArrayOfBaseNote createArrayOfBaseNote() {
        return new ArrayOfBaseNote();
    }

    /**
     * Create an instance of {@link UpdateTipoFascicoloStatusByParam }
     * 
     */
    public UpdateTipoFascicoloStatusByParam createUpdateTipoFascicoloStatusByParam() {
        return new UpdateTipoFascicoloStatusByParam();
    }

    /**
     * Create an instance of {@link ReadTipoFascicoloByParam }
     * 
     */
    public ReadTipoFascicoloByParam createReadTipoFascicoloByParam() {
        return new ReadTipoFascicoloByParam();
    }

    /**
     * Create an instance of {@link InsertFascicoloOutput }
     * 
     */
    public InsertFascicoloOutput createInsertFascicoloOutput() {
        return new InsertFascicoloOutput();
    }

    /**
     * Create an instance of {@link ArrayOfClassificaDocumentoEntity }
     * 
     */
    public ArrayOfClassificaDocumentoEntity createArrayOfClassificaDocumentoEntity() {
        return new ArrayOfClassificaDocumentoEntity();
    }

    /**
     * Create an instance of {@link BaseClassificaDocumento }
     * 
     */
    public BaseClassificaDocumento createBaseClassificaDocumento() {
        return new BaseClassificaDocumento();
    }

    /**
     * Create an instance of {@link DeleteCheckOutOutput }
     * 
     */
    public DeleteCheckOutOutput createDeleteCheckOutOutput() {
        return new DeleteCheckOutOutput();
    }

    /**
     * Create an instance of {@link ArrayOfTitolarioTemplateEntity }
     * 
     */
    public ArrayOfTitolarioTemplateEntity createArrayOfTitolarioTemplateEntity() {
        return new ArrayOfTitolarioTemplateEntity();
    }

    /**
     * Create an instance of {@link ArrayOfTipoFascDiffValue }
     * 
     */
    public ArrayOfTipoFascDiffValue createArrayOfTipoFascDiffValue() {
        return new ArrayOfTipoFascDiffValue();
    }

    /**
     * Create an instance of {@link IsFascicoloInCurrentTitolarioByParam }
     * 
     */
    public IsFascicoloInCurrentTitolarioByParam createIsFascicoloInCurrentTitolarioByParam() {
        return new IsFascicoloInCurrentTitolarioByParam();
    }

    /**
     * Create an instance of {@link SetPrimaryFascicoloDocumentoByParamResponse }
     * 
     */
    public SetPrimaryFascicoloDocumentoByParamResponse createSetPrimaryFascicoloDocumentoByParamResponse() {
        return new SetPrimaryFascicoloDocumentoByParamResponse();
    }

    /**
     * Create an instance of {@link SearchBaseFascicoloByParamResponse }
     * 
     */
    public SearchBaseFascicoloByParamResponse createSearchBaseFascicoloByParamResponse() {
        return new SearchBaseFascicoloByParamResponse();
    }

    /**
     * Create an instance of {@link ReadClassificaDocumentoOutput }
     * 
     */
    public ReadClassificaDocumentoOutput createReadClassificaDocumentoOutput() {
        return new ReadClassificaDocumentoOutput();
    }

    /**
     * Create an instance of {@link GetTitolarioItemCodeInput }
     * 
     */
    public GetTitolarioItemCodeInput createGetTitolarioItemCodeInput() {
        return new GetTitolarioItemCodeInput();
    }

    /**
     * Create an instance of {@link InsertFascicoloVisibilityByParamResponse }
     * 
     */
    public InsertFascicoloVisibilityByParamResponse createInsertFascicoloVisibilityByParamResponse() {
        return new InsertFascicoloVisibilityByParamResponse();
    }

    /**
     * Create an instance of {@link TipoFascicoloIdentifier }
     * 
     */
    public TipoFascicoloIdentifier createTipoFascicoloIdentifier() {
        return new TipoFascicoloIdentifier();
    }

    /**
     * Create an instance of {@link ReadCampiTipoFascicoloOutput }
     * 
     */
    public ReadCampiTipoFascicoloOutput createReadCampiTipoFascicoloOutput() {
        return new ReadCampiTipoFascicoloOutput();
    }

    /**
     * Create an instance of {@link ReadBaseTitolarioInput }
     * 
     */
    public ReadBaseTitolarioInput createReadBaseTitolarioInput() {
        return new ReadBaseTitolarioInput();
    }

    /**
     * Create an instance of {@link UpdateLegislaturaByParam }
     * 
     */
    public UpdateLegislaturaByParam createUpdateLegislaturaByParam() {
        return new UpdateLegislaturaByParam();
    }

    /**
     * Create an instance of {@link GetTitolarioItemCodeOutput }
     * 
     */
    public GetTitolarioItemCodeOutput createGetTitolarioItemCodeOutput() {
        return new GetTitolarioItemCodeOutput();
    }

    /**
     * Create an instance of {@link IsTitolarioUsedOutput }
     * 
     */
    public IsTitolarioUsedOutput createIsTitolarioUsedOutput() {
        return new IsTitolarioUsedOutput();
    }

    /**
     * Create an instance of {@link InsertClassificaDocCollByParam }
     * 
     */
    public InsertClassificaDocCollByParam createInsertClassificaDocCollByParam() {
        return new InsertClassificaDocCollByParam();
    }

    /**
     * Create an instance of {@link DeleteAllFascicoliDelInput }
     * 
     */
    public DeleteAllFascicoliDelInput createDeleteAllFascicoliDelInput() {
        return new DeleteAllFascicoliDelInput();
    }

    /**
     * Create an instance of {@link CheckOutTitolarioItemInput }
     * 
     */
    public CheckOutTitolarioItemInput createCheckOutTitolarioItemInput() {
        return new CheckOutTitolarioItemInput();
    }

    /**
     * Create an instance of {@link InsertClassificaFascicoloOutput }
     * 
     */
    public InsertClassificaFascicoloOutput createInsertClassificaFascicoloOutput() {
        return new InsertClassificaFascicoloOutput();
    }

    /**
     * Create an instance of {@link ReadFascicoloVisibilityInput }
     * 
     */
    public ReadFascicoloVisibilityInput createReadFascicoloVisibilityInput() {
        return new ReadFascicoloVisibilityInput();
    }

    /**
     * Create an instance of {@link UpdateValidToDateTitolarioByParam }
     * 
     */
    public UpdateValidToDateTitolarioByParam createUpdateValidToDateTitolarioByParam() {
        return new UpdateValidToDateTitolarioByParam();
    }

    /**
     * Create an instance of {@link CheckOutTitolarioItemByParam }
     * 
     */
    public CheckOutTitolarioItemByParam createCheckOutTitolarioItemByParam() {
        return new CheckOutTitolarioItemByParam();
    }

    /**
     * Create an instance of {@link CheckInInput }
     * 
     */
    public CheckInInput createCheckInInput() {
        return new CheckInInput();
    }

    /**
     * Create an instance of {@link TipoFascicoloSearcher }
     * 
     */
    public TipoFascicoloSearcher createTipoFascicoloSearcher() {
        return new TipoFascicoloSearcher();
    }

    /**
     * Create an instance of {@link UpdateClassificaFascicoloByParamResponse }
     * 
     */
    public UpdateClassificaFascicoloByParamResponse createUpdateClassificaFascicoloByParamResponse() {
        return new UpdateClassificaFascicoloByParamResponse();
    }

    /**
     * Create an instance of {@link UpdateValidToDateTitolarioByParamResponse }
     * 
     */
    public UpdateValidToDateTitolarioByParamResponse createUpdateValidToDateTitolarioByParamResponse() {
        return new UpdateValidToDateTitolarioByParamResponse();
    }

    /**
     * Create an instance of {@link CampiTipoFascicoloValue }
     * 
     */
    public CampiTipoFascicoloValue createCampiTipoFascicoloValue() {
        return new CampiTipoFascicoloValue();
    }

    /**
     * Create an instance of {@link InsertTipoFascVisibilityOutput }
     * 
     */
    public InsertTipoFascVisibilityOutput createInsertTipoFascVisibilityOutput() {
        return new InsertTipoFascVisibilityOutput();
    }

    /**
     * Create an instance of {@link ReadTipoFascVisibilityInput }
     * 
     */
    public ReadTipoFascVisibilityInput createReadTipoFascVisibilityInput() {
        return new ReadTipoFascVisibilityInput();
    }

    /**
     * Create an instance of {@link ReadClassificaDocumentoByParam }
     * 
     */
    public ReadClassificaDocumentoByParam createReadClassificaDocumentoByParam() {
        return new ReadClassificaDocumentoByParam();
    }

    /**
     * Create an instance of {@link UpdateStatusHierarchyInput }
     * 
     */
    public UpdateStatusHierarchyInput createUpdateStatusHierarchyInput() {
        return new UpdateStatusHierarchyInput();
    }

    /**
     * Create an instance of {@link DeleteCampiTipoFascicoloValueByParamResponse }
     * 
     */
    public DeleteCampiTipoFascicoloValueByParamResponse createDeleteCampiTipoFascicoloValueByParamResponse() {
        return new DeleteCampiTipoFascicoloValueByParamResponse();
    }

    /**
     * Create an instance of {@link SearchFascicoloByParamResponse }
     * 
     */
    public SearchFascicoloByParamResponse createSearchFascicoloByParamResponse() {
        return new SearchFascicoloByParamResponse();
    }

    /**
     * Create an instance of {@link ReadCampiTipoFascicoloByParamResponse }
     * 
     */
    public ReadCampiTipoFascicoloByParamResponse createReadCampiTipoFascicoloByParamResponse() {
        return new ReadCampiTipoFascicoloByParamResponse();
    }

    /**
     * Create an instance of {@link IsTipoFascicoloUsedByParamResponse }
     * 
     */
    public IsTipoFascicoloUsedByParamResponse createIsTipoFascicoloUsedByParamResponse() {
        return new IsTipoFascicoloUsedByParamResponse();
    }

    /**
     * Create an instance of {@link InsertTitolarioItemByParam }
     * 
     */
    public InsertTitolarioItemByParam createInsertTitolarioItemByParam() {
        return new InsertTitolarioItemByParam();
    }

    /**
     * Create an instance of {@link InsertDifformitaInput }
     * 
     */
    public InsertDifformitaInput createInsertDifformitaInput() {
        return new InsertDifformitaInput();
    }

    /**
     * Create an instance of {@link IsTipoFascicoloUsedInput }
     * 
     */
    public IsTipoFascicoloUsedInput createIsTipoFascicoloUsedInput() {
        return new IsTipoFascicoloUsedInput();
    }

    /**
     * Create an instance of {@link DeleteTitolarioByParamResponse }
     * 
     */
    public DeleteTitolarioByParamResponse createDeleteTitolarioByParamResponse() {
        return new DeleteTitolarioByParamResponse();
    }

    /**
     * Create an instance of {@link ReadClassificaCodeCollInput }
     * 
     */
    public ReadClassificaCodeCollInput createReadClassificaCodeCollInput() {
        return new ReadClassificaCodeCollInput();
    }

    /**
     * Create an instance of {@link TipoFascDiffValue }
     * 
     */
    public TipoFascDiffValue createTipoFascDiffValue() {
        return new TipoFascDiffValue();
    }

    /**
     * Create an instance of {@link ArrayOfTypeIdentifier }
     * 
     */
    public ArrayOfTypeIdentifier createArrayOfTypeIdentifier() {
        return new ArrayOfTypeIdentifier();
    }

    /**
     * Create an instance of {@link ReadOptionsInput }
     * 
     */
    public ReadOptionsInput createReadOptionsInput() {
        return new ReadOptionsInput();
    }

    /**
     * Create an instance of {@link InsertTitolarioTemplateInput }
     * 
     */
    public InsertTitolarioTemplateInput createInsertTitolarioTemplateInput() {
        return new InsertTitolarioTemplateInput();
    }

    /**
     * Create an instance of {@link CopyTipoFascicoloByParamResponse }
     * 
     */
    public CopyTipoFascicoloByParamResponse createCopyTipoFascicoloByParamResponse() {
        return new CopyTipoFascicoloByParamResponse();
    }

    /**
     * Create an instance of {@link TitolarioEntity }
     * 
     */
    public TitolarioEntity createTitolarioEntity() {
        return new TitolarioEntity();
    }

    /**
     * Create an instance of {@link IsTipoFascicoloUsedOutput }
     * 
     */
    public IsTipoFascicoloUsedOutput createIsTipoFascicoloUsedOutput() {
        return new IsTipoFascicoloUsedOutput();
    }

    /**
     * Create an instance of {@link PreservationClassificationNotEnabledFault }
     * 
     */
    public PreservationClassificationNotEnabledFault createPreservationClassificationNotEnabledFault() {
        return new PreservationClassificationNotEnabledFault();
    }

    /**
     * Create an instance of {@link InsertClassificaDocCollOutput }
     * 
     */
    public InsertClassificaDocCollOutput createInsertClassificaDocCollOutput() {
        return new InsertClassificaDocCollOutput();
    }

    /**
     * Create an instance of {@link DeleteCampiTipoFascicoloValueByParam }
     * 
     */
    public DeleteCampiTipoFascicoloValueByParam createDeleteCampiTipoFascicoloValueByParam() {
        return new DeleteCampiTipoFascicoloValueByParam();
    }

    /**
     * Create an instance of {@link GetTitolarioSonsByParamResponse }
     * 
     */
    public GetTitolarioSonsByParamResponse createGetTitolarioSonsByParamResponse() {
        return new GetTitolarioSonsByParamResponse();
    }

    /**
     * Create an instance of {@link SearchTitolarioItemsClassifyByParamResponse }
     * 
     */
    public SearchTitolarioItemsClassifyByParamResponse createSearchTitolarioItemsClassifyByParamResponse() {
        return new SearchTitolarioItemsClassifyByParamResponse();
    }

    /**
     * Create an instance of {@link CloseFascicoloInput }
     * 
     */
    public CloseFascicoloInput createCloseFascicoloInput() {
        return new CloseFascicoloInput();
    }

    /**
     * Create an instance of {@link DeleteClassificaDocumentoByParamResponse }
     * 
     */
    public DeleteClassificaDocumentoByParamResponse createDeleteClassificaDocumentoByParamResponse() {
        return new DeleteClassificaDocumentoByParamResponse();
    }

    /**
     * Create an instance of {@link DeleteCheckOutByParamResponse }
     * 
     */
    public DeleteCheckOutByParamResponse createDeleteCheckOutByParamResponse() {
        return new DeleteCheckOutByParamResponse();
    }

    /**
     * Create an instance of {@link InsertClassificaFascicoloByParamResponse }
     * 
     */
    public InsertClassificaFascicoloByParamResponse createInsertClassificaFascicoloByParamResponse() {
        return new InsertClassificaFascicoloByParamResponse();
    }

    /**
     * Create an instance of {@link ReadTitolarioItemByParamResponse }
     * 
     */
    public ReadTitolarioItemByParamResponse createReadTitolarioItemByParamResponse() {
        return new ReadTitolarioItemByParamResponse();
    }

    /**
     * Create an instance of {@link IsTitolarioItemValidByParam }
     * 
     */
    public IsTitolarioItemValidByParam createIsTitolarioItemValidByParam() {
        return new IsTitolarioItemValidByParam();
    }

    /**
     * Create an instance of {@link TitolarioSearcher }
     * 
     */
    public TitolarioSearcher createTitolarioSearcher() {
        return new TitolarioSearcher();
    }

    /**
     * Create an instance of {@link GetTitolarioItemSonsOutput }
     * 
     */
    public GetTitolarioItemSonsOutput createGetTitolarioItemSonsOutput() {
        return new GetTitolarioItemSonsOutput();
    }

    /**
     * Create an instance of {@link DeleteCheckOutTitolarioByParamResponse }
     * 
     */
    public DeleteCheckOutTitolarioByParamResponse createDeleteCheckOutTitolarioByParamResponse() {
        return new DeleteCheckOutTitolarioByParamResponse();
    }

    /**
     * Create an instance of {@link DeleteTitolarioInput }
     * 
     */
    public DeleteTitolarioInput createDeleteTitolarioInput() {
        return new DeleteTitolarioInput();
    }

    /**
     * Create an instance of {@link ReadTipoFascicoloInput }
     * 
     */
    public ReadTipoFascicoloInput createReadTipoFascicoloInput() {
        return new ReadTipoFascicoloInput();
    }

    /**
     * Create an instance of {@link SessionInfo }
     * 
     */
    public SessionInfo createSessionInfo() {
        return new SessionInfo();
    }

    /**
     * Create an instance of {@link GetClassificheValideByParam }
     * 
     */
    public GetClassificheValideByParam createGetClassificheValideByParam() {
        return new GetClassificheValideByParam();
    }

    /**
     * Create an instance of {@link DeleteCampiTipoFascicoloValueInput }
     * 
     */
    public DeleteCampiTipoFascicoloValueInput createDeleteCampiTipoFascicoloValueInput() {
        return new DeleteCampiTipoFascicoloValueInput();
    }

    /**
     * Create an instance of {@link ReadTitolarioItemBaseByParam }
     * 
     */
    public ReadTitolarioItemBaseByParam createReadTitolarioItemBaseByParam() {
        return new ReadTitolarioItemBaseByParam();
    }

    /**
     * Create an instance of {@link ReadFascicoloNotesInput }
     * 
     */
    public ReadFascicoloNotesInput createReadFascicoloNotesInput() {
        return new ReadFascicoloNotesInput();
    }

    /**
     * Create an instance of {@link ReadTitolarioItemByParam }
     * 
     */
    public ReadTitolarioItemByParam createReadTitolarioItemByParam() {
        return new ReadTitolarioItemByParam();
    }

    /**
     * Create an instance of {@link TitolarioIdentifier }
     * 
     */
    public TitolarioIdentifier createTitolarioIdentifier() {
        return new TitolarioIdentifier();
    }

    /**
     * Create an instance of {@link DeleteTipoFascicoloByParam }
     * 
     */
    public DeleteTipoFascicoloByParam createDeleteTipoFascicoloByParam() {
        return new DeleteTipoFascicoloByParam();
    }

    /**
     * Create an instance of {@link TitolarioTemplateEntity }
     * 
     */
    public TitolarioTemplateEntity createTitolarioTemplateEntity() {
        return new TitolarioTemplateEntity();
    }

    /**
     * Create an instance of {@link BaseValueObject }
     * 
     */
    public BaseValueObject createBaseValueObject() {
        return new BaseValueObject();
    }

    /**
     * Create an instance of {@link ReadTitolarioItemCollByParamResponse }
     * 
     */
    public ReadTitolarioItemCollByParamResponse createReadTitolarioItemCollByParamResponse() {
        return new ReadTitolarioItemCollByParamResponse();
    }

    /**
     * Create an instance of {@link ReadValoreCampiTipoFascicoloByParamResponse }
     * 
     */
    public ReadValoreCampiTipoFascicoloByParamResponse createReadValoreCampiTipoFascicoloByParamResponse() {
        return new ReadValoreCampiTipoFascicoloByParamResponse();
    }

    /**
     * Create an instance of {@link InsertTipoFascVisibilityByParamResponse }
     * 
     */
    public InsertTipoFascVisibilityByParamResponse createInsertTipoFascVisibilityByParamResponse() {
        return new InsertTipoFascVisibilityByParamResponse();
    }

    /**
     * Create an instance of {@link InsertClassificaDocCollByParamResponse }
     * 
     */
    public InsertClassificaDocCollByParamResponse createInsertClassificaDocCollByParamResponse() {
        return new InsertClassificaDocCollByParamResponse();
    }

    /**
     * Create an instance of {@link ArrayOfTipoFascicoloEntity }
     * 
     */
    public ArrayOfTipoFascicoloEntity createArrayOfTipoFascicoloEntity() {
        return new ArrayOfTipoFascicoloEntity();
    }

    /**
     * Create an instance of {@link SearchBaseFascicoloInput }
     * 
     */
    public SearchBaseFascicoloInput createSearchBaseFascicoloInput() {
        return new SearchBaseFascicoloInput();
    }

    /**
     * Create an instance of {@link ReadBaseTitolarioItemCollSortedByParam }
     * 
     */
    public ReadBaseTitolarioItemCollSortedByParam createReadBaseTitolarioItemCollSortedByParam() {
        return new ReadBaseTitolarioItemCollSortedByParam();
    }

    /**
     * Create an instance of {@link BaseFault }
     * 
     */
    public BaseFault createBaseFault() {
        return new BaseFault();
    }

    /**
     * Create an instance of {@link UpdateTitolarioItemOutput }
     * 
     */
    public UpdateTitolarioItemOutput createUpdateTitolarioItemOutput() {
        return new UpdateTitolarioItemOutput();
    }

    /**
     * Create an instance of {@link UpdateStatusTitolarioOutput }
     * 
     */
    public UpdateStatusTitolarioOutput createUpdateStatusTitolarioOutput() {
        return new UpdateStatusTitolarioOutput();
    }

    /**
     * Create an instance of {@link IsTitolarioUsedInput }
     * 
     */
    public IsTitolarioUsedInput createIsTitolarioUsedInput() {
        return new IsTitolarioUsedInput();
    }

    /**
     * Create an instance of {@link InsertOptionsByParamResponse }
     * 
     */
    public InsertOptionsByParamResponse createInsertOptionsByParamResponse() {
        return new InsertOptionsByParamResponse();
    }

    /**
     * Create an instance of {@link ReadFascicoloHistoryByParamResponse }
     * 
     */
    public ReadFascicoloHistoryByParamResponse createReadFascicoloHistoryByParamResponse() {
        return new ReadFascicoloHistoryByParamResponse();
    }

    /**
     * Create an instance of {@link UpdateStatusHierarchyByParam }
     * 
     */
    public UpdateStatusHierarchyByParam createUpdateStatusHierarchyByParam() {
        return new UpdateStatusHierarchyByParam();
    }

    /**
     * Create an instance of {@link GetFascicoloToPreserveByParamResponse }
     * 
     */
    public GetFascicoloToPreserveByParamResponse createGetFascicoloToPreserveByParamResponse() {
        return new GetFascicoloToPreserveByParamResponse();
    }

    /**
     * Create an instance of {@link ReadTitolarioItemCollSortedOutput }
     * 
     */
    public ReadTitolarioItemCollSortedOutput createReadTitolarioItemCollSortedOutput() {
        return new ReadTitolarioItemCollSortedOutput();
    }

    /**
     * Create an instance of {@link ReadBaseFascicoloInput }
     * 
     */
    public ReadBaseFascicoloInput createReadBaseFascicoloInput() {
        return new ReadBaseFascicoloInput();
    }

    /**
     * Create an instance of {@link DeleteCheckOutByParam }
     * 
     */
    public DeleteCheckOutByParam createDeleteCheckOutByParam() {
        return new DeleteCheckOutByParam();
    }

    /**
     * Create an instance of {@link ReadFascicoloVisibilityPrivacyOutput }
     * 
     */
    public ReadFascicoloVisibilityPrivacyOutput createReadFascicoloVisibilityPrivacyOutput() {
        return new ReadFascicoloVisibilityPrivacyOutput();
    }

    /**
     * Create an instance of {@link IsCampoTipoFascicoloUsedOutput }
     * 
     */
    public IsCampoTipoFascicoloUsedOutput createIsCampoTipoFascicoloUsedOutput() {
        return new IsCampoTipoFascicoloUsedOutput();
    }

    /**
     * Create an instance of {@link IsFascicoloUsedByParamResponse }
     * 
     */
    public IsFascicoloUsedByParamResponse createIsFascicoloUsedByParamResponse() {
        return new IsFascicoloUsedByParamResponse();
    }

    /**
     * Create an instance of {@link DeleteFascicoloDocumentoOutput }
     * 
     */
    public DeleteFascicoloDocumentoOutput createDeleteFascicoloDocumentoOutput() {
        return new DeleteFascicoloDocumentoOutput();
    }

    /**
     * Create an instance of {@link DeleteLegislaturaOutput }
     * 
     */
    public DeleteLegislaturaOutput createDeleteLegislaturaOutput() {
        return new DeleteLegislaturaOutput();
    }

    /**
     * Create an instance of {@link ReadFascicoloVisibilityOutput }
     * 
     */
    public ReadFascicoloVisibilityOutput createReadFascicoloVisibilityOutput() {
        return new ReadFascicoloVisibilityOutput();
    }

    /**
     * Create an instance of {@link ReadFascicoloHistoryByParam }
     * 
     */
    public ReadFascicoloHistoryByParam createReadFascicoloHistoryByParam() {
        return new ReadFascicoloHistoryByParam();
    }

    /**
     * Create an instance of {@link GetTitolarioSonsByParam }
     * 
     */
    public GetTitolarioSonsByParam createGetTitolarioSonsByParam() {
        return new GetTitolarioSonsByParam();
    }

    /**
     * Create an instance of {@link InsertTitolarioItemOutput }
     * 
     */
    public InsertTitolarioItemOutput createInsertTitolarioItemOutput() {
        return new InsertTitolarioItemOutput();
    }

    /**
     * Create an instance of {@link CheckOutTitolarioInput }
     * 
     */
    public CheckOutTitolarioInput createCheckOutTitolarioInput() {
        return new CheckOutTitolarioInput();
    }

    /**
     * Create an instance of {@link IsTipoFascicoloUsedByParam }
     * 
     */
    public IsTipoFascicoloUsedByParam createIsTipoFascicoloUsedByParam() {
        return new IsTipoFascicoloUsedByParam();
    }

    /**
     * Create an instance of {@link BaseVisibilityPrivacy }
     * 
     */
    public BaseVisibilityPrivacy createBaseVisibilityPrivacy() {
        return new BaseVisibilityPrivacy();
    }

    /**
     * Create an instance of {@link SetPrimaryClassificaDocumentoByParam }
     * 
     */
    public SetPrimaryClassificaDocumentoByParam createSetPrimaryClassificaDocumentoByParam() {
        return new SetPrimaryClassificaDocumentoByParam();
    }

    /**
     * Create an instance of {@link ReadBaseTitolarioByParam }
     * 
     */
    public ReadBaseTitolarioByParam createReadBaseTitolarioByParam() {
        return new ReadBaseTitolarioByParam();
    }

    /**
     * Create an instance of {@link TipoFascDiffIdentifier }
     * 
     */
    public TipoFascDiffIdentifier createTipoFascDiffIdentifier() {
        return new TipoFascDiffIdentifier();
    }

    /**
     * Create an instance of {@link BaseNote }
     * 
     */
    public BaseNote createBaseNote() {
        return new BaseNote();
    }

    /**
     * Create an instance of {@link ArrayOfCampiTipoFascicoloValue }
     * 
     */
    public ArrayOfCampiTipoFascicoloValue createArrayOfCampiTipoFascicoloValue() {
        return new ArrayOfCampiTipoFascicoloValue();
    }

    /**
     * Create an instance of {@link DeleteLegislaturaInput }
     * 
     */
    public DeleteLegislaturaInput createDeleteLegislaturaInput() {
        return new DeleteLegislaturaInput();
    }

    /**
     * Create an instance of {@link InsertTipoFascicoloByParam }
     * 
     */
    public InsertTipoFascicoloByParam createInsertTipoFascicoloByParam() {
        return new InsertTipoFascicoloByParam();
    }

    /**
     * Create an instance of {@link BaseVisibilityDesc }
     * 
     */
    public BaseVisibilityDesc createBaseVisibilityDesc() {
        return new BaseVisibilityDesc();
    }

    /**
     * Create an instance of {@link InsertCampiTipoFascicoloInput }
     * 
     */
    public InsertCampiTipoFascicoloInput createInsertCampiTipoFascicoloInput() {
        return new InsertCampiTipoFascicoloInput();
    }

    /**
     * Create an instance of {@link CopyTipoFascicoloOutput }
     * 
     */
    public CopyTipoFascicoloOutput createCopyTipoFascicoloOutput() {
        return new CopyTipoFascicoloOutput();
    }

    /**
     * Create an instance of {@link SendFascicoloOutput }
     * 
     */
    public SendFascicoloOutput createSendFascicoloOutput() {
        return new SendFascicoloOutput();
    }

    /**
     * Create an instance of {@link UpdatePreservedFascicoloByParam }
     * 
     */
    public UpdatePreservedFascicoloByParam createUpdatePreservedFascicoloByParam() {
        return new UpdatePreservedFascicoloByParam();
    }

    /**
     * Create an instance of {@link BaseTitolario }
     * 
     */
    public BaseTitolario createBaseTitolario() {
        return new BaseTitolario();
    }

    /**
     * Create an instance of {@link InsertFascicoloByParamResponse }
     * 
     */
    public InsertFascicoloByParamResponse createInsertFascicoloByParamResponse() {
        return new InsertFascicoloByParamResponse();
    }

    /**
     * Create an instance of {@link CampiTipoFascicoloIdentifier }
     * 
     */
    public CampiTipoFascicoloIdentifier createCampiTipoFascicoloIdentifier() {
        return new CampiTipoFascicoloIdentifier();
    }

    /**
     * Create an instance of {@link CampiTipoFascicolo }
     * 
     */
    public CampiTipoFascicolo createCampiTipoFascicolo() {
        return new CampiTipoFascicolo();
    }

    /**
     * Create an instance of {@link PrivacyEmptyFault }
     * 
     */
    public PrivacyEmptyFault createPrivacyEmptyFault() {
        return new PrivacyEmptyFault();
    }

    /**
     * Create an instance of {@link UpdateStatusTitolarioByParam }
     * 
     */
    public UpdateStatusTitolarioByParam createUpdateStatusTitolarioByParam() {
        return new UpdateStatusTitolarioByParam();
    }

    /**
     * Create an instance of {@link SetPrimaryClassificaDocumentoByParamResponse }
     * 
     */
    public SetPrimaryClassificaDocumentoByParamResponse createSetPrimaryClassificaDocumentoByParamResponse() {
        return new SetPrimaryClassificaDocumentoByParamResponse();
    }

    /**
     * Create an instance of {@link CopyTipoFascicoloByParam }
     * 
     */
    public CopyTipoFascicoloByParam createCopyTipoFascicoloByParam() {
        return new CopyTipoFascicoloByParam();
    }

    /**
     * Create an instance of {@link ArrayOfBaseFascicoloDocumento }
     * 
     */
    public ArrayOfBaseFascicoloDocumento createArrayOfBaseFascicoloDocumento() {
        return new ArrayOfBaseFascicoloDocumento();
    }

    /**
     * Create an instance of {@link InsertMultiClassificaDocCollByParamResponse }
     * 
     */
    public InsertMultiClassificaDocCollByParamResponse createInsertMultiClassificaDocCollByParamResponse() {
        return new InsertMultiClassificaDocCollByParamResponse();
    }

    /**
     * Create an instance of {@link InsertTitolarioInput }
     * 
     */
    public InsertTitolarioInput createInsertTitolarioInput() {
        return new InsertTitolarioInput();
    }

    /**
     * Create an instance of {@link DeleteClassificaDocumentoByParam }
     * 
     */
    public DeleteClassificaDocumentoByParam createDeleteClassificaDocumentoByParam() {
        return new DeleteClassificaDocumentoByParam();
    }

    /**
     * Create an instance of {@link FascicoloPreservationStatus }
     * 
     */
    public FascicoloPreservationStatus createFascicoloPreservationStatus() {
        return new FascicoloPreservationStatus();
    }

    /**
     * Create an instance of {@link CheckOutByParam }
     * 
     */
    public CheckOutByParam createCheckOutByParam() {
        return new CheckOutByParam();
    }

    /**
     * Create an instance of {@link BaseHistory }
     * 
     */
    public BaseHistory createBaseHistory() {
        return new BaseHistory();
    }

    /**
     * Create an instance of {@link IsFascicoloInCurrentTitolarioByParamResponse }
     * 
     */
    public IsFascicoloInCurrentTitolarioByParamResponse createIsFascicoloInCurrentTitolarioByParamResponse() {
        return new IsFascicoloInCurrentTitolarioByParamResponse();
    }

    /**
     * Create an instance of {@link FascicoloIdentifier }
     * 
     */
    public FascicoloIdentifier createFascicoloIdentifier() {
        return new FascicoloIdentifier();
    }

    /**
     * Create an instance of {@link IsCampoTipoFascicoloUsedByParamResponse }
     * 
     */
    public IsCampoTipoFascicoloUsedByParamResponse createIsCampoTipoFascicoloUsedByParamResponse() {
        return new IsCampoTipoFascicoloUsedByParamResponse();
    }

    /**
     * Create an instance of {@link ReadFascicoloHistoryOutput }
     * 
     */
    public ReadFascicoloHistoryOutput createReadFascicoloHistoryOutput() {
        return new ReadFascicoloHistoryOutput();
    }

    /**
     * Create an instance of {@link DeleteCheckOutTitolarioItemByParamResponse }
     * 
     */
    public DeleteCheckOutTitolarioItemByParamResponse createDeleteCheckOutTitolarioItemByParamResponse() {
        return new DeleteCheckOutTitolarioItemByParamResponse();
    }

    /**
     * Create an instance of {@link UpdateStatoFascicoloByParam }
     * 
     */
    public UpdateStatoFascicoloByParam createUpdateStatoFascicoloByParam() {
        return new UpdateStatoFascicoloByParam();
    }

    /**
     * Create an instance of {@link DeleteCheckOutTitolarioItemByParam }
     * 
     */
    public DeleteCheckOutTitolarioItemByParam createDeleteCheckOutTitolarioItemByParam() {
        return new DeleteCheckOutTitolarioItemByParam();
    }

    /**
     * Create an instance of {@link DeleteTitolarioOutput }
     * 
     */
    public DeleteTitolarioOutput createDeleteTitolarioOutput() {
        return new DeleteTitolarioOutput();
    }

    /**
     * Create an instance of {@link UpdateStatusTitolarioByParamResponse }
     * 
     */
    public UpdateStatusTitolarioByParamResponse createUpdateStatusTitolarioByParamResponse() {
        return new UpdateStatusTitolarioByParamResponse();
    }

    /**
     * Create an instance of {@link ArrayOfBaseTitolarioItem }
     * 
     */
    public ArrayOfBaseTitolarioItem createArrayOfBaseTitolarioItem() {
        return new ArrayOfBaseTitolarioItem();
    }

    /**
     * Create an instance of {@link UpdateFascicoloByParamResponse }
     * 
     */
    public UpdateFascicoloByParamResponse createUpdateFascicoloByParamResponse() {
        return new UpdateFascicoloByParamResponse();
    }

    /**
     * Create an instance of {@link ClassificaDocumentoEntity }
     * 
     */
    public ClassificaDocumentoEntity createClassificaDocumentoEntity() {
        return new ClassificaDocumentoEntity();
    }

    /**
     * Create an instance of {@link InsertTitolarioItemByParamResponse }
     * 
     */
    public InsertTitolarioItemByParamResponse createInsertTitolarioItemByParamResponse() {
        return new InsertTitolarioItemByParamResponse();
    }

    /**
     * Create an instance of {@link ReadTitolarioTemplateOutput }
     * 
     */
    public ReadTitolarioTemplateOutput createReadTitolarioTemplateOutput() {
        return new ReadTitolarioTemplateOutput();
    }

    /**
     * Create an instance of {@link DeleteTitolarioItemByTitolarioIdByParamResponse }
     * 
     */
    public DeleteTitolarioItemByTitolarioIdByParamResponse createDeleteTitolarioItemByTitolarioIdByParamResponse() {
        return new DeleteTitolarioItemByTitolarioIdByParamResponse();
    }

    /**
     * Create an instance of {@link IsTitolarioItemValidByParamResponse }
     * 
     */
    public IsTitolarioItemValidByParamResponse createIsTitolarioItemValidByParamResponse() {
        return new IsTitolarioItemValidByParamResponse();
    }

    /**
     * Create an instance of {@link ReadFascicoloVisibilityPrivacyInput }
     * 
     */
    public ReadFascicoloVisibilityPrivacyInput createReadFascicoloVisibilityPrivacyInput() {
        return new ReadFascicoloVisibilityPrivacyInput();
    }

    /**
     * Create an instance of {@link UpdatePreservedFascicoloOutput }
     * 
     */
    public UpdatePreservedFascicoloOutput createUpdatePreservedFascicoloOutput() {
        return new UpdatePreservedFascicoloOutput();
    }

    /**
     * Create an instance of {@link ReadFascicoloNotesByParamResponse }
     * 
     */
    public ReadFascicoloNotesByParamResponse createReadFascicoloNotesByParamResponse() {
        return new ReadFascicoloNotesByParamResponse();
    }

    /**
     * Create an instance of {@link ReadFascicoloOutput }
     * 
     */
    public ReadFascicoloOutput createReadFascicoloOutput() {
        return new ReadFascicoloOutput();
    }

    /**
     * Create an instance of {@link ArrayOfFascicoloDocumentoEntity }
     * 
     */
    public ArrayOfFascicoloDocumentoEntity createArrayOfFascicoloDocumentoEntity() {
        return new ArrayOfFascicoloDocumentoEntity();
    }

    /**
     * Create an instance of {@link ArrayOfOggettarioCfg }
     * 
     */
    public ArrayOfOggettarioCfg createArrayOfOggettarioCfg() {
        return new ArrayOfOggettarioCfg();
    }

    /**
     * Create an instance of {@link InsertMultiClassificaDocCollOutput }
     * 
     */
    public InsertMultiClassificaDocCollOutput createInsertMultiClassificaDocCollOutput() {
        return new InsertMultiClassificaDocCollOutput();
    }

    /**
     * Create an instance of {@link ReadBaseTitolarioItemCollSortedByParamResponse }
     * 
     */
    public ReadBaseTitolarioItemCollSortedByParamResponse createReadBaseTitolarioItemCollSortedByParamResponse() {
        return new ReadBaseTitolarioItemCollSortedByParamResponse();
    }

    /**
     * Create an instance of {@link ReadFascicoloHierarchyOutput }
     * 
     */
    public ReadFascicoloHierarchyOutput createReadFascicoloHierarchyOutput() {
        return new ReadFascicoloHierarchyOutput();
    }

    /**
     * Create an instance of {@link ReadDifformitaByParamResponse }
     * 
     */
    public ReadDifformitaByParamResponse createReadDifformitaByParamResponse() {
        return new ReadDifformitaByParamResponse();
    }

    /**
     * Create an instance of {@link ReadBaseTitolarioItemCollSortedInput }
     * 
     */
    public ReadBaseTitolarioItemCollSortedInput createReadBaseTitolarioItemCollSortedInput() {
        return new ReadBaseTitolarioItemCollSortedInput();
    }

    /**
     * Create an instance of {@link IsCampoTipoFascicoloUsedInput }
     * 
     */
    public IsCampoTipoFascicoloUsedInput createIsCampoTipoFascicoloUsedInput() {
        return new IsCampoTipoFascicoloUsedInput();
    }

    /**
     * Create an instance of {@link CoupleIdentifier }
     * 
     */
    public CoupleIdentifier createCoupleIdentifier() {
        return new CoupleIdentifier();
    }

    /**
     * Create an instance of {@link ReadTitolarioItemCollInput }
     * 
     */
    public ReadTitolarioItemCollInput createReadTitolarioItemCollInput() {
        return new ReadTitolarioItemCollInput();
    }

    /**
     * Create an instance of {@link GetTitolarioItemCodeByParamResponse }
     * 
     */
    public GetTitolarioItemCodeByParamResponse createGetTitolarioItemCodeByParamResponse() {
        return new GetTitolarioItemCodeByParamResponse();
    }

    /**
     * Create an instance of {@link ReadBaseFascicoloOutput }
     * 
     */
    public ReadBaseFascicoloOutput createReadBaseFascicoloOutput() {
        return new ReadBaseFascicoloOutput();
    }

    /**
     * Create an instance of {@link UpdateValidToDateTitolarioItemOutput }
     * 
     */
    public UpdateValidToDateTitolarioItemOutput createUpdateValidToDateTitolarioItemOutput() {
        return new UpdateValidToDateTitolarioItemOutput();
    }

    /**
     * Create an instance of {@link CloseFascicoloByParam }
     * 
     */
    public CloseFascicoloByParam createCloseFascicoloByParam() {
        return new CloseFascicoloByParam();
    }

    /**
     * Create an instance of {@link UpdateTitolarioByParamResponse }
     * 
     */
    public UpdateTitolarioByParamResponse createUpdateTitolarioByParamResponse() {
        return new UpdateTitolarioByParamResponse();
    }

    /**
     * Create an instance of {@link LegislaturaIdentifier }
     * 
     */
    public LegislaturaIdentifier createLegislaturaIdentifier() {
        return new LegislaturaIdentifier();
    }

    /**
     * Create an instance of {@link UpdateClassificaFascicoloOutput }
     * 
     */
    public UpdateClassificaFascicoloOutput createUpdateClassificaFascicoloOutput() {
        return new UpdateClassificaFascicoloOutput();
    }

    /**
     * Create an instance of {@link InsertCampiTipoFascicoloByParamResponse }
     * 
     */
    public InsertCampiTipoFascicoloByParamResponse createInsertCampiTipoFascicoloByParamResponse() {
        return new InsertCampiTipoFascicoloByParamResponse();
    }

    /**
     * Create an instance of {@link DeleteClassificaDocumentoInput }
     * 
     */
    public DeleteClassificaDocumentoInput createDeleteClassificaDocumentoInput() {
        return new DeleteClassificaDocumentoInput();
    }

    /**
     * Create an instance of {@link SearchTitolarioItemsClassifyInput }
     * 
     */
    public SearchTitolarioItemsClassifyInput createSearchTitolarioItemsClassifyInput() {
        return new SearchTitolarioItemsClassifyInput();
    }

    /**
     * Create an instance of {@link InsertValoreCampiTipoFascicoloInput }
     * 
     */
    public InsertValoreCampiTipoFascicoloInput createInsertValoreCampiTipoFascicoloInput() {
        return new InsertValoreCampiTipoFascicoloInput();
    }

    /**
     * Create an instance of {@link ArrayOfBaseFascicolo }
     * 
     */
    public ArrayOfBaseFascicolo createArrayOfBaseFascicolo() {
        return new ArrayOfBaseFascicolo();
    }

    /**
     * Create an instance of {@link ArrayOfFascicoloPreservation }
     * 
     */
    public ArrayOfFascicoloPreservation createArrayOfFascicoloPreservation() {
        return new ArrayOfFascicoloPreservation();
    }

    /**
     * Create an instance of {@link ReadBaseTitolarioItemCollInput }
     * 
     */
    public ReadBaseTitolarioItemCollInput createReadBaseTitolarioItemCollInput() {
        return new ReadBaseTitolarioItemCollInput();
    }

    /**
     * Create an instance of {@link ReadCardsInFolderInput }
     * 
     */
    public ReadCardsInFolderInput createReadCardsInFolderInput() {
        return new ReadCardsInFolderInput();
    }

    /**
     * Create an instance of {@link ReadBaseTitolarioOutput }
     * 
     */
    public ReadBaseTitolarioOutput createReadBaseTitolarioOutput() {
        return new ReadBaseTitolarioOutput();
    }

    /**
     * Create an instance of {@link InsertTitolarioItemInput }
     * 
     */
    public InsertTitolarioItemInput createInsertTitolarioItemInput() {
        return new InsertTitolarioItemInput();
    }

    /**
     * Create an instance of {@link IsTitolarioItemUsedByParamResponse }
     * 
     */
    public IsTitolarioItemUsedByParamResponse createIsTitolarioItemUsedByParamResponse() {
        return new IsTitolarioItemUsedByParamResponse();
    }

    /**
     * Create an instance of {@link DeleteCheckOutTitolarioOutput }
     * 
     */
    public DeleteCheckOutTitolarioOutput createDeleteCheckOutTitolarioOutput() {
        return new DeleteCheckOutTitolarioOutput();
    }

    /**
     * Create an instance of {@link ReadValoreCampiTipoFascicoloOutput }
     * 
     */
    public ReadValoreCampiTipoFascicoloOutput createReadValoreCampiTipoFascicoloOutput() {
        return new ReadValoreCampiTipoFascicoloOutput();
    }

    /**
     * Create an instance of {@link ReadTitolarioItemBaseOutput }
     * 
     */
    public ReadTitolarioItemBaseOutput createReadTitolarioItemBaseOutput() {
        return new ReadTitolarioItemBaseOutput();
    }

    /**
     * Create an instance of {@link DocumentIdentifier }
     * 
     */
    public DocumentIdentifier createDocumentIdentifier() {
        return new DocumentIdentifier();
    }

    /**
     * Create an instance of {@link UpdateTipoFascicoloByParamResponse }
     * 
     */
    public UpdateTipoFascicoloByParamResponse createUpdateTipoFascicoloByParamResponse() {
        return new UpdateTipoFascicoloByParamResponse();
    }

    /**
     * Create an instance of {@link FascicoloHistory }
     * 
     */
    public FascicoloHistory createFascicoloHistory() {
        return new FascicoloHistory();
    }

    /**
     * Create an instance of {@link DeleteFascicoloByParam }
     * 
     */
    public DeleteFascicoloByParam createDeleteFascicoloByParam() {
        return new DeleteFascicoloByParam();
    }

    /**
     * Create an instance of {@link DeleteTitolarioItemByTitolarioIdByParam }
     * 
     */
    public DeleteTitolarioItemByTitolarioIdByParam createDeleteTitolarioItemByTitolarioIdByParam() {
        return new DeleteTitolarioItemByTitolarioIdByParam();
    }

    /**
     * Create an instance of {@link ReadFascicoloNotesOutput }
     * 
     */
    public ReadFascicoloNotesOutput createReadFascicoloNotesOutput() {
        return new ReadFascicoloNotesOutput();
    }

    /**
     * Create an instance of {@link RecoveryFascicoloOutput }
     * 
     */
    public RecoveryFascicoloOutput createRecoveryFascicoloOutput() {
        return new RecoveryFascicoloOutput();
    }

    /**
     * Create an instance of {@link SendFascicoloInput }
     * 
     */
    public SendFascicoloInput createSendFascicoloInput() {
        return new SendFascicoloInput();
    }

    /**
     * Create an instance of {@link UpdateTitolarioOutput }
     * 
     */
    public UpdateTitolarioOutput createUpdateTitolarioOutput() {
        return new UpdateTitolarioOutput();
    }

    /**
     * Create an instance of {@link InsertFascicoloInput }
     * 
     */
    public InsertFascicoloInput createInsertFascicoloInput() {
        return new InsertFascicoloInput();
    }

    /**
     * Create an instance of {@link DeleteTitolarioTemplateOutput }
     * 
     */
    public DeleteTitolarioTemplateOutput createDeleteTitolarioTemplateOutput() {
        return new DeleteTitolarioTemplateOutput();
    }

    /**
     * Create an instance of {@link ReadFascicoloHistoryInput }
     * 
     */
    public ReadFascicoloHistoryInput createReadFascicoloHistoryInput() {
        return new ReadFascicoloHistoryInput();
    }

    /**
     * Create an instance of {@link GetClassificheValideInput }
     * 
     */
    public GetClassificheValideInput createGetClassificheValideInput() {
        return new GetClassificheValideInput();
    }

    /**
     * Create an instance of {@link InsertTitolarioTemplateOutput }
     * 
     */
    public InsertTitolarioTemplateOutput createInsertTitolarioTemplateOutput() {
        return new InsertTitolarioTemplateOutput();
    }

    /**
     * Create an instance of {@link CheckOutInput }
     * 
     */
    public CheckOutInput createCheckOutInput() {
        return new CheckOutInput();
    }

    /**
     * Create an instance of {@link InsertDifformitaByParamResponse }
     * 
     */
    public InsertDifformitaByParamResponse createInsertDifformitaByParamResponse() {
        return new InsertDifformitaByParamResponse();
    }

    /**
     * Create an instance of {@link InsertCampiTipoFascicoloByParam }
     * 
     */
    public InsertCampiTipoFascicoloByParam createInsertCampiTipoFascicoloByParam() {
        return new InsertCampiTipoFascicoloByParam();
    }

    /**
     * Create an instance of {@link InsertCampiTipoFascicoloOutput }
     * 
     */
    public InsertCampiTipoFascicoloOutput createInsertCampiTipoFascicoloOutput() {
        return new InsertCampiTipoFascicoloOutput();
    }

    /**
     * Create an instance of {@link UpdateTitolarioItemInput }
     * 
     */
    public UpdateTitolarioItemInput createUpdateTitolarioItemInput() {
        return new UpdateTitolarioItemInput();
    }

    /**
     * Create an instance of {@link DeleteAllFascicoliDelByParamResponse }
     * 
     */
    public DeleteAllFascicoliDelByParamResponse createDeleteAllFascicoliDelByParamResponse() {
        return new DeleteAllFascicoliDelByParamResponse();
    }

    /**
     * Create an instance of {@link SearchTitolarioItemsClassifyByParam }
     * 
     */
    public SearchTitolarioItemsClassifyByParam createSearchTitolarioItemsClassifyByParam() {
        return new SearchTitolarioItemsClassifyByParam();
    }

    /**
     * Create an instance of {@link SetPrimaryFascicoloDocumentoOutput }
     * 
     */
    public SetPrimaryFascicoloDocumentoOutput createSetPrimaryFascicoloDocumentoOutput() {
        return new SetPrimaryFascicoloDocumentoOutput();
    }

    /**
     * Create an instance of {@link UpdateLegislaturaOutput }
     * 
     */
    public UpdateLegislaturaOutput createUpdateLegislaturaOutput() {
        return new UpdateLegislaturaOutput();
    }

    /**
     * Create an instance of {@link ReadBaseTitolarioItemCollByParamResponse }
     * 
     */
    public ReadBaseTitolarioItemCollByParamResponse createReadBaseTitolarioItemCollByParamResponse() {
        return new ReadBaseTitolarioItemCollByParamResponse();
    }

    /**
     * Create an instance of {@link ReadFascicoloByParamResponse }
     * 
     */
    public ReadFascicoloByParamResponse createReadFascicoloByParamResponse() {
        return new ReadFascicoloByParamResponse();
    }

    /**
     * Create an instance of {@link CheckInByParam }
     * 
     */
    public CheckInByParam createCheckInByParam() {
        return new CheckInByParam();
    }

    /**
     * Create an instance of {@link InsertFascicoloNoteInput }
     * 
     */
    public InsertFascicoloNoteInput createInsertFascicoloNoteInput() {
        return new InsertFascicoloNoteInput();
    }

    /**
     * Create an instance of {@link DeleteTitolarioByParam }
     * 
     */
    public DeleteTitolarioByParam createDeleteTitolarioByParam() {
        return new DeleteTitolarioByParam();
    }

    /**
     * Create an instance of {@link ReadBaseTitolarioItemCollSortedOutput }
     * 
     */
    public ReadBaseTitolarioItemCollSortedOutput createReadBaseTitolarioItemCollSortedOutput() {
        return new ReadBaseTitolarioItemCollSortedOutput();
    }

    /**
     * Create an instance of {@link UpdateTipoFascicoloOutput }
     * 
     */
    public UpdateTipoFascicoloOutput createUpdateTipoFascicoloOutput() {
        return new UpdateTipoFascicoloOutput();
    }

    /**
     * Create an instance of {@link SearchTitolarioItemsIdByParam }
     * 
     */
    public SearchTitolarioItemsIdByParam createSearchTitolarioItemsIdByParam() {
        return new SearchTitolarioItemsIdByParam();
    }

    /**
     * Create an instance of {@link InsertValoreCampiTipoFascicoloByParamResponse }
     * 
     */
    public InsertValoreCampiTipoFascicoloByParamResponse createInsertValoreCampiTipoFascicoloByParamResponse() {
        return new InsertValoreCampiTipoFascicoloByParamResponse();
    }

    /**
     * Create an instance of {@link UpdateValidToDateTitolarioItemByParamResponse }
     * 
     */
    public UpdateValidToDateTitolarioItemByParamResponse createUpdateValidToDateTitolarioItemByParamResponse() {
        return new UpdateValidToDateTitolarioItemByParamResponse();
    }

    /**
     * Create an instance of {@link OggettarioCfg }
     * 
     */
    public OggettarioCfg createOggettarioCfg() {
        return new OggettarioCfg();
    }

    /**
     * Create an instance of {@link ClassificationExceptionDetail }
     * 
     */
    public ClassificationExceptionDetail createClassificationExceptionDetail() {
        return new ClassificationExceptionDetail();
    }

    /**
     * Create an instance of {@link UpdateTipoFascicoloInput }
     * 
     */
    public UpdateTipoFascicoloInput createUpdateTipoFascicoloInput() {
        return new UpdateTipoFascicoloInput();
    }

    /**
     * Create an instance of {@link IsTitolarioItemUsedOutput }
     * 
     */
    public IsTitolarioItemUsedOutput createIsTitolarioItemUsedOutput() {
        return new IsTitolarioItemUsedOutput();
    }

    /**
     * Create an instance of {@link FascicoloPreservation }
     * 
     */
    public FascicoloPreservation createFascicoloPreservation() {
        return new FascicoloPreservation();
    }

    /**
     * Create an instance of {@link UpdateTipoFascicoloByParam }
     * 
     */
    public UpdateTipoFascicoloByParam createUpdateTipoFascicoloByParam() {
        return new UpdateTipoFascicoloByParam();
    }

    /**
     * Create an instance of {@link UpdateCampiTipoFascicoloByParam }
     * 
     */
    public UpdateCampiTipoFascicoloByParam createUpdateCampiTipoFascicoloByParam() {
        return new UpdateCampiTipoFascicoloByParam();
    }

    /**
     * Create an instance of {@link UpdateTitolarioTemplateInput }
     * 
     */
    public UpdateTitolarioTemplateInput createUpdateTitolarioTemplateInput() {
        return new UpdateTitolarioTemplateInput();
    }

    /**
     * Create an instance of {@link InsertFascicoloNoteByParam }
     * 
     */
    public InsertFascicoloNoteByParam createInsertFascicoloNoteByParam() {
        return new InsertFascicoloNoteByParam();
    }

    /**
     * Create an instance of {@link FascicoloSearcher }
     * 
     */
    public FascicoloSearcher createFascicoloSearcher() {
        return new FascicoloSearcher();
    }

    /**
     * Create an instance of {@link UpdateValidToDateTitolarioOutput }
     * 
     */
    public UpdateValidToDateTitolarioOutput createUpdateValidToDateTitolarioOutput() {
        return new UpdateValidToDateTitolarioOutput();
    }

    /**
     * Create an instance of {@link DuplicatedArchivalNumberFault }
     * 
     */
    public DuplicatedArchivalNumberFault createDuplicatedArchivalNumberFault() {
        return new DuplicatedArchivalNumberFault();
    }

    /**
     * Create an instance of {@link UpdateStatoFascicoloOutput }
     * 
     */
    public UpdateStatoFascicoloOutput createUpdateStatoFascicoloOutput() {
        return new UpdateStatoFascicoloOutput();
    }

    /**
     * Create an instance of {@link CheckOutOutput }
     * 
     */
    public CheckOutOutput createCheckOutOutput() {
        return new CheckOutOutput();
    }

    /**
     * Create an instance of {@link UpdateClassificaFascicoloInput }
     * 
     */
    public UpdateClassificaFascicoloInput createUpdateClassificaFascicoloInput() {
        return new UpdateClassificaFascicoloInput();
    }

    /**
     * Create an instance of {@link InsertLegislaturaByParamResponse }
     * 
     */
    public InsertLegislaturaByParamResponse createInsertLegislaturaByParamResponse() {
        return new InsertLegislaturaByParamResponse();
    }

    /**
     * Create an instance of {@link GetTitolarioItemSonsByParamResponse }
     * 
     */
    public GetTitolarioItemSonsByParamResponse createGetTitolarioItemSonsByParamResponse() {
        return new GetTitolarioItemSonsByParamResponse();
    }

    /**
     * Create an instance of {@link ReadTitolarioByParam }
     * 
     */
    public ReadTitolarioByParam createReadTitolarioByParam() {
        return new ReadTitolarioByParam();
    }

    /**
     * Create an instance of {@link FascicoloDocIdentifier }
     * 
     */
    public FascicoloDocIdentifier createFascicoloDocIdentifier() {
        return new FascicoloDocIdentifier();
    }

    /**
     * Create an instance of {@link IsFascicoloInCurrentTitolarioOutput }
     * 
     */
    public IsFascicoloInCurrentTitolarioOutput createIsFascicoloInCurrentTitolarioOutput() {
        return new IsFascicoloInCurrentTitolarioOutput();
    }

    /**
     * Create an instance of {@link ReadTipoDocDefaultTitolarioItemCollByParam }
     * 
     */
    public ReadTipoDocDefaultTitolarioItemCollByParam createReadTipoDocDefaultTitolarioItemCollByParam() {
        return new ReadTipoDocDefaultTitolarioItemCollByParam();
    }

    /**
     * Create an instance of {@link GetTitolarioSonsOutput }
     * 
     */
    public GetTitolarioSonsOutput createGetTitolarioSonsOutput() {
        return new GetTitolarioSonsOutput();
    }

    /**
     * Create an instance of {@link ReadClassFascDocumentoOutput }
     * 
     */
    public ReadClassFascDocumentoOutput createReadClassFascDocumentoOutput() {
        return new ReadClassFascDocumentoOutput();
    }

    /**
     * Create an instance of {@link UpdateFascicoloInput }
     * 
     */
    public UpdateFascicoloInput createUpdateFascicoloInput() {
        return new UpdateFascicoloInput();
    }

    /**
     * Create an instance of {@link DateIdentifier }
     * 
     */
    public DateIdentifier createDateIdentifier() {
        return new DateIdentifier();
    }

    /**
     * Create an instance of {@link FascicoloEntity }
     * 
     */
    public FascicoloEntity createFascicoloEntity() {
        return new FascicoloEntity();
    }

    /**
     * Create an instance of {@link ReadBaseFascicoloByParamResponse }
     * 
     */
    public ReadBaseFascicoloByParamResponse createReadBaseFascicoloByParamResponse() {
        return new ReadBaseFascicoloByParamResponse();
    }

    /**
     * Create an instance of {@link TitolarioTemplateIdentifier }
     * 
     */
    public TitolarioTemplateIdentifier createTitolarioTemplateIdentifier() {
        return new TitolarioTemplateIdentifier();
    }

    /**
     * Create an instance of {@link ReadTipoFascVisibilityOutput }
     * 
     */
    public ReadTipoFascVisibilityOutput createReadTipoFascVisibilityOutput() {
        return new ReadTipoFascVisibilityOutput();
    }

    /**
     * Create an instance of {@link ArrayOfTitolarioItemEntity }
     * 
     */
    public ArrayOfTitolarioItemEntity createArrayOfTitolarioItemEntity() {
        return new ArrayOfTitolarioItemEntity();
    }

    /**
     * Create an instance of {@link ArrayOfint }
     * 
     */
    public ArrayOfint createArrayOfint() {
        return new ArrayOfint();
    }

    /**
     * Create an instance of {@link CheckOutTitolarioItemByParamResponse }
     * 
     */
    public CheckOutTitolarioItemByParamResponse createCheckOutTitolarioItemByParamResponse() {
        return new CheckOutTitolarioItemByParamResponse();
    }

    /**
     * Create an instance of {@link BaseFascicolo }
     * 
     */
    public BaseFascicolo createBaseFascicolo() {
        return new BaseFascicolo();
    }

    /**
     * Create an instance of {@link TypeIdentifierComplete }
     * 
     */
    public TypeIdentifierComplete createTypeIdentifierComplete() {
        return new TypeIdentifierComplete();
    }

    /**
     * Create an instance of {@link ReadTitolarioTemplateByParam }
     * 
     */
    public ReadTitolarioTemplateByParam createReadTitolarioTemplateByParam() {
        return new ReadTitolarioTemplateByParam();
    }

    /**
     * Create an instance of {@link UpdateStatusHierarchyByParamResponse }
     * 
     */
    public UpdateStatusHierarchyByParamResponse createUpdateStatusHierarchyByParamResponse() {
        return new UpdateStatusHierarchyByParamResponse();
    }

    /**
     * Create an instance of {@link InsertMultiClassificaDocCollInput }
     * 
     */
    public InsertMultiClassificaDocCollInput createInsertMultiClassificaDocCollInput() {
        return new InsertMultiClassificaDocCollInput();
    }

    /**
     * Create an instance of {@link InsertTitolarioByParam }
     * 
     */
    public InsertTitolarioByParam createInsertTitolarioByParam() {
        return new InsertTitolarioByParam();
    }

    /**
     * Create an instance of {@link TitolarioItemSearcher }
     * 
     */
    public TitolarioItemSearcher createTitolarioItemSearcher() {
        return new TitolarioItemSearcher();
    }

    /**
     * Create an instance of {@link IsTitolarioItemUsedInput }
     * 
     */
    public IsTitolarioItemUsedInput createIsTitolarioItemUsedInput() {
        return new IsTitolarioItemUsedInput();
    }

    /**
     * Create an instance of {@link DeleteTitolarioItemByPrimaryKeyInput }
     * 
     */
    public DeleteTitolarioItemByPrimaryKeyInput createDeleteTitolarioItemByPrimaryKeyInput() {
        return new DeleteTitolarioItemByPrimaryKeyInput();
    }

    /**
     * Create an instance of {@link DeleteLegislaturaByParamResponse }
     * 
     */
    public DeleteLegislaturaByParamResponse createDeleteLegislaturaByParamResponse() {
        return new DeleteLegislaturaByParamResponse();
    }

    /**
     * Create an instance of {@link BaseVisibility }
     * 
     */
    public BaseVisibility createBaseVisibility() {
        return new BaseVisibility();
    }

    /**
     * Create an instance of {@link UpdateTitolarioInput }
     * 
     */
    public UpdateTitolarioInput createUpdateTitolarioInput() {
        return new UpdateTitolarioInput();
    }

    /**
     * Create an instance of {@link DeleteFascicoloDocumentoByParamResponse }
     * 
     */
    public DeleteFascicoloDocumentoByParamResponse createDeleteFascicoloDocumentoByParamResponse() {
        return new DeleteFascicoloDocumentoByParamResponse();
    }

    /**
     * Create an instance of {@link ReadFascicoloDocumentoInput }
     * 
     */
    public ReadFascicoloDocumentoInput createReadFascicoloDocumentoInput() {
        return new ReadFascicoloDocumentoInput();
    }

    /**
     * Create an instance of {@link DeleteTipoFascicoloOutput }
     * 
     */
    public DeleteTipoFascicoloOutput createDeleteTipoFascicoloOutput() {
        return new DeleteTipoFascicoloOutput();
    }

    /**
     * Create an instance of {@link IsCampoTipoFascicoloUsedByParam }
     * 
     */
    public IsCampoTipoFascicoloUsedByParam createIsCampoTipoFascicoloUsedByParam() {
        return new IsCampoTipoFascicoloUsedByParam();
    }

    /**
     * Create an instance of {@link SearchBaseFascicoloOutput }
     * 
     */
    public SearchBaseFascicoloOutput createSearchBaseFascicoloOutput() {
        return new SearchBaseFascicoloOutput();
    }

    /**
     * Create an instance of {@link ArrayOfBaseTitolario }
     * 
     */
    public ArrayOfBaseTitolario createArrayOfBaseTitolario() {
        return new ArrayOfBaseTitolario();
    }

    /**
     * Create an instance of {@link ReadClassFascDocumentoByParam }
     * 
     */
    public ReadClassFascDocumentoByParam createReadClassFascDocumentoByParam() {
        return new ReadClassFascDocumentoByParam();
    }

    /**
     * Create an instance of {@link UpdateCampiTipoFascicoloInput }
     * 
     */
    public UpdateCampiTipoFascicoloInput createUpdateCampiTipoFascicoloInput() {
        return new UpdateCampiTipoFascicoloInput();
    }

    /**
     * Create an instance of {@link ArrayOfEntityAccess }
     * 
     */
    public ArrayOfEntityAccess createArrayOfEntityAccess() {
        return new ArrayOfEntityAccess();
    }

    /**
     * Create an instance of {@link TipoFascicoloEntity }
     * 
     */
    public TipoFascicoloEntity createTipoFascicoloEntity() {
        return new TipoFascicoloEntity();
    }

    /**
     * Create an instance of {@link DeleteAllFascicoliDelByParam }
     * 
     */
    public DeleteAllFascicoliDelByParam createDeleteAllFascicoliDelByParam() {
        return new DeleteAllFascicoliDelByParam();
    }

    /**
     * Create an instance of {@link UpdatePreservedFascicoloInput }
     * 
     */
    public UpdatePreservedFascicoloInput createUpdatePreservedFascicoloInput() {
        return new UpdatePreservedFascicoloInput();
    }

    /**
     * Create an instance of {@link DeleteFascicoloDocumentoByParam }
     * 
     */
    public DeleteFascicoloDocumentoByParam createDeleteFascicoloDocumentoByParam() {
        return new DeleteFascicoloDocumentoByParam();
    }

    /**
     * Create an instance of {@link UpdateTitolarioItemByParam }
     * 
     */
    public UpdateTitolarioItemByParam createUpdateTitolarioItemByParam() {
        return new UpdateTitolarioItemByParam();
    }

    /**
     * Create an instance of {@link ReadCampiTipoFascicoloByParam }
     * 
     */
    public ReadCampiTipoFascicoloByParam createReadCampiTipoFascicoloByParam() {
        return new ReadCampiTipoFascicoloByParam();
    }

    /**
     * Create an instance of {@link UpdateCampiTipoFascicoloOutput }
     * 
     */
    public UpdateCampiTipoFascicoloOutput createUpdateCampiTipoFascicoloOutput() {
        return new UpdateCampiTipoFascicoloOutput();
    }

    /**
     * Create an instance of {@link ReadFascicoloVisibilityPrivacyByParam }
     * 
     */
    public ReadFascicoloVisibilityPrivacyByParam createReadFascicoloVisibilityPrivacyByParam() {
        return new ReadFascicoloVisibilityPrivacyByParam();
    }

    /**
     * Create an instance of {@link DeleteTitolarioTemplateByParam }
     * 
     */
    public DeleteTitolarioTemplateByParam createDeleteTitolarioTemplateByParam() {
        return new DeleteTitolarioTemplateByParam();
    }

    /**
     * Create an instance of {@link SearchTitolarioItemsIdOutput }
     * 
     */
    public SearchTitolarioItemsIdOutput createSearchTitolarioItemsIdOutput() {
        return new SearchTitolarioItemsIdOutput();
    }

    /**
     * Create an instance of {@link InsertMultiClassificaDocCollByParam }
     * 
     */
    public InsertMultiClassificaDocCollByParam createInsertMultiClassificaDocCollByParam() {
        return new InsertMultiClassificaDocCollByParam();
    }

    /**
     * Create an instance of {@link ReadFascicoloHierarchyByParamResponse }
     * 
     */
    public ReadFascicoloHierarchyByParamResponse createReadFascicoloHierarchyByParamResponse() {
        return new ReadFascicoloHierarchyByParamResponse();
    }

    /**
     * Create an instance of {@link InsertClassificaDocumentoInput }
     * 
     */
    public InsertClassificaDocumentoInput createInsertClassificaDocumentoInput() {
        return new InsertClassificaDocumentoInput();
    }

    /**
     * Create an instance of {@link OpenFascicoloInput }
     * 
     */
    public OpenFascicoloInput createOpenFascicoloInput() {
        return new OpenFascicoloInput();
    }

    /**
     * Create an instance of {@link ArrayOfFascicoloPreservationStatus }
     * 
     */
    public ArrayOfFascicoloPreservationStatus createArrayOfFascicoloPreservationStatus() {
        return new ArrayOfFascicoloPreservationStatus();
    }

    /**
     * Create an instance of {@link CustomIntNullable }
     * 
     */
    public CustomIntNullable createCustomIntNullable() {
        return new CustomIntNullable();
    }

    /**
     * Create an instance of {@link ReadLegislaturaOutput }
     * 
     */
    public ReadLegislaturaOutput createReadLegislaturaOutput() {
        return new ReadLegislaturaOutput();
    }

    /**
     * Create an instance of {@link ReadClassificaDocumentoByParamResponse }
     * 
     */
    public ReadClassificaDocumentoByParamResponse createReadClassificaDocumentoByParamResponse() {
        return new ReadClassificaDocumentoByParamResponse();
    }

    /**
     * Create an instance of {@link ReadCardsInFolderByParamResponse }
     * 
     */
    public ReadCardsInFolderByParamResponse createReadCardsInFolderByParamResponse() {
        return new ReadCardsInFolderByParamResponse();
    }

    /**
     * Create an instance of {@link InsertValoreCampiTipoFascicoloByParam }
     * 
     */
    public InsertValoreCampiTipoFascicoloByParam createInsertValoreCampiTipoFascicoloByParam() {
        return new InsertValoreCampiTipoFascicoloByParam();
    }

    /**
     * Create an instance of {@link ArrayOfCampiTipoFascicoloCfgValue }
     * 
     */
    public ArrayOfCampiTipoFascicoloCfgValue createArrayOfCampiTipoFascicoloCfgValue() {
        return new ArrayOfCampiTipoFascicoloCfgValue();
    }

    /**
     * Create an instance of {@link InsertTitolarioByParamResponse }
     * 
     */
    public InsertTitolarioByParamResponse createInsertTitolarioByParamResponse() {
        return new InsertTitolarioByParamResponse();
    }

    /**
     * Create an instance of {@link RecoveryFascicoloByParamResponse }
     * 
     */
    public RecoveryFascicoloByParamResponse createRecoveryFascicoloByParamResponse() {
        return new RecoveryFascicoloByParamResponse();
    }

    /**
     * Create an instance of {@link DeleteTitolarioItemByPrimaryKeyByParamResponse }
     * 
     */
    public DeleteTitolarioItemByPrimaryKeyByParamResponse createDeleteTitolarioItemByPrimaryKeyByParamResponse() {
        return new DeleteTitolarioItemByPrimaryKeyByParamResponse();
    }

    /**
     * Create an instance of {@link InsertFascicoloByParam }
     * 
     */
    public InsertFascicoloByParam createInsertFascicoloByParam() {
        return new InsertFascicoloByParam();
    }

    /**
     * Create an instance of {@link UpdateTipoFascicoloStatusInput }
     * 
     */
    public UpdateTipoFascicoloStatusInput createUpdateTipoFascicoloStatusInput() {
        return new UpdateTipoFascicoloStatusInput();
    }

    /**
     * Create an instance of {@link CampiTipoFascicoloSearcher }
     * 
     */
    public CampiTipoFascicoloSearcher createCampiTipoFascicoloSearcher() {
        return new CampiTipoFascicoloSearcher();
    }

    /**
     * Create an instance of {@link Legislatura }
     * 
     */
    public Legislatura createLegislatura() {
        return new Legislatura();
    }

    /**
     * Create an instance of {@link InsertTitolarioTemplateByParamResponse }
     * 
     */
    public InsertTitolarioTemplateByParamResponse createInsertTitolarioTemplateByParamResponse() {
        return new InsertTitolarioTemplateByParamResponse();
    }

    /**
     * Create an instance of {@link InsertClassificaDocumentoByParamResponse }
     * 
     */
    public InsertClassificaDocumentoByParamResponse createInsertClassificaDocumentoByParamResponse() {
        return new InsertClassificaDocumentoByParamResponse();
    }

    /**
     * Create an instance of {@link InsertTipoFascicoloOutput }
     * 
     */
    public InsertTipoFascicoloOutput createInsertTipoFascicoloOutput() {
        return new InsertTipoFascicoloOutput();
    }

    /**
     * Create an instance of {@link UpdateTitolarioTemplateByParam }
     * 
     */
    public UpdateTitolarioTemplateByParam createUpdateTitolarioTemplateByParam() {
        return new UpdateTitolarioTemplateByParam();
    }

    /**
     * Create an instance of {@link InsertTipoFascVisibilityByParam }
     * 
     */
    public InsertTipoFascVisibilityByParam createInsertTipoFascVisibilityByParam() {
        return new InsertTipoFascVisibilityByParam();
    }

    /**
     * Create an instance of {@link IsFascicoloInCurrentTitolarioInput }
     * 
     */
    public IsFascicoloInCurrentTitolarioInput createIsFascicoloInCurrentTitolarioInput() {
        return new IsFascicoloInCurrentTitolarioInput();
    }

    /**
     * Create an instance of {@link InsertFascicoloNoteOutput }
     * 
     */
    public InsertFascicoloNoteOutput createInsertFascicoloNoteOutput() {
        return new InsertFascicoloNoteOutput();
    }

    /**
     * Create an instance of {@link ClassificaDocumentoSearcher }
     * 
     */
    public ClassificaDocumentoSearcher createClassificaDocumentoSearcher() {
        return new ClassificaDocumentoSearcher();
    }

    /**
     * Create an instance of {@link SetPrimaryFascicoloDocumentoByParam }
     * 
     */
    public SetPrimaryFascicoloDocumentoByParam createSetPrimaryFascicoloDocumentoByParam() {
        return new SetPrimaryFascicoloDocumentoByParam();
    }

    /**
     * Create an instance of {@link BaseTitolarioItem }
     * 
     */
    public BaseTitolarioItem createBaseTitolarioItem() {
        return new BaseTitolarioItem();
    }

    /**
     * Create an instance of {@link ArrayOfstring }
     * 
     */
    public ArrayOfstring createArrayOfstring() {
        return new ArrayOfstring();
    }

    /**
     * Create an instance of {@link ReadOptionsOutput }
     * 
     */
    public ReadOptionsOutput createReadOptionsOutput() {
        return new ReadOptionsOutput();
    }

    /**
     * Create an instance of {@link IsTitolarioItemUsedByParam }
     * 
     */
    public IsTitolarioItemUsedByParam createIsTitolarioItemUsedByParam() {
        return new IsTitolarioItemUsedByParam();
    }

    /**
     * Create an instance of {@link BaseOption }
     * 
     */
    public BaseOption createBaseOption() {
        return new BaseOption();
    }

    /**
     * Create an instance of {@link CheckOutTitolarioByParamResponse }
     * 
     */
    public CheckOutTitolarioByParamResponse createCheckOutTitolarioByParamResponse() {
        return new CheckOutTitolarioByParamResponse();
    }

    /**
     * Create an instance of {@link InsertTipoFascicoloByParamResponse }
     * 
     */
    public InsertTipoFascicoloByParamResponse createInsertTipoFascicoloByParamResponse() {
        return new InsertTipoFascicoloByParamResponse();
    }

    /**
     * Create an instance of {@link ReadCampiTipoFascicoloInput }
     * 
     */
    public ReadCampiTipoFascicoloInput createReadCampiTipoFascicoloInput() {
        return new ReadCampiTipoFascicoloInput();
    }

    /**
     * Create an instance of {@link IsTitolarioUsedByParamResponse }
     * 
     */
    public IsTitolarioUsedByParamResponse createIsTitolarioUsedByParamResponse() {
        return new IsTitolarioUsedByParamResponse();
    }

    /**
     * Create an instance of {@link DeleteLegislaturaByParam }
     * 
     */
    public DeleteLegislaturaByParam createDeleteLegislaturaByParam() {
        return new DeleteLegislaturaByParam();
    }

    /**
     * Create an instance of {@link DeleteCheckOutInput }
     * 
     */
    public DeleteCheckOutInput createDeleteCheckOutInput() {
        return new DeleteCheckOutInput();
    }

    /**
     * Create an instance of {@link OpenFascicoloByParamResponse }
     * 
     */
    public OpenFascicoloByParamResponse createOpenFascicoloByParamResponse() {
        return new OpenFascicoloByParamResponse();
    }

    /**
     * Create an instance of {@link ReadTipoDocDefaultTitolarioItemCollOutput }
     * 
     */
    public ReadTipoDocDefaultTitolarioItemCollOutput createReadTipoDocDefaultTitolarioItemCollOutput() {
        return new ReadTipoDocDefaultTitolarioItemCollOutput();
    }

    /**
     * Create an instance of {@link ReadFascicoloInput }
     * 
     */
    public ReadFascicoloInput createReadFascicoloInput() {
        return new ReadFascicoloInput();
    }

    /**
     * Create an instance of {@link ReadCardsInFolderOutput }
     * 
     */
    public ReadCardsInFolderOutput createReadCardsInFolderOutput() {
        return new ReadCardsInFolderOutput();
    }

    /**
     * Create an instance of {@link ReadTitolarioInput }
     * 
     */
    public ReadTitolarioInput createReadTitolarioInput() {
        return new ReadTitolarioInput();
    }

    /**
     * Create an instance of {@link InsertLegislaturaInput }
     * 
     */
    public InsertLegislaturaInput createInsertLegislaturaInput() {
        return new InsertLegislaturaInput();
    }

    /**
     * Create an instance of {@link DeleteAllFascicoliDelOutput }
     * 
     */
    public DeleteAllFascicoliDelOutput createDeleteAllFascicoliDelOutput() {
        return new DeleteAllFascicoliDelOutput();
    }

    /**
     * Create an instance of {@link ReadTitolarioItemCollSortedInput }
     * 
     */
    public ReadTitolarioItemCollSortedInput createReadTitolarioItemCollSortedInput() {
        return new ReadTitolarioItemCollSortedInput();
    }

    /**
     * Create an instance of {@link InsertOptionsInput }
     * 
     */
    public InsertOptionsInput createInsertOptionsInput() {
        return new InsertOptionsInput();
    }

    /**
     * Create an instance of {@link ReadFascicoloHierarchyByParam }
     * 
     */
    public ReadFascicoloHierarchyByParam createReadFascicoloHierarchyByParam() {
        return new ReadFascicoloHierarchyByParam();
    }

    /**
     * Create an instance of {@link InsertLegislaturaOutput }
     * 
     */
    public InsertLegislaturaOutput createInsertLegislaturaOutput() {
        return new InsertLegislaturaOutput();
    }

    /**
     * Create an instance of {@link ReadClassificaCodeCollOutput }
     * 
     */
    public ReadClassificaCodeCollOutput createReadClassificaCodeCollOutput() {
        return new ReadClassificaCodeCollOutput();
    }

    /**
     * Create an instance of {@link CopyTitolarioByParamResponse }
     * 
     */
    public CopyTitolarioByParamResponse createCopyTitolarioByParamResponse() {
        return new CopyTitolarioByParamResponse();
    }

    /**
     * Create an instance of {@link UpdateTitolarioByParam }
     * 
     */
    public UpdateTitolarioByParam createUpdateTitolarioByParam() {
        return new UpdateTitolarioByParam();
    }

    /**
     * Create an instance of {@link UpdateTitolarioTemplateByParamResponse }
     * 
     */
    public UpdateTitolarioTemplateByParamResponse createUpdateTitolarioTemplateByParamResponse() {
        return new UpdateTitolarioTemplateByParamResponse();
    }

    /**
     * Create an instance of {@link UpdateStatusHierarchyOutput }
     * 
     */
    public UpdateStatusHierarchyOutput createUpdateStatusHierarchyOutput() {
        return new UpdateStatusHierarchyOutput();
    }

    /**
     * Create an instance of {@link CloseFascicoloByParamResponse }
     * 
     */
    public CloseFascicoloByParamResponse createCloseFascicoloByParamResponse() {
        return new CloseFascicoloByParamResponse();
    }

    /**
     * Create an instance of {@link ReadBaseFascicoloByParam }
     * 
     */
    public ReadBaseFascicoloByParam createReadBaseFascicoloByParam() {
        return new ReadBaseFascicoloByParam();
    }

    /**
     * Create an instance of {@link FascicoloDocumentoEntity }
     * 
     */
    public FascicoloDocumentoEntity createFascicoloDocumentoEntity() {
        return new FascicoloDocumentoEntity();
    }

    /**
     * Create an instance of {@link InsertValoreCampiTipoFascicoloOutput }
     * 
     */
    public InsertValoreCampiTipoFascicoloOutput createInsertValoreCampiTipoFascicoloOutput() {
        return new InsertValoreCampiTipoFascicoloOutput();
    }

    /**
     * Create an instance of {@link SetPrimaryFascicoloDocumentoInput }
     * 
     */
    public SetPrimaryFascicoloDocumentoInput createSetPrimaryFascicoloDocumentoInput() {
        return new SetPrimaryFascicoloDocumentoInput();
    }

    /**
     * Create an instance of {@link ArrayOfBaseOption }
     * 
     */
    public ArrayOfBaseOption createArrayOfBaseOption() {
        return new ArrayOfBaseOption();
    }

    /**
     * Create an instance of {@link OfficeChart }
     * 
     */
    public OfficeChart createOfficeChart() {
        return new OfficeChart();
    }

    /**
     * Create an instance of {@link DeleteFascicoloByParamResponse }
     * 
     */
    public DeleteFascicoloByParamResponse createDeleteFascicoloByParamResponse() {
        return new DeleteFascicoloByParamResponse();
    }

    /**
     * Create an instance of {@link ArrayOfKeyValueOfstringstring }
     * 
     */
    public ArrayOfKeyValueOfstringstring createArrayOfKeyValueOfstringstring() {
        return new ArrayOfKeyValueOfstringstring();
    }

    /**
     * Create an instance of {@link ReadTitolarioByParamResponse }
     * 
     */
    public ReadTitolarioByParamResponse createReadTitolarioByParamResponse() {
        return new ReadTitolarioByParamResponse();
    }

    /**
     * Create an instance of {@link ReadFascicoloDocumentoByParamResponse }
     * 
     */
    public ReadFascicoloDocumentoByParamResponse createReadFascicoloDocumentoByParamResponse() {
        return new ReadFascicoloDocumentoByParamResponse();
    }

    /**
     * Create an instance of {@link InsertClassificaDocumentoOutput }
     * 
     */
    public InsertClassificaDocumentoOutput createInsertClassificaDocumentoOutput() {
        return new InsertClassificaDocumentoOutput();
    }

    /**
     * Create an instance of {@link ReadTitolarioItemOutput }
     * 
     */
    public ReadTitolarioItemOutput createReadTitolarioItemOutput() {
        return new ReadTitolarioItemOutput();
    }

    /**
     * Create an instance of {@link CampiTipoFascicoloCfgValue }
     * 
     */
    public CampiTipoFascicoloCfgValue createCampiTipoFascicoloCfgValue() {
        return new CampiTipoFascicoloCfgValue();
    }

    /**
     * Create an instance of {@link ReadTitolarioItemCollSortedByParamResponse }
     * 
     */
    public ReadTitolarioItemCollSortedByParamResponse createReadTitolarioItemCollSortedByParamResponse() {
        return new ReadTitolarioItemCollSortedByParamResponse();
    }

    /**
     * Create an instance of {@link DeleteClassificaDocumentoOutput }
     * 
     */
    public DeleteClassificaDocumentoOutput createDeleteClassificaDocumentoOutput() {
        return new DeleteClassificaDocumentoOutput();
    }

    /**
     * Create an instance of {@link UpdateLegislaturaInput }
     * 
     */
    public UpdateLegislaturaInput createUpdateLegislaturaInput() {
        return new UpdateLegislaturaInput();
    }

    /**
     * Create an instance of {@link CheckInByParamResponse }
     * 
     */
    public CheckInByParamResponse createCheckInByParamResponse() {
        return new CheckInByParamResponse();
    }

    /**
     * Create an instance of {@link ReadFascicoloDocumentoOutput }
     * 
     */
    public ReadFascicoloDocumentoOutput createReadFascicoloDocumentoOutput() {
        return new ReadFascicoloDocumentoOutput();
    }

    /**
     * Create an instance of {@link GetTitolarioItemSonsInput }
     * 
     */
    public GetTitolarioItemSonsInput createGetTitolarioItemSonsInput() {
        return new GetTitolarioItemSonsInput();
    }

    /**
     * Create an instance of {@link GetFascicoloToPreserveOutput }
     * 
     */
    public GetFascicoloToPreserveOutput createGetFascicoloToPreserveOutput() {
        return new GetFascicoloToPreserveOutput();
    }

    /**
     * Create an instance of {@link TipoFascDiffSearcher }
     * 
     */
    public TipoFascDiffSearcher createTipoFascDiffSearcher() {
        return new TipoFascDiffSearcher();
    }

    /**
     * Create an instance of {@link SearchFascicoloInput }
     * 
     */
    public SearchFascicoloInput createSearchFascicoloInput() {
        return new SearchFascicoloInput();
    }

    /**
     * Create an instance of {@link DeleteTitolarioItemByTitolarioIdOutput }
     * 
     */
    public DeleteTitolarioItemByTitolarioIdOutput createDeleteTitolarioItemByTitolarioIdOutput() {
        return new DeleteTitolarioItemByTitolarioIdOutput();
    }

    /**
     * Create an instance of {@link ReadTipoFascicoloOutput }
     * 
     */
    public ReadTipoFascicoloOutput createReadTipoFascicoloOutput() {
        return new ReadTipoFascicoloOutput();
    }

    /**
     * Create an instance of {@link OpenFascicoloOutput }
     * 
     */
    public OpenFascicoloOutput createOpenFascicoloOutput() {
        return new OpenFascicoloOutput();
    }

    /**
     * Create an instance of {@link ReadFascicoloNotesByParam }
     * 
     */
    public ReadFascicoloNotesByParam createReadFascicoloNotesByParam() {
        return new ReadFascicoloNotesByParam();
    }

    /**
     * Create an instance of {@link UpdateTitolarioItemByParamResponse }
     * 
     */
    public UpdateTitolarioItemByParamResponse createUpdateTitolarioItemByParamResponse() {
        return new UpdateTitolarioItemByParamResponse();
    }

    /**
     * Create an instance of {@link ArrayOfLegislatura }
     * 
     */
    public ArrayOfLegislatura createArrayOfLegislatura() {
        return new ArrayOfLegislatura();
    }

    /**
     * Create an instance of {@link DeleteCheckOutTitolarioInput }
     * 
     */
    public DeleteCheckOutTitolarioInput createDeleteCheckOutTitolarioInput() {
        return new DeleteCheckOutTitolarioInput();
    }

    /**
     * Create an instance of {@link InsertClassificaFascicoloInput }
     * 
     */
    public InsertClassificaFascicoloInput createInsertClassificaFascicoloInput() {
        return new InsertClassificaFascicoloInput();
    }

    /**
     * Create an instance of {@link SearchTitolarioItemsIdInput }
     * 
     */
    public SearchTitolarioItemsIdInput createSearchTitolarioItemsIdInput() {
        return new SearchTitolarioItemsIdInput();
    }

    /**
     * Create an instance of {@link ArrayOfTitolarioEntity }
     * 
     */
    public ArrayOfTitolarioEntity createArrayOfTitolarioEntity() {
        return new ArrayOfTitolarioEntity();
    }

    /**
     * Create an instance of {@link ArchiflowServiceExceptionDetail }
     * 
     */
    public ArchiflowServiceExceptionDetail createArchiflowServiceExceptionDetail() {
        return new ArchiflowServiceExceptionDetail();
    }

    /**
     * Create an instance of {@link IsFascicoloUsedByParam }
     * 
     */
    public IsFascicoloUsedByParam createIsFascicoloUsedByParam() {
        return new IsFascicoloUsedByParam();
    }

    /**
     * Create an instance of {@link UpdateTitolarioTemplateOutput }
     * 
     */
    public UpdateTitolarioTemplateOutput createUpdateTitolarioTemplateOutput() {
        return new UpdateTitolarioTemplateOutput();
    }

    /**
     * Create an instance of {@link DeleteTitolarioTemplateByParamResponse }
     * 
     */
    public DeleteTitolarioTemplateByParamResponse createDeleteTitolarioTemplateByParamResponse() {
        return new DeleteTitolarioTemplateByParamResponse();
    }

    /**
     * Create an instance of {@link InsertClassificaDocCollInput }
     * 
     */
    public InsertClassificaDocCollInput createInsertClassificaDocCollInput() {
        return new InsertClassificaDocCollInput();
    }

    /**
     * Create an instance of {@link ReadLegislaturaByParamResponse }
     * 
     */
    public ReadLegislaturaByParamResponse createReadLegislaturaByParamResponse() {
        return new ReadLegislaturaByParamResponse();
    }

    /**
     * Create an instance of {@link InsertFascicoloVisibilityInput }
     * 
     */
    public InsertFascicoloVisibilityInput createInsertFascicoloVisibilityInput() {
        return new InsertFascicoloVisibilityInput();
    }

    /**
     * Create an instance of {@link ReadLegislaturaByParam }
     * 
     */
    public ReadLegislaturaByParam createReadLegislaturaByParam() {
        return new ReadLegislaturaByParam();
    }

    /**
     * Create an instance of {@link ReadOptionsByParamResponse }
     * 
     */
    public ReadOptionsByParamResponse createReadOptionsByParamResponse() {
        return new ReadOptionsByParamResponse();
    }

    /**
     * Create an instance of {@link IsTitolarioUsedByParam }
     * 
     */
    public IsTitolarioUsedByParam createIsTitolarioUsedByParam() {
        return new IsTitolarioUsedByParam();
    }

    /**
     * Create an instance of {@link UpdateTipoFascicoloStatusByParamResponse }
     * 
     */
    public UpdateTipoFascicoloStatusByParamResponse createUpdateTipoFascicoloStatusByParamResponse() {
        return new UpdateTipoFascicoloStatusByParamResponse();
    }

    /**
     * Create an instance of {@link UpdateValidToDateTitolarioItemByParam }
     * 
     */
    public UpdateValidToDateTitolarioItemByParam createUpdateValidToDateTitolarioItemByParam() {
        return new UpdateValidToDateTitolarioItemByParam();
    }

    /**
     * Create an instance of {@link DeleteFascicoloInput }
     * 
     */
    public DeleteFascicoloInput createDeleteFascicoloInput() {
        return new DeleteFascicoloInput();
    }

    /**
     * Create an instance of {@link BaseFascicoloDocumento }
     * 
     */
    public BaseFascicoloDocumento createBaseFascicoloDocumento() {
        return new BaseFascicoloDocumento();
    }

    /**
     * Create an instance of {@link DeleteFascicoloDocumentoInput }
     * 
     */
    public DeleteFascicoloDocumentoInput createDeleteFascicoloDocumentoInput() {
        return new DeleteFascicoloDocumentoInput();
    }

    /**
     * Create an instance of {@link RecoveryFascicoloByParam }
     * 
     */
    public RecoveryFascicoloByParam createRecoveryFascicoloByParam() {
        return new RecoveryFascicoloByParam();
    }

    /**
     * Create an instance of {@link AbstractTitolario }
     * 
     */
    public AbstractTitolario createAbstractTitolario() {
        return new AbstractTitolario();
    }

    /**
     * Create an instance of {@link IsTitolarioItemValidOutput }
     * 
     */
    public IsTitolarioItemValidOutput createIsTitolarioItemValidOutput() {
        return new IsTitolarioItemValidOutput();
    }

    /**
     * Create an instance of {@link UpdateClassificaFascicoloByParam }
     * 
     */
    public UpdateClassificaFascicoloByParam createUpdateClassificaFascicoloByParam() {
        return new UpdateClassificaFascicoloByParam();
    }

    /**
     * Create an instance of {@link DeleteFascicoloOutput }
     * 
     */
    public DeleteFascicoloOutput createDeleteFascicoloOutput() {
        return new DeleteFascicoloOutput();
    }

    /**
     * Create an instance of {@link InsertFascicoloVisibilityByParam }
     * 
     */
    public InsertFascicoloVisibilityByParam createInsertFascicoloVisibilityByParam() {
        return new InsertFascicoloVisibilityByParam();
    }

    /**
     * Create an instance of {@link CopyTitolarioByParam }
     * 
     */
    public CopyTitolarioByParam createCopyTitolarioByParam() {
        return new CopyTitolarioByParam();
    }

    /**
     * Create an instance of {@link UpdateStatoFascicoloByParamResponse }
     * 
     */
    public UpdateStatoFascicoloByParamResponse createUpdateStatoFascicoloByParamResponse() {
        return new UpdateStatoFascicoloByParamResponse();
    }

    /**
     * Create an instance of {@link ArrayOfFascicoloHistory }
     * 
     */
    public ArrayOfFascicoloHistory createArrayOfFascicoloHistory() {
        return new ArrayOfFascicoloHistory();
    }

    /**
     * Create an instance of {@link OpenFascicoloByParam }
     * 
     */
    public OpenFascicoloByParam createOpenFascicoloByParam() {
        return new OpenFascicoloByParam();
    }

    /**
     * Create an instance of {@link ReadTitolarioOutput }
     * 
     */
    public ReadTitolarioOutput createReadTitolarioOutput() {
        return new ReadTitolarioOutput();
    }

    /**
     * Create an instance of {@link EntityAccess }
     * 
     */
    public EntityAccess createEntityAccess() {
        return new EntityAccess();
    }

    /**
     * Create an instance of {@link InsertClassificaDocumentoByParam }
     * 
     */
    public InsertClassificaDocumentoByParam createInsertClassificaDocumentoByParam() {
        return new InsertClassificaDocumentoByParam();
    }

    /**
     * Create an instance of {@link GetTitolarioSonsInput }
     * 
     */
    public GetTitolarioSonsInput createGetTitolarioSonsInput() {
        return new GetTitolarioSonsInput();
    }

    /**
     * Create an instance of {@link CustomDateTimeNullable }
     * 
     */
    public CustomDateTimeNullable createCustomDateTimeNullable() {
        return new CustomDateTimeNullable();
    }

    /**
     * Create an instance of {@link DeleteTipoFascicoloByParamResponse }
     * 
     */
    public DeleteTipoFascicoloByParamResponse createDeleteTipoFascicoloByParamResponse() {
        return new DeleteTipoFascicoloByParamResponse();
    }

    /**
     * Create an instance of {@link CheckInOutput }
     * 
     */
    public CheckInOutput createCheckInOutput() {
        return new CheckInOutput();
    }

    /**
     * Create an instance of {@link ReadFascicoloDocumentoByParam }
     * 
     */
    public ReadFascicoloDocumentoByParam createReadFascicoloDocumentoByParam() {
        return new ReadFascicoloDocumentoByParam();
    }

    /**
     * Create an instance of {@link DeleteCheckOutTitolarioItemInput }
     * 
     */
    public DeleteCheckOutTitolarioItemInput createDeleteCheckOutTitolarioItemInput() {
        return new DeleteCheckOutTitolarioItemInput();
    }

    /**
     * Create an instance of {@link DeleteTitolarioItemByPrimaryKeyOutput }
     * 
     */
    public DeleteTitolarioItemByPrimaryKeyOutput createDeleteTitolarioItemByPrimaryKeyOutput() {
        return new DeleteTitolarioItemByPrimaryKeyOutput();
    }

    /**
     * Create an instance of {@link CopyTipoFascicoloInput }
     * 
     */
    public CopyTipoFascicoloInput createCopyTipoFascicoloInput() {
        return new CopyTipoFascicoloInput();
    }

    /**
     * Create an instance of {@link ReadTitolarioItemBaseInput }
     * 
     */
    public ReadTitolarioItemBaseInput createReadTitolarioItemBaseInput() {
        return new ReadTitolarioItemBaseInput();
    }

    /**
     * Create an instance of {@link ReadValoreCampiTipoFascicoloInput }
     * 
     */
    public ReadValoreCampiTipoFascicoloInput createReadValoreCampiTipoFascicoloInput() {
        return new ReadValoreCampiTipoFascicoloInput();
    }

    /**
     * Create an instance of {@link ArrayOfOfficeChart }
     * 
     */
    public ArrayOfOfficeChart createArrayOfOfficeChart() {
        return new ArrayOfOfficeChart();
    }

    /**
     * Create an instance of {@link ReadLegislaturaInput }
     * 
     */
    public ReadLegislaturaInput createReadLegislaturaInput() {
        return new ReadLegislaturaInput();
    }

    /**
     * Create an instance of {@link DeleteCampiTipoFascicoloValueOutput }
     * 
     */
    public DeleteCampiTipoFascicoloValueOutput createDeleteCampiTipoFascicoloValueOutput() {
        return new DeleteCampiTipoFascicoloValueOutput();
    }

    /**
     * Create an instance of {@link ReadTitolarioItemCollSortedByParam }
     * 
     */
    public ReadTitolarioItemCollSortedByParam createReadTitolarioItemCollSortedByParam() {
        return new ReadTitolarioItemCollSortedByParam();
    }

    /**
     * Create an instance of {@link ArrayOfFascicoloEntity }
     * 
     */
    public ArrayOfFascicoloEntity createArrayOfFascicoloEntity() {
        return new ArrayOfFascicoloEntity();
    }

    /**
     * Create an instance of {@link InsertFascicoloNoteByParamResponse }
     * 
     */
    public InsertFascicoloNoteByParamResponse createInsertFascicoloNoteByParamResponse() {
        return new InsertFascicoloNoteByParamResponse();
    }

    /**
     * Create an instance of {@link TitolarioTemplateSearcher }
     * 
     */
    public TitolarioTemplateSearcher createTitolarioTemplateSearcher() {
        return new TitolarioTemplateSearcher();
    }

    /**
     * Create an instance of {@link InsertDifformitaOutput }
     * 
     */
    public InsertDifformitaOutput createInsertDifformitaOutput() {
        return new InsertDifformitaOutput();
    }

    /**
     * Create an instance of {@link TypeIdentifier }
     * 
     */
    public TypeIdentifier createTypeIdentifier() {
        return new TypeIdentifier();
    }

    /**
     * Create an instance of {@link ReadBaseTitolarioItemCollOutput }
     * 
     */
    public ReadBaseTitolarioItemCollOutput createReadBaseTitolarioItemCollOutput() {
        return new ReadBaseTitolarioItemCollOutput();
    }

    /**
     * Create an instance of {@link DeleteCheckOutTitolarioByParam }
     * 
     */
    public DeleteCheckOutTitolarioByParam createDeleteCheckOutTitolarioByParam() {
        return new DeleteCheckOutTitolarioByParam();
    }

    /**
     * Create an instance of {@link ReadFascicoloVisibilityPrivacyByParamResponse }
     * 
     */
    public ReadFascicoloVisibilityPrivacyByParamResponse createReadFascicoloVisibilityPrivacyByParamResponse() {
        return new ReadFascicoloVisibilityPrivacyByParamResponse();
    }

    /**
     * Create an instance of {@link ArrayOfBaseClassificaDocumento }
     * 
     */
    public ArrayOfBaseClassificaDocumento createArrayOfBaseClassificaDocumento() {
        return new ArrayOfBaseClassificaDocumento();
    }

    /**
     * Create an instance of {@link ReadOptionsByParam }
     * 
     */
    public ReadOptionsByParam createReadOptionsByParam() {
        return new ReadOptionsByParam();
    }

    /**
     * Create an instance of {@link ReadFascicoloByParam }
     * 
     */
    public ReadFascicoloByParam createReadFascicoloByParam() {
        return new ReadFascicoloByParam();
    }

    /**
     * Create an instance of {@link CopyTitolarioInput }
     * 
     */
    public CopyTitolarioInput createCopyTitolarioInput() {
        return new CopyTitolarioInput();
    }

    /**
     * Create an instance of {@link ReadTipoFascVisibilityByParamResponse }
     * 
     */
    public ReadTipoFascVisibilityByParamResponse createReadTipoFascVisibilityByParamResponse() {
        return new ReadTipoFascVisibilityByParamResponse();
    }

    /**
     * Create an instance of {@link InsertClassificaFascicoloByParam }
     * 
     */
    public InsertClassificaFascicoloByParam createInsertClassificaFascicoloByParam() {
        return new InsertClassificaFascicoloByParam();
    }

    /**
     * Create an instance of {@link InsertOptionsOutput }
     * 
     */
    public InsertOptionsOutput createInsertOptionsOutput() {
        return new InsertOptionsOutput();
    }

    /**
     * Create an instance of {@link CopyTitolarioOutput }
     * 
     */
    public CopyTitolarioOutput createCopyTitolarioOutput() {
        return new CopyTitolarioOutput();
    }

    /**
     * Create an instance of {@link TitolarioItemIdentifier }
     * 
     */
    public TitolarioItemIdentifier createTitolarioItemIdentifier() {
        return new TitolarioItemIdentifier();
    }

    /**
     * Create an instance of {@link ArrayOfCampiTipoFascicolo }
     * 
     */
    public ArrayOfCampiTipoFascicolo createArrayOfCampiTipoFascicolo() {
        return new ArrayOfCampiTipoFascicolo();
    }

    /**
     * Create an instance of {@link InsertOptionsByParam }
     * 
     */
    public InsertOptionsByParam createInsertOptionsByParam() {
        return new InsertOptionsByParam();
    }

    /**
     * Create an instance of {@link GetClassificheValideOutput }
     * 
     */
    public GetClassificheValideOutput createGetClassificheValideOutput() {
        return new GetClassificheValideOutput();
    }

    /**
     * Create an instance of {@link CheckOutTitolarioOutput }
     * 
     */
    public CheckOutTitolarioOutput createCheckOutTitolarioOutput() {
        return new CheckOutTitolarioOutput();
    }

    /**
     * Create an instance of {@link InsertDifformitaByParam }
     * 
     */
    public InsertDifformitaByParam createInsertDifformitaByParam() {
        return new InsertDifformitaByParam();
    }

    /**
     * Create an instance of {@link SearchFascicoloByParam }
     * 
     */
    public SearchFascicoloByParam createSearchFascicoloByParam() {
        return new SearchFascicoloByParam();
    }

    /**
     * Create an instance of {@link ReadFascicoloVisibilityByParamResponse }
     * 
     */
    public ReadFascicoloVisibilityByParamResponse createReadFascicoloVisibilityByParamResponse() {
        return new ReadFascicoloVisibilityByParamResponse();
    }

    /**
     * Create an instance of {@link ReadDifformitaInput }
     * 
     */
    public ReadDifformitaInput createReadDifformitaInput() {
        return new ReadDifformitaInput();
    }

    /**
     * Create an instance of {@link UpdateCampiTipoFascicoloByParamResponse }
     * 
     */
    public UpdateCampiTipoFascicoloByParamResponse createUpdateCampiTipoFascicoloByParamResponse() {
        return new UpdateCampiTipoFascicoloByParamResponse();
    }

    /**
     * Create an instance of {@link UpdateValidToDateTitolarioItemInput }
     * 
     */
    public UpdateValidToDateTitolarioItemInput createUpdateValidToDateTitolarioItemInput() {
        return new UpdateValidToDateTitolarioItemInput();
    }

    /**
     * Create an instance of {@link SearchBaseFascicoloByParam }
     * 
     */
    public SearchBaseFascicoloByParam createSearchBaseFascicoloByParam() {
        return new SearchBaseFascicoloByParam();
    }

    /**
     * Create an instance of {@link FascicoloDocumentoSearcher }
     * 
     */
    public FascicoloDocumentoSearcher createFascicoloDocumentoSearcher() {
        return new FascicoloDocumentoSearcher();
    }

    /**
     * Create an instance of {@link IsFascicoloUsedOutput }
     * 
     */
    public IsFascicoloUsedOutput createIsFascicoloUsedOutput() {
        return new IsFascicoloUsedOutput();
    }

    /**
     * Create an instance of {@link SetPrimaryClassificaDocumentoInput }
     * 
     */
    public SetPrimaryClassificaDocumentoInput createSetPrimaryClassificaDocumentoInput() {
        return new SetPrimaryClassificaDocumentoInput();
    }

    /**
     * Create an instance of {@link UpdateValidToDateTitolarioInput }
     * 
     */
    public UpdateValidToDateTitolarioInput createUpdateValidToDateTitolarioInput() {
        return new UpdateValidToDateTitolarioInput();
    }

    /**
     * Create an instance of {@link ClassificazioneBaseSearcher }
     * 
     */
    public ClassificazioneBaseSearcher createClassificazioneBaseSearcher() {
        return new ClassificazioneBaseSearcher();
    }

    /**
     * Create an instance of {@link DeleteTipoFascicoloInput }
     * 
     */
    public DeleteTipoFascicoloInput createDeleteTipoFascicoloInput() {
        return new DeleteTipoFascicoloInput();
    }

    /**
     * Create an instance of {@link InsertTitolarioTemplateByParam }
     * 
     */
    public InsertTitolarioTemplateByParam createInsertTitolarioTemplateByParam() {
        return new InsertTitolarioTemplateByParam();
    }

    /**
     * Create an instance of {@link SearchTitolarioItemsClassifyOutput }
     * 
     */
    public SearchTitolarioItemsClassifyOutput createSearchTitolarioItemsClassifyOutput() {
        return new SearchTitolarioItemsClassifyOutput();
    }

    /**
     * Create an instance of {@link CheckOutTitolarioItemOutput }
     * 
     */
    public CheckOutTitolarioItemOutput createCheckOutTitolarioItemOutput() {
        return new CheckOutTitolarioItemOutput();
    }

    /**
     * Create an instance of {@link SearchTitolarioItemsIdByParamResponse }
     * 
     */
    public SearchTitolarioItemsIdByParamResponse createSearchTitolarioItemsIdByParamResponse() {
        return new SearchTitolarioItemsIdByParamResponse();
    }

    /**
     * Create an instance of {@link GetTitolarioItemCodeByParam }
     * 
     */
    public GetTitolarioItemCodeByParam createGetTitolarioItemCodeByParam() {
        return new GetTitolarioItemCodeByParam();
    }

    /**
     * Create an instance of {@link RecoveryFascicoloInput }
     * 
     */
    public RecoveryFascicoloInput createRecoveryFascicoloInput() {
        return new RecoveryFascicoloInput();
    }

    /**
     * Create an instance of {@link ReadTitolarioItemInput }
     * 
     */
    public ReadTitolarioItemInput createReadTitolarioItemInput() {
        return new ReadTitolarioItemInput();
    }

    /**
     * Create an instance of {@link CustomNullableOfdateTime }
     * 
     */
    public CustomNullableOfdateTime createCustomNullableOfdateTime() {
        return new CustomNullableOfdateTime();
    }

    /**
     * Create an instance of {@link UpdateStatusTitolarioInput }
     * 
     */
    public UpdateStatusTitolarioInput createUpdateStatusTitolarioInput() {
        return new UpdateStatusTitolarioInput();
    }

    /**
     * Create an instance of {@link ReadClassificaCodeCollByParam }
     * 
     */
    public ReadClassificaCodeCollByParam createReadClassificaCodeCollByParam() {
        return new ReadClassificaCodeCollByParam();
    }

    /**
     * Create an instance of {@link SendFascicoloByParamResponse }
     * 
     */
    public SendFascicoloByParamResponse createSendFascicoloByParamResponse() {
        return new SendFascicoloByParamResponse();
    }

    /**
     * Create an instance of {@link InsertTitolarioOutput }
     * 
     */
    public InsertTitolarioOutput createInsertTitolarioOutput() {
        return new InsertTitolarioOutput();
    }

    /**
     * Create an instance of {@link ArrayOfKeyValueOfstringstring.KeyValueOfstringstring }
     * 
     */
    public ArrayOfKeyValueOfstringstring.KeyValueOfstringstring createArrayOfKeyValueOfstringstringKeyValueOfstringstring() {
        return new ArrayOfKeyValueOfstringstring.KeyValueOfstringstring();
    }

    /**
     * Create an instance of {@link InsertTipoFascVisibilityInput }
     * 
     */
    public InsertTipoFascVisibilityInput createInsertTipoFascVisibilityInput() {
        return new InsertTipoFascVisibilityInput();
    }

    /**
     * Create an instance of {@link GetClassificheValideByParamResponse }
     * 
     */
    public GetClassificheValideByParamResponse createGetClassificheValideByParamResponse() {
        return new GetClassificheValideByParamResponse();
    }

    /**
     * Create an instance of {@link ReadDifformitaByParam }
     * 
     */
    public ReadDifformitaByParam createReadDifformitaByParam() {
        return new ReadDifformitaByParam();
    }

    /**
     * Create an instance of {@link DeleteCheckOutTitolarioItemOutput }
     * 
     */
    public DeleteCheckOutTitolarioItemOutput createDeleteCheckOutTitolarioItemOutput() {
        return new DeleteCheckOutTitolarioItemOutput();
    }

    /**
     * Create an instance of {@link CustomNullableOfint }
     * 
     */
    public CustomNullableOfint createCustomNullableOfint() {
        return new CustomNullableOfint();
    }

    /**
     * Create an instance of {@link CheckOutTitolarioByParam }
     * 
     */
    public CheckOutTitolarioByParam createCheckOutTitolarioByParam() {
        return new CheckOutTitolarioByParam();
    }

    /**
     * Create an instance of {@link ReadDifformitaOutput }
     * 
     */
    public ReadDifformitaOutput createReadDifformitaOutput() {
        return new ReadDifformitaOutput();
    }

    /**
     * Create an instance of {@link UpdateFascicoloOutput }
     * 
     */
    public UpdateFascicoloOutput createUpdateFascicoloOutput() {
        return new UpdateFascicoloOutput();
    }

    /**
     * Create an instance of {@link GetFascicoloToPreserveByParam }
     * 
     */
    public GetFascicoloToPreserveByParam createGetFascicoloToPreserveByParam() {
        return new GetFascicoloToPreserveByParam();
    }

    /**
     * Create an instance of {@link ReadFascicoloHierarchyInput }
     * 
     */
    public ReadFascicoloHierarchyInput createReadFascicoloHierarchyInput() {
        return new ReadFascicoloHierarchyInput();
    }

    /**
     * Create an instance of {@link LoggableBase }
     * 
     */
    public LoggableBase createLoggableBase() {
        return new LoggableBase();
    }

    /**
     * Create an instance of {@link ReadBaseTitolarioByParamResponse }
     * 
     */
    public ReadBaseTitolarioByParamResponse createReadBaseTitolarioByParamResponse() {
        return new ReadBaseTitolarioByParamResponse();
    }

    /**
     * Create an instance of {@link IsTitolarioItemValidInput }
     * 
     */
    public IsTitolarioItemValidInput createIsTitolarioItemValidInput() {
        return new IsTitolarioItemValidInput();
    }

    /**
     * Create an instance of {@link ReadCardsInFolderByParam }
     * 
     */
    public ReadCardsInFolderByParam createReadCardsInFolderByParam() {
        return new ReadCardsInFolderByParam();
    }

    /**
     * Create an instance of {@link DeleteTitolarioItemByTitolarioIdInput }
     * 
     */
    public DeleteTitolarioItemByTitolarioIdInput createDeleteTitolarioItemByTitolarioIdInput() {
        return new DeleteTitolarioItemByTitolarioIdInput();
    }

    /**
     * Create an instance of {@link ReadTitolarioTemplateByParamResponse }
     * 
     */
    public ReadTitolarioTemplateByParamResponse createReadTitolarioTemplateByParamResponse() {
        return new ReadTitolarioTemplateByParamResponse();
    }

    /**
     * Create an instance of {@link SendFascicoloByParam }
     * 
     */
    public SendFascicoloByParam createSendFascicoloByParam() {
        return new SendFascicoloByParam();
    }

    /**
     * Create an instance of {@link ArrayOfDocumentIdentifier }
     * 
     */
    public ArrayOfDocumentIdentifier createArrayOfDocumentIdentifier() {
        return new ArrayOfDocumentIdentifier();
    }

    /**
     * Create an instance of {@link ReadTitolarioItemCollOutput }
     * 
     */
    public ReadTitolarioItemCollOutput createReadTitolarioItemCollOutput() {
        return new ReadTitolarioItemCollOutput();
    }

    /**
     * Create an instance of {@link ReadFascicoloVisibilityByParam }
     * 
     */
    public ReadFascicoloVisibilityByParam createReadFascicoloVisibilityByParam() {
        return new ReadFascicoloVisibilityByParam();
    }

    /**
     * Create an instance of {@link BaseOutput }
     * 
     */
    public BaseOutput createBaseOutput() {
        return new BaseOutput();
    }

    /**
     * Create an instance of {@link UpdateLegislaturaByParamResponse }
     * 
     */
    public UpdateLegislaturaByParamResponse createUpdateLegislaturaByParamResponse() {
        return new UpdateLegislaturaByParamResponse();
    }

    /**
     * Create an instance of {@link ReadClassFascDocumentoByParamResponse }
     * 
     */
    public ReadClassFascDocumentoByParamResponse createReadClassFascDocumentoByParamResponse() {
        return new ReadClassFascDocumentoByParamResponse();
    }

    /**
     * Create an instance of {@link ReadTitolarioTemplateInput }
     * 
     */
    public ReadTitolarioTemplateInput createReadTitolarioTemplateInput() {
        return new ReadTitolarioTemplateInput();
    }

    /**
     * Create an instance of {@link UpdatePreservedFascicoloByParamResponse }
     * 
     */
    public UpdatePreservedFascicoloByParamResponse createUpdatePreservedFascicoloByParamResponse() {
        return new UpdatePreservedFascicoloByParamResponse();
    }

    /**
     * Create an instance of {@link ReadClassificaCodeCollByParamResponse }
     * 
     */
    public ReadClassificaCodeCollByParamResponse createReadClassificaCodeCollByParamResponse() {
        return new ReadClassificaCodeCollByParamResponse();
    }

    /**
     * Create an instance of {@link DeleteTitolarioItemByPrimaryKeyByParam }
     * 
     */
    public DeleteTitolarioItemByPrimaryKeyByParam createDeleteTitolarioItemByPrimaryKeyByParam() {
        return new DeleteTitolarioItemByPrimaryKeyByParam();
    }

    /**
     * Create an instance of {@link ReadTipoDocDefaultTitolarioItemCollByParamResponse }
     * 
     */
    public ReadTipoDocDefaultTitolarioItemCollByParamResponse createReadTipoDocDefaultTitolarioItemCollByParamResponse() {
        return new ReadTipoDocDefaultTitolarioItemCollByParamResponse();
    }

    /**
     * Create an instance of {@link ClassificaDocIdentifier }
     * 
     */
    public ClassificaDocIdentifier createClassificaDocIdentifier() {
        return new ClassificaDocIdentifier();
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link OggettarioCfg }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://schemas.datacontract.org/2004/07/SIAV.Classification.Entities.Fascicoli.ValueObject", name = "OggettarioCfg")
    public JAXBElement<OggettarioCfg> createOggettarioCfg(OggettarioCfg value) {
        return new JAXBElement<OggettarioCfg>(_OggettarioCfg_QNAME, OggettarioCfg.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link ReadFascicoloInput }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://schemas.datacontract.org/2004/07/Siav.Archiflow.Entities.Classification.ValueObject", name = "ReadFascicoloInput")
    public JAXBElement<ReadFascicoloInput> createReadFascicoloInput(ReadFascicoloInput value) {
        return new JAXBElement<ReadFascicoloInput>(_ReadFascicoloInput_QNAME, ReadFascicoloInput.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link FascicoloDiffType }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://schemas.datacontract.org/2004/07/SIAV.Archiflow.Types", name = "FascicoloDiffType")
    public JAXBElement<FascicoloDiffType> createFascicoloDiffType(FascicoloDiffType value) {
        return new JAXBElement<FascicoloDiffType>(_FascicoloDiffType_QNAME, FascicoloDiffType.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link GetClassificheValideOutput }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://schemas.datacontract.org/2004/07/Siav.Archiflow.Entities.Classification.ValueObject", name = "GetClassificheValideOutput")
    public JAXBElement<GetClassificheValideOutput> createGetClassificheValideOutput(GetClassificheValideOutput value) {
        return new JAXBElement<GetClassificheValideOutput>(_GetClassificheValideOutput_QNAME, GetClassificheValideOutput.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link ReadCardsInFolderOutput }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://schemas.datacontract.org/2004/07/Siav.Archiflow.Entities.Classification.ValueObject", name = "ReadCardsInFolderOutput")
    public JAXBElement<ReadCardsInFolderOutput> createReadCardsInFolderOutput(ReadCardsInFolderOutput value) {
        return new JAXBElement<ReadCardsInFolderOutput>(_ReadCardsInFolderOutput_QNAME, ReadCardsInFolderOutput.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link GetTitolarioItemCodeInput }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://schemas.datacontract.org/2004/07/Siav.Archiflow.Entities.Classification.ValueObject", name = "GetTitolarioItemCodeInput")
    public JAXBElement<GetTitolarioItemCodeInput> createGetTitolarioItemCodeInput(GetTitolarioItemCodeInput value) {
        return new JAXBElement<GetTitolarioItemCodeInput>(_GetTitolarioItemCodeInput_QNAME, GetTitolarioItemCodeInput.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link ArrayOfFascicoloPreservation }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://schemas.datacontract.org/2004/07/SIAV.Classification.Entities.Fascicoli.ValueObject", name = "ArrayOfFascicoloPreservation")
    public JAXBElement<ArrayOfFascicoloPreservation> createArrayOfFascicoloPreservation(ArrayOfFascicoloPreservation value) {
        return new JAXBElement<ArrayOfFascicoloPreservation>(_ArrayOfFascicoloPreservation_QNAME, ArrayOfFascicoloPreservation.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link ReadBaseTitolarioItemCollSortedInput }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://schemas.datacontract.org/2004/07/Siav.Archiflow.Entities.Classification.ValueObject", name = "ReadBaseTitolarioItemCollSortedInput")
    public JAXBElement<ReadBaseTitolarioItemCollSortedInput> createReadBaseTitolarioItemCollSortedInput(ReadBaseTitolarioItemCollSortedInput value) {
        return new JAXBElement<ReadBaseTitolarioItemCollSortedInput>(_ReadBaseTitolarioItemCollSortedInput_QNAME, ReadBaseTitolarioItemCollSortedInput.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link DeleteTitolarioItemByPrimaryKeyOutput }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://schemas.datacontract.org/2004/07/Siav.Archiflow.Entities.Classification.ValueObject", name = "DeleteTitolarioItemByPrimaryKeyOutput")
    public JAXBElement<DeleteTitolarioItemByPrimaryKeyOutput> createDeleteTitolarioItemByPrimaryKeyOutput(DeleteTitolarioItemByPrimaryKeyOutput value) {
        return new JAXBElement<DeleteTitolarioItemByPrimaryKeyOutput>(_DeleteTitolarioItemByPrimaryKeyOutput_QNAME, DeleteTitolarioItemByPrimaryKeyOutput.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link UpdateValidToDateTitolarioItemInput }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://schemas.datacontract.org/2004/07/Siav.Archiflow.Entities.Classification.ValueObject", name = "UpdateValidToDateTitolarioItemInput")
    public JAXBElement<UpdateValidToDateTitolarioItemInput> createUpdateValidToDateTitolarioItemInput(UpdateValidToDateTitolarioItemInput value) {
        return new JAXBElement<UpdateValidToDateTitolarioItemInput>(_UpdateValidToDateTitolarioItemInput_QNAME, UpdateValidToDateTitolarioItemInput.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link ArrayOfFascicoloDocumentoEntity }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://schemas.datacontract.org/2004/07/SIAV.Classification.Entities.Fascicoli.ValueObject", name = "ArrayOfFascicoloDocumentoEntity")
    public JAXBElement<ArrayOfFascicoloDocumentoEntity> createArrayOfFascicoloDocumentoEntity(ArrayOfFascicoloDocumentoEntity value) {
        return new JAXBElement<ArrayOfFascicoloDocumentoEntity>(_ArrayOfFascicoloDocumentoEntity_QNAME, ArrayOfFascicoloDocumentoEntity.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link BaseFault }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://schemas.datacontract.org/2004/07/SIAV.Archiflow.Faults", name = "BaseFault")
    public JAXBElement<BaseFault> createBaseFault(BaseFault value) {
        return new JAXBElement<BaseFault>(_BaseFault_QNAME, BaseFault.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link ReadFascicoloVisibilityPrivacyInput }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://schemas.datacontract.org/2004/07/Siav.Archiflow.Entities.Classification.ValueObject", name = "ReadFascicoloVisibilityPrivacyInput")
    public JAXBElement<ReadFascicoloVisibilityPrivacyInput> createReadFascicoloVisibilityPrivacyInput(ReadFascicoloVisibilityPrivacyInput value) {
        return new JAXBElement<ReadFascicoloVisibilityPrivacyInput>(_ReadFascicoloVisibilityPrivacyInput_QNAME, ReadFascicoloVisibilityPrivacyInput.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link DocumentIdentifier }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://schemas.datacontract.org/2004/07/SIAV.Classification.Entities.Common.Identifier", name = "DocumentIdentifier")
    public JAXBElement<DocumentIdentifier> createDocumentIdentifier(DocumentIdentifier value) {
        return new JAXBElement<DocumentIdentifier>(_DocumentIdentifier_QNAME, DocumentIdentifier.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link byte[]}{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://schemas.microsoft.com/2003/10/Serialization/", name = "base64Binary")
    public JAXBElement<byte[]> createBase64Binary(byte[] value) {
        return new JAXBElement<byte[]>(_Base64Binary_QNAME, byte[].class, null, ((byte[]) value));
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link DeleteCheckOutTitolarioInput }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://schemas.datacontract.org/2004/07/Siav.Archiflow.Entities.Classification.ValueObject", name = "DeleteCheckOutTitolarioInput")
    public JAXBElement<DeleteCheckOutTitolarioInput> createDeleteCheckOutTitolarioInput(DeleteCheckOutTitolarioInput value) {
        return new JAXBElement<DeleteCheckOutTitolarioInput>(_DeleteCheckOutTitolarioInput_QNAME, DeleteCheckOutTitolarioInput.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link UpdateTipoFascicoloOutput }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://schemas.datacontract.org/2004/07/Siav.Archiflow.Entities.Classification.ValueObject", name = "UpdateTipoFascicoloOutput")
    public JAXBElement<UpdateTipoFascicoloOutput> createUpdateTipoFascicoloOutput(UpdateTipoFascicoloOutput value) {
        return new JAXBElement<UpdateTipoFascicoloOutput>(_UpdateTipoFascicoloOutput_QNAME, UpdateTipoFascicoloOutput.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link Byte }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://schemas.microsoft.com/2003/10/Serialization/", name = "byte")
    public JAXBElement<Byte> createByte(Byte value) {
        return new JAXBElement<Byte>(_Byte_QNAME, Byte.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link CheckInOutput }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://schemas.datacontract.org/2004/07/Siav.Archiflow.Entities.Classification.ValueObject", name = "CheckInOutput")
    public JAXBElement<CheckInOutput> createCheckInOutput(CheckInOutput value) {
        return new JAXBElement<CheckInOutput>(_CheckInOutput_QNAME, CheckInOutput.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link InsertMultiClassificaDocCollOutput }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://schemas.datacontract.org/2004/07/Siav.Archiflow.Entities.Classification.ValueObject", name = "InsertMultiClassificaDocCollOutput")
    public JAXBElement<InsertMultiClassificaDocCollOutput> createInsertMultiClassificaDocCollOutput(InsertMultiClassificaDocCollOutput value) {
        return new JAXBElement<InsertMultiClassificaDocCollOutput>(_InsertMultiClassificaDocCollOutput_QNAME, InsertMultiClassificaDocCollOutput.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link ReadFascicoloDocumentoOutput }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://schemas.datacontract.org/2004/07/Siav.Archiflow.Entities.Classification.ValueObject", name = "ReadFascicoloDocumentoOutput")
    public JAXBElement<ReadFascicoloDocumentoOutput> createReadFascicoloDocumentoOutput(ReadFascicoloDocumentoOutput value) {
        return new JAXBElement<ReadFascicoloDocumentoOutput>(_ReadFascicoloDocumentoOutput_QNAME, ReadFascicoloDocumentoOutput.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link IsTipoFascicoloUsedInput }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://schemas.datacontract.org/2004/07/Siav.Archiflow.Entities.Classification.ValueObject", name = "IsTipoFascicoloUsedInput")
    public JAXBElement<IsTipoFascicoloUsedInput> createIsTipoFascicoloUsedInput(IsTipoFascicoloUsedInput value) {
        return new JAXBElement<IsTipoFascicoloUsedInput>(_IsTipoFascicoloUsedInput_QNAME, IsTipoFascicoloUsedInput.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link CustomNullableOfint }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://schemas.datacontract.org/2004/07/SIAV.Classification.Entities.Common.BaseClass", name = "CustomNullableOfint")
    public JAXBElement<CustomNullableOfint> createCustomNullableOfint(CustomNullableOfint value) {
        return new JAXBElement<CustomNullableOfint>(_CustomNullableOfint_QNAME, CustomNullableOfint.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link InsertCampiTipoFascicoloInput }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://schemas.datacontract.org/2004/07/Siav.Archiflow.Entities.Classification.ValueObject", name = "InsertCampiTipoFascicoloInput")
    public JAXBElement<InsertCampiTipoFascicoloInput> createInsertCampiTipoFascicoloInput(InsertCampiTipoFascicoloInput value) {
        return new JAXBElement<InsertCampiTipoFascicoloInput>(_InsertCampiTipoFascicoloInput_QNAME, InsertCampiTipoFascicoloInput.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link ArrayOfBaseTitolario }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://schemas.datacontract.org/2004/07/SIAV.Classification.Entities.Titolario.ValueObject", name = "ArrayOfBaseTitolario")
    public JAXBElement<ArrayOfBaseTitolario> createArrayOfBaseTitolario(ArrayOfBaseTitolario value) {
        return new JAXBElement<ArrayOfBaseTitolario>(_ArrayOfBaseTitolario_QNAME, ArrayOfBaseTitolario.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link IsTitolarioItemUsedOutput }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://schemas.datacontract.org/2004/07/Siav.Archiflow.Entities.Classification.ValueObject", name = "IsTitolarioItemUsedOutput")
    public JAXBElement<IsTitolarioItemUsedOutput> createIsTitolarioItemUsedOutput(IsTitolarioItemUsedOutput value) {
        return new JAXBElement<IsTitolarioItemUsedOutput>(_IsTitolarioItemUsedOutput_QNAME, IsTitolarioItemUsedOutput.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link InsertDifformitaOutput }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://schemas.datacontract.org/2004/07/Siav.Archiflow.Entities.Classification.ValueObject", name = "InsertDifformitaOutput")
    public JAXBElement<InsertDifformitaOutput> createInsertDifformitaOutput(InsertDifformitaOutput value) {
        return new JAXBElement<InsertDifformitaOutput>(_InsertDifformitaOutput_QNAME, InsertDifformitaOutput.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link SendFascicoloOutput }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://schemas.datacontract.org/2004/07/Siav.Archiflow.Entities.Classification.ValueObject", name = "SendFascicoloOutput")
    public JAXBElement<SendFascicoloOutput> createSendFascicoloOutput(SendFascicoloOutput value) {
        return new JAXBElement<SendFascicoloOutput>(_SendFascicoloOutput_QNAME, SendFascicoloOutput.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link InsertClassificaDocCollOutput }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://schemas.datacontract.org/2004/07/Siav.Archiflow.Entities.Classification.ValueObject", name = "InsertClassificaDocCollOutput")
    public JAXBElement<InsertClassificaDocCollOutput> createInsertClassificaDocCollOutput(InsertClassificaDocCollOutput value) {
        return new JAXBElement<InsertClassificaDocCollOutput>(_InsertClassificaDocCollOutput_QNAME, InsertClassificaDocCollOutput.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link ClassificationExceptionSeverity }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://schemas.datacontract.org/2004/07/SIAV.Classification.Entities.Common.ValueObject", name = "ClassificationExceptionSeverity")
    public JAXBElement<ClassificationExceptionSeverity> createClassificationExceptionSeverity(ClassificationExceptionSeverity value) {
        return new JAXBElement<ClassificationExceptionSeverity>(_ClassificationExceptionSeverity_QNAME, ClassificationExceptionSeverity.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link CloseFascicoloOutput }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://schemas.datacontract.org/2004/07/Siav.Archiflow.Entities.Classification.ValueObject", name = "CloseFascicoloOutput")
    public JAXBElement<CloseFascicoloOutput> createCloseFascicoloOutput(CloseFascicoloOutput value) {
        return new JAXBElement<CloseFascicoloOutput>(_CloseFascicoloOutput_QNAME, CloseFascicoloOutput.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link BaseHistory }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://schemas.datacontract.org/2004/07/SIAV.Common.BaseClass.ValueObject", name = "BaseHistory")
    public JAXBElement<BaseHistory> createBaseHistory(BaseHistory value) {
        return new JAXBElement<BaseHistory>(_BaseHistory_QNAME, BaseHistory.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link GetTitolarioSonsOutput }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://schemas.datacontract.org/2004/07/Siav.Archiflow.Entities.Classification.ValueObject", name = "GetTitolarioSonsOutput")
    public JAXBElement<GetTitolarioSonsOutput> createGetTitolarioSonsOutput(GetTitolarioSonsOutput value) {
        return new JAXBElement<GetTitolarioSonsOutput>(_GetTitolarioSonsOutput_QNAME, GetTitolarioSonsOutput.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link DeleteClassificaDocumentoOutput }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://schemas.datacontract.org/2004/07/Siav.Archiflow.Entities.Classification.ValueObject", name = "DeleteClassificaDocumentoOutput")
    public JAXBElement<DeleteClassificaDocumentoOutput> createDeleteClassificaDocumentoOutput(DeleteClassificaDocumentoOutput value) {
        return new JAXBElement<DeleteClassificaDocumentoOutput>(_DeleteClassificaDocumentoOutput_QNAME, DeleteClassificaDocumentoOutput.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link DeleteCheckOutTitolarioItemOutput }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://schemas.datacontract.org/2004/07/Siav.Archiflow.Entities.Classification.ValueObject", name = "DeleteCheckOutTitolarioItemOutput")
    public JAXBElement<DeleteCheckOutTitolarioItemOutput> createDeleteCheckOutTitolarioItemOutput(DeleteCheckOutTitolarioItemOutput value) {
        return new JAXBElement<DeleteCheckOutTitolarioItemOutput>(_DeleteCheckOutTitolarioItemOutput_QNAME, DeleteCheckOutTitolarioItemOutput.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link ReadTitolarioItemBaseInput }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://schemas.datacontract.org/2004/07/Siav.Archiflow.Entities.Classification.ValueObject", name = "ReadTitolarioItemBaseInput")
    public JAXBElement<ReadTitolarioItemBaseInput> createReadTitolarioItemBaseInput(ReadTitolarioItemBaseInput value) {
        return new JAXBElement<ReadTitolarioItemBaseInput>(_ReadTitolarioItemBaseInput_QNAME, ReadTitolarioItemBaseInput.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link ReadBaseTitolarioItemCollSortedOutput }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://schemas.datacontract.org/2004/07/Siav.Archiflow.Entities.Classification.ValueObject", name = "ReadBaseTitolarioItemCollSortedOutput")
    public JAXBElement<ReadBaseTitolarioItemCollSortedOutput> createReadBaseTitolarioItemCollSortedOutput(ReadBaseTitolarioItemCollSortedOutput value) {
        return new JAXBElement<ReadBaseTitolarioItemCollSortedOutput>(_ReadBaseTitolarioItemCollSortedOutput_QNAME, ReadBaseTitolarioItemCollSortedOutput.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link ArrayOfBaseFascicoloDocumento }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://schemas.datacontract.org/2004/07/SIAV.Classification.Entities.Fascicoli.ValueObject", name = "ArrayOfBaseFascicoloDocumento")
    public JAXBElement<ArrayOfBaseFascicoloDocumento> createArrayOfBaseFascicoloDocumento(ArrayOfBaseFascicoloDocumento value) {
        return new JAXBElement<ArrayOfBaseFascicoloDocumento>(_ArrayOfBaseFascicoloDocumento_QNAME, ArrayOfBaseFascicoloDocumento.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link ReadFascicoloNotesOutput }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://schemas.datacontract.org/2004/07/Siav.Archiflow.Entities.Classification.ValueObject", name = "ReadFascicoloNotesOutput")
    public JAXBElement<ReadFascicoloNotesOutput> createReadFascicoloNotesOutput(ReadFascicoloNotesOutput value) {
        return new JAXBElement<ReadFascicoloNotesOutput>(_ReadFascicoloNotesOutput_QNAME, ReadFascicoloNotesOutput.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link ArrayOfOfficeChart }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://schemas.datacontract.org/2004/07/SIAV.Archiflow.Entities.Chart.ValueObject", name = "ArrayOfOfficeChart")
    public JAXBElement<ArrayOfOfficeChart> createArrayOfOfficeChart(ArrayOfOfficeChart value) {
        return new JAXBElement<ArrayOfOfficeChart>(_ArrayOfOfficeChart_QNAME, ArrayOfOfficeChart.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link FascicoloPreservation }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://schemas.datacontract.org/2004/07/SIAV.Classification.Entities.Fascicoli.ValueObject", name = "FascicoloPreservation")
    public JAXBElement<FascicoloPreservation> createFascicoloPreservation(FascicoloPreservation value) {
        return new JAXBElement<FascicoloPreservation>(_FascicoloPreservation_QNAME, FascicoloPreservation.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link ArrayOfCampiTipoFascicoloValue }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://schemas.datacontract.org/2004/07/SIAV.Classification.Entities.Fascicoli.ValueObject", name = "ArrayOfCampiTipoFascicoloValue")
    public JAXBElement<ArrayOfCampiTipoFascicoloValue> createArrayOfCampiTipoFascicoloValue(ArrayOfCampiTipoFascicoloValue value) {
        return new JAXBElement<ArrayOfCampiTipoFascicoloValue>(_ArrayOfCampiTipoFascicoloValue_QNAME, ArrayOfCampiTipoFascicoloValue.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link CheckOutTitolarioOutput }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://schemas.datacontract.org/2004/07/Siav.Archiflow.Entities.Classification.ValueObject", name = "CheckOutTitolarioOutput")
    public JAXBElement<CheckOutTitolarioOutput> createCheckOutTitolarioOutput(CheckOutTitolarioOutput value) {
        return new JAXBElement<CheckOutTitolarioOutput>(_CheckOutTitolarioOutput_QNAME, CheckOutTitolarioOutput.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link SetPrimaryClassificaDocumentoOutput }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://schemas.datacontract.org/2004/07/Siav.Archiflow.Entities.Classification.ValueObject", name = "SetPrimaryClassificaDocumentoOutput")
    public JAXBElement<SetPrimaryClassificaDocumentoOutput> createSetPrimaryClassificaDocumentoOutput(SetPrimaryClassificaDocumentoOutput value) {
        return new JAXBElement<SetPrimaryClassificaDocumentoOutput>(_SetPrimaryClassificaDocumentoOutput_QNAME, SetPrimaryClassificaDocumentoOutput.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link LegislaturaIdentifier }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://schemas.datacontract.org/2004/07/SIAV.Classification.Entities.Fascicoli.ValueObject", name = "LegislaturaIdentifier")
    public JAXBElement<LegislaturaIdentifier> createLegislaturaIdentifier(LegislaturaIdentifier value) {
        return new JAXBElement<LegislaturaIdentifier>(_LegislaturaIdentifier_QNAME, LegislaturaIdentifier.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link DeleteLegislaturaOutput }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://schemas.datacontract.org/2004/07/Siav.Archiflow.Entities.Classification.ValueObject", name = "DeleteLegislaturaOutput")
    public JAXBElement<DeleteLegislaturaOutput> createDeleteLegislaturaOutput(DeleteLegislaturaOutput value) {
        return new JAXBElement<DeleteLegislaturaOutput>(_DeleteLegislaturaOutput_QNAME, DeleteLegislaturaOutput.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link CampiTipoFascicoloValue }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://schemas.datacontract.org/2004/07/SIAV.Classification.Entities.Fascicoli.ValueObject", name = "CampiTipoFascicoloValue")
    public JAXBElement<CampiTipoFascicoloValue> createCampiTipoFascicoloValue(CampiTipoFascicoloValue value) {
        return new JAXBElement<CampiTipoFascicoloValue>(_CampiTipoFascicoloValue_QNAME, CampiTipoFascicoloValue.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link Integer }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://schemas.microsoft.com/2003/10/Serialization/", name = "unsignedShort")
    public JAXBElement<Integer> createUnsignedShort(Integer value) {
        return new JAXBElement<Integer>(_UnsignedShort_QNAME, Integer.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link ArrayOfTitolarioEntity }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://schemas.datacontract.org/2004/07/SIAV.Classification.Entities.Titolario.ValueObject", name = "ArrayOfTitolarioEntity")
    public JAXBElement<ArrayOfTitolarioEntity> createArrayOfTitolarioEntity(ArrayOfTitolarioEntity value) {
        return new JAXBElement<ArrayOfTitolarioEntity>(_ArrayOfTitolarioEntity_QNAME, ArrayOfTitolarioEntity.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link DeleteFascicoloDocumentoInput }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://schemas.datacontract.org/2004/07/Siav.Archiflow.Entities.Classification.ValueObject", name = "DeleteFascicoloDocumentoInput")
    public JAXBElement<DeleteFascicoloDocumentoInput> createDeleteFascicoloDocumentoInput(DeleteFascicoloDocumentoInput value) {
        return new JAXBElement<DeleteFascicoloDocumentoInput>(_DeleteFascicoloDocumentoInput_QNAME, DeleteFascicoloDocumentoInput.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link ReadClassFascDocumentoOutput }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://schemas.datacontract.org/2004/07/Siav.Archiflow.Entities.Classification.ValueObject", name = "ReadClassFascDocumentoOutput")
    public JAXBElement<ReadClassFascDocumentoOutput> createReadClassFascDocumentoOutput(ReadClassFascDocumentoOutput value) {
        return new JAXBElement<ReadClassFascDocumentoOutput>(_ReadClassFascDocumentoOutput_QNAME, ReadClassFascDocumentoOutput.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link TitolarioTemplateEntity }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://schemas.datacontract.org/2004/07/SIAV.Classification.Entities.Titolario.ValueObject", name = "TitolarioTemplateEntity")
    public JAXBElement<TitolarioTemplateEntity> createTitolarioTemplateEntity(TitolarioTemplateEntity value) {
        return new JAXBElement<TitolarioTemplateEntity>(_TitolarioTemplateEntity_QNAME, TitolarioTemplateEntity.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link DeleteFascicoloOutput }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://schemas.datacontract.org/2004/07/Siav.Archiflow.Entities.Classification.ValueObject", name = "DeleteFascicoloOutput")
    public JAXBElement<DeleteFascicoloOutput> createDeleteFascicoloOutput(DeleteFascicoloOutput value) {
        return new JAXBElement<DeleteFascicoloOutput>(_DeleteFascicoloOutput_QNAME, DeleteFascicoloOutput.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link InsertTipoFascVisibilityInput }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://schemas.datacontract.org/2004/07/Siav.Archiflow.Entities.Classification.ValueObject", name = "InsertTipoFascVisibilityInput")
    public JAXBElement<InsertTipoFascVisibilityInput> createInsertTipoFascVisibilityInput(InsertTipoFascVisibilityInput value) {
        return new JAXBElement<InsertTipoFascVisibilityInput>(_InsertTipoFascVisibilityInput_QNAME, InsertTipoFascVisibilityInput.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link ArchiflowServiceExceptionDetail }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://schemas.datacontract.org/2004/07/SIAV.Archiflow.Exceptions", name = "ArchiflowServiceExceptionDetail")
    public JAXBElement<ArchiflowServiceExceptionDetail> createArchiflowServiceExceptionDetail(ArchiflowServiceExceptionDetail value) {
        return new JAXBElement<ArchiflowServiceExceptionDetail>(_ArchiflowServiceExceptionDetail_QNAME, ArchiflowServiceExceptionDetail.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link Short }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://schemas.microsoft.com/2003/10/Serialization/", name = "short")
    public JAXBElement<Short> createShort(Short value) {
        return new JAXBElement<Short>(_Short_QNAME, Short.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link CustomIntNullable }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://schemas.datacontract.org/2004/07/SIAV.Classification.Entities.Common.BaseClass", name = "CustomIntNullable")
    public JAXBElement<CustomIntNullable> createCustomIntNullable(CustomIntNullable value) {
        return new JAXBElement<CustomIntNullable>(_CustomIntNullable_QNAME, CustomIntNullable.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link SearchBaseFascicoloInput }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://schemas.datacontract.org/2004/07/Siav.Archiflow.Entities.Classification.ValueObject", name = "SearchBaseFascicoloInput")
    public JAXBElement<SearchBaseFascicoloInput> createSearchBaseFascicoloInput(SearchBaseFascicoloInput value) {
        return new JAXBElement<SearchBaseFascicoloInput>(_SearchBaseFascicoloInput_QNAME, SearchBaseFascicoloInput.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link TipoFascicoloIdentifier }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://schemas.datacontract.org/2004/07/SIAV.Classification.Entities.TipoFascicolo.Identifier", name = "TipoFascicoloIdentifier")
    public JAXBElement<TipoFascicoloIdentifier> createTipoFascicoloIdentifier(TipoFascicoloIdentifier value) {
        return new JAXBElement<TipoFascicoloIdentifier>(_TipoFascicoloIdentifier_QNAME, TipoFascicoloIdentifier.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link SetPrimaryFascicoloDocumentoInput }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://schemas.datacontract.org/2004/07/Siav.Archiflow.Entities.Classification.ValueObject", name = "SetPrimaryFascicoloDocumentoInput")
    public JAXBElement<SetPrimaryFascicoloDocumentoInput> createSetPrimaryFascicoloDocumentoInput(SetPrimaryFascicoloDocumentoInput value) {
        return new JAXBElement<SetPrimaryFascicoloDocumentoInput>(_SetPrimaryFascicoloDocumentoInput_QNAME, SetPrimaryFascicoloDocumentoInput.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link BaseValueObject }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://schemas.datacontract.org/2004/07/SIAV.Common.BaseClass.ValueObject", name = "BaseValueObject")
    public JAXBElement<BaseValueObject> createBaseValueObject(BaseValueObject value) {
        return new JAXBElement<BaseValueObject>(_BaseValueObject_QNAME, BaseValueObject.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link UpdateTitolarioOutput }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://schemas.datacontract.org/2004/07/Siav.Archiflow.Entities.Classification.ValueObject", name = "UpdateTitolarioOutput")
    public JAXBElement<UpdateTitolarioOutput> createUpdateTitolarioOutput(UpdateTitolarioOutput value) {
        return new JAXBElement<UpdateTitolarioOutput>(_UpdateTitolarioOutput_QNAME, UpdateTitolarioOutput.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link ExpirationMethodType }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://schemas.datacontract.org/2004/07/SIAV.Archiflow.Entities.Types", name = "ExpirationMethodType")
    public JAXBElement<ExpirationMethodType> createExpirationMethodType(ExpirationMethodType value) {
        return new JAXBElement<ExpirationMethodType>(_ExpirationMethodType_QNAME, ExpirationMethodType.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link TipoFascDiffSearcher }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://schemas.datacontract.org/2004/07/SIAV.Classification.Entities.TipoFascicolo.Searcher", name = "TipoFascDiffSearcher")
    public JAXBElement<TipoFascDiffSearcher> createTipoFascDiffSearcher(TipoFascDiffSearcher value) {
        return new JAXBElement<TipoFascDiffSearcher>(_TipoFascDiffSearcher_QNAME, TipoFascDiffSearcher.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link DeleteCheckOutInput }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://schemas.datacontract.org/2004/07/Siav.Archiflow.Entities.Classification.ValueObject", name = "DeleteCheckOutInput")
    public JAXBElement<DeleteCheckOutInput> createDeleteCheckOutInput(DeleteCheckOutInput value) {
        return new JAXBElement<DeleteCheckOutInput>(_DeleteCheckOutInput_QNAME, DeleteCheckOutInput.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link CheckOutTitolarioInput }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://schemas.datacontract.org/2004/07/Siav.Archiflow.Entities.Classification.ValueObject", name = "CheckOutTitolarioInput")
    public JAXBElement<CheckOutTitolarioInput> createCheckOutTitolarioInput(CheckOutTitolarioInput value) {
        return new JAXBElement<CheckOutTitolarioInput>(_CheckOutTitolarioInput_QNAME, CheckOutTitolarioInput.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link UpdateStatusTitolarioInput }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://schemas.datacontract.org/2004/07/Siav.Archiflow.Entities.Classification.ValueObject", name = "UpdateStatusTitolarioInput")
    public JAXBElement<UpdateStatusTitolarioInput> createUpdateStatusTitolarioInput(UpdateStatusTitolarioInput value) {
        return new JAXBElement<UpdateStatusTitolarioInput>(_UpdateStatusTitolarioInput_QNAME, UpdateStatusTitolarioInput.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link PrivacyEmptyFault }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://schemas.datacontract.org/2004/07/SIAV.Archiflow.Faults", name = "PrivacyEmptyFault")
    public JAXBElement<PrivacyEmptyFault> createPrivacyEmptyFault(PrivacyEmptyFault value) {
        return new JAXBElement<PrivacyEmptyFault>(_PrivacyEmptyFault_QNAME, PrivacyEmptyFault.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link ReadTitolarioItemCollOutput }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://schemas.datacontract.org/2004/07/Siav.Archiflow.Entities.Classification.ValueObject", name = "ReadTitolarioItemCollOutput")
    public JAXBElement<ReadTitolarioItemCollOutput> createReadTitolarioItemCollOutput(ReadTitolarioItemCollOutput value) {
        return new JAXBElement<ReadTitolarioItemCollOutput>(_ReadTitolarioItemCollOutput_QNAME, ReadTitolarioItemCollOutput.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link UpdateCampiTipoFascicoloOutput }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://schemas.datacontract.org/2004/07/Siav.Archiflow.Entities.Classification.ValueObject", name = "UpdateCampiTipoFascicoloOutput")
    public JAXBElement<UpdateCampiTipoFascicoloOutput> createUpdateCampiTipoFascicoloOutput(UpdateCampiTipoFascicoloOutput value) {
        return new JAXBElement<UpdateCampiTipoFascicoloOutput>(_UpdateCampiTipoFascicoloOutput_QNAME, UpdateCampiTipoFascicoloOutput.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link AbstractTitolario }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://schemas.datacontract.org/2004/07/SIAV.Classification.Entities.Titolario.ValueObject", name = "AbstractTitolario")
    public JAXBElement<AbstractTitolario> createAbstractTitolario(AbstractTitolario value) {
        return new JAXBElement<AbstractTitolario>(_AbstractTitolario_QNAME, AbstractTitolario.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link ReadTipoFascVisibilityOutput }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://schemas.datacontract.org/2004/07/Siav.Archiflow.Entities.Classification.ValueObject", name = "ReadTipoFascVisibilityOutput")
    public JAXBElement<ReadTipoFascVisibilityOutput> createReadTipoFascVisibilityOutput(ReadTipoFascVisibilityOutput value) {
        return new JAXBElement<ReadTipoFascVisibilityOutput>(_ReadTipoFascVisibilityOutput_QNAME, ReadTipoFascVisibilityOutput.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link Long }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://schemas.microsoft.com/2003/10/Serialization/", name = "unsignedInt")
    public JAXBElement<Long> createUnsignedInt(Long value) {
        return new JAXBElement<Long>(_UnsignedInt_QNAME, Long.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link PreservationClassificationNotEnabledFault }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://schemas.datacontract.org/2004/07/SIAV.Archiflow.Faults", name = "PreservationClassificationNotEnabledFault")
    public JAXBElement<PreservationClassificationNotEnabledFault> createPreservationClassificationNotEnabledFault(PreservationClassificationNotEnabledFault value) {
        return new JAXBElement<PreservationClassificationNotEnabledFault>(_PreservationClassificationNotEnabledFault_QNAME, PreservationClassificationNotEnabledFault.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link ReadValoreCampiTipoFascicoloOutput }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://schemas.datacontract.org/2004/07/Siav.Archiflow.Entities.Classification.ValueObject", name = "ReadValoreCampiTipoFascicoloOutput")
    public JAXBElement<ReadValoreCampiTipoFascicoloOutput> createReadValoreCampiTipoFascicoloOutput(ReadValoreCampiTipoFascicoloOutput value) {
        return new JAXBElement<ReadValoreCampiTipoFascicoloOutput>(_ReadValoreCampiTipoFascicoloOutput_QNAME, ReadValoreCampiTipoFascicoloOutput.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link DeleteTitolarioItemByTitolarioIdOutput }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://schemas.datacontract.org/2004/07/Siav.Archiflow.Entities.Classification.ValueObject", name = "DeleteTitolarioItemByTitolarioIdOutput")
    public JAXBElement<DeleteTitolarioItemByTitolarioIdOutput> createDeleteTitolarioItemByTitolarioIdOutput(DeleteTitolarioItemByTitolarioIdOutput value) {
        return new JAXBElement<DeleteTitolarioItemByTitolarioIdOutput>(_DeleteTitolarioItemByTitolarioIdOutput_QNAME, DeleteTitolarioItemByTitolarioIdOutput.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link IsFascicoloInCurrentTitolarioOutput }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://schemas.datacontract.org/2004/07/Siav.Archiflow.Entities.Classification.ValueObject", name = "IsFascicoloInCurrentTitolarioOutput")
    public JAXBElement<IsFascicoloInCurrentTitolarioOutput> createIsFascicoloInCurrentTitolarioOutput(IsFascicoloInCurrentTitolarioOutput value) {
        return new JAXBElement<IsFascicoloInCurrentTitolarioOutput>(_IsFascicoloInCurrentTitolarioOutput_QNAME, IsFascicoloInCurrentTitolarioOutput.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link ArrayOfstring }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://schemas.microsoft.com/2003/10/Serialization/Arrays", name = "ArrayOfstring")
    public JAXBElement<ArrayOfstring> createArrayOfstring(ArrayOfstring value) {
        return new JAXBElement<ArrayOfstring>(_ArrayOfstring_QNAME, ArrayOfstring.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link OpenFascicoloOutput }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://schemas.datacontract.org/2004/07/Siav.Archiflow.Entities.Classification.ValueObject", name = "OpenFascicoloOutput")
    public JAXBElement<OpenFascicoloOutput> createOpenFascicoloOutput(OpenFascicoloOutput value) {
        return new JAXBElement<OpenFascicoloOutput>(_OpenFascicoloOutput_QNAME, OpenFascicoloOutput.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link ReadTitolarioItemCollInput }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://schemas.datacontract.org/2004/07/Siav.Archiflow.Entities.Classification.ValueObject", name = "ReadTitolarioItemCollInput")
    public JAXBElement<ReadTitolarioItemCollInput> createReadTitolarioItemCollInput(ReadTitolarioItemCollInput value) {
        return new JAXBElement<ReadTitolarioItemCollInput>(_ReadTitolarioItemCollInput_QNAME, ReadTitolarioItemCollInput.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link InsertTitolarioInput }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://schemas.datacontract.org/2004/07/Siav.Archiflow.Entities.Classification.ValueObject", name = "InsertTitolarioInput")
    public JAXBElement<InsertTitolarioInput> createInsertTitolarioInput(InsertTitolarioInput value) {
        return new JAXBElement<InsertTitolarioInput>(_InsertTitolarioInput_QNAME, InsertTitolarioInput.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link InsertTitolarioItemOutput }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://schemas.datacontract.org/2004/07/Siav.Archiflow.Entities.Classification.ValueObject", name = "InsertTitolarioItemOutput")
    public JAXBElement<InsertTitolarioItemOutput> createInsertTitolarioItemOutput(InsertTitolarioItemOutput value) {
        return new JAXBElement<InsertTitolarioItemOutput>(_InsertTitolarioItemOutput_QNAME, InsertTitolarioItemOutput.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link ArrayOfBaseClassificaDocumento }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://schemas.datacontract.org/2004/07/SIAV.Classification.Entities.Titolario.ValueObject", name = "ArrayOfBaseClassificaDocumento")
    public JAXBElement<ArrayOfBaseClassificaDocumento> createArrayOfBaseClassificaDocumento(ArrayOfBaseClassificaDocumento value) {
        return new JAXBElement<ArrayOfBaseClassificaDocumento>(_ArrayOfBaseClassificaDocumento_QNAME, ArrayOfBaseClassificaDocumento.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link ArrayOfTipoFascicoloEntity }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://schemas.datacontract.org/2004/07/SIAV.Classification.Entities.TipoFascicolo.ValueObject", name = "ArrayOfTipoFascicoloEntity")
    public JAXBElement<ArrayOfTipoFascicoloEntity> createArrayOfTipoFascicoloEntity(ArrayOfTipoFascicoloEntity value) {
        return new JAXBElement<ArrayOfTipoFascicoloEntity>(_ArrayOfTipoFascicoloEntity_QNAME, ArrayOfTipoFascicoloEntity.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link CoupleIdentifier }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://schemas.datacontract.org/2004/07/SIAV.Common.BaseClass.ValueObject", name = "CoupleIdentifier")
    public JAXBElement<CoupleIdentifier> createCoupleIdentifier(CoupleIdentifier value) {
        return new JAXBElement<CoupleIdentifier>(_CoupleIdentifier_QNAME, CoupleIdentifier.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link ReadBaseTitolarioInput }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://schemas.datacontract.org/2004/07/Siav.Archiflow.Entities.Classification.ValueObject", name = "ReadBaseTitolarioInput")
    public JAXBElement<ReadBaseTitolarioInput> createReadBaseTitolarioInput(ReadBaseTitolarioInput value) {
        return new JAXBElement<ReadBaseTitolarioInput>(_ReadBaseTitolarioInput_QNAME, ReadBaseTitolarioInput.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link UpdateStatoFascicoloInput }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://schemas.datacontract.org/2004/07/Siav.Archiflow.Entities.Classification.ValueObject", name = "UpdateStatoFascicoloInput")
    public JAXBElement<UpdateStatoFascicoloInput> createUpdateStatoFascicoloInput(UpdateStatoFascicoloInput value) {
        return new JAXBElement<UpdateStatoFascicoloInput>(_UpdateStatoFascicoloInput_QNAME, UpdateStatoFascicoloInput.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link DeleteFascicoloDocumentoOutput }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://schemas.datacontract.org/2004/07/Siav.Archiflow.Entities.Classification.ValueObject", name = "DeleteFascicoloDocumentoOutput")
    public JAXBElement<DeleteFascicoloDocumentoOutput> createDeleteFascicoloDocumentoOutput(DeleteFascicoloDocumentoOutput value) {
        return new JAXBElement<DeleteFascicoloDocumentoOutput>(_DeleteFascicoloDocumentoOutput_QNAME, DeleteFascicoloDocumentoOutput.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link UpdateValidToDateTitolarioOutput }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://schemas.datacontract.org/2004/07/Siav.Archiflow.Entities.Classification.ValueObject", name = "UpdateValidToDateTitolarioOutput")
    public JAXBElement<UpdateValidToDateTitolarioOutput> createUpdateValidToDateTitolarioOutput(UpdateValidToDateTitolarioOutput value) {
        return new JAXBElement<UpdateValidToDateTitolarioOutput>(_UpdateValidToDateTitolarioOutput_QNAME, UpdateValidToDateTitolarioOutput.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link ArrayOfCampiTipoFascicolo }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://schemas.datacontract.org/2004/07/SIAV.Classification.Entities.TipoFascicolo.ValueObject", name = "ArrayOfCampiTipoFascicolo")
    public JAXBElement<ArrayOfCampiTipoFascicolo> createArrayOfCampiTipoFascicolo(ArrayOfCampiTipoFascicolo value) {
        return new JAXBElement<ArrayOfCampiTipoFascicolo>(_ArrayOfCampiTipoFascicolo_QNAME, ArrayOfCampiTipoFascicolo.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link RecoveryFascicoloOutput }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://schemas.datacontract.org/2004/07/Siav.Archiflow.Entities.Classification.ValueObject", name = "RecoveryFascicoloOutput")
    public JAXBElement<RecoveryFascicoloOutput> createRecoveryFascicoloOutput(RecoveryFascicoloOutput value) {
        return new JAXBElement<RecoveryFascicoloOutput>(_RecoveryFascicoloOutput_QNAME, RecoveryFascicoloOutput.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link Integer }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://schemas.microsoft.com/2003/10/Serialization/", name = "char")
    public JAXBElement<Integer> createChar(Integer value) {
        return new JAXBElement<Integer>(_Char_QNAME, Integer.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link SessionInfo }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://schemas.datacontract.org/2004/07/SIAV.Archiflow.Entities.Login.ValueObject", name = "SessionInfo")
    public JAXBElement<SessionInfo> createSessionInfo(SessionInfo value) {
        return new JAXBElement<SessionInfo>(_SessionInfo_QNAME, SessionInfo.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link ArrayOfBaseFascicolo }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://schemas.datacontract.org/2004/07/SIAV.Classification.Entities.Fascicoli.ValueObject", name = "ArrayOfBaseFascicolo")
    public JAXBElement<ArrayOfBaseFascicolo> createArrayOfBaseFascicolo(ArrayOfBaseFascicolo value) {
        return new JAXBElement<ArrayOfBaseFascicolo>(_ArrayOfBaseFascicolo_QNAME, ArrayOfBaseFascicolo.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link BaseIdentifier }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://schemas.datacontract.org/2004/07/SIAV.Common.BaseClass.ValueObject", name = "BaseIdentifier")
    public JAXBElement<BaseIdentifier> createBaseIdentifier(BaseIdentifier value) {
        return new JAXBElement<BaseIdentifier>(_BaseIdentifier_QNAME, BaseIdentifier.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link CopyTipoFascicoloInput }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://schemas.datacontract.org/2004/07/Siav.Archiflow.Entities.Classification.ValueObject", name = "CopyTipoFascicoloInput")
    public JAXBElement<CopyTipoFascicoloInput> createCopyTipoFascicoloInput(CopyTipoFascicoloInput value) {
        return new JAXBElement<CopyTipoFascicoloInput>(_CopyTipoFascicoloInput_QNAME, CopyTipoFascicoloInput.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link TypeIdentifier }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://schemas.datacontract.org/2004/07/SIAV.Common.BaseClass.ValueObject", name = "TypeIdentifier")
    public JAXBElement<TypeIdentifier> createTypeIdentifier(TypeIdentifier value) {
        return new JAXBElement<TypeIdentifier>(_TypeIdentifier_QNAME, TypeIdentifier.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link LoggableBase }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://schemas.datacontract.org/2004/07/SIAV.Common.Tools.Log", name = "LoggableBase")
    public JAXBElement<LoggableBase> createLoggableBase(LoggableBase value) {
        return new JAXBElement<LoggableBase>(_LoggableBase_QNAME, LoggableBase.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link UpdateTipoFascicoloInput }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://schemas.datacontract.org/2004/07/Siav.Archiflow.Entities.Classification.ValueObject", name = "UpdateTipoFascicoloInput")
    public JAXBElement<UpdateTipoFascicoloInput> createUpdateTipoFascicoloInput(UpdateTipoFascicoloInput value) {
        return new JAXBElement<UpdateTipoFascicoloInput>(_UpdateTipoFascicoloInput_QNAME, UpdateTipoFascicoloInput.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link ReadTitolarioItemInput }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://schemas.datacontract.org/2004/07/Siav.Archiflow.Entities.Classification.ValueObject", name = "ReadTitolarioItemInput")
    public JAXBElement<ReadTitolarioItemInput> createReadTitolarioItemInput(ReadTitolarioItemInput value) {
        return new JAXBElement<ReadTitolarioItemInput>(_ReadTitolarioItemInput_QNAME, ReadTitolarioItemInput.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link ReadFascicoloVisibilityInput }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://schemas.datacontract.org/2004/07/Siav.Archiflow.Entities.Classification.ValueObject", name = "ReadFascicoloVisibilityInput")
    public JAXBElement<ReadFascicoloVisibilityInput> createReadFascicoloVisibilityInput(ReadFascicoloVisibilityInput value) {
        return new JAXBElement<ReadFascicoloVisibilityInput>(_ReadFascicoloVisibilityInput_QNAME, ReadFascicoloVisibilityInput.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link FascHistoryOrder }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://schemas.datacontract.org/2004/07/SIAV.Archiflow.Types", name = "FascHistoryOrder")
    public JAXBElement<FascHistoryOrder> createFascHistoryOrder(FascHistoryOrder value) {
        return new JAXBElement<FascHistoryOrder>(_FascHistoryOrder_QNAME, FascHistoryOrder.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link CheckOutTitolarioItemInput }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://schemas.datacontract.org/2004/07/Siav.Archiflow.Entities.Classification.ValueObject", name = "CheckOutTitolarioItemInput")
    public JAXBElement<CheckOutTitolarioItemInput> createCheckOutTitolarioItemInput(CheckOutTitolarioItemInput value) {
        return new JAXBElement<CheckOutTitolarioItemInput>(_CheckOutTitolarioItemInput_QNAME, CheckOutTitolarioItemInput.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link InsertDifformitaInput }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://schemas.datacontract.org/2004/07/Siav.Archiflow.Entities.Classification.ValueObject", name = "InsertDifformitaInput")
    public JAXBElement<InsertDifformitaInput> createInsertDifformitaInput(InsertDifformitaInput value) {
        return new JAXBElement<InsertDifformitaInput>(_InsertDifformitaInput_QNAME, InsertDifformitaInput.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link InsertClassificaDocumentoOutput }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://schemas.datacontract.org/2004/07/Siav.Archiflow.Entities.Classification.ValueObject", name = "InsertClassificaDocumentoOutput")
    public JAXBElement<InsertClassificaDocumentoOutput> createInsertClassificaDocumentoOutput(InsertClassificaDocumentoOutput value) {
        return new JAXBElement<InsertClassificaDocumentoOutput>(_InsertClassificaDocumentoOutput_QNAME, InsertClassificaDocumentoOutput.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link DeleteTitolarioItemByPrimaryKeyInput }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://schemas.datacontract.org/2004/07/Siav.Archiflow.Entities.Classification.ValueObject", name = "DeleteTitolarioItemByPrimaryKeyInput")
    public JAXBElement<DeleteTitolarioItemByPrimaryKeyInput> createDeleteTitolarioItemByPrimaryKeyInput(DeleteTitolarioItemByPrimaryKeyInput value) {
        return new JAXBElement<DeleteTitolarioItemByPrimaryKeyInput>(_DeleteTitolarioItemByPrimaryKeyInput_QNAME, DeleteTitolarioItemByPrimaryKeyInput.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link ReadClassFascDocumentoInput }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://schemas.datacontract.org/2004/07/Siav.Archiflow.Entities.Classification.ValueObject", name = "ReadClassFascDocumentoInput")
    public JAXBElement<ReadClassFascDocumentoInput> createReadClassFascDocumentoInput(ReadClassFascDocumentoInput value) {
        return new JAXBElement<ReadClassFascDocumentoInput>(_ReadClassFascDocumentoInput_QNAME, ReadClassFascDocumentoInput.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link GetFascicoloToPreserveInput }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://schemas.datacontract.org/2004/07/Siav.Archiflow.Entities.Classification.ValueObject", name = "GetFascicoloToPreserveInput")
    public JAXBElement<GetFascicoloToPreserveInput> createGetFascicoloToPreserveInput(GetFascicoloToPreserveInput value) {
        return new JAXBElement<GetFascicoloToPreserveInput>(_GetFascicoloToPreserveInput_QNAME, GetFascicoloToPreserveInput.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link FascicoloIdentifier }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://schemas.datacontract.org/2004/07/SIAV.Classification.Entities.Fascicoli.Identifier", name = "FascicoloIdentifier")
    public JAXBElement<FascicoloIdentifier> createFascicoloIdentifier(FascicoloIdentifier value) {
        return new JAXBElement<FascicoloIdentifier>(_FascicoloIdentifier_QNAME, FascicoloIdentifier.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link ReadFascicoloHierarchyInput }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://schemas.datacontract.org/2004/07/Siav.Archiflow.Entities.Classification.ValueObject", name = "ReadFascicoloHierarchyInput")
    public JAXBElement<ReadFascicoloHierarchyInput> createReadFascicoloHierarchyInput(ReadFascicoloHierarchyInput value) {
        return new JAXBElement<ReadFascicoloHierarchyInput>(_ReadFascicoloHierarchyInput_QNAME, ReadFascicoloHierarchyInput.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link ReadClassificaDocumentoInput }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://schemas.datacontract.org/2004/07/Siav.Archiflow.Entities.Classification.ValueObject", name = "ReadClassificaDocumentoInput")
    public JAXBElement<ReadClassificaDocumentoInput> createReadClassificaDocumentoInput(ReadClassificaDocumentoInput value) {
        return new JAXBElement<ReadClassificaDocumentoInput>(_ReadClassificaDocumentoInput_QNAME, ReadClassificaDocumentoInput.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link InsertTipoFascicoloInput }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://schemas.datacontract.org/2004/07/Siav.Archiflow.Entities.Classification.ValueObject", name = "InsertTipoFascicoloInput")
    public JAXBElement<InsertTipoFascicoloInput> createInsertTipoFascicoloInput(InsertTipoFascicoloInput value) {
        return new JAXBElement<InsertTipoFascicoloInput>(_InsertTipoFascicoloInput_QNAME, InsertTipoFascicoloInput.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link DeleteCheckOutTitolarioOutput }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://schemas.datacontract.org/2004/07/Siav.Archiflow.Entities.Classification.ValueObject", name = "DeleteCheckOutTitolarioOutput")
    public JAXBElement<DeleteCheckOutTitolarioOutput> createDeleteCheckOutTitolarioOutput(DeleteCheckOutTitolarioOutput value) {
        return new JAXBElement<DeleteCheckOutTitolarioOutput>(_DeleteCheckOutTitolarioOutput_QNAME, DeleteCheckOutTitolarioOutput.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link DeleteTitolarioItemByTitolarioIdInput }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://schemas.datacontract.org/2004/07/Siav.Archiflow.Entities.Classification.ValueObject", name = "DeleteTitolarioItemByTitolarioIdInput")
    public JAXBElement<DeleteTitolarioItemByTitolarioIdInput> createDeleteTitolarioItemByTitolarioIdInput(DeleteTitolarioItemByTitolarioIdInput value) {
        return new JAXBElement<DeleteTitolarioItemByTitolarioIdInput>(_DeleteTitolarioItemByTitolarioIdInput_QNAME, DeleteTitolarioItemByTitolarioIdInput.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link InsertFascicoloNoteInput }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://schemas.datacontract.org/2004/07/Siav.Archiflow.Entities.Classification.ValueObject", name = "InsertFascicoloNoteInput")
    public JAXBElement<InsertFascicoloNoteInput> createInsertFascicoloNoteInput(InsertFascicoloNoteInput value) {
        return new JAXBElement<InsertFascicoloNoteInput>(_InsertFascicoloNoteInput_QNAME, InsertFascicoloNoteInput.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link Short }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://schemas.microsoft.com/2003/10/Serialization/", name = "unsignedByte")
    public JAXBElement<Short> createUnsignedByte(Short value) {
        return new JAXBElement<Short>(_UnsignedByte_QNAME, Short.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link ReadBaseTitolarioItemCollInput }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://schemas.datacontract.org/2004/07/Siav.Archiflow.Entities.Classification.ValueObject", name = "ReadBaseTitolarioItemCollInput")
    public JAXBElement<ReadBaseTitolarioItemCollInput> createReadBaseTitolarioItemCollInput(ReadBaseTitolarioItemCollInput value) {
        return new JAXBElement<ReadBaseTitolarioItemCollInput>(_ReadBaseTitolarioItemCollInput_QNAME, ReadBaseTitolarioItemCollInput.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link UpdateTipoFascicoloStatusInput }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://schemas.datacontract.org/2004/07/Siav.Archiflow.Entities.Classification.ValueObject", name = "UpdateTipoFascicoloStatusInput")
    public JAXBElement<UpdateTipoFascicoloStatusInput> createUpdateTipoFascicoloStatusInput(UpdateTipoFascicoloStatusInput value) {
        return new JAXBElement<UpdateTipoFascicoloStatusInput>(_UpdateTipoFascicoloStatusInput_QNAME, UpdateTipoFascicoloStatusInput.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link Integer }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://schemas.microsoft.com/2003/10/Serialization/", name = "int")
    public JAXBElement<Integer> createInt(Integer value) {
        return new JAXBElement<Integer>(_Int_QNAME, Integer.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link InsertValoreCampiTipoFascicoloInput }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://schemas.datacontract.org/2004/07/Siav.Archiflow.Entities.Classification.ValueObject", name = "InsertValoreCampiTipoFascicoloInput")
    public JAXBElement<InsertValoreCampiTipoFascicoloInput> createInsertValoreCampiTipoFascicoloInput(InsertValoreCampiTipoFascicoloInput value) {
        return new JAXBElement<InsertValoreCampiTipoFascicoloInput>(_InsertValoreCampiTipoFascicoloInput_QNAME, InsertValoreCampiTipoFascicoloInput.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link DeleteTipoFascicoloOutput }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://schemas.datacontract.org/2004/07/Siav.Archiflow.Entities.Classification.ValueObject", name = "DeleteTipoFascicoloOutput")
    public JAXBElement<DeleteTipoFascicoloOutput> createDeleteTipoFascicoloOutput(DeleteTipoFascicoloOutput value) {
        return new JAXBElement<DeleteTipoFascicoloOutput>(_DeleteTipoFascicoloOutput_QNAME, DeleteTipoFascicoloOutput.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link CampiTipoFascicolo }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://schemas.datacontract.org/2004/07/SIAV.Classification.Entities.TipoFascicolo.ValueObject", name = "CampiTipoFascicolo")
    public JAXBElement<CampiTipoFascicolo> createCampiTipoFascicolo(CampiTipoFascicolo value) {
        return new JAXBElement<CampiTipoFascicolo>(_CampiTipoFascicolo_QNAME, CampiTipoFascicolo.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link ArrayOfBaseOption }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://schemas.datacontract.org/2004/07/SIAV.Common.BaseClass.ValueObject", name = "ArrayOfBaseOption")
    public JAXBElement<ArrayOfBaseOption> createArrayOfBaseOption(ArrayOfBaseOption value) {
        return new JAXBElement<ArrayOfBaseOption>(_ArrayOfBaseOption_QNAME, ArrayOfBaseOption.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link ArrayOfTipoFascDiffValue }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://schemas.datacontract.org/2004/07/SIAV.Classification.Entities.TipoFascicolo.ValueObject", name = "ArrayOfTipoFascDiffValue")
    public JAXBElement<ArrayOfTipoFascDiffValue> createArrayOfTipoFascDiffValue(ArrayOfTipoFascDiffValue value) {
        return new JAXBElement<ArrayOfTipoFascDiffValue>(_ArrayOfTipoFascDiffValue_QNAME, ArrayOfTipoFascDiffValue.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link InsertOptionsOutput }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://schemas.datacontract.org/2004/07/Siav.Archiflow.Entities.Classification.ValueObject", name = "InsertOptionsOutput")
    public JAXBElement<InsertOptionsOutput> createInsertOptionsOutput(InsertOptionsOutput value) {
        return new JAXBElement<InsertOptionsOutput>(_InsertOptionsOutput_QNAME, InsertOptionsOutput.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link DeleteAllFascicoliDelInput }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://schemas.datacontract.org/2004/07/Siav.Archiflow.Entities.Classification.ValueObject", name = "DeleteAllFascicoliDelInput")
    public JAXBElement<DeleteAllFascicoliDelInput> createDeleteAllFascicoliDelInput(DeleteAllFascicoliDelInput value) {
        return new JAXBElement<DeleteAllFascicoliDelInput>(_DeleteAllFascicoliDelInput_QNAME, DeleteAllFascicoliDelInput.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link ReadDifformitaInput }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://schemas.datacontract.org/2004/07/Siav.Archiflow.Entities.Classification.ValueObject", name = "ReadDifformitaInput")
    public JAXBElement<ReadDifformitaInput> createReadDifformitaInput(ReadDifformitaInput value) {
        return new JAXBElement<ReadDifformitaInput>(_ReadDifformitaInput_QNAME, ReadDifformitaInput.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link BaseVisibilityDesc }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://schemas.datacontract.org/2004/07/SIAV.Common.BaseClass.ValueObject", name = "BaseVisibilityDesc")
    public JAXBElement<BaseVisibilityDesc> createBaseVisibilityDesc(BaseVisibilityDesc value) {
        return new JAXBElement<BaseVisibilityDesc>(_BaseVisibilityDesc_QNAME, BaseVisibilityDesc.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link PreservationStatus }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://schemas.datacontract.org/2004/07/SIAV.Archiflow.Types", name = "PreservationStatus")
    public JAXBElement<PreservationStatus> createPreservationStatus(PreservationStatus value) {
        return new JAXBElement<PreservationStatus>(_PreservationStatus_QNAME, PreservationStatus.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link UpdateTitolarioItemOutput }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://schemas.datacontract.org/2004/07/Siav.Archiflow.Entities.Classification.ValueObject", name = "UpdateTitolarioItemOutput")
    public JAXBElement<UpdateTitolarioItemOutput> createUpdateTitolarioItemOutput(UpdateTitolarioItemOutput value) {
        return new JAXBElement<UpdateTitolarioItemOutput>(_UpdateTitolarioItemOutput_QNAME, UpdateTitolarioItemOutput.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link SearchTitolarioItemsIdInput }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://schemas.datacontract.org/2004/07/Siav.Archiflow.Entities.Classification.ValueObject", name = "SearchTitolarioItemsIdInput")
    public JAXBElement<SearchTitolarioItemsIdInput> createSearchTitolarioItemsIdInput(SearchTitolarioItemsIdInput value) {
        return new JAXBElement<SearchTitolarioItemsIdInput>(_SearchTitolarioItemsIdInput_QNAME, SearchTitolarioItemsIdInput.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link InsertFascicoloNoteOutput }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://schemas.datacontract.org/2004/07/Siav.Archiflow.Entities.Classification.ValueObject", name = "InsertFascicoloNoteOutput")
    public JAXBElement<InsertFascicoloNoteOutput> createInsertFascicoloNoteOutput(InsertFascicoloNoteOutput value) {
        return new JAXBElement<InsertFascicoloNoteOutput>(_InsertFascicoloNoteOutput_QNAME, InsertFascicoloNoteOutput.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link IsCampoTipoFascicoloUsedInput }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://schemas.datacontract.org/2004/07/Siav.Archiflow.Entities.Classification.ValueObject", name = "IsCampoTipoFascicoloUsedInput")
    public JAXBElement<IsCampoTipoFascicoloUsedInput> createIsCampoTipoFascicoloUsedInput(IsCampoTipoFascicoloUsedInput value) {
        return new JAXBElement<IsCampoTipoFascicoloUsedInput>(_IsCampoTipoFascicoloUsedInput_QNAME, IsCampoTipoFascicoloUsedInput.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link TitolarioSearcher }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://schemas.datacontract.org/2004/07/SIAV.Classification.Entities.Titolario.Searcher", name = "TitolarioSearcher")
    public JAXBElement<TitolarioSearcher> createTitolarioSearcher(TitolarioSearcher value) {
        return new JAXBElement<TitolarioSearcher>(_TitolarioSearcher_QNAME, TitolarioSearcher.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link XMLGregorianCalendar }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://schemas.microsoft.com/2003/10/Serialization/", name = "dateTime")
    public JAXBElement<XMLGregorianCalendar> createDateTime(XMLGregorianCalendar value) {
        return new JAXBElement<XMLGregorianCalendar>(_DateTime_QNAME, XMLGregorianCalendar.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link ReadTipoFascicoloOutput }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://schemas.datacontract.org/2004/07/Siav.Archiflow.Entities.Classification.ValueObject", name = "ReadTipoFascicoloOutput")
    public JAXBElement<ReadTipoFascicoloOutput> createReadTipoFascicoloOutput(ReadTipoFascicoloOutput value) {
        return new JAXBElement<ReadTipoFascicoloOutput>(_ReadTipoFascicoloOutput_QNAME, ReadTipoFascicoloOutput.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link InsertTitolarioTemplateOutput }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://schemas.datacontract.org/2004/07/Siav.Archiflow.Entities.Classification.ValueObject", name = "InsertTitolarioTemplateOutput")
    public JAXBElement<InsertTitolarioTemplateOutput> createInsertTitolarioTemplateOutput(InsertTitolarioTemplateOutput value) {
        return new JAXBElement<InsertTitolarioTemplateOutput>(_InsertTitolarioTemplateOutput_QNAME, InsertTitolarioTemplateOutput.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link InsertClassificaDocCollInput }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://schemas.datacontract.org/2004/07/Siav.Archiflow.Entities.Classification.ValueObject", name = "InsertClassificaDocCollInput")
    public JAXBElement<InsertClassificaDocCollInput> createInsertClassificaDocCollInput(InsertClassificaDocCollInput value) {
        return new JAXBElement<InsertClassificaDocCollInput>(_InsertClassificaDocCollInput_QNAME, InsertClassificaDocCollInput.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link InsertTipoFascVisibilityOutput }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://schemas.datacontract.org/2004/07/Siav.Archiflow.Entities.Classification.ValueObject", name = "InsertTipoFascVisibilityOutput")
    public JAXBElement<InsertTipoFascVisibilityOutput> createInsertTipoFascVisibilityOutput(InsertTipoFascVisibilityOutput value) {
        return new JAXBElement<InsertTipoFascVisibilityOutput>(_InsertTipoFascVisibilityOutput_QNAME, InsertTipoFascVisibilityOutput.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link FascicoloSearcher }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://schemas.datacontract.org/2004/07/SIAV.Classification.Entities.Fascicoli.Searcher", name = "FascicoloSearcher")
    public JAXBElement<FascicoloSearcher> createFascicoloSearcher(FascicoloSearcher value) {
        return new JAXBElement<FascicoloSearcher>(_FascicoloSearcher_QNAME, FascicoloSearcher.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link IsTitolarioItemValidInput }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://schemas.datacontract.org/2004/07/Siav.Archiflow.Entities.Classification.ValueObject", name = "IsTitolarioItemValidInput")
    public JAXBElement<IsTitolarioItemValidInput> createIsTitolarioItemValidInput(IsTitolarioItemValidInput value) {
        return new JAXBElement<IsTitolarioItemValidInput>(_IsTitolarioItemValidInput_QNAME, IsTitolarioItemValidInput.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link UpdatePreservedFascicoloOutput }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://schemas.datacontract.org/2004/07/Siav.Archiflow.Entities.Classification.ValueObject", name = "UpdatePreservedFascicoloOutput")
    public JAXBElement<UpdatePreservedFascicoloOutput> createUpdatePreservedFascicoloOutput(UpdatePreservedFascicoloOutput value) {
        return new JAXBElement<UpdatePreservedFascicoloOutput>(_UpdatePreservedFascicoloOutput_QNAME, UpdatePreservedFascicoloOutput.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link TitolarioTemplateSearcher }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://schemas.datacontract.org/2004/07/SIAV.Classification.Entities.Titolario.Searcher", name = "TitolarioTemplateSearcher")
    public JAXBElement<TitolarioTemplateSearcher> createTitolarioTemplateSearcher(TitolarioTemplateSearcher value) {
        return new JAXBElement<TitolarioTemplateSearcher>(_TitolarioTemplateSearcher_QNAME, TitolarioTemplateSearcher.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link UpdateClassificaFascicoloInput }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://schemas.datacontract.org/2004/07/Siav.Archiflow.Entities.Classification.ValueObject", name = "UpdateClassificaFascicoloInput")
    public JAXBElement<UpdateClassificaFascicoloInput> createUpdateClassificaFascicoloInput(UpdateClassificaFascicoloInput value) {
        return new JAXBElement<UpdateClassificaFascicoloInput>(_UpdateClassificaFascicoloInput_QNAME, UpdateClassificaFascicoloInput.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link ClassificationExceptionDetail }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://schemas.datacontract.org/2004/07/SIAV.Classification.Entities.Common.ValueObject", name = "ClassificationExceptionDetail")
    public JAXBElement<ClassificationExceptionDetail> createClassificationExceptionDetail(ClassificationExceptionDetail value) {
        return new JAXBElement<ClassificationExceptionDetail>(_ClassificationExceptionDetail_QNAME, ClassificationExceptionDetail.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link ClassificaDocIdentifier }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://schemas.datacontract.org/2004/07/SIAV.Classification.Entities.Titolario.Identifier", name = "ClassificaDocIdentifier")
    public JAXBElement<ClassificaDocIdentifier> createClassificaDocIdentifier(ClassificaDocIdentifier value) {
        return new JAXBElement<ClassificaDocIdentifier>(_ClassificaDocIdentifier_QNAME, ClassificaDocIdentifier.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link CampiTipoFascicoloSearcher }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://schemas.datacontract.org/2004/07/SIAV.Classification.Entities.TipoFascicolo.Searcher", name = "CampiTipoFascicoloSearcher")
    public JAXBElement<CampiTipoFascicoloSearcher> createCampiTipoFascicoloSearcher(CampiTipoFascicoloSearcher value) {
        return new JAXBElement<CampiTipoFascicoloSearcher>(_CampiTipoFascicoloSearcher_QNAME, CampiTipoFascicoloSearcher.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link GetTitolarioItemCodeOutput }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://schemas.datacontract.org/2004/07/Siav.Archiflow.Entities.Classification.ValueObject", name = "GetTitolarioItemCodeOutput")
    public JAXBElement<GetTitolarioItemCodeOutput> createGetTitolarioItemCodeOutput(GetTitolarioItemCodeOutput value) {
        return new JAXBElement<GetTitolarioItemCodeOutput>(_GetTitolarioItemCodeOutput_QNAME, GetTitolarioItemCodeOutput.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link ReadBaseFascicoloOutput }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://schemas.datacontract.org/2004/07/Siav.Archiflow.Entities.Classification.ValueObject", name = "ReadBaseFascicoloOutput")
    public JAXBElement<ReadBaseFascicoloOutput> createReadBaseFascicoloOutput(ReadBaseFascicoloOutput value) {
        return new JAXBElement<ReadBaseFascicoloOutput>(_ReadBaseFascicoloOutput_QNAME, ReadBaseFascicoloOutput.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link ArchiflowExceptionSeverity }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://schemas.datacontract.org/2004/07/SIAV.Archiflow.Exceptions", name = "ArchiflowExceptionSeverity")
    public JAXBElement<ArchiflowExceptionSeverity> createArchiflowExceptionSeverity(ArchiflowExceptionSeverity value) {
        return new JAXBElement<ArchiflowExceptionSeverity>(_ArchiflowExceptionSeverity_QNAME, ArchiflowExceptionSeverity.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link ReadFascicoloVisibilityPrivacyOutput }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://schemas.datacontract.org/2004/07/Siav.Archiflow.Entities.Classification.ValueObject", name = "ReadFascicoloVisibilityPrivacyOutput")
    public JAXBElement<ReadFascicoloVisibilityPrivacyOutput> createReadFascicoloVisibilityPrivacyOutput(ReadFascicoloVisibilityPrivacyOutput value) {
        return new JAXBElement<ReadFascicoloVisibilityPrivacyOutput>(_ReadFascicoloVisibilityPrivacyOutput_QNAME, ReadFascicoloVisibilityPrivacyOutput.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link CheckOutInput }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://schemas.datacontract.org/2004/07/Siav.Archiflow.Entities.Classification.ValueObject", name = "CheckOutInput")
    public JAXBElement<CheckOutInput> createCheckOutInput(CheckOutInput value) {
        return new JAXBElement<CheckOutInput>(_CheckOutInput_QNAME, CheckOutInput.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link TipoFascDiffIdentifier }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://schemas.datacontract.org/2004/07/SIAV.Classification.Entities.TipoFascicolo.Identifier", name = "TipoFascDiffIdentifier")
    public JAXBElement<TipoFascDiffIdentifier> createTipoFascDiffIdentifier(TipoFascDiffIdentifier value) {
        return new JAXBElement<TipoFascDiffIdentifier>(_TipoFascDiffIdentifier_QNAME, TipoFascDiffIdentifier.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link SearchTitolarioItemsClassifyInput }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://schemas.datacontract.org/2004/07/Siav.Archiflow.Entities.Classification.ValueObject", name = "SearchTitolarioItemsClassifyInput")
    public JAXBElement<SearchTitolarioItemsClassifyInput> createSearchTitolarioItemsClassifyInput(SearchTitolarioItemsClassifyInput value) {
        return new JAXBElement<SearchTitolarioItemsClassifyInput>(_SearchTitolarioItemsClassifyInput_QNAME, SearchTitolarioItemsClassifyInput.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link ReadBaseFascicoloInput }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://schemas.datacontract.org/2004/07/Siav.Archiflow.Entities.Classification.ValueObject", name = "ReadBaseFascicoloInput")
    public JAXBElement<ReadBaseFascicoloInput> createReadBaseFascicoloInput(ReadBaseFascicoloInput value) {
        return new JAXBElement<ReadBaseFascicoloInput>(_ReadBaseFascicoloInput_QNAME, ReadBaseFascicoloInput.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link CopyTitolarioOutput }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://schemas.datacontract.org/2004/07/Siav.Archiflow.Entities.Classification.ValueObject", name = "CopyTitolarioOutput")
    public JAXBElement<CopyTitolarioOutput> createCopyTitolarioOutput(CopyTitolarioOutput value) {
        return new JAXBElement<CopyTitolarioOutput>(_CopyTitolarioOutput_QNAME, CopyTitolarioOutput.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link ClassificaDocumentoEntity }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://schemas.datacontract.org/2004/07/SIAV.Classification.Entities.Titolario.ValueObject", name = "ClassificaDocumentoEntity")
    public JAXBElement<ClassificaDocumentoEntity> createClassificaDocumentoEntity(ClassificaDocumentoEntity value) {
        return new JAXBElement<ClassificaDocumentoEntity>(_ClassificaDocumentoEntity_QNAME, ClassificaDocumentoEntity.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link RecoveryFascicoloInput }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://schemas.datacontract.org/2004/07/Siav.Archiflow.Entities.Classification.ValueObject", name = "RecoveryFascicoloInput")
    public JAXBElement<RecoveryFascicoloInput> createRecoveryFascicoloInput(RecoveryFascicoloInput value) {
        return new JAXBElement<RecoveryFascicoloInput>(_RecoveryFascicoloInput_QNAME, RecoveryFascicoloInput.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link NumerationType }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://schemas.datacontract.org/2004/07/SIAV.Archiflow.Types", name = "NumerationType")
    public JAXBElement<NumerationType> createNumerationType(NumerationType value) {
        return new JAXBElement<NumerationType>(_NumerationType_QNAME, NumerationType.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link InsertFascicoloVisibilityInput }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://schemas.datacontract.org/2004/07/Siav.Archiflow.Entities.Classification.ValueObject", name = "InsertFascicoloVisibilityInput")
    public JAXBElement<InsertFascicoloVisibilityInput> createInsertFascicoloVisibilityInput(InsertFascicoloVisibilityInput value) {
        return new JAXBElement<InsertFascicoloVisibilityInput>(_InsertFascicoloVisibilityInput_QNAME, InsertFascicoloVisibilityInput.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link BaseOption }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://schemas.datacontract.org/2004/07/SIAV.Common.BaseClass.ValueObject", name = "BaseOption")
    public JAXBElement<BaseOption> createBaseOption(BaseOption value) {
        return new JAXBElement<BaseOption>(_BaseOption_QNAME, BaseOption.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link SearchTitolarioItemsClassifyOutput }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://schemas.datacontract.org/2004/07/Siav.Archiflow.Entities.Classification.ValueObject", name = "SearchTitolarioItemsClassifyOutput")
    public JAXBElement<SearchTitolarioItemsClassifyOutput> createSearchTitolarioItemsClassifyOutput(SearchTitolarioItemsClassifyOutput value) {
        return new JAXBElement<SearchTitolarioItemsClassifyOutput>(_SearchTitolarioItemsClassifyOutput_QNAME, SearchTitolarioItemsClassifyOutput.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link BigDecimal }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://schemas.microsoft.com/2003/10/Serialization/", name = "decimal")
    public JAXBElement<BigDecimal> createDecimal(BigDecimal value) {
        return new JAXBElement<BigDecimal>(_Decimal_QNAME, BigDecimal.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://schemas.microsoft.com/2003/10/Serialization/", name = "guid")
    public JAXBElement<String> createGuid(String value) {
        return new JAXBElement<String>(_Guid_QNAME, String.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link ReadValoreCampiTipoFascicoloInput }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://schemas.datacontract.org/2004/07/Siav.Archiflow.Entities.Classification.ValueObject", name = "ReadValoreCampiTipoFascicoloInput")
    public JAXBElement<ReadValoreCampiTipoFascicoloInput> createReadValoreCampiTipoFascicoloInput(ReadValoreCampiTipoFascicoloInput value) {
        return new JAXBElement<ReadValoreCampiTipoFascicoloInput>(_ReadValoreCampiTipoFascicoloInput_QNAME, ReadValoreCampiTipoFascicoloInput.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link ArrayOfFascicoloHistory }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://schemas.datacontract.org/2004/07/SIAV.Classification.Entities.Fascicoli.ValueObject", name = "ArrayOfFascicoloHistory")
    public JAXBElement<ArrayOfFascicoloHistory> createArrayOfFascicoloHistory(ArrayOfFascicoloHistory value) {
        return new JAXBElement<ArrayOfFascicoloHistory>(_ArrayOfFascicoloHistory_QNAME, ArrayOfFascicoloHistory.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link Duration }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://schemas.microsoft.com/2003/10/Serialization/", name = "duration")
    public JAXBElement<Duration> createDuration(Duration value) {
        return new JAXBElement<Duration>(_Duration_QNAME, Duration.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link ArrayOfTitolarioItemEntity }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://schemas.datacontract.org/2004/07/SIAV.Classification.Entities.TitolarioItem.ValueObject", name = "ArrayOfTitolarioItemEntity")
    public JAXBElement<ArrayOfTitolarioItemEntity> createArrayOfTitolarioItemEntity(ArrayOfTitolarioItemEntity value) {
        return new JAXBElement<ArrayOfTitolarioItemEntity>(_ArrayOfTitolarioItemEntity_QNAME, ArrayOfTitolarioItemEntity.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link ReadFascicoloNotesInput }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://schemas.datacontract.org/2004/07/Siav.Archiflow.Entities.Classification.ValueObject", name = "ReadFascicoloNotesInput")
    public JAXBElement<ReadFascicoloNotesInput> createReadFascicoloNotesInput(ReadFascicoloNotesInput value) {
        return new JAXBElement<ReadFascicoloNotesInput>(_ReadFascicoloNotesInput_QNAME, ReadFascicoloNotesInput.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link BaseNote }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://schemas.datacontract.org/2004/07/SIAV.Common.BaseClass.ValueObject", name = "BaseNote")
    public JAXBElement<BaseNote> createBaseNote(BaseNote value) {
        return new JAXBElement<BaseNote>(_BaseNote_QNAME, BaseNote.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link ArrayOfKeyValueOfstringstring }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://schemas.microsoft.com/2003/10/Serialization/Arrays", name = "ArrayOfKeyValueOfstringstring")
    public JAXBElement<ArrayOfKeyValueOfstringstring> createArrayOfKeyValueOfstringstring(ArrayOfKeyValueOfstringstring value) {
        return new JAXBElement<ArrayOfKeyValueOfstringstring>(_ArrayOfKeyValueOfstringstring_QNAME, ArrayOfKeyValueOfstringstring.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link DeleteCheckOutTitolarioItemInput }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://schemas.datacontract.org/2004/07/Siav.Archiflow.Entities.Classification.ValueObject", name = "DeleteCheckOutTitolarioItemInput")
    public JAXBElement<DeleteCheckOutTitolarioItemInput> createDeleteCheckOutTitolarioItemInput(DeleteCheckOutTitolarioItemInput value) {
        return new JAXBElement<DeleteCheckOutTitolarioItemInput>(_DeleteCheckOutTitolarioItemInput_QNAME, DeleteCheckOutTitolarioItemInput.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link GetTitolarioItemSonsInput }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://schemas.datacontract.org/2004/07/Siav.Archiflow.Entities.Classification.ValueObject", name = "GetTitolarioItemSonsInput")
    public JAXBElement<GetTitolarioItemSonsInput> createGetTitolarioItemSonsInput(GetTitolarioItemSonsInput value) {
        return new JAXBElement<GetTitolarioItemSonsInput>(_GetTitolarioItemSonsInput_QNAME, GetTitolarioItemSonsInput.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://schemas.microsoft.com/2003/10/Serialization/", name = "anyURI")
    public JAXBElement<String> createAnyURI(String value) {
        return new JAXBElement<String>(_AnyURI_QNAME, String.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link CloseFascicoloInput }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://schemas.datacontract.org/2004/07/Siav.Archiflow.Entities.Classification.ValueObject", name = "CloseFascicoloInput")
    public JAXBElement<CloseFascicoloInput> createCloseFascicoloInput(CloseFascicoloInput value) {
        return new JAXBElement<CloseFascicoloInput>(_CloseFascicoloInput_QNAME, CloseFascicoloInput.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link BaseVisibility }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://schemas.datacontract.org/2004/07/SIAV.Common.BaseClass.ValueObject", name = "BaseVisibility")
    public JAXBElement<BaseVisibility> createBaseVisibility(BaseVisibility value) {
        return new JAXBElement<BaseVisibility>(_BaseVisibility_QNAME, BaseVisibility.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link TypeIdentifierComplete }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://schemas.datacontract.org/2004/07/SIAV.Common.BaseClass.ValueObject", name = "TypeIdentifierComplete")
    public JAXBElement<TypeIdentifierComplete> createTypeIdentifierComplete(TypeIdentifierComplete value) {
        return new JAXBElement<TypeIdentifierComplete>(_TypeIdentifierComplete_QNAME, TypeIdentifierComplete.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link TipoFascicoloEntity }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://schemas.datacontract.org/2004/07/SIAV.Classification.Entities.TipoFascicolo.ValueObject", name = "TipoFascicoloEntity")
    public JAXBElement<TipoFascicoloEntity> createTipoFascicoloEntity(TipoFascicoloEntity value) {
        return new JAXBElement<TipoFascicoloEntity>(_TipoFascicoloEntity_QNAME, TipoFascicoloEntity.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link ReadTipoFascVisibilityInput }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://schemas.datacontract.org/2004/07/Siav.Archiflow.Entities.Classification.ValueObject", name = "ReadTipoFascVisibilityInput")
    public JAXBElement<ReadTipoFascVisibilityInput> createReadTipoFascVisibilityInput(ReadTipoFascVisibilityInput value) {
        return new JAXBElement<ReadTipoFascVisibilityInput>(_ReadTipoFascVisibilityInput_QNAME, ReadTipoFascVisibilityInput.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link InsertFascicoloVisibilityOutput }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://schemas.datacontract.org/2004/07/Siav.Archiflow.Entities.Classification.ValueObject", name = "InsertFascicoloVisibilityOutput")
    public JAXBElement<InsertFascicoloVisibilityOutput> createInsertFascicoloVisibilityOutput(InsertFascicoloVisibilityOutput value) {
        return new JAXBElement<InsertFascicoloVisibilityOutput>(_InsertFascicoloVisibilityOutput_QNAME, InsertFascicoloVisibilityOutput.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link ClassificazioneBaseSearcher }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://schemas.datacontract.org/2004/07/SIAV.Classification.Entities.Common.BaseClass", name = "ClassificazioneBaseSearcher")
    public JAXBElement<ClassificazioneBaseSearcher> createClassificazioneBaseSearcher(ClassificazioneBaseSearcher value) {
        return new JAXBElement<ClassificazioneBaseSearcher>(_ClassificazioneBaseSearcher_QNAME, ClassificazioneBaseSearcher.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link InsertTitolarioItemInput }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://schemas.datacontract.org/2004/07/Siav.Archiflow.Entities.Classification.ValueObject", name = "InsertTitolarioItemInput")
    public JAXBElement<InsertTitolarioItemInput> createInsertTitolarioItemInput(InsertTitolarioItemInput value) {
        return new JAXBElement<InsertTitolarioItemInput>(_InsertTitolarioItemInput_QNAME, InsertTitolarioItemInput.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link UpdateValidToDateTitolarioInput }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://schemas.datacontract.org/2004/07/Siav.Archiflow.Entities.Classification.ValueObject", name = "UpdateValidToDateTitolarioInput")
    public JAXBElement<UpdateValidToDateTitolarioInput> createUpdateValidToDateTitolarioInput(UpdateValidToDateTitolarioInput value) {
        return new JAXBElement<UpdateValidToDateTitolarioInput>(_UpdateValidToDateTitolarioInput_QNAME, UpdateValidToDateTitolarioInput.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link CopyTipoFascicoloOutput }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://schemas.datacontract.org/2004/07/Siav.Archiflow.Entities.Classification.ValueObject", name = "CopyTipoFascicoloOutput")
    public JAXBElement<CopyTipoFascicoloOutput> createCopyTipoFascicoloOutput(CopyTipoFascicoloOutput value) {
        return new JAXBElement<CopyTipoFascicoloOutput>(_CopyTipoFascicoloOutput_QNAME, CopyTipoFascicoloOutput.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link Float }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://schemas.microsoft.com/2003/10/Serialization/", name = "float")
    public JAXBElement<Float> createFloat(Float value) {
        return new JAXBElement<Float>(_Float_QNAME, Float.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link GetClassificheValideInput }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://schemas.datacontract.org/2004/07/Siav.Archiflow.Entities.Classification.ValueObject", name = "GetClassificheValideInput")
    public JAXBElement<GetClassificheValideInput> createGetClassificheValideInput(GetClassificheValideInput value) {
        return new JAXBElement<GetClassificheValideInput>(_GetClassificheValideInput_QNAME, GetClassificheValideInput.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link IsTitolarioItemUsedInput }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://schemas.datacontract.org/2004/07/Siav.Archiflow.Entities.Classification.ValueObject", name = "IsTitolarioItemUsedInput")
    public JAXBElement<IsTitolarioItemUsedInput> createIsTitolarioItemUsedInput(IsTitolarioItemUsedInput value) {
        return new JAXBElement<IsTitolarioItemUsedInput>(_IsTitolarioItemUsedInput_QNAME, IsTitolarioItemUsedInput.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link ReadClassificaCodeCollInput }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://schemas.datacontract.org/2004/07/Siav.Archiflow.Entities.Classification.ValueObject", name = "ReadClassificaCodeCollInput")
    public JAXBElement<ReadClassificaCodeCollInput> createReadClassificaCodeCollInput(ReadClassificaCodeCollInput value) {
        return new JAXBElement<ReadClassificaCodeCollInput>(_ReadClassificaCodeCollInput_QNAME, ReadClassificaCodeCollInput.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link IsFascicoloInCurrentTitolarioInput }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://schemas.datacontract.org/2004/07/Siav.Archiflow.Entities.Classification.ValueObject", name = "IsFascicoloInCurrentTitolarioInput")
    public JAXBElement<IsFascicoloInCurrentTitolarioInput> createIsFascicoloInCurrentTitolarioInput(IsFascicoloInCurrentTitolarioInput value) {
        return new JAXBElement<IsFascicoloInCurrentTitolarioInput>(_IsFascicoloInCurrentTitolarioInput_QNAME, IsFascicoloInCurrentTitolarioInput.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link ReadClassificaDocumentoOutput }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://schemas.datacontract.org/2004/07/Siav.Archiflow.Entities.Classification.ValueObject", name = "ReadClassificaDocumentoOutput")
    public JAXBElement<ReadClassificaDocumentoOutput> createReadClassificaDocumentoOutput(ReadClassificaDocumentoOutput value) {
        return new JAXBElement<ReadClassificaDocumentoOutput>(_ReadClassificaDocumentoOutput_QNAME, ReadClassificaDocumentoOutput.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link ArrayOfCampiTipoFascicoloCfgValue }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://schemas.datacontract.org/2004/07/SIAV.Classification.Entities.TipoFascicolo.ValueObject", name = "ArrayOfCampiTipoFascicoloCfgValue")
    public JAXBElement<ArrayOfCampiTipoFascicoloCfgValue> createArrayOfCampiTipoFascicoloCfgValue(ArrayOfCampiTipoFascicoloCfgValue value) {
        return new JAXBElement<ArrayOfCampiTipoFascicoloCfgValue>(_ArrayOfCampiTipoFascicoloCfgValue_QNAME, ArrayOfCampiTipoFascicoloCfgValue.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link InsertMultiClassificaDocCollInput }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://schemas.datacontract.org/2004/07/Siav.Archiflow.Entities.Classification.ValueObject", name = "InsertMultiClassificaDocCollInput")
    public JAXBElement<InsertMultiClassificaDocCollInput> createInsertMultiClassificaDocCollInput(InsertMultiClassificaDocCollInput value) {
        return new JAXBElement<InsertMultiClassificaDocCollInput>(_InsertMultiClassificaDocCollInput_QNAME, InsertMultiClassificaDocCollInput.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link EntityQueryType }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://schemas.datacontract.org/2004/07/SIAV.Archiflow.Types", name = "EntityQueryType")
    public JAXBElement<EntityQueryType> createEntityQueryType(EntityQueryType value) {
        return new JAXBElement<EntityQueryType>(_EntityQueryType_QNAME, EntityQueryType.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link Boolean }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://schemas.microsoft.com/2003/10/Serialization/", name = "boolean")
    public JAXBElement<Boolean> createBoolean(Boolean value) {
        return new JAXBElement<Boolean>(_Boolean_QNAME, Boolean.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link ArrayOfEntityAccess }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://schemas.datacontract.org/2004/07/SIAV.Common.BaseClass.ValueObject", name = "ArrayOfEntityAccess")
    public JAXBElement<ArrayOfEntityAccess> createArrayOfEntityAccess(ArrayOfEntityAccess value) {
        return new JAXBElement<ArrayOfEntityAccess>(_ArrayOfEntityAccess_QNAME, ArrayOfEntityAccess.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link DeleteTitolarioTemplateInput }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://schemas.datacontract.org/2004/07/Siav.Archiflow.Entities.Classification.ValueObject", name = "DeleteTitolarioTemplateInput")
    public JAXBElement<DeleteTitolarioTemplateInput> createDeleteTitolarioTemplateInput(DeleteTitolarioTemplateInput value) {
        return new JAXBElement<DeleteTitolarioTemplateInput>(_DeleteTitolarioTemplateInput_QNAME, DeleteTitolarioTemplateInput.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link InsertTitolarioTemplateInput }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://schemas.datacontract.org/2004/07/Siav.Archiflow.Entities.Classification.ValueObject", name = "InsertTitolarioTemplateInput")
    public JAXBElement<InsertTitolarioTemplateInput> createInsertTitolarioTemplateInput(InsertTitolarioTemplateInput value) {
        return new JAXBElement<InsertTitolarioTemplateInput>(_InsertTitolarioTemplateInput_QNAME, InsertTitolarioTemplateInput.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link CustomDateTimeNullable }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://schemas.datacontract.org/2004/07/SIAV.Classification.Entities.Common.BaseClass", name = "CustomDateTimeNullable")
    public JAXBElement<CustomDateTimeNullable> createCustomDateTimeNullable(CustomDateTimeNullable value) {
        return new JAXBElement<CustomDateTimeNullable>(_CustomDateTimeNullable_QNAME, CustomDateTimeNullable.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link InsertCampiTipoFascicoloOutput }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://schemas.datacontract.org/2004/07/Siav.Archiflow.Entities.Classification.ValueObject", name = "InsertCampiTipoFascicoloOutput")
    public JAXBElement<InsertCampiTipoFascicoloOutput> createInsertCampiTipoFascicoloOutput(InsertCampiTipoFascicoloOutput value) {
        return new JAXBElement<InsertCampiTipoFascicoloOutput>(_InsertCampiTipoFascicoloOutput_QNAME, InsertCampiTipoFascicoloOutput.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link UpdateStatusTitolarioOutput }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://schemas.datacontract.org/2004/07/Siav.Archiflow.Entities.Classification.ValueObject", name = "UpdateStatusTitolarioOutput")
    public JAXBElement<UpdateStatusTitolarioOutput> createUpdateStatusTitolarioOutput(UpdateStatusTitolarioOutput value) {
        return new JAXBElement<UpdateStatusTitolarioOutput>(_UpdateStatusTitolarioOutput_QNAME, UpdateStatusTitolarioOutput.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link DeleteTitolarioInput }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://schemas.datacontract.org/2004/07/Siav.Archiflow.Entities.Classification.ValueObject", name = "DeleteTitolarioInput")
    public JAXBElement<DeleteTitolarioInput> createDeleteTitolarioInput(DeleteTitolarioInput value) {
        return new JAXBElement<DeleteTitolarioInput>(_DeleteTitolarioInput_QNAME, DeleteTitolarioInput.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link Object }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://schemas.microsoft.com/2003/10/Serialization/", name = "anyType")
    public JAXBElement<Object> createAnyType(Object value) {
        return new JAXBElement<Object>(_AnyType_QNAME, Object.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link ReadTitolarioItemCollSortedInput }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://schemas.datacontract.org/2004/07/Siav.Archiflow.Entities.Classification.ValueObject", name = "ReadTitolarioItemCollSortedInput")
    public JAXBElement<ReadTitolarioItemCollSortedInput> createReadTitolarioItemCollSortedInput(ReadTitolarioItemCollSortedInput value) {
        return new JAXBElement<ReadTitolarioItemCollSortedInput>(_ReadTitolarioItemCollSortedInput_QNAME, ReadTitolarioItemCollSortedInput.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link UpdateValidToDateTitolarioItemOutput }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://schemas.datacontract.org/2004/07/Siav.Archiflow.Entities.Classification.ValueObject", name = "UpdateValidToDateTitolarioItemOutput")
    public JAXBElement<UpdateValidToDateTitolarioItemOutput> createUpdateValidToDateTitolarioItemOutput(UpdateValidToDateTitolarioItemOutput value) {
        return new JAXBElement<UpdateValidToDateTitolarioItemOutput>(_UpdateValidToDateTitolarioItemOutput_QNAME, UpdateValidToDateTitolarioItemOutput.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link ReadLegislaturaOutput }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://schemas.datacontract.org/2004/07/Siav.Archiflow.Entities.Classification.ValueObject", name = "ReadLegislaturaOutput")
    public JAXBElement<ReadLegislaturaOutput> createReadLegislaturaOutput(ReadLegislaturaOutput value) {
        return new JAXBElement<ReadLegislaturaOutput>(_ReadLegislaturaOutput_QNAME, ReadLegislaturaOutput.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link SetPrimaryClassificaDocumentoInput }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://schemas.datacontract.org/2004/07/Siav.Archiflow.Entities.Classification.ValueObject", name = "SetPrimaryClassificaDocumentoInput")
    public JAXBElement<SetPrimaryClassificaDocumentoInput> createSetPrimaryClassificaDocumentoInput(SetPrimaryClassificaDocumentoInput value) {
        return new JAXBElement<SetPrimaryClassificaDocumentoInput>(_SetPrimaryClassificaDocumentoInput_QNAME, SetPrimaryClassificaDocumentoInput.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link ArrayOfFascicoloEntity }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://schemas.datacontract.org/2004/07/SIAV.Classification.Entities.Fascicoli.ValueObject", name = "ArrayOfFascicoloEntity")
    public JAXBElement<ArrayOfFascicoloEntity> createArrayOfFascicoloEntity(ArrayOfFascicoloEntity value) {
        return new JAXBElement<ArrayOfFascicoloEntity>(_ArrayOfFascicoloEntity_QNAME, ArrayOfFascicoloEntity.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link SendFascicoloInput }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://schemas.datacontract.org/2004/07/Siav.Archiflow.Entities.Classification.ValueObject", name = "SendFascicoloInput")
    public JAXBElement<SendFascicoloInput> createSendFascicoloInput(SendFascicoloInput value) {
        return new JAXBElement<SendFascicoloInput>(_SendFascicoloInput_QNAME, SendFascicoloInput.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link UpdateTitolarioTemplateInput }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://schemas.datacontract.org/2004/07/Siav.Archiflow.Entities.Classification.ValueObject", name = "UpdateTitolarioTemplateInput")
    public JAXBElement<UpdateTitolarioTemplateInput> createUpdateTitolarioTemplateInput(UpdateTitolarioTemplateInput value) {
        return new JAXBElement<UpdateTitolarioTemplateInput>(_UpdateTitolarioTemplateInput_QNAME, UpdateTitolarioTemplateInput.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link SearchFascicoloInput }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://schemas.datacontract.org/2004/07/Siav.Archiflow.Entities.Classification.ValueObject", name = "SearchFascicoloInput")
    public JAXBElement<SearchFascicoloInput> createSearchFascicoloInput(SearchFascicoloInput value) {
        return new JAXBElement<SearchFascicoloInput>(_SearchFascicoloInput_QNAME, SearchFascicoloInput.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link StatusType }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://schemas.datacontract.org/2004/07/SIAV.Archiflow.Types", name = "StatusType")
    public JAXBElement<StatusType> createStatusType(StatusType value) {
        return new JAXBElement<StatusType>(_StatusType_QNAME, StatusType.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link ReadDifformitaOutput }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://schemas.datacontract.org/2004/07/Siav.Archiflow.Entities.Classification.ValueObject", name = "ReadDifformitaOutput")
    public JAXBElement<ReadDifformitaOutput> createReadDifformitaOutput(ReadDifformitaOutput value) {
        return new JAXBElement<ReadDifformitaOutput>(_ReadDifformitaOutput_QNAME, ReadDifformitaOutput.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link UpdateTipoFascicoloStatusOutput }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://schemas.datacontract.org/2004/07/Siav.Archiflow.Entities.Classification.ValueObject", name = "UpdateTipoFascicoloStatusOutput")
    public JAXBElement<UpdateTipoFascicoloStatusOutput> createUpdateTipoFascicoloStatusOutput(UpdateTipoFascicoloStatusOutput value) {
        return new JAXBElement<UpdateTipoFascicoloStatusOutput>(_UpdateTipoFascicoloStatusOutput_QNAME, UpdateTipoFascicoloStatusOutput.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link ArrayOfint }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://schemas.microsoft.com/2003/10/Serialization/Arrays", name = "ArrayOfint")
    public JAXBElement<ArrayOfint> createArrayOfint(ArrayOfint value) {
        return new JAXBElement<ArrayOfint>(_ArrayOfint_QNAME, ArrayOfint.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link DeleteTitolarioTemplateOutput }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://schemas.datacontract.org/2004/07/Siav.Archiflow.Entities.Classification.ValueObject", name = "DeleteTitolarioTemplateOutput")
    public JAXBElement<DeleteTitolarioTemplateOutput> createDeleteTitolarioTemplateOutput(DeleteTitolarioTemplateOutput value) {
        return new JAXBElement<DeleteTitolarioTemplateOutput>(_DeleteTitolarioTemplateOutput_QNAME, DeleteTitolarioTemplateOutput.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link ArrayOfFascicoloPreservationStatus }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://schemas.datacontract.org/2004/07/SIAV.Classification.Entities.Fascicoli.ValueObject", name = "ArrayOfFascicoloPreservationStatus")
    public JAXBElement<ArrayOfFascicoloPreservationStatus> createArrayOfFascicoloPreservationStatus(ArrayOfFascicoloPreservationStatus value) {
        return new JAXBElement<ArrayOfFascicoloPreservationStatus>(_ArrayOfFascicoloPreservationStatus_QNAME, ArrayOfFascicoloPreservationStatus.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link ReadTitolarioItemOutput }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://schemas.datacontract.org/2004/07/Siav.Archiflow.Entities.Classification.ValueObject", name = "ReadTitolarioItemOutput")
    public JAXBElement<ReadTitolarioItemOutput> createReadTitolarioItemOutput(ReadTitolarioItemOutput value) {
        return new JAXBElement<ReadTitolarioItemOutput>(_ReadTitolarioItemOutput_QNAME, ReadTitolarioItemOutput.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link BaseTitolario }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://schemas.datacontract.org/2004/07/SIAV.Classification.Entities.Titolario.ValueObject", name = "BaseTitolario")
    public JAXBElement<BaseTitolario> createBaseTitolario(BaseTitolario value) {
        return new JAXBElement<BaseTitolario>(_BaseTitolario_QNAME, BaseTitolario.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link TitolarioEntity }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://schemas.datacontract.org/2004/07/SIAV.Classification.Entities.Titolario.ValueObject", name = "TitolarioEntity")
    public JAXBElement<TitolarioEntity> createTitolarioEntity(TitolarioEntity value) {
        return new JAXBElement<TitolarioEntity>(_TitolarioEntity_QNAME, TitolarioEntity.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link ReadCampiTipoFascicoloInput }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://schemas.datacontract.org/2004/07/Siav.Archiflow.Entities.Classification.ValueObject", name = "ReadCampiTipoFascicoloInput")
    public JAXBElement<ReadCampiTipoFascicoloInput> createReadCampiTipoFascicoloInput(ReadCampiTipoFascicoloInput value) {
        return new JAXBElement<ReadCampiTipoFascicoloInput>(_ReadCampiTipoFascicoloInput_QNAME, ReadCampiTipoFascicoloInput.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link CheckInInput }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://schemas.datacontract.org/2004/07/Siav.Archiflow.Entities.Classification.ValueObject", name = "CheckInInput")
    public JAXBElement<CheckInInput> createCheckInInput(CheckInInput value) {
        return new JAXBElement<CheckInInput>(_CheckInInput_QNAME, CheckInInput.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link UpdateFascicoloInput }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://schemas.datacontract.org/2004/07/Siav.Archiflow.Entities.Classification.ValueObject", name = "UpdateFascicoloInput")
    public JAXBElement<UpdateFascicoloInput> createUpdateFascicoloInput(UpdateFascicoloInput value) {
        return new JAXBElement<UpdateFascicoloInput>(_UpdateFascicoloInput_QNAME, UpdateFascicoloInput.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link ReadFascicoloHistoryInput }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://schemas.datacontract.org/2004/07/Siav.Archiflow.Entities.Classification.ValueObject", name = "ReadFascicoloHistoryInput")
    public JAXBElement<ReadFascicoloHistoryInput> createReadFascicoloHistoryInput(ReadFascicoloHistoryInput value) {
        return new JAXBElement<ReadFascicoloHistoryInput>(_ReadFascicoloHistoryInput_QNAME, ReadFascicoloHistoryInput.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link CampiTipoFascicoloIdentifier }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://schemas.datacontract.org/2004/07/SIAV.Classification.Entities.TipoFascicolo.Identifier", name = "CampiTipoFascicoloIdentifier")
    public JAXBElement<CampiTipoFascicoloIdentifier> createCampiTipoFascicoloIdentifier(CampiTipoFascicoloIdentifier value) {
        return new JAXBElement<CampiTipoFascicoloIdentifier>(_CampiTipoFascicoloIdentifier_QNAME, CampiTipoFascicoloIdentifier.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link IsTitolarioUsedOutput }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://schemas.datacontract.org/2004/07/Siav.Archiflow.Entities.Classification.ValueObject", name = "IsTitolarioUsedOutput")
    public JAXBElement<IsTitolarioUsedOutput> createIsTitolarioUsedOutput(IsTitolarioUsedOutput value) {
        return new JAXBElement<IsTitolarioUsedOutput>(_IsTitolarioUsedOutput_QNAME, IsTitolarioUsedOutput.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link ReadTitolarioInput }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://schemas.datacontract.org/2004/07/Siav.Archiflow.Entities.Classification.ValueObject", name = "ReadTitolarioInput")
    public JAXBElement<ReadTitolarioInput> createReadTitolarioInput(ReadTitolarioInput value) {
        return new JAXBElement<ReadTitolarioInput>(_ReadTitolarioInput_QNAME, ReadTitolarioInput.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link BaseTitolarioItem }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://schemas.datacontract.org/2004/07/SIAV.Classification.Entities.TitolarioItem.ValueObject", name = "BaseTitolarioItem")
    public JAXBElement<BaseTitolarioItem> createBaseTitolarioItem(BaseTitolarioItem value) {
        return new JAXBElement<BaseTitolarioItem>(_BaseTitolarioItem_QNAME, BaseTitolarioItem.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link FascicoloDocumentoSearcher }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://schemas.datacontract.org/2004/07/SIAV.Classification.Entities.Fascicoli.Searcher", name = "FascicoloDocumentoSearcher")
    public JAXBElement<FascicoloDocumentoSearcher> createFascicoloDocumentoSearcher(FascicoloDocumentoSearcher value) {
        return new JAXBElement<FascicoloDocumentoSearcher>(_FascicoloDocumentoSearcher_QNAME, FascicoloDocumentoSearcher.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link ReadCampiTipoFascicoloOutput }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://schemas.datacontract.org/2004/07/Siav.Archiflow.Entities.Classification.ValueObject", name = "ReadCampiTipoFascicoloOutput")
    public JAXBElement<ReadCampiTipoFascicoloOutput> createReadCampiTipoFascicoloOutput(ReadCampiTipoFascicoloOutput value) {
        return new JAXBElement<ReadCampiTipoFascicoloOutput>(_ReadCampiTipoFascicoloOutput_QNAME, ReadCampiTipoFascicoloOutput.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link ReadTipoDocDefaultTitolarioItemCollInput }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://schemas.datacontract.org/2004/07/Siav.Archiflow.Entities.Classification.ValueObject", name = "ReadTipoDocDefaultTitolarioItemCollInput")
    public JAXBElement<ReadTipoDocDefaultTitolarioItemCollInput> createReadTipoDocDefaultTitolarioItemCollInput(ReadTipoDocDefaultTitolarioItemCollInput value) {
        return new JAXBElement<ReadTipoDocDefaultTitolarioItemCollInput>(_ReadTipoDocDefaultTitolarioItemCollInput_QNAME, ReadTipoDocDefaultTitolarioItemCollInput.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link BaseClassificaDocumento }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://schemas.datacontract.org/2004/07/SIAV.Classification.Entities.Titolario.ValueObject", name = "BaseClassificaDocumento")
    public JAXBElement<BaseClassificaDocumento> createBaseClassificaDocumento(BaseClassificaDocumento value) {
        return new JAXBElement<BaseClassificaDocumento>(_BaseClassificaDocumento_QNAME, BaseClassificaDocumento.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link UpdateStatusHierarchyInput }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://schemas.datacontract.org/2004/07/Siav.Archiflow.Entities.Classification.ValueObject", name = "UpdateStatusHierarchyInput")
    public JAXBElement<UpdateStatusHierarchyInput> createUpdateStatusHierarchyInput(UpdateStatusHierarchyInput value) {
        return new JAXBElement<UpdateStatusHierarchyInput>(_UpdateStatusHierarchyInput_QNAME, UpdateStatusHierarchyInput.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link ReadLegislaturaInput }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://schemas.datacontract.org/2004/07/Siav.Archiflow.Entities.Classification.ValueObject", name = "ReadLegislaturaInput")
    public JAXBElement<ReadLegislaturaInput> createReadLegislaturaInput(ReadLegislaturaInput value) {
        return new JAXBElement<ReadLegislaturaInput>(_ReadLegislaturaInput_QNAME, ReadLegislaturaInput.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link FascicoloEntity }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://schemas.datacontract.org/2004/07/SIAV.Classification.Entities.Fascicoli.ValueObject", name = "FascicoloEntity")
    public JAXBElement<FascicoloEntity> createFascicoloEntity(FascicoloEntity value) {
        return new JAXBElement<FascicoloEntity>(_FascicoloEntity_QNAME, FascicoloEntity.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link ArrayOfTypeIdentifier }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://schemas.datacontract.org/2004/07/SIAV.Common.BaseClass.ValueObject", name = "ArrayOfTypeIdentifier")
    public JAXBElement<ArrayOfTypeIdentifier> createArrayOfTypeIdentifier(ArrayOfTypeIdentifier value) {
        return new JAXBElement<ArrayOfTypeIdentifier>(_ArrayOfTypeIdentifier_QNAME, ArrayOfTypeIdentifier.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link TitolarioItemSearcher }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://schemas.datacontract.org/2004/07/SIAV.Classification.Entities.TitolarioItem.Searcher", name = "TitolarioItemSearcher")
    public JAXBElement<TitolarioItemSearcher> createTitolarioItemSearcher(TitolarioItemSearcher value) {
        return new JAXBElement<TitolarioItemSearcher>(_TitolarioItemSearcher_QNAME, TitolarioItemSearcher.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link ReadTitolarioTemplateOutput }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://schemas.datacontract.org/2004/07/Siav.Archiflow.Entities.Classification.ValueObject", name = "ReadTitolarioTemplateOutput")
    public JAXBElement<ReadTitolarioTemplateOutput> createReadTitolarioTemplateOutput(ReadTitolarioTemplateOutput value) {
        return new JAXBElement<ReadTitolarioTemplateOutput>(_ReadTitolarioTemplateOutput_QNAME, ReadTitolarioTemplateOutput.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link FieldTypeDefinition }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://schemas.datacontract.org/2004/07/SIAV.Archiflow.Types", name = "FieldTypeDefinition")
    public JAXBElement<FieldTypeDefinition> createFieldTypeDefinition(FieldTypeDefinition value) {
        return new JAXBElement<FieldTypeDefinition>(_FieldTypeDefinition_QNAME, FieldTypeDefinition.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link ReadEntityType }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://schemas.datacontract.org/2004/07/SIAV.Archiflow.Types", name = "ReadEntityType")
    public JAXBElement<ReadEntityType> createReadEntityType(ReadEntityType value) {
        return new JAXBElement<ReadEntityType>(_ReadEntityType_QNAME, ReadEntityType.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link ReadBaseTitolarioOutput }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://schemas.datacontract.org/2004/07/Siav.Archiflow.Entities.Classification.ValueObject", name = "ReadBaseTitolarioOutput")
    public JAXBElement<ReadBaseTitolarioOutput> createReadBaseTitolarioOutput(ReadBaseTitolarioOutput value) {
        return new JAXBElement<ReadBaseTitolarioOutput>(_ReadBaseTitolarioOutput_QNAME, ReadBaseTitolarioOutput.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link IsTitolarioItemValidOutput }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://schemas.datacontract.org/2004/07/Siav.Archiflow.Entities.Classification.ValueObject", name = "IsTitolarioItemValidOutput")
    public JAXBElement<IsTitolarioItemValidOutput> createIsTitolarioItemValidOutput(IsTitolarioItemValidOutput value) {
        return new JAXBElement<IsTitolarioItemValidOutput>(_IsTitolarioItemValidOutput_QNAME, IsTitolarioItemValidOutput.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link DeleteAllFascicoliDelOutput }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://schemas.datacontract.org/2004/07/Siav.Archiflow.Entities.Classification.ValueObject", name = "DeleteAllFascicoliDelOutput")
    public JAXBElement<DeleteAllFascicoliDelOutput> createDeleteAllFascicoliDelOutput(DeleteAllFascicoliDelOutput value) {
        return new JAXBElement<DeleteAllFascicoliDelOutput>(_DeleteAllFascicoliDelOutput_QNAME, DeleteAllFascicoliDelOutput.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link Legislatura }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://schemas.datacontract.org/2004/07/SIAV.Classification.Entities.Fascicoli.ValueObject", name = "Legislatura")
    public JAXBElement<Legislatura> createLegislatura(Legislatura value) {
        return new JAXBElement<Legislatura>(_Legislatura_QNAME, Legislatura.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link TitolarioTemplateIdentifier }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://schemas.datacontract.org/2004/07/SIAV.Classification.Entities.Titolario.Identifier", name = "TitolarioTemplateIdentifier")
    public JAXBElement<TitolarioTemplateIdentifier> createTitolarioTemplateIdentifier(TitolarioTemplateIdentifier value) {
        return new JAXBElement<TitolarioTemplateIdentifier>(_TitolarioTemplateIdentifier_QNAME, TitolarioTemplateIdentifier.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link ReadTitolarioItemCollSortedOutput }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://schemas.datacontract.org/2004/07/Siav.Archiflow.Entities.Classification.ValueObject", name = "ReadTitolarioItemCollSortedOutput")
    public JAXBElement<ReadTitolarioItemCollSortedOutput> createReadTitolarioItemCollSortedOutput(ReadTitolarioItemCollSortedOutput value) {
        return new JAXBElement<ReadTitolarioItemCollSortedOutput>(_ReadTitolarioItemCollSortedOutput_QNAME, ReadTitolarioItemCollSortedOutput.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link CheckOutOutput }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://schemas.datacontract.org/2004/07/Siav.Archiflow.Entities.Classification.ValueObject", name = "CheckOutOutput")
    public JAXBElement<CheckOutOutput> createCheckOutOutput(CheckOutOutput value) {
        return new JAXBElement<CheckOutOutput>(_CheckOutOutput_QNAME, CheckOutOutput.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link InsertClassificaFascicoloInput }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://schemas.datacontract.org/2004/07/Siav.Archiflow.Entities.Classification.ValueObject", name = "InsertClassificaFascicoloInput")
    public JAXBElement<InsertClassificaFascicoloInput> createInsertClassificaFascicoloInput(InsertClassificaFascicoloInput value) {
        return new JAXBElement<InsertClassificaFascicoloInput>(_InsertClassificaFascicoloInput_QNAME, InsertClassificaFascicoloInput.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link SearchFascicoloOutput }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://schemas.datacontract.org/2004/07/Siav.Archiflow.Entities.Classification.ValueObject", name = "SearchFascicoloOutput")
    public JAXBElement<SearchFascicoloOutput> createSearchFascicoloOutput(SearchFascicoloOutput value) {
        return new JAXBElement<SearchFascicoloOutput>(_SearchFascicoloOutput_QNAME, SearchFascicoloOutput.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link IsTitolarioUsedInput }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://schemas.datacontract.org/2004/07/Siav.Archiflow.Entities.Classification.ValueObject", name = "IsTitolarioUsedInput")
    public JAXBElement<IsTitolarioUsedInput> createIsTitolarioUsedInput(IsTitolarioUsedInput value) {
        return new JAXBElement<IsTitolarioUsedInput>(_IsTitolarioUsedInput_QNAME, IsTitolarioUsedInput.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link UpdateLegislaturaInput }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://schemas.datacontract.org/2004/07/Siav.Archiflow.Entities.Classification.ValueObject", name = "UpdateLegislaturaInput")
    public JAXBElement<UpdateLegislaturaInput> createUpdateLegislaturaInput(UpdateLegislaturaInput value) {
        return new JAXBElement<UpdateLegislaturaInput>(_UpdateLegislaturaInput_QNAME, UpdateLegislaturaInput.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link ReadOptionsOutput }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://schemas.datacontract.org/2004/07/Siav.Archiflow.Entities.Classification.ValueObject", name = "ReadOptionsOutput")
    public JAXBElement<ReadOptionsOutput> createReadOptionsOutput(ReadOptionsOutput value) {
        return new JAXBElement<ReadOptionsOutput>(_ReadOptionsOutput_QNAME, ReadOptionsOutput.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link FascicoloHistory }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://schemas.datacontract.org/2004/07/SIAV.Classification.Entities.Fascicoli.ValueObject", name = "FascicoloHistory")
    public JAXBElement<FascicoloHistory> createFascicoloHistory(FascicoloHistory value) {
        return new JAXBElement<FascicoloHistory>(_FascicoloHistory_QNAME, FascicoloHistory.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link FieldDefinition }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://schemas.datacontract.org/2004/07/SIAV.Archiflow.Types", name = "FieldDefinition")
    public JAXBElement<FieldDefinition> createFieldDefinition(FieldDefinition value) {
        return new JAXBElement<FieldDefinition>(_FieldDefinition_QNAME, FieldDefinition.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link OpenFascicoloInput }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://schemas.datacontract.org/2004/07/Siav.Archiflow.Entities.Classification.ValueObject", name = "OpenFascicoloInput")
    public JAXBElement<OpenFascicoloInput> createOpenFascicoloInput(OpenFascicoloInput value) {
        return new JAXBElement<OpenFascicoloInput>(_OpenFascicoloInput_QNAME, OpenFascicoloInput.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link IsFascicoloUsedOutput }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://schemas.datacontract.org/2004/07/Siav.Archiflow.Entities.Classification.ValueObject", name = "IsFascicoloUsedOutput")
    public JAXBElement<IsFascicoloUsedOutput> createIsFascicoloUsedOutput(IsFascicoloUsedOutput value) {
        return new JAXBElement<IsFascicoloUsedOutput>(_IsFascicoloUsedOutput_QNAME, IsFascicoloUsedOutput.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link UpdateClassificaFascicoloOutput }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://schemas.datacontract.org/2004/07/Siav.Archiflow.Entities.Classification.ValueObject", name = "UpdateClassificaFascicoloOutput")
    public JAXBElement<UpdateClassificaFascicoloOutput> createUpdateClassificaFascicoloOutput(UpdateClassificaFascicoloOutput value) {
        return new JAXBElement<UpdateClassificaFascicoloOutput>(_UpdateClassificaFascicoloOutput_QNAME, UpdateClassificaFascicoloOutput.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://schemas.microsoft.com/2003/10/Serialization/", name = "string")
    public JAXBElement<String> createString(String value) {
        return new JAXBElement<String>(_String_QNAME, String.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link InsertTitolarioOutput }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://schemas.datacontract.org/2004/07/Siav.Archiflow.Entities.Classification.ValueObject", name = "InsertTitolarioOutput")
    public JAXBElement<InsertTitolarioOutput> createInsertTitolarioOutput(InsertTitolarioOutput value) {
        return new JAXBElement<InsertTitolarioOutput>(_InsertTitolarioOutput_QNAME, InsertTitolarioOutput.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link CheckOutTitolarioItemOutput }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://schemas.datacontract.org/2004/07/Siav.Archiflow.Entities.Classification.ValueObject", name = "CheckOutTitolarioItemOutput")
    public JAXBElement<CheckOutTitolarioItemOutput> createCheckOutTitolarioItemOutput(CheckOutTitolarioItemOutput value) {
        return new JAXBElement<CheckOutTitolarioItemOutput>(_CheckOutTitolarioItemOutput_QNAME, CheckOutTitolarioItemOutput.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link ReadTipoFascicoloInput }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://schemas.datacontract.org/2004/07/Siav.Archiflow.Entities.Classification.ValueObject", name = "ReadTipoFascicoloInput")
    public JAXBElement<ReadTipoFascicoloInput> createReadTipoFascicoloInput(ReadTipoFascicoloInput value) {
        return new JAXBElement<ReadTipoFascicoloInput>(_ReadTipoFascicoloInput_QNAME, ReadTipoFascicoloInput.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link DiffTypes }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://schemas.datacontract.org/2004/07/SIAV.Archiflow.Types", name = "DiffTypes")
    public JAXBElement<DiffTypes> createDiffTypes(DiffTypes value) {
        return new JAXBElement<DiffTypes>(_DiffTypes_QNAME, DiffTypes.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link BaseOutput }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://schemas.datacontract.org/2004/07/SIAV.Archiflow.Entities", name = "BaseOutput")
    public JAXBElement<BaseOutput> createBaseOutput(BaseOutput value) {
        return new JAXBElement<BaseOutput>(_BaseOutput_QNAME, BaseOutput.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link BaseVisibilityPrivacy }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://schemas.datacontract.org/2004/07/SIAV.Common.BaseClass.ValueObject", name = "BaseVisibilityPrivacy")
    public JAXBElement<BaseVisibilityPrivacy> createBaseVisibilityPrivacy(BaseVisibilityPrivacy value) {
        return new JAXBElement<BaseVisibilityPrivacy>(_BaseVisibilityPrivacy_QNAME, BaseVisibilityPrivacy.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link DeleteTipoFascicoloInput }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://schemas.datacontract.org/2004/07/Siav.Archiflow.Entities.Classification.ValueObject", name = "DeleteTipoFascicoloInput")
    public JAXBElement<DeleteTipoFascicoloInput> createDeleteTipoFascicoloInput(DeleteTipoFascicoloInput value) {
        return new JAXBElement<DeleteTipoFascicoloInput>(_DeleteTipoFascicoloInput_QNAME, DeleteTipoFascicoloInput.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link ReadFascicoloHierarchyOutput }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://schemas.datacontract.org/2004/07/Siav.Archiflow.Entities.Classification.ValueObject", name = "ReadFascicoloHierarchyOutput")
    public JAXBElement<ReadFascicoloHierarchyOutput> createReadFascicoloHierarchyOutput(ReadFascicoloHierarchyOutput value) {
        return new JAXBElement<ReadFascicoloHierarchyOutput>(_ReadFascicoloHierarchyOutput_QNAME, ReadFascicoloHierarchyOutput.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link ReadFascicoloHistoryOutput }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://schemas.datacontract.org/2004/07/Siav.Archiflow.Entities.Classification.ValueObject", name = "ReadFascicoloHistoryOutput")
    public JAXBElement<ReadFascicoloHistoryOutput> createReadFascicoloHistoryOutput(ReadFascicoloHistoryOutput value) {
        return new JAXBElement<ReadFascicoloHistoryOutput>(_ReadFascicoloHistoryOutput_QNAME, ReadFascicoloHistoryOutput.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link IsFascicoloUsedInput }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://schemas.datacontract.org/2004/07/Siav.Archiflow.Entities.Classification.ValueObject", name = "IsFascicoloUsedInput")
    public JAXBElement<IsFascicoloUsedInput> createIsFascicoloUsedInput(IsFascicoloUsedInput value) {
        return new JAXBElement<IsFascicoloUsedInput>(_IsFascicoloUsedInput_QNAME, IsFascicoloUsedInput.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link ReadClassificaCodeCollOutput }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://schemas.datacontract.org/2004/07/Siav.Archiflow.Entities.Classification.ValueObject", name = "ReadClassificaCodeCollOutput")
    public JAXBElement<ReadClassificaCodeCollOutput> createReadClassificaCodeCollOutput(ReadClassificaCodeCollOutput value) {
        return new JAXBElement<ReadClassificaCodeCollOutput>(_ReadClassificaCodeCollOutput_QNAME, ReadClassificaCodeCollOutput.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link BaseFascicolo }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://schemas.datacontract.org/2004/07/SIAV.Classification.Entities.Fascicoli.ValueObject", name = "BaseFascicolo")
    public JAXBElement<BaseFascicolo> createBaseFascicolo(BaseFascicolo value) {
        return new JAXBElement<BaseFascicolo>(_BaseFascicolo_QNAME, BaseFascicolo.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link ReadOptionsInput }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://schemas.datacontract.org/2004/07/Siav.Archiflow.Entities.Classification.ValueObject", name = "ReadOptionsInput")
    public JAXBElement<ReadOptionsInput> createReadOptionsInput(ReadOptionsInput value) {
        return new JAXBElement<ReadOptionsInput>(_ReadOptionsInput_QNAME, ReadOptionsInput.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link BaseSearcher }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://schemas.datacontract.org/2004/07/SIAV.Common.BaseClass.ValueObject", name = "BaseSearcher")
    public JAXBElement<BaseSearcher> createBaseSearcher(BaseSearcher value) {
        return new JAXBElement<BaseSearcher>(_BaseSearcher_QNAME, BaseSearcher.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link ReadTipoDocDefaultTitolarioItemCollOutput }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://schemas.datacontract.org/2004/07/Siav.Archiflow.Entities.Classification.ValueObject", name = "ReadTipoDocDefaultTitolarioItemCollOutput")
    public JAXBElement<ReadTipoDocDefaultTitolarioItemCollOutput> createReadTipoDocDefaultTitolarioItemCollOutput(ReadTipoDocDefaultTitolarioItemCollOutput value) {
        return new JAXBElement<ReadTipoDocDefaultTitolarioItemCollOutput>(_ReadTipoDocDefaultTitolarioItemCollOutput_QNAME, ReadTipoDocDefaultTitolarioItemCollOutput.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link InsertClassificaDocumentoInput }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://schemas.datacontract.org/2004/07/Siav.Archiflow.Entities.Classification.ValueObject", name = "InsertClassificaDocumentoInput")
    public JAXBElement<InsertClassificaDocumentoInput> createInsertClassificaDocumentoInput(InsertClassificaDocumentoInput value) {
        return new JAXBElement<InsertClassificaDocumentoInput>(_InsertClassificaDocumentoInput_QNAME, InsertClassificaDocumentoInput.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link InsertLegislaturaOutput }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://schemas.datacontract.org/2004/07/Siav.Archiflow.Entities.Classification.ValueObject", name = "InsertLegislaturaOutput")
    public JAXBElement<InsertLegislaturaOutput> createInsertLegislaturaOutput(InsertLegislaturaOutput value) {
        return new JAXBElement<InsertLegislaturaOutput>(_InsertLegislaturaOutput_QNAME, InsertLegislaturaOutput.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link UserLoginType }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://schemas.datacontract.org/2004/07/SIAV.Archiflow.Entities.Types", name = "UserLoginType")
    public JAXBElement<UserLoginType> createUserLoginType(UserLoginType value) {
        return new JAXBElement<UserLoginType>(_UserLoginType_QNAME, UserLoginType.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link CustomNullableOfdateTime }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://schemas.datacontract.org/2004/07/SIAV.Classification.Entities.Common.BaseClass", name = "CustomNullableOfdateTime")
    public JAXBElement<CustomNullableOfdateTime> createCustomNullableOfdateTime(CustomNullableOfdateTime value) {
        return new JAXBElement<CustomNullableOfdateTime>(_CustomNullableOfdateTime_QNAME, CustomNullableOfdateTime.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link ReadFascicoloOutput }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://schemas.datacontract.org/2004/07/Siav.Archiflow.Entities.Classification.ValueObject", name = "ReadFascicoloOutput")
    public JAXBElement<ReadFascicoloOutput> createReadFascicoloOutput(ReadFascicoloOutput value) {
        return new JAXBElement<ReadFascicoloOutput>(_ReadFascicoloOutput_QNAME, ReadFascicoloOutput.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link Long }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://schemas.microsoft.com/2003/10/Serialization/", name = "long")
    public JAXBElement<Long> createLong(Long value) {
        return new JAXBElement<Long>(_Long_QNAME, Long.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link DeleteCampiTipoFascicoloValueInput }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://schemas.datacontract.org/2004/07/Siav.Archiflow.Entities.Classification.ValueObject", name = "DeleteCampiTipoFascicoloValueInput")
    public JAXBElement<DeleteCampiTipoFascicoloValueInput> createDeleteCampiTipoFascicoloValueInput(DeleteCampiTipoFascicoloValueInput value) {
        return new JAXBElement<DeleteCampiTipoFascicoloValueInput>(_DeleteCampiTipoFascicoloValueInput_QNAME, DeleteCampiTipoFascicoloValueInput.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link ArrayOfDocumentIdentifier }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://schemas.datacontract.org/2004/07/SIAV.Classification.Entities.Common.Identifier", name = "ArrayOfDocumentIdentifier")
    public JAXBElement<ArrayOfDocumentIdentifier> createArrayOfDocumentIdentifier(ArrayOfDocumentIdentifier value) {
        return new JAXBElement<ArrayOfDocumentIdentifier>(_ArrayOfDocumentIdentifier_QNAME, ArrayOfDocumentIdentifier.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link BaseInput }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://schemas.datacontract.org/2004/07/SIAV.Archiflow.Entities", name = "BaseInput")
    public JAXBElement<BaseInput> createBaseInput(BaseInput value) {
        return new JAXBElement<BaseInput>(_BaseInput_QNAME, BaseInput.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link InsertTipoFascicoloOutput }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://schemas.datacontract.org/2004/07/Siav.Archiflow.Entities.Classification.ValueObject", name = "InsertTipoFascicoloOutput")
    public JAXBElement<InsertTipoFascicoloOutput> createInsertTipoFascicoloOutput(InsertTipoFascicoloOutput value) {
        return new JAXBElement<InsertTipoFascicoloOutput>(_InsertTipoFascicoloOutput_QNAME, InsertTipoFascicoloOutput.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link DateIdentifier }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://schemas.datacontract.org/2004/07/SIAV.Common.BaseClass.ValueObject", name = "DateIdentifier")
    public JAXBElement<DateIdentifier> createDateIdentifier(DateIdentifier value) {
        return new JAXBElement<DateIdentifier>(_DateIdentifier_QNAME, DateIdentifier.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link ReadTitolarioTemplateInput }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://schemas.datacontract.org/2004/07/Siav.Archiflow.Entities.Classification.ValueObject", name = "ReadTitolarioTemplateInput")
    public JAXBElement<ReadTitolarioTemplateInput> createReadTitolarioTemplateInput(ReadTitolarioTemplateInput value) {
        return new JAXBElement<ReadTitolarioTemplateInput>(_ReadTitolarioTemplateInput_QNAME, ReadTitolarioTemplateInput.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link ArrayOfClassificaDocumentoEntity }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://schemas.datacontract.org/2004/07/SIAV.Classification.Entities.Titolario.ValueObject", name = "ArrayOfClassificaDocumentoEntity")
    public JAXBElement<ArrayOfClassificaDocumentoEntity> createArrayOfClassificaDocumentoEntity(ArrayOfClassificaDocumentoEntity value) {
        return new JAXBElement<ArrayOfClassificaDocumentoEntity>(_ArrayOfClassificaDocumentoEntity_QNAME, ArrayOfClassificaDocumentoEntity.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link UpdateCampiTipoFascicoloInput }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://schemas.datacontract.org/2004/07/Siav.Archiflow.Entities.Classification.ValueObject", name = "UpdateCampiTipoFascicoloInput")
    public JAXBElement<UpdateCampiTipoFascicoloInput> createUpdateCampiTipoFascicoloInput(UpdateCampiTipoFascicoloInput value) {
        return new JAXBElement<UpdateCampiTipoFascicoloInput>(_UpdateCampiTipoFascicoloInput_QNAME, UpdateCampiTipoFascicoloInput.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link SearchTitolarioItemsIdOutput }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://schemas.datacontract.org/2004/07/Siav.Archiflow.Entities.Classification.ValueObject", name = "SearchTitolarioItemsIdOutput")
    public JAXBElement<SearchTitolarioItemsIdOutput> createSearchTitolarioItemsIdOutput(SearchTitolarioItemsIdOutput value) {
        return new JAXBElement<SearchTitolarioItemsIdOutput>(_SearchTitolarioItemsIdOutput_QNAME, SearchTitolarioItemsIdOutput.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link FascicoloDocIdentifier }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://schemas.datacontract.org/2004/07/SIAV.Classification.Entities.Fascicolo.Identifier", name = "FascicoloDocIdentifier")
    public JAXBElement<FascicoloDocIdentifier> createFascicoloDocIdentifier(FascicoloDocIdentifier value) {
        return new JAXBElement<FascicoloDocIdentifier>(_FascicoloDocIdentifier_QNAME, FascicoloDocIdentifier.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link UpdatePreservedFascicoloInput }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://schemas.datacontract.org/2004/07/Siav.Archiflow.Entities.Classification.ValueObject", name = "UpdatePreservedFascicoloInput")
    public JAXBElement<UpdatePreservedFascicoloInput> createUpdatePreservedFascicoloInput(UpdatePreservedFascicoloInput value) {
        return new JAXBElement<UpdatePreservedFascicoloInput>(_UpdatePreservedFascicoloInput_QNAME, UpdatePreservedFascicoloInput.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link SetPrimaryFascicoloDocumentoOutput }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://schemas.datacontract.org/2004/07/Siav.Archiflow.Entities.Classification.ValueObject", name = "SetPrimaryFascicoloDocumentoOutput")
    public JAXBElement<SetPrimaryFascicoloDocumentoOutput> createSetPrimaryFascicoloDocumentoOutput(SetPrimaryFascicoloDocumentoOutput value) {
        return new JAXBElement<SetPrimaryFascicoloDocumentoOutput>(_SetPrimaryFascicoloDocumentoOutput_QNAME, SetPrimaryFascicoloDocumentoOutput.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link ReadTitolarioItemBaseOutput }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://schemas.datacontract.org/2004/07/Siav.Archiflow.Entities.Classification.ValueObject", name = "ReadTitolarioItemBaseOutput")
    public JAXBElement<ReadTitolarioItemBaseOutput> createReadTitolarioItemBaseOutput(ReadTitolarioItemBaseOutput value) {
        return new JAXBElement<ReadTitolarioItemBaseOutput>(_ReadTitolarioItemBaseOutput_QNAME, ReadTitolarioItemBaseOutput.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link UpdateLegislaturaOutput }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://schemas.datacontract.org/2004/07/Siav.Archiflow.Entities.Classification.ValueObject", name = "UpdateLegislaturaOutput")
    public JAXBElement<UpdateLegislaturaOutput> createUpdateLegislaturaOutput(UpdateLegislaturaOutput value) {
        return new JAXBElement<UpdateLegislaturaOutput>(_UpdateLegislaturaOutput_QNAME, UpdateLegislaturaOutput.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link GetTitolarioSonsInput }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://schemas.datacontract.org/2004/07/Siav.Archiflow.Entities.Classification.ValueObject", name = "GetTitolarioSonsInput")
    public JAXBElement<GetTitolarioSonsInput> createGetTitolarioSonsInput(GetTitolarioSonsInput value) {
        return new JAXBElement<GetTitolarioSonsInput>(_GetTitolarioSonsInput_QNAME, GetTitolarioSonsInput.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link ClassificaDocumentoSearcher }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://schemas.datacontract.org/2004/07/SIAV.Classification.Entities.Titolario.Searcher", name = "ClassificaDocumentoSearcher")
    public JAXBElement<ClassificaDocumentoSearcher> createClassificaDocumentoSearcher(ClassificaDocumentoSearcher value) {
        return new JAXBElement<ClassificaDocumentoSearcher>(_ClassificaDocumentoSearcher_QNAME, ClassificaDocumentoSearcher.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link ArrayOfLegislatura }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://schemas.datacontract.org/2004/07/SIAV.Classification.Entities.Fascicoli.ValueObject", name = "ArrayOfLegislatura")
    public JAXBElement<ArrayOfLegislatura> createArrayOfLegislatura(ArrayOfLegislatura value) {
        return new JAXBElement<ArrayOfLegislatura>(_ArrayOfLegislatura_QNAME, ArrayOfLegislatura.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link TitolarioIdentifier }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://schemas.datacontract.org/2004/07/SIAV.Classification.Entities.Titolario.Identifier", name = "TitolarioIdentifier")
    public JAXBElement<TitolarioIdentifier> createTitolarioIdentifier(TitolarioIdentifier value) {
        return new JAXBElement<TitolarioIdentifier>(_TitolarioIdentifier_QNAME, TitolarioIdentifier.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link FascicoloDocumentoEntity }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://schemas.datacontract.org/2004/07/SIAV.Classification.Entities.Fascicoli.ValueObject", name = "FascicoloDocumentoEntity")
    public JAXBElement<FascicoloDocumentoEntity> createFascicoloDocumentoEntity(FascicoloDocumentoEntity value) {
        return new JAXBElement<FascicoloDocumentoEntity>(_FascicoloDocumentoEntity_QNAME, FascicoloDocumentoEntity.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link ArrayOfTitolarioTemplateEntity }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://schemas.datacontract.org/2004/07/SIAV.Classification.Entities.Titolario.ValueObject", name = "ArrayOfTitolarioTemplateEntity")
    public JAXBElement<ArrayOfTitolarioTemplateEntity> createArrayOfTitolarioTemplateEntity(ArrayOfTitolarioTemplateEntity value) {
        return new JAXBElement<ArrayOfTitolarioTemplateEntity>(_ArrayOfTitolarioTemplateEntity_QNAME, ArrayOfTitolarioTemplateEntity.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link Double }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://schemas.microsoft.com/2003/10/Serialization/", name = "double")
    public JAXBElement<Double> createDouble(Double value) {
        return new JAXBElement<Double>(_Double_QNAME, Double.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link DeleteCheckOutOutput }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://schemas.datacontract.org/2004/07/Siav.Archiflow.Entities.Classification.ValueObject", name = "DeleteCheckOutOutput")
    public JAXBElement<DeleteCheckOutOutput> createDeleteCheckOutOutput(DeleteCheckOutOutput value) {
        return new JAXBElement<DeleteCheckOutOutput>(_DeleteCheckOutOutput_QNAME, DeleteCheckOutOutput.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link ArrayOfBaseTitolarioItem }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://schemas.datacontract.org/2004/07/SIAV.Classification.Entities.TitolarioItem.ValueObject", name = "ArrayOfBaseTitolarioItem")
    public JAXBElement<ArrayOfBaseTitolarioItem> createArrayOfBaseTitolarioItem(ArrayOfBaseTitolarioItem value) {
        return new JAXBElement<ArrayOfBaseTitolarioItem>(_ArrayOfBaseTitolarioItem_QNAME, ArrayOfBaseTitolarioItem.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link UpdateFascicoloOutput }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://schemas.datacontract.org/2004/07/Siav.Archiflow.Entities.Classification.ValueObject", name = "UpdateFascicoloOutput")
    public JAXBElement<UpdateFascicoloOutput> createUpdateFascicoloOutput(UpdateFascicoloOutput value) {
        return new JAXBElement<UpdateFascicoloOutput>(_UpdateFascicoloOutput_QNAME, UpdateFascicoloOutput.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link InsertLegislaturaInput }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://schemas.datacontract.org/2004/07/Siav.Archiflow.Entities.Classification.ValueObject", name = "InsertLegislaturaInput")
    public JAXBElement<InsertLegislaturaInput> createInsertLegislaturaInput(InsertLegislaturaInput value) {
        return new JAXBElement<InsertLegislaturaInput>(_InsertLegislaturaInput_QNAME, InsertLegislaturaInput.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link SortingTypes }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://schemas.datacontract.org/2004/07/SIAV.Archiflow.Types", name = "SortingTypes")
    public JAXBElement<SortingTypes> createSortingTypes(SortingTypes value) {
        return new JAXBElement<SortingTypes>(_SortingTypes_QNAME, SortingTypes.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link UpdateTitolarioItemInput }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://schemas.datacontract.org/2004/07/Siav.Archiflow.Entities.Classification.ValueObject", name = "UpdateTitolarioItemInput")
    public JAXBElement<UpdateTitolarioItemInput> createUpdateTitolarioItemInput(UpdateTitolarioItemInput value) {
        return new JAXBElement<UpdateTitolarioItemInput>(_UpdateTitolarioItemInput_QNAME, UpdateTitolarioItemInput.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link CampiTipoFascicoloCfgValue }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://schemas.datacontract.org/2004/07/SIAV.Classification.Entities.TipoFascicolo.ValueObject", name = "CampiTipoFascicoloCfgValue")
    public JAXBElement<CampiTipoFascicoloCfgValue> createCampiTipoFascicoloCfgValue(CampiTipoFascicoloCfgValue value) {
        return new JAXBElement<CampiTipoFascicoloCfgValue>(_CampiTipoFascicoloCfgValue_QNAME, CampiTipoFascicoloCfgValue.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link TitolarioItemIdentifier }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://schemas.datacontract.org/2004/07/SIAV.Classification.Entities.TitolarioItem.Identifier", name = "TitolarioItemIdentifier")
    public JAXBElement<TitolarioItemIdentifier> createTitolarioItemIdentifier(TitolarioItemIdentifier value) {
        return new JAXBElement<TitolarioItemIdentifier>(_TitolarioItemIdentifier_QNAME, TitolarioItemIdentifier.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link BaseFascicoloDocumento }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://schemas.datacontract.org/2004/07/SIAV.Classification.Entities.Fascicoli.ValueObject", name = "BaseFascicoloDocumento")
    public JAXBElement<BaseFascicoloDocumento> createBaseFascicoloDocumento(BaseFascicoloDocumento value) {
        return new JAXBElement<BaseFascicoloDocumento>(_BaseFascicoloDocumento_QNAME, BaseFascicoloDocumento.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link ReadFascicoloVisibilityOutput }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://schemas.datacontract.org/2004/07/Siav.Archiflow.Entities.Classification.ValueObject", name = "ReadFascicoloVisibilityOutput")
    public JAXBElement<ReadFascicoloVisibilityOutput> createReadFascicoloVisibilityOutput(ReadFascicoloVisibilityOutput value) {
        return new JAXBElement<ReadFascicoloVisibilityOutput>(_ReadFascicoloVisibilityOutput_QNAME, ReadFascicoloVisibilityOutput.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link UpdateTitolarioTemplateOutput }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://schemas.datacontract.org/2004/07/Siav.Archiflow.Entities.Classification.ValueObject", name = "UpdateTitolarioTemplateOutput")
    public JAXBElement<UpdateTitolarioTemplateOutput> createUpdateTitolarioTemplateOutput(UpdateTitolarioTemplateOutput value) {
        return new JAXBElement<UpdateTitolarioTemplateOutput>(_UpdateTitolarioTemplateOutput_QNAME, UpdateTitolarioTemplateOutput.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link ReadTitolarioOutput }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://schemas.datacontract.org/2004/07/Siav.Archiflow.Entities.Classification.ValueObject", name = "ReadTitolarioOutput")
    public JAXBElement<ReadTitolarioOutput> createReadTitolarioOutput(ReadTitolarioOutput value) {
        return new JAXBElement<ReadTitolarioOutput>(_ReadTitolarioOutput_QNAME, ReadTitolarioOutput.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link ReadBaseTitolarioItemCollOutput }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://schemas.datacontract.org/2004/07/Siav.Archiflow.Entities.Classification.ValueObject", name = "ReadBaseTitolarioItemCollOutput")
    public JAXBElement<ReadBaseTitolarioItemCollOutput> createReadBaseTitolarioItemCollOutput(ReadBaseTitolarioItemCollOutput value) {
        return new JAXBElement<ReadBaseTitolarioItemCollOutput>(_ReadBaseTitolarioItemCollOutput_QNAME, ReadBaseTitolarioItemCollOutput.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link InsertClassificaFascicoloOutput }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://schemas.datacontract.org/2004/07/Siav.Archiflow.Entities.Classification.ValueObject", name = "InsertClassificaFascicoloOutput")
    public JAXBElement<InsertClassificaFascicoloOutput> createInsertClassificaFascicoloOutput(InsertClassificaFascicoloOutput value) {
        return new JAXBElement<InsertClassificaFascicoloOutput>(_InsertClassificaFascicoloOutput_QNAME, InsertClassificaFascicoloOutput.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link CopyTitolarioInput }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://schemas.datacontract.org/2004/07/Siav.Archiflow.Entities.Classification.ValueObject", name = "CopyTitolarioInput")
    public JAXBElement<CopyTitolarioInput> createCopyTitolarioInput(CopyTitolarioInput value) {
        return new JAXBElement<CopyTitolarioInput>(_CopyTitolarioInput_QNAME, CopyTitolarioInput.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link UpdateTitolarioInput }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://schemas.datacontract.org/2004/07/Siav.Archiflow.Entities.Classification.ValueObject", name = "UpdateTitolarioInput")
    public JAXBElement<UpdateTitolarioInput> createUpdateTitolarioInput(UpdateTitolarioInput value) {
        return new JAXBElement<UpdateTitolarioInput>(_UpdateTitolarioInput_QNAME, UpdateTitolarioInput.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link QName }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://schemas.microsoft.com/2003/10/Serialization/", name = "QName")
    public JAXBElement<QName> createQName(QName value) {
        return new JAXBElement<QName>(_QName_QNAME, QName.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link InsertFascicoloInput }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://schemas.datacontract.org/2004/07/Siav.Archiflow.Entities.Classification.ValueObject", name = "InsertFascicoloInput")
    public JAXBElement<InsertFascicoloInput> createInsertFascicoloInput(InsertFascicoloInput value) {
        return new JAXBElement<InsertFascicoloInput>(_InsertFascicoloInput_QNAME, InsertFascicoloInput.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link InsertFascicoloOutput }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://schemas.datacontract.org/2004/07/Siav.Archiflow.Entities.Classification.ValueObject", name = "InsertFascicoloOutput")
    public JAXBElement<InsertFascicoloOutput> createInsertFascicoloOutput(InsertFascicoloOutput value) {
        return new JAXBElement<InsertFascicoloOutput>(_InsertFascicoloOutput_QNAME, InsertFascicoloOutput.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link SearchBaseFascicoloOutput }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://schemas.datacontract.org/2004/07/Siav.Archiflow.Entities.Classification.ValueObject", name = "SearchBaseFascicoloOutput")
    public JAXBElement<SearchBaseFascicoloOutput> createSearchBaseFascicoloOutput(SearchBaseFascicoloOutput value) {
        return new JAXBElement<SearchBaseFascicoloOutput>(_SearchBaseFascicoloOutput_QNAME, SearchBaseFascicoloOutput.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link ConservationType }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://schemas.datacontract.org/2004/07/SIAV.Archiflow.Types", name = "ConservationType")
    public JAXBElement<ConservationType> createConservationType(ConservationType value) {
        return new JAXBElement<ConservationType>(_ConservationType_QNAME, ConservationType.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link DeleteFascicoloInput }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://schemas.datacontract.org/2004/07/Siav.Archiflow.Entities.Classification.ValueObject", name = "DeleteFascicoloInput")
    public JAXBElement<DeleteFascicoloInput> createDeleteFascicoloInput(DeleteFascicoloInput value) {
        return new JAXBElement<DeleteFascicoloInput>(_DeleteFascicoloInput_QNAME, DeleteFascicoloInput.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link EntityAccess }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://schemas.datacontract.org/2004/07/SIAV.Common.BaseClass.ValueObject", name = "EntityAccess")
    public JAXBElement<EntityAccess> createEntityAccess(EntityAccess value) {
        return new JAXBElement<EntityAccess>(_EntityAccess_QNAME, EntityAccess.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link InsertOptionsInput }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://schemas.datacontract.org/2004/07/Siav.Archiflow.Entities.Classification.ValueObject", name = "InsertOptionsInput")
    public JAXBElement<InsertOptionsInput> createInsertOptionsInput(InsertOptionsInput value) {
        return new JAXBElement<InsertOptionsInput>(_InsertOptionsInput_QNAME, InsertOptionsInput.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link TipoFascicoloSearcher }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://schemas.datacontract.org/2004/07/SIAV.Classification.Entities.TipoFascicolo.Searcher", name = "TipoFascicoloSearcher")
    public JAXBElement<TipoFascicoloSearcher> createTipoFascicoloSearcher(TipoFascicoloSearcher value) {
        return new JAXBElement<TipoFascicoloSearcher>(_TipoFascicoloSearcher_QNAME, TipoFascicoloSearcher.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link IsTipoFascicoloUsedOutput }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://schemas.datacontract.org/2004/07/Siav.Archiflow.Entities.Classification.ValueObject", name = "IsTipoFascicoloUsedOutput")
    public JAXBElement<IsTipoFascicoloUsedOutput> createIsTipoFascicoloUsedOutput(IsTipoFascicoloUsedOutput value) {
        return new JAXBElement<IsTipoFascicoloUsedOutput>(_IsTipoFascicoloUsedOutput_QNAME, IsTipoFascicoloUsedOutput.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link UpdateStatusHierarchyOutput }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://schemas.datacontract.org/2004/07/Siav.Archiflow.Entities.Classification.ValueObject", name = "UpdateStatusHierarchyOutput")
    public JAXBElement<UpdateStatusHierarchyOutput> createUpdateStatusHierarchyOutput(UpdateStatusHierarchyOutput value) {
        return new JAXBElement<UpdateStatusHierarchyOutput>(_UpdateStatusHierarchyOutput_QNAME, UpdateStatusHierarchyOutput.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link EntityDataType }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://schemas.datacontract.org/2004/07/SIAV.Archiflow.Types", name = "EntityDataType")
    public JAXBElement<EntityDataType> createEntityDataType(EntityDataType value) {
        return new JAXBElement<EntityDataType>(_EntityDataType_QNAME, EntityDataType.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link SearchOpeningStatus }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://schemas.datacontract.org/2004/07/SIAV.Archiflow.Types", name = "SearchOpeningStatus")
    public JAXBElement<SearchOpeningStatus> createSearchOpeningStatus(SearchOpeningStatus value) {
        return new JAXBElement<SearchOpeningStatus>(_SearchOpeningStatus_QNAME, SearchOpeningStatus.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link ReadCardsInFolderInput }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://schemas.datacontract.org/2004/07/Siav.Archiflow.Entities.Classification.ValueObject", name = "ReadCardsInFolderInput")
    public JAXBElement<ReadCardsInFolderInput> createReadCardsInFolderInput(ReadCardsInFolderInput value) {
        return new JAXBElement<ReadCardsInFolderInput>(_ReadCardsInFolderInput_QNAME, ReadCardsInFolderInput.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link GetFascicoloToPreserveOutput }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://schemas.datacontract.org/2004/07/Siav.Archiflow.Entities.Classification.ValueObject", name = "GetFascicoloToPreserveOutput")
    public JAXBElement<GetFascicoloToPreserveOutput> createGetFascicoloToPreserveOutput(GetFascicoloToPreserveOutput value) {
        return new JAXBElement<GetFascicoloToPreserveOutput>(_GetFascicoloToPreserveOutput_QNAME, GetFascicoloToPreserveOutput.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link TipoFascDiffValue }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://schemas.datacontract.org/2004/07/SIAV.Classification.Entities.TipoFascicolo.ValueObject", name = "TipoFascDiffValue")
    public JAXBElement<TipoFascDiffValue> createTipoFascDiffValue(TipoFascDiffValue value) {
        return new JAXBElement<TipoFascDiffValue>(_TipoFascDiffValue_QNAME, TipoFascDiffValue.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link IsCampoTipoFascicoloUsedOutput }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://schemas.datacontract.org/2004/07/Siav.Archiflow.Entities.Classification.ValueObject", name = "IsCampoTipoFascicoloUsedOutput")
    public JAXBElement<IsCampoTipoFascicoloUsedOutput> createIsCampoTipoFascicoloUsedOutput(IsCampoTipoFascicoloUsedOutput value) {
        return new JAXBElement<IsCampoTipoFascicoloUsedOutput>(_IsCampoTipoFascicoloUsedOutput_QNAME, IsCampoTipoFascicoloUsedOutput.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link Language }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://schemas.datacontract.org/2004/07/SIAV.Archiflow.Entities.Types", name = "Language")
    public JAXBElement<Language> createLanguage(Language value) {
        return new JAXBElement<Language>(_Language_QNAME, Language.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link OfficeChart }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://schemas.datacontract.org/2004/07/SIAV.Archiflow.Entities.Chart.ValueObject", name = "OfficeChart")
    public JAXBElement<OfficeChart> createOfficeChart(OfficeChart value) {
        return new JAXBElement<OfficeChart>(_OfficeChart_QNAME, OfficeChart.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link ArrayOfOggettarioCfg }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://schemas.datacontract.org/2004/07/SIAV.Classification.Entities.Fascicoli.ValueObject", name = "ArrayOfOggettarioCfg")
    public JAXBElement<ArrayOfOggettarioCfg> createArrayOfOggettarioCfg(ArrayOfOggettarioCfg value) {
        return new JAXBElement<ArrayOfOggettarioCfg>(_ArrayOfOggettarioCfg_QNAME, ArrayOfOggettarioCfg.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link DeleteClassificaDocumentoInput }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://schemas.datacontract.org/2004/07/Siav.Archiflow.Entities.Classification.ValueObject", name = "DeleteClassificaDocumentoInput")
    public JAXBElement<DeleteClassificaDocumentoInput> createDeleteClassificaDocumentoInput(DeleteClassificaDocumentoInput value) {
        return new JAXBElement<DeleteClassificaDocumentoInput>(_DeleteClassificaDocumentoInput_QNAME, DeleteClassificaDocumentoInput.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link DeleteCampiTipoFascicoloValueOutput }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://schemas.datacontract.org/2004/07/Siav.Archiflow.Entities.Classification.ValueObject", name = "DeleteCampiTipoFascicoloValueOutput")
    public JAXBElement<DeleteCampiTipoFascicoloValueOutput> createDeleteCampiTipoFascicoloValueOutput(DeleteCampiTipoFascicoloValueOutput value) {
        return new JAXBElement<DeleteCampiTipoFascicoloValueOutput>(_DeleteCampiTipoFascicoloValueOutput_QNAME, DeleteCampiTipoFascicoloValueOutput.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link InsertValoreCampiTipoFascicoloOutput }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://schemas.datacontract.org/2004/07/Siav.Archiflow.Entities.Classification.ValueObject", name = "InsertValoreCampiTipoFascicoloOutput")
    public JAXBElement<InsertValoreCampiTipoFascicoloOutput> createInsertValoreCampiTipoFascicoloOutput(InsertValoreCampiTipoFascicoloOutput value) {
        return new JAXBElement<InsertValoreCampiTipoFascicoloOutput>(_InsertValoreCampiTipoFascicoloOutput_QNAME, InsertValoreCampiTipoFascicoloOutput.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link UpdateStatoFascicoloOutput }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://schemas.datacontract.org/2004/07/Siav.Archiflow.Entities.Classification.ValueObject", name = "UpdateStatoFascicoloOutput")
    public JAXBElement<UpdateStatoFascicoloOutput> createUpdateStatoFascicoloOutput(UpdateStatoFascicoloOutput value) {
        return new JAXBElement<UpdateStatoFascicoloOutput>(_UpdateStatoFascicoloOutput_QNAME, UpdateStatoFascicoloOutput.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link DeleteTitolarioOutput }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://schemas.datacontract.org/2004/07/Siav.Archiflow.Entities.Classification.ValueObject", name = "DeleteTitolarioOutput")
    public JAXBElement<DeleteTitolarioOutput> createDeleteTitolarioOutput(DeleteTitolarioOutput value) {
        return new JAXBElement<DeleteTitolarioOutput>(_DeleteTitolarioOutput_QNAME, DeleteTitolarioOutput.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link ArrayOfBaseNote }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://schemas.datacontract.org/2004/07/SIAV.Common.BaseClass.ValueObject", name = "ArrayOfBaseNote")
    public JAXBElement<ArrayOfBaseNote> createArrayOfBaseNote(ArrayOfBaseNote value) {
        return new JAXBElement<ArrayOfBaseNote>(_ArrayOfBaseNote_QNAME, ArrayOfBaseNote.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link ReadFascicoloDocumentoInput }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://schemas.datacontract.org/2004/07/Siav.Archiflow.Entities.Classification.ValueObject", name = "ReadFascicoloDocumentoInput")
    public JAXBElement<ReadFascicoloDocumentoInput> createReadFascicoloDocumentoInput(ReadFascicoloDocumentoInput value) {
        return new JAXBElement<ReadFascicoloDocumentoInput>(_ReadFascicoloDocumentoInput_QNAME, ReadFascicoloDocumentoInput.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link BigInteger }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://schemas.microsoft.com/2003/10/Serialization/", name = "unsignedLong")
    public JAXBElement<BigInteger> createUnsignedLong(BigInteger value) {
        return new JAXBElement<BigInteger>(_UnsignedLong_QNAME, BigInteger.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link TitolarioItemEntity }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://schemas.datacontract.org/2004/07/SIAV.Classification.Entities.TitolarioItem.ValueObject", name = "TitolarioItemEntity")
    public JAXBElement<TitolarioItemEntity> createTitolarioItemEntity(TitolarioItemEntity value) {
        return new JAXBElement<TitolarioItemEntity>(_TitolarioItemEntity_QNAME, TitolarioItemEntity.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link DeleteLegislaturaInput }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://schemas.datacontract.org/2004/07/Siav.Archiflow.Entities.Classification.ValueObject", name = "DeleteLegislaturaInput")
    public JAXBElement<DeleteLegislaturaInput> createDeleteLegislaturaInput(DeleteLegislaturaInput value) {
        return new JAXBElement<DeleteLegislaturaInput>(_DeleteLegislaturaInput_QNAME, DeleteLegislaturaInput.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link GetTitolarioItemSonsOutput }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://schemas.datacontract.org/2004/07/Siav.Archiflow.Entities.Classification.ValueObject", name = "GetTitolarioItemSonsOutput")
    public JAXBElement<GetTitolarioItemSonsOutput> createGetTitolarioItemSonsOutput(GetTitolarioItemSonsOutput value) {
        return new JAXBElement<GetTitolarioItemSonsOutput>(_GetTitolarioItemSonsOutput_QNAME, GetTitolarioItemSonsOutput.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link FascicoloPreservationStatus }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://schemas.datacontract.org/2004/07/SIAV.Classification.Entities.Fascicoli.ValueObject", name = "FascicoloPreservationStatus")
    public JAXBElement<FascicoloPreservationStatus> createFascicoloPreservationStatus(FascicoloPreservationStatus value) {
        return new JAXBElement<FascicoloPreservationStatus>(_FascicoloPreservationStatus_QNAME, FascicoloPreservationStatus.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link DuplicatedArchivalNumberFault }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://schemas.datacontract.org/2004/07/SIAV.Archiflow.Faults", name = "DuplicatedArchivalNumberFault")
    public JAXBElement<DuplicatedArchivalNumberFault> createDuplicatedArchivalNumberFault(DuplicatedArchivalNumberFault value) {
        return new JAXBElement<DuplicatedArchivalNumberFault>(_DuplicatedArchivalNumberFault_QNAME, DuplicatedArchivalNumberFault.class, null, value);
    }

}
