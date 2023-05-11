
package it.archiflow94;

import javax.xml.bind.annotation.XmlEnum;
import javax.xml.bind.annotation.XmlEnumValue;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for PrepareEmailFor.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * <p>
 * <pre>
 * &lt;simpleType name="PrepareEmailFor">
 *   &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
 *     &lt;enumeration value="PEFUndefined"/>
 *     &lt;enumeration value="PEFReply"/>
 *     &lt;enumeration value="PEFForward"/>
 *   &lt;/restriction>
 * &lt;/simpleType>
 * </pre>
 * 
 */
@XmlType(name = "PrepareEmailFor", namespace = "http://schemas.datacontract.org/2004/07/SIAV.Archiflow.Entities.Types")
@XmlEnum
public enum PrepareEmailFor {

    @XmlEnumValue("PEFUndefined")
    PEF_UNDEFINED("PEFUndefined"),
    @XmlEnumValue("PEFReply")
    PEF_REPLY("PEFReply"),
    @XmlEnumValue("PEFForward")
    PEF_FORWARD("PEFForward");
    private final String value;

    PrepareEmailFor(String v) {
        value = v;
    }

    public String value() {
        return value;
    }

    public static PrepareEmailFor fromValue(String v) {
        for (PrepareEmailFor c: PrepareEmailFor.values()) {
            if (c.value.equals(v)) {
                return c;
            }
        }
        throw new IllegalArgumentException(v);
    }

}
