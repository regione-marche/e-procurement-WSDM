
package it.archiflow96;

import javax.xml.bind.annotation.XmlEnum;
import javax.xml.bind.annotation.XmlEnumValue;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for NotificationECType.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * <p>
 * <pre>
 * &lt;simpleType name="NotificationECType">
 *   &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
 *     &lt;enumeration value="NotifEC01"/>
 *     &lt;enumeration value="NotifEC02"/>
 *   &lt;/restriction>
 * &lt;/simpleType>
 * </pre>
 * 
 */
@XmlType(name = "NotificationECType", namespace = "http://schemas.datacontract.org/2004/07/SIAV.Archiflow.Entities.Types")
@XmlEnum
public enum NotificationECType {

    @XmlEnumValue("NotifEC01")
    NOTIF_EC_01("NotifEC01"),
    @XmlEnumValue("NotifEC02")
    NOTIF_EC_02("NotifEC02");
    private final String value;

    NotificationECType(String v) {
        value = v;
    }

    public String value() {
        return value;
    }

    public static NotificationECType fromValue(String v) {
        for (NotificationECType c: NotificationECType.values()) {
            if (c.value.equals(v)) {
                return c;
            }
        }
        throw new IllegalArgumentException(v);
    }

}
