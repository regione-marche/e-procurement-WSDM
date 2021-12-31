
package it.easydoc.ProtocolManagerService;

import javax.xml.bind.annotation.XmlEnum;
import javax.xml.bind.annotation.XmlEnumValue;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for MessageType.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * <p>
 * <pre>
 * &lt;simpleType name="MessageType">
 *   &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
 *     &lt;enumeration value="ok"/>
 *     &lt;enumeration value="warning"/>
 *     &lt;enumeration value="error"/>
 *   &lt;/restriction>
 * &lt;/simpleType>
 * </pre>
 * 
 */
@XmlType(name = "MessageType")
@XmlEnum
public enum MessageType {

    @XmlEnumValue("ok")
    OK("ok"),
    @XmlEnumValue("warning")
    WARNING("warning"),
    @XmlEnumValue("error")
    ERROR("error");
    private final String value;

    MessageType(String v) {
        value = v;
    }

    public String value() {
        return value;
    }

    public static MessageType fromValue(String v) {
        for (MessageType c: MessageType.values()) {
            if (c.value.equals(v)) {
                return c;
            }
        }
        throw new IllegalArgumentException(v);
    }

}
