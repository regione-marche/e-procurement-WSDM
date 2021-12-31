
package it.archiflow93;

import javax.xml.bind.annotation.XmlEnum;
import javax.xml.bind.annotation.XmlEnumValue;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for SendingStatus.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * <p>
 * <pre>
 * &lt;simpleType name="SendingStatus">
 *   &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
 *     &lt;enumeration value="None"/>
 *     &lt;enumeration value="Created"/>
 *     &lt;enumeration value="Enqueued"/>
 *     &lt;enumeration value="Sent"/>
 *     &lt;enumeration value="Accepted"/>
 *     &lt;enumeration value="Delivered"/>
 *     &lt;enumeration value="UnAccepted"/>
 *     &lt;enumeration value="UnDelivered"/>
 *   &lt;/restriction>
 * &lt;/simpleType>
 * </pre>
 * 
 */
@XmlType(name = "SendingStatus", namespace = "http://schemas.datacontract.org/2004/07/SIAV.Archiflow.Entities.Types")
@XmlEnum
public enum SendingStatus {

    @XmlEnumValue("None")
    NONE("None"),
    @XmlEnumValue("Created")
    CREATED("Created"),
    @XmlEnumValue("Enqueued")
    ENQUEUED("Enqueued"),
    @XmlEnumValue("Sent")
    SENT("Sent"),
    @XmlEnumValue("Accepted")
    ACCEPTED("Accepted"),
    @XmlEnumValue("Delivered")
    DELIVERED("Delivered"),
    @XmlEnumValue("UnAccepted")
    UN_ACCEPTED("UnAccepted"),
    @XmlEnumValue("UnDelivered")
    UN_DELIVERED("UnDelivered");
    private final String value;

    SendingStatus(String v) {
        value = v;
    }

    public String value() {
        return value;
    }

    public static SendingStatus fromValue(String v) {
        for (SendingStatus c: SendingStatus.values()) {
            if (c.value.equals(v)) {
                return c;
            }
        }
        throw new IllegalArgumentException(v);
    }

}
