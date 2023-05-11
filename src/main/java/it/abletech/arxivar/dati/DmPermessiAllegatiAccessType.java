
package it.abletech.arxivar.dati;

import javax.xml.bind.annotation.XmlEnum;
import javax.xml.bind.annotation.XmlEnumValue;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for Dm_PermessiAllegati_AccessType.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * <p>
 * <pre>
 * &lt;simpleType name="Dm_PermessiAllegati_AccessType">
 *   &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
 *     &lt;enumeration value="Nessuno"/>
 *     &lt;enumeration value="Access_Denied"/>
 *     &lt;enumeration value="Read_Only"/>
 *     &lt;enumeration value="Edit"/>
 *     &lt;enumeration value="Full_Trust"/>
 *   &lt;/restriction>
 * &lt;/simpleType>
 * </pre>
 * 
 */
@XmlType(name = "Dm_PermessiAllegati_AccessType")
@XmlEnum
public enum DmPermessiAllegatiAccessType {

    @XmlEnumValue("Nessuno")
    NESSUNO("Nessuno"),
    @XmlEnumValue("Access_Denied")
    ACCESS_DENIED("Access_Denied"),
    @XmlEnumValue("Read_Only")
    READ_ONLY("Read_Only"),
    @XmlEnumValue("Edit")
    EDIT("Edit"),
    @XmlEnumValue("Full_Trust")
    FULL_TRUST("Full_Trust");
    private final String value;

    DmPermessiAllegatiAccessType(String v) {
        value = v;
    }

    public String value() {
        return value;
    }

    public static DmPermessiAllegatiAccessType fromValue(String v) {
        for (DmPermessiAllegatiAccessType c: DmPermessiAllegatiAccessType.values()) {
            if (c.value.equals(v)) {
                return c;
            }
        }
        throw new IllegalArgumentException(v);
    }

}
