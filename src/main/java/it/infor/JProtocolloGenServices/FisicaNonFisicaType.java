
package it.infor.JProtocolloGenServices;

import javax.xml.bind.annotation.XmlEnum;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for fisicaNonFisicaType.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * <p>
 * <pre>
 * &lt;simpleType name="fisicaNonFisicaType">
 *   &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
 *     &lt;enumeration value="F"/>
 *     &lt;enumeration value="N"/>
 *     &lt;enumeration value="I"/>
 *   &lt;/restriction>
 * &lt;/simpleType>
 * </pre>
 * 
 */
@XmlType(name = "fisicaNonFisicaType")
@XmlEnum
public enum FisicaNonFisicaType {

    F,
    N,
    I;

    public String value() {
        return name();
    }

    public static FisicaNonFisicaType fromValue(String v) {
        return valueOf(v);
    }

}
