
package it.archiflow94;

import javax.xml.bind.annotation.XmlEnum;
import javax.xml.bind.annotation.XmlEnumValue;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for AccessLevel.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * <p>
 * <pre>
 * &lt;simpleType name="AccessLevel">
 *   &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
 *     &lt;enumeration value="AlAny"/>
 *     &lt;enumeration value="AlRead"/>
 *     &lt;enumeration value="AlWrite"/>
 *   &lt;/restriction>
 * &lt;/simpleType>
 * </pre>
 * 
 */
@XmlType(name = "AccessLevel", namespace = "http://schemas.datacontract.org/2004/07/SIAV.Archiflow.Entities.Types")
@XmlEnum
public enum AccessLevel {

    @XmlEnumValue("AlAny")
    AL_ANY("AlAny"),
    @XmlEnumValue("AlRead")
    AL_READ("AlRead"),
    @XmlEnumValue("AlWrite")
    AL_WRITE("AlWrite");
    private final String value;

    AccessLevel(String v) {
        value = v;
    }

    public String value() {
        return value;
    }

    public static AccessLevel fromValue(String v) {
        for (AccessLevel c: AccessLevel.values()) {
            if (c.value.equals(v)) {
                return c;
            }
        }
        throw new IllegalArgumentException(v);
    }

}
