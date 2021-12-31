
package org.datacontract.schemas._2004._07.siav_classification_entities;

import javax.xml.bind.annotation.XmlEnum;
import javax.xml.bind.annotation.XmlEnumValue;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for FascHistoryOrder.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * <p>
 * <pre>
 * &lt;simpleType name="FascHistoryOrder">
 *   &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
 *     &lt;enumeration value="OrderByDate"/>
 *     &lt;enumeration value="OrderByOperation"/>
 *     &lt;enumeration value="OrderByAuthor"/>
 *     &lt;enumeration value="OrderByRecipient"/>
 *     &lt;enumeration value="OrderByCard"/>
 *   &lt;/restriction>
 * &lt;/simpleType>
 * </pre>
 * 
 */
@XmlType(name = "FascHistoryOrder", namespace = "http://schemas.datacontract.org/2004/07/SIAV.Classification.Entities.Types")
@XmlEnum
public enum FascHistoryOrder {

    @XmlEnumValue("OrderByDate")
    ORDER_BY_DATE("OrderByDate"),
    @XmlEnumValue("OrderByOperation")
    ORDER_BY_OPERATION("OrderByOperation"),
    @XmlEnumValue("OrderByAuthor")
    ORDER_BY_AUTHOR("OrderByAuthor"),
    @XmlEnumValue("OrderByRecipient")
    ORDER_BY_RECIPIENT("OrderByRecipient"),
    @XmlEnumValue("OrderByCard")
    ORDER_BY_CARD("OrderByCard");
    private final String value;

    FascHistoryOrder(String v) {
        value = v;
    }

    public String value() {
        return value;
    }

    public static FascHistoryOrder fromValue(String v) {
        for (FascHistoryOrder c: FascHistoryOrder.values()) {
            if (c.value.equals(v)) {
                return c;
            }
        }
        throw new IllegalArgumentException(v);
    }

}
