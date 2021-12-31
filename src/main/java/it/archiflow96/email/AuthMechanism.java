
package it.archiflow96.email;

import javax.xml.bind.annotation.XmlEnum;
import javax.xml.bind.annotation.XmlEnumValue;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for AuthMechanism.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * <p>
 * <pre>
 * &lt;simpleType name="AuthMechanism">
 *   &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
 *     &lt;enumeration value="UserPassword"/>
 *     &lt;enumeration value="CramMD5"/>
 *     &lt;enumeration value="Ntlm"/>
 *   &lt;/restriction>
 * &lt;/simpleType>
 * </pre>
 * 
 */
@XmlType(name = "AuthMechanism", namespace = "http://schemas.datacontract.org/2004/07/SIAV.Archiflow.Entities.Types")
@XmlEnum
public enum AuthMechanism {

    @XmlEnumValue("UserPassword")
    USER_PASSWORD("UserPassword"),
    @XmlEnumValue("CramMD5")
    CRAM_MD_5("CramMD5"),
    @XmlEnumValue("Ntlm")
    NTLM("Ntlm");
    private final String value;

    AuthMechanism(String v) {
        value = v;
    }

    public String value() {
        return value;
    }

    public static AuthMechanism fromValue(String v) {
        for (AuthMechanism c: AuthMechanism.values()) {
            if (c.value.equals(v)) {
                return c;
            }
        }
        throw new IllegalArgumentException(v);
    }

}
