
package it.archiflow96;

import javax.xml.bind.annotation.XmlEnum;
import javax.xml.bind.annotation.XmlEnumValue;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for HistoryOperation.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * <p>
 * <pre>
 * &lt;simpleType name="HistoryOperation">
 *   &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
 *     &lt;enumeration value="Inserted"/>
 *     &lt;enumeration value="RemovedEnabling"/>
 *     &lt;enumeration value="Sorted"/>
 *     &lt;enumeration value="Sent1"/>
 *     &lt;enumeration value="Cancelled"/>
 *     &lt;enumeration value="Restored"/>
 *     &lt;enumeration value="DocumentAdded"/>
 *     &lt;enumeration value="Sent2"/>
 *     &lt;enumeration value="Modified"/>
 *     &lt;enumeration value="DataModified"/>
 *     &lt;enumeration value="AnnotationsAdded"/>
 *     &lt;enumeration value="AttachmentAdded"/>
 *     &lt;enumeration value="AttachmentRemoved"/>
 *     &lt;enumeration value="FaxSent"/>
 *     &lt;enumeration value="FaxInserted"/>
 *     &lt;enumeration value="Viewed"/>
 *     &lt;enumeration value="TakeInChargeDocument"/>
 *     &lt;enumeration value="DocumentReleased"/>
 *     &lt;enumeration value="DocumentImported"/>
 *     &lt;enumeration value="BatchAcquired"/>
 *     &lt;enumeration value="InsertedFromImport"/>
 *     &lt;enumeration value="DocumentModifiedFromImport"/>
 *     &lt;enumeration value="Signed"/>
 *     &lt;enumeration value="DocumentModified"/>
 *     &lt;enumeration value="DocumentDeleted1"/>
 *     &lt;enumeration value="Recovered"/>
 *     &lt;enumeration value="DocumentDeleted2"/>
 *     &lt;enumeration value="EmailDocumentSent"/>
 *     &lt;enumeration value="EmailDocumentInserted"/>
 *     &lt;enumeration value="SentWithNotice"/>
 *     &lt;enumeration value="CollatedAIPA"/>
 *     &lt;enumeration value="InsertedBlank"/>
 *     &lt;enumeration value="Collated"/>
 *     &lt;enumeration value="RemovedFolder"/>
 *     &lt;enumeration value="RemovedFolderAIPA"/>
 *     &lt;enumeration value="RequestCancellation"/>
 *     &lt;enumeration value="RefusedCancellation"/>
 *     &lt;enumeration value="AttachmentModified"/>
 *     &lt;enumeration value="RemovedFromInbox"/>
 *     &lt;enumeration value="Signature"/>
 *     &lt;enumeration value="SentElectronicOk"/>
 *     &lt;enumeration value="InsertElectronic"/>
 *     &lt;enumeration value="CopyTenancy"/>
 *     &lt;enumeration value="DigitalSign"/>
 *     &lt;enumeration value="ReceivedArchived"/>
 *     &lt;enumeration value="ReceivedCanceled"/>
 *     &lt;enumeration value="Pressmark"/>
 *     &lt;enumeration value="Checkout"/>
 *     &lt;enumeration value="Checkin"/>
 *     &lt;enumeration value="ReceivedUpdated"/>
 *     &lt;enumeration value="ReceivedException"/>
 *     &lt;enumeration value="CreatedVersion"/>
 *     &lt;enumeration value="ResetVisibility"/>
 *     &lt;enumeration value="SentCC"/>
 *     &lt;enumeration value="ModifiedBach"/>
 *     &lt;enumeration value="CreatedVersionKeys"/>
 *     &lt;enumeration value="CheckoutCancelled"/>
 *     &lt;enumeration value="DocumentPrinted"/>
 *     &lt;enumeration value="AttachmentPrinted"/>
 *     &lt;enumeration value="DocumentViewed"/>
 *     &lt;enumeration value="CardViewed"/>
 *     &lt;enumeration value="LetterOnlineSent"/>
 *     &lt;enumeration value="RegisteredOnlineSent"/>
 *     &lt;enumeration value="TelegramOnlineSent"/>
 *     &lt;enumeration value="DocTimestamped"/>
 *     &lt;enumeration value="LoginOK"/>
 *     &lt;enumeration value="LoginKO"/>
 *     &lt;enumeration value="Logout"/>
 *     &lt;enumeration value="MetadataPrinted"/>
 *     &lt;enumeration value="ProtocolPrintoutInvalidated_G"/>
 *     &lt;enumeration value="ProtocolPrintoutInvalidated_A"/>
 *     &lt;enumeration value="ProtocolPrintoutCreated_G"/>
 *     &lt;enumeration value="ProtocolPrintoutCreated_A"/>
 *     &lt;enumeration value="EsternalMail"/>
 *     &lt;enumeration value="ExtendedMail"/>
 *     &lt;enumeration value="DocSignedRemotely"/>
 *     &lt;enumeration value="DocSignedApp"/>
 *     &lt;enumeration value="SimpleRegisteredOnlineSent"/>
 *     &lt;enumeration value="RemovedEnableCC"/>
 *     &lt;enumeration value="SentFatturaPA"/>
 *     &lt;enumeration value="SentExternalNotification"/>
 *     &lt;enumeration value="SentInternalNotification"/>
 *     &lt;enumeration value="DoneDocTimeStamp"/>
 *     &lt;enumeration value="ReceivedFatturaPA"/>
 *     &lt;enumeration value="SentFatturaPANotificEC"/>
 *     &lt;enumeration value="CardPutInConservation"/>
 *     &lt;enumeration value="DocumentImportedWithConfirm"/>
 *     &lt;enumeration value="AttachmentAddedWithConfirm"/>
 *     &lt;enumeration value="AttachmentModifiedWithConfirm"/>
 *     &lt;enumeration value="DocumentAddedWithConfirm"/>
 *     &lt;enumeration value="DocumentReacquiredWithConfirm"/>
 *     &lt;enumeration value="CardClassified"/>
 *     &lt;enumeration value="CardClassificationRemoved"/>
 *     &lt;enumeration value="CardVisibilityTypeChanged"/>
 *     &lt;enumeration value="CardCompliantCopyCreated"/>
 *     &lt;enumeration value="TaskAssigned"/>
 *     &lt;enumeration value="TaskRemoved"/>
 *     &lt;enumeration value="TaskProcessed"/>
 *     &lt;enumeration value="TaskToBeProcessed"/>
 *     &lt;enumeration value="TaskRejected"/>
 *     &lt;enumeration value="TaskAccepted"/>
 *     &lt;enumeration value="TaskReassigned"/>
 *     &lt;enumeration value="TaskArchived"/>
 *     &lt;enumeration value="TaskRejectionAccepted"/>
 *     &lt;enumeration value="CardPublishedInBlueDrive"/>
 *     &lt;enumeration value="CardPublishedInSap"/>
 *   &lt;/restriction>
 * &lt;/simpleType>
 * </pre>
 * 
 */
@XmlType(name = "HistoryOperation", namespace = "http://schemas.datacontract.org/2004/07/SIAV.Archiflow.Entities.Types")
@XmlEnum
public enum HistoryOperation {

    @XmlEnumValue("Inserted")
    INSERTED("Inserted"),
    @XmlEnumValue("RemovedEnabling")
    REMOVED_ENABLING("RemovedEnabling"),
    @XmlEnumValue("Sorted")
    SORTED("Sorted"),
    @XmlEnumValue("Sent1")
    SENT_1("Sent1"),
    @XmlEnumValue("Cancelled")
    CANCELLED("Cancelled"),
    @XmlEnumValue("Restored")
    RESTORED("Restored"),
    @XmlEnumValue("DocumentAdded")
    DOCUMENT_ADDED("DocumentAdded"),
    @XmlEnumValue("Sent2")
    SENT_2("Sent2"),
    @XmlEnumValue("Modified")
    MODIFIED("Modified"),
    @XmlEnumValue("DataModified")
    DATA_MODIFIED("DataModified"),
    @XmlEnumValue("AnnotationsAdded")
    ANNOTATIONS_ADDED("AnnotationsAdded"),
    @XmlEnumValue("AttachmentAdded")
    ATTACHMENT_ADDED("AttachmentAdded"),
    @XmlEnumValue("AttachmentRemoved")
    ATTACHMENT_REMOVED("AttachmentRemoved"),
    @XmlEnumValue("FaxSent")
    FAX_SENT("FaxSent"),
    @XmlEnumValue("FaxInserted")
    FAX_INSERTED("FaxInserted"),
    @XmlEnumValue("Viewed")
    VIEWED("Viewed"),
    @XmlEnumValue("TakeInChargeDocument")
    TAKE_IN_CHARGE_DOCUMENT("TakeInChargeDocument"),
    @XmlEnumValue("DocumentReleased")
    DOCUMENT_RELEASED("DocumentReleased"),
    @XmlEnumValue("DocumentImported")
    DOCUMENT_IMPORTED("DocumentImported"),
    @XmlEnumValue("BatchAcquired")
    BATCH_ACQUIRED("BatchAcquired"),
    @XmlEnumValue("InsertedFromImport")
    INSERTED_FROM_IMPORT("InsertedFromImport"),
    @XmlEnumValue("DocumentModifiedFromImport")
    DOCUMENT_MODIFIED_FROM_IMPORT("DocumentModifiedFromImport"),
    @XmlEnumValue("Signed")
    SIGNED("Signed"),
    @XmlEnumValue("DocumentModified")
    DOCUMENT_MODIFIED("DocumentModified"),
    @XmlEnumValue("DocumentDeleted1")
    DOCUMENT_DELETED_1("DocumentDeleted1"),
    @XmlEnumValue("Recovered")
    RECOVERED("Recovered"),
    @XmlEnumValue("DocumentDeleted2")
    DOCUMENT_DELETED_2("DocumentDeleted2"),
    @XmlEnumValue("EmailDocumentSent")
    EMAIL_DOCUMENT_SENT("EmailDocumentSent"),
    @XmlEnumValue("EmailDocumentInserted")
    EMAIL_DOCUMENT_INSERTED("EmailDocumentInserted"),
    @XmlEnumValue("SentWithNotice")
    SENT_WITH_NOTICE("SentWithNotice"),
    @XmlEnumValue("CollatedAIPA")
    COLLATED_AIPA("CollatedAIPA"),
    @XmlEnumValue("InsertedBlank")
    INSERTED_BLANK("InsertedBlank"),
    @XmlEnumValue("Collated")
    COLLATED("Collated"),
    @XmlEnumValue("RemovedFolder")
    REMOVED_FOLDER("RemovedFolder"),
    @XmlEnumValue("RemovedFolderAIPA")
    REMOVED_FOLDER_AIPA("RemovedFolderAIPA"),
    @XmlEnumValue("RequestCancellation")
    REQUEST_CANCELLATION("RequestCancellation"),
    @XmlEnumValue("RefusedCancellation")
    REFUSED_CANCELLATION("RefusedCancellation"),
    @XmlEnumValue("AttachmentModified")
    ATTACHMENT_MODIFIED("AttachmentModified"),
    @XmlEnumValue("RemovedFromInbox")
    REMOVED_FROM_INBOX("RemovedFromInbox"),
    @XmlEnumValue("Signature")
    SIGNATURE("Signature"),
    @XmlEnumValue("SentElectronicOk")
    SENT_ELECTRONIC_OK("SentElectronicOk"),
    @XmlEnumValue("InsertElectronic")
    INSERT_ELECTRONIC("InsertElectronic"),
    @XmlEnumValue("CopyTenancy")
    COPY_TENANCY("CopyTenancy"),
    @XmlEnumValue("DigitalSign")
    DIGITAL_SIGN("DigitalSign"),
    @XmlEnumValue("ReceivedArchived")
    RECEIVED_ARCHIVED("ReceivedArchived"),
    @XmlEnumValue("ReceivedCanceled")
    RECEIVED_CANCELED("ReceivedCanceled"),
    @XmlEnumValue("Pressmark")
    PRESSMARK("Pressmark"),
    @XmlEnumValue("Checkout")
    CHECKOUT("Checkout"),
    @XmlEnumValue("Checkin")
    CHECKIN("Checkin"),
    @XmlEnumValue("ReceivedUpdated")
    RECEIVED_UPDATED("ReceivedUpdated"),
    @XmlEnumValue("ReceivedException")
    RECEIVED_EXCEPTION("ReceivedException"),
    @XmlEnumValue("CreatedVersion")
    CREATED_VERSION("CreatedVersion"),
    @XmlEnumValue("ResetVisibility")
    RESET_VISIBILITY("ResetVisibility"),
    @XmlEnumValue("SentCC")
    SENT_CC("SentCC"),
    @XmlEnumValue("ModifiedBach")
    MODIFIED_BACH("ModifiedBach"),
    @XmlEnumValue("CreatedVersionKeys")
    CREATED_VERSION_KEYS("CreatedVersionKeys"),
    @XmlEnumValue("CheckoutCancelled")
    CHECKOUT_CANCELLED("CheckoutCancelled"),
    @XmlEnumValue("DocumentPrinted")
    DOCUMENT_PRINTED("DocumentPrinted"),
    @XmlEnumValue("AttachmentPrinted")
    ATTACHMENT_PRINTED("AttachmentPrinted"),
    @XmlEnumValue("DocumentViewed")
    DOCUMENT_VIEWED("DocumentViewed"),
    @XmlEnumValue("CardViewed")
    CARD_VIEWED("CardViewed"),
    @XmlEnumValue("LetterOnlineSent")
    LETTER_ONLINE_SENT("LetterOnlineSent"),
    @XmlEnumValue("RegisteredOnlineSent")
    REGISTERED_ONLINE_SENT("RegisteredOnlineSent"),
    @XmlEnumValue("TelegramOnlineSent")
    TELEGRAM_ONLINE_SENT("TelegramOnlineSent"),
    @XmlEnumValue("DocTimestamped")
    DOC_TIMESTAMPED("DocTimestamped"),
    @XmlEnumValue("LoginOK")
    LOGIN_OK("LoginOK"),
    @XmlEnumValue("LoginKO")
    LOGIN_KO("LoginKO"),
    @XmlEnumValue("Logout")
    LOGOUT("Logout"),
    @XmlEnumValue("MetadataPrinted")
    METADATA_PRINTED("MetadataPrinted"),
    @XmlEnumValue("ProtocolPrintoutInvalidated_G")
    PROTOCOL_PRINTOUT_INVALIDATED_G("ProtocolPrintoutInvalidated_G"),
    @XmlEnumValue("ProtocolPrintoutInvalidated_A")
    PROTOCOL_PRINTOUT_INVALIDATED_A("ProtocolPrintoutInvalidated_A"),
    @XmlEnumValue("ProtocolPrintoutCreated_G")
    PROTOCOL_PRINTOUT_CREATED_G("ProtocolPrintoutCreated_G"),
    @XmlEnumValue("ProtocolPrintoutCreated_A")
    PROTOCOL_PRINTOUT_CREATED_A("ProtocolPrintoutCreated_A"),
    @XmlEnumValue("EsternalMail")
    ESTERNAL_MAIL("EsternalMail"),
    @XmlEnumValue("ExtendedMail")
    EXTENDED_MAIL("ExtendedMail"),
    @XmlEnumValue("DocSignedRemotely")
    DOC_SIGNED_REMOTELY("DocSignedRemotely"),
    @XmlEnumValue("DocSignedApp")
    DOC_SIGNED_APP("DocSignedApp"),
    @XmlEnumValue("SimpleRegisteredOnlineSent")
    SIMPLE_REGISTERED_ONLINE_SENT("SimpleRegisteredOnlineSent"),
    @XmlEnumValue("RemovedEnableCC")
    REMOVED_ENABLE_CC("RemovedEnableCC"),
    @XmlEnumValue("SentFatturaPA")
    SENT_FATTURA_PA("SentFatturaPA"),
    @XmlEnumValue("SentExternalNotification")
    SENT_EXTERNAL_NOTIFICATION("SentExternalNotification"),
    @XmlEnumValue("SentInternalNotification")
    SENT_INTERNAL_NOTIFICATION("SentInternalNotification"),
    @XmlEnumValue("DoneDocTimeStamp")
    DONE_DOC_TIME_STAMP("DoneDocTimeStamp"),
    @XmlEnumValue("ReceivedFatturaPA")
    RECEIVED_FATTURA_PA("ReceivedFatturaPA"),
    @XmlEnumValue("SentFatturaPANotificEC")
    SENT_FATTURA_PA_NOTIFIC_EC("SentFatturaPANotificEC"),
    @XmlEnumValue("CardPutInConservation")
    CARD_PUT_IN_CONSERVATION("CardPutInConservation"),
    @XmlEnumValue("DocumentImportedWithConfirm")
    DOCUMENT_IMPORTED_WITH_CONFIRM("DocumentImportedWithConfirm"),
    @XmlEnumValue("AttachmentAddedWithConfirm")
    ATTACHMENT_ADDED_WITH_CONFIRM("AttachmentAddedWithConfirm"),
    @XmlEnumValue("AttachmentModifiedWithConfirm")
    ATTACHMENT_MODIFIED_WITH_CONFIRM("AttachmentModifiedWithConfirm"),
    @XmlEnumValue("DocumentAddedWithConfirm")
    DOCUMENT_ADDED_WITH_CONFIRM("DocumentAddedWithConfirm"),
    @XmlEnumValue("DocumentReacquiredWithConfirm")
    DOCUMENT_REACQUIRED_WITH_CONFIRM("DocumentReacquiredWithConfirm"),
    @XmlEnumValue("CardClassified")
    CARD_CLASSIFIED("CardClassified"),
    @XmlEnumValue("CardClassificationRemoved")
    CARD_CLASSIFICATION_REMOVED("CardClassificationRemoved"),
    @XmlEnumValue("CardVisibilityTypeChanged")
    CARD_VISIBILITY_TYPE_CHANGED("CardVisibilityTypeChanged"),
    @XmlEnumValue("CardCompliantCopyCreated")
    CARD_COMPLIANT_COPY_CREATED("CardCompliantCopyCreated"),
    @XmlEnumValue("TaskAssigned")
    TASK_ASSIGNED("TaskAssigned"),
    @XmlEnumValue("TaskRemoved")
    TASK_REMOVED("TaskRemoved"),
    @XmlEnumValue("TaskProcessed")
    TASK_PROCESSED("TaskProcessed"),
    @XmlEnumValue("TaskToBeProcessed")
    TASK_TO_BE_PROCESSED("TaskToBeProcessed"),
    @XmlEnumValue("TaskRejected")
    TASK_REJECTED("TaskRejected"),
    @XmlEnumValue("TaskAccepted")
    TASK_ACCEPTED("TaskAccepted"),
    @XmlEnumValue("TaskReassigned")
    TASK_REASSIGNED("TaskReassigned"),
    @XmlEnumValue("TaskArchived")
    TASK_ARCHIVED("TaskArchived"),
    @XmlEnumValue("TaskRejectionAccepted")
    TASK_REJECTION_ACCEPTED("TaskRejectionAccepted"),
    @XmlEnumValue("CardPublishedInBlueDrive")
    CARD_PUBLISHED_IN_BLUE_DRIVE("CardPublishedInBlueDrive"),
    @XmlEnumValue("CardPublishedInSap")
    CARD_PUBLISHED_IN_SAP("CardPublishedInSap");
    private final String value;

    HistoryOperation(String v) {
        value = v;
    }

    public String value() {
        return value;
    }

    public static HistoryOperation fromValue(String v) {
        for (HistoryOperation c: HistoryOperation.values()) {
            if (c.value.equals(v)) {
                return c;
            }
        }
        throw new IllegalArgumentException(v);
    }

}
