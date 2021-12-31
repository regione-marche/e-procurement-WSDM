
package it.easydoc.ProtocolManagerService;

import javax.xml.bind.annotation.XmlEnum;
import javax.xml.bind.annotation.XmlEnumValue;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for MetadataType.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * <p>
 * <pre>
 * &lt;simpleType name="MetadataType">
 *   &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
 *     &lt;enumeration value="int"/>
 *     &lt;enumeration value="long"/>
 *     &lt;enumeration value="float"/>
 *     &lt;enumeration value="str"/>
 *     &lt;enumeration value="date"/>
 *     &lt;enumeration value="boolean"/>
 *   &lt;/restriction>
 * &lt;/simpleType>
 * </pre>
 * 
 */
@XmlType(name = "MetadataType")
@XmlEnum
public enum MetadataType {

    @XmlEnumValue("int")
    INT("int"),
    @XmlEnumValue("long")
    LONG("long"),
    @XmlEnumValue("float")
    FLOAT("float"),
    @XmlEnumValue("str")
    STR("str"),
    @XmlEnumValue("date")
    DATE("date"),
    @XmlEnumValue("boolean")
    BOOLEAN("boolean");
    private final String value;

    MetadataType(String v) {
        value = v;
    }

    public String value() {
        return value;
    }

    public static MetadataType fromValue(String v) {
        for (MetadataType c: MetadataType.values()) {
            if (c.value.equals(v)) {
                return c;
            }
        }
        throw new IllegalArgumentException(v);
    }

}
