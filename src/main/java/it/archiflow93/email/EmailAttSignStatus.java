
package it.archiflow93.email;

import javax.xml.bind.annotation.XmlEnum;
import javax.xml.bind.annotation.XmlEnumValue;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for EmailAttSignStatus.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * <p>
 * <pre>
 * &lt;simpleType name="EmailAttSignStatus">
 *   &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
 *     &lt;enumeration value="EmailAttSignNotDef"/>
 *     &lt;enumeration value="EmailAttNotSigned"/>
 *     &lt;enumeration value="EmailAttSignedKO"/>
 *     &lt;enumeration value="EmailAttSignedOK"/>
 *   &lt;/restriction>
 * &lt;/simpleType>
 * </pre>
 * 
 */
@XmlType(name = "EmailAttSignStatus", namespace = "http://schemas.datacontract.org/2004/07/SIAV.Archiflow.Entities.Types")
@XmlEnum
public enum EmailAttSignStatus {

    @XmlEnumValue("EmailAttSignNotDef")
    EMAIL_ATT_SIGN_NOT_DEF("EmailAttSignNotDef"),
    @XmlEnumValue("EmailAttNotSigned")
    EMAIL_ATT_NOT_SIGNED("EmailAttNotSigned"),
    @XmlEnumValue("EmailAttSignedKO")
    EMAIL_ATT_SIGNED_KO("EmailAttSignedKO"),
    @XmlEnumValue("EmailAttSignedOK")
    EMAIL_ATT_SIGNED_OK("EmailAttSignedOK");
    private final String value;

    EmailAttSignStatus(String v) {
        value = v;
    }

    public String value() {
        return value;
    }

    public static EmailAttSignStatus fromValue(String v) {
        for (EmailAttSignStatus c: EmailAttSignStatus.values()) {
            if (c.value.equals(v)) {
                return c;
            }
        }
        throw new IllegalArgumentException(v);
    }

}
