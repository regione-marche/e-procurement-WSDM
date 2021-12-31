
package it.archiflow93.classification;

import javax.xml.bind.annotation.XmlEnum;
import javax.xml.bind.annotation.XmlEnumValue;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for FieldDefinition.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * <p>
 * <pre>
 * &lt;simpleType name="FieldDefinition">
 *   &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
 *     &lt;enumeration value="NotDefined"/>
 *     &lt;enumeration value="Defined"/>
 *     &lt;enumeration value="DefinedMandatory"/>
 *   &lt;/restriction>
 * &lt;/simpleType>
 * </pre>
 * 
 */
@XmlType(name = "FieldDefinition", namespace = "http://schemas.datacontract.org/2004/07/SIAV.Archiflow.Types")
@XmlEnum
public enum FieldDefinition {

    @XmlEnumValue("NotDefined")
    NOT_DEFINED("NotDefined"),
    @XmlEnumValue("Defined")
    DEFINED("Defined"),
    @XmlEnumValue("DefinedMandatory")
    DEFINED_MANDATORY("DefinedMandatory");
    private final String value;

    FieldDefinition(String v) {
        value = v;
    }

    public String value() {
        return value;
    }

    public static FieldDefinition fromValue(String v) {
        for (FieldDefinition c: FieldDefinition.values()) {
            if (c.value.equals(v)) {
                return c;
            }
        }
        throw new IllegalArgumentException(v);
    }

}
