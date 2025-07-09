
package it.marche.regione.paleo2;

import javax.xml.bind.annotation.XmlEnum;
import javax.xml.bind.annotation.XmlEnumValue;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for TipoRisultato.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * <p>
 * <pre>
 * &lt;simpleType name="TipoRisultato">
 *   &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
 *     &lt;enumeration value="Info"/>
 *     &lt;enumeration value="Warning"/>
 *     &lt;enumeration value="Error"/>
 *     &lt;enumeration value="Exception"/>
 *   &lt;/restriction>
 * &lt;/simpleType>
 * </pre>
 * 
 */
@XmlType(name = "TipoRisultato", namespace = "http://paleo.regione.marche.it/services/")
@XmlEnum
public enum TipoRisultato {

    @XmlEnumValue("Info")
    INFO("Info"),
    @XmlEnumValue("Warning")
    WARNING("Warning"),
    @XmlEnumValue("Error")
    ERROR("Error"),
    @XmlEnumValue("Exception")
    EXCEPTION("Exception");
    private final String value;

    TipoRisultato(String v) {
        value = v;
    }

    public String value() {
        return value;
    }

    public static TipoRisultato fromValue(String v) {
        for (TipoRisultato c: TipoRisultato.values()) {
            if (c.value.equals(v)) {
                return c;
            }
        }
        throw new IllegalArgumentException(v);
    }

}
