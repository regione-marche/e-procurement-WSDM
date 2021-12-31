
package it.archiflow93.classification;

import javax.xml.bind.annotation.XmlEnum;
import javax.xml.bind.annotation.XmlEnumValue;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for EntityDataType.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * <p>
 * <pre>
 * &lt;simpleType name="EntityDataType">
 *   &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
 *     &lt;enumeration value="None"/>
 *     &lt;enumeration value="Personal"/>
 *     &lt;enumeration value="Confidential"/>
 *     &lt;enumeration value="Sensitive"/>
 *   &lt;/restriction>
 * &lt;/simpleType>
 * </pre>
 * 
 */
@XmlType(name = "EntityDataType", namespace = "http://schemas.datacontract.org/2004/07/SIAV.Archiflow.Types")
@XmlEnum
public enum EntityDataType {

    @XmlEnumValue("None")
    NONE("None"),
    @XmlEnumValue("Personal")
    PERSONAL("Personal"),
    @XmlEnumValue("Confidential")
    CONFIDENTIAL("Confidential"),
    @XmlEnumValue("Sensitive")
    SENSITIVE("Sensitive");
    private final String value;

    EntityDataType(String v) {
        value = v;
    }

    public String value() {
        return value;
    }

    public static EntityDataType fromValue(String v) {
        for (EntityDataType c: EntityDataType.values()) {
            if (c.value.equals(v)) {
                return c;
            }
        }
        throw new IllegalArgumentException(v);
    }

}
