
package it.archiflow96.email;

import javax.xml.bind.annotation.XmlEnum;
import javax.xml.bind.annotation.XmlEnumValue;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for SaveCardAsType.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * <p>
 * <pre>
 * &lt;simpleType name="SaveCardAsType">
 *   &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
 *     &lt;enumeration value="SaveAsNone"/>
 *     &lt;enumeration value="SaveAsInvoice"/>
 *     &lt;enumeration value="SaveAsNsoOrder"/>
 *   &lt;/restriction>
 * &lt;/simpleType>
 * </pre>
 * 
 */
@XmlType(name = "SaveCardAsType", namespace = "http://schemas.datacontract.org/2004/07/SIAV.Archiflow.Entities.Types")
@XmlEnum
public enum SaveCardAsType {

    @XmlEnumValue("SaveAsNone")
    SAVE_AS_NONE("SaveAsNone"),
    @XmlEnumValue("SaveAsInvoice")
    SAVE_AS_INVOICE("SaveAsInvoice"),
    @XmlEnumValue("SaveAsNsoOrder")
    SAVE_AS_NSO_ORDER("SaveAsNsoOrder");
    private final String value;

    SaveCardAsType(String v) {
        value = v;
    }

    public String value() {
        return value;
    }

    public static SaveCardAsType fromValue(String v) {
        for (SaveCardAsType c: SaveCardAsType.values()) {
            if (c.value.equals(v)) {
                return c;
            }
        }
        throw new IllegalArgumentException(v);
    }

}
