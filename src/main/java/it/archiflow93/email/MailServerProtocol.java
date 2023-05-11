
package it.archiflow93.email;

import javax.xml.bind.annotation.XmlEnum;
import javax.xml.bind.annotation.XmlEnumValue;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for MailServerProtocol.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * <p>
 * <pre>
 * &lt;simpleType name="MailServerProtocol">
 *   &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
 *     &lt;enumeration value="Smtp"/>
 *     &lt;enumeration value="Pop"/>
 *     &lt;enumeration value="Imap"/>
 *   &lt;/restriction>
 * &lt;/simpleType>
 * </pre>
 * 
 */
@XmlType(name = "MailServerProtocol", namespace = "http://schemas.datacontract.org/2004/07/SIAV.Archiflow.Entities.Types")
@XmlEnum
public enum MailServerProtocol {

    @XmlEnumValue("Smtp")
    SMTP("Smtp"),
    @XmlEnumValue("Pop")
    POP("Pop"),
    @XmlEnumValue("Imap")
    IMAP("Imap");
    private final String value;

    MailServerProtocol(String v) {
        value = v;
    }

    public String value() {
        return value;
    }

    public static MailServerProtocol fromValue(String v) {
        for (MailServerProtocol c: MailServerProtocol.values()) {
            if (c.value.equals(v)) {
                return c;
            }
        }
        throw new IllegalArgumentException(v);
    }

}
