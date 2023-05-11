
package it.abletech.arxivar.dati;

import javax.xml.bind.annotation.XmlEnum;
import javax.xml.bind.annotation.XmlEnumValue;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for Dm_Profile_ForInsert_ConstrainRoleBehaviour.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * <p>
 * <pre>
 * &lt;simpleType name="Dm_Profile_ForInsert_ConstrainRoleBehaviour">
 *   &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
 *     &lt;enumeration value="None"/>
 *     &lt;enumeration value="ForceInsert"/>
 *     &lt;enumeration value="State"/>
 *   &lt;/restriction>
 * &lt;/simpleType>
 * </pre>
 * 
 */
@XmlType(name = "Dm_Profile_ForInsert_ConstrainRoleBehaviour")
@XmlEnum
public enum DmProfileForInsertConstrainRoleBehaviour {

    @XmlEnumValue("None")
    NONE("None"),
    @XmlEnumValue("ForceInsert")
    FORCE_INSERT("ForceInsert"),
    @XmlEnumValue("State")
    STATE("State");
    private final String value;

    DmProfileForInsertConstrainRoleBehaviour(String v) {
        value = v;
    }

    public String value() {
        return value;
    }

    public static DmProfileForInsertConstrainRoleBehaviour fromValue(String v) {
        for (DmProfileForInsertConstrainRoleBehaviour c: DmProfileForInsertConstrainRoleBehaviour.values()) {
            if (c.value.equals(v)) {
                return c;
            }
        }
        throw new IllegalArgumentException(v);
    }

}
