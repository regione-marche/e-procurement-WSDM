
package it.archiflow96;

import javax.xml.bind.annotation.XmlEnum;
import javax.xml.bind.annotation.XmlEnumValue;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for Database_Type_Ex.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * <p>
 * <pre>
 * &lt;simpleType name="Database_Type_Ex">
 *   &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
 *     &lt;enumeration value="DTNotDefined"/>
 *     &lt;enumeration value="DTVelocis"/>
 *     &lt;enumeration value="DTOracle"/>
 *   &lt;/restriction>
 * &lt;/simpleType>
 * </pre>
 * 
 */
@XmlType(name = "Database_Type_Ex", namespace = "http://schemas.datacontract.org/2004/07/SIAV.Archiflow.Entities.Types")
@XmlEnum
public enum DatabaseTypeEx {

    @XmlEnumValue("DTNotDefined")
    DT_NOT_DEFINED("DTNotDefined"),
    @XmlEnumValue("DTVelocis")
    DT_VELOCIS("DTVelocis"),
    @XmlEnumValue("DTOracle")
    DT_ORACLE("DTOracle");
    private final String value;

    DatabaseTypeEx(String v) {
        value = v;
    }

    public String value() {
        return value;
    }

    public static DatabaseTypeEx fromValue(String v) {
        for (DatabaseTypeEx c: DatabaseTypeEx.values()) {
            if (c.value.equals(v)) {
                return c;
            }
        }
        throw new IllegalArgumentException(v);
    }

}
