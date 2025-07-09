
package it.marche.regione.paleo2;

import javax.xml.bind.annotation.XmlEnum;
import javax.xml.bind.annotation.XmlEnumValue;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for TipoVoceRubrica.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * <p>
 * <pre>
 * &lt;simpleType name="TipoVoceRubrica">
 *   &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
 *     &lt;enumeration value="Indefinito"/>
 *     &lt;enumeration value="PAI"/>
 *     &lt;enumeration value="PAE"/>
 *     &lt;enumeration value="PF"/>
 *     &lt;enumeration value="PG"/>
 *     &lt;enumeration value="Amministrazione"/>
 *     &lt;enumeration value="AOO"/>
 *     &lt;enumeration value="UO"/>
 *     &lt;enumeration value="Persona"/>
 *     &lt;enumeration value="Altro"/>
 *     &lt;enumeration value="Impresa"/>
 *     &lt;enumeration value="Gruppo"/>
 *   &lt;/restriction>
 * &lt;/simpleType>
 * </pre>
 * 
 */
@XmlType(name = "TipoVoceRubrica", namespace = "http://paleo.regione.marche.it/services/")
@XmlEnum
public enum TipoVoceRubrica {

    @XmlEnumValue("Indefinito")
    INDEFINITO("Indefinito"),
    PAI("PAI"),
    PAE("PAE"),
    PF("PF"),
    PG("PG"),
    @XmlEnumValue("Amministrazione")
    AMMINISTRAZIONE("Amministrazione"),
    AOO("AOO"),
    UO("UO"),
    @XmlEnumValue("Persona")
    PERSONA("Persona"),
    @XmlEnumValue("Altro")
    ALTRO("Altro"),
    @XmlEnumValue("Impresa")
    IMPRESA("Impresa"),
    @XmlEnumValue("Gruppo")
    GRUPPO("Gruppo");
    private final String value;

    TipoVoceRubrica(String v) {
        value = v;
    }

    public String value() {
        return value;
    }

    public static TipoVoceRubrica fromValue(String v) {
        for (TipoVoceRubrica c: TipoVoceRubrica.values()) {
            if (c.value.equals(v)) {
                return c;
            }
        }
        throw new IllegalArgumentException(v);
    }

}
