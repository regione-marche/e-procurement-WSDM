
package org.datacontract.schemas._2004._07.regionemarche_protocollo_providers_common;

import javax.xml.bind.annotation.XmlEnum;
import javax.xml.bind.annotation.XmlEnumValue;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for TipoOggettoIPA.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * <p>
 * <pre>
 * &lt;simpleType name="TipoOggettoIPA">
 *   &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
 *     &lt;enumeration value="o"/>
 *     &lt;enumeration value="aoo"/>
 *     &lt;enumeration value="ou"/>
 *   &lt;/restriction>
 * &lt;/simpleType>
 * </pre>
 * 
 */
@XmlType(name = "TipoOggettoIPA", namespace = "http://schemas.datacontract.org/2004/07/RegioneMarche.Protocollo.Providers.Common.Services")
@XmlEnum
public enum TipoOggettoIPA {

    @XmlEnumValue("o")
    O("o"),
    @XmlEnumValue("aoo")
    AOO("aoo"),
    @XmlEnumValue("ou")
    OU("ou");
    private final String value;

    TipoOggettoIPA(String v) {
        value = v;
    }

    public String value() {
        return value;
    }

    public static TipoOggettoIPA fromValue(String v) {
        for (TipoOggettoIPA c: TipoOggettoIPA.values()) {
            if (c.value.equals(v)) {
                return c;
            }
        }
        throw new IllegalArgumentException(v);
    }

}
