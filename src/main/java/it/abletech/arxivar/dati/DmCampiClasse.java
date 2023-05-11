
package it.abletech.arxivar.dati;

import javax.xml.bind.annotation.XmlEnum;
import javax.xml.bind.annotation.XmlEnumValue;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for Dm_Campi_Classe.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * <p>
 * <pre>
 * &lt;simpleType name="Dm_Campi_Classe">
 *   &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
 *     &lt;enumeration value="Textbox"/>
 *     &lt;enumeration value="Databox"/>
 *     &lt;enumeration value="Numeric"/>
 *     &lt;enumeration value="Combobox"/>
 *     &lt;enumeration value="TableBox"/>
 *     &lt;enumeration value="Checkbox"/>
 *     &lt;enumeration value="MultiValue"/>
 *     &lt;enumeration value="ClasseBox"/>
 *   &lt;/restriction>
 * &lt;/simpleType>
 * </pre>
 * 
 */
@XmlType(name = "Dm_Campi_Classe")
@XmlEnum
public enum DmCampiClasse {

    @XmlEnumValue("Textbox")
    TEXTBOX("Textbox"),
    @XmlEnumValue("Databox")
    DATABOX("Databox"),
    @XmlEnumValue("Numeric")
    NUMERIC("Numeric"),
    @XmlEnumValue("Combobox")
    COMBOBOX("Combobox"),
    @XmlEnumValue("TableBox")
    TABLE_BOX("TableBox"),
    @XmlEnumValue("Checkbox")
    CHECKBOX("Checkbox"),
    @XmlEnumValue("MultiValue")
    MULTI_VALUE("MultiValue"),
    @XmlEnumValue("ClasseBox")
    CLASSE_BOX("ClasseBox");
    private final String value;

    DmCampiClasse(String v) {
        value = v;
    }

    public String value() {
        return value;
    }

    public static DmCampiClasse fromValue(String v) {
        for (DmCampiClasse c: DmCampiClasse.values()) {
            if (c.value.equals(v)) {
                return c;
            }
        }
        throw new IllegalArgumentException(v);
    }

}
