
package it.archiflow93;

import javax.xml.bind.annotation.XmlEnum;
import javax.xml.bind.annotation.XmlEnumValue;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for EMailVisProtType.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * <p>
 * <pre>
 * &lt;simpleType name="EMailVisProtType">
 *   &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
 *     &lt;enumeration value="EVTPMailbox"/>
 *     &lt;enumeration value="EVTPUser"/>
 *     &lt;enumeration value="EVTPSourceProtocolCard"/>
 *     &lt;enumeration value="EVTPProtocolCard"/>
 *     &lt;enumeration value="EVTPMessageCard"/>
 *   &lt;/restriction>
 * &lt;/simpleType>
 * </pre>
 * 
 */
@XmlType(name = "EMailVisProtType", namespace = "http://schemas.datacontract.org/2004/07/SIAV.Archiflow.Entities.Types")
@XmlEnum
public enum EMailVisProtType {

    @XmlEnumValue("EVTPMailbox")
    EVTP_MAILBOX("EVTPMailbox"),
    @XmlEnumValue("EVTPUser")
    EVTP_USER("EVTPUser"),
    @XmlEnumValue("EVTPSourceProtocolCard")
    EVTP_SOURCE_PROTOCOL_CARD("EVTPSourceProtocolCard"),
    @XmlEnumValue("EVTPProtocolCard")
    EVTP_PROTOCOL_CARD("EVTPProtocolCard"),
    @XmlEnumValue("EVTPMessageCard")
    EVTP_MESSAGE_CARD("EVTPMessageCard");
    private final String value;

    EMailVisProtType(String v) {
        value = v;
    }

    public String value() {
        return value;
    }

    public static EMailVisProtType fromValue(String v) {
        for (EMailVisProtType c: EMailVisProtType.values()) {
            if (c.value.equals(v)) {
                return c;
            }
        }
        throw new IllegalArgumentException(v);
    }

}
