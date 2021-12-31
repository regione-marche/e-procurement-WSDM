
package it.abletech.arxivar.dati;

import javax.xml.bind.annotation.XmlEnum;
import javax.xml.bind.annotation.XmlEnumValue;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for Dm_TipiDocumento_DuplicateMode.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * <p>
 * <pre>
 * &lt;simpleType name="Dm_TipiDocumento_DuplicateMode">
 *   &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
 *     &lt;enumeration value="Allow"/>
 *     &lt;enumeration value="Deny"/>
 *     &lt;enumeration value="ParentConfiguration"/>
 *   &lt;/restriction>
 * &lt;/simpleType>
 * </pre>
 * 
 */
@XmlType(name = "Dm_TipiDocumento_DuplicateMode")
@XmlEnum
public enum DmTipiDocumentoDuplicateMode {

    @XmlEnumValue("Allow")
    ALLOW("Allow"),
    @XmlEnumValue("Deny")
    DENY("Deny"),
    @XmlEnumValue("ParentConfiguration")
    PARENT_CONFIGURATION("ParentConfiguration");
    private final String value;

    DmTipiDocumentoDuplicateMode(String v) {
        value = v;
    }

    public String value() {
        return value;
    }

    public static DmTipiDocumentoDuplicateMode fromValue(String v) {
        for (DmTipiDocumentoDuplicateMode c: DmTipiDocumentoDuplicateMode.values()) {
            if (c.value.equals(v)) {
                return c;
            }
        }
        throw new IllegalArgumentException(v);
    }

}
