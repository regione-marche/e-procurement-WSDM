
package it.archiflow96;

import javax.xml.bind.annotation.XmlEnum;
import javax.xml.bind.annotation.XmlEnumValue;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for SendingCategory.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * <p>
 * <pre>
 * &lt;simpleType name="SendingCategory">
 *   &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
 *     &lt;enumeration value="None"/>
 *     &lt;enumeration value="Normal"/>
 *     &lt;enumeration value="Estemporaneous"/>
 *     &lt;enumeration value="ReplyEstemporaneous"/>
 *     &lt;enumeration value="Reconstructed"/>
 *     &lt;enumeration value="ForwardCard"/>
 *     &lt;enumeration value="Reply_Prt_Ext"/>
 *     &lt;enumeration value="Reply_Prt_Prt"/>
 *   &lt;/restriction>
 * &lt;/simpleType>
 * </pre>
 * 
 */
@XmlType(name = "SendingCategory", namespace = "http://schemas.datacontract.org/2004/07/SIAV.Archiflow.Entities.Types")
@XmlEnum
public enum SendingCategory {

    @XmlEnumValue("None")
    NONE("None"),
    @XmlEnumValue("Normal")
    NORMAL("Normal"),
    @XmlEnumValue("Estemporaneous")
    ESTEMPORANEOUS("Estemporaneous"),
    @XmlEnumValue("ReplyEstemporaneous")
    REPLY_ESTEMPORANEOUS("ReplyEstemporaneous"),
    @XmlEnumValue("Reconstructed")
    RECONSTRUCTED("Reconstructed"),
    @XmlEnumValue("ForwardCard")
    FORWARD_CARD("ForwardCard"),
    @XmlEnumValue("Reply_Prt_Ext")
    REPLY_PRT_EXT("Reply_Prt_Ext"),
    @XmlEnumValue("Reply_Prt_Prt")
    REPLY_PRT_PRT("Reply_Prt_Prt");
    private final String value;

    SendingCategory(String v) {
        value = v;
    }

    public String value() {
        return value;
    }

    public static SendingCategory fromValue(String v) {
        for (SendingCategory c: SendingCategory.values()) {
            if (c.value.equals(v)) {
                return c;
            }
        }
        throw new IllegalArgumentException(v);
    }

}
