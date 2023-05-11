
package it.abletech.arxivar.dati;

import javax.xml.bind.annotation.XmlEnum;
import javax.xml.bind.annotation.XmlEnumValue;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for Dm_Utenti_MustChangePassword.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * <p>
 * <pre>
 * &lt;simpleType name="Dm_Utenti_MustChangePassword">
 *   &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
 *     &lt;enumeration value="No"/>
 *     &lt;enumeration value="Yes"/>
 *     &lt;enumeration value="YesForChangePasswordNew"/>
 *   &lt;/restriction>
 * &lt;/simpleType>
 * </pre>
 * 
 */
@XmlType(name = "Dm_Utenti_MustChangePassword")
@XmlEnum
public enum DmUtentiMustChangePassword {

    @XmlEnumValue("No")
    NO("No"),
    @XmlEnumValue("Yes")
    YES("Yes"),
    @XmlEnumValue("YesForChangePasswordNew")
    YES_FOR_CHANGE_PASSWORD_NEW("YesForChangePasswordNew");
    private final String value;

    DmUtentiMustChangePassword(String v) {
        value = v;
    }

    public String value() {
        return value;
    }

    public static DmUtentiMustChangePassword fromValue(String v) {
        for (DmUtentiMustChangePassword c: DmUtentiMustChangePassword.values()) {
            if (c.value.equals(v)) {
                return c;
            }
        }
        throw new IllegalArgumentException(v);
    }

}
