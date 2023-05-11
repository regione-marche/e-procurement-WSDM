
package it.archiflow93.classification;

import javax.xml.bind.annotation.XmlEnum;
import javax.xml.bind.annotation.XmlEnumValue;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for SearchOpeningStatus.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * <p>
 * <pre>
 * &lt;simpleType name="SearchOpeningStatus">
 *   &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
 *     &lt;enumeration value="Both"/>
 *     &lt;enumeration value="Opened"/>
 *     &lt;enumeration value="Closed"/>
 *   &lt;/restriction>
 * &lt;/simpleType>
 * </pre>
 * 
 */
@XmlType(name = "SearchOpeningStatus", namespace = "http://schemas.datacontract.org/2004/07/SIAV.Archiflow.Types")
@XmlEnum
public enum SearchOpeningStatus {

    @XmlEnumValue("Both")
    BOTH("Both"),
    @XmlEnumValue("Opened")
    OPENED("Opened"),
    @XmlEnumValue("Closed")
    CLOSED("Closed");
    private final String value;

    SearchOpeningStatus(String v) {
        value = v;
    }

    public String value() {
        return value;
    }

    public static SearchOpeningStatus fromValue(String v) {
        for (SearchOpeningStatus c: SearchOpeningStatus.values()) {
            if (c.value.equals(v)) {
                return c;
            }
        }
        throw new IllegalArgumentException(v);
    }

}
