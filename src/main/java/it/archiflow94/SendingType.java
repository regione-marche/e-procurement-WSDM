
package it.archiflow94;

import javax.xml.bind.annotation.XmlEnum;
import javax.xml.bind.annotation.XmlEnumValue;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for SendingType.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * <p>
 * <pre>
 * &lt;simpleType name="SendingType">
 *   &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
 *     &lt;enumeration value="None"/>
 *     &lt;enumeration value="Normal"/>
 *     &lt;enumeration value="Mail"/>
 *   &lt;/restriction>
 * &lt;/simpleType>
 * </pre>
 * 
 */
@XmlType(name = "SendingType", namespace = "http://schemas.datacontract.org/2004/07/SIAV.Archiflow.Entities.Types")
@XmlEnum
public enum SendingType {

    @XmlEnumValue("None")
    NONE("None"),
    @XmlEnumValue("Normal")
    NORMAL("Normal"),
    @XmlEnumValue("Mail")
    MAIL("Mail");
    private final String value;

    SendingType(String v) {
        value = v;
    }

    public String value() {
        return value;
    }

    public static SendingType fromValue(String v) {
        for (SendingType c: SendingType.values()) {
            if (c.value.equals(v)) {
                return c;
            }
        }
        throw new IllegalArgumentException(v);
    }

}
