
package it.archiflow96;

import javax.xml.bind.annotation.XmlEnum;
import javax.xml.bind.annotation.XmlEnumValue;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for EMailVisType.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * <p>
 * <pre>
 * &lt;simpleType name="EMailVisType">
 *   &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
 *     &lt;enumeration value="EVTMailbox"/>
 *     &lt;enumeration value="EVTUser"/>
 *     &lt;enumeration value="EVTCard"/>
 *   &lt;/restriction>
 * &lt;/simpleType>
 * </pre>
 * 
 */
@XmlType(name = "EMailVisType", namespace = "http://schemas.datacontract.org/2004/07/SIAV.Archiflow.Entities.Types")
@XmlEnum
public enum EMailVisType {

    @XmlEnumValue("EVTMailbox")
    EVT_MAILBOX("EVTMailbox"),
    @XmlEnumValue("EVTUser")
    EVT_USER("EVTUser"),
    @XmlEnumValue("EVTCard")
    EVT_CARD("EVTCard");
    private final String value;

    EMailVisType(String v) {
        value = v;
    }

    public String value() {
        return value;
    }

    public static EMailVisType fromValue(String v) {
        for (EMailVisType c: EMailVisType.values()) {
            if (c.value.equals(v)) {
                return c;
            }
        }
        throw new IllegalArgumentException(v);
    }

}
