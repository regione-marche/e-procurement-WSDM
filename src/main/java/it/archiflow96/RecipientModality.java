
package it.archiflow96;

import javax.xml.bind.annotation.XmlEnum;
import javax.xml.bind.annotation.XmlEnumValue;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for RecipientModality.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * <p>
 * <pre>
 * &lt;simpleType name="RecipientModality">
 *   &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
 *     &lt;enumeration value="To"/>
 *     &lt;enumeration value="Cc"/>
 *     &lt;enumeration value="Bcc"/>
 *   &lt;/restriction>
 * &lt;/simpleType>
 * </pre>
 * 
 */
@XmlType(name = "RecipientModality", namespace = "http://schemas.datacontract.org/2004/07/SIAV.Archiflow.Entities.Types")
@XmlEnum
public enum RecipientModality {

    @XmlEnumValue("To")
    TO("To"),
    @XmlEnumValue("Cc")
    CC("Cc"),
    @XmlEnumValue("Bcc")
    BCC("Bcc");
    private final String value;

    RecipientModality(String v) {
        value = v;
    }

    public String value() {
        return value;
    }

    public static RecipientModality fromValue(String v) {
        for (RecipientModality c: RecipientModality.values()) {
            if (c.value.equals(v)) {
                return c;
            }
        }
        throw new IllegalArgumentException(v);
    }

}
