
package it.marche.regione.paleo;

import javax.xml.bind.annotation.XmlEnum;
import javax.xml.bind.annotation.XmlEnumValue;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for TipoDestinatarioTrasmissione.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * <p>
 * <pre>
 * &lt;simpleType name="TipoDestinatarioTrasmissione">
 *   &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
 *     &lt;enumeration value="Utente"/>
 *     &lt;enumeration value="Ruolo"/>
 *   &lt;/restriction>
 * &lt;/simpleType>
 * </pre>
 * 
 */
@XmlType(name = "TipoDestinatarioTrasmissione")
@XmlEnum
public enum TipoDestinatarioTrasmissione {

    @XmlEnumValue("Utente")
    UTENTE("Utente"),
    @XmlEnumValue("Ruolo")
    RUOLO("Ruolo");
    private final String value;

    TipoDestinatarioTrasmissione(String v) {
        value = v;
    }

    public String value() {
        return value;
    }

    public static TipoDestinatarioTrasmissione fromValue(String v) {
        for (TipoDestinatarioTrasmissione c: TipoDestinatarioTrasmissione.values()) {
            if (c.value.equals(v)) {
                return c;
            }
        }
        throw new IllegalArgumentException(v);
    }

}
