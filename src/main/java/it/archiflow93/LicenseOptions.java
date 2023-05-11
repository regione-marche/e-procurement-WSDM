
package it.archiflow93;

import javax.xml.bind.annotation.XmlEnum;
import javax.xml.bind.annotation.XmlEnumValue;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for LicenseOptions.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * <p>
 * <pre>
 * &lt;simpleType name="LicenseOptions">
 *   &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
 *     &lt;enumeration value="LoWorkFlow"/>
 *     &lt;enumeration value="LoMultiLanguage"/>
 *     &lt;enumeration value="LoDigitalSign"/>
 *     &lt;enumeration value="LoElectronicSign"/>
 *     &lt;enumeration value="LoExternalMail"/>
 *     &lt;enumeration value="LoExtendedMail"/>
 *     &lt;enumeration value="LoWebLink"/>
 *     &lt;enumeration value="LoCustomerName"/>
 *     &lt;enumeration value="LoFullText"/>
 *     &lt;enumeration value="LoFullTextOCR"/>
 *     &lt;enumeration value="LoAipa"/>
 *     &lt;enumeration value="LoSignPdf"/>
 *     &lt;enumeration value="LoPosteOnLine"/>
 *     &lt;enumeration value="LoPECManagerSE"/>
 *     &lt;enumeration value="LoSvAOLSDK"/>
 *     &lt;enumeration value="LoWfWorkProcessing"/>
 *     &lt;enumeration value="LoWFWorkflowPortal"/>
 *     &lt;enumeration value="LoADPWebPortal"/>
 *     &lt;enumeration value="LoLegalSafe"/>
 *     &lt;enumeration value="LoTitolarioFascArc"/>
 *     &lt;enumeration value="LoIFlow"/>
 *     &lt;enumeration value="LoContentDiscovery"/>
 *     &lt;enumeration value="svLoSDKWebServices"/>
 *     &lt;enumeration value="svLoPECManagerEE"/>
 *     &lt;enumeration value="svLoGraphometricSign"/>
 *     &lt;enumeration value="LoExpirationDate"/>
 *     &lt;enumeration value="LoElectronicInvoice"/>
 *     &lt;enumeration value="LoBlueDriveIntegration"/>
 *     &lt;enumeration value="LoSNA"/>
 *     &lt;enumeration value="LoTaskOnDemand"/>
 *     &lt;enumeration value="LoAddIn"/>
 *     &lt;enumeration value="LoElectronicMark"/>
 *     &lt;enumeration value="LoElectronicStamping"/>
 *     &lt;enumeration value="LoAutoEmailClass"/>
 *     &lt;enumeration value="LoInteracDashboard"/>
 *     &lt;enumeration value="LoSap"/>
 *     &lt;enumeration value="LoMassivePECManager"/>
 *     &lt;enumeration value="LoElectronicInvoiceXML"/>
 *     &lt;enumeration value="LoInvoiceManagerIn"/>
 *     &lt;enumeration value="LoInvoiceManagerOut"/>
 *     &lt;enumeration value="LoInvoiceManagerSDIcoop"/>
 *     &lt;enumeration value="LoInvoiceManagerPecPeo"/>
 *     &lt;enumeration value="LoInvoiceManagerDataTransm"/>
 *     &lt;enumeration value="LoInvoiceManagerADP"/>
 *     &lt;enumeration value="LoGdpr"/>
 *     &lt;enumeration value="LoInteractivePortal"/>
 *   &lt;/restriction>
 * &lt;/simpleType>
 * </pre>
 * 
 */
@XmlType(name = "LicenseOptions", namespace = "http://schemas.datacontract.org/2004/07/SIAV.Archiflow.Entities.Types")
@XmlEnum
public enum LicenseOptions {

    @XmlEnumValue("LoWorkFlow")
    LO_WORK_FLOW("LoWorkFlow"),
    @XmlEnumValue("LoMultiLanguage")
    LO_MULTI_LANGUAGE("LoMultiLanguage"),
    @XmlEnumValue("LoDigitalSign")
    LO_DIGITAL_SIGN("LoDigitalSign"),
    @XmlEnumValue("LoElectronicSign")
    LO_ELECTRONIC_SIGN("LoElectronicSign"),
    @XmlEnumValue("LoExternalMail")
    LO_EXTERNAL_MAIL("LoExternalMail"),
    @XmlEnumValue("LoExtendedMail")
    LO_EXTENDED_MAIL("LoExtendedMail"),
    @XmlEnumValue("LoWebLink")
    LO_WEB_LINK("LoWebLink"),
    @XmlEnumValue("LoCustomerName")
    LO_CUSTOMER_NAME("LoCustomerName"),
    @XmlEnumValue("LoFullText")
    LO_FULL_TEXT("LoFullText"),
    @XmlEnumValue("LoFullTextOCR")
    LO_FULL_TEXT_OCR("LoFullTextOCR"),
    @XmlEnumValue("LoAipa")
    LO_AIPA("LoAipa"),
    @XmlEnumValue("LoSignPdf")
    LO_SIGN_PDF("LoSignPdf"),
    @XmlEnumValue("LoPosteOnLine")
    LO_POSTE_ON_LINE("LoPosteOnLine"),
    @XmlEnumValue("LoPECManagerSE")
    LO_PEC_MANAGER_SE("LoPECManagerSE"),
    @XmlEnumValue("LoSvAOLSDK")
    LO_SV_AOLSDK("LoSvAOLSDK"),
    @XmlEnumValue("LoWfWorkProcessing")
    LO_WF_WORK_PROCESSING("LoWfWorkProcessing"),
    @XmlEnumValue("LoWFWorkflowPortal")
    LO_WF_WORKFLOW_PORTAL("LoWFWorkflowPortal"),
    @XmlEnumValue("LoADPWebPortal")
    LO_ADP_WEB_PORTAL("LoADPWebPortal"),
    @XmlEnumValue("LoLegalSafe")
    LO_LEGAL_SAFE("LoLegalSafe"),
    @XmlEnumValue("LoTitolarioFascArc")
    LO_TITOLARIO_FASC_ARC("LoTitolarioFascArc"),
    @XmlEnumValue("LoIFlow")
    LO_I_FLOW("LoIFlow"),
    @XmlEnumValue("LoContentDiscovery")
    LO_CONTENT_DISCOVERY("LoContentDiscovery"),
    @XmlEnumValue("svLoSDKWebServices")
    SV_LO_SDK_WEB_SERVICES("svLoSDKWebServices"),
    @XmlEnumValue("svLoPECManagerEE")
    SV_LO_PEC_MANAGER_EE("svLoPECManagerEE"),
    @XmlEnumValue("svLoGraphometricSign")
    SV_LO_GRAPHOMETRIC_SIGN("svLoGraphometricSign"),
    @XmlEnumValue("LoExpirationDate")
    LO_EXPIRATION_DATE("LoExpirationDate"),
    @XmlEnumValue("LoElectronicInvoice")
    LO_ELECTRONIC_INVOICE("LoElectronicInvoice"),
    @XmlEnumValue("LoBlueDriveIntegration")
    LO_BLUE_DRIVE_INTEGRATION("LoBlueDriveIntegration"),
    @XmlEnumValue("LoSNA")
    LO_SNA("LoSNA"),
    @XmlEnumValue("LoTaskOnDemand")
    LO_TASK_ON_DEMAND("LoTaskOnDemand"),
    @XmlEnumValue("LoAddIn")
    LO_ADD_IN("LoAddIn"),
    @XmlEnumValue("LoElectronicMark")
    LO_ELECTRONIC_MARK("LoElectronicMark"),
    @XmlEnumValue("LoElectronicStamping")
    LO_ELECTRONIC_STAMPING("LoElectronicStamping"),
    @XmlEnumValue("LoAutoEmailClass")
    LO_AUTO_EMAIL_CLASS("LoAutoEmailClass"),
    @XmlEnumValue("LoInteracDashboard")
    LO_INTERAC_DASHBOARD("LoInteracDashboard"),
    @XmlEnumValue("LoSap")
    LO_SAP("LoSap"),
    @XmlEnumValue("LoMassivePECManager")
    LO_MASSIVE_PEC_MANAGER("LoMassivePECManager"),
    @XmlEnumValue("LoElectronicInvoiceXML")
    LO_ELECTRONIC_INVOICE_XML("LoElectronicInvoiceXML"),
    @XmlEnumValue("LoInvoiceManagerIn")
    LO_INVOICE_MANAGER_IN("LoInvoiceManagerIn"),
    @XmlEnumValue("LoInvoiceManagerOut")
    LO_INVOICE_MANAGER_OUT("LoInvoiceManagerOut"),
    @XmlEnumValue("LoInvoiceManagerSDIcoop")
    LO_INVOICE_MANAGER_SD_ICOOP("LoInvoiceManagerSDIcoop"),
    @XmlEnumValue("LoInvoiceManagerPecPeo")
    LO_INVOICE_MANAGER_PEC_PEO("LoInvoiceManagerPecPeo"),
    @XmlEnumValue("LoInvoiceManagerDataTransm")
    LO_INVOICE_MANAGER_DATA_TRANSM("LoInvoiceManagerDataTransm"),
    @XmlEnumValue("LoInvoiceManagerADP")
    LO_INVOICE_MANAGER_ADP("LoInvoiceManagerADP"),
    @XmlEnumValue("LoGdpr")
    LO_GDPR("LoGdpr"),
    @XmlEnumValue("LoInteractivePortal")
    LO_INTERACTIVE_PORTAL("LoInteractivePortal");
    private final String value;

    LicenseOptions(String v) {
        value = v;
    }

    public String value() {
        return value;
    }

    public static LicenseOptions fromValue(String v) {
        for (LicenseOptions c: LicenseOptions.values()) {
            if (c.value.equals(v)) {
                return c;
            }
        }
        throw new IllegalArgumentException(v);
    }

}
