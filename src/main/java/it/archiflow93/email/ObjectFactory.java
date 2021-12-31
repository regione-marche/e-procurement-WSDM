
package it.archiflow93.email;

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
 * generated in the it.archiflow93.email package. 
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

    private final static QName _GetMailServersInput_QNAME = new QName("http://schemas.datacontract.org/2004/07/SIAV.Archiflow.Entities.ExternalMail.ValueObject", "GetMailServersInput");
    private final static QName _DocumentStatus_QNAME = new QName("http://schemas.datacontract.org/2004/07/SIAV.Archiflow.Entities.Types", "DocumentStatus");
    private final static QName _InvoiceIn_QNAME = new QName("http://schemas.datacontract.org/2004/07/SIAV.Archiflow.Entities.Invoice.ValueObject", "InvoiceIn");
    private final static QName _BaseFault_QNAME = new QName("http://schemas.datacontract.org/2004/07/SIAV.Archiflow.Faults", "BaseFault");
    private final static QName _GetExtMailSettingsInput_QNAME = new QName("http://schemas.datacontract.org/2004/07/SIAV.Archiflow.Entities.ExternalMail.ValueObject", "GetExtMailSettingsInput");
    private final static QName _SdiInfo_QNAME = new QName("http://schemas.datacontract.org/2004/07/SIAV.Archiflow.Entities.Invoice.ValueObject", "SdiInfo");
    private final static QName _UserRights_QNAME = new QName("http://schemas.datacontract.org/2004/07/SIAV.Archiflow.Entities.Types", "UserRights");
    private final static QName _Base64Binary_QNAME = new QName("http://schemas.microsoft.com/2003/10/Serialization/", "base64Binary");
    private final static QName _Byte_QNAME = new QName("http://schemas.microsoft.com/2003/10/Serialization/", "byte");
    private final static QName _ProcWF_QNAME = new QName("http://schemas.datacontract.org/2004/07/SIAV.Archiflow.Entities.Types", "ProcWF");
    private final static QName _DeleteProxyOutput_QNAME = new QName("http://schemas.datacontract.org/2004/07/SIAV.Archiflow.Entities.ExternalMail.ValueObject", "DeleteProxyOutput");
    private final static QName _SendExternalMailInput_QNAME = new QName("http://schemas.datacontract.org/2004/07/SIAV.Archiflow.Entities.ExternalMail.ValueObject", "SendExternalMailInput");
    private final static QName _DeleteMailServerOutput_QNAME = new QName("http://schemas.datacontract.org/2004/07/SIAV.Archiflow.Entities.ExternalMail.ValueObject", "DeleteMailServerOutput");
    private final static QName _PostingFault_QNAME = new QName("http://schemas.datacontract.org/2004/07/SIAV.Archiflow.Faults", "PostingFault");
    private final static QName _XmlSelectNodeFault_QNAME = new QName("http://schemas.datacontract.org/2004/07/SIAV.Archiflow.Faults", "XmlSelectNodeFault");
    private final static QName _ArrayOfUser_QNAME = new QName("http://schemas.datacontract.org/2004/07/SIAV.Archiflow.Entities.Chart.ValueObject", "ArrayOfUser");
    private final static QName _GetExtMailSettingsOutput_QNAME = new QName("http://schemas.datacontract.org/2004/07/SIAV.Archiflow.Entities.ExternalMail.ValueObject", "GetExtMailSettingsOutput");
    private final static QName _GetEmailAttInChunkOutput_QNAME = new QName("http://schemas.datacontract.org/2004/07/SIAV.Archiflow.Entities.ExternalMail.ValueObject", "GetEmailAttInChunkOutput");
    private final static QName _ExtEMailConfig_QNAME = new QName("http://schemas.datacontract.org/2004/07/SIAV.Archiflow.Entities.Card.ValueObject", "ExtEMailConfig");
    private final static QName _RetrieveEmailsOutput_QNAME = new QName("http://schemas.datacontract.org/2004/07/SIAV.Archiflow.Entities.ExternalMail.ValueObject", "RetrieveEmailsOutput");
    private final static QName _CardStatus_QNAME = new QName("http://schemas.datacontract.org/2004/07/SIAV.Archiflow.Entities.Types", "CardStatus");
    private final static QName _InvoiceOut_QNAME = new QName("http://schemas.datacontract.org/2004/07/SIAV.Archiflow.Entities.Invoice.ValueObject", "InvoiceOut");
    private final static QName _ArrayOfAgrafCardContact_QNAME = new QName("http://schemas.datacontract.org/2004/07/SIAV.Archiflow.Entities.Agraf.ValueObject", "ArrayOfAgrafCardContact");
    private final static QName _MailBox_QNAME = new QName("http://schemas.datacontract.org/2004/07/SIAV.Archiflow.Entities.MailBox.ValueObject", "MailBox");
    private final static QName _UserType_QNAME = new QName("http://schemas.datacontract.org/2004/07/SIAV.Archiflow.Entities.Types", "UserType");
    private final static QName _InvalidSessionFault_QNAME = new QName("http://schemas.datacontract.org/2004/07/SIAV.Archiflow.Faults", "InvalidSessionFault");
    private final static QName _SetMailboxPasswordsInput_QNAME = new QName("http://schemas.datacontract.org/2004/07/SIAV.Archiflow.Entities.ExternalMail.ValueObject", "SetMailboxPasswordsInput");
    private final static QName _ArrayOfOfficeChart_QNAME = new QName("http://schemas.datacontract.org/2004/07/SIAV.Archiflow.Entities.Chart.ValueObject", "ArrayOfOfficeChart");
    private final static QName _NoModelFoundFault_QNAME = new QName("http://schemas.datacontract.org/2004/07/SIAV.Archiflow.Faults", "NoModelFoundFault");
    private final static QName _XmlSchemaValidationFault_QNAME = new QName("http://schemas.datacontract.org/2004/07/SIAV.Archiflow.Faults", "XmlSchemaValidationFault");
    private final static QName _OperationFailedFault_QNAME = new QName("http://schemas.datacontract.org/2004/07/SIAV.Archiflow.Faults", "OperationFailedFault");
    private final static QName _ArrayOfUserRight_QNAME = new QName("http://schemas.datacontract.org/2004/07/SIAV.Archiflow.Entities.Chart.ValueObject", "ArrayOfUserRight");
    private final static QName _StoreEmailCard_QNAME = new QName("http://schemas.datacontract.org/2004/07/SIAV.Archiflow.Entities.ExternalMail.ValueObject", "StoreEmailCard");
    private final static QName _UnsignedShort_QNAME = new QName("http://schemas.microsoft.com/2003/10/Serialization/", "unsignedShort");
    private final static QName _GetCustomMailFieldsOutput_QNAME = new QName("http://schemas.datacontract.org/2004/07/SIAV.Archiflow.Entities.ExternalMail.ValueObject", "GetCustomMailFieldsOutput");
    private final static QName _GetMailServersOutput_QNAME = new QName("http://schemas.datacontract.org/2004/07/SIAV.Archiflow.Entities.ExternalMail.ValueObject", "GetMailServersOutput");
    private final static QName _SendExtendedMailInput_QNAME = new QName("http://schemas.datacontract.org/2004/07/SIAV.Archiflow.Entities.ExternalMail.ValueObject", "SendExtendedMailInput");
    private final static QName _ArchiflowServiceExceptionDetail_QNAME = new QName("http://schemas.datacontract.org/2004/07/SIAV.Archiflow.Exceptions", "ArchiflowServiceExceptionDetail");
    private final static QName _InsModProxyInput_QNAME = new QName("http://schemas.datacontract.org/2004/07/SIAV.Archiflow.Entities.ExternalMail.ValueObject", "InsModProxyInput");
    private final static QName _Short_QNAME = new QName("http://schemas.microsoft.com/2003/10/Serialization/", "short");
    private final static QName _NoDataFoundFault_QNAME = new QName("http://schemas.datacontract.org/2004/07/SIAV.Archiflow.Faults", "NoDataFoundFault");
    private final static QName _Attachment_QNAME = new QName("http://schemas.datacontract.org/2004/07/SIAV.Archiflow.Entities.Card.ValueObject", "Attachment");
    private final static QName _InsModProxyOutput_QNAME = new QName("http://schemas.datacontract.org/2004/07/SIAV.Archiflow.Entities.ExternalMail.ValueObject", "InsModProxyOutput");
    private final static QName _TestMailboxConnectionInput_QNAME = new QName("http://schemas.datacontract.org/2004/07/SIAV.Archiflow.Entities.ExternalMail.ValueObject", "TestMailboxConnectionInput");
    private final static QName _Group_QNAME = new QName("http://schemas.datacontract.org/2004/07/SIAV.Archiflow.Entities.Chart.ValueObject", "Group");
    private final static QName _ExpirationMethodType_QNAME = new QName("http://schemas.datacontract.org/2004/07/SIAV.Archiflow.Entities.Types", "ExpirationMethodType");
    private final static QName _ArrayOfMailAddress_QNAME = new QName("http://schemas.datacontract.org/2004/07/SIAV.Archiflow.Entities.ExternalMail.ValueObject", "ArrayOfMailAddress");
    private final static QName _Proxy_QNAME = new QName("http://schemas.datacontract.org/2004/07/SIAV.Archiflow.Entities.MailBox.ValueObject", "Proxy");
    private final static QName _GetProxiesInput_QNAME = new QName("http://schemas.datacontract.org/2004/07/SIAV.Archiflow.Entities.ExternalMail.ValueObject", "GetProxiesInput");
    private final static QName _InvoiceBase_QNAME = new QName("http://schemas.datacontract.org/2004/07/SIAV.Archiflow.Entities.Invoice.ValueObject", "InvoiceBase");
    private final static QName _MailAttachment_QNAME = new QName("http://schemas.datacontract.org/2004/07/SIAV.Archiflow.Entities.ExternalMail.ValueObject", "MailAttachment");
    private final static QName _UnsignedInt_QNAME = new QName("http://schemas.microsoft.com/2003/10/Serialization/", "unsignedInt");
    private final static QName _CustomEmailFieldsContext_QNAME = new QName("http://schemas.datacontract.org/2004/07/SIAV.Archiflow.Entities.Types", "CustomEmailFieldsContext");
    private final static QName _ArrayOfGroup_QNAME = new QName("http://schemas.datacontract.org/2004/07/SIAV.Archiflow.Entities.Chart.ValueObject", "ArrayOfGroup");
    private final static QName _ArrayOfstring_QNAME = new QName("http://schemas.microsoft.com/2003/10/Serialization/Arrays", "ArrayOfstring");
    private final static QName _GetMailBoxesInput_QNAME = new QName("http://schemas.datacontract.org/2004/07/SIAV.Archiflow.Entities.ExternalMail.ValueObject", "GetMailBoxesInput");
    private final static QName _Additive_QNAME = new QName("http://schemas.datacontract.org/2004/07/SIAV.Archiflow.Entities.Card.ValueObject", "Additive");
    private final static QName _UserRightsConfig_QNAME = new QName("http://schemas.datacontract.org/2004/07/SIAV.Archiflow.Types", "UserRightsConfig");
    private final static QName _MailBoxInvoiceCfg_QNAME = new QName("http://schemas.datacontract.org/2004/07/SIAV.Archiflow.Entities.MailBox.ValueObject", "MailBoxInvoiceCfg");
    private final static QName _StoreEmailOutput_QNAME = new QName("http://schemas.datacontract.org/2004/07/SIAV.Archiflow.Entities.ExternalMail.ValueObject", "StoreEmailOutput");
    private final static QName _MailInteropType_QNAME = new QName("http://schemas.datacontract.org/2004/07/SIAV.Archiflow.Entities.Types", "MailInteropType");
    private final static QName _ArrayOfAdditive_QNAME = new QName("http://schemas.datacontract.org/2004/07/SIAV.Archiflow.Entities.Card.ValueObject", "ArrayOfAdditive");
    private final static QName _IdAdditive_QNAME = new QName("http://schemas.datacontract.org/2004/07/SIAV.Archiflow.Entities.Types", "IdAdditive");
    private final static QName _Char_QNAME = new QName("http://schemas.microsoft.com/2003/10/Serialization/", "char");
    private final static QName _SessionInfo_QNAME = new QName("http://schemas.datacontract.org/2004/07/SIAV.Archiflow.Entities.Login.ValueObject", "SessionInfo");
    private final static QName _ArrayOfField_QNAME = new QName("http://schemas.datacontract.org/2004/07/SIAV.Archiflow.Entities.Card.ValueObject", "ArrayOfField");
    private final static QName _AgrafCard_QNAME = new QName("http://schemas.datacontract.org/2004/07/SIAV.Archiflow.Entities.Agraf.ValueObject", "AgrafCard");
    private final static QName _UserRight_QNAME = new QName("http://schemas.datacontract.org/2004/07/SIAV.Archiflow.Entities.Chart.ValueObject", "UserRight");
    private final static QName _LoggableBase_QNAME = new QName("http://schemas.datacontract.org/2004/07/SIAV.Common.Tools.Log", "LoggableBase");
    private final static QName _DataType_QNAME = new QName("http://schemas.datacontract.org/2004/07/SIAV.Archiflow.Entities.Types", "DataType");
    private final static QName _InternalAttachType_QNAME = new QName("http://schemas.datacontract.org/2004/07/SIAV.Archiflow.Entities.Types", "InternalAttachType");
    private final static QName _MailIn_QNAME = new QName("http://schemas.datacontract.org/2004/07/SIAV.Archiflow.Entities.ExternalMail.ValueObject", "MailIn");
    private final static QName _AgrafCardContact_QNAME = new QName("http://schemas.datacontract.org/2004/07/SIAV.Archiflow.Entities.Agraf.ValueObject", "AgrafCardContact");
    private final static QName _ArrayOfHistory_QNAME = new QName("http://schemas.datacontract.org/2004/07/SIAV.Archiflow.Entities.Card.ValueObject", "ArrayOfHistory");
    private final static QName _MessageIdentifier_QNAME = new QName("http://schemas.datacontract.org/2004/07/SIAV.Archiflow.Entities.ExternalMail.ValueObject", "MessageIdentifier");
    private final static QName _EmailAttType_QNAME = new QName("http://schemas.datacontract.org/2004/07/SIAV.Archiflow.Entities.Types", "EmailAttType");
    private final static QName _ValidLogCreatedFault_QNAME = new QName("http://schemas.datacontract.org/2004/07/SIAV.Archiflow.Faults", "ValidLogCreatedFault");
    private final static QName _StoreEmailAttachment_QNAME = new QName("http://schemas.datacontract.org/2004/07/SIAV.Archiflow.Entities.ExternalMail.ValueObject", "StoreEmailAttachment");
    private final static QName _UnsignedByte_QNAME = new QName("http://schemas.microsoft.com/2003/10/Serialization/", "unsignedByte");
    private final static QName _ArrayOfStoreEmailAttachment_QNAME = new QName("http://schemas.datacontract.org/2004/07/SIAV.Archiflow.Entities.ExternalMail.ValueObject", "ArrayOfStoreEmailAttachment");
    private final static QName _Int_QNAME = new QName("http://schemas.microsoft.com/2003/10/Serialization/", "int");
    private final static QName _SDINotificationType_QNAME = new QName("http://schemas.datacontract.org/2004/07/SIAV.Archiflow.Entities.Types", "SDINotificationType");
    private final static QName _Card_QNAME = new QName("http://schemas.datacontract.org/2004/07/SIAV.Archiflow.Entities.Card.ValueObject", "Card");
    private final static QName _Document_QNAME = new QName("http://schemas.datacontract.org/2004/07/SIAV.Archiflow.Entities.Card.ValueObject", "Document");
    private final static QName _SendExtendedMailOutput_QNAME = new QName("http://schemas.datacontract.org/2004/07/SIAV.Archiflow.Entities.ExternalMail.ValueObject", "SendExtendedMailOutput");
    private final static QName _MaxLimitFault_QNAME = new QName("http://schemas.datacontract.org/2004/07/SIAV.Archiflow.Faults", "MaxLimitFault");
    private final static QName _TestMailboxConnectionOutput_QNAME = new QName("http://schemas.datacontract.org/2004/07/SIAV.Archiflow.Entities.ExternalMail.ValueObject", "TestMailboxConnectionOutput");
    private final static QName _ArrayOfAgrafCard_QNAME = new QName("http://schemas.datacontract.org/2004/07/SIAV.Archiflow.Entities.Agraf.ValueObject", "ArrayOfAgrafCard");
    private final static QName _DateTime_QNAME = new QName("http://schemas.microsoft.com/2003/10/Serialization/", "dateTime");
    private final static QName _CardExpirationInfo_QNAME = new QName("http://schemas.datacontract.org/2004/07/SIAV.Archiflow.Entities.Card.ValueObject", "CardExpirationInfo");
    private final static QName _ArrayOfMailBox_QNAME = new QName("http://schemas.datacontract.org/2004/07/SIAV.Archiflow.Entities.MailBox.ValueObject", "ArrayOfMailBox");
    private final static QName _ArrayOfMailInHeaders_QNAME = new QName("http://schemas.datacontract.org/2004/07/SIAV.Archiflow.Entities.ExternalMail.ValueObject", "ArrayOfMailInHeaders");
    private final static QName _Operation_QNAME = new QName("http://schemas.datacontract.org/2004/07/SIAV.Archiflow.Entities.Card.ValueObject", "Operation");
    private final static QName _ArchiflowExceptionSeverity_QNAME = new QName("http://schemas.datacontract.org/2004/07/SIAV.Archiflow.Exceptions", "ArchiflowExceptionSeverity");
    private final static QName _StoreEmailInput_QNAME = new QName("http://schemas.datacontract.org/2004/07/SIAV.Archiflow.Entities.ExternalMail.ValueObject", "StoreEmailInput");
    private final static QName _CardBundle_QNAME = new QName("http://schemas.datacontract.org/2004/07/SIAV.Archiflow.Entities.Card.ValueObject", "CardBundle");
    private final static QName _InternalAttachment_QNAME = new QName("http://schemas.datacontract.org/2004/07/SIAV.Archiflow.Entities.Card.ValueObject", "InternalAttachment");
    private final static QName _Decimal_QNAME = new QName("http://schemas.microsoft.com/2003/10/Serialization/", "decimal");
    private final static QName _MailServerProtocol_QNAME = new QName("http://schemas.datacontract.org/2004/07/SIAV.Archiflow.Entities.Types", "MailServerProtocol");
    private final static QName _Guid_QNAME = new QName("http://schemas.microsoft.com/2003/10/Serialization/", "guid");
    private final static QName _Duration_QNAME = new QName("http://schemas.microsoft.com/2003/10/Serialization/", "duration");
    private final static QName _EMailVisType_QNAME = new QName("http://schemas.datacontract.org/2004/07/SIAV.Archiflow.Entities.Types", "EMailVisType");
    private final static QName _VisibilityFault_QNAME = new QName("http://schemas.datacontract.org/2004/07/SIAV.Archiflow.Faults", "VisibilityFault");
    private final static QName _AnyURI_QNAME = new QName("http://schemas.microsoft.com/2003/10/Serialization/", "anyURI");
    private final static QName _ArrayOfMailServer_QNAME = new QName("http://schemas.datacontract.org/2004/07/SIAV.Archiflow.Entities.MailBox.ValueObject", "ArrayOfMailServer");
    private final static QName _Float_QNAME = new QName("http://schemas.microsoft.com/2003/10/Serialization/", "float");
    private final static QName _SendHiddenExtEMailInput_QNAME = new QName("http://schemas.datacontract.org/2004/07/SIAV.Archiflow.Entities.ExternalMail.ValueObject", "SendHiddenExtEMailInput");
    private final static QName _ClassificationFolder_QNAME = new QName("http://schemas.datacontract.org/2004/07/SIAV.Archiflow.Entities.Card.ValueObject", "ClassificationFolder");
    private final static QName _SSLStartModes_QNAME = new QName("http://schemas.datacontract.org/2004/07/SIAV.Archiflow.Entities.Types", "SSLStartModes");
    private final static QName _DeleteProxyInput_QNAME = new QName("http://schemas.datacontract.org/2004/07/SIAV.Archiflow.Entities.ExternalMail.ValueObject", "DeleteProxyInput");
    private final static QName _Boolean_QNAME = new QName("http://schemas.microsoft.com/2003/10/Serialization/", "boolean");
    private final static QName _AnyType_QNAME = new QName("http://schemas.microsoft.com/2003/10/Serialization/", "anyType");
    private final static QName _Annotation_QNAME = new QName("http://schemas.datacontract.org/2004/07/SIAV.Archiflow.Entities.Card.ValueObject", "Annotation");
    private final static QName _InsModMailBoxInput_QNAME = new QName("http://schemas.datacontract.org/2004/07/SIAV.Archiflow.Entities.ExternalMail.ValueObject", "InsModMailBoxInput");
    private final static QName _EmailFault_QNAME = new QName("http://schemas.datacontract.org/2004/07/SIAV.Archiflow.Faults", "EmailFault");
    private final static QName _ArrayOfClassificationFolder_QNAME = new QName("http://schemas.datacontract.org/2004/07/SIAV.Archiflow.Entities.Card.ValueObject", "ArrayOfClassificationFolder");
    private final static QName _ArrayOfint_QNAME = new QName("http://schemas.microsoft.com/2003/10/Serialization/Arrays", "ArrayOfint");
    private final static QName _ResultInfo_QNAME = new QName("http://schemas.datacontract.org/2004/07/SIAV.Common.BaseClass.Types", "ResultInfo");
    private final static QName _AgrafCardContactId_QNAME = new QName("http://schemas.datacontract.org/2004/07/SIAV.Archiflow.Entities.Agraf.ValueObject", "AgrafCardContactId");
    private final static QName _RetrieveEmailsInput_QNAME = new QName("http://schemas.datacontract.org/2004/07/SIAV.Archiflow.Entities.ExternalMail.ValueObject", "RetrieveEmailsInput");
    private final static QName _ArrayOfanyType_QNAME = new QName("http://schemas.microsoft.com/2003/10/Serialization/Arrays", "ArrayOfanyType");
    private final static QName _SendEMailMsgInput_QNAME = new QName("http://schemas.datacontract.org/2004/07/SIAV.Archiflow.Entities.ExternalMail.ValueObject", "SendEMailMsgInput");
    private final static QName _SendFolderByExternalMailInput_QNAME = new QName("http://schemas.datacontract.org/2004/07/SIAV.Archiflow.Entities.ExternalMail.ValueObject", "SendFolderByExternalMailInput");
    private final static QName _ArrayOfKeyValueOfintArrayOfintty7Ep6D1_QNAME = new QName("http://schemas.microsoft.com/2003/10/Serialization/Arrays", "ArrayOfKeyValueOfintArrayOfintty7Ep6D1");
    private final static QName _TimeStampFileFormat_QNAME = new QName("http://schemas.datacontract.org/2004/07/SIAV.Archiflow.Entities.Types", "TimeStampFileFormat");
    private final static QName _NoRightsFault_QNAME = new QName("http://schemas.datacontract.org/2004/07/SIAV.Archiflow.Faults", "NoRightsFault");
    private final static QName _AuthenticationType_QNAME = new QName("http://schemas.datacontract.org/2004/07/SIAV.Archiflow.Entities.Types", "AuthenticationType");
    private final static QName _Color_QNAME = new QName("http://schemas.datacontract.org/2004/07/System.Drawing", "Color");
    private final static QName _MailInHeaders_QNAME = new QName("http://schemas.datacontract.org/2004/07/SIAV.Archiflow.Entities.ExternalMail.ValueObject", "MailInHeaders");
    private final static QName _AgrafEntityId_QNAME = new QName("http://schemas.datacontract.org/2004/07/SIAV.Archiflow.Entities.Agraf.ValueObject", "AgrafEntityId");
    private final static QName _User_QNAME = new QName("http://schemas.datacontract.org/2004/07/SIAV.Archiflow.Entities.Chart.ValueObject", "User");
    private final static QName _FileTypes_QNAME = new QName("http://schemas.datacontract.org/2004/07/SIAV.Archiflow.Entities.Types", "FileTypes");
    private final static QName _GetCustomMailFieldsInput_QNAME = new QName("http://schemas.datacontract.org/2004/07/SIAV.Archiflow.Entities.ExternalMail.ValueObject", "GetCustomMailFieldsInput");
    private final static QName _EmailAttChunkParamOut_QNAME = new QName("http://schemas.datacontract.org/2004/07/SIAV.Archiflow.Entities.ExternalMail.ValueObject", "EmailAttChunkParamOut");
    private final static QName _ProtocolMainDocType_QNAME = new QName("http://schemas.datacontract.org/2004/07/SIAV.Archiflow.Entities.Types", "ProtocolMainDocType");
    private final static QName _ParamValidationFault_QNAME = new QName("http://schemas.datacontract.org/2004/07/SIAV.Archiflow.Faults", "ParamValidationFault");
    private final static QName _ArrayOfMessageIdentifier_QNAME = new QName("http://schemas.datacontract.org/2004/07/SIAV.Archiflow.Entities.ExternalMail.ValueObject", "ArrayOfMessageIdentifier");
    private final static QName _InsModMailBoxOutput_QNAME = new QName("http://schemas.datacontract.org/2004/07/SIAV.Archiflow.Entities.ExternalMail.ValueObject", "InsModMailBoxOutput");
    private final static QName _RemoveEmailsOutput_QNAME = new QName("http://schemas.datacontract.org/2004/07/SIAV.Archiflow.Entities.ExternalMail.ValueObject", "RemoveEmailsOutput");
    private final static QName _ExtendedEMailOptions_QNAME = new QName("http://schemas.datacontract.org/2004/07/SIAV.Archiflow.Entities.Card.ValueObject", "ExtendedEMailOptions");
    private final static QName _MailOut_QNAME = new QName("http://schemas.datacontract.org/2004/07/SIAV.Archiflow.Entities.ExternalMail.ValueObject", "MailOut");
    private final static QName _String_QNAME = new QName("http://schemas.microsoft.com/2003/10/Serialization/", "string");
    private final static QName _GetMailBoxesOutput_QNAME = new QName("http://schemas.datacontract.org/2004/07/SIAV.Archiflow.Entities.ExternalMail.ValueObject", "GetMailBoxesOutput");
    private final static QName _MailFault_QNAME = new QName("http://schemas.datacontract.org/2004/07/SIAV.Archiflow.Faults", "MailFault");
    private final static QName _BaseOutput_QNAME = new QName("http://schemas.datacontract.org/2004/07/SIAV.Archiflow.Entities", "BaseOutput");
    private final static QName _EMailType_QNAME = new QName("http://schemas.datacontract.org/2004/07/SIAV.Archiflow.Entities.Types", "EMailType");
    private final static QName _RetrieveEmailInput_QNAME = new QName("http://schemas.datacontract.org/2004/07/SIAV.Archiflow.Entities.ExternalMail.ValueObject", "RetrieveEmailInput");
    private final static QName _ControlType_QNAME = new QName("http://schemas.datacontract.org/2004/07/SIAV.Archiflow.Entities.Types", "ControlType");
    private final static QName _SearchMailInCriteria_QNAME = new QName("http://schemas.datacontract.org/2004/07/SIAV.Archiflow.Entities.ExternalMail.ValueObject", "SearchMailInCriteria");
    private final static QName _MemberInfo_QNAME = new QName("http://schemas.datacontract.org/2004/07/SIAV.Archiflow.Entities.Invoice.ValueObject", "MemberInfo");
    private final static QName _ArrayOfExternNotificationOffice_QNAME = new QName("http://schemas.datacontract.org/2004/07/SIAV.Archiflow.Entities.ExternNotifications.ValueObject", "ArrayOfExternNotificationOffice");
    private final static QName _History_QNAME = new QName("http://schemas.datacontract.org/2004/07/SIAV.Archiflow.Entities.Card.ValueObject", "History");
    private final static QName _UserLoginType_QNAME = new QName("http://schemas.datacontract.org/2004/07/SIAV.Archiflow.Entities.Types", "UserLoginType");
    private final static QName _Long_QNAME = new QName("http://schemas.microsoft.com/2003/10/Serialization/", "long");
    private final static QName _CardNotFoundFault_QNAME = new QName("http://schemas.datacontract.org/2004/07/SIAV.Archiflow.Faults", "CardNotFoundFault");
    private final static QName _GetProxiesOutput_QNAME = new QName("http://schemas.datacontract.org/2004/07/SIAV.Archiflow.Entities.ExternalMail.ValueObject", "GetProxiesOutput");
    private final static QName _BaseInput_QNAME = new QName("http://schemas.datacontract.org/2004/07/SIAV.Archiflow.Entities", "BaseInput");
    private final static QName _Field_QNAME = new QName("http://schemas.datacontract.org/2004/07/SIAV.Archiflow.Entities.Card.ValueObject", "Field");
    private final static QName _ExternNotificationOffice_QNAME = new QName("http://schemas.datacontract.org/2004/07/SIAV.Archiflow.Entities.ExternNotifications.ValueObject", "ExternNotificationOffice");
    private final static QName _SendFolderByExternalMailOutput_QNAME = new QName("http://schemas.datacontract.org/2004/07/SIAV.Archiflow.Entities.ExternalMail.ValueObject", "SendFolderByExternalMailOutput");
    private final static QName _RetrieveEmailOutput_QNAME = new QName("http://schemas.datacontract.org/2004/07/SIAV.Archiflow.Entities.ExternalMail.ValueObject", "RetrieveEmailOutput");
    private final static QName _RemoveEmailsInput_QNAME = new QName("http://schemas.datacontract.org/2004/07/SIAV.Archiflow.Entities.ExternalMail.ValueObject", "RemoveEmailsInput");
    private final static QName _ArrayOfguid_QNAME = new QName("http://schemas.microsoft.com/2003/10/Serialization/Arrays", "ArrayOfguid");
    private final static QName _SdiReceipt_QNAME = new QName("http://schemas.datacontract.org/2004/07/SIAV.Archiflow.Entities.Invoice.ValueObject", "SdiReceipt");
    private final static QName _ArrayOfProxy_QNAME = new QName("http://schemas.datacontract.org/2004/07/SIAV.Archiflow.Entities.MailBox.ValueObject", "ArrayOfProxy");
    private final static QName _Double_QNAME = new QName("http://schemas.microsoft.com/2003/10/Serialization/", "double");
    private final static QName _PECReceiptType_QNAME = new QName("http://schemas.datacontract.org/2004/07/SIAV.Archiflow.Entities.Types", "PECReceiptType");
    private final static QName _DeleteMailBoxInput_QNAME = new QName("http://schemas.datacontract.org/2004/07/SIAV.Archiflow.Entities.ExternalMail.ValueObject", "DeleteMailBoxInput");
    private final static QName _ExternNotification_QNAME = new QName("http://schemas.datacontract.org/2004/07/SIAV.Archiflow.Entities.ExternNotifications.ValueObject", "ExternNotification");
    private final static QName _InsModMailServerOutput_QNAME = new QName("http://schemas.datacontract.org/2004/07/SIAV.Archiflow.Entities.ExternalMail.ValueObject", "InsModMailServerOutput");
    private final static QName _CardOperationsFromList_QNAME = new QName("http://schemas.datacontract.org/2004/07/SIAV.Archiflow.Types", "CardOperationsFromList");
    private final static QName _GetEmailAttInChunkInput_QNAME = new QName("http://schemas.datacontract.org/2004/07/SIAV.Archiflow.Entities.ExternalMail.ValueObject", "GetEmailAttInChunkInput");
    private final static QName _ArrayOfAnnotation_QNAME = new QName("http://schemas.datacontract.org/2004/07/SIAV.Archiflow.Entities.Card.ValueObject", "ArrayOfAnnotation");
    private final static QName _InsModMailServerInput_QNAME = new QName("http://schemas.datacontract.org/2004/07/SIAV.Archiflow.Entities.ExternalMail.ValueObject", "InsModMailServerInput");
    private final static QName _QName_QNAME = new QName("http://schemas.microsoft.com/2003/10/Serialization/", "QName");
    private final static QName _SendHiddenExtEMailOutput_QNAME = new QName("http://schemas.datacontract.org/2004/07/SIAV.Archiflow.Entities.ExternalMail.ValueObject", "SendHiddenExtEMailOutput");
    private final static QName _SendEMailMsgOutput_QNAME = new QName("http://schemas.datacontract.org/2004/07/SIAV.Archiflow.Entities.ExternalMail.ValueObject", "SendEMailMsgOutput");
    private final static QName _EmailsOrderBy_QNAME = new QName("http://schemas.datacontract.org/2004/07/SIAV.Archiflow.Entities.Types", "EmailsOrderBy");
    private final static QName _ExternalAttachment_QNAME = new QName("http://schemas.datacontract.org/2004/07/SIAV.Archiflow.Entities.Card.ValueObject", "ExternalAttachment");
    private final static QName _GetIndexesToStoreEmailOutput_QNAME = new QName("http://schemas.datacontract.org/2004/07/SIAV.Archiflow.Entities.ExternalMail.ValueObject", "GetIndexesToStoreEmailOutput");
    private final static QName _SetMailboxPasswordsOutput_QNAME = new QName("http://schemas.datacontract.org/2004/07/SIAV.Archiflow.Entities.ExternalMail.ValueObject", "SetMailboxPasswordsOutput");
    private final static QName _GroupChart_QNAME = new QName("http://schemas.datacontract.org/2004/07/SIAV.Archiflow.Entities.Chart.ValueObject", "GroupChart");
    private final static QName _SendExternalMailOutput_QNAME = new QName("http://schemas.datacontract.org/2004/07/SIAV.Archiflow.Entities.ExternalMail.ValueObject", "SendExternalMailOutput");
    private final static QName _ArrayOfAttachment_QNAME = new QName("http://schemas.datacontract.org/2004/07/SIAV.Archiflow.Entities.Card.ValueObject", "ArrayOfAttachment");
    private final static QName _CardHasData_QNAME = new QName("http://schemas.datacontract.org/2004/07/SIAV.Archiflow.Entities.Card.ValueObject", "CardHasData");
    private final static QName _AuthMechanism_QNAME = new QName("http://schemas.datacontract.org/2004/07/SIAV.Archiflow.Entities.Types", "AuthMechanism");
    private final static QName _ArrayOfMailAttachment_QNAME = new QName("http://schemas.datacontract.org/2004/07/SIAV.Archiflow.Entities.ExternalMail.ValueObject", "ArrayOfMailAttachment");
    private final static QName _EmailAttChunkParamIn_QNAME = new QName("http://schemas.datacontract.org/2004/07/SIAV.Archiflow.Entities.ExternalMail.ValueObject", "EmailAttChunkParamIn");
    private final static QName _MailServer_QNAME = new QName("http://schemas.datacontract.org/2004/07/SIAV.Archiflow.Entities.MailBox.ValueObject", "MailServer");
    private final static QName _Office_QNAME = new QName("http://schemas.datacontract.org/2004/07/SIAV.Archiflow.Entities.Chart.ValueObject", "Office");
    private final static QName _Entity_QNAME = new QName("http://schemas.datacontract.org/2004/07/SIAV.Archiflow.Entities.Chart.ValueObject", "Entity");
    private final static QName _ArrayOfOffice_QNAME = new QName("http://schemas.datacontract.org/2004/07/SIAV.Archiflow.Entities.Chart.ValueObject", "ArrayOfOffice");
    private final static QName _DeleteMailServerInput_QNAME = new QName("http://schemas.datacontract.org/2004/07/SIAV.Archiflow.Entities.ExternalMail.ValueObject", "DeleteMailServerInput");
    private final static QName _DeleteMailBoxOutput_QNAME = new QName("http://schemas.datacontract.org/2004/07/SIAV.Archiflow.Entities.ExternalMail.ValueObject", "DeleteMailBoxOutput");
    private final static QName _Language_QNAME = new QName("http://schemas.datacontract.org/2004/07/SIAV.Archiflow.Entities.Types", "Language");
    private final static QName _OfficeChart_QNAME = new QName("http://schemas.datacontract.org/2004/07/SIAV.Archiflow.Entities.Chart.ValueObject", "OfficeChart");
    private final static QName _IdField_QNAME = new QName("http://schemas.datacontract.org/2004/07/SIAV.Archiflow.Entities.Types", "IdField");
    private final static QName _MailAddress_QNAME = new QName("http://schemas.datacontract.org/2004/07/SIAV.Archiflow.Entities.ExternalMail.ValueObject", "MailAddress");
    private final static QName _EmailAttSignStatus_QNAME = new QName("http://schemas.datacontract.org/2004/07/SIAV.Archiflow.Entities.Types", "EmailAttSignStatus");
    private final static QName _ProxyType_QNAME = new QName("http://schemas.datacontract.org/2004/07/SIAV.Archiflow.Entities.Types", "ProxyType");
    private final static QName _UnsignedLong_QNAME = new QName("http://schemas.microsoft.com/2003/10/Serialization/", "unsignedLong");
    private final static QName _ExternNotificationUsers_QNAME = new QName("http://schemas.datacontract.org/2004/07/SIAV.Archiflow.Entities.ExternNotifications.ValueObject", "ExternNotificationUsers");
    private final static QName _GetIndexesToStoreEmailInput_QNAME = new QName("http://schemas.datacontract.org/2004/07/SIAV.Archiflow.Entities.ExternalMail.ValueObject", "GetIndexesToStoreEmailInput");

    /**
     * Create a new ObjectFactory that can be used to create new instances of schema derived classes for package: it.archiflow93.email
     * 
     */
    public ObjectFactory() {
    }

    /**
     * Create an instance of {@link SendExtendedMailResponse }
     * 
     */
    public SendExtendedMailResponse createSendExtendedMailResponse() {
        return new SendExtendedMailResponse();
    }

    /**
     * Create an instance of {@link InvalidSessionFault }
     * 
     */
    public InvalidSessionFault createInvalidSessionFault() {
        return new InvalidSessionFault();
    }

    /**
     * Create an instance of {@link RetrieveEmails }
     * 
     */
    public RetrieveEmails createRetrieveEmails() {
        return new RetrieveEmails();
    }

    /**
     * Create an instance of {@link ArrayOfguid }
     * 
     */
    public ArrayOfguid createArrayOfguid() {
        return new ArrayOfguid();
    }

    /**
     * Create an instance of {@link ExternNotificationUsers }
     * 
     */
    public ExternNotificationUsers createExternNotificationUsers() {
        return new ExternNotificationUsers();
    }

    /**
     * Create an instance of {@link MailInHeaders }
     * 
     */
    public MailInHeaders createMailInHeaders() {
        return new MailInHeaders();
    }

    /**
     * Create an instance of {@link GetEmailAttInChunkInput }
     * 
     */
    public GetEmailAttInChunkInput createGetEmailAttInChunkInput() {
        return new GetEmailAttInChunkInput();
    }

    /**
     * Create an instance of {@link Proxy }
     * 
     */
    public Proxy createProxy() {
        return new Proxy();
    }

    /**
     * Create an instance of {@link Annotation }
     * 
     */
    public Annotation createAnnotation() {
        return new Annotation();
    }

    /**
     * Create an instance of {@link ArrayOfAttachment }
     * 
     */
    public ArrayOfAttachment createArrayOfAttachment() {
        return new ArrayOfAttachment();
    }

    /**
     * Create an instance of {@link SendExtendedMail }
     * 
     */
    public SendExtendedMail createSendExtendedMail() {
        return new SendExtendedMail();
    }

    /**
     * Create an instance of {@link Attachment }
     * 
     */
    public Attachment createAttachment() {
        return new Attachment();
    }

    /**
     * Create an instance of {@link GetIndexesToStoreEmailInput }
     * 
     */
    public GetIndexesToStoreEmailInput createGetIndexesToStoreEmailInput() {
        return new GetIndexesToStoreEmailInput();
    }

    /**
     * Create an instance of {@link GetMailServers }
     * 
     */
    public GetMailServers createGetMailServers() {
        return new GetMailServers();
    }

    /**
     * Create an instance of {@link ArrayOfExternNotificationOffice }
     * 
     */
    public ArrayOfExternNotificationOffice createArrayOfExternNotificationOffice() {
        return new ArrayOfExternNotificationOffice();
    }

    /**
     * Create an instance of {@link MailOut }
     * 
     */
    public MailOut createMailOut() {
        return new MailOut();
    }

    /**
     * Create an instance of {@link MailAddress }
     * 
     */
    public MailAddress createMailAddress() {
        return new MailAddress();
    }

    /**
     * Create an instance of {@link StoreEmailOutput }
     * 
     */
    public StoreEmailOutput createStoreEmailOutput() {
        return new StoreEmailOutput();
    }

    /**
     * Create an instance of {@link EmailAttChunkParamIn }
     * 
     */
    public EmailAttChunkParamIn createEmailAttChunkParamIn() {
        return new EmailAttChunkParamIn();
    }

    /**
     * Create an instance of {@link ArrayOfHistory }
     * 
     */
    public ArrayOfHistory createArrayOfHistory() {
        return new ArrayOfHistory();
    }

    /**
     * Create an instance of {@link RemoveEmailsOutput }
     * 
     */
    public RemoveEmailsOutput createRemoveEmailsOutput() {
        return new RemoveEmailsOutput();
    }

    /**
     * Create an instance of {@link GetCustomObject }
     * 
     */
    public GetCustomObject createGetCustomObject() {
        return new GetCustomObject();
    }

    /**
     * Create an instance of {@link MailBoxInvoiceCfg }
     * 
     */
    public MailBoxInvoiceCfg createMailBoxInvoiceCfg() {
        return new MailBoxInvoiceCfg();
    }

    /**
     * Create an instance of {@link GetExtMailSettingsInput }
     * 
     */
    public GetExtMailSettingsInput createGetExtMailSettingsInput() {
        return new GetExtMailSettingsInput();
    }

    /**
     * Create an instance of {@link SendFolderByExternalMail }
     * 
     */
    public SendFolderByExternalMail createSendFolderByExternalMail() {
        return new SendFolderByExternalMail();
    }

    /**
     * Create an instance of {@link StoreEmailResponse }
     * 
     */
    public StoreEmailResponse createStoreEmailResponse() {
        return new StoreEmailResponse();
    }

    /**
     * Create an instance of {@link ArrayOfMailInHeaders }
     * 
     */
    public ArrayOfMailInHeaders createArrayOfMailInHeaders() {
        return new ArrayOfMailInHeaders();
    }

    /**
     * Create an instance of {@link SendFolderByExternalMailOutput }
     * 
     */
    public SendFolderByExternalMailOutput createSendFolderByExternalMailOutput() {
        return new SendFolderByExternalMailOutput();
    }

    /**
     * Create an instance of {@link SendEMailMsg }
     * 
     */
    public SendEMailMsg createSendEMailMsg() {
        return new SendEMailMsg();
    }

    /**
     * Create an instance of {@link ValidLogCreatedFault }
     * 
     */
    public ValidLogCreatedFault createValidLogCreatedFault() {
        return new ValidLogCreatedFault();
    }

    /**
     * Create an instance of {@link GetExtMailSettings }
     * 
     */
    public GetExtMailSettings createGetExtMailSettings() {
        return new GetExtMailSettings();
    }

    /**
     * Create an instance of {@link BaseInput }
     * 
     */
    public BaseInput createBaseInput() {
        return new BaseInput();
    }

    /**
     * Create an instance of {@link SendEMailResponse }
     * 
     */
    public SendEMailResponse createSendEMailResponse() {
        return new SendEMailResponse();
    }

    /**
     * Create an instance of {@link GetCustomObjectResponse }
     * 
     */
    public GetCustomObjectResponse createGetCustomObjectResponse() {
        return new GetCustomObjectResponse();
    }

    /**
     * Create an instance of {@link NoModelFoundFault }
     * 
     */
    public NoModelFoundFault createNoModelFoundFault() {
        return new NoModelFoundFault();
    }

    /**
     * Create an instance of {@link DeleteProxyOutput }
     * 
     */
    public DeleteProxyOutput createDeleteProxyOutput() {
        return new DeleteProxyOutput();
    }

    /**
     * Create an instance of {@link Group }
     * 
     */
    public Group createGroup() {
        return new Group();
    }

    /**
     * Create an instance of {@link ArrayOfMailAttachment }
     * 
     */
    public ArrayOfMailAttachment createArrayOfMailAttachment() {
        return new ArrayOfMailAttachment();
    }

    /**
     * Create an instance of {@link RetrieveEmailsOutput }
     * 
     */
    public RetrieveEmailsOutput createRetrieveEmailsOutput() {
        return new RetrieveEmailsOutput();
    }

    /**
     * Create an instance of {@link GetExtMailSettingsOutput }
     * 
     */
    public GetExtMailSettingsOutput createGetExtMailSettingsOutput() {
        return new GetExtMailSettingsOutput();
    }

    /**
     * Create an instance of {@link CardBundle }
     * 
     */
    public CardBundle createCardBundle() {
        return new CardBundle();
    }

    /**
     * Create an instance of {@link GetIndexesToStoreEmailOutput }
     * 
     */
    public GetIndexesToStoreEmailOutput createGetIndexesToStoreEmailOutput() {
        return new GetIndexesToStoreEmailOutput();
    }

    /**
     * Create an instance of {@link GetMailBoxesOutput }
     * 
     */
    public GetMailBoxesOutput createGetMailBoxesOutput() {
        return new GetMailBoxesOutput();
    }

    /**
     * Create an instance of {@link TestMailboxConnectionResponse }
     * 
     */
    public TestMailboxConnectionResponse createTestMailboxConnectionResponse() {
        return new TestMailboxConnectionResponse();
    }

    /**
     * Create an instance of {@link GetIndexesToStoreEmail }
     * 
     */
    public GetIndexesToStoreEmail createGetIndexesToStoreEmail() {
        return new GetIndexesToStoreEmail();
    }

    /**
     * Create an instance of {@link Document }
     * 
     */
    public Document createDocument() {
        return new Document();
    }

    /**
     * Create an instance of {@link SendExternalMail }
     * 
     */
    public SendExternalMail createSendExternalMail() {
        return new SendExternalMail();
    }

    /**
     * Create an instance of {@link InsModMailBoxInput }
     * 
     */
    public InsModMailBoxInput createInsModMailBoxInput() {
        return new InsModMailBoxInput();
    }

    /**
     * Create an instance of {@link AgrafEntityId }
     * 
     */
    public AgrafEntityId createAgrafEntityId() {
        return new AgrafEntityId();
    }

    /**
     * Create an instance of {@link GetEmailAttInChunkResponse }
     * 
     */
    public GetEmailAttInChunkResponse createGetEmailAttInChunkResponse() {
        return new GetEmailAttInChunkResponse();
    }

    /**
     * Create an instance of {@link ArchiflowServiceExceptionDetail }
     * 
     */
    public ArchiflowServiceExceptionDetail createArchiflowServiceExceptionDetail() {
        return new ArchiflowServiceExceptionDetail();
    }

    /**
     * Create an instance of {@link SendHiddenExtEMailOutput }
     * 
     */
    public SendHiddenExtEMailOutput createSendHiddenExtEMailOutput() {
        return new SendHiddenExtEMailOutput();
    }

    /**
     * Create an instance of {@link GetMailServersResponse }
     * 
     */
    public GetMailServersResponse createGetMailServersResponse() {
        return new GetMailServersResponse();
    }

    /**
     * Create an instance of {@link EmailAttChunkParamOut }
     * 
     */
    public EmailAttChunkParamOut createEmailAttChunkParamOut() {
        return new EmailAttChunkParamOut();
    }

    /**
     * Create an instance of {@link PostingFault }
     * 
     */
    public PostingFault createPostingFault() {
        return new PostingFault();
    }

    /**
     * Create an instance of {@link UserRightsConfig }
     * 
     */
    public UserRightsConfig createUserRightsConfig() {
        return new UserRightsConfig();
    }

    /**
     * Create an instance of {@link Card }
     * 
     */
    public Card createCard() {
        return new Card();
    }

    /**
     * Create an instance of {@link EmailFault }
     * 
     */
    public EmailFault createEmailFault() {
        return new EmailFault();
    }

    /**
     * Create an instance of {@link RetrieveEmailResponse }
     * 
     */
    public RetrieveEmailResponse createRetrieveEmailResponse() {
        return new RetrieveEmailResponse();
    }

    /**
     * Create an instance of {@link MailFault }
     * 
     */
    public MailFault createMailFault() {
        return new MailFault();
    }

    /**
     * Create an instance of {@link GetMailServersInput }
     * 
     */
    public GetMailServersInput createGetMailServersInput() {
        return new GetMailServersInput();
    }

    /**
     * Create an instance of {@link XmlSelectNodeFault }
     * 
     */
    public XmlSelectNodeFault createXmlSelectNodeFault() {
        return new XmlSelectNodeFault();
    }

    /**
     * Create an instance of {@link DeleteMailServerOutput }
     * 
     */
    public DeleteMailServerOutput createDeleteMailServerOutput() {
        return new DeleteMailServerOutput();
    }

    /**
     * Create an instance of {@link RemoveEmailsInput }
     * 
     */
    public RemoveEmailsInput createRemoveEmailsInput() {
        return new RemoveEmailsInput();
    }

    /**
     * Create an instance of {@link DeleteProxyResponse }
     * 
     */
    public DeleteProxyResponse createDeleteProxyResponse() {
        return new DeleteProxyResponse();
    }

    /**
     * Create an instance of {@link SendEMailMsgInput }
     * 
     */
    public SendEMailMsgInput createSendEMailMsgInput() {
        return new SendEMailMsgInput();
    }

    /**
     * Create an instance of {@link DeleteMailBoxResponse }
     * 
     */
    public DeleteMailBoxResponse createDeleteMailBoxResponse() {
        return new DeleteMailBoxResponse();
    }

    /**
     * Create an instance of {@link MailIn }
     * 
     */
    public MailIn createMailIn() {
        return new MailIn();
    }

    /**
     * Create an instance of {@link ArrayOfOffice }
     * 
     */
    public ArrayOfOffice createArrayOfOffice() {
        return new ArrayOfOffice();
    }

    /**
     * Create an instance of {@link GetEmailAttInChunk }
     * 
     */
    public GetEmailAttInChunk createGetEmailAttInChunk() {
        return new GetEmailAttInChunk();
    }

    /**
     * Create an instance of {@link InsModProxyResponse }
     * 
     */
    public InsModProxyResponse createInsModProxyResponse() {
        return new InsModProxyResponse();
    }

    /**
     * Create an instance of {@link OperationFailedFault }
     * 
     */
    public OperationFailedFault createOperationFailedFault() {
        return new OperationFailedFault();
    }

    /**
     * Create an instance of {@link Color }
     * 
     */
    public Color createColor() {
        return new Color();
    }

    /**
     * Create an instance of {@link ArrayOfMessageIdentifier }
     * 
     */
    public ArrayOfMessageIdentifier createArrayOfMessageIdentifier() {
        return new ArrayOfMessageIdentifier();
    }

    /**
     * Create an instance of {@link ArrayOfKeyValueOfintArrayOfintty7Ep6D1 }
     * 
     */
    public ArrayOfKeyValueOfintArrayOfintty7Ep6D1 createArrayOfKeyValueOfintArrayOfintty7Ep6D1() {
        return new ArrayOfKeyValueOfintArrayOfintty7Ep6D1();
    }

    /**
     * Create an instance of {@link InsModMailServerResponse }
     * 
     */
    public InsModMailServerResponse createInsModMailServerResponse() {
        return new InsModMailServerResponse();
    }

    /**
     * Create an instance of {@link StoreEmailCard }
     * 
     */
    public StoreEmailCard createStoreEmailCard() {
        return new StoreEmailCard();
    }

    /**
     * Create an instance of {@link InsModMailServerInput }
     * 
     */
    public InsModMailServerInput createInsModMailServerInput() {
        return new InsModMailServerInput();
    }

    /**
     * Create an instance of {@link ExtEMailConfig }
     * 
     */
    public ExtEMailConfig createExtEMailConfig() {
        return new ExtEMailConfig();
    }

    /**
     * Create an instance of {@link DeleteMailBox }
     * 
     */
    public DeleteMailBox createDeleteMailBox() {
        return new DeleteMailBox();
    }

    /**
     * Create an instance of {@link TestMailboxConnectionInput }
     * 
     */
    public TestMailboxConnectionInput createTestMailboxConnectionInput() {
        return new TestMailboxConnectionInput();
    }

    /**
     * Create an instance of {@link OfficeChart }
     * 
     */
    public OfficeChart createOfficeChart() {
        return new OfficeChart();
    }

    /**
     * Create an instance of {@link VisibilityFault }
     * 
     */
    public VisibilityFault createVisibilityFault() {
        return new VisibilityFault();
    }

    /**
     * Create an instance of {@link DeleteMailBoxInput }
     * 
     */
    public DeleteMailBoxInput createDeleteMailBoxInput() {
        return new DeleteMailBoxInput();
    }

    /**
     * Create an instance of {@link ExtendedEMailOptions }
     * 
     */
    public ExtendedEMailOptions createExtendedEMailOptions() {
        return new ExtendedEMailOptions();
    }

    /**
     * Create an instance of {@link MemberInfo }
     * 
     */
    public MemberInfo createMemberInfo() {
        return new MemberInfo();
    }

    /**
     * Create an instance of {@link AgrafCardContactId }
     * 
     */
    public AgrafCardContactId createAgrafCardContactId() {
        return new AgrafCardContactId();
    }

    /**
     * Create an instance of {@link GetEmailAttInChunkOutput }
     * 
     */
    public GetEmailAttInChunkOutput createGetEmailAttInChunkOutput() {
        return new GetEmailAttInChunkOutput();
    }

    /**
     * Create an instance of {@link ExternalAttachment }
     * 
     */
    public ExternalAttachment createExternalAttachment() {
        return new ExternalAttachment();
    }

    /**
     * Create an instance of {@link ExternNotificationOffice }
     * 
     */
    public ExternNotificationOffice createExternNotificationOffice() {
        return new ExternNotificationOffice();
    }

    /**
     * Create an instance of {@link GetMailServersOutput }
     * 
     */
    public GetMailServersOutput createGetMailServersOutput() {
        return new GetMailServersOutput();
    }

    /**
     * Create an instance of {@link SearchMailInCriteria }
     * 
     */
    public SearchMailInCriteria createSearchMailInCriteria() {
        return new SearchMailInCriteria();
    }

    /**
     * Create an instance of {@link RetrieveEmail }
     * 
     */
    public RetrieveEmail createRetrieveEmail() {
        return new RetrieveEmail();
    }

    /**
     * Create an instance of {@link AgrafCard }
     * 
     */
    public AgrafCard createAgrafCard() {
        return new AgrafCard();
    }

    /**
     * Create an instance of {@link TestMailboxConnection }
     * 
     */
    public TestMailboxConnection createTestMailboxConnection() {
        return new TestMailboxConnection();
    }

    /**
     * Create an instance of {@link RemoveEmails }
     * 
     */
    public RemoveEmails createRemoveEmails() {
        return new RemoveEmails();
    }

    /**
     * Create an instance of {@link CardHasData }
     * 
     */
    public CardHasData createCardHasData() {
        return new CardHasData();
    }

    /**
     * Create an instance of {@link SetMailboxPasswordsResponse }
     * 
     */
    public SetMailboxPasswordsResponse createSetMailboxPasswordsResponse() {
        return new SetMailboxPasswordsResponse();
    }

    /**
     * Create an instance of {@link SendHiddenExtEMailResponse }
     * 
     */
    public SendHiddenExtEMailResponse createSendHiddenExtEMailResponse() {
        return new SendHiddenExtEMailResponse();
    }

    /**
     * Create an instance of {@link ArrayOfKeyValueOfintArrayOfintty7Ep6D1 .KeyValueOfintArrayOfintty7Ep6D1 }
     * 
     */
    public ArrayOfKeyValueOfintArrayOfintty7Ep6D1 .KeyValueOfintArrayOfintty7Ep6D1 createArrayOfKeyValueOfintArrayOfintty7Ep6D1KeyValueOfintArrayOfintty7Ep6D1() {
        return new ArrayOfKeyValueOfintArrayOfintty7Ep6D1 .KeyValueOfintArrayOfintty7Ep6D1();
    }

    /**
     * Create an instance of {@link StoreEmailAttachment }
     * 
     */
    public StoreEmailAttachment createStoreEmailAttachment() {
        return new StoreEmailAttachment();
    }

    /**
     * Create an instance of {@link ArrayOfanyType }
     * 
     */
    public ArrayOfanyType createArrayOfanyType() {
        return new ArrayOfanyType();
    }

    /**
     * Create an instance of {@link SetMailboxPasswordsOutput }
     * 
     */
    public SetMailboxPasswordsOutput createSetMailboxPasswordsOutput() {
        return new SetMailboxPasswordsOutput();
    }

    /**
     * Create an instance of {@link StoreEmailInput }
     * 
     */
    public StoreEmailInput createStoreEmailInput() {
        return new StoreEmailInput();
    }

    /**
     * Create an instance of {@link ArrayOfUser }
     * 
     */
    public ArrayOfUser createArrayOfUser() {
        return new ArrayOfUser();
    }

    /**
     * Create an instance of {@link LoggableBase }
     * 
     */
    public LoggableBase createLoggableBase() {
        return new LoggableBase();
    }

    /**
     * Create an instance of {@link MailAttachment }
     * 
     */
    public MailAttachment createMailAttachment() {
        return new MailAttachment();
    }

    /**
     * Create an instance of {@link SendExternalMailOutput }
     * 
     */
    public SendExternalMailOutput createSendExternalMailOutput() {
        return new SendExternalMailOutput();
    }

    /**
     * Create an instance of {@link GetMailBox }
     * 
     */
    public GetMailBox createGetMailBox() {
        return new GetMailBox();
    }

    /**
     * Create an instance of {@link DeleteProxy }
     * 
     */
    public DeleteProxy createDeleteProxy() {
        return new DeleteProxy();
    }

    /**
     * Create an instance of {@link ArrayOfGroup }
     * 
     */
    public ArrayOfGroup createArrayOfGroup() {
        return new ArrayOfGroup();
    }

    /**
     * Create an instance of {@link Entity }
     * 
     */
    public Entity createEntity() {
        return new Entity();
    }

    /**
     * Create an instance of {@link GetMailBoxes }
     * 
     */
    public GetMailBoxes createGetMailBoxes() {
        return new GetMailBoxes();
    }

    /**
     * Create an instance of {@link MailBox }
     * 
     */
    public MailBox createMailBox() {
        return new MailBox();
    }

    /**
     * Create an instance of {@link InsModProxy }
     * 
     */
    public InsModProxy createInsModProxy() {
        return new InsModProxy();
    }

    /**
     * Create an instance of {@link InvoiceIn }
     * 
     */
    public InvoiceIn createInvoiceIn() {
        return new InvoiceIn();
    }

    /**
     * Create an instance of {@link DeleteMailServerResponse }
     * 
     */
    public DeleteMailServerResponse createDeleteMailServerResponse() {
        return new DeleteMailServerResponse();
    }

    /**
     * Create an instance of {@link Additive }
     * 
     */
    public Additive createAdditive() {
        return new Additive();
    }

    /**
     * Create an instance of {@link GetProxiesInput }
     * 
     */
    public GetProxiesInput createGetProxiesInput() {
        return new GetProxiesInput();
    }

    /**
     * Create an instance of {@link InvoiceBase }
     * 
     */
    public InvoiceBase createInvoiceBase() {
        return new InvoiceBase();
    }

    /**
     * Create an instance of {@link GetMailBoxesInput }
     * 
     */
    public GetMailBoxesInput createGetMailBoxesInput() {
        return new GetMailBoxesInput();
    }

    /**
     * Create an instance of {@link InsModMailServerOutput }
     * 
     */
    public InsModMailServerOutput createInsModMailServerOutput() {
        return new InsModMailServerOutput();
    }

    /**
     * Create an instance of {@link ArrayOfOfficeChart }
     * 
     */
    public ArrayOfOfficeChart createArrayOfOfficeChart() {
        return new ArrayOfOfficeChart();
    }

    /**
     * Create an instance of {@link BaseFault }
     * 
     */
    public BaseFault createBaseFault() {
        return new BaseFault();
    }

    /**
     * Create an instance of {@link MaxLimitFault }
     * 
     */
    public MaxLimitFault createMaxLimitFault() {
        return new MaxLimitFault();
    }

    /**
     * Create an instance of {@link ArrayOfMailBox }
     * 
     */
    public ArrayOfMailBox createArrayOfMailBox() {
        return new ArrayOfMailBox();
    }

    /**
     * Create an instance of {@link CardExpirationInfo }
     * 
     */
    public CardExpirationInfo createCardExpirationInfo() {
        return new CardExpirationInfo();
    }

    /**
     * Create an instance of {@link GetCustomMailFields }
     * 
     */
    public GetCustomMailFields createGetCustomMailFields() {
        return new GetCustomMailFields();
    }

    /**
     * Create an instance of {@link RetrieveEmailsInput }
     * 
     */
    public RetrieveEmailsInput createRetrieveEmailsInput() {
        return new RetrieveEmailsInput();
    }

    /**
     * Create an instance of {@link SendFolderByExternalMailResponse }
     * 
     */
    public SendFolderByExternalMailResponse createSendFolderByExternalMailResponse() {
        return new SendFolderByExternalMailResponse();
    }

    /**
     * Create an instance of {@link MailServer }
     * 
     */
    public MailServer createMailServer() {
        return new MailServer();
    }

    /**
     * Create an instance of {@link ArrayOfstring }
     * 
     */
    public ArrayOfstring createArrayOfstring() {
        return new ArrayOfstring();
    }

    /**
     * Create an instance of {@link User }
     * 
     */
    public User createUser() {
        return new User();
    }

    /**
     * Create an instance of {@link Office }
     * 
     */
    public Office createOffice() {
        return new Office();
    }

    /**
     * Create an instance of {@link GetIndexesToStoreEmailResponse }
     * 
     */
    public GetIndexesToStoreEmailResponse createGetIndexesToStoreEmailResponse() {
        return new GetIndexesToStoreEmailResponse();
    }

    /**
     * Create an instance of {@link GetExtMailSettingsResponse }
     * 
     */
    public GetExtMailSettingsResponse createGetExtMailSettingsResponse() {
        return new GetExtMailSettingsResponse();
    }

    /**
     * Create an instance of {@link GetProxiesOutput }
     * 
     */
    public GetProxiesOutput createGetProxiesOutput() {
        return new GetProxiesOutput();
    }

    /**
     * Create an instance of {@link GetProxiesResponse }
     * 
     */
    public GetProxiesResponse createGetProxiesResponse() {
        return new GetProxiesResponse();
    }

    /**
     * Create an instance of {@link GetMailBoxResponse }
     * 
     */
    public GetMailBoxResponse createGetMailBoxResponse() {
        return new GetMailBoxResponse();
    }

    /**
     * Create an instance of {@link SdiInfo }
     * 
     */
    public SdiInfo createSdiInfo() {
        return new SdiInfo();
    }

    /**
     * Create an instance of {@link ExternNotification }
     * 
     */
    public ExternNotification createExternNotification() {
        return new ExternNotification();
    }

    /**
     * Create an instance of {@link ArrayOfMailAddress }
     * 
     */
    public ArrayOfMailAddress createArrayOfMailAddress() {
        return new ArrayOfMailAddress();
    }

    /**
     * Create an instance of {@link ArrayOfStoreEmailAttachment }
     * 
     */
    public ArrayOfStoreEmailAttachment createArrayOfStoreEmailAttachment() {
        return new ArrayOfStoreEmailAttachment();
    }

    /**
     * Create an instance of {@link SendEMail }
     * 
     */
    public SendEMail createSendEMail() {
        return new SendEMail();
    }

    /**
     * Create an instance of {@link AgrafCardContact }
     * 
     */
    public AgrafCardContact createAgrafCardContact() {
        return new AgrafCardContact();
    }

    /**
     * Create an instance of {@link SendEMailMsgResponse }
     * 
     */
    public SendEMailMsgResponse createSendEMailMsgResponse() {
        return new SendEMailMsgResponse();
    }

    /**
     * Create an instance of {@link SendExtendedMailInput }
     * 
     */
    public SendExtendedMailInput createSendExtendedMailInput() {
        return new SendExtendedMailInput();
    }

    /**
     * Create an instance of {@link GroupChart }
     * 
     */
    public GroupChart createGroupChart() {
        return new GroupChart();
    }

    /**
     * Create an instance of {@link RemoveEmailsResponse }
     * 
     */
    public RemoveEmailsResponse createRemoveEmailsResponse() {
        return new RemoveEmailsResponse();
    }

    /**
     * Create an instance of {@link DeleteProxyInput }
     * 
     */
    public DeleteProxyInput createDeleteProxyInput() {
        return new DeleteProxyInput();
    }

    /**
     * Create an instance of {@link ArrayOfint }
     * 
     */
    public ArrayOfint createArrayOfint() {
        return new ArrayOfint();
    }

    /**
     * Create an instance of {@link ArrayOfUserRight }
     * 
     */
    public ArrayOfUserRight createArrayOfUserRight() {
        return new ArrayOfUserRight();
    }

    /**
     * Create an instance of {@link InvoiceOut }
     * 
     */
    public InvoiceOut createInvoiceOut() {
        return new InvoiceOut();
    }

    /**
     * Create an instance of {@link ArrayOfAdditive }
     * 
     */
    public ArrayOfAdditive createArrayOfAdditive() {
        return new ArrayOfAdditive();
    }

    /**
     * Create an instance of {@link InsModMailServer }
     * 
     */
    public InsModMailServer createInsModMailServer() {
        return new InsModMailServer();
    }

    /**
     * Create an instance of {@link RetrieveEmailsResponse }
     * 
     */
    public RetrieveEmailsResponse createRetrieveEmailsResponse() {
        return new RetrieveEmailsResponse();
    }

    /**
     * Create an instance of {@link DeleteMailServer }
     * 
     */
    public DeleteMailServer createDeleteMailServer() {
        return new DeleteMailServer();
    }

    /**
     * Create an instance of {@link XmlSchemaValidationFault }
     * 
     */
    public XmlSchemaValidationFault createXmlSchemaValidationFault() {
        return new XmlSchemaValidationFault();
    }

    /**
     * Create an instance of {@link ArrayOfClassificationFolder }
     * 
     */
    public ArrayOfClassificationFolder createArrayOfClassificationFolder() {
        return new ArrayOfClassificationFolder();
    }

    /**
     * Create an instance of {@link Field }
     * 
     */
    public Field createField() {
        return new Field();
    }

    /**
     * Create an instance of {@link SetMailboxPasswordsInput }
     * 
     */
    public SetMailboxPasswordsInput createSetMailboxPasswordsInput() {
        return new SetMailboxPasswordsInput();
    }

    /**
     * Create an instance of {@link GetCustomMailFieldsResponse }
     * 
     */
    public GetCustomMailFieldsResponse createGetCustomMailFieldsResponse() {
        return new GetCustomMailFieldsResponse();
    }

    /**
     * Create an instance of {@link MessageIdentifier }
     * 
     */
    public MessageIdentifier createMessageIdentifier() {
        return new MessageIdentifier();
    }

    /**
     * Create an instance of {@link SendHiddenExtEMailInput }
     * 
     */
    public SendHiddenExtEMailInput createSendHiddenExtEMailInput() {
        return new SendHiddenExtEMailInput();
    }

    /**
     * Create an instance of {@link ClassificationFolder }
     * 
     */
    public ClassificationFolder createClassificationFolder() {
        return new ClassificationFolder();
    }

    /**
     * Create an instance of {@link CardNotFoundFault }
     * 
     */
    public CardNotFoundFault createCardNotFoundFault() {
        return new CardNotFoundFault();
    }

    /**
     * Create an instance of {@link GetCustomMailFieldsInput }
     * 
     */
    public GetCustomMailFieldsInput createGetCustomMailFieldsInput() {
        return new GetCustomMailFieldsInput();
    }

    /**
     * Create an instance of {@link UserRight }
     * 
     */
    public UserRight createUserRight() {
        return new UserRight();
    }

    /**
     * Create an instance of {@link DeleteMailServerInput }
     * 
     */
    public DeleteMailServerInput createDeleteMailServerInput() {
        return new DeleteMailServerInput();
    }

    /**
     * Create an instance of {@link DeleteMailBoxOutput }
     * 
     */
    public DeleteMailBoxOutput createDeleteMailBoxOutput() {
        return new DeleteMailBoxOutput();
    }

    /**
     * Create an instance of {@link TestMailboxConnectionOutput }
     * 
     */
    public TestMailboxConnectionOutput createTestMailboxConnectionOutput() {
        return new TestMailboxConnectionOutput();
    }

    /**
     * Create an instance of {@link History }
     * 
     */
    public History createHistory() {
        return new History();
    }

    /**
     * Create an instance of {@link ArrayOfField }
     * 
     */
    public ArrayOfField createArrayOfField() {
        return new ArrayOfField();
    }

    /**
     * Create an instance of {@link SdiReceipt }
     * 
     */
    public SdiReceipt createSdiReceipt() {
        return new SdiReceipt();
    }

    /**
     * Create an instance of {@link ParamValidationFault }
     * 
     */
    public ParamValidationFault createParamValidationFault() {
        return new ParamValidationFault();
    }

    /**
     * Create an instance of {@link ArrayOfAnnotation }
     * 
     */
    public ArrayOfAnnotation createArrayOfAnnotation() {
        return new ArrayOfAnnotation();
    }

    /**
     * Create an instance of {@link RetrieveEmailOutput }
     * 
     */
    public RetrieveEmailOutput createRetrieveEmailOutput() {
        return new RetrieveEmailOutput();
    }

    /**
     * Create an instance of {@link InternalAttachment }
     * 
     */
    public InternalAttachment createInternalAttachment() {
        return new InternalAttachment();
    }

    /**
     * Create an instance of {@link BaseOutput }
     * 
     */
    public BaseOutput createBaseOutput() {
        return new BaseOutput();
    }

    /**
     * Create an instance of {@link ArrayOfAgrafCardContact }
     * 
     */
    public ArrayOfAgrafCardContact createArrayOfAgrafCardContact() {
        return new ArrayOfAgrafCardContact();
    }

    /**
     * Create an instance of {@link NoRightsFault }
     * 
     */
    public NoRightsFault createNoRightsFault() {
        return new NoRightsFault();
    }

    /**
     * Create an instance of {@link GetProxies }
     * 
     */
    public GetProxies createGetProxies() {
        return new GetProxies();
    }

    /**
     * Create an instance of {@link NoDataFoundFault }
     * 
     */
    public NoDataFoundFault createNoDataFoundFault() {
        return new NoDataFoundFault();
    }

    /**
     * Create an instance of {@link SendExternalMailResponse }
     * 
     */
    public SendExternalMailResponse createSendExternalMailResponse() {
        return new SendExternalMailResponse();
    }

    /**
     * Create an instance of {@link GetMailBoxesResponse }
     * 
     */
    public GetMailBoxesResponse createGetMailBoxesResponse() {
        return new GetMailBoxesResponse();
    }

    /**
     * Create an instance of {@link InsModProxyInput }
     * 
     */
    public InsModProxyInput createInsModProxyInput() {
        return new InsModProxyInput();
    }

    /**
     * Create an instance of {@link InsModProxyOutput }
     * 
     */
    public InsModProxyOutput createInsModProxyOutput() {
        return new InsModProxyOutput();
    }

    /**
     * Create an instance of {@link SendEMailMsgOutput }
     * 
     */
    public SendEMailMsgOutput createSendEMailMsgOutput() {
        return new SendEMailMsgOutput();
    }

    /**
     * Create an instance of {@link RetrieveEmailInput }
     * 
     */
    public RetrieveEmailInput createRetrieveEmailInput() {
        return new RetrieveEmailInput();
    }

    /**
     * Create an instance of {@link ArrayOfAgrafCard }
     * 
     */
    public ArrayOfAgrafCard createArrayOfAgrafCard() {
        return new ArrayOfAgrafCard();
    }

    /**
     * Create an instance of {@link SendExternalMailInput }
     * 
     */
    public SendExternalMailInput createSendExternalMailInput() {
        return new SendExternalMailInput();
    }

    /**
     * Create an instance of {@link SendExtendedMailOutput }
     * 
     */
    public SendExtendedMailOutput createSendExtendedMailOutput() {
        return new SendExtendedMailOutput();
    }

    /**
     * Create an instance of {@link SendHiddenExtEMail }
     * 
     */
    public SendHiddenExtEMail createSendHiddenExtEMail() {
        return new SendHiddenExtEMail();
    }

    /**
     * Create an instance of {@link InsModMailBox }
     * 
     */
    public InsModMailBox createInsModMailBox() {
        return new InsModMailBox();
    }

    /**
     * Create an instance of {@link InsModMailBoxOutput }
     * 
     */
    public InsModMailBoxOutput createInsModMailBoxOutput() {
        return new InsModMailBoxOutput();
    }

    /**
     * Create an instance of {@link ArrayOfMailServer }
     * 
     */
    public ArrayOfMailServer createArrayOfMailServer() {
        return new ArrayOfMailServer();
    }

    /**
     * Create an instance of {@link SessionInfo }
     * 
     */
    public SessionInfo createSessionInfo() {
        return new SessionInfo();
    }

    /**
     * Create an instance of {@link Operation }
     * 
     */
    public Operation createOperation() {
        return new Operation();
    }

    /**
     * Create an instance of {@link ArrayOfProxy }
     * 
     */
    public ArrayOfProxy createArrayOfProxy() {
        return new ArrayOfProxy();
    }

    /**
     * Create an instance of {@link StoreEmail }
     * 
     */
    public StoreEmail createStoreEmail() {
        return new StoreEmail();
    }

    /**
     * Create an instance of {@link SendFolderByExternalMailInput }
     * 
     */
    public SendFolderByExternalMailInput createSendFolderByExternalMailInput() {
        return new SendFolderByExternalMailInput();
    }

    /**
     * Create an instance of {@link InsModMailBoxResponse }
     * 
     */
    public InsModMailBoxResponse createInsModMailBoxResponse() {
        return new InsModMailBoxResponse();
    }

    /**
     * Create an instance of {@link GetCustomMailFieldsOutput }
     * 
     */
    public GetCustomMailFieldsOutput createGetCustomMailFieldsOutput() {
        return new GetCustomMailFieldsOutput();
    }

    /**
     * Create an instance of {@link CardOperationsFromList }
     * 
     */
    public CardOperationsFromList createCardOperationsFromList() {
        return new CardOperationsFromList();
    }

    /**
     * Create an instance of {@link SetMailboxPasswords }
     * 
     */
    public SetMailboxPasswords createSetMailboxPasswords() {
        return new SetMailboxPasswords();
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link GetMailServersInput }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://schemas.datacontract.org/2004/07/SIAV.Archiflow.Entities.ExternalMail.ValueObject", name = "GetMailServersInput")
    public JAXBElement<GetMailServersInput> createGetMailServersInput(GetMailServersInput value) {
        return new JAXBElement<GetMailServersInput>(_GetMailServersInput_QNAME, GetMailServersInput.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link DocumentStatus }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://schemas.datacontract.org/2004/07/SIAV.Archiflow.Entities.Types", name = "DocumentStatus")
    public JAXBElement<DocumentStatus> createDocumentStatus(DocumentStatus value) {
        return new JAXBElement<DocumentStatus>(_DocumentStatus_QNAME, DocumentStatus.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link InvoiceIn }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://schemas.datacontract.org/2004/07/SIAV.Archiflow.Entities.Invoice.ValueObject", name = "InvoiceIn")
    public JAXBElement<InvoiceIn> createInvoiceIn(InvoiceIn value) {
        return new JAXBElement<InvoiceIn>(_InvoiceIn_QNAME, InvoiceIn.class, null, value);
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
     * Create an instance of {@link JAXBElement }{@code <}{@link GetExtMailSettingsInput }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://schemas.datacontract.org/2004/07/SIAV.Archiflow.Entities.ExternalMail.ValueObject", name = "GetExtMailSettingsInput")
    public JAXBElement<GetExtMailSettingsInput> createGetExtMailSettingsInput(GetExtMailSettingsInput value) {
        return new JAXBElement<GetExtMailSettingsInput>(_GetExtMailSettingsInput_QNAME, GetExtMailSettingsInput.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link SdiInfo }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://schemas.datacontract.org/2004/07/SIAV.Archiflow.Entities.Invoice.ValueObject", name = "SdiInfo")
    public JAXBElement<SdiInfo> createSdiInfo(SdiInfo value) {
        return new JAXBElement<SdiInfo>(_SdiInfo_QNAME, SdiInfo.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link UserRights }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://schemas.datacontract.org/2004/07/SIAV.Archiflow.Entities.Types", name = "UserRights")
    public JAXBElement<UserRights> createUserRights(UserRights value) {
        return new JAXBElement<UserRights>(_UserRights_QNAME, UserRights.class, null, value);
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
     * Create an instance of {@link JAXBElement }{@code <}{@link Byte }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://schemas.microsoft.com/2003/10/Serialization/", name = "byte")
    public JAXBElement<Byte> createByte(Byte value) {
        return new JAXBElement<Byte>(_Byte_QNAME, Byte.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link ProcWF }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://schemas.datacontract.org/2004/07/SIAV.Archiflow.Entities.Types", name = "ProcWF")
    public JAXBElement<ProcWF> createProcWF(ProcWF value) {
        return new JAXBElement<ProcWF>(_ProcWF_QNAME, ProcWF.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link DeleteProxyOutput }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://schemas.datacontract.org/2004/07/SIAV.Archiflow.Entities.ExternalMail.ValueObject", name = "DeleteProxyOutput")
    public JAXBElement<DeleteProxyOutput> createDeleteProxyOutput(DeleteProxyOutput value) {
        return new JAXBElement<DeleteProxyOutput>(_DeleteProxyOutput_QNAME, DeleteProxyOutput.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link SendExternalMailInput }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://schemas.datacontract.org/2004/07/SIAV.Archiflow.Entities.ExternalMail.ValueObject", name = "SendExternalMailInput")
    public JAXBElement<SendExternalMailInput> createSendExternalMailInput(SendExternalMailInput value) {
        return new JAXBElement<SendExternalMailInput>(_SendExternalMailInput_QNAME, SendExternalMailInput.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link DeleteMailServerOutput }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://schemas.datacontract.org/2004/07/SIAV.Archiflow.Entities.ExternalMail.ValueObject", name = "DeleteMailServerOutput")
    public JAXBElement<DeleteMailServerOutput> createDeleteMailServerOutput(DeleteMailServerOutput value) {
        return new JAXBElement<DeleteMailServerOutput>(_DeleteMailServerOutput_QNAME, DeleteMailServerOutput.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link PostingFault }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://schemas.datacontract.org/2004/07/SIAV.Archiflow.Faults", name = "PostingFault")
    public JAXBElement<PostingFault> createPostingFault(PostingFault value) {
        return new JAXBElement<PostingFault>(_PostingFault_QNAME, PostingFault.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link XmlSelectNodeFault }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://schemas.datacontract.org/2004/07/SIAV.Archiflow.Faults", name = "XmlSelectNodeFault")
    public JAXBElement<XmlSelectNodeFault> createXmlSelectNodeFault(XmlSelectNodeFault value) {
        return new JAXBElement<XmlSelectNodeFault>(_XmlSelectNodeFault_QNAME, XmlSelectNodeFault.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link ArrayOfUser }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://schemas.datacontract.org/2004/07/SIAV.Archiflow.Entities.Chart.ValueObject", name = "ArrayOfUser")
    public JAXBElement<ArrayOfUser> createArrayOfUser(ArrayOfUser value) {
        return new JAXBElement<ArrayOfUser>(_ArrayOfUser_QNAME, ArrayOfUser.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link GetExtMailSettingsOutput }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://schemas.datacontract.org/2004/07/SIAV.Archiflow.Entities.ExternalMail.ValueObject", name = "GetExtMailSettingsOutput")
    public JAXBElement<GetExtMailSettingsOutput> createGetExtMailSettingsOutput(GetExtMailSettingsOutput value) {
        return new JAXBElement<GetExtMailSettingsOutput>(_GetExtMailSettingsOutput_QNAME, GetExtMailSettingsOutput.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link GetEmailAttInChunkOutput }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://schemas.datacontract.org/2004/07/SIAV.Archiflow.Entities.ExternalMail.ValueObject", name = "GetEmailAttInChunkOutput")
    public JAXBElement<GetEmailAttInChunkOutput> createGetEmailAttInChunkOutput(GetEmailAttInChunkOutput value) {
        return new JAXBElement<GetEmailAttInChunkOutput>(_GetEmailAttInChunkOutput_QNAME, GetEmailAttInChunkOutput.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link ExtEMailConfig }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://schemas.datacontract.org/2004/07/SIAV.Archiflow.Entities.Card.ValueObject", name = "ExtEMailConfig")
    public JAXBElement<ExtEMailConfig> createExtEMailConfig(ExtEMailConfig value) {
        return new JAXBElement<ExtEMailConfig>(_ExtEMailConfig_QNAME, ExtEMailConfig.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link RetrieveEmailsOutput }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://schemas.datacontract.org/2004/07/SIAV.Archiflow.Entities.ExternalMail.ValueObject", name = "RetrieveEmailsOutput")
    public JAXBElement<RetrieveEmailsOutput> createRetrieveEmailsOutput(RetrieveEmailsOutput value) {
        return new JAXBElement<RetrieveEmailsOutput>(_RetrieveEmailsOutput_QNAME, RetrieveEmailsOutput.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link CardStatus }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://schemas.datacontract.org/2004/07/SIAV.Archiflow.Entities.Types", name = "CardStatus")
    public JAXBElement<CardStatus> createCardStatus(CardStatus value) {
        return new JAXBElement<CardStatus>(_CardStatus_QNAME, CardStatus.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link InvoiceOut }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://schemas.datacontract.org/2004/07/SIAV.Archiflow.Entities.Invoice.ValueObject", name = "InvoiceOut")
    public JAXBElement<InvoiceOut> createInvoiceOut(InvoiceOut value) {
        return new JAXBElement<InvoiceOut>(_InvoiceOut_QNAME, InvoiceOut.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link ArrayOfAgrafCardContact }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://schemas.datacontract.org/2004/07/SIAV.Archiflow.Entities.Agraf.ValueObject", name = "ArrayOfAgrafCardContact")
    public JAXBElement<ArrayOfAgrafCardContact> createArrayOfAgrafCardContact(ArrayOfAgrafCardContact value) {
        return new JAXBElement<ArrayOfAgrafCardContact>(_ArrayOfAgrafCardContact_QNAME, ArrayOfAgrafCardContact.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link MailBox }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://schemas.datacontract.org/2004/07/SIAV.Archiflow.Entities.MailBox.ValueObject", name = "MailBox")
    public JAXBElement<MailBox> createMailBox(MailBox value) {
        return new JAXBElement<MailBox>(_MailBox_QNAME, MailBox.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link UserType }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://schemas.datacontract.org/2004/07/SIAV.Archiflow.Entities.Types", name = "UserType")
    public JAXBElement<UserType> createUserType(UserType value) {
        return new JAXBElement<UserType>(_UserType_QNAME, UserType.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link InvalidSessionFault }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://schemas.datacontract.org/2004/07/SIAV.Archiflow.Faults", name = "InvalidSessionFault")
    public JAXBElement<InvalidSessionFault> createInvalidSessionFault(InvalidSessionFault value) {
        return new JAXBElement<InvalidSessionFault>(_InvalidSessionFault_QNAME, InvalidSessionFault.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link SetMailboxPasswordsInput }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://schemas.datacontract.org/2004/07/SIAV.Archiflow.Entities.ExternalMail.ValueObject", name = "SetMailboxPasswordsInput")
    public JAXBElement<SetMailboxPasswordsInput> createSetMailboxPasswordsInput(SetMailboxPasswordsInput value) {
        return new JAXBElement<SetMailboxPasswordsInput>(_SetMailboxPasswordsInput_QNAME, SetMailboxPasswordsInput.class, null, value);
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
     * Create an instance of {@link JAXBElement }{@code <}{@link NoModelFoundFault }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://schemas.datacontract.org/2004/07/SIAV.Archiflow.Faults", name = "NoModelFoundFault")
    public JAXBElement<NoModelFoundFault> createNoModelFoundFault(NoModelFoundFault value) {
        return new JAXBElement<NoModelFoundFault>(_NoModelFoundFault_QNAME, NoModelFoundFault.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link XmlSchemaValidationFault }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://schemas.datacontract.org/2004/07/SIAV.Archiflow.Faults", name = "XmlSchemaValidationFault")
    public JAXBElement<XmlSchemaValidationFault> createXmlSchemaValidationFault(XmlSchemaValidationFault value) {
        return new JAXBElement<XmlSchemaValidationFault>(_XmlSchemaValidationFault_QNAME, XmlSchemaValidationFault.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link OperationFailedFault }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://schemas.datacontract.org/2004/07/SIAV.Archiflow.Faults", name = "OperationFailedFault")
    public JAXBElement<OperationFailedFault> createOperationFailedFault(OperationFailedFault value) {
        return new JAXBElement<OperationFailedFault>(_OperationFailedFault_QNAME, OperationFailedFault.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link ArrayOfUserRight }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://schemas.datacontract.org/2004/07/SIAV.Archiflow.Entities.Chart.ValueObject", name = "ArrayOfUserRight")
    public JAXBElement<ArrayOfUserRight> createArrayOfUserRight(ArrayOfUserRight value) {
        return new JAXBElement<ArrayOfUserRight>(_ArrayOfUserRight_QNAME, ArrayOfUserRight.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link StoreEmailCard }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://schemas.datacontract.org/2004/07/SIAV.Archiflow.Entities.ExternalMail.ValueObject", name = "StoreEmailCard")
    public JAXBElement<StoreEmailCard> createStoreEmailCard(StoreEmailCard value) {
        return new JAXBElement<StoreEmailCard>(_StoreEmailCard_QNAME, StoreEmailCard.class, null, value);
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
     * Create an instance of {@link JAXBElement }{@code <}{@link GetCustomMailFieldsOutput }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://schemas.datacontract.org/2004/07/SIAV.Archiflow.Entities.ExternalMail.ValueObject", name = "GetCustomMailFieldsOutput")
    public JAXBElement<GetCustomMailFieldsOutput> createGetCustomMailFieldsOutput(GetCustomMailFieldsOutput value) {
        return new JAXBElement<GetCustomMailFieldsOutput>(_GetCustomMailFieldsOutput_QNAME, GetCustomMailFieldsOutput.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link GetMailServersOutput }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://schemas.datacontract.org/2004/07/SIAV.Archiflow.Entities.ExternalMail.ValueObject", name = "GetMailServersOutput")
    public JAXBElement<GetMailServersOutput> createGetMailServersOutput(GetMailServersOutput value) {
        return new JAXBElement<GetMailServersOutput>(_GetMailServersOutput_QNAME, GetMailServersOutput.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link SendExtendedMailInput }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://schemas.datacontract.org/2004/07/SIAV.Archiflow.Entities.ExternalMail.ValueObject", name = "SendExtendedMailInput")
    public JAXBElement<SendExtendedMailInput> createSendExtendedMailInput(SendExtendedMailInput value) {
        return new JAXBElement<SendExtendedMailInput>(_SendExtendedMailInput_QNAME, SendExtendedMailInput.class, null, value);
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
     * Create an instance of {@link JAXBElement }{@code <}{@link InsModProxyInput }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://schemas.datacontract.org/2004/07/SIAV.Archiflow.Entities.ExternalMail.ValueObject", name = "InsModProxyInput")
    public JAXBElement<InsModProxyInput> createInsModProxyInput(InsModProxyInput value) {
        return new JAXBElement<InsModProxyInput>(_InsModProxyInput_QNAME, InsModProxyInput.class, null, value);
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
     * Create an instance of {@link JAXBElement }{@code <}{@link NoDataFoundFault }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://schemas.datacontract.org/2004/07/SIAV.Archiflow.Faults", name = "NoDataFoundFault")
    public JAXBElement<NoDataFoundFault> createNoDataFoundFault(NoDataFoundFault value) {
        return new JAXBElement<NoDataFoundFault>(_NoDataFoundFault_QNAME, NoDataFoundFault.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link Attachment }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://schemas.datacontract.org/2004/07/SIAV.Archiflow.Entities.Card.ValueObject", name = "Attachment")
    public JAXBElement<Attachment> createAttachment(Attachment value) {
        return new JAXBElement<Attachment>(_Attachment_QNAME, Attachment.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link InsModProxyOutput }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://schemas.datacontract.org/2004/07/SIAV.Archiflow.Entities.ExternalMail.ValueObject", name = "InsModProxyOutput")
    public JAXBElement<InsModProxyOutput> createInsModProxyOutput(InsModProxyOutput value) {
        return new JAXBElement<InsModProxyOutput>(_InsModProxyOutput_QNAME, InsModProxyOutput.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link TestMailboxConnectionInput }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://schemas.datacontract.org/2004/07/SIAV.Archiflow.Entities.ExternalMail.ValueObject", name = "TestMailboxConnectionInput")
    public JAXBElement<TestMailboxConnectionInput> createTestMailboxConnectionInput(TestMailboxConnectionInput value) {
        return new JAXBElement<TestMailboxConnectionInput>(_TestMailboxConnectionInput_QNAME, TestMailboxConnectionInput.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link Group }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://schemas.datacontract.org/2004/07/SIAV.Archiflow.Entities.Chart.ValueObject", name = "Group")
    public JAXBElement<Group> createGroup(Group value) {
        return new JAXBElement<Group>(_Group_QNAME, Group.class, null, value);
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
     * Create an instance of {@link JAXBElement }{@code <}{@link ArrayOfMailAddress }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://schemas.datacontract.org/2004/07/SIAV.Archiflow.Entities.ExternalMail.ValueObject", name = "ArrayOfMailAddress")
    public JAXBElement<ArrayOfMailAddress> createArrayOfMailAddress(ArrayOfMailAddress value) {
        return new JAXBElement<ArrayOfMailAddress>(_ArrayOfMailAddress_QNAME, ArrayOfMailAddress.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link Proxy }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://schemas.datacontract.org/2004/07/SIAV.Archiflow.Entities.MailBox.ValueObject", name = "Proxy")
    public JAXBElement<Proxy> createProxy(Proxy value) {
        return new JAXBElement<Proxy>(_Proxy_QNAME, Proxy.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link GetProxiesInput }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://schemas.datacontract.org/2004/07/SIAV.Archiflow.Entities.ExternalMail.ValueObject", name = "GetProxiesInput")
    public JAXBElement<GetProxiesInput> createGetProxiesInput(GetProxiesInput value) {
        return new JAXBElement<GetProxiesInput>(_GetProxiesInput_QNAME, GetProxiesInput.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link InvoiceBase }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://schemas.datacontract.org/2004/07/SIAV.Archiflow.Entities.Invoice.ValueObject", name = "InvoiceBase")
    public JAXBElement<InvoiceBase> createInvoiceBase(InvoiceBase value) {
        return new JAXBElement<InvoiceBase>(_InvoiceBase_QNAME, InvoiceBase.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link MailAttachment }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://schemas.datacontract.org/2004/07/SIAV.Archiflow.Entities.ExternalMail.ValueObject", name = "MailAttachment")
    public JAXBElement<MailAttachment> createMailAttachment(MailAttachment value) {
        return new JAXBElement<MailAttachment>(_MailAttachment_QNAME, MailAttachment.class, null, value);
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
     * Create an instance of {@link JAXBElement }{@code <}{@link CustomEmailFieldsContext }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://schemas.datacontract.org/2004/07/SIAV.Archiflow.Entities.Types", name = "CustomEmailFieldsContext")
    public JAXBElement<CustomEmailFieldsContext> createCustomEmailFieldsContext(CustomEmailFieldsContext value) {
        return new JAXBElement<CustomEmailFieldsContext>(_CustomEmailFieldsContext_QNAME, CustomEmailFieldsContext.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link ArrayOfGroup }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://schemas.datacontract.org/2004/07/SIAV.Archiflow.Entities.Chart.ValueObject", name = "ArrayOfGroup")
    public JAXBElement<ArrayOfGroup> createArrayOfGroup(ArrayOfGroup value) {
        return new JAXBElement<ArrayOfGroup>(_ArrayOfGroup_QNAME, ArrayOfGroup.class, null, value);
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
     * Create an instance of {@link JAXBElement }{@code <}{@link GetMailBoxesInput }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://schemas.datacontract.org/2004/07/SIAV.Archiflow.Entities.ExternalMail.ValueObject", name = "GetMailBoxesInput")
    public JAXBElement<GetMailBoxesInput> createGetMailBoxesInput(GetMailBoxesInput value) {
        return new JAXBElement<GetMailBoxesInput>(_GetMailBoxesInput_QNAME, GetMailBoxesInput.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link Additive }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://schemas.datacontract.org/2004/07/SIAV.Archiflow.Entities.Card.ValueObject", name = "Additive")
    public JAXBElement<Additive> createAdditive(Additive value) {
        return new JAXBElement<Additive>(_Additive_QNAME, Additive.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link UserRightsConfig }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://schemas.datacontract.org/2004/07/SIAV.Archiflow.Types", name = "UserRightsConfig")
    public JAXBElement<UserRightsConfig> createUserRightsConfig(UserRightsConfig value) {
        return new JAXBElement<UserRightsConfig>(_UserRightsConfig_QNAME, UserRightsConfig.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link MailBoxInvoiceCfg }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://schemas.datacontract.org/2004/07/SIAV.Archiflow.Entities.MailBox.ValueObject", name = "MailBoxInvoiceCfg")
    public JAXBElement<MailBoxInvoiceCfg> createMailBoxInvoiceCfg(MailBoxInvoiceCfg value) {
        return new JAXBElement<MailBoxInvoiceCfg>(_MailBoxInvoiceCfg_QNAME, MailBoxInvoiceCfg.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link StoreEmailOutput }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://schemas.datacontract.org/2004/07/SIAV.Archiflow.Entities.ExternalMail.ValueObject", name = "StoreEmailOutput")
    public JAXBElement<StoreEmailOutput> createStoreEmailOutput(StoreEmailOutput value) {
        return new JAXBElement<StoreEmailOutput>(_StoreEmailOutput_QNAME, StoreEmailOutput.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link MailInteropType }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://schemas.datacontract.org/2004/07/SIAV.Archiflow.Entities.Types", name = "MailInteropType")
    public JAXBElement<MailInteropType> createMailInteropType(MailInteropType value) {
        return new JAXBElement<MailInteropType>(_MailInteropType_QNAME, MailInteropType.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link ArrayOfAdditive }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://schemas.datacontract.org/2004/07/SIAV.Archiflow.Entities.Card.ValueObject", name = "ArrayOfAdditive")
    public JAXBElement<ArrayOfAdditive> createArrayOfAdditive(ArrayOfAdditive value) {
        return new JAXBElement<ArrayOfAdditive>(_ArrayOfAdditive_QNAME, ArrayOfAdditive.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link IdAdditive }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://schemas.datacontract.org/2004/07/SIAV.Archiflow.Entities.Types", name = "IdAdditive")
    public JAXBElement<IdAdditive> createIdAdditive(IdAdditive value) {
        return new JAXBElement<IdAdditive>(_IdAdditive_QNAME, IdAdditive.class, null, value);
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
     * Create an instance of {@link JAXBElement }{@code <}{@link ArrayOfField }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://schemas.datacontract.org/2004/07/SIAV.Archiflow.Entities.Card.ValueObject", name = "ArrayOfField")
    public JAXBElement<ArrayOfField> createArrayOfField(ArrayOfField value) {
        return new JAXBElement<ArrayOfField>(_ArrayOfField_QNAME, ArrayOfField.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link AgrafCard }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://schemas.datacontract.org/2004/07/SIAV.Archiflow.Entities.Agraf.ValueObject", name = "AgrafCard")
    public JAXBElement<AgrafCard> createAgrafCard(AgrafCard value) {
        return new JAXBElement<AgrafCard>(_AgrafCard_QNAME, AgrafCard.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link UserRight }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://schemas.datacontract.org/2004/07/SIAV.Archiflow.Entities.Chart.ValueObject", name = "UserRight")
    public JAXBElement<UserRight> createUserRight(UserRight value) {
        return new JAXBElement<UserRight>(_UserRight_QNAME, UserRight.class, null, value);
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
     * Create an instance of {@link JAXBElement }{@code <}{@link DataType }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://schemas.datacontract.org/2004/07/SIAV.Archiflow.Entities.Types", name = "DataType")
    public JAXBElement<DataType> createDataType(DataType value) {
        return new JAXBElement<DataType>(_DataType_QNAME, DataType.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link InternalAttachType }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://schemas.datacontract.org/2004/07/SIAV.Archiflow.Entities.Types", name = "InternalAttachType")
    public JAXBElement<InternalAttachType> createInternalAttachType(InternalAttachType value) {
        return new JAXBElement<InternalAttachType>(_InternalAttachType_QNAME, InternalAttachType.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link MailIn }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://schemas.datacontract.org/2004/07/SIAV.Archiflow.Entities.ExternalMail.ValueObject", name = "MailIn")
    public JAXBElement<MailIn> createMailIn(MailIn value) {
        return new JAXBElement<MailIn>(_MailIn_QNAME, MailIn.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link AgrafCardContact }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://schemas.datacontract.org/2004/07/SIAV.Archiflow.Entities.Agraf.ValueObject", name = "AgrafCardContact")
    public JAXBElement<AgrafCardContact> createAgrafCardContact(AgrafCardContact value) {
        return new JAXBElement<AgrafCardContact>(_AgrafCardContact_QNAME, AgrafCardContact.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link ArrayOfHistory }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://schemas.datacontract.org/2004/07/SIAV.Archiflow.Entities.Card.ValueObject", name = "ArrayOfHistory")
    public JAXBElement<ArrayOfHistory> createArrayOfHistory(ArrayOfHistory value) {
        return new JAXBElement<ArrayOfHistory>(_ArrayOfHistory_QNAME, ArrayOfHistory.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link MessageIdentifier }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://schemas.datacontract.org/2004/07/SIAV.Archiflow.Entities.ExternalMail.ValueObject", name = "MessageIdentifier")
    public JAXBElement<MessageIdentifier> createMessageIdentifier(MessageIdentifier value) {
        return new JAXBElement<MessageIdentifier>(_MessageIdentifier_QNAME, MessageIdentifier.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link EmailAttType }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://schemas.datacontract.org/2004/07/SIAV.Archiflow.Entities.Types", name = "EmailAttType")
    public JAXBElement<EmailAttType> createEmailAttType(EmailAttType value) {
        return new JAXBElement<EmailAttType>(_EmailAttType_QNAME, EmailAttType.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link ValidLogCreatedFault }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://schemas.datacontract.org/2004/07/SIAV.Archiflow.Faults", name = "ValidLogCreatedFault")
    public JAXBElement<ValidLogCreatedFault> createValidLogCreatedFault(ValidLogCreatedFault value) {
        return new JAXBElement<ValidLogCreatedFault>(_ValidLogCreatedFault_QNAME, ValidLogCreatedFault.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link StoreEmailAttachment }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://schemas.datacontract.org/2004/07/SIAV.Archiflow.Entities.ExternalMail.ValueObject", name = "StoreEmailAttachment")
    public JAXBElement<StoreEmailAttachment> createStoreEmailAttachment(StoreEmailAttachment value) {
        return new JAXBElement<StoreEmailAttachment>(_StoreEmailAttachment_QNAME, StoreEmailAttachment.class, null, value);
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
     * Create an instance of {@link JAXBElement }{@code <}{@link ArrayOfStoreEmailAttachment }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://schemas.datacontract.org/2004/07/SIAV.Archiflow.Entities.ExternalMail.ValueObject", name = "ArrayOfStoreEmailAttachment")
    public JAXBElement<ArrayOfStoreEmailAttachment> createArrayOfStoreEmailAttachment(ArrayOfStoreEmailAttachment value) {
        return new JAXBElement<ArrayOfStoreEmailAttachment>(_ArrayOfStoreEmailAttachment_QNAME, ArrayOfStoreEmailAttachment.class, null, value);
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
     * Create an instance of {@link JAXBElement }{@code <}{@link SDINotificationType }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://schemas.datacontract.org/2004/07/SIAV.Archiflow.Entities.Types", name = "SDINotificationType")
    public JAXBElement<SDINotificationType> createSDINotificationType(SDINotificationType value) {
        return new JAXBElement<SDINotificationType>(_SDINotificationType_QNAME, SDINotificationType.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link Card }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://schemas.datacontract.org/2004/07/SIAV.Archiflow.Entities.Card.ValueObject", name = "Card")
    public JAXBElement<Card> createCard(Card value) {
        return new JAXBElement<Card>(_Card_QNAME, Card.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link Document }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://schemas.datacontract.org/2004/07/SIAV.Archiflow.Entities.Card.ValueObject", name = "Document")
    public JAXBElement<Document> createDocument(Document value) {
        return new JAXBElement<Document>(_Document_QNAME, Document.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link SendExtendedMailOutput }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://schemas.datacontract.org/2004/07/SIAV.Archiflow.Entities.ExternalMail.ValueObject", name = "SendExtendedMailOutput")
    public JAXBElement<SendExtendedMailOutput> createSendExtendedMailOutput(SendExtendedMailOutput value) {
        return new JAXBElement<SendExtendedMailOutput>(_SendExtendedMailOutput_QNAME, SendExtendedMailOutput.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link MaxLimitFault }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://schemas.datacontract.org/2004/07/SIAV.Archiflow.Faults", name = "MaxLimitFault")
    public JAXBElement<MaxLimitFault> createMaxLimitFault(MaxLimitFault value) {
        return new JAXBElement<MaxLimitFault>(_MaxLimitFault_QNAME, MaxLimitFault.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link TestMailboxConnectionOutput }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://schemas.datacontract.org/2004/07/SIAV.Archiflow.Entities.ExternalMail.ValueObject", name = "TestMailboxConnectionOutput")
    public JAXBElement<TestMailboxConnectionOutput> createTestMailboxConnectionOutput(TestMailboxConnectionOutput value) {
        return new JAXBElement<TestMailboxConnectionOutput>(_TestMailboxConnectionOutput_QNAME, TestMailboxConnectionOutput.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link ArrayOfAgrafCard }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://schemas.datacontract.org/2004/07/SIAV.Archiflow.Entities.Agraf.ValueObject", name = "ArrayOfAgrafCard")
    public JAXBElement<ArrayOfAgrafCard> createArrayOfAgrafCard(ArrayOfAgrafCard value) {
        return new JAXBElement<ArrayOfAgrafCard>(_ArrayOfAgrafCard_QNAME, ArrayOfAgrafCard.class, null, value);
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
     * Create an instance of {@link JAXBElement }{@code <}{@link CardExpirationInfo }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://schemas.datacontract.org/2004/07/SIAV.Archiflow.Entities.Card.ValueObject", name = "CardExpirationInfo")
    public JAXBElement<CardExpirationInfo> createCardExpirationInfo(CardExpirationInfo value) {
        return new JAXBElement<CardExpirationInfo>(_CardExpirationInfo_QNAME, CardExpirationInfo.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link ArrayOfMailBox }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://schemas.datacontract.org/2004/07/SIAV.Archiflow.Entities.MailBox.ValueObject", name = "ArrayOfMailBox")
    public JAXBElement<ArrayOfMailBox> createArrayOfMailBox(ArrayOfMailBox value) {
        return new JAXBElement<ArrayOfMailBox>(_ArrayOfMailBox_QNAME, ArrayOfMailBox.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link ArrayOfMailInHeaders }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://schemas.datacontract.org/2004/07/SIAV.Archiflow.Entities.ExternalMail.ValueObject", name = "ArrayOfMailInHeaders")
    public JAXBElement<ArrayOfMailInHeaders> createArrayOfMailInHeaders(ArrayOfMailInHeaders value) {
        return new JAXBElement<ArrayOfMailInHeaders>(_ArrayOfMailInHeaders_QNAME, ArrayOfMailInHeaders.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link Operation }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://schemas.datacontract.org/2004/07/SIAV.Archiflow.Entities.Card.ValueObject", name = "Operation")
    public JAXBElement<Operation> createOperation(Operation value) {
        return new JAXBElement<Operation>(_Operation_QNAME, Operation.class, null, value);
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
     * Create an instance of {@link JAXBElement }{@code <}{@link StoreEmailInput }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://schemas.datacontract.org/2004/07/SIAV.Archiflow.Entities.ExternalMail.ValueObject", name = "StoreEmailInput")
    public JAXBElement<StoreEmailInput> createStoreEmailInput(StoreEmailInput value) {
        return new JAXBElement<StoreEmailInput>(_StoreEmailInput_QNAME, StoreEmailInput.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link CardBundle }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://schemas.datacontract.org/2004/07/SIAV.Archiflow.Entities.Card.ValueObject", name = "CardBundle")
    public JAXBElement<CardBundle> createCardBundle(CardBundle value) {
        return new JAXBElement<CardBundle>(_CardBundle_QNAME, CardBundle.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link InternalAttachment }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://schemas.datacontract.org/2004/07/SIAV.Archiflow.Entities.Card.ValueObject", name = "InternalAttachment")
    public JAXBElement<InternalAttachment> createInternalAttachment(InternalAttachment value) {
        return new JAXBElement<InternalAttachment>(_InternalAttachment_QNAME, InternalAttachment.class, null, value);
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
     * Create an instance of {@link JAXBElement }{@code <}{@link MailServerProtocol }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://schemas.datacontract.org/2004/07/SIAV.Archiflow.Entities.Types", name = "MailServerProtocol")
    public JAXBElement<MailServerProtocol> createMailServerProtocol(MailServerProtocol value) {
        return new JAXBElement<MailServerProtocol>(_MailServerProtocol_QNAME, MailServerProtocol.class, null, value);
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
     * Create an instance of {@link JAXBElement }{@code <}{@link Duration }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://schemas.microsoft.com/2003/10/Serialization/", name = "duration")
    public JAXBElement<Duration> createDuration(Duration value) {
        return new JAXBElement<Duration>(_Duration_QNAME, Duration.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link EMailVisType }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://schemas.datacontract.org/2004/07/SIAV.Archiflow.Entities.Types", name = "EMailVisType")
    public JAXBElement<EMailVisType> createEMailVisType(EMailVisType value) {
        return new JAXBElement<EMailVisType>(_EMailVisType_QNAME, EMailVisType.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link VisibilityFault }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://schemas.datacontract.org/2004/07/SIAV.Archiflow.Faults", name = "VisibilityFault")
    public JAXBElement<VisibilityFault> createVisibilityFault(VisibilityFault value) {
        return new JAXBElement<VisibilityFault>(_VisibilityFault_QNAME, VisibilityFault.class, null, value);
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
     * Create an instance of {@link JAXBElement }{@code <}{@link ArrayOfMailServer }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://schemas.datacontract.org/2004/07/SIAV.Archiflow.Entities.MailBox.ValueObject", name = "ArrayOfMailServer")
    public JAXBElement<ArrayOfMailServer> createArrayOfMailServer(ArrayOfMailServer value) {
        return new JAXBElement<ArrayOfMailServer>(_ArrayOfMailServer_QNAME, ArrayOfMailServer.class, null, value);
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
     * Create an instance of {@link JAXBElement }{@code <}{@link SendHiddenExtEMailInput }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://schemas.datacontract.org/2004/07/SIAV.Archiflow.Entities.ExternalMail.ValueObject", name = "SendHiddenExtEMailInput")
    public JAXBElement<SendHiddenExtEMailInput> createSendHiddenExtEMailInput(SendHiddenExtEMailInput value) {
        return new JAXBElement<SendHiddenExtEMailInput>(_SendHiddenExtEMailInput_QNAME, SendHiddenExtEMailInput.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link ClassificationFolder }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://schemas.datacontract.org/2004/07/SIAV.Archiflow.Entities.Card.ValueObject", name = "ClassificationFolder")
    public JAXBElement<ClassificationFolder> createClassificationFolder(ClassificationFolder value) {
        return new JAXBElement<ClassificationFolder>(_ClassificationFolder_QNAME, ClassificationFolder.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link SSLStartModes }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://schemas.datacontract.org/2004/07/SIAV.Archiflow.Entities.Types", name = "SSLStartModes")
    public JAXBElement<SSLStartModes> createSSLStartModes(SSLStartModes value) {
        return new JAXBElement<SSLStartModes>(_SSLStartModes_QNAME, SSLStartModes.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link DeleteProxyInput }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://schemas.datacontract.org/2004/07/SIAV.Archiflow.Entities.ExternalMail.ValueObject", name = "DeleteProxyInput")
    public JAXBElement<DeleteProxyInput> createDeleteProxyInput(DeleteProxyInput value) {
        return new JAXBElement<DeleteProxyInput>(_DeleteProxyInput_QNAME, DeleteProxyInput.class, null, value);
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
     * Create an instance of {@link JAXBElement }{@code <}{@link Object }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://schemas.microsoft.com/2003/10/Serialization/", name = "anyType")
    public JAXBElement<Object> createAnyType(Object value) {
        return new JAXBElement<Object>(_AnyType_QNAME, Object.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link Annotation }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://schemas.datacontract.org/2004/07/SIAV.Archiflow.Entities.Card.ValueObject", name = "Annotation")
    public JAXBElement<Annotation> createAnnotation(Annotation value) {
        return new JAXBElement<Annotation>(_Annotation_QNAME, Annotation.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link InsModMailBoxInput }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://schemas.datacontract.org/2004/07/SIAV.Archiflow.Entities.ExternalMail.ValueObject", name = "InsModMailBoxInput")
    public JAXBElement<InsModMailBoxInput> createInsModMailBoxInput(InsModMailBoxInput value) {
        return new JAXBElement<InsModMailBoxInput>(_InsModMailBoxInput_QNAME, InsModMailBoxInput.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link EmailFault }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://schemas.datacontract.org/2004/07/SIAV.Archiflow.Faults", name = "EmailFault")
    public JAXBElement<EmailFault> createEmailFault(EmailFault value) {
        return new JAXBElement<EmailFault>(_EmailFault_QNAME, EmailFault.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link ArrayOfClassificationFolder }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://schemas.datacontract.org/2004/07/SIAV.Archiflow.Entities.Card.ValueObject", name = "ArrayOfClassificationFolder")
    public JAXBElement<ArrayOfClassificationFolder> createArrayOfClassificationFolder(ArrayOfClassificationFolder value) {
        return new JAXBElement<ArrayOfClassificationFolder>(_ArrayOfClassificationFolder_QNAME, ArrayOfClassificationFolder.class, null, value);
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
     * Create an instance of {@link JAXBElement }{@code <}{@link ResultInfo }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://schemas.datacontract.org/2004/07/SIAV.Common.BaseClass.Types", name = "ResultInfo")
    public JAXBElement<ResultInfo> createResultInfo(ResultInfo value) {
        return new JAXBElement<ResultInfo>(_ResultInfo_QNAME, ResultInfo.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link AgrafCardContactId }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://schemas.datacontract.org/2004/07/SIAV.Archiflow.Entities.Agraf.ValueObject", name = "AgrafCardContactId")
    public JAXBElement<AgrafCardContactId> createAgrafCardContactId(AgrafCardContactId value) {
        return new JAXBElement<AgrafCardContactId>(_AgrafCardContactId_QNAME, AgrafCardContactId.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link RetrieveEmailsInput }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://schemas.datacontract.org/2004/07/SIAV.Archiflow.Entities.ExternalMail.ValueObject", name = "RetrieveEmailsInput")
    public JAXBElement<RetrieveEmailsInput> createRetrieveEmailsInput(RetrieveEmailsInput value) {
        return new JAXBElement<RetrieveEmailsInput>(_RetrieveEmailsInput_QNAME, RetrieveEmailsInput.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link ArrayOfanyType }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://schemas.microsoft.com/2003/10/Serialization/Arrays", name = "ArrayOfanyType")
    public JAXBElement<ArrayOfanyType> createArrayOfanyType(ArrayOfanyType value) {
        return new JAXBElement<ArrayOfanyType>(_ArrayOfanyType_QNAME, ArrayOfanyType.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link SendEMailMsgInput }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://schemas.datacontract.org/2004/07/SIAV.Archiflow.Entities.ExternalMail.ValueObject", name = "SendEMailMsgInput")
    public JAXBElement<SendEMailMsgInput> createSendEMailMsgInput(SendEMailMsgInput value) {
        return new JAXBElement<SendEMailMsgInput>(_SendEMailMsgInput_QNAME, SendEMailMsgInput.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link SendFolderByExternalMailInput }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://schemas.datacontract.org/2004/07/SIAV.Archiflow.Entities.ExternalMail.ValueObject", name = "SendFolderByExternalMailInput")
    public JAXBElement<SendFolderByExternalMailInput> createSendFolderByExternalMailInput(SendFolderByExternalMailInput value) {
        return new JAXBElement<SendFolderByExternalMailInput>(_SendFolderByExternalMailInput_QNAME, SendFolderByExternalMailInput.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link ArrayOfKeyValueOfintArrayOfintty7Ep6D1 }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://schemas.microsoft.com/2003/10/Serialization/Arrays", name = "ArrayOfKeyValueOfintArrayOfintty7Ep6D1")
    public JAXBElement<ArrayOfKeyValueOfintArrayOfintty7Ep6D1> createArrayOfKeyValueOfintArrayOfintty7Ep6D1(ArrayOfKeyValueOfintArrayOfintty7Ep6D1 value) {
        return new JAXBElement<ArrayOfKeyValueOfintArrayOfintty7Ep6D1>(_ArrayOfKeyValueOfintArrayOfintty7Ep6D1_QNAME, ArrayOfKeyValueOfintArrayOfintty7Ep6D1 .class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link TimeStampFileFormat }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://schemas.datacontract.org/2004/07/SIAV.Archiflow.Entities.Types", name = "TimeStampFileFormat")
    public JAXBElement<TimeStampFileFormat> createTimeStampFileFormat(TimeStampFileFormat value) {
        return new JAXBElement<TimeStampFileFormat>(_TimeStampFileFormat_QNAME, TimeStampFileFormat.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link NoRightsFault }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://schemas.datacontract.org/2004/07/SIAV.Archiflow.Faults", name = "NoRightsFault")
    public JAXBElement<NoRightsFault> createNoRightsFault(NoRightsFault value) {
        return new JAXBElement<NoRightsFault>(_NoRightsFault_QNAME, NoRightsFault.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link AuthenticationType }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://schemas.datacontract.org/2004/07/SIAV.Archiflow.Entities.Types", name = "AuthenticationType")
    public JAXBElement<AuthenticationType> createAuthenticationType(AuthenticationType value) {
        return new JAXBElement<AuthenticationType>(_AuthenticationType_QNAME, AuthenticationType.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link Color }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://schemas.datacontract.org/2004/07/System.Drawing", name = "Color")
    public JAXBElement<Color> createColor(Color value) {
        return new JAXBElement<Color>(_Color_QNAME, Color.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link MailInHeaders }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://schemas.datacontract.org/2004/07/SIAV.Archiflow.Entities.ExternalMail.ValueObject", name = "MailInHeaders")
    public JAXBElement<MailInHeaders> createMailInHeaders(MailInHeaders value) {
        return new JAXBElement<MailInHeaders>(_MailInHeaders_QNAME, MailInHeaders.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link AgrafEntityId }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://schemas.datacontract.org/2004/07/SIAV.Archiflow.Entities.Agraf.ValueObject", name = "AgrafEntityId")
    public JAXBElement<AgrafEntityId> createAgrafEntityId(AgrafEntityId value) {
        return new JAXBElement<AgrafEntityId>(_AgrafEntityId_QNAME, AgrafEntityId.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link User }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://schemas.datacontract.org/2004/07/SIAV.Archiflow.Entities.Chart.ValueObject", name = "User")
    public JAXBElement<User> createUser(User value) {
        return new JAXBElement<User>(_User_QNAME, User.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link FileTypes }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://schemas.datacontract.org/2004/07/SIAV.Archiflow.Entities.Types", name = "FileTypes")
    public JAXBElement<FileTypes> createFileTypes(FileTypes value) {
        return new JAXBElement<FileTypes>(_FileTypes_QNAME, FileTypes.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link GetCustomMailFieldsInput }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://schemas.datacontract.org/2004/07/SIAV.Archiflow.Entities.ExternalMail.ValueObject", name = "GetCustomMailFieldsInput")
    public JAXBElement<GetCustomMailFieldsInput> createGetCustomMailFieldsInput(GetCustomMailFieldsInput value) {
        return new JAXBElement<GetCustomMailFieldsInput>(_GetCustomMailFieldsInput_QNAME, GetCustomMailFieldsInput.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link EmailAttChunkParamOut }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://schemas.datacontract.org/2004/07/SIAV.Archiflow.Entities.ExternalMail.ValueObject", name = "EmailAttChunkParamOut")
    public JAXBElement<EmailAttChunkParamOut> createEmailAttChunkParamOut(EmailAttChunkParamOut value) {
        return new JAXBElement<EmailAttChunkParamOut>(_EmailAttChunkParamOut_QNAME, EmailAttChunkParamOut.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link ProtocolMainDocType }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://schemas.datacontract.org/2004/07/SIAV.Archiflow.Entities.Types", name = "ProtocolMainDocType")
    public JAXBElement<ProtocolMainDocType> createProtocolMainDocType(ProtocolMainDocType value) {
        return new JAXBElement<ProtocolMainDocType>(_ProtocolMainDocType_QNAME, ProtocolMainDocType.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link ParamValidationFault }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://schemas.datacontract.org/2004/07/SIAV.Archiflow.Faults", name = "ParamValidationFault")
    public JAXBElement<ParamValidationFault> createParamValidationFault(ParamValidationFault value) {
        return new JAXBElement<ParamValidationFault>(_ParamValidationFault_QNAME, ParamValidationFault.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link ArrayOfMessageIdentifier }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://schemas.datacontract.org/2004/07/SIAV.Archiflow.Entities.ExternalMail.ValueObject", name = "ArrayOfMessageIdentifier")
    public JAXBElement<ArrayOfMessageIdentifier> createArrayOfMessageIdentifier(ArrayOfMessageIdentifier value) {
        return new JAXBElement<ArrayOfMessageIdentifier>(_ArrayOfMessageIdentifier_QNAME, ArrayOfMessageIdentifier.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link InsModMailBoxOutput }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://schemas.datacontract.org/2004/07/SIAV.Archiflow.Entities.ExternalMail.ValueObject", name = "InsModMailBoxOutput")
    public JAXBElement<InsModMailBoxOutput> createInsModMailBoxOutput(InsModMailBoxOutput value) {
        return new JAXBElement<InsModMailBoxOutput>(_InsModMailBoxOutput_QNAME, InsModMailBoxOutput.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link RemoveEmailsOutput }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://schemas.datacontract.org/2004/07/SIAV.Archiflow.Entities.ExternalMail.ValueObject", name = "RemoveEmailsOutput")
    public JAXBElement<RemoveEmailsOutput> createRemoveEmailsOutput(RemoveEmailsOutput value) {
        return new JAXBElement<RemoveEmailsOutput>(_RemoveEmailsOutput_QNAME, RemoveEmailsOutput.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link ExtendedEMailOptions }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://schemas.datacontract.org/2004/07/SIAV.Archiflow.Entities.Card.ValueObject", name = "ExtendedEMailOptions")
    public JAXBElement<ExtendedEMailOptions> createExtendedEMailOptions(ExtendedEMailOptions value) {
        return new JAXBElement<ExtendedEMailOptions>(_ExtendedEMailOptions_QNAME, ExtendedEMailOptions.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link MailOut }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://schemas.datacontract.org/2004/07/SIAV.Archiflow.Entities.ExternalMail.ValueObject", name = "MailOut")
    public JAXBElement<MailOut> createMailOut(MailOut value) {
        return new JAXBElement<MailOut>(_MailOut_QNAME, MailOut.class, null, value);
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
     * Create an instance of {@link JAXBElement }{@code <}{@link GetMailBoxesOutput }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://schemas.datacontract.org/2004/07/SIAV.Archiflow.Entities.ExternalMail.ValueObject", name = "GetMailBoxesOutput")
    public JAXBElement<GetMailBoxesOutput> createGetMailBoxesOutput(GetMailBoxesOutput value) {
        return new JAXBElement<GetMailBoxesOutput>(_GetMailBoxesOutput_QNAME, GetMailBoxesOutput.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link MailFault }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://schemas.datacontract.org/2004/07/SIAV.Archiflow.Faults", name = "MailFault")
    public JAXBElement<MailFault> createMailFault(MailFault value) {
        return new JAXBElement<MailFault>(_MailFault_QNAME, MailFault.class, null, value);
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
     * Create an instance of {@link JAXBElement }{@code <}{@link EMailType }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://schemas.datacontract.org/2004/07/SIAV.Archiflow.Entities.Types", name = "EMailType")
    public JAXBElement<EMailType> createEMailType(EMailType value) {
        return new JAXBElement<EMailType>(_EMailType_QNAME, EMailType.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link RetrieveEmailInput }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://schemas.datacontract.org/2004/07/SIAV.Archiflow.Entities.ExternalMail.ValueObject", name = "RetrieveEmailInput")
    public JAXBElement<RetrieveEmailInput> createRetrieveEmailInput(RetrieveEmailInput value) {
        return new JAXBElement<RetrieveEmailInput>(_RetrieveEmailInput_QNAME, RetrieveEmailInput.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link ControlType }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://schemas.datacontract.org/2004/07/SIAV.Archiflow.Entities.Types", name = "ControlType")
    public JAXBElement<ControlType> createControlType(ControlType value) {
        return new JAXBElement<ControlType>(_ControlType_QNAME, ControlType.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link SearchMailInCriteria }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://schemas.datacontract.org/2004/07/SIAV.Archiflow.Entities.ExternalMail.ValueObject", name = "SearchMailInCriteria")
    public JAXBElement<SearchMailInCriteria> createSearchMailInCriteria(SearchMailInCriteria value) {
        return new JAXBElement<SearchMailInCriteria>(_SearchMailInCriteria_QNAME, SearchMailInCriteria.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link MemberInfo }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://schemas.datacontract.org/2004/07/SIAV.Archiflow.Entities.Invoice.ValueObject", name = "MemberInfo")
    public JAXBElement<MemberInfo> createMemberInfo(MemberInfo value) {
        return new JAXBElement<MemberInfo>(_MemberInfo_QNAME, MemberInfo.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link ArrayOfExternNotificationOffice }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://schemas.datacontract.org/2004/07/SIAV.Archiflow.Entities.ExternNotifications.ValueObject", name = "ArrayOfExternNotificationOffice")
    public JAXBElement<ArrayOfExternNotificationOffice> createArrayOfExternNotificationOffice(ArrayOfExternNotificationOffice value) {
        return new JAXBElement<ArrayOfExternNotificationOffice>(_ArrayOfExternNotificationOffice_QNAME, ArrayOfExternNotificationOffice.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link History }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://schemas.datacontract.org/2004/07/SIAV.Archiflow.Entities.Card.ValueObject", name = "History")
    public JAXBElement<History> createHistory(History value) {
        return new JAXBElement<History>(_History_QNAME, History.class, null, value);
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
     * Create an instance of {@link JAXBElement }{@code <}{@link Long }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://schemas.microsoft.com/2003/10/Serialization/", name = "long")
    public JAXBElement<Long> createLong(Long value) {
        return new JAXBElement<Long>(_Long_QNAME, Long.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link CardNotFoundFault }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://schemas.datacontract.org/2004/07/SIAV.Archiflow.Faults", name = "CardNotFoundFault")
    public JAXBElement<CardNotFoundFault> createCardNotFoundFault(CardNotFoundFault value) {
        return new JAXBElement<CardNotFoundFault>(_CardNotFoundFault_QNAME, CardNotFoundFault.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link GetProxiesOutput }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://schemas.datacontract.org/2004/07/SIAV.Archiflow.Entities.ExternalMail.ValueObject", name = "GetProxiesOutput")
    public JAXBElement<GetProxiesOutput> createGetProxiesOutput(GetProxiesOutput value) {
        return new JAXBElement<GetProxiesOutput>(_GetProxiesOutput_QNAME, GetProxiesOutput.class, null, value);
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
     * Create an instance of {@link JAXBElement }{@code <}{@link Field }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://schemas.datacontract.org/2004/07/SIAV.Archiflow.Entities.Card.ValueObject", name = "Field")
    public JAXBElement<Field> createField(Field value) {
        return new JAXBElement<Field>(_Field_QNAME, Field.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link ExternNotificationOffice }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://schemas.datacontract.org/2004/07/SIAV.Archiflow.Entities.ExternNotifications.ValueObject", name = "ExternNotificationOffice")
    public JAXBElement<ExternNotificationOffice> createExternNotificationOffice(ExternNotificationOffice value) {
        return new JAXBElement<ExternNotificationOffice>(_ExternNotificationOffice_QNAME, ExternNotificationOffice.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link SendFolderByExternalMailOutput }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://schemas.datacontract.org/2004/07/SIAV.Archiflow.Entities.ExternalMail.ValueObject", name = "SendFolderByExternalMailOutput")
    public JAXBElement<SendFolderByExternalMailOutput> createSendFolderByExternalMailOutput(SendFolderByExternalMailOutput value) {
        return new JAXBElement<SendFolderByExternalMailOutput>(_SendFolderByExternalMailOutput_QNAME, SendFolderByExternalMailOutput.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link RetrieveEmailOutput }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://schemas.datacontract.org/2004/07/SIAV.Archiflow.Entities.ExternalMail.ValueObject", name = "RetrieveEmailOutput")
    public JAXBElement<RetrieveEmailOutput> createRetrieveEmailOutput(RetrieveEmailOutput value) {
        return new JAXBElement<RetrieveEmailOutput>(_RetrieveEmailOutput_QNAME, RetrieveEmailOutput.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link RemoveEmailsInput }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://schemas.datacontract.org/2004/07/SIAV.Archiflow.Entities.ExternalMail.ValueObject", name = "RemoveEmailsInput")
    public JAXBElement<RemoveEmailsInput> createRemoveEmailsInput(RemoveEmailsInput value) {
        return new JAXBElement<RemoveEmailsInput>(_RemoveEmailsInput_QNAME, RemoveEmailsInput.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link ArrayOfguid }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://schemas.microsoft.com/2003/10/Serialization/Arrays", name = "ArrayOfguid")
    public JAXBElement<ArrayOfguid> createArrayOfguid(ArrayOfguid value) {
        return new JAXBElement<ArrayOfguid>(_ArrayOfguid_QNAME, ArrayOfguid.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link SdiReceipt }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://schemas.datacontract.org/2004/07/SIAV.Archiflow.Entities.Invoice.ValueObject", name = "SdiReceipt")
    public JAXBElement<SdiReceipt> createSdiReceipt(SdiReceipt value) {
        return new JAXBElement<SdiReceipt>(_SdiReceipt_QNAME, SdiReceipt.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link ArrayOfProxy }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://schemas.datacontract.org/2004/07/SIAV.Archiflow.Entities.MailBox.ValueObject", name = "ArrayOfProxy")
    public JAXBElement<ArrayOfProxy> createArrayOfProxy(ArrayOfProxy value) {
        return new JAXBElement<ArrayOfProxy>(_ArrayOfProxy_QNAME, ArrayOfProxy.class, null, value);
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
     * Create an instance of {@link JAXBElement }{@code <}{@link PECReceiptType }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://schemas.datacontract.org/2004/07/SIAV.Archiflow.Entities.Types", name = "PECReceiptType")
    public JAXBElement<PECReceiptType> createPECReceiptType(PECReceiptType value) {
        return new JAXBElement<PECReceiptType>(_PECReceiptType_QNAME, PECReceiptType.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link DeleteMailBoxInput }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://schemas.datacontract.org/2004/07/SIAV.Archiflow.Entities.ExternalMail.ValueObject", name = "DeleteMailBoxInput")
    public JAXBElement<DeleteMailBoxInput> createDeleteMailBoxInput(DeleteMailBoxInput value) {
        return new JAXBElement<DeleteMailBoxInput>(_DeleteMailBoxInput_QNAME, DeleteMailBoxInput.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link ExternNotification }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://schemas.datacontract.org/2004/07/SIAV.Archiflow.Entities.ExternNotifications.ValueObject", name = "ExternNotification")
    public JAXBElement<ExternNotification> createExternNotification(ExternNotification value) {
        return new JAXBElement<ExternNotification>(_ExternNotification_QNAME, ExternNotification.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link InsModMailServerOutput }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://schemas.datacontract.org/2004/07/SIAV.Archiflow.Entities.ExternalMail.ValueObject", name = "InsModMailServerOutput")
    public JAXBElement<InsModMailServerOutput> createInsModMailServerOutput(InsModMailServerOutput value) {
        return new JAXBElement<InsModMailServerOutput>(_InsModMailServerOutput_QNAME, InsModMailServerOutput.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link CardOperationsFromList }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://schemas.datacontract.org/2004/07/SIAV.Archiflow.Types", name = "CardOperationsFromList")
    public JAXBElement<CardOperationsFromList> createCardOperationsFromList(CardOperationsFromList value) {
        return new JAXBElement<CardOperationsFromList>(_CardOperationsFromList_QNAME, CardOperationsFromList.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link GetEmailAttInChunkInput }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://schemas.datacontract.org/2004/07/SIAV.Archiflow.Entities.ExternalMail.ValueObject", name = "GetEmailAttInChunkInput")
    public JAXBElement<GetEmailAttInChunkInput> createGetEmailAttInChunkInput(GetEmailAttInChunkInput value) {
        return new JAXBElement<GetEmailAttInChunkInput>(_GetEmailAttInChunkInput_QNAME, GetEmailAttInChunkInput.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link ArrayOfAnnotation }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://schemas.datacontract.org/2004/07/SIAV.Archiflow.Entities.Card.ValueObject", name = "ArrayOfAnnotation")
    public JAXBElement<ArrayOfAnnotation> createArrayOfAnnotation(ArrayOfAnnotation value) {
        return new JAXBElement<ArrayOfAnnotation>(_ArrayOfAnnotation_QNAME, ArrayOfAnnotation.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link InsModMailServerInput }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://schemas.datacontract.org/2004/07/SIAV.Archiflow.Entities.ExternalMail.ValueObject", name = "InsModMailServerInput")
    public JAXBElement<InsModMailServerInput> createInsModMailServerInput(InsModMailServerInput value) {
        return new JAXBElement<InsModMailServerInput>(_InsModMailServerInput_QNAME, InsModMailServerInput.class, null, value);
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
     * Create an instance of {@link JAXBElement }{@code <}{@link SendHiddenExtEMailOutput }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://schemas.datacontract.org/2004/07/SIAV.Archiflow.Entities.ExternalMail.ValueObject", name = "SendHiddenExtEMailOutput")
    public JAXBElement<SendHiddenExtEMailOutput> createSendHiddenExtEMailOutput(SendHiddenExtEMailOutput value) {
        return new JAXBElement<SendHiddenExtEMailOutput>(_SendHiddenExtEMailOutput_QNAME, SendHiddenExtEMailOutput.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link SendEMailMsgOutput }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://schemas.datacontract.org/2004/07/SIAV.Archiflow.Entities.ExternalMail.ValueObject", name = "SendEMailMsgOutput")
    public JAXBElement<SendEMailMsgOutput> createSendEMailMsgOutput(SendEMailMsgOutput value) {
        return new JAXBElement<SendEMailMsgOutput>(_SendEMailMsgOutput_QNAME, SendEMailMsgOutput.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link EmailsOrderBy }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://schemas.datacontract.org/2004/07/SIAV.Archiflow.Entities.Types", name = "EmailsOrderBy")
    public JAXBElement<EmailsOrderBy> createEmailsOrderBy(EmailsOrderBy value) {
        return new JAXBElement<EmailsOrderBy>(_EmailsOrderBy_QNAME, EmailsOrderBy.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link ExternalAttachment }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://schemas.datacontract.org/2004/07/SIAV.Archiflow.Entities.Card.ValueObject", name = "ExternalAttachment")
    public JAXBElement<ExternalAttachment> createExternalAttachment(ExternalAttachment value) {
        return new JAXBElement<ExternalAttachment>(_ExternalAttachment_QNAME, ExternalAttachment.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link GetIndexesToStoreEmailOutput }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://schemas.datacontract.org/2004/07/SIAV.Archiflow.Entities.ExternalMail.ValueObject", name = "GetIndexesToStoreEmailOutput")
    public JAXBElement<GetIndexesToStoreEmailOutput> createGetIndexesToStoreEmailOutput(GetIndexesToStoreEmailOutput value) {
        return new JAXBElement<GetIndexesToStoreEmailOutput>(_GetIndexesToStoreEmailOutput_QNAME, GetIndexesToStoreEmailOutput.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link SetMailboxPasswordsOutput }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://schemas.datacontract.org/2004/07/SIAV.Archiflow.Entities.ExternalMail.ValueObject", name = "SetMailboxPasswordsOutput")
    public JAXBElement<SetMailboxPasswordsOutput> createSetMailboxPasswordsOutput(SetMailboxPasswordsOutput value) {
        return new JAXBElement<SetMailboxPasswordsOutput>(_SetMailboxPasswordsOutput_QNAME, SetMailboxPasswordsOutput.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link GroupChart }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://schemas.datacontract.org/2004/07/SIAV.Archiflow.Entities.Chart.ValueObject", name = "GroupChart")
    public JAXBElement<GroupChart> createGroupChart(GroupChart value) {
        return new JAXBElement<GroupChart>(_GroupChart_QNAME, GroupChart.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link SendExternalMailOutput }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://schemas.datacontract.org/2004/07/SIAV.Archiflow.Entities.ExternalMail.ValueObject", name = "SendExternalMailOutput")
    public JAXBElement<SendExternalMailOutput> createSendExternalMailOutput(SendExternalMailOutput value) {
        return new JAXBElement<SendExternalMailOutput>(_SendExternalMailOutput_QNAME, SendExternalMailOutput.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link ArrayOfAttachment }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://schemas.datacontract.org/2004/07/SIAV.Archiflow.Entities.Card.ValueObject", name = "ArrayOfAttachment")
    public JAXBElement<ArrayOfAttachment> createArrayOfAttachment(ArrayOfAttachment value) {
        return new JAXBElement<ArrayOfAttachment>(_ArrayOfAttachment_QNAME, ArrayOfAttachment.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link CardHasData }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://schemas.datacontract.org/2004/07/SIAV.Archiflow.Entities.Card.ValueObject", name = "CardHasData")
    public JAXBElement<CardHasData> createCardHasData(CardHasData value) {
        return new JAXBElement<CardHasData>(_CardHasData_QNAME, CardHasData.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link AuthMechanism }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://schemas.datacontract.org/2004/07/SIAV.Archiflow.Entities.Types", name = "AuthMechanism")
    public JAXBElement<AuthMechanism> createAuthMechanism(AuthMechanism value) {
        return new JAXBElement<AuthMechanism>(_AuthMechanism_QNAME, AuthMechanism.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link ArrayOfMailAttachment }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://schemas.datacontract.org/2004/07/SIAV.Archiflow.Entities.ExternalMail.ValueObject", name = "ArrayOfMailAttachment")
    public JAXBElement<ArrayOfMailAttachment> createArrayOfMailAttachment(ArrayOfMailAttachment value) {
        return new JAXBElement<ArrayOfMailAttachment>(_ArrayOfMailAttachment_QNAME, ArrayOfMailAttachment.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link EmailAttChunkParamIn }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://schemas.datacontract.org/2004/07/SIAV.Archiflow.Entities.ExternalMail.ValueObject", name = "EmailAttChunkParamIn")
    public JAXBElement<EmailAttChunkParamIn> createEmailAttChunkParamIn(EmailAttChunkParamIn value) {
        return new JAXBElement<EmailAttChunkParamIn>(_EmailAttChunkParamIn_QNAME, EmailAttChunkParamIn.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link MailServer }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://schemas.datacontract.org/2004/07/SIAV.Archiflow.Entities.MailBox.ValueObject", name = "MailServer")
    public JAXBElement<MailServer> createMailServer(MailServer value) {
        return new JAXBElement<MailServer>(_MailServer_QNAME, MailServer.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link Office }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://schemas.datacontract.org/2004/07/SIAV.Archiflow.Entities.Chart.ValueObject", name = "Office")
    public JAXBElement<Office> createOffice(Office value) {
        return new JAXBElement<Office>(_Office_QNAME, Office.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link Entity }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://schemas.datacontract.org/2004/07/SIAV.Archiflow.Entities.Chart.ValueObject", name = "Entity")
    public JAXBElement<Entity> createEntity(Entity value) {
        return new JAXBElement<Entity>(_Entity_QNAME, Entity.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link ArrayOfOffice }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://schemas.datacontract.org/2004/07/SIAV.Archiflow.Entities.Chart.ValueObject", name = "ArrayOfOffice")
    public JAXBElement<ArrayOfOffice> createArrayOfOffice(ArrayOfOffice value) {
        return new JAXBElement<ArrayOfOffice>(_ArrayOfOffice_QNAME, ArrayOfOffice.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link DeleteMailServerInput }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://schemas.datacontract.org/2004/07/SIAV.Archiflow.Entities.ExternalMail.ValueObject", name = "DeleteMailServerInput")
    public JAXBElement<DeleteMailServerInput> createDeleteMailServerInput(DeleteMailServerInput value) {
        return new JAXBElement<DeleteMailServerInput>(_DeleteMailServerInput_QNAME, DeleteMailServerInput.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link DeleteMailBoxOutput }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://schemas.datacontract.org/2004/07/SIAV.Archiflow.Entities.ExternalMail.ValueObject", name = "DeleteMailBoxOutput")
    public JAXBElement<DeleteMailBoxOutput> createDeleteMailBoxOutput(DeleteMailBoxOutput value) {
        return new JAXBElement<DeleteMailBoxOutput>(_DeleteMailBoxOutput_QNAME, DeleteMailBoxOutput.class, null, value);
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
     * Create an instance of {@link JAXBElement }{@code <}{@link IdField }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://schemas.datacontract.org/2004/07/SIAV.Archiflow.Entities.Types", name = "IdField")
    public JAXBElement<IdField> createIdField(IdField value) {
        return new JAXBElement<IdField>(_IdField_QNAME, IdField.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link MailAddress }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://schemas.datacontract.org/2004/07/SIAV.Archiflow.Entities.ExternalMail.ValueObject", name = "MailAddress")
    public JAXBElement<MailAddress> createMailAddress(MailAddress value) {
        return new JAXBElement<MailAddress>(_MailAddress_QNAME, MailAddress.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link EmailAttSignStatus }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://schemas.datacontract.org/2004/07/SIAV.Archiflow.Entities.Types", name = "EmailAttSignStatus")
    public JAXBElement<EmailAttSignStatus> createEmailAttSignStatus(EmailAttSignStatus value) {
        return new JAXBElement<EmailAttSignStatus>(_EmailAttSignStatus_QNAME, EmailAttSignStatus.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link ProxyType }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://schemas.datacontract.org/2004/07/SIAV.Archiflow.Entities.Types", name = "ProxyType")
    public JAXBElement<ProxyType> createProxyType(ProxyType value) {
        return new JAXBElement<ProxyType>(_ProxyType_QNAME, ProxyType.class, null, value);
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
     * Create an instance of {@link JAXBElement }{@code <}{@link ExternNotificationUsers }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://schemas.datacontract.org/2004/07/SIAV.Archiflow.Entities.ExternNotifications.ValueObject", name = "ExternNotificationUsers")
    public JAXBElement<ExternNotificationUsers> createExternNotificationUsers(ExternNotificationUsers value) {
        return new JAXBElement<ExternNotificationUsers>(_ExternNotificationUsers_QNAME, ExternNotificationUsers.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link GetIndexesToStoreEmailInput }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://schemas.datacontract.org/2004/07/SIAV.Archiflow.Entities.ExternalMail.ValueObject", name = "GetIndexesToStoreEmailInput")
    public JAXBElement<GetIndexesToStoreEmailInput> createGetIndexesToStoreEmailInput(GetIndexesToStoreEmailInput value) {
        return new JAXBElement<GetIndexesToStoreEmailInput>(_GetIndexesToStoreEmailInput_QNAME, GetIndexesToStoreEmailInput.class, null, value);
    }

}
