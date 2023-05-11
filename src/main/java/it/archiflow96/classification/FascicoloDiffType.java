
package it.archiflow96.classification;

import javax.xml.bind.annotation.XmlEnum;
import javax.xml.bind.annotation.XmlEnumValue;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for FascicoloDiffType.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * <p>
 * <pre>
 * &lt;simpleType name="FascicoloDiffType">
 *   &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
 *     &lt;enumeration value="NotDefined"/>
 *     &lt;enumeration value="Nothing"/>
 *     &lt;enumeration value="Full"/>
 *     &lt;enumeration value="Restricted_All"/>
 *     &lt;enumeration value="Restricted_Sons"/>
 *     &lt;enumeration value="Restricted_Selection"/>
 *   &lt;/restriction>
 * &lt;/simpleType>
 * </pre>
 * 
 */
@XmlType(name = "FascicoloDiffType", namespace = "http://schemas.datacontract.org/2004/07/SIAV.Archiflow.Types")
@XmlEnum
public enum FascicoloDiffType {

    @XmlEnumValue("NotDefined")
    NOT_DEFINED("NotDefined"),
    @XmlEnumValue("Nothing")
    NOTHING("Nothing"),
    @XmlEnumValue("Full")
    FULL("Full"),
    @XmlEnumValue("Restricted_All")
    RESTRICTED_ALL("Restricted_All"),
    @XmlEnumValue("Restricted_Sons")
    RESTRICTED_SONS("Restricted_Sons"),
    @XmlEnumValue("Restricted_Selection")
    RESTRICTED_SELECTION("Restricted_Selection");
    private final String value;

    FascicoloDiffType(String v) {
        value = v;
    }

    public String value() {
        return value;
    }

    public static FascicoloDiffType fromValue(String v) {
        for (FascicoloDiffType c: FascicoloDiffType.values()) {
            if (c.value.equals(v)) {
                return c;
            }
        }
        throw new IllegalArgumentException(v);
    }

}
