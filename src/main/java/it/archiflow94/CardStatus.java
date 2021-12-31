
package it.archiflow94;

import javax.xml.bind.annotation.XmlEnum;
import javax.xml.bind.annotation.XmlEnumValue;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for CardStatus.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * <p>
 * <pre>
 * &lt;simpleType name="CardStatus">
 *   &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
 *     &lt;enumeration value="NonDefinito"/>
 *     &lt;enumeration value="Standard"/>
 *     &lt;enumeration value="Annullato"/>
 *     &lt;enumeration value="Cancellato"/>
 *     &lt;enumeration value="PreAnnullato"/>
 *     &lt;enumeration value="OkPreAnnullato"/>
 *     &lt;enumeration value="NoPreAnnullato"/>
 *     &lt;enumeration value="PreAnnullatoConfirm"/>
 *     &lt;enumeration value="InSicurezza"/>
 *   &lt;/restriction>
 * &lt;/simpleType>
 * </pre>
 * 
 */
@XmlType(name = "CardStatus", namespace = "http://schemas.datacontract.org/2004/07/SIAV.Archiflow.Entities.Types")
@XmlEnum
public enum CardStatus {

    @XmlEnumValue("NonDefinito")
    NON_DEFINITO("NonDefinito"),
    @XmlEnumValue("Standard")
    STANDARD("Standard"),
    @XmlEnumValue("Annullato")
    ANNULLATO("Annullato"),
    @XmlEnumValue("Cancellato")
    CANCELLATO("Cancellato"),
    @XmlEnumValue("PreAnnullato")
    PRE_ANNULLATO("PreAnnullato"),
    @XmlEnumValue("OkPreAnnullato")
    OK_PRE_ANNULLATO("OkPreAnnullato"),
    @XmlEnumValue("NoPreAnnullato")
    NO_PRE_ANNULLATO("NoPreAnnullato"),
    @XmlEnumValue("PreAnnullatoConfirm")
    PRE_ANNULLATO_CONFIRM("PreAnnullatoConfirm"),
    @XmlEnumValue("InSicurezza")
    IN_SICUREZZA("InSicurezza");
    private final String value;

    CardStatus(String v) {
        value = v;
    }

    public String value() {
        return value;
    }

    public static CardStatus fromValue(String v) {
        for (CardStatus c: CardStatus.values()) {
            if (c.value.equals(v)) {
                return c;
            }
        }
        throw new IllegalArgumentException(v);
    }

}
