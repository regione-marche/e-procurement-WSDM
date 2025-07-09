
package it.marche.regione.paleo2;

import javax.xml.bind.annotation.XmlEnum;
import javax.xml.bind.annotation.XmlEnumValue;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for TipologiaFascicolo.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * <p>
 * <pre>
 * &lt;simpleType name="TipologiaFascicolo">
 *   &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
 *     &lt;enumeration value="affare"/>
 *     &lt;enumeration value="attivita"/>
 *     &lt;enumeration value="personafisica"/>
 *     &lt;enumeration value="personagiuridica"/>
 *     &lt;enumeration value="procedimentoamministrativo"/>
 *   &lt;/restriction>
 * &lt;/simpleType>
 * </pre>
 * 
 */
@XmlType(name = "TipologiaFascicolo")
@XmlEnum
public enum TipologiaFascicolo {

    @XmlEnumValue("affare")
    AFFARE("affare"),
    @XmlEnumValue("attivita")
    ATTIVITA("attivita"),
    @XmlEnumValue("personafisica")
    PERSONAFISICA("personafisica"),
    @XmlEnumValue("personagiuridica")
    PERSONAGIURIDICA("personagiuridica"),
    @XmlEnumValue("procedimentoamministrativo")
    PROCEDIMENTOAMMINISTRATIVO("procedimentoamministrativo");
    private final String value;

    TipologiaFascicolo(String v) {
        value = v;
    }

    public String value() {
        return value;
    }

    public static TipologiaFascicolo fromValue(String v) {
        for (TipologiaFascicolo c: TipologiaFascicolo.values()) {
            if (c.value.equals(v)) {
                return c;
            }
        }
        throw new IllegalArgumentException(v);
    }

}
