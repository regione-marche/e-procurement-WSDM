
package it.archiflow96.email;

import javax.xml.bind.annotation.XmlEnum;
import javax.xml.bind.annotation.XmlEnumValue;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for EmailsOrderBy.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * <p>
 * <pre>
 * &lt;simpleType name="EmailsOrderBy">
 *   &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
 *     &lt;enumeration value="EOBEMailType"/>
 *     &lt;enumeration value="EOBSendDate"/>
 *     &lt;enumeration value="EOBReceiveDate"/>
 *     &lt;enumeration value="EOBObject"/>
 *     &lt;enumeration value="EOBSender"/>
 *   &lt;/restriction>
 * &lt;/simpleType>
 * </pre>
 * 
 */
@XmlType(name = "EmailsOrderBy", namespace = "http://schemas.datacontract.org/2004/07/SIAV.Archiflow.Entities.Types")
@XmlEnum
public enum EmailsOrderBy {

    @XmlEnumValue("EOBEMailType")
    EOBE_MAIL_TYPE("EOBEMailType"),
    @XmlEnumValue("EOBSendDate")
    EOB_SEND_DATE("EOBSendDate"),
    @XmlEnumValue("EOBReceiveDate")
    EOB_RECEIVE_DATE("EOBReceiveDate"),
    @XmlEnumValue("EOBObject")
    EOB_OBJECT("EOBObject"),
    @XmlEnumValue("EOBSender")
    EOB_SENDER("EOBSender");
    private final String value;

    EmailsOrderBy(String v) {
        value = v;
    }

    public String value() {
        return value;
    }

    public static EmailsOrderBy fromValue(String v) {
        for (EmailsOrderBy c: EmailsOrderBy.values()) {
            if (c.value.equals(v)) {
                return c;
            }
        }
        throw new IllegalArgumentException(v);
    }

}
