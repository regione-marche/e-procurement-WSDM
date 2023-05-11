
package it.archiflow96.email;

import javax.xml.bind.annotation.XmlEnum;
import javax.xml.bind.annotation.XmlEnumValue;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for PECReceiptType.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * <p>
 * <pre>
 * &lt;simpleType name="PECReceiptType">
 *   &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
 *     &lt;enumeration value="ReceiptFull"/>
 *     &lt;enumeration value="ReceiptShort"/>
 *     &lt;enumeration value="ReceiptSynthetic"/>
 *   &lt;/restriction>
 * &lt;/simpleType>
 * </pre>
 * 
 */
@XmlType(name = "PECReceiptType", namespace = "http://schemas.datacontract.org/2004/07/SIAV.Archiflow.Entities.Types")
@XmlEnum
public enum PECReceiptType {

    @XmlEnumValue("ReceiptFull")
    RECEIPT_FULL("ReceiptFull"),
    @XmlEnumValue("ReceiptShort")
    RECEIPT_SHORT("ReceiptShort"),
    @XmlEnumValue("ReceiptSynthetic")
    RECEIPT_SYNTHETIC("ReceiptSynthetic");
    private final String value;

    PECReceiptType(String v) {
        value = v;
    }

    public String value() {
        return value;
    }

    public static PECReceiptType fromValue(String v) {
        for (PECReceiptType c: PECReceiptType.values()) {
            if (c.value.equals(v)) {
                return c;
            }
        }
        throw new IllegalArgumentException(v);
    }

}
