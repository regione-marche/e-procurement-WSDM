
package it.abletech.arxivar.dati;

import javax.xml.bind.annotation.XmlEnum;
import javax.xml.bind.annotation.XmlEnumValue;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for Dm_Rubrica_Priorita.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * <p>
 * <pre>
 * &lt;simpleType name="Dm_Rubrica_Priorita">
 *   &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
 *     &lt;enumeration value="NoSend"/>
 *     &lt;enumeration value="Fax"/>
 *     &lt;enumeration value="Email"/>
 *     &lt;enumeration value="Fax_Email"/>
 *     &lt;enumeration value="Email_Fax"/>
 *     &lt;enumeration value="Fax_Plus_Mail"/>
 *     &lt;enumeration value="Print"/>
 *   &lt;/restriction>
 * &lt;/simpleType>
 * </pre>
 * 
 */
@XmlType(name = "Dm_Rubrica_Priorita")
@XmlEnum
public enum DmRubricaPriorita {

    @XmlEnumValue("NoSend")
    NO_SEND("NoSend"),
    @XmlEnumValue("Fax")
    FAX("Fax"),
    @XmlEnumValue("Email")
    EMAIL("Email"),
    @XmlEnumValue("Fax_Email")
    FAX_EMAIL("Fax_Email"),
    @XmlEnumValue("Email_Fax")
    EMAIL_FAX("Email_Fax"),
    @XmlEnumValue("Fax_Plus_Mail")
    FAX_PLUS_MAIL("Fax_Plus_Mail"),
    @XmlEnumValue("Print")
    PRINT("Print");
    private final String value;

    DmRubricaPriorita(String v) {
        value = v;
    }

    public String value() {
        return value;
    }

    public static DmRubricaPriorita fromValue(String v) {
        for (DmRubricaPriorita c: DmRubricaPriorita.values()) {
            if (c.value.equals(v)) {
                return c;
            }
        }
        throw new IllegalArgumentException(v);
    }

}
