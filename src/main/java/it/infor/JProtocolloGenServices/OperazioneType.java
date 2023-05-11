
package it.infor.JProtocolloGenServices;

import javax.xml.bind.annotation.XmlEnum;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for operazioneType.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * <p>
 * <pre>
 * &lt;simpleType name="operazioneType">
 *   &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
 *     &lt;enumeration value="INSERT"/>
 *     &lt;enumeration value="INSERTSUB"/>
 *     &lt;enumeration value="UPDATE"/>
 *     &lt;enumeration value="DELETE"/>
 *     &lt;enumeration value="SEARCH"/>
 *     &lt;enumeration value="VIEW"/>
 *   &lt;/restriction>
 * &lt;/simpleType>
 * </pre>
 * 
 */
@XmlType(name = "operazioneType")
@XmlEnum
public enum OperazioneType {

    INSERT,
    INSERTSUB,
    UPDATE,
    DELETE,
    SEARCH,
    VIEW;

    public String value() {
        return name();
    }

    public static OperazioneType fromValue(String v) {
        return valueOf(v);
    }

}
