
package it.abletech.arxivar.dati;

import javax.xml.bind.annotation.XmlEnum;
import javax.xml.bind.annotation.XmlEnumValue;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for Dm_TipiDocumento_RequireFile.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * <p>
 * <pre>
 * &lt;simpleType name="Dm_TipiDocumento_RequireFile">
 *   &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
 *     &lt;enumeration value="Nothing"/>
 *     &lt;enumeration value="FileRequired"/>
 *     &lt;enumeration value="FileOptional"/>
 *     &lt;enumeration value="NoFile"/>
 *   &lt;/restriction>
 * &lt;/simpleType>
 * </pre>
 * 
 */
@XmlType(name = "Dm_TipiDocumento_RequireFile")
@XmlEnum
public enum DmTipiDocumentoRequireFile {

    @XmlEnumValue("Nothing")
    NOTHING("Nothing"),
    @XmlEnumValue("FileRequired")
    FILE_REQUIRED("FileRequired"),
    @XmlEnumValue("FileOptional")
    FILE_OPTIONAL("FileOptional"),
    @XmlEnumValue("NoFile")
    NO_FILE("NoFile");
    private final String value;

    DmTipiDocumentoRequireFile(String v) {
        value = v;
    }

    public String value() {
        return value;
    }

    public static DmTipiDocumentoRequireFile fromValue(String v) {
        for (DmTipiDocumentoRequireFile c: DmTipiDocumentoRequireFile.values()) {
            if (c.value.equals(v)) {
                return c;
            }
        }
        throw new IllegalArgumentException(v);
    }

}
