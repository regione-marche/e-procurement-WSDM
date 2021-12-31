
package it.archiflow94;

import javax.xml.bind.annotation.XmlEnum;
import javax.xml.bind.annotation.XmlEnumValue;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for PostingFieldType.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * <p>
 * <pre>
 * &lt;simpleType name="PostingFieldType">
 *   &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
 *     &lt;enumeration value="Undef"/>
 *     &lt;enumeration value="eMailBody"/>
 *     &lt;enumeration value="eMailSubject"/>
 *     &lt;enumeration value="eMailRecipients"/>
 *     &lt;enumeration value="ccRecipients"/>
 *     &lt;enumeration value="sender"/>
 *     &lt;enumeration value="attachments"/>
 *     &lt;enumeration value="status"/>
 *     &lt;enumeration value="messages"/>
 *     &lt;enumeration value="MAX"/>
 *   &lt;/restriction>
 * &lt;/simpleType>
 * </pre>
 * 
 */
@XmlType(name = "PostingFieldType", namespace = "http://schemas.datacontract.org/2004/07/SIAV.Archiflow.Entities.Types")
@XmlEnum
public enum PostingFieldType {

    @XmlEnumValue("Undef")
    UNDEF("Undef"),
    @XmlEnumValue("eMailBody")
    E_MAIL_BODY("eMailBody"),
    @XmlEnumValue("eMailSubject")
    E_MAIL_SUBJECT("eMailSubject"),
    @XmlEnumValue("eMailRecipients")
    E_MAIL_RECIPIENTS("eMailRecipients"),
    @XmlEnumValue("ccRecipients")
    CC_RECIPIENTS("ccRecipients"),
    @XmlEnumValue("sender")
    SENDER("sender"),
    @XmlEnumValue("attachments")
    ATTACHMENTS("attachments"),
    @XmlEnumValue("status")
    STATUS("status"),
    @XmlEnumValue("messages")
    MESSAGES("messages"),
    MAX("MAX");
    private final String value;

    PostingFieldType(String v) {
        value = v;
    }

    public String value() {
        return value;
    }

    public static PostingFieldType fromValue(String v) {
        for (PostingFieldType c: PostingFieldType.values()) {
            if (c.value.equals(v)) {
                return c;
            }
        }
        throw new IllegalArgumentException(v);
    }

}
