
package it.archiflow96;

import javax.xml.bind.annotation.XmlEnum;
import javax.xml.bind.annotation.XmlEnumValue;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for ChannelContext.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * <p>
 * <pre>
 * &lt;simpleType name="ChannelContext">
 *   &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
 *     &lt;enumeration value="Both"/>
 *     &lt;enumeration value="Main"/>
 *     &lt;enumeration value="Secondary"/>
 *   &lt;/restriction>
 * &lt;/simpleType>
 * </pre>
 * 
 */
@XmlType(name = "ChannelContext", namespace = "http://schemas.datacontract.org/2004/07/SIAV.Archiflow.Entities.Invoice.ValueObject")
@XmlEnum
public enum ChannelContext {

    @XmlEnumValue("Both")
    BOTH("Both"),
    @XmlEnumValue("Main")
    MAIN("Main"),
    @XmlEnumValue("Secondary")
    SECONDARY("Secondary");
    private final String value;

    ChannelContext(String v) {
        value = v;
    }

    public String value() {
        return value;
    }

    public static ChannelContext fromValue(String v) {
        for (ChannelContext c: ChannelContext.values()) {
            if (c.value.equals(v)) {
                return c;
            }
        }
        throw new IllegalArgumentException(v);
    }

}
