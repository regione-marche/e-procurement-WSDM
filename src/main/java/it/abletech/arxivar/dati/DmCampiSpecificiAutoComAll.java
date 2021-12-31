
package it.abletech.arxivar.dati;

import javax.xml.bind.annotation.XmlEnum;
import javax.xml.bind.annotation.XmlEnumValue;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for Dm_CampiSpecifici_AutoComAll.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * <p>
 * <pre>
 * &lt;simpleType name="Dm_CampiSpecifici_AutoComAll">
 *   &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
 *     &lt;enumeration value="Nessuno"/>
 *     &lt;enumeration value="Sinistra"/>
 *     &lt;enumeration value="Destra"/>
 *   &lt;/restriction>
 * &lt;/simpleType>
 * </pre>
 * 
 */
@XmlType(name = "Dm_CampiSpecifici_AutoComAll")
@XmlEnum
public enum DmCampiSpecificiAutoComAll {

    @XmlEnumValue("Nessuno")
    NESSUNO("Nessuno"),
    @XmlEnumValue("Sinistra")
    SINISTRA("Sinistra"),
    @XmlEnumValue("Destra")
    DESTRA("Destra");
    private final String value;

    DmCampiSpecificiAutoComAll(String v) {
        value = v;
    }

    public String value() {
        return value;
    }

    public static DmCampiSpecificiAutoComAll fromValue(String v) {
        for (DmCampiSpecificiAutoComAll c: DmCampiSpecificiAutoComAll.values()) {
            if (c.value.equals(v)) {
                return c;
            }
        }
        throw new IllegalArgumentException(v);
    }

}
