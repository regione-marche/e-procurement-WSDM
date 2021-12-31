
package it.archiflow93;

import javax.xml.bind.annotation.XmlEnum;
import javax.xml.bind.annotation.XmlEnumValue;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for MailServiceSendingSeverity.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * <p>
 * <pre>
 * &lt;simpleType name="MailServiceSendingSeverity">
 *   &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
 *     &lt;enumeration value="SeverityUndefined"/>
 *     &lt;enumeration value="SeverityInformation"/>
 *     &lt;enumeration value="SeverityError"/>
 *     &lt;enumeration value="SeverityWarning"/>
 *   &lt;/restriction>
 * &lt;/simpleType>
 * </pre>
 * 
 */
@XmlType(name = "MailServiceSendingSeverity", namespace = "http://schemas.datacontract.org/2004/07/SIAV.Archiflow.Entities.Types")
@XmlEnum
public enum MailServiceSendingSeverity {

    @XmlEnumValue("SeverityUndefined")
    SEVERITY_UNDEFINED("SeverityUndefined"),
    @XmlEnumValue("SeverityInformation")
    SEVERITY_INFORMATION("SeverityInformation"),
    @XmlEnumValue("SeverityError")
    SEVERITY_ERROR("SeverityError"),
    @XmlEnumValue("SeverityWarning")
    SEVERITY_WARNING("SeverityWarning");
    private final String value;

    MailServiceSendingSeverity(String v) {
        value = v;
    }

    public String value() {
        return value;
    }

    public static MailServiceSendingSeverity fromValue(String v) {
        for (MailServiceSendingSeverity c: MailServiceSendingSeverity.values()) {
            if (c.value.equals(v)) {
                return c;
            }
        }
        throw new IllegalArgumentException(v);
    }

}
