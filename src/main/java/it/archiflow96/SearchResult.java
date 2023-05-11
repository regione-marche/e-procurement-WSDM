
package it.archiflow96;

import javax.xml.bind.annotation.XmlEnum;
import javax.xml.bind.annotation.XmlEnumValue;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for SearchResult.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * <p>
 * <pre>
 * &lt;simpleType name="SearchResult">
 *   &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
 *     &lt;enumeration value="SrOk"/>
 *     &lt;enumeration value="SrMaxFoundReached"/>
 *     &lt;enumeration value="SrMaxTimeReached"/>
 *     &lt;enumeration value="SrSearchTooLong"/>
 *   &lt;/restriction>
 * &lt;/simpleType>
 * </pre>
 * 
 */
@XmlType(name = "SearchResult", namespace = "http://schemas.datacontract.org/2004/07/SIAV.Archiflow.Entities.Types")
@XmlEnum
public enum SearchResult {

    @XmlEnumValue("SrOk")
    SR_OK("SrOk"),
    @XmlEnumValue("SrMaxFoundReached")
    SR_MAX_FOUND_REACHED("SrMaxFoundReached"),
    @XmlEnumValue("SrMaxTimeReached")
    SR_MAX_TIME_REACHED("SrMaxTimeReached"),
    @XmlEnumValue("SrSearchTooLong")
    SR_SEARCH_TOO_LONG("SrSearchTooLong");
    private final String value;

    SearchResult(String v) {
        value = v;
    }

    public String value() {
        return value;
    }

    public static SearchResult fromValue(String v) {
        for (SearchResult c: SearchResult.values()) {
            if (c.value.equals(v)) {
                return c;
            }
        }
        throw new IllegalArgumentException(v);
    }

}
