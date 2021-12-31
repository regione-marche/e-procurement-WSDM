
package it.archiflow93.email;

import javax.xml.bind.annotation.XmlEnum;
import javax.xml.bind.annotation.XmlEnumValue;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for EmailAttType.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * <p>
 * <pre>
 * &lt;simpleType name="EmailAttType">
 *   &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
 *     &lt;enumeration value="EAttTypeAttachment"/>
 *     &lt;enumeration value="EAttTypeOriginalEml"/>
 *     &lt;enumeration value="EAttTypeEnvelopeEml"/>
 *   &lt;/restriction>
 * &lt;/simpleType>
 * </pre>
 * 
 */
@XmlType(name = "EmailAttType", namespace = "http://schemas.datacontract.org/2004/07/SIAV.Archiflow.Entities.Types")
@XmlEnum
public enum EmailAttType {

    @XmlEnumValue("EAttTypeAttachment")
    E_ATT_TYPE_ATTACHMENT("EAttTypeAttachment"),
    @XmlEnumValue("EAttTypeOriginalEml")
    E_ATT_TYPE_ORIGINAL_EML("EAttTypeOriginalEml"),
    @XmlEnumValue("EAttTypeEnvelopeEml")
    E_ATT_TYPE_ENVELOPE_EML("EAttTypeEnvelopeEml");
    private final String value;

    EmailAttType(String v) {
        value = v;
    }

    public String value() {
        return value;
    }

    public static EmailAttType fromValue(String v) {
        for (EmailAttType c: EmailAttType.values()) {
            if (c.value.equals(v)) {
                return c;
            }
        }
        throw new IllegalArgumentException(v);
    }

}
