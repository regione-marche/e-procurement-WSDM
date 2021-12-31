
package it.abletech.arxivar.dati;

import javax.xml.bind.annotation.XmlEnum;
import javax.xml.bind.annotation.XmlEnumValue;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for DbType.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * <p>
 * <pre>
 * &lt;simpleType name="DbType">
 *   &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
 *     &lt;enumeration value="SqlServer"/>
 *     &lt;enumeration value="Mysql"/>
 *     &lt;enumeration value="Oracle"/>
 *     &lt;enumeration value="Nessuno"/>
 *   &lt;/restriction>
 * &lt;/simpleType>
 * </pre>
 * 
 */
@XmlType(name = "DbType")
@XmlEnum
public enum DbType {

    @XmlEnumValue("SqlServer")
    SQL_SERVER("SqlServer"),
    @XmlEnumValue("Mysql")
    MYSQL("Mysql"),
    @XmlEnumValue("Oracle")
    ORACLE("Oracle"),
    @XmlEnumValue("Nessuno")
    NESSUNO("Nessuno");
    private final String value;

    DbType(String v) {
        value = v;
    }

    public String value() {
        return value;
    }

    public static DbType fromValue(String v) {
        for (DbType c: DbType.values()) {
            if (c.value.equals(v)) {
                return c;
            }
        }
        throw new IllegalArgumentException(v);
    }

}
