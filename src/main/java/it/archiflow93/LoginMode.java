
package it.archiflow93;

import javax.xml.bind.annotation.XmlEnum;
import javax.xml.bind.annotation.XmlEnumValue;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for LoginMode.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * <p>
 * <pre>
 * &lt;simpleType name="LoginMode">
 *   &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
 *     &lt;enumeration value="None"/>
 *     &lt;enumeration value="ChangePassword"/>
 *     &lt;enumeration value="LoginTicketSap"/>
 *     &lt;enumeration value="LoginMaintenance"/>
 *   &lt;/restriction>
 * &lt;/simpleType>
 * </pre>
 * 
 */
@XmlType(name = "LoginMode", namespace = "http://schemas.datacontract.org/2004/07/SIAV.Archiflow.Entities.Types")
@XmlEnum
public enum LoginMode {

    @XmlEnumValue("None")
    NONE("None"),
    @XmlEnumValue("ChangePassword")
    CHANGE_PASSWORD("ChangePassword"),
    @XmlEnumValue("LoginTicketSap")
    LOGIN_TICKET_SAP("LoginTicketSap"),
    @XmlEnumValue("LoginMaintenance")
    LOGIN_MAINTENANCE("LoginMaintenance");
    private final String value;

    LoginMode(String v) {
        value = v;
    }

    public String value() {
        return value;
    }

    public static LoginMode fromValue(String v) {
        for (LoginMode c: LoginMode.values()) {
            if (c.value.equals(v)) {
                return c;
            }
        }
        throw new IllegalArgumentException(v);
    }

}
