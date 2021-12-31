
package it.archiflow96;

import javax.xml.bind.annotation.XmlEnum;
import javax.xml.bind.annotation.XmlEnumValue;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for KeyOrderType.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * <p>
 * <pre>
 * &lt;simpleType name="KeyOrderType">
 *   &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
 *     &lt;enumeration value="KeyOrderByDefault"/>
 *     &lt;enumeration value="KeysvOrderByNum"/>
 *     &lt;enumeration value="KeyOrderByString"/>
 *     &lt;enumeration value="KeyOrderByStringAndNum"/>
 *     &lt;enumeration value="KeyOrderByIsRead"/>
 *     &lt;enumeration value="KeyOrderByDate"/>
 *   &lt;/restriction>
 * &lt;/simpleType>
 * </pre>
 * 
 */
@XmlType(name = "KeyOrderType", namespace = "http://schemas.datacontract.org/2004/07/SIAV.Archiflow.Entities.Types")
@XmlEnum
public enum KeyOrderType {

    @XmlEnumValue("KeyOrderByDefault")
    KEY_ORDER_BY_DEFAULT("KeyOrderByDefault"),
    @XmlEnumValue("KeysvOrderByNum")
    KEYSV_ORDER_BY_NUM("KeysvOrderByNum"),
    @XmlEnumValue("KeyOrderByString")
    KEY_ORDER_BY_STRING("KeyOrderByString"),
    @XmlEnumValue("KeyOrderByStringAndNum")
    KEY_ORDER_BY_STRING_AND_NUM("KeyOrderByStringAndNum"),
    @XmlEnumValue("KeyOrderByIsRead")
    KEY_ORDER_BY_IS_READ("KeyOrderByIsRead"),
    @XmlEnumValue("KeyOrderByDate")
    KEY_ORDER_BY_DATE("KeyOrderByDate");
    private final String value;

    KeyOrderType(String v) {
        value = v;
    }

    public String value() {
        return value;
    }

    public static KeyOrderType fromValue(String v) {
        for (KeyOrderType c: KeyOrderType.values()) {
            if (c.value.equals(v)) {
                return c;
            }
        }
        throw new IllegalArgumentException(v);
    }

}
