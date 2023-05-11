
package it.abletech.arxivar.dati;

import javax.xml.bind.annotation.XmlEnum;
import javax.xml.bind.annotation.XmlEnumValue;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for Aggiuntivo_TextArea_TextFormat.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * <p>
 * <pre>
 * &lt;simpleType name="Aggiuntivo_TextArea_TextFormat">
 *   &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
 *     &lt;enumeration value="Normal"/>
 *     &lt;enumeration value="UpperCase"/>
 *     &lt;enumeration value="LowerCase"/>
 *   &lt;/restriction>
 * &lt;/simpleType>
 * </pre>
 * 
 */
@XmlType(name = "Aggiuntivo_TextArea_TextFormat")
@XmlEnum
public enum AggiuntivoTextAreaTextFormat {

    @XmlEnumValue("Normal")
    NORMAL("Normal"),
    @XmlEnumValue("UpperCase")
    UPPER_CASE("UpperCase"),
    @XmlEnumValue("LowerCase")
    LOWER_CASE("LowerCase");
    private final String value;

    AggiuntivoTextAreaTextFormat(String v) {
        value = v;
    }

    public String value() {
        return value;
    }

    public static AggiuntivoTextAreaTextFormat fromValue(String v) {
        for (AggiuntivoTextAreaTextFormat c: AggiuntivoTextAreaTextFormat.values()) {
            if (c.value.equals(v)) {
                return c;
            }
        }
        throw new IllegalArgumentException(v);
    }

}
