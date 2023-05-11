
package it.abletech.arxivar.dati;

import javax.xml.bind.annotation.XmlEnum;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for Dm_Barcode_TipoImpronta.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * <p>
 * <pre>
 * &lt;simpleType name="Dm_Barcode_TipoImpronta">
 *   &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
 *     &lt;enumeration value="N"/>
 *     &lt;enumeration value="A"/>
 *     &lt;enumeration value="R"/>
 *   &lt;/restriction>
 * &lt;/simpleType>
 * </pre>
 * 
 */
@XmlType(name = "Dm_Barcode_TipoImpronta")
@XmlEnum
public enum DmBarcodeTipoImpronta {

    N,
    A,
    R;

    public String value() {
        return name();
    }

    public static DmBarcodeTipoImpronta fromValue(String v) {
        return valueOf(v);
    }

}
