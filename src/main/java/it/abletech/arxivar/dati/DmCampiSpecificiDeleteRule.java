
package it.abletech.arxivar.dati;

import javax.xml.bind.annotation.XmlEnum;
import javax.xml.bind.annotation.XmlEnumValue;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for Dm_CampiSpecifici_DeleteRule.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * <p>
 * <pre>
 * &lt;simpleType name="Dm_CampiSpecifici_DeleteRule">
 *   &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
 *     &lt;enumeration value="Cascade"/>
 *     &lt;enumeration value="Owned"/>
 *   &lt;/restriction>
 * &lt;/simpleType>
 * </pre>
 * 
 */
@XmlType(name = "Dm_CampiSpecifici_DeleteRule")
@XmlEnum
public enum DmCampiSpecificiDeleteRule {

    @XmlEnumValue("Cascade")
    CASCADE("Cascade"),
    @XmlEnumValue("Owned")
    OWNED("Owned");
    private final String value;

    DmCampiSpecificiDeleteRule(String v) {
        value = v;
    }

    public String value() {
        return value;
    }

    public static DmCampiSpecificiDeleteRule fromValue(String v) {
        for (DmCampiSpecificiDeleteRule c: DmCampiSpecificiDeleteRule.values()) {
            if (c.value.equals(v)) {
                return c;
            }
        }
        throw new IllegalArgumentException(v);
    }

}
