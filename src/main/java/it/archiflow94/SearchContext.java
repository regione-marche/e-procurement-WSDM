
package it.archiflow94;

import javax.xml.bind.annotation.XmlEnum;
import javax.xml.bind.annotation.XmlEnumValue;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for SearchContext.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * <p>
 * <pre>
 * &lt;simpleType name="SearchContext">
 *   &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
 *     &lt;enumeration value="ScArchive"/>
 *     &lt;enumeration value="ScSorting"/>
 *     &lt;enumeration value="ScBoth"/>
 *   &lt;/restriction>
 * &lt;/simpleType>
 * </pre>
 * 
 */
@XmlType(name = "SearchContext", namespace = "http://schemas.datacontract.org/2004/07/SIAV.Archiflow.Entities.Types")
@XmlEnum
public enum SearchContext {

    @XmlEnumValue("ScArchive")
    SC_ARCHIVE("ScArchive"),
    @XmlEnumValue("ScSorting")
    SC_SORTING("ScSorting"),
    @XmlEnumValue("ScBoth")
    SC_BOTH("ScBoth");
    private final String value;

    SearchContext(String v) {
        value = v;
    }

    public String value() {
        return value;
    }

    public static SearchContext fromValue(String v) {
        for (SearchContext c: SearchContext.values()) {
            if (c.value.equals(v)) {
                return c;
            }
        }
        throw new IllegalArgumentException(v);
    }

}
