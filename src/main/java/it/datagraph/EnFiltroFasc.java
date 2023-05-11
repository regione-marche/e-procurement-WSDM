
package it.datagraph;

import javax.xml.bind.annotation.XmlEnum;
import javax.xml.bind.annotation.XmlEnumValue;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for enFiltroFasc.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * <p>
 * <pre>
 * &lt;simpleType name="enFiltroFasc">
 *   &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
 *     &lt;enumeration value="NonDefinito"/>
 *     &lt;enumeration value="SoloFascicolati"/>
 *     &lt;enumeration value="SoloNonFascicolati"/>
 *   &lt;/restriction>
 * &lt;/simpleType>
 * </pre>
 * 
 */
@XmlType(name = "enFiltroFasc")
@XmlEnum
public enum EnFiltroFasc {

    @XmlEnumValue("NonDefinito")
    NON_DEFINITO("NonDefinito"),
    @XmlEnumValue("SoloFascicolati")
    SOLO_FASCICOLATI("SoloFascicolati"),
    @XmlEnumValue("SoloNonFascicolati")
    SOLO_NON_FASCICOLATI("SoloNonFascicolati");
    private final String value;

    EnFiltroFasc(String v) {
        value = v;
    }

    public String value() {
        return value;
    }

    public static EnFiltroFasc fromValue(String v) {
        for (EnFiltroFasc c: EnFiltroFasc.values()) {
            if (c.value.equals(v)) {
                return c;
            }
        }
        throw new IllegalArgumentException(v);
    }

}
