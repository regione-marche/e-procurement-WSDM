
package it.infor.JProtocolloGenServices;

import javax.xml.bind.annotation.XmlEnum;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for operazioneTabelleType.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * <p>
 * <pre>
 * &lt;simpleType name="operazioneTabelleType">
 *   &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
 *     &lt;enumeration value="SEARCH"/>
 *   &lt;/restriction>
 * &lt;/simpleType>
 * </pre>
 * 
 */
@XmlType(name = "operazioneTabelleType")
@XmlEnum
public enum OperazioneTabelleType {

    SEARCH;

    public String value() {
        return name();
    }

    public static OperazioneTabelleType fromValue(String v) {
        return valueOf(v);
    }

}
