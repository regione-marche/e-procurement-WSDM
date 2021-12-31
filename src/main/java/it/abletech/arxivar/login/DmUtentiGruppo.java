
package it.abletech.arxivar.login;

import javax.xml.bind.annotation.XmlEnum;
import javax.xml.bind.annotation.XmlEnumValue;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for Dm_Utenti_Gruppo.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * <p>
 * <pre>
 * &lt;simpleType name="Dm_Utenti_Gruppo">
 *   &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
 *     &lt;enumeration value="Non_Impostato"/>
 *     &lt;enumeration value="Admin"/>
 *     &lt;enumeration value="User"/>
 *     &lt;enumeration value="Profiler"/>
 *   &lt;/restriction>
 * &lt;/simpleType>
 * </pre>
 * 
 */
@XmlType(name = "Dm_Utenti_Gruppo")
@XmlEnum
public enum DmUtentiGruppo {

    @XmlEnumValue("Non_Impostato")
    NON_IMPOSTATO("Non_Impostato"),
    @XmlEnumValue("Admin")
    ADMIN("Admin"),
    @XmlEnumValue("User")
    USER("User"),
    @XmlEnumValue("Profiler")
    PROFILER("Profiler");
    private final String value;

    DmUtentiGruppo(String v) {
        value = v;
    }

    public String value() {
        return value;
    }

    public static DmUtentiGruppo fromValue(String v) {
        for (DmUtentiGruppo c: DmUtentiGruppo.values()) {
            if (c.value.equals(v)) {
                return c;
            }
        }
        throw new IllegalArgumentException(v);
    }

}
