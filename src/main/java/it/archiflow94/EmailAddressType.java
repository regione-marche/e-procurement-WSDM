
package it.archiflow94;

import javax.xml.bind.annotation.XmlEnum;
import javax.xml.bind.annotation.XmlEnumValue;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for EmailAddressType.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * <p>
 * <pre>
 * &lt;simpleType name="EmailAddressType">
 *   &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
 *     &lt;enumeration value="EATypeUndefined"/>
 *     &lt;enumeration value="EATypePEO"/>
 *     &lt;enumeration value="EATypePEC"/>
 *   &lt;/restriction>
 * &lt;/simpleType>
 * </pre>
 * 
 */
@XmlType(name = "EmailAddressType", namespace = "http://schemas.datacontract.org/2004/07/SIAV.Archiflow.Entities.Types")
@XmlEnum
public enum EmailAddressType {

    @XmlEnumValue("EATypeUndefined")
    EA_TYPE_UNDEFINED("EATypeUndefined"),
    @XmlEnumValue("EATypePEO")
    EA_TYPE_PEO("EATypePEO"),
    @XmlEnumValue("EATypePEC")
    EA_TYPE_PEC("EATypePEC");
    private final String value;

    EmailAddressType(String v) {
        value = v;
    }

    public String value() {
        return value;
    }

    public static EmailAddressType fromValue(String v) {
        for (EmailAddressType c: EmailAddressType.values()) {
            if (c.value.equals(v)) {
                return c;
            }
        }
        throw new IllegalArgumentException(v);
    }

}
