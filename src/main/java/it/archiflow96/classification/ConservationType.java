
package it.archiflow96.classification;

import javax.xml.bind.annotation.XmlEnum;
import javax.xml.bind.annotation.XmlEnumValue;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for ConservationType.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * <p>
 * <pre>
 * &lt;simpleType name="ConservationType">
 *   &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
 *     &lt;enumeration value="None"/>
 *     &lt;enumeration value="Current"/>
 *     &lt;enumeration value="Store"/>
 *     &lt;enumeration value="Historical"/>
 *     &lt;enumeration value="Discardable"/>
 *   &lt;/restriction>
 * &lt;/simpleType>
 * </pre>
 * 
 */
@XmlType(name = "ConservationType", namespace = "http://schemas.datacontract.org/2004/07/SIAV.Archiflow.Types")
@XmlEnum
public enum ConservationType {

    @XmlEnumValue("None")
    NONE("None"),
    @XmlEnumValue("Current")
    CURRENT("Current"),
    @XmlEnumValue("Store")
    STORE("Store"),
    @XmlEnumValue("Historical")
    HISTORICAL("Historical"),
    @XmlEnumValue("Discardable")
    DISCARDABLE("Discardable");
    private final String value;

    ConservationType(String v) {
        value = v;
    }

    public String value() {
        return value;
    }

    public static ConservationType fromValue(String v) {
        for (ConservationType c: ConservationType.values()) {
            if (c.value.equals(v)) {
                return c;
            }
        }
        throw new IllegalArgumentException(v);
    }

}
