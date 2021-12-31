
package it.abletech.arxivar.search;

import javax.xml.bind.annotation.XmlEnum;
import javax.xml.bind.annotation.XmlEnumValue;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for Dm_Base_Search_Operatore_Numerico.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * <p>
 * <pre>
 * &lt;simpleType name="Dm_Base_Search_Operatore_Numerico">
 *   &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
 *     &lt;enumeration value="Non_Impostato"/>
 *     &lt;enumeration value="Minore"/>
 *     &lt;enumeration value="Minore_Uguale"/>
 *     &lt;enumeration value="Uguale"/>
 *     &lt;enumeration value="Maggiore_Uguale"/>
 *     &lt;enumeration value="Maggiore"/>
 *     &lt;enumeration value="Diverso"/>
 *     &lt;enumeration value="Compreso"/>
 *     &lt;enumeration value="Nullo"/>
 *     &lt;enumeration value="Non_Nullo"/>
 *     &lt;enumeration value="Nullo_o_Zero"/>
 *     &lt;enumeration value="Non_Nullo_e_Non_Zero"/>
 *     &lt;enumeration value="Escluso"/>
 *   &lt;/restriction>
 * &lt;/simpleType>
 * </pre>
 * 
 */
@XmlType(name = "Dm_Base_Search_Operatore_Numerico")
@XmlEnum
public enum DmBaseSearchOperatoreNumerico {

    @XmlEnumValue("Non_Impostato")
    NON_IMPOSTATO("Non_Impostato"),
    @XmlEnumValue("Minore")
    MINORE("Minore"),
    @XmlEnumValue("Minore_Uguale")
    MINORE_UGUALE("Minore_Uguale"),
    @XmlEnumValue("Uguale")
    UGUALE("Uguale"),
    @XmlEnumValue("Maggiore_Uguale")
    MAGGIORE_UGUALE("Maggiore_Uguale"),
    @XmlEnumValue("Maggiore")
    MAGGIORE("Maggiore"),
    @XmlEnumValue("Diverso")
    DIVERSO("Diverso"),
    @XmlEnumValue("Compreso")
    COMPRESO("Compreso"),
    @XmlEnumValue("Nullo")
    NULLO("Nullo"),
    @XmlEnumValue("Non_Nullo")
    NON_NULLO("Non_Nullo"),
    @XmlEnumValue("Nullo_o_Zero")
    NULLO_O_ZERO("Nullo_o_Zero"),
    @XmlEnumValue("Non_Nullo_e_Non_Zero")
    NON_NULLO_E_NON_ZERO("Non_Nullo_e_Non_Zero"),
    @XmlEnumValue("Escluso")
    ESCLUSO("Escluso");
    private final String value;

    DmBaseSearchOperatoreNumerico(String v) {
        value = v;
    }

    public String value() {
        return value;
    }

    public static DmBaseSearchOperatoreNumerico fromValue(String v) {
        for (DmBaseSearchOperatoreNumerico c: DmBaseSearchOperatoreNumerico.values()) {
            if (c.value.equals(v)) {
                return c;
            }
        }
        throw new IllegalArgumentException(v);
    }

}
