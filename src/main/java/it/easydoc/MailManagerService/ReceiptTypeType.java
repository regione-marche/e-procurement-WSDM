
package it.easydoc.MailManagerService;

import javax.xml.bind.annotation.XmlEnum;
import javax.xml.bind.annotation.XmlEnumValue;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for ReceiptTypeType.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * <p>
 * <pre>
 * &lt;simpleType name="ReceiptTypeType">
 *   &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
 *     &lt;enumeration value="ricevuta_accettazione_pec"/>
 *     &lt;enumeration value="ricevuta_consegna_pec"/>
 *     &lt;enumeration value="ricevuta_mancata_consegna_pec"/>
 *     &lt;enumeration value="errore_mancata_consegna"/>
 *   &lt;/restriction>
 * &lt;/simpleType>
 * </pre>
 * 
 */
@XmlType(name = "ReceiptTypeType")
@XmlEnum
public enum ReceiptTypeType {

    @XmlEnumValue("ricevuta_accettazione_pec")
    RICEVUTA_ACCETTAZIONE_PEC("ricevuta_accettazione_pec"),
    @XmlEnumValue("ricevuta_consegna_pec")
    RICEVUTA_CONSEGNA_PEC("ricevuta_consegna_pec"),
    @XmlEnumValue("ricevuta_mancata_consegna_pec")
    RICEVUTA_MANCATA_CONSEGNA_PEC("ricevuta_mancata_consegna_pec"),
    @XmlEnumValue("errore_mancata_consegna")
    ERRORE_MANCATA_CONSEGNA("errore_mancata_consegna");
    private final String value;

    ReceiptTypeType(String v) {
        value = v;
    }

    public String value() {
        return value;
    }

    public static ReceiptTypeType fromValue(String v) {
        for (ReceiptTypeType c: ReceiptTypeType.values()) {
            if (c.value.equals(v)) {
                return c;
            }
        }
        throw new IllegalArgumentException(v);
    }

}
