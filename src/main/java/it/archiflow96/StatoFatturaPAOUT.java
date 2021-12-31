
package it.archiflow96;

import javax.xml.bind.annotation.XmlEnum;
import javax.xml.bind.annotation.XmlEnumValue;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for StatoFatturaPA_OUT.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * <p>
 * <pre>
 * &lt;simpleType name="StatoFatturaPA_OUT">
 *   &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
 *     &lt;enumeration value="PAOutNotDefined"/>
 *     &lt;enumeration value="PAOutPreparata"/>
 *     &lt;enumeration value="PAOutFirmata"/>
 *     &lt;enumeration value="PAOutInTrasmissione"/>
 *     &lt;enumeration value="PAOutScartata"/>
 *     &lt;enumeration value="PAOutTrasmessa"/>
 *     &lt;enumeration value="PAOutSospesa"/>
 *     &lt;enumeration value="PAOutNonRecapitata"/>
 *     &lt;enumeration value="PAOutAccettata"/>
 *     &lt;enumeration value="PAOutRifiutata"/>
 *     &lt;enumeration value="PAOutDecorrenzaTermini"/>
 *     &lt;enumeration value="PAOutInvioPEC"/>
 *     &lt;enumeration value="PAOutErroreInvioPEC"/>
 *   &lt;/restriction>
 * &lt;/simpleType>
 * </pre>
 * 
 */
@XmlType(name = "StatoFatturaPA_OUT", namespace = "http://schemas.datacontract.org/2004/07/SIAV.Archiflow.Entities.Types")
@XmlEnum
public enum StatoFatturaPAOUT {

    @XmlEnumValue("PAOutNotDefined")
    PA_OUT_NOT_DEFINED("PAOutNotDefined"),
    @XmlEnumValue("PAOutPreparata")
    PA_OUT_PREPARATA("PAOutPreparata"),
    @XmlEnumValue("PAOutFirmata")
    PA_OUT_FIRMATA("PAOutFirmata"),
    @XmlEnumValue("PAOutInTrasmissione")
    PA_OUT_IN_TRASMISSIONE("PAOutInTrasmissione"),
    @XmlEnumValue("PAOutScartata")
    PA_OUT_SCARTATA("PAOutScartata"),
    @XmlEnumValue("PAOutTrasmessa")
    PA_OUT_TRASMESSA("PAOutTrasmessa"),
    @XmlEnumValue("PAOutSospesa")
    PA_OUT_SOSPESA("PAOutSospesa"),
    @XmlEnumValue("PAOutNonRecapitata")
    PA_OUT_NON_RECAPITATA("PAOutNonRecapitata"),
    @XmlEnumValue("PAOutAccettata")
    PA_OUT_ACCETTATA("PAOutAccettata"),
    @XmlEnumValue("PAOutRifiutata")
    PA_OUT_RIFIUTATA("PAOutRifiutata"),
    @XmlEnumValue("PAOutDecorrenzaTermini")
    PA_OUT_DECORRENZA_TERMINI("PAOutDecorrenzaTermini"),
    @XmlEnumValue("PAOutInvioPEC")
    PA_OUT_INVIO_PEC("PAOutInvioPEC"),
    @XmlEnumValue("PAOutErroreInvioPEC")
    PA_OUT_ERRORE_INVIO_PEC("PAOutErroreInvioPEC");
    private final String value;

    StatoFatturaPAOUT(String v) {
        value = v;
    }

    public String value() {
        return value;
    }

    public static StatoFatturaPAOUT fromValue(String v) {
        for (StatoFatturaPAOUT c: StatoFatturaPAOUT.values()) {
            if (c.value.equals(v)) {
                return c;
            }
        }
        throw new IllegalArgumentException(v);
    }

}
