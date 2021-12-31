
package it.archiflow96.email;

import javax.xml.bind.annotation.XmlEnum;
import javax.xml.bind.annotation.XmlEnumValue;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for Language.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * <p>
 * <pre>
 * &lt;simpleType name="Language">
 *   &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
 *     &lt;enumeration value="Unknown"/>
 *     &lt;enumeration value="Italian"/>
 *     &lt;enumeration value="English"/>
 *     &lt;enumeration value="German"/>
 *     &lt;enumeration value="French"/>
 *     &lt;enumeration value="Spanish"/>
 *     &lt;enumeration value="Portuguese"/>
 *     &lt;enumeration value="Brasilian"/>
 *     &lt;enumeration value="Romanian"/>
 *   &lt;/restriction>
 * &lt;/simpleType>
 * </pre>
 * 
 */
@XmlType(name = "Language", namespace = "http://schemas.datacontract.org/2004/07/SIAV.Archiflow.Entities.Types")
@XmlEnum
public enum Language {

    @XmlEnumValue("Unknown")
    UNKNOWN("Unknown"),
    @XmlEnumValue("Italian")
    ITALIAN("Italian"),
    @XmlEnumValue("English")
    ENGLISH("English"),
    @XmlEnumValue("German")
    GERMAN("German"),
    @XmlEnumValue("French")
    FRENCH("French"),
    @XmlEnumValue("Spanish")
    SPANISH("Spanish"),
    @XmlEnumValue("Portuguese")
    PORTUGUESE("Portuguese"),
    @XmlEnumValue("Brasilian")
    BRASILIAN("Brasilian"),
    @XmlEnumValue("Romanian")
    ROMANIAN("Romanian");
    private final String value;

    Language(String v) {
        value = v;
    }

    public String value() {
        return value;
    }

    public static Language fromValue(String v) {
        for (Language c: Language.values()) {
            if (c.value.equals(v)) {
                return c;
            }
        }
        throw new IllegalArgumentException(v);
    }

}
