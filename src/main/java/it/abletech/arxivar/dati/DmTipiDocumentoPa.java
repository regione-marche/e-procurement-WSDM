
package it.abletech.arxivar.dati;

import javax.xml.bind.annotation.XmlEnum;
import javax.xml.bind.annotation.XmlEnumValue;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for Dm_TipiDocumento_Pa.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * <p>
 * <pre>
 * &lt;simpleType name="Dm_TipiDocumento_Pa">
 *   &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
 *     &lt;enumeration value="Never"/>
 *     &lt;enumeration value="Always"/>
 *     &lt;enumeration value="Optionally"/>
 *   &lt;/restriction>
 * &lt;/simpleType>
 * </pre>
 * 
 */
@XmlType(name = "Dm_TipiDocumento_Pa")
@XmlEnum
public enum DmTipiDocumentoPa {

    @XmlEnumValue("Never")
    NEVER("Never"),
    @XmlEnumValue("Always")
    ALWAYS("Always"),
    @XmlEnumValue("Optionally")
    OPTIONALLY("Optionally");
    private final String value;

    DmTipiDocumentoPa(String v) {
        value = v;
    }

    public String value() {
        return value;
    }

    public static DmTipiDocumentoPa fromValue(String v) {
        for (DmTipiDocumentoPa c: DmTipiDocumentoPa.values()) {
            if (c.value.equals(v)) {
                return c;
            }
        }
        throw new IllegalArgumentException(v);
    }

}
