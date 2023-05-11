
package it.archiflow94;

import javax.xml.bind.annotation.XmlEnum;
import javax.xml.bind.annotation.XmlEnumValue;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for AgrafMatchMode.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * <p>
 * <pre>
 * &lt;simpleType name="AgrafMatchMode">
 *   &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
 *     &lt;enumeration value="AgrafMatchModeOr"/>
 *     &lt;enumeration value="AgrafMatchModeAnd"/>
 *   &lt;/restriction>
 * &lt;/simpleType>
 * </pre>
 * 
 */
@XmlType(name = "AgrafMatchMode", namespace = "http://schemas.datacontract.org/2004/07/SIAV.Archiflow.Entities.Types")
@XmlEnum
public enum AgrafMatchMode {

    @XmlEnumValue("AgrafMatchModeOr")
    AGRAF_MATCH_MODE_OR("AgrafMatchModeOr"),
    @XmlEnumValue("AgrafMatchModeAnd")
    AGRAF_MATCH_MODE_AND("AgrafMatchModeAnd");
    private final String value;

    AgrafMatchMode(String v) {
        value = v;
    }

    public String value() {
        return value;
    }

    public static AgrafMatchMode fromValue(String v) {
        for (AgrafMatchMode c: AgrafMatchMode.values()) {
            if (c.value.equals(v)) {
                return c;
            }
        }
        throw new IllegalArgumentException(v);
    }

}
