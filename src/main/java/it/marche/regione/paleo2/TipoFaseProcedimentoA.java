
package it.marche.regione.paleo2;

import javax.xml.bind.annotation.XmlEnum;
import javax.xml.bind.annotation.XmlEnumValue;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for TipoFaseProcedimentoA.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * <p>
 * <pre>
 * &lt;simpleType name="TipoFaseProcedimentoA">
 *   &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
 *     &lt;enumeration value="Preparatoria"/>
 *     &lt;enumeration value="Istruttoria"/>
 *     &lt;enumeration value="Consultiva"/>
 *     &lt;enumeration value="Decisoriaodeliberativa"/>
 *     &lt;enumeration value="Integrazionedellefficacia"/>
 *   &lt;/restriction>
 * &lt;/simpleType>
 * </pre>
 * 
 */
@XmlType(name = "TipoFaseProcedimentoA")
@XmlEnum
public enum TipoFaseProcedimentoA {

    @XmlEnumValue("Preparatoria")
    PREPARATORIA("Preparatoria"),
    @XmlEnumValue("Istruttoria")
    ISTRUTTORIA("Istruttoria"),
    @XmlEnumValue("Consultiva")
    CONSULTIVA("Consultiva"),
    @XmlEnumValue("Decisoriaodeliberativa")
    DECISORIAODELIBERATIVA("Decisoriaodeliberativa"),
    @XmlEnumValue("Integrazionedellefficacia")
    INTEGRAZIONEDELLEFFICACIA("Integrazionedellefficacia");
    private final String value;

    TipoFaseProcedimentoA(String v) {
        value = v;
    }

    public String value() {
        return value;
    }

    public static TipoFaseProcedimentoA fromValue(String v) {
        for (TipoFaseProcedimentoA c: TipoFaseProcedimentoA.values()) {
            if (c.value.equals(v)) {
                return c;
            }
        }
        throw new IllegalArgumentException(v);
    }

}
