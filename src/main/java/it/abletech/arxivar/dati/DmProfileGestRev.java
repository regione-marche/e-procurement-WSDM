
package it.abletech.arxivar.dati;

import javax.xml.bind.annotation.XmlEnum;
import javax.xml.bind.annotation.XmlEnumValue;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for Dm_Profile_GestRev.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * <p>
 * <pre>
 * &lt;simpleType name="Dm_Profile_GestRev">
 *   &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
 *     &lt;enumeration value="Si"/>
 *     &lt;enumeration value="No"/>
 *   &lt;/restriction>
 * &lt;/simpleType>
 * </pre>
 * 
 */
@XmlType(name = "Dm_Profile_GestRev")
@XmlEnum
public enum DmProfileGestRev {

    @XmlEnumValue("Si")
    SI("Si"),
    @XmlEnumValue("No")
    NO("No");
    private final String value;

    DmProfileGestRev(String v) {
        value = v;
    }

    public String value() {
        return value;
    }

    public static DmProfileGestRev fromValue(String v) {
        for (DmProfileGestRev c: DmProfileGestRev.values()) {
            if (c.value.equals(v)) {
                return c;
            }
        }
        throw new IllegalArgumentException(v);
    }

}
