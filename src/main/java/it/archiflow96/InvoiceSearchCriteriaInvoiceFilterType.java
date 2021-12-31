
package it.archiflow96;

import javax.xml.bind.annotation.XmlEnum;
import javax.xml.bind.annotation.XmlEnumValue;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for InvoiceSearchCriteria.InvoiceFilterType.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * <p>
 * <pre>
 * &lt;simpleType name="InvoiceSearchCriteria.InvoiceFilterType">
 *   &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
 *     &lt;enumeration value="Both"/>
 *     &lt;enumeration value="Active"/>
 *     &lt;enumeration value="Passive"/>
 *   &lt;/restriction>
 * &lt;/simpleType>
 * </pre>
 * 
 */
@XmlType(name = "InvoiceSearchCriteria.InvoiceFilterType", namespace = "http://schemas.datacontract.org/2004/07/SIAV.Archiflow.Entities.Invoice.ValueObject")
@XmlEnum
public enum InvoiceSearchCriteriaInvoiceFilterType {

    @XmlEnumValue("Both")
    BOTH("Both"),
    @XmlEnumValue("Active")
    ACTIVE("Active"),
    @XmlEnumValue("Passive")
    PASSIVE("Passive");
    private final String value;

    InvoiceSearchCriteriaInvoiceFilterType(String v) {
        value = v;
    }

    public String value() {
        return value;
    }

    public static InvoiceSearchCriteriaInvoiceFilterType fromValue(String v) {
        for (InvoiceSearchCriteriaInvoiceFilterType c: InvoiceSearchCriteriaInvoiceFilterType.values()) {
            if (c.value.equals(v)) {
                return c;
            }
        }
        throw new IllegalArgumentException(v);
    }

}
