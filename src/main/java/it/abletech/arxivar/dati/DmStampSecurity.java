
package it.abletech.arxivar.dati;

import javax.xml.bind.annotation.XmlEnum;
import javax.xml.bind.annotation.XmlEnumValue;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for Dm_Stamp_Security.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * <p>
 * <pre>
 * &lt;simpleType name="Dm_Stamp_Security">
 *   &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
 *     &lt;enumeration value="NotApplied"/>
 *     &lt;enumeration value="Allow"/>
 *     &lt;enumeration value="Denied"/>
 *   &lt;/restriction>
 * &lt;/simpleType>
 * </pre>
 * 
 */
@XmlType(name = "Dm_Stamp_Security")
@XmlEnum
public enum DmStampSecurity {

    @XmlEnumValue("NotApplied")
    NOT_APPLIED("NotApplied"),
    @XmlEnumValue("Allow")
    ALLOW("Allow"),
    @XmlEnumValue("Denied")
    DENIED("Denied");
    private final String value;

    DmStampSecurity(String v) {
        value = v;
    }

    public String value() {
        return value;
    }

    public static DmStampSecurity fromValue(String v) {
        for (DmStampSecurity c: DmStampSecurity.values()) {
            if (c.value.equals(v)) {
                return c;
            }
        }
        throw new IllegalArgumentException(v);
    }

}
