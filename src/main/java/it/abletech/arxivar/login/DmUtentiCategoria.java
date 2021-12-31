
package it.abletech.arxivar.login;

import javax.xml.bind.annotation.XmlEnum;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for Dm_Utenti_Categoria.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * <p>
 * <pre>
 * &lt;simpleType name="Dm_Utenti_Categoria">
 *   &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
 *     &lt;enumeration value="U"/>
 *     &lt;enumeration value="S"/>
 *     &lt;enumeration value="M"/>
 *     &lt;enumeration value="F"/>
 *     &lt;enumeration value="G"/>
 *     &lt;enumeration value="I"/>
 *     &lt;enumeration value="D"/>
 *   &lt;/restriction>
 * &lt;/simpleType>
 * </pre>
 * 
 */
@XmlType(name = "Dm_Utenti_Categoria")
@XmlEnum
public enum DmUtentiCategoria {

    U,
    S,
    M,
    F,
    G,
    I,
    D;

    public String value() {
        return name();
    }

    public static DmUtentiCategoria fromValue(String v) {
        return valueOf(v);
    }

}
