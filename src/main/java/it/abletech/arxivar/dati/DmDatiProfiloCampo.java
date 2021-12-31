
package it.abletech.arxivar.dati;

import javax.xml.bind.annotation.XmlEnum;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for Dm_DatiProfilo_Campo.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * <p>
 * <pre>
 * &lt;simpleType name="Dm_DatiProfilo_Campo">
 *   &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
 *     &lt;enumeration value="DE"/>
 *     &lt;enumeration value="MI"/>
 *     &lt;enumeration value="CC"/>
 *     &lt;enumeration value="OF"/>
 *   &lt;/restriction>
 * &lt;/simpleType>
 * </pre>
 * 
 */
@XmlType(name = "Dm_DatiProfilo_Campo")
@XmlEnum
public enum DmDatiProfiloCampo {

    DE,
    MI,
    CC,
    OF;

    public String value() {
        return name();
    }

    public static DmDatiProfiloCampo fromValue(String v) {
        return valueOf(v);
    }

}
