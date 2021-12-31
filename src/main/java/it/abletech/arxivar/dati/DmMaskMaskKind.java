
package it.abletech.arxivar.dati;

import javax.xml.bind.annotation.XmlEnum;
import javax.xml.bind.annotation.XmlEnumValue;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for Dm_Mask_MaskKind.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * <p>
 * <pre>
 * &lt;simpleType name="Dm_Mask_MaskKind">
 *   &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
 *     &lt;enumeration value="UserMask"/>
 *     &lt;enumeration value="SystemMask"/>
 *   &lt;/restriction>
 * &lt;/simpleType>
 * </pre>
 * 
 */
@XmlType(name = "Dm_Mask_MaskKind")
@XmlEnum
public enum DmMaskMaskKind {

    @XmlEnumValue("UserMask")
    USER_MASK("UserMask"),
    @XmlEnumValue("SystemMask")
    SYSTEM_MASK("SystemMask");
    private final String value;

    DmMaskMaskKind(String v) {
        value = v;
    }

    public String value() {
        return value;
    }

    public static DmMaskMaskKind fromValue(String v) {
        for (DmMaskMaskKind c: DmMaskMaskKind.values()) {
            if (c.value.equals(v)) {
                return c;
            }
        }
        throw new IllegalArgumentException(v);
    }

}
