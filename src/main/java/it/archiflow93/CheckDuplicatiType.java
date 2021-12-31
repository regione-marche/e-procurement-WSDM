
package it.archiflow93;

import javax.xml.bind.annotation.XmlEnum;
import javax.xml.bind.annotation.XmlEnumValue;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for CheckDuplicatiType.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * <p>
 * <pre>
 * &lt;simpleType name="CheckDuplicatiType">
 *   &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
 *     &lt;enumeration value="None"/>
 *     &lt;enumeration value="CheckDuplicate"/>
 *     &lt;enumeration value="ForceIns"/>
 *   &lt;/restriction>
 * &lt;/simpleType>
 * </pre>
 * 
 */
@XmlType(name = "CheckDuplicatiType", namespace = "http://schemas.datacontract.org/2004/07/SIAV.Archiflow.Entities.Types")
@XmlEnum
public enum CheckDuplicatiType {

    @XmlEnumValue("None")
    NONE("None"),
    @XmlEnumValue("CheckDuplicate")
    CHECK_DUPLICATE("CheckDuplicate"),
    @XmlEnumValue("ForceIns")
    FORCE_INS("ForceIns");
    private final String value;

    CheckDuplicatiType(String v) {
        value = v;
    }

    public String value() {
        return value;
    }

    public static CheckDuplicatiType fromValue(String v) {
        for (CheckDuplicatiType c: CheckDuplicatiType.values()) {
            if (c.value.equals(v)) {
                return c;
            }
        }
        throw new IllegalArgumentException(v);
    }

}
