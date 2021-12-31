
package it.marche.regione.paleowssec;

import javax.xml.bind.annotation.XmlEnum;
import javax.xml.bind.annotation.XmlEnumValue;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for TipoOriginale.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * <p>
 * <pre>
 * &lt;simpleType name="TipoOriginale">
 *   &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
 *     &lt;enumeration value="NonDefinito"/>
 *     &lt;enumeration value="Digitale"/>
 *     &lt;enumeration value="Cartaceo"/>
 *   &lt;/restriction>
 * &lt;/simpleType>
 * </pre>
 * 
 */
@XmlType(name = "TipoOriginale")
@XmlEnum
public enum TipoOriginale {

    @XmlEnumValue("NonDefinito")
    NON_DEFINITO("NonDefinito"),
    @XmlEnumValue("Digitale")
    DIGITALE("Digitale"),
    @XmlEnumValue("Cartaceo")
    CARTACEO("Cartaceo");
    private final String value;

    TipoOriginale(String v) {
        value = v;
    }

    public String value() {
        return value;
    }

    public static TipoOriginale fromValue(String v) {
        for (TipoOriginale c: TipoOriginale.values()) {
            if (c.value.equals(v)) {
                return c;
            }
        }
        throw new IllegalArgumentException(v);
    }

}
