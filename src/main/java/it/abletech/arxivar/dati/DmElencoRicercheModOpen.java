
package it.abletech.arxivar.dati;

import javax.xml.bind.annotation.XmlEnum;
import javax.xml.bind.annotation.XmlEnumValue;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for Dm_Elenco_Ricerche_ModOpen.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * <p>
 * <pre>
 * &lt;simpleType name="Dm_Elenco_Ricerche_ModOpen">
 *   &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
 *     &lt;enumeration value="MostrareLaFinestra"/>
 *     &lt;enumeration value="NonMostrareLaFinestra"/>
 *   &lt;/restriction>
 * &lt;/simpleType>
 * </pre>
 * 
 */
@XmlType(name = "Dm_Elenco_Ricerche_ModOpen")
@XmlEnum
public enum DmElencoRicercheModOpen {

    @XmlEnumValue("MostrareLaFinestra")
    MOSTRARE_LA_FINESTRA("MostrareLaFinestra"),
    @XmlEnumValue("NonMostrareLaFinestra")
    NON_MOSTRARE_LA_FINESTRA("NonMostrareLaFinestra");
    private final String value;

    DmElencoRicercheModOpen(String v) {
        value = v;
    }

    public String value() {
        return value;
    }

    public static DmElencoRicercheModOpen fromValue(String v) {
        for (DmElencoRicercheModOpen c: DmElencoRicercheModOpen.values()) {
            if (c.value.equals(v)) {
                return c;
            }
        }
        throw new IllegalArgumentException(v);
    }

}
