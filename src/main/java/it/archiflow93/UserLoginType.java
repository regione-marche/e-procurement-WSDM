
package it.archiflow93;

import javax.xml.bind.annotation.XmlEnum;
import javax.xml.bind.annotation.XmlEnumValue;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for UserLoginType.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * <p>
 * <pre>
 * &lt;simpleType name="UserLoginType">
 *   &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
 *     &lt;enumeration value="UlWorkflow"/>
 *     &lt;enumeration value="UlGed"/>
 *     &lt;enumeration value="UlForcedGed"/>
 *   &lt;/restriction>
 * &lt;/simpleType>
 * </pre>
 * 
 */
@XmlType(name = "UserLoginType", namespace = "http://schemas.datacontract.org/2004/07/SIAV.Archiflow.Entities.Types")
@XmlEnum
public enum UserLoginType {

    @XmlEnumValue("UlWorkflow")
    UL_WORKFLOW("UlWorkflow"),
    @XmlEnumValue("UlGed")
    UL_GED("UlGed"),
    @XmlEnumValue("UlForcedGed")
    UL_FORCED_GED("UlForcedGed");
    private final String value;

    UserLoginType(String v) {
        value = v;
    }

    public String value() {
        return value;
    }

    public static UserLoginType fromValue(String v) {
        for (UserLoginType c: UserLoginType.values()) {
            if (c.value.equals(v)) {
                return c;
            }
        }
        throw new IllegalArgumentException(v);
    }

}
