
package it.abletech.arxivar.dati;

import javax.xml.bind.annotation.XmlEnum;
import javax.xml.bind.annotation.XmlEnumValue;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for Dm_TipiDocumento_DataDocMode.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * <p>
 * <pre>
 * &lt;simpleType name="Dm_TipiDocumento_DataDocMode">
 *   &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
 *     &lt;enumeration value="UseDateTimeNow"/>
 *     &lt;enumeration value="UseExistingValue"/>
 *     &lt;enumeration value="ParentConfiguration"/>
 *   &lt;/restriction>
 * &lt;/simpleType>
 * </pre>
 * 
 */
@XmlType(name = "Dm_TipiDocumento_DataDocMode")
@XmlEnum
public enum DmTipiDocumentoDataDocMode {

    @XmlEnumValue("UseDateTimeNow")
    USE_DATE_TIME_NOW("UseDateTimeNow"),
    @XmlEnumValue("UseExistingValue")
    USE_EXISTING_VALUE("UseExistingValue"),
    @XmlEnumValue("ParentConfiguration")
    PARENT_CONFIGURATION("ParentConfiguration");
    private final String value;

    DmTipiDocumentoDataDocMode(String v) {
        value = v;
    }

    public String value() {
        return value;
    }

    public static DmTipiDocumentoDataDocMode fromValue(String v) {
        for (DmTipiDocumentoDataDocMode c: DmTipiDocumentoDataDocMode.values()) {
            if (c.value.equals(v)) {
                return c;
            }
        }
        throw new IllegalArgumentException(v);
    }

}
