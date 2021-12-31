
package it.archiflow96;

import javax.xml.bind.annotation.XmlEnum;
import javax.xml.bind.annotation.XmlEnumValue;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for SearchOptions.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * <p>
 * <pre>
 * &lt;simpleType name="SearchOptions">
 *   &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
 *     &lt;enumeration value="svSoBoth"/>
 *     &lt;enumeration value="svSoNo"/>
 *     &lt;enumeration value="svSoYes"/>
 *   &lt;/restriction>
 * &lt;/simpleType>
 * </pre>
 * 
 */
@XmlType(name = "SearchOptions", namespace = "http://schemas.datacontract.org/2004/07/SIAV.Archiflow.Entities.Types")
@XmlEnum
public enum SearchOptions {

    @XmlEnumValue("svSoBoth")
    SV_SO_BOTH("svSoBoth"),
    @XmlEnumValue("svSoNo")
    SV_SO_NO("svSoNo"),
    @XmlEnumValue("svSoYes")
    SV_SO_YES("svSoYes");
    private final String value;

    SearchOptions(String v) {
        value = v;
    }

    public String value() {
        return value;
    }

    public static SearchOptions fromValue(String v) {
        for (SearchOptions c: SearchOptions.values()) {
            if (c.value.equals(v)) {
                return c;
            }
        }
        throw new IllegalArgumentException(v);
    }

}
