
package it.abletech.arxivar.login;

import javax.xml.bind.annotation.XmlEnum;
import javax.xml.bind.annotation.XmlEnumValue;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for Tipo_Licenza.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * <p>
 * <pre>
 * &lt;simpleType name="Tipo_Licenza">
 *   &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
 *     &lt;enumeration value="Standard"/>
 *     &lt;enumeration value="Lite"/>
 *     &lt;enumeration value="Comunicazioni"/>
 *     &lt;enumeration value="Portal"/>
 *   &lt;/restriction>
 * &lt;/simpleType>
 * </pre>
 * 
 */
@XmlType(name = "Tipo_Licenza")
@XmlEnum
public enum TipoLicenza {

    @XmlEnumValue("Standard")
    STANDARD("Standard"),
    @XmlEnumValue("Lite")
    LITE("Lite"),
    @XmlEnumValue("Comunicazioni")
    COMUNICAZIONI("Comunicazioni"),
    @XmlEnumValue("Portal")
    PORTAL("Portal");
    private final String value;

    TipoLicenza(String v) {
        value = v;
    }

    public String value() {
        return value;
    }

    public static TipoLicenza fromValue(String v) {
        for (TipoLicenza c: TipoLicenza.values()) {
            if (c.value.equals(v)) {
                return c;
            }
        }
        throw new IllegalArgumentException(v);
    }

}
