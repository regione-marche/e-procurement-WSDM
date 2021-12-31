
package it.archiflow94;

import javax.xml.bind.annotation.XmlEnum;
import javax.xml.bind.annotation.XmlEnumValue;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for MailServiceSendingState.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * <p>
 * <pre>
 * &lt;simpleType name="MailServiceSendingState">
 *   &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
 *     &lt;enumeration value="MessageNotInserted"/>
 *     &lt;enumeration value="MessageInserted"/>
 *     &lt;enumeration value="MessageSent"/>
 *     &lt;enumeration value="MessageFailed"/>
 *     &lt;enumeration value="MessageVerified"/>
 *   &lt;/restriction>
 * &lt;/simpleType>
 * </pre>
 * 
 */
@XmlType(name = "MailServiceSendingState", namespace = "http://schemas.datacontract.org/2004/07/SIAV.Archiflow.Entities.Types")
@XmlEnum
public enum MailServiceSendingState {

    @XmlEnumValue("MessageNotInserted")
    MESSAGE_NOT_INSERTED("MessageNotInserted"),
    @XmlEnumValue("MessageInserted")
    MESSAGE_INSERTED("MessageInserted"),
    @XmlEnumValue("MessageSent")
    MESSAGE_SENT("MessageSent"),
    @XmlEnumValue("MessageFailed")
    MESSAGE_FAILED("MessageFailed"),
    @XmlEnumValue("MessageVerified")
    MESSAGE_VERIFIED("MessageVerified");
    private final String value;

    MailServiceSendingState(String v) {
        value = v;
    }

    public String value() {
        return value;
    }

    public static MailServiceSendingState fromValue(String v) {
        for (MailServiceSendingState c: MailServiceSendingState.values()) {
            if (c.value.equals(v)) {
                return c;
            }
        }
        throw new IllegalArgumentException(v);
    }

}
