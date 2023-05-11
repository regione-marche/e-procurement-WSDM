
package it.abletech.arxivar.login;

import javax.xml.bind.annotation.XmlEnum;
import javax.xml.bind.annotation.XmlEnumValue;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for Dm_Utenti_Htmlbody.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * <p>
 * <pre>
 * &lt;simpleType name="Dm_Utenti_Htmlbody">
 *   &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
 *     &lt;enumeration value="Disabilitato"/>
 *     &lt;enumeration value="SoloSpedizione"/>
 *     &lt;enumeration value="SoloRicezione"/>
 *     &lt;enumeration value="SpedizioneRicezione"/>
 *   &lt;/restriction>
 * &lt;/simpleType>
 * </pre>
 * 
 */
@XmlType(name = "Dm_Utenti_Htmlbody")
@XmlEnum
public enum DmUtentiHtmlbody {

    @XmlEnumValue("Disabilitato")
    DISABILITATO("Disabilitato"),
    @XmlEnumValue("SoloSpedizione")
    SOLO_SPEDIZIONE("SoloSpedizione"),
    @XmlEnumValue("SoloRicezione")
    SOLO_RICEZIONE("SoloRicezione"),
    @XmlEnumValue("SpedizioneRicezione")
    SPEDIZIONE_RICEZIONE("SpedizioneRicezione");
    private final String value;

    DmUtentiHtmlbody(String v) {
        value = v;
    }

    public String value() {
        return value;
    }

    public static DmUtentiHtmlbody fromValue(String v) {
        for (DmUtentiHtmlbody c: DmUtentiHtmlbody.values()) {
            if (c.value.equals(v)) {
                return c;
            }
        }
        throw new IllegalArgumentException(v);
    }

}
