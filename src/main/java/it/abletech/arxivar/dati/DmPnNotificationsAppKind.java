
package it.abletech.arxivar.dati;

import javax.xml.bind.annotation.XmlEnum;
import javax.xml.bind.annotation.XmlEnumValue;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for Dm_Pn_Notifications_App_Kind.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * <p>
 * <pre>
 * &lt;simpleType name="Dm_Pn_Notifications_App_Kind">
 *   &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
 *     &lt;enumeration value="ArxMobile"/>
 *     &lt;enumeration value="ArxMobileTasks"/>
 *   &lt;/restriction>
 * &lt;/simpleType>
 * </pre>
 * 
 */
@XmlType(name = "Dm_Pn_Notifications_App_Kind")
@XmlEnum
public enum DmPnNotificationsAppKind {

    @XmlEnumValue("ArxMobile")
    ARX_MOBILE("ArxMobile"),
    @XmlEnumValue("ArxMobileTasks")
    ARX_MOBILE_TASKS("ArxMobileTasks");
    private final String value;

    DmPnNotificationsAppKind(String v) {
        value = v;
    }

    public String value() {
        return value;
    }

    public static DmPnNotificationsAppKind fromValue(String v) {
        for (DmPnNotificationsAppKind c: DmPnNotificationsAppKind.values()) {
            if (c.value.equals(v)) {
                return c;
            }
        }
        throw new IllegalArgumentException(v);
    }

}
