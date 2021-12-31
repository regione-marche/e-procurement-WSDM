
package it.easydoc.MailManagerService;

import javax.xml.bind.annotation.XmlEnum;
import javax.xml.bind.annotation.XmlEnumValue;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for TrasmissionStateType.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * <p>
 * <pre>
 * &lt;simpleType name="TrasmissionStateType">
 *   &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
 *     &lt;enumeration value="nuova"/>
 *     &lt;enumeration value="inviata"/>
 *     &lt;enumeration value="confermata"/>
 *     &lt;enumeration value="errore"/>
 *     &lt;enumeration value="mancata_consegna"/>
 *     &lt;enumeration value="conclusa"/>
 *     &lt;enumeration value="errore_consegna"/>
 *   &lt;/restriction>
 * &lt;/simpleType>
 * </pre>
 * 
 */
@XmlType(name = "TrasmissionStateType")
@XmlEnum
public enum TrasmissionStateType {

    @XmlEnumValue("nuova")
    NUOVA("nuova"),
    @XmlEnumValue("inviata")
    INVIATA("inviata"),
    @XmlEnumValue("confermata")
    CONFERMATA("confermata"),
    @XmlEnumValue("errore")
    ERRORE("errore"),
    @XmlEnumValue("mancata_consegna")
    MANCATA_CONSEGNA("mancata_consegna"),
    @XmlEnumValue("conclusa")
    CONCLUSA("conclusa"),
    @XmlEnumValue("errore_consegna")
    ERRORE_CONSEGNA("errore_consegna");
    private final String value;

    TrasmissionStateType(String v) {
        value = v;
    }

    public String value() {
        return value;
    }

    public static TrasmissionStateType fromValue(String v) {
        for (TrasmissionStateType c: TrasmissionStateType.values()) {
            if (c.value.equals(v)) {
                return c;
            }
        }
        throw new IllegalArgumentException(v);
    }

}
