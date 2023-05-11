
package it.archiflow96;

import javax.xml.bind.annotation.XmlEnum;
import javax.xml.bind.annotation.XmlEnumValue;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for CardOperation.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * <p>
 * <pre>
 * &lt;simpleType name="CardOperation">
 *   &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
 *     &lt;enumeration value="CoNotDefined"/>
 *     &lt;enumeration value="CoSharing"/>
 *     &lt;enumeration value="CoCancellation"/>
 *     &lt;enumeration value="CoInvalidation"/>
 *     &lt;enumeration value="CoIndexes"/>
 *     &lt;enumeration value="CoAdditionalData"/>
 *     &lt;enumeration value="CoAnnotations"/>
 *     &lt;enumeration value="CoVisibility"/>
 *     &lt;enumeration value="CoPosteOnLine"/>
 *     &lt;enumeration value="CoSendExternalEmail"/>
 *     &lt;enumeration value="CoSendExtendedEmail"/>
 *     &lt;enumeration value="CoSendPECPEOEmail"/>
 *     &lt;enumeration value="CoSendInteropEmail"/>
 *     &lt;enumeration value="CoSendInvoice"/>
 *     &lt;enumeration value="CoSendNotificationEC"/>
 *     &lt;enumeration value="CoSendPECPEOEmailReply"/>
 *     &lt;enumeration value="CoSendPECPEOEmailProtocolReply"/>
 *     &lt;enumeration value="CoSendInteropRefuseEmail"/>
 *     &lt;enumeration value="CoDuplicateCardIndexes"/>
 *     &lt;enumeration value="CoDuplicateCardIndexesAndDoc"/>
 *     &lt;enumeration value="CoStorePECPEOEmail"/>
 *     &lt;enumeration value="CoStoreInteropEmail"/>
 *     &lt;enumeration value="CoProtocolCard"/>
 *     &lt;enumeration value="CoSendPECCourtesyCopy"/>
 *     &lt;enumeration value="CoSendPECPEOEmailForward"/>
 *     &lt;enumeration value="CoPermalink"/>
 *     &lt;enumeration value="CoTaskOnDemand"/>
 *     &lt;enumeration value="CoImportDoc"/>
 *     &lt;enumeration value="CoScanDoc"/>
 *     &lt;enumeration value="CoImportAddDoc"/>
 *     &lt;enumeration value="CoScanAddDoc"/>
 *     &lt;enumeration value="CoDigestDoc"/>
 *     &lt;enumeration value="CoSaveVersionDoc"/>
 *     &lt;enumeration value="CoCheckInOutDoc"/>
 *     &lt;enumeration value="CoLockDoc"/>
 *     &lt;enumeration value="CoAnalogCompliantCopyDoc"/>
 *     &lt;enumeration value="CoDigitalCompliantCopyDoc"/>
 *     &lt;enumeration value="CoGlifoDoc"/>
 *     &lt;enumeration value="CoPressMarkDoc"/>
 *     &lt;enumeration value="CoConvToPdfDoc"/>
 *     &lt;enumeration value="CoConsolidateDoc"/>
 *     &lt;enumeration value="CoAutoUpdateDoc"/>
 *     &lt;enumeration value="CoInsModAtt"/>
 *     &lt;enumeration value="CoDigestAtt"/>
 *     &lt;enumeration value="CoGlifoAtt"/>
 *     &lt;enumeration value="CoDuplicateCardExtAtt"/>
 *     &lt;enumeration value="CoElectronicSign"/>
 *     &lt;enumeration value="CoDigitalSign"/>
 *     &lt;enumeration value="CoTimeStamp"/>
 *     &lt;enumeration value="CoPdfNativeSign"/>
 *     &lt;enumeration value="CoRemoteSign"/>
 *     &lt;enumeration value="CoElectronicStampingSign"/>
 *     &lt;enumeration value="CoGraphometricSign"/>
 *     &lt;enumeration value="CoDigitalSignAtt"/>
 *     &lt;enumeration value="CoTimeStampAtt"/>
 *     &lt;enumeration value="CoPdfNativeSignAtt"/>
 *     &lt;enumeration value="CoRemoteSignAtt"/>
 *     &lt;enumeration value="CoStandardCollation"/>
 *     &lt;enumeration value="CoArchivalCollation"/>
 *     &lt;enumeration value="CoCreateLinkArchivalCollation"/>
 *     &lt;enumeration value="CoIsWf"/>
 *     &lt;enumeration value="CoWfTakeInCharge"/>
 *     &lt;enumeration value="CoWfRefuse"/>
 *     &lt;enumeration value="CoWfForward"/>
 *     &lt;enumeration value="CoWfProcessInfo"/>
 *     &lt;enumeration value="CoWfProcessStart"/>
 *     &lt;enumeration value="CoWfProcessStop"/>
 *     &lt;enumeration value="CoWfProcessSuspend"/>
 *     &lt;enumeration value="CoWfProcessRestore"/>
 *     &lt;enumeration value="CoWfAssignInChargeTo"/>
 *     &lt;enumeration value="CoWfRemoveInChargeFrom"/>
 *     &lt;enumeration value="CoIMChannelSwitching"/>
 *     &lt;enumeration value="CoIMSendInvoiceOnMainChannel"/>
 *     &lt;enumeration value="CoIMSendInvoiceOnMainChannelSDI"/>
 *     &lt;enumeration value="CoIMSendInvoiceOnMainChannelPEC"/>
 *     &lt;enumeration value="CoIMSendInvoiceOnMainChannelPEO"/>
 *     &lt;enumeration value="CoIMPlanSendInvoiceOnMainChannel"/>
 *     &lt;enumeration value="CoIMPlanSendInvoiceOnMainChannelSDI"/>
 *     &lt;enumeration value="CoIMPlanSendInvoiceOnMainChannelPEC"/>
 *     &lt;enumeration value="CoIMPlanSendInvoiceOnMainChannelPEO"/>
 *     &lt;enumeration value="CoIMChangeDatePlanSendInvoiceOnMainChannel"/>
 *     &lt;enumeration value="CoIMChangeDatePlanSendInvoiceOnMainChannelSDI"/>
 *     &lt;enumeration value="CoIMChangeDatePlanSendInvoiceOnMainChannelPEC"/>
 *     &lt;enumeration value="CoIMChangeDatePlanSendInvoiceOnMainChannelPEO"/>
 *     &lt;enumeration value="CoIMSendInvoiceOnSubChannel"/>
 *     &lt;enumeration value="CoIMSendInvoiceOnSubChannelSDI"/>
 *     &lt;enumeration value="CoIMSendInvoiceOnSubChannelPEC"/>
 *     &lt;enumeration value="CoIMSendInvoiceOnSubChannelPEO"/>
 *     &lt;enumeration value="CoIMStopSendInvoiceOnMainChannel"/>
 *     &lt;enumeration value="CoIMReSendInvoiceOnSubChannel"/>
 *     &lt;enumeration value="CoIMReSendInvoiceOnSubChannelPEC"/>
 *     &lt;enumeration value="CoIMReSendInvoiceOnSubChannelPEO"/>
 *     &lt;enumeration value="CoIMSendApprovalRefusalToSDI"/>
 *     &lt;enumeration value="CoIMApprovalRefusal"/>
 *     &lt;enumeration value="CoIMSendApprovalToSDI"/>
 *     &lt;enumeration value="CoIMSendRefusalToSDI"/>
 *     &lt;enumeration value="CoIMSendInvoiceOnMainChannelADP"/>
 *     &lt;enumeration value="CoIMSendInvoiceOnSubChannelADP"/>
 *     &lt;enumeration value="CoIMReSendInvoiceOnSubChannelADP"/>
 *     &lt;enumeration value="CoIMReSendInvoiceOnSubChannelSDI"/>
 *     &lt;enumeration value="CoIMReSendInvoiceOnMainChannel"/>
 *     &lt;enumeration value="CoIMReSendInvoiceOnMainChannelSDI"/>
 *     &lt;enumeration value="CoIMReSendInvoiceOnMainChannelPEC"/>
 *     &lt;enumeration value="CoIMReSendInvoiceOnMainChannelPEO"/>
 *     &lt;enumeration value="CoIMReSendInvoiceOnMainChannelADP"/>
 *     &lt;enumeration value="CoIMPlanReSendInvoiceOnMainChannel"/>
 *     &lt;enumeration value="CoIMPlanReSendInvoiceOnMainChannelSDI"/>
 *     &lt;enumeration value="CoIMPlanReSendInvoiceOnMainChannelPEC"/>
 *     &lt;enumeration value="CoIMPlanReSendInvoiceOnMainChannelPEO"/>
 *     &lt;enumeration value="CoIMChangeDatePlanReSendInvoiceOnMainChannel"/>
 *     &lt;enumeration value="CoIMChangeDatePlanReSendInvoiceOnMainChannelSDI"/>
 *     &lt;enumeration value="CoIMChangeDatePlanReSendInvoiceOnMainChannelPEC"/>
 *     &lt;enumeration value="CoIMChangeDatePlanReSendInvoiceOnMainChannelPEO"/>
 *     &lt;enumeration value="CoIMModifyInvoiceData"/>
 *     &lt;enumeration value="CoNsoOrderManagement"/>
 *     &lt;enumeration value="CoNsoSendOrder"/>
 *     &lt;enumeration value="CoNsoAcceptRejectOrder"/>
 *     &lt;enumeration value="CoNsoAcceptRejectModification"/>
 *   &lt;/restriction>
 * &lt;/simpleType>
 * </pre>
 * 
 */
@XmlType(name = "CardOperation", namespace = "http://schemas.datacontract.org/2004/07/SIAV.Archiflow.Entities.Types")
@XmlEnum
public enum CardOperation {

    @XmlEnumValue("CoNotDefined")
    CO_NOT_DEFINED("CoNotDefined"),
    @XmlEnumValue("CoSharing")
    CO_SHARING("CoSharing"),
    @XmlEnumValue("CoCancellation")
    CO_CANCELLATION("CoCancellation"),
    @XmlEnumValue("CoInvalidation")
    CO_INVALIDATION("CoInvalidation"),
    @XmlEnumValue("CoIndexes")
    CO_INDEXES("CoIndexes"),
    @XmlEnumValue("CoAdditionalData")
    CO_ADDITIONAL_DATA("CoAdditionalData"),
    @XmlEnumValue("CoAnnotations")
    CO_ANNOTATIONS("CoAnnotations"),
    @XmlEnumValue("CoVisibility")
    CO_VISIBILITY("CoVisibility"),
    @XmlEnumValue("CoPosteOnLine")
    CO_POSTE_ON_LINE("CoPosteOnLine"),
    @XmlEnumValue("CoSendExternalEmail")
    CO_SEND_EXTERNAL_EMAIL("CoSendExternalEmail"),
    @XmlEnumValue("CoSendExtendedEmail")
    CO_SEND_EXTENDED_EMAIL("CoSendExtendedEmail"),
    @XmlEnumValue("CoSendPECPEOEmail")
    CO_SEND_PECPEO_EMAIL("CoSendPECPEOEmail"),
    @XmlEnumValue("CoSendInteropEmail")
    CO_SEND_INTEROP_EMAIL("CoSendInteropEmail"),
    @XmlEnumValue("CoSendInvoice")
    CO_SEND_INVOICE("CoSendInvoice"),
    @XmlEnumValue("CoSendNotificationEC")
    CO_SEND_NOTIFICATION_EC("CoSendNotificationEC"),
    @XmlEnumValue("CoSendPECPEOEmailReply")
    CO_SEND_PECPEO_EMAIL_REPLY("CoSendPECPEOEmailReply"),
    @XmlEnumValue("CoSendPECPEOEmailProtocolReply")
    CO_SEND_PECPEO_EMAIL_PROTOCOL_REPLY("CoSendPECPEOEmailProtocolReply"),
    @XmlEnumValue("CoSendInteropRefuseEmail")
    CO_SEND_INTEROP_REFUSE_EMAIL("CoSendInteropRefuseEmail"),
    @XmlEnumValue("CoDuplicateCardIndexes")
    CO_DUPLICATE_CARD_INDEXES("CoDuplicateCardIndexes"),
    @XmlEnumValue("CoDuplicateCardIndexesAndDoc")
    CO_DUPLICATE_CARD_INDEXES_AND_DOC("CoDuplicateCardIndexesAndDoc"),
    @XmlEnumValue("CoStorePECPEOEmail")
    CO_STORE_PECPEO_EMAIL("CoStorePECPEOEmail"),
    @XmlEnumValue("CoStoreInteropEmail")
    CO_STORE_INTEROP_EMAIL("CoStoreInteropEmail"),
    @XmlEnumValue("CoProtocolCard")
    CO_PROTOCOL_CARD("CoProtocolCard"),
    @XmlEnumValue("CoSendPECCourtesyCopy")
    CO_SEND_PEC_COURTESY_COPY("CoSendPECCourtesyCopy"),
    @XmlEnumValue("CoSendPECPEOEmailForward")
    CO_SEND_PECPEO_EMAIL_FORWARD("CoSendPECPEOEmailForward"),
    @XmlEnumValue("CoPermalink")
    CO_PERMALINK("CoPermalink"),
    @XmlEnumValue("CoTaskOnDemand")
    CO_TASK_ON_DEMAND("CoTaskOnDemand"),
    @XmlEnumValue("CoImportDoc")
    CO_IMPORT_DOC("CoImportDoc"),
    @XmlEnumValue("CoScanDoc")
    CO_SCAN_DOC("CoScanDoc"),
    @XmlEnumValue("CoImportAddDoc")
    CO_IMPORT_ADD_DOC("CoImportAddDoc"),
    @XmlEnumValue("CoScanAddDoc")
    CO_SCAN_ADD_DOC("CoScanAddDoc"),
    @XmlEnumValue("CoDigestDoc")
    CO_DIGEST_DOC("CoDigestDoc"),
    @XmlEnumValue("CoSaveVersionDoc")
    CO_SAVE_VERSION_DOC("CoSaveVersionDoc"),
    @XmlEnumValue("CoCheckInOutDoc")
    CO_CHECK_IN_OUT_DOC("CoCheckInOutDoc"),
    @XmlEnumValue("CoLockDoc")
    CO_LOCK_DOC("CoLockDoc"),
    @XmlEnumValue("CoAnalogCompliantCopyDoc")
    CO_ANALOG_COMPLIANT_COPY_DOC("CoAnalogCompliantCopyDoc"),
    @XmlEnumValue("CoDigitalCompliantCopyDoc")
    CO_DIGITAL_COMPLIANT_COPY_DOC("CoDigitalCompliantCopyDoc"),
    @XmlEnumValue("CoGlifoDoc")
    CO_GLIFO_DOC("CoGlifoDoc"),
    @XmlEnumValue("CoPressMarkDoc")
    CO_PRESS_MARK_DOC("CoPressMarkDoc"),
    @XmlEnumValue("CoConvToPdfDoc")
    CO_CONV_TO_PDF_DOC("CoConvToPdfDoc"),
    @XmlEnumValue("CoConsolidateDoc")
    CO_CONSOLIDATE_DOC("CoConsolidateDoc"),
    @XmlEnumValue("CoAutoUpdateDoc")
    CO_AUTO_UPDATE_DOC("CoAutoUpdateDoc"),
    @XmlEnumValue("CoInsModAtt")
    CO_INS_MOD_ATT("CoInsModAtt"),
    @XmlEnumValue("CoDigestAtt")
    CO_DIGEST_ATT("CoDigestAtt"),
    @XmlEnumValue("CoGlifoAtt")
    CO_GLIFO_ATT("CoGlifoAtt"),
    @XmlEnumValue("CoDuplicateCardExtAtt")
    CO_DUPLICATE_CARD_EXT_ATT("CoDuplicateCardExtAtt"),
    @XmlEnumValue("CoElectronicSign")
    CO_ELECTRONIC_SIGN("CoElectronicSign"),
    @XmlEnumValue("CoDigitalSign")
    CO_DIGITAL_SIGN("CoDigitalSign"),
    @XmlEnumValue("CoTimeStamp")
    CO_TIME_STAMP("CoTimeStamp"),
    @XmlEnumValue("CoPdfNativeSign")
    CO_PDF_NATIVE_SIGN("CoPdfNativeSign"),
    @XmlEnumValue("CoRemoteSign")
    CO_REMOTE_SIGN("CoRemoteSign"),
    @XmlEnumValue("CoElectronicStampingSign")
    CO_ELECTRONIC_STAMPING_SIGN("CoElectronicStampingSign"),
    @XmlEnumValue("CoGraphometricSign")
    CO_GRAPHOMETRIC_SIGN("CoGraphometricSign"),
    @XmlEnumValue("CoDigitalSignAtt")
    CO_DIGITAL_SIGN_ATT("CoDigitalSignAtt"),
    @XmlEnumValue("CoTimeStampAtt")
    CO_TIME_STAMP_ATT("CoTimeStampAtt"),
    @XmlEnumValue("CoPdfNativeSignAtt")
    CO_PDF_NATIVE_SIGN_ATT("CoPdfNativeSignAtt"),
    @XmlEnumValue("CoRemoteSignAtt")
    CO_REMOTE_SIGN_ATT("CoRemoteSignAtt"),
    @XmlEnumValue("CoStandardCollation")
    CO_STANDARD_COLLATION("CoStandardCollation"),
    @XmlEnumValue("CoArchivalCollation")
    CO_ARCHIVAL_COLLATION("CoArchivalCollation"),
    @XmlEnumValue("CoCreateLinkArchivalCollation")
    CO_CREATE_LINK_ARCHIVAL_COLLATION("CoCreateLinkArchivalCollation"),
    @XmlEnumValue("CoIsWf")
    CO_IS_WF("CoIsWf"),
    @XmlEnumValue("CoWfTakeInCharge")
    CO_WF_TAKE_IN_CHARGE("CoWfTakeInCharge"),
    @XmlEnumValue("CoWfRefuse")
    CO_WF_REFUSE("CoWfRefuse"),
    @XmlEnumValue("CoWfForward")
    CO_WF_FORWARD("CoWfForward"),
    @XmlEnumValue("CoWfProcessInfo")
    CO_WF_PROCESS_INFO("CoWfProcessInfo"),
    @XmlEnumValue("CoWfProcessStart")
    CO_WF_PROCESS_START("CoWfProcessStart"),
    @XmlEnumValue("CoWfProcessStop")
    CO_WF_PROCESS_STOP("CoWfProcessStop"),
    @XmlEnumValue("CoWfProcessSuspend")
    CO_WF_PROCESS_SUSPEND("CoWfProcessSuspend"),
    @XmlEnumValue("CoWfProcessRestore")
    CO_WF_PROCESS_RESTORE("CoWfProcessRestore"),
    @XmlEnumValue("CoWfAssignInChargeTo")
    CO_WF_ASSIGN_IN_CHARGE_TO("CoWfAssignInChargeTo"),
    @XmlEnumValue("CoWfRemoveInChargeFrom")
    CO_WF_REMOVE_IN_CHARGE_FROM("CoWfRemoveInChargeFrom"),
    @XmlEnumValue("CoIMChannelSwitching")
    CO_IM_CHANNEL_SWITCHING("CoIMChannelSwitching"),
    @XmlEnumValue("CoIMSendInvoiceOnMainChannel")
    CO_IM_SEND_INVOICE_ON_MAIN_CHANNEL("CoIMSendInvoiceOnMainChannel"),
    @XmlEnumValue("CoIMSendInvoiceOnMainChannelSDI")
    CO_IM_SEND_INVOICE_ON_MAIN_CHANNEL_SDI("CoIMSendInvoiceOnMainChannelSDI"),
    @XmlEnumValue("CoIMSendInvoiceOnMainChannelPEC")
    CO_IM_SEND_INVOICE_ON_MAIN_CHANNEL_PEC("CoIMSendInvoiceOnMainChannelPEC"),
    @XmlEnumValue("CoIMSendInvoiceOnMainChannelPEO")
    CO_IM_SEND_INVOICE_ON_MAIN_CHANNEL_PEO("CoIMSendInvoiceOnMainChannelPEO"),
    @XmlEnumValue("CoIMPlanSendInvoiceOnMainChannel")
    CO_IM_PLAN_SEND_INVOICE_ON_MAIN_CHANNEL("CoIMPlanSendInvoiceOnMainChannel"),
    @XmlEnumValue("CoIMPlanSendInvoiceOnMainChannelSDI")
    CO_IM_PLAN_SEND_INVOICE_ON_MAIN_CHANNEL_SDI("CoIMPlanSendInvoiceOnMainChannelSDI"),
    @XmlEnumValue("CoIMPlanSendInvoiceOnMainChannelPEC")
    CO_IM_PLAN_SEND_INVOICE_ON_MAIN_CHANNEL_PEC("CoIMPlanSendInvoiceOnMainChannelPEC"),
    @XmlEnumValue("CoIMPlanSendInvoiceOnMainChannelPEO")
    CO_IM_PLAN_SEND_INVOICE_ON_MAIN_CHANNEL_PEO("CoIMPlanSendInvoiceOnMainChannelPEO"),
    @XmlEnumValue("CoIMChangeDatePlanSendInvoiceOnMainChannel")
    CO_IM_CHANGE_DATE_PLAN_SEND_INVOICE_ON_MAIN_CHANNEL("CoIMChangeDatePlanSendInvoiceOnMainChannel"),
    @XmlEnumValue("CoIMChangeDatePlanSendInvoiceOnMainChannelSDI")
    CO_IM_CHANGE_DATE_PLAN_SEND_INVOICE_ON_MAIN_CHANNEL_SDI("CoIMChangeDatePlanSendInvoiceOnMainChannelSDI"),
    @XmlEnumValue("CoIMChangeDatePlanSendInvoiceOnMainChannelPEC")
    CO_IM_CHANGE_DATE_PLAN_SEND_INVOICE_ON_MAIN_CHANNEL_PEC("CoIMChangeDatePlanSendInvoiceOnMainChannelPEC"),
    @XmlEnumValue("CoIMChangeDatePlanSendInvoiceOnMainChannelPEO")
    CO_IM_CHANGE_DATE_PLAN_SEND_INVOICE_ON_MAIN_CHANNEL_PEO("CoIMChangeDatePlanSendInvoiceOnMainChannelPEO"),
    @XmlEnumValue("CoIMSendInvoiceOnSubChannel")
    CO_IM_SEND_INVOICE_ON_SUB_CHANNEL("CoIMSendInvoiceOnSubChannel"),
    @XmlEnumValue("CoIMSendInvoiceOnSubChannelSDI")
    CO_IM_SEND_INVOICE_ON_SUB_CHANNEL_SDI("CoIMSendInvoiceOnSubChannelSDI"),
    @XmlEnumValue("CoIMSendInvoiceOnSubChannelPEC")
    CO_IM_SEND_INVOICE_ON_SUB_CHANNEL_PEC("CoIMSendInvoiceOnSubChannelPEC"),
    @XmlEnumValue("CoIMSendInvoiceOnSubChannelPEO")
    CO_IM_SEND_INVOICE_ON_SUB_CHANNEL_PEO("CoIMSendInvoiceOnSubChannelPEO"),
    @XmlEnumValue("CoIMStopSendInvoiceOnMainChannel")
    CO_IM_STOP_SEND_INVOICE_ON_MAIN_CHANNEL("CoIMStopSendInvoiceOnMainChannel"),
    @XmlEnumValue("CoIMReSendInvoiceOnSubChannel")
    CO_IM_RE_SEND_INVOICE_ON_SUB_CHANNEL("CoIMReSendInvoiceOnSubChannel"),
    @XmlEnumValue("CoIMReSendInvoiceOnSubChannelPEC")
    CO_IM_RE_SEND_INVOICE_ON_SUB_CHANNEL_PEC("CoIMReSendInvoiceOnSubChannelPEC"),
    @XmlEnumValue("CoIMReSendInvoiceOnSubChannelPEO")
    CO_IM_RE_SEND_INVOICE_ON_SUB_CHANNEL_PEO("CoIMReSendInvoiceOnSubChannelPEO"),
    @XmlEnumValue("CoIMSendApprovalRefusalToSDI")
    CO_IM_SEND_APPROVAL_REFUSAL_TO_SDI("CoIMSendApprovalRefusalToSDI"),
    @XmlEnumValue("CoIMApprovalRefusal")
    CO_IM_APPROVAL_REFUSAL("CoIMApprovalRefusal"),
    @XmlEnumValue("CoIMSendApprovalToSDI")
    CO_IM_SEND_APPROVAL_TO_SDI("CoIMSendApprovalToSDI"),
    @XmlEnumValue("CoIMSendRefusalToSDI")
    CO_IM_SEND_REFUSAL_TO_SDI("CoIMSendRefusalToSDI"),
    @XmlEnumValue("CoIMSendInvoiceOnMainChannelADP")
    CO_IM_SEND_INVOICE_ON_MAIN_CHANNEL_ADP("CoIMSendInvoiceOnMainChannelADP"),
    @XmlEnumValue("CoIMSendInvoiceOnSubChannelADP")
    CO_IM_SEND_INVOICE_ON_SUB_CHANNEL_ADP("CoIMSendInvoiceOnSubChannelADP"),
    @XmlEnumValue("CoIMReSendInvoiceOnSubChannelADP")
    CO_IM_RE_SEND_INVOICE_ON_SUB_CHANNEL_ADP("CoIMReSendInvoiceOnSubChannelADP"),
    @XmlEnumValue("CoIMReSendInvoiceOnSubChannelSDI")
    CO_IM_RE_SEND_INVOICE_ON_SUB_CHANNEL_SDI("CoIMReSendInvoiceOnSubChannelSDI"),
    @XmlEnumValue("CoIMReSendInvoiceOnMainChannel")
    CO_IM_RE_SEND_INVOICE_ON_MAIN_CHANNEL("CoIMReSendInvoiceOnMainChannel"),
    @XmlEnumValue("CoIMReSendInvoiceOnMainChannelSDI")
    CO_IM_RE_SEND_INVOICE_ON_MAIN_CHANNEL_SDI("CoIMReSendInvoiceOnMainChannelSDI"),
    @XmlEnumValue("CoIMReSendInvoiceOnMainChannelPEC")
    CO_IM_RE_SEND_INVOICE_ON_MAIN_CHANNEL_PEC("CoIMReSendInvoiceOnMainChannelPEC"),
    @XmlEnumValue("CoIMReSendInvoiceOnMainChannelPEO")
    CO_IM_RE_SEND_INVOICE_ON_MAIN_CHANNEL_PEO("CoIMReSendInvoiceOnMainChannelPEO"),
    @XmlEnumValue("CoIMReSendInvoiceOnMainChannelADP")
    CO_IM_RE_SEND_INVOICE_ON_MAIN_CHANNEL_ADP("CoIMReSendInvoiceOnMainChannelADP"),
    @XmlEnumValue("CoIMPlanReSendInvoiceOnMainChannel")
    CO_IM_PLAN_RE_SEND_INVOICE_ON_MAIN_CHANNEL("CoIMPlanReSendInvoiceOnMainChannel"),
    @XmlEnumValue("CoIMPlanReSendInvoiceOnMainChannelSDI")
    CO_IM_PLAN_RE_SEND_INVOICE_ON_MAIN_CHANNEL_SDI("CoIMPlanReSendInvoiceOnMainChannelSDI"),
    @XmlEnumValue("CoIMPlanReSendInvoiceOnMainChannelPEC")
    CO_IM_PLAN_RE_SEND_INVOICE_ON_MAIN_CHANNEL_PEC("CoIMPlanReSendInvoiceOnMainChannelPEC"),
    @XmlEnumValue("CoIMPlanReSendInvoiceOnMainChannelPEO")
    CO_IM_PLAN_RE_SEND_INVOICE_ON_MAIN_CHANNEL_PEO("CoIMPlanReSendInvoiceOnMainChannelPEO"),
    @XmlEnumValue("CoIMChangeDatePlanReSendInvoiceOnMainChannel")
    CO_IM_CHANGE_DATE_PLAN_RE_SEND_INVOICE_ON_MAIN_CHANNEL("CoIMChangeDatePlanReSendInvoiceOnMainChannel"),
    @XmlEnumValue("CoIMChangeDatePlanReSendInvoiceOnMainChannelSDI")
    CO_IM_CHANGE_DATE_PLAN_RE_SEND_INVOICE_ON_MAIN_CHANNEL_SDI("CoIMChangeDatePlanReSendInvoiceOnMainChannelSDI"),
    @XmlEnumValue("CoIMChangeDatePlanReSendInvoiceOnMainChannelPEC")
    CO_IM_CHANGE_DATE_PLAN_RE_SEND_INVOICE_ON_MAIN_CHANNEL_PEC("CoIMChangeDatePlanReSendInvoiceOnMainChannelPEC"),
    @XmlEnumValue("CoIMChangeDatePlanReSendInvoiceOnMainChannelPEO")
    CO_IM_CHANGE_DATE_PLAN_RE_SEND_INVOICE_ON_MAIN_CHANNEL_PEO("CoIMChangeDatePlanReSendInvoiceOnMainChannelPEO"),
    @XmlEnumValue("CoIMModifyInvoiceData")
    CO_IM_MODIFY_INVOICE_DATA("CoIMModifyInvoiceData"),
    @XmlEnumValue("CoNsoOrderManagement")
    CO_NSO_ORDER_MANAGEMENT("CoNsoOrderManagement"),
    @XmlEnumValue("CoNsoSendOrder")
    CO_NSO_SEND_ORDER("CoNsoSendOrder"),
    @XmlEnumValue("CoNsoAcceptRejectOrder")
    CO_NSO_ACCEPT_REJECT_ORDER("CoNsoAcceptRejectOrder"),
    @XmlEnumValue("CoNsoAcceptRejectModification")
    CO_NSO_ACCEPT_REJECT_MODIFICATION("CoNsoAcceptRejectModification");
    private final String value;

    CardOperation(String v) {
        value = v;
    }

    public String value() {
        return value;
    }

    public static CardOperation fromValue(String v) {
        for (CardOperation c: CardOperation.values()) {
            if (c.value.equals(v)) {
                return c;
            }
        }
        throw new IllegalArgumentException(v);
    }

}
