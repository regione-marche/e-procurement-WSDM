
package it.abletech.arxivar.dati;

import javax.xml.bind.annotation.XmlEnum;
import javax.xml.bind.annotation.XmlEnumValue;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for Dm_Profile_IsAos.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * <p>
 * <pre>
 * &lt;simpleType name="Dm_Profile_IsAos">
 *   &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
 *     &lt;enumeration value="Nessuno"/>
 *     &lt;enumeration value="Non_Unici"/>
 *     &lt;enumeration value="Unici"/>
 *     &lt;enumeration value="Conservato"/>
 *     &lt;enumeration value="In_Volume"/>
 *     &lt;enumeration value="OutSourcer"/>
 *   &lt;/restriction>
 * &lt;/simpleType>
 * </pre>
 * 
 */
@XmlType(name = "Dm_Profile_IsAos")
@XmlEnum
public enum DmProfileIsAos {

    @XmlEnumValue("Nessuno")
    NESSUNO("Nessuno"),
    @XmlEnumValue("Non_Unici")
    NON_UNICI("Non_Unici"),
    @XmlEnumValue("Unici")
    UNICI("Unici"),
    @XmlEnumValue("Conservato")
    CONSERVATO("Conservato"),
    @XmlEnumValue("In_Volume")
    IN_VOLUME("In_Volume"),
    @XmlEnumValue("OutSourcer")
    OUT_SOURCER("OutSourcer");
    private final String value;

    DmProfileIsAos(String v) {
        value = v;
    }

    public String value() {
        return value;
    }

    public static DmProfileIsAos fromValue(String v) {
        for (DmProfileIsAos c: DmProfileIsAos.values()) {
            if (c.value.equals(v)) {
                return c;
            }
        }
        throw new IllegalArgumentException(v);
    }

}
