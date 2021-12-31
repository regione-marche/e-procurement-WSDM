
package it.archiflow96.classification;

import javax.xml.bind.annotation.XmlEnum;
import javax.xml.bind.annotation.XmlEnumValue;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for NumerationType.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * <p>
 * <pre>
 * &lt;simpleType name="NumerationType">
 *   &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
 *     &lt;enumeration value="None"/>
 *     &lt;enumeration value="Classification"/>
 *     &lt;enumeration value="Legislature"/>
 *     &lt;enumeration value="Annual"/>
 *     &lt;enumeration value="Classification_Legislature"/>
 *     &lt;enumeration value="Classification_Annual"/>
 *     &lt;enumeration value="Unique_Progressive"/>
 *     &lt;enumeration value="Free"/>
 *     &lt;enumeration value="Type"/>
 *     &lt;enumeration value="Type_Legislature"/>
 *     &lt;enumeration value="Type_Annual"/>
 *     &lt;enumeration value="Type_Classification"/>
 *     &lt;enumeration value="Type_Classification_Legislature"/>
 *     &lt;enumeration value="Type_Classification_Annual"/>
 *   &lt;/restriction>
 * &lt;/simpleType>
 * </pre>
 * 
 */
@XmlType(name = "NumerationType", namespace = "http://schemas.datacontract.org/2004/07/SIAV.Archiflow.Types")
@XmlEnum
public enum NumerationType {

    @XmlEnumValue("None")
    NONE("None"),
    @XmlEnumValue("Classification")
    CLASSIFICATION("Classification"),
    @XmlEnumValue("Legislature")
    LEGISLATURE("Legislature"),
    @XmlEnumValue("Annual")
    ANNUAL("Annual"),
    @XmlEnumValue("Classification_Legislature")
    CLASSIFICATION_LEGISLATURE("Classification_Legislature"),
    @XmlEnumValue("Classification_Annual")
    CLASSIFICATION_ANNUAL("Classification_Annual"),
    @XmlEnumValue("Unique_Progressive")
    UNIQUE_PROGRESSIVE("Unique_Progressive"),
    @XmlEnumValue("Free")
    FREE("Free"),
    @XmlEnumValue("Type")
    TYPE("Type"),
    @XmlEnumValue("Type_Legislature")
    TYPE_LEGISLATURE("Type_Legislature"),
    @XmlEnumValue("Type_Annual")
    TYPE_ANNUAL("Type_Annual"),
    @XmlEnumValue("Type_Classification")
    TYPE_CLASSIFICATION("Type_Classification"),
    @XmlEnumValue("Type_Classification_Legislature")
    TYPE_CLASSIFICATION_LEGISLATURE("Type_Classification_Legislature"),
    @XmlEnumValue("Type_Classification_Annual")
    TYPE_CLASSIFICATION_ANNUAL("Type_Classification_Annual");
    private final String value;

    NumerationType(String v) {
        value = v;
    }

    public String value() {
        return value;
    }

    public static NumerationType fromValue(String v) {
        for (NumerationType c: NumerationType.values()) {
            if (c.value.equals(v)) {
                return c;
            }
        }
        throw new IllegalArgumentException(v);
    }

}
