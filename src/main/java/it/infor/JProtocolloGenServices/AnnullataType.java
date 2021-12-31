
package it.infor.JProtocolloGenServices;

import javax.xml.bind.annotation.XmlEnum;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for annullataType.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * <p>
 * <pre>
 * &lt;simpleType name="annullataType">
 *   &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
 *     &lt;enumeration value="N"/>
 *     &lt;enumeration value="S"/>
 *   &lt;/restriction>
 * &lt;/simpleType>
 * </pre>
 * 
 */
@XmlType(name = "annullataType")
@XmlEnum
public enum AnnullataType {

    N,
    S;

    public String value() {
        return name();
    }

    public static AnnullataType fromValue(String v) {
        return valueOf(v);
    }

}
