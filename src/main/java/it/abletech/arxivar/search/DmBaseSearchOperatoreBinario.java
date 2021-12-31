
package it.abletech.arxivar.search;

import javax.xml.bind.annotation.XmlEnum;
import javax.xml.bind.annotation.XmlEnumValue;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for Dm_Base_Search_Operatore_Binario.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * <p>
 * <pre>
 * &lt;simpleType name="Dm_Base_Search_Operatore_Binario">
 *   &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
 *     &lt;enumeration value="Non_Impostato"/>
 *     &lt;enumeration value="Uguale_Bit"/>
 *     &lt;enumeration value="Diverso_Bit"/>
 *   &lt;/restriction>
 * &lt;/simpleType>
 * </pre>
 * 
 */
@XmlType(name = "Dm_Base_Search_Operatore_Binario")
@XmlEnum
public enum DmBaseSearchOperatoreBinario {

    @XmlEnumValue("Non_Impostato")
    NON_IMPOSTATO("Non_Impostato"),
    @XmlEnumValue("Uguale_Bit")
    UGUALE_BIT("Uguale_Bit"),
    @XmlEnumValue("Diverso_Bit")
    DIVERSO_BIT("Diverso_Bit");
    private final String value;

    DmBaseSearchOperatoreBinario(String v) {
        value = v;
    }

    public String value() {
        return value;
    }

    public static DmBaseSearchOperatoreBinario fromValue(String v) {
        for (DmBaseSearchOperatoreBinario c: DmBaseSearchOperatoreBinario.values()) {
            if (c.value.equals(v)) {
                return c;
            }
        }
        throw new IllegalArgumentException(v);
    }

}
