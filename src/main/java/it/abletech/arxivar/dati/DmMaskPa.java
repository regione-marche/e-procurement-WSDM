
package it.abletech.arxivar.dati;

import javax.xml.bind.annotation.XmlEnum;
import javax.xml.bind.annotation.XmlEnumValue;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for Dm_Mask_Pa.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * <p>
 * <pre>
 * &lt;simpleType name="Dm_Mask_Pa">
 *   &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
 *     &lt;enumeration value="None"/>
 *     &lt;enumeration value="OnlyNever"/>
 *     &lt;enumeration value="OnlyOptionally"/>
 *     &lt;enumeration value="NeverOrOptionally"/>
 *     &lt;enumeration value="OnlyAlways"/>
 *     &lt;enumeration value="AlwaysOrNever"/>
 *     &lt;enumeration value="AlwaysOrOptionally"/>
 *     &lt;enumeration value="All"/>
 *   &lt;/restriction>
 * &lt;/simpleType>
 * </pre>
 * 
 */
@XmlType(name = "Dm_Mask_Pa")
@XmlEnum
public enum DmMaskPa {

    @XmlEnumValue("None")
    NONE("None"),
    @XmlEnumValue("OnlyNever")
    ONLY_NEVER("OnlyNever"),
    @XmlEnumValue("OnlyOptionally")
    ONLY_OPTIONALLY("OnlyOptionally"),
    @XmlEnumValue("NeverOrOptionally")
    NEVER_OR_OPTIONALLY("NeverOrOptionally"),
    @XmlEnumValue("OnlyAlways")
    ONLY_ALWAYS("OnlyAlways"),
    @XmlEnumValue("AlwaysOrNever")
    ALWAYS_OR_NEVER("AlwaysOrNever"),
    @XmlEnumValue("AlwaysOrOptionally")
    ALWAYS_OR_OPTIONALLY("AlwaysOrOptionally"),
    @XmlEnumValue("All")
    ALL("All");
    private final String value;

    DmMaskPa(String v) {
        value = v;
    }

    public String value() {
        return value;
    }

    public static DmMaskPa fromValue(String v) {
        for (DmMaskPa c: DmMaskPa.values()) {
            if (c.value.equals(v)) {
                return c;
            }
        }
        throw new IllegalArgumentException(v);
    }

}
