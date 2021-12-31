
package it.abletech.arxivar.dati;

import javax.xml.bind.annotation.XmlEnum;
import javax.xml.bind.annotation.XmlEnumValue;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for Dm_Rubrica_Tipo.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * <p>
 * <pre>
 * &lt;simpleType name="Dm_Rubrica_Tipo">
 *   &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
 *     &lt;enumeration value="Utente"/>
 *     &lt;enumeration value="Gruppo"/>
 *     &lt;enumeration value="Ditta"/>
 *   &lt;/restriction>
 * &lt;/simpleType>
 * </pre>
 * 
 */
@XmlType(name = "Dm_Rubrica_Tipo")
@XmlEnum
public enum DmRubricaTipo {

    @XmlEnumValue("Utente")
    UTENTE("Utente"),
    @XmlEnumValue("Gruppo")
    GRUPPO("Gruppo"),
    @XmlEnumValue("Ditta")
    DITTA("Ditta");
    private final String value;

    DmRubricaTipo(String v) {
        value = v;
    }

    public String value() {
        return value;
    }

    public static DmRubricaTipo fromValue(String v) {
        for (DmRubricaTipo c: DmRubricaTipo.values()) {
            if (c.value.equals(v)) {
                return c;
            }
        }
        throw new IllegalArgumentException(v);
    }

}
