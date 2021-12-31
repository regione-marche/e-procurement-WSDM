
package it.abletech.arxivar.dati;

import javax.xml.bind.annotation.XmlEnum;
import javax.xml.bind.annotation.XmlEnumValue;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for Dm_TipiDocumento_RuMode.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * <p>
 * <pre>
 * &lt;simpleType name="Dm_TipiDocumento_RuMode">
 *   &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
 *     &lt;enumeration value="UseNewValues"/>
 *     &lt;enumeration value="KeepOldValuesIfEmpty"/>
 *   &lt;/restriction>
 * &lt;/simpleType>
 * </pre>
 * 
 */
@XmlType(name = "Dm_TipiDocumento_RuMode")
@XmlEnum
public enum DmTipiDocumentoRuMode {

    @XmlEnumValue("UseNewValues")
    USE_NEW_VALUES("UseNewValues"),
    @XmlEnumValue("KeepOldValuesIfEmpty")
    KEEP_OLD_VALUES_IF_EMPTY("KeepOldValuesIfEmpty");
    private final String value;

    DmTipiDocumentoRuMode(String v) {
        value = v;
    }

    public String value() {
        return value;
    }

    public static DmTipiDocumentoRuMode fromValue(String v) {
        for (DmTipiDocumentoRuMode c: DmTipiDocumentoRuMode.values()) {
            if (c.value.equals(v)) {
                return c;
            }
        }
        throw new IllegalArgumentException(v);
    }

}
