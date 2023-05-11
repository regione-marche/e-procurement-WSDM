
package it.abletech.arxivar.dati;

import javax.xml.bind.annotation.XmlEnum;
import javax.xml.bind.annotation.XmlEnumValue;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for Dm_Profile_Flag.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * <p>
 * <pre>
 * &lt;simpleType name="Dm_Profile_Flag">
 *   &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
 *     &lt;enumeration value="None"/>
 *     &lt;enumeration value="Emergency"/>
 *     &lt;enumeration value="Reserved"/>
 *     &lt;enumeration value="PA"/>
 *   &lt;/restriction>
 * &lt;/simpleType>
 * </pre>
 * 
 */
@XmlType(name = "Dm_Profile_Flag")
@XmlEnum
public enum DmProfileFlag {

    @XmlEnumValue("None")
    NONE("None"),
    @XmlEnumValue("Emergency")
    EMERGENCY("Emergency"),
    @XmlEnumValue("Reserved")
    RESERVED("Reserved"),
    PA("PA");
    private final String value;

    DmProfileFlag(String v) {
        value = v;
    }

    public String value() {
        return value;
    }

    public static DmProfileFlag fromValue(String v) {
        for (DmProfileFlag c: DmProfileFlag.values()) {
            if (c.value.equals(v)) {
                return c;
            }
        }
        throw new IllegalArgumentException(v);
    }

}
