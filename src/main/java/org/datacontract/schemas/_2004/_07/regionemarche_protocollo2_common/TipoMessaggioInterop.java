
package org.datacontract.schemas._2004._07.regionemarche_protocollo2_common;

import javax.xml.bind.annotation.XmlEnum;
import javax.xml.bind.annotation.XmlEnumValue;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for TipoMessaggioInterop.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * <p>
 * <pre>
 * &lt;simpleType name="TipoMessaggioInterop">
 *   &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
 *     &lt;enumeration value="Indefinito"/>
 *     &lt;enumeration value="Segnatura"/>
 *     &lt;enumeration value="ConfermaRicezione"/>
 *     &lt;enumeration value="NotificaEccezione"/>
 *     &lt;enumeration value="Aggiornamento"/>
 *     &lt;enumeration value="Annullamento"/>
 *     &lt;enumeration value="NoInterop"/>
 *   &lt;/restriction>
 * &lt;/simpleType>
 * </pre>
 * 
 */
@XmlType(name = "TipoMessaggioInterop", namespace = "http://schemas.datacontract.org/2004/07/RegioneMarche.Protocollo.Common.TipiInterop")
@XmlEnum
public enum TipoMessaggioInterop {

    @XmlEnumValue("Indefinito")
    INDEFINITO("Indefinito"),
    @XmlEnumValue("Segnatura")
    SEGNATURA("Segnatura"),
    @XmlEnumValue("ConfermaRicezione")
    CONFERMA_RICEZIONE("ConfermaRicezione"),
    @XmlEnumValue("NotificaEccezione")
    NOTIFICA_ECCEZIONE("NotificaEccezione"),
    @XmlEnumValue("Aggiornamento")
    AGGIORNAMENTO("Aggiornamento"),
    @XmlEnumValue("Annullamento")
    ANNULLAMENTO("Annullamento"),
    @XmlEnumValue("NoInterop")
    NO_INTEROP("NoInterop");
    private final String value;

    TipoMessaggioInterop(String v) {
        value = v;
    }

    public String value() {
        return value;
    }

    public static TipoMessaggioInterop fromValue(String v) {
        for (TipoMessaggioInterop c: TipoMessaggioInterop.values()) {
            if (c.value.equals(v)) {
                return c;
            }
        }
        throw new IllegalArgumentException(v);
    }

}
