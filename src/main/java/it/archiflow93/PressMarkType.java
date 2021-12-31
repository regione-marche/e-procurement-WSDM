
package it.archiflow93;

import javax.xml.bind.annotation.XmlEnum;
import javax.xml.bind.annotation.XmlEnumValue;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for PressMarkType.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * <p>
 * <pre>
 * &lt;simpleType name="PressMarkType">
 *   &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
 *     &lt;enumeration value="Standard"/>
 *     &lt;enumeration value="Automatic"/>
 *     &lt;enumeration value="Attachment"/>
 *   &lt;/restriction>
 * &lt;/simpleType>
 * </pre>
 * 
 */
@XmlType(name = "PressMarkType", namespace = "http://schemas.datacontract.org/2004/07/SIAV.Archiflow.Entities.Types")
@XmlEnum
public enum PressMarkType {

    @XmlEnumValue("Standard")
    STANDARD("Standard"),
    @XmlEnumValue("Automatic")
    AUTOMATIC("Automatic"),
    @XmlEnumValue("Attachment")
    ATTACHMENT("Attachment");
    private final String value;

    PressMarkType(String v) {
        value = v;
    }

    public String value() {
        return value;
    }

    public static PressMarkType fromValue(String v) {
        for (PressMarkType c: PressMarkType.values()) {
            if (c.value.equals(v)) {
                return c;
            }
        }
        throw new IllegalArgumentException(v);
    }

}
