
package it.archiflow96.email;

import javax.xml.bind.annotation.XmlEnum;
import javax.xml.bind.annotation.XmlEnumValue;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for NsoOrderDirection.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * <p>
 * <pre>
 * &lt;simpleType name="NsoOrderDirection">
 *   &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
 *     &lt;enumeration value="Undefined"/>
 *     &lt;enumeration value="CustomerOrder"/>
 *     &lt;enumeration value="SupplierOrder"/>
 *     &lt;enumeration value="ReceiptOrder"/>
 *   &lt;/restriction>
 * &lt;/simpleType>
 * </pre>
 * 
 */
@XmlType(name = "NsoOrderDirection", namespace = "http://schemas.datacontract.org/2004/07/SIAV.Archiflow.Entities.Nso.ValueObject")
@XmlEnum
public enum NsoOrderDirection {

    @XmlEnumValue("Undefined")
    UNDEFINED("Undefined"),
    @XmlEnumValue("CustomerOrder")
    CUSTOMER_ORDER("CustomerOrder"),
    @XmlEnumValue("SupplierOrder")
    SUPPLIER_ORDER("SupplierOrder"),
    @XmlEnumValue("ReceiptOrder")
    RECEIPT_ORDER("ReceiptOrder");
    private final String value;

    NsoOrderDirection(String v) {
        value = v;
    }

    public String value() {
        return value;
    }

    public static NsoOrderDirection fromValue(String v) {
        for (NsoOrderDirection c: NsoOrderDirection.values()) {
            if (c.value.equals(v)) {
                return c;
            }
        }
        throw new IllegalArgumentException(v);
    }

}
