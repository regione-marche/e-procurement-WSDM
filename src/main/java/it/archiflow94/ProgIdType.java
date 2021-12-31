
package it.archiflow94;

import javax.xml.bind.annotation.XmlEnum;
import javax.xml.bind.annotation.XmlEnumValue;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for ProgIdType.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * <p>
 * <pre>
 * &lt;simpleType name="ProgIdType">
 *   &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
 *     &lt;enumeration value="ProgIdArchive"/>
 *     &lt;enumeration value="ProgIdMail"/>
 *   &lt;/restriction>
 * &lt;/simpleType>
 * </pre>
 * 
 */
@XmlType(name = "ProgIdType", namespace = "http://schemas.datacontract.org/2004/07/SIAV.Archiflow.Entities.Types")
@XmlEnum
public enum ProgIdType {

    @XmlEnumValue("ProgIdArchive")
    PROG_ID_ARCHIVE("ProgIdArchive"),
    @XmlEnumValue("ProgIdMail")
    PROG_ID_MAIL("ProgIdMail");
    private final String value;

    ProgIdType(String v) {
        value = v;
    }

    public String value() {
        return value;
    }

    public static ProgIdType fromValue(String v) {
        for (ProgIdType c: ProgIdType.values()) {
            if (c.value.equals(v)) {
                return c;
            }
        }
        throw new IllegalArgumentException(v);
    }

}
