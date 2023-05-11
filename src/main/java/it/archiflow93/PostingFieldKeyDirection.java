
package it.archiflow93;

import javax.xml.bind.annotation.XmlEnum;
import javax.xml.bind.annotation.XmlEnumValue;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for PostingFieldKeyDirection.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * <p>
 * <pre>
 * &lt;simpleType name="PostingFieldKeyDirection">
 *   &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
 *     &lt;enumeration value="Undef"/>
 *     &lt;enumeration value="InOut"/>
 *     &lt;enumeration value="In"/>
 *     &lt;enumeration value="Out"/>
 *     &lt;enumeration value="MAX"/>
 *   &lt;/restriction>
 * &lt;/simpleType>
 * </pre>
 * 
 */
@XmlType(name = "PostingFieldKeyDirection", namespace = "http://schemas.datacontract.org/2004/07/SIAV.Archiflow.Entities.Types")
@XmlEnum
public enum PostingFieldKeyDirection {

    @XmlEnumValue("Undef")
    UNDEF("Undef"),
    @XmlEnumValue("InOut")
    IN_OUT("InOut"),
    @XmlEnumValue("In")
    IN("In"),
    @XmlEnumValue("Out")
    OUT("Out"),
    MAX("MAX");
    private final String value;

    PostingFieldKeyDirection(String v) {
        value = v;
    }

    public String value() {
        return value;
    }

    public static PostingFieldKeyDirection fromValue(String v) {
        for (PostingFieldKeyDirection c: PostingFieldKeyDirection.values()) {
            if (c.value.equals(v)) {
                return c;
            }
        }
        throw new IllegalArgumentException(v);
    }

}
