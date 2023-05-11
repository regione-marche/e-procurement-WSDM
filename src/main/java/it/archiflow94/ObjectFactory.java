
package it.archiflow94;

import java.math.BigDecimal;
import java.math.BigInteger;
import java.util.List;
import javax.xml.bind.JAXBElement;
import javax.xml.bind.annotation.XmlElementDecl;
import javax.xml.bind.annotation.XmlRegistry;
import javax.xml.datatype.Duration;
import javax.xml.datatype.XMLGregorianCalendar;
import javax.xml.namespace.QName;


/**
 * This object contains factory methods for each 
 * Java content interface and Java element interface 
 * generated in the it.archiflow94 package. 
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

    private final static QName _AnyURI_QNAME = new QName("http://schemas.microsoft.com/2003/10/Serialization/", "anyURI");
    private final static QName _ArrayOfSendingCategory_QNAME = new QName("http://schemas.datacontract.org/2004/07/SIAV.Archiflow.Entities.Types", "ArrayOfSendingCategory");
    private final static QName _ArrayOfFieldChannelKeySend_QNAME = new QName("http://schemas.datacontract.org/2004/07/SIAV.Archiflow.Entities.Posting.ValueObject", "ArrayOfFieldChannelKeySend");
    private final static QName _ArrayOfSearchAgrafEntityId_QNAME = new QName("http://schemas.datacontract.org/2004/07/SIAV.Archiflow.Entities.Agraf.ValueObject", "ArrayOfSearchAgrafEntityId");
    private final static QName _Float_QNAME = new QName("http://schemas.microsoft.com/2003/10/Serialization/", "float");
    private final static QName _BaseFault_QNAME = new QName("http://schemas.datacontract.org/2004/07/SIAV.Archiflow.Faults", "BaseFault");
    private final static QName _UserRights_QNAME = new QName("http://schemas.datacontract.org/2004/07/SIAV.Archiflow.Entities.Types", "UserRights");
    private final static QName _Base64Binary_QNAME = new QName("http://schemas.microsoft.com/2003/10/Serialization/", "base64Binary");
    private final static QName _Byte_QNAME = new QName("http://schemas.microsoft.com/2003/10/Serialization/", "byte");
    private final static QName _StatoFatturaPAIN_QNAME = new QName("http://schemas.datacontract.org/2004/07/SIAV.Archiflow.Entities.Types", "StatoFatturaPA_IN");
    private final static QName _Boolean_QNAME = new QName("http://schemas.microsoft.com/2003/10/Serialization/", "boolean");
    private final static QName _PostingFault_QNAME = new QName("http://schemas.datacontract.org/2004/07/SIAV.Archiflow.Faults", "PostingFault");
    private final static QName _ArrayOfSearchAgrafOptionsTag_QNAME = new QName("http://schemas.datacontract.org/2004/07/SIAV.Archiflow.Entities.Agraf.ValueObject", "ArrayOfSearchAgrafOptionsTag");
    private final static QName _ArrayOfUser_QNAME = new QName("http://schemas.datacontract.org/2004/07/SIAV.Archiflow.Entities.Chart.ValueObject", "ArrayOfUser");
    private final static QName _AnyType_QNAME = new QName("http://schemas.microsoft.com/2003/10/Serialization/", "anyType");
    private final static QName _SendOption_QNAME = new QName("http://schemas.datacontract.org/2004/07/SIAV.Archiflow.Entities.Types", "SendOption");
    private final static QName _ArrayOfCheckInfoFatturaPA_QNAME = new QName("http://schemas.datacontract.org/2004/07/SIAV.Archiflow.Entities.Posting.ValueObject", "ArrayOfCheckInfoFatturaPA");
    private final static QName _ArrayOfEMailAddressee_QNAME = new QName("http://schemas.datacontract.org/2004/07/SIAV.Archiflow.Entities.Posting.ValueObject", "ArrayOfEMailAddressee");
    private final static QName _EMailSendRet_QNAME = new QName("http://schemas.datacontract.org/2004/07/SIAV.Archiflow.Entities.Types", "EMailSendRet");
    private final static QName _AgrafEntityType_QNAME = new QName("http://schemas.datacontract.org/2004/07/SIAV.Archiflow.Entities.Types", "AgrafEntityType");
    private final static QName _ArrayOfint_QNAME = new QName("http://schemas.microsoft.com/2003/10/Serialization/Arrays", "ArrayOfint");
    private final static QName _ResultInfo_QNAME = new QName("http://schemas.datacontract.org/2004/07/SIAV.Common.BaseClass.Types", "ResultInfo");
    private final static QName _InvalidSessionFault_QNAME = new QName("http://schemas.datacontract.org/2004/07/SIAV.Archiflow.Faults", "InvalidSessionFault");
    private final static QName _UserType_QNAME = new QName("http://schemas.datacontract.org/2004/07/SIAV.Archiflow.Entities.Types", "UserType");
    private final static QName _EMailVisProtType_QNAME = new QName("http://schemas.datacontract.org/2004/07/SIAV.Archiflow.Entities.Types", "EMailVisProtType");
    private final static QName _EMailAddressee_QNAME = new QName("http://schemas.datacontract.org/2004/07/SIAV.Archiflow.Entities.Posting.ValueObject", "EMailAddressee");
    private final static QName _FieldChannelKeySend_QNAME = new QName("http://schemas.datacontract.org/2004/07/SIAV.Archiflow.Entities.Posting.ValueObject", "FieldChannelKeySend");
    private final static QName _ArrayOfOfficeChart_QNAME = new QName("http://schemas.datacontract.org/2004/07/SIAV.Archiflow.Entities.Chart.ValueObject", "ArrayOfOfficeChart");
    private final static QName _PostingMailServiceNoSenderFault_QNAME = new QName("http://schemas.datacontract.org/2004/07/SIAV.Archiflow.Faults", "PostingMailServiceNoSenderFault");
    private final static QName _ArrayOfUserRight_QNAME = new QName("http://schemas.datacontract.org/2004/07/SIAV.Archiflow.Entities.Chart.ValueObject", "ArrayOfUserRight");
    private final static QName _UnsignedShort_QNAME = new QName("http://schemas.microsoft.com/2003/10/Serialization/", "unsignedShort");
    private final static QName _ArrayOfSending_QNAME = new QName("http://schemas.datacontract.org/2004/07/SIAV.Archiflow.Entities.Posting.ValueObject", "ArrayOfSending");
    private final static QName _EMail_QNAME = new QName("http://schemas.datacontract.org/2004/07/SIAV.Archiflow.Entities.Posting.ValueObject", "EMail");
    private final static QName _ArchiflowServiceExceptionDetail_QNAME = new QName("http://schemas.datacontract.org/2004/07/SIAV.Archiflow.Exceptions", "ArchiflowServiceExceptionDetail");
    private final static QName _Short_QNAME = new QName("http://schemas.microsoft.com/2003/10/Serialization/", "short");
    private final static QName _NoRightsFault_QNAME = new QName("http://schemas.datacontract.org/2004/07/SIAV.Archiflow.Faults", "NoRightsFault");
    private final static QName _AuthenticationType_QNAME = new QName("http://schemas.datacontract.org/2004/07/SIAV.Archiflow.Entities.Types", "AuthenticationType");
    private final static QName _Sending_QNAME = new QName("http://schemas.datacontract.org/2004/07/SIAV.Archiflow.Entities.Posting.ValueObject", "Sending");
    private final static QName _GetEmailPropsByCardIdInput_QNAME = new QName("http://schemas.datacontract.org/2004/07/SIAV.Archiflow.Posting.ValueObject", "GetEmailPropsByCardIdInput");
    private final static QName _Group_QNAME = new QName("http://schemas.datacontract.org/2004/07/SIAV.Archiflow.Entities.Chart.ValueObject", "Group");
    private final static QName _EMailIn_QNAME = new QName("http://schemas.datacontract.org/2004/07/SIAV.Archiflow.Entities.Posting.ValueObject", "EMailIn");
    private final static QName _User_QNAME = new QName("http://schemas.datacontract.org/2004/07/SIAV.Archiflow.Entities.Chart.ValueObject", "User");
    private final static QName _AgrafEntityId_QNAME = new QName("http://schemas.datacontract.org/2004/07/SIAV.Archiflow.Entities.Agraf.ValueObject", "AgrafEntityId");
    private final static QName _PostingFieldKeyDirection_QNAME = new QName("http://schemas.datacontract.org/2004/07/SIAV.Archiflow.Entities.Types", "PostingFieldKeyDirection");
    private final static QName _PostingMailServiceNoRecipientsFault_QNAME = new QName("http://schemas.datacontract.org/2004/07/SIAV.Archiflow.Faults", "PostingMailServiceNoRecipientsFault");
    private final static QName _FieldChannelKeyRecv_QNAME = new QName("http://schemas.datacontract.org/2004/07/SIAV.Archiflow.Entities.Posting.ValueObject", "FieldChannelKeyRecv");
    private final static QName _UnsignedInt_QNAME = new QName("http://schemas.microsoft.com/2003/10/Serialization/", "unsignedInt");
    private final static QName _ParamValidationFault_QNAME = new QName("http://schemas.datacontract.org/2004/07/SIAV.Archiflow.Faults", "ParamValidationFault");
    private final static QName _ArrayOfGroup_QNAME = new QName("http://schemas.datacontract.org/2004/07/SIAV.Archiflow.Entities.Chart.ValueObject", "ArrayOfGroup");
    private final static QName _NotificationECType_QNAME = new QName("http://schemas.datacontract.org/2004/07/SIAV.Archiflow.Entities.Types", "NotificationECType");
    private final static QName _ArrayOfRecipient_QNAME = new QName("http://schemas.datacontract.org/2004/07/SIAV.Archiflow.Entities.Posting.ValueObject", "ArrayOfRecipient");
    private final static QName _EmailAddressType_QNAME = new QName("http://schemas.datacontract.org/2004/07/SIAV.Archiflow.Entities.Types", "EmailAddressType");
    private final static QName _ArrayOfstring_QNAME = new QName("http://schemas.microsoft.com/2003/10/Serialization/Arrays", "ArrayOfstring");
    private final static QName _Message_QNAME = new QName("http://schemas.datacontract.org/2004/07/SIAV.Archiflow.Entities.Posting.ValueObject", "Message");
    private final static QName _PostingMailServiceMaxRecipientsFault_QNAME = new QName("http://schemas.datacontract.org/2004/07/SIAV.Archiflow.Faults", "PostingMailServiceMaxRecipientsFault");
    private final static QName _MailServiceSendingState_QNAME = new QName("http://schemas.datacontract.org/2004/07/SIAV.Archiflow.Entities.Types", "MailServiceSendingState");
    private final static QName _String_QNAME = new QName("http://schemas.microsoft.com/2003/10/Serialization/", "string");
    private final static QName _UserRightsConfig_QNAME = new QName("http://schemas.datacontract.org/2004/07/SIAV.Archiflow.Types", "UserRightsConfig");
    private final static QName _BaseOutput_QNAME = new QName("http://schemas.datacontract.org/2004/07/SIAV.Archiflow.Entities", "BaseOutput");
    private final static QName _SendingParams_QNAME = new QName("http://schemas.datacontract.org/2004/07/SIAV.Archiflow.Entities.Posting.ValueObject", "SendingParams");
    private final static QName _SendingCategory_QNAME = new QName("http://schemas.datacontract.org/2004/07/SIAV.Archiflow.Entities.Types", "SendingCategory");
    private final static QName _ArrayOfFieldChannelKeyAttributes_QNAME = new QName("http://schemas.datacontract.org/2004/07/SIAV.Archiflow.Entities.Posting.ValueObject", "ArrayOfFieldChannelKeyAttributes");
    private final static QName _Char_QNAME = new QName("http://schemas.microsoft.com/2003/10/Serialization/", "char");
    private final static QName _GetEmailPropsByCardIdOutput_QNAME = new QName("http://schemas.datacontract.org/2004/07/SIAV.Archiflow.Posting.ValueObject", "GetEmailPropsByCardIdOutput");
    private final static QName _SessionInfo_QNAME = new QName("http://schemas.datacontract.org/2004/07/SIAV.Archiflow.Entities.Login.ValueObject", "SessionInfo");
    private final static QName _ArrayOfMessage_QNAME = new QName("http://schemas.datacontract.org/2004/07/SIAV.Archiflow.Entities.Posting.ValueObject", "ArrayOfMessage");
    private final static QName _UserLoginType_QNAME = new QName("http://schemas.datacontract.org/2004/07/SIAV.Archiflow.Entities.Types", "UserLoginType");
    private final static QName _UserRight_QNAME = new QName("http://schemas.datacontract.org/2004/07/SIAV.Archiflow.Entities.Chart.ValueObject", "UserRight");
    private final static QName _Long_QNAME = new QName("http://schemas.microsoft.com/2003/10/Serialization/", "long");
    private final static QName _LoggableBase_QNAME = new QName("http://schemas.datacontract.org/2004/07/SIAV.Common.Tools.Log", "LoggableBase");
    private final static QName _ArrayOfServiceChannel_QNAME = new QName("http://schemas.datacontract.org/2004/07/SIAV.Archiflow.Entities.Posting.ValueObject", "ArrayOfServiceChannel");
    private final static QName _BaseInput_QNAME = new QName("http://schemas.datacontract.org/2004/07/SIAV.Archiflow.Entities", "BaseInput");
    private final static QName _MailServiceSendingSeverity_QNAME = new QName("http://schemas.datacontract.org/2004/07/SIAV.Archiflow.Entities.Types", "MailServiceSendingSeverity");
    private final static QName _Recipient_QNAME = new QName("http://schemas.datacontract.org/2004/07/SIAV.Archiflow.Entities.Posting.ValueObject", "Recipient");
    private final static QName _AgrafMatchMode_QNAME = new QName("http://schemas.datacontract.org/2004/07/SIAV.Archiflow.Entities.Types", "AgrafMatchMode");
    private final static QName _CreateMailServiceSendingInput_QNAME = new QName("http://schemas.datacontract.org/2004/07/SIAV.Archiflow.Posting.ValueObject", "CreateMailServiceSendingInput");
    private final static QName _PostingFieldDataType_QNAME = new QName("http://schemas.datacontract.org/2004/07/SIAV.Archiflow.Entities.Types", "PostingFieldDataType");
    private final static QName _ArrayOfguid_QNAME = new QName("http://schemas.microsoft.com/2003/10/Serialization/Arrays", "ArrayOfguid");
    private final static QName _ArrayOfFieldChannelKeyRecv_QNAME = new QName("http://schemas.datacontract.org/2004/07/SIAV.Archiflow.Entities.Posting.ValueObject", "ArrayOfFieldChannelKeyRecv");
    private final static QName _UnsignedByte_QNAME = new QName("http://schemas.microsoft.com/2003/10/Serialization/", "unsignedByte");
    private final static QName _SendingSearchCriteria_QNAME = new QName("http://schemas.datacontract.org/2004/07/SIAV.Archiflow.Entities.Posting.ValueObject", "SendingSearchCriteria");
    private final static QName _Int_QNAME = new QName("http://schemas.microsoft.com/2003/10/Serialization/", "int");
    private final static QName _Double_QNAME = new QName("http://schemas.microsoft.com/2003/10/Serialization/", "double");
    private final static QName _AgrafSearchCriteria_QNAME = new QName("http://schemas.datacontract.org/2004/07/SIAV.Archiflow.Entities.Agraf.ValueObject", "AgrafSearchCriteria");
    private final static QName _MailServiceSending_QNAME = new QName("http://schemas.datacontract.org/2004/07/SIAV.Archiflow.Entities.Posting.ValueObject", "MailServiceSending");
    private final static QName _EMailAttachment_QNAME = new QName("http://schemas.datacontract.org/2004/07/SIAV.Archiflow.Entities.Posting.ValueObject", "EMailAttachment");
    private final static QName _SendingStatus_QNAME = new QName("http://schemas.datacontract.org/2004/07/SIAV.Archiflow.Entities.Types", "SendingStatus");
    private final static QName _EMailVisibility_QNAME = new QName("http://schemas.datacontract.org/2004/07/SIAV.Archiflow.Entities.Types", "EMailVisibility");
    private final static QName _DateTime_QNAME = new QName("http://schemas.microsoft.com/2003/10/Serialization/", "dateTime");
    private final static QName _FieldChannelKeyAttributes_QNAME = new QName("http://schemas.datacontract.org/2004/07/SIAV.Archiflow.Entities.Posting.ValueObject", "FieldChannelKeyAttributes");
    private final static QName _UploadType_QNAME = new QName("http://schemas.datacontract.org/2004/07/SIAV.Archiflow.Entities.Types", "UploadType");
    private final static QName _QName_QNAME = new QName("http://schemas.microsoft.com/2003/10/Serialization/", "QName");
    private final static QName _ServiceChannel_QNAME = new QName("http://schemas.datacontract.org/2004/07/SIAV.Archiflow.Entities.Posting.ValueObject", "ServiceChannel");
    private final static QName _EMailAddrType_QNAME = new QName("http://schemas.datacontract.org/2004/07/SIAV.Archiflow.Entities.Types", "EMailAddrType");
    private final static QName _SearchAgrafEntityId_QNAME = new QName("http://schemas.datacontract.org/2004/07/SIAV.Archiflow.Entities.Agraf.ValueObject", "SearchAgrafEntityId");
    private final static QName _GroupChart_QNAME = new QName("http://schemas.datacontract.org/2004/07/SIAV.Archiflow.Entities.Chart.ValueObject", "GroupChart");
    private final static QName _ArchiflowExceptionSeverity_QNAME = new QName("http://schemas.datacontract.org/2004/07/SIAV.Archiflow.Exceptions", "ArchiflowExceptionSeverity");
    private final static QName _StatoFatturaPAOUT_QNAME = new QName("http://schemas.datacontract.org/2004/07/SIAV.Archiflow.Entities.Types", "StatoFatturaPA_OUT");
    private final static QName _RecipientModality_QNAME = new QName("http://schemas.datacontract.org/2004/07/SIAV.Archiflow.Entities.Types", "RecipientModality");
    private final static QName _Office_QNAME = new QName("http://schemas.datacontract.org/2004/07/SIAV.Archiflow.Entities.Chart.ValueObject", "Office");
    private final static QName _Entity_QNAME = new QName("http://schemas.datacontract.org/2004/07/SIAV.Archiflow.Entities.Chart.ValueObject", "Entity");
    private final static QName _ArrayOfOffice_QNAME = new QName("http://schemas.datacontract.org/2004/07/SIAV.Archiflow.Entities.Chart.ValueObject", "ArrayOfOffice");
    private final static QName _EMailBase_QNAME = new QName("http://schemas.datacontract.org/2004/07/SIAV.Archiflow.Entities.Posting.ValueObject", "EMailBase");
    private final static QName _SearchAgrafOptionsTag_QNAME = new QName("http://schemas.datacontract.org/2004/07/SIAV.Archiflow.Entities.Agraf.ValueObject", "SearchAgrafOptionsTag");
    private final static QName _Decimal_QNAME = new QName("http://schemas.microsoft.com/2003/10/Serialization/", "decimal");
    private final static QName _Language_QNAME = new QName("http://schemas.datacontract.org/2004/07/SIAV.Archiflow.Entities.Types", "Language");
    private final static QName _OfficeChart_QNAME = new QName("http://schemas.datacontract.org/2004/07/SIAV.Archiflow.Entities.Chart.ValueObject", "OfficeChart");
    private final static QName _Guid_QNAME = new QName("http://schemas.microsoft.com/2003/10/Serialization/", "guid");
    private final static QName _Duration_QNAME = new QName("http://schemas.microsoft.com/2003/10/Serialization/", "duration");
    private final static QName _MailServiceSendingPriority_QNAME = new QName("http://schemas.datacontract.org/2004/07/SIAV.Archiflow.Entities.Types", "MailServiceSendingPriority");
    private final static QName _UnsignedLong_QNAME = new QName("http://schemas.microsoft.com/2003/10/Serialization/", "unsignedLong");
    private final static QName _PrepareEmailFor_QNAME = new QName("http://schemas.datacontract.org/2004/07/SIAV.Archiflow.Entities.Types", "PrepareEmailFor");
    private final static QName _ArrayOfEMailAttachment_QNAME = new QName("http://schemas.datacontract.org/2004/07/SIAV.Archiflow.Entities.Posting.ValueObject", "ArrayOfEMailAttachment");
    private final static QName _EMailVisType_QNAME = new QName("http://schemas.datacontract.org/2004/07/SIAV.Archiflow.Entities.Types", "EMailVisType");
    private final static QName _CreateMailServiceSendingOutput_QNAME = new QName("http://schemas.datacontract.org/2004/07/SIAV.Archiflow.Posting.ValueObject", "CreateMailServiceSendingOutput");
    private final static QName _CheckInfoFatturaPA_QNAME = new QName("http://schemas.datacontract.org/2004/07/SIAV.Archiflow.Entities.Posting.ValueObject", "CheckInfoFatturaPA");
    private final static QName _PostingFieldType_QNAME = new QName("http://schemas.datacontract.org/2004/07/SIAV.Archiflow.Entities.Types", "PostingFieldType");

    /**
     * Create a new ObjectFactory that can be used to create new instances of schema derived classes for package: it.archiflow94
     * 
     */
    public ObjectFactory() {
    }

    /**
     * Create an instance of {@link Office }
     * 
     */
    public Office createOffice() {
        return new Office();
    }

    /**
     * Create an instance of {@link ArchiflowServiceExceptionDetail }
     * 
     */
    public ArchiflowServiceExceptionDetail createArchiflowServiceExceptionDetail() {
        return new ArchiflowServiceExceptionDetail();
    }

    /**
     * Create an instance of {@link ArrayOfFieldChannelKeyAttributes }
     * 
     */
    public ArrayOfFieldChannelKeyAttributes createArrayOfFieldChannelKeyAttributes() {
        return new ArrayOfFieldChannelKeyAttributes();
    }

    /**
     * Create an instance of {@link CheckUserRightToSendNotificationECResponse }
     * 
     */
    public CheckUserRightToSendNotificationECResponse createCheckUserRightToSendNotificationECResponse() {
        return new CheckUserRightToSendNotificationECResponse();
    }

    /**
     * Create an instance of {@link ArrayOfGroup }
     * 
     */
    public ArrayOfGroup createArrayOfGroup() {
        return new ArrayOfGroup();
    }

    /**
     * Create an instance of {@link DeleteSendingContacts }
     * 
     */
    public DeleteSendingContacts createDeleteSendingContacts() {
        return new DeleteSendingContacts();
    }

    /**
     * Create an instance of {@link SendExResponse }
     * 
     */
    public SendExResponse createSendExResponse() {
        return new SendExResponse();
    }

    /**
     * Create an instance of {@link SendNotificationECResponse }
     * 
     */
    public SendNotificationECResponse createSendNotificationECResponse() {
        return new SendNotificationECResponse();
    }

    /**
     * Create an instance of {@link CheckInfoFatturaPA }
     * 
     */
    public CheckInfoFatturaPA createCheckInfoFatturaPA() {
        return new CheckInfoFatturaPA();
    }

    /**
     * Create an instance of {@link NoRightsFault }
     * 
     */
    public NoRightsFault createNoRightsFault() {
        return new NoRightsFault();
    }

    /**
     * Create an instance of {@link DeleteSendingResponse }
     * 
     */
    public DeleteSendingResponse createDeleteSendingResponse() {
        return new DeleteSendingResponse();
    }

    /**
     * Create an instance of {@link GetEmailPropsByCardIdOutput }
     * 
     */
    public GetEmailPropsByCardIdOutput createGetEmailPropsByCardIdOutput() {
        return new GetEmailPropsByCardIdOutput();
    }

    /**
     * Create an instance of {@link IsInBoxProtocolResponse }
     * 
     */
    public IsInBoxProtocolResponse createIsInBoxProtocolResponse() {
        return new IsInBoxProtocolResponse();
    }

    /**
     * Create an instance of {@link Send2Response }
     * 
     */
    public Send2Response createSend2Response() {
        return new Send2Response();
    }

    /**
     * Create an instance of {@link PostingMailServiceNoRecipientsFault }
     * 
     */
    public PostingMailServiceNoRecipientsFault createPostingMailServiceNoRecipientsFault() {
        return new PostingMailServiceNoRecipientsFault();
    }

    /**
     * Create an instance of {@link ArrayOfServiceChannel }
     * 
     */
    public ArrayOfServiceChannel createArrayOfServiceChannel() {
        return new ArrayOfServiceChannel();
    }

    /**
     * Create an instance of {@link DeleteSendingContactsResponse }
     * 
     */
    public DeleteSendingContactsResponse createDeleteSendingContactsResponse() {
        return new DeleteSendingContactsResponse();
    }

    /**
     * Create an instance of {@link EMailAddressee }
     * 
     */
    public EMailAddressee createEMailAddressee() {
        return new EMailAddressee();
    }

    /**
     * Create an instance of {@link ArrayOfint }
     * 
     */
    public ArrayOfint createArrayOfint() {
        return new ArrayOfint();
    }

    /**
     * Create an instance of {@link Sending }
     * 
     */
    public Sending createSending() {
        return new Sending();
    }

    /**
     * Create an instance of {@link ReadChnlFieldKeysSendResponse }
     * 
     */
    public ReadChnlFieldKeysSendResponse createReadChnlFieldKeysSendResponse() {
        return new ReadChnlFieldKeysSendResponse();
    }

    /**
     * Create an instance of {@link SearchAgrafOptionsTag }
     * 
     */
    public SearchAgrafOptionsTag createSearchAgrafOptionsTag() {
        return new SearchAgrafOptionsTag();
    }

    /**
     * Create an instance of {@link GetSendingCountByCardId }
     * 
     */
    public GetSendingCountByCardId createGetSendingCountByCardId() {
        return new GetSendingCountByCardId();
    }

    /**
     * Create an instance of {@link ReadChnlFieldKeysRecv }
     * 
     */
    public ReadChnlFieldKeysRecv createReadChnlFieldKeysRecv() {
        return new ReadChnlFieldKeysRecv();
    }

    /**
     * Create an instance of {@link ReadChannelServicesResponse }
     * 
     */
    public ReadChannelServicesResponse createReadChannelServicesResponse() {
        return new ReadChannelServicesResponse();
    }

    /**
     * Create an instance of {@link GetEmailPropsByCardId }
     * 
     */
    public GetEmailPropsByCardId createGetEmailPropsByCardId() {
        return new GetEmailPropsByCardId();
    }

    /**
     * Create an instance of {@link CheckUserRightToSendFatturaPAOrNotifECResponse }
     * 
     */
    public CheckUserRightToSendFatturaPAOrNotifECResponse createCheckUserRightToSendFatturaPAOrNotifECResponse() {
        return new CheckUserRightToSendFatturaPAOrNotifECResponse();
    }

    /**
     * Create an instance of {@link GetSendingsByCardId }
     * 
     */
    public GetSendingsByCardId createGetSendingsByCardId() {
        return new GetSendingsByCardId();
    }

    /**
     * Create an instance of {@link LoggableBase }
     * 
     */
    public LoggableBase createLoggableBase() {
        return new LoggableBase();
    }

    /**
     * Create an instance of {@link SendFatturaPAArrayResponse }
     * 
     */
    public SendFatturaPAArrayResponse createSendFatturaPAArrayResponse() {
        return new SendFatturaPAArrayResponse();
    }

    /**
     * Create an instance of {@link ArrayOfOffice }
     * 
     */
    public ArrayOfOffice createArrayOfOffice() {
        return new ArrayOfOffice();
    }

    /**
     * Create an instance of {@link SessionInfo }
     * 
     */
    public SessionInfo createSessionInfo() {
        return new SessionInfo();
    }

    /**
     * Create an instance of {@link FieldChannelKeySend }
     * 
     */
    public FieldChannelKeySend createFieldChannelKeySend() {
        return new FieldChannelKeySend();
    }

    /**
     * Create an instance of {@link ReplyResponse }
     * 
     */
    public ReplyResponse createReplyResponse() {
        return new ReplyResponse();
    }

    /**
     * Create an instance of {@link Recipient }
     * 
     */
    public Recipient createRecipient() {
        return new Recipient();
    }

    /**
     * Create an instance of {@link GetInboxMsgByCardIDResponse }
     * 
     */
    public GetInboxMsgByCardIDResponse createGetInboxMsgByCardIDResponse() {
        return new GetInboxMsgByCardIDResponse();
    }

    /**
     * Create an instance of {@link SentResponse }
     * 
     */
    public SentResponse createSentResponse() {
        return new SentResponse();
    }

    /**
     * Create an instance of {@link ArrayOfCheckInfoFatturaPA }
     * 
     */
    public ArrayOfCheckInfoFatturaPA createArrayOfCheckInfoFatturaPA() {
        return new ArrayOfCheckInfoFatturaPA();
    }

    /**
     * Create an instance of {@link SearchSendings }
     * 
     */
    public SearchSendings createSearchSendings() {
        return new SearchSendings();
    }

    /**
     * Create an instance of {@link GetSendingCountByCardIdResponse }
     * 
     */
    public GetSendingCountByCardIdResponse createGetSendingCountByCardIdResponse() {
        return new GetSendingCountByCardIdResponse();
    }

    /**
     * Create an instance of {@link ArrayOfEMailAddressee }
     * 
     */
    public ArrayOfEMailAddressee createArrayOfEMailAddressee() {
        return new ArrayOfEMailAddressee();
    }

    /**
     * Create an instance of {@link UserRight }
     * 
     */
    public UserRight createUserRight() {
        return new UserRight();
    }

    /**
     * Create an instance of {@link Reply }
     * 
     */
    public Reply createReply() {
        return new Reply();
    }

    /**
     * Create an instance of {@link EMailBase }
     * 
     */
    public EMailBase createEMailBase() {
        return new EMailBase();
    }

    /**
     * Create an instance of {@link ServiceChannel }
     * 
     */
    public ServiceChannel createServiceChannel() {
        return new ServiceChannel();
    }

    /**
     * Create an instance of {@link ArrayOfMessage }
     * 
     */
    public ArrayOfMessage createArrayOfMessage() {
        return new ArrayOfMessage();
    }

    /**
     * Create an instance of {@link BaseInput }
     * 
     */
    public BaseInput createBaseInput() {
        return new BaseInput();
    }

    /**
     * Create an instance of {@link User }
     * 
     */
    public User createUser() {
        return new User();
    }

    /**
     * Create an instance of {@link UpdateCreatedSending }
     * 
     */
    public UpdateCreatedSending createUpdateCreatedSending() {
        return new UpdateCreatedSending();
    }

    /**
     * Create an instance of {@link SendFatturaPAResponse }
     * 
     */
    public SendFatturaPAResponse createSendFatturaPAResponse() {
        return new SendFatturaPAResponse();
    }

    /**
     * Create an instance of {@link UpdateCreatedSendingResponse }
     * 
     */
    public UpdateCreatedSendingResponse createUpdateCreatedSendingResponse() {
        return new UpdateCreatedSendingResponse();
    }

    /**
     * Create an instance of {@link UploadFileResponse }
     * 
     */
    public UploadFileResponse createUploadFileResponse() {
        return new UploadFileResponse();
    }

    /**
     * Create an instance of {@link GetEmailPropsByCardIdInput }
     * 
     */
    public GetEmailPropsByCardIdInput createGetEmailPropsByCardIdInput() {
        return new GetEmailPropsByCardIdInput();
    }

    /**
     * Create an instance of {@link ArrayOfUserRight }
     * 
     */
    public ArrayOfUserRight createArrayOfUserRight() {
        return new ArrayOfUserRight();
    }

    /**
     * Create an instance of {@link CheckUserRightToSendFatturaPAOrNotifEC }
     * 
     */
    public CheckUserRightToSendFatturaPAOrNotifEC createCheckUserRightToSendFatturaPAOrNotifEC() {
        return new CheckUserRightToSendFatturaPAOrNotifEC();
    }

    /**
     * Create an instance of {@link AgrafEntityId }
     * 
     */
    public AgrafEntityId createAgrafEntityId() {
        return new AgrafEntityId();
    }

    /**
     * Create an instance of {@link AgrafSearchCriteria }
     * 
     */
    public AgrafSearchCriteria createAgrafSearchCriteria() {
        return new AgrafSearchCriteria();
    }

    /**
     * Create an instance of {@link AddSendingContacts }
     * 
     */
    public AddSendingContacts createAddSendingContacts() {
        return new AddSendingContacts();
    }

    /**
     * Create an instance of {@link DeleteSendingContactsIdResponse }
     * 
     */
    public DeleteSendingContactsIdResponse createDeleteSendingContactsIdResponse() {
        return new DeleteSendingContactsIdResponse();
    }

    /**
     * Create an instance of {@link GetInboxMsgByCardID }
     * 
     */
    public GetInboxMsgByCardID createGetInboxMsgByCardID() {
        return new GetInboxMsgByCardID();
    }

    /**
     * Create an instance of {@link UserRightsConfig }
     * 
     */
    public UserRightsConfig createUserRightsConfig() {
        return new UserRightsConfig();
    }

    /**
     * Create an instance of {@link GetEmailPropsByCardIdResponse }
     * 
     */
    public GetEmailPropsByCardIdResponse createGetEmailPropsByCardIdResponse() {
        return new GetEmailPropsByCardIdResponse();
    }

    /**
     * Create an instance of {@link CheckUserRightToSendFatturaPA }
     * 
     */
    public CheckUserRightToSendFatturaPA createCheckUserRightToSendFatturaPA() {
        return new CheckUserRightToSendFatturaPA();
    }

    /**
     * Create an instance of {@link ArrayOfSending }
     * 
     */
    public ArrayOfSending createArrayOfSending() {
        return new ArrayOfSending();
    }

    /**
     * Create an instance of {@link ReplyInboxProtocol2Response }
     * 
     */
    public ReplyInboxProtocol2Response createReplyInboxProtocol2Response() {
        return new ReplyInboxProtocol2Response();
    }

    /**
     * Create an instance of {@link DeleteSending }
     * 
     */
    public DeleteSending createDeleteSending() {
        return new DeleteSending();
    }

    /**
     * Create an instance of {@link ReplyInboxProtocol }
     * 
     */
    public ReplyInboxProtocol createReplyInboxProtocol() {
        return new ReplyInboxProtocol();
    }

    /**
     * Create an instance of {@link PostingMailServiceMaxRecipientsFault }
     * 
     */
    public PostingMailServiceMaxRecipientsFault createPostingMailServiceMaxRecipientsFault() {
        return new PostingMailServiceMaxRecipientsFault();
    }

    /**
     * Create an instance of {@link SendEx }
     * 
     */
    public SendEx createSendEx() {
        return new SendEx();
    }

    /**
     * Create an instance of {@link Entity }
     * 
     */
    public Entity createEntity() {
        return new Entity();
    }

    /**
     * Create an instance of {@link GroupChart }
     * 
     */
    public GroupChart createGroupChart() {
        return new GroupChart();
    }

    /**
     * Create an instance of {@link SendNotificationEC }
     * 
     */
    public SendNotificationEC createSendNotificationEC() {
        return new SendNotificationEC();
    }

    /**
     * Create an instance of {@link ReadChnlFieldKeysSend }
     * 
     */
    public ReadChnlFieldKeysSend createReadChnlFieldKeysSend() {
        return new ReadChnlFieldKeysSend();
    }

    /**
     * Create an instance of {@link InvalidSessionFault }
     * 
     */
    public InvalidSessionFault createInvalidSessionFault() {
        return new InvalidSessionFault();
    }

    /**
     * Create an instance of {@link ReplyInboxProtocolResponse }
     * 
     */
    public ReplyInboxProtocolResponse createReplyInboxProtocolResponse() {
        return new ReplyInboxProtocolResponse();
    }

    /**
     * Create an instance of {@link Message }
     * 
     */
    public Message createMessage() {
        return new Message();
    }

    /**
     * Create an instance of {@link ArrayOfUser }
     * 
     */
    public ArrayOfUser createArrayOfUser() {
        return new ArrayOfUser();
    }

    /**
     * Create an instance of {@link SearchAgrafEntityId }
     * 
     */
    public SearchAgrafEntityId createSearchAgrafEntityId() {
        return new SearchAgrafEntityId();
    }

    /**
     * Create an instance of {@link GetSendingsByCardIdResponse }
     * 
     */
    public GetSendingsByCardIdResponse createGetSendingsByCardIdResponse() {
        return new GetSendingsByCardIdResponse();
    }

    /**
     * Create an instance of {@link ReadChnlFieldKeysRecvResponse }
     * 
     */
    public ReadChnlFieldKeysRecvResponse createReadChnlFieldKeysRecvResponse() {
        return new ReadChnlFieldKeysRecvResponse();
    }

    /**
     * Create an instance of {@link Forward }
     * 
     */
    public Forward createForward() {
        return new Forward();
    }

    /**
     * Create an instance of {@link Send2 }
     * 
     */
    public Send2 createSend2() {
        return new Send2();
    }

    /**
     * Create an instance of {@link DeleteCardSending }
     * 
     */
    public DeleteCardSending createDeleteCardSending() {
        return new DeleteCardSending();
    }

    /**
     * Create an instance of {@link SearchSendingsResponse }
     * 
     */
    public SearchSendingsResponse createSearchSendingsResponse() {
        return new SearchSendingsResponse();
    }

    /**
     * Create an instance of {@link CreateMailServiceSending }
     * 
     */
    public CreateMailServiceSending createCreateMailServiceSending() {
        return new CreateMailServiceSending();
    }

    /**
     * Create an instance of {@link Sent }
     * 
     */
    public Sent createSent() {
        return new Sent();
    }

    /**
     * Create an instance of {@link ReadChannelServices }
     * 
     */
    public ReadChannelServices createReadChannelServices() {
        return new ReadChannelServices();
    }

    /**
     * Create an instance of {@link ArrayOfOfficeChart }
     * 
     */
    public ArrayOfOfficeChart createArrayOfOfficeChart() {
        return new ArrayOfOfficeChart();
    }

    /**
     * Create an instance of {@link AddSendingContactsResponse }
     * 
     */
    public AddSendingContactsResponse createAddSendingContactsResponse() {
        return new AddSendingContactsResponse();
    }

    /**
     * Create an instance of {@link Reply2Response }
     * 
     */
    public Reply2Response createReply2Response() {
        return new Reply2Response();
    }

    /**
     * Create an instance of {@link IsInBoxProtocol }
     * 
     */
    public IsInBoxProtocol createIsInBoxProtocol() {
        return new IsInBoxProtocol();
    }

    /**
     * Create an instance of {@link PostingFault }
     * 
     */
    public PostingFault createPostingFault() {
        return new PostingFault();
    }

    /**
     * Create an instance of {@link CheckUserRightToSendFatturaPAArray }
     * 
     */
    public CheckUserRightToSendFatturaPAArray createCheckUserRightToSendFatturaPAArray() {
        return new CheckUserRightToSendFatturaPAArray();
    }

    /**
     * Create an instance of {@link Send }
     * 
     */
    public Send createSend() {
        return new Send();
    }

    /**
     * Create an instance of {@link CreateSending }
     * 
     */
    public CreateSending createCreateSending() {
        return new CreateSending();
    }

    /**
     * Create an instance of {@link CreateMailServiceSendingResponse }
     * 
     */
    public CreateMailServiceSendingResponse createCreateMailServiceSendingResponse() {
        return new CreateMailServiceSendingResponse();
    }

    /**
     * Create an instance of {@link Forward2Response }
     * 
     */
    public Forward2Response createForward2Response() {
        return new Forward2Response();
    }

    /**
     * Create an instance of {@link Reply2 }
     * 
     */
    public Reply2 createReply2() {
        return new Reply2();
    }

    /**
     * Create an instance of {@link CheckUserRightToSendFatturaPAArrayResponse }
     * 
     */
    public CheckUserRightToSendFatturaPAArrayResponse createCheckUserRightToSendFatturaPAArrayResponse() {
        return new CheckUserRightToSendFatturaPAArrayResponse();
    }

    /**
     * Create an instance of {@link ReplyInboxProtocol2 }
     * 
     */
    public ReplyInboxProtocol2 createReplyInboxProtocol2() {
        return new ReplyInboxProtocol2();
    }

    /**
     * Create an instance of {@link DeleteCardSendingResponse }
     * 
     */
    public DeleteCardSendingResponse createDeleteCardSendingResponse() {
        return new DeleteCardSendingResponse();
    }

    /**
     * Create an instance of {@link FieldChannelKeyAttributes }
     * 
     */
    public FieldChannelKeyAttributes createFieldChannelKeyAttributes() {
        return new FieldChannelKeyAttributes();
    }

    /**
     * Create an instance of {@link EMailIn }
     * 
     */
    public EMailIn createEMailIn() {
        return new EMailIn();
    }

    /**
     * Create an instance of {@link SendEx2Response }
     * 
     */
    public SendEx2Response createSendEx2Response() {
        return new SendEx2Response();
    }

    /**
     * Create an instance of {@link CreateMailServiceSendingInput }
     * 
     */
    public CreateMailServiceSendingInput createCreateMailServiceSendingInput() {
        return new CreateMailServiceSendingInput();
    }

    /**
     * Create an instance of {@link BaseFault }
     * 
     */
    public BaseFault createBaseFault() {
        return new BaseFault();
    }

    /**
     * Create an instance of {@link Group }
     * 
     */
    public Group createGroup() {
        return new Group();
    }

    /**
     * Create an instance of {@link ArrayOfRecipient }
     * 
     */
    public ArrayOfRecipient createArrayOfRecipient() {
        return new ArrayOfRecipient();
    }

    /**
     * Create an instance of {@link GetSendingByIdResponse }
     * 
     */
    public GetSendingByIdResponse createGetSendingByIdResponse() {
        return new GetSendingByIdResponse();
    }

    /**
     * Create an instance of {@link ForwardResponse }
     * 
     */
    public ForwardResponse createForwardResponse() {
        return new ForwardResponse();
    }

    /**
     * Create an instance of {@link Forward2 }
     * 
     */
    public Forward2 createForward2() {
        return new Forward2();
    }

    /**
     * Create an instance of {@link CreateMailServiceSendingOutput }
     * 
     */
    public CreateMailServiceSendingOutput createCreateMailServiceSendingOutput() {
        return new CreateMailServiceSendingOutput();
    }

    /**
     * Create an instance of {@link EMail }
     * 
     */
    public EMail createEMail() {
        return new EMail();
    }

    /**
     * Create an instance of {@link ArrayOfSendingCategory }
     * 
     */
    public ArrayOfSendingCategory createArrayOfSendingCategory() {
        return new ArrayOfSendingCategory();
    }

    /**
     * Create an instance of {@link SendingSearchCriteria }
     * 
     */
    public SendingSearchCriteria createSendingSearchCriteria() {
        return new SendingSearchCriteria();
    }

    /**
     * Create an instance of {@link ArrayOfFieldChannelKeyRecv }
     * 
     */
    public ArrayOfFieldChannelKeyRecv createArrayOfFieldChannelKeyRecv() {
        return new ArrayOfFieldChannelKeyRecv();
    }

    /**
     * Create an instance of {@link CreateSendingWithContactsResponse }
     * 
     */
    public CreateSendingWithContactsResponse createCreateSendingWithContactsResponse() {
        return new CreateSendingWithContactsResponse();
    }

    /**
     * Create an instance of {@link SendingParams }
     * 
     */
    public SendingParams createSendingParams() {
        return new SendingParams();
    }

    /**
     * Create an instance of {@link CreateSendingResponse }
     * 
     */
    public CreateSendingResponse createCreateSendingResponse() {
        return new CreateSendingResponse();
    }

    /**
     * Create an instance of {@link DeleteSendingContactsId }
     * 
     */
    public DeleteSendingContactsId createDeleteSendingContactsId() {
        return new DeleteSendingContactsId();
    }

    /**
     * Create an instance of {@link ArrayOfSearchAgrafEntityId }
     * 
     */
    public ArrayOfSearchAgrafEntityId createArrayOfSearchAgrafEntityId() {
        return new ArrayOfSearchAgrafEntityId();
    }

    /**
     * Create an instance of {@link ArrayOfFieldChannelKeySend }
     * 
     */
    public ArrayOfFieldChannelKeySend createArrayOfFieldChannelKeySend() {
        return new ArrayOfFieldChannelKeySend();
    }

    /**
     * Create an instance of {@link UploadFile }
     * 
     */
    public UploadFile createUploadFile() {
        return new UploadFile();
    }

    /**
     * Create an instance of {@link ParamValidationFault }
     * 
     */
    public ParamValidationFault createParamValidationFault() {
        return new ParamValidationFault();
    }

    /**
     * Create an instance of {@link ArrayOfguid }
     * 
     */
    public ArrayOfguid createArrayOfguid() {
        return new ArrayOfguid();
    }

    /**
     * Create an instance of {@link SendEx2 }
     * 
     */
    public SendEx2 createSendEx2() {
        return new SendEx2();
    }

    /**
     * Create an instance of {@link CheckUserRightToSendFatturaPAResponse }
     * 
     */
    public CheckUserRightToSendFatturaPAResponse createCheckUserRightToSendFatturaPAResponse() {
        return new CheckUserRightToSendFatturaPAResponse();
    }

    /**
     * Create an instance of {@link CreateSendingWithContacts }
     * 
     */
    public CreateSendingWithContacts createCreateSendingWithContacts() {
        return new CreateSendingWithContacts();
    }

    /**
     * Create an instance of {@link SendResponse }
     * 
     */
    public SendResponse createSendResponse() {
        return new SendResponse();
    }

    /**
     * Create an instance of {@link EMailAttachment }
     * 
     */
    public EMailAttachment createEMailAttachment() {
        return new EMailAttachment();
    }

    /**
     * Create an instance of {@link ArrayOfEMailAttachment }
     * 
     */
    public ArrayOfEMailAttachment createArrayOfEMailAttachment() {
        return new ArrayOfEMailAttachment();
    }

    /**
     * Create an instance of {@link ArrayOfSearchAgrafOptionsTag }
     * 
     */
    public ArrayOfSearchAgrafOptionsTag createArrayOfSearchAgrafOptionsTag() {
        return new ArrayOfSearchAgrafOptionsTag();
    }

    /**
     * Create an instance of {@link SendFatturaPAArray }
     * 
     */
    public SendFatturaPAArray createSendFatturaPAArray() {
        return new SendFatturaPAArray();
    }

    /**
     * Create an instance of {@link SendFatturaPA }
     * 
     */
    public SendFatturaPA createSendFatturaPA() {
        return new SendFatturaPA();
    }

    /**
     * Create an instance of {@link CreateServiceChannelResponse }
     * 
     */
    public CreateServiceChannelResponse createCreateServiceChannelResponse() {
        return new CreateServiceChannelResponse();
    }

    /**
     * Create an instance of {@link MailServiceSending }
     * 
     */
    public MailServiceSending createMailServiceSending() {
        return new MailServiceSending();
    }

    /**
     * Create an instance of {@link ArrayOfstring }
     * 
     */
    public ArrayOfstring createArrayOfstring() {
        return new ArrayOfstring();
    }

    /**
     * Create an instance of {@link BaseOutput }
     * 
     */
    public BaseOutput createBaseOutput() {
        return new BaseOutput();
    }

    /**
     * Create an instance of {@link PostingMailServiceNoSenderFault }
     * 
     */
    public PostingMailServiceNoSenderFault createPostingMailServiceNoSenderFault() {
        return new PostingMailServiceNoSenderFault();
    }

    /**
     * Create an instance of {@link OfficeChart }
     * 
     */
    public OfficeChart createOfficeChart() {
        return new OfficeChart();
    }

    /**
     * Create an instance of {@link CreateServiceChannel }
     * 
     */
    public CreateServiceChannel createCreateServiceChannel() {
        return new CreateServiceChannel();
    }

    /**
     * Create an instance of {@link CheckUserRightToSendNotificationEC }
     * 
     */
    public CheckUserRightToSendNotificationEC createCheckUserRightToSendNotificationEC() {
        return new CheckUserRightToSendNotificationEC();
    }

    /**
     * Create an instance of {@link FieldChannelKeyRecv }
     * 
     */
    public FieldChannelKeyRecv createFieldChannelKeyRecv() {
        return new FieldChannelKeyRecv();
    }

    /**
     * Create an instance of {@link GetSendingById }
     * 
     */
    public GetSendingById createGetSendingById() {
        return new GetSendingById();
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
     * Create an instance of {@link JAXBElement }{@code <}{@link ArrayOfSendingCategory }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://schemas.datacontract.org/2004/07/SIAV.Archiflow.Entities.Types", name = "ArrayOfSendingCategory")
    public JAXBElement<ArrayOfSendingCategory> createArrayOfSendingCategory(ArrayOfSendingCategory value) {
        return new JAXBElement<ArrayOfSendingCategory>(_ArrayOfSendingCategory_QNAME, ArrayOfSendingCategory.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link ArrayOfFieldChannelKeySend }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://schemas.datacontract.org/2004/07/SIAV.Archiflow.Entities.Posting.ValueObject", name = "ArrayOfFieldChannelKeySend")
    public JAXBElement<ArrayOfFieldChannelKeySend> createArrayOfFieldChannelKeySend(ArrayOfFieldChannelKeySend value) {
        return new JAXBElement<ArrayOfFieldChannelKeySend>(_ArrayOfFieldChannelKeySend_QNAME, ArrayOfFieldChannelKeySend.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link ArrayOfSearchAgrafEntityId }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://schemas.datacontract.org/2004/07/SIAV.Archiflow.Entities.Agraf.ValueObject", name = "ArrayOfSearchAgrafEntityId")
    public JAXBElement<ArrayOfSearchAgrafEntityId> createArrayOfSearchAgrafEntityId(ArrayOfSearchAgrafEntityId value) {
        return new JAXBElement<ArrayOfSearchAgrafEntityId>(_ArrayOfSearchAgrafEntityId_QNAME, ArrayOfSearchAgrafEntityId.class, null, value);
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
     * Create an instance of {@link JAXBElement }{@code <}{@link BaseFault }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://schemas.datacontract.org/2004/07/SIAV.Archiflow.Faults", name = "BaseFault")
    public JAXBElement<BaseFault> createBaseFault(BaseFault value) {
        return new JAXBElement<BaseFault>(_BaseFault_QNAME, BaseFault.class, null, value);
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
     * Create an instance of {@link JAXBElement }{@code <}{@link StatoFatturaPAIN }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://schemas.datacontract.org/2004/07/SIAV.Archiflow.Entities.Types", name = "StatoFatturaPA_IN")
    public JAXBElement<StatoFatturaPAIN> createStatoFatturaPAIN(StatoFatturaPAIN value) {
        return new JAXBElement<StatoFatturaPAIN>(_StatoFatturaPAIN_QNAME, StatoFatturaPAIN.class, null, value);
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
     * Create an instance of {@link JAXBElement }{@code <}{@link PostingFault }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://schemas.datacontract.org/2004/07/SIAV.Archiflow.Faults", name = "PostingFault")
    public JAXBElement<PostingFault> createPostingFault(PostingFault value) {
        return new JAXBElement<PostingFault>(_PostingFault_QNAME, PostingFault.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link ArrayOfSearchAgrafOptionsTag }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://schemas.datacontract.org/2004/07/SIAV.Archiflow.Entities.Agraf.ValueObject", name = "ArrayOfSearchAgrafOptionsTag")
    public JAXBElement<ArrayOfSearchAgrafOptionsTag> createArrayOfSearchAgrafOptionsTag(ArrayOfSearchAgrafOptionsTag value) {
        return new JAXBElement<ArrayOfSearchAgrafOptionsTag>(_ArrayOfSearchAgrafOptionsTag_QNAME, ArrayOfSearchAgrafOptionsTag.class, null, value);
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
     * Create an instance of {@link JAXBElement }{@code <}{@link Object }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://schemas.microsoft.com/2003/10/Serialization/", name = "anyType")
    public JAXBElement<Object> createAnyType(Object value) {
        return new JAXBElement<Object>(_AnyType_QNAME, Object.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link List }{@code <}{@link String }{@code >}{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://schemas.datacontract.org/2004/07/SIAV.Archiflow.Entities.Types", name = "SendOption")
    public JAXBElement<List<String>> createSendOption(List<String> value) {
        return new JAXBElement<List<String>>(_SendOption_QNAME, ((Class) List.class), null, ((List<String> ) value));
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link ArrayOfCheckInfoFatturaPA }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://schemas.datacontract.org/2004/07/SIAV.Archiflow.Entities.Posting.ValueObject", name = "ArrayOfCheckInfoFatturaPA")
    public JAXBElement<ArrayOfCheckInfoFatturaPA> createArrayOfCheckInfoFatturaPA(ArrayOfCheckInfoFatturaPA value) {
        return new JAXBElement<ArrayOfCheckInfoFatturaPA>(_ArrayOfCheckInfoFatturaPA_QNAME, ArrayOfCheckInfoFatturaPA.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link ArrayOfEMailAddressee }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://schemas.datacontract.org/2004/07/SIAV.Archiflow.Entities.Posting.ValueObject", name = "ArrayOfEMailAddressee")
    public JAXBElement<ArrayOfEMailAddressee> createArrayOfEMailAddressee(ArrayOfEMailAddressee value) {
        return new JAXBElement<ArrayOfEMailAddressee>(_ArrayOfEMailAddressee_QNAME, ArrayOfEMailAddressee.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link EMailSendRet }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://schemas.datacontract.org/2004/07/SIAV.Archiflow.Entities.Types", name = "EMailSendRet")
    public JAXBElement<EMailSendRet> createEMailSendRet(EMailSendRet value) {
        return new JAXBElement<EMailSendRet>(_EMailSendRet_QNAME, EMailSendRet.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link AgrafEntityType }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://schemas.datacontract.org/2004/07/SIAV.Archiflow.Entities.Types", name = "AgrafEntityType")
    public JAXBElement<AgrafEntityType> createAgrafEntityType(AgrafEntityType value) {
        return new JAXBElement<AgrafEntityType>(_AgrafEntityType_QNAME, AgrafEntityType.class, null, value);
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
     * Create an instance of {@link JAXBElement }{@code <}{@link InvalidSessionFault }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://schemas.datacontract.org/2004/07/SIAV.Archiflow.Faults", name = "InvalidSessionFault")
    public JAXBElement<InvalidSessionFault> createInvalidSessionFault(InvalidSessionFault value) {
        return new JAXBElement<InvalidSessionFault>(_InvalidSessionFault_QNAME, InvalidSessionFault.class, null, value);
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
     * Create an instance of {@link JAXBElement }{@code <}{@link EMailVisProtType }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://schemas.datacontract.org/2004/07/SIAV.Archiflow.Entities.Types", name = "EMailVisProtType")
    public JAXBElement<EMailVisProtType> createEMailVisProtType(EMailVisProtType value) {
        return new JAXBElement<EMailVisProtType>(_EMailVisProtType_QNAME, EMailVisProtType.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link EMailAddressee }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://schemas.datacontract.org/2004/07/SIAV.Archiflow.Entities.Posting.ValueObject", name = "EMailAddressee")
    public JAXBElement<EMailAddressee> createEMailAddressee(EMailAddressee value) {
        return new JAXBElement<EMailAddressee>(_EMailAddressee_QNAME, EMailAddressee.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link FieldChannelKeySend }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://schemas.datacontract.org/2004/07/SIAV.Archiflow.Entities.Posting.ValueObject", name = "FieldChannelKeySend")
    public JAXBElement<FieldChannelKeySend> createFieldChannelKeySend(FieldChannelKeySend value) {
        return new JAXBElement<FieldChannelKeySend>(_FieldChannelKeySend_QNAME, FieldChannelKeySend.class, null, value);
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
     * Create an instance of {@link JAXBElement }{@code <}{@link PostingMailServiceNoSenderFault }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://schemas.datacontract.org/2004/07/SIAV.Archiflow.Faults", name = "PostingMailServiceNoSenderFault")
    public JAXBElement<PostingMailServiceNoSenderFault> createPostingMailServiceNoSenderFault(PostingMailServiceNoSenderFault value) {
        return new JAXBElement<PostingMailServiceNoSenderFault>(_PostingMailServiceNoSenderFault_QNAME, PostingMailServiceNoSenderFault.class, null, value);
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
     * Create an instance of {@link JAXBElement }{@code <}{@link Integer }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://schemas.microsoft.com/2003/10/Serialization/", name = "unsignedShort")
    public JAXBElement<Integer> createUnsignedShort(Integer value) {
        return new JAXBElement<Integer>(_UnsignedShort_QNAME, Integer.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link ArrayOfSending }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://schemas.datacontract.org/2004/07/SIAV.Archiflow.Entities.Posting.ValueObject", name = "ArrayOfSending")
    public JAXBElement<ArrayOfSending> createArrayOfSending(ArrayOfSending value) {
        return new JAXBElement<ArrayOfSending>(_ArrayOfSending_QNAME, ArrayOfSending.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link EMail }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://schemas.datacontract.org/2004/07/SIAV.Archiflow.Entities.Posting.ValueObject", name = "EMail")
    public JAXBElement<EMail> createEMail(EMail value) {
        return new JAXBElement<EMail>(_EMail_QNAME, EMail.class, null, value);
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
     * Create an instance of {@link JAXBElement }{@code <}{@link Sending }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://schemas.datacontract.org/2004/07/SIAV.Archiflow.Entities.Posting.ValueObject", name = "Sending")
    public JAXBElement<Sending> createSending(Sending value) {
        return new JAXBElement<Sending>(_Sending_QNAME, Sending.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link GetEmailPropsByCardIdInput }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://schemas.datacontract.org/2004/07/SIAV.Archiflow.Posting.ValueObject", name = "GetEmailPropsByCardIdInput")
    public JAXBElement<GetEmailPropsByCardIdInput> createGetEmailPropsByCardIdInput(GetEmailPropsByCardIdInput value) {
        return new JAXBElement<GetEmailPropsByCardIdInput>(_GetEmailPropsByCardIdInput_QNAME, GetEmailPropsByCardIdInput.class, null, value);
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
     * Create an instance of {@link JAXBElement }{@code <}{@link EMailIn }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://schemas.datacontract.org/2004/07/SIAV.Archiflow.Entities.Posting.ValueObject", name = "EMailIn")
    public JAXBElement<EMailIn> createEMailIn(EMailIn value) {
        return new JAXBElement<EMailIn>(_EMailIn_QNAME, EMailIn.class, null, value);
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
     * Create an instance of {@link JAXBElement }{@code <}{@link AgrafEntityId }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://schemas.datacontract.org/2004/07/SIAV.Archiflow.Entities.Agraf.ValueObject", name = "AgrafEntityId")
    public JAXBElement<AgrafEntityId> createAgrafEntityId(AgrafEntityId value) {
        return new JAXBElement<AgrafEntityId>(_AgrafEntityId_QNAME, AgrafEntityId.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link PostingFieldKeyDirection }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://schemas.datacontract.org/2004/07/SIAV.Archiflow.Entities.Types", name = "PostingFieldKeyDirection")
    public JAXBElement<PostingFieldKeyDirection> createPostingFieldKeyDirection(PostingFieldKeyDirection value) {
        return new JAXBElement<PostingFieldKeyDirection>(_PostingFieldKeyDirection_QNAME, PostingFieldKeyDirection.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link PostingMailServiceNoRecipientsFault }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://schemas.datacontract.org/2004/07/SIAV.Archiflow.Faults", name = "PostingMailServiceNoRecipientsFault")
    public JAXBElement<PostingMailServiceNoRecipientsFault> createPostingMailServiceNoRecipientsFault(PostingMailServiceNoRecipientsFault value) {
        return new JAXBElement<PostingMailServiceNoRecipientsFault>(_PostingMailServiceNoRecipientsFault_QNAME, PostingMailServiceNoRecipientsFault.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link FieldChannelKeyRecv }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://schemas.datacontract.org/2004/07/SIAV.Archiflow.Entities.Posting.ValueObject", name = "FieldChannelKeyRecv")
    public JAXBElement<FieldChannelKeyRecv> createFieldChannelKeyRecv(FieldChannelKeyRecv value) {
        return new JAXBElement<FieldChannelKeyRecv>(_FieldChannelKeyRecv_QNAME, FieldChannelKeyRecv.class, null, value);
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
     * Create an instance of {@link JAXBElement }{@code <}{@link ParamValidationFault }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://schemas.datacontract.org/2004/07/SIAV.Archiflow.Faults", name = "ParamValidationFault")
    public JAXBElement<ParamValidationFault> createParamValidationFault(ParamValidationFault value) {
        return new JAXBElement<ParamValidationFault>(_ParamValidationFault_QNAME, ParamValidationFault.class, null, value);
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
     * Create an instance of {@link JAXBElement }{@code <}{@link NotificationECType }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://schemas.datacontract.org/2004/07/SIAV.Archiflow.Entities.Types", name = "NotificationECType")
    public JAXBElement<NotificationECType> createNotificationECType(NotificationECType value) {
        return new JAXBElement<NotificationECType>(_NotificationECType_QNAME, NotificationECType.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link ArrayOfRecipient }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://schemas.datacontract.org/2004/07/SIAV.Archiflow.Entities.Posting.ValueObject", name = "ArrayOfRecipient")
    public JAXBElement<ArrayOfRecipient> createArrayOfRecipient(ArrayOfRecipient value) {
        return new JAXBElement<ArrayOfRecipient>(_ArrayOfRecipient_QNAME, ArrayOfRecipient.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link EmailAddressType }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://schemas.datacontract.org/2004/07/SIAV.Archiflow.Entities.Types", name = "EmailAddressType")
    public JAXBElement<EmailAddressType> createEmailAddressType(EmailAddressType value) {
        return new JAXBElement<EmailAddressType>(_EmailAddressType_QNAME, EmailAddressType.class, null, value);
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
     * Create an instance of {@link JAXBElement }{@code <}{@link Message }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://schemas.datacontract.org/2004/07/SIAV.Archiflow.Entities.Posting.ValueObject", name = "Message")
    public JAXBElement<Message> createMessage(Message value) {
        return new JAXBElement<Message>(_Message_QNAME, Message.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link PostingMailServiceMaxRecipientsFault }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://schemas.datacontract.org/2004/07/SIAV.Archiflow.Faults", name = "PostingMailServiceMaxRecipientsFault")
    public JAXBElement<PostingMailServiceMaxRecipientsFault> createPostingMailServiceMaxRecipientsFault(PostingMailServiceMaxRecipientsFault value) {
        return new JAXBElement<PostingMailServiceMaxRecipientsFault>(_PostingMailServiceMaxRecipientsFault_QNAME, PostingMailServiceMaxRecipientsFault.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link MailServiceSendingState }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://schemas.datacontract.org/2004/07/SIAV.Archiflow.Entities.Types", name = "MailServiceSendingState")
    public JAXBElement<MailServiceSendingState> createMailServiceSendingState(MailServiceSendingState value) {
        return new JAXBElement<MailServiceSendingState>(_MailServiceSendingState_QNAME, MailServiceSendingState.class, null, value);
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
     * Create an instance of {@link JAXBElement }{@code <}{@link UserRightsConfig }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://schemas.datacontract.org/2004/07/SIAV.Archiflow.Types", name = "UserRightsConfig")
    public JAXBElement<UserRightsConfig> createUserRightsConfig(UserRightsConfig value) {
        return new JAXBElement<UserRightsConfig>(_UserRightsConfig_QNAME, UserRightsConfig.class, null, value);
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
     * Create an instance of {@link JAXBElement }{@code <}{@link SendingParams }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://schemas.datacontract.org/2004/07/SIAV.Archiflow.Entities.Posting.ValueObject", name = "SendingParams")
    public JAXBElement<SendingParams> createSendingParams(SendingParams value) {
        return new JAXBElement<SendingParams>(_SendingParams_QNAME, SendingParams.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link SendingCategory }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://schemas.datacontract.org/2004/07/SIAV.Archiflow.Entities.Types", name = "SendingCategory")
    public JAXBElement<SendingCategory> createSendingCategory(SendingCategory value) {
        return new JAXBElement<SendingCategory>(_SendingCategory_QNAME, SendingCategory.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link ArrayOfFieldChannelKeyAttributes }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://schemas.datacontract.org/2004/07/SIAV.Archiflow.Entities.Posting.ValueObject", name = "ArrayOfFieldChannelKeyAttributes")
    public JAXBElement<ArrayOfFieldChannelKeyAttributes> createArrayOfFieldChannelKeyAttributes(ArrayOfFieldChannelKeyAttributes value) {
        return new JAXBElement<ArrayOfFieldChannelKeyAttributes>(_ArrayOfFieldChannelKeyAttributes_QNAME, ArrayOfFieldChannelKeyAttributes.class, null, value);
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
     * Create an instance of {@link JAXBElement }{@code <}{@link GetEmailPropsByCardIdOutput }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://schemas.datacontract.org/2004/07/SIAV.Archiflow.Posting.ValueObject", name = "GetEmailPropsByCardIdOutput")
    public JAXBElement<GetEmailPropsByCardIdOutput> createGetEmailPropsByCardIdOutput(GetEmailPropsByCardIdOutput value) {
        return new JAXBElement<GetEmailPropsByCardIdOutput>(_GetEmailPropsByCardIdOutput_QNAME, GetEmailPropsByCardIdOutput.class, null, value);
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
     * Create an instance of {@link JAXBElement }{@code <}{@link ArrayOfMessage }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://schemas.datacontract.org/2004/07/SIAV.Archiflow.Entities.Posting.ValueObject", name = "ArrayOfMessage")
    public JAXBElement<ArrayOfMessage> createArrayOfMessage(ArrayOfMessage value) {
        return new JAXBElement<ArrayOfMessage>(_ArrayOfMessage_QNAME, ArrayOfMessage.class, null, value);
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
     * Create an instance of {@link JAXBElement }{@code <}{@link UserRight }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://schemas.datacontract.org/2004/07/SIAV.Archiflow.Entities.Chart.ValueObject", name = "UserRight")
    public JAXBElement<UserRight> createUserRight(UserRight value) {
        return new JAXBElement<UserRight>(_UserRight_QNAME, UserRight.class, null, value);
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
     * Create an instance of {@link JAXBElement }{@code <}{@link LoggableBase }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://schemas.datacontract.org/2004/07/SIAV.Common.Tools.Log", name = "LoggableBase")
    public JAXBElement<LoggableBase> createLoggableBase(LoggableBase value) {
        return new JAXBElement<LoggableBase>(_LoggableBase_QNAME, LoggableBase.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link ArrayOfServiceChannel }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://schemas.datacontract.org/2004/07/SIAV.Archiflow.Entities.Posting.ValueObject", name = "ArrayOfServiceChannel")
    public JAXBElement<ArrayOfServiceChannel> createArrayOfServiceChannel(ArrayOfServiceChannel value) {
        return new JAXBElement<ArrayOfServiceChannel>(_ArrayOfServiceChannel_QNAME, ArrayOfServiceChannel.class, null, value);
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
     * Create an instance of {@link JAXBElement }{@code <}{@link MailServiceSendingSeverity }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://schemas.datacontract.org/2004/07/SIAV.Archiflow.Entities.Types", name = "MailServiceSendingSeverity")
    public JAXBElement<MailServiceSendingSeverity> createMailServiceSendingSeverity(MailServiceSendingSeverity value) {
        return new JAXBElement<MailServiceSendingSeverity>(_MailServiceSendingSeverity_QNAME, MailServiceSendingSeverity.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link Recipient }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://schemas.datacontract.org/2004/07/SIAV.Archiflow.Entities.Posting.ValueObject", name = "Recipient")
    public JAXBElement<Recipient> createRecipient(Recipient value) {
        return new JAXBElement<Recipient>(_Recipient_QNAME, Recipient.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link AgrafMatchMode }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://schemas.datacontract.org/2004/07/SIAV.Archiflow.Entities.Types", name = "AgrafMatchMode")
    public JAXBElement<AgrafMatchMode> createAgrafMatchMode(AgrafMatchMode value) {
        return new JAXBElement<AgrafMatchMode>(_AgrafMatchMode_QNAME, AgrafMatchMode.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link CreateMailServiceSendingInput }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://schemas.datacontract.org/2004/07/SIAV.Archiflow.Posting.ValueObject", name = "CreateMailServiceSendingInput")
    public JAXBElement<CreateMailServiceSendingInput> createCreateMailServiceSendingInput(CreateMailServiceSendingInput value) {
        return new JAXBElement<CreateMailServiceSendingInput>(_CreateMailServiceSendingInput_QNAME, CreateMailServiceSendingInput.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link PostingFieldDataType }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://schemas.datacontract.org/2004/07/SIAV.Archiflow.Entities.Types", name = "PostingFieldDataType")
    public JAXBElement<PostingFieldDataType> createPostingFieldDataType(PostingFieldDataType value) {
        return new JAXBElement<PostingFieldDataType>(_PostingFieldDataType_QNAME, PostingFieldDataType.class, null, value);
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
     * Create an instance of {@link JAXBElement }{@code <}{@link ArrayOfFieldChannelKeyRecv }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://schemas.datacontract.org/2004/07/SIAV.Archiflow.Entities.Posting.ValueObject", name = "ArrayOfFieldChannelKeyRecv")
    public JAXBElement<ArrayOfFieldChannelKeyRecv> createArrayOfFieldChannelKeyRecv(ArrayOfFieldChannelKeyRecv value) {
        return new JAXBElement<ArrayOfFieldChannelKeyRecv>(_ArrayOfFieldChannelKeyRecv_QNAME, ArrayOfFieldChannelKeyRecv.class, null, value);
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
     * Create an instance of {@link JAXBElement }{@code <}{@link SendingSearchCriteria }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://schemas.datacontract.org/2004/07/SIAV.Archiflow.Entities.Posting.ValueObject", name = "SendingSearchCriteria")
    public JAXBElement<SendingSearchCriteria> createSendingSearchCriteria(SendingSearchCriteria value) {
        return new JAXBElement<SendingSearchCriteria>(_SendingSearchCriteria_QNAME, SendingSearchCriteria.class, null, value);
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
     * Create an instance of {@link JAXBElement }{@code <}{@link Double }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://schemas.microsoft.com/2003/10/Serialization/", name = "double")
    public JAXBElement<Double> createDouble(Double value) {
        return new JAXBElement<Double>(_Double_QNAME, Double.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link AgrafSearchCriteria }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://schemas.datacontract.org/2004/07/SIAV.Archiflow.Entities.Agraf.ValueObject", name = "AgrafSearchCriteria")
    public JAXBElement<AgrafSearchCriteria> createAgrafSearchCriteria(AgrafSearchCriteria value) {
        return new JAXBElement<AgrafSearchCriteria>(_AgrafSearchCriteria_QNAME, AgrafSearchCriteria.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link MailServiceSending }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://schemas.datacontract.org/2004/07/SIAV.Archiflow.Entities.Posting.ValueObject", name = "MailServiceSending")
    public JAXBElement<MailServiceSending> createMailServiceSending(MailServiceSending value) {
        return new JAXBElement<MailServiceSending>(_MailServiceSending_QNAME, MailServiceSending.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link EMailAttachment }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://schemas.datacontract.org/2004/07/SIAV.Archiflow.Entities.Posting.ValueObject", name = "EMailAttachment")
    public JAXBElement<EMailAttachment> createEMailAttachment(EMailAttachment value) {
        return new JAXBElement<EMailAttachment>(_EMailAttachment_QNAME, EMailAttachment.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link SendingStatus }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://schemas.datacontract.org/2004/07/SIAV.Archiflow.Entities.Types", name = "SendingStatus")
    public JAXBElement<SendingStatus> createSendingStatus(SendingStatus value) {
        return new JAXBElement<SendingStatus>(_SendingStatus_QNAME, SendingStatus.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link EMailVisibility }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://schemas.datacontract.org/2004/07/SIAV.Archiflow.Entities.Types", name = "EMailVisibility")
    public JAXBElement<EMailVisibility> createEMailVisibility(EMailVisibility value) {
        return new JAXBElement<EMailVisibility>(_EMailVisibility_QNAME, EMailVisibility.class, null, value);
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
     * Create an instance of {@link JAXBElement }{@code <}{@link FieldChannelKeyAttributes }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://schemas.datacontract.org/2004/07/SIAV.Archiflow.Entities.Posting.ValueObject", name = "FieldChannelKeyAttributes")
    public JAXBElement<FieldChannelKeyAttributes> createFieldChannelKeyAttributes(FieldChannelKeyAttributes value) {
        return new JAXBElement<FieldChannelKeyAttributes>(_FieldChannelKeyAttributes_QNAME, FieldChannelKeyAttributes.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link UploadType }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://schemas.datacontract.org/2004/07/SIAV.Archiflow.Entities.Types", name = "UploadType")
    public JAXBElement<UploadType> createUploadType(UploadType value) {
        return new JAXBElement<UploadType>(_UploadType_QNAME, UploadType.class, null, value);
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
     * Create an instance of {@link JAXBElement }{@code <}{@link ServiceChannel }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://schemas.datacontract.org/2004/07/SIAV.Archiflow.Entities.Posting.ValueObject", name = "ServiceChannel")
    public JAXBElement<ServiceChannel> createServiceChannel(ServiceChannel value) {
        return new JAXBElement<ServiceChannel>(_ServiceChannel_QNAME, ServiceChannel.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link EMailAddrType }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://schemas.datacontract.org/2004/07/SIAV.Archiflow.Entities.Types", name = "EMailAddrType")
    public JAXBElement<EMailAddrType> createEMailAddrType(EMailAddrType value) {
        return new JAXBElement<EMailAddrType>(_EMailAddrType_QNAME, EMailAddrType.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link SearchAgrafEntityId }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://schemas.datacontract.org/2004/07/SIAV.Archiflow.Entities.Agraf.ValueObject", name = "SearchAgrafEntityId")
    public JAXBElement<SearchAgrafEntityId> createSearchAgrafEntityId(SearchAgrafEntityId value) {
        return new JAXBElement<SearchAgrafEntityId>(_SearchAgrafEntityId_QNAME, SearchAgrafEntityId.class, null, value);
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
     * Create an instance of {@link JAXBElement }{@code <}{@link ArchiflowExceptionSeverity }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://schemas.datacontract.org/2004/07/SIAV.Archiflow.Exceptions", name = "ArchiflowExceptionSeverity")
    public JAXBElement<ArchiflowExceptionSeverity> createArchiflowExceptionSeverity(ArchiflowExceptionSeverity value) {
        return new JAXBElement<ArchiflowExceptionSeverity>(_ArchiflowExceptionSeverity_QNAME, ArchiflowExceptionSeverity.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link StatoFatturaPAOUT }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://schemas.datacontract.org/2004/07/SIAV.Archiflow.Entities.Types", name = "StatoFatturaPA_OUT")
    public JAXBElement<StatoFatturaPAOUT> createStatoFatturaPAOUT(StatoFatturaPAOUT value) {
        return new JAXBElement<StatoFatturaPAOUT>(_StatoFatturaPAOUT_QNAME, StatoFatturaPAOUT.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link RecipientModality }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://schemas.datacontract.org/2004/07/SIAV.Archiflow.Entities.Types", name = "RecipientModality")
    public JAXBElement<RecipientModality> createRecipientModality(RecipientModality value) {
        return new JAXBElement<RecipientModality>(_RecipientModality_QNAME, RecipientModality.class, null, value);
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
     * Create an instance of {@link JAXBElement }{@code <}{@link EMailBase }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://schemas.datacontract.org/2004/07/SIAV.Archiflow.Entities.Posting.ValueObject", name = "EMailBase")
    public JAXBElement<EMailBase> createEMailBase(EMailBase value) {
        return new JAXBElement<EMailBase>(_EMailBase_QNAME, EMailBase.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link SearchAgrafOptionsTag }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://schemas.datacontract.org/2004/07/SIAV.Archiflow.Entities.Agraf.ValueObject", name = "SearchAgrafOptionsTag")
    public JAXBElement<SearchAgrafOptionsTag> createSearchAgrafOptionsTag(SearchAgrafOptionsTag value) {
        return new JAXBElement<SearchAgrafOptionsTag>(_SearchAgrafOptionsTag_QNAME, SearchAgrafOptionsTag.class, null, value);
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
     * Create an instance of {@link JAXBElement }{@code <}{@link MailServiceSendingPriority }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://schemas.datacontract.org/2004/07/SIAV.Archiflow.Entities.Types", name = "MailServiceSendingPriority")
    public JAXBElement<MailServiceSendingPriority> createMailServiceSendingPriority(MailServiceSendingPriority value) {
        return new JAXBElement<MailServiceSendingPriority>(_MailServiceSendingPriority_QNAME, MailServiceSendingPriority.class, null, value);
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
     * Create an instance of {@link JAXBElement }{@code <}{@link PrepareEmailFor }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://schemas.datacontract.org/2004/07/SIAV.Archiflow.Entities.Types", name = "PrepareEmailFor")
    public JAXBElement<PrepareEmailFor> createPrepareEmailFor(PrepareEmailFor value) {
        return new JAXBElement<PrepareEmailFor>(_PrepareEmailFor_QNAME, PrepareEmailFor.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link ArrayOfEMailAttachment }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://schemas.datacontract.org/2004/07/SIAV.Archiflow.Entities.Posting.ValueObject", name = "ArrayOfEMailAttachment")
    public JAXBElement<ArrayOfEMailAttachment> createArrayOfEMailAttachment(ArrayOfEMailAttachment value) {
        return new JAXBElement<ArrayOfEMailAttachment>(_ArrayOfEMailAttachment_QNAME, ArrayOfEMailAttachment.class, null, value);
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
     * Create an instance of {@link JAXBElement }{@code <}{@link CreateMailServiceSendingOutput }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://schemas.datacontract.org/2004/07/SIAV.Archiflow.Posting.ValueObject", name = "CreateMailServiceSendingOutput")
    public JAXBElement<CreateMailServiceSendingOutput> createCreateMailServiceSendingOutput(CreateMailServiceSendingOutput value) {
        return new JAXBElement<CreateMailServiceSendingOutput>(_CreateMailServiceSendingOutput_QNAME, CreateMailServiceSendingOutput.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link CheckInfoFatturaPA }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://schemas.datacontract.org/2004/07/SIAV.Archiflow.Entities.Posting.ValueObject", name = "CheckInfoFatturaPA")
    public JAXBElement<CheckInfoFatturaPA> createCheckInfoFatturaPA(CheckInfoFatturaPA value) {
        return new JAXBElement<CheckInfoFatturaPA>(_CheckInfoFatturaPA_QNAME, CheckInfoFatturaPA.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link PostingFieldType }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://schemas.datacontract.org/2004/07/SIAV.Archiflow.Entities.Types", name = "PostingFieldType")
    public JAXBElement<PostingFieldType> createPostingFieldType(PostingFieldType value) {
        return new JAXBElement<PostingFieldType>(_PostingFieldType_QNAME, PostingFieldType.class, null, value);
    }

}
