
package it.archiflow96;

import javax.xml.bind.annotation.XmlEnum;
import javax.xml.bind.annotation.XmlEnumValue;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for EMailSendRet.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * <p>
 * <pre>
 * &lt;simpleType name="EMailSendRet">
 *   &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
 *     &lt;enumeration value="EMSRUndefErr"/>
 *     &lt;enumeration value="EMSRNoError"/>
 *     &lt;enumeration value="EMSRNoMailBoxCfg"/>
 *     &lt;enumeration value="EMSRChannelFound"/>
 *     &lt;enumeration value="EMSRNoMailBoxFound"/>
 *     &lt;enumeration value="EMSRNoServiceFound"/>
 *     &lt;enumeration value="EMSRNoFields"/>
 *     &lt;enumeration value="EMSRNoSplit"/>
 *   &lt;/restriction>
 * &lt;/simpleType>
 * </pre>
 * 
 */
@XmlType(name = "EMailSendRet", namespace = "http://schemas.datacontract.org/2004/07/SIAV.Archiflow.Entities.Types")
@XmlEnum
public enum EMailSendRet {

    @XmlEnumValue("EMSRUndefErr")
    EMSR_UNDEF_ERR("EMSRUndefErr"),
    @XmlEnumValue("EMSRNoError")
    EMSR_NO_ERROR("EMSRNoError"),
    @XmlEnumValue("EMSRNoMailBoxCfg")
    EMSR_NO_MAIL_BOX_CFG("EMSRNoMailBoxCfg"),
    @XmlEnumValue("EMSRChannelFound")
    EMSR_CHANNEL_FOUND("EMSRChannelFound"),
    @XmlEnumValue("EMSRNoMailBoxFound")
    EMSR_NO_MAIL_BOX_FOUND("EMSRNoMailBoxFound"),
    @XmlEnumValue("EMSRNoServiceFound")
    EMSR_NO_SERVICE_FOUND("EMSRNoServiceFound"),
    @XmlEnumValue("EMSRNoFields")
    EMSR_NO_FIELDS("EMSRNoFields"),
    @XmlEnumValue("EMSRNoSplit")
    EMSR_NO_SPLIT("EMSRNoSplit");
    private final String value;

    EMailSendRet(String v) {
        value = v;
    }

    public String value() {
        return value;
    }

    public static EMailSendRet fromValue(String v) {
        for (EMailSendRet c: EMailSendRet.values()) {
            if (c.value.equals(v)) {
                return c;
            }
        }
        throw new IllegalArgumentException(v);
    }

}
