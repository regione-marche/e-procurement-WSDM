
package it.archiflow93;

import javax.xml.bind.annotation.XmlEnum;
import javax.xml.bind.annotation.XmlEnumValue;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for IdField.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * <p>
 * <pre>
 * &lt;simpleType name="IdField">
 *   &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
 *     &lt;enumeration value="Unknown"/>
 *     &lt;enumeration value="IfReference"/>
 *     &lt;enumeration value="IfDateReg"/>
 *     &lt;enumeration value="IfProtocol"/>
 *     &lt;enumeration value="IfDateDoc"/>
 *     &lt;enumeration value="IfKey11"/>
 *     &lt;enumeration value="IfKey12"/>
 *     &lt;enumeration value="IfKey13"/>
 *     &lt;enumeration value="IfKey14"/>
 *     &lt;enumeration value="IfKey15"/>
 *     &lt;enumeration value="IfKey21"/>
 *     &lt;enumeration value="IfKey22"/>
 *     &lt;enumeration value="IfKey23"/>
 *     &lt;enumeration value="IfKey24"/>
 *     &lt;enumeration value="IfKey25"/>
 *     &lt;enumeration value="IfKey31"/>
 *     &lt;enumeration value="IfKey32"/>
 *     &lt;enumeration value="IfKey33"/>
 *     &lt;enumeration value="IfKey34"/>
 *     &lt;enumeration value="IfKey35"/>
 *     &lt;enumeration value="IfKey41"/>
 *     &lt;enumeration value="IfKey42"/>
 *     &lt;enumeration value="IfKey43"/>
 *     &lt;enumeration value="IfKey44"/>
 *     &lt;enumeration value="IfKey45"/>
 *     &lt;enumeration value="IfObj"/>
 *   &lt;/restriction>
 * &lt;/simpleType>
 * </pre>
 * 
 */
@XmlType(name = "IdField", namespace = "http://schemas.datacontract.org/2004/07/SIAV.Archiflow.Entities.Types")
@XmlEnum
public enum IdField {

    @XmlEnumValue("Unknown")
    UNKNOWN("Unknown"),
    @XmlEnumValue("IfReference")
    IF_REFERENCE("IfReference"),
    @XmlEnumValue("IfDateReg")
    IF_DATE_REG("IfDateReg"),
    @XmlEnumValue("IfProtocol")
    IF_PROTOCOL("IfProtocol"),
    @XmlEnumValue("IfDateDoc")
    IF_DATE_DOC("IfDateDoc"),
    @XmlEnumValue("IfKey11")
    IF_KEY_11("IfKey11"),
    @XmlEnumValue("IfKey12")
    IF_KEY_12("IfKey12"),
    @XmlEnumValue("IfKey13")
    IF_KEY_13("IfKey13"),
    @XmlEnumValue("IfKey14")
    IF_KEY_14("IfKey14"),
    @XmlEnumValue("IfKey15")
    IF_KEY_15("IfKey15"),
    @XmlEnumValue("IfKey21")
    IF_KEY_21("IfKey21"),
    @XmlEnumValue("IfKey22")
    IF_KEY_22("IfKey22"),
    @XmlEnumValue("IfKey23")
    IF_KEY_23("IfKey23"),
    @XmlEnumValue("IfKey24")
    IF_KEY_24("IfKey24"),
    @XmlEnumValue("IfKey25")
    IF_KEY_25("IfKey25"),
    @XmlEnumValue("IfKey31")
    IF_KEY_31("IfKey31"),
    @XmlEnumValue("IfKey32")
    IF_KEY_32("IfKey32"),
    @XmlEnumValue("IfKey33")
    IF_KEY_33("IfKey33"),
    @XmlEnumValue("IfKey34")
    IF_KEY_34("IfKey34"),
    @XmlEnumValue("IfKey35")
    IF_KEY_35("IfKey35"),
    @XmlEnumValue("IfKey41")
    IF_KEY_41("IfKey41"),
    @XmlEnumValue("IfKey42")
    IF_KEY_42("IfKey42"),
    @XmlEnumValue("IfKey43")
    IF_KEY_43("IfKey43"),
    @XmlEnumValue("IfKey44")
    IF_KEY_44("IfKey44"),
    @XmlEnumValue("IfKey45")
    IF_KEY_45("IfKey45"),
    @XmlEnumValue("IfObj")
    IF_OBJ("IfObj");
    private final String value;

    IdField(String v) {
        value = v;
    }

    public String value() {
        return value;
    }

    public static IdField fromValue(String v) {
        for (IdField c: IdField.values()) {
            if (c.value.equals(v)) {
                return c;
            }
        }
        throw new IllegalArgumentException(v);
    }

}
