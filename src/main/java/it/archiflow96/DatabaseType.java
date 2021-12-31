
package it.archiflow96;

import javax.xml.bind.annotation.XmlEnum;
import javax.xml.bind.annotation.XmlEnumValue;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for Database_Type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * <p>
 * <pre>
 * &lt;simpleType name="Database_Type">
 *   &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
 *     &lt;enumeration value="DTNotDefined"/>
 *     &lt;enumeration value="DTVelocis"/>
 *     &lt;enumeration value="DTOracle10"/>
 *     &lt;enumeration value="DTOracle11"/>
 *   &lt;/restriction>
 * &lt;/simpleType>
 * </pre>
 * 
 */
@XmlType(name = "Database_Type", namespace = "http://schemas.datacontract.org/2004/07/SIAV.Archiflow.Entities.Types")
@XmlEnum
public enum DatabaseType {

    @XmlEnumValue("DTNotDefined")
    DT_NOT_DEFINED("DTNotDefined"),
    @XmlEnumValue("DTVelocis")
    DT_VELOCIS("DTVelocis"),
    @XmlEnumValue("DTOracle10")
    DT_ORACLE_10("DTOracle10"),
    @XmlEnumValue("DTOracle11")
    DT_ORACLE_11("DTOracle11");
    private final String value;

    DatabaseType(String v) {
        value = v;
    }

    public String value() {
        return value;
    }

    public static DatabaseType fromValue(String v) {
        for (DatabaseType c: DatabaseType.values()) {
            if (c.value.equals(v)) {
                return c;
            }
        }
        throw new IllegalArgumentException(v);
    }

}
