
package it.archiflow93;

import javax.xml.bind.annotation.XmlEnum;
import javax.xml.bind.annotation.XmlEnumValue;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for StatoFatturaPA_IN.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * <p>
 * <pre>
 * &lt;simpleType name="StatoFatturaPA_IN">
 *   &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
 *     &lt;enumeration value="PAInNotDefined"/>
 *     &lt;enumeration value="PAInRicevuta"/>
 *     &lt;enumeration value="PAInAccettata"/>
 *     &lt;enumeration value="PAInRifiutata"/>
 *     &lt;enumeration value="PAInAccettataNotificata"/>
 *     &lt;enumeration value="PAInRifiutataNotificata"/>
 *     &lt;enumeration value="PAInDecorrenzaTermini"/>
 *     &lt;enumeration value="PAInErroreInvioAccettazione"/>
 *     &lt;enumeration value="PAInErroreInvioRifiuto"/>
 *   &lt;/restriction>
 * &lt;/simpleType>
 * </pre>
 * 
 */
@XmlType(name = "StatoFatturaPA_IN", namespace = "http://schemas.datacontract.org/2004/07/SIAV.Archiflow.Entities.Types")
@XmlEnum
public enum StatoFatturaPAIN {

    @XmlEnumValue("PAInNotDefined")
    PA_IN_NOT_DEFINED("PAInNotDefined"),
    @XmlEnumValue("PAInRicevuta")
    PA_IN_RICEVUTA("PAInRicevuta"),
    @XmlEnumValue("PAInAccettata")
    PA_IN_ACCETTATA("PAInAccettata"),
    @XmlEnumValue("PAInRifiutata")
    PA_IN_RIFIUTATA("PAInRifiutata"),
    @XmlEnumValue("PAInAccettataNotificata")
    PA_IN_ACCETTATA_NOTIFICATA("PAInAccettataNotificata"),
    @XmlEnumValue("PAInRifiutataNotificata")
    PA_IN_RIFIUTATA_NOTIFICATA("PAInRifiutataNotificata"),
    @XmlEnumValue("PAInDecorrenzaTermini")
    PA_IN_DECORRENZA_TERMINI("PAInDecorrenzaTermini"),
    @XmlEnumValue("PAInErroreInvioAccettazione")
    PA_IN_ERRORE_INVIO_ACCETTAZIONE("PAInErroreInvioAccettazione"),
    @XmlEnumValue("PAInErroreInvioRifiuto")
    PA_IN_ERRORE_INVIO_RIFIUTO("PAInErroreInvioRifiuto");
    private final String value;

    StatoFatturaPAIN(String v) {
        value = v;
    }

    public String value() {
        return value;
    }

    public static StatoFatturaPAIN fromValue(String v) {
        for (StatoFatturaPAIN c: StatoFatturaPAIN.values()) {
            if (c.value.equals(v)) {
                return c;
            }
        }
        throw new IllegalArgumentException(v);
    }

}
