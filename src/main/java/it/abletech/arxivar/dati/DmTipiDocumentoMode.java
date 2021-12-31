
package it.abletech.arxivar.dati;

import javax.xml.bind.annotation.XmlEnum;
import javax.xml.bind.annotation.XmlEnumValue;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for Dm_TipiDocumento_Mode.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * <p>
 * <pre>
 * &lt;simpleType name="Dm_TipiDocumento_Mode">
 *   &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
 *     &lt;enumeration value="Archivia"/>
 *     &lt;enumeration value="Ricerca"/>
 *     &lt;enumeration value="ModificaProfilo"/>
 *   &lt;/restriction>
 * &lt;/simpleType>
 * </pre>
 * 
 */
@XmlType(name = "Dm_TipiDocumento_Mode")
@XmlEnum
public enum DmTipiDocumentoMode {

    @XmlEnumValue("Archivia")
    ARCHIVIA("Archivia"),
    @XmlEnumValue("Ricerca")
    RICERCA("Ricerca"),
    @XmlEnumValue("ModificaProfilo")
    MODIFICA_PROFILO("ModificaProfilo");
    private final String value;

    DmTipiDocumentoMode(String v) {
        value = v;
    }

    public String value() {
        return value;
    }

    public static DmTipiDocumentoMode fromValue(String v) {
        for (DmTipiDocumentoMode c: DmTipiDocumentoMode.values()) {
            if (c.value.equals(v)) {
                return c;
            }
        }
        throw new IllegalArgumentException(v);
    }

}
