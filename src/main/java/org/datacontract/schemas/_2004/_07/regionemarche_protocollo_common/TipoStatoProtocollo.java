
package org.datacontract.schemas._2004._07.regionemarche_protocollo_common;

import javax.xml.bind.annotation.XmlEnum;
import javax.xml.bind.annotation.XmlEnumValue;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for TipoStatoProtocollo.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * <p>
 * <pre>
 * &lt;simpleType name="TipoStatoProtocollo">
 *   &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
 *     &lt;enumeration value="Indefinito"/>
 *     &lt;enumeration value="Predisposto"/>
 *     &lt;enumeration value="PredispostoInterop"/>
 *     &lt;enumeration value="Protocollato"/>
 *     &lt;enumeration value="Annullato"/>
 *     &lt;enumeration value="PredispostoAnnullato"/>
 *   &lt;/restriction>
 * &lt;/simpleType>
 * </pre>
 * 
 */
@XmlType(name = "TipoStatoProtocollo")
@XmlEnum
public enum TipoStatoProtocollo {

    @XmlEnumValue("Indefinito")
    INDEFINITO("Indefinito"),
    @XmlEnumValue("Predisposto")
    PREDISPOSTO("Predisposto"),
    @XmlEnumValue("PredispostoInterop")
    PREDISPOSTO_INTEROP("PredispostoInterop"),
    @XmlEnumValue("Protocollato")
    PROTOCOLLATO("Protocollato"),
    @XmlEnumValue("Annullato")
    ANNULLATO("Annullato"),
    @XmlEnumValue("PredispostoAnnullato")
    PREDISPOSTO_ANNULLATO("PredispostoAnnullato");
    private final String value;

    TipoStatoProtocollo(String v) {
        value = v;
    }

    public String value() {
        return value;
    }

    public static TipoStatoProtocollo fromValue(String v) {
        for (TipoStatoProtocollo c: TipoStatoProtocollo.values()) {
            if (c.value.equals(v)) {
                return c;
            }
        }
        throw new IllegalArgumentException(v);
    }

}
