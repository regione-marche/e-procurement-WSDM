
package it.datagraph;

import javax.xml.bind.annotation.XmlEnum;
import javax.xml.bind.annotation.XmlEnumValue;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for enOrdinamento.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * <p>
 * <pre>
 * &lt;simpleType name="enOrdinamento">
 *   &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
 *     &lt;enumeration value="Crescente"/>
 *     &lt;enumeration value="Decrescente"/>
 *   &lt;/restriction>
 * &lt;/simpleType>
 * </pre>
 * 
 */
@XmlType(name = "enOrdinamento")
@XmlEnum
public enum EnOrdinamento {

    @XmlEnumValue("Crescente")
    CRESCENTE("Crescente"),
    @XmlEnumValue("Decrescente")
    DECRESCENTE("Decrescente");
    private final String value;

    EnOrdinamento(String v) {
        value = v;
    }

    public String value() {
        return value;
    }

    public static EnOrdinamento fromValue(String v) {
        for (EnOrdinamento c: EnOrdinamento.values()) {
            if (c.value.equals(v)) {
                return c;
            }
        }
        throw new IllegalArgumentException(v);
    }

}
