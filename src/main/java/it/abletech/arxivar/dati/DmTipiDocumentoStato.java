
package it.abletech.arxivar.dati;

import javax.xml.bind.annotation.XmlEnum;
import javax.xml.bind.annotation.XmlEnumValue;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for Dm_TipiDocumento_Stato.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * <p>
 * <pre>
 * &lt;simpleType name="Dm_TipiDocumento_Stato">
 *   &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
 *     &lt;enumeration value="Attivo"/>
 *     &lt;enumeration value="Sospeso"/>
 *     &lt;enumeration value="Nessuno"/>
 *   &lt;/restriction>
 * &lt;/simpleType>
 * </pre>
 * 
 */
@XmlType(name = "Dm_TipiDocumento_Stato")
@XmlEnum
public enum DmTipiDocumentoStato {

    @XmlEnumValue("Attivo")
    ATTIVO("Attivo"),
    @XmlEnumValue("Sospeso")
    SOSPESO("Sospeso"),
    @XmlEnumValue("Nessuno")
    NESSUNO("Nessuno");
    private final String value;

    DmTipiDocumentoStato(String v) {
        value = v;
    }

    public String value() {
        return value;
    }

    public static DmTipiDocumentoStato fromValue(String v) {
        for (DmTipiDocumentoStato c: DmTipiDocumentoStato.values()) {
            if (c.value.equals(v)) {
                return c;
            }
        }
        throw new IllegalArgumentException(v);
    }

}
