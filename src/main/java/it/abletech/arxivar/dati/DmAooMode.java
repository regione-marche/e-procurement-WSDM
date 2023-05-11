
package it.abletech.arxivar.dati;

import javax.xml.bind.annotation.XmlEnum;
import javax.xml.bind.annotation.XmlEnumValue;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for Dm_Aoo_Mode.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * <p>
 * <pre>
 * &lt;simpleType name="Dm_Aoo_Mode">
 *   &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
 *     &lt;enumeration value="Search"/>
 *     &lt;enumeration value="Archive"/>
 *     &lt;enumeration value="ArchivePa"/>
 *   &lt;/restriction>
 * &lt;/simpleType>
 * </pre>
 * 
 */
@XmlType(name = "Dm_Aoo_Mode")
@XmlEnum
public enum DmAooMode {

    @XmlEnumValue("Search")
    SEARCH("Search"),
    @XmlEnumValue("Archive")
    ARCHIVE("Archive"),
    @XmlEnumValue("ArchivePa")
    ARCHIVE_PA("ArchivePa");
    private final String value;

    DmAooMode(String v) {
        value = v;
    }

    public String value() {
        return value;
    }

    public static DmAooMode fromValue(String v) {
        for (DmAooMode c: DmAooMode.values()) {
            if (c.value.equals(v)) {
                return c;
            }
        }
        throw new IllegalArgumentException(v);
    }

}
