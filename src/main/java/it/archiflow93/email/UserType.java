
package it.archiflow93.email;

import javax.xml.bind.annotation.XmlEnum;
import javax.xml.bind.annotation.XmlEnumValue;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for UserType.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * <p>
 * <pre>
 * &lt;simpleType name="UserType">
 *   &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
 *     &lt;enumeration value="UtStandard"/>
 *     &lt;enumeration value="UtSupervisor"/>
 *     &lt;enumeration value="UtAdministrator"/>
 *     &lt;enumeration value="UtNoPassword"/>
 *     &lt;enumeration value="UtMaxAccess"/>
 *     &lt;enumeration value="UtUnknown"/>
 *   &lt;/restriction>
 * &lt;/simpleType>
 * </pre>
 * 
 */
@XmlType(name = "UserType", namespace = "http://schemas.datacontract.org/2004/07/SIAV.Archiflow.Entities.Types")
@XmlEnum
public enum UserType {

    @XmlEnumValue("UtStandard")
    UT_STANDARD("UtStandard"),
    @XmlEnumValue("UtSupervisor")
    UT_SUPERVISOR("UtSupervisor"),
    @XmlEnumValue("UtAdministrator")
    UT_ADMINISTRATOR("UtAdministrator"),
    @XmlEnumValue("UtNoPassword")
    UT_NO_PASSWORD("UtNoPassword"),
    @XmlEnumValue("UtMaxAccess")
    UT_MAX_ACCESS("UtMaxAccess"),
    @XmlEnumValue("UtUnknown")
    UT_UNKNOWN("UtUnknown");
    private final String value;

    UserType(String v) {
        value = v;
    }

    public String value() {
        return value;
    }

    public static UserType fromValue(String v) {
        for (UserType c: UserType.values()) {
            if (c.value.equals(v)) {
                return c;
            }
        }
        throw new IllegalArgumentException(v);
    }

}
