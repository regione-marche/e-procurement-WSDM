
package it.abletech.arxivar.dati;

import javax.xml.bind.annotation.XmlEnum;
import javax.xml.bind.annotation.XmlEnumValue;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for Dm_ElencoPratiche_StatoPratica.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * <p>
 * <pre>
 * &lt;simpleType name="Dm_ElencoPratiche_StatoPratica">
 *   &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
 *     &lt;enumeration value="Aperta"/>
 *     &lt;enumeration value="Chiusa"/>
 *   &lt;/restriction>
 * &lt;/simpleType>
 * </pre>
 * 
 */
@XmlType(name = "Dm_ElencoPratiche_StatoPratica")
@XmlEnum
public enum DmElencoPraticheStatoPratica {

    @XmlEnumValue("Aperta")
    APERTA("Aperta"),
    @XmlEnumValue("Chiusa")
    CHIUSA("Chiusa");
    private final String value;

    DmElencoPraticheStatoPratica(String v) {
        value = v;
    }

    public String value() {
        return value;
    }

    public static DmElencoPraticheStatoPratica fromValue(String v) {
        for (DmElencoPraticheStatoPratica c: DmElencoPraticheStatoPratica.values()) {
            if (c.value.equals(v)) {
                return c;
            }
        }
        throw new IllegalArgumentException(v);
    }

}
