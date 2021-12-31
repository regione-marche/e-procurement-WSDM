
package it.abletech.arxivar.dati;

import javax.xml.bind.annotation.XmlEnum;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for Dm_Profile_Importante.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * <p>
 * <pre>
 * &lt;simpleType name="Dm_Profile_Importante">
 *   &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
 *     &lt;enumeration value="SI"/>
 *     &lt;enumeration value="NO"/>
 *   &lt;/restriction>
 * &lt;/simpleType>
 * </pre>
 * 
 */
@XmlType(name = "Dm_Profile_Importante")
@XmlEnum
public enum DmProfileImportante {

    SI,
    NO;

    public String value() {
        return name();
    }

    public static DmProfileImportante fromValue(String v) {
        return valueOf(v);
    }

}
