
package it.abletech.arxivar.dati;

import javax.xml.bind.annotation.XmlEnum;
import javax.xml.bind.annotation.XmlEnumValue;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for Dm_CampiSpecifici_Stato.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * <p>
 * <pre>
 * &lt;simpleType name="Dm_CampiSpecifici_Stato">
 *   &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
 *     &lt;enumeration value="Non_Attivo"/>
 *     &lt;enumeration value="Attivo"/>
 *   &lt;/restriction>
 * &lt;/simpleType>
 * </pre>
 * 
 */
@XmlType(name = "Dm_CampiSpecifici_Stato")
@XmlEnum
public enum DmCampiSpecificiStato {

    @XmlEnumValue("Non_Attivo")
    NON_ATTIVO("Non_Attivo"),
    @XmlEnumValue("Attivo")
    ATTIVO("Attivo");
    private final String value;

    DmCampiSpecificiStato(String v) {
        value = v;
    }

    public String value() {
        return value;
    }

    public static DmCampiSpecificiStato fromValue(String v) {
        for (DmCampiSpecificiStato c: DmCampiSpecificiStato.values()) {
            if (c.value.equals(v)) {
                return c;
            }
        }
        throw new IllegalArgumentException(v);
    }

}
