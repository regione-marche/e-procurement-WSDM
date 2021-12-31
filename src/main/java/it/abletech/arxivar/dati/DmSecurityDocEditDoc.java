
package it.abletech.arxivar.dati;

import javax.xml.bind.annotation.XmlEnum;
import javax.xml.bind.annotation.XmlEnumValue;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for Dm_SecurityDoc_EditDoc.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * <p>
 * <pre>
 * &lt;simpleType name="Dm_SecurityDoc_EditDoc">
 *   &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
 *     &lt;enumeration value="None"/>
 *     &lt;enumeration value="Allow"/>
 *     &lt;enumeration value="Deny"/>
 *   &lt;/restriction>
 * &lt;/simpleType>
 * </pre>
 * 
 */
@XmlType(name = "Dm_SecurityDoc_EditDoc")
@XmlEnum
public enum DmSecurityDocEditDoc {

    @XmlEnumValue("None")
    NONE("None"),
    @XmlEnumValue("Allow")
    ALLOW("Allow"),
    @XmlEnumValue("Deny")
    DENY("Deny");
    private final String value;

    DmSecurityDocEditDoc(String v) {
        value = v;
    }

    public String value() {
        return value;
    }

    public static DmSecurityDocEditDoc fromValue(String v) {
        for (DmSecurityDocEditDoc c: DmSecurityDocEditDoc.values()) {
            if (c.value.equals(v)) {
                return c;
            }
        }
        throw new IllegalArgumentException(v);
    }

}
