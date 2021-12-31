
package it.easydoc.MailManagerService;

import javax.xml.bind.annotation.XmlEnum;
import javax.xml.bind.annotation.XmlEnumValue;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for MailStateType.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * <p>
 * <pre>
 * &lt;simpleType name="MailStateType">
 *   &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
 *     &lt;enumeration value="non_inviata"/>
 *     &lt;enumeration value="inviata_con_errore"/>
 *     &lt;enumeration value="inviata_correttamente"/>
 *     &lt;enumeration value="accettata_e_non_consegnata"/>
 *     &lt;enumeration value="inviata_e_non_accettata"/>
 *     &lt;enumeration value="accettata_e_consegnata"/>
 *   &lt;/restriction>
 * &lt;/simpleType>
 * </pre>
 * 
 */
@XmlType(name = "MailStateType")
@XmlEnum
public enum MailStateType {

    @XmlEnumValue("non_inviata")
    NON_INVIATA("non_inviata"),
    @XmlEnumValue("inviata_con_errore")
    INVIATA_CON_ERRORE("inviata_con_errore"),
    @XmlEnumValue("inviata_correttamente")
    INVIATA_CORRETTAMENTE("inviata_correttamente"),
    @XmlEnumValue("accettata_e_non_consegnata")
    ACCETTATA_E_NON_CONSEGNATA("accettata_e_non_consegnata"),
    @XmlEnumValue("inviata_e_non_accettata")
    INVIATA_E_NON_ACCETTATA("inviata_e_non_accettata"),
    @XmlEnumValue("accettata_e_consegnata")
    ACCETTATA_E_CONSEGNATA("accettata_e_consegnata");
    private final String value;

    MailStateType(String v) {
        value = v;
    }

    public String value() {
        return value;
    }

    public static MailStateType fromValue(String v) {
        for (MailStateType c: MailStateType.values()) {
            if (c.value.equals(v)) {
                return c;
            }
        }
        throw new IllegalArgumentException(v);
    }

}
