
package it.archiflow96.classification;

import javax.xml.bind.annotation.XmlEnum;
import javax.xml.bind.annotation.XmlEnumValue;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for FieldTypeDefinition.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * <p>
 * <pre>
 * &lt;simpleType name="FieldTypeDefinition">
 *   &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
 *     &lt;enumeration value="TypeNone"/>
 *     &lt;enumeration value="TypeRadio"/>
 *     &lt;enumeration value="TypeCheck"/>
 *     &lt;enumeration value="TypeAlphanumeric"/>
 *     &lt;enumeration value="TypeDate"/>
 *     &lt;enumeration value="TypeNumeric"/>
 *     &lt;enumeration value="TypeCombo"/>
 *   &lt;/restriction>
 * &lt;/simpleType>
 * </pre>
 * 
 */
@XmlType(name = "FieldTypeDefinition", namespace = "http://schemas.datacontract.org/2004/07/SIAV.Archiflow.Types")
@XmlEnum
public enum FieldTypeDefinition {

    @XmlEnumValue("TypeNone")
    TYPE_NONE("TypeNone"),
    @XmlEnumValue("TypeRadio")
    TYPE_RADIO("TypeRadio"),
    @XmlEnumValue("TypeCheck")
    TYPE_CHECK("TypeCheck"),
    @XmlEnumValue("TypeAlphanumeric")
    TYPE_ALPHANUMERIC("TypeAlphanumeric"),
    @XmlEnumValue("TypeDate")
    TYPE_DATE("TypeDate"),
    @XmlEnumValue("TypeNumeric")
    TYPE_NUMERIC("TypeNumeric"),
    @XmlEnumValue("TypeCombo")
    TYPE_COMBO("TypeCombo");
    private final String value;

    FieldTypeDefinition(String v) {
        value = v;
    }

    public String value() {
        return value;
    }

    public static FieldTypeDefinition fromValue(String v) {
        for (FieldTypeDefinition c: FieldTypeDefinition.values()) {
            if (c.value.equals(v)) {
                return c;
            }
        }
        throw new IllegalArgumentException(v);
    }

}
