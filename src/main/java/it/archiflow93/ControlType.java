
package it.archiflow93;

import javax.xml.bind.annotation.XmlEnum;
import javax.xml.bind.annotation.XmlEnumValue;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for ControlType.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * <p>
 * <pre>
 * &lt;simpleType name="ControlType">
 *   &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
 *     &lt;enumeration value="CtEdit"/>
 *     &lt;enumeration value="CtListedit"/>
 *     &lt;enumeration value="CtList"/>
 *     &lt;enumeration value="CtEditMultiline"/>
 *     &lt;enumeration value="CtEditSign"/>
 *     &lt;enumeration value="CtListEditMultiline"/>
 *     &lt;enumeration value="CtExternalDynamicList"/>
 *     &lt;enumeration value="svCtListMultiline"/>
 *   &lt;/restriction>
 * &lt;/simpleType>
 * </pre>
 * 
 */
@XmlType(name = "ControlType", namespace = "http://schemas.datacontract.org/2004/07/SIAV.Archiflow.Entities.Types")
@XmlEnum
public enum ControlType {

    @XmlEnumValue("CtEdit")
    CT_EDIT("CtEdit"),
    @XmlEnumValue("CtListedit")
    CT_LISTEDIT("CtListedit"),
    @XmlEnumValue("CtList")
    CT_LIST("CtList"),
    @XmlEnumValue("CtEditMultiline")
    CT_EDIT_MULTILINE("CtEditMultiline"),
    @XmlEnumValue("CtEditSign")
    CT_EDIT_SIGN("CtEditSign"),
    @XmlEnumValue("CtListEditMultiline")
    CT_LIST_EDIT_MULTILINE("CtListEditMultiline"),
    @XmlEnumValue("CtExternalDynamicList")
    CT_EXTERNAL_DYNAMIC_LIST("CtExternalDynamicList"),
    @XmlEnumValue("svCtListMultiline")
    SV_CT_LIST_MULTILINE("svCtListMultiline");
    private final String value;

    ControlType(String v) {
        value = v;
    }

    public String value() {
        return value;
    }

    public static ControlType fromValue(String v) {
        for (ControlType c: ControlType.values()) {
            if (c.value.equals(v)) {
                return c;
            }
        }
        throw new IllegalArgumentException(v);
    }

}
