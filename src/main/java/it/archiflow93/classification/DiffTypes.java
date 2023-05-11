
package it.archiflow93.classification;

import javax.xml.bind.annotation.XmlEnum;
import javax.xml.bind.annotation.XmlEnumValue;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for DiffTypes.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * <p>
 * <pre>
 * &lt;simpleType name="DiffTypes">
 *   &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
 *     &lt;enumeration value="DiffTypeStandard"/>
 *     &lt;enumeration value="DiffTypeAll"/>
 *     &lt;enumeration value="DiffTypeSelection"/>
 *   &lt;/restriction>
 * &lt;/simpleType>
 * </pre>
 * 
 */
@XmlType(name = "DiffTypes", namespace = "http://schemas.datacontract.org/2004/07/SIAV.Archiflow.Types")
@XmlEnum
public enum DiffTypes {

    @XmlEnumValue("DiffTypeStandard")
    DIFF_TYPE_STANDARD("DiffTypeStandard"),
    @XmlEnumValue("DiffTypeAll")
    DIFF_TYPE_ALL("DiffTypeAll"),
    @XmlEnumValue("DiffTypeSelection")
    DIFF_TYPE_SELECTION("DiffTypeSelection");
    private final String value;

    DiffTypes(String v) {
        value = v;
    }

    public String value() {
        return value;
    }

    public static DiffTypes fromValue(String v) {
        for (DiffTypes c: DiffTypes.values()) {
            if (c.value.equals(v)) {
                return c;
            }
        }
        throw new IllegalArgumentException(v);
    }

}
