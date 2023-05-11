
package it.abletech.arxivar.dati;

import javax.xml.bind.annotation.XmlEnum;
import javax.xml.bind.annotation.XmlEnumValue;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for Dm_AllegatiDoc_Blocco.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * <p>
 * <pre>
 * &lt;simpleType name="Dm_AllegatiDoc_Blocco">
 *   &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
 *     &lt;enumeration value="Nessuno"/>
 *     &lt;enumeration value="Attivo"/>
 *     &lt;enumeration value="Marcato"/>
 *   &lt;/restriction>
 * &lt;/simpleType>
 * </pre>
 * 
 */
@XmlType(name = "Dm_AllegatiDoc_Blocco")
@XmlEnum
public enum DmAllegatiDocBlocco {

    @XmlEnumValue("Nessuno")
    NESSUNO("Nessuno"),
    @XmlEnumValue("Attivo")
    ATTIVO("Attivo"),
    @XmlEnumValue("Marcato")
    MARCATO("Marcato");
    private final String value;

    DmAllegatiDocBlocco(String v) {
        value = v;
    }

    public String value() {
        return value;
    }

    public static DmAllegatiDocBlocco fromValue(String v) {
        for (DmAllegatiDocBlocco c: DmAllegatiDocBlocco.values()) {
            if (c.value.equals(v)) {
                return c;
            }
        }
        throw new IllegalArgumentException(v);
    }

}
