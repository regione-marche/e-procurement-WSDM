
package org.datacontract.schemas._2004._07.regionemarche_protocollo2_common;

import javax.xml.bind.annotation.XmlEnum;
import javax.xml.bind.annotation.XmlEnumValue;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for TipoStatoSpedizione.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * <p>
 * <pre>
 * &lt;simpleType name="TipoStatoSpedizione">
 *   &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
 *     &lt;enumeration value="NonSpedito"/>
 *     &lt;enumeration value="Spedito"/>
 *     &lt;enumeration value="Accettato"/>
 *     &lt;enumeration value="NonAccettato"/>
 *     &lt;enumeration value="PresoInCarico"/>
 *     &lt;enumeration value="Consegnato"/>
 *     &lt;enumeration value="NonConsegnato"/>
 *   &lt;/restriction>
 * &lt;/simpleType>
 * </pre>
 * 
 */
@XmlType(name = "TipoStatoSpedizione", namespace = "http://schemas.datacontract.org/2004/07/RegioneMarche.Protocollo.Common.TipiInterop")
@XmlEnum
public enum TipoStatoSpedizione {

    @XmlEnumValue("NonSpedito")
    NON_SPEDITO("NonSpedito"),
    @XmlEnumValue("Spedito")
    SPEDITO("Spedito"),
    @XmlEnumValue("Accettato")
    ACCETTATO("Accettato"),
    @XmlEnumValue("NonAccettato")
    NON_ACCETTATO("NonAccettato"),
    @XmlEnumValue("PresoInCarico")
    PRESO_IN_CARICO("PresoInCarico"),
    @XmlEnumValue("Consegnato")
    CONSEGNATO("Consegnato"),
    @XmlEnumValue("NonConsegnato")
    NON_CONSEGNATO("NonConsegnato");
    private final String value;

    TipoStatoSpedizione(String v) {
        value = v;
    }

    public String value() {
        return value;
    }

    public static TipoStatoSpedizione fromValue(String v) {
        for (TipoStatoSpedizione c: TipoStatoSpedizione.values()) {
            if (c.value.equals(v)) {
                return c;
            }
        }
        throw new IllegalArgumentException(v);
    }

}
