
package it.abletech.arxivar.dati;

import javax.xml.bind.annotation.XmlEnum;
import javax.xml.bind.annotation.XmlEnumValue;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for Dm_Profile_Allegati.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * <p>
 * <pre>
 * &lt;simpleType name="Dm_Profile_Allegati">
 *   &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
 *     &lt;enumeration value="Si"/>
 *     &lt;enumeration value="No"/>
 *     &lt;enumeration value="Si_CopiaConforme"/>
 *   &lt;/restriction>
 * &lt;/simpleType>
 * </pre>
 * 
 */
@XmlType(name = "Dm_Profile_Allegati")
@XmlEnum
public enum DmProfileAllegati {

    @XmlEnumValue("Si")
    SI("Si"),
    @XmlEnumValue("No")
    NO("No"),
    @XmlEnumValue("Si_CopiaConforme")
    SI_COPIA_CONFORME("Si_CopiaConforme");
    private final String value;

    DmProfileAllegati(String v) {
        value = v;
    }

    public String value() {
        return value;
    }

    public static DmProfileAllegati fromValue(String v) {
        for (DmProfileAllegati c: DmProfileAllegati.values()) {
            if (c.value.equals(v)) {
                return c;
            }
        }
        throw new IllegalArgumentException(v);
    }

}
