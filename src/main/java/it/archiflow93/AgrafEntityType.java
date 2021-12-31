
package it.archiflow93;

import javax.xml.bind.annotation.XmlEnum;
import javax.xml.bind.annotation.XmlEnumValue;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for AgrafEntityType.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * <p>
 * <pre>
 * &lt;simpleType name="AgrafEntityType">
 *   &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
 *     &lt;enumeration value="AgrafEntityTypePerson"/>
 *     &lt;enumeration value="AgrafEntityTypeGroup"/>
 *     &lt;enumeration value="AgrafEntityTypeCompany"/>
 *     &lt;enumeration value="AgrafEntityTypeSDI"/>
 *   &lt;/restriction>
 * &lt;/simpleType>
 * </pre>
 * 
 */
@XmlType(name = "AgrafEntityType", namespace = "http://schemas.datacontract.org/2004/07/SIAV.Archiflow.Entities.Types")
@XmlEnum
public enum AgrafEntityType {

    @XmlEnumValue("AgrafEntityTypePerson")
    AGRAF_ENTITY_TYPE_PERSON("AgrafEntityTypePerson"),
    @XmlEnumValue("AgrafEntityTypeGroup")
    AGRAF_ENTITY_TYPE_GROUP("AgrafEntityTypeGroup"),
    @XmlEnumValue("AgrafEntityTypeCompany")
    AGRAF_ENTITY_TYPE_COMPANY("AgrafEntityTypeCompany"),
    @XmlEnumValue("AgrafEntityTypeSDI")
    AGRAF_ENTITY_TYPE_SDI("AgrafEntityTypeSDI");
    private final String value;

    AgrafEntityType(String v) {
        value = v;
    }

    public String value() {
        return value;
    }

    public static AgrafEntityType fromValue(String v) {
        for (AgrafEntityType c: AgrafEntityType.values()) {
            if (c.value.equals(v)) {
                return c;
            }
        }
        throw new IllegalArgumentException(v);
    }

}
