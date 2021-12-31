
package it.archiflow93.email;

import javax.xml.bind.annotation.XmlEnum;
import javax.xml.bind.annotation.XmlEnumValue;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for AuthenticationType.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * <p>
 * <pre>
 * &lt;simpleType name="AuthenticationType">
 *   &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
 *     &lt;enumeration value="AtArchiflow"/>
 *     &lt;enumeration value="AtLdap"/>
 *   &lt;/restriction>
 * &lt;/simpleType>
 * </pre>
 * 
 */
@XmlType(name = "AuthenticationType", namespace = "http://schemas.datacontract.org/2004/07/SIAV.Archiflow.Entities.Types")
@XmlEnum
public enum AuthenticationType {

    @XmlEnumValue("AtArchiflow")
    AT_ARCHIFLOW("AtArchiflow"),
    @XmlEnumValue("AtLdap")
    AT_LDAP("AtLdap");
    private final String value;

    AuthenticationType(String v) {
        value = v;
    }

    public String value() {
        return value;
    }

    public static AuthenticationType fromValue(String v) {
        for (AuthenticationType c: AuthenticationType.values()) {
            if (c.value.equals(v)) {
                return c;
            }
        }
        throw new IllegalArgumentException(v);
    }

}
