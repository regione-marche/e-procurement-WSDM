
package it.archiflow96.classification;

import javax.xml.bind.annotation.XmlEnum;
import javax.xml.bind.annotation.XmlEnumValue;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for ReadEntityType.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * <p>
 * <pre>
 * &lt;simpleType name="ReadEntityType">
 *   &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
 *     &lt;enumeration value="NotDeleted"/>
 *     &lt;enumeration value="Deleted"/>
 *     &lt;enumeration value="DelAndNotDel"/>
 *     &lt;enumeration value="Old"/>
 *     &lt;enumeration value="All"/>
 *     &lt;enumeration value="OpenNotDeleted"/>
 *     &lt;enumeration value="ClosedNotDeleted"/>
 *   &lt;/restriction>
 * &lt;/simpleType>
 * </pre>
 * 
 */
@XmlType(name = "ReadEntityType", namespace = "http://schemas.datacontract.org/2004/07/SIAV.Archiflow.Types")
@XmlEnum
public enum ReadEntityType {

    @XmlEnumValue("NotDeleted")
    NOT_DELETED("NotDeleted"),
    @XmlEnumValue("Deleted")
    DELETED("Deleted"),
    @XmlEnumValue("DelAndNotDel")
    DEL_AND_NOT_DEL("DelAndNotDel"),
    @XmlEnumValue("Old")
    OLD("Old"),
    @XmlEnumValue("All")
    ALL("All"),
    @XmlEnumValue("OpenNotDeleted")
    OPEN_NOT_DELETED("OpenNotDeleted"),
    @XmlEnumValue("ClosedNotDeleted")
    CLOSED_NOT_DELETED("ClosedNotDeleted");
    private final String value;

    ReadEntityType(String v) {
        value = v;
    }

    public String value() {
        return value;
    }

    public static ReadEntityType fromValue(String v) {
        for (ReadEntityType c: ReadEntityType.values()) {
            if (c.value.equals(v)) {
                return c;
            }
        }
        throw new IllegalArgumentException(v);
    }

}
