
package it.abletech.arxivar.dati;

import javax.xml.bind.annotation.XmlEnum;
import javax.xml.bind.annotation.XmlEnumValue;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for Dm_Aoo_SaveType.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * <p>
 * <pre>
 * &lt;simpleType name="Dm_Aoo_SaveType">
 *   &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
 *     &lt;enumeration value="File_System"/>
 *     &lt;enumeration value="Database"/>
 *   &lt;/restriction>
 * &lt;/simpleType>
 * </pre>
 * 
 */
@XmlType(name = "Dm_Aoo_SaveType")
@XmlEnum
public enum DmAooSaveType {

    @XmlEnumValue("File_System")
    FILE_SYSTEM("File_System"),
    @XmlEnumValue("Database")
    DATABASE("Database");
    private final String value;

    DmAooSaveType(String v) {
        value = v;
    }

    public String value() {
        return value;
    }

    public static DmAooSaveType fromValue(String v) {
        for (DmAooSaveType c: DmAooSaveType.values()) {
            if (c.value.equals(v)) {
                return c;
            }
        }
        throw new IllegalArgumentException(v);
    }

}
