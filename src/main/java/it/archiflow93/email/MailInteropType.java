
package it.archiflow93.email;

import javax.xml.bind.annotation.XmlEnum;
import javax.xml.bind.annotation.XmlEnumValue;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for MailInteropType.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * <p>
 * <pre>
 * &lt;simpleType name="MailInteropType">
 *   &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
 *     &lt;enumeration value="Generic"/>
 *     &lt;enumeration value="IteropSegnaturaXML"/>
 *     &lt;enumeration value="IteropConfermaXML"/>
 *     &lt;enumeration value="IteropAggiornamentoXML"/>
 *     &lt;enumeration value="IteropAnnullamentoXML"/>
 *     &lt;enumeration value="IteropEccezioneXML"/>
 *   &lt;/restriction>
 * &lt;/simpleType>
 * </pre>
 * 
 */
@XmlType(name = "MailInteropType", namespace = "http://schemas.datacontract.org/2004/07/SIAV.Archiflow.Entities.Types")
@XmlEnum
public enum MailInteropType {

    @XmlEnumValue("Generic")
    GENERIC("Generic"),
    @XmlEnumValue("IteropSegnaturaXML")
    ITEROP_SEGNATURA_XML("IteropSegnaturaXML"),
    @XmlEnumValue("IteropConfermaXML")
    ITEROP_CONFERMA_XML("IteropConfermaXML"),
    @XmlEnumValue("IteropAggiornamentoXML")
    ITEROP_AGGIORNAMENTO_XML("IteropAggiornamentoXML"),
    @XmlEnumValue("IteropAnnullamentoXML")
    ITEROP_ANNULLAMENTO_XML("IteropAnnullamentoXML"),
    @XmlEnumValue("IteropEccezioneXML")
    ITEROP_ECCEZIONE_XML("IteropEccezioneXML");
    private final String value;

    MailInteropType(String v) {
        value = v;
    }

    public String value() {
        return value;
    }

    public static MailInteropType fromValue(String v) {
        for (MailInteropType c: MailInteropType.values()) {
            if (c.value.equals(v)) {
                return c;
            }
        }
        throw new IllegalArgumentException(v);
    }

}
