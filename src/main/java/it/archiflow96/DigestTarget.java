
package it.archiflow96;

import javax.xml.bind.annotation.XmlEnum;
import javax.xml.bind.annotation.XmlEnumValue;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for DigestTarget.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * <p>
 * <pre>
 * &lt;simpleType name="DigestTarget">
 *   &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
 *     &lt;enumeration value="P7m"/>
 *     &lt;enumeration value="Pdf"/>
 *     &lt;enumeration value="Tsd"/>
 *   &lt;/restriction>
 * &lt;/simpleType>
 * </pre>
 * 
 */
@XmlType(name = "DigestTarget", namespace = "http://schemas.datacontract.org/2004/07/SIAV.Archiflow.Entities.Types")
@XmlEnum
public enum DigestTarget {

    @XmlEnumValue("P7m")
    P_7_M("P7m"),
    @XmlEnumValue("Pdf")
    PDF("Pdf"),
    @XmlEnumValue("Tsd")
    TSD("Tsd");
    private final String value;

    DigestTarget(String v) {
        value = v;
    }

    public String value() {
        return value;
    }

    public static DigestTarget fromValue(String v) {
        for (DigestTarget c: DigestTarget.values()) {
            if (c.value.equals(v)) {
                return c;
            }
        }
        throw new IllegalArgumentException(v);
    }

}
