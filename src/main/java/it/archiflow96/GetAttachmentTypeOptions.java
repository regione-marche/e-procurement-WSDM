
package it.archiflow96;

import javax.xml.bind.annotation.XmlEnum;
import javax.xml.bind.annotation.XmlEnumValue;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for GetAttachmentTypeOptions.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * <p>
 * <pre>
 * &lt;simpleType name="GetAttachmentTypeOptions">
 *   &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
 *     &lt;enumeration value="All"/>
 *     &lt;enumeration value="InternalOnly"/>
 *     &lt;enumeration value="ExternalOnly"/>
 *   &lt;/restriction>
 * &lt;/simpleType>
 * </pre>
 * 
 */
@XmlType(name = "GetAttachmentTypeOptions", namespace = "http://schemas.datacontract.org/2004/07/SIAV.Archiflow.Entities.Card.ValueObject")
@XmlEnum
public enum GetAttachmentTypeOptions {

    @XmlEnumValue("All")
    ALL("All"),
    @XmlEnumValue("InternalOnly")
    INTERNAL_ONLY("InternalOnly"),
    @XmlEnumValue("ExternalOnly")
    EXTERNAL_ONLY("ExternalOnly");
    private final String value;

    GetAttachmentTypeOptions(String v) {
        value = v;
    }

    public String value() {
        return value;
    }

    public static GetAttachmentTypeOptions fromValue(String v) {
        for (GetAttachmentTypeOptions c: GetAttachmentTypeOptions.values()) {
            if (c.value.equals(v)) {
                return c;
            }
        }
        throw new IllegalArgumentException(v);
    }

}
