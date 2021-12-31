
package it.archiflow93;

import javax.xml.bind.annotation.XmlEnum;
import javax.xml.bind.annotation.XmlEnumValue;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for ModelTypeFilter.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * <p>
 * <pre>
 * &lt;simpleType name="ModelTypeFilter">
 *   &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
 *     &lt;enumeration value="MTFNone"/>
 *     &lt;enumeration value="svMTFUser"/>
 *     &lt;enumeration value="svMTFShared"/>
 *     &lt;enumeration value="svMTFBoth"/>
 *   &lt;/restriction>
 * &lt;/simpleType>
 * </pre>
 * 
 */
@XmlType(name = "ModelTypeFilter", namespace = "http://schemas.datacontract.org/2004/07/SIAV.Archiflow.Entities.Types")
@XmlEnum
public enum ModelTypeFilter {

    @XmlEnumValue("MTFNone")
    MTF_NONE("MTFNone"),
    @XmlEnumValue("svMTFUser")
    SV_MTF_USER("svMTFUser"),
    @XmlEnumValue("svMTFShared")
    SV_MTF_SHARED("svMTFShared"),
    @XmlEnumValue("svMTFBoth")
    SV_MTF_BOTH("svMTFBoth");
    private final String value;

    ModelTypeFilter(String v) {
        value = v;
    }

    public String value() {
        return value;
    }

    public static ModelTypeFilter fromValue(String v) {
        for (ModelTypeFilter c: ModelTypeFilter.values()) {
            if (c.value.equals(v)) {
                return c;
            }
        }
        throw new IllegalArgumentException(v);
    }

}
