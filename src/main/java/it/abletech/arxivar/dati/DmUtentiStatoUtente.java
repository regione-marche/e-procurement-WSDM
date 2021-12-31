
package it.abletech.arxivar.dati;

import javax.xml.bind.annotation.XmlEnum;
import javax.xml.bind.annotation.XmlEnumValue;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for Dm_Utenti_StatoUtente.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * <p>
 * <pre>
 * &lt;simpleType name="Dm_Utenti_StatoUtente">
 *   &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
 *     &lt;enumeration value="NonAttivo"/>
 *     &lt;enumeration value="Attivo"/>
 *     &lt;enumeration value="Nascosto"/>
 *   &lt;/restriction>
 * &lt;/simpleType>
 * </pre>
 * 
 */
@XmlType(name = "Dm_Utenti_StatoUtente")
@XmlEnum
public enum DmUtentiStatoUtente {

    @XmlEnumValue("NonAttivo")
    NON_ATTIVO("NonAttivo"),
    @XmlEnumValue("Attivo")
    ATTIVO("Attivo"),
    @XmlEnumValue("Nascosto")
    NASCOSTO("Nascosto");
    private final String value;

    DmUtentiStatoUtente(String v) {
        value = v;
    }

    public String value() {
        return value;
    }

    public static DmUtentiStatoUtente fromValue(String v) {
        for (DmUtentiStatoUtente c: DmUtentiStatoUtente.values()) {
            if (c.value.equals(v)) {
                return c;
            }
        }
        throw new IllegalArgumentException(v);
    }

}
