
package it.archiflow94;

import javax.xml.bind.annotation.XmlEnum;
import javax.xml.bind.annotation.XmlEnumValue;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for MailServiceSendingPriority.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * <p>
 * <pre>
 * &lt;simpleType name="MailServiceSendingPriority">
 *   &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
 *     &lt;enumeration value="PriorityLow"/>
 *     &lt;enumeration value="PriorityNormal"/>
 *     &lt;enumeration value="PriorityHigh"/>
 *   &lt;/restriction>
 * &lt;/simpleType>
 * </pre>
 * 
 */
@XmlType(name = "MailServiceSendingPriority", namespace = "http://schemas.datacontract.org/2004/07/SIAV.Archiflow.Entities.Types")
@XmlEnum
public enum MailServiceSendingPriority {

    @XmlEnumValue("PriorityLow")
    PRIORITY_LOW("PriorityLow"),
    @XmlEnumValue("PriorityNormal")
    PRIORITY_NORMAL("PriorityNormal"),
    @XmlEnumValue("PriorityHigh")
    PRIORITY_HIGH("PriorityHigh");
    private final String value;

    MailServiceSendingPriority(String v) {
        value = v;
    }

    public String value() {
        return value;
    }

    public static MailServiceSendingPriority fromValue(String v) {
        for (MailServiceSendingPriority c: MailServiceSendingPriority.values()) {
            if (c.value.equals(v)) {
                return c;
            }
        }
        throw new IllegalArgumentException(v);
    }

}
