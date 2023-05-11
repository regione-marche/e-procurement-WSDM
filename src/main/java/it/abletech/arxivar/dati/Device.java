
package it.abletech.arxivar.dati;

import javax.xml.bind.annotation.XmlEnum;
import javax.xml.bind.annotation.XmlEnumValue;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for Device.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * <p>
 * <pre>
 * &lt;simpleType name="Device">
 *   &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
 *     &lt;enumeration value="Hd"/>
 *     &lt;enumeration value="Cd"/>
 *   &lt;/restriction>
 * &lt;/simpleType>
 * </pre>
 * 
 */
@XmlType(name = "Device")
@XmlEnum
public enum Device {

    @XmlEnumValue("Hd")
    HD("Hd"),
    @XmlEnumValue("Cd")
    CD("Cd");
    private final String value;

    Device(String v) {
        value = v;
    }

    public String value() {
        return value;
    }

    public static Device fromValue(String v) {
        for (Device c: Device.values()) {
            if (c.value.equals(v)) {
                return c;
            }
        }
        throw new IllegalArgumentException(v);
    }

}
