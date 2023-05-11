
package it.abletech.arxivar.dati;

import javax.xml.bind.annotation.XmlEnum;
import javax.xml.bind.annotation.XmlEnumValue;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for Dm_Barcode_TipoBarcode.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * <p>
 * <pre>
 * &lt;simpleType name="Dm_Barcode_TipoBarcode">
 *   &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
 *     &lt;enumeration value="Documento_importato_nascosto"/>
 *     &lt;enumeration value="Attesa_Documento"/>
 *     &lt;enumeration value="Documento_importato"/>
 *   &lt;/restriction>
 * &lt;/simpleType>
 * </pre>
 * 
 */
@XmlType(name = "Dm_Barcode_TipoBarcode")
@XmlEnum
public enum DmBarcodeTipoBarcode {

    @XmlEnumValue("Documento_importato_nascosto")
    DOCUMENTO_IMPORTATO_NASCOSTO("Documento_importato_nascosto"),
    @XmlEnumValue("Attesa_Documento")
    ATTESA_DOCUMENTO("Attesa_Documento"),
    @XmlEnumValue("Documento_importato")
    DOCUMENTO_IMPORTATO("Documento_importato");
    private final String value;

    DmBarcodeTipoBarcode(String v) {
        value = v;
    }

    public String value() {
        return value;
    }

    public static DmBarcodeTipoBarcode fromValue(String v) {
        for (DmBarcodeTipoBarcode c: DmBarcodeTipoBarcode.values()) {
            if (c.value.equals(v)) {
                return c;
            }
        }
        throw new IllegalArgumentException(v);
    }

}
