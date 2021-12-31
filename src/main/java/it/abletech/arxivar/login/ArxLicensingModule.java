
package it.abletech.arxivar.login;

import javax.xml.bind.annotation.XmlEnum;
import javax.xml.bind.annotation.XmlEnumValue;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for ArxLicensingModule.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * <p>
 * <pre>
 * &lt;simpleType name="ArxLicensingModule">
 *   &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
 *     &lt;enumeration value="BASE"/>
 *     &lt;enumeration value="PORTAL"/>
 *     &lt;enumeration value="LITE"/>
 *     &lt;enumeration value="FLOW"/>
 *     &lt;enumeration value="OUTLOOK"/>
 *     &lt;enumeration value="PROT"/>
 *     &lt;enumeration value="SIGN"/>
 *     &lt;enumeration value="OCR"/>
 *     &lt;enumeration value="BARCODE"/>
 *     &lt;enumeration value="FORMREC"/>
 *     &lt;enumeration value="SDK"/>
 *     &lt;enumeration value="OPTICALSTORE"/>
 *     &lt;enumeration value="SPOOLREC"/>
 *     &lt;enumeration value="SPOOLPDF"/>
 *     &lt;enumeration value="OUTSOURCING"/>
 *     &lt;enumeration value="CDREADER"/>
 *     &lt;enumeration value="FAX"/>
 *     &lt;enumeration value="WEB"/>
 *     &lt;enumeration value="REPORT"/>
 *     &lt;enumeration value="SAPR3"/>
 *     &lt;enumeration value="SHAREDOCUMENT"/>
 *     &lt;enumeration value="DOWNLOADER_DOCUMENT"/>
 *     &lt;enumeration value="CREDEMTEL"/>
 *     &lt;enumeration value="MOBILE"/>
 *     &lt;enumeration value="SIGNBIOMETRIC"/>
 *     &lt;enumeration value="IMAP"/>
 *     &lt;enumeration value="MPX"/>
 *     &lt;enumeration value="FLOW_APPROVE"/>
 *     &lt;enumeration value="LANG_AR"/>
 *     &lt;enumeration value="LANG_BG"/>
 *     &lt;enumeration value="LANG_DE"/>
 *     &lt;enumeration value="LANG_FR"/>
 *     &lt;enumeration value="LANG_GR"/>
 *     &lt;enumeration value="LANG_PL"/>
 *     &lt;enumeration value="LANG_RO"/>
 *     &lt;enumeration value="LANG_SA"/>
 *     &lt;enumeration value="LANG_ESP"/>
 *     &lt;enumeration value="LANG_CN"/>
 *     &lt;enumeration value="IX"/>
 *     &lt;enumeration value="IXCE"/>
 *     &lt;enumeration value="MOBILEOFFICESIGN_NOMINALI"/>
 *     &lt;enumeration value="BASE_NOMINALI"/>
 *     &lt;enumeration value="LITE_NOMINALI"/>
 *     &lt;enumeration value="FLOW_NOMINALI"/>
 *   &lt;/restriction>
 * &lt;/simpleType>
 * </pre>
 * 
 */
@XmlType(name = "ArxLicensingModule")
@XmlEnum
public enum ArxLicensingModule {

    BASE("BASE"),
    PORTAL("PORTAL"),
    LITE("LITE"),
    FLOW("FLOW"),
    OUTLOOK("OUTLOOK"),
    PROT("PROT"),
    SIGN("SIGN"),
    OCR("OCR"),
    BARCODE("BARCODE"),
    FORMREC("FORMREC"),
    SDK("SDK"),
    OPTICALSTORE("OPTICALSTORE"),
    SPOOLREC("SPOOLREC"),
    SPOOLPDF("SPOOLPDF"),
    OUTSOURCING("OUTSOURCING"),
    CDREADER("CDREADER"),
    FAX("FAX"),
    WEB("WEB"),
    REPORT("REPORT"),
    @XmlEnumValue("SAPR3")
    SAPR_3("SAPR3"),
    SHAREDOCUMENT("SHAREDOCUMENT"),
    DOWNLOADER_DOCUMENT("DOWNLOADER_DOCUMENT"),
    CREDEMTEL("CREDEMTEL"),
    MOBILE("MOBILE"),
    SIGNBIOMETRIC("SIGNBIOMETRIC"),
    IMAP("IMAP"),
    MPX("MPX"),
    FLOW_APPROVE("FLOW_APPROVE"),
    LANG_AR("LANG_AR"),
    LANG_BG("LANG_BG"),
    LANG_DE("LANG_DE"),
    LANG_FR("LANG_FR"),
    LANG_GR("LANG_GR"),
    LANG_PL("LANG_PL"),
    LANG_RO("LANG_RO"),
    LANG_SA("LANG_SA"),
    LANG_ESP("LANG_ESP"),
    LANG_CN("LANG_CN"),
    IX("IX"),
    IXCE("IXCE"),
    MOBILEOFFICESIGN_NOMINALI("MOBILEOFFICESIGN_NOMINALI"),
    BASE_NOMINALI("BASE_NOMINALI"),
    LITE_NOMINALI("LITE_NOMINALI"),
    FLOW_NOMINALI("FLOW_NOMINALI");
    private final String value;

    ArxLicensingModule(String v) {
        value = v;
    }

    public String value() {
        return value;
    }

    public static ArxLicensingModule fromValue(String v) {
        for (ArxLicensingModule c: ArxLicensingModule.values()) {
            if (c.value.equals(v)) {
                return c;
            }
        }
        throw new IllegalArgumentException(v);
    }

}
