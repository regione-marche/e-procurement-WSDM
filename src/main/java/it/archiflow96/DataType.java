
package it.archiflow96;

import javax.xml.bind.annotation.XmlEnum;
import javax.xml.bind.annotation.XmlEnumValue;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for DataType.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * <p>
 * <pre>
 * &lt;simpleType name="DataType">
 *   &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
 *     &lt;enumeration value="DtDate"/>
 *     &lt;enumeration value="DtString"/>
 *     &lt;enumeration value="DtNumeric"/>
 *     &lt;enumeration value="DtReference"/>
 *   &lt;/restriction>
 * &lt;/simpleType>
 * </pre>
 * 
 */
@XmlType(name = "DataType", namespace = "http://schemas.datacontract.org/2004/07/SIAV.Archiflow.Entities.Types")
@XmlEnum
public enum DataType {

    @XmlEnumValue("DtDate")
    DT_DATE("DtDate"),
    @XmlEnumValue("DtString")
    DT_STRING("DtString"),
    @XmlEnumValue("DtNumeric")
    DT_NUMERIC("DtNumeric"),
    @XmlEnumValue("DtReference")
    DT_REFERENCE("DtReference");
    private final String value;

    DataType(String v) {
        value = v;
    }

    public String value() {
        return value;
    }

    public static DataType fromValue(String v) {
        for (DataType c: DataType.values()) {
            if (c.value.equals(v)) {
                return c;
            }
        }
        throw new IllegalArgumentException(v);
    }

}
