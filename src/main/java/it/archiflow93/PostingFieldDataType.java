
package it.archiflow93;

import javax.xml.bind.annotation.XmlEnum;
import javax.xml.bind.annotation.XmlEnumValue;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for PostingFieldDataType.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * <p>
 * <pre>
 * &lt;simpleType name="PostingFieldDataType">
 *   &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
 *     &lt;enumeration value="Undef"/>
 *     &lt;enumeration value="stringField"/>
 *     &lt;enumeration value="intField"/>
 *     &lt;enumeration value="dateField"/>
 *     &lt;enumeration value="boolField"/>
 *     &lt;enumeration value="listField"/>
 *     &lt;enumeration value="MAX"/>
 *   &lt;/restriction>
 * &lt;/simpleType>
 * </pre>
 * 
 */
@XmlType(name = "PostingFieldDataType", namespace = "http://schemas.datacontract.org/2004/07/SIAV.Archiflow.Entities.Types")
@XmlEnum
public enum PostingFieldDataType {

    @XmlEnumValue("Undef")
    UNDEF("Undef"),
    @XmlEnumValue("stringField")
    STRING_FIELD("stringField"),
    @XmlEnumValue("intField")
    INT_FIELD("intField"),
    @XmlEnumValue("dateField")
    DATE_FIELD("dateField"),
    @XmlEnumValue("boolField")
    BOOL_FIELD("boolField"),
    @XmlEnumValue("listField")
    LIST_FIELD("listField"),
    MAX("MAX");
    private final String value;

    PostingFieldDataType(String v) {
        value = v;
    }

    public String value() {
        return value;
    }

    public static PostingFieldDataType fromValue(String v) {
        for (PostingFieldDataType c: PostingFieldDataType.values()) {
            if (c.value.equals(v)) {
                return c;
            }
        }
        throw new IllegalArgumentException(v);
    }

}
