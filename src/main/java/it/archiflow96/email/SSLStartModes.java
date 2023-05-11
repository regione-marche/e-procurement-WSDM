
package it.archiflow96.email;

import javax.xml.bind.annotation.XmlEnum;
import javax.xml.bind.annotation.XmlEnumValue;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for SSLStartModes.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * <p>
 * <pre>
 * &lt;simpleType name="SSLStartModes">
 *   &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
 *     &lt;enumeration value="None"/>
 *     &lt;enumeration value="Automatic"/>
 *     &lt;enumeration value="Explicit"/>
 *     &lt;enumeration value="Implicit"/>
 *   &lt;/restriction>
 * &lt;/simpleType>
 * </pre>
 * 
 */
@XmlType(name = "SSLStartModes", namespace = "http://schemas.datacontract.org/2004/07/SIAV.Archiflow.Entities.Types")
@XmlEnum
public enum SSLStartModes {

    @XmlEnumValue("None")
    NONE("None"),
    @XmlEnumValue("Automatic")
    AUTOMATIC("Automatic"),
    @XmlEnumValue("Explicit")
    EXPLICIT("Explicit"),
    @XmlEnumValue("Implicit")
    IMPLICIT("Implicit");
    private final String value;

    SSLStartModes(String v) {
        value = v;
    }

    public String value() {
        return value;
    }

    public static SSLStartModes fromValue(String v) {
        for (SSLStartModes c: SSLStartModes.values()) {
            if (c.value.equals(v)) {
                return c;
            }
        }
        throw new IllegalArgumentException(v);
    }

}
