
package it.archiflow93;

import javax.xml.bind.annotation.XmlEnum;
import javax.xml.bind.annotation.XmlEnumValue;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for RegisterOperation.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * <p>
 * <pre>
 * &lt;simpleType name="RegisterOperation">
 *   &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
 *     &lt;enumeration value="RoSearchOr"/>
 *     &lt;enumeration value="RoSearchAnd"/>
 *   &lt;/restriction>
 * &lt;/simpleType>
 * </pre>
 * 
 */
@XmlType(name = "RegisterOperation", namespace = "http://schemas.datacontract.org/2004/07/SIAV.Archiflow.Entities.Types")
@XmlEnum
public enum RegisterOperation {

    @XmlEnumValue("RoSearchOr")
    RO_SEARCH_OR("RoSearchOr"),
    @XmlEnumValue("RoSearchAnd")
    RO_SEARCH_AND("RoSearchAnd");
    private final String value;

    RegisterOperation(String v) {
        value = v;
    }

    public String value() {
        return value;
    }

    public static RegisterOperation fromValue(String v) {
        for (RegisterOperation c: RegisterOperation.values()) {
            if (c.value.equals(v)) {
                return c;
            }
        }
        throw new IllegalArgumentException(v);
    }

}
