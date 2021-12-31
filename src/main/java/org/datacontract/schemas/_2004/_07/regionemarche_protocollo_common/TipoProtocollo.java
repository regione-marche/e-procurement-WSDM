
package org.datacontract.schemas._2004._07.regionemarche_protocollo_common;

import javax.xml.bind.annotation.XmlEnum;
import javax.xml.bind.annotation.XmlEnumValue;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for TipoProtocollo.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * <p>
 * <pre>
 * &lt;simpleType name="TipoProtocollo">
 *   &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
 *     &lt;enumeration value="Ingresso"/>
 *     &lt;enumeration value="Uscita"/>
 *   &lt;/restriction>
 * &lt;/simpleType>
 * </pre>
 * 
 */
@XmlType(name = "TipoProtocollo")
@XmlEnum
public enum TipoProtocollo {

    @XmlEnumValue("Ingresso")
    INGRESSO("Ingresso"),
    @XmlEnumValue("Uscita")
    USCITA("Uscita");
    private final String value;

    TipoProtocollo(String v) {
        value = v;
    }

    public String value() {
        return value;
    }

    public static TipoProtocollo fromValue(String v) {
        for (TipoProtocollo c: TipoProtocollo.values()) {
            if (c.value.equals(v)) {
                return c;
            }
        }
        throw new IllegalArgumentException(v);
    }

}
