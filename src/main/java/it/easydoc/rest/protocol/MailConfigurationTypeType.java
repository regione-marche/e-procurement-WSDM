
package it.easydoc.rest.protocol;

import javax.xml.bind.annotation.XmlEnum;
import javax.xml.bind.annotation.XmlEnumValue;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for MailConfigurationTypeType.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * <p>
 * <pre>
 * &lt;simpleType name="MailConfigurationTypeType">
 *   &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
 *     &lt;enumeration value="mail"/>
 *     &lt;enumeration value="pec"/>
 *   &lt;/restriction>
 * &lt;/simpleType>
 * </pre>
 * 
 */
@XmlType(name = "MailConfigurationTypeType")
@XmlEnum
public enum MailConfigurationTypeType {

    @XmlEnumValue("mail")
    MAIL("mail"),
    @XmlEnumValue("pec")
    PEC("pec");
    private final String value;

    MailConfigurationTypeType(String v) {
        value = v;
    }

    public String value() {
        return value;
    }

    public static MailConfigurationTypeType fromValue(String v) {
        for (MailConfigurationTypeType c: MailConfigurationTypeType.values()) {
            if (c.value.equals(v)) {
                return c;
            }
        }
        throw new IllegalArgumentException(v);
    }

}
