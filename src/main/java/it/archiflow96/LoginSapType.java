
package it.archiflow96;

import javax.xml.bind.annotation.XmlEnum;
import javax.xml.bind.annotation.XmlEnumValue;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for LoginSapType.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * <p>
 * <pre>
 * &lt;simpleType name="LoginSapType">
 *   &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
 *     &lt;enumeration value="UserId"/>
 *     &lt;enumeration value="LoginTicket"/>
 *   &lt;/restriction>
 * &lt;/simpleType>
 * </pre>
 * 
 */
@XmlType(name = "LoginSapType", namespace = "http://schemas.datacontract.org/2004/07/SIAV.Archiflow.Entities.Types")
@XmlEnum
public enum LoginSapType {

    @XmlEnumValue("UserId")
    USER_ID("UserId"),
    @XmlEnumValue("LoginTicket")
    LOGIN_TICKET("LoginTicket");
    private final String value;

    LoginSapType(String v) {
        value = v;
    }

    public String value() {
        return value;
    }

    public static LoginSapType fromValue(String v) {
        for (LoginSapType c: LoginSapType.values()) {
            if (c.value.equals(v)) {
                return c;
            }
        }
        throw new IllegalArgumentException(v);
    }

}
