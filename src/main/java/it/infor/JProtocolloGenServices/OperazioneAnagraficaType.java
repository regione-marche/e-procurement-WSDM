
package it.infor.JProtocolloGenServices;

import javax.xml.bind.annotation.XmlEnum;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for operazioneAnagraficaType.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * <p>
 * <pre>
 * &lt;simpleType name="operazioneAnagraficaType">
 *   &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
 *     &lt;enumeration value="INSERT"/>
 *     &lt;enumeration value="UPDATE"/>
 *     &lt;enumeration value="DELETE"/>
 *     &lt;enumeration value="SEARCH"/>
 *   &lt;/restriction>
 * &lt;/simpleType>
 * </pre>
 * 
 */
@XmlType(name = "operazioneAnagraficaType")
@XmlEnum
public enum OperazioneAnagraficaType {

    INSERT,
    UPDATE,
    DELETE,
    SEARCH;

    public String value() {
        return name();
    }

    public static OperazioneAnagraficaType fromValue(String v) {
        return valueOf(v);
    }

}
