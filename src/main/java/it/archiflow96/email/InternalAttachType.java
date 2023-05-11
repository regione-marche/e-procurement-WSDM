
package it.archiflow96.email;

import javax.xml.bind.annotation.XmlEnum;
import javax.xml.bind.annotation.XmlEnumValue;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for InternalAttachType.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * <p>
 * <pre>
 * &lt;simpleType name="InternalAttachType">
 *   &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
 *     &lt;enumeration value="Standard"/>
 *     &lt;enumeration value="SendPEC"/>
 *     &lt;enumeration value="ReceivePEC"/>
 *   &lt;/restriction>
 * &lt;/simpleType>
 * </pre>
 * 
 */
@XmlType(name = "InternalAttachType", namespace = "http://schemas.datacontract.org/2004/07/SIAV.Archiflow.Entities.Types")
@XmlEnum
public enum InternalAttachType {

    @XmlEnumValue("Standard")
    STANDARD("Standard"),
    @XmlEnumValue("SendPEC")
    SEND_PEC("SendPEC"),
    @XmlEnumValue("ReceivePEC")
    RECEIVE_PEC("ReceivePEC");
    private final String value;

    InternalAttachType(String v) {
        value = v;
    }

    public String value() {
        return value;
    }

    public static InternalAttachType fromValue(String v) {
        for (InternalAttachType c: InternalAttachType.values()) {
            if (c.value.equals(v)) {
                return c;
            }
        }
        throw new IllegalArgumentException(v);
    }

}
