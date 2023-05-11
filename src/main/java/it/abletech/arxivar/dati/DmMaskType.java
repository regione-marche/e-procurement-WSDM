
package it.abletech.arxivar.dati;

import javax.xml.bind.annotation.XmlEnum;
import javax.xml.bind.annotation.XmlEnumValue;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for Dm_Mask_Type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * <p>
 * <pre>
 * &lt;simpleType name="Dm_Mask_Type">
 *   &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
 *     &lt;enumeration value="Nothing"/>
 *     &lt;enumeration value="Barcode"/>
 *     &lt;enumeration value="Archiviazione"/>
 *   &lt;/restriction>
 * &lt;/simpleType>
 * </pre>
 * 
 */
@XmlType(name = "Dm_Mask_Type")
@XmlEnum
public enum DmMaskType {

    @XmlEnumValue("Nothing")
    NOTHING("Nothing"),
    @XmlEnumValue("Barcode")
    BARCODE("Barcode"),
    @XmlEnumValue("Archiviazione")
    ARCHIVIAZIONE("Archiviazione");
    private final String value;

    DmMaskType(String v) {
        value = v;
    }

    public String value() {
        return value;
    }

    public static DmMaskType fromValue(String v) {
        for (DmMaskType c: DmMaskType.values()) {
            if (c.value.equals(v)) {
                return c;
            }
        }
        throw new IllegalArgumentException(v);
    }

}
