
package it.abletech.arxivar.dati;

import javax.xml.bind.annotation.XmlEnum;
import javax.xml.bind.annotation.XmlEnumValue;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for Dm_Rubrica_Stato.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * <p>
 * <pre>
 * &lt;simpleType name="Dm_Rubrica_Stato">
 *   &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
 *     &lt;enumeration value="Active"/>
 *     &lt;enumeration value="NotActive"/>
 *   &lt;/restriction>
 * &lt;/simpleType>
 * </pre>
 * 
 */
@XmlType(name = "Dm_Rubrica_Stato")
@XmlEnum
public enum DmRubricaStato {

    @XmlEnumValue("Active")
    ACTIVE("Active"),
    @XmlEnumValue("NotActive")
    NOT_ACTIVE("NotActive");
    private final String value;

    DmRubricaStato(String v) {
        value = v;
    }

    public String value() {
        return value;
    }

    public static DmRubricaStato fromValue(String v) {
        for (DmRubricaStato c: DmRubricaStato.values()) {
            if (c.value.equals(v)) {
                return c;
            }
        }
        throw new IllegalArgumentException(v);
    }

}
