
package it.archiflow96;

import javax.xml.bind.annotation.XmlEnum;
import javax.xml.bind.annotation.XmlEnumValue;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for InvoicesTotalAmountMode.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * <p>
 * <pre>
 * &lt;simpleType name="InvoicesTotalAmountMode">
 *   &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
 *     &lt;enumeration value="None"/>
 *     &lt;enumeration value="AmountAndCards"/>
 *     &lt;enumeration value="OnlyAmount"/>
 *   &lt;/restriction>
 * &lt;/simpleType>
 * </pre>
 * 
 */
@XmlType(name = "InvoicesTotalAmountMode", namespace = "http://schemas.datacontract.org/2004/07/SIAV.Archiflow.Entities.Card.ValueObject")
@XmlEnum
public enum InvoicesTotalAmountMode {

    @XmlEnumValue("None")
    NONE("None"),
    @XmlEnumValue("AmountAndCards")
    AMOUNT_AND_CARDS("AmountAndCards"),
    @XmlEnumValue("OnlyAmount")
    ONLY_AMOUNT("OnlyAmount");
    private final String value;

    InvoicesTotalAmountMode(String v) {
        value = v;
    }

    public String value() {
        return value;
    }

    public static InvoicesTotalAmountMode fromValue(String v) {
        for (InvoicesTotalAmountMode c: InvoicesTotalAmountMode.values()) {
            if (c.value.equals(v)) {
                return c;
            }
        }
        throw new IllegalArgumentException(v);
    }

}
