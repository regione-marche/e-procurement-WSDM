
package it.abletech.arxivar.dati;

import javax.xml.bind.annotation.XmlEnum;
import javax.xml.bind.annotation.XmlEnumValue;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for Dm_Permessi_Rubrica_Accesso.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * <p>
 * <pre>
 * &lt;simpleType name="Dm_Permessi_Rubrica_Accesso">
 *   &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
 *     &lt;enumeration value="Nessuno"/>
 *     &lt;enumeration value="Lettura"/>
 *     &lt;enumeration value="LetturaScrittura"/>
 *     &lt;enumeration value="LetturaScritturaCancellazione"/>
 *   &lt;/restriction>
 * &lt;/simpleType>
 * </pre>
 * 
 */
@XmlType(name = "Dm_Permessi_Rubrica_Accesso")
@XmlEnum
public enum DmPermessiRubricaAccesso {

    @XmlEnumValue("Nessuno")
    NESSUNO("Nessuno"),
    @XmlEnumValue("Lettura")
    LETTURA("Lettura"),
    @XmlEnumValue("LetturaScrittura")
    LETTURA_SCRITTURA("LetturaScrittura"),
    @XmlEnumValue("LetturaScritturaCancellazione")
    LETTURA_SCRITTURA_CANCELLAZIONE("LetturaScritturaCancellazione");
    private final String value;

    DmPermessiRubricaAccesso(String v) {
        value = v;
    }

    public String value() {
        return value;
    }

    public static DmPermessiRubricaAccesso fromValue(String v) {
        for (DmPermessiRubricaAccesso c: DmPermessiRubricaAccesso.values()) {
            if (c.value.equals(v)) {
                return c;
            }
        }
        throw new IllegalArgumentException(v);
    }

}
