
package it.archiflow93.email;

import javax.xml.bind.annotation.XmlEnum;
import javax.xml.bind.annotation.XmlEnumValue;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for EMailType.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * <p>
 * <pre>
 * &lt;simpleType name="EMailType">
 *   &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
 *     &lt;enumeration value="EMTPEO"/>
 *     &lt;enumeration value="EMTPEC"/>
 *     &lt;enumeration value="EMTInteropPEC"/>
 *   &lt;/restriction>
 * &lt;/simpleType>
 * </pre>
 * 
 */
@XmlType(name = "EMailType", namespace = "http://schemas.datacontract.org/2004/07/SIAV.Archiflow.Entities.Types")
@XmlEnum
public enum EMailType {

    EMTPEO("EMTPEO"),
    EMTPEC("EMTPEC"),
    @XmlEnumValue("EMTInteropPEC")
    EMT_INTEROP_PEC("EMTInteropPEC");
    private final String value;

    EMailType(String v) {
        value = v;
    }

    public String value() {
        return value;
    }

    public static EMailType fromValue(String v) {
        for (EMailType c: EMailType.values()) {
            if (c.value.equals(v)) {
                return c;
            }
        }
        throw new IllegalArgumentException(v);
    }

}
