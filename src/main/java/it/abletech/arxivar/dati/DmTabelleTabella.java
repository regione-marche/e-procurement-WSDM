
package it.abletech.arxivar.dati;

import javax.xml.bind.annotation.XmlEnum;
import javax.xml.bind.annotation.XmlEnumValue;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for Dm_Tabelle_Tabella.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * <p>
 * <pre>
 * &lt;simpleType name="Dm_Tabelle_Tabella">
 *   &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
 *     &lt;enumeration value="Niente"/>
 *     &lt;enumeration value="Stato"/>
 *     &lt;enumeration value="CatRubrica"/>
 *     &lt;enumeration value="Risposte"/>
 *     &lt;enumeration value="Spedizioni"/>
 *   &lt;/restriction>
 * &lt;/simpleType>
 * </pre>
 * 
 */
@XmlType(name = "Dm_Tabelle_Tabella")
@XmlEnum
public enum DmTabelleTabella {

    @XmlEnumValue("Niente")
    NIENTE("Niente"),
    @XmlEnumValue("Stato")
    STATO("Stato"),
    @XmlEnumValue("CatRubrica")
    CAT_RUBRICA("CatRubrica"),
    @XmlEnumValue("Risposte")
    RISPOSTE("Risposte"),
    @XmlEnumValue("Spedizioni")
    SPEDIZIONI("Spedizioni");
    private final String value;

    DmTabelleTabella(String v) {
        value = v;
    }

    public String value() {
        return value;
    }

    public static DmTabelleTabella fromValue(String v) {
        for (DmTabelleTabella c: DmTabelleTabella.values()) {
            if (c.value.equals(v)) {
                return c;
            }
        }
        throw new IllegalArgumentException(v);
    }

}
