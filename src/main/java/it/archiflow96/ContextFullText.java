
package it.archiflow96;

import javax.xml.bind.annotation.XmlEnum;
import javax.xml.bind.annotation.XmlEnumValue;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for ContextFullText.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * <p>
 * <pre>
 * &lt;simpleType name="ContextFullText">
 *   &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
 *     &lt;enumeration value="CfDocument"/>
 *     &lt;enumeration value="CfKeys"/>
 *     &lt;enumeration value="CfBoth"/>
 *   &lt;/restriction>
 * &lt;/simpleType>
 * </pre>
 * 
 */
@XmlType(name = "ContextFullText", namespace = "http://schemas.datacontract.org/2004/07/SIAV.Archiflow.Entities.Types")
@XmlEnum
public enum ContextFullText {

    @XmlEnumValue("CfDocument")
    CF_DOCUMENT("CfDocument"),
    @XmlEnumValue("CfKeys")
    CF_KEYS("CfKeys"),
    @XmlEnumValue("CfBoth")
    CF_BOTH("CfBoth");
    private final String value;

    ContextFullText(String v) {
        value = v;
    }

    public String value() {
        return value;
    }

    public static ContextFullText fromValue(String v) {
        for (ContextFullText c: ContextFullText.values()) {
            if (c.value.equals(v)) {
                return c;
            }
        }
        throw new IllegalArgumentException(v);
    }

}
