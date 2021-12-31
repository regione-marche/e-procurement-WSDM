
package it.abletech.arxivar.dati;

import javax.xml.bind.annotation.XmlEnum;
import javax.xml.bind.annotation.XmlEnumValue;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for DmProfileInOut.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * <p>
 * <pre>
 * &lt;simpleType name="DmProfileInOut">
 *   &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
 *     &lt;enumeration value="NonValorizzato"/>
 *     &lt;enumeration value="Uscita"/>
 *     &lt;enumeration value="Entrata"/>
 *     &lt;enumeration value="Interno"/>
 *   &lt;/restriction>
 * &lt;/simpleType>
 * </pre>
 * 
 */
@XmlType(name = "DmProfileInOut")
@XmlEnum
public enum DmProfileInOut {

    @XmlEnumValue("NonValorizzato")
    NON_VALORIZZATO("NonValorizzato"),
    @XmlEnumValue("Uscita")
    USCITA("Uscita"),
    @XmlEnumValue("Entrata")
    ENTRATA("Entrata"),
    @XmlEnumValue("Interno")
    INTERNO("Interno");
    private final String value;

    DmProfileInOut(String v) {
        value = v;
    }

    public String value() {
        return value;
    }

    public static DmProfileInOut fromValue(String v) {
        for (DmProfileInOut c: DmProfileInOut.values()) {
            if (c.value.equals(v)) {
                return c;
            }
        }
        throw new IllegalArgumentException(v);
    }

}
