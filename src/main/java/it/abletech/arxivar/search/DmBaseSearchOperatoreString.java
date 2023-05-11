
package it.abletech.arxivar.search;

import javax.xml.bind.annotation.XmlEnum;
import javax.xml.bind.annotation.XmlEnumValue;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for Dm_Base_Search_Operatore_String.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * <p>
 * <pre>
 * &lt;simpleType name="Dm_Base_Search_Operatore_String">
 *   &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
 *     &lt;enumeration value="Non_Impostato"/>
 *     &lt;enumeration value="Uguale"/>
 *     &lt;enumeration value="Diverso"/>
 *     &lt;enumeration value="Inizia"/>
 *     &lt;enumeration value="Contiene"/>
 *     &lt;enumeration value="Termina"/>
 *     &lt;enumeration value="Nullo"/>
 *     &lt;enumeration value="Non_Nullo"/>
 *     &lt;enumeration value="Vuoto"/>
 *     &lt;enumeration value="Non_Vuoto"/>
 *     &lt;enumeration value="Nullo_o_Vuoto"/>
 *     &lt;enumeration value="Non_Nullo_e_Non_Vuoto"/>
 *     &lt;enumeration value="Like"/>
 *   &lt;/restriction>
 * &lt;/simpleType>
 * </pre>
 * 
 */
@XmlType(name = "Dm_Base_Search_Operatore_String")
@XmlEnum
public enum DmBaseSearchOperatoreString {

    @XmlEnumValue("Non_Impostato")
    NON_IMPOSTATO("Non_Impostato"),
    @XmlEnumValue("Uguale")
    UGUALE("Uguale"),
    @XmlEnumValue("Diverso")
    DIVERSO("Diverso"),
    @XmlEnumValue("Inizia")
    INIZIA("Inizia"),
    @XmlEnumValue("Contiene")
    CONTIENE("Contiene"),
    @XmlEnumValue("Termina")
    TERMINA("Termina"),
    @XmlEnumValue("Nullo")
    NULLO("Nullo"),
    @XmlEnumValue("Non_Nullo")
    NON_NULLO("Non_Nullo"),
    @XmlEnumValue("Vuoto")
    VUOTO("Vuoto"),
    @XmlEnumValue("Non_Vuoto")
    NON_VUOTO("Non_Vuoto"),
    @XmlEnumValue("Nullo_o_Vuoto")
    NULLO_O_VUOTO("Nullo_o_Vuoto"),
    @XmlEnumValue("Non_Nullo_e_Non_Vuoto")
    NON_NULLO_E_NON_VUOTO("Non_Nullo_e_Non_Vuoto"),
    @XmlEnumValue("Like")
    LIKE("Like");
    private final String value;

    DmBaseSearchOperatoreString(String v) {
        value = v;
    }

    public String value() {
        return value;
    }

    public static DmBaseSearchOperatoreString fromValue(String v) {
        for (DmBaseSearchOperatoreString c: DmBaseSearchOperatoreString.values()) {
            if (c.value.equals(v)) {
                return c;
            }
        }
        throw new IllegalArgumentException(v);
    }

}
