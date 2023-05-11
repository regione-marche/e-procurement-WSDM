
package it.abletech.arxivar.dati;

import javax.xml.bind.annotation.XmlEnum;
import javax.xml.bind.annotation.XmlEnumValue;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for Dm_Combo_Gruppi_Tabella.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * <p>
 * <pre>
 * &lt;simpleType name="Dm_Combo_Gruppi_Tabella">
 *   &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
 *     &lt;enumeration value="Elenco_Fisso"/>
 *     &lt;enumeration value="Fonte_Dati_Esterna"/>
 *   &lt;/restriction>
 * &lt;/simpleType>
 * </pre>
 * 
 */
@XmlType(name = "Dm_Combo_Gruppi_Tabella")
@XmlEnum
public enum DmComboGruppiTabella {

    @XmlEnumValue("Elenco_Fisso")
    ELENCO_FISSO("Elenco_Fisso"),
    @XmlEnumValue("Fonte_Dati_Esterna")
    FONTE_DATI_ESTERNA("Fonte_Dati_Esterna");
    private final String value;

    DmComboGruppiTabella(String v) {
        value = v;
    }

    public String value() {
        return value;
    }

    public static DmComboGruppiTabella fromValue(String v) {
        for (DmComboGruppiTabella c: DmComboGruppiTabella.values()) {
            if (c.value.equals(v)) {
                return c;
            }
        }
        throw new IllegalArgumentException(v);
    }

}
