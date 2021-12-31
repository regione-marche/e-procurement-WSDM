
package it.archiflow93;

import javax.xml.bind.annotation.XmlEnum;
import javax.xml.bind.annotation.XmlEnumValue;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for CardDelete.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * <p>
 * <pre>
 * &lt;simpleType name="CardDelete">
 *   &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
 *     &lt;enumeration value="System"/>
 *     &lt;enumeration value="Permanent"/>
 *     &lt;enumeration value="Logic"/>
 *   &lt;/restriction>
 * &lt;/simpleType>
 * </pre>
 * 
 */
@XmlType(name = "CardDelete", namespace = "http://schemas.datacontract.org/2004/07/SIAV.Archiflow.Entities.Types")
@XmlEnum
public enum CardDelete {

    @XmlEnumValue("System")
    SYSTEM("System"),
    @XmlEnumValue("Permanent")
    PERMANENT("Permanent"),
    @XmlEnumValue("Logic")
    LOGIC("Logic");
    private final String value;

    CardDelete(String v) {
        value = v;
    }

    public String value() {
        return value;
    }

    public static CardDelete fromValue(String v) {
        for (CardDelete c: CardDelete.values()) {
            if (c.value.equals(v)) {
                return c;
            }
        }
        throw new IllegalArgumentException(v);
    }

}
