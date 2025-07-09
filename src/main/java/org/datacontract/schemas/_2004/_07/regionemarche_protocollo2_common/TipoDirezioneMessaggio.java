
package org.datacontract.schemas._2004._07.regionemarche_protocollo2_common;

import javax.xml.bind.annotation.XmlEnum;
import javax.xml.bind.annotation.XmlEnumValue;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for TipoDirezioneMessaggio.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * <p>
 * <pre>
 * &lt;simpleType name="TipoDirezioneMessaggio">
 *   &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
 *     &lt;enumeration value="Ingresso"/>
 *     &lt;enumeration value="Uscita"/>
 *   &lt;/restriction>
 * &lt;/simpleType>
 * </pre>
 * 
 */
@XmlType(name = "TipoDirezioneMessaggio", namespace = "http://schemas.datacontract.org/2004/07/RegioneMarche.Protocollo.Common.TipiInterop")
@XmlEnum
public enum TipoDirezioneMessaggio {

    @XmlEnumValue("Ingresso")
    INGRESSO("Ingresso"),
    @XmlEnumValue("Uscita")
    USCITA("Uscita");
    private final String value;

    TipoDirezioneMessaggio(String v) {
        value = v;
    }

    public String value() {
        return value;
    }

    public static TipoDirezioneMessaggio fromValue(String v) {
        for (TipoDirezioneMessaggio c: TipoDirezioneMessaggio.values()) {
            if (c.value.equals(v)) {
                return c;
            }
        }
        throw new IllegalArgumentException(v);
    }

}
