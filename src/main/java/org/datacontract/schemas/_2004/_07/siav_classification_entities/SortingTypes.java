
package org.datacontract.schemas._2004._07.siav_classification_entities;

import javax.xml.bind.annotation.XmlEnum;
import javax.xml.bind.annotation.XmlEnumValue;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for SortingTypes.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * <p>
 * <pre>
 * &lt;simpleType name="SortingTypes">
 *   &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
 *     &lt;enumeration value="NULL"/>
 *     &lt;enumeration value="Label"/>
 *     &lt;enumeration value="DataCreation"/>
 *     &lt;enumeration value="Code"/>
 *     &lt;enumeration value="Id"/>
 *   &lt;/restriction>
 * &lt;/simpleType>
 * </pre>
 * 
 */
@XmlType(name = "SortingTypes", namespace = "http://schemas.datacontract.org/2004/07/SIAV.Classification.Entities.Types")
@XmlEnum
public enum SortingTypes {

    NULL("NULL"),
    @XmlEnumValue("Label")
    LABEL("Label"),
    @XmlEnumValue("DataCreation")
    DATA_CREATION("DataCreation"),
    @XmlEnumValue("Code")
    CODE("Code"),
    @XmlEnumValue("Id")
    ID("Id");
    private final String value;

    SortingTypes(String v) {
        value = v;
    }

    public String value() {
        return value;
    }

    public static SortingTypes fromValue(String v) {
        for (SortingTypes c: SortingTypes.values()) {
            if (c.value.equals(v)) {
                return c;
            }
        }
        throw new IllegalArgumentException(v);
    }

}
