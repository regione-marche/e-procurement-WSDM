
package it.archiflow94;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for CardOperations complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="CardOperations">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="AdditionalData" type="{http://www.w3.org/2001/XMLSchema}boolean" minOccurs="0"/>
 *         &lt;element name="AnalogCompliantCopyDoc" type="{http://www.w3.org/2001/XMLSchema}boolean" minOccurs="0"/>
 *         &lt;element name="Annotations" type="{http://www.w3.org/2001/XMLSchema}boolean" minOccurs="0"/>
 *         &lt;element name="ArchivalCollation" type="{http://www.w3.org/2001/XMLSchema}boolean" minOccurs="0"/>
 *         &lt;element name="AutoUpdateDoc" type="{http://www.w3.org/2001/XMLSchema}boolean" minOccurs="0"/>
 *         &lt;element name="Cancellation" type="{http://www.w3.org/2001/XMLSchema}boolean" minOccurs="0"/>
 *         &lt;element name="CheckInOutDoc" type="{http://www.w3.org/2001/XMLSchema}boolean" minOccurs="0"/>
 *         &lt;element name="ConsolidateDoc" type="{http://www.w3.org/2001/XMLSchema}boolean" minOccurs="0"/>
 *         &lt;element name="ConvToPdfDoc" type="{http://www.w3.org/2001/XMLSchema}boolean" minOccurs="0"/>
 *         &lt;element name="CreateLinkArchivalCollation" type="{http://www.w3.org/2001/XMLSchema}boolean" minOccurs="0"/>
 *         &lt;element name="DigestAtt" type="{http://www.w3.org/2001/XMLSchema}boolean" minOccurs="0"/>
 *         &lt;element name="DigestDoc" type="{http://www.w3.org/2001/XMLSchema}boolean" minOccurs="0"/>
 *         &lt;element name="DigitalCompliantCopyDoc" type="{http://www.w3.org/2001/XMLSchema}boolean" minOccurs="0"/>
 *         &lt;element name="DigitalSign" type="{http://www.w3.org/2001/XMLSchema}boolean" minOccurs="0"/>
 *         &lt;element name="DigitalSignAtt" type="{http://www.w3.org/2001/XMLSchema}boolean" minOccurs="0"/>
 *         &lt;element name="DuplicateCardIndexes" type="{http://www.w3.org/2001/XMLSchema}boolean" minOccurs="0"/>
 *         &lt;element name="DuplicateCardIndexesAndDoc" type="{http://www.w3.org/2001/XMLSchema}boolean" minOccurs="0"/>
 *         &lt;element name="ElectronicSign" type="{http://www.w3.org/2001/XMLSchema}boolean" minOccurs="0"/>
 *         &lt;element name="ElectronicStampingSign" type="{http://www.w3.org/2001/XMLSchema}boolean" minOccurs="0"/>
 *         &lt;element name="GlifoAtt" type="{http://www.w3.org/2001/XMLSchema}boolean" minOccurs="0"/>
 *         &lt;element name="GlifoDoc" type="{http://www.w3.org/2001/XMLSchema}boolean" minOccurs="0"/>
 *         &lt;element name="GraphometricSign" type="{http://www.w3.org/2001/XMLSchema}boolean" minOccurs="0"/>
 *         &lt;element name="IMApprovalRefusal" type="{http://www.w3.org/2001/XMLSchema}boolean" minOccurs="0"/>
 *         &lt;element name="IMChangeDatePlanReSendInvoiceOnMainChannel" type="{http://www.w3.org/2001/XMLSchema}boolean" minOccurs="0"/>
 *         &lt;element name="IMChangeDatePlanReSendInvoiceOnMainChannelPEC" type="{http://www.w3.org/2001/XMLSchema}boolean" minOccurs="0"/>
 *         &lt;element name="IMChangeDatePlanReSendInvoiceOnMainChannelPEO" type="{http://www.w3.org/2001/XMLSchema}boolean" minOccurs="0"/>
 *         &lt;element name="IMChangeDatePlanReSendInvoiceOnMainChannelSDI" type="{http://www.w3.org/2001/XMLSchema}boolean" minOccurs="0"/>
 *         &lt;element name="IMChangeDatePlanSendInvoiceOnMainChannel" type="{http://www.w3.org/2001/XMLSchema}boolean" minOccurs="0"/>
 *         &lt;element name="IMChangeDatePlanSendInvoiceOnMainChannelPEC" type="{http://www.w3.org/2001/XMLSchema}boolean" minOccurs="0"/>
 *         &lt;element name="IMChangeDatePlanSendInvoiceOnMainChannelPEO" type="{http://www.w3.org/2001/XMLSchema}boolean" minOccurs="0"/>
 *         &lt;element name="IMChangeDatePlanSendInvoiceOnMainChannelSDI" type="{http://www.w3.org/2001/XMLSchema}boolean" minOccurs="0"/>
 *         &lt;element name="IMChannelSwitching" type="{http://www.w3.org/2001/XMLSchema}boolean" minOccurs="0"/>
 *         &lt;element name="IMModifyInvoiceData" type="{http://www.w3.org/2001/XMLSchema}boolean" minOccurs="0"/>
 *         &lt;element name="IMPlanReSendInvoiceOnMainChannel" type="{http://www.w3.org/2001/XMLSchema}boolean" minOccurs="0"/>
 *         &lt;element name="IMPlanReSendInvoiceOnMainChannelPEC" type="{http://www.w3.org/2001/XMLSchema}boolean" minOccurs="0"/>
 *         &lt;element name="IMPlanReSendInvoiceOnMainChannelPEO" type="{http://www.w3.org/2001/XMLSchema}boolean" minOccurs="0"/>
 *         &lt;element name="IMPlanReSendInvoiceOnMainChannelSDI" type="{http://www.w3.org/2001/XMLSchema}boolean" minOccurs="0"/>
 *         &lt;element name="IMPlanSendInvoiceOnMainChannel" type="{http://www.w3.org/2001/XMLSchema}boolean" minOccurs="0"/>
 *         &lt;element name="IMPlanSendInvoiceOnMainChannelPEC" type="{http://www.w3.org/2001/XMLSchema}boolean" minOccurs="0"/>
 *         &lt;element name="IMPlanSendInvoiceOnMainChannelPEO" type="{http://www.w3.org/2001/XMLSchema}boolean" minOccurs="0"/>
 *         &lt;element name="IMPlanSendInvoiceOnMainChannelSDI" type="{http://www.w3.org/2001/XMLSchema}boolean" minOccurs="0"/>
 *         &lt;element name="IMReSendInvoiceOnMainChannel" type="{http://www.w3.org/2001/XMLSchema}boolean" minOccurs="0"/>
 *         &lt;element name="IMReSendInvoiceOnMainChannelADP" type="{http://www.w3.org/2001/XMLSchema}boolean" minOccurs="0"/>
 *         &lt;element name="IMReSendInvoiceOnMainChannelPEC" type="{http://www.w3.org/2001/XMLSchema}boolean" minOccurs="0"/>
 *         &lt;element name="IMReSendInvoiceOnMainChannelPEO" type="{http://www.w3.org/2001/XMLSchema}boolean" minOccurs="0"/>
 *         &lt;element name="IMReSendInvoiceOnMainChannelSDI" type="{http://www.w3.org/2001/XMLSchema}boolean" minOccurs="0"/>
 *         &lt;element name="IMReSendInvoiceOnSubChannel" type="{http://www.w3.org/2001/XMLSchema}boolean" minOccurs="0"/>
 *         &lt;element name="IMReSendInvoiceOnSubChannelADP" type="{http://www.w3.org/2001/XMLSchema}boolean" minOccurs="0"/>
 *         &lt;element name="IMReSendInvoiceOnSubChannelPEC" type="{http://www.w3.org/2001/XMLSchema}boolean" minOccurs="0"/>
 *         &lt;element name="IMReSendInvoiceOnSubChannelPEO" type="{http://www.w3.org/2001/XMLSchema}boolean" minOccurs="0"/>
 *         &lt;element name="IMReSendInvoiceOnSubChannelSDI" type="{http://www.w3.org/2001/XMLSchema}boolean" minOccurs="0"/>
 *         &lt;element name="IMSendApprovalRefusalToSDI" type="{http://www.w3.org/2001/XMLSchema}boolean" minOccurs="0"/>
 *         &lt;element name="IMSendApprovalToSDI" type="{http://www.w3.org/2001/XMLSchema}boolean" minOccurs="0"/>
 *         &lt;element name="IMSendInvoiceOnMainChannel" type="{http://www.w3.org/2001/XMLSchema}boolean" minOccurs="0"/>
 *         &lt;element name="IMSendInvoiceOnMainChannelADP" type="{http://www.w3.org/2001/XMLSchema}boolean" minOccurs="0"/>
 *         &lt;element name="IMSendInvoiceOnMainChannelPEC" type="{http://www.w3.org/2001/XMLSchema}boolean" minOccurs="0"/>
 *         &lt;element name="IMSendInvoiceOnMainChannelPEO" type="{http://www.w3.org/2001/XMLSchema}boolean" minOccurs="0"/>
 *         &lt;element name="IMSendInvoiceOnMainChannelSDI" type="{http://www.w3.org/2001/XMLSchema}boolean" minOccurs="0"/>
 *         &lt;element name="IMSendInvoiceOnSubChannel" type="{http://www.w3.org/2001/XMLSchema}boolean" minOccurs="0"/>
 *         &lt;element name="IMSendInvoiceOnSubChannelADP" type="{http://www.w3.org/2001/XMLSchema}boolean" minOccurs="0"/>
 *         &lt;element name="IMSendInvoiceOnSubChannelPEC" type="{http://www.w3.org/2001/XMLSchema}boolean" minOccurs="0"/>
 *         &lt;element name="IMSendInvoiceOnSubChannelPEO" type="{http://www.w3.org/2001/XMLSchema}boolean" minOccurs="0"/>
 *         &lt;element name="IMSendInvoiceOnSubChannelSDI" type="{http://www.w3.org/2001/XMLSchema}boolean" minOccurs="0"/>
 *         &lt;element name="IMSendRefusalToSDI" type="{http://www.w3.org/2001/XMLSchema}boolean" minOccurs="0"/>
 *         &lt;element name="IMStopSendInvoiceOnMainChannel" type="{http://www.w3.org/2001/XMLSchema}boolean" minOccurs="0"/>
 *         &lt;element name="ImportAddDoc" type="{http://www.w3.org/2001/XMLSchema}boolean" minOccurs="0"/>
 *         &lt;element name="ImportDoc" type="{http://www.w3.org/2001/XMLSchema}boolean" minOccurs="0"/>
 *         &lt;element name="Indexes" type="{http://www.w3.org/2001/XMLSchema}boolean" minOccurs="0"/>
 *         &lt;element name="InsModAtt" type="{http://www.w3.org/2001/XMLSchema}boolean" minOccurs="0"/>
 *         &lt;element name="Invalidation" type="{http://www.w3.org/2001/XMLSchema}boolean" minOccurs="0"/>
 *         &lt;element name="IsWf" type="{http://www.w3.org/2001/XMLSchema}boolean" minOccurs="0"/>
 *         &lt;element name="LockDoc" type="{http://www.w3.org/2001/XMLSchema}boolean" minOccurs="0"/>
 *         &lt;element name="PdfNativeSign" type="{http://www.w3.org/2001/XMLSchema}boolean" minOccurs="0"/>
 *         &lt;element name="PdfNativeSignAtt" type="{http://www.w3.org/2001/XMLSchema}boolean" minOccurs="0"/>
 *         &lt;element name="Permalink" type="{http://www.w3.org/2001/XMLSchema}boolean" minOccurs="0"/>
 *         &lt;element name="PosteOnLine" type="{http://www.w3.org/2001/XMLSchema}boolean" minOccurs="0"/>
 *         &lt;element name="PressMarkDoc" type="{http://www.w3.org/2001/XMLSchema}boolean" minOccurs="0"/>
 *         &lt;element name="ProtocolCard" type="{http://www.w3.org/2001/XMLSchema}boolean" minOccurs="0"/>
 *         &lt;element name="RemoteSign" type="{http://www.w3.org/2001/XMLSchema}boolean" minOccurs="0"/>
 *         &lt;element name="RemoteSignAtt" type="{http://www.w3.org/2001/XMLSchema}boolean" minOccurs="0"/>
 *         &lt;element name="SaveVersionDoc" type="{http://www.w3.org/2001/XMLSchema}boolean" minOccurs="0"/>
 *         &lt;element name="ScanAddDoc" type="{http://www.w3.org/2001/XMLSchema}boolean" minOccurs="0"/>
 *         &lt;element name="ScanDoc" type="{http://www.w3.org/2001/XMLSchema}boolean" minOccurs="0"/>
 *         &lt;element name="SendExtendedEmail" type="{http://www.w3.org/2001/XMLSchema}boolean" minOccurs="0"/>
 *         &lt;element name="SendExternalEmail" type="{http://www.w3.org/2001/XMLSchema}boolean" minOccurs="0"/>
 *         &lt;element name="SendInteropEmail" type="{http://www.w3.org/2001/XMLSchema}boolean" minOccurs="0"/>
 *         &lt;element name="SendInteropRefuseEmail" type="{http://www.w3.org/2001/XMLSchema}boolean" minOccurs="0"/>
 *         &lt;element name="SendInvoice" type="{http://www.w3.org/2001/XMLSchema}boolean" minOccurs="0"/>
 *         &lt;element name="SendNotificationEC" type="{http://www.w3.org/2001/XMLSchema}boolean" minOccurs="0"/>
 *         &lt;element name="SendPECCourtesyCopy" type="{http://www.w3.org/2001/XMLSchema}boolean" minOccurs="0"/>
 *         &lt;element name="SendPECPEOEmail" type="{http://www.w3.org/2001/XMLSchema}boolean" minOccurs="0"/>
 *         &lt;element name="SendPECPEOEmailForward" type="{http://www.w3.org/2001/XMLSchema}boolean" minOccurs="0"/>
 *         &lt;element name="SendPECPEOEmailProtocolReply" type="{http://www.w3.org/2001/XMLSchema}boolean" minOccurs="0"/>
 *         &lt;element name="SendPECPEOEmailReply" type="{http://www.w3.org/2001/XMLSchema}boolean" minOccurs="0"/>
 *         &lt;element name="Sharing" type="{http://www.w3.org/2001/XMLSchema}boolean" minOccurs="0"/>
 *         &lt;element name="StandardCollation" type="{http://www.w3.org/2001/XMLSchema}boolean" minOccurs="0"/>
 *         &lt;element name="StoreInteropEmail" type="{http://www.w3.org/2001/XMLSchema}boolean" minOccurs="0"/>
 *         &lt;element name="StorePECPEOEmail" type="{http://www.w3.org/2001/XMLSchema}boolean" minOccurs="0"/>
 *         &lt;element name="TaskOnDemand" type="{http://www.w3.org/2001/XMLSchema}boolean" minOccurs="0"/>
 *         &lt;element name="TimeStamp" type="{http://www.w3.org/2001/XMLSchema}boolean" minOccurs="0"/>
 *         &lt;element name="TimeStampAtt" type="{http://www.w3.org/2001/XMLSchema}boolean" minOccurs="0"/>
 *         &lt;element name="Visibility" type="{http://www.w3.org/2001/XMLSchema}boolean" minOccurs="0"/>
 *         &lt;element name="WfAssignInChargeTo" type="{http://www.w3.org/2001/XMLSchema}boolean" minOccurs="0"/>
 *         &lt;element name="WfForward" type="{http://www.w3.org/2001/XMLSchema}boolean" minOccurs="0"/>
 *         &lt;element name="WfProcessInfo" type="{http://www.w3.org/2001/XMLSchema}boolean" minOccurs="0"/>
 *         &lt;element name="WfProcessRestore" type="{http://www.w3.org/2001/XMLSchema}boolean" minOccurs="0"/>
 *         &lt;element name="WfProcessStart" type="{http://www.w3.org/2001/XMLSchema}boolean" minOccurs="0"/>
 *         &lt;element name="WfProcessStop" type="{http://www.w3.org/2001/XMLSchema}boolean" minOccurs="0"/>
 *         &lt;element name="WfProcessSuspend" type="{http://www.w3.org/2001/XMLSchema}boolean" minOccurs="0"/>
 *         &lt;element name="WfRefuse" type="{http://www.w3.org/2001/XMLSchema}boolean" minOccurs="0"/>
 *         &lt;element name="WfRemoveInChargeFrom" type="{http://www.w3.org/2001/XMLSchema}boolean" minOccurs="0"/>
 *         &lt;element name="WfTakeInCharge" type="{http://www.w3.org/2001/XMLSchema}boolean" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "CardOperations", namespace = "http://schemas.datacontract.org/2004/07/SIAV.Archiflow.Types", propOrder = {
    "additionalData",
    "analogCompliantCopyDoc",
    "annotations",
    "archivalCollation",
    "autoUpdateDoc",
    "cancellation",
    "checkInOutDoc",
    "consolidateDoc",
    "convToPdfDoc",
    "createLinkArchivalCollation",
    "digestAtt",
    "digestDoc",
    "digitalCompliantCopyDoc",
    "digitalSign",
    "digitalSignAtt",
    "duplicateCardIndexes",
    "duplicateCardIndexesAndDoc",
    "electronicSign",
    "electronicStampingSign",
    "glifoAtt",
    "glifoDoc",
    "graphometricSign",
    "imApprovalRefusal",
    "imChangeDatePlanReSendInvoiceOnMainChannel",
    "imChangeDatePlanReSendInvoiceOnMainChannelPEC",
    "imChangeDatePlanReSendInvoiceOnMainChannelPEO",
    "imChangeDatePlanReSendInvoiceOnMainChannelSDI",
    "imChangeDatePlanSendInvoiceOnMainChannel",
    "imChangeDatePlanSendInvoiceOnMainChannelPEC",
    "imChangeDatePlanSendInvoiceOnMainChannelPEO",
    "imChangeDatePlanSendInvoiceOnMainChannelSDI",
    "imChannelSwitching",
    "imModifyInvoiceData",
    "imPlanReSendInvoiceOnMainChannel",
    "imPlanReSendInvoiceOnMainChannelPEC",
    "imPlanReSendInvoiceOnMainChannelPEO",
    "imPlanReSendInvoiceOnMainChannelSDI",
    "imPlanSendInvoiceOnMainChannel",
    "imPlanSendInvoiceOnMainChannelPEC",
    "imPlanSendInvoiceOnMainChannelPEO",
    "imPlanSendInvoiceOnMainChannelSDI",
    "imReSendInvoiceOnMainChannel",
    "imReSendInvoiceOnMainChannelADP",
    "imReSendInvoiceOnMainChannelPEC",
    "imReSendInvoiceOnMainChannelPEO",
    "imReSendInvoiceOnMainChannelSDI",
    "imReSendInvoiceOnSubChannel",
    "imReSendInvoiceOnSubChannelADP",
    "imReSendInvoiceOnSubChannelPEC",
    "imReSendInvoiceOnSubChannelPEO",
    "imReSendInvoiceOnSubChannelSDI",
    "imSendApprovalRefusalToSDI",
    "imSendApprovalToSDI",
    "imSendInvoiceOnMainChannel",
    "imSendInvoiceOnMainChannelADP",
    "imSendInvoiceOnMainChannelPEC",
    "imSendInvoiceOnMainChannelPEO",
    "imSendInvoiceOnMainChannelSDI",
    "imSendInvoiceOnSubChannel",
    "imSendInvoiceOnSubChannelADP",
    "imSendInvoiceOnSubChannelPEC",
    "imSendInvoiceOnSubChannelPEO",
    "imSendInvoiceOnSubChannelSDI",
    "imSendRefusalToSDI",
    "imStopSendInvoiceOnMainChannel",
    "importAddDoc",
    "importDoc",
    "indexes",
    "insModAtt",
    "invalidation",
    "isWf",
    "lockDoc",
    "pdfNativeSign",
    "pdfNativeSignAtt",
    "permalink",
    "posteOnLine",
    "pressMarkDoc",
    "protocolCard",
    "remoteSign",
    "remoteSignAtt",
    "saveVersionDoc",
    "scanAddDoc",
    "scanDoc",
    "sendExtendedEmail",
    "sendExternalEmail",
    "sendInteropEmail",
    "sendInteropRefuseEmail",
    "sendInvoice",
    "sendNotificationEC",
    "sendPECCourtesyCopy",
    "sendPECPEOEmail",
    "sendPECPEOEmailForward",
    "sendPECPEOEmailProtocolReply",
    "sendPECPEOEmailReply",
    "sharing",
    "standardCollation",
    "storeInteropEmail",
    "storePECPEOEmail",
    "taskOnDemand",
    "timeStamp",
    "timeStampAtt",
    "visibility",
    "wfAssignInChargeTo",
    "wfForward",
    "wfProcessInfo",
    "wfProcessRestore",
    "wfProcessStart",
    "wfProcessStop",
    "wfProcessSuspend",
    "wfRefuse",
    "wfRemoveInChargeFrom",
    "wfTakeInCharge"
})
public class CardOperations {

    @XmlElement(name = "AdditionalData")
    protected Boolean additionalData;
    @XmlElement(name = "AnalogCompliantCopyDoc")
    protected Boolean analogCompliantCopyDoc;
    @XmlElement(name = "Annotations")
    protected Boolean annotations;
    @XmlElement(name = "ArchivalCollation")
    protected Boolean archivalCollation;
    @XmlElement(name = "AutoUpdateDoc")
    protected Boolean autoUpdateDoc;
    @XmlElement(name = "Cancellation")
    protected Boolean cancellation;
    @XmlElement(name = "CheckInOutDoc")
    protected Boolean checkInOutDoc;
    @XmlElement(name = "ConsolidateDoc")
    protected Boolean consolidateDoc;
    @XmlElement(name = "ConvToPdfDoc")
    protected Boolean convToPdfDoc;
    @XmlElement(name = "CreateLinkArchivalCollation")
    protected Boolean createLinkArchivalCollation;
    @XmlElement(name = "DigestAtt")
    protected Boolean digestAtt;
    @XmlElement(name = "DigestDoc")
    protected Boolean digestDoc;
    @XmlElement(name = "DigitalCompliantCopyDoc")
    protected Boolean digitalCompliantCopyDoc;
    @XmlElement(name = "DigitalSign")
    protected Boolean digitalSign;
    @XmlElement(name = "DigitalSignAtt")
    protected Boolean digitalSignAtt;
    @XmlElement(name = "DuplicateCardIndexes")
    protected Boolean duplicateCardIndexes;
    @XmlElement(name = "DuplicateCardIndexesAndDoc")
    protected Boolean duplicateCardIndexesAndDoc;
    @XmlElement(name = "ElectronicSign")
    protected Boolean electronicSign;
    @XmlElement(name = "ElectronicStampingSign")
    protected Boolean electronicStampingSign;
    @XmlElement(name = "GlifoAtt")
    protected Boolean glifoAtt;
    @XmlElement(name = "GlifoDoc")
    protected Boolean glifoDoc;
    @XmlElement(name = "GraphometricSign")
    protected Boolean graphometricSign;
    @XmlElement(name = "IMApprovalRefusal")
    protected Boolean imApprovalRefusal;
    @XmlElement(name = "IMChangeDatePlanReSendInvoiceOnMainChannel")
    protected Boolean imChangeDatePlanReSendInvoiceOnMainChannel;
    @XmlElement(name = "IMChangeDatePlanReSendInvoiceOnMainChannelPEC")
    protected Boolean imChangeDatePlanReSendInvoiceOnMainChannelPEC;
    @XmlElement(name = "IMChangeDatePlanReSendInvoiceOnMainChannelPEO")
    protected Boolean imChangeDatePlanReSendInvoiceOnMainChannelPEO;
    @XmlElement(name = "IMChangeDatePlanReSendInvoiceOnMainChannelSDI")
    protected Boolean imChangeDatePlanReSendInvoiceOnMainChannelSDI;
    @XmlElement(name = "IMChangeDatePlanSendInvoiceOnMainChannel")
    protected Boolean imChangeDatePlanSendInvoiceOnMainChannel;
    @XmlElement(name = "IMChangeDatePlanSendInvoiceOnMainChannelPEC")
    protected Boolean imChangeDatePlanSendInvoiceOnMainChannelPEC;
    @XmlElement(name = "IMChangeDatePlanSendInvoiceOnMainChannelPEO")
    protected Boolean imChangeDatePlanSendInvoiceOnMainChannelPEO;
    @XmlElement(name = "IMChangeDatePlanSendInvoiceOnMainChannelSDI")
    protected Boolean imChangeDatePlanSendInvoiceOnMainChannelSDI;
    @XmlElement(name = "IMChannelSwitching")
    protected Boolean imChannelSwitching;
    @XmlElement(name = "IMModifyInvoiceData")
    protected Boolean imModifyInvoiceData;
    @XmlElement(name = "IMPlanReSendInvoiceOnMainChannel")
    protected Boolean imPlanReSendInvoiceOnMainChannel;
    @XmlElement(name = "IMPlanReSendInvoiceOnMainChannelPEC")
    protected Boolean imPlanReSendInvoiceOnMainChannelPEC;
    @XmlElement(name = "IMPlanReSendInvoiceOnMainChannelPEO")
    protected Boolean imPlanReSendInvoiceOnMainChannelPEO;
    @XmlElement(name = "IMPlanReSendInvoiceOnMainChannelSDI")
    protected Boolean imPlanReSendInvoiceOnMainChannelSDI;
    @XmlElement(name = "IMPlanSendInvoiceOnMainChannel")
    protected Boolean imPlanSendInvoiceOnMainChannel;
    @XmlElement(name = "IMPlanSendInvoiceOnMainChannelPEC")
    protected Boolean imPlanSendInvoiceOnMainChannelPEC;
    @XmlElement(name = "IMPlanSendInvoiceOnMainChannelPEO")
    protected Boolean imPlanSendInvoiceOnMainChannelPEO;
    @XmlElement(name = "IMPlanSendInvoiceOnMainChannelSDI")
    protected Boolean imPlanSendInvoiceOnMainChannelSDI;
    @XmlElement(name = "IMReSendInvoiceOnMainChannel")
    protected Boolean imReSendInvoiceOnMainChannel;
    @XmlElement(name = "IMReSendInvoiceOnMainChannelADP")
    protected Boolean imReSendInvoiceOnMainChannelADP;
    @XmlElement(name = "IMReSendInvoiceOnMainChannelPEC")
    protected Boolean imReSendInvoiceOnMainChannelPEC;
    @XmlElement(name = "IMReSendInvoiceOnMainChannelPEO")
    protected Boolean imReSendInvoiceOnMainChannelPEO;
    @XmlElement(name = "IMReSendInvoiceOnMainChannelSDI")
    protected Boolean imReSendInvoiceOnMainChannelSDI;
    @XmlElement(name = "IMReSendInvoiceOnSubChannel")
    protected Boolean imReSendInvoiceOnSubChannel;
    @XmlElement(name = "IMReSendInvoiceOnSubChannelADP")
    protected Boolean imReSendInvoiceOnSubChannelADP;
    @XmlElement(name = "IMReSendInvoiceOnSubChannelPEC")
    protected Boolean imReSendInvoiceOnSubChannelPEC;
    @XmlElement(name = "IMReSendInvoiceOnSubChannelPEO")
    protected Boolean imReSendInvoiceOnSubChannelPEO;
    @XmlElement(name = "IMReSendInvoiceOnSubChannelSDI")
    protected Boolean imReSendInvoiceOnSubChannelSDI;
    @XmlElement(name = "IMSendApprovalRefusalToSDI")
    protected Boolean imSendApprovalRefusalToSDI;
    @XmlElement(name = "IMSendApprovalToSDI")
    protected Boolean imSendApprovalToSDI;
    @XmlElement(name = "IMSendInvoiceOnMainChannel")
    protected Boolean imSendInvoiceOnMainChannel;
    @XmlElement(name = "IMSendInvoiceOnMainChannelADP")
    protected Boolean imSendInvoiceOnMainChannelADP;
    @XmlElement(name = "IMSendInvoiceOnMainChannelPEC")
    protected Boolean imSendInvoiceOnMainChannelPEC;
    @XmlElement(name = "IMSendInvoiceOnMainChannelPEO")
    protected Boolean imSendInvoiceOnMainChannelPEO;
    @XmlElement(name = "IMSendInvoiceOnMainChannelSDI")
    protected Boolean imSendInvoiceOnMainChannelSDI;
    @XmlElement(name = "IMSendInvoiceOnSubChannel")
    protected Boolean imSendInvoiceOnSubChannel;
    @XmlElement(name = "IMSendInvoiceOnSubChannelADP")
    protected Boolean imSendInvoiceOnSubChannelADP;
    @XmlElement(name = "IMSendInvoiceOnSubChannelPEC")
    protected Boolean imSendInvoiceOnSubChannelPEC;
    @XmlElement(name = "IMSendInvoiceOnSubChannelPEO")
    protected Boolean imSendInvoiceOnSubChannelPEO;
    @XmlElement(name = "IMSendInvoiceOnSubChannelSDI")
    protected Boolean imSendInvoiceOnSubChannelSDI;
    @XmlElement(name = "IMSendRefusalToSDI")
    protected Boolean imSendRefusalToSDI;
    @XmlElement(name = "IMStopSendInvoiceOnMainChannel")
    protected Boolean imStopSendInvoiceOnMainChannel;
    @XmlElement(name = "ImportAddDoc")
    protected Boolean importAddDoc;
    @XmlElement(name = "ImportDoc")
    protected Boolean importDoc;
    @XmlElement(name = "Indexes")
    protected Boolean indexes;
    @XmlElement(name = "InsModAtt")
    protected Boolean insModAtt;
    @XmlElement(name = "Invalidation")
    protected Boolean invalidation;
    @XmlElement(name = "IsWf")
    protected Boolean isWf;
    @XmlElement(name = "LockDoc")
    protected Boolean lockDoc;
    @XmlElement(name = "PdfNativeSign")
    protected Boolean pdfNativeSign;
    @XmlElement(name = "PdfNativeSignAtt")
    protected Boolean pdfNativeSignAtt;
    @XmlElement(name = "Permalink")
    protected Boolean permalink;
    @XmlElement(name = "PosteOnLine")
    protected Boolean posteOnLine;
    @XmlElement(name = "PressMarkDoc")
    protected Boolean pressMarkDoc;
    @XmlElement(name = "ProtocolCard")
    protected Boolean protocolCard;
    @XmlElement(name = "RemoteSign")
    protected Boolean remoteSign;
    @XmlElement(name = "RemoteSignAtt")
    protected Boolean remoteSignAtt;
    @XmlElement(name = "SaveVersionDoc")
    protected Boolean saveVersionDoc;
    @XmlElement(name = "ScanAddDoc")
    protected Boolean scanAddDoc;
    @XmlElement(name = "ScanDoc")
    protected Boolean scanDoc;
    @XmlElement(name = "SendExtendedEmail")
    protected Boolean sendExtendedEmail;
    @XmlElement(name = "SendExternalEmail")
    protected Boolean sendExternalEmail;
    @XmlElement(name = "SendInteropEmail")
    protected Boolean sendInteropEmail;
    @XmlElement(name = "SendInteropRefuseEmail")
    protected Boolean sendInteropRefuseEmail;
    @XmlElement(name = "SendInvoice")
    protected Boolean sendInvoice;
    @XmlElement(name = "SendNotificationEC")
    protected Boolean sendNotificationEC;
    @XmlElement(name = "SendPECCourtesyCopy")
    protected Boolean sendPECCourtesyCopy;
    @XmlElement(name = "SendPECPEOEmail")
    protected Boolean sendPECPEOEmail;
    @XmlElement(name = "SendPECPEOEmailForward")
    protected Boolean sendPECPEOEmailForward;
    @XmlElement(name = "SendPECPEOEmailProtocolReply")
    protected Boolean sendPECPEOEmailProtocolReply;
    @XmlElement(name = "SendPECPEOEmailReply")
    protected Boolean sendPECPEOEmailReply;
    @XmlElement(name = "Sharing")
    protected Boolean sharing;
    @XmlElement(name = "StandardCollation")
    protected Boolean standardCollation;
    @XmlElement(name = "StoreInteropEmail")
    protected Boolean storeInteropEmail;
    @XmlElement(name = "StorePECPEOEmail")
    protected Boolean storePECPEOEmail;
    @XmlElement(name = "TaskOnDemand")
    protected Boolean taskOnDemand;
    @XmlElement(name = "TimeStamp")
    protected Boolean timeStamp;
    @XmlElement(name = "TimeStampAtt")
    protected Boolean timeStampAtt;
    @XmlElement(name = "Visibility")
    protected Boolean visibility;
    @XmlElement(name = "WfAssignInChargeTo")
    protected Boolean wfAssignInChargeTo;
    @XmlElement(name = "WfForward")
    protected Boolean wfForward;
    @XmlElement(name = "WfProcessInfo")
    protected Boolean wfProcessInfo;
    @XmlElement(name = "WfProcessRestore")
    protected Boolean wfProcessRestore;
    @XmlElement(name = "WfProcessStart")
    protected Boolean wfProcessStart;
    @XmlElement(name = "WfProcessStop")
    protected Boolean wfProcessStop;
    @XmlElement(name = "WfProcessSuspend")
    protected Boolean wfProcessSuspend;
    @XmlElement(name = "WfRefuse")
    protected Boolean wfRefuse;
    @XmlElement(name = "WfRemoveInChargeFrom")
    protected Boolean wfRemoveInChargeFrom;
    @XmlElement(name = "WfTakeInCharge")
    protected Boolean wfTakeInCharge;

    /**
     * Gets the value of the additionalData property.
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public Boolean isAdditionalData() {
        return additionalData;
    }

    /**
     * Sets the value of the additionalData property.
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     */
    public void setAdditionalData(Boolean value) {
        this.additionalData = value;
    }

    /**
     * Gets the value of the analogCompliantCopyDoc property.
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public Boolean isAnalogCompliantCopyDoc() {
        return analogCompliantCopyDoc;
    }

    /**
     * Sets the value of the analogCompliantCopyDoc property.
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     */
    public void setAnalogCompliantCopyDoc(Boolean value) {
        this.analogCompliantCopyDoc = value;
    }

    /**
     * Gets the value of the annotations property.
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public Boolean isAnnotations() {
        return annotations;
    }

    /**
     * Sets the value of the annotations property.
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     */
    public void setAnnotations(Boolean value) {
        this.annotations = value;
    }

    /**
     * Gets the value of the archivalCollation property.
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public Boolean isArchivalCollation() {
        return archivalCollation;
    }

    /**
     * Sets the value of the archivalCollation property.
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     */
    public void setArchivalCollation(Boolean value) {
        this.archivalCollation = value;
    }

    /**
     * Gets the value of the autoUpdateDoc property.
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public Boolean isAutoUpdateDoc() {
        return autoUpdateDoc;
    }

    /**
     * Sets the value of the autoUpdateDoc property.
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     */
    public void setAutoUpdateDoc(Boolean value) {
        this.autoUpdateDoc = value;
    }

    /**
     * Gets the value of the cancellation property.
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public Boolean isCancellation() {
        return cancellation;
    }

    /**
     * Sets the value of the cancellation property.
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     */
    public void setCancellation(Boolean value) {
        this.cancellation = value;
    }

    /**
     * Gets the value of the checkInOutDoc property.
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public Boolean isCheckInOutDoc() {
        return checkInOutDoc;
    }

    /**
     * Sets the value of the checkInOutDoc property.
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     */
    public void setCheckInOutDoc(Boolean value) {
        this.checkInOutDoc = value;
    }

    /**
     * Gets the value of the consolidateDoc property.
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public Boolean isConsolidateDoc() {
        return consolidateDoc;
    }

    /**
     * Sets the value of the consolidateDoc property.
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     */
    public void setConsolidateDoc(Boolean value) {
        this.consolidateDoc = value;
    }

    /**
     * Gets the value of the convToPdfDoc property.
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public Boolean isConvToPdfDoc() {
        return convToPdfDoc;
    }

    /**
     * Sets the value of the convToPdfDoc property.
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     */
    public void setConvToPdfDoc(Boolean value) {
        this.convToPdfDoc = value;
    }

    /**
     * Gets the value of the createLinkArchivalCollation property.
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public Boolean isCreateLinkArchivalCollation() {
        return createLinkArchivalCollation;
    }

    /**
     * Sets the value of the createLinkArchivalCollation property.
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     */
    public void setCreateLinkArchivalCollation(Boolean value) {
        this.createLinkArchivalCollation = value;
    }

    /**
     * Gets the value of the digestAtt property.
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public Boolean isDigestAtt() {
        return digestAtt;
    }

    /**
     * Sets the value of the digestAtt property.
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     */
    public void setDigestAtt(Boolean value) {
        this.digestAtt = value;
    }

    /**
     * Gets the value of the digestDoc property.
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public Boolean isDigestDoc() {
        return digestDoc;
    }

    /**
     * Sets the value of the digestDoc property.
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     */
    public void setDigestDoc(Boolean value) {
        this.digestDoc = value;
    }

    /**
     * Gets the value of the digitalCompliantCopyDoc property.
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public Boolean isDigitalCompliantCopyDoc() {
        return digitalCompliantCopyDoc;
    }

    /**
     * Sets the value of the digitalCompliantCopyDoc property.
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     */
    public void setDigitalCompliantCopyDoc(Boolean value) {
        this.digitalCompliantCopyDoc = value;
    }

    /**
     * Gets the value of the digitalSign property.
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public Boolean isDigitalSign() {
        return digitalSign;
    }

    /**
     * Sets the value of the digitalSign property.
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     */
    public void setDigitalSign(Boolean value) {
        this.digitalSign = value;
    }

    /**
     * Gets the value of the digitalSignAtt property.
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public Boolean isDigitalSignAtt() {
        return digitalSignAtt;
    }

    /**
     * Sets the value of the digitalSignAtt property.
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     */
    public void setDigitalSignAtt(Boolean value) {
        this.digitalSignAtt = value;
    }

    /**
     * Gets the value of the duplicateCardIndexes property.
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public Boolean isDuplicateCardIndexes() {
        return duplicateCardIndexes;
    }

    /**
     * Sets the value of the duplicateCardIndexes property.
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     */
    public void setDuplicateCardIndexes(Boolean value) {
        this.duplicateCardIndexes = value;
    }

    /**
     * Gets the value of the duplicateCardIndexesAndDoc property.
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public Boolean isDuplicateCardIndexesAndDoc() {
        return duplicateCardIndexesAndDoc;
    }

    /**
     * Sets the value of the duplicateCardIndexesAndDoc property.
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     */
    public void setDuplicateCardIndexesAndDoc(Boolean value) {
        this.duplicateCardIndexesAndDoc = value;
    }

    /**
     * Gets the value of the electronicSign property.
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public Boolean isElectronicSign() {
        return electronicSign;
    }

    /**
     * Sets the value of the electronicSign property.
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     */
    public void setElectronicSign(Boolean value) {
        this.electronicSign = value;
    }

    /**
     * Gets the value of the electronicStampingSign property.
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public Boolean isElectronicStampingSign() {
        return electronicStampingSign;
    }

    /**
     * Sets the value of the electronicStampingSign property.
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     */
    public void setElectronicStampingSign(Boolean value) {
        this.electronicStampingSign = value;
    }

    /**
     * Gets the value of the glifoAtt property.
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public Boolean isGlifoAtt() {
        return glifoAtt;
    }

    /**
     * Sets the value of the glifoAtt property.
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     */
    public void setGlifoAtt(Boolean value) {
        this.glifoAtt = value;
    }

    /**
     * Gets the value of the glifoDoc property.
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public Boolean isGlifoDoc() {
        return glifoDoc;
    }

    /**
     * Sets the value of the glifoDoc property.
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     */
    public void setGlifoDoc(Boolean value) {
        this.glifoDoc = value;
    }

    /**
     * Gets the value of the graphometricSign property.
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public Boolean isGraphometricSign() {
        return graphometricSign;
    }

    /**
     * Sets the value of the graphometricSign property.
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     */
    public void setGraphometricSign(Boolean value) {
        this.graphometricSign = value;
    }

    /**
     * Gets the value of the imApprovalRefusal property.
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public Boolean isIMApprovalRefusal() {
        return imApprovalRefusal;
    }

    /**
     * Sets the value of the imApprovalRefusal property.
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     */
    public void setIMApprovalRefusal(Boolean value) {
        this.imApprovalRefusal = value;
    }

    /**
     * Gets the value of the imChangeDatePlanReSendInvoiceOnMainChannel property.
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public Boolean isIMChangeDatePlanReSendInvoiceOnMainChannel() {
        return imChangeDatePlanReSendInvoiceOnMainChannel;
    }

    /**
     * Sets the value of the imChangeDatePlanReSendInvoiceOnMainChannel property.
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     */
    public void setIMChangeDatePlanReSendInvoiceOnMainChannel(Boolean value) {
        this.imChangeDatePlanReSendInvoiceOnMainChannel = value;
    }

    /**
     * Gets the value of the imChangeDatePlanReSendInvoiceOnMainChannelPEC property.
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public Boolean isIMChangeDatePlanReSendInvoiceOnMainChannelPEC() {
        return imChangeDatePlanReSendInvoiceOnMainChannelPEC;
    }

    /**
     * Sets the value of the imChangeDatePlanReSendInvoiceOnMainChannelPEC property.
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     */
    public void setIMChangeDatePlanReSendInvoiceOnMainChannelPEC(Boolean value) {
        this.imChangeDatePlanReSendInvoiceOnMainChannelPEC = value;
    }

    /**
     * Gets the value of the imChangeDatePlanReSendInvoiceOnMainChannelPEO property.
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public Boolean isIMChangeDatePlanReSendInvoiceOnMainChannelPEO() {
        return imChangeDatePlanReSendInvoiceOnMainChannelPEO;
    }

    /**
     * Sets the value of the imChangeDatePlanReSendInvoiceOnMainChannelPEO property.
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     */
    public void setIMChangeDatePlanReSendInvoiceOnMainChannelPEO(Boolean value) {
        this.imChangeDatePlanReSendInvoiceOnMainChannelPEO = value;
    }

    /**
     * Gets the value of the imChangeDatePlanReSendInvoiceOnMainChannelSDI property.
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public Boolean isIMChangeDatePlanReSendInvoiceOnMainChannelSDI() {
        return imChangeDatePlanReSendInvoiceOnMainChannelSDI;
    }

    /**
     * Sets the value of the imChangeDatePlanReSendInvoiceOnMainChannelSDI property.
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     */
    public void setIMChangeDatePlanReSendInvoiceOnMainChannelSDI(Boolean value) {
        this.imChangeDatePlanReSendInvoiceOnMainChannelSDI = value;
    }

    /**
     * Gets the value of the imChangeDatePlanSendInvoiceOnMainChannel property.
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public Boolean isIMChangeDatePlanSendInvoiceOnMainChannel() {
        return imChangeDatePlanSendInvoiceOnMainChannel;
    }

    /**
     * Sets the value of the imChangeDatePlanSendInvoiceOnMainChannel property.
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     */
    public void setIMChangeDatePlanSendInvoiceOnMainChannel(Boolean value) {
        this.imChangeDatePlanSendInvoiceOnMainChannel = value;
    }

    /**
     * Gets the value of the imChangeDatePlanSendInvoiceOnMainChannelPEC property.
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public Boolean isIMChangeDatePlanSendInvoiceOnMainChannelPEC() {
        return imChangeDatePlanSendInvoiceOnMainChannelPEC;
    }

    /**
     * Sets the value of the imChangeDatePlanSendInvoiceOnMainChannelPEC property.
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     */
    public void setIMChangeDatePlanSendInvoiceOnMainChannelPEC(Boolean value) {
        this.imChangeDatePlanSendInvoiceOnMainChannelPEC = value;
    }

    /**
     * Gets the value of the imChangeDatePlanSendInvoiceOnMainChannelPEO property.
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public Boolean isIMChangeDatePlanSendInvoiceOnMainChannelPEO() {
        return imChangeDatePlanSendInvoiceOnMainChannelPEO;
    }

    /**
     * Sets the value of the imChangeDatePlanSendInvoiceOnMainChannelPEO property.
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     */
    public void setIMChangeDatePlanSendInvoiceOnMainChannelPEO(Boolean value) {
        this.imChangeDatePlanSendInvoiceOnMainChannelPEO = value;
    }

    /**
     * Gets the value of the imChangeDatePlanSendInvoiceOnMainChannelSDI property.
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public Boolean isIMChangeDatePlanSendInvoiceOnMainChannelSDI() {
        return imChangeDatePlanSendInvoiceOnMainChannelSDI;
    }

    /**
     * Sets the value of the imChangeDatePlanSendInvoiceOnMainChannelSDI property.
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     */
    public void setIMChangeDatePlanSendInvoiceOnMainChannelSDI(Boolean value) {
        this.imChangeDatePlanSendInvoiceOnMainChannelSDI = value;
    }

    /**
     * Gets the value of the imChannelSwitching property.
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public Boolean isIMChannelSwitching() {
        return imChannelSwitching;
    }

    /**
     * Sets the value of the imChannelSwitching property.
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     */
    public void setIMChannelSwitching(Boolean value) {
        this.imChannelSwitching = value;
    }

    /**
     * Gets the value of the imModifyInvoiceData property.
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public Boolean isIMModifyInvoiceData() {
        return imModifyInvoiceData;
    }

    /**
     * Sets the value of the imModifyInvoiceData property.
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     */
    public void setIMModifyInvoiceData(Boolean value) {
        this.imModifyInvoiceData = value;
    }

    /**
     * Gets the value of the imPlanReSendInvoiceOnMainChannel property.
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public Boolean isIMPlanReSendInvoiceOnMainChannel() {
        return imPlanReSendInvoiceOnMainChannel;
    }

    /**
     * Sets the value of the imPlanReSendInvoiceOnMainChannel property.
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     */
    public void setIMPlanReSendInvoiceOnMainChannel(Boolean value) {
        this.imPlanReSendInvoiceOnMainChannel = value;
    }

    /**
     * Gets the value of the imPlanReSendInvoiceOnMainChannelPEC property.
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public Boolean isIMPlanReSendInvoiceOnMainChannelPEC() {
        return imPlanReSendInvoiceOnMainChannelPEC;
    }

    /**
     * Sets the value of the imPlanReSendInvoiceOnMainChannelPEC property.
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     */
    public void setIMPlanReSendInvoiceOnMainChannelPEC(Boolean value) {
        this.imPlanReSendInvoiceOnMainChannelPEC = value;
    }

    /**
     * Gets the value of the imPlanReSendInvoiceOnMainChannelPEO property.
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public Boolean isIMPlanReSendInvoiceOnMainChannelPEO() {
        return imPlanReSendInvoiceOnMainChannelPEO;
    }

    /**
     * Sets the value of the imPlanReSendInvoiceOnMainChannelPEO property.
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     */
    public void setIMPlanReSendInvoiceOnMainChannelPEO(Boolean value) {
        this.imPlanReSendInvoiceOnMainChannelPEO = value;
    }

    /**
     * Gets the value of the imPlanReSendInvoiceOnMainChannelSDI property.
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public Boolean isIMPlanReSendInvoiceOnMainChannelSDI() {
        return imPlanReSendInvoiceOnMainChannelSDI;
    }

    /**
     * Sets the value of the imPlanReSendInvoiceOnMainChannelSDI property.
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     */
    public void setIMPlanReSendInvoiceOnMainChannelSDI(Boolean value) {
        this.imPlanReSendInvoiceOnMainChannelSDI = value;
    }

    /**
     * Gets the value of the imPlanSendInvoiceOnMainChannel property.
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public Boolean isIMPlanSendInvoiceOnMainChannel() {
        return imPlanSendInvoiceOnMainChannel;
    }

    /**
     * Sets the value of the imPlanSendInvoiceOnMainChannel property.
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     */
    public void setIMPlanSendInvoiceOnMainChannel(Boolean value) {
        this.imPlanSendInvoiceOnMainChannel = value;
    }

    /**
     * Gets the value of the imPlanSendInvoiceOnMainChannelPEC property.
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public Boolean isIMPlanSendInvoiceOnMainChannelPEC() {
        return imPlanSendInvoiceOnMainChannelPEC;
    }

    /**
     * Sets the value of the imPlanSendInvoiceOnMainChannelPEC property.
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     */
    public void setIMPlanSendInvoiceOnMainChannelPEC(Boolean value) {
        this.imPlanSendInvoiceOnMainChannelPEC = value;
    }

    /**
     * Gets the value of the imPlanSendInvoiceOnMainChannelPEO property.
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public Boolean isIMPlanSendInvoiceOnMainChannelPEO() {
        return imPlanSendInvoiceOnMainChannelPEO;
    }

    /**
     * Sets the value of the imPlanSendInvoiceOnMainChannelPEO property.
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     */
    public void setIMPlanSendInvoiceOnMainChannelPEO(Boolean value) {
        this.imPlanSendInvoiceOnMainChannelPEO = value;
    }

    /**
     * Gets the value of the imPlanSendInvoiceOnMainChannelSDI property.
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public Boolean isIMPlanSendInvoiceOnMainChannelSDI() {
        return imPlanSendInvoiceOnMainChannelSDI;
    }

    /**
     * Sets the value of the imPlanSendInvoiceOnMainChannelSDI property.
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     */
    public void setIMPlanSendInvoiceOnMainChannelSDI(Boolean value) {
        this.imPlanSendInvoiceOnMainChannelSDI = value;
    }

    /**
     * Gets the value of the imReSendInvoiceOnMainChannel property.
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public Boolean isIMReSendInvoiceOnMainChannel() {
        return imReSendInvoiceOnMainChannel;
    }

    /**
     * Sets the value of the imReSendInvoiceOnMainChannel property.
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     */
    public void setIMReSendInvoiceOnMainChannel(Boolean value) {
        this.imReSendInvoiceOnMainChannel = value;
    }

    /**
     * Gets the value of the imReSendInvoiceOnMainChannelADP property.
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public Boolean isIMReSendInvoiceOnMainChannelADP() {
        return imReSendInvoiceOnMainChannelADP;
    }

    /**
     * Sets the value of the imReSendInvoiceOnMainChannelADP property.
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     */
    public void setIMReSendInvoiceOnMainChannelADP(Boolean value) {
        this.imReSendInvoiceOnMainChannelADP = value;
    }

    /**
     * Gets the value of the imReSendInvoiceOnMainChannelPEC property.
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public Boolean isIMReSendInvoiceOnMainChannelPEC() {
        return imReSendInvoiceOnMainChannelPEC;
    }

    /**
     * Sets the value of the imReSendInvoiceOnMainChannelPEC property.
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     */
    public void setIMReSendInvoiceOnMainChannelPEC(Boolean value) {
        this.imReSendInvoiceOnMainChannelPEC = value;
    }

    /**
     * Gets the value of the imReSendInvoiceOnMainChannelPEO property.
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public Boolean isIMReSendInvoiceOnMainChannelPEO() {
        return imReSendInvoiceOnMainChannelPEO;
    }

    /**
     * Sets the value of the imReSendInvoiceOnMainChannelPEO property.
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     */
    public void setIMReSendInvoiceOnMainChannelPEO(Boolean value) {
        this.imReSendInvoiceOnMainChannelPEO = value;
    }

    /**
     * Gets the value of the imReSendInvoiceOnMainChannelSDI property.
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public Boolean isIMReSendInvoiceOnMainChannelSDI() {
        return imReSendInvoiceOnMainChannelSDI;
    }

    /**
     * Sets the value of the imReSendInvoiceOnMainChannelSDI property.
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     */
    public void setIMReSendInvoiceOnMainChannelSDI(Boolean value) {
        this.imReSendInvoiceOnMainChannelSDI = value;
    }

    /**
     * Gets the value of the imReSendInvoiceOnSubChannel property.
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public Boolean isIMReSendInvoiceOnSubChannel() {
        return imReSendInvoiceOnSubChannel;
    }

    /**
     * Sets the value of the imReSendInvoiceOnSubChannel property.
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     */
    public void setIMReSendInvoiceOnSubChannel(Boolean value) {
        this.imReSendInvoiceOnSubChannel = value;
    }

    /**
     * Gets the value of the imReSendInvoiceOnSubChannelADP property.
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public Boolean isIMReSendInvoiceOnSubChannelADP() {
        return imReSendInvoiceOnSubChannelADP;
    }

    /**
     * Sets the value of the imReSendInvoiceOnSubChannelADP property.
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     */
    public void setIMReSendInvoiceOnSubChannelADP(Boolean value) {
        this.imReSendInvoiceOnSubChannelADP = value;
    }

    /**
     * Gets the value of the imReSendInvoiceOnSubChannelPEC property.
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public Boolean isIMReSendInvoiceOnSubChannelPEC() {
        return imReSendInvoiceOnSubChannelPEC;
    }

    /**
     * Sets the value of the imReSendInvoiceOnSubChannelPEC property.
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     */
    public void setIMReSendInvoiceOnSubChannelPEC(Boolean value) {
        this.imReSendInvoiceOnSubChannelPEC = value;
    }

    /**
     * Gets the value of the imReSendInvoiceOnSubChannelPEO property.
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public Boolean isIMReSendInvoiceOnSubChannelPEO() {
        return imReSendInvoiceOnSubChannelPEO;
    }

    /**
     * Sets the value of the imReSendInvoiceOnSubChannelPEO property.
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     */
    public void setIMReSendInvoiceOnSubChannelPEO(Boolean value) {
        this.imReSendInvoiceOnSubChannelPEO = value;
    }

    /**
     * Gets the value of the imReSendInvoiceOnSubChannelSDI property.
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public Boolean isIMReSendInvoiceOnSubChannelSDI() {
        return imReSendInvoiceOnSubChannelSDI;
    }

    /**
     * Sets the value of the imReSendInvoiceOnSubChannelSDI property.
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     */
    public void setIMReSendInvoiceOnSubChannelSDI(Boolean value) {
        this.imReSendInvoiceOnSubChannelSDI = value;
    }

    /**
     * Gets the value of the imSendApprovalRefusalToSDI property.
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public Boolean isIMSendApprovalRefusalToSDI() {
        return imSendApprovalRefusalToSDI;
    }

    /**
     * Sets the value of the imSendApprovalRefusalToSDI property.
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     */
    public void setIMSendApprovalRefusalToSDI(Boolean value) {
        this.imSendApprovalRefusalToSDI = value;
    }

    /**
     * Gets the value of the imSendApprovalToSDI property.
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public Boolean isIMSendApprovalToSDI() {
        return imSendApprovalToSDI;
    }

    /**
     * Sets the value of the imSendApprovalToSDI property.
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     */
    public void setIMSendApprovalToSDI(Boolean value) {
        this.imSendApprovalToSDI = value;
    }

    /**
     * Gets the value of the imSendInvoiceOnMainChannel property.
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public Boolean isIMSendInvoiceOnMainChannel() {
        return imSendInvoiceOnMainChannel;
    }

    /**
     * Sets the value of the imSendInvoiceOnMainChannel property.
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     */
    public void setIMSendInvoiceOnMainChannel(Boolean value) {
        this.imSendInvoiceOnMainChannel = value;
    }

    /**
     * Gets the value of the imSendInvoiceOnMainChannelADP property.
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public Boolean isIMSendInvoiceOnMainChannelADP() {
        return imSendInvoiceOnMainChannelADP;
    }

    /**
     * Sets the value of the imSendInvoiceOnMainChannelADP property.
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     */
    public void setIMSendInvoiceOnMainChannelADP(Boolean value) {
        this.imSendInvoiceOnMainChannelADP = value;
    }

    /**
     * Gets the value of the imSendInvoiceOnMainChannelPEC property.
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public Boolean isIMSendInvoiceOnMainChannelPEC() {
        return imSendInvoiceOnMainChannelPEC;
    }

    /**
     * Sets the value of the imSendInvoiceOnMainChannelPEC property.
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     */
    public void setIMSendInvoiceOnMainChannelPEC(Boolean value) {
        this.imSendInvoiceOnMainChannelPEC = value;
    }

    /**
     * Gets the value of the imSendInvoiceOnMainChannelPEO property.
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public Boolean isIMSendInvoiceOnMainChannelPEO() {
        return imSendInvoiceOnMainChannelPEO;
    }

    /**
     * Sets the value of the imSendInvoiceOnMainChannelPEO property.
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     */
    public void setIMSendInvoiceOnMainChannelPEO(Boolean value) {
        this.imSendInvoiceOnMainChannelPEO = value;
    }

    /**
     * Gets the value of the imSendInvoiceOnMainChannelSDI property.
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public Boolean isIMSendInvoiceOnMainChannelSDI() {
        return imSendInvoiceOnMainChannelSDI;
    }

    /**
     * Sets the value of the imSendInvoiceOnMainChannelSDI property.
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     */
    public void setIMSendInvoiceOnMainChannelSDI(Boolean value) {
        this.imSendInvoiceOnMainChannelSDI = value;
    }

    /**
     * Gets the value of the imSendInvoiceOnSubChannel property.
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public Boolean isIMSendInvoiceOnSubChannel() {
        return imSendInvoiceOnSubChannel;
    }

    /**
     * Sets the value of the imSendInvoiceOnSubChannel property.
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     */
    public void setIMSendInvoiceOnSubChannel(Boolean value) {
        this.imSendInvoiceOnSubChannel = value;
    }

    /**
     * Gets the value of the imSendInvoiceOnSubChannelADP property.
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public Boolean isIMSendInvoiceOnSubChannelADP() {
        return imSendInvoiceOnSubChannelADP;
    }

    /**
     * Sets the value of the imSendInvoiceOnSubChannelADP property.
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     */
    public void setIMSendInvoiceOnSubChannelADP(Boolean value) {
        this.imSendInvoiceOnSubChannelADP = value;
    }

    /**
     * Gets the value of the imSendInvoiceOnSubChannelPEC property.
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public Boolean isIMSendInvoiceOnSubChannelPEC() {
        return imSendInvoiceOnSubChannelPEC;
    }

    /**
     * Sets the value of the imSendInvoiceOnSubChannelPEC property.
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     */
    public void setIMSendInvoiceOnSubChannelPEC(Boolean value) {
        this.imSendInvoiceOnSubChannelPEC = value;
    }

    /**
     * Gets the value of the imSendInvoiceOnSubChannelPEO property.
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public Boolean isIMSendInvoiceOnSubChannelPEO() {
        return imSendInvoiceOnSubChannelPEO;
    }

    /**
     * Sets the value of the imSendInvoiceOnSubChannelPEO property.
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     */
    public void setIMSendInvoiceOnSubChannelPEO(Boolean value) {
        this.imSendInvoiceOnSubChannelPEO = value;
    }

    /**
     * Gets the value of the imSendInvoiceOnSubChannelSDI property.
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public Boolean isIMSendInvoiceOnSubChannelSDI() {
        return imSendInvoiceOnSubChannelSDI;
    }

    /**
     * Sets the value of the imSendInvoiceOnSubChannelSDI property.
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     */
    public void setIMSendInvoiceOnSubChannelSDI(Boolean value) {
        this.imSendInvoiceOnSubChannelSDI = value;
    }

    /**
     * Gets the value of the imSendRefusalToSDI property.
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public Boolean isIMSendRefusalToSDI() {
        return imSendRefusalToSDI;
    }

    /**
     * Sets the value of the imSendRefusalToSDI property.
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     */
    public void setIMSendRefusalToSDI(Boolean value) {
        this.imSendRefusalToSDI = value;
    }

    /**
     * Gets the value of the imStopSendInvoiceOnMainChannel property.
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public Boolean isIMStopSendInvoiceOnMainChannel() {
        return imStopSendInvoiceOnMainChannel;
    }

    /**
     * Sets the value of the imStopSendInvoiceOnMainChannel property.
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     */
    public void setIMStopSendInvoiceOnMainChannel(Boolean value) {
        this.imStopSendInvoiceOnMainChannel = value;
    }

    /**
     * Gets the value of the importAddDoc property.
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public Boolean isImportAddDoc() {
        return importAddDoc;
    }

    /**
     * Sets the value of the importAddDoc property.
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     */
    public void setImportAddDoc(Boolean value) {
        this.importAddDoc = value;
    }

    /**
     * Gets the value of the importDoc property.
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public Boolean isImportDoc() {
        return importDoc;
    }

    /**
     * Sets the value of the importDoc property.
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     */
    public void setImportDoc(Boolean value) {
        this.importDoc = value;
    }

    /**
     * Gets the value of the indexes property.
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public Boolean isIndexes() {
        return indexes;
    }

    /**
     * Sets the value of the indexes property.
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     */
    public void setIndexes(Boolean value) {
        this.indexes = value;
    }

    /**
     * Gets the value of the insModAtt property.
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public Boolean isInsModAtt() {
        return insModAtt;
    }

    /**
     * Sets the value of the insModAtt property.
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     */
    public void setInsModAtt(Boolean value) {
        this.insModAtt = value;
    }

    /**
     * Gets the value of the invalidation property.
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public Boolean isInvalidation() {
        return invalidation;
    }

    /**
     * Sets the value of the invalidation property.
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     */
    public void setInvalidation(Boolean value) {
        this.invalidation = value;
    }

    /**
     * Gets the value of the isWf property.
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public Boolean isIsWf() {
        return isWf;
    }

    /**
     * Sets the value of the isWf property.
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     */
    public void setIsWf(Boolean value) {
        this.isWf = value;
    }

    /**
     * Gets the value of the lockDoc property.
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public Boolean isLockDoc() {
        return lockDoc;
    }

    /**
     * Sets the value of the lockDoc property.
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     */
    public void setLockDoc(Boolean value) {
        this.lockDoc = value;
    }

    /**
     * Gets the value of the pdfNativeSign property.
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public Boolean isPdfNativeSign() {
        return pdfNativeSign;
    }

    /**
     * Sets the value of the pdfNativeSign property.
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     */
    public void setPdfNativeSign(Boolean value) {
        this.pdfNativeSign = value;
    }

    /**
     * Gets the value of the pdfNativeSignAtt property.
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public Boolean isPdfNativeSignAtt() {
        return pdfNativeSignAtt;
    }

    /**
     * Sets the value of the pdfNativeSignAtt property.
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     */
    public void setPdfNativeSignAtt(Boolean value) {
        this.pdfNativeSignAtt = value;
    }

    /**
     * Gets the value of the permalink property.
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public Boolean isPermalink() {
        return permalink;
    }

    /**
     * Sets the value of the permalink property.
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     */
    public void setPermalink(Boolean value) {
        this.permalink = value;
    }

    /**
     * Gets the value of the posteOnLine property.
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public Boolean isPosteOnLine() {
        return posteOnLine;
    }

    /**
     * Sets the value of the posteOnLine property.
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     */
    public void setPosteOnLine(Boolean value) {
        this.posteOnLine = value;
    }

    /**
     * Gets the value of the pressMarkDoc property.
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public Boolean isPressMarkDoc() {
        return pressMarkDoc;
    }

    /**
     * Sets the value of the pressMarkDoc property.
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     */
    public void setPressMarkDoc(Boolean value) {
        this.pressMarkDoc = value;
    }

    /**
     * Gets the value of the protocolCard property.
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public Boolean isProtocolCard() {
        return protocolCard;
    }

    /**
     * Sets the value of the protocolCard property.
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     */
    public void setProtocolCard(Boolean value) {
        this.protocolCard = value;
    }

    /**
     * Gets the value of the remoteSign property.
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public Boolean isRemoteSign() {
        return remoteSign;
    }

    /**
     * Sets the value of the remoteSign property.
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     */
    public void setRemoteSign(Boolean value) {
        this.remoteSign = value;
    }

    /**
     * Gets the value of the remoteSignAtt property.
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public Boolean isRemoteSignAtt() {
        return remoteSignAtt;
    }

    /**
     * Sets the value of the remoteSignAtt property.
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     */
    public void setRemoteSignAtt(Boolean value) {
        this.remoteSignAtt = value;
    }

    /**
     * Gets the value of the saveVersionDoc property.
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public Boolean isSaveVersionDoc() {
        return saveVersionDoc;
    }

    /**
     * Sets the value of the saveVersionDoc property.
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     */
    public void setSaveVersionDoc(Boolean value) {
        this.saveVersionDoc = value;
    }

    /**
     * Gets the value of the scanAddDoc property.
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public Boolean isScanAddDoc() {
        return scanAddDoc;
    }

    /**
     * Sets the value of the scanAddDoc property.
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     */
    public void setScanAddDoc(Boolean value) {
        this.scanAddDoc = value;
    }

    /**
     * Gets the value of the scanDoc property.
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public Boolean isScanDoc() {
        return scanDoc;
    }

    /**
     * Sets the value of the scanDoc property.
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     */
    public void setScanDoc(Boolean value) {
        this.scanDoc = value;
    }

    /**
     * Gets the value of the sendExtendedEmail property.
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public Boolean isSendExtendedEmail() {
        return sendExtendedEmail;
    }

    /**
     * Sets the value of the sendExtendedEmail property.
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     */
    public void setSendExtendedEmail(Boolean value) {
        this.sendExtendedEmail = value;
    }

    /**
     * Gets the value of the sendExternalEmail property.
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public Boolean isSendExternalEmail() {
        return sendExternalEmail;
    }

    /**
     * Sets the value of the sendExternalEmail property.
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     */
    public void setSendExternalEmail(Boolean value) {
        this.sendExternalEmail = value;
    }

    /**
     * Gets the value of the sendInteropEmail property.
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public Boolean isSendInteropEmail() {
        return sendInteropEmail;
    }

    /**
     * Sets the value of the sendInteropEmail property.
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     */
    public void setSendInteropEmail(Boolean value) {
        this.sendInteropEmail = value;
    }

    /**
     * Gets the value of the sendInteropRefuseEmail property.
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public Boolean isSendInteropRefuseEmail() {
        return sendInteropRefuseEmail;
    }

    /**
     * Sets the value of the sendInteropRefuseEmail property.
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     */
    public void setSendInteropRefuseEmail(Boolean value) {
        this.sendInteropRefuseEmail = value;
    }

    /**
     * Gets the value of the sendInvoice property.
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public Boolean isSendInvoice() {
        return sendInvoice;
    }

    /**
     * Sets the value of the sendInvoice property.
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     */
    public void setSendInvoice(Boolean value) {
        this.sendInvoice = value;
    }

    /**
     * Gets the value of the sendNotificationEC property.
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public Boolean isSendNotificationEC() {
        return sendNotificationEC;
    }

    /**
     * Sets the value of the sendNotificationEC property.
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     */
    public void setSendNotificationEC(Boolean value) {
        this.sendNotificationEC = value;
    }

    /**
     * Gets the value of the sendPECCourtesyCopy property.
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public Boolean isSendPECCourtesyCopy() {
        return sendPECCourtesyCopy;
    }

    /**
     * Sets the value of the sendPECCourtesyCopy property.
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     */
    public void setSendPECCourtesyCopy(Boolean value) {
        this.sendPECCourtesyCopy = value;
    }

    /**
     * Gets the value of the sendPECPEOEmail property.
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public Boolean isSendPECPEOEmail() {
        return sendPECPEOEmail;
    }

    /**
     * Sets the value of the sendPECPEOEmail property.
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     */
    public void setSendPECPEOEmail(Boolean value) {
        this.sendPECPEOEmail = value;
    }

    /**
     * Gets the value of the sendPECPEOEmailForward property.
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public Boolean isSendPECPEOEmailForward() {
        return sendPECPEOEmailForward;
    }

    /**
     * Sets the value of the sendPECPEOEmailForward property.
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     */
    public void setSendPECPEOEmailForward(Boolean value) {
        this.sendPECPEOEmailForward = value;
    }

    /**
     * Gets the value of the sendPECPEOEmailProtocolReply property.
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public Boolean isSendPECPEOEmailProtocolReply() {
        return sendPECPEOEmailProtocolReply;
    }

    /**
     * Sets the value of the sendPECPEOEmailProtocolReply property.
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     */
    public void setSendPECPEOEmailProtocolReply(Boolean value) {
        this.sendPECPEOEmailProtocolReply = value;
    }

    /**
     * Gets the value of the sendPECPEOEmailReply property.
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public Boolean isSendPECPEOEmailReply() {
        return sendPECPEOEmailReply;
    }

    /**
     * Sets the value of the sendPECPEOEmailReply property.
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     */
    public void setSendPECPEOEmailReply(Boolean value) {
        this.sendPECPEOEmailReply = value;
    }

    /**
     * Gets the value of the sharing property.
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public Boolean isSharing() {
        return sharing;
    }

    /**
     * Sets the value of the sharing property.
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     */
    public void setSharing(Boolean value) {
        this.sharing = value;
    }

    /**
     * Gets the value of the standardCollation property.
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public Boolean isStandardCollation() {
        return standardCollation;
    }

    /**
     * Sets the value of the standardCollation property.
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     */
    public void setStandardCollation(Boolean value) {
        this.standardCollation = value;
    }

    /**
     * Gets the value of the storeInteropEmail property.
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public Boolean isStoreInteropEmail() {
        return storeInteropEmail;
    }

    /**
     * Sets the value of the storeInteropEmail property.
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     */
    public void setStoreInteropEmail(Boolean value) {
        this.storeInteropEmail = value;
    }

    /**
     * Gets the value of the storePECPEOEmail property.
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public Boolean isStorePECPEOEmail() {
        return storePECPEOEmail;
    }

    /**
     * Sets the value of the storePECPEOEmail property.
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     */
    public void setStorePECPEOEmail(Boolean value) {
        this.storePECPEOEmail = value;
    }

    /**
     * Gets the value of the taskOnDemand property.
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public Boolean isTaskOnDemand() {
        return taskOnDemand;
    }

    /**
     * Sets the value of the taskOnDemand property.
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     */
    public void setTaskOnDemand(Boolean value) {
        this.taskOnDemand = value;
    }

    /**
     * Gets the value of the timeStamp property.
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public Boolean isTimeStamp() {
        return timeStamp;
    }

    /**
     * Sets the value of the timeStamp property.
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     */
    public void setTimeStamp(Boolean value) {
        this.timeStamp = value;
    }

    /**
     * Gets the value of the timeStampAtt property.
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public Boolean isTimeStampAtt() {
        return timeStampAtt;
    }

    /**
     * Sets the value of the timeStampAtt property.
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     */
    public void setTimeStampAtt(Boolean value) {
        this.timeStampAtt = value;
    }

    /**
     * Gets the value of the visibility property.
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public Boolean isVisibility() {
        return visibility;
    }

    /**
     * Sets the value of the visibility property.
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     */
    public void setVisibility(Boolean value) {
        this.visibility = value;
    }

    /**
     * Gets the value of the wfAssignInChargeTo property.
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public Boolean isWfAssignInChargeTo() {
        return wfAssignInChargeTo;
    }

    /**
     * Sets the value of the wfAssignInChargeTo property.
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     */
    public void setWfAssignInChargeTo(Boolean value) {
        this.wfAssignInChargeTo = value;
    }

    /**
     * Gets the value of the wfForward property.
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public Boolean isWfForward() {
        return wfForward;
    }

    /**
     * Sets the value of the wfForward property.
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     */
    public void setWfForward(Boolean value) {
        this.wfForward = value;
    }

    /**
     * Gets the value of the wfProcessInfo property.
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public Boolean isWfProcessInfo() {
        return wfProcessInfo;
    }

    /**
     * Sets the value of the wfProcessInfo property.
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     */
    public void setWfProcessInfo(Boolean value) {
        this.wfProcessInfo = value;
    }

    /**
     * Gets the value of the wfProcessRestore property.
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public Boolean isWfProcessRestore() {
        return wfProcessRestore;
    }

    /**
     * Sets the value of the wfProcessRestore property.
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     */
    public void setWfProcessRestore(Boolean value) {
        this.wfProcessRestore = value;
    }

    /**
     * Gets the value of the wfProcessStart property.
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public Boolean isWfProcessStart() {
        return wfProcessStart;
    }

    /**
     * Sets the value of the wfProcessStart property.
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     */
    public void setWfProcessStart(Boolean value) {
        this.wfProcessStart = value;
    }

    /**
     * Gets the value of the wfProcessStop property.
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public Boolean isWfProcessStop() {
        return wfProcessStop;
    }

    /**
     * Sets the value of the wfProcessStop property.
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     */
    public void setWfProcessStop(Boolean value) {
        this.wfProcessStop = value;
    }

    /**
     * Gets the value of the wfProcessSuspend property.
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public Boolean isWfProcessSuspend() {
        return wfProcessSuspend;
    }

    /**
     * Sets the value of the wfProcessSuspend property.
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     */
    public void setWfProcessSuspend(Boolean value) {
        this.wfProcessSuspend = value;
    }

    /**
     * Gets the value of the wfRefuse property.
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public Boolean isWfRefuse() {
        return wfRefuse;
    }

    /**
     * Sets the value of the wfRefuse property.
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     */
    public void setWfRefuse(Boolean value) {
        this.wfRefuse = value;
    }

    /**
     * Gets the value of the wfRemoveInChargeFrom property.
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public Boolean isWfRemoveInChargeFrom() {
        return wfRemoveInChargeFrom;
    }

    /**
     * Sets the value of the wfRemoveInChargeFrom property.
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     */
    public void setWfRemoveInChargeFrom(Boolean value) {
        this.wfRemoveInChargeFrom = value;
    }

    /**
     * Gets the value of the wfTakeInCharge property.
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public Boolean isWfTakeInCharge() {
        return wfTakeInCharge;
    }

    /**
     * Sets the value of the wfTakeInCharge property.
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     */
    public void setWfTakeInCharge(Boolean value) {
        this.wfTakeInCharge = value;
    }

}
