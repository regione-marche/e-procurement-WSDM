
package it.archiflow96;

import javax.xml.bind.annotation.XmlEnum;
import javax.xml.bind.annotation.XmlEnumValue;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for EntityType.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * <p>
 * <pre>
 * &lt;simpleType name="EntityType">
 *   &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
 *     &lt;enumeration value="User"/>
 *     &lt;enumeration value="GroupEntity"/>
 *     &lt;enumeration value="OfficeEntity"/>
 *     &lt;enumeration value="PrivacyEntity"/>
 *   &lt;/restriction>
 * &lt;/simpleType>
 * </pre>
 * 
 */
@XmlType(name = "EntityType", namespace = "http://schemas.datacontract.org/2004/07/SIAV.Archiflow.Entities.Types")
@XmlEnum
public enum EntityType {

    @XmlEnumValue("User")
    USER("User"),
    @XmlEnumValue("GroupEntity")
    GROUP_ENTITY("GroupEntity"),
    @XmlEnumValue("OfficeEntity")
    OFFICE_ENTITY("OfficeEntity"),
    @XmlEnumValue("PrivacyEntity")
    PRIVACY_ENTITY("PrivacyEntity");
    private final String value;

    EntityType(String v) {
        value = v;
    }

    public String value() {
        return value;
    }

    public static EntityType fromValue(String v) {
        for (EntityType c: EntityType.values()) {
            if (c.value.equals(v)) {
                return c;
            }
        }
        throw new IllegalArgumentException(v);
    }

}
